package Service;

import java.util.ArrayList;
import java.util.List;

public class PromortionService {

    private List<String> promotions;

    public PromortionService() {
        promotions = new ArrayList<>();
    }

    // Create
    public void addPromotion(String promotion) {
        promotions.add(promotion);
    }

    // Read All
    public List<String> getAllPromotions() {
        return promotions;
    }

    // Read One
    public String getPromotion(String promotionName) {
        for (String promotion : promotions) {
            if (promotion.equals(promotionName)) {
                return promotion;
            }
        }
        return null;
    }

    // Update
    public boolean updatePromotion(String oldPromotion,
                                   String newPromotion) {

        for (int i = 0; i < promotions.size(); i++) {
            if (promotions.get(i).equals(oldPromotion)) {
                promotions.set(i, newPromotion);
                return true;
            }
        }
        return false;
    }

    // Delete
    public boolean removePromotion(String promotionName) {

        for (int i = 0; i < promotions.size(); i++) {
            if (promotions.get(i).equals(promotionName)) {
                promotions.remove(i);
                return true;
            }
        }
        return false;
    }
}
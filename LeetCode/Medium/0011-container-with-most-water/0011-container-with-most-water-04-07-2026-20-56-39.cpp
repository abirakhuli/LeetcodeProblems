class Solution {
public:
    int maxArea(vector<int>& height) {
        int n=height.size();
        int l=0;
        int r=n-1;
        int maxi=0;
        
        while(l<r){
            int w=(r-l);
            int h=min(height[l], height[r]);
            int res=(w*h);
            maxi=max(maxi, res);

            height[l]<height[r]? l++:r--;

        }
        return maxi;
        
    }
};
package jp.co.shoeisha.example;

public class Shipping {
	/**
	 * 荷物の総量を計算する
	 * 
	 * @param weight
	 *            荷物の重さ(kg)
	 * @param x
	 *            荷物の縦幅(cm)
	 * @param y
	 *            荷物の横幅(cm)
	 * @param z
	 *            荷物の高さ(cm)
	 * @return
	 */
	public int calculate(int weight,int x,int y,int z){
		// kg , 縦, 横, 長さ
		int size = 0; // 荷物のサイズ
		int price = 0; // 送料
		try {

			// ①重量が0kg超えで30kg以下
			if (weight > 0 && weight <= 30) {

			} else {
				throw new IllegalArgumentException();
			}

			// ②3辺の合計が180cm以上
			int max = x + y + z;
			
			if (x <= 0 || y <= 0 || x <= 0 || max >= 180) {
				throw new IllegalArgumentException();
			}

			// ③送料を算出し戻り値を返却
			if(max <= 60 && weight <= 10){
				size = 1;
			} else if (max <= 120 && weight <= 20) {

				size = 2;
			} else if (max <= 180 && weight <= 30) {

				size = 3;
			}
			
			switch (size) {

			case 1:
				price = 600;
				break;

			case 2:
				price = 1200;
				break;

			case 3:
				price = 1800;
				break;
				
			 default:
				break;
			}

		} catch (Exception er) {
			System.out.print("error");

		}

		return price; // 返り値　送料（円）
	}

}

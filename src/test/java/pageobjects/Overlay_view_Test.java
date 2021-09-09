
package pageobjects;


import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Overlay_view_Test{
	
	public Overlay_view_Test(AndroidDriver driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/iconImage")

	public List<MobileElement> footer_options;
	


	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/saveCardView")

	public MobileElement save_img_view;
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/backView")

	public MobileElement back_view;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/cancelImageView")

	public MobileElement close_overlay_view;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/applyImageView")

	public MobileElement apply_overlay;

	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/undoView")

	public MobileElement undo;
	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/glView")

	public MobileElement gl_view;

	
	@AndroidFindBy(id="com.vyroai.AutoCutCut:id/itemName")

	public List<MobileElement> overlay_options;

	

	

	

}



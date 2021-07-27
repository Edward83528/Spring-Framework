package gov.vghtpe.batch;

import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Tutorial, Tutorial>{

	@Override
	public Tutorial process(Tutorial item) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Processing..."+item);
		return item;
	}

}

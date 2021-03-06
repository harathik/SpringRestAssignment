package com.harathi.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.harathi.org.capg.CardService;

@RestController
public class CardController {
	@Autowired
	CardService card;

	@GetMapping("/card/{cardNo}")
	public String getCard(@PathVariable long cardNo) {
		return this.card.getCardType(cardNo);
	}
}

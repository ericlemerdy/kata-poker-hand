package comparator;

import model.*;

public class WinnerResult implements PokerHandComparisonResult {
	private Winner winner;

	public WinnerResult(String playerName, String reason) {
		this.winner = new
				Winner(playerName, reason);
	}

	@Override
	public boolean isTie() {
		return false;
	}

	@Override
	public Winner getWinner() {
		return this.winner;
	}
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CharacterSelection {
    static String field_f;
    static RendererOption field_d;
    private MatchState matchState;
    static String field_c;
    SoundEventPlayer field_b;
    private boolean complete;

    final void chooseCharacter(byte param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var4;
        int var7;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param0 >= -13) {
          return;
        }
        var4 = this.getCharacter(0, param2);
        if (var4 != -1) {
          return;
        }
        this.matchState.characterChoices[param2].setCharacter(param1, (byte) 37);
        if (null != this.field_b) {
          this.field_b.play(new SoundEvent(64, 0, 0, 0), -58);
        }
        if (this.matchState.allCharactersChosen(-112)) {
          this.complete = true;
          for (var5 = 0; var5 < this.matchState.players.length; var5++) {
            for (var6 = 0; var6 < this.matchState.players.length; var6++) {
              if (~var5 == ~var6) {
                this.matchState.statistics.markCharacterPlayed(var5, (byte) -52, this.matchState.characterChoices[var5].getCharacter(80));
              } else {
                this.matchState.statistics.markCharacterFaced(var5, this.matchState.characterChoices[var6].getCharacter(71), true);
              }
            }
          }
        }
    }

    final int getCharacter(int param0, int param1) {
        if (param0 != 0) {
          field_f = (String) null;
        }
        return this.matchState.characterChoices[param1].getCharacter(100);
    }

    final void unmuteSounds(int param0) {
        if (this.complete) {
          return;
        }
        if (param0 != 32221) {
          return;
        }
        if (this.field_b != null) {
          this.field_b.playQueuedEvents(84, false);
        }
    }

    CharacterSelection(MatchState param0) {
        try {
          this.matchState = param0;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "daa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_c = null;
        field_d = null;
        if (param0 != -12224) {
          field_f = (String) null;
        }
    }

    final boolean isComplete(boolean param0) {
        if (param0) {
          return false;
        }
        return this.complete;
    }

    static {
        field_c = "Email: ";
        field_f = "Use wits and quick timing to navigate each chamber of the temple. Earn points by grabbing treasure and escaping quickly.";
    }
}

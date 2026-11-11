/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class daa {
    static String field_f;
    static lqa field_d;
    private MatchState field_a;
    static String field_c;
    SoundEventPlayer field_b;
    private boolean field_e;

    final void a(byte param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var4;
        int var7;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param0 >= -13) {
          return;
        }
        var4 = this.a(0, param2);
        if (var4 != -1) {
          return;
        }
        this.field_a.characterChoices[param2].setCharacter(param1, (byte) 37);
        if (null != this.field_b) {
          this.field_b.play(new SoundEvent(64, 0, 0, 0), -58);
        }
        if (this.field_a.allCharactersChosen(-112)) {
          this.field_e = true;
          for (var5 = 0; var5 < this.field_a.players.length; var5++) {
            for (var6 = 0; var6 < this.field_a.players.length; var6++) {
              if (~var5 == ~var6) {
                this.field_a.statistics.markCharacterPlayed(var5, (byte) -52, this.field_a.characterChoices[var5].getCharacter(80));
              } else {
                this.field_a.statistics.markCharacterFaced(var5, this.field_a.characterChoices[var6].getCharacter(71), true);
              }
            }
          }
        }
    }

    final int a(int param0, int param1) {
        if (param0 != 0) {
          field_f = (String) null;
        }
        return this.field_a.characterChoices[param1].getCharacter(100);
    }

    final void a(int param0) {
        if (this.field_e) {
          return;
        }
        if (param0 != 32221) {
          return;
        }
        if (this.field_b != null) {
          this.field_b.a(84, false);
        }
    }

    daa(MatchState param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "daa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
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

    final boolean a(boolean param0) {
        if (param0) {
          return false;
        }
        return this.field_e;
    }

    static {
        field_c = "Email: ";
        field_f = "Use wits and quick timing to navigate each chamber of the temple. Earn points by grabbing treasure and escaping quickly.";
    }
}

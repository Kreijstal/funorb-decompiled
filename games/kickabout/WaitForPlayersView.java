/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WaitForPlayersView extends MatchPhaseView {
    private boolean field_l;
    static String[] field_j;
    static int[] field_k;

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var3_int = 1;
          while (param2 > 1) {
            if ((1 & param2) != 0) {
              var3_int = var3_int * param0;
            }
            param0 = param0 * param0;
            param2 = param2 >> 1;
          }
          if (param1 != -11934) {
            WaitForPlayersView.f(-39);
          }
          if (param2 != 1) {
            return var3_int;
          }
          stackIn_11_0 = var3_int * param0;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var3), "fk.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void onButtonClick(int param0, int param1) {
        if (param0 < 98) {
          this.field_l = true;
        }
    }

    final void drawContent(int param0) {
        this.drawPanelBackground(112);
        this.drawTitle(false, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, TickClock.field_e, new String[]{QuickChatMenuBuilder.field_b[this.field_a.surface][this.field_a.tier]}));
        this.drawCountdown(param0 - 2352, this.field_a.phaseTime);
        this.a(150, 17709);
        if (param0 != 1) {
          this.drawContent(-98);
          if (this.field_a.field_f) {
            ByteArrayPool.field_d.drawText("FB", 5, 17, 16777215, -1);
            return;
          }
          return;
        }
        if (!this.field_a.field_f) {
          return;
        }
        ByteArrayPool.field_d.drawText("FB", 5, 17, 16777215, -1);
    }

    public static void f(int param0) {
        field_k = null;
        if (param0 != 1) {
          WaitForPlayersView.b(76, -73, -121);
          field_j = null;
          return;
        }
        field_j = null;
    }

    final void update(int param0, boolean param1) {
        if (param0 >= -92) {
          return;
        }
        if (!param1) {
          return;
        }
        if (!this.field_l) {
          FootballerAiOverlaySupport.field_d.b(75, (byte) 74);
          FootballerAiOverlaySupport.field_d.writeByte(121, 4);
          this.field_l = true;
          return;
        }
    }

    WaitForPlayersView(CommonGame param0, int param1, boolean param2) {
        super(param0, param1, param2, (int[]) null);
        this.field_l = false;
    }

    static {
        field_j = new String[]{"Current Bid:", "Buyout", "Time Left:"};
        field_k = new int[8192];
    }
}

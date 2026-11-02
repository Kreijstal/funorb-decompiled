/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StampedeSpecial extends SpecialOrder {
    static String field_r;
    static UiComponent field_q;
    static String field_p;
    static byte[] field_s;
    static UiComponent field_t;

    final CreatureEvent createEvent(BattleState param0, int param1) {
        StampedeEvent stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        StampedeEvent var4 = null;
        int var5 = 0;
        int var6 = 0;
        BattleCreature var7 = null;
        var6 = BachelorFridge.field_y;
        try {
          if (param1 != 3) {
            field_t = (UiComponent) null;
          }
          var7 = this.creature.a(69, param0);
          var4 = new StampedeEvent(this.moveId, new CreatureRef(var7), this.field_i);
          if (2 == this.field_i) {
            for (var5 = 0; var7.tileX > var5; var5++) {
              TermsPanel.a(var7.tileY, 31546, var5, false, param0, var4);
              TermsPanel.a(var7.tileY - 1, 31546, var5, false, param0, var4);
              TermsPanel.a(var7.tileY + 1, param1 + 31543, var5, false, param0, var4);
            }
          } else if (this.field_i == 4) {
            for (var5 = 1 + var7.tileX; param0.width > var5; var5++) {
              TermsPanel.a(var7.tileY, 31546, var5, false, param0, var4);
              TermsPanel.a(-1 + var7.tileY, 31546, var5, false, param0, var4);
              TermsPanel.a(var7.tileY + 1, 31546, var5, false, param0, var4);
            }
          } else if (1 == this.field_i) {
            for (var5 = 0; var5 < var7.tileY; var5++) {
              TermsPanel.a(var5, 31546, var7.tileX, false, param0, var4);
              TermsPanel.a(var5, 31546, -1 + var7.tileX, false, param0, var4);
              TermsPanel.a(var5, 31546, var7.tileX + 1, false, param0, var4);
            }
          } else {
            if (this.field_i == 3) {
              for (var5 = 1 + var7.tileY; var5 < param0.height; var5++) {
                TermsPanel.a(var5, 31546, var7.tileX, false, param0, var4);
                TermsPanel.a(var5, 31546, var7.tileX - 1, false, param0, var4);
                TermsPanel.a(var5, 31546, 1 + var7.tileX, false, param0, var4);
              }
            }
          }
          stackIn_21_0 = var4;
          return (CreatureEvent) ((Object) stackIn_21_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("mja.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 3) {
          field_r = (String) null;
        }
        JaggrabDownloader.field_f = param1;
        gaa.field_k = param0;
        FlyAnimation.field_z = param3;
        hc.field_D = param4;
    }

    StampedeSpecial(int param0, BattleCreature param1, int param2) {
        super(param0, param1);
        try {
          this.field_i = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "mja.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_q = null;
        field_r = null;
        int var1 = 25 / ((16 - param0) / 44);
        field_t = null;
        field_s = null;
        field_p = null;
    }

    static {
        field_r = "Accept";
        field_p = "Arrow keys or right click drag to move the camera.  <br><col=BBFF00> Next</col>";
    }
}

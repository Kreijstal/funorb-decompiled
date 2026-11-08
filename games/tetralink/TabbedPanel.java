/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TabbedPanel extends UiComponent {
    static String field_Nb;
    int field_Lb;
    private UiComponent[] field_Kb;
    private UiComponent[] field_Mb;
    private UiComponent field_Ob;

    TabbedPanel(long param0, UiComponent param1, String[] param2, UiComponent param3, UiComponent[] param4, int param5) {
        super(param0, (UiComponent) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        UiComponent var9 = null;
        int var11 = 0;
        int var8_intLifetime1;
        try {
          this.field_Mb = new UiComponent[param2.length];
          this.field_Ob = new UiComponent(0L, param3);
          this.field_Kb = param4;
          for (var8_int = 0; var8_int < param2.length; var8_int++) {
            var9 = new UiComponent(0L, param1);
            var9.field_jb = param2[var8_int];
            this.field_Mb[var8_int] = var9;
            this.addChild((byte) -101, var9);
          }
          this.addChild((byte) -125, this.field_Ob);
          var11 = 0;
          var8_intLifetime1 = var11;
          while (param4.length > var11) {
            this.field_Ob.addChild((byte) 72, param4[var11]);
            var11++;
          }
          this.field_Lb = param5;
          this.field_Mb[param5].field_zb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("ad.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 43) {
          field_Nb = (String) null;
        }
        field_Nb = null;
    }

    final static void setMenuLayout(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        GameOptionControls.field_f[param2] = param6;
        GameOptionControls.field_g[param2] = param4;
        GameOptionControls.field_h[param2] = param5;
        if (param1 != 0) {
          return;
        }
        try {
          GameOptionControls.field_b[param2] = param0;
          GameOptionControls.field_j[param2] = param3;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ad.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    private final void layoutTabs(int param0, int param1, int param2) {
        UiComponent dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var7 = TetraLink.field_J;
        for (var4 = 0; this.field_Mb.length > var4; var4++) {
          var5 = var4 * this.field_Hb / this.field_Mb.length;
          var6 = (1 + var4) * this.field_Hb / this.field_Mb.length;
          this.field_Mb[var4].field_M = var5;
          this.field_Mb[var4].field_yb = 0;
          this.field_Mb[var4].field_Hb = var6 - var5;
          this.field_Mb[var4].field_R = param1;
        }
        this.field_Ob.setBounds((byte) -117, this.field_Hb, param1, this.field_R - param1, 0);
        var8 = 0;
        var4Lifetime1 = var8;
        while (var8 < this.field_Kb.length) {
          this.field_Kb[var8].setBounds((byte) -90, this.field_Ob.field_Hb - param2 * 2, param2, this.field_Ob.field_R - 2 * param2, param2);
          if (~this.field_Lb != ~var8) {
            dupTemp$0 = this.field_Kb[var8];
            dupTemp$0.field_M = dupTemp$0.field_M + 10000;
          }
          var8++;
        }
        if (param0 != -8325) {
          this.field_Mb = (UiComponent[]) null;
        }
    }

    final void processTabPresses(boolean param0) {
        UiComponent dupTemp$0 = null;
        UiComponent dupTemp$1 = null;
        int var2;
        int var3;
        var3 = TetraLink.field_J;
        var2 = 0;
        if (!param0) {
          TabbedPanel.releaseStatics((byte) 85);
        }
        while (this.field_Mb.length > var2) {
          if (this.field_Lb != var2 &&
            0 != this.field_Mb[var2].field_F) {
            this.field_Mb[this.field_Lb].field_zb = false;
            dupTemp$0 = this.field_Kb[this.field_Lb];
            dupTemp$0.field_M = dupTemp$0.field_M + 10000;
            this.field_Lb = var2;
            this.field_Mb[var2].field_zb = true;
            dupTemp$1 = this.field_Kb[var2];
            dupTemp$1.field_M = dupTemp$1.field_M - 10000;
          }
          var2++;
        }
    }

    final void setBoundsAndLayout(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 != 0) {
          this.field_Kb = (UiComponent[]) null;
        }
        this.field_M = param2;
        this.field_yb = param4;
        this.field_Hb = param5;
        this.field_R = param1;
        this.layoutTabs(param0 - 8325, param6, param3);
    }

    static {
        field_Nb = "Chat view has been scrolled up. Scroll down to chat.";
    }
}

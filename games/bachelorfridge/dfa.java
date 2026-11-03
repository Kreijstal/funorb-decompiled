/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dfa {
    static int field_b;
    static int[] field_c;
    boolean field_a;

    final static void a(int param0, int param1, int param2, int param3, byte[] param4, int param5, UiComponent param6, UiComponent param7, int param8, UiComponent param9) {
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = BachelorFridge.field_y;
        try {
          ge.field_F = -1L;
          StampedeSpecial.field_s = param4;
          kb.field_j = param5;
          ld.field_q = param4.length;
          LevitateEvent.field_r = new byte[(7 + kb.field_j) / 8];
          ce.field_y = false;
          EffectBatch.field_n = null;
          SnowAnimation.field_w = null;
          var10_int = 0;
          for (var11 = param3; StampedeSpecial.field_s.length > var11; var11++) {
            var10_int = var10_int + (255 & StampedeSpecial.field_s[var11]);
          }
          var10_int = (7 + var10_int) / 8;
          MouseWheelInput.field_c = new byte[var10_int];
          if (param9.children == null) {
            param9.children = new IntrusiveDeque();
          }
          aa.field_l = param9.children;
          aa.field_l.d(99);
          iga.field_c = new DualLinkNodeHashTable(param2);
          wk.field_a = -1;
          FullHealSpecial.field_q = -1;
          hja.field_i = 0;
          hc.field_J = 0;
          if (null == param7.children) {
            param7.children = new IntrusiveDeque();
          }
          uma.field_M = param7.children;
          uma.field_M.d(param3 + 91);
          FridgeScreen.field_g = new DualLinkNodeHashTable(param8);
          if (null == param6.children) {
            param6.children = new IntrusiveDeque();
          }
          bia.field_g = param6.children;
          bia.field_g.d(param3 + 92);
          wi.field_i = new DualLinkNodeHashTable(param1);
          wda.field_a = 0L;
          DiveBomberAnimation.field_x = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_14_0 = var10;
          stackIn_14_1 = new StringBuilder().append("dfa.VB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param7 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        int var4 = BachelorFridge.field_y;
        if (0 == hp.field_c) {
          if (hs.a(false, nga.field_i)) {
            lg.a(true, 8, param1);
            if (param0 != 8) {
              this.field_a = true;
              return;
            }
            return;
          }
          lg.a(true, 0, param1);
          if (param0 != 8) {
            this.field_a = true;
            return;
          }
          return;
        }
        hp.field_c = 0;
        TileEffect.b((byte) -88);
        if (param0 == 8) {
          return;
        }
        this.field_a = true;
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_c = null;
    }

    static {
        field_c = new int[4];
    }
}

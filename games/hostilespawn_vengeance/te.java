/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends vd implements nk, qk {
    static se field_E;
    static bd[] field_G;
    private wg field_H;
    private cj field_L;
    static ij field_M;
    static gb field_J;
    static int field_K;
    private ph field_I;
    static int[] field_F;

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.removeMouseListener((java.awt.event.MouseListener) (Object) jc.field_b);
            param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) jc.field_b);
            int var2_int = -15 / ((31 - param1) / 48);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) jc.field_b);
            mk.field_I = 0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "te.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(boolean param0) {
        ri.field_p.c(0, 0);
    }

    private final String k(int param0) {
        return "</col></u>";
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var6_int = -3 % ((param4 - -63) / 52);
            if (((te) this).field_I == param3) {
              ul.e((byte) -25);
              ((te) this).field_H.g((byte) -120);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("te.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param4 + 41);
        }
    }

    public static void j(int param0) {
        Object var2 = null;
        field_G = null;
        field_F = null;
        if (param0 != 0) {
          var2 = null;
          te.a((java.awt.Component) null, -11);
          field_M = null;
          field_J = null;
          return;
        } else {
          field_M = null;
          field_J = null;
          return;
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param2 == 98) {
                stackOut_6_0 = ((te) this).a(param1, (byte) -74);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (99 == param2) {
                  stackOut_10_0 = ((te) this).b((byte) -78, param1);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("te.F(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_11_0;
    }

    public final void a(int param0, int param1, cj param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param0 == -2) {
              break L0;
            } else {
              field_E = null;
              break L0;
            }
          }
          if (param1 == 0) {
            l.a("terms.ws", (byte) 127);
            return;
          } else {
            if (param1 == 1) {
              l.a("privacy.ws", (byte) 114);
              return;
            } else {
              if (param1 == 2) {
                l.a("conduct.ws", (byte) -123);
                return;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("te.T(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
    }

    te(wg param0) {
        super(0, 0, 288, 0, (nn) null);
        RuntimeException var2 = null;
        int var3 = 0;
        cn var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((te) this).field_H = param0;
            ((te) this).field_I = new ph(jf.field_e, (mh) null);
            ((te) this).field_I.field_h = (nn) (Object) new ke();
            var7 = vg.a(new String[2], 89, s.field_a);
            var3 = 20;
            var4 = new cn(jd.field_s, 0, 0, 0, 0, 16777215, -1, 3, 0, jd.field_s.field_y, -1, 2147483647, true);
            ((te) this).field_L = new cj(var7, (nn) (Object) var4);
            ((te) this).field_L.field_i = "";
            ((te) this).field_L.a(-1, jg.field_e, 0);
            ((te) this).field_L.a(-1, jg.field_e, 1);
            ((te) this).field_L.field_p = (mh) this;
            ((te) this).field_L.field_s = ((te) this).field_s - 40;
            ((te) this).field_L.a(true, ((te) this).field_s - 40, 26, var3);
            var3 = var3 + (15 + ((te) this).field_L.field_x);
            ((te) this).a(51448, (ag) (Object) ((te) this).field_L);
            var5 = 4;
            var6 = 200;
            ((te) this).field_I.a(var6, var3, 0, -var6 + 300 >> 1, 40);
            ((te) this).field_I.field_p = (mh) this;
            ((te) this).a(51448, (ag) (Object) ((te) this).field_I);
            ((te) this).a(300, 0, 0, 0, var3 - (-55 - var5));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("te.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final String e(byte param0) {
        if (param0 > -24) {
            String discarded$0 = this.e((byte) 48);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = null;
        field_K = 0;
        field_F = new int[4];
        field_F[2] = 100;
        field_F[1] = 200;
        field_F[0] = 200;
        field_F[3] = 2;
    }
}

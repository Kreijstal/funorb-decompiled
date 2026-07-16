/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj implements j {
    static ga field_d;
    private int field_a;
    private int field_c;
    private int field_b;
    private int field_g;
    private mg field_e;
    private int field_f;
    private int field_h;

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hh var12 = null;
        rc stackIn_3_0 = null;
        rc stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          var11 = SolKnight.field_L ? 1 : 0;
          if (param4 instanceof hh) {
            stackOut_2_0 = (rc) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (rc) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (hh) (Object) stackIn_3_0;
          if (var12 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        mi.b(param3 - -param4.field_m, param4.field_j + param1, param4.field_t, param4.field_x, ((sj) this).field_c);
        var7 = -(var12.field_I * 2) + param4.field_t;
        if (param0 < 113) {
          ((sj) this).field_e = null;
          var8 = param3 - -param4.field_m - -var12.field_I;
          var9 = param1 + param4.field_j - -var12.field_L;
          mi.e(var8, var9, var8 - -var7, var9, ((sj) this).field_g);
          var10 = var12.i(-85) - 1;
          L2: while (true) {
            if (var10 < 0) {
              L3: {
                if (((sj) this).field_e != null) {
                  ((sj) this).field_e.a(var12.field_i, var7 / 2 + var8, var9 + ((sj) this).field_e.field_x + var12.field_L, ((sj) this).field_h, ((sj) this).field_a);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              mi.e(var8 + var12.b(var10, -96) * var7 / var12.a(-3), var9, ((sj) this).field_b, ((sj) this).field_f);
              var10--;
              continue L2;
            }
          }
        } else {
          var8 = param3 - -param4.field_m - -var12.field_I;
          var9 = param1 + param4.field_j - -var12.field_L;
          mi.e(var8, var9, var8 - -var7, var9, ((sj) this).field_g);
          var10 = var12.i(-85) - 1;
          L4: while (true) {
            if (var10 < 0) {
              L5: {
                if (((sj) this).field_e != null) {
                  ((sj) this).field_e.a(var12.field_i, var7 / 2 + var8, var9 + ((sj) this).field_e.field_x + var12.field_L, ((sj) this).field_h, ((sj) this).field_a);
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            } else {
              mi.e(var8 + var12.b(var10, -96) * var7 / var12.a(-3), var9, ((sj) this).field_b, ((sj) this).field_f);
              var10--;
              continue L4;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_d = null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.removeMouseListener((java.awt.event.MouseListener) (Object) ee.field_j);
        param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ee.field_j);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) ee.field_j);
        if (param1 > -24) {
          field_d = null;
          u.field_d = 0;
          return;
        } else {
          u.field_d = 0;
          return;
        }
    }

    final static void a(int param0, bl param1, int param2) {
        if (param2 != -7471) {
            return;
        }
        m.field_h.a((gg) (Object) param1, -7044);
        la.a(0, param0, param1);
    }

    final static String a(CharSequence param0, int param1) {
        if (param1 != 0) {
            field_d = null;
            return tg.a(false, -126, param0);
        }
        return tg.a(false, -126, param0);
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (dl.field_t.startsWith("win")) {
              L1: {
                if (param1.startsWith("http://")) {
                  break L1;
                } else {
                  if (param1.startsWith("https://")) {
                    break L1;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  }
                }
              }
              var3 = 33 % ((35 - param0) / 35);
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var4 = 0;
              L2: while (true) {
                if (param1.length() <= var4) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  if (0 == (var2.indexOf((int) param1.charAt(var4)) ^ -1)) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (Exception) (Object) decompiledCaughtException;
          return false;
        }
        return stackIn_16_0 != 0;
    }

    sj(mg param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((sj) this).field_a = param2;
        ((sj) this).field_f = param6;
        ((sj) this).field_h = param1;
        ((sj) this).field_b = param5;
        ((sj) this).field_e = param0;
        ((sj) this).field_c = param4;
        ((sj) this).field_g = param3;
    }

    static {
    }
}

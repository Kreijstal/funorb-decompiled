/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    static String field_b;
    static String field_a;
    static int field_c;

    final static boolean a(int param0) {
        int var1 = 0;
        var1 = -123 / ((param0 - 52) / 44);
        if (qc.field_A >= 20) {
          if (tk.c((byte) -38)) {
            if (0 < rc.field_b) {
              if (ne.j(0)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public static void b() {
        int var1 = 65;
        field_a = null;
        field_b = null;
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!d.a(param1, 2)) {
                var6 = nr.field_o;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var2 = uc.field_b;
                    var3 = 0;
                    L2: while (true) {
                      if (var2.length <= var3) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (param1 != var4) {
                          var3++;
                          continue L2;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (var4 != param1) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0 != 0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2_ref, "cp.B(" + 64 + 44 + param1 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final static void a(byte param0) {
        if (dc.field_L == null) {
          return;
        } else {
          Vertigo2.a((java.awt.Canvas) (Object) dc.field_L, (byte) -35);
          dc.field_L.a(gi.field_s, 30210);
          dc.field_L = null;
          if (param0 > 122) {
            if (null != t.field_m) {
              t.field_m.b((byte) 118);
              ne.field_F.requestFocus();
              return;
            } else {
              ne.field_F.requestFocus();
              return;
            }
          } else {
            field_a = null;
            if (null == t.field_m) {
              ne.field_F.requestFocus();
              return;
            } else {
              t.field_m.b((byte) 118);
              ne.field_F.requestFocus();
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "    ";
        field_c = -1;
        field_a = "Unpacking models";
    }
}

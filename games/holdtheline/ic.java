/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    String field_a;
    gn field_e;
    String field_c;
    String field_g;
    static oa field_i;
    static String field_h;
    int field_b;
    static kd field_d;
    static int[] field_f;

    final static void a(int param0, vn param1, vn param2) {
        pg.field_G = 0;
        qm.field_e = param2;
        try {
            na.field_p = param1;
            vf.field_w = 0;
            dc.field_bb = 0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ic.D(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + 19362 + 44 + 0 + 44 + 0 + 41);
        }
    }

    final static void b() {
        kc.field_e = null;
        i.field_i = null;
    }

    public static void a() {
        field_i = null;
        field_f = null;
        field_d = null;
        field_h = null;
    }

    final static void a(int param0, ij param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= in.field_e) {
                    int dupTemp$4 = param1.a(-65);
                    ek.field_n[dupTemp$4] = ek.field_n[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (in.field_e <= var3) {
                        in.field_e = var2_int;
                        int fieldTemp$5 = in.field_e;
                        in.field_e = in.field_e + 1;
                        lj.field_a[fieldTemp$5] = param1;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (lj.field_a[var3].field_h != param1.field_h) {
                              break L5;
                            } else {
                              var4 = lj.field_a[var3].a(-69);
                              if (se.field_i < ek.field_n[var4]) {
                                ek.field_n[var4] = ek.field_n[var4] - 1;
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          lj.field_a[incrementValue$6] = lj.field_a[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (param1.field_h == lj.field_a[var2_int].field_h) {
                        int dupTemp$7 = lj.field_a[var2_int].a(-90);
                        ek.field_n[dupTemp$7] = ek.field_n[dupTemp$7] + 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                ek.field_n[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("ic.C(").append(21325).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener((java.awt.event.MouseListener) (Object) field_d);
            param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) field_d);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) field_d);
            u.field_R = 0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ic.E(" + 23147 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private ic() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Player names can be up to 12 letters, numbers and underscores";
        field_d = new kd();
    }
}

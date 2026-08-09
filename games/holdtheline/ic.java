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

    final static void a(int param0, vn param1, vn param2, int param3, int param4, int param5) {
        pg.field_G = param5;
        qm.field_e = param2;
        if (param3 != 19362) {
            return;
        }
        try {
            na.field_p = param1;
            vf.field_w = param4;
            dc.field_bb = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ic.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void b(byte param0) {
        kc.field_e = null;
        if (param0 != 10) {
            field_d = (kd) null;
        }
        i.field_i = null;
    }

    public static void a(byte param0) {
        field_i = null;
        field_f = null;
        field_d = null;
        field_h = null;
        if (param0 != 114) {
            field_i = (oa) null;
        }
    }

    final static void a(int param0, ij param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if ((var2_int ^ -1) <= -4) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= in.field_e) {
                    dupTemp$0 = param1.a(-65);
                    ek.field_n[dupTemp$0] = ek.field_n[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (in.field_e <= var3) {
                        L4: {
                          in.field_e = var2_int;
                          fieldTemp$1 = in.field_e;
                          in.field_e = in.field_e + 1;
                          lj.field_a[fieldTemp$1] = param1;
                          if (param0 == 21325) {
                            break L4;
                          } else {
                            field_d = (kd) null;
                            break L4;
                          }
                        }
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if ((lj.field_a[var3].field_h ^ -1) != (param1.field_h ^ -1)) {
                              break L6;
                            } else {
                              var4 = lj.field_a[var3].a(param0 ^ -21258);
                              if (se.field_i < ek.field_n[var4]) {
                                ek.field_n[var4] = ek.field_n[var4] - 1;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          lj.field_a[incrementValue$2] = lj.field_a[var3];
                          break L5;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L7: {
                      if (param1.field_h == lj.field_a[var2_int].field_h) {
                        dupTemp$3 = lj.field_a[var2_int].a(-90);
                        ek.field_n[dupTemp$3] = ek.field_n[dupTemp$3] + 1;
                        break L7;
                      } else {
                        break L7;
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
          L8: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("ic.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener(field_d);
            if (param0 != 23147) {
                field_d = (kd) null;
            }
            param1.removeMouseMotionListener(field_d);
            param1.removeFocusListener(field_d);
            u.field_R = 0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ic.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private ic() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "Player names can be up to 12 letters, numbers and underscores";
        field_d = new kd();
    }
}

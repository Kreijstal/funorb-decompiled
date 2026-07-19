/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn {
    static String field_e;
    static int field_c;
    static String field_a;
    static String field_d;
    static int[] field_b;

    final static as a(int param0, mg param1) {
        as var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        as stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        as stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new as(param1);
            var3 = -54 % ((-34 - param0) / 45);
            stackOut_0_0 = (as) (var2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2_ref);
            stackOut_2_1 = new StringBuilder().append("qn.B(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(ik[] param0, int param1, boolean param2) {
        try {
            bj.k(26987);
            bk.a(param0, 0);
            if (!param2) {
                field_c = -118;
            }
            vp.c(-20677, param1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "qn.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        hd var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (cb.field_h != null) {
              var1_ref = (hd) ((Object) cb.field_h.d(0));
              var2 = (int)ra.field_e + 20;
              var3 = 20;
              var4 = 63 % ((param0 - -56) / 39);
              L1: while (true) {
                if (var1_ref == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (-1 >= (var1_ref.field_h ^ -1)) {
                    L2: {
                      if (230 > var1_ref.field_h) {
                        wc.a(-27030, var1_ref.field_h << 1500934308, var3, var1_ref.field_i, var2, 256);
                        break L2;
                      } else {
                        if (var1_ref.field_h >= 250) {
                          var5 = -(5 * var1_ref.field_h) + 1500;
                          wc.a(-27030, var1_ref.field_h << 814392388, -3 + var3, var1_ref.field_o, var2 - 3, var5);
                          wc.a(-27030, var1_ref.field_h << 2057711524, var3, var1_ref.field_i, var2, var5);
                          break L2;
                        } else {
                          wc.a(-27030, var1_ref.field_h << -148616476, -3 + var3, var1_ref.field_o, var2 - 3, -2760 + 12 * var1_ref.field_h);
                          wc.a(-27030, var1_ref.field_h << -989994556, var3, var1_ref.field_i, var2, 256);
                          break L2;
                        }
                      }
                    }
                    var2 = var2 + var1_ref.field_i.field_w;
                    var1_ref = (hd) ((Object) cb.field_h.a((byte) -71));
                    continue L1;
                  } else {
                    var2 = var2 + var1_ref.field_i.field_w;
                    var1_ref = (hd) ((Object) cb.field_h.a((byte) -71));
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "qn.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 < 82) {
            return;
        }
        try {
            for (var1_int = 0; var1_int < da.field_g; var1_int++) {
                wm.field_d[var1_int] = null;
            }
            da.field_g = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "qn.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        field_d = null;
        if (param0 != -989994556) {
            field_d = (String) null;
        }
    }

    static {
        field_c = 0;
        field_e = "Create";
        field_d = " and ";
        field_a = "Join";
        field_b = new int[4];
    }
}

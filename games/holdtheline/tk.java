/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    static vk[][] field_c;
    oa field_d;
    oa field_e;
    static String field_b;
    static qi field_a;

    final static void a(int[] param0, byte param1, byte param2, bm param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var7 = 0;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            if (param1 == -92) {
              gf.a();
              gf.a(param0, 0, param0.length);
              gf.c();
              L1: while (true) {
                if (!gf.d()) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var4_int = gf.field_g;
                    if (0 <= var4_int) {
                      break L2;
                    } else {
                      var4_int = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = gf.field_b;
                    if (param3.field_i <= var5) {
                      var5 = -1 + param3.field_i;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var6 = gf.field_a;
                  if (0 <= var6) {
                    if (var6 >= param3.field_l) {
                      continue L1;
                    } else {
                      var7 = var4_int + var6 * param3.field_i;
                      var8 = -var4_int + var5;
                      L4: while (true) {
                        var8--;
                        if (-1 < (var8 ^ -1)) {
                          continue L1;
                        } else {
                          param3.field_m[var7] = (byte)kc.a((int) param3.field_m[var7], (int) param2);
                          var7++;
                          continue L4;
                        }
                      }
                    }
                  } else {
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
          L5: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("tk.C(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0) {
        lk.field_e = (byte[][]) null;
        if (param0) {
            return;
        }
        nk.field_K = null;
        ad.field_d = null;
        wb.field_g = null;
        la.field_j = null;
        dd.field_E = null;
    }

    public static void a(int param0) {
        field_c = (vk[][]) null;
        field_a = null;
        field_b = null;
        if (param0 != -7689) {
            field_c = (vk[][]) null;
        }
    }

    tk(oa param0, oa param1) {
        try {
            this.field_e = param0;
            this.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Suggested names: ";
    }
}

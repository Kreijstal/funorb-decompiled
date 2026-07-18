/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends q {
    static int[] field_p;
    pj field_k;
    static int[] field_m;
    static gd field_o;
    mp field_q;
    static t field_r;
    static String[] field_n;
    static String field_j;
    rm field_l;

    final static void a(kh param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        mp var4 = null;
        rm var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var5 = param0.field_l;
              if (var5.field_M.length > var5.field_f) {
                var3 = var5.field_f;
                var5.field_M = u.a(32681, var5.field_M, var3);
                var5.field_B = u.a(32681, var5.field_B, var3);
                var5.field_E = u.a(32681, var5.field_E, var3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var5.field_g < var5.field_o.length) {
                L3: {
                  var3 = var5.field_g;
                  var5.field_o = u.a(32681, var5.field_o, var3);
                  var5.field_y = u.a(32681, var5.field_y, var3);
                  var5.field_q = u.a(32681, var5.field_q, var3);
                  var5.field_j = mn.a(-6058, var5.field_j, 0, var3);
                  if (null != var5.field_D) {
                    var5.field_D = cc.a(var3, (byte) 127, var5.field_D);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                int discarded$4 = 60;
                var5.field_m = qi.a(var3, var5.field_m);
                var4 = param0.field_q;
                if (null == var4.field_u) {
                  break L2;
                } else {
                  var4.field_u = mn.a(-6058, var4.field_u, 255, var3);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L4: {
              if (null == var5.field_u) {
                break L4;
              } else {
                if (var5.field_u.length <= var5.field_k) {
                  break L4;
                } else {
                  var3 = var5.field_k;
                  var5.field_s = cc.a(var3, (byte) 23, var5.field_s);
                  int discarded$5 = 60;
                  var5.field_u = qi.a(var3, var5.field_u);
                  int discarded$6 = 60;
                  var5.field_n = qi.a(var3, var5.field_n);
                  int discarded$7 = 60;
                  var5.field_x = qi.a(var3, var5.field_x);
                  break L4;
                }
              }
            }
            if (param1 < -55) {
              break L0;
            } else {
              kh.a(-88);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("kh.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 24997) {
          var2 = null;
          kh.a((kh) null, (byte) -125);
          field_n = null;
          field_j = null;
          field_p = null;
          field_r = null;
          field_m = null;
          field_o = null;
          return;
        } else {
          field_n = null;
          field_j = null;
          field_p = null;
          field_r = null;
          field_m = null;
          field_o = null;
          return;
        }
    }

    public kh() {
        ((kh) this).field_k = null;
        ((kh) this).field_l = null;
        ((kh) this).field_q = null;
    }

    kh(rm param0) {
        try {
            ((kh) this).field_k = null;
            ((kh) this).field_l = param0;
            ((kh) this).field_q = new mp();
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "kh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    kh(kh param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        try {
            ((kh) this).field_l = new rm(param0.field_l, param1, param2, param3, param4);
            ((kh) this).field_k = null;
            ((kh) this).field_q = new mp();
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "kh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[8192];
        field_p = new int[25];
        dk.a(field_p, 0, 25, -1);
        field_p[9] = 1;
        field_p[8] = 0;
        field_j = "Connection restored.";
    }
}

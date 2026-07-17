/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv implements mh {
    static String field_b;
    private int field_a;
    private int field_d;
    private vn field_c;

    public static void b(int param0) {
        field_b = null;
    }

    public bv() {
        ((bv) this).field_a = 1;
        ((bv) this).field_d = 1;
        ((bv) this).field_c = kw.field_b;
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0.field_k) {
                  break L2;
                } else {
                  if (!param0.d(-1)) {
                    stackOut_5_0 = 2188450;
                    stackIn_6_0 = stackOut_5_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var6_int = stackIn_6_0;
              int discarded$1 = ((bv) this).field_c.a("<u=" + Integer.toString(var6_int, 16) + ">" + param0.field_m + "</u>", param4 - -param0.field_r, param0.field_v + param1, param0.field_q, param0.field_p, var6_int, -1, ((bv) this).field_d, ((bv) this).field_a, ((bv) this).field_c.field_s + ((bv) this).field_c.field_I);
              if (!param0.d(-1)) {
                break L3;
              } else {
                L4: {
                  var7 = ((bv) this).field_c.a(param0.field_m);
                  var8 = ((bv) this).field_c.field_s - -((bv) this).field_c.field_I;
                  var9 = param4 - -param0.field_r;
                  if (2 == ((bv) this).field_d) {
                    var9 = var9 + (-var7 + param0.field_q);
                    break L4;
                  } else {
                    if (1 != ((bv) this).field_d) {
                      break L4;
                    } else {
                      var9 = var9 + (param0.field_q - var7 >> 1);
                      break L4;
                    }
                  }
                }
                L5: {
                  var10 = param0.field_v + param1;
                  if (-3 == ((bv) this).field_a) {
                    var10 = var10 + (param0.field_p + -var8);
                    break L5;
                  } else {
                    if (-2 == ((bv) this).field_a) {
                      var10 = var10 + (param0.field_p + -var8 >> 1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                pp.a(var10 + 2, 4 + var7, param2 ^ -5596714, var9 - 2, var8);
                break L3;
              }
            }
            if (param2 == 5592405) {
              break L0;
            } else {
              ((bv) this).field_a = 59;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("bv.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    bv(vn param0, int param1, int param2) {
        try {
            ((bv) this).field_a = param2;
            ((bv) this).field_c = param0;
            ((bv) this).field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bv.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0) {
        Object var2 = null;
        wv.a((byte) 99, in.field_C, (String) null);
        if (param0 != -363927231) {
            bv.a(-108);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Friends can be added in multiplayer<nbsp>games";
    }
}

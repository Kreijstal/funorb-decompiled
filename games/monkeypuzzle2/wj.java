/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wj extends hf implements vc {
    static String field_h;
    private rj field_m;
    static String field_l;
    static tk field_k;
    static na field_i;
    static ad field_j;

    public final void a(int param0, rj param1) {
        RuntimeException runtimeException = null;
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
            L1: {
              if (param0 < -19) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wj.Q(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final na c(int param0) {
        Object var3 = null;
        if (param0 != 1) {
          var3 = null;
          le[] discarded$2 = wj.a((byte) -23, -1, (ad) null, 109);
          return ((wj) this).a(((wj) this).field_m.field_s, param0 ^ 3916);
        } else {
          return ((wj) this).a(((wj) this).field_m.field_s, param0 ^ 3916);
        }
    }

    final String c(byte param0) {
        int var2 = 33 / ((param0 - 32) / 45);
        return ((wj) this).a(1, ((wj) this).field_m.field_s);
    }

    final static le[] a(byte param0, int param1, ad param2, int param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        le[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        le[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (wg.a(param3, param1, param2, -3)) {
              L1: {
                if (param0 == 83) {
                  break L1;
                } else {
                  var5 = null;
                  le[] discarded$2 = wj.a((byte) -96, -124, (ad) null, -100);
                  break L1;
                }
              }
              stackOut_5_0 = o.a(true);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("wj.O(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    abstract String a(int param0, String param1);

    final static void a(int param0, wf param1, int param2) {
        hb var5 = null;
        int var4 = 0;
        try {
            var5 = gf.field_c;
            var5.b(true, 5);
            var5.field_h = var5.field_h + 1;
            var4 = var5.field_h;
            var5.b(1, -49152);
            var5.b(param1.field_e, -49152);
            var5.a(param1.field_f, false);
            var5.a(-803539344, param1.field_g);
            var5.a(-803539344, param1.field_k);
            var5.a(-803539344, param1.field_l);
            var5.a(-803539344, param1.field_j);
            int discarded$0 = var5.a((byte) -59, var4);
            var5.a(-var4 + var5.field_h, (byte) -113);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "wj.V(" + 25533 + ',' + (param1 != null ? "{...}" : "null") + ',' + 5 + ')');
        }
    }

    final static void d(byte param0) {
        if (!(me.field_f == null)) {
            me.field_f.g((byte) -75);
        }
        sc.field_f = new eb();
        jh.field_C.c((byte) 36, (we) (Object) sc.field_f);
    }

    public final void b(int param0, rj param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != 16926) {
                var4 = null;
                ((wj) this).a(35, (rj) null);
                ((wj) this).a((byte) -88);
                break L1;
              } else {
                ((wj) this).a((byte) -88);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("wj.EA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static boolean d(int param0) {
        int var1 = 0;
        var1 = 96 / ((37 - param0) / 53);
        if (mc.field_a >= 20) {
          if (vg.c(false)) {
            if (ue.field_G > 0) {
              if (ej.a(12931)) {
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

    abstract na a(String param0, int param1);

    public final boolean a(boolean param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          if (((wj) this).field_m.field_s != null) {
            if (0 == ((wj) this).field_m.field_s.length()) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_k = null;
          if (((wj) this).field_m.field_s == null) {
            return true;
          } else {
            L0: {
              if (0 != ((wj) this).field_m.field_s.length()) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    wj(rj param0) {
        try {
            ((wj) this).field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "wj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_l = null;
        field_j = null;
        field_k = null;
        field_h = null;
        field_i = null;
    }

    final static void a(float[] param0, int param1, float[] param2) {
        try {
            if (param1 > -72) {
                field_l = null;
            }
            param0[0] = param0[0] + param2[0];
            param0[1] = param0[1] + param2[1];
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "wj.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Well done!";
        field_l = "Player names can be up to 12 letters, numbers and underscores";
        field_k = new tk();
        field_i = new na();
    }
}

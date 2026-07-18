/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    private um field_e;
    private v field_d;
    private um field_b;
    static int field_c;
    static lc field_a;
    static int field_h;
    static String field_f;
    static he field_g;

    final static void a(boolean param0) {
        int var4 = 0;
        if (pj.field_h == null) {
            return;
        }
        int var3 = pj.field_h.b(param0, (byte) -95);
        if (var3 != -2) {
            if (!(var3 == -1)) {
                var4 = pj.field_h.b(false) ? 1 : 0;
                int discarded$0 = 79;
                ng.a(14, var4 != 0, pj.field_h.field_Lb, var3, pj.field_h.a(true));
            }
            pj.field_h = null;
            fi.a(-393711775);
        }
    }

    final j a(int param0, int param1) {
        j var3 = null;
        byte[] var4 = null;
        j var5 = null;
        var3 = (j) ((kj) this).field_d.a((byte) -77, (long)param0);
        if (param1 == 0) {
          if (var3 != null) {
            return var3;
          } else {
            L0: {
              if (param0 < 32768) {
                var4 = ((kj) this).field_e.a(0, param0, 5847);
                break L0;
              } else {
                var4 = ((kj) this).field_b.a(0, param0 & 32767, 5847);
                break L0;
              }
            }
            var5 = new j();
            if (var4 == null) {
              if (param0 >= 32768) {
                var5.f(0);
                ((kj) this).field_d.a((long)param0, 1, (Object) (Object) var5);
                return var5;
              } else {
                ((kj) this).field_d.a((long)param0, 1, (Object) (Object) var5);
                return var5;
              }
            } else {
              var5.a(new p(var4), param1);
              if (param0 < 32768) {
                ((kj) this).field_d.a((long)param0, 1, (Object) (Object) var5);
                return var5;
              } else {
                var5.f(0);
                ((kj) this).field_d.a((long)param0, 1, (Object) (Object) var5);
                return var5;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a() {
        int var1 = 0;
        field_f = null;
        field_g = null;
        field_a = null;
    }

    kj(int param0, um param1, um param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((kj) this).field_d = new v(64);
        try {
          L0: {
            L1: {
              ((kj) this).field_e = param1;
              ((kj) this).field_b = param2;
              if (((kj) this).field_e == null) {
                break L1;
              } else {
                int discarded$4 = ((kj) this).field_e.a((byte) -67, 0);
                break L1;
              }
            }
            if (((kj) this).field_b == null) {
              break L0;
            } else {
              int discarded$5 = ((kj) this).field_b.a((byte) -106, 0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("kj.<init>(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_f = "<%0> is not on your friend list.";
    }
}

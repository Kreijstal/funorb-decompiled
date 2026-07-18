/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    boolean field_h;
    ed field_e;
    static int field_g;
    boolean field_f;
    int field_b;
    private int field_c;
    static om field_d;
    static hh field_a;

    public static void b() {
        field_d = null;
        field_a = null;
    }

    final static oc a(byte param0, hh param1, int param2, ed param3, boolean param4, int param5) {
        oc var6 = null;
        RuntimeException var6_ref = null;
        oc stackIn_1_0 = null;
        oc stackIn_2_0 = null;
        oc stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        oc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        oc stackOut_0_0 = null;
        oc stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        oc stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        oc stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var6 = new oc(param3, param5, param2, param1);
              stackOut_0_0 = (oc) var6;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (!param4) {
                stackOut_2_0 = (oc) (Object) stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (oc) (Object) stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            stackIn_3_0.field_q = stackIn_3_1 != 0;
            stackOut_3_0 = (oc) var6;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("ci.B(").append(-43).append(',');
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_4_0;
    }

    final static void a() {
        if (!ce.field_f.b(117)) {
          if (null == de.field_i) {
            field_d = null;
            return;
          } else {
            kh.a(lh.b((byte) 116), -1230, true);
            field_d = null;
            return;
          }
        } else {
          nf.a(-106, true);
          field_d = null;
          return;
        }
    }

    final static ll a(int param0, int param1, int param2, int param3) {
        ll var4 = new ll();
        var4.field_i = 0;
        var4.field_g = 5;
        jl.field_n.a(-12328, (hg) (Object) var4);
        ma.a(-100, 2, var4);
        return var4;
    }

    final boolean a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 <= -56) {
          if (!bj.e((byte) -52)) {
            if (!((ci) this).field_h) {
              L0: {
                var3 = 1 << param0;
                if (0 == (((ci) this).field_c & var3)) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L0;
                }
              }
              var4 = stackIn_12_0;
              return var4 != 0;
            } else {
              return false;
            }
          } else {
            L1: {
              var3 = 1 << param0;
              if (0 == (((ci) this).field_c & var3)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            var4 = stackIn_6_0;
            return var4 != 0;
          }
        } else {
          return false;
        }
    }

    ci(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        ((ci) this).field_e = jb.field_w;
        ((ci) this).field_h = param1 ? true : false;
        ((ci) this).field_b = param0;
        ((ci) this).field_f = param2 ? true : false;
        ((ci) this).field_c = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = -1;
        field_d = new om(6, 0, 4, 2);
    }
}

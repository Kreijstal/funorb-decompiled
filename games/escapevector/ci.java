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

    public static void b(int param0) {
        ll discarded$0 = null;
        field_d = null;
        field_a = null;
        if (param0 != 4) {
            discarded$0 = ci.a(-111, 38, 24, -46);
        }
    }

    final static oc a(byte param0, hh param1, int param2, ed param3, boolean param4, int param5) {
        oc var6 = null;
        RuntimeException var6_ref = null;
        oc stackIn_3_0 = null;
        oc stackIn_4_0 = null;
        oc stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        oc stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        oc stackOut_2_0 = null;
        oc stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        oc stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        oc stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var6 = new oc(param3, param5, param2, param1);
              if (param0 == -43) {
                break L1;
              } else {
                ci.b(68);
                break L1;
              }
            }
            L2: {
              stackOut_2_0 = (oc) (var6);
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (!param4) {
                stackOut_4_0 = (oc) ((Object) stackIn_4_0);
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L2;
              } else {
                stackOut_3_0 = (oc) ((Object) stackIn_3_0);
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L2;
              }
            }
            stackIn_5_0.field_q = stackIn_5_1 != 0;
            stackOut_5_0 = (oc) (var6);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6_ref);
            stackOut_7_1 = new StringBuilder().append("ci.B(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0) {
        if (ce.field_f.b(param0 + 117)) {
          nf.a(-106, true);
          if (param0 != 0) {
            field_d = (om) null;
            return;
          } else {
            return;
          }
        } else {
          if (null != de.field_i) {
            kh.a(lh.b((byte) 116), param0 + -1230, true);
            if (param0 == 0) {
              return;
            } else {
              field_d = (om) null;
              return;
            }
          } else {
            if (param0 == 0) {
              return;
            } else {
              field_d = (om) null;
              return;
            }
          }
        }
    }

    final static ll a(int param0, int param1, int param2, int param3) {
        ll var4 = null;
        var4 = new ll();
        var4.field_i = param1;
        var4.field_g = param0;
        jl.field_n.a(-12328, var4);
        if (param2 != -1) {
          field_g = 109;
          ma.a(-100, param3, var4);
          return var4;
        } else {
          ma.a(-100, param3, var4);
          return var4;
        }
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
            if (!this.field_h) {
              L0: {
                var3 = 1 << param0;
                if (0 == (this.field_c & var3)) {
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
              if (0 == (this.field_c & var3)) {
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
        this.field_e = jb.field_w;
        this.field_h = param1 ? true : false;
        this.field_b = param0;
        this.field_f = param2 ? true : false;
        this.field_c = param3;
    }

    static {
        field_g = -1;
        field_d = new om(6, 0, 4, 2);
    }
}

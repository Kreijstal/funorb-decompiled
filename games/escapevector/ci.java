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
        field_d = null;
        field_a = null;
        if (param0 != 4) {
            ci.a(-111, 38, 24, -46);
        }
    }

    final static oc a(byte param0, hh param1, int param2, ed param3, boolean param4, int param5) {
        oc var6 = null;
        RuntimeException var6_ref = null;
        oc stackIn_4_0 = null;
        oc stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        oc stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_4_0 = (oc) (var6);

              if (!param4) {
                stackIn_5_0 = (oc) ((Object) stackIn_4_0);
                stackIn_5_1 = 0;
                break L2;
              } else {
                stackIn_5_0 = (oc) ((Object) stackIn_4_0);
                stackIn_5_1 = 1;
                break L2;
              }
            }
            stackIn_5_0.field_q = stackIn_5_1 != 0;
            stackIn_6_0 = (oc) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6_ref);

            stackIn_9_1 = new StringBuilder().append("ci.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param4 + ',' + param5 + ')');
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
        ll var4;
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
        int var3;
        int var4;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        if (param1 <= -56) {
          if (!bj.e((byte) -52)) {
            if (!this.field_h) {
              L0: {
                var3 = 1 << param0;
                if (0 == (this.field_c & var3)) {
                  stackIn_12_0 = 0;
                  break L0;
                } else {
                  stackIn_12_0 = 1;
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
                stackIn_6_0 = 0;
                break L1;
              } else {
                stackIn_6_0 = 1;
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

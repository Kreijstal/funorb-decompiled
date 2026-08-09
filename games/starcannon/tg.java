/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends ik {
    int field_v;
    static sk field_x;
    uf field_t;
    static int field_y;
    static String field_w;
    byte[] field_u;

    final byte[] f(int param0) {
        if (!this.field_r) {
          if (param0 != 0) {
            this.field_t = (uf) null;
            return this.field_u;
          } else {
            return this.field_u;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static ma d(byte param0) {
        if (param0 != 10) {
          field_x = (sk) null;
          return new ma(we.a(29084), ek.a(-86));
        } else {
          return new ma(we.a(29084), ek.a(-86));
        }
    }

    public static void h(int param0) {
        field_x = null;
        field_w = null;
        int var1 = 34 % ((-11 - param0) / 38);
    }

    final int e(int param0) {
        if (param0 == -29144) {
          if (this.field_r) {
            return 0;
          } else {
            return 100;
          }
        } else {
          this.e(69);
          if (this.field_r) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    final static ig a(int param0, String param1) {
        RuntimeException var2 = null;
        ig stackIn_5_0 = null;
        ig stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (jl.field_a != ie.field_x) {
              if (param0 <= -27) {
                L1: {
                  if (ie.field_x != s.field_f) {
                    break L1;
                  } else {
                    if (!param1.equals(te.field_a)) {
                      break L1;
                    } else {
                      ie.field_x = cl.field_k;
                      stackIn_9_0 = mf.field_a;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                mf.field_a = null;
                ie.field_x = jl.field_a;
                te.field_a = param1;
                stackIn_11_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (ig) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("tg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return (ig) ((Object) stackIn_11_0);
          }
        }
    }

    tg() {
    }

    static {
        field_x = new sk();
        field_w = "Player names can be up to 12 letters, numbers and underscores";
    }
}

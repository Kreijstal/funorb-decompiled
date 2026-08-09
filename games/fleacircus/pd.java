/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends lh {
    ie field_m;
    static dd[] field_k;
    int field_j;
    static String field_i;
    static int field_l;
    lh field_n;

    final static ob a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ob var5 = null;
        ob stackIn_4_0 = null;
        ob stackIn_9_0 = null;
        ob stackIn_12_0 = null;
        ob stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() == 0) {
                  break L1;
                } else {
                  L2: {
                    if (param0 <= -69) {
                      break L2;
                    } else {
                      field_l = -22;
                      break L2;
                    }
                  }
                  var2_int = param1.indexOf('@');
                  if (0 != (var2_int ^ -1)) {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(1 + var2_int);
                    var5 = jk.a(var3, (byte) 113);
                    if (var5 == null) {
                      stackIn_14_0 = id.a(var4, 31592);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_12_0 = (ob) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_9_0 = tf.field_H;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_4_0 = tf.field_G;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("pd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_k = null;
        if (param0 != -89) {
            pd.a((byte) 62);
            field_i = null;
            return;
        }
        field_i = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param1) {
          gb.g(0, 0, gb.field_d, gb.field_k, 0, 192);
          if (!fleas.field_A) {
            kb.a(param2, param1);
            return;
          } else {
            gb.c();
            kb.a(param2, param1);
            return;
          }
        } else {
          gb.c();
          kb.a(param2, param1);
          return;
        }
    }

    final static n a(byte[] param0, boolean param1) {
        n var2 = null;
        RuntimeException var2_ref = null;
        n stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  field_i = (String) null;
                  break L1;
                }
              }
              var2 = new n(param0, vg.field_I, b.field_b, ij.field_H, ob.field_a, rd.field_d, of.field_d);
              c.o(-28210);
              stackIn_6_0 = (n) (var2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("pd.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    pd(ie param0, lh param1) {
        try {
            this.field_m = param0;
            this.field_j = param0.g();
            this.field_n = param1;
            this.field_m.h(this.field_j * gf.field_d + 128 >> -149676440);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "pd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Level score: <%0>";
    }
}

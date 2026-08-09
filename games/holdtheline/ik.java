/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static String field_e;
    byte[] field_g;
    int field_c;
    int field_j;
    int field_m;
    byte[] field_l;
    int field_b;
    int field_n;
    static int field_a;
    int field_d;
    static int field_i;
    static boolean field_f;
    static String field_k;
    int field_h;

    final static String[] a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        tn var6 = null;
        String[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            var6 = ta.a((byte) 72);
            var3 = 0;
            var4 = param1;
            L1: while (true) {
              if (param0.length <= var4) {
                stackIn_17_0 = var6.c(3);
                break L0;
              } else {
                L2: while (true) {
                  L3: {
                    if (var4 >= param0.length) {
                      break L3;
                    } else {
                      if (-14 == (param0[var4] ^ -1)) {
                        break L3;
                      } else {
                        if (param0[var4] == 10) {
                          break L3;
                        } else {
                          var4++;
                          continue L2;
                        }
                      }
                    }
                  }
                  var6.a((byte) 112, sm.a(-var3 + var4, var3, -129, param0));
                  L4: while (true) {
                    L5: {
                      if (param0.length <= var4) {
                        break L5;
                      } else {
                        L6: {
                          if (-14 == (param0[var4] ^ -1)) {
                            break L6;
                          } else {
                            if (param0[var4] != 10) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var4++;
                        continue L4;
                      }
                    }
                    var3 = var4;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("ik.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final static boolean a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_f = false;
                break L1;
              }
            }
            stackIn_3_0 = ne.a(10, param0, true, 106);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ik.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static vj a(int param0, vj param1, float param2) {
        RuntimeException var3 = null;
        vj var4 = null;
        gj var5 = null;
        lb var6 = null;
        gj stackIn_4_0 = null;
        lb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 63) {
                break L1;
              } else {
                var4 = (vj) null;
                ik.a(-87, (vj) null, -0.22468635439872742f);
                break L1;
              }
            }
            if (param1 instanceof lb) {
              var6 = (lb) ((Object) param1);
              stackIn_6_0 = new lb(var6.a(false, param2), var6.field_s, param1.field_k, param1.field_p, param1.field_q);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var5 = (gj) ((Object) param1);
              stackIn_4_0 = new gj(var5.field_t, var5.field_u, (-var5.field_r + var5.field_w) * param2 + var5.field_r, var5.field_w, param1.field_k, param1.field_p, param1.field_q);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ik.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vj) ((Object) stackIn_4_0);
        } else {
          return (vj) ((Object) stackIn_6_0);
        }
    }

    public static void a(byte param0) {
        if (param0 != 109) {
            ik.a((byte) 7);
        }
        field_e = null;
        field_k = null;
    }

    static {
        field_e = "Start Race";
        field_a = 48;
        field_k = "Powerups have the following effects:";
        field_i = -1;
    }
}

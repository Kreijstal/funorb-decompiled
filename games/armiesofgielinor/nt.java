/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nt extends tc {
    int field_q;
    int field_r;
    static String field_p;
    int[][] field_n;
    boolean field_l;
    int field_k;
    String[][] field_t;
    int field_o;
    int field_s;
    int field_m;

    public static void a(byte param0) {
        field_p = null;
        if (param0 != 97) {
            field_p = (String) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_10_0 = 0;
        wk stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        wk stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        wk stackIn_19_0;
        int stackIn_19_1;
        int stackIn_19_2;
        int stackIn_19_3;
        wk stackIn_20_0;
        int stackIn_20_1;
        int stackIn_20_2;
        int stackIn_20_3;
        int stackIn_20_4;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 894) {
                break L1;
              } else {
                nt.a((byte) 82);
                break L1;
              }
            }
            L2: {
              if (cu.field_a) {
                var5_int = param1 & 3;
                param1 = param1 | param1 << 589217800;
                var6 = 0;
                L3: while (true) {
                  L4: {
                    L5: {
                      stackIn_10_0 = var6;

                      if (!cu.field_a) {
                        if (stackIn_10_0 >= 1) {
                          break L4;
                        } else {
                          break L5;
                        }
                      } else {
                        if (stackIn_10_0 >= 4) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      var7 = (((15 & param1) + 15) * param2 / 16 + var6 * 20 - -(param1 & 15)) % 320;
                      var8 = 0;
                      if (64 > var7) {
                        var8 = -var7 + 64 << -1044545695;
                        break L6;
                      } else {
                        var8 = var7 - 64 >> 1864204449;
                        break L6;
                      }
                    }
                    L7: {
                      stackIn_16_0 = vf.field_j[var5_int];

                      stackIn_16_1 = param3;

                      stackIn_16_2 = param4 + -(var7 / 4);

                      if (cu.field_a) {
                        stackIn_17_0 = (wk) ((Object) stackIn_16_0);
                        stackIn_17_1 = stackIn_16_1;
                        stackIn_17_2 = stackIn_16_2;
                        stackIn_17_3 = 1;
                        break L7;
                      } else {
                        stackIn_17_0 = (wk) ((Object) stackIn_16_0);
                        stackIn_17_1 = stackIn_16_1;
                        stackIn_17_2 = stackIn_16_2;
                        stackIn_17_3 = 2;
                        break L7;
                      }
                    }
                    L8: {
                      fe.a(stackIn_17_0, stackIn_17_1, stackIn_17_2, stackIn_17_3 * (-var8 + 128));
                      param1 = param1 >> 2;
                      stackIn_19_0 = vf.field_j[4 + var5_int];

                      stackIn_19_1 = var5_int + param3;

                      stackIn_19_2 = -(var7 / 4) + param4;

                      stackIn_19_3 = 64 + -(var8 / 2);

                      if (cu.field_a) {
                        stackIn_20_0 = (wk) ((Object) stackIn_19_0);
                        stackIn_20_1 = stackIn_19_1;
                        stackIn_20_2 = stackIn_19_2;
                        stackIn_20_3 = stackIn_19_3;
                        stackIn_20_4 = 1;
                        break L8;
                      } else {
                        stackIn_20_0 = (wk) ((Object) stackIn_19_0);
                        stackIn_20_1 = stackIn_19_1;
                        stackIn_20_2 = stackIn_19_2;
                        stackIn_20_3 = stackIn_19_3;
                        stackIn_20_4 = 2;
                        break L8;
                      }
                    }
                    ((wk) (Object) stackIn_20_0).f(stackIn_20_1, stackIn_20_2, stackIn_20_3 * stackIn_20_4);
                    var5_int = 3 & (var5_int ^ param1);
                    var6++;
                    continue L3;
                  }
                  break L2;
                }
              } else {
                fe.a(vf.field_j[3 & param1], param3, param4);
                param1 = param1 >> 2;
                vf.field_j[(3 & param1) + 4].f(param3, -4 + param4, 128);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "nt.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = kl.c(tf.field_l, -76, hi.field_j);
              if ((var2_int ^ -1) == -2) {
                param1 = "<img=0>" + param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-3 != (var2_int ^ -1)) {
                break L2;
              } else {
                param1 = "<img=1>" + param1;
                break L2;
              }
            }
            var3 = 103 % ((param0 - -62) / 38);
            stackIn_6_0 = (String) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("nt.C(").append(param0).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    nt() {
    }

    static {
        field_p = "Yes";
    }
}

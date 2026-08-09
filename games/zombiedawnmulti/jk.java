/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static mi field_h;
    static int[] field_l;
    static int[] field_b;
    static String field_i;
    static int field_j;
    static String field_c;
    static String field_a;
    static String field_e;
    static int field_g;
    static int field_f;
    static cj field_d;
    static int[] field_k;

    public static void a(int param0) {
        field_e = null;
        if (param0 != 2) {
            return;
        }
        field_i = null;
        field_k = null;
        field_c = null;
        field_a = null;
        field_h = null;
        field_d = null;
        field_b = null;
        field_l = null;
    }

    final static boolean a(byte param0, int param1) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 <= -38) {
            break L0;
          } else {
            jk.a((byte) -103, -99);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((param1 ^ -1) == -256) {
              break L2;
            } else {
              if ((param1 ^ -1) > -1) {
                break L2;
              } else {
                if ((1L << param1 & em.field_N ^ -1L) == -1L) {
                  break L2;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static int a(byte param0, int param1, int[][] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0 > param1) {
                break L1;
              } else {
                if ((param3 ^ -1) > -1) {
                  break L1;
                } else {
                  if (param3 < param2.length) {
                    var4_int = 85 / ((-36 - param0) / 38);
                    if (param1 < param2[0].length) {
                      stackIn_12_0 = param2[param3][param1];
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_10_0 = -1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_7_0 = -1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_4_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("jk.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final static void a(int param0, String[] param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (hd.field_s == null) {
                break L1;
              } else {
                hd.field_s.field_J.a((byte) -112, param1);
                break L1;
              }
            }
            L2: {
              if (qe.field_e == null) {
                break L2;
              } else {
                qe.field_e.field_V.a((byte) -112, param1);
                break L2;
              }
            }
            L3: {
              if (param0 == 0) {
                break L3;
              } else {
                jk.a((byte) 88, 116);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("jk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        ga var2 = ma.field_a;
        var2.b((byte) -35, param0);
        var2.a(-120, param1);
        var2.a(121, 1);
    }

    static {
        int var5 = 0;
        field_j = -1;
        field_a = "You must play 1 more rated game before playing with the current options.";
        field_c = "Hide game chat";
        field_i = "Send private message to <%0>";
        field_e = "Staff impersonation";
        field_l = new int[61];
        field_b = new int[61];
        double var0 = 0.0;
        double var2 = 0.41887902047863906;
        int var4 = 20;
        for (var5 = 0; (var5 ^ -1) > -61; var5++) {
            field_l[var5] = (int)(Math.sin(var0) * ((double)(var4 > var5 ? 2 : var5 >= 2 * var4 ? 8 : 4) * 20.0));
            field_b[var5] = (int)(20.0 * (double)(var4 <= var5 ? 2 * var4 <= var5 ? 8 : 4 : 2) * Math.cos(var0));
            var0 = var0 + var2;
        }
        field_l[60] = 0;
        field_b[60] = 0;
        field_k = new int[8192];
    }
}

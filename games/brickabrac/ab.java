/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends ld {
    static int[][] field_C;
    static String field_z;
    static String[] field_y;
    static String field_F;
    static int field_E;
    static rk[][] field_A;
    static mh field_x;

    public static void f(byte param0) {
        field_z = null;
        field_A = (rk[][]) null;
        field_C = (int[][]) null;
        field_x = null;
        int var1 = 55 / ((-70 - param0) / 41);
        field_F = null;
        field_y = null;
    }

    final void a(int param0, int param1, char param2) {
        if (param0 != -120) {
            String var5 = (String) null;
            ab.a((String) null, 111);
        }
        this.field_h.a(0, -1);
    }

    final int f(int param0) {
        if (param0 != -6) {
            ab.f((byte) -118);
        }
        return 480;
    }

    final static boolean a(byte param0, String param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!ab.a(param1, 0)) {
              if (gp.a((byte) 54, param1)) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!pp.a(param1, true)) {
                  if (param0 < -38) {
                    if (param2.length() == 0) {
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (q.a(param1, 0, param2)) {
                        stackIn_20_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!ll.a(param1, (byte) 122, param2)) {
                          if (ep.a(param1, (byte) 73, param2)) {
                            stackIn_27_0 = 0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return true;
                          }
                        } else {
                          stackIn_23_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    }
                  } else {
                    stackIn_12_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("ab.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L1;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L2;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0 != 0;
                    } else {
                      return stackIn_27_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    ab() {
        super(20, lo.field_a);
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param1;
            L1: while (true) {
              if (var2_int >= param0.length()) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var3 = param0.charAt(var2_int);
                  if (ni.b(true, (char) var3)) {
                    break L2;
                  } else {
                    if (eh.a((char) var3, (byte) 95)) {
                      break L2;
                    } else {
                      stackIn_6_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("ab.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final static id a(byte param0, long param1) {
        if (param0 != 96) {
            ab.a((byte) 62, 38L);
        }
        return (id) ((Object) eq.field_m.a(param1, param0 ^ -97));
    }

    static {
        int var0 = 0;
        field_z = "Add name";
        field_C = new int[5][256];
        field_y = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_F = "Weak: your ball will be unable to destroy any bricks.";
        for (var0 = 0; -6 < (var0 ^ -1); var0++) {
            field_C[var0][240] = 15790320;
            field_C[var0][251] = 16382457;
            field_C[var0][255] = 16777215;
        }
        field_C[0][104] = 16301244;
        field_C[0][97] = 16760767;
        field_C[0][95] = 15907000;
        field_C[1][95] = 11703759;
        field_C[1][104] = 12098263;
        field_C[1][97] = 12558303;
        field_C[2][104] = 10012328;
        field_C[2][95] = 9616800;
        field_C[2][97] = 10473381;
        field_C[3][95] = 13738423;
        field_C[3][97] = 15184843;
        field_C[3][104] = 14461633;
        field_C[4][95] = 12374409;
        field_C[4][104] = 12967056;
        field_C[4][97] = 13625239;
    }
}

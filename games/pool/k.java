/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends ud {
    static ec[] field_O;
    static int[][] field_N;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        wj var7 = null;
        super.a(param0, param1, param2, param3, (byte) 67, param5);
        if (param4 < 62) {
            return;
        }
        try {
            var7 = uh.field_u;
            if (var7 != null) {
                if (!this.a(param0, param2, param1, -1, param3)) {
                    return;
                }
                if (this.field_t instanceof jm) {
                    ((jm) ((Object) this.field_t)).a(-110, (k) (this), var7);
                    uh.field_u = null;
                    return;
                }
                if (!(var7.field_t instanceof jm)) {
                    return;
                }
                ((jm) ((Object) var7.field_t)).a(-74, (k) (this), var7);
                uh.field_u = null;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "k.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, long param2) {
        oq var4 = ej.field_j;
        var4.b(false, param0);
        var4.field_v = var4.field_v + 1;
        int var6 = 84 / ((-74 - param1) / 37);
        int var5 = var4.field_v;
        var4.a(6, false);
        var4.a(param2, (byte) -126);
        var4.b(var4.field_v + -var5, true);
    }

    final static void g(byte param0) {
        if (param0 != 96) {
            field_O = (ec[]) null;
            if (!(bj.c(1))) {
                return;
            }
            kk.a(false, 4, 4);
            return;
        }
        if (!(bj.c(1))) {
            return;
        }
        kk.a(false, 4, 4);
    }

    final static String a(long param0, int param1, boolean param2, int param3) {
        if (!param2) {
          k.h(83);
          return di.a(param0, param3, false, -109, param1, 10);
        } else {
          return di.a(param0, param3, false, -109, param1, 10);
        }
    }

    private k(int param0, int param1, int param2, int param3, fp param4, cc param5, ei param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_L = param6;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "k.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int[] param0, byte param1, int[] param2) {
        try {
            kf.a(param2.length, (byte) -104, param2, param0, 0);
            if (param1 != -121) {
                field_O = (ec[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "k.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(int param0) {
        field_O = null;
        field_N = (int[][]) null;
        if (param0 != 120) {
            field_N = (int[][]) null;
        }
    }

    final static boolean a(di param0, di param1, di param2, boolean param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0.d(85)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.a("commonui", 0)) {
                L1: {
                  if (!param1.d(71)) {
                    break L1;
                  } else {
                    if (param1.a("commonui", 0)) {
                      L2: {
                        if (!param2.d(122)) {
                          break L2;
                        } else {
                          if (!param2.a("button.gif", 0)) {
                            break L2;
                          } else {
                            if (param3) {
                              stackIn_19_0 = 1;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              stackIn_17_0 = 1;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("k.H(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), stackIn_29_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_19_0 != 0;
              }
            }
          }
        }
    }

    static {
        field_N = new int[120][2];
    }
}

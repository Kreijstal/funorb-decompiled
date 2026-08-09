/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kb extends ch implements bp {
    static String field_M;
    static String field_J;
    static ob field_L;
    static int[] field_N;
    static String[] field_I;
    private oa field_K;

    final static void a(int param0, cb param1, vi param2, boolean param3, java.awt.Component param4, int param5) {
        try {
            if (param5 <= 102) {
                java.awt.Component var7 = (java.awt.Component) null;
                kb.a(-5, (cb) null, (vi) null, false, (java.awt.Component) null, -3);
            }
            oh.a(1024, param0, param3, param0, (byte) -110, param4, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "kb.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var4 = -101 % ((-56 - param2) / 62);
              var3 = bc.b(0, param1);
              if (-1 != param0.indexOf(param1)) {
                break L1;
              } else {
                if (0 != (param0.indexOf(var3) ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (param0.startsWith(param1)) {
                        break L3;
                      } else {
                        if (param0.startsWith(var3)) {
                          break L3;
                        } else {
                          if (param0.endsWith(param1)) {
                            break L3;
                          } else {
                            if (!param0.endsWith(var3)) {
                              stackIn_12_0 = 0;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackIn_12_0 = 1;
                    break L2;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("kb.M(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    void a(oa param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_K = param0;
              this.field_K.field_g = (kb) (this);
              if (param1 == 20672) {
                break L1;
              } else {
                field_M = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kb.H(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_I = null;
        field_N = null;
        field_J = null;
        field_L = null;
        field_M = null;
        if (param0 != 125) {
            field_L = (ob) null;
        }
    }

    abstract int l(int param0);

    abstract boolean m(int param0);

    public final ml a(int param0) {
        if (param0 != 1) {
            return (ml) null;
        }
        return (ml) ((Object) this.field_K);
    }

    abstract int e(byte param0);

    abstract int c(boolean param0);

    kb(int param0, int param1, int param2, int param3, eb param4) {
        super(param0, param1, param2, param3, param4);
    }

    static {
        field_N = new int[1024];
        field_M = "Hide players in <%0>'s game";
        field_J = "Start Game";
        field_I = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}

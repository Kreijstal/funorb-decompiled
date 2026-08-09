/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends dm {
    private Object field_C;
    static String field_y;
    static int field_D;
    static String field_G;
    static mg field_F;
    static int field_E;
    static int field_z;
    static String field_A;
    static String field_B;

    mj(Object param0, int param1) {
        super(param1);
        try {
            this.field_C = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "mj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void f(int param0) {
        sj.a(mb.g((byte) 93), 20298);
        if (param0 != 0) {
            field_z = -18;
        }
    }

    final static void a(int param0, boolean param1) {
        w.field_I.a(param1, 11358);
        if (param0 != 0) {
            mj.g(37);
        }
    }

    final Object b(byte param0) {
        if (param0 != -109) {
            this.d(-120);
            return this.field_C;
        }
        return this.field_C;
    }

    final boolean d(int param0) {
        if (param0 < 65) {
            field_F = (mg) null;
            return false;
        }
        return false;
    }

    public static void g(int param0) {
        if (param0 > -96) {
          mj.g(125);
          field_G = null;
          field_y = null;
          field_B = null;
          field_A = null;
          field_F = null;
          return;
        } else {
          field_G = null;
          field_y = null;
          field_B = null;
          field_A = null;
          field_F = null;
          return;
        }
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = od.b(0, param1);
            if (param0.indexOf(param1) != -1) {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-1 == param0.indexOf(var3)) {
                L1: {
                  if (param2 > 105) {
                    break L1;
                  } else {
                    var4 = (String) null;
                    mj.a((String) null, (String) null, (byte) -49);
                    break L1;
                  }
                }
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
                            stackIn_14_0 = 0;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_14_0 = 1;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("mj.H(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    static {
        field_A = "Game";
        field_G = "Virogrid";
        field_D = 0;
        field_E = 0;
        field_y = "<%0> has entered a game.";
    }
}

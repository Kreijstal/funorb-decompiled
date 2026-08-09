/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn implements wo {
    static int field_c;
    static int field_b;
    static String field_a;

    final static void a(int param0, int param1, int param2, String param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6_int = param4 - 350;
              var7 = -param4 + (-param5 + 130);
              if (var6_int < var7) {
                var6_int = var7;
                break L1;
              } else {
                break L1;
              }
            }
            var8 = -(var6_int * 256 / 50) + 256;
            if ((var8 ^ -1) < param0) {
              if (var8 >= 256) {
                go.field_l.a(param3, param2, 15 + param4, param1, -1);
                return;
              } else {
                go.field_l.a(param3, param2, 15 + param4, param1, -1, var8);
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("wn.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        if (param4 == -30) {
          if (param1 >= param3) {
            if (param1 < param0 + param3) {
              if (param6 <= param2) {
                if (param5 + param6 <= param2) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_a = (String) null;
          if (param1 >= param3) {
            if (param1 < param0 + param3) {
              if (param6 <= param2) {
                if (param5 + param6 <= param2) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 48) {
            wn.a(-68, 71, -50, 47, (byte) 118, 122, -66);
        }
    }

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        dl var8 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_c = 70;
                break L1;
              }
            }
            L2: {
              var6_int = param2 - -param3.field_r;
              var7 = param3.field_j + param0;
              ca.a((byte) -128, var6_int, var7, param3.field_f, param3.field_g);
              var8 = ao.field_b[1];
              if (!(param3 instanceof pc)) {
                break L2;
              } else {
                if (!((pc) ((Object) param3)).field_A) {
                  break L2;
                } else {
                  var8.d(var6_int - -1 + (param3.field_g - var8.field_n >> 1511148865), var7 - -1 - -(param3.field_f - var8.field_o >> -1175892991), 256);
                  break L2;
                }
              }
            }
            if (param3.e(-122)) {
              ci.a(var6_int + 2, var7 + 2, false, param3.field_f + -4, -4 + param3.field_g);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("wn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param4 + ')');
        }
    }

    static {
        field_b = 0;
        field_a = "Achieved: <%0>";
    }
}

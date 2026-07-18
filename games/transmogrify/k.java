/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class k {
    static String field_e;
    int field_c;
    static String field_a;
    int field_d;
    int field_f;
    int field_b;
    int field_h;
    int field_g;

    public static void a() {
        field_e = null;
        field_a = null;
    }

    abstract void a(int param0, int param1);

    abstract void a(int param0, int param1, int param2);

    final static void b() {
    }

    final static void a(int param0, boolean param1, int param2, ti[] param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param4 <= 0) {
                  break L1;
                } else {
                  var5_int = param3[0].field_r;
                  var6 = param3[2].field_r;
                  var7 = param3[1].field_r;
                  param3[0].c(param2, param0);
                  param3[2].c(-var6 + (param2 + param4), param0);
                  sb.a(q.field_i);
                  sb.g(var5_int + param2, param0, param2 - -param4 - var6, param3[1].field_s + param0);
                  var8 = param2 - -var5_int;
                  var9 = -var6 + param2 + param4;
                  param2 = var8;
                  L2: while (true) {
                    if (param2 >= var9) {
                      sb.b(q.field_i);
                      break L0;
                    } else {
                      param3[1].c(param2, param0);
                      param2 = param2 + var7;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("k.C(").append(param0).append(',').append(true).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param4 + ')');
        }
    }

    final static boolean a(char param0) {
        if (param0 < 65) {
          if (param0 >= 97) {
            if (param0 <= 122) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          if (90 < param0) {
            if (param0 >= 97) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_e = "Loading sound effects";
    }
}

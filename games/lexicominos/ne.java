/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static wf field_a;
    static char[] field_d;
    static db[] field_b;
    static boolean field_e;
    static boolean field_c;

    final static boolean a(byte param0, char param1) {
        if (param0 >= 31) {
          if (param1 >= 48) {
            if (57 < param1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_d = (char[]) null;
          if (param1 >= 48) {
            if (57 < param1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 338) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static String a(char param0, String param1, String param2, byte param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              var5 = param1.length();
              var6 = var4_int;
              var7 = var5 + -1;
              if (0 != var7) {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param2.indexOf((int) param0, var8_int);
                  if (-1 >= (var8_int ^ -1)) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param3 <= -123) {
                break L3;
              } else {
                field_b = (db[]) null;
                break L3;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param2.indexOf((int) param0, var9);
              if (var10 < 0) {
                discarded$0 = var8.append(param2.substring(var9));
                stackIn_13_0 = var8.toString();
                break L0;
              } else {
                discarded$1 = var8.append(param2.substring(var9, var10));
                discarded$2 = var8.append(param1);
                var9 = var10 + 1;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("ne.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ')');
        }
        return stackIn_13_0;
    }

    static {
        field_d = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_c = true;
        field_a = new wf((byte[]) null);
    }
}

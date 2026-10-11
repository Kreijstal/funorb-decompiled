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
        if (param0 < 31) {
          field_d = (char[]) null;
          if (param1 < 48) {
            return false;
          }
          if (57 >= param1) {
            return true;
          }
          return false;
        }
        if (param1 < 48) {
          return false;
        }
        if (57 >= param1) {
          return true;
        }
        return false;
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
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          var4_int = param2.length();
          var5 = param1.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (0 != var7) {
            var8_int = 0;
            while (true) {
              var8_int = param2.indexOf((int) param0, var8_int);
              if (var8_int < 0) {
                break;
              }
              var6 = var6 + var7;
              var8_int++;
            }
          }
          if (param3 > -123) {
            field_b = (db[]) null;
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param2.indexOf((int) param0, var9);
            if (var10 < 0) {
              discarded$0 = var8.append(param2.substring(var9));
              stackIn_13_0 = var8.toString();
              return stackIn_13_0;
            }
            discarded$1 = var8.append(param2.substring(var9, var10));
            discarded$2 = var8.append(param1);
            var9 = var10 + 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("ne.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_d = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_c = true;
        field_a = new wf((byte[]) null);
    }
}

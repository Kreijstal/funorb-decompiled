/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aea {
    static int field_a;
    static int field_b;
    private static String field_z;

    final static byte a(int param0, char param1) {
        int stackIn_3_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        try {
          if (param0 >= -118) {
            stackIn_3_0 = 32;
            return (byte) stackIn_3_0;
          }
          {
            if ((param1 <= 0 ||
              param1 >= 128) &&
              (param1 < 160 ||
              param1 > 255)) {
              if (param1 == 8364) {
                var2_int = -128;
              } else if (param1 == 8218) {
                var2_int = -126;
              } else if (402 == param1) {
                var2_int = -125;
              } else if (8222 == param1) {
                var2_int = -124;
              } else if (8230 == param1) {
                var2_int = -123;
              } else if (param1 == 8224) {
                var2_int = -122;
              } else if (8225 == param1) {
                var2_int = -121;
              } else if (param1 == 710) {
                var2_int = -120;
              } else if (param1 == 8240) {
                var2_int = -119;
              } else if (param1 == 352) {
                var2_int = -118;
              } else if (param1 == 8249) {
                var2_int = -117;
              } else if (param1 == 338) {
                var2_int = -116;
              } else if (381 == param1) {
                var2_int = -114;
              } else if (8216 == param1) {
                var2_int = -111;
              } else if (param1 == 8217) {
                var2_int = -110;
              } else if (param1 == 8220) {
                var2_int = -109;
              } else if (param1 == 8221) {
                var2_int = -108;
              } else if (param1 == 8226) {
                var2_int = -107;
              } else if (param1 == 8211) {
                var2_int = -106;
              } else if (param1 == 8212) {
                var2_int = -105;
              } else if (732 == param1) {
                var2_int = -104;
              } else if (param1 == 8482) {
                var2_int = -103;
              } else if (param1 == 353) {
                var2_int = -102;
              } else if (param1 == 8250) {
                var2_int = -101;
              } else if (param1 == 339) {
                var2_int = -100;
              } else if (382 == param1) {
                var2_int = -98;
              } else if (param1 != 376) {
                var2_int = 63;
              } else {
                var2_int = -97;
              }
            } else {
              var2_int = (byte)param1;
            }
          }
          stackIn_67_0 = var2_int;
          return (byte) stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), field_z + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_z = "aea.A(";
        field_b = 600;
        field_a = 0;
    }
}

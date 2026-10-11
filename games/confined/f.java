/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static String field_b;
    static String field_a;
    static String field_c;

    final static nf[] a(int param0, nf[] param1, int param2) {
        int var4 = 0;
        nf[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        nf[] var6 = null;
        nf[] stackIn_3_0 = null;
        nf[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          if (param0 != 8364) {
            stackIn_3_0 = (nf[]) null;
            return stackIn_3_0;
          }
          var6 = new nf[param1.length];
          var3 = var6;
          for (var4 = 0; var4 < param1.length; var4++) {
            var6[var4] = new nf(160, 94);
            var6[var4].d();
            param1[var4].a(param1[var4].field_t << 3, param1[var4].field_x << 3, 1280, 752, 0, 655360 / param2);
          }
          pi.field_S.a((byte) 110);
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("f.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -12435) {
          nf[] var2 = (nf[]) null;
          f.a(-105, (nf[]) null, 93);
        }
    }

    final static byte a(char param0, int param1) {
        int var2;
        int var3;
        var3 = Confined.field_J ? 1 : 0;
        if (param1 != -8483) {
          field_b = (String) null;
        }
        {
          if ((param0 <= 0 ||
            param0 >= 128) &&
            (param0 < 160 ||
            255 < param0)) {
            if (8364 == param0) {
              var2 = -128;
            } else if (param0 == 8218) {
              var2 = -126;
            } else if (param0 == 402) {
              var2 = -125;
            } else if (param0 == 8222) {
              var2 = -124;
            } else if (param0 == 8230) {
              var2 = -123;
            } else if (8224 == param0) {
              var2 = -122;
            } else if (param0 == 8225) {
              var2 = -121;
            } else if (param0 == 710) {
              var2 = -120;
            } else if (param0 == 8240) {
              var2 = -119;
            } else if (param0 == 352) {
              var2 = -118;
            } else if (8249 == param0) {
              var2 = -117;
            } else if (param0 == 338) {
              var2 = -116;
            } else if (381 == param0) {
              var2 = -114;
            } else if (param0 == 8216) {
              var2 = -111;
            } else if (param0 == 8217) {
              var2 = -110;
            } else if (param0 == 8220) {
              var2 = -109;
            } else if (param0 == 8221) {
              var2 = -108;
            } else if (8226 == param0) {
              var2 = -107;
            } else if (param0 == 8211) {
              var2 = -106;
            } else if (param0 == 8212) {
              var2 = -105;
            } else if (param0 == 732) {
              var2 = -104;
            } else if (param0 == 8482) {
              var2 = -103;
            } else if (param0 == 353) {
              var2 = -102;
            } else if (8250 == param0) {
              var2 = -101;
            } else if (param0 == 339) {
              var2 = -100;
            } else if (param0 == 382) {
              var2 = -98;
            } else if (param0 == 376) {
              var2 = -97;
            } else {
              var2 = 63;
            }
          } else {
            var2 = (byte)param0;
          }
        }
        return (byte) var2;
    }

    static {
        field_a = "Visit the Account Management section on the main site to view.";
        field_c = "Names cannot start or end with space or underscore";
        field_b = "You already have the lightning cannon";
    }
}

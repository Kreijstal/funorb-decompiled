/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    private boolean field_d;
    private String field_i;
    static rk field_h;
    static hl[] field_e;
    static String field_g;
    static rk field_c;
    static hl field_b;
    static String field_f;
    static hl[] field_a;

    final static boolean a(int param0) {
        int var2 = 0;
        va var1 = null;
        RuntimeException var1_ref = null;
        va var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (va) (ee.field_a.c(-3905));
          var1 = var3;
          if (var1 == null) {
            return false;
          }
          for (var2 = param0; var2 < var1.field_n; var2++) {
            if (null != var3.field_p[var2] &&
              var3.field_p[var2].field_b == 0) {
              return false;
            }
            if (null != var3.field_i[var2] &&
              var3.field_i[var2].field_b == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "ma.F(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        ba.a(false, param0, param1 ^ 2);
        if (param1 != 0) {
          ma.a(-10);
        }
    }

    final boolean c(int param0) {
        if (param0 != 0) {
          field_f = (String) null;
        }
        return this.field_d;
    }

    final static byte a(int param0, char param1) {
        int var2;
        if (param0 > -126) {
          ma.a(100);
        }
        {
          if ((param1 <= 0 ||
            param1 >= 128) &&
            (param1 < 160 ||
            param1 > 255)) {
            if (param1 == 8364) {
              var2 = -128;
            } else if (param1 == 8218) {
              var2 = -126;
            } else if (402 == param1) {
              var2 = -125;
            } else if (param1 == 8222) {
              var2 = -124;
            } else if (8230 == param1) {
              var2 = -123;
            } else if (param1 == 8224) {
              var2 = -122;
            } else if (param1 == 8225) {
              var2 = -121;
            } else if (param1 == 710) {
              var2 = -120;
            } else if (param1 == 8240) {
              var2 = -119;
            } else if (352 == param1) {
              var2 = -118;
            } else if (8249 == param1) {
              var2 = -117;
            } else if (338 == param1) {
              var2 = -116;
            } else if (param1 == 381) {
              var2 = -114;
            } else if (param1 == 8216) {
              var2 = -111;
            } else if (param1 == 8217) {
              var2 = -110;
            } else if (param1 == 8220) {
              var2 = -109;
            } else if (param1 == 8221) {
              var2 = -108;
            } else if (param1 == 8226) {
              var2 = -107;
            } else if (param1 == 8211) {
              var2 = -106;
            } else if (param1 == 8212) {
              var2 = -105;
            } else if (param1 == 732) {
              var2 = -104;
            } else if (param1 == 8482) {
              var2 = -103;
            } else if (353 == param1) {
              var2 = -102;
            } else if (param1 == 8250) {
              var2 = -101;
            } else if (param1 == 339) {
              var2 = -100;
            } else if (param1 == 382) {
              var2 = -98;
            } else if (param1 != 376) {
              var2 = 63;
            } else {
              var2 = -97;
            }
          } else {
            var2 = (byte)param1;
          }
        }
        return (byte) var2;
    }

    public static void a(byte param0) {
        field_h = null;
        int var1 = -110 / ((8 - param0) / 57);
        field_c = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_g = null;
    }

    final String b(int param0) {
        int var2 = 41 / ((59 - param0) / 58);
        return this.field_i;
    }

    ma(String param0, boolean param1) {
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_i = param0;
          if (null == this.field_i) {
            this.field_i = "";
          }
          stackIn_6_1 = (param1);
          this.field_d = stackIn_6_1;
          if (0 == this.field_i.length()) {
            this.field_d = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ma.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, int param1, float param2) {
        if (param1 != -13923) {
          return;
        }
        try {
          o.field_b = param0;
          nb.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ma.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    ma(String param0) {
        this(param0, false);
    }

    static {
        field_h = new rk();
        field_g = "Retry";
        field_f = "Orb points: <%0>";
    }
}

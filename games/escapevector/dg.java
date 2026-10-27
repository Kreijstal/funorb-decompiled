/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends ah {
    static Sprite field_t;
    private boolean field_q;
    static Sprite field_r;
    private lb field_p;
    static String field_s;
    static al field_o;
    private String field_n;

    final static String c(byte param0) {
        if (param0 > -8) {
          dg.g(7);
        }
        return ca.field_d;
    }

    public static void g(int param0) {
        field_o = null;
        field_s = null;
        if (param0 != 0) {
          dg.c((byte) 98);
        }
        field_t = null;
        field_r = null;
    }

    dg(ul param0, ul param1) {
        super(param0);
        this.field_q = false;
        this.field_n = "";
        try {
          this.field_p = new lb(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final rf a(int param0, String param1) {
        rf stackIn_12_0 = null;
        String stackIn_16_2 = null;
        try {
          if (this.field_p.a(param0, param1) == ob.field_a) {
            rf stackIn_2_0 = ob.field_a;
            return stackIn_2_0;
          }
          if (!param1.equals(this.field_n)) {
            d var3 = ja.a(param1, true);
            if (!var3.b(0)) {
              rf stackIn_7_0 = ug.field_c;
              return stackIn_7_0;
            }
            this.field_n = param1;
            this.field_q = var3.c(param0 + 14669);
          }
          if (this.field_q) {
            stackIn_12_0 = df.field_h;
          } else {
            stackIn_12_0 = ob.field_a;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var3_ref;
          StringBuilder stackIn_15_1 = new StringBuilder().append("dg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        String stackIn_13_2 = null;
        try {
          if (this.field_p.a(-1, param1) == ob.field_a) {
            String stackIn_3_0 = this.field_p.a((byte) -53, param1);
            return stackIn_3_0;
          }
          if (this.a(-1, param1) == ob.field_a) {
            String stackIn_7_0 = wa.field_a;
            return stackIn_7_0;
          }
          int var3_int = -120 % ((param0 - 10) / 51);
          String stackIn_9_0 = ec.field_c;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3;
          StringBuilder stackIn_12_1 = new StringBuilder().append("dg.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2, CharSequence param3, byte[] param4, int param5) {
        String stackIn_72_2 = null;
        String stackIn_75_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          int var6_int = -param5 + param0;
          int var7 = 0;
          if (param2 != 19409) {
            dg.c((byte) -94);
          }
          while (var6_int > var7) {
            {
              int var8 = param3.charAt(param5 + var7);
              if ((var8 <= 0 ||
                var8 >= 128) && (160 > var8 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param4[var7 + param1] = (byte)-128;
                    break;
                  case 8218:
                    param4[param1 + var7] = (byte)-126;
                    break;
                  case 402:
                    param4[var7 + param1] = (byte)-125;
                    break;
                  case 8222:
                    param4[param1 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param4[param1 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param4[var7 + param1] = (byte)-122;
                    break;
                  case 8225:
                    param4[var7 + param1] = (byte)-121;
                    break;
                  case 710:
                    param4[var7 + param1] = (byte)-120;
                    break;
                  case 8240:
                    param4[var7 + param1] = (byte)-119;
                    break;
                  case 352:
                    param4[var7 + param1] = (byte)-118;
                    break;
                  case 8249:
                    param4[param1 + var7] = (byte)-117;
                    break;
                  case 338:
                    param4[param1 + var7] = (byte)-116;
                    break;
                  case 381:
                    param4[param1 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param4[param1 + var7] = (byte)-111;
                    break;
                  case 8217:
                    param4[param1 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param4[var7 + param1] = (byte)-109;
                    break;
                  case 8221:
                    param4[var7 + param1] = (byte)-108;
                    break;
                  case 8226:
                    param4[var7 + param1] = (byte)-107;
                    break;
                  case 8211:
                    param4[var7 + param1] = (byte)-106;
                    break;
                  case 8212:
                    param4[param1 + var7] = (byte)-105;
                    break;
                  case 732:
                    param4[param1 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param4[var7 + param1] = (byte)-103;
                    break;
                  case 353:
                    param4[var7 + param1] = (byte)-102;
                    break;
                  case 8250:
                    param4[param1 + var7] = (byte)-101;
                    break;
                  case 339:
                    param4[param1 + var7] = (byte)-100;
                    break;
                  case 382:
                    param4[var7 + param1] = (byte)-98;
                    break;
                  case 376:
                    param4[var7 + param1] = (byte)-97;
                    break;
                  default:
                    param4[var7 + param1] = (byte)63;
                    break;
                }
              } else {
                param4[param1 + var7] = (byte)var8;
              }
            }
            var7++;
          }
          int stackIn_68_0 = var6_int;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_71_0 = var6;
          StringBuilder stackIn_71_1 = new StringBuilder().append("dg.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          StringBuilder stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_s = "Fuel bonus: ";
        field_o = new al();
    }
}

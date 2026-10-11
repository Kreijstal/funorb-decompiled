/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends rm {
    static go field_I;
    static double field_L;
    static String field_J;
    static qi field_G;
    static ah field_H;
    static oa field_K;

    private sj(String param0, tb param1) {
        this(param0, pc.field_b.field_p, param1);
        try {
          this.field_l = pc.field_b.field_f;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.field_B = !this.field_B ? true : false;
        super.a(param0, param1, param2, param3);
    }

    final static void a(boolean param0, String param1, float param2, int param3) {
        try {
          if (null == be.field_l) {
            be.field_l = new ra(ka.field_b, nl.field_c);
            ka.field_b.a(be.field_l, false);
          }
          be.field_l.a(param2, -84, param0, param1);
          tc.c();
          if (param3 > -88) {
            field_K = (oa) null;
          }
          gb.a(0, true);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "sj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private sj(String param0, dh param1, tb param2) {
        super(param0, param1, param2);
        try {
          this.field_l = pc.field_b.field_f;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -69) {
            field_K = (oa) null;
          }
          var2_int = param0.length;
          var3 = new byte[var2_int];
          bc.a(param0, 0, var3, 0, var2_int);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("sj.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    sj(String param0, tb param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_B = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static byte a(int param0, char param1) {
        int var2;
        int var3;
        int var4;
        {
          var4 = HoldTheLine.field_D;
          var3 = 96 % ((66 - param0) / 37);
          if ((0 >= param1 ||
            param1 >= 128) && (param1 < 160 ||
            param1 > 255)) {
            if (param1 == 8364) {
              var2 = -128;
            } else if (8218 == param1) {
              var2 = -126;
            } else if (402 == param1) {
              var2 = -125;
            } else if (8222 == param1) {
              var2 = -124;
            } else if (param1 == 8230) {
              var2 = -123;
            } else if (param1 == 8224) {
              var2 = -122;
            } else if (param1 == 8225) {
              var2 = -121;
            } else if (param1 == 710) {
              var2 = -120;
            } else if (param1 == 8240) {
              var2 = -119;
            } else if (param1 == 352) {
              var2 = -118;
            } else if (param1 == 8249) {
              var2 = -117;
            } else if (param1 == 338) {
              var2 = -116;
            } else if (param1 == 381) {
              var2 = -114;
            } else if (param1 == 8216) {
              var2 = -111;
            } else if (8217 == param1) {
              var2 = -110;
            } else if (param1 == 8220) {
              var2 = -109;
            } else if (8221 == param1) {
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
            } else if (param1 == 353) {
              var2 = -102;
            } else if (param1 == 8250) {
              var2 = -101;
            } else if (param1 == 339) {
              var2 = -100;
            } else if (382 == param1) {
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

    final static tn a(int param0, int param1) {
        if (param1 != 19923) {
          field_J = (String) null;
        }
        tn var2 = new tn(param0, false);
        return var2;
    }

    public static void a(byte param0) {
        field_J = null;
        if (param0 != 103) {
          byte[] var2 = (byte[]) null;
          sj.a((byte[]) null, (byte) 119);
        }
        field_H = null;
        field_K = null;
        field_G = null;
        field_I = null;
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var4 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        try {
          if (param0 != -103) {
            sj.a(42, 'H');
          }
          var2_int = param1.length();
          var3 = new byte[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param1.charAt(var4);
              if ((var5 <= 0 ||
                var5 >= 128) && (var5 < 160 ||
                var5 > 255)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("sj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    static {
        field_J = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_L = Math.atan2(1.0, 0.0);
    }
}

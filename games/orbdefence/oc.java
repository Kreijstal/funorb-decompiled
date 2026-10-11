/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends vi implements ib {
    static int field_V;
    static e field_M;
    private ga field_S;
    private int field_T;
    static String field_U;

    final void a(ga param0, int param1) {
        if (param1 <= 21) {
          return;
        }
        try {
          this.field_S = param0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "oc.SA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void g(byte param0) {
        vh var1 = (vh) (le.field_a.a((byte) 38));
        if (param0 != -105) {
          return;
        }
        if (var1 == null) {
          throw new IllegalStateException();
        }
        ul.a(var1.field_o, var1.field_p, var1.field_f);
        ul.e(var1.field_m, var1.field_l, var1.field_t, var1.field_g);
        var1.field_o = null;
        ml.field_f.a(-128, var1);
    }

    final static int a(int param0, int param1, vg param2, gj param3) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param3 != null &&
            param3.field_l != null &&
            param2 != null &&
            param2.field_g == param3.field_o) {
            var4_int = param2.field_o.length;
            var5 = param3.field_l[param0].length / var4_int;
            if (param1 != -1) {
              oc.a('o', -125);
            }
            for (var6 = 0; var6 < var5; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (~param3.field_p[param0][var6] == ~param2.field_h &&
                fc.a((byte) -16, param3.field_i[param0][var6])) {
                for (var7 = 0; var7 < var4_int; var7++) {
                  if (param3.field_l[param0][var6 * var4_int + var7] != param2.field_o[var7]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_22_0 = var6;
                  return stackIn_22_0;
                }
              }
            }
            stackIn_25_0 = -1;
            return stackIn_25_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("oc.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static byte a(int param0, char param1) {
        int var2;
        int var3;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (param0 >= -103) {
          return (byte) 79;
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
            } else if (param1 == 402) {
              var2 = -125;
            } else if (8222 == param1) {
              var2 = -124;
            } else if (8230 == param1) {
              var2 = -123;
            } else if (param1 == 8224) {
              var2 = -122;
            } else if (param1 == 8225) {
              var2 = -121;
            } else if (710 == param1) {
              var2 = -120;
            } else if (param1 == 8240) {
              var2 = -119;
            } else if (param1 == 352) {
              var2 = -118;
            } else if (param1 == 8249) {
              var2 = -117;
            } else if (338 == param1) {
              var2 = -116;
            } else if (param1 == 381) {
              var2 = -114;
            } else if (param1 == 8216) {
              var2 = -111;
            } else if (8217 == param1) {
              var2 = -110;
            } else if (8220 == param1) {
              var2 = -109;
            } else if (param1 == 8221) {
              var2 = -108;
            } else if (param1 == 8226) {
              var2 = -107;
            } else if (param1 == 8211) {
              var2 = -106;
            } else if (param1 == 8212) {
              var2 = -105;
            } else if (732 == param1) {
              var2 = -104;
            } else if (param1 == 8482) {
              var2 = -103;
            } else if (param1 == 353) {
              var2 = -102;
            } else if (8250 == param1) {
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

    public final ga a(byte param0) {
        int var2 = -126 % ((-54 - param0) / 41);
        return this.field_S;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          if (0 < param0 &&
            param0 < 128) {
            return true;
          }
          if (160 <= param0 &&
            param0 <= 255) {
            return true;
          }
          if (param0 != param1) {
            var6 = fe.field_a;
            var2 = var6;
            var3 = 0;
            while (var6.length > var3) {
              var4 = var6[var3];
              if (var4 != param0) {
                var3++;
                continue;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "oc.KA(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        if (param0 > -120) {
          oc.a(93, '￭');
        }
        super.c((byte) -127);
        if (this.field_S != null) {
          this.field_S.b(-20959);
        }
    }

    final String g(int param0) {
        if (param0 != -8235) {
          this.g(83);
        }
        if (!this.field_t) {
          return null;
        }
        if (null == this.field_i) {
          return null;
        }
        dm.a(1, this.field_m - this.field_T + ua.field_a, vl.field_d);
        return this.field_i;
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_T = ua.field_a - (this.field_s + param2);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "oc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    oc(String param0, ag param1, int param2) {
        super(param0, param1, param2);
    }

    public static void q(int param0) {
        if (param0 <= 85) {
          gj var2 = (gj) null;
          oc.a(-84, -74, (vg) null, (gj) null);
        }
        field_U = null;
        field_M = null;
    }

    final static byte[] a(boolean param0, CharSequence param1) {
        byte[] stackIn_3_0 = null;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = new byte[var2_int];
          var4 = 0;
          if (!param0) {
            stackIn_3_0 = (byte[]) null;
            return stackIn_3_0;
          }
          while (var2_int > var4) {
            {
              var5 = param1.charAt(var4);
              if ((0 >= var5 ||
                128 <= var5) && (var5 < 160 ||
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
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
            var4++;
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("oc.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    static {
        field_M = new e();
        field_U = "(Including <%0>)";
    }
}

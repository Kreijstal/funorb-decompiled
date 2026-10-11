/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends rl implements nd {
    static String field_Q;
    private int field_R;
    static le field_T;
    static int[] field_U;
    static db field_S;
    private ma field_V;
    static he field_P;

    cl(String param0, vd param1, int param2) {
        super(param0, param1, param2);
    }

    final static boolean a(sh param0, sh param1, sh param2, byte param3) {
        RuntimeException var4 = null;
        sh var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 117) {
            var5 = (sh) null;
            cl.a((sh) null, (sh) null, (sh) null, (byte) -3);
          }
          if (param1.c(89) &&
            param1.a("commonui", 10762)) {
            if (param2.c(-53) &&
              param2.a("commonui", 10762)) {
              if (param0.c(74) &&
                param0.a("button.gif", 10762)) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("cl.W(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, String param1, String param2) {
        try {
          if (param0 != 41) {
            th var4 = (th) null;
            cl.a((th) null, -73);
          }
          if (jj.field_a != null) {
            jj.field_a.g(true);
          }
          eb.field_b = new ti(param2, param1, false, true, true);
          di.field_x.b(120, eb.field_b);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "cl.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static nj[] a(th param0, int param1) {
        int var5 = 0;
        nj[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        nj[] var4 = null;
        nj var6 = null;
        int var6_int = 0;
        int var7 = 0;
        String var8 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          var2_int = param0.g(8, 26527);
          if (var2_int > 0) {
            return null;
          }
          var3 = param0.g(12, 26527);
          if (param1 >= -81) {
            var8 = (String) null;
            cl.a((byte) 101, (String) null, (String) null);
          }
          var4 = new nj[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (hl.a(true, param0)) {
              var6 = new nj();
              param0.g(24, 26527);
              param0.g(24, 26527);
              var6.field_c = param0.g(24, 26527);
              param0.g(9, 26527);
              param0.g(12, 26527);
              param0.g(12, 26527);
              param0.g(12, 26527);
              var4[var5] = var6;
            } else {
              var6_int = param0.g(dd.a((byte) 34, var5 - 1), 26527);
              var4[var5] = var4[var6_int];
            }
          }
          stackIn_13_0 = var4;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("cl.V(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void o(int param0) {
        field_S = null;
        field_U = null;
        field_Q = null;
        if (param0 >= -45) {
          return;
        }
        field_P = null;
        field_T = null;
    }

    final void f(boolean param0) {
        super.f(param0);
        if (this.field_V != null) {
          this.field_V.a(true);
        }
    }

    final String b(int param0) {
        if (param0 <= 121) {
          w var3 = (w) null;
          this.a((byte) 68, (w) null, 113, 107);
        }
        if (!this.field_m) {
          return null;
        }
        if (this.field_q == null) {
          return null;
        }
        ta.a(sh.field_e, 112, bk.field_b + this.field_j - this.field_R);
        return this.field_q;
    }

    final static sh a(boolean param0, byte param1, boolean param2, int param3, int param4) {
        int var5 = -35 % ((46 - param1) / 55);
        return il.a(param0, 12317, false, param3, param2, param4);
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
        th var7 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          var2_int = param1.length();
          if (param0 != -98) {
            var7 = (th) null;
            cl.a((th) null, -87);
          }
          var3 = new byte[var2_int];
          for (var4 = 0; var2_int > var4; var4++) {
            {
              var5 = param1.charAt(var4);
              if ((0 >= var5 ||
                var5 >= 128) && (160 > var5 ||
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
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("cl.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    final static int p(int param0) {
        if (param0 >= -122) {
          return 47;
        }
        return (int)(1000000000L / ca.field_h);
    }

    public final ma a(byte param0) {
        int var2 = -48 / ((param0 - 56) / 36);
        return this.field_V;
    }

    final void a(ma param0, byte param1) {
        try {
          if (param1 != 23) {
            cl.o(-17);
          }
          this.field_V = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "cl.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, w param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_R = -this.field_t + (bk.field_b - param3);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "cl.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_U = new int[8192];
        field_Q = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_S = new db(311, 450);
    }
}

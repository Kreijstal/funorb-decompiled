/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    String field_g;
    kk field_c;
    String field_f;
    String field_b;
    int field_h;
    static ba field_d;
    static String field_e;
    static kk field_a;

    final static void a(java.awt.Frame param0, byte param1, uf param2) {
        ce var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          if (param1 != -105) {
            sg.a(97, 56, -128, -60, -109, -37);
          }
          while (true) {
            var3 = param2.a(param0, -59);
            while (var3.field_f == 0) {
              wl.a(10L, false);
            }
            if (var3.field_f != 1) {
              wl.a(100L, false);
              continue;
            }
            break;
          }
          param0.setVisible(false);
          param0.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("sg.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ti.field_j[oe.field_c] = param1;
        lf.field_Y[oe.field_c] = oe.field_c;
        if (param5 != -733) {
          return;
        }
        g.field_u[oe.field_c] = param4;
        if (vi.field_d < param4) {
          sd.field_b = param4;
        }
        if (!(fj.field_U <= param4)) {
          mj.field_d = param4;
        }
        ii.field_q[oe.field_c] = param0;
        qf.field_a[oe.field_c] = param2;
        qi.field_b[oe.field_c] = param3;
        int var6 = param3 + (param2 + param0);
        int var7 = var6 == 0 ? 0 : param0 * 1000 / var6;
        va.field_e[oe.field_c] = var7;
        if (var7 < mj.field_d) {
          mj.field_d = var7;
        }
        oe.field_c = oe.field_c + 1;
        if (var7 > sd.field_b) {
          sd.field_b = var7;
        }
    }

    final static int a(int param0, CharSequence param1, byte[] param2, int param3, int param4, int param5) {
        int var7 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          if (param3 < 68) {
            field_a = (kk) null;
          }
          var6_int = -param4 + param5;
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var8 = param1.charAt(var7 + param4);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                255 < var8)) {
                switch (var8) {
                  case 8364:
                    param2[param0 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param2[param0 + var7] = (byte)-126;
                    break;
                  case 402:
                    param2[param0 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param2[param0 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param2[var7 + param0] = (byte)-123;
                    break;
                  case 8224:
                    param2[var7 + param0] = (byte)-122;
                    break;
                  case 8225:
                    param2[var7 + param0] = (byte)-121;
                    break;
                  case 710:
                    param2[param0 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param2[var7 + param0] = (byte)-119;
                    break;
                  case 352:
                    param2[param0 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param2[param0 + var7] = (byte)-117;
                    break;
                  case 338:
                    param2[var7 + param0] = (byte)-116;
                    break;
                  case 381:
                    param2[var7 + param0] = (byte)-114;
                    break;
                  case 8216:
                    param2[param0 + var7] = (byte)-111;
                    break;
                  case 8217:
                    param2[var7 + param0] = (byte)-110;
                    break;
                  case 8220:
                    param2[param0 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param2[param0 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param2[var7 + param0] = (byte)-107;
                    break;
                  case 8211:
                    param2[var7 + param0] = (byte)-106;
                    break;
                  case 8212:
                    param2[var7 + param0] = (byte)-105;
                    break;
                  case 732:
                    param2[param0 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param2[param0 + var7] = (byte)-103;
                    break;
                  case 353:
                    param2[param0 + var7] = (byte)-102;
                    break;
                  case 8250:
                    param2[param0 + var7] = (byte)-101;
                    break;
                  case 339:
                    param2[param0 + var7] = (byte)-100;
                    break;
                  case 382:
                    param2[var7 + param0] = (byte)-98;
                    break;
                  default:
                    param2[var7 + param0] = (byte)63;
                    break;
                  case 376:
                    param2[param0 + var7] = (byte)-97;
                    break;
                }
              } else {
                param2[var7 + param0] = (byte)var8;
              }
            }
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("sg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param2 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private sg() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != -8217) {
          sg.a(-34);
        }
        field_a = null;
    }

    static {
        field_d = new ba();
        field_e = "Return to game";
    }
}

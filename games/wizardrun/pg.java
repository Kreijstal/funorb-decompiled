/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends wl {
    static int[] field_r;
    private int field_l;
    private int field_m;
    static boolean field_q;
    static int field_j;
    private int field_i;
    private int field_p;
    private int field_o;
    static int field_n;
    private int field_k;

    final static int d(byte param0) {
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = wizardrun.field_H;
        try {
          var1_int = 0;
          var2 = 0;
          while (ae.a(-121)) {
            ga.field_d.a(46);
            if (ga.field_d.b(-1)) {
              var1_int = 1;
            }
            if (vk.field_r != 13) {
              continue;
            }
            var2 = 1;
          }
          ga.field_d.a(rb.a(-578629823, field_n, fi.field_B), 83, rb.a(-578629823, tf.field_e, dh.field_b));
          if (ga.field_d.b(param0 + 47)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            ga.field_d.field_g >= 0) {
            var3 = h.field_s[ga.field_d.field_g];
            if (var3 == 2 ||
              var3 == 5) {
              sg.a((byte) 64);
            }
          } else {
            if (var2 != 0 &&
              oc.field_d != 2) {
              sg.a((byte) 64);
            }
          }
          if (param0 != -48) {
            stackIn_23_0 = -11;
            return stackIn_23_0;
          }
          if (var3 == 0 &&
            oc.field_d == 2) {
            var4 = -kh.field_g + d.a((byte) 115);
            var6 = (int)((10999L - var4) / 1000L);
            if (0 >= var6) {
              var3 = 2;
              le.a(true, 5, 15991);
            }
          }
          stackIn_29_0 = var3;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "pg.F(" + param0 + ')');
        }
    }

    final static void a(long param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            Thread.sleep(param0);
            if (param1 != 2) {
              field_n = -55;
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, byte[] param1, int param2, CharSequence param3, int param4, int param5) {
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
        var9 = wizardrun.field_H;
        try {
          var6_int = param5 - param2;
          for (var7 = 0; var6_int > var7; var7++) {
            {
              var8 = param3.charAt(param2 + var7);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                255 < var8)) {
                switch (var8) {
                  case 8364:
                    param1[param4 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param1[param4 + var7] = (byte)-126;
                    break;
                  case 402:
                    param1[param4 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param1[var7 + param4] = (byte)-124;
                    break;
                  case 8230:
                    param1[var7 + param4] = (byte)-123;
                    break;
                  case 8224:
                    param1[var7 + param4] = (byte)-122;
                    break;
                  case 8225:
                    param1[var7 + param4] = (byte)-121;
                    break;
                  case 710:
                    param1[var7 + param4] = (byte)-120;
                    break;
                  case 8240:
                    param1[param4 + var7] = (byte)-119;
                    break;
                  case 352:
                    param1[param4 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param1[param4 + var7] = (byte)-117;
                    break;
                  case 338:
                    param1[var7 + param4] = (byte)-116;
                    break;
                  case 381:
                    param1[param4 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param1[var7 + param4] = (byte)-111;
                    break;
                  case 8217:
                    param1[param4 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param1[param4 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param1[var7 + param4] = (byte)-108;
                    break;
                  case 8226:
                    param1[var7 + param4] = (byte)-107;
                    break;
                  case 8211:
                    param1[var7 + param4] = (byte)-106;
                    break;
                  case 8212:
                    param1[var7 + param4] = (byte)-105;
                    break;
                  case 732:
                    param1[param4 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param1[param4 + var7] = (byte)-103;
                    break;
                  case 353:
                    param1[var7 + param4] = (byte)-102;
                    break;
                  case 8250:
                    param1[param4 + var7] = (byte)-101;
                    break;
                  case 339:
                    param1[param4 + var7] = (byte)-100;
                    break;
                  case 382:
                    param1[var7 + param4] = (byte)-98;
                    break;
                  case 376:
                    param1[param4 + var7] = (byte)-97;
                    break;
                  default:
                    param1[var7 + param4] = (byte)63;
                    break;
                }
              } else {
                param1[var7 + param4] = (byte)var8;
              }
            }
          }
          if (param0 != 8220) {
            field_n = -99;
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("pg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0) {
        hg.field_b = null;
        mh.field_ob = null;
        if (param0 != -382) {
          field_j = 3;
        }
    }

    public static void e(byte param0) {
        field_r = null;
        if (param0 != -73) {
          pg.a((byte) -55);
        }
    }

    final static void a(int param0, boolean param1, pg param2) {
        mg var5 = null;
        int var4 = 0;
        try {
          if (!param1) {
            pg.a(122L, 90);
          }
          var5 = n.field_b;
          var5.c((byte) 92, param0);
          var5.field_m = var5.field_m + 1;
          var4 = var5.field_m;
          var5.b((byte) 11, 1);
          var5.b((byte) 11, param2.field_o);
          var5.b((byte) 11, param2.field_m);
          var5.f(param2.field_l, 613003928);
          var5.f(param2.field_i, 613003928);
          var5.f(param2.field_p, 613003928);
          var5.f(param2.field_k, 613003928);
          var5.e(var4, -1182887024);
          var5.a(-var4 + var5.field_m, -117);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "pg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        if (param0 != -97) {
          field_q = false;
        }
        td.field_f.c(new ki(), -123);
    }

    pg(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_k = param5;
        this.field_l = param2;
        this.field_i = param3;
        this.field_m = param1;
        this.field_o = param0;
        this.field_p = param4;
    }

    static {
        field_r = new int[8192];
        field_n = 0;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm extends pn {
    static dl[] field_s;
    private int[] field_w;
    private int[] field_x;
    static mk field_y;
    private int[] field_t;
    private int[] field_v;
    private int[] field_n;
    private int[] field_p;
    private int[] field_q;
    private boolean field_m;
    static String field_r;
    private int[] field_u;
    static String field_o;

    final f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        int var6 = -29 % ((73 - param4) / 42);
        return (f) this;
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            ((fm) this).field_v = null;
        }
        return 3;
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        if (param0 != 16736352) {
            return true;
        }
        return true;
    }

    final boolean e(int param0) {
        if (param0 != -4128) {
            ((fm) this).b(-88, 37, -23, false, -124, 50);
        }
        return true;
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        ((fm) this).field_l = ((fm) this).field_l.a(param0, param1, param2, param3, param4, param5);
        return (f) this;
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        if (param0 != -21) {
            Object var9 = null;
            boolean discarded$0 = ((fm) this).a((byte) 57, (f[][]) null, 69, 76, 55, (fq) null, 64);
            return true;
        }
        return true;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        this.a(param5, false, param1, param2, param4);
        int var7 = 114 / ((74 - param0) / 41);
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        f stackIn_16_0 = null;
        f stackOut_15_0 = null;
        Object stackOut_14_0 = null;
        var7 = CrazyCrystals.field_B;
        ((fm) this).field_m = true;
        var5 = 0;
        var6 = 110 / ((param2 - -43) / 51);
        L0: while (true) {
          if (-25 >= (var5 ^ -1)) {
            L1: {
              if (((fm) this).field_m) {
                stackOut_15_0 = ((fm) this).field_l;
                stackIn_16_0 = stackOut_15_0;
                break L1;
              } else {
                stackOut_14_0 = this;
                stackIn_16_0 = (f) (Object) stackOut_14_0;
                break L1;
              }
            }
            return stackIn_16_0;
          } else {
            if ((((fm) this).field_t[var5] ^ -1) < -1) {
              L2: {
                ((fm) this).field_m = false;
                ((fm) this).field_u[var5] = pf.b(65535, ((fm) this).field_u[var5] - -(((fm) this).field_p[var5] / (((fm) this).field_x[var5] >> -578823480)));
                ((fm) this).field_x[var5] = ((fm) this).field_x[var5] + ((fm) this).field_n[var5];
                ((fm) this).field_q[var5] = ((fm) this).field_q[var5] + ((fm) this).field_w[var5];
                ((fm) this).field_n[var5] = ((fm) this).field_n[var5] - ((fm) this).field_n[var5] / 8;
                ((fm) this).field_w[var5] = ((fm) this).field_w[var5] - ((fm) this).field_w[var5] / 8;
                if (-1 < (((fm) this).field_q[var5] ^ -1)) {
                  ((fm) this).field_q[var5] = -((fm) this).field_q[var5];
                  if (((fm) this).field_w[var5] < 0) {
                    ((fm) this).field_w[var5] = -((fm) this).field_w[var5];
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              ((fm) this).field_w[var5] = ((fm) this).field_w[var5] - 64;
              ((fm) this).field_t[var5] = ((fm) this).field_t[var5] - ((fm) this).field_v[var5];
              if ((((fm) this).field_t[var5] ^ -1) > -1) {
                ((fm) this).field_t[var5] = 0;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    public static void f(int param0) {
        if (param0 > -80) {
            fm.f(-18);
        }
        field_s = null;
        field_o = null;
        field_y = null;
        field_r = null;
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        if (param0) {
            return true;
        }
        return true;
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = CrazyCrystals.field_B;
        if (!param1) {
          var6 = 0;
          L0: while (true) {
            if (24 <= var6) {
              return;
            } else {
              if (0 < ((fm) this).field_t[var6]) {
                var7 = 32768 + (int)((double)((fm) this).field_x[var6] * Math.sin((double)((fm) this).field_u[var6] * 0.00009587379924285257));
                var8 = (int)((double)((fm) this).field_x[var6] * Math.cos((double)((fm) this).field_u[var6] * 0.00009587379924285257)) + 32768;
                var9 = param4 - -(param2 * var7 >> 1635887311);
                var10 = (param3 * (var8 * 2 - ((fm) this).field_q[var6]) >> -386533744) + param0;
                var11 = ((fm) this).field_t[var6] * param2 * param3 / 144;
                var12 = 0;
                L1: while (true) {
                  if (var12 < var11 >> -2074647802) {
                    var13 = var11 + -(var12 << -1957406586);
                    var14 = var13 << -896437897 >> 660792735;
                    var13 = (var14 ^ var13) & 255;
                    var15 = var14 ^ dc.field_J[var6 & 3];
                    var16 = 16711935 & (var15 & 16711935) * var13 >> 551352680;
                    var17 = 65280 & var13 * (var15 & 65280) >> 340333800;
                    var15 = var14 ^ (var16 | var17);
                    kh.b(-var12 + var9, var10, var15);
                    if (0 < var12) {
                      kh.b(var12 + var9, var10, var15);
                      kh.b(var9, -var12 + var10, var15);
                      kh.b(var9, var12 + var10, var15);
                      var12++;
                      continue L1;
                    } else {
                      var12++;
                      continue L1;
                    }
                  } else {
                    var6++;
                    continue L0;
                  }
                }
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 <= 43) {
            boolean discarded$0 = ((fm) this).e(99);
            return true;
        }
        return true;
    }

    final int a(boolean param0) {
        if (param0) {
            return 67;
        }
        return ((fm) this).field_l.a(param0);
    }

    final int b(int param0) {
        if (param0 != -3445) {
            return -25;
        }
        return ((fm) this).field_l.b(-3445);
    }

    fm(f param0) {
        super(param0);
        int var2 = 0;
        int var3 = 0;
        ((fm) this).field_x = new int[24];
        ((fm) this).field_v = new int[24];
        ((fm) this).field_w = new int[24];
        ((fm) this).field_t = new int[24];
        ((fm) this).field_p = new int[24];
        ((fm) this).field_m = false;
        ((fm) this).field_n = new int[24];
        ((fm) this).field_q = new int[24];
        ((fm) this).field_u = new int[24];
        for (var2 = 0; var2 < 24; var2++) {
            ((fm) this).field_u[var2] = (int)(65536.0 * Math.random());
            ((fm) this).field_x[var2] = 6144;
            ((fm) this).field_q[var2] = 32768;
            ((fm) this).field_p[var2] = (int)(Math.random() * 524288.0);
            ((fm) this).field_n[var2] = (int)(Math.random() * 3084.0);
            ((fm) this).field_w[var2] = (int)(-4096.0 + Math.random() * 8192.0);
            ((fm) this).field_t[var2] = 127;
            var3 = (int)Math.pow(4.0, 1.0 + Math.random());
            ((fm) this).field_v[var2] = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new mk();
        field_r = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_o = "This game has been updated! Please reload this page.";
    }
}

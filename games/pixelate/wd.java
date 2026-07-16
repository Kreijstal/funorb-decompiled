/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static String field_h;
    static String field_e;
    private int field_a;
    static int[] field_d;
    private int field_f;
    private int[] field_j;
    static String field_g;
    static int[] field_i;
    static String field_b;
    private boolean field_c;

    final static int a(int param0, int param1, int param2) {
        int var4 = Pixelate.field_H ? 1 : 0;
        int var3 = 1;
        if (param0 <= 102) {
            return 73;
        }
        while (-2 > (param1 ^ -1)) {
            if (-1 != (param1 & 1 ^ -1)) {
                var3 = var3 * param2;
            }
            param2 = param2 * param2;
            param1 = param1 >> 1;
        }
        if (!(1 != param1)) {
            return param2 * var3;
        }
        return var3;
    }

    final void a(byte param0, int param1) {
        L0: {
          if ((param1 ^ -1) > -1) {
            break L0;
          } else {
            if (param1 > ((wd) this).field_a) {
              break L0;
            } else {
              if (param0 == -84) {
                L1: {
                  if (((wd) this).field_a == param1) {
                    break L1;
                  } else {
                    qb.a(((wd) this).field_j, 1 + param1, ((wd) this).field_j, param1, -param1 + ((wd) this).field_a);
                    break L1;
                  }
                }
                ((wd) this).field_a = ((wd) this).field_a - 1;
                return;
              } else {
                return;
              }
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    private final void a(int param0, byte param1, int param2) {
        if (((wd) this).field_a < param0) {
            ((wd) this).field_a = param0;
        }
        if (!(param0 < ((wd) this).field_j.length)) {
            this.a(-114, param0);
        }
        ((wd) this).field_j[param0] = param2;
        int var4 = -53 / ((-28 - param1) / 42);
    }

    final int c(int param0, int param1) {
        if (param1 >= -50) {
            field_d = null;
        }
        if (((wd) this).field_a < param0) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return ((wd) this).field_j[param0];
    }

    final static int b(int param0, int param1) {
        if (param1 != 0) {
            return -64;
        }
        return ja.field_h[param0 & 2047];
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = Pixelate.field_H ? 1 : 0;
          if (param1 < -108) {
            break L0;
          } else {
            field_i = null;
            break L0;
          }
        }
        var11 = -param3;
        L1: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = param7 + param5;
            L2: while (true) {
              if (var12 <= param5) {
                param5 = param5 + param8;
                param6 = param6 + param4;
                var11++;
                continue L1;
              } else {
                if (param0[param5] == 16711935) {
                  int incrementValue$2 = param6;
                  param6++;
                  var10 = param9[incrementValue$2] & 255;
                  int incrementValue$3 = param5;
                  param5++;
                  param0[incrementValue$3] = bq.a(cm.a(var10 * cm.a(param2, 16711935) >> 2001675816, 16711935), cm.a(16711802, var10 * cm.a(param2, 65280)) >> -369981912);
                  continue L2;
                } else {
                  param6++;
                  param5++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static void a(ak param0, boolean param1) {
        ak var5 = null;
        int var3 = Pixelate.field_H ? 1 : 0;
        ak var4 = (ak) (Object) param0.field_L.c(1504642273);
        ak var2 = var4;
        while (var4 != null) {
            var4.field_Z = 0;
            var4.field_wb = 0;
            var4.field_nb = 0;
            var4.field_S = 0;
            var5 = (ak) (Object) param0.field_L.f(1504642273);
            var5 = var5;
        }
        param0.field_wb = 0;
        if (param1) {
            field_d = null;
        }
        param0.field_nb = 0;
        param0.field_S = 0;
        param0.field_Z = 0;
    }

    public static void a(int param0) {
        if (param0 != 1) {
            wd.a(23);
        }
        field_e = null;
        field_h = null;
        field_b = null;
        field_g = null;
        field_i = null;
        field_d = null;
    }

    final void a(boolean param0, int param1) {
        this.a(1 + ((wd) this).field_a, (byte) 41, param1);
        if (!param0) {
            ((wd) this).a((byte) -113, 40);
        }
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        var3 = ((wd) this).field_j.length;
        L0: while (true) {
          if (param0 < var3) {
            if (param1 > 119) {
              return var3;
            } else {
              return -50;
            }
          } else {
            if (!((wd) this).field_c) {
              var3 = var3 + ((wd) this).field_f;
              continue L0;
            } else {
              if (var3 == 0) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((wd) this).field_f;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        int[] var5 = new int[this.a(param1, (byte) 120)];
        int[] var3 = var5;
        int var4 = 66 % ((55 - param0) / 63);
        qb.a(((wd) this).field_j, 0, var5, 0, ((wd) this).field_j.length);
        ((wd) this).field_j = var5;
    }

    final int b(int param0) {
        if (param0 != 1) {
            ((wd) this).a(false, -127);
        }
        return 1 + ((wd) this).field_a;
    }

    private wd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "You cannot add yourself!";
        field_d = new int[256];
        field_i = new int[8192];
        field_g = "Spectate";
        field_e = "Off";
        field_b = "Please wait...";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    private p[] field_a;
    private ob field_i;
    private ar field_e;
    static u field_b;
    private rn field_d;
    private java.math.BigInteger field_g;
    private java.math.BigInteger field_j;
    static qr field_f;
    private tk field_c;
    static int field_h;

    public static void a(byte param0) {
        field_f = null;
        int var1 = -35 / ((param0 - 66) / 45);
        field_b = null;
    }

    final p a(boolean param0, int param1, ua param2, ua param3, boolean param4) {
        if (((tj) this).field_i == null) {
            throw new RuntimeException();
        }
        if (-1 >= (param1 ^ -1)) {
            // if_icmple L34
        } else {
            throw new RuntimeException();
        }
        if (!(null == ((tj) this).field_a[param1])) {
            return ((tj) this).field_a[param1];
        }
        ((tj) this).field_i.field_j = 72 * param1 + 6;
        int var6 = ((tj) this).field_i.a(16711680);
        if (param0) {
            ((tj) this).field_j = null;
        }
        int var7 = ((tj) this).field_i.a(16711680);
        byte[] var11 = new byte[64];
        ((tj) this).field_i.a(64, 0, 17469032, var11);
        p var9 = new p(param1, param3, param2, ((tj) this).field_e, ((tj) this).field_d, var6, var11, var7, param4);
        ((tj) this).field_a[param1] = var9;
        return var9;
    }

    final static bi[] a(boolean param0, int param1, boolean param2, int param3, int param4, byte param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        bi var9 = null;
        bi var10 = null;
        bi var11 = null;
        int[] var12 = null;
        bi var13 = null;
        bi var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var18 = gf.field_h;
          var17 = var18;
          var16 = var17;
          var15 = var16;
          var12 = var15;
          var6 = var12;
          var7 = gf.field_b;
          var8 = gf.field_k;
          var9 = new bi(16, param3);
          var9.e();
          gf.i(0, 0, 16, param3, param4, param1);
          var10 = null;
          if (!param0) {
            break L0;
          } else {
            var13 = var9.g();
            var10 = var13;
            var13.e();
            gf.f(0, 0, 5, 0);
            gf.f(0, 1, 3, 0);
            gf.f(0, 2, 2, 0);
            gf.f(0, 3, 1, 0);
            gf.f(0, 4, 1, 0);
            break L0;
          }
        }
        L1: {
          if (param5 < -22) {
            break L1;
          } else {
            field_b = null;
            break L1;
          }
        }
        L2: {
          var11 = null;
          if (!param2) {
            break L2;
          } else {
            var14 = var9.g();
            var11 = var14;
            var14.e();
            gf.f(11, 0, 5, 0);
            gf.f(13, 1, 3, 0);
            gf.f(14, 2, 2, 0);
            gf.f(15, 3, 1, 0);
            gf.f(15, 4, 1, 0);
            break L2;
          }
        }
        gf.a(var18, var7, var8);
        return new bi[]{null, null, null, var10, var9, var11, null, null, null};
    }

    final static int a(int param0) {
        if (param0 != 0) {
            field_f = null;
        }
        return (int)(1000000000L / vg.field_i);
    }

    tj(ar param0, rn param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(byte param0, int param1, long param2) {
        sl var4 = js.field_f;
        var4.h(param1, 255);
        var4.field_j = var4.field_j + 1;
        int var5 = var4.field_j;
        int var6 = 1 % ((30 - param0) / 59);
        var4.c(6, (byte) -72);
        var4.b(-16426, param2);
        var4.b(-var5 + var4.field_j, (byte) 118);
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null == ((tj) this).field_a) {
          return;
        } else {
          var3 = -3 % ((-53 - param0) / 38);
          var2 = 0;
          L0: while (true) {
            if (((tj) this).field_a.length <= var2) {
              var5 = 0;
              var2 = var5;
              L1: while (true) {
                if (((tj) this).field_a.length <= var5) {
                  return;
                } else {
                  if (null != ((tj) this).field_a[var5]) {
                    ((tj) this).field_a[var5].b(false);
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              if (((tj) this).field_a[var2] != null) {
                ((tj) this).field_a[var2].a((byte) 65);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    final boolean b(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        ob var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != ((tj) this).field_i) {
          return true;
        } else {
          L0: {
            if (null != ((tj) this).field_c) {
              break L0;
            } else {
              if (((tj) this).field_e.c(27356)) {
                return false;
              } else {
                ((tj) this).field_c = ((tj) this).field_e.a(true, 255, (byte) 0, -2057056416, 255);
                break L0;
              }
            }
          }
          if (((tj) this).field_c.field_u) {
            return false;
          } else {
            L1: {
              L2: {
                var10 = new ob(((tj) this).field_c.e((byte) 91));
                var10.field_j = 5;
                var3 = var10.j(-120);
                var10.field_j = var10.field_j + 72 * var3;
                var16 = new byte[-var10.field_j + var10.field_h.length];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(var16.length, 0, 17469032, var16);
                if (null == ((tj) this).field_g) {
                  break L2;
                } else {
                  if (null == ((tj) this).field_j) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((tj) this).field_g, ((tj) this).field_j);
                    var5 = var7_ref.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (var5.length == 65) {
              var17 = dp.a(var10.field_h, -5 + -var16.length + var10.field_j, -26131, 5);
              var7 = 0;
              L3: while (true) {
                if (var7 >= 64) {
                  ((tj) this).field_a = new p[var3];
                  ((tj) this).field_i = var10;
                  if (param0 >= 86) {
                    return true;
                  } else {
                    field_h = -8;
                    return true;
                  }
                } else {
                  if (var5[var7 - -1] != var17[var7]) {
                    throw new RuntimeException();
                  } else {
                    var7++;
                    continue L3;
                  }
                }
              }
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    private tj(ar param0, rn param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((tj) this).field_d = param1;
        ((tj) this).field_j = param3;
        ((tj) this).field_e = param0;
        ((tj) this).field_g = param2;
        if (!((tj) this).field_e.c(27356)) {
            ((tj) this).field_c = ((tj) this).field_e.a(true, 255, (byte) 0, -2057056416, 255);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new u();
    }
}

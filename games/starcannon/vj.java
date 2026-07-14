/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends kc implements ga {
    private dk field_Z;
    static boolean field_X;
    static int field_ab;
    static String field_W;
    static volatile boolean field_Y;
    static boolean field_V;

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
            field_Y = true;
        }
        if (!(param0 != ((vj) this).field_Z)) {
            this.l(-14064);
        }
    }

    final static void a(byte[] param0, int param1, java.math.BigInteger param2, rb param3, int param4, byte param5, java.math.BigInteger param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        L0: {
          var7 = ek.a(23201, param4);
          if (bd.field_e == null) {
            bd.field_e = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var14 = new int[4];
        var13 = var14;
        var12 = var13;
        var11 = var12;
        var8 = var11;
        var9 = 0;
        L1: while (true) {
          if (-5 >= (var9 ^ -1)) {
            L2: {
              if (param5 == 99) {
                break L2;
              } else {
                vj.e(false);
                break L2;
              }
            }
            L3: {
              L4: {
                if (null == dd.field_a) {
                  break L4;
                } else {
                  if (dd.field_a.field_f.length >= var7) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              dd.field_a = new rb(var7);
              break L3;
            }
            L5: {
              L6: {
                dd.field_a.field_g = 0;
                dd.field_a.a(param0, param4, param5 + -20243, param1);
                dd.field_a.a(var7, true);
                dd.field_a.a((byte) -81, var14);
                if (th.field_d == null) {
                  break L6;
                } else {
                  if ((th.field_d.field_f.length ^ -1) <= -101) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              th.field_d = new rb(100);
              break L5;
            }
            th.field_d.field_g = 0;
            th.field_d.a(10, param5 + -224);
            var10 = 0;
            var9 = var10;
            L7: while (true) {
              if (var10 >= 4) {
                th.field_d.c(param4, -306);
                th.field_d.a(param2, param6, param5 + -8498);
                param3.a(th.field_d.field_f, th.field_d.field_g, -20144, 0);
                param3.a(dd.field_a.field_f, dd.field_a.field_g, -20144, 0);
                return;
              } else {
                th.field_d.c((byte) -106, var14[var10]);
                var10++;
                continue L7;
              }
            }
          } else {
            var8[var9] = bd.field_e.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    private final void l(int param0) {
        if (!(((vj) this).field_G)) {
            return;
        }
        ((vj) this).field_G = false;
        if (param0 != -14064) {
            field_ab = 33;
        }
    }

    public static void e(boolean param0) {
        field_W = null;
        if (!param0) {
            field_V = false;
        }
    }

    vj(tc param0, ae param1) {
        super(param0, 200, 150);
        String var3 = null;
        uj var4 = null;
        L0: {
          var3 = null;
          if (param1 == oj.field_j) {
            var3 = wc.field_h;
            break L0;
          } else {
            if (cb.field_d == param1) {
              var3 = kd.field_D;
              ((vj) this).field_f = ((vj) this).field_f + 10;
              if (!wi.a(-10214)) {
                break L0;
              } else {
                var3 = cf.field_m;
                ((vj) this).field_f = ((vj) this).field_f + 20;
                break L0;
              }
            } else {
              if (param1 != wk.field_b) {
                break L0;
              } else {
                var3 = mc.field_a;
                ((vj) this).field_f = ((vj) this).field_f + 30;
                break L0;
              }
            }
          }
        }
        var4 = new uj(var3, (qg) null);
        var4.field_s = 0;
        var4.field_f = 80;
        var4.field_j = 50;
        var4.field_i = ((vj) this).field_i;
        var4.field_o = (de) (Object) new hd(nb.field_b, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((vj) this).a(true, var4);
        ((vj) this).field_Z = this.a(mc.field_e, (qg) this, true);
    }

    private final dk a(String param0, qg param1, boolean param2) {
        dk var4 = new dk(param0, param1);
        var4.field_o = (de) (Object) new gb();
        int var5 = -6 + ((vj) this).field_f;
        ((vj) this).field_f = ((vj) this).field_f + 38;
        var4.a(15, -16 + (((vj) this).field_i + -14), (byte) 124, 30, var5);
        ((vj) this).a(param2, (uj) (Object) var4);
        ((vj) this).d((byte) -30);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = false;
        field_X = false;
        field_W = "Names should contain a maximum of 12 characters";
        field_V = false;
    }
}

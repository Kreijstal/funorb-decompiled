/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tm {
    static vh field_d;
    eg[] field_a;
    static int field_f;
    boolean field_g;
    nc[] field_j;
    dd[] field_e;
    private int[][] field_k;
    static ko field_i;
    static ea field_b;
    static cd field_h;
    static int[] field_c;

    void a(int[] param0, int[] param1, int param2, int param3) {
        ((tm) this).field_j[param2].b(param1, param0);
        if (param3 != -3637) {
            int discarded$0 = ((tm) this).a(-49, false);
        }
    }

    String a(int param0, byte param1) {
        if (param1 <= 108) {
            return null;
        }
        return ((tm) this).a((byte) 102, param0);
    }

    abstract int a(int param0, boolean param1);

    void a(int param0, int param1, int[] param2, int[] param3, boolean param4) {
        if (param0 != -1912602369) {
            return;
        }
        ((tm) this).a(param4, param2, param1, param3, -20263);
        ((tm) this).field_j[param1].b(param3, param2);
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        ((tm) this).field_k = new int[16][];
        if (param0 > -124) {
            ((tm) this).field_j = null;
        }
        for (var2 = 0; var2 < ((tm) this).field_k.length; var2++) {
            ((tm) this).field_k[var2] = ta.a(new int[4], -119);
        }
    }

    final static hj a(int param0, int param1) {
        hj[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hj[] var6 = null;
        var5 = Pool.field_O;
        var6 = lm.a((byte) -32);
        var2 = var6;
        var3 = 0;
        var4 = -81 / ((param1 - -69) / 37);
        L0: while (true) {
          if (var3 < var6.length) {
            if (var6[var3].field_i != param0) {
              var3++;
              continue L0;
            } else {
              return var6[var3];
            }
          } else {
            return null;
          }
        }
    }

    final void a(boolean param0, int[] param1, int param2, int[] param3, int param4) {
        int var13 = 0;
        if (-1 <= (no.field_n[param2] ^ -1)) {
            return;
        }
        int var8 = -param3[2] + param1[2];
        int var6 = param1[0] - param3[0];
        int var7 = param1[1] + -param3[1];
        int var10 = param3[8] * var8 + (param3[7] * var7 + var6 * param3[6]) >> -273628317;
        int var9 = param3[4] * var7 + (param3[3] * var6 + var8 * param3[5]) >> -1680844509;
        if (param4 != -20263) {
            ((tm) this).field_a = null;
        }
        var8 = var8 * param3[11] + param3[9] * var6 - -(var7 * param3[10]) >> 2020877808;
        if (!(-1 > (var8 ^ -1))) {
            return;
        }
        var7 = (qh.field_c + fb.field_d << 563442148) - -(var10 / var8);
        var6 = (qh.field_b - -fb.field_q << -930305852) - -(var9 / var8);
        int var11 = 32 + 589824 / var8;
        int[] var17 = param0 ? ff.field_i : ff.field_h;
        int[] var16 = var17;
        int[] var15 = var16;
        int[] var14 = var15;
        int[] var12 = var14;
        for (var13 = 0; var13 < var17.length; var13++) {
            ff.field_a[var13] = md.a(md.a(rb.b(no.field_n[param2] * rb.b(var17[var13], 65280) >>> 198123656, 973143808), rb.b(-16776974, rb.b(16711680, var17[var13]) * no.field_n[param2]) >>> 377159592), rb.b(-1912602369, no.field_n[param2] * rb.b(255, var17[var13]) >>> 1400849512));
        }
        if (2147483647L > 64L * ((long)var11 * (long)var11)) {
            qh.a(var6, var7, var11, 64, ff.field_a);
        }
    }

    final eg g(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        int var15 = 0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        eg var29 = null;
        L0: {
          var28 = Pool.field_O;
          var29 = new eg((3 + ne.field_v) * (hr.field_b - -1), 2 * (hr.field_b * ne.field_v), ne.field_v);
          if (param0 == -930305852) {
            break L0;
          } else {
            field_h = null;
            break L0;
          }
        }
        var3 = var29.a(-383, -383, 384);
        var4 = var29.a(384, -383, 384);
        var5 = var29.a(-383, 384, 384);
        byte discarded$3 = var29.a((short)var3, (short)var4, (short)var5);
        var6 = 0;
        L1: while (true) {
          if (var6 >= hr.field_b) {
            var29.e();
            return var29;
          } else {
            var7 = Math.cos((double)var6 * 3.141592653589793 / (double)hr.field_b) * 8.0;
            var9 = 8.0 * Math.sin(3.141592653589793 * (double)var6 / (double)hr.field_b);
            var11 = 8.0 * Math.cos((double)(1 + var6) * 3.141592653589793 / (double)hr.field_b);
            var13 = Math.sin((double)(var6 + 1) * 3.141592653589793 / (double)hr.field_b) * 8.0;
            var15 = 0;
            L2: while (true) {
              if (var15 >= ne.field_v) {
                var6++;
                continue L1;
              } else {
                L3: {
                  var16 = Math.cos(3.141592653589793 * (double)(2 * var15) / (double)ne.field_v);
                  var18 = Math.sin(3.141592653589793 * (double)(var15 * 2) / (double)ne.field_v);
                  var20 = Math.cos(3.141592653589793 * (double)(2 + var15 * 2) / (double)ne.field_v);
                  var22 = Math.sin((double)(2 * (var15 - -1)) * 3.141592653589793 / (double)ne.field_v);
                  var24 = var29.a(cr.a(4885, var16 * var9), cr.a(4885, var9 * var18), cr.a(4885, var7));
                  var25 = var29.a(cr.a(4885, var20 * var9), cr.a(param0 + 930310737, var9 * var22), cr.a(param0 ^ -930300975, var7));
                  var26 = var29.a(cr.a(4885, var13 * var16), cr.a(4885, var13 * var18), cr.a(4885, var11));
                  var27 = var29.a(cr.a(4885, var20 * var13), cr.a(4885, var13 * var22), cr.a(4885, var11));
                  if (var24 != var25) {
                    int discarded$4 = var29.a(var24, var26, var25, (byte) 0, (short) 96, this.a(true));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (var26 != var27) {
                  int discarded$5 = var29.a(var27, var25, var26, (byte) 0, (short) 96, this.a(true));
                  var15++;
                  continue L2;
                } else {
                  var15++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void a(int param0) {
        if (((tm) this).field_a != null) {
            ((tm) this).field_j = new nc[((tm) this).field_a.length];
        }
        if (param0 != 7096) {
            ((tm) this).field_k = null;
        }
        this.f(-128);
    }

    public static void d(int param0) {
        field_h = null;
        if (param0 != -22799) {
            field_i = null;
        }
        field_i = null;
        field_b = null;
        field_c = null;
        field_d = null;
    }

    int b(int param0) {
        if (param0 != 384) {
            ((tm) this).field_g = true;
        }
        return ((tm) this).field_j.length;
    }

    void a(int param0, di param1) {
        if (param0 != 198123656) {
            ((tm) this).h(32);
        }
    }

    int[] b(int param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        return ((tm) this).field_k[param0];
    }

    void a(di param0, byte param1) {
        if (param1 != 117) {
            int[] discarded$0 = ((tm) this).b(-29, 80);
        }
    }

    final String a(int param0, sq param1, byte param2) {
        L0: {
          if (param2 == -111) {
            break L0;
          } else {
            ((tm) this).field_k = null;
            break L0;
          }
        }
        if (!(param1 instanceof fj)) {
          if (!((tm) this).c(2)) {
            L1: {
              if (0 == param0) {
                break L1;
              } else {
                if (param0 != 8) {
                  return ((tm) this).a((byte) 33, param0 >> 604778307 & 1);
                } else {
                  break L1;
                }
              }
            }
            return ho.field_u[param0];
          } else {
            return ho.field_u[param0];
          }
        } else {
          return or.field_k[param0];
        }
    }

    void h(int param0) {
        int var2 = -55 % ((29 - param0) / 44);
    }

    abstract String a(byte param0, int param1);

    void a(boolean param0, int[] param1, int param2) {
        if (param0) {
            ((tm) this).field_a = null;
        }
        if (((tm) this).field_g) {
            ((tm) this).field_j[param2] = (nc) (Object) kh.field_gc.a(param1, (byte) 103, ((tm) this).field_a[param2]);
        } else {
            ((tm) this).field_j[param2] = (nc) (Object) kh.field_gc.b(param1, ((tm) this).field_a[param2], -25431);
        }
    }

    final void e(int param0) {
        if (param0 != -26707) {
            Object var3 = null;
            ((tm) this).a(true, (int[]) null, 13, (int[]) null, -85);
        }
    }

    abstract boolean c(int param0);

    private final byte a(boolean param0) {
        if (!param0) {
            return (byte) -68;
        }
        return (byte) 0;
    }

    void a(int param0, al param1) {
        if (param0 != 2147483647) {
            ((tm) this).field_j = null;
        }
    }

    tm() {
        ((tm) this).field_g = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ko();
        field_b = null;
        field_h = new cd();
    }
}

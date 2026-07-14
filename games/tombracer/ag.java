/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag implements iq {
    private int field_c;
    private int field_j;
    private int field_d;
    private int field_a;
    private int field_b;
    private int field_m;
    private int field_l;
    private jfa field_g;
    private int field_h;
    private int field_f;
    private int field_k;
    private int field_i;
    private int field_e;

    final int a(int param0) {
        if (param0 != -862393232) {
            ((ag) this).field_c = -119;
        }
        return ((ag) this).field_e;
    }

    final int c(int param0) {
        if (param0 != -30661) {
            ((ag) this).field_f = -50;
        }
        return ((ag) this).field_d;
    }

    final static void a(boolean param0, boolean param1, boolean param2, String param3) {
        oga.a(param2);
        ej.field_a.e(true);
        vn.field_b = new jw(jo.field_E, (String) null, jf.field_r, param1, param0);
        um.field_l = new mpa(ej.field_a, (ae) (Object) vn.field_b);
        ej.field_a.c((ae) (Object) um.field_l, 114);
    }

    final void a(jfa param0, int param1) {
        ((ag) this).field_g = param0;
        if (param1 != -1) {
            int discarded$0 = this.b(-111, 10, 84, 17, 71);
        }
    }

    public final void a(byte param0) {
        float var2 = 0.0f;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if (((ag) this).field_g == null) {
          this.b(12052);
          return;
        } else {
          L0: {
            var2 = (float)((((ag) this).field_g.b((byte) -103) >> -862393232) - ((ag) this).field_d);
            if (param0 >= 84) {
              break L0;
            } else {
              ((ag) this).field_b = -28;
              break L0;
            }
          }
          L1: {
            var3 = (float)((((ag) this).field_g.c((byte) 124) >> -614437168) + -((ag) this).field_h);
            var4 = var3 * var3 + var2 * var2;
            if (var4 <= 576.0f) {
              ((ag) this).field_a = ((ag) this).field_a + 1;
              if (50.0f < (float)((ag) this).field_a) {
                if (4.0f >= var4) {
                  ((ag) this).field_a = 0;
                  break L1;
                } else {
                  var5 = 2.0f / (float)Math.sqrt((double)(var3 * var3 + var2 * var2));
                  ((ag) this).field_h = ((ag) this).field_h + (int)(var5 * var3);
                  ((ag) this).field_d = ((ag) this).field_d + (int)(var5 * var2);
                  break L1;
                }
              } else {
                break L1;
              }
            } else {
              var5 = 24.0f / (float)Math.sqrt((double)(var3 * var3 + var2 * var2));
              var6 = var2 * var5;
              var7 = var5 * var3;
              ((ag) this).field_d = ((ag) this).field_d + (int)(var2 - var6);
              ((ag) this).field_h = ((ag) this).field_h + (int)(-var7 + var3);
              ((ag) this).field_a = 0;
              break L1;
            }
          }
          this.b(12052);
          return;
        }
    }

    public final void a(boolean param0) {
        if (param0) {
            ((ag) this).field_m = 75;
        }
        this.b(12052);
    }

    public final void a(int param0, byte param1, int param2, int param3, int param4) {
        ((ag) this).field_l = param0;
        ((ag) this).field_i = param3;
        if (param1 != -3) {
            return;
        }
        ((ag) this).field_m = param2;
        ((ag) this).field_f = param4;
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param0 != -1) {
            return true;
        }
        return (2048 & param1 ^ -1) != -1 ? true : false;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != -30023) {
            ((ag) this).a(46, (byte) 61, 4, -69, -91);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((ag) this).field_c = param2;
        ((ag) this).field_j = param4;
        ((ag) this).field_b = param1;
        ((ag) this).field_k = param3;
        if (param0 <= 30) {
            ((ag) this).field_j = -66;
        }
    }

    public final void a(int param0, int param1, int param2, int param3) {
        ((ag) this).field_d = ((ag) this).field_d + param2;
        ((ag) this).field_h = ((ag) this).field_h + param0;
        if (param3 != 26768) {
            ((ag) this).field_f = -105;
        }
    }

    final static void a(int param0, iu[] param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = TombRacer.field_G ? 1 : 0;
        if (param1 != null) {
            if (!(-1 > (param4 ^ -1))) {
                return;
            }
            var5 = param1[0].field_n;
            var6 = param1[2].field_n;
            var7 = param1[1].field_n;
            param1[0].b(param3, param0);
            param1[2].b(-var6 + param4 + param3, param0);
            bea.b(ic.field_d);
            bea.g(param3 + var5, param0, -var6 + (param3 + param4), param0 + param1[1].field_k);
            var8 = param3 + var5;
            var9 = -var6 + (param3 + param4);
            param3 = var8;
            if (param2 >= -21) {
                return;
            }
            while (param3 < var9) {
                param1[1].b(param3, param0);
                param3 = param3 + var7;
            }
            bea.a(ic.field_d);
            return;
        }
    }

    final int b(byte param0) {
        int var2 = -96 % ((param0 - 3) / 58);
        return ((ag) this).field_h;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
            ((ag) this).a(-41, -19, 59, 15);
        }
    }

    final void a(int param0, byte param1) {
        ((ag) this).field_e = param0;
        if (param1 != -88) {
            ((ag) this).field_f = 40;
        }
    }

    private final void b(int param0) {
        int var2 = ((ag) this).field_b + -((ag) this).field_c;
        int var3 = ((ag) this).field_j + -((ag) this).field_k;
        ((ag) this).field_d = this.b(((ag) this).field_i, ((ag) this).field_f, var2, ((ag) this).field_d, param0 ^ 12052);
        ((ag) this).field_h = this.b(((ag) this).field_l, ((ag) this).field_m, var3, ((ag) this).field_h, param0 ^ param0);
    }

    private final int b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var6 = param1 - param0;
        if (-1 <= (var6 ^ -1)) {
          return param3;
        } else {
          L0: {
            if (param4 == 0) {
              break L0;
            } else {
              ((ag) this).field_h = -110;
              break L0;
            }
          }
          L1: {
            var7 = param3;
            if (param2 <= var6) {
              if (param0 > param3 - param2 / 2) {
                var7 = param2 / 2 + param0;
                break L1;
              } else {
                if (param3 - -(param2 / 2) > param1) {
                  var7 = param1 + -(param2 / 2);
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              var7 = (param1 + -param0) / 2 + param0;
              break L1;
            }
          }
          return var7;
        }
    }

    final static void a(int param0, dh[] param1) {
        int var3 = 0;
        dh var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var2 = param1.length;
        for (var3 = 1; var3 < var2; var3++) {
            var4 = param1[var3];
            for (var5 = var3 + -1; -1 >= (var5 ^ -1); var5--) {
                // ifeq L63
                param1[1 + var5] = param1[var5];
            }
            param1[1 + var5] = var4;
        }
        if (param0 >= -77) {
            return;
        }
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om {
    int field_h;
    int[] field_l;
    int field_a;
    private kg field_q;
    private static int[] field_e;
    int field_m;
    hj[] field_g;
    static th field_n;
    boolean field_d;
    static uf field_i;
    boolean field_c;
    static int[] field_p;
    private uf field_k;
    private go field_j;
    private va field_o;
    int field_b;
    mg[] field_f;

    private final void a(int param0, go param1) {
        Object var4 = null;
        ((om) this).field_j = param1;
        ((om) this).field_c = false;
        if (param0 != 1) {
          var4 = null;
          om.a(74, (fl) null, -105);
          ((om) this).field_g = null;
          ((om) this).field_l = null;
          ((om) this).field_f = null;
          return;
        } else {
          ((om) this).field_g = null;
          ((om) this).field_l = null;
          ((om) this).field_f = null;
          return;
        }
    }

    private final void a(int param0, uf param1) {
        ((om) this).field_l = null;
        int var3 = 125 % ((param0 - -14) / 34);
        ((om) this).field_k = param1;
        ((om) this).field_g = null;
        ((om) this).field_f = null;
        ((om) this).field_c = false;
    }

    final boolean b(byte param0) {
        int var2 = 0;
        hj var3 = null;
        hj[] var3_array = null;
        mg[] var3_array2 = null;
        int var4 = 0;
        mg var5 = null;
        hj var6 = null;
        mg[] var7 = null;
        hj[] var8 = null;
        hj[] var13 = null;
        var4 = HoldTheLine.field_D;
        if (!((om) this).field_c) {
          var2 = -8 / ((-92 - param0) / 34);
          if (((om) this).field_k != null) {
            var6 = ((om) this).field_k.a(8192);
            var3 = var6;
            if (var3 == null) {
              return ((om) this).field_c;
            } else {
              ((om) this).field_g = new hj[]{var6};
              ((om) this).field_c = true;
              return ((om) this).field_c;
            }
          } else {
            if (((om) this).field_j == null) {
              if (null != ((om) this).field_o) {
                var13 = ((om) this).field_o.a(180);
                var8 = var13;
                var3_array = var8;
                if (var8 == null) {
                  return ((om) this).field_c;
                } else {
                  ((om) this).field_g = var13;
                  ((om) this).field_c = true;
                  return ((om) this).field_c;
                }
              } else {
                if (null != ((om) this).field_q) {
                  var7 = ((om) this).field_q.a(16);
                  var3_array2 = var7;
                  if (var7 == null) {
                    return ((om) this).field_c;
                  } else {
                    ((om) this).field_f = var7;
                    ((om) this).field_c = true;
                    return ((om) this).field_c;
                  }
                } else {
                  return ((om) this).field_c;
                }
              }
            } else {
              var5 = ((om) this).field_j.c((byte) -105);
              var3 = (hj) (Object) var5;
              if (var3 == null) {
                return ((om) this).field_c;
              } else {
                ((om) this).field_f = new mg[]{var5};
                ((om) this).field_c = true;
                return ((om) this).field_c;
              }
            }
          }
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_n = null;
        if (param0 != -6) {
            return;
        }
        field_e = null;
        field_i = null;
    }

    final static void a(String[][] param0, int param1, int param2) {
        ra.field_ab = -1;
        ik.field_i = param2;
        qj.field_I = -1;
        mc.field_b = param0;
        mn.field_b = -1;
        nh.h(0);
        if (param1 <= 10) {
            Object var4 = null;
            ql discarded$0 = om.a((String) null, (gn) null, (String) null, 14, (gn) null);
        }
    }

    private final void a(va param0, int[] param1, boolean param2) {
        ((om) this).field_l = param1;
        ((om) this).field_c = false;
        ((om) this).field_o = param0;
        if (!param2) {
          return;
        } else {
          ((om) this).field_g = null;
          ((om) this).field_f = null;
          return;
        }
    }

    final static ql a(String param0, gn param1, String param2, int param3, gn param4) {
        int var5 = 0;
        int var6 = 0;
        if (param3 != 8192) {
          return null;
        } else {
          var5 = param4.c(param0, 3);
          var6 = param4.a(var5, param2, false);
          return ta.a(var5, var6, param4, param1, -105);
        }
    }

    final static void a(int param0, fl param1, int param2) {
        int var4 = 0;
        Object var5 = null;
        da var7 = null;
        da var8 = null;
        if (param0 == 27391) {
          var8 = da.field_p;
          var8.c((byte) 33, param2);
          var8.field_l = var8.field_l + 1;
          var4 = var8.field_l;
          var8.f(111, 1);
          if (null != param1.field_l) {
            var8.f(param0 + -27280, param1.field_l.length);
            var8.a(param1.field_l.length, 86, param1.field_l, 0);
            int discarded$8 = var8.a(var4, (byte) 118);
            var8.field_l = var8.field_l - 4;
            param1.field_k = var8.a(62);
            var8.a(-268435456, var8.field_l - var4);
            return;
          } else {
            var8.f(param0 ^ 27280, 0);
            int discarded$9 = var8.a(var4, (byte) 118);
            var8.field_l = var8.field_l - 4;
            param1.field_k = var8.a(62);
            var8.a(-268435456, var8.field_l - var4);
            return;
          }
        } else {
          var5 = null;
          om.a(-52, (fl) null, -89);
          var7 = da.field_p;
          var7.c((byte) 33, param2);
          var7.field_l = var7.field_l + 1;
          var4 = var7.field_l;
          var7.f(111, 1);
          if (null != param1.field_l) {
            var7.f(param0 + -27280, param1.field_l.length);
            var7.a(param1.field_l.length, 86, param1.field_l, 0);
            int discarded$10 = var7.a(var4, (byte) 118);
            var7.field_l = var7.field_l - 4;
            param1.field_k = var7.a(62);
            var7.a(-268435456, var7.field_l - var4);
            return;
          } else {
            var7.f(param0 ^ 27280, 0);
            int discarded$11 = var7.a(var4, (byte) 118);
            var7.field_l = var7.field_l - 4;
            param1.field_k = var7.a(62);
            var7.a(-268435456, var7.field_l - var4);
            return;
          }
        }
    }

    private final void a(int param0, int param1) {
        if (param0 != 32768) {
          field_i = null;
          ((om) this).field_d = false;
          ((om) this).field_a = param1;
          return;
        } else {
          ((om) this).field_d = false;
          ((om) this).field_a = param1;
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
        Object var5 = null;
        ((om) this).field_h = param1;
        ((om) this).field_m = param2;
        ((om) this).field_d = true;
        if (param0 != 92682) {
          var5 = null;
          this.a((va) null, (int[]) null, true);
          ((om) this).field_a = (int)Math.sqrt((double)(((om) this).field_m * ((om) this).field_m + ((om) this).field_h * ((om) this).field_h));
          return;
        } else {
          ((om) this).field_a = (int)Math.sqrt((double)(((om) this).field_m * ((om) this).field_m + ((om) this).field_h * ((om) this).field_h));
          return;
        }
    }

    private final void a(int param0, kg param1, int[] param2) {
        ((om) this).field_l = param2;
        ((om) this).field_g = null;
        ((om) this).field_q = param1;
        ((om) this).field_c = false;
        if (param0 != 4) {
          return;
        } else {
          ((om) this).field_f = null;
          return;
        }
    }

    om(int param0, int param1, va param2, int[] param3, int param4) {
        ((om) this).field_b = param1;
        this.a(32768, param0);
        this.a(param2, param3, true);
    }

    final static void a(int param0, java.awt.Canvas param1) {
        Object var3 = null;
        L0: {
          lh.a((java.awt.Component) (Object) param1, false);
          ic.a(23147, (java.awt.Component) (Object) param1);
          if (lb.field_u != null) {
            lb.field_u.a((java.awt.Component) (Object) param1, -1);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -46342) {
          var3 = null;
          om.a(93, (java.awt.Canvas) null);
          return;
        } else {
          return;
        }
    }

    om(int param0, int param1, kg param2, int[] param3, int param4) {
        ((om) this).field_b = param1;
        this.a(32768, param0);
        this.a(4, param2, param3);
    }

    om(int param0, int param1, int param2, kg param3, int[] param4, int param5) {
        ((om) this).field_b = param2;
        this.a(92682, param1, param0);
        this.a(4, param3, param4);
    }

    om(int param0, int param1, uf param2, int param3) {
        ((om) this).field_b = param1;
        this.a(32768, param0);
        this.a(-103, param2);
    }

    om(int param0, int param1, int param2, uf param3, int param4) {
        ((om) this).field_b = param2;
        this.a(92682, param1, param0);
        this.a(-57, param3);
    }

    om(int param0, int param1, go param2, int param3) {
        ((om) this).field_b = param1;
        this.a(32768, param0);
        this.a(1, param2);
    }

    om(int param0, int param1, int param2, go param3, int param4) {
        ((om) this).field_b = param2;
        this.a(92682, param1, param0);
        this.a(1, param3);
    }

    om(int param0, int param1, int param2, int param3) {
        ((om) this).field_b = param2;
        this.a(92682, param1, param0);
        ((om) this).field_g = null;
        ((om) this).field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_e = new int[98304];
        for (var0 = 92682; -46342 >= (var0 ^ -1); var0--) {
            var6 = (long)(1 + (var0 << 2042386817));
            var4 = (long)(-1 + (var0 << -1991731423));
            var3 = (int)(-32768L + (var6 * var6 >> 1995029522));
            var2 = (int)(-32768L + (var4 * var4 >> 1497698898));
            if (var3 >= field_e.length) {
                var3 = field_e.length - 1;
            }
            for (var1 = (var2 ^ -1) > -1 ? 0 : var2; var3 >= var1; var1++) {
                field_e[var1] = var0;
            }
        }
        field_p = new int[8192];
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends ib implements en {
    private vf field_K;
    private String[] field_J;
    static int[] field_I;
    static String field_O;
    static String field_L;
    static String field_N;
    static int field_M;
    private d[] field_H;

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((ri) this).field_J.length) {
            L1: {
              if (param4 != ((ri) this).field_H[((ri) this).field_J.length]) {
                break L1;
              } else {
                ((ri) this).field_K.a((byte) 100);
                break L1;
              }
            }
            L2: {
              if (param2 < -22) {
                break L2;
              } else {
                ((ri) this).a(-93, -52, -108, (byte) -4);
                break L2;
              }
            }
            return;
          } else {
            if (((ri) this).field_H[var6] == param4) {
              ((ri) this).field_K.a(((ri) this).field_J[var6], (byte) 56);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 > -69) {
            return false;
        }
        return null != td.field_t ? true : false;
    }

    final void a(byte param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        ((ri) this).field_G.c((byte) -95);
        if (param1 != null) {
            // ifeq L26
        } else {
            ((ri) this).field_J = null;
            return;
        }
        int var3 = param1.length;
        ((ri) this).field_J = new String[var3];
        for (var4_int = 0; var3 > var4_int; var4_int++) {
            ((ri) this).field_J[var4_int] = ap.a(true, (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
        }
        bb var4 = new bb(a.field_u, 0, 1);
        ((ri) this).field_H = new d[var3 - -1];
        for (var5 = 0; var5 < var3; var5++) {
            ((ri) this).field_H[var5] = new d(((ri) this).field_J[var5], (uh) this);
            ((ri) this).field_H[var5].field_l = (ub) (Object) var4;
            ((ri) this).field_H[var5].field_z = aa.field_c;
            ((ri) this).field_H[var5].a(15, 0, var5 * 16 + 20, (byte) -119, 80);
            ((ri) this).a((oc) (Object) ((ri) this).field_H[var5], true);
        }
        ((ri) this).field_H[var3] = new d(sh.field_c, (uh) this);
        var5 = 52 / ((-9 - param0) / 59);
        ((ri) this).field_H[var3].field_l = (ub) (Object) var4;
        ((ri) this).field_H[var3].a(15, 0, 16 * (var3 - -1) + 20, (byte) -119, 100);
        ((ri) this).a((oc) (Object) ((ri) this).field_H[var3], true);
    }

    final static void h(int param0) {
        if (param0 > -41) {
            return;
        }
        aa.a((byte) 96);
        ko.a(-32120);
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (!((param0 ^ -1) != -99)) {
            return ((ri) this).b(param2, (byte) -60);
        }
        if (param0 != 99) {
            return false;
        }
        return ((ri) this).a(param2, (byte) -117);
    }

    final static byte[] a(byte[] param0, int param1, pi param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (param3 == 20) {
          var4 = param2.c(param1, (byte) -112);
          if (var4 != 0) {
            L0: {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (param0.length == var4) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              param0 = new byte[var4];
              break L0;
            }
            L2: {
              var5 = param2.c(3, (byte) 98);
              var6 = (byte)param2.c(8, (byte) 31);
              if (0 < var5) {
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param0[var7] = (byte)(var6 + param2.c(var5, (byte) 107));
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var7 = 0;
                L4: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param0[var7] = (byte)var6;
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            return param0;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_I = null;
        if (param0 != -83) {
            field_O = null;
        }
        field_O = null;
        field_L = null;
        field_N = null;
    }

    final static void c(boolean param0) {
        int var1 = 0;
        if (ki.field_d < 224) {
            var1 = ki.field_d % 32;
            h.a(13894, ki.field_d + (32 + -var1));
        } else {
            h.a(13894, 256);
        }
        if (!param0) {
            field_M = -128;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        dh var5 = a.field_u;
        if (((ri) this).field_J != null) {
            int discarded$0 = var5.a(i.field_l, param1 - -((ri) this).field_o, ((ri) this).field_w + param0, ((ri) this).field_t, 20, 16777215, -1, 0, 0, var5.field_P + var5.field_F);
        }
    }

    ri(vf param0) {
        super(0, 0, 0, 0, (ub) null);
        ((ri) this).field_K = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Continue";
        field_O = "Remove <%0> from ignore list";
    }
}

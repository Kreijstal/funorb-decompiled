/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends pn implements Cloneable {
    static dl field_n;
    static int field_m;
    private int field_o;
    private int field_p;

    final static int a(int param0, byte[] param1, int param2) {
        if (param2 != 26009) {
            return 94;
        }
        return pf.a(0, param1, param0, -1);
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
            Object var5 = null;
            nj discarded$0 = ((gi) this).a(-70, (nj) null);
        }
        return (f) this;
    }

    final nj a(int param0, nj param1) {
        if (param0 != 23525) {
            ((gi) this).b(-112, 33, -8, true, -15, -44);
        }
        return ng.a(e.field_a, param1, (f) (Object) new gi(((gi) this).field_p, (f) (Object) new kp(-1)), (byte) -83, qd.field_p);
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            return -86;
        }
        return 12;
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        if (param0 != -21) {
            int discarded$0 = ((gi) this).a(true, false);
            return true;
        }
        return true;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        if (-25 == param1) {
            // if_icmpne L44
            fl.field_i[((gi) this).field_o >> 1421964705].c(param4, -param2 + param5, f.field_g[((gi) this).field_p]);
        } else {
            fl.field_i[((gi) this).field_o >> -415815295].b(param4, -param2 + param5, param1 * 2, param2 * 3, f.field_g[((gi) this).field_p]);
        }
        int var7 = 101 % ((74 - param0) / 41);
    }

    gi(int param0, f param1) {
        super(param1);
        ((gi) this).field_o = 0;
        ((gi) this).field_p = param0;
    }

    final void a(int param0, int param1) {
        if (param1 < 61) {
            return;
        }
        ((gi) this).field_p = param0;
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        if (param0 < 92) {
            ((gi) this).field_p = 78;
        }
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        ((gi) this).field_o = ((gi) this).field_o + 1;
        if (param1 != 0) {
            Object var6 = null;
            int discarded$0 = gi.a(103, (byte[]) null, -64);
        }
        if (!(fl.field_i.length * 2 > ((gi) this).field_o)) {
            ((gi) this).field_o = 0;
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            gi.b(false);
        }
        field_n = null;
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        vh var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        fq var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var14 = CrazyCrystals.field_B;
        var15 = (fq) (Object) param1;
        var9 = 0;
        var10 = 1;
        L0: while (true) {
          if (-1 + param6.length <= var10) {
            L1: {
              if (param4 < -87) {
                break L1;
              } else {
                field_n = null;
                break L1;
              }
            }
            L2: {
              var10 = ((gi) this).field_p;
              if (-1 <= (var9 ^ -1)) {
                so.field_g.a(128, 12 * (param5 - -param2), (param0 + param3) * 12, 0, (byte) -111);
                break L2;
              } else {
                pm.field_b.a(128, 12 * (param2 + param5), (param3 + param0) * 12, 0, (byte) -111);
                var10 += 4;
                break L2;
              }
            }
            L3: {
              if (ab.field_D == null) {
                L4: {
                  var11 = q.field_a[var15.field_u];
                  q.field_a[var15.field_u].field_m = q.field_a[var15.field_u].field_m + 1;
                  var12 = q.field_a[var15.field_u].field_m;
                  if (var12 < var11.field_c.length) {
                    break L4;
                  } else {
                    var19 = new int[4 + var12];
                    var18 = var19;
                    var17 = var18;
                    var16 = var17;
                    var13 = var16;
                    eg.a(var11.field_c, 0, var19, 0, var12);
                    var11.field_c = var13;
                    break L4;
                  }
                }
                var11.field_c[var12] = var10;
                if (-1 <= (var9 ^ -1)) {
                  mb.field_g = mb.field_g + 300;
                  fn.field_j = fn.field_j + 350;
                  we.field_h = we.field_h + 20;
                  b.field_a = b.field_a + 10;
                  je.field_j = je.field_j + 10;
                  fp.field_a = fp.field_a + 20;
                  mb.field_g = mb.field_g + 10;
                  fn.field_j = fn.field_j + 10;
                  break L3;
                } else {
                  fn.field_j = fn.field_j + 500;
                  mb.field_g = mb.field_g + 400;
                  fn.field_j = fn.field_j + 20;
                  mb.field_g = mb.field_g + 20;
                  fn.field_j = fn.field_j - wd.field_j;
                  ob.field_l = ob.field_l + 1;
                  ob.field_l = ob.field_l - 1;
                  fn.field_j = fn.field_j + wd.field_j;
                  we.field_h = we.field_h + 40;
                  fp.field_a = fp.field_a + 40;
                  b.field_a = b.field_a + 20;
                  je.field_j = je.field_j + 20;
                  break L3;
                }
              } else {
                break L3;
              }
            }
            ((gi) this).field_l.a(1 << var15.field_u, true, tm.field_e);
            return ((gi) this).field_l.a(param0, param1, param2, param3, (byte) -93, param5, param6);
          } else {
            var11_int = 1;
            L5: while (true) {
              if (var11_int >= -1 + param6[0].length) {
                var10++;
                continue L0;
              } else {
                var9 = var9 + param6[var10][var11_int].a(-9352, var11_int, var10, var15, ((gi) this).field_p);
                var11_int++;
                continue L5;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new dl(256, 25);
        field_m = 64;
    }
}

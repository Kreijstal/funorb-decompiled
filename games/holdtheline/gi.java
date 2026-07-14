/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends v implements pi {
    static String field_H;
    private String[] field_F;
    private rm[] field_I;
    private pn field_G;
    static go field_J;

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (0 != param3) {
            return;
        }
        qi var5 = hl.field_g;
        if (!(null == ((gi) this).field_F)) {
            int discarded$0 = var5.a(tk.field_b, param2 + ((gi) this).field_k, ((gi) this).field_o + param1, ((gi) this).field_x, 20, 16777215, -1, 0, 0, var5.field_G + var5.field_I);
        }
    }

    final static void a(int param0, int param1, int param2, hj[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = HoldTheLine.field_D;
        if (param3 != null) {
            if (param4 <= 0) {
                return;
            }
            var5 = param3[0].field_o;
            var6 = param3[2].field_o;
            var7 = param3[1].field_o;
            param3[0].a(param2, param0);
            param3[2].a(-var6 + (param2 + param4), param0);
            tc.b(hi.field_W);
            tc.e(var5 + param2, param0, -var6 + param4 + param2, param3[1].field_v + param0);
            if (param1 != 14191) {
                field_J = null;
            }
            var8 = param2 + var5;
            var9 = param2 - (-param4 - -var6);
            param2 = var8;
            while (var9 > param2) {
                param3[1].a(param2, param0);
                param2 = param2 + var7;
            }
            tc.a(hi.field_W);
            return;
        }
    }

    gi(pn param0) {
        super(0, 0, 0, 0, (dh) null);
        ((gi) this).field_G = param0;
    }

    final static void a(byte param0) {
        vk.a(true);
        if (param0 <= 9) {
            field_J = null;
        }
    }

    final static io i(int param0) {
        if (param0 >= -77) {
            io discarded$0 = gi.i(-10);
        }
        return new io(ob.d((byte) 41), tm.b(false));
    }

    final void a(String[] param0, byte param1) {
        int var3 = 0;
        int var4_int = 0;
        am var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = HoldTheLine.field_D;
          ((gi) this).field_D.a(param1 + 28977);
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length == 0) {
              break L0;
            } else {
              var3 = param0.length;
              ((gi) this).field_F = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var3 <= var4_int) {
                  var4 = new am(hl.field_g, 0, 1);
                  ((gi) this).field_I = new rm[var3 - -1];
                  if (param1 == 43) {
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var3) {
                        ((gi) this).field_I[var3] = new rm(tg.field_f, (tb) this);
                        ((gi) this).field_I[var3].field_l = (dh) (Object) var4;
                        ((gi) this).field_I[var3].a(0, (byte) 122, 16 * (var3 + 1) + 20, 15, 100);
                        ((gi) this).a(true, (n) (Object) ((gi) this).field_I[var3]);
                        return;
                      } else {
                        ((gi) this).field_I[var5] = new rm(((gi) this).field_F[var5], (tb) this);
                        ((gi) this).field_I[var5].field_l = (dh) (Object) var4;
                        ((gi) this).field_I[var5].field_z = bj.field_N;
                        ((gi) this).field_I[var5].a(0, (byte) 122, var5 * 16 + 20, 15, 80);
                        ((gi) this).a(true, (n) (Object) ((gi) this).field_I[var5]);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  ((gi) this).field_F[var4_int] = ok.a((CharSequence) (Object) param0[var4_int], -6126).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        }
        ((gi) this).field_F = null;
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
            return true;
        }
        if ((param1 ^ -1) == -99) {
            return ((gi) this).c(param0, param2 + 77);
        }
        if ((param1 ^ -1) != -100) {
            return false;
        }
        return ((gi) this).b(param0, param2 + 200);
    }

    public static void h(int param0) {
        field_J = null;
        field_H = null;
        if (param0 != -26897) {
            Object var2 = null;
            boolean discarded$0 = gi.a((fi) null, 23, (fi) null);
        }
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = HoldTheLine.field_D;
          var6 = 0;
          if (param2 == -4) {
            break L0;
          } else {
            var8 = null;
            boolean discarded$2 = ((gi) this).a((n) null, -95, (byte) -39, 'B');
            break L0;
          }
        }
        L1: while (true) {
          if (((gi) this).field_F.length <= var6) {
            L2: {
              if (((gi) this).field_I[((gi) this).field_F.length] == param1) {
                ((gi) this).field_G.a((byte) 126);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            if (param1 == ((gi) this).field_I[var6]) {
              ((gi) this).field_G.a(((gi) this).field_F[var6], 25);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final static boolean a(fi param0, int param1, fi param2) {
        int var4 = HoldTheLine.field_D;
        int var3 = -param2.field_gb + param0.field_gb;
        if (param1 != 200) {
            io discarded$0 = gi.i(32);
        }
        if (vl.field_g != param0.field_hb) {
            // if_acmpne L80
            // wide iinc 3 200
        } else {
            // wide iinc 3 -200
        }
        if (vl.field_g != param2.field_hb) {
            // if_acmpne L122
            // wide iinc 3 -200
        } else {
            // wide iinc 3 200
        }
        return var3 > 0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Steer left";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends pj implements fh, ke {
    static int field_J;
    static he[] field_L;
    private hf field_N;
    private qg field_M;
    static int field_K;
    private hf field_P;
    jd field_O;

    public ah() {
        super(0, 0, 496, 0, (cg) null);
        ((ah) this).field_M = new qg("", (fd) null, 12);
        l var1 = new l(u.field_d, 0, 0, 0, 0, 16777215, -1, 3, 0, uh.field_i.field_x, -1, 2147483647, true);
        vg var2 = new vg(ue.field_c, (cg) (Object) var1, (fd) null);
        ((ah) this).field_P = new hf(dc.field_b, (fd) null);
        ((ah) this).field_N = new hf(vi.field_f, (fd) null);
        ((ah) this).field_M.field_v = bj.field_c;
        ((ah) this).field_M.a((qi) (Object) new pk((kl) (Object) ((ah) this).field_M), (byte) -57);
        ((ah) this).field_P.field_E = false;
        ((ah) this).field_P.field_l = (cg) (Object) new ie();
        ((ah) this).field_N.field_l = (cg) (Object) new uk();
        ((ah) this).field_M.field_l = (cg) (Object) new mj(10000536);
        int var3 = 20;
        int var4 = 4;
        var2.a(var3, 50, 20, 16535, 270);
        int var5 = 200;
        var3 += 50;
        ((ah) this).b(var2, (byte) 119);
        var3 = var3 + (this.a(737797090, var3, hj.field_h, 170, (vg) (Object) ((ah) this).field_M, vh.field_b) - -5);
        ((ah) this).field_P.a(var3, 40, 496 - var5 >> 1223791297, 16535, var5);
        ((ah) this).field_N.a(15 + var3, 40, var4 + 3, 16535, 60);
        ((ah) this).field_N.field_u = (fd) this;
        ((ah) this).field_P.field_u = (fd) this;
        ((ah) this).b((vg) (Object) ((ah) this).field_P, (byte) 92);
        ((ah) this).b((vg) (Object) ((ah) this).field_N, (byte) 115);
        ((ah) this).field_O = new jd((fh) this);
        ((ah) this).field_O.a(20, 150, 60 + (((ah) this).field_M.field_w + ((ah) this).field_M.field_o), 16535, -60 + (((ah) this).field_w - ((ah) this).field_M.field_o + -((ah) this).field_M.field_w));
        ((ah) this).b((vg) (Object) ((ah) this).field_O, (byte) 77);
        ((ah) this).a(0, var4 + var3 - -55, 0, 16535, 496);
    }

    private final void i(int param0) {
        if (param0 != 10000536) {
            return;
        }
        if (!(this.j(737797090))) {
            return;
        }
        jk.a(1, ((ah) this).field_M.field_p);
    }

    final void a(vg param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) -128);
        if (param3 > -127) {
            field_K = 14;
        }
        ((ah) this).field_P.field_E = this.j(737797090);
    }

    final static void g(byte param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        ja var4_ref_ja = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        ja var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 <= -89) {
          wd.field_e = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1 = r.field_c.length;
          var23 = new int[var1];
          var22 = var23;
          var21 = var22;
          var20 = var21;
          var2 = var20;
          var3 = 0;
          L0: while (true) {
            if (var1 <= var3) {
              L1: {
                var3 = wd.field_e[9] >> -1719289528;
                var4 = wd.field_e[10] >> -1321705304;
                var5 = wd.field_e[11] >> -1101903608;
                var6 = vb.field_n << 22821700;
                var7 = 0;
                var8 = dg.a(-20870, var6) >> -1344158296;
                var9 = u.a(var6, (byte) 74) >> 773166664;
                if (ck.field_c == 0) {
                  break L1;
                } else {
                  if (0 == ob.field_g) {
                    break L1;
                  } else {
                    var7 = ck.field_c + -320;
                    var9 = -128;
                    var8 = 240 - ob.field_g;
                    break L1;
                  }
                }
              }
              var10 = 256.0 / Math.sqrt((double)(var9 * var9 + (var7 * var7 - -(var8 * var8))));
              var8 = (int)((double)var8 * var10);
              var7 = (int)((double)var7 * var10);
              var9 = (int)((double)var9 * var10);
              var12 = -var3 + var7;
              var13 = var8 - var4;
              var14 = var9 - var5;
              var10 = 256.0 / Math.sqrt((double)(var12 * var12 - (-(var13 * var13) - var14 * var14)));
              var13 = (int)((double)var13 * var10);
              var14 = (int)((double)var14 * var10);
              var12 = (int)((double)var12 * var10);
              var15 = 0;
              L2: while (true) {
                if (var15 >= r.field_c.length) {
                  return;
                } else {
                  var16 = 0;
                  var17_int = 1;
                  L3: while (true) {
                    if (r.field_c.length <= var17_int) {
                      var2[var16] = -2147483648;
                      var17 = r.field_c[var16];
                      ue.a(var16, (byte) 93);
                      var18 = 0;
                      L4: while (true) {
                        if (var18 >= 3) {
                          s.a(true, lc.field_u, false, wd.field_e, false, var17, -45);
                          dd.a(var8, var13, var14, var7, var9, var12, (byte) -81, var17);
                          var15++;
                          continue L2;
                        } else {
                          lc.field_u[var18] = lc.field_u[var18] + q.field_b[var15][var18];
                          var18++;
                          continue L4;
                        }
                      }
                    } else {
                      if (var23[var17_int] > var23[var16]) {
                        var16 = var17_int;
                        var17_int++;
                        continue L3;
                      } else {
                        var17_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } else {
              var4_ref_ja = r.field_c[var3];
              var4_ref_ja.b(32767);
              ue.a(var3, (byte) 65);
              var5 = var4_ref_ja.field_s - -var4_ref_ja.field_I >> 343102305;
              var6 = var4_ref_ja.field_d - -var4_ref_ja.field_N >> -206672511;
              var7 = var4_ref_ja.field_j + var4_ref_ja.field_C >> 1664019329;
              var8 = wd.field_e[9] >> 737797090;
              var9 = wd.field_e[10] >> -241680350;
              var10_int = wd.field_e[11] >> -991159294;
              var11 = lc.field_u[3] * var8 - (-(var9 * lc.field_u[4]) + -(lc.field_u[5] * var10_int)) >> -2019306546;
              var12 = lc.field_u[7] * var9 + (var8 * lc.field_u[6] - -(lc.field_u[8] * var10_int)) >> -1393387922;
              var13 = lc.field_u[11] * var10_int + var9 * lc.field_u[10] + lc.field_u[9] * var8 >> -2021219474;
              var2[var3] = var13 * var7 + (var6 * var12 + var5 * var11) >> 510066640;
              var3++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        if (!(!super.a(param0, param1, param2, 84))) {
            return true;
        }
        if (param3 <= 63) {
            ((ah) this).field_M = null;
        }
        if (98 == param0) {
            return ((ah) this).a(param2, 65535);
        }
        if (param0 != 99) {
            return false;
        }
        return ((ah) this).a(param2, (byte) 59);
    }

    public final void a(String param0, int param1) {
        qg var3 = ((ah) this).field_M;
        String var4 = param0;
        ((kl) (Object) var3).a(false, var4, -19116);
        if (param1 != 0) {
            Object var5 = null;
            int discarded$0 = this.a(83, 123, (String) null, 44, (vg) null, (String) null);
        }
    }

    private final boolean a(ud param0, int param1) {
        qi var3 = param0.a((byte) -121);
        if (var3 == null) {
            return true;
        }
        vh var4 = var3.a(-12317);
        if (param1 != 11) {
            ((ah) this).field_O = null;
        }
        return ce.field_e == var4 ? true : false;
    }

    private final int a(vg param0, String param1, int param2, int param3, int param4, int param5, String param6) {
        dh var10 = new dh(20, param2, 120 + param3, 25, param0, false, 120, 3, uh.field_i, 16777215, param6);
        ((ah) this).b((vg) (Object) var10, (byte) 35);
        ci var9 = new ci(((ud) (Object) param0).a((byte) 120), param1, 126, param2 - -var10.field_k, 25 + param3, param4);
        var9.field_u = (fd) this;
        if (param5 != -23940) {
            return -32;
        }
        ((ah) this).b((vg) (Object) var9, (byte) 119);
        return var9.field_k + var10.field_k;
    }

    public static void k(int param0) {
        if (param0 != -988) {
            field_J = -72;
        }
        field_L = null;
    }

    final static void a(vk param0, int param1, int param2) {
        if (param0 == null) {
            return;
        }
        od.a(-1630758008, ag.a(param0, 100, 96, param1));
        if (param2 != -1321705304) {
            field_L = null;
        }
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        if (!param2) {
            Object var7 = null;
            ((ah) this).a((vg) null, -34, 1, (byte) -96);
        }
        if (param3 == ((ah) this).field_N) {
            h.d(-127);
        } else {
            if (param3 == ((ah) this).field_P) {
                this.i(10000536);
            }
        }
    }

    public final void a(byte param0) {
        ((pk) (Object) ((ah) this).field_M.a((byte) -122)).e((byte) -27);
        if (param0 > -23) {
            field_K = 126;
        }
    }

    private final int a(int param0, int param1, String param2, int param3, vg param4, String param5) {
        if (param0 != 737797090) {
            this.i(62);
        }
        return this.a(param4, param5, param1, param3, 35, -23940, param2);
    }

    private final boolean j(int param0) {
        if (param0 != 737797090) {
            ((ah) this).field_M = null;
        }
        if (this.a((ud) (Object) ((ah) this).field_M, 11)) {
            return true;
        }
        return false;
    }

    final static void a(byte param0, int param1) {
        if (param0 <= 108) {
            ah.k(110);
        }
        rd.field_D = param1 * 400 / 150;
        rd.field_F = 100 * param1 / 150;
        rd.field_G = (param1 << -725508944) / 150;
    }

    static {
    }
}

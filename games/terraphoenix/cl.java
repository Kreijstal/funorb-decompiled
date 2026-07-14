/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends gb implements jf, n {
    private eb field_G;
    static d field_J;
    static String field_I;
    private tj field_H;
    private vj field_F;

    cl(tj param0) {
        super(0, 0, 288, 0, (cj) null);
        ((cl) this).field_H = param0;
        ((cl) this).field_G = new eb(rj.field_e, (sc) null);
        ((cl) this).field_G.field_l = (cj) (Object) new ic();
        String var7 = ij.a(new String[2], -1, rf.field_y);
        int var3 = 20;
        fd var4 = new fd(qk.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, qk.field_e.field_s, -1, 2147483647, true);
        ((cl) this).field_F = new vj(var7, (cj) (Object) var4);
        ((cl) this).field_F.field_x = "";
        ((cl) this).field_F.a(0, ig.field_b, (byte) 126);
        ((cl) this).field_F.a(1, ig.field_b, (byte) 25);
        ((cl) this).field_F.field_r = (sc) this;
        ((cl) this).field_F.field_p = -40 + ((cl) this).field_p;
        ((cl) this).field_F.b(var3, -96, 26, -40 + ((cl) this).field_p);
        var3 = var3 + (15 + ((cl) this).field_F.field_n);
        ((cl) this).b((byte) 95, (gl) (Object) ((cl) this).field_F);
        int var5 = 4;
        int var6 = 200;
        ((cl) this).field_G.a(var3, (byte) 46, var6, 300 - var6 >> 457850785, 40);
        ((cl) this).field_G.field_r = (sc) this;
        ((cl) this).b((byte) 95, (gl) (Object) ((cl) this).field_G);
        ((cl) this).a(0, (byte) 64, 300, 0, var5 + (var3 - -55));
    }

    private final String f(byte param0) {
        int var2 = -98 / ((param0 - 56) / 33);
        return "<u=2164A2><col=2164A2>";
    }

    public static void g(byte param0) {
        field_I = null;
        field_J = null;
        if (param0 <= 110) {
            Object var2 = null;
            cl.a(-65, 31, (byte) -36, (ci) null, -121, -18);
        }
    }

    public final void a(byte param0, vj param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Terraphoenix.field_V;
          var5 = -51 / ((param0 - -10) / 40);
          if (-1 == param3) {
            ld.a((byte) -29, "terms.ws");
            break L0;
          } else {
            if (1 != param3) {
              if (-3 == param3) {
                ld.a((byte) -29, "conduct.ws");
                break L0;
              } else {
                break L0;
              }
            } else {
              ld.a((byte) -29, "privacy.ws");
              break L0;
            }
          }
        }
    }

    final static eg a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        if (param7 != 43) {
            Object var9 = null;
            cl.a(-72, 87, (byte) 30, (ci) null, -31, 97);
        }
        eg var8 = new eg(param3, param6, param1, param4, param2, param5);
        ic.field_s.a((uf) (Object) var8, -16611);
        qc.a(param0, var8, (byte) -7);
        return var8;
    }

    private final String d(boolean param0) {
        if (param0) {
            cl.g((byte) -109);
        }
        return "</col></u>";
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (-99 == (param3 ^ -1)) {
            return ((cl) this).a(48, param1);
        }
        if (param3 != 99) {
            return false;
        }
        return ((cl) this).a(param1, (byte) 92);
    }

    final static void a(int param0, int param1, byte param2, ci param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        L0: {
          var21 = Terraphoenix.field_V;
          var6 = (-param0 + param5 << 51425640) / param3.field_q;
          var7 = (param0 << -1646954200) - -(var6 * param3.field_p);
          param4 = param4 + param3.field_v;
          param1 = param1 + param3.field_p;
          var8 = param4 * l.field_k + param1;
          var9 = 0;
          var10 = param3.field_t;
          var11 = param3.field_r;
          var12 = -var11 + l.field_k;
          var13 = 9 / ((param2 - 24) / 56);
          if (l.field_d > param4) {
            var15 = l.field_d + -param4;
            var9 = var9 + var15 * var11;
            var8 = var8 + l.field_k * var15;
            var10 = var10 - var15;
            param4 = l.field_d;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var14 = 0;
          if (l.field_b <= param1) {
            break L1;
          } else {
            var15 = -param1 + l.field_b;
            var9 = var9 + var15;
            var12 = var12 + var15;
            param1 = l.field_b;
            var7 = var7 + var15 * var6;
            var8 = var8 + var15;
            var11 = var11 - var15;
            var14 = var14 + var15;
            break L1;
          }
        }
        L2: {
          if (param4 + var10 > l.field_c) {
            var10 = var10 - (-l.field_c + (param4 + var10));
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (l.field_f >= var11 + param1) {
            break L3;
          } else {
            var15 = -l.field_f + param1 + var11;
            var11 = var11 - var15;
            var12 = var12 + var15;
            var14 = var14 + var15;
            break L3;
          }
        }
        L4: {
          if (0 >= var11) {
            break L4;
          } else {
            if (var10 < -1) {
              param4 = -var10;
              L5: while (true) {
                if (param4 >= 0) {
                  return;
                } else {
                  var15 = var7;
                  param1 = -var11;
                  L6: while (true) {
                    if (-1 <= param1) {
                      var9 = var9 + var14;
                      var8 = var8 + var12;
                      param4++;
                      continue L5;
                    } else {
                      var16 = var15 >> -1399656376;
                      var15 = var15 + var6;
                      var17 = -var16 + 256;
                      if (var16 <= -1) {
                        var9++;
                        var18 = param3.field_z[var9];
                        if (-1 != var18) {
                          if (-256 > (var16 ^ -1)) {
                            l.field_i[var8] = var18;
                            var8++;
                            param1++;
                            continue L6;
                          } else {
                            var19 = l.field_i[var8];
                            var20 = 16711935 & (var19 & 16711935) * var17 + (var18 & 16711935) * var16 >> -505920216;
                            l.field_i[var8] = var20 - -dg.a(dg.a(65280, var19) * var17 - -(dg.a(65280, var18) * var16) >> 388622664, 65280);
                            var8++;
                            param1++;
                            continue L6;
                          }
                        } else {
                          var8++;
                          param1++;
                          continue L6;
                        }
                      } else {
                        var9++;
                        var8++;
                        param1++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
        }
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        if (((cl) this).field_G == param0) {
            jh.c((byte) 114);
            ((cl) this).field_H.h((byte) -126);
        }
        int var6 = 15 / ((param4 - -5) / 57);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Error connecting to server. Please try using a different server.";
    }
}

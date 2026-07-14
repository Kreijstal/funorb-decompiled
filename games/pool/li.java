/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    private int field_m;
    private int field_i;
    private int field_c;
    static int field_e;
    static jg field_l;
    static int field_d;
    static String field_g;
    static int[] field_h;
    private int[] field_j;
    private int[] field_a;
    static dd[] field_f;
    static int[] field_b;
    private int field_k;

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        field_l = null;
        field_h = null;
        field_b = null;
        if (param0 >= 0) {
            Object var2 = null;
            li.a(57, (al) null);
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        if (param1 <= 0) {
            throw new IllegalArgumentException();
        }
        int var3 = 2147483647 + -(int)(4294967296L % (long)param1);
        if (param0 != 23165) {
            Object var5 = null;
            li.a(73, (al) null);
        }
        do {
            var4 = ((li) this).a((byte) 7);
        } while (var4 > var3);
        return aj.a(true, param1, var4);
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((li) this).field_i = ((li) this).field_i + 1;
          ((li) this).field_k = ((li) this).field_k + (((li) this).field_i + 1);
          var2 = 0;
          if (param0) {
            break L0;
          } else {
            this.b(9);
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L2: {
              var3 = ((li) this).field_a[var2];
              if (0 == (var2 & 2)) {
                if (-1 != (var2 & 1 ^ -1)) {
                  ((li) this).field_m = ((li) this).field_m ^ ((li) this).field_m >>> 40925094;
                  break L2;
                } else {
                  ((li) this).field_m = ((li) this).field_m ^ ((li) this).field_m << 501519757;
                  break L2;
                }
              } else {
                if ((var2 & 1) != 0) {
                  ((li) this).field_m = ((li) this).field_m ^ ((li) this).field_m >>> -180764112;
                  break L2;
                } else {
                  ((li) this).field_m = ((li) this).field_m ^ ((li) this).field_m << -1948382238;
                  break L2;
                }
              }
            }
            ((li) this).field_m = ((li) this).field_m + ((li) this).field_a[255 & var2 + 128];
            var4 = ((li) this).field_k + (((li) this).field_a[rb.b(var3 >> -108857086, 255)] + ((li) this).field_m);
            ((li) this).field_a[var2] = ((li) this).field_k + (((li) this).field_a[rb.b(var3 >> -108857086, 255)] + ((li) this).field_m);
            ((li) this).field_k = ((li) this).field_a[rb.b(var4, 261279) >> -1635328984 >> -1893269758] - -var3;
            ((li) this).field_j[var2] = ((li) this).field_a[rb.b(var4, 261279) >> -1635328984 >> -1893269758] - -var3;
            var2++;
            continue L1;
          }
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (param0 == 2) {
            break L0;
          } else {
            ((li) this).field_j = null;
            break L0;
          }
        }
        var4 = -1640531527;
        var10 = -1640531527;
        var5 = -1640531527;
        var6 = -1640531527;
        var3 = -1640531527;
        var9 = -1640531527;
        var7 = -1640531527;
        var8 = -1640531527;
        var2 = 0;
        L1: while (true) {
          if (-5 >= (var2 ^ -1)) {
            var2 = 0;
            L2: while (true) {
              if (256 <= var2) {
                var2 = 0;
                L3: while (true) {
                  if (-257 >= (var2 ^ -1)) {
                    this.a(true);
                    ((li) this).field_c = 256;
                    return;
                  } else {
                    var10 = var10 + ((li) this).field_a[7 + var2];
                    var9 = var9 + ((li) this).field_a[6 + var2];
                    var3 = var3 + ((li) this).field_a[var2];
                    var8 = var8 + ((li) this).field_a[5 + var2];
                    var6 = var6 + ((li) this).field_a[3 + var2];
                    var4 = var4 + ((li) this).field_a[1 + var2];
                    var5 = var5 + ((li) this).field_a[var2 - -2];
                    var7 = var7 + ((li) this).field_a[4 + var2];
                    var3 = var3 ^ var4 << -1651270229;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 544412994;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -1057855992;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -964862896;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -1646857430;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -852077756;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 652486728;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -680524951;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((li) this).field_a[var2] = var3;
                    ((li) this).field_a[var2 - -1] = var4;
                    ((li) this).field_a[var2 - -2] = var5;
                    ((li) this).field_a[var2 - -3] = var6;
                    ((li) this).field_a[var2 - -4] = var7;
                    ((li) this).field_a[5 + var2] = var8;
                    ((li) this).field_a[6 + var2] = var9;
                    ((li) this).field_a[var2 - -7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var5 = var5 + ((li) this).field_j[var2 - -2];
                var4 = var4 + ((li) this).field_j[1 + var2];
                var6 = var6 + ((li) this).field_j[3 + var2];
                var7 = var7 + ((li) this).field_j[4 + var2];
                var9 = var9 + ((li) this).field_j[var2 - -6];
                var3 = var3 + ((li) this).field_j[var2];
                var8 = var8 + ((li) this).field_j[5 + var2];
                var10 = var10 + ((li) this).field_j[var2 - -7];
                var3 = var3 ^ var4 << -959907445;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> -1554675550;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << -223549816;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -1140678608;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 668514250;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> 28744068;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << -1689625752;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 1087558313;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((li) this).field_a[var2] = var3;
                ((li) this).field_a[1 + var2] = var4;
                ((li) this).field_a[var2 + 2] = var5;
                ((li) this).field_a[3 + var2] = var6;
                ((li) this).field_a[var2 - -4] = var7;
                ((li) this).field_a[5 + var2] = var8;
                ((li) this).field_a[var2 - -6] = var9;
                ((li) this).field_a[7 + var2] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << 1779179979;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 1259482210;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 907384072;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -410848688;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -1529826422;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 895604548;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 1303649768;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -1697672855;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L1;
          }
        }
    }

    final static void a(eg param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int[] var15 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        float[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        float[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        var12 = Pool.field_O;
        var2 = 0;
        var3 = param1;
        L0: while (true) {
          if (param0.field_K <= var3) {
            param0.field_o = sh.a((byte) 60, param0.field_o, var2);
            param0.field_p = ap.a(param0.field_p, (byte) -73, var2 * 3);
            param0.field_H = ap.a(param0.field_H, (byte) -73, var2 * 3);
            param0.field_C = ap.a(param0.field_C, (byte) -73, var2 * 3);
            param0.field_g = jh.a(var2 * 3, (byte) 108, param0.field_g);
            param0.field_Y = jh.a(3 * var2, (byte) 108, param0.field_Y);
            param0.field_q = jh.a(var2 * 3, (byte) 108, param0.field_q);
            var13 = 0;
            var2 = var13;
            L1: while (true) {
              if (param0.field_K <= var13) {
                return;
              } else {
                if (param0.field_L[var13] != -1) {
                  var3 = param0.field_k[var13];
                  var38 = new float[3];
                  var41 = new float[3];
                  var43 = new int[3];
                  var35 = var43;
                  var27 = var35;
                  var19 = var27;
                  var6 = var19;
                  var45 = new int[3];
                  var37 = var45;
                  var29 = var37;
                  var21 = var29;
                  var7 = var21;
                  var40 = new int[3];
                  var32 = var40;
                  var24 = var32;
                  var16 = var24;
                  var8 = var16;
                  var42 = new int[3];
                  var34 = var42;
                  var26 = var34;
                  var18 = var26;
                  var9 = var18;
                  var44 = new int[3];
                  var36 = var44;
                  var28 = var36;
                  var20 = var28;
                  var10 = var20;
                  var39 = new int[3];
                  var31 = var39;
                  var23 = var31;
                  var15 = var23;
                  var11 = var15;
                  var6[0] = param0.field_g[param0.field_N[var13]];
                  var6[1] = param0.field_g[param0.field_v[var13]];
                  var6[2] = param0.field_g[param0.field_X[var13]];
                  var7[0] = param0.field_Y[param0.field_N[var13]];
                  var7[1] = param0.field_Y[param0.field_v[var13]];
                  var7[2] = param0.field_Y[param0.field_X[var13]];
                  var8[0] = param0.field_q[param0.field_N[var13]];
                  var8[1] = param0.field_q[param0.field_v[var13]];
                  var8[2] = param0.field_q[param0.field_X[var13]];
                  var9[0] = param0.field_g[param0.field_p[var3]];
                  var9[1] = param0.field_g[param0.field_H[var3]];
                  var9[2] = param0.field_g[param0.field_C[var3]];
                  var10[0] = param0.field_Y[param0.field_p[var3]];
                  var10[1] = param0.field_Y[param0.field_H[var3]];
                  var10[2] = param0.field_Y[param0.field_C[var3]];
                  var11[0] = param0.field_q[param0.field_p[var3]];
                  var11[1] = param0.field_q[param0.field_H[var3]];
                  var11[2] = param0.field_q[param0.field_C[var3]];
                  ge.a(var38, var39, var40, var41, var42, var43, var44, (byte) 111, var45);
                  ob.a(var39, var44, var40, var45, var38, var43, var41, 0, var42);
                  param0.field_k[var13] = param0.a((short)param0.a(jo.c(0, -54264319, var42[0]), jo.c(0, -54264319, var44[0]), jo.c(0, -54264319, var39[0])), (short)param0.a(jo.c(0, cq.a(param1, -54264319), var42[1]), jo.c(0, -54264319, var44[1]), jo.c(0, -54264319, var39[1])), (short)param0.a(jo.c(0, -54264319, var42[2]), jo.c(0, -54264319, var44[2]), jo.c(0, -54264319, var39[2])));
                  var13++;
                  continue L1;
                } else {
                  var13++;
                  continue L1;
                }
              }
            }
          } else {
            if (0 != (param0.field_L[var3] ^ -1)) {
              var2++;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    li(int[] param0) {
        int var2 = 0;
        ((li) this).field_j = new int[256];
        ((li) this).field_a = new int[256];
        for (var2 = 0; var2 < param0.length; var2++) {
            ((li) this).field_j[var2] = param0[var2];
        }
        this.b(2);
    }

    final int a(byte param0) {
        if (param0 != 7) {
            return -38;
        }
        if (-1 == (((li) this).field_c ^ -1)) {
            this.a(true);
            ((li) this).field_c = 256;
        }
        ((li) this).field_c = ((li) this).field_c - 1;
        return ((li) this).field_j[((li) this).field_c - 1];
    }

    final static void a(int param0, al param1) {
        aa var3 = null;
        qe var4 = null;
        oq var5 = null;
        L0: {
          if (param0 == 2243) {
            break L0;
          } else {
            field_d = 116;
            break L0;
          }
        }
        L1: {
          var5 = new oq(4096);
          var3 = new aa(param1.field_u);
          if (param1.field_f instanceof af) {
            var5.a(0, false);
            break L1;
          } else {
            if (!(param1.field_f instanceof fj)) {
              if (param1.field_f instanceof rj) {
                var5.a(2, false);
                break L1;
              } else {
                if (!(param1.field_f instanceof mc)) {
                  if (param1.field_f instanceof vp) {
                    var5.a(4, false);
                    break L1;
                  } else {
                    var5.a(-1, false);
                    break L1;
                  }
                } else {
                  var5.a(3, false);
                  break L1;
                }
              }
            } else {
              var5.a(1, false);
              break L1;
            }
          }
        }
        var4 = (qe) (Object) var3.b((byte) -92);
        L2: while (true) {
          if (var4 == null) {
            var5.a(true, -1);
            System.out.println("pool2:" + np.a(false, var5));
            return;
          } else {
            L3: {
              var5.a(true, var4.field_v);
              var5.a(var4.field_L, false);
              var5.a((byte) -81, var4.field_M);
              var5.a(true, var4.field_P);
              var5.a(true, var4.field_Q);
              var5.a((byte) -81, (int) var4.field_C);
              var5.a((byte) -81, (int) var4.field_A);
              var5.a((byte) -81, (int) var4.field_V);
              var5.a((int) var4.field_D, false);
              var5.a((int) var4.field_H, false);
              var5.a(var4.field_q, false);
              if ((var4.field_q ^ -1) > -3) {
                break L3;
              } else {
                var4.b((ge) (Object) var5, (byte) -122);
                var5.a(var4.field_x, (byte) -122);
                break L3;
              }
            }
            L4: {
              if ((var4.field_q ^ -1) > -4) {
                break L4;
              } else {
                var4.a((ge) (Object) var5, (byte) 0);
                break L4;
              }
            }
            var4 = (qe) (Object) var3.b(-126);
            continue L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "ESC - cancel private message";
        field_d = 0;
        field_h = new int[8192];
    }
}

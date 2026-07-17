/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    private vj field_n;
    private int field_c;
    private boolean field_q;
    static boolean field_h;
    private boolean field_b;
    static je field_m;
    private int field_g;
    private int field_o;
    private boolean field_d;
    private int field_p;
    private int field_f;
    static int field_l;
    private gd field_e;
    static kl field_j;
    private int field_k;
    static int[] field_a;
    private int field_i;
    static int[] field_r;

    private final void a() {
        int var2 = ((sh) this).field_n.field_i >> 16;
        int discarded$0 = 1;
        wp var3 = we.a(var2);
        int discarded$1 = -34;
        io.a(var3);
    }

    final void b(int param0) {
        int var2 = 0;
        if (!((sh) this).field_b) {
          return;
        } else {
          var2 = ((sh) this).field_n.a(-105) ? 1 : 0;
          if (param0 == -19812) {
            L0: {
              if (var2 != 0) {
                this.a((byte) -125, ((sh) this).field_k);
                break L0;
              } else {
                break L0;
              }
            }
            if (((sh) this).field_n.field_c) {
              if (3 == ((sh) this).field_o) {
                if (((sh) this).field_n.field_m != je.field_K[((sh) this).field_c][0]) {
                  if (((sh) this).field_o == 4) {
                    if (((sh) this).field_n.field_m == je.field_K[((sh) this).field_c][1]) {
                      dh.a(((sh) this).field_c, 7, 32);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  dh.a(((sh) this).field_c, 4, 32);
                  if (((sh) this).field_o == 4) {
                    if (((sh) this).field_n.field_m == je.field_K[((sh) this).field_c][1]) {
                      dh.a(((sh) this).field_c, 7, 32);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (((sh) this).field_o == 4) {
                  if (((sh) this).field_n.field_m != je.field_K[((sh) this).field_c][1]) {
                    return;
                  } else {
                    dh.a(((sh) this).field_c, 7, 32);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            L1: {
              ((sh) this).field_p = -51;
              if (var2 != 0) {
                this.a((byte) -125, ((sh) this).field_k);
                break L1;
              } else {
                break L1;
              }
            }
            if (((sh) this).field_n.field_c) {
              if (3 == ((sh) this).field_o) {
                if (((sh) this).field_n.field_m != je.field_K[((sh) this).field_c][0]) {
                  if (((sh) this).field_o == 4) {
                    if (((sh) this).field_n.field_m != je.field_K[((sh) this).field_c][1]) {
                      return;
                    } else {
                      dh.a(((sh) this).field_c, 7, 32);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  dh.a(((sh) this).field_c, 4, 32);
                  if (((sh) this).field_o == 4) {
                    if (((sh) this).field_n.field_m != je.field_K[((sh) this).field_c][1]) {
                      return;
                    } else {
                      dh.a(((sh) this).field_c, 7, 32);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (((sh) this).field_o == 4) {
                  if (((sh) this).field_n.field_m != je.field_K[((sh) this).field_c][1]) {
                    return;
                  } else {
                    dh.a(((sh) this).field_c, 7, 32);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            ((sh) this).field_q = true;
            ((sh) this).field_d = false;
            return;
        }
        ((sh) this).field_d = false;
    }

    final void a(int param0, int param1) {
        ((sh) this).field_c = param1;
        if (!(mn.field_k[((sh) this).field_c] != null)) {
            ((sh) this).field_c = 24;
        }
        ((sh) this).field_e = (gd) (Object) mn.field_k[((sh) this).field_c][param0];
        ((sh) this).field_q = nh.field_D[((sh) this).field_c];
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var18 = null;
        gd var18_ref = null;
        gd var19 = null;
        Object var20 = null;
        gd var20_ref = null;
        gd var21 = null;
        Object var22 = null;
        gd var22_ref = null;
        gd var23 = null;
        Object var24 = null;
        gd var24_ref = null;
        gd var25 = null;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var18 = null;
        var20 = null;
        var22 = null;
        var24 = null;
        if (!((sh) this).field_d) {
          if (param0 < 92) {
            L0: {
              field_l = 22;
              var2 = 0;
              var3 = 0;
              var4 = 0;
              var5 = th.a(((sh) this).field_p, 1, 2048);
              var6 = 1024;
              var7 = 2048;
              var8 = 12;
              var9 = th.a(((sh) this).field_f + -(var7 / var8) + var7, 1, 2048);
              var10 = 0;
              if (((sh) this).field_q) {
                stackOut_12_0 = 400;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                stackOut_11_0 = 300;
                stackIn_13_0 = stackOut_11_0;
                break L0;
              }
            }
            L1: {
              var11 = stackIn_13_0 + -(((sh) this).field_f * 2);
              var12 = -400;
              if (!((sh) this).field_b) {
                tm.a();
                tm.c(((sh) this).field_i, ((sh) this).field_g);
                var20_ref = (gd) (Object) ((sh) this).field_e.a(var2 != 0, false, var3 != 0);
                var21 = var20_ref;
                var20_ref.b(hk.field_Jb[((sh) this).field_c], hk.field_Jb[((sh) this).field_c], hk.field_Jb[((sh) this).field_c]);
                var21.a(var4, var5, var6, var9, var10, var11, var12);
                break L1;
              } else {
                var18_ref = (gd) (Object) ((sh) this).field_n.a(var2 != 0, true, var3 != 0, (kk) (Object) ((sh) this).field_e);
                var19 = var18_ref;
                var18_ref.b(hk.field_Jb[((sh) this).field_c], hk.field_Jb[((sh) this).field_c], hk.field_Jb[((sh) this).field_c]);
                tm.a();
                tm.c(((sh) this).field_i, ((sh) this).field_g);
                var19.a(var4, var5, var6, var9, var10, var11, var12);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              var2 = 0;
              var3 = 0;
              var4 = 0;
              var5 = th.a(((sh) this).field_p, 1, 2048);
              var6 = 1024;
              var7 = 2048;
              var8 = 12;
              var9 = th.a(((sh) this).field_f + -(var7 / var8) + var7, 1, 2048);
              var10 = 0;
              if (((sh) this).field_q) {
                stackOut_5_0 = 400;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = 300;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var11 = stackIn_6_0 + -(((sh) this).field_f * 2);
              var12 = -400;
              if (!((sh) this).field_b) {
                tm.a();
                tm.c(((sh) this).field_i, ((sh) this).field_g);
                var24_ref = (gd) (Object) ((sh) this).field_e.a(var2 != 0, false, var3 != 0);
                var25 = var24_ref;
                var24_ref.b(hk.field_Jb[((sh) this).field_c], hk.field_Jb[((sh) this).field_c], hk.field_Jb[((sh) this).field_c]);
                var25.a(var4, var5, var6, var9, var10, var11, var12);
                break L3;
              } else {
                var22_ref = (gd) (Object) ((sh) this).field_n.a(var2 != 0, true, var3 != 0, (kk) (Object) ((sh) this).field_e);
                var23 = var22_ref;
                var22_ref.b(hk.field_Jb[((sh) this).field_c], hk.field_Jb[((sh) this).field_c], hk.field_Jb[((sh) this).field_c]);
                tm.a();
                tm.c(((sh) this).field_i, ((sh) this).field_g);
                var23.a(var4, var5, var6, var9, var10, var11, var12);
                break L3;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        qb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!((sh) this).field_b) {
          return;
        } else {
          ((sh) this).field_k = param1;
          var3 = sf.field_P[((sh) this).field_c];
          var4 = ck.field_e[var3][((sh) this).field_k];
          var5 = 81 % ((param0 - -53) / 59);
          ((sh) this).field_n.a(-1, var4);
          int discarded$1 = 122;
          this.a();
          var6 = ((sh) this).field_o;
          if (var6 != 1) {
            if (2 != var6) {
              if (var6 != 3) {
                if (var6 != 5) {
                  if (var6 != 6) {
                    if (var6 == 7) {
                      dh.a(((sh) this).field_c, 5, 32);
                      dh.a(((sh) this).field_c, 2, 32);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    dh.a(((sh) this).field_c, 2, 32);
                    dh.a(((sh) this).field_c, 1, 32);
                    return;
                  }
                } else {
                  dh.a(((sh) this).field_c, 6, 32);
                  return;
                }
              } else {
                dh.a(((sh) this).field_c, 3, 32);
                return;
              }
            } else {
              dh.a(((sh) this).field_c, 0, 32);
              return;
            }
          } else {
            dh.a(((sh) this).field_c, 0, 32);
            return;
          }
        }
    }

    final void a(int param0) {
        int var2 = 34 % ((param0 - 45) / 36);
        ((sh) this).field_b = true;
    }

    final void a(int param0, int param1, byte param2) {
        ((sh) this).field_o = param1;
        this.a((byte) -114, param0);
        if (param2 < 43) {
            ((sh) this).a(-118);
        }
    }

    public static void b() {
        field_a = null;
        field_j = null;
        field_r = null;
        field_m = null;
    }

    final static je d() {
        return ne.field_f.field_Jb;
    }

    private final void c() {
        ((sh) this).field_d = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((sh) this).field_p = param4;
        ((sh) this).field_i = param5;
        if (param3 != -29001) {
          ((sh) this).field_f = 36;
          ((sh) this).field_g = param2;
          ((sh) this).field_f = param0;
          return;
        } else {
          ((sh) this).field_g = param2;
          ((sh) this).field_f = param0;
          return;
        }
    }

    sh() {
        ((sh) this).field_n = new vj(1);
        ((sh) this).a(0, 0);
        ((sh) this).a(-28);
        ((sh) this).a(0, 0, (byte) 115);
        ((sh) this).a(0, 1, so.field_b.field_g >> 1, -29001, 0, so.field_b.field_a >> 1);
        int discarded$0 = -79;
        this.c();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 360;
        field_a = new int[256];
        field_r = new int[]{8};
    }
}

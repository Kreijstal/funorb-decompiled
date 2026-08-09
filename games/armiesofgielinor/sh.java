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

    private final void a(byte param0) {
        int var2;
        wp var3;
        if (param0 < 20) {
          field_m = (je) null;
          var2 = this.field_n.field_i >> -286506128;
          var3 = we.a(var2, true);
          io.a(var3, (byte) -34);
          return;
        } else {
          var2 = this.field_n.field_i >> -286506128;
          var3 = we.a(var2, true);
          io.a(var3, (byte) -34);
          return;
        }
    }

    final void b(int param0) {
        int var2;
        if (!this.field_b) {
          return;
        } else {
          var2 = this.field_n.a(-105) ? 1 : 0;
          if (param0 == -19812) {
            L0: {
              if (var2 != 0) {
                this.a((byte) -125, this.field_k);
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_n.field_c) {
              if (3 == this.field_o) {
                if (this.field_n.field_m != je.field_K[this.field_c][0]) {
                  if (this.field_o == 4) {
                    if (this.field_n.field_m == je.field_K[this.field_c][1]) {
                      dh.a(this.field_c, 7, 32);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  dh.a(this.field_c, 4, 32);
                  if (this.field_o == 4) {
                    if (this.field_n.field_m == je.field_K[this.field_c][1]) {
                      dh.a(this.field_c, 7, 32);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (this.field_o == 4) {
                  if (this.field_n.field_m != je.field_K[this.field_c][1]) {
                    return;
                  } else {
                    dh.a(this.field_c, 7, 32);
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
              this.field_p = -51;
              if (var2 != 0) {
                this.a((byte) -125, this.field_k);
                break L1;
              } else {
                break L1;
              }
            }
            if (this.field_n.field_c) {
              if (3 == this.field_o) {
                if (this.field_n.field_m != je.field_K[this.field_c][0]) {
                  if (this.field_o == 4) {
                    if (this.field_n.field_m != je.field_K[this.field_c][1]) {
                      return;
                    } else {
                      dh.a(this.field_c, 7, 32);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  dh.a(this.field_c, 4, 32);
                  if (this.field_o == 4) {
                    if (this.field_n.field_m != je.field_K[this.field_c][1]) {
                      return;
                    } else {
                      dh.a(this.field_c, 7, 32);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (this.field_o == 4) {
                  if (this.field_n.field_m != je.field_K[this.field_c][1]) {
                    return;
                  } else {
                    dh.a(this.field_c, 7, 32);
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
            this.field_q = true;
            this.field_d = false;
            return;
        }
        this.field_d = false;
    }

    final void a(int param0, int param1) {
        this.field_c = param1;
        if (!(mn.field_k[this.field_c] != null)) {
            this.field_c = 24;
        }
        this.field_e = (gd) ((Object) mn.field_k[this.field_c][param0]);
        this.field_q = nh.field_D[this.field_c];
    }

    final void e(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        Object var18;
        gd var18_ref;
        gd var19;
        Object var20;
        gd var20_ref;
        gd var21;
        Object var22;
        gd var22_ref;
        gd var23;
        Object var24;
        gd var24_ref;
        gd var25;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        var18 = null;
        var20 = null;
        var22 = null;
        var24 = null;
        if (!this.field_d) {
          if (param0 < 92) {
            L0: {
              field_l = 22;
              var2 = 0;
              var3 = 0;
              var4 = 0;
              var5 = th.a(this.field_p, 1, 2048);
              var6 = 1024;
              var7 = 2048;
              var8 = 12;
              var9 = th.a(this.field_f + -(var7 / var8) + var7, 1, 2048);
              var10 = 0;
              if (this.field_q) {
                stackIn_13_0 = 400;
                break L0;
              } else {
                stackIn_13_0 = 300;
                break L0;
              }
            }
            L1: {
              var11 = stackIn_13_0 + -(this.field_f * 2);
              var12 = -400;
              if (!this.field_b) {
                tm.a();
                tm.c(this.field_i, this.field_g);
                var20_ref = (gd) ((Object) this.field_e.a(var2 != 0, false, var3 != 0));
                var21 = var20_ref;
                var20_ref.b(hk.field_Jb[this.field_c], hk.field_Jb[this.field_c], hk.field_Jb[this.field_c]);
                var21.a(var4, var5, var6, var9, var10, var11, var12);
                break L1;
              } else {
                var18_ref = (gd) ((Object) this.field_n.a(var2 != 0, true, var3 != 0, this.field_e));
                var19 = var18_ref;
                var18_ref.b(hk.field_Jb[this.field_c], hk.field_Jb[this.field_c], hk.field_Jb[this.field_c]);
                tm.a();
                tm.c(this.field_i, this.field_g);
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
              var5 = th.a(this.field_p, 1, 2048);
              var6 = 1024;
              var7 = 2048;
              var8 = 12;
              var9 = th.a(this.field_f + -(var7 / var8) + var7, 1, 2048);
              var10 = 0;
              if (this.field_q) {
                stackIn_6_0 = 400;
                break L2;
              } else {
                stackIn_6_0 = 300;
                break L2;
              }
            }
            L3: {
              var11 = stackIn_6_0 + -(this.field_f * 2);
              var12 = -400;
              if (!this.field_b) {
                tm.a();
                tm.c(this.field_i, this.field_g);
                var24_ref = (gd) ((Object) this.field_e.a(var2 != 0, false, var3 != 0));
                var25 = var24_ref;
                var24_ref.b(hk.field_Jb[this.field_c], hk.field_Jb[this.field_c], hk.field_Jb[this.field_c]);
                var25.a(var4, var5, var6, var9, var10, var11, var12);
                break L3;
              } else {
                var22_ref = (gd) ((Object) this.field_n.a(var2 != 0, true, var3 != 0, this.field_e));
                var23 = var22_ref;
                var22_ref.b(hk.field_Jb[this.field_c], hk.field_Jb[this.field_c], hk.field_Jb[this.field_c]);
                tm.a();
                tm.c(this.field_i, this.field_g);
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
        int var3;
        qb var4;
        int var5;
        int var6;
        int var7;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!this.field_b) {
          return;
        } else {
          this.field_k = param1;
          var3 = sf.field_P[this.field_c];
          var4 = ck.field_e[var3][this.field_k];
          var5 = 81 % ((param0 - -53) / 59);
          this.field_n.a(-1, var4);
          this.a((byte) 122);
          var6 = this.field_o;
          if (-2 != (var6 ^ -1)) {
            if (2 != var6) {
              if (var6 != 3) {
                if ((var6 ^ -1) != -6) {
                  if (var6 != 6) {
                    if (var6 == 7) {
                      dh.a(this.field_c, 5, 32);
                      dh.a(this.field_c, 2, 32);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    dh.a(this.field_c, 2, 32);
                    dh.a(this.field_c, 1, 32);
                    return;
                  }
                } else {
                  dh.a(this.field_c, 6, 32);
                  return;
                }
              } else {
                dh.a(this.field_c, 3, 32);
                return;
              }
            } else {
              dh.a(this.field_c, 0, 32);
              return;
            }
          } else {
            dh.a(this.field_c, 0, 32);
            return;
          }
        }
    }

    final void a(int param0) {
        int var2 = 34 % ((param0 - 45) / 36);
        this.field_b = true;
    }

    final void a(int param0, int param1, byte param2) {
        this.field_o = param1;
        this.a((byte) -114, param0);
        if (param2 < 43) {
            this.a(-118);
        }
    }

    public static void b(byte param0) {
        if (param0 != 40) {
            return;
        }
        field_a = null;
        field_j = null;
        field_r = null;
        field_m = null;
    }

    final static je d(byte param0) {
        if (param0 < 69) {
            sh.b((byte) 50);
            return ne.field_f.field_Jb;
        }
        return ne.field_f.field_Jb;
    }

    private final void c(byte param0) {
        if (param0 != -79) {
            return;
        }
        this.field_d = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_p = param4;
        this.field_i = param5;
        if (param3 != -29001) {
          this.field_f = 36;
          this.field_g = param2;
          this.field_f = param0;
          return;
        } else {
          this.field_g = param2;
          this.field_f = param0;
          return;
        }
    }

    sh() {
        this.field_n = new vj(1);
        this.a(0, 0);
        this.a(-28);
        this.a(0, 0, (byte) 115);
        this.a(0, 1, so.field_b.field_g >> -1399586783, -29001, 0, so.field_b.field_a >> -230587967);
        this.c((byte) -79);
    }

    static {
        field_l = 360;
        field_a = new int[256];
        field_r = new int[]{8};
    }
}

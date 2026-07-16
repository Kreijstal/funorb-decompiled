/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static String[] field_C;
    private boolean field_i;
    private int field_v;
    private int field_p;
    private boolean field_r;
    private gl field_c;
    private int field_h;
    private boolean field_b;
    private jl field_B;
    private int field_g;
    private int[] field_A;
    private int field_k;
    private jl field_f;
    private jl field_s;
    private int field_u;
    private boolean field_w;
    static al field_q;
    private boolean field_x;
    private int field_t;
    private wd field_o;
    private wc field_d;
    private gf field_y;
    private boolean field_j;
    private dk field_z;
    private int field_e;
    static int field_a;
    private dk[] field_l;
    private jl field_n;
    private int field_m;
    private int field_D;

    private final void a(byte param0) {
        tc[] var2 = this.b(false);
        String[] var3 = new String[]{gk.field_b, bj.field_D, nl.field_a, kc.field_a, ob.field_c, gn.field_l, hb.field_a};
        this.a(var3, (byte) -10);
        ih var4 = fh.field_g;
        int var5 = 16777215;
        int var6 = this.g((byte) 49);
        ((dn) this).field_o = new wd(vb.field_a, var2, var3);
        if (param0 <= 111) {
            return;
        }
        ((dn) this).field_o.a(var6, var4, var5, 117);
    }

    private final void k(int param0) {
        String var2 = this.i((byte) 114);
        String[] var3 = this.j(27679);
        ((dn) this).field_n = new jl(var2, var3);
        if (param0 > -63) {
            ((dn) this).field_m = -57;
        }
        this.a(((dn) this).field_n, 16777215);
    }

    final static int a(int param0) {
        if (param0 != 0) {
            dn.h(-11);
        }
        return vi.field_a - ia.field_x;
    }

    private final void e(byte param0) {
        int var2 = 107 % ((11 - param0) / 36);
        ((dn) this).field_k = 0;
        ((dn) this).field_k = t.a(((dn) this).field_c.a(true), ((dn) this).field_k, 63);
        ((dn) this).field_k = t.a(((dn) this).field_o.a(true), ((dn) this).field_k, 37);
        ((dn) this).field_k = t.a(((dn) this).field_n.a(true), ((dn) this).field_k, 54);
        ((dn) this).field_k = t.a(((dn) this).field_f.a(true), ((dn) this).field_k, 24);
        if (!(!((dn) this).field_b)) {
            ((dn) this).field_k = t.a(((dn) this).field_B.a(true), ((dn) this).field_k, 89);
            ((dn) this).field_k = t.a(((dn) this).field_s.a(true), ((dn) this).field_k, 14);
        }
    }

    final static qh[] a(int param0, boolean[] param1, String[] param2, mf param3, int param4, int[] param5, String[] param6) {
        int var8 = 0;
        qh var9 = null;
        int var10 = EscapeVector.field_A;
        qh[] var11 = new qh[param6.length];
        qh[] var7 = var11;
        for (var8 = param0; param6.length > var8; var8++) {
            var9 = new qh(param3, param6[var8], param2[var8], param4, param1[var8], param5);
            var11[var8] = var9;
        }
        return var7;
    }

    private final int[] a(int param0, boolean param1, int param2, int param3, int param4, ih param5) {
        int var16 = 0;
        String var17 = null;
        ((dn) this).field_l = new dk[2];
        int var7 = 3;
        int var8 = param2;
        if (!param1) {
            String[] discarded$0 = this.j(104);
        }
        int var9 = param0 * var8;
        int var10 = var8 + 1;
        int var11 = 10;
        int var12 = param4;
        int var13 = 0;
        if (((dn) this).field_m < -1 + ((dn) this).field_D) {
            var13++;
        }
        if (-1 > ((dn) this).field_m) {
            var13++;
        }
        int[] var14 = new int[var13];
        int var15 = 0;
        if (!(-1 >= ((dn) this).field_m)) {
            var16 = var11 + param3;
            var17 = ja.field_b;
            int incrementValue$1 = var8;
            var8++;
            this.a(var17, var12, var10, var7, var9, var16, param5, ((dn) this).field_p, 0, 10551200, incrementValue$1);
            int incrementValue$2 = var15;
            var15++;
            var14[incrementValue$2] = ((dn) this).field_p;
        }
        if (!(((dn) this).field_m >= ((dn) this).field_D + -1)) {
            var16 = -var11 + ((dn) this).field_k + param3;
            var17 = fj.field_kb;
            int incrementValue$3 = var8;
            var8++;
            this.a(var17, var12, var10, var7, var9, var16, param5, ((dn) this).field_u, 1, 10551200, incrementValue$3);
            int incrementValue$4 = var15;
            var15++;
            var14[incrementValue$4] = ((dn) this).field_u;
        }
        return var14;
    }

    private final int f(byte param0) {
        if (param0 != 70) {
            field_C = null;
        }
        oe var2 = ma.field_a;
        if (var2 != null) {
            return 12110032;
        }
        return 10551200;
    }

    private final void g(int param0) {
        int[] var2 = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        dk[] var6 = null;
        int var7 = 0;
        dk var8 = null;
        int var9 = 0;
        L0: {
          var9 = EscapeVector.field_A;
          if (!((dn) this).field_w) {
            var2 = new int[]{3170352, 8421504, 8421504};
            var4 = new int[]{6340704, 16777215, 16777215};
            var3 = new int[]{6340704, 16777215, 16777215};
            break L0;
          } else {
            var5 = this.g((byte) 104);
            var6_int = this.f((byte) 70);
            var4 = new int[]{var5, var6_int, var6_int};
            var3 = new int[]{var5, var6_int, var6_int};
            var2 = new int[]{var5, var6_int, var6_int};
            break L0;
          }
        }
        L1: {
          var5 = 75 / ((-81 - param0) / 43);
          if (null != ((dn) this).field_l) {
            var6 = ((dn) this).field_l;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6.length) {
                break L1;
              } else {
                var8 = var6[var7];
                if (var8 != null) {
                  var8.a(var3, var2, (byte) -128, var4);
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        L3: {
          if (null == ((dn) this).field_z) {
            break L3;
          } else {
            ((dn) this).field_z.a(var3, var2, (byte) -125, var4);
            break L3;
          }
        }
    }

    private final void a(boolean param0, int param1) {
        di.field_d = null;
        ch.field_b = param0 ? true : false;
        if (((dn) this).field_g == param1) {
            da.field_c.b(false, 320);
        }
        if (!(((dn) this).field_e != param1)) {
            pl.field_q.b(-26480, false);
        }
        mj.field_d = 0;
        gi.a((byte) -118);
    }

    private final int a(int param0, int param1, int param2) {
        dk[] var4 = null;
        int var5 = 0;
        dk var6 = null;
        int var7 = 0;
        L0: {
          var7 = EscapeVector.field_A;
          var4 = ((dn) this).field_l;
          var5 = 0;
          if (param0 >= 2) {
            break L0;
          } else {
            dn.h(-72);
            break L0;
          }
        }
        L1: while (true) {
          if (var5 >= var4.length) {
            L2: {
              if (null != ((dn) this).field_z) {
                if (!((dn) this).field_z.a((byte) 65, param1, param2)) {
                  break L2;
                } else {
                  return ((dn) this).field_z.field_c;
                }
              } else {
                break L2;
              }
            }
            return -1;
          } else {
            var6 = var4[var5];
            if (var6 != null) {
              if (var6.a((byte) 65, param1, param2)) {
                return var6.field_c;
              } else {
                var5++;
                continue L1;
              }
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    private final void i(int param0) {
        int var3_int = 0;
        hh var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hj var7 = null;
        int var2 = mj.field_d;
        if (!(var2 != 0)) {
            var3_int = 8192;
            sj.a(var3_int, (byte) 51);
        }
        de.field_j = true;
        if (null != ma.field_a) {
            if (!(var2 < 20)) {
                de.field_j = false;
            }
        }
        if (param0 == (var2 ^ -1)) {
            var3 = pc.field_a;
            var4 = 100;
            var5 = 6144 * qm.field_c / 64;
            var6 = 8192;
            var7 = rk.field_e;
            var7.a(var3, var4, var5, var6);
        }
        if (!((var2 ^ -1) <= -1001)) {
            mj.field_d = mj.field_d + 1;
        }
    }

    private final void l(int param0) {
        hj var2 = rk.field_e;
        hh var3 = oa.field_w;
        int var4 = 100;
        int var5 = param0 * qm.field_c / 64;
        int var6 = 8192;
        var2.a(var3, var4, var5, var6);
    }

    private final ed[] a(int param0, int param1) {
        ed[] var3 = null;
        if (!(!hi.a(param1, -2))) {
            var3 = mb.field_f;
            return this.a(var3, param0 + 4802);
        }
        if (!bj.e((byte) -75)) {
            return null;
        }
        if (!(-3 != (param1 ^ -1))) {
            var3 = mb.field_f;
            return this.a(var3, -126);
        }
        if ((param1 ^ -1) == -4) {
            var3 = ob.field_b;
            return this.a(var3, -113);
        }
        if (param0 == -4898) {
            return null;
        }
        return null;
    }

    private final ed[] a(ed[] param0, int param1) {
        int var3 = 0;
        ed[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ed var7 = null;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        if (param0 != null) {
          L0: {
            var3 = 7;
            var4 = new ed[var3];
            var5 = 0;
            if (param1 <= -88) {
              break L0;
            } else {
              this.l(-88);
              break L0;
            }
          }
          var6 = 0;
          L1: while (true) {
            if (param0.length <= var6) {
              return var4;
            } else {
              L2: {
                if (mf.a(var6, -64)) {
                  break L2;
                } else {
                  if (1 == var6) {
                    break L2;
                  } else {
                    if (5 == var6) {
                      break L2;
                    } else {
                      var6++;
                      continue L1;
                    }
                  }
                }
              }
              var7 = param0[var6];
              if ((var5 ^ -1) <= -1) {
                if (var5 <= var3) {
                  if (var7 != null) {
                    int incrementValue$1 = var5;
                    var5++;
                    var4[incrementValue$1] = var7;
                    var6++;
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  var6++;
                  continue L1;
                }
              } else {
                var6++;
                continue L1;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final void e(int param0) {
        ((dn) this).field_h = param0;
        ((dn) this).field_h = ((dn) this).field_h + ((dn) this).field_c.b((byte) -90);
        ((dn) this).field_h = t.a(((dn) this).field_o.b((byte) -90), ((dn) this).field_h, 76);
        ((dn) this).field_h = t.a(((dn) this).field_n.b((byte) -90), ((dn) this).field_h, 62);
        int var2 = ((dn) this).field_f.b((byte) -90);
        var2 = var2 + ((dn) this).field_f.c((byte) 124);
        if (!(!((dn) this).field_b)) {
            var2 = var2 + ((dn) this).field_B.b((byte) -90);
            var2 = var2 + ((dn) this).field_B.c((byte) 109);
            var2 = var2 + ((dn) this).field_s.b((byte) -90);
        }
        ((dn) this).field_h = t.a(var2, ((dn) this).field_h, 81);
    }

    private final int b(int param0) {
        if (!(((dn) this).field_d != null)) {
            return -1;
        }
        if (!(((dn) this).field_A != null)) {
            return -1;
        }
        if (param0 < 57) {
            field_q = null;
        }
        int var2 = ((dn) this).field_d.field_h;
        if (0 > var2) {
            return -1;
        }
        if (var2 >= ((dn) this).field_A.length) {
            return -1;
        }
        return ((dn) this).field_A[var2];
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        if (!(((dn) this).field_A != null)) {
            return -1;
        }
        if (!(-1 != (((dn) this).field_A.length ^ -1))) {
            return -1;
        }
        if (param1 != -3844) {
            return -23;
        }
        for (var3 = 0; var3 < ((dn) this).field_A.length; var3++) {
            if (param0 == ((dn) this).field_A[var3]) {
                return var3;
            }
        }
        return -1;
    }

    final boolean f(int param0) {
        this.i(param0);
        int var2 = 0;
        this.d(-22600);
        var2 = this.b(false, 1) ? 1 : 0;
        var2 = this.h((byte) 67) ? 1 : 0;
        if (!(var2 == 0)) {
            return var2 != 0;
        }
        return var2 != 0;
    }

    private final void a(String param0, int param1, int param2, int param3, int param4, int param5, ih param6, int param7, int param8, int param9, int param10) {
        if (param9 != 10551200) {
            int discarded$0 = this.b(36);
        }
        dk var13 = new dk(param3, param10, param0, param4, param2, param6);
        dk var14 = var13;
        param1 = param1 - var14.field_i / 2;
        if (1 == param8) {
            param5 = param5 - var14.field_p;
        }
        var14.b((byte) 125, param5, param1);
        ((dn) this).field_l[param8] = var13;
    }

    private final void a(int param0, boolean param1) {
        int var3 = 640;
        int var4 = (-((dn) this).field_k + var3) / 2;
        int var5 = ((dn) this).field_t - ((dn) this).field_h / 2;
        int var6 = 0;
        int var7 = 10;
        ih var8 = fh.field_g;
        int[] var16 = this.a(var7, true, var6, var4, var5, var8);
        var6 = var6 + var16.length;
        int var10 = ((dn) this).field_t - -(((dn) this).field_h / 2);
        int[] var17 = this.a(33, var6, var10, var8, var7);
        var6 = var6 + var17.length;
        ((dn) this).field_A = new int[var6];
        int var12 = 0;
        var12 = this.a(var16, -3549, var12);
        int discarded$0 = this.a(var17, -3549, var12);
        int var13 = 21 / ((param0 - 49) / 46);
        this.g(105);
        this.a(param1, false);
    }

    private final void a(boolean param0, boolean param1) {
        ((dn) this).field_d = new wc(((dn) this).field_A.length);
        int var3 = -1;
        if (!((dn) this).field_w) {
            var3 = this.b(((dn) this).field_e, -3844);
        } else {
            var3 = this.b(((dn) this).field_g, -3844);
        }
        int var4 = this.a(104, dh.field_d, bj.field_y);
        ((dn) this).field_d.a(121, param0, var4, var3);
        if (param1) {
            tc[] discarded$0 = this.b(true);
        }
    }

    private final String[] j(int param0) {
        String[] var3 = null;
        String var3_ref = null;
        String[] var4 = null;
        oe var5 = null;
        oe var6 = null;
        L0: {
          if (param0 == 27679) {
            break L0;
          } else {
            ((dn) this).field_r = false;
            break L0;
          }
        }
        var5 = ma.field_a;
        var6 = var5;
        if (var6 != null) {
          L1: {
            var3 = null;
            if (var6.g((byte) -18)) {
              var3_ref = pf.field_h;
              break L1;
            } else {
              L2: {
                if (var6.field_Gb) {
                  break L2;
                } else {
                  if (!var6.field_Ib) {
                    if (var6.field_Pb >= 0) {
                      if (1 != var6.field_Ub) {
                        if (var6.field_ec) {
                          var3_ref = d.field_f[var5.m((byte) -84)];
                          break L1;
                        } else {
                          if (-2 != (var6.field_Q ^ -1)) {
                            var3_ref = sa.field_q;
                            break L1;
                          } else {
                            var3_ref = gl.field_r;
                            break L1;
                          }
                        }
                      } else {
                        var3_ref = pn.field_qb[var5.m((byte) -84)];
                        break L1;
                      }
                    } else {
                      var3_ref = bf.field_O;
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var3_ref = jf.field_M;
              break L1;
            }
          }
          if (12 <= var6.field_Pb) {
            var4 = new String[]{var3_ref, " ", fa.field_e};
            return var4;
          } else {
            var4 = new String[]{var3_ref};
            return var4;
          }
        } else {
          var3 = new String[]{on.field_c, fk.field_e};
          return var3;
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        dk[] var3_ref_dk__ = null;
        int var3 = 0;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var7 = EscapeVector.field_A;
        this.k((byte) 117);
        var2 = 0;
        var3_ref_dk__ = ((dn) this).field_l;
        var4 = 0;
        L0: while (true) {
          if (var3_ref_dk__.length <= var4) {
            L1: {
              if (!((dn) this).field_j) {
                break L1;
              } else {
                if (((dn) this).field_c != null) {
                  var2 = var2 + this.a(var2, (jl) (Object) ((dn) this).field_c, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!((dn) this).field_i) {
                break L2;
              } else {
                if (null != ((dn) this).field_o) {
                  var2 = var2 + this.a(var2, (jl) (Object) ((dn) this).field_o, 0);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (!((dn) this).field_r) {
                break L3;
              } else {
                if (((dn) this).field_n != null) {
                  var2 = var2 + this.a(var2, ((dn) this).field_n, 0);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (((dn) this).field_x) {
                var2 = var2 + this.a(var2, ((dn) this).field_f, 0);
                if (((dn) this).field_b) {
                  var2 = var2 + this.a(var2, ((dn) this).field_B, 0);
                  var2 = var2 + this.a(var2, ((dn) this).field_s, 0);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if (null == ((dn) this).field_z) {
                break L5;
              } else {
                L6: {
                  if (((dn) this).field_d.field_h != ((dn) this).field_z.field_c) {
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    break L6;
                  } else {
                    stackOut_27_0 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    break L6;
                  }
                }
                var3 = stackIn_29_0;
                ((dn) this).field_z.a(-16383, var3 != 0);
                var2 = ((dn) this).field_z.field_i + ((dn) this).field_z.field_l;
                break L5;
              }
            }
            L7: {
              if (param0 > 104) {
                break L7;
              } else {
                this.a((byte) 11, 95);
                break L7;
              }
            }
            return;
          } else {
            var5 = var3_ref_dk__[var4];
            if (var5 != null) {
              L8: {
                if (((dn) this).field_d.field_h != var5.field_c) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L8;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L8;
                }
              }
              var6 = stackIn_7_0;
              var5.a(-16383, var6 != 0);
              var2 = var5.field_l - -(var5.field_i / 2);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final int g(byte param0) {
        if (param0 < 14) {
            this.i(-81);
        }
        oe var2 = ma.field_a;
        if (var2 == null) {
            return 6340704;
        }
        return 7899280;
    }

    private final void b(byte param0) {
        ih var2 = fh.field_g;
        if (param0 != 88) {
            return;
        }
        int var3 = 16777215;
        int var4 = ((dn) this).field_y.field_g + ((dn) this).field_y.field_j + -((dn) this).field_v;
        int var5 = ((dn) this).field_y.field_k + (((dn) this).field_y.field_m + -((dn) this).field_v + -var2.field_x);
        String var6 = 1 + ((dn) this).field_m + "/" + ((dn) this).field_D;
        var2.b(var6, var4, var5, var3, -1);
    }

    private final void c(int param0) {
        String var2 = km.field_o;
        String[] var3 = new String[]{on.field_c};
        ((dn) this).field_f = new jl(var2, var3);
        this.a(((dn) this).field_f, param0 ^ 16762243);
        var3 = new String[]{mh.field_g};
        var2 = gl.field_s;
        ((dn) this).field_B = new jl(var2, var3);
        this.a(((dn) this).field_B, 16777215);
        var2 = pl.field_p;
        var3 = new String[]{ia.field_p + "<br>" + "<br>", fk.field_e};
        ((dn) this).field_s = new jl(var2, var3);
        if (param0 != 14972) {
            return;
        }
        this.a(((dn) this).field_s, 16777215);
    }

    private final void a(jl param0, int param1) {
        int var3 = param1;
        int var4 = this.g((byte) 84);
        ih var5 = fh.field_g;
        param0.a(var4, var5, var3, -87);
    }

    final static void a(String param0, int param1, float param2) {
        pl.field_t = param2;
        if (param1 != 17637) {
            return;
        }
        hd.field_e = param0;
    }

    private final String i(byte param0) {
        int var3 = -97 / ((-76 - param0) / 44);
        oe var2 = ma.field_a;
        if (var2 == null) {
            return oc.field_v;
        }
        return ua.field_b;
    }

    private final tc[] b(boolean param0) {
        int var7 = 0;
        ed var8 = null;
        Object var9 = null;
        ed[] var10 = null;
        tc var11 = null;
        int var12 = EscapeVector.field_A;
        if (param0) {
            return null;
        }
        ed[] var13 = this.a(-4898, 1);
        ed[] var2 = var13;
        ed[] var3 = this.a(-4898, 3);
        if (var2 == null) {
            return null;
        }
        if (var13.length == 0) {
            return null;
        }
        int var4 = var13.length;
        tc[] var5 = new tc[var4];
        int var6 = 8;
        for (var7 = 0; var4 > var7; var7++) {
            var8 = var13[var7];
            var9 = null;
            if (!(var3 == null)) {
                var9 = (Object) (Object) var3[var7];
            }
            var10 = new ed[]{var8, (ed) var9};
            var11 = new tc(var10, var6);
            var5[var7] = var11;
        }
        return var5;
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var6 = EscapeVector.field_A;
          if (param1 == ((dn) this).field_u) {
            ((dn) this).field_m = ((dn) this).field_m + 1;
            if (((dn) this).field_m >= ((dn) this).field_D) {
              ((dn) this).field_m = 0;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (((dn) this).field_p == param1) {
            ((dn) this).field_m = ((dn) this).field_m - 1;
            if (((dn) this).field_m < 0) {
              ((dn) this).field_m = -1 + ((dn) this).field_D;
              break L1;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        L2: {
          var3 = 1;
          if (null == ((dn) this).field_d) {
            break L2;
          } else {
            L3: {
              if (!((dn) this).field_d.field_j) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                stackOut_12_0 = 1;
                stackIn_14_0 = stackOut_12_0;
                break L3;
              }
            }
            var3 = stackIn_14_0;
            break L2;
          }
        }
        L4: {
          this.a(108, var3 != 0);
          var4 = this.b(param1, -3844);
          if (0 > var4) {
            break L4;
          } else {
            if (null == ((dn) this).field_d) {
              break L4;
            } else {
              ((dn) this).field_d.a(false, var4);
              break L4;
            }
          }
        }
        L5: {
          var5 = 119 / ((48 - param0) / 61);
          if (0 == ((dn) this).field_m) {
            ((dn) this).field_x = false;
            ((dn) this).field_r = false;
            ((dn) this).field_j = true;
            ((dn) this).field_i = false;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if ((((dn) this).field_m ^ -1) != -2) {
            break L6;
          } else {
            ((dn) this).field_r = false;
            ((dn) this).field_j = false;
            ((dn) this).field_i = true;
            ((dn) this).field_x = false;
            break L6;
          }
        }
        L7: {
          if ((((dn) this).field_m ^ -1) != -3) {
            break L7;
          } else {
            L8: {
              if (((dn) this).field_w) {
                ((dn) this).field_r = true;
                break L8;
              } else {
                ((dn) this).field_r = false;
                break L8;
              }
            }
            L9: {
              if (((dn) this).field_w) {
                ((dn) this).field_x = false;
                break L9;
              } else {
                ((dn) this).field_x = true;
                break L9;
              }
            }
            ((dn) this).field_i = false;
            ((dn) this).field_j = false;
            break L7;
          }
        }
    }

    private final void k(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param0 < 102) {
            dn.a((String) null, 106, 1.9259626865386963f);
        }
        if (!((dn) this).field_w) {
            em.d();
            od.b(2);
            ((dn) this).field_y.c(105);
            pb.a(4);
        } else {
            var2 = 640;
            var3 = 480;
            var4 = 64;
            em.a(0, 0, var2, var3, 0, var4);
            ((dn) this).field_y.c(116);
        }
        this.b((byte) 88);
    }

    private final boolean h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var5 = EscapeVector.field_A;
        var3 = -33 / ((param0 - -47) / 45);
        var2 = 0;
        L0: while (true) {
          if (!pn.p(-73)) {
            return var2 != 0;
          } else {
            L1: {
              ((dn) this).field_d.c((byte) 6);
              if (!((dn) this).field_d.field_e) {
                break L1;
              } else {
                this.l(1536);
                break L1;
              }
            }
            L2: {
              if (nk.field_n != 13) {
                break L2;
              } else {
                L3: {
                  var4 = ((dn) this).field_e;
                  if (((dn) this).field_w) {
                    var4 = ((dn) this).field_g;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ((dn) this).field_d.field_h = this.b(var4, -3844);
                  if (!this.b(true, 1)) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L4;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L4;
                  }
                }
                var2 = stackIn_11_0;
                if (var2 == 0) {
                  break L2;
                } else {
                  return var2 != 0;
                }
              }
            }
            L5: {
              if (!this.b(false, 1)) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L5;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L5;
              }
            }
            var2 = stackIn_16_0;
            if (var2 != 0) {
              return var2 != 0;
            } else {
              continue L0;
            }
          }
        }
    }

    private final boolean b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          if (param1 == 1) {
            break L0;
          } else {
            this.a(54, true);
            break L0;
          }
        }
        L1: {
          var3 = 0;
          if (((dn) this).field_d.b((byte) -18)) {
            break L1;
          } else {
            if (param0) {
              break L1;
            } else {
              return var3 != 0;
            }
          }
        }
        L2: {
          var4 = this.b(param1 + 73);
          if (var4 == ((dn) this).field_e) {
            break L2;
          } else {
            if (var4 == ((dn) this).field_g) {
              break L2;
            } else {
              L3: {
                if (var4 == ((dn) this).field_p) {
                  this.a((byte) 115, var4);
                  break L3;
                } else {
                  if (var4 != ((dn) this).field_u) {
                    break L3;
                  } else {
                    this.a((byte) 115, var4);
                    break L3;
                  }
                }
              }
              return var3 != 0;
            }
          }
        }
        this.a(false, var4);
        var3 = 1;
        return var3 != 0;
    }

    public static void h(int param0) {
        if (param0 != -1) {
            field_C = null;
        }
        field_q = null;
        field_C = null;
    }

    private final int[] a(int param0, int param1, int param2, ih param3, int param4) {
        String var12 = null;
        oe var6 = ma.field_a;
        int var7 = 3;
        int var8 = param1;
        int var9 = param4 * var8;
        if (param0 <= 6) {
            return null;
        }
        int var10 = var8 - -1;
        int var11 = param2 + ((dn) this).field_v;
        if (var6 != null) {
            var12 = fa.field_f;
            return this.a(var12, var11, var10, ((dn) this).field_g, 10551200, var9, param3, var7, var8);
        }
        var12 = ag.field_a;
        return this.a(var12, var11, var10, ((dn) this).field_e, 10551200, var9, param3, var7, var8);
    }

    private final int[] a(String param0, int param1, int param2, int param3, int param4, int param5, ih param6, int param7, int param8) {
        ((dn) this).field_z = new dk(param7, param8, param0, param5, param2, param6);
        int var10 = 640;
        int var11 = ((dn) this).field_z.field_p;
        int var12 = 480;
        int var13 = (-var11 + var10) / 2;
        int var14 = -((dn) this).field_z.field_i + (var12 - param1);
        param1 = param1 - -(var14 / 2);
        ((dn) this).field_z.b((byte) 114, var13, param1);
        if (param4 != 10551200) {
            ((dn) this).field_d = null;
        }
        int[] var15 = new int[]{param3};
        return var15;
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (!(!param0)) {
            var4 += 4;
        }
        if (param2) {
            var4 += 2;
        }
        if (param1 != 4) {
            field_C = null;
        }
        if (param3) {
            var4++;
        }
        return sl.field_c[var4];
    }

    private final void d(int param0) {
        int var2 = this.a(103, dh.field_d, bj.field_y);
        if (param0 != -22600) {
            ((dn) this).field_z = null;
        }
        int var3 = this.a(param0 + 22723, sf.field_c, ng.field_ob);
        ((dn) this).field_d.a(var3, (byte) 118, var2);
        if (!(!((dn) this).field_d.field_e)) {
            this.l(1536);
        }
    }

    private final void a(String[] param0, byte param1) {
        int var3 = 0;
        String var4 = null;
        int var5 = EscapeVector.field_A;
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = param0[var3];
            param0[var3] = "- " + var4;
        }
        if (param1 != -10) {
            this.k(-17);
        }
    }

    private final int a(int param0, jl param1, int param2) {
        if (param1 == null) {
            return 0;
        }
        if (param2 != 0) {
            Object var5 = null;
            int discarded$0 = this.a(115, (jl) null, 41);
        }
        param1.a(param0, 3);
        int var4 = param1.b((byte) -90);
        var4 = var4 + param1.c((byte) 99);
        return var4;
    }

    private final void j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        L0: {
          var2 = 640;
          if (param0 == 87) {
            break L0;
          } else {
            var15 = null;
            this.a((String) null, -33, 46, -86, -58, -49, (ih) null, -14, -115, 10, -82);
            break L0;
          }
        }
        L1: {
          var3 = -((dn) this).field_v + (-((dn) this).field_k + var2) / 2;
          var4 = 0;
          var5 = ((dn) this).field_l[0];
          if (var5 == null) {
            var5 = ((dn) this).field_l[1];
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var5 == null) {
            break L2;
          } else {
            var4 = var5.field_l - ((dn) this).field_v;
            break L2;
          }
        }
        L3: {
          var6 = ((dn) this).field_k + ((dn) this).field_v * 2;
          var7 = 0;
          if (var5 == null) {
            break L3;
          } else {
            var7 = ((dn) this).field_h + (var5.field_i / 2 + var5.field_l) + ((dn) this).field_v;
            break L3;
          }
        }
        L4: {
          var8 = var7 + -var4;
          var9 = 20;
          ((dn) this).field_y = new gf(var3, var4, var6, var8, var9);
          var10 = 3162160;
          if (!((dn) this).field_w) {
            break L4;
          } else {
            var10 = this.g((byte) 76);
            break L4;
          }
        }
        L5: {
          var11 = 6324320;
          if (((dn) this).field_w) {
            var11 = this.f((byte) 70);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var12 = 0;
          var13 = 3160124;
          var14 = 160;
          if (((dn) this).field_w) {
            ((dn) this).field_y.a(var10, var13, var12, var14, var11, (byte) -128);
            break L6;
          } else {
            ((dn) this).field_y.a(param0 ^ 15176, var11, var12, var10);
            break L6;
          }
        }
    }

    private final void d(byte param0) {
        this.a(true);
        this.a((byte) 124);
        this.k(-109);
        this.c(14972);
        this.e((byte) 79);
        if (param0 != 19) {
            return;
        }
        this.e(0);
    }

    private final int a(int[] param0, int param1, int param2) {
        qg.a(param0, 0, ((dn) this).field_A, param2, param0.length);
        if (param1 != -3549) {
            ((dn) this).field_m = 116;
        }
        param2 = param2 + param0.length;
        return param2;
    }

    private final void a(boolean param0) {
        String[] var8 = new String[]{um.field_c, dc.field_i, n.field_k, fn.field_a, tc.field_h, ll.field_h, ea.field_i};
        if (!param0) {
            return;
        }
        String[] var3 = new String[]{ug.field_b, si.field_w, mj.field_c, qj.field_e, oh.field_k, na.field_t, cj.field_b};
        int var4 = 16777215;
        int var5 = this.f((byte) 70);
        int var6 = this.g((byte) 115);
        ih var7 = fh.field_g;
        ((dn) this).field_c = new gl(qc.field_yb, var8, var3);
        ((dn) this).field_c.a(var6, var5, var4, (byte) -92, var7);
    }

    dn(boolean param0) {
        ((dn) this).field_r = false;
        ((dn) this).field_u = 1;
        ((dn) this).field_i = false;
        ((dn) this).field_x = false;
        ((dn) this).field_v = 13;
        ((dn) this).field_w = true;
        ((dn) this).field_b = false;
        ((dn) this).field_g = 3;
        ((dn) this).field_p = 0;
        ((dn) this).field_t = 260;
        ((dn) this).field_l = new dk[2];
        ((dn) this).field_j = true;
        ((dn) this).field_e = 2;
        ((dn) this).field_D = 3;
        ((dn) this).field_m = 0;
        oe var2 = ma.field_a;
        if (var2 == null) {
            ((dn) this).field_w = false;
        } else {
            ((dn) this).field_w = true;
        }
        ((dn) this).field_b = bj.e((byte) 115);
        this.d((byte) 19);
        this.a(-66, param0);
        this.j((byte) 87);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new String[]{"virtual_layer0.jpg", "virtual_layer1.jpg", "virtual_layer2.jpg", "virtual_layer3.jpg"};
    }
}

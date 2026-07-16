/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    private int field_a;
    static String field_c;
    private oe field_r;
    static tk field_g;
    private ed field_k;
    private dk[] field_q;
    private boolean field_o;
    private int field_e;
    static ie field_l;
    int field_h;
    private dk[] field_j;
    private int field_f;
    int field_s;
    private qe[] field_d;
    static String field_i;
    private int field_n;
    int field_p;
    private dk[] field_b;
    private int field_m;

    private final String a(int param0, int param1, String param2, boolean param3) {
        int var6 = 0;
        if (param3) {
            ((ig) this).j(-97);
        }
        int var5 = ua.field_c.b(((ig) this).field_a, 0);
        if (var5 == 0) {
            var6 = param0 <= param1 ? 1 : 0;
            if (!(var6 != 0)) {
                param2 = jm.field_M;
            }
        }
        return param2;
    }

    final static void a(int param0, int param1, ik param2) {
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        c var8 = om.field_c;
        c var9 = var8;
        var9.a(param1, true);
        var9.field_m = var9.field_m + 1;
        int var4 = var9.field_m;
        var9.f(1, -123);
        var9.h(-113, param2.field_i);
        var9.h(-107, param2.field_j);
        var9.h(110, param2.field_k);
        var9.a((byte) 124, param2.field_o);
        var9.a((byte) 123, param2.field_m);
        var9.a((byte) 127, param2.field_n);
        var9.a((byte) 127, param2.field_g);
        var9.f(param2.field_q.length, -123);
        int var5 = -65 / ((87 - param0) / 35);
        for (var6 = 0; param2.field_q.length > var6; var6++) {
            var8.a((byte) 123, param2.field_q[var6]);
        }
        int discarded$0 = var9.c(var4, -39);
        var9.e(-56, -var4 + var9.field_m);
    }

    private final void a(byte param0, int param1, int param2, ih param3) {
        int[] var10 = null;
        int[] var5 = null;
        String[] var9 = null;
        int var6 = 0;
        int var7 = 442;
        int var8 = 640;
        if (param0 != -12) {
            this.b((byte) 44);
        }
        if (aj.b(-117)) {
            var9 = new String[]{cn.field_e, bb.field_O};
            var10 = new int[]{1, 2};
            var5 = new int[]{((ig) this).field_n, ((ig) this).field_e};
        } else {
            var5 = new int[]{((ig) this).field_e};
            var9 = new String[]{bb.field_O};
            var10 = new int[]{1};
        }
        int var11 = var9.length;
        int[] var14 = vl.a(param2, param1, var11, (byte) -17);
        ((ig) this).field_q = na.a(var8, var5, var7, var6, param3, var9, var10, false, var14);
    }

    private final void g(int param0) {
        if (!(((ig) this).field_r != null)) {
            return;
        }
        li var2 = ((ig) this).field_r.field_B;
        if (var2 != null) {
            var2.field_c = var2.field_c + 1;
        }
        if (param0 != -98) {
            Object var3 = null;
            this.a((hh) null, 19, (dk) null, 55, 2);
        }
        if (!(((ig) this).field_m != ((ig) this).field_r.field_Pb)) {
            return;
        }
        ((ig) this).field_o = true;
    }

    private final void a(int param0, int param1, ih param2, int param3) {
        int[] var13 = new int[]{((ig) this).field_f, ((ig) this).field_s};
        String[] var6 = new String[]{eo.field_b, be.field_a};
        int[] var7 = new int[]{2, 3};
        int var8 = 3;
        int var9 = 89;
        int var10 = 402;
        int var11 = var6.length;
        int[] var15 = vl.a(param3, param0, var11, (byte) -17);
        ((ig) this).field_b = na.a(var10, var13, var9, var8, param2, var6, var7, false, var15);
        if (param1 != -9079) {
            ((ig) this).field_b = null;
        }
    }

    private final void a(hh param0, int param1, dk param2, int param3, int param4) {
        int var6 = param2.field_p / param1 + param2.field_l;
        int var7 = var6 * 16384 / 640;
        rk.field_e.a(param0, param4, param3, var7);
    }

    private final boolean a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          if (param1 <= -50) {
            break L0;
          } else {
            ((ig) this).field_b = null;
            break L0;
          }
        }
        this.c(6620);
        if (!di.field_d.b((byte) -18)) {
          return false;
        } else {
          L1: {
            var3 = di.field_d.field_h;
            var4 = je.a(false, ((ig) this).field_a);
            if (var3 < 0) {
              break L1;
            } else {
              if (var4 > var3) {
                L2: {
                  var5 = ua.field_c.b(((ig) this).field_a, 0);
                  if (var5 != 0) {
                    break L2;
                  } else {
                    var6 = ua.field_c.a(29386, ((ig) this).field_a);
                    if (!this.a(var6, var3, true)) {
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                pl.field_q = null;
                de.field_i = null;
                od.field_q = -1;
                var6 = var3;
                de.a(((ig) this).field_a, var6, 89);
                return true;
              } else {
                break L1;
              }
            }
          }
          if (((ig) this).field_s != var3) {
            L3: {
              if (var3 != ((ig) this).field_n) {
                break L3;
              } else {
                if (!aj.b(-107)) {
                  break L3;
                } else {
                  pa.a(true);
                  mj.field_d = 0;
                  gi.a((byte) -90);
                  return true;
                }
              }
            }
            if (var3 == ((ig) this).field_e) {
              od.field_q = -1;
              oe.c(param0, 2560);
              return true;
            } else {
              if (((ig) this).field_f == var3) {
                sa.a(((ig) this).field_a, (byte) -128);
                mj.field_d = 0;
                am.field_k = 0;
                oe.c((byte) 30);
                return true;
              } else {
                return false;
              }
            }
          } else {
            de.field_i = null;
            pl.field_q = null;
            od.field_q = -1;
            de.a(((ig) this).field_a, -1, 101);
            return true;
          }
        }
    }

    private final void a(dk[] param0, int param1) {
        int var6 = 0;
        dk var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = EscapeVector.field_A;
        int var3 = -122 / ((param1 - -21) / 52);
        if (!(param0 != null)) {
            return;
        }
        int var4 = di.field_d.field_h;
        dk[] var5 = param0;
        for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            var8 = var7.field_c;
            var9 = var8 == var4 ? 1 : 0;
            var7.a(-16383, var9 != 0);
        }
    }

    private final void c(byte param0) {
        wc var2 = di.field_d;
        if (!(var2 != null)) {
            return;
        }
        int var3 = var2.field_h;
        if (param0 != 86) {
            this.c((byte) 3);
        }
        int var4 = je.a(false, ((ig) this).field_a);
        if (var3 < 0) {
            return;
        }
        if (!(var4 > var3)) {
            return;
        }
        ((ig) this).field_m = var3;
    }

    private final ed a(byte param0, boolean param1) {
        if (param0 >= -16) {
            this.a((byte) 50);
        }
        int var3 = ua.field_c.b(((ig) this).field_a, 0);
        if (-1 == (var3 ^ -1)) {
            return null;
        }
        if (var3 != 1) {
            return null;
        }
        if (vd.field_f == null) {
            return null;
        }
        if (param1) {
            return vd.field_f[1];
        }
        return vd.field_f[0];
    }

    private final void a(int param0) {
        if (!(((ig) this).field_r != null)) {
            return;
        }
        if (param0 != 1) {
            ((ig) this).field_k = null;
        }
        if (!(!((ig) this).field_o)) {
            ((ig) this).field_o = false;
            ((ig) this).field_r.e(((ig) this).field_m, 110);
            this.a(true);
            fn.a((byte) 82);
        }
    }

    private final void d(int param0) {
        this.a(param0 + 1);
        if (null == ((ig) this).field_r) {
            return;
        }
        li var17 = ((ig) this).field_r.field_B;
        if (var17 == null) {
            return;
        }
        int var3 = 640;
        int var4 = 480;
        int var5 = 3;
        int var6 = 79;
        int var7 = 402;
        int var8 = 349;
        int var9 = ((ig) this).field_r.field_Mb * var17.field_v;
        int var10 = ((ig) this).field_r.field_D * var17.field_v;
        int var11 = (-var9 + var3) / 2;
        int var12 = (-var10 + var4) / 2;
        int var13 = (var7 - var9) / 2;
        int var14 = (var8 - var10) / 2;
        int var15 = -var11 + (var5 - -var13);
        int var16 = -var12 + var14 + var6;
        var17.b(var16, false, var15, param0);
    }

    private final void i(int param0) {
        int var2 = (((ig) this).field_a ^ -1) == -4 ? 1 : 0;
        int var3 = je.a(false, ((ig) this).field_a);
        ((ig) this).field_p = var3;
        if (!(var2 != 0)) {
            int fieldTemp$0 = ((ig) this).field_p;
            ((ig) this).field_p = ((ig) this).field_p + 1;
            ((ig) this).field_s = fieldTemp$0;
        }
        if (var2 == 0) {
            int fieldTemp$1 = ((ig) this).field_p;
            ((ig) this).field_p = ((ig) this).field_p + 1;
            ((ig) this).field_f = fieldTemp$1;
        }
        if (!(!aj.b(-118))) {
            int fieldTemp$2 = ((ig) this).field_p;
            ((ig) this).field_p = ((ig) this).field_p + 1;
            ((ig) this).field_n = fieldTemp$2;
        }
        if (param0 != -30234) {
            Object var4 = null;
            this.a((dk[]) null, 116);
        }
        int fieldTemp$3 = ((ig) this).field_p;
        ((ig) this).field_p = ((ig) this).field_p + 1;
        ((ig) this).field_e = fieldTemp$3;
    }

    private final void a(byte param0) {
        int var18 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = EscapeVector.field_A;
        int var2 = 12;
        int var3 = 12;
        dk var23 = ((ig) this).field_j[0];
        dk var19 = var23;
        var19 = var23;
        int var5 = -var2 + var23.field_f;
        int var6 = var23.field_f - -var23.field_p + (var2 - 1);
        int var7 = -var3 + var23.field_l;
        dk var24 = ((ig) this).field_j[-1 + ((ig) this).field_j.length];
        int var8 = var3 + var24.field_i + var24.field_l;
        int var9 = 1;
        int var10 = 50;
        int var11 = mj.field_d;
        int var12 = var11 >= var10 ? 0 : -var11 + var10;
        int var13 = 3170352;
        int var14 = 6340704;
        int var15 = -32 / ((12 - param0) / 63);
        fc.a(var12, var5, var6, var8, true, 29788, false, var14, var13, var9, var7, true);
        int var16 = di.field_d.field_h;
        dk[] var17 = ((ig) this).field_j;
        for (var18 = 0; var17.length > var18; var18++) {
            var19 = var17[var18];
            var20 = var19.field_c;
            if (var20 < 0) {
                var20 = ((ig) this).field_s;
            }
            var21 = var16 == var20 ? 1 : 0;
            var19.a(-16383, var21 != 0);
        }
    }

    private final int a(byte param0, int param1, dk[] param2, int param3) {
        int var6 = 0;
        dk var7 = null;
        int var8 = EscapeVector.field_A;
        dk[] var9 = param2;
        dk[] var5 = var9;
        if (param0 != -43) {
            int discarded$0 = ((ig) this).a(42, 56, -95);
        }
        for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7.a((byte) 65, param1, param3)) {
                return var7.field_c;
            }
        }
        return -1;
    }

    private final boolean a(int param0, int param1, boolean param2) {
        if (!param2) {
            return true;
        }
        int var4 = ua.field_c.b(((ig) this).field_a, 0);
        if (!(var4 != 0)) {
            return param1 <= param0 ? true : false;
        }
        if ((var4 ^ -1) != -2) {
            return false;
        }
        int var5 = ua.field_c.a(true, ((ig) this).field_a, param1);
        return nl.a((byte) 121, var5);
    }

    private final void a(int param0, int param1, int param2, dk[] param3) {
        int var5 = 0;
        dk[] var6 = null;
        int var7 = 0;
        dk var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = EscapeVector.field_A;
        if (param3 != null) {
          if (param1 == 9355) {
            var5 = mj.field_d;
            var6 = param3;
            var7 = 0;
            L0: while (true) {
              if (var7 >= var6.length) {
                return;
              } else {
                var8 = var6[var7];
                var9 = var8.field_q;
                if (var5 == var9) {
                  this.a(pc.field_a, 2, var8, param2, param0);
                  var7++;
                  continue L0;
                } else {
                  var7++;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void c(int param0) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qe[] var6 = null;
        int var7 = 0;
        qe var8 = null;
        int var9 = 0;
        Throwable var10 = null;
        int var11 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          var11 = EscapeVector.field_A;
          if (param0 == 6620) {
            break L0;
          } else {
            ig.h(-11);
            break L0;
          }
        }
        L1: {
          if (di.field_d.field_e) {
            var2 = (Object) (Object) rk.field_e;
            synchronized (var2) {
              L2: {
                L3: {
                  var3 = 1536 * qm.field_c / 64;
                  var4 = 100;
                  var5 = di.field_d.field_h;
                  this.a(((ig) this).field_j, var3, var4, 3);
                  this.a(((ig) this).field_q, var3, var4, 3);
                  var4 = 102;
                  if (((ig) this).field_d == null) {
                    break L3;
                  } else {
                    var6 = ((ig) this).field_d;
                    var7 = 0;
                    L4: while (true) {
                      if (var6.length <= var7) {
                        break L3;
                      } else {
                        L5: {
                          var8 = var6[var7];
                          if (var8.field_d == var5) {
                            var9 = var8.field_f.field_h * 16384 / 640;
                            rk.field_e.a(oa.field_w, var4, var3, var9);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var7++;
                        continue L4;
                      }
                    }
                  }
                }
                this.a(((ig) this).field_b, var3, var4, 3);
                break L2;
              }
            }
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final void b(int param0) {
        if ((((ig) this).field_a ^ -1) != param0) {
            ((ig) this).field_r = null;
            return;
        }
        byte[][] var2 = ld.field_h[((ig) this).field_a];
        ((ig) this).field_r = new oe(var2);
        ((ig) this).field_r.field_fc = ((ig) this).field_a;
        ((ig) this).field_r.e(((ig) this).field_m, -59);
        this.a(true);
    }

    final int a(int param0, int param1, int param2) {
        qe[] var8 = null;
        int var5 = 0;
        qe var6 = null;
        int var7 = EscapeVector.field_A;
        if (((ig) this).field_d != null) {
            var8 = ((ig) this).field_d;
            qe[] var4_ref_qe__ = var8;
            for (var5 = 0; var8.length > var5; var5++) {
                var6 = var8[var5];
                if (var6.a(param0, param2, param1 ^ 12088)) {
                    return var6.field_d;
                }
            }
        }
        if (param1 != 12089) {
            ((ig) this).field_h = 122;
        }
        int var4 = this.a((byte) -43, param2, ((ig) this).field_j, param0);
        if (!(var4 < 0)) {
            return var4;
        }
        if (!(null == ((ig) this).field_b)) {
            var4 = this.a((byte) -43, param2, ((ig) this).field_b, param0);
        }
        if (!((var4 ^ -1) > -1)) {
            return var4;
        }
        var4 = this.a((byte) -43, param2, ((ig) this).field_q, param0);
        if (0 <= var4) {
            return var4;
        }
        return -1;
    }

    private final void b(boolean param0, int param1) {
        int var4 = 0;
        qe var5 = null;
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        if (!param0) {
            return;
        }
        if (!(null != ((ig) this).field_d)) {
            return;
        }
        qe[] var8 = ((ig) this).field_d;
        qe[] var3 = var8;
        for (var4 = 0; var8.length > var4; var4++) {
            var5 = var8[var4];
            var6 = var5.field_d == param1 ? 1 : 0;
            var5.a(var6 != 0, -1);
        }
    }

    private final void b(byte param0) {
        int var2 = ((ig) this).field_a == 3 ? 1 : 0;
        ih var3 = fh.field_g;
        this.i(-30234);
        int var4 = ua.field_c.a(29386, ((ig) this).field_a);
        if (!(var2 != 0)) {
            ((ig) this).field_d = tm.c(10, var4, ((ig) this).field_a);
        }
        int var5 = 10;
        this.a((byte) 51, var3, var5);
        int var6 = 3;
        if (var2 == 0) {
            this.a(var6, -9079, var3, var5);
        }
        var6 = 5;
        this.a((byte) -12, var6, var5, var3);
        fi.a(((ig) this).field_j, 0);
        if (var2 == 0) {
            fi.a(((ig) this).field_b, 0);
        }
        fi.a(((ig) this).field_q, 0);
        if (param0 <= 8) {
            Object var7 = null;
            this.a((byte) -115, (ih) null, 37);
        }
    }

    final void e(int param0) {
        int var6 = 0;
        em.d();
        od.b(param0 ^ 1);
        int var2 = mj.field_d < 50 ? -mj.field_d + 50 : 0;
        if (null != ((ig) this).field_k) {
            ((ig) this).field_k.d(3, 79);
        }
        this.d(0);
        fk.a(404, 3162160, param0 ^ 115, 0, 6324320, 76, param0, var2, 430);
        int var3 = je.a(false, ((ig) this).field_a);
        int var4 = di.field_d.field_h;
        int var5 = 1;
        if ((var4 ^ -1) <= -1) {
            if (var3 > var4) {
                var6 = ua.field_c.a(param0 + 29383, ((ig) this).field_a);
                var5 = var4 <= var6 ? 1 : 0;
            }
        }
        this.a(((ig) this).field_b, 104);
        this.a(((ig) this).field_q, param0 + -85);
        this.a((byte) 120);
        this.b(true, var4);
        this.a(var3, (byte) -59, var5 != 0);
        pb.a(param0 + 1);
    }

    private final void k(int param0) {
        ((ig) this).field_k = null;
        if (param0 != -32044) {
            return;
        }
        if (!(-2 != ((ig) this).field_a)) {
            ((ig) this).field_k = km.field_k;
        }
        if (-1 == ((ig) this).field_a) {
            ((ig) this).field_k = km.field_k;
        }
        if (!(((ig) this).field_a != 2)) {
            ((ig) this).field_k = aj.field_c;
        }
    }

    final void j(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wc var6 = null;
        L0: {
          var5 = EscapeVector.field_A;
          if (param0 == 2525) {
            break L0;
          } else {
            this.k(-66);
            break L0;
          }
        }
        this.f(0);
        var6 = di.field_d;
        var3 = var6.field_h;
        var4 = je.a(false, ((ig) this).field_a);
        L1: while (true) {
          if (!pn.p(-113)) {
            var6.a(((ig) this).a(ng.field_ob, 12089, sf.field_c), (byte) 126, ((ig) this).a(bj.field_y, 12089, dh.field_d));
            boolean discarded$1 = this.a(true, -89);
            this.c((byte) 86);
            this.g(param0 ^ -2493);
            return;
          } else {
            L2: {
              L3: {
                var6.a(100);
                if (-97 == (nk.field_n ^ -1)) {
                  break L3;
                } else {
                  if (nk.field_n == 98) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if ((((ig) this).field_e ^ -1) != (var3 ^ -1)) {
                  break L4;
                } else {
                  if (-1 >= (((ig) this).field_n ^ -1)) {
                    var6.a(false, ((ig) this).field_n);
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              if ((var3 ^ -1) == (((ig) this).field_e ^ -1)) {
                var6.a(false, var4 - 1);
                break L2;
              } else {
                if ((((ig) this).field_n ^ -1) != (var3 ^ -1)) {
                  L5: {
                    if ((var3 ^ -1) >= -1) {
                      break L5;
                    } else {
                      if (var3 < var4) {
                        var6.a(false, -1 + var3);
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (0 != var3) {
                      break L6;
                    } else {
                      if ((((ig) this).field_s ^ -1) <= -1) {
                        var6.a(false, ((ig) this).field_s);
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (0 != var3) {
                      break L7;
                    } else {
                      if (((ig) this).field_f >= 0) {
                        var6.a(false, ((ig) this).field_f);
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (-1 != (var3 ^ -1)) {
                    L8: {
                      if ((var3 ^ -1) != (((ig) this).field_s ^ -1)) {
                        break L8;
                      } else {
                        if ((((ig) this).field_f ^ -1) <= -1) {
                          var6.a(false, ((ig) this).field_f);
                          break L2;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (((ig) this).field_s == var3) {
                      var6.a(false, ((ig) this).field_e);
                      break L2;
                    } else {
                      if (var3 != ((ig) this).field_f) {
                        var6.a(false, h.a(((ig) this).field_a, (byte) 121));
                        break L2;
                      } else {
                        var6.a(false, ((ig) this).field_e);
                        break L2;
                      }
                    }
                  } else {
                    var6.a(false, ((ig) this).field_e);
                    break L2;
                  }
                } else {
                  var6.a(false, -1 + var4);
                  break L2;
                }
              }
            }
            L9: {
              L10: {
                if ((nk.field_n ^ -1) == -98) {
                  break L10;
                } else {
                  if (nk.field_n == 99) {
                    break L10;
                  } else {
                    break L9;
                  }
                }
              }
              if (((ig) this).field_s == var3) {
                var6.a(false, 0);
                break L9;
              } else {
                L11: {
                  if ((var3 ^ -1) > -1) {
                    break L11;
                  } else {
                    if ((var3 ^ -1) <= (var4 - 1 ^ -1)) {
                      break L11;
                    } else {
                      var6.a(false, var3 + 1);
                      break L9;
                    }
                  }
                }
                L12: {
                  if ((var4 + -1 ^ -1) != (var3 ^ -1)) {
                    break L12;
                  } else {
                    if (-1 < (((ig) this).field_n ^ -1)) {
                      break L12;
                    } else {
                      var6.a(false, ((ig) this).field_n);
                      break L9;
                    }
                  }
                }
                if ((var3 ^ -1) != (var4 - 1 ^ -1)) {
                  if (((ig) this).field_n == var3) {
                    var6.a(false, ((ig) this).field_e);
                    break L9;
                  } else {
                    L13: {
                      if ((var3 ^ -1) != (((ig) this).field_e ^ -1)) {
                        break L13;
                      } else {
                        if ((((ig) this).field_f ^ -1) <= -1) {
                          var6.a(false, ((ig) this).field_f);
                          break L9;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if ((var3 ^ -1) != (((ig) this).field_e ^ -1)) {
                        break L14;
                      } else {
                        if (-1 >= (((ig) this).field_s ^ -1)) {
                          var6.a(false, ((ig) this).field_s);
                          break L9;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if ((((ig) this).field_e ^ -1) == (var3 ^ -1)) {
                      var6.a(false, 0);
                      break L9;
                    } else {
                      L15: {
                        if (var3 != ((ig) this).field_f) {
                          break L15;
                        } else {
                          if (-1 >= (((ig) this).field_s ^ -1)) {
                            var6.a(false, ((ig) this).field_s);
                            break L9;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if ((((ig) this).field_f ^ -1) != (var3 ^ -1)) {
                        var6.a(false, h.a(((ig) this).field_a, (byte) 121));
                        break L9;
                      } else {
                        var6.a(false, 0);
                        break L9;
                      }
                    }
                  }
                } else {
                  var6.a(false, ((ig) this).field_e);
                  break L9;
                }
              }
            }
            if ((nk.field_n ^ -1) != -14) {
              if (this.a(false, -54)) {
                return;
              } else {
                continue L1;
              }
            } else {
              od.field_q = -1;
              oe.c(false, param0 ^ 989);
              return;
            }
          }
        }
    }

    private final void a(int param0, byte param1, boolean param2) {
        String var6 = null;
        int var5 = 0;
        if (param1 != -59) {
            this.f(27);
        }
        Object var4 = null;
        if (!(param2)) {
            var6 = eh.field_f;
            if (!(!aj.b(-97))) {
                var4 = (Object) (Object) (var6 + "<br>" + jf.field_O + " " + fk.field_c);
            }
        }
        if (var4 != null) {
            var5 = 8 - -fh.field_g.b((String) var4, 387, 20);
            em.e(7, 426 + (-var5 - 1), 393, 3162160);
            em.a(7, -var5 + 426, 393, var5, 0);
            int discarded$0 = fh.field_g.a((String) var4, 10, 128, 387, 294, 6340704, -1, 1, 2, 20);
        }
    }

    private final void a(boolean param0) {
        if (!param0) {
            return;
        }
        if (((ig) this).field_r == null) {
            return;
        }
        li var2 = ((ig) this).field_r.field_B;
        if (var2 == null) {
            return;
        }
        var2.field_c = var2.field_c + 1;
        if (!(var2.b((byte) -102))) {
            var2.e((byte) -101);
        }
        var2.field_d = false;
        var2.field_L = false;
    }

    private final void a(byte param0, ih param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        ed var25 = null;
        dk var26 = null;
        int var27 = 0;
        String var28 = null;
        String var29 = null;
        var27 = EscapeVector.field_A;
        var4 = 4;
        var5 = 88;
        var6 = 18;
        var7 = 9;
        var8 = 415;
        if (param0 == 51) {
          var9 = 625;
          var10 = -var8 + var9 + 1;
          var11 = 30;
          var12 = oj.field_E[((ig) this).field_a];
          var13 = var12.length;
          var14 = je.a(false, ((ig) this).field_a);
          var15 = ki.field_M[((ig) this).field_a];
          ((ig) this).field_j = new dk[-var15 + var14];
          var16 = ua.field_c.a(29386, ((ig) this).field_a);
          var17 = 0;
          var18 = var15;
          L0: while (true) {
            L1: {
              if (var13 <= var17) {
                break L1;
              } else {
                var19 = var12[var17];
                var20 = 0;
                L2: while (true) {
                  L3: {
                    if (var19 <= var20) {
                      break L3;
                    } else {
                      if (var18 >= var14) {
                        break L3;
                      } else {
                        L4: {
                          var28 = ce.a((byte) 127, ((ig) this).field_a, var18);
                          var29 = this.a(var18, var16, var28, false);
                          var22 = this.a(var16, var18, true) ? 1 : 0;
                          var23 = var18;
                          if (0 <= var23) {
                            break L4;
                          } else {
                            var23 = ((ig) this).field_s;
                            break L4;
                          }
                        }
                        var24 = 1 + var18;
                        var25 = this.a((byte) -71, var22 != 0);
                        var26 = new dk(var4, var23, var24, var29, var11, var25, param2, param1);
                        var26.b((byte) -48, var8, var5);
                        var26.a(var6, param0 ^ 51, var10);
                        ((ig) this).field_j[var18 + -var15] = var26;
                        var5 = var5 + var6;
                        var18++;
                        var20++;
                        continue L2;
                      }
                    }
                  }
                  if (var14 > var18) {
                    var5 = var5 + var7;
                    var17++;
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        qe[] var5 = null;
        int var6 = 0;
        qe var7 = null;
        hh var8 = null;
        int var9 = 0;
        hl var10 = null;
        int var11 = 0;
        L0: {
          var11 = EscapeVector.field_A;
          var2 = mj.field_d;
          if (var2 != 0) {
            break L0;
          } else {
            sj.a(8192, (byte) 51);
            break L0;
          }
        }
        de.field_j = true;
        if (param0 == 0) {
          L1: {
            var3 = qm.field_c * 6144 / 64;
            var4 = 100;
            this.a(var4, param0 + 9355, var3, ((ig) this).field_b);
            this.a(var4, param0 ^ 9355, var3, ((ig) this).field_q);
            if (((ig) this).field_d != null) {
              var5 = ((ig) this).field_d;
              var6 = 0;
              L2: while (true) {
                if (var5.length <= var6) {
                  break L1;
                } else {
                  var7 = var5[var6];
                  if (var7.field_h == var2) {
                    var8 = b.field_b;
                    var9 = 16384 * var7.field_f.field_h / 640;
                    var10 = hl.c(var8, var4, var3, var9);
                    gd.field_K[var7.field_d] = var10;
                    var6++;
                    continue L2;
                  } else {
                    var6++;
                    continue L2;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          L3: {
            od.field_s = true;
            if (1000 > mj.field_d) {
              mj.field_d = mj.field_d + 1;
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(dk[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        dk[] var7 = null;
        int var8 = 0;
        dk var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = EscapeVector.field_A;
        if (param0 != null) {
          L0: {
            var5 = di.field_d.field_h;
            var6 = null;
            if (param3 == 3) {
              break L0;
            } else {
              this.a(true);
              break L0;
            }
          }
          var7 = param0;
          var8 = 0;
          L1: while (true) {
            if (var7.length <= var8) {
              if (var6 != null) {
                this.a(oa.field_w, 2, (dk) var6, param1, param2);
                return;
              } else {
                return;
              }
            } else {
              var9 = var7[var8];
              var10 = var9.field_c;
              if (var5 == var10) {
                var6 = (Object) (Object) var9;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    ig(int param0, int param1) {
        ((ig) this).field_e = -2;
        ((ig) this).field_o = true;
        ((ig) this).field_s = -2;
        ((ig) this).field_n = -2;
        ((ig) this).field_f = -2;
        ((ig) this).field_m = 0;
        ((ig) this).field_h = param1;
        ((ig) this).field_a = param0;
        this.b((byte) 62);
        this.k(-32044);
        this.b(-4);
    }

    public static void h(int param0) {
        field_l = null;
        field_g = null;
        field_i = null;
        if (param0 > -33) {
            ig.h(-58);
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Skip";
        field_i = "Player names can be up to 12 letters, numbers and underscores";
        field_g = new tk();
    }
}

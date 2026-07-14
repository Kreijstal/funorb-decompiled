/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends nb implements ue, jk, ag {
    private te field_J;
    private cl field_E;
    private cl field_D;
    bb field_C;
    private cl field_O;
    private kf field_I;
    private kf field_P;
    private bc field_F;
    private cl field_M;
    static String field_L;
    private cl field_K;
    static String field_B;
    static int field_H;
    static int[] field_N;
    private cl field_G;

    public final void a(byte param0) {
        if (param0 != -12) {
            return;
        }
        ((ol) (Object) ((pj) this).field_E.a((byte) 3)).e(116);
    }

    public final void a(String param0, byte param1) {
        cl var3 = ((pj) this).field_E;
        if (param1 <= 103) {
            return;
        }
        String var4 = param0;
        ((rl) (Object) var3).a(var4, -1, false);
    }

    private final boolean h(int param0) {
        if (param0 == -5210) {
          if (this.a((byte) 35, (nd) (Object) ((pj) this).field_E)) {
            if (this.a((byte) 35, (nd) (Object) ((pj) this).field_G)) {
              if (this.a((byte) 35, (nd) (Object) ((pj) this).field_K)) {
                if (this.a((byte) 35, (nd) (Object) ((pj) this).field_O)) {
                  if (this.a((byte) 35, (nd) (Object) ((pj) this).field_D)) {
                    if (!this.a((byte) 35, (nd) (Object) ((pj) this).field_M)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$2 = this.e(true);
          if (this.a((byte) 35, (nd) (Object) ((pj) this).field_E)) {
            if (this.a((byte) 35, (nd) (Object) ((pj) this).field_G)) {
              if (this.a((byte) 35, (nd) (Object) ((pj) this).field_K)) {
                if (this.a((byte) 35, (nd) (Object) ((pj) this).field_O)) {
                  if (this.a((byte) 35, (nd) (Object) ((pj) this).field_D)) {
                    if (!this.a((byte) 35, (nd) (Object) ((pj) this).field_M)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public pj() {
        super(0, 0, 496, 0, (rd) null);
        ((pj) this).field_E = new cl("", (vd) null, 12);
        ((pj) this).field_G = new cl("", (vd) null, 100);
        ((pj) this).field_K = new cl("", (vd) null, 100);
        ((pj) this).field_O = new cl("", (vd) null, 20);
        ((pj) this).field_D = new cl("", (vd) null, 20);
        ((pj) this).field_M = new cl("", (vd) null, 3);
        int var1 = 1;
        ((pj) this).field_J = new te("", (vd) null, var1 != 0);
        ((pj) this).field_I = new kf(bb.field_K, (vd) null);
        ((pj) this).field_P = new kf(ch.field_g, (vd) null);
        ((pj) this).field_E.field_q = cl.field_Q;
        ((pj) this).field_G.field_q = field_L;
        ((pj) this).field_K.field_q = mk.field_l;
        ((pj) this).field_O.field_q = bf.field_f;
        ((pj) this).field_D.field_q = r.field_C;
        ((pj) this).field_M.field_q = ck.field_b;
        ((pj) this).field_J.field_q = wb.field_c;
        ((pj) this).field_E.a((ma) (Object) new ol((rl) (Object) ((pj) this).field_E), (byte) 23);
        ((pj) this).field_G.a((ma) (Object) new pc((rl) (Object) ((pj) this).field_G), (byte) 23);
        ((pj) this).field_K.a((ma) (Object) new jg((rl) (Object) ((pj) this).field_K, (rl) (Object) ((pj) this).field_G), (byte) 23);
        ((pj) this).field_O.a((ma) (Object) new va((rl) (Object) ((pj) this).field_O, (rl) (Object) ((pj) this).field_E, (rl) (Object) ((pj) this).field_G), (byte) 23);
        ((pj) this).field_D.a((ma) (Object) new g((rl) (Object) ((pj) this).field_D, (rl) (Object) ((pj) this).field_O), (byte) 23);
        ((pj) this).field_M.a((ma) (Object) new uf((rl) (Object) ((pj) this).field_M), (byte) 23);
        ((pj) this).field_I.field_D = false;
        ((pj) this).field_I.field_i = (rd) (Object) new v();
        ((pj) this).field_P.field_i = (rd) (Object) new uj();
        ((pj) this).field_E.field_i = (rd) (Object) new id(10000536);
        ((pj) this).field_K.field_i = (rd) (Object) new id(10000536);
        ((pj) this).field_G.field_i = (rd) (Object) new id(10000536);
        ((pj) this).field_M.field_i = (rd) (Object) new id(10000536);
        ((pj) this).field_J.field_i = (rd) (Object) new fe();
        ((pj) this).field_D.field_i = (rd) (Object) new di(10000536);
        ((pj) this).field_O.field_i = (rd) (Object) new di(10000536);
        String var2 = da.a(new String[2], di.field_y, false);
        int var3 = 20;
        var3 = var3 + this.a(170, 170, sa.field_a, (w) (Object) ((pj) this).field_G, var3);
        var3 = var3 + (this.a(20, "", true, 170, var3, ti.field_C, (w) (Object) ((pj) this).field_K) + 5);
        var3 = var3 + this.a(170, 170, p.field_b, (w) (Object) ((pj) this).field_O, var3);
        var3 = var3 + (this.a(170, sc.field_a, uc.field_nb, var3, (w) (Object) ((pj) this).field_D, 10000536) + 5);
        var3 = var3 + (5 + this.a(170, hc.field_kb, nk.field_C, var3, (w) (Object) ((pj) this).field_E, 10000536));
        var3 = var3 + this.a((byte) -78, (w) (Object) ((pj) this).field_M, 170, var3, uf.field_o);
        jf var4 = new jf(46, var3, ((pj) this).field_j - 90, 25, (w) (Object) ((pj) this).field_J, true, -120 + ((pj) this).field_j, 5, cl.field_T, 11579568, pe.field_j);
        ((pj) this).b((byte) -74, (w) (Object) var4);
        var3 = var3 + var4.field_v;
        ik var5 = new ik(ql.field_Q, 0, 0, 0, 0, 16777215, -1, 0, 0, ql.field_Q.field_E, -1, 2147483647, true);
        ((pj) this).field_F = new bc(var2, (rd) (Object) var5);
        ((pj) this).field_F.field_q = "";
        ((pj) this).field_F.a(wc.field_b, 0, -27371);
        ((pj) this).field_F.a(wc.field_b, 1, -27371);
        ((pj) this).field_F.field_r = (vd) this;
        ((pj) this).field_F.b(46, var3, -2, ((pj) this).field_j - 90);
        var3 = var3 + (15 + ((pj) this).field_F.field_v);
        ((pj) this).b((byte) -119, (w) (Object) ((pj) this).field_F);
        int var6 = 4;
        int var7 = 200;
        ((pj) this).field_I.a(40, var7, true, var3, 496 - var7 >> -2123670975);
        ((pj) this).field_P.a(40, 60, true, var3 + 15, 3 + var6);
        ((pj) this).field_P.field_r = (vd) this;
        ((pj) this).field_I.field_r = (vd) this;
        ((pj) this).b((byte) 118, (w) (Object) ((pj) this).field_I);
        ((pj) this).b((byte) 100, (w) (Object) ((pj) this).field_P);
        ((pj) this).field_C = new bb((ag) this);
        ((pj) this).field_C.a(150, -((pj) this).field_E.field_j + (-((pj) this).field_E.field_t + ((pj) this).field_j) + -60, true, 20 + ((pj) this).field_E.field_o, ((pj) this).field_E.field_t - (-((pj) this).field_E.field_j + -60));
        ((pj) this).b((byte) 68, (w) (Object) ((pj) this).field_C);
        ((pj) this).a(var6 + (55 + var3), 496, true, 0, 0);
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5 = 0;
        if (super.a(param0, param1, param2, (byte) -112)) {
          return true;
        } else {
          var5 = 26 % ((param3 - -13) / 55);
          if (-99 == (param1 ^ -1)) {
            return ((pj) this).a(0, param2);
          } else {
            if ((param1 ^ -1) != -100) {
              return false;
            } else {
              return ((pj) this).c((byte) 119, param2);
            }
          }
        }
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        if (param4 == ((pj) this).field_P) {
          ga.b(0);
          if (param2 == 215535458) {
            return;
          } else {
            ((pj) this).field_G = null;
            return;
          }
        } else {
          if (((pj) this).field_I != param4) {
            if (param2 != 215535458) {
              ((pj) this).field_G = null;
              return;
            } else {
              return;
            }
          } else {
            boolean discarded$3 = this.e(true);
            if (param2 == 215535458) {
              return;
            } else {
              ((pj) this).field_G = null;
              return;
            }
          }
        }
    }

    private final String d(byte param0) {
        Object var3 = null;
        if (param0 != 38) {
          var3 = null;
          int discarded$2 = this.a((byte) -112, (w) null, -4, 94, (String) null);
          return "<u=2164A2><col=2164A2>";
        } else {
          return "<u=2164A2><col=2164A2>";
        }
    }

    private final int a(int param0, int param1, String param2, w param3, int param4) {
        jf var6 = null;
        Object var7 = null;
        var6 = new jf(20, param4, 120 + param1, 25, param3, false, 120, 3, ql.field_Q, 16777215, param2);
        ((pj) this).b((byte) 75, (w) (Object) var6);
        if (param0 != 170) {
          var7 = null;
          ((pj) this).a(102, -98, 84, -63, (kf) null);
          return var6.field_v;
        } else {
          return var6.field_v;
        }
    }

    private final String g(int param0) {
        if (param0 != 14359) {
            return null;
        }
        return "</col></u>";
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        L0: {
          var2 = jd.a(fd.a((byte) -58, param0), 37);
          if (var2 != null) {
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        if (param1 > -13) {
          field_H = -41;
          return var2;
        } else {
          return var2;
        }
    }

    public final void a(int param0, bc param1, int param2, int param3) {
        int var6 = 0;
        Object var7 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (-1 != (param2 ^ -1)) {
          if (1 != param2) {
            if ((param2 ^ -1) != -3) {
              if (param0 < 50) {
                var7 = null;
                int discarded$4 = this.a((byte) 95, (w) null, -32, 20, (String) null);
                return;
              } else {
                return;
              }
            } else {
              jl.a("conduct.ws", (byte) -45);
              if (param0 < 50) {
                var7 = null;
                int discarded$5 = this.a((byte) 95, (w) null, -32, 20, (String) null);
                return;
              } else {
                return;
              }
            }
          } else {
            jl.a("privacy.ws", (byte) 37);
            if (param0 >= 50) {
              return;
            } else {
              var7 = null;
              int discarded$6 = this.a((byte) 95, (w) null, -32, 20, (String) null);
              return;
            }
          }
        } else {
          jl.a("terms.ws", (byte) 80);
          if (param0 >= 50) {
            return;
          } else {
            var7 = null;
            int discarded$7 = this.a((byte) 95, (w) null, -32, 20, (String) null);
            return;
          }
        }
    }

    private final int a(int param0, String param1, String param2, int param3, w param4, int param5) {
        if (param5 != 10000536) {
            return 60;
        }
        return this.a(35, param2, true, param0, param3, param1, param4);
    }

    private final int a(int param0, String param1, boolean param2, int param3, int param4, String param5, w param6) {
        li var9 = null;
        jf var10 = null;
        var10 = new jf(20, param4, param3 + 120, 25, param6, false, 120, 3, ql.field_Q, 16777215, param5);
        ((pj) this).b((byte) 113, (w) (Object) var10);
        var9 = new li(((nd) (Object) param6).a((byte) 97), param1, 126, param4 - -var10.field_v, param3 - -50, param0);
        var9.field_r = (vd) this;
        if (!param2) {
          ((pj) this).field_G = null;
          ((pj) this).b((byte) -123, (w) (Object) var9);
          return var10.field_v + var9.field_v;
        } else {
          ((pj) this).b((byte) -123, (w) (Object) var9);
          return var10.field_v + var9.field_v;
        }
    }

    final static dd a(int param0, byte param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            dd var5 = null;
            aa var5_ref = null;
            dd stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            dd stackOut_2_0 = null;
            try {
              L0: {
                var4 = Class.forName("qi");
                var5 = (dd) var4.newInstance();
                if (param1 == 99) {
                  break L0;
                } else {
                  pj.e((byte) 89);
                  break L0;
                }
              }
              var5.a(false, param0, param2, param3);
              stackOut_2_0 = (dd) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void e(byte param0) {
        field_B = null;
        field_L = null;
        field_N = null;
        if (param0 <= 52) {
            pj.e((byte) 97);
        }
    }

    private final boolean a(byte param0, nd param1) {
        ma var3 = null;
        sc var4 = null;
        Object var5 = null;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var3 = param1.a((byte) 110);
        if (var3 != null) {
          if (param0 == 35) {
            var4 = var3.b((byte) 117);
            if (var4 != ni.field_b) {
              if (jj.field_e == var4) {
                return false;
              } else {
                L0: {
                  if (var4 == rc.field_a) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L0;
                  }
                }
                return stackIn_17_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            var5 = null;
            boolean discarded$2 = ((pj) this).a('ﾤ', -28, (w) null, (byte) 103);
            var4 = var3.b((byte) 117);
            if (var4 != ni.field_b) {
              if (jj.field_e != var4) {
                if (var4 != rc.field_a) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final int a(byte param0, w param1, int param2, int param3, String param4) {
        int var6 = -35 / ((param0 - 63) / 36);
        jf var7 = new jf(20, param3, param2 + 120, 25, param1, false, 120, 3, ql.field_Q, 16777215, param4);
        ((pj) this).b((byte) 123, (w) (Object) var7);
        ld var8 = new ld(((nd) (Object) param1).a((byte) 103));
        ((pj) this).b((byte) 115, (w) (Object) var8);
        var8.a(15, 15, true, (var7.field_v + -15 >> 1080479681) + var7.field_o, var7.field_t - (-var7.field_j + -3));
        return var7.field_v;
    }

    final void a(byte param0, w param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((pj) this).field_I.field_D = this.h(-5210);
    }

    private final boolean e(boolean param0) {
        if (!this.h(-5210)) {
            return false;
        }
        int var2 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            if (!param0) {
                ((pj) this).field_I = null;
            }
            var2 = Integer.parseInt(((pj) this).field_M.field_u);
        } catch (NumberFormatException numberFormatException) {
        }
        return fd.a(((pj) this).field_E.field_u, 0, var2, ((pj) this).field_G.field_u, (pj) this, ((pj) this).field_O.field_u, ((pj) this).field_J.field_C);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Your email address is used to identify this account";
        field_B = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}

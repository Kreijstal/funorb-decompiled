/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class csa extends vg implements noa, qn, fo, gma, lj, ew {
    int field_m;
    private int field_q;
    int field_k;
    int field_j;
    mka[] field_t;
    private boolean field_v;
    private int field_h;
    private csa field_u;
    bca field_z;
    int field_l;
    static int field_n;
    static int field_g;
    la field_o;
    private gpa field_w;
    static su field_y;
    int field_p;
    private int field_f;
    private gpa field_s;
    int field_r;
    static int[] field_i;
    boolean field_x;

    public final int e(byte param0) {
        if (param0 >= -86) {
            Object var3 = null;
            ((csa) this).a((csa) null, -115, (byte) -23);
        }
        return ((csa) this).g((byte) 115);
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        csa var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!this.b(param0, param1)) {
          return;
        } else {
          L0: {
            ((csa) this).x(8);
            var3 = 0;
            if (param0) {
              break L0;
            } else {
              boolean discarded$2 = ((csa) this).s(-56);
              break L0;
            }
          }
          L1: while (true) {
            if (var3 >= ((csa) this).field_t.length) {
              return;
            } else {
              var4 = ((csa) this).field_t[var3].a(108);
              if (var4 != null) {
                var4.a(param0, param1);
                var3++;
                continue L1;
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final void c(boolean param0) {
        int var2 = 0;
        csa var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        ((csa) this).w(-124);
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((csa) this).field_t.length) {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_y = null;
                break L1;
              }
            }
            return;
          } else {
            var3 = ((csa) this).field_t[var2].a(94);
            if (var3 != null) {
              var3.c(true);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final mka a(int param0, int param1) {
        if (param1 != 8192) {
            Object var4 = null;
            boolean discarded$0 = ((csa) this).a(false, -41, (csa) null);
        }
        return ((csa) this).field_t[param0];
    }

    final static void a(boolean param0) {
        hk.field_e = new jea(0L, (jea) null);
        if (!(!rca.field_p)) {
            hk.field_e.b(-127, lva.field_t);
        }
        if (param0) {
            field_n = -21;
        }
        hk.field_e.b(-127, rra.field_e);
        oca.field_b = new lla(cla.field_o, hk.field_e);
        nra.field_a = new jea(0L, (jea) null);
        nra.field_a.b(-122, (jea) (Object) oca.field_b.field_a);
        nra.field_a.b(-128, st.field_j);
        re.a(-29040);
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param0 < 68) {
            gpa discarded$0 = ((csa) this).i((byte) -75);
            return false;
        }
        return false;
    }

    public final ew h(byte param0) {
        if (param0 < 105) {
            int discarded$0 = ((csa) this).r(70);
        }
        return (ew) (Object) ((csa) this).o((byte) -34);
    }

    public final boolean h(int param0) {
        if (param0 != 18407) {
            mka discarded$0 = this.a(20, 6);
            return false;
        }
        return false;
    }

    public final int k(int param0) {
        if (param0 != -21185) {
            ((csa) this).field_l = -20;
        }
        return ((csa) this).field_p;
    }

    public final la f(byte param0) {
        int var2 = -126 / ((param0 - 0) / 61);
        return ((csa) this).field_o;
    }

    public final int b(byte param0) {
        int var2 = -53 / ((param0 - -23) / 53);
        return ((csa) this).d(3);
    }

    void x(int param0) {
        if (param0 != 8) {
            ((csa) this).field_r = -107;
        }
    }

    private final void m(byte param0) {
        int var3 = 0;
        mka var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        mka[] var6 = ((csa) this).field_t;
        mka[] var2 = var6;
        if (param0 != -24) {
            boolean discarded$0 = ((csa) this).d((byte) -51);
        }
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.a(((csa) this).field_f, (byte) -61, ((csa) this).field_o, ((csa) this).field_h);
        }
    }

    private final boolean p(byte param0) {
        int var2 = -18 / ((param0 - -28) / 57);
        return ((csa) this).field_o.o((byte) -82);
    }

    final void a(boolean param0, int param1, ui param2, ui param3) {
        int var5 = 0;
        csa var6 = null;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param2 != null) {
            ((csa) this).field_w = param2.a(86, false);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1 == 6) {
            break L1;
          } else {
            ((csa) this).field_f = -31;
            break L1;
          }
        }
        L2: {
          if (param3 == null) {
            break L2;
          } else {
            ((csa) this).field_s = param3.a(104, false);
            break L2;
          }
        }
        var5 = 0;
        L3: while (true) {
          if (((csa) this).field_t.length <= var5) {
            return;
          } else {
            var6 = ((csa) this).field_t[var5].a(120);
            if (var6 != null) {
              var6.a(param0, 6, param2, param3);
              var5++;
              continue L3;
            } else {
              var5++;
              continue L3;
            }
          }
        }
    }

    public final boolean l(int param0) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              L2: {
                if (null == ((csa) this).field_u) {
                  break L2;
                } else {
                  if (((csa) this).field_u.l(0)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (!((csa) this).field_o.o((byte) -82)) {
                  break L3;
                } else {
                  if (this.b(true, ((csa) this).field_o.i(6029))) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
            stackOut_8_0 = 1;
            stackIn_10_0 = stackOut_8_0;
            break L0;
          }
          return stackIn_10_0 != 0;
        } else {
          return true;
        }
    }

    final boolean a(boolean param0, int param1, csa param2) {
        int var4 = 0;
        csa var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var4 = param1;
        L0: while (true) {
          if (((csa) this).field_t.length <= var4) {
            return false;
          } else {
            var5 = ((csa) this).field_t[var4].a(param1 ^ -103);
            if (var5 != null) {
              if (param2 != var5) {
                if (param0) {
                  if (var5.a(param0, 0, param2)) {
                    return true;
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return true;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    public final int c(int param0) {
        if (param0 > -11) {
            ((csa) this).field_u = null;
        }
        return ((csa) this).field_l;
    }

    public final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 != 110) {
            ((csa) this).field_s = null;
        }
        return io.a(param4, ((csa) this).e(9648), (byte) -62, param3, ((csa) this).d(3), param1, ((csa) this).field_k, ((csa) this).field_l, param2);
    }

    void a(la param0, int param1) {
        if (param1 != 1) {
            ((csa) this).field_k = -87;
        }
        if (null == ((csa) this).field_u) {
            ((csa) this).field_j = param0.a(((csa) this).field_j, (byte) 71);
        } else {
            ((csa) this).field_j = -((csa) this).field_j;
        }
        ((csa) this).field_r = dfa.a(-((csa) this).field_r, 8192, -85);
        this.d(true);
        ((csa) this).field_v = !((csa) this).field_v ? true : false;
        this.m((byte) -24);
    }

    public final int e(int param0) {
        int var3 = 0;
        int var4 = 0;
        if (param0 != 9648) {
            return 20;
        }
        int var2 = ((csa) this).field_p;
        if (null != ((csa) this).field_u) {
            var3 = ((csa) this).field_j >> 1034964488;
            var4 = var2 >> -937468920;
            var2 = var3 * (((csa) this).field_u.field_f >> -1075285880) + var4 * (((csa) this).field_u.field_h >> -190151128);
            var2 = var2 + ((csa) this).field_u.e(9648);
        }
        return var2;
    }

    public static void j(byte param0) {
        field_i = null;
        if (param0 != -107) {
            Object var2 = null;
            csa.a(104, -8, 16, (g[]) null);
        }
        field_y = null;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            boolean discarded$0 = ((csa) this).a((byte) -31, 116, -25, -38, 120);
        }
    }

    public final int i(int param0) {
        if (param0 <= 90) {
            return 61;
        }
        return ((csa) this).field_j;
    }

    abstract lj u(int param0);

    final void a(byte param0, mka[] param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        ((csa) this).field_t = param1;
        if (param0 <= 64) {
            ((csa) this).m(-58);
        }
        for (var3 = 0; param1.length > var3; var3++) {
            ((csa) this).field_t[var3].a(-34, var3, (csa) this);
        }
    }

    final csa a(int param0, boolean param1, boolean param2) {
        int var4 = 0;
        csa var5 = null;
        csa var6 = null;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (!param1) {
            break L0;
          } else {
            if (param0 == ((csa) this).field_s.a((byte) 111)) {
              return (csa) this;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param1) {
            break L1;
          } else {
            if (param0 == ((csa) this).field_w.a((byte) 88)) {
              return (csa) this;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (!param2) {
            break L2;
          } else {
            ((csa) this).field_r = 111;
            break L2;
          }
        }
        var4 = 0;
        L3: while (true) {
          if (((csa) this).field_t.length > var4) {
            var5 = ((csa) this).field_t[var4].a(-92);
            if (var5 != null) {
              var6 = var5.a(param0, param1, false);
              if (var6 != null) {
                return var6;
              } else {
                var4++;
                continue L3;
              }
            } else {
              var4++;
              continue L3;
            }
          } else {
            return null;
          }
        }
    }

    final csa a(int param0, boolean param1, int param2) {
        if (param2 != 20) {
            Object var5 = null;
            ((csa) this).a(true, false, (la) null, 109, -103, 35, (fsa) null);
        }
        if (!param1) {
            return ((csa) this).field_o.a(param1, param0, param2 ^ 18);
        }
        return ((csa) this).a(param0, param1, false);
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 1434528720) {
            int discarded$0 = ((csa) this).g(113);
        }
        ((csa) this).field_j = param2;
        ((csa) this).field_p = param1;
    }

    csa(la param0, int param1, kh param2, csa param3) {
        this(param0, param1);
        int var5 = 0;
        csa var6 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        L0: {
          ((csa) this).field_u = param3;
          if (param3 != null) {
            break L0;
          } else {
            if ((param0.field_E ^ -1) < -21) {
              ((csa) this).field_j = 1048576 * bla.a(true, 8, param2.b((byte) 44, 8));
              ((csa) this).field_p = 1048576 * bla.a(true, 8, param2.b((byte) 44, 8));
              break L0;
            } else {
              ((csa) this).field_j = bla.a(true, 12, param2.b((byte) 44, 12)) << 555277520;
              ((csa) this).field_p = bla.a(true, 12, param2.b((byte) 44, 12)) << 743325648;
              break L0;
            }
          }
        }
        L1: {
          if (!((csa) this).v(555277520)) {
            break L1;
          } else {
            if (20 < param0.field_E) {
              ((csa) this).field_l = 2097152 * param2.b((byte) 44, 6);
              ((csa) this).field_k = 2097152 * param2.b((byte) 44, 6);
              break L1;
            } else {
              ((csa) this).field_l = param2.b((byte) 44, 10) << 1434528720;
              ((csa) this).field_k = param2.b((byte) 44, 10) << 2128485232;
              break L1;
            }
          }
        }
        L2: {
          if (!((csa) this).n((byte) -122)) {
            break L2;
          } else {
            ((csa) this).field_r = oo.a(4, 8192, 0, param2.b((byte) 44, 4));
            break L2;
          }
        }
        L3: {
          if (20 > param0.field_E) {
            break L3;
          } else {
            if (!((csa) this).a(6)) {
              break L3;
            } else {
              L4: {
                stackOut_12_0 = this;
                stackIn_14_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if ((param2.b((byte) 44, 1) ^ -1) != -2) {
                  stackOut_14_0 = this;
                  stackOut_14_1 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L4;
                } else {
                  stackOut_13_0 = this;
                  stackOut_13_1 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  break L4;
                }
              }
              ((csa) this).field_x = stackIn_15_1 != 0;
              break L3;
            }
          }
        }
        L5: {
          ((csa) this).field_z = new bca(param0.field_E, param2);
          stackOut_16_0 = this;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if ((param2.b((byte) 44, 1) ^ -1) != -2) {
            stackOut_18_0 = this;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L5;
          } else {
            stackOut_17_0 = this;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L5;
          }
        }
        ((csa) this).field_v = stackIn_19_1 != 0;
        var5 = 0;
        L6: while (true) {
          if (((csa) this).field_t.length <= var5) {
            L7: {
              if (!((csa) this).field_v) {
                break L7;
              } else {
                this.m((byte) -24);
                break L7;
              }
            }
            this.d(true);
          } else {
            if (1 == param2.b((byte) 44, 1)) {
              var6 = vha.field_c.a(param2, param0, (byte) -7, (csa) this);
              var6.a(1434528720, ((csa) this).field_t[var5].c((byte) 126).field_d << 136544272, ((csa) this).field_t[var5].c((byte) 111).field_f << 1434159056);
              ((csa) this).field_t[var5].a(var6, 126);
              var5++;
              continue L6;
            } else {
              var5++;
              continue L6;
            }
          }
        }
    }

    void a(int param0, boolean param1) {
        ((csa) this).field_j = ((csa) this).field_j + param0;
        if (!param1) {
            ((csa) this).field_w = null;
        }
        ((csa) this).field_p = ((csa) this).field_p + param0;
    }

    public final boolean b(boolean param0) {
        if (!param0) {
            return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, g[] param3) {
        if (param1 != 2097152) {
            field_g = -32;
        }
        if (!(param0 != param2)) {
            return;
        }
        g var5 = param3[param2];
        g var4 = var5;
        param3[param2] = param3[param0];
        param3[param0] = var5;
    }

    final void a(csa param0, int param1, byte param2) {
        ((csa) this).field_q = param1;
        if (param2 != -52) {
            ((csa) this).field_r = -73;
        }
        ((csa) this).field_u = param0;
    }

    final void a(int param0, uw param1) {
        if (this.p((byte) -94)) {
            param1.a((byte) -116, ((csa) this).t(8), (fo) this);
        }
        if (param0 != -1704) {
            field_n = 90;
        }
    }

    public final boolean j(int param0) {
        if (param0 != -1) {
            int discarded$0 = ((csa) this).e((byte) 109);
            return false;
        }
        return false;
    }

    abstract boolean s(int param0);

    public final void m(int param0) {
        int var2 = -58 % ((param0 - 28) / 49);
        if (!(((csa) this).s(-15254))) {
            return;
        }
        ((csa) this).field_x = !((csa) this).field_x ? true : false;
    }

    public final void a(int param0, iq param1) {
        if (param0 <= 103) {
            ((csa) this).field_r = -82;
        }
    }

    public final int g(byte param0) {
        if (param0 != 115) {
            return -84;
        }
        return 0;
    }

    void w(int param0) {
        if (param0 >= -122) {
            ((csa) this).x(71);
        }
    }

    abstract boolean v(int param0);

    public final int c(byte param0) {
        if (param0 <= 91) {
            return -114;
        }
        return ((csa) this).e(9648);
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            int discarded$0 = ((csa) this).g(-122);
            return false;
        }
        return false;
    }

    public final gpa n(int param0) {
        if (param0 != 31974) {
            ((csa) this).field_o = null;
        }
        return ((csa) this).field_w;
    }

    final int r(int param0) {
        if (param0 != 12) {
            return 114;
        }
        return ((csa) this).field_m;
    }

    public final gpa i(byte param0) {
        if (param0 != 84) {
            return null;
        }
        return ((csa) this).field_s;
    }

    abstract boolean n(byte param0);

    public final lj a(int param0, int param1, boolean param2) {
        if (param0 != 28672) {
            ((csa) this).c(false);
        }
        return (lj) (Object) ((csa) this).a(param1, param2, 20);
    }

    boolean a(int param0) {
        if (param0 != 6) {
            return false;
        }
        return ((csa) this).s(-15254);
    }

    final static void a(int param0, kra param1) {
        nma.field_m = param1;
        if (param0 != 1048576) {
            csa.a(true);
        }
    }

    private final void d(boolean param0) {
        int var2 = 0;
        csa var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        ((csa) this).field_f = hua.a((byte) 106, -((csa) this).g(-25787) >> -432399614);
        ((csa) this).field_h = bua.a(0, -((csa) this).g(-25787) >> 276614786);
        var2 = 0;
        L0: while (true) {
          if (((csa) this).field_t.length <= var2) {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((csa) this).field_t = null;
                break L1;
              }
            }
            return;
          } else {
            ((csa) this).field_t[var2].a(((csa) this).field_f, ((csa) this).field_h, (byte) 98);
            var3 = ((csa) this).field_t[var2].a(-122);
            if (var3 != null) {
              var3.d(true);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final boolean b(boolean param0, int param1) {
        if (!param0) {
            ((csa) this).m(-109);
        }
        return ((csa) this).field_z.a(param1, 14530);
    }

    public final int a(byte param0) {
        if (param0 != 55) {
            boolean discarded$0 = this.p((byte) -128);
        }
        return ((csa) this).field_k;
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 28 / ((-12 - param0) / 54);
        ((csa) this).field_l = param1;
        ((csa) this).field_k = param2;
    }

    final boolean k(byte param0) {
        if (param0 > -52) {
            return true;
        }
        if (!(((csa) this).field_o.w(0) != null)) {
            return true;
        }
        return ((csa) this).field_o.w(0).a((csa) this, true, true);
    }

    public final int d(int param0) {
        int var3 = 0;
        int var4 = 0;
        if (param0 != 3) {
            gpa discarded$0 = ((csa) this).n(107);
        }
        int var2 = ((csa) this).field_j;
        if (!(null == ((csa) this).field_u)) {
            var3 = var2 >> 1212617992;
            var4 = ((csa) this).field_p >> -952897912;
            var2 = (((csa) this).field_u.field_h >> 1607227240) * var3 - (((csa) this).field_u.field_f >> -900438360) * var4;
            var2 = var2 + ((csa) this).field_u.d(3);
        }
        return var2;
    }

    public final int g(int param0) {
        if (param0 != -25787) {
            ((csa) this).field_f = -1;
        }
        int var2 = ((csa) this).field_r;
        if (null != ((csa) this).field_u) {
            var2 = var2 + (((csa) this).field_u.g(-25787) + ((csa) this).field_u.a(((csa) this).field_q, param0 ^ -17595).a(false));
        }
        return var2;
    }

    final csa o(byte param0) {
        if (param0 >= -17) {
            boolean discarded$0 = this.p((byte) 101);
        }
        if (((csa) this).field_u != null) {
            return ((csa) this).field_u.o((byte) -84);
        }
        return (csa) this;
    }

    public final int b(int param0) {
        int var2 = -69 % ((param0 - 1) / 45);
        return 0;
    }

    void a(boolean param0, kh param1) {
        int var3 = 0;
        csa var4 = null;
        int var5 = 0;
        kh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        kh stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        kh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        kh stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        kh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        kh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        kh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        kh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        kh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        kh stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        kh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        kh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (((csa) this).field_u != null) {
            break L0;
          } else {
            param1.a((byte) -128, dqa.a(true, ((csa) this).field_j / 1048576, 8), 8);
            param1.a((byte) -125, dqa.a(true, ((csa) this).field_p / 1048576, 8), 8);
            break L0;
          }
        }
        L1: {
          if (((csa) this).v(555277520)) {
            param1.a((byte) 80, ((csa) this).field_l / 2097152, 6);
            param1.a((byte) -127, ((csa) this).field_k / 2097152, 6);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (((csa) this).n((byte) -122)) {
            param1.a((byte) 8, cn.a((byte) 103, ((csa) this).field_r, 8192, 4), 4);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (!((csa) this).a(6)) {
            break L3;
          } else {
            L4: {
              stackOut_9_0 = (kh) param1;
              stackOut_9_1 = 116;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              if (((csa) this).field_x) {
                stackOut_11_0 = (kh) (Object) stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = 1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                break L4;
              } else {
                stackOut_10_0 = (kh) (Object) stackIn_10_0;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 0;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                break L4;
              }
            }
            ((kh) (Object) stackIn_12_0).a((byte) stackIn_12_1, stackIn_12_2, 1);
            break L3;
          }
        }
        L5: {
          ((csa) this).field_z.a((byte) -97, param1);
          stackOut_13_0 = (kh) param1;
          stackOut_13_1 = 79;
          stackIn_15_0 = stackOut_13_0;
          stackIn_15_1 = stackOut_13_1;
          stackIn_14_0 = stackOut_13_0;
          stackIn_14_1 = stackOut_13_1;
          if (!((csa) this).field_v) {
            stackOut_15_0 = (kh) (Object) stackIn_15_0;
            stackOut_15_1 = stackIn_15_1;
            stackOut_15_2 = 0;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            stackIn_16_2 = stackOut_15_2;
            break L5;
          } else {
            stackOut_14_0 = (kh) (Object) stackIn_14_0;
            stackOut_14_1 = stackIn_14_1;
            stackOut_14_2 = 1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_16_2 = stackOut_14_2;
            break L5;
          }
        }
        ((kh) (Object) stackIn_16_0).a((byte) stackIn_16_1, stackIn_16_2, 1);
        var3 = 0;
        if (!param0) {
          L6: while (true) {
            if (var3 >= ((csa) this).field_t.length) {
              return;
            } else {
              var4 = ((csa) this).field_t[var3].a(86);
              if (var4 != null) {
                param1.a((byte) -42, 1, 1);
                vha.field_c.a(var4, -16097, param1);
                var3++;
                continue L6;
              } else {
                param1.a((byte) -127, 0, 1);
                var3++;
                continue L6;
              }
            }
          }
        } else {
          return;
        }
    }

    abstract int t(int param0);

    void q(byte param0) {
        if (param0 != -128) {
            this.d(false);
        }
    }

    abstract void a(boolean param0, boolean param1, la param2, int param3, int param4, int param5, fsa param6);

    csa(la param0, int param1) {
        ((csa) this).field_t = new mka[]{};
        ((csa) this).field_z = new bca();
        ((csa) this).field_x = true;
        ((csa) this).field_o = param0;
        ((csa) this).field_m = param1;
        ((csa) this).field_w = param0.d(-31957).a(-54, false);
        ((csa) this).q((byte) -128);
        this.d(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new su(2, 4, 4, 0);
        field_i = new int[1000];
    }
}

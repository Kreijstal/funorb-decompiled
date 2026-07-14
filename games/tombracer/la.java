/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la implements ew, fo, noa {
    int field_E;
    static naa field_R;
    private int field_x;
    private dt field_h;
    private int field_e;
    private int field_v;
    static String[] field_m;
    static kia field_k;
    private int field_C;
    private int field_N;
    private vna field_d;
    private int field_w;
    static nh field_j;
    static nh[][] field_p;
    private vna field_i;
    private vna field_z;
    private qea field_t;
    private uw field_S;
    private int field_n;
    int field_a;
    private vna field_l;
    private pta field_s;
    private pta field_f;
    private pta field_c;
    npa field_u;
    private qea field_H;
    private te field_D;
    private tqa field_B;
    private int field_r;
    private kh field_K;
    private ui field_y;
    private bba field_U;
    private int field_I;
    private boolean field_T;
    private ui field_q;
    private ffa field_o;
    private int field_Q;
    private fq field_P;
    private int[] field_b;
    private int field_L;
    private ts field_g;
    private int field_M;
    private int field_J;
    private dj field_F;
    private int field_A;
    sqa field_G;

    private final mda b(int param0, int param1, int param2, int param3) {
        int var5 = 112 / ((param0 - -6) / 43);
        return (mda) (Object) ((la) this).field_f.a(-2698, param1, param2, ((la) this).field_S, param3);
    }

    final int a(int param0, int param1, gma param2, int param3, int param4, byte param5) {
        if (param5 >= -121) {
            return -66;
        }
        return this.a(param4, 32238, param2, param3, ((la) this).field_u.b(param4, -1, param3, param0, param1), param0, param1);
    }

    final bba w(int param0) {
        if (param0 != 0) {
            ((la) this).field_C = 2;
        }
        return ((la) this).field_U;
    }

    private final int a(int param0, int param1, gma param2, int param3, ffa[] param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        ffa var10 = null;
        int var11 = 0;
        int var12 = 0;
        ffa var13 = null;
        int var14 = 0;
        int var15 = 0;
        ffa var16 = null;
        ffa var17 = null;
        var14 = TombRacer.field_G ? 1 : 0;
        var8 = 0;
        var10 = null;
        var11 = 0;
        var12 = 0;
        L0: while (true) {
          if (param4.length <= var12) {
            if (var11 >= (param5 >> 177118800) * (param6 >> -1553494544)) {
              L1: {
                var8 = 0;
                if (param1 == 32238) {
                  break L1;
                } else {
                  ((la) this).field_T = false;
                  break L1;
                }
              }
              var15 = 0;
              var12 = var15;
              L2: while (true) {
                if (param4.length <= var15) {
                  if (var8 <= 0) {
                    ((la) this).field_o = null;
                    return 1;
                  } else {
                    ((la) this).field_o = var10;
                    return 2;
                  }
                } else {
                  var17 = param4[var15];
                  var13 = var17;
                  if ((Object) (Object) var13 != (Object) (Object) param2) {
                    var9 = var17.a(true, param5, param0, param3, 1, param6);
                    if (var9 > var8) {
                      var8 = var9;
                      var10 = var13;
                      var15++;
                      continue L2;
                    } else {
                      var15++;
                      continue L2;
                    }
                  } else {
                    var15++;
                    continue L2;
                  }
                }
              }
            } else {
              ((la) this).field_o = var10;
              return 0;
            }
          } else {
            var16 = param4[var12];
            var13 = var16;
            if ((Object) (Object) var13 != (Object) (Object) param2) {
              L3: {
                var9 = var16.a(true, param5, param0, param3, 0, param6);
                if (var9 > var8) {
                  var10 = var13;
                  var8 = var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              var11 = var11 + var9;
              var12++;
              continue L0;
            } else {
              var12++;
              continue L0;
            }
          }
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        uja var8 = null;
        mda var9 = null;
        int var10 = 0;
        int var11 = 0;
        mda var12 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        var6 = 262144;
        if (param1 < var6) {
          return false;
        } else {
          var7 = ((la) this).a(var6, var6, (gma) null, param4, param3, (byte) -128);
          if (1 != var7) {
            L0: {
              var8 = new uja(((la) this).field_f.field_b);
              if (param0 == 30097) {
                break L0;
              } else {
                this.b(-85, -33);
                break L0;
              }
            }
            var9 = (mda) (Object) var8.a(true);
            L1: while (true) {
              if (var9 == null) {
                L2: {
                  if (param2 != 1) {
                    break L2;
                  } else {
                    if (((la) this).a((ffa) null, param1 * 2, 2, 1, param3, param4, false, (gma) null, 2 * param1)) {
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                var12 = this.b(94, param3, 0, param4);
                var12.a((la) this, param4, 99, param3, param2, param1);
                ((la) this).field_u.a((ffa) (Object) var12, (byte) 124);
                return true;
              } else {
                L3: {
                  if (var9.r(-70) != param2) {
                    break L3;
                  } else {
                    var10 = var9.t(param0 ^ 30096);
                    if (io.a(var6, var9.e(9648), (byte) -78, var6, var9.d(3), param3, var10, var10, param4)) {
                      var9.h((byte) -1);
                      return true;
                    } else {
                      break L3;
                    }
                  }
                }
                var9 = (mda) (Object) var8.a(param0 ^ -30098);
                continue L1;
              }
            }
          } else {
            return false;
          }
        }
    }

    final hr a(int param0, int param1, byte param2, int param3) {
        if (param2 != 100) {
            boolean discarded$0 = ((la) this).k((byte) 119);
        }
        hr var5 = (hr) (Object) ((la) this).field_c.a(-2698, param1, param3, ((la) this).field_S, param0);
        var5.a(true, uca.field_c.a(100, 0));
        return var5;
    }

    final uw j(byte param0) {
        int var2 = -2 % ((param0 - -2) / 36);
        return ((la) this).field_S;
    }

    final int v(int param0) {
        if (param0 != 0) {
            ((la) this).field_h = null;
        }
        return ((la) this).field_M;
    }

    final int s(int param0) {
        int var2 = -114 / ((param0 - -42) / 61);
        return ((la) this).field_w;
    }

    final dj b(boolean param0) {
        if (param0) {
            ((la) this).field_B = null;
        }
        return ((la) this).field_F;
    }

    final void a(int param0, sqa param1) {
        if (param0 != 4855) {
            ((la) this).field_g = null;
        }
        ((la) this).field_G = param1;
    }

    final void a(fsa param0, byte param1) {
        if (param1 != 32) {
            int discarded$0 = ((la) this).v(-75);
        }
        if (!(!param0.n((byte) 121))) {
            ((la) this).field_i.b((byte) -94, (vg) (Object) param0);
            param0.F(param1 + 82);
            param0.x((byte) -60);
        }
    }

    private final void b(byte param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if (!(-1 != param1)) {
            return;
        }
        fsa var5 = (fsa) (Object) ((la) this).field_i.f(-80);
        while (var5 != null) {
            if (!var5.a(param1, 31749)) {
                ((la) this).a(var5, 2);
                var5.v((byte) 109);
            } else {
                var5.d(param1, (byte) -55);
            }
            var5 = (fsa) (Object) ((la) this).field_i.e(115);
        }
        db var6 = (db) (Object) ((la) this).field_d.f(-80);
        while (var6 != null) {
            if (!(var6.b(param1, 1569))) {
                this.a(var6, -26755);
                var6.m(0);
            }
            var6 = (db) (Object) ((la) this).field_d.e(108);
        }
        if (null != ((la) this).field_B) {
            ((la) this).field_B.a(param1, (byte) -33);
        }
        if (param0 >= -4) {
            this.k(7);
        }
        fsa var7 = (fsa) (Object) ((la) this).field_i.f(-80);
        while (var7 != null) {
            var7.A(23645);
            var7 = (fsa) (Object) ((la) this).field_i.e(125);
        }
        db var8 = (db) (Object) ((la) this).field_d.f(-80);
        while (var8 != null) {
            var8.c(true);
            var8 = (db) (Object) ((la) this).field_d.e(114);
        }
    }

    final void a(byte param0, fq param1) {
        ((la) this).field_P = param1;
        if (param0 != 46) {
            ((la) this).field_y = null;
        }
    }

    final tqa f(byte param0) {
        if (param0 != 93) {
            return null;
        }
        return ((la) this).field_B;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        if (param1 != 131072) {
            field_p = null;
        }
        if (!param5) {
            return io.a(((la) this).field_v, param4, (byte) -123, ((la) this).field_w, param0, ((la) this).field_w / 2, param3, param2, ((la) this).field_v / 2);
        }
        return ck.a(param0, param3, ((la) this).field_v / 2, ((la) this).field_v, ((la) this).field_w, param4, (byte) 125, ((la) this).field_w / 2, param2);
    }

    final void i(byte param0) {
        if (param0 >= -24) {
            ((la) this).a(true, 90, -98, 23, -45, -48);
        }
        this.a((byte) -108, true);
    }

    final eha b(int param0) {
        if (param0 != -1) {
            Object var3 = null;
            ((la) this).a(15, (sqa) null);
        }
        return ((la) this).a(-1553494544).m(param0 + 9263);
    }

    final void b(int param0, boolean param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        ((la) this).field_B.f((byte) 64);
        fsa var6 = (fsa) (Object) ((la) this).field_i.f(param0 + -87);
        while (var6 != null) {
            var6.a((la) this, false);
            var6 = (fsa) (Object) ((la) this).field_i.e(115);
        }
        db var7 = (db) (Object) ((la) this).field_d.f(-80);
        while (var7 != null) {
            var7.a(-76, (la) this);
            var7 = (db) (Object) ((la) this).field_d.e(122);
        }
        csa var8 = (csa) (Object) ((la) this).field_z.f(-80);
        while (var8 != null) {
            var8.a((la) this, 1);
            var8 = (csa) (Object) ((la) this).field_z.e(126);
        }
        if (param0 != 7) {
            Object var5 = null;
            int discarded$0 = ((la) this).a(-11, 100, 116, 16, 41, 79, (gma) null);
        }
        ((la) this).field_Q = ((la) this).a(((la) this).field_Q, (byte) 71);
        if (param1) {
            if (!((Object) (Object) ((la) this).field_h.a((byte) -3) != this)) {
                ((la) this).u(-9).q((byte) -57);
            }
            ((la) this).field_D.a((la) this, -110);
            ((la) this).field_s.a(121);
            ((la) this).field_f.a(119);
            ((la) this).field_c.a(97);
        }
    }

    final qea e(boolean param0) {
        if (!param0) {
            return null;
        }
        return ((la) this).field_H;
    }

    private final void k(int param0) {
        if (param0 <= 98) {
            ((la) this).field_J = 98;
        }
        ((la) this).field_Q = ((la) this).field_v / 2;
        ((la) this).field_L = ((la) this).field_w - 6291456;
    }

    final boolean k(byte param0) {
        if (param0 != 53) {
            boolean discarded$0 = ((la) this).b(31, 62, -43, -109, -2);
        }
        return ((la) this).a(-1553494544).g(110);
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 > -110) {
            ((la) this).field_g = null;
        }
        ((la) this).field_B.a(param3, param6, true, param0, param1, param2, param5);
    }

    final qea q(int param0) {
        int var2 = 60 % ((-19 - param0) / 42);
        return ((la) this).field_t;
    }

    final ep a(int param0, int param1, int param2, int param3) {
        int var5 = -101 / ((29 - param2) / 33);
        return (ep) (Object) ((la) this).field_s.a(-2698, param0, param3, ((la) this).field_S, param1);
    }

    final boolean j(int param0) {
        if (param0 != 0) {
            return false;
        }
        return ((la) this).field_P.a(-25584);
    }

    private final void a(boolean param0, byte param1) {
        dt var4 = null;
        L0: {
          ((la) this).field_H = null;
          ((la) this).field_t = null;
          ((la) this).field_d.d(8);
          if (param1 > 95) {
            break L0;
          } else {
            la.l(-107);
            break L0;
          }
        }
        L1: {
          ((la) this).field_i.d(8);
          ((la) this).field_z.d(8);
          if (((la) this).field_G == null) {
            break L1;
          } else {
            ((la) this).field_G.a((byte) -127);
            break L1;
          }
        }
        L2: {
          if (param0) {
            L3: {
              ((la) this).field_t = new qea(new int[1]);
              ((la) this).field_H = new qea(new int[1]);
              ((la) this).field_u = new npa(false, 16);
              ((la) this).field_c = new pta((la) this, (c) (Object) new hr(), 100);
              ((la) this).field_s = new pta((la) this, (c) (Object) new ep(), 25);
              ((la) this).field_f = new pta((la) this, (c) (Object) new mda(), 50);
              ((la) this).field_B = new tqa((la) this, 2097152);
              ((la) this).field_c.a((byte) 114);
              ((la) this).field_s.a((byte) 122);
              ((la) this).field_f.a((byte) 116);
              ((la) this).field_F = new dj((la) this);
              if (((la) this).field_U != null) {
                break L3;
              } else {
                break L3;
              }
            }
            ((la) this).field_r = 0;
            break L2;
          } else {
            break L2;
          }
        }
        L4: {
          ((la) this).field_D.a(-10430);
          var4 = ((la) this).a(-1553494544);
          if (var4 != null) {
            var4.a((la) this, -9774);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (((la) this).field_S == null) {
            break L5;
          } else {
            ((la) this).field_S.a(10);
            break L5;
          }
        }
        ((la) this).field_g.b((byte) 100);
    }

    final boolean a(boolean param0, int param1, gma param2, int param3) {
        if (param0) {
            Object var6 = null;
            int discarded$0 = ((la) this).a((ep) null, -25, (up) null);
        }
        return 1 == ((la) this).a(131072, 131072, param2, param3, param1, (byte) -128) ? true : false;
    }

    private final void m(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        ((la) this).field_y.a((byte) 97);
        fsa var2 = (fsa) (Object) ((la) this).field_i.f(-80);
        if (param0 != 9) {
            ui discarded$0 = ((la) this).d(-36);
        }
        while (var2 != null) {
            var2.a(true, false, ((la) this).field_y, new ui());
            var2 = (fsa) (Object) ((la) this).field_i.e(113);
        }
        ((la) this).field_q.a((byte) 74);
        csa var2_ref = (csa) (Object) ((la) this).field_z.f(param0 ^ -71);
        while (var2_ref != null) {
            var2_ref.a(false, 6, ((la) this).field_q, new ui());
            var2_ref = (csa) (Object) ((la) this).field_z.e(108);
        }
    }

    private final int a(boolean param0, pc param1, up param2) {
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
            ((la) this).field_y = null;
        }
        if (!(param2 != null)) {
            return 0;
        }
        int var4 = 0;
        ffa[] var5 = ((la) this).field_u.a(param1, (byte) -103);
        for (var6 = 0; var6 < var5.length; var6++) {
            var4 = var4 + var5[var6].a(param2, 12, param1);
        }
        return var4;
    }

    final boolean a(int param0, pc param1, gma param2, byte param3) {
        int var5 = 0;
        ffa[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        var5 = 0;
        var7 = 67 % ((param3 - -40) / 60);
        param1.field_l = false;
        var6 = ((la) this).field_u.a(param1, (byte) -68);
        var8 = 0;
        L0: while (true) {
          if (var6.length <= var8) {
            return var5 != 0;
          } else {
            if (var6[var8].a(-1, param2, param0, param1)) {
              param1.field_l = true;
              var5 = 1;
              var8++;
              continue L0;
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
            ((la) this).field_b = null;
        }
        return ((la) this).field_A;
    }

    public final lj a(int param0, int param1, boolean param2) {
        uja var4 = null;
        fsa var5 = null;
        lj var6 = null;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param0 == 28672) {
            break L0;
          } else {
            String discarded$2 = ((la) this).toString();
            break L0;
          }
        }
        var4 = new uja(((la) this).field_i);
        var5 = (fsa) (Object) var4.a(true);
        L1: while (true) {
          if (var5 != null) {
            var6 = var5.a(false, param1, (byte) -26);
            if (var6 != null) {
              return var6;
            } else {
              var5 = (fsa) (Object) var4.a(-1);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final int a(int param0, int param1) {
        if (param0 > -95) {
            boolean discarded$0 = ((la) this).b(10, -88, -18, 76, -15);
        }
        return ((la) this).field_b[param1];
    }

    final void a(iq param0, int param1) {
        ((la) this).field_S = new uw(10);
        ((la) this).field_S.a(-24343, param0);
        if (param1 <= 2) {
            field_R = null;
        }
    }

    private final void a(byte param0, boolean param1) {
        uw var3 = null;
        csa var4 = null;
        int var5 = 0;
        Object var6 = null;
        hca var7 = null;
        uw var8 = null;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param1) {
            L1: {
              this.t(8);
              if (null == ((la) this).field_U) {
                this.b(6, -20);
                var8 = ((la) this).field_S;
                var3 = var8;
                ((la) this).field_S = null;
                var4 = (csa) (Object) ((la) this).field_z.f(-80);
                L2: while (true) {
                  if (var4 == null) {
                    var4 = (csa) (Object) ((la) this).field_z.f(-80);
                    L3: while (true) {
                      if (var4 == null) {
                        ((la) this).field_z.d(8);
                        this.b((byte) -12, 1);
                        ((la) this).field_S = var8;
                        break L1;
                      } else {
                        var4.a(true, 1);
                        var4 = (csa) (Object) ((la) this).field_z.e(115);
                        continue L3;
                      }
                    }
                  } else {
                    var4.a(false, true, (la) this, 0, 0, 1, (fsa) null);
                    var4 = (csa) (Object) ((la) this).field_z.e(123);
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (uw) (Object) ((la) this).a(-1553494544).m(9262);
            if (var3 != null) {
              ((eha) (Object) var3).a(-2, ((la) this).u(-18), (la) this);
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L4: {
          var7 = ((la) this).u(-22);
          var7.a((la) this, ((la) this).field_Q, ((la) this).field_L, true);
          var7.a(-127, param1);
          if (param0 < -80) {
            break L4;
          } else {
            var6 = null;
            int discarded$1 = ((la) this).a(94, 108, 82, 71, 28, 102, (gma) null);
            break L4;
          }
        }
        L5: {
          ((la) this).field_u.b((ffa) (Object) ((la) this).u(-107), 7073);
          if (((la) this).field_S == null) {
            break L5;
          } else {
            this.h(-106);
            break L5;
          }
        }
    }

    private final void h(int param0) {
        iq var2 = null;
        int var3 = 0;
        int var4 = 0;
        fsa var5 = null;
        db var6 = null;
        csa var7 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (((la) this).field_S != null) {
          L0: {
            ((la) this).field_S.a(10);
            var2 = ((la) this).field_S.c(0);
            if (param0 < -86) {
              break L0;
            } else {
              ((la) this).field_C = 71;
              break L0;
            }
          }
          L1: {
            if (((la) this).o((byte) -82)) {
              var2.a(-128, (byte) -3, (((la) this).field_w >> -107975504) + 128, -128, (((la) this).field_v >> -149005168) - -128);
              break L1;
            } else {
              var3 = 192;
              var2.a(var3, (byte) -3, (((la) this).field_w >> -1508353872) + -var3, var3, -var3 + (((la) this).field_v >> 24375024));
              break L1;
            }
          }
          ((la) this).u(-12).a(25, ((la) this).field_S);
          ((la) this).field_D.a(((la) this).field_S, -28255);
          ((la) this).field_s.a(((la) this).field_S, (byte) -89, true, 7);
          ((la) this).field_c.a(((la) this).field_S, (byte) 126, true, 7);
          ((la) this).field_f.a(((la) this).field_S, (byte) -33, false, 6);
          var5 = (fsa) (Object) ((la) this).field_i.f(-80);
          L2: while (true) {
            if (var5 == null) {
              var6 = (db) (Object) ((la) this).field_d.f(-80);
              L3: while (true) {
                if (var6 == null) {
                  var7 = (csa) (Object) ((la) this).field_z.f(-80);
                  L4: while (true) {
                    if (var7 == null) {
                      L5: {
                        dea.field_a.a(121, (la) this);
                        ((la) this).field_B.a(((la) this).field_S, 0);
                        if (null == ((la) this).field_G) {
                          break L5;
                        } else {
                          ((la) this).field_G.c((byte) 119);
                          break L5;
                        }
                      }
                      return;
                    } else {
                      var7.a(-1704, ((la) this).field_S);
                      var7 = (csa) (Object) ((la) this).field_z.e(116);
                      continue L4;
                    }
                  }
                } else {
                  var6.a((byte) 48, ((la) this).field_S);
                  var6 = (db) (Object) ((la) this).field_d.e(108);
                  continue L3;
                }
              }
            } else {
              var5.a(122, ((la) this).field_S);
              var5 = (fsa) (Object) ((la) this).field_i.e(107);
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final void d(boolean param0) {
        System.out.println("Rooms ID: " + ((la) this).field_x);
        System.out.println("Projectiles: ");
        ((la) this).field_s.a(false);
        if (!param0) {
            Object var3 = null;
            boolean discarded$0 = ((la) this).a(2, (pc) null, (gma) null, (byte) 52);
        }
    }

    public final void a(int param0, iq param1) {
        if (param0 <= 103) {
            boolean discarded$0 = ((la) this).o((byte) 66);
        }
    }

    final void a(fsa param0, int param1) {
        if (!(!param0.n((byte) 113))) {
            param0.p(120);
            param0.B(-165);
        }
        if (param1 != 2) {
            eha discarded$0 = ((la) this).b(85);
        }
    }

    final int a(byte param0) {
        if (param0 != 107) {
            Object var3 = null;
            int discarded$0 = ((la) this).a(33, (gma) null);
        }
        return ((la) this).field_r;
    }

    private final void a(db param0, int param1) {
        ((la) this).b(-1, param0.a((byte) 55), param0.c(-101), param0.e(9648), -124, param0.d(param1 ^ -26754), 0);
        param0.p(112);
        ((la) this).field_u.a((ffa) (Object) param0, (byte) 118);
        if (param1 != -26755) {
            ((la) this).field_z = null;
        }
        if (!(null == ((la) this).field_S)) {
            param0.a(((la) this).field_S, (byte) 105);
        }
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            fsa[] discarded$0 = this.a(54, 60, 37, -15, -117);
        }
    }

    final void c(int param0, int param1) {
        ((la) this).field_b[param1] = -1;
        if (param0 != -22490) {
            ((la) this).i((byte) -124);
        }
    }

    public final int c(byte param0) {
        if (param0 < 91) {
            return 63;
        }
        return ((la) this).field_w / 2;
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
            boolean discarded$0 = ((la) this).a(121, 21, 23, -88, -121, true);
            return 0;
        }
        return 0;
    }

    private final fsa[] a(int param0, int param1, int param2, int param3, int param4) {
        ub var6 = null;
        ffa[] var7 = null;
        int var8_int = 0;
        fsa[] var8 = null;
        fsa var9 = null;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        if (param2 > 27) {
          var6 = new ub();
          var7 = ((la) this).field_u.b(param1, -1, param4, param0, param3);
          var8_int = 0;
          L0: while (true) {
            if (var7.length <= var8_int) {
              var8 = new fsa[var6.a(-1)];
              var6.a((Object[]) (Object) var8, false);
              return var8;
            } else {
              if (var7[var8_int] instanceof fsa) {
                var9 = (fsa) (Object) var7[var8_int];
                if (var9.a((byte) 110, param1, param4, param3, param0)) {
                  var6.a((byte) -37, (Object) (Object) var9);
                  var8_int++;
                  continue L0;
                } else {
                  var8_int++;
                  continue L0;
                }
              } else {
                var8_int++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final fsa[] n(int param0) {
        if (param0 != 16) {
            return null;
        }
        return this.a(((la) this).field_v, ((la) this).field_w / 2, 59, ((la) this).field_w, ((la) this).field_v / 2);
    }

    public static void p(int param0) {
        field_m = null;
        field_j = null;
        field_R = null;
        field_k = null;
        if (param0 != -128) {
            la.l(-58);
        }
        field_p = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, byte param6) {
        int var8 = -28 % ((param6 - 20) / 33);
        return ((la) this).field_B.b(param3, param2, param4, 8597, param0, param1, param5);
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        if (((la) this).field_G == null) {
            return;
        }
        if (param4 != 6) {
            ((la) this).field_B = null;
        }
        ((la) this).field_G.a(param4 ^ -112, new fm(param2, param1, param0, param3));
    }

    final int o(int param0) {
        if (param0 != 8) {
            csa discarded$0 = ((la) this).a(true, 88, 35);
        }
        return ((la) this).field_C;
    }

    final void a(int param0, boolean param1) {
        if (param1) {
            ((la) this).a(false, -109, -42, 112, -101, -128);
        }
        ((la) this).field_N = param0;
    }

    final boolean h(byte param0) {
        if (param0 != -77) {
            ((la) this).c(-56, 76);
        }
        return ((la) this).field_T;
    }

    final void g(int param0) {
        this.a(false, (byte) 123);
        ((la) this).field_B = null;
        if (param0 <= 43) {
            boolean discarded$0 = ((la) this).a(-72, -34, 70, 80, true, 64, (byte) -83);
        }
        ((la) this).field_f = null;
        ((la) this).field_c = null;
        ((la) this).field_F = null;
        ((la) this).field_s = null;
        ((la) this).field_u = null;
    }

    final int i(int param0) {
        if (param0 != 6029) {
            return -14;
        }
        return null == ((la) this).field_U ? -1 : ((la) this).field_U.a(false);
    }

    final void a(byte param0, int param1) {
        if (param0 <= 14) {
            ((la) this).field_o = null;
        }
        ((la) this).field_I = param1;
    }

    final boolean o(byte param0) {
        if (param0 != -82) {
            return true;
        }
        return ((la) this).field_U != null ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 < 118) {
            Object var9 = null;
            ((la) this).a(-24, (kua) null);
        }
        ((la) this).field_B.a(param1, param5, param4, param2, param0, param3, true);
    }

    private final void t(int param0) {
        uw var2 = null;
        kh var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        fsa var7_ref = null;
        int var7 = 0;
        csa var8 = null;
        int var9 = 0;
        fsa var10 = null;
        csa var11 = null;
        db var12 = null;
        kh var13 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        this.a(true, (byte) 123);
        if (null == ((la) this).field_K) {
          return;
        } else {
          L0: {
            var2 = ((la) this).field_S;
            ((la) this).field_S = null;
            ((la) this).field_y.a((byte) -69);
            bca.b((byte) 55);
            var3 = ((la) this).field_K;
            var3.field_h = 0;
            var3.h((byte) -64);
            ((la) this).field_E = var3.b((byte) 44, 8);
            ((la) this).field_P = new fq(((la) this).field_E, var3);
            if (19 >= ((la) this).field_E) {
              ((la) this).field_v = var3.b((byte) 44, 12) << 980690448;
              ((la) this).field_w = var3.b((byte) 44, 12) << 1339267024;
              break L0;
            } else {
              if (20 != ((la) this).field_E) {
                ((la) this).field_v = 2097152 * var3.b((byte) 44, 6);
                ((la) this).field_w = var3.b((byte) 44, 6) * 2097152;
                break L0;
              } else {
                ((la) this).field_v = 2097152 * var3.b((byte) 44, 8);
                ((la) this).field_w = var3.b((byte) 44, 8) * 2097152;
                break L0;
              }
            }
          }
          L1: {
            ((la) this).field_B.a(2097152, (la) this, 4);
            if (11 > ((la) this).field_E) {
              this.k(109);
              break L1;
            } else {
              ((la) this).field_Q = var3.b((byte) 44, 12) << -888478256;
              ((la) this).field_L = var3.b((byte) 44, 12) << -1544830896;
              break L1;
            }
          }
          var4 = var3.b((byte) 44, param0);
          var5 = 0;
          L2: while (true) {
            if (var4 <= var5) {
              var5 = var3.b((byte) 44, 8);
              var6 = 0;
              L3: while (true) {
                if (var6 >= var5) {
                  L4: {
                    ((la) this).field_B.a((byte) 25, var3, (la) this);
                    if ((((la) this).field_E ^ -1) > -12) {
                      break L4;
                    } else {
                      var6 = var3.b((byte) 44, 8);
                      var7 = 0;
                      L5: while (true) {
                        if (var6 <= var7) {
                          break L4;
                        } else {
                          var8 = vha.field_c.a(var3, 55, (la) this);
                          if (var8 != null) {
                            this.a(var8, 33554432);
                            var7++;
                            continue L5;
                          } else {
                            var7++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                  L6: {
                    if (-13 != (((la) this).field_E ^ -1)) {
                      if (((la) this).field_E < 13) {
                        break L6;
                      } else {
                        if (26 > ((la) this).field_E) {
                          var6 = 0;
                          L7: while (true) {
                            if ((var6 ^ -1) <= -4) {
                              break L6;
                            } else {
                              int discarded$2 = var3.b((byte) 44, 8);
                              var6++;
                              continue L7;
                            }
                          }
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      var6 = 0;
                      L8: while (true) {
                        if (3 <= var6) {
                          break L6;
                        } else {
                          int discarded$3 = var3.b((byte) 44, 10);
                          var6++;
                          continue L8;
                        }
                      }
                    }
                  }
                  L9: {
                    if (16 <= ((la) this).field_E) {
                      ((la) this).field_A = var3.b((byte) 44, 2);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (((la) this).field_E < 19) {
                      break L10;
                    } else {
                      ((la) this).field_J = var3.b((byte) 44, 3);
                      break L10;
                    }
                  }
                  var3.i((byte) 98);
                  this.m(param0 ^ 1);
                  var10 = (fsa) (Object) ((la) this).field_i.f(-80);
                  L11: while (true) {
                    if (var10 == null) {
                      var11 = (csa) (Object) ((la) this).field_z.f(-80);
                      L12: while (true) {
                        if (var11 == null) {
                          L13: {
                            var3.field_h = 0;
                            if (((la) this).field_E != -27) {
                              L14: {
                                if (-20 < ((la) this).field_E) {
                                  break L14;
                                } else {
                                  this.b(1, param0 + -28);
                                  break L14;
                                }
                              }
                              ((la) this).field_E = 26;
                              var13 = new kh(30000);
                              this.a(var13, -28426);
                              ((la) this).field_K = var13;
                              var13.field_h = 0;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L15: {
                            if (var2 != null) {
                              ((la) this).field_S = var2;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (!((la) this).field_T) {
                              break L16;
                            } else {
                              ((la) this).b(param0 ^ 15, false);
                              break L16;
                            }
                          }
                          return;
                        } else {
                          var11.c(true);
                          var11 = (csa) (Object) ((la) this).field_z.e(124);
                          continue L12;
                        }
                      }
                    } else {
                      var10.h(true);
                      var10.u(0);
                      var10 = (fsa) (Object) ((la) this).field_i.e(115);
                      continue L11;
                    }
                  }
                } else {
                  var7_ref = new fsa((la) this, var3, false);
                  ((la) this).a(var7_ref, (byte) 32);
                  var7_ref.D((byte) 118);
                  var6++;
                  continue L3;
                }
              }
            } else {
              var12 = new db((la) this, var3);
              this.a(var12, true);
              var5++;
              continue L2;
            }
          }
        }
    }

    final boolean a(int param0, gma param1, int param2, pc param3, gma param4, up param5) {
        param3.field_h = null;
        int var7 = 0;
        if (((la) this).a(param0, param3, param4, (byte) -127)) {
            var7 = 1;
        }
        int discarded$1 = this.a(true, param3, param5);
        if (param2 >= -38) {
            boolean discarded$2 = ((la) this).a(99, -62, -70, -43, true, -109, (byte) -77);
        }
        return var7 != 0;
    }

    final boolean a(ffa param0, int param1, int param2, int param3, int param4, int param5, boolean param6, gma param7, int param8) {
        ffa[] var10 = null;
        int var11 = 0;
        ffa var12 = null;
        int var13 = 0;
        ffa[] var14 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        if (param3 != 0) {
          L0: {
            var14 = ((la) this).field_u.b(param4, -1, param5, param8, param1);
            var10 = var14;
            if (param2 == 2) {
              break L0;
            } else {
              la.p(-15);
              break L0;
            }
          }
          var11 = 0;
          L1: while (true) {
            if (var14.length <= var11) {
              return false;
            } else {
              var12 = var14[var11];
              if (param0 != var12) {
                if (var12.a(param1, param7, 85, param8, param4, param0, param5, param3)) {
                  L2: {
                    if (param7 == null) {
                      break L2;
                    } else {
                      if (!param6) {
                        break L2;
                      } else {
                        if (!var12.a(param7.a((byte) 55), param7, 107, param7.c(-48), param7.k(-21185), param0, param7.i(103), param3)) {
                          return true;
                        } else {
                          var11++;
                          continue L1;
                        }
                      }
                    }
                  }
                  return true;
                } else {
                  var11++;
                  continue L1;
                }
              } else {
                var11++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    private final void a(db param0, boolean param1) {
        ((la) this).field_d.b((byte) -74, (vg) (Object) param0);
        ((la) this).field_u.b((ffa) (Object) param0, 7073);
        if (!(null == ((la) this).field_S)) {
            param0.a((byte) 85, ((la) this).field_S);
        }
        ((la) this).a(0, -1, param0.d(3), param0.e(9648), param0.c(-69), param0.a((byte) 55), 126);
        if (!param1) {
            ((la) this).a(30, 106, -59, -125, (byte) -34);
        }
    }

    final int l(byte param0) {
        int var2 = 82 % ((81 - param0) / 35);
        return ((la) this).field_J;
    }

    final void a(la param0, byte param1) {
        if (param1 <= 108) {
            return;
        }
        ((la) this).field_D.a(23436, param0.field_l);
    }

    private final void a(csa param0, int param1) {
        ((la) this).field_z.b((byte) -88, (vg) (Object) param0);
        if (null != ((la) this).field_S) {
            param0.a(param1 + -33556136, ((la) this).field_S);
        }
        if (param1 != 33554432) {
            int discarded$0 = ((la) this).n((byte) -3);
        }
    }

    final int q(byte param0) {
        if (param0 != -82) {
            return -41;
        }
        return ((la) this).field_x;
    }

    final void r(int param0) {
        int var2 = 112 / ((93 - param0) / 32);
        this.a((byte) -125, false);
    }

    final int a(int param0, gma param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ffa[] var7 = null;
        int var8 = 0;
        ffa var9 = null;
        ffa[] var10 = null;
        int var11 = 0;
        ffa var12 = null;
        int var13 = 0;
        L0: {
          var13 = TombRacer.field_G ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            int discarded$2 = ((la) this).e((byte) 46);
            break L0;
          }
        }
        L1: {
          var3 = param1.d(param0 ^ 3);
          var4 = param1.e(9648);
          var5 = param1.c(param0 ^ -38);
          var6 = param1.a((byte) 55);
          var7 = ((la) this).field_u.b(var4, param0 + -1, var3, var5, var6);
          var8 = this.a(var4, 32238, param1, var3, var7, var5, var6);
          var9 = ((la) this).field_o;
          if (var8 == 0) {
            break L1;
          } else {
            var10 = var7;
            var11 = 0;
            L2: while (true) {
              if (var11 >= var10.length) {
                break L1;
              } else {
                var12 = var10[var11];
                if (var12 instanceof fsa) {
                  ((fsa) (Object) var12).a(26689, param1, var9, var8);
                  var11++;
                  continue L2;
                } else {
                  var11++;
                  continue L2;
                }
              }
            }
          }
        }
        return var8;
    }

    final void c(boolean param0) {
        if (null == ((la) this).field_S) {
            return;
        }
        if (param0) {
            ((la) this).field_Q = 15;
        }
        iq discarded$0 = ((la) this).field_S.c(0);
        ((la) this).field_S.b(1909106792);
        ((la) this).field_S.e(30057);
    }

    final boolean b(int param0, byte param1) {
        if (param1 != -44) {
            Object var4 = null;
            ((la) this).a((fsa) null, 48);
        }
        return (((la) this).field_b[param0] ^ -1) != 0 ? true : false;
    }

    final boolean g(byte param0) {
        hca var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var3 = 23 / ((param0 - 24) / 33);
            var2 = ((la) this).u(-86);
            if (this != (Object) (Object) var2.f((byte) 64)) {
              break L1;
            } else {
              if (-12582913 > (var2.e(9648) ^ -1)) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final int a(int param0, int param1, up param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var11 = TombRacer.field_G ? 1 : 0;
        if (param2 == null) {
            return 0;
        }
        int var7 = 0;
        ffa[] var8 = ((la) this).field_u.b(param1, -1, param5, param4, param3);
        int var9 = 96 / ((82 - param0) / 41);
        for (var10 = 0; var10 < var8.length; var10++) {
            var7 = var7 + var8[var10].a(param2, param4, param5, 0, param1, param3);
        }
        return var7;
    }

    final dt a(int param0) {
        if (param0 != -1553494544) {
            field_k = null;
        }
        return ((la) this).field_h;
    }

    final void d(int param0, int param1) {
        db var4 = null;
        fsa var5_ref_fsa = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        hca var8 = null;
        uja var9 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        var8 = ((la) this).u(-62);
        if (var8 == null) {
          return;
        } else {
          var8.d(5, param0);
          if (this != (Object) (Object) var8.f((byte) -83)) {
            return;
          } else {
            if (((la) this).a(param1 + -1553494544).k(-19271)) {
              ((la) this).field_a = 6029;
              ((la) this).field_a = var8.e(((la) this).field_a, -40);
              var4 = (db) (Object) ((la) this).field_d.f(param1 + -80);
              L0: while (true) {
                if (var4 == null) {
                  var9 = new uja(((la) this).field_i);
                  var5_ref_fsa = (fsa) (Object) var9.a(true);
                  L1: while (true) {
                    if (var5_ref_fsa == null) {
                      L2: {
                        ((la) this).field_g.c(true);
                        var5 = ((la) this).a(-1553494544).g(param1 + 112) ? 1 : 0;
                        if (param1 == 0) {
                          break L2;
                        } else {
                          var7 = null;
                          ((la) this).a((fsa) null, -31);
                          break L2;
                        }
                      }
                      L3: {
                        ((la) this).field_s.a(var5 != 0, (byte) -126);
                        ((la) this).field_f.a(var5 != 0, (byte) -31);
                        ((la) this).field_c.a(var5 != 0, (byte) -103);
                        ((la) this).field_a = ((la) this).field_s.a(((la) this).field_a, -119);
                        if (((la) this).field_S == null) {
                          break L3;
                        } else {
                          ((la) this).field_S.d(0);
                          if (((la) this).field_h.f(8, param1 + 10915)) {
                            ((la) this).field_S.c(0).a(uca.field_c.a(9, 0) + -4, 0, -4 + uca.field_c.a(9, 0), 26768);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (null == ((la) this).field_G) {
                          break L4;
                        } else {
                          ((la) this).field_G.a(param1 + 82, false);
                          break L4;
                        }
                      }
                      ((la) this).field_I = ((la) this).field_I + 1;
                      ((la) this).field_r = ((la) this).field_r + 1;
                      return;
                    } else {
                      L5: {
                        var5_ref_fsa.b(param1 + 106, false);
                        ((la) this).field_a = var5_ref_fsa.i(((la) this).field_a, -109);
                        if (!var5_ref_fsa.h(param1 + 18407)) {
                          break L5;
                        } else {
                          var5_ref_fsa.p(param1 ^ 79);
                          break L5;
                        }
                      }
                      var5_ref_fsa = (fsa) (Object) var9.a(-1);
                      continue L1;
                    }
                  }
                } else {
                  var4.s(param1 ^ 0);
                  var4 = (db) (Object) ((la) this).field_d.e(120);
                  continue L0;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    public final String toString() {
        return "Room(courseIndex:" + ((la) this).field_N + ",id:" + ((la) this).field_x + ",diff:" + 1 + ")";
    }

    final int n(byte param0) {
        if (param0 > -36) {
            return 42;
        }
        return ((la) this).field_e;
    }

    final hca u(int param0) {
        if (param0 >= 0) {
            ((la) this).field_A = -11;
        }
        return ((la) this).a(-1553494544).field_g;
    }

    final int m(byte param0) {
        if (param0 != -86) {
            boolean discarded$0 = ((la) this).a(-23, -87, 7, -112, true, -64, (byte) -10);
        }
        return ((la) this).field_v;
    }

    final void b(boolean param0, int param1, int param2) {
        ((la) this).field_b[param2] = param1;
        if (param0) {
            ((la) this).field_g = null;
        }
    }

    private final void b(int param0, int param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        int var3 = param0 * 2097152;
        if (!(var3 != 0)) {
            return;
        }
        ((la) this).field_Q = ((la) this).field_Q + var3;
        ((la) this).field_w = ((la) this).field_w + var3 * 2;
        ((la) this).field_v = ((la) this).field_v + 2 * var3;
        ((la) this).field_L = ((la) this).field_L + var3;
        ((la) this).field_B.b(2097152, 2, var3);
        if (param1 != -20) {
            ((la) this).field_b = null;
        }
        fsa var6 = (fsa) (Object) ((la) this).field_i.f(-80);
        while (var6 != null) {
            var6.o(var3, 81);
            var6 = (fsa) (Object) ((la) this).field_i.e(115);
        }
        csa var7 = (csa) (Object) ((la) this).field_z.f(param1 ^ 92);
        while (var7 != null) {
            var7.a(var3, true);
            var7 = (csa) (Object) ((la) this).field_z.e(param1 ^ -104);
        }
        db var8 = (db) (Object) ((la) this).field_d.f(-80);
        while (var8 != null) {
            var8.a(param1 + -105, var3);
            var8 = (db) (Object) ((la) this).field_d.e(108);
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        pca var7 = ((la) this).field_B.a(param0, param3, (byte) 119);
        if (!(var7 != null)) {
            return;
        }
        if (param2 < 104) {
            field_p = null;
        }
        if (!var7.b(0)) {
            // if_icmpne L87
        }
        ((la) this).field_F.b(param0, param3, param5, param1, 0, param4);
    }

    final int a(int param0, byte param1) {
        if (param1 != 71) {
            return 111;
        }
        return -param0 - (-(((la) this).field_v / 2) - ((la) this).field_v / 2);
    }

    final static void l(int param0) {
        if (!(!vo.field_b)) {
            f.b(120);
        }
        if (param0 != 2097152) {
            la.l(104);
        }
    }

    final int a(int param0, int param1, int param2, int param3, int param4, int param5, gma param6) {
        ffa[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        ffa var11 = null;
        int var12 = 0;
        ffa[] var13 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        var13 = ((la) this).field_u.b(param0, -1, param5, param1, param4);
        var8 = var13;
        var9 = 0;
        var10 = param2;
        L0: while (true) {
          if (var13.length <= var10) {
            return var9;
          } else {
            var11 = var13[var10];
            if ((Object) (Object) param6 != (Object) (Object) var11) {
              var9 = var9 + var11.a(true, param1, param0, param5, param3, param4);
              var10++;
              continue L0;
            } else {
              var10++;
              continue L0;
            }
          }
        }
    }

    final int p(byte param0) {
        if (param0 < 14) {
            return -10;
        }
        return ((la) this).field_I;
    }

    private final void a(kh param0, int param1) {
        int var4 = 0;
        db var5 = null;
        fsa var6 = null;
        csa var7 = null;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          this.m(9);
          param0.i(8);
          param0.a((byte) -127, 26, 8);
          ((la) this).field_P.a(param0, 23);
          if (param1 == -28426) {
            break L0;
          } else {
            boolean discarded$1 = ((la) this).o((byte) 71);
            break L0;
          }
        }
        param0.a((byte) 59, ((la) this).field_v / 2097152, 6);
        param0.a((byte) -125, ((la) this).field_w / 2097152, 6);
        param0.a((byte) -126, ((la) this).field_Q >> -666845232, 12);
        param0.a((byte) -128, ((la) this).field_L >> 1822363824, 12);
        param0.a((byte) -125, ((la) this).field_d.a((byte) -16), 8);
        var5 = (db) (Object) ((la) this).field_d.f(-80);
        L1: while (true) {
          if (var5 == null) {
            param0.a((byte) 119, ((la) this).field_i.a((byte) -16), 8);
            var6 = (fsa) (Object) ((la) this).field_i.f(-80);
            L2: while (true) {
              if (var6 == null) {
                ((la) this).field_B.a(8, param0);
                param0.a((byte) 120, ((la) this).field_z.a((byte) -16), 8);
                var7 = (csa) (Object) ((la) this).field_z.f(-80);
                L3: while (true) {
                  if (var7 == null) {
                    param0.a((byte) 102, ((la) this).field_A, 2);
                    param0.a((byte) 127, ((la) this).field_J, 3);
                    param0.k(-1826190686);
                    return;
                  } else {
                    vha.field_c.a(var7, -16097, param0);
                    var7 = (csa) (Object) ((la) this).field_z.e(107);
                    continue L3;
                  }
                }
              } else {
                L4: {
                  if (!var6.w((byte) -117)) {
                    var6.a(param0, -100);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6 = (fsa) (Object) ((la) this).field_i.e(114);
                continue L2;
              }
            }
          } else {
            var5.a(true, param0);
            var5 = (db) (Object) ((la) this).field_d.e(113);
            continue L1;
          }
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            return true;
        }
        return false;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        pca var7 = ((la) this).field_B.a(param4, param1, (byte) 119);
        if (!(var7 != null)) {
            return;
        }
        if (var7.b(0)) {
            if (!(0 != uca.field_c.a(5, 0))) {
                ((la) this).field_F.b(param4, param1, param3, param2, 0, param5);
            }
        }
        if (param0) {
            hr discarded$0 = ((la) this).a(55, 54, (byte) -12, -30);
        }
    }

    final ui d(int param0) {
        if (param0 != -31957) {
            ((la) this).b(true, -14, -108);
        }
        return ((la) this).field_q;
    }

    final ui e(int param0) {
        int var2 = 49 % ((param0 - 42) / 59);
        return ((la) this).field_y;
    }

    final int a(ep param0, int param1, up param2) {
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        if (param1 != -16164) {
            ((la) this).field_E = 42;
        }
        if (param2 == null) {
            return 0;
        }
        int var4 = 0;
        ffa[] var5 = ((la) this).field_u.a((byte) -26, (ffa) (Object) param0);
        for (var6 = 0; var6 < var5.length; var6++) {
            var4 = var4 + var5[var6].a(param2, param0, -117);
        }
        return var4;
    }

    final int a(ffa param0, gma param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ffa[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int stackIn_5_0 = 0;
        int stackIn_39_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        var19 = TombRacer.field_G ? 1 : 0;
        if (param8 == 0) {
          L0: {
            if (!((la) this).a(param0, param6, 2, param2, param10, param7, param12, param1, param3)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 2;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          return stackIn_5_0;
        } else {
          if (-1 == (param2 ^ -1)) {
            return 0;
          } else {
            var14 = 0;
            var15 = 0;
            var17 = ((la) this).field_u.b(param10, -1, param7, param3, param6);
            if (param5 == 12) {
              var18 = 0;
              L1: while (true) {
                L2: {
                  if (var18 >= var17.length) {
                    break L2;
                  } else {
                    L3: {
                      var16 = 0;
                      if (var17[var18].a(param6, param1, 97, param3, param10, param0, param7, param2)) {
                        L4: {
                          var14 = 1;
                          if (param1 == null) {
                            break L4;
                          } else {
                            if (!param12) {
                              break L4;
                            } else {
                              if (var17[var18].a(param1.a((byte) 55), param1, 81, param1.c(-48), param1.k(-21185), param0, param1.i(param5 + 115), param2)) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var16 = 1;
                        if (!var17[var18].a((byte) -55, false)) {
                          var15 = 1;
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    if (var16 == 0) {
                      var17[var18] = null;
                      var18++;
                      continue L1;
                    } else {
                      var18++;
                      continue L1;
                    }
                  }
                }
                if (var15 != 0) {
                  return 2;
                } else {
                  var18 = 0;
                  L5: while (true) {
                    if (var18 >= var17.length) {
                      if (var15 == 0) {
                        L6: {
                          if (param8 == 2) {
                            var18 = 0;
                            L7: while (true) {
                              if (var17.length <= var18) {
                                break L6;
                              } else {
                                if (var17[var18] != null) {
                                  boolean discarded$2 = var17[var18].a(-117, param1);
                                  var18++;
                                  continue L7;
                                } else {
                                  var18++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        if (var14 != 0) {
                          return 1;
                        } else {
                          return 0;
                        }
                      } else {
                        return 2;
                      }
                    } else {
                      if (var17[var18] != null) {
                        L8: {
                          boolean discarded$3 = var17[var18].a(77, false, param8, param4, param9, param11);
                          var16 = 1;
                          if (!var17[var18].a(param6, param1, param5 ^ 64, param3, param10, param0, param7, param2)) {
                            var16 = 0;
                            break L8;
                          } else {
                            if (var15 != 0) {
                              break L8;
                            } else {
                              if (2 == param8) {
                                L9: {
                                  if (var17[var18].a(param1, 0)) {
                                    stackOut_38_0 = 0;
                                    stackIn_39_0 = stackOut_38_0;
                                    break L9;
                                  } else {
                                    stackOut_37_0 = 1;
                                    stackIn_39_0 = stackOut_37_0;
                                    break L9;
                                  }
                                }
                                var15 = stackIn_39_0;
                                break L8;
                              } else {
                                var15 = 1;
                                break L8;
                              }
                            }
                          }
                        }
                        if (var16 == 0) {
                          var17[var18] = null;
                          var18++;
                          continue L5;
                        } else {
                          var18++;
                          continue L5;
                        }
                      } else {
                        var18++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            } else {
              return -128;
            }
          }
        }
    }

    final void a(int param0, kua param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        ((la) this).field_l.b((byte) -54, (vg) (Object) param1);
        while ((((la) this).field_l.a((byte) -16) ^ -1) < -11) {
            vg discarded$0 = ((la) this).field_l.c(-99);
        }
        if (param0 != 8) {
            ((la) this).field_b = null;
        }
        ((la) this).field_M = ((la) this).field_M + 1;
    }

    public final int b(byte param0) {
        int var2 = 81 / ((-23 - param0) / 53);
        return ((la) this).field_v / 2;
    }

    final int c(int param0) {
        int var2 = -6 % ((param0 - 1) / 54);
        return ((la) this).field_N;
    }

    final csa a(boolean param0, int param1, int param2) {
        uja var4 = null;
        csa var5 = null;
        csa var6 = null;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param2 == 6) {
            break L0;
          } else {
            ((la) this).field_o = null;
            break L0;
          }
        }
        var4 = new uja(((la) this).field_z);
        var5 = (csa) (Object) var4.a(true);
        L1: while (true) {
          if (var5 != null) {
            var6 = var5.a(param1, false, false);
            if (var6 == null) {
              var5 = (csa) (Object) var4.a(-1);
              continue L1;
            } else {
              return var6;
            }
          } else {
            return null;
          }
        }
    }

    la(dt param0, int param1, kh param2, int param3, boolean param4) {
        int var6 = 0;
        ((la) this).field_E = 26;
        ((la) this).field_d = new vna();
        ((la) this).field_i = new vna();
        ((la) this).field_z = new vna();
        ((la) this).field_l = new vna();
        ((la) this).field_D = new te();
        ((la) this).field_y = new ui();
        ((la) this).field_q = new ui();
        ((la) this).field_b = new int[9];
        ((la) this).field_P = new fq();
        ((la) this).field_A = 0;
        ((la) this).field_J = 0;
        for (var6 = 0; ((la) this).field_b.length > var6; var6++) {
            ((la) this).field_b[var6] = -1;
        }
        ((la) this).field_h = param0;
        ((la) this).field_v = 33554432;
        ((la) this).field_K = param2;
        ((la) this).field_w = 33554432;
        ((la) this).field_x = param1;
        ((la) this).field_n = param3;
        ((la) this).field_T = param4 ? true : false;
        ((la) this).field_g = new ts((la) this);
        this.a(false, (byte) 113);
    }

    static {
    }
}

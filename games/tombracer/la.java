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
        return (mda) ((Object) this.field_f.a(-2698, param1, param2, this.field_S, param3));
    }

    final int a(int param0, int param1, gma param2, int param3, int param4, byte param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param5 < -121) {
              stackIn_4_0 = this.a(param4, 32238, param2, param3, this.field_u.b(param4, -1, param3, param0, param1), param0, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -66;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("la.EC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final bba w(int param0) {
        if (param0 != 0) {
            this.field_C = 2;
        }
        return this.field_U;
    }

    private final int a(int param0, int param1, gma param2, int param3, ffa[] param4, int param5, int param6) {
        int stackIn_11_0 = 0;
        ffa stackIn_17_0 = null;
        gma stackIn_17_1 = null;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        ffa var13 = null;
        int var14 = 0;
        ffa var15 = null;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var8_int = 0;
            var10 = null;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (param4.length <= var12) {
                if (var11 >= (param5 >> 177118800) * (param6 >> -1553494544)) {
                  L2: {
                    var8_int = 0;
                    if (param1 == 32238) {
                      break L2;
                    } else {
                      this.field_T = false;
                      break L2;
                    }
                  }
                  var12 = 0;
                  L3: while (true) {
                    if (param4.length <= var12) {
                      if (var8_int <= 0) {
                        this.field_o = null;
                        stackIn_27_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        this.field_o = (ffa) (var10);
                        stackIn_25_0 = 2;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      var13 = param4[var12];
                      stackIn_17_0 = (ffa) (var13);
                      stackIn_17_1 = (gma) (param2);
                      if (stackIn_17_0 != stackIn_17_1) {
                        L4: {
                          var9 = var13.a(true, param5, param0, param3, 1, param6);
                          if (var9 > var8_int) {
                            var8_int = var9;
                            var10 = var13;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var12++;
                        continue L3;
                      } else {
                        var12++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  this.field_o = (ffa) (var10);
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var15 = param4[var12];
                var13 = var15;
                if (var13 != param2) {
                  L5: {
                    var9 = var15.a(true, param5, param0, param3, 0, param6);
                    if (var9 > var8_int) {
                      var10 = var13;
                      var8_int = var9;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var11 = var11 + var9;
                  var12++;
                  continue L1;
                } else {
                  var12++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var8);

            stackIn_30_1 = new StringBuilder().append("la.KA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_25_0;
          } else {
            return stackIn_27_0;
          }
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        uja var8;
        mda var9;
        int var10;
        int var11;
        mda var12;
        var11 = TombRacer.field_G ? 1 : 0;
        var6 = 262144;
        if (param1 < var6) {
          return false;
        } else {
          var7 = this.a(var6, var6, (gma) null, param4, param3, (byte) -128);
          if (1 != var7) {
            L0: {
              var8 = new uja(this.field_f.field_b);
              if (param0 == 30097) {
                break L0;
              } else {
                this.b(-85, -33);
                break L0;
              }
            }
            var9 = (mda) ((Object) var8.a(true));
            L1: while (true) {
              if (var9 == null) {
                L2: {
                  if (param2 != 1) {
                    break L2;
                  } else {
                    if (this.a((ffa) null, param1 * 2, 2, 1, param3, param4, false, (gma) null, 2 * param1)) {
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                var12 = this.b(94, param3, 0, param4);
                var12.a((la) (this), param4, 99, param3, param2, param1);
                this.field_u.a((ffa) (var12), (byte) 124);
                return true;
              } else {
                L3: {
                  if ((var9.r(-70) ^ -1) != (param2 ^ -1)) {
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
                var9 = (mda) ((Object) var8.a(param0 ^ -30098));
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
            this.k((byte) 119);
        }
        hr var5 = (hr) ((Object) this.field_c.a(-2698, param1, param3, this.field_S, param0));
        var5.a(true, uca.field_c.a(100, 0));
        return var5;
    }

    final uw j(byte param0) {
        int var2 = -2 % ((param0 - -2) / 36);
        return this.field_S;
    }

    final int v(int param0) {
        if (param0 != 0) {
            this.field_h = (dt) null;
        }
        return this.field_M;
    }

    final int s(int param0) {
        int var2 = -114 / ((param0 - -42) / 61);
        return this.field_w;
    }

    final dj b(boolean param0) {
        if (param0) {
            this.field_B = (tqa) null;
        }
        return this.field_F;
    }

    final void a(int param0, sqa param1) {
        try {
            if (param0 != 4855) {
                this.field_g = (ts) null;
            }
            this.field_G = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "la.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(fsa param0, byte param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == 32) {
                break L1;
              } else {
                this.v(-75);
                break L1;
              }
            }
            L2: {
              if (param0.n((byte) 121)) {
                this.field_i.b((byte) -94, param0);
                param0.F(param1 + 82);
                param0.x((byte) -60);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("la.I(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    private final void b(byte param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if (!(-1 != param1)) {
            return;
        }
        fsa var3 = (fsa) ((Object) this.field_i.f(-80));
        while (var3 != null) {
            if (!var3.a(param1, 31749)) {
                this.a(var3, 2);
                var3.v((byte) 109);
            } else {
                var3.d(param1, (byte) -55);
            }
            var3 = (fsa) ((Object) this.field_i.e(115));
        }
        db var5 = (db) ((Object) this.field_d.f(-80));
        while (var5 != null) {
            if (!(var5.b(param1, 1569))) {
                this.a(var5, -26755);
                var5.m(0);
            }
            var5 = (db) ((Object) this.field_d.e(108));
        }
        if (null != this.field_B) {
            this.field_B.a(param1, (byte) -33);
        }
        if (param0 >= -4) {
            this.k(7);
        }
        fsa var6 = (fsa) ((Object) this.field_i.f(-80));
        while (var6 != null) {
            var6.A(23645);
            var6 = (fsa) ((Object) this.field_i.e(125));
        }
        db var7 = (db) ((Object) this.field_d.f(-80));
        while (var7 != null) {
            var7.c(true);
            var7 = (db) ((Object) this.field_d.e(114));
        }
    }

    final void a(byte param0, fq param1) {
        try {
            this.field_P = param1;
            if (param0 != 46) {
                this.field_y = (ui) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "la.LC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final tqa f(byte param0) {
        if (param0 != 93) {
            return (tqa) null;
        }
        return this.field_B;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        if (param1 != 131072) {
            field_p = (nh[][]) null;
        }
        if (!param5) {
            return io.a(this.field_v, param4, (byte) -123, this.field_w, param0, this.field_w / 2, param3, param2, this.field_v / 2);
        }
        return ck.a(param0, param3, this.field_v / 2, this.field_v, this.field_w, param4, (byte) 125, this.field_w / 2, param2);
    }

    final void i(byte param0) {
        if (param0 >= -24) {
            this.a(true, 90, -98, 23, -45, -48);
        }
        this.a((byte) -108, true);
    }

    final eha b(int param0) {
        if (param0 != -1) {
            sqa var3 = (sqa) null;
            this.a(15, (sqa) null);
        }
        return this.a(-1553494544).m(param0 + 9263);
    }

    final void b(int param0, boolean param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        this.field_B.f((byte) 64);
        fsa var6 = (fsa) ((Object) this.field_i.f(param0 + -87));
        while (var6 != null) {
            var6.a((la) (this), false);
            var6 = (fsa) ((Object) this.field_i.e(115));
        }
        db var7 = (db) ((Object) this.field_d.f(-80));
        while (var7 != null) {
            var7.a(-76, (la) (this));
            var7 = (db) ((Object) this.field_d.e(122));
        }
        csa var8 = (csa) ((Object) this.field_z.f(-80));
        while (var8 != null) {
            var8.a((la) (this), 1);
            var8 = (csa) ((Object) this.field_z.e(126));
        }
        if (param0 != 7) {
            gma var5 = (gma) null;
            this.a(-11, 100, 116, 16, 41, 79, (gma) null);
        }
        this.field_Q = this.a(this.field_Q, (byte) 71);
        if (param1) {
            if (!(this.field_h.a((byte) -3) != this)) {
                this.u(-9).q((byte) -57);
            }
            this.field_D.a((la) (this), -110);
            this.field_s.a(121);
            this.field_f.a(119);
            this.field_c.a(97);
        }
    }

    final qea e(boolean param0) {
        if (!param0) {
            return (qea) null;
        }
        return this.field_H;
    }

    private final void k(int param0) {
        if (param0 <= 98) {
            this.field_J = 98;
        }
        this.field_Q = this.field_v / 2;
        this.field_L = this.field_w - 6291456;
    }

    final boolean k(byte param0) {
        if (param0 != 53) {
            this.b(31, 62, -43, -109, -2);
        }
        return this.a(-1553494544).g(110);
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 > -110) {
            this.field_g = (ts) null;
        }
        this.field_B.a(param3, param6, true, param0, param1, param2, param5);
    }

    final qea q(int param0) {
        int var2 = 60 % ((-19 - param0) / 42);
        return this.field_t;
    }

    final ep a(int param0, int param1, int param2, int param3) {
        int var5 = -101 / ((29 - param2) / 33);
        return (ep) ((Object) this.field_s.a(-2698, param0, param3, this.field_S, param1));
    }

    final boolean j(int param0) {
        if (param0 != 0) {
            return false;
        }
        return this.field_P.a(-25584);
    }

    private final void a(boolean param0, byte param1) {
        dt var4;
        L0: {
          this.field_H = null;
          this.field_t = null;
          this.field_d.d(8);
          if (param1 > 95) {
            break L0;
          } else {
            la.l(-107);
            break L0;
          }
        }
        L1: {
          this.field_i.d(8);
          this.field_z.d(8);
          if (this.field_G == null) {
            break L1;
          } else {
            this.field_G.a((byte) -127);
            break L1;
          }
        }
        L2: {
          if (param0) {
            L3: {
              this.field_t = new qea(new int[]{this.field_n});
              this.field_H = new qea(new int[]{this.field_n});
              this.field_u = new npa(false, 16);
              this.field_c = new pta((la) (this), new hr(), 100);
              this.field_s = new pta((la) (this), new ep(), 25);
              this.field_f = new pta((la) (this), new mda(), 50);
              this.field_B = new tqa((la) (this), 2097152);
              this.field_c.a((byte) 114);
              this.field_s.a((byte) 122);
              this.field_f.a((byte) 116);
              this.field_F = new dj((la) (this));
              if (this.field_U != null) {
                break L3;
              } else {
                break L3;
              }
            }
            this.field_r = 0;
            break L2;
          } else {
            break L2;
          }
        }
        L4: {
          this.field_D.a(-10430);
          var4 = this.a(-1553494544);
          if (var4 != null) {
            var4.a((la) (this), -9774);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (this.field_S == null) {
            break L5;
          } else {
            this.field_S.a(10);
            break L5;
          }
        }
        this.field_g.b((byte) 100);
    }

    final boolean a(boolean param0, int param1, gma param2, int param3) {
        RuntimeException var5 = null;
        up var6 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var6 = (up) null;
                this.a((ep) null, -25, (up) null);
                break L1;
              }
            }
            L2: {
              if (1 != this.a(131072, 131072, param2, param3, param1, (byte) -128)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("la.PB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
        return stackIn_5_0 != 0;
    }

    private final void m(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        this.field_y.a((byte) 97);
        fsa var2 = (fsa) ((Object) this.field_i.f(-80));
        if (param0 != 9) {
            this.d(-36);
        }
        while (var2 != null) {
            var2.a(true, false, this.field_y, new ui());
            var2 = (fsa) ((Object) this.field_i.e(113));
        }
        this.field_q.a((byte) 74);
        csa var2_ref = (csa) ((Object) this.field_z.f(param0 ^ -71));
        while (var2_ref != null) {
            var2_ref.a(false, 6, this.field_q, new ui());
            var2_ref = (csa) ((Object) this.field_z.e(108));
        }
    }

    private final int a(boolean param0, pc param1, up param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ffa[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_y = (ui) null;
                break L1;
              }
            }
            if (param2 == null) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = 0;
              var5 = this.field_u.a(param1, (byte) -103);
              var6 = 0;
              L2: while (true) {
                if (var6 >= var5.length) {
                  stackIn_11_0 = var4_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4_int = var4_int + var5[var6].a(param2, 12, param1);
                  var6++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("la.EA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_11_0;
        }
    }

    final boolean a(int param0, pc param1, gma param2, byte param3) {
        int var5_int = 0;
        ffa[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var7 = 67 % ((param3 - -40) / 60);
            param1.field_l = false;
            var6 = this.field_u.a(param1, (byte) -68);
            var8 = 0;
            L1: while (true) {
              if (var6.length <= var8) {
                stackIn_7_0 = var5_int;
                break L0;
              } else {
                if (var6[var8].a(-1, param2, param0, param1)) {
                  param1.field_l = true;
                  var5_int = 1;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("la.GA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final int a(boolean param0) {
        if (param0) {
            this.field_b = (int[]) null;
        }
        return this.field_A;
    }

    public final lj a(int param0, int param1, boolean param2) {
        uja var4;
        fsa var5;
        lj var6;
        int var7;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param0 == 28672) {
            break L0;
          } else {
            this.toString();
            break L0;
          }
        }
        var4 = new uja(this.field_i);
        var5 = (fsa) ((Object) var4.a(true));
        L1: while (true) {
          if (var5 != null) {
            var6 = var5.a(false, param1, (byte) -26);
            if (var6 != null) {
              return var6;
            } else {
              var5 = (fsa) ((Object) var4.a(-1));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final int a(int param0, int param1) {
        if (param0 > -95) {
            this.b(10, -88, -18, 76, -15);
        }
        return this.field_b[param1];
    }

    final void a(iq param0, int param1) {
        try {
            this.field_S = new uw(10);
            this.field_S.a(-24343, param0);
            if (param1 <= 2) {
                field_R = (naa) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "la.KC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        uw var3;
        eha var3_ref;
        csa var4;
        int var5;
        gma var6;
        hca var7;
        uw var8;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param1) {
            L1: {
              this.t(8);
              if (null == this.field_U) {
                this.b(6, -20);
                var8 = this.field_S;
                var3 = var8;
                this.field_S = null;
                var4 = (csa) ((Object) this.field_z.f(-80));
                L2: while (true) {
                  if (var4 == null) {
                    var4 = (csa) ((Object) this.field_z.f(-80));
                    L3: while (true) {
                      if (var4 == null) {
                        this.field_z.d(8);
                        this.b((byte) -12, 1);
                        this.field_S = var8;
                        break L1;
                      } else {
                        var4.a(true, 1);
                        var4 = (csa) ((Object) this.field_z.e(115));
                        continue L3;
                      }
                    }
                  } else {
                    var4.a(false, true, (la) (this), 0, 0, 1, (fsa) null);
                    var4 = (csa) ((Object) this.field_z.e(123));
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            var3_ref = this.a(-1553494544).m(9262);
            if (var3_ref != null) {
              var3_ref.a(-2, this.u(-18), (la) (this));
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L4: {
          var7 = this.u(-22);
          var7.a((la) (this), this.field_Q, this.field_L, true);
          var7.a(-127, param1);
          if (param0 < -80) {
            break L4;
          } else {
            var6 = (gma) null;
            this.a(94, 108, 82, 71, 28, 102, (gma) null);
            break L4;
          }
        }
        L5: {
          this.field_u.b(this.u(-107), 7073);
          if (this.field_S == null) {
            break L5;
          } else {
            this.h(-106);
            break L5;
          }
        }
    }

    private final void h(int param0) {
        iq var2;
        int var3;
        int var4;
        fsa var5;
        db var6;
        csa var7;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_S != null) {
          L0: {
            this.field_S.a(10);
            var2 = this.field_S.c(0);
            if (param0 < -86) {
              break L0;
            } else {
              this.field_C = 71;
              break L0;
            }
          }
          L1: {
            if (this.o((byte) -82)) {
              var2.a(-128, (byte) -3, (this.field_w >> -107975504) + 128, -128, (this.field_v >> -149005168) - -128);
              break L1;
            } else {
              var3 = 192;
              var2.a(var3, (byte) -3, (this.field_w >> -1508353872) + -var3, var3, -var3 + (this.field_v >> 24375024));
              break L1;
            }
          }
          this.u(-12).a(25, this.field_S);
          this.field_D.a(this.field_S, -28255);
          this.field_s.a(this.field_S, (byte) -89, true, 7);
          this.field_c.a(this.field_S, (byte) 126, true, 7);
          this.field_f.a(this.field_S, (byte) -33, false, 6);
          var5 = (fsa) ((Object) this.field_i.f(-80));
          L2: while (true) {
            if (var5 == null) {
              var6 = (db) ((Object) this.field_d.f(-80));
              L3: while (true) {
                if (var6 == null) {
                  var7 = (csa) ((Object) this.field_z.f(-80));
                  L4: while (true) {
                    if (var7 == null) {
                      L5: {
                        dea.field_a.a(121, (la) (this));
                        this.field_B.a(this.field_S, 0);
                        if (null == this.field_G) {
                          break L5;
                        } else {
                          this.field_G.c((byte) 119);
                          break L5;
                        }
                      }
                      return;
                    } else {
                      var7.a(-1704, this.field_S);
                      var7 = (csa) ((Object) this.field_z.e(116));
                      continue L4;
                    }
                  }
                } else {
                  var6.a((byte) 48, this.field_S);
                  var6 = (db) ((Object) this.field_d.e(108));
                  continue L3;
                }
              }
            } else {
              var5.a(122, this.field_S);
              var5 = (fsa) ((Object) this.field_i.e(107));
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final void d(boolean param0) {
        System.out.println("Rooms ID: " + this.field_x);
        System.out.println("Projectiles: ");
        this.field_s.a(false);
        if (!param0) {
            gma var3 = (gma) null;
            this.a(2, (pc) null, (gma) null, (byte) 52);
        }
    }

    public final void a(int param0, iq param1) {
        try {
            if (param0 <= 103) {
                this.o((byte) 66);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "la.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(fsa param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0.n((byte) 113)) {
                param0.p(120);
                param0.B(-165);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 2) {
                break L2;
              } else {
                this.b(85);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("la.CA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final int a(byte param0) {
        if (param0 != 107) {
            gma var3 = (gma) null;
            this.a(33, (gma) null);
        }
        return this.field_r;
    }

    private final void a(db param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.b(-1, param0.a((byte) 55), param0.c(-101), param0.e(9648), -124, param0.d(param1 ^ -26754), 0);
              param0.p(112);
              this.field_u.a((ffa) (param0), (byte) 118);
              if (param1 == -26755) {
                break L1;
              } else {
                this.field_z = (vna) null;
                break L1;
              }
            }
            L2: {
              if (null != this.field_S) {
                param0.a(this.field_S, (byte) 105);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("la.F(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    public final void f(int param0) {
        fsa[] discarded$0 = null;
        if (param0 != -4366) {
            discarded$0 = this.a(54, 60, 37, -15, -117);
        }
    }

    final void c(int param0, int param1) {
        this.field_b[param1] = -1;
        if (param0 != -22490) {
            this.i((byte) -124);
        }
    }

    public final int c(byte param0) {
        if (param0 < 91) {
            return 63;
        }
        return this.field_w / 2;
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
            this.a(121, 21, 23, -88, -121, true);
            return 0;
        }
        return 0;
    }

    private final fsa[] a(int param0, int param1, int param2, int param3, int param4) {
        ub var6;
        ffa[] var7;
        int var8_int;
        int var10;
        fsa[] var8;
        fsa var9;
        var10 = TombRacer.field_G ? 1 : 0;
        if (param2 > 27) {
          var6 = new ub();
          var7 = this.field_u.b(param1, -1, param4, param0, param3);
          var8_int = 0;
          L0: while (true) {
            if (var7.length <= var8_int) {
              var8 = new fsa[var6.a(-1)];
              var6.a(var8, false);
              return var8;
            } else {
              if (var7[var8_int] instanceof fsa) {
                var9 = (fsa) ((Object) var7[var8_int]);
                if (var9.a((byte) 110, param1, param4, param3, param0)) {
                  var6.a((byte) -37, var9);
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
          return (fsa[]) null;
        }
    }

    final fsa[] n(int param0) {
        if (param0 != 16) {
            return (fsa[]) null;
        }
        return this.a(this.field_v, this.field_w / 2, 59, this.field_w, this.field_v / 2);
    }

    public static void p(int param0) {
        field_m = null;
        field_j = null;
        field_R = null;
        field_k = null;
        if (param0 != -128) {
            la.l(-58);
        }
        field_p = (nh[][]) null;
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, byte param6) {
        int var8 = -28 % ((param6 - 20) / 33);
        return this.field_B.b(param3, param2, param4, 8597, param0, param1, param5);
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        if (this.field_G == null) {
            return;
        }
        if (param4 != 6) {
            this.field_B = (tqa) null;
        }
        this.field_G.a(param4 ^ -112, new fm(param2, param1, param0, param3));
    }

    final int o(int param0) {
        if (param0 != 8) {
            this.a(true, 88, 35);
        }
        return this.field_C;
    }

    final void a(int param0, boolean param1) {
        if (param1) {
            this.a(false, -109, -42, 112, -101, -128);
        }
        this.field_N = param0;
    }

    final boolean h(byte param0) {
        if (param0 != -77) {
            this.c(-56, 76);
        }
        return this.field_T;
    }

    final void g(int param0) {
        this.a(false, (byte) 123);
        this.field_B = null;
        if (param0 <= 43) {
            this.a(-72, -34, 70, 80, true, 64, (byte) -83);
        }
        this.field_f = null;
        this.field_c = null;
        this.field_F = null;
        this.field_s = null;
        this.field_u = null;
    }

    final int i(int param0) {
        if (param0 != 6029) {
            return -14;
        }
        return null == this.field_U ? -1 : this.field_U.a(false);
    }

    final void a(byte param0, int param1) {
        if (param0 <= 14) {
            this.field_o = (ffa) null;
        }
        this.field_I = param1;
    }

    final boolean o(byte param0) {
        if (param0 != -82) {
            return true;
        }
        return this.field_U != null ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 < 118) {
            kua var9 = (kua) null;
            this.a(-24, (kua) null);
        }
        this.field_B.a(param1, param5, param4, param2, param0, param3, true);
    }

    private final void t(int param0) {
        uw var2;
        kh var3;
        int var4;
        int var5;
        int var6;
        int var7;
        fsa var7_ref_fsa;
        csa var8;
        int var9;
        fsa var10;
        csa var11;
        db var12;
        kh var13;
        var9 = TombRacer.field_G ? 1 : 0;
        this.a(true, (byte) 123);
        if (null == this.field_K) {
          return;
        } else {
          L0: {
            var2 = this.field_S;
            this.field_S = null;
            this.field_y.a((byte) -69);
            bca.b((byte) 55);
            var3 = this.field_K;
            var3.field_h = 0;
            var3.h((byte) -64);
            this.field_E = var3.b((byte) 44, 8);
            this.field_P = new fq(this.field_E, var3);
            if (19 >= this.field_E) {
              this.field_v = var3.b((byte) 44, 12) << 980690448;
              this.field_w = var3.b((byte) 44, 12) << 1339267024;
              break L0;
            } else {
              if (20 != this.field_E) {
                this.field_v = 2097152 * var3.b((byte) 44, 6);
                this.field_w = var3.b((byte) 44, 6) * 2097152;
                break L0;
              } else {
                this.field_v = 2097152 * var3.b((byte) 44, 8);
                this.field_w = var3.b((byte) 44, 8) * 2097152;
                break L0;
              }
            }
          }
          L1: {
            this.field_B.a(2097152, (la) (this), 4);
            if (11 > this.field_E) {
              this.k(109);
              break L1;
            } else {
              this.field_Q = var3.b((byte) 44, 12) << -888478256;
              this.field_L = var3.b((byte) 44, 12) << -1544830896;
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
                    this.field_B.a((byte) 25, var3, (la) (this));
                    if ((this.field_E ^ -1) > -12) {
                      break L4;
                    } else {
                      var6 = var3.b((byte) 44, 8);
                      var7 = 0;
                      L5: while (true) {
                        if (var6 <= var7) {
                          break L4;
                        } else {
                          var8 = vha.field_c.a(var3, 55, (la) (this));
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
                    if (-13 != (this.field_E ^ -1)) {
                      if (this.field_E < 13) {
                        break L6;
                      } else {
                        if (26 > this.field_E) {
                          var6 = 0;
                          L7: while (true) {
                            if ((var6 ^ -1) <= -4) {
                              break L6;
                            } else {
                              var3.b((byte) 44, 8);
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
                          var3.b((byte) 44, 10);
                          var6++;
                          continue L8;
                        }
                      }
                    }
                  }
                  L9: {
                    if (16 <= this.field_E) {
                      this.field_A = var3.b((byte) 44, 2);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (this.field_E < 19) {
                      break L10;
                    } else {
                      this.field_J = var3.b((byte) 44, 3);
                      break L10;
                    }
                  }
                  var3.i((byte) 98);
                  this.m(param0 ^ 1);
                  var10 = (fsa) ((Object) this.field_i.f(-80));
                  L11: while (true) {
                    if (var10 == null) {
                      var11 = (csa) ((Object) this.field_z.f(-80));
                      L12: while (true) {
                        if (var11 == null) {
                          L13: {
                            var3.field_h = 0;
                            if ((this.field_E ^ -1) != -27) {
                              L14: {
                                if (-20 > (this.field_E ^ -1)) {
                                  break L14;
                                } else {
                                  this.b(1, param0 + -28);
                                  break L14;
                                }
                              }
                              this.field_E = 26;
                              var13 = new kh(30000);
                              this.a(var13, -28426);
                              this.field_K = var13;
                              var13.field_h = 0;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L15: {
                            if (var2 != null) {
                              this.field_S = var2;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (!this.field_T) {
                              break L16;
                            } else {
                              this.b(param0 ^ 15, false);
                              break L16;
                            }
                          }
                          return;
                        } else {
                          var11.c(true);
                          var11 = (csa) ((Object) this.field_z.e(124));
                          continue L12;
                        }
                      }
                    } else {
                      var10.h(true);
                      var10.u(0);
                      var10 = (fsa) ((Object) this.field_i.e(115));
                      continue L11;
                    }
                  }
                } else {
                  var7_ref_fsa = new fsa((la) (this), var3, false);
                  this.a(var7_ref_fsa, (byte) 32);
                  var7_ref_fsa.D((byte) 118);
                  var6++;
                  continue L3;
                }
              }
            } else {
              var12 = new db((la) (this), var3);
              this.a(var12, true);
              var5++;
              continue L2;
            }
          }
        }
    }

    final boolean a(int param0, gma param1, int param2, pc param3, gma param4, up param5) {
        int discarded$3 = 0;
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param3.field_h = null;
              var7_int = 0;
              if (!this.a(param0, param3, param4, (byte) -127)) {
                break L1;
              } else {
                var7_int = 1;
                break L1;
              }
            }
            L2: {
              discarded$3 = this.a(true, param3, param5);
              if (param2 < -38) {
                break L2;
              } else {
                this.a(99, -62, -70, -43, true, -109, (byte) -77);
                break L2;
              }
            }
            stackIn_5_0 = var7_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("la.NA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param5 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_18_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final boolean a(ffa param0, int param1, int param2, int param3, int param4, int param5, boolean param6, gma param7, int param8) {
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ffa[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        ffa var12 = null;
        int var13 = 0;
        ffa[] var14 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param3 != 0) {
              L1: {
                var14 = this.field_u.b(param4, -1, param5, param8, param1);
                var10 = var14;
                if (param2 == 2) {
                  break L1;
                } else {
                  la.p(-15);
                  break L1;
                }
              }
              var11 = 0;
              L2: while (true) {
                if (var14.length <= var11) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    var12 = var14[var11];
                    if (param0 == var12) {
                      break L3;
                    } else {
                      if (var12.a(param1, param7, 85, param8, param4, param0, param5, param3)) {
                        L4: {
                          if (param7 == null) {
                            break L4;
                          } else {
                            if (!param6) {
                              break L4;
                            } else {
                              if (var12.a(param7.a((byte) 55), param7, 107, param7.c(-48), param7.k(-21185), param0, param7.i(103), param3)) {
                                break L3;
                              } else {
                                return true;
                              }
                            }
                          }
                        }
                        stackIn_16_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var11++;
                  continue L2;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var10_ref);

            stackIn_22_1 = new StringBuilder().append("la.BB(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    private final void a(db param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_d.b((byte) -74, param0);
              this.field_u.b(param0, 7073);
              if (null != this.field_S) {
                param0.a((byte) 85, this.field_S);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.a(0, -1, param0.d(3), param0.e(9648), param0.c(-69), param0.a((byte) 55), 126);
              if (param1) {
                break L2;
              } else {
                this.a(30, 106, -59, -125, (byte) -34);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("la.TC(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final int l(byte param0) {
        int var2 = 82 % ((81 - param0) / 35);
        return this.field_J;
    }

    final void a(la param0, byte param1) {
        if (param1 <= 108) {
            return;
        }
        try {
            this.field_D.a(23436, param0.field_l);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "la.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(csa param0, int param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_z.b((byte) -88, param0);
              if (null == this.field_S) {
                break L1;
              } else {
                param0.a(param1 + -33556136, this.field_S);
                break L1;
              }
            }
            L2: {
              if (param1 == 33554432) {
                break L2;
              } else {
                this.n((byte) -3);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("la.OA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final int q(byte param0) {
        if (param0 != -82) {
            return -41;
        }
        return this.field_x;
    }

    final void r(int param0) {
        int var2 = 112 / ((93 - param0) / 32);
        this.a((byte) -125, false);
    }

    final int a(int param0, gma param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.e((byte) 46);
                break L1;
              }
            }
            L2: {
              var3_int = param1.d(param0 ^ 3);
              var4 = param1.e(9648);
              var5 = param1.c(param0 ^ -38);
              var6 = param1.a((byte) 55);
              var7 = this.field_u.b(var4, param0 + -1, var3_int, var5, var6);
              var8 = this.a(var4, 32238, param1, var3_int, var7, var5, var6);
              var9 = this.field_o;
              if (var8 == 0) {
                break L2;
              } else {
                var10 = var7;
                var11 = 0;
                L3: while (true) {
                  if (var11 >= var10.length) {
                    break L2;
                  } else {
                    L4: {
                      var12 = var10[var11];
                      if (var12 instanceof fsa) {
                        ((fsa) ((Object) var12)).a(26689, param1, var9, var8);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var11++;
                    continue L3;
                  }
                }
              }
            }
            stackIn_11_0 = var8;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("la.RB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    final void c(boolean param0) {
        if (null == this.field_S) {
            return;
        }
        if (param0) {
            this.field_Q = 15;
        }
        this.field_S.c(0);
        this.field_S.b(1909106792);
        this.field_S.e(30057);
    }

    final boolean b(int param0, byte param1) {
        if (param1 != -44) {
            fsa var4 = (fsa) null;
            this.a((fsa) null, 48);
        }
        return (this.field_b[param0] ^ -1) != 0 ? true : false;
    }

    final boolean g(byte param0) {
        hca var2;
        int var3;
        int stackIn_4_0 = 0;
        L0: {
          L1: {
            var3 = 23 / ((param0 - 24) / 33);
            var2 = this.u(-86);
            if (this != var2.f((byte) 64)) {
              break L1;
            } else {
              if (-12582913 > (var2.e(9648) ^ -1)) {
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = 0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final int a(int param0, int param1, up param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        ffa[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              var7_int = 0;
              var8 = this.field_u.b(param1, -1, param5, param4, param3);
              var9 = 96 / ((82 - param0) / 41);
              var10 = 0;
              L1: while (true) {
                if (var10 >= var8.length) {
                  stackIn_8_0 = var7_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7_int = var7_int + var8[var10].a(param2, param4, param5, 0, param1, param3);
                  var10++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var7);

            stackIn_11_1 = new StringBuilder().append("la.QC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final dt a(int param0) {
        if (param0 != -1553494544) {
            field_k = (kia) null;
        }
        return this.field_h;
    }

    final void d(int param0, int param1) {
        db var4;
        fsa var5_ref_fsa;
        int var5;
        int var6;
        fsa var7;
        hca var8;
        uja var9;
        var6 = TombRacer.field_G ? 1 : 0;
        var8 = this.u(-62);
        if (var8 == null) {
          return;
        } else {
          var8.d(5, param0);
          if (this != var8.f((byte) -83)) {
            return;
          } else {
            if (this.a(param1 + -1553494544).k(-19271)) {
              this.field_a = 6029;
              this.field_a = var8.e(this.field_a, -40);
              var4 = (db) ((Object) this.field_d.f(param1 + -80));
              L0: while (true) {
                if (var4 == null) {
                  var9 = new uja(this.field_i);
                  var5_ref_fsa = (fsa) ((Object) var9.a(true));
                  L1: while (true) {
                    if (var5_ref_fsa == null) {
                      L2: {
                        this.field_g.c(true);
                        var5 = this.a(-1553494544).g(param1 + 112) ? 1 : 0;
                        if (param1 == 0) {
                          break L2;
                        } else {
                          var7 = (fsa) null;
                          this.a((fsa) null, -31);
                          break L2;
                        }
                      }
                      L3: {
                        this.field_s.a(var5 != 0, (byte) -126);
                        this.field_f.a(var5 != 0, (byte) -31);
                        this.field_c.a(var5 != 0, (byte) -103);
                        this.field_a = this.field_s.a(this.field_a, -119);
                        if (this.field_S == null) {
                          break L3;
                        } else {
                          this.field_S.d(0);
                          if (this.field_h.f(8, param1 + 10915)) {
                            this.field_S.c(0).a(uca.field_c.a(9, 0) + -4, 0, -4 + uca.field_c.a(9, 0), 26768);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (null == this.field_G) {
                          break L4;
                        } else {
                          this.field_G.a(param1 + 82, false);
                          break L4;
                        }
                      }
                      this.field_I = this.field_I + 1;
                      this.field_r = this.field_r + 1;
                      return;
                    } else {
                      L5: {
                        var5_ref_fsa.b(param1 + 106, false);
                        this.field_a = var5_ref_fsa.i(this.field_a, -109);
                        if (!var5_ref_fsa.h(param1 + 18407)) {
                          break L5;
                        } else {
                          var5_ref_fsa.p(param1 ^ 79);
                          break L5;
                        }
                      }
                      var5_ref_fsa = (fsa) ((Object) var9.a(-1));
                      continue L1;
                    }
                  }
                } else {
                  var4.s(param1 ^ 0);
                  var4 = (db) ((Object) this.field_d.e(120));
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
        return "Room(courseIndex:" + this.field_N + ",id:" + this.field_x + ",diff:" + 1 + ")";
    }

    final int n(byte param0) {
        if (param0 > -36) {
            return 42;
        }
        return this.field_e;
    }

    final hca u(int param0) {
        if (param0 >= 0) {
            this.field_A = -11;
        }
        return this.a(-1553494544).field_g;
    }

    final int m(byte param0) {
        if (param0 != -86) {
            this.a(-23, -87, 7, -112, true, -64, (byte) -10);
        }
        return this.field_v;
    }

    final void b(boolean param0, int param1, int param2) {
        this.field_b[param2] = param1;
        if (param0) {
            this.field_g = (ts) null;
        }
    }

    private final void b(int param0, int param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        int var3 = param0 * 2097152;
        if (!(var3 != 0)) {
            return;
        }
        this.field_Q = this.field_Q + var3;
        this.field_w = this.field_w + var3 * 2;
        this.field_v = this.field_v + 2 * var3;
        this.field_L = this.field_L + var3;
        this.field_B.b(2097152, 2, var3);
        if (param1 != -20) {
            this.field_b = (int[]) null;
        }
        fsa var6 = (fsa) ((Object) this.field_i.f(-80));
        while (var6 != null) {
            var6.o(var3, 81);
            var6 = (fsa) ((Object) this.field_i.e(115));
        }
        csa var7 = (csa) ((Object) this.field_z.f(param1 ^ 92));
        while (var7 != null) {
            var7.a(var3, true);
            var7 = (csa) ((Object) this.field_z.e(param1 ^ -104));
        }
        db var8 = (db) ((Object) this.field_d.f(-80));
        while (var8 != null) {
            var8.a(param1 + -105, var3);
            var8 = (db) ((Object) this.field_d.e(108));
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        pca var7 = this.field_B.a(param0, param3, (byte) 119);
        if (!(var7 != null)) {
            return;
        }
        if (param2 < 104) {
            field_p = (nh[][]) null;
        }
        if (var7.b(0) || -1 == (uca.field_c.a(5, 0) ^ -1)) {
            this.field_F.b(param0, param3, param5, param1, 0, param4);
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != 71) {
            return 111;
        }
        return -param0 - (-(this.field_v / 2) - this.field_v / 2);
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
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        ffa var11 = null;
        int var12 = 0;
        ffa[] var13 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var13 = this.field_u.b(param0, -1, param5, param1, param4);
            var8 = var13;
            var9 = 0;
            var10 = param2;
            L1: while (true) {
              if (var13.length <= var10) {
                stackIn_8_0 = var9;
                break L0;
              } else {
                L2: {
                  var11 = var13[var10];
                  if (param6 != var11) {
                    var9 = var9 + var11.a(true, param1, param0, param5, param3, param4);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var10++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8_ref);

            stackIn_11_1 = new StringBuilder().append("la.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    final int p(byte param0) {
        if (param0 < 14) {
            return -10;
        }
        return this.field_I;
    }

    private final void a(kh param0, int param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        db var5 = null;
        fsa var6 = null;
        csa var7 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.m(9);
              param0.i(8);
              param0.a((byte) -127, 26, 8);
              this.field_P.a(param0, 23);
              if (param1 == -28426) {
                break L1;
              } else {
                this.o((byte) 71);
                break L1;
              }
            }
            param0.a((byte) 59, this.field_v / 2097152, 6);
            param0.a((byte) -125, this.field_w / 2097152, 6);
            param0.a((byte) -126, this.field_Q >> -666845232, 12);
            param0.a((byte) -128, this.field_L >> 1822363824, 12);
            param0.a((byte) -125, this.field_d.a((byte) -16), 8);
            var5 = (db) ((Object) this.field_d.f(-80));
            L2: while (true) {
              if (var5 == null) {
                param0.a((byte) 119, this.field_i.a((byte) -16), 8);
                var6 = (fsa) ((Object) this.field_i.f(-80));
                L3: while (true) {
                  if (var6 == null) {
                    this.field_B.a(8, param0);
                    param0.a((byte) 120, this.field_z.a((byte) -16), 8);
                    var7 = (csa) ((Object) this.field_z.f(-80));
                    L4: while (true) {
                      if (var7 == null) {
                        param0.a((byte) 102, this.field_A, 2);
                        param0.a((byte) 127, this.field_J, 3);
                        param0.k(-1826190686);
                        break L0;
                      } else {
                        vha.field_c.a(var7, -16097, param0);
                        var7 = (csa) ((Object) this.field_z.e(107));
                        continue L4;
                      }
                    }
                  } else {
                    L5: {
                      if (!var6.w((byte) -117)) {
                        var6.a(param0, -100);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var6 = (fsa) ((Object) this.field_i.e(114));
                    continue L3;
                  }
                }
              } else {
                var5.a(true, param0);
                var5 = (db) ((Object) this.field_d.e(113));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("la.PC(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            return true;
        }
        return false;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        pca var7 = this.field_B.a(param4, param1, (byte) 119);
        if (!(var7 != null)) {
            return;
        }
        if (var7.b(0)) {
            if (!(0 != uca.field_c.a(5, 0))) {
                this.field_F.b(param4, param1, param3, param2, 0, param5);
            }
        }
        if (param0) {
            this.a(55, 54, (byte) -12, -30);
        }
    }

    final ui d(int param0) {
        if (param0 != -31957) {
            this.b(true, -14, -108);
        }
        return this.field_q;
    }

    final ui e(int param0) {
        int var2 = 49 % ((param0 - 42) / 59);
        return this.field_y;
    }

    final int a(ep param0, int param1, up param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ffa[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -16164) {
                break L1;
              } else {
                this.field_E = 42;
                break L1;
              }
            }
            if (param2 != null) {
              var4_int = 0;
              var5 = this.field_u.a((byte) -26, param0);
              var6 = 0;
              L2: while (true) {
                if (var6 >= var5.length) {
                  stackIn_10_0 = var4_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4_int = var4_int + var5[var6].a(param2, param0, -117);
                  var6++;
                  continue L2;
                }
              }
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("la.J(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_10_0;
        }
    }

    final int a(ffa param0, gma param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        ffa stackIn_58_0 = null;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        int var15 = 0;
        int var16 = 0;
        ffa[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param8 == 0) {
              L1: {
                if (!this.a(param0, param6, 2, param2, param10, param7, param12, param1, param3)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 2;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-1 == (param2 ^ -1)) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var14_int = 0;
                var15 = 0;
                var17 = this.field_u.b(param10, -1, param7, param3, param6);
                if (param5 == 12) {
                  var18 = 0;
                  L2: while (true) {
                    L3: {
                      if (var18 >= var17.length) {
                        break L3;
                      } else {
                        L4: {
                          var16 = 0;
                          if (var17[var18].a(param6, param1, 97, param3, param10, param0, param7, param2)) {
                            L5: {
                              var14_int = 1;
                              if (param1 == null) {
                                break L5;
                              } else {
                                if (!param12) {
                                  break L5;
                                } else {
                                  if (var17[var18].a(param1.a((byte) 55), param1, 81, param1.c(-48), param1.k(-21185), param0, param1.i(param5 + 115), param2)) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            var16 = 1;
                            if (!var17[var18].a((byte) -55, false)) {
                              var15 = 1;
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        L6: {
                          if (var16 == 0) {
                            var17[var18] = null;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var18++;
                        continue L2;
                      }
                    }
                    if (var15 != 0) {
                      stackIn_32_0 = 2;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var18 = 0;
                      L7: while (true) {
                        if (var18 >= var17.length) {
                          if (var15 == 0) {
                            L8: {
                              if (param8 == 2) {
                                var18 = 0;
                                L9: while (true) {
                                  if (var17.length <= var18) {
                                    break L8;
                                  } else {
                                    stackIn_58_0 = var17[var18];
                                    L10: {
                                      if (stackIn_58_0 == null) {
                                        break L10;
                                      } else {
                                        var17[var18].a(-117, param1);
                                        break L10;
                                      }
                                    }
                                    var18++;
                                    continue L9;
                                  }
                                }
                              } else {
                                break L8;
                              }
                            }
                            if (var14_int != 0) {
                              stackIn_65_0 = 1;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              stackIn_63_0 = 0;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            }
                          } else {
                            stackIn_52_0 = 2;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        } else {
                          if (var17[var18] != null) {
                            L11: {
                              var17[var18].a(77, false, param8, param4, param9, param11);
                              var16 = 1;
                              if (!var17[var18].a(param6, param1, param5 ^ 64, param3, param10, param0, param7, param2)) {
                                var16 = 0;
                                break L11;
                              } else {
                                if (var15 != 0) {
                                  break L11;
                                } else {
                                  if (2 == param8) {
                                    L12: {
                                      if (var17[var18].a(param1, 0)) {
                                        stackIn_44_0 = 0;
                                        break L12;
                                      } else {
                                        stackIn_44_0 = 1;
                                        break L12;
                                      }
                                    }
                                    var15 = stackIn_44_0;
                                    break L11;
                                  } else {
                                    var15 = 1;
                                    break L11;
                                  }
                                }
                              }
                            }
                            L13: {
                              if (var16 == 0) {
                                var17[var18] = null;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            var18++;
                            continue L7;
                          } else {
                            var18++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                } else {
                  stackIn_13_0 = -128;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var14 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var14);

            stackIn_68_1 = new StringBuilder().append("la.UB(");

            if (param0 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L14;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_71_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');

            if (param1 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L15;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L15;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_69_0), stackIn_72_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_32_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_52_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_63_0;
                  } else {
                    return stackIn_65_0;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, kua param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
            this.field_l.b((byte) -54, param1);
            while ((this.field_l.a((byte) -16) ^ -1) < -11) {
                this.field_l.c(-99);
            }
            if (param0 != 8) {
                this.field_b = (int[]) null;
            }
            this.field_M = this.field_M + 1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "la.VB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(byte param0) {
        int var2 = 81 / ((-23 - param0) / 53);
        return this.field_v / 2;
    }

    final int c(int param0) {
        int var2 = -6 % ((param0 - 1) / 54);
        return this.field_N;
    }

    final csa a(boolean param0, int param1, int param2) {
        uja var4;
        csa var5;
        csa var6;
        int var7;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param2 == 6) {
            break L0;
          } else {
            this.field_o = (ffa) null;
            break L0;
          }
        }
        var4 = new uja(this.field_z);
        var5 = (csa) ((Object) var4.a(true));
        L1: while (true) {
          if (var5 != null) {
            var6 = var5.a(param1, false, false);
            if (var6 == null) {
              var5 = (csa) ((Object) var4.a(-1));
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
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        this.field_E = 26;
        this.field_d = new vna();
        this.field_i = new vna();
        this.field_z = new vna();
        this.field_l = new vna();
        this.field_D = new te();
        this.field_y = new ui();
        this.field_q = new ui();
        this.field_b = new int[9];
        this.field_P = new fq();
        this.field_A = 0;
        this.field_J = 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (this.field_b.length <= var6_int) {
                L2: {
                  this.field_h = param0;
                  this.field_v = 33554432;
                  this.field_K = param2;
                  this.field_w = 33554432;
                  this.field_x = param1;
                  this.field_n = param3;
                  stackIn_6_0 = this;

                  if (!param4) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L2;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    break L2;
                  }
                }
                ((la) (this)).field_T = stackIn_7_1 != 0;
                this.field_g = new ts((la) (this));
                this.a(false, (byte) 113);
                break L0;
              } else {
                this.field_b[var6_int] = -1;
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("la.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}

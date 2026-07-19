/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class v extends b {
    private int field_T;
    static p field_Y;
    static int[] field_S;
    private int field_O;
    static int field_Z;
    private int field_U;
    private int field_Q;
    private int field_V;
    static int field_W;
    private int field_ab;
    static int[][][][] field_X;

    final static tc b(int param0, int param1, int param2, int param3) {
        tc var4 = new tc();
        var4.field_n = new int[param0];
        var4.field_j = param3;
        gf.field_q.a(var4, -104);
        ue.a(var4, param1 ^ 258, param2);
        if (param1 != 256) {
            v.b(-126, -115, -75, 79, 102);
        }
        return var4;
    }

    void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
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
        L0: {
          var16 = TorChallenge.field_F ? 1 : 0;
          qg.c(param2 - -6, 35 + param1, this.field_p + -12, -40 + this.field_l, 2105376, 0);
          if (param0 == 103) {
            break L0;
          } else {
            field_S = (int[]) null;
            break L0;
          }
        }
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        L1: while (true) {
          if (var4 <= var7) {
            var5 = 194;
            var6 = 169;
            var4 = 22;
            var7 = 0;
            var8 = param1 + 35;
            L2: while (true) {
              if (var4 <= var7) {
                rj.field_a.g(-90 + (this.field_p + param2), 10 + param1);
                ak.a(5 + param2, this.field_p + -10, param1 + 35, param0 ^ -30, fl.field_s);
                ak.a(param2, this.field_p, -22 + param1 - -this.field_l, param0 ^ -30, qa.field_e);
                var4 = this.field_l + -79;
                var6 = 127;
                var5 = 169;
                var7 = 0;
                var8 = param1 + 57;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var7 * (var6 + -var5) / var4 + var5;
                    var9 = var9 | (var9 << -1761294168 | var9 << 158220848);
                    qg.b(param2, var8, 6, var9);
                    qg.b(-6 + (param2 - -this.field_p), var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 + var7 * (var6 + -var5) / var4;
                var9 = var9 | (var9 << -1135360056 | var9 << 308550992);
                qg.b(param2, var8, 6, var9);
                qg.b(this.field_p + param2 + -6, var8, 6, var9);
                var7++;
                var8++;
                continue L2;
              }
            }
          } else {
            if (qg.field_k <= var8) {
              if (var8 < qg.field_l) {
                L4: {
                  var9 = var7 * (-var5 + var6) / var4 + var5;
                  var10 = 0;
                  var11 = this.field_p;
                  if (-21 > (var7 ^ -1)) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if (-21 > (var10 ^ -1)) {
                        break L4;
                      } else {
                        var12 = (20 + -var7) * (20 - var7) - -((20 + -var10) * (-var10 + 20));
                        if (462 >= var12) {
                          if ((var12 ^ -1) <= -421) {
                            var13 = (-var12 + 462) * var9 / 42;
                            var13 = var13 | (var13 << -319321872 | var13 << -881185496);
                            qg.field_i[var10 + var8 * qg.field_g - -param2] = var13;
                            var10++;
                            continue L5;
                          } else {
                            break L4;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (var7 > 20) {
                    break L6;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if ((var13 ^ -1) < -21) {
                          break L8;
                        } else {
                          var14 = var13 * var13 + (20 + -var7) * (-var7 + 20);
                          if (var14 > 462) {
                            break L8;
                          } else {
                            if (420 > var14) {
                              var12 = var11 + 1;
                              var13++;
                              var11++;
                              continue L7;
                            } else {
                              var15 = (-var14 + 462) * var9 / 42;
                              var15 = var15 | (var15 << -1769959704 | var15 << -423535984);
                              qg.field_i[var11 + (qg.field_g * var8 + param2)] = var15;
                              var13++;
                              var11++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  }
                }
                var9 = var9 | (var9 << 130826384 | var9 << 492473800);
                qg.b(param2 + var10, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L1;
              } else {
                var7++;
                var8++;
                continue L1;
              }
            } else {
              var7++;
              var8++;
              continue L1;
            }
          }
        }
    }

    final static boolean a(int param0, int param1) {
        if (!(param0 != 0)) {
            return true;
        }
        if (!(1 != param0)) {
            return true;
        }
        if (!(param1 != param0)) {
            return true;
        }
        if (!(-9 != (param0 ^ -1))) {
            return true;
        }
        if (15 == param0) {
            return true;
        }
        if (16 == param0) {
            return true;
        }
        return false;
    }

    final static void e(int param0, int param1, int param2) {
        ka[] discarded$1 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        lj var9 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        if ((jc.field_c ^ -1) <= -1) {
          L0: {
            var3 = param1 + -135;
            var4 = param0 - 35;
            var5 = 256;
            if (-76 < (jc.field_c ^ -1)) {
              var5 = (jc.field_c << 585010696) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-201 > (jc.field_c ^ -1)) {
              var5 = (-jc.field_c + 250 << -99122584) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            ad.a(123, bd.field_t);
            oc.c();
            qg.b();
            ef.a(3);
            if (256 > var5) {
              qg.a(0, 0, qg.field_g, qg.field_f, 0, -var5 + 256);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            ie.b((byte) -9);
            if (param2 >= 40) {
              break L3;
            } else {
              var9 = (lj) null;
              discarded$1 = v.a((String) null, 32, (String) null, (lj) null);
              break L3;
            }
          }
          L4: {
            if ((jc.field_c ^ -1) <= -151) {
              hf.field_a.d(var3 - -15, var4 - -10, var5);
              break L4;
            } else {
              bd.field_t.f(var3, var4);
              break L4;
            }
          }
          L5: {
            var6 = -125 + jc.field_c;
            if (var6 <= 0) {
              break L5;
            } else {
              if (-51 >= (var6 ^ -1)) {
                break L5;
              } else {
                if (-21 < (var6 ^ -1)) {
                  var7 = 256 * var6 / 20;
                  ul.field_k.b(var3, var4, var7);
                  break L5;
                } else {
                  if (var6 >= 30) {
                    var7 = (12800 + -(var6 * 256)) / 20;
                    ul.field_k.b(var3, var4, var7);
                    break L5;
                  } else {
                    ul.field_k.b(var3, var4, 256);
                    break L5;
                  }
                }
              }
            }
          }
          L6: {
            var6 = -140 + jc.field_c;
            if (0 < var6) {
              L7: {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              td.field_o.d(15 + var3, var4 + 10, var5 * var7 >> -66224408);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, byte param1, boolean param2, String param3) {
        fg.i(126);
        t.field_b.i(param1 + 8389929);
        if (param1 != -24) {
            return;
        }
        try {
            kb.field_O = new fg(lg.field_b, (String) null, eb.field_m, param2, param0);
            bg.field_K = new jf(t.field_b, kb.field_O);
            t.field_b.a((byte) 88, (ee) (bg.field_K));
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "v.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean f(byte param0) {
        if (param0 != -105) {
            field_Z = 65;
        }
        return lc.a(param0 ^ -106);
    }

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        java.awt.Frame discarded$1 = null;
        if (this.field_Q <= 0) {
        } else {
            var2 = this.field_ab;
            var3 = this.field_V;
            fieldTemp$0 = this.field_T + 1;
            this.field_T = this.field_T + 1;
            if (this.field_Q <= fieldTemp$0) {
                this.field_Q = 0;
                this.k(0);
            } else {
                var4 = this.field_T * (-this.field_T + 2 * this.field_Q);
                var5 = this.field_Q * this.field_Q;
                var2 = this.field_U + var4 * (-this.field_U + this.field_ab) / var5;
                var3 = this.field_O - -((-this.field_O + this.field_V) * var4 / var5);
            }
            this.b(0, var3, var2);
        }
        if (param0 != 1) {
            uj var6 = (uj) null;
            discarded$1 = v.a(-22, -2, 27, 60, (uj) null, 20);
        }
        return super.j(1);
    }

    final static ka[] a(int param0, int param1, int param2, int param3) {
        if (param1 < 66) {
            return (ka[]) null;
        }
        return ma.a(param0, param3, 1, param2, true);
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (!(param1 > 0)) {
            this.b(0, param0, param2);
            return;
        }
        if (param3) {
            return;
        }
        this.field_Q = param1;
        this.field_V = param0;
        this.field_O = this.field_l;
        this.field_T = 0;
        this.field_U = this.field_p;
        this.field_ab = param2;
    }

    boolean h(int param0) {
        if (param0 <= 83) {
            v.b(-11, -50, 45, -103, 85);
        }
        this.d(true);
        return super.h(88);
    }

    v(si param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_T = 0;
        this.field_Q = 0;
    }

    final static ka[] a(String param0, int param1, String param2, lj param3) {
        ka[] var4 = null;
        RuntimeException var4_ref = null;
        ka[] var5 = null;
        ka[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 25) {
                break L1;
              } else {
                v.e(-94, -6, -17);
                break L1;
              }
            }
            var5 = lk.a(-128, param0, param2, param3);
            var4 = var5;
            var5[3].field_v = var5[3].field_x;
            var5[1].field_q = var5[1].field_u;
            var5[7].field_q = var5[7].field_u;
            var5[5].field_v = var5[5].field_x;
            stackOut_2_0 = (ka[]) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("v.IA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_X = (int[][][][]) null;
        field_S = null;
        field_Y = null;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              qg.b(param0, param3, param2 - -1, 10000536);
              qg.b(param0, param4 + param3, param2 + 1, param1);
              var5_int = 1;
              var6 = param4;
              if (qg.field_k <= param3 - -var5_int) {
                break L1;
              } else {
                var5_int = -param3 + qg.field_k;
                break L1;
              }
            }
            L2: {
              if (qg.field_l >= param3 + var6) {
                break L2;
              } else {
                var6 = qg.field_l + -param3;
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var7 >= var6) {
                break L0;
              } else {
                var8 = 152 + var7 * 48 / param4;
                var9 = var8 << -1379643128 | var8 << -168314160 | var8;
                qg.field_i[param0 + qg.field_g * (var7 + param3)] = var9;
                qg.field_i[param2 + qg.field_g * (param3 + var7) + param0] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var5), "v.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, jk param1, int param2, lj param3) {
        ka[] discarded$0 = null;
        try {
            vk.field_h = param2 * ol.b(-128) / 1000;
            ug.a(0, param3);
            wl.a(-2681, param3);
            u.a(true, param3);
            dg.k(-50);
            td.b((byte) 112);
            if (param0 != 127) {
                discarded$0 = v.a(30, -88, 66, -60);
            }
            jc.field_c = 0 + -vk.field_h;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "v.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    void d(boolean param0) {
        if (this.field_Q <= 0) {
            return;
        }
        if (!param0) {
            return;
        }
        this.b(0, this.field_V, this.field_ab);
        this.field_Q = 0;
        this.k(0);
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, uj param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        ja[] var7 = null;
        int var8_int = 0;
        java.awt.Frame var8 = null;
        int var9 = 0;
        int var10 = 0;
        ja[] var11 = null;
        mi var12 = null;
        Object stackIn_7_0 = null;
        Object stackIn_34_0 = null;
        java.awt.Frame stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        java.awt.Frame stackOut_35_0 = null;
        Object stackOut_33_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var6_int = -121 % ((param3 - 0) / 40);
            if (param4.a((byte) -96)) {
              L1: {
                if (param2 != 0) {
                  break L1;
                } else {
                  var11 = uc.a(-76, param4);
                  var7 = var11;
                  if (var7 != null) {
                    var8_int = 0;
                    var9 = 0;
                    L2: while (true) {
                      if (var9 >= var11.length) {
                        if (var8_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        if (param5 == var11[var9].field_h) {
                          L3: {
                            if (param0 == var11[var9].field_d) {
                              L4: {
                                if (0 == param1) {
                                  break L4;
                                } else {
                                  if (param1 == var11[var9].field_c) {
                                    break L4;
                                  } else {
                                    var9++;
                                    continue L2;
                                  }
                                }
                              }
                              L5: {
                                if (var8_int == 0) {
                                  break L5;
                                } else {
                                  if (var11[var9].field_i > param2) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              param2 = var11[var9].field_i;
                              var8_int = 1;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var9++;
                          continue L2;
                        } else {
                          var9++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              var12 = param4.a(param5, param0, param2, param1, -2);
              L6: while (true) {
                if (var12.field_d != 0) {
                  var8 = (java.awt.Frame) (var12.field_g);
                  if (var8 != null) {
                    if (var12.field_d != 2) {
                      stackOut_35_0 = (java.awt.Frame) (var8);
                      stackIn_36_0 = stackOut_35_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      lg.a(param4, (byte) 103, var8);
                      stackOut_33_0 = null;
                      stackIn_34_0 = stackOut_33_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  c.a(127, 10L);
                  continue L6;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var6);
            stackOut_37_1 = new StringBuilder().append("v.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param4 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L7;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L7;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_34_0);
          } else {
            return stackIn_36_0;
          }
        }
    }

    final static int d(int param0, int param1, int param2) {
        int var3 = param1 >> -1675109217 & -1 + param2;
        if (param0 >= -70) {
            return -85;
        }
        return ((param1 >>> 370028415) + param1) % param2 - -var3;
    }

    void k(int param0) {
        if (param0 != 0) {
            field_Y = (p) null;
        }
    }

    static {
        field_S = new int[]{32, 31, 31};
        field_W = 4;
        field_Y = new p();
        field_X = new int[][][][]{new int[][][]{new int[][]{new int[]{25, 50}}, new int[][]{new int[]{25, 50}, new int[]{175, 200}}, new int[][]{new int[]{25, 50}, new int[]{150, 175}}, new int[][]{new int[]{25, 50}, new int[]{150, 175}, new int[]{275, 300}}, new int[][]{new int[]{25, 50}}}, new int[][][]{new int[][]{new int[]{250, 275}}, new int[][]{new int[]{150, 175}, new int[]{250, 275}}, new int[][]{new int[]{125, 150}, new int[]{250, 275}}, new int[][]{new int[]{125, 150}, new int[]{250, 275}, new int[]{375, 400}}, new int[][]{new int[]{250, 275}}}};
    }
}

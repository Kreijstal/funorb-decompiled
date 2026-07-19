/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cl extends ee {
    private int field_T;
    private int field_V;
    static rf field_S;
    private boolean field_U;
    private int field_R;
    static hl field_W;
    private boolean field_Q;

    cl(hn param0, rd param1) {
        this(param0, param1, 0, param1.field_Rb);
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
            var3_int = 0;
            var4 = 0;
            var5 = 0;
            for (var6 = 0; -19 < (var6 ^ -1); var6++) {
                if (bk.field_h[var6] >= var5) {
                    if (param0.field_J.a(-5, var6)) {
                        if (bk.field_h[var6] > var5) {
                            var4 = 0;
                            var5 = bk.field_h[var6];
                        }
                        var4++;
                        if ((double)var4 * Math.random() < 1.0) {
                            var3_int = var6;
                        }
                    }
                }
            }
            this.field_T = var3_int;
            param0.field_J.b(var3_int, 93);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "cl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        double var7_double = 0.0;
        if (param2 > -5) {
            return;
        }
        try {
            var7_double = this.field_C;
            this.field_C = this.field_C * uh.field_e[this.field_T];
            if ((1 << this.field_T & 50087) == 0) {
                this.a(m.field_i[this.field_T], true, param1, param3);
            } else {
                this.a(-124, m.field_i[this.field_T], param1, param3);
            }
            this.field_C = var7_double;
            this.a(123, pm.field_w[(31 & this.field_V) >> 1135526145], param1, param3);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "cl.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static int h(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            kg var2 = null;
            int stackIn_17_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_35_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_16_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_34_0 = 0;
            if (param0 < -51) {
              if (om.field_s.field_a >= 4) {
                if (-1 != om.field_s.field_e) {
                  if (om.field_s.field_e == -2) {
                    return 4;
                  } else {
                    return 1;
                  }
                } else {
                  return 3;
                }
              } else {
                try {
                  L0: {
                    L1: {
                      if (0 == we.field_k) {
                        ol.field_a = ek.field_p.a(fa.field_P, -96, eb.field_n);
                        we.field_k = we.field_k + 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if ((we.field_k ^ -1) == -2) {
                        if ((ol.field_a.field_g ^ -1) == -3) {
                          stackOut_16_0 = sf.a(-1, (byte) -121);
                          stackIn_17_0 = stackOut_16_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          if (-2 != (ol.field_a.field_g ^ -1)) {
                            break L2;
                          } else {
                            we.field_k = we.field_k + 1;
                            break L2;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (2 == we.field_k) {
                        gk.field_u = new vd((java.net.Socket) (ol.field_a.field_f), ek.field_p);
                        var2 = new kg(13);
                        ql.a(hj.field_k, var2, hc.field_n, (byte) 40, wi.field_c);
                        var2.f(93, 15);
                        var2.d(-103, pi.field_L);
                        gk.field_u.a(13, false, var2.field_m, 0);
                        we.field_k = we.field_k + 1;
                        fl.field_a = ri.a(-3) + 30000L;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (we.field_k != 3) {
                        break L4;
                      } else {
                        if (-1 <= (gk.field_u.c((byte) -109) ^ -1)) {
                          if (fl.field_a >= ri.a(-3)) {
                            break L4;
                          } else {
                            stackOut_30_0 = sf.a(-2, (byte) -80);
                            stackIn_31_0 = stackOut_30_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          var1_int = gk.field_u.a((byte) -5);
                          if (0 == var1_int) {
                            we.field_k = we.field_k + 1;
                            break L4;
                          } else {
                            stackOut_26_0 = sf.a(var1_int, (byte) -67);
                            stackIn_27_0 = stackOut_26_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                    if (we.field_k == 4) {
                      om.field_s.a(Confined.field_L, gk.field_u, (byte) -65);
                      gk.field_u = null;
                      ol.field_a = null;
                      we.field_k = 0;
                      stackOut_34_0 = 0;
                      stackIn_35_0 = stackOut_34_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      return -1;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var1 = (IOException) (Object) decompiledCaughtException;
                  return sf.a(-3, (byte) -123);
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_27_0;
                  } else {
                    if (decompiledRegionSelector0 == 2) {
                      return stackIn_31_0;
                    } else {
                      return stackIn_35_0;
                    }
                  }
                }
              }
            } else {
              return -101;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, int param1) {
        if (!(this.field_R != 0)) {
            kc.a(param0, (pm) (this), 127, false);
        }
        if (param1 > -66) {
            return;
        }
        try {
            this.field_R = 2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "cl.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean f(int param0) {
        if (param0 >= -54) {
            this.field_T = 108;
            return false;
        }
        return false;
    }

    final void a(int param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        L0: {
          var13 = Confined.field_J ? 1 : 0;
          this.field_G = this.field_G * 0.97;
          this.field_V = this.field_V + 1;
          if (this.field_R <= 0) {
            break L0;
          } else {
            this.field_R = this.field_R - 1;
            break L0;
          }
        }
        this.field_K = this.field_K * 0.97;
        this.field_L = this.field_L * 0.995;
        this.field_A.field_x.b(3, param1, this.field_D);
        this.field_E = this.field_E - this.field_A.field_x.field_B;
        this.field_t = this.field_t - this.field_A.field_x.field_G;
        super.a(param0, param1);
        L1: while (true) {
          L2: {
            if (-1 <= (param1 ^ -1)) {
              break L2;
            } else {
              if (this.field_A.field_x.field_r[param1] <= this.field_D) {
                break L2;
              } else {
                param1--;
                continue L1;
              }
            }
          }
          L3: while (true) {
            L4: {
              if (param1 >= this.field_A.field_x.field_a - 2) {
                break L4;
              } else {
                if (this.field_D < this.field_A.field_x.field_r[param1 + 1]) {
                  break L4;
                } else {
                  param1++;
                  continue L3;
                }
              }
            }
            L5: {
              this.field_A.field_x.b(3, param1, this.field_D);
              if (0.0 > this.field_D) {
                this.field_z = true;
                this.field_s = 2;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              this.field_t = this.field_t + this.field_A.field_x.field_G;
              this.field_E = this.field_E + this.field_A.field_x.field_B;
              if (-1 <= (this.field_A.field_B.field_R ^ -1)) {
                break L6;
              } else {
                if (this.field_R != 0) {
                  break L6;
                } else {
                  if (!this.a(this.field_A.field_B, -1326)) {
                    break L6;
                  } else {
                    L7: {
                      var3 = -this.field_E + this.field_A.field_B.field_E;
                      var5 = this.field_A.field_B.field_t - this.field_t;
                      var7 = this.field_A.field_B.field_D - this.field_D;
                      var9 = Math.sqrt(var7 * var7 + (var5 * var5 + var3 * var3));
                      if (1.0 <= var9) {
                        break L7;
                      } else {
                        var9 = 1.0;
                        break L7;
                      }
                    }
                    var11 = 0.01 / var9;
                    this.a((ee) (this.field_A.field_B), 12);
                    this.a(false, var11, param0 ^ 17081);
                    break L6;
                  }
                }
              }
            }
            return;
          }
        }
    }

    public static void c(boolean param0) {
        field_S = null;
        field_W = null;
        if (param0) {
            field_W = (hl) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        ci.field_a[mc.field_c] = param2;
        sj.field_rb[mc.field_c] = mc.field_c;
        an.field_n[mc.field_c] = param3;
        if (cg.field_f > param3) {
            mi.field_f = param3;
        }
        if (param3 > hj.field_j) {
            ka.field_P = param3;
        }
        am.field_I[mc.field_c] = param1;
        em.field_b[mc.field_c] = param0;
        oc.field_m[mc.field_c] = param5;
        int var6 = param0 + (param1 - -param5);
        int var7 = 0 != var6 ? 1000 * param1 / var6 : 0;
        ik.field_cb[mc.field_c] = var7;
        if (var7 < mi.field_f) {
            mi.field_f = var7;
        }
        if (ka.field_P < var7) {
            ka.field_P = var7;
        }
        int var8 = 29 % ((param4 - 22) / 52);
        mc.field_c = mc.field_c + 1;
    }

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 == -3) {
              if (!param2) {
                stackOut_6_0 = rn.field_e.c(param1);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = dn.field_f.c(param1);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -103;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("cl.UA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    cl(hn param0, dj param1, int param2) {
        this(param0, param1, param2, true);
    }

    final void a(byte param0, dj param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        h var8 = null;
        h var9 = null;
        String stackIn_76_0 = null;
        String stackIn_89_0 = null;
        String stackIn_99_0 = null;
        String stackIn_116_0 = null;
        String stackIn_120_0 = null;
        RuntimeException stackIn_151_0 = null;
        StringBuilder stackIn_151_1 = null;
        RuntimeException stackIn_152_0 = null;
        StringBuilder stackIn_152_1 = null;
        RuntimeException stackIn_153_0 = null;
        StringBuilder stackIn_153_1 = null;
        String stackIn_153_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_75_0 = null;
        String stackOut_74_0 = null;
        String stackOut_88_0 = null;
        String stackOut_87_0 = null;
        String stackOut_115_0 = null;
        String stackOut_114_0 = null;
        String stackOut_119_0 = null;
        String stackOut_118_0 = null;
        String stackOut_98_0 = null;
        String stackOut_97_0 = null;
        RuntimeException stackOut_150_0 = null;
        StringBuilder stackOut_150_1 = null;
        RuntimeException stackOut_152_0 = null;
        StringBuilder stackOut_152_1 = null;
        String stackOut_152_2 = null;
        RuntimeException stackOut_151_0 = null;
        StringBuilder stackOut_151_1 = null;
        String stackOut_151_2 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param1.field_z) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_Q = true;
                if (param0 <= -70) {
                  break L1;
                } else {
                  cl.c(false);
                  break L1;
                }
              }
              L2: {
                var4 = this.field_T;
                if (-1 != (var4 ^ -1)) {
                  if (-2 == (var4 ^ -1)) {
                    if (param1.field_Eb) {
                      this.a(ae.field_e, -88);
                      break L2;
                    } else {
                      param1.field_Eb = true;
                      kc.a(ii.field_i, (pm) (this), 125, param1.field_Rb);
                      param1.field_Rb = false;
                      this.d(10797);
                      break L2;
                    }
                  } else {
                    if (-3 == (var4 ^ -1)) {
                      if (param1.field_Sb) {
                        this.a(rh.field_db, -86);
                        break L2;
                      } else {
                        param1.field_Sb = true;
                        kc.a(mg.field_c, (pm) (this), 119, param1.field_sb);
                        if (param1.field_sb) {
                          pk.a((byte) 16, b.a(new String[]{r.field_b}, tn.field_D, 1177));
                          param1.field_sb = false;
                          this.d(10797);
                          break L2;
                        } else {
                          this.d(10797);
                          break L2;
                        }
                      }
                    } else {
                      if (3 == var4) {
                        if (!param1.field_cb) {
                          param1.field_cb = true;
                          kc.a(ah.field_Z, (pm) (this), 119, param1.field_nb);
                          if (param1.field_nb) {
                            pk.a((byte) 105, b.a(new String[]{ek.field_k}, ck.field_b, 1177));
                            param1.field_nb = false;
                            this.d(10797);
                            break L2;
                          } else {
                            this.d(10797);
                            break L2;
                          }
                        } else {
                          this.a(qf.field_b, -84);
                          break L2;
                        }
                      } else {
                        if (var4 == 5) {
                          if (!param1.field_eb) {
                            L3: {
                              param1.field_eb = true;
                              kc.a(fa.field_T, (pm) (this), 121, param1.field_Ob);
                              if (param1.field_Ob) {
                                pk.a((byte) 87, b.a(new String[]{kc.field_r}, ld.field_b, 1177));
                                param1.field_Ob = false;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            this.d(10797);
                            break L2;
                          } else {
                            this.a(vg.field_Q, -104);
                            break L2;
                          }
                        } else {
                          if (4 != var4) {
                            if (6 != var4) {
                              if ((var4 ^ -1) == -9) {
                                param1.field_U = 1500;
                                kc.a(wd.field_e, (pm) (this), 122, true);
                                this.d(10797);
                                break L2;
                              } else {
                                if ((var4 ^ -1) == -8) {
                                  param1.field_Pb = 1500;
                                  kc.a(ne.field_a, (pm) (this), 119, true);
                                  this.d(10797);
                                  break L2;
                                } else {
                                  if ((var4 ^ -1) == -11) {
                                    if ((param1.field_ub ^ -1) <= -21) {
                                      this.a(rn.field_b, -104);
                                      break L2;
                                    } else {
                                      L4: {
                                        if (param1.field_ub >= 0) {
                                          L5: {
                                            var4 = 20 - param1.field_ub;
                                            if (-5 <= (var4 ^ -1)) {
                                              break L5;
                                            } else {
                                              var4 = 4;
                                              break L5;
                                            }
                                          }
                                          L6: {
                                            param1.field_ub = param1.field_ub + var4;
                                            if (1 != var4) {
                                              stackOut_75_0 = b.a(new String[]{Integer.toString(var4)}, ah.field_R, 1177);
                                              stackIn_76_0 = stackOut_75_0;
                                              break L6;
                                            } else {
                                              stackOut_74_0 = ek.field_e;
                                              stackIn_76_0 = stackOut_74_0;
                                              break L6;
                                            }
                                          }
                                          kc.a(stackIn_76_0, (pm) (this), 126, false);
                                          break L4;
                                        } else {
                                          param1.field_ub = 4;
                                          kc.a(b.a(new String[]{"4"}, ah.field_R, 1177), (pm) (this), 120, true);
                                          pk.a((byte) 68, b.a(new String[]{ic.field_d}, dc.field_M, 1177));
                                          break L4;
                                        }
                                      }
                                      this.d(10797);
                                      break L2;
                                    }
                                  } else {
                                    if (var4 == 11) {
                                      if (param1.field_tb < 20) {
                                        L7: {
                                          if (-1 >= (param1.field_tb ^ -1)) {
                                            L8: {
                                              var4 = 20 + -param1.field_tb;
                                              if (-5 > (var4 ^ -1)) {
                                                var4 = 4;
                                                break L8;
                                              } else {
                                                break L8;
                                              }
                                            }
                                            L9: {
                                              param1.field_tb = param1.field_tb + var4;
                                              if (var4 != 1) {
                                                stackOut_88_0 = b.a(new String[]{Integer.toString(var4)}, hf.field_X, 1177);
                                                stackIn_89_0 = stackOut_88_0;
                                                break L9;
                                              } else {
                                                stackOut_87_0 = md.field_b;
                                                stackIn_89_0 = stackOut_87_0;
                                                break L9;
                                              }
                                            }
                                            kc.a(stackIn_89_0, (pm) (this), 127, false);
                                            break L7;
                                          } else {
                                            param1.field_tb = 4;
                                            kc.a(b.a(new String[]{"4"}, hf.field_X, 1177), (pm) (this), 116, true);
                                            pk.a((byte) 48, b.a(new String[]{s.field_L}, tm.field_e, 1177));
                                            break L7;
                                          }
                                        }
                                        this.d(10797);
                                        break L2;
                                      } else {
                                        this.a(sc.field_j, -73);
                                        break L2;
                                      }
                                    } else {
                                      if ((var4 ^ -1) != -13) {
                                        if ((var4 ^ -1) != -14) {
                                          if (var4 != 14) {
                                            if (var4 != 15) {
                                              if (var4 != 16) {
                                                if (-10 == (var4 ^ -1)) {
                                                  kc.a(dj.field_W, (pm) (this), 119, true);
                                                  param1.field_R = 1500;
                                                  this.d(10797);
                                                  this.field_A.field_J.field_e = 3 + this.field_A.field_J.field_o;
                                                  this.field_A.field_J.field_m = this.field_A.field_J.field_o + 3;
                                                  if (this.field_A.field_J.field_m <= 24) {
                                                    hc.field_u = b.a(new String[]{Integer.toString(this.field_A.field_J.field_m)}, oe.field_X, 1177);
                                                    bg.field_f = 0;
                                                    break L2;
                                                  } else {
                                                    break L2;
                                                  }
                                                } else {
                                                  if (-18 == (var4 ^ -1)) {
                                                    kc.a(q.field_n, (pm) (this), 123, true);
                                                    param1.field_yb = param1.field_yb + 1;
                                                    d.field_a = d.field_a - 1;
                                                    this.d(10797);
                                                    break L2;
                                                  } else {
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                kc.a(na.field_Q, (pm) (this), 124, true);
                                                param1.field_Gb = 1500;
                                                this.d(10797);
                                                break L2;
                                              }
                                            } else {
                                              L10: {
                                                kc.a(km.field_a, (pm) (this), 116, true);
                                                param1.field_ib = 1500;
                                                param1.field_Bb.field_l = true;
                                                if (0 != param1.field_Bb.field_d) {
                                                  break L10;
                                                } else {
                                                  param1.field_Bb.field_d = 1;
                                                  break L10;
                                                }
                                              }
                                              var4 = 0;
                                              L11: while (true) {
                                                if (var4 >= 5) {
                                                  this.d(10797);
                                                  break L2;
                                                } else {
                                                  L12: {
                                                    var9 = param1.field_Nb[var4];
                                                    if (var9 != null) {
                                                      var9.field_ab.field_l = true;
                                                      if (0 != var9.field_ab.field_d) {
                                                        break L12;
                                                      } else {
                                                        var9.field_ab.field_d = 1;
                                                        break L12;
                                                      }
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                  var4++;
                                                  continue L11;
                                                }
                                              }
                                            }
                                          } else {
                                            L13: {
                                              L14: {
                                                var3_int = param1.field_Bb.field_b - 8;
                                                if (var3_int == 0) {
                                                  break L14;
                                                } else {
                                                  L15: {
                                                    if (-1 == (param1.field_Bb.field_d ^ -1)) {
                                                      break L15;
                                                    } else {
                                                      if (var3_int < this.field_A.field_J.a(-2)) {
                                                        break L14;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                  L16: {
                                                    if (-65537 == (param1.field_Bb.field_d ^ -1)) {
                                                      stackOut_115_0 = dj.field_Ib;
                                                      stackIn_116_0 = stackOut_115_0;
                                                      break L16;
                                                    } else {
                                                      stackOut_114_0 = pi.field_P;
                                                      stackIn_116_0 = stackOut_114_0;
                                                      break L16;
                                                    }
                                                  }
                                                  kc.a(stackIn_116_0, (pm) (this), 121, true);
                                                  break L13;
                                                }
                                              }
                                              L17: {
                                                if (-1 != (var3_int ^ -1)) {
                                                  stackOut_119_0 = vm.field_ab;
                                                  stackIn_120_0 = stackOut_119_0;
                                                  break L17;
                                                } else {
                                                  stackOut_118_0 = dj.field_Ib;
                                                  stackIn_120_0 = stackOut_118_0;
                                                  break L17;
                                                }
                                              }
                                              kc.a(stackIn_120_0, (pm) (this), 120, true);
                                              param1.field_Bb.field_b = param1.field_Bb.field_b + 1;
                                              break L13;
                                            }
                                            param1.field_Bb.field_d = 65536;
                                            var4 = 0;
                                            L18: while (true) {
                                              if ((var4 ^ -1) <= -6) {
                                                this.d(10797);
                                                break L2;
                                              } else {
                                                var8 = param1.field_Nb[var4];
                                                if (var8 != null) {
                                                  L19: {
                                                    var6 = param1.field_Bb.field_b - 4;
                                                    if (var8.field_ab.field_b < var6) {
                                                      var8.field_ab.field_b = var6;
                                                      break L19;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                  var8.field_ab.field_d = 65536;
                                                  var4++;
                                                  continue L18;
                                                } else {
                                                  var4++;
                                                  continue L18;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if ((param1.field_ab ^ -1) <= -5) {
                                            this.a(gi.field_hb, -82);
                                            break L2;
                                          } else {
                                            L20: {
                                              if ((param1.field_ab ^ -1) <= -1) {
                                                param1.field_ab = param1.field_ab + 1;
                                                kc.a(ah.field_W, (pm) (this), 119, false);
                                                break L20;
                                              } else {
                                                param1.field_ab = 1;
                                                kc.a(ah.field_W, (pm) (this), 121, true);
                                                pk.a((byte) 126, b.a(new String[]{cf.field_db}, ae.field_b, 1177));
                                                break L20;
                                              }
                                            }
                                            this.d(10797);
                                            break L2;
                                          }
                                        }
                                      } else {
                                        if (param1.field_zb >= 10) {
                                          this.a(ke.field_ab, -111);
                                          break L2;
                                        } else {
                                          L21: {
                                            if (-1 < (param1.field_zb ^ -1)) {
                                              param1.field_zb = 4;
                                              kc.a(b.a(new String[]{"4"}, kn.field_b, 1177), (pm) (this), 119, true);
                                              pk.a((byte) 76, b.a(new String[]{qn.field_x}, jh.field_U, 1177));
                                              break L21;
                                            } else {
                                              L22: {
                                                var4 = 10 + -param1.field_zb;
                                                if (var4 > 4) {
                                                  var4 = 4;
                                                  break L22;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                              L23: {
                                                param1.field_zb = param1.field_zb + var4;
                                                if (var4 == 1) {
                                                  stackOut_98_0 = wh.field_ab;
                                                  stackIn_99_0 = stackOut_98_0;
                                                  break L23;
                                                } else {
                                                  stackOut_97_0 = b.a(new String[]{Integer.toString(var4)}, kn.field_b, 1177);
                                                  stackIn_99_0 = stackOut_97_0;
                                                  break L23;
                                                }
                                              }
                                              kc.a(stackIn_99_0, (pm) (this), 120, false);
                                              break L21;
                                            }
                                          }
                                          this.d(10797);
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (!param1.o(-100)) {
                                this.a(dn.field_a, -99);
                                break L2;
                              } else {
                                kc.a(gb.field_b, (pm) (this), 124, true);
                                this.d(10797);
                                break L2;
                              }
                            }
                          } else {
                            if (!param1.field_rb) {
                              param1.field_rb = true;
                              kc.a(wi.field_b, (pm) (this), 126, param1.field_hb);
                              if (param1.field_hb) {
                                pk.a((byte) 62, b.a(new String[]{rb.field_g}, vg.field_K, 1177));
                                param1.field_hb = false;
                                this.d(10797);
                                break L2;
                              } else {
                                this.d(10797);
                                break L2;
                              }
                            } else {
                              this.a(f.field_b, -103);
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (!param1.field_mb) {
                    param1.field_mb = true;
                    kc.a(kd.field_s, (pm) (this), 126, param1.field_T);
                    param1.field_T = false;
                    this.d(10797);
                    break L2;
                  } else {
                    this.a(hj.field_i, -76);
                    break L2;
                  }
                }
              }
              L24: {
                if (this.field_z) {
                  gd.a(48, 70, gj.field_d, (pm) (this));
                  if (this.field_U) {
                    break L24;
                  } else {
                    this.field_A.a((byte) 50, 200);
                    break L24;
                  }
                } else {
                  break L24;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var3 = decompiledCaughtException;
            stackOut_150_0 = (RuntimeException) (var3);
            stackOut_150_1 = new StringBuilder().append("cl.RA(").append(param0).append(',');
            stackIn_152_0 = stackOut_150_0;
            stackIn_152_1 = stackOut_150_1;
            stackIn_151_0 = stackOut_150_0;
            stackIn_151_1 = stackOut_150_1;
            if (param1 == null) {
              stackOut_152_0 = (RuntimeException) ((Object) stackIn_152_0);
              stackOut_152_1 = (StringBuilder) ((Object) stackIn_152_1);
              stackOut_152_2 = "null";
              stackIn_153_0 = stackOut_152_0;
              stackIn_153_1 = stackOut_152_1;
              stackIn_153_2 = stackOut_152_2;
              break L25;
            } else {
              stackOut_151_0 = (RuntimeException) ((Object) stackIn_151_0);
              stackOut_151_1 = (StringBuilder) ((Object) stackIn_151_1);
              stackOut_151_2 = "{...}";
              stackIn_153_0 = stackOut_151_0;
              stackIn_153_1 = stackOut_151_1;
              stackIn_153_2 = stackOut_151_2;
              break L25;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_153_0), stackIn_153_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, il param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.c((ee) (this), -7442);
              if (!param0) {
                break L1;
              } else {
                this.field_R = 69;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("cl.L(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final boolean a(dj param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        cl var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_87_0 = 0;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (!param0.field_z) {
              L1: {
                if (param1 == -1326) {
                  break L1;
                } else {
                  var5 = (cl) null;
                  this.a((cl) null, (byte) -81);
                  break L1;
                }
              }
              var3_int = this.field_T;
              if (var3_int != 0) {
                if (-2 == (var3_int ^ -1)) {
                  L2: {
                    if (param0.field_Eb) {
                      stackOut_40_0 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      break L2;
                    } else {
                      stackOut_39_0 = 1;
                      stackIn_41_0 = stackOut_39_0;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((var3_int ^ -1) != -3) {
                    if (var3_int != 3) {
                      if ((var3_int ^ -1) != -6) {
                        if (4 != var3_int) {
                          if (6 != var3_int) {
                            if (var3_int == 8) {
                              stackOut_58_0 = 1;
                              stackIn_59_0 = stackOut_58_0;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              if (7 == var3_int) {
                                stackOut_60_0 = 1;
                                stackIn_61_0 = stackOut_60_0;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              } else {
                                if ((var3_int ^ -1) == -11) {
                                  L3: {
                                    L4: {
                                      if (!this.field_Q) {
                                        break L4;
                                      } else {
                                        if ((param0.field_ub ^ -1) <= -21) {
                                          stackOut_66_0 = 0;
                                          stackIn_67_0 = stackOut_66_0;
                                          break L3;
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                    stackOut_65_0 = 1;
                                    stackIn_67_0 = stackOut_65_0;
                                    break L3;
                                  }
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                } else {
                                  if (var3_int == 11) {
                                    L5: {
                                      L6: {
                                        if (!this.field_Q) {
                                          break L6;
                                        } else {
                                          if (20 <= param0.field_tb) {
                                            stackOut_72_0 = 0;
                                            stackIn_73_0 = stackOut_72_0;
                                            break L5;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      stackOut_71_0 = 1;
                                      stackIn_73_0 = stackOut_71_0;
                                      break L5;
                                    }
                                    decompiledRegionSelector0 = 10;
                                    break L0;
                                  } else {
                                    if (-13 != (var3_int ^ -1)) {
                                      if (var3_int != 13) {
                                        if (14 == var3_int) {
                                          stackOut_80_0 = 1;
                                          stackIn_81_0 = stackOut_80_0;
                                          decompiledRegionSelector0 = 12;
                                          break L0;
                                        } else {
                                          if (15 == var3_int) {
                                            stackOut_82_0 = 1;
                                            stackIn_83_0 = stackOut_82_0;
                                            decompiledRegionSelector0 = 13;
                                            break L0;
                                          } else {
                                            if ((var3_int ^ -1) == -17) {
                                              stackOut_84_0 = 1;
                                              stackIn_85_0 = stackOut_84_0;
                                              decompiledRegionSelector0 = 14;
                                              break L0;
                                            } else {
                                              if (var3_int != 9) {
                                                if (17 != var3_int) {
                                                  stackOut_86_0 = 0;
                                                  stackIn_87_0 = stackOut_86_0;
                                                  decompiledRegionSelector0 = 15;
                                                  break L0;
                                                } else {
                                                  return true;
                                                }
                                              } else {
                                                return true;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        return true;
                                      }
                                    } else {
                                      L7: {
                                        L8: {
                                          if (!this.field_Q) {
                                            break L8;
                                          } else {
                                            if (-11 >= (param0.field_zb ^ -1)) {
                                              stackOut_78_0 = 0;
                                              stackIn_79_0 = stackOut_78_0;
                                              break L7;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        stackOut_77_0 = 1;
                                        stackIn_79_0 = stackOut_77_0;
                                        break L7;
                                      }
                                      decompiledRegionSelector0 = 11;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            return param0.l(-53);
                          }
                        } else {
                          L9: {
                            if (param0.field_rb) {
                              stackOut_56_0 = 0;
                              stackIn_57_0 = stackOut_56_0;
                              break L9;
                            } else {
                              stackOut_55_0 = 1;
                              stackIn_57_0 = stackOut_55_0;
                              break L9;
                            }
                          }
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        L10: {
                          if (param0.field_eb) {
                            stackOut_52_0 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            break L10;
                          } else {
                            stackOut_51_0 = 1;
                            stackIn_53_0 = stackOut_51_0;
                            break L10;
                          }
                        }
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      L11: {
                        if (param0.field_cb) {
                          stackOut_48_0 = 0;
                          stackIn_49_0 = stackOut_48_0;
                          break L11;
                        } else {
                          stackOut_47_0 = 1;
                          stackIn_49_0 = stackOut_47_0;
                          break L11;
                        }
                      }
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    L12: {
                      if (param0.field_Sb) {
                        stackOut_44_0 = 0;
                        stackIn_45_0 = stackOut_44_0;
                        break L12;
                      } else {
                        stackOut_43_0 = 1;
                        stackIn_45_0 = stackOut_43_0;
                        break L12;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                L13: {
                  if (param0.field_mb) {
                    stackOut_36_0 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    break L13;
                  } else {
                    stackOut_35_0 = 1;
                    stackIn_37_0 = stackOut_35_0;
                    break L13;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_88_0 = (RuntimeException) (var3);
            stackOut_88_1 = new StringBuilder().append("cl.SA(");
            stackIn_90_0 = stackOut_88_0;
            stackIn_90_1 = stackOut_88_1;
            stackIn_89_0 = stackOut_88_0;
            stackIn_89_1 = stackOut_88_1;
            if (param0 == null) {
              stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackOut_90_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L14;
            } else {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "{...}";
              stackIn_91_0 = stackOut_89_0;
              stackIn_91_1 = stackOut_89_1;
              stackIn_91_2 = stackOut_89_2;
              break L14;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_91_0), stackIn_91_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_37_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_41_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_45_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_49_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_53_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_57_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_59_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_61_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_67_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_73_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_79_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_81_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_83_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_85_0 != 0;
                                    } else {
                                      return stackIn_87_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, h param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a((byte) -116, this.field_A.field_B);
              if (param0 == 640) {
                break L1;
              } else {
                this.field_T = -106;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("cl.VA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(dj param0, byte param1) {
        try {
            if (param1 != 80) {
                this.field_Q = true;
            }
            this.a((byte) -113, param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "cl.GB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private cl(hn param0, ee param1, int param2, boolean param3) {
        super(param0, param1.field_E, param1.field_t, param1.field_D, 0.25, 0.01);
        RuntimeException var5 = null;
        double[] var5_array = null;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double[] var16 = null;
        double[] var17 = null;
        double[] var18 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        this.field_V = (int)(Math.random() * 64.0);
        this.field_R = 0;
        try {
          L0: {
            L1: {
              var18 = new double[12];
              var17 = var18;
              var16 = var17;
              var5_array = var16;
              param0.field_B.field_jb.a((byte) 113, var18);
              var6 = (Math.random() + 1.0) * 0.2;
              var8 = 0.002 * Math.sqrt(Math.random()) / var6;
              var10 = 6.283185307179586 * Math.random();
              var12 = var8 * Math.sin(var10);
              var14 = Math.cos(var10) * var8;
              this.field_L = var18[11] * var6 + (var14 * var18[8] + var18[5] * var12);
              this.field_G = var18[4] * var12 + var14 * var18[7] + var18[10] * var6;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((cl) (this)).field_U = stackIn_4_1 != 0;
            this.field_K = var14 * var18[6] + var12 * var18[3] + var18[9] * var6;
            this.field_T = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("cl.<init>(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == 72) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("cl.WA(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final double a(int param0, boolean param1, double param2) {
        int discarded$0 = 0;
        if (param0 != 14170) {
            String var6 = (String) null;
            discarded$0 = cl.a(-34, (String) null, true);
        }
        return param2;
    }

    final boolean a(boolean param0, pm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_T = 61;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("cl.CB(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, vg param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.a((cl) (this), (byte) -115);
              if (param0 == -1) {
                break L1;
              } else {
                this.field_V = -53;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("cl.DA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, ah param1) {
        try {
            int var3_int = 116 % ((param0 - 14) / 53);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "cl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, ee param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param1, 0.0, -55);
              if (param0) {
                break L1;
              } else {
                this.field_R = -82;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("cl.E(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(byte param0, sa param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 9) {
                break L1;
              } else {
                this.field_V = 72;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("cl.M(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(pm param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.a((cl) (this), (byte) 124);
              if (param1 < -81) {
                break L1;
              } else {
                this.field_U = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("cl.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            return true;
        }
        return false;
    }

    final void a(int param0, hf param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -29) {
                break L1;
              } else {
                this.field_V = -43;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("cl.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(cl param0, byte param1) {
        try {
            int var3_int = -92 % ((-35 - param1) / 60);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "cl.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, mb param1) {
        try {
            if (param0 != -23154) {
                il var4 = (il) null;
                this.a(false, (il) null);
            }
            param1.a((cl) (this), (byte) 107);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "cl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_S = new rf();
    }
}

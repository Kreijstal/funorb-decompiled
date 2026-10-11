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
          for (var6 = 0; var6 < 18; var6++) {
            if (bk.field_h[var6] >= var5 &&
              param0.field_J.a(-5, var6)) {
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
          this.a(123, pm.field_w[(31 & this.field_V) >> 1], param1, param3);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cl.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static int h(byte param0) {
        try {
          int stackIn_17_0 = 0;
          int stackIn_27_0 = 0;
          int stackIn_31_0 = 0;
          int stackIn_35_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          kg var2 = null;
          if (param0 >= -51) {
            return -101;
          }
          if (om.field_s.field_a >= 4) {
            if (-1 == om.field_s.field_e) {
              return 3;
            }
            if (om.field_s.field_e == -2) {
              return 4;
            }
            return 1;
          }
          try {
            if (0 == we.field_k) {
              ol.field_a = ek.field_p.a(fa.field_P, -96, eb.field_n);
              we.field_k = we.field_k + 1;
            }
            if (we.field_k == 1) {
              if (ol.field_a.field_g == 2) {
                stackIn_17_0 = sf.a(-1, (byte) -121);
                return stackIn_17_0;
              }
              if (ol.field_a.field_g == 1) {
                we.field_k = we.field_k + 1;
              }
            }
            if (2 == we.field_k) {
              gk.field_u = new vd((java.net.Socket) (ol.field_a.field_f), ek.field_p);
              var2 = new kg(13);
              ql.a(hj.field_k, var2, hc.field_n, (byte) 40, wi.field_c);
              var2.f(93, 15);
              var2.d(-103, pi.field_L);
              gk.field_u.a(13, false, var2.field_m, 0);
              we.field_k = we.field_k + 1;
              fl.field_a = ri.a(-3) + 30000L;
            }
            if (we.field_k == 3) {
              if (gk.field_u.c((byte) -109) <= 0) {
                if (fl.field_a < ri.a(-3)) {
                  stackIn_31_0 = sf.a(-2, (byte) -80);
                  return stackIn_31_0;
                }
              } else {
                var1_int = gk.field_u.a((byte) -5);
                if (0 != var1_int) {
                  stackIn_27_0 = sf.a(var1_int, (byte) -67);
                  return stackIn_27_0;
                }
                we.field_k = we.field_k + 1;
              }
            }
            if (we.field_k != 4) {
              return -1;
            }
            om.field_s.a(Confined.field_L, gk.field_u, (byte) -65);
            gk.field_u = null;
            ol.field_a = null;
            we.field_k = 0;
            stackIn_35_0 = 0;
            return stackIn_35_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return sf.a(-3, (byte) -123);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, int param1) {
        if (this.field_R == 0) {
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
        double var3;
        double var5;
        double var7;
        double var9;
        double var11;
        int var13;
        var13 = Confined.field_J ? 1 : 0;
        this.field_G = this.field_G * 0.97;
        this.field_V = this.field_V + 1;
        if (this.field_R > 0) {
          this.field_R = this.field_R - 1;
        }
        this.field_K = this.field_K * 0.97;
        this.field_L = this.field_L * 0.995;
        this.field_A.field_x.b(3, param1, this.field_D);
        this.field_E = this.field_E - this.field_A.field_x.field_B;
        this.field_t = this.field_t - this.field_A.field_x.field_G;
        super.a(param0, param1);
        while (param1 > 0) {
          if (this.field_A.field_x.field_r[param1] > this.field_D) {
            param1--;
            continue;
          }
          break;
        }
        while (param1 < this.field_A.field_x.field_a - 2) {
          if (this.field_D >= this.field_A.field_x.field_r[param1 + 1]) {
            param1++;
            continue;
          }
          break;
        }
        this.field_A.field_x.b(3, param1, this.field_D);
        if (0.0 > this.field_D) {
          this.field_z = true;
          this.field_s = 2;
        }
        this.field_t = this.field_t + this.field_A.field_x.field_G;
        this.field_E = this.field_E + this.field_A.field_x.field_B;
        if (this.field_A.field_B.field_R > 0 &&
          this.field_R == 0 &&
          this.a(this.field_A.field_B, -1326)) {
          var3 = -this.field_E + this.field_A.field_B.field_E;
          var5 = this.field_A.field_B.field_t - this.field_t;
          var7 = this.field_A.field_B.field_D - this.field_D;
          var9 = Math.sqrt(var7 * var7 + (var5 * var5 + var3 * var3));
          if (1.0 > var9) {
            var9 = 1.0;
          }
          var11 = 0.01 / var9;
          this.a((ee) (this.field_A.field_B), 12);
          this.a(false, var11, param0 ^ 17081);
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
        int var6 = param0 + (param1 + param5);
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -3) {
            stackIn_2_0 = -103;
            return stackIn_2_0;
          }
          if (!param2) {
            stackIn_7_0 = rn.field_e.c(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = dn.field_f.c(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("cl.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    cl(hn param0, dj param1, int param2) {
        this(param0, param1, param2, true);
    }

    final void a(byte param0, dj param1) {
        String stackIn_76_0 = null;
        String stackIn_89_0 = null;
        String stackIn_99_0 = null;
        String stackIn_116_0 = null;
        String stackIn_120_0 = null;
        RuntimeException stackIn_154_0 = null;
        StringBuilder stackIn_154_1 = null;
        String stackIn_155_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        h var8 = null;
        h var9 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          if (param1.field_z) {
            return;
          }
          this.field_Q = true;
          if (param0 > -70) {
            cl.c(false);
          }
          var4 = this.field_T;
          if (var4 != 0) {
            if (var4 == 1) {
              if (param1.field_Eb) {
                this.a(ae.field_e, -88);
              } else {
                param1.field_Eb = true;
                kc.a(ii.field_i, (pm) (this), 125, param1.field_Rb);
                param1.field_Rb = false;
                this.d(10797);
              }
            } else {
              if (var4 == 2) {
                if (param1.field_Sb) {
                  this.a(rh.field_db, -86);
                } else {
                  param1.field_Sb = true;
                  kc.a(mg.field_c, (pm) (this), 119, param1.field_sb);
                  if (param1.field_sb) {
                    pk.a((byte) 16, b.a(new String[]{r.field_b}, tn.field_D, 1177));
                    param1.field_sb = false;
                    this.d(10797);
                  } else {
                    this.d(10797);
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
                    } else {
                      this.d(10797);
                    }
                  } else {
                    this.a(qf.field_b, -84);
                  }
                } else {
                  if (var4 == 5) {
                    if (!param1.field_eb) {
                      param1.field_eb = true;
                      kc.a(fa.field_T, (pm) (this), 121, param1.field_Ob);
                      if (param1.field_Ob) {
                        pk.a((byte) 87, b.a(new String[]{kc.field_r}, ld.field_b, 1177));
                        param1.field_Ob = false;
                      }
                      this.d(10797);
                    } else {
                      this.a(vg.field_Q, -104);
                    }
                  } else {
                    if (4 != var4) {
                      if (6 != var4) {
                        if (var4 == 8) {
                          param1.field_U = 1500;
                          kc.a(wd.field_e, (pm) (this), 122, true);
                          this.d(10797);
                        } else {
                          if (var4 == 7) {
                            param1.field_Pb = 1500;
                            kc.a(ne.field_a, (pm) (this), 119, true);
                            this.d(10797);
                          } else {
                            if (var4 == 10) {
                              if (param1.field_ub >= 20) {
                                this.a(rn.field_b, -104);
                              } else {
                                if (param1.field_ub >= 0) {
                                  var4 = 20 - param1.field_ub;
                                  if (var4 > 4) {
                                    var4 = 4;
                                  }
                                  param1.field_ub = param1.field_ub + var4;
                                  if (1 != var4) {
                                    stackIn_76_0 = b.a(new String[]{Integer.toString(var4)}, ah.field_R, 1177);
                                  } else {
                                    stackIn_76_0 = ek.field_e;
                                  }
                                  kc.a(stackIn_76_0, (pm) (this), 126, false);
                                } else {
                                  param1.field_ub = 4;
                                  kc.a(b.a(new String[]{"4"}, ah.field_R, 1177), (pm) (this), 120, true);
                                  pk.a((byte) 68, b.a(new String[]{ic.field_d}, dc.field_M, 1177));
                                }
                                this.d(10797);
                              }
                            } else {
                              if (var4 == 11) {
                                if (param1.field_tb < 20) {
                                  if (param1.field_tb >= 0) {
                                    var4 = 20 - param1.field_tb;
                                    if (var4 > 4) {
                                      var4 = 4;
                                    }
                                    param1.field_tb = param1.field_tb + var4;
                                    if (var4 != 1) {
                                      stackIn_89_0 = b.a(new String[]{Integer.toString(var4)}, hf.field_X, 1177);
                                    } else {
                                      stackIn_89_0 = md.field_b;
                                    }
                                    kc.a(stackIn_89_0, (pm) (this), 127, false);
                                  } else {
                                    param1.field_tb = 4;
                                    kc.a(b.a(new String[]{"4"}, hf.field_X, 1177), (pm) (this), 116, true);
                                    pk.a((byte) 48, b.a(new String[]{s.field_L}, tm.field_e, 1177));
                                  }
                                  this.d(10797);
                                } else {
                                  this.a(sc.field_j, -73);
                                }
                              } else {
                                if (var4 != 12) {
                                  if (var4 != 13) {
                                    if (var4 == 14) {
                                      boolean decompiledFrameRemainder0 = true;
                                      var3_int = param1.field_Bb.field_b - 8;
                                      if (var3_int != 0 && (param1.field_Bb.field_d == 0 ||
                                        !(var3_int < this.field_A.field_J.a(-2)))) {
                                        if (param1.field_Bb.field_d == 65536) {
                                          stackIn_116_0 = dj.field_Ib;
                                        } else {
                                          stackIn_116_0 = pi.field_P;
                                        }
                                        kc.a(stackIn_116_0, (pm) (this), 121, true);
                                        decompiledFrameRemainder0 = false;
                                      }
                                      else {
                                        if (var3_int != 0) {
                                          stackIn_120_0 = vm.field_ab;
                                        } else {
                                          stackIn_120_0 = dj.field_Ib;
                                        }
                                        kc.a(stackIn_120_0, (pm) (this), 120, true);
                                        param1.field_Bb.field_b = param1.field_Bb.field_b + 1;
                                      }
                                      param1.field_Bb.field_d = 65536;
                                      for (var4 = 0; var4 < 5; var4++) {
                                        var8 = param1.field_Nb[var4];
                                        if (var8 != null) {
                                          var6 = param1.field_Bb.field_b - 4;
                                          if (var8.field_ab.field_b < var6) {
                                            var8.field_ab.field_b = var6;
                                          }
                                          var8.field_ab.field_d = 65536;
                                        }
                                      }
                                      this.d(10797);
                                    } else {
                                      if (var4 == 15) {
                                        kc.a(km.field_a, (pm) (this), 116, true);
                                        param1.field_ib = 1500;
                                        param1.field_Bb.field_l = true;
                                        if (0 == param1.field_Bb.field_d) {
                                          param1.field_Bb.field_d = 1;
                                        }
                                        for (var4 = 0; var4 < 5; var4++) {
                                          var9 = param1.field_Nb[var4];
                                          if (var9 != null) {
                                            var9.field_ab.field_l = true;
                                            if (0 == var9.field_ab.field_d) {
                                              var9.field_ab.field_d = 1;
                                            }
                                          }
                                        }
                                        this.d(10797);
                                      } else {
                                        if (var4 != 16) {
                                          if (var4 == 9) {
                                            kc.a(dj.field_W, (pm) (this), 119, true);
                                            param1.field_R = 1500;
                                            this.d(10797);
                                            this.field_A.field_J.field_e = 3 + this.field_A.field_J.field_o;
                                            this.field_A.field_J.field_m = this.field_A.field_J.field_o + 3;
                                            if (this.field_A.field_J.field_m <= 24) {
                                              hc.field_u = b.a(new String[]{Integer.toString(this.field_A.field_J.field_m)}, oe.field_X, 1177);
                                              bg.field_f = 0;
                                            }
                                          } else {
                                            if (var4 == 17) {
                                              kc.a(q.field_n, (pm) (this), 123, true);
                                              param1.field_yb = param1.field_yb + 1;
                                              d.field_a = d.field_a - 1;
                                              this.d(10797);
                                            }
                                          }
                                        } else {
                                          kc.a(na.field_Q, (pm) (this), 124, true);
                                          param1.field_Gb = 1500;
                                          this.d(10797);
                                        }
                                      }
                                    }
                                  } else {
                                    if (param1.field_ab >= 4) {
                                      this.a(gi.field_hb, -82);
                                    } else {
                                      if (param1.field_ab >= 0) {
                                        param1.field_ab = param1.field_ab + 1;
                                        kc.a(ah.field_W, (pm) (this), 119, false);
                                      } else {
                                        param1.field_ab = 1;
                                        kc.a(ah.field_W, (pm) (this), 121, true);
                                        pk.a((byte) 126, b.a(new String[]{cf.field_db}, ae.field_b, 1177));
                                      }
                                      this.d(10797);
                                    }
                                  }
                                } else {
                                  if (param1.field_zb >= 10) {
                                    this.a(ke.field_ab, -111);
                                  } else {
                                    if (param1.field_zb < 0) {
                                      param1.field_zb = 4;
                                      kc.a(b.a(new String[]{"4"}, kn.field_b, 1177), (pm) (this), 119, true);
                                      pk.a((byte) 76, b.a(new String[]{qn.field_x}, jh.field_U, 1177));
                                    } else {
                                      var4 = 10 - param1.field_zb;
                                      if (var4 > 4) {
                                        var4 = 4;
                                      }
                                      param1.field_zb = param1.field_zb + var4;
                                      if (var4 == 1) {
                                        stackIn_99_0 = wh.field_ab;
                                      } else {
                                        stackIn_99_0 = b.a(new String[]{Integer.toString(var4)}, kn.field_b, 1177);
                                      }
                                      kc.a(stackIn_99_0, (pm) (this), 120, false);
                                    }
                                    this.d(10797);
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (!param1.o(-100)) {
                          this.a(dn.field_a, -99);
                        } else {
                          kc.a(gb.field_b, (pm) (this), 124, true);
                          this.d(10797);
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
                        } else {
                          this.d(10797);
                        }
                      } else {
                        this.a(f.field_b, -103);
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
            } else {
              this.a(hj.field_i, -76);
            }
          }
          if (this.field_z) {
            gd.a(48, 70, gj.field_d, (pm) (this));
            if (!this.field_U) {
              this.field_A.a((byte) 50, 200);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_154_0 = var3;
          stackIn_154_1 = new StringBuilder().append("cl.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_155_2 = "null";
          } else {
            stackIn_155_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_154_0), ((StringBuilder) (Object) stackIn_154_1).append(stackIn_155_2).append(')').toString());
        }
    }

    final void a(boolean param0, il param1) {
        try {
          param1.c((ee) (this), -7442);
          if (param0) {
            this.field_R = 69;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cl.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(dj param0, int param1) {
        boolean stackIn_37_0 = false;
        boolean stackIn_41_0 = false;
        boolean stackIn_45_0 = false;
        boolean stackIn_49_0 = false;
        boolean stackIn_53_0 = false;
        boolean stackIn_57_0 = false;
        boolean stackIn_67_0 = false;
        boolean stackIn_73_0 = false;
        boolean stackIn_79_0 = false;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        cl var5 = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          if (param0.field_z) {
            return false;
          }
          if (param1 != -1326) {
            var5 = (cl) null;
            this.a((cl) null, (byte) -81);
          }
          var3_int = this.field_T;
          if (var3_int == 0) {
            stackIn_37_0 = !(param0.field_mb);
            return stackIn_37_0;
          }
          if (var3_int == 1) {
            stackIn_41_0 = !(param0.field_Eb);
            return stackIn_41_0;
          }
          if (var3_int == 2) {
            stackIn_45_0 = !(param0.field_Sb);
            return stackIn_45_0;
          }
          if (var3_int == 3) {
            stackIn_49_0 = !(param0.field_cb);
            return stackIn_49_0;
          }
          if (var3_int == 5) {
            stackIn_53_0 = !(param0.field_eb);
            return stackIn_53_0;
          }
          if (4 == var3_int) {
            stackIn_57_0 = !(param0.field_rb);
            return stackIn_57_0;
          }
          if (6 == var3_int) {
            return param0.l(-53);
          }
          if (var3_int == 8) {
            return true;
          }
          if (7 == var3_int) {
            return true;
          }
          if (var3_int == 10) {
            stackIn_67_0 = !(this.field_Q) || !(param0.field_ub >= 20);
            return stackIn_67_0;
          }
          if (var3_int == 11) {
            stackIn_73_0 = !(this.field_Q) || !(20 <= param0.field_tb);
            return stackIn_73_0;
          }
          if (var3_int == 12) {
            stackIn_79_0 = !(this.field_Q) || !(param0.field_zb >= 10);
            return stackIn_79_0;
          }
          if (var3_int == 13) {
            return true;
          }
          if (14 == var3_int) {
            return true;
          }
          if (15 == var3_int) {
            return true;
          }
          if (var3_int == 16) {
            return true;
          }
          if (var3_int == 9) {
            return true;
          }
          if (17 == var3_int) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_90_0 = var3;
          stackIn_90_1 = new StringBuilder().append("cl.SA(");
          if (param0 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_90_0), ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, h param1) {
        try {
          this.a((byte) -116, this.field_A.field_B);
          if (param0 != 640) {
            this.field_T = -106;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cl.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        double[] var18 = null;
        double[] var17 = null;
        double[] var16 = null;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        this.field_V = (int)(Math.random() * 64.0);
        this.field_R = 0;
        try {
          var18 = new double[12];
          var17 = var18;
          var16 = var17;
          double[] var5 = var16;
          param0.field_B.field_jb.a((byte) 113, var18);
          var6 = (Math.random() + 1.0) * 0.2;
          var8 = 0.002 * Math.sqrt(Math.random()) / var6;
          var10 = 6.283185307179586 * Math.random();
          var12 = var8 * Math.sin(var10);
          var14 = Math.cos(var10) * var8;
          this.field_L = var18[11] * var6 + (var14 * var18[8] + var18[5] * var12);
          this.field_G = var18[4] * var12 + var14 * var18[7] + var18[10] * var6;
          this.field_U = param3 ? true : false;
          this.field_K = var14 * var18[6] + var12 * var18[3] + var18[9] * var6;
          this.field_T = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 72) {
            return false;
          }
          this.a(-66, false, -1.8666413142425926);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cl.WA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final double a(int param0, boolean param1, double param2) {
        if (param0 != 14170) {
          String var6 = (String) null;
          cl.a(-34, (String) null, true);
        }
        return param2;
    }

    final boolean a(boolean param0, pm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          this.field_T = 61;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cl.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, vg param1) {
        try {
          param1.a(this, (byte) -115);
          if (param0 != -1) {
            this.field_V = -53;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cl.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        try {
          this.a(param1, 0.0, -55);
          if (!param0) {
            this.field_R = -82;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cl.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, sa param1) {
        try {
          if (param0 != 9) {
            this.field_V = 72;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cl.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(pm param0, int param1) {
        try {
          param0.a(this, (byte) 124);
          if (param1 >= -81) {
            this.field_U = false;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 != 5) {
          return true;
        }
        return false;
    }

    final void a(int param0, hf param1) {
        try {
          if (param0 > -29) {
            this.field_V = -43;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
          param1.a(this, (byte) 107);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "cl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_S = new rf();
    }
}

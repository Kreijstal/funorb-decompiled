/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends sq {
    static ao field_W;
    private j field_Y;
    static boolean[] field_ab;
    private String field_bb;
    private ja field_Z;
    private int field_X;
    static int field_cb;

    final void a(int param0, int param1, int param2, int param3) {
        String var5;
        re var6;
        int var13;
        rk var8;
        int var9;
        int var10;
        int var11;
        int var12;
        ja var15;
        ja var16;
        ja var17;
        ja var18;
        L0: {
          L1: {
            var13 = ZombieDawnMulti.field_E ? 1 : 0;
            var6 = this.field_Y.d(102);
            if (var6 == h.field_H) {
              break L1;
            } else {
              if (var6 != ua.field_I) {
                var5 = this.field_Y.c(-120);
                if (var5 == null) {
                  var5 = this.field_bb;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = ki.field_n;
          break L0;
        }
        L2: {
          if (!var5.equals(this.field_j)) {
            this.field_j = var5;
            this.a((byte) 94);
            break L2;
          } else {
            break L2;
          }
        }
        super.a(param0, param1, param2, param3);
        var6 = this.field_Y.d(97);
        var8 = (rk) ((Object) this.field_h);
        var9 = this.field_y + param3;
        var10 = var8.a((cf) (this), 0, param1) + (var8.a((cf) (this), param0 + -99).a((byte) -111) >> -1436774079);
        if (h.field_H == var6) {
          var18 = rj.field_I[0];
          var11 = var18.field_z << 1889279009;
          var12 = var18.field_u << -1362434079;
          if (this.field_Z != null) {
            if (this.field_Z.field_x >= var11) {
              if (this.field_Z.field_w < var12) {
                this.field_Z = new ja(var11, var12);
                r.a(0, this.field_Z);
                var18.a(112, 144, var18.field_z << -1454164284, var18.field_u << 795996068, -this.field_X << 395113578, 4096);
                ql.a(true);
                this.field_Z.e(var9 - (var18.field_z >> -2001476671), var10 + -var18.field_u, 256);
                return;
              } else {
                r.a(0, this.field_Z);
                oo.b();
                var18.a(112, 144, var18.field_z << -1454164284, var18.field_u << 795996068, -this.field_X << 395113578, 4096);
                ql.a(true);
                this.field_Z.e(var9 - (var18.field_z >> -2001476671), var10 + -var18.field_u, 256);
                return;
              }
            } else {
              this.field_Z = new ja(var11, var12);
              r.a(0, this.field_Z);
              var18.a(112, 144, var18.field_z << -1454164284, var18.field_u << 795996068, -this.field_X << 395113578, 4096);
              ql.a(true);
              this.field_Z.e(var9 - (var18.field_z >> -2001476671), var10 + -var18.field_u, 256);
              return;
            }
          } else {
            this.field_Z = new ja(var11, var12);
            r.a(0, this.field_Z);
            var18.a(112, 144, var18.field_z << -1454164284, var18.field_u << 795996068, -this.field_X << 395113578, 4096);
            ql.a(true);
            this.field_Z.e(var9 - (var18.field_z >> -2001476671), var10 + -var18.field_u, 256);
            return;
          }
        } else {
          if (ua.field_I != var6) {
            if (jq.field_b == var6) {
              var15 = rj.field_I[2];
              var15.e(var9, var10 + -(var15.field_w >> 11199105), 256);
              return;
            } else {
              L3: {
                if (var6 != db.field_b) {
                  break L3;
                } else {
                  var16 = rj.field_I[1];
                  var16.e(var9, -(var16.field_w >> -1344454175) + var10, 256);
                  break L3;
                }
              }
              return;
            }
          } else {
            var17 = rj.field_I[0];
            var11 = var17.field_z << 1889279009;
            var12 = var17.field_u << -1362434079;
            if (this.field_Z != null) {
              if (this.field_Z.field_x >= var11) {
                if (this.field_Z.field_w < var12) {
                  this.field_Z = new ja(var11, var12);
                  r.a(0, this.field_Z);
                  var17.a(112, 144, var17.field_z << -1454164284, var17.field_u << 795996068, -this.field_X << 395113578, 4096);
                  ql.a(true);
                  this.field_Z.e(var9 - (var17.field_z >> -2001476671), var10 + -var17.field_u, 256);
                  return;
                } else {
                  r.a(0, this.field_Z);
                  oo.b();
                  var17.a(112, 144, var17.field_z << -1454164284, var17.field_u << 795996068, -this.field_X << 395113578, 4096);
                  ql.a(true);
                  this.field_Z.e(var9 - (var17.field_z >> -2001476671), var10 + -var17.field_u, 256);
                  return;
                }
              } else {
                this.field_Z = new ja(var11, var12);
                r.a(0, this.field_Z);
                var17.a(112, 144, var17.field_z << -1454164284, var17.field_u << 795996068, -this.field_X << 395113578, 4096);
                ql.a(true);
                this.field_Z.e(var9 - (var17.field_z >> -2001476671), var10 + -var17.field_u, 256);
                return;
              }
            } else {
              this.field_Z = new ja(var11, var12);
              r.a(0, this.field_Z);
              var17.a(112, 144, var17.field_z << -1454164284, var17.field_u << 795996068, -this.field_X << 395113578, 4096);
              ql.a(true);
              this.field_Z.e(var9 - (var17.field_z >> -2001476671), var10 + -var17.field_u, 256);
              return;
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        br var3 = null;
        int var4 = 0;
        ab var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5 = (ab) ((Object) ig.field_a.c(92));
            L1: while (true) {
              if (var5 == null) {
                var2_int = -37 / ((-63 - param1) / 58);
                var3 = so.field_j.c(48);
                L2: while (true) {
                  if (var3 == null) {
                    break L0;
                  } else {
                    qo.b(true, param0);
                    var3 = so.field_j.b(6);
                    continue L2;
                  }
                }
              } else {
                ih.a((byte) 99, var5, param0);
                var5 = (ab) ((Object) ig.field_a.b(6));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "km.D(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, cf param1, int param2, int param3) {
        try {
            this.field_X = this.field_X + 1;
            if (param0 != -5407) {
                km.i(56);
            }
            super.a(param0 ^ 0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "km.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void i(int param0) {
        if (param0 != 0) {
            return;
        }
        field_W = null;
        field_ab = null;
    }

    final static void a(ul param0, byte param1) {
        cj var5 = null;
        cj var6 = null;
        cj var3 = null;
        try {
            pa.field_T = fl.a("basic", "display_name_changed", param0, 11091);
            eg.field_B = new cd(0L, oj.field_Q, iq.field_a, dg.field_I);
            gl.field_L = new cd(0L, oj.field_Q, kg.field_i, qh.field_d);
            pa.field_O = new cj(0L, (cj) null);
            dp.field_b = new cj(0L, vo.field_m);
            dp.field_b.field_R = 1;
            bi.field_f = new cj(0L, vd.field_a, qd.field_r);
            jb.field_c = new cj(0L, pn.field_g, ko.field_h);
            lk.field_J = new cj(0L, cm.field_b);
            if (param1 > -106) {
                km.h(-103);
            }
            pa.field_O.a((byte) 50, dp.field_b);
            pa.field_O.a((byte) 50, bi.field_f);
            pa.field_O.a((byte) 50, jb.field_c);
            pa.field_O.a((byte) 50, eg.field_B);
            pa.field_O.a((byte) 50, lk.field_J);
            eg.field_B.field_Jb.field_Jb.b((byte) -32, vo.field_m);
            eg.field_B.field_Jb.field_Jb.field_lb = 1;
            var5 = eg.field_B.field_Jb.field_Jb;
            var6 = var5;
            var6.field_R = 1;
            gl.field_L.field_Jb.field_Jb.b((byte) -32, vo.field_m);
            gl.field_L.field_Jb.field_Jb.field_lb = 1;
            var3 = gl.field_L.field_Jb.field_Jb;
            var3.field_R = 1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "km.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String d(byte param0) {
        int var2 = 82 / ((param0 - 53) / 57);
        return null;
    }

    final boolean a(cf param0, int param1) {
        RuntimeException var3 = null;
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
            if (param1 == 0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("km.S(");

            if (param0 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static void h(int param0) {
        if (!(og.field_N)) {
            throw new IllegalStateException();
        }
        hh.field_m = true;
        sc.a(-86, false);
        a.field_b = param0;
    }

    final static ka b(int param0, int param1, int param2, int param3) {
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_76_0 = 0;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ka var8_ref_ka;
        int var9;
        ka var9_ref_ka;
        int var10;
        String var10_ref_String;
        String var11;
        int var12;
        int var13;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = null;
        tn.field_A.field_Gb.field_Cb.e(-30986);
        var5 = 0;
        var6 = 0;
        var7 = -1 + uf.field_g;
        L0: while (true) {
          if (-1 < (var7 ^ -1)) {
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (uf.field_g <= var8) {
                L2: {
                  var8 = -var7 - (-var6 - (tn.field_A.field_Gb.field_z + tn.field_A.field_Gb.field_I));
                  tn.field_A.field_Gb.field_Q = tn.field_A.field_Gb.field_Q + var8;
                  var9 = -121 / ((-54 - param0) / 40);
                  tn.field_A.field_Gb.field_z = tn.field_A.field_Gb.field_z - var8;
                  if (bn.field_b) {
                    tn.field_A.field_Gb.field_z = var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                tn.field_A.field_Gb.field_I = var7 - tn.field_A.field_Gb.field_z;
                if (!bn.field_b) {
                  L3: {
                    if (!sq.field_N) {
                      break L3;
                    } else {
                      if (null != lj.field_v) {
                        sp.field_h = true;
                        break L3;
                      } else {
                        var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                        if (sp.field_h) {
                          L4: {
                            tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                            tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                            if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                              stackIn_65_0 = 0;
                              break L4;
                            } else {
                              stackIn_65_0 = 1;
                              break L4;
                            }
                          }
                          sp.field_h = stackIn_65_0 != 0;
                          return (ka) (var4);
                        } else {
                          L5: {
                            tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                            if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                              stackIn_61_0 = 0;
                              break L5;
                            } else {
                              stackIn_61_0 = 1;
                              break L5;
                            }
                          }
                          sp.field_h = stackIn_61_0 != 0;
                          return (ka) (var4);
                        }
                      }
                    }
                  }
                  var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                  if (sp.field_h) {
                    L6: {
                      tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                      tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                      if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                        stackIn_76_0 = 0;
                        break L6;
                      } else {
                        stackIn_76_0 = 1;
                        break L6;
                      }
                    }
                    sp.field_h = stackIn_76_0 != 0;
                    return (ka) (var4);
                  } else {
                    L7: {
                      tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                      if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                        stackIn_72_0 = 0;
                        break L7;
                      } else {
                        stackIn_72_0 = 1;
                        break L7;
                      }
                    }
                    sp.field_h = stackIn_72_0 != 0;
                    return (ka) (var4);
                  }
                } else {
                  tn.field_A.field_Gb.field_mb = 0;
                  bn.field_b = false;
                  tn.field_A.field_Gb.field_Q = -tn.field_A.field_Gb.field_z + tn.field_A.field_Jb.field_z;
                  sp.field_h = true;
                  if (sq.field_N) {
                    L8: {
                      if (null != lj.field_v) {
                        sp.field_h = true;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                    if (!sp.field_h) {
                      L9: {
                        tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                        if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                          stackIn_53_0 = 0;
                          break L9;
                        } else {
                          stackIn_53_0 = 1;
                          break L9;
                        }
                      }
                      sp.field_h = stackIn_53_0 != 0;
                      return (ka) (var4);
                    } else {
                      L10: {
                        tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                        tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                        if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                          stackIn_49_0 = 0;
                          break L10;
                        } else {
                          stackIn_49_0 = 1;
                          break L10;
                        }
                      }
                      sp.field_h = stackIn_49_0 != 0;
                      return (ka) (var4);
                    }
                  } else {
                    var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                    if (sp.field_h) {
                      L11: {
                        tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                        tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                        if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                          stackIn_40_0 = 0;
                          break L11;
                        } else {
                          stackIn_40_0 = 1;
                          break L11;
                        }
                      }
                      sp.field_h = stackIn_40_0 != 0;
                      return (ka) (var4);
                    } else {
                      L12: {
                        tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                        if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                          stackIn_36_0 = 0;
                          break L12;
                        } else {
                          stackIn_36_0 = 1;
                          break L12;
                        }
                      }
                      sp.field_h = stackIn_36_0 != 0;
                      return (ka) (var4);
                    }
                  }
                }
              } else {
                var9_ref_ka = uk.field_M[var8];
                if (var9_ref_ka.field_q != null) {
                  tn.field_A.field_Gb.a((byte) 50, var9_ref_ka.field_q);
                  var9_ref_ka.field_q.a(param2, var7, var9_ref_ka.field_q.e(0), param3, -3344);
                  var7 = var7 + param2;
                  if (0 != var9_ref_ka.field_q.field_T) {
                    var4 = var9_ref_ka;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L13: {
              var8_ref_ka = uk.field_M[var7];
              var9 = 0;
              if (nh.field_m) {
                break L13;
              } else {
                if (var5 >= sj.field_m) {
                  break L13;
                } else {
                  var10 = ga.a(var8_ref_ka.field_l, true);
                  if (var8_ref_ka.a(true) >= var10) {
                    L14: {
                      if (var8_ref_ka.field_k) {
                        break L14;
                      } else {
                        if (hp.a(var8_ref_ka.field_e, 1020)) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var9 = 1;
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
            }
            if (var9 != 0) {
              L15: {
                if (var8_ref_ka.field_q == null) {
                  break L15;
                } else {
                  if (bn.field_b) {
                    break L15;
                  } else {
                    var5++;
                    var7--;
                    continue L0;
                  }
                }
              }
              L16: {
                if (null != var8_ref_ka.field_q) {
                  break L16;
                } else {
                  id.field_D = id.field_D + 1;
                  break L16;
                }
              }
              var10_ref_String = bh.a(-126, var8_ref_ka);
              var11 = var10_ref_String + fm.c(var8_ref_ka.field_d);
              var12 = cj.a(var8_ref_ka, (byte) -63);
              var8_ref_ka.field_q = new cj(0L, qq.field_f, var11);
              var6 = var6 + param2;
              var8_ref_ka.field_q.field_xb = (8355711 & qq.field_f.field_xb >> -31419391) + var12 + -((var12 & 16711422) >> -781614975);
              var8_ref_ka.field_q.field_ob = (8355711 & qq.field_f.field_ob >> 310266561) + (var12 - ((var12 & 16711422) >> 2031205889));
              var8_ref_ka.field_q.field_yb = w.field_A;
              var8_ref_ka.field_q.field_M = var12;
              var5++;
              var7--;
              continue L0;
            } else {
              var8_ref_ka.field_q = null;
              var7--;
              continue L0;
            }
          }
        }
    }

    km(j param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, pa.g((byte) 120));
        try {
            this.field_bb = param1;
            this.field_Y = param0;
            this.b(param2, param3, 28972, param4, param5);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "km.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_W = new ao(4, 1, 1, 1);
        field_cb = 480;
    }
}

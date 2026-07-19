/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class stellarshard extends rb implements cf {
    private int field_M;
    private int field_O;
    private pi field_H;
    private int[] field_P;
    static int field_T;
    private int[] field_N;
    private int field_R;
    private int field_J;
    static th field_E;
    private pb field_F;
    private int[] field_S;
    static int[] field_U;
    private pb field_G;
    private int field_I;
    private int field_Q;
    static String[] field_L;
    static boolean field_K;
    public static int field_B;

    public static void r(int param0) {
        field_U = null;
        if (param0 != 50) {
            return;
        }
        try {
            field_L = null;
            field_E = null;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "stellarshard.DB(" + param0 + ')');
        }
    }

    public final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 16711680) {
                break L1;
              } else {
                this.p(2);
                break L1;
              }
            }
            stackOut_3_0 = 16711680;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "stellarshard.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public final int[] a(boolean param0, int param1, float param2) {
        RuntimeException var4 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        int[] stackOut_1_0 = null;
        try {
          L0: {
            if (param0) {
              stackOut_3_0 = mf.field_a[param1].field_z;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (int[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var4), "stellarshard.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 7152) {
                break L1;
              } else {
                this.field_H = (pi) null;
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "stellarshard.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    private final void k(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        try {
          L0: {
            L1: {
              if (0 != te.field_c) {
                break L1;
              } else {
                if (0 != tl.field_a) {
                  break L1;
                } else {
                  if (tf.field_a.a(0)) {
                    oa.field_D = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (ah.a(-1)) {
                L3: {
                  na.field_j = new ij((stellarshard) (this));
                  if (te.field_c > 0) {
                    break L3;
                  } else {
                    if (0 < tl.field_a) {
                      break L3;
                    } else {
                      if (tf.field_a.a(0)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                tl.field_c = 5;
                break L2;
              } else {
                L4: {
                  this.c(127, te.field_c);
                  oc.field_d = false;
                  cl.field_a = cl.field_a + te.field_c;
                  if ((tl.field_a ^ -1) >= -1) {
                    break L4;
                  } else {
                    oc.field_d = true;
                    break L4;
                  }
                }
                L5: {
                  if (mk.field_k <= 0) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L5;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_20_0 = stackOut_17_0;
                    break L5;
                  }
                }
                oa.field_D = stackIn_20_0 != 0;
                te.field_c = 0;
                break L2;
              }
            }
            L6: {
              s.field_i = false;
              ll.a(16);
              nc.field_H = 0;
              var2_int = -73 % ((param0 - 31) / 34);
              if (fe.field_e) {
                ll.field_c.a(sb.field_e[19], 100, pk.field_h * 2);
                break L6;
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.BB(" + param0 + ')');
        }
    }

    private final void q(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (pk.a(-12663, 0)) {
                if (0.004 <= Math.random()) {
                  break L1;
                } else {
                  var2_int = (int)(9.0 * Math.random()) + 42;
                  if (fe.field_e) {
                    ll.field_c.a(sb.field_e[var2_int], 50 + (int)(Math.random() * 50.0), 2 * pk.field_h);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 50) {
                break L2;
              } else {
                field_E = (th) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.VA(" + param0 + ')');
        }
    }

    public final boolean a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 >= 65) {
                break L1;
              } else {
                this.a(false, (byte) 48);
                break L1;
              }
            }
            stackOut_3_0 = 1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "stellarshard.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    private final void p(int param0) {
        RuntimeException var2 = null;
        double var2_double = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        int var20 = 0;
        int[] var21 = null;
        int[] var22 = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        double var28_double = 0.0;
        int var28 = 0;
        int var29 = 0;
        double var30_double = 0.0;
        int var30 = 0;
        int var31 = 0;
        double var32_double = 0.0;
        int var32 = 0;
        double var34 = 0.0;
        double var36 = 0.0;
        double var38 = 0.0;
        double var40 = 0.0;
        int var42 = 0;
        RuntimeException decompiledCaughtException = null;
        var42 = field_B;
        try {
          L0: {
            L1: {
              cc.a();
              this.field_H.a(sk.field_a, 8);
              var2_double = sk.field_a[3];
              var4 = sk.field_a[4];
              if (param0 > 15) {
                break L1;
              } else {
                field_T = -66;
                break L1;
              }
            }
            var6 = sk.field_a[5];
            var8 = sk.field_a[6];
            var10 = sk.field_a[7];
            var12 = sk.field_a[8];
            var14 = sk.field_a[9];
            var16 = sk.field_a[10];
            var18 = sk.field_a[11];
            var20 = 0;
            L2: while (true) {
              if (-7 >= (var20 ^ -1)) {
                break L0;
              } else {
                var21 = ag.field_b[var20];
                var22 = og.field_d[var20];
                var23 = wd.field_e[var20];
                var24 = th.field_a[var20];
                var25 = el.field_F[var20];
                var26 = lg.field_a[var20];
                var27 = 0;
                L3: while (true) {
                  if (-26 >= (var27 ^ -1)) {
                    var27 = 0;
                    L4: while (true) {
                      if ((var27 ^ -1) <= -5) {
                        var20++;
                        continue L2;
                      } else {
                        var28 = 0;
                        L5: while (true) {
                          if ((var28 ^ -1) <= -5) {
                            var27++;
                            continue L4;
                          } else {
                            L6: {
                              L7: {
                                var29 = 4 * var28 + var27;
                                if (-3 == (var20 ^ -1)) {
                                  break L7;
                                } else {
                                  if (4 == var20) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var29 += 16;
                              break L6;
                            }
                            L8: {
                              if (var20 == 0) {
                                var29 += 32;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              if (-2 == (var20 ^ -1)) {
                                var29 += 48;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var30 = 5 * var28 + var27;
                            var31 = var28 * 5 + (var27 - -1);
                            var32 = 1 + var27 + 5 * (1 + var28);
                            qa.a(uf.field_c, fd.field_qb, uc.field_a, var32, var30, var31, var21, var22, var26, var23, var24);
                            qa.a(0, 2, var29, uf.field_c, fd.field_qb, uc.field_a, var32, var30, var31, 128, 128, 128);
                            var30 = var27 - -(5 * var28);
                            var32 = (1 + var28) * 5 + var27;
                            var31 = (1 + var28) * 5 + (var27 + 1);
                            qa.a(uf.field_c, fd.field_qb, uc.field_a, var32, var30, var31, var21, var22, var25, var23, var26);
                            qa.a(0, 2, var29, uf.field_c, fd.field_qb, uc.field_a, var32, var30, var31, 128, 128, 128);
                            var28++;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    var28_double = nj.field_l[var27] * (double)this.field_P[var25] + ((double)this.field_P[var24] * nj.field_e[var27] + (double)this.field_P[var23] * nj.field_b[var27]) + (double)this.field_P[var26] * nj.field_h[var27];
                    var30_double = nj.field_h[var27] * (double)this.field_N[var26] + (nj.field_b[var27] * (double)this.field_N[var23] + (double)this.field_N[var24] * nj.field_e[var27] + nj.field_l[var27] * (double)this.field_N[var25]);
                    var32_double = nj.field_l[var27] * (double)this.field_S[var25] + (nj.field_e[var27] * (double)this.field_S[var24] + nj.field_b[var27] * (double)this.field_S[var23]) + nj.field_h[var27] * (double)this.field_S[var26];
                    var34 = 384.0 / Math.sqrt(var32_double * var32_double + (var28_double * var28_double + var30_double * var30_double));
                    var36 = var34 * var28_double;
                    var38 = var34 * var30_double;
                    var40 = var32_double * var34;
                    uf.field_c[var27] = (int)(var40 * var14 + (var38 * (var8 * 1.0 + -var2_double * 0.0) + (var8 * 0.0 + 1.0 * var2_double) * var36));
                    fd.field_qb[var27] = (int)((var10 * 0.0 + var4 * 1.0) * var36 + (0.0 * -var4 + var10 * 1.0) * var38 + var40 * var16);
                    uc.field_a[var27] = (int)((var38 * (1.0 * var12 + -var6 * 0.0) + var36 * (var6 * 1.0 + 0.0 * var12) + var18 * var40) * 0.8);
                    var27++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.IB(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        kl var2_ref = null;
        int var3 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        Object stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        Object stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        var3 = field_B;
        try {
          L0: {
            if (param0 >= 21) {
              L1: {
                ac.field_h.a();
                ka.field_m.a();
                stackOut_3_0 = this;
                stackOut_3_1 = 119;
                stackIn_6_0 = stackOut_3_0;
                stackIn_6_1 = stackOut_3_1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                if (s.field_e != null) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_7_1 = stackOut_4_1;
                  stackIn_7_2 = stackOut_4_2;
                  break L1;
                }
              }
              L2: {
                this.b(stackIn_7_1, stackIn_7_2 != 0);
                if (qd.field_h) {
                  this.o(122);
                  qd.field_h = false;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (s.field_e == null) {
                  break L3;
                } else {
                  if (!s.field_e.field_c) {
                    break L3;
                  } else {
                    ke.a(4);
                    nd.a(-26621, s.field_e);
                    s.field_e.a(ic.field_d, -57);
                    qd.field_j.requestFocus();
                    s.field_e = null;
                    break L3;
                  }
                }
              }
              L4: {
                if (!ee.b(122)) {
                  L5: {
                    if (fd.field_mb) {
                      L6: {
                        if (fd.d((byte) -21)) {
                          this.l((byte) -124);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      fd.field_mb = false;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (!hf.field_f) {
                      this.a(true, (byte) -111);
                      break L7;
                    } else {
                      if (be.field_g == null) {
                        if (null == gg.field_f) {
                          if (fd.d((byte) -21)) {
                            L8: {
                              var2_int = vd.a((byte) -61);
                              if (var2_int == 2) {
                                if (s.field_e != null) {
                                  nd.a(-26621, s.field_e);
                                  s.field_e.a(ic.field_d, -15);
                                  s.field_e = null;
                                  qd.field_j.requestFocus();
                                  break L8;
                                } else {
                                  break L8;
                                }
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              if (var2_int == 3) {
                                this.l((byte) -110);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            L10: {
                              if (4 != var2_int) {
                                break L10;
                              } else {
                                wj.h(-128);
                                fd.field_mb = true;
                                break L10;
                              }
                            }
                            break L7;
                          } else {
                            if (!wk.a(113)) {
                              this.d(true);
                              break L7;
                            } else {
                              L11: {
                                stackOut_75_0 = this;
                                stackOut_75_1 = 0;
                                stackIn_80_0 = stackOut_75_0;
                                stackIn_80_1 = stackOut_75_1;
                                stackIn_76_0 = stackOut_75_0;
                                stackIn_76_1 = stackOut_75_1;
                                if (null == s.field_e) {
                                  stackOut_80_0 = this;
                                  stackOut_80_1 = stackIn_80_1;
                                  stackOut_80_2 = 0;
                                  stackIn_81_0 = stackOut_80_0;
                                  stackIn_81_1 = stackOut_80_1;
                                  stackIn_81_2 = stackOut_80_2;
                                  break L11;
                                } else {
                                  stackOut_76_0 = this;
                                  stackOut_76_1 = stackIn_76_1;
                                  stackIn_78_0 = stackOut_76_0;
                                  stackIn_78_1 = stackOut_76_1;
                                  stackOut_78_0 = this;
                                  stackOut_78_1 = stackIn_78_1;
                                  stackOut_78_2 = 1;
                                  stackIn_81_0 = stackOut_78_0;
                                  stackIn_81_1 = stackOut_78_1;
                                  stackIn_81_2 = stackOut_78_2;
                                  break L11;
                                }
                              }
                              L12: {
                                var2_int = oa.a((rb) (this), stackIn_81_1, stackIn_81_2 != 0);
                                if (-2 != (var2_int ^ -1)) {
                                  if (2 == var2_int) {
                                    L13: {
                                      if (null != s.field_e) {
                                        nd.a(-26621, s.field_e);
                                        s.field_e.a(ic.field_d, -15);
                                        s.field_e = null;
                                        qd.field_j.requestFocus();
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    df.a(false, hf.a((byte) -84));
                                    break L12;
                                  } else {
                                    if (-2364825 == (var2_int ^ -1)) {
                                      cj.b(-5);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                } else {
                                  if (null != s.field_e) {
                                    nd.a(-26621, s.field_e);
                                    s.field_e.a(ic.field_d, -71);
                                    s.field_e = null;
                                    qd.field_j.requestFocus();
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              break L7;
                            }
                          }
                        } else {
                          if (gg.field_f.field_m) {
                            L14: {
                              if (of.field_A < gg.field_f.field_s[0]) {
                                of.field_A = gg.field_f.field_s[0];
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            gg.field_f = null;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        if (be.field_g.field_n) {
                          L15: {
                            tl.field_a = tl.field_a & (be.field_g.field_m[0] ^ -1);
                            sd.field_d = sd.field_d | be.field_g.field_m[0];
                            be.field_g = null;
                            if (na.field_j == null) {
                              break L15;
                            } else {
                              if ((tl.field_a ^ -1) == -1) {
                                oc.field_d = false;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                          hi.b((byte) 109);
                          var2_ref = (kl) ((Object) ue.field_c.b(-91));
                          L16: while (true) {
                            if (var2_ref == null) {
                              break L7;
                            } else {
                              tc.a(var2_ref, 4, false);
                              var2_ref = (kl) ((Object) ue.field_c.b((byte) -128));
                              continue L16;
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L17: while (true) {
                    if (!fh.a((byte) 73, i.field_e)) {
                      ue.a((byte) 85, 0);
                      if (!il.e(32525)) {
                        break L4;
                      } else {
                        var2_int = this.f(-16028);
                        if (2 == var2_int) {
                          jj.a(true, 0, 8, 240, 320, 8, 0, (pb[]) null, (pb[]) null, l.field_f.field_N, 0, qj.field_a.field_N, qj.field_a, l.field_f);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      this.h(6476);
                      continue L17;
                    }
                  }
                } else {
                  this.k(-11);
                  if (!vj.a(25424)) {
                    break L4;
                  } else {
                    this.a(false, (byte) -81);
                    break L4;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.LA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 125) {
                break L1;
              } else {
                this.l((byte) -28);
                break L1;
              }
            }
            L2: {
              if (bi.field_u != null) {
                break L2;
              } else {
                L3: {
                  if (-1 <= (param1 ^ -1)) {
                    break L3;
                  } else {
                    if (e.field_c) {
                      break L3;
                    } else {
                      if (ah.a(-1)) {
                        break L3;
                      } else {
                        ue.field_a = param1;
                        bi.field_u = bb.a(5, gg.field_i, cl.field_a, si.field_gb, 3, new int[]{param1}, 65530, 0, qb.field_k);
                        break L2;
                      }
                    }
                  }
                }
                ue.field_a = 0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "stellarshard.AB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        float var6_float = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = field_B;
        try {
          L0: {
            this.a(8, 0, 10, 6, false, 10, (byte) -7, 9);
            cc.b(0.800000011920929f);
            cc.a();
            cc.field_f = false;
            eh.field_e = new int[256];
            var2_array = new int[256];
            var3 = new int[256];
            var4 = new int[256];
            var5 = 0;
            L1: while (true) {
              if (var5 >= eh.field_e.length) {
                this.field_H = new pi();
                sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 1.0);
                this.field_H.a(sg.field_a, 19);
                sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.5);
                this.field_H.a(sg.field_a, 103);
                ea.field_m = new pb(80, 160);
                ea.field_m.e();
                var5 = 0;
                var6_float = 0.0f;
                L2: while (true) {
                  if (20.0f <= var6_float) {
                    var6_float = 20.0f;
                    L3: while (true) {
                      if (var6_float > 40.0f) {
                        pd.field_h.a((byte) -107);
                        ei.field_D = new pb[12];
                        fk.field_k = new int[48];
                        var5 = 0;
                        L4: while (true) {
                          if ((var5 ^ -1) <= -13) {
                            lc.field_k = new pb(640, 480);
                            lc.field_k.e();
                            var5 = 0;
                            L5: while (true) {
                              if ((var5 ^ -1) <= -257) {
                                pd.field_h.a((byte) -107);
                                ba.a(22050, false, 10);
                                ac.field_h = ba.a(ic.field_d, (java.awt.Component) ((Object) qd.field_j), 0, 512);
                                ka.field_m = ba.a(ic.field_d, (java.awt.Component) ((Object) qd.field_j), 1, 22050);
                                ll.field_c = new hl();
                                nj.field_o = new hl();
                                ac.field_h.a(ll.field_c);
                                ka.field_m.a(nj.field_o);
                                fe.field_e = param0;
                                s.field_i = false;
                                wh.field_c = 0;
                                ke.field_a = 16777215;
                                kg.field_D = 255;
                                al.field_c = 0;
                                jg.field_pb = 512;
                                ll.a(16);
                                tc.field_r = 0;
                                qi.field_a = 0;
                                cc.a((cf) (this));
                                this.a(true, -113, false, false, true);
                                break L0;
                              } else {
                                L6: {
                                  var6 = (int)(Math.random() * 112.0 + 16.0);
                                  var7 = (int)(640.0 * Math.random() - (double)var6);
                                  var8 = (int)(480.0 * Math.random() - (double)var6);
                                  var9 = eh.field_e;
                                  var10 = (int)(4.0 * Math.random());
                                  if (1 == var10) {
                                    var9 = var2_array;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                L7: {
                                  if ((var10 ^ -1) != -3) {
                                    break L7;
                                  } else {
                                    var9 = var3;
                                    break L7;
                                  }
                                }
                                L8: {
                                  if (var10 != 3) {
                                    break L8;
                                  } else {
                                    var9 = var4;
                                    break L8;
                                  }
                                }
                                var11 = 0;
                                L9: while (true) {
                                  if (4 <= var11) {
                                    var5++;
                                    continue L5;
                                  } else {
                                    L10: {
                                      ti.a(var7 << 1540194404, var8 << 1687099620, var6 << -412111996, -var6 + 128, var9);
                                      if (0 == var11) {
                                        var7 += 640;
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      if (1 != var11) {
                                        break L11;
                                      } else {
                                        var8 += 480;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      if (-3 == (var11 ^ -1)) {
                                        var7 -= 640;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    var11++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            fk.field_k[0 + var5 * 4] = (int)(640.0 * Math.random()) << -848692028;
                            fk.field_k[var5 * 4 - -1] = (int)(Math.random() * 480.0) << 1186934916;
                            fk.field_k[2 + var5 * 4] = (int)(33.0 * Math.random() - 16.0);
                            fk.field_k[3 + 4 * var5] = (int)(33.0 * Math.random() - 16.0);
                            ei.field_D[var5] = new pb(256, 256);
                            ei.field_D[var5].e();
                            var6 = 0;
                            L13: while (true) {
                              if (var6 >= 4) {
                                var5++;
                                continue L4;
                              } else {
                                var7 = (int)(64.0 * Math.random() + 64.0);
                                var8 = (int)(Math.random() * (double)((128 - var7) * 2) + (double)var7);
                                var9_int = (int)(Math.random() * (double)(2 * (-var7 + 128)) + (double)var7);
                                ti.a(var8 << 712095268, var9_int << -78655388, var7 << -496645788, -var7 + 128, eh.field_e);
                                var6++;
                                continue L13;
                              }
                            }
                          }
                        }
                      } else {
                        var5 = (int)(40.0f - (var6_float - 20.0f) * (var6_float - 20.0f) / 20.0f);
                        ti.e(40, (int)(120.0f - var6_float * 2.0f), var5, 1 | (int)(16.0 * Math.random()) * 1052688);
                        var6_float = (float)((double)var6_float + 0.1);
                        continue L3;
                      }
                    }
                  } else {
                    var5 = (int)(-((-var6_float + 20.0f) * (-var6_float + 20.0f) / 20.0f) + 40.0f);
                    ti.e(40, (int)(-(var6_float * 2.0f) + 120.0f), var5, (int)(Math.random() * 16.0) * 1052688 | 1);
                    var6_float = (float)((double)var6_float + 0.1);
                    continue L2;
                  }
                }
              } else {
                eh.field_e[var5] = 65793 * var5;
                var2_array[var5] = var5 * 256;
                var3[var5] = var5 * 1;
                var4[var5] = 65536 * var5;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.GA(" + param0 + ')');
        }
    }

    final void m(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              a.field_h[pl.e((byte) 63)] = new qe(-1);
              ue.field_a = 0;
              bi.field_u = null;
              cl.field_a = cl.field_a + te.field_c;
              s.field_i = true;
              if (qi.field_a > 10) {
                e.field_e = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 127) {
                break L2;
              } else {
                this.a(false);
                break L2;
              }
            }
            L3: {
              vh.field_e = 0;
              ta.field_p = 0;
              nc.field_H = 3;
              te.field_c = 0;
              sj.field_K = 0;
              gh.field_b = 250;
              sf.field_b = 0;
              ua.field_d = 0;
              this.field_R = 255;
              mg.field_t = qi.field_a;
              nc.field_A = 0;
              tb.field_K = 0;
              sd.field_b = 0;
              if (qi.field_a > 20) {
                e.field_e = 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-31 <= (qi.field_a ^ -1)) {
                break L4;
              } else {
                e.field_e = 1;
                break L4;
              }
            }
            L5: {
              gf.field_c = 0;
              lh.field_d = lh.field_d - 1;
              if (-41 <= (qi.field_a ^ -1)) {
                break L5;
              } else {
                e.field_e = 3;
                break L5;
              }
            }
            ml.field_h = 0;
            q.field_a = qi.field_a;
            ag.field_a = 0;
            hk.field_p = hk.field_p - ed.field_b;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.HB(" + param0 + ')');
        }
    }

    private final void d(boolean param0) {
        int fieldTemp$9 = 0;
        gg discarded$10 = null;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        pi var2_ref = null;
        vl var2_ref2 = null;
        pi var3_ref_pi = null;
        int var3 = 0;
        int var4 = 0;
        vl var4_ref_vl = null;
        int var5 = 0;
        double var5_double = 0.0;
        int var6 = 0;
        double var6_double = 0.0;
        qe var6_ref_qe = null;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        qe var10 = null;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        int stackIn_259_0 = 0;
        int stackIn_259_1 = 0;
        int stackIn_353_0 = 0;
        int stackIn_355_0 = 0;
        int stackIn_357_0 = 0;
        int stackIn_358_0 = 0;
        int stackIn_358_1 = 0;
        qe stackIn_398_0 = null;
        double stackIn_398_1 = 0.0;
        double stackIn_398_2 = 0.0;
        qe stackIn_400_0 = null;
        double stackIn_400_1 = 0.0;
        double stackIn_400_2 = 0.0;
        qe stackIn_402_0 = null;
        double stackIn_402_1 = 0.0;
        double stackIn_402_2 = 0.0;
        qe stackIn_403_0 = null;
        double stackIn_403_1 = 0.0;
        double stackIn_403_2 = 0.0;
        double stackIn_403_3 = 0.0;
        qe stackIn_404_0 = null;
        double stackIn_404_1 = 0.0;
        double stackIn_404_2 = 0.0;
        qe stackIn_406_0 = null;
        double stackIn_406_1 = 0.0;
        double stackIn_406_2 = 0.0;
        qe stackIn_407_0 = null;
        double stackIn_407_1 = 0.0;
        double stackIn_407_2 = 0.0;
        double stackIn_407_3 = 0.0;
        vl stackIn_423_0 = null;
        vl stackIn_423_1 = null;
        vl stackIn_425_0 = null;
        vl stackIn_425_1 = null;
        vl stackIn_426_0 = null;
        vl stackIn_426_1 = null;
        vl stackIn_427_0 = null;
        vl stackIn_427_1 = null;
        int stackIn_427_2 = 0;
        vl stackIn_436_0 = null;
        vl stackIn_436_1 = null;
        vl stackIn_438_0 = null;
        vl stackIn_438_1 = null;
        vl stackIn_439_0 = null;
        vl stackIn_439_1 = null;
        vl stackIn_440_0 = null;
        vl stackIn_440_1 = null;
        int stackIn_440_2 = 0;
        gd stackIn_465_0 = null;
        int stackIn_465_1 = 0;
        gd stackIn_467_0 = null;
        int stackIn_467_1 = 0;
        gd stackIn_469_0 = null;
        int stackIn_469_1 = 0;
        gd stackIn_470_0 = null;
        int stackIn_470_1 = 0;
        int stackIn_470_2 = 0;
        gd stackIn_472_0 = null;
        int stackIn_472_1 = 0;
        gd stackIn_474_0 = null;
        int stackIn_474_1 = 0;
        gd stackIn_476_0 = null;
        int stackIn_476_1 = 0;
        gd stackIn_477_0 = null;
        int stackIn_477_1 = 0;
        int stackIn_477_2 = 0;
        int stackIn_488_0 = 0;
        int stackIn_514_0 = 0;
        int stackIn_960_0 = 0;
        int stackIn_962_0 = 0;
        int stackIn_962_1 = 0;
        int stackIn_981_0 = 0;
        qe stackIn_1057_0 = null;
        int stackIn_1064_0 = 0;
        vl stackIn_1134_0 = null;
        Object stackIn_1175_0 = null;
        vl stackIn_1175_1 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_257_0 = 0;
        int stackOut_257_1 = 0;
        int stackOut_352_0 = 0;
        int stackOut_357_0 = 0;
        int stackOut_357_1 = 0;
        int stackOut_353_0 = 0;
        int stackOut_355_0 = 0;
        int stackOut_355_1 = 0;
        qe stackOut_397_0 = null;
        double stackOut_397_1 = 0.0;
        double stackOut_397_2 = 0.0;
        qe stackOut_402_0 = null;
        double stackOut_402_1 = 0.0;
        double stackOut_402_2 = 0.0;
        double stackOut_402_3 = 0.0;
        qe stackOut_398_0 = null;
        double stackOut_398_1 = 0.0;
        double stackOut_398_2 = 0.0;
        qe stackOut_400_0 = null;
        double stackOut_400_1 = 0.0;
        double stackOut_400_2 = 0.0;
        double stackOut_400_3 = 0.0;
        qe stackOut_403_0 = null;
        double stackOut_403_1 = 0.0;
        double stackOut_403_2 = 0.0;
        qe stackOut_406_0 = null;
        double stackOut_406_1 = 0.0;
        double stackOut_406_2 = 0.0;
        double stackOut_406_3 = 0.0;
        qe stackOut_404_0 = null;
        double stackOut_404_1 = 0.0;
        double stackOut_404_2 = 0.0;
        double stackOut_404_3 = 0.0;
        vl stackOut_435_0 = null;
        vl stackOut_435_1 = null;
        vl stackOut_439_0 = null;
        vl stackOut_439_1 = null;
        int stackOut_439_2 = 0;
        vl stackOut_436_0 = null;
        vl stackOut_436_1 = null;
        vl stackOut_438_0 = null;
        vl stackOut_438_1 = null;
        int stackOut_438_2 = 0;
        vl stackOut_422_0 = null;
        vl stackOut_422_1 = null;
        vl stackOut_426_0 = null;
        vl stackOut_426_1 = null;
        int stackOut_426_2 = 0;
        vl stackOut_423_0 = null;
        vl stackOut_423_1 = null;
        vl stackOut_425_0 = null;
        vl stackOut_425_1 = null;
        int stackOut_425_2 = 0;
        gd stackOut_471_0 = null;
        int stackOut_471_1 = 0;
        gd stackOut_476_0 = null;
        int stackOut_476_1 = 0;
        int stackOut_476_2 = 0;
        gd stackOut_472_0 = null;
        int stackOut_472_1 = 0;
        gd stackOut_474_0 = null;
        int stackOut_474_1 = 0;
        int stackOut_474_2 = 0;
        gd stackOut_464_0 = null;
        int stackOut_464_1 = 0;
        gd stackOut_469_0 = null;
        int stackOut_469_1 = 0;
        int stackOut_469_2 = 0;
        gd stackOut_465_0 = null;
        int stackOut_465_1 = 0;
        gd stackOut_467_0 = null;
        int stackOut_467_1 = 0;
        int stackOut_467_2 = 0;
        int stackOut_487_0 = 0;
        int stackOut_485_0 = 0;
        int stackOut_513_0 = 0;
        int stackOut_511_0 = 0;
        int stackOut_958_0 = 0;
        int stackOut_960_0 = 0;
        int stackOut_960_1 = 0;
        int stackOut_980_0 = 0;
        int stackOut_978_0 = 0;
        qe stackOut_1055_0 = null;
        int stackOut_1061_0 = 0;
        int stackOut_1063_0 = 0;
        Object stackOut_1173_0 = null;
        vl stackOut_1173_1 = null;
        vl stackOut_1132_0 = null;
        var15 = field_B;
        try {
          L0: {
            L1: {
              L2: {
                if (ni.field_e != this.field_Q) {
                  break L2;
                } else {
                  if (eb.field_a != this.field_O) {
                    break L2;
                  } else {
                    if (0 == gh.field_c) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_Q = ni.field_e;
              v.field_e = true;
              this.field_O = eb.field_a;
              ld.field_F = -1;
              break L1;
            }
            L3: {
              if (!si.field_jb[98]) {
                break L3;
              } else {
                ld.field_F = 0;
                v.field_e = false;
                break L3;
              }
            }
            L4: {
              if (!si.field_jb[99]) {
                break L4;
              } else {
                ld.field_F = 1;
                v.field_e = false;
                break L4;
              }
            }
            L5: {
              ki.field_s = ki.field_s + 1;
              if (!si.field_jb[84]) {
                break L5;
              } else {
                v.field_e = false;
                break L5;
              }
            }
            L6: {
              qb.field_k = qb.field_k + 1;
              lg.field_f = lg.field_f - 1;
              hk.field_p = hk.field_p + 1;
              if (10 >= ki.field_s) {
                break L6;
              } else {
                ki.field_s = 0;
                break L6;
              }
            }
            L7: {
              if ((qi.field_a ^ -1) >= -2) {
                break L7;
              } else {
                if ((this.field_J ^ -1) < -1) {
                  this.field_J = this.field_J - 1;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              cl.field_a = cl.field_a + 1;
              if (0 != gh.field_c) {
                qb.field_k = qb.field_k - gg.field_i;
                si.field_gb = si.field_gb + 1;
                hk.field_p = hk.field_p + lh.field_d;
                ed.field_b = ed.field_b + 1;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (null == hf.field_i.b(-97)) {
                break L9;
              } else {
                fieldTemp$9 = this.field_I + 1;
                this.field_I = this.field_I + 1;
                if (fieldTemp$9 != 335) {
                  break L9;
                } else {
                  this.field_I = 0;
                  discarded$10 = hf.field_i.d((byte) -35);
                  break L9;
                }
              }
            }
            L10: {
              if (af.field_o <= 0) {
                break L10;
              } else {
                af.field_o = af.field_o - 1;
                break L10;
              }
            }
            L11: {
              if (0 >= og.field_a) {
                break L11;
              } else {
                og.field_a = og.field_a - 1;
                break L11;
              }
            }
            L12: {
              fieldTemp$11 = bf.field_c;
              bf.field_c = bf.field_c + 1;
              if ((fieldTemp$11 ^ -1) >= (qj.field_a.b(sj.field_C) ^ -1)) {
                break L12;
              } else {
                bf.field_c = bf.field_c - qj.field_a.b(sj.field_C) * 2;
                break L12;
              }
            }
            L13: {
              if (0 < this.field_R) {
                this.field_R = this.field_R / 2;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (this.field_R <= 0) {
                break L14;
              } else {
                this.field_R = this.field_R - 1;
                break L14;
              }
            }
            L15: {
              if (null == na.field_j) {
                break L15;
              } else {
                L16: {
                  if (s.field_i) {
                    break L16;
                  } else {
                    sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 0.001);
                    this.field_H.a(sg.field_a, -127);
                    sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.0005);
                    this.field_H.a(sg.field_a, -125);
                    break L16;
                  }
                }
                L17: {
                  if (null == gj.field_r) {
                    break L17;
                  } else {
                    if ((og.field_a ^ -1) >= -1) {
                      og.field_a = 25;
                      gj.field_r.b(25, 0);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
                L18: {
                  if ((tl.field_c ^ -1) == -9) {
                    L19: {
                      var2_int = qc.a((byte) -115, true);
                      if (3 != var2_int) {
                        break L19;
                      } else {
                        qd.a(hf.a((byte) -68), (byte) -30);
                        break L19;
                      }
                    }
                    if (var2_int != 1) {
                      if ((var2_int ^ -1) != -3) {
                        break L18;
                      } else {
                        tl.field_c = 0;
                        na.field_j.field_l = -1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      na.field_j.field_l = 0;
                      tl.field_c = 0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L18;
                  }
                }
                L20: {
                  if ((tl.field_c ^ -1) != -4) {
                    break L20;
                  } else {
                    if (gh.field_c == 1) {
                      if (0 != (na.field_j.field_r ^ -1)) {
                        if (na.field_j.field_u == na.field_j.field_r) {
                          na.field_j.field_u = -1;
                          break L20;
                        } else {
                          na.field_j.field_u = na.field_j.field_r;
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                }
                L21: {
                  if (qi.field_a > na.field_j.field_t) {
                    na.field_j.field_p = na.field_j.field_p + 1;
                    if (10 < na.field_j.field_p) {
                      na.field_j.field_t = na.field_j.field_t + 1;
                      na.field_j.field_p = na.field_j.field_p - 10;
                      break L21;
                    } else {
                      break L21;
                    }
                  } else {
                    if (4 == tl.field_c) {
                      L22: {
                        na.field_j.field_p = na.field_j.field_p + 1;
                        if ((na.field_j.field_p ^ -1) >= -51) {
                          break L22;
                        } else {
                          na.field_j.field_p = na.field_j.field_p - 50;
                          na.field_j.field_s = na.field_j.field_s - 1;
                          break L22;
                        }
                      }
                      if (-1 <= (na.field_j.field_s ^ -1)) {
                        L23: {
                          gh.field_d = null;
                          tl.field_c = 2;
                          na.field_j.field_l = 9;
                          if (-1 > (tl.field_a ^ -1)) {
                            tl.field_c = 3;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        n.field_L = 256;
                        break L21;
                      } else {
                        break L21;
                      }
                    } else {
                      break L21;
                    }
                  }
                }
                L24: {
                  if (tl.field_c == 0) {
                    var2_int = 0;
                    L25: while (true) {
                      if (var2_int >= 9) {
                        if (-3 < (ph.field_D ^ -1)) {
                          break L24;
                        } else {
                          L26: {
                            if (si.field_jb[16]) {
                              this.field_H.field_b = 1.0;
                              var2_ref = this.field_H;
                              var3_ref_pi = this.field_H;
                              this.field_H.field_a = 0.0;
                              var2_ref.field_d = 0.0;
                              var3_ref_pi.field_c = 0.0;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          L27: {
                            if (si.field_jb[17]) {
                              this.field_H.field_b = 0.1513824462890625;
                              this.field_H.field_c = -0.939178466796875;
                              this.field_H.field_a = -0.258941650390625;
                              this.field_H.field_d = -0.949249267578125;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          L28: {
                            if (!si.field_jb[18]) {
                              break L28;
                            } else {
                              this.field_H.field_c = -0.0067138671875;
                              this.field_H.field_a = -0.82244873046875;
                              this.field_H.field_b = 0.13287353515625;
                              this.field_H.field_d = -0.552978515625;
                              break L28;
                            }
                          }
                          L29: {
                            if (si.field_jb[19]) {
                              this.field_H.field_d = -0.846764809241;
                              this.field_H.field_b = 0.26812744140625;
                              this.field_H.field_a = 0.4404144287109375;
                              this.field_H.field_c = 0.130889892578125;
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                          L30: {
                            if (si.field_jb[20]) {
                              this.field_H.field_b = 0.7213134765625;
                              this.field_H.field_c = 0.5408782958984375;
                              this.field_H.field_a = -0.334014892578125;
                              this.field_H.field_d = 0.2748870849609375;
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          if (si.field_jb[21]) {
                            this.field_H.field_d = -0.5489211794018304;
                            this.field_H.field_a = -0.49565616706475396;
                            this.field_H.field_b = -0.6729829114278874;
                            this.field_H.field_c = -0.010222709116862912;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                      } else {
                        L31: {
                          if (na.field_j.field_l != var2_int) {
                            nj.field_f[var2_int] = 0 + nj.field_f[var2_int] * 15 >> -684140508;
                            break L31;
                          } else {
                            nj.field_f[var2_int] = nj.field_f[var2_int] * 15 - -64 >> -1454863004;
                            break L31;
                          }
                        }
                        var2_int++;
                        continue L25;
                      }
                    }
                  } else {
                    break L24;
                  }
                }
                L32: {
                  if (tl.field_c == 4) {
                    var2_int = 8;
                    L33: while (true) {
                      if (-10 >= (var2_int ^ -1)) {
                        break L32;
                      } else {
                        L34: {
                          if (var2_int == na.field_j.field_l) {
                            nj.field_f[var2_int] = 64 + nj.field_f[var2_int] * 15 >> -1379369532;
                            break L34;
                          } else {
                            nj.field_f[var2_int] = 0 + 15 * nj.field_f[var2_int] >> -2026623196;
                            break L34;
                          }
                        }
                        var2_int++;
                        continue L33;
                      }
                    }
                  } else {
                    break L32;
                  }
                }
                L35: {
                  if ((tl.field_c ^ -1) == -2) {
                    var2_int = 9;
                    L36: while (true) {
                      if (var2_int >= 10) {
                        break L35;
                      } else {
                        L37: {
                          if ((var2_int ^ -1) == (na.field_j.field_l ^ -1)) {
                            nj.field_f[var2_int] = 64 + nj.field_f[var2_int] * 15 >> -1291897628;
                            break L37;
                          } else {
                            nj.field_f[var2_int] = nj.field_f[var2_int] * 15 - 0 >> 344090308;
                            break L37;
                          }
                        }
                        var2_int++;
                        continue L36;
                      }
                    }
                  } else {
                    break L35;
                  }
                }
                L38: {
                  if (2 != tl.field_c) {
                    break L38;
                  } else {
                    var2_int = 8;
                    var3 = var2_int;
                    L39: while (true) {
                      if (10 <= var3) {
                        break L38;
                      } else {
                        L40: {
                          if ((na.field_j.field_l ^ -1) == (var3 ^ -1)) {
                            nj.field_f[var3] = nj.field_f[var3] * 15 - -64 >> -1495521532;
                            break L40;
                          } else {
                            nj.field_f[var3] = 0 + 15 * nj.field_f[var3] >> -1540175100;
                            break L40;
                          }
                        }
                        var3++;
                        continue L39;
                      }
                    }
                  }
                }
                L41: {
                  if ((tl.field_c ^ -1) == -4) {
                    L42: {
                      var2_int = 8;
                      if (ah.a(-1)) {
                        break L42;
                      } else {
                        if (oc.field_d) {
                          break L42;
                        } else {
                          var2_int = 9;
                          break L42;
                        }
                      }
                    }
                    var3 = var2_int;
                    L43: while (true) {
                      if (-11 >= (var3 ^ -1)) {
                        break L41;
                      } else {
                        L44: {
                          if (na.field_j.field_l != var3) {
                            nj.field_f[var3] = 15 * nj.field_f[var3] + 0 >> -1489526652;
                            break L44;
                          } else {
                            nj.field_f[var3] = 15 * nj.field_f[var3] - -64 >> 914360292;
                            break L44;
                          }
                        }
                        var3++;
                        continue L43;
                      }
                    }
                  } else {
                    break L41;
                  }
                }
                L45: {
                  if (0 < n.field_L) {
                    n.field_L = n.field_L / 2;
                    break L45;
                  } else {
                    break L45;
                  }
                }
                if ((n.field_L ^ -1) >= -1) {
                  break L15;
                } else {
                  n.field_L = n.field_L - 1;
                  break L15;
                }
              }
            }
            L46: {
              if (null == na.field_j) {
                break L46;
              } else {
                if (s.field_i) {
                  L47: while (true) {
                    if (!qh.c(103)) {
                      L48: {
                        if (na.field_j == null) {
                          break L48;
                        } else {
                          stackOut_257_0 = -4;
                          stackOut_257_1 = tl.field_c ^ -1;
                          stackIn_259_0 = stackOut_257_0;
                          stackIn_259_1 = stackOut_257_1;
                          L49: {
                            if (stackIn_259_0 == stackIn_259_1) {
                              break L49;
                            } else {
                              break L49;
                            }
                          }
                          L50: {
                            if ((tl.field_c ^ -1) == -3) {
                              break L50;
                            } else {
                              break L50;
                            }
                          }
                          L51: {
                            if (-2 == (tl.field_c ^ -1)) {
                              break L51;
                            } else {
                              break L51;
                            }
                          }
                          na.field_j.a(true);
                          break L48;
                        }
                      }
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      L52: {
                        if (gi.field_f != 13) {
                          break L52;
                        } else {
                          if (tl.field_c != 0) {
                            break L52;
                          } else {
                            na.field_j = null;
                            break L52;
                          }
                        }
                      }
                      L53: {
                        if (na.field_j == null) {
                          break L53;
                        } else {
                          if (gi.field_f != 13) {
                            break L53;
                          } else {
                            L54: {
                              if ((tl.field_c ^ -1) == -3) {
                                break L54;
                              } else {
                                if (tl.field_c == 1) {
                                  break L54;
                                } else {
                                  if (-4 != (tl.field_c ^ -1)) {
                                    break L53;
                                  } else {
                                    break L54;
                                  }
                                }
                              }
                            }
                            n.field_L = 256;
                            tl.field_c = 0;
                            gh.field_d = null;
                            continue L47;
                          }
                        }
                      }
                      if (null != na.field_j) {
                        na.field_j.b(8);
                        continue L47;
                      } else {
                        continue L47;
                      }
                    }
                  }
                } else {
                  break L46;
                }
              }
            }
            L55: {
              if (0 < ig.field_D) {
                ig.field_D = ig.field_D - 6;
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              if (0 != wh.field_c) {
                break L56;
              } else {
                jg.field_pb = jg.field_pb - 8;
                if (jg.field_pb > 0) {
                  break L56;
                } else {
                  wh.field_c = 1;
                  jg.field_pb = 0;
                  if (!fe.field_e) {
                    break L56;
                  } else {
                    ll.field_c.a(sb.field_e[36], 100, pk.field_h * 2);
                    break L56;
                  }
                }
              }
            }
            L57: {
              if (wh.field_c != 1) {
                break L57;
              } else {
                jg.field_pb = jg.field_pb + 1;
                if ((jg.field_pb ^ -1) <= -37) {
                  jg.field_pb = 0;
                  wh.field_c = 2;
                  break L57;
                } else {
                  break L57;
                }
              }
            }
            L58: {
              if (2 == wh.field_c) {
                jg.field_pb = jg.field_pb + 1;
                if ((jg.field_pb ^ -1) > -31) {
                  break L58;
                } else {
                  wh.field_c = 3;
                  jg.field_pb = 0;
                  break L58;
                }
              } else {
                break L58;
              }
            }
            L59: {
              if (-4 == (wh.field_c ^ -1)) {
                L60: {
                  jg.field_pb = jg.field_pb + 1;
                  if (1 == jg.field_pb) {
                    if (!fe.field_e) {
                      break L60;
                    } else {
                      if (s.field_i) {
                        break L60;
                      } else {
                        ll.field_c.a(sb.field_e[37], 100, pk.field_h * 2);
                        break L60;
                      }
                    }
                  } else {
                    break L60;
                  }
                }
                if (-251 <= (jg.field_pb ^ -1)) {
                  break L59;
                } else {
                  jg.field_pb = 0;
                  wh.field_c = 2;
                  break L59;
                }
              } else {
                break L59;
              }
            }
            L61: {
              if ((al.field_c ^ -1) == (ke.field_a ^ -1)) {
                break L61;
              } else {
                kg.field_D = kg.field_D - 1;
                if (-1 <= (kg.field_D ^ -1)) {
                  kg.field_D = 255;
                  ke.field_a = al.field_c;
                  break L61;
                } else {
                  break L61;
                }
              }
            }
            L62: {
              al.field_c = qi.field_a % 7 * 6912 + qi.field_a % 10 * 19 + 851968 * (qi.field_a % 14);
              if (s.field_i) {
                break L62;
              } else {
                al.field_c = 858899;
                break L62;
              }
            }
            L63: {
              if (-2 == (nc.field_H ^ -1)) {
                L64: {
                  if ((a.field_h[0].field_g ^ -1) > -2) {
                    a.field_h[0].field_g = a.field_h[0].field_g + 1;
                    gh.field_b = gh.field_b - 1;
                    break L64;
                  } else {
                    break L64;
                  }
                }
                if (0 >= gh.field_b) {
                  nc.field_H = 0;
                  break L63;
                } else {
                  break L63;
                }
              } else {
                break L63;
              }
            }
            L65: {
              if (nc.field_H == 2) {
                gh.field_b = gh.field_b - 1;
                if (0 >= gh.field_b) {
                  gh.field_b = 5;
                  nc.field_H = 1;
                  break L65;
                } else {
                  break L65;
                }
              } else {
                break L65;
              }
            }
            L66: {
              if (nc.field_H != 3) {
                break L66;
              } else {
                gh.field_b = gh.field_b - 1;
                if (gh.field_b > 0) {
                  break L66;
                } else {
                  gh.field_b = 5;
                  nc.field_H = 1;
                  break L66;
                }
              }
            }
            L67: {
              if (96 <= tc.field_r) {
                break L67;
              } else {
                tc.field_r = tc.field_r + 1;
                break L67;
              }
            }
            L68: {
              if (nc.field_H != 4) {
                break L68;
              } else {
                gh.field_b = gh.field_b - 1;
                if (0 < gh.field_b) {
                  break L68;
                } else {
                  gh.field_b = 5;
                  nc.field_H = 1;
                  break L68;
                }
              }
            }
            L69: {
              L70: {
                if (null == a.field_h[0]) {
                  break L70;
                } else {
                  if (0 == (a.field_h[0].field_m ^ -1)) {
                    break L69;
                  } else {
                    break L70;
                  }
                }
              }
              L71: {
                stackOut_352_0 = 0;
                stackIn_357_0 = stackOut_352_0;
                stackIn_353_0 = stackOut_352_0;
                if (s.field_i) {
                  stackOut_357_0 = stackIn_357_0;
                  stackOut_357_1 = 0;
                  stackIn_358_0 = stackOut_357_0;
                  stackIn_358_1 = stackOut_357_1;
                  break L71;
                } else {
                  stackOut_353_0 = stackIn_353_0;
                  stackIn_355_0 = stackOut_353_0;
                  stackOut_355_0 = stackIn_355_0;
                  stackOut_355_1 = 1;
                  stackIn_358_0 = stackOut_355_0;
                  stackIn_358_1 = stackOut_355_1;
                  break L71;
                }
              }
              if (stackIn_358_0 != stackIn_358_1) {
                break L69;
              } else {
                this.k((byte) -69);
                break L69;
              }
            }
            L72: {
              if (s.field_i) {
                L73: {
                  L74: {
                    L75: {
                      if (si.field_jb[98]) {
                        break L75;
                      } else {
                        if (4 != nc.field_H) {
                          break L74;
                        } else {
                          break L75;
                        }
                      }
                    }
                    if ((a.field_h[0].field_g ^ -1) < -1) {
                      L76: {
                        stackOut_397_0 = a.field_h[0];
                        stackOut_397_1 = a.field_h[0].field_k;
                        stackOut_397_2 = Math.cos(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                        stackIn_402_0 = stackOut_397_0;
                        stackIn_402_1 = stackOut_397_1;
                        stackIn_402_2 = stackOut_397_2;
                        stackIn_398_0 = stackOut_397_0;
                        stackIn_398_1 = stackOut_397_1;
                        stackIn_398_2 = stackOut_397_2;
                        if (8 != e.field_e) {
                          stackOut_402_0 = (qe) ((Object) stackIn_402_0);
                          stackOut_402_1 = stackIn_402_1;
                          stackOut_402_2 = stackIn_402_2;
                          stackOut_402_3 = 0.1;
                          stackIn_403_0 = stackOut_402_0;
                          stackIn_403_1 = stackOut_402_1;
                          stackIn_403_2 = stackOut_402_2;
                          stackIn_403_3 = stackOut_402_3;
                          break L76;
                        } else {
                          stackOut_398_0 = (qe) ((Object) stackIn_398_0);
                          stackOut_398_1 = stackIn_398_1;
                          stackOut_398_2 = stackIn_398_2;
                          stackIn_400_0 = stackOut_398_0;
                          stackIn_400_1 = stackOut_398_1;
                          stackIn_400_2 = stackOut_398_2;
                          stackOut_400_0 = (qe) ((Object) stackIn_400_0);
                          stackOut_400_1 = stackIn_400_1;
                          stackOut_400_2 = stackIn_400_2;
                          stackOut_400_3 = 0.15;
                          stackIn_403_0 = stackOut_400_0;
                          stackIn_403_1 = stackOut_400_1;
                          stackIn_403_2 = stackOut_400_2;
                          stackIn_403_3 = stackOut_400_3;
                          break L76;
                        }
                      }
                      L77: {
                        stackIn_403_0.field_k = stackIn_403_1 - stackIn_403_2 * stackIn_403_3;
                        stackOut_403_0 = a.field_h[0];
                        stackOut_403_1 = a.field_h[0].field_d;
                        stackOut_403_2 = Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                        stackIn_406_0 = stackOut_403_0;
                        stackIn_406_1 = stackOut_403_1;
                        stackIn_406_2 = stackOut_403_2;
                        stackIn_404_0 = stackOut_403_0;
                        stackIn_404_1 = stackOut_403_1;
                        stackIn_404_2 = stackOut_403_2;
                        if (-9 == (e.field_e ^ -1)) {
                          stackOut_406_0 = (qe) ((Object) stackIn_406_0);
                          stackOut_406_1 = stackIn_406_1;
                          stackOut_406_2 = stackIn_406_2;
                          stackOut_406_3 = 0.15;
                          stackIn_407_0 = stackOut_406_0;
                          stackIn_407_1 = stackOut_406_1;
                          stackIn_407_2 = stackOut_406_2;
                          stackIn_407_3 = stackOut_406_3;
                          break L77;
                        } else {
                          stackOut_404_0 = (qe) ((Object) stackIn_404_0);
                          stackOut_404_1 = stackIn_404_1;
                          stackOut_404_2 = stackIn_404_2;
                          stackOut_404_3 = 0.1;
                          stackIn_407_0 = stackOut_404_0;
                          stackIn_407_1 = stackOut_404_1;
                          stackIn_407_2 = stackOut_404_2;
                          stackIn_407_3 = stackOut_404_3;
                          break L77;
                        }
                      }
                      L78: {
                        stackIn_407_0.field_d = stackIn_407_1 - stackIn_407_2 * stackIn_407_3;
                        if ((nc.field_H ^ -1) != -5) {
                          break L78;
                        } else {
                          a.field_h[0].field_k = a.field_h[0].field_k - 0.1 * Math.cos(3.141592653589793 * (double)a.field_h[0].field_h * 2.0 / 256.0);
                          a.field_h[0].field_d = a.field_h[0].field_d - 0.1 * Math.sin((double)a.field_h[0].field_h * 3.141592653589793 * 2.0 / 256.0);
                          if (!fe.field_e) {
                            break L78;
                          } else {
                            if (-1 > (og.field_a ^ -1)) {
                              break L78;
                            } else {
                              ll.field_c.a(sb.field_e[35], 100, pk.field_h / 2);
                              og.field_a = 7;
                              break L78;
                            }
                          }
                        }
                      }
                      L79: {
                        var2_int = 3;
                        var3 = 5;
                        if ((nc.field_H ^ -1) == -5) {
                          var3 = 10;
                          var2_int = 6;
                          break L79;
                        } else {
                          break L79;
                        }
                      }
                      var5 = 0;
                      L80: while (true) {
                        if (var5 >= var2_int) {
                          if (4 != nc.field_H) {
                            break L73;
                          } else {
                            var5 = 4 * (gh.field_b % 8);
                            L81: while (true) {
                              if (-257 >= (var5 ^ -1)) {
                                break L73;
                              } else {
                                L82: {
                                  stackOut_435_0 = null;
                                  stackOut_435_1 = null;
                                  stackIn_439_0 = stackOut_435_0;
                                  stackIn_439_1 = stackOut_435_1;
                                  stackIn_436_0 = stackOut_435_0;
                                  stackIn_436_1 = stackOut_435_1;
                                  if (nc.field_H == 4) {
                                    stackOut_439_0 = null;
                                    stackOut_439_1 = null;
                                    stackOut_439_2 = 4;
                                    stackIn_440_0 = stackOut_439_0;
                                    stackIn_440_1 = stackOut_439_1;
                                    stackIn_440_2 = stackOut_439_2;
                                    break L82;
                                  } else {
                                    stackOut_436_0 = null;
                                    stackOut_436_1 = null;
                                    stackIn_438_0 = stackOut_436_0;
                                    stackIn_438_1 = stackOut_436_1;
                                    stackOut_438_0 = null;
                                    stackOut_438_1 = null;
                                    stackOut_438_2 = 1;
                                    stackIn_440_0 = stackOut_438_0;
                                    stackIn_440_1 = stackOut_438_1;
                                    stackIn_440_2 = stackOut_438_2;
                                    break L82;
                                  }
                                }
                                L83: {
                                  var4_ref_vl = new vl(stackIn_440_2, a.field_h[0]);
                                  var4_ref_vl.field_q = 16711680;
                                  if (nc.field_H != 4) {
                                    break L83;
                                  } else {
                                    var4_ref_vl.field_p = 10;
                                    var4_ref_vl.field_q = 16776960;
                                    break L83;
                                  }
                                }
                                var4_ref_vl.field_j = var4_ref_vl.field_j + 2.0 * Math.sin(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h + var5)) / 256.0);
                                var4_ref_vl.field_a = var4_ref_vl.field_a + Math.cos(2.0 * ((double)(var5 + a.field_h[0].field_h) * 3.141592653589793) / 256.0) * 2.0;
                                var4_ref_vl.field_a = var4_ref_vl.field_a + a.field_h[0].field_k * 0.8;
                                var4_ref_vl.field_j = var4_ref_vl.field_j + a.field_h[0].field_d * 0.8;
                                var4_ref_vl.field_c = a.field_h[0].field_a;
                                var4_ref_vl.field_k = a.field_h[0].field_l;
                                wk.field_b[eg.a(-67)] = var4_ref_vl;
                                var5 += 32;
                                continue L81;
                              }
                            }
                          }
                        } else {
                          L84: {
                            stackOut_422_0 = null;
                            stackOut_422_1 = null;
                            stackIn_426_0 = stackOut_422_0;
                            stackIn_426_1 = stackOut_422_1;
                            stackIn_423_0 = stackOut_422_0;
                            stackIn_423_1 = stackOut_422_1;
                            if ((nc.field_H ^ -1) != -5) {
                              stackOut_426_0 = null;
                              stackOut_426_1 = null;
                              stackOut_426_2 = 1;
                              stackIn_427_0 = stackOut_426_0;
                              stackIn_427_1 = stackOut_426_1;
                              stackIn_427_2 = stackOut_426_2;
                              break L84;
                            } else {
                              stackOut_423_0 = null;
                              stackOut_423_1 = null;
                              stackIn_425_0 = stackOut_423_0;
                              stackIn_425_1 = stackOut_423_1;
                              stackOut_425_0 = null;
                              stackOut_425_1 = null;
                              stackOut_425_2 = 4;
                              stackIn_427_0 = stackOut_425_0;
                              stackIn_427_1 = stackOut_425_1;
                              stackIn_427_2 = stackOut_425_2;
                              break L84;
                            }
                          }
                          L85: {
                            var4_ref_vl = new vl(stackIn_427_2, a.field_h[0]);
                            var4_ref_vl.field_q = 16711680;
                            if (-5 == (nc.field_H ^ -1)) {
                              var4_ref_vl.field_q = 16776960;
                              var4_ref_vl.field_p = 10;
                              break L85;
                            } else {
                              break L85;
                            }
                          }
                          var4_ref_vl.field_j = var4_ref_vl.field_j + 4.0 * Math.sin(((double)(-var3) + ((double)a.field_h[0].field_h + Math.random() * (double)var3 * 2.0)) * 3.141592653589793 * 2.0 / 256.0);
                          var4_ref_vl.field_a = var4_ref_vl.field_a + 4.0 * Math.cos(2.0 * (((double)(-var3) + ((double)a.field_h[0].field_h + (double)var3 * Math.random() * 2.0)) * 3.141592653589793) / 256.0);
                          var4_ref_vl.field_c = var4_ref_vl.field_j * 4.0 + a.field_h[0].field_a;
                          var4_ref_vl.field_k = var4_ref_vl.field_a * 4.0 + a.field_h[0].field_l;
                          var4_ref_vl.field_a = var4_ref_vl.field_a + a.field_h[0].field_k;
                          var4_ref_vl.field_j = var4_ref_vl.field_j + a.field_h[0].field_d;
                          wk.field_b[eg.a(-87)] = var4_ref_vl;
                          var5++;
                          continue L80;
                        }
                      }
                    } else {
                      break L74;
                    }
                  }
                  if (!si.field_jb[99]) {
                    break L73;
                  } else {
                    if (0 < a.field_h[0].field_g) {
                      L86: {
                        a.field_h[0].field_k = a.field_h[0].field_k + 0.05 * Math.cos(2.0 * ((double)a.field_h[0].field_h * 3.141592653589793) / 256.0);
                        a.field_h[0].field_d = a.field_h[0].field_d + 0.05 * Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                        if (!fe.field_e) {
                          break L86;
                        } else {
                          if (og.field_a <= 0) {
                            ll.field_c.a(sb.field_e[0], 100, pk.field_h / 4);
                            og.field_a = 5;
                            break L86;
                          } else {
                            break L86;
                          }
                        }
                      }
                      var2_int = 3;
                      var3 = 5;
                      var5 = 0;
                      L87: while (true) {
                        if ((var2_int ^ -1) >= (var5 ^ -1)) {
                          var5 = 0;
                          L88: while (true) {
                            if ((var2_int ^ -1) >= (var5 ^ -1)) {
                              break L73;
                            } else {
                              var4_ref_vl = new vl(1, a.field_h[0]);
                              var4_ref_vl.field_q = 16711680;
                              var4_ref_vl.field_j = var4_ref_vl.field_j + 2.0 * Math.sin(2.0 * (3.141592653589793 * ((double)(32 + a.field_h[0].field_h - -128) + 2.0 * ((double)var3 * Math.random()) - (double)var3)) / 256.0);
                              var4_ref_vl.field_a = var4_ref_vl.field_a + 2.0 * Math.cos(((double)(32 + (a.field_h[0].field_h + 128)) + (double)var3 * Math.random() * 2.0 - (double)var3) * 3.141592653589793 * 2.0 / 256.0);
                              var4_ref_vl.field_c = var4_ref_vl.field_j * 4.0 + a.field_h[0].field_a;
                              var4_ref_vl.field_k = 4.0 * var4_ref_vl.field_a + a.field_h[0].field_l;
                              var4_ref_vl.field_j = var4_ref_vl.field_j + a.field_h[0].field_d;
                              var4_ref_vl.field_a = var4_ref_vl.field_a + a.field_h[0].field_k;
                              wk.field_b[eg.a(-53)] = var4_ref_vl;
                              var5++;
                              continue L88;
                            }
                          }
                        } else {
                          var4_ref_vl = new vl(1, a.field_h[0]);
                          var4_ref_vl.field_q = 16711680;
                          var4_ref_vl.field_j = var4_ref_vl.field_j + Math.sin(2.0 * (((double)(96 + a.field_h[0].field_h) + 2.0 * ((double)var3 * Math.random()) - (double)var3) * 3.141592653589793) / 256.0) * 2.0;
                          var4_ref_vl.field_a = var4_ref_vl.field_a + 2.0 * Math.cos(2.0 * (((double)(-var3) + ((double)(-32 + (a.field_h[0].field_h - -128)) + 2.0 * ((double)var3 * Math.random()))) * 3.141592653589793) / 256.0);
                          var4_ref_vl.field_c = var4_ref_vl.field_j * 4.0 + a.field_h[0].field_a;
                          var4_ref_vl.field_k = a.field_h[0].field_l + var4_ref_vl.field_a * 4.0;
                          var4_ref_vl.field_a = var4_ref_vl.field_a + a.field_h[0].field_k;
                          var4_ref_vl.field_j = var4_ref_vl.field_j + a.field_h[0].field_d;
                          wk.field_b[eg.a(-71)] = var4_ref_vl;
                          var5++;
                          continue L87;
                        }
                      }
                    } else {
                      break L73;
                    }
                  }
                }
                L89: {
                  L90: {
                    if (si.field_jb[98]) {
                      break L90;
                    } else {
                      if (si.field_jb[99]) {
                        break L90;
                      } else {
                        if (0 >= a.field_h[0].field_g) {
                          break L90;
                        } else {
                          a.field_h[0].field_d = a.field_h[0].field_d * 0.99;
                          a.field_h[0].field_k = a.field_h[0].field_k * 0.99;
                          if (gj.field_r == null) {
                            break L89;
                          } else {
                            if (0 > og.field_a) {
                              break L89;
                            } else {
                              og.field_a = -1;
                              gj.field_r.b(25, 0);
                              break L89;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (null == gj.field_r) {
                    L91: {
                      gj.field_r = gd.a(sb.field_e[0], 100, 0);
                      gj.field_r.e(-1);
                      ll.field_c.a(gj.field_r);
                      stackOut_471_0 = gj.field_r;
                      stackOut_471_1 = 10;
                      stackIn_476_0 = stackOut_471_0;
                      stackIn_476_1 = stackOut_471_1;
                      stackIn_472_0 = stackOut_471_0;
                      stackIn_472_1 = stackOut_471_1;
                      if (fe.field_e) {
                        stackOut_476_0 = (gd) ((Object) stackIn_476_0);
                        stackOut_476_1 = stackIn_476_1;
                        stackOut_476_2 = pk.field_h / 2;
                        stackIn_477_0 = stackOut_476_0;
                        stackIn_477_1 = stackOut_476_1;
                        stackIn_477_2 = stackOut_476_2;
                        break L91;
                      } else {
                        stackOut_472_0 = (gd) ((Object) stackIn_472_0);
                        stackOut_472_1 = stackIn_472_1;
                        stackIn_474_0 = stackOut_472_0;
                        stackIn_474_1 = stackOut_472_1;
                        stackOut_474_0 = (gd) ((Object) stackIn_474_0);
                        stackOut_474_1 = stackIn_474_1;
                        stackOut_474_2 = 0;
                        stackIn_477_0 = stackOut_474_0;
                        stackIn_477_1 = stackOut_474_1;
                        stackIn_477_2 = stackOut_474_2;
                        break L91;
                      }
                    }
                    ((gd) (Object) stackIn_477_0).b(stackIn_477_1, stackIn_477_2);
                    break L89;
                  } else {
                    if (0 < og.field_a) {
                      break L89;
                    } else {
                      L92: {
                        og.field_a = 10;
                        stackOut_464_0 = gj.field_r;
                        stackOut_464_1 = 10;
                        stackIn_469_0 = stackOut_464_0;
                        stackIn_469_1 = stackOut_464_1;
                        stackIn_465_0 = stackOut_464_0;
                        stackIn_465_1 = stackOut_464_1;
                        if (fe.field_e) {
                          stackOut_469_0 = (gd) ((Object) stackIn_469_0);
                          stackOut_469_1 = stackIn_469_1;
                          stackOut_469_2 = pk.field_h / 2;
                          stackIn_470_0 = stackOut_469_0;
                          stackIn_470_1 = stackOut_469_1;
                          stackIn_470_2 = stackOut_469_2;
                          break L92;
                        } else {
                          stackOut_465_0 = (gd) ((Object) stackIn_465_0);
                          stackOut_465_1 = stackIn_465_1;
                          stackIn_467_0 = stackOut_465_0;
                          stackIn_467_1 = stackOut_465_1;
                          stackOut_467_0 = (gd) ((Object) stackIn_467_0);
                          stackOut_467_1 = stackIn_467_1;
                          stackOut_467_2 = 0;
                          stackIn_470_0 = stackOut_467_0;
                          stackIn_470_1 = stackOut_467_1;
                          stackIn_470_2 = stackOut_467_2;
                          break L92;
                        }
                      }
                      ((gd) (Object) stackIn_470_0).b(stackIn_470_1, stackIn_470_2);
                      break L89;
                    }
                  }
                }
                L93: {
                  L94: {
                    a.field_h[0].field_k = a.field_h[0].field_k * 0.99;
                    if (!si.field_jb[97]) {
                      break L94;
                    } else {
                      if ((a.field_h[0].field_g ^ -1) >= -1) {
                        break L94;
                      } else {
                        L95: {
                          if (8 != e.field_e) {
                            stackOut_487_0 = -75;
                            stackIn_488_0 = stackOut_487_0;
                            break L95;
                          } else {
                            stackOut_485_0 = -150;
                            stackIn_488_0 = stackOut_485_0;
                            break L95;
                          }
                        }
                        L96: {
                          var2_int = stackIn_488_0;
                          if (this.field_M > var2_int / 3) {
                            this.field_M = var2_int / 3;
                            break L96;
                          } else {
                            break L96;
                          }
                        }
                        L97: {
                          if (var2_int >= this.field_M) {
                            break L97;
                          } else {
                            this.field_M = this.field_M - 6;
                            break L97;
                          }
                        }
                        break L93;
                      }
                    }
                  }
                  if ((this.field_M ^ -1) <= -1) {
                    break L93;
                  } else {
                    this.field_M = this.field_M + 5;
                    if (0 >= this.field_M) {
                      break L93;
                    } else {
                      this.field_M = 0;
                      break L93;
                    }
                  }
                }
                L98: {
                  L99: {
                    a.field_h[0].field_d = a.field_h[0].field_d * 0.99;
                    if (!si.field_jb[96]) {
                      break L99;
                    } else {
                      if (a.field_h[0].field_g <= 0) {
                        break L99;
                      } else {
                        L100: {
                          if (e.field_e != 8) {
                            stackOut_513_0 = 75;
                            stackIn_514_0 = stackOut_513_0;
                            break L100;
                          } else {
                            stackOut_511_0 = 150;
                            stackIn_514_0 = stackOut_511_0;
                            break L100;
                          }
                        }
                        L101: {
                          var2_int = stackIn_514_0;
                          if ((var2_int / 3 ^ -1) >= (this.field_M ^ -1)) {
                            break L101;
                          } else {
                            this.field_M = var2_int / 3;
                            break L101;
                          }
                        }
                        L102: {
                          if (this.field_M >= var2_int) {
                            break L102;
                          } else {
                            this.field_M = this.field_M + 6;
                            break L102;
                          }
                        }
                        break L98;
                      }
                    }
                  }
                  if (-1 > (this.field_M ^ -1)) {
                    this.field_M = this.field_M - 5;
                    if ((this.field_M ^ -1) <= -1) {
                      break L98;
                    } else {
                      this.field_M = 0;
                      break L98;
                    }
                  } else {
                    break L98;
                  }
                }
                L103: {
                  a.field_h[0].field_j = this.field_M;
                  if (si.field_jb[83]) {
                    break L103;
                  } else {
                    if (si.field_jb[82]) {
                      break L103;
                    } else {
                      if (10 != e.field_e) {
                        break L72;
                      } else {
                        if (-1 >= (a.field_h[0].field_i ^ -1)) {
                          break L72;
                        } else {
                          break L103;
                        }
                      }
                    }
                  }
                }
                if (0 < a.field_h[0].field_g) {
                  L104: {
                    var2_int = e.field_e;
                    if (var2_int == -1) {
                      if (!fe.field_e) {
                        break L104;
                      } else {
                        if (-1 > (a.field_h[0].field_i ^ -1)) {
                          break L104;
                        } else {
                          ll.field_c.a(sb.field_e[27], 100, 2 * pk.field_h);
                          break L104;
                        }
                      }
                    } else {
                      if ((var2_int ^ -1) == -1) {
                        if (!fe.field_e) {
                          break L104;
                        } else {
                          if (0 < a.field_h[0].field_i) {
                            break L104;
                          } else {
                            ll.field_c.a(sb.field_e[38], 100, pk.field_h * 2);
                            break L104;
                          }
                        }
                      } else {
                        if ((var2_int ^ -1) != -2) {
                          if (2 == var2_int) {
                            if (!fe.field_e) {
                              break L104;
                            } else {
                              if (-1 > (a.field_h[0].field_i ^ -1)) {
                                break L104;
                              } else {
                                ll.field_c.a(sb.field_e[1], 100, pk.field_h * 2);
                                break L104;
                              }
                            }
                          } else {
                            if (3 != var2_int) {
                              if (4 == var2_int) {
                                if (!fe.field_e) {
                                  break L104;
                                } else {
                                  if (0 >= af.field_o) {
                                    ll.field_c.a(sb.field_e[24], 100, 2 * pk.field_h);
                                    af.field_o = 3;
                                    break L104;
                                  } else {
                                    break L104;
                                  }
                                }
                              } else {
                                if (-6 == (var2_int ^ -1)) {
                                  if (!fe.field_e) {
                                    break L104;
                                  } else {
                                    if (0 < a.field_h[0].field_i) {
                                      break L104;
                                    } else {
                                      ll.field_c.a(sb.field_e[39], 100, pk.field_h * 2);
                                      break L104;
                                    }
                                  }
                                } else {
                                  if (var2_int == 6) {
                                    if (!fe.field_e) {
                                      break L104;
                                    } else {
                                      if (a.field_h[0].field_i > 0) {
                                        break L104;
                                      } else {
                                        ll.field_c.a(sb.field_e[22], 100, 2 * pk.field_h);
                                        break L104;
                                      }
                                    }
                                  } else {
                                    if (-8 == (var2_int ^ -1)) {
                                      if (!fe.field_e) {
                                        break L104;
                                      } else {
                                        if (a.field_h[0].field_i > 0) {
                                          break L104;
                                        } else {
                                          ll.field_c.a(sb.field_e[34], 100, 2 * pk.field_h);
                                          break L104;
                                        }
                                      }
                                    } else {
                                      if (var2_int != 8) {
                                        if (var2_int == 9) {
                                          if (!fe.field_e) {
                                            break L104;
                                          } else {
                                            if ((af.field_o ^ -1) >= -1) {
                                              ll.field_c.a(sb.field_e[7], 100, 2 * pk.field_h);
                                              af.field_o = 5;
                                              break L104;
                                            } else {
                                              break L104;
                                            }
                                          }
                                        } else {
                                          if (-11 != (var2_int ^ -1)) {
                                            break L104;
                                          } else {
                                            if (!fe.field_e) {
                                              break L104;
                                            } else {
                                              if (a.field_h[0].field_i != -1) {
                                                break L104;
                                              } else {
                                                ll.field_c.a(sb.field_e[25], 100, pk.field_h * 2);
                                                break L104;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (!fe.field_e) {
                                          break L104;
                                        } else {
                                          if (af.field_o <= 0) {
                                            ll.field_c.a(sb.field_e[20], 100, pk.field_h * 2);
                                            af.field_o = (int)(Math.random() * 10.0) + 15;
                                            break L104;
                                          } else {
                                            break L104;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (!fe.field_e) {
                                break L104;
                              } else {
                                if (-1 <= (a.field_h[0].field_i ^ -1)) {
                                  ll.field_c.a(sb.field_e[21], 100, 2 * pk.field_h);
                                  break L104;
                                } else {
                                  break L104;
                                }
                              }
                            }
                          }
                        } else {
                          if (!fe.field_e) {
                            break L104;
                          } else {
                            if ((a.field_h[0].field_i ^ -1) >= -1) {
                              ll.field_c.a(sb.field_e[33], 100, pk.field_h * 2);
                              break L104;
                            } else {
                              break L104;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (-1 > (a.field_h[0].field_i ^ -1)) {
                    break L72;
                  } else {
                    var4 = e.field_e;
                    if (var4 != -1) {
                      if ((var4 ^ -1) == -1) {
                        L105: {
                          fieldTemp$12 = mj.field_F + 1;
                          mj.field_F = mj.field_F + 1;
                          if (fieldTemp$12 <= 1) {
                            break L105;
                          } else {
                            mj.field_F = 0;
                            break L105;
                          }
                        }
                        a.field_h[0].field_i = 10;
                        var4 = -4;
                        L106: while (true) {
                          if (-5 > (var4 ^ -1)) {
                            break L72;
                          } else {
                            L107: {
                              L108: {
                                L109: {
                                  var2_ref2 = new vl(0, a.field_h[0]);
                                  var2_ref2.field_j = var2_ref2.field_j - Math.sin(2.0 * ((double)(a.field_h[0].field_h - -(1 * var4)) * 3.141592653589793) / 256.0) * 8.0;
                                  var2_ref2.field_a = var2_ref2.field_a - Math.cos(3.141592653589793 * (double)(1 * var4 + a.field_h[0].field_h) * 2.0 / 256.0) * 8.0;
                                  var2_ref2.field_k = -((double)var4 * var2_ref2.field_j / 4.0) + (a.field_h[0].field_l + 2.0 * var2_ref2.field_a);
                                  var2_ref2.field_c = var2_ref2.field_a * (double)var4 / 4.0 + (a.field_h[0].field_a + 2.0 * var2_ref2.field_j);
                                  var2_ref2.field_q = 255;
                                  var2_ref2.field_a = var2_ref2.field_a + a.field_h[0].field_k;
                                  var2_ref2.field_n = e.field_e;
                                  var2_ref2.field_p = 2;
                                  var2_ref2.field_j = var2_ref2.field_j + a.field_h[0].field_d;
                                  if ((var4 ^ -1) != -1) {
                                    break L109;
                                  } else {
                                    if (-1 == (mj.field_F ^ -1)) {
                                      break L108;
                                    } else {
                                      break L109;
                                    }
                                  }
                                }
                                if ((var4 ^ -1) == -1) {
                                  break L107;
                                } else {
                                  if (1 != mj.field_F) {
                                    break L107;
                                  } else {
                                    break L108;
                                  }
                                }
                              }
                              var2_ref2.field_q = 8421631;
                              break L107;
                            }
                            wk.field_b[eg.a(-109)] = var2_ref2;
                            var4 += 4;
                            continue L106;
                          }
                        }
                      } else {
                        if (var4 == 1) {
                          L110: {
                            fieldTemp$13 = mj.field_F + 1;
                            mj.field_F = mj.field_F + 1;
                            if ((fieldTemp$13 ^ -1) < -2) {
                              mj.field_F = 0;
                              break L110;
                            } else {
                              break L110;
                            }
                          }
                          a.field_h[0].field_i = 5;
                          var4 = -3;
                          L111: while (true) {
                            if (-4 > (var4 ^ -1)) {
                              break L72;
                            } else {
                              L112: {
                                L113: {
                                  L114: {
                                    var2_ref2 = new vl(0, a.field_h[0]);
                                    var2_ref2.field_j = var2_ref2.field_j - Math.sin(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h + var4)) / 256.0) * 6.0;
                                    var2_ref2.field_a = var2_ref2.field_a - 6.0 * Math.cos((double)(a.field_h[0].field_h - -var4) * 3.141592653589793 * 2.0 / 256.0);
                                    var2_ref2.field_k = a.field_h[0].field_l + var2_ref2.field_a * 4.0 - (double)var4 * var2_ref2.field_j / 2.0;
                                    var2_ref2.field_c = var2_ref2.field_a * (double)var4 / 2.0 + (var2_ref2.field_j * 4.0 + a.field_h[0].field_a);
                                    var2_ref2.field_j = var2_ref2.field_j + a.field_h[0].field_d;
                                    var2_ref2.field_a = var2_ref2.field_a + a.field_h[0].field_k;
                                    var2_ref2.field_p = 1;
                                    wk.field_b[eg.a(-91)] = var2_ref2;
                                    var2_ref2.field_q = 16728128;
                                    var2_ref2.field_n = e.field_e;
                                    if ((Math.abs(var4) ^ -1) < -2) {
                                      break L114;
                                    } else {
                                      if (mj.field_F == 0) {
                                        break L113;
                                      } else {
                                        break L114;
                                      }
                                    }
                                  }
                                  if ((Math.abs(var4) ^ -1) >= -2) {
                                    break L112;
                                  } else {
                                    if (mj.field_F == 1) {
                                      break L113;
                                    } else {
                                      break L112;
                                    }
                                  }
                                }
                                var2_ref2.field_q = 16760896;
                                break L112;
                              }
                              var4 += 2;
                              continue L111;
                            }
                          }
                        } else {
                          if (-3 != (var4 ^ -1)) {
                            if (3 != var4) {
                              if (-5 != (var4 ^ -1)) {
                                if (5 != var4) {
                                  if (6 == var4) {
                                    a.field_h[0].field_i = 5;
                                    var4 = -10;
                                    L115: while (true) {
                                      if (-11 > (var4 ^ -1)) {
                                        break L72;
                                      } else {
                                        var2_ref2 = new vl(0, a.field_h[0]);
                                        var2_ref2.field_j = var2_ref2.field_j - Math.sin((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0) * 6.0;
                                        var2_ref2.field_a = var2_ref2.field_a - 6.0 * Math.cos(2.0 * ((double)(a.field_h[0].field_h - -var4) * 3.141592653589793) / 256.0);
                                        var2_ref2.field_c = var2_ref2.field_j * 4.0 + a.field_h[0].field_a;
                                        var2_ref2.field_k = a.field_h[0].field_l + var2_ref2.field_a * 4.0;
                                        var2_ref2.field_p = 1;
                                        var2_ref2.field_d = 65535;
                                        var2_ref2.field_a = var2_ref2.field_a + a.field_h[0].field_k;
                                        var2_ref2.field_q = 16776960;
                                        var2_ref2.field_j = var2_ref2.field_j + a.field_h[0].field_d;
                                        wk.field_b[eg.a(-113)] = var2_ref2;
                                        var2_ref2.field_n = e.field_e;
                                        var4 += 4;
                                        continue L115;
                                      }
                                    }
                                  } else {
                                    if (var4 != 7) {
                                      if ((var4 ^ -1) != -9) {
                                        if ((var4 ^ -1) == -10) {
                                          a.field_h[0].field_i = 1;
                                          var4 = -2;
                                          L116: while (true) {
                                            if ((var4 ^ -1) < -3) {
                                              break L72;
                                            } else {
                                              var2_ref2 = new vl(0, a.field_h[0]);
                                              var2_ref2.field_j = var2_ref2.field_j - Math.sin(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0) * 2.0;
                                              var2_ref2.field_a = var2_ref2.field_a - Math.cos(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h - -var4)) / 256.0) * 2.0;
                                              var2_ref2.field_m = 2;
                                              var2_ref2.field_q = 16711680;
                                              var2_ref2.field_d = 16776960;
                                              var2_ref2.field_k = 8.0 * var2_ref2.field_a + a.field_h[0].field_l;
                                              var2_ref2.field_p = 1;
                                              var2_ref2.field_c = 8.0 * var2_ref2.field_j + a.field_h[0].field_a;
                                              wk.field_b[eg.a(-70)] = var2_ref2;
                                              var2_ref2.field_l = 1001;
                                              var2_ref2.field_n = e.field_e;
                                              var4 += 4;
                                              continue L116;
                                            }
                                          }
                                        } else {
                                          if (10 != var4) {
                                            break L72;
                                          } else {
                                            L117: {
                                              a.field_h[0].field_i = a.field_h[0].field_i - 1;
                                              if ((a.field_h[0].field_i ^ -1) < 24) {
                                                break L117;
                                              } else {
                                                a.field_h[0].field_i = 10;
                                                break L117;
                                              }
                                            }
                                            L118: {
                                              var3 = -a.field_h[0].field_i;
                                              if (15 < var3) {
                                                var3 = -var3 + 25;
                                                break L118;
                                              } else {
                                                break L118;
                                              }
                                            }
                                            L119: {
                                              if (-11 <= (var3 ^ -1)) {
                                                break L119;
                                              } else {
                                                var3 = 10;
                                                break L119;
                                              }
                                            }
                                            L120: {
                                              if (-2 < (var3 ^ -1)) {
                                                var3 = 1;
                                                break L120;
                                              } else {
                                                break L120;
                                              }
                                            }
                                            var4 = -1;
                                            L121: while (true) {
                                              if (-2 > (var4 ^ -1)) {
                                                break L72;
                                              } else {
                                                L122: {
                                                  var2_ref2 = new vl(0, a.field_h[0]);
                                                  var2_ref2.field_j = var2_ref2.field_j - Math.sin(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h - -(0 * var4))) / 256.0) * 8.0;
                                                  var2_ref2.field_a = var2_ref2.field_a - Math.cos(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h + var4 * 0)) / 256.0) * 8.0;
                                                  var2_ref2.field_m = 2;
                                                  var2_ref2.field_p = var3;
                                                  var2_ref2.field_q = 65535;
                                                  var2_ref2.field_d = 16777215;
                                                  var2_ref2.field_c = (double)var4 * var2_ref2.field_a * (double)var3 / 10.0 + (var2_ref2.field_j * 2.0 + a.field_h[0].field_a);
                                                  var2_ref2.field_k = a.field_h[0].field_l + var2_ref2.field_a * 2.0 - var2_ref2.field_j * (double)var4 * (double)var3 / 10.0;
                                                  wk.field_b[eg.a(-75)] = var2_ref2;
                                                  var2_ref2.field_l = 6;
                                                  var2_ref2.field_n = e.field_e;
                                                  if (var4 == 0) {
                                                    break L122;
                                                  } else {
                                                    var2_ref2.field_n = 11;
                                                    break L122;
                                                  }
                                                }
                                                var4++;
                                                continue L121;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        a.field_h[0].field_i = 1;
                                        var4 = 0;
                                        L123: while (true) {
                                          if (10 <= var4) {
                                            break L72;
                                          } else {
                                            var5_double = -8.0 + Math.random() * 17.0;
                                            var2_ref2 = new vl(4, a.field_h[0]);
                                            var2_ref2.field_q = 16776960;
                                            var2_ref2.field_j = var2_ref2.field_j - 5.0 * Math.sin(2.0 * (3.141592653589793 * (var5_double + (double)a.field_h[0].field_h)) / 256.0);
                                            var2_ref2.field_a = var2_ref2.field_a - 5.0 * Math.cos(2.0 * (((double)a.field_h[0].field_h + var5_double) * 3.141592653589793) / 256.0);
                                            var2_ref2.field_c = var2_ref2.field_j * 3.0 + a.field_h[0].field_a;
                                            var2_ref2.field_k = a.field_h[0].field_l + var2_ref2.field_a * 3.0;
                                            var2_ref2.field_j = var2_ref2.field_j + a.field_h[0].field_d;
                                            var2_ref2.field_p = 2;
                                            var2_ref2.field_m = 1;
                                            var2_ref2.field_a = var2_ref2.field_a + a.field_h[0].field_k;
                                            wk.field_b[eg.a(-80)] = var2_ref2;
                                            var4++;
                                            continue L123;
                                          }
                                        }
                                      }
                                    } else {
                                      a.field_h[0].field_i = 10;
                                      var4 = -11;
                                      L124: while (true) {
                                        if (var4 > -9) {
                                          var4 = -3;
                                          L125: while (true) {
                                            if (var4 > 3) {
                                              var4 = 9;
                                              L126: while (true) {
                                                if ((var4 ^ -1) < -12) {
                                                  break L72;
                                                } else {
                                                  L127: {
                                                    var2_ref2 = new vl(0, a.field_h[0]);
                                                    var5_double = 5.0;
                                                    if (Math.abs(var4 + -10) == 3) {
                                                      var5_double = 4.5;
                                                      break L127;
                                                    } else {
                                                      break L127;
                                                    }
                                                  }
                                                  L128: {
                                                    if (-3 == (Math.abs(var4 - 10) ^ -1)) {
                                                      var5_double = 4.8;
                                                      break L128;
                                                    } else {
                                                      break L128;
                                                    }
                                                  }
                                                  var2_ref2.field_j = var2_ref2.field_j - var5_double * Math.sin(2.0 * (3.141592653589793 * (double)(var4 + a.field_h[0].field_h)) / 256.0);
                                                  var2_ref2.field_a = var2_ref2.field_a - Math.cos(2.0 * ((double)(a.field_h[0].field_h - -var4) * 3.141592653589793) / 256.0) * var5_double;
                                                  var2_ref2.field_k = 4.0 * var2_ref2.field_a + a.field_h[0].field_l;
                                                  var2_ref2.field_c = a.field_h[0].field_a + 4.0 * var2_ref2.field_j;
                                                  var2_ref2.field_q = 255;
                                                  var2_ref2.field_p = 2;
                                                  var2_ref2.field_j = var2_ref2.field_j + a.field_h[0].field_d / 5.0;
                                                  var2_ref2.field_a = var2_ref2.field_a + a.field_h[0].field_k / 5.0;
                                                  var2_ref2.field_d = 8454143;
                                                  wk.field_b[eg.a(-112)] = var2_ref2;
                                                  var2_ref2.field_n = e.field_e;
                                                  var2_ref2.field_l = 5;
                                                  var4++;
                                                  continue L126;
                                                }
                                              }
                                            } else {
                                              L129: {
                                                var2_ref2 = new vl(0, a.field_h[0]);
                                                var5_double = 5.0;
                                                if ((Math.abs(var4) ^ -1) != -4) {
                                                  break L129;
                                                } else {
                                                  var5_double = 4.5;
                                                  break L129;
                                                }
                                              }
                                              L130: {
                                                if (-3 != (Math.abs(var4) ^ -1)) {
                                                  break L130;
                                                } else {
                                                  var5_double = 4.8;
                                                  break L130;
                                                }
                                              }
                                              var2_ref2.field_j = var2_ref2.field_j - var5_double * Math.sin(3.141592653589793 * (double)(var4 + a.field_h[0].field_h) * 2.0 / 256.0);
                                              var2_ref2.field_a = var2_ref2.field_a - var5_double * Math.cos(2.0 * (3.141592653589793 * (double)(var4 + a.field_h[0].field_h)) / 256.0);
                                              var2_ref2.field_c = var2_ref2.field_j * 4.0 + a.field_h[0].field_a;
                                              var2_ref2.field_k = var2_ref2.field_a * 4.0 + a.field_h[0].field_l;
                                              var2_ref2.field_p = 3;
                                              var2_ref2.field_a = var2_ref2.field_a + a.field_h[0].field_k / 5.0;
                                              var2_ref2.field_q = 49407;
                                              var2_ref2.field_d = 8454143;
                                              var2_ref2.field_j = var2_ref2.field_j + a.field_h[0].field_d / 5.0;
                                              wk.field_b[eg.a(-40)] = var2_ref2;
                                              var2_ref2.field_n = e.field_e;
                                              var2_ref2.field_l = 5;
                                              var4++;
                                              continue L125;
                                            }
                                          }
                                        } else {
                                          L131: {
                                            var2_ref2 = new vl(0, a.field_h[0]);
                                            var5_double = 5.0;
                                            if (3 != Math.abs(var4 + 10)) {
                                              break L131;
                                            } else {
                                              var5_double = 4.5;
                                              break L131;
                                            }
                                          }
                                          L132: {
                                            if (2 == Math.abs(var4 - -10)) {
                                              var5_double = 4.8;
                                              break L132;
                                            } else {
                                              break L132;
                                            }
                                          }
                                          var2_ref2.field_j = var2_ref2.field_j - var5_double * Math.sin(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0);
                                          var2_ref2.field_a = var2_ref2.field_a - var5_double * Math.cos(2.0 * (3.141592653589793 * (double)(var4 + a.field_h[0].field_h)) / 256.0);
                                          var2_ref2.field_c = a.field_h[0].field_a + 4.0 * var2_ref2.field_j;
                                          var2_ref2.field_k = a.field_h[0].field_l + var2_ref2.field_a * 4.0;
                                          var2_ref2.field_l = 5;
                                          var2_ref2.field_a = var2_ref2.field_a + a.field_h[0].field_k / 5.0;
                                          var2_ref2.field_d = 8454143;
                                          var2_ref2.field_q = 255;
                                          var2_ref2.field_p = 2;
                                          var2_ref2.field_j = var2_ref2.field_j + a.field_h[0].field_d / 5.0;
                                          wk.field_b[eg.a(-71)] = var2_ref2;
                                          var2_ref2.field_n = e.field_e;
                                          var4++;
                                          continue L124;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  a.field_h[0].field_i = 35;
                                  var4 = -30;
                                  L133: while (true) {
                                    if (30 < var4) {
                                      break L72;
                                    } else {
                                      var2_ref2 = new vl(0, a.field_h[0]);
                                      var2_ref2.field_j = var2_ref2.field_j - Math.sin(3.141592653589793 * (double)(var4 + a.field_h[0].field_h) * 2.0 / 256.0) * 4.0;
                                      var2_ref2.field_a = var2_ref2.field_a - 4.0 * Math.cos((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0);
                                      var2_ref2.field_c = a.field_h[0].field_a + var2_ref2.field_j * 4.0;
                                      var2_ref2.field_k = a.field_h[0].field_l + 4.0 * var2_ref2.field_a;
                                      var2_ref2.field_j = var2_ref2.field_j + a.field_h[0].field_d;
                                      var2_ref2.field_p = 1;
                                      var2_ref2.field_a = var2_ref2.field_a + a.field_h[0].field_k;
                                      var2_ref2.field_q = 65280 + (Math.abs(var4) * 255 / 30 << 1688133712 & 16771312);
                                      wk.field_b[eg.a(-54)] = var2_ref2;
                                      var2_ref2.field_n = e.field_e;
                                      var4++;
                                      continue L133;
                                    }
                                  }
                                }
                              } else {
                                L134: {
                                  a.field_h[0].field_i = 0;
                                  var2_ref2 = new vl(0, a.field_h[0]);
                                  var2_ref2.field_j = var2_ref2.field_j - Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0) * 8.0;
                                  var2_ref2.field_a = var2_ref2.field_a - Math.cos((double)a.field_h[0].field_h * 3.141592653589793 * 2.0 / 256.0) * 8.0;
                                  var2_ref2.field_q = 12422335;
                                  var2_ref2.field_m = 2;
                                  var2_ref2.field_k = var2_ref2.field_a * 2.0 + a.field_h[0].field_l;
                                  var2_ref2.field_d = 9578383;
                                  var2_ref2.field_c = 2.0 * var2_ref2.field_j + a.field_h[0].field_a;
                                  var2_ref2.field_l = 1000;
                                  var2_ref2.field_p = 1;
                                  var4 = eg.a(-36);
                                  if (var4 == -1) {
                                    break L134;
                                  } else {
                                    wk.field_b[var4] = var2_ref2;
                                    break L134;
                                  }
                                }
                                var2_ref2.field_n = e.field_e;
                                break L72;
                              }
                            } else {
                              a.field_h[0].field_i = 10;
                              var4 = -3;
                              L135: while (true) {
                                if (var4 > 3) {
                                  break L72;
                                } else {
                                  L136: {
                                    var2_ref2 = new vl(0, a.field_h[0]);
                                    var5_double = 5.0;
                                    if ((Math.abs(var4) ^ -1) == -4) {
                                      var5_double = 4.5;
                                      break L136;
                                    } else {
                                      break L136;
                                    }
                                  }
                                  L137: {
                                    if (2 != Math.abs(var4)) {
                                      break L137;
                                    } else {
                                      var5_double = 4.8;
                                      break L137;
                                    }
                                  }
                                  L138: {
                                    var2_ref2.field_j = var2_ref2.field_j - var5_double * Math.sin((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0);
                                    var2_ref2.field_a = var2_ref2.field_a - var5_double * Math.cos((double)(a.field_h[0].field_h - -var4) * 3.141592653589793 * 2.0 / 256.0);
                                    var2_ref2.field_k = var2_ref2.field_a * 4.0 + a.field_h[0].field_l;
                                    var2_ref2.field_c = a.field_h[0].field_a + var2_ref2.field_j * 4.0;
                                    var2_ref2.field_a = var2_ref2.field_a + a.field_h[0].field_k / 5.0;
                                    var2_ref2.field_j = var2_ref2.field_j + a.field_h[0].field_d / 5.0;
                                    var2_ref2.field_q = 16711680;
                                    var2_ref2.field_d = 16744576;
                                    var2_ref2.field_p = 3;
                                    if (2 == Math.abs(var4)) {
                                      var2_ref2.field_q = 16711680;
                                      var2_ref2.field_d = 16760960;
                                      break L138;
                                    } else {
                                      break L138;
                                    }
                                  }
                                  L139: {
                                    if ((Math.abs(var4) ^ -1) == -2) {
                                      var2_ref2.field_q = 16711680;
                                      var2_ref2.field_d = 16777088;
                                      break L139;
                                    } else {
                                      break L139;
                                    }
                                  }
                                  L140: {
                                    if ((Math.abs(var4) ^ -1) == -1) {
                                      var2_ref2.field_q = 16711680;
                                      var2_ref2.field_d = 16777088;
                                      break L140;
                                    } else {
                                      break L140;
                                    }
                                  }
                                  wk.field_b[eg.a(-67)] = var2_ref2;
                                  var2_ref2.field_n = e.field_e;
                                  var2_ref2.field_l = 5;
                                  var4++;
                                  continue L135;
                                }
                              }
                            }
                          } else {
                            L141: {
                              a.field_h[0].field_i = 6;
                              fieldTemp$14 = mj.field_F + 1;
                              mj.field_F = mj.field_F + 1;
                              if ((fieldTemp$14 ^ -1) >= -4) {
                                break L141;
                              } else {
                                mj.field_F = 0;
                                break L141;
                              }
                            }
                            var4 = -1;
                            L142: while (true) {
                              if (-2 > (var4 ^ -1)) {
                                break L72;
                              } else {
                                L143: {
                                  var2_ref2 = new vl(0, a.field_h[0]);
                                  if ((var4 ^ -1) != 0) {
                                    break L143;
                                  } else {
                                    mj.field_F = 3 - mj.field_F;
                                    break L143;
                                  }
                                }
                                L144: {
                                  var2_ref2.field_j = var2_ref2.field_j - Math.sin(3.141592653589793 * (double)(a.field_h[0].field_h + 4 * (1 + mj.field_F) * var4) * 2.0 / 256.0) * 6.0;
                                  var2_ref2.field_a = var2_ref2.field_a - Math.cos((double)(a.field_h[0].field_h + (mj.field_F - -1) * (var4 * 4)) * 3.141592653589793 * 2.0 / 256.0) * 6.0;
                                  var2_ref2.field_c = var2_ref2.field_j * 3.0 + a.field_h[0].field_a;
                                  if ((var4 ^ -1) == 0) {
                                    mj.field_F = -mj.field_F + 3;
                                    break L144;
                                  } else {
                                    break L144;
                                  }
                                }
                                L145: {
                                  L146: {
                                    L147: {
                                      var2_ref2.field_k = a.field_h[0].field_l + var2_ref2.field_a * 3.0;
                                      var2_ref2.field_j = var2_ref2.field_j + a.field_h[0].field_d;
                                      var2_ref2.field_a = var2_ref2.field_a + a.field_h[0].field_k;
                                      var2_ref2.field_q = 255;
                                      var2_ref2.field_p = 4;
                                      var2_ref2.field_n = e.field_e;
                                      if (var4 != 0) {
                                        break L147;
                                      } else {
                                        if (0 == mj.field_F % 2) {
                                          break L146;
                                        } else {
                                          break L147;
                                        }
                                      }
                                    }
                                    if (-1 == (var4 ^ -1)) {
                                      break L145;
                                    } else {
                                      if ((mj.field_F % 2 ^ -1) == -2) {
                                        break L146;
                                      } else {
                                        break L145;
                                      }
                                    }
                                  }
                                  var2_ref2.field_q = 8421631;
                                  break L145;
                                }
                                wk.field_b[eg.a(-51)] = var2_ref2;
                                var4 += 2;
                                continue L142;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      L148: {
                        fieldTemp$15 = mj.field_F + 1;
                        mj.field_F = mj.field_F + 1;
                        if ((fieldTemp$15 ^ -1) < -5) {
                          mj.field_F = 0;
                          break L148;
                        } else {
                          break L148;
                        }
                      }
                      L149: {
                        a.field_h[0].field_i = 5;
                        var4 = mj.field_F + -1;
                        if ((var4 ^ -1) != -3) {
                          break L149;
                        } else {
                          var4 = 0;
                          break L149;
                        }
                      }
                      L150: {
                        if ((var4 ^ -1) == -4) {
                          var4 = -1;
                          break L150;
                        } else {
                          break L150;
                        }
                      }
                      L151: {
                        var2_ref2 = new vl(0, a.field_h[0]);
                        var2_ref2.field_j = var2_ref2.field_j - Math.sin(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0) * 8.0;
                        var2_ref2.field_a = var2_ref2.field_a - Math.cos((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0) * 8.0;
                        var2_ref2.field_k = var2_ref2.field_a * 2.0 + a.field_h[0].field_l;
                        var2_ref2.field_c = a.field_h[0].field_a + var2_ref2.field_j * 2.0;
                        var2_ref2.field_q = 255;
                        var2_ref2.field_p = 1;
                        var2_ref2.field_n = e.field_e;
                        var2_ref2.field_j = var2_ref2.field_j + a.field_h[0].field_d;
                        var2_ref2.field_a = var2_ref2.field_a + a.field_h[0].field_k;
                        if (0 != var4) {
                          break L151;
                        } else {
                          var2_ref2.field_q = 8421631;
                          var2_ref2.field_p = 2;
                          break L151;
                        }
                      }
                      wk.field_b[eg.a(-27)] = var2_ref2;
                      break L72;
                    }
                  }
                } else {
                  break L72;
                }
              } else {
                break L72;
              }
            }
            L152: {
              if (!s.field_i) {
                break L152;
              } else {
                if (na.field_j == null) {
                  L153: while (true) {
                    if (!qh.c(89)) {
                      break L152;
                    } else {
                      stackOut_958_0 = gi.field_f ^ -1;
                      stackIn_960_0 = stackOut_958_0;
                      stackOut_960_0 = stackIn_960_0;
                      stackOut_960_1 = -34;
                      stackIn_962_0 = stackOut_960_0;
                      stackIn_962_1 = stackOut_960_1;
                      L154: {
                        if (stackIn_962_0 != stackIn_962_1) {
                          break L154;
                        } else {
                          if (ph.field_D < 2) {
                            break L154;
                          } else {
                            e.field_e = e.field_e + 1;
                            e.field_c = true;
                            if (-11 <= (e.field_e ^ -1)) {
                              break L154;
                            } else {
                              e.field_e = -1;
                              break L154;
                            }
                          }
                        }
                      }
                      L155: {
                        if (41 != gi.field_f) {
                          break L155;
                        } else {
                          if (ph.field_D < 2) {
                            break L155;
                          } else {
                            L156: {
                              if (hd.field_b) {
                                stackOut_980_0 = 0;
                                stackIn_981_0 = stackOut_980_0;
                                break L156;
                              } else {
                                stackOut_978_0 = 1;
                                stackIn_981_0 = stackOut_978_0;
                                break L156;
                              }
                            }
                            hd.field_b = stackIn_981_0 != 0;
                            break L155;
                          }
                        }
                      }
                      L157: {
                        if (gi.field_f != 48) {
                          break L157;
                        } else {
                          if (-3 >= (ph.field_D ^ -1)) {
                            hj.a(255, 0, 1);
                            break L157;
                          } else {
                            break L157;
                          }
                        }
                      }
                      if ((gi.field_f ^ -1) == -14) {
                        na.field_j = new ij((stellarshard) (this));
                        tl.field_c = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        continue L153;
                      }
                    }
                  }
                } else {
                  break L152;
                }
              }
            }
            this.q(50);
            var2_int = 0;
            var3 = 0;
            var4 = 0;
            var5 = 0;
            L158: while (true) {
              if (var5 >= 1000) {
                L159: {
                  if (!s.field_i) {
                    break L159;
                  } else {
                    if (pk.a(-12663, 0)) {
                      L160: {
                        L161: {
                          if (null == a.field_h[0]) {
                            break L161;
                          } else {
                            if (0 != (a.field_h[0].field_m ^ -1)) {
                              break L161;
                            } else {
                              stackOut_1055_0 = a.field_h[0];
                              stackIn_1057_0 = stackOut_1055_0;
                              if (stackIn_1057_0.field_g > 0) {
                                break L161;
                              } else {
                                if (0 != nc.field_H) {
                                  break L161;
                                } else {
                                  stackOut_1061_0 = 1;
                                  stackIn_1064_0 = stackOut_1061_0;
                                  break L160;
                                }
                              }
                            }
                          }
                        }
                        stackOut_1063_0 = 0;
                        stackIn_1064_0 = stackOut_1063_0;
                        break L160;
                      }
                      L162: {
                        var5 = stackIn_1064_0;
                        if (var5 == 0) {
                          pk.field_c = pk.field_c - 1;
                          if (-1 < (pk.field_c ^ -1)) {
                            L163: {
                              var6 = gh.field_b;
                              if ((var6 ^ -1) < -6) {
                                var6 = 5;
                                break L163;
                              } else {
                                break L163;
                              }
                            }
                            pk.field_c = 25 + var6 * 25;
                            var7 = 160 + -(var6 * 32);
                            if (-1 <= (var7 ^ -1)) {
                              break L162;
                            } else {
                              if (fe.field_e) {
                                ll.field_c.a(sb.field_e[46], var7, pk.field_h * 6);
                                break L162;
                              } else {
                                break L162;
                              }
                            }
                          } else {
                            break L162;
                          }
                        } else {
                          break L162;
                        }
                      }
                      gf.field_c = gf.field_c + 1;
                      var6_double = 1.7976931348623157e+308;
                      var8 = null;
                      var9 = 0;
                      L164: while (true) {
                        if ((var9 ^ -1) <= -1001) {
                          if (null == var8) {
                            break L159;
                          } else {
                            L165: {
                              var9 = 128;
                              if (var6_double <= 0.0) {
                                break L165;
                              } else {
                                var9 = (int)(2560.0 / var6_double);
                                break L165;
                              }
                            }
                            L166: {
                              if (-129 > (var9 ^ -1)) {
                                var9 = 128;
                                break L166;
                              } else {
                                break L166;
                              }
                            }
                            ag.field_a = ag.field_a + var9;
                            if (256 >= ag.field_a) {
                              break L159;
                            } else {
                              L167: {
                                if (fe.field_e) {
                                  ll.field_c.a(sb.field_e[13], var9, pk.field_h * 64 / 50);
                                  break L167;
                                } else {
                                  break L167;
                                }
                              }
                              ag.field_a = 0;
                              break L159;
                            }
                          }
                        } else {
                          L168: {
                            var10 = a.field_h[var9];
                            if (var10 == null) {
                              break L168;
                            } else {
                              if (0 == (var10.field_m ^ -1)) {
                                break L168;
                              } else {
                                if (var10.a((byte) -102)) {
                                  var11 = -(int)var10.field_a + var2_int;
                                  var12 = var3 - (int)var10.field_l;
                                  var13 = Math.sqrt((double)(var12 * var12 + var11 * var11));
                                  if (var13 >= var6_double) {
                                    break L168;
                                  } else {
                                    var6_double = var13;
                                    var8 = var10;
                                    break L168;
                                  }
                                } else {
                                  break L168;
                                }
                              }
                            }
                          }
                          var9++;
                          continue L164;
                        }
                      }
                    } else {
                      break L159;
                    }
                  }
                }
                fb.field_b = fb.field_b - var2_int;
                tk.field_b = tk.field_b - var3;
                sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 0.001 * (double)var3);
                this.field_H.a(sg.field_a, -125);
                sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.001 * (double)(-var2_int));
                this.field_H.a(sg.field_a, -126);
                var5 = 0;
                var6 = 0;
                L169: while (true) {
                  if (var6 >= 12) {
                    var5 = 0;
                    L170: while (true) {
                      if (var5 >= 3000) {
                        var5 = 0;
                        L171: while (true) {
                          if (3000 <= var5) {
                            o.field_j = 0;
                            var5 = 0;
                            L172: while (true) {
                              if (var5 >= 1000) {
                                var5 = 0;
                                L173: while (true) {
                                  if (var5 >= 1000) {
                                    if (param0) {
                                      var5 = 0;
                                      L174: while (true) {
                                        if (-3001 >= (var5 ^ -1)) {
                                          L175: {
                                            if (qi.field_a < 10) {
                                              break L175;
                                            } else {
                                              if (-1 > (mk.field_k ^ -1)) {
                                                break L175;
                                              } else {
                                                if (!s.field_i) {
                                                  break L175;
                                                } else {
                                                  nc.field_A = nc.field_A - 1;
                                                  if ((nc.field_A ^ -1) >= -1) {
                                                    a.field_h[0] = null;
                                                    this.k((byte) 97);
                                                    break L175;
                                                  } else {
                                                    break L175;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L176: {
                                            if (50 != qi.field_a) {
                                              break L176;
                                            } else {
                                              if ((nc.field_A ^ -1) < -1) {
                                                nc.field_A = nc.field_A - 1;
                                                if ((nc.field_A ^ -1) < -1) {
                                                  break L176;
                                                } else {
                                                  a.field_h[0] = null;
                                                  this.k((byte) 121);
                                                  break L176;
                                                }
                                              } else {
                                                break L176;
                                              }
                                            }
                                          }
                                          L177: {
                                            if (qi.field_a < var4) {
                                              break L177;
                                            } else {
                                              L178: {
                                                if (-11 < (qi.field_a ^ -1)) {
                                                  break L178;
                                                } else {
                                                  if (mk.field_k <= 0) {
                                                    break L177;
                                                  } else {
                                                    break L178;
                                                  }
                                                }
                                              }
                                              if (na.field_j == null) {
                                                this.n(3);
                                                break L177;
                                              } else {
                                                break L177;
                                              }
                                            }
                                          }
                                          L179: {
                                            if (null == na.field_j) {
                                              break L179;
                                            } else {
                                              if (!s.field_i) {
                                                L180: while (true) {
                                                  if (!qh.c(79)) {
                                                    L181: {
                                                      if (null == na.field_j) {
                                                        break L181;
                                                      } else {
                                                        L182: {
                                                          if (-2 == (tl.field_c ^ -1)) {
                                                            if (this.field_Q < 612) {
                                                              break L182;
                                                            } else {
                                                              if (628 <= this.field_Q) {
                                                                break L182;
                                                              } else {
                                                                if (this.field_O < 176) {
                                                                  break L182;
                                                                } else {
                                                                  if (-193 >= (this.field_O ^ -1)) {
                                                                    break L182;
                                                                  } else {
                                                                    if (gh.field_c == 1) {
                                                                      n.field_L = 256;
                                                                      tl.field_c = 0;
                                                                      break L182;
                                                                    } else {
                                                                      break L182;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            break L182;
                                                          }
                                                        }
                                                        L183: {
                                                          if (tl.field_c != 2) {
                                                            break L183;
                                                          } else {
                                                            L184: {
                                                              if ((this.field_Q ^ -1) > -497) {
                                                                break L184;
                                                              } else {
                                                                if (512 <= this.field_Q) {
                                                                  break L184;
                                                                } else {
                                                                  if (208 > this.field_O) {
                                                                    break L184;
                                                                  } else {
                                                                    if (-225 >= (this.field_O ^ -1)) {
                                                                      break L184;
                                                                    } else {
                                                                      if (-2 != (gh.field_c ^ -1)) {
                                                                        break L184;
                                                                      } else {
                                                                        tl.field_c = 0;
                                                                        gh.field_d = null;
                                                                        n.field_L = 256;
                                                                        break L184;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            L185: {
                                                              if ((this.field_Q ^ -1) > -249) {
                                                                break L185;
                                                              } else {
                                                                if ((this.field_Q ^ -1) < -265) {
                                                                  break L185;
                                                                } else {
                                                                  if (460 > this.field_O) {
                                                                    break L185;
                                                                  } else {
                                                                    if (-485 > (this.field_O ^ -1)) {
                                                                      break L185;
                                                                    } else {
                                                                      if (1 == gh.field_c) {
                                                                        fieldTemp$16 = si.field_X - 1;
                                                                        si.field_X = si.field_X - 1;
                                                                        if (fieldTemp$16 < 0) {
                                                                          si.field_X = si.field_X + 3;
                                                                          break L185;
                                                                        } else {
                                                                          break L185;
                                                                        }
                                                                      } else {
                                                                        break L185;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            if (this.field_Q < 376) {
                                                              break L183;
                                                            } else {
                                                              if ((this.field_Q ^ -1) < -393) {
                                                                break L183;
                                                              } else {
                                                                if (460 > this.field_O) {
                                                                  break L183;
                                                                } else {
                                                                  if ((this.field_O ^ -1) < -485) {
                                                                    break L183;
                                                                  } else {
                                                                    if (-2 != (gh.field_c ^ -1)) {
                                                                      break L183;
                                                                    } else {
                                                                      fieldTemp$17 = si.field_X + 1;
                                                                      si.field_X = si.field_X + 1;
                                                                      if (-4 >= (fieldTemp$17 ^ -1)) {
                                                                        si.field_X = si.field_X - 3;
                                                                        break L183;
                                                                      } else {
                                                                        break L183;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        L186: {
                                                          if (3 != tl.field_c) {
                                                            break L186;
                                                          } else {
                                                            if ((this.field_Q ^ -1) > -497) {
                                                              break L186;
                                                            } else {
                                                              if ((this.field_Q ^ -1) <= -513) {
                                                                break L186;
                                                              } else {
                                                                if (208 > this.field_O) {
                                                                  break L186;
                                                                } else {
                                                                  if ((this.field_O ^ -1) <= -225) {
                                                                    break L186;
                                                                  } else {
                                                                    if (-2 == (gh.field_c ^ -1)) {
                                                                      tl.field_c = 0;
                                                                      n.field_L = 256;
                                                                      if (!oc.field_d) {
                                                                        break L186;
                                                                      } else {
                                                                        tl.field_c = 2;
                                                                        oc.field_d = false;
                                                                        break L186;
                                                                      }
                                                                    } else {
                                                                      break L186;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        na.field_j.a(true);
                                                        break L181;
                                                      }
                                                    }
                                                    decompiledRegionSelector0 = 5;
                                                    break L0;
                                                  } else {
                                                    L187: {
                                                      if (null == na.field_j) {
                                                        break L187;
                                                      } else {
                                                        if (-14 != (gi.field_f ^ -1)) {
                                                          break L187;
                                                        } else {
                                                          L188: {
                                                            if ((tl.field_c ^ -1) == -3) {
                                                              break L188;
                                                            } else {
                                                              if ((tl.field_c ^ -1) == -2) {
                                                                break L188;
                                                              } else {
                                                                if (-4 != (tl.field_c ^ -1)) {
                                                                  break L187;
                                                                } else {
                                                                  break L188;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          n.field_L = 256;
                                                          tl.field_c = 0;
                                                          continue L180;
                                                        }
                                                      }
                                                    }
                                                    if (na.field_j != null) {
                                                      na.field_j.b(8);
                                                      continue L180;
                                                    } else {
                                                      continue L180;
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L179;
                                              }
                                            }
                                          }
                                          L189: {
                                            if (s.field_i) {
                                              break L189;
                                            } else {
                                              L190: {
                                                if ((wh.field_c ^ -1) < -2) {
                                                  break L190;
                                                } else {
                                                  if (ni.field_a) {
                                                    break L189;
                                                  } else {
                                                    break L190;
                                                  }
                                                }
                                              }
                                              L191: {
                                                na.field_j = new ij((stellarshard) (this));
                                                if (!ni.field_a) {
                                                  tl.field_c = 4;
                                                  na.field_j.field_l = 8;
                                                  break L191;
                                                } else {
                                                  break L191;
                                                }
                                              }
                                              ni.field_a = false;
                                              break L189;
                                            }
                                          }
                                          decompiledRegionSelector0 = 6;
                                          break L0;
                                        } else {
                                          stackOut_1173_0 = null;
                                          stackOut_1173_1 = wk.field_b[var5];
                                          stackIn_1175_0 = stackOut_1173_0;
                                          stackIn_1175_1 = stackOut_1173_1;
                                          L192: {
                                            if (stackIn_1175_0 != stackIn_1175_1) {
                                              wk.field_b[var5].a(var3, var2_int, param0);
                                              break L192;
                                            } else {
                                              break L192;
                                            }
                                          }
                                          var5++;
                                          continue L174;
                                        }
                                      }
                                    } else {
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    }
                                  } else {
                                    L193: {
                                      if (null == a.field_h[var5]) {
                                        break L193;
                                      } else {
                                        a.field_h[var5].a((byte) -110, var2_int, var3);
                                        break L193;
                                      }
                                    }
                                    var5++;
                                    continue L173;
                                  }
                                }
                              } else {
                                L194: {
                                  if (null != hf.field_e[var5]) {
                                    hf.field_e[var5] = hf.field_e[var5].a(0);
                                    o.field_j = o.field_j + 1;
                                    break L194;
                                  } else {
                                    break L194;
                                  }
                                }
                                var5++;
                                continue L172;
                              }
                            }
                          } else {
                            L195: {
                              if (null != wk.field_b[var5]) {
                                wk.field_b[var5] = wk.field_b[var5].a((byte) -126);
                                break L195;
                              } else {
                                break L195;
                              }
                            }
                            var5++;
                            continue L171;
                          }
                        }
                      } else {
                        stackOut_1132_0 = wk.field_b[var5];
                        stackIn_1134_0 = stackOut_1132_0;
                        L196: {
                          if (stackIn_1134_0 == null) {
                            break L196;
                          } else {
                            if (5 == wk.field_b[var5].field_f) {
                              wk.field_b[var5] = null;
                              break L196;
                            } else {
                              break L196;
                            }
                          }
                        }
                        var5++;
                        continue L170;
                      }
                    }
                  } else {
                    L197: {
                      fk.field_k[var5] = fk.field_k[var5] + (-(var2_int << -887623772) + fk.field_k[var5 - -2]);
                      fk.field_k[1 + var5] = fk.field_k[1 + var5] + (fk.field_k[var5 - -3] - (var3 << 1176895620));
                      if (fk.field_k[var5] >= -2048) {
                        break L197;
                      } else {
                        fk.field_k[var5] = fk.field_k[var5] + 14336;
                        break L197;
                      }
                    }
                    L198: {
                      if ((fk.field_k[var5] ^ -1) >= -12289) {
                        break L198;
                      } else {
                        fk.field_k[var5] = fk.field_k[var5] - 14336;
                        break L198;
                      }
                    }
                    L199: {
                      if ((fk.field_k[1 + var5] ^ -1) > 2047) {
                        fk.field_k[1 + var5] = fk.field_k[1 + var5] + 11776;
                        break L199;
                      } else {
                        break L199;
                      }
                    }
                    L200: {
                      if ((fk.field_k[1 + var5] ^ -1) >= -9729) {
                        break L200;
                      } else {
                        fk.field_k[var5 + 1] = fk.field_k[var5 + 1] - 11776;
                        break L200;
                      }
                    }
                    var5 += 4;
                    var6++;
                    continue L169;
                  }
                }
              } else {
                L201: {
                  if (a.field_h[var5] == null) {
                    break L201;
                  } else {
                    if (14 != a.field_h[var5].field_m) {
                      break L201;
                    } else {
                      if ((var5 ^ -1) <= -1000) {
                        break L201;
                      } else {
                        L202: {
                          if (null == a.field_h[1 + var5]) {
                            break L202;
                          } else {
                            if ((a.field_h[1 + var5].field_m ^ -1) == -15) {
                              break L201;
                            } else {
                              break L202;
                            }
                          }
                        }
                        var6_ref_qe = a.field_h[var5];
                        a.field_h[var5] = a.field_h[1 + var5];
                        a.field_h[1 + var5] = var6_ref_qe;
                        break L201;
                      }
                    }
                  }
                }
                L203: {
                  if (a.field_h[var5] == null) {
                    break L203;
                  } else {
                    L204: {
                      if (a.field_h[var5].field_m == -1) {
                        var2_int = (int)a.field_h[var5].field_a;
                        var3 = (int)a.field_h[var5].field_l;
                        break L204;
                      } else {
                        if (a.field_h[var5].field_m == 11) {
                          break L204;
                        } else {
                          L205: {
                            var4++;
                            if (1 == a.field_h[var5].field_m) {
                              var4 += 2;
                              break L205;
                            } else {
                              break L205;
                            }
                          }
                          L206: {
                            if (a.field_h[var5].field_m != 5) {
                              break L206;
                            } else {
                              var4 += 2;
                              break L206;
                            }
                          }
                          L207: {
                            if (3 != a.field_h[var5].field_m) {
                              break L207;
                            } else {
                              var4 += 2;
                              break L207;
                            }
                          }
                          L208: {
                            if (7 != a.field_h[var5].field_m) {
                              break L208;
                            } else {
                              var4 += 4;
                              break L208;
                            }
                          }
                          L209: {
                            if (6 == a.field_h[var5].field_m) {
                              var4 += 4;
                              break L209;
                            } else {
                              break L209;
                            }
                          }
                          if ((a.field_h[var5].field_m ^ -1) == -15) {
                            var4 += 20;
                            break L204;
                          } else {
                            break L204;
                          }
                        }
                      }
                    }
                    a.field_h[var5] = a.field_h[var5].a(-95);
                    break L203;
                  }
                }
                var5++;
                continue L158;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.CB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (!param1) {
                break L1;
              } else {
                var4_int += 4;
                break L1;
              }
            }
            L2: {
              if (param2 == 6) {
                break L2;
              } else {
                field_T = 20;
                break L2;
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                var4_int += 2;
                break L3;
              }
            }
            L4: {
              if (!param3) {
                break L4;
              } else {
                var4_int++;
                break L4;
              }
            }
            stackOut_12_0 = mh.field_h[var4_int];
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var4), "stellarshard.EB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0;
    }

    final void f(byte param0) {
        RuntimeException var2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != s.field_e) {
                nd.a(-26621, s.field_e);
                s.field_e.a(ic.field_d, -101);
                s.field_e = null;
                qd.field_j.requestFocus();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == ac.field_h) {
                break L2;
              } else {
                ac.field_h.e();
                break L2;
              }
            }
            if (param0 > 47) {
              L3: {
                if (null == ka.field_m) {
                  break L3;
                } else {
                  ka.field_m.e();
                  break L3;
                }
              }
              t.a(false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.FA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_B;
        try {
          L0: {
            L1: {
              stellarshard.r(50);
              ni.a(-78);
              eb.a(-1);
              ob.a(30063);
              rl.a((byte) -84);
              rb.m(-12);
              wg.a((byte) -107);
              ac.b(-53);
              be.a((byte) -20);
              fe.a(31147);
              ti.a();
              pf.a(30300);
              t.a(param0 ^ 6079);
              wi.a((byte) -93);
              ka.a((byte) -14);
              ih.a(38858);
              te.a((byte) -84);
              hj.a(121);
              ak.a(true);
              wd.a((byte) 104);
              ca.a(false);
              qj.a((byte) -69);
              hd.a((byte) -41);
              nj.a(param0 ^ 49);
              cj.a(0);
              ed.a(param0 + 30);
              bl.a(false);
              sf.a(false);
              ci.c(-1);
              vi.b((byte) 82);
              fj.a((byte) 59);
              va.a((byte) 88);
              jb.a(0);
              vl.a(-118);
              mb.a(false);
              oj.a(true);
              jj.a(param0 + 19045);
              d.e();
              ba.d();
              ag.a((byte) 126);
              gg.b((byte) -127);
              fb.c(-2918);
              rk.a(true);
              vh.b((byte) 48);
              fh.a((byte) 89);
              jf.a(-15917);
              ha.i(param0 + 244);
              pk.a((byte) 96);
              cc.b();
              ie.e(-28692);
              ah.a((byte) -31);
              ra.b(-14755);
              qf.a(-15967);
              gf.a(-118);
              bd.a();
              de.a(4);
              bf.a(2);
              qd.b(54);
              eh.a((byte) 5);
              k.a((byte) 98);
              h.a((byte) 45);
              ei.g((byte) 77);
              jg.e(true);
              pg.m(7694);
              ck.m(-121);
              mj.l(120);
              se.e((byte) 9);
              la.a(param0 ^ -16);
              lj.h(120);
              am.b(param0 ^ 36);
              hc.a(param0 ^ -21153);
              lg.a(param0 ^ 69);
              lh.a((byte) -16);
              sl.a(-127);
              wf.b(param0 + 227);
              qh.a(param0 + -15392);
              tj.a();
              ad.c();
              mi.a();
              gk.a(param0 + 129);
              fc.a((byte) 86);
              tf.b(param0 + 22);
              l.a(0);
              nk.a((byte) 52);
              o.a(1);
              ve.a(-9746);
              bi.e(0);
              tk.a((byte) -86);
              jd.a(-126);
              ib.a(0);
              ok.b((byte) -30);
              if (param0 == -128) {
                break L1;
              } else {
                this.l((byte) 47);
                break L1;
              }
            }
            mf.a(119);
            ue.b((byte) -99);
            oe.a(0);
            ua.a((byte) -50);
            sk.a(true);
            a.a(-3323);
            qa.c();
            vd.a(94);
            kc.a(true);
            wj.d((byte) 92);
            al.b(param0 + 128);
            ph.h(param0 ^ -15);
            el.h(param0 + 186);
            wc.a(true);
            kb.a((byte) 37);
            rh.a(param0 + 26);
            ki.e(param0 + 16512);
            na.b(124);
            tg.b((byte) 0);
            dj.a(4);
            id.a(param0 + 1392322593);
            wh.b(-1);
            n.c((byte) -11);
            fl.a(43);
            ke.a(false);
            ng.a((byte) -60);
            eg.b(-89);
            aa.a((byte) 77);
            si.f(-16412);
            sb.a((byte) 105);
            hi.a((byte) -92);
            e.a(186);
            vj.a((byte) 104);
            i.b(64);
            j.a();
            mg.a(true);
            lb.a((byte) 122);
            og.a((byte) 78);
            bb.a(false);
            tc.e(-64);
            hh.a(25434);
            df.b(11324);
            vk.a((byte) 112);
            rj.b(true);
            ig.a(-8278);
            dg.h(32);
            ui.e((byte) -29);
            g.d((byte) 109);
            ug.c(param0 ^ -72);
            q.a((byte) 84);
            oc.a(0);
            ch.a((byte) -56);
            od.d((byte) 11);
            cm.a(-118);
            wk.a((byte) 31);
            wa.b(0);
            mc.a(17913);
            dd.b(-26269);
            pe.a(param0 ^ -126);
            ce.a((byte) 125);
            nl.a((byte) 64);
            rc.d(23805);
            mh.a(2188);
            sc.b();
            gh.a((byte) 125);
            we.b((byte) 116);
            pl.q(0);
            ae.m(122);
            wl.k(115);
            nc.e(true);
            ul.a(160);
            rg.d(true);
            ii.a((byte) 25);
            cd.d((byte) 122);
            nd.h(-94);
            lk.d(67);
            aj.a((byte) 101);
            sj.e((byte) 23);
            fg.g(param0 ^ -128);
            nb.a((byte) 105);
            dh.a();
            sg.a(-29297);
            pd.b((byte) 117);
            sa.c(-17002);
            ol.a(true);
            dl.i(80);
            of.d((byte) -120);
            li.a((byte) 89);
            ai.a(-1);
            bg.a((byte) -117);
            gj.d((byte) -66);
            ld.g(param0 + 13566);
            bc.b((byte) 55);
            td.b((byte) -17);
            ga.a((byte) 3);
            s.a(false);
            u.a(540);
            b.b(true);
            ll.b(512);
            vg.c(-7392);
            il.d(param0 ^ 5634);
            kf.a((byte) 63);
            oa.i(-80);
            hk.a(false);
            nf.a(65535);
            uf.a((byte) 43);
            fd.g(-30900);
            ta.a(true);
            vc.a(-1);
            he.a((byte) -82);
            kl.c((byte) -106);
            af.a(54);
            fk.a(param0 ^ -24024);
            uc.a(-8749);
            ml.a((byte) -102);
            bk.a(-127);
            th.a(-116);
            fa.a(false);
            vf.d(false);
            bh.a((byte) -120);
            nh.b(245);
            hf.b(-27159);
            ma.a((byte) 6);
            mk.a((byte) -64);
            le.a(param0 ^ 63);
            uj.b(0);
            ge.b(false);
            lc.f(3988);
            qb.g(21403);
            ef.a(false);
            kk.e((byte) -61);
            ea.g((byte) 117);
            rd.a((byte) -83);
            ja.a((byte) -121);
            cg.a(param0 + -26686);
            ic.d((byte) 37);
            wb.a(param0 ^ 61);
            this.field_G = null;
            this.field_H = null;
            this.field_S = null;
            this.field_C = null;
            this.field_N = null;
            this.field_P = null;
            this.field_F = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.IA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        pb discarded$5 = null;
        pb discarded$6 = null;
        pb[] discarded$7 = null;
        pb discarded$8 = null;
        int discarded$9 = 0;
        Object var3 = null;
        pb[] var4 = null;
        int var4_int = 0;
        pb var4_ref = null;
        ek[] var4_array = null;
        gk var4_ref2 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        Object var6 = null;
        int var6_int = 0;
        pb var7 = null;
        pa var7_ref = null;
        int[] var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        bj var10_ref_bj = null;
        int var11 = 0;
        int stackIn_251_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_249_0 = 0;
        var11 = field_B;
        try {
          L0: {
            L1: {
              cl.a((byte) -70);
              if (!param0) {
                break L1;
              } else {
                sg.a(116, ke.field_b);
                break L1;
              }
            }
            if (mf.field_b == null) {
              if (bh.field_a != null) {
                if (null == cm.field_d[0]) {
                  rd.a((byte) -127, 75.0f, ea.field_k);
                  this.d(-20880);
                  discarded$5 = qd.a(bh.field_a, "space", "", (byte) 42);
                  discarded$6 = qd.a(bh.field_a, "nebula", "", (byte) 73);
                  wh.field_e = ml.a("", (byte) 83, bh.field_a, "achievements_lrg");
                  pg.field_hb = ml.a("", (byte) -88, bh.field_a, "explosion");
                  hk.field_l = ml.a("", (byte) 107, bh.field_a, "titlepics");
                  uf.field_g = qd.a(fc.field_a, "unachieved", "basic", (byte) 106);
                  ce.field_a = qd.a(fc.field_a, "locked", "basic", (byte) 60);
                  af.field_n = qd.a(fc.field_a, "orbcoin", "basic", (byte) 111);
                  var4 = new pb[16];
                  var4 = ml.a("", (byte) 85, bh.field_a, "powerups");
                  var5 = 0;
                  L2: while (true) {
                    if (16 <= var5) {
                      var5 = 0;
                      L3: while (true) {
                        if (64 <= var5) {
                          pd.field_h.a((byte) -107);
                          cg.field_c = 0;
                          rg.g(-33);
                          decompiledRegionSelector0 = 9;
                          break L0;
                        } else {
                          cm.field_d[var5] = new pb(96, 96);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      var3 = new pb(96, 96);
                      ((pb) (var3)).e();
                      var4[var5].b(48, 48, 0, 4096);
                      e.field_g[var5] = (pb) (var3);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (cg.field_c < 16) {
                    L4: {
                      rd.a((byte) -47, (float)(80 + cg.field_c), ea.field_k);
                      this.d(-20880);
                      var3 = null;
                      var4_int = 0;
                      if (0 != cg.field_c) {
                        break L4;
                      } else {
                        var3 = pa.a(jf.field_m, "", "asteroid_craters_2");
                        var4_int = 0;
                        break L4;
                      }
                    }
                    L5: {
                      var5 = 1500;
                      if (1 == cg.field_c) {
                        var4_int = 1;
                        var3 = pa.a(jf.field_m, "", "asteroid_craters_3");
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (2 == cg.field_c) {
                        var4_int = 0;
                        var3 = pa.a(jf.field_m, "", "asteroid_iron_2");
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (3 == cg.field_c) {
                        var3 = pa.a(jf.field_m, "", "asteroid_iron_3");
                        var4_int = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if ((cg.field_c ^ -1) == -5) {
                        var4_int = 0;
                        var3 = pa.a(jf.field_m, "", "asteroid_ice_2");
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (5 != cg.field_c) {
                        break L9;
                      } else {
                        var3 = pa.a(jf.field_m, "", "asteroid_ice_3");
                        var4_int = 1;
                        break L9;
                      }
                    }
                    L10: {
                      if (cg.field_c != 6) {
                        break L10;
                      } else {
                        var4_int = 1;
                        var5 = 2000;
                        var3 = pa.a(jf.field_m, "", "shooter_hub");
                        break L10;
                      }
                    }
                    L11: {
                      if (cg.field_c != 7) {
                        break L11;
                      } else {
                        var5 = 2000;
                        var3 = pa.a(jf.field_m, "", "homer_hub");
                        var4_int = 1;
                        break L11;
                      }
                    }
                    L12: {
                      if ((cg.field_c ^ -1) != -9) {
                        break L12;
                      } else {
                        var5 = 2500;
                        var4_int = 2;
                        var3 = pa.a(jf.field_m, "", "asteroid_craters_1");
                        break L12;
                      }
                    }
                    L13: {
                      if (cg.field_c != 9) {
                        break L13;
                      } else {
                        var4_int = 2;
                        var3 = pa.a(jf.field_m, "", "asteroid_iron_1");
                        var5 = 2500;
                        break L13;
                      }
                    }
                    L14: {
                      if (-11 != (cg.field_c ^ -1)) {
                        break L14;
                      } else {
                        var5 = 2500;
                        var3 = pa.a(jf.field_m, "", "asteroid_ice_1");
                        var4_int = 2;
                        break L14;
                      }
                    }
                    L15: {
                      if (-12 == (cg.field_c ^ -1)) {
                        var3 = pa.a(jf.field_m, "", "player");
                        var4_int = 3;
                        rh.field_b = (pa) (var3);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (12 == cg.field_c) {
                        var3 = pa.a(jf.field_m, "", "shooter");
                        var4_int = 4;
                        var5 = 2000;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (13 != cg.field_c) {
                        break L17;
                      } else {
                        var5 = 2000;
                        var3 = pa.a(jf.field_m, "", "homer");
                        var4_int = 2;
                        break L17;
                      }
                    }
                    L18: {
                      if ((cg.field_c ^ -1) == -15) {
                        var5 = 2500;
                        var3 = pa.a(jf.field_m, "", "gravity_well");
                        var4_int = 4;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (cg.field_c == 15) {
                        var5 = 2500;
                        var3 = pa.a(jf.field_m, "", "spinner");
                        var4_int = 4;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    var6_int = 0;
                    L20: while (true) {
                      if (-129 >= (var6_int ^ -1)) {
                        L21: {
                          pd.field_h.a((byte) -107);
                          if ((cg.field_c ^ -1) != -16) {
                            break L21;
                          } else {
                            jf.field_n = ml.a("", (byte) 87, bh.field_a, "bar");
                            jf.field_m = null;
                            break L21;
                          }
                        }
                        cg.field_c = cg.field_c + 1;
                        rg.g(-33);
                        decompiledRegionSelector0 = 10;
                        break L0;
                      } else {
                        L22: {
                          var7_ref = new pa((pa) (var3), false, false, false, false);
                          var8_int = (int)(65536.0 * Math.cos(3.141592653589793 * (double)var6_int / 64.0));
                          var9 = (int)(65536.0 * Math.sin((double)var6_int * 3.141592653589793 / 64.0));
                          if (-4 < (var4_int ^ -1)) {
                            break L22;
                          } else {
                            var7_ref.a(new int[]{0, 0, 0, -65536, 0, 0, 0, -65536, 0, 0, 0, 65536});
                            var7_ref.a(new int[]{0, 0, 0, 65536, 0, 0, 0, 0, -65536, 0, 65536, 0});
                            break L22;
                          }
                        }
                        L23: {
                          var7_ref.a(new int[]{0, 0, 0, var8_int, -var9, 0, var9, var8_int, 0, 0, 0, 65536});
                          if (-4 >= (var4_int ^ -1)) {
                            break L23;
                          } else {
                            var7_ref.a(new int[]{0, 0, 0, var8_int, 0, -var9, 0, 65536, 0, var9, 0, var8_int});
                            var7_ref.a(new int[]{0, 0, 0, 65536, 0, 0, 0, var8_int, -var9, 0, var9, var8_int});
                            break L23;
                          }
                        }
                        L24: {
                          var10_ref_bj = var7_ref.a(128, 341, 50, 50, -50);
                          if (1 != var4_int) {
                            break L24;
                          } else {
                            fe.field_d[cg.field_c][var6_int] = new pb(96, 96);
                            fe.field_d[cg.field_c][var6_int].e();
                            ti.f(0, 0, 96, 96, 0);
                            cc.a();
                            var10_ref_bj.a(0, 0, 0, 0, 0, 0, var5, -1L);
                            fe.field_d[cg.field_c][var6_int].d();
                            break L24;
                          }
                        }
                        L25: {
                          if (0 == var4_int) {
                            fe.field_d[cg.field_c][var6_int] = new pb(96, 96);
                            fe.field_d[cg.field_c][var6_int].e();
                            ti.f(0, 0, 96, 96, 0);
                            cc.a();
                            var10_ref_bj.a(0, 0, 0, 0, 0, 0, var5, -1L);
                            fe.field_d[cg.field_c][var6_int].d();
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          L27: {
                            if (-3 == (var4_int ^ -1)) {
                              break L27;
                            } else {
                              if ((var4_int ^ -1) != -5) {
                                break L26;
                              } else {
                                break L27;
                              }
                            }
                          }
                          rd.field_a[cg.field_c + -8][var6_int >> 1267709602] = new pb(96, 96);
                          rd.field_a[-8 + cg.field_c][var6_int >> 187928066].e();
                          ti.f(0, 0, 96, 96, 0);
                          cc.a();
                          var10_ref_bj.a(0, 0, 0, 0, 0, 0, var5, -1L);
                          rd.field_a[-8 + cg.field_c][var6_int >> 1284941826].d();
                          break L26;
                        }
                        L28: {
                          if ((var4_int ^ -1) != -4) {
                            break L28;
                          } else {
                            cm.field_d[var6_int >> 1356809249] = new pb(96, 96);
                            cm.field_d[var6_int >> 1944614753].e();
                            ti.f(0, 0, 96, 96, 0);
                            cc.a();
                            var10_ref_bj.a(0, 0, 0, 0, 0, 0, 2500, -1L);
                            cm.field_d[var6_int >> -875018111].d();
                            break L28;
                          }
                        }
                        var6_int++;
                        continue L20;
                      }
                    }
                  } else {
                    if (null == l.field_f) {
                      rd.a((byte) -53, 98.0f, ua.field_g);
                      this.d(-20880);
                      fh.field_k = ml.a("", (byte) 98, bh.field_a, "slider");
                      fg.field_P = ml.a("", (byte) 124, bh.field_a, "frame");
                      fg.field_P[4] = null;
                      wc.field_s = qd.a(bh.field_a, "stel", "", (byte) 107);
                      pl.field_R = qd.a(bh.field_a, "lar", "", (byte) 93);
                      aa.field_b = qd.a(bh.field_a, "central_iceblock", "", (byte) 81);
                      discarded$7 = ml.a("", (byte) -32, bh.field_a, "menu");
                      rh.field_a = new pb[12];
                      var3 = null;
                      var4_int = 0;
                      L29: while (true) {
                        if (-13 >= (var4_int ^ -1)) {
                          fa.field_k = new pb[15];
                          var4_int = 0;
                          L30: while (true) {
                            if (var4_int >= 15) {
                              discarded$8 = qd.a(bh.field_a, "title", "", (byte) 119);
                              qj.field_a = ae.a("", "b12", bh.field_a, -115, be.field_d);
                              var4_array = new ek[7];
                              var5_ref_int__ = new int[7];
                              var6_int = 0;
                              L31: while (true) {
                                if (var6_int >= 7) {
                                  var4_array[0] = el.a("keyboard_up", bh.field_a, (byte) -90, "");
                                  var4_array[1] = el.a("keyboard_space", bh.field_a, (byte) -74, "");
                                  var4_array[2] = el.a("keyboard_ctrl", bh.field_a, (byte) -123, "");
                                  var4_array[3] = el.a("keyboard_esc", bh.field_a, (byte) 127, "");
                                  var4_array[4] = el.a("keyboard_left", bh.field_a, (byte) -82, "");
                                  var4_array[5] = el.a("keyboard_right", bh.field_a, (byte) -116, "");
                                  var4_array[6] = el.a("keyboard_down", bh.field_a, (byte) 126, "");
                                  qj.field_a.a(var4_array, var5_ref_int__);
                                  l.field_f = ae.a("", "b122", bh.field_a, -117, be.field_d);
                                  rg.g(-33);
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                } else {
                                  var5_ref_int__[var6_int] = 12;
                                  var6_int++;
                                  continue L31;
                                }
                              }
                            } else {
                              L32: {
                                if (var4_int == 0) {
                                  var3 = ml.a("", (byte) 121, bh.field_a, "anim_shine");
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                              L33: {
                                if (-4 == (var4_int ^ -1)) {
                                  var3 = ml.a("", (byte) 118, bh.field_a, "anim_shine2");
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                              L34: {
                                if (6 != var4_int) {
                                  break L34;
                                } else {
                                  var3 = ml.a("", (byte) 110, bh.field_a, "anim_shine3");
                                  break L34;
                                }
                              }
                              L35: {
                                if (9 == var4_int) {
                                  var3 = ml.a("", (byte) 83, bh.field_a, "anim_shine4");
                                  break L35;
                                } else {
                                  break L35;
                                }
                              }
                              L36: {
                                if ((var4_int ^ -1) == -13) {
                                  var3 = ml.a("", (byte) -25, bh.field_a, "anim_shine5");
                                  break L36;
                                } else {
                                  break L36;
                                }
                              }
                              fa.field_k[var4_int + 0] = (pb) (((Object[]) (var3))[0]);
                              fa.field_k[1 + var4_int] = (pb) (((Object[]) (var3))[1]);
                              fa.field_k[2 + var4_int] = (pb) (((Object[]) (var3))[2]);
                              fa.field_k[0 + var4_int].d();
                              fa.field_k[1 + var4_int].d();
                              fa.field_k[2 + var4_int].d();
                              var4_int += 3;
                              continue L30;
                            }
                          }
                        } else {
                          L37: {
                            if (var4_int != 0) {
                              break L37;
                            } else {
                              var3 = ml.a("", (byte) 94, bh.field_a, "anim_shatter");
                              break L37;
                            }
                          }
                          L38: {
                            if (3 == var4_int) {
                              var3 = ml.a("", (byte) 103, bh.field_a, "anim_shatter2");
                              break L38;
                            } else {
                              break L38;
                            }
                          }
                          L39: {
                            if ((var4_int ^ -1) != -7) {
                              break L39;
                            } else {
                              var3 = ml.a("", (byte) -72, bh.field_a, "anim_shatter3");
                              break L39;
                            }
                          }
                          L40: {
                            if (-10 != (var4_int ^ -1)) {
                              break L40;
                            } else {
                              var3 = ml.a("", (byte) 119, bh.field_a, "anim_shatter4");
                              break L40;
                            }
                          }
                          rh.field_a[var4_int - 0] = (pb) (((Object[]) (var3))[0]);
                          rh.field_a[var4_int + 1] = (pb) (((Object[]) (var3))[1]);
                          rh.field_a[2 + var4_int] = (pb) (((Object[]) (var3))[2]);
                          rh.field_a[var4_int + 0].d();
                          rh.field_a[1 + var4_int].d();
                          rh.field_a[2 + var4_int].d();
                          var4_int += 3;
                          continue L29;
                        }
                      }
                    } else {
                      rd.a((byte) -65, 99.0f, ua.field_g);
                      this.d(-20880);
                      var3 = ml.a("", (byte) 80, bh.field_a, "screenshots");
                      sd.a(qd.a(bh.field_a, "mbfg", "", (byte) 104), (byte) 60, "Stellar Shard");
                      ga.a(-8039, qd.a(bh.field_a, "smalllogo", "", (byte) 124));
                      te.a(8, 129, 1500, 0, qd.a(bh.field_a, "mbpb", "", (byte) 124), 40, 134, 97, 0);
                      q.a(118, (pb[]) (var3));
                      ie.field_u = null;
                      fb.a(192, sg.field_c, 0, (java.applet.Applet) (this), -1, 16777215);
                      var4_ref = new pb(128, 128);
                      mf.field_a = new pb[64];
                      var5 = 0;
                      L41: while (true) {
                        if ((var5 ^ -1) <= -5) {
                          be.field_d = null;
                          bh.field_a = null;
                          rg.g(-33);
                          decompiledRegionSelector0 = 12;
                          break L0;
                        } else {
                          L42: {
                            var6 = null;
                            if (var5 != 0) {
                              break L42;
                            } else {
                              var6 = "stars2";
                              break L42;
                            }
                          }
                          L43: {
                            if (var5 != 1) {
                              break L43;
                            } else {
                              var6 = "stars3";
                              break L43;
                            }
                          }
                          L44: {
                            if ((var5 ^ -1) == -3) {
                              var6 = "stars0";
                              break L44;
                            } else {
                              break L44;
                            }
                          }
                          L45: {
                            if (3 != var5) {
                              break L45;
                            } else {
                              var6 = "stars1";
                              break L45;
                            }
                          }
                          var7 = n.a(qd.a(bh.field_a, (String) (var6), "", (byte) 42), (byte) -42, true);
                          var7.e();
                          ti.d(1, 1, 0, 0, 496, 496);
                          var8 = ti.field_a;
                          var9 = 0;
                          L46: while (true) {
                            if (var8.length <= var9) {
                              var9 = 0;
                              L47: while (true) {
                                if ((var9 ^ -1) <= -5) {
                                  pd.field_h.a((byte) -107);
                                  var5++;
                                  continue L41;
                                } else {
                                  stackOut_249_0 = 0;
                                  stackIn_251_0 = stackOut_249_0;
                                  var10 = stackIn_251_0;
                                  L48: while (true) {
                                    if (var10 >= 4) {
                                      var9++;
                                      continue L47;
                                    } else {
                                      var4_ref.e();
                                      ti.d(2, 2, 126, 126);
                                      var7.e(2 + -var9 * 124, -var10 * 124 - -2);
                                      ti.d(0, 2, 1, 126);
                                      var4_ref.e(-2, 0);
                                      ti.d(1, 2, 2, 126);
                                      var4_ref.e(-1, 0);
                                      ti.d(127, 2, 128, 126);
                                      var4_ref.e(2, 0);
                                      ti.d(126, 2, 127, 126);
                                      var4_ref.e(1, 0);
                                      ti.d(0, 0, 128, 1);
                                      var4_ref.e(0, -2);
                                      ti.d(0, 1, 128, 2);
                                      var4_ref.e(0, -1);
                                      ti.d(0, 127, 128, 128);
                                      var4_ref.e(0, 2);
                                      ti.d(0, 126, 128, 127);
                                      var4_ref.e(0, 1);
                                      mf.field_a[var9 + var10 * 4 + var5 * 16] = var4_ref.a();
                                      var10++;
                                      continue L48;
                                    }
                                  }
                                }
                              }
                            } else {
                              L49: {
                                if ((var8[var9] ^ -1) == -1) {
                                  var8[var9] = 1;
                                  break L49;
                                } else {
                                  break L49;
                                }
                              }
                              var9++;
                              continue L46;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                L50: {
                  rd.a((byte) -60, 100.0f, ve.field_b);
                  this.d(-20880);
                  kl.field_k = 16777215;
                  ul.field_G = 10742263;
                  if (param1 < -60) {
                    break L50;
                  } else {
                    discarded$9 = this.a(70, -17);
                    break L50;
                  }
                }
                L51: {
                  vf.field_L = fe.field_c;
                  lg.field_b = 5883647;
                  aj.a(50, 11236);
                  ef.a(50, (byte) 63);
                  fe.field_c = new d(oe.field_a);
                  if (vf.field_L != null) {
                    nj.field_o.b(vf.field_L);
                    vf.field_L.c();
                    nj.field_o.a(vf.field_L);
                    break L51;
                  } else {
                    break L51;
                  }
                }
                L52: {
                  vf.field_L = fe.field_c;
                  nj.field_o.a(vf.field_L);
                  vf.field_L.d(ai.field_c / 2);
                  if (ah.a(-1)) {
                    break L52;
                  } else {
                    be.field_g = ab.a(-5094, 4);
                    wh.a(-124);
                    break L52;
                  }
                }
                hf.field_f = true;
                rg.g(-33);
                decompiledRegionSelector0 = 13;
                break L0;
              }
            } else {
              L53: {
                if (!wk.field_a.a((byte) -36)) {
                  break L53;
                } else {
                  if (!wk.field_a.c((byte) -111)) {
                    break L53;
                  } else {
                    L54: {
                      if (!mf.field_b.a((byte) -36)) {
                        break L54;
                      } else {
                        if (mf.field_b.c((byte) -111)) {
                          L55: {
                            if (!ka.field_n.a((byte) -36)) {
                              break L55;
                            } else {
                              if (ka.field_n.c((byte) -111)) {
                                L56: {
                                  if (!bh.field_a.a((byte) -36)) {
                                    break L56;
                                  } else {
                                    if (!bh.field_a.c((byte) -111)) {
                                      break L56;
                                    } else {
                                      L57: {
                                        if (!fc.field_a.a((byte) -36)) {
                                          break L57;
                                        } else {
                                          if (!fc.field_a.a("basic", (byte) -109)) {
                                            break L57;
                                          } else {
                                            L58: {
                                              if (!be.field_d.a((byte) -36)) {
                                                break L58;
                                              } else {
                                                if (be.field_d.c((byte) -111)) {
                                                  L59: {
                                                    if (!jf.field_m.a((byte) -36)) {
                                                      break L59;
                                                    } else {
                                                      if (jf.field_m.c((byte) -111)) {
                                                        rd.a((byte) -72, 70.0f, ve.field_b);
                                                        if (param0) {
                                                          L60: {
                                                            hi.b((byte) 109);
                                                            this.d(-20880);
                                                            var3 = new qh(22050, ba.field_m);
                                                            if (pk.a(-12663, 0)) {
                                                              sb.field_e = new ud[61];
                                                              break L60;
                                                            } else {
                                                              sb.field_e = new ud[41];
                                                              break L60;
                                                            }
                                                          }
                                                          L61: {
                                                            sb.field_e[0] = kj.a(wk.field_a, "", "afterburner").a().a((qh) (var3));
                                                            sb.field_e[1] = kj.a(wk.field_a, "", "bounce-gun").a().a((qh) (var3));
                                                            sb.field_e[2] = kj.a(wk.field_a, "", "collision_asteroid").a().a((qh) (var3));
                                                            sb.field_e[3] = kj.a(wk.field_a, "", "collision_ice").a().a((qh) (var3));
                                                            sb.field_e[4] = kj.a(wk.field_a, "", "collision_iron").a().a((qh) (var3));
                                                            sb.field_e[5] = kj.a(wk.field_a, "", "combined-homer_loop_1000ms").a().a((qh) (var3));
                                                            sb.field_e[6] = kj.a(wk.field_a, "", "combined-shooter_loop_1000ms").a().a((qh) (var3));
                                                            sb.field_e[7] = kj.a(wk.field_a, "", "dual-laser_loop_100ms").a().a((qh) (var3));
                                                            sb.field_e[8] = kj.a(wk.field_a, "", "enemy_shoot").a().a((qh) (var3));
                                                            sb.field_e[9] = kj.a(wk.field_a, "", "explosion_asteroid_large").a().a((qh) (var3));
                                                            sb.field_e[10] = kj.a(wk.field_a, "", "explosion_asteroid_medium").a().a((qh) (var3));
                                                            sb.field_e[11] = kj.a(wk.field_a, "", "explosion_asteroid_small").a().a((qh) (var3));
                                                            sb.field_e[12] = kj.a(wk.field_a, "", "explosion_enemy").a().a((qh) (var3));
                                                            sb.field_e[13] = kj.a(wk.field_a, "", "explosion_ice_large").a().a((qh) (var3));
                                                            sb.field_e[14] = kj.a(wk.field_a, "", "explosion_ice_medium").a().a((qh) (var3));
                                                            sb.field_e[15] = kj.a(wk.field_a, "", "explosion_ice_small").a().a((qh) (var3));
                                                            sb.field_e[16] = kj.a(wk.field_a, "", "explosion_iron_large").a().a((qh) (var3));
                                                            sb.field_e[17] = kj.a(wk.field_a, "", "explosion_iron_medium").a().a((qh) (var3));
                                                            sb.field_e[18] = kj.a(wk.field_a, "", "explosion_iron_small").a().a((qh) (var3));
                                                            sb.field_e[19] = kj.a(wk.field_a, "", "explosion_player").a().a((qh) (var3));
                                                            sb.field_e[20] = kj.a(wk.field_a, "", "flame-cannon_loop_300-500ms").a().a((qh) (var3));
                                                            sb.field_e[21] = kj.a(wk.field_a, "", "heavy-cannon").a().a((qh) (var3));
                                                            sb.field_e[22] = kj.a(wk.field_a, "", "hex-cannon_70ms_loop").a().a((qh) (var3));
                                                            sb.field_e[23] = kj.a(wk.field_a, "", "homing_loop_200ms").a().a((qh) (var3));
                                                            sb.field_e[24] = kj.a(wk.field_a, "", "laser_70ms_loop").a().a((qh) (var3));
                                                            sb.field_e[25] = kj.a(wk.field_a, "", "mega-laser_loop_500ms").a().a((qh) (var3));
                                                            sb.field_e[26] = kj.a(wk.field_a, "", "mine_loop_200ms").a().a((qh) (var3));
                                                            sb.field_e[27] = kj.a(wk.field_a, "", "narrowgun").a().a((qh) (var3));
                                                            sb.field_e[28] = kj.a(wk.field_a, "", "nuke_explosion").a().a((qh) (var3));
                                                            sb.field_e[29] = kj.a(wk.field_a, "", "powerup_invulnerability").a().a((qh) (var3));
                                                            sb.field_e[30] = kj.a(wk.field_a, "", "powerup_phase_shield").a().a((qh) (var3));
                                                            sb.field_e[31] = kj.a(wk.field_a, "", "powerup_shield").a().a((qh) (var3));
                                                            sb.field_e[32] = kj.a(wk.field_a, "", "powerup_weapon").a().a((qh) (var3));
                                                            sb.field_e[33] = kj.a(wk.field_a, "", "quad-cannon").a().a((qh) (var3));
                                                            sb.field_e[34] = kj.a(wk.field_a, "", "super-cannon").a().a((qh) (var3));
                                                            sb.field_e[35] = kj.a(wk.field_a, "", "thruster").a().a((qh) (var3));
                                                            sb.field_e[36] = kj.a(wk.field_a, "", "title_explosion").a().a((qh) (var3));
                                                            sb.field_e[37] = kj.a(wk.field_a, "", "title_shinesound").a().a((qh) (var3));
                                                            sb.field_e[38] = kj.a(wk.field_a, "", "trigun").a().a((qh) (var3));
                                                            sb.field_e[39] = kj.a(wk.field_a, "", "wavegun").a().a((qh) (var3));
                                                            sb.field_e[40] = kj.a(wk.field_a, "", "hit").a().a((qh) (var3));
                                                            if (pk.a(-12663, 0)) {
                                                              sb.field_e[41] = kj.a(wk.field_a, "", "collect_ghost").a().a((qh) (var3));
                                                              sb.field_e[42] = kj.a(wk.field_a, "", "eerie_creak1").a().a((qh) (var3));
                                                              sb.field_e[43] = kj.a(wk.field_a, "", "eerie_creak2").a().a((qh) (var3));
                                                              sb.field_e[44] = kj.a(wk.field_a, "", "eerie_creak3").a().a((qh) (var3));
                                                              sb.field_e[45] = kj.a(wk.field_a, "", "eerie_creak4").a().a((qh) (var3));
                                                              sb.field_e[46] = ad.a(mf.field_b, "", "heartbeat").b().a((qh) (var3));
                                                              sb.field_e[47] = kj.a(wk.field_a, "", "howling1").a().a((qh) (var3));
                                                              sb.field_e[48] = kj.a(wk.field_a, "", "howling2").a().a((qh) (var3));
                                                              sb.field_e[49] = kj.a(wk.field_a, "", "howling3").a().a((qh) (var3));
                                                              sb.field_e[50] = kj.a(wk.field_a, "", "howling4").a().a((qh) (var3));
                                                              sb.field_e[51] = kj.a(wk.field_a, "", "static2").a().a((qh) (var3));
                                                              sb.field_e[52] = kj.a(wk.field_a, "", "static3").a().a((qh) (var3));
                                                              sb.field_e[53] = kj.a(wk.field_a, "", "static4").a().a((qh) (var3));
                                                              sb.field_e[54] = kj.a(wk.field_a, "", "trans1").a().a((qh) (var3));
                                                              sb.field_e[55] = kj.a(wk.field_a, "", "trans2").a().a((qh) (var3));
                                                              sb.field_e[56] = kj.a(wk.field_a, "", "trans3").a().a((qh) (var3));
                                                              sb.field_e[57] = ad.a(mf.field_b, "", "cyber_laugh1").b().a((qh) (var3));
                                                              sb.field_e[58] = ad.a(mf.field_b, "", "cyber_laugh2").b().a((qh) (var3));
                                                              sb.field_e[59] = ad.a(mf.field_b, "", "cyber_laugh4").b().a((qh) (var3));
                                                              sb.field_e[60] = ad.a(mf.field_b, "", "cyber_laugh5_rev").b().a((qh) (var3));
                                                              break L61;
                                                            } else {
                                                              break L61;
                                                            }
                                                          }
                                                          L62: {
                                                            var4_ref2 = new gk(wk.field_a, mf.field_b);
                                                            wk.field_a = null;
                                                            mf.field_b = null;
                                                            if (!pk.a(-12663, 0)) {
                                                              oe.field_a = ij.a(576, var4_ref2, "music/Stellar_Shard_ingame", ka.field_n, "");
                                                              break L62;
                                                            } else {
                                                              oe.field_a = ij.a(576, var4_ref2, "music/Stellar_Shard_Halloween", ka.field_n, "");
                                                              break L62;
                                                            }
                                                          }
                                                          ka.field_n = null;
                                                          rg.g(-33);
                                                          decompiledRegionSelector0 = 8;
                                                          break L0;
                                                        } else {
                                                          decompiledRegionSelector0 = 7;
                                                          break L0;
                                                        }
                                                      } else {
                                                        break L59;
                                                      }
                                                    }
                                                  }
                                                  rd.a((byte) -115, 60.0f, ak.a("", he.field_o, jf.field_m, (byte) 51, lj.field_B));
                                                  decompiledRegionSelector0 = 6;
                                                  break L0;
                                                } else {
                                                  break L58;
                                                }
                                              }
                                            }
                                            rd.a((byte) -105, 50.0f, ak.a("", mb.field_c, be.field_d, (byte) 51, le.field_l));
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          }
                                        }
                                      }
                                      rd.a((byte) -96, 40.0f, ak.a("basic", lg.field_e, fc.field_a, (byte) 51, am.field_e));
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    }
                                  }
                                }
                                rd.a((byte) -89, 30.0f, ak.a("", lg.field_e, bh.field_a, (byte) 51, am.field_e));
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                break L55;
                              }
                            }
                          }
                          rd.a((byte) -63, 20.0f, ak.a("", qh.field_f, ka.field_n, (byte) 51, qd.field_e));
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L54;
                        }
                      }
                    }
                    rd.a((byte) -90, 10.0f, ak.a("", qh.field_f, mf.field_b, (byte) 51, qd.field_e));
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              rd.a((byte) -71, 8.0f, ak.a("", ma.field_o, wk.field_a, (byte) 51, hc.field_k));
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (var3), "stellarshard.UA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return;
                                } else {
                                  return;
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

    private final void n(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var2_array = null;
        fk var3_ref_fk = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = field_B;
        try {
          L0: {
            L1: {
              field_U[8] = field_U[8] + 1;
              if (5 >= field_U[8]) {
                break L1;
              } else {
                field_U[8] = 5;
                break L1;
              }
            }
            L2: {
              cl.field_a = cl.field_a + si.field_gb;
              gg.field_i = gg.field_i + 1;
              lg.field_f = lg.field_f - 127;
              hk.field_p = hk.field_p + 127;
              if (7 != e.field_e) {
                break L2;
              } else {
                fieldTemp$4 = vh.field_e;
                vh.field_e = vh.field_e + 1;
                if (fieldTemp$4 != 5) {
                  break L2;
                } else {
                  hj.a(255, 0, 1);
                  break L2;
                }
              }
            }
            L3: {
              if ((e.field_e ^ -1) != -9) {
                break L3;
              } else {
                fieldTemp$5 = sf.field_b;
                sf.field_b = sf.field_b + 1;
                if ((fieldTemp$5 ^ -1) != -6) {
                  break L3;
                } else {
                  hj.a(253, 2, 1);
                  break L3;
                }
              }
            }
            L4: {
              if ((e.field_e ^ -1) == -10) {
                fieldTemp$6 = sj.field_K;
                sj.field_K = sj.field_K + 1;
                if (fieldTemp$6 == 5) {
                  hj.a(252, 3, 1);
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if (e.field_e == 10) {
                fieldTemp$7 = ua.field_d;
                ua.field_d = ua.field_d + 1;
                if ((fieldTemp$7 ^ -1) == -6) {
                  hj.a(251, 4, 1);
                  break L5;
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L6: {
              qi.field_a = qi.field_a + 1;
              if (e.field_e == -1) {
                field_U[0] = 5;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if ((qi.field_a ^ -1) < (-1 + mg.field_t ^ -1)) {
                L8: {
                  var2_int = of.field_A;
                  of.field_A = Math.max(qi.field_a, of.field_A);
                  if ((of.field_A ^ -1) < -51) {
                    of.field_A = 50;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var3_ref_fk = new fk(0, -1 + qi.field_a, 0, 0, 0, 0);
                if (ah.a(-1)) {
                  tf.field_a.b(-113, var3_ref_fk);
                  of.field_A = var2_int;
                  break L7;
                } else {
                  hf.a(var3_ref_fk, 89, 5);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L9: {
              if (10 > qi.field_a) {
                break L9;
              } else {
                if (-1 > (nc.field_A ^ -1)) {
                  break L9;
                } else {
                  if (-1 > (mk.field_k ^ -1)) {
                    break L9;
                  } else {
                    if (!s.field_i) {
                      break L9;
                    } else {
                      nc.field_A = 1500;
                      break L9;
                    }
                  }
                }
              }
            }
            L10: {
              if (null == this.field_F) {
                this.field_F = new pb(640, 480);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (-51 <= (qi.field_a ^ -1)) {
                break L11;
              } else {
                qi.field_a = 50;
                if (-1 <= (nc.field_A ^ -1)) {
                  nc.field_A = 1500;
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            L12: {
              if ((qi.field_a ^ -1) != -2) {
                break L12;
              } else {
                this.field_J = 100;
                break L12;
              }
            }
            L13: {
              if (10 != qi.field_a) {
                break L13;
              } else {
                if (!nf.field_r) {
                  break L13;
                } else {
                  hj.a(249, 6, 1);
                  break L13;
                }
              }
            }
            L14: {
              if (-21 != (qi.field_a ^ -1)) {
                break L14;
              } else {
                if (nf.field_r) {
                  hj.a(248, 7, 1);
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            L15: {
              if (-11 != (qi.field_a ^ -1)) {
                break L15;
              } else {
                if (!field_K) {
                  break L15;
                } else {
                  hj.a(247, 8, 1);
                  break L15;
                }
              }
            }
            L16: {
              if (30 != qi.field_a) {
                break L16;
              } else {
                if (!field_K) {
                  break L16;
                } else {
                  hj.a(246, 9, 1);
                  break L16;
                }
              }
            }
            L17: {
              if (-51 != (qi.field_a ^ -1)) {
                break L17;
              } else {
                if (!field_K) {
                  break L17;
                } else {
                  hj.a(245, 10, param0 + -2);
                  break L17;
                }
              }
            }
            L18: {
              var2_array = new int[16];
              if (-2 != (qi.field_a ^ -1)) {
                break L18;
              } else {
                var2_array[1] = 4;
                break L18;
              }
            }
            L19: {
              if (2 != qi.field_a) {
                break L19;
              } else {
                var2_array[1] = 6;
                break L19;
              }
            }
            L20: {
              if (qi.field_a != param0) {
                break L20;
              } else {
                var2_array[1] = 4;
                var2_array[3] = 4;
                break L20;
              }
            }
            L21: {
              if (qi.field_a == 6) {
                var2_array[5] = 6;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (qi.field_a != 4) {
                break L22;
              } else {
                var2_array[13] = 2;
                var2_array[1] = 8;
                break L22;
              }
            }
            L23: {
              if (-6 == (qi.field_a ^ -1)) {
                var2_array[12] = 2;
                var2_array[3] = 8;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if ((qi.field_a ^ -1) == -9) {
                var2_array[5] = 8;
                var2_array[7] = 1;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if ((qi.field_a ^ -1) != -8) {
                break L25;
              } else {
                var2_array[15] = 2;
                var2_array[1] = 10;
                break L25;
              }
            }
            L26: {
              if ((qi.field_a ^ -1) != -10) {
                break L26;
              } else {
                var2_array[6] = 1;
                var2_array[3] = 8;
                break L26;
              }
            }
            L27: {
              if (qi.field_a != 10) {
                break L27;
              } else {
                var2_array[14] = 1;
                var2_array[1] = 5;
                break L27;
              }
            }
            L28: {
              if (10 < qi.field_a) {
                L29: {
                  if (qi.field_a % 10 == 1) {
                    var2_array[1] = qi.field_a / 2 - -5;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (4 == qi.field_a % 10) {
                    var2_array[15] = qi.field_a / 10 - -1;
                    var2_array[5] = qi.field_a / 3 - -5;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (3 == qi.field_a % 10) {
                    var2_array[12] = qi.field_a / 5;
                    var2_array[3] = 5 + qi.field_a / 3;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if ((qi.field_a % 10 ^ -1) == -3) {
                    var2_array[1] = 5 + qi.field_a / 3;
                    var2_array[13] = qi.field_a / 5;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (qi.field_a % 10 == 5) {
                    var2_array[1] = qi.field_a / 4 + 3;
                    var2_array[14] = 1;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if ((qi.field_a % 10 ^ -1) == -8) {
                    var2_array[6] = qi.field_a / 10;
                    var2_array[5] = qi.field_a / 3 - -5;
                    var2_array[12] = qi.field_a / 5;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (6 == qi.field_a % 10) {
                    var2_array[7] = qi.field_a / 10;
                    var2_array[13] = qi.field_a / 5;
                    var2_array[3] = qi.field_a / 3 - -5;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (8 != qi.field_a % 10) {
                    break L36;
                  } else {
                    var2_array[15] = qi.field_a / 6;
                    var2_array[1] = qi.field_a / 4 + 3;
                    break L36;
                  }
                }
                L37: {
                  if (qi.field_a % 10 != 9) {
                    break L37;
                  } else {
                    var2_array[3] = qi.field_a / 6;
                    var2_array[1] = qi.field_a / 6;
                    var2_array[5] = qi.field_a / 6;
                    break L37;
                  }
                }
                L38: {
                  if (-21 == (qi.field_a ^ -1)) {
                    var2_array[14] = 1;
                    var2_array[7] = 10;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if (-31 != (qi.field_a ^ -1)) {
                    break L39;
                  } else {
                    var2_array[14] = 2;
                    var2_array[6] = 10;
                    break L39;
                  }
                }
                L40: {
                  if (qi.field_a != 40) {
                    break L40;
                  } else {
                    var2_array[14] = 4;
                    var2_array[6] = 5;
                    var2_array[7] = 5;
                    var2_array[15] = 5;
                    break L40;
                  }
                }
                L41: {
                  if (qi.field_a != 50) {
                    break L41;
                  } else {
                    var2_array[14] = qi.field_a / 5;
                    break L41;
                  }
                }
                if (-1 != (qi.field_a % 10 ^ -1)) {
                  break L28;
                } else {
                  if ((qi.field_a ^ -1) >= -51) {
                    break L28;
                  } else {
                    var2_array[14] = qi.field_a / 5;
                    break L28;
                  }
                }
              } else {
                break L28;
              }
            }
            var3 = 0;
            L42: while (true) {
              if ((var3 ^ -1) <= -17) {
                break L0;
              } else {
                var4 = 0;
                L43: while (true) {
                  if ((var4 ^ -1) <= (var2_array[var3] ^ -1)) {
                    var3++;
                    continue L42;
                  } else {
                    a.field_h[pl.e((byte) 63)] = new qe(var3);
                    var4++;
                    continue L43;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.FB(" + param0 + ')');
        }
    }

    final void l(byte param0) {
        RuntimeException var2 = null;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -107) {
                break L1;
              } else {
                this.field_H = (pi) null;
                break L1;
              }
            }
            L2: {
              if (-1 <= (mk.field_k ^ -1)) {
                break L2;
              } else {
                if (!lh.a(ic.field_d, (byte) 115)) {
                  break L2;
                } else {
                  s.field_e = wb.a(0, -107, 480, ic.field_d, 640, 0);
                  if (null != s.field_e) {
                    nc.a(s.field_e, (byte) 121);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              stackOut_13_0 = qj.field_a.field_N;
              stackOut_13_1 = 0;
              stackOut_13_2 = l.field_f.field_N;
              stackIn_24_0 = stackOut_13_0;
              stackIn_24_1 = stackOut_13_1;
              stackIn_24_2 = stackOut_13_2;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              if (ah.a(-1)) {
                stackOut_24_0 = stackIn_24_0;
                stackOut_24_1 = stackIn_24_1;
                stackOut_24_2 = stackIn_24_2;
                stackOut_24_3 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                stackIn_25_3 = stackOut_24_3;
                break L3;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = stackIn_14_1;
                stackOut_14_2 = stackIn_14_2;
                stackIn_23_0 = stackOut_14_0;
                stackIn_23_1 = stackOut_14_1;
                stackIn_23_2 = stackOut_14_2;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                stackIn_15_2 = stackOut_14_2;
                if (mk.field_k <= 0) {
                  stackOut_23_0 = stackIn_23_0;
                  stackOut_23_1 = stackIn_23_1;
                  stackOut_23_2 = stackIn_23_2;
                  stackOut_23_3 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  stackIn_25_3 = stackOut_23_3;
                  break L3;
                } else {
                  stackOut_15_0 = stackIn_15_0;
                  stackOut_15_1 = stackIn_15_1;
                  stackOut_15_2 = stackIn_15_2;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackOut_17_0 = stackIn_17_0;
                  stackOut_17_1 = stackIn_17_1;
                  stackOut_17_2 = stackIn_17_2;
                  stackIn_22_0 = stackOut_17_0;
                  stackIn_22_1 = stackOut_17_1;
                  stackIn_22_2 = stackOut_17_2;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  if (null == s.field_e) {
                    stackOut_22_0 = stackIn_22_0;
                    stackOut_22_1 = stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = 3;
                    stackIn_25_0 = stackOut_22_0;
                    stackIn_25_1 = stackOut_22_1;
                    stackIn_25_2 = stackOut_22_2;
                    stackIn_25_3 = stackOut_22_3;
                    break L3;
                  } else {
                    stackOut_18_0 = stackIn_18_0;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = stackIn_18_2;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    stackOut_20_0 = stackIn_20_0;
                    stackOut_20_1 = stackIn_20_1;
                    stackOut_20_2 = stackIn_20_2;
                    stackOut_20_3 = 2;
                    stackIn_25_0 = stackOut_20_0;
                    stackIn_25_1 = stackOut_20_1;
                    stackIn_25_2 = stackOut_20_2;
                    stackIn_25_3 = stackOut_20_3;
                    break L3;
                  }
                }
              }
            }
            vf.a(stackIn_25_0, stackIn_25_1, stackIn_25_2, stackIn_25_3, (pb[]) null, 320, qj.field_a, 8, (pb[]) null, 8, 8 + qj.field_a.field_N, l.field_f.field_N, 260, true, 240, l.field_f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.WA(" + param0 + ')');
        }
    }

    static long a(long param0, long param1) {
        RuntimeException var4 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          L0: {
            stackOut_0_0 = param0 & param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var4), "stellarshard.JB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final void d(int param0) {
        int incrementValue$9 = 0;
        String discarded$10 = null;
        int discarded$11 = 0;
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6_int = 0;
        String var6 = null;
        jf var6_ref = null;
        int var7 = 0;
        Object var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_87_0 = null;
        Object stackIn_121_0 = null;
        int stackIn_133_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_490_0 = 0;
        Object stackIn_495_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        va stackOut_4_0 = null;
        java.awt.Canvas stackOut_2_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        RuntimeException stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        boolean stackOut_9_2 = false;
        int stackOut_489_0 = 0;
        boolean stackOut_487_0 = false;
        java.awt.Canvas stackOut_494_0 = null;
        va stackOut_492_0 = null;
        int stackOut_132_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_134_0 = 0;
        Object stackOut_119_0 = null;
        Object stackOut_85_0 = null;
        Object var2_ref = null;
        var20 = field_B;
        try {
          L0: {
            L1: {
              if (s.field_e != null) {
                stackOut_4_0 = s.field_e;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = qd.field_j;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            var2_ref = stackIn_5_0;
            if (ee.b(93)) {
              L2: {
                stackOut_8_0 = var2_ref;
                stackOut_8_1 = -11;
                stackIn_11_0 = (RuntimeException) ((Object) stackOut_8_0);
                stackIn_11_1 = stackOut_8_1;
                stackIn_9_0 = (RuntimeException) ((Object) stackOut_8_0);
                stackIn_9_1 = stackOut_8_1;
                if (s.field_e != null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L2;
                } else {
                  stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = ua.field_b;
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_12_1 = stackOut_9_1;
                  stackIn_12_2 = stackOut_9_2 ? 1 : 0;
                  break L2;
                }
              }
              rl.a((java.awt.Canvas) ((Object) stackIn_12_0), stackIn_12_1, stackIn_12_2 != 0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (hf.field_f) {
                if (null == be.field_g) {
                  if (null == gg.field_f) {
                    L3: {
                      if (null != this.field_F) {
                        var3 = 0;
                        var4 = -this.field_F.field_z.length;
                        L4: while (true) {
                          if (-1 >= (var4 ^ -1)) {
                            break L3;
                          } else {
                            incrementValue$9 = var3;
                            var3++;
                            this.field_F.field_z[incrementValue$9] = pd.field_h.field_e[incrementValue$9];
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    L5: {
                      if (null != na.field_j) {
                        break L5;
                      } else {
                        if (s.field_i) {
                          break L5;
                        } else {
                          L6: {
                            if ((wh.field_c ^ -1) < -2) {
                              break L6;
                            } else {
                              if (ni.field_a) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            na.field_j = new ij((stellarshard) (this));
                            if (!ni.field_a) {
                              tl.field_c = 4;
                              na.field_j.field_l = 8;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          ni.field_a = false;
                          break L5;
                        }
                      }
                    }
                    L8: {
                      if (0 > fb.field_b) {
                        fb.field_b = fb.field_b + 640;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (0 > tk.field_b) {
                        tk.field_b = tk.field_b + 480;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (fb.field_b >= 640) {
                        fb.field_b = fb.field_b - 640;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (tk.field_b < 480) {
                        break L11;
                      } else {
                        tk.field_b = tk.field_b - 480;
                        break L11;
                      }
                    }
                    L12: {
                      this.p(param0 ^ -20914);
                      if (null == this.field_F) {
                        break L12;
                      } else {
                        if ((el.field_I ^ -1) >= -1) {
                          break L12;
                        } else {
                          if (na.field_j == null) {
                            this.field_F.e(0, 0, 5 * el.field_I);
                            if (s.field_i) {
                              break L12;
                            } else {
                              el.field_I = el.field_I - 1;
                              break L12;
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    L13: {
                      var3 = 0;
                      if (param0 == -20880) {
                        break L13;
                      } else {
                        discarded$10 = stellarshard.a(true, false, -57, true);
                        break L13;
                      }
                    }
                    var4 = 0;
                    L14: while (true) {
                      if (var4 >= 12) {
                        var3 = 0;
                        L15: while (true) {
                          if ((var3 ^ -1) <= -1001) {
                            L16: {
                              if (this.field_G == null) {
                                this.field_G = new pb(640, 480);
                                break L16;
                              } else {
                                this.field_G.e();
                                ti.f(0, 0, 640, 480, 0);
                                pd.field_h.a((byte) -107);
                                break L16;
                              }
                            }
                            var3 = 0;
                            L17: while (true) {
                              if (var3 >= 3000) {
                                var3 = 0;
                                L18: while (true) {
                                  if (1000 <= var3) {
                                    var3 = 0;
                                    var3 = var3 + this.field_G.field_t;
                                    var5_int = 0;
                                    L19: while (true) {
                                      if (this.field_G.field_y <= var5_int) {
                                        this.field_G.d(0, 0, 255);
                                        var5_int = 0;
                                        L20: while (true) {
                                          if (1000 <= var5_int) {
                                            var5_int = 4;
                                            var6_int = 1;
                                            L21: while (true) {
                                              if (var6_int >= 12) {
                                                L22: {
                                                  if (!pk.a(param0 ^ 24825, 0)) {
                                                    break L22;
                                                  } else {
                                                    if (s.field_i) {
                                                      L23: {
                                                        if ((ag.field_a ^ -1) >= -1) {
                                                          break L23;
                                                        } else {
                                                          if (128 <= ag.field_a) {
                                                            break L23;
                                                          } else {
                                                            ti.e(10, 330, 4, 16711680);
                                                            break L23;
                                                          }
                                                        }
                                                      }
                                                      L24: {
                                                        if ((ag.field_a ^ -1) >= -1) {
                                                          break L24;
                                                        } else {
                                                          if (-129 < (ag.field_a ^ -1)) {
                                                            qj.field_a.a(nd.field_F, 20, 335, 16711680, -1);
                                                            break L24;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                      }
                                                      var5_int = gf.field_c;
                                                      var6_int = 100;
                                                      if (-1 <= (ml.field_h ^ -1)) {
                                                        break L22;
                                                      } else {
                                                        if ((var6_int ^ -1) <= (var5_int ^ -1)) {
                                                          L25: {
                                                            var7 = 32;
                                                            var8 = var7 >> 1675413121;
                                                            if (16 > var5_int) {
                                                              var7 = var5_int * 4;
                                                              break L25;
                                                            } else {
                                                              if ((-64 + var6_int ^ -1) > (var5_int ^ -1)) {
                                                                var7 = -var5_int + var6_int;
                                                                break L25;
                                                              } else {
                                                                break L25;
                                                              }
                                                            }
                                                          }
                                                          var9 = (int)((Math.exp((double)((float)(-var5_int) / 20.0f)) - Math.exp((double)((float)(-var6_int) / 20.0f))) * 200.0);
                                                          ja.a(320, 2 * var5_int, var8, 240, false, var9, 256, 1);
                                                          break L22;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                                L26: {
                                                  if (s.field_i) {
                                                    var5_int = 148;
                                                    ti.b(1, 351, var5_int, 128, 65280, 64);
                                                    ti.d(2, 352, var5_int + -1, 478);
                                                    var6_int = 0;
                                                    L27: while (true) {
                                                      if (1000 <= var6_int) {
                                                        L28: {
                                                          ti.b();
                                                          var6 = wb.field_i;
                                                          if (hf.field_i.a(0)) {
                                                            break L28;
                                                          } else {
                                                            var6 = te.field_a;
                                                            break L28;
                                                          }
                                                        }
                                                        L29: {
                                                          var7 = qj.field_a.b(var6) + 10;
                                                          ti.e(0, 350, var5_int - -2, 130, 4, 0);
                                                          ti.f(-(var7 / 2) + var5_int / 2 - 3, 341, 6 + var7, 21, 10, 0);
                                                          ti.e(1, 351, var5_int, 128, 3, 8421504);
                                                          ti.e(2, 352, var5_int + -2, 126, 2, 8421504);
                                                          ti.g(3, 351, var5_int + -5, 16777215);
                                                          ti.f(1, 353, 123, 16777215);
                                                          ti.g(4, 478, var5_int + -1 + -4, 4210752);
                                                          ti.f(-1 + var5_int + 1, 354, 123, 4210752);
                                                          ti.e(3, 353, -4 + var5_int, 124, 1, 0);
                                                          ti.f(-2 + -(var7 / 2) + var5_int / 2, 342, 4 + var7, 19, 9, 8421504);
                                                          ti.e(-2 + -(var7 / 2) + var5_int / 2, 342, var7 + 4, 19, 9, 16777215);
                                                          ti.d(-(var7 / 2) + var5_int / 2 - 2, 350, 8 + var5_int / 2 + var7 / 2 + -2, 361);
                                                          ti.e(-(var7 / 2) + var5_int / 2 - 2, 342, 4 + var7, 19, 9, 4210752);
                                                          ti.b();
                                                          if ((var7 ^ -1) <= -101) {
                                                            break L29;
                                                          } else {
                                                            var8 = 0;
                                                            L30: while (true) {
                                                              if (var8 >= 15) {
                                                                break L29;
                                                              } else {
                                                                L31: {
                                                                  var9 = (int)(5.0 + Math.cos(3.14 * (double)var8 / 20.0) * 5.0);
                                                                  if ((var9 ^ -1) < -10) {
                                                                    var9 = 9;
                                                                    break L31;
                                                                  } else {
                                                                    break L31;
                                                                  }
                                                                }
                                                                ti.f(var5_int / 2 + (4 + -var7 / 2) + -var8, -var9 + 351, var9 * 2, 8421504);
                                                                ti.f(-var7 / 2 + -var8 - (-4 - var5_int / 2), 1 + (351 + -var9), 1, 16777215);
                                                                ti.f(4 + (-var8 + (-var7 / 2 + var5_int / 2)), 351 - var9, 1, 0);
                                                                ti.f(var5_int / 2 + (-var7 / 2 + (-var8 + 4)), 351 + (var9 - 1), 1, 4210752);
                                                                ti.f(var5_int / 2 + (-var7 / 2 + -var8 - -4), var9 + 351, 1, 0);
                                                                ti.f(var8 + -(-var7 / 2) - (4 - var5_int / 2), -var9 + 351, 2 * var9, 8421504);
                                                                ti.f(var5_int / 2 - 4 - (-var8 + -var7 / 2), 1 + -var9 + 351, 1, 16777215);
                                                                ti.f(-4 + (-(-var7 / 2) - (-var8 - var5_int / 2)), -var9 + 351, 1, 0);
                                                                ti.f(var5_int / 2 - (4 + -var8) - -var7 / 2, 351 - (-var9 + 1), 1, 4210752);
                                                                ti.f(var5_int / 2 - -var8 - (-var7 / 2 + 4), 351 - -var9, 1, 0);
                                                                var8++;
                                                                continue L30;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        ti.f(var5_int / 2 - var7 / 2, 344, var7, 15, 7, 0);
                                                        qj.field_a.c(var6, 1 + (var5_int / 2 - 1), 355, 0, -1);
                                                        qj.field_a.c(var6, -1 + (1 + var5_int / 2), 357, 0, -1);
                                                        qj.field_a.c(var6, -1 + var5_int / 2, 356, 0, -1);
                                                        qj.field_a.c(var6, -1 + (var5_int / 2 + 2), 356, 0, -1);
                                                        qj.field_a.c(var6, 1 + (var5_int / 2 + -1), 356, 16777215, -1);
                                                        break L26;
                                                      } else {
                                                        L32: {
                                                          if (a.field_h[var6_int] != null) {
                                                            a.field_h[var6_int].a(false);
                                                            break L32;
                                                          } else {
                                                            break L32;
                                                          }
                                                        }
                                                        var6_int++;
                                                        continue L27;
                                                      }
                                                    }
                                                  } else {
                                                    break L26;
                                                  }
                                                }
                                                L33: {
                                                  if (s.field_i) {
                                                    break L33;
                                                  } else {
                                                    L34: {
                                                      if (na.field_j == null) {
                                                        break L34;
                                                      } else {
                                                        if (-9 == (tl.field_c ^ -1)) {
                                                          break L33;
                                                        } else {
                                                          if (tl.field_c == 1) {
                                                            break L33;
                                                          } else {
                                                            if (tl.field_c == 3) {
                                                              break L33;
                                                            } else {
                                                              if (-3 != (tl.field_c ^ -1)) {
                                                                break L34;
                                                              } else {
                                                                break L33;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L35: {
                                                      if (wh.field_c != 0) {
                                                        break L35;
                                                      } else {
                                                        if (rh.field_a != null) {
                                                          break L35;
                                                        } else {
                                                          pl.field_R = null;
                                                          wh.field_c = 2;
                                                          jg.field_pb = 0;
                                                          aa.field_b = null;
                                                          wc.field_s = null;
                                                          break L35;
                                                        }
                                                      }
                                                    }
                                                    L36: {
                                                      if (0 == wh.field_c) {
                                                        aa.field_b.a(0, 128, 310, (byte) -120, 90);
                                                        wc.field_s.a(0, 128, -jg.field_pb + 320 + -10, (byte) -124, 90);
                                                        pl.field_R.a(0, 128, 310 + jg.field_pb, (byte) -119, 90);
                                                        break L36;
                                                      } else {
                                                        break L36;
                                                      }
                                                    }
                                                    L37: {
                                                      if (wh.field_c != 1) {
                                                        break L37;
                                                      } else {
                                                        rh.field_a[jg.field_pb / 3].a(0, 128, 310, (byte) 82, 90);
                                                        break L37;
                                                      }
                                                    }
                                                    L38: {
                                                      if (wh.field_c == 2) {
                                                        rh.field_a = null;
                                                        fa.field_k[0].a(0, 128, 310, (byte) -120, 90);
                                                        fa.field_k[jg.field_pb / 2].a(0, 128, 310, (byte) 37, 90);
                                                        break L38;
                                                      } else {
                                                        break L38;
                                                      }
                                                    }
                                                    if (-4 == (wh.field_c ^ -1)) {
                                                      fa.field_k[0].a(0, 128, 310, (byte) 54, 90);
                                                      break L33;
                                                    } else {
                                                      break L33;
                                                    }
                                                  }
                                                }
                                                L39: {
                                                  if (s.field_i) {
                                                    L40: {
                                                      var5 = h.a(hh.field_d, 0, new String[]{"" + qi.field_a});
                                                      var6_int = nj.field_f[0];
                                                      nj.field_f[0] = qi.field_a * 64 / 50;
                                                      if (-64 > (nj.field_f[0] ^ -1)) {
                                                        nj.field_f[0] = 63;
                                                        break L40;
                                                      } else {
                                                        break L40;
                                                      }
                                                    }
                                                    L41: {
                                                      ic.a(var5, 0, -1, false, 480, 16777215, 0);
                                                      nj.field_f[0] = 64 * te.field_c / 250000;
                                                      var5 = ce.field_f + te.field_c;
                                                      if (-64 > (nj.field_f[0] ^ -1)) {
                                                        nj.field_f[0] = 63;
                                                        break L41;
                                                      } else {
                                                        break L41;
                                                      }
                                                    }
                                                    L42: {
                                                      ic.a(var5, 0, -1, false, 160, 16777215, 0);
                                                      var5 = bb.field_f;
                                                      var7_ref = null;
                                                      var8 = e.field_e;
                                                      if (0 != e.field_e) {
                                                        break L42;
                                                      } else {
                                                        var7_ref = ei.field_A;
                                                        break L42;
                                                      }
                                                    }
                                                    L43: {
                                                      if ((e.field_e ^ -1) == -2) {
                                                        var7_ref = gf.field_a;
                                                        break L43;
                                                      } else {
                                                        break L43;
                                                      }
                                                    }
                                                    L44: {
                                                      if (-3 == (e.field_e ^ -1)) {
                                                        var7_ref = ka.field_l;
                                                        break L44;
                                                      } else {
                                                        break L44;
                                                      }
                                                    }
                                                    L45: {
                                                      if (3 != e.field_e) {
                                                        break L45;
                                                      } else {
                                                        var7_ref = he.field_l;
                                                        break L45;
                                                      }
                                                    }
                                                    L46: {
                                                      if (4 == e.field_e) {
                                                        var7_ref = td.field_e;
                                                        break L46;
                                                      } else {
                                                        break L46;
                                                      }
                                                    }
                                                    L47: {
                                                      if (e.field_e != 5) {
                                                        break L47;
                                                      } else {
                                                        var7_ref = nl.field_f;
                                                        break L47;
                                                      }
                                                    }
                                                    L48: {
                                                      if (e.field_e != 6) {
                                                        break L48;
                                                      } else {
                                                        var7_ref = qh.field_h;
                                                        break L48;
                                                      }
                                                    }
                                                    L49: {
                                                      if (-8 != (e.field_e ^ -1)) {
                                                        break L49;
                                                      } else {
                                                        var7_ref = we.field_e;
                                                        break L49;
                                                      }
                                                    }
                                                    L50: {
                                                      if (e.field_e != 8) {
                                                        break L50;
                                                      } else {
                                                        var7_ref = nb.field_O;
                                                        var8 += 5;
                                                        break L50;
                                                      }
                                                    }
                                                    L51: {
                                                      if ((e.field_e ^ -1) == -10) {
                                                        var7_ref = ja.field_k;
                                                        var8 += 5;
                                                        break L51;
                                                      } else {
                                                        break L51;
                                                      }
                                                    }
                                                    L52: {
                                                      if (10 == e.field_e) {
                                                        var8 += 5;
                                                        var7_ref = rd.field_b;
                                                        break L52;
                                                      } else {
                                                        break L52;
                                                      }
                                                    }
                                                    L53: {
                                                      if (var7_ref == null) {
                                                        break L53;
                                                      } else {
                                                        var7_ref = ((String) (var7_ref)).toUpperCase();
                                                        var9 = qj.field_a.b((String) (var7_ref)) - -40;
                                                        var10_int = 307;
                                                        ti.f(-20 + var10_int, 427, 42, 42, 20, 0);
                                                        ti.f(-2 + var10_int + -var9, 435, var9 - -4 + 19, 26, 12, 0);
                                                        ti.f(var10_int + -var9, 437, 19 - -var9, 22, 10, 11186350);
                                                        ti.f(var10_int + -18, 429, 38, 38, 18, 11186350);
                                                        ti.a(var10_int - 20 << -974064924, 7152, 200, 100, eh.field_e);
                                                        ti.a(var10_int - -10 - var9 << 504782724, 7152, 200, 150, eh.field_e);
                                                        ti.a(-var9 + var10_int + 40 << 242496644, 7152, 200, 150, eh.field_e);
                                                        ti.a(var10_int + 10 << 1772377540, 7152, 200, 200, eh.field_e);
                                                        ti.f(-var9 - -2 + var10_int, 439, 21 - (-var9 + -96) + -140, 18, 8, 0);
                                                        qj.field_a.b((String) (var7_ref), -63 + var10_int - -33, 453, 16777215, -1);
                                                        ti.a(var10_int - 15, 432, 32, 32, 14, 0, 192);
                                                        e.field_g[var8].e(var10_int + 33 + -80, 400);
                                                        break L53;
                                                      }
                                                    }
                                                    L54: {
                                                      var9 = 250;
                                                      var10 = null;
                                                      var11 = -1;
                                                      if (-2 == (nc.field_H ^ -1)) {
                                                        var10 = pe.field_a;
                                                        var11 = 8;
                                                        break L54;
                                                      } else {
                                                        break L54;
                                                      }
                                                    }
                                                    L55: {
                                                      if (2 == nc.field_H) {
                                                        var10 = ha.field_x;
                                                        var11 = 10;
                                                        break L55;
                                                      } else {
                                                        break L55;
                                                      }
                                                    }
                                                    L56: {
                                                      if (3 != nc.field_H) {
                                                        break L56;
                                                      } else {
                                                        var11 = 11;
                                                        var10 = fc.field_c;
                                                        break L56;
                                                      }
                                                    }
                                                    L57: {
                                                      if (4 != nc.field_H) {
                                                        break L57;
                                                      } else {
                                                        var11 = 12;
                                                        var10 = wg.field_e;
                                                        break L57;
                                                      }
                                                    }
                                                    L58: {
                                                      if (null != var10) {
                                                        L59: {
                                                          var10 = ((String) (var10)).toUpperCase();
                                                          var12 = 40 + qj.field_a.b((String) (var10));
                                                          var13 = 100;
                                                          var9 += 250;
                                                          ti.f(var9 + -20 - 1, 427, 42, 42, 20, 0);
                                                          ti.f(-2 - var12 + var9, 435, 21 - (-4 + -var12), 26, 12, 0);
                                                          if (0 >= var13) {
                                                            break L59;
                                                          } else {
                                                            ti.f(var9 + -2, 435, 4 + var13 + 21, 26, 12, 0);
                                                            break L59;
                                                          }
                                                        }
                                                        L60: {
                                                          ti.f(var9 - var12, 437, 21 + var12, 22, 10, 11186350);
                                                          if (-1 > (var13 ^ -1)) {
                                                            ti.f(var9, 437, var13 + 21, 22, 10, 11186350);
                                                            break L60;
                                                          } else {
                                                            break L60;
                                                          }
                                                        }
                                                        L61: {
                                                          ti.f(-1 + (-18 + var9), 429, 38, 38, 18, 11186350);
                                                          ti.a(-20 + var9 << 1872140068, 7152, 200, 100, eh.field_e);
                                                          ti.a(var9 - -10 << 1537771172, 7152, 200, 150, eh.field_e);
                                                          ti.a(40 + (-var12 + var9) << -1493931836, 7152, 200, 150, eh.field_e);
                                                          ti.a(-var12 - (-20 - var9) << 481878244, 7152, 200, 200, eh.field_e);
                                                          if (0 < var13) {
                                                            ti.a(var13 + var9 << -1161243260, 7152, 200, 200, eh.field_e);
                                                            break L61;
                                                          } else {
                                                            break L61;
                                                          }
                                                        }
                                                        L62: {
                                                          ti.f(var9 - -2 - var12, 439, -119 - -var12 - -96, 18, 8, 0);
                                                          if ((var13 ^ -1) >= -1) {
                                                            break L62;
                                                          } else {
                                                            L63: {
                                                              var14 = 0;
                                                              var15 = 0;
                                                              if (2 != nc.field_H) {
                                                                break L63;
                                                              } else {
                                                                L64: {
                                                                  if (gh.field_b <= 500) {
                                                                    break L64;
                                                                  } else {
                                                                    gh.field_b = 500;
                                                                    break L64;
                                                                  }
                                                                }
                                                                var14 = 8421504;
                                                                var15 = gh.field_b * 20 / 500;
                                                                if ((gh.field_b ^ -1) > -251) {
                                                                  var14 = 327680 * (gh.field_b % 50);
                                                                  break L63;
                                                                } else {
                                                                  break L63;
                                                                }
                                                              }
                                                            }
                                                            L65: {
                                                              if ((nc.field_H ^ -1) == -4) {
                                                                L66: {
                                                                  if (-1501 <= (gh.field_b ^ -1)) {
                                                                    break L66;
                                                                  } else {
                                                                    gh.field_b = 1500;
                                                                    break L66;
                                                                  }
                                                                }
                                                                var15 = 20 * gh.field_b / 1500;
                                                                var14 = 16777215;
                                                                if ((gh.field_b ^ -1) <= -251) {
                                                                  break L65;
                                                                } else {
                                                                  var14 = gh.field_b % 50 * 327680;
                                                                  break L65;
                                                                }
                                                              } else {
                                                                break L65;
                                                              }
                                                            }
                                                            L67: {
                                                              if (nc.field_H == 4) {
                                                                L68: {
                                                                  if (500 >= gh.field_b) {
                                                                    break L68;
                                                                  } else {
                                                                    gh.field_b = 500;
                                                                    break L68;
                                                                  }
                                                                }
                                                                var14 = 16776960;
                                                                var15 = gh.field_b * 20 / 500;
                                                                if (-251 >= (gh.field_b ^ -1)) {
                                                                  break L67;
                                                                } else {
                                                                  var14 = gh.field_b % 50 * 327680;
                                                                  break L67;
                                                                }
                                                              } else {
                                                                break L67;
                                                              }
                                                            }
                                                            L69: {
                                                              if ((nc.field_H ^ -1) != -2) {
                                                                break L69;
                                                              } else {
                                                                L70: {
                                                                  if (-6 == (gh.field_b ^ -1)) {
                                                                    var14 = 16777215;
                                                                    break L70;
                                                                  } else {
                                                                    break L70;
                                                                  }
                                                                }
                                                                L71: {
                                                                  var15 = gh.field_b * 4;
                                                                  if (-5 != (gh.field_b ^ -1)) {
                                                                    break L71;
                                                                  } else {
                                                                    var14 = 8454143;
                                                                    break L71;
                                                                  }
                                                                }
                                                                L72: {
                                                                  if ((gh.field_b ^ -1) != -4) {
                                                                    break L72;
                                                                  } else {
                                                                    var14 = 8421631;
                                                                    break L72;
                                                                  }
                                                                }
                                                                L73: {
                                                                  if (-3 == (gh.field_b ^ -1)) {
                                                                    var14 = 16744703;
                                                                    break L73;
                                                                  } else {
                                                                    break L73;
                                                                  }
                                                                }
                                                                if (gh.field_b == 1) {
                                                                  var14 = 16744576;
                                                                  break L69;
                                                                } else {
                                                                  break L69;
                                                                }
                                                              }
                                                            }
                                                            L74: {
                                                              var16 = 20 + (2 + var9);
                                                              var17 = 439;
                                                              ti.f(var16, var17, -3 + var13, 18, 8, (var14 & 16711422) >> 523782209);
                                                              if (3 != nc.field_H) {
                                                                ti.e(var16, var17, var13 + -3, 18, 8, 4144959 & var14 >> 838676258);
                                                                break L74;
                                                              } else {
                                                                ti.e(var16, var17, -3 + var13, 18, 8, var14);
                                                                break L74;
                                                              }
                                                            }
                                                            var16 = var16 << 4;
                                                            var17 = var17 << 4;
                                                            var19 = 0;
                                                            L75: while (true) {
                                                              if (var19 >= var15) {
                                                                var19 += 2;
                                                                L76: while (true) {
                                                                  if ((var19 ^ -1) <= -21) {
                                                                    break L62;
                                                                  } else {
                                                                    L77: {
                                                                      var18 = (var19 + ki.field_s) % 10;
                                                                      if ((var18 ^ -1) >= -6) {
                                                                        var18 = 10 - var18;
                                                                        break L77;
                                                                      } else {
                                                                        break L77;
                                                                      }
                                                                    }
                                                                    ti.c((var18 + var19 * 10) * (var13 + -35) / 10 + var16 - -136 >> -2047132252, 136 + var17 >> -527722428, 9, 0, 32);
                                                                    ti.c((var13 + -35) * (var18 + var19 * 10) / 10 + (var16 + 136) >> 1627503108, var17 + 136 >> 2061627876, 7, 0, 32);
                                                                    ti.c(136 + var16 - -((var13 + -35) * (var18 + var19 * 10) / 10) >> -742821596, var17 - -136 >> 419818596, 5, 0, 32);
                                                                    var19++;
                                                                    continue L76;
                                                                  }
                                                                }
                                                              } else {
                                                                L78: {
                                                                  var18 = (ki.field_s + var19) % 10;
                                                                  if ((var18 ^ -1) < -6) {
                                                                    var18 = 10 + -var18;
                                                                    break L78;
                                                                  } else {
                                                                    break L78;
                                                                  }
                                                                }
                                                                L79: {
                                                                  if ((nc.field_H ^ -1) != -3) {
                                                                    ti.a((var13 - 35) * (var18 + var19 * 10) / 10 + var16 + 136, 136 + var17, 144, 50, eh.field_e);
                                                                    break L79;
                                                                  } else {
                                                                    ti.a((var13 - 35) * (10 * var19) / 10 + (136 + var16), (var18 << 2097387618) + (136 + var17), -var18 + 9 << -933891388, 50, eh.field_e);
                                                                    break L79;
                                                                  }
                                                                }
                                                                var19++;
                                                                continue L75;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var9 -= 48;
                                                        ti.a(var9 + 32, 432, 32, 32, 14, 0, 192);
                                                        e.field_g[var11].e(var9, 400);
                                                        qj.field_a.b((String) (var10), 18 + var9, 453, 16777215, -1);
                                                        break L58;
                                                      } else {
                                                        break L58;
                                                      }
                                                    }
                                                    nj.field_f[0] = var6_int;
                                                    if ((this.field_J ^ -1) < -1) {
                                                      var5 = ah.field_k;
                                                      break L39;
                                                    } else {
                                                      break L39;
                                                    }
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                                L80: {
                                                  if ((ig.field_D ^ -1) >= -1) {
                                                    break L80;
                                                  } else {
                                                    ti.b(0, 0, 640, 480, 16777215, ig.field_D);
                                                    break L80;
                                                  }
                                                }
                                                L81: {
                                                  ti.a(0, 0, 640, 480, 0, 192);
                                                  ti.a(1, 1, 638, 478, 0, 128);
                                                  ti.a(2, 2, 636, 476, 0, 64);
                                                  if (na.field_j != null) {
                                                    na.field_j.a((byte) 85);
                                                    break L81;
                                                  } else {
                                                    break L81;
                                                  }
                                                }
                                                L82: {
                                                  if (this.field_R <= 0) {
                                                    break L82;
                                                  } else {
                                                    ti.b(0, 0, 640, 480, 16777215, this.field_R);
                                                    break L82;
                                                  }
                                                }
                                                L83: {
                                                  if (-1 <= (nc.field_A ^ -1)) {
                                                    break L83;
                                                  } else {
                                                    if (!s.field_i) {
                                                      break L83;
                                                    } else {
                                                      if ((mk.field_k ^ -1) < -1) {
                                                        break L83;
                                                      } else {
                                                        var6 = dd.field_i + nc.field_A / 50 + ef.field_o;
                                                        discarded$11 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 575, 480, 0, 0, 1, 0, l.field_f.field_N);
                                                        discarded$12 = l.field_f.a(var6, 32, 68 - l.field_f.field_N, 576, 479, 0, 0, 1, 0, l.field_f.field_N);
                                                        discarded$13 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 480, 16777215, -1, 1, 0, l.field_f.field_N);
                                                        break L83;
                                                      }
                                                    }
                                                  }
                                                }
                                                L84: {
                                                  if (nc.field_A <= 0) {
                                                    break L84;
                                                  } else {
                                                    if (!s.field_i) {
                                                      break L84;
                                                    } else {
                                                      if (qi.field_a < 50) {
                                                        break L84;
                                                      } else {
                                                        var6 = lk.field_g + hf.field_g + nc.field_A / 50 + ef.field_o;
                                                        discarded$14 = l.field_f.a(var6, 32, 68 + -l.field_f.field_N, 575, 480, 0, 0, 1, 0, l.field_f.field_N);
                                                        discarded$15 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 479, 0, 0, 1, 0, l.field_f.field_N);
                                                        discarded$16 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 480, 16777215, -1, 1, 0, l.field_f.field_N);
                                                        break L84;
                                                      }
                                                    }
                                                  }
                                                }
                                                L85: {
                                                  var6_ref = (jf) ((Object) hf.field_i.b(-119));
                                                  if (null == var6_ref) {
                                                    break L85;
                                                  } else {
                                                    L86: {
                                                      var7 = this.field_I;
                                                      if (-81 >= (var7 ^ -1)) {
                                                        if (-231 < (var7 ^ -1)) {
                                                          var8 = 255;
                                                          break L86;
                                                        } else {
                                                          var8 = (310 + -var7) * 255 / 80;
                                                          break L86;
                                                        }
                                                      } else {
                                                        var8 = 255 * var7 / 80;
                                                        break L86;
                                                      }
                                                    }
                                                    L87: {
                                                      var9 = 148;
                                                      if (var8 < 0) {
                                                        var8 = 0;
                                                        break L87;
                                                      } else {
                                                        break L87;
                                                      }
                                                    }
                                                    L88: {
                                                      ti.b(4, 353, -6 + var9, 123, 0, var8);
                                                      if (-256 == (var8 ^ -1)) {
                                                        wh.field_e[var6_ref.field_o].a(-24 + var9 / 2, 369, 48, 48);
                                                        discarded$17 = qj.field_a.a(rc.field_e[var6_ref.field_o], 8, 425, var9 - 16, 56, 65535, -1, 1, 1, qj.field_a.field_N);
                                                        break L88;
                                                      } else {
                                                        break L88;
                                                      }
                                                    }
                                                    var5 = te.field_a;
                                                    qj.field_a.c(var5, var9 / 2 - -1, 355, 0, -1);
                                                    qj.field_a.c(var5, 1 + var9 / 2, 357, 0, -1);
                                                    qj.field_a.c(var5, var9 / 2, 356, 0, -1);
                                                    qj.field_a.c(var5, var9 / 2 + 2, 356, 0, -1);
                                                    qj.field_a.c(var5, var9 / 2 - -1, 356, 16777215, -1);
                                                    break L85;
                                                  }
                                                }
                                                L89: {
                                                  if (!fd.d((byte) -21)) {
                                                    break L89;
                                                  } else {
                                                    ti.b(0, 0, 640, 480, 0, 128);
                                                    ti.f(-(ok.a((byte) 126) / 2) + 320 + -19, -16 + -(kb.b((byte) -114) / 2) + 240 - 5, ok.a((byte) 125) + 6 - -32, kb.b((byte) 121) + 10 + 32, 0);
                                                    na.a(28, 256, 28, fg.field_P);
                                                    break L89;
                                                  }
                                                }
                                                L90: {
                                                  if (!hd.field_b) {
                                                    break L90;
                                                  } else {
                                                    ti.b(0, 0, 150, 480, 0, 64);
                                                    ti.b(0, 0, 150, 480, 16777215);
                                                    break L90;
                                                  }
                                                }
                                                L91: {
                                                  if (!id.b(param0 ^ 20876)) {
                                                    break L91;
                                                  } else {
                                                    if (fd.d((byte) -21)) {
                                                      break L91;
                                                    } else {
                                                      L92: {
                                                        if (null != s.field_e) {
                                                          stackOut_489_0 = 1;
                                                          stackIn_490_0 = stackOut_489_0;
                                                          break L92;
                                                        } else {
                                                          stackOut_487_0 = ua.field_b;
                                                          stackIn_490_0 = stackOut_487_0 ? 1 : 0;
                                                          break L92;
                                                        }
                                                      }
                                                      bc.a(stackIn_490_0 != 0, -102);
                                                      break L91;
                                                    }
                                                  }
                                                }
                                                L93: {
                                                  if (null == s.field_e) {
                                                    stackOut_494_0 = qd.field_j;
                                                    stackIn_495_0 = stackOut_494_0;
                                                    break L93;
                                                  } else {
                                                    stackOut_492_0 = s.field_e;
                                                    stackIn_495_0 = stackOut_492_0;
                                                    break L93;
                                                  }
                                                }
                                                pd.a((java.awt.Canvas) ((Object) stackIn_495_0), 0, 0, (byte) -73);
                                                decompiledRegionSelector0 = 4;
                                                break L0;
                                              } else {
                                                ei.field_D[var6_int].d(-128 + (fk.field_k[var5_int] >> 346012836), -128 + (fk.field_k[1 + var5_int] >> -2060443996), -(el.field_I * 2) + 128);
                                                var5_int += 8;
                                                var6_int += 2;
                                                continue L21;
                                              }
                                            }
                                          } else {
                                            L94: {
                                              if (a.field_h[var5_int] == null) {
                                                break L94;
                                              } else {
                                                L95: {
                                                  if (14 == a.field_h[var5_int].field_m) {
                                                    break L95;
                                                  } else {
                                                    if (!a.field_h[var5_int].a((byte) -83)) {
                                                      break L94;
                                                    } else {
                                                      break L95;
                                                    }
                                                  }
                                                }
                                                a.field_h[var5_int].e(122);
                                                break L94;
                                              }
                                            }
                                            var5_int++;
                                            continue L20;
                                          }
                                        }
                                      } else {
                                        L96: {
                                          var6_int = var3;
                                          var7 = var5_int * this.field_G.field_v;
                                          if ((var6_int ^ -1) > -1) {
                                            stackOut_132_0 = -var6_int;
                                            stackIn_133_0 = stackOut_132_0;
                                            break L96;
                                          } else {
                                            stackOut_130_0 = 0;
                                            stackIn_133_0 = stackOut_130_0;
                                            break L96;
                                          }
                                        }
                                        L97: {
                                          var8 = stackIn_133_0;
                                          if (-641 <= (this.field_G.field_v + var6_int ^ -1)) {
                                            stackOut_136_0 = this.field_G.field_v;
                                            stackIn_137_0 = stackOut_136_0;
                                            break L97;
                                          } else {
                                            stackOut_134_0 = 640 + -var6_int;
                                            stackIn_137_0 = stackOut_134_0;
                                            break L97;
                                          }
                                        }
                                        var9 = stackIn_137_0;
                                        var10_int = var8;
                                        L98: while (true) {
                                          if ((var10_int ^ -1) <= (var9 ^ -1)) {
                                            var5_int++;
                                            continue L19;
                                          } else {
                                            L99: {
                                              var4 = this.field_G.field_z[var7 + var10_int];
                                              if (-1 > (var4 ^ -1)) {
                                                L100: {
                                                  if ((var4 ^ -1) >= -1) {
                                                    break L100;
                                                  } else {
                                                    if (-97 <= (var4 ^ -1)) {
                                                      this.field_G.field_z[var7 + var10_int] = var4 * 255 / 96 << 1305875024;
                                                      break L100;
                                                    } else {
                                                      break L100;
                                                    }
                                                  }
                                                }
                                                L101: {
                                                  if ((var4 ^ -1) >= -97) {
                                                    break L101;
                                                  } else {
                                                    if (var4 < 160) {
                                                      this.field_G.field_z[var7 + var10_int] = 16711680 - -((-24480 + 255 * var4) / 64 << 1954957448);
                                                      break L101;
                                                    } else {
                                                      break L101;
                                                    }
                                                  }
                                                }
                                                if (160 > var4) {
                                                  break L99;
                                                } else {
                                                  if ((var4 ^ -1) <= -256) {
                                                    break L99;
                                                  } else {
                                                    this.field_G.field_z[var10_int + var7] = 255 * (-160 + var4) / 95 + 16776960;
                                                    break L99;
                                                  }
                                                }
                                              } else {
                                                break L99;
                                              }
                                            }
                                            var10_int++;
                                            continue L98;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    stackOut_119_0 = null;
                                    stackIn_121_0 = stackOut_119_0;
                                    L102: {
                                      if (stackIn_121_0 == hf.field_e[var3]) {
                                        break L102;
                                      } else {
                                        hf.field_e[var3].a(true);
                                        break L102;
                                      }
                                    }
                                    var3++;
                                    continue L18;
                                  }
                                }
                              } else {
                                L103: {
                                  if (wk.field_b[var3] != null) {
                                    wk.field_b[var3].a(-57, this.field_G);
                                    break L103;
                                  } else {
                                    break L103;
                                  }
                                }
                                var3++;
                                continue L17;
                              }
                            }
                          } else {
                            stackOut_85_0 = null;
                            stackIn_87_0 = stackOut_85_0;
                            L104: {
                              if (stackIn_87_0 == a.field_h[var3]) {
                                break L104;
                              } else {
                                if (-15 == (a.field_h[var3].field_m ^ -1)) {
                                  break L104;
                                } else {
                                  if (!a.field_h[var3].a((byte) -96)) {
                                    a.field_h[var3].e(106);
                                    break L104;
                                  } else {
                                    break L104;
                                  }
                                }
                              }
                            }
                            var3++;
                            continue L15;
                          }
                        }
                      } else {
                        ei.field_D[var4].d((fk.field_k[var3] >> -573905436) - 128, (fk.field_k[var3 - -1] >> -1973196764) + -128, 128 - el.field_I * 2);
                        var3 += 8;
                        var4 += 2;
                        continue L14;
                      }
                    }
                  } else {
                    i.a((java.awt.Canvas) (var2_ref), -99);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  i.a((java.awt.Canvas) (var2_ref), -101);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                i.a((java.awt.Canvas) (var2_ref), -113);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.TA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -77) {
                break L1;
              } else {
                this.c((byte) -68);
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "stellarshard.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public final void init() {
        try {
            this.a(11, true, "stellarshard");
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "stellarshard.init()");
        }
    }

    public stellarshard() {
        this.field_P = new int[]{384, 384, -384, -384, 384, 384, -384, -384};
        this.field_N = new int[]{384, -384, -384, 384, 384, -384, -384, 384};
        this.field_S = new int[]{384, 384, 384, 384, -384, -384, -384, -384};
        this.field_I = 0;
    }

    private final void o(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ld.field_G) {
                le.a(ld.field_G, 26949);
                ld.field_G = null;
                rg.g(-33);
                break L1;
              } else {
                break L1;
              }
            }
            bh.field_a = wl.a(1, 1);
            wk.field_a = wl.a(1, 2);
            var2_int = 122 / ((-3 - param0) / 34);
            mf.field_b = wl.a(1, 3);
            ka.field_n = wl.a(1, 4);
            be.field_d = wl.a(1, 5);
            jf.field_m = wl.a(1, 7);
            jg.a(ie.field_u, fc.field_a, (byte) 118);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.GB(" + param0 + ')');
        }
    }

    static {
        field_U = new int[16];
        field_E = new th();
    }
}

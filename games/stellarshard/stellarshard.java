/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

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
            throw ma.a((Throwable) (Object) runtimeException, "stellarshard.DB(" + param0 + ')');
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
          throw ma.a((Throwable) (Object) var3, "stellarshard.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public final int[] a(boolean param0, int param1, float param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0) {
              stackOut_3_0 = mf.field_a[param1].field_z;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (int[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var4, "stellarshard.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
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
                ((stellarshard) this).field_H = null;
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
          throw ma.a((Throwable) (Object) var3, "stellarshard.A(" + param0 + ',' + param1 + ')');
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
                  na.field_j = new ij((stellarshard) this);
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
                  ((stellarshard) this).c(127, te.field_c);
                  oc.field_d = false;
                  cl.field_a = cl.field_a + te.field_c;
                  if (tl.field_a <= 0) {
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
          throw ma.a((Throwable) (Object) var2, "stellarshard.BB(" + param0 + ')');
        }
    }

    private final void q() {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "stellarshard.VA(" + 50 + ')');
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
          throw ma.a((Throwable) (Object) var3, "stellarshard.E(" + param0 + ',' + param1 + ')');
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
              ((stellarshard) this).field_H.a(sk.field_a, 8);
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
              if (var20 >= 6) {
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
                  if (var27 >= 25) {
                    var27 = 0;
                    L4: while (true) {
                      if (var27 >= 4) {
                        var20++;
                        continue L2;
                      } else {
                        var28 = 0;
                        L5: while (true) {
                          if (var28 >= 4) {
                            var27++;
                            continue L4;
                          } else {
                            L6: {
                              L7: {
                                var29 = 4 * var28 + var27;
                                if (var20 == 2) {
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
                              if (var20 == 1) {
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
                            int discarded$6 = 128;
                            int discarded$7 = 128;
                            int discarded$8 = 128;
                            qa.a(0, 2, var29, uf.field_c, fd.field_qb, uc.field_a, var32, var30, var31);
                            var30 = var27 - -(5 * var28);
                            var32 = (1 + var28) * 5 + var27;
                            var31 = (1 + var28) * 5 + (var27 + 1);
                            qa.a(uf.field_c, fd.field_qb, uc.field_a, var32, var30, var31, var21, var22, var25, var23, var26);
                            int discarded$9 = 128;
                            int discarded$10 = 128;
                            int discarded$11 = 128;
                            qa.a(0, 2, var29, uf.field_c, fd.field_qb, uc.field_a, var32, var30, var31);
                            var28++;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    var28_double = nj.field_l[var27] * (double)((stellarshard) this).field_P[var25] + ((double)((stellarshard) this).field_P[var24] * nj.field_e[var27] + (double)((stellarshard) this).field_P[var23] * nj.field_b[var27]) + (double)((stellarshard) this).field_P[var26] * nj.field_h[var27];
                    var30_double = nj.field_h[var27] * (double)((stellarshard) this).field_N[var26] + (nj.field_b[var27] * (double)((stellarshard) this).field_N[var23] + (double)((stellarshard) this).field_N[var24] * nj.field_e[var27] + nj.field_l[var27] * (double)((stellarshard) this).field_N[var25]);
                    var32_double = nj.field_l[var27] * (double)((stellarshard) this).field_S[var25] + (nj.field_e[var27] * (double)((stellarshard) this).field_S[var24] + nj.field_b[var27] * (double)((stellarshard) this).field_S[var23]) + nj.field_h[var27] * (double)((stellarshard) this).field_S[var26];
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
          throw ma.a((Throwable) (Object) var2, "stellarshard.IB(" + param0 + ')');
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
                ((stellarshard) this).b(stackIn_7_1, stackIn_7_2 != 0);
                if (qd.field_h) {
                  int discarded$10 = 122;
                  this.o();
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
                    int discarded$11 = 4;
                    ke.a();
                    nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
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
                          ((stellarshard) this).l((byte) -124);
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
                              int discarded$12 = -61;
                              var2_int = vd.a();
                              if (var2_int == 2) {
                                if (s.field_e != null) {
                                  nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
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
                                ((stellarshard) this).l((byte) -110);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            L10: {
                              if (4 != var2_int) {
                                break L10;
                              } else {
                                int discarded$13 = -128;
                                wj.h();
                                fd.field_mb = true;
                                break L10;
                              }
                            }
                            break L7;
                          } else {
                            if (!wk.a(113)) {
                              int discarded$14 = 1;
                              this.d();
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
                                var2_int = oa.a((rb) this, stackIn_81_1, stackIn_81_2 != 0);
                                if (var2_int != 1) {
                                  if (2 == var2_int) {
                                    L13: {
                                      if (null != s.field_e) {
                                        nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
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
                                    if (var2_int == 2364824) {
                                      int discarded$15 = -5;
                                      cj.b();
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                } else {
                                  if (null != s.field_e) {
                                    nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
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
                            tl.field_a = tl.field_a & ~be.field_g.field_m[0];
                            sd.field_d = sd.field_d | be.field_g.field_m[0];
                            be.field_g = null;
                            if (na.field_j == null) {
                              break L15;
                            } else {
                              if (tl.field_a == 0) {
                                oc.field_d = false;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                          int discarded$16 = 109;
                          hi.b();
                          var2_ref = (kl) (Object) ue.field_c.b(-91);
                          L16: while (true) {
                            if (var2_ref == null) {
                              break L7;
                            } else {
                              int discarded$17 = 0;
                              int discarded$18 = 4;
                              tc.a(var2_ref);
                              var2_ref = (kl) (Object) ue.field_c.b((byte) -128);
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
                      int discarded$19 = 32525;
                      if (!il.e()) {
                        break L4;
                      } else {
                        var2_int = ((stellarshard) this).f(-16028);
                        if (2 == var2_int) {
                          jj.a(true, 0, 8, 240, 320, 8, 0, (pb[]) null, (pb[]) null, l.field_f.field_N, 0, qj.field_a.field_N, (bd) (Object) qj.field_a, (bd) (Object) l.field_f);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      ((stellarshard) this).h(6476);
                      continue L17;
                    }
                  }
                } else {
                  ((stellarshard) this).k(-11);
                  if (!vj.a(25424)) {
                    break L4;
                  } else {
                    this.a(false, (byte) -81);
                    break L4;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "stellarshard.LA(" + param0 + ')');
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
                ((stellarshard) this).l((byte) -28);
                break L1;
              }
            }
            L2: {
              if (bi.field_u != null) {
                break L2;
              } else {
                L3: {
                  if (param1 <= 0) {
                    break L3;
                  } else {
                    if (e.field_c) {
                      break L3;
                    } else {
                      if (ah.a(-1)) {
                        break L3;
                      } else {
                        ue.field_a = param1;
                        bi.field_u = bb.a(5, gg.field_i, cl.field_a, si.field_gb, 3, new int[1], 65530, 0, qb.field_k);
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
          throw ma.a((Throwable) (Object) var3, "stellarshard.AB(" + param0 + ',' + param1 + ')');
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
            ((stellarshard) this).a(8, 0, 10, 6, false, 10, (byte) -7, 9);
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
                ((stellarshard) this).field_H = new pi();
                sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 1.0);
                ((stellarshard) this).field_H.a(sg.field_a, 19);
                sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.5);
                ((stellarshard) this).field_H.a(sg.field_a, 103);
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
                          if (var5 >= 12) {
                            lc.field_k = new pb(640, 480);
                            lc.field_k.e();
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= 256) {
                                pd.field_h.a((byte) -107);
                                ba.a(22050, false, 10);
                                ac.field_h = ba.a(ic.field_d, (java.awt.Component) (Object) qd.field_j, 0, 512);
                                ka.field_m = ba.a(ic.field_d, (java.awt.Component) (Object) qd.field_j, 1, 22050);
                                ll.field_c = new hl();
                                nj.field_o = new hl();
                                ac.field_h.a((kd) (Object) ll.field_c);
                                ka.field_m.a((kd) (Object) nj.field_o);
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
                                cc.a((cf) this);
                                ((stellarshard) this).a(true, -113, false, false, true);
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
                                  if (var10 != 2) {
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
                                      ti.a(var7 << 4, var8 << 4, var6 << 4, -var6 + 128, var9);
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
                                      if (var11 == 2) {
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
                            fk.field_k[var5 * 4] = (int)(640.0 * Math.random()) << 4;
                            fk.field_k[var5 * 4 - -1] = (int)(Math.random() * 480.0) << 4;
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
                                ti.a(var8 << 4, var9_int << 4, var7 << 4, -var7 + 128, eh.field_e);
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
                var3[var5] = var5;
                var4[var5] = 65536 * var5;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "stellarshard.GA(" + param0 + ')');
        }
    }

    final void m(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              int discarded$2 = 63;
              a.field_h[pl.e()] = new qe(-1);
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
                ((stellarshard) this).a(false);
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
              ((stellarshard) this).field_R = 255;
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
              if (qi.field_a <= 30) {
                break L4;
              } else {
                e.field_e = 1;
                break L4;
              }
            }
            L5: {
              gf.field_c = 0;
              lh.field_d = lh.field_d - 1;
              if (qi.field_a <= 40) {
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
          throw ma.a((Throwable) (Object) var2, "stellarshard.HB(" + param0 + ')');
        }
    }

    private final void d() {
        int var2_int = 0;
        pi var2 = null;
        vl var2_ref = null;
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
        int stackIn_176_0 = 0;
        int stackIn_176_1 = 0;
        int stackIn_243_0 = 0;
        int stackIn_244_0 = 0;
        int stackIn_245_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_246_1 = 0;
        qe stackIn_273_0 = null;
        double stackIn_273_1 = 0.0;
        double stackIn_273_2 = 0.0;
        qe stackIn_274_0 = null;
        double stackIn_274_1 = 0.0;
        double stackIn_274_2 = 0.0;
        qe stackIn_275_0 = null;
        double stackIn_275_1 = 0.0;
        double stackIn_275_2 = 0.0;
        qe stackIn_276_0 = null;
        double stackIn_276_1 = 0.0;
        double stackIn_276_2 = 0.0;
        double stackIn_276_3 = 0.0;
        qe stackIn_277_0 = null;
        double stackIn_277_1 = 0.0;
        double stackIn_277_2 = 0.0;
        qe stackIn_278_0 = null;
        double stackIn_278_1 = 0.0;
        double stackIn_278_2 = 0.0;
        qe stackIn_279_0 = null;
        double stackIn_279_1 = 0.0;
        double stackIn_279_2 = 0.0;
        double stackIn_279_3 = 0.0;
        vl stackIn_291_0 = null;
        vl stackIn_291_1 = null;
        vl stackIn_292_0 = null;
        vl stackIn_292_1 = null;
        vl stackIn_293_0 = null;
        vl stackIn_293_1 = null;
        vl stackIn_294_0 = null;
        vl stackIn_294_1 = null;
        int stackIn_294_2 = 0;
        vl stackIn_302_0 = null;
        vl stackIn_302_1 = null;
        vl stackIn_303_0 = null;
        vl stackIn_303_1 = null;
        vl stackIn_304_0 = null;
        vl stackIn_304_1 = null;
        vl stackIn_305_0 = null;
        vl stackIn_305_1 = null;
        int stackIn_305_2 = 0;
        gd stackIn_322_0 = null;
        int stackIn_322_1 = 0;
        gd stackIn_323_0 = null;
        int stackIn_323_1 = 0;
        gd stackIn_324_0 = null;
        int stackIn_324_1 = 0;
        gd stackIn_325_0 = null;
        int stackIn_325_1 = 0;
        int stackIn_325_2 = 0;
        gd stackIn_327_0 = null;
        int stackIn_327_1 = 0;
        gd stackIn_328_0 = null;
        int stackIn_328_1 = 0;
        gd stackIn_329_0 = null;
        int stackIn_329_1 = 0;
        gd stackIn_330_0 = null;
        int stackIn_330_1 = 0;
        int stackIn_330_2 = 0;
        int stackIn_338_0 = 0;
        int stackIn_356_0 = 0;
        int stackIn_653_0 = 0;
        int stackIn_654_0 = 0;
        int stackIn_654_1 = 0;
        int stackIn_667_0 = 0;
        qe stackIn_721_0 = null;
        int stackIn_726_0 = 0;
        vl stackIn_778_0 = null;
        Object stackIn_809_0 = null;
        vl stackIn_809_1 = null;
        int stackOut_175_0 = 0;
        int stackOut_175_1 = 0;
        int stackOut_242_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_245_1 = 0;
        int stackOut_243_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_244_1 = 0;
        qe stackOut_272_0 = null;
        double stackOut_272_1 = 0.0;
        double stackOut_272_2 = 0.0;
        qe stackOut_275_0 = null;
        double stackOut_275_1 = 0.0;
        double stackOut_275_2 = 0.0;
        double stackOut_275_3 = 0.0;
        qe stackOut_273_0 = null;
        double stackOut_273_1 = 0.0;
        double stackOut_273_2 = 0.0;
        qe stackOut_274_0 = null;
        double stackOut_274_1 = 0.0;
        double stackOut_274_2 = 0.0;
        double stackOut_274_3 = 0.0;
        qe stackOut_276_0 = null;
        double stackOut_276_1 = 0.0;
        double stackOut_276_2 = 0.0;
        qe stackOut_278_0 = null;
        double stackOut_278_1 = 0.0;
        double stackOut_278_2 = 0.0;
        double stackOut_278_3 = 0.0;
        qe stackOut_277_0 = null;
        double stackOut_277_1 = 0.0;
        double stackOut_277_2 = 0.0;
        double stackOut_277_3 = 0.0;
        vl stackOut_301_0 = null;
        vl stackOut_301_1 = null;
        vl stackOut_304_0 = null;
        vl stackOut_304_1 = null;
        int stackOut_304_2 = 0;
        vl stackOut_302_0 = null;
        vl stackOut_302_1 = null;
        vl stackOut_303_0 = null;
        vl stackOut_303_1 = null;
        int stackOut_303_2 = 0;
        vl stackOut_290_0 = null;
        vl stackOut_290_1 = null;
        vl stackOut_293_0 = null;
        vl stackOut_293_1 = null;
        int stackOut_293_2 = 0;
        vl stackOut_291_0 = null;
        vl stackOut_291_1 = null;
        vl stackOut_292_0 = null;
        vl stackOut_292_1 = null;
        int stackOut_292_2 = 0;
        gd stackOut_326_0 = null;
        int stackOut_326_1 = 0;
        gd stackOut_329_0 = null;
        int stackOut_329_1 = 0;
        int stackOut_329_2 = 0;
        gd stackOut_327_0 = null;
        int stackOut_327_1 = 0;
        gd stackOut_328_0 = null;
        int stackOut_328_1 = 0;
        int stackOut_328_2 = 0;
        gd stackOut_321_0 = null;
        int stackOut_321_1 = 0;
        gd stackOut_324_0 = null;
        int stackOut_324_1 = 0;
        int stackOut_324_2 = 0;
        gd stackOut_322_0 = null;
        int stackOut_322_1 = 0;
        gd stackOut_323_0 = null;
        int stackOut_323_1 = 0;
        int stackOut_323_2 = 0;
        int stackOut_337_0 = 0;
        int stackOut_336_0 = 0;
        int stackOut_355_0 = 0;
        int stackOut_354_0 = 0;
        int stackOut_652_0 = 0;
        int stackOut_653_0 = 0;
        int stackOut_653_1 = 0;
        int stackOut_666_0 = 0;
        int stackOut_665_0 = 0;
        qe stackOut_720_0 = null;
        int stackOut_724_0 = 0;
        int stackOut_725_0 = 0;
        Object stackOut_808_0 = null;
        vl stackOut_808_1 = null;
        vl stackOut_777_0 = null;
        L0: {
          L1: {
            var15 = field_B;
            if (ni.field_e != ((stellarshard) this).field_Q) {
              break L1;
            } else {
              if (eb.field_a != ((stellarshard) this).field_O) {
                break L1;
              } else {
                if (0 == gh.field_c) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ((stellarshard) this).field_Q = ni.field_e;
          v.field_e = true;
          ((stellarshard) this).field_O = eb.field_a;
          ld.field_F = -1;
          break L0;
        }
        L2: {
          if (!si.field_jb[98]) {
            break L2;
          } else {
            ld.field_F = 0;
            v.field_e = false;
            break L2;
          }
        }
        L3: {
          if (!si.field_jb[99]) {
            break L3;
          } else {
            ld.field_F = 1;
            v.field_e = false;
            break L3;
          }
        }
        L4: {
          ki.field_s = ki.field_s + 1;
          if (!si.field_jb[84]) {
            break L4;
          } else {
            v.field_e = false;
            break L4;
          }
        }
        L5: {
          qb.field_k = qb.field_k + 1;
          lg.field_f = lg.field_f - 1;
          hk.field_p = hk.field_p + 1;
          if (10 >= ki.field_s) {
            break L5;
          } else {
            ki.field_s = 0;
            break L5;
          }
        }
        L6: {
          if (qi.field_a <= 1) {
            break L6;
          } else {
            if (((stellarshard) this).field_J > 0) {
              ((stellarshard) this).field_J = ((stellarshard) this).field_J - 1;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          cl.field_a = cl.field_a + 1;
          if (0 != gh.field_c) {
            qb.field_k = qb.field_k - gg.field_i;
            si.field_gb = si.field_gb + 1;
            hk.field_p = hk.field_p + lh.field_d;
            ed.field_b = ed.field_b + 1;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (null == hf.field_i.b(-97)) {
            break L8;
          } else {
            int fieldTemp$14 = ((stellarshard) this).field_I + 1;
            ((stellarshard) this).field_I = ((stellarshard) this).field_I + 1;
            if (fieldTemp$14 != 335) {
              break L8;
            } else {
              ((stellarshard) this).field_I = 0;
              gg discarded$15 = hf.field_i.d((byte) -35);
              break L8;
            }
          }
        }
        L9: {
          if (af.field_o <= 0) {
            break L9;
          } else {
            af.field_o = af.field_o - 1;
            break L9;
          }
        }
        L10: {
          if (0 >= og.field_a) {
            break L10;
          } else {
            og.field_a = og.field_a - 1;
            break L10;
          }
        }
        L11: {
          int fieldTemp$16 = bf.field_c;
          bf.field_c = bf.field_c + 1;
          if (~fieldTemp$16 >= ~qj.field_a.b(sj.field_C)) {
            break L11;
          } else {
            bf.field_c = bf.field_c - qj.field_a.b(sj.field_C) * 2;
            break L11;
          }
        }
        L12: {
          if (0 < ((stellarshard) this).field_R) {
            ((stellarshard) this).field_R = ((stellarshard) this).field_R / 2;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if (((stellarshard) this).field_R <= 0) {
            break L13;
          } else {
            ((stellarshard) this).field_R = ((stellarshard) this).field_R - 1;
            break L13;
          }
        }
        L14: {
          if (null == na.field_j) {
            break L14;
          } else {
            L15: {
              if (s.field_i) {
                break L15;
              } else {
                sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 0.001);
                ((stellarshard) this).field_H.a(sg.field_a, -127);
                sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.0005);
                ((stellarshard) this).field_H.a(sg.field_a, -125);
                break L15;
              }
            }
            L16: {
              if (null == gj.field_r) {
                break L16;
              } else {
                if (og.field_a <= 0) {
                  og.field_a = 25;
                  gj.field_r.b(25, 0);
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            L17: {
              if (tl.field_c == 8) {
                L18: {
                  int discarded$17 = 1;
                  int discarded$18 = -115;
                  var2_int = qc.a();
                  if (3 != var2_int) {
                    break L18;
                  } else {
                    qd.a(hf.a((byte) -68), (byte) -30);
                    break L18;
                  }
                }
                if (var2_int != 1) {
                  if (var2_int != 2) {
                    break L17;
                  } else {
                    tl.field_c = 0;
                    na.field_j.field_l = -1;
                    return;
                  }
                } else {
                  na.field_j.field_l = 0;
                  tl.field_c = 0;
                  return;
                }
              } else {
                break L17;
              }
            }
            L19: {
              if (tl.field_c != 3) {
                break L19;
              } else {
                if (gh.field_c == 1) {
                  if (na.field_j.field_r != -1) {
                    if (na.field_j.field_u == na.field_j.field_r) {
                      na.field_j.field_u = -1;
                      break L19;
                    } else {
                      na.field_j.field_u = na.field_j.field_r;
                      break L19;
                    }
                  } else {
                    break L19;
                  }
                } else {
                  break L19;
                }
              }
            }
            L20: {
              if (qi.field_a > na.field_j.field_t) {
                na.field_j.field_p = na.field_j.field_p + 1;
                if (10 < na.field_j.field_p) {
                  na.field_j.field_t = na.field_j.field_t + 1;
                  na.field_j.field_p = na.field_j.field_p - 10;
                  break L20;
                } else {
                  break L20;
                }
              } else {
                if (4 == tl.field_c) {
                  L21: {
                    na.field_j.field_p = na.field_j.field_p + 1;
                    if (na.field_j.field_p <= 50) {
                      break L21;
                    } else {
                      na.field_j.field_p = na.field_j.field_p - 50;
                      na.field_j.field_s = na.field_j.field_s - 1;
                      break L21;
                    }
                  }
                  if (na.field_j.field_s <= 0) {
                    L22: {
                      gh.field_d = null;
                      tl.field_c = 2;
                      na.field_j.field_l = 9;
                      if (tl.field_a > 0) {
                        tl.field_c = 3;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    n.field_L = 256;
                    break L20;
                  } else {
                    break L20;
                  }
                } else {
                  break L20;
                }
              }
            }
            L23: {
              if (tl.field_c == 0) {
                var2_int = 0;
                L24: while (true) {
                  if (var2_int >= 9) {
                    if (ph.field_D < 2) {
                      break L23;
                    } else {
                      L25: {
                        if (si.field_jb[16]) {
                          ((stellarshard) this).field_H.field_b = 1.0;
                          var2 = ((stellarshard) this).field_H;
                          var3_ref_pi = ((stellarshard) this).field_H;
                          ((stellarshard) this).field_H.field_a = 0.0;
                          var2.field_d = 0.0;
                          var3_ref_pi.field_c = 0.0;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      L26: {
                        if (si.field_jb[17]) {
                          ((stellarshard) this).field_H.field_b = 0.1513824462890625;
                          ((stellarshard) this).field_H.field_c = -0.939178466796875;
                          ((stellarshard) this).field_H.field_a = -0.258941650390625;
                          ((stellarshard) this).field_H.field_d = -0.949249267578125;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      L27: {
                        if (!si.field_jb[18]) {
                          break L27;
                        } else {
                          ((stellarshard) this).field_H.field_c = -0.0067138671875;
                          ((stellarshard) this).field_H.field_a = -0.82244873046875;
                          ((stellarshard) this).field_H.field_b = 0.13287353515625;
                          ((stellarshard) this).field_H.field_d = -0.552978515625;
                          break L27;
                        }
                      }
                      L28: {
                        if (si.field_jb[19]) {
                          ((stellarshard) this).field_H.field_d = -0.846764809241;
                          ((stellarshard) this).field_H.field_b = 0.26812744140625;
                          ((stellarshard) this).field_H.field_a = 0.4404144287109375;
                          ((stellarshard) this).field_H.field_c = 0.130889892578125;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      L29: {
                        if (si.field_jb[20]) {
                          ((stellarshard) this).field_H.field_b = 0.7213134765625;
                          ((stellarshard) this).field_H.field_c = 0.5408782958984375;
                          ((stellarshard) this).field_H.field_a = -0.334014892578125;
                          ((stellarshard) this).field_H.field_d = 0.2748870849609375;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      if (si.field_jb[21]) {
                        ((stellarshard) this).field_H.field_d = -0.5489211794018304;
                        ((stellarshard) this).field_H.field_a = -0.49565616706475396;
                        ((stellarshard) this).field_H.field_b = -0.6729829114278874;
                        ((stellarshard) this).field_H.field_c = -0.010222709116862912;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  } else {
                    L30: {
                      if (na.field_j.field_l != var2_int) {
                        nj.field_f[var2_int] = nj.field_f[var2_int] * 15 >> 4;
                        break L30;
                      } else {
                        nj.field_f[var2_int] = nj.field_f[var2_int] * 15 - -64 >> 4;
                        break L30;
                      }
                    }
                    var2_int++;
                    continue L24;
                  }
                }
              } else {
                break L23;
              }
            }
            L31: {
              if (tl.field_c == 4) {
                var2_int = 8;
                L32: while (true) {
                  if (var2_int >= 9) {
                    break L31;
                  } else {
                    L33: {
                      if (var2_int == na.field_j.field_l) {
                        nj.field_f[var2_int] = 64 + nj.field_f[var2_int] * 15 >> 4;
                        break L33;
                      } else {
                        nj.field_f[var2_int] = 15 * nj.field_f[var2_int] >> 4;
                        break L33;
                      }
                    }
                    var2_int++;
                    continue L32;
                  }
                }
              } else {
                break L31;
              }
            }
            L34: {
              if (tl.field_c == 1) {
                var2_int = 9;
                L35: while (true) {
                  if (var2_int >= 10) {
                    break L34;
                  } else {
                    L36: {
                      if (~var2_int == ~na.field_j.field_l) {
                        nj.field_f[var2_int] = 64 + nj.field_f[var2_int] * 15 >> 4;
                        break L36;
                      } else {
                        nj.field_f[var2_int] = nj.field_f[var2_int] * 15 >> 4;
                        break L36;
                      }
                    }
                    var2_int++;
                    continue L35;
                  }
                }
              } else {
                break L34;
              }
            }
            L37: {
              if (2 != tl.field_c) {
                break L37;
              } else {
                var2_int = 8;
                var3 = var2_int;
                L38: while (true) {
                  if (10 <= var3) {
                    break L37;
                  } else {
                    L39: {
                      if (~na.field_j.field_l == ~var3) {
                        nj.field_f[var3] = nj.field_f[var3] * 15 - -64 >> 4;
                        break L39;
                      } else {
                        nj.field_f[var3] = 15 * nj.field_f[var3] >> 4;
                        break L39;
                      }
                    }
                    var3++;
                    continue L38;
                  }
                }
              }
            }
            L40: {
              if (tl.field_c == 3) {
                L41: {
                  var2_int = 8;
                  if (ah.a(-1)) {
                    break L41;
                  } else {
                    if (oc.field_d) {
                      break L41;
                    } else {
                      var2_int = 9;
                      break L41;
                    }
                  }
                }
                var3 = var2_int;
                L42: while (true) {
                  if (var3 >= 10) {
                    break L40;
                  } else {
                    L43: {
                      if (na.field_j.field_l != var3) {
                        nj.field_f[var3] = 15 * nj.field_f[var3] >> 4;
                        break L43;
                      } else {
                        nj.field_f[var3] = 15 * nj.field_f[var3] - -64 >> 4;
                        break L43;
                      }
                    }
                    var3++;
                    continue L42;
                  }
                }
              } else {
                break L40;
              }
            }
            L44: {
              if (0 < n.field_L) {
                n.field_L = n.field_L / 2;
                break L44;
              } else {
                break L44;
              }
            }
            if (n.field_L <= 0) {
              break L14;
            } else {
              n.field_L = n.field_L - 1;
              break L14;
            }
          }
        }
        L45: {
          if (null == na.field_j) {
            break L45;
          } else {
            if (s.field_i) {
              L46: while (true) {
                if (!qh.c(103)) {
                  L47: {
                    if (na.field_j == null) {
                      break L47;
                    } else {
                      stackOut_175_0 = -4;
                      stackOut_175_1 = ~tl.field_c;
                      stackIn_176_0 = stackOut_175_0;
                      stackIn_176_1 = stackOut_175_1;
                      L48: {
                        if (stackIn_176_0 == stackIn_176_1) {
                          break L48;
                        } else {
                          break L48;
                        }
                      }
                      L49: {
                        if (tl.field_c == 2) {
                          break L49;
                        } else {
                          break L49;
                        }
                      }
                      L50: {
                        if (tl.field_c == 1) {
                          break L50;
                        } else {
                          break L50;
                        }
                      }
                      na.field_j.a(true);
                      break L47;
                    }
                  }
                  return;
                } else {
                  L51: {
                    if (gi.field_f != 13) {
                      break L51;
                    } else {
                      if (tl.field_c != 0) {
                        break L51;
                      } else {
                        na.field_j = null;
                        break L51;
                      }
                    }
                  }
                  L52: {
                    if (na.field_j == null) {
                      break L52;
                    } else {
                      if (gi.field_f != 13) {
                        break L52;
                      } else {
                        L53: {
                          if (tl.field_c == 2) {
                            break L53;
                          } else {
                            if (tl.field_c == 1) {
                              break L53;
                            } else {
                              if (tl.field_c != 3) {
                                break L52;
                              } else {
                                break L53;
                              }
                            }
                          }
                        }
                        n.field_L = 256;
                        tl.field_c = 0;
                        gh.field_d = null;
                        continue L46;
                      }
                    }
                  }
                  if (null != na.field_j) {
                    na.field_j.b(8);
                    continue L46;
                  } else {
                    continue L46;
                  }
                }
              }
            } else {
              break L45;
            }
          }
        }
        L54: {
          if (0 < ig.field_D) {
            ig.field_D = ig.field_D - 6;
            break L54;
          } else {
            break L54;
          }
        }
        L55: {
          if (0 != wh.field_c) {
            break L55;
          } else {
            jg.field_pb = jg.field_pb - 8;
            if (jg.field_pb > 0) {
              break L55;
            } else {
              wh.field_c = 1;
              jg.field_pb = 0;
              if (!fe.field_e) {
                break L55;
              } else {
                ll.field_c.a(sb.field_e[36], 100, pk.field_h * 2);
                break L55;
              }
            }
          }
        }
        L56: {
          if (wh.field_c != 1) {
            break L56;
          } else {
            jg.field_pb = jg.field_pb + 1;
            if (jg.field_pb >= 36) {
              jg.field_pb = 0;
              wh.field_c = 2;
              break L56;
            } else {
              break L56;
            }
          }
        }
        L57: {
          if (2 == wh.field_c) {
            jg.field_pb = jg.field_pb + 1;
            if (jg.field_pb < 30) {
              break L57;
            } else {
              wh.field_c = 3;
              jg.field_pb = 0;
              break L57;
            }
          } else {
            break L57;
          }
        }
        L58: {
          if (wh.field_c == 3) {
            L59: {
              jg.field_pb = jg.field_pb + 1;
              if (1 == jg.field_pb) {
                if (!fe.field_e) {
                  break L59;
                } else {
                  if (s.field_i) {
                    break L59;
                  } else {
                    ll.field_c.a(sb.field_e[37], 100, pk.field_h * 2);
                    break L59;
                  }
                }
              } else {
                break L59;
              }
            }
            if (jg.field_pb <= 250) {
              break L58;
            } else {
              jg.field_pb = 0;
              wh.field_c = 2;
              break L58;
            }
          } else {
            break L58;
          }
        }
        L60: {
          if (~al.field_c == ~ke.field_a) {
            break L60;
          } else {
            kg.field_D = kg.field_D - 1;
            if (kg.field_D <= 0) {
              kg.field_D = 255;
              ke.field_a = al.field_c;
              break L60;
            } else {
              break L60;
            }
          }
        }
        L61: {
          al.field_c = qi.field_a % 7 * 6912 + qi.field_a % 10 * 19 + 851968 * (qi.field_a % 14);
          if (s.field_i) {
            break L61;
          } else {
            al.field_c = 858899;
            break L61;
          }
        }
        L62: {
          if (nc.field_H == 1) {
            L63: {
              if (a.field_h[0].field_g < 1) {
                a.field_h[0].field_g = a.field_h[0].field_g + 1;
                gh.field_b = gh.field_b - 1;
                break L63;
              } else {
                break L63;
              }
            }
            if (0 >= gh.field_b) {
              nc.field_H = 0;
              break L62;
            } else {
              break L62;
            }
          } else {
            break L62;
          }
        }
        L64: {
          if (nc.field_H == 2) {
            gh.field_b = gh.field_b - 1;
            if (0 >= gh.field_b) {
              gh.field_b = 5;
              nc.field_H = 1;
              break L64;
            } else {
              break L64;
            }
          } else {
            break L64;
          }
        }
        L65: {
          if (nc.field_H != 3) {
            break L65;
          } else {
            gh.field_b = gh.field_b - 1;
            if (gh.field_b > 0) {
              break L65;
            } else {
              gh.field_b = 5;
              nc.field_H = 1;
              break L65;
            }
          }
        }
        L66: {
          if (96 <= tc.field_r) {
            break L66;
          } else {
            tc.field_r = tc.field_r + 1;
            break L66;
          }
        }
        L67: {
          if (nc.field_H != 4) {
            break L67;
          } else {
            gh.field_b = gh.field_b - 1;
            if (0 < gh.field_b) {
              break L67;
            } else {
              gh.field_b = 5;
              nc.field_H = 1;
              break L67;
            }
          }
        }
        L68: {
          L69: {
            if (null == a.field_h[0]) {
              break L69;
            } else {
              if (a.field_h[0].field_m == -1) {
                break L68;
              } else {
                break L69;
              }
            }
          }
          L70: {
            stackOut_242_0 = 0;
            stackIn_245_0 = stackOut_242_0;
            stackIn_243_0 = stackOut_242_0;
            if (s.field_i) {
              stackOut_245_0 = stackIn_245_0;
              stackOut_245_1 = 0;
              stackIn_246_0 = stackOut_245_0;
              stackIn_246_1 = stackOut_245_1;
              break L70;
            } else {
              stackOut_243_0 = stackIn_243_0;
              stackIn_244_0 = stackOut_243_0;
              stackOut_244_0 = stackIn_244_0;
              stackOut_244_1 = 1;
              stackIn_246_0 = stackOut_244_0;
              stackIn_246_1 = stackOut_244_1;
              break L70;
            }
          }
          if (stackIn_246_0 != stackIn_246_1) {
            break L68;
          } else {
            this.k((byte) -69);
            break L68;
          }
        }
        L71: {
          if (s.field_i) {
            L72: {
              L73: {
                L74: {
                  if (si.field_jb[98]) {
                    break L74;
                  } else {
                    if (4 != nc.field_H) {
                      break L73;
                    } else {
                      break L74;
                    }
                  }
                }
                if (a.field_h[0].field_g > 0) {
                  L75: {
                    stackOut_272_0 = a.field_h[0];
                    stackOut_272_1 = a.field_h[0].field_k;
                    stackOut_272_2 = Math.cos(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                    stackIn_275_0 = stackOut_272_0;
                    stackIn_275_1 = stackOut_272_1;
                    stackIn_275_2 = stackOut_272_2;
                    stackIn_273_0 = stackOut_272_0;
                    stackIn_273_1 = stackOut_272_1;
                    stackIn_273_2 = stackOut_272_2;
                    if (8 != e.field_e) {
                      stackOut_275_0 = (qe) (Object) stackIn_275_0;
                      stackOut_275_1 = stackIn_275_1;
                      stackOut_275_2 = stackIn_275_2;
                      stackOut_275_3 = 0.1;
                      stackIn_276_0 = stackOut_275_0;
                      stackIn_276_1 = stackOut_275_1;
                      stackIn_276_2 = stackOut_275_2;
                      stackIn_276_3 = stackOut_275_3;
                      break L75;
                    } else {
                      stackOut_273_0 = (qe) (Object) stackIn_273_0;
                      stackOut_273_1 = stackIn_273_1;
                      stackOut_273_2 = stackIn_273_2;
                      stackIn_274_0 = stackOut_273_0;
                      stackIn_274_1 = stackOut_273_1;
                      stackIn_274_2 = stackOut_273_2;
                      stackOut_274_0 = (qe) (Object) stackIn_274_0;
                      stackOut_274_1 = stackIn_274_1;
                      stackOut_274_2 = stackIn_274_2;
                      stackOut_274_3 = 0.15;
                      stackIn_276_0 = stackOut_274_0;
                      stackIn_276_1 = stackOut_274_1;
                      stackIn_276_2 = stackOut_274_2;
                      stackIn_276_3 = stackOut_274_3;
                      break L75;
                    }
                  }
                  L76: {
                    stackIn_276_0.field_k = stackIn_276_1 - stackIn_276_2 * stackIn_276_3;
                    stackOut_276_0 = a.field_h[0];
                    stackOut_276_1 = a.field_h[0].field_d;
                    stackOut_276_2 = Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                    stackIn_278_0 = stackOut_276_0;
                    stackIn_278_1 = stackOut_276_1;
                    stackIn_278_2 = stackOut_276_2;
                    stackIn_277_0 = stackOut_276_0;
                    stackIn_277_1 = stackOut_276_1;
                    stackIn_277_2 = stackOut_276_2;
                    if (e.field_e == 8) {
                      stackOut_278_0 = (qe) (Object) stackIn_278_0;
                      stackOut_278_1 = stackIn_278_1;
                      stackOut_278_2 = stackIn_278_2;
                      stackOut_278_3 = 0.15;
                      stackIn_279_0 = stackOut_278_0;
                      stackIn_279_1 = stackOut_278_1;
                      stackIn_279_2 = stackOut_278_2;
                      stackIn_279_3 = stackOut_278_3;
                      break L76;
                    } else {
                      stackOut_277_0 = (qe) (Object) stackIn_277_0;
                      stackOut_277_1 = stackIn_277_1;
                      stackOut_277_2 = stackIn_277_2;
                      stackOut_277_3 = 0.1;
                      stackIn_279_0 = stackOut_277_0;
                      stackIn_279_1 = stackOut_277_1;
                      stackIn_279_2 = stackOut_277_2;
                      stackIn_279_3 = stackOut_277_3;
                      break L76;
                    }
                  }
                  L77: {
                    stackIn_279_0.field_d = stackIn_279_1 - stackIn_279_2 * stackIn_279_3;
                    if (nc.field_H != 4) {
                      break L77;
                    } else {
                      a.field_h[0].field_k = a.field_h[0].field_k - 0.1 * Math.cos(3.141592653589793 * (double)a.field_h[0].field_h * 2.0 / 256.0);
                      a.field_h[0].field_d = a.field_h[0].field_d - 0.1 * Math.sin((double)a.field_h[0].field_h * 3.141592653589793 * 2.0 / 256.0);
                      if (!fe.field_e) {
                        break L77;
                      } else {
                        if (og.field_a > 0) {
                          break L77;
                        } else {
                          ll.field_c.a(sb.field_e[35], 100, pk.field_h / 2);
                          og.field_a = 7;
                          break L77;
                        }
                      }
                    }
                  }
                  L78: {
                    var2_int = 3;
                    var3 = 5;
                    if (nc.field_H == 4) {
                      var3 = 10;
                      var2_int = 6;
                      break L78;
                    } else {
                      break L78;
                    }
                  }
                  var5 = 0;
                  L79: while (true) {
                    if (var5 >= var2_int) {
                      if (4 != nc.field_H) {
                        break L72;
                      } else {
                        var5 = 4 * (gh.field_b % 8);
                        L80: while (true) {
                          if (var5 >= 256) {
                            break L72;
                          } else {
                            L81: {
                              stackOut_301_0 = null;
                              stackOut_301_1 = null;
                              stackIn_304_0 = stackOut_301_0;
                              stackIn_304_1 = stackOut_301_1;
                              stackIn_302_0 = stackOut_301_0;
                              stackIn_302_1 = stackOut_301_1;
                              if (nc.field_H == 4) {
                                stackOut_304_0 = null;
                                stackOut_304_1 = null;
                                stackOut_304_2 = 4;
                                stackIn_305_0 = stackOut_304_0;
                                stackIn_305_1 = stackOut_304_1;
                                stackIn_305_2 = stackOut_304_2;
                                break L81;
                              } else {
                                stackOut_302_0 = null;
                                stackOut_302_1 = null;
                                stackIn_303_0 = stackOut_302_0;
                                stackIn_303_1 = stackOut_302_1;
                                stackOut_303_0 = null;
                                stackOut_303_1 = null;
                                stackOut_303_2 = 1;
                                stackIn_305_0 = stackOut_303_0;
                                stackIn_305_1 = stackOut_303_1;
                                stackIn_305_2 = stackOut_303_2;
                                break L81;
                              }
                            }
                            L82: {
                              var4_ref_vl = new vl(stackIn_305_2, a.field_h[0]);
                              var4_ref_vl.field_q = 16711680;
                              if (nc.field_H != 4) {
                                break L82;
                              } else {
                                var4_ref_vl.field_p = 10;
                                var4_ref_vl.field_q = 16776960;
                                break L82;
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
                            continue L80;
                          }
                        }
                      }
                    } else {
                      L83: {
                        stackOut_290_0 = null;
                        stackOut_290_1 = null;
                        stackIn_293_0 = stackOut_290_0;
                        stackIn_293_1 = stackOut_290_1;
                        stackIn_291_0 = stackOut_290_0;
                        stackIn_291_1 = stackOut_290_1;
                        if (nc.field_H != 4) {
                          stackOut_293_0 = null;
                          stackOut_293_1 = null;
                          stackOut_293_2 = 1;
                          stackIn_294_0 = stackOut_293_0;
                          stackIn_294_1 = stackOut_293_1;
                          stackIn_294_2 = stackOut_293_2;
                          break L83;
                        } else {
                          stackOut_291_0 = null;
                          stackOut_291_1 = null;
                          stackIn_292_0 = stackOut_291_0;
                          stackIn_292_1 = stackOut_291_1;
                          stackOut_292_0 = null;
                          stackOut_292_1 = null;
                          stackOut_292_2 = 4;
                          stackIn_294_0 = stackOut_292_0;
                          stackIn_294_1 = stackOut_292_1;
                          stackIn_294_2 = stackOut_292_2;
                          break L83;
                        }
                      }
                      L84: {
                        var4_ref_vl = new vl(stackIn_294_2, a.field_h[0]);
                        var4_ref_vl.field_q = 16711680;
                        if (nc.field_H == 4) {
                          var4_ref_vl.field_q = 16776960;
                          var4_ref_vl.field_p = 10;
                          break L84;
                        } else {
                          break L84;
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
                      continue L79;
                    }
                  }
                } else {
                  break L73;
                }
              }
              if (!si.field_jb[99]) {
                break L72;
              } else {
                if (0 < a.field_h[0].field_g) {
                  L85: {
                    a.field_h[0].field_k = a.field_h[0].field_k + 0.05 * Math.cos(2.0 * ((double)a.field_h[0].field_h * 3.141592653589793) / 256.0);
                    a.field_h[0].field_d = a.field_h[0].field_d + 0.05 * Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                    if (!fe.field_e) {
                      break L85;
                    } else {
                      if (og.field_a <= 0) {
                        ll.field_c.a(sb.field_e[0], 100, pk.field_h / 4);
                        og.field_a = 5;
                        break L85;
                      } else {
                        break L85;
                      }
                    }
                  }
                  var2_int = 3;
                  var3 = 5;
                  var5 = 0;
                  L86: while (true) {
                    if (~var2_int >= ~var5) {
                      var5 = 0;
                      L87: while (true) {
                        if (~var2_int >= ~var5) {
                          break L72;
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
                          continue L87;
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
                      continue L86;
                    }
                  }
                } else {
                  break L72;
                }
              }
            }
            L88: {
              L89: {
                if (si.field_jb[98]) {
                  break L89;
                } else {
                  if (si.field_jb[99]) {
                    break L89;
                  } else {
                    if (0 >= a.field_h[0].field_g) {
                      break L89;
                    } else {
                      a.field_h[0].field_d = a.field_h[0].field_d * 0.99;
                      a.field_h[0].field_k = a.field_h[0].field_k * 0.99;
                      if (gj.field_r == null) {
                        break L88;
                      } else {
                        if (0 > og.field_a) {
                          break L88;
                        } else {
                          og.field_a = -1;
                          gj.field_r.b(25, 0);
                          break L88;
                        }
                      }
                    }
                  }
                }
              }
              if (null == gj.field_r) {
                L90: {
                  gj.field_r = gd.a(sb.field_e[0], 100, 0);
                  gj.field_r.e(-1);
                  ll.field_c.a((kd) (Object) gj.field_r);
                  stackOut_326_0 = gj.field_r;
                  stackOut_326_1 = 10;
                  stackIn_329_0 = stackOut_326_0;
                  stackIn_329_1 = stackOut_326_1;
                  stackIn_327_0 = stackOut_326_0;
                  stackIn_327_1 = stackOut_326_1;
                  if (fe.field_e) {
                    stackOut_329_0 = (gd) (Object) stackIn_329_0;
                    stackOut_329_1 = stackIn_329_1;
                    stackOut_329_2 = pk.field_h / 2;
                    stackIn_330_0 = stackOut_329_0;
                    stackIn_330_1 = stackOut_329_1;
                    stackIn_330_2 = stackOut_329_2;
                    break L90;
                  } else {
                    stackOut_327_0 = (gd) (Object) stackIn_327_0;
                    stackOut_327_1 = stackIn_327_1;
                    stackIn_328_0 = stackOut_327_0;
                    stackIn_328_1 = stackOut_327_1;
                    stackOut_328_0 = (gd) (Object) stackIn_328_0;
                    stackOut_328_1 = stackIn_328_1;
                    stackOut_328_2 = 0;
                    stackIn_330_0 = stackOut_328_0;
                    stackIn_330_1 = stackOut_328_1;
                    stackIn_330_2 = stackOut_328_2;
                    break L90;
                  }
                }
                ((gd) (Object) stackIn_330_0).b(stackIn_330_1, stackIn_330_2);
                break L88;
              } else {
                if (0 < og.field_a) {
                  break L88;
                } else {
                  L91: {
                    og.field_a = 10;
                    stackOut_321_0 = gj.field_r;
                    stackOut_321_1 = 10;
                    stackIn_324_0 = stackOut_321_0;
                    stackIn_324_1 = stackOut_321_1;
                    stackIn_322_0 = stackOut_321_0;
                    stackIn_322_1 = stackOut_321_1;
                    if (fe.field_e) {
                      stackOut_324_0 = (gd) (Object) stackIn_324_0;
                      stackOut_324_1 = stackIn_324_1;
                      stackOut_324_2 = pk.field_h / 2;
                      stackIn_325_0 = stackOut_324_0;
                      stackIn_325_1 = stackOut_324_1;
                      stackIn_325_2 = stackOut_324_2;
                      break L91;
                    } else {
                      stackOut_322_0 = (gd) (Object) stackIn_322_0;
                      stackOut_322_1 = stackIn_322_1;
                      stackIn_323_0 = stackOut_322_0;
                      stackIn_323_1 = stackOut_322_1;
                      stackOut_323_0 = (gd) (Object) stackIn_323_0;
                      stackOut_323_1 = stackIn_323_1;
                      stackOut_323_2 = 0;
                      stackIn_325_0 = stackOut_323_0;
                      stackIn_325_1 = stackOut_323_1;
                      stackIn_325_2 = stackOut_323_2;
                      break L91;
                    }
                  }
                  ((gd) (Object) stackIn_325_0).b(stackIn_325_1, stackIn_325_2);
                  break L88;
                }
              }
            }
            L92: {
              L93: {
                a.field_h[0].field_k = a.field_h[0].field_k * 0.99;
                if (!si.field_jb[97]) {
                  break L93;
                } else {
                  if (a.field_h[0].field_g <= 0) {
                    break L93;
                  } else {
                    L94: {
                      if (8 != e.field_e) {
                        stackOut_337_0 = -75;
                        stackIn_338_0 = stackOut_337_0;
                        break L94;
                      } else {
                        stackOut_336_0 = -150;
                        stackIn_338_0 = stackOut_336_0;
                        break L94;
                      }
                    }
                    L95: {
                      var2_int = stackIn_338_0;
                      if (((stellarshard) this).field_M > var2_int / 3) {
                        ((stellarshard) this).field_M = var2_int / 3;
                        break L95;
                      } else {
                        break L95;
                      }
                    }
                    L96: {
                      if (var2_int >= ((stellarshard) this).field_M) {
                        break L96;
                      } else {
                        ((stellarshard) this).field_M = ((stellarshard) this).field_M - 6;
                        break L96;
                      }
                    }
                    break L92;
                  }
                }
              }
              if (((stellarshard) this).field_M >= 0) {
                break L92;
              } else {
                ((stellarshard) this).field_M = ((stellarshard) this).field_M + 5;
                if (0 >= ((stellarshard) this).field_M) {
                  break L92;
                } else {
                  ((stellarshard) this).field_M = 0;
                  break L92;
                }
              }
            }
            L97: {
              L98: {
                a.field_h[0].field_d = a.field_h[0].field_d * 0.99;
                if (!si.field_jb[96]) {
                  break L98;
                } else {
                  if (a.field_h[0].field_g <= 0) {
                    break L98;
                  } else {
                    L99: {
                      if (e.field_e != 8) {
                        stackOut_355_0 = 75;
                        stackIn_356_0 = stackOut_355_0;
                        break L99;
                      } else {
                        stackOut_354_0 = 150;
                        stackIn_356_0 = stackOut_354_0;
                        break L99;
                      }
                    }
                    L100: {
                      var2_int = stackIn_356_0;
                      if (~(var2_int / 3) >= ~((stellarshard) this).field_M) {
                        break L100;
                      } else {
                        ((stellarshard) this).field_M = var2_int / 3;
                        break L100;
                      }
                    }
                    L101: {
                      if (((stellarshard) this).field_M >= var2_int) {
                        break L101;
                      } else {
                        ((stellarshard) this).field_M = ((stellarshard) this).field_M + 6;
                        break L101;
                      }
                    }
                    break L97;
                  }
                }
              }
              if (((stellarshard) this).field_M > 0) {
                ((stellarshard) this).field_M = ((stellarshard) this).field_M - 5;
                if (((stellarshard) this).field_M >= 0) {
                  break L97;
                } else {
                  ((stellarshard) this).field_M = 0;
                  break L97;
                }
              } else {
                break L97;
              }
            }
            L102: {
              a.field_h[0].field_j = ((stellarshard) this).field_M;
              if (si.field_jb[83]) {
                break L102;
              } else {
                if (si.field_jb[82]) {
                  break L102;
                } else {
                  if (10 != e.field_e) {
                    break L71;
                  } else {
                    if (a.field_h[0].field_i >= 0) {
                      break L71;
                    } else {
                      break L102;
                    }
                  }
                }
              }
            }
            if (0 < a.field_h[0].field_g) {
              L103: {
                var2_int = e.field_e;
                if (var2_int == -1) {
                  if (!fe.field_e) {
                    break L103;
                  } else {
                    if (a.field_h[0].field_i > 0) {
                      break L103;
                    } else {
                      ll.field_c.a(sb.field_e[27], 100, 2 * pk.field_h);
                      break L103;
                    }
                  }
                } else {
                  if (var2_int == 0) {
                    if (!fe.field_e) {
                      break L103;
                    } else {
                      if (0 < a.field_h[0].field_i) {
                        break L103;
                      } else {
                        ll.field_c.a(sb.field_e[38], 100, pk.field_h * 2);
                        break L103;
                      }
                    }
                  } else {
                    if (var2_int != 1) {
                      if (2 == var2_int) {
                        if (!fe.field_e) {
                          break L103;
                        } else {
                          if (a.field_h[0].field_i > 0) {
                            break L103;
                          } else {
                            ll.field_c.a(sb.field_e[1], 100, pk.field_h * 2);
                            break L103;
                          }
                        }
                      } else {
                        if (3 != var2_int) {
                          if (4 == var2_int) {
                            if (!fe.field_e) {
                              break L103;
                            } else {
                              if (0 >= af.field_o) {
                                ll.field_c.a(sb.field_e[24], 100, 2 * pk.field_h);
                                af.field_o = 3;
                                break L103;
                              } else {
                                break L103;
                              }
                            }
                          } else {
                            if (var2_int == 5) {
                              if (!fe.field_e) {
                                break L103;
                              } else {
                                if (0 < a.field_h[0].field_i) {
                                  break L103;
                                } else {
                                  ll.field_c.a(sb.field_e[39], 100, pk.field_h * 2);
                                  break L103;
                                }
                              }
                            } else {
                              if (var2_int == 6) {
                                if (!fe.field_e) {
                                  break L103;
                                } else {
                                  if (a.field_h[0].field_i > 0) {
                                    break L103;
                                  } else {
                                    ll.field_c.a(sb.field_e[22], 100, 2 * pk.field_h);
                                    break L103;
                                  }
                                }
                              } else {
                                if (var2_int == 7) {
                                  if (!fe.field_e) {
                                    break L103;
                                  } else {
                                    if (a.field_h[0].field_i > 0) {
                                      break L103;
                                    } else {
                                      ll.field_c.a(sb.field_e[34], 100, 2 * pk.field_h);
                                      break L103;
                                    }
                                  }
                                } else {
                                  if (var2_int != 8) {
                                    if (var2_int == 9) {
                                      if (!fe.field_e) {
                                        break L103;
                                      } else {
                                        if (af.field_o <= 0) {
                                          ll.field_c.a(sb.field_e[7], 100, 2 * pk.field_h);
                                          af.field_o = 5;
                                          break L103;
                                        } else {
                                          break L103;
                                        }
                                      }
                                    } else {
                                      if (var2_int != 10) {
                                        break L103;
                                      } else {
                                        if (!fe.field_e) {
                                          break L103;
                                        } else {
                                          if (a.field_h[0].field_i != -1) {
                                            break L103;
                                          } else {
                                            ll.field_c.a(sb.field_e[25], 100, pk.field_h * 2);
                                            break L103;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (!fe.field_e) {
                                      break L103;
                                    } else {
                                      if (af.field_o <= 0) {
                                        ll.field_c.a(sb.field_e[20], 100, pk.field_h * 2);
                                        af.field_o = (int)(Math.random() * 10.0) + 15;
                                        break L103;
                                      } else {
                                        break L103;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (!fe.field_e) {
                            break L103;
                          } else {
                            if (a.field_h[0].field_i <= 0) {
                              ll.field_c.a(sb.field_e[21], 100, 2 * pk.field_h);
                              break L103;
                            } else {
                              break L103;
                            }
                          }
                        }
                      }
                    } else {
                      if (!fe.field_e) {
                        break L103;
                      } else {
                        if (a.field_h[0].field_i <= 0) {
                          ll.field_c.a(sb.field_e[33], 100, pk.field_h * 2);
                          break L103;
                        } else {
                          break L103;
                        }
                      }
                    }
                  }
                }
              }
              if (a.field_h[0].field_i > 0) {
                break L71;
              } else {
                var4 = e.field_e;
                if (var4 != -1) {
                  if (var4 == 0) {
                    L104: {
                      int fieldTemp$19 = mj.field_F + 1;
                      mj.field_F = mj.field_F + 1;
                      if (fieldTemp$19 <= 1) {
                        break L104;
                      } else {
                        mj.field_F = 0;
                        break L104;
                      }
                    }
                    a.field_h[0].field_i = 10;
                    var4 = -4;
                    L105: while (true) {
                      if (var4 > 4) {
                        break L71;
                      } else {
                        L106: {
                          L107: {
                            L108: {
                              var2_ref = new vl(0, a.field_h[0]);
                              var2_ref.field_j = var2_ref.field_j - Math.sin(2.0 * ((double)(a.field_h[0].field_h - -var4) * 3.141592653589793) / 256.0) * 8.0;
                              var2_ref.field_a = var2_ref.field_a - Math.cos(3.141592653589793 * (double)(var4 + a.field_h[0].field_h) * 2.0 / 256.0) * 8.0;
                              var2_ref.field_k = -((double)var4 * var2_ref.field_j / 4.0) + (a.field_h[0].field_l + 2.0 * var2_ref.field_a);
                              var2_ref.field_c = var2_ref.field_a * (double)var4 / 4.0 + (a.field_h[0].field_a + 2.0 * var2_ref.field_j);
                              var2_ref.field_q = 255;
                              var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k;
                              var2_ref.field_n = e.field_e;
                              var2_ref.field_p = 2;
                              var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d;
                              if (var4 != 0) {
                                break L108;
                              } else {
                                if (mj.field_F == 0) {
                                  break L107;
                                } else {
                                  break L108;
                                }
                              }
                            }
                            if (var4 == 0) {
                              break L106;
                            } else {
                              if (1 != mj.field_F) {
                                break L106;
                              } else {
                                break L107;
                              }
                            }
                          }
                          var2_ref.field_q = 8421631;
                          break L106;
                        }
                        wk.field_b[eg.a(-109)] = var2_ref;
                        var4 += 4;
                        continue L105;
                      }
                    }
                  } else {
                    if (var4 == 1) {
                      L109: {
                        int fieldTemp$20 = mj.field_F + 1;
                        mj.field_F = mj.field_F + 1;
                        if (fieldTemp$20 > 1) {
                          mj.field_F = 0;
                          break L109;
                        } else {
                          break L109;
                        }
                      }
                      a.field_h[0].field_i = 5;
                      var4 = -3;
                      L110: while (true) {
                        if (var4 > 3) {
                          break L71;
                        } else {
                          L111: {
                            L112: {
                              var2_ref = new vl(0, a.field_h[0]);
                              var2_ref.field_j = var2_ref.field_j - Math.sin(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h + var4)) / 256.0) * 6.0;
                              var2_ref.field_a = var2_ref.field_a - 6.0 * Math.cos((double)(a.field_h[0].field_h - -var4) * 3.141592653589793 * 2.0 / 256.0);
                              var2_ref.field_k = a.field_h[0].field_l + var2_ref.field_a * 4.0 - (double)var4 * var2_ref.field_j / 2.0;
                              var2_ref.field_c = var2_ref.field_a * (double)var4 / 2.0 + (var2_ref.field_j * 4.0 + a.field_h[0].field_a);
                              var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d;
                              var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k;
                              var2_ref.field_p = 1;
                              wk.field_b[eg.a(-91)] = var2_ref;
                              var2_ref.field_q = 16728128;
                              var2_ref.field_n = e.field_e;
                              if (Math.abs(var4) > 1) {
                                if (Math.abs(var4) <= 1) {
                                  break L111;
                                } else {
                                  if (mj.field_F == 1) {
                                    break L112;
                                  } else {
                                    break L111;
                                  }
                                }
                              } else {
                                break L112;
                              }
                            }
                            var2_ref.field_q = 16760896;
                            break L111;
                          }
                          var4 += 2;
                          continue L110;
                        }
                      }
                    } else {
                      if (var4 != 2) {
                        if (3 != var4) {
                          if (var4 != 4) {
                            if (5 != var4) {
                              if (6 == var4) {
                                a.field_h[0].field_i = 5;
                                var4 = -10;
                                L113: while (true) {
                                  if (var4 > 10) {
                                    break L71;
                                  } else {
                                    var2_ref = new vl(0, a.field_h[0]);
                                    var2_ref.field_j = var2_ref.field_j - Math.sin((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0) * 6.0;
                                    var2_ref.field_a = var2_ref.field_a - 6.0 * Math.cos(2.0 * ((double)(a.field_h[0].field_h - -var4) * 3.141592653589793) / 256.0);
                                    var2_ref.field_c = var2_ref.field_j * 4.0 + a.field_h[0].field_a;
                                    var2_ref.field_k = a.field_h[0].field_l + var2_ref.field_a * 4.0;
                                    var2_ref.field_p = 1;
                                    var2_ref.field_d = 65535;
                                    var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k;
                                    var2_ref.field_q = 16776960;
                                    var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d;
                                    wk.field_b[eg.a(-113)] = var2_ref;
                                    var2_ref.field_n = e.field_e;
                                    var4 += 4;
                                    continue L113;
                                  }
                                }
                              } else {
                                if (var4 != 7) {
                                  if (var4 != 8) {
                                    if (var4 == 9) {
                                      a.field_h[0].field_i = 1;
                                      var4 = -2;
                                      L114: while (true) {
                                        if (var4 > 2) {
                                          break L71;
                                        } else {
                                          var2_ref = new vl(0, a.field_h[0]);
                                          var2_ref.field_j = var2_ref.field_j - Math.sin(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0) * 2.0;
                                          var2_ref.field_a = var2_ref.field_a - Math.cos(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h - -var4)) / 256.0) * 2.0;
                                          var2_ref.field_m = 2;
                                          var2_ref.field_q = 16711680;
                                          var2_ref.field_d = 16776960;
                                          var2_ref.field_k = 8.0 * var2_ref.field_a + a.field_h[0].field_l;
                                          var2_ref.field_p = 1;
                                          var2_ref.field_c = 8.0 * var2_ref.field_j + a.field_h[0].field_a;
                                          wk.field_b[eg.a(-70)] = var2_ref;
                                          var2_ref.field_l = 1001;
                                          var2_ref.field_n = e.field_e;
                                          var4 += 4;
                                          continue L114;
                                        }
                                      }
                                    } else {
                                      if (10 != var4) {
                                        break L71;
                                      } else {
                                        L115: {
                                          a.field_h[0].field_i = a.field_h[0].field_i - 1;
                                          if (a.field_h[0].field_i > -25) {
                                            break L115;
                                          } else {
                                            a.field_h[0].field_i = 10;
                                            break L115;
                                          }
                                        }
                                        L116: {
                                          var3 = -a.field_h[0].field_i;
                                          if (15 < var3) {
                                            var3 = -var3 + 25;
                                            break L116;
                                          } else {
                                            break L116;
                                          }
                                        }
                                        L117: {
                                          if (var3 <= 10) {
                                            break L117;
                                          } else {
                                            var3 = 10;
                                            break L117;
                                          }
                                        }
                                        L118: {
                                          if (var3 < 1) {
                                            var3 = 1;
                                            break L118;
                                          } else {
                                            break L118;
                                          }
                                        }
                                        var4 = -1;
                                        L119: while (true) {
                                          if (var4 > 1) {
                                            break L71;
                                          } else {
                                            L120: {
                                              var2_ref = new vl(0, a.field_h[0]);
                                              var2_ref.field_j = var2_ref.field_j - Math.sin(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h - -(0 * var4))) / 256.0) * 8.0;
                                              var2_ref.field_a = var2_ref.field_a - Math.cos(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h + var4 * 0)) / 256.0) * 8.0;
                                              var2_ref.field_m = 2;
                                              var2_ref.field_p = var3;
                                              var2_ref.field_q = 65535;
                                              var2_ref.field_d = 16777215;
                                              var2_ref.field_c = (double)var4 * var2_ref.field_a * (double)var3 / 10.0 + (var2_ref.field_j * 2.0 + a.field_h[0].field_a);
                                              var2_ref.field_k = a.field_h[0].field_l + var2_ref.field_a * 2.0 - var2_ref.field_j * (double)var4 * (double)var3 / 10.0;
                                              wk.field_b[eg.a(-75)] = var2_ref;
                                              var2_ref.field_l = 6;
                                              var2_ref.field_n = e.field_e;
                                              if (var4 == 0) {
                                                break L120;
                                              } else {
                                                var2_ref.field_n = 11;
                                                break L120;
                                              }
                                            }
                                            var4++;
                                            continue L119;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    a.field_h[0].field_i = 1;
                                    var4 = 0;
                                    L121: while (true) {
                                      if (10 <= var4) {
                                        break L71;
                                      } else {
                                        var5_double = -8.0 + Math.random() * 17.0;
                                        var2_ref = new vl(4, a.field_h[0]);
                                        var2_ref.field_q = 16776960;
                                        var2_ref.field_j = var2_ref.field_j - 5.0 * Math.sin(2.0 * (3.141592653589793 * (var5_double + (double)a.field_h[0].field_h)) / 256.0);
                                        var2_ref.field_a = var2_ref.field_a - 5.0 * Math.cos(2.0 * (((double)a.field_h[0].field_h + var5_double) * 3.141592653589793) / 256.0);
                                        var2_ref.field_c = var2_ref.field_j * 3.0 + a.field_h[0].field_a;
                                        var2_ref.field_k = a.field_h[0].field_l + var2_ref.field_a * 3.0;
                                        var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d;
                                        var2_ref.field_p = 2;
                                        var2_ref.field_m = 1;
                                        var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k;
                                        wk.field_b[eg.a(-80)] = var2_ref;
                                        var4++;
                                        continue L121;
                                      }
                                    }
                                  }
                                } else {
                                  a.field_h[0].field_i = 10;
                                  var4 = -11;
                                  L122: while (true) {
                                    if (var4 > -9) {
                                      var4 = -3;
                                      L123: while (true) {
                                        if (var4 > 3) {
                                          var4 = 9;
                                          L124: while (true) {
                                            if (var4 > 11) {
                                              break L71;
                                            } else {
                                              L125: {
                                                var2_ref = new vl(0, a.field_h[0]);
                                                var5_double = 5.0;
                                                if (Math.abs(var4 + -10) == 3) {
                                                  var5_double = 4.5;
                                                  break L125;
                                                } else {
                                                  break L125;
                                                }
                                              }
                                              L126: {
                                                if (Math.abs(var4 - 10) == 2) {
                                                  var5_double = 4.8;
                                                  break L126;
                                                } else {
                                                  break L126;
                                                }
                                              }
                                              var2_ref.field_j = var2_ref.field_j - var5_double * Math.sin(2.0 * (3.141592653589793 * (double)(var4 + a.field_h[0].field_h)) / 256.0);
                                              var2_ref.field_a = var2_ref.field_a - Math.cos(2.0 * ((double)(a.field_h[0].field_h - -var4) * 3.141592653589793) / 256.0) * var5_double;
                                              var2_ref.field_k = 4.0 * var2_ref.field_a + a.field_h[0].field_l;
                                              var2_ref.field_c = a.field_h[0].field_a + 4.0 * var2_ref.field_j;
                                              var2_ref.field_q = 255;
                                              var2_ref.field_p = 2;
                                              var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d / 5.0;
                                              var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k / 5.0;
                                              var2_ref.field_d = 8454143;
                                              wk.field_b[eg.a(-112)] = var2_ref;
                                              var2_ref.field_n = e.field_e;
                                              var2_ref.field_l = 5;
                                              var4++;
                                              continue L124;
                                            }
                                          }
                                        } else {
                                          L127: {
                                            var2_ref = new vl(0, a.field_h[0]);
                                            var5_double = 5.0;
                                            if (Math.abs(var4) != 3) {
                                              break L127;
                                            } else {
                                              var5_double = 4.5;
                                              break L127;
                                            }
                                          }
                                          L128: {
                                            if (Math.abs(var4) != 2) {
                                              break L128;
                                            } else {
                                              var5_double = 4.8;
                                              break L128;
                                            }
                                          }
                                          var2_ref.field_j = var2_ref.field_j - var5_double * Math.sin(3.141592653589793 * (double)(var4 + a.field_h[0].field_h) * 2.0 / 256.0);
                                          var2_ref.field_a = var2_ref.field_a - var5_double * Math.cos(2.0 * (3.141592653589793 * (double)(var4 + a.field_h[0].field_h)) / 256.0);
                                          var2_ref.field_c = var2_ref.field_j * 4.0 + a.field_h[0].field_a;
                                          var2_ref.field_k = var2_ref.field_a * 4.0 + a.field_h[0].field_l;
                                          var2_ref.field_p = 3;
                                          var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k / 5.0;
                                          var2_ref.field_q = 49407;
                                          var2_ref.field_d = 8454143;
                                          var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d / 5.0;
                                          wk.field_b[eg.a(-40)] = var2_ref;
                                          var2_ref.field_n = e.field_e;
                                          var2_ref.field_l = 5;
                                          var4++;
                                          continue L123;
                                        }
                                      }
                                    } else {
                                      L129: {
                                        var2_ref = new vl(0, a.field_h[0]);
                                        var5_double = 5.0;
                                        if (3 != Math.abs(var4 + 10)) {
                                          break L129;
                                        } else {
                                          var5_double = 4.5;
                                          break L129;
                                        }
                                      }
                                      L130: {
                                        if (2 == Math.abs(var4 - -10)) {
                                          var5_double = 4.8;
                                          break L130;
                                        } else {
                                          break L130;
                                        }
                                      }
                                      var2_ref.field_j = var2_ref.field_j - var5_double * Math.sin(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0);
                                      var2_ref.field_a = var2_ref.field_a - var5_double * Math.cos(2.0 * (3.141592653589793 * (double)(var4 + a.field_h[0].field_h)) / 256.0);
                                      var2_ref.field_c = a.field_h[0].field_a + 4.0 * var2_ref.field_j;
                                      var2_ref.field_k = a.field_h[0].field_l + var2_ref.field_a * 4.0;
                                      var2_ref.field_l = 5;
                                      var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k / 5.0;
                                      var2_ref.field_d = 8454143;
                                      var2_ref.field_q = 255;
                                      var2_ref.field_p = 2;
                                      var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d / 5.0;
                                      wk.field_b[eg.a(-71)] = var2_ref;
                                      var2_ref.field_n = e.field_e;
                                      var4++;
                                      continue L122;
                                    }
                                  }
                                }
                              }
                            } else {
                              a.field_h[0].field_i = 35;
                              var4 = -30;
                              L131: while (true) {
                                if (30 < var4) {
                                  break L71;
                                } else {
                                  var2_ref = new vl(0, a.field_h[0]);
                                  var2_ref.field_j = var2_ref.field_j - Math.sin(3.141592653589793 * (double)(var4 + a.field_h[0].field_h) * 2.0 / 256.0) * 4.0;
                                  var2_ref.field_a = var2_ref.field_a - 4.0 * Math.cos((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0);
                                  var2_ref.field_c = a.field_h[0].field_a + var2_ref.field_j * 4.0;
                                  var2_ref.field_k = a.field_h[0].field_l + 4.0 * var2_ref.field_a;
                                  var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d;
                                  var2_ref.field_p = 1;
                                  var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k;
                                  var2_ref.field_q = 65280 + (Math.abs(var4) * 255 / 30 << 16 & 16771312);
                                  wk.field_b[eg.a(-54)] = var2_ref;
                                  var2_ref.field_n = e.field_e;
                                  var4++;
                                  continue L131;
                                }
                              }
                            }
                          } else {
                            L132: {
                              a.field_h[0].field_i = 0;
                              var2_ref = new vl(0, a.field_h[0]);
                              var2_ref.field_j = var2_ref.field_j - Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0) * 8.0;
                              var2_ref.field_a = var2_ref.field_a - Math.cos((double)a.field_h[0].field_h * 3.141592653589793 * 2.0 / 256.0) * 8.0;
                              var2_ref.field_q = 12422335;
                              var2_ref.field_m = 2;
                              var2_ref.field_k = var2_ref.field_a * 2.0 + a.field_h[0].field_l;
                              var2_ref.field_d = 9578383;
                              var2_ref.field_c = 2.0 * var2_ref.field_j + a.field_h[0].field_a;
                              var2_ref.field_l = 1000;
                              var2_ref.field_p = 1;
                              var4 = eg.a(-36);
                              if (var4 == -1) {
                                break L132;
                              } else {
                                wk.field_b[var4] = var2_ref;
                                break L132;
                              }
                            }
                            var2_ref.field_n = e.field_e;
                            break L71;
                          }
                        } else {
                          a.field_h[0].field_i = 10;
                          var4 = -3;
                          L133: while (true) {
                            if (var4 > 3) {
                              break L71;
                            } else {
                              L134: {
                                var2_ref = new vl(0, a.field_h[0]);
                                var5_double = 5.0;
                                if (Math.abs(var4) == 3) {
                                  var5_double = 4.5;
                                  break L134;
                                } else {
                                  break L134;
                                }
                              }
                              L135: {
                                if (2 != Math.abs(var4)) {
                                  break L135;
                                } else {
                                  var5_double = 4.8;
                                  break L135;
                                }
                              }
                              L136: {
                                var2_ref.field_j = var2_ref.field_j - var5_double * Math.sin((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0);
                                var2_ref.field_a = var2_ref.field_a - var5_double * Math.cos((double)(a.field_h[0].field_h - -var4) * 3.141592653589793 * 2.0 / 256.0);
                                var2_ref.field_k = var2_ref.field_a * 4.0 + a.field_h[0].field_l;
                                var2_ref.field_c = a.field_h[0].field_a + var2_ref.field_j * 4.0;
                                var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k / 5.0;
                                var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d / 5.0;
                                var2_ref.field_q = 16711680;
                                var2_ref.field_d = 16744576;
                                var2_ref.field_p = 3;
                                if (2 == Math.abs(var4)) {
                                  var2_ref.field_q = 16711680;
                                  var2_ref.field_d = 16760960;
                                  break L136;
                                } else {
                                  break L136;
                                }
                              }
                              L137: {
                                if (Math.abs(var4) == 1) {
                                  var2_ref.field_q = 16711680;
                                  var2_ref.field_d = 16777088;
                                  break L137;
                                } else {
                                  break L137;
                                }
                              }
                              L138: {
                                if (Math.abs(var4) == 0) {
                                  var2_ref.field_q = 16711680;
                                  var2_ref.field_d = 16777088;
                                  break L138;
                                } else {
                                  break L138;
                                }
                              }
                              wk.field_b[eg.a(-67)] = var2_ref;
                              var2_ref.field_n = e.field_e;
                              var2_ref.field_l = 5;
                              var4++;
                              continue L133;
                            }
                          }
                        }
                      } else {
                        L139: {
                          a.field_h[0].field_i = 6;
                          int fieldTemp$21 = mj.field_F + 1;
                          mj.field_F = mj.field_F + 1;
                          if (fieldTemp$21 <= 3) {
                            break L139;
                          } else {
                            mj.field_F = 0;
                            break L139;
                          }
                        }
                        var4 = -1;
                        L140: while (true) {
                          if (var4 > 1) {
                            break L71;
                          } else {
                            L141: {
                              var2_ref = new vl(0, a.field_h[0]);
                              if (var4 != -1) {
                                break L141;
                              } else {
                                mj.field_F = 3 - mj.field_F;
                                break L141;
                              }
                            }
                            L142: {
                              var2_ref.field_j = var2_ref.field_j - Math.sin(3.141592653589793 * (double)(a.field_h[0].field_h + 4 * (1 + mj.field_F) * var4) * 2.0 / 256.0) * 6.0;
                              var2_ref.field_a = var2_ref.field_a - Math.cos((double)(a.field_h[0].field_h + (mj.field_F - -1) * (var4 * 4)) * 3.141592653589793 * 2.0 / 256.0) * 6.0;
                              var2_ref.field_c = var2_ref.field_j * 3.0 + a.field_h[0].field_a;
                              if (var4 == -1) {
                                mj.field_F = -mj.field_F + 3;
                                break L142;
                              } else {
                                break L142;
                              }
                            }
                            L143: {
                              L144: {
                                L145: {
                                  var2_ref.field_k = a.field_h[0].field_l + var2_ref.field_a * 3.0;
                                  var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d;
                                  var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k;
                                  var2_ref.field_q = 255;
                                  var2_ref.field_p = 4;
                                  var2_ref.field_n = e.field_e;
                                  if (var4 != 0) {
                                    break L145;
                                  } else {
                                    if (0 == mj.field_F % 2) {
                                      break L144;
                                    } else {
                                      break L145;
                                    }
                                  }
                                }
                                if (var4 == 0) {
                                  break L143;
                                } else {
                                  if (mj.field_F % 2 == 1) {
                                    break L144;
                                  } else {
                                    break L143;
                                  }
                                }
                              }
                              var2_ref.field_q = 8421631;
                              break L143;
                            }
                            wk.field_b[eg.a(-51)] = var2_ref;
                            var4 += 2;
                            continue L140;
                          }
                        }
                      }
                    }
                  }
                } else {
                  L146: {
                    int fieldTemp$22 = mj.field_F + 1;
                    mj.field_F = mj.field_F + 1;
                    if (fieldTemp$22 > 4) {
                      mj.field_F = 0;
                      break L146;
                    } else {
                      break L146;
                    }
                  }
                  L147: {
                    a.field_h[0].field_i = 5;
                    var4 = mj.field_F + -1;
                    if (var4 != 2) {
                      break L147;
                    } else {
                      var4 = 0;
                      break L147;
                    }
                  }
                  L148: {
                    if (var4 == 3) {
                      var4 = -1;
                      break L148;
                    } else {
                      break L148;
                    }
                  }
                  L149: {
                    var2_ref = new vl(0, a.field_h[0]);
                    var2_ref.field_j = var2_ref.field_j - Math.sin(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0) * 8.0;
                    var2_ref.field_a = var2_ref.field_a - Math.cos((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0) * 8.0;
                    var2_ref.field_k = var2_ref.field_a * 2.0 + a.field_h[0].field_l;
                    var2_ref.field_c = a.field_h[0].field_a + var2_ref.field_j * 2.0;
                    var2_ref.field_q = 255;
                    var2_ref.field_p = 1;
                    var2_ref.field_n = e.field_e;
                    var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d;
                    var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k;
                    if (0 != var4) {
                      break L149;
                    } else {
                      var2_ref.field_q = 8421631;
                      var2_ref.field_p = 2;
                      break L149;
                    }
                  }
                  wk.field_b[eg.a(-27)] = var2_ref;
                  break L71;
                }
              }
            } else {
              break L71;
            }
          } else {
            break L71;
          }
        }
        L150: {
          if (!s.field_i) {
            break L150;
          } else {
            if (na.field_j == null) {
              L151: while (true) {
                if (!qh.c(89)) {
                  break L150;
                } else {
                  stackOut_652_0 = ~gi.field_f;
                  stackIn_653_0 = stackOut_652_0;
                  stackOut_653_0 = stackIn_653_0;
                  stackOut_653_1 = -34;
                  stackIn_654_0 = stackOut_653_0;
                  stackIn_654_1 = stackOut_653_1;
                  L152: {
                    if (stackIn_654_0 != stackIn_654_1) {
                      break L152;
                    } else {
                      if (ph.field_D < 2) {
                        break L152;
                      } else {
                        e.field_e = e.field_e + 1;
                        e.field_c = true;
                        if (e.field_e <= 10) {
                          break L152;
                        } else {
                          e.field_e = -1;
                          break L152;
                        }
                      }
                    }
                  }
                  L153: {
                    if (41 != gi.field_f) {
                      break L153;
                    } else {
                      if (ph.field_D < 2) {
                        break L153;
                      } else {
                        L154: {
                          if (hd.field_b) {
                            stackOut_666_0 = 0;
                            stackIn_667_0 = stackOut_666_0;
                            break L154;
                          } else {
                            stackOut_665_0 = 1;
                            stackIn_667_0 = stackOut_665_0;
                            break L154;
                          }
                        }
                        hd.field_b = stackIn_667_0 != 0;
                        break L153;
                      }
                    }
                  }
                  L155: {
                    if (gi.field_f != 48) {
                      break L155;
                    } else {
                      if (ph.field_D >= 2) {
                        int discarded$23 = 1;
                        hj.a(255, 0);
                        break L155;
                      } else {
                        break L155;
                      }
                    }
                  }
                  if (gi.field_f == 13) {
                    na.field_j = new ij((stellarshard) this);
                    tl.field_c = 0;
                    return;
                  } else {
                    continue L151;
                  }
                }
              }
            } else {
              break L150;
            }
          }
        }
        int discarded$24 = 50;
        this.q();
        var2_int = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        L156: while (true) {
          if (var5 >= 1000) {
            L157: {
              if (!s.field_i) {
                break L157;
              } else {
                if (pk.a(-12663, 0)) {
                  L158: {
                    L159: {
                      if (null == a.field_h[0]) {
                        break L159;
                      } else {
                        if (a.field_h[0].field_m != -1) {
                          break L159;
                        } else {
                          stackOut_720_0 = a.field_h[0];
                          stackIn_721_0 = stackOut_720_0;
                          if (stackIn_721_0.field_g > 0) {
                            break L159;
                          } else {
                            if (0 != nc.field_H) {
                              break L159;
                            } else {
                              stackOut_724_0 = 1;
                              stackIn_726_0 = stackOut_724_0;
                              break L158;
                            }
                          }
                        }
                      }
                    }
                    stackOut_725_0 = 0;
                    stackIn_726_0 = stackOut_725_0;
                    break L158;
                  }
                  L160: {
                    var5 = stackIn_726_0;
                    if (var5 == 0) {
                      pk.field_c = pk.field_c - 1;
                      if (pk.field_c < 0) {
                        L161: {
                          var6 = gh.field_b;
                          if (var6 > 5) {
                            var6 = 5;
                            break L161;
                          } else {
                            break L161;
                          }
                        }
                        pk.field_c = 25 + var6 * 25;
                        var7 = 160 + -(var6 * 32);
                        if (var7 <= 0) {
                          break L160;
                        } else {
                          if (fe.field_e) {
                            ll.field_c.a(sb.field_e[46], var7, pk.field_h * 6);
                            break L160;
                          } else {
                            break L160;
                          }
                        }
                      } else {
                        break L160;
                      }
                    } else {
                      break L160;
                    }
                  }
                  gf.field_c = gf.field_c + 1;
                  var6_double = 1.7976931348623157e+308;
                  var8 = null;
                  var9 = 0;
                  L162: while (true) {
                    if (var9 >= 1000) {
                      if (null == var8) {
                        break L157;
                      } else {
                        L163: {
                          var9 = 128;
                          if (var6_double <= 0.0) {
                            break L163;
                          } else {
                            var9 = (int)(2560.0 / var6_double);
                            break L163;
                          }
                        }
                        L164: {
                          if (var9 > 128) {
                            var9 = 128;
                            break L164;
                          } else {
                            break L164;
                          }
                        }
                        ag.field_a = ag.field_a + var9;
                        if (256 >= ag.field_a) {
                          break L157;
                        } else {
                          L165: {
                            if (fe.field_e) {
                              ll.field_c.a(sb.field_e[13], var9, pk.field_h * 64 / 50);
                              break L165;
                            } else {
                              break L165;
                            }
                          }
                          ag.field_a = 0;
                          break L157;
                        }
                      }
                    } else {
                      L166: {
                        var10 = a.field_h[var9];
                        if (var10 == null) {
                          break L166;
                        } else {
                          if (var10.field_m == -1) {
                            break L166;
                          } else {
                            if (var10.a((byte) -102)) {
                              var11 = -(int)var10.field_a + var2_int;
                              var12 = var3 - (int)var10.field_l;
                              var13 = Math.sqrt((double)(var12 * var12 + var11 * var11));
                              if (var13 >= var6_double) {
                                break L166;
                              } else {
                                var6_double = var13;
                                var8 = (Object) (Object) var10;
                                break L166;
                              }
                            } else {
                              break L166;
                            }
                          }
                        }
                      }
                      var9++;
                      continue L162;
                    }
                  }
                } else {
                  break L157;
                }
              }
            }
            fb.field_b = fb.field_b - var2_int;
            tk.field_b = tk.field_b - var3;
            sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 0.001 * (double)var3);
            ((stellarshard) this).field_H.a(sg.field_a, -125);
            sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.001 * (double)(-var2_int));
            ((stellarshard) this).field_H.a(sg.field_a, -126);
            var5 = 0;
            var6 = 0;
            L167: while (true) {
              if (var6 >= 12) {
                var5 = 0;
                L168: while (true) {
                  if (var5 >= 3000) {
                    var5 = 0;
                    L169: while (true) {
                      if (3000 <= var5) {
                        o.field_j = 0;
                        var5 = 0;
                        L170: while (true) {
                          if (var5 >= 1000) {
                            var5 = 0;
                            L171: while (true) {
                              if (var5 >= 1000) {
                                var5 = 0;
                                L172: while (true) {
                                  if (var5 >= 3000) {
                                    L173: {
                                      if (qi.field_a < 10) {
                                        break L173;
                                      } else {
                                        if (mk.field_k > 0) {
                                          break L173;
                                        } else {
                                          if (!s.field_i) {
                                            break L173;
                                          } else {
                                            nc.field_A = nc.field_A - 1;
                                            if (nc.field_A <= 0) {
                                              a.field_h[0] = null;
                                              this.k((byte) 97);
                                              break L173;
                                            } else {
                                              break L173;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L174: {
                                      if (50 != qi.field_a) {
                                        break L174;
                                      } else {
                                        if (nc.field_A > 0) {
                                          nc.field_A = nc.field_A - 1;
                                          if (nc.field_A > 0) {
                                            break L174;
                                          } else {
                                            a.field_h[0] = null;
                                            this.k((byte) 121);
                                            break L174;
                                          }
                                        } else {
                                          break L174;
                                        }
                                      }
                                    }
                                    L175: {
                                      if (qi.field_a < var4) {
                                        break L175;
                                      } else {
                                        L176: {
                                          if (qi.field_a < 10) {
                                            break L176;
                                          } else {
                                            if (mk.field_k <= 0) {
                                              break L175;
                                            } else {
                                              break L176;
                                            }
                                          }
                                        }
                                        if (na.field_j == null) {
                                          int discarded$25 = 3;
                                          this.n();
                                          break L175;
                                        } else {
                                          break L175;
                                        }
                                      }
                                    }
                                    L177: {
                                      if (null == na.field_j) {
                                        break L177;
                                      } else {
                                        if (!s.field_i) {
                                          L178: while (true) {
                                            if (!qh.c(79)) {
                                              L179: {
                                                if (null == na.field_j) {
                                                  break L179;
                                                } else {
                                                  L180: {
                                                    if (tl.field_c == 1) {
                                                      if (((stellarshard) this).field_Q < 612) {
                                                        break L180;
                                                      } else {
                                                        if (628 <= ((stellarshard) this).field_Q) {
                                                          break L180;
                                                        } else {
                                                          if (((stellarshard) this).field_O < 176) {
                                                            break L180;
                                                          } else {
                                                            if (((stellarshard) this).field_O >= 192) {
                                                              break L180;
                                                            } else {
                                                              if (gh.field_c == 1) {
                                                                n.field_L = 256;
                                                                tl.field_c = 0;
                                                                break L180;
                                                              } else {
                                                                break L180;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L180;
                                                    }
                                                  }
                                                  L181: {
                                                    if (tl.field_c != 2) {
                                                      break L181;
                                                    } else {
                                                      L182: {
                                                        if (((stellarshard) this).field_Q < 496) {
                                                          break L182;
                                                        } else {
                                                          if (512 <= ((stellarshard) this).field_Q) {
                                                            break L182;
                                                          } else {
                                                            if (208 > ((stellarshard) this).field_O) {
                                                              break L182;
                                                            } else {
                                                              if (((stellarshard) this).field_O >= 224) {
                                                                break L182;
                                                              } else {
                                                                if (gh.field_c != 1) {
                                                                  break L182;
                                                                } else {
                                                                  tl.field_c = 0;
                                                                  gh.field_d = null;
                                                                  n.field_L = 256;
                                                                  break L182;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L183: {
                                                        if (((stellarshard) this).field_Q < 248) {
                                                          break L183;
                                                        } else {
                                                          if (((stellarshard) this).field_Q > 264) {
                                                            break L183;
                                                          } else {
                                                            if (460 > ((stellarshard) this).field_O) {
                                                              break L183;
                                                            } else {
                                                              if (((stellarshard) this).field_O > 484) {
                                                                break L183;
                                                              } else {
                                                                if (1 == gh.field_c) {
                                                                  int fieldTemp$26 = si.field_X - 1;
                                                                  si.field_X = si.field_X - 1;
                                                                  if (fieldTemp$26 < 0) {
                                                                    si.field_X = si.field_X + 3;
                                                                    break L183;
                                                                  } else {
                                                                    break L183;
                                                                  }
                                                                } else {
                                                                  break L183;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      if (((stellarshard) this).field_Q < 376) {
                                                        break L181;
                                                      } else {
                                                        if (((stellarshard) this).field_Q > 392) {
                                                          break L181;
                                                        } else {
                                                          if (460 > ((stellarshard) this).field_O) {
                                                            break L181;
                                                          } else {
                                                            if (((stellarshard) this).field_O > 484) {
                                                              break L181;
                                                            } else {
                                                              if (gh.field_c != 1) {
                                                                break L181;
                                                              } else {
                                                                int fieldTemp$27 = si.field_X + 1;
                                                                si.field_X = si.field_X + 1;
                                                                if (fieldTemp$27 >= 3) {
                                                                  si.field_X = si.field_X - 3;
                                                                  break L181;
                                                                } else {
                                                                  break L181;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L184: {
                                                    if (3 != tl.field_c) {
                                                      break L184;
                                                    } else {
                                                      if (((stellarshard) this).field_Q < 496) {
                                                        break L184;
                                                      } else {
                                                        if (((stellarshard) this).field_Q >= 512) {
                                                          break L184;
                                                        } else {
                                                          if (208 > ((stellarshard) this).field_O) {
                                                            break L184;
                                                          } else {
                                                            if (((stellarshard) this).field_O >= 224) {
                                                              break L184;
                                                            } else {
                                                              if (gh.field_c == 1) {
                                                                tl.field_c = 0;
                                                                n.field_L = 256;
                                                                if (!oc.field_d) {
                                                                  break L184;
                                                                } else {
                                                                  tl.field_c = 2;
                                                                  oc.field_d = false;
                                                                  break L184;
                                                                }
                                                              } else {
                                                                break L184;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  na.field_j.a(true);
                                                  break L179;
                                                }
                                              }
                                              return;
                                            } else {
                                              L185: {
                                                if (null == na.field_j) {
                                                  break L185;
                                                } else {
                                                  if (gi.field_f != 13) {
                                                    break L185;
                                                  } else {
                                                    L186: {
                                                      if (tl.field_c == 2) {
                                                        break L186;
                                                      } else {
                                                        if (tl.field_c == 1) {
                                                          break L186;
                                                        } else {
                                                          if (tl.field_c != 3) {
                                                            break L185;
                                                          } else {
                                                            break L186;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    n.field_L = 256;
                                                    tl.field_c = 0;
                                                    continue L178;
                                                  }
                                                }
                                              }
                                              if (na.field_j != null) {
                                                na.field_j.b(8);
                                                continue L178;
                                              } else {
                                                continue L178;
                                              }
                                            }
                                          }
                                        } else {
                                          break L177;
                                        }
                                      }
                                    }
                                    L187: {
                                      if (s.field_i) {
                                        break L187;
                                      } else {
                                        L188: {
                                          if (wh.field_c > 1) {
                                            break L188;
                                          } else {
                                            if (ni.field_a) {
                                              break L187;
                                            } else {
                                              break L188;
                                            }
                                          }
                                        }
                                        L189: {
                                          na.field_j = new ij((stellarshard) this);
                                          if (!ni.field_a) {
                                            tl.field_c = 4;
                                            na.field_j.field_l = 8;
                                            break L189;
                                          } else {
                                            break L189;
                                          }
                                        }
                                        ni.field_a = false;
                                        break L187;
                                      }
                                    }
                                    return;
                                  } else {
                                    stackOut_808_0 = null;
                                    stackOut_808_1 = wk.field_b[var5];
                                    stackIn_809_0 = stackOut_808_0;
                                    stackIn_809_1 = stackOut_808_1;
                                    L190: {
                                      if (stackIn_809_0 != (Object) (Object) stackIn_809_1) {
                                        wk.field_b[var5].a(var3, var2_int, true);
                                        break L190;
                                      } else {
                                        break L190;
                                      }
                                    }
                                    var5++;
                                    continue L172;
                                  }
                                }
                              } else {
                                L191: {
                                  if (null == a.field_h[var5]) {
                                    break L191;
                                  } else {
                                    a.field_h[var5].a((byte) -110, var2_int, var3);
                                    break L191;
                                  }
                                }
                                var5++;
                                continue L171;
                              }
                            }
                          } else {
                            L192: {
                              if (null != hf.field_e[var5]) {
                                hf.field_e[var5] = hf.field_e[var5].a(0);
                                o.field_j = o.field_j + 1;
                                break L192;
                              } else {
                                break L192;
                              }
                            }
                            var5++;
                            continue L170;
                          }
                        }
                      } else {
                        L193: {
                          if (null != wk.field_b[var5]) {
                            wk.field_b[var5] = wk.field_b[var5].a((byte) -126);
                            break L193;
                          } else {
                            break L193;
                          }
                        }
                        var5++;
                        continue L169;
                      }
                    }
                  } else {
                    stackOut_777_0 = wk.field_b[var5];
                    stackIn_778_0 = stackOut_777_0;
                    L194: {
                      if (stackIn_778_0 == null) {
                        break L194;
                      } else {
                        if (5 == wk.field_b[var5].field_f) {
                          wk.field_b[var5] = null;
                          break L194;
                        } else {
                          break L194;
                        }
                      }
                    }
                    var5++;
                    continue L168;
                  }
                }
              } else {
                L195: {
                  fk.field_k[var5] = fk.field_k[var5] + (-(var2_int << 4) + fk.field_k[var5 - -2]);
                  fk.field_k[1 + var5] = fk.field_k[1 + var5] + (fk.field_k[var5 - -3] - (var3 << 4));
                  if (fk.field_k[var5] >= -2048) {
                    break L195;
                  } else {
                    fk.field_k[var5] = fk.field_k[var5] + 14336;
                    break L195;
                  }
                }
                L196: {
                  if (fk.field_k[var5] <= 12288) {
                    break L196;
                  } else {
                    fk.field_k[var5] = fk.field_k[var5] - 14336;
                    break L196;
                  }
                }
                L197: {
                  if (fk.field_k[1 + var5] < -2048) {
                    fk.field_k[1 + var5] = fk.field_k[1 + var5] + 11776;
                    break L197;
                  } else {
                    break L197;
                  }
                }
                L198: {
                  if (fk.field_k[1 + var5] <= 9728) {
                    break L198;
                  } else {
                    fk.field_k[var5 + 1] = fk.field_k[var5 + 1] - 11776;
                    break L198;
                  }
                }
                var5 += 4;
                var6++;
                continue L167;
              }
            }
          } else {
            L199: {
              if (a.field_h[var5] == null) {
                break L199;
              } else {
                if (14 != a.field_h[var5].field_m) {
                  break L199;
                } else {
                  if (var5 >= 999) {
                    break L199;
                  } else {
                    L200: {
                      if (null == a.field_h[1 + var5]) {
                        break L200;
                      } else {
                        if (a.field_h[1 + var5].field_m == 14) {
                          break L199;
                        } else {
                          break L200;
                        }
                      }
                    }
                    var6_ref_qe = a.field_h[var5];
                    a.field_h[var5] = a.field_h[1 + var5];
                    a.field_h[1 + var5] = var6_ref_qe;
                    break L199;
                  }
                }
              }
            }
            L201: {
              if (a.field_h[var5] == null) {
                break L201;
              } else {
                L202: {
                  if (a.field_h[var5].field_m == -1) {
                    var2_int = (int)a.field_h[var5].field_a;
                    var3 = (int)a.field_h[var5].field_l;
                    break L202;
                  } else {
                    if (a.field_h[var5].field_m == 11) {
                      break L202;
                    } else {
                      L203: {
                        var4++;
                        if (1 == a.field_h[var5].field_m) {
                          var4 += 2;
                          break L203;
                        } else {
                          break L203;
                        }
                      }
                      L204: {
                        if (a.field_h[var5].field_m != 5) {
                          break L204;
                        } else {
                          var4 += 2;
                          break L204;
                        }
                      }
                      L205: {
                        if (3 != a.field_h[var5].field_m) {
                          break L205;
                        } else {
                          var4 += 2;
                          break L205;
                        }
                      }
                      L206: {
                        if (7 != a.field_h[var5].field_m) {
                          break L206;
                        } else {
                          var4 += 4;
                          break L206;
                        }
                      }
                      L207: {
                        if (6 == a.field_h[var5].field_m) {
                          var4 += 4;
                          break L207;
                        } else {
                          break L207;
                        }
                      }
                      if (a.field_h[var5].field_m == 14) {
                        var4 += 20;
                        break L202;
                      } else {
                        break L202;
                      }
                    }
                  }
                }
                a.field_h[var5] = a.field_h[var5].a(-95);
                break L201;
              }
            }
            var5++;
            continue L156;
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
          throw ma.a((Throwable) (Object) var4, "stellarshard.EB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0;
    }

    final void f(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != s.field_e) {
                nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
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
              int discarded$2 = 0;
              t.a();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "stellarshard.FA(" + param0 + ')');
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
              int discarded$125 = -78;
              ni.a();
              int discarded$126 = -1;
              eb.a();
              int discarded$127 = 30063;
              ob.a();
              int discarded$128 = -84;
              rl.a();
              int discarded$129 = -12;
              rb.m();
              int discarded$130 = -107;
              wg.a();
              ac.b(-53);
              int discarded$131 = -20;
              be.a();
              int discarded$132 = 31147;
              fe.a();
              ti.a();
              pf.a(30300);
              t.a(param0 ^ 6079);
              int discarded$133 = -93;
              wi.a();
              int discarded$134 = -14;
              ka.a();
              ih.a(38858);
              te.a((byte) -84);
              int discarded$135 = 121;
              hj.a();
              int discarded$136 = 1;
              ak.a();
              int discarded$137 = 104;
              wd.a();
              int discarded$138 = 0;
              ca.a();
              int discarded$139 = -69;
              qj.a();
              int discarded$140 = -41;
              hd.a();
              nj.a(param0 ^ 49);
              int discarded$141 = 0;
              cj.a();
              ed.a(param0 + 30);
              bl.a(false);
              int discarded$142 = 0;
              sf.a();
              int discarded$143 = -1;
              ci.c();
              vi.b((byte) 82);
              fj.a((byte) 59);
              int discarded$144 = 88;
              va.a();
              jb.a(0);
              int discarded$145 = -118;
              vl.a();
              int discarded$146 = 0;
              mb.a();
              int discarded$147 = 1;
              oj.a();
              jj.a(param0 + 19045);
              d.e();
              ba.d();
              int discarded$148 = 126;
              ag.a();
              gg.b((byte) -127);
              int discarded$149 = -2918;
              fb.c();
              rk.a(true);
              int discarded$150 = 48;
              vh.b();
              fh.a((byte) 89);
              int discarded$151 = -15917;
              jf.a();
              ha.i(param0 + 244);
              int discarded$152 = 96;
              pk.a();
              cc.b();
              ie.e(-28692);
              ah.a((byte) -31);
              int discarded$153 = -14755;
              ra.b();
              int discarded$154 = -15967;
              qf.a();
              int discarded$155 = -118;
              gf.a();
              bd.a();
              de.a(4);
              int discarded$156 = 2;
              bf.a();
              int discarded$157 = 54;
              qd.b();
              int discarded$158 = 5;
              eh.a();
              int discarded$159 = 98;
              k.a();
              int discarded$160 = 45;
              h.a();
              ei.g((byte) 77);
              int discarded$161 = 1;
              jg.e();
              pg.m(7694);
              ck.m(-121);
              mj.l(120);
              se.e((byte) 9);
              la.a(param0 ^ -16);
              int discarded$162 = 120;
              lj.h();
              am.b(param0 ^ 36);
              hc.a(param0 ^ -21153);
              lg.a(param0 ^ 69);
              int discarded$163 = -16;
              lh.a();
              sl.a(-127);
              wf.b(param0 + 227);
              qh.a(param0 + -15392);
              tj.a();
              ad.c();
              mi.a();
              gk.a(param0 + 129);
              int discarded$164 = 86;
              fc.a();
              tf.b(param0 + 22);
              l.a(0);
              int discarded$165 = 52;
              nk.a();
              int discarded$166 = 1;
              o.a();
              int discarded$167 = -9746;
              ve.a();
              int discarded$168 = 0;
              bi.e();
              tk.a((byte) -86);
              int discarded$169 = -126;
              jd.a();
              int discarded$170 = 0;
              ib.a();
              int discarded$171 = -30;
              ok.b();
              if (param0 == -128) {
                break L1;
              } else {
                ((stellarshard) this).l((byte) 47);
                break L1;
              }
            }
            int discarded$172 = 119;
            mf.a();
            int discarded$173 = -99;
            ue.b();
            int discarded$174 = 0;
            oe.a();
            int discarded$175 = -50;
            ua.a();
            sk.a(true);
            int discarded$176 = -3323;
            a.a();
            qa.c();
            vd.a(94);
            kc.a(true);
            wj.d((byte) 92);
            al.b(param0 + 128);
            ph.h(param0 ^ -15);
            el.h(param0 + 186);
            wc.a(true);
            int discarded$177 = 37;
            kb.a();
            rh.a(param0 + 26);
            ki.e(param0 + 16512);
            int discarded$178 = 124;
            na.b();
            int discarded$179 = 0;
            tg.b();
            int discarded$180 = 4;
            dj.a();
            id.a(param0 + 1392322593);
            int discarded$181 = -1;
            wh.b();
            int discarded$182 = -11;
            n.c();
            int discarded$183 = 43;
            fl.a();
            ke.a(false);
            int discarded$184 = -60;
            ng.a();
            eg.b(-89);
            int discarded$185 = 77;
            aa.a();
            si.f(-16412);
            int discarded$186 = 105;
            sb.a();
            hi.a((byte) -92);
            int discarded$187 = 186;
            e.a();
            int discarded$188 = 104;
            vj.a();
            int discarded$189 = 64;
            i.b();
            j.a();
            int discarded$190 = 1;
            mg.a();
            int discarded$191 = 122;
            lb.a();
            int discarded$192 = 78;
            og.a();
            bb.a(false);
            int discarded$193 = -64;
            tc.e();
            int discarded$194 = 25434;
            hh.a();
            int discarded$195 = 11324;
            df.b();
            vk.a((byte) 112);
            rj.b(true);
            ig.a(-8278);
            int discarded$196 = 32;
            dg.h();
            ui.e((byte) -29);
            g.d((byte) 109);
            ug.c(param0 ^ -72);
            int discarded$197 = 84;
            q.a();
            int discarded$198 = 0;
            oc.a();
            int discarded$199 = -56;
            ch.a();
            od.d((byte) 11);
            cm.a(-118);
            int discarded$200 = 31;
            wk.a();
            int discarded$201 = 0;
            wa.b();
            mc.a(17913);
            dd.b(-26269);
            pe.a(param0 ^ -126);
            int discarded$202 = 125;
            ce.a();
            int discarded$203 = 64;
            nl.a();
            int discarded$204 = 23805;
            rc.d();
            int discarded$205 = 2188;
            mh.a();
            sc.b();
            gh.a((byte) 125);
            int discarded$206 = 116;
            we.b();
            int discarded$207 = 0;
            pl.q();
            int discarded$208 = 122;
            ae.m();
            int discarded$209 = 115;
            wl.k();
            int discarded$210 = 1;
            nc.e();
            ul.a(160);
            rg.d(true);
            int discarded$211 = 25;
            ii.a();
            int discarded$212 = 122;
            cd.d();
            int discarded$213 = -94;
            nd.h();
            lk.d(67);
            int discarded$214 = 101;
            aj.a();
            sj.e((byte) 23);
            fg.g(param0 ^ -128);
            nb.a((byte) 105);
            dh.a();
            sg.a(-29297);
            int discarded$215 = 117;
            pd.b();
            int discarded$216 = -17002;
            sa.c();
            ol.a(true);
            int discarded$217 = 80;
            dl.i();
            of.d((byte) -120);
            int discarded$218 = 89;
            li.a();
            int discarded$219 = -1;
            ai.a();
            int discarded$220 = -117;
            bg.a();
            int discarded$221 = -66;
            gj.d();
            ld.g(param0 + 13566);
            int discarded$222 = 55;
            bc.b();
            int discarded$223 = -17;
            td.b();
            int discarded$224 = 3;
            ga.a();
            int discarded$225 = 0;
            s.a();
            int discarded$226 = 540;
            u.a();
            int discarded$227 = 1;
            b.b();
            int discarded$228 = 512;
            ll.b();
            vg.c(-7392);
            il.d(param0 ^ 5634);
            int discarded$229 = 63;
            kf.a();
            oa.i(-80);
            int discarded$230 = 0;
            hk.a();
            nf.a(65535);
            int discarded$231 = 43;
            uf.a();
            int discarded$232 = -30900;
            fd.g();
            ta.a(true);
            int discarded$233 = -1;
            vc.a();
            int discarded$234 = -82;
            he.a();
            int discarded$235 = -106;
            kl.c();
            int discarded$236 = 54;
            af.a();
            fk.a(param0 ^ -24024);
            int discarded$237 = -8749;
            uc.a();
            int discarded$238 = -102;
            ml.a();
            int discarded$239 = -127;
            bk.a();
            th.a(-116);
            int discarded$240 = 0;
            fa.a();
            int discarded$241 = 0;
            vf.d();
            int discarded$242 = -120;
            bh.a();
            int discarded$243 = 245;
            nh.b();
            int discarded$244 = -27159;
            hf.b();
            int discarded$245 = 6;
            ma.a();
            mk.a((byte) -64);
            le.a(param0 ^ 63);
            uj.b(0);
            int discarded$246 = 0;
            ge.b();
            lc.f(3988);
            int discarded$247 = 21403;
            qb.g();
            ef.a(false);
            kk.e((byte) -61);
            ea.g((byte) 117);
            rd.a((byte) -83);
            int discarded$248 = -121;
            ja.a();
            cg.a(param0 + -26686);
            int discarded$249 = 37;
            ic.d();
            wb.a(param0 ^ 61);
            ((stellarshard) this).field_G = null;
            ((stellarshard) this).field_H = null;
            ((stellarshard) this).field_S = null;
            ((stellarshard) this).field_C = null;
            ((stellarshard) this).field_N = null;
            ((stellarshard) this).field_P = null;
            ((stellarshard) this).field_F = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "stellarshard.IA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
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
        int stackIn_182_0 = 0;
        int stackOut_181_0 = 0;
        L0: {
          var11 = field_B;
          int discarded$23 = -70;
          cl.a();
          if (!param0) {
            break L0;
          } else {
            sg.a(116, ke.field_b);
            break L0;
          }
        }
        if (mf.field_b == null) {
          if (bh.field_a != null) {
            if (null == cm.field_d[0]) {
              rd.a((byte) -127, 75.0f, ea.field_k);
              ((stellarshard) this).d(-20880);
              pb discarded$24 = qd.a(bh.field_a, "space", "", (byte) 42);
              pb discarded$25 = qd.a(bh.field_a, "nebula", "", (byte) 73);
              wh.field_e = ml.a("", (byte) 83, bh.field_a, "achievements_lrg");
              pg.field_hb = ml.a("", (byte) -88, bh.field_a, "explosion");
              hk.field_l = ml.a("", (byte) 107, bh.field_a, "titlepics");
              uf.field_g = qd.a(fc.field_a, "unachieved", "basic", (byte) 106);
              ce.field_a = qd.a(fc.field_a, "locked", "basic", (byte) 60);
              af.field_n = qd.a(fc.field_a, "orbcoin", "basic", (byte) 111);
              var4 = new pb[16];
              var4 = ml.a("", (byte) 85, bh.field_a, "powerups");
              var5 = 0;
              L1: while (true) {
                if (16 <= var5) {
                  var5 = 0;
                  L2: while (true) {
                    if (64 <= var5) {
                      pd.field_h.a((byte) -107);
                      cg.field_c = 0;
                      int discarded$26 = -33;
                      rg.g();
                      return;
                    } else {
                      cm.field_d[var5] = new pb(96, 96);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  var3 = (Object) (Object) new pb(96, 96);
                  ((pb) var3).e();
                  var4[var5].b(48, 48, 0, 4096);
                  e.field_g[var5] = (pb) var3;
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (cg.field_c < 16) {
                L3: {
                  rd.a((byte) -47, (float)(80 + cg.field_c), ea.field_k);
                  ((stellarshard) this).d(-20880);
                  var3 = null;
                  var4_int = 0;
                  if (0 != cg.field_c) {
                    break L3;
                  } else {
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_craters_2");
                    var4_int = 0;
                    break L3;
                  }
                }
                L4: {
                  var5 = 1500;
                  if (1 == cg.field_c) {
                    var4_int = 1;
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_craters_3");
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (2 == cg.field_c) {
                    var4_int = 0;
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_iron_2");
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (3 == cg.field_c) {
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_iron_3");
                    var4_int = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (cg.field_c == 4) {
                    var4_int = 0;
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_ice_2");
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (5 != cg.field_c) {
                    break L8;
                  } else {
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_ice_3");
                    var4_int = 1;
                    break L8;
                  }
                }
                L9: {
                  if (cg.field_c != 6) {
                    break L9;
                  } else {
                    var4_int = 1;
                    var5 = 2000;
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "shooter_hub");
                    break L9;
                  }
                }
                L10: {
                  if (cg.field_c != 7) {
                    break L10;
                  } else {
                    var5 = 2000;
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "homer_hub");
                    var4_int = 1;
                    break L10;
                  }
                }
                L11: {
                  if (cg.field_c != 8) {
                    break L11;
                  } else {
                    var5 = 2500;
                    var4_int = 2;
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_craters_1");
                    break L11;
                  }
                }
                L12: {
                  if (cg.field_c != 9) {
                    break L12;
                  } else {
                    var4_int = 2;
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_iron_1");
                    var5 = 2500;
                    break L12;
                  }
                }
                L13: {
                  if (cg.field_c != 10) {
                    break L13;
                  } else {
                    var5 = 2500;
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_ice_1");
                    var4_int = 2;
                    break L13;
                  }
                }
                L14: {
                  if (cg.field_c == 11) {
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "player");
                    var4_int = 3;
                    rh.field_b = (pa) var3;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (12 == cg.field_c) {
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "shooter");
                    var4_int = 4;
                    var5 = 2000;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (13 != cg.field_c) {
                    break L16;
                  } else {
                    var5 = 2000;
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "homer");
                    var4_int = 2;
                    break L16;
                  }
                }
                L17: {
                  if (cg.field_c == 14) {
                    var5 = 2500;
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "gravity_well");
                    var4_int = 4;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (cg.field_c == 15) {
                    var5 = 2500;
                    var3 = (Object) (Object) pa.a(jf.field_m, "", "spinner");
                    var4_int = 4;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                var6_int = 0;
                L19: while (true) {
                  if (var6_int >= 128) {
                    L20: {
                      pd.field_h.a((byte) -107);
                      if (cg.field_c != 15) {
                        break L20;
                      } else {
                        jf.field_n = ml.a("", (byte) 87, bh.field_a, "bar");
                        jf.field_m = null;
                        break L20;
                      }
                    }
                    cg.field_c = cg.field_c + 1;
                    int discarded$27 = -33;
                    rg.g();
                    return;
                  } else {
                    L21: {
                      var7_ref = new pa((pa) var3, false, false, false, false);
                      var8_int = (int)(65536.0 * Math.cos(3.141592653589793 * (double)var6_int / 64.0));
                      var9 = (int)(65536.0 * Math.sin((double)var6_int * 3.141592653589793 / 64.0));
                      if (var4_int < 3) {
                        break L21;
                      } else {
                        var7_ref.a(new int[12]);
                        var7_ref.a(new int[12]);
                        break L21;
                      }
                    }
                    L22: {
                      var7_ref.a(new int[12]);
                      if (var4_int >= 3) {
                        break L22;
                      } else {
                        var7_ref.a(new int[12]);
                        var7_ref.a(new int[12]);
                        break L22;
                      }
                    }
                    L23: {
                      var10_ref_bj = var7_ref.a(128, 341, 50, 50, -50);
                      if (1 != var4_int) {
                        break L23;
                      } else {
                        fe.field_d[cg.field_c][var6_int] = new pb(96, 96);
                        fe.field_d[cg.field_c][var6_int].e();
                        ti.f(0, 0, 96, 96, 0);
                        cc.a();
                        var10_ref_bj.a(0, 0, 0, 0, 0, 0, var5, -1L);
                        fe.field_d[cg.field_c][var6_int].d();
                        break L23;
                      }
                    }
                    L24: {
                      if (0 == var4_int) {
                        fe.field_d[cg.field_c][var6_int] = new pb(96, 96);
                        fe.field_d[cg.field_c][var6_int].e();
                        ti.f(0, 0, 96, 96, 0);
                        cc.a();
                        var10_ref_bj.a(0, 0, 0, 0, 0, 0, var5, -1L);
                        fe.field_d[cg.field_c][var6_int].d();
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      L26: {
                        if (var4_int == 2) {
                          break L26;
                        } else {
                          if (var4_int != 4) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      rd.field_a[cg.field_c + -8][var6_int >> 2] = new pb(96, 96);
                      rd.field_a[-8 + cg.field_c][var6_int >> 2].e();
                      ti.f(0, 0, 96, 96, 0);
                      cc.a();
                      var10_ref_bj.a(0, 0, 0, 0, 0, 0, var5, -1L);
                      rd.field_a[-8 + cg.field_c][var6_int >> 2].d();
                      break L25;
                    }
                    L27: {
                      if (var4_int != 3) {
                        break L27;
                      } else {
                        cm.field_d[var6_int >> 1] = new pb(96, 96);
                        cm.field_d[var6_int >> 1].e();
                        ti.f(0, 0, 96, 96, 0);
                        cc.a();
                        var10_ref_bj.a(0, 0, 0, 0, 0, 0, 2500, -1L);
                        cm.field_d[var6_int >> 1].d();
                        break L27;
                      }
                    }
                    var6_int++;
                    continue L19;
                  }
                }
              } else {
                if (null == l.field_f) {
                  rd.a((byte) -53, 98.0f, ua.field_g);
                  ((stellarshard) this).d(-20880);
                  fh.field_k = ml.a("", (byte) 98, bh.field_a, "slider");
                  fg.field_P = ml.a("", (byte) 124, bh.field_a, "frame");
                  fg.field_P[4] = null;
                  wc.field_s = qd.a(bh.field_a, "stel", "", (byte) 107);
                  pl.field_R = qd.a(bh.field_a, "lar", "", (byte) 93);
                  aa.field_b = qd.a(bh.field_a, "central_iceblock", "", (byte) 81);
                  pb[] discarded$28 = ml.a("", (byte) -32, bh.field_a, "menu");
                  rh.field_a = new pb[12];
                  var3 = null;
                  var4_int = 0;
                  L28: while (true) {
                    if (var4_int >= 12) {
                      fa.field_k = new pb[15];
                      var4_int = 0;
                      L29: while (true) {
                        if (var4_int >= 15) {
                          pb discarded$29 = qd.a(bh.field_a, "title", "", (byte) 119);
                          qj.field_a = ae.a("", "b12", bh.field_a, -115, be.field_d);
                          var4_array = new ek[7];
                          var5_ref_int__ = new int[7];
                          var6_int = 0;
                          L30: while (true) {
                            if (var6_int >= 7) {
                              var4_array[0] = el.a("keyboard_up", bh.field_a, (byte) -90, "");
                              var4_array[1] = el.a("keyboard_space", bh.field_a, (byte) -74, "");
                              var4_array[2] = el.a("keyboard_ctrl", bh.field_a, (byte) -123, "");
                              var4_array[3] = el.a("keyboard_esc", bh.field_a, (byte) 127, "");
                              var4_array[4] = el.a("keyboard_left", bh.field_a, (byte) -82, "");
                              var4_array[5] = el.a("keyboard_right", bh.field_a, (byte) -116, "");
                              var4_array[6] = el.a("keyboard_down", bh.field_a, (byte) 126, "");
                              qj.field_a.a((o[]) (Object) var4_array, var5_ref_int__);
                              l.field_f = ae.a("", "b122", bh.field_a, -117, be.field_d);
                              int discarded$30 = -33;
                              rg.g();
                              return;
                            } else {
                              var5_ref_int__[var6_int] = 12;
                              var6_int++;
                              continue L30;
                            }
                          }
                        } else {
                          L31: {
                            if (var4_int == 0) {
                              var3 = (Object) (Object) ml.a("", (byte) 121, bh.field_a, "anim_shine");
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          L32: {
                            if (var4_int == 3) {
                              var3 = (Object) (Object) ml.a("", (byte) 118, bh.field_a, "anim_shine2");
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          L33: {
                            if (6 != var4_int) {
                              break L33;
                            } else {
                              var3 = (Object) (Object) ml.a("", (byte) 110, bh.field_a, "anim_shine3");
                              break L33;
                            }
                          }
                          L34: {
                            if (9 == var4_int) {
                              var3 = (Object) (Object) ml.a("", (byte) 83, bh.field_a, "anim_shine4");
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          L35: {
                            if (var4_int == 12) {
                              var3 = (Object) (Object) ml.a("", (byte) -25, bh.field_a, "anim_shine5");
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                          fa.field_k[var4_int] = (pb) ((Object[]) var3)[0];
                          fa.field_k[1 + var4_int] = (pb) ((Object[]) var3)[1];
                          fa.field_k[2 + var4_int] = (pb) ((Object[]) var3)[2];
                          fa.field_k[var4_int].d();
                          fa.field_k[1 + var4_int].d();
                          fa.field_k[2 + var4_int].d();
                          var4_int += 3;
                          continue L29;
                        }
                      }
                    } else {
                      L36: {
                        if (var4_int != 0) {
                          break L36;
                        } else {
                          var3 = (Object) (Object) ml.a("", (byte) 94, bh.field_a, "anim_shatter");
                          break L36;
                        }
                      }
                      L37: {
                        if (3 == var4_int) {
                          var3 = (Object) (Object) ml.a("", (byte) 103, bh.field_a, "anim_shatter2");
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                      L38: {
                        if (var4_int != 6) {
                          break L38;
                        } else {
                          var3 = (Object) (Object) ml.a("", (byte) -72, bh.field_a, "anim_shatter3");
                          break L38;
                        }
                      }
                      L39: {
                        if (var4_int != 9) {
                          break L39;
                        } else {
                          var3 = (Object) (Object) ml.a("", (byte) 119, bh.field_a, "anim_shatter4");
                          break L39;
                        }
                      }
                      rh.field_a[var4_int] = (pb) ((Object[]) var3)[0];
                      rh.field_a[var4_int + 1] = (pb) ((Object[]) var3)[1];
                      rh.field_a[2 + var4_int] = (pb) ((Object[]) var3)[2];
                      rh.field_a[var4_int].d();
                      rh.field_a[1 + var4_int].d();
                      rh.field_a[2 + var4_int].d();
                      var4_int += 3;
                      continue L28;
                    }
                  }
                } else {
                  rd.a((byte) -65, 99.0f, ua.field_g);
                  ((stellarshard) this).d(-20880);
                  var3 = (Object) (Object) ml.a("", (byte) 80, bh.field_a, "screenshots");
                  sd.a(qd.a(bh.field_a, "mbfg", "", (byte) 104), (byte) 60, "Stellar Shard");
                  ga.a(-8039, qd.a(bh.field_a, "smalllogo", "", (byte) 124));
                  int discarded$31 = 0;
                  int discarded$32 = 97;
                  int discarded$33 = 134;
                  int discarded$34 = 40;
                  te.a(8, 129, 1500, 0, qd.a(bh.field_a, "mbpb", "", (byte) 124));
                  q.a(118, (pb[]) var3);
                  ie.field_u = null;
                  int discarded$35 = 16777215;
                  int discarded$36 = -1;
                  fb.a(192, sg.field_c, 0, (java.applet.Applet) this);
                  var4_ref = new pb(128, 128);
                  mf.field_a = new pb[64];
                  var5 = 0;
                  L40: while (true) {
                    if (var5 >= 4) {
                      be.field_d = null;
                      bh.field_a = null;
                      int discarded$37 = -33;
                      rg.g();
                      return;
                    } else {
                      L41: {
                        var6 = null;
                        if (var5 != 0) {
                          break L41;
                        } else {
                          var6 = (Object) (Object) "stars2";
                          break L41;
                        }
                      }
                      L42: {
                        if (var5 != 1) {
                          break L42;
                        } else {
                          var6 = (Object) (Object) "stars3";
                          break L42;
                        }
                      }
                      L43: {
                        if (var5 == 2) {
                          var6 = (Object) (Object) "stars0";
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                      L44: {
                        if (3 != var5) {
                          break L44;
                        } else {
                          var6 = (Object) (Object) "stars1";
                          break L44;
                        }
                      }
                      int discarded$38 = 1;
                      int discarded$39 = -42;
                      var7 = n.a(qd.a(bh.field_a, (String) var6, "", (byte) 42));
                      var7.e();
                      ti.d(1, 1, 0, 0, 496, 496);
                      var8 = ti.field_a;
                      var9 = 0;
                      L45: while (true) {
                        if (var8.length <= var9) {
                          var9 = 0;
                          L46: while (true) {
                            if (var9 >= 4) {
                              pd.field_h.a((byte) -107);
                              var5++;
                              continue L40;
                            } else {
                              stackOut_181_0 = 0;
                              stackIn_182_0 = stackOut_181_0;
                              var10 = stackIn_182_0;
                              L47: while (true) {
                                if (var10 >= 4) {
                                  var9++;
                                  continue L46;
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
                                  continue L47;
                                }
                              }
                            }
                          }
                        } else {
                          L48: {
                            if (var8[var9] == 0) {
                              var8[var9] = 1;
                              break L48;
                            } else {
                              break L48;
                            }
                          }
                          var9++;
                          continue L45;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            L49: {
              rd.a((byte) -60, 100.0f, ve.field_b);
              ((stellarshard) this).d(-20880);
              kl.field_k = 16777215;
              ul.field_G = 10742263;
              if (param1 < -60) {
                break L49;
              } else {
                int discarded$40 = ((stellarshard) this).a(70, -17);
                break L49;
              }
            }
            L50: {
              vf.field_L = fe.field_c;
              lg.field_b = 5883647;
              aj.a(50, 11236);
              int discarded$41 = 63;
              int discarded$42 = 50;
              ef.a();
              fe.field_c = new d(oe.field_a);
              if (vf.field_L != null) {
                nj.field_o.b((p) (Object) vf.field_L);
                vf.field_L.c();
                nj.field_o.a((p) (Object) vf.field_L);
                break L50;
              } else {
                break L50;
              }
            }
            L51: {
              vf.field_L = fe.field_c;
              nj.field_o.a((p) (Object) vf.field_L);
              vf.field_L.d(ai.field_c / 2);
              if (ah.a(-1)) {
                break L51;
              } else {
                be.field_g = ab.a(-5094, 4);
                wh.a(-124);
                break L51;
              }
            }
            hf.field_f = true;
            int discarded$43 = -33;
            rg.g();
            return;
          }
        } else {
          L52: {
            if (!wk.field_a.a((byte) -36)) {
              break L52;
            } else {
              if (!wk.field_a.c((byte) -111)) {
                break L52;
              } else {
                L53: {
                  if (!mf.field_b.a((byte) -36)) {
                    break L53;
                  } else {
                    if (mf.field_b.c((byte) -111)) {
                      L54: {
                        if (!ka.field_n.a((byte) -36)) {
                          break L54;
                        } else {
                          if (ka.field_n.c((byte) -111)) {
                            L55: {
                              if (!bh.field_a.a((byte) -36)) {
                                break L55;
                              } else {
                                if (!bh.field_a.c((byte) -111)) {
                                  break L55;
                                } else {
                                  L56: {
                                    if (!fc.field_a.a((byte) -36)) {
                                      break L56;
                                    } else {
                                      if (!fc.field_a.a("basic", (byte) -109)) {
                                        break L56;
                                      } else {
                                        L57: {
                                          if (!be.field_d.a((byte) -36)) {
                                            break L57;
                                          } else {
                                            if (be.field_d.c((byte) -111)) {
                                              L58: {
                                                if (!jf.field_m.a((byte) -36)) {
                                                  break L58;
                                                } else {
                                                  if (jf.field_m.c((byte) -111)) {
                                                    rd.a((byte) -72, 70.0f, ve.field_b);
                                                    if (param0) {
                                                      L59: {
                                                        int discarded$44 = 109;
                                                        hi.b();
                                                        ((stellarshard) this).d(-20880);
                                                        var3 = (Object) (Object) new qh(22050, ba.field_m);
                                                        if (pk.a(-12663, 0)) {
                                                          sb.field_e = new ud[61];
                                                          break L59;
                                                        } else {
                                                          sb.field_e = new ud[41];
                                                          break L59;
                                                        }
                                                      }
                                                      L60: {
                                                        sb.field_e[0] = kj.a(wk.field_a, "", "afterburner").a().a((qh) var3);
                                                        sb.field_e[1] = kj.a(wk.field_a, "", "bounce-gun").a().a((qh) var3);
                                                        sb.field_e[2] = kj.a(wk.field_a, "", "collision_asteroid").a().a((qh) var3);
                                                        sb.field_e[3] = kj.a(wk.field_a, "", "collision_ice").a().a((qh) var3);
                                                        sb.field_e[4] = kj.a(wk.field_a, "", "collision_iron").a().a((qh) var3);
                                                        sb.field_e[5] = kj.a(wk.field_a, "", "combined-homer_loop_1000ms").a().a((qh) var3);
                                                        sb.field_e[6] = kj.a(wk.field_a, "", "combined-shooter_loop_1000ms").a().a((qh) var3);
                                                        sb.field_e[7] = kj.a(wk.field_a, "", "dual-laser_loop_100ms").a().a((qh) var3);
                                                        sb.field_e[8] = kj.a(wk.field_a, "", "enemy_shoot").a().a((qh) var3);
                                                        sb.field_e[9] = kj.a(wk.field_a, "", "explosion_asteroid_large").a().a((qh) var3);
                                                        sb.field_e[10] = kj.a(wk.field_a, "", "explosion_asteroid_medium").a().a((qh) var3);
                                                        sb.field_e[11] = kj.a(wk.field_a, "", "explosion_asteroid_small").a().a((qh) var3);
                                                        sb.field_e[12] = kj.a(wk.field_a, "", "explosion_enemy").a().a((qh) var3);
                                                        sb.field_e[13] = kj.a(wk.field_a, "", "explosion_ice_large").a().a((qh) var3);
                                                        sb.field_e[14] = kj.a(wk.field_a, "", "explosion_ice_medium").a().a((qh) var3);
                                                        sb.field_e[15] = kj.a(wk.field_a, "", "explosion_ice_small").a().a((qh) var3);
                                                        sb.field_e[16] = kj.a(wk.field_a, "", "explosion_iron_large").a().a((qh) var3);
                                                        sb.field_e[17] = kj.a(wk.field_a, "", "explosion_iron_medium").a().a((qh) var3);
                                                        sb.field_e[18] = kj.a(wk.field_a, "", "explosion_iron_small").a().a((qh) var3);
                                                        sb.field_e[19] = kj.a(wk.field_a, "", "explosion_player").a().a((qh) var3);
                                                        sb.field_e[20] = kj.a(wk.field_a, "", "flame-cannon_loop_300-500ms").a().a((qh) var3);
                                                        sb.field_e[21] = kj.a(wk.field_a, "", "heavy-cannon").a().a((qh) var3);
                                                        sb.field_e[22] = kj.a(wk.field_a, "", "hex-cannon_70ms_loop").a().a((qh) var3);
                                                        sb.field_e[23] = kj.a(wk.field_a, "", "homing_loop_200ms").a().a((qh) var3);
                                                        sb.field_e[24] = kj.a(wk.field_a, "", "laser_70ms_loop").a().a((qh) var3);
                                                        sb.field_e[25] = kj.a(wk.field_a, "", "mega-laser_loop_500ms").a().a((qh) var3);
                                                        sb.field_e[26] = kj.a(wk.field_a, "", "mine_loop_200ms").a().a((qh) var3);
                                                        sb.field_e[27] = kj.a(wk.field_a, "", "narrowgun").a().a((qh) var3);
                                                        sb.field_e[28] = kj.a(wk.field_a, "", "nuke_explosion").a().a((qh) var3);
                                                        sb.field_e[29] = kj.a(wk.field_a, "", "powerup_invulnerability").a().a((qh) var3);
                                                        sb.field_e[30] = kj.a(wk.field_a, "", "powerup_phase_shield").a().a((qh) var3);
                                                        sb.field_e[31] = kj.a(wk.field_a, "", "powerup_shield").a().a((qh) var3);
                                                        sb.field_e[32] = kj.a(wk.field_a, "", "powerup_weapon").a().a((qh) var3);
                                                        sb.field_e[33] = kj.a(wk.field_a, "", "quad-cannon").a().a((qh) var3);
                                                        sb.field_e[34] = kj.a(wk.field_a, "", "super-cannon").a().a((qh) var3);
                                                        sb.field_e[35] = kj.a(wk.field_a, "", "thruster").a().a((qh) var3);
                                                        sb.field_e[36] = kj.a(wk.field_a, "", "title_explosion").a().a((qh) var3);
                                                        sb.field_e[37] = kj.a(wk.field_a, "", "title_shinesound").a().a((qh) var3);
                                                        sb.field_e[38] = kj.a(wk.field_a, "", "trigun").a().a((qh) var3);
                                                        sb.field_e[39] = kj.a(wk.field_a, "", "wavegun").a().a((qh) var3);
                                                        sb.field_e[40] = kj.a(wk.field_a, "", "hit").a().a((qh) var3);
                                                        if (pk.a(-12663, 0)) {
                                                          sb.field_e[41] = kj.a(wk.field_a, "", "collect_ghost").a().a((qh) var3);
                                                          sb.field_e[42] = kj.a(wk.field_a, "", "eerie_creak1").a().a((qh) var3);
                                                          sb.field_e[43] = kj.a(wk.field_a, "", "eerie_creak2").a().a((qh) var3);
                                                          sb.field_e[44] = kj.a(wk.field_a, "", "eerie_creak3").a().a((qh) var3);
                                                          sb.field_e[45] = kj.a(wk.field_a, "", "eerie_creak4").a().a((qh) var3);
                                                          sb.field_e[46] = ad.a(mf.field_b, "", "heartbeat").b().a((qh) var3);
                                                          sb.field_e[47] = kj.a(wk.field_a, "", "howling1").a().a((qh) var3);
                                                          sb.field_e[48] = kj.a(wk.field_a, "", "howling2").a().a((qh) var3);
                                                          sb.field_e[49] = kj.a(wk.field_a, "", "howling3").a().a((qh) var3);
                                                          sb.field_e[50] = kj.a(wk.field_a, "", "howling4").a().a((qh) var3);
                                                          sb.field_e[51] = kj.a(wk.field_a, "", "static2").a().a((qh) var3);
                                                          sb.field_e[52] = kj.a(wk.field_a, "", "static3").a().a((qh) var3);
                                                          sb.field_e[53] = kj.a(wk.field_a, "", "static4").a().a((qh) var3);
                                                          sb.field_e[54] = kj.a(wk.field_a, "", "trans1").a().a((qh) var3);
                                                          sb.field_e[55] = kj.a(wk.field_a, "", "trans2").a().a((qh) var3);
                                                          sb.field_e[56] = kj.a(wk.field_a, "", "trans3").a().a((qh) var3);
                                                          sb.field_e[57] = ad.a(mf.field_b, "", "cyber_laugh1").b().a((qh) var3);
                                                          sb.field_e[58] = ad.a(mf.field_b, "", "cyber_laugh2").b().a((qh) var3);
                                                          sb.field_e[59] = ad.a(mf.field_b, "", "cyber_laugh4").b().a((qh) var3);
                                                          sb.field_e[60] = ad.a(mf.field_b, "", "cyber_laugh5_rev").b().a((qh) var3);
                                                          break L60;
                                                        } else {
                                                          break L60;
                                                        }
                                                      }
                                                      L61: {
                                                        var4_ref2 = new gk(wk.field_a, mf.field_b);
                                                        wk.field_a = null;
                                                        mf.field_b = null;
                                                        if (!pk.a(-12663, 0)) {
                                                          oe.field_a = ij.a(576, var4_ref2, "music/Stellar_Shard_ingame", ka.field_n, "");
                                                          break L61;
                                                        } else {
                                                          oe.field_a = ij.a(576, var4_ref2, "music/Stellar_Shard_Halloween", ka.field_n, "");
                                                          break L61;
                                                        }
                                                      }
                                                      ka.field_n = null;
                                                      int discarded$45 = -33;
                                                      rg.g();
                                                      return;
                                                    } else {
                                                      return;
                                                    }
                                                  } else {
                                                    break L58;
                                                  }
                                                }
                                              }
                                              rd.a((byte) -115, 60.0f, ak.a("", he.field_o, jf.field_m, (byte) 51, lj.field_B));
                                              return;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                        rd.a((byte) -105, 50.0f, ak.a("", mb.field_c, be.field_d, (byte) 51, le.field_l));
                                        return;
                                      }
                                    }
                                  }
                                  rd.a((byte) -96, 40.0f, ak.a("basic", lg.field_e, fc.field_a, (byte) 51, am.field_e));
                                  return;
                                }
                              }
                            }
                            rd.a((byte) -89, 30.0f, ak.a("", lg.field_e, bh.field_a, (byte) 51, am.field_e));
                            return;
                          } else {
                            break L54;
                          }
                        }
                      }
                      rd.a((byte) -63, 20.0f, ak.a("", qh.field_f, ka.field_n, (byte) 51, qd.field_e));
                      return;
                    } else {
                      break L53;
                    }
                  }
                }
                rd.a((byte) -90, 10.0f, ak.a("", qh.field_f, mf.field_b, (byte) 51, qd.field_e));
                return;
              }
            }
          }
          rd.a((byte) -71, 8.0f, ak.a("", ma.field_o, wk.field_a, (byte) 51, hc.field_k));
          return;
        }
    }

    private final void n() {
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
                int fieldTemp$12 = vh.field_e;
                vh.field_e = vh.field_e + 1;
                if (fieldTemp$12 != 5) {
                  break L2;
                } else {
                  int discarded$13 = 1;
                  hj.a(255, 0);
                  break L2;
                }
              }
            }
            L3: {
              if (e.field_e != 8) {
                break L3;
              } else {
                int fieldTemp$14 = sf.field_b;
                sf.field_b = sf.field_b + 1;
                if (fieldTemp$14 != 5) {
                  break L3;
                } else {
                  int discarded$15 = 1;
                  hj.a(253, 2);
                  break L3;
                }
              }
            }
            L4: {
              if (e.field_e == 9) {
                int fieldTemp$16 = sj.field_K;
                sj.field_K = sj.field_K + 1;
                if (fieldTemp$16 == 5) {
                  int discarded$17 = 1;
                  hj.a(252, 3);
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
                int fieldTemp$18 = ua.field_d;
                ua.field_d = ua.field_d + 1;
                if (fieldTemp$18 == 5) {
                  int discarded$19 = 1;
                  hj.a(251, 4);
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
              if (~qi.field_a < ~(-1 + mg.field_t)) {
                L8: {
                  var2_int = of.field_A;
                  of.field_A = Math.max(qi.field_a, of.field_A);
                  if (of.field_A > 50) {
                    of.field_A = 50;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var3_ref_fk = new fk(0, -1 + qi.field_a, 0, 0, 0, 0);
                if (ah.a(-1)) {
                  tf.field_a.b(-113, (gg) (Object) var3_ref_fk);
                  of.field_A = var2_int;
                  break L7;
                } else {
                  int discarded$20 = 5;
                  hf.a(var3_ref_fk, 89);
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
                if (nc.field_A > 0) {
                  break L9;
                } else {
                  if (mk.field_k > 0) {
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
              if (null == ((stellarshard) this).field_F) {
                ((stellarshard) this).field_F = new pb(640, 480);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (qi.field_a <= 50) {
                break L11;
              } else {
                qi.field_a = 50;
                if (nc.field_A <= 0) {
                  nc.field_A = 1500;
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            L12: {
              if (qi.field_a != 1) {
                break L12;
              } else {
                ((stellarshard) this).field_J = 100;
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
                  int discarded$21 = 1;
                  hj.a(249, 6);
                  break L13;
                }
              }
            }
            L14: {
              if (qi.field_a != 20) {
                break L14;
              } else {
                if (nf.field_r) {
                  int discarded$22 = 1;
                  hj.a(248, 7);
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            L15: {
              if (qi.field_a != 10) {
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (30 != qi.field_a) {
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (qi.field_a != 50) {
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var2_array = new int[16];
              if (qi.field_a != 1) {
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
              if (qi.field_a != 3) {
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
              if (qi.field_a == 5) {
                var2_array[12] = 2;
                var2_array[3] = 8;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (qi.field_a == 8) {
                var2_array[5] = 8;
                var2_array[7] = 1;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (qi.field_a != 7) {
                break L25;
              } else {
                var2_array[15] = 2;
                var2_array[1] = 10;
                break L25;
              }
            }
            L26: {
              if (qi.field_a != 9) {
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
                  if (qi.field_a % 10 == 2) {
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
                  if (qi.field_a % 10 == 7) {
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
                  if (qi.field_a == 20) {
                    var2_array[14] = 1;
                    var2_array[7] = 10;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if (qi.field_a != 30) {
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
                if (qi.field_a % 10 != 0) {
                  break L28;
                } else {
                  if (qi.field_a <= 50) {
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
              if (var3 >= 16) {
                break L0;
              } else {
                var4 = 0;
                L43: while (true) {
                  if (~var4 <= ~var2_array[var3]) {
                    var3++;
                    continue L42;
                  } else {
                    int discarded$23 = 63;
                    a.field_h[pl.e()] = new qe(var3);
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
          throw ma.a((Throwable) (Object) var2, "stellarshard.FB(" + 3 + ')');
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
                ((stellarshard) this).field_H = null;
                break L1;
              }
            }
            L2: {
              if (mk.field_k <= 0) {
                break L2;
              } else {
                if (!lh.a(ic.field_d, (byte) 115)) {
                  break L2;
                } else {
                  int discarded$4 = 0;
                  int discarded$5 = 640;
                  s.field_e = wb.a(0, -107, 480, ic.field_d);
                  if (null != s.field_e) {
                    nc.a((java.awt.Canvas) (Object) s.field_e, (byte) 121);
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
            vf.a(stackIn_25_0, stackIn_25_1, stackIn_25_2, stackIn_25_3, (pb[]) null, 320, (bd) (Object) qj.field_a, 8, (pb[]) null, 8, 8 + qj.field_a.field_N, l.field_f.field_N, 260, true, 240, (bd) (Object) l.field_f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "stellarshard.WA(" + param0 + ')');
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
          throw ma.a((Throwable) (Object) var4, "stellarshard.JB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final void d(int param0) {
        Object var2 = null;
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
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_82_0 = null;
        int stackIn_91_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_359_0 = 0;
        Object stackIn_363_0 = null;
        va stackOut_2_0 = null;
        java.awt.Canvas stackOut_1_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        boolean stackOut_6_2 = false;
        int stackOut_358_0 = 0;
        boolean stackOut_357_0 = false;
        java.awt.Canvas stackOut_362_0 = null;
        va stackOut_361_0 = null;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_92_0 = 0;
        Object stackOut_81_0 = null;
        Object stackOut_58_0 = null;
        L0: {
          var20 = field_B;
          if (s.field_e != null) {
            stackOut_2_0 = s.field_e;
            stackIn_3_0 = (Object) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = qd.field_j;
            stackIn_3_0 = (Object) (Object) stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (ee.b(93)) {
          L1: {
            stackOut_5_0 = var2;
            stackOut_5_1 = -11;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (s.field_e != null) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = ua.field_b;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2 ? 1 : 0;
              break L1;
            }
          }
          rl.a((java.awt.Canvas) (Object) stackIn_8_0, stackIn_8_1, stackIn_8_2 != 0);
          return;
        } else {
          if (hf.field_f) {
            if (null == be.field_g) {
              if (null == gg.field_f) {
                L2: {
                  if (null != ((stellarshard) this).field_F) {
                    var3 = 0;
                    var4 = -((stellarshard) this).field_F.field_z.length;
                    L3: while (true) {
                      if (var4 >= 0) {
                        break L2;
                      } else {
                        int incrementValue$9 = var3;
                        var3++;
                        ((stellarshard) this).field_F.field_z[incrementValue$9] = pd.field_h.field_e[incrementValue$9];
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (null != na.field_j) {
                    break L4;
                  } else {
                    if (s.field_i) {
                      break L4;
                    } else {
                      L5: {
                        if (wh.field_c > 1) {
                          break L5;
                        } else {
                          if (ni.field_a) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        na.field_j = new ij((stellarshard) this);
                        if (!ni.field_a) {
                          tl.field_c = 4;
                          na.field_j.field_l = 8;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ni.field_a = false;
                      break L4;
                    }
                  }
                }
                L7: {
                  if (0 > fb.field_b) {
                    fb.field_b = fb.field_b + 640;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (0 > tk.field_b) {
                    tk.field_b = tk.field_b + 480;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (fb.field_b >= 640) {
                    fb.field_b = fb.field_b - 640;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (tk.field_b < 480) {
                    break L10;
                  } else {
                    tk.field_b = tk.field_b - 480;
                    break L10;
                  }
                }
                L11: {
                  this.p(param0 ^ -20914);
                  if (null == ((stellarshard) this).field_F) {
                    break L11;
                  } else {
                    if (el.field_I <= 0) {
                      break L11;
                    } else {
                      if (na.field_j == null) {
                        ((stellarshard) this).field_F.e(0, 0, 5 * el.field_I);
                        if (s.field_i) {
                          break L11;
                        } else {
                          el.field_I = el.field_I - 1;
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                L12: {
                  var3 = 0;
                  if (param0 == -20880) {
                    break L12;
                  } else {
                    String discarded$10 = stellarshard.a(true, false, -57, true);
                    break L12;
                  }
                }
                var4 = 0;
                L13: while (true) {
                  if (var4 >= 12) {
                    var3 = 0;
                    L14: while (true) {
                      if (var3 >= 1000) {
                        L15: {
                          if (((stellarshard) this).field_G == null) {
                            ((stellarshard) this).field_G = new pb(640, 480);
                            break L15;
                          } else {
                            ((stellarshard) this).field_G.e();
                            ti.f(0, 0, 640, 480, 0);
                            pd.field_h.a((byte) -107);
                            break L15;
                          }
                        }
                        var3 = 0;
                        L16: while (true) {
                          if (var3 >= 3000) {
                            var3 = 0;
                            L17: while (true) {
                              if (1000 <= var3) {
                                var3 = 0;
                                var3 = var3 + ((stellarshard) this).field_G.field_t;
                                var5_int = 0;
                                L18: while (true) {
                                  if (((stellarshard) this).field_G.field_y <= var5_int) {
                                    ((stellarshard) this).field_G.d(0, 0, 255);
                                    var5_int = 0;
                                    L19: while (true) {
                                      if (1000 <= var5_int) {
                                        var5_int = 4;
                                        var6_int = 1;
                                        L20: while (true) {
                                          if (var6_int >= 12) {
                                            L21: {
                                              if (!pk.a(param0 ^ 24825, 0)) {
                                                break L21;
                                              } else {
                                                if (s.field_i) {
                                                  L22: {
                                                    if (ag.field_a <= 0) {
                                                      break L22;
                                                    } else {
                                                      if (128 <= ag.field_a) {
                                                        break L22;
                                                      } else {
                                                        ti.e(10, 330, 4, 16711680);
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  L23: {
                                                    if (ag.field_a <= 0) {
                                                      break L23;
                                                    } else {
                                                      if (ag.field_a < 128) {
                                                        qj.field_a.a(nd.field_F, 20, 335, 16711680, -1);
                                                        break L23;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  var5_int = gf.field_c;
                                                  var6_int = 100;
                                                  if (ml.field_h <= 0) {
                                                    break L21;
                                                  } else {
                                                    if (~var6_int <= ~var5_int) {
                                                      L24: {
                                                        var7 = 32;
                                                        var8 = var7 >> 1;
                                                        if (16 > var5_int) {
                                                          var7 = var5_int * 4;
                                                          break L24;
                                                        } else {
                                                          if (~(-64 + var6_int) > ~var5_int) {
                                                            var7 = -var5_int + var6_int;
                                                            break L24;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                      }
                                                      var9 = (int)((Math.exp((double)((float)(-var5_int) / 20.0f)) - Math.exp((double)((float)(-var6_int) / 20.0f))) * 200.0);
                                                      ja.a(320, 2 * var5_int, var8, 240, false, var9, 256, 1);
                                                      break L21;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                            L25: {
                                              if (s.field_i) {
                                                var5_int = 148;
                                                ti.b(1, 351, var5_int, 128, 65280, 64);
                                                ti.d(2, 352, var5_int + -1, 478);
                                                var6_int = 0;
                                                L26: while (true) {
                                                  if (1000 <= var6_int) {
                                                    L27: {
                                                      ti.b();
                                                      var6 = wb.field_i;
                                                      if (hf.field_i.a(0)) {
                                                        break L27;
                                                      } else {
                                                        var6 = te.field_a;
                                                        break L27;
                                                      }
                                                    }
                                                    L28: {
                                                      var7 = qj.field_a.b(var6) + 10;
                                                      ti.e(0, 350, var5_int - -2, 130, 4, 0);
                                                      ti.f(-(var7 / 2) + var5_int / 2 - 3, 341, 6 + var7, 21, 10, 0);
                                                      ti.e(1, 351, var5_int, 128, 3, 8421504);
                                                      ti.e(2, 352, var5_int + -2, 126, 2, 8421504);
                                                      ti.g(3, 351, var5_int + -5, 16777215);
                                                      ti.f(1, 353, 123, 16777215);
                                                      ti.g(4, 478, var5_int - 5, 4210752);
                                                      ti.f(-1 + var5_int + 1, 354, 123, 4210752);
                                                      ti.e(3, 353, -4 + var5_int, 124, 1, 0);
                                                      ti.f(-2 + -(var7 / 2) + var5_int / 2, 342, 4 + var7, 19, 9, 8421504);
                                                      ti.e(-2 + -(var7 / 2) + var5_int / 2, 342, var7 + 4, 19, 9, 16777215);
                                                      ti.d(-(var7 / 2) + var5_int / 2 - 2, 350, 8 + var5_int / 2 + var7 / 2 + -2, 361);
                                                      ti.e(-(var7 / 2) + var5_int / 2 - 2, 342, 4 + var7, 19, 9, 4210752);
                                                      ti.b();
                                                      if (var7 >= 100) {
                                                        break L28;
                                                      } else {
                                                        var8 = 0;
                                                        L29: while (true) {
                                                          if (var8 >= 15) {
                                                            break L28;
                                                          } else {
                                                            L30: {
                                                              var9 = (int)(5.0 + Math.cos(3.14 * (double)var8 / 20.0) * 5.0);
                                                              if (var9 > 9) {
                                                                var9 = 9;
                                                                break L30;
                                                              } else {
                                                                break L30;
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
                                                            continue L29;
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
                                                    break L25;
                                                  } else {
                                                    L31: {
                                                      if (a.field_h[var6_int] != null) {
                                                        a.field_h[var6_int].a(false);
                                                        break L31;
                                                      } else {
                                                        break L31;
                                                      }
                                                    }
                                                    var6_int++;
                                                    continue L26;
                                                  }
                                                }
                                              } else {
                                                break L25;
                                              }
                                            }
                                            L32: {
                                              if (s.field_i) {
                                                break L32;
                                              } else {
                                                L33: {
                                                  if (na.field_j == null) {
                                                    break L33;
                                                  } else {
                                                    if (tl.field_c == 8) {
                                                      break L32;
                                                    } else {
                                                      if (tl.field_c == 1) {
                                                        break L32;
                                                      } else {
                                                        if (tl.field_c == 3) {
                                                          break L32;
                                                        } else {
                                                          if (tl.field_c != 2) {
                                                            break L33;
                                                          } else {
                                                            break L32;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                L34: {
                                                  if (wh.field_c != 0) {
                                                    break L34;
                                                  } else {
                                                    if (rh.field_a != null) {
                                                      break L34;
                                                    } else {
                                                      pl.field_R = null;
                                                      wh.field_c = 2;
                                                      jg.field_pb = 0;
                                                      aa.field_b = null;
                                                      wc.field_s = null;
                                                      break L34;
                                                    }
                                                  }
                                                }
                                                L35: {
                                                  if (0 == wh.field_c) {
                                                    aa.field_b.a(0, 128, 310, (byte) -120, 90);
                                                    wc.field_s.a(0, 128, -jg.field_pb + 310, (byte) -124, 90);
                                                    pl.field_R.a(0, 128, 310 + jg.field_pb, (byte) -119, 90);
                                                    break L35;
                                                  } else {
                                                    break L35;
                                                  }
                                                }
                                                L36: {
                                                  if (wh.field_c != 1) {
                                                    break L36;
                                                  } else {
                                                    rh.field_a[jg.field_pb / 3].a(0, 128, 310, (byte) 82, 90);
                                                    break L36;
                                                  }
                                                }
                                                L37: {
                                                  if (wh.field_c == 2) {
                                                    rh.field_a = null;
                                                    fa.field_k[0].a(0, 128, 310, (byte) -120, 90);
                                                    fa.field_k[jg.field_pb / 2].a(0, 128, 310, (byte) 37, 90);
                                                    break L37;
                                                  } else {
                                                    break L37;
                                                  }
                                                }
                                                if (wh.field_c == 3) {
                                                  fa.field_k[0].a(0, 128, 310, (byte) 54, 90);
                                                  break L32;
                                                } else {
                                                  break L32;
                                                }
                                              }
                                            }
                                            L38: {
                                              if (s.field_i) {
                                                L39: {
                                                  var5 = h.a(hh.field_d, 0, new String[1]);
                                                  var6_int = nj.field_f[0];
                                                  nj.field_f[0] = qi.field_a * 64 / 50;
                                                  if (nj.field_f[0] > 63) {
                                                    nj.field_f[0] = 63;
                                                    break L39;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                                L40: {
                                                  ic.a(var5, 0, -1, false, 480, 16777215, 0);
                                                  nj.field_f[0] = 64 * te.field_c / 250000;
                                                  var5 = ce.field_f + te.field_c;
                                                  if (nj.field_f[0] > 63) {
                                                    nj.field_f[0] = 63;
                                                    break L40;
                                                  } else {
                                                    break L40;
                                                  }
                                                }
                                                L41: {
                                                  ic.a(var5, 0, -1, false, 160, 16777215, 0);
                                                  var5 = bb.field_f;
                                                  var7_ref = null;
                                                  var8 = e.field_e;
                                                  if (0 != e.field_e) {
                                                    break L41;
                                                  } else {
                                                    var7_ref = (Object) (Object) ei.field_A;
                                                    break L41;
                                                  }
                                                }
                                                L42: {
                                                  if (e.field_e == 1) {
                                                    var7_ref = (Object) (Object) gf.field_a;
                                                    break L42;
                                                  } else {
                                                    break L42;
                                                  }
                                                }
                                                L43: {
                                                  if (e.field_e == 2) {
                                                    var7_ref = (Object) (Object) ka.field_l;
                                                    break L43;
                                                  } else {
                                                    break L43;
                                                  }
                                                }
                                                L44: {
                                                  if (3 != e.field_e) {
                                                    break L44;
                                                  } else {
                                                    var7_ref = (Object) (Object) he.field_l;
                                                    break L44;
                                                  }
                                                }
                                                L45: {
                                                  if (4 == e.field_e) {
                                                    var7_ref = (Object) (Object) td.field_e;
                                                    break L45;
                                                  } else {
                                                    break L45;
                                                  }
                                                }
                                                L46: {
                                                  if (e.field_e != 5) {
                                                    break L46;
                                                  } else {
                                                    var7_ref = (Object) (Object) nl.field_f;
                                                    break L46;
                                                  }
                                                }
                                                L47: {
                                                  if (e.field_e != 6) {
                                                    break L47;
                                                  } else {
                                                    var7_ref = (Object) (Object) qh.field_h;
                                                    break L47;
                                                  }
                                                }
                                                L48: {
                                                  if (e.field_e != 7) {
                                                    break L48;
                                                  } else {
                                                    var7_ref = (Object) (Object) we.field_e;
                                                    break L48;
                                                  }
                                                }
                                                L49: {
                                                  if (e.field_e != 8) {
                                                    break L49;
                                                  } else {
                                                    var7_ref = (Object) (Object) nb.field_O;
                                                    var8 += 5;
                                                    break L49;
                                                  }
                                                }
                                                L50: {
                                                  if (e.field_e == 9) {
                                                    var7_ref = (Object) (Object) ja.field_k;
                                                    var8 += 5;
                                                    break L50;
                                                  } else {
                                                    break L50;
                                                  }
                                                }
                                                L51: {
                                                  if (10 == e.field_e) {
                                                    var8 += 5;
                                                    var7_ref = (Object) (Object) rd.field_b;
                                                    break L51;
                                                  } else {
                                                    break L51;
                                                  }
                                                }
                                                L52: {
                                                  if (var7_ref == null) {
                                                    break L52;
                                                  } else {
                                                    var7_ref = (Object) (Object) ((String) var7_ref).toUpperCase();
                                                    var9 = qj.field_a.b((String) var7_ref) - -40;
                                                    var10_int = 307;
                                                    ti.f(-20 + var10_int, 427, 42, 42, 20, 0);
                                                    ti.f(-2 + var10_int + -var9, 435, var9 + 23, 26, 12, 0);
                                                    ti.f(var10_int + -var9, 437, 19 - -var9, 22, 10, 11186350);
                                                    ti.f(var10_int + -18, 429, 38, 38, 18, 11186350);
                                                    ti.a(var10_int - 20 << 4, 7152, 200, 100, eh.field_e);
                                                    ti.a(var10_int - -10 - var9 << 4, 7152, 200, 150, eh.field_e);
                                                    ti.a(-var9 + var10_int + 40 << 4, 7152, 200, 150, eh.field_e);
                                                    ti.a(var10_int + 10 << 4, 7152, 200, 200, eh.field_e);
                                                    ti.f(-var9 - -2 + var10_int, 439, 21 - (-var9 + -96) + -140, 18, 8, 0);
                                                    qj.field_a.b((String) var7_ref, -63 + var10_int - -33, 453, 16777215, -1);
                                                    ti.a(var10_int - 15, 432, 32, 32, 14, 0, 192);
                                                    e.field_g[var8].e(var10_int - 47, 400);
                                                    break L52;
                                                  }
                                                }
                                                L53: {
                                                  var9 = 250;
                                                  var10 = null;
                                                  var11 = -1;
                                                  if (nc.field_H == 1) {
                                                    var10 = (Object) (Object) pe.field_a;
                                                    var11 = 8;
                                                    break L53;
                                                  } else {
                                                    break L53;
                                                  }
                                                }
                                                L54: {
                                                  if (2 == nc.field_H) {
                                                    var10 = (Object) (Object) ha.field_x;
                                                    var11 = 10;
                                                    break L54;
                                                  } else {
                                                    break L54;
                                                  }
                                                }
                                                L55: {
                                                  if (3 != nc.field_H) {
                                                    break L55;
                                                  } else {
                                                    var11 = 11;
                                                    var10 = (Object) (Object) fc.field_c;
                                                    break L55;
                                                  }
                                                }
                                                L56: {
                                                  if (4 != nc.field_H) {
                                                    break L56;
                                                  } else {
                                                    var11 = 12;
                                                    var10 = (Object) (Object) wg.field_e;
                                                    break L56;
                                                  }
                                                }
                                                L57: {
                                                  if (null != var10) {
                                                    L58: {
                                                      var10 = (Object) (Object) ((String) var10).toUpperCase();
                                                      var12 = 40 + qj.field_a.b((String) var10);
                                                      var13 = 100;
                                                      var9 += 250;
                                                      ti.f(var9 - 21, 427, 42, 42, 20, 0);
                                                      ti.f(-2 - var12 + var9, 435, 21 - (-4 + -var12), 26, 12, 0);
                                                      if (0 >= var13) {
                                                        break L58;
                                                      } else {
                                                        ti.f(var9 + -2, 435, 4 + var13 + 21, 26, 12, 0);
                                                        break L58;
                                                      }
                                                    }
                                                    L59: {
                                                      ti.f(var9 - var12, 437, 21 + var12, 22, 10, 11186350);
                                                      if (var13 > 0) {
                                                        ti.f(var9, 437, var13 + 21, 22, 10, 11186350);
                                                        break L59;
                                                      } else {
                                                        break L59;
                                                      }
                                                    }
                                                    L60: {
                                                      ti.f(-1 + (-18 + var9), 429, 38, 38, 18, 11186350);
                                                      ti.a(-20 + var9 << 4, 7152, 200, 100, eh.field_e);
                                                      ti.a(var9 - -10 << 4, 7152, 200, 150, eh.field_e);
                                                      ti.a(40 + (-var12 + var9) << 4, 7152, 200, 150, eh.field_e);
                                                      ti.a(-var12 - (-20 - var9) << 4, 7152, 200, 200, eh.field_e);
                                                      if (0 < var13) {
                                                        ti.a(var13 + var9 << 4, 7152, 200, 200, eh.field_e);
                                                        break L60;
                                                      } else {
                                                        break L60;
                                                      }
                                                    }
                                                    L61: {
                                                      ti.f(var9 - -2 - var12, 439, -119 - -var12 - -96, 18, 8, 0);
                                                      if (var13 <= 0) {
                                                        break L61;
                                                      } else {
                                                        L62: {
                                                          var14 = 0;
                                                          var15 = 0;
                                                          if (2 != nc.field_H) {
                                                            break L62;
                                                          } else {
                                                            L63: {
                                                              if (gh.field_b <= 500) {
                                                                break L63;
                                                              } else {
                                                                gh.field_b = 500;
                                                                break L63;
                                                              }
                                                            }
                                                            var14 = 8421504;
                                                            var15 = gh.field_b * 20 / 500;
                                                            if (gh.field_b < 250) {
                                                              var14 = 327680 * (gh.field_b % 50);
                                                              break L62;
                                                            } else {
                                                              break L62;
                                                            }
                                                          }
                                                        }
                                                        L64: {
                                                          if (nc.field_H == 3) {
                                                            L65: {
                                                              if (gh.field_b <= 1500) {
                                                                break L65;
                                                              } else {
                                                                gh.field_b = 1500;
                                                                break L65;
                                                              }
                                                            }
                                                            var15 = 20 * gh.field_b / 1500;
                                                            var14 = 16777215;
                                                            if (gh.field_b >= 250) {
                                                              break L64;
                                                            } else {
                                                              var14 = gh.field_b % 50 * 327680;
                                                              break L64;
                                                            }
                                                          } else {
                                                            break L64;
                                                          }
                                                        }
                                                        L66: {
                                                          if (nc.field_H == 4) {
                                                            L67: {
                                                              if (500 >= gh.field_b) {
                                                                break L67;
                                                              } else {
                                                                gh.field_b = 500;
                                                                break L67;
                                                              }
                                                            }
                                                            var14 = 16776960;
                                                            var15 = gh.field_b * 20 / 500;
                                                            if (gh.field_b >= 250) {
                                                              break L66;
                                                            } else {
                                                              var14 = gh.field_b % 50 * 327680;
                                                              break L66;
                                                            }
                                                          } else {
                                                            break L66;
                                                          }
                                                        }
                                                        L68: {
                                                          if (nc.field_H != 1) {
                                                            break L68;
                                                          } else {
                                                            L69: {
                                                              if (gh.field_b == 5) {
                                                                var14 = 16777215;
                                                                break L69;
                                                              } else {
                                                                break L69;
                                                              }
                                                            }
                                                            L70: {
                                                              var15 = gh.field_b * 4;
                                                              if (gh.field_b != 4) {
                                                                break L70;
                                                              } else {
                                                                var14 = 8454143;
                                                                break L70;
                                                              }
                                                            }
                                                            L71: {
                                                              if (gh.field_b != 3) {
                                                                break L71;
                                                              } else {
                                                                var14 = 8421631;
                                                                break L71;
                                                              }
                                                            }
                                                            L72: {
                                                              if (gh.field_b == 2) {
                                                                var14 = 16744703;
                                                                break L72;
                                                              } else {
                                                                break L72;
                                                              }
                                                            }
                                                            if (gh.field_b == 1) {
                                                              var14 = 16744576;
                                                              break L68;
                                                            } else {
                                                              break L68;
                                                            }
                                                          }
                                                        }
                                                        L73: {
                                                          var16 = 20 + (2 + var9);
                                                          var17 = 439;
                                                          ti.f(var16, var17, -3 + var13, 18, 8, (var14 & 16711422) >> 1);
                                                          if (3 != nc.field_H) {
                                                            ti.e(var16, var17, var13 + -3, 18, 8, 4144959 & var14 >> 2);
                                                            break L73;
                                                          } else {
                                                            ti.e(var16, var17, -3 + var13, 18, 8, var14);
                                                            break L73;
                                                          }
                                                        }
                                                        var16 = var16 << 4;
                                                        var17 = var17 << 4;
                                                        var19 = 0;
                                                        L74: while (true) {
                                                          if (var19 >= var15) {
                                                            var19 += 2;
                                                            L75: while (true) {
                                                              if (var19 >= 20) {
                                                                break L61;
                                                              } else {
                                                                L76: {
                                                                  var18 = (var19 + ki.field_s) % 10;
                                                                  if (var18 <= 5) {
                                                                    var18 = 10 - var18;
                                                                    break L76;
                                                                  } else {
                                                                    break L76;
                                                                  }
                                                                }
                                                                ti.c((var18 + var19 * 10) * (var13 + -35) / 10 + var16 - -136 >> 4, 136 + var17 >> 4, 9, 0, 32);
                                                                ti.c((var13 + -35) * (var18 + var19 * 10) / 10 + (var16 + 136) >> 4, var17 + 136 >> 4, 7, 0, 32);
                                                                ti.c(136 + var16 - -((var13 + -35) * (var18 + var19 * 10) / 10) >> 4, var17 - -136 >> 4, 5, 0, 32);
                                                                var19++;
                                                                continue L75;
                                                              }
                                                            }
                                                          } else {
                                                            L77: {
                                                              var18 = (ki.field_s + var19) % 10;
                                                              if (var18 > 5) {
                                                                var18 = 10 + -var18;
                                                                break L77;
                                                              } else {
                                                                break L77;
                                                              }
                                                            }
                                                            L78: {
                                                              if (nc.field_H != 2) {
                                                                ti.a((var13 - 35) * (var18 + var19 * 10) / 10 + var16 + 136, 136 + var17, 144, 50, eh.field_e);
                                                                break L78;
                                                              } else {
                                                                ti.a((var13 - 35) * (10 * var19) / 10 + (136 + var16), (var18 << 2) + (136 + var17), -var18 + 9 << 4, 50, eh.field_e);
                                                                break L78;
                                                              }
                                                            }
                                                            var19++;
                                                            continue L74;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var9 -= 48;
                                                    ti.a(var9 + 32, 432, 32, 32, 14, 0, 192);
                                                    e.field_g[var11].e(var9, 400);
                                                    qj.field_a.b((String) var10, 18 + var9, 453, 16777215, -1);
                                                    break L57;
                                                  } else {
                                                    break L57;
                                                  }
                                                }
                                                nj.field_f[0] = var6_int;
                                                if (((stellarshard) this).field_J > 0) {
                                                  var5 = ah.field_k;
                                                  break L38;
                                                } else {
                                                  break L38;
                                                }
                                              } else {
                                                break L38;
                                              }
                                            }
                                            L79: {
                                              if (ig.field_D <= 0) {
                                                break L79;
                                              } else {
                                                ti.b(0, 0, 640, 480, 16777215, ig.field_D);
                                                break L79;
                                              }
                                            }
                                            L80: {
                                              ti.a(0, 0, 640, 480, 0, 192);
                                              ti.a(1, 1, 638, 478, 0, 128);
                                              ti.a(2, 2, 636, 476, 0, 64);
                                              if (na.field_j != null) {
                                                na.field_j.a((byte) 85);
                                                break L80;
                                              } else {
                                                break L80;
                                              }
                                            }
                                            L81: {
                                              if (((stellarshard) this).field_R <= 0) {
                                                break L81;
                                              } else {
                                                ti.b(0, 0, 640, 480, 16777215, ((stellarshard) this).field_R);
                                                break L81;
                                              }
                                            }
                                            L82: {
                                              if (nc.field_A <= 0) {
                                                break L82;
                                              } else {
                                                if (!s.field_i) {
                                                  break L82;
                                                } else {
                                                  if (mk.field_k > 0) {
                                                    break L82;
                                                  } else {
                                                    var6 = dd.field_i + nc.field_A / 50 + ef.field_o;
                                                    int discarded$11 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 575, 480, 0, 0, 1, 0, l.field_f.field_N);
                                                    int discarded$12 = l.field_f.a(var6, 32, 68 - l.field_f.field_N, 576, 479, 0, 0, 1, 0, l.field_f.field_N);
                                                    int discarded$13 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 480, 16777215, -1, 1, 0, l.field_f.field_N);
                                                    break L82;
                                                  }
                                                }
                                              }
                                            }
                                            L83: {
                                              if (nc.field_A <= 0) {
                                                break L83;
                                              } else {
                                                if (!s.field_i) {
                                                  break L83;
                                                } else {
                                                  if (qi.field_a < 50) {
                                                    break L83;
                                                  } else {
                                                    var6 = lk.field_g + hf.field_g + nc.field_A / 50 + ef.field_o;
                                                    int discarded$14 = l.field_f.a(var6, 32, 68 + -l.field_f.field_N, 575, 480, 0, 0, 1, 0, l.field_f.field_N);
                                                    int discarded$15 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 479, 0, 0, 1, 0, l.field_f.field_N);
                                                    int discarded$16 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 480, 16777215, -1, 1, 0, l.field_f.field_N);
                                                    break L83;
                                                  }
                                                }
                                              }
                                            }
                                            L84: {
                                              var6_ref = (jf) (Object) hf.field_i.b(-119);
                                              if (null == var6_ref) {
                                                break L84;
                                              } else {
                                                L85: {
                                                  var7 = ((stellarshard) this).field_I;
                                                  if (var7 >= 80) {
                                                    if (var7 < 230) {
                                                      var8 = 255;
                                                      break L85;
                                                    } else {
                                                      var8 = (310 + -var7) * 255 / 80;
                                                      break L85;
                                                    }
                                                  } else {
                                                    var8 = 255 * var7 / 80;
                                                    break L85;
                                                  }
                                                }
                                                L86: {
                                                  var9 = 148;
                                                  if (var8 < 0) {
                                                    var8 = 0;
                                                    break L86;
                                                  } else {
                                                    break L86;
                                                  }
                                                }
                                                L87: {
                                                  ti.b(4, 353, -6 + var9, 123, 0, var8);
                                                  if (var8 == 255) {
                                                    wh.field_e[var6_ref.field_o].a(-24 + var9 / 2, 369, 48, 48);
                                                    int discarded$17 = qj.field_a.a(rc.field_e[var6_ref.field_o], 8, 425, var9 - 16, 56, 65535, -1, 1, 1, qj.field_a.field_N);
                                                    break L87;
                                                  } else {
                                                    break L87;
                                                  }
                                                }
                                                var5 = te.field_a;
                                                qj.field_a.c(var5, var9 / 2 - -1, 355, 0, -1);
                                                qj.field_a.c(var5, 1 + var9 / 2, 357, 0, -1);
                                                qj.field_a.c(var5, var9 / 2, 356, 0, -1);
                                                qj.field_a.c(var5, var9 / 2 + 2, 356, 0, -1);
                                                qj.field_a.c(var5, var9 / 2 - -1, 356, 16777215, -1);
                                                break L84;
                                              }
                                            }
                                            L88: {
                                              if (!fd.d((byte) -21)) {
                                                break L88;
                                              } else {
                                                ti.b(0, 0, 640, 480, 0, 128);
                                                ti.f(-(ok.a((byte) 126) / 2) + 301, -16 + -(kb.b((byte) -114) / 2) + 235, ok.a((byte) 125) + 38, kb.b((byte) 121) + 42, 0);
                                                na.a(28, 256, 28, fg.field_P);
                                                break L88;
                                              }
                                            }
                                            L89: {
                                              if (!hd.field_b) {
                                                break L89;
                                              } else {
                                                ti.b(0, 0, 150, 480, 0, 64);
                                                ti.b(0, 0, 150, 480, 16777215);
                                                break L89;
                                              }
                                            }
                                            L90: {
                                              if (!id.b(param0 ^ 20876)) {
                                                break L90;
                                              } else {
                                                if (fd.d((byte) -21)) {
                                                  break L90;
                                                } else {
                                                  L91: {
                                                    if (null != s.field_e) {
                                                      stackOut_358_0 = 1;
                                                      stackIn_359_0 = stackOut_358_0;
                                                      break L91;
                                                    } else {
                                                      stackOut_357_0 = ua.field_b;
                                                      stackIn_359_0 = stackOut_357_0 ? 1 : 0;
                                                      break L91;
                                                    }
                                                  }
                                                  bc.a(stackIn_359_0 != 0, -102);
                                                  break L90;
                                                }
                                              }
                                            }
                                            L92: {
                                              if (null == s.field_e) {
                                                stackOut_362_0 = qd.field_j;
                                                stackIn_363_0 = (Object) (Object) stackOut_362_0;
                                                break L92;
                                              } else {
                                                stackOut_361_0 = s.field_e;
                                                stackIn_363_0 = (Object) (Object) stackOut_361_0;
                                                break L92;
                                              }
                                            }
                                            pd.a((java.awt.Canvas) (Object) stackIn_363_0, 0, 0, (byte) -73);
                                            return;
                                          } else {
                                            ei.field_D[var6_int].d(-128 + (fk.field_k[var5_int] >> 4), -128 + (fk.field_k[1 + var5_int] >> 4), -(el.field_I * 2) + 128);
                                            var5_int += 8;
                                            var6_int += 2;
                                            continue L20;
                                          }
                                        }
                                      } else {
                                        L93: {
                                          if (a.field_h[var5_int] == null) {
                                            break L93;
                                          } else {
                                            L94: {
                                              if (14 == a.field_h[var5_int].field_m) {
                                                break L94;
                                              } else {
                                                if (!a.field_h[var5_int].a((byte) -83)) {
                                                  break L93;
                                                } else {
                                                  break L94;
                                                }
                                              }
                                            }
                                            a.field_h[var5_int].e(122);
                                            break L93;
                                          }
                                        }
                                        var5_int++;
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    L95: {
                                      var6_int = var3;
                                      var7 = var5_int * ((stellarshard) this).field_G.field_v;
                                      if (var6_int < 0) {
                                        stackOut_90_0 = -var6_int;
                                        stackIn_91_0 = stackOut_90_0;
                                        break L95;
                                      } else {
                                        stackOut_89_0 = 0;
                                        stackIn_91_0 = stackOut_89_0;
                                        break L95;
                                      }
                                    }
                                    L96: {
                                      var8 = stackIn_91_0;
                                      if (((stellarshard) this).field_G.field_v + var6_int <= 640) {
                                        stackOut_93_0 = ((stellarshard) this).field_G.field_v;
                                        stackIn_94_0 = stackOut_93_0;
                                        break L96;
                                      } else {
                                        stackOut_92_0 = 640 + -var6_int;
                                        stackIn_94_0 = stackOut_92_0;
                                        break L96;
                                      }
                                    }
                                    var9 = stackIn_94_0;
                                    var10_int = var8;
                                    L97: while (true) {
                                      if (~var10_int <= ~var9) {
                                        var5_int++;
                                        continue L18;
                                      } else {
                                        L98: {
                                          var4 = ((stellarshard) this).field_G.field_z[var7 + var10_int];
                                          if (var4 > 0) {
                                            L99: {
                                              if (var4 <= 0) {
                                                break L99;
                                              } else {
                                                if (var4 <= 96) {
                                                  ((stellarshard) this).field_G.field_z[var7 + var10_int] = var4 * 255 / 96 << 16;
                                                  break L99;
                                                } else {
                                                  break L99;
                                                }
                                              }
                                            }
                                            L100: {
                                              if (var4 <= 96) {
                                                break L100;
                                              } else {
                                                if (var4 < 160) {
                                                  ((stellarshard) this).field_G.field_z[var7 + var10_int] = 16711680 - -((-24480 + 255 * var4) / 64 << 8);
                                                  break L100;
                                                } else {
                                                  break L100;
                                                }
                                              }
                                            }
                                            if (160 > var4) {
                                              break L98;
                                            } else {
                                              if (var4 >= 255) {
                                                break L98;
                                              } else {
                                                ((stellarshard) this).field_G.field_z[var10_int + var7] = 255 * (-160 + var4) / 95 + 16776960;
                                                break L98;
                                              }
                                            }
                                          } else {
                                            break L98;
                                          }
                                        }
                                        var10_int++;
                                        continue L97;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackOut_81_0 = null;
                                stackIn_82_0 = stackOut_81_0;
                                L101: {
                                  if (stackIn_82_0 == (Object) (Object) hf.field_e[var3]) {
                                    break L101;
                                  } else {
                                    hf.field_e[var3].a(true);
                                    break L101;
                                  }
                                }
                                var3++;
                                continue L17;
                              }
                            }
                          } else {
                            L102: {
                              if (wk.field_b[var3] != null) {
                                wk.field_b[var3].a(-57, ((stellarshard) this).field_G);
                                break L102;
                              } else {
                                break L102;
                              }
                            }
                            var3++;
                            continue L16;
                          }
                        }
                      } else {
                        stackOut_58_0 = null;
                        stackIn_59_0 = stackOut_58_0;
                        L103: {
                          if (stackIn_59_0 == (Object) (Object) a.field_h[var3]) {
                            break L103;
                          } else {
                            if (a.field_h[var3].field_m == 14) {
                              break L103;
                            } else {
                              if (!a.field_h[var3].a((byte) -96)) {
                                a.field_h[var3].e(106);
                                break L103;
                              } else {
                                break L103;
                              }
                            }
                          }
                        }
                        var3++;
                        continue L14;
                      }
                    }
                  } else {
                    ei.field_D[var4].d((fk.field_k[var3] >> 4) - 128, (fk.field_k[var3 - -1] >> 4) + -128, 128 - el.field_I * 2);
                    var3 += 8;
                    var4 += 2;
                    continue L13;
                  }
                }
              } else {
                i.a((java.awt.Canvas) var2, -99);
                return;
              }
            } else {
              i.a((java.awt.Canvas) var2, -101);
              return;
            }
          } else {
            i.a((java.awt.Canvas) var2, -113);
            return;
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
                ((stellarshard) this).c((byte) -68);
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
          throw ma.a((Throwable) (Object) var3, "stellarshard.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public final void init() {
        try {
            ((stellarshard) this).a(11, true, "stellarshard");
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "stellarshard.init()");
        }
    }

    public stellarshard() {
        ((stellarshard) this).field_P = new int[]{384, 384, -384, -384, 384, 384, -384, -384};
        ((stellarshard) this).field_N = new int[]{384, -384, -384, 384, 384, -384, -384, 384};
        ((stellarshard) this).field_S = new int[]{384, 384, 384, 384, -384, -384, -384, -384};
        ((stellarshard) this).field_I = 0;
    }

    private final void o() {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ld.field_G) {
                int discarded$4 = 26949;
                le.a(ld.field_G);
                ld.field_G = null;
                int discarded$5 = -33;
                rg.g();
                break L1;
              } else {
                break L1;
              }
            }
            bh.field_a = wl.a(1, 1);
            wk.field_a = wl.a(1, 2);
            var2_int = -40;
            mf.field_b = wl.a(1, 3);
            ka.field_n = wl.a(1, 4);
            be.field_d = wl.a(1, 5);
            jf.field_m = wl.a(1, 7);
            int discarded$6 = 118;
            jg.a(ie.field_u, fc.field_a);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "stellarshard.GB(" + 122 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = new int[16];
        field_E = new th();
    }
}

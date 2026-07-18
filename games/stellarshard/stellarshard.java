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
        int var2_int = 0;
        RuntimeException var2 = null;
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
              L3: {
                if (ah.a(-1)) {
                  break L3;
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
                  if (field_B == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                na.field_j = new ij((stellarshard) this);
                if (te.field_c > 0) {
                  break L6;
                } else {
                  if (0 < tl.field_a) {
                    break L6;
                  } else {
                    if (tf.field_a.a(0)) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              tl.field_c = 5;
              break L2;
            }
            L7: {
              s.field_i = false;
              ll.a(16);
              nc.field_H = 0;
              var2_int = -73 % ((param0 - 31) / 34);
              if (fe.field_e) {
                ll.field_c.a(sb.field_e[19], 100, pk.field_h * 2);
                break L7;
              } else {
                break L7;
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
                field_E = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "stellarshard.VA(" + param0 + ')');
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
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
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
              stackOut_5_0 = -7;
              stackIn_6_0 = stackOut_5_0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_6_0 >= ~var20) {
                      break L5;
                    } else {
                      var21 = ag.field_b[var20];
                      var22 = og.field_d[var20];
                      var23 = wd.field_e[var20];
                      var24 = th.field_a[var20];
                      var25 = el.field_F[var20];
                      var26 = lg.field_a[var20];
                      if (var42 != 0) {
                        break L4;
                      } else {
                        var27 = 0;
                        L6: while (true) {
                          L7: {
                            L8: {
                              if (var27 >= 25) {
                                break L8;
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
                                if (var42 != 0) {
                                  break L7;
                                } else {
                                  if (var42 == 0) {
                                    continue L6;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            var27 = 0;
                            break L7;
                          }
                          L9: while (true) {
                            stackOut_15_0 = ~var27;
                            stackOut_15_1 = -5;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            L10: while (true) {
                              L11: {
                                if (stackIn_16_0 <= stackIn_16_1) {
                                  break L11;
                                } else {
                                  stackOut_17_0 = 0;
                                  stackIn_6_0 = stackOut_17_0;
                                  stackIn_18_0 = stackOut_17_0;
                                  if (var42 != 0) {
                                    continue L3;
                                  } else {
                                    var28 = stackIn_18_0;
                                    L12: while (true) {
                                      L13: {
                                        if (var28 >= 4) {
                                          break L13;
                                        } else {
                                          var29 = 4 * var28 + var27;
                                          stackOut_20_0 = -3;
                                          stackOut_20_1 = ~var20;
                                          stackIn_16_0 = stackOut_20_0;
                                          stackIn_16_1 = stackOut_20_1;
                                          stackIn_21_0 = stackOut_20_0;
                                          stackIn_21_1 = stackOut_20_1;
                                          if (var42 != 0) {
                                            continue L10;
                                          } else {
                                            L14: {
                                              L15: {
                                                if (stackIn_21_0 == stackIn_21_1) {
                                                  break L15;
                                                } else {
                                                  if (4 == var20) {
                                                    break L15;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                              }
                                              var29 += 16;
                                              break L14;
                                            }
                                            L16: {
                                              if (var20 == 0) {
                                                var29 += 32;
                                                break L16;
                                              } else {
                                                break L16;
                                              }
                                            }
                                            L17: {
                                              if (var20 == 1) {
                                                var29 += 48;
                                                break L17;
                                              } else {
                                                break L17;
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
                                            if (var42 == 0) {
                                              continue L12;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                      }
                                      var27++;
                                      if (var42 == 0) {
                                        continue L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                              }
                              var20++;
                              if (var42 == 0) {
                                continue L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  break L4;
                }
                break L0;
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
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        Object stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        Object stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        Object stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        Object stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
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
                    nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                    s.field_e.a(ic.field_d, -57);
                    qd.field_j.requestFocus();
                    s.field_e = null;
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (!ee.b(122)) {
                    break L5;
                  } else {
                    ((stellarshard) this).k(-11);
                    if (!vj.a(25424)) {
                      break L4;
                    } else {
                      this.a(false, (byte) -81);
                      if (var3 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  if (fd.field_mb) {
                    L7: {
                      if (fd.d((byte) -21)) {
                        ((stellarshard) this).l((byte) -124);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    fd.field_mb = false;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L8: {
                  L9: {
                    if (!hf.field_f) {
                      break L9;
                    } else {
                      L10: {
                        if (be.field_g == null) {
                          break L10;
                        } else {
                          if (be.field_g.field_n) {
                            L11: {
                              tl.field_a = tl.field_a & ~be.field_g.field_m[0];
                              sd.field_d = sd.field_d | be.field_g.field_m[0];
                              be.field_g = null;
                              if (na.field_j == null) {
                                break L11;
                              } else {
                                if (tl.field_a == 0) {
                                  oc.field_d = false;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            hi.b((byte) 109);
                            var2_ref = (kl) (Object) ue.field_c.b(-91);
                            L12: while (true) {
                              L13: {
                                if (var2_ref == null) {
                                  break L13;
                                } else {
                                  tc.a(var2_ref, 4, false);
                                  var2_ref = (kl) (Object) ue.field_c.b((byte) -128);
                                  if (var3 != 0) {
                                    break L8;
                                  } else {
                                    if (var3 == 0) {
                                      continue L12;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              if (var3 == 0) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      L14: {
                        if (null == gg.field_f) {
                          break L14;
                        } else {
                          if (gg.field_f.field_m) {
                            L15: {
                              if (of.field_A < gg.field_f.field_s[0]) {
                                of.field_A = gg.field_f.field_s[0];
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            gg.field_f = null;
                            if (var3 == 0) {
                              break L8;
                            } else {
                              break L14;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      L16: {
                        if (fd.d((byte) -21)) {
                          break L16;
                        } else {
                          L17: {
                            if (!wk.a(113)) {
                              break L17;
                            } else {
                              L18: {
                                stackOut_76_0 = this;
                                stackOut_76_1 = 0;
                                stackIn_81_0 = stackOut_76_0;
                                stackIn_81_1 = stackOut_76_1;
                                stackIn_77_0 = stackOut_76_0;
                                stackIn_77_1 = stackOut_76_1;
                                if (null == s.field_e) {
                                  stackOut_81_0 = this;
                                  stackOut_81_1 = stackIn_81_1;
                                  stackOut_81_2 = 0;
                                  stackIn_82_0 = stackOut_81_0;
                                  stackIn_82_1 = stackOut_81_1;
                                  stackIn_82_2 = stackOut_81_2;
                                  break L18;
                                } else {
                                  stackOut_77_0 = this;
                                  stackOut_77_1 = stackIn_77_1;
                                  stackIn_79_0 = stackOut_77_0;
                                  stackIn_79_1 = stackOut_77_1;
                                  stackOut_79_0 = this;
                                  stackOut_79_1 = stackIn_79_1;
                                  stackOut_79_2 = 1;
                                  stackIn_82_0 = stackOut_79_0;
                                  stackIn_82_1 = stackOut_79_1;
                                  stackIn_82_2 = stackOut_79_2;
                                  break L18;
                                }
                              }
                              L19: {
                                L20: {
                                  var2_int = oa.a((rb) this, stackIn_82_1, stackIn_82_2 != 0);
                                  if (var2_int != 1) {
                                    break L20;
                                  } else {
                                    if (null != s.field_e) {
                                      nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                                      s.field_e.a(ic.field_d, -71);
                                      s.field_e = null;
                                      qd.field_j.requestFocus();
                                      if (var3 == 0) {
                                        break L19;
                                      } else {
                                        break L20;
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                                L21: {
                                  if (2 == var2_int) {
                                    break L21;
                                  } else {
                                    if (var2_int == 2364824) {
                                      cj.b(-5);
                                      if (var3 == 0) {
                                        break L19;
                                      } else {
                                        break L21;
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                                L22: {
                                  if (null != s.field_e) {
                                    nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                                    s.field_e.a(ic.field_d, -15);
                                    s.field_e = null;
                                    qd.field_j.requestFocus();
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                df.a(false, hf.a((byte) -84));
                                break L19;
                              }
                              if (var3 == 0) {
                                break L8;
                              } else {
                                break L17;
                              }
                            }
                          }
                          this.d(true);
                          if (var3 == 0) {
                            break L8;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L23: {
                        var2_int = vd.a((byte) -61);
                        if (var2_int == 2) {
                          if (s.field_e != null) {
                            nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                            s.field_e.a(ic.field_d, -15);
                            s.field_e = null;
                            qd.field_j.requestFocus();
                            break L23;
                          } else {
                            break L23;
                          }
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        if (var2_int == 3) {
                          ((stellarshard) this).l((byte) -110);
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        if (4 != var2_int) {
                          break L25;
                        } else {
                          wj.h(-128);
                          fd.field_mb = true;
                          break L25;
                        }
                      }
                      if (var3 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  this.a(true, (byte) -111);
                  break L8;
                }
                L26: while (true) {
                  L27: {
                    L28: {
                      if (!fh.a((byte) 73, i.field_e)) {
                        break L28;
                      } else {
                        ((stellarshard) this).h(6476);
                        if (var3 != 0) {
                          break L27;
                        } else {
                          if (var3 == 0) {
                            continue L26;
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                    ue.a((byte) 85, 0);
                    break L27;
                  }
                  if (!il.e(32525)) {
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
                        if (field_B == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
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
        int var9_int = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_24_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
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
              L2: {
                L3: {
                  if (var5 >= eh.field_e.length) {
                    break L3;
                  } else {
                    eh.field_e[var5] = 65793 * var5;
                    var2_array[var5] = var5 * 256;
                    var3[var5] = var5;
                    var4[var5] = 65536 * var5;
                    var5++;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((stellarshard) this).field_H = new pi();
                sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 1.0);
                ((stellarshard) this).field_H.a(sg.field_a, 19);
                sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.5);
                ((stellarshard) this).field_H.a(sg.field_a, 103);
                ea.field_m = new pb(80, 160);
                ea.field_m.e();
                var5 = 0;
                break L2;
              }
              var6_float = 0.0f;
              L4: while (true) {
                L5: {
                  L6: {
                    if (20.0f <= var6_float) {
                      break L6;
                    } else {
                      var5 = (int)(-((-var6_float + 20.0f) * (-var6_float + 20.0f) / 20.0f) + 40.0f);
                      ti.e(40, (int)(-(var6_float * 2.0f) + 120.0f), var5, (int)(Math.random() * 16.0) * 1052688 | 1);
                      var6_float = (float)((double)var6_float + 0.1);
                      if (var12 != 0) {
                        break L5;
                      } else {
                        if (var12 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var6_float = 20.0f;
                  break L5;
                }
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var6_float > 40.0f) {
                        break L9;
                      } else {
                        var5 = (int)(40.0f - (var6_float - 20.0f) * (var6_float - 20.0f) / 20.0f);
                        ti.e(40, (int)(120.0f - var6_float * 2.0f), var5, 1 | (int)(16.0 * Math.random()) * 1052688);
                        var6_float = (float)((double)var6_float + 0.1);
                        if (var12 != 0) {
                          break L8;
                        } else {
                          if (var12 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    pd.field_h.a((byte) -107);
                    ei.field_D = new pb[12];
                    fk.field_k = new int[48];
                    break L8;
                  }
                  var5 = 0;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (var5 >= 12) {
                          break L12;
                        } else {
                          fk.field_k[var5 * 4] = (int)(640.0 * Math.random()) << 4;
                          fk.field_k[var5 * 4 - -1] = (int)(Math.random() * 480.0) << 4;
                          fk.field_k[2 + var5 * 4] = (int)(33.0 * Math.random() - 16.0);
                          fk.field_k[3 + 4 * var5] = (int)(33.0 * Math.random() - 16.0);
                          ei.field_D[var5] = new pb(256, 256);
                          ei.field_D[var5].e();
                          stackOut_23_0 = 0;
                          stackIn_33_0 = stackOut_23_0;
                          stackIn_24_0 = stackOut_23_0;
                          if (var12 != 0) {
                            break L11;
                          } else {
                            var6 = stackIn_24_0;
                            L13: while (true) {
                              L14: {
                                L15: {
                                  if (var6 >= 4) {
                                    break L15;
                                  } else {
                                    var7 = (int)(64.0 * Math.random() + 64.0);
                                    var8 = (int)(Math.random() * (double)((128 - var7) * 2) + (double)var7);
                                    var9_int = (int)(Math.random() * (double)(2 * (-var7 + 128)) + (double)var7);
                                    ti.a(var8 << 4, var9_int << 4, var7 << 4, -var7 + 128, eh.field_e);
                                    var6++;
                                    if (var12 != 0) {
                                      break L14;
                                    } else {
                                      if (var12 == 0) {
                                        continue L13;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                }
                                var5++;
                                break L14;
                              }
                              if (var12 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                      }
                      lc.field_k = new pb(640, 480);
                      lc.field_k.e();
                      stackOut_32_0 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      break L11;
                    }
                    var5 = stackIn_33_0;
                    L16: while (true) {
                      stackOut_34_0 = ~var5;
                      stackOut_34_1 = -257;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      L17: while (true) {
                        L18: {
                          L19: {
                            if (stackIn_35_0 <= stackIn_35_1) {
                              break L19;
                            } else {
                              var6 = (int)(Math.random() * 112.0 + 16.0);
                              var7 = (int)(640.0 * Math.random() - (double)var6);
                              var8 = (int)(480.0 * Math.random() - (double)var6);
                              var9 = eh.field_e;
                              var10 = (int)(4.0 * Math.random());
                              stackOut_36_0 = 1;
                              stackOut_36_1 = var10;
                              stackIn_62_0 = stackOut_36_0;
                              stackIn_62_1 = stackOut_36_1;
                              stackIn_37_0 = stackOut_36_0;
                              stackIn_37_1 = stackOut_36_1;
                              if (var12 != 0) {
                                break L18;
                              } else {
                                L20: {
                                  if (stackIn_37_0 == stackIn_37_1) {
                                    var9 = var2_array;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                L21: {
                                  if (var10 != 2) {
                                    break L21;
                                  } else {
                                    var9 = var3;
                                    break L21;
                                  }
                                }
                                L22: {
                                  if (var10 != 3) {
                                    break L22;
                                  } else {
                                    var9 = var4;
                                    break L22;
                                  }
                                }
                                var11 = 0;
                                L23: while (true) {
                                  L24: {
                                    if (4 <= var11) {
                                      break L24;
                                    } else {
                                      ti.a(var7 << 4, var8 << 4, var6 << 4, -var6 + 128, var9);
                                      stackOut_48_0 = 0;
                                      stackOut_48_1 = var11;
                                      stackIn_35_0 = stackOut_48_0;
                                      stackIn_35_1 = stackOut_48_1;
                                      stackIn_49_0 = stackOut_48_0;
                                      stackIn_49_1 = stackOut_48_1;
                                      if (var12 != 0) {
                                        continue L17;
                                      } else {
                                        L25: {
                                          if (stackIn_49_0 == stackIn_49_1) {
                                            var7 += 640;
                                            break L25;
                                          } else {
                                            break L25;
                                          }
                                        }
                                        L26: {
                                          if (1 != var11) {
                                            break L26;
                                          } else {
                                            var8 += 480;
                                            break L26;
                                          }
                                        }
                                        L27: {
                                          if (var11 == 2) {
                                            var7 -= 640;
                                            break L27;
                                          } else {
                                            break L27;
                                          }
                                        }
                                        var11++;
                                        if (var12 == 0) {
                                          continue L23;
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                  }
                                  var5++;
                                  if (var12 == 0) {
                                    continue L16;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                          }
                          pd.field_h.a((byte) -107);
                          stackOut_61_0 = 22050;
                          stackOut_61_1 = 0;
                          stackIn_62_0 = stackOut_61_0;
                          stackIn_62_1 = stackOut_61_1;
                          break L18;
                        }
                        ba.a(stackIn_62_0, stackIn_62_1 != 0, 10);
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
                      }
                    }
                  }
                }
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

    private final void d(boolean param0) {
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
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_134_1 = 0;
        int stackIn_166_0 = 0;
        int stackIn_166_1 = 0;
        int stackIn_176_0 = 0;
        int stackIn_176_1 = 0;
        int stackIn_181_0 = 0;
        int stackIn_181_1 = 0;
        int stackIn_191_0 = 0;
        int stackIn_191_1 = 0;
        int stackIn_195_0 = 0;
        int stackIn_195_1 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_225_0 = 0;
        int stackIn_225_1 = 0;
        int stackIn_239_0 = 0;
        int stackIn_239_1 = 0;
        int stackIn_270_0 = 0;
        int stackIn_270_1 = 0;
        int stackIn_364_0 = 0;
        int stackIn_366_0 = 0;
        int stackIn_368_0 = 0;
        int stackIn_369_0 = 0;
        int stackIn_369_1 = 0;
        qe stackIn_411_0 = null;
        double stackIn_411_1 = 0.0;
        double stackIn_411_2 = 0.0;
        qe stackIn_413_0 = null;
        double stackIn_413_1 = 0.0;
        double stackIn_413_2 = 0.0;
        qe stackIn_415_0 = null;
        double stackIn_415_1 = 0.0;
        double stackIn_415_2 = 0.0;
        qe stackIn_416_0 = null;
        double stackIn_416_1 = 0.0;
        double stackIn_416_2 = 0.0;
        double stackIn_416_3 = 0.0;
        qe stackIn_417_0 = null;
        double stackIn_417_1 = 0.0;
        double stackIn_417_2 = 0.0;
        qe stackIn_419_0 = null;
        double stackIn_419_1 = 0.0;
        double stackIn_419_2 = 0.0;
        qe stackIn_420_0 = null;
        double stackIn_420_1 = 0.0;
        double stackIn_420_2 = 0.0;
        double stackIn_420_3 = 0.0;
        vl stackIn_437_0 = null;
        vl stackIn_437_1 = null;
        vl stackIn_439_0 = null;
        vl stackIn_439_1 = null;
        vl stackIn_440_0 = null;
        vl stackIn_440_1 = null;
        vl stackIn_441_0 = null;
        vl stackIn_441_1 = null;
        int stackIn_441_2 = 0;
        vl stackIn_451_0 = null;
        vl stackIn_451_1 = null;
        vl stackIn_453_0 = null;
        vl stackIn_453_1 = null;
        vl stackIn_454_0 = null;
        vl stackIn_454_1 = null;
        vl stackIn_455_0 = null;
        vl stackIn_455_1 = null;
        int stackIn_455_2 = 0;
        gd stackIn_480_0 = null;
        int stackIn_480_1 = 0;
        gd stackIn_482_0 = null;
        int stackIn_482_1 = 0;
        gd stackIn_484_0 = null;
        int stackIn_484_1 = 0;
        gd stackIn_485_0 = null;
        int stackIn_485_1 = 0;
        int stackIn_485_2 = 0;
        gd stackIn_487_0 = null;
        int stackIn_487_1 = 0;
        gd stackIn_489_0 = null;
        int stackIn_489_1 = 0;
        gd stackIn_491_0 = null;
        int stackIn_491_1 = 0;
        gd stackIn_492_0 = null;
        int stackIn_492_1 = 0;
        int stackIn_492_2 = 0;
        int stackIn_503_0 = 0;
        int stackIn_529_0 = 0;
        int stackIn_793_0 = 0;
        int stackIn_793_1 = 0;
        int stackIn_816_0 = 0;
        int stackIn_816_1 = 0;
        int stackIn_839_0 = 0;
        int stackIn_866_0 = 0;
        int stackIn_866_1 = 0;
        int stackIn_908_0 = 0;
        int stackIn_908_1 = 0;
        int stackIn_919_0 = 0;
        int stackIn_919_1 = 0;
        int stackIn_921_0 = 0;
        int stackIn_921_1 = 0;
        int stackIn_930_0 = 0;
        int stackIn_930_1 = 0;
        int stackIn_932_0 = 0;
        int stackIn_932_1 = 0;
        int stackIn_973_0 = 0;
        int stackIn_981_0 = 0;
        int stackIn_989_0 = 0;
        int stackIn_991_0 = 0;
        int stackIn_993_0 = 0;
        int stackIn_993_1 = 0;
        int stackIn_1012_0 = 0;
        int stackIn_1026_0 = 0;
        qe stackIn_1029_0 = null;
        qe stackIn_1090_0 = null;
        int stackIn_1097_0 = 0;
        int stackIn_1150_0 = 0;
        int stackIn_1150_1 = 0;
        int stackIn_1168_0 = 0;
        int stackIn_1168_1 = 0;
        vl stackIn_1170_0 = null;
        vl stackIn_1172_0 = null;
        Object stackIn_1185_0 = null;
        vl stackIn_1185_1 = null;
        Object stackIn_1194_0 = null;
        Object stackIn_1204_0 = null;
        Object stackIn_1215_0 = null;
        Object stackIn_1217_0 = null;
        vl stackIn_1217_1 = null;
        vl stackIn_1220_0 = null;
        Object stackIn_1258_0 = null;
        Object stackIn_1282_0 = null;
        ij stackIn_1282_1 = null;
        Object stackIn_1305_0 = null;
        ij stackIn_1305_1 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        int stackOut_165_0 = 0;
        int stackOut_165_1 = 0;
        int stackOut_175_0 = 0;
        int stackOut_175_1 = 0;
        int stackOut_180_0 = 0;
        int stackOut_180_1 = 0;
        int stackOut_190_0 = 0;
        int stackOut_190_1 = 0;
        int stackOut_194_0 = 0;
        int stackOut_194_1 = 0;
        int stackOut_204_0 = 0;
        int stackOut_204_1 = 0;
        int stackOut_214_0 = 0;
        int stackOut_214_1 = 0;
        int stackOut_224_0 = 0;
        int stackOut_224_1 = 0;
        int stackOut_238_0 = 0;
        int stackOut_238_1 = 0;
        int stackOut_268_0 = 0;
        int stackOut_268_1 = 0;
        int stackOut_363_0 = 0;
        int stackOut_368_0 = 0;
        int stackOut_368_1 = 0;
        int stackOut_364_0 = 0;
        int stackOut_366_0 = 0;
        int stackOut_366_1 = 0;
        qe stackOut_410_0 = null;
        double stackOut_410_1 = 0.0;
        double stackOut_410_2 = 0.0;
        qe stackOut_415_0 = null;
        double stackOut_415_1 = 0.0;
        double stackOut_415_2 = 0.0;
        double stackOut_415_3 = 0.0;
        qe stackOut_411_0 = null;
        double stackOut_411_1 = 0.0;
        double stackOut_411_2 = 0.0;
        qe stackOut_413_0 = null;
        double stackOut_413_1 = 0.0;
        double stackOut_413_2 = 0.0;
        double stackOut_413_3 = 0.0;
        qe stackOut_416_0 = null;
        double stackOut_416_1 = 0.0;
        double stackOut_416_2 = 0.0;
        qe stackOut_419_0 = null;
        double stackOut_419_1 = 0.0;
        double stackOut_419_2 = 0.0;
        double stackOut_419_3 = 0.0;
        qe stackOut_417_0 = null;
        double stackOut_417_1 = 0.0;
        double stackOut_417_2 = 0.0;
        double stackOut_417_3 = 0.0;
        vl stackOut_436_0 = null;
        vl stackOut_436_1 = null;
        vl stackOut_440_0 = null;
        vl stackOut_440_1 = null;
        int stackOut_440_2 = 0;
        vl stackOut_437_0 = null;
        vl stackOut_437_1 = null;
        vl stackOut_439_0 = null;
        vl stackOut_439_1 = null;
        int stackOut_439_2 = 0;
        vl stackOut_450_0 = null;
        vl stackOut_450_1 = null;
        vl stackOut_454_0 = null;
        vl stackOut_454_1 = null;
        int stackOut_454_2 = 0;
        vl stackOut_451_0 = null;
        vl stackOut_451_1 = null;
        vl stackOut_453_0 = null;
        vl stackOut_453_1 = null;
        int stackOut_453_2 = 0;
        gd stackOut_479_0 = null;
        int stackOut_479_1 = 0;
        gd stackOut_484_0 = null;
        int stackOut_484_1 = 0;
        int stackOut_484_2 = 0;
        gd stackOut_480_0 = null;
        int stackOut_480_1 = 0;
        gd stackOut_482_0 = null;
        int stackOut_482_1 = 0;
        int stackOut_482_2 = 0;
        gd stackOut_486_0 = null;
        int stackOut_486_1 = 0;
        gd stackOut_491_0 = null;
        int stackOut_491_1 = 0;
        int stackOut_491_2 = 0;
        gd stackOut_487_0 = null;
        int stackOut_487_1 = 0;
        gd stackOut_489_0 = null;
        int stackOut_489_1 = 0;
        int stackOut_489_2 = 0;
        int stackOut_502_0 = 0;
        int stackOut_500_0 = 0;
        int stackOut_528_0 = 0;
        int stackOut_526_0 = 0;
        int stackOut_792_0 = 0;
        int stackOut_792_1 = 0;
        int stackOut_815_0 = 0;
        int stackOut_815_1 = 0;
        int stackOut_838_0 = 0;
        int stackOut_865_0 = 0;
        int stackOut_865_1 = 0;
        int stackOut_907_0 = 0;
        int stackOut_907_1 = 0;
        int stackOut_920_0 = 0;
        int stackOut_920_1 = 0;
        int stackOut_918_0 = 0;
        int stackOut_918_1 = 0;
        int stackOut_931_0 = 0;
        int stackOut_931_1 = 0;
        int stackOut_929_0 = 0;
        int stackOut_929_1 = 0;
        int stackOut_972_0 = 0;
        int stackOut_1011_0 = 0;
        int stackOut_1009_0 = 0;
        int stackOut_988_0 = 0;
        int stackOut_989_0 = 0;
        int stackOut_991_0 = 0;
        int stackOut_991_1 = 0;
        boolean stackOut_980_0 = false;
        int stackOut_1025_0 = 0;
        qe stackOut_1028_0 = null;
        qe stackOut_1088_0 = null;
        int stackOut_1094_0 = 0;
        int stackOut_1096_0 = 0;
        int stackOut_1149_0 = 0;
        int stackOut_1149_1 = 0;
        vl stackOut_1169_0 = null;
        vl stackOut_1170_0 = null;
        int stackOut_1167_0 = 0;
        int stackOut_1167_1 = 0;
        Object stackOut_1214_0 = null;
        Object stackOut_1215_0 = null;
        vl stackOut_1215_1 = null;
        vl stackOut_1219_0 = null;
        Object stackOut_1184_0 = null;
        vl stackOut_1184_1 = null;
        Object stackOut_1193_0 = null;
        Object stackOut_1203_0 = null;
        Object stackOut_1257_0 = null;
        Object stackOut_1281_0 = null;
        ij stackOut_1281_1 = null;
        Object stackOut_1304_0 = null;
        ij stackOut_1304_1 = null;
        var15 = field_B;
        try {
          L0: {
            L1: {
              L2: {
                if (ni.field_e != ((stellarshard) this).field_Q) {
                  break L2;
                } else {
                  if (eb.field_a != ((stellarshard) this).field_O) {
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
              ((stellarshard) this).field_Q = ni.field_e;
              v.field_e = true;
              ((stellarshard) this).field_O = eb.field_a;
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
              if (qi.field_a <= 1) {
                break L7;
              } else {
                if (((stellarshard) this).field_J > 0) {
                  ((stellarshard) this).field_J = ((stellarshard) this).field_J - 1;
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
                int fieldTemp$9 = ((stellarshard) this).field_I + 1;
                ((stellarshard) this).field_I = ((stellarshard) this).field_I + 1;
                if (fieldTemp$9 != 335) {
                  break L9;
                } else {
                  ((stellarshard) this).field_I = 0;
                  gg discarded$10 = hf.field_i.d((byte) -35);
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
              int fieldTemp$11 = bf.field_c;
              bf.field_c = bf.field_c + 1;
              if (~fieldTemp$11 >= ~qj.field_a.b(sj.field_C)) {
                break L12;
              } else {
                bf.field_c = bf.field_c - qj.field_a.b(sj.field_C) * 2;
                break L12;
              }
            }
            L13: {
              if (0 < ((stellarshard) this).field_R) {
                ((stellarshard) this).field_R = ((stellarshard) this).field_R / 2;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (((stellarshard) this).field_R <= 0) {
                break L14;
              } else {
                ((stellarshard) this).field_R = ((stellarshard) this).field_R - 1;
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
                    ((stellarshard) this).field_H.a(sg.field_a, -127);
                    sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.0005);
                    ((stellarshard) this).field_H.a(sg.field_a, -125);
                    break L16;
                  }
                }
                L17: {
                  if (null == gj.field_r) {
                    break L17;
                  } else {
                    if (og.field_a <= 0) {
                      og.field_a = 25;
                      gj.field_r.b(25, 0);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
                L18: {
                  if (tl.field_c == 8) {
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
                      if (var2_int != 2) {
                        break L18;
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
                    break L18;
                  }
                }
                L20: {
                  if (tl.field_c != 3) {
                    break L20;
                  } else {
                    if (gh.field_c == 1) {
                      if (na.field_j.field_r != -1) {
                        L21: {
                          if (na.field_j.field_u == na.field_j.field_r) {
                            break L21;
                          } else {
                            na.field_j.field_u = na.field_j.field_r;
                            if (var15 == 0) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        na.field_j.field_u = -1;
                        break L20;
                      } else {
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                }
                L22: {
                  L23: {
                    if (qi.field_a > na.field_j.field_t) {
                      break L23;
                    } else {
                      if (4 == tl.field_c) {
                        L24: {
                          na.field_j.field_p = na.field_j.field_p + 1;
                          if (na.field_j.field_p <= 50) {
                            break L24;
                          } else {
                            na.field_j.field_p = na.field_j.field_p - 50;
                            na.field_j.field_s = na.field_j.field_s - 1;
                            break L24;
                          }
                        }
                        if (na.field_j.field_s <= 0) {
                          L25: {
                            gh.field_d = null;
                            tl.field_c = 2;
                            na.field_j.field_l = 9;
                            if (tl.field_a > 0) {
                              tl.field_c = 3;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                          n.field_L = 256;
                          if (var15 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        } else {
                          break L22;
                        }
                      } else {
                        break L22;
                      }
                    }
                  }
                  na.field_j.field_p = na.field_j.field_p + 1;
                  if (10 < na.field_j.field_p) {
                    na.field_j.field_t = na.field_j.field_t + 1;
                    na.field_j.field_p = na.field_j.field_p - 10;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L26: {
                  if (tl.field_c == 0) {
                    var2_int = 0;
                    L27: while (true) {
                      L28: {
                        L29: {
                          if (var2_int >= 9) {
                            break L29;
                          } else {
                            stackOut_123_0 = na.field_j.field_l;
                            stackOut_123_1 = var2_int;
                            stackIn_134_0 = stackOut_123_0;
                            stackIn_134_1 = stackOut_123_1;
                            stackIn_124_0 = stackOut_123_0;
                            stackIn_124_1 = stackOut_123_1;
                            if (var15 != 0) {
                              break L28;
                            } else {
                              L30: {
                                L31: {
                                  if (stackIn_124_0 != stackIn_124_1) {
                                    break L31;
                                  } else {
                                    nj.field_f[var2_int] = nj.field_f[var2_int] * 15 - -64 >> 4;
                                    if (var15 == 0) {
                                      break L30;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                nj.field_f[var2_int] = nj.field_f[var2_int] * 15 >> 4;
                                break L30;
                              }
                              var2_int++;
                              if (var15 == 0) {
                                continue L27;
                              } else {
                                break L29;
                              }
                            }
                          }
                        }
                        stackOut_133_0 = -3;
                        stackOut_133_1 = ~ph.field_D;
                        stackIn_134_0 = stackOut_133_0;
                        stackIn_134_1 = stackOut_133_1;
                        break L28;
                      }
                      if (stackIn_134_0 < stackIn_134_1) {
                        break L26;
                      } else {
                        L32: {
                          if (si.field_jb[16]) {
                            ((stellarshard) this).field_H.field_b = 1.0;
                            var2_ref = ((stellarshard) this).field_H;
                            var3_ref_pi = ((stellarshard) this).field_H;
                            ((stellarshard) this).field_H.field_a = 0.0;
                            var2_ref.field_d = 0.0;
                            var3_ref_pi.field_c = 0.0;
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        L33: {
                          if (si.field_jb[17]) {
                            ((stellarshard) this).field_H.field_b = 0.1513824462890625;
                            ((stellarshard) this).field_H.field_c = -0.939178466796875;
                            ((stellarshard) this).field_H.field_a = -0.258941650390625;
                            ((stellarshard) this).field_H.field_d = -0.949249267578125;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        L34: {
                          if (!si.field_jb[18]) {
                            break L34;
                          } else {
                            ((stellarshard) this).field_H.field_c = -0.0067138671875;
                            ((stellarshard) this).field_H.field_a = -0.82244873046875;
                            ((stellarshard) this).field_H.field_b = 0.13287353515625;
                            ((stellarshard) this).field_H.field_d = -0.552978515625;
                            break L34;
                          }
                        }
                        L35: {
                          if (si.field_jb[19]) {
                            ((stellarshard) this).field_H.field_d = -0.846764809241;
                            ((stellarshard) this).field_H.field_b = 0.26812744140625;
                            ((stellarshard) this).field_H.field_a = 0.4404144287109375;
                            ((stellarshard) this).field_H.field_c = 0.130889892578125;
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                        L36: {
                          if (si.field_jb[20]) {
                            ((stellarshard) this).field_H.field_b = 0.7213134765625;
                            ((stellarshard) this).field_H.field_c = 0.5408782958984375;
                            ((stellarshard) this).field_H.field_a = -0.334014892578125;
                            ((stellarshard) this).field_H.field_d = 0.2748870849609375;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                        if (si.field_jb[21]) {
                          ((stellarshard) this).field_H.field_d = -0.5489211794018304;
                          ((stellarshard) this).field_H.field_a = -0.49565616706475396;
                          ((stellarshard) this).field_H.field_b = -0.6729829114278874;
                          ((stellarshard) this).field_H.field_c = -0.010222709116862912;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                  } else {
                    break L26;
                  }
                }
                L37: {
                  L38: {
                    if (tl.field_c == 4) {
                      var2_int = 8;
                      L39: while (true) {
                        if (var2_int >= 9) {
                          break L38;
                        } else {
                          stackOut_165_0 = var2_int;
                          stackOut_165_1 = na.field_j.field_l;
                          stackIn_176_0 = stackOut_165_0;
                          stackIn_176_1 = stackOut_165_1;
                          stackIn_166_0 = stackOut_165_0;
                          stackIn_166_1 = stackOut_165_1;
                          if (var15 != 0) {
                            break L37;
                          } else {
                            L40: {
                              L41: {
                                if (stackIn_166_0 == stackIn_166_1) {
                                  break L41;
                                } else {
                                  nj.field_f[var2_int] = 15 * nj.field_f[var2_int] >> 4;
                                  if (var15 == 0) {
                                    break L40;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                              nj.field_f[var2_int] = 64 + nj.field_f[var2_int] * 15 >> 4;
                              break L40;
                            }
                            var2_int++;
                            if (var15 == 0) {
                              continue L39;
                            } else {
                              break L38;
                            }
                          }
                        }
                      }
                    } else {
                      break L38;
                    }
                  }
                  stackOut_175_0 = ~tl.field_c;
                  stackOut_175_1 = -2;
                  stackIn_176_0 = stackOut_175_0;
                  stackIn_176_1 = stackOut_175_1;
                  break L37;
                }
                L42: {
                  L43: {
                    if (stackIn_176_0 == stackIn_176_1) {
                      var2_int = 9;
                      L44: while (true) {
                        if (var2_int >= 10) {
                          break L43;
                        } else {
                          stackOut_180_0 = ~var2_int;
                          stackOut_180_1 = ~na.field_j.field_l;
                          stackIn_191_0 = stackOut_180_0;
                          stackIn_191_1 = stackOut_180_1;
                          stackIn_181_0 = stackOut_180_0;
                          stackIn_181_1 = stackOut_180_1;
                          if (var15 != 0) {
                            break L42;
                          } else {
                            L45: {
                              L46: {
                                if (stackIn_181_0 == stackIn_181_1) {
                                  break L46;
                                } else {
                                  nj.field_f[var2_int] = nj.field_f[var2_int] * 15 >> 4;
                                  if (var15 == 0) {
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              nj.field_f[var2_int] = 64 + nj.field_f[var2_int] * 15 >> 4;
                              break L45;
                            }
                            var2_int++;
                            if (var15 == 0) {
                              continue L44;
                            } else {
                              break L43;
                            }
                          }
                        }
                      }
                    } else {
                      break L43;
                    }
                  }
                  stackOut_190_0 = 2;
                  stackOut_190_1 = tl.field_c;
                  stackIn_191_0 = stackOut_190_0;
                  stackIn_191_1 = stackOut_190_1;
                  break L42;
                }
                L47: {
                  L48: {
                    if (stackIn_191_0 != stackIn_191_1) {
                      break L48;
                    } else {
                      var2_int = 8;
                      var3 = var2_int;
                      L49: while (true) {
                        if (10 <= var3) {
                          break L48;
                        } else {
                          stackOut_194_0 = ~na.field_j.field_l;
                          stackOut_194_1 = ~var3;
                          stackIn_205_0 = stackOut_194_0;
                          stackIn_205_1 = stackOut_194_1;
                          stackIn_195_0 = stackOut_194_0;
                          stackIn_195_1 = stackOut_194_1;
                          if (var15 != 0) {
                            break L47;
                          } else {
                            L50: {
                              L51: {
                                if (stackIn_195_0 == stackIn_195_1) {
                                  break L51;
                                } else {
                                  nj.field_f[var3] = 15 * nj.field_f[var3] >> 4;
                                  if (var15 == 0) {
                                    break L50;
                                  } else {
                                    break L51;
                                  }
                                }
                              }
                              nj.field_f[var3] = nj.field_f[var3] * 15 - -64 >> 4;
                              break L50;
                            }
                            var3++;
                            if (var15 == 0) {
                              continue L49;
                            } else {
                              break L48;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_204_0 = ~tl.field_c;
                  stackOut_204_1 = -4;
                  stackIn_205_0 = stackOut_204_0;
                  stackIn_205_1 = stackOut_204_1;
                  break L47;
                }
                L52: {
                  L53: {
                    if (stackIn_205_0 == stackIn_205_1) {
                      L54: {
                        var2_int = 8;
                        if (ah.a(-1)) {
                          break L54;
                        } else {
                          if (oc.field_d) {
                            break L54;
                          } else {
                            var2_int = 9;
                            break L54;
                          }
                        }
                      }
                      var3 = var2_int;
                      L55: while (true) {
                        if (var3 >= 10) {
                          break L53;
                        } else {
                          stackOut_214_0 = na.field_j.field_l;
                          stackOut_214_1 = var3;
                          stackIn_225_0 = stackOut_214_0;
                          stackIn_225_1 = stackOut_214_1;
                          stackIn_215_0 = stackOut_214_0;
                          stackIn_215_1 = stackOut_214_1;
                          if (var15 != 0) {
                            break L52;
                          } else {
                            L56: {
                              L57: {
                                if (stackIn_215_0 != stackIn_215_1) {
                                  break L57;
                                } else {
                                  nj.field_f[var3] = 15 * nj.field_f[var3] - -64 >> 4;
                                  if (var15 == 0) {
                                    break L56;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                              nj.field_f[var3] = 15 * nj.field_f[var3] >> 4;
                              break L56;
                            }
                            var3++;
                            if (var15 == 0) {
                              continue L55;
                            } else {
                              break L53;
                            }
                          }
                        }
                      }
                    } else {
                      break L53;
                    }
                  }
                  stackOut_224_0 = 0;
                  stackOut_224_1 = n.field_L;
                  stackIn_225_0 = stackOut_224_0;
                  stackIn_225_1 = stackOut_224_1;
                  break L52;
                }
                L58: {
                  if (stackIn_225_0 < stackIn_225_1) {
                    n.field_L = n.field_L / 2;
                    break L58;
                  } else {
                    break L58;
                  }
                }
                if (n.field_L <= 0) {
                  break L15;
                } else {
                  n.field_L = n.field_L - 1;
                  break L15;
                }
              }
            }
            L59: {
              if (null == na.field_j) {
                break L59;
              } else {
                if (s.field_i) {
                  L60: while (true) {
                    L61: {
                      L62: {
                        L63: {
                          if (!qh.c(103)) {
                            break L63;
                          } else {
                            stackOut_238_0 = gi.field_f;
                            stackOut_238_1 = 13;
                            stackIn_270_0 = stackOut_238_0;
                            stackIn_270_1 = stackOut_238_1;
                            stackIn_239_0 = stackOut_238_0;
                            stackIn_239_1 = stackOut_238_1;
                            if (var15 != 0) {
                              break L62;
                            } else {
                              L64: {
                                if (stackIn_239_0 != stackIn_239_1) {
                                  break L64;
                                } else {
                                  if (tl.field_c != 0) {
                                    break L64;
                                  } else {
                                    na.field_j = null;
                                    break L64;
                                  }
                                }
                              }
                              L65: {
                                if (na.field_j == null) {
                                  break L65;
                                } else {
                                  if (gi.field_f != 13) {
                                    break L65;
                                  } else {
                                    L66: {
                                      if (tl.field_c == 2) {
                                        break L66;
                                      } else {
                                        if (tl.field_c == 1) {
                                          break L66;
                                        } else {
                                          if (tl.field_c != 3) {
                                            break L65;
                                          } else {
                                            break L66;
                                          }
                                        }
                                      }
                                    }
                                    n.field_L = 256;
                                    tl.field_c = 0;
                                    gh.field_d = null;
                                    if (var15 == 0) {
                                      continue L60;
                                    } else {
                                      break L65;
                                    }
                                  }
                                }
                              }
                              if (null != na.field_j) {
                                na.field_j.b(8);
                                if (var15 == 0) {
                                  continue L60;
                                } else {
                                  break L63;
                                }
                              } else {
                                continue L60;
                              }
                            }
                          }
                        }
                        if (na.field_j == null) {
                          break L61;
                        } else {
                          stackOut_268_0 = -4;
                          stackOut_268_1 = ~tl.field_c;
                          stackIn_270_0 = stackOut_268_0;
                          stackIn_270_1 = stackOut_268_1;
                          break L62;
                        }
                      }
                      L67: {
                        if (stackIn_270_0 == stackIn_270_1) {
                          break L67;
                        } else {
                          break L67;
                        }
                      }
                      L68: {
                        if (tl.field_c == 2) {
                          break L68;
                        } else {
                          break L68;
                        }
                      }
                      L69: {
                        if (tl.field_c == 1) {
                          break L69;
                        } else {
                          break L69;
                        }
                      }
                      na.field_j.a(true);
                      break L61;
                    }
                    return;
                  }
                } else {
                  break L59;
                }
              }
            }
            L70: {
              if (0 < ig.field_D) {
                ig.field_D = ig.field_D - 6;
                break L70;
              } else {
                break L70;
              }
            }
            L71: {
              if (0 != wh.field_c) {
                break L71;
              } else {
                jg.field_pb = jg.field_pb - 8;
                if (jg.field_pb > 0) {
                  break L71;
                } else {
                  wh.field_c = 1;
                  jg.field_pb = 0;
                  if (!fe.field_e) {
                    break L71;
                  } else {
                    ll.field_c.a(sb.field_e[36], 100, pk.field_h * 2);
                    break L71;
                  }
                }
              }
            }
            L72: {
              if (wh.field_c != 1) {
                break L72;
              } else {
                jg.field_pb = jg.field_pb + 1;
                if (jg.field_pb >= 36) {
                  jg.field_pb = 0;
                  wh.field_c = 2;
                  break L72;
                } else {
                  break L72;
                }
              }
            }
            L73: {
              if (2 == wh.field_c) {
                jg.field_pb = jg.field_pb + 1;
                if (jg.field_pb < 30) {
                  break L73;
                } else {
                  wh.field_c = 3;
                  jg.field_pb = 0;
                  break L73;
                }
              } else {
                break L73;
              }
            }
            L74: {
              if (wh.field_c == 3) {
                L75: {
                  jg.field_pb = jg.field_pb + 1;
                  if (1 == jg.field_pb) {
                    if (!fe.field_e) {
                      break L75;
                    } else {
                      if (s.field_i) {
                        break L75;
                      } else {
                        ll.field_c.a(sb.field_e[37], 100, pk.field_h * 2);
                        break L75;
                      }
                    }
                  } else {
                    break L75;
                  }
                }
                if (jg.field_pb <= 250) {
                  break L74;
                } else {
                  jg.field_pb = 0;
                  wh.field_c = 2;
                  break L74;
                }
              } else {
                break L74;
              }
            }
            L76: {
              if (~al.field_c == ~ke.field_a) {
                break L76;
              } else {
                kg.field_D = kg.field_D - 1;
                if (kg.field_D <= 0) {
                  kg.field_D = 255;
                  ke.field_a = al.field_c;
                  break L76;
                } else {
                  break L76;
                }
              }
            }
            L77: {
              al.field_c = qi.field_a % 7 * 6912 + qi.field_a % 10 * 19 + 851968 * (qi.field_a % 14);
              if (s.field_i) {
                break L77;
              } else {
                al.field_c = 858899;
                break L77;
              }
            }
            L78: {
              if (nc.field_H == 1) {
                L79: {
                  if (a.field_h[0].field_g < 1) {
                    a.field_h[0].field_g = a.field_h[0].field_g + 1;
                    gh.field_b = gh.field_b - 1;
                    break L79;
                  } else {
                    break L79;
                  }
                }
                if (0 >= gh.field_b) {
                  nc.field_H = 0;
                  break L78;
                } else {
                  break L78;
                }
              } else {
                break L78;
              }
            }
            L80: {
              if (nc.field_H == 2) {
                gh.field_b = gh.field_b - 1;
                if (0 >= gh.field_b) {
                  gh.field_b = 5;
                  nc.field_H = 1;
                  break L80;
                } else {
                  break L80;
                }
              } else {
                break L80;
              }
            }
            L81: {
              if (nc.field_H != 3) {
                break L81;
              } else {
                gh.field_b = gh.field_b - 1;
                if (gh.field_b > 0) {
                  break L81;
                } else {
                  gh.field_b = 5;
                  nc.field_H = 1;
                  break L81;
                }
              }
            }
            L82: {
              if (96 <= tc.field_r) {
                break L82;
              } else {
                tc.field_r = tc.field_r + 1;
                break L82;
              }
            }
            L83: {
              if (nc.field_H != 4) {
                break L83;
              } else {
                gh.field_b = gh.field_b - 1;
                if (0 < gh.field_b) {
                  break L83;
                } else {
                  gh.field_b = 5;
                  nc.field_H = 1;
                  break L83;
                }
              }
            }
            L84: {
              L85: {
                if (null == a.field_h[0]) {
                  break L85;
                } else {
                  if (a.field_h[0].field_m == -1) {
                    break L84;
                  } else {
                    break L85;
                  }
                }
              }
              L86: {
                stackOut_363_0 = 0;
                stackIn_368_0 = stackOut_363_0;
                stackIn_364_0 = stackOut_363_0;
                if (s.field_i) {
                  stackOut_368_0 = stackIn_368_0;
                  stackOut_368_1 = 0;
                  stackIn_369_0 = stackOut_368_0;
                  stackIn_369_1 = stackOut_368_1;
                  break L86;
                } else {
                  stackOut_364_0 = stackIn_364_0;
                  stackIn_366_0 = stackOut_364_0;
                  stackOut_366_0 = stackIn_366_0;
                  stackOut_366_1 = 1;
                  stackIn_369_0 = stackOut_366_0;
                  stackIn_369_1 = stackOut_366_1;
                  break L86;
                }
              }
              if (stackIn_369_0 != stackIn_369_1) {
                break L84;
              } else {
                this.k((byte) -69);
                break L84;
              }
            }
            L87: {
              L88: {
                L89: {
                  L90: {
                    L91: {
                      if (s.field_i) {
                        L92: {
                          L93: {
                            L94: {
                              L95: {
                                L96: {
                                  L97: {
                                    if (si.field_jb[98]) {
                                      break L97;
                                    } else {
                                      if (4 != nc.field_H) {
                                        break L96;
                                      } else {
                                        break L97;
                                      }
                                    }
                                  }
                                  if (a.field_h[0].field_g > 0) {
                                    break L95;
                                  } else {
                                    break L96;
                                  }
                                }
                                if (!si.field_jb[99]) {
                                  break L94;
                                } else {
                                  if (0 < a.field_h[0].field_g) {
                                    L98: {
                                      a.field_h[0].field_k = a.field_h[0].field_k + 0.05 * Math.cos(2.0 * ((double)a.field_h[0].field_h * 3.141592653589793) / 256.0);
                                      a.field_h[0].field_d = a.field_h[0].field_d + 0.05 * Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                                      if (!fe.field_e) {
                                        break L98;
                                      } else {
                                        if (og.field_a <= 0) {
                                          ll.field_c.a(sb.field_e[0], 100, pk.field_h / 4);
                                          og.field_a = 5;
                                          break L98;
                                        } else {
                                          break L98;
                                        }
                                      }
                                    }
                                    var2_int = 3;
                                    var3 = 5;
                                    var5 = 0;
                                    L99: while (true) {
                                      L100: {
                                        L101: {
                                          if (~var2_int >= ~var5) {
                                            break L101;
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
                                            if (var15 != 0) {
                                              break L100;
                                            } else {
                                              if (var15 == 0) {
                                                continue L99;
                                              } else {
                                                break L101;
                                              }
                                            }
                                          }
                                        }
                                        var5 = 0;
                                        break L100;
                                      }
                                      L102: while (true) {
                                        L103: {
                                          if (~var2_int >= ~var5) {
                                            break L103;
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
                                            if (var15 != 0) {
                                              break L94;
                                            } else {
                                              if (var15 == 0) {
                                                continue L102;
                                              } else {
                                                break L103;
                                              }
                                            }
                                          }
                                        }
                                        if (var15 == 0) {
                                          break L94;
                                        } else {
                                          break L95;
                                        }
                                      }
                                    }
                                  } else {
                                    break L94;
                                  }
                                }
                              }
                              L104: {
                                stackOut_410_0 = a.field_h[0];
                                stackOut_410_1 = a.field_h[0].field_k;
                                stackOut_410_2 = Math.cos(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                                stackIn_415_0 = stackOut_410_0;
                                stackIn_415_1 = stackOut_410_1;
                                stackIn_415_2 = stackOut_410_2;
                                stackIn_411_0 = stackOut_410_0;
                                stackIn_411_1 = stackOut_410_1;
                                stackIn_411_2 = stackOut_410_2;
                                if (8 != e.field_e) {
                                  stackOut_415_0 = (qe) (Object) stackIn_415_0;
                                  stackOut_415_1 = stackIn_415_1;
                                  stackOut_415_2 = stackIn_415_2;
                                  stackOut_415_3 = 0.1;
                                  stackIn_416_0 = stackOut_415_0;
                                  stackIn_416_1 = stackOut_415_1;
                                  stackIn_416_2 = stackOut_415_2;
                                  stackIn_416_3 = stackOut_415_3;
                                  break L104;
                                } else {
                                  stackOut_411_0 = (qe) (Object) stackIn_411_0;
                                  stackOut_411_1 = stackIn_411_1;
                                  stackOut_411_2 = stackIn_411_2;
                                  stackIn_413_0 = stackOut_411_0;
                                  stackIn_413_1 = stackOut_411_1;
                                  stackIn_413_2 = stackOut_411_2;
                                  stackOut_413_0 = (qe) (Object) stackIn_413_0;
                                  stackOut_413_1 = stackIn_413_1;
                                  stackOut_413_2 = stackIn_413_2;
                                  stackOut_413_3 = 0.15;
                                  stackIn_416_0 = stackOut_413_0;
                                  stackIn_416_1 = stackOut_413_1;
                                  stackIn_416_2 = stackOut_413_2;
                                  stackIn_416_3 = stackOut_413_3;
                                  break L104;
                                }
                              }
                              L105: {
                                stackIn_416_0.field_k = stackIn_416_1 - stackIn_416_2 * stackIn_416_3;
                                stackOut_416_0 = a.field_h[0];
                                stackOut_416_1 = a.field_h[0].field_d;
                                stackOut_416_2 = Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                                stackIn_419_0 = stackOut_416_0;
                                stackIn_419_1 = stackOut_416_1;
                                stackIn_419_2 = stackOut_416_2;
                                stackIn_417_0 = stackOut_416_0;
                                stackIn_417_1 = stackOut_416_1;
                                stackIn_417_2 = stackOut_416_2;
                                if (e.field_e == 8) {
                                  stackOut_419_0 = (qe) (Object) stackIn_419_0;
                                  stackOut_419_1 = stackIn_419_1;
                                  stackOut_419_2 = stackIn_419_2;
                                  stackOut_419_3 = 0.15;
                                  stackIn_420_0 = stackOut_419_0;
                                  stackIn_420_1 = stackOut_419_1;
                                  stackIn_420_2 = stackOut_419_2;
                                  stackIn_420_3 = stackOut_419_3;
                                  break L105;
                                } else {
                                  stackOut_417_0 = (qe) (Object) stackIn_417_0;
                                  stackOut_417_1 = stackIn_417_1;
                                  stackOut_417_2 = stackIn_417_2;
                                  stackOut_417_3 = 0.1;
                                  stackIn_420_0 = stackOut_417_0;
                                  stackIn_420_1 = stackOut_417_1;
                                  stackIn_420_2 = stackOut_417_2;
                                  stackIn_420_3 = stackOut_417_3;
                                  break L105;
                                }
                              }
                              L106: {
                                stackIn_420_0.field_d = stackIn_420_1 - stackIn_420_2 * stackIn_420_3;
                                if (nc.field_H != 4) {
                                  break L106;
                                } else {
                                  a.field_h[0].field_k = a.field_h[0].field_k - 0.1 * Math.cos(3.141592653589793 * (double)a.field_h[0].field_h * 2.0 / 256.0);
                                  a.field_h[0].field_d = a.field_h[0].field_d - 0.1 * Math.sin((double)a.field_h[0].field_h * 3.141592653589793 * 2.0 / 256.0);
                                  if (!fe.field_e) {
                                    break L106;
                                  } else {
                                    if (og.field_a > 0) {
                                      break L106;
                                    } else {
                                      ll.field_c.a(sb.field_e[35], 100, pk.field_h / 2);
                                      og.field_a = 7;
                                      break L106;
                                    }
                                  }
                                }
                              }
                              L107: {
                                var2_int = 3;
                                var3 = 5;
                                if (nc.field_H == 4) {
                                  var3 = 10;
                                  var2_int = 6;
                                  break L107;
                                } else {
                                  break L107;
                                }
                              }
                              var5 = 0;
                              L108: while (true) {
                                L109: {
                                  if (var5 >= var2_int) {
                                    break L109;
                                  } else {
                                    if (var15 != 0) {
                                      break L94;
                                    } else {
                                      L110: {
                                        stackOut_436_0 = null;
                                        stackOut_436_1 = null;
                                        stackIn_440_0 = stackOut_436_0;
                                        stackIn_440_1 = stackOut_436_1;
                                        stackIn_437_0 = stackOut_436_0;
                                        stackIn_437_1 = stackOut_436_1;
                                        if (nc.field_H != 4) {
                                          stackOut_440_0 = null;
                                          stackOut_440_1 = null;
                                          stackOut_440_2 = 1;
                                          stackIn_441_0 = stackOut_440_0;
                                          stackIn_441_1 = stackOut_440_1;
                                          stackIn_441_2 = stackOut_440_2;
                                          break L110;
                                        } else {
                                          stackOut_437_0 = null;
                                          stackOut_437_1 = null;
                                          stackIn_439_0 = stackOut_437_0;
                                          stackIn_439_1 = stackOut_437_1;
                                          stackOut_439_0 = null;
                                          stackOut_439_1 = null;
                                          stackOut_439_2 = 4;
                                          stackIn_441_0 = stackOut_439_0;
                                          stackIn_441_1 = stackOut_439_1;
                                          stackIn_441_2 = stackOut_439_2;
                                          break L110;
                                        }
                                      }
                                      L111: {
                                        var4_ref_vl = new vl(stackIn_441_2, a.field_h[0]);
                                        var4_ref_vl.field_q = 16711680;
                                        if (nc.field_H == 4) {
                                          var4_ref_vl.field_q = 16776960;
                                          var4_ref_vl.field_p = 10;
                                          break L111;
                                        } else {
                                          break L111;
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
                                      if (var15 == 0) {
                                        continue L108;
                                      } else {
                                        break L109;
                                      }
                                    }
                                  }
                                }
                                if (4 != nc.field_H) {
                                  break L94;
                                } else {
                                  var5 = 4 * (gh.field_b % 8);
                                  L112: while (true) {
                                    if (var5 >= 256) {
                                      break L94;
                                    } else {
                                      if (var15 != 0) {
                                        break L93;
                                      } else {
                                        L113: {
                                          stackOut_450_0 = null;
                                          stackOut_450_1 = null;
                                          stackIn_454_0 = stackOut_450_0;
                                          stackIn_454_1 = stackOut_450_1;
                                          stackIn_451_0 = stackOut_450_0;
                                          stackIn_451_1 = stackOut_450_1;
                                          if (nc.field_H == 4) {
                                            stackOut_454_0 = null;
                                            stackOut_454_1 = null;
                                            stackOut_454_2 = 4;
                                            stackIn_455_0 = stackOut_454_0;
                                            stackIn_455_1 = stackOut_454_1;
                                            stackIn_455_2 = stackOut_454_2;
                                            break L113;
                                          } else {
                                            stackOut_451_0 = null;
                                            stackOut_451_1 = null;
                                            stackIn_453_0 = stackOut_451_0;
                                            stackIn_453_1 = stackOut_451_1;
                                            stackOut_453_0 = null;
                                            stackOut_453_1 = null;
                                            stackOut_453_2 = 1;
                                            stackIn_455_0 = stackOut_453_0;
                                            stackIn_455_1 = stackOut_453_1;
                                            stackIn_455_2 = stackOut_453_2;
                                            break L113;
                                          }
                                        }
                                        L114: {
                                          var4_ref_vl = new vl(stackIn_455_2, a.field_h[0]);
                                          var4_ref_vl.field_q = 16711680;
                                          if (nc.field_H != 4) {
                                            break L114;
                                          } else {
                                            var4_ref_vl.field_p = 10;
                                            var4_ref_vl.field_q = 16776960;
                                            break L114;
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
                                        if (var15 == 0) {
                                          continue L112;
                                        } else {
                                          break L94;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (si.field_jb[98]) {
                              break L93;
                            } else {
                              if (si.field_jb[99]) {
                                break L93;
                              } else {
                                if (0 >= a.field_h[0].field_g) {
                                  break L93;
                                } else {
                                  a.field_h[0].field_d = a.field_h[0].field_d * 0.99;
                                  a.field_h[0].field_k = a.field_h[0].field_k * 0.99;
                                  if (gj.field_r == null) {
                                    break L92;
                                  } else {
                                    if (0 > og.field_a) {
                                      break L92;
                                    } else {
                                      og.field_a = -1;
                                      gj.field_r.b(25, 0);
                                      if (var15 == 0) {
                                        break L92;
                                      } else {
                                        break L93;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L115: {
                            if (null == gj.field_r) {
                              break L115;
                            } else {
                              if (0 < og.field_a) {
                                break L92;
                              } else {
                                L116: {
                                  og.field_a = 10;
                                  stackOut_479_0 = gj.field_r;
                                  stackOut_479_1 = 10;
                                  stackIn_484_0 = stackOut_479_0;
                                  stackIn_484_1 = stackOut_479_1;
                                  stackIn_480_0 = stackOut_479_0;
                                  stackIn_480_1 = stackOut_479_1;
                                  if (fe.field_e) {
                                    stackOut_484_0 = (gd) (Object) stackIn_484_0;
                                    stackOut_484_1 = stackIn_484_1;
                                    stackOut_484_2 = pk.field_h / 2;
                                    stackIn_485_0 = stackOut_484_0;
                                    stackIn_485_1 = stackOut_484_1;
                                    stackIn_485_2 = stackOut_484_2;
                                    break L116;
                                  } else {
                                    stackOut_480_0 = (gd) (Object) stackIn_480_0;
                                    stackOut_480_1 = stackIn_480_1;
                                    stackIn_482_0 = stackOut_480_0;
                                    stackIn_482_1 = stackOut_480_1;
                                    stackOut_482_0 = (gd) (Object) stackIn_482_0;
                                    stackOut_482_1 = stackIn_482_1;
                                    stackOut_482_2 = 0;
                                    stackIn_485_0 = stackOut_482_0;
                                    stackIn_485_1 = stackOut_482_1;
                                    stackIn_485_2 = stackOut_482_2;
                                    break L116;
                                  }
                                }
                                ((gd) (Object) stackIn_485_0).b(stackIn_485_1, stackIn_485_2);
                                if (var15 == 0) {
                                  break L92;
                                } else {
                                  break L115;
                                }
                              }
                            }
                          }
                          L117: {
                            gj.field_r = gd.a(sb.field_e[0], 100, 0);
                            gj.field_r.e(-1);
                            ll.field_c.a((kd) (Object) gj.field_r);
                            stackOut_486_0 = gj.field_r;
                            stackOut_486_1 = 10;
                            stackIn_491_0 = stackOut_486_0;
                            stackIn_491_1 = stackOut_486_1;
                            stackIn_487_0 = stackOut_486_0;
                            stackIn_487_1 = stackOut_486_1;
                            if (fe.field_e) {
                              stackOut_491_0 = (gd) (Object) stackIn_491_0;
                              stackOut_491_1 = stackIn_491_1;
                              stackOut_491_2 = pk.field_h / 2;
                              stackIn_492_0 = stackOut_491_0;
                              stackIn_492_1 = stackOut_491_1;
                              stackIn_492_2 = stackOut_491_2;
                              break L117;
                            } else {
                              stackOut_487_0 = (gd) (Object) stackIn_487_0;
                              stackOut_487_1 = stackIn_487_1;
                              stackIn_489_0 = stackOut_487_0;
                              stackIn_489_1 = stackOut_487_1;
                              stackOut_489_0 = (gd) (Object) stackIn_489_0;
                              stackOut_489_1 = stackIn_489_1;
                              stackOut_489_2 = 0;
                              stackIn_492_0 = stackOut_489_0;
                              stackIn_492_1 = stackOut_489_1;
                              stackIn_492_2 = stackOut_489_2;
                              break L117;
                            }
                          }
                          ((gd) (Object) stackIn_492_0).b(stackIn_492_1, stackIn_492_2);
                          break L92;
                        }
                        L118: {
                          L119: {
                            a.field_h[0].field_k = a.field_h[0].field_k * 0.99;
                            if (!si.field_jb[97]) {
                              break L119;
                            } else {
                              if (a.field_h[0].field_g <= 0) {
                                break L119;
                              } else {
                                L120: {
                                  if (8 != e.field_e) {
                                    stackOut_502_0 = -75;
                                    stackIn_503_0 = stackOut_502_0;
                                    break L120;
                                  } else {
                                    stackOut_500_0 = -150;
                                    stackIn_503_0 = stackOut_500_0;
                                    break L120;
                                  }
                                }
                                L121: {
                                  var2_int = stackIn_503_0;
                                  if (((stellarshard) this).field_M > var2_int / 3) {
                                    ((stellarshard) this).field_M = var2_int / 3;
                                    break L121;
                                  } else {
                                    break L121;
                                  }
                                }
                                L122: {
                                  if (var2_int >= ((stellarshard) this).field_M) {
                                    break L122;
                                  } else {
                                    ((stellarshard) this).field_M = ((stellarshard) this).field_M - 6;
                                    break L122;
                                  }
                                }
                                if (var15 == 0) {
                                  break L118;
                                } else {
                                  break L119;
                                }
                              }
                            }
                          }
                          if (((stellarshard) this).field_M >= 0) {
                            break L118;
                          } else {
                            ((stellarshard) this).field_M = ((stellarshard) this).field_M + 5;
                            if (0 >= ((stellarshard) this).field_M) {
                              break L118;
                            } else {
                              ((stellarshard) this).field_M = 0;
                              break L118;
                            }
                          }
                        }
                        L123: {
                          L124: {
                            a.field_h[0].field_d = a.field_h[0].field_d * 0.99;
                            if (!si.field_jb[96]) {
                              break L124;
                            } else {
                              if (a.field_h[0].field_g <= 0) {
                                break L124;
                              } else {
                                L125: {
                                  if (e.field_e != 8) {
                                    stackOut_528_0 = 75;
                                    stackIn_529_0 = stackOut_528_0;
                                    break L125;
                                  } else {
                                    stackOut_526_0 = 150;
                                    stackIn_529_0 = stackOut_526_0;
                                    break L125;
                                  }
                                }
                                L126: {
                                  var2_int = stackIn_529_0;
                                  if (~(var2_int / 3) >= ~((stellarshard) this).field_M) {
                                    break L126;
                                  } else {
                                    ((stellarshard) this).field_M = var2_int / 3;
                                    break L126;
                                  }
                                }
                                L127: {
                                  if (((stellarshard) this).field_M >= var2_int) {
                                    break L127;
                                  } else {
                                    ((stellarshard) this).field_M = ((stellarshard) this).field_M + 6;
                                    break L127;
                                  }
                                }
                                if (var15 == 0) {
                                  break L123;
                                } else {
                                  break L124;
                                }
                              }
                            }
                          }
                          if (((stellarshard) this).field_M > 0) {
                            ((stellarshard) this).field_M = ((stellarshard) this).field_M - 5;
                            if (((stellarshard) this).field_M >= 0) {
                              break L123;
                            } else {
                              ((stellarshard) this).field_M = 0;
                              break L123;
                            }
                          } else {
                            break L123;
                          }
                        }
                        L128: {
                          a.field_h[0].field_j = ((stellarshard) this).field_M;
                          if (si.field_jb[83]) {
                            break L128;
                          } else {
                            if (si.field_jb[82]) {
                              break L128;
                            } else {
                              if (10 != e.field_e) {
                                break L91;
                              } else {
                                if (a.field_h[0].field_i >= 0) {
                                  break L91;
                                } else {
                                  break L128;
                                }
                              }
                            }
                          }
                        }
                        if (0 < a.field_h[0].field_g) {
                          L129: {
                            L130: {
                              L131: {
                                L132: {
                                  L133: {
                                    L134: {
                                      L135: {
                                        L136: {
                                          L137: {
                                            L138: {
                                              L139: {
                                                L140: {
                                                  L141: {
                                                    var2_int = e.field_e;
                                                    if (var2_int == -1) {
                                                      break L141;
                                                    } else {
                                                      if (var2_int == 0) {
                                                        break L140;
                                                      } else {
                                                        L142: {
                                                          if (var2_int != 1) {
                                                            break L142;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L139;
                                                            } else {
                                                              break L142;
                                                            }
                                                          }
                                                        }
                                                        if (2 == var2_int) {
                                                          break L138;
                                                        } else {
                                                          L143: {
                                                            if (3 != var2_int) {
                                                              break L143;
                                                            } else {
                                                              if (var15 == 0) {
                                                                break L137;
                                                              } else {
                                                                break L143;
                                                              }
                                                            }
                                                          }
                                                          if (4 == var2_int) {
                                                            break L136;
                                                          } else {
                                                            if (var2_int == 5) {
                                                              break L135;
                                                            } else {
                                                              if (var2_int == 6) {
                                                                break L134;
                                                              } else {
                                                                if (var2_int == 7) {
                                                                  break L133;
                                                                } else {
                                                                  L144: {
                                                                    if (var2_int != 8) {
                                                                      break L144;
                                                                    } else {
                                                                      if (var15 == 0) {
                                                                        break L132;
                                                                      } else {
                                                                        break L144;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (var2_int == 9) {
                                                                    break L131;
                                                                  } else {
                                                                    if (var2_int != 10) {
                                                                      break L129;
                                                                    } else {
                                                                      if (var15 == 0) {
                                                                        break L130;
                                                                      } else {
                                                                        break L141;
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
                                                  if (!fe.field_e) {
                                                    break L129;
                                                  } else {
                                                    if (a.field_h[0].field_i > 0) {
                                                      break L129;
                                                    } else {
                                                      ll.field_c.a(sb.field_e[27], 100, 2 * pk.field_h);
                                                      if (var15 == 0) {
                                                        break L129;
                                                      } else {
                                                        break L140;
                                                      }
                                                    }
                                                  }
                                                }
                                                if (!fe.field_e) {
                                                  break L129;
                                                } else {
                                                  if (0 < a.field_h[0].field_i) {
                                                    break L129;
                                                  } else {
                                                    ll.field_c.a(sb.field_e[38], 100, pk.field_h * 2);
                                                    if (var15 == 0) {
                                                      break L129;
                                                    } else {
                                                      break L139;
                                                    }
                                                  }
                                                }
                                              }
                                              if (!fe.field_e) {
                                                break L129;
                                              } else {
                                                if (a.field_h[0].field_i <= 0) {
                                                  ll.field_c.a(sb.field_e[33], 100, pk.field_h * 2);
                                                  if (var15 == 0) {
                                                    break L129;
                                                  } else {
                                                    break L138;
                                                  }
                                                } else {
                                                  break L129;
                                                }
                                              }
                                            }
                                            if (!fe.field_e) {
                                              break L129;
                                            } else {
                                              if (a.field_h[0].field_i > 0) {
                                                break L129;
                                              } else {
                                                ll.field_c.a(sb.field_e[1], 100, pk.field_h * 2);
                                                if (var15 == 0) {
                                                  break L129;
                                                } else {
                                                  break L137;
                                                }
                                              }
                                            }
                                          }
                                          if (!fe.field_e) {
                                            break L129;
                                          } else {
                                            if (a.field_h[0].field_i <= 0) {
                                              ll.field_c.a(sb.field_e[21], 100, 2 * pk.field_h);
                                              if (var15 == 0) {
                                                break L129;
                                              } else {
                                                break L136;
                                              }
                                            } else {
                                              break L129;
                                            }
                                          }
                                        }
                                        if (!fe.field_e) {
                                          break L129;
                                        } else {
                                          if (0 >= af.field_o) {
                                            ll.field_c.a(sb.field_e[24], 100, 2 * pk.field_h);
                                            af.field_o = 3;
                                            if (var15 == 0) {
                                              break L129;
                                            } else {
                                              break L135;
                                            }
                                          } else {
                                            break L129;
                                          }
                                        }
                                      }
                                      if (!fe.field_e) {
                                        break L129;
                                      } else {
                                        if (0 < a.field_h[0].field_i) {
                                          break L129;
                                        } else {
                                          ll.field_c.a(sb.field_e[39], 100, pk.field_h * 2);
                                          if (var15 == 0) {
                                            break L129;
                                          } else {
                                            break L134;
                                          }
                                        }
                                      }
                                    }
                                    if (!fe.field_e) {
                                      break L129;
                                    } else {
                                      if (a.field_h[0].field_i > 0) {
                                        break L129;
                                      } else {
                                        ll.field_c.a(sb.field_e[22], 100, 2 * pk.field_h);
                                        if (var15 == 0) {
                                          break L129;
                                        } else {
                                          break L133;
                                        }
                                      }
                                    }
                                  }
                                  if (!fe.field_e) {
                                    break L129;
                                  } else {
                                    if (a.field_h[0].field_i > 0) {
                                      break L129;
                                    } else {
                                      ll.field_c.a(sb.field_e[34], 100, 2 * pk.field_h);
                                      if (var15 == 0) {
                                        break L129;
                                      } else {
                                        break L132;
                                      }
                                    }
                                  }
                                }
                                if (!fe.field_e) {
                                  break L129;
                                } else {
                                  if (af.field_o <= 0) {
                                    ll.field_c.a(sb.field_e[20], 100, pk.field_h * 2);
                                    af.field_o = (int)(Math.random() * 10.0) + 15;
                                    if (var15 == 0) {
                                      break L129;
                                    } else {
                                      break L131;
                                    }
                                  } else {
                                    break L129;
                                  }
                                }
                              }
                              if (!fe.field_e) {
                                break L129;
                              } else {
                                if (af.field_o <= 0) {
                                  ll.field_c.a(sb.field_e[7], 100, 2 * pk.field_h);
                                  af.field_o = 5;
                                  if (var15 == 0) {
                                    break L129;
                                  } else {
                                    break L130;
                                  }
                                } else {
                                  break L129;
                                }
                              }
                            }
                            if (!fe.field_e) {
                              break L129;
                            } else {
                              if (a.field_h[0].field_i != -1) {
                                break L129;
                              } else {
                                ll.field_c.a(sb.field_e[25], 100, pk.field_h * 2);
                                break L129;
                              }
                            }
                          }
                          if (a.field_h[0].field_i > 0) {
                            break L91;
                          } else {
                            L145: {
                              L146: {
                                var4 = e.field_e;
                                if (var4 != -1) {
                                  break L146;
                                } else {
                                  if (var15 == 0) {
                                    break L145;
                                  } else {
                                    break L146;
                                  }
                                }
                              }
                              L147: {
                                if (var4 == 0) {
                                  L148: {
                                    int fieldTemp$12 = mj.field_F + 1;
                                    mj.field_F = mj.field_F + 1;
                                    if (fieldTemp$12 <= 1) {
                                      break L148;
                                    } else {
                                      mj.field_F = 0;
                                      break L148;
                                    }
                                  }
                                  a.field_h[0].field_i = 10;
                                  var4 = -4;
                                  L149: while (true) {
                                    L150: {
                                      if (var4 > 4) {
                                        break L150;
                                      } else {
                                        var2_ref2 = new vl(0, a.field_h[0]);
                                        var2_ref2.field_j = var2_ref2.field_j - Math.sin(2.0 * ((double)(a.field_h[0].field_h - -var4) * 3.141592653589793) / 256.0) * 8.0;
                                        var2_ref2.field_a = var2_ref2.field_a - Math.cos(3.141592653589793 * (double)(var4 + a.field_h[0].field_h) * 2.0 / 256.0) * 8.0;
                                        var2_ref2.field_k = -((double)var4 * var2_ref2.field_j / 4.0) + (a.field_h[0].field_l + 2.0 * var2_ref2.field_a);
                                        var2_ref2.field_c = var2_ref2.field_a * (double)var4 / 4.0 + (a.field_h[0].field_a + 2.0 * var2_ref2.field_j);
                                        var2_ref2.field_q = 255;
                                        var2_ref2.field_a = var2_ref2.field_a + a.field_h[0].field_k;
                                        var2_ref2.field_n = e.field_e;
                                        var2_ref2.field_p = 2;
                                        var2_ref2.field_j = var2_ref2.field_j + a.field_h[0].field_d;
                                        stackOut_792_0 = ~var4;
                                        stackOut_792_1 = -1;
                                        stackIn_993_0 = stackOut_792_0;
                                        stackIn_993_1 = stackOut_792_1;
                                        stackIn_793_0 = stackOut_792_0;
                                        stackIn_793_1 = stackOut_792_1;
                                        if (var15 != 0) {
                                          break L147;
                                        } else {
                                          L151: {
                                            L152: {
                                              L153: {
                                                if (stackIn_793_0 != stackIn_793_1) {
                                                  break L153;
                                                } else {
                                                  if (mj.field_F == 0) {
                                                    break L152;
                                                  } else {
                                                    break L153;
                                                  }
                                                }
                                              }
                                              if (var4 == 0) {
                                                break L151;
                                              } else {
                                                if (1 != mj.field_F) {
                                                  break L151;
                                                } else {
                                                  break L152;
                                                }
                                              }
                                            }
                                            var2_ref2.field_q = 8421631;
                                            break L151;
                                          }
                                          wk.field_b[eg.a(-109)] = var2_ref2;
                                          var4 += 4;
                                          if (var15 == 0) {
                                            continue L149;
                                          } else {
                                            break L150;
                                          }
                                        }
                                      }
                                    }
                                    break L91;
                                  }
                                } else {
                                  if (var4 == 1) {
                                    L154: {
                                      int fieldTemp$13 = mj.field_F + 1;
                                      mj.field_F = mj.field_F + 1;
                                      if (fieldTemp$13 > 1) {
                                        mj.field_F = 0;
                                        break L154;
                                      } else {
                                        break L154;
                                      }
                                    }
                                    a.field_h[0].field_i = 5;
                                    var4 = -3;
                                    L155: while (true) {
                                      L156: {
                                        if (var4 > 3) {
                                          break L156;
                                        } else {
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
                                          stackOut_815_0 = ~Math.abs(var4);
                                          stackOut_815_1 = -2;
                                          stackIn_993_0 = stackOut_815_0;
                                          stackIn_993_1 = stackOut_815_1;
                                          stackIn_816_0 = stackOut_815_0;
                                          stackIn_816_1 = stackOut_815_1;
                                          if (var15 != 0) {
                                            break L147;
                                          } else {
                                            L157: {
                                              L158: {
                                                L159: {
                                                  if (stackIn_816_0 < stackIn_816_1) {
                                                    break L159;
                                                  } else {
                                                    if (mj.field_F == 0) {
                                                      break L158;
                                                    } else {
                                                      break L159;
                                                    }
                                                  }
                                                }
                                                if (Math.abs(var4) <= 1) {
                                                  break L157;
                                                } else {
                                                  if (mj.field_F == 1) {
                                                    break L158;
                                                  } else {
                                                    break L157;
                                                  }
                                                }
                                              }
                                              var2_ref2.field_q = 16760896;
                                              break L157;
                                            }
                                            var4 += 2;
                                            if (var15 == 0) {
                                              continue L155;
                                            } else {
                                              break L156;
                                            }
                                          }
                                        }
                                      }
                                      break L91;
                                    }
                                  } else {
                                    L160: {
                                      if (var4 != 2) {
                                        break L160;
                                      } else {
                                        if (var15 == 0) {
                                          L161: {
                                            a.field_h[0].field_i = 6;
                                            int fieldTemp$14 = mj.field_F + 1;
                                            mj.field_F = mj.field_F + 1;
                                            if (fieldTemp$14 <= 3) {
                                              break L161;
                                            } else {
                                              mj.field_F = 0;
                                              break L161;
                                            }
                                          }
                                          var4 = -1;
                                          L162: while (true) {
                                            L163: {
                                              if (var4 > 1) {
                                                break L163;
                                              } else {
                                                var2_ref2 = new vl(0, a.field_h[0]);
                                                stackOut_838_0 = ~var4;
                                                stackIn_981_0 = stackOut_838_0;
                                                stackIn_839_0 = stackOut_838_0;
                                                if (var15 != 0) {
                                                  break L90;
                                                } else {
                                                  L164: {
                                                    if (stackIn_839_0 != 0) {
                                                      break L164;
                                                    } else {
                                                      mj.field_F = 3 - mj.field_F;
                                                      break L164;
                                                    }
                                                  }
                                                  L165: {
                                                    var2_ref2.field_j = var2_ref2.field_j - Math.sin(3.141592653589793 * (double)(a.field_h[0].field_h + 4 * (1 + mj.field_F) * var4) * 2.0 / 256.0) * 6.0;
                                                    var2_ref2.field_a = var2_ref2.field_a - Math.cos((double)(a.field_h[0].field_h + (mj.field_F - -1) * (var4 * 4)) * 3.141592653589793 * 2.0 / 256.0) * 6.0;
                                                    var2_ref2.field_c = var2_ref2.field_j * 3.0 + a.field_h[0].field_a;
                                                    if (var4 == -1) {
                                                      mj.field_F = -mj.field_F + 3;
                                                      break L165;
                                                    } else {
                                                      break L165;
                                                    }
                                                  }
                                                  L166: {
                                                    L167: {
                                                      L168: {
                                                        var2_ref2.field_k = a.field_h[0].field_l + var2_ref2.field_a * 3.0;
                                                        var2_ref2.field_j = var2_ref2.field_j + a.field_h[0].field_d;
                                                        var2_ref2.field_a = var2_ref2.field_a + a.field_h[0].field_k;
                                                        var2_ref2.field_q = 255;
                                                        var2_ref2.field_p = 4;
                                                        var2_ref2.field_n = e.field_e;
                                                        if (var4 != 0) {
                                                          break L168;
                                                        } else {
                                                          if (0 == mj.field_F % 2) {
                                                            break L167;
                                                          } else {
                                                            break L168;
                                                          }
                                                        }
                                                      }
                                                      if (var4 == 0) {
                                                        break L166;
                                                      } else {
                                                        if (mj.field_F % 2 == 1) {
                                                          break L167;
                                                        } else {
                                                          break L166;
                                                        }
                                                      }
                                                    }
                                                    var2_ref2.field_q = 8421631;
                                                    break L166;
                                                  }
                                                  wk.field_b[eg.a(-51)] = var2_ref2;
                                                  var4 += 2;
                                                  if (var15 == 0) {
                                                    continue L162;
                                                  } else {
                                                    break L163;
                                                  }
                                                }
                                              }
                                            }
                                            break L91;
                                          }
                                        } else {
                                          break L160;
                                        }
                                      }
                                    }
                                    L169: {
                                      if (3 != var4) {
                                        break L169;
                                      } else {
                                        if (var15 == 0) {
                                          a.field_h[0].field_i = 10;
                                          var4 = -3;
                                          L170: while (true) {
                                            L171: {
                                              if (var4 > 3) {
                                                break L171;
                                              } else {
                                                var2_ref2 = new vl(0, a.field_h[0]);
                                                var5_double = 5.0;
                                                stackOut_865_0 = ~Math.abs(var4);
                                                stackOut_865_1 = -4;
                                                stackIn_993_0 = stackOut_865_0;
                                                stackIn_993_1 = stackOut_865_1;
                                                stackIn_866_0 = stackOut_865_0;
                                                stackIn_866_1 = stackOut_865_1;
                                                if (var15 != 0) {
                                                  break L147;
                                                } else {
                                                  L172: {
                                                    if (stackIn_866_0 == stackIn_866_1) {
                                                      var5_double = 4.5;
                                                      break L172;
                                                    } else {
                                                      break L172;
                                                    }
                                                  }
                                                  L173: {
                                                    if (2 != Math.abs(var4)) {
                                                      break L173;
                                                    } else {
                                                      var5_double = 4.8;
                                                      break L173;
                                                    }
                                                  }
                                                  L174: {
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
                                                      break L174;
                                                    } else {
                                                      break L174;
                                                    }
                                                  }
                                                  L175: {
                                                    if (Math.abs(var4) == 1) {
                                                      var2_ref2.field_q = 16711680;
                                                      var2_ref2.field_d = 16777088;
                                                      break L175;
                                                    } else {
                                                      break L175;
                                                    }
                                                  }
                                                  L176: {
                                                    if (Math.abs(var4) == 0) {
                                                      var2_ref2.field_q = 16711680;
                                                      var2_ref2.field_d = 16777088;
                                                      break L176;
                                                    } else {
                                                      break L176;
                                                    }
                                                  }
                                                  wk.field_b[eg.a(-67)] = var2_ref2;
                                                  var2_ref2.field_n = e.field_e;
                                                  var2_ref2.field_l = 5;
                                                  var4++;
                                                  if (var15 == 0) {
                                                    continue L170;
                                                  } else {
                                                    break L171;
                                                  }
                                                }
                                              }
                                            }
                                            break L91;
                                          }
                                        } else {
                                          break L169;
                                        }
                                      }
                                    }
                                    L177: {
                                      if (var4 != 4) {
                                        break L177;
                                      } else {
                                        if (var15 == 0) {
                                          L178: {
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
                                              break L178;
                                            } else {
                                              wk.field_b[var4] = var2_ref2;
                                              break L178;
                                            }
                                          }
                                          var2_ref2.field_n = e.field_e;
                                          break L91;
                                        } else {
                                          break L177;
                                        }
                                      }
                                    }
                                    L179: {
                                      if (5 != var4) {
                                        break L179;
                                      } else {
                                        if (var15 == 0) {
                                          a.field_h[0].field_i = 35;
                                          var4 = -30;
                                          L180: while (true) {
                                            L181: {
                                              if (30 < var4) {
                                                break L181;
                                              } else {
                                                var2_ref2 = new vl(0, a.field_h[0]);
                                                var2_ref2.field_j = var2_ref2.field_j - Math.sin(3.141592653589793 * (double)(var4 + a.field_h[0].field_h) * 2.0 / 256.0) * 4.0;
                                                var2_ref2.field_a = var2_ref2.field_a - 4.0 * Math.cos((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0);
                                                var2_ref2.field_c = a.field_h[0].field_a + var2_ref2.field_j * 4.0;
                                                var2_ref2.field_k = a.field_h[0].field_l + 4.0 * var2_ref2.field_a;
                                                var2_ref2.field_j = var2_ref2.field_j + a.field_h[0].field_d;
                                                var2_ref2.field_p = 1;
                                                var2_ref2.field_a = var2_ref2.field_a + a.field_h[0].field_k;
                                                var2_ref2.field_q = 65280 + (Math.abs(var4) * 255 / 30 << 16 & 16771312);
                                                wk.field_b[eg.a(-54)] = var2_ref2;
                                                var2_ref2.field_n = e.field_e;
                                                var4++;
                                                if (var15 != 0) {
                                                  break L91;
                                                } else {
                                                  if (var15 == 0) {
                                                    continue L180;
                                                  } else {
                                                    break L181;
                                                  }
                                                }
                                              }
                                            }
                                            break L91;
                                          }
                                        } else {
                                          break L179;
                                        }
                                      }
                                    }
                                    if (6 == var4) {
                                      a.field_h[0].field_i = 5;
                                      var4 = -10;
                                      L182: while (true) {
                                        L183: {
                                          if (var4 > 10) {
                                            break L183;
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
                                            if (var15 != 0) {
                                              break L91;
                                            } else {
                                              if (var15 == 0) {
                                                continue L182;
                                              } else {
                                                break L183;
                                              }
                                            }
                                          }
                                        }
                                        break L91;
                                      }
                                    } else {
                                      L184: {
                                        if (var4 != 7) {
                                          break L184;
                                        } else {
                                          if (var15 == 0) {
                                            a.field_h[0].field_i = 10;
                                            var4 = -11;
                                            L185: while (true) {
                                              L186: {
                                                L187: {
                                                  L188: {
                                                    L189: {
                                                      if (var4 > -9) {
                                                        break L189;
                                                      } else {
                                                        var2_ref2 = new vl(0, a.field_h[0]);
                                                        var5_double = 5.0;
                                                        stackOut_907_0 = 3;
                                                        stackOut_907_1 = Math.abs(var4 + 10);
                                                        stackIn_919_0 = stackOut_907_0;
                                                        stackIn_919_1 = stackOut_907_1;
                                                        stackIn_908_0 = stackOut_907_0;
                                                        stackIn_908_1 = stackOut_907_1;
                                                        if (var15 != 0) {
                                                          L190: while (true) {
                                                            if (stackIn_919_0 > stackIn_919_1) {
                                                              break L187;
                                                            } else {
                                                              var2_ref2 = new vl(0, a.field_h[0]);
                                                              var5_double = 5.0;
                                                              stackOut_920_0 = ~Math.abs(var4);
                                                              stackOut_920_1 = -4;
                                                              stackIn_930_0 = stackOut_920_0;
                                                              stackIn_930_1 = stackOut_920_1;
                                                              stackIn_921_0 = stackOut_920_0;
                                                              stackIn_921_1 = stackOut_920_1;
                                                              if (var15 != 0) {
                                                                break L188;
                                                              } else {
                                                                L191: {
                                                                  if (stackIn_921_0 != stackIn_921_1) {
                                                                    break L191;
                                                                  } else {
                                                                    var5_double = 4.5;
                                                                    break L191;
                                                                  }
                                                                }
                                                                L192: {
                                                                  if (Math.abs(var4) != 2) {
                                                                    break L192;
                                                                  } else {
                                                                    var5_double = 4.8;
                                                                    break L192;
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
                                                                if (var15 == 0) {
                                                                  stackOut_918_0 = var4;
                                                                  stackOut_918_1 = 3;
                                                                  stackIn_919_0 = stackOut_918_0;
                                                                  stackIn_919_1 = stackOut_918_1;
                                                                  continue L190;
                                                                } else {
                                                                  break L187;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          L193: {
                                                            if (stackIn_908_0 != stackIn_908_1) {
                                                              break L193;
                                                            } else {
                                                              var5_double = 4.5;
                                                              break L193;
                                                            }
                                                          }
                                                          L194: {
                                                            if (2 == Math.abs(var4 - -10)) {
                                                              var5_double = 4.8;
                                                              break L194;
                                                            } else {
                                                              break L194;
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
                                                          if (var15 == 0) {
                                                            continue L185;
                                                          } else {
                                                            break L189;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var4 = -3;
                                                    L195: while (true) {
                                                      stackOut_918_0 = var4;
                                                      stackOut_918_1 = 3;
                                                      stackIn_919_0 = stackOut_918_0;
                                                      stackIn_919_1 = stackOut_918_1;
                                                      if (stackIn_919_0 > stackIn_919_1) {
                                                        break L187;
                                                      } else {
                                                        var2_ref2 = new vl(0, a.field_h[0]);
                                                        var5_double = 5.0;
                                                        stackOut_920_0 = ~Math.abs(var4);
                                                        stackOut_920_1 = -4;
                                                        stackIn_930_0 = stackOut_920_0;
                                                        stackIn_930_1 = stackOut_920_1;
                                                        stackIn_921_0 = stackOut_920_0;
                                                        stackIn_921_1 = stackOut_920_1;
                                                        if (var15 != 0) {
                                                          break L188;
                                                        } else {
                                                          L196: {
                                                            if (stackIn_921_0 != stackIn_921_1) {
                                                              break L196;
                                                            } else {
                                                              var5_double = 4.5;
                                                              break L196;
                                                            }
                                                          }
                                                          L197: {
                                                            if (Math.abs(var4) != 2) {
                                                              break L197;
                                                            } else {
                                                              var5_double = 4.8;
                                                              break L197;
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
                                                          if (var15 == 0) {
                                                            continue L195;
                                                          } else {
                                                            break L187;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L198: while (true) {
                                                    if (stackIn_930_0 < stackIn_930_1) {
                                                      break L186;
                                                    } else {
                                                      var2_ref2 = new vl(0, a.field_h[0]);
                                                      var5_double = 5.0;
                                                      stackOut_931_0 = Math.abs(var4 + -10);
                                                      stackOut_931_1 = 3;
                                                      stackIn_993_0 = stackOut_931_0;
                                                      stackIn_993_1 = stackOut_931_1;
                                                      stackIn_932_0 = stackOut_931_0;
                                                      stackIn_932_1 = stackOut_931_1;
                                                      if (var15 != 0) {
                                                        break L147;
                                                      } else {
                                                        L199: {
                                                          if (stackIn_932_0 == stackIn_932_1) {
                                                            var5_double = 4.5;
                                                            break L199;
                                                          } else {
                                                            break L199;
                                                          }
                                                        }
                                                        L200: {
                                                          if (Math.abs(var4 - 10) == 2) {
                                                            var5_double = 4.8;
                                                            break L200;
                                                          } else {
                                                            break L200;
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
                                                        if (var15 == 0) {
                                                          stackOut_929_0 = ~var4;
                                                          stackOut_929_1 = -12;
                                                          stackIn_930_0 = stackOut_929_0;
                                                          stackIn_930_1 = stackOut_929_1;
                                                          continue L198;
                                                        } else {
                                                          break L186;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var4 = 9;
                                                L201: while (true) {
                                                  stackOut_929_0 = ~var4;
                                                  stackOut_929_1 = -12;
                                                  stackIn_930_0 = stackOut_929_0;
                                                  stackIn_930_1 = stackOut_929_1;
                                                  if (stackIn_930_0 < stackIn_930_1) {
                                                    break L186;
                                                  } else {
                                                    var2_ref2 = new vl(0, a.field_h[0]);
                                                    var5_double = 5.0;
                                                    stackOut_931_0 = Math.abs(var4 + -10);
                                                    stackOut_931_1 = 3;
                                                    stackIn_993_0 = stackOut_931_0;
                                                    stackIn_993_1 = stackOut_931_1;
                                                    stackIn_932_0 = stackOut_931_0;
                                                    stackIn_932_1 = stackOut_931_1;
                                                    if (var15 != 0) {
                                                      break L147;
                                                    } else {
                                                      L202: {
                                                        if (stackIn_932_0 == stackIn_932_1) {
                                                          var5_double = 4.5;
                                                          break L202;
                                                        } else {
                                                          break L202;
                                                        }
                                                      }
                                                      L203: {
                                                        if (Math.abs(var4 - 10) == 2) {
                                                          var5_double = 4.8;
                                                          break L203;
                                                        } else {
                                                          break L203;
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
                                                      if (var15 == 0) {
                                                        continue L201;
                                                      } else {
                                                        break L186;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              break L91;
                                            }
                                          } else {
                                            break L184;
                                          }
                                        }
                                      }
                                      L204: {
                                        if (var4 != 8) {
                                          break L204;
                                        } else {
                                          if (var15 == 0) {
                                            a.field_h[0].field_i = 1;
                                            var4 = 0;
                                            L205: while (true) {
                                              L206: {
                                                if (10 <= var4) {
                                                  break L206;
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
                                                  if (var15 != 0) {
                                                    break L91;
                                                  } else {
                                                    if (var15 == 0) {
                                                      continue L205;
                                                    } else {
                                                      break L206;
                                                    }
                                                  }
                                                }
                                              }
                                              break L91;
                                            }
                                          } else {
                                            break L204;
                                          }
                                        }
                                      }
                                      if (var4 == 9) {
                                        a.field_h[0].field_i = 1;
                                        var4 = -2;
                                        L207: while (true) {
                                          L208: {
                                            if (var4 > 2) {
                                              break L208;
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
                                              if (var15 != 0) {
                                                break L91;
                                              } else {
                                                if (var15 == 0) {
                                                  continue L207;
                                                } else {
                                                  break L208;
                                                }
                                              }
                                            }
                                          }
                                          break L91;
                                        }
                                      } else {
                                        if (10 != var4) {
                                          break L91;
                                        } else {
                                          if (var15 == 0) {
                                            L209: {
                                              a.field_h[0].field_i = a.field_h[0].field_i - 1;
                                              if (a.field_h[0].field_i > -25) {
                                                break L209;
                                              } else {
                                                a.field_h[0].field_i = 10;
                                                break L209;
                                              }
                                            }
                                            L210: {
                                              var3 = -a.field_h[0].field_i;
                                              if (15 < var3) {
                                                var3 = -var3 + 25;
                                                break L210;
                                              } else {
                                                break L210;
                                              }
                                            }
                                            L211: {
                                              if (var3 <= 10) {
                                                break L211;
                                              } else {
                                                var3 = 10;
                                                break L211;
                                              }
                                            }
                                            L212: {
                                              if (var3 < 1) {
                                                var3 = 1;
                                                break L212;
                                              } else {
                                                break L212;
                                              }
                                            }
                                            var4 = -1;
                                            L213: while (true) {
                                              L214: {
                                                if (var4 > 1) {
                                                  break L214;
                                                } else {
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
                                                  stackOut_972_0 = var4;
                                                  stackIn_981_0 = stackOut_972_0;
                                                  stackIn_973_0 = stackOut_972_0;
                                                  if (var15 != 0) {
                                                    break L90;
                                                  } else {
                                                    L215: {
                                                      if (stackIn_973_0 == 0) {
                                                        break L215;
                                                      } else {
                                                        var2_ref2.field_n = 11;
                                                        break L215;
                                                      }
                                                    }
                                                    var4++;
                                                    if (var15 == 0) {
                                                      continue L213;
                                                    } else {
                                                      break L214;
                                                    }
                                                  }
                                                }
                                              }
                                              break L91;
                                            }
                                          } else {
                                            break L145;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L216: while (true) {
                                L217: {
                                  if (stackIn_993_0 != stackIn_993_1) {
                                    break L217;
                                  } else {
                                    if (ph.field_D < 2) {
                                      break L217;
                                    } else {
                                      e.field_e = e.field_e + 1;
                                      e.field_c = true;
                                      if (e.field_e <= 10) {
                                        break L217;
                                      } else {
                                        e.field_e = -1;
                                        break L217;
                                      }
                                    }
                                  }
                                }
                                L218: {
                                  if (41 != gi.field_f) {
                                    break L218;
                                  } else {
                                    if (ph.field_D < 2) {
                                      break L218;
                                    } else {
                                      L219: {
                                        if (hd.field_b) {
                                          stackOut_1011_0 = 0;
                                          stackIn_1012_0 = stackOut_1011_0;
                                          break L219;
                                        } else {
                                          stackOut_1009_0 = 1;
                                          stackIn_1012_0 = stackOut_1009_0;
                                          break L219;
                                        }
                                      }
                                      hd.field_b = stackIn_1012_0 != 0;
                                      break L218;
                                    }
                                  }
                                }
                                L220: {
                                  if (gi.field_f != 48) {
                                    break L220;
                                  } else {
                                    if (ph.field_D >= 2) {
                                      hj.a(255, 0, 1);
                                      break L220;
                                    } else {
                                      break L220;
                                    }
                                  }
                                }
                                if (gi.field_f == 13) {
                                  break L89;
                                } else {
                                  if (!qh.c(89)) {
                                    break L88;
                                  } else {
                                    stackOut_988_0 = ~gi.field_f;
                                    stackIn_1026_0 = stackOut_988_0;
                                    stackIn_989_0 = stackOut_988_0;
                                    if (var15 != 0) {
                                      break L87;
                                    } else {
                                      stackOut_989_0 = stackIn_989_0;
                                      stackIn_991_0 = stackOut_989_0;
                                      stackOut_991_0 = stackIn_991_0;
                                      stackOut_991_1 = -34;
                                      stackIn_993_0 = stackOut_991_0;
                                      stackIn_993_1 = stackOut_991_1;
                                      continue L216;
                                    }
                                  }
                                }
                              }
                            }
                            L221: {
                              int fieldTemp$15 = mj.field_F + 1;
                              mj.field_F = mj.field_F + 1;
                              if (fieldTemp$15 > 4) {
                                mj.field_F = 0;
                                break L221;
                              } else {
                                break L221;
                              }
                            }
                            L222: {
                              a.field_h[0].field_i = 5;
                              var4 = mj.field_F + -1;
                              if (var4 != 2) {
                                break L222;
                              } else {
                                var4 = 0;
                                break L222;
                              }
                            }
                            L223: {
                              if (var4 == 3) {
                                var4 = -1;
                                break L223;
                              } else {
                                break L223;
                              }
                            }
                            L224: {
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
                                break L224;
                              } else {
                                var2_ref2.field_q = 8421631;
                                var2_ref2.field_p = 2;
                                break L224;
                              }
                            }
                            wk.field_b[eg.a(-27)] = var2_ref2;
                            break L91;
                          }
                        } else {
                          break L91;
                        }
                      } else {
                        break L91;
                      }
                    }
                    stackOut_980_0 = s.field_i;
                    stackIn_981_0 = stackOut_980_0 ? 1 : 0;
                    break L90;
                  }
                  if (stackIn_981_0 == 0) {
                    break L88;
                  } else {
                    if (na.field_j == null) {
                      L225: while (true) {
                        if (!qh.c(89)) {
                          break L88;
                        } else {
                          stackOut_988_0 = ~gi.field_f;
                          stackIn_1026_0 = stackOut_988_0;
                          stackIn_989_0 = stackOut_988_0;
                          if (var15 != 0) {
                            break L87;
                          } else {
                            stackOut_989_0 = stackIn_989_0;
                            stackIn_991_0 = stackOut_989_0;
                            stackOut_991_0 = stackIn_991_0;
                            stackOut_991_1 = -34;
                            stackIn_993_0 = stackOut_991_0;
                            stackIn_993_1 = stackOut_991_1;
                            L226: {
                              if (stackIn_993_0 != stackIn_993_1) {
                                break L226;
                              } else {
                                if (ph.field_D < 2) {
                                  break L226;
                                } else {
                                  e.field_e = e.field_e + 1;
                                  e.field_c = true;
                                  if (e.field_e <= 10) {
                                    break L226;
                                  } else {
                                    e.field_e = -1;
                                    break L226;
                                  }
                                }
                              }
                            }
                            L227: {
                              if (41 != gi.field_f) {
                                break L227;
                              } else {
                                if (ph.field_D < 2) {
                                  break L227;
                                } else {
                                  L228: {
                                    if (hd.field_b) {
                                      stackOut_1011_0 = 0;
                                      stackIn_1012_0 = stackOut_1011_0;
                                      break L228;
                                    } else {
                                      stackOut_1009_0 = 1;
                                      stackIn_1012_0 = stackOut_1009_0;
                                      break L228;
                                    }
                                  }
                                  hd.field_b = stackIn_1012_0 != 0;
                                  break L227;
                                }
                              }
                            }
                            L229: {
                              if (gi.field_f != 48) {
                                break L229;
                              } else {
                                if (ph.field_D >= 2) {
                                  hj.a(255, 0, 1);
                                  break L229;
                                } else {
                                  break L229;
                                }
                              }
                            }
                            if (gi.field_f == 13) {
                              break L89;
                            } else {
                              continue L225;
                            }
                          }
                        }
                      }
                    } else {
                      break L88;
                    }
                  }
                }
                na.field_j = new ij((stellarshard) this);
                tl.field_c = 0;
                return;
              }
              this.q(50);
              stackOut_1025_0 = 0;
              stackIn_1026_0 = stackOut_1025_0;
              break L87;
            }
            var2_int = stackIn_1026_0;
            var3 = 0;
            var4 = 0;
            var5 = 0;
            L230: while (true) {
              L231: {
                L232: {
                  L233: {
                    L234: {
                      L235: {
                        L236: {
                          if (var5 >= 1000) {
                            break L236;
                          } else {
                            stackOut_1028_0 = a.field_h[var5];
                            stackIn_1090_0 = stackOut_1028_0;
                            stackIn_1029_0 = stackOut_1028_0;
                            if (var15 != 0) {
                              break L235;
                            } else {
                              L237: {
                                if (stackIn_1029_0 == null) {
                                  break L237;
                                } else {
                                  if (14 != a.field_h[var5].field_m) {
                                    break L237;
                                  } else {
                                    if (var5 >= 999) {
                                      break L237;
                                    } else {
                                      L238: {
                                        if (null == a.field_h[1 + var5]) {
                                          break L238;
                                        } else {
                                          if (a.field_h[1 + var5].field_m == 14) {
                                            break L237;
                                          } else {
                                            break L238;
                                          }
                                        }
                                      }
                                      var6_ref_qe = a.field_h[var5];
                                      a.field_h[var5] = a.field_h[1 + var5];
                                      a.field_h[1 + var5] = var6_ref_qe;
                                      break L237;
                                    }
                                  }
                                }
                              }
                              L239: {
                                if (a.field_h[var5] == null) {
                                  break L239;
                                } else {
                                  L240: {
                                    L241: {
                                      if (a.field_h[var5].field_m == -1) {
                                        break L241;
                                      } else {
                                        if (a.field_h[var5].field_m == 11) {
                                          break L240;
                                        } else {
                                          L242: {
                                            var4++;
                                            if (1 == a.field_h[var5].field_m) {
                                              var4 += 2;
                                              break L242;
                                            } else {
                                              break L242;
                                            }
                                          }
                                          L243: {
                                            if (a.field_h[var5].field_m != 5) {
                                              break L243;
                                            } else {
                                              var4 += 2;
                                              break L243;
                                            }
                                          }
                                          L244: {
                                            if (3 != a.field_h[var5].field_m) {
                                              break L244;
                                            } else {
                                              var4 += 2;
                                              break L244;
                                            }
                                          }
                                          L245: {
                                            if (7 != a.field_h[var5].field_m) {
                                              break L245;
                                            } else {
                                              var4 += 4;
                                              break L245;
                                            }
                                          }
                                          L246: {
                                            if (6 == a.field_h[var5].field_m) {
                                              var4 += 4;
                                              break L246;
                                            } else {
                                              break L246;
                                            }
                                          }
                                          if (a.field_h[var5].field_m == 14) {
                                            var4 += 20;
                                            if (var15 == 0) {
                                              break L240;
                                            } else {
                                              break L241;
                                            }
                                          } else {
                                            break L240;
                                          }
                                        }
                                      }
                                    }
                                    var2_int = (int)a.field_h[var5].field_a;
                                    var3 = (int)a.field_h[var5].field_l;
                                    break L240;
                                  }
                                  a.field_h[var5] = a.field_h[var5].a(-95);
                                  break L239;
                                }
                              }
                              var5++;
                              if (var15 == 0) {
                                continue L230;
                              } else {
                                break L236;
                              }
                            }
                          }
                        }
                        if (!s.field_i) {
                          break L232;
                        } else {
                          if (pk.a(-12663, 0)) {
                            if (null == a.field_h[0]) {
                              break L234;
                            } else {
                              if (a.field_h[0].field_m != -1) {
                                break L234;
                              } else {
                                stackOut_1088_0 = a.field_h[0];
                                stackIn_1090_0 = stackOut_1088_0;
                                break L235;
                              }
                            }
                          } else {
                            break L232;
                          }
                        }
                      }
                      if (stackIn_1090_0.field_g > 0) {
                        break L234;
                      } else {
                        if (0 != nc.field_H) {
                          break L234;
                        } else {
                          stackOut_1094_0 = 1;
                          stackIn_1097_0 = stackOut_1094_0;
                          break L233;
                        }
                      }
                    }
                    stackOut_1096_0 = 0;
                    stackIn_1097_0 = stackOut_1096_0;
                    break L233;
                  }
                  L247: {
                    var5 = stackIn_1097_0;
                    if (var5 == 0) {
                      pk.field_c = pk.field_c - 1;
                      if (pk.field_c < 0) {
                        L248: {
                          var6 = gh.field_b;
                          if (var6 > 5) {
                            var6 = 5;
                            break L248;
                          } else {
                            break L248;
                          }
                        }
                        pk.field_c = 25 + var6 * 25;
                        var7 = 160 + -(var6 * 32);
                        if (var7 <= 0) {
                          break L247;
                        } else {
                          if (fe.field_e) {
                            ll.field_c.a(sb.field_e[46], var7, pk.field_h * 6);
                            break L247;
                          } else {
                            break L247;
                          }
                        }
                      } else {
                        break L247;
                      }
                    } else {
                      break L247;
                    }
                  }
                  gf.field_c = gf.field_c + 1;
                  var6_double = 1.7976931348623157e+308;
                  var8 = null;
                  var9 = 0;
                  L249: while (true) {
                    L250: {
                      if (var9 >= 1000) {
                        break L250;
                      } else {
                        var10 = a.field_h[var9];
                        if (var15 != 0) {
                          break L231;
                        } else {
                          L251: {
                            if (var10 == null) {
                              break L251;
                            } else {
                              if (var10.field_m == -1) {
                                break L251;
                              } else {
                                if (var10.a((byte) -102)) {
                                  var11 = -(int)var10.field_a + var2_int;
                                  var12 = var3 - (int)var10.field_l;
                                  var13 = Math.sqrt((double)(var12 * var12 + var11 * var11));
                                  if (var13 >= var6_double) {
                                    break L251;
                                  } else {
                                    var6_double = var13;
                                    var8 = (Object) (Object) var10;
                                    break L251;
                                  }
                                } else {
                                  break L251;
                                }
                              }
                            }
                          }
                          var9++;
                          if (var15 == 0) {
                            continue L249;
                          } else {
                            break L250;
                          }
                        }
                      }
                    }
                    if (null == var8) {
                      break L232;
                    } else {
                      L252: {
                        var9 = 128;
                        if (var6_double <= 0.0) {
                          break L252;
                        } else {
                          var9 = (int)(2560.0 / var6_double);
                          break L252;
                        }
                      }
                      L253: {
                        if (var9 > 128) {
                          var9 = 128;
                          break L253;
                        } else {
                          break L253;
                        }
                      }
                      ag.field_a = ag.field_a + var9;
                      if (256 >= ag.field_a) {
                        break L232;
                      } else {
                        L254: {
                          if (fe.field_e) {
                            ll.field_c.a(sb.field_e[13], var9, pk.field_h * 64 / 50);
                            break L254;
                          } else {
                            break L254;
                          }
                        }
                        ag.field_a = 0;
                        break L232;
                      }
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
                break L231;
              }
              var6 = 0;
              L255: while (true) {
                L256: {
                  L257: {
                    L258: {
                      L259: {
                        L260: {
                          if (var6 >= 12) {
                            break L260;
                          } else {
                            fk.field_k[var5] = fk.field_k[var5] + (-(var2_int << 4) + fk.field_k[var5 - -2]);
                            fk.field_k[1 + var5] = fk.field_k[1 + var5] + (fk.field_k[var5 - -3] - (var3 << 4));
                            stackOut_1149_0 = fk.field_k[var5];
                            stackOut_1149_1 = -2048;
                            stackIn_1168_0 = stackOut_1149_0;
                            stackIn_1168_1 = stackOut_1149_1;
                            stackIn_1150_0 = stackOut_1149_0;
                            stackIn_1150_1 = stackOut_1149_1;
                            if (var15 != 0) {
                              L261: while (true) {
                                if (stackIn_1168_0 >= stackIn_1168_1) {
                                  break L258;
                                } else {
                                  stackOut_1169_0 = wk.field_b[var5];
                                  stackIn_1220_0 = stackOut_1169_0;
                                  stackIn_1170_0 = stackOut_1169_0;
                                  if (var15 != 0) {
                                    break L259;
                                  } else {
                                    stackOut_1170_0 = (vl) (Object) stackIn_1170_0;
                                    stackIn_1172_0 = stackOut_1170_0;
                                    L262: {
                                      if (stackIn_1172_0 == null) {
                                        break L262;
                                      } else {
                                        if (5 == wk.field_b[var5].field_f) {
                                          wk.field_b[var5] = null;
                                          break L262;
                                        } else {
                                          break L262;
                                        }
                                      }
                                    }
                                    var5++;
                                    if (var15 == 0) {
                                      stackOut_1167_0 = var5;
                                      stackOut_1167_1 = 3000;
                                      stackIn_1168_0 = stackOut_1167_0;
                                      stackIn_1168_1 = stackOut_1167_1;
                                      continue L261;
                                    } else {
                                      break L258;
                                    }
                                  }
                                }
                              }
                            } else {
                              L263: {
                                if (stackIn_1150_0 >= stackIn_1150_1) {
                                  break L263;
                                } else {
                                  fk.field_k[var5] = fk.field_k[var5] + 14336;
                                  break L263;
                                }
                              }
                              L264: {
                                if (fk.field_k[var5] <= 12288) {
                                  break L264;
                                } else {
                                  fk.field_k[var5] = fk.field_k[var5] - 14336;
                                  break L264;
                                }
                              }
                              L265: {
                                if (fk.field_k[1 + var5] < -2048) {
                                  fk.field_k[1 + var5] = fk.field_k[1 + var5] + 11776;
                                  break L265;
                                } else {
                                  break L265;
                                }
                              }
                              L266: {
                                if (fk.field_k[1 + var5] <= 9728) {
                                  break L266;
                                } else {
                                  fk.field_k[var5 + 1] = fk.field_k[var5 + 1] - 11776;
                                  break L266;
                                }
                              }
                              var5 += 4;
                              var6++;
                              if (var15 == 0) {
                                continue L255;
                              } else {
                                break L260;
                              }
                            }
                          }
                        }
                        var5 = 0;
                        L267: while (true) {
                          stackOut_1167_0 = var5;
                          stackOut_1167_1 = 3000;
                          stackIn_1168_0 = stackOut_1167_0;
                          stackIn_1168_1 = stackOut_1167_1;
                          if (stackIn_1168_0 >= stackIn_1168_1) {
                            break L258;
                          } else {
                            stackOut_1169_0 = wk.field_b[var5];
                            stackIn_1220_0 = stackOut_1169_0;
                            stackIn_1170_0 = stackOut_1169_0;
                            if (var15 != 0) {
                              break L259;
                            } else {
                              stackOut_1170_0 = (vl) (Object) stackIn_1170_0;
                              stackIn_1172_0 = stackOut_1170_0;
                              L268: {
                                if (stackIn_1172_0 == null) {
                                  break L268;
                                } else {
                                  if (5 == wk.field_b[var5].field_f) {
                                    wk.field_b[var5] = null;
                                    break L268;
                                  } else {
                                    break L268;
                                  }
                                }
                              }
                              var5++;
                              if (var15 == 0) {
                                continue L267;
                              } else {
                                break L258;
                              }
                            }
                          }
                        }
                      }
                      L269: while (true) {
                        ((vl) (Object) stackIn_1220_0).a(var3, var2_int, param0);
                        L270: while (true) {
                          var5++;
                          if (var15 == 0) {
                            if (var5 >= 3000) {
                              break L257;
                            } else {
                              stackOut_1214_0 = null;
                              stackIn_1258_0 = stackOut_1214_0;
                              stackIn_1215_0 = stackOut_1214_0;
                              if (var15 != 0) {
                                break L256;
                              } else {
                                stackOut_1215_0 = stackIn_1215_0;
                                stackOut_1215_1 = wk.field_b[var5];
                                stackIn_1217_0 = stackOut_1215_0;
                                stackIn_1217_1 = stackOut_1215_1;
                                if (stackIn_1217_0 != (Object) (Object) stackIn_1217_1) {
                                  stackOut_1219_0 = wk.field_b[var5];
                                  stackIn_1220_0 = stackOut_1219_0;
                                  continue L269;
                                } else {
                                  continue L270;
                                }
                              }
                            }
                          } else {
                            break L257;
                          }
                        }
                      }
                    }
                    var5 = 0;
                    L271: while (true) {
                      L272: {
                        if (3000 <= var5) {
                          break L272;
                        } else {
                          stackOut_1184_0 = null;
                          stackOut_1184_1 = wk.field_b[var5];
                          stackIn_1217_0 = stackOut_1184_0;
                          stackIn_1217_1 = stackOut_1184_1;
                          stackIn_1185_0 = stackOut_1184_0;
                          stackIn_1185_1 = stackOut_1184_1;
                          if (var15 != 0) {
                            L273: while (true) {
                              L274: {
                                if (stackIn_1217_0 != (Object) (Object) stackIn_1217_1) {
                                  stackOut_1219_0 = wk.field_b[var5];
                                  stackIn_1220_0 = stackOut_1219_0;
                                  ((vl) (Object) stackIn_1220_0).a(var3, var2_int, param0);
                                  break L274;
                                } else {
                                  break L274;
                                }
                              }
                              var5++;
                              if (var15 == 0) {
                                if (var5 >= 3000) {
                                  break L257;
                                } else {
                                  stackOut_1214_0 = null;
                                  stackIn_1258_0 = stackOut_1214_0;
                                  stackIn_1215_0 = stackOut_1214_0;
                                  if (var15 != 0) {
                                    break L256;
                                  } else {
                                    stackOut_1215_0 = stackIn_1215_0;
                                    stackOut_1215_1 = wk.field_b[var5];
                                    stackIn_1217_0 = stackOut_1215_0;
                                    stackIn_1217_1 = stackOut_1215_1;
                                    continue L273;
                                  }
                                }
                              } else {
                                break L257;
                              }
                            }
                          } else {
                            L275: {
                              if (stackIn_1185_0 != (Object) (Object) stackIn_1185_1) {
                                wk.field_b[var5] = wk.field_b[var5].a((byte) -126);
                                break L275;
                              } else {
                                break L275;
                              }
                            }
                            var5++;
                            if (var15 == 0) {
                              continue L271;
                            } else {
                              break L272;
                            }
                          }
                        }
                      }
                      o.field_j = 0;
                      var5 = 0;
                      L276: while (true) {
                        L277: {
                          if (var5 >= 1000) {
                            break L277;
                          } else {
                            stackOut_1193_0 = null;
                            stackIn_1258_0 = stackOut_1193_0;
                            stackIn_1194_0 = stackOut_1193_0;
                            if (var15 != 0) {
                              break L256;
                            } else {
                              L278: {
                                if (stackIn_1194_0 != (Object) (Object) hf.field_e[var5]) {
                                  hf.field_e[var5] = hf.field_e[var5].a(0);
                                  o.field_j = o.field_j + 1;
                                  break L278;
                                } else {
                                  break L278;
                                }
                              }
                              var5++;
                              if (var15 == 0) {
                                continue L276;
                              } else {
                                break L277;
                              }
                            }
                          }
                        }
                        var5 = 0;
                        L279: while (true) {
                          L280: {
                            if (var5 >= 1000) {
                              break L280;
                            } else {
                              stackOut_1203_0 = null;
                              stackIn_1258_0 = stackOut_1203_0;
                              stackIn_1204_0 = stackOut_1203_0;
                              if (var15 != 0) {
                                break L256;
                              } else {
                                L281: {
                                  if (stackIn_1204_0 == (Object) (Object) a.field_h[var5]) {
                                    break L281;
                                  } else {
                                    a.field_h[var5].a((byte) -110, var2_int, var3);
                                    break L281;
                                  }
                                }
                                var5++;
                                if (var15 == 0) {
                                  continue L279;
                                } else {
                                  break L280;
                                }
                              }
                            }
                          }
                          if (param0) {
                            var5 = 0;
                            L282: while (true) {
                              if (var5 >= 3000) {
                                break L257;
                              } else {
                                stackOut_1214_0 = null;
                                stackIn_1258_0 = stackOut_1214_0;
                                stackIn_1215_0 = stackOut_1214_0;
                                if (var15 != 0) {
                                  break L256;
                                } else {
                                  stackOut_1215_0 = stackIn_1215_0;
                                  stackOut_1215_1 = wk.field_b[var5];
                                  stackIn_1217_0 = stackOut_1215_0;
                                  stackIn_1217_1 = stackOut_1215_1;
                                  L283: {
                                    if (stackIn_1217_0 != (Object) (Object) stackIn_1217_1) {
                                      stackOut_1219_0 = wk.field_b[var5];
                                      stackIn_1220_0 = stackOut_1219_0;
                                      ((vl) (Object) stackIn_1220_0).a(var3, var2_int, param0);
                                      break L283;
                                    } else {
                                      break L283;
                                    }
                                  }
                                  var5++;
                                  if (var15 == 0) {
                                    continue L282;
                                  } else {
                                    break L257;
                                  }
                                }
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  L284: {
                    if (qi.field_a < 10) {
                      break L284;
                    } else {
                      if (mk.field_k > 0) {
                        break L284;
                      } else {
                        if (!s.field_i) {
                          break L284;
                        } else {
                          nc.field_A = nc.field_A - 1;
                          if (nc.field_A <= 0) {
                            a.field_h[0] = null;
                            this.k((byte) 97);
                            break L284;
                          } else {
                            break L284;
                          }
                        }
                      }
                    }
                  }
                  L285: {
                    if (50 != qi.field_a) {
                      break L285;
                    } else {
                      if (nc.field_A > 0) {
                        nc.field_A = nc.field_A - 1;
                        if (nc.field_A > 0) {
                          break L285;
                        } else {
                          a.field_h[0] = null;
                          this.k((byte) 121);
                          break L285;
                        }
                      } else {
                        break L285;
                      }
                    }
                  }
                  L286: {
                    if (qi.field_a < var4) {
                      break L286;
                    } else {
                      L287: {
                        if (qi.field_a < 10) {
                          break L287;
                        } else {
                          if (mk.field_k <= 0) {
                            break L286;
                          } else {
                            break L287;
                          }
                        }
                      }
                      if (na.field_j == null) {
                        this.n(3);
                        break L286;
                      } else {
                        break L286;
                      }
                    }
                  }
                  stackOut_1257_0 = null;
                  stackIn_1258_0 = stackOut_1257_0;
                  break L256;
                }
                L288: {
                  L289: {
                    if (stackIn_1258_0 == (Object) (Object) na.field_j) {
                      break L289;
                    } else {
                      if (!s.field_i) {
                        break L288;
                      } else {
                        break L289;
                      }
                    }
                  }
                  L290: {
                    if (s.field_i) {
                      break L290;
                    } else {
                      L291: {
                        if (wh.field_c > 1) {
                          break L291;
                        } else {
                          if (ni.field_a) {
                            break L290;
                          } else {
                            break L291;
                          }
                        }
                      }
                      L292: {
                        na.field_j = new ij((stellarshard) this);
                        if (!ni.field_a) {
                          tl.field_c = 4;
                          na.field_j.field_l = 8;
                          break L292;
                        } else {
                          break L292;
                        }
                      }
                      ni.field_a = false;
                      if (var15 == 0) {
                        break L290;
                      } else {
                        break L288;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
                L293: while (true) {
                  L294: {
                    L295: {
                      if (!qh.c(79)) {
                        break L295;
                      } else {
                        stackOut_1281_0 = null;
                        stackOut_1281_1 = na.field_j;
                        stackIn_1305_0 = stackOut_1281_0;
                        stackIn_1305_1 = stackOut_1281_1;
                        stackIn_1282_0 = stackOut_1281_0;
                        stackIn_1282_1 = stackOut_1281_1;
                        if (var15 != 0) {
                          break L294;
                        } else {
                          L296: {
                            if (stackIn_1282_0 == (Object) (Object) stackIn_1282_1) {
                              break L296;
                            } else {
                              if (gi.field_f != 13) {
                                break L296;
                              } else {
                                L297: {
                                  if (tl.field_c == 2) {
                                    break L297;
                                  } else {
                                    if (tl.field_c == 1) {
                                      break L297;
                                    } else {
                                      if (tl.field_c != 3) {
                                        break L296;
                                      } else {
                                        break L297;
                                      }
                                    }
                                  }
                                }
                                n.field_L = 256;
                                tl.field_c = 0;
                                if (var15 == 0) {
                                  continue L293;
                                } else {
                                  break L296;
                                }
                              }
                            }
                          }
                          if (na.field_j != null) {
                            na.field_j.b(8);
                            if (var15 == 0) {
                              continue L293;
                            } else {
                              break L295;
                            }
                          } else {
                            continue L293;
                          }
                        }
                      }
                    }
                    stackOut_1304_0 = null;
                    stackOut_1304_1 = na.field_j;
                    stackIn_1305_0 = stackOut_1304_0;
                    stackIn_1305_1 = stackOut_1304_1;
                    break L294;
                  }
                  L298: {
                    if (stackIn_1305_0 == (Object) (Object) stackIn_1305_1) {
                      break L298;
                    } else {
                      L299: {
                        if (tl.field_c == 1) {
                          if (((stellarshard) this).field_Q < 612) {
                            break L299;
                          } else {
                            if (628 <= ((stellarshard) this).field_Q) {
                              break L299;
                            } else {
                              if (((stellarshard) this).field_O < 176) {
                                break L299;
                              } else {
                                if (((stellarshard) this).field_O >= 192) {
                                  break L299;
                                } else {
                                  if (gh.field_c == 1) {
                                    n.field_L = 256;
                                    tl.field_c = 0;
                                    break L299;
                                  } else {
                                    break L299;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L299;
                        }
                      }
                      L300: {
                        if (tl.field_c != 2) {
                          break L300;
                        } else {
                          L301: {
                            if (((stellarshard) this).field_Q < 496) {
                              break L301;
                            } else {
                              if (512 <= ((stellarshard) this).field_Q) {
                                break L301;
                              } else {
                                if (208 > ((stellarshard) this).field_O) {
                                  break L301;
                                } else {
                                  if (((stellarshard) this).field_O >= 224) {
                                    break L301;
                                  } else {
                                    if (gh.field_c != 1) {
                                      break L301;
                                    } else {
                                      tl.field_c = 0;
                                      gh.field_d = null;
                                      n.field_L = 256;
                                      break L301;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L302: {
                            if (((stellarshard) this).field_Q < 248) {
                              break L302;
                            } else {
                              if (((stellarshard) this).field_Q > 264) {
                                break L302;
                              } else {
                                if (460 > ((stellarshard) this).field_O) {
                                  break L302;
                                } else {
                                  if (((stellarshard) this).field_O > 484) {
                                    break L302;
                                  } else {
                                    if (1 == gh.field_c) {
                                      int fieldTemp$16 = si.field_X - 1;
                                      si.field_X = si.field_X - 1;
                                      if (fieldTemp$16 < 0) {
                                        si.field_X = si.field_X + 3;
                                        break L302;
                                      } else {
                                        break L302;
                                      }
                                    } else {
                                      break L302;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (((stellarshard) this).field_Q < 376) {
                            break L300;
                          } else {
                            if (((stellarshard) this).field_Q > 392) {
                              break L300;
                            } else {
                              if (460 > ((stellarshard) this).field_O) {
                                break L300;
                              } else {
                                if (((stellarshard) this).field_O > 484) {
                                  break L300;
                                } else {
                                  if (gh.field_c != 1) {
                                    break L300;
                                  } else {
                                    int fieldTemp$17 = si.field_X + 1;
                                    si.field_X = si.field_X + 1;
                                    if (fieldTemp$17 >= 3) {
                                      si.field_X = si.field_X - 3;
                                      break L300;
                                    } else {
                                      break L300;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L303: {
                        if (3 != tl.field_c) {
                          break L303;
                        } else {
                          if (((stellarshard) this).field_Q < 496) {
                            break L303;
                          } else {
                            if (((stellarshard) this).field_Q >= 512) {
                              break L303;
                            } else {
                              if (208 > ((stellarshard) this).field_O) {
                                break L303;
                              } else {
                                if (((stellarshard) this).field_O >= 224) {
                                  break L303;
                                } else {
                                  if (gh.field_c == 1) {
                                    tl.field_c = 0;
                                    n.field_L = 256;
                                    if (!oc.field_d) {
                                      break L303;
                                    } else {
                                      tl.field_c = 2;
                                      oc.field_d = false;
                                      break L303;
                                    }
                                  } else {
                                    break L303;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      na.field_j.a(true);
                      break L298;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "stellarshard.CB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
              t.a(false);
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
        int var4 = 0;
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
                ((stellarshard) this).l((byte) 47);
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
        L2: {
          if (var3 == 0) {
            break L2;
          } else {
            var4 = ac.field_m;
            var4++;
            ac.field_m = var4;
            break L2;
          }
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
        int stackIn_151_0 = 0;
        int stackIn_151_1 = 0;
        int stackIn_177_0 = 0;
        int stackIn_177_1 = 0;
        int stackIn_188_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_236_0 = 0;
        int stackIn_238_0 = 0;
        int stackIn_253_0 = 0;
        int stackIn_253_1 = 0;
        int stackIn_261_0 = 0;
        int stackIn_261_1 = 0;
        int stackIn_263_0 = 0;
        int stackIn_265_0 = 0;
        int stackIn_275_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_150_0 = 0;
        int stackOut_150_1 = 0;
        int stackOut_176_0 = 0;
        int stackOut_176_1 = 0;
        int stackOut_187_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_237_0 = 0;
        int stackOut_252_0 = 0;
        int stackOut_252_1 = 0;
        int stackOut_260_0 = 0;
        int stackOut_260_1 = 0;
        int stackOut_262_0 = 0;
        int stackOut_263_0 = 0;
        int stackOut_274_0 = 0;
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
                  ((stellarshard) this).d(-20880);
                  pb discarded$5 = qd.a(bh.field_a, "space", "", (byte) 42);
                  pb discarded$6 = qd.a(bh.field_a, "nebula", "", (byte) 73);
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
                    L3: {
                      L4: {
                        if (16 <= var5) {
                          break L4;
                        } else {
                          var3 = (Object) (Object) new pb(96, 96);
                          ((pb) var3).e();
                          var4[var5].b(48, 48, 0, 4096);
                          e.field_g[var5] = (pb) var3;
                          var5++;
                          if (var11 != 0) {
                            break L3;
                          } else {
                            if (var11 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var5 = 0;
                      break L3;
                    }
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (64 <= var5) {
                            break L7;
                          } else {
                            cm.field_d[var5] = new pb(96, 96);
                            var5++;
                            if (var11 != 0) {
                              break L6;
                            } else {
                              if (var11 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        pd.field_h.a((byte) -107);
                        cg.field_c = 0;
                        rg.g(-33);
                        break L6;
                      }
                      return;
                    }
                  }
                } else {
                  if (cg.field_c < 16) {
                    L8: {
                      rd.a((byte) -47, (float)(80 + cg.field_c), ea.field_k);
                      ((stellarshard) this).d(-20880);
                      var3 = null;
                      var4_int = 0;
                      if (0 != cg.field_c) {
                        break L8;
                      } else {
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_craters_2");
                        var4_int = 0;
                        break L8;
                      }
                    }
                    L9: {
                      var5 = 1500;
                      if (1 == cg.field_c) {
                        var4_int = 1;
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_craters_3");
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (2 == cg.field_c) {
                        var4_int = 0;
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_iron_2");
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (3 == cg.field_c) {
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_iron_3");
                        var4_int = 1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (cg.field_c == 4) {
                        var4_int = 0;
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_ice_2");
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (5 != cg.field_c) {
                        break L13;
                      } else {
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_ice_3");
                        var4_int = 1;
                        break L13;
                      }
                    }
                    L14: {
                      if (cg.field_c != 6) {
                        break L14;
                      } else {
                        var4_int = 1;
                        var5 = 2000;
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "shooter_hub");
                        break L14;
                      }
                    }
                    L15: {
                      if (cg.field_c != 7) {
                        break L15;
                      } else {
                        var5 = 2000;
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "homer_hub");
                        var4_int = 1;
                        break L15;
                      }
                    }
                    L16: {
                      if (cg.field_c != 8) {
                        break L16;
                      } else {
                        var5 = 2500;
                        var4_int = 2;
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_craters_1");
                        break L16;
                      }
                    }
                    L17: {
                      if (cg.field_c != 9) {
                        break L17;
                      } else {
                        var4_int = 2;
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_iron_1");
                        var5 = 2500;
                        break L17;
                      }
                    }
                    L18: {
                      if (cg.field_c != 10) {
                        break L18;
                      } else {
                        var5 = 2500;
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "asteroid_ice_1");
                        var4_int = 2;
                        break L18;
                      }
                    }
                    L19: {
                      if (cg.field_c == 11) {
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "player");
                        var4_int = 3;
                        rh.field_b = (pa) var3;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (12 == cg.field_c) {
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "shooter");
                        var4_int = 4;
                        var5 = 2000;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if (13 != cg.field_c) {
                        break L21;
                      } else {
                        var5 = 2000;
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "homer");
                        var4_int = 2;
                        break L21;
                      }
                    }
                    L22: {
                      if (cg.field_c == 14) {
                        var5 = 2500;
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "gravity_well");
                        var4_int = 4;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if (cg.field_c == 15) {
                        var5 = 2500;
                        var3 = (Object) (Object) pa.a(jf.field_m, "", "spinner");
                        var4_int = 4;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    var6_int = 0;
                    L24: while (true) {
                      L25: {
                        L26: {
                          if (var6_int >= 128) {
                            break L26;
                          } else {
                            var7_ref = new pa((pa) var3, false, false, false, false);
                            var8_int = (int)(65536.0 * Math.cos(3.141592653589793 * (double)var6_int / 64.0));
                            var9 = (int)(65536.0 * Math.sin((double)var6_int * 3.141592653589793 / 64.0));
                            stackOut_150_0 = -4;
                            stackOut_150_1 = ~var4_int;
                            stackIn_177_0 = stackOut_150_0;
                            stackIn_177_1 = stackOut_150_1;
                            stackIn_151_0 = stackOut_150_0;
                            stackIn_151_1 = stackOut_150_1;
                            if (var11 != 0) {
                              break L25;
                            } else {
                              L27: {
                                if (stackIn_151_0 < stackIn_151_1) {
                                  break L27;
                                } else {
                                  var7_ref.a(new int[12]);
                                  var7_ref.a(new int[12]);
                                  break L27;
                                }
                              }
                              L28: {
                                var7_ref.a(new int[12]);
                                if (var4_int >= 3) {
                                  break L28;
                                } else {
                                  var7_ref.a(new int[12]);
                                  var7_ref.a(new int[12]);
                                  break L28;
                                }
                              }
                              L29: {
                                var10_ref_bj = var7_ref.a(128, 341, 50, 50, -50);
                                if (1 != var4_int) {
                                  break L29;
                                } else {
                                  fe.field_d[cg.field_c][var6_int] = new pb(96, 96);
                                  fe.field_d[cg.field_c][var6_int].e();
                                  ti.f(0, 0, 96, 96, 0);
                                  cc.a();
                                  var10_ref_bj.a(0, 0, 0, 0, 0, 0, var5, -1L);
                                  fe.field_d[cg.field_c][var6_int].d();
                                  break L29;
                                }
                              }
                              L30: {
                                if (0 == var4_int) {
                                  fe.field_d[cg.field_c][var6_int] = new pb(96, 96);
                                  fe.field_d[cg.field_c][var6_int].e();
                                  ti.f(0, 0, 96, 96, 0);
                                  cc.a();
                                  var10_ref_bj.a(0, 0, 0, 0, 0, 0, var5, -1L);
                                  fe.field_d[cg.field_c][var6_int].d();
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              L31: {
                                L32: {
                                  if (var4_int == 2) {
                                    break L32;
                                  } else {
                                    if (var4_int != 4) {
                                      break L31;
                                    } else {
                                      break L32;
                                    }
                                  }
                                }
                                rd.field_a[cg.field_c + -8][var6_int >> 2] = new pb(96, 96);
                                rd.field_a[-8 + cg.field_c][var6_int >> 2].e();
                                ti.f(0, 0, 96, 96, 0);
                                cc.a();
                                var10_ref_bj.a(0, 0, 0, 0, 0, 0, var5, -1L);
                                rd.field_a[-8 + cg.field_c][var6_int >> 2].d();
                                break L31;
                              }
                              L33: {
                                if (var4_int != 3) {
                                  break L33;
                                } else {
                                  cm.field_d[var6_int >> 1] = new pb(96, 96);
                                  cm.field_d[var6_int >> 1].e();
                                  ti.f(0, 0, 96, 96, 0);
                                  cc.a();
                                  var10_ref_bj.a(0, 0, 0, 0, 0, 0, 2500, -1L);
                                  cm.field_d[var6_int >> 1].d();
                                  break L33;
                                }
                              }
                              var6_int++;
                              if (var11 == 0) {
                                continue L24;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                        pd.field_h.a((byte) -107);
                        stackOut_176_0 = ~cg.field_c;
                        stackOut_176_1 = -16;
                        stackIn_177_0 = stackOut_176_0;
                        stackIn_177_1 = stackOut_176_1;
                        break L25;
                      }
                      L34: {
                        if (stackIn_177_0 != stackIn_177_1) {
                          break L34;
                        } else {
                          jf.field_n = ml.a("", (byte) 87, bh.field_a, "bar");
                          jf.field_m = null;
                          break L34;
                        }
                      }
                      cg.field_c = cg.field_c + 1;
                      rg.g(-33);
                      return;
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
                      pb[] discarded$7 = ml.a("", (byte) -32, bh.field_a, "menu");
                      rh.field_a = new pb[12];
                      var3 = null;
                      var4_int = 0;
                      L35: while (true) {
                        L36: {
                          L37: {
                            if (var4_int >= 12) {
                              break L37;
                            } else {
                              stackOut_187_0 = var4_int;
                              stackIn_202_0 = stackOut_187_0;
                              stackIn_188_0 = stackOut_187_0;
                              if (var11 != 0) {
                                break L36;
                              } else {
                                L38: {
                                  if (stackIn_188_0 != 0) {
                                    break L38;
                                  } else {
                                    var3 = (Object) (Object) ml.a("", (byte) 94, bh.field_a, "anim_shatter");
                                    break L38;
                                  }
                                }
                                L39: {
                                  if (3 == var4_int) {
                                    var3 = (Object) (Object) ml.a("", (byte) 103, bh.field_a, "anim_shatter2");
                                    break L39;
                                  } else {
                                    break L39;
                                  }
                                }
                                L40: {
                                  if (var4_int != 6) {
                                    break L40;
                                  } else {
                                    var3 = (Object) (Object) ml.a("", (byte) -72, bh.field_a, "anim_shatter3");
                                    break L40;
                                  }
                                }
                                L41: {
                                  if (var4_int != 9) {
                                    break L41;
                                  } else {
                                    var3 = (Object) (Object) ml.a("", (byte) 119, bh.field_a, "anim_shatter4");
                                    break L41;
                                  }
                                }
                                rh.field_a[var4_int] = (pb) ((Object[]) var3)[0];
                                rh.field_a[var4_int + 1] = (pb) ((Object[]) var3)[1];
                                rh.field_a[2 + var4_int] = (pb) ((Object[]) var3)[2];
                                rh.field_a[var4_int].d();
                                rh.field_a[1 + var4_int].d();
                                rh.field_a[2 + var4_int].d();
                                var4_int += 3;
                                if (var11 == 0) {
                                  continue L35;
                                } else {
                                  break L37;
                                }
                              }
                            }
                          }
                          fa.field_k = new pb[15];
                          stackOut_201_0 = 0;
                          stackIn_202_0 = stackOut_201_0;
                          break L36;
                        }
                        var4_int = stackIn_202_0;
                        L42: while (true) {
                          L43: {
                            L44: {
                              if (var4_int >= 15) {
                                break L44;
                              } else {
                                stackOut_204_0 = var4_int;
                                stackIn_226_0 = stackOut_204_0;
                                stackIn_205_0 = stackOut_204_0;
                                if (var11 != 0) {
                                  break L43;
                                } else {
                                  L45: {
                                    if (stackIn_205_0 == 0) {
                                      var3 = (Object) (Object) ml.a("", (byte) 121, bh.field_a, "anim_shine");
                                      break L45;
                                    } else {
                                      break L45;
                                    }
                                  }
                                  L46: {
                                    if (var4_int == 3) {
                                      var3 = (Object) (Object) ml.a("", (byte) 118, bh.field_a, "anim_shine2");
                                      break L46;
                                    } else {
                                      break L46;
                                    }
                                  }
                                  L47: {
                                    if (6 != var4_int) {
                                      break L47;
                                    } else {
                                      var3 = (Object) (Object) ml.a("", (byte) 110, bh.field_a, "anim_shine3");
                                      break L47;
                                    }
                                  }
                                  L48: {
                                    if (9 == var4_int) {
                                      var3 = (Object) (Object) ml.a("", (byte) 83, bh.field_a, "anim_shine4");
                                      break L48;
                                    } else {
                                      break L48;
                                    }
                                  }
                                  L49: {
                                    if (var4_int == 12) {
                                      var3 = (Object) (Object) ml.a("", (byte) -25, bh.field_a, "anim_shine5");
                                      break L49;
                                    } else {
                                      break L49;
                                    }
                                  }
                                  fa.field_k[var4_int] = (pb) ((Object[]) var3)[0];
                                  fa.field_k[1 + var4_int] = (pb) ((Object[]) var3)[1];
                                  fa.field_k[2 + var4_int] = (pb) ((Object[]) var3)[2];
                                  fa.field_k[var4_int].d();
                                  fa.field_k[1 + var4_int].d();
                                  fa.field_k[2 + var4_int].d();
                                  var4_int += 3;
                                  if (var11 == 0) {
                                    continue L42;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                            }
                            pb discarded$8 = qd.a(bh.field_a, "title", "", (byte) 119);
                            qj.field_a = ae.a("", "b12", bh.field_a, -115, be.field_d);
                            stackOut_225_0 = 7;
                            stackIn_226_0 = stackOut_225_0;
                            break L43;
                          }
                          var4_array = new ek[stackIn_226_0];
                          var5_ref_int__ = new int[7];
                          var6_int = 0;
                          L50: while (true) {
                            L51: {
                              L52: {
                                if (var6_int >= 7) {
                                  break L52;
                                } else {
                                  var5_ref_int__[var6_int] = 12;
                                  var6_int++;
                                  if (var11 != 0) {
                                    break L51;
                                  } else {
                                    if (var11 == 0) {
                                      continue L50;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                              }
                              var4_array[0] = el.a("keyboard_up", bh.field_a, (byte) -90, "");
                              var4_array[1] = el.a("keyboard_space", bh.field_a, (byte) -74, "");
                              var4_array[2] = el.a("keyboard_ctrl", bh.field_a, (byte) -123, "");
                              var4_array[3] = el.a("keyboard_esc", bh.field_a, (byte) 127, "");
                              var4_array[4] = el.a("keyboard_left", bh.field_a, (byte) -82, "");
                              var4_array[5] = el.a("keyboard_right", bh.field_a, (byte) -116, "");
                              var4_array[6] = el.a("keyboard_down", bh.field_a, (byte) 126, "");
                              qj.field_a.a((o[]) (Object) var4_array, var5_ref_int__);
                              l.field_f = ae.a("", "b122", bh.field_a, -117, be.field_d);
                              rg.g(-33);
                              break L51;
                            }
                            return;
                          }
                        }
                      }
                    } else {
                      rd.a((byte) -65, 99.0f, ua.field_g);
                      ((stellarshard) this).d(-20880);
                      var3 = (Object) (Object) ml.a("", (byte) 80, bh.field_a, "screenshots");
                      sd.a(qd.a(bh.field_a, "mbfg", "", (byte) 104), (byte) 60, "Stellar Shard");
                      ga.a(-8039, qd.a(bh.field_a, "smalllogo", "", (byte) 124));
                      te.a(8, 129, 1500, 0, qd.a(bh.field_a, "mbpb", "", (byte) 124), 40, 134, 97, 0);
                      q.a(118, (pb[]) var3);
                      ie.field_u = null;
                      fb.a(192, sg.field_c, 0, (java.applet.Applet) this, -1, 16777215);
                      var4_ref = new pb(128, 128);
                      mf.field_a = new pb[64];
                      var5 = 0;
                      L53: while (true) {
                        stackOut_235_0 = ~var5;
                        stackIn_236_0 = stackOut_235_0;
                        L54: while (true) {
                          L55: {
                            L56: {
                              if (stackIn_236_0 <= -5) {
                                break L56;
                              } else {
                                var6 = null;
                                stackOut_237_0 = var5;
                                stackIn_275_0 = stackOut_237_0;
                                stackIn_238_0 = stackOut_237_0;
                                if (var11 != 0) {
                                  break L55;
                                } else {
                                  L57: {
                                    if (stackIn_238_0 != 0) {
                                      break L57;
                                    } else {
                                      var6 = (Object) (Object) "stars2";
                                      break L57;
                                    }
                                  }
                                  L58: {
                                    if (var5 != 1) {
                                      break L58;
                                    } else {
                                      var6 = (Object) (Object) "stars3";
                                      break L58;
                                    }
                                  }
                                  L59: {
                                    if (var5 == 2) {
                                      var6 = (Object) (Object) "stars0";
                                      break L59;
                                    } else {
                                      break L59;
                                    }
                                  }
                                  L60: {
                                    if (3 != var5) {
                                      break L60;
                                    } else {
                                      var6 = (Object) (Object) "stars1";
                                      break L60;
                                    }
                                  }
                                  var7 = n.a(qd.a(bh.field_a, (String) var6, "", (byte) 42), (byte) -42, true);
                                  var7.e();
                                  ti.d(1, 1, 0, 0, 496, 496);
                                  var8 = ti.field_a;
                                  var9 = 0;
                                  L61: while (true) {
                                    L62: {
                                      L63: {
                                        if (var8.length <= var9) {
                                          break L63;
                                        } else {
                                          stackOut_252_0 = ~var8[var9];
                                          stackOut_252_1 = -1;
                                          stackIn_261_0 = stackOut_252_0;
                                          stackIn_261_1 = stackOut_252_1;
                                          stackIn_253_0 = stackOut_252_0;
                                          stackIn_253_1 = stackOut_252_1;
                                          if (var11 != 0) {
                                            break L62;
                                          } else {
                                            L64: {
                                              if (stackIn_253_0 == stackIn_253_1) {
                                                var8[var9] = 1;
                                                break L64;
                                              } else {
                                                break L64;
                                              }
                                            }
                                            var9++;
                                            if (var11 == 0) {
                                              continue L61;
                                            } else {
                                              break L63;
                                            }
                                          }
                                        }
                                      }
                                      var9 = 0;
                                      stackOut_260_0 = ~var9;
                                      stackOut_260_1 = -5;
                                      stackIn_261_0 = stackOut_260_0;
                                      stackIn_261_1 = stackOut_260_1;
                                      break L62;
                                    }
                                    L65: while (true) {
                                      L66: {
                                        if (stackIn_261_0 <= stackIn_261_1) {
                                          break L66;
                                        } else {
                                          stackOut_262_0 = 0;
                                          stackIn_236_0 = stackOut_262_0;
                                          stackIn_263_0 = stackOut_262_0;
                                          if (var11 != 0) {
                                            continue L54;
                                          } else {
                                            stackOut_263_0 = stackIn_263_0;
                                            stackIn_265_0 = stackOut_263_0;
                                            var10 = stackIn_265_0;
                                            L67: while (true) {
                                              L68: {
                                                L69: {
                                                  if (var10 >= 4) {
                                                    break L69;
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
                                                    if (var11 != 0) {
                                                      break L68;
                                                    } else {
                                                      if (var11 == 0) {
                                                        continue L67;
                                                      } else {
                                                        break L69;
                                                      }
                                                    }
                                                  }
                                                }
                                                var9++;
                                                break L68;
                                              }
                                              if (var11 == 0) {
                                                stackOut_260_0 = ~var9;
                                                stackOut_260_1 = -5;
                                                stackIn_261_0 = stackOut_260_0;
                                                stackIn_261_1 = stackOut_260_1;
                                                continue L65;
                                              } else {
                                                break L66;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      pd.field_h.a((byte) -107);
                                      var5++;
                                      if (var11 == 0) {
                                        continue L53;
                                      } else {
                                        break L56;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            be.field_d = null;
                            bh.field_a = null;
                            stackOut_274_0 = -33;
                            stackIn_275_0 = stackOut_274_0;
                            break L55;
                          }
                          rg.g(stackIn_275_0);
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                L70: {
                  rd.a((byte) -60, 100.0f, ve.field_b);
                  ((stellarshard) this).d(-20880);
                  kl.field_k = 16777215;
                  ul.field_G = 10742263;
                  if (param1 < -60) {
                    break L70;
                  } else {
                    int discarded$9 = ((stellarshard) this).a(70, -17);
                    break L70;
                  }
                }
                L71: {
                  vf.field_L = fe.field_c;
                  lg.field_b = 5883647;
                  aj.a(50, 11236);
                  ef.a(50, (byte) 63);
                  fe.field_c = new d(oe.field_a);
                  if (vf.field_L != null) {
                    nj.field_o.b((p) (Object) vf.field_L);
                    vf.field_L.c();
                    nj.field_o.a((p) (Object) vf.field_L);
                    break L71;
                  } else {
                    break L71;
                  }
                }
                L72: {
                  vf.field_L = fe.field_c;
                  nj.field_o.a((p) (Object) vf.field_L);
                  vf.field_L.d(ai.field_c / 2);
                  if (ah.a(-1)) {
                    break L72;
                  } else {
                    be.field_g = ab.a(-5094, 4);
                    wh.a(-124);
                    break L72;
                  }
                }
                hf.field_f = true;
                rg.g(-33);
                break L0;
              }
            } else {
              L73: {
                if (!wk.field_a.a((byte) -36)) {
                  break L73;
                } else {
                  if (!wk.field_a.c((byte) -111)) {
                    break L73;
                  } else {
                    L74: {
                      if (!mf.field_b.a((byte) -36)) {
                        break L74;
                      } else {
                        if (mf.field_b.c((byte) -111)) {
                          L75: {
                            if (!ka.field_n.a((byte) -36)) {
                              break L75;
                            } else {
                              if (ka.field_n.c((byte) -111)) {
                                L76: {
                                  if (!bh.field_a.a((byte) -36)) {
                                    break L76;
                                  } else {
                                    if (!bh.field_a.c((byte) -111)) {
                                      break L76;
                                    } else {
                                      L77: {
                                        if (!fc.field_a.a((byte) -36)) {
                                          break L77;
                                        } else {
                                          if (!fc.field_a.a("basic", (byte) -109)) {
                                            break L77;
                                          } else {
                                            L78: {
                                              if (!be.field_d.a((byte) -36)) {
                                                break L78;
                                              } else {
                                                if (be.field_d.c((byte) -111)) {
                                                  L79: {
                                                    if (!jf.field_m.a((byte) -36)) {
                                                      break L79;
                                                    } else {
                                                      if (jf.field_m.c((byte) -111)) {
                                                        rd.a((byte) -72, 70.0f, ve.field_b);
                                                        if (param0) {
                                                          L80: {
                                                            L81: {
                                                              hi.b((byte) 109);
                                                              ((stellarshard) this).d(-20880);
                                                              var3 = (Object) (Object) new qh(22050, ba.field_m);
                                                              if (pk.a(-12663, 0)) {
                                                                break L81;
                                                              } else {
                                                                sb.field_e = new ud[41];
                                                                if (var11 == 0) {
                                                                  break L80;
                                                                } else {
                                                                  break L81;
                                                                }
                                                              }
                                                            }
                                                            sb.field_e = new ud[61];
                                                            break L80;
                                                          }
                                                          L82: {
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
                                                              break L82;
                                                            } else {
                                                              break L82;
                                                            }
                                                          }
                                                          L83: {
                                                            L84: {
                                                              var4_ref2 = new gk(wk.field_a, mf.field_b);
                                                              wk.field_a = null;
                                                              mf.field_b = null;
                                                              if (!pk.a(-12663, 0)) {
                                                                break L84;
                                                              } else {
                                                                oe.field_a = ij.a(576, var4_ref2, "music/Stellar_Shard_Halloween", ka.field_n, "");
                                                                if (var11 == 0) {
                                                                  break L83;
                                                                } else {
                                                                  break L84;
                                                                }
                                                              }
                                                            }
                                                            oe.field_a = ij.a(576, var4_ref2, "music/Stellar_Shard_ingame", ka.field_n, "");
                                                            break L83;
                                                          }
                                                          ka.field_n = null;
                                                          rg.g(-33);
                                                          return;
                                                        } else {
                                                          return;
                                                        }
                                                      } else {
                                                        break L79;
                                                      }
                                                    }
                                                  }
                                                  rd.a((byte) -115, 60.0f, ak.a("", he.field_o, jf.field_m, (byte) 51, lj.field_B));
                                                  return;
                                                } else {
                                                  break L78;
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
                                break L75;
                              }
                            }
                          }
                          rd.a((byte) -63, 20.0f, ak.a("", qh.field_f, ka.field_n, (byte) 51, qd.field_e));
                          return;
                        } else {
                          break L74;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Object) (Object) decompiledCaughtException;
          throw ma.a((Throwable) var3, "stellarshard.UA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void n(int param0) {
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
                int fieldTemp$4 = vh.field_e;
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
              if (e.field_e != 8) {
                break L3;
              } else {
                int fieldTemp$5 = sf.field_b;
                sf.field_b = sf.field_b + 1;
                if (fieldTemp$5 != 5) {
                  break L3;
                } else {
                  hj.a(253, 2, 1);
                  break L3;
                }
              }
            }
            L4: {
              if (e.field_e == 9) {
                int fieldTemp$6 = sj.field_K;
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
                int fieldTemp$7 = ua.field_d;
                ua.field_d = ua.field_d + 1;
                if (fieldTemp$7 == 5) {
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
                L9: {
                  var3_ref_fk = new fk(0, -1 + qi.field_a, 0, 0, 0, 0);
                  if (ah.a(-1)) {
                    break L9;
                  } else {
                    hf.a(var3_ref_fk, 89, 5);
                    if (var5 == 0) {
                      break L7;
                    } else {
                      break L9;
                    }
                  }
                }
                tf.field_a.b(-113, (gg) (Object) var3_ref_fk);
                of.field_A = var2_int;
                break L7;
              } else {
                break L7;
              }
            }
            L10: {
              if (10 > qi.field_a) {
                break L10;
              } else {
                if (nc.field_A > 0) {
                  break L10;
                } else {
                  if (mk.field_k > 0) {
                    break L10;
                  } else {
                    if (!s.field_i) {
                      break L10;
                    } else {
                      nc.field_A = 1500;
                      break L10;
                    }
                  }
                }
              }
            }
            L11: {
              if (null == ((stellarshard) this).field_F) {
                ((stellarshard) this).field_F = new pb(640, 480);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (qi.field_a <= 50) {
                break L12;
              } else {
                qi.field_a = 50;
                if (nc.field_A <= 0) {
                  nc.field_A = 1500;
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            L13: {
              if (qi.field_a != 1) {
                break L13;
              } else {
                ((stellarshard) this).field_J = 100;
                break L13;
              }
            }
            L14: {
              if (10 != qi.field_a) {
                break L14;
              } else {
                if (!nf.field_r) {
                  break L14;
                } else {
                  hj.a(249, 6, 1);
                  break L14;
                }
              }
            }
            L15: {
              if (qi.field_a != 20) {
                break L15;
              } else {
                if (nf.field_r) {
                  hj.a(248, 7, 1);
                  break L15;
                } else {
                  break L15;
                }
              }
            }
            L16: {
              if (qi.field_a != 10) {
                break L16;
              } else {
                if (!field_K) {
                  break L16;
                } else {
                  hj.a(247, 8, 1);
                  break L16;
                }
              }
            }
            L17: {
              if (30 != qi.field_a) {
                break L17;
              } else {
                if (!field_K) {
                  break L17;
                } else {
                  hj.a(246, 9, 1);
                  break L17;
                }
              }
            }
            L18: {
              if (qi.field_a != 50) {
                break L18;
              } else {
                if (!field_K) {
                  break L18;
                } else {
                  hj.a(245, 10, param0 + -2);
                  break L18;
                }
              }
            }
            L19: {
              var2_array = new int[16];
              if (qi.field_a != 1) {
                break L19;
              } else {
                var2_array[1] = 4;
                break L19;
              }
            }
            L20: {
              if (2 != qi.field_a) {
                break L20;
              } else {
                var2_array[1] = 6;
                break L20;
              }
            }
            L21: {
              if (qi.field_a != param0) {
                break L21;
              } else {
                var2_array[1] = 4;
                var2_array[3] = 4;
                break L21;
              }
            }
            L22: {
              if (qi.field_a == 6) {
                var2_array[5] = 6;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (qi.field_a != 4) {
                break L23;
              } else {
                var2_array[13] = 2;
                var2_array[1] = 8;
                break L23;
              }
            }
            L24: {
              if (qi.field_a == 5) {
                var2_array[12] = 2;
                var2_array[3] = 8;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (qi.field_a == 8) {
                var2_array[5] = 8;
                var2_array[7] = 1;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (qi.field_a != 7) {
                break L26;
              } else {
                var2_array[15] = 2;
                var2_array[1] = 10;
                break L26;
              }
            }
            L27: {
              if (qi.field_a != 9) {
                break L27;
              } else {
                var2_array[6] = 1;
                var2_array[3] = 8;
                break L27;
              }
            }
            L28: {
              if (qi.field_a != 10) {
                break L28;
              } else {
                var2_array[14] = 1;
                var2_array[1] = 5;
                break L28;
              }
            }
            L29: {
              if (10 < qi.field_a) {
                L30: {
                  if (qi.field_a % 10 == 1) {
                    var2_array[1] = qi.field_a / 2 - -5;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (4 == qi.field_a % 10) {
                    var2_array[15] = qi.field_a / 10 - -1;
                    var2_array[5] = qi.field_a / 3 - -5;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (3 == qi.field_a % 10) {
                    var2_array[12] = qi.field_a / 5;
                    var2_array[3] = 5 + qi.field_a / 3;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (qi.field_a % 10 == 2) {
                    var2_array[1] = 5 + qi.field_a / 3;
                    var2_array[13] = qi.field_a / 5;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (qi.field_a % 10 == 5) {
                    var2_array[1] = qi.field_a / 4 + 3;
                    var2_array[14] = 1;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (qi.field_a % 10 == 7) {
                    var2_array[6] = qi.field_a / 10;
                    var2_array[5] = qi.field_a / 3 - -5;
                    var2_array[12] = qi.field_a / 5;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (6 == qi.field_a % 10) {
                    var2_array[7] = qi.field_a / 10;
                    var2_array[13] = qi.field_a / 5;
                    var2_array[3] = qi.field_a / 3 - -5;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (8 != qi.field_a % 10) {
                    break L37;
                  } else {
                    var2_array[15] = qi.field_a / 6;
                    var2_array[1] = qi.field_a / 4 + 3;
                    break L37;
                  }
                }
                L38: {
                  if (qi.field_a % 10 != 9) {
                    break L38;
                  } else {
                    var2_array[3] = qi.field_a / 6;
                    var2_array[1] = qi.field_a / 6;
                    var2_array[5] = qi.field_a / 6;
                    break L38;
                  }
                }
                L39: {
                  if (qi.field_a == 20) {
                    var2_array[14] = 1;
                    var2_array[7] = 10;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                L40: {
                  if (qi.field_a != 30) {
                    break L40;
                  } else {
                    var2_array[14] = 2;
                    var2_array[6] = 10;
                    break L40;
                  }
                }
                L41: {
                  if (qi.field_a != 40) {
                    break L41;
                  } else {
                    var2_array[14] = 4;
                    var2_array[6] = 5;
                    var2_array[7] = 5;
                    var2_array[15] = 5;
                    break L41;
                  }
                }
                L42: {
                  if (qi.field_a != 50) {
                    break L42;
                  } else {
                    var2_array[14] = qi.field_a / 5;
                    break L42;
                  }
                }
                if (qi.field_a % 10 != 0) {
                  break L29;
                } else {
                  if (qi.field_a <= 50) {
                    break L29;
                  } else {
                    var2_array[14] = qi.field_a / 5;
                    break L29;
                  }
                }
              } else {
                break L29;
              }
            }
            var3 = 0;
            L43: while (true) {
              L44: {
                L45: {
                  if (var3 >= 16) {
                    break L45;
                  } else {
                    if (var5 != 0) {
                      break L44;
                    } else {
                      var4 = 0;
                      L46: while (true) {
                        L47: {
                          L48: {
                            if (~var4 <= ~var2_array[var3]) {
                              break L48;
                            } else {
                              a.field_h[pl.e((byte) 63)] = new qe(var3);
                              var4++;
                              if (var5 != 0) {
                                break L47;
                              } else {
                                if (var5 == 0) {
                                  continue L46;
                                } else {
                                  break L48;
                                }
                              }
                            }
                          }
                          var3++;
                          break L47;
                        }
                        if (var5 == 0) {
                          continue L43;
                        } else {
                          break L45;
                        }
                      }
                    }
                  }
                }
                break L44;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "stellarshard.FB(" + param0 + ')');
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
                  s.field_e = wb.a(0, -107, 480, ic.field_d, 640, 0);
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
        Object var2_ref = null;
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
        Object stackIn_88_0 = null;
        Object stackIn_90_0 = null;
        Object stackIn_126_0 = null;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_141_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_174_0 = 0;
        int stackIn_174_1 = 0;
        int stackIn_251_0 = 0;
        int stackIn_251_1 = 0;
        int stackIn_258_0 = 0;
        int stackIn_258_1 = 0;
        int stackIn_424_0 = 0;
        int stackIn_424_1 = 0;
        int stackIn_438_0 = 0;
        int stackIn_438_1 = 0;
        int stackIn_440_0 = 0;
        int stackIn_440_1 = 0;
        int stackIn_447_0 = 0;
        int stackIn_447_1 = 0;
        int stackIn_511_0 = 0;
        Object stackIn_516_0 = null;
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
        Object stackOut_87_0 = null;
        Object stackOut_124_0 = null;
        Object stackOut_88_0 = null;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_134_0 = 0;
        int stackOut_134_1 = 0;
        int stackOut_173_0 = 0;
        int stackOut_173_1 = 0;
        int stackOut_140_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_147_1 = 0;
        int stackOut_250_0 = 0;
        int stackOut_250_1 = 0;
        int stackOut_257_0 = 0;
        int stackOut_257_1 = 0;
        int stackOut_423_0 = 0;
        int stackOut_423_1 = 0;
        int stackOut_439_0 = 0;
        int stackOut_439_1 = 0;
        int stackOut_437_0 = 0;
        int stackOut_437_1 = 0;
        int stackOut_446_0 = 0;
        int stackOut_446_1 = 0;
        int stackOut_510_0 = 0;
        boolean stackOut_508_0 = false;
        java.awt.Canvas stackOut_515_0 = null;
        va stackOut_513_0 = null;
        var2_ref = null;
        var20 = field_B;
        try {
          L0: {
            L1: {
              if (s.field_e != null) {
                stackOut_4_0 = s.field_e;
                stackIn_5_0 = (Object) (Object) stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = qd.field_j;
                stackIn_5_0 = (Object) (Object) stackOut_2_0;
                break L1;
              }
            }
            var2_ref = stackIn_5_0;
            if (ee.b(93)) {
              L2: {
                stackOut_8_0 = var2_ref;
                stackOut_8_1 = -11;
                stackIn_11_0 = (RuntimeException) (Object) stackOut_8_0;
                stackIn_11_1 = stackOut_8_1;
                stackIn_9_0 = (RuntimeException) (Object) stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (s.field_e != null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L2;
                } else {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = ua.field_b;
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_12_1 = stackOut_9_1;
                  stackIn_12_2 = stackOut_9_2 ? 1 : 0;
                  break L2;
                }
              }
              rl.a((java.awt.Canvas) (Object) stackIn_12_0, stackIn_12_1, stackIn_12_2 != 0);
              return;
            } else {
              if (hf.field_f) {
                if (null == be.field_g) {
                  if (null == gg.field_f) {
                    L3: {
                      L4: {
                        if (null != ((stellarshard) this).field_F) {
                          var3 = 0;
                          var4 = -((stellarshard) this).field_F.field_z.length;
                          L5: while (true) {
                            if (var4 >= 0) {
                              break L4;
                            } else {
                              int incrementValue$9 = var3;
                              var3++;
                              ((stellarshard) this).field_F.field_z[incrementValue$9] = pd.field_h.field_e[incrementValue$9];
                              var4++;
                              if (var20 != 0) {
                                break L3;
                              } else {
                                if (var20 == 0) {
                                  continue L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      if (null != na.field_j) {
                        break L3;
                      } else {
                        if (s.field_i) {
                          break L3;
                        } else {
                          L6: {
                            if (wh.field_c > 1) {
                              break L6;
                            } else {
                              if (ni.field_a) {
                                break L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            na.field_j = new ij((stellarshard) this);
                            if (!ni.field_a) {
                              tl.field_c = 4;
                              na.field_j.field_l = 8;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          ni.field_a = false;
                          break L3;
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
                      if (null == ((stellarshard) this).field_F) {
                        break L12;
                      } else {
                        if (el.field_I <= 0) {
                          break L12;
                        } else {
                          if (na.field_j == null) {
                            ((stellarshard) this).field_F.e(0, 0, 5 * el.field_I);
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
                        String discarded$10 = stellarshard.a(true, false, -57, true);
                        break L13;
                      }
                    }
                    var4 = 0;
                    L14: while (true) {
                      L15: {
                        L16: {
                          if (var4 >= 12) {
                            break L16;
                          } else {
                            ei.field_D[var4].d((fk.field_k[var3] >> 4) - 128, (fk.field_k[var3 - -1] >> 4) + -128, 128 - el.field_I * 2);
                            var3 += 8;
                            var4 += 2;
                            if (var20 != 0) {
                              break L15;
                            } else {
                              if (var20 == 0) {
                                continue L14;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        var3 = 0;
                        break L15;
                      }
                      L17: while (true) {
                        L18: {
                          L19: {
                            L20: {
                              if (var3 >= 1000) {
                                break L20;
                              } else {
                                stackOut_87_0 = null;
                                stackIn_126_0 = stackOut_87_0;
                                stackIn_88_0 = stackOut_87_0;
                                if (var20 != 0) {
                                  L21: while (true) {
                                    L22: {
                                      if (stackIn_126_0 == (Object) (Object) hf.field_e[var3]) {
                                        break L22;
                                      } else {
                                        hf.field_e[var3].a(true);
                                        break L22;
                                      }
                                    }
                                    var3++;
                                    if (var20 == 0) {
                                      if (1000 <= var3) {
                                        break L19;
                                      } else {
                                        if (var20 != 0) {
                                          break L18;
                                        } else {
                                          stackOut_124_0 = null;
                                          stackIn_126_0 = stackOut_124_0;
                                          continue L21;
                                        }
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                } else {
                                  stackOut_88_0 = stackIn_88_0;
                                  stackIn_90_0 = stackOut_88_0;
                                  L23: {
                                    if (stackIn_90_0 == (Object) (Object) a.field_h[var3]) {
                                      break L23;
                                    } else {
                                      if (a.field_h[var3].field_m == 14) {
                                        break L23;
                                      } else {
                                        if (!a.field_h[var3].a((byte) -96)) {
                                          a.field_h[var3].e(106);
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                  }
                                  var3++;
                                  if (var20 == 0) {
                                    continue L17;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            L24: {
                              L25: {
                                if (((stellarshard) this).field_G == null) {
                                  break L25;
                                } else {
                                  ((stellarshard) this).field_G.e();
                                  ti.f(0, 0, 640, 480, 0);
                                  pd.field_h.a((byte) -107);
                                  if (var20 == 0) {
                                    break L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                              ((stellarshard) this).field_G = new pb(640, 480);
                              break L24;
                            }
                            var3 = 0;
                            L26: while (true) {
                              L27: {
                                L28: {
                                  if (var3 >= 3000) {
                                    break L28;
                                  } else {
                                    if (var20 != 0) {
                                      break L27;
                                    } else {
                                      L29: {
                                        if (wk.field_b[var3] != null) {
                                          wk.field_b[var3].a(-57, ((stellarshard) this).field_G);
                                          break L29;
                                        } else {
                                          break L29;
                                        }
                                      }
                                      var3++;
                                      if (var20 == 0) {
                                        continue L26;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                }
                                var3 = 0;
                                break L27;
                              }
                              L30: while (true) {
                                if (1000 <= var3) {
                                  break L19;
                                } else {
                                  if (var20 != 0) {
                                    break L18;
                                  } else {
                                    stackOut_124_0 = null;
                                    stackIn_126_0 = stackOut_124_0;
                                    L31: {
                                      if (stackIn_126_0 == (Object) (Object) hf.field_e[var3]) {
                                        break L31;
                                      } else {
                                        hf.field_e[var3].a(true);
                                        break L31;
                                      }
                                    }
                                    var3++;
                                    if (var20 == 0) {
                                      continue L30;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var3 = 0;
                          var3 = var3 + ((stellarshard) this).field_G.field_t;
                          break L18;
                        }
                        var5_int = 0;
                        L32: while (true) {
                          stackOut_132_0 = ((stellarshard) this).field_G.field_y;
                          stackOut_132_1 = var5_int;
                          stackIn_133_0 = stackOut_132_0;
                          stackIn_133_1 = stackOut_132_1;
                          L33: while (true) {
                            L34: {
                              L35: {
                                L36: {
                                  if (stackIn_133_0 <= stackIn_133_1) {
                                    break L36;
                                  } else {
                                    var6_int = var3;
                                    var7 = var5_int * ((stellarshard) this).field_G.field_v;
                                    stackOut_134_0 = ~var6_int;
                                    stackOut_134_1 = -1;
                                    stackIn_174_0 = stackOut_134_0;
                                    stackIn_174_1 = stackOut_134_1;
                                    stackIn_135_0 = stackOut_134_0;
                                    stackIn_135_1 = stackOut_134_1;
                                    if (var20 != 0) {
                                      L37: while (true) {
                                        if (stackIn_174_0 <= stackIn_174_1) {
                                          break L35;
                                        } else {
                                          if (var20 != 0) {
                                            break L34;
                                          } else {
                                            L38: {
                                              if (a.field_h[var5_int] == null) {
                                                break L38;
                                              } else {
                                                L39: {
                                                  if (14 == a.field_h[var5_int].field_m) {
                                                    break L39;
                                                  } else {
                                                    if (!a.field_h[var5_int].a((byte) -83)) {
                                                      break L38;
                                                    } else {
                                                      break L39;
                                                    }
                                                  }
                                                }
                                                a.field_h[var5_int].e(122);
                                                break L38;
                                              }
                                            }
                                            var5_int++;
                                            if (var20 == 0) {
                                              stackOut_173_0 = 1000;
                                              stackOut_173_1 = var5_int;
                                              stackIn_174_0 = stackOut_173_0;
                                              stackIn_174_1 = stackOut_173_1;
                                              continue L37;
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L40: {
                                        if (stackIn_135_0 > stackIn_135_1) {
                                          stackOut_140_0 = -var6_int;
                                          stackIn_141_0 = stackOut_140_0;
                                          break L40;
                                        } else {
                                          stackOut_138_0 = 0;
                                          stackIn_141_0 = stackOut_138_0;
                                          break L40;
                                        }
                                      }
                                      L41: {
                                        var8 = stackIn_141_0;
                                        if (((stellarshard) this).field_G.field_v + var6_int <= 640) {
                                          stackOut_144_0 = ((stellarshard) this).field_G.field_v;
                                          stackIn_145_0 = stackOut_144_0;
                                          break L41;
                                        } else {
                                          stackOut_142_0 = 640 + -var6_int;
                                          stackIn_145_0 = stackOut_142_0;
                                          break L41;
                                        }
                                      }
                                      var9 = stackIn_145_0;
                                      var10_int = var8;
                                      L42: while (true) {
                                        L43: {
                                          if (~var10_int <= ~var9) {
                                            break L43;
                                          } else {
                                            var4 = ((stellarshard) this).field_G.field_z[var7 + var10_int];
                                            stackOut_147_0 = -1;
                                            stackOut_147_1 = ~var4;
                                            stackIn_133_0 = stackOut_147_0;
                                            stackIn_133_1 = stackOut_147_1;
                                            stackIn_148_0 = stackOut_147_0;
                                            stackIn_148_1 = stackOut_147_1;
                                            if (var20 != 0) {
                                              continue L33;
                                            } else {
                                              L44: {
                                                if (stackIn_148_0 > stackIn_148_1) {
                                                  L45: {
                                                    if (var4 <= 0) {
                                                      break L45;
                                                    } else {
                                                      if (var4 <= 96) {
                                                        ((stellarshard) this).field_G.field_z[var7 + var10_int] = var4 * 255 / 96 << 16;
                                                        break L45;
                                                      } else {
                                                        break L45;
                                                      }
                                                    }
                                                  }
                                                  L46: {
                                                    if (var4 <= 96) {
                                                      break L46;
                                                    } else {
                                                      if (var4 < 160) {
                                                        ((stellarshard) this).field_G.field_z[var7 + var10_int] = 16711680 - -((-24480 + 255 * var4) / 64 << 8);
                                                        break L46;
                                                      } else {
                                                        break L46;
                                                      }
                                                    }
                                                  }
                                                  if (160 > var4) {
                                                    break L44;
                                                  } else {
                                                    if (var4 >= 255) {
                                                      break L44;
                                                    } else {
                                                      ((stellarshard) this).field_G.field_z[var10_int + var7] = 255 * (-160 + var4) / 95 + 16776960;
                                                      break L44;
                                                    }
                                                  }
                                                } else {
                                                  break L44;
                                                }
                                              }
                                              var10_int++;
                                              if (var20 == 0) {
                                                continue L42;
                                              } else {
                                                break L43;
                                              }
                                            }
                                          }
                                        }
                                        var5_int++;
                                        if (var20 == 0) {
                                          continue L32;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                  }
                                }
                                ((stellarshard) this).field_G.d(0, 0, 255);
                                var5_int = 0;
                                L47: while (true) {
                                  stackOut_173_0 = 1000;
                                  stackOut_173_1 = var5_int;
                                  stackIn_174_0 = stackOut_173_0;
                                  stackIn_174_1 = stackOut_173_1;
                                  if (stackIn_174_0 <= stackIn_174_1) {
                                    break L35;
                                  } else {
                                    if (var20 != 0) {
                                      break L34;
                                    } else {
                                      L48: {
                                        if (a.field_h[var5_int] == null) {
                                          break L48;
                                        } else {
                                          L49: {
                                            if (14 == a.field_h[var5_int].field_m) {
                                              break L49;
                                            } else {
                                              if (!a.field_h[var5_int].a((byte) -83)) {
                                                break L48;
                                              } else {
                                                break L49;
                                              }
                                            }
                                          }
                                          a.field_h[var5_int].e(122);
                                          break L48;
                                        }
                                      }
                                      var5_int++;
                                      if (var20 == 0) {
                                        continue L47;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                              }
                              var5_int = 4;
                              break L34;
                            }
                            var6_int = 1;
                            L50: while (true) {
                              L51: {
                                L52: {
                                  if (var6_int >= 12) {
                                    break L52;
                                  } else {
                                    ei.field_D[var6_int].d(-128 + (fk.field_k[var5_int] >> 4), -128 + (fk.field_k[1 + var5_int] >> 4), -(el.field_I * 2) + 128);
                                    var5_int += 8;
                                    var6_int += 2;
                                    if (var20 != 0) {
                                      break L51;
                                    } else {
                                      if (var20 == 0) {
                                        continue L50;
                                      } else {
                                        break L52;
                                      }
                                    }
                                  }
                                }
                                if (!pk.a(param0 ^ 24825, 0)) {
                                  break L51;
                                } else {
                                  if (s.field_i) {
                                    L53: {
                                      if (ag.field_a <= 0) {
                                        break L53;
                                      } else {
                                        if (128 <= ag.field_a) {
                                          break L53;
                                        } else {
                                          ti.e(10, 330, 4, 16711680);
                                          break L53;
                                        }
                                      }
                                    }
                                    L54: {
                                      if (ag.field_a <= 0) {
                                        break L54;
                                      } else {
                                        if (ag.field_a < 128) {
                                          qj.field_a.a(nd.field_F, 20, 335, 16711680, -1);
                                          break L54;
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                    var5_int = gf.field_c;
                                    var6_int = 100;
                                    if (ml.field_h <= 0) {
                                      break L51;
                                    } else {
                                      if (~var6_int <= ~var5_int) {
                                        L55: {
                                          L56: {
                                            var7 = 32;
                                            var8 = var7 >> 1;
                                            if (16 > var5_int) {
                                              break L56;
                                            } else {
                                              if (~(-64 + var6_int) > ~var5_int) {
                                                var7 = -var5_int + var6_int;
                                                if (var20 == 0) {
                                                  break L55;
                                                } else {
                                                  break L56;
                                                }
                                              } else {
                                                break L55;
                                              }
                                            }
                                          }
                                          var7 = var5_int * 4;
                                          break L55;
                                        }
                                        var9 = (int)((Math.exp((double)((float)(-var5_int) / 20.0f)) - Math.exp((double)((float)(-var6_int) / 20.0f))) * 200.0);
                                        ja.a(320, 2 * var5_int, var8, 240, false, var9, 256, 1);
                                        break L51;
                                      } else {
                                        break L51;
                                      }
                                    }
                                  } else {
                                    break L51;
                                  }
                                }
                              }
                              L57: {
                                if (s.field_i) {
                                  var5_int = 148;
                                  ti.b(1, 351, var5_int, 128, 65280, 64);
                                  ti.d(2, 352, var5_int + -1, 478);
                                  var6_int = 0;
                                  L58: while (true) {
                                    L59: {
                                      L60: {
                                        if (1000 <= var6_int) {
                                          break L60;
                                        } else {
                                          if (var20 != 0) {
                                            break L59;
                                          } else {
                                            L61: {
                                              if (a.field_h[var6_int] != null) {
                                                a.field_h[var6_int].a(false);
                                                break L61;
                                              } else {
                                                break L61;
                                              }
                                            }
                                            var6_int++;
                                            if (var20 == 0) {
                                              continue L58;
                                            } else {
                                              break L60;
                                            }
                                          }
                                        }
                                      }
                                      ti.b();
                                      break L59;
                                    }
                                    L62: {
                                      var6 = wb.field_i;
                                      if (hf.field_i.a(0)) {
                                        break L62;
                                      } else {
                                        var6 = te.field_a;
                                        break L62;
                                      }
                                    }
                                    L63: {
                                      L64: {
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
                                          break L64;
                                        } else {
                                          var8 = 0;
                                          L65: while (true) {
                                            if (var8 >= 15) {
                                              break L64;
                                            } else {
                                              var9 = (int)(5.0 + Math.cos(3.14 * (double)var8 / 20.0) * 5.0);
                                              stackOut_250_0 = ~var9;
                                              stackOut_250_1 = -10;
                                              stackIn_258_0 = stackOut_250_0;
                                              stackIn_258_1 = stackOut_250_1;
                                              stackIn_251_0 = stackOut_250_0;
                                              stackIn_251_1 = stackOut_250_1;
                                              if (var20 != 0) {
                                                break L63;
                                              } else {
                                                L66: {
                                                  if (stackIn_251_0 < stackIn_251_1) {
                                                    var9 = 9;
                                                    break L66;
                                                  } else {
                                                    break L66;
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
                                                if (var20 == 0) {
                                                  continue L65;
                                                } else {
                                                  break L64;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_257_0 = var5_int / 2 - var7 / 2;
                                      stackOut_257_1 = 344;
                                      stackIn_258_0 = stackOut_257_0;
                                      stackIn_258_1 = stackOut_257_1;
                                      break L63;
                                    }
                                    ti.f(stackIn_258_0, stackIn_258_1, var7, 15, 7, 0);
                                    qj.field_a.c(var6, 1 + (var5_int / 2 - 1), 355, 0, -1);
                                    qj.field_a.c(var6, -1 + (1 + var5_int / 2), 357, 0, -1);
                                    qj.field_a.c(var6, -1 + var5_int / 2, 356, 0, -1);
                                    qj.field_a.c(var6, -1 + (var5_int / 2 + 2), 356, 0, -1);
                                    qj.field_a.c(var6, 1 + (var5_int / 2 + -1), 356, 16777215, -1);
                                    break L57;
                                  }
                                } else {
                                  break L57;
                                }
                              }
                              L67: {
                                if (s.field_i) {
                                  break L67;
                                } else {
                                  L68: {
                                    if (na.field_j == null) {
                                      break L68;
                                    } else {
                                      if (tl.field_c == 8) {
                                        break L67;
                                      } else {
                                        if (tl.field_c == 1) {
                                          break L67;
                                        } else {
                                          if (tl.field_c == 3) {
                                            break L67;
                                          } else {
                                            if (tl.field_c != 2) {
                                              break L68;
                                            } else {
                                              break L67;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L69: {
                                    if (wh.field_c != 0) {
                                      break L69;
                                    } else {
                                      if (rh.field_a != null) {
                                        break L69;
                                      } else {
                                        pl.field_R = null;
                                        wh.field_c = 2;
                                        jg.field_pb = 0;
                                        aa.field_b = null;
                                        wc.field_s = null;
                                        break L69;
                                      }
                                    }
                                  }
                                  L70: {
                                    if (0 == wh.field_c) {
                                      aa.field_b.a(0, 128, 310, (byte) -120, 90);
                                      wc.field_s.a(0, 128, -jg.field_pb + 310, (byte) -124, 90);
                                      pl.field_R.a(0, 128, 310 + jg.field_pb, (byte) -119, 90);
                                      break L70;
                                    } else {
                                      break L70;
                                    }
                                  }
                                  L71: {
                                    if (wh.field_c != 1) {
                                      break L71;
                                    } else {
                                      rh.field_a[jg.field_pb / 3].a(0, 128, 310, (byte) 82, 90);
                                      break L71;
                                    }
                                  }
                                  L72: {
                                    if (wh.field_c == 2) {
                                      rh.field_a = null;
                                      fa.field_k[0].a(0, 128, 310, (byte) -120, 90);
                                      fa.field_k[jg.field_pb / 2].a(0, 128, 310, (byte) 37, 90);
                                      break L72;
                                    } else {
                                      break L72;
                                    }
                                  }
                                  if (wh.field_c == 3) {
                                    fa.field_k[0].a(0, 128, 310, (byte) 54, 90);
                                    break L67;
                                  } else {
                                    break L67;
                                  }
                                }
                              }
                              L73: {
                                if (s.field_i) {
                                  L74: {
                                    var5 = h.a(hh.field_d, 0, new String[1]);
                                    var6_int = nj.field_f[0];
                                    nj.field_f[0] = qi.field_a * 64 / 50;
                                    if (nj.field_f[0] > 63) {
                                      nj.field_f[0] = 63;
                                      break L74;
                                    } else {
                                      break L74;
                                    }
                                  }
                                  L75: {
                                    ic.a(var5, 0, -1, false, 480, 16777215, 0);
                                    nj.field_f[0] = 64 * te.field_c / 250000;
                                    var5 = ce.field_f + te.field_c;
                                    if (nj.field_f[0] > 63) {
                                      nj.field_f[0] = 63;
                                      break L75;
                                    } else {
                                      break L75;
                                    }
                                  }
                                  L76: {
                                    ic.a(var5, 0, -1, false, 160, 16777215, 0);
                                    var5 = bb.field_f;
                                    var7_ref = null;
                                    var8 = e.field_e;
                                    if (0 != e.field_e) {
                                      break L76;
                                    } else {
                                      var7_ref = (Object) (Object) ei.field_A;
                                      break L76;
                                    }
                                  }
                                  L77: {
                                    if (e.field_e == 1) {
                                      var7_ref = (Object) (Object) gf.field_a;
                                      break L77;
                                    } else {
                                      break L77;
                                    }
                                  }
                                  L78: {
                                    if (e.field_e == 2) {
                                      var7_ref = (Object) (Object) ka.field_l;
                                      break L78;
                                    } else {
                                      break L78;
                                    }
                                  }
                                  L79: {
                                    if (3 != e.field_e) {
                                      break L79;
                                    } else {
                                      var7_ref = (Object) (Object) he.field_l;
                                      break L79;
                                    }
                                  }
                                  L80: {
                                    if (4 == e.field_e) {
                                      var7_ref = (Object) (Object) td.field_e;
                                      break L80;
                                    } else {
                                      break L80;
                                    }
                                  }
                                  L81: {
                                    if (e.field_e != 5) {
                                      break L81;
                                    } else {
                                      var7_ref = (Object) (Object) nl.field_f;
                                      break L81;
                                    }
                                  }
                                  L82: {
                                    if (e.field_e != 6) {
                                      break L82;
                                    } else {
                                      var7_ref = (Object) (Object) qh.field_h;
                                      break L82;
                                    }
                                  }
                                  L83: {
                                    if (e.field_e != 7) {
                                      break L83;
                                    } else {
                                      var7_ref = (Object) (Object) we.field_e;
                                      break L83;
                                    }
                                  }
                                  L84: {
                                    if (e.field_e != 8) {
                                      break L84;
                                    } else {
                                      var7_ref = (Object) (Object) nb.field_O;
                                      var8 += 5;
                                      break L84;
                                    }
                                  }
                                  L85: {
                                    if (e.field_e == 9) {
                                      var7_ref = (Object) (Object) ja.field_k;
                                      var8 += 5;
                                      break L85;
                                    } else {
                                      break L85;
                                    }
                                  }
                                  L86: {
                                    if (10 == e.field_e) {
                                      var8 += 5;
                                      var7_ref = (Object) (Object) rd.field_b;
                                      break L86;
                                    } else {
                                      break L86;
                                    }
                                  }
                                  L87: {
                                    if (var7_ref == null) {
                                      break L87;
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
                                      break L87;
                                    }
                                  }
                                  L88: {
                                    var9 = 250;
                                    var10 = null;
                                    var11 = -1;
                                    if (nc.field_H == 1) {
                                      var10 = (Object) (Object) pe.field_a;
                                      var11 = 8;
                                      break L88;
                                    } else {
                                      break L88;
                                    }
                                  }
                                  L89: {
                                    if (2 == nc.field_H) {
                                      var10 = (Object) (Object) ha.field_x;
                                      var11 = 10;
                                      break L89;
                                    } else {
                                      break L89;
                                    }
                                  }
                                  L90: {
                                    if (3 != nc.field_H) {
                                      break L90;
                                    } else {
                                      var11 = 11;
                                      var10 = (Object) (Object) fc.field_c;
                                      break L90;
                                    }
                                  }
                                  L91: {
                                    if (4 != nc.field_H) {
                                      break L91;
                                    } else {
                                      var11 = 12;
                                      var10 = (Object) (Object) wg.field_e;
                                      break L91;
                                    }
                                  }
                                  L92: {
                                    if (null != var10) {
                                      L93: {
                                        var10 = (Object) (Object) ((String) var10).toUpperCase();
                                        var12 = 40 + qj.field_a.b((String) var10);
                                        var13 = 100;
                                        var9 += 250;
                                        ti.f(var9 - 21, 427, 42, 42, 20, 0);
                                        ti.f(-2 - var12 + var9, 435, 21 - (-4 + -var12), 26, 12, 0);
                                        if (0 >= var13) {
                                          break L93;
                                        } else {
                                          ti.f(var9 + -2, 435, 4 + var13 + 21, 26, 12, 0);
                                          break L93;
                                        }
                                      }
                                      L94: {
                                        ti.f(var9 - var12, 437, 21 + var12, 22, 10, 11186350);
                                        if (var13 > 0) {
                                          ti.f(var9, 437, var13 + 21, 22, 10, 11186350);
                                          break L94;
                                        } else {
                                          break L94;
                                        }
                                      }
                                      L95: {
                                        ti.f(-1 + (-18 + var9), 429, 38, 38, 18, 11186350);
                                        ti.a(-20 + var9 << 4, 7152, 200, 100, eh.field_e);
                                        ti.a(var9 - -10 << 4, 7152, 200, 150, eh.field_e);
                                        ti.a(40 + (-var12 + var9) << 4, 7152, 200, 150, eh.field_e);
                                        ti.a(-var12 - (-20 - var9) << 4, 7152, 200, 200, eh.field_e);
                                        if (0 < var13) {
                                          ti.a(var13 + var9 << 4, 7152, 200, 200, eh.field_e);
                                          break L95;
                                        } else {
                                          break L95;
                                        }
                                      }
                                      L96: {
                                        L97: {
                                          ti.f(var9 - -2 - var12, 439, -119 - -var12 - -96, 18, 8, 0);
                                          if (var13 <= 0) {
                                            break L97;
                                          } else {
                                            L98: {
                                              var14 = 0;
                                              var15 = 0;
                                              if (2 != nc.field_H) {
                                                break L98;
                                              } else {
                                                L99: {
                                                  if (gh.field_b <= 500) {
                                                    break L99;
                                                  } else {
                                                    gh.field_b = 500;
                                                    break L99;
                                                  }
                                                }
                                                var14 = 8421504;
                                                var15 = gh.field_b * 20 / 500;
                                                if (gh.field_b < 250) {
                                                  var14 = 327680 * (gh.field_b % 50);
                                                  break L98;
                                                } else {
                                                  break L98;
                                                }
                                              }
                                            }
                                            L100: {
                                              if (nc.field_H == 3) {
                                                L101: {
                                                  if (gh.field_b <= 1500) {
                                                    break L101;
                                                  } else {
                                                    gh.field_b = 1500;
                                                    break L101;
                                                  }
                                                }
                                                var15 = 20 * gh.field_b / 1500;
                                                var14 = 16777215;
                                                if (gh.field_b >= 250) {
                                                  break L100;
                                                } else {
                                                  var14 = gh.field_b % 50 * 327680;
                                                  break L100;
                                                }
                                              } else {
                                                break L100;
                                              }
                                            }
                                            L102: {
                                              if (nc.field_H == 4) {
                                                L103: {
                                                  if (500 >= gh.field_b) {
                                                    break L103;
                                                  } else {
                                                    gh.field_b = 500;
                                                    break L103;
                                                  }
                                                }
                                                var14 = 16776960;
                                                var15 = gh.field_b * 20 / 500;
                                                if (gh.field_b >= 250) {
                                                  break L102;
                                                } else {
                                                  var14 = gh.field_b % 50 * 327680;
                                                  break L102;
                                                }
                                              } else {
                                                break L102;
                                              }
                                            }
                                            L104: {
                                              if (nc.field_H != 1) {
                                                break L104;
                                              } else {
                                                L105: {
                                                  if (gh.field_b == 5) {
                                                    var14 = 16777215;
                                                    break L105;
                                                  } else {
                                                    break L105;
                                                  }
                                                }
                                                L106: {
                                                  var15 = gh.field_b * 4;
                                                  if (gh.field_b != 4) {
                                                    break L106;
                                                  } else {
                                                    var14 = 8454143;
                                                    break L106;
                                                  }
                                                }
                                                L107: {
                                                  if (gh.field_b != 3) {
                                                    break L107;
                                                  } else {
                                                    var14 = 8421631;
                                                    break L107;
                                                  }
                                                }
                                                L108: {
                                                  if (gh.field_b == 2) {
                                                    var14 = 16744703;
                                                    break L108;
                                                  } else {
                                                    break L108;
                                                  }
                                                }
                                                if (gh.field_b == 1) {
                                                  var14 = 16744576;
                                                  break L104;
                                                } else {
                                                  break L104;
                                                }
                                              }
                                            }
                                            L109: {
                                              L110: {
                                                var16 = 20 + (2 + var9);
                                                var17 = 439;
                                                ti.f(var16, var17, -3 + var13, 18, 8, (var14 & 16711422) >> 1);
                                                if (3 != nc.field_H) {
                                                  break L110;
                                                } else {
                                                  ti.e(var16, var17, -3 + var13, 18, 8, var14);
                                                  if (var20 == 0) {
                                                    break L109;
                                                  } else {
                                                    break L110;
                                                  }
                                                }
                                              }
                                              ti.e(var16, var17, var13 + -3, 18, 8, 4144959 & var14 >> 2);
                                              break L109;
                                            }
                                            var16 = var16 << 4;
                                            var17 = var17 << 4;
                                            var19 = 0;
                                            L111: while (true) {
                                              L112: {
                                                if (var19 >= var15) {
                                                  break L112;
                                                } else {
                                                  var18 = (ki.field_s + var19) % 10;
                                                  stackOut_423_0 = ~var18;
                                                  stackOut_423_1 = -6;
                                                  stackIn_438_0 = stackOut_423_0;
                                                  stackIn_438_1 = stackOut_423_1;
                                                  stackIn_424_0 = stackOut_423_0;
                                                  stackIn_424_1 = stackOut_423_1;
                                                  if (var20 != 0) {
                                                    L113: while (true) {
                                                      if (stackIn_438_0 <= stackIn_438_1) {
                                                        break L97;
                                                      } else {
                                                        var18 = (var19 + ki.field_s) % 10;
                                                        stackOut_439_0 = ~var18;
                                                        stackOut_439_1 = -6;
                                                        stackIn_447_0 = stackOut_439_0;
                                                        stackIn_447_1 = stackOut_439_1;
                                                        stackIn_440_0 = stackOut_439_0;
                                                        stackIn_440_1 = stackOut_439_1;
                                                        if (var20 != 0) {
                                                          break L96;
                                                        } else {
                                                          L114: {
                                                            if (stackIn_440_0 >= stackIn_440_1) {
                                                              var18 = 10 - var18;
                                                              break L114;
                                                            } else {
                                                              break L114;
                                                            }
                                                          }
                                                          ti.c((var18 + var19 * 10) * (var13 + -35) / 10 + var16 - -136 >> 4, 136 + var17 >> 4, 9, 0, 32);
                                                          ti.c((var13 + -35) * (var18 + var19 * 10) / 10 + (var16 + 136) >> 4, var17 + 136 >> 4, 7, 0, 32);
                                                          ti.c(136 + var16 - -((var13 + -35) * (var18 + var19 * 10) / 10) >> 4, var17 - -136 >> 4, 5, 0, 32);
                                                          var19++;
                                                          if (var20 == 0) {
                                                            stackOut_437_0 = ~var19;
                                                            stackOut_437_1 = -21;
                                                            stackIn_438_0 = stackOut_437_0;
                                                            stackIn_438_1 = stackOut_437_1;
                                                            continue L113;
                                                          } else {
                                                            break L97;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    L115: {
                                                      if (stackIn_424_0 < stackIn_424_1) {
                                                        var18 = 10 + -var18;
                                                        break L115;
                                                      } else {
                                                        break L115;
                                                      }
                                                    }
                                                    L116: {
                                                      L117: {
                                                        if (nc.field_H != 2) {
                                                          break L117;
                                                        } else {
                                                          ti.a((var13 - 35) * (10 * var19) / 10 + (136 + var16), (var18 << 2) + (136 + var17), -var18 + 9 << 4, 50, eh.field_e);
                                                          if (var20 == 0) {
                                                            break L116;
                                                          } else {
                                                            break L117;
                                                          }
                                                        }
                                                      }
                                                      ti.a((var13 - 35) * (var18 + var19 * 10) / 10 + var16 + 136, 136 + var17, 144, 50, eh.field_e);
                                                      break L116;
                                                    }
                                                    var19++;
                                                    if (var20 == 0) {
                                                      continue L111;
                                                    } else {
                                                      break L112;
                                                    }
                                                  }
                                                }
                                              }
                                              var19 += 2;
                                              L118: while (true) {
                                                stackOut_437_0 = ~var19;
                                                stackOut_437_1 = -21;
                                                stackIn_438_0 = stackOut_437_0;
                                                stackIn_438_1 = stackOut_437_1;
                                                if (stackIn_438_0 <= stackIn_438_1) {
                                                  break L97;
                                                } else {
                                                  var18 = (var19 + ki.field_s) % 10;
                                                  stackOut_439_0 = ~var18;
                                                  stackOut_439_1 = -6;
                                                  stackIn_447_0 = stackOut_439_0;
                                                  stackIn_447_1 = stackOut_439_1;
                                                  stackIn_440_0 = stackOut_439_0;
                                                  stackIn_440_1 = stackOut_439_1;
                                                  if (var20 != 0) {
                                                    break L96;
                                                  } else {
                                                    L119: {
                                                      if (stackIn_440_0 >= stackIn_440_1) {
                                                        var18 = 10 - var18;
                                                        break L119;
                                                      } else {
                                                        break L119;
                                                      }
                                                    }
                                                    ti.c((var18 + var19 * 10) * (var13 + -35) / 10 + var16 - -136 >> 4, 136 + var17 >> 4, 9, 0, 32);
                                                    ti.c((var13 + -35) * (var18 + var19 * 10) / 10 + (var16 + 136) >> 4, var17 + 136 >> 4, 7, 0, 32);
                                                    ti.c(136 + var16 - -((var13 + -35) * (var18 + var19 * 10) / 10) >> 4, var17 - -136 >> 4, 5, 0, 32);
                                                    var19++;
                                                    if (var20 == 0) {
                                                      continue L118;
                                                    } else {
                                                      break L97;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var9 -= 48;
                                        stackOut_446_0 = var9 + 32;
                                        stackOut_446_1 = 432;
                                        stackIn_447_0 = stackOut_446_0;
                                        stackIn_447_1 = stackOut_446_1;
                                        break L96;
                                      }
                                      ti.a(stackIn_447_0, stackIn_447_1, 32, 32, 14, 0, 192);
                                      e.field_g[var11].e(var9, 400);
                                      qj.field_a.b((String) var10, 18 + var9, 453, 16777215, -1);
                                      break L92;
                                    } else {
                                      break L92;
                                    }
                                  }
                                  nj.field_f[0] = var6_int;
                                  if (((stellarshard) this).field_J > 0) {
                                    var5 = ah.field_k;
                                    break L73;
                                  } else {
                                    break L73;
                                  }
                                } else {
                                  break L73;
                                }
                              }
                              L120: {
                                if (ig.field_D <= 0) {
                                  break L120;
                                } else {
                                  ti.b(0, 0, 640, 480, 16777215, ig.field_D);
                                  break L120;
                                }
                              }
                              L121: {
                                ti.a(0, 0, 640, 480, 0, 192);
                                ti.a(1, 1, 638, 478, 0, 128);
                                ti.a(2, 2, 636, 476, 0, 64);
                                if (na.field_j != null) {
                                  na.field_j.a((byte) 85);
                                  break L121;
                                } else {
                                  break L121;
                                }
                              }
                              L122: {
                                if (((stellarshard) this).field_R <= 0) {
                                  break L122;
                                } else {
                                  ti.b(0, 0, 640, 480, 16777215, ((stellarshard) this).field_R);
                                  break L122;
                                }
                              }
                              L123: {
                                if (nc.field_A <= 0) {
                                  break L123;
                                } else {
                                  if (!s.field_i) {
                                    break L123;
                                  } else {
                                    if (mk.field_k > 0) {
                                      break L123;
                                    } else {
                                      var6 = dd.field_i + nc.field_A / 50 + ef.field_o;
                                      int discarded$11 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 575, 480, 0, 0, 1, 0, l.field_f.field_N);
                                      int discarded$12 = l.field_f.a(var6, 32, 68 - l.field_f.field_N, 576, 479, 0, 0, 1, 0, l.field_f.field_N);
                                      int discarded$13 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 480, 16777215, -1, 1, 0, l.field_f.field_N);
                                      break L123;
                                    }
                                  }
                                }
                              }
                              L124: {
                                if (nc.field_A <= 0) {
                                  break L124;
                                } else {
                                  if (!s.field_i) {
                                    break L124;
                                  } else {
                                    if (qi.field_a < 50) {
                                      break L124;
                                    } else {
                                      var6 = lk.field_g + hf.field_g + nc.field_A / 50 + ef.field_o;
                                      int discarded$14 = l.field_f.a(var6, 32, 68 + -l.field_f.field_N, 575, 480, 0, 0, 1, 0, l.field_f.field_N);
                                      int discarded$15 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 479, 0, 0, 1, 0, l.field_f.field_N);
                                      int discarded$16 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 480, 16777215, -1, 1, 0, l.field_f.field_N);
                                      break L124;
                                    }
                                  }
                                }
                              }
                              L125: {
                                var6_ref = (jf) (Object) hf.field_i.b(-119);
                                if (null == var6_ref) {
                                  break L125;
                                } else {
                                  L126: {
                                    L127: {
                                      var7 = ((stellarshard) this).field_I;
                                      if (var7 >= 80) {
                                        break L127;
                                      } else {
                                        var8 = 255 * var7 / 80;
                                        if (var20 == 0) {
                                          break L126;
                                        } else {
                                          break L127;
                                        }
                                      }
                                    }
                                    L128: {
                                      if (var7 < 230) {
                                        break L128;
                                      } else {
                                        var8 = (310 + -var7) * 255 / 80;
                                        if (var20 == 0) {
                                          break L126;
                                        } else {
                                          break L128;
                                        }
                                      }
                                    }
                                    var8 = 255;
                                    break L126;
                                  }
                                  L129: {
                                    var9 = 148;
                                    if (var8 < 0) {
                                      var8 = 0;
                                      break L129;
                                    } else {
                                      break L129;
                                    }
                                  }
                                  L130: {
                                    ti.b(4, 353, -6 + var9, 123, 0, var8);
                                    if (var8 == 255) {
                                      wh.field_e[var6_ref.field_o].a(-24 + var9 / 2, 369, 48, 48);
                                      int discarded$17 = qj.field_a.a(rc.field_e[var6_ref.field_o], 8, 425, var9 - 16, 56, 65535, -1, 1, 1, qj.field_a.field_N);
                                      break L130;
                                    } else {
                                      break L130;
                                    }
                                  }
                                  var5 = te.field_a;
                                  qj.field_a.c(var5, var9 / 2 - -1, 355, 0, -1);
                                  qj.field_a.c(var5, 1 + var9 / 2, 357, 0, -1);
                                  qj.field_a.c(var5, var9 / 2, 356, 0, -1);
                                  qj.field_a.c(var5, var9 / 2 + 2, 356, 0, -1);
                                  qj.field_a.c(var5, var9 / 2 - -1, 356, 16777215, -1);
                                  break L125;
                                }
                              }
                              L131: {
                                if (!fd.d((byte) -21)) {
                                  break L131;
                                } else {
                                  ti.b(0, 0, 640, 480, 0, 128);
                                  ti.f(-(ok.a((byte) 126) / 2) + 301, -16 + -(kb.b((byte) -114) / 2) + 235, ok.a((byte) 125) + 38, kb.b((byte) 121) + 42, 0);
                                  na.a(28, 256, 28, fg.field_P);
                                  break L131;
                                }
                              }
                              L132: {
                                if (!hd.field_b) {
                                  break L132;
                                } else {
                                  ti.b(0, 0, 150, 480, 0, 64);
                                  ti.b(0, 0, 150, 480, 16777215);
                                  break L132;
                                }
                              }
                              L133: {
                                if (!id.b(param0 ^ 20876)) {
                                  break L133;
                                } else {
                                  if (fd.d((byte) -21)) {
                                    break L133;
                                  } else {
                                    L134: {
                                      if (null != s.field_e) {
                                        stackOut_510_0 = 1;
                                        stackIn_511_0 = stackOut_510_0;
                                        break L134;
                                      } else {
                                        stackOut_508_0 = ua.field_b;
                                        stackIn_511_0 = stackOut_508_0 ? 1 : 0;
                                        break L134;
                                      }
                                    }
                                    bc.a(stackIn_511_0 != 0, -102);
                                    break L133;
                                  }
                                }
                              }
                              L135: {
                                if (null == s.field_e) {
                                  stackOut_515_0 = qd.field_j;
                                  stackIn_516_0 = (Object) (Object) stackOut_515_0;
                                  break L135;
                                } else {
                                  stackOut_513_0 = s.field_e;
                                  stackIn_516_0 = (Object) (Object) stackOut_513_0;
                                  break L135;
                                }
                              }
                              pd.a((java.awt.Canvas) (Object) stackIn_516_0, 0, 0, (byte) -73);
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    i.a((java.awt.Canvas) var2_ref, -99);
                    return;
                  }
                } else {
                  i.a((java.awt.Canvas) var2_ref, -101);
                  return;
                }
              } else {
                i.a((java.awt.Canvas) var2_ref, -113);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "stellarshard.TA(" + param0 + ')');
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
          throw ma.a((Throwable) (Object) var2, "stellarshard.GB(" + param0 + ')');
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

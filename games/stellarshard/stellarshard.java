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
            stackIn_4_0 = 16711680;
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
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = mf.field_a[param1].field_z;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (int[]) null;
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
            stackIn_4_0 = 0;
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
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
                    stackIn_20_0 = 0;
                    break L5;
                  } else {
                    stackIn_20_0 = 1;
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
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
            stackIn_4_0 = 1;
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
        double var30_double = 0.0;
        double var32_double = 0.0;
        double var34 = 0.0;
        double var36 = 0.0;
        double var38 = 0.0;
        double var40 = 0.0;
        int var42 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var42 = field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        cc.a();
                        this.field_H.a(sk.field_a, 8);
                        var2_double = sk.field_a[3];
                        var4 = sk.field_a[4];
                        if (param0 > 15) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_T = -66;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = sk.field_a[5];
                        var8 = sk.field_a[6];
                        var10 = sk.field_a[7];
                        var12 = sk.field_a[8];
                        var14 = sk.field_a[9];
                        var16 = sk.field_a[10];
                        var18 = sk.field_a[11];
                        var20 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-7 >= (var20 ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var21 = ag.field_b[var20];
                        var22 = og.field_d[var20];
                        var23 = wd.field_e[var20];
                        var24 = th.field_a[var20];
                        var25 = el.field_F[var20];
                        var26 = lg.field_a[var20];
                        var27 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-26 >= (var27 ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var27 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = var27 ^ -1;
                        stackIn_13_1 = -5;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 <= stackIn_13_1) {
                            statePc = 34;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var28 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((var28 ^ -1) <= -5) {
                            statePc = 33;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var29 = 4 * var28 + var27;
                        stackIn_13_0 = -3;
                        stackIn_17_0 = stackIn_13_0;
                        stackIn_13_1 = var20 ^ -1;
                        stackIn_17_1 = stackIn_13_1;
                        if (false) {
                            statePc = 13;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 == stackIn_17_1) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (4 == var20) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var29 += 16;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var20 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var29 += 32;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-2 == (var20 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var29 += 48;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var27++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var20++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw ma.a((Throwable) ((Object) var2), "stellarshard.IB(" + param0 + ')');
                }
                case 37: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_78_0 = null;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        kl var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = field_B;
        try {
          L0: {
            if (param0 >= 21) {
              L1: {
                ac.field_h.a();
                ka.field_m.a();
                stackIn_6_0 = this;

                stackIn_6_1 = 119;

                if (s.field_e != null) {
                  stackIn_7_0 = this;
                  stackIn_7_1 = stackIn_6_1;
                  stackIn_7_2 = 1;
                  break L1;
                } else {
                  stackIn_7_0 = this;
                  stackIn_7_1 = stackIn_6_1;
                  stackIn_7_2 = 0;
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
                                stackIn_80_0 = this;

                                stackIn_80_1 = 0;

                                if (null == s.field_e) {
                                  stackIn_81_0 = this;
                                  stackIn_81_1 = stackIn_80_1;
                                  stackIn_81_2 = 0;
                                  break L11;
                                } else {
                                  stackIn_78_0 = this;

                                  stackIn_81_0 = this;
                                  stackIn_81_1 = stackIn_80_1;
                                  stackIn_81_2 = 1;
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
                          var2 = (kl) ((Object) ue.field_c.b(-91));
                          L16: while (true) {
                            if (var2 == null) {
                              break L7;
                            } else {
                              tc.a(var2, 4, false);
                              var2 = (kl) ((Object) ue.field_c.b((byte) -128));
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
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "stellarshard.LA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.a(8, 0, 10, 6, false, 10, (byte) -7, 9);
                        cc.b(0.800000011920929f);
                        cc.a();
                        cc.field_f = false;
                        eh.field_e = new int[256];
                        var2 = new int[256];
                        var3 = new int[256];
                        var4 = new int[256];
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 >= eh.field_e.length) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        eh.field_e[var5] = 65793 * var5;
                        var2[var5] = var5 * 256;
                        var3[var5] = var5 * 1;
                        var4[var5] = 65536 * var5;
                        var5++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_H = new pi();
                        sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 1.0);
                        this.field_H.a(sg.field_a, 19);
                        sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.5);
                        this.field_H.a(sg.field_a, 103);
                        ea.field_m = new pb(80, 160);
                        ea.field_m.e();
                        var5 = 0;
                        var6_float = 0.0f;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (20.0f <= var6_float) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = (int)(-((-var6_float + 20.0f) * (-var6_float + 20.0f) / 20.0f) + 40.0f);
                        ti.e(40, (int)(-(var6_float * 2.0f) + 120.0f), var5, (int)(Math.random() * 16.0) * 1052688 | 1);
                        var6_float = (float)((double)var6_float + 0.1);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6_float = 20.0f;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var6_float > 40.0f) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 = (int)(40.0f - (var6_float - 20.0f) * (var6_float - 20.0f) / 20.0f);
                        ti.e(40, (int)(120.0f - var6_float * 2.0f), var5, 1 | (int)(16.0 * Math.random()) * 1052688);
                        var6_float = (float)((double)var6_float + 0.1);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        pd.field_h.a((byte) -107);
                        ei.field_D = new pb[12];
                        fk.field_k = new int[48];
                        var5 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var5 ^ -1) <= -13) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        fk.field_k[0 + var5 * 4] = (int)(640.0 * Math.random()) << -848692028;
                        fk.field_k[var5 * 4 - -1] = (int)(Math.random() * 480.0) << 1186934916;
                        fk.field_k[2 + var5 * 4] = (int)(33.0 * Math.random() - 16.0);
                        fk.field_k[3 + 4 * var5] = (int)(33.0 * Math.random() - 16.0);
                        ei.field_D[var5] = new pb(256, 256);
                        ei.field_D[var5].e();
                        var6 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var6 >= 4) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = (int)(64.0 * Math.random() + 64.0);
                        var8 = (int)(Math.random() * (double)((128 - var7) * 2) + (double)var7);
                        var9_int = (int)(Math.random() * (double)(2 * (-var7 + 128)) + (double)var7);
                        ti.a(var8 << 712095268, var9_int << -78655388, var7 << -496645788, -var7 + 128, eh.field_e);
                        var6++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5++;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        lc.field_k = new pb(640, 480);
                        lc.field_k.e();
                        var5 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = var5 ^ -1;
                        stackIn_26_1 = -257;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 <= stackIn_26_1) {
                            statePc = 52;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var6 = (int)(Math.random() * 112.0 + 16.0);
                        var7 = (int)(640.0 * Math.random() - (double)var6);
                        var8 = (int)(480.0 * Math.random() - (double)var6);
                        var9 = eh.field_e;
                        var10 = (int)(4.0 * Math.random());
                        stackIn_53_0 = 1;
                        stackIn_28_0 = stackIn_53_0;
                        stackIn_53_1 = var10;
                        stackIn_28_1 = stackIn_53_1;
                        if (false) {
                            statePc = 53;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 == stackIn_28_1) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9 = var2;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((var10 ^ -1) != -3) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = var3;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var10 != 3) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = var4;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var11 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (4 <= var11) {
                            statePc = 51;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ti.a(var7 << 1540194404, var8 << 1687099620, var6 << -412111996, -var6 + 128, var9);
                        stackIn_26_0 = 0;
                        stackIn_40_0 = stackIn_26_0;
                        stackIn_26_1 = var11;
                        stackIn_40_1 = stackIn_26_1;
                        if (false) {
                            statePc = 26;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 == stackIn_40_1) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var7 += 640;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (1 != var11) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var8 += 480;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (-3 == (var11 ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var7 -= 640;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var11++;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var5++;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        pd.field_h.a((byte) -107);
                        stackIn_53_0 = 22050;
                        stackIn_53_1 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ba.a(stackIn_53_0, stackIn_53_1 != 0, 10);
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
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw ma.a((Throwable) ((Object) var2_ref), "stellarshard.GA(" + param0 + ')');
                }
                case 56: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void m(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        qe dupTemp$22 = null;
        qe dupTemp$23 = null;
        qe dupTemp$24 = null;
        qe dupTemp$25 = null;
        qe dupTemp$26 = null;
        qe dupTemp$27 = null;
        qe dupTemp$28 = null;
        qe dupTemp$29 = null;
        qe dupTemp$30 = null;
        qe dupTemp$31 = null;
        qe dupTemp$32 = null;
        int fieldTemp$33 = 0;
        int fieldTemp$34 = 0;
        int fieldTemp$35 = 0;
        int fieldTemp$36 = 0;
        qe dupTemp$37 = null;
        int fieldTemp$38 = 0;
        int fieldTemp$39 = 0;
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
        qe stackIn_409_0 = null;
        double stackIn_409_1 = 0.0;
        double stackIn_409_2 = 0.0;
        qe stackIn_411_0 = null;
        double stackIn_411_1 = 0.0;
        double stackIn_411_2 = 0.0;
        qe stackIn_413_0 = null;
        double stackIn_413_1 = 0.0;
        double stackIn_413_2 = 0.0;
        qe stackIn_414_0 = null;
        double stackIn_414_1 = 0.0;
        double stackIn_414_2 = 0.0;
        double stackIn_414_3 = 0.0;
        qe stackIn_415_0 = null;
        double stackIn_415_1 = 0.0;
        double stackIn_415_2 = 0.0;
        qe stackIn_417_0 = null;
        double stackIn_417_1 = 0.0;
        double stackIn_417_2 = 0.0;
        qe stackIn_418_0 = null;
        double stackIn_418_1 = 0.0;
        double stackIn_418_2 = 0.0;
        double stackIn_418_3 = 0.0;
        vl stackIn_434_0 = null;
        vl stackIn_434_1 = null;
        vl stackIn_436_0 = null;
        vl stackIn_436_1 = null;
        vl stackIn_437_0 = null;
        vl stackIn_437_1 = null;
        vl stackIn_438_0 = null;
        vl stackIn_438_1 = null;
        int stackIn_438_2 = 0;
        vl stackIn_447_0 = null;
        vl stackIn_447_1 = null;
        vl stackIn_449_0 = null;
        vl stackIn_449_1 = null;
        vl stackIn_450_0 = null;
        vl stackIn_450_1 = null;
        vl stackIn_451_0 = null;
        vl stackIn_451_1 = null;
        int stackIn_451_2 = 0;
        gd stackIn_476_0 = null;
        int stackIn_476_1 = 0;
        gd stackIn_478_0 = null;
        int stackIn_478_1 = 0;
        gd stackIn_480_0 = null;
        int stackIn_480_1 = 0;
        gd stackIn_481_0 = null;
        int stackIn_481_1 = 0;
        int stackIn_481_2 = 0;
        gd stackIn_483_0 = null;
        int stackIn_483_1 = 0;
        gd stackIn_485_0 = null;
        int stackIn_485_1 = 0;
        gd stackIn_487_0 = null;
        int stackIn_487_1 = 0;
        gd stackIn_488_0 = null;
        int stackIn_488_1 = 0;
        int stackIn_488_2 = 0;
        int stackIn_499_0 = 0;
        int stackIn_525_0 = 0;
        int stackIn_789_0 = 0;
        int stackIn_789_1 = 0;
        int stackIn_812_0 = 0;
        int stackIn_812_1 = 0;
        int stackIn_835_0 = 0;
        int stackIn_862_0 = 0;
        int stackIn_862_1 = 0;
        int stackIn_902_0 = 0;
        int stackIn_902_1 = 0;
        int stackIn_913_0 = 0;
        int stackIn_913_1 = 0;
        int stackIn_915_0 = 0;
        int stackIn_915_1 = 0;
        int stackIn_924_0 = 0;
        int stackIn_924_1 = 0;
        int stackIn_926_0 = 0;
        int stackIn_926_1 = 0;
        int stackIn_965_0 = 0;
        int stackIn_973_0 = 0;
        int stackIn_982_0 = 0;
        int stackIn_984_0 = 0;
        int stackIn_984_1 = 0;
        int stackIn_1003_0 = 0;
        qe stackIn_1019_0 = null;
        qe stackIn_1080_0 = null;
        int stackIn_1087_0 = 0;
        int stackIn_1138_0 = 0;
        int stackIn_1138_1 = 0;
        int stackIn_1156_0 = 0;
        int stackIn_1156_1 = 0;
        vl stackIn_1159_0 = null;
        Object stackIn_1172_0 = null;
        vl stackIn_1172_1 = null;
        Object stackIn_1201_0 = null;
        vl stackIn_1201_1 = null;
        Object stackIn_1264_0 = null;
        ij stackIn_1264_1 = null;
        Object stackIn_1287_0 = null;
        ij stackIn_1287_1 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        int var2_int = 0;
        pi var2 = null;
        vl var2_ref = null;
        RuntimeException var2_ref2 = null;
        pi var3_ref_pi = null;
        int var3 = 0;
        vl var4_ref_vl = null;
        int var4 = 0;
        int var5 = 0;
        double var5_double = 0.0;
        qe var6_ref_qe = null;
        int var6 = 0;
        double var6_double = 0.0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        qe var10 = null;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (ni.field_e != this.field_Q) {
                        statePc = 8;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (eb.field_a != this.field_O) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (0 == gh.field_c) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_Q = ni.field_e;
                    v.field_e = true;
                    this.field_O = eb.field_a;
                    ld.field_F = -1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (!si.field_jb[98]) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ld.field_F = 0;
                    v.field_e = false;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (!si.field_jb[99]) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ld.field_F = 1;
                    v.field_e = false;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    ki.field_s = ki.field_s + 1;
                    if (!si.field_jb[84]) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    v.field_e = false;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    qb.field_k = qb.field_k + 1;
                    lg.field_f = lg.field_f - 1;
                    hk.field_p = hk.field_p + 1;
                    if (10 >= ki.field_s) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ki.field_s = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if ((qi.field_a ^ -1) >= -2) {
                        statePc = 29;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if ((this.field_J ^ -1) < -1) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_J = this.field_J - 1;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    cl.field_a = cl.field_a + 1;
                    if (0 != gh.field_c) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    qb.field_k = qb.field_k - gg.field_i;
                    si.field_gb = si.field_gb + 1;
                    hk.field_p = hk.field_p + lh.field_d;
                    ed.field_b = ed.field_b + 1;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (null == hf.field_i.b(-97)) {
                        statePc = 39;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    fieldTemp$20 = this.field_I + 1;
                    this.field_I = this.field_I + 1;
                    if (fieldTemp$20 != 335) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    this.field_I = 0;
                    hf.field_i.d((byte) -35);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (af.field_o <= 0) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    af.field_o = af.field_o - 1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (0 >= og.field_a) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    og.field_a = og.field_a - 1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    fieldTemp$21 = bf.field_c;
                    bf.field_c = bf.field_c + 1;
                    if ((fieldTemp$21 ^ -1) >= (qj.field_a.b(sj.field_C) ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    bf.field_c = bf.field_c - qj.field_a.b(sj.field_C) * 2;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (0 < this.field_R) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    this.field_R = this.field_R / 2;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (this.field_R <= 0) {
                        statePc = 55;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    this.field_R = this.field_R - 1;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (null == na.field_j) {
                        statePc = 231;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (s.field_i) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 0.001);
                    this.field_H.a(sg.field_a, -127);
                    sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.0005);
                    this.field_H.a(sg.field_a, -125);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (null == gj.field_r) {
                        statePc = 68;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if ((og.field_a ^ -1) >= -1) {
                        statePc = 67;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 67: {
                    og.field_a = 25;
                    gj.field_r.b(25, 0);
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if ((tl.field_c ^ -1) == -9) {
                        statePc = 71;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var2_int = qc.a((byte) -115, true);
                    if (3 != var2_int) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    qd.a(hf.a((byte) -68), (byte) -30);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (var2_int != 1) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    na.field_j.field_l = 0;
                    tl.field_c = 0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    return;
                }
                case 77: {
                    if ((var2_int ^ -1) != -3) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    tl.field_c = 0;
                    na.field_j.field_l = -1;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    return;
                }
                case 80: {
                    if ((tl.field_c ^ -1) != -4) {
                        statePc = 95;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (gh.field_c == 1) {
                        statePc = 86;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (0 != (na.field_j.field_r ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (na.field_j.field_u == na.field_j.field_r) {
                        statePc = 93;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    na.field_j.field_u = na.field_j.field_r;
                    statePc = 95;
                    continue stateLoop;
                }
                case 93: {
                    na.field_j.field_u = -1;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (qi.field_a > na.field_j.field_t) {
                        statePc = 112;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (4 == tl.field_c) {
                        statePc = 101;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 101: {
                    na.field_j.field_p = na.field_j.field_p + 1;
                    if ((na.field_j.field_p ^ -1) >= -51) {
                        statePc = 104;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    na.field_j.field_p = na.field_j.field_p - 50;
                    na.field_j.field_s = na.field_j.field_s - 1;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (-1 <= (na.field_j.field_s ^ -1)) {
                        statePc = 107;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 107: {
                    gh.field_d = null;
                    tl.field_c = 2;
                    na.field_j.field_l = 9;
                    if (-1 > (tl.field_a ^ -1)) {
                        statePc = 110;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 110: {
                    tl.field_c = 3;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    n.field_L = 256;
                    statePc = 118;
                    continue stateLoop;
                }
                case 112: {
                    na.field_j.field_p = na.field_j.field_p + 1;
                    if (10 < na.field_j.field_p) {
                        statePc = 117;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 117: {
                    na.field_j.field_t = na.field_j.field_t + 1;
                    na.field_j.field_p = na.field_j.field_p - 10;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (tl.field_c == 0) {
                        statePc = 121;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var2_int = 0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (var2_int >= 9) {
                        statePc = 133;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    stackIn_134_0 = na.field_j.field_l;
                    stackIn_124_0 = stackIn_134_0;
                    stackIn_134_1 = var2_int;
                    stackIn_124_1 = stackIn_134_1;
                    if (false) {
                        statePc = 134;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (stackIn_124_0 != stackIn_124_1) {
                        statePc = 130;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    nj.field_f[var2_int] = nj.field_f[var2_int] * 15 - -64 >> -1454863004;
                    statePc = 132;
                    continue stateLoop;
                }
                case 130: {
                    nj.field_f[var2_int] = 0 + nj.field_f[var2_int] * 15 >> -684140508;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    var2_int++;
                    statePc = 122;
                    continue stateLoop;
                }
                case 133: {
                    stackIn_134_0 = -3;
                    stackIn_134_1 = ph.field_D ^ -1;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (stackIn_134_0 < stackIn_134_1) {
                        statePc = 160;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (si.field_jb[16]) {
                        statePc = 140;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 140: {
                    this.field_H.field_b = 1.0;
                    var2 = this.field_H;
                    var3_ref_pi = this.field_H;
                    this.field_H.field_a = 0.0;
                    var2.field_d = 0.0;
                    var3_ref_pi.field_c = 0.0;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (si.field_jb[17]) {
                        statePc = 144;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 144: {
                    this.field_H.field_b = 0.1513824462890625;
                    this.field_H.field_c = -0.939178466796875;
                    this.field_H.field_a = -0.258941650390625;
                    this.field_H.field_d = -0.949249267578125;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if (!si.field_jb[18]) {
                        statePc = 148;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    this.field_H.field_c = -0.0067138671875;
                    this.field_H.field_a = -0.82244873046875;
                    this.field_H.field_b = 0.13287353515625;
                    this.field_H.field_d = -0.552978515625;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (si.field_jb[19]) {
                        statePc = 151;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 151: {
                    this.field_H.field_d = -0.846764809241;
                    this.field_H.field_b = 0.26812744140625;
                    this.field_H.field_a = 0.4404144287109375;
                    this.field_H.field_c = 0.130889892578125;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (si.field_jb[20]) {
                        statePc = 155;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 155: {
                    this.field_H.field_b = 0.7213134765625;
                    this.field_H.field_c = 0.5408782958984375;
                    this.field_H.field_a = -0.334014892578125;
                    this.field_H.field_d = 0.2748870849609375;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if (si.field_jb[21]) {
                        statePc = 159;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 159: {
                    this.field_H.field_d = -0.5489211794018304;
                    this.field_H.field_a = -0.49565616706475396;
                    this.field_H.field_b = -0.6729829114278874;
                    this.field_H.field_c = -0.010222709116862912;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    if (tl.field_c == 4) {
                        statePc = 163;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var2_int = 8;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if (-10 >= (var2_int ^ -1)) {
                        statePc = 175;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    stackIn_176_0 = var2_int;
                    stackIn_166_0 = stackIn_176_0;
                    stackIn_176_1 = na.field_j.field_l;
                    stackIn_166_1 = stackIn_176_1;
                    if (false) {
                        statePc = 176;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (stackIn_166_0 == stackIn_166_1) {
                        statePc = 172;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    nj.field_f[var2_int] = 0 + 15 * nj.field_f[var2_int] >> -2026623196;
                    statePc = 174;
                    continue stateLoop;
                }
                case 172: {
                    nj.field_f[var2_int] = 64 + nj.field_f[var2_int] * 15 >> -1379369532;
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    var2_int++;
                    statePc = 164;
                    continue stateLoop;
                }
                case 175: {
                    stackIn_176_0 = tl.field_c ^ -1;
                    stackIn_176_1 = -2;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (stackIn_176_0 == stackIn_176_1) {
                        statePc = 178;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var2_int = 9;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if (var2_int >= 10) {
                        statePc = 190;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    stackIn_191_0 = var2_int ^ -1;
                    stackIn_181_0 = stackIn_191_0;
                    stackIn_191_1 = na.field_j.field_l ^ -1;
                    stackIn_181_1 = stackIn_191_1;
                    if (false) {
                        statePc = 191;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if (stackIn_181_0 == stackIn_181_1) {
                        statePc = 187;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    nj.field_f[var2_int] = nj.field_f[var2_int] * 15 - 0 >> 344090308;
                    statePc = 189;
                    continue stateLoop;
                }
                case 187: {
                    nj.field_f[var2_int] = 64 + nj.field_f[var2_int] * 15 >> -1291897628;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    var2_int++;
                    statePc = 179;
                    continue stateLoop;
                }
                case 190: {
                    stackIn_191_0 = 2;
                    stackIn_191_1 = tl.field_c;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (stackIn_191_0 != stackIn_191_1) {
                        statePc = 204;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var2_int = 8;
                    var3 = var2_int;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (10 <= var3) {
                        statePc = 204;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    stackIn_205_0 = na.field_j.field_l ^ -1;
                    stackIn_195_0 = stackIn_205_0;
                    stackIn_205_1 = var3 ^ -1;
                    stackIn_195_1 = stackIn_205_1;
                    if (false) {
                        statePc = 205;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (stackIn_195_0 == stackIn_195_1) {
                        statePc = 201;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    nj.field_f[var3] = 0 + 15 * nj.field_f[var3] >> -1540175100;
                    statePc = 203;
                    continue stateLoop;
                }
                case 201: {
                    nj.field_f[var3] = nj.field_f[var3] * 15 - -64 >> -1495521532;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    var3++;
                    statePc = 193;
                    continue stateLoop;
                }
                case 204: {
                    stackIn_205_0 = tl.field_c ^ -1;
                    stackIn_205_1 = -4;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    if (stackIn_205_0 == stackIn_205_1) {
                        statePc = 207;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 207: {
                    var2_int = 8;
                    if (ah.a(-1)) {
                        statePc = 212;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (oc.field_d) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var2_int = 9;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    var3 = var2_int;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    if (-11 >= (var3 ^ -1)) {
                        statePc = 224;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    stackIn_225_0 = na.field_j.field_l;
                    stackIn_215_0 = stackIn_225_0;
                    stackIn_225_1 = var3;
                    stackIn_215_1 = stackIn_225_1;
                    if (false) {
                        statePc = 225;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if (stackIn_215_0 != stackIn_215_1) {
                        statePc = 221;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    nj.field_f[var3] = 15 * nj.field_f[var3] - -64 >> 914360292;
                    statePc = 223;
                    continue stateLoop;
                }
                case 221: {
                    nj.field_f[var3] = 15 * nj.field_f[var3] + 0 >> -1489526652;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    var3++;
                    statePc = 213;
                    continue stateLoop;
                }
                case 224: {
                    stackIn_225_0 = 0;
                    stackIn_225_1 = n.field_L;
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    if (stackIn_225_0 < stackIn_225_1) {
                        statePc = 227;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 227: {
                    n.field_L = n.field_L / 2;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    if ((n.field_L ^ -1) >= -1) {
                        statePc = 231;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    n.field_L = n.field_L - 1;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if (null == na.field_j) {
                        statePc = 275;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if (s.field_i) {
                        statePc = 237;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if (!qh.c(103)) {
                        statePc = 267;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    stackIn_270_0 = gi.field_f;
                    stackIn_239_0 = stackIn_270_0;
                    stackIn_270_1 = 13;
                    stackIn_239_1 = stackIn_270_1;
                    if (false) {
                        statePc = 270;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (stackIn_239_0 != stackIn_239_1) {
                        statePc = 247;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (tl.field_c != 0) {
                        statePc = 247;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    na.field_j = null;
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    if (na.field_j == null) {
                        statePc = 263;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (gi.field_f != 13) {
                        statePc = 263;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if ((tl.field_c ^ -1) == -3) {
                        statePc = 260;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (tl.field_c == 1) {
                        statePc = 260;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if (-4 != (tl.field_c ^ -1)) {
                        statePc = 263;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    n.field_L = 256;
                    tl.field_c = 0;
                    gh.field_d = null;
                    statePc = 237;
                    continue stateLoop;
                }
                case 263: {
                    if (null != na.field_j) {
                        statePc = 266;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 266: {
                    na.field_j.b(8);
                    statePc = 237;
                    continue stateLoop;
                }
                case 267: {
                    if (na.field_j == null) {
                        statePc = 274;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    stackIn_270_0 = -4;
                    stackIn_270_1 = tl.field_c ^ -1;
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    if (stackIn_270_0 == stackIn_270_1) {
                        statePc = 271;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if ((tl.field_c ^ -1) == -3) {
                        statePc = 272;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    if (-2 == (tl.field_c ^ -1)) {
                        statePc = 273;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    na.field_j.a(true);
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    return;
                }
                case 275: {
                    if (0 < ig.field_D) {
                        statePc = 278;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 278: {
                    ig.field_D = ig.field_D - 6;
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    if (0 != wh.field_c) {
                        statePc = 288;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    jg.field_pb = jg.field_pb - 8;
                    if (jg.field_pb > 0) {
                        statePc = 288;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    wh.field_c = 1;
                    jg.field_pb = 0;
                    if (!fe.field_e) {
                        statePc = 288;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    ll.field_c.a(sb.field_e[36], 100, pk.field_h * 2);
                    statePc = 288;
                    continue stateLoop;
                }
                case 288: {
                    if (wh.field_c != 1) {
                        statePc = 295;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    jg.field_pb = jg.field_pb + 1;
                    if ((jg.field_pb ^ -1) <= -37) {
                        statePc = 294;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 294: {
                    jg.field_pb = 0;
                    wh.field_c = 2;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    if (2 == wh.field_c) {
                        statePc = 298;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 298: {
                    jg.field_pb = jg.field_pb + 1;
                    if ((jg.field_pb ^ -1) > -31) {
                        statePc = 301;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    wh.field_c = 3;
                    jg.field_pb = 0;
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    if (-4 == (wh.field_c ^ -1)) {
                        statePc = 304;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 304: {
                    jg.field_pb = jg.field_pb + 1;
                    if (1 == jg.field_pb) {
                        statePc = 307;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 307: {
                    if (!fe.field_e) {
                        statePc = 313;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if (s.field_i) {
                        statePc = 313;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    ll.field_c.a(sb.field_e[37], 100, pk.field_h * 2);
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    if (-251 <= (jg.field_pb ^ -1)) {
                        statePc = 316;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    jg.field_pb = 0;
                    wh.field_c = 2;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    if ((al.field_c ^ -1) == (ke.field_a ^ -1)) {
                        statePc = 323;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    kg.field_D = kg.field_D - 1;
                    if (-1 <= (kg.field_D ^ -1)) {
                        statePc = 322;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 322: {
                    kg.field_D = 255;
                    ke.field_a = al.field_c;
                    statePc = 323;
                    continue stateLoop;
                }
                case 323: {
                    al.field_c = qi.field_a % 7 * 6912 + qi.field_a % 10 * 19 + 851968 * (qi.field_a % 14);
                    if (s.field_i) {
                        statePc = 326;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    al.field_c = 858899;
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    if (-2 == (nc.field_H ^ -1)) {
                        statePc = 329;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 329: {
                    if ((a.field_h[0].field_g ^ -1) > -2) {
                        statePc = 332;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 332: {
                    dupTemp$22 = a.field_h[0];
                    dupTemp$22.field_g = dupTemp$22.field_g + 1;
                    gh.field_b = gh.field_b - 1;
                    statePc = 333;
                    continue stateLoop;
                }
                case 333: {
                    if (0 >= gh.field_b) {
                        statePc = 336;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 336: {
                    nc.field_H = 0;
                    statePc = 337;
                    continue stateLoop;
                }
                case 337: {
                    if (nc.field_H == 2) {
                        statePc = 340;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 340: {
                    gh.field_b = gh.field_b - 1;
                    if (0 >= gh.field_b) {
                        statePc = 343;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 343: {
                    gh.field_b = 5;
                    nc.field_H = 1;
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    if (nc.field_H != 3) {
                        statePc = 350;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    gh.field_b = gh.field_b - 1;
                    if (gh.field_b > 0) {
                        statePc = 350;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    gh.field_b = 5;
                    nc.field_H = 1;
                    statePc = 350;
                    continue stateLoop;
                }
                case 350: {
                    if (96 <= tc.field_r) {
                        statePc = 353;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 351: {
                    tc.field_r = tc.field_r + 1;
                    statePc = 353;
                    continue stateLoop;
                }
                case 353: {
                    if (nc.field_H != 4) {
                        statePc = 359;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 354: {
                    gh.field_b = gh.field_b - 1;
                    if (0 < gh.field_b) {
                        statePc = 359;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 357: {
                    gh.field_b = 5;
                    nc.field_H = 1;
                    statePc = 359;
                    continue stateLoop;
                }
                case 359: {
                    if (null == a.field_h[0]) {
                        statePc = 363;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    if (0 == (a.field_h[0].field_m ^ -1)) {
                        statePc = 372;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    stackIn_368_0 = 0;
                    stackIn_364_0 = stackIn_368_0;
                    if (s.field_i) {
                        statePc = 368;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 364: {
                    stackIn_366_0 = stackIn_364_0;
                    statePc = 366;
                    continue stateLoop;
                }
                case 366: {
                    stackIn_369_0 = stackIn_366_0;
                    stackIn_369_1 = 1;
                    statePc = 369;
                    continue stateLoop;
                }
                case 368: {
                    stackIn_369_0 = stackIn_368_0;
                    stackIn_369_1 = 0;
                    statePc = 369;
                    continue stateLoop;
                }
                case 369: {
                    if (stackIn_369_0 != stackIn_369_1) {
                        statePc = 372;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    this.k((byte) -69);
                    statePc = 372;
                    continue stateLoop;
                }
                case 372: {
                    if (s.field_i) {
                        statePc = 375;
                    } else {
                        statePc = 972;
                    }
                    continue stateLoop;
                }
                case 375: {
                    if (si.field_jb[98]) {
                        statePc = 379;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    if (4 != nc.field_H) {
                        statePc = 382;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    if ((a.field_h[0].field_g ^ -1) < -1) {
                        statePc = 408;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    if (!si.field_jb[99]) {
                        statePc = 455;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 385: {
                    if (0 < a.field_h[0].field_g) {
                        statePc = 390;
                    } else {
                        statePc = 455;
                    }
                    continue stateLoop;
                }
                case 390: {
                    dupTemp$23 = a.field_h[0];
                    dupTemp$23.field_k = dupTemp$23.field_k + 0.05 * Math.cos(2.0 * ((double)a.field_h[0].field_h * 3.141592653589793) / 256.0);
                    dupTemp$24 = a.field_h[0];
                    dupTemp$24.field_d = dupTemp$24.field_d + 0.05 * Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                    if (!fe.field_e) {
                        statePc = 397;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    if (og.field_a <= 0) {
                        statePc = 396;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 396: {
                    ll.field_c.a(sb.field_e[0], 100, pk.field_h / 4);
                    og.field_a = 5;
                    statePc = 397;
                    continue stateLoop;
                }
                case 397: {
                    var2_int = 3;
                    var3 = 5;
                    var5 = 0;
                    statePc = 398;
                    continue stateLoop;
                }
                case 398: {
                    if ((var2_int ^ -1) >= (var5 ^ -1)) {
                        statePc = 402;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
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
                    statePc = 398;
                    continue stateLoop;
                }
                case 402: {
                    var5 = 0;
                    statePc = 403;
                    continue stateLoop;
                }
                case 403: {
                    if ((var2_int ^ -1) >= (var5 ^ -1)) {
                        statePc = 455;
                    } else {
                        statePc = 404;
                    }
                    continue stateLoop;
                }
                case 404: {
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
                    statePc = 403;
                    continue stateLoop;
                }
                case 408: {
                    dupTemp$25 = a.field_h[0];
                    stackIn_413_0 = (qe) (dupTemp$25);
                    stackIn_409_0 = stackIn_413_0;
                    stackIn_413_1 = dupTemp$25.field_k;
                    stackIn_409_1 = stackIn_413_1;
                    stackIn_413_2 = Math.cos(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                    stackIn_409_2 = stackIn_413_2;
                    if (8 != e.field_e) {
                        statePc = 413;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 409: {
                    stackIn_411_0 = (qe) ((Object) stackIn_409_0);
                    stackIn_411_1 = stackIn_409_1;
                    stackIn_411_2 = stackIn_409_2;
                    statePc = 411;
                    continue stateLoop;
                }
                case 411: {
                    stackIn_414_0 = (qe) ((Object) stackIn_411_0);
                    stackIn_414_1 = stackIn_411_1;
                    stackIn_414_2 = stackIn_411_2;
                    stackIn_414_3 = 0.15;
                    statePc = 414;
                    continue stateLoop;
                }
                case 413: {
                    stackIn_414_0 = (qe) ((Object) stackIn_413_0);
                    stackIn_414_1 = stackIn_413_1;
                    stackIn_414_2 = stackIn_413_2;
                    stackIn_414_3 = 0.1;
                    statePc = 414;
                    continue stateLoop;
                }
                case 414: {
                    stackIn_414_0.field_k = stackIn_414_1 - stackIn_414_2 * stackIn_414_3;
                    dupTemp$26 = a.field_h[0];
                    stackIn_417_0 = (qe) (dupTemp$26);
                    stackIn_415_0 = stackIn_417_0;
                    stackIn_417_1 = dupTemp$26.field_d;
                    stackIn_415_1 = stackIn_417_1;
                    stackIn_417_2 = Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                    stackIn_415_2 = stackIn_417_2;
                    if (-9 == (e.field_e ^ -1)) {
                        statePc = 417;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    stackIn_418_0 = (qe) ((Object) stackIn_415_0);
                    stackIn_418_1 = stackIn_415_1;
                    stackIn_418_2 = stackIn_415_2;
                    stackIn_418_3 = 0.1;
                    statePc = 418;
                    continue stateLoop;
                }
                case 417: {
                    stackIn_418_0 = (qe) ((Object) stackIn_417_0);
                    stackIn_418_1 = stackIn_417_1;
                    stackIn_418_2 = stackIn_417_2;
                    stackIn_418_3 = 0.15;
                    statePc = 418;
                    continue stateLoop;
                }
                case 418: {
                    stackIn_418_0.field_d = stackIn_418_1 - stackIn_418_2 * stackIn_418_3;
                    if ((nc.field_H ^ -1) != -5) {
                        statePc = 427;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 419: {
                    dupTemp$27 = a.field_h[0];
                    dupTemp$27.field_k = dupTemp$27.field_k - 0.1 * Math.cos(3.141592653589793 * (double)a.field_h[0].field_h * 2.0 / 256.0);
                    dupTemp$28 = a.field_h[0];
                    dupTemp$28.field_d = dupTemp$28.field_d - 0.1 * Math.sin((double)a.field_h[0].field_h * 3.141592653589793 * 2.0 / 256.0);
                    if (!fe.field_e) {
                        statePc = 427;
                    } else {
                        statePc = 422;
                    }
                    continue stateLoop;
                }
                case 422: {
                    if (-1 > (og.field_a ^ -1)) {
                        statePc = 427;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 425: {
                    ll.field_c.a(sb.field_e[35], 100, pk.field_h / 2);
                    og.field_a = 7;
                    statePc = 427;
                    continue stateLoop;
                }
                case 427: {
                    var2_int = 3;
                    var3 = 5;
                    if ((nc.field_H ^ -1) == -5) {
                        statePc = 430;
                    } else {
                        statePc = 431;
                    }
                    continue stateLoop;
                }
                case 430: {
                    var3 = 10;
                    var2_int = 6;
                    statePc = 431;
                    continue stateLoop;
                }
                case 431: {
                    var5 = 0;
                    statePc = 432;
                    continue stateLoop;
                }
                case 432: {
                    if (var5 >= var2_int) {
                        statePc = 443;
                    } else {
                        statePc = 433;
                    }
                    continue stateLoop;
                }
                case 433: {
                    stackIn_437_0 = null;
                    stackIn_434_0 = stackIn_437_0;
                    stackIn_437_1 = null;
                    stackIn_434_1 = stackIn_437_1;
                    if ((nc.field_H ^ -1) != -5) {
                        statePc = 437;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 434: {
                    stackIn_436_0 = null;
                    stackIn_436_1 = null;
                    statePc = 436;
                    continue stateLoop;
                }
                case 436: {
                    stackIn_438_0 = null;
                    stackIn_438_1 = null;
                    stackIn_438_2 = 4;
                    statePc = 438;
                    continue stateLoop;
                }
                case 437: {
                    stackIn_438_0 = null;
                    stackIn_438_1 = null;
                    stackIn_438_2 = 1;
                    statePc = 438;
                    continue stateLoop;
                }
                case 438: {
                    var4_ref_vl = new vl(stackIn_438_2, a.field_h[0]);
                    var4_ref_vl.field_q = 16711680;
                    if (-5 == (nc.field_H ^ -1)) {
                        statePc = 441;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 441: {
                    var4_ref_vl.field_q = 16776960;
                    var4_ref_vl.field_p = 10;
                    statePc = 442;
                    continue stateLoop;
                }
                case 442: {
                    var4_ref_vl.field_j = var4_ref_vl.field_j + 4.0 * Math.sin(((double)(-var3) + ((double)a.field_h[0].field_h + Math.random() * (double)var3 * 2.0)) * 3.141592653589793 * 2.0 / 256.0);
                    var4_ref_vl.field_a = var4_ref_vl.field_a + 4.0 * Math.cos(2.0 * (((double)(-var3) + ((double)a.field_h[0].field_h + (double)var3 * Math.random() * 2.0)) * 3.141592653589793) / 256.0);
                    var4_ref_vl.field_c = var4_ref_vl.field_j * 4.0 + a.field_h[0].field_a;
                    var4_ref_vl.field_k = var4_ref_vl.field_a * 4.0 + a.field_h[0].field_l;
                    var4_ref_vl.field_a = var4_ref_vl.field_a + a.field_h[0].field_k;
                    var4_ref_vl.field_j = var4_ref_vl.field_j + a.field_h[0].field_d;
                    wk.field_b[eg.a(-87)] = var4_ref_vl;
                    var5++;
                    statePc = 432;
                    continue stateLoop;
                }
                case 443: {
                    if (4 != nc.field_H) {
                        statePc = 455;
                    } else {
                        statePc = 444;
                    }
                    continue stateLoop;
                }
                case 444: {
                    var5 = 4 * (gh.field_b % 8);
                    statePc = 445;
                    continue stateLoop;
                }
                case 445: {
                    if (-257 >= (var5 ^ -1)) {
                        statePc = 455;
                    } else {
                        statePc = 446;
                    }
                    continue stateLoop;
                }
                case 446: {
                    stackIn_450_0 = null;
                    stackIn_447_0 = stackIn_450_0;
                    stackIn_450_1 = null;
                    stackIn_447_1 = stackIn_450_1;
                    if (nc.field_H == 4) {
                        statePc = 450;
                    } else {
                        statePc = 447;
                    }
                    continue stateLoop;
                }
                case 447: {
                    stackIn_449_0 = null;
                    stackIn_449_1 = null;
                    statePc = 449;
                    continue stateLoop;
                }
                case 449: {
                    stackIn_451_0 = null;
                    stackIn_451_1 = null;
                    stackIn_451_2 = 1;
                    statePc = 451;
                    continue stateLoop;
                }
                case 450: {
                    stackIn_451_0 = null;
                    stackIn_451_1 = null;
                    stackIn_451_2 = 4;
                    statePc = 451;
                    continue stateLoop;
                }
                case 451: {
                    var4_ref_vl = new vl(stackIn_451_2, a.field_h[0]);
                    var4_ref_vl.field_q = 16711680;
                    if (nc.field_H != 4) {
                        statePc = 454;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 452: {
                    var4_ref_vl.field_p = 10;
                    var4_ref_vl.field_q = 16776960;
                    statePc = 454;
                    continue stateLoop;
                }
                case 454: {
                    var4_ref_vl.field_j = var4_ref_vl.field_j + 2.0 * Math.sin(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h + var5)) / 256.0);
                    var4_ref_vl.field_a = var4_ref_vl.field_a + Math.cos(2.0 * ((double)(var5 + a.field_h[0].field_h) * 3.141592653589793) / 256.0) * 2.0;
                    var4_ref_vl.field_a = var4_ref_vl.field_a + a.field_h[0].field_k * 0.8;
                    var4_ref_vl.field_j = var4_ref_vl.field_j + a.field_h[0].field_d * 0.8;
                    var4_ref_vl.field_c = a.field_h[0].field_a;
                    var4_ref_vl.field_k = a.field_h[0].field_l;
                    wk.field_b[eg.a(-67)] = var4_ref_vl;
                    var5 += 32;
                    statePc = 445;
                    continue stateLoop;
                }
                case 455: {
                    if (si.field_jb[98]) {
                        statePc = 471;
                    } else {
                        statePc = 456;
                    }
                    continue stateLoop;
                }
                case 456: {
                    if (si.field_jb[99]) {
                        statePc = 471;
                    } else {
                        statePc = 459;
                    }
                    continue stateLoop;
                }
                case 459: {
                    if (0 >= a.field_h[0].field_g) {
                        statePc = 471;
                    } else {
                        statePc = 462;
                    }
                    continue stateLoop;
                }
                case 462: {
                    dupTemp$29 = a.field_h[0];
                    dupTemp$29.field_d = dupTemp$29.field_d * 0.99;
                    dupTemp$30 = a.field_h[0];
                    dupTemp$30.field_k = dupTemp$30.field_k * 0.99;
                    if (gj.field_r == null) {
                        statePc = 489;
                    } else {
                        statePc = 465;
                    }
                    continue stateLoop;
                }
                case 465: {
                    if (0 > og.field_a) {
                        statePc = 489;
                    } else {
                        statePc = 468;
                    }
                    continue stateLoop;
                }
                case 468: {
                    og.field_a = -1;
                    gj.field_r.b(25, 0);
                    statePc = 489;
                    continue stateLoop;
                }
                case 471: {
                    if (null == gj.field_r) {
                        statePc = 482;
                    } else {
                        statePc = 472;
                    }
                    continue stateLoop;
                }
                case 472: {
                    if (0 < og.field_a) {
                        statePc = 489;
                    } else {
                        statePc = 475;
                    }
                    continue stateLoop;
                }
                case 475: {
                    og.field_a = 10;
                    stackIn_480_0 = gj.field_r;
                    stackIn_476_0 = stackIn_480_0;
                    stackIn_480_1 = 10;
                    stackIn_476_1 = stackIn_480_1;
                    if (fe.field_e) {
                        statePc = 480;
                    } else {
                        statePc = 476;
                    }
                    continue stateLoop;
                }
                case 476: {
                    stackIn_478_0 = (gd) ((Object) stackIn_476_0);
                    stackIn_478_1 = stackIn_476_1;
                    statePc = 478;
                    continue stateLoop;
                }
                case 478: {
                    stackIn_481_0 = (gd) ((Object) stackIn_478_0);
                    stackIn_481_1 = stackIn_478_1;
                    stackIn_481_2 = 0;
                    statePc = 481;
                    continue stateLoop;
                }
                case 480: {
                    stackIn_481_0 = (gd) ((Object) stackIn_480_0);
                    stackIn_481_1 = stackIn_480_1;
                    stackIn_481_2 = pk.field_h / 2;
                    statePc = 481;
                    continue stateLoop;
                }
                case 481: {
                    ((gd) (Object) stackIn_481_0).b(stackIn_481_1, stackIn_481_2);
                    statePc = 489;
                    continue stateLoop;
                }
                case 482: {
                    gj.field_r = gd.a(sb.field_e[0], 100, 0);
                    gj.field_r.e(-1);
                    ll.field_c.a(gj.field_r);
                    stackIn_487_0 = gj.field_r;
                    stackIn_483_0 = stackIn_487_0;
                    stackIn_487_1 = 10;
                    stackIn_483_1 = stackIn_487_1;
                    if (fe.field_e) {
                        statePc = 487;
                    } else {
                        statePc = 483;
                    }
                    continue stateLoop;
                }
                case 483: {
                    stackIn_485_0 = (gd) ((Object) stackIn_483_0);
                    stackIn_485_1 = stackIn_483_1;
                    statePc = 485;
                    continue stateLoop;
                }
                case 485: {
                    stackIn_488_0 = (gd) ((Object) stackIn_485_0);
                    stackIn_488_1 = stackIn_485_1;
                    stackIn_488_2 = 0;
                    statePc = 488;
                    continue stateLoop;
                }
                case 487: {
                    stackIn_488_0 = (gd) ((Object) stackIn_487_0);
                    stackIn_488_1 = stackIn_487_1;
                    stackIn_488_2 = pk.field_h / 2;
                    statePc = 488;
                    continue stateLoop;
                }
                case 488: {
                    ((gd) (Object) stackIn_488_0).b(stackIn_488_1, stackIn_488_2);
                    statePc = 489;
                    continue stateLoop;
                }
                case 489: {
                    dupTemp$31 = a.field_h[0];
                    dupTemp$31.field_k = dupTemp$31.field_k * 0.99;
                    if (!si.field_jb[97]) {
                        statePc = 507;
                    } else {
                        statePc = 490;
                    }
                    continue stateLoop;
                }
                case 490: {
                    if ((a.field_h[0].field_g ^ -1) >= -1) {
                        statePc = 507;
                    } else {
                        statePc = 493;
                    }
                    continue stateLoop;
                }
                case 493: {
                    if (8 != e.field_e) {
                        statePc = 498;
                    } else {
                        statePc = 496;
                    }
                    continue stateLoop;
                }
                case 496: {
                    stackIn_499_0 = -150;
                    statePc = 499;
                    continue stateLoop;
                }
                case 498: {
                    stackIn_499_0 = -75;
                    statePc = 499;
                    continue stateLoop;
                }
                case 499: {
                    var2_int = stackIn_499_0;
                    if (this.field_M > var2_int / 3) {
                        statePc = 502;
                    } else {
                        statePc = 503;
                    }
                    continue stateLoop;
                }
                case 502: {
                    this.field_M = var2_int / 3;
                    statePc = 503;
                    continue stateLoop;
                }
                case 503: {
                    if (var2_int >= this.field_M) {
                        statePc = 515;
                    } else {
                        statePc = 504;
                    }
                    continue stateLoop;
                }
                case 504: {
                    this.field_M = this.field_M - 6;
                    statePc = 515;
                    continue stateLoop;
                }
                case 507: {
                    if ((this.field_M ^ -1) <= -1) {
                        statePc = 515;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 510: {
                    this.field_M = this.field_M + 5;
                    if (0 >= this.field_M) {
                        statePc = 515;
                    } else {
                        statePc = 513;
                    }
                    continue stateLoop;
                }
                case 513: {
                    this.field_M = 0;
                    statePc = 515;
                    continue stateLoop;
                }
                case 515: {
                    dupTemp$32 = a.field_h[0];
                    dupTemp$32.field_d = dupTemp$32.field_d * 0.99;
                    if (!si.field_jb[96]) {
                        statePc = 532;
                    } else {
                        statePc = 516;
                    }
                    continue stateLoop;
                }
                case 516: {
                    if (a.field_h[0].field_g <= 0) {
                        statePc = 532;
                    } else {
                        statePc = 519;
                    }
                    continue stateLoop;
                }
                case 519: {
                    if (e.field_e != 8) {
                        statePc = 524;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 522: {
                    stackIn_525_0 = 150;
                    statePc = 525;
                    continue stateLoop;
                }
                case 524: {
                    stackIn_525_0 = 75;
                    statePc = 525;
                    continue stateLoop;
                }
                case 525: {
                    var2_int = stackIn_525_0;
                    if ((var2_int / 3 ^ -1) >= (this.field_M ^ -1)) {
                        statePc = 528;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 526: {
                    this.field_M = var2_int / 3;
                    statePc = 528;
                    continue stateLoop;
                }
                case 528: {
                    if (this.field_M >= var2_int) {
                        statePc = 540;
                    } else {
                        statePc = 529;
                    }
                    continue stateLoop;
                }
                case 529: {
                    this.field_M = this.field_M + 6;
                    statePc = 540;
                    continue stateLoop;
                }
                case 532: {
                    if (-1 > (this.field_M ^ -1)) {
                        statePc = 537;
                    } else {
                        statePc = 540;
                    }
                    continue stateLoop;
                }
                case 537: {
                    this.field_M = this.field_M - 5;
                    if ((this.field_M ^ -1) <= -1) {
                        statePc = 540;
                    } else {
                        statePc = 538;
                    }
                    continue stateLoop;
                }
                case 538: {
                    this.field_M = 0;
                    statePc = 540;
                    continue stateLoop;
                }
                case 540: {
                    a.field_h[0].field_j = this.field_M;
                    if (si.field_jb[83]) {
                        statePc = 550;
                    } else {
                        statePc = 541;
                    }
                    continue stateLoop;
                }
                case 541: {
                    if (si.field_jb[82]) {
                        statePc = 550;
                    } else {
                        statePc = 544;
                    }
                    continue stateLoop;
                }
                case 544: {
                    if (10 != e.field_e) {
                        statePc = 972;
                    } else {
                        statePc = 547;
                    }
                    continue stateLoop;
                }
                case 547: {
                    if (-1 >= (a.field_h[0].field_i ^ -1)) {
                        statePc = 972;
                    } else {
                        statePc = 550;
                    }
                    continue stateLoop;
                }
                case 550: {
                    if (0 < a.field_h[0].field_g) {
                        statePc = 555;
                    } else {
                        statePc = 972;
                    }
                    continue stateLoop;
                }
                case 555: {
                    var2_int = e.field_e;
                    if (var2_int == -1) {
                        statePc = 601;
                    } else {
                        statePc = 556;
                    }
                    continue stateLoop;
                }
                case 556: {
                    if ((var2_int ^ -1) == -1) {
                        statePc = 610;
                    } else {
                        statePc = 559;
                    }
                    continue stateLoop;
                }
                case 559: {
                    if ((var2_int ^ -1) != -2) {
                        statePc = 565;
                    } else {
                        statePc = 619;
                    }
                    continue stateLoop;
                }
                case 565: {
                    if (2 == var2_int) {
                        statePc = 628;
                    } else {
                        statePc = 568;
                    }
                    continue stateLoop;
                }
                case 568: {
                    if (3 != var2_int) {
                        statePc = 574;
                    } else {
                        statePc = 637;
                    }
                    continue stateLoop;
                }
                case 574: {
                    if (4 == var2_int) {
                        statePc = 646;
                    } else {
                        statePc = 577;
                    }
                    continue stateLoop;
                }
                case 577: {
                    if (-6 == (var2_int ^ -1)) {
                        statePc = 655;
                    } else {
                        statePc = 580;
                    }
                    continue stateLoop;
                }
                case 580: {
                    if (var2_int == 6) {
                        statePc = 664;
                    } else {
                        statePc = 583;
                    }
                    continue stateLoop;
                }
                case 583: {
                    if (-8 == (var2_int ^ -1)) {
                        statePc = 673;
                    } else {
                        statePc = 586;
                    }
                    continue stateLoop;
                }
                case 586: {
                    if (var2_int != 8) {
                        statePc = 592;
                    } else {
                        statePc = 682;
                    }
                    continue stateLoop;
                }
                case 592: {
                    if (var2_int == 9) {
                        statePc = 691;
                    } else {
                        statePc = 595;
                    }
                    continue stateLoop;
                }
                case 595: {
                    if (-11 != (var2_int ^ -1)) {
                        statePc = 708;
                    } else {
                        statePc = 700;
                    }
                    continue stateLoop;
                }
                case 601: {
                    if (!fe.field_e) {
                        statePc = 708;
                    } else {
                        statePc = 604;
                    }
                    continue stateLoop;
                }
                case 604: {
                    if (-1 > (a.field_h[0].field_i ^ -1)) {
                        statePc = 708;
                    } else {
                        statePc = 607;
                    }
                    continue stateLoop;
                }
                case 607: {
                    ll.field_c.a(sb.field_e[27], 100, 2 * pk.field_h);
                    statePc = 708;
                    continue stateLoop;
                }
                case 610: {
                    if (!fe.field_e) {
                        statePc = 708;
                    } else {
                        statePc = 613;
                    }
                    continue stateLoop;
                }
                case 613: {
                    if (0 < a.field_h[0].field_i) {
                        statePc = 708;
                    } else {
                        statePc = 616;
                    }
                    continue stateLoop;
                }
                case 616: {
                    ll.field_c.a(sb.field_e[38], 100, pk.field_h * 2);
                    statePc = 708;
                    continue stateLoop;
                }
                case 619: {
                    if (!fe.field_e) {
                        statePc = 708;
                    } else {
                        statePc = 622;
                    }
                    continue stateLoop;
                }
                case 622: {
                    if ((a.field_h[0].field_i ^ -1) >= -1) {
                        statePc = 627;
                    } else {
                        statePc = 708;
                    }
                    continue stateLoop;
                }
                case 627: {
                    ll.field_c.a(sb.field_e[33], 100, pk.field_h * 2);
                    statePc = 708;
                    continue stateLoop;
                }
                case 628: {
                    if (!fe.field_e) {
                        statePc = 708;
                    } else {
                        statePc = 631;
                    }
                    continue stateLoop;
                }
                case 631: {
                    if (-1 > (a.field_h[0].field_i ^ -1)) {
                        statePc = 708;
                    } else {
                        statePc = 634;
                    }
                    continue stateLoop;
                }
                case 634: {
                    ll.field_c.a(sb.field_e[1], 100, pk.field_h * 2);
                    statePc = 708;
                    continue stateLoop;
                }
                case 637: {
                    if (!fe.field_e) {
                        statePc = 708;
                    } else {
                        statePc = 640;
                    }
                    continue stateLoop;
                }
                case 640: {
                    if (-1 <= (a.field_h[0].field_i ^ -1)) {
                        statePc = 645;
                    } else {
                        statePc = 708;
                    }
                    continue stateLoop;
                }
                case 645: {
                    ll.field_c.a(sb.field_e[21], 100, 2 * pk.field_h);
                    statePc = 708;
                    continue stateLoop;
                }
                case 646: {
                    if (!fe.field_e) {
                        statePc = 708;
                    } else {
                        statePc = 649;
                    }
                    continue stateLoop;
                }
                case 649: {
                    if (0 >= af.field_o) {
                        statePc = 654;
                    } else {
                        statePc = 708;
                    }
                    continue stateLoop;
                }
                case 654: {
                    ll.field_c.a(sb.field_e[24], 100, 2 * pk.field_h);
                    af.field_o = 3;
                    statePc = 708;
                    continue stateLoop;
                }
                case 655: {
                    if (!fe.field_e) {
                        statePc = 708;
                    } else {
                        statePc = 658;
                    }
                    continue stateLoop;
                }
                case 658: {
                    if (0 < a.field_h[0].field_i) {
                        statePc = 708;
                    } else {
                        statePc = 661;
                    }
                    continue stateLoop;
                }
                case 661: {
                    ll.field_c.a(sb.field_e[39], 100, pk.field_h * 2);
                    statePc = 708;
                    continue stateLoop;
                }
                case 664: {
                    if (!fe.field_e) {
                        statePc = 708;
                    } else {
                        statePc = 667;
                    }
                    continue stateLoop;
                }
                case 667: {
                    if (a.field_h[0].field_i > 0) {
                        statePc = 708;
                    } else {
                        statePc = 670;
                    }
                    continue stateLoop;
                }
                case 670: {
                    ll.field_c.a(sb.field_e[22], 100, 2 * pk.field_h);
                    statePc = 708;
                    continue stateLoop;
                }
                case 673: {
                    if (!fe.field_e) {
                        statePc = 708;
                    } else {
                        statePc = 676;
                    }
                    continue stateLoop;
                }
                case 676: {
                    if (a.field_h[0].field_i > 0) {
                        statePc = 708;
                    } else {
                        statePc = 679;
                    }
                    continue stateLoop;
                }
                case 679: {
                    ll.field_c.a(sb.field_e[34], 100, 2 * pk.field_h);
                    statePc = 708;
                    continue stateLoop;
                }
                case 682: {
                    if (!fe.field_e) {
                        statePc = 708;
                    } else {
                        statePc = 685;
                    }
                    continue stateLoop;
                }
                case 685: {
                    if (af.field_o <= 0) {
                        statePc = 690;
                    } else {
                        statePc = 708;
                    }
                    continue stateLoop;
                }
                case 690: {
                    ll.field_c.a(sb.field_e[20], 100, pk.field_h * 2);
                    af.field_o = (int)(Math.random() * 10.0) + 15;
                    statePc = 708;
                    continue stateLoop;
                }
                case 691: {
                    if (!fe.field_e) {
                        statePc = 708;
                    } else {
                        statePc = 694;
                    }
                    continue stateLoop;
                }
                case 694: {
                    if ((af.field_o ^ -1) >= -1) {
                        statePc = 699;
                    } else {
                        statePc = 708;
                    }
                    continue stateLoop;
                }
                case 699: {
                    ll.field_c.a(sb.field_e[7], 100, 2 * pk.field_h);
                    af.field_o = 5;
                    statePc = 708;
                    continue stateLoop;
                }
                case 700: {
                    if (!fe.field_e) {
                        statePc = 708;
                    } else {
                        statePc = 703;
                    }
                    continue stateLoop;
                }
                case 703: {
                    if (a.field_h[0].field_i != -1) {
                        statePc = 708;
                    } else {
                        statePc = 706;
                    }
                    continue stateLoop;
                }
                case 706: {
                    ll.field_c.a(sb.field_e[25], 100, pk.field_h * 2);
                    statePc = 708;
                    continue stateLoop;
                }
                case 708: {
                    if (-1 > (a.field_h[0].field_i ^ -1)) {
                        statePc = 972;
                    } else {
                        statePc = 709;
                    }
                    continue stateLoop;
                }
                case 709: {
                    var4 = e.field_e;
                    if (var4 != -1) {
                        statePc = 713;
                    } else {
                        statePc = 767;
                    }
                    continue stateLoop;
                }
                case 713: {
                    if ((var4 ^ -1) == -1) {
                        statePc = 783;
                    } else {
                        statePc = 716;
                    }
                    continue stateLoop;
                }
                case 716: {
                    if (var4 == 1) {
                        statePc = 805;
                    } else {
                        statePc = 719;
                    }
                    continue stateLoop;
                }
                case 719: {
                    if (-3 != (var4 ^ -1)) {
                        statePc = 725;
                    } else {
                        statePc = 829;
                    }
                    continue stateLoop;
                }
                case 725: {
                    if (3 != var4) {
                        statePc = 731;
                    } else {
                        statePc = 859;
                    }
                    continue stateLoop;
                }
                case 731: {
                    if (-5 != (var4 ^ -1)) {
                        statePc = 737;
                    } else {
                        statePc = 883;
                    }
                    continue stateLoop;
                }
                case 737: {
                    if (5 != var4) {
                        statePc = 743;
                    } else {
                        statePc = 887;
                    }
                    continue stateLoop;
                }
                case 743: {
                    if (6 == var4) {
                        statePc = 893;
                    } else {
                        statePc = 746;
                    }
                    continue stateLoop;
                }
                case 746: {
                    if (var4 != 7) {
                        statePc = 752;
                    } else {
                        statePc = 899;
                    }
                    continue stateLoop;
                }
                case 752: {
                    if ((var4 ^ -1) != -9) {
                        statePc = 758;
                    } else {
                        statePc = 937;
                    }
                    continue stateLoop;
                }
                case 758: {
                    if ((var4 ^ -1) == -10) {
                        statePc = 943;
                    } else {
                        statePc = 761;
                    }
                    continue stateLoop;
                }
                case 761: {
                    if (10 != var4) {
                        statePc = 972;
                    } else {
                        statePc = 949;
                    }
                    continue stateLoop;
                }
                case 767: {
                    fieldTemp$33 = mj.field_F + 1;
                    mj.field_F = mj.field_F + 1;
                    if ((fieldTemp$33 ^ -1) < -5) {
                        statePc = 772;
                    } else {
                        statePc = 773;
                    }
                    continue stateLoop;
                }
                case 772: {
                    mj.field_F = 0;
                    statePc = 773;
                    continue stateLoop;
                }
                case 773: {
                    a.field_h[0].field_i = 5;
                    var4 = mj.field_F + -1;
                    if ((var4 ^ -1) != -3) {
                        statePc = 775;
                    } else {
                        statePc = 774;
                    }
                    continue stateLoop;
                }
                case 774: {
                    var4 = 0;
                    statePc = 775;
                    continue stateLoop;
                }
                case 775: {
                    if ((var4 ^ -1) == -4) {
                        statePc = 778;
                    } else {
                        statePc = 779;
                    }
                    continue stateLoop;
                }
                case 778: {
                    var4 = -1;
                    statePc = 779;
                    continue stateLoop;
                }
                case 779: {
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
                        statePc = 782;
                    } else {
                        statePc = 780;
                    }
                    continue stateLoop;
                }
                case 780: {
                    var2_ref.field_q = 8421631;
                    var2_ref.field_p = 2;
                    statePc = 782;
                    continue stateLoop;
                }
                case 782: {
                    wk.field_b[eg.a(-27)] = var2_ref;
                    statePc = 972;
                    continue stateLoop;
                }
                case 783: {
                    fieldTemp$34 = mj.field_F + 1;
                    mj.field_F = mj.field_F + 1;
                    if (fieldTemp$34 <= 1) {
                        statePc = 786;
                    } else {
                        statePc = 784;
                    }
                    continue stateLoop;
                }
                case 784: {
                    mj.field_F = 0;
                    statePc = 786;
                    continue stateLoop;
                }
                case 786: {
                    a.field_h[0].field_i = 10;
                    var4 = -4;
                    statePc = 787;
                    continue stateLoop;
                }
                case 787: {
                    if (-5 > (var4 ^ -1)) {
                        statePc = 972;
                    } else {
                        statePc = 788;
                    }
                    continue stateLoop;
                }
                case 788: {
                    var2_ref = new vl(0, a.field_h[0]);
                    var2_ref.field_j = var2_ref.field_j - Math.sin(2.0 * ((double)(a.field_h[0].field_h - -(1 * var4)) * 3.141592653589793) / 256.0) * 8.0;
                    var2_ref.field_a = var2_ref.field_a - Math.cos(3.141592653589793 * (double)(1 * var4 + a.field_h[0].field_h) * 2.0 / 256.0) * 8.0;
                    var2_ref.field_k = -((double)var4 * var2_ref.field_j / 4.0) + (a.field_h[0].field_l + 2.0 * var2_ref.field_a);
                    var2_ref.field_c = var2_ref.field_a * (double)var4 / 4.0 + (a.field_h[0].field_a + 2.0 * var2_ref.field_j);
                    var2_ref.field_q = 255;
                    var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k;
                    var2_ref.field_n = e.field_e;
                    var2_ref.field_p = 2;
                    var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d;
                    stackIn_984_0 = var4 ^ -1;
                    stackIn_789_0 = stackIn_984_0;
                    stackIn_984_1 = -1;
                    stackIn_789_1 = stackIn_984_1;
                    if (false) {
                        statePc = 984;
                    } else {
                        statePc = 789;
                    }
                    continue stateLoop;
                }
                case 789: {
                    if (stackIn_789_0 != stackIn_789_1) {
                        statePc = 795;
                    } else {
                        statePc = 792;
                    }
                    continue stateLoop;
                }
                case 792: {
                    if (-1 == (mj.field_F ^ -1)) {
                        statePc = 801;
                    } else {
                        statePc = 795;
                    }
                    continue stateLoop;
                }
                case 795: {
                    if ((var4 ^ -1) == -1) {
                        statePc = 803;
                    } else {
                        statePc = 798;
                    }
                    continue stateLoop;
                }
                case 798: {
                    if (1 != mj.field_F) {
                        statePc = 803;
                    } else {
                        statePc = 801;
                    }
                    continue stateLoop;
                }
                case 801: {
                    var2_ref.field_q = 8421631;
                    statePc = 803;
                    continue stateLoop;
                }
                case 803: {
                    wk.field_b[eg.a(-109)] = var2_ref;
                    var4 += 4;
                    statePc = 787;
                    continue stateLoop;
                }
                case 805: {
                    fieldTemp$35 = mj.field_F + 1;
                    mj.field_F = mj.field_F + 1;
                    if ((fieldTemp$35 ^ -1) < -2) {
                        statePc = 808;
                    } else {
                        statePc = 809;
                    }
                    continue stateLoop;
                }
                case 808: {
                    mj.field_F = 0;
                    statePc = 809;
                    continue stateLoop;
                }
                case 809: {
                    a.field_h[0].field_i = 5;
                    var4 = -3;
                    statePc = 810;
                    continue stateLoop;
                }
                case 810: {
                    if (-4 > (var4 ^ -1)) {
                        statePc = 972;
                    } else {
                        statePc = 811;
                    }
                    continue stateLoop;
                }
                case 811: {
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
                    stackIn_984_0 = Math.abs(var4) ^ -1;
                    stackIn_812_0 = stackIn_984_0;
                    stackIn_984_1 = -2;
                    stackIn_812_1 = stackIn_984_1;
                    if (false) {
                        statePc = 984;
                    } else {
                        statePc = 812;
                    }
                    continue stateLoop;
                }
                case 812: {
                    if (stackIn_812_0 < stackIn_812_1) {
                        statePc = 818;
                    } else {
                        statePc = 815;
                    }
                    continue stateLoop;
                }
                case 815: {
                    if (mj.field_F == 0) {
                        statePc = 826;
                    } else {
                        statePc = 818;
                    }
                    continue stateLoop;
                }
                case 818: {
                    if ((Math.abs(var4) ^ -1) >= -2) {
                        statePc = 827;
                    } else {
                        statePc = 821;
                    }
                    continue stateLoop;
                }
                case 821: {
                    if (mj.field_F == 1) {
                        statePc = 826;
                    } else {
                        statePc = 827;
                    }
                    continue stateLoop;
                }
                case 826: {
                    var2_ref.field_q = 16760896;
                    statePc = 827;
                    continue stateLoop;
                }
                case 827: {
                    var4 += 2;
                    statePc = 810;
                    continue stateLoop;
                }
                case 829: {
                    a.field_h[0].field_i = 6;
                    fieldTemp$36 = mj.field_F + 1;
                    mj.field_F = mj.field_F + 1;
                    if ((fieldTemp$36 ^ -1) >= -4) {
                        statePc = 832;
                    } else {
                        statePc = 830;
                    }
                    continue stateLoop;
                }
                case 830: {
                    mj.field_F = 0;
                    statePc = 832;
                    continue stateLoop;
                }
                case 832: {
                    var4 = -1;
                    statePc = 833;
                    continue stateLoop;
                }
                case 833: {
                    if (-2 > (var4 ^ -1)) {
                        statePc = 972;
                    } else {
                        statePc = 834;
                    }
                    continue stateLoop;
                }
                case 834: {
                    var2_ref = new vl(0, a.field_h[0]);
                    stackIn_973_0 = var4 ^ -1;
                    stackIn_835_0 = stackIn_973_0;
                    if (false) {
                        statePc = 973;
                    } else {
                        statePc = 835;
                    }
                    continue stateLoop;
                }
                case 835: {
                    if (stackIn_835_0 != 0) {
                        statePc = 840;
                    } else {
                        statePc = 838;
                    }
                    continue stateLoop;
                }
                case 838: {
                    mj.field_F = 3 - mj.field_F;
                    statePc = 840;
                    continue stateLoop;
                }
                case 840: {
                    var2_ref.field_j = var2_ref.field_j - Math.sin(3.141592653589793 * (double)(a.field_h[0].field_h + 4 * (1 + mj.field_F) * var4) * 2.0 / 256.0) * 6.0;
                    var2_ref.field_a = var2_ref.field_a - Math.cos((double)(a.field_h[0].field_h + (mj.field_F - -1) * (var4 * 4)) * 3.141592653589793 * 2.0 / 256.0) * 6.0;
                    var2_ref.field_c = var2_ref.field_j * 3.0 + a.field_h[0].field_a;
                    if ((var4 ^ -1) == 0) {
                        statePc = 843;
                    } else {
                        statePc = 844;
                    }
                    continue stateLoop;
                }
                case 843: {
                    mj.field_F = -mj.field_F + 3;
                    statePc = 844;
                    continue stateLoop;
                }
                case 844: {
                    var2_ref.field_k = a.field_h[0].field_l + var2_ref.field_a * 3.0;
                    var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d;
                    var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k;
                    var2_ref.field_q = 255;
                    var2_ref.field_p = 4;
                    var2_ref.field_n = e.field_e;
                    if (var4 != 0) {
                        statePc = 848;
                    } else {
                        statePc = 845;
                    }
                    continue stateLoop;
                }
                case 845: {
                    if (0 == mj.field_F % 2) {
                        statePc = 856;
                    } else {
                        statePc = 848;
                    }
                    continue stateLoop;
                }
                case 848: {
                    if (-1 == (var4 ^ -1)) {
                        statePc = 857;
                    } else {
                        statePc = 851;
                    }
                    continue stateLoop;
                }
                case 851: {
                    if ((mj.field_F % 2 ^ -1) == -2) {
                        statePc = 856;
                    } else {
                        statePc = 857;
                    }
                    continue stateLoop;
                }
                case 856: {
                    var2_ref.field_q = 8421631;
                    statePc = 857;
                    continue stateLoop;
                }
                case 857: {
                    wk.field_b[eg.a(-51)] = var2_ref;
                    var4 += 2;
                    statePc = 833;
                    continue stateLoop;
                }
                case 859: {
                    a.field_h[0].field_i = 10;
                    var4 = -3;
                    statePc = 860;
                    continue stateLoop;
                }
                case 860: {
                    if (var4 > 3) {
                        statePc = 972;
                    } else {
                        statePc = 861;
                    }
                    continue stateLoop;
                }
                case 861: {
                    var2_ref = new vl(0, a.field_h[0]);
                    var5_double = 5.0;
                    stackIn_984_0 = Math.abs(var4) ^ -1;
                    stackIn_862_0 = stackIn_984_0;
                    stackIn_984_1 = -4;
                    stackIn_862_1 = stackIn_984_1;
                    if (false) {
                        statePc = 984;
                    } else {
                        statePc = 862;
                    }
                    continue stateLoop;
                }
                case 862: {
                    if (stackIn_862_0 == stackIn_862_1) {
                        statePc = 866;
                    } else {
                        statePc = 867;
                    }
                    continue stateLoop;
                }
                case 866: {
                    var5_double = 4.5;
                    statePc = 867;
                    continue stateLoop;
                }
                case 867: {
                    if (2 != Math.abs(var4)) {
                        statePc = 869;
                    } else {
                        statePc = 868;
                    }
                    continue stateLoop;
                }
                case 868: {
                    var5_double = 4.8;
                    statePc = 869;
                    continue stateLoop;
                }
                case 869: {
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
                        statePc = 872;
                    } else {
                        statePc = 873;
                    }
                    continue stateLoop;
                }
                case 872: {
                    var2_ref.field_q = 16711680;
                    var2_ref.field_d = 16760960;
                    statePc = 873;
                    continue stateLoop;
                }
                case 873: {
                    if ((Math.abs(var4) ^ -1) == -2) {
                        statePc = 876;
                    } else {
                        statePc = 877;
                    }
                    continue stateLoop;
                }
                case 876: {
                    var2_ref.field_q = 16711680;
                    var2_ref.field_d = 16777088;
                    statePc = 877;
                    continue stateLoop;
                }
                case 877: {
                    if ((Math.abs(var4) ^ -1) == -1) {
                        statePc = 880;
                    } else {
                        statePc = 881;
                    }
                    continue stateLoop;
                }
                case 880: {
                    var2_ref.field_q = 16711680;
                    var2_ref.field_d = 16777088;
                    statePc = 881;
                    continue stateLoop;
                }
                case 881: {
                    wk.field_b[eg.a(-67)] = var2_ref;
                    var2_ref.field_n = e.field_e;
                    var2_ref.field_l = 5;
                    var4++;
                    statePc = 860;
                    continue stateLoop;
                }
                case 883: {
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
                        statePc = 886;
                    } else {
                        statePc = 884;
                    }
                    continue stateLoop;
                }
                case 884: {
                    wk.field_b[var4] = var2_ref;
                    statePc = 886;
                    continue stateLoop;
                }
                case 886: {
                    var2_ref.field_n = e.field_e;
                    statePc = 972;
                    continue stateLoop;
                }
                case 887: {
                    a.field_h[0].field_i = 35;
                    var4 = -30;
                    statePc = 888;
                    continue stateLoop;
                }
                case 888: {
                    if (30 < var4) {
                        statePc = 972;
                    } else {
                        statePc = 889;
                    }
                    continue stateLoop;
                }
                case 889: {
                    var2_ref = new vl(0, a.field_h[0]);
                    var2_ref.field_j = var2_ref.field_j - Math.sin(3.141592653589793 * (double)(var4 + a.field_h[0].field_h) * 2.0 / 256.0) * 4.0;
                    var2_ref.field_a = var2_ref.field_a - 4.0 * Math.cos((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0);
                    var2_ref.field_c = a.field_h[0].field_a + var2_ref.field_j * 4.0;
                    var2_ref.field_k = a.field_h[0].field_l + 4.0 * var2_ref.field_a;
                    var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d;
                    var2_ref.field_p = 1;
                    var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k;
                    var2_ref.field_q = 65280 + (Math.abs(var4) * 255 / 30 << 1688133712 & 16771312);
                    wk.field_b[eg.a(-54)] = var2_ref;
                    var2_ref.field_n = e.field_e;
                    var4++;
                    statePc = 888;
                    continue stateLoop;
                }
                case 893: {
                    a.field_h[0].field_i = 5;
                    var4 = -10;
                    statePc = 894;
                    continue stateLoop;
                }
                case 894: {
                    if (-11 > (var4 ^ -1)) {
                        statePc = 972;
                    } else {
                        statePc = 895;
                    }
                    continue stateLoop;
                }
                case 895: {
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
                    statePc = 894;
                    continue stateLoop;
                }
                case 899: {
                    a.field_h[0].field_i = 10;
                    var4 = -11;
                    statePc = 900;
                    continue stateLoop;
                }
                case 900: {
                    if (var4 > -9) {
                        statePc = 911;
                    } else {
                        statePc = 901;
                    }
                    continue stateLoop;
                }
                case 901: {
                    var2_ref = new vl(0, a.field_h[0]);
                    var5_double = 5.0;
                    stackIn_913_0 = 3;
                    stackIn_902_0 = stackIn_913_0;
                    stackIn_913_1 = Math.abs(var4 + 10);
                    stackIn_902_1 = stackIn_913_1;
                    if (false) {
                        statePc = 913;
                    } else {
                        statePc = 902;
                    }
                    continue stateLoop;
                }
                case 902: {
                    if (stackIn_902_0 != stackIn_902_1) {
                        statePc = 906;
                    } else {
                        statePc = 905;
                    }
                    continue stateLoop;
                }
                case 905: {
                    var5_double = 4.5;
                    statePc = 906;
                    continue stateLoop;
                }
                case 906: {
                    if (2 == Math.abs(var4 - -10)) {
                        statePc = 909;
                    } else {
                        statePc = 910;
                    }
                    continue stateLoop;
                }
                case 909: {
                    var5_double = 4.8;
                    statePc = 910;
                    continue stateLoop;
                }
                case 910: {
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
                    statePc = 900;
                    continue stateLoop;
                }
                case 911: {
                    var4 = -3;
                    statePc = 912;
                    continue stateLoop;
                }
                case 912: {
                    stackIn_913_0 = var4;
                    stackIn_913_1 = 3;
                    statePc = 913;
                    continue stateLoop;
                }
                case 913: {
                    if (stackIn_913_0 > stackIn_913_1) {
                        statePc = 922;
                    } else {
                        statePc = 914;
                    }
                    continue stateLoop;
                }
                case 914: {
                    var2_ref = new vl(0, a.field_h[0]);
                    var5_double = 5.0;
                    stackIn_924_0 = Math.abs(var4) ^ -1;
                    stackIn_915_0 = stackIn_924_0;
                    stackIn_924_1 = -4;
                    stackIn_915_1 = stackIn_924_1;
                    if (false) {
                        statePc = 924;
                    } else {
                        statePc = 915;
                    }
                    continue stateLoop;
                }
                case 915: {
                    if (stackIn_915_0 != stackIn_915_1) {
                        statePc = 919;
                    } else {
                        statePc = 918;
                    }
                    continue stateLoop;
                }
                case 918: {
                    var5_double = 4.5;
                    statePc = 919;
                    continue stateLoop;
                }
                case 919: {
                    if (-3 != (Math.abs(var4) ^ -1)) {
                        statePc = 921;
                    } else {
                        statePc = 920;
                    }
                    continue stateLoop;
                }
                case 920: {
                    var5_double = 4.8;
                    statePc = 921;
                    continue stateLoop;
                }
                case 921: {
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
                    statePc = 912;
                    continue stateLoop;
                }
                case 922: {
                    var4 = 9;
                    statePc = 923;
                    continue stateLoop;
                }
                case 923: {
                    stackIn_924_0 = var4 ^ -1;
                    stackIn_924_1 = -12;
                    statePc = 924;
                    continue stateLoop;
                }
                case 924: {
                    if (stackIn_924_0 < stackIn_924_1) {
                        statePc = 972;
                    } else {
                        statePc = 925;
                    }
                    continue stateLoop;
                }
                case 925: {
                    var2_ref = new vl(0, a.field_h[0]);
                    var5_double = 5.0;
                    stackIn_984_0 = Math.abs(var4 + -10);
                    stackIn_926_0 = stackIn_984_0;
                    stackIn_984_1 = 3;
                    stackIn_926_1 = stackIn_984_1;
                    if (false) {
                        statePc = 984;
                    } else {
                        statePc = 926;
                    }
                    continue stateLoop;
                }
                case 926: {
                    if (stackIn_926_0 == stackIn_926_1) {
                        statePc = 930;
                    } else {
                        statePc = 931;
                    }
                    continue stateLoop;
                }
                case 930: {
                    var5_double = 4.5;
                    statePc = 931;
                    continue stateLoop;
                }
                case 931: {
                    if (-3 == (Math.abs(var4 - 10) ^ -1)) {
                        statePc = 934;
                    } else {
                        statePc = 935;
                    }
                    continue stateLoop;
                }
                case 934: {
                    var5_double = 4.8;
                    statePc = 935;
                    continue stateLoop;
                }
                case 935: {
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
                    statePc = 923;
                    continue stateLoop;
                }
                case 937: {
                    a.field_h[0].field_i = 1;
                    var4 = 0;
                    statePc = 938;
                    continue stateLoop;
                }
                case 938: {
                    if (10 <= var4) {
                        statePc = 972;
                    } else {
                        statePc = 939;
                    }
                    continue stateLoop;
                }
                case 939: {
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
                    statePc = 938;
                    continue stateLoop;
                }
                case 943: {
                    a.field_h[0].field_i = 1;
                    var4 = -2;
                    statePc = 944;
                    continue stateLoop;
                }
                case 944: {
                    if ((var4 ^ -1) < -3) {
                        statePc = 972;
                    } else {
                        statePc = 945;
                    }
                    continue stateLoop;
                }
                case 945: {
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
                    statePc = 944;
                    continue stateLoop;
                }
                case 949: {
                    dupTemp$37 = a.field_h[0];
                    dupTemp$37.field_i = dupTemp$37.field_i - 1;
                    if ((a.field_h[0].field_i ^ -1) < 24) {
                        statePc = 952;
                    } else {
                        statePc = 950;
                    }
                    continue stateLoop;
                }
                case 950: {
                    a.field_h[0].field_i = 10;
                    statePc = 952;
                    continue stateLoop;
                }
                case 952: {
                    var3 = -a.field_h[0].field_i;
                    if (15 < var3) {
                        statePc = 955;
                    } else {
                        statePc = 956;
                    }
                    continue stateLoop;
                }
                case 955: {
                    var3 = -var3 + 25;
                    statePc = 956;
                    continue stateLoop;
                }
                case 956: {
                    if (-11 <= (var3 ^ -1)) {
                        statePc = 958;
                    } else {
                        statePc = 957;
                    }
                    continue stateLoop;
                }
                case 957: {
                    var3 = 10;
                    statePc = 958;
                    continue stateLoop;
                }
                case 958: {
                    if (-2 < (var3 ^ -1)) {
                        statePc = 961;
                    } else {
                        statePc = 962;
                    }
                    continue stateLoop;
                }
                case 961: {
                    var3 = 1;
                    statePc = 962;
                    continue stateLoop;
                }
                case 962: {
                    var4 = -1;
                    statePc = 963;
                    continue stateLoop;
                }
                case 963: {
                    if (-2 > (var4 ^ -1)) {
                        statePc = 972;
                    } else {
                        statePc = 964;
                    }
                    continue stateLoop;
                }
                case 964: {
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
                    stackIn_973_0 = var4;
                    stackIn_965_0 = stackIn_973_0;
                    if (false) {
                        statePc = 973;
                    } else {
                        statePc = 965;
                    }
                    continue stateLoop;
                }
                case 965: {
                    if (stackIn_965_0 == 0) {
                        statePc = 970;
                    } else {
                        statePc = 968;
                    }
                    continue stateLoop;
                }
                case 968: {
                    var2_ref.field_n = 11;
                    statePc = 970;
                    continue stateLoop;
                }
                case 970: {
                    var4++;
                    statePc = 963;
                    continue stateLoop;
                }
                case 972: {
                    stackIn_973_0 = s.field_i ? 1 : 0;
                    statePc = 973;
                    continue stateLoop;
                }
                case 973: {
                    if (stackIn_973_0 == 0) {
                        statePc = 1016;
                    } else {
                        statePc = 974;
                    }
                    continue stateLoop;
                }
                case 974: {
                    if (na.field_j == null) {
                        statePc = 979;
                    } else {
                        statePc = 1016;
                    }
                    continue stateLoop;
                }
                case 979: {
                    if (!qh.c(89)) {
                        statePc = 1016;
                    } else {
                        statePc = 980;
                    }
                    continue stateLoop;
                }
                case 980: {
                    stackIn_982_0 = gi.field_f ^ -1;
                    statePc = 982;
                    continue stateLoop;
                }
                case 982: {
                    stackIn_984_0 = stackIn_982_0;
                    stackIn_984_1 = -34;
                    statePc = 984;
                    continue stateLoop;
                }
                case 984: {
                    if (stackIn_984_0 != stackIn_984_1) {
                        statePc = 993;
                    } else {
                        statePc = 985;
                    }
                    continue stateLoop;
                }
                case 985: {
                    if (ph.field_D < 2) {
                        statePc = 993;
                    } else {
                        statePc = 988;
                    }
                    continue stateLoop;
                }
                case 988: {
                    e.field_e = e.field_e + 1;
                    e.field_c = true;
                    if (-11 <= (e.field_e ^ -1)) {
                        statePc = 993;
                    } else {
                        statePc = 991;
                    }
                    continue stateLoop;
                }
                case 991: {
                    e.field_e = -1;
                    statePc = 993;
                    continue stateLoop;
                }
                case 993: {
                    if (41 != gi.field_f) {
                        statePc = 1004;
                    } else {
                        statePc = 994;
                    }
                    continue stateLoop;
                }
                case 994: {
                    if (ph.field_D < 2) {
                        statePc = 1004;
                    } else {
                        statePc = 997;
                    }
                    continue stateLoop;
                }
                case 997: {
                    if (hd.field_b) {
                        statePc = 1002;
                    } else {
                        statePc = 1000;
                    }
                    continue stateLoop;
                }
                case 1000: {
                    stackIn_1003_0 = 1;
                    statePc = 1003;
                    continue stateLoop;
                }
                case 1002: {
                    stackIn_1003_0 = 0;
                    statePc = 1003;
                    continue stateLoop;
                }
                case 1003: {
                    hd.field_b = stackIn_1003_0 != 0;
                    statePc = 1004;
                    continue stateLoop;
                }
                case 1004: {
                    if (gi.field_f != 48) {
                        statePc = 1011;
                    } else {
                        statePc = 1005;
                    }
                    continue stateLoop;
                }
                case 1005: {
                    if (-3 >= (ph.field_D ^ -1)) {
                        statePc = 1010;
                    } else {
                        statePc = 1011;
                    }
                    continue stateLoop;
                }
                case 1010: {
                    hj.a(255, 0, 1);
                    statePc = 1011;
                    continue stateLoop;
                }
                case 1011: {
                    if ((gi.field_f ^ -1) == -14) {
                        statePc = 1014;
                    } else {
                        statePc = 979;
                    }
                    continue stateLoop;
                }
                case 1014: {
                    na.field_j = new ij((stellarshard) (this));
                    tl.field_c = 0;
                    statePc = 1015;
                    continue stateLoop;
                }
                case 1015: {
                    return;
                }
                case 1016: {
                    this.q(50);
                    var2_int = 0;
                    var3 = 0;
                    var4 = 0;
                    var5 = 0;
                    statePc = 1017;
                    continue stateLoop;
                }
                case 1017: {
                    if (var5 >= 1000) {
                        statePc = 1068;
                    } else {
                        statePc = 1018;
                    }
                    continue stateLoop;
                }
                case 1018: {
                    stackIn_1080_0 = a.field_h[var5];
                    stackIn_1019_0 = stackIn_1080_0;
                    if (false) {
                        statePc = 1080;
                    } else {
                        statePc = 1019;
                    }
                    continue stateLoop;
                }
                case 1019: {
                    if (stackIn_1019_0 == null) {
                        statePc = 1035;
                    } else {
                        statePc = 1022;
                    }
                    continue stateLoop;
                }
                case 1022: {
                    if (14 != a.field_h[var5].field_m) {
                        statePc = 1035;
                    } else {
                        statePc = 1025;
                    }
                    continue stateLoop;
                }
                case 1025: {
                    if ((var5 ^ -1) <= -1000) {
                        statePc = 1035;
                    } else {
                        statePc = 1028;
                    }
                    continue stateLoop;
                }
                case 1028: {
                    if (null == a.field_h[1 + var5]) {
                        statePc = 1034;
                    } else {
                        statePc = 1031;
                    }
                    continue stateLoop;
                }
                case 1031: {
                    if ((a.field_h[1 + var5].field_m ^ -1) == -15) {
                        statePc = 1035;
                    } else {
                        statePc = 1034;
                    }
                    continue stateLoop;
                }
                case 1034: {
                    var6_ref_qe = a.field_h[var5];
                    a.field_h[var5] = a.field_h[1 + var5];
                    a.field_h[1 + var5] = var6_ref_qe;
                    statePc = 1035;
                    continue stateLoop;
                }
                case 1035: {
                    if (a.field_h[var5] == null) {
                        statePc = 1067;
                    } else {
                        statePc = 1036;
                    }
                    continue stateLoop;
                }
                case 1036: {
                    if (a.field_h[var5].field_m == -1) {
                        statePc = 1065;
                    } else {
                        statePc = 1039;
                    }
                    continue stateLoop;
                }
                case 1039: {
                    if (a.field_h[var5].field_m == 11) {
                        statePc = 1066;
                    } else {
                        statePc = 1042;
                    }
                    continue stateLoop;
                }
                case 1042: {
                    var4++;
                    if (1 == a.field_h[var5].field_m) {
                        statePc = 1047;
                    } else {
                        statePc = 1048;
                    }
                    continue stateLoop;
                }
                case 1047: {
                    var4 += 2;
                    statePc = 1048;
                    continue stateLoop;
                }
                case 1048: {
                    if (a.field_h[var5].field_m != 5) {
                        statePc = 1051;
                    } else {
                        statePc = 1049;
                    }
                    continue stateLoop;
                }
                case 1049: {
                    var4 += 2;
                    statePc = 1051;
                    continue stateLoop;
                }
                case 1051: {
                    if (3 != a.field_h[var5].field_m) {
                        statePc = 1054;
                    } else {
                        statePc = 1052;
                    }
                    continue stateLoop;
                }
                case 1052: {
                    var4 += 2;
                    statePc = 1054;
                    continue stateLoop;
                }
                case 1054: {
                    if (7 != a.field_h[var5].field_m) {
                        statePc = 1057;
                    } else {
                        statePc = 1055;
                    }
                    continue stateLoop;
                }
                case 1055: {
                    var4 += 4;
                    statePc = 1057;
                    continue stateLoop;
                }
                case 1057: {
                    if (6 == a.field_h[var5].field_m) {
                        statePc = 1060;
                    } else {
                        statePc = 1061;
                    }
                    continue stateLoop;
                }
                case 1060: {
                    var4 += 4;
                    statePc = 1061;
                    continue stateLoop;
                }
                case 1061: {
                    if ((a.field_h[var5].field_m ^ -1) == -15) {
                        statePc = 1064;
                    } else {
                        statePc = 1066;
                    }
                    continue stateLoop;
                }
                case 1064: {
                    var4 += 20;
                    statePc = 1066;
                    continue stateLoop;
                }
                case 1065: {
                    var2_int = (int)a.field_h[var5].field_a;
                    var3 = (int)a.field_h[var5].field_l;
                    statePc = 1066;
                    continue stateLoop;
                }
                case 1066: {
                    a.field_h[var5] = a.field_h[var5].a(-95);
                    statePc = 1067;
                    continue stateLoop;
                }
                case 1067: {
                    var5++;
                    statePc = 1017;
                    continue stateLoop;
                }
                case 1068: {
                    if (!s.field_i) {
                        statePc = 1135;
                    } else {
                        statePc = 1069;
                    }
                    continue stateLoop;
                }
                case 1069: {
                    if (pk.a(-12663, 0)) {
                        statePc = 1074;
                    } else {
                        statePc = 1135;
                    }
                    continue stateLoop;
                }
                case 1074: {
                    if (null == a.field_h[0]) {
                        statePc = 1086;
                    } else {
                        statePc = 1075;
                    }
                    continue stateLoop;
                }
                case 1075: {
                    if (0 != (a.field_h[0].field_m ^ -1)) {
                        statePc = 1086;
                    } else {
                        statePc = 1078;
                    }
                    continue stateLoop;
                }
                case 1078: {
                    stackIn_1080_0 = a.field_h[0];
                    statePc = 1080;
                    continue stateLoop;
                }
                case 1080: {
                    if (stackIn_1080_0.field_g > 0) {
                        statePc = 1086;
                    } else {
                        statePc = 1081;
                    }
                    continue stateLoop;
                }
                case 1081: {
                    if (0 != nc.field_H) {
                        statePc = 1086;
                    } else {
                        statePc = 1084;
                    }
                    continue stateLoop;
                }
                case 1084: {
                    stackIn_1087_0 = 1;
                    statePc = 1087;
                    continue stateLoop;
                }
                case 1086: {
                    stackIn_1087_0 = 0;
                    statePc = 1087;
                    continue stateLoop;
                }
                case 1087: {
                    var5 = stackIn_1087_0;
                    if (var5 == 0) {
                        statePc = 1090;
                    } else {
                        statePc = 1104;
                    }
                    continue stateLoop;
                }
                case 1090: {
                    pk.field_c = pk.field_c - 1;
                    if (-1 < (pk.field_c ^ -1)) {
                        statePc = 1093;
                    } else {
                        statePc = 1104;
                    }
                    continue stateLoop;
                }
                case 1093: {
                    var6 = gh.field_b;
                    if ((var6 ^ -1) < -6) {
                        statePc = 1096;
                    } else {
                        statePc = 1097;
                    }
                    continue stateLoop;
                }
                case 1096: {
                    var6 = 5;
                    statePc = 1097;
                    continue stateLoop;
                }
                case 1097: {
                    pk.field_c = 25 + var6 * 25;
                    var7 = 160 + -(var6 * 32);
                    if (-1 <= (var7 ^ -1)) {
                        statePc = 1104;
                    } else {
                        statePc = 1098;
                    }
                    continue stateLoop;
                }
                case 1098: {
                    if (fe.field_e) {
                        statePc = 1103;
                    } else {
                        statePc = 1104;
                    }
                    continue stateLoop;
                }
                case 1103: {
                    ll.field_c.a(sb.field_e[46], var7, pk.field_h * 6);
                    statePc = 1104;
                    continue stateLoop;
                }
                case 1104: {
                    gf.field_c = gf.field_c + 1;
                    var6_double = 1.7976931348623157e+308;
                    var8 = null;
                    var9 = 0;
                    statePc = 1105;
                    continue stateLoop;
                }
                case 1105: {
                    if ((var9 ^ -1) <= -1001) {
                        statePc = 1120;
                    } else {
                        statePc = 1106;
                    }
                    continue stateLoop;
                }
                case 1106: {
                    var10 = a.field_h[var9];
                    if (var10 == null) {
                        statePc = 1119;
                    } else {
                        statePc = 1109;
                    }
                    continue stateLoop;
                }
                case 1109: {
                    if (0 == (var10.field_m ^ -1)) {
                        statePc = 1119;
                    } else {
                        statePc = 1112;
                    }
                    continue stateLoop;
                }
                case 1112: {
                    if (var10.a((byte) -102)) {
                        statePc = 1117;
                    } else {
                        statePc = 1119;
                    }
                    continue stateLoop;
                }
                case 1117: {
                    var11 = -(int)var10.field_a + var2_int;
                    var12 = var3 - (int)var10.field_l;
                    var13 = Math.sqrt((double)(var12 * var12 + var11 * var11));
                    if (var13 >= var6_double) {
                        statePc = 1119;
                    } else {
                        statePc = 1118;
                    }
                    continue stateLoop;
                }
                case 1118: {
                    var6_double = var13;
                    var8 = var10;
                    statePc = 1119;
                    continue stateLoop;
                }
                case 1119: {
                    var9++;
                    statePc = 1105;
                    continue stateLoop;
                }
                case 1120: {
                    if (null == var8) {
                        statePc = 1135;
                    } else {
                        statePc = 1121;
                    }
                    continue stateLoop;
                }
                case 1121: {
                    var9 = 128;
                    if (var6_double <= 0.0) {
                        statePc = 1123;
                    } else {
                        statePc = 1122;
                    }
                    continue stateLoop;
                }
                case 1122: {
                    var9 = (int)(2560.0 / var6_double);
                    statePc = 1123;
                    continue stateLoop;
                }
                case 1123: {
                    if (-129 > (var9 ^ -1)) {
                        statePc = 1126;
                    } else {
                        statePc = 1127;
                    }
                    continue stateLoop;
                }
                case 1126: {
                    var9 = 128;
                    statePc = 1127;
                    continue stateLoop;
                }
                case 1127: {
                    ag.field_a = ag.field_a + var9;
                    if (256 >= ag.field_a) {
                        statePc = 1135;
                    } else {
                        statePc = 1128;
                    }
                    continue stateLoop;
                }
                case 1128: {
                    if (fe.field_e) {
                        statePc = 1133;
                    } else {
                        statePc = 1134;
                    }
                    continue stateLoop;
                }
                case 1133: {
                    ll.field_c.a(sb.field_e[13], var9, pk.field_h * 64 / 50);
                    statePc = 1134;
                    continue stateLoop;
                }
                case 1134: {
                    ag.field_a = 0;
                    statePc = 1135;
                    continue stateLoop;
                }
                case 1135: {
                    fb.field_b = fb.field_b - var2_int;
                    tk.field_b = tk.field_b - var3;
                    sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 0.001 * (double)var3);
                    this.field_H.a(sg.field_a, -125);
                    sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.001 * (double)(-var2_int));
                    this.field_H.a(sg.field_a, -126);
                    var5 = 0;
                    var6 = 0;
                    statePc = 1136;
                    continue stateLoop;
                }
                case 1136: {
                    if (var6 >= 12) {
                        statePc = 1154;
                    } else {
                        statePc = 1137;
                    }
                    continue stateLoop;
                }
                case 1137: {
                    fk.field_k[var5] = fk.field_k[var5] + (-(var2_int << -887623772) + fk.field_k[var5 - -2]);
                    fk.field_k[1 + var5] = fk.field_k[1 + var5] + (fk.field_k[var5 - -3] - (var3 << 1176895620));
                    stackIn_1156_0 = fk.field_k[var5];
                    stackIn_1138_0 = stackIn_1156_0;
                    stackIn_1156_1 = -2048;
                    stackIn_1138_1 = stackIn_1156_1;
                    if (false) {
                        statePc = 1156;
                    } else {
                        statePc = 1138;
                    }
                    continue stateLoop;
                }
                case 1138: {
                    if (stackIn_1138_0 >= stackIn_1138_1) {
                        statePc = 1143;
                    } else {
                        statePc = 1141;
                    }
                    continue stateLoop;
                }
                case 1141: {
                    fk.field_k[var5] = fk.field_k[var5] + 14336;
                    statePc = 1143;
                    continue stateLoop;
                }
                case 1143: {
                    if ((fk.field_k[var5] ^ -1) >= -12289) {
                        statePc = 1146;
                    } else {
                        statePc = 1144;
                    }
                    continue stateLoop;
                }
                case 1144: {
                    fk.field_k[var5] = fk.field_k[var5] - 14336;
                    statePc = 1146;
                    continue stateLoop;
                }
                case 1146: {
                    if ((fk.field_k[1 + var5] ^ -1) > 2047) {
                        statePc = 1149;
                    } else {
                        statePc = 1150;
                    }
                    continue stateLoop;
                }
                case 1149: {
                    fk.field_k[1 + var5] = fk.field_k[1 + var5] + 11776;
                    statePc = 1150;
                    continue stateLoop;
                }
                case 1150: {
                    if ((fk.field_k[1 + var5] ^ -1) >= -9729) {
                        statePc = 1153;
                    } else {
                        statePc = 1151;
                    }
                    continue stateLoop;
                }
                case 1151: {
                    fk.field_k[var5 + 1] = fk.field_k[var5 + 1] - 11776;
                    statePc = 1153;
                    continue stateLoop;
                }
                case 1153: {
                    var5 += 4;
                    var6++;
                    statePc = 1136;
                    continue stateLoop;
                }
                case 1154: {
                    var5 = 0;
                    statePc = 1155;
                    continue stateLoop;
                }
                case 1155: {
                    stackIn_1156_0 = var5;
                    stackIn_1156_1 = 3000;
                    statePc = 1156;
                    continue stateLoop;
                }
                case 1156: {
                    if (stackIn_1156_0 >= stackIn_1156_1) {
                        statePc = 1169;
                    } else {
                        statePc = 1157;
                    }
                    continue stateLoop;
                }
                case 1157: {
                    stackIn_1159_0 = wk.field_b[var5];
                    statePc = 1159;
                    continue stateLoop;
                }
                case 1159: {
                    if (stackIn_1159_0 == null) {
                        statePc = 1168;
                    } else {
                        statePc = 1162;
                    }
                    continue stateLoop;
                }
                case 1162: {
                    if (5 == wk.field_b[var5].field_f) {
                        statePc = 1167;
                    } else {
                        statePc = 1168;
                    }
                    continue stateLoop;
                }
                case 1167: {
                    wk.field_b[var5] = null;
                    statePc = 1168;
                    continue stateLoop;
                }
                case 1168: {
                    var5++;
                    statePc = 1155;
                    continue stateLoop;
                }
                case 1169: {
                    var5 = 0;
                    statePc = 1170;
                    continue stateLoop;
                }
                case 1170: {
                    if (3000 <= var5) {
                        statePc = 1178;
                    } else {
                        statePc = 1171;
                    }
                    continue stateLoop;
                }
                case 1171: {
                    stackIn_1201_0 = null;
                    stackIn_1172_0 = stackIn_1201_0;
                    stackIn_1201_1 = wk.field_b[var5];
                    stackIn_1172_1 = stackIn_1201_1;
                    if (false) {
                        statePc = 1201;
                    } else {
                        statePc = 1172;
                    }
                    continue stateLoop;
                }
                case 1172: {
                    if (stackIn_1172_0 != stackIn_1172_1) {
                        statePc = 1176;
                    } else {
                        statePc = 1177;
                    }
                    continue stateLoop;
                }
                case 1176: {
                    wk.field_b[var5] = wk.field_b[var5].a((byte) -126);
                    statePc = 1177;
                    continue stateLoop;
                }
                case 1177: {
                    var5++;
                    statePc = 1170;
                    continue stateLoop;
                }
                case 1178: {
                    o.field_j = 0;
                    var5 = 0;
                    statePc = 1179;
                    continue stateLoop;
                }
                case 1179: {
                    if (var5 >= 1000) {
                        statePc = 1187;
                    } else {
                        statePc = 1180;
                    }
                    continue stateLoop;
                }
                case 1180: {
                    if (null != hf.field_e[var5]) {
                        statePc = 1185;
                    } else {
                        statePc = 1186;
                    }
                    continue stateLoop;
                }
                case 1185: {
                    hf.field_e[var5] = hf.field_e[var5].a(0);
                    o.field_j = o.field_j + 1;
                    statePc = 1186;
                    continue stateLoop;
                }
                case 1186: {
                    var5++;
                    statePc = 1179;
                    continue stateLoop;
                }
                case 1187: {
                    var5 = 0;
                    statePc = 1188;
                    continue stateLoop;
                }
                case 1188: {
                    if (var5 >= 1000) {
                        statePc = 1195;
                    } else {
                        statePc = 1189;
                    }
                    continue stateLoop;
                }
                case 1189: {
                    if (null == a.field_h[var5]) {
                        statePc = 1194;
                    } else {
                        statePc = 1192;
                    }
                    continue stateLoop;
                }
                case 1192: {
                    a.field_h[var5].a((byte) -110, var2_int, var3);
                    statePc = 1194;
                    continue stateLoop;
                }
                case 1194: {
                    var5++;
                    statePc = 1188;
                    continue stateLoop;
                }
                case 1195: {
                    if (param0) {
                        statePc = 1197;
                    } else {
                        statePc = 1196;
                    }
                    continue stateLoop;
                }
                case 1196: {
                    return;
                }
                case 1197: {
                    var5 = 0;
                    statePc = 1198;
                    continue stateLoop;
                }
                case 1198: {
                    if (-3001 >= (var5 ^ -1)) {
                        statePc = 1205;
                    } else {
                        statePc = 1199;
                    }
                    continue stateLoop;
                }
                case 1199: {
                    stackIn_1201_0 = null;
                    stackIn_1201_1 = wk.field_b[var5];
                    statePc = 1201;
                    continue stateLoop;
                }
                case 1201: {
                    if (stackIn_1201_0 != stackIn_1201_1) {
                        statePc = 1203;
                    } else {
                        statePc = 1204;
                    }
                    continue stateLoop;
                }
                case 1203: {
                    wk.field_b[var5].a(var3, var2_int, param0);
                    statePc = 1204;
                    continue stateLoop;
                }
                case 1204: {
                    var5++;
                    statePc = 1198;
                    continue stateLoop;
                }
                case 1205: {
                    if (qi.field_a < 10) {
                        statePc = 1218;
                    } else {
                        statePc = 1206;
                    }
                    continue stateLoop;
                }
                case 1206: {
                    if (-1 > (mk.field_k ^ -1)) {
                        statePc = 1218;
                    } else {
                        statePc = 1209;
                    }
                    continue stateLoop;
                }
                case 1209: {
                    if (!s.field_i) {
                        statePc = 1218;
                    } else {
                        statePc = 1212;
                    }
                    continue stateLoop;
                }
                case 1212: {
                    nc.field_A = nc.field_A - 1;
                    if ((nc.field_A ^ -1) >= -1) {
                        statePc = 1217;
                    } else {
                        statePc = 1218;
                    }
                    continue stateLoop;
                }
                case 1217: {
                    a.field_h[0] = null;
                    this.k((byte) 97);
                    statePc = 1218;
                    continue stateLoop;
                }
                case 1218: {
                    if (50 != qi.field_a) {
                        statePc = 1227;
                    } else {
                        statePc = 1219;
                    }
                    continue stateLoop;
                }
                case 1219: {
                    if ((nc.field_A ^ -1) < -1) {
                        statePc = 1224;
                    } else {
                        statePc = 1227;
                    }
                    continue stateLoop;
                }
                case 1224: {
                    nc.field_A = nc.field_A - 1;
                    if ((nc.field_A ^ -1) < -1) {
                        statePc = 1227;
                    } else {
                        statePc = 1225;
                    }
                    continue stateLoop;
                }
                case 1225: {
                    a.field_h[0] = null;
                    this.k((byte) 121);
                    statePc = 1227;
                    continue stateLoop;
                }
                case 1227: {
                    if (qi.field_a < var4) {
                        statePc = 1240;
                    } else {
                        statePc = 1228;
                    }
                    continue stateLoop;
                }
                case 1228: {
                    if (-11 < (qi.field_a ^ -1)) {
                        statePc = 1234;
                    } else {
                        statePc = 1231;
                    }
                    continue stateLoop;
                }
                case 1231: {
                    if (mk.field_k <= 0) {
                        statePc = 1240;
                    } else {
                        statePc = 1234;
                    }
                    continue stateLoop;
                }
                case 1234: {
                    if (na.field_j == null) {
                        statePc = 1239;
                    } else {
                        statePc = 1240;
                    }
                    continue stateLoop;
                }
                case 1239: {
                    this.n(3);
                    statePc = 1240;
                    continue stateLoop;
                }
                case 1240: {
                    if (null == na.field_j) {
                        statePc = 1244;
                    } else {
                        statePc = 1241;
                    }
                    continue stateLoop;
                }
                case 1241: {
                    if (!s.field_i) {
                        statePc = 1260;
                    } else {
                        statePc = 1244;
                    }
                    continue stateLoop;
                }
                case 1244: {
                    if (s.field_i) {
                        statePc = 1390;
                    } else {
                        statePc = 1247;
                    }
                    continue stateLoop;
                }
                case 1247: {
                    if ((wh.field_c ^ -1) < -2) {
                        statePc = 1253;
                    } else {
                        statePc = 1250;
                    }
                    continue stateLoop;
                }
                case 1250: {
                    if (ni.field_a) {
                        statePc = 1390;
                    } else {
                        statePc = 1253;
                    }
                    continue stateLoop;
                }
                case 1253: {
                    na.field_j = new ij((stellarshard) (this));
                    if (!ni.field_a) {
                        statePc = 1258;
                    } else {
                        statePc = 1259;
                    }
                    continue stateLoop;
                }
                case 1258: {
                    tl.field_c = 4;
                    na.field_j.field_l = 8;
                    statePc = 1259;
                    continue stateLoop;
                }
                case 1259: {
                    ni.field_a = false;
                    statePc = 1390;
                    continue stateLoop;
                }
                case 1260: {
                    if (!qh.c(79)) {
                        statePc = 1286;
                    } else {
                        statePc = 1263;
                    }
                    continue stateLoop;
                }
                case 1263: {
                    stackIn_1287_0 = null;
                    stackIn_1264_0 = stackIn_1287_0;
                    stackIn_1287_1 = na.field_j;
                    stackIn_1264_1 = stackIn_1287_1;
                    if (false) {
                        statePc = 1287;
                    } else {
                        statePc = 1264;
                    }
                    continue stateLoop;
                }
                case 1264: {
                    if (stackIn_1264_0 == stackIn_1264_1) {
                        statePc = 1282;
                    } else {
                        statePc = 1267;
                    }
                    continue stateLoop;
                }
                case 1267: {
                    if (-14 != (gi.field_f ^ -1)) {
                        statePc = 1282;
                    } else {
                        statePc = 1270;
                    }
                    continue stateLoop;
                }
                case 1270: {
                    if ((tl.field_c ^ -1) == -3) {
                        statePc = 1279;
                    } else {
                        statePc = 1273;
                    }
                    continue stateLoop;
                }
                case 1273: {
                    if ((tl.field_c ^ -1) == -2) {
                        statePc = 1279;
                    } else {
                        statePc = 1276;
                    }
                    continue stateLoop;
                }
                case 1276: {
                    if (-4 != (tl.field_c ^ -1)) {
                        statePc = 1282;
                    } else {
                        statePc = 1279;
                    }
                    continue stateLoop;
                }
                case 1279: {
                    n.field_L = 256;
                    tl.field_c = 0;
                    statePc = 1260;
                    continue stateLoop;
                }
                case 1282: {
                    if (na.field_j != null) {
                        statePc = 1285;
                    } else {
                        statePc = 1260;
                    }
                    continue stateLoop;
                }
                case 1285: {
                    na.field_j.b(8);
                    statePc = 1260;
                    continue stateLoop;
                }
                case 1286: {
                    stackIn_1287_0 = null;
                    stackIn_1287_1 = na.field_j;
                    statePc = 1287;
                    continue stateLoop;
                }
                case 1287: {
                    if (stackIn_1287_0 == stackIn_1287_1) {
                        statePc = 1387;
                    } else {
                        statePc = 1288;
                    }
                    continue stateLoop;
                }
                case 1288: {
                    if (-2 == (tl.field_c ^ -1)) {
                        statePc = 1293;
                    } else {
                        statePc = 1309;
                    }
                    continue stateLoop;
                }
                case 1293: {
                    if (this.field_Q < 612) {
                        statePc = 1309;
                    } else {
                        statePc = 1294;
                    }
                    continue stateLoop;
                }
                case 1294: {
                    if (628 <= this.field_Q) {
                        statePc = 1309;
                    } else {
                        statePc = 1297;
                    }
                    continue stateLoop;
                }
                case 1297: {
                    if (this.field_O < 176) {
                        statePc = 1309;
                    } else {
                        statePc = 1300;
                    }
                    continue stateLoop;
                }
                case 1300: {
                    if (-193 >= (this.field_O ^ -1)) {
                        statePc = 1309;
                    } else {
                        statePc = 1303;
                    }
                    continue stateLoop;
                }
                case 1303: {
                    if (gh.field_c == 1) {
                        statePc = 1308;
                    } else {
                        statePc = 1309;
                    }
                    continue stateLoop;
                }
                case 1308: {
                    n.field_L = 256;
                    tl.field_c = 0;
                    statePc = 1309;
                    continue stateLoop;
                }
                case 1309: {
                    if (tl.field_c != 2) {
                        statePc = 1365;
                    } else {
                        statePc = 1310;
                    }
                    continue stateLoop;
                }
                case 1310: {
                    if ((this.field_Q ^ -1) > -497) {
                        statePc = 1327;
                    } else {
                        statePc = 1313;
                    }
                    continue stateLoop;
                }
                case 1313: {
                    if (512 <= this.field_Q) {
                        statePc = 1327;
                    } else {
                        statePc = 1316;
                    }
                    continue stateLoop;
                }
                case 1316: {
                    if (208 > this.field_O) {
                        statePc = 1327;
                    } else {
                        statePc = 1319;
                    }
                    continue stateLoop;
                }
                case 1319: {
                    if (-225 >= (this.field_O ^ -1)) {
                        statePc = 1327;
                    } else {
                        statePc = 1322;
                    }
                    continue stateLoop;
                }
                case 1322: {
                    if (-2 != (gh.field_c ^ -1)) {
                        statePc = 1327;
                    } else {
                        statePc = 1325;
                    }
                    continue stateLoop;
                }
                case 1325: {
                    tl.field_c = 0;
                    gh.field_d = null;
                    n.field_L = 256;
                    statePc = 1327;
                    continue stateLoop;
                }
                case 1327: {
                    if ((this.field_Q ^ -1) > -249) {
                        statePc = 1346;
                    } else {
                        statePc = 1328;
                    }
                    continue stateLoop;
                }
                case 1328: {
                    if ((this.field_Q ^ -1) < -265) {
                        statePc = 1346;
                    } else {
                        statePc = 1331;
                    }
                    continue stateLoop;
                }
                case 1331: {
                    if (460 > this.field_O) {
                        statePc = 1346;
                    } else {
                        statePc = 1334;
                    }
                    continue stateLoop;
                }
                case 1334: {
                    if (-485 > (this.field_O ^ -1)) {
                        statePc = 1346;
                    } else {
                        statePc = 1337;
                    }
                    continue stateLoop;
                }
                case 1337: {
                    if (1 == gh.field_c) {
                        statePc = 1342;
                    } else {
                        statePc = 1346;
                    }
                    continue stateLoop;
                }
                case 1342: {
                    fieldTemp$38 = si.field_X - 1;
                    si.field_X = si.field_X - 1;
                    if (fieldTemp$38 < 0) {
                        statePc = 1345;
                    } else {
                        statePc = 1346;
                    }
                    continue stateLoop;
                }
                case 1345: {
                    si.field_X = si.field_X + 3;
                    statePc = 1346;
                    continue stateLoop;
                }
                case 1346: {
                    if (this.field_Q < 376) {
                        statePc = 1365;
                    } else {
                        statePc = 1347;
                    }
                    continue stateLoop;
                }
                case 1347: {
                    if ((this.field_Q ^ -1) < -393) {
                        statePc = 1365;
                    } else {
                        statePc = 1350;
                    }
                    continue stateLoop;
                }
                case 1350: {
                    if (460 > this.field_O) {
                        statePc = 1365;
                    } else {
                        statePc = 1353;
                    }
                    continue stateLoop;
                }
                case 1353: {
                    if ((this.field_O ^ -1) < -485) {
                        statePc = 1365;
                    } else {
                        statePc = 1356;
                    }
                    continue stateLoop;
                }
                case 1356: {
                    if (-2 != (gh.field_c ^ -1)) {
                        statePc = 1365;
                    } else {
                        statePc = 1359;
                    }
                    continue stateLoop;
                }
                case 1359: {
                    fieldTemp$39 = si.field_X + 1;
                    si.field_X = si.field_X + 1;
                    if (-4 >= (fieldTemp$39 ^ -1)) {
                        statePc = 1364;
                    } else {
                        statePc = 1365;
                    }
                    continue stateLoop;
                }
                case 1364: {
                    si.field_X = si.field_X - 3;
                    statePc = 1365;
                    continue stateLoop;
                }
                case 1365: {
                    if (3 != tl.field_c) {
                        statePc = 1386;
                    } else {
                        statePc = 1366;
                    }
                    continue stateLoop;
                }
                case 1366: {
                    if ((this.field_Q ^ -1) > -497) {
                        statePc = 1386;
                    } else {
                        statePc = 1369;
                    }
                    continue stateLoop;
                }
                case 1369: {
                    if ((this.field_Q ^ -1) <= -513) {
                        statePc = 1386;
                    } else {
                        statePc = 1372;
                    }
                    continue stateLoop;
                }
                case 1372: {
                    if (208 > this.field_O) {
                        statePc = 1386;
                    } else {
                        statePc = 1375;
                    }
                    continue stateLoop;
                }
                case 1375: {
                    if ((this.field_O ^ -1) <= -225) {
                        statePc = 1386;
                    } else {
                        statePc = 1378;
                    }
                    continue stateLoop;
                }
                case 1378: {
                    if (-2 == (gh.field_c ^ -1)) {
                        statePc = 1383;
                    } else {
                        statePc = 1386;
                    }
                    continue stateLoop;
                }
                case 1383: {
                    tl.field_c = 0;
                    n.field_L = 256;
                    if (!oc.field_d) {
                        statePc = 1386;
                    } else {
                        statePc = 1384;
                    }
                    continue stateLoop;
                }
                case 1384: {
                    tl.field_c = 2;
                    oc.field_d = false;
                    statePc = 1386;
                    continue stateLoop;
                }
                case 1386: {
                    na.field_j.a(true);
                    statePc = 1387;
                    continue stateLoop;
                }
                case 1387: {
                    return;
                }
                case 1390: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_13_0 = mh.field_h[var4_int];
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        int stackIn_175_0 = 0;
        int stackIn_175_1 = 0;
        int stackIn_200_0 = 0;
        int stackIn_224_0 = 0;
        int stackIn_257_0 = 0;
        int stackIn_257_1 = 0;
        int stackIn_260_0 = 0;
        int stackIn_268_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        pb[] var4 = null;
        int var4_int = 0;
        ek[] var4_array = null;
        pb var4_ref = null;
        gk var4_ref2 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6_int = 0;
        Object var6 = null;
        pa var7 = null;
        pb var7_ref = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        bj var10_ref_bj = null;
        int var10 = 0;
        int var11 = 0;
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
                  qd.a(bh.field_a, "space", "", (byte) 42);
                  qd.a(bh.field_a, "nebula", "", (byte) 73);
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
                      L21: {
                        if (-129 >= (var6_int ^ -1)) {
                          pd.field_h.a((byte) -107);
                          stackIn_175_0 = cg.field_c ^ -1;
                          stackIn_175_1 = -16;
                          break L21;
                        } else {
                          var7 = new pa((pa) (var3), false, false, false, false);
                          var8_int = (int)(65536.0 * Math.cos(3.141592653589793 * (double)var6_int / 64.0));
                          var9 = (int)(65536.0 * Math.sin((double)var6_int * 3.141592653589793 / 64.0));
                          stackIn_175_0 = -4;

                          stackIn_175_1 = var4_int ^ -1;

                          L22: {
                            if (stackIn_175_0 < stackIn_175_1) {
                              break L22;
                            } else {
                              var7.a(new int[]{0, 0, 0, -65536, 0, 0, 0, -65536, 0, 0, 0, 65536});
                              var7.a(new int[]{0, 0, 0, 65536, 0, 0, 0, 0, -65536, 0, 65536, 0});
                              break L22;
                            }
                          }
                          L23: {
                            var7.a(new int[]{0, 0, 0, var8_int, -var9, 0, var9, var8_int, 0, 0, 0, 65536});
                            if (-4 >= (var4_int ^ -1)) {
                              break L23;
                            } else {
                              var7.a(new int[]{0, 0, 0, var8_int, 0, -var9, 0, 65536, 0, var9, 0, var8_int});
                              var7.a(new int[]{0, 0, 0, 65536, 0, 0, 0, var8_int, -var9, 0, var9, var8_int});
                              break L23;
                            }
                          }
                          L24: {
                            var10_ref_bj = var7.a(128, 341, 50, 50, -50);
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
                      L29: {
                        if (stackIn_175_0 != stackIn_175_1) {
                          break L29;
                        } else {
                          jf.field_n = ml.a("", (byte) 87, bh.field_a, "bar");
                          jf.field_m = null;
                          break L29;
                        }
                      }
                      cg.field_c = cg.field_c + 1;
                      rg.g(-33);
                      decompiledRegionSelector0 = 10;
                      break L0;
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
                      ml.a("", (byte) -32, bh.field_a, "menu");
                      rh.field_a = new pb[12];
                      var3 = null;
                      var4_int = 0;
                      L30: while (true) {
                        L31: {
                          if (-13 >= (var4_int ^ -1)) {
                            fa.field_k = new pb[15];
                            stackIn_200_0 = 0;
                            break L31;
                          } else {
                            stackIn_200_0 = var4_int;

                            L32: {
                              if (stackIn_200_0 != 0) {
                                break L32;
                              } else {
                                var3 = ml.a("", (byte) 94, bh.field_a, "anim_shatter");
                                break L32;
                              }
                            }
                            L33: {
                              if (3 == var4_int) {
                                var3 = ml.a("", (byte) 103, bh.field_a, "anim_shatter2");
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                            L34: {
                              if ((var4_int ^ -1) != -7) {
                                break L34;
                              } else {
                                var3 = ml.a("", (byte) -72, bh.field_a, "anim_shatter3");
                                break L34;
                              }
                            }
                            L35: {
                              if (-10 != (var4_int ^ -1)) {
                                break L35;
                              } else {
                                var3 = ml.a("", (byte) 119, bh.field_a, "anim_shatter4");
                                break L35;
                              }
                            }
                            rh.field_a[var4_int - 0] = (pb) (((Object[]) (var3))[0]);
                            rh.field_a[var4_int + 1] = (pb) (((Object[]) (var3))[1]);
                            rh.field_a[2 + var4_int] = (pb) (((Object[]) (var3))[2]);
                            rh.field_a[var4_int + 0].d();
                            rh.field_a[1 + var4_int].d();
                            rh.field_a[2 + var4_int].d();
                            var4_int += 3;
                            continue L30;
                          }
                        }
                        var4_int = stackIn_200_0;
                        L36: while (true) {
                          L37: {
                            if (var4_int >= 15) {
                              qd.a(bh.field_a, "title", "", (byte) 119);
                              qj.field_a = ae.a("", "b12", bh.field_a, -115, be.field_d);
                              stackIn_224_0 = 7;
                              break L37;
                            } else {
                              stackIn_224_0 = var4_int;

                              L38: {
                                if (stackIn_224_0 == 0) {
                                  var3 = ml.a("", (byte) 121, bh.field_a, "anim_shine");
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (-4 == (var4_int ^ -1)) {
                                  var3 = ml.a("", (byte) 118, bh.field_a, "anim_shine2");
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                              L40: {
                                if (6 != var4_int) {
                                  break L40;
                                } else {
                                  var3 = ml.a("", (byte) 110, bh.field_a, "anim_shine3");
                                  break L40;
                                }
                              }
                              L41: {
                                if (9 == var4_int) {
                                  var3 = ml.a("", (byte) 83, bh.field_a, "anim_shine4");
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                              L42: {
                                if ((var4_int ^ -1) == -13) {
                                  var3 = ml.a("", (byte) -25, bh.field_a, "anim_shine5");
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                              fa.field_k[var4_int + 0] = (pb) (((Object[]) (var3))[0]);
                              fa.field_k[1 + var4_int] = (pb) (((Object[]) (var3))[1]);
                              fa.field_k[2 + var4_int] = (pb) (((Object[]) (var3))[2]);
                              fa.field_k[0 + var4_int].d();
                              fa.field_k[1 + var4_int].d();
                              fa.field_k[2 + var4_int].d();
                              var4_int += 3;
                              continue L36;
                            }
                          }
                          var4_array = new ek[stackIn_224_0];
                          var5_ref_int__ = new int[7];
                          var6_int = 0;
                          L43: while (true) {
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
                              continue L43;
                            }
                          }
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
                      L44: while (true) {
                        L45: {
                          if ((var5 ^ -1) <= -5) {
                            be.field_d = null;
                            bh.field_a = null;
                            stackIn_268_0 = -33;
                            break L45;
                          } else {
                            var6 = null;
                            stackIn_268_0 = var5;

                            L46: {
                              if (stackIn_268_0 != 0) {
                                break L46;
                              } else {
                                var6 = "stars2";
                                break L46;
                              }
                            }
                            L47: {
                              if (var5 != 1) {
                                break L47;
                              } else {
                                var6 = "stars3";
                                break L47;
                              }
                            }
                            L48: {
                              if ((var5 ^ -1) == -3) {
                                var6 = "stars0";
                                break L48;
                              } else {
                                break L48;
                              }
                            }
                            L49: {
                              if (3 != var5) {
                                break L49;
                              } else {
                                var6 = "stars1";
                                break L49;
                              }
                            }
                            var7_ref = n.a(qd.a(bh.field_a, (String) (var6), "", (byte) 42), (byte) -42, true);
                            var7_ref.e();
                            ti.d(1, 1, 0, 0, 496, 496);
                            var8 = ti.field_a;
                            var9 = 0;
                            L50: while (true) {
                              L51: {
                                if (var8.length <= var9) {
                                  var9 = 0;
                                  stackIn_257_0 = var9 ^ -1;
                                  stackIn_257_1 = -5;
                                  break L51;
                                } else {
                                  stackIn_257_0 = var8[var9] ^ -1;

                                  stackIn_257_1 = -1;

                                  L52: {
                                    if (stackIn_257_0 == stackIn_257_1) {
                                      var8[var9] = 1;
                                      break L52;
                                    } else {
                                      break L52;
                                    }
                                  }
                                  var9++;
                                  continue L50;
                                }
                              }
                              L53: while (true) {
                                if (stackIn_257_0 <= stackIn_257_1) {
                                  pd.field_h.a((byte) -107);
                                  var5++;
                                  continue L44;
                                } else {
                                  stackIn_260_0 = 0;
                                  var10 = stackIn_260_0;
                                  L54: while (true) {
                                    if (var10 >= 4) {
                                      var9++;
                                      stackIn_257_0 = var9 ^ -1;
                                      stackIn_257_1 = -5;
                                      continue L53;
                                    } else {
                                      var4_ref.e();
                                      ti.d(2, 2, 126, 126);
                                      var7_ref.e(2 + -var9 * 124, -var10 * 124 - -2);
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
                                      continue L54;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        rg.g(stackIn_268_0);
                        decompiledRegionSelector0 = 12;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                L55: {
                  rd.a((byte) -60, 100.0f, ve.field_b);
                  this.d(-20880);
                  kl.field_k = 16777215;
                  ul.field_G = 10742263;
                  if (param1 < -60) {
                    break L55;
                  } else {
                    this.a(70, -17);
                    break L55;
                  }
                }
                L56: {
                  vf.field_L = fe.field_c;
                  lg.field_b = 5883647;
                  aj.a(50, 11236);
                  ef.a(50, (byte) 63);
                  fe.field_c = new d(oe.field_a);
                  if (vf.field_L != null) {
                    nj.field_o.b(vf.field_L);
                    vf.field_L.c();
                    nj.field_o.a(vf.field_L);
                    break L56;
                  } else {
                    break L56;
                  }
                }
                L57: {
                  vf.field_L = fe.field_c;
                  nj.field_o.a(vf.field_L);
                  vf.field_L.d(ai.field_c / 2);
                  if (ah.a(-1)) {
                    break L57;
                  } else {
                    be.field_g = ab.a(-5094, 4);
                    wh.a(-124);
                    break L57;
                  }
                }
                hf.field_f = true;
                rg.g(-33);
                decompiledRegionSelector0 = 13;
                break L0;
              }
            } else {
              L58: {
                if (!wk.field_a.a((byte) -36)) {
                  break L58;
                } else {
                  if (!wk.field_a.c((byte) -111)) {
                    break L58;
                  } else {
                    L59: {
                      if (!mf.field_b.a((byte) -36)) {
                        break L59;
                      } else {
                        if (mf.field_b.c((byte) -111)) {
                          L60: {
                            if (!ka.field_n.a((byte) -36)) {
                              break L60;
                            } else {
                              if (ka.field_n.c((byte) -111)) {
                                L61: {
                                  if (!bh.field_a.a((byte) -36)) {
                                    break L61;
                                  } else {
                                    if (!bh.field_a.c((byte) -111)) {
                                      break L61;
                                    } else {
                                      L62: {
                                        if (!fc.field_a.a((byte) -36)) {
                                          break L62;
                                        } else {
                                          if (!fc.field_a.a("basic", (byte) -109)) {
                                            break L62;
                                          } else {
                                            L63: {
                                              if (!be.field_d.a((byte) -36)) {
                                                break L63;
                                              } else {
                                                if (be.field_d.c((byte) -111)) {
                                                  L64: {
                                                    if (!jf.field_m.a((byte) -36)) {
                                                      break L64;
                                                    } else {
                                                      if (jf.field_m.c((byte) -111)) {
                                                        rd.a((byte) -72, 70.0f, ve.field_b);
                                                        if (param0) {
                                                          L65: {
                                                            hi.b((byte) 109);
                                                            this.d(-20880);
                                                            var3 = new qh(22050, ba.field_m);
                                                            if (pk.a(-12663, 0)) {
                                                              sb.field_e = new ud[61];
                                                              break L65;
                                                            } else {
                                                              sb.field_e = new ud[41];
                                                              break L65;
                                                            }
                                                          }
                                                          L66: {
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
                                                              break L66;
                                                            } else {
                                                              break L66;
                                                            }
                                                          }
                                                          L67: {
                                                            var4_ref2 = new gk(wk.field_a, mf.field_b);
                                                            wk.field_a = null;
                                                            mf.field_b = null;
                                                            if (!pk.a(-12663, 0)) {
                                                              oe.field_a = ij.a(576, var4_ref2, "music/Stellar_Shard_ingame", ka.field_n, "");
                                                              break L67;
                                                            } else {
                                                              oe.field_a = ij.a(576, var4_ref2, "music/Stellar_Shard_Halloween", ka.field_n, "");
                                                              break L67;
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
                                                        break L64;
                                                      }
                                                    }
                                                  }
                                                  rd.a((byte) -115, 60.0f, ak.a("", he.field_o, jf.field_m, (byte) 51, lj.field_B));
                                                  decompiledRegionSelector0 = 6;
                                                  break L0;
                                                } else {
                                                  break L63;
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
                                break L60;
                              }
                            }
                          }
                          rd.a((byte) -63, 20.0f, ak.a("", qh.field_f, ka.field_n, (byte) 51, qd.field_e));
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L59;
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
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        fk var3_ref_fk = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
                fieldTemp$0 = vh.field_e;
                vh.field_e = vh.field_e + 1;
                if (fieldTemp$0 != 5) {
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
                fieldTemp$1 = sf.field_b;
                sf.field_b = sf.field_b + 1;
                if ((fieldTemp$1 ^ -1) != -6) {
                  break L3;
                } else {
                  hj.a(253, 2, 1);
                  break L3;
                }
              }
            }
            L4: {
              if ((e.field_e ^ -1) == -10) {
                fieldTemp$2 = sj.field_K;
                sj.field_K = sj.field_K + 1;
                if (fieldTemp$2 == 5) {
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
                fieldTemp$3 = ua.field_d;
                ua.field_d = ua.field_d + 1;
                if ((fieldTemp$3 ^ -1) == -6) {
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
              var2 = new int[16];
              if (-2 != (qi.field_a ^ -1)) {
                break L18;
              } else {
                var2[1] = 4;
                break L18;
              }
            }
            L19: {
              if (2 != qi.field_a) {
                break L19;
              } else {
                var2[1] = 6;
                break L19;
              }
            }
            L20: {
              if (qi.field_a != param0) {
                break L20;
              } else {
                var2[1] = 4;
                var2[3] = 4;
                break L20;
              }
            }
            L21: {
              if (qi.field_a == 6) {
                var2[5] = 6;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (qi.field_a != 4) {
                break L22;
              } else {
                var2[13] = 2;
                var2[1] = 8;
                break L22;
              }
            }
            L23: {
              if (-6 == (qi.field_a ^ -1)) {
                var2[12] = 2;
                var2[3] = 8;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if ((qi.field_a ^ -1) == -9) {
                var2[5] = 8;
                var2[7] = 1;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if ((qi.field_a ^ -1) != -8) {
                break L25;
              } else {
                var2[15] = 2;
                var2[1] = 10;
                break L25;
              }
            }
            L26: {
              if ((qi.field_a ^ -1) != -10) {
                break L26;
              } else {
                var2[6] = 1;
                var2[3] = 8;
                break L26;
              }
            }
            L27: {
              if (qi.field_a != 10) {
                break L27;
              } else {
                var2[14] = 1;
                var2[1] = 5;
                break L27;
              }
            }
            L28: {
              if (10 < qi.field_a) {
                L29: {
                  if (qi.field_a % 10 == 1) {
                    var2[1] = qi.field_a / 2 - -5;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (4 == qi.field_a % 10) {
                    var2[15] = qi.field_a / 10 - -1;
                    var2[5] = qi.field_a / 3 - -5;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (3 == qi.field_a % 10) {
                    var2[12] = qi.field_a / 5;
                    var2[3] = 5 + qi.field_a / 3;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if ((qi.field_a % 10 ^ -1) == -3) {
                    var2[1] = 5 + qi.field_a / 3;
                    var2[13] = qi.field_a / 5;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (qi.field_a % 10 == 5) {
                    var2[1] = qi.field_a / 4 + 3;
                    var2[14] = 1;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if ((qi.field_a % 10 ^ -1) == -8) {
                    var2[6] = qi.field_a / 10;
                    var2[5] = qi.field_a / 3 - -5;
                    var2[12] = qi.field_a / 5;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (6 == qi.field_a % 10) {
                    var2[7] = qi.field_a / 10;
                    var2[13] = qi.field_a / 5;
                    var2[3] = qi.field_a / 3 - -5;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (8 != qi.field_a % 10) {
                    break L36;
                  } else {
                    var2[15] = qi.field_a / 6;
                    var2[1] = qi.field_a / 4 + 3;
                    break L36;
                  }
                }
                L37: {
                  if (qi.field_a % 10 != 9) {
                    break L37;
                  } else {
                    var2[3] = qi.field_a / 6;
                    var2[1] = qi.field_a / 6;
                    var2[5] = qi.field_a / 6;
                    break L37;
                  }
                }
                L38: {
                  if (-21 == (qi.field_a ^ -1)) {
                    var2[14] = 1;
                    var2[7] = 10;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if (-31 != (qi.field_a ^ -1)) {
                    break L39;
                  } else {
                    var2[14] = 2;
                    var2[6] = 10;
                    break L39;
                  }
                }
                L40: {
                  if (qi.field_a != 40) {
                    break L40;
                  } else {
                    var2[14] = 4;
                    var2[6] = 5;
                    var2[7] = 5;
                    var2[15] = 5;
                    break L40;
                  }
                }
                L41: {
                  if (qi.field_a != 50) {
                    break L41;
                  } else {
                    var2[14] = qi.field_a / 5;
                    break L41;
                  }
                }
                if (-1 != (qi.field_a % 10 ^ -1)) {
                  break L28;
                } else {
                  if ((qi.field_a ^ -1) >= -51) {
                    break L28;
                  } else {
                    var2[14] = qi.field_a / 5;
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
                  if ((var4 ^ -1) <= (var2[var3] ^ -1)) {
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
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "stellarshard.FB(" + param0 + ')');
        }
    }

    final void l(byte param0) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_25_0;
        int stackIn_25_1;
        int stackIn_25_2;
        int stackIn_25_3;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
              stackIn_24_0 = qj.field_a.field_N;

              stackIn_24_1 = 0;

              stackIn_24_2 = l.field_f.field_N;

              if (ah.a(-1)) {
                stackIn_25_0 = stackIn_24_0;
                stackIn_25_1 = stackIn_24_1;
                stackIn_25_2 = stackIn_24_2;
                stackIn_25_3 = 0;
                break L3;
              } else {






                if (mk.field_k <= 0) {
                  stackIn_25_0 = stackIn_24_0;
                  stackIn_25_1 = stackIn_24_1;
                  stackIn_25_2 = stackIn_24_2;
                  stackIn_25_3 = 1;
                  break L3;
                } else {









                  if (null == s.field_e) {
                    stackIn_25_0 = stackIn_24_0;
                    stackIn_25_1 = stackIn_24_1;
                    stackIn_25_2 = stackIn_24_2;
                    stackIn_25_3 = 3;
                    break L3;
                  } else {



                    stackIn_25_0 = stackIn_24_0;
                    stackIn_25_1 = stackIn_24_1;
                    stackIn_25_2 = stackIn_24_2;
                    stackIn_25_3 = 2;
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
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            stackIn_1_0 = param0 & param1;
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
        int incrementValue$0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_87_0 = null;
        Object stackIn_121_0 = null;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_142_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        int stackIn_240_0 = 0;
        int stackIn_240_1 = 0;
        int stackIn_247_0 = 0;
        int stackIn_247_1 = 0;
        int stackIn_413_0 = 0;
        int stackIn_413_1 = 0;
        int stackIn_427_0 = 0;
        int stackIn_427_1 = 0;
        int stackIn_429_0 = 0;
        int stackIn_429_1 = 0;
        int stackIn_436_0 = 0;
        int stackIn_436_1 = 0;
        int stackIn_500_0 = 0;
        Object stackIn_505_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        Object var2 = null;
        RuntimeException var2_ref = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (s.field_e != null) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_5_0 = qd.field_j;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_5_0 = s.field_e;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var2 = stackIn_5_0;
                    if (ee.b(93)) {
                        statePc = 8;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_11_0 = var2;
                    stackIn_9_0 = stackIn_11_0;
                    stackIn_11_1 = -11;
                    stackIn_9_1 = stackIn_11_1;
                    if (s.field_e != null) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_12_0 = stackIn_9_0;
                    stackIn_12_1 = stackIn_9_1;
                    stackIn_12_2 = ua.field_b ? 1 : 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = stackIn_11_0;
                    stackIn_12_1 = stackIn_11_1;
                    stackIn_12_2 = 1;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    rl.a((java.awt.Canvas) ((Object) stackIn_12_0), stackIn_12_1, stackIn_12_2 != 0);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    if (hf.field_f) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    i.a((java.awt.Canvas) (var2), -113);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                case 17: {
                    if (null == be.field_g) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    i.a((java.awt.Canvas) (var2), -101);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                case 20: {
                    if (null == gg.field_f) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    i.a((java.awt.Canvas) (var2), -99);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    return;
                }
                case 23: {
                    if (null != this.field_F) {
                        statePc = 26;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var3 = 0;
                    var4 = -this.field_F.field_z.length;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (-1 >= (var4 ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    incrementValue$0 = var3;
                    var3++;
                    this.field_F.field_z[incrementValue$0] = pd.field_h.field_e[incrementValue$0];
                    var4++;
                    statePc = 27;
                    continue stateLoop;
                }
                case 31: {
                    if (null != na.field_j) {
                        statePc = 48;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (s.field_i) {
                        statePc = 48;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if ((wh.field_c ^ -1) < -2) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (ni.field_a) {
                        statePc = 48;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    na.field_j = new ij((stellarshard) (this));
                    if (!ni.field_a) {
                        statePc = 46;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 46: {
                    tl.field_c = 4;
                    na.field_j.field_l = 8;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    ni.field_a = false;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (0 > fb.field_b) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    fb.field_b = fb.field_b + 640;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (0 > tk.field_b) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    tk.field_b = tk.field_b + 480;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (fb.field_b >= 640) {
                        statePc = 59;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 59: {
                    fb.field_b = fb.field_b - 640;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (tk.field_b < 480) {
                        statePc = 63;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    tk.field_b = tk.field_b - 480;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    this.p(param0 ^ -20914);
                    if (null == this.field_F) {
                        statePc = 75;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if ((el.field_I ^ -1) >= -1) {
                        statePc = 75;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (na.field_j == null) {
                        statePc = 72;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 72: {
                    this.field_F.e(0, 0, 5 * el.field_I);
                    if (s.field_i) {
                        statePc = 75;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    el.field_I = el.field_I - 1;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    var3 = 0;
                    if (param0 == -20880) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stellarshard.a(true, false, -57, true);
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var4 = 0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (var4 >= 12) {
                        statePc = 83;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    ei.field_D[var4].d((fk.field_k[var3] >> -573905436) - 128, (fk.field_k[var3 - -1] >> -1973196764) + -128, 128 - el.field_I * 2);
                    var3 += 8;
                    var4 += 2;
                    statePc = 79;
                    continue stateLoop;
                }
                case 83: {
                    var3 = 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if ((var3 ^ -1) <= -1001) {
                        statePc = 100;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    stackIn_87_0 = null;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (stackIn_87_0 == a.field_h[var3]) {
                        statePc = 99;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (-15 == (a.field_h[var3].field_m ^ -1)) {
                        statePc = 99;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (!a.field_h[var3].a((byte) -96)) {
                        statePc = 98;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 98: {
                    a.field_h[var3].e(106);
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    var3++;
                    statePc = 84;
                    continue stateLoop;
                }
                case 100: {
                    if (this.field_G == null) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    this.field_G.e();
                    ti.f(0, 0, 640, 480, 0);
                    pd.field_h.a((byte) -107);
                    statePc = 106;
                    continue stateLoop;
                }
                case 104: {
                    this.field_G = new pb(640, 480);
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    var3 = 0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (var3 >= 3000) {
                        statePc = 115;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (wk.field_b[var3] != null) {
                        statePc = 113;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 113: {
                    wk.field_b[var3].a(-57, this.field_G);
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    var3++;
                    statePc = 107;
                    continue stateLoop;
                }
                case 115: {
                    var3 = 0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (1000 <= var3) {
                        statePc = 125;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackIn_121_0 = null;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    if (stackIn_121_0 == hf.field_e[var3]) {
                        statePc = 124;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    hf.field_e[var3].a(true);
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    var3++;
                    statePc = 116;
                    continue stateLoop;
                }
                case 125: {
                    var3 = 0;
                    var3 = var3 + this.field_G.field_t;
                    var5_int = 0;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    stackIn_127_0 = this.field_G.field_y;
                    stackIn_127_1 = var5_int;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (stackIn_127_0 <= stackIn_127_1) {
                        statePc = 166;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var6_int = var3;
                    var7 = var5_int * this.field_G.field_v;
                    stackIn_168_0 = var6_int ^ -1;
                    stackIn_129_0 = stackIn_168_0;
                    stackIn_168_1 = -1;
                    stackIn_129_1 = stackIn_168_1;
                    if (false) {
                        statePc = 168;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (stackIn_129_0 > stackIn_129_1) {
                        statePc = 134;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    stackIn_135_0 = 0;
                    statePc = 135;
                    continue stateLoop;
                }
                case 134: {
                    stackIn_135_0 = -var6_int;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    var8 = stackIn_135_0;
                    if (-641 <= (this.field_G.field_v + var6_int ^ -1)) {
                        statePc = 138;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    stackIn_139_0 = 640 + -var6_int;
                    statePc = 139;
                    continue stateLoop;
                }
                case 138: {
                    stackIn_139_0 = this.field_G.field_v;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    var9 = stackIn_139_0;
                    var10_int = var8;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if ((var10_int ^ -1) <= (var9 ^ -1)) {
                        statePc = 165;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var4 = this.field_G.field_z[var7 + var10_int];
                    stackIn_127_0 = -1;
                    stackIn_142_0 = stackIn_127_0;
                    stackIn_127_1 = var4 ^ -1;
                    stackIn_142_1 = stackIn_127_1;
                    if (false) {
                        statePc = 127;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (stackIn_142_0 > stackIn_142_1) {
                        statePc = 144;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if ((var4 ^ -1) >= -1) {
                        statePc = 151;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (-97 <= (var4 ^ -1)) {
                        statePc = 150;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 150: {
                    this.field_G.field_z[var7 + var10_int] = var4 * 255 / 96 << 1305875024;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if ((var4 ^ -1) >= -97) {
                        statePc = 158;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (var4 < 160) {
                        statePc = 157;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 157: {
                    this.field_G.field_z[var7 + var10_int] = 16711680 - -((-24480 + 255 * var4) / 64 << 1954957448);
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (160 > var4) {
                        statePc = 164;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if ((var4 ^ -1) <= -256) {
                        statePc = 164;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    this.field_G.field_z[var10_int + var7] = 255 * (-160 + var4) / 95 + 16776960;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    var10_int++;
                    statePc = 140;
                    continue stateLoop;
                }
                case 165: {
                    var5_int++;
                    statePc = 126;
                    continue stateLoop;
                }
                case 166: {
                    this.field_G.d(0, 0, 255);
                    var5_int = 0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    stackIn_168_0 = 1000;
                    stackIn_168_1 = var5_int;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    if (stackIn_168_0 <= stackIn_168_1) {
                        statePc = 183;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (a.field_h[var5_int] == null) {
                        statePc = 182;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (14 == a.field_h[var5_int].field_m) {
                        statePc = 180;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (!a.field_h[var5_int].a((byte) -83)) {
                        statePc = 182;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    a.field_h[var5_int].e(122);
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    var5_int++;
                    statePc = 167;
                    continue stateLoop;
                }
                case 183: {
                    var5_int = 4;
                    var6_int = 1;
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    if (var6_int >= 12) {
                        statePc = 188;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    ei.field_D[var6_int].d(-128 + (fk.field_k[var5_int] >> 346012836), -128 + (fk.field_k[1 + var5_int] >> -2060443996), -(el.field_I * 2) + 128);
                    var5_int += 8;
                    var6_int += 2;
                    statePc = 184;
                    continue stateLoop;
                }
                case 188: {
                    if (!pk.a(param0 ^ 24825, 0)) {
                        statePc = 222;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (s.field_i) {
                        statePc = 194;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if ((ag.field_a ^ -1) >= -1) {
                        statePc = 200;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (128 <= ag.field_a) {
                        statePc = 200;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    ti.e(10, 330, 4, 16711680);
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if ((ag.field_a ^ -1) >= -1) {
                        statePc = 207;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (-129 < (ag.field_a ^ -1)) {
                        statePc = 206;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 206: {
                    qj.field_a.a(nd.field_F, 20, 335, 16711680, -1);
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    var5_int = gf.field_c;
                    var6_int = 100;
                    if (-1 <= (ml.field_h ^ -1)) {
                        statePc = 222;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if ((var6_int ^ -1) <= (var5_int ^ -1)) {
                        statePc = 213;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var7 = 32;
                    var8 = var7 >> 1675413121;
                    if (16 > var5_int) {
                        statePc = 220;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    if ((-64 + var6_int ^ -1) > (var5_int ^ -1)) {
                        statePc = 219;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 219: {
                    var7 = -var5_int + var6_int;
                    statePc = 221;
                    continue stateLoop;
                }
                case 220: {
                    var7 = var5_int * 4;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    var9 = (int)((Math.exp((double)((float)(-var5_int) / 20.0f)) - Math.exp((double)((float)(-var6_int) / 20.0f))) * 200.0);
                    ja.a(320, 2 * var5_int, var8, 240, false, var9, 256, 1);
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    if (s.field_i) {
                        statePc = 225;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 225: {
                    var5_int = 148;
                    ti.b(1, 351, var5_int, 128, 65280, 64);
                    ti.d(2, 352, var5_int + -1, 478);
                    var6_int = 0;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    if (1000 <= var6_int) {
                        statePc = 234;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if (a.field_h[var6_int] != null) {
                        statePc = 232;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 232: {
                    a.field_h[var6_int].a(false);
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    var6_int++;
                    statePc = 226;
                    continue stateLoop;
                }
                case 234: {
                    ti.b();
                    var6 = wb.field_i;
                    if (hf.field_i.a(0)) {
                        statePc = 236;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    var6 = te.field_a;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
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
                        statePc = 246;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    var8 = 0;
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    if (var8 >= 15) {
                        statePc = 246;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var9 = (int)(5.0 + Math.cos(3.14 * (double)var8 / 20.0) * 5.0);
                    stackIn_247_0 = var9 ^ -1;
                    stackIn_240_0 = stackIn_247_0;
                    stackIn_247_1 = -10;
                    stackIn_240_1 = stackIn_247_1;
                    if (false) {
                        statePc = 247;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    if (stackIn_240_0 < stackIn_240_1) {
                        statePc = 244;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var9 = 9;
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
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
                    statePc = 238;
                    continue stateLoop;
                }
                case 246: {
                    stackIn_247_0 = var5_int / 2 - var7 / 2;
                    stackIn_247_1 = 344;
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    ti.f(stackIn_247_0, stackIn_247_1, var7, 15, 7, 0);
                    qj.field_a.c(var6, 1 + (var5_int / 2 - 1), 355, 0, -1);
                    qj.field_a.c(var6, -1 + (1 + var5_int / 2), 357, 0, -1);
                    qj.field_a.c(var6, -1 + var5_int / 2, 356, 0, -1);
                    qj.field_a.c(var6, -1 + (var5_int / 2 + 2), 356, 0, -1);
                    qj.field_a.c(var6, 1 + (var5_int / 2 + -1), 356, 16777215, -1);
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    if (s.field_i) {
                        statePc = 287;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (na.field_j == null) {
                        statePc = 266;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    if (-9 == (tl.field_c ^ -1)) {
                        statePc = 287;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    if (tl.field_c == 1) {
                        statePc = 287;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if (tl.field_c == 3) {
                        statePc = 287;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    if (-3 != (tl.field_c ^ -1)) {
                        statePc = 266;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 266: {
                    if (wh.field_c != 0) {
                        statePc = 272;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if (rh.field_a != null) {
                        statePc = 272;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    pl.field_R = null;
                    wh.field_c = 2;
                    jg.field_pb = 0;
                    aa.field_b = null;
                    wc.field_s = null;
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    if (0 == wh.field_c) {
                        statePc = 275;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 275: {
                    aa.field_b.a(0, 128, 310, (byte) -120, 90);
                    wc.field_s.a(0, 128, -jg.field_pb + 320 + -10, (byte) -124, 90);
                    pl.field_R.a(0, 128, 310 + jg.field_pb, (byte) -119, 90);
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    if (wh.field_c != 1) {
                        statePc = 279;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    rh.field_a[jg.field_pb / 3].a(0, 128, 310, (byte) 82, 90);
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    if (wh.field_c == 2) {
                        statePc = 282;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 282: {
                    rh.field_a = null;
                    fa.field_k[0].a(0, 128, 310, (byte) -120, 90);
                    fa.field_k[jg.field_pb / 2].a(0, 128, 310, (byte) 37, 90);
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    if (-4 == (wh.field_c ^ -1)) {
                        statePc = 286;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 286: {
                    fa.field_k[0].a(0, 128, 310, (byte) 54, 90);
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    if (s.field_i) {
                        statePc = 290;
                    } else {
                        statePc = 441;
                    }
                    continue stateLoop;
                }
                case 290: {
                    var5 = h.a(hh.field_d, 0, new String[]{"" + qi.field_a});
                    var6_int = nj.field_f[0];
                    nj.field_f[0] = qi.field_a * 64 / 50;
                    if (-64 > (nj.field_f[0] ^ -1)) {
                        statePc = 293;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 293: {
                    nj.field_f[0] = 63;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    ic.a(var5, 0, -1, false, 480, 16777215, 0);
                    nj.field_f[0] = 64 * te.field_c / 250000;
                    var5 = ce.field_f + te.field_c;
                    if (-64 > (nj.field_f[0] ^ -1)) {
                        statePc = 297;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 297: {
                    nj.field_f[0] = 63;
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    ic.a(var5, 0, -1, false, 160, 16777215, 0);
                    var5 = bb.field_f;
                    var7_ref = null;
                    var8 = e.field_e;
                    if (0 != e.field_e) {
                        statePc = 300;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    var7_ref = ei.field_A;
                    statePc = 300;
                    continue stateLoop;
                }
                case 300: {
                    if ((e.field_e ^ -1) == -2) {
                        statePc = 303;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 303: {
                    var7_ref = gf.field_a;
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    if (-3 == (e.field_e ^ -1)) {
                        statePc = 307;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var7_ref = ka.field_l;
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    if (3 != e.field_e) {
                        statePc = 310;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    var7_ref = he.field_l;
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    if (4 == e.field_e) {
                        statePc = 313;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 313: {
                    var7_ref = td.field_e;
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    if (e.field_e != 5) {
                        statePc = 316;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    var7_ref = nl.field_f;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    if (e.field_e != 6) {
                        statePc = 318;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    var7_ref = qh.field_h;
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    if (-8 != (e.field_e ^ -1)) {
                        statePc = 320;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    var7_ref = we.field_e;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    if (e.field_e != 8) {
                        statePc = 322;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    var7_ref = nb.field_O;
                    var8 += 5;
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    if ((e.field_e ^ -1) == -10) {
                        statePc = 325;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 325: {
                    var7_ref = ja.field_k;
                    var8 += 5;
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    if (10 == e.field_e) {
                        statePc = 329;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 329: {
                    var8 += 5;
                    var7_ref = rd.field_b;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    if (var7_ref == null) {
                        statePc = 332;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
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
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    var9 = 250;
                    var10 = null;
                    var11 = -1;
                    if (-2 == (nc.field_H ^ -1)) {
                        statePc = 335;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 335: {
                    var10 = pe.field_a;
                    var11 = 8;
                    statePc = 336;
                    continue stateLoop;
                }
                case 336: {
                    if (2 == nc.field_H) {
                        statePc = 339;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 339: {
                    var10 = ha.field_x;
                    var11 = 10;
                    statePc = 340;
                    continue stateLoop;
                }
                case 340: {
                    if (3 != nc.field_H) {
                        statePc = 342;
                    } else {
                        statePc = 341;
                    }
                    continue stateLoop;
                }
                case 341: {
                    var11 = 11;
                    var10 = fc.field_c;
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    if (4 != nc.field_H) {
                        statePc = 344;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    var11 = 12;
                    var10 = wg.field_e;
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    if (null != var10) {
                        statePc = 347;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 347: {
                    var10 = ((String) (var10)).toUpperCase();
                    var12 = 40 + qj.field_a.b((String) (var10));
                    var13 = 100;
                    var9 += 250;
                    ti.f(var9 + -20 - 1, 427, 42, 42, 20, 0);
                    ti.f(-2 - var12 + var9, 435, 21 - (-4 + -var12), 26, 12, 0);
                    if (0 >= var13) {
                        statePc = 350;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    ti.f(var9 + -2, 435, 4 + var13 + 21, 26, 12, 0);
                    statePc = 350;
                    continue stateLoop;
                }
                case 350: {
                    ti.f(var9 - var12, 437, 21 + var12, 22, 10, 11186350);
                    if (-1 > (var13 ^ -1)) {
                        statePc = 353;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 353: {
                    ti.f(var9, 437, var13 + 21, 22, 10, 11186350);
                    statePc = 354;
                    continue stateLoop;
                }
                case 354: {
                    ti.f(-1 + (-18 + var9), 429, 38, 38, 18, 11186350);
                    ti.a(-20 + var9 << 1872140068, 7152, 200, 100, eh.field_e);
                    ti.a(var9 - -10 << 1537771172, 7152, 200, 150, eh.field_e);
                    ti.a(40 + (-var12 + var9) << -1493931836, 7152, 200, 150, eh.field_e);
                    ti.a(-var12 - (-20 - var9) << 481878244, 7152, 200, 200, eh.field_e);
                    if (0 < var13) {
                        statePc = 357;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 357: {
                    ti.a(var13 + var9 << -1161243260, 7152, 200, 200, eh.field_e);
                    statePc = 358;
                    continue stateLoop;
                }
                case 358: {
                    ti.f(var9 - -2 - var12, 439, -119 - -var12 - -96, 18, 8, 0);
                    if ((var13 ^ -1) >= -1) {
                        statePc = 435;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    var14 = 0;
                    var15 = 0;
                    if (2 != nc.field_H) {
                        statePc = 369;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    if (gh.field_b <= 500) {
                        statePc = 365;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    gh.field_b = 500;
                    statePc = 365;
                    continue stateLoop;
                }
                case 365: {
                    var14 = 8421504;
                    var15 = gh.field_b * 20 / 500;
                    if ((gh.field_b ^ -1) > -251) {
                        statePc = 368;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 368: {
                    var14 = 327680 * (gh.field_b % 50);
                    statePc = 369;
                    continue stateLoop;
                }
                case 369: {
                    if ((nc.field_H ^ -1) == -4) {
                        statePc = 372;
                    } else {
                        statePc = 377;
                    }
                    continue stateLoop;
                }
                case 372: {
                    if (-1501 <= (gh.field_b ^ -1)) {
                        statePc = 375;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    gh.field_b = 1500;
                    statePc = 375;
                    continue stateLoop;
                }
                case 375: {
                    var15 = 20 * gh.field_b / 1500;
                    var14 = 16777215;
                    if ((gh.field_b ^ -1) <= -251) {
                        statePc = 377;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    var14 = gh.field_b % 50 * 327680;
                    statePc = 377;
                    continue stateLoop;
                }
                case 377: {
                    if (nc.field_H == 4) {
                        statePc = 380;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 380: {
                    if (500 >= gh.field_b) {
                        statePc = 383;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    gh.field_b = 500;
                    statePc = 383;
                    continue stateLoop;
                }
                case 383: {
                    var14 = 16776960;
                    var15 = gh.field_b * 20 / 500;
                    if (-251 >= (gh.field_b ^ -1)) {
                        statePc = 385;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    var14 = gh.field_b % 50 * 327680;
                    statePc = 385;
                    continue stateLoop;
                }
                case 385: {
                    if ((nc.field_H ^ -1) != -2) {
                        statePc = 404;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 386: {
                    if (-6 == (gh.field_b ^ -1)) {
                        statePc = 391;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 391: {
                    var14 = 16777215;
                    statePc = 392;
                    continue stateLoop;
                }
                case 392: {
                    var15 = gh.field_b * 4;
                    if (-5 != (gh.field_b ^ -1)) {
                        statePc = 394;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 393: {
                    var14 = 8454143;
                    statePc = 394;
                    continue stateLoop;
                }
                case 394: {
                    if ((gh.field_b ^ -1) != -4) {
                        statePc = 396;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 395: {
                    var14 = 8421631;
                    statePc = 396;
                    continue stateLoop;
                }
                case 396: {
                    if (-3 == (gh.field_b ^ -1)) {
                        statePc = 399;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 399: {
                    var14 = 16744703;
                    statePc = 400;
                    continue stateLoop;
                }
                case 400: {
                    if (gh.field_b == 1) {
                        statePc = 403;
                    } else {
                        statePc = 404;
                    }
                    continue stateLoop;
                }
                case 403: {
                    var14 = 16744576;
                    statePc = 404;
                    continue stateLoop;
                }
                case 404: {
                    var16 = 20 + (2 + var9);
                    var17 = 439;
                    ti.f(var16, var17, -3 + var13, 18, 8, (var14 & 16711422) >> 523782209);
                    if (3 != nc.field_H) {
                        statePc = 408;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    ti.e(var16, var17, -3 + var13, 18, 8, var14);
                    statePc = 410;
                    continue stateLoop;
                }
                case 408: {
                    ti.e(var16, var17, var13 + -3, 18, 8, 4144959 & var14 >> 838676258);
                    statePc = 410;
                    continue stateLoop;
                }
                case 410: {
                    var16 = var16 << 4;
                    var17 = var17 << 4;
                    var19 = 0;
                    statePc = 411;
                    continue stateLoop;
                }
                case 411: {
                    if (var19 >= var15) {
                        statePc = 425;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 412: {
                    var18 = (ki.field_s + var19) % 10;
                    stackIn_427_0 = var18 ^ -1;
                    stackIn_413_0 = stackIn_427_0;
                    stackIn_427_1 = -6;
                    stackIn_413_1 = stackIn_427_1;
                    if (false) {
                        statePc = 427;
                    } else {
                        statePc = 413;
                    }
                    continue stateLoop;
                }
                case 413: {
                    if (stackIn_413_0 < stackIn_413_1) {
                        statePc = 417;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 417: {
                    var18 = 10 + -var18;
                    statePc = 418;
                    continue stateLoop;
                }
                case 418: {
                    if ((nc.field_H ^ -1) != -3) {
                        statePc = 422;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 419: {
                    ti.a((var13 - 35) * (10 * var19) / 10 + (136 + var16), (var18 << 2097387618) + (136 + var17), -var18 + 9 << -933891388, 50, eh.field_e);
                    statePc = 424;
                    continue stateLoop;
                }
                case 422: {
                    ti.a((var13 - 35) * (var18 + var19 * 10) / 10 + var16 + 136, 136 + var17, 144, 50, eh.field_e);
                    statePc = 424;
                    continue stateLoop;
                }
                case 424: {
                    var19++;
                    statePc = 411;
                    continue stateLoop;
                }
                case 425: {
                    var19 += 2;
                    statePc = 426;
                    continue stateLoop;
                }
                case 426: {
                    stackIn_427_0 = var19 ^ -1;
                    stackIn_427_1 = -21;
                    statePc = 427;
                    continue stateLoop;
                }
                case 427: {
                    if (stackIn_427_0 <= stackIn_427_1) {
                        statePc = 435;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 428: {
                    var18 = (var19 + ki.field_s) % 10;
                    stackIn_436_0 = var18 ^ -1;
                    stackIn_429_0 = stackIn_436_0;
                    stackIn_436_1 = -6;
                    stackIn_429_1 = stackIn_436_1;
                    if (false) {
                        statePc = 436;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    if (stackIn_429_0 >= stackIn_429_1) {
                        statePc = 433;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 433: {
                    var18 = 10 - var18;
                    statePc = 434;
                    continue stateLoop;
                }
                case 434: {
                    ti.c((var18 + var19 * 10) * (var13 + -35) / 10 + var16 - -136 >> -2047132252, 136 + var17 >> -527722428, 9, 0, 32);
                    ti.c((var13 + -35) * (var18 + var19 * 10) / 10 + (var16 + 136) >> 1627503108, var17 + 136 >> 2061627876, 7, 0, 32);
                    ti.c(136 + var16 - -((var13 + -35) * (var18 + var19 * 10) / 10) >> -742821596, var17 - -136 >> 419818596, 5, 0, 32);
                    var19++;
                    statePc = 426;
                    continue stateLoop;
                }
                case 435: {
                    var9 -= 48;
                    stackIn_436_0 = var9 + 32;
                    stackIn_436_1 = 432;
                    statePc = 436;
                    continue stateLoop;
                }
                case 436: {
                    ti.a(stackIn_436_0, stackIn_436_1, 32, 32, 14, 0, 192);
                    e.field_g[var11].e(var9, 400);
                    qj.field_a.b((String) (var10), 18 + var9, 453, 16777215, -1);
                    statePc = 437;
                    continue stateLoop;
                }
                case 437: {
                    nj.field_f[0] = var6_int;
                    if ((this.field_J ^ -1) < -1) {
                        statePc = 440;
                    } else {
                        statePc = 441;
                    }
                    continue stateLoop;
                }
                case 440: {
                    var5 = ah.field_k;
                    statePc = 441;
                    continue stateLoop;
                }
                case 441: {
                    if ((ig.field_D ^ -1) >= -1) {
                        statePc = 444;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 442: {
                    ti.b(0, 0, 640, 480, 16777215, ig.field_D);
                    statePc = 444;
                    continue stateLoop;
                }
                case 444: {
                    ti.a(0, 0, 640, 480, 0, 192);
                    ti.a(1, 1, 638, 478, 0, 128);
                    ti.a(2, 2, 636, 476, 0, 64);
                    if (na.field_j != null) {
                        statePc = 447;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 447: {
                    na.field_j.a((byte) 85);
                    statePc = 448;
                    continue stateLoop;
                }
                case 448: {
                    if (this.field_R <= 0) {
                        statePc = 451;
                    } else {
                        statePc = 449;
                    }
                    continue stateLoop;
                }
                case 449: {
                    ti.b(0, 0, 640, 480, 16777215, this.field_R);
                    statePc = 451;
                    continue stateLoop;
                }
                case 451: {
                    if (-1 <= (nc.field_A ^ -1)) {
                        statePc = 459;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 452: {
                    if (!s.field_i) {
                        statePc = 459;
                    } else {
                        statePc = 455;
                    }
                    continue stateLoop;
                }
                case 455: {
                    if ((mk.field_k ^ -1) < -1) {
                        statePc = 459;
                    } else {
                        statePc = 458;
                    }
                    continue stateLoop;
                }
                case 458: {
                    var6 = dd.field_i + nc.field_A / 50 + ef.field_o;
                    l.field_f.a(var6, 32, -l.field_f.field_N + 68, 575, 480, 0, 0, 1, 0, l.field_f.field_N);
                    l.field_f.a(var6, 32, 68 - l.field_f.field_N, 576, 479, 0, 0, 1, 0, l.field_f.field_N);
                    l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 480, 16777215, -1, 1, 0, l.field_f.field_N);
                    statePc = 459;
                    continue stateLoop;
                }
                case 459: {
                    if (nc.field_A <= 0) {
                        statePc = 467;
                    } else {
                        statePc = 460;
                    }
                    continue stateLoop;
                }
                case 460: {
                    if (!s.field_i) {
                        statePc = 467;
                    } else {
                        statePc = 463;
                    }
                    continue stateLoop;
                }
                case 463: {
                    if (qi.field_a < 50) {
                        statePc = 467;
                    } else {
                        statePc = 466;
                    }
                    continue stateLoop;
                }
                case 466: {
                    var6 = lk.field_g + hf.field_g + nc.field_A / 50 + ef.field_o;
                    l.field_f.a(var6, 32, 68 + -l.field_f.field_N, 575, 480, 0, 0, 1, 0, l.field_f.field_N);
                    l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 479, 0, 0, 1, 0, l.field_f.field_N);
                    l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 480, 16777215, -1, 1, 0, l.field_f.field_N);
                    statePc = 467;
                    continue stateLoop;
                }
                case 467: {
                    var6_ref = (jf) ((Object) hf.field_i.b(-119));
                    if (null == var6_ref) {
                        statePc = 484;
                    } else {
                        statePc = 468;
                    }
                    continue stateLoop;
                }
                case 468: {
                    var7 = this.field_I;
                    if (-81 >= (var7 ^ -1)) {
                        statePc = 470;
                    } else {
                        statePc = 469;
                    }
                    continue stateLoop;
                }
                case 469: {
                    var8 = 255 * var7 / 80;
                    statePc = 475;
                    continue stateLoop;
                }
                case 470: {
                    if (-231 < (var7 ^ -1)) {
                        statePc = 474;
                    } else {
                        statePc = 473;
                    }
                    continue stateLoop;
                }
                case 473: {
                    var8 = (310 + -var7) * 255 / 80;
                    statePc = 475;
                    continue stateLoop;
                }
                case 474: {
                    var8 = 255;
                    statePc = 475;
                    continue stateLoop;
                }
                case 475: {
                    var9 = 148;
                    if (var8 < 0) {
                        statePc = 478;
                    } else {
                        statePc = 479;
                    }
                    continue stateLoop;
                }
                case 478: {
                    var8 = 0;
                    statePc = 479;
                    continue stateLoop;
                }
                case 479: {
                    ti.b(4, 353, -6 + var9, 123, 0, var8);
                    if (-256 == (var8 ^ -1)) {
                        statePc = 482;
                    } else {
                        statePc = 483;
                    }
                    continue stateLoop;
                }
                case 482: {
                    wh.field_e[var6_ref.field_o].a(-24 + var9 / 2, 369, 48, 48);
                    qj.field_a.a(rc.field_e[var6_ref.field_o], 8, 425, var9 - 16, 56, 65535, -1, 1, 1, qj.field_a.field_N);
                    statePc = 483;
                    continue stateLoop;
                }
                case 483: {
                    var5 = te.field_a;
                    qj.field_a.c(var5, var9 / 2 - -1, 355, 0, -1);
                    qj.field_a.c(var5, 1 + var9 / 2, 357, 0, -1);
                    qj.field_a.c(var5, var9 / 2, 356, 0, -1);
                    qj.field_a.c(var5, var9 / 2 + 2, 356, 0, -1);
                    qj.field_a.c(var5, var9 / 2 - -1, 356, 16777215, -1);
                    statePc = 484;
                    continue stateLoop;
                }
                case 484: {
                    if (!fd.d((byte) -21)) {
                        statePc = 487;
                    } else {
                        statePc = 485;
                    }
                    continue stateLoop;
                }
                case 485: {
                    ti.b(0, 0, 640, 480, 0, 128);
                    ti.f(-(ok.a((byte) 126) / 2) + 320 + -19, -16 + -(kb.b((byte) -114) / 2) + 240 - 5, ok.a((byte) 125) + 6 - -32, kb.b((byte) 121) + 10 + 32, 0);
                    na.a(28, 256, 28, fg.field_P);
                    statePc = 487;
                    continue stateLoop;
                }
                case 487: {
                    if (!hd.field_b) {
                        statePc = 490;
                    } else {
                        statePc = 488;
                    }
                    continue stateLoop;
                }
                case 488: {
                    ti.b(0, 0, 150, 480, 0, 64);
                    ti.b(0, 0, 150, 480, 16777215);
                    statePc = 490;
                    continue stateLoop;
                }
                case 490: {
                    if (!id.b(param0 ^ 20876)) {
                        statePc = 501;
                    } else {
                        statePc = 491;
                    }
                    continue stateLoop;
                }
                case 491: {
                    if (fd.d((byte) -21)) {
                        statePc = 501;
                    } else {
                        statePc = 494;
                    }
                    continue stateLoop;
                }
                case 494: {
                    if (null != s.field_e) {
                        statePc = 499;
                    } else {
                        statePc = 497;
                    }
                    continue stateLoop;
                }
                case 497: {
                    stackIn_500_0 = ua.field_b ? 1 : 0;
                    statePc = 500;
                    continue stateLoop;
                }
                case 499: {
                    stackIn_500_0 = 1;
                    statePc = 500;
                    continue stateLoop;
                }
                case 500: {
                    bc.a(stackIn_500_0 != 0, -102);
                    statePc = 501;
                    continue stateLoop;
                }
                case 501: {
                    if (null == s.field_e) {
                        statePc = 504;
                    } else {
                        statePc = 502;
                    }
                    continue stateLoop;
                }
                case 502: {
                    stackIn_505_0 = s.field_e;
                    statePc = 505;
                    continue stateLoop;
                }
                case 504: {
                    stackIn_505_0 = qd.field_j;
                    statePc = 505;
                    continue stateLoop;
                }
                case 505: {
                    pd.a((java.awt.Canvas) ((Object) stackIn_505_0), 0, 0, (byte) -73);
                    statePc = 508;
                    continue stateLoop;
                }
                case 508: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_4_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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

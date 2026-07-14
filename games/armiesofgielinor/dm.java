/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    private ft field_C;
    private int field_A;
    private ft field_B;
    private String field_U;
    private int[] field_j;
    private int field_h;
    private int field_Q;
    static String field_O;
    private int field_l;
    static String field_d;
    private ft field_q;
    static String field_x;
    private ft field_g;
    private int field_n;
    private int field_G;
    private int field_f;
    private ft field_m;
    private int field_u;
    private int field_z;
    private int field_r;
    private boolean field_y;
    private int field_b;
    private ft field_c;
    private ft[] field_T;
    private int field_F;
    int[] field_N;
    private int field_p;
    private String field_R;
    private int field_e;
    static int field_D;
    private int field_I;
    private int field_P;
    private ft field_S;
    private int field_L;
    private ft[] field_i;
    private int field_M;
    private ft field_s;
    private ft field_k;
    private ft field_J;
    private int field_E;
    private ft field_a;
    private String[] field_t;
    private int field_o;
    private ft field_w;
    private int field_K;
    private boolean field_v;

    private final int d(boolean param0) {
        if (!param0) {
            ((dm) this).field_i = null;
        }
        return (nr.field_e.field_y >> 673949441) + -nr.field_e.field_L + (nr.field_e.field_v + -nr.field_e.field_H - -3);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = this.b(true);
        param0 = (((dm) this).field_q.field_k + -var7 >> 57131457) + param0;
        ((dm) this).field_u = param0;
        param3 = param0 + var7;
        param0 = param3 + -this.e(-119);
        var7 = 0;
        int var8 = -((dm) this).field_n + param5;
        if (param4 != 7) {
            return;
        }
        var7 = 33;
        int var9 = 0;
        param0 = (((dm) this).field_f + var7) * var8 + param0;
        var9 = 33;
        param2 = param2 - -(((dm) this).field_q.field_n + -var9 >> 1653895297);
        param3 = var7 + param0;
        param1 = var9 + param2;
        ((dm) this).field_i[param5] = new ft(param0, param2);
        ((dm) this).field_T[param5] = new ft(param3, param1);
    }

    final void d(byte param0) {
        if (param0 != -73) {
            return;
        }
        this.e(false);
        this.b(param0 + 18742);
        this.k(param0 + 106);
        this.f((byte) 66);
        this.c(0);
    }

    private final void a(int param0, boolean param1, ft param2, int param3, ft param4) {
        int var6 = 0;
        wk var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param2 == null) {
            break L0;
          } else {
            if (param4 == null) {
              return;
            } else {
              L1: {
                if (param0 >= ((dm) this).field_n) {
                  break L1;
                } else {
                  if (((dm) this).field_h < param0) {
                    return;
                  } else {
                    break L1;
                  }
                }
              }
              var6 = param0 + -((dm) this).field_n;
              if (lt.field_i == null) {
                break L0;
              } else {
                L2: {
                  if (-1 < (var6 ^ -1)) {
                    break L2;
                  } else {
                    if (lt.field_i.length <= var6) {
                      break L2;
                    } else {
                      var7 = lt.field_i[var6];
                      if (param3 > 36) {
                        L3: {
                          var7.f(db.a(true, param2.field_k), u.a(param2.field_n, (byte) 94));
                          var8 = 0;
                          if (((dm) this).field_K == var6) {
                            var8 = 1;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (var8 != 0) {
                            break L4;
                          } else {
                            if (param1) {
                              break L4;
                            } else {
                              return;
                            }
                          }
                        }
                        L5: {
                          var9 = ((dm) this).field_G;
                          if (var8 == 0) {
                            break L5;
                          } else {
                            var9 = ((dm) this).field_F;
                            break L5;
                          }
                        }
                        var10 = 0;
                        L6: while (true) {
                          if (((dm) this).field_L <= var10) {
                            return;
                          } else {
                            qn.b(db.a(true, param2.field_k - -var10), u.a(var10 + param2.field_n, (byte) 94), -(var10 << -793249663) + (param4.field_k + -param2.field_k), -param2.field_n + (param4.field_n + -(var10 << 1084326849)), var9);
                            var10++;
                            continue L6;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    private final void e(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (((dm) this).field_J != null) {
            if (!(((dm) this).field_w != null)) {
                return;
            }
            if (param0) {
                return;
            }
            var2 = ((dm) this).field_J.field_k;
            var3 = ((dm) this).field_J.field_n;
            var4 = ((dm) this).field_w.field_k + -var2;
            var5 = ((dm) this).field_w.field_n + -var3;
            if (0 != var4) {
                if (var5 == 0) {
                    return;
                }
                fe.b(db.a(true, var2), u.a(var3, (byte) 94), var4, var5, io.field_m, nd.field_b, ((dm) this).field_Q, ((dm) this).field_p);
                return;
            }
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (((dm) this).field_s != null) {
            if (!(((dm) this).field_k != null)) {
                return;
            }
            var2 = ((dm) this).field_s.field_k;
            var3 = ((dm) this).field_s.field_n;
            var4 = ((dm) this).field_k.field_k + -var2;
            var5 = ((dm) this).field_k.field_n - var3;
            if (var4 != 0) {
                if (!(var5 != 0)) {
                    return;
                }
                fe.b(db.a(true, var2), u.a(var3, (byte) 94), var4, var5, io.field_m, ci.field_e, ((dm) this).field_Q, ((dm) this).field_p);
                if (param0 != 33) {
                    int discarded$0 = this.d(true);
                }
                return;
            }
        }
    }

    private final void d(int param0) {
        ((dm) this).field_J = new ft(25, 33);
        if (param0 != 7) {
            return;
        }
        ((dm) this).field_w = new ft(614, 446);
        ((dm) this).field_A = 0;
        ((dm) this).field_P = 16777215;
        ((dm) this).field_b = 192;
        ((dm) this).field_Q = 0;
        ((dm) this).field_p = 128;
    }

    final int b(boolean param0, int param1) {
        ft var3 = null;
        L0: {
          if (((dm) this).field_T == null) {
            break L0;
          } else {
            if (-1 < (param1 ^ -1)) {
              break L0;
            } else {
              if (param1 < ((dm) this).field_T.length) {
                if (param0) {
                  L1: {
                    var3 = ((dm) this).field_T[param1];
                    if (var3 == null) {
                      break L1;
                    } else {
                      if (-1 < (var3.field_k ^ -1)) {
                        break L1;
                      } else {
                        return db.a(true, var3.field_k);
                      }
                    }
                  }
                  return 1;
                } else {
                  return 39;
                }
              } else {
                return 1;
              }
            }
          }
        }
        return 1;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        if (!param5) {
            if (!(0 == (param4 & 1))) {
                tb.a(param5, param3, false, param2, (byte) -33, param0);
            }
            // if_icmpeq L96
            tb.a(param5, param3, true, param2, (byte) -33, param0);
        } else {
            if (!(-1 == (4 & param4))) {
                tb.a(param5, param3, true, param2, (byte) -33, param0);
            }
            if (!(-1 == (2 & param4 ^ -1))) {
                tb.a(param5, param3, false, param2, (byte) -33, param0);
            }
        }
        if (param1) {
            dm.c((byte) -56);
        }
    }

    private final void a(boolean param0) {
        ((dm) this).field_a = new ft(31, 431);
        this.f(1);
        this.g((byte) -71);
        this.c(param0);
    }

    final void a(int param0, byte param1, int param2, int param3, boolean param4, int param5, int param6, String param7) {
        if (((dm) this).field_N != null) {
            if (param0 >= 0) {
                if (!(param0 >= ((dm) this).field_N.length)) {
                    ((dm) this).field_r = param0;
                }
            }
        }
        if (2 <= param6) {
            if (!(param6 > 8)) {
                ((dm) this).field_e = param6;
            }
        }
        ((dm) this).field_v = param4 ? true : false;
        if (param5 < 0) {
            // if_icmpgt L144
            // if_icmple L144
            ((dm) this).field_E = param2;
        } else {
            if (((dm) this).field_e < param5) {
                // if_icmpgt L144
                // if_icmple L144
                ((dm) this).field_E = param2;
            } else {
                ((dm) this).field_I = param5;
                if (param2 <= -1) {
                    if (-5 > param2) {
                        ((dm) this).field_E = param2;
                    }
                }
            }
        }
        ((dm) this).field_K = param3;
        if (param1 != -28) {
            return;
        }
        this.a(param7, (byte) 125);
    }

    private final void a(int param0, String param1, ft param2, int param3, boolean param4, ft param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] stackIn_11_0 = null;
        int[] stackOut_10_0 = null;
        int[] stackOut_9_0 = null;
        L0: {
          if (param5 == null) {
            break L0;
          } else {
            if (param2 != null) {
              L1: {
                var7 = db.a(true, param5.field_k);
                var8 = u.a(param5.field_n, (byte) 94);
                var9 = -var7 + param2.field_k;
                var10 = param2.field_n - var8;
                qn.b(var7, var8, var9, var10, ((dm) this).field_Q, ((dm) this).field_p);
                if (!((dm) this).field_y) {
                  break L1;
                } else {
                  qn.b(var7, var8, var9, var10, ((dm) this).field_P);
                  break L1;
                }
              }
              if (param1 == null) {
                break L0;
              } else {
                if (param1.length() != 0) {
                  L2: {
                    var11 = u.a(param5.field_n, (byte) 94);
                    var12 = u.a(param2.field_n, (byte) 94);
                    var8 = var11 - -var12 >> -1550159263;
                    var13 = mp.k(-78);
                    var8 = var8 + var13;
                    if (!param4) {
                      stackOut_10_0 = nd.field_b;
                      stackIn_11_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_9_0 = ci.field_e;
                      stackIn_11_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                  var18 = (int[]) (Object) stackIn_11_0;
                  var17 = var18;
                  var16 = var17;
                  var15 = var16;
                  var14 = var15;
                  if (param3 < (param0 ^ -1)) {
                    fe.c(param1, db.a(true, ((dm) this).field_c.field_k), var8, var18, true);
                    return;
                  } else {
                    fe.a(param1, db.a(true, param0), var8, var18, true);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final int a(int param0, boolean param1) {
        ft var3 = null;
        L0: {
          if (((dm) this).field_i == null) {
            break L0;
          } else {
            if (-1 < (param0 ^ -1)) {
              break L0;
            } else {
              if (param0 >= ((dm) this).field_i.length) {
                break L0;
              } else {
                L1: {
                  if (param1) {
                    break L1;
                  } else {
                    this.a(126);
                    break L1;
                  }
                }
                var3 = ((dm) this).field_i[param0];
                if (var3 == null) {
                  return 1;
                } else {
                  if ((var3.field_k ^ -1) <= -1) {
                    return db.a(true, var3.field_k);
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
        }
        return 1;
    }

    final ft h(byte param0) {
        int var3 = 0;
        ft var4 = null;
        ft var5 = null;
        L0: {
          var5 = new ft(-1, -1);
          if (null == ((dm) this).field_T) {
            break L0;
          } else {
            if (((dm) this).field_T.length != 0) {
              if (param0 == 94) {
                var3 = 0;
                L1: while (true) {
                  if (var3 >= ((dm) this).field_T.length) {
                    L2: {
                      if (0 > var5.field_k) {
                        break L2;
                      } else {
                        if ((var5.field_n ^ -1) <= -1) {
                          return var5;
                        } else {
                          break L2;
                        }
                      }
                    }
                    return new ft(1, 1);
                  } else {
                    var4 = ((dm) this).field_T[var3];
                    if (var4 != null) {
                      L3: {
                        if (0 > var4.field_k) {
                          break L3;
                        } else {
                          L4: {
                            if (var5.field_k < var4.field_k) {
                              break L4;
                            } else {
                              if (var5.field_k >= 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var5.field_k = var4.field_k;
                          break L3;
                        }
                      }
                      if (var4.field_n >= 0) {
                        L5: {
                          if (var5.field_n < var4.field_n) {
                            break L5;
                          } else {
                            if ((var5.field_n ^ -1) > -1) {
                              break L5;
                            } else {
                              var3++;
                              continue L1;
                            }
                          }
                        }
                        var5.field_n = var4.field_n;
                        var3++;
                        continue L1;
                      } else {
                        var3++;
                        continue L1;
                      }
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
        }
        return new ft(1, 1);
    }

    private final void g(byte param0) {
        int var2 = 0;
        int var3 = 0;
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
        var2 = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var4 = ((dm) this).field_k.field_n;
        var7 = 0;
        var2 = ((dm) this).field_s.field_k;
        ((dm) this).field_m = new ft(var2, var4);
        var3 = ((dm) this).field_k.field_k;
        ((dm) this).field_z = 4;
        var7 = (((dm) this).field_q.field_n - -((dm) this).field_l) * ((dm) this).field_z + (((dm) this).field_B.field_n << -44083487) - ((dm) this).field_l;
        var5 = var7 + var4;
        ((dm) this).field_C = new ft(var3, var5);
        var8 = ((dm) this).field_k.field_n;
        var9 = ((dm) this).field_a.field_n;
        var10 = -var8 + var9;
        var11 = (-var7 + var10 >> -1070992831) + -25;
        ((dm) this).field_m.field_n = ((dm) this).field_m.field_n + var11;
        ((dm) this).field_f = 5;
        ((dm) this).field_L = 2;
        ((dm) this).field_C.field_n = ((dm) this).field_C.field_n + var11;
        var6 = this.b(true);
        var2 = var2 + (-var6 + ((dm) this).field_q.field_k >> -1547688735);
        ((dm) this).field_u = var2;
        var2 = ((dm) this).field_B.field_k + ((dm) this).field_m.field_k;
        var4 = ((dm) this).field_B.field_n + ((dm) this).field_m.field_n;
        if (param0 == -71) {
          var3 = var2 - -((dm) this).field_q.field_k;
          var12 = 0;
          var13 = ((dm) this).field_o;
          var14 = ((dm) this).field_N.length;
          var15 = var13;
          L0: while (true) {
            if (var14 <= var15) {
              return;
            } else {
              L1: {
                if (var15 == ((dm) this).field_n) {
                  var12 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var5 = var4 + ((dm) this).field_q.field_n;
              if (var12 == 0) {
                ((dm) this).field_i[var15] = new ft(var2, var4);
                ((dm) this).field_T[var15] = new ft(var3, var5);
                var4 = ((dm) this).field_l + var5;
                var15++;
                continue L0;
              } else {
                L2: {
                  if (((dm) this).field_n == var15) {
                    ((dm) this).field_g = new ft(var2, var4);
                    ((dm) this).field_S = new ft(var3, var5);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.a(var2, var5, var4, var3, 7, var15);
                if (var15 == ((dm) this).field_h) {
                  var4 = 12 + (var5 + ((dm) this).field_l);
                  var12 = 0;
                  var15++;
                  continue L0;
                } else {
                  var15++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (((dm) this).field_m != null) {
            if (!(((dm) this).field_C != null)) {
                return;
            }
            if (param0 != 66) {
                ((dm) this).field_L = -47;
            }
            var2 = ((dm) this).field_m.field_k;
            var3 = ((dm) this).field_m.field_n;
            var4 = -var2 + ((dm) this).field_C.field_k;
            var5 = ((dm) this).field_C.field_n - var3;
            if (-1 != var4) {
                if (-1 == var5) {
                    return;
                }
                fe.b(db.a(true, var2), u.a(var3, (byte) 94), var4, var5, io.field_m, ci.field_e, ((dm) this).field_Q, ((dm) this).field_p);
                return;
            }
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        ft var4 = null;
        ft var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        String var11 = null;
        int stackIn_27_0 = 0;
        int stackIn_53_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (null == ((dm) this).field_N) {
            break L0;
          } else {
            if (-1 == (((dm) this).field_N.length ^ -1)) {
              return;
            } else {
              if (null == ((dm) this).field_i) {
                break L0;
              } else {
                L1: {
                  if (((dm) this).field_i.length == 0) {
                    break L1;
                  } else {
                    if (((dm) this).field_i.length != ((dm) this).field_N.length) {
                      break L1;
                    } else {
                      L2: {
                        if (((dm) this).field_T == null) {
                          break L2;
                        } else {
                          L3: {
                            if (0 == ((dm) this).field_T.length) {
                              break L3;
                            } else {
                              if (((dm) this).field_T.length != ((dm) this).field_N.length) {
                                break L3;
                              } else {
                                if (null == ((dm) this).field_t) {
                                  break L2;
                                } else {
                                  L4: {
                                    if (0 == ((dm) this).field_t.length) {
                                      break L4;
                                    } else {
                                      if (((dm) this).field_t.length != ((dm) this).field_N.length) {
                                        break L4;
                                      } else {
                                        var2 = param0;
                                        L5: while (true) {
                                          if (((dm) this).field_N.length <= var2) {
                                            return;
                                          } else {
                                            L6: {
                                              var3 = ((dm) this).field_N[var2];
                                              var4 = ((dm) this).field_i[var2];
                                              var5 = ((dm) this).field_T[var2];
                                              var10 = ((dm) this).field_t[var2];
                                              if ((((dm) this).field_r ^ -1) <= -1) {
                                                if (((dm) this).field_r == var2) {
                                                  stackOut_25_0 = 1;
                                                  stackIn_27_0 = stackOut_25_0;
                                                  break L6;
                                                } else {
                                                  stackOut_24_0 = 0;
                                                  stackIn_27_0 = stackOut_24_0;
                                                  break L6;
                                                }
                                              } else {
                                                stackOut_22_0 = 0;
                                                stackIn_27_0 = stackOut_22_0;
                                                break L6;
                                              }
                                            }
                                            var7 = stackIn_27_0;
                                            if (var4 != null) {
                                              if (var5 != null) {
                                                var11 = this.a(-1, var10, var3);
                                                if (-8 != (var3 ^ -1)) {
                                                  if ((var3 ^ -1) != -28) {
                                                    L7: {
                                                      if (var2 < ((dm) this).field_n) {
                                                        break L7;
                                                      } else {
                                                        if (var2 <= ((dm) this).field_h) {
                                                          L8: {
                                                            if (var2 == ((dm) this).field_n) {
                                                              if (((dm) this).field_g != null) {
                                                                if (null != ((dm) this).field_S) {
                                                                  L9: {
                                                                    if ((((dm) this).field_r ^ -1) <= -1) {
                                                                      if (((dm) this).field_n <= ((dm) this).field_r) {
                                                                        if (((dm) this).field_h >= ((dm) this).field_r) {
                                                                          stackOut_51_0 = 1;
                                                                          stackIn_53_0 = stackOut_51_0;
                                                                          break L9;
                                                                        } else {
                                                                          stackOut_50_0 = 0;
                                                                          stackIn_53_0 = stackOut_50_0;
                                                                          break L9;
                                                                        }
                                                                      } else {
                                                                        stackOut_48_0 = 0;
                                                                        stackIn_53_0 = stackOut_48_0;
                                                                        break L9;
                                                                      }
                                                                    } else {
                                                                      stackOut_46_0 = 0;
                                                                      stackIn_53_0 = stackOut_46_0;
                                                                      break L9;
                                                                    }
                                                                  }
                                                                  var8 = stackIn_53_0;
                                                                  this.a(((dm) this).field_u, ((dm) this).field_U, ((dm) this).field_S, param0 ^ -1, var8 != 0, ((dm) this).field_g);
                                                                  break L8;
                                                                } else {
                                                                  var2++;
                                                                  continue L5;
                                                                }
                                                              } else {
                                                                var2++;
                                                                continue L5;
                                                              }
                                                            } else {
                                                              break L8;
                                                            }
                                                          }
                                                          this.a(var2, var7 != 0, var4, 67, var5);
                                                          var2++;
                                                          continue L5;
                                                        } else {
                                                          break L7;
                                                        }
                                                      }
                                                    }
                                                    this.a(-1, var11, var5, -1, var7 != 0, var4);
                                                    var2++;
                                                    continue L5;
                                                  } else {
                                                    this.a(var7 != 0, var4, var5, 0, var11);
                                                    var2++;
                                                    continue L5;
                                                  }
                                                } else {
                                                  this.a(var4, var11, var7 != 0, var5, 26709);
                                                  var2++;
                                                  continue L5;
                                                }
                                              } else {
                                                var2++;
                                                continue L5;
                                              }
                                            } else {
                                              var2++;
                                              continue L5;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    final ft b(byte param0) {
        int var3 = 0;
        ft var4 = null;
        ft var5 = null;
        L0: {
          var5 = new ft(-1, -1);
          if (null == ((dm) this).field_i) {
            break L0;
          } else {
            if (((dm) this).field_i.length != 0) {
              if (param0 < -42) {
                var3 = 0;
                L1: while (true) {
                  if (var3 >= ((dm) this).field_i.length) {
                    L2: {
                      if (var5.field_k < 0) {
                        break L2;
                      } else {
                        if ((var5.field_n ^ -1) <= -1) {
                          return var5;
                        } else {
                          break L2;
                        }
                      }
                    }
                    return new ft(1, 1);
                  } else {
                    var4 = ((dm) this).field_i[var3];
                    if (var4 != null) {
                      L3: {
                        if (-1 < var4.field_k) {
                          break L3;
                        } else {
                          L4: {
                            if (var4.field_k < var5.field_k) {
                              break L4;
                            } else {
                              if (-1 <= var5.field_k) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var5.field_k = var4.field_k;
                          break L3;
                        }
                      }
                      if (-1 >= var4.field_n) {
                        L5: {
                          if (var5.field_n > var4.field_n) {
                            break L5;
                          } else {
                            if (-1 > var5.field_n) {
                              break L5;
                            } else {
                              var3++;
                              continue L1;
                            }
                          }
                        }
                        var5.field_n = var4.field_n;
                        var3++;
                        continue L1;
                      } else {
                        var3++;
                        continue L1;
                      }
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
        }
        return new ft(1, 1);
    }

    private final String a(int param0, String param1, int param2) {
        int var5 = 0;
        StringBuilder stackIn_11_0 = null;
        StringBuilder stackIn_12_0 = null;
        StringBuilder stackIn_13_0 = null;
        String stackIn_13_1 = null;
        StringBuilder stackOut_10_0 = null;
        StringBuilder stackOut_12_0 = null;
        String stackOut_12_1 = null;
        StringBuilder stackOut_11_0 = null;
        String stackOut_11_1 = null;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length() != 0) {
              if (param0 == -1) {
                L1: {
                  if (-29 != (param2 ^ -1)) {
                    if (46 == param2) {
                      param1 = param1 + ((dm) this).field_I;
                      break L1;
                    } else {
                      if (param2 != 33) {
                        if (param2 != 29) {
                          break L1;
                        } else {
                          if (0 > ((dm) this).field_E) {
                            break L1;
                          } else {
                            if (h.field_e.length >= ((dm) this).field_E) {
                              param1 = param1 + h.field_e[t.field_e];
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        }
                      } else {
                        L2: {
                          stackOut_10_0 = new StringBuilder().append(param1);
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (((dm) this).field_v) {
                            stackOut_12_0 = (StringBuilder) (Object) stackIn_12_0;
                            stackOut_12_1 = dn.field_Mb;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            break L2;
                          } else {
                            stackOut_11_0 = (StringBuilder) (Object) stackIn_11_0;
                            stackOut_11_1 = qd.field_J;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            break L2;
                          }
                        }
                        param1 = (String) (Object) (stackIn_13_1);
                        break L1;
                      }
                    }
                  } else {
                    param1 = param1 + ((dm) this).field_e;
                    break L1;
                  }
                }
                return param1;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
        }
        return param1;
    }

    private final void f(int param0) {
        int var8 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = 257;
        ((dm) this).field_c = new ft(319, 239);
        int var7 = 0;
        var2 = ((dm) this).field_c.field_k + -(var6 >> -168594623);
        var4 = 58;
        ((dm) this).field_s = new ft(var2, var4);
        ((dm) this).field_B = new ft(7, 7);
        ((dm) this).field_q = new ft(-(((dm) this).field_B.field_k << 1720113665) + var6, 43);
        var3 = var6 + var2;
        ((dm) this).field_o = 2;
        ((dm) this).field_l = 4;
        var7 = -((dm) this).field_l + (((dm) this).field_q.field_n - -((dm) this).field_l) * ((dm) this).field_o + (((dm) this).field_B.field_n << 514386817);
        var5 = var4 + var7;
        ((dm) this).field_k = new ft(var3, var5);
        ((dm) this).field_i = new ft[((dm) this).field_N.length];
        ((dm) this).field_T = new ft[((dm) this).field_N.length];
        if (param0 != 1) {
            return;
        }
        var2 = ((dm) this).field_B.field_k + ((dm) this).field_s.field_k;
        var3 = ((dm) this).field_q.field_k + var2;
        var4 = ((dm) this).field_s.field_n + ((dm) this).field_B.field_n;
        for (var8 = 0; ((dm) this).field_o > var8; var8++) {
            var5 = ((dm) this).field_q.field_n + var4;
            ((dm) this).field_i[var8] = new ft(var2, var4);
            ((dm) this).field_T[var8] = new ft(var3, var5);
            var4 = ((dm) this).field_l + var5;
        }
    }

    private final int b(boolean param0) {
        int var2 = 0;
        if (!param0) {
            return 50;
        }
        var2 = 64;
        var2 = var2 + this.e(-24);
        return var2;
    }

    private final void a(String param0, byte param1) {
        int var3 = 122 % ((param1 - 92) / 33);
        int var4 = 7;
        int var5 = this.b(-1, var4);
        if (null == ((dm) this).field_t) {
            return;
        }
        if (0 <= var5) {
            if (!(((dm) this).field_t.length > var5)) {
                return;
            }
            if (param0 != null) {
                if (!(param0.length() != 0)) {
                    return;
                }
                ((dm) this).field_t[var5] = param0;
                return;
            }
        }
    }

    final int a(int param0, int param1) {
        if (null != ((dm) this).field_i) {
            // iflt L24
            // if_icmple L24
        } else {
            return 1;
        }
        ft var3 = ((dm) this).field_i[param0];
        if (param1 != 1084326849) {
            return 91;
        }
        if (var3 != null) {
            // iflt L59
        } else {
            return 1;
        }
        return u.a(var3.field_n, (byte) 94);
    }

    private final void a(ft param0, String param1, boolean param2, ft param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var17 = null;
        int[] var16 = null;
        int[] var15 = null;
        int[] var14 = null;
        if (param0 != null) {
            if (param3 != null) {
                // ifnull L24
                // if_icmpeq L24
            } else {
                return;
            }
            var6 = param0.field_k;
            var7 = param0.field_n;
            var8 = param3.field_k + -var6;
            var9 = -var7 + param3.field_n;
            if (param4 != 26709) {
                ((dm) this).field_v = true;
            }
            qn.f(db.a(true, var6), u.a(var7, (byte) 94), var8, var9, ((dm) this).field_M);
            fe.b(db.a(true, var6), u.a(var7, (byte) 94), var8, var9, io.field_m, nd.field_b, ((dm) this).field_Q, ((dm) this).field_p);
            var10 = u.a(param0.field_n, (byte) 94);
            var11 = u.a(param3.field_n, (byte) 94);
            var7 = var10 + var11 >> -2013257535;
            var12 = mp.k(-57);
            var7 = var12 + var7;
            var17 = !param2 ? nd.field_b : ci.field_e;
            var16 = var17;
            var15 = var16;
            var14 = var15;
            int[] var13 = var14;
            fe.c(param1, db.a(true, ((dm) this).field_c.field_k), var7, var17, true);
            return;
        }
    }

    final static void c(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var1 = sm.field_d;
          var2 = ko.field_b;
          if ((tr.field_A ^ -1) != -2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          if ((ro.field_ub ^ -1) != -2) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var4 = stackIn_6_0;
        ll.field_Rb.a(el.field_d, param0 + -56, var2, var3 != 0, var1, var4 != 0);
        L2: while (true) {
          if (!jd.i((byte) 90)) {
            if (param0 == 61) {
              return;
            } else {
              return;
            }
          } else {
            L3: {
              if (-14 == (rs.field_q ^ -1)) {
                L4: {
                  bv.a(true, 0, 1, jt.field_a);
                  if (null == ll.field_Rb.field_k) {
                    break L4;
                  } else {
                    ll.field_Rb.field_k.field_H = null;
                    ll.field_Rb.field_k.field_A = null;
                    break L4;
                  }
                }
                L5: {
                  le.field_b = null;
                  if (ll.field_Rb.field_k == null) {
                    break L5;
                  } else {
                    ll.field_Rb.field_k = null;
                    break L5;
                  }
                }
                ll.field_Rb = null;
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (-13 != (rs.field_q ^ -1)) {
                break L6;
              } else {
                L7: {
                  if (ln.field_e) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L7;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L7;
                  }
                }
                ln.field_e = stackIn_19_0 != 0;
                break L6;
              }
            }
            if (rs.field_q != -12) {
              continue L2;
            } else {
              if (-3 <= hi.field_j) {
                L8: {
                  if (jv.field_a) {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L8;
                  } else {
                    stackOut_24_0 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    break L8;
                  }
                }
                jv.field_a = stackIn_26_0 != 0;
                return;
              } else {
                continue L2;
              }
            }
          }
        }
    }

    private final void a(boolean param0, ft param1, ft param2, int param3, String param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        if (param1 == null) {
          return;
        } else {
          L0: {
            if (param2 == null) {
              break L0;
            } else {
              if (param4 == null) {
                break L0;
              } else {
                if (param4.length() != 0) {
                  L1: {
                    var6 = param1.field_k;
                    var7 = param1.field_n;
                    if (param3 == 0) {
                      break L1;
                    } else {
                      int discarded$2 = ((dm) this).b(true, 61);
                      break L1;
                    }
                  }
                  L2: {
                    var8 = param2.field_k + -var6;
                    var9 = param2.field_n + -var7;
                    var10 = nd.field_b;
                    if (!param0) {
                      break L2;
                    } else {
                      var10 = ci.field_e;
                      break L2;
                    }
                  }
                  fe.a(db.a(true, var6), u.a(var7, (byte) 94), var8, var9, il.field_s, var10, ((dm) this).field_Q, ((dm) this).field_b, true);
                  fe.b(db.a(true, var6), u.a(var7, (byte) 94), var8, var9, io.field_m, ci.field_e, ((dm) this).field_Q, ((dm) this).field_A);
                  var11 = param1.field_n;
                  var12 = param2.field_n;
                  var7 = var11 + var12 >> 735272929;
                  var13 = mp.k(-74);
                  var7 = var7 - -var13;
                  fe.c(param4, db.a(true, ((dm) this).field_c.field_k), u.a(var7, (byte) 94), ((dm) this).field_Q, true);
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    final int a(boolean param0, int param1) {
        ft var4 = null;
        int var5 = 0;
        ft var6 = null;
        if (!param0) {
          if (0 > param1) {
            return 1;
          } else {
            L0: {
              if (((dm) this).field_i == null) {
                break L0;
              } else {
                if (param1 >= ((dm) this).field_i.length) {
                  break L0;
                } else {
                  L1: {
                    if (((dm) this).field_T == null) {
                      break L1;
                    } else {
                      if (((dm) this).field_T.length <= param1) {
                        break L1;
                      } else {
                        L2: {
                          var6 = ((dm) this).field_i[param1];
                          var4 = ((dm) this).field_T[param1];
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (var6.field_n > -1) {
                              break L2;
                            } else {
                              if (var4 == null) {
                                return 1;
                              } else {
                                if (-1 <= var4.field_n) {
                                  var5 = var4.field_n + -var6.field_n;
                                  if (-1 <= (var5 ^ -1)) {
                                    return 1;
                                  } else {
                                    return var5;
                                  }
                                } else {
                                  return 1;
                                }
                              }
                            }
                          }
                        }
                        return 1;
                      }
                    }
                  }
                  return 1;
                }
              }
            }
            return 1;
          }
        } else {
          return 1;
        }
    }

    private final int b(int param0, int param1) {
        if (!(null != ((dm) this).field_j)) {
            return -1;
        }
        if (param0 >= (param1 ^ -1)) {
            // if_icmpge L32
        } else {
            return -1;
        }
        return ((dm) this).field_j[param1];
    }

    final static int a(int param0, int param1, int[] param2, int param3, boolean param4, int[] param5, int param6, boolean param7, int param8, boolean param9, int param10, String param11) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        int var16 = 0;
        L0: {
          var16 = ArmiesOfGielinor.field_M ? 1 : 0;
          var12 = -1;
          if (param7) {
            var12 = tt.a(param0 + -param10, -param8 + param6, param2, param9);
            break L0;
          } else {
            break L0;
          }
        }
        var13 = 0;
        if (!param9) {
          L1: while (true) {
            if (6 <= var13) {
              return var12;
            } else {
              L2: {
                var14 = nd.field_d[var13];
                if (param2[var14] >= bc.field_j[var14].length) {
                  param2[var14] = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (param2[var14] <= -1) {
                if (var14 == param3) {
                  lt.field_h[var14].f(dp.field_Vb[var14][0] + param8, dp.field_Vb[var14][1] + param10, 256);
                  var13++;
                  continue L1;
                } else {
                  if (var14 != var12) {
                    if ((param1 ^ -1) < 0) {
                      lt.field_h[var14].f(dp.field_Vb[var14][0] + param8, param10 + dp.field_Vb[var14][1], 128);
                      var13++;
                      continue L1;
                    } else {
                      var13++;
                      continue L1;
                    }
                  } else {
                    lt.field_h[var14].f(param8 + dp.field_Vb[var14][0], dp.field_Vb[var14][1] + param10, 128);
                    var13++;
                    continue L1;
                  }
                }
              } else {
                L3: {
                  if (var14 != param3) {
                    if (var12 != var14) {
                      break L3;
                    } else {
                      eo.a(dp.field_Vb[var14][0] + param8, 7829367, (byte) -80, bc.field_j[var14][param2[var14]], param10 + dp.field_Vb[var14][1]);
                      break L3;
                    }
                  } else {
                    eo.a(dp.field_Vb[var14][0] + param8, 16777215, (byte) -88, bc.field_j[var14][param2[var14]], dp.field_Vb[var14][1] + param10);
                    break L3;
                  }
                }
                L4: {
                  if (!param4) {
                    gq.b(bc.field_j[var14][param2[var14]], dp.field_Vb[var14][0] + param8, param10 + dp.field_Vb[var14][1], bd.field_q[param5[var14]]);
                    break L4;
                  } else {
                    gq.a(bc.field_j[var14][param2[var14]], dp.field_Vb[var14][0] + param8, param10 + dp.field_Vb[var14][1], 1);
                    break L4;
                  }
                }
                if ((var14 ^ -1) == -4) {
                  if (!param4) {
                    var15 = ka.a((ka) (Object) nr.field_e, param11, -10 + uh.field_e[var14][0] << 803992929);
                    fe.c(var15, (uh.field_e[var14][0] >> 195574945) + dp.field_Vb[var14][0] + param8, 20 + (uh.field_e[var14][1] >> -1666604639) + (dp.field_Vb[var14][1] + param10), 0, true);
                    var13++;
                    continue L1;
                  } else {
                    var13++;
                    continue L1;
                  }
                } else {
                  var13++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return -48;
        }
    }

    final int h(int param0) {
        if (!(((dm) this).field_q != null)) {
            return 1;
        }
        int var2 = ((dm) this).field_q.field_n;
        if ((var2 ^ -1) <= -1) {
            // if_icmpgt L38
        } else {
            return 1;
        }
        int var3 = var2 - -((dm) this).field_l;
        if ((var3 ^ -1) > -1) {
            return 1;
        }
        if (param0 != -10754) {
            int discarded$0 = ((dm) this).a(true, -108);
        }
        return var3;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (((dm) this).field_N == null) {
          return;
        } else {
          if (((dm) this).field_N.length == 0) {
            return;
          } else {
            if (param0 == -105) {
              var2 = 0;
              var3 = 0;
              L0: while (true) {
                if (var3 >= ((dm) this).field_N.length) {
                  if (var2 > 0) {
                    ((dm) this).field_j = new int[1 + var2];
                    var3 = 0;
                    L1: while (true) {
                      if (var3 >= ((dm) this).field_j.length) {
                        var3 = 0;
                        L2: while (true) {
                          if (var3 >= ((dm) this).field_N.length) {
                            return;
                          } else {
                            var4 = ((dm) this).field_N[var3];
                            if ((var4 ^ -1) <= -1) {
                              if (var4 < ((dm) this).field_j.length) {
                                ((dm) this).field_j[var4] = var3;
                                var3++;
                                continue L2;
                              } else {
                                var3++;
                                continue L2;
                              }
                            } else {
                              var3++;
                              continue L2;
                            }
                          }
                        }
                      } else {
                        ((dm) this).field_j[var3] = -1;
                        var3++;
                        continue L1;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  if (var2 < ((dm) this).field_N[var3]) {
                    var2 = ((dm) this).field_N[var3];
                    var3++;
                    continue L0;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            } else {
              return;
            }
          }
        }
    }

    private final void c(boolean param0) {
        if (null == ((dm) this).field_j) {
            return;
        }
        if (!param0) {
            ((dm) this).field_w = null;
        }
        int var2 = this.b(-1, 7);
        if (!(var2 >= 0)) {
            return;
        }
        if (((dm) this).field_i != null) {
            if (((dm) this).field_T == null) {
                return;
            }
            if (((dm) this).field_i.length > var2) {
                if (!(((dm) this).field_T.length > var2)) {
                    return;
                }
                ((dm) this).field_i[var2] = ((dm) this).field_a;
                ((dm) this).field_T[var2] = new ft(608, 462);
                return;
            }
        }
    }

    private final void j(int param0) {
        ((dm) this).field_r = 0;
        if (param0 != -15585) {
            ((dm) this).field_s = null;
        }
        ((dm) this).field_e = 2;
        ((dm) this).field_E = 0;
        ((dm) this).field_I = 0;
        ((dm) this).field_K = 0;
        ((dm) this).field_v = false;
    }

    public static void g(int param0) {
        field_O = null;
        field_x = null;
        if (param0 != 256) {
            return;
        }
        field_d = null;
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((dm) this).field_N != null) {
          if (null != il.field_t) {
            ((dm) this).field_t = new String[((dm) this).field_N.length];
            var2 = 0;
            L0: while (true) {
              if (var2 >= ((dm) this).field_N.length) {
                if (0 != il.field_t.length) {
                  if (param0 > 54) {
                    ((dm) this).field_U = il.field_t[-1 + il.field_t.length];
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                var3 = ((dm) this).field_N[var2];
                if (var3 >= 0) {
                  if (il.field_t.length > var3) {
                    var4 = il.field_t[var3];
                    if (var4 != null) {
                      ((dm) this).field_t[var2] = var4;
                      var2++;
                      continue L0;
                    } else {
                      var2++;
                      continue L0;
                    }
                  } else {
                    var2++;
                    continue L0;
                  }
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void i(int param0) {
        this.d(param0 + 6);
        if (param0 != 1) {
            return;
        }
        this.a(param0 + 11);
        this.a(true);
        this.j(-15585);
        ((dm) this).field_y = false;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (wb.field_b != null) {
            if (!(5 < wb.field_b.length)) {
                return;
            }
            ((dm) this).field_R = wb.field_b[5];
            if (null == ((dm) this).field_R) {
                return;
            }
            var2 = ((dm) this).field_J.field_n;
            var3 = this.d(true);
            if (param0 != 18669) {
                int discarded$0 = ((dm) this).a(70, true);
            }
            var4 = var3 + var2;
            fe.b(((dm) this).field_R, db.a(true, ((dm) this).field_c.field_k), u.a(var4, (byte) 94));
            fe.c(((dm) this).field_R, db.a(true, ((dm) this).field_c.field_k), u.a(var4, (byte) 94), nd.field_b, false);
            return;
        }
    }

    private final void a(int param0) {
        int var3 = 0;
        ((dm) this).field_N = new int[11];
        int var2 = 0;
        var2++;
        ((dm) this).field_N[var2] = 25;
        var2++;
        ((dm) this).field_N[var2] = 26;
        var2++;
        ((dm) this).field_N[var2] = 28;
        var2++;
        ((dm) this).field_N[var2] = 46;
        var2++;
        ((dm) this).field_N[var2] = 29;
        ((dm) this).field_n = var2;
        for (var3 = 0; 4 > var3; var3++) {
            var2++;
            ((dm) this).field_N[var2] = 55 + var3;
        }
        ((dm) this).field_h = var2 - 1;
        if (param0 != 12) {
            Object var4 = null;
            ((dm) this).a(105, (byte) -17, -105, 21, true, -116, -10, (String) null);
        }
        var2++;
        ((dm) this).field_N[var2] = 27;
        var2++;
        ((dm) this).field_N[var2] = 7;
        this.a((byte) -105);
        ((dm) this).field_F = 15855490;
        ((dm) this).field_G = 11711413;
    }

    private final int e(int param0) {
        int var5 = 0;
        int var6 = 0;
        int var2 = 1 + (-((dm) this).field_n + ((dm) this).field_h);
        int var4 = -81 % ((26 - param0) / 47);
        int var3 = 0;
        for (var5 = 0; var2 > var5; var5++) {
            var6 = 33;
            var6 = ((dm) this).field_f + var6;
            var3 = var6 + var3;
        }
        var3 = var3 - ((dm) this).field_f;
        return var3;
    }

    public dm() {
        ((dm) this).field_A = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Toggle Equipment";
        field_O = "Accept draw";
        field_d = "Real-life threats";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mo extends am {
    private int field_s;
    static int[] field_B;
    static int[] field_w;
    private int field_G;
    private int field_E;
    static double[] field_D;
    private int field_t;
    private int field_A;
    static double[] field_x;
    private int field_F;
    static java.security.SecureRandom field_y;
    private int field_z;
    static int[] field_C;
    private int field_v;
    private int field_u;

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int[][] var15 = null;
        int[][] var20 = null;
        int[][] var25 = null;
        int[][] var29 = null;
        int[][] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        L0: {
          var12 = Torquing.field_u;
          if (param0 == -29116) {
            break L0;
          } else {
            ((mo) this).field_u = 7;
            break L0;
          }
        }
        L1: {
          var30 = ((mo) this).field_r.a(15142, param1);
          var25 = var30;
          var20 = var25;
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (!((mo) this).field_r.field_b) {
            break L1;
          } else {
            var29 = ((mo) this).c(24066, param1, 0);
            var32 = var29[0];
            var33 = var29[1];
            var31 = var29[2];
            var8 = var30[0];
            var9 = var30[1];
            var10 = var30[2];
            var11 = 0;
            L2: while (true) {
              if (ci.field_c <= var11) {
                break L1;
              } else {
                this.a(var31[var11], var32[var11], 117, var33[var11]);
                ((mo) this).field_v = ((mo) this).field_v + ((mo) this).field_z;
                ((mo) this).field_A = ((mo) this).field_A + ((mo) this).field_t;
                ((mo) this).field_F = ((mo) this).field_F + ((mo) this).field_G;
                L3: while (true) {
                  if (((mo) this).field_F >= 0) {
                    L4: {
                      if (0 <= ((mo) this).field_A) {
                        break L4;
                      } else {
                        ((mo) this).field_A = 0;
                        break L4;
                      }
                    }
                    L5: while (true) {
                      if (((mo) this).field_F <= 4096) {
                        L6: {
                          if (((mo) this).field_v >= 0) {
                            break L6;
                          } else {
                            ((mo) this).field_v = 0;
                            break L6;
                          }
                        }
                        L7: {
                          if (((mo) this).field_A <= 4096) {
                            break L7;
                          } else {
                            ((mo) this).field_A = 4096;
                            break L7;
                          }
                        }
                        L8: {
                          if (4096 < ((mo) this).field_v) {
                            ((mo) this).field_v = 4096;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        this.b(-4, ((mo) this).field_A, ((mo) this).field_v, ((mo) this).field_F);
                        var8[var11] = ((mo) this).field_s;
                        var9[var11] = ((mo) this).field_u;
                        var10[var11] = ((mo) this).field_E;
                        var11++;
                        continue L2;
                      } else {
                        ((mo) this).field_F = ((mo) this).field_F - 4096;
                        continue L5;
                      }
                    }
                  } else {
                    ((mo) this).field_F = ((mo) this).field_F + 4096;
                    continue L3;
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    final static boolean a(int param0, boolean param1) {
        try {
            df var4 = null;
            df var5 = null;
            if (!(null != rh.field_b)) {
                rh.field_b = u.field_t.a(ih.field_b, ea.field_t, param0 ^ -369);
            }
            if (rh.field_b.field_a == 0) {
                return false;
            }
            if (param0 != 269) {
                boolean discarded$0 = mo.a(-117, true);
            }
            long dupTemp$1 = km.b(-1);
            ak.field_k = dupTemp$1;
            rb.field_C = dupTemp$1;
            if (1 != rh.field_b.field_a) {
                ef.field_a = wj.field_i;
            } else {
                {
                    vk.field_E = new no((java.net.Socket) rh.field_b.field_d, u.field_t);
                    wa.field_d.field_n = 0;
                    var4 = kj.field_d;
                    var5 = var4;
                    var5.field_n = 0;
                    ef.field_a = tb.field_o;
                    mm.field_d = !param1 ? -1 : -2;
                    eb.field_f = !param1 ? -1 : -2;
                    wk.field_h = !param1 ? -1 : -2;
                    q.a(vg.field_j, 107, tp.field_i, (fj) (Object) wa.field_d, ao.field_d);
                    jd.a((byte) -95, -1);
                }
            }
            rh.field_b = null;
            return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public mo() {
        super(1, false);
        ((mo) this).field_t = 0;
        ((mo) this).field_z = 0;
        ((mo) this).field_G = 0;
    }

    final static int b(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_62_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_78_0 = 0;
        var5 = Torquing.field_u;
        try {
          L0: {
            vp.field_E = vp.field_E + 65536;
            L1: while (true) {
              if (65536 > rn.a(vp.field_E, (byte) -18, op.field_k)) {
                L2: {
                  var2_int = -1;
                  if (nc.field_d != null) {
                    var2_int = nc.field_d.length;
                    break L2;
                  } else {
                    if (ln.field_H != null) {
                      var2_int = ln.field_H.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 != var2_int) {
                    L4: {
                      if (mf.field_t < op.field_q) {
                        L5: {
                          mf.field_t = mf.field_t + 1;
                          if (mf.field_t <= op.field_j) {
                            break L5;
                          } else {
                            L6: {
                              if (nc.field_d == null) {
                                break L6;
                              } else {
                                if (null == nc.field_d[da.field_a]) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            mf.field_t = mf.field_t - 1;
                            break L4;
                          }
                        }
                        if (mf.field_t < op.field_q) {
                          break L4;
                        } else {
                          if (null != nc.field_d[(1 + da.field_a) % var2_int]) {
                            break L4;
                          } else {
                            mf.field_t = mf.field_t - 1;
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L7: {
                      if (op.field_q <= mf.field_t) {
                        gf.field_h = da.field_a;
                        mf.field_t = mf.field_t - op.field_q;
                        if (!pp.field_c) {
                          da.field_a = da.field_a - 1;
                          if (da.field_a >= 0) {
                            break L7;
                          } else {
                            da.field_a = da.field_a + var2_int;
                            break L7;
                          }
                        } else {
                          da.field_a = da.field_a + 1;
                          if (da.field_a < var2_int) {
                            break L7;
                          } else {
                            da.field_a = da.field_a - var2_int;
                            break L7;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                    if (mf.field_t <= op.field_j) {
                      break L3;
                    } else {
                      pp.field_c = true;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L8: {
                  if (param0 == -457010900) {
                    break L8;
                  } else {
                    field_w = null;
                    break L8;
                  }
                }
                L9: {
                  if (qc.field_db == null) {
                    break L9;
                  } else {
                    L10: {
                      var3 = 357 + -(qc.field_db.field_u / 2);
                      var4 = 0;
                      if (0 == ta.field_o) {
                        break L10;
                      } else {
                        if (re.field_c <= var3) {
                          break L10;
                        } else {
                          if (re.field_c < var3 - -qc.field_db.field_t) {
                            L11: {
                              if (wh.field_s <= -qc.field_db.field_s + 269) {
                                break L11;
                              } else {
                                if (wh.field_s < 269) {
                                  pp.field_c = false;
                                  var4 = 1;
                                  mf.field_t = op.field_q;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (wh.field_s <= 586) {
                              break L10;
                            } else {
                              if (wh.field_s >= qc.field_db.field_s + 586) {
                                break L10;
                              } else {
                                pp.field_c = true;
                                var4 = 1;
                                mf.field_t = op.field_q;
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L9;
                    } else {
                      if (op.field_j >= mf.field_t) {
                        break L9;
                      } else {
                        if (k.field_e <= var3) {
                          break L9;
                        } else {
                          if (var3 + qc.field_db.field_t > k.field_e) {
                            L12: {
                              if (269 + -qc.field_db.field_s >= n.field_t) {
                                break L12;
                              } else {
                                if (n.field_t < 269) {
                                  mf.field_t = op.field_j;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (586 >= n.field_t) {
                              break L9;
                            } else {
                              if (n.field_t >= 586 - -qc.field_db.field_s) {
                                break L9;
                              } else {
                                mf.field_t = op.field_j;
                                break L9;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
                if (param1) {
                  L13: {
                    sd.field_s.a(true, n.a(n.field_t, false, k.field_e), n.a(wh.field_s, false, re.field_c));
                    if (sd.field_s.f((byte) -60)) {
                      if (sd.field_s.field_g == 0) {
                        stackOut_62_0 = 3;
                        stackIn_63_0 = stackOut_62_0;
                        return stackIn_63_0;
                      } else {
                        if (sd.field_s.field_g != 1) {
                          break L13;
                        } else {
                          stackOut_65_0 = 2;
                          stackIn_66_0 = stackOut_65_0;
                          return stackIn_66_0;
                        }
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: while (true) {
                    if (!np.a((byte) -13)) {
                      stackOut_80_0 = 0;
                      stackIn_81_0 = stackOut_80_0;
                      break L0;
                    } else {
                      L15: {
                        sd.field_s.a((byte) 119, 0);
                        if (!sd.field_s.f((byte) -60)) {
                          break L15;
                        } else {
                          if (0 == sd.field_s.field_g) {
                            stackOut_71_0 = 3;
                            stackIn_72_0 = stackOut_71_0;
                            return stackIn_72_0;
                          } else {
                            if (sd.field_s.field_g != 1) {
                              break L15;
                            } else {
                              stackOut_74_0 = 1;
                              stackIn_75_0 = stackOut_74_0;
                              return stackIn_75_0;
                            }
                          }
                        }
                      }
                      if (e.field_f == 13) {
                        stackOut_78_0 = 1;
                        stackIn_79_0 = stackOut_78_0;
                        return stackIn_79_0;
                      } else {
                        continue L14;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              } else {
                vp.field_E = vp.field_E - op.field_k;
                ke.field_c = ke.field_c + 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "mo.E(" + param0 + 44 + param1 + 41);
        }
        return stackIn_81_0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        L0: {
          var11 = Torquing.field_u;
          if (param2 >= 97) {
            break L0;
          } else {
            field_C = null;
            break L0;
          }
        }
        L1: {
          if (param1 > param3) {
            stackOut_4_0 = param1;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = param3;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var5 = stackIn_5_0;
          if (var5 < param0) {
            stackOut_7_0 = param0;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = var5;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var5 = stackIn_8_0;
          if (param1 < param3) {
            stackOut_10_0 = param1;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = param3;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var6 = stackIn_11_0;
          if (var6 > param0) {
            stackOut_13_0 = param0;
            stackIn_14_0 = stackOut_13_0;
            break L4;
          } else {
            stackOut_12_0 = var6;
            stackIn_14_0 = stackOut_12_0;
            break L4;
          }
        }
        L5: {
          var6 = stackIn_14_0;
          ((mo) this).field_v = (var6 + var5) / 2;
          var7 = -var6 + var5;
          if (var7 > 0) {
            L6: {
              var8 = (var5 - param1 << 12) / var7;
              var9 = (-param3 + var5 << 12) / var7;
              var10 = (var5 - param0 << 12) / var7;
              if (var5 == param1) {
                L7: {
                  stackOut_26_0 = this;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  if (var6 == param3) {
                    stackOut_28_0 = this;
                    stackOut_28_1 = var10 + 20480;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    break L7;
                  } else {
                    stackOut_27_0 = this;
                    stackOut_27_1 = -var9 + 4096;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    break L7;
                  }
                }
                ((mo) this).field_F = stackIn_29_1;
                break L6;
              } else {
                if (var5 != param3) {
                  L8: {
                    stackOut_22_0 = this;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (var6 == param1) {
                      stackOut_24_0 = this;
                      stackOut_24_1 = 12288 - -var9;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      break L8;
                    } else {
                      stackOut_23_0 = this;
                      stackOut_23_1 = -var8 + 20480;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      break L8;
                    }
                  }
                  ((mo) this).field_F = stackIn_25_1;
                  break L6;
                } else {
                  L9: {
                    stackOut_18_0 = this;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (var6 != param0) {
                      stackOut_20_0 = this;
                      stackOut_20_1 = -var10 + 12288;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      break L9;
                    } else {
                      stackOut_19_0 = this;
                      stackOut_19_1 = var8 + 4096;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      break L9;
                    }
                  }
                  ((mo) this).field_F = stackIn_21_1;
                  break L6;
                }
              }
            }
            ((mo) this).field_F = ((mo) this).field_F / 6;
            break L5;
          } else {
            ((mo) this).field_F = 0;
            break L5;
          }
        }
        L10: {
          L11: {
            if (0 >= ((mo) this).field_v) {
              break L11;
            } else {
              if (((mo) this).field_v < 4096) {
                L12: {
                  stackOut_35_0 = this;
                  stackOut_35_1 = var7 << 12;
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  if (2048 < ((mo) this).field_v) {
                    stackOut_37_0 = this;
                    stackOut_37_1 = stackIn_37_1;
                    stackOut_37_2 = 8192 - ((mo) this).field_v * 2;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    stackIn_38_2 = stackOut_37_2;
                    break L12;
                  } else {
                    stackOut_36_0 = this;
                    stackOut_36_1 = stackIn_36_1;
                    stackOut_36_2 = 2 * ((mo) this).field_v;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    stackIn_38_2 = stackOut_36_2;
                    break L12;
                  }
                }
                ((mo) this).field_A = stackIn_38_1 / stackIn_38_2;
                break L10;
              } else {
                break L11;
              }
            }
          }
          ((mo) this).field_A = 0;
          break L10;
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int == 0) {
                ((mo) this).field_G = param0.g(param1 + 65501);
                break L1;
              } else {
                if (var4_int == 1) {
                  ((mo) this).field_t = (param0.f((byte) 23) << 12) / 100;
                  break L1;
                } else {
                  if (2 != var4_int) {
                    break L1;
                  } else {
                    ((mo) this).field_z = (param0.f((byte) 77) << 12) / 100;
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param1 == 35) {
                break L2;
              } else {
                ((mo) this).field_s = -80;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("mo.H(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
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
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var14 = Torquing.field_u;
        if (param0 == -4) {
          L0: {
            if (param2 > 2048) {
              stackOut_4_0 = param2 + param1 + -(param2 * param1 >> 12);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = (param1 + 4096) * param2 >> 12;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (var5 > 0) {
              param3 = param3 * 6;
              var6 = -var5 + param2 + param2;
              var7 = (-var6 + var5 << 12) / var5;
              var8 = param3 >> 12;
              var9 = -(var8 << 12) + param3;
              var10 = var5;
              var10 = var7 * var10 >> 12;
              var10 = var9 * var10 >> 12;
              var11 = var6 + var10;
              var12 = -var10 + var5;
              var13 = var8;
              if (var13 != 0) {
                if (var13 == 1) {
                  ((mo) this).field_u = var5;
                  ((mo) this).field_E = var6;
                  ((mo) this).field_s = var12;
                  break L1;
                } else {
                  if (2 != var13) {
                    if (var13 == 3) {
                      ((mo) this).field_s = var6;
                      ((mo) this).field_u = var12;
                      ((mo) this).field_E = var5;
                      break L1;
                    } else {
                      if (4 == var13) {
                        ((mo) this).field_u = var6;
                        ((mo) this).field_E = var5;
                        ((mo) this).field_s = var11;
                        break L1;
                      } else {
                        if (var13 == 5) {
                          ((mo) this).field_u = var6;
                          ((mo) this).field_E = var12;
                          ((mo) this).field_s = var5;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    ((mo) this).field_s = var6;
                    ((mo) this).field_u = var5;
                    ((mo) this).field_E = var11;
                    break L1;
                  }
                }
              } else {
                ((mo) this).field_E = var6;
                ((mo) this).field_u = var11;
                ((mo) this).field_s = var5;
                break L1;
              }
            } else {
              ((mo) this).field_E = param2;
              ((mo) this).field_u = param2;
              ((mo) this).field_s = param2;
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(t param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = Torquing.field_u;
        try {
          L0: {
            if (0 == (3 & (param0.field_r | (param0.field_v | (param0.field_t | param0.field_s))))) {
              return;
            } else {
              var2_int = (3 & param0.field_v) + param0.field_s;
              var3 = param0.field_t + (3 & param0.field_r);
              var2_int = var2_int - (3 & var2_int) - -4;
              var3 = var3 + (-(3 & var3) + 4);
              var4 = new int[var2_int * var3];
              var5 = 0;
              var6 = (3 & param0.field_v) - -(var2_int * (param0.field_r & 3));
              var7 = 0;
              L1: while (true) {
                if (var7 >= param0.field_t) {
                  param0.field_r = param0.field_r & -4;
                  param0.field_y = var4;
                  param0.field_v = param0.field_v & -4;
                  param0.field_t = var3;
                  param0.field_s = var2_int;
                  break L0;
                } else {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= param0.field_s) {
                      var6 = var6 + (-param0.field_s + var2_int);
                      var7++;
                      continue L1;
                    } else {
                      int incrementValue$2 = var6;
                      var6++;
                      int incrementValue$3 = var5;
                      var5++;
                      var4[incrementValue$2] = param0.field_y[incrementValue$3];
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("mo.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 4 + 41);
        }
    }

    public static void g(byte param0) {
        field_B = null;
        field_x = null;
        field_D = null;
        field_C = null;
        field_w = null;
        field_y = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new int[4];
        field_x = new double[]{0.0, 1.0, 0.0, 0.5, 0.0, 1.5};
        field_D = new double[]{4.0, 4.0, 0.0, 4.0, 0.5, 4.0};
        field_C = new int[]{0, 1, 2, 3, 4, 5};
    }
}

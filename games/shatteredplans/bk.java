/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static String field_d;
    static String field_c;
    static pf field_a;
    static String[] field_b;

    final static boolean a(byte param0) {
        eq var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -50) {
                break L1;
              } else {
                bk.a((byte) -35);
                break L1;
              }
            }
            var1 = (eq) ((Object) kc.field_b.d(0));
            if (null == var1) {
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2 = 0;
              L2: while (true) {
                L3: {
                  if (var2 >= var1.field_l) {
                    break L3;
                  } else {
                    L4: {
                      if (var1.field_q[var2] != null) {
                        if ((var1.field_q[var2].field_d ^ -1) == -1) {
                          stackIn_18_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (null == var1.field_n[var2]) {
                        break L5;
                      } else {
                        if (var1.field_n[var2].field_d != 0) {
                          break L5;
                        } else {
                          stackIn_24_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    var2++;
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_27_0 = 1;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "bk.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_24_0 != 0;
            } else {
              return stackIn_27_0 != 0;
            }
          }
        }
    }

    final static void a(ik[] param0, int param1) {
        ik stackIn_4_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        ik stackIn_22_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        ik[] var2 = null;
        ik var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3_int = 0;
        ik[] var3 = null;
        ik var4_ref_ik = null;
        int var4 = 0;
        int var5_int = 0;
        ik var5 = null;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = param0;
                        var3_int = param1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3_int ^ -1) <= (var2.length ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4_ref_ik = var2[var3_int];
                        stackIn_22_0 = (ik) (var4_ref_ik);
                        stackIn_4_0 = stackIn_22_0;
                        if (var6 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5_int = stackIn_4_0.field_k >> 1305687908;
                        if (var5_int < nm.field_a) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-1 <= (var5_int ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_11_0 = var5_int;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        nm.field_a = stackIn_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_int++;
                        if (er.field_i >= var5_int) {
                            statePc = 20;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((gf.field_k ^ -1) >= (var5_int ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_19_0 = var5_int;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = -1 + gf.field_k;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        er.field_i = stackIn_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3_int++;
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = param0[param0.length - 1];
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var2_ref = stackIn_22_0;
                        var3 = param0;
                        var4 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var3.length <= var4) {
                            statePc = 43;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5 = var3[var4];
                        if (var6 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var5.field_k > var2_ref.field_k) {
                            statePc = 34;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var2_ref.field_k > var5.field_k) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        tc.a(param1 ^ 24, var5, false, var2_ref);
                        if (var6 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        tc.a(61, var2_ref, true, var5);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var2_ref = var5;
                        var4++;
                        if (var6 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    var2_ref2 = (RuntimeException) ((Object) caughtException);
                    stackIn_41_0 = (RuntimeException) (var2_ref2);
                    stackIn_39_0 = stackIn_41_0;
                    stackIn_41_1 = new StringBuilder().append("bk.B(");
                    stackIn_39_1 = stackIn_41_1;
                    if (param0 == null) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_42_0 = (RuntimeException) ((Object) stackIn_39_0);
                    stackIn_42_1 = (StringBuilder) ((Object) stackIn_39_1);
                    stackIn_42_2 = "{...}";
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
                    stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                    stackIn_42_2 = "null";
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    throw r.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param1 + ')');
                }
                case 43: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_a = null;
              field_d = null;
              if (param0 == 2562) {
                break L1;
              } else {
                bk.a(88);
                break L1;
              }
            }
            field_c = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "bk.D(" + param0 + ')');
        }
    }

    final static String b(int param0) {
        String stackIn_53_0 = null;
        Object stackIn_97_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = null;
              var2 = null;
              var3 = 85 / ((-64 - param0) / 60);
              if (0 != em.field_h) {
                break L1;
              } else {
                if (null == he.field_p) {
                  break L1;
                } else {
                  var2 = di.field_k;
                  break L1;
                }
              }
            }
            L2: {
              if ((em.field_h ^ -1) != -3) {
                break L2;
              } else {
                if (lh.e((byte) 75)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (da.a(-30106, nd.field_k)) {
                        break L4;
                      } else {
                        var2 = re.a(of.field_g, 4371, new String[]{gi.field_a});
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = re.a(oi.field_g, 4371, new String[]{gi.field_a});
                    break L3;
                  }
                  if (!dp.field_t) {
                    break L2;
                  } else {
                    md.a(2, (String) (var2), 0, (String) null, (String) null, -16169);
                    eo.f(false);
                    break L2;
                  }
                }
              }
            }
            L5: {
              if (null != var2) {
                break L5;
              } else {
                if (ShatteredPlansClient.field_K) {
                  break L5;
                } else {
                  if (fa.field_X != null) {
                    break L5;
                  } else {
                    var2 = ce.field_u;
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (var2 != null) {
                cq.a(-73, ho.field_c, (String) null, (String) (var2), 0);
                break L6;
              } else {
                L7: {
                  var4 = ln.field_o;
                  var4 = v.a(var4, (byte) 19);
                  var5 = "";
                  var6 = "|";
                  var7 = em.field_h;
                  var8 = 0;
                  if (-3 == (var7 ^ -1)) {
                    var5 = re.a(fj.field_q, 4371, new String[]{gi.field_a});
                    var9 = re.a(cf.field_M, 4371, new String[]{var4});
                    var8 = -485 + uq.field_j.field_K - (-cg.field_C.field_K - ho.field_f.c(var9) + ho.field_f.c(var5));
                    if ((var8 ^ -1) > -1) {
                      var8 = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    L8: {
                      if (var7 != 0) {
                        break L8;
                      } else {
                        L9: {
                          if (np.field_a != null) {
                            break L9;
                          } else {
                            if (je.field_e) {
                              var5 = "[" + ds.field_a + "] ";
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (null != np.field_a) {
                          L10: {
                            var7 = 1;
                            if (!i.field_c) {
                              break L10;
                            } else {
                              if (null == wf.field_m) {
                                break L10;
                              } else {
                                var5 = "[" + wf.field_m + "] ";
                                if (var11 == 0) {
                                  break L8;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          var5 = "[" + re.a(he.field_q, 4371, new String[]{np.field_a.field_Xb}) + "] ";
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L11: {
                      if (eg.a((byte) 118)) {
                        stackIn_53_0 = ": ";
                        break L11;
                      } else {
                        stackIn_53_0 = "<img=3>: ";
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        var9 = stackIn_53_0;
                        var5 = var5 + var4 + var9;
                        if (!bg.field_g) {
                          break L13;
                        } else {
                          var6 = "";
                          var5 = "<col=999999>" + var5 + uh.field_d + "</col>";
                          if (var11 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      if (ae.field_b) {
                        var6 = "";
                        var5 = "<col=999999>" + var5 + qj.field_c + "</col>";
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L14: {
                      var10 = ho.field_f.c(var5);
                      if (!eg.a((byte) 110)) {
                        L15: {
                          if (!uq.field_j.field_L) {
                            break L15;
                          } else {
                            if ((var10 ^ -1) < (-uq.field_j.field_B + pd.field_k ^ -1)) {
                              if (bg.field_g) {
                                var1 = "Broken!";
                                break L15;
                              } else {
                                var1 = qj.field_c;
                                break L15;
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                        if (-1 == (uq.field_j.field_rb ^ -1)) {
                          break L14;
                        } else {
                          if ((uq.field_j.field_Q ^ -1) > (var10 ^ -1)) {
                            if (bg.field_g) {
                              break L14;
                            } else {
                              rg.a(true);
                              break L14;
                            }
                          } else {
                            break L14;
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                    break L7;
                  }
                }
                L16: {
                  cq.a(-110, ke.field_q[var7], var6, var5 + nq.a(cg.field_E.toString()), var8);
                  if (sr.field_h) {
                    break L16;
                  } else {
                    cg.field_C.field_L = false;
                    break L16;
                  }
                }
                L17: {
                  if (cg.field_C.field_L) {
                    var1 = re.a(fi.field_m, 4371, new String[]{var4, gi.field_a});
                    break L17;
                  } else {
                    break L17;
                  }
                }
                break L6;
              }
            }
            stackIn_97_0 = var1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (var1), "bk.A(" + param0 + ')');
        }
        return (String) ((Object) stackIn_97_0);
    }

    static {
        field_c = "Open in popup window";
        field_d = "you lost 1 fleet in the attack";
        field_b = new String[16];
        field_a = new pf();
    }
}

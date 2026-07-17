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
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_26_0 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -50) {
                break L1;
              } else {
                boolean discarded$2 = bk.a((byte) -35);
                break L1;
              }
            }
            var1 = (eq) (Object) kc.field_b.d(0);
            if (null == var1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              var2 = 0;
              L2: while (true) {
                L3: {
                  if (var2 >= var1.field_l) {
                    break L3;
                  } else {
                    L4: {
                      if (var1.field_q[var2] != null) {
                        if (var1.field_q[var2].field_d == 0) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
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
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0 != 0;
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
                stackOut_26_0 = 1;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1_ref, "bk.C(" + param0 + 41);
        }
        return stackIn_27_0 != 0;
    }

    final static void a(ik[] param0, int param1) {
        RuntimeException var2 = null;
        ik[] var2_array = null;
        ik var2_ref = null;
        int var3_int = 0;
        ik[] var3 = null;
        ik var4_ref_ik = null;
        int var4 = 0;
        int var5_int = 0;
        ik var5 = null;
        int var6 = 0;
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
        RuntimeException decompiledCaughtException = null;
        ik stackOut_3_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        ik stackOut_21_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_array = param0;
            var3_int = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3_int <= ~var2_array.length) {
                    break L3;
                  } else {
                    var4_ref_ik = var2_array[var3_int];
                    stackOut_3_0 = (ik) var4_ref_ik;
                    stackIn_22_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        var5_int = stackIn_4_0.field_k >> 4;
                        if (var5_int < nm.field_a) {
                          L5: {
                            if (var5_int <= 0) {
                              stackOut_10_0 = 0;
                              stackIn_11_0 = stackOut_10_0;
                              break L5;
                            } else {
                              stackOut_8_0 = var5_int;
                              stackIn_11_0 = stackOut_8_0;
                              break L5;
                            }
                          }
                          nm.field_a = stackIn_11_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        var5_int++;
                        if (er.field_i >= var5_int) {
                          break L6;
                        } else {
                          L7: {
                            if (~gf.field_k >= ~var5_int) {
                              stackOut_18_0 = -1 + gf.field_k;
                              stackIn_19_0 = stackOut_18_0;
                              break L7;
                            } else {
                              stackOut_16_0 = var5_int;
                              stackIn_19_0 = stackOut_16_0;
                              break L7;
                            }
                          }
                          er.field_i = stackIn_19_0;
                          break L6;
                        }
                      }
                      var3_int++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_21_0 = param0[param0.length - 1];
                stackIn_22_0 = stackOut_21_0;
                break L2;
              }
              var2_ref = stackIn_22_0;
              var3 = param0;
              var4 = 0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (var3.length <= var4) {
                      break L10;
                    } else {
                      var5 = var3[var4];
                      if (var6 != 0) {
                        break L9;
                      } else {
                        L11: {
                          L12: {
                            if (var5.field_k > var2_ref.field_k) {
                              break L12;
                            } else {
                              if (var2_ref.field_k > var5.field_k) {
                                tc.a(param1 ^ 24, var5, false, var2_ref);
                                if (var6 == 0) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              } else {
                                break L11;
                              }
                            }
                          }
                          tc.a(61, var2_ref, true, var5);
                          break L11;
                        }
                        var2_ref = var5;
                        var4++;
                        if (var6 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  break L9;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("bk.B(");
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L13;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L13;
            }
          }
          throw r.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 44 + param1 + 41);
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
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
          throw r.a((Throwable) (Object) var1, "bk.D(" + param0 + 41);
        }
    }

    final static String b(int param0) {
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
        String stackIn_53_0 = null;
        Object stackIn_97_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_52_0 = null;
        String stackOut_50_0 = null;
        Object stackOut_96_0 = null;
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
                  var2 = (Object) (Object) di.field_k;
                  break L1;
                }
              }
            }
            L2: {
              if (em.field_h != 2) {
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
                        var2 = (Object) (Object) re.a(of.field_g, 4371, new String[1]);
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = (Object) (Object) re.a(oi.field_g, 4371, new String[1]);
                    break L3;
                  }
                  if (!dp.field_t) {
                    break L2;
                  } else {
                    md.a(2, (String) var2, 0, (String) null, (String) null, -16169);
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
                    var2 = (Object) (Object) ce.field_u;
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (var2 != null) {
                cq.a(-73, ho.field_c, (String) null, (String) var2, 0);
                break L6;
              } else {
                L7: {
                  var4 = ln.field_o;
                  var4 = v.a(var4, (byte) 19);
                  var5 = "";
                  var6 = "|";
                  var7 = em.field_h;
                  var8 = 0;
                  if (var7 == 2) {
                    var5 = re.a(fj.field_q, 4371, new String[1]);
                    var9 = re.a(cf.field_M, 4371, new String[1]);
                    var8 = -485 + uq.field_j.field_K - (-cg.field_C.field_K - ho.field_f.c(var9) + ho.field_f.c(var5));
                    if (var8 < 0) {
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
                          var5 = "[" + re.a(he.field_q, 4371, new String[1]) + "] ";
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L11: {
                      if (eg.a((byte) 118)) {
                        stackOut_52_0 = ": ";
                        stackIn_53_0 = stackOut_52_0;
                        break L11;
                      } else {
                        stackOut_50_0 = "<img=3>: ";
                        stackIn_53_0 = stackOut_50_0;
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
                            if (~var10 < ~(-uq.field_j.field_B + pd.field_k)) {
                              if (bg.field_g) {
                                var1 = (Object) (Object) "Broken!";
                                break L15;
                              } else {
                                var1 = (Object) (Object) qj.field_c;
                                break L15;
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                        if (uq.field_j.field_rb == 0) {
                          break L14;
                        } else {
                          if (~uq.field_j.field_Q > ~var10) {
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
                    var1 = (Object) (Object) re.a(fi.field_m, 4371, new String[2]);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                break L6;
              }
            }
            stackOut_96_0 = var1;
            stackIn_97_0 = stackOut_96_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Object) (Object) decompiledCaughtException;
          throw r.a((Throwable) var1, "bk.A(" + param0 + 41);
        }
        return (String) (Object) stackIn_97_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Open in popup window";
        field_d = "you lost 1 fleet in the attack";
        field_b = new String[16];
        field_a = new pf();
    }
}

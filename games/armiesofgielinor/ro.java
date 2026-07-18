/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ro extends pt implements he {
    private rj field_tb;
    private boolean field_sb;
    static String field_kb;
    private boolean field_wb;
    static v field_ob;
    private boolean field_mb;
    static int field_pb;
    static int[] field_lb;
    private boolean field_qb;
    static String field_vb;
    static int field_ub;
    static ru[] field_rb;
    private ka field_nb;

    final static void a(tc param0, tc param1, boolean param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_j != null) {
                param1.d(76);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param1.field_j = param0;
              param1.field_b = param0.field_b;
              param1.field_j.field_b = param1;
              param1.field_b.field_j = param1;
              if (param2) {
                break L2;
              } else {
                ro.a((tc) null, (tc) null, false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ro.SA(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == -12215) {
                break L1;
              } else {
                field_pb = 103;
                break L1;
              }
            }
            if (param1 != 13) {
              stackOut_6_0 = super.a(param0, param1, param2, -12215);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              ((ro) this).b(true);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ro.F(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    ro(gk param0, ka param1, String param2, boolean param3, boolean param4) {
        super(param0, (kb) (Object) new ad((ro) null, param1, param2), 77, 10, 10);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            ((ro) this).field_qb = false;
            ((ro) this).field_mb = param3;
            ((ro) this).field_wb = false;
            ((ro) this).field_sb = param4;
            ((ro) this).field_nb = param1;
            ((ro) this).field_tb = new rj(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ro) this).field_tb.field_R = true;
            ((ro) this).a((byte) 10, (kb) (Object) ((ro) this).field_tb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ro.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((ro) this).field_L) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_rb = null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  ((ro) this).field_L = false;
                  if (!((ro) this).field_mb) {
                    break L3;
                  } else {
                    ns.d((byte) 83);
                    if (!ArmiesOfGielinor.field_M) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((ro) this).field_sb) {
                  break L2;
                } else {
                  of.d((byte) -24);
                  break L2;
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
          throw ig.a((Throwable) (Object) var2, "ro.MA(" + param0 + ')');
        }
    }

    public static void n(int param0) {
        field_lb = null;
        field_ob = null;
        field_rb = null;
        if (param0 != 0) {
            return;
        }
        try {
            field_kb = null;
            field_vb = null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ro.IA(" + param0 + ')');
        }
    }

    final static boolean b(int param0, byte param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_47_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_100_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_46_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_57_0 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 1;
              if (cu.field_c) {
                break L1;
              } else {
                if (null != eu.field_g) {
                  break L1;
                } else {
                  var3_int = 0;
                  break L1;
                }
              }
            }
            L2: {
              if (0 != rs.field_t) {
                break L2;
              } else {
                if (null == no.field_K) {
                  break L2;
                } else {
                  var3_int = 0;
                  break L2;
                }
              }
            }
            L3: {
              if (rs.field_t != 2) {
                break L3;
              } else {
                if (!vu.j(6)) {
                  var3_int = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (rs.field_q == 84) {
              L4: {
                L5: {
                  if (var3_int != 0) {
                    break L5;
                  } else {
                    if (0 == rs.field_t) {
                      break L4;
                    } else {
                      rd.b(8445);
                      if (var11 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  if (qj.field_C.length() <= 0) {
                    break L6;
                  } else {
                    L7: {
                      var4_ref_String = qj.field_C.toString();
                      if (kg.a(var4_ref_String, param1 + 134)) {
                        break L7;
                      } else {
                        L8: {
                          var5 = rs.field_t;
                          if (var5 != 0) {
                            break L8;
                          } else {
                            if (null != vu.field_M) {
                              var5 = 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (kp.a(var5, param1 ^ -97) != 2) {
                            break L9;
                          } else {
                            ud.b(1, false, var5, param2);
                            break L9;
                          }
                        }
                        it.a(-1, -83, rs.field_t, qd.field_G, param0, var4_ref_String);
                        if (var11 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    ta.a((String) null, 2, -18119, (String) null, rl.field_y, 0);
                    ta.a((String) null, 2, -18119, (String) null, g.field_a, 0);
                    break L6;
                  }
                }
                rd.b(8445);
                break L4;
              }
              stackOut_46_0 = 1;
              stackIn_47_0 = stackOut_46_0;
              return stackIn_47_0 != 0;
            } else {
              if (85 != rs.field_q) {
                var4 = ui.field_i;
                if (!uu.a(true, (char) var4)) {
                  if (param1 == -59) {
                    stackOut_99_0 = 0;
                    stackIn_100_0 = stackOut_99_0;
                    break L0;
                  } else {
                    stackOut_97_0 = 0;
                    stackIn_98_0 = stackOut_97_0;
                    return stackIn_98_0 != 0;
                  }
                } else {
                  L10: {
                    if (var3_int == 0) {
                      break L10;
                    } else {
                      if (qj.field_C.length() < 80) {
                        L11: {
                          L12: {
                            StringBuilder discarded$3 = qj.field_C.append((char) var4);
                            var5 = 485;
                            var6 = mv.field_d;
                            var6 = nt.a(param1 + -47, var6);
                            if (rs.field_t == 2) {
                              break L12;
                            } else {
                              L13: {
                                var7 = "";
                                if (0 == rs.field_t) {
                                  L14: {
                                    if (null != vu.field_M) {
                                      break L14;
                                    } else {
                                      if (!bq.field_c) {
                                        break L14;
                                      } else {
                                        var7 = "[" + sa.field_c + "] ";
                                        break L14;
                                      }
                                    }
                                  }
                                  if (vu.field_M == null) {
                                    break L13;
                                  } else {
                                    L15: {
                                      if (!mt.field_f) {
                                        break L15;
                                      } else {
                                        if (ur.field_C == null) {
                                          break L15;
                                        } else {
                                          var7 = "[" + ur.field_C + "] ";
                                          if (var11 == 0) {
                                            break L13;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    var7 = "[" + fo.a(param1 ^ -4859, cv.field_m, new String[1]) + "] ";
                                    break L13;
                                  }
                                } else {
                                  break L13;
                                }
                              }
                              var7 = var7 + var6 + ": ";
                              var5 = var5 - tc.field_e.a(var7);
                              if (var11 == 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L16: {
                            var7 = fo.a(4800, ta.field_Q, new String[1]);
                            var8 = fo.a(4800, ov.field_l, new String[1]);
                            var9 = tc.field_e.a(var7);
                            var10 = tc.field_e.a(var8);
                            if (~var9 >= ~var10) {
                              break L16;
                            } else {
                              var5 = var5 - var9;
                              if (var11 == 0) {
                                break L11;
                              } else {
                                break L16;
                              }
                            }
                          }
                          var5 = var5 - var10;
                          break L11;
                        }
                        if (~tc.field_e.a(qj.field_C.toString()) < ~var5) {
                          StringBuilder discarded$4 = up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                          break L10;
                        } else {
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                  }
                  stackOut_94_0 = 1;
                  stackIn_95_0 = stackOut_94_0;
                  return stackIn_95_0 != 0;
                }
              } else {
                L17: {
                  if (var3_int == 0) {
                    break L17;
                  } else {
                    if (qj.field_C.length() <= 0) {
                      break L17;
                    } else {
                      StringBuilder discarded$5 = up.a(' ', -1 + qj.field_C.length(), qj.field_C, true);
                      break L17;
                    }
                  }
                }
                stackOut_57_0 = 1;
                stackIn_58_0 = stackOut_57_0;
                return stackIn_58_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "ro.TA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_100_0 != 0;
    }

    public void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((ro) this).field_wb) {
                  break L2;
                } else {
                  ra.a(ag.d((byte) -125), -113, "tochangedisplayname.ws");
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              gl.a(122, 3);
              ((ro) this).b(true);
              break L1;
            }
            L3: {
              if (param1 == 11) {
                break L3;
              } else {
                ro.n(46);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("ro.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final void o(int param0) {
        ad var2 = null;
        if (param0 != 4259) {
            return;
        }
        try {
            ((ro) this).field_tb.c(4210752, 2121792, 27178);
            var2 = new ad((ro) this, ((ro) this).field_nb, va.field_B);
            var2.a(sa.field_b, 15, 1);
            ((ro) this).a((kb) (Object) var2, (byte) -108);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ro.PA(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1, String param2) {
        RuntimeException var4 = null;
        ad var4_ref = null;
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ad stackIn_16_0 = null;
        ad stackIn_18_0 = null;
        ad stackIn_20_0 = null;
        ad stackIn_21_0 = null;
        String stackIn_21_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ad stackOut_15_0 = null;
        ad stackOut_20_0 = null;
        String stackOut_20_1 = null;
        ad stackOut_16_0 = null;
        ad stackOut_18_0 = null;
        String stackOut_18_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (((ro) this).field_qb) {
              return;
            } else {
              L1: {
                ((ro) this).field_qb = true;
                stackOut_4_0 = this;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (param0 != 256) {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_8_1 = stackOut_5_1;
                  break L1;
                }
              }
              L2: {
                L3: {
                  ((ro) this).field_wb = stackIn_8_1 != 0;
                  ((ro) this).field_tb.c(4210752, 8405024, 27178);
                  var4_ref = new ad((ro) this, ((ro) this).field_nb, param2);
                  if (5 == param0) {
                    break L3;
                  } else {
                    L4: {
                      if (param0 != 256) {
                        break L4;
                      } else {
                        fw discarded$2 = var4_ref.a(a.field_k, (qo) this, (byte) -89);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      stackOut_15_0 = (ad) var4_ref;
                      stackIn_20_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (((ro) this).field_mb) {
                        stackOut_20_0 = (ad) (Object) stackIn_20_0;
                        stackOut_20_1 = a.field_k;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        break L5;
                      } else {
                        stackOut_16_0 = (ad) (Object) stackIn_16_0;
                        stackIn_18_0 = stackOut_16_0;
                        stackOut_18_0 = (ad) (Object) stackIn_18_0;
                        stackOut_18_1 = fj.field_a;
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        break L5;
                      }
                    }
                    ((ad) (Object) stackIn_21_0).a(stackIn_21_1, -1, param1 ^ 99);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var4_ref.a(me.field_d, 11, 1);
                var4_ref.a(dt.field_c, 17, param1 ^ 99);
                break L2;
              }
              L6: {
                L7: {
                  if (param0 == 3) {
                    break L7;
                  } else {
                    L8: {
                      if (param0 != 4) {
                        break L8;
                      } else {
                        var4_ref.a(nf.field_Jb, 8, 1);
                        if (var5 == 0) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (param0 != 6) {
                        break L9;
                      } else {
                        var4_ref.a(ag.field_O, 9, 1);
                        if (var5 == 0) {
                          break L6;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (param0 != 9) {
                      break L6;
                    } else {
                      fw discarded$3 = var4_ref.a(iu.field_b, (qo) this, (byte) -55);
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var4_ref.a(te.field_m, 7, 1);
                break L6;
              }
              ((ro) this).a((kb) (Object) var4_ref, param1);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var4;
            stackOut_47_1 = new StringBuilder().append("ro.KA(").append(param0).append(',').append(param1).append(',');
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param2 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L10;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_kb = "Continue";
        field_ub = 0;
    }
}

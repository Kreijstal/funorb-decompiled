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
        Object var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
                var4 = null;
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
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ro.SA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
              stackOut_5_0 = super.a(param0, param1, param2, -12215);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              ((ro) this).b(true);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ro.F(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    ro(gk param0, ka param1, String param2, boolean param3, boolean param4) {
        super(param0, (kb) (Object) new ad((ro) null, param1, param2), 77, 10, 10);
        try {
            ((ro) this).field_qb = false;
            ((ro) this).field_mb = param3 ? true : false;
            ((ro) this).field_wb = false;
            ((ro) this).field_sb = param4 ? true : false;
            ((ro) this).field_nb = param1;
            ((ro) this).field_tb = new rj(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ro) this).field_tb.field_R = true;
            ((ro) this).a((byte) 10, (kb) (Object) ((ro) this).field_tb);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ro.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(boolean param0) {
        if (((ro) this).field_L) {
          if (param0) {
            ((ro) this).field_L = false;
            if (!((ro) this).field_mb) {
              if (((ro) this).field_sb) {
                of.d((byte) -24);
                return;
              } else {
                return;
              }
            } else {
              int discarded$4 = 83;
              ns.d();
              return;
            }
          } else {
            field_rb = null;
            ((ro) this).field_L = false;
            if (!((ro) this).field_mb) {
              if (!((ro) this).field_sb) {
                return;
              } else {
                of.d((byte) -24);
                return;
              }
            } else {
              int discarded$5 = 83;
              ns.d();
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void n(int param0) {
        field_lb = null;
        field_ob = null;
        field_rb = null;
        if (param0 != 0) {
            return;
        }
        field_kb = null;
        field_vb = null;
    }

    final static boolean b(int param0, byte param1, int param2) {
        int var3 = 0;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        Object var17 = null;
        Object var18 = null;
        CharSequence var19 = null;
        CharSequence var20 = null;
        L0: {
          var17 = null;
          var18 = null;
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = 1;
          if (cu.field_c) {
            break L0;
          } else {
            if (null != eu.field_g) {
              break L0;
            } else {
              var3 = 0;
              break L0;
            }
          }
        }
        L1: {
          if (0 != rs.field_t) {
            break L1;
          } else {
            if (null == no.field_K) {
              break L1;
            } else {
              var3 = 0;
              break L1;
            }
          }
        }
        if (rs.field_t == 2) {
          L2: {
            int discarded$21 = 6;
            if (!vu.j()) {
              var3 = 0;
              break L2;
            } else {
              break L2;
            }
          }
          if (rs.field_q == 84) {
            if (var3 != 0) {
              if (qj.field_C.length() <= 0) {
                rd.b(8445);
                return true;
              } else {
                var4_ref_String = qj.field_C.toString();
                var7 = var4_ref_String;
                var7 = var4_ref_String;
                int discarded$22 = 75;
                if (kg.a(var4_ref_String)) {
                  int discarded$23 = 0;
                  ta.a((String) null, 2, -18119, (String) null, rl.field_y);
                  int discarded$24 = 0;
                  ta.a((String) null, 2, -18119, (String) null, g.field_a);
                  rd.b(8445);
                  return true;
                } else {
                  L3: {
                    var5 = rs.field_t;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (null != vu.field_M) {
                        var5 = 1;
                        break L3;
                      } else {
                        L4: {
                          if (kp.a(var5, 90) != 2) {
                            it.a(-1, -83, rs.field_t, qd.field_G, param0, var4_ref_String);
                            rd.b(8445);
                            break L4;
                          } else {
                            ud.b(1, false, var5, param2);
                            it.a(-1, -83, rs.field_t, qd.field_G, param0, var4_ref_String);
                            rd.b(8445);
                            break L4;
                          }
                        }
                        return true;
                      }
                    }
                  }
                  if (kp.a(var5, 90) != 2) {
                    it.a(-1, -83, rs.field_t, qd.field_G, param0, var4_ref_String);
                    rd.b(8445);
                    return true;
                  } else {
                    ud.b(1, false, var5, param2);
                    it.a(-1, -83, rs.field_t, qd.field_G, param0, var4_ref_String);
                    rd.b(8445);
                    return true;
                  }
                }
              }
            } else {
              if (0 != rs.field_t) {
                rd.b(8445);
                return true;
              } else {
                return true;
              }
            }
          } else {
            if (85 != rs.field_q) {
              var4 = ui.field_i;
              if (!uu.a(true, (char) var4)) {
                return false;
              } else {
                L5: {
                  if (var3 == 0) {
                    break L5;
                  } else {
                    if (qj.field_C.length() < 80) {
                      StringBuilder discarded$25 = qj.field_C.append((char) var4);
                      var5 = 485;
                      var13 = mv.field_d;
                      var7 = var13;
                      var7 = var13;
                      var12 = nt.a(-106, var13);
                      var7 = var12;
                      var7 = var12;
                      var14 = var12;
                      var7 = var14;
                      var7 = var14;
                      if (rs.field_t == 2) {
                        var20 = (CharSequence) (Object) qd.field_G;
                        var16 = fo.a(4800, ta.field_Q, new String[1]);
                        var8 = fo.a(4800, ov.field_l, new String[1]);
                        var9 = tc.field_e.a(var16);
                        var10 = tc.field_e.a(var8);
                        if (~var9 >= ~var10) {
                          var5 = var5 - var10;
                          if (~tc.field_e.a(qj.field_C.toString()) < ~var5) {
                            StringBuilder discarded$26 = up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                            break L5;
                          } else {
                            return true;
                          }
                        } else {
                          L6: {
                            var5 = var5 - var9;
                            if (~tc.field_e.a(qj.field_C.toString()) < ~var5) {
                              StringBuilder discarded$27 = up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          return true;
                        }
                      } else {
                        var7 = "";
                        if (0 == rs.field_t) {
                          L7: {
                            if (null != vu.field_M) {
                              break L7;
                            } else {
                              if (!bq.field_c) {
                                break L7;
                              } else {
                                var7 = "[" + sa.field_c + "] ";
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (vu.field_M == null) {
                              break L8;
                            } else {
                              L9: {
                                if (!mt.field_f) {
                                  break L9;
                                } else {
                                  if (ur.field_C == null) {
                                    break L9;
                                  } else {
                                    L10: {
                                      var7 = "[" + ur.field_C + "] ";
                                      var15 = var7 + var14 + ": ";
                                      var5 = var5 - tc.field_e.a(var15);
                                      if (~tc.field_e.a(qj.field_C.toString()) < ~var5) {
                                        StringBuilder discarded$28 = up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    return true;
                                  }
                                }
                              }
                              var7 = "[" + fo.a(4800, cv.field_m, new String[1]) + "] ";
                              break L8;
                            }
                          }
                          L11: {
                            var15 = var7 + var14 + ": ";
                            var5 = var5 - tc.field_e.a(var15);
                            if (~tc.field_e.a(qj.field_C.toString()) < ~var5) {
                              StringBuilder discarded$29 = up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          return true;
                        } else {
                          L12: {
                            var15 = var7 + var14 + ": ";
                            var7 = var15;
                            var7 = var15;
                            var5 = var5 - tc.field_e.a(var15);
                            if (~tc.field_e.a(qj.field_C.toString()) < ~var5) {
                              StringBuilder discarded$30 = up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          return true;
                        }
                      }
                    } else {
                      return true;
                    }
                  }
                }
                return true;
              }
            } else {
              L13: {
                if (var3 == 0) {
                  break L13;
                } else {
                  if (qj.field_C.length() <= 0) {
                    break L13;
                  } else {
                    StringBuilder discarded$31 = up.a(' ', -1 + qj.field_C.length(), qj.field_C, true);
                    return true;
                  }
                }
              }
              return true;
            }
          }
        } else {
          if (rs.field_q == 84) {
            L14: {
              if (var3 != 0) {
                if (qj.field_C.length() <= 0) {
                  rd.b(8445);
                  break L14;
                } else {
                  var4_ref_String = qj.field_C.toString();
                  int discarded$32 = 75;
                  if (kg.a(var4_ref_String)) {
                    int discarded$33 = 0;
                    ta.a((String) null, 2, -18119, (String) null, rl.field_y);
                    int discarded$34 = 0;
                    ta.a((String) null, 2, -18119, (String) null, g.field_a);
                    rd.b(8445);
                    break L14;
                  } else {
                    L15: {
                      var5 = rs.field_t;
                      if (var5 != 0) {
                        break L15;
                      } else {
                        if (null != vu.field_M) {
                          var5 = 1;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (kp.a(var5, 90) != 2) {
                      it.a(-1, -83, rs.field_t, qd.field_G, param0, var4_ref_String);
                      rd.b(8445);
                      break L14;
                    } else {
                      ud.b(1, false, var5, param2);
                      it.a(-1, -83, rs.field_t, qd.field_G, param0, var4_ref_String);
                      rd.b(8445);
                      break L14;
                    }
                  }
                }
              } else {
                if (0 == rs.field_t) {
                  break L14;
                } else {
                  rd.b(8445);
                  break L14;
                }
              }
            }
            return true;
          } else {
            if (85 != rs.field_q) {
              var4 = ui.field_i;
              if (!uu.a(true, (char) var4)) {
                return false;
              } else {
                L16: {
                  if (var3 == 0) {
                    break L16;
                  } else {
                    if (qj.field_C.length() < 80) {
                      StringBuilder discarded$35 = qj.field_C.append((char) var4);
                      var5 = 485;
                      var13 = mv.field_d;
                      var7 = var13;
                      var7 = var13;
                      var12 = nt.a(-106, var13);
                      var7 = var12;
                      var7 = var12;
                      var14 = var12;
                      var7 = var14;
                      var7 = var14;
                      if (rs.field_t == 2) {
                        var19 = (CharSequence) (Object) qd.field_G;
                        var16 = fo.a(4800, ta.field_Q, new String[1]);
                        var7 = var16;
                        var7 = var16;
                        var8 = fo.a(4800, ov.field_l, new String[1]);
                        var7 = var8;
                        var7 = var8;
                        var9 = tc.field_e.a(var16);
                        var10 = tc.field_e.a(var8);
                        if (~var9 >= ~var10) {
                          var5 = var5 - var10;
                          if (~tc.field_e.a(qj.field_C.toString()) < ~var5) {
                            StringBuilder discarded$36 = up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                            break L16;
                          } else {
                            return true;
                          }
                        } else {
                          L17: {
                            var5 = var5 - var9;
                            if (~tc.field_e.a(qj.field_C.toString()) < ~var5) {
                              StringBuilder discarded$37 = up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          return true;
                        }
                      } else {
                        var7 = "";
                        if (0 == rs.field_t) {
                          L18: {
                            if (null != vu.field_M) {
                              break L18;
                            } else {
                              if (!bq.field_c) {
                                break L18;
                              } else {
                                var7 = "[" + sa.field_c + "] ";
                                break L18;
                              }
                            }
                          }
                          L19: {
                            if (vu.field_M == null) {
                              break L19;
                            } else {
                              if (!mt.field_f) {
                                var7 = "[" + fo.a(4800, cv.field_m, new String[1]) + "] ";
                                break L19;
                              } else {
                                if (ur.field_C == null) {
                                  var7 = "[" + fo.a(4800, cv.field_m, new String[1]) + "] ";
                                  break L19;
                                } else {
                                  L20: {
                                    var7 = "[" + ur.field_C + "] ";
                                    var15 = var7 + var14 + ": ";
                                    var5 = var5 - tc.field_e.a(var15);
                                    if (~tc.field_e.a(qj.field_C.toString()) < ~var5) {
                                      StringBuilder discarded$38 = up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  return true;
                                }
                              }
                            }
                          }
                          L21: {
                            var15 = var7 + var14 + ": ";
                            var7 = var15;
                            var7 = var15;
                            var5 = var5 - tc.field_e.a(var15);
                            if (~tc.field_e.a(qj.field_C.toString()) < ~var5) {
                              StringBuilder discarded$39 = up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          return true;
                        } else {
                          L22: {
                            var15 = var7 + var14 + ": ";
                            var7 = var15;
                            var7 = var15;
                            var5 = var5 - tc.field_e.a(var15);
                            if (~tc.field_e.a(qj.field_C.toString()) < ~var5) {
                              StringBuilder discarded$40 = up.a(' ', qj.field_C.length() - 1, qj.field_C, true);
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          return true;
                        }
                      }
                    } else {
                      return true;
                    }
                  }
                }
                return true;
              }
            } else {
              L23: {
                if (var3 == 0) {
                  break L23;
                } else {
                  if (qj.field_C.length() <= 0) {
                    break L23;
                  } else {
                    StringBuilder discarded$41 = up.a(' ', -1 + qj.field_C.length(), qj.field_C, true);
                    return true;
                  }
                }
              }
              return true;
            }
          }
        }
    }

    public void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (((ro) this).field_wb) {
                gl.a(122, 3);
                ((ro) this).b(true);
                break L1;
              } else {
                ra.a(ag.d((byte) -125), -113, "tochangedisplayname.ws");
                break L1;
              }
            }
            L2: {
              if (param1 == 11) {
                break L2;
              } else {
                ro.n(46);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("ro.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void o(int param0) {
        ad var2 = null;
        if (param0 != 4259) {
          return;
        } else {
          ((ro) this).field_tb.c(4210752, 2121792, 27178);
          var2 = new ad((ro) this, ((ro) this).field_nb, va.field_B);
          var2.a(sa.field_b, 15, 1);
          ((ro) this).a((kb) (Object) var2, (byte) -108);
          return;
        }
    }

    final void a(int param0, byte param1, String param2) {
        RuntimeException var4 = null;
        ad var4_ref = null;
        int var5 = 0;
        ad var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ad stackIn_11_0 = null;
        ad stackIn_12_0 = null;
        ad stackIn_13_0 = null;
        String stackIn_13_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ad stackOut_10_0 = null;
        ad stackOut_12_0 = null;
        String stackOut_12_1 = null;
        ad stackOut_11_0 = null;
        String stackOut_11_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (((ro) this).field_qb) {
              return;
            } else {
              L1: {
                ((ro) this).field_qb = true;
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (param0 != 256) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              L2: {
                ((ro) this).field_wb = stackIn_7_1 != 0;
                ((ro) this).field_tb.c(4210752, 8405024, 27178);
                var6 = new ad((ro) this, ((ro) this).field_nb, param2);
                var4_ref = var6;
                if (5 == param0) {
                  var6.a(me.field_d, 11, 1);
                  var6.a(dt.field_c, 17, param1 ^ 99);
                  break L2;
                } else {
                  if (param0 != 256) {
                    L3: {
                      stackOut_10_0 = (ad) var6;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (((ro) this).field_mb) {
                        stackOut_12_0 = (ad) (Object) stackIn_12_0;
                        stackOut_12_1 = a.field_k;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L3;
                      } else {
                        stackOut_11_0 = (ad) (Object) stackIn_11_0;
                        stackOut_11_1 = fj.field_a;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L3;
                      }
                    }
                    ((ad) (Object) stackIn_13_0).a(stackIn_13_1, -1, param1 ^ 99);
                    break L2;
                  } else {
                    fw discarded$2 = var6.a(a.field_k, (qo) this, (byte) -89);
                    break L2;
                  }
                }
              }
              L4: {
                if (param0 == 3) {
                  var6.a(te.field_m, 7, 1);
                  break L4;
                } else {
                  if (param0 != 4) {
                    if (param0 != 6) {
                      if (param0 != 9) {
                        break L4;
                      } else {
                        fw discarded$3 = var6.a(iu.field_b, (qo) this, (byte) -55);
                        break L4;
                      }
                    } else {
                      var6.a(ag.field_O, 9, 1);
                      break L4;
                    }
                  } else {
                    var6.a(nf.field_Jb, 8, 1);
                    break L4;
                  }
                }
              }
              ((ro) this).a((kb) (Object) var6, param1);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("ro.KA(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
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

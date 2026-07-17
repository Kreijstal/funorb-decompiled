/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static String field_g;
    static ie field_f;
    static String field_e;
    static mh field_a;
    static String[] field_c;
    static mh field_d;
    static tb field_b;

    final static gb a(int param0, int param1, int param2, int param3) {
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        gb var8_ref_gb = null;
        int var8 = 0;
        int var9 = 0;
        gb var9_ref_gb = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        boolean stackIn_3_0 = false;
        int stackIn_22_0 = 0;
        Object stackIn_25_0 = null;
        mh stackIn_25_1 = null;
        Object stackIn_41_0 = null;
        mh stackIn_41_1 = null;
        int stackIn_49_0 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_21_0 = 0;
        Object stackOut_24_0 = null;
        mh stackOut_24_1 = null;
        Object stackOut_40_0 = null;
        mh stackOut_40_1 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        var13 = BrickABrac.field_J ? 1 : 0;
        var4 = null;
        i.field_q.field_Rb.field_bb.c((byte) -61);
        var5 = 0;
        var6 = 0;
        var7 = -1 + mm.field_Sb;
        L0: while (true) {
          L1: {
            L2: {
              if (var7 < 0) {
                break L2;
              } else {
                var8_ref_gb = jk.field_s[var7];
                var9 = 0;
                stackOut_2_0 = um.field_e;
                stackIn_22_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var13 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0) {
                      break L3;
                    } else {
                      if (var5 >= eh.field_k) {
                        break L3;
                      } else {
                        var10_int = tm.a(var8_ref_gb.field_c, (byte) 18);
                        if (var10_int <= var8_ref_gb.a(true)) {
                          L4: {
                            if (var8_ref_gb.field_e) {
                              break L4;
                            } else {
                              if (!af.a(125, var8_ref_gb.field_m)) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var9 = 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var9 == 0) {
                        break L6;
                      } else {
                        L7: {
                          var5++;
                          if (var8_ref_gb.field_b == null) {
                            break L7;
                          } else {
                            if (oi.field_d) {
                              break L7;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L8: {
                          if (null == var8_ref_gb.field_b) {
                            on.field_E = on.field_E + 1;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var10 = kq.a(var8_ref_gb, (byte) 91);
                        var11 = var10 + dh.b(var8_ref_gb.field_j);
                        var12 = ik.a(-31126, var8_ref_gb);
                        var8_ref_gb.field_b = new mh(0L, field_a, var11);
                        var8_ref_gb.field_b.field_Fb = var12 + (-((var12 & 16711422) >> 1) + (field_a.field_Fb >> 1 & 8355711));
                        var8_ref_gb.field_b.field_Y = (field_a.field_Y >> 1 & 8355711) + -(8355711 & var12 >> 1) + var12;
                        var8_ref_gb.field_b.field_X = var12;
                        var8_ref_gb.field_b.field_O = jq.field_y;
                        var6 = var6 + param1;
                        if (var13 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var8_ref_gb.field_b = null;
                    break L5;
                  }
                  var7--;
                  if (var13 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var7 = 0;
            stackOut_21_0 = 0;
            stackIn_22_0 = stackOut_21_0;
            break L1;
          }
          var8 = stackIn_22_0;
          L9: while (true) {
            L10: {
              L11: {
                L12: {
                  if (mm.field_Sb <= var8) {
                    break L12;
                  } else {
                    var9_ref_gb = jk.field_s[var8];
                    stackOut_24_0 = null;
                    stackOut_24_1 = var9_ref_gb.field_b;
                    stackIn_41_0 = stackOut_24_0;
                    stackIn_41_1 = stackOut_24_1;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    if (var13 != 0) {
                      break L11;
                    } else {
                      L13: {
                        if (stackIn_25_0 != (Object) (Object) stackIn_25_1) {
                          L14: {
                            i.field_q.field_Rb.a(var9_ref_gb.field_b, 0);
                            var9_ref_gb.field_b.a(param1, var7, param0, var9_ref_gb.field_b.g(87), (byte) 64);
                            if (var9_ref_gb.field_b.field_L != 0) {
                              var4 = (Object) (Object) var9_ref_gb;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          var7 = var7 + param1;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      var8++;
                      if (var13 == 0) {
                        continue L9;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                L15: {
                  var8 = i.field_q.field_Rb.field_C + i.field_q.field_Rb.field_cb - (-var6 + var7);
                  i.field_q.field_Rb.field_cb = i.field_q.field_Rb.field_cb - var8;
                  i.field_q.field_Rb.field_zb = i.field_q.field_Rb.field_zb + var8;
                  if (oi.field_d) {
                    i.field_q.field_Rb.field_cb = var7;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  i.field_q.field_Rb.field_C = var7 - i.field_q.field_Rb.field_cb;
                  if (!oi.field_d) {
                    break L16;
                  } else {
                    oi.field_d = false;
                    i.field_q.field_Rb.field_zb = i.field_q.field_Qb.field_cb - i.field_q.field_Rb.field_cb;
                    nd.field_b = true;
                    i.field_q.field_Rb.field_Db = 0;
                    break L16;
                  }
                }
                L17: {
                  if (param2 == -13294) {
                    break L17;
                  } else {
                    field_d = null;
                    break L17;
                  }
                }
                if (!ld.field_s) {
                  break L10;
                } else {
                  stackOut_40_0 = null;
                  stackOut_40_1 = wp.field_k;
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  break L11;
                }
              }
              if (stackIn_41_0 != (Object) (Object) stackIn_41_1) {
                nd.field_b = true;
                break L10;
              } else {
                break L10;
              }
            }
            L18: {
              var9 = i.field_q.field_Qb.field_cb - (i.field_q.field_Rb.field_cb - -i.field_q.field_Rb.field_C);
              if (!nd.field_b) {
                break L18;
              } else {
                i.field_q.field_Rb.field_Db = var9 - i.field_q.field_Rb.field_zb;
                break L18;
              }
            }
            L19: {
              i.field_q.a(true, param1, true, 2 * (param1 * -79));
              if (var9 != i.field_q.field_Rb.field_Db + i.field_q.field_Rb.field_zb) {
                stackOut_48_0 = 0;
                stackIn_49_0 = stackOut_48_0;
                break L19;
              } else {
                stackOut_47_0 = 1;
                stackIn_49_0 = stackOut_47_0;
                break L19;
              }
            }
            nd.field_b = stackIn_49_0 != 0;
            return (gb) var4;
          }
        }
    }

    final static void a(java.applet.Applet param0, byte param1, String param2, String param3, long param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var6_ref2 = null;
            String var7 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              L0: {
                L1: {
                  if (param1 > 66) {
                    break L1;
                  } else {
                    gb discarded$1 = sj.a(-31, 62, -5, -79);
                    break L1;
                  }
                }
                try {
                  L2: {
                    L3: {
                      L4: {
                        var6_ref2 = param0.getParameter("cookiehost");
                        var7 = var6_ref2;
                        var7 = var6_ref2;
                        var7 = param3 + "=" + param2 + "; version=1; path=/; domain=" + var6_ref2;
                        if (0L > param4) {
                          break L4;
                        } else {
                          var7 = var7 + "; Expires=" + ke.a((byte) -75, ue.a(false) - -(param4 * 1000L)) + "; Max-Age=" + param4;
                          if (!BrickABrac.field_J) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var7 = var7 + "; Discard;";
                      break L3;
                    }
                    ne.a(param0, "document.cookie=\"" + var7 + "\"", 5797);
                    break L2;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var6 = decompiledCaughtException;
                    break L5;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var6_ref;
                stackOut_9_1 = new StringBuilder().append("sj.C(");
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param0 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L6;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L6;
                }
              }
              L7: {
                stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44);
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param2 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L7;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L7;
                }
              }
              L8: {
                stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param3 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L8;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L8;
                }
              }
              throw qb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        pi var1_ref = null;
        int var2 = 0;
        id var3_ref_id = null;
        long var3 = 0L;
        int var3_int = 0;
        om var4_ref_om = null;
        int var4 = 0;
        String var5 = null;
        int var5_int = 0;
        id var5_ref = null;
        String var6 = null;
        id var6_ref = null;
        om var6_ref2 = null;
        String var7 = null;
        id var7_ref = null;
        id var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        pi var13 = null;
        om var14 = null;
        om var15 = null;
        Object var16 = null;
        Object var17 = null;
        om var17_ref = null;
        Object var18 = null;
        Object var19 = null;
        om var20 = null;
        om var21 = null;
        id var22 = null;
        boolean stackIn_16_0 = false;
        int stackIn_24_0 = 0;
        id stackIn_143_0 = null;
        id stackIn_144_0 = null;
        id stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        int stackIn_172_0 = 0;
        id stackIn_177_0 = null;
        id stackIn_178_0 = null;
        id stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_15_0 = false;
        int stackOut_23_0 = 0;
        id stackOut_142_0 = null;
        id stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        id stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        int stackOut_171_0 = 0;
        int stackOut_170_0 = 0;
        id stackOut_176_0 = null;
        id stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        id stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        var16 = null;
        var19 = null;
        var17 = null;
        var18 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var13 = jl.field_e;
                  var1_ref = var13;
                  var2 = ((wq) (Object) var1_ref).l(255);
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (var2 == 1) {
                      break L3;
                    } else {
                      if (var2 == 2) {
                        break L3;
                      } else {
                        if (var2 == 3) {
                          break L3;
                        } else {
                          if (4 != var2) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_id = (id) (Object) mp.field_Tb.d(-8);
                L4: while (true) {
                  L5: {
                    L6: {
                      if (var3_ref_id == null) {
                        break L6;
                      } else {
                        var3_ref_id.b((byte) 111);
                        var3_ref_id.d(param0 + -30);
                        var3_ref_id = (id) (Object) mp.field_Tb.a((byte) 116);
                        if (var11 != 0) {
                          break L5;
                        } else {
                          if (var11 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    var3_ref_id = (id) (Object) eq.field_m.b((byte) 89);
                    break L5;
                  }
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (var3_ref_id == null) {
                          break L9;
                        } else {
                          stackOut_15_0 = var3_ref_id.field_Qb;
                          stackIn_24_0 = stackOut_15_0 ? 1 : 0;
                          stackIn_16_0 = stackOut_15_0;
                          if (var11 != 0) {
                            break L8;
                          } else {
                            L10: {
                              L11: {
                                if (stackIn_16_0) {
                                  break L11;
                                } else {
                                  if (!var3_ref_id.field_fc) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                var3_ref_id.field_Qb = false;
                                if (!var3_ref_id.field_fc) {
                                  break L12;
                                } else {
                                  uf.field_c = uf.field_c - 1;
                                  var3_ref_id.field_fc = false;
                                  break L12;
                                }
                              }
                              wl.a(var3_ref_id, 17574);
                              break L10;
                            }
                            var3_ref_id = (id) (Object) eq.field_m.a(false);
                            if (var11 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      stackOut_23_0 = -2;
                      stackIn_24_0 = stackOut_23_0;
                      break L8;
                    }
                    L13: {
                      if (stackIn_24_0 != ~var2) {
                        break L13;
                      } else {
                        if (o.field_e == null) {
                          break L13;
                        } else {
                          pk.field_g = o.field_e.field_Fc;
                          break L13;
                        }
                      }
                    }
                    L14: {
                      L15: {
                        if (4 == var2) {
                          break L15;
                        } else {
                          o.field_e = null;
                          if (var11 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      var3_int = ((wq) (Object) var1_ref).i(65280);
                      o.field_e = new om(cq.field_p);
                      o.field_e.a((long)var3_int, -105);
                      eb.a(o.field_e, (wq) (Object) var1_ref, 0, false);
                      ic.field_b = 0L;
                      break L14;
                    }
                    L16: {
                      L17: {
                        if (var2 == 2) {
                          break L17;
                        } else {
                          if (3 == var2) {
                            break L17;
                          } else {
                            nl.field_f = null;
                            if (var11 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      if (null == nl.field_f) {
                        nl.field_f = new om(cq.field_p);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L18: {
                      if (var2 != 3) {
                        break L18;
                      } else {
                        fh.field_d = true;
                        var3_int = 0;
                        L19: while (true) {
                          L20: {
                            L21: {
                              if (var3_int >= rh.field_d.length) {
                                break L21;
                              } else {
                                rh.field_d[var3_int] = ((wq) (Object) var13).b(true);
                                var3_int++;
                                if (var11 != 0) {
                                  break L20;
                                } else {
                                  if (var11 == 0) {
                                    continue L19;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                            bb.field_e = ((wq) (Object) var1_ref).l(255);
                            mf.field_c = ((wq) (Object) var1_ref).l(param0 + 222);
                            break L20;
                          }
                          var3_int = 0;
                          L22: while (true) {
                            L23: {
                              if (var3_int >= lj.field_p.length) {
                                break L23;
                              } else {
                                lj.field_p[var3_int] = ((wq) (Object) var13).b(true);
                                var3_int++;
                                if (var11 != 0) {
                                  break L1;
                                } else {
                                  if (var11 == 0) {
                                    continue L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                    }
                    fh.field_d = false;
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L24: {
                if (var2 == 5) {
                  break L24;
                } else {
                  L25: {
                    if (var2 != 6) {
                      break L25;
                    } else {
                      L26: {
                        var3 = ((wq) (Object) var1_ref).g(param0 ^ -32735);
                        var5_int = ((wq) (Object) var1_ref).l(255);
                        var6_ref = ab.a((byte) 96, var3);
                        if (var6_ref != null) {
                          L27: {
                            if (var6_ref.field_fc) {
                              uf.field_c = uf.field_c - 1;
                              var6_ref.field_fc = false;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          L28: {
                            L29: {
                              if (var5_int == 0) {
                                break L29;
                              } else {
                                var6_ref.field_kc = var5_int;
                                var6_ref.field_ic = cm.field_o;
                                if (var11 == 0) {
                                  break L28;
                                } else {
                                  break L29;
                                }
                              }
                            }
                            var6_ref.b((byte) 111);
                            break L28;
                          }
                          var6_ref.d(param0 ^ 34);
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L25;
                      }
                    }
                  }
                  L30: {
                    if (var2 == 7) {
                      break L30;
                    } else {
                      L31: {
                        if (var2 != 8) {
                          break L31;
                        } else {
                          L32: {
                            var3_int = ((wq) (Object) var1_ref).i(65280);
                            var4_ref_om = (om) (Object) pn.field_i.a((long)var3_int, -1);
                            if (var4_ref_om != null) {
                              break L32;
                            } else {
                              var4_ref_om = new om(cq.field_p);
                              pn.field_i.a((long)var3_int, (tk) (Object) var4_ref_om, 47);
                              break L32;
                            }
                          }
                          eb.a(var4_ref_om, (wq) (Object) var1_ref, 0, true);
                          ic.a(true, var4_ref_om);
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L31;
                          }
                        }
                      }
                      L33: {
                        if (9 != var2) {
                          break L33;
                        } else {
                          L34: {
                            var3_int = ((wq) (Object) var1_ref).i(65280);
                            var4 = ((wq) (Object) var1_ref).l(255);
                            var15 = (om) (Object) pn.field_i.a((long)var3_int, -1);
                            if (var15 != null) {
                              L35: {
                                L36: {
                                  if (var4 == 0) {
                                    break L36;
                                  } else {
                                    var15.field_Zb = var4;
                                    var15.field_Wb = cm.field_o;
                                    if (var11 == 0) {
                                      break L35;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                var15.b((byte) 111);
                                break L35;
                              }
                              var15.d(3);
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L33;
                          }
                        }
                      }
                      L37: {
                        if (var2 != 10) {
                          break L37;
                        } else {
                          var20 = (om) (Object) rq.field_a.d(-62);
                          L38: while (true) {
                            L39: {
                              if (var20 == null) {
                                break L39;
                              } else {
                                var20.b((byte) 111);
                                var20.d(3);
                                var20 = (om) (Object) rq.field_a.a((byte) 116);
                                if (var11 != 0) {
                                  break L1;
                                } else {
                                  if (var11 == 0) {
                                    continue L38;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                            }
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L37;
                            }
                          }
                        }
                      }
                      L40: {
                        L41: {
                          if (var2 == 11) {
                            break L41;
                          } else {
                            if (var2 != 12) {
                              break L40;
                            } else {
                              break L41;
                            }
                          }
                        }
                        L42: {
                          var3_int = ((wq) (Object) var1_ref).i(65280);
                          var21 = (om) (Object) pn.field_i.a((long)var3_int, -1);
                          if (var21 == null) {
                            break L42;
                          } else {
                            L43: {
                              L44: {
                                if (var2 != 11) {
                                  break L44;
                                } else {
                                  var21.field_Pb = true;
                                  if (var11 == 0) {
                                    break L43;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              var21.field_dc = true;
                              break L43;
                            }
                            ic.a(true, var21);
                            break L42;
                          }
                        }
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L40;
                        }
                      }
                      L45: {
                        if (var2 == 13) {
                          break L45;
                        } else {
                          L46: {
                            L47: {
                              if (var2 == 14) {
                                break L47;
                              } else {
                                if (16 != var2) {
                                  break L46;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            L48: {
                              var3 = ((wq) (Object) var1_ref).g(param0 ^ -32735);
                              var5_ref = ab.a((byte) 96, var3);
                              if (var5_ref != null) {
                                L49: {
                                  L50: {
                                    if (var2 != 14) {
                                      break L50;
                                    } else {
                                      var5_ref.field_Qb = true;
                                      if (var11 == 0) {
                                        break L49;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                  if (!var5_ref.field_fc) {
                                    uf.field_c = uf.field_c + 1;
                                    var5_ref.field_fc = true;
                                    break L49;
                                  } else {
                                    break L49;
                                  }
                                }
                                wl.a(var5_ref, 17574);
                                break L48;
                              } else {
                                break L48;
                              }
                            }
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L46;
                            }
                          }
                          L51: {
                            if (var2 == 15) {
                              break L51;
                            } else {
                              if (var2 == 17) {
                                break L51;
                              } else {
                                L52: {
                                  if (18 == var2) {
                                    break L52;
                                  } else {
                                    L53: {
                                      if (var2 == 19) {
                                        break L53;
                                      } else {
                                        L54: {
                                          if (20 != var2) {
                                            break L54;
                                          } else {
                                            eb.a(o.field_e, (wq) (Object) var1_ref, 0, false);
                                            if (var11 == 0) {
                                              break L1;
                                            } else {
                                              break L54;
                                            }
                                          }
                                        }
                                        L55: {
                                          if (var2 == 21) {
                                            break L55;
                                          } else {
                                            L56: {
                                              if (22 != var2) {
                                                break L56;
                                              } else {
                                                m.field_h = ((wq) (Object) var1_ref).i(65280);
                                                ko.field_s = ((wq) (Object) var1_ref).c((byte) 119);
                                                if (var11 == 0) {
                                                  break L1;
                                                } else {
                                                  break L56;
                                                }
                                              }
                                            }
                                            L57: {
                                              if (var2 != 23) {
                                                break L57;
                                              } else {
                                                oc.field_p = ((wq) (Object) var1_ref).g(-32768);
                                                if (var11 == 0) {
                                                  break L1;
                                                } else {
                                                  break L57;
                                                }
                                              }
                                            }
                                            rk.a("L1: " + eq.c((byte) -121), (Throwable) null, 108);
                                            hn.a((byte) 84);
                                            if (var11 == 0) {
                                              break L1;
                                            } else {
                                              break L55;
                                            }
                                          }
                                        }
                                        L58: {
                                          L59: {
                                            var3_int = ((wq) (Object) var1_ref).i(65280);
                                            if (var3_int != 0) {
                                              break L59;
                                            } else {
                                              ic.field_b = 0L;
                                              if (var11 == 0) {
                                                break L58;
                                              } else {
                                                break L59;
                                              }
                                            }
                                          }
                                          ic.field_b = (long)var3_int + ue.a(false);
                                          break L58;
                                        }
                                        if (var11 == 0) {
                                          break L1;
                                        } else {
                                          break L53;
                                        }
                                      }
                                    }
                                    L60: {
                                      var3 = ((wq) (Object) var1_ref).g(-32768);
                                      var5_int = ((wq) (Object) var1_ref).l(255);
                                      var6_ref = ac.a(var3, 2);
                                      if (var6_ref != null) {
                                        L61: {
                                          L62: {
                                            if (0 == var5_int) {
                                              break L62;
                                            } else {
                                              var6_ref.field_ic = cm.field_o;
                                              var6_ref.field_kc = var5_int;
                                              if (var11 == 0) {
                                                break L61;
                                              } else {
                                                break L62;
                                              }
                                            }
                                          }
                                          var6_ref.b((byte) 111);
                                          break L61;
                                        }
                                        var6_ref.d(param0 + -30);
                                        o.field_e.field_cc = o.field_e.field_cc - 1;
                                        break L60;
                                      } else {
                                        break L60;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L1;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                                L63: {
                                  var3 = ((wq) (Object) var1_ref).g(-32768);
                                  var5 = ((wq) (Object) var1_ref).d(param0 + -34);
                                  var6 = ((wq) (Object) var1_ref).d(param0 + -34);
                                  var7_ref = ac.a(var3, 2);
                                  if (var7_ref != null) {
                                    break L63;
                                  } else {
                                    var7_ref = new id(var5, var6, var3);
                                    BrickABrac.field_F.a(var3, (tk) (Object) var7_ref, 48);
                                    o.field_e.field_cc = o.field_e.field_cc + 1;
                                    break L63;
                                  }
                                }
                                L64: {
                                  var7_ref.field_Wb = ((wq) (Object) var1_ref).i(65280);
                                  var8_int = ((wq) (Object) var1_ref).c((byte) 127);
                                  stackOut_142_0 = (id) var7_ref;
                                  stackIn_144_0 = stackOut_142_0;
                                  stackIn_143_0 = stackOut_142_0;
                                  if (0 == (var8_int & 1)) {
                                    stackOut_144_0 = (id) (Object) stackIn_144_0;
                                    stackOut_144_1 = 0;
                                    stackIn_145_0 = stackOut_144_0;
                                    stackIn_145_1 = stackOut_144_1;
                                    break L64;
                                  } else {
                                    stackOut_143_0 = (id) (Object) stackIn_143_0;
                                    stackOut_143_1 = 1;
                                    stackIn_145_0 = stackOut_143_0;
                                    stackIn_145_1 = stackOut_143_1;
                                    break L64;
                                  }
                                }
                                stackIn_145_0.field_ec = stackIn_145_1 != 0;
                                var7_ref.field_ac = var8_int >> 1;
                                var7_ref.field_Zb = ((wq) (Object) var1_ref).l(param0 ^ 222);
                                var7_ref.field_Ub = ((wq) (Object) var1_ref).l(param0 + 222);
                                mp.field_Tb.a((nm) (Object) var7_ref, (byte) 3);
                                if (var11 == 0) {
                                  break L1;
                                } else {
                                  break L51;
                                }
                              }
                            }
                          }
                          L65: {
                            var3 = ((wq) (Object) var1_ref).g(-32768);
                            var5_int = ((wq) (Object) var1_ref).l(param0 ^ 222);
                            var6_ref = ab.a((byte) 96, var3);
                            if (var6_ref == null) {
                              break L65;
                            } else {
                              L66: {
                                L67: {
                                  if (15 != var2) {
                                    break L67;
                                  } else {
                                    var6_ref.field_Qb = false;
                                    if (var11 == 0) {
                                      break L66;
                                    } else {
                                      break L67;
                                    }
                                  }
                                }
                                if (var6_ref.field_fc) {
                                  var6_ref.field_fc = false;
                                  uf.field_c = uf.field_c - 1;
                                  break L66;
                                } else {
                                  break L66;
                                }
                              }
                              L68: {
                                if (var5_int == 0) {
                                  break L68;
                                } else {
                                  var6_ref.field_ic = cm.field_o;
                                  var6_ref.field_kc = var5_int;
                                  break L68;
                                }
                              }
                              wl.a(var6_ref, 17574);
                              break L65;
                            }
                          }
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L45;
                          }
                        }
                      }
                      L69: {
                        var3_int = ((wq) (Object) var1_ref).i(65280);
                        var4 = ((wq) (Object) var1_ref).l(255);
                        var17_ref = (om) (Object) pn.field_i.a((long)var3_int, param0 + -34);
                        if (var17_ref == null) {
                          break L69;
                        } else {
                          L70: {
                            var14 = var17_ref;
                            var6_ref2 = var14;
                            var17_ref.field_dc = false;
                            var14.field_Pb = false;
                            if (var4 == 0) {
                              break L70;
                            } else {
                              var17_ref.field_Zb = var4;
                              var17_ref.field_Wb = cm.field_o;
                              break L70;
                            }
                          }
                          ic.a(true, var17_ref);
                          break L69;
                        }
                      }
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L30;
                      }
                    }
                  }
                  var22 = (id) (Object) ua.field_c.d(-61);
                  L71: while (true) {
                    L72: {
                      L73: {
                        if (var22 == null) {
                          break L73;
                        } else {
                          var22.b((byte) 111);
                          var22.d(3);
                          var22 = (id) (Object) ua.field_c.a((byte) 116);
                          if (var11 != 0) {
                            break L72;
                          } else {
                            if (var11 == 0) {
                              continue L71;
                            } else {
                              break L73;
                            }
                          }
                        }
                      }
                      uf.field_c = 0;
                      break L72;
                    }
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L24;
                    }
                  }
                }
              }
              L74: {
                var3 = ((wq) (Object) var1_ref).g(-32768);
                var5 = ((wq) (Object) var1_ref).d(-1);
                var6 = ((wq) (Object) var1_ref).d(-1);
                var7 = ((wq) (Object) var1_ref).d(-1);
                var8 = ab.a((byte) 96, var3);
                if (var6.equals((Object) (Object) "")) {
                  stackOut_171_0 = 0;
                  stackIn_172_0 = stackOut_171_0;
                  break L74;
                } else {
                  stackOut_170_0 = 1;
                  stackIn_172_0 = stackOut_170_0;
                  break L74;
                }
              }
              L75: {
                L76: {
                  var9 = stackIn_172_0;
                  if (var8 != null) {
                    break L76;
                  } else {
                    var8 = new id(var5, var7, var3);
                    eq.field_m.a(var3, (tk) (Object) var8, 86);
                    if (var11 == 0) {
                      break L75;
                    } else {
                      break L76;
                    }
                  }
                }
                if (var9 == 0) {
                  break L75;
                } else {
                  var8.a(var7, var5, (byte) -121);
                  break L75;
                }
              }
              L77: {
                var8.field_Xb = ue.a(false) - (long)((wq) (Object) var1_ref).e(255);
                var8.field_Wb = ((wq) (Object) var1_ref).i(65280);
                var10 = ((wq) (Object) var1_ref).c((byte) 110);
                var8.field_ac = var10 >> 1;
                stackOut_176_0 = (id) var8;
                stackIn_178_0 = stackOut_176_0;
                stackIn_177_0 = stackOut_176_0;
                if ((1 & var10) == 0) {
                  stackOut_178_0 = (id) (Object) stackIn_178_0;
                  stackOut_178_1 = 0;
                  stackIn_179_0 = stackOut_178_0;
                  stackIn_179_1 = stackOut_178_1;
                  break L77;
                } else {
                  stackOut_177_0 = (id) (Object) stackIn_177_0;
                  stackOut_177_1 = 1;
                  stackIn_179_0 = stackOut_177_0;
                  stackIn_179_1 = stackOut_177_1;
                  break L77;
                }
              }
              stackIn_179_0.field_ec = stackIn_179_1 != 0;
              var8.field_Zb = ((wq) (Object) var1_ref).l(255);
              var8.field_Ub = ((wq) (Object) var1_ref).l(255);
              wl.a(var8, 17574);
              break L1;
            }
            L78: {
              if (param0 == 33) {
                break L78;
              } else {
                sj.a((java.applet.Applet) null, (byte) -55, (String) null, (String) null, -27L);
                break L78;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "sj.A(" + param0 + 41);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != 11) {
            field_d = null;
        }
        field_g = null;
        field_b = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Remove <%0> from friend list";
        field_e = "Confuse: reverse the paddle's controls.";
    }
}

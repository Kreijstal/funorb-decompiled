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
        boolean stackIn_4_0 = false;
        int stackIn_38_0 = 0;
        Object stackIn_41_0 = null;
        mh stackIn_41_1 = null;
        Object stackIn_64_0 = null;
        mh stackIn_64_1 = null;
        int stackIn_74_0 = 0;
        Object stackIn_75_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_37_0 = 0;
        Object stackOut_40_0 = null;
        mh stackOut_40_1 = null;
        Object stackOut_62_0 = null;
        mh stackOut_62_1 = null;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        Object stackOut_74_0 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4 = null;
            i.field_q.field_Rb.field_bb.c((byte) -61);
            var5 = 0;
            var6 = 0;
            var7 = -1 + mm.field_Sb;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7 < 0) {
                    break L3;
                  } else {
                    var8_ref_gb = jk.field_s[var7];
                    var9 = 0;
                    stackOut_3_0 = um.field_e;
                    stackIn_38_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var13 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          break L4;
                        } else {
                          if (~var5 <= ~eh.field_k) {
                            break L4;
                          } else {
                            var10_int = tm.a(var8_ref_gb.field_c, (byte) 18);
                            if (~var10_int >= ~var8_ref_gb.a(true)) {
                              L5: {
                                if (var8_ref_gb.field_e) {
                                  break L5;
                                } else {
                                  if (!af.a(125, var8_ref_gb.field_m)) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var9 = 1;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      L6: {
                        L7: {
                          if (var9 == 0) {
                            break L7;
                          } else {
                            L8: {
                              var5++;
                              if (var8_ref_gb.field_b == null) {
                                break L8;
                              } else {
                                if (oi.field_d) {
                                  break L8;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L9: {
                              if (null == var8_ref_gb.field_b) {
                                on.field_E = on.field_E + 1;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var10 = kq.a(var8_ref_gb, (byte) 91);
                            var11 = var10 + dh.b(var8_ref_gb.field_j);
                            var12 = ik.a(-31126, var8_ref_gb);
                            var8_ref_gb.field_b = new mh(0L, field_a, var11);
                            var8_ref_gb.field_b.field_Fb = var12 + (-((var12 & 16711422) >> -1404152127) + (field_a.field_Fb >> -1654468767 & 8355711));
                            var8_ref_gb.field_b.field_Y = (field_a.field_Y >> 632761153 & 8355711) + -(8355711 & var12 >> 2038224449) + var12;
                            var8_ref_gb.field_b.field_X = var12;
                            var8_ref_gb.field_b.field_O = jq.field_y;
                            var6 = var6 + param1;
                            if (var13 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var8_ref_gb.field_b = null;
                        break L6;
                      }
                      var7--;
                      if (var13 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var7 = 0;
                stackOut_37_0 = 0;
                stackIn_38_0 = stackOut_37_0;
                break L2;
              }
              var8 = stackIn_38_0;
              L10: while (true) {
                L11: {
                  L12: {
                    L13: {
                      if (~mm.field_Sb >= ~var8) {
                        break L13;
                      } else {
                        var9_ref_gb = jk.field_s[var8];
                        stackOut_40_0 = null;
                        stackOut_40_1 = var9_ref_gb.field_b;
                        stackIn_64_0 = stackOut_40_0;
                        stackIn_64_1 = stackOut_40_1;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        if (var13 != 0) {
                          break L12;
                        } else {
                          L14: {
                            if (stackIn_41_0 != (Object) (Object) stackIn_41_1) {
                              L15: {
                                i.field_q.field_Rb.a(var9_ref_gb.field_b, 0);
                                var9_ref_gb.field_b.a(param1, var7, param0, var9_ref_gb.field_b.g(87), (byte) 64);
                                if (var9_ref_gb.field_b.field_L != 0) {
                                  var4 = (Object) (Object) var9_ref_gb;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              var7 = var7 + param1;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          var8++;
                          if (var13 == 0) {
                            continue L10;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    L16: {
                      var8 = i.field_q.field_Rb.field_C + i.field_q.field_Rb.field_cb - (-var6 + var7);
                      i.field_q.field_Rb.field_cb = i.field_q.field_Rb.field_cb - var8;
                      i.field_q.field_Rb.field_zb = i.field_q.field_Rb.field_zb + var8;
                      if (oi.field_d) {
                        i.field_q.field_Rb.field_cb = var7;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      i.field_q.field_Rb.field_C = var7 - i.field_q.field_Rb.field_cb;
                      if (!oi.field_d) {
                        break L17;
                      } else {
                        oi.field_d = false;
                        i.field_q.field_Rb.field_zb = i.field_q.field_Qb.field_cb - i.field_q.field_Rb.field_cb;
                        nd.field_b = true;
                        i.field_q.field_Rb.field_Db = 0;
                        break L17;
                      }
                    }
                    L18: {
                      if (param2 == -13294) {
                        break L18;
                      } else {
                        field_d = null;
                        break L18;
                      }
                    }
                    if (!ld.field_s) {
                      break L11;
                    } else {
                      stackOut_62_0 = null;
                      stackOut_62_1 = wp.field_k;
                      stackIn_64_0 = stackOut_62_0;
                      stackIn_64_1 = stackOut_62_1;
                      break L12;
                    }
                  }
                  if (stackIn_64_0 != (Object) (Object) stackIn_64_1) {
                    nd.field_b = true;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L19: {
                  var9 = i.field_q.field_Qb.field_cb - (i.field_q.field_Rb.field_cb - -i.field_q.field_Rb.field_C);
                  if (!nd.field_b) {
                    break L19;
                  } else {
                    i.field_q.field_Rb.field_Db = var9 - i.field_q.field_Rb.field_zb;
                    break L19;
                  }
                }
                L20: {
                  i.field_q.a(true, param1, true, 2 * (param1 * param3));
                  if (~var9 != ~(i.field_q.field_Rb.field_Db + i.field_q.field_Rb.field_zb)) {
                    stackOut_73_0 = 0;
                    stackIn_74_0 = stackOut_73_0;
                    break L20;
                  } else {
                    stackOut_71_0 = 1;
                    stackIn_74_0 = stackOut_71_0;
                    break L20;
                  }
                }
                nd.field_b = stackIn_74_0 != 0;
                stackOut_74_0 = var4;
                stackIn_75_0 = stackOut_74_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = (Object) (Object) decompiledCaughtException;
          throw qb.a((Throwable) var4, "sj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (gb) (Object) stackIn_75_0;
    }

    final static void a(java.applet.Applet param0, byte param1, String param2, String param3, long param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var6_ref2 = null;
            String var7 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
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
                stackOut_10_0 = (RuntimeException) var6_ref;
                stackOut_10_1 = new StringBuilder().append("sj.C(");
                stackIn_13_0 = stackOut_10_0;
                stackIn_13_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param0 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L6;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_14_0 = stackOut_11_0;
                  stackIn_14_1 = stackOut_11_1;
                  stackIn_14_2 = stackOut_11_2;
                  break L6;
                }
              }
              L7: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
                stackIn_17_0 = stackOut_14_0;
                stackIn_17_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L7;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_18_0 = stackOut_15_0;
                  stackIn_18_1 = stackOut_15_1;
                  stackIn_18_2 = stackOut_15_2;
                  break L7;
                }
              }
              L8: {
                stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
                stackIn_21_0 = stackOut_18_0;
                stackIn_21_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param3 == null) {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "null";
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L8;
                } else {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "{...}";
                  stackIn_22_0 = stackOut_19_0;
                  stackIn_22_1 = stackOut_19_1;
                  stackIn_22_2 = stackOut_19_2;
                  break L8;
                }
              }
              throw qb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        pi var1 = null;
        int var2 = 0;
        id var3_ref_id = null;
        int var3_int = 0;
        long var3 = 0L;
        om var3_ref_om = null;
        om var4_ref_om = null;
        int var4 = 0;
        String var5 = null;
        int var5_int = 0;
        om var5_ref = null;
        id var5_ref2 = null;
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
        boolean stackIn_17_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_28_0 = 0;
        id stackIn_169_0 = null;
        id stackIn_170_0 = null;
        id stackIn_171_0 = null;
        int stackIn_171_1 = 0;
        int stackIn_200_0 = 0;
        id stackIn_206_0 = null;
        id stackIn_207_0 = null;
        id stackIn_208_0 = null;
        int stackIn_208_1 = 0;
        boolean stackOut_16_0 = false;
        boolean stackOut_17_0 = false;
        int stackOut_27_0 = 0;
        id stackOut_168_0 = null;
        id stackOut_170_0 = null;
        int stackOut_170_1 = 0;
        id stackOut_169_0 = null;
        int stackOut_169_1 = 0;
        int stackOut_199_0 = 0;
        int stackOut_198_0 = 0;
        id stackOut_205_0 = null;
        id stackOut_207_0 = null;
        int stackOut_207_1 = 0;
        id stackOut_206_0 = null;
        int stackOut_206_1 = 0;
        L0: {
          L1: {
            L2: {
              var11 = BrickABrac.field_J ? 1 : 0;
              var1 = jl.field_e;
              var2 = ((wq) (Object) var1).l(255);
              if (var2 == 0) {
                break L2;
              } else {
                if (var2 == 1) {
                  break L2;
                } else {
                  if (var2 == 2) {
                    break L2;
                  } else {
                    if (var2 == 3) {
                      break L2;
                    } else {
                      if (4 != var2) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            var3_ref_id = (id) (Object) mp.field_Tb.d(-8);
            L3: while (true) {
              L4: {
                L5: {
                  if (null == var3_ref_id) {
                    break L5;
                  } else {
                    var3_ref_id.b((byte) 111);
                    var3_ref_id.d(param0 + -30);
                    var3_ref_id = (id) (Object) mp.field_Tb.a((byte) 116);
                    if (var11 != 0) {
                      break L4;
                    } else {
                      if (var11 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var3_ref_id = (id) (Object) eq.field_m.b((byte) 89);
                break L4;
              }
              L6: while (true) {
                L7: {
                  L8: {
                    if (null == var3_ref_id) {
                      break L8;
                    } else {
                      stackOut_16_0 = var3_ref_id.field_Qb;
                      stackIn_28_0 = stackOut_16_0 ? 1 : 0;
                      stackIn_17_0 = stackOut_16_0;
                      if (var11 != 0) {
                        break L7;
                      } else {
                        stackOut_17_0 = stackIn_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        L9: {
                          L10: {
                            if (stackIn_18_0) {
                              break L10;
                            } else {
                              if (!var3_ref_id.field_fc) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            var3_ref_id.field_Qb = false;
                            if (!var3_ref_id.field_fc) {
                              break L11;
                            } else {
                              uf.field_c = uf.field_c - 1;
                              var3_ref_id.field_fc = false;
                              break L11;
                            }
                          }
                          wl.a(var3_ref_id, 17574);
                          break L9;
                        }
                        var3_ref_id = (id) (Object) eq.field_m.a(false);
                        if (var11 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_27_0 = -2;
                  stackIn_28_0 = stackOut_27_0;
                  break L7;
                }
                L12: {
                  if (stackIn_28_0 != ~var2) {
                    break L12;
                  } else {
                    if (o.field_e == null) {
                      break L12;
                    } else {
                      pk.field_g = o.field_e.field_Fc;
                      break L12;
                    }
                  }
                }
                L13: {
                  L14: {
                    if (4 == var2) {
                      break L14;
                    } else {
                      o.field_e = null;
                      if (var11 == 0) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  var3_int = ((wq) (Object) var1).i(65280);
                  o.field_e = new om(cq.field_p);
                  o.field_e.a((long)var3_int, -105);
                  eb.a(o.field_e, (wq) (Object) var1, 0, false);
                  ic.field_b = 0L;
                  break L13;
                }
                L15: {
                  L16: {
                    if (var2 == 2) {
                      break L16;
                    } else {
                      if (3 == var2) {
                        break L16;
                      } else {
                        nl.field_f = null;
                        if (var11 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  if (null == nl.field_f) {
                    nl.field_f = new om(cq.field_p);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L17: {
                  if (var2 != 3) {
                    break L17;
                  } else {
                    fh.field_d = true;
                    var3_int = 0;
                    L18: while (true) {
                      L19: {
                        L20: {
                          if (var3_int >= rh.field_d.length) {
                            break L20;
                          } else {
                            rh.field_d[var3_int] = ((wq) (Object) var1).b(true);
                            var3_int++;
                            if (var11 != 0) {
                              break L19;
                            } else {
                              if (var11 == 0) {
                                continue L18;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        bb.field_e = ((wq) (Object) var1).l(255);
                        mf.field_c = ((wq) (Object) var1).l(param0 + 222);
                        break L19;
                      }
                      var3_int = 0;
                      L21: while (true) {
                        L22: {
                          if (var3_int >= lj.field_p.length) {
                            break L22;
                          } else {
                            lj.field_p[var3_int] = ((wq) (Object) var1).b(true);
                            var3_int++;
                            if (var11 != 0) {
                              break L0;
                            } else {
                              if (var11 == 0) {
                                continue L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                        if (var11 == 0) {
                          break L0;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                }
                fh.field_d = false;
                if (var11 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L23: {
            if (var2 == 5) {
              break L23;
            } else {
              L24: {
                if (var2 != 6) {
                  break L24;
                } else {
                  L25: {
                    var3 = ((wq) (Object) var1).g(param0 ^ -32735);
                    var5_int = ((wq) (Object) var1).l(255);
                    var6_ref = ab.a((byte) 96, var3);
                    if (var6_ref != null) {
                      L26: {
                        if (var6_ref.field_fc) {
                          uf.field_c = uf.field_c - 1;
                          var6_ref.field_fc = false;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      L27: {
                        L28: {
                          if (var5_int == 0) {
                            break L28;
                          } else {
                            var6_ref.field_kc = var5_int;
                            var6_ref.field_ic = cm.field_o;
                            if (var11 == 0) {
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                        var6_ref.b((byte) 111);
                        break L27;
                      }
                      var6_ref.d(param0 ^ 34);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  if (var11 == 0) {
                    break L0;
                  } else {
                    break L24;
                  }
                }
              }
              L29: {
                if (var2 == 7) {
                  break L29;
                } else {
                  L30: {
                    if (var2 != 8) {
                      break L30;
                    } else {
                      L31: {
                        var3_int = ((wq) (Object) var1).i(65280);
                        var4_ref_om = (om) (Object) pn.field_i.a((long)var3_int, -1);
                        if (null != var4_ref_om) {
                          break L31;
                        } else {
                          var4_ref_om = new om(cq.field_p);
                          pn.field_i.a((long)var3_int, (tk) (Object) var4_ref_om, 47);
                          break L31;
                        }
                      }
                      eb.a(var4_ref_om, (wq) (Object) var1, 0, true);
                      ic.a(true, var4_ref_om);
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L30;
                      }
                    }
                  }
                  L32: {
                    if (9 != var2) {
                      break L32;
                    } else {
                      L33: {
                        var3_int = ((wq) (Object) var1).i(65280);
                        var4 = ((wq) (Object) var1).l(255);
                        var5_ref = (om) (Object) pn.field_i.a((long)var3_int, -1);
                        if (null != var5_ref) {
                          L34: {
                            L35: {
                              if (var4 == 0) {
                                break L35;
                              } else {
                                var5_ref.field_Zb = var4;
                                var5_ref.field_Wb = cm.field_o;
                                if (var11 == 0) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            var5_ref.b((byte) 111);
                            break L34;
                          }
                          var5_ref.d(3);
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L32;
                      }
                    }
                  }
                  L36: {
                    if (var2 != 10) {
                      break L36;
                    } else {
                      var3_ref_om = (om) (Object) rq.field_a.d(-62);
                      L37: while (true) {
                        L38: {
                          if (var3_ref_om == null) {
                            break L38;
                          } else {
                            var3_ref_om.b((byte) 111);
                            var3_ref_om.d(3);
                            var3_ref_om = (om) (Object) rq.field_a.a((byte) 116);
                            if (var11 != 0) {
                              break L0;
                            } else {
                              if (var11 == 0) {
                                continue L37;
                              } else {
                                break L38;
                              }
                            }
                          }
                        }
                        if (var11 == 0) {
                          break L0;
                        } else {
                          break L36;
                        }
                      }
                    }
                  }
                  L39: {
                    L40: {
                      if (var2 == 11) {
                        break L40;
                      } else {
                        if (var2 != 12) {
                          break L39;
                        } else {
                          break L40;
                        }
                      }
                    }
                    L41: {
                      var3_int = ((wq) (Object) var1).i(65280);
                      var4_ref_om = (om) (Object) pn.field_i.a((long)var3_int, -1);
                      if (null == var4_ref_om) {
                        break L41;
                      } else {
                        L42: {
                          L43: {
                            if (var2 != 11) {
                              break L43;
                            } else {
                              var4_ref_om.field_Pb = true;
                              if (var11 == 0) {
                                break L42;
                              } else {
                                break L43;
                              }
                            }
                          }
                          var4_ref_om.field_dc = true;
                          break L42;
                        }
                        ic.a(true, var4_ref_om);
                        break L41;
                      }
                    }
                    if (var11 == 0) {
                      break L0;
                    } else {
                      break L39;
                    }
                  }
                  L44: {
                    if (var2 == 13) {
                      break L44;
                    } else {
                      L45: {
                        L46: {
                          if (var2 == 14) {
                            break L46;
                          } else {
                            if (16 != var2) {
                              break L45;
                            } else {
                              break L46;
                            }
                          }
                        }
                        L47: {
                          var3 = ((wq) (Object) var1).g(param0 ^ -32735);
                          var5_ref2 = ab.a((byte) 96, var3);
                          if (null != var5_ref2) {
                            L48: {
                              L49: {
                                if (var2 != 14) {
                                  break L49;
                                } else {
                                  var5_ref2.field_Qb = true;
                                  if (var11 == 0) {
                                    break L48;
                                  } else {
                                    break L49;
                                  }
                                }
                              }
                              if (!var5_ref2.field_fc) {
                                uf.field_c = uf.field_c + 1;
                                var5_ref2.field_fc = true;
                                break L48;
                              } else {
                                break L48;
                              }
                            }
                            wl.a(var5_ref2, 17574);
                            break L47;
                          } else {
                            break L47;
                          }
                        }
                        if (var11 == 0) {
                          break L0;
                        } else {
                          break L45;
                        }
                      }
                      L50: {
                        if (var2 == 15) {
                          break L50;
                        } else {
                          if (var2 == 17) {
                            break L50;
                          } else {
                            L51: {
                              if (18 == var2) {
                                break L51;
                              } else {
                                L52: {
                                  if (var2 == 19) {
                                    break L52;
                                  } else {
                                    L53: {
                                      if (20 != var2) {
                                        break L53;
                                      } else {
                                        eb.a(o.field_e, (wq) (Object) var1, 0, false);
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L53;
                                        }
                                      }
                                    }
                                    L54: {
                                      if (var2 == 21) {
                                        break L54;
                                      } else {
                                        L55: {
                                          if (22 != var2) {
                                            break L55;
                                          } else {
                                            m.field_h = ((wq) (Object) var1).i(65280);
                                            ko.field_s = ((wq) (Object) var1).c((byte) 119);
                                            if (var11 == 0) {
                                              break L0;
                                            } else {
                                              break L55;
                                            }
                                          }
                                        }
                                        L56: {
                                          if (var2 != 23) {
                                            break L56;
                                          } else {
                                            oc.field_p = ((wq) (Object) var1).g(-32768);
                                            if (var11 == 0) {
                                              break L0;
                                            } else {
                                              break L56;
                                            }
                                          }
                                        }
                                        rk.a("L1: " + eq.c((byte) -121), (Throwable) null, 108);
                                        hn.a((byte) 84);
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                    L57: {
                                      L58: {
                                        var3_int = ((wq) (Object) var1).i(65280);
                                        if (var3_int != 0) {
                                          break L58;
                                        } else {
                                          ic.field_b = 0L;
                                          if (var11 == 0) {
                                            break L57;
                                          } else {
                                            break L58;
                                          }
                                        }
                                      }
                                      ic.field_b = (long)var3_int + ue.a(false);
                                      break L57;
                                    }
                                    if (var11 == 0) {
                                      break L0;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                                L59: {
                                  var3 = ((wq) (Object) var1).g(-32768);
                                  var5_int = ((wq) (Object) var1).l(255);
                                  var6_ref = ac.a(var3, 2);
                                  if (null != var6_ref) {
                                    L60: {
                                      L61: {
                                        if (0 == var5_int) {
                                          break L61;
                                        } else {
                                          var6_ref.field_ic = cm.field_o;
                                          var6_ref.field_kc = var5_int;
                                          if (var11 == 0) {
                                            break L60;
                                          } else {
                                            break L61;
                                          }
                                        }
                                      }
                                      var6_ref.b((byte) 111);
                                      break L60;
                                    }
                                    var6_ref.d(param0 + -30);
                                    o.field_e.field_cc = o.field_e.field_cc - 1;
                                    break L59;
                                  } else {
                                    break L59;
                                  }
                                }
                                if (var11 == 0) {
                                  break L0;
                                } else {
                                  break L51;
                                }
                              }
                            }
                            L62: {
                              var3 = ((wq) (Object) var1).g(-32768);
                              var5 = ((wq) (Object) var1).d(param0 + -34);
                              var6 = ((wq) (Object) var1).d(param0 + -34);
                              var7_ref = ac.a(var3, 2);
                              if (null != var7_ref) {
                                break L62;
                              } else {
                                var7_ref = new id(var5, var6, var3);
                                BrickABrac.field_F.a(var3, (tk) (Object) var7_ref, 48);
                                o.field_e.field_cc = o.field_e.field_cc + 1;
                                break L62;
                              }
                            }
                            L63: {
                              var7_ref.field_Wb = ((wq) (Object) var1).i(65280);
                              var8_int = ((wq) (Object) var1).c((byte) 127);
                              stackOut_168_0 = (id) var7_ref;
                              stackIn_170_0 = stackOut_168_0;
                              stackIn_169_0 = stackOut_168_0;
                              if (0 == (var8_int & 1)) {
                                stackOut_170_0 = (id) (Object) stackIn_170_0;
                                stackOut_170_1 = 0;
                                stackIn_171_0 = stackOut_170_0;
                                stackIn_171_1 = stackOut_170_1;
                                break L63;
                              } else {
                                stackOut_169_0 = (id) (Object) stackIn_169_0;
                                stackOut_169_1 = 1;
                                stackIn_171_0 = stackOut_169_0;
                                stackIn_171_1 = stackOut_169_1;
                                break L63;
                              }
                            }
                            stackIn_171_0.field_ec = stackIn_171_1 != 0;
                            var7_ref.field_ac = var8_int >> 814731393;
                            var7_ref.field_Zb = ((wq) (Object) var1).l(param0 ^ 222);
                            var7_ref.field_Ub = ((wq) (Object) var1).l(param0 + 222);
                            mp.field_Tb.a((nm) (Object) var7_ref, (byte) 3);
                            if (var11 == 0) {
                              break L0;
                            } else {
                              break L50;
                            }
                          }
                        }
                      }
                      L64: {
                        var3 = ((wq) (Object) var1).g(-32768);
                        var5_int = ((wq) (Object) var1).l(param0 ^ 222);
                        var6_ref = ab.a((byte) 96, var3);
                        if (var6_ref == null) {
                          break L64;
                        } else {
                          L65: {
                            L66: {
                              if (15 != var2) {
                                break L66;
                              } else {
                                var6_ref.field_Qb = false;
                                if (var11 == 0) {
                                  break L65;
                                } else {
                                  break L66;
                                }
                              }
                            }
                            if (var6_ref.field_fc) {
                              var6_ref.field_fc = false;
                              uf.field_c = uf.field_c - 1;
                              break L65;
                            } else {
                              break L65;
                            }
                          }
                          L67: {
                            if (var5_int == 0) {
                              break L67;
                            } else {
                              var6_ref.field_ic = cm.field_o;
                              var6_ref.field_kc = var5_int;
                              break L67;
                            }
                          }
                          wl.a(var6_ref, 17574);
                          break L64;
                        }
                      }
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L44;
                      }
                    }
                  }
                  L68: {
                    var3_int = ((wq) (Object) var1).i(65280);
                    var4 = ((wq) (Object) var1).l(255);
                    var5_ref = (om) (Object) pn.field_i.a((long)var3_int, param0 + -34);
                    if (null == var5_ref) {
                      break L68;
                    } else {
                      L69: {
                        var6_ref2 = var5_ref;
                        var5_ref.field_dc = false;
                        var6_ref2.field_Pb = false;
                        if (var4 == 0) {
                          break L69;
                        } else {
                          var5_ref.field_Zb = var4;
                          var5_ref.field_Wb = cm.field_o;
                          break L69;
                        }
                      }
                      ic.a(true, var5_ref);
                      break L68;
                    }
                  }
                  if (var11 == 0) {
                    break L0;
                  } else {
                    break L29;
                  }
                }
              }
              var3_ref_id = (id) (Object) ua.field_c.d(-61);
              L70: while (true) {
                L71: {
                  L72: {
                    if (var3_ref_id == null) {
                      break L72;
                    } else {
                      var3_ref_id.b((byte) 111);
                      var3_ref_id.d(3);
                      var3_ref_id = (id) (Object) ua.field_c.a((byte) 116);
                      if (var11 != 0) {
                        break L71;
                      } else {
                        if (var11 == 0) {
                          continue L70;
                        } else {
                          break L72;
                        }
                      }
                    }
                  }
                  uf.field_c = 0;
                  break L71;
                }
                if (var11 == 0) {
                  break L0;
                } else {
                  break L23;
                }
              }
            }
          }
          L73: {
            var3 = ((wq) (Object) var1).g(-32768);
            var5 = ((wq) (Object) var1).d(-1);
            var6 = ((wq) (Object) var1).d(-1);
            var7 = ((wq) (Object) var1).d(-1);
            var8 = ab.a((byte) 96, var3);
            if (var6.equals((Object) (Object) "")) {
              stackOut_199_0 = 0;
              stackIn_200_0 = stackOut_199_0;
              break L73;
            } else {
              stackOut_198_0 = 1;
              stackIn_200_0 = stackOut_198_0;
              break L73;
            }
          }
          L74: {
            L75: {
              var9 = stackIn_200_0;
              if (null != var8) {
                break L75;
              } else {
                var8 = new id(var5, var7, var3);
                eq.field_m.a(var3, (tk) (Object) var8, 86);
                if (var11 == 0) {
                  break L74;
                } else {
                  break L75;
                }
              }
            }
            if (var9 == 0) {
              break L74;
            } else {
              var8.a(var7, var5, (byte) -121);
              break L74;
            }
          }
          L76: {
            var8.field_Xb = ue.a(false) - (long)((wq) (Object) var1).e(255);
            var8.field_Wb = ((wq) (Object) var1).i(65280);
            var10 = ((wq) (Object) var1).c((byte) 110);
            var8.field_ac = var10 >> -324512415;
            stackOut_205_0 = (id) var8;
            stackIn_207_0 = stackOut_205_0;
            stackIn_206_0 = stackOut_205_0;
            if ((1 & var10) == 0) {
              stackOut_207_0 = (id) (Object) stackIn_207_0;
              stackOut_207_1 = 0;
              stackIn_208_0 = stackOut_207_0;
              stackIn_208_1 = stackOut_207_1;
              break L76;
            } else {
              stackOut_206_0 = (id) (Object) stackIn_206_0;
              stackOut_206_1 = 1;
              stackIn_208_0 = stackOut_206_0;
              stackIn_208_1 = stackOut_206_1;
              break L76;
            }
          }
          stackIn_208_0.field_ec = stackIn_208_1 != 0;
          var8.field_Zb = ((wq) (Object) var1).l(255);
          var8.field_Ub = ((wq) (Object) var1).l(255);
          wl.a(var8, 17574);
          break L0;
        }
        L77: {
          if (param0 == 33) {
            break L77;
          } else {
            sj.a((java.applet.Applet) null, (byte) -55, (String) null, (String) null, -27L);
            break L77;
          }
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_f = null;
              field_a = null;
              field_d = null;
              field_c = null;
              if (param0 == 11) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            field_g = null;
            field_b = null;
            field_e = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "sj.D(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Remove <%0> from friend list";
        field_e = "Confuse: reverse the paddle's controls.";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ia extends wf {
    int field_p;
    int field_k;
    int field_m;
    static String field_l;
    int field_h;
    static String field_i;
    static int field_j;
    int field_g;
    int[] field_o;
    int field_n;

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            String var4 = null;
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
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    L2: {
                      if (param1 == 6) {
                        break L2;
                      } else {
                        var4 = (String) null;
                        ia.a((java.applet.Applet) null, 40, (String) null);
                        break L2;
                      }
                    }
                    var3 = new java.net.URL(param0.getCodeBase(), param2);
                    var3 = dh.a(param0, (byte) -118, var3);
                    ea.a((byte) 68, param0, true, var3.toString());
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    var3_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var3_ref2);
                stackOut_6_1 = new StringBuilder().append("ia.D(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              L5: {
                stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param2 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        try {
            this.field_m = param2;
            this.field_o = param7;
            this.field_p = param1;
            if (param6 != 6) {
                ia.d(81);
            }
            this.field_g = param5;
            this.field_k = param3;
            this.field_n = param0;
            this.field_h = param4;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ia.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        int fieldTemp$5 = 0;
        wf discarded$6 = null;
        od discarded$7 = null;
        od discarded$8 = null;
        od discarded$9 = null;
        RuntimeException var1 = null;
        int var1_int = 0;
        pl var2 = null;
        pl var3 = null;
        int var4 = 0;
        j var4_ref_j = null;
        sj var4_ref_sj = null;
        int var5 = 0;
        sj var5_ref_sj = null;
        int var6 = 0;
        j var6_ref_j = null;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        j var12 = null;
        sj[] var13 = null;
        sj var14 = null;
        sj[] var15 = null;
        sj var16 = null;
        sj[] var17 = null;
        sj var18 = null;
        sj[] var20 = null;
        sj var21 = null;
        sj[] var22 = null;
        sj var23 = null;
        sj var24 = null;
        sj var25 = null;
        String var26 = null;
        sj var27 = null;
        char[] var30 = null;
        int stackIn_23_0 = 0;
        int stackIn_32_0 = 0;
        boolean stackIn_96_0 = false;
        int stackIn_100_0 = 0;
        int stackIn_119_0 = 0;
        j stackIn_162_0 = null;
        sj stackIn_163_0 = null;
        sj stackIn_164_0 = null;
        sj stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        j stackIn_170_0 = null;
        sj stackIn_171_0 = null;
        sj stackIn_172_0 = null;
        sj stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        j stackIn_175_0 = null;
        int stackIn_227_0 = 0;
        int stackIn_232_0 = 0;
        int stackIn_240_0 = 0;
        boolean stackIn_244_0 = false;
        sj stackIn_276_0 = null;
        sj stackIn_286_0 = null;
        sj stackIn_295_0 = null;
        sj stackIn_302_0 = null;
        int stackIn_312_0 = 0;
        sj stackIn_315_0 = null;
        sj stackIn_324_0 = null;
        sj stackIn_331_0 = null;
        Object stackIn_340_0 = null;
        sj stackIn_340_1 = null;
        boolean stackIn_356_0 = false;
        Object stackIn_368_0 = null;
        sj stackIn_368_1 = null;
        sj stackIn_414_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_226_0 = 0;
        int stackOut_225_0 = 0;
        boolean stackOut_231_0 = false;
        boolean stackOut_243_0 = false;
        sj stackOut_275_0 = null;
        int stackOut_311_0 = 0;
        sj stackOut_314_0 = null;
        sj stackOut_330_0 = null;
        sj stackOut_323_0 = null;
        sj stackOut_285_0 = null;
        sj stackOut_294_0 = null;
        sj stackOut_301_0 = null;
        Object stackOut_339_0 = null;
        sj stackOut_339_1 = null;
        int stackOut_239_0 = 0;
        int stackOut_238_0 = 0;
        boolean stackOut_355_0 = false;
        Object stackOut_367_0 = null;
        sj stackOut_367_1 = null;
        sj stackOut_413_0 = null;
        int stackOut_99_0 = 0;
        boolean stackOut_95_0 = false;
        int stackOut_118_0 = 0;
        int stackOut_117_0 = 0;
        j stackOut_161_0 = null;
        sj stackOut_162_0 = null;
        sj stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        sj stackOut_163_0 = null;
        int stackOut_163_1 = 0;
        j stackOut_169_0 = null;
        sj stackOut_170_0 = null;
        sj stackOut_172_0 = null;
        int stackOut_172_1 = 0;
        sj stackOut_171_0 = null;
        int stackOut_171_1 = 0;
        j stackOut_174_0 = null;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              hf.field_j = hf.field_j + 1;
              gh.field_l = gh.field_l + 1;
              pf.field_g = eh.field_a;
              nc.field_t = nc.field_t + jk.field_B;
              vh.field_n = vh.field_n + 1;
              hg.a(95);
              if (oj.field_u.a((byte) -95) == null) {
                break L1;
              } else {
                fieldTemp$5 = da.field_C + 1;
                da.field_C = da.field_C + 1;
                if ((fieldTemp$5 ^ -1) != -336) {
                  break L1;
                } else {
                  da.field_C = 0;
                  discarded$6 = oj.field_u.c(-94);
                  break L1;
                }
              }
            }
            L2: {
              if (mg.field_d) {
                break L2;
              } else {
                ne.a(39);
                break L2;
              }
            }
            L3: {
              if (param0 >= 22) {
                break L3;
              } else {
                field_l = (String) null;
                break L3;
              }
            }
            L4: {
              L5: {
                if (n.field_a != 0) {
                  break L5;
                } else {
                  if (6 > re.field_A) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (n.field_a < 2) {
                  break L6;
                } else {
                  if (mg.field_d) {
                    break L4;
                  } else {
                    if (-11 >= (n.field_a ^ -1)) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              wk.field_c = wk.field_c + 1;
              break L4;
            }
            L7: {
              L8: {
                eg.field_b = eg.field_b + 1;
                if (!mg.field_d) {
                  break L8;
                } else {
                  if ((n.field_a ^ -1) != -3) {
                    break L8;
                  } else {
                    break L7;
                  }
                }
              }
              dc.field_a = dc.field_a + 1;
              break L7;
            }
            L9: {
              g.field_z = g.field_z - 1;
              if (!rj.field_b) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L9;
              } else {
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
                break L9;
              }
            }
            L10: {
              var1_int = stackIn_23_0;
              if (ub.field_c == null) {
                break L10;
              } else {
                if (!ub.field_c.field_c) {
                  var1_int = 1;
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            if (var1_int == 0) {
              L11: {
                if (!mg.field_d) {
                  stackOut_31_0 = 1;
                  stackIn_32_0 = stackOut_31_0;
                  break L11;
                } else {
                  stackOut_30_0 = 7;
                  stackIn_32_0 = stackOut_30_0;
                  break L11;
                }
              }
              qf.field_d = stackIn_32_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L12: {
                L13: {
                  var2 = d.field_e;
                  if ((n.field_a ^ -1) > -4) {
                    break L13;
                  } else {
                    L14: {
                      if ((n.field_a ^ -1) <= -7) {
                        break L14;
                      } else {
                        var3 = bd.field_u[2];
                        if (var11 == 0) {
                          break L12;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if ((n.field_a ^ -1) <= -10) {
                        break L15;
                      } else {
                        var3 = bd.field_u[3];
                        if (var11 == 0) {
                          break L12;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L16: {
                      if (n.field_a >= 10) {
                        break L16;
                      } else {
                        var3 = bd.field_u[4];
                        if (var11 == 0) {
                          break L12;
                        } else {
                          break L16;
                        }
                      }
                    }
                    var3 = bd.field_u[6];
                    if (var11 == 0) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                var3 = bd.field_u[1];
                break L12;
              }
              L17: {
                L18: {
                  if (var2 == null) {
                    break L18;
                  } else {
                    if (var2 == var3) {
                      break L17;
                    } else {
                      if (var3 == bd.field_u[6]) {
                        break L17;
                      } else {
                        if (var2 != bd.field_u[5]) {
                          wd.a(17099, false, bd.field_u[5]);
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                }
                wd.a(17099, true, var3);
                break L17;
              }
              if (re.field_A >= 6) {
                L19: {
                  if (!ve.field_B[11]) {
                    break L19;
                  } else {
                    if (0 != ig.field_l) {
                      break L19;
                    } else {
                      ig.field_l = -1;
                      break L19;
                    }
                  }
                }
                L20: {
                  if (!ve.field_B[1]) {
                    break L20;
                  } else {
                    if (va.field_j >= 2) {
                      L21: {
                        if (ll.field_S) {
                          stackOut_226_0 = 0;
                          stackIn_227_0 = stackOut_226_0;
                          break L21;
                        } else {
                          stackOut_225_0 = 1;
                          stackIn_227_0 = stackOut_225_0;
                          break L21;
                        }
                      }
                      ll.field_S = stackIn_227_0 != 0;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
                L22: {
                  if (ve.field_B[12]) {
                    ig.field_l = 0;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: while (true) {
                  stackOut_231_0 = pc.b(-122);
                  stackIn_232_0 = stackOut_231_0 ? 1 : 0;
                  L24: while (true) {
                    L25: {
                      L26: {
                        L27: {
                          L28: {
                            L29: {
                              L30: {
                                L31: {
                                  if (stackIn_232_0 == 0) {
                                    break L31;
                                  } else {
                                    qf.field_e = qf.field_e ^ 1 << eh.field_a;
                                    bc.field_b = bc.field_b ^ 1 << eh.field_a;
                                    ud.field_b = ud.field_b - gh.field_l;
                                    jk.field_B = jk.field_B - 1;
                                    if (ch.field_d != 13) {
                                      if ((n.field_a ^ -1) == -11) {
                                        continue L23;
                                      } else {
                                        stackOut_243_0 = mg.field_d;
                                        stackIn_356_0 = stackOut_243_0;
                                        stackIn_244_0 = stackOut_243_0;
                                        if (var11 != 0) {
                                          break L30;
                                        } else {
                                          L32: {
                                            if (!stackIn_244_0) {
                                              break L32;
                                            } else {
                                              if (n.field_a != 2) {
                                                break L32;
                                              } else {
                                                if (var11 == 0) {
                                                  continue L23;
                                                } else {
                                                  break L32;
                                                }
                                              }
                                            }
                                          }
                                          L33: {
                                            if (ad.field_e) {
                                              break L33;
                                            } else {
                                              L34: {
                                                if (84 != ch.field_d) {
                                                  break L34;
                                                } else {
                                                  dc.a(-22991, false);
                                                  if (var11 == 0) {
                                                    continue L23;
                                                  } else {
                                                    break L34;
                                                  }
                                                }
                                              }
                                              L35: {
                                                if (va.field_j < 2) {
                                                  break L35;
                                                } else {
                                                  if ((ch.field_d ^ -1) != -36) {
                                                    break L35;
                                                  } else {
                                                    if (!ve.field_B[82]) {
                                                      break L35;
                                                    } else {
                                                      ue.b(31370);
                                                      if (var11 == 0) {
                                                        continue L23;
                                                      } else {
                                                        break L35;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              L36: {
                                                if ((ch.field_d ^ -1) != -84) {
                                                  break L36;
                                                } else {
                                                  discarded$7 = vk.a((byte) 78, dg.field_d[0]);
                                                  wk.field_a.a(-10874);
                                                  si.field_i.a(-10874);
                                                  if (var11 == 0) {
                                                    continue L23;
                                                  } else {
                                                    break L36;
                                                  }
                                                }
                                              }
                                              L37: {
                                                if (85 != ch.field_d) {
                                                  break L37;
                                                } else {
                                                  if (od.field_g.field_e[0] == null) {
                                                    break L37;
                                                  } else {
                                                    wh.f((byte) 104);
                                                    if (var11 == 0) {
                                                      continue L23;
                                                    } else {
                                                      break L37;
                                                    }
                                                  }
                                                }
                                              }
                                              L38: {
                                                L39: {
                                                  if (!i.a(sg.field_n, 160)) {
                                                    break L39;
                                                  } else {
                                                    if (sg.field_n == 32) {
                                                      break L39;
                                                    } else {
                                                      if (od.field_g.field_e[11] == null) {
                                                        break L38;
                                                      } else {
                                                        break L39;
                                                      }
                                                    }
                                                  }
                                                }
                                                L40: {
                                                  L41: {
                                                    if (98 != ch.field_d) {
                                                      break L41;
                                                    } else {
                                                      if ((n.field_a ^ -1) < -1) {
                                                        break L40;
                                                      } else {
                                                        break L41;
                                                      }
                                                    }
                                                  }
                                                  if (99 == ch.field_d) {
                                                    break L40;
                                                  } else {
                                                    continue L23;
                                                  }
                                                }
                                                var4 = 0;
                                                L42: while (true) {
                                                  L43: {
                                                    if (-13 >= (var4 ^ -1)) {
                                                      break L43;
                                                    } else {
                                                      var24 = od.field_g.field_e[var4];
                                                      var25 = var24;
                                                      var27 = var25;
                                                      var25 = var24;
                                                      var5_ref_sj = var25;
                                                      stackOut_275_0 = (sj) (var24);
                                                      stackIn_414_0 = stackOut_275_0;
                                                      stackIn_276_0 = stackOut_275_0;
                                                      if (var11 != 0) {
                                                        break L27;
                                                      } else {
                                                        if (stackIn_276_0 == null) {
                                                          break L43;
                                                        } else {
                                                          L44: {
                                                            if (var24.field_k == null) {
                                                              break L44;
                                                            } else {
                                                              if (od.field_g == var24.field_k) {
                                                                break L44;
                                                              } else {
                                                                if (null == var24.field_k.field_e[var24.field_s]) {
                                                                  var24.a(var24.field_s, 28, var24.field_k);
                                                                  break L44;
                                                                } else {
                                                                  break L44;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var4++;
                                                          if (var11 == 0) {
                                                            continue L42;
                                                          } else {
                                                            break L43;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var4 = 0;
                                                  L45: while (true) {
                                                    if (12 <= var4) {
                                                      if (ch.field_d != 98) {
                                                        continue L23;
                                                      } else {
                                                        var26 = vi.field_g[n.field_a + -1].toString();
                                                        var5 = 0;
                                                        L46: while (true) {
                                                          L47: {
                                                            if (var26.length() <= var5) {
                                                              break L47;
                                                            } else {
                                                              var6 = var26.charAt(var5);
                                                              var7 = null;
                                                              var8 = -1;
                                                              var9 = -1;
                                                              stackOut_311_0 = 0;
                                                              stackIn_232_0 = stackOut_311_0;
                                                              stackIn_312_0 = stackOut_311_0;
                                                              if (var11 != 0) {
                                                                continue L24;
                                                              } else {
                                                                var10 = stackIn_312_0;
                                                                L48: while (true) {
                                                                  L49: {
                                                                    L50: {
                                                                      if (12 <= var10) {
                                                                        break L50;
                                                                      } else {
                                                                        stackOut_314_0 = wk.field_a.field_e[var10];
                                                                        stackIn_331_0 = stackOut_314_0;
                                                                        stackIn_315_0 = stackOut_314_0;
                                                                        if (var11 != 0) {
                                                                          break L49;
                                                                        } else {
                                                                          L51: {
                                                                            if (stackIn_315_0 == null) {
                                                                              break L51;
                                                                            } else {
                                                                              if (var6 != wk.field_a.field_e[var10].field_i) {
                                                                                break L51;
                                                                              } else {
                                                                                if (wk.field_a.field_e[var10].field_l > var9) {
                                                                                  var8 = var10;
                                                                                  var7 = wk.field_a;
                                                                                  var9 = wk.field_a.field_e[var10].field_l;
                                                                                  break L51;
                                                                                } else {
                                                                                  break L51;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                          var10++;
                                                                          if (var11 == 0) {
                                                                            continue L48;
                                                                          } else {
                                                                            break L50;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    var10 = 0;
                                                                    L52: while (true) {
                                                                      if (var10 >= 8) {
                                                                        stackOut_330_0 = ((j) (var7)).field_e[var8];
                                                                        stackIn_331_0 = stackOut_330_0;
                                                                        break L49;
                                                                      } else {
                                                                        stackOut_323_0 = si.field_i.field_e[var10];
                                                                        stackIn_331_0 = stackOut_323_0;
                                                                        stackIn_324_0 = stackOut_323_0;
                                                                        if (var11 != 0) {
                                                                          break L49;
                                                                        } else {
                                                                          L53: {
                                                                            if (stackIn_324_0 == null) {
                                                                              break L53;
                                                                            } else {
                                                                              if (var6 != si.field_i.field_e[var10].field_i) {
                                                                                break L53;
                                                                              } else {
                                                                                if (var9 < si.field_i.field_e[var10].field_l) {
                                                                                  var7 = si.field_i;
                                                                                  var9 = si.field_i.field_e[var10].field_l;
                                                                                  var8 = var10;
                                                                                  break L53;
                                                                                } else {
                                                                                  break L53;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                          var10++;
                                                                          continue L52;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  ((sj) (Object) stackIn_331_0).a(var5, 28, od.field_g);
                                                                  var5++;
                                                                  if (var11 == 0) {
                                                                    continue L46;
                                                                  } else {
                                                                    break L47;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          if (var11 == 0) {
                                                            continue L23;
                                                          } else {
                                                            break L38;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var25 = od.field_g.field_e[var4];
                                                      var27 = var25;
                                                      var27 = var25;
                                                      var5_ref_sj = var25;
                                                      stackOut_285_0 = (sj) (var25);
                                                      stackIn_414_0 = stackOut_285_0;
                                                      stackIn_286_0 = stackOut_285_0;
                                                      if (var11 != 0) {
                                                        break L27;
                                                      } else {
                                                        L54: {
                                                          L55: {
                                                            if (stackIn_286_0 != null) {
                                                              break L55;
                                                            } else {
                                                              if (var11 == 0) {
                                                                break L54;
                                                              } else {
                                                                break L55;
                                                              }
                                                            }
                                                          }
                                                          L56: {
                                                            L57: {
                                                              if (-1 != (var25.field_h ^ -1)) {
                                                                break L57;
                                                              } else {
                                                                var6_ref_j = si.field_i;
                                                                var7 = wk.field_a;
                                                                if (var11 == 0) {
                                                                  break L56;
                                                                } else {
                                                                  break L57;
                                                                }
                                                              }
                                                            }
                                                            var7 = si.field_i;
                                                            var6_ref_j = wk.field_a;
                                                            break L56;
                                                          }
                                                          var8 = 0;
                                                          L58: while (true) {
                                                            L59: {
                                                              if (var6_ref_j.field_e.length <= var8) {
                                                                break L59;
                                                              } else {
                                                                stackOut_294_0 = var6_ref_j.field_e[var8];
                                                                stackIn_414_0 = stackOut_294_0;
                                                                stackIn_295_0 = stackOut_294_0;
                                                                if (var11 != 0) {
                                                                  break L27;
                                                                } else {
                                                                  if (stackIn_295_0 != null) {
                                                                    var8++;
                                                                    continue L58;
                                                                  } else {
                                                                    var25.a(var8, 28, var6_ref_j);
                                                                    var5_ref_sj = null;
                                                                    break L59;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            if (var5_ref_sj == null) {
                                                              break L54;
                                                            } else {
                                                              var8 = 0;
                                                              L60: while (true) {
                                                                if (var8 >= ((j) (var7)).field_e.length) {
                                                                  break L54;
                                                                } else {
                                                                  stackOut_301_0 = ((j) (var7)).field_e[var8];
                                                                  stackIn_414_0 = stackOut_301_0;
                                                                  stackIn_302_0 = stackOut_301_0;
                                                                  if (var11 != 0) {
                                                                    break L27;
                                                                  } else {
                                                                    L61: {
                                                                      if (stackIn_302_0 == null) {
                                                                        var5_ref_sj.a(var8, 28, (j) (var7));
                                                                        if (var11 == 0) {
                                                                          break L54;
                                                                        } else {
                                                                          break L61;
                                                                        }
                                                                      } else {
                                                                        break L61;
                                                                      }
                                                                    }
                                                                    var8++;
                                                                    continue L60;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var4++;
                                                        continue L45;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              L62: {
                                                sg.field_n = qi.field_c.a(0, sg.field_n);
                                                if (0 != ig.field_l) {
                                                  ig.field_l = sg.field_n & 255;
                                                  break L62;
                                                } else {
                                                  break L62;
                                                }
                                              }
                                              L63: {
                                                L64: {
                                                  var27 = w.a((byte)sg.field_n, false);
                                                  if (var27 == null) {
                                                    break L64;
                                                  } else {
                                                    var5 = 0;
                                                    L65: while (true) {
                                                      L66: {
                                                        if (var5 >= 12) {
                                                          break L66;
                                                        } else {
                                                          stackOut_339_0 = null;
                                                          stackOut_339_1 = od.field_g.field_e[var5];
                                                          stackIn_368_0 = stackOut_339_0;
                                                          stackIn_368_1 = stackOut_339_1;
                                                          stackIn_340_0 = stackOut_339_0;
                                                          stackIn_340_1 = stackOut_339_1;
                                                          if (var11 != 0) {
                                                            break L29;
                                                          } else {
                                                            L67: {
                                                              if (stackIn_340_0 == stackIn_340_1) {
                                                                var27.a(var5, 28, od.field_g);
                                                                if (var11 == 0) {
                                                                  break L66;
                                                                } else {
                                                                  break L67;
                                                                }
                                                              } else {
                                                                break L67;
                                                              }
                                                            }
                                                            var5++;
                                                            continue L65;
                                                          }
                                                        }
                                                      }
                                                      if (var11 == 0) {
                                                        break L63;
                                                      } else {
                                                        break L64;
                                                      }
                                                    }
                                                  }
                                                }
                                                discarded$8 = vk.a((byte) 91, dg.field_d[6]);
                                                break L63;
                                              }
                                              if (var11 == 0) {
                                                continue L23;
                                              } else {
                                                break L33;
                                              }
                                            }
                                          }
                                          a.field_S.b(false);
                                          if (!a.field_S.f(-9112)) {
                                            continue L23;
                                          } else {
                                            L68: {
                                              if (0 == a.field_S.field_d) {
                                                dc.a(-22991, false);
                                                break L68;
                                              } else {
                                                break L68;
                                              }
                                            }
                                            if (1 == a.field_S.field_d) {
                                              ad.field_e = false;
                                              if (var11 == 0) {
                                                continue L23;
                                              } else {
                                                break L31;
                                              }
                                            } else {
                                              continue L23;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L69: {
                                        if (!ad.field_e) {
                                          break L69;
                                        } else {
                                          ad.field_e = false;
                                          if (var11 == 0) {
                                            continue L23;
                                          } else {
                                            break L69;
                                          }
                                        }
                                      }
                                      L70: {
                                        if (mg.field_d) {
                                          stackOut_239_0 = 7;
                                          stackIn_240_0 = stackOut_239_0;
                                          break L70;
                                        } else {
                                          stackOut_238_0 = 1;
                                          stackIn_240_0 = stackOut_238_0;
                                          break L70;
                                        }
                                      }
                                      qf.field_d = stackIn_240_0;
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    }
                                  }
                                }
                                stackOut_355_0 = ad.field_e;
                                stackIn_356_0 = stackOut_355_0;
                                break L30;
                              }
                              L71: {
                                if (stackIn_356_0) {
                                  a.field_S.a(-127, kk.a(336, ol.field_b, nk.field_c), kk.a(336, oa.field_j, bk.field_a));
                                  if (!a.field_S.f(-9112)) {
                                    break L71;
                                  } else {
                                    L72: {
                                      if (0 == a.field_S.field_d) {
                                        dc.a(-22991, true);
                                        break L72;
                                      } else {
                                        break L72;
                                      }
                                    }
                                    if (a.field_S.field_d != 1) {
                                      break L71;
                                    } else {
                                      ad.field_e = false;
                                      break L71;
                                    }
                                  }
                                } else {
                                  break L71;
                                }
                              }
                              L73: {
                                if (-2 != (tg.field_d ^ -1)) {
                                  break L73;
                                } else {
                                  if (!ad.field_e) {
                                    break L28;
                                  } else {
                                    break L73;
                                  }
                                }
                              }
                              stackOut_367_0 = null;
                              stackOut_367_1 = sg.field_d;
                              stackIn_368_0 = stackOut_367_0;
                              stackIn_368_1 = stackOut_367_1;
                              break L29;
                            }
                            if (stackIn_368_0 == stackIn_368_1) {
                              break L25;
                            } else {
                              L74: {
                                if (b.field_k != 0) {
                                  break L74;
                                } else {
                                  qi.a((byte) 125);
                                  if (var11 == 0) {
                                    break L25;
                                  } else {
                                    break L74;
                                  }
                                }
                              }
                              ua.b((byte) 69);
                              if (var11 == 0) {
                                break L25;
                              } else {
                                break L28;
                              }
                            }
                          }
                          L75: {
                            qf.field_e = qf.field_e ^ 5 << bc.field_b;
                            hf.field_j = hf.field_j + ol.field_b;
                            vh.field_n = vh.field_n + ol.field_b;
                            nc.field_t = nc.field_t + nk.field_c;
                            bc.field_b = bc.field_b ^ 5 << bc.field_b;
                            ud.field_b = ud.field_b - nk.field_c;
                            if (-265 < (oa.field_j ^ -1)) {
                              break L75;
                            } else {
                              if ((oa.field_j ^ -1) <= -429) {
                                break L75;
                              } else {
                                if (bk.field_a < 376) {
                                  break L75;
                                } else {
                                  if ((bk.field_a ^ -1) <= -408) {
                                    break L75;
                                  } else {
                                    dc.a(-22991, true);
                                    if (var11 == 0) {
                                      break L25;
                                    } else {
                                      break L75;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L76: {
                            if (134 > oa.field_j) {
                              break L76;
                            } else {
                              if (-243 >= (oa.field_j ^ -1)) {
                                break L76;
                              } else {
                                if ((bk.field_a ^ -1) > -377) {
                                  break L76;
                                } else {
                                  if (407 > bk.field_a) {
                                    break L26;
                                  } else {
                                    break L76;
                                  }
                                }
                              }
                            }
                          }
                          L77: {
                            L78: {
                              L79: {
                                if (bk.field_a < 114) {
                                  break L79;
                                } else {
                                  if (bk.field_a >= 114 - -wl.field_K.field_m) {
                                    break L79;
                                  } else {
                                    if (oa.field_j >= 34) {
                                      break L78;
                                    } else {
                                      break L79;
                                    }
                                  }
                                }
                              }
                              L80: {
                                L81: {
                                  if (-191 < (bk.field_a ^ -1)) {
                                    break L81;
                                  } else {
                                    if (bk.field_a >= 190 + wl.field_K.field_m) {
                                      break L81;
                                    } else {
                                      if (oa.field_j >= 34) {
                                        break L80;
                                      } else {
                                        break L81;
                                      }
                                    }
                                  }
                                }
                                if (bk.field_a < 247) {
                                  break L77;
                                } else {
                                  if (247 + wl.field_K.field_m <= bk.field_a) {
                                    break L77;
                                  } else {
                                    if (161 > oa.field_j) {
                                      break L77;
                                    } else {
                                      L82: {
                                        var4 = (-161 + oa.field_j) / wl.field_K.field_n;
                                        if (var4 >= si.field_i.field_e.length) {
                                          break L82;
                                        } else {
                                          rk.field_p = -(-(var4 * wl.field_K.field_n) + (oa.field_j - 161));
                                          sg.field_d = si.field_i.field_e[var4];
                                          ek.field_e = 247 - bk.field_a;
                                          break L82;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L77;
                                      } else {
                                        break L80;
                                      }
                                    }
                                  }
                                }
                              }
                              L83: {
                                var4 = (-34 + oa.field_j) / wl.field_K.field_n;
                                if (var4 >= wk.field_a.field_e.length) {
                                  break L83;
                                } else {
                                  rk.field_p = -(oa.field_j - (34 - -(wl.field_K.field_n * var4)));
                                  sg.field_d = wk.field_a.field_e[var4];
                                  ek.field_e = -bk.field_a + 190;
                                  break L83;
                                }
                              }
                              if (var11 == 0) {
                                break L77;
                              } else {
                                break L78;
                              }
                            }
                            var4 = (-34 + oa.field_j) / wl.field_K.field_n;
                            if (var4 >= od.field_g.field_e.length) {
                              break L77;
                            } else {
                              rk.field_p = -(-(var4 * wl.field_K.field_n) + -34 + oa.field_j);
                              sg.field_d = od.field_g.field_e[var4];
                              ek.field_e = 114 - bk.field_a;
                              break L77;
                            }
                          }
                          L84: {
                            if ((va.field_j ^ -1) > -3) {
                              break L84;
                            } else {
                              if (0 >= ig.field_l) {
                                break L84;
                              } else {
                                if (sg.field_d != null) {
                                  L85: {
                                    sg.field_d.field_i = (char)ig.field_l;
                                    if (!dk.field_b) {
                                      hf.field_j = hf.field_j + 1;
                                      nc.field_t = nc.field_t + 1;
                                      dk.field_b = true;
                                      break L85;
                                    } else {
                                      break L85;
                                    }
                                  }
                                  sg.field_d.field_v = qi.field_c.field_p[255 & sg.field_d.field_i];
                                  var4_ref_sj = sg.field_d;
                                  sg.field_d.field_l = 0;
                                  ig.field_l = -1;
                                  var4_ref_sj.field_h = 0;
                                  break L84;
                                } else {
                                  break L84;
                                }
                              }
                            }
                          }
                          if (null == sg.field_d) {
                            break L25;
                          } else {
                            stackOut_413_0 = nc.field_s;
                            stackIn_414_0 = stackOut_413_0;
                            break L27;
                          }
                        }
                        L86: {
                          L87: {
                            if (stackIn_414_0 != sg.field_d) {
                              break L87;
                            } else {
                              if (-1 > (g.field_z ^ -1)) {
                                break L86;
                              } else {
                                break L87;
                              }
                            }
                          }
                          g.field_z = 10;
                          nc.field_s = sg.field_d;
                          if (var11 == 0) {
                            break L25;
                          } else {
                            break L86;
                          }
                        }
                        L88: {
                          L89: {
                            L90: {
                              sg.field_d = null;
                              if (od.field_g == nc.field_s.field_o) {
                                break L90;
                              } else {
                                var4 = 0;
                                L91: while (true) {
                                  L92: {
                                    if (12 <= var4) {
                                      break L92;
                                    } else {
                                      if (var11 != 0) {
                                        break L88;
                                      } else {
                                        L93: {
                                          if (od.field_g.field_e[var4] == null) {
                                            nc.field_s.a(var4, 28, od.field_g);
                                            if (var11 == 0) {
                                              break L92;
                                            } else {
                                              break L93;
                                            }
                                          } else {
                                            break L93;
                                          }
                                        }
                                        var4++;
                                        if (var11 == 0) {
                                          continue L91;
                                        } else {
                                          break L92;
                                        }
                                      }
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L89;
                                  } else {
                                    break L90;
                                  }
                                }
                              }
                            }
                            eh.a(nc.field_s, 55);
                            break L89;
                          }
                          nc.field_s = null;
                          break L88;
                        }
                        if (var11 == 0) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                      discarded$9 = vk.a((byte) 85, dg.field_d[0]);
                      wk.field_a.a(-10874);
                      si.field_i.a(-10874);
                      break L25;
                    }
                    decompiledRegionSelector0 = 5;
                    break L0;
                  }
                }
              } else {
                L94: {
                  if (0 > jl.field_j) {
                    break L94;
                  } else {
                    L95: {
                      L96: {
                        if (-1 + n.field_a == jl.field_j) {
                          break L96;
                        } else {
                          if (!hd.field_a) {
                            break L95;
                          } else {
                            break L96;
                          }
                        }
                      }
                      o.field_i = o.field_i + 10;
                      if (237 - -o.field_i >= 480) {
                        hd.field_a = false;
                        jl.field_j = jl.field_j + 1;
                        if (var11 == 0) {
                          break L94;
                        } else {
                          break L95;
                        }
                      } else {
                        break L94;
                      }
                    }
                    if ((o.field_i ^ -1) < -1) {
                      o.field_i = o.field_i - 10;
                      break L94;
                    } else {
                      break L94;
                    }
                  }
                }
                L97: {
                  L98: {
                    if (-1 == (re.field_A ^ -1)) {
                      break L98;
                    } else {
                      L99: {
                        if (-2 != (re.field_A ^ -1)) {
                          break L99;
                        } else {
                          var4 = 1;
                          var13 = wk.field_a.field_e;
                          var6 = 0;
                          L100: while (true) {
                            L101: {
                              L102: {
                                L103: {
                                  if (var6 >= var13.length) {
                                    break L103;
                                  } else {
                                    var14 = var13[var6];
                                    if (var11 != 0) {
                                      break L102;
                                    } else {
                                      L104: {
                                        if (var14 == null) {
                                          break L104;
                                        } else {
                                          L105: {
                                            if (var14.field_p == var14.field_q) {
                                              break L105;
                                            } else {
                                              var4 = 0;
                                              if (var11 == 0) {
                                                break L103;
                                              } else {
                                                break L105;
                                              }
                                            }
                                          }
                                          if ((var14.field_p ^ -1) != -191) {
                                            break L104;
                                          } else {
                                            var14.field_p = var14.field_p + wl.field_K.field_m;
                                            var4 = 0;
                                            if (var11 == 0) {
                                              break L103;
                                            } else {
                                              break L104;
                                            }
                                          }
                                        }
                                      }
                                      var6++;
                                      if (var11 == 0) {
                                        continue L100;
                                      } else {
                                        break L103;
                                      }
                                    }
                                  }
                                }
                                if (0 == n.field_a) {
                                  break L102;
                                } else {
                                  break L101;
                                }
                              }
                              L106: {
                                if (-51 < (dc.field_a ^ -1)) {
                                  break L106;
                                } else {
                                  if (var4 != 0) {
                                    dc.field_a = 0;
                                    if (var11 == 0) {
                                      break L101;
                                    } else {
                                      break L106;
                                    }
                                  } else {
                                    break L101;
                                  }
                                }
                              }
                              var4 = 0;
                              break L101;
                            }
                            L107: {
                              if (var4 == 0) {
                                break L107;
                              } else {
                                re.field_A = 2;
                                break L107;
                              }
                            }
                            if (var11 == 0) {
                              break L97;
                            } else {
                              break L99;
                            }
                          }
                        }
                      }
                      L108: {
                        if (2 != re.field_A) {
                          break L108;
                        } else {
                          L109: {
                            if (n.field_a == 10) {
                              break L109;
                            } else {
                              L110: {
                                if (!mg.field_d) {
                                  break L110;
                                } else {
                                  if (2 != n.field_a) {
                                    break L110;
                                  } else {
                                    break L109;
                                  }
                                }
                              }
                              var4 = 1;
                              var15 = od.field_g.field_e;
                              var6 = 0;
                              L111: while (true) {
                                L112: {
                                  L113: {
                                    if (var6 >= var15.length) {
                                      break L113;
                                    } else {
                                      var16 = var15[var6];
                                      if (var11 != 0) {
                                        break L112;
                                      } else {
                                        L114: {
                                          L115: {
                                            if (var16 != null) {
                                              break L115;
                                            } else {
                                              if (var11 == 0) {
                                                break L114;
                                              } else {
                                                break L115;
                                              }
                                            }
                                          }
                                          L116: {
                                            if (var16.field_q != var16.field_p) {
                                              break L116;
                                            } else {
                                              if (-115 != (var16.field_p ^ -1)) {
                                                break L114;
                                              } else {
                                                var4 = 0;
                                                var16.field_p = 190;
                                                if (var11 == 0) {
                                                  break L113;
                                                } else {
                                                  break L116;
                                                }
                                              }
                                            }
                                          }
                                          var4 = 0;
                                          if (var11 == 0) {
                                            break L113;
                                          } else {
                                            break L114;
                                          }
                                        }
                                        var6++;
                                        if (var11 == 0) {
                                          continue L111;
                                        } else {
                                          break L113;
                                        }
                                      }
                                    }
                                  }
                                  if (n.field_a != 0) {
                                    break L112;
                                  } else {
                                    L117: {
                                      if ((dc.field_a ^ -1) > -51) {
                                        break L117;
                                      } else {
                                        if (var4 != 0) {
                                          dc.field_a = 0;
                                          if (var11 == 0) {
                                            break L112;
                                          } else {
                                            break L117;
                                          }
                                        } else {
                                          break L112;
                                        }
                                      }
                                    }
                                    var4 = 0;
                                    break L112;
                                  }
                                }
                                L118: {
                                  if (var4 != 0) {
                                    re.field_A = 3;
                                    break L118;
                                  } else {
                                    break L118;
                                  }
                                }
                                if (var11 == 0) {
                                  break L97;
                                } else {
                                  break L108;
                                }
                              }
                            }
                          }
                          var4 = 0;
                          L119: while (true) {
                            L120: {
                              if (!pc.b(-128)) {
                                stackOut_99_0 = 1;
                                stackIn_100_0 = stackOut_99_0;
                                break L120;
                              } else {
                                L121: {
                                  L122: {
                                    if ((ch.field_d ^ -1) == -14) {
                                      break L122;
                                    } else {
                                      if (84 == ch.field_d) {
                                        break L122;
                                      } else {
                                        break L121;
                                      }
                                    }
                                  }
                                  var4 = 1;
                                  break L121;
                                }
                                if (13 != ch.field_d) {
                                  continue L119;
                                } else {
                                  stackOut_95_0 = mg.field_d;
                                  stackIn_100_0 = stackOut_95_0 ? 1 : 0;
                                  stackIn_96_0 = stackOut_95_0;
                                  if (var11 != 0) {
                                    break L120;
                                  } else {
                                    if (!stackIn_96_0) {
                                      continue L119;
                                    } else {
                                      qf.field_d = 0;
                                      decompiledRegionSelector0 = 2;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            }
                            L123: {
                              if (stackIn_100_0 != tg.field_d) {
                                break L123;
                              } else {
                                if ((ol.field_b ^ -1) > -265) {
                                  break L123;
                                } else {
                                  if (-429 >= (ol.field_b ^ -1)) {
                                    break L123;
                                  } else {
                                    if (nk.field_c < 376) {
                                      break L123;
                                    } else {
                                      if ((nk.field_c ^ -1) <= -408) {
                                        break L123;
                                      } else {
                                        var4 = 1;
                                        break L123;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L124: {
                              if (1000 <= dc.field_a) {
                                var4 = 1;
                                break L124;
                              } else {
                                break L124;
                              }
                            }
                            L125: {
                              if (var4 == 0) {
                                break L125;
                              } else {
                                L126: {
                                  if (!mg.field_d) {
                                    break L126;
                                  } else {
                                    mg.field_d = false;
                                    hd.field_a = true;
                                    if (var11 == 0) {
                                      break L125;
                                    } else {
                                      break L126;
                                    }
                                  }
                                }
                                L127: {
                                  if (!qj.b((byte) 97)) {
                                    break L127;
                                  } else {
                                    qf.field_d = 5;
                                    if (var11 == 0) {
                                      break L125;
                                    } else {
                                      break L127;
                                    }
                                  }
                                }
                                L128: {
                                  if (0 != hc.field_u) {
                                    stackOut_118_0 = 6;
                                    stackIn_119_0 = stackOut_118_0;
                                    break L128;
                                  } else {
                                    stackOut_117_0 = 2;
                                    stackIn_119_0 = stackOut_117_0;
                                    break L128;
                                  }
                                }
                                qf.field_d = stackIn_119_0;
                                break L125;
                              }
                            }
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                      L129: {
                        if (3 != re.field_A) {
                          break L129;
                        } else {
                          L130: {
                            wk.field_a.a(true);
                            si.field_i.a(true);
                            if (-11 == (n.field_a ^ -1)) {
                              break L130;
                            } else {
                              L131: {
                                if (!mg.field_d) {
                                  break L131;
                                } else {
                                  if (2 == n.field_a) {
                                    break L130;
                                  } else {
                                    break L131;
                                  }
                                }
                              }
                              var17 = od.field_g.field_e;
                              var5 = 0;
                              L132: while (true) {
                                L133: {
                                  if (var5 >= var17.length) {
                                    break L133;
                                  } else {
                                    var18 = var17[var5];
                                    if (var11 != 0) {
                                      break L97;
                                    } else {
                                      L134: {
                                        if (var18 == null) {
                                          break L134;
                                        } else {
                                          var18.field_x = false;
                                          var18.field_l = var18.field_l + 1;
                                          if (-4 >= (var18.field_h ^ -1)) {
                                            break L134;
                                          } else {
                                            var18.field_h = var18.field_h + 1;
                                            break L134;
                                          }
                                        }
                                      }
                                      var5++;
                                      if (var11 == 0) {
                                        continue L132;
                                      } else {
                                        break L133;
                                      }
                                    }
                                  }
                                }
                                L135: {
                                  L136: {
                                    L137: {
                                      L138: {
                                        var30 = new char[8];
                                        if (!mg.field_d) {
                                          break L138;
                                        } else {
                                          if ((n.field_a ^ -1) != -2) {
                                            break L138;
                                          } else {
                                            if (null != qi.field_c.field_n) {
                                              break L137;
                                            } else {
                                              break L138;
                                            }
                                          }
                                        }
                                      }
                                      qi.field_c.a((byte) 92, var30);
                                      var5 = li.a(8, o.field_o, false);
                                      var6 = 0;
                                      L139: while (true) {
                                        L140: {
                                          if (var30.length <= var6) {
                                            break L140;
                                          } else {
                                            si.field_i.field_e[var6] = w.a(si.field_i, var6, qi.field_c, (byte) 30, var30[var6]);
                                            stackOut_161_0 = si.field_i;
                                            stackIn_175_0 = stackOut_161_0;
                                            stackIn_162_0 = stackOut_161_0;
                                            if (var11 != 0) {
                                              break L135;
                                            } else {
                                              L141: {
                                                stackOut_162_0 = stackIn_162_0.field_e[var6];
                                                stackIn_164_0 = stackOut_162_0;
                                                stackIn_163_0 = stackOut_162_0;
                                                if (var5 != var6) {
                                                  stackOut_164_0 = (sj) ((Object) stackIn_164_0);
                                                  stackOut_164_1 = 0;
                                                  stackIn_165_0 = stackOut_164_0;
                                                  stackIn_165_1 = stackOut_164_1;
                                                  break L141;
                                                } else {
                                                  stackOut_163_0 = (sj) ((Object) stackIn_163_0);
                                                  stackOut_163_1 = 1;
                                                  stackIn_165_0 = stackOut_163_0;
                                                  stackIn_165_1 = stackOut_163_1;
                                                  break L141;
                                                }
                                              }
                                              stackIn_165_0.field_x = stackIn_165_1 != 0;
                                              si.field_i.field_e[var6].field_p = 247 + -wl.field_K.field_m;
                                              si.field_i.field_e[var6].field_q = 247 + -wl.field_K.field_m;
                                              var6++;
                                              if (var11 == 0) {
                                                continue L139;
                                              } else {
                                                break L140;
                                              }
                                            }
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L136;
                                        } else {
                                          break L137;
                                        }
                                      }
                                    }
                                    var5 = 0;
                                    L142: while (true) {
                                      if (var5 >= qi.field_c.field_n.length()) {
                                        break L136;
                                      } else {
                                        si.field_i.field_e[var5] = w.a(si.field_i, var5, qi.field_c, (byte) 105, qi.field_c.field_n.charAt(var5));
                                        stackOut_169_0 = si.field_i;
                                        stackIn_175_0 = stackOut_169_0;
                                        stackIn_170_0 = stackOut_169_0;
                                        if (var11 != 0) {
                                          break L135;
                                        } else {
                                          L143: {
                                            stackOut_170_0 = stackIn_170_0.field_e[var5];
                                            stackIn_172_0 = stackOut_170_0;
                                            stackIn_171_0 = stackOut_170_0;
                                            if (-2 != (var5 ^ -1)) {
                                              stackOut_172_0 = (sj) ((Object) stackIn_172_0);
                                              stackOut_172_1 = 0;
                                              stackIn_173_0 = stackOut_172_0;
                                              stackIn_173_1 = stackOut_172_1;
                                              break L143;
                                            } else {
                                              stackOut_171_0 = (sj) ((Object) stackIn_171_0);
                                              stackOut_171_1 = 1;
                                              stackIn_173_0 = stackOut_171_0;
                                              stackIn_173_1 = stackOut_171_1;
                                              break L143;
                                            }
                                          }
                                          stackIn_173_0.field_x = stackIn_173_1 != 0;
                                          si.field_i.field_e[var5].field_p = 247 + -wl.field_K.field_m;
                                          si.field_i.field_e[var5].field_q = 247 + -wl.field_K.field_m;
                                          var5++;
                                          if (var11 == 0) {
                                            continue L142;
                                          } else {
                                            break L136;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  wk.field_a.field_c = 114;
                                  stackOut_174_0 = wk.field_a;
                                  stackIn_175_0 = stackOut_174_0;
                                  break L135;
                                }
                                stackIn_175_0.field_d = 34;
                                re.field_A = 4;
                                if (var11 == 0) {
                                  break L97;
                                } else {
                                  break L130;
                                }
                              }
                            }
                          }
                          re.field_A = 6;
                          if (var11 == 0) {
                            break L97;
                          } else {
                            break L129;
                          }
                        }
                      }
                      L144: {
                        if (4 == re.field_A) {
                          break L144;
                        } else {
                          if (-6 == (re.field_A ^ -1)) {
                            L145: {
                              var12 = wk.field_a;
                              var4_ref_j = var12;
                              wk.field_a = od.field_g;
                              wk.field_a.field_d = 34;
                              od.field_g = var12;
                              wk.field_a.field_c = 190;
                              re.field_A = 6;
                              od.field_g.field_c = 114;
                              if ((jl.field_j ^ -1) != -4) {
                                break L145;
                              } else {
                                jl.field_j = jl.field_j + 1;
                                break L145;
                              }
                            }
                            od.field_g.field_d = 34;
                            if (var11 == 0) {
                              break L97;
                            } else {
                              break L144;
                            }
                          } else {
                            break L97;
                          }
                        }
                      }
                      var4 = 1;
                      var20 = si.field_i.field_e;
                      var6 = 0;
                      L146: while (true) {
                        L147: {
                          L148: {
                            if (var20.length <= var6) {
                              break L148;
                            } else {
                              var21 = var20[var6];
                              if (var11 != 0) {
                                break L147;
                              } else {
                                L149: {
                                  if (var21 == null) {
                                    break L149;
                                  } else {
                                    L150: {
                                      if (var21.field_p == var21.field_q) {
                                        break L150;
                                      } else {
                                        var4 = 0;
                                        if (var11 == 0) {
                                          break L148;
                                        } else {
                                          break L150;
                                        }
                                      }
                                    }
                                    if ((var21.field_p ^ -1) != -248) {
                                      var21.field_p = 247;
                                      var4 = 0;
                                      if (var11 == 0) {
                                        break L148;
                                      } else {
                                        break L149;
                                      }
                                    } else {
                                      break L149;
                                    }
                                  }
                                }
                                var6++;
                                if (var11 == 0) {
                                  continue L146;
                                } else {
                                  break L148;
                                }
                              }
                            }
                          }
                          if (n.field_a != 0) {
                            break L147;
                          } else {
                            L151: {
                              if ((dc.field_a ^ -1) > -51) {
                                break L151;
                              } else {
                                if (var4 != 0) {
                                  dc.field_a = 0;
                                  if (var11 == 0) {
                                    break L147;
                                  } else {
                                    break L151;
                                  }
                                } else {
                                  break L147;
                                }
                              }
                            }
                            var4 = 0;
                            break L147;
                          }
                        }
                        L152: {
                          if (var4 != 0) {
                            re.field_A = 5;
                            break L152;
                          } else {
                            break L152;
                          }
                        }
                        if (var11 == 0) {
                          break L97;
                        } else {
                          break L98;
                        }
                      }
                    }
                  }
                  var4 = 1;
                  var22 = si.field_i.field_e;
                  var6 = 0;
                  L153: while (true) {
                    L154: {
                      if (var22.length <= var6) {
                        break L154;
                      } else {
                        var23 = var22[var6];
                        if (var11 != 0) {
                          break L97;
                        } else {
                          L155: {
                            if (var23 == null) {
                              break L155;
                            } else {
                              L156: {
                                if (var23.field_q != var23.field_p) {
                                  break L156;
                                } else {
                                  if (-248 != (var23.field_p ^ -1)) {
                                    break L155;
                                  } else {
                                    var4 = 0;
                                    var23.field_p = var23.field_p + wl.field_K.field_m;
                                    if (var11 == 0) {
                                      break L154;
                                    } else {
                                      break L156;
                                    }
                                  }
                                }
                              }
                              var4 = 0;
                              if (var11 == 0) {
                                break L154;
                              } else {
                                break L155;
                              }
                            }
                          }
                          var6++;
                          if (var11 == 0) {
                            continue L153;
                          } else {
                            break L154;
                          }
                        }
                      }
                    }
                    if (var4 == 0) {
                      break L97;
                    } else {
                      re.field_A = 1;
                      break L97;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "ia.C(" + param0 + ')');
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
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 != -4) {
            field_j = -4;
        }
        field_i = null;
    }

    ia() {
    }

    static {
        field_i = "Menu";
        field_l = "Updates will sent to the email address you've given";
    }
}

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
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    L2: {
                      if (param1 == 6) {
                        break L2;
                      } else {
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
                stackOut_7_0 = (RuntimeException) var3_ref2;
                stackOut_7_1 = new StringBuilder().append("ia.D(");
                stackIn_10_0 = stackOut_7_0;
                stackIn_10_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  break L4;
                }
              }
              L5: {
                stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
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
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  stackIn_15_2 = stackOut_12_2;
                  break L5;
                }
              }
              throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        RuntimeException var9 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              ((ia) this).field_m = param2;
              ((ia) this).field_o = param7;
              ((ia) this).field_p = param1;
              if (param6 == 6) {
                break L1;
              } else {
                ia.d(81);
                break L1;
              }
            }
            ((ia) this).field_g = param5;
            ((ia) this).field_k = param3;
            ((ia) this).field_n = param0;
            ((ia) this).field_h = param4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var9;
            stackOut_5_1 = new StringBuilder().append("ia.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param7 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static void d(int param0) {
        int var1_int = 0;
        pl var2 = null;
        pl var3 = null;
        int var4 = 0;
        j var4_ref_j = null;
        sj[] var4_ref_sj__ = null;
        char[] var4_ref_char__ = null;
        sj var4_ref_sj = null;
        String var4_ref_String = null;
        Object var5_ref = null;
        int var5 = 0;
        int var6 = 0;
        sj var6_ref_sj = null;
        j var6_ref_j = null;
        Object var7 = null;
        j var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_33_0 = 0;
        boolean stackIn_115_0 = false;
        int stackIn_119_0 = 0;
        int stackIn_145_0 = 0;
        j stackIn_199_0 = null;
        sj stackIn_200_0 = null;
        sj stackIn_201_0 = null;
        sj stackIn_202_0 = null;
        sj stackIn_203_0 = null;
        int stackIn_203_1 = 0;
        j stackIn_208_0 = null;
        sj stackIn_209_0 = null;
        sj stackIn_210_0 = null;
        sj stackIn_211_0 = null;
        sj stackIn_212_0 = null;
        int stackIn_212_1 = 0;
        j stackIn_214_0 = null;
        int stackIn_278_0 = 0;
        int stackIn_283_0 = 0;
        int stackIn_292_0 = 0;
        boolean stackIn_295_0 = false;
        Object stackIn_336_0 = null;
        Object stackIn_350_0 = null;
        sj stackIn_361_0 = null;
        sj stackIn_369_0 = null;
        int stackIn_380_0 = 0;
        sj stackIn_383_0 = null;
        sj stackIn_395_0 = null;
        sj stackIn_405_0 = null;
        Object stackIn_414_0 = null;
        sj stackIn_414_1 = null;
        boolean stackIn_431_0 = false;
        Object stackIn_444_0 = null;
        sj stackIn_444_1 = null;
        sj stackIn_507_0 = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_277_0 = 0;
        int stackOut_276_0 = 0;
        boolean stackOut_282_0 = false;
        boolean stackOut_294_0 = false;
        Object stackOut_335_0 = null;
        Object stackOut_349_0 = null;
        sj stackOut_360_0 = null;
        sj stackOut_368_0 = null;
        int stackOut_379_0 = 0;
        sj stackOut_382_0 = null;
        sj stackOut_394_0 = null;
        sj stackOut_404_0 = null;
        Object stackOut_413_0 = null;
        sj stackOut_413_1 = null;
        int stackOut_291_0 = 0;
        int stackOut_290_0 = 0;
        boolean stackOut_430_0 = false;
        Object stackOut_443_0 = null;
        sj stackOut_443_1 = null;
        sj stackOut_506_0 = null;
        int stackOut_118_0 = 0;
        boolean stackOut_114_0 = false;
        int stackOut_144_0 = 0;
        int stackOut_143_0 = 0;
        j stackOut_198_0 = null;
        sj stackOut_199_0 = null;
        sj stackOut_202_0 = null;
        int stackOut_202_1 = 0;
        sj stackOut_200_0 = null;
        sj stackOut_201_0 = null;
        int stackOut_201_1 = 0;
        j stackOut_207_0 = null;
        sj stackOut_208_0 = null;
        sj stackOut_211_0 = null;
        int stackOut_211_1 = 0;
        sj stackOut_209_0 = null;
        sj stackOut_210_0 = null;
        int stackOut_210_1 = 0;
        j stackOut_213_0 = null;
        L0: {
          var11 = Transmogrify.field_A ? 1 : 0;
          hf.field_j = hf.field_j + 1;
          gh.field_l = gh.field_l + 1;
          pf.field_g = eh.field_a;
          nc.field_t = nc.field_t + jk.field_B;
          vh.field_n = vh.field_n + 1;
          hg.a(95);
          if (oj.field_u.a((byte) -95) == null) {
            break L0;
          } else {
            int fieldTemp$5 = da.field_C + 1;
            da.field_C = da.field_C + 1;
            if (fieldTemp$5 != 335) {
              break L0;
            } else {
              da.field_C = 0;
              wf discarded$6 = oj.field_u.c(-94);
              break L0;
            }
          }
        }
        L1: {
          if (mg.field_d) {
            break L1;
          } else {
            ne.a(39);
            break L1;
          }
        }
        L2: {
          if (param0 >= 22) {
            break L2;
          } else {
            field_l = null;
            break L2;
          }
        }
        L3: {
          L4: {
            if (n.field_a != 0) {
              break L4;
            } else {
              if (6 > re.field_A) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          L5: {
            if (n.field_a < 2) {
              break L5;
            } else {
              if (mg.field_d) {
                break L3;
              } else {
                if (n.field_a >= 10) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
          }
          wk.field_c = wk.field_c + 1;
          break L3;
        }
        L6: {
          L7: {
            eg.field_b = eg.field_b + 1;
            if (!mg.field_d) {
              break L7;
            } else {
              if (n.field_a != 2) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          dc.field_a = dc.field_a + 1;
          break L6;
        }
        L8: {
          g.field_z = g.field_z - 1;
          var1_int = rj.field_b ? 1 : 0;
          if (ub.field_c == null) {
            break L8;
          } else {
            if (!ub.field_c.field_c) {
              var1_int = 1;
              break L8;
            } else {
              break L8;
            }
          }
        }
        if (var1_int == 0) {
          L9: {
            if (!mg.field_d) {
              stackOut_32_0 = 1;
              stackIn_33_0 = stackOut_32_0;
              break L9;
            } else {
              stackOut_31_0 = 7;
              stackIn_33_0 = stackOut_31_0;
              break L9;
            }
          }
          qf.field_d = stackIn_33_0;
          return;
        } else {
          L10: {
            L11: {
              var2 = d.field_e;
              if (n.field_a < 3) {
                break L11;
              } else {
                L12: {
                  if (n.field_a >= 6) {
                    break L12;
                  } else {
                    var3 = bd.field_u[2];
                    if (var11 == 0) {
                      break L10;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (n.field_a >= 9) {
                    break L13;
                  } else {
                    var3 = bd.field_u[3];
                    if (var11 == 0) {
                      break L10;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  if (n.field_a >= 10) {
                    break L14;
                  } else {
                    var3 = bd.field_u[4];
                    if (var11 == 0) {
                      break L10;
                    } else {
                      break L14;
                    }
                  }
                }
                var3 = bd.field_u[6];
                if (var11 == 0) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            var3 = bd.field_u[1];
            break L10;
          }
          L15: {
            L16: {
              if (var2 == null) {
                break L16;
              } else {
                if (var2 == var3) {
                  break L15;
                } else {
                  if (var3 == bd.field_u[6]) {
                    break L15;
                  } else {
                    if (var2 != bd.field_u[5]) {
                      wd.a(17099, false, bd.field_u[5]);
                      if (var11 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    } else {
                      break L15;
                    }
                  }
                }
              }
            }
            wd.a(17099, true, var3);
            break L15;
          }
          if (re.field_A >= 6) {
            L17: {
              if (!ve.field_B[11]) {
                break L17;
              } else {
                if (0 != ig.field_l) {
                  break L17;
                } else {
                  ig.field_l = -1;
                  break L17;
                }
              }
            }
            L18: {
              if (!ve.field_B[1]) {
                break L18;
              } else {
                if (va.field_j >= 2) {
                  L19: {
                    if (ll.field_S) {
                      stackOut_277_0 = 0;
                      stackIn_278_0 = stackOut_277_0;
                      break L19;
                    } else {
                      stackOut_276_0 = 1;
                      stackIn_278_0 = stackOut_276_0;
                      break L19;
                    }
                  }
                  ll.field_S = stackIn_278_0 != 0;
                  break L18;
                } else {
                  break L18;
                }
              }
            }
            L20: {
              if (ve.field_B[12]) {
                ig.field_l = 0;
                break L20;
              } else {
                break L20;
              }
            }
            L21: while (true) {
              stackOut_282_0 = pc.b(-122);
              stackIn_283_0 = stackOut_282_0 ? 1 : 0;
              L22: while (true) {
                L23: {
                  L24: {
                    L25: {
                      L26: {
                        L27: {
                          L28: {
                            L29: {
                              if (stackIn_283_0 == 0) {
                                break L29;
                              } else {
                                qf.field_e = qf.field_e ^ 1 << eh.field_a;
                                bc.field_b = bc.field_b ^ 1 << eh.field_a;
                                ud.field_b = ud.field_b - gh.field_l;
                                jk.field_B = jk.field_B - 1;
                                if (ch.field_d != 13) {
                                  if (n.field_a == 10) {
                                    continue L21;
                                  } else {
                                    stackOut_294_0 = mg.field_d;
                                    stackIn_431_0 = stackOut_294_0;
                                    stackIn_295_0 = stackOut_294_0;
                                    if (var11 != 0) {
                                      break L28;
                                    } else {
                                      L30: {
                                        if (!stackIn_295_0) {
                                          break L30;
                                        } else {
                                          if (n.field_a != 2) {
                                            break L30;
                                          } else {
                                            if (var11 == 0) {
                                              continue L21;
                                            } else {
                                              break L30;
                                            }
                                          }
                                        }
                                      }
                                      L31: {
                                        if (ad.field_e) {
                                          break L31;
                                        } else {
                                          L32: {
                                            if (84 != ch.field_d) {
                                              break L32;
                                            } else {
                                              dc.a(-22991, false);
                                              if (var11 == 0) {
                                                continue L21;
                                              } else {
                                                break L32;
                                              }
                                            }
                                          }
                                          L33: {
                                            if (va.field_j < 2) {
                                              break L33;
                                            } else {
                                              if (ch.field_d != 35) {
                                                break L33;
                                              } else {
                                                if (!ve.field_B[82]) {
                                                  break L33;
                                                } else {
                                                  ue.b(31370);
                                                  if (var11 == 0) {
                                                    continue L21;
                                                  } else {
                                                    break L33;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L34: {
                                            if (ch.field_d != 83) {
                                              break L34;
                                            } else {
                                              od discarded$7 = vk.a((byte) 78, dg.field_d[0]);
                                              wk.field_a.a(-10874);
                                              si.field_i.a(-10874);
                                              if (var11 == 0) {
                                                continue L21;
                                              } else {
                                                break L34;
                                              }
                                            }
                                          }
                                          L35: {
                                            if (85 != ch.field_d) {
                                              break L35;
                                            } else {
                                              if (od.field_g.field_e[0] == null) {
                                                break L35;
                                              } else {
                                                wh.f((byte) 104);
                                                if (var11 == 0) {
                                                  continue L21;
                                                } else {
                                                  break L35;
                                                }
                                              }
                                            }
                                          }
                                          L36: {
                                            L37: {
                                              if (!i.a(sg.field_n, 160)) {
                                                break L37;
                                              } else {
                                                if (sg.field_n == 32) {
                                                  break L37;
                                                } else {
                                                  if (od.field_g.field_e[11] == null) {
                                                    break L36;
                                                  } else {
                                                    break L37;
                                                  }
                                                }
                                              }
                                            }
                                            L38: {
                                              L39: {
                                                if (98 != ch.field_d) {
                                                  break L39;
                                                } else {
                                                  if (n.field_a > 0) {
                                                    break L38;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                              }
                                              if (99 == ch.field_d) {
                                                break L38;
                                              } else {
                                                continue L21;
                                              }
                                            }
                                            var4 = 0;
                                            L40: while (true) {
                                              L41: {
                                                if (var4 >= 12) {
                                                  break L41;
                                                } else {
                                                  var5_ref = (Object) (Object) od.field_g.field_e[var4];
                                                  stackOut_335_0 = var5_ref;
                                                  stackIn_507_0 = (sj) (Object) stackOut_335_0;
                                                  stackIn_336_0 = stackOut_335_0;
                                                  if (var11 != 0) {
                                                    break L25;
                                                  } else {
                                                    if (stackIn_336_0 == null) {
                                                      break L41;
                                                    } else {
                                                      L42: {
                                                        if (((sj) var5_ref).field_k == null) {
                                                          break L42;
                                                        } else {
                                                          if (od.field_g == ((sj) var5_ref).field_k) {
                                                            break L42;
                                                          } else {
                                                            if (null == ((sj) var5_ref).field_k.field_e[((sj) var5_ref).field_s]) {
                                                              ((sj) var5_ref).a(((sj) var5_ref).field_s, 28, ((sj) var5_ref).field_k);
                                                              break L42;
                                                            } else {
                                                              break L42;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var4++;
                                                      if (var11 == 0) {
                                                        continue L40;
                                                      } else {
                                                        break L41;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              var4 = 0;
                                              L43: while (true) {
                                                L44: {
                                                  if (12 <= var4) {
                                                    break L44;
                                                  } else {
                                                    var5_ref = (Object) (Object) od.field_g.field_e[var4];
                                                    stackOut_349_0 = var5_ref;
                                                    stackIn_507_0 = (sj) (Object) stackOut_349_0;
                                                    stackIn_350_0 = stackOut_349_0;
                                                    if (var11 != 0) {
                                                      break L25;
                                                    } else {
                                                      L45: {
                                                        L46: {
                                                          if (stackIn_350_0 != null) {
                                                            break L46;
                                                          } else {
                                                            if (var11 == 0) {
                                                              break L45;
                                                            } else {
                                                              break L46;
                                                            }
                                                          }
                                                        }
                                                        L47: {
                                                          L48: {
                                                            if (((sj) var5_ref).field_h != 0) {
                                                              break L48;
                                                            } else {
                                                              var6_ref_j = si.field_i;
                                                              var7_ref = wk.field_a;
                                                              if (var11 == 0) {
                                                                break L47;
                                                              } else {
                                                                break L48;
                                                              }
                                                            }
                                                          }
                                                          var7_ref = si.field_i;
                                                          var6_ref_j = wk.field_a;
                                                          break L47;
                                                        }
                                                        var8 = 0;
                                                        L49: while (true) {
                                                          L50: {
                                                            if (~var6_ref_j.field_e.length >= ~var8) {
                                                              break L50;
                                                            } else {
                                                              stackOut_360_0 = var6_ref_j.field_e[var8];
                                                              stackIn_507_0 = stackOut_360_0;
                                                              stackIn_361_0 = stackOut_360_0;
                                                              if (var11 != 0) {
                                                                break L25;
                                                              } else {
                                                                if (stackIn_361_0 != null) {
                                                                  var8++;
                                                                  if (var11 == 0) {
                                                                    continue L49;
                                                                  } else {
                                                                    break L50;
                                                                  }
                                                                } else {
                                                                  ((sj) var5_ref).a(var8, 28, var6_ref_j);
                                                                  var5_ref = null;
                                                                  break L50;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          if (null == var5_ref) {
                                                            break L45;
                                                          } else {
                                                            var8 = 0;
                                                            L51: while (true) {
                                                              if (var8 >= var7_ref.field_e.length) {
                                                                break L45;
                                                              } else {
                                                                stackOut_368_0 = var7_ref.field_e[var8];
                                                                stackIn_507_0 = stackOut_368_0;
                                                                stackIn_369_0 = stackOut_368_0;
                                                                if (var11 != 0) {
                                                                  break L25;
                                                                } else {
                                                                  L52: {
                                                                    if (stackIn_369_0 == null) {
                                                                      ((sj) var5_ref).a(var8, 28, var7_ref);
                                                                      if (var11 == 0) {
                                                                        break L45;
                                                                      } else {
                                                                        break L52;
                                                                      }
                                                                    } else {
                                                                      break L52;
                                                                    }
                                                                  }
                                                                  var8++;
                                                                  if (var11 == 0) {
                                                                    continue L51;
                                                                  } else {
                                                                    break L45;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var4++;
                                                      if (var11 == 0) {
                                                        continue L43;
                                                      } else {
                                                        break L44;
                                                      }
                                                    }
                                                  }
                                                }
                                                if (ch.field_d != 98) {
                                                  continue L21;
                                                } else {
                                                  var4_ref_String = vi.field_g[n.field_a + -1].toString();
                                                  var5 = 0;
                                                  L53: while (true) {
                                                    L54: {
                                                      if (var4_ref_String.length() <= var5) {
                                                        break L54;
                                                      } else {
                                                        var6 = var4_ref_String.charAt(var5);
                                                        var7_ref = null;
                                                        var8 = -1;
                                                        var9 = -1;
                                                        stackOut_379_0 = 0;
                                                        stackIn_283_0 = stackOut_379_0;
                                                        stackIn_380_0 = stackOut_379_0;
                                                        if (var11 != 0) {
                                                          continue L22;
                                                        } else {
                                                          var10 = stackIn_380_0;
                                                          L55: while (true) {
                                                            L56: {
                                                              L57: {
                                                                if (12 <= var10) {
                                                                  break L57;
                                                                } else {
                                                                  stackOut_382_0 = wk.field_a.field_e[var10];
                                                                  stackIn_405_0 = stackOut_382_0;
                                                                  stackIn_383_0 = stackOut_382_0;
                                                                  if (var11 != 0) {
                                                                    break L56;
                                                                  } else {
                                                                    L58: {
                                                                      if (stackIn_383_0 == null) {
                                                                        break L58;
                                                                      } else {
                                                                        if (~var6 != ~wk.field_a.field_e[var10].field_i) {
                                                                          break L58;
                                                                        } else {
                                                                          if (wk.field_a.field_e[var10].field_l > var9) {
                                                                            var8 = var10;
                                                                            var7_ref = wk.field_a;
                                                                            var9 = wk.field_a.field_e[var10].field_l;
                                                                            break L58;
                                                                          } else {
                                                                            break L58;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    var10++;
                                                                    if (var11 == 0) {
                                                                      continue L55;
                                                                    } else {
                                                                      break L57;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var10 = 0;
                                                              L59: while (true) {
                                                                L60: {
                                                                  if (var10 >= 8) {
                                                                    break L60;
                                                                  } else {
                                                                    stackOut_394_0 = si.field_i.field_e[var10];
                                                                    stackIn_405_0 = stackOut_394_0;
                                                                    stackIn_395_0 = stackOut_394_0;
                                                                    if (var11 != 0) {
                                                                      break L56;
                                                                    } else {
                                                                      L61: {
                                                                        if (stackIn_395_0 == null) {
                                                                          break L61;
                                                                        } else {
                                                                          if (var6 != si.field_i.field_e[var10].field_i) {
                                                                            break L61;
                                                                          } else {
                                                                            if (var9 < si.field_i.field_e[var10].field_l) {
                                                                              var7_ref = si.field_i;
                                                                              var9 = si.field_i.field_e[var10].field_l;
                                                                              var8 = var10;
                                                                              break L61;
                                                                            } else {
                                                                              break L61;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      var10++;
                                                                      if (var11 == 0) {
                                                                        continue L59;
                                                                      } else {
                                                                        break L60;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                stackOut_404_0 = var7_ref.field_e[var8];
                                                                stackIn_405_0 = stackOut_404_0;
                                                                break L56;
                                                              }
                                                            }
                                                            ((sj) (Object) stackIn_405_0).a(var5, 28, od.field_g);
                                                            var5++;
                                                            if (var11 == 0) {
                                                              continue L53;
                                                            } else {
                                                              break L54;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (var11 == 0) {
                                                      continue L21;
                                                    } else {
                                                      break L36;
                                                    }
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
                                              var4_ref_sj = w.a((byte)sg.field_n, false);
                                              if (var4_ref_sj == null) {
                                                break L64;
                                              } else {
                                                var5 = 0;
                                                L65: while (true) {
                                                  L66: {
                                                    if (var5 >= 12) {
                                                      break L66;
                                                    } else {
                                                      stackOut_413_0 = null;
                                                      stackOut_413_1 = od.field_g.field_e[var5];
                                                      stackIn_444_0 = stackOut_413_0;
                                                      stackIn_444_1 = stackOut_413_1;
                                                      stackIn_414_0 = stackOut_413_0;
                                                      stackIn_414_1 = stackOut_413_1;
                                                      if (var11 != 0) {
                                                        break L27;
                                                      } else {
                                                        L67: {
                                                          if (stackIn_414_0 == (Object) (Object) stackIn_414_1) {
                                                            var4_ref_sj.a(var5, 28, od.field_g);
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
                                                        if (var11 == 0) {
                                                          continue L65;
                                                        } else {
                                                          break L66;
                                                        }
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
                                            od discarded$8 = vk.a((byte) 91, dg.field_d[6]);
                                            break L63;
                                          }
                                          if (var11 == 0) {
                                            continue L21;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                      a.field_S.b(false);
                                      if (!a.field_S.f(-9112)) {
                                        continue L21;
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
                                            continue L21;
                                          } else {
                                            break L29;
                                          }
                                        } else {
                                          continue L21;
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
                                        continue L21;
                                      } else {
                                        break L69;
                                      }
                                    }
                                  }
                                  L70: {
                                    if (mg.field_d) {
                                      stackOut_291_0 = 7;
                                      stackIn_292_0 = stackOut_291_0;
                                      break L70;
                                    } else {
                                      stackOut_290_0 = 1;
                                      stackIn_292_0 = stackOut_290_0;
                                      break L70;
                                    }
                                  }
                                  qf.field_d = stackIn_292_0;
                                  return;
                                }
                              }
                            }
                            stackOut_430_0 = ad.field_e;
                            stackIn_431_0 = stackOut_430_0;
                            break L28;
                          }
                          L71: {
                            if (stackIn_431_0) {
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
                            if (tg.field_d != 1) {
                              break L73;
                            } else {
                              if (!ad.field_e) {
                                break L26;
                              } else {
                                break L73;
                              }
                            }
                          }
                          stackOut_443_0 = null;
                          stackOut_443_1 = sg.field_d;
                          stackIn_444_0 = stackOut_443_0;
                          stackIn_444_1 = stackOut_443_1;
                          break L27;
                        }
                        if (stackIn_444_0 == (Object) (Object) stackIn_444_1) {
                          break L23;
                        } else {
                          L74: {
                            if (b.field_k != 0) {
                              break L74;
                            } else {
                              qi.a((byte) 125);
                              if (var11 == 0) {
                                break L23;
                              } else {
                                break L74;
                              }
                            }
                          }
                          ua.b((byte) 69);
                          if (var11 == 0) {
                            break L23;
                          } else {
                            break L26;
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
                        if (oa.field_j < 264) {
                          break L75;
                        } else {
                          if (oa.field_j >= 428) {
                            break L75;
                          } else {
                            if (bk.field_a < 376) {
                              break L75;
                            } else {
                              if (bk.field_a >= 407) {
                                break L75;
                              } else {
                                dc.a(-22991, true);
                                if (var11 == 0) {
                                  break L23;
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
                          if (oa.field_j >= 242) {
                            break L76;
                          } else {
                            if (bk.field_a < 376) {
                              break L76;
                            } else {
                              if (407 > bk.field_a) {
                                break L24;
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
                              if (bk.field_a < 190) {
                                break L81;
                              } else {
                                if (~bk.field_a <= ~(190 + wl.field_K.field_m)) {
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
                            if (~var4 <= ~wk.field_a.field_e.length) {
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
                        if (va.field_j < 2) {
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
                        break L23;
                      } else {
                        stackOut_506_0 = nc.field_s;
                        stackIn_507_0 = stackOut_506_0;
                        break L25;
                      }
                    }
                    L86: {
                      L87: {
                        if (stackIn_507_0 != sg.field_d) {
                          break L87;
                        } else {
                          if (g.field_z > 0) {
                            break L86;
                          } else {
                            break L87;
                          }
                        }
                      }
                      g.field_z = 10;
                      nc.field_s = sg.field_d;
                      if (var11 == 0) {
                        break L23;
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
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                  od discarded$9 = vk.a((byte) 85, dg.field_d[0]);
                  wk.field_a.a(-10874);
                  si.field_i.a(-10874);
                  break L23;
                }
                return;
              }
            }
          } else {
            L94: {
              if (0 > jl.field_j) {
                break L94;
              } else {
                L95: {
                  L96: {
                    if (~(-1 + n.field_a) == ~jl.field_j) {
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
                if (o.field_i > 0) {
                  o.field_i = o.field_i - 10;
                  break L94;
                } else {
                  break L94;
                }
              }
            }
            L97: {
              L98: {
                if (re.field_A == 0) {
                  break L98;
                } else {
                  L99: {
                    if (re.field_A != 1) {
                      break L99;
                    } else {
                      var4 = 1;
                      var5_ref = (Object) (Object) wk.field_a.field_e;
                      var6 = 0;
                      L100: while (true) {
                        L101: {
                          L102: {
                            L103: {
                              if (var6 >= ((Object[]) var5_ref).length) {
                                break L103;
                              } else {
                                var7_ref = (j) ((Object[]) var5_ref)[var6];
                                if (var11 != 0) {
                                  break L102;
                                } else {
                                  L104: {
                                    if (null == var7_ref) {
                                      break L104;
                                    } else {
                                      L105: {
                                        if (((sj) (Object) var7_ref).field_p == ((sj) (Object) var7_ref).field_q) {
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
                                      if (((sj) (Object) var7_ref).field_p != 190) {
                                        break L104;
                                      } else {
                                        ((sj) (Object) var7_ref).field_p = ((sj) (Object) var7_ref).field_p + wl.field_K.field_m;
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
                            if (dc.field_a < 50) {
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
                          var5_ref = (Object) (Object) od.field_g.field_e;
                          var6 = 0;
                          L111: while (true) {
                            L112: {
                              L113: {
                                if (var6 >= ((Object[]) var5_ref).length) {
                                  break L113;
                                } else {
                                  var7_ref = (j) ((Object[]) var5_ref)[var6];
                                  if (var11 != 0) {
                                    break L112;
                                  } else {
                                    L114: {
                                      L115: {
                                        if (var7_ref != null) {
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
                                        if (((sj) (Object) var7_ref).field_q != ((sj) (Object) var7_ref).field_p) {
                                          break L116;
                                        } else {
                                          if (((sj) (Object) var7_ref).field_p != 114) {
                                            break L114;
                                          } else {
                                            var4 = 0;
                                            ((sj) (Object) var7_ref).field_p = 190;
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
                                  if (dc.field_a < 50) {
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
                            stackOut_118_0 = 1;
                            stackIn_119_0 = stackOut_118_0;
                            break L120;
                          } else {
                            L121: {
                              L122: {
                                if (ch.field_d == 13) {
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
                              stackOut_114_0 = mg.field_d;
                              stackIn_119_0 = stackOut_114_0 ? 1 : 0;
                              stackIn_115_0 = stackOut_114_0;
                              if (var11 != 0) {
                                break L120;
                              } else {
                                if (!stackIn_115_0) {
                                  continue L119;
                                } else {
                                  qf.field_d = 0;
                                  return;
                                }
                              }
                            }
                          }
                        }
                        L123: {
                          if (stackIn_119_0 != tg.field_d) {
                            break L123;
                          } else {
                            if (ol.field_b < 264) {
                              break L123;
                            } else {
                              if (ol.field_b >= 428) {
                                break L123;
                              } else {
                                if (nk.field_c < 376) {
                                  break L123;
                                } else {
                                  if (nk.field_c >= 407) {
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
                                stackOut_144_0 = 6;
                                stackIn_145_0 = stackOut_144_0;
                                break L128;
                              } else {
                                stackOut_143_0 = 2;
                                stackIn_145_0 = stackOut_143_0;
                                break L128;
                              }
                            }
                            qf.field_d = stackIn_145_0;
                            break L125;
                          }
                        }
                        return;
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
                        if (n.field_a == 10) {
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
                          var4_ref_sj__ = od.field_g.field_e;
                          var5 = 0;
                          L132: while (true) {
                            L133: {
                              if (~var5 <= ~var4_ref_sj__.length) {
                                break L133;
                              } else {
                                var6_ref_sj = var4_ref_sj__[var5];
                                if (var11 != 0) {
                                  break L97;
                                } else {
                                  L134: {
                                    if (null == var6_ref_sj) {
                                      break L134;
                                    } else {
                                      var6_ref_sj.field_x = false;
                                      var6_ref_sj.field_l = var6_ref_sj.field_l + 1;
                                      if (var6_ref_sj.field_h >= 3) {
                                        break L134;
                                      } else {
                                        var6_ref_sj.field_h = var6_ref_sj.field_h + 1;
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
                                    var4_ref_char__ = new char[8];
                                    if (!mg.field_d) {
                                      break L138;
                                    } else {
                                      if (n.field_a != 1) {
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
                                  qi.field_c.a((byte) 92, var4_ref_char__);
                                  var5 = li.a(8, o.field_o, false);
                                  var6 = 0;
                                  L139: while (true) {
                                    L140: {
                                      if (~var4_ref_char__.length >= ~var6) {
                                        break L140;
                                      } else {
                                        si.field_i.field_e[var6] = w.a(si.field_i, var6, qi.field_c, (byte) 30, var4_ref_char__[var6]);
                                        stackOut_198_0 = si.field_i;
                                        stackIn_214_0 = stackOut_198_0;
                                        stackIn_199_0 = stackOut_198_0;
                                        if (var11 != 0) {
                                          break L135;
                                        } else {
                                          L141: {
                                            stackOut_199_0 = stackIn_199_0.field_e[var6];
                                            stackIn_202_0 = stackOut_199_0;
                                            stackIn_200_0 = stackOut_199_0;
                                            if (var5 != var6) {
                                              stackOut_202_0 = (sj) (Object) stackIn_202_0;
                                              stackOut_202_1 = 0;
                                              stackIn_203_0 = stackOut_202_0;
                                              stackIn_203_1 = stackOut_202_1;
                                              break L141;
                                            } else {
                                              stackOut_200_0 = (sj) (Object) stackIn_200_0;
                                              stackIn_201_0 = stackOut_200_0;
                                              stackOut_201_0 = (sj) (Object) stackIn_201_0;
                                              stackOut_201_1 = 1;
                                              stackIn_203_0 = stackOut_201_0;
                                              stackIn_203_1 = stackOut_201_1;
                                              break L141;
                                            }
                                          }
                                          stackIn_203_0.field_x = stackIn_203_1 != 0;
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
                                  if (~var5 <= ~qi.field_c.field_n.length()) {
                                    break L136;
                                  } else {
                                    si.field_i.field_e[var5] = w.a(si.field_i, var5, qi.field_c, (byte) 105, qi.field_c.field_n.charAt(var5));
                                    stackOut_207_0 = si.field_i;
                                    stackIn_214_0 = stackOut_207_0;
                                    stackIn_208_0 = stackOut_207_0;
                                    if (var11 != 0) {
                                      break L135;
                                    } else {
                                      L143: {
                                        stackOut_208_0 = stackIn_208_0.field_e[var5];
                                        stackIn_211_0 = stackOut_208_0;
                                        stackIn_209_0 = stackOut_208_0;
                                        if (var5 != 1) {
                                          stackOut_211_0 = (sj) (Object) stackIn_211_0;
                                          stackOut_211_1 = 0;
                                          stackIn_212_0 = stackOut_211_0;
                                          stackIn_212_1 = stackOut_211_1;
                                          break L143;
                                        } else {
                                          stackOut_209_0 = (sj) (Object) stackIn_209_0;
                                          stackIn_210_0 = stackOut_209_0;
                                          stackOut_210_0 = (sj) (Object) stackIn_210_0;
                                          stackOut_210_1 = 1;
                                          stackIn_212_0 = stackOut_210_0;
                                          stackIn_212_1 = stackOut_210_1;
                                          break L143;
                                        }
                                      }
                                      stackIn_212_0.field_x = stackIn_212_1 != 0;
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
                              stackOut_213_0 = wk.field_a;
                              stackIn_214_0 = stackOut_213_0;
                              break L135;
                            }
                            stackIn_214_0.field_d = 34;
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
                      if (re.field_A == 5) {
                        L145: {
                          var4_ref_j = wk.field_a;
                          wk.field_a = od.field_g;
                          wk.field_a.field_d = 34;
                          od.field_g = var4_ref_j;
                          wk.field_a.field_c = 190;
                          re.field_A = 6;
                          od.field_g.field_c = 114;
                          if (jl.field_j != 3) {
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
                  var5_ref = (Object) (Object) si.field_i.field_e;
                  var6 = 0;
                  L146: while (true) {
                    L147: {
                      L148: {
                        if (((Object[]) var5_ref).length <= var6) {
                          break L148;
                        } else {
                          var7_ref = (j) ((Object[]) var5_ref)[var6];
                          if (var11 != 0) {
                            break L147;
                          } else {
                            L149: {
                              if (null == var7_ref) {
                                break L149;
                              } else {
                                L150: {
                                  if (((sj) (Object) var7_ref).field_p == ((sj) (Object) var7_ref).field_q) {
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
                                if (((sj) (Object) var7_ref).field_p != 247) {
                                  ((sj) (Object) var7_ref).field_p = 247;
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
                          if (dc.field_a < 50) {
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
              var5_ref = (Object) (Object) si.field_i.field_e;
              var6 = 0;
              L153: while (true) {
                L154: {
                  if (~((Object[]) var5_ref).length >= ~var6) {
                    break L154;
                  } else {
                    var7_ref = (j) ((Object[]) var5_ref)[var6];
                    if (var11 != 0) {
                      break L97;
                    } else {
                      L155: {
                        if (null == var7_ref) {
                          break L155;
                        } else {
                          L156: {
                            if (~((sj) (Object) var7_ref).field_q != ~((sj) (Object) var7_ref).field_p) {
                              break L156;
                            } else {
                              if (((sj) (Object) var7_ref).field_p != 247) {
                                break L155;
                              } else {
                                var4 = 0;
                                ((sj) (Object) var7_ref).field_p = ((sj) (Object) var7_ref).field_p + wl.field_K.field_m;
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
            return;
          }
        }
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_l = null;
              if (param0 == -4) {
                break L1;
              } else {
                field_j = -4;
                break L1;
              }
            }
            field_i = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "ia.A(" + param0 + ')');
        }
    }

    ia() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Menu";
        field_l = "Updates will sent to the email address you've given";
    }
}

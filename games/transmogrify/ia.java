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
                        var4 = null;
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
                stackOut_6_0 = (RuntimeException) var3_ref2;
                stackOut_6_1 = new StringBuilder().append("ia.D(");
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
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              L5: {
                stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param1).append(44);
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param2 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              throw ch.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        try {
            ((ia) this).field_m = param2;
            ((ia) this).field_o = param7;
            ((ia) this).field_p = param1;
            if (param6 != 6) {
                ia.d(81);
            }
            ((ia) this).field_g = param5;
            ((ia) this).field_k = param3;
            ((ia) this).field_n = param0;
            ((ia) this).field_h = param4;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ia.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + (param7 != null ? "{...}" : "null") + 41);
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
        j var12 = null;
        int stackIn_20_0 = 0;
        int stackIn_29_0 = 0;
        boolean stackIn_92_0 = false;
        int stackIn_95_0 = 0;
        int stackIn_114_0 = 0;
        j stackIn_157_0 = null;
        sj stackIn_158_0 = null;
        sj stackIn_159_0 = null;
        sj stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        j stackIn_165_0 = null;
        sj stackIn_166_0 = null;
        sj stackIn_167_0 = null;
        sj stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        j stackIn_170_0 = null;
        int stackIn_222_0 = 0;
        int stackIn_227_0 = 0;
        int stackIn_235_0 = 0;
        boolean stackIn_238_0 = false;
        Object stackIn_270_0 = null;
        Object stackIn_280_0 = null;
        sj stackIn_289_0 = null;
        sj stackIn_296_0 = null;
        int stackIn_306_0 = 0;
        sj stackIn_309_0 = null;
        sj stackIn_318_0 = null;
        sj stackIn_325_0 = null;
        Object stackIn_334_0 = null;
        sj stackIn_334_1 = null;
        boolean stackIn_350_0 = false;
        Object stackIn_362_0 = null;
        sj stackIn_362_1 = null;
        sj stackIn_408_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_220_0 = 0;
        boolean stackOut_226_0 = false;
        boolean stackOut_237_0 = false;
        Object stackOut_269_0 = null;
        Object stackOut_279_0 = null;
        sj stackOut_288_0 = null;
        sj stackOut_295_0 = null;
        int stackOut_305_0 = 0;
        sj stackOut_308_0 = null;
        sj stackOut_317_0 = null;
        sj stackOut_324_0 = null;
        Object stackOut_333_0 = null;
        sj stackOut_333_1 = null;
        int stackOut_234_0 = 0;
        int stackOut_233_0 = 0;
        boolean stackOut_349_0 = false;
        Object stackOut_361_0 = null;
        sj stackOut_361_1 = null;
        sj stackOut_407_0 = null;
        int stackOut_94_0 = 0;
        boolean stackOut_91_0 = false;
        int stackOut_113_0 = 0;
        int stackOut_112_0 = 0;
        j stackOut_156_0 = null;
        sj stackOut_157_0 = null;
        sj stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        sj stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        j stackOut_164_0 = null;
        sj stackOut_165_0 = null;
        sj stackOut_167_0 = null;
        int stackOut_167_1 = 0;
        sj stackOut_166_0 = null;
        int stackOut_166_1 = 0;
        j stackOut_169_0 = null;
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
          L3: {
            if (n.field_a != 0) {
              break L3;
            } else {
              if (6 > re.field_A) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          L4: {
            if (n.field_a < 2) {
              break L4;
            } else {
              if (mg.field_d) {
                break L2;
              } else {
                if (n.field_a >= 10) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
          }
          wk.field_c = wk.field_c + 1;
          break L2;
        }
        L5: {
          L6: {
            eg.field_b = eg.field_b + 1;
            if (!mg.field_d) {
              break L6;
            } else {
              if (n.field_a != 2) {
                break L6;
              } else {
                break L5;
              }
            }
          }
          dc.field_a = dc.field_a + 1;
          break L5;
        }
        L7: {
          g.field_z = g.field_z - 1;
          if (!rj.field_b) {
            stackOut_19_0 = 0;
            stackIn_20_0 = stackOut_19_0;
            break L7;
          } else {
            stackOut_18_0 = 1;
            stackIn_20_0 = stackOut_18_0;
            break L7;
          }
        }
        L8: {
          var1_int = stackIn_20_0;
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
              stackOut_28_0 = 1;
              stackIn_29_0 = stackOut_28_0;
              break L9;
            } else {
              stackOut_27_0 = 7;
              stackIn_29_0 = stackOut_27_0;
              break L9;
            }
          }
          qf.field_d = stackIn_29_0;
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
                      stackOut_221_0 = 0;
                      stackIn_222_0 = stackOut_221_0;
                      break L19;
                    } else {
                      stackOut_220_0 = 1;
                      stackIn_222_0 = stackOut_220_0;
                      break L19;
                    }
                  }
                  ll.field_S = stackIn_222_0 != 0;
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
              stackOut_226_0 = pc.b(-122);
              stackIn_227_0 = stackOut_226_0 ? 1 : 0;
              L22: while (true) {
                L23: {
                  L24: {
                    L25: {
                      L26: {
                        L27: {
                          L28: {
                            L29: {
                              L30: {
                                if (stackIn_227_0 == 0) {
                                  break L30;
                                } else {
                                  qf.field_e = qf.field_e ^ 1 << eh.field_a;
                                  bc.field_b = bc.field_b ^ 1 << eh.field_a;
                                  ud.field_b = ud.field_b - gh.field_l;
                                  jk.field_B = jk.field_B - 1;
                                  if (ch.field_d != 13) {
                                    if (n.field_a == 10) {
                                      continue L21;
                                    } else {
                                      stackOut_237_0 = mg.field_d;
                                      stackIn_350_0 = stackOut_237_0;
                                      stackIn_238_0 = stackOut_237_0;
                                      if (var11 != 0) {
                                        break L29;
                                      } else {
                                        L31: {
                                          if (!stackIn_238_0) {
                                            break L31;
                                          } else {
                                            if (n.field_a != 2) {
                                              break L31;
                                            } else {
                                              if (var11 == 0) {
                                                continue L21;
                                              } else {
                                                break L31;
                                              }
                                            }
                                          }
                                        }
                                        L32: {
                                          if (ad.field_e) {
                                            break L32;
                                          } else {
                                            L33: {
                                              if (84 != ch.field_d) {
                                                break L33;
                                              } else {
                                                dc.a(-22991, false);
                                                if (var11 == 0) {
                                                  continue L21;
                                                } else {
                                                  break L33;
                                                }
                                              }
                                            }
                                            L34: {
                                              if (va.field_j < 2) {
                                                break L34;
                                              } else {
                                                if (ch.field_d != 35) {
                                                  break L34;
                                                } else {
                                                  if (!ve.field_B[82]) {
                                                    break L34;
                                                  } else {
                                                    ue.b(31370);
                                                    if (var11 == 0) {
                                                      continue L21;
                                                    } else {
                                                      break L34;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            L35: {
                                              if (ch.field_d != 83) {
                                                break L35;
                                              } else {
                                                od discarded$7 = vk.a((byte) 78, dg.field_d[0]);
                                                wk.field_a.a(-10874);
                                                si.field_i.a(-10874);
                                                if (var11 == 0) {
                                                  continue L21;
                                                } else {
                                                  break L35;
                                                }
                                              }
                                            }
                                            L36: {
                                              if (85 != ch.field_d) {
                                                break L36;
                                              } else {
                                                if (od.field_g.field_e[0] == null) {
                                                  break L36;
                                                } else {
                                                  wh.f((byte) 104);
                                                  if (var11 == 0) {
                                                    continue L21;
                                                  } else {
                                                    break L36;
                                                  }
                                                }
                                              }
                                            }
                                            L37: {
                                              L38: {
                                                if (!i.a(sg.field_n, 160)) {
                                                  break L38;
                                                } else {
                                                  if (sg.field_n == 32) {
                                                    break L38;
                                                  } else {
                                                    if (od.field_g.field_e[11] == null) {
                                                      break L37;
                                                    } else {
                                                      break L38;
                                                    }
                                                  }
                                                }
                                              }
                                              L39: {
                                                L40: {
                                                  if (98 != ch.field_d) {
                                                    break L40;
                                                  } else {
                                                    if (n.field_a > 0) {
                                                      break L39;
                                                    } else {
                                                      break L40;
                                                    }
                                                  }
                                                }
                                                if (99 == ch.field_d) {
                                                  break L39;
                                                } else {
                                                  continue L21;
                                                }
                                              }
                                              var4 = 0;
                                              L41: while (true) {
                                                L42: {
                                                  if (var4 >= 12) {
                                                    break L42;
                                                  } else {
                                                    var5_ref = (Object) (Object) od.field_g.field_e[var4];
                                                    stackOut_269_0 = var5_ref;
                                                    stackIn_408_0 = (sj) (Object) stackOut_269_0;
                                                    stackIn_270_0 = stackOut_269_0;
                                                    if (var11 != 0) {
                                                      break L26;
                                                    } else {
                                                      if (stackIn_270_0 == null) {
                                                        break L42;
                                                      } else {
                                                        L43: {
                                                          if (((sj) var5_ref).field_k == null) {
                                                            break L43;
                                                          } else {
                                                            if (od.field_g == ((sj) var5_ref).field_k) {
                                                              break L43;
                                                            } else {
                                                              if (null == ((sj) var5_ref).field_k.field_e[((sj) var5_ref).field_s]) {
                                                                ((sj) var5_ref).a(((sj) var5_ref).field_s, 28, ((sj) var5_ref).field_k);
                                                                break L43;
                                                              } else {
                                                                break L43;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var4++;
                                                        if (var11 == 0) {
                                                          continue L41;
                                                        } else {
                                                          break L42;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var4 = 0;
                                                L44: while (true) {
                                                  L45: {
                                                    if (12 <= var4) {
                                                      break L45;
                                                    } else {
                                                      var5_ref = (Object) (Object) od.field_g.field_e[var4];
                                                      stackOut_279_0 = var5_ref;
                                                      stackIn_408_0 = (sj) (Object) stackOut_279_0;
                                                      stackIn_280_0 = stackOut_279_0;
                                                      if (var11 != 0) {
                                                        break L26;
                                                      } else {
                                                        L46: {
                                                          L47: {
                                                            if (stackIn_280_0 != null) {
                                                              break L47;
                                                            } else {
                                                              if (var11 == 0) {
                                                                break L46;
                                                              } else {
                                                                break L47;
                                                              }
                                                            }
                                                          }
                                                          L48: {
                                                            L49: {
                                                              if (((sj) var5_ref).field_h != 0) {
                                                                break L49;
                                                              } else {
                                                                var6_ref_j = si.field_i;
                                                                var7_ref = wk.field_a;
                                                                if (var11 == 0) {
                                                                  break L48;
                                                                } else {
                                                                  break L49;
                                                                }
                                                              }
                                                            }
                                                            var7_ref = si.field_i;
                                                            var6_ref_j = wk.field_a;
                                                            break L48;
                                                          }
                                                          var8 = 0;
                                                          L50: while (true) {
                                                            L51: {
                                                              if (~var6_ref_j.field_e.length >= ~var8) {
                                                                break L51;
                                                              } else {
                                                                stackOut_288_0 = var6_ref_j.field_e[var8];
                                                                stackIn_408_0 = stackOut_288_0;
                                                                stackIn_289_0 = stackOut_288_0;
                                                                if (var11 != 0) {
                                                                  break L26;
                                                                } else {
                                                                  if (stackIn_289_0 != null) {
                                                                    var8++;
                                                                    if (var11 == 0) {
                                                                      continue L50;
                                                                    } else {
                                                                      break L51;
                                                                    }
                                                                  } else {
                                                                    ((sj) var5_ref).a(var8, 28, var6_ref_j);
                                                                    var5_ref = null;
                                                                    break L51;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            if (var5_ref == null) {
                                                              break L46;
                                                            } else {
                                                              var8 = 0;
                                                              L52: while (true) {
                                                                if (var8 >= var7_ref.field_e.length) {
                                                                  break L46;
                                                                } else {
                                                                  stackOut_295_0 = var7_ref.field_e[var8];
                                                                  stackIn_408_0 = stackOut_295_0;
                                                                  stackIn_296_0 = stackOut_295_0;
                                                                  if (var11 != 0) {
                                                                    break L26;
                                                                  } else {
                                                                    L53: {
                                                                      if (stackIn_296_0 == null) {
                                                                        ((sj) var5_ref).a(var8, 28, var7_ref);
                                                                        if (var11 == 0) {
                                                                          break L46;
                                                                        } else {
                                                                          break L53;
                                                                        }
                                                                      } else {
                                                                        break L53;
                                                                      }
                                                                    }
                                                                    var8++;
                                                                    if (var11 == 0) {
                                                                      continue L52;
                                                                    } else {
                                                                      break L46;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var4++;
                                                        if (var11 == 0) {
                                                          continue L44;
                                                        } else {
                                                          break L45;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (ch.field_d != 98) {
                                                    continue L21;
                                                  } else {
                                                    var4_ref_String = vi.field_g[n.field_a + -1].toString();
                                                    var5 = 0;
                                                    L54: while (true) {
                                                      L55: {
                                                        if (var4_ref_String.length() <= var5) {
                                                          break L55;
                                                        } else {
                                                          var6 = var4_ref_String.charAt(var5);
                                                          var7_ref = null;
                                                          var8 = -1;
                                                          var9 = -1;
                                                          stackOut_305_0 = 0;
                                                          stackIn_227_0 = stackOut_305_0;
                                                          stackIn_306_0 = stackOut_305_0;
                                                          if (var11 != 0) {
                                                            continue L22;
                                                          } else {
                                                            var10 = stackIn_306_0;
                                                            L56: while (true) {
                                                              L57: {
                                                                L58: {
                                                                  if (12 <= var10) {
                                                                    break L58;
                                                                  } else {
                                                                    stackOut_308_0 = wk.field_a.field_e[var10];
                                                                    stackIn_325_0 = stackOut_308_0;
                                                                    stackIn_309_0 = stackOut_308_0;
                                                                    if (var11 != 0) {
                                                                      break L57;
                                                                    } else {
                                                                      L59: {
                                                                        if (stackIn_309_0 == null) {
                                                                          break L59;
                                                                        } else {
                                                                          if (~var6 != ~wk.field_a.field_e[var10].field_i) {
                                                                            break L59;
                                                                          } else {
                                                                            if (wk.field_a.field_e[var10].field_l > var9) {
                                                                              var8 = var10;
                                                                              var7_ref = wk.field_a;
                                                                              var9 = wk.field_a.field_e[var10].field_l;
                                                                              break L59;
                                                                            } else {
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      var10++;
                                                                      if (var11 == 0) {
                                                                        continue L56;
                                                                      } else {
                                                                        break L58;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                var10 = 0;
                                                                L60: while (true) {
                                                                  L61: {
                                                                    if (var10 >= 8) {
                                                                      break L61;
                                                                    } else {
                                                                      stackOut_317_0 = si.field_i.field_e[var10];
                                                                      stackIn_325_0 = stackOut_317_0;
                                                                      stackIn_318_0 = stackOut_317_0;
                                                                      if (var11 != 0) {
                                                                        break L57;
                                                                      } else {
                                                                        L62: {
                                                                          if (stackIn_318_0 == null) {
                                                                            break L62;
                                                                          } else {
                                                                            if (var6 != si.field_i.field_e[var10].field_i) {
                                                                              break L62;
                                                                            } else {
                                                                              if (var9 < si.field_i.field_e[var10].field_l) {
                                                                                var7_ref = si.field_i;
                                                                                var9 = si.field_i.field_e[var10].field_l;
                                                                                var8 = var10;
                                                                                break L62;
                                                                              } else {
                                                                                break L62;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        var10++;
                                                                        if (var11 == 0) {
                                                                          continue L60;
                                                                        } else {
                                                                          break L61;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  stackOut_324_0 = var7_ref.field_e[var8];
                                                                  stackIn_325_0 = stackOut_324_0;
                                                                  break L57;
                                                                }
                                                              }
                                                              ((sj) (Object) stackIn_325_0).a(var5, 28, od.field_g);
                                                              var5++;
                                                              if (var11 == 0) {
                                                                continue L54;
                                                              } else {
                                                                break L55;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      if (var11 == 0) {
                                                        continue L21;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            L63: {
                                              sg.field_n = qi.field_c.a(0, sg.field_n);
                                              if (0 != ig.field_l) {
                                                ig.field_l = sg.field_n & 255;
                                                break L63;
                                              } else {
                                                break L63;
                                              }
                                            }
                                            L64: {
                                              L65: {
                                                var4_ref_sj = w.a((byte)sg.field_n, false);
                                                if (var4_ref_sj == null) {
                                                  break L65;
                                                } else {
                                                  var5 = 0;
                                                  L66: while (true) {
                                                    L67: {
                                                      if (var5 >= 12) {
                                                        break L67;
                                                      } else {
                                                        stackOut_333_0 = null;
                                                        stackOut_333_1 = od.field_g.field_e[var5];
                                                        stackIn_362_0 = stackOut_333_0;
                                                        stackIn_362_1 = stackOut_333_1;
                                                        stackIn_334_0 = stackOut_333_0;
                                                        stackIn_334_1 = stackOut_333_1;
                                                        if (var11 != 0) {
                                                          break L28;
                                                        } else {
                                                          L68: {
                                                            if (stackIn_334_0 == (Object) (Object) stackIn_334_1) {
                                                              var4_ref_sj.a(var5, 28, od.field_g);
                                                              if (var11 == 0) {
                                                                break L67;
                                                              } else {
                                                                break L68;
                                                              }
                                                            } else {
                                                              break L68;
                                                            }
                                                          }
                                                          var5++;
                                                          if (var11 == 0) {
                                                            continue L66;
                                                          } else {
                                                            break L67;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (var11 == 0) {
                                                      break L64;
                                                    } else {
                                                      break L65;
                                                    }
                                                  }
                                                }
                                              }
                                              od discarded$8 = vk.a((byte) 91, dg.field_d[6]);
                                              break L64;
                                            }
                                            if (var11 == 0) {
                                              continue L21;
                                            } else {
                                              break L32;
                                            }
                                          }
                                        }
                                        a.field_S.b(false);
                                        if (!a.field_S.f(-9112)) {
                                          continue L21;
                                        } else {
                                          L69: {
                                            if (0 == a.field_S.field_d) {
                                              dc.a(-22991, false);
                                              break L69;
                                            } else {
                                              break L69;
                                            }
                                          }
                                          if (1 == a.field_S.field_d) {
                                            ad.field_e = false;
                                            if (var11 == 0) {
                                              continue L21;
                                            } else {
                                              break L30;
                                            }
                                          } else {
                                            continue L21;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L70: {
                                      if (!ad.field_e) {
                                        break L70;
                                      } else {
                                        ad.field_e = false;
                                        if (var11 == 0) {
                                          continue L21;
                                        } else {
                                          break L70;
                                        }
                                      }
                                    }
                                    L71: {
                                      if (mg.field_d) {
                                        stackOut_234_0 = 7;
                                        stackIn_235_0 = stackOut_234_0;
                                        break L71;
                                      } else {
                                        stackOut_233_0 = 1;
                                        stackIn_235_0 = stackOut_233_0;
                                        break L71;
                                      }
                                    }
                                    qf.field_d = stackIn_235_0;
                                    return;
                                  }
                                }
                              }
                              stackOut_349_0 = ad.field_e;
                              stackIn_350_0 = stackOut_349_0;
                              break L29;
                            }
                            L72: {
                              if (stackIn_350_0) {
                                a.field_S.a(-127, kk.a(336, ol.field_b, nk.field_c), kk.a(336, oa.field_j, bk.field_a));
                                if (!a.field_S.f(-9112)) {
                                  break L72;
                                } else {
                                  L73: {
                                    if (0 == a.field_S.field_d) {
                                      dc.a(-22991, true);
                                      break L73;
                                    } else {
                                      break L73;
                                    }
                                  }
                                  if (a.field_S.field_d != 1) {
                                    break L72;
                                  } else {
                                    ad.field_e = false;
                                    break L72;
                                  }
                                }
                              } else {
                                break L72;
                              }
                            }
                            L74: {
                              if (tg.field_d != 1) {
                                break L74;
                              } else {
                                if (!ad.field_e) {
                                  break L27;
                                } else {
                                  break L74;
                                }
                              }
                            }
                            stackOut_361_0 = null;
                            stackOut_361_1 = sg.field_d;
                            stackIn_362_0 = stackOut_361_0;
                            stackIn_362_1 = stackOut_361_1;
                            break L28;
                          }
                          if (stackIn_362_0 == (Object) (Object) stackIn_362_1) {
                            break L24;
                          } else {
                            L75: {
                              if (b.field_k != 0) {
                                break L75;
                              } else {
                                qi.a((byte) 125);
                                if (var11 == 0) {
                                  break L24;
                                } else {
                                  break L75;
                                }
                              }
                            }
                            ua.b((byte) 69);
                            if (var11 == 0) {
                              break L24;
                            } else {
                              break L27;
                            }
                          }
                        }
                        L76: {
                          qf.field_e = qf.field_e ^ 5 << bc.field_b;
                          hf.field_j = hf.field_j + ol.field_b;
                          vh.field_n = vh.field_n + ol.field_b;
                          nc.field_t = nc.field_t + nk.field_c;
                          bc.field_b = bc.field_b ^ 5 << bc.field_b;
                          ud.field_b = ud.field_b - nk.field_c;
                          if (oa.field_j < 264) {
                            break L76;
                          } else {
                            if (oa.field_j >= 428) {
                              break L76;
                            } else {
                              if (bk.field_a < 376) {
                                break L76;
                              } else {
                                if (bk.field_a >= 407) {
                                  break L76;
                                } else {
                                  dc.a(-22991, true);
                                  if (var11 == 0) {
                                    break L24;
                                  } else {
                                    break L76;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L77: {
                          if (134 > oa.field_j) {
                            break L77;
                          } else {
                            if (oa.field_j >= 242) {
                              break L77;
                            } else {
                              if (bk.field_a < 376) {
                                break L77;
                              } else {
                                if (407 > bk.field_a) {
                                  break L25;
                                } else {
                                  break L77;
                                }
                              }
                            }
                          }
                        }
                        L78: {
                          L79: {
                            L80: {
                              if (bk.field_a < 114) {
                                break L80;
                              } else {
                                if (bk.field_a >= 114 - -wl.field_K.field_m) {
                                  break L80;
                                } else {
                                  if (oa.field_j >= 34) {
                                    break L79;
                                  } else {
                                    break L80;
                                  }
                                }
                              }
                            }
                            L81: {
                              L82: {
                                if (bk.field_a < 190) {
                                  break L82;
                                } else {
                                  if (~bk.field_a <= ~(190 + wl.field_K.field_m)) {
                                    break L82;
                                  } else {
                                    if (oa.field_j >= 34) {
                                      break L81;
                                    } else {
                                      break L82;
                                    }
                                  }
                                }
                              }
                              if (bk.field_a < 247) {
                                break L78;
                              } else {
                                if (247 + wl.field_K.field_m <= bk.field_a) {
                                  break L78;
                                } else {
                                  if (161 > oa.field_j) {
                                    break L78;
                                  } else {
                                    L83: {
                                      var4 = (-161 + oa.field_j) / wl.field_K.field_n;
                                      if (var4 >= si.field_i.field_e.length) {
                                        break L83;
                                      } else {
                                        rk.field_p = -(-(var4 * wl.field_K.field_n) + (oa.field_j - 161));
                                        sg.field_d = si.field_i.field_e[var4];
                                        ek.field_e = 247 - bk.field_a;
                                        break L83;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L78;
                                    } else {
                                      break L81;
                                    }
                                  }
                                }
                              }
                            }
                            L84: {
                              var4 = (-34 + oa.field_j) / wl.field_K.field_n;
                              if (~var4 <= ~wk.field_a.field_e.length) {
                                break L84;
                              } else {
                                rk.field_p = -(oa.field_j - (34 - -(wl.field_K.field_n * var4)));
                                sg.field_d = wk.field_a.field_e[var4];
                                ek.field_e = -bk.field_a + 190;
                                break L84;
                              }
                            }
                            if (var11 == 0) {
                              break L78;
                            } else {
                              break L79;
                            }
                          }
                          var4 = (-34 + oa.field_j) / wl.field_K.field_n;
                          if (var4 >= od.field_g.field_e.length) {
                            break L78;
                          } else {
                            rk.field_p = -(-(var4 * wl.field_K.field_n) + -34 + oa.field_j);
                            sg.field_d = od.field_g.field_e[var4];
                            ek.field_e = 114 - bk.field_a;
                            break L78;
                          }
                        }
                        L85: {
                          if (va.field_j < 2) {
                            break L85;
                          } else {
                            if (0 >= ig.field_l) {
                              break L85;
                            } else {
                              if (sg.field_d != null) {
                                L86: {
                                  sg.field_d.field_i = (char)ig.field_l;
                                  if (!dk.field_b) {
                                    hf.field_j = hf.field_j + 1;
                                    nc.field_t = nc.field_t + 1;
                                    dk.field_b = true;
                                    break L86;
                                  } else {
                                    break L86;
                                  }
                                }
                                sg.field_d.field_v = qi.field_c.field_p[255 & sg.field_d.field_i];
                                var4_ref_sj = sg.field_d;
                                sg.field_d.field_l = 0;
                                ig.field_l = -1;
                                var4_ref_sj.field_h = 0;
                                break L85;
                              } else {
                                break L85;
                              }
                            }
                          }
                        }
                        if (null == sg.field_d) {
                          break L24;
                        } else {
                          stackOut_407_0 = nc.field_s;
                          stackIn_408_0 = stackOut_407_0;
                          break L26;
                        }
                      }
                      L87: {
                        L88: {
                          if (stackIn_408_0 != sg.field_d) {
                            break L88;
                          } else {
                            if (g.field_z > 0) {
                              break L87;
                            } else {
                              break L88;
                            }
                          }
                        }
                        g.field_z = 10;
                        nc.field_s = sg.field_d;
                        if (var11 == 0) {
                          break L24;
                        } else {
                          break L87;
                        }
                      }
                      L89: {
                        L90: {
                          L91: {
                            sg.field_d = null;
                            if (od.field_g == nc.field_s.field_o) {
                              break L91;
                            } else {
                              var4 = 0;
                              L92: while (true) {
                                L93: {
                                  if (12 <= var4) {
                                    break L93;
                                  } else {
                                    if (var11 != 0) {
                                      break L89;
                                    } else {
                                      L94: {
                                        if (od.field_g.field_e[var4] == null) {
                                          nc.field_s.a(var4, 28, od.field_g);
                                          if (var11 == 0) {
                                            break L93;
                                          } else {
                                            break L94;
                                          }
                                        } else {
                                          break L94;
                                        }
                                      }
                                      var4++;
                                      if (var11 == 0) {
                                        continue L92;
                                      } else {
                                        break L93;
                                      }
                                    }
                                  }
                                }
                                if (var11 == 0) {
                                  break L90;
                                } else {
                                  break L91;
                                }
                              }
                            }
                          }
                          eh.a(nc.field_s, 55);
                          break L90;
                        }
                        nc.field_s = null;
                        break L89;
                      }
                      if (var11 == 0) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                    od discarded$9 = vk.a((byte) 85, dg.field_d[0]);
                    wk.field_a.a(-10874);
                    si.field_i.a(-10874);
                    break L23;
                  }
                  break L23;
                }
                return;
              }
            }
          } else {
            L95: {
              if (0 > jl.field_j) {
                break L95;
              } else {
                L96: {
                  L97: {
                    if (~(-1 + n.field_a) == ~jl.field_j) {
                      break L97;
                    } else {
                      if (!hd.field_a) {
                        break L96;
                      } else {
                        break L97;
                      }
                    }
                  }
                  o.field_i = o.field_i + 10;
                  if (237 - -o.field_i >= 480) {
                    hd.field_a = false;
                    jl.field_j = jl.field_j + 1;
                    if (var11 == 0) {
                      break L95;
                    } else {
                      break L96;
                    }
                  } else {
                    break L95;
                  }
                }
                if (o.field_i > 0) {
                  o.field_i = o.field_i - 10;
                  break L95;
                } else {
                  break L95;
                }
              }
            }
            L98: {
              L99: {
                if (re.field_A == 0) {
                  break L99;
                } else {
                  L100: {
                    if (re.field_A != 1) {
                      break L100;
                    } else {
                      var4 = 1;
                      var5_ref = (Object) (Object) wk.field_a.field_e;
                      var6 = 0;
                      L101: while (true) {
                        L102: {
                          L103: {
                            L104: {
                              if (var6 >= ((Object[]) var5_ref).length) {
                                break L104;
                              } else {
                                var7_ref = (j) ((Object[]) var5_ref)[var6];
                                if (var11 != 0) {
                                  break L103;
                                } else {
                                  L105: {
                                    if (var7_ref == null) {
                                      break L105;
                                    } else {
                                      L106: {
                                        if (((sj) (Object) var7_ref).field_p == ((sj) (Object) var7_ref).field_q) {
                                          break L106;
                                        } else {
                                          var4 = 0;
                                          if (var11 == 0) {
                                            break L104;
                                          } else {
                                            break L106;
                                          }
                                        }
                                      }
                                      if (((sj) (Object) var7_ref).field_p != 190) {
                                        break L105;
                                      } else {
                                        ((sj) (Object) var7_ref).field_p = ((sj) (Object) var7_ref).field_p + wl.field_K.field_m;
                                        var4 = 0;
                                        if (var11 == 0) {
                                          break L104;
                                        } else {
                                          break L105;
                                        }
                                      }
                                    }
                                  }
                                  var6++;
                                  if (var11 == 0) {
                                    continue L101;
                                  } else {
                                    break L104;
                                  }
                                }
                              }
                            }
                            if (0 == n.field_a) {
                              break L103;
                            } else {
                              break L102;
                            }
                          }
                          L107: {
                            if (dc.field_a < 50) {
                              break L107;
                            } else {
                              if (var4 != 0) {
                                dc.field_a = 0;
                                if (var11 == 0) {
                                  break L102;
                                } else {
                                  break L107;
                                }
                              } else {
                                break L102;
                              }
                            }
                          }
                          var4 = 0;
                          break L102;
                        }
                        L108: {
                          if (var4 == 0) {
                            break L108;
                          } else {
                            re.field_A = 2;
                            break L108;
                          }
                        }
                        if (var11 == 0) {
                          break L98;
                        } else {
                          break L100;
                        }
                      }
                    }
                  }
                  L109: {
                    if (2 != re.field_A) {
                      break L109;
                    } else {
                      L110: {
                        if (n.field_a == 10) {
                          break L110;
                        } else {
                          L111: {
                            if (!mg.field_d) {
                              break L111;
                            } else {
                              if (2 != n.field_a) {
                                break L111;
                              } else {
                                break L110;
                              }
                            }
                          }
                          var4 = 1;
                          var5_ref = (Object) (Object) od.field_g.field_e;
                          var6 = 0;
                          L112: while (true) {
                            L113: {
                              L114: {
                                if (var6 >= ((Object[]) var5_ref).length) {
                                  break L114;
                                } else {
                                  var7_ref = (j) ((Object[]) var5_ref)[var6];
                                  if (var11 != 0) {
                                    break L113;
                                  } else {
                                    L115: {
                                      L116: {
                                        if (var7_ref != null) {
                                          break L116;
                                        } else {
                                          if (var11 == 0) {
                                            break L115;
                                          } else {
                                            break L116;
                                          }
                                        }
                                      }
                                      L117: {
                                        if (((sj) (Object) var7_ref).field_q != ((sj) (Object) var7_ref).field_p) {
                                          break L117;
                                        } else {
                                          if (((sj) (Object) var7_ref).field_p != 114) {
                                            break L115;
                                          } else {
                                            var4 = 0;
                                            ((sj) (Object) var7_ref).field_p = 190;
                                            if (var11 == 0) {
                                              break L114;
                                            } else {
                                              break L117;
                                            }
                                          }
                                        }
                                      }
                                      var4 = 0;
                                      if (var11 == 0) {
                                        break L114;
                                      } else {
                                        break L115;
                                      }
                                    }
                                    var6++;
                                    if (var11 == 0) {
                                      continue L112;
                                    } else {
                                      break L114;
                                    }
                                  }
                                }
                              }
                              if (n.field_a != 0) {
                                break L113;
                              } else {
                                L118: {
                                  if (dc.field_a < 50) {
                                    break L118;
                                  } else {
                                    if (var4 != 0) {
                                      dc.field_a = 0;
                                      if (var11 == 0) {
                                        break L113;
                                      } else {
                                        break L118;
                                      }
                                    } else {
                                      break L113;
                                    }
                                  }
                                }
                                var4 = 0;
                                break L113;
                              }
                            }
                            L119: {
                              if (var4 != 0) {
                                re.field_A = 3;
                                break L119;
                              } else {
                                break L119;
                              }
                            }
                            if (var11 == 0) {
                              break L98;
                            } else {
                              break L109;
                            }
                          }
                        }
                      }
                      var4 = 0;
                      L120: while (true) {
                        L121: {
                          if (!pc.b(-128)) {
                            stackOut_94_0 = 1;
                            stackIn_95_0 = stackOut_94_0;
                            break L121;
                          } else {
                            L122: {
                              L123: {
                                if (ch.field_d == 13) {
                                  break L123;
                                } else {
                                  if (84 == ch.field_d) {
                                    break L123;
                                  } else {
                                    break L122;
                                  }
                                }
                              }
                              var4 = 1;
                              break L122;
                            }
                            if (13 != ch.field_d) {
                              continue L120;
                            } else {
                              stackOut_91_0 = mg.field_d;
                              stackIn_95_0 = stackOut_91_0 ? 1 : 0;
                              stackIn_92_0 = stackOut_91_0;
                              if (var11 != 0) {
                                break L121;
                              } else {
                                if (!stackIn_92_0) {
                                  continue L120;
                                } else {
                                  qf.field_d = 0;
                                  return;
                                }
                              }
                            }
                          }
                        }
                        L124: {
                          if (stackIn_95_0 != tg.field_d) {
                            break L124;
                          } else {
                            if (ol.field_b < 264) {
                              break L124;
                            } else {
                              if (ol.field_b >= 428) {
                                break L124;
                              } else {
                                if (nk.field_c < 376) {
                                  break L124;
                                } else {
                                  if (nk.field_c >= 407) {
                                    break L124;
                                  } else {
                                    var4 = 1;
                                    break L124;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L125: {
                          if (1000 <= dc.field_a) {
                            var4 = 1;
                            break L125;
                          } else {
                            break L125;
                          }
                        }
                        L126: {
                          if (var4 == 0) {
                            break L126;
                          } else {
                            L127: {
                              if (!mg.field_d) {
                                break L127;
                              } else {
                                mg.field_d = false;
                                hd.field_a = true;
                                if (var11 == 0) {
                                  break L126;
                                } else {
                                  break L127;
                                }
                              }
                            }
                            L128: {
                              if (!qj.b((byte) 97)) {
                                break L128;
                              } else {
                                qf.field_d = 5;
                                if (var11 == 0) {
                                  break L126;
                                } else {
                                  break L128;
                                }
                              }
                            }
                            L129: {
                              if (0 != hc.field_u) {
                                stackOut_113_0 = 6;
                                stackIn_114_0 = stackOut_113_0;
                                break L129;
                              } else {
                                stackOut_112_0 = 2;
                                stackIn_114_0 = stackOut_112_0;
                                break L129;
                              }
                            }
                            qf.field_d = stackIn_114_0;
                            break L126;
                          }
                        }
                        return;
                      }
                    }
                  }
                  L130: {
                    if (3 != re.field_A) {
                      break L130;
                    } else {
                      L131: {
                        wk.field_a.a(true);
                        si.field_i.a(true);
                        if (n.field_a == 10) {
                          break L131;
                        } else {
                          L132: {
                            if (!mg.field_d) {
                              break L132;
                            } else {
                              if (2 == n.field_a) {
                                break L131;
                              } else {
                                break L132;
                              }
                            }
                          }
                          var4_ref_sj__ = od.field_g.field_e;
                          var5 = 0;
                          L133: while (true) {
                            L134: {
                              if (~var5 <= ~var4_ref_sj__.length) {
                                break L134;
                              } else {
                                var6_ref_sj = var4_ref_sj__[var5];
                                if (var11 != 0) {
                                  break L98;
                                } else {
                                  L135: {
                                    if (var6_ref_sj == null) {
                                      break L135;
                                    } else {
                                      var6_ref_sj.field_x = false;
                                      var6_ref_sj.field_l = var6_ref_sj.field_l + 1;
                                      if (var6_ref_sj.field_h >= 3) {
                                        break L135;
                                      } else {
                                        var6_ref_sj.field_h = var6_ref_sj.field_h + 1;
                                        break L135;
                                      }
                                    }
                                  }
                                  var5++;
                                  if (var11 == 0) {
                                    continue L133;
                                  } else {
                                    break L134;
                                  }
                                }
                              }
                            }
                            L136: {
                              L137: {
                                L138: {
                                  L139: {
                                    var4_ref_char__ = new char[8];
                                    if (!mg.field_d) {
                                      break L139;
                                    } else {
                                      if (n.field_a != 1) {
                                        break L139;
                                      } else {
                                        if (null != qi.field_c.field_n) {
                                          break L138;
                                        } else {
                                          break L139;
                                        }
                                      }
                                    }
                                  }
                                  qi.field_c.a((byte) 92, var4_ref_char__);
                                  var5 = li.a(8, o.field_o, false);
                                  var6 = 0;
                                  L140: while (true) {
                                    L141: {
                                      if (~var4_ref_char__.length >= ~var6) {
                                        break L141;
                                      } else {
                                        si.field_i.field_e[var6] = w.a(si.field_i, var6, qi.field_c, (byte) 30, var4_ref_char__[var6]);
                                        stackOut_156_0 = si.field_i;
                                        stackIn_170_0 = stackOut_156_0;
                                        stackIn_157_0 = stackOut_156_0;
                                        if (var11 != 0) {
                                          break L136;
                                        } else {
                                          L142: {
                                            stackOut_157_0 = stackIn_157_0.field_e[var6];
                                            stackIn_159_0 = stackOut_157_0;
                                            stackIn_158_0 = stackOut_157_0;
                                            if (var5 != var6) {
                                              stackOut_159_0 = (sj) (Object) stackIn_159_0;
                                              stackOut_159_1 = 0;
                                              stackIn_160_0 = stackOut_159_0;
                                              stackIn_160_1 = stackOut_159_1;
                                              break L142;
                                            } else {
                                              stackOut_158_0 = (sj) (Object) stackIn_158_0;
                                              stackOut_158_1 = 1;
                                              stackIn_160_0 = stackOut_158_0;
                                              stackIn_160_1 = stackOut_158_1;
                                              break L142;
                                            }
                                          }
                                          stackIn_160_0.field_x = stackIn_160_1 != 0;
                                          si.field_i.field_e[var6].field_p = 247 + -wl.field_K.field_m;
                                          si.field_i.field_e[var6].field_q = 247 + -wl.field_K.field_m;
                                          var6++;
                                          if (var11 == 0) {
                                            continue L140;
                                          } else {
                                            break L141;
                                          }
                                        }
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L137;
                                    } else {
                                      break L138;
                                    }
                                  }
                                }
                                var5 = 0;
                                L143: while (true) {
                                  if (~var5 <= ~qi.field_c.field_n.length()) {
                                    break L137;
                                  } else {
                                    si.field_i.field_e[var5] = w.a(si.field_i, var5, qi.field_c, (byte) 105, qi.field_c.field_n.charAt(var5));
                                    stackOut_164_0 = si.field_i;
                                    stackIn_170_0 = stackOut_164_0;
                                    stackIn_165_0 = stackOut_164_0;
                                    if (var11 != 0) {
                                      break L136;
                                    } else {
                                      L144: {
                                        stackOut_165_0 = stackIn_165_0.field_e[var5];
                                        stackIn_167_0 = stackOut_165_0;
                                        stackIn_166_0 = stackOut_165_0;
                                        if (var5 != 1) {
                                          stackOut_167_0 = (sj) (Object) stackIn_167_0;
                                          stackOut_167_1 = 0;
                                          stackIn_168_0 = stackOut_167_0;
                                          stackIn_168_1 = stackOut_167_1;
                                          break L144;
                                        } else {
                                          stackOut_166_0 = (sj) (Object) stackIn_166_0;
                                          stackOut_166_1 = 1;
                                          stackIn_168_0 = stackOut_166_0;
                                          stackIn_168_1 = stackOut_166_1;
                                          break L144;
                                        }
                                      }
                                      stackIn_168_0.field_x = stackIn_168_1 != 0;
                                      si.field_i.field_e[var5].field_p = 247 + -wl.field_K.field_m;
                                      si.field_i.field_e[var5].field_q = 247 + -wl.field_K.field_m;
                                      var5++;
                                      if (var11 == 0) {
                                        continue L143;
                                      } else {
                                        break L137;
                                      }
                                    }
                                  }
                                }
                              }
                              wk.field_a.field_c = 114;
                              stackOut_169_0 = wk.field_a;
                              stackIn_170_0 = stackOut_169_0;
                              break L136;
                            }
                            stackIn_170_0.field_d = 34;
                            re.field_A = 4;
                            if (var11 == 0) {
                              break L98;
                            } else {
                              break L131;
                            }
                          }
                        }
                      }
                      re.field_A = 6;
                      if (var11 == 0) {
                        break L98;
                      } else {
                        break L130;
                      }
                    }
                  }
                  L145: {
                    if (4 == re.field_A) {
                      break L145;
                    } else {
                      if (re.field_A == 5) {
                        L146: {
                          var12 = wk.field_a;
                          var4_ref_j = var12;
                          wk.field_a = od.field_g;
                          wk.field_a.field_d = 34;
                          od.field_g = var12;
                          wk.field_a.field_c = 190;
                          re.field_A = 6;
                          od.field_g.field_c = 114;
                          if (jl.field_j != 3) {
                            break L146;
                          } else {
                            jl.field_j = jl.field_j + 1;
                            break L146;
                          }
                        }
                        od.field_g.field_d = 34;
                        if (var11 == 0) {
                          break L98;
                        } else {
                          break L145;
                        }
                      } else {
                        break L98;
                      }
                    }
                  }
                  var4 = 1;
                  var5_ref = (Object) (Object) si.field_i.field_e;
                  var6 = 0;
                  L147: while (true) {
                    L148: {
                      L149: {
                        if (((Object[]) var5_ref).length <= var6) {
                          break L149;
                        } else {
                          var7_ref = (j) ((Object[]) var5_ref)[var6];
                          if (var11 != 0) {
                            break L148;
                          } else {
                            L150: {
                              if (var7_ref == null) {
                                break L150;
                              } else {
                                L151: {
                                  if (((sj) (Object) var7_ref).field_p == ((sj) (Object) var7_ref).field_q) {
                                    break L151;
                                  } else {
                                    var4 = 0;
                                    if (var11 == 0) {
                                      break L149;
                                    } else {
                                      break L151;
                                    }
                                  }
                                }
                                if (((sj) (Object) var7_ref).field_p != 247) {
                                  ((sj) (Object) var7_ref).field_p = 247;
                                  var4 = 0;
                                  if (var11 == 0) {
                                    break L149;
                                  } else {
                                    break L150;
                                  }
                                } else {
                                  break L150;
                                }
                              }
                            }
                            var6++;
                            if (var11 == 0) {
                              continue L147;
                            } else {
                              break L149;
                            }
                          }
                        }
                      }
                      if (n.field_a != 0) {
                        break L148;
                      } else {
                        L152: {
                          if (dc.field_a < 50) {
                            break L152;
                          } else {
                            if (var4 != 0) {
                              dc.field_a = 0;
                              if (var11 == 0) {
                                break L148;
                              } else {
                                break L152;
                              }
                            } else {
                              break L148;
                            }
                          }
                        }
                        var4 = 0;
                        break L148;
                      }
                    }
                    L153: {
                      if (var4 != 0) {
                        re.field_A = 5;
                        break L153;
                      } else {
                        break L153;
                      }
                    }
                    if (var11 == 0) {
                      break L98;
                    } else {
                      break L99;
                    }
                  }
                }
              }
              var4 = 1;
              var5_ref = (Object) (Object) si.field_i.field_e;
              var6 = 0;
              L154: while (true) {
                L155: {
                  if (~((Object[]) var5_ref).length >= ~var6) {
                    break L155;
                  } else {
                    var7_ref = (j) ((Object[]) var5_ref)[var6];
                    if (var11 != 0) {
                      break L98;
                    } else {
                      L156: {
                        if (var7_ref == null) {
                          break L156;
                        } else {
                          L157: {
                            if (~((sj) (Object) var7_ref).field_q != ~((sj) (Object) var7_ref).field_p) {
                              break L157;
                            } else {
                              if (((sj) (Object) var7_ref).field_p != 247) {
                                break L156;
                              } else {
                                var4 = 0;
                                ((sj) (Object) var7_ref).field_p = ((sj) (Object) var7_ref).field_p + wl.field_K.field_m;
                                if (var11 == 0) {
                                  break L155;
                                } else {
                                  break L157;
                                }
                              }
                            }
                          }
                          var4 = 0;
                          if (var11 == 0) {
                            break L155;
                          } else {
                            break L156;
                          }
                        }
                      }
                      var6++;
                      if (var11 == 0) {
                        continue L154;
                      } else {
                        break L155;
                      }
                    }
                  }
                }
                if (var4 == 0) {
                  break L98;
                } else {
                  re.field_A = 1;
                  break L98;
                }
              }
            }
            return;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Menu";
        field_l = "Updates will sent to the email address you've given";
    }
}

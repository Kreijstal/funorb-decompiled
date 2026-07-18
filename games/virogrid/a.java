/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a extends cc {
    static int field_y;
    static int[] field_F;
    static int[] field_C;
    static int[] field_J;
    static hh field_H;
    static int[] field_B;
    static int[] field_G;
    static boolean field_D;
    static String field_A;
    static int[] field_E;
    static String field_z;

    a(int param0) {
        this(dj.field_h, param0);
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (de.field_pb != null) {
              return;
            } else {
              L1: {
                lc.field_e = new String[12];
                lc.field_e[2] = sn.field_p;
                lc.field_e[3] = ql.field_j;
                lc.field_e[1] = ql.field_j;
                lc.field_e[7] = pi.field_d;
                lc.field_e[11] = cm.field_j;
                lc.field_e[5] = ql.field_j;
                lc.field_e[8] = uf.field_F;
                lc.field_e[6] = j.field_a;
                if (param0 == 69) {
                  break L1;
                } else {
                  field_E = null;
                  break L1;
                }
              }
              lc.field_e[9] = qm.field_Ob;
              de.field_pb = new String[29];
              lc.field_e[4] = ql.field_j;
              lc.field_e[0] = mj.field_G;
              de.field_pb[14] = sk.field_c;
              de.field_pb[13] = jm.field_d;
              de.field_pb[15] = sd.field_d;
              de.field_pb[4] = j.field_a;
              de.field_pb[0] = cm.field_j;
              de.field_pb[16] = we.field_b;
              de.field_pb[6] = rb.field_d;
              de.field_pb[9] = kg.field_h;
              de.field_pb[11] = th.field_s;
              de.field_pb[19] = hk.field_Gb;
              de.field_pb[2] = cj.field_f;
              de.field_pb[3] = uf.field_F;
              de.field_pb[10] = cf.field_a;
              de.field_pb[12] = mf.field_i;
              de.field_pb[8] = ai.field_b;
              de.field_pb[7] = lh.field_d;
              de.field_pb[18] = hg.field_n;
              de.field_pb[17] = ac.field_b;
              de.field_pb[1] = ha.field_g;
              de.field_pb[5] = pi.field_d;
              de.field_pb[23] = pj.field_e;
              de.field_pb[28] = dh.field_v + ": ";
              de.field_pb[27] = gh.field_Lb;
              de.field_pb[22] = wn.field_z;
              de.field_pb[21] = sm.field_d;
              de.field_pb[25] = pg.field_i;
              de.field_pb[20] = og.field_t[0];
              de.field_pb[24] = te.field_c;
              de.field_pb[26] = rk.field_b;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "a.S(" + param0 + ')');
        }
    }

    public static void c(boolean param0) {
        field_J = null;
        field_C = null;
        field_z = null;
        field_F = null;
        field_E = null;
        field_G = null;
        field_H = null;
        if (param0) {
            return;
        }
        try {
            field_A = null;
            field_B = null;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "a.M(" + param0 + ')');
        }
    }

    private a(e param0, int param1) {
        super(param0, param1);
    }

    final String c(fi param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
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
              if (param1 == 218479361) {
                break L1;
              } else {
                a.b(117);
                break L1;
              }
            }
            stackOut_3_0 = f.a('*', param0.field_n.length(), (byte) -99);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("a.P(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static v a(String param0, eh param1, int param2, String param3, eh param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        v stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        v stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param2 <= -52) {
              var5_int = param1.a(-1, param0);
              var6 = param1.a(-127, var5_int, param3);
              stackOut_3_0 = em.a(var5_int, var6, param1, false, param4);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (v) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("a.Q(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(String param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            L1: {
              fe.field_Fb = param2;
              co.field_d = false;
              if (hf.field_w == null) {
                break L1;
              } else {
                if (!hf.field_w.field_G) {
                  break L1;
                } else {
                  L2: {
                    if (8 != param1) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          param1 = 2;
                          if (!kb.field_c) {
                            break L4;
                          } else {
                            param0 = dd.field_c;
                            if (!Virogrid.field_F) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        param0 = wb.field_g;
                        break L3;
                      }
                      aa.field_a.a(-113, pm.field_g);
                      break L2;
                    }
                  }
                  L5: {
                    var3_int = 1;
                    if (10 == param1) {
                      var3_int = 0;
                      qh.f((byte) 98);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (var3_int != 0) {
                      L7: {
                        if (co.field_d) {
                          param0 = oi.a(new String[1], rk.field_h, 2);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (!p.field_f) {
                          break L8;
                        } else {
                          param0 = oh.field_a;
                          break L8;
                        }
                      }
                      hf.field_w.a(param1, true, param0);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (param1 == 256) {
                    break L1;
                  } else {
                    if (param1 != 10) {
                      if (kb.field_c) {
                        break L1;
                      } else {
                        aa.field_a.e((byte) -125);
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("a.N(");
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L9;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L9;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 12) {
                break L1;
              } else {
                a.b(19);
                break L1;
              }
            }
            var1 = da.field_g;
            var2 = 0;
            var3 = var1.length;
            L2: while (true) {
              L3: {
                L4: {
                  if (var2 >= var3) {
                    break L4;
                  } else {
                    int incrementValue$16 = var2;
                    var2++;
                    var1[incrementValue$16] = 0;
                    int incrementValue$17 = var2;
                    var2++;
                    var1[incrementValue$17] = 0;
                    int incrementValue$18 = var2;
                    var2++;
                    var1[incrementValue$18] = 0;
                    int incrementValue$19 = var2;
                    var2++;
                    var1[incrementValue$19] = 0;
                    int incrementValue$20 = var2;
                    var2++;
                    var1[incrementValue$20] = 0;
                    int incrementValue$21 = var2;
                    var2++;
                    var1[incrementValue$21] = 0;
                    int incrementValue$22 = var2;
                    var2++;
                    var1[incrementValue$22] = 0;
                    int incrementValue$23 = var2;
                    var2++;
                    var1[incrementValue$23] = 0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1_ref, "a.O(" + param0 + ')');
        }
    }

    final static void a(int param0, eh param1) {
        byte[] var2 = null;
        L0: {
          ql.field_m = param1;
          var2 = jl.a("waitingfor_patches", true);
          if (null == var2) {
            break L0;
          } else {
            String discarded$7 = i.a(-2022, var2);
            break L0;
          }
        }
        L1: {
          var2 = jl.a("loading_patches", true);
          if (var2 != null) {
            String discarded$8 = i.a(param0 ^ -2034, var2);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var2 = jl.a("TEXT_GAMENAME", true);
          if (null == var2) {
            break L2;
          } else {
            mj.field_G = i.a(-2022, var2);
            break L2;
          }
        }
        L3: {
          var2 = jl.a("TEXT_CREATE_ACCOUNT1", true);
          if (var2 == null) {
            break L3;
          } else {
            pc.field_a = i.a(-2022, var2);
            break L3;
          }
        }
        L4: {
          var2 = jl.a("TEXT_CREATE_ACCOUNT2", true);
          if (var2 == null) {
            break L4;
          } else {
            dd.field_f = i.a(-2022, var2);
            break L4;
          }
        }
        L5: {
          var2 = jl.a("TEXT_FULLSCREEN_TOGGLE", true);
          if (null == var2) {
            break L5;
          } else {
            rb.field_d = i.a(param0 + -2042, var2);
            break L5;
          }
        }
        L6: {
          var2 = jl.a("TEXT_MODE", true);
          if (var2 != null) {
            String discarded$9 = i.a(param0 + -2042, var2);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var2 = jl.a("TEXT_DETAIL", true);
          if (null == var2) {
            break L7;
          } else {
            ac.field_b = i.a(-2022, var2);
            break L7;
          }
        }
        L8: {
          var2 = jl.a("TEXT_OPTIONS", true);
          if (var2 != null) {
            pj.field_e = i.a(-2022, var2);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          var2 = jl.a("TEXT_RANKINGS_BYWINPERCENTAGE", true);
          if (null == var2) {
            break L9;
          } else {
            sm.field_d = i.a(-2022, var2);
            break L9;
          }
        }
        L10: {
          var2 = jl.a("TEXT_YOURCOLOUR", true);
          if (null != var2) {
            rf.field_f = i.a(-2022, var2);
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          var2 = jl.a("TEXT_OPPONENT", true);
          if (var2 == null) {
            break L11;
          } else {
            pc.field_e = i.a(-2022, var2);
            break L11;
          }
        }
        L12: {
          var2 = jl.a("TEXT_PLAYERS", true);
          if (var2 == null) {
            break L12;
          } else {
            lm.field_k = i.a(param0 ^ -2034, var2);
            break L12;
          }
        }
        L13: {
          var2 = jl.a("TEXT_YOUR_TURN_PLAYING", true);
          if (var2 == null) {
            break L13;
          } else {
            gf.field_B = i.a(-2022, var2);
            break L13;
          }
        }
        L14: {
          var2 = jl.a("TEXT_X_TURN_PLAYING", true);
          if (null != var2) {
            ie.field_b = i.a(-2022, var2);
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          var2 = jl.a("TEXT_X_TURN", true);
          if (null != var2) {
            hc.field_b = i.a(-2022, var2);
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          var2 = jl.a("TEXT_COLOUR_WHITE", true);
          if (null != var2) {
            pb.field_k = i.a(-2022, var2);
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          var2 = jl.a("TEXT_COLOUR_BLUE", true);
          if (null == var2) {
            break L17;
          } else {
            uk.field_g = i.a(-2022, var2);
            break L17;
          }
        }
        L18: {
          var2 = jl.a("TEXT_DRAWN", true);
          if (var2 == null) {
            break L18;
          } else {
            String discarded$10 = i.a(-2022, var2);
            break L18;
          }
        }
        L19: {
          var2 = jl.a("TEXT_WINS", true);
          if (var2 != null) {
            String discarded$11 = i.a(-2022, var2);
            break L19;
          } else {
            break L19;
          }
        }
        L20: {
          var2 = jl.a("TEXT_2D", true);
          if (var2 == null) {
            break L20;
          } else {
            sd.field_b = i.a(param0 ^ -2034, var2);
            break L20;
          }
        }
        L21: {
          var2 = jl.a("TEXT_3D", true);
          if (null != var2) {
            ld.field_f = i.a(-2022, var2);
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          var2 = jl.a("TEXT_SWITCH_2D", true);
          if (var2 != null) {
            sl.field_a = i.a(-2022, var2);
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          var2 = jl.a("TEXT_SWITCH_3D", true);
          if (null == var2) {
            break L23;
          } else {
            o.field_a = i.a(-2022, var2);
            break L23;
          }
        }
        L24: {
          var2 = jl.a("TEXT_BACK", true);
          if (null == var2) {
            break L24;
          } else {
            ai.field_b = i.a(-2022, var2);
            break L24;
          }
        }
        L25: {
          var2 = jl.a("TEXT_NOT_AVAILABLE_IN_2D", true);
          if (null != var2) {
            fn.field_g = i.a(-2022, var2);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          var2 = jl.a("TEXT_RESET_VIEW", true);
          if (var2 != null) {
            String discarded$12 = i.a(-2022, var2);
            break L26;
          } else {
            break L26;
          }
        }
        L27: {
          var2 = jl.a("TEXT_ERROR", true);
          if (null != var2) {
            qm.field_Ob = i.a(-2022, var2);
            break L27;
          } else {
            break L27;
          }
        }
        L28: {
          if (param0 == 20) {
            break L28;
          } else {
            field_E = null;
            break L28;
          }
        }
        L29: {
          var2 = jl.a("TEXT_PLAY_AGAIN", true);
          if (var2 == null) {
            break L29;
          } else {
            hg.field_n = i.a(-2022, var2);
            break L29;
          }
        }
        L30: {
          var2 = jl.a("TEXT_RATED_ACHIEVEMENTS", true);
          if (var2 != null) {
            dg.field_G = i.a(param0 + -2042, var2);
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          var2 = jl.a("TEXT_ENDGAME_ENTRAPMENT", true);
          if (var2 != null) {
            ee.field_f = i.a(-2022, var2);
            break L31;
          } else {
            break L31;
          }
        }
        L32: {
          var2 = jl.a("TEXT_ENDGAME_ENTRAPMENT_YOU", true);
          if (var2 != null) {
            vc.field_db = i.a(-2022, var2);
            break L32;
          } else {
            break L32;
          }
        }
        L33: {
          var2 = jl.a("TEXT_ENDGAME_BOARDFILLED", true);
          if (null == var2) {
            break L33;
          } else {
            rc.field_i = i.a(-2022, var2);
            break L33;
          }
        }
        L34: {
          var2 = jl.a("TEXT_ENDGAME_BOARDFILLED_YOU", true);
          if (null != var2) {
            fh.field_a = i.a(-2022, var2);
            break L34;
          } else {
            break L34;
          }
        }
        L35: {
          var2 = jl.a("TEXT_ENDGAME_BOARDFILLED_DRAW", true);
          if (var2 != null) {
            vf.field_d = i.a(-2022, var2);
            break L35;
          } else {
            break L35;
          }
        }
        L36: {
          var2 = jl.a("TEXT_ENDGAME_NOPIECES", true);
          if (var2 != null) {
            cg.field_e = i.a(-2022, var2);
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          var2 = jl.a("TEXT_ENDGAME_NOPIECES_YOU", true);
          if (var2 != null) {
            id.field_f = i.a(-2022, var2);
            break L37;
          } else {
            break L37;
          }
        }
        L38: {
          var2 = jl.a("TEXT_ENDGAME_NOTIME", true);
          if (null == var2) {
            break L38;
          } else {
            dd.field_d = i.a(param0 ^ -2034, var2);
            break L38;
          }
        }
        L39: {
          var2 = jl.a("TEXT_ENDGAME_NOTIME_YOU", true);
          if (null == var2) {
            break L39;
          } else {
            ao.field_Nb = i.a(-2022, var2);
            break L39;
          }
        }
        L40: {
          var2 = jl.a("TEXT_ENDGAME_RESIGNED", true);
          if (var2 != null) {
            vm.field_a = i.a(param0 + -2042, var2);
            break L40;
          } else {
            break L40;
          }
        }
        L41: {
          var2 = jl.a("TEXT_ENDGAME_RESIGNED_YOU", true);
          if (null != var2) {
            pg.field_a = i.a(param0 ^ -2034, var2);
            break L41;
          } else {
            break L41;
          }
        }
        L42: {
          var2 = jl.a("TEXT_VIEWCONTROLS_LEFT", true);
          if (var2 != null) {
            mc.field_d = i.a(-2022, var2);
            break L42;
          } else {
            break L42;
          }
        }
        L43: {
          var2 = jl.a("TEXT_VIEWCONTROLS_RIGHT", true);
          if (var2 != null) {
            pn.field_C = i.a(-2022, var2);
            break L43;
          } else {
            break L43;
          }
        }
        L44: {
          var2 = jl.a("TEXT_VIEWCONTROLS_ZOOMOUT", true);
          if (null != var2) {
            vb.field_i = i.a(param0 ^ -2034, var2);
            break L44;
          } else {
            break L44;
          }
        }
        L45: {
          var2 = jl.a("TEXT_VIEWCONTROLS_ZOOMIN", true);
          if (null != var2) {
            cb.field_b = i.a(param0 ^ -2034, var2);
            break L45;
          } else {
            break L45;
          }
        }
        L46: {
          var2 = jl.a("TEXT_VIEWCONTROLS_CENTRE", true);
          if (var2 != null) {
            ia.field_a = i.a(-2022, var2);
            break L46;
          } else {
            break L46;
          }
        }
        L47: {
          var2 = jl.a("TEXT_VIEWCONTROLS_MODE", true);
          if (var2 == null) {
            break L47;
          } else {
            um.field_Kb = i.a(-2022, var2);
            break L47;
          }
        }
        L48: {
          var2 = jl.a("PLAYERNAME_HOTSEAT_2", true);
          if (var2 == null) {
            break L48;
          } else {
            em.field_e = i.a(param0 + -2042, var2);
            break L48;
          }
        }
        L49: {
          var2 = jl.a("PLAYERNAME_HOTSEAT_1", true);
          if (var2 != null) {
            mb.field_eb = i.a(param0 + -2042, var2);
            break L49;
          } else {
            break L49;
          }
        }
        L50: {
          var2 = jl.a("TEXT_BOOTSEQUENCE", true);
          if (var2 != null) {
            jk.field_e = i.a(-2022, var2);
            break L50;
          } else {
            break L50;
          }
        }
        L51: {
          var2 = jl.a("TEXT_BOOTSEQUENCE_HALLOWEEN", true);
          if (null != var2) {
            ge.field_a = i.a(-2022, var2);
            break L51;
          } else {
            break L51;
          }
        }
        L52: {
          var2 = jl.a("DETAIL_NAMES,0", true);
          if (var2 == null) {
            break L52;
          } else {
            cc.field_v[0] = i.a(-2022, var2);
            break L52;
          }
        }
        L53: {
          var2 = jl.a("DETAIL_NAMES,1", true);
          if (var2 == null) {
            break L53;
          } else {
            cc.field_v[1] = i.a(-2022, var2);
            break L53;
          }
        }
        L54: {
          var2 = jl.a("DETAIL_NAMES,2", true);
          if (var2 != null) {
            cc.field_v[2] = i.a(-2022, var2);
            break L54;
          } else {
            break L54;
          }
        }
        L55: {
          var2 = jl.a("DETAIL_NAMES,3", true);
          if (null == var2) {
            break L55;
          } else {
            cc.field_v[3] = i.a(param0 + -2042, var2);
            break L55;
          }
        }
        L56: {
          var2 = jl.a("achievement_names,0", true);
          if (null == var2) {
            break L56;
          } else {
            qk.field_d[0] = i.a(-2022, var2);
            break L56;
          }
        }
        L57: {
          var2 = jl.a("achievement_names,1", true);
          if (null != var2) {
            qk.field_d[1] = i.a(-2022, var2);
            break L57;
          } else {
            break L57;
          }
        }
        L58: {
          var2 = jl.a("achievement_names,2", true);
          if (null == var2) {
            break L58;
          } else {
            qk.field_d[2] = i.a(jd.a(param0, -2034), var2);
            break L58;
          }
        }
        L59: {
          var2 = jl.a("achievement_names,3", true);
          if (null == var2) {
            break L59;
          } else {
            qk.field_d[3] = i.a(-2022, var2);
            break L59;
          }
        }
        L60: {
          var2 = jl.a("achievement_names,4", true);
          if (null != var2) {
            qk.field_d[4] = i.a(-2022, var2);
            break L60;
          } else {
            break L60;
          }
        }
        L61: {
          var2 = jl.a("achievement_names,5", true);
          if (var2 != null) {
            qk.field_d[5] = i.a(-2022, var2);
            break L61;
          } else {
            break L61;
          }
        }
        L62: {
          var2 = jl.a("achievement_names,6", true);
          if (var2 != null) {
            qk.field_d[6] = i.a(jd.a(param0, -2034), var2);
            break L62;
          } else {
            break L62;
          }
        }
        L63: {
          var2 = jl.a("achievement_names,7", true);
          if (null == var2) {
            break L63;
          } else {
            qk.field_d[7] = i.a(param0 + -2042, var2);
            break L63;
          }
        }
        L64: {
          var2 = jl.a("achievement_names,8", true);
          if (null == var2) {
            break L64;
          } else {
            qk.field_d[8] = i.a(-2022, var2);
            break L64;
          }
        }
        L65: {
          var2 = jl.a("achievement_names,9", true);
          if (null == var2) {
            break L65;
          } else {
            qk.field_d[9] = i.a(-2022, var2);
            break L65;
          }
        }
        L66: {
          var2 = jl.a("achievement_criteria,0", true);
          if (null != var2) {
            ak.field_b[0] = i.a(jd.a(param0, -2034), var2);
            break L66;
          } else {
            break L66;
          }
        }
        L67: {
          var2 = jl.a("achievement_criteria,1", true);
          if (null == var2) {
            break L67;
          } else {
            ak.field_b[1] = i.a(-2022, var2);
            break L67;
          }
        }
        L68: {
          var2 = jl.a("achievement_criteria,2", true);
          if (null != var2) {
            ak.field_b[2] = i.a(-2022, var2);
            break L68;
          } else {
            break L68;
          }
        }
        L69: {
          var2 = jl.a("achievement_criteria,3", true);
          if (var2 == null) {
            break L69;
          } else {
            ak.field_b[3] = i.a(-2022, var2);
            break L69;
          }
        }
        L70: {
          var2 = jl.a("achievement_criteria,4", true);
          if (null == var2) {
            break L70;
          } else {
            ak.field_b[4] = i.a(-2022, var2);
            break L70;
          }
        }
        L71: {
          var2 = jl.a("achievement_criteria,5", true);
          if (var2 == null) {
            break L71;
          } else {
            ak.field_b[5] = i.a(-2022, var2);
            break L71;
          }
        }
        L72: {
          var2 = jl.a("achievement_criteria,6", true);
          if (var2 == null) {
            break L72;
          } else {
            ak.field_b[6] = i.a(-2022, var2);
            break L72;
          }
        }
        L73: {
          var2 = jl.a("achievement_criteria,7", true);
          if (null == var2) {
            break L73;
          } else {
            ak.field_b[7] = i.a(-2022, var2);
            break L73;
          }
        }
        L74: {
          var2 = jl.a("achievement_criteria,8", true);
          if (null != var2) {
            ak.field_b[8] = i.a(-2022, var2);
            break L74;
          } else {
            break L74;
          }
        }
        L75: {
          var2 = jl.a("achievement_criteria,9", true);
          if (var2 != null) {
            ak.field_b[9] = i.a(-2022, var2);
            break L75;
          } else {
            break L75;
          }
        }
        L76: {
          var2 = jl.a("text_login_or_discard", true);
          if (var2 != null) {
            String discarded$13 = i.a(-2022, var2);
            break L76;
          } else {
            break L76;
          }
        }
        L77: {
          var2 = jl.a("gameoptlabels,0", true);
          if (null != var2) {
            wf.field_e[0] = i.a(jd.a(param0, -2034), var2);
            break L77;
          } else {
            break L77;
          }
        }
        L78: {
          var2 = jl.a("gameoptlabels,1", true);
          if (null != var2) {
            wf.field_e[1] = i.a(-2022, var2);
            break L78;
          } else {
            break L78;
          }
        }
        L79: {
          var2 = jl.a("gameoptnames,0,0", true);
          if (null == var2) {
            break L79;
          } else {
            wc.field_c[0][0] = i.a(-2022, var2);
            break L79;
          }
        }
        L80: {
          var2 = jl.a("gameoptnames,0,1", true);
          if (var2 != null) {
            wc.field_c[0][1] = i.a(-2022, var2);
            break L80;
          } else {
            break L80;
          }
        }
        L81: {
          var2 = jl.a("gameoptnames,0,2", true);
          if (var2 != null) {
            wc.field_c[0][2] = i.a(-2022, var2);
            break L81;
          } else {
            break L81;
          }
        }
        L82: {
          var2 = jl.a("gameoptnames,0,3", true);
          if (var2 == null) {
            break L82;
          } else {
            wc.field_c[0][3] = i.a(-2022, var2);
            break L82;
          }
        }
        L83: {
          var2 = jl.a("gameoptnames,0,4", true);
          if (var2 != null) {
            wc.field_c[0][4] = i.a(-2022, var2);
            break L83;
          } else {
            break L83;
          }
        }
        L84: {
          var2 = jl.a("gameoptnames,0,5", true);
          if (var2 != null) {
            wc.field_c[0][5] = i.a(-2022, var2);
            break L84;
          } else {
            break L84;
          }
        }
        L85: {
          var2 = jl.a("gameoptnames,0,6", true);
          if (var2 != null) {
            wc.field_c[0][6] = i.a(-2022, var2);
            break L85;
          } else {
            break L85;
          }
        }
        L86: {
          var2 = jl.a("gameoptnames,1,0", true);
          if (null == var2) {
            break L86;
          } else {
            wc.field_c[1][0] = i.a(-2022, var2);
            break L86;
          }
        }
        L87: {
          var2 = jl.a("gameoptnames,1,1", true);
          if (null == var2) {
            break L87;
          } else {
            wc.field_c[1][1] = i.a(-2022, var2);
            break L87;
          }
        }
        L88: {
          var2 = jl.a("gameoptnames,1,2", true);
          if (null != var2) {
            wc.field_c[1][2] = i.a(-2022, var2);
            break L88;
          } else {
            break L88;
          }
        }
        L89: {
          var2 = jl.a("hotseatmenulabel", true);
          if (var2 != null) {
            cm.field_j = i.a(param0 + -2042, var2);
            break L89;
          } else {
            break L89;
          }
        }
        L90: {
          var2 = jl.a("hotseatoption_gridwidth_colon", true);
          if (var2 == null) {
            break L90;
          } else {
            pg.field_i = i.a(param0 + -2042, var2);
            break L90;
          }
        }
        L91: {
          var2 = jl.a("hotseatoption_turnduration_colon", true);
          if (null == var2) {
            break L91;
          } else {
            rk.field_b = i.a(-2022, var2);
            break L91;
          }
        }
        L92: {
          var2 = jl.a("hotseatoption_ailevel_colon", true);
          if (var2 == null) {
            break L92;
          } else {
            gh.field_Lb = i.a(-2022, var2);
            break L92;
          }
        }
        L93: {
          var2 = jl.a("ailevelnames,0", true);
          if (var2 != null) {
            mh.field_i[0] = i.a(-2022, var2);
            break L93;
          } else {
            break L93;
          }
        }
        L94: {
          var2 = jl.a("ailevelnames,1", true);
          if (null == var2) {
            break L94;
          } else {
            mh.field_i[1] = i.a(-2022, var2);
            break L94;
          }
        }
        L95: {
          var2 = jl.a("ailevelnames,2", true);
          if (var2 != null) {
            mh.field_i[2] = i.a(-2022, var2);
            break L95;
          } else {
            break L95;
          }
        }
        L96: {
          var2 = jl.a("ailevelnames,3", true);
          if (var2 != null) {
            mh.field_i[3] = i.a(-2022, var2);
            break L96;
          } else {
            break L96;
          }
        }
        L97: {
          var2 = jl.a("tutorial1", true);
          if (var2 == null) {
            break L97;
          } else {
            ee.field_b = i.a(-2022, var2);
            break L97;
          }
        }
        L98: {
          var2 = jl.a("tutorial2", true);
          if (null != var2) {
            gl.field_h = i.a(-2022, var2);
            break L98;
          } else {
            break L98;
          }
        }
        L99: {
          var2 = jl.a("tutorial3", true);
          if (var2 == null) {
            break L99;
          } else {
            fa.field_h = i.a(-2022, var2);
            break L99;
          }
        }
        L100: {
          var2 = jl.a("tutorial4", true);
          if (var2 == null) {
            break L100;
          } else {
            jd.field_a = i.a(param0 ^ -2034, var2);
            break L100;
          }
        }
        L101: {
          var2 = jl.a("text_removed_from_game", true);
          if (var2 != null) {
            mi.field_f = i.a(param0 + -2042, var2);
            break L101;
          } else {
            break L101;
          }
        }
        L102: {
          var2 = jl.a("text_lobby_pleaselogin", true);
          if (null != var2) {
            he.field_cc = i.a(-2022, var2);
            break L102;
          } else {
            break L102;
          }
        }
        L103: {
          var2 = jl.a("instructions_pages,0", true);
          if (null != var2) {
            em.field_b[0] = i.a(-2022, var2);
            break L103;
          } else {
            break L103;
          }
        }
        L104: {
          var2 = jl.a("instructions_pages,1", true);
          if (null == var2) {
            break L104;
          } else {
            em.field_b[1] = i.a(-2022, var2);
            break L104;
          }
        }
        ql.field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = 0;
        field_G = new int[10];
        field_F = new int[10];
        field_B = new int[10];
        field_J = new int[10];
        field_C = new int[10];
        field_H = new hh();
        field_z = "<%0> is not on your ignore list.";
        field_A = "Remove name";
    }
}

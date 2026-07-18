/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static vc field_d;
    static int field_e;
    static int field_c;
    static String field_g;
    static int field_f;
    static ui field_a;
    static String[] field_b;

    final static void a(int param0, ll param1, int param2) {
        RuntimeException runtimeException = null;
        ih var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var3 = ud.field_b;
            var3.e(8, param2);
            if (param0 == -14722) {
              var3.a(-11, 5);
              var3.a(-11, 0);
              var3.b((byte) 112, param1.field_k);
              var3.a(-11, param1.field_q);
              var3.a(-11, param1.field_t);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ak.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
    }

    final static String a(boolean param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        String stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_21_0 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var1_ref = "(" + hc.field_j + " " + rj.field_k + " " + vi.field_a + ") " + be.field_a;
                if (pd.field_l <= 0) {
                  break L3;
                } else {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L4: while (true) {
                    if (~pd.field_l >= ~var2) {
                      break L3;
                    } else {
                      stackOut_7_0 = var1_ref + ' ';
                      stackIn_22_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L5: {
                          L6: {
                            var1_ref = stackIn_8_0;
                            var3 = 255 & ae.field_a.field_k[var2];
                            var4 = var3 >> -383249756;
                            if (var4 < 10) {
                              break L6;
                            } else {
                              var4 += 55;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4 += 48;
                          break L5;
                        }
                        L7: {
                          L8: {
                            var3 = var3 & 15;
                            var1_ref = var1_ref + (char)var4;
                            if (var3 >= 10) {
                              break L8;
                            } else {
                              var3 += 48;
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 += 55;
                          break L7;
                        }
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_21_0 = (String) var1_ref;
              stackIn_22_0 = stackOut_21_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "ak.A(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    public static void b(boolean param0) {
        field_b = null;
        if (param0) {
            return;
        }
        try {
            field_g = null;
            field_d = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ak.D(" + param0 + ')');
        }
    }

    public final String toString() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "ak.toString()");
        }
    }

    final static boolean a(char param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 67) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (param0 < 65) {
                    break L4;
                  } else {
                    if (param0 <= 90) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (param0 < 97) {
                    break L5;
                  } else {
                    if (param0 > 122) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              stackOut_13_0 = 1;
              stackIn_16_0 = stackOut_13_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "ak.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final static int a(int param0, int param1, boolean param2, ad param3, int param4, String param5, ad param6) {
        RuntimeException var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        ni stackIn_20_0 = null;
        ni stackIn_22_0 = null;
        ni stackIn_24_0 = null;
        ni stackIn_25_0 = null;
        String stackIn_25_1 = null;
        ni stackIn_26_0 = null;
        ni stackIn_28_0 = null;
        ni stackIn_29_0 = null;
        String stackIn_29_1 = null;
        int stackIn_52_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_102_0 = 0;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        String stackIn_115_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        ni stackOut_19_0 = null;
        ni stackOut_24_0 = null;
        String stackOut_24_1 = null;
        ni stackOut_20_0 = null;
        ni stackOut_22_0 = null;
        String stackOut_22_1 = null;
        ni stackOut_25_0 = null;
        ni stackOut_28_0 = null;
        String stackOut_28_1 = null;
        ni stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_51_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_101_0 = 0;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        String stackOut_114_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        var13 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_ref = param3.b(param1 ^ -15051);
              var8 = param6.b(-127);
              if (null == sg.field_h) {
                var9 = id.a(false, false) ? 1 : 0;
                if (var9 != 0) {
                  break L1;
                } else {
                  stackOut_5_0 = -1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 15021) {
                break L2;
              } else {
                field_c = -74;
                break L2;
              }
            }
            L3: {
              if (rh.field_k == d.field_O) {
                L4: {
                  L5: {
                    bb.field_A = null;
                    ud.field_b.field_i = 0;
                    if (null == param5) {
                      break L5;
                    } else {
                      L6: {
                        var9 = 0;
                        sd.field_i.field_i = 0;
                        if (!param2) {
                          break L6;
                        } else {
                          var9 = var9 | 1;
                          break L6;
                        }
                      }
                      L7: {
                        sd.field_i.a(jj.field_R.nextInt(), (byte) -63);
                        sd.field_i.a(jj.field_R.nextInt(), (byte) -15);
                        sd.field_i.a(var7_ref, (byte) 61);
                        sd.field_i.a(var8, (byte) -113);
                        sd.field_i.a(qb.a((CharSequence) (Object) param5, (byte) -76), (byte) 75);
                        sd.field_i.b((byte) 111, param4);
                        sd.field_i.a(param1 + -15032, param0);
                        sd.field_i.a(-11, var9);
                        ud.field_b.a(-11, 18);
                        ud.field_b.field_i = ud.field_b.field_i + 2;
                        var10 = ud.field_b.field_i;
                        var11_ref_String = w.a(0, rl.a((byte) -62));
                        if (var11_ref_String != null) {
                          break L7;
                        } else {
                          var11_ref_String = "";
                          break L7;
                        }
                      }
                      ud.field_b.a(param1 + -15147, var11_ref_String);
                      cg.a(fj.field_c, -126, sd.field_i, (ni) (Object) ud.field_b, de.field_k);
                      ud.field_b.a((byte) 121, -var10 + ud.field_b.field_i);
                      if (var13 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L8: {
                    sd.field_i.field_i = 0;
                    sd.field_i.a(jj.field_R.nextInt(), (byte) -102);
                    sd.field_i.a(jj.field_R.nextInt(), (byte) -98);
                    stackOut_19_0 = sd.field_i;
                    stackIn_24_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (!param3.a(47)) {
                      stackOut_24_0 = (ni) (Object) stackIn_24_0;
                      stackOut_24_1 = "";
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      break L8;
                    } else {
                      stackOut_20_0 = (ni) (Object) stackIn_20_0;
                      stackIn_22_0 = stackOut_20_0;
                      stackOut_22_0 = (ni) (Object) stackIn_22_0;
                      stackOut_22_1 = (String) var7_ref;
                      stackIn_25_0 = stackOut_22_0;
                      stackIn_25_1 = stackOut_22_1;
                      break L8;
                    }
                  }
                  L9: {
                    ((ni) (Object) stackIn_25_0).a(stackIn_25_1, (byte) -109);
                    stackOut_25_0 = sd.field_i;
                    stackIn_28_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (!param6.a(42)) {
                      stackOut_28_0 = (ni) (Object) stackIn_28_0;
                      stackOut_28_1 = "";
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      break L9;
                    } else {
                      stackOut_26_0 = (ni) (Object) stackIn_26_0;
                      stackOut_26_1 = (String) var8;
                      stackIn_29_0 = stackOut_26_0;
                      stackIn_29_1 = stackOut_26_1;
                      break L9;
                    }
                  }
                  ((ni) (Object) stackIn_29_0).a(stackIn_29_1, (byte) -124);
                  ud.field_b.a(-11, 16);
                  ud.field_b.field_i = ud.field_b.field_i + 1;
                  var9 = ud.field_b.field_i;
                  cg.a(fj.field_c, -120, sd.field_i, (ni) (Object) ud.field_b, de.field_k);
                  ud.field_b.c((byte) -31, ud.field_b.field_i - var9);
                  break L4;
                }
                dk.b((byte) 41, -1);
                rh.field_k = ue.field_c;
                break L3;
              } else {
                break L3;
              }
            }
            L10: {
              if (rh.field_k == ue.field_c) {
                if (!gi.a(1, true)) {
                  break L10;
                } else {
                  L11: {
                    var9 = ae.field_a.e(false);
                    ae.field_a.field_i = 0;
                    if (100 > var9) {
                      break L11;
                    } else {
                      if (var9 <= 105) {
                        rh.field_k = u.field_b;
                        tc.field_e = new String[var9 - 100];
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (248 == var9) {
                      break L12;
                    } else {
                      L13: {
                        if (var9 != 99) {
                          break L13;
                        } else {
                          boolean discarded$1 = gi.a(cm.b(param1 ^ 15059), true);
                          bb.field_A = new Boolean(sd.a((ni) (Object) ae.field_a, 16448));
                          ae.field_a.field_i = 0;
                          if (var13 == 0) {
                            break L10;
                          } else {
                            break L13;
                          }
                        }
                      }
                      rh.field_k = gd.field_b;
                      pd.field_l = -1;
                      be.field_a = var9;
                      if (var13 == 0) {
                        break L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                  bj.a(14, rl.a((byte) -80));
                  fh.field_a = rf.field_q;
                  k.c(-28354);
                  aa.field_q = false;
                  stackOut_51_0 = var9;
                  stackIn_52_0 = stackOut_51_0;
                  return stackIn_52_0;
                }
              } else {
                break L10;
              }
            }
            L14: {
              if (u.field_b != rh.field_k) {
                break L14;
              } else {
                var9 = 2;
                if (gi.a(var9, true)) {
                  var10 = ae.field_a.d((byte) -111);
                  ae.field_a.field_i = 0;
                  if (gi.a(var10, true)) {
                    var11 = tc.field_e.length;
                    var12 = 0;
                    L15: while (true) {
                      L16: {
                        L17: {
                          if (~var12 <= ~var11) {
                            break L17;
                          } else {
                            tc.field_e[var12] = ae.field_a.e(-84);
                            var12++;
                            if (var13 != 0) {
                              break L16;
                            } else {
                              if (var13 == 0) {
                                continue L15;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                        k.c(-28354);
                        aa.field_q = false;
                        break L16;
                      }
                      stackOut_68_0 = 100 + var11;
                      stackIn_69_0 = stackOut_68_0;
                      return stackIn_69_0;
                    }
                  } else {
                    break L14;
                  }
                } else {
                  break L14;
                }
              }
            }
            L18: {
              if (rh.field_k == gd.field_b) {
                if (gf.b(param1 + -14911)) {
                  L19: {
                    L20: {
                      if (be.field_a != 255) {
                        break L20;
                      } else {
                        L21: {
                          var9_ref_String = ae.field_a.a((byte) -115);
                          if (null != var9_ref_String) {
                            ea.a(376, rl.a((byte) -93), var9_ref_String);
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        if (var13 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    fh.field_a = ae.field_a.h(param1 + -15021);
                    break L19;
                  }
                  k.c(param1 ^ -21613);
                  aa.field_q = false;
                  stackOut_84_0 = be.field_a;
                  stackIn_85_0 = stackOut_84_0;
                  return stackIn_85_0;
                } else {
                  break L18;
                }
              } else {
                break L18;
              }
            }
            L22: {
              if (sg.field_h == null) {
                if (!aa.field_q) {
                  var9 = be.field_b;
                  be.field_b = ab.field_d;
                  ab.field_d = var9;
                  aa.field_q = true;
                  break L22;
                } else {
                  L23: {
                    L24: {
                      if (h.b(param1 ^ 15050) <= 30000L) {
                        break L24;
                      } else {
                        fh.field_a = ok.field_B;
                        if (var13 == 0) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    fh.field_a = jc.field_d;
                    break L23;
                  }
                  aa.field_q = false;
                  stackOut_98_0 = 249;
                  stackIn_99_0 = stackOut_98_0;
                  return stackIn_99_0;
                }
              } else {
                break L22;
              }
            }
            stackOut_101_0 = -1;
            stackIn_102_0 = stackOut_101_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var7 = decompiledCaughtException;
            stackOut_103_0 = (RuntimeException) var7;
            stackOut_103_1 = new StringBuilder().append("ak.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_106_0 = stackOut_103_0;
            stackIn_106_1 = stackOut_103_1;
            stackIn_104_0 = stackOut_103_0;
            stackIn_104_1 = stackOut_103_1;
            if (param3 == null) {
              stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
              stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
              stackOut_106_2 = "null";
              stackIn_107_0 = stackOut_106_0;
              stackIn_107_1 = stackOut_106_1;
              stackIn_107_2 = stackOut_106_2;
              break L25;
            } else {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "{...}";
              stackIn_107_0 = stackOut_104_0;
              stackIn_107_1 = stackOut_104_1;
              stackIn_107_2 = stackOut_104_2;
              break L25;
            }
          }
          L26: {
            stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
            stackOut_107_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_107_2).append(',').append(param4).append(',');
            stackIn_110_0 = stackOut_107_0;
            stackIn_110_1 = stackOut_107_1;
            stackIn_108_0 = stackOut_107_0;
            stackIn_108_1 = stackOut_107_1;
            if (param5 == null) {
              stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
              stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
              stackOut_110_2 = "null";
              stackIn_111_0 = stackOut_110_0;
              stackIn_111_1 = stackOut_110_1;
              stackIn_111_2 = stackOut_110_2;
              break L26;
            } else {
              stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
              stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
              stackOut_108_2 = "{...}";
              stackIn_111_0 = stackOut_108_0;
              stackIn_111_1 = stackOut_108_1;
              stackIn_111_2 = stackOut_108_2;
              break L26;
            }
          }
          L27: {
            stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
            stackOut_111_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_111_2).append(',');
            stackIn_114_0 = stackOut_111_0;
            stackIn_114_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param6 == null) {
              stackOut_114_0 = (RuntimeException) (Object) stackIn_114_0;
              stackOut_114_1 = (StringBuilder) (Object) stackIn_114_1;
              stackOut_114_2 = "null";
              stackIn_115_0 = stackOut_114_0;
              stackIn_115_1 = stackOut_114_1;
              stackIn_115_2 = stackOut_114_2;
              break L27;
            } else {
              stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
              stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
              stackOut_112_2 = "{...}";
              stackIn_115_0 = stackOut_112_0;
              stackIn_115_1 = stackOut_112_1;
              stackIn_115_2 = stackOut_112_2;
              break L27;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_115_0, stackIn_115_2 + ')');
        }
        return stackIn_102_0;
    }

    final static void a(int param0) {
        try {
            ic.n(-125);
            cg.a((byte) -105, 4);
            if (param0 <= 37) {
                ak.a(50);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ak.F(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new vc();
        field_e = 0;
        field_g = "<%0>Wall:<%1> Fleas can walk on these, but can't climb up the sides.";
        field_c = 0;
        field_b = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}

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
        ih var3 = ud.field_b;
        var3.e(8, param2);
        if (param0 != -14722) {
            return;
        }
        try {
            var3.a(-11, 5);
            var3.a(-11, 0);
            var3.b((byte) 112, param1.field_k);
            var3.a(-11, param1.field_q);
            var3.a(-11, param1.field_t);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ak.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static String a(boolean param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_16_0 = null;
        String stackOut_5_0 = null;
        String stackOut_15_0 = null;
        L0: {
          var5 = fleas.field_A ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var1 = "(" + hc.field_j + " " + rj.field_k + " " + vi.field_a + ") " + be.field_a;
            if (pd.field_l <= 0) {
              break L2;
            } else {
              var1 = var1 + ":";
              var2 = 0;
              L3: while (true) {
                if (pd.field_l <= var2) {
                  break L2;
                } else {
                  stackOut_5_0 = var1 + 32;
                  stackIn_16_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L4: {
                      L5: {
                        var1 = stackIn_6_0;
                        var3 = 255 & ae.field_a.field_k[var2];
                        var4 = var3 >> 4;
                        if (var4 < 10) {
                          break L5;
                        } else {
                          var4 += 55;
                          if (var5 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var4 += 48;
                      break L4;
                    }
                    L6: {
                      L7: {
                        var3 = var3 & 15;
                        var1 = var1 + (char)var4;
                        if (var3 >= 10) {
                          break L7;
                        } else {
                          var3 += 48;
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var3 += 55;
                      break L6;
                    }
                    var1 = var1 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          stackOut_15_0 = (String) var1;
          stackIn_16_0 = stackOut_15_0;
          break L1;
        }
        return stackIn_16_0;
    }

    public static void b(boolean param0) {
        field_b = null;
        if (param0) {
            return;
        }
        field_g = null;
        field_d = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param1 == 67) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param0 < 65) {
                break L3;
              } else {
                if (param0 <= 90) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 97) {
                break L4;
              } else {
                if (param0 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
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
        CharSequence var14 = null;
        int stackIn_5_0 = 0;
        ni stackIn_17_0 = null;
        ni stackIn_18_0 = null;
        ni stackIn_19_0 = null;
        String stackIn_19_1 = null;
        ni stackIn_20_0 = null;
        ni stackIn_21_0 = null;
        ni stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_37_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        ni stackOut_16_0 = null;
        ni stackOut_18_0 = null;
        String stackOut_18_1 = null;
        ni stackOut_17_0 = null;
        String stackOut_17_1 = null;
        ni stackOut_19_0 = null;
        ni stackOut_21_0 = null;
        String stackOut_21_1 = null;
        ni stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_36_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_74_0 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var13 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_ref = param3.b(param1 ^ -15051);
              var11_ref_String = var7_ref;
              var11_ref_String = var7_ref;
              var8 = param6.b(-127);
              var11_ref_String = var8;
              var11_ref_String = var8;
              if (null == sg.field_h) {
                if (id.a(false, false)) {
                  break L1;
                } else {
                  stackOut_4_0 = -1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
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
                    if (param5 == null) {
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
                        var14 = (CharSequence) (Object) param5;
                        sd.field_i.a(qb.a(var14, (byte) -76), (byte) 75);
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
                    stackOut_16_0 = sd.field_i;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (!param3.a(47)) {
                      stackOut_18_0 = (ni) (Object) stackIn_18_0;
                      stackOut_18_1 = "";
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L8;
                    } else {
                      stackOut_17_0 = (ni) (Object) stackIn_17_0;
                      stackOut_17_1 = (String) var7_ref;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      break L8;
                    }
                  }
                  L9: {
                    ((ni) (Object) stackIn_19_0).a(stackIn_19_1, (byte) -109);
                    stackOut_19_0 = sd.field_i;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (!param6.a(42)) {
                      stackOut_21_0 = (ni) (Object) stackIn_21_0;
                      stackOut_21_1 = "";
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      break L9;
                    } else {
                      stackOut_20_0 = (ni) (Object) stackIn_20_0;
                      stackOut_20_1 = (String) var8;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      break L9;
                    }
                  }
                  ((ni) (Object) stackIn_22_0).a(stackIn_22_1, (byte) -124);
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
                  stackOut_36_0 = var9;
                  stackIn_37_0 = stackOut_36_0;
                  return stackIn_37_0;
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
                        if (var12 >= var11) {
                          k.c(-28354);
                          aa.field_q = false;
                          break L16;
                        } else {
                          tc.field_e[var12] = ae.field_a.e(-84);
                          var12++;
                          if (var13 != 0) {
                            break L16;
                          } else {
                            continue L15;
                          }
                        }
                      }
                      stackOut_50_0 = 100 + var11;
                      stackIn_51_0 = stackOut_50_0;
                      return stackIn_51_0;
                    }
                  } else {
                    break L14;
                  }
                } else {
                  break L14;
                }
              }
            }
            L17: {
              if (rh.field_k == gd.field_b) {
                if (gf.b(param1 + -14911)) {
                  L18: {
                    L19: {
                      if (be.field_a != 255) {
                        break L19;
                      } else {
                        L20: {
                          var9_ref_String = ae.field_a.a((byte) -115);
                          if (var9_ref_String != null) {
                            ea.a(376, rl.a((byte) -93), var9_ref_String);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        if (var13 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    fh.field_a = ae.field_a.h(param1 + -15021);
                    break L18;
                  }
                  k.c(param1 ^ -21613);
                  aa.field_q = false;
                  stackOut_62_0 = be.field_a;
                  stackIn_63_0 = stackOut_62_0;
                  return stackIn_63_0;
                } else {
                  break L17;
                }
              } else {
                break L17;
              }
            }
            L21: {
              if (sg.field_h == null) {
                if (!aa.field_q) {
                  var9 = be.field_b;
                  be.field_b = ab.field_d;
                  ab.field_d = var9;
                  aa.field_q = true;
                  break L21;
                } else {
                  L22: {
                    L23: {
                      if (h.b(param1 ^ 15050) <= 30000L) {
                        break L23;
                      } else {
                        fh.field_a = ok.field_B;
                        if (var13 == 0) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    fh.field_a = jc.field_d;
                    break L22;
                  }
                  aa.field_q = false;
                  stackOut_71_0 = 249;
                  stackIn_72_0 = stackOut_71_0;
                  return stackIn_72_0;
                }
              } else {
                break L21;
              }
            }
            stackOut_74_0 = -1;
            stackIn_75_0 = stackOut_74_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var7 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var7;
            stackOut_76_1 = new StringBuilder().append("ak.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param3 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L24;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L24;
            }
          }
          L25: {
            stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
            stackOut_79_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(44).append(param4).append(44);
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param5 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L25;
            } else {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L25;
            }
          }
          L26: {
            stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
            stackOut_82_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(44);
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param6 == null) {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L26;
            } else {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L26;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_85_0, stackIn_85_2 + 41);
        }
        return stackIn_75_0;
    }

    final static void a(int param0) {
        ic.n(-125);
        cg.a((byte) -105, 4);
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

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

    final static void a(int param0, ll param1) {
        ih var3 = ud.field_b;
        var3.e(8, 3);
        try {
            var3.a(-11, 5);
            var3.a(-11, 0);
            var3.b((byte) 112, param1.field_k);
            var3.a(-11, param1.field_q);
            var3.a(-11, param1.field_t);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ak.C(" + -14722 + 44 + (param1 != null ? "{...}" : "null") + 44 + 3 + 41);
        }
    }

    final static String a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = fleas.field_A ? 1 : 0;
        String var1 = "(" + hc.field_j + " " + rj.field_k + " " + vi.field_a + ") " + be.field_a;
        if (pd.field_l > 0) {
            var1 = var1 + ":";
            for (var2 = 0; pd.field_l > var2; var2++) {
                var1 = var1 + 32;
                var3 = 255 & ae.field_a.field_k[var2];
                var4 = var3 >> 4;
                if (var4 >= 10) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                var3 = var3 & 15;
                var1 = var1 + (char)var4;
                if (var3 < 10) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var1 + (char)var3;
            }
        }
        return var1;
    }

    public static void b() {
        field_b = null;
        field_g = null;
        field_d = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(char param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            L2: {
              if (param0 < 65) {
                break L2;
              } else {
                if (param0 <= 90) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 < 97) {
                break L3;
              } else {
                if (param0 > 122) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        return stackIn_8_0 != 0;
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
        ni stackIn_15_0 = null;
        ni stackIn_16_0 = null;
        ni stackIn_17_0 = null;
        String stackIn_17_1 = null;
        ni stackIn_18_0 = null;
        ni stackIn_19_0 = null;
        ni stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        ni stackOut_14_0 = null;
        ni stackOut_16_0 = null;
        String stackOut_16_1 = null;
        ni stackOut_15_0 = null;
        String stackOut_15_1 = null;
        ni stackOut_17_0 = null;
        ni stackOut_19_0 = null;
        String stackOut_19_1 = null;
        ni stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_32_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_65_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var13 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_ref = param3.b(-104);
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
              if (rh.field_k == d.field_O) {
                L3: {
                  bb.field_A = null;
                  ud.field_b.field_i = 0;
                  if (param5 == null) {
                    L4: {
                      sd.field_i.field_i = 0;
                      sd.field_i.a(jj.field_R.nextInt(), (byte) -102);
                      sd.field_i.a(jj.field_R.nextInt(), (byte) -98);
                      stackOut_14_0 = sd.field_i;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if (!param3.a(47)) {
                        stackOut_16_0 = (ni) (Object) stackIn_16_0;
                        stackOut_16_1 = "";
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        break L4;
                      } else {
                        stackOut_15_0 = (ni) (Object) stackIn_15_0;
                        stackOut_15_1 = (String) var7_ref;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        break L4;
                      }
                    }
                    L5: {
                      ((ni) (Object) stackIn_17_0).a(stackIn_17_1, (byte) -109);
                      stackOut_17_0 = sd.field_i;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (!param6.a(42)) {
                        stackOut_19_0 = (ni) (Object) stackIn_19_0;
                        stackOut_19_1 = "";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        break L5;
                      } else {
                        stackOut_18_0 = (ni) (Object) stackIn_18_0;
                        stackOut_18_1 = (String) var8;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        break L5;
                      }
                    }
                    ((ni) (Object) stackIn_20_0).a(stackIn_20_1, (byte) -124);
                    ud.field_b.a(-11, 16);
                    ud.field_b.field_i = ud.field_b.field_i + 1;
                    var9 = ud.field_b.field_i;
                    cg.a(fj.field_c, -120, sd.field_i, (ni) (Object) ud.field_b, de.field_k);
                    ud.field_b.c((byte) -31, ud.field_b.field_i - var9);
                    break L3;
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
                      int discarded$3 = -76;
                      sd.field_i.a(qb.a(var14), (byte) 75);
                      sd.field_i.b((byte) 111, param4);
                      sd.field_i.a(-11, param0);
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
                    ud.field_b.a(-126, var11_ref_String);
                    cg.a(fj.field_c, -126, sd.field_i, (ni) (Object) ud.field_b, de.field_k);
                    ud.field_b.a((byte) 121, -var10 + ud.field_b.field_i);
                    break L3;
                  }
                }
                dk.b((byte) 41, -1);
                rh.field_k = ue.field_c;
                break L2;
              } else {
                break L2;
              }
            }
            L8: {
              if (rh.field_k == ue.field_c) {
                if (!gi.a(1, true)) {
                  break L8;
                } else {
                  L9: {
                    var9 = ae.field_a.e(false);
                    ae.field_a.field_i = 0;
                    if (100 > var9) {
                      break L9;
                    } else {
                      if (var9 <= 105) {
                        rh.field_k = u.field_b;
                        tc.field_e = new String[var9 - 100];
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (248 == var9) {
                    bj.a(14, rl.a((byte) -80));
                    fh.field_a = rf.field_q;
                    k.c(-28354);
                    aa.field_q = false;
                    stackOut_32_0 = var9;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0;
                  } else {
                    if (var9 != 99) {
                      rh.field_k = gd.field_b;
                      pd.field_l = -1;
                      be.field_a = var9;
                      break L8;
                    } else {
                      boolean discarded$4 = gi.a(cm.b(126), true);
                      int discarded$5 = 16448;
                      bb.field_A = new Boolean(sd.a((ni) (Object) ae.field_a));
                      ae.field_a.field_i = 0;
                      break L8;
                    }
                  }
                }
              } else {
                break L8;
              }
            }
            L10: {
              if (u.field_b != rh.field_k) {
                break L10;
              } else {
                var9 = 2;
                if (gi.a(var9, true)) {
                  var10 = ae.field_a.d((byte) -111);
                  ae.field_a.field_i = 0;
                  if (gi.a(var10, true)) {
                    var11 = tc.field_e.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var12 >= var11) {
                        k.c(-28354);
                        aa.field_q = false;
                        stackOut_43_0 = 100 + var11;
                        stackIn_44_0 = stackOut_43_0;
                        return stackIn_44_0;
                      } else {
                        tc.field_e[var12] = ae.field_a.e(-84);
                        var12++;
                        continue L11;
                      }
                    }
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (rh.field_k == gd.field_b) {
                if (gf.b(110)) {
                  L13: {
                    if (be.field_a != 255) {
                      fh.field_a = ae.field_a.h(0);
                      break L13;
                    } else {
                      var9_ref_String = ae.field_a.a((byte) -115);
                      if (var9_ref_String != null) {
                        ea.a(376, rl.a((byte) -93), var9_ref_String);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  k.c(-28354);
                  aa.field_q = false;
                  stackOut_54_0 = be.field_a;
                  stackIn_55_0 = stackOut_54_0;
                  return stackIn_55_0;
                } else {
                  break L12;
                }
              } else {
                break L12;
              }
            }
            L14: {
              if (sg.field_h == null) {
                if (!aa.field_q) {
                  var9 = be.field_b;
                  be.field_b = ab.field_d;
                  ab.field_d = var9;
                  aa.field_q = true;
                  break L14;
                } else {
                  L15: {
                    if (h.b(103) <= 30000L) {
                      fh.field_a = jc.field_d;
                      break L15;
                    } else {
                      fh.field_a = ok.field_B;
                      break L15;
                    }
                  }
                  aa.field_q = false;
                  stackOut_62_0 = 249;
                  stackIn_63_0 = stackOut_62_0;
                  return stackIn_63_0;
                }
              } else {
                break L14;
              }
            }
            stackOut_65_0 = -1;
            stackIn_66_0 = stackOut_65_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("ak.B(").append(param0).append(44).append(15021).append(44).append(param2).append(44);
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param3 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L16;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L16;
            }
          }
          L17: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44).append(param4).append(44);
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param5 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L17;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L17;
            }
          }
          L18: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(44);
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param6 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L18;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L18;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 41);
        }
        return stackIn_66_0;
    }

    final static void a(int param0) {
        ic.n(-125);
        cg.a((byte) -105, 4);
        if (param0 <= 37) {
            ak.a(50);
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

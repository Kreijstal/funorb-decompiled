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
            throw pf.a((Throwable) ((Object) runtimeException), "ak.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String a(boolean param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = fleas.field_A ? 1 : 0;
        if (!param0) {
            field_d = (vc) null;
        }
        String var6 = "(" + hc.field_j + " " + rj.field_k + " " + vi.field_a + ") " + be.field_a;
        String var1 = var6;
        if ((pd.field_l ^ -1) < -1) {
            var1 = var6 + ":";
            for (var2 = 0; pd.field_l > var2; var2++) {
                var7 = var1 + ' ';
                var3 = 255 & ae.field_a.field_k[var2];
                var4 = var3 >> -383249756;
                if (var4 >= 10) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                var3 = var3 & 15;
                var8 = var7 + (char)var4;
                if (var3 < 10) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var8 + (char)var3;
            }
        }
        return var1;
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
        L0: {
          if (param1 == 67) {
            break L0;
          } else {
            field_b = (String[]) null;
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
            stackIn_10_0 = 0;
            break L1;
          }
          stackIn_10_0 = 1;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final static int a(int param0, int param1, boolean param2, ad param3, int param4, String param5, ad param6) {
        int stackIn_5_0 = 0;
        ni stackIn_18_0 = null;
        ni stackIn_19_0 = null;
        String stackIn_19_1 = null;
        ni stackIn_21_0 = null;
        ni stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_35_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_77_1 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        var13 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var14 = param3.b(param1 ^ -15051);
              var11_ref_String = var14;
              var11_ref_String = var14;
              var8 = param6.b(-127);
              var11_ref_String = var8;
              var11_ref_String = var8;
              if (null == sg.field_h) {
                if (id.a(false, false)) {
                  break L1;
                } else {
                  stackIn_5_0 = -1;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                  bb.field_A = null;
                  ud.field_b.field_i = 0;
                  if (param5 == null) {
                    L5: {
                      sd.field_i.field_i = 0;
                      sd.field_i.a(jj.field_R.nextInt(), (byte) -102);
                      sd.field_i.a(jj.field_R.nextInt(), (byte) -98);
                      stackIn_18_0 = sd.field_i;

                      if (!param3.a(47)) {
                        stackIn_19_0 = (ni) ((Object) stackIn_18_0);
                        stackIn_19_1 = "";
                        break L5;
                      } else {
                        stackIn_19_0 = (ni) ((Object) stackIn_18_0);
                        stackIn_19_1 = (String) (var14);
                        break L5;
                      }
                    }
                    L6: {
                      ((ni) (Object) stackIn_19_0).a(stackIn_19_1, (byte) -109);
                      stackIn_21_0 = sd.field_i;

                      if (!param6.a(42)) {
                        stackIn_22_0 = (ni) ((Object) stackIn_21_0);
                        stackIn_22_1 = "";
                        break L6;
                      } else {
                        stackIn_22_0 = (ni) ((Object) stackIn_21_0);
                        stackIn_22_1 = (String) (var8);
                        break L6;
                      }
                    }
                    ((ni) (Object) stackIn_22_0).a(stackIn_22_1, (byte) -124);
                    ud.field_b.a(-11, 16);
                    ud.field_b.field_i = ud.field_b.field_i + 1;
                    var9 = ud.field_b.field_i;
                    cg.a(fj.field_c, -120, sd.field_i, ud.field_b, de.field_k);
                    ud.field_b.c((byte) -31, ud.field_b.field_i - var9);
                    break L4;
                  } else {
                    L7: {
                      var9 = 0;
                      sd.field_i.field_i = 0;
                      if (!param2) {
                        break L7;
                      } else {
                        var9 = var9 | 1;
                        break L7;
                      }
                    }
                    L8: {
                      sd.field_i.a(jj.field_R.nextInt(), (byte) -63);
                      sd.field_i.a(jj.field_R.nextInt(), (byte) -15);
                      sd.field_i.a(var14, (byte) 61);
                      sd.field_i.a(var8, (byte) -113);
                      var15 = (CharSequence) ((Object) param5);
                      sd.field_i.a(qb.a(var15, (byte) -76), (byte) 75);
                      sd.field_i.b((byte) 111, param4);
                      sd.field_i.a(param1 + -15032, param0);
                      sd.field_i.a(-11, var9);
                      ud.field_b.a(-11, 18);
                      ud.field_b.field_i = ud.field_b.field_i + 2;
                      var10 = ud.field_b.field_i;
                      var11_ref_String = w.a(0, rl.a((byte) -62));
                      if (var11_ref_String != null) {
                        break L8;
                      } else {
                        var11_ref_String = "";
                        break L8;
                      }
                    }
                    ud.field_b.a(param1 + -15147, var11_ref_String);
                    cg.a(fj.field_c, -126, sd.field_i, ud.field_b, de.field_k);
                    ud.field_b.a((byte) 121, -var10 + ud.field_b.field_i);
                    break L4;
                  }
                }
                dk.b((byte) 41, -1);
                rh.field_k = ue.field_c;
                break L3;
              } else {
                break L3;
              }
            }
            L9: {
              if (rh.field_k == ue.field_c) {
                if (!gi.a(1, true)) {
                  break L9;
                } else {
                  L10: {
                    var9 = ae.field_a.e(false);
                    ae.field_a.field_i = 0;
                    if (100 > var9) {
                      break L10;
                    } else {
                      if (-106 <= (var9 ^ -1)) {
                        rh.field_k = u.field_b;
                        tc.field_e = new String[var9 - 100];
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (248 == var9) {
                    bj.a(14, rl.a((byte) -80));
                    fh.field_a = rf.field_q;
                    k.c(-28354);
                    aa.field_q = false;
                    stackIn_35_0 = var9;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (var9 != 99) {
                      rh.field_k = gd.field_b;
                      pd.field_l = -1;
                      be.field_a = var9;
                      break L9;
                    } else {
                      gi.a(cm.b(param1 ^ 15059), true);
                      bb.field_A = new Boolean(sd.a(ae.field_a, 16448));
                      ae.field_a.field_i = 0;
                      break L9;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            L11: {
              if (u.field_b != rh.field_k) {
                break L11;
              } else {
                var9 = 2;
                if (gi.a(var9, true)) {
                  var10 = ae.field_a.d((byte) -111);
                  ae.field_a.field_i = 0;
                  if (gi.a(var10, true)) {
                    var11 = tc.field_e.length;
                    var12 = 0;
                    L12: while (true) {
                      if (var12 >= var11) {
                        k.c(-28354);
                        aa.field_q = false;
                        stackIn_46_0 = 100 + var11;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        tc.field_e[var12] = ae.field_a.e(-84);
                        var12++;
                        continue L12;
                      }
                    }
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
            }
            L13: {
              if (rh.field_k == gd.field_b) {
                if (gf.b(param1 + -14911)) {
                  L14: {
                    if ((be.field_a ^ -1) != -256) {
                      fh.field_a = ae.field_a.h(param1 + -15021);
                      break L14;
                    } else {
                      var9_ref_String = ae.field_a.a((byte) -115);
                      if (var9_ref_String != null) {
                        ea.a(376, rl.a((byte) -93), var9_ref_String);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  k.c(param1 ^ -21613);
                  aa.field_q = false;
                  stackIn_57_0 = be.field_a;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  break L13;
                }
              } else {
                break L13;
              }
            }
            L15: {
              if (sg.field_h == null) {
                if (!aa.field_q) {
                  var9 = be.field_b;
                  be.field_b = ab.field_d;
                  ab.field_d = var9;
                  aa.field_q = true;
                  break L15;
                } else {
                  L16: {
                    if (h.b(param1 ^ 15050) <= 30000L) {
                      fh.field_a = jc.field_d;
                      break L16;
                    } else {
                      fh.field_a = ok.field_B;
                      break L16;
                    }
                  }
                  aa.field_q = false;
                  stackIn_65_0 = 249;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                break L15;
              }
            }
            stackIn_68_0 = -1;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var7);

            stackIn_71_1 = new StringBuilder().append("ak.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L17;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L18;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_77_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');

            if (param6 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L19;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L19;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_72_0), stackIn_78_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_35_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_46_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_57_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_65_0;
                } else {
                  return stackIn_68_0;
                }
              }
            }
          }
        }
    }

    final static void a(int param0) {
        ic.n(-125);
        cg.a((byte) -105, 4);
        if (param0 <= 37) {
            ak.a(50);
        }
    }

    static {
        field_d = new vc();
        field_e = 0;
        field_g = "<%0>Wall:<%1> Fleas can walk on these, but can't climb up the sides.";
        field_c = 0;
        field_b = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}

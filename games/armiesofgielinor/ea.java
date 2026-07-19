/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_b;
    ml field_a;
    static String field_d;
    static String field_c;

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        String stackIn_27_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_26_0 = null;
        String stackOut_28_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if ((var2_int ^ -1) < -21) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var2_int <= var4) {
                      break L5;
                    } else {
                      var5 = param1.charAt(var4);
                      var10 = -66;
                      var9 = var5 ^ -1;
                      if (var6 != 0) {
                        if (var9 == var10) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        L6: {
                          L7: {
                            L8: {
                              if (var9 > var10) {
                                break L8;
                              } else {
                                if (var5 <= 90) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              L10: {
                                if (var5 < 97) {
                                  break L10;
                                } else {
                                  if (var5 <= 122) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (var5 < 48) {
                                  break L11;
                                } else {
                                  if (var5 <= 57) {
                                    break L9;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              var3[var4] = (char)95;
                              if (var6 == 0) {
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                            var3[var4] = (char)var5;
                            if (var6 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                          var3[var4] = (char)(var5 - -32);
                          break L6;
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (param0 == -1212) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                stackOut_26_0 = (String) null;
                stackIn_27_0 = stackOut_26_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
              stackOut_28_0 = new String(var8);
              stackIn_29_0 = stackOut_28_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var2);
            stackOut_30_1 = new StringBuilder().append("ea.B(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L12;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L12;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_27_0;
        } else {
          return stackIn_29_0;
        }
    }

    final static mo a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        bv var8 = null;
        ar var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_28_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        Object stackOut_27_0 = null;
        int[] stackOut_26_0 = null;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var8 = mg.field_e;
          var3 = var8.k(0);
          if (0 == (var3 & 128)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          ui.field_b = stackIn_3_0 != 0;
          u.field_k = var3 & 127;
          hc.field_e = var8.k(0);
          gk.field_I = var8.j((byte) -2);
          if (2 == u.field_k) {
            rh.field_e = var8.e((byte) -104);
            th.field_c = var8.d((byte) -13);
            break L1;
          } else {
            rh.field_e = 0;
            th.field_c = 0;
            if (var7 == 0) {
              break L1;
            } else {
              rh.field_e = var8.e((byte) -104);
              th.field_c = var8.d((byte) -13);
              break L1;
            }
          }
        }
        L2: {
          if (var8.k(0) != 1) {
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L2;
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_11_0;
          qd.field_L = var8.g(1);
          if (var4 == 0) {
            gp.field_b = qd.field_L;
            break L3;
          } else {
            gp.field_b = var8.g(1);
            if (var7 == 0) {
              break L3;
            } else {
              gp.field_b = qd.field_L;
              break L3;
            }
          }
        }
        L4: {
          if (u.field_k == 1) {
            ut.field_eb = var8.e((byte) -104);
            aw.field_k = var8.g(1);
            break L4;
          } else {
            if ((u.field_k ^ -1) == -5) {
              ut.field_eb = var8.e((byte) -104);
              aw.field_k = var8.g(1);
              break L4;
            } else {
              ut.field_eb = 0;
              aw.field_k = null;
              if (var7 == 0) {
                break L4;
              } else {
                ut.field_eb = var8.e((byte) -104);
                aw.field_k = var8.g(1);
                break L4;
              }
            }
          }
        }
        if (!param1) {
          dg.field_b = le.a(80, (byte) -25, var8);
          hv.field_R = null;
          var5 = -17 / ((param0 - 47) / 42);
          return new mo(param1);
        } else {
          var5 = var8.e((byte) -104);
          try {
            L5: {
              L6: {
                var9 = ce.field_K.a(var5, -124);
                dg.field_b = var9.d((byte) 97);
                if (gp.field_b.equals(mv.field_d)) {
                  stackOut_27_0 = null;
                  stackIn_28_0 = (int[]) ((Object) stackOut_27_0);
                  break L6;
                } else {
                  stackOut_26_0 = var9.field_A;
                  stackIn_28_0 = stackOut_26_0;
                  break L6;
                }
              }
              hv.field_R = stackIn_28_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              af.a((Throwable) ((Object) var6), -120, "CC1");
              hv.field_R = null;
              dg.field_b = null;
              break L7;
            }
          }
          if (var7 != 0) {
            dg.field_b = le.a(80, (byte) -25, var8);
            hv.field_R = null;
            var5 = -17 / ((param0 - 47) / 42);
            return new mo(param1);
          } else {
            var5 = -17 / ((param0 - 47) / 42);
            return new mo(param1);
          }
        }
    }

    final static pf a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        pf[] var3 = null;
        int var4 = 0;
        pf var5 = null;
        int var6 = 0;
        pf stackIn_3_0 = null;
        pf stackIn_7_0 = null;
        pf stackIn_9_0 = null;
        pf stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        pf stackOut_6_0 = null;
        pf stackOut_8_0 = null;
        pf stackOut_11_0 = null;
        pf stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2 = fk.a((byte) 102, param1, "jagex-last-login-method");
            if (var2 != null) {
              var3 = ca.c(0);
              var4 = param0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 >= var3.length) {
                      break L3;
                    } else {
                      var5 = var3[var4];
                      stackOut_6_0 = (pf) (var5);
                      stackIn_12_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (!((pf) (Object) stackIn_7_0).a((byte) -106, var2)) {
                          var4++;
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackOut_8_0 = (pf) (var5);
                          stackIn_9_0 = stackOut_8_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackOut_11_0 = u.field_l;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = u.field_l;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2_ref);
            stackOut_13_1 = new StringBuilder().append("ea.E(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        mo discarded$1 = null;
        int var6 = 0;
        int var7 = 0;
        var6 = 24;
        var7 = 5;
        if (param1 > -117) {
          discarded$1 = ea.a((byte) -115, true);
          this.field_a.a(param3, param4, param2, var7, 0, var6, param0);
          bn.field_c.a(jn.field_d, -20500, su.field_d.field_gb, 0, 0);
          wn.field_kb.a(18, -20500, -2 + (-2 + su.field_d.field_gb + (-jn.field_c - 80)), 2 + jn.field_d, 0);
          ek.field_a.a(18, -20500, 82 + jn.field_c, jn.field_d + 2, -82 + (su.field_d.field_gb + -jn.field_c));
          mw.field_E.a(0, jn.field_c, 2, 20, su.field_d.field_gb, 20 + (2 + jn.field_d), -2 + (su.field_d.field_ob - jn.field_d) + -20, (byte) -92);
          sc.field_g.a((byte) -110, jn.field_c, 20, 2);
          return;
        } else {
          this.field_a.a(param3, param4, param2, var7, 0, var6, param0);
          bn.field_c.a(jn.field_d, -20500, su.field_d.field_gb, 0, 0);
          wn.field_kb.a(18, -20500, -2 + (-2 + su.field_d.field_gb + (-jn.field_c - 80)), 2 + jn.field_d, 0);
          ek.field_a.a(18, -20500, 82 + jn.field_c, jn.field_d + 2, -82 + (su.field_d.field_gb + -jn.field_c));
          mw.field_E.a(0, jn.field_c, 2, 20, su.field_d.field_gb, 20 + (2 + jn.field_d), -2 + (su.field_d.field_ob - jn.field_d) + -20, (byte) -92);
          sc.field_g.a((byte) -110, jn.field_c, 20, 2);
          return;
        }
    }

    ea(String param0, je param1) {
        String[] var3 = null;
        je[] var4 = null;
        try {
            var3 = new String[]{param0, wg.field_a, op.field_e};
            var4 = new je[]{param1, su.field_d, (je) ((Object) sc.field_g)};
            this.field_a = new ml(0L, h.field_d, var3, wm.field_c, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 43 % ((19 - param0) / 38);
        field_d = null;
    }

    static {
        field_d = "<%0> has joined your game.";
        field_c = "Passwords can only contain letters and numbers";
        field_b = "Magical incantations to instantly change the tide of battle.";
    }
}

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
        char[] var9 = null;
        char[] var10 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (var2_int > 20) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var10 = new char[var2_int];
            var9 = var10;
            var8 = var9;
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_22_0 = new String(var10);
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = param1.charAt(var4);
                    if (var5 < 65) {
                      break L4;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(var5 - -32);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5 < 97) {
                        break L6;
                      } else {
                        if (var5 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var5 < 48) {
                        break L7;
                      } else {
                        if (var5 <= 57) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var3[var4] = '_';
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("ea.B(").append(-1212).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    final static mo a(byte param0, boolean param1) {
        bv var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        bv var8 = null;
        ar var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_21_0 = null;
        int[] stackOut_20_0 = null;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var8 = mg.field_e;
          var2 = var8;
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
            break L1;
          }
        }
        L2: {
          if (var8.k(0) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          qd.field_L = var8.g(1);
          if (var4 == 0) {
            gp.field_b = qd.field_L;
            break L3;
          } else {
            gp.field_b = var8.g(1);
            break L3;
          }
        }
        L4: {
          if (u.field_k == 1) {
            ut.field_eb = var8.e((byte) -104);
            aw.field_k = var8.g(1);
            break L4;
          } else {
            if (u.field_k == 4) {
              ut.field_eb = var8.e((byte) -104);
              aw.field_k = var8.g(1);
              break L4;
            } else {
              ut.field_eb = 0;
              aw.field_k = null;
              break L4;
            }
          }
        }
        L5: {
          if (!param1) {
            dg.field_b = le.a(80, (byte) -25, (vh) (Object) var8);
            hv.field_R = null;
            break L5;
          } else {
            var5 = var8.e((byte) -104);
            try {
              L6: {
                L7: {
                  var9 = ce.field_K.a(var5, -124);
                  dg.field_b = var9.d((byte) 97);
                  if (gp.field_b.equals((Object) (Object) mv.field_d)) {
                    stackOut_21_0 = null;
                    stackIn_22_0 = (int[]) (Object) stackOut_21_0;
                    break L7;
                  } else {
                    stackOut_20_0 = var9.field_A;
                    stackIn_22_0 = stackOut_20_0;
                    break L7;
                  }
                }
                hv.field_R = stackIn_22_0;
                break L6;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var6 = (Exception) (Object) decompiledCaughtException;
                af.a((Throwable) (Object) var6, -120, "CC1");
                hv.field_R = null;
                dg.field_b = null;
                break L8;
              }
            }
            break L5;
          }
        }
        var5 = -17 / ((param0 - 47) / 42);
        return new mo(param1);
    }

    final static pf a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        pf[] var3 = null;
        int var4 = 0;
        pf var5 = null;
        int var6 = 0;
        pf stackIn_3_0 = null;
        pf stackIn_8_0 = null;
        pf stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        pf stackOut_10_0 = null;
        pf stackOut_7_0 = null;
        pf stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2 = fk.a((byte) 102, param1, "jagex-last-login-method");
            if (var2 != null) {
              var3 = ca.c(0);
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  stackOut_10_0 = u.field_l;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (!var5.a((byte) -106, var2)) {
                    var4++;
                    continue L1;
                  } else {
                    stackOut_7_0 = (pf) var5;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
            } else {
              stackOut_2_0 = u.field_l;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2_ref;
            stackOut_12_1 = new StringBuilder().append("ea.E(").append(0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        if (param1 > -117) {
            mo discarded$0 = ea.a((byte) -115, true);
        }
        ((ea) this).field_a.a(param3, param4, param2, var7, 0, var6, param0);
        bn.field_c.a(jn.field_d, -20500, su.field_d.field_gb, 0, 0);
        wn.field_kb.a(18, -20500, -2 + (-2 + su.field_d.field_gb + (-jn.field_c - 80)), 2 + jn.field_d, 0);
        ek.field_a.a(18, -20500, 82 + jn.field_c, jn.field_d + 2, -82 + (su.field_d.field_gb + -jn.field_c));
        mw.field_E.a(0, jn.field_c, 2, 20, su.field_d.field_gb, 20 + (2 + jn.field_d), -2 + (su.field_d.field_ob - jn.field_d) + -20, (byte) -92);
        sc.field_g.a((byte) -110, jn.field_c, 20, 2);
    }

    ea(String param0, je param1) {
        String[] var3 = null;
        je[] var4 = null;
        try {
            var3 = new String[]{param0, wg.field_a, op.field_e};
            var4 = new je[]{param1, su.field_d, (je) (Object) sc.field_g};
            ((ea) this).field_a = new ml(0L, h.field_d, var3, wm.field_c, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        int var1 = 0;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0> has joined your game.";
        field_c = "Passwords can only contain letters and numbers";
        field_b = "Magical incantations to instantly change the tide of battle.";
    }
}

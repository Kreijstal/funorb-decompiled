/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends pg {
    static String field_g;
    static int field_h;
    static String field_i;
    static int field_j;
    int field_k;

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.removeKeyListener((java.awt.event.KeyListener) (Object) ch.field_a);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) ch.field_a);
            ub.field_b = -1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "fj.A(" + (param0 != null ? "{...}" : "null") + 44 + 115 + 41);
        }
    }

    final static boolean a(int param0, CharSequence param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 0;
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
              if (param0 == 97) {
                break L1;
              } else {
                field_h = -110;
                break L1;
              }
            }
            var8 = 0;
            L2: while (true) {
              if (var8 >= var7) {
                stackOut_38_0 = var5;
                stackIn_39_0 = stackOut_38_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var9 = param1.charAt(var8);
                    if (0 == var8) {
                      if (45 == var9) {
                        var4_int = 1;
                        break L3;
                      } else {
                        if (var9 != 43) {
                          break L4;
                        } else {
                          L5: {
                            if (param2) {
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var8++;
                          continue L2;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    L7: {
                      if (var9 < 48) {
                        break L7;
                      } else {
                        if (var9 > 57) {
                          break L7;
                        } else {
                          var9 -= 48;
                          break L6;
                        }
                      }
                    }
                    L8: {
                      if (var9 < 65) {
                        break L8;
                      } else {
                        if (var9 > 90) {
                          break L8;
                        } else {
                          var9 -= 55;
                          break L6;
                        }
                      }
                    }
                    L9: {
                      if (97 > var9) {
                        break L9;
                      } else {
                        if (122 < var9) {
                          break L9;
                        } else {
                          var9 -= 87;
                          break L6;
                        }
                      }
                    }
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    return stackIn_26_0 != 0;
                  }
                  if (var9 < 10) {
                    L10: {
                      if (var4_int == 0) {
                        break L10;
                      } else {
                        var9 = -var9;
                        break L10;
                      }
                    }
                    var10 = 10 * var6 - -var9;
                    if (var10 / 10 != var6) {
                      stackOut_34_0 = 0;
                      stackIn_35_0 = stackOut_34_0;
                      return stackIn_35_0 != 0;
                    } else {
                      var6 = var10;
                      var5 = 1;
                      break L3;
                    }
                  } else {
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    return stackIn_29_0 != 0;
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var4;
            stackOut_40_1 = new StringBuilder().append("fj.D(").append(param0).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L11;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L11;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 44 + param2 + 44 + 10 + 41);
        }
        return stackIn_39_0 != 0;
    }

    final static void a(int param0, nk param1, int param2) {
        ab var3 = null;
        try {
            var3 = he.field_e;
            var3.b((byte) -36, param2);
            if (param0 != -26971) {
                Object var4 = null;
                qb discarded$0 = fj.a((String) null, 34, (eg) null, (String) null);
            }
            var3.f(param1.field_p, (byte) -41);
            var3.f(param1.field_t, (byte) -85);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "fj.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static qb a(String param0, int param1, eg param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        qb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param2.c(param0, 98);
              if (param1 == -22612) {
                break L1;
              } else {
                field_h = -32;
                break L1;
              }
            }
            var5 = param2.a(param3, (byte) 106, var4_int);
            stackOut_2_0 = r.a(param1 + 4684, var5, var4_int, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("fj.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    private fj() throws Throwable {
        throw new Error();
    }

    final static void c(int param0) {
        if (!(hk.field_s)) {
            throw new IllegalStateException();
        }
        if (!(null == vf.field_k)) {
            vf.field_k.h(77);
        }
        String var1 = ho.b((byte) 103);
        wh.field_f = new e(var1, (String) null, true, false, false);
        p.field_b.b((qm) (Object) g.field_e, 15637);
        g.field_e.a((byte) -92, (qm) (Object) wh.field_f);
        g.field_e.a(111);
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(param0 != 0)) {
            return 0;
        }
        if (param0 > 0) {
            var2 = 1;
            if (param0 > 65535) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (!(param0 <= 255)) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (15 < param0) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (!(param0 <= 3)) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (param0 > 1) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if (!(param0 >= -65536)) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (!(-256 <= param0)) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (!(-16 <= param0)) {
            var2 += 4;
            param0 = param0 >> 4;
        }
        if (param0 < -4) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (param0 < -2) {
            param0 = param0 >> 1;
            var2++;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Movement:";
    }
}

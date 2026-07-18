/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int[] field_a;
    static String field_b;

    final boolean b(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 48) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this == (Object) (Object) lb.field_o) {
              break L2;
            } else {
              if ((Object) (Object) ge.field_m == this) {
                break L2;
              } else {
                if (this != (Object) (Object) la.field_O) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        Object var4 = null;
        ai.a(param1, -1, (String) null, param0);
        if (param2 != 4) {
            th.a(false, true, -6);
        }
    }

    final static boolean a(int param0, boolean param1, int param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_36_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var11 = stellarshard.field_B;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                stackOut_36_0 = var5;
                stackIn_37_0 = stackOut_36_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param3.charAt(var8);
                    if (var8 == 0) {
                      if (var9 == 45) {
                        var4_int = 1;
                        break L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (48 > var9) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (65 > var9) {
                        break L6;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (97 > var9) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0 != 0;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (10 <= var9) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    return stackIn_25_0 != 0;
                  } else {
                    L7: {
                      if (var4_int == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = 10 * var6 - -var9;
                    if (var10 / 10 != var6) {
                      stackOut_30_0 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      return stackIn_31_0 != 0;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      break L2;
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var4;
            stackOut_38_1 = new StringBuilder().append("th.D(").append(-123).append(',').append(true).append(',').append(10).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param3 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L8;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L8;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
        }
        return stackIn_37_0 != 0;
    }

    final static void a(bd param0, bd param1, int param2) {
        try {
            pe.field_c = param1;
            mj.field_E = param0;
            gg.field_d = param2;
            ki.a(ti.field_i / 2, ti.field_b / 2, -116);
            qe.a(param0.field_x, -29770, param1.field_r + param1.field_x, param1.field_x, param0.field_r + param0.field_x);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "th.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + -128 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, fk param1) {
        ha var5 = null;
        int var4 = 0;
        try {
            var5 = pg.field_fb;
            var5.f(5, 950);
            var5.field_k = var5.field_k + 1;
            var4 = var5.field_k;
            var5.a(false, 1);
            var5.a(false, param1.field_l);
            var5.a((byte) 67, param1.field_p);
            var5.b(0, param1.field_m);
            var5.b(0, param1.field_s);
            var5.b(0, param1.field_o);
            var5.b(0, param1.field_n);
            int discarded$0 = var5.c(var4, (byte) -3);
            var5.a(-var4 + var5.field_k, (byte) 80);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "th.G(" + 5 + ',' + (param1 != null ? "{...}" : "null") + ',' + 1 + ')');
        }
    }

    final static void a() {
        pb var1 = null;
        pb var3 = null;
        int var4 = 0;
        int var5 = stellarshard.field_B;
        try {
            var1 = new pb(540, 140);
            hj.a(var1, 1);
            cc.a();
            int var2 = -104;
            ti.d();
            ni.field_d = 0;
            ja.a(4);
            var3 = var1.a();
            for (var4 = 0; var4 < 15; var4++) {
                var3.b(-2, -2, 16777215);
                ti.d(4, 4, 0, 0, 540, 140);
            }
            pd.field_s.e();
            var1.b(0, 0);
            id.b((byte) -58);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "th.C(" + -84 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Password: ";
        field_a = new int[]{1, 4, 0, 1, 2, 3};
    }
}

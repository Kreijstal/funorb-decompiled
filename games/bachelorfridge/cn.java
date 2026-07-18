/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends pp {
    static sna field_j;
    static String field_k;
    static String field_i;
    int field_m;
    int field_l;

    final void a(aga param0, op param1, int param2) {
        aga var4 = ((cn) this).field_h.a(52, param1);
        if (param2 != 12) {
            return;
        }
        try {
            var4.field_J = ((cn) this).field_m;
            var4.field_x = ((cn) this).field_l;
            param1.field_a[((cn) this).field_l][((cn) this).field_m].field_l = var4;
            var4.f(32);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "cn.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(lu param0, byte param1) {
        try {
            super.a(param0, (byte) 100);
            er.a(((cn) this).field_h, 109, param0);
            param0.d(((cn) this).field_l, 0);
            int var3_int = -63 % ((param1 - 34) / 58);
            param0.d(((cn) this).field_m, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "cn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean d(byte param0) {
        if (param0 <= 9) {
            return false;
        }
        return !sea.field_j ? true : false;
    }

    final static void a(byte param0, int param1, kv param2, int[] param3, int param4, int param5, kv param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var14 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              param5 -= 3;
              if (param6.field_q >= param1) {
                break L1;
              } else {
                param1 = param6.field_q;
                break L1;
              }
            }
            var7_int = 1 + param6.field_q;
            var8 = 1;
            L2: while (true) {
              if (-1 + param6.field_p <= var8) {
                var7_int = 0;
                var8 = 0;
                L3: while (true) {
                  if (param6.field_p <= var8) {
                    break L0;
                  } else {
                    var9 = param3[param3.length * var8 / param6.field_p];
                    var10 = 0;
                    L4: while (true) {
                      if (param1 <= var10) {
                        var7_int = var7_int + (param6.field_q + -param1);
                        var8++;
                        continue L3;
                      } else {
                        L5: {
                          var11 = 255 & param6.field_v[var7_int];
                          var12 = 255 & param2.field_v[var7_int];
                          var13 = 0;
                          var13 = var13 | (65280 & (var9 >> 16) * var11) << 8;
                          var13 = var13 | 65280 & ((65280 & var9) >> 8) * var11;
                          var13 = var13 | (65280 & var11 * (255 & var9)) >> 8;
                          if (param6.field_v[var7_int] < 0) {
                            break L5;
                          } else {
                            tla.a(param4 + var10, -1898743704, var13, var8 + param5, var12);
                            break L5;
                          }
                        }
                        var7_int++;
                        var10++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var9 = 1;
                L6: while (true) {
                  if (param1 <= var9) {
                    var7_int = var7_int + (param6.field_q + -param1 - -1);
                    var8++;
                    continue L2;
                  } else {
                    L7: {
                      var10 = 255 & param6.field_v[var7_int];
                      if ((param6.field_v[param6.field_q + var7_int] & 255) <= var10) {
                        break L7;
                      } else {
                        var10 = param6.field_v[var7_int + param6.field_q] & 255;
                        break L7;
                      }
                    }
                    L8: {
                      if ((255 & param6.field_v[-param6.field_q + var7_int]) <= var10) {
                        break L8;
                      } else {
                        var10 = 255 & param6.field_v[-param6.field_q + var7_int];
                        break L8;
                      }
                    }
                    L9: {
                      if (var10 >= (param6.field_v[param6.field_q + var7_int + 1] & 255)) {
                        break L9;
                      } else {
                        var10 = 255 & param6.field_v[1 + param6.field_q + var7_int];
                        break L9;
                      }
                    }
                    L10: {
                      if ((255 & param6.field_v[-1 + (-param6.field_q + var7_int)]) > var10) {
                        var10 = param6.field_v[-param6.field_q + var7_int - 1] & 255;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if ((param6.field_v[param6.field_q + (var7_int - 1)] & 255) <= var10) {
                        break L11;
                      } else {
                        var10 = 255 & param6.field_v[-1 + var7_int + param6.field_q];
                        break L11;
                      }
                    }
                    L12: {
                      if (var10 >= (param6.field_v[1 + -param6.field_q + var7_int] & 255)) {
                        break L12;
                      } else {
                        var10 = 255 & param6.field_v[1 + (-param6.field_q + var7_int)];
                        break L12;
                      }
                    }
                    L13: {
                      if (var10 < (255 & param6.field_v[var7_int + 1])) {
                        var10 = param6.field_v[var7_int + 1] & 255;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (var10 >= (param6.field_v[var7_int - 1] & 255)) {
                        break L14;
                      } else {
                        var10 = 255 & param6.field_v[var7_int + -1];
                        break L14;
                      }
                    }
                    int incrementValue$1 = var7_int;
                    var7_int++;
                    param2.field_v[incrementValue$1] = var10;
                    var9++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var7;
            stackOut_38_1 = new StringBuilder().append("cn.B(").append(-63).append(',').append(param1).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L15;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L15;
            }
          }
          L16: {
            stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param3 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L16;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L16;
            }
          }
          L17: {
            stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param6 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L17;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L17;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ')');
        }
    }

    final static kka a(byte param0, int param1) {
        kka var2 = new kka();
        gs.field_l.a((bw) (Object) var2, true);
        ah.a(4, 4);
        int var3 = 1;
        return var2;
    }

    public static void e(byte param0) {
        field_i = null;
        field_j = null;
        field_k = null;
    }

    cn(nq param0, int param1, int param2) {
        try {
            ((cn) this).field_l = param1;
            ((cn) this).field_h = param0;
            ((cn) this).field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "cn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_i = "Off";
    }
}

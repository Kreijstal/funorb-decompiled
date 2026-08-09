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
        aga var4 = this.field_h.a(52, param1);
        if (param2 != 12) {
            return;
        }
        try {
            var4.field_J = this.field_m;
            var4.field_x = this.field_l;
            param1.field_a[this.field_l][this.field_m].field_l = var4;
            var4.f(32);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "cn.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(lu param0, byte param1) {
        try {
            super.a(param0, (byte) 100);
            er.a(this.field_h, 109, param0);
            param0.d(this.field_l, 0);
            int var3_int = -63 % ((param1 - 34) / 58);
            param0.d(this.field_m, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "cn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean d(byte param0) {
        if (param0 <= 9) {
            return false;
        }
        return !sea.field_j ? true : false;
    }

    final static void a(byte param0, int param1, kv param2, int[] param3, int param4, int param5, kv param6) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
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
            if (param0 < -60) {
              var8 = 1;
              L2: while (true) {
                if (-1 + param6.field_p <= var8) {
                  var7_int = 0;
                  var8 = 0;
                  L3: while (true) {
                    if (param6.field_p <= var8) {
                      decompiledRegionSelector0 = 1;
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
                            var13 = var13 | (65280 & (var9 >> -2031227632) * var11) << -263543448;
                            var13 = var13 | 65280 & ((65280 & var9) >> 1893831592) * var11;
                            var13 = var13 | (65280 & var11 * (255 & var9)) >> -1617086424;
                            if ((param6.field_v[var7_int] ^ -1) > -1) {
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
                        if ((param6.field_v[param6.field_q + var7_int] & 255 ^ -1) >= (var10 ^ -1)) {
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
                      incrementValue$0 = var7_int;
                      var7_int++;
                      param2.field_v[incrementValue$0] = var10;
                      var9++;
                      continue L6;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var7);

            stackIn_40_1 = new StringBuilder().append("cn.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L15;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_43_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');

            if (param3 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L16;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_46_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L17;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L17;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_41_0), stackIn_47_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static kka a(byte param0, int param1) {
        kka var2 = new kka();
        gs.field_l.a(var2, true);
        ah.a(4, param1);
        int var3 = 89 % ((66 - param0) / 56);
        return var2;
    }

    public static void e(byte param0) {
        field_i = null;
        field_j = null;
        field_k = null;
        if (param0 <= 84) {
            field_i = (String) null;
        }
    }

    cn(nq param0, int param1, int param2) {
        try {
            this.field_l = param1;
            this.field_h = param0;
            this.field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "cn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_k = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_i = "Off";
    }
}

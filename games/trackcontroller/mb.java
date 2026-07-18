/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static qj[] field_d;
    static volatile int field_f;
    static int field_b;
    private gb field_e;
    static String field_a;
    static int field_c;
    private gb field_g;

    final gb b(int param0) {
        gb var2 = ((mb) this).field_e.field_k;
        if (((mb) this).field_e == var2) {
            ((mb) this).field_g = null;
            return null;
        }
        ((mb) this).field_g = var2.field_k;
        if (param0 != 48) {
            return null;
        }
        return var2;
    }

    final gb a(int param0) {
        gb var2 = ((mb) this).field_e.field_k;
        if (((mb) this).field_e == var2) {
            return null;
        }
        var2.e(0);
        if (param0 != -58) {
            mb.a(-120, -63, -45, (byte) 19, 80);
        }
        return var2;
    }

    public static void b(byte param0) {
        field_d = null;
        field_a = null;
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                stackOut_34_0 = var5;
                stackIn_35_0 = stackOut_34_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (var8 == 0) {
                      if (var9 == 45) {
                        var4_int = 1;
                        break L2;
                      } else {
                        if (43 != var9) {
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
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (65 > var9) {
                        break L6;
                      } else {
                        if (90 < var9) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    if (97 > var9) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0 != 0;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (10 > var9) {
                    L7: {
                      if (var4_int == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = 10 * var6 + var9;
                    if (var10 / 10 == var6) {
                      var5 = 1;
                      var6 = var10;
                      break L2;
                    } else {
                      stackOut_30_0 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      return stackIn_31_0 != 0;
                    }
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    return stackIn_26_0 != 0;
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
            stackOut_36_0 = (RuntimeException) var4;
            stackOut_36_1 = new StringBuilder().append("mb.I(").append(55).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L8;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + 10 + ',' + true + ')');
        }
        return stackIn_35_0 != 0;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        nk.b(false);
        ll.b(param0, param1, param4, param2);
        int var5 = -22 % ((param3 - 51) / 54);
    }

    final static void a(byte param0, qj param1) {
        try {
            int var2_int = 45 / ((64 - param0) / 53);
            nk.b(false);
            ll.a(param1.field_z, param1.field_s, param1.field_v);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "mb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(gb param0, boolean param1) {
        try {
            if (null != param0.field_j) {
                param0.e(0);
            }
            if (!param1) {
                field_a = null;
            }
            param0.field_k = ((mb) this).field_e;
            param0.field_j = ((mb) this).field_e.field_j;
            param0.field_j.field_k = param0;
            param0.field_k.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "mb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final gb a(byte param0) {
        if (param0 <= 70) {
            Object var3 = null;
            ((mb) this).a((gb) null, true);
        }
        gb var2 = ((mb) this).field_g;
        if (!(var2 != ((mb) this).field_e)) {
            ((mb) this).field_g = null;
            return null;
        }
        ((mb) this).field_g = var2.field_k;
        return var2;
    }

    public mb() {
        ((mb) this).field_e = new gb();
        ((mb) this).field_e.field_j = ((mb) this).field_e;
        ((mb) this).field_e.field_k = ((mb) this).field_e;
    }

    final int c(byte param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        int var2 = 0;
        if (param0 > -42) {
            return -128;
        }
        gb var3 = ((mb) this).field_e.field_k;
        while (var3 != ((mb) this).field_e) {
            var2++;
            var3 = var3.field_k;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new qj[104];
        field_f = 0;
        field_b = 0;
        field_a = "Achieved";
    }
}

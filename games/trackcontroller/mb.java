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

    public static void b() {
        field_d = null;
        field_a = null;
    }

    final static boolean a(int param0, CharSequence param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
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
                stackOut_32_0 = var5;
                stackIn_33_0 = stackOut_32_0;
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
                      stackOut_28_0 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0 != 0;
                    }
                  } else {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0 != 0;
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
            stackOut_34_0 = (RuntimeException) var4;
            stackOut_34_1 = new StringBuilder().append("mb.I(").append(55).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L8;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L8;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + 10 + 44 + 1 + 41);
        }
        return stackIn_33_0 != 0;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int discarded$0 = 0;
        nk.b();
        ll.b(param0, param1, param4, param2);
        int var5 = -22 % ((param3 - 51) / 54);
    }

    final static void a(byte param0, qj param1) {
        try {
            int var2_int = 45 / ((64 - param0) / 53);
            int discarded$0 = 0;
            nk.b();
            ll.a(param1.field_z, param1.field_s, param1.field_v);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "mb.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
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
            throw sl.a((Throwable) (Object) runtimeException, "mb.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
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

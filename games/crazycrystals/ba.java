/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends ln {
    static dl field_j;
    static String field_l;
    static vc field_i;
    static dl[] field_g;
    static db field_k;
    static java.awt.Image field_h;

    final int a(int param0, byte param1) {
        int var3 = 75 / ((param1 - 55) / 50);
        return (1 << param0 & qg.field_q) != 0 ? 1 : 0;
    }

    final static void b(byte param0) {
        int var1 = -4;
        ab.f((byte) -49);
    }

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
        String stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (var2_int <= 20) {
                break L1;
              } else {
                var2_int = 20;
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
                stackOut_23_0 = new String(var10);
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = param1.charAt(var4);
                    if (var5 < 65) {
                      break L4;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(var5 + 32);
                        var4++;
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
                        if (122 >= var5) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (48 > var5) {
                        break L7;
                      } else {
                        if (57 < var5) {
                          break L7;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3[var4] = '_';
                    var4++;
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  var4++;
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
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("ba.F(").append(48).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    final static void a(byte param0, String param1) {
        try {
            ng.a(param1, 21815);
            ke.a(no.field_i, false, -13);
            int var2_int = 0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ba.B(" + -65 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(byte param0) {
        jm.field_d.a((qm) (Object) new ae(), (byte) -50);
    }

    final static tj a(int param0) {
        return hb.field_l;
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        field_l = null;
        field_h = null;
        field_k = null;
        field_j = null;
    }

    final static void a(int param0, int param1, hp param2) {
        try {
            if (param1 <= 37) {
                field_h = null;
            }
            cf.field_c.b(0, (jb) (Object) param2);
            tb.a(3, param2, (byte) -123);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ba.D(" + 3 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ba(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Retry";
    }
}

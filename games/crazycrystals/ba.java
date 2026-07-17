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
        Object stackIn_5_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_24_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
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
            if (param0 == 48) {
              L2: while (true) {
                if (var2_int <= var4) {
                  stackOut_24_0 = new String(var10);
                  stackIn_25_0 = stackOut_24_0;
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
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (String) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2;
            stackOut_26_1 = new StringBuilder().append("ba.F(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
        return stackIn_25_0;
    }

    final static void a(byte param0, String param1) {
        try {
            ng.a(param1, 21815);
            ke.a(no.field_i, false, -13);
            int var2_int = 119 % ((param0 - 6) / 49);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ba.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void c(byte param0) {
        jm.field_d.a((qm) (Object) new ae(), (byte) -50);
        if (param0 == 93) {
            return;
        }
        field_h = null;
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
            tb.a(param0, param2, (byte) -123);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ba.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
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

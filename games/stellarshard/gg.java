/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gg {
    gg field_c;
    static oj field_b;
    long field_j;
    static long field_a;
    static int field_d;
    static int field_i;
    static byte[] field_e;
    static af field_f;
    gg field_g;
    static int[] field_h;

    final static void a(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          df.a(-108, param0);
          we.a(false, 12757, ul.field_H);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("gg.NB(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 97 + ')');
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = stellarshard.field_B;
        var4 = param0.indexOf(param2);
        if (param3 > 35) {
          L0: while (true) {
            if (var4 == -1) {
              return param0;
            } else {
              param0 = param0.substring(0, var4) + param1 + param0.substring(var4 - -param2.length());
              var4 = param0.indexOf(param2, var4 - -param1.length());
              continue L0;
            }
          }
        } else {
          gg.a(-103, -1, -45, -55, 12);
          L1: while (true) {
            if (var4 == -1) {
              return param0;
            } else {
              param0 = param0.substring(0, var4) + param1 + param0.substring(var4 - -param2.length());
              var4 = param0.indexOf(param2, var4 - -param1.length());
              continue L1;
            }
          }
        }
    }

    final boolean b(int param0) {
        if (!(((gg) this).field_c != null)) {
            return false;
        }
        if (param0 != 48) {
            field_i = -18;
            return true;
        }
        return true;
    }

    public static void b(byte param0) {
        field_b = null;
        field_f = null;
        field_h = null;
        field_e = null;
    }

    final void c(int param0) {
        if (((gg) this).field_c == null) {
          return;
        } else {
          ((gg) this).field_c.field_g = ((gg) this).field_g;
          ((gg) this).field_g.field_c = ((gg) this).field_c;
          ((gg) this).field_g = null;
          if (param0 != 20) {
            field_b = null;
            ((gg) this).field_c = null;
            return;
          } else {
            ((gg) this).field_c = null;
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = -112 / ((param0 - -39) / 56);
        int discarded$0 = 0;
        kg.d();
        ti.a(param4, param2, param1, param3);
    }

    final static String a(CharSequence param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
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
        var6 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (var2_int > 20) {
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
              if (var2_int <= var4) {
                stackOut_23_0 = new String(var8);
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = param0.charAt(var4);
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
                        if (var5 <= 122) {
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
                        if (var5 > 57) {
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
            stackOut_25_1 = new StringBuilder().append("gg.MB(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + false + ')');
        }
        return stackIn_24_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 1;
        field_f = null;
        field_e = new byte[520];
        field_b = new oj();
        field_h = new int[1024];
    }
}

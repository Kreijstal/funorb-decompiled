/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp {
    static aj field_d;
    static boolean[] field_e;
    static int[] field_g;
    static int field_c;
    static la field_a;
    static boolean field_f;
    static int field_b;

    final static java.awt.Container b(int param0) {
        if (!(null == un.field_b)) {
            return (java.awt.Container) ((Object) un.field_b);
        }
        if (param0 != 20) {
            field_d = (aj) null;
        }
        return (java.awt.Container) ((Object) ip.a(9));
    }

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (param1 >= 97) {
                break L1;
              } else {
                field_d = (aj) null;
                break L1;
              }
            }
            L2: {
              if (-21 <= (var2_int ^ -1)) {
                break L2;
              } else {
                var2_int = 20;
                break L2;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L3: while (true) {
              if (var4 >= var2_int) {
                stackIn_21_0 = new String(var8);
                break L0;
              } else {
                L4: {
                  L5: {
                    var5 = param0.charAt(var4);
                    if (var5 < 65) {
                      break L5;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(var5 - -32);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (var5 < 97) {
                        break L7;
                      } else {
                        if (var5 <= 122) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var5 < 48) {
                        break L8;
                      } else {
                        if (var5 <= 57) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    break L4;
                  }
                  var3[var4] = (char)var5;
                  break L4;
                }
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("lp.A(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    final static int[] a(int param0, boolean param1, int param2) {
        int var3 = ah.a((byte) 127, param0);
        int var4 = ao.b(2048, param0);
        int var5 = ah.a((byte) 127, param2);
        int var6 = ao.b(2048, param2);
        int var7 = (int)((long)var3 * (long)var5 >> 425276240);
        int var8 = (int)((long)var3 * (long)var6 >> -1361267824);
        if (param1) {
            lp.b(25);
        }
        int var9 = (int)((long)var5 * (long)var4 >> -89329520);
        int var10 = (int)((long)var6 * (long)var4 >> -224405808);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    public static void a(int param0) {
        if (param0 != 0) {
            lp.b(67);
        }
        field_e = null;
        field_a = null;
        field_g = null;
        field_d = null;
    }

    static {
        field_c = -2147483648;
        field_b = 0;
    }
}

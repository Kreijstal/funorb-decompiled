/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static String field_a;
    static int field_g;
    static char[] field_b;
    static int[] field_c;
    static ll field_f;
    static int field_e;
    static String field_d;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 < 84) {
          field_e = -83;
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if ((var2_int ^ -1) >= -21) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                L3: {
                  if (param0 == 90) {
                    break L3;
                  } else {
                    d.a(-128);
                    break L3;
                  }
                }
                stackIn_24_0 = new String(var8);
                break L0;
              } else {
                L4: {
                  L5: {
                    var5 = param1.charAt(var4);
                    if (-66 < (var5 ^ -1)) {
                      break L5;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(32 + var5);
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
                        if (57 < var5) {
                          break L8;
                        } else {
                          break L6;
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
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("d.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    final static void a(boolean param0) {
        int var1;
        int var2;
        var1 = hg.a((byte) 95);
        if (param0) {
          return;
        } else {
          var2 = ml.b(20719);
          nc.field_c.a(ie.field_j - bi.field_g, (bi.field_g << 1475246337) + var2, -51, var1 - -(em.field_j << 1309317569), -em.field_j + mk.field_d);
          mk.c(117);
          return;
        }
    }

    static {
        field_a = "Your email address is used to identify this account";
        field_b = new char[128];
        field_g = 64;
        field_d = "Cancel";
    }
}

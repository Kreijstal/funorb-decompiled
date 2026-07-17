/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends si {
    wf field_x;
    static db[] field_z;
    int field_w;
    byte field_A;
    static String field_y;

    final byte[] d(byte param0) {
        int var2 = 0;
        L0: {
          if (((dc) this).field_v) {
            break L0;
          } else {
            if (((dc) this).field_x.field_h < -((dc) this).field_A + ((dc) this).field_x.field_j.length) {
              break L0;
            } else {
              var2 = 37 % ((2 - param0) / 38);
              return ((dc) this).field_x.field_j;
            }
          }
        }
        throw new RuntimeException();
    }

    final static void c() {
        Object var2 = null;
        cl.a((byte) 41, (String) null, "");
    }

    final static boolean d() {
        if (a.field_c == -1) {
            int discarded$7 = 10343;
            if (!(a.b(1))) {
                return false;
            }
            a.field_c = ig.field_a.d(true);
            ig.field_a.field_h = 0;
        }
        if (a.field_c == -2) {
            int discarded$15 = 10343;
            if (!(a.b(2))) {
                return false;
            }
            a.field_c = ig.field_a.b(-1698573656);
            ig.field_a.field_h = 0;
        }
        int discarded$16 = 10343;
        return a.b(a.field_c);
    }

    dc() {
    }

    final static String[] a(String param0, char param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) (Object) param0;
            var3_int = wd.a((byte) -72, param1, var10);
            var4 = new String[1 + var3_int];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var3_int) {
                var4[var3_int] = param0.substring(var6);
                stackOut_7_0 = (String[]) var4;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var8 = var6;
                L2: while (true) {
                  if (param1 == param0.charAt(var8)) {
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = param0.substring(var6, var8);
                    var6 = var8 - -1;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("dc.T(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + -125 + 41);
        }
        return stackIn_8_0;
    }

    public static void f() {
        field_y = null;
        int var1 = 0;
        field_z = null;
    }

    final static String a(int param0, byte[] param1, byte param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var14 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var10 = new char[param0];
            var14 = var10;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (var6 >= param0) {
                stackOut_8_0 = new String(var14, 0, var5);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                L2: {
                  var7 = param1[param3 + var6] & 255;
                  if (0 == var7) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("dc.D(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 16 + 44 + param3 + 41);
        }
        return stackIn_9_0;
    }

    final int c(byte param0) {
        if (param0 != 16) {
            return 68;
        }
        if (!(((dc) this).field_x != null)) {
            return 0;
        }
        return 100 * ((dc) this).field_x.field_h / (((dc) this).field_x.field_j.length - ((dc) this).field_A);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}

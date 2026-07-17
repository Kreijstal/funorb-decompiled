/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    int field_g;
    private static int[] field_a;
    static int field_i;
    static int field_e;
    int[] field_d;
    int field_c;
    static volatile long field_b;
    static java.awt.Image field_h;
    static int field_f;

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 106) {
          L0: {
            L1: {
              if (null == ((nh) this).field_d) {
                break L1;
              } else {
                if (((nh) this).field_d.length != 0) {
                  stackOut_6_0 = ((nh) this).field_d[((nh) this).field_d.length + -1];
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return -51;
        }
    }

    public static void a() {
        field_a = null;
        field_h = null;
    }

    final static void a(java.applet.Applet param0) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                    param0.getAppletContext().showDocument(wh.a(127, var2, param0), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref2;
                stackOut_4_1 = new StringBuilder().append("nh.C(");
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 337033697 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    nh(int param0, int param1, int param2) {
        ((nh) this).field_c = param1;
        ((nh) this).field_g = param0;
        ((nh) this).field_d = new int[param2 + 1];
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = StarCannon.field_A;
          if (null == ((nh) this).field_d) {
            break L0;
          } else {
            if (((nh) this).field_d.length == 0) {
              break L0;
            } else {
              var3 = 1;
              if (param1 == -1) {
                L1: while (true) {
                  if (var3 >= ((nh) this).field_d.length) {
                    return ((nh) this).field_d.length - 1;
                  } else {
                    if (param0 < ((nh) this).field_d[-1 + var3] + ((nh) this).field_d[var3] >> 1) {
                      return var3 - 1;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              } else {
                return 19;
              }
            }
          }
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_i = 100;
        field_e = 0;
        field_a = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
            var6 = (long)((var0 << 1) + 1);
            var4 = (long)(-1 + (var0 << 1));
            var3 = (int)(-32768L + (var6 * var6 >> 18));
            var2 = (int)(-32768L + (var4 * var4 >> 18));
            if (!(field_a.length > var3)) {
                var3 = -1 + field_a.length;
            }
            for (var1 = var2 >= 0 ? var2 : 0; var3 >= var1; var1++) {
                field_a[var1] = var0;
            }
        }
        field_b = 0L;
    }
}

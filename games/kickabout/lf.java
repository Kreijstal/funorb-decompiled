/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static String field_c;
    static String field_b;
    private int[] field_a;

    final static int a(byte param0, int param1) {
        if (param0 > -55) {
            return 67;
        }
        if (!(!ia.field_c)) {
            param1 = -param1 + 1344;
        }
        return go.a(param1, (byte) -56);
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 82 / ((54 - param1) / 32);
              if (null == tr.a(param0, (byte) 40)) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("lf.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 94) {
            lf.a((byte) -22, 76);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(int param0) {
        nb.field_i = qa.h(-117);
        wd.field_l = new se();
        if (param0 >= -59) {
          lf.a(-98);
          bl.a(true, true, (byte) -72);
          return;
        } else {
          bl.a(true, true, (byte) -72);
          return;
        }
    }

    lf(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (param0.length - -(param0.length >> -1958199871) < var2_int) {
                this.field_a = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = param0[var3] & var2_int + -1;
                        L4: while (true) {
                          if ((this.field_a[1 + (var4 - -var4)] ^ -1) == 0) {
                            this.field_a[var4 - -var4] = param0[var3];
                            this.field_a[1 + var4 + var4] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = -1 + var2_int & var4 - -1;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_a[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("lf.<init>(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Kickabout.field_G;
        var3 = -1 + (this.field_a.length >> 1325328769);
        if (param1 < -37) {
          var4 = param0 & var3;
          L0: while (true) {
            var5 = this.field_a[var4 + (var4 + 1)];
            if (-1 != var5) {
              if (param0 == this.field_a[var4 + var4]) {
                return var5;
              } else {
                var4 = var4 + 1 & var3;
                continue L0;
              }
            } else {
              return -1;
            }
          }
        } else {
          lf.a(-22);
          var4 = param0 & var3;
          L1: while (true) {
            var5 = this.field_a[var4 + (var4 + 1)];
            if (-1 != var5) {
              if (param0 == this.field_a[var4 + var4]) {
                return var5;
              } else {
                var4 = var4 + 1 & var3;
                continue L1;
              }
            } else {
              return -1;
            }
          }
        }
    }

    static {
    }
}

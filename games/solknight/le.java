/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    int field_g;
    static String field_a;
    static String field_b;
    static volatile int field_f;
    int[] field_c;
    int field_e;
    static o[] field_d;

    final static void a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ah.field_e) {
                break L1;
              } else {
                ah.field_e.f(true);
                break L1;
              }
            }
            ve.field_a = new bb(param1, param2, false, true, true);
            gf.field_cb.c(-3399, ve.field_a);
            if (param0 <= -11) {
              break L0;
            } else {
              field_f = 70;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("le.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
    }

    final int a(byte param0) {
        if (param0 >= 39) {
          if (this.field_c != null) {
            if (0 == this.field_c.length) {
              return 0;
            } else {
              return this.field_c[this.field_c.length - 1];
            }
          } else {
            return 0;
          }
        } else {
          le.a(-71);
          if (this.field_c != null) {
            if (0 == this.field_c.length) {
              return 0;
            } else {
              return this.field_c[this.field_c.length - 1];
            }
          } else {
            return 0;
          }
        }
    }

    final int a(int param0, boolean param1) {
        int var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        if (null != this.field_c) {
          if (-1 != (this.field_c.length ^ -1)) {
            var3 = 1;
            L0: while (true) {
              if (this.field_c.length <= var3) {
                if (param1) {
                  field_d = (o[]) null;
                  return this.field_c.length + -1;
                } else {
                  return this.field_c.length + -1;
                }
              } else {
                if ((param0 ^ -1) > (this.field_c[var3] + this.field_c[var3 - 1] >> 873698625 ^ -1)) {
                  return -1 + var3;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    le(int param0, int param1, int param2) {
        this.field_g = param0;
        this.field_e = param1;
        this.field_c = new int[param2 - -1];
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -3390) {
            field_b = (String) null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void b(int param0) {
        m var1;
        jd var2;
        var1 = (m) ((Object) gg.field_b.a((byte) 51));
        if (var1 != null) {
          var2 = te.field_N;
          var2.e(true);
          var2.e(true);
          var2.e(true);
          var2.e(true);
          var1.c(10);
          if (param0 != 873698625) {
            le.a(-22);
            return;
          } else {
            return;
          }
        } else {
          je.a(false);
          return;
        }
    }

    static {
        field_f = -1;
        field_b = "EXCLUSIVE";
        field_a = "Close";
    }
}

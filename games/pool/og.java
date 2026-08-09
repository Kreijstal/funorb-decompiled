/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends ob {
    static nl field_L;
    static String field_H;
    static int[] field_J;
    static dd[] field_K;
    static int field_I;

    og(dd param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    public static void f(byte param0) {
        if (param0 >= -85) {
          og.f((byte) -111);
          field_K = null;
          field_L = null;
          field_J = null;
          field_H = null;
          return;
        } else {
          field_K = null;
          field_L = null;
          field_J = null;
          field_H = null;
          return;
        }
    }

    final static void a(java.awt.Frame param0, sj param1, int param2) {
        le var3 = null;
        sj var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param2 == 24442) {
                break L1;
              } else {
                var4 = (sj) null;
                og.a((java.awt.Frame) null, (sj) null, 107);
                break L1;
              }
            }
            L2: while (true) {
              var3 = param1.a(param0, false);
              L3: while (true) {
                if (-1 != (var3.field_f ^ -1)) {
                  if (-2 == (var3.field_f ^ -1)) {
                    param0.setVisible(false);
                    param0.dispose();
                    break L0;
                  } else {
                    cf.a(-96, 100L);
                    continue L2;
                  }
                } else {
                  cf.a(-108, 10L);
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("og.E(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final int b(byte param0, int param1) {
        if (param0 == 6) {
          if (this.field_h.length + -1 <= param1) {
            return this.field_x + param1 * this.field_s;
          } else {
            return this.field_x + param1 * (-8 + this.field_s);
          }
        } else {
          field_H = (String) null;
          if (this.field_h.length + -1 <= param1) {
            return this.field_x + param1 * this.field_s;
          } else {
            return this.field_x + param1 * (-8 + this.field_s);
          }
        }
    }

    static {
        field_H = "Offer unrated rematch";
        field_J = new int[]{62, 20, 21, 49, 5, 3, 61};
        field_L = new nl();
    }
}

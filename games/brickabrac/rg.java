/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    private mf field_d;
    static tf field_i;
    static String[] field_b;
    private to field_h;
    static String[] field_k;
    static int field_a;
    static mh field_e;
    private mf field_j;
    static jp field_f;
    static int[] field_g;
    static mh field_c;

    final wd a(int param0, boolean param1) {
        wd var3;
        byte[] var4;
        var3 = (wd) (this.field_h.a((long)param0, param1));
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param0 >= 32768) {
              var4 = this.field_d.a(param0 & 32767, 1, 4);
              break L0;
            } else {
              var4 = this.field_j.a(param0, 1, 4);
              break L0;
            }
          }
          L1: {
            var3 = new wd();
            if (var4 != null) {
              var3.a(new wq(var4), -3);
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 < 32768) {
            this.field_h.a(84, var3, (long)param0);
            if (!param1) {
              this.a(120, false);
              return var3;
            } else {
              return var3;
            }
          } else {
            var3.g(-126);
            this.field_h.a(84, var3, (long)param0);
            if (param1) {
              return var3;
            } else {
              this.a(120, false);
              return var3;
            }
          }
        }
    }

    final static boolean a(mf param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 45) {
                break L1;
              } else {
                field_i = (tf) null;
                break L1;
              }
            }
            stackIn_3_0 = param0.a(96);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("rg.A(");

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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        field_e = null;
        field_c = null;
        field_f = null;
        field_b = null;
        field_k = null;
        if (param0 != 64) {
            rg.a(-104);
        }
    }

    rg(int param0, mf param1, mf param2, bp param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_h = new to(64);
        try {
          L0: {
            L1: {
              this.field_j = param1;
              this.field_d = param2;
              if (this.field_j == null) {
                break L1;
              } else {
                this.field_j.c(-123, 1);
                break L1;
              }
            }
            if (this.field_d == null) {
              break L0;
            } else {
              this.field_d.c(-124, 1);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("rg.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_a = 22;
        field_i = new tf();
        field_g = new int[4];
    }
}

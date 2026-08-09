/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tv extends jea {
    private jea field_tb;
    jea field_vb;
    static String field_ub;
    static String field_xb;
    static nh field_wb;

    tv(long param0, jea param1, jea param2, jea param3, iu param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                this.field_tb = new jea(0L, param2);
                this.field_tb.field_R = param4;
                this.b(-124, this.field_tb);
                break L1;
              }
            }
            L2: {
              if (param5 != null) {
                this.field_vb = new jea(0L, param3, param5);
                this.b(-125, this.field_vb);
                this.a(-10966);
                break L2;
              } else {
                this.a(-10966);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("tv.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_22_2 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int var6;
        if (param2 <= -7) {
          L0: {
            var4 = -param0;
            var5 = -param0;
            if (this.field_tb != null) {
              var4 = this.field_tb.b((byte) 69);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != this.field_vb) {
              var5 = this.field_vb.a(-param1 + (-var4 + (-param1 + this.field_G)) - param0, false);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var6 = param1 + param0 + (var4 + param1) + var5;
            if (var6 <= this.field_G) {
              break L2;
            } else {
              var5 = var5 + (this.field_G - var6);
              var6 = this.field_G;
              break L2;
            }
          }
          L3: {
            if (1 == this.field_z) {
              param1 = param1 + (-var6 + this.field_G) / 2;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (2 == this.field_z) {
              param1 = param1 + (-var6 + this.field_G);
              break L4;
            } else {
              break L4;
            }
          }
          if (null == this.field_tb) {
            if (null != this.field_vb) {
              this.field_vb.a(var5, this.field_t, -23776, 0, param0 + param1 - -var4);
              if (this.field_tb == null) {
                this.field_vb.field_z = this.field_z;
                this.field_vb.field_bb = this.field_bb;
                return;
              } else {
                this.field_vb.field_z = 0;
                this.field_vb.field_bb = this.field_bb;
                return;
              }
            } else {
              return;
            }
          } else {
            this.field_tb.a(var4, this.field_t, -23776, 0, param1);
            this.field_tb.field_bb = this.field_bb;
            if (null != this.field_vb) {
              this.field_vb.a(var5, this.field_t, -23776, 0, param0 + param1 - -var4);
              if (this.field_tb == null) {
                this.field_vb.field_z = this.field_z;
                this.field_vb.field_bb = this.field_bb;
                return;
              } else {
                this.field_vb.field_z = 0;
                this.field_vb.field_bb = this.field_bb;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L5: {
            field_xb = (String) null;
            var4 = -param0;
            var5 = -param0;
            if (this.field_tb != null) {
              var4 = this.field_tb.b((byte) 69);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (null != this.field_vb) {
              var5 = this.field_vb.a(-param1 + (-var4 + (-param1 + this.field_G)) - param0, false);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            var6 = param1 + param0 + (var4 + param1) + var5;
            if (var6 <= this.field_G) {
              break L7;
            } else {
              var5 = var5 + (this.field_G - var6);
              var6 = this.field_G;
              break L7;
            }
          }
          L8: {
            if (1 == this.field_z) {
              param1 = param1 + (-var6 + this.field_G) / 2;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (2 == this.field_z) {
              param1 = param1 + (-var6 + this.field_G);
              break L9;
            } else {
              break L9;
            }
          }
          if (null != this.field_tb) {
            this.field_tb.a(var4, this.field_t, -23776, 0, param1);
            this.field_tb.field_bb = this.field_bb;
            if (null != this.field_vb) {
              this.field_vb.a(var5, this.field_t, -23776, 0, param0 + param1 - -var4);
              if (this.field_tb == null) {
                this.field_vb.field_z = this.field_z;
                this.field_vb.field_bb = this.field_bb;
                return;
              } else {
                this.field_vb.field_z = 0;
                this.field_vb.field_bb = this.field_bb;
                return;
              }
            } else {
              return;
            }
          } else {
            if (null != this.field_vb) {
              this.field_vb.a(var5, this.field_t, -23776, 0, param0 + param1 - -var4);
              if (this.field_tb == null) {
                this.field_vb.field_z = this.field_z;
                this.field_vb.field_bb = this.field_bb;
                return;
              } else {
                this.field_vb.field_z = 0;
                this.field_vb.field_bb = this.field_bb;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void f(int param0) {
        field_wb = null;
        field_xb = null;
        if (param0 < 114) {
            field_ub = (String) null;
            field_ub = null;
            return;
        }
        field_ub = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param0, param3, param4 + -23776, param6, param1);
        this.a(param2, param5, (byte) -112);
        if (param4 != 0) {
            this.a(107, -86, 59, 7, 1, 125, 35);
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4;
        int var5;
        L0: {
          var4 = -param2;
          var5 = -param2;
          if (this.field_tb == null) {
            break L0;
          } else {
            var4 = this.field_tb.b((byte) 69);
            break L0;
          }
        }
        if (param1 != 16474) {
          L1: {
            tv.f(-53);
            if (this.field_vb == null) {
              break L1;
            } else {
              var5 = this.field_vb.b((byte) 69);
              break L1;
            }
          }
          return var4 + (param0 - -param2 + var5 + param0);
        } else {
          L2: {
            if (this.field_vb == null) {
              break L2;
            } else {
              var5 = this.field_vb.b((byte) 69);
              break L2;
            }
          }
          return var4 + (param0 - -param2 + var5 + param0);
        }
    }

    static {
        field_ub = "Blue Flamer";
        field_xb = "Show game chat from my friends";
    }
}

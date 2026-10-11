/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp extends ji {
    static int field_D;
    static int[] field_B;
    static java.math.BigInteger field_E;
    private int field_y;
    static String field_z;
    static int field_C;
    static String field_A;

    final int[] c(int param0, int param1) {
        int[] var4 = this.field_x.a(param0, (byte) 59);
        int[] var3 = var4;
        if (this.field_x.field_i) {
          qq.a(var4, 0, we.field_M, this.field_y);
        }
        if (param1 <= 91) {
          return (int[]) null;
        }
        return var4;
    }

    public lp() {
        this(4096);
    }

    final static int h(int param0) {
        int var1_int = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var5Lifetime1;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          if (de.field_f == 13) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          if (ia.field_C == de.field_f) {
            stackIn_9_0 = !(wq.field_H);
            wq.field_H = stackIn_9_0;
          }
          for (var1_int = 0; var1_int < al.field_o.length; var1_int++) {
            if (~al.field_o[var1_int] == ~de.field_f) {
              var2 = 0;
              var3 = al.field_x[var1_int];
              if (var3 != 2) {
                if (var3 != 1) {
                  if (var3 == 3) {
                    if (cr.field_eb[86]) {
                      stackIn_42_0 = (cr.field_eb[82]) ? 1 : 0;
                    } else {
                      stackIn_42_0 = 0;
                    }
                    var2 = stackIn_42_0;
                  } else {
                    if (0 == var3) {
                      if (!cr.field_eb[86]) {
                        stackIn_49_0 = (!cr.field_eb[82]) ? 1 : 0;
                      } else {
                        stackIn_49_0 = 0;
                      }
                      var2 = stackIn_49_0;
                    }
                  }
                } else {
                  if (!cr.field_eb[86]) {
                    stackIn_35_0 = (cr.field_eb[82]) ? 1 : 0;
                  } else {
                    stackIn_35_0 = 0;
                  }
                  var2 = stackIn_35_0;
                }
              } else {
                if (cr.field_eb[86]) {
                  stackIn_28_0 = (!cr.field_eb[82]) ? 1 : 0;
                } else {
                  stackIn_28_0 = 0;
                }
                var2 = stackIn_28_0;
              }
              if (var2 != 0) {
                var3Lifetime1 = var1_int / 12;
                var4 = -(var3Lifetime1 * 12) + var1_int;
                if (-8 + de.field_f >= 0) {
                  var5 = var4 - 8 + 5 * var3Lifetime1;
                  fb.field_w[1][var5] = true;
                  stackIn_54_0 = var5;
                  return stackIn_54_0;
                }
                var5Lifetime1 = 7 * var3Lifetime1 + var4;
                mb.field_s = mb.field_s ^ 1 << var5Lifetime1;
                if (fb.field_w[0].length > var5Lifetime1) {
                  fb.field_w[0][var5Lifetime1] = true;
                }
              }
            }
          }
          if (param0 != 1) {
            lp.g(-4);
          }
          stackIn_62_0 = -1;
          return stackIn_62_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "lp.A(" + param0 + ')');
        }
    }

    public static void g(int param0) {
        field_z = null;
        field_E = null;
        field_B = null;
        field_A = null;
        if (param0 != 86) {
          field_E = (java.math.BigInteger) null;
        }
    }

    private lp(int param0) {
        super(0, true);
        this.field_y = 4096;
        this.field_y = param0;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != 110) {
            return;
          }
          var4_int = param1;
          if (var4_int == 0) {
            this.field_y = (param2.h(-11) << 12) / 255;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("lp.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_B = new int[]{1, 4, 2, 8};
        field_z = "<%0>/<%1>";
        field_E = new java.math.BigInteger("65537");
        field_A = "<col=DE9200>Cooperate</col>";
    }
}

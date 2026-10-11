/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    private int field_a;
    static int field_h;
    private qq[] field_c;
    static String field_g;
    static eg field_f;
    float field_d;
    private int field_e;
    String field_j;
    static ph field_i;
    private int field_b;

    final boolean a(int param0) {
        qq var2;
        int var3;
        qq var4;
        var3 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != -18738) {
          this.field_e = 91;
        }
        while (this.field_e < this.field_a) {
          var4 = this.field_c[this.field_e];
          var2 = var4;
          if (!var4.field_d.b((byte) -95)) {
            this.a(param0 + 18737, var4, 0);
            return false;
          }
          if (var4.field_f >= 0 &&
            !var4.field_d.c(var4.field_f, 0)) {
            this.a(-1, var2, var4.field_d.a(var4.field_f, 100));
            return false;
          }
          if (var4.field_b != null &&
            !var4.field_d.c(var4.field_b, -14012)) {
            this.a(-1, var2, var4.field_d.a(var4.field_b, (byte) -79));
            return false;
          }
          if (0 > var4.field_f &&
            null == var4.field_b &&
            null != var4.field_c &&
            !var4.field_d.b(0)) {
            this.a(-1, var2, var4.field_d.a(-83));
            return false;
          }
          this.field_e = this.field_e + 1;
        }
        return true;
    }

    private final void a(int param0, qq param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_float = (float)param2 / 100.0f + (float)(1 + this.field_e);
          this.field_d = var4_float * (float)this.field_b / (float)(this.field_a - param0);
          if (param2 == 0) {
            this.field_j = param1.field_a;
          } else {
            this.field_j = param1.field_c + " - " + param2 + "%";
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ca.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(uc param0, byte param1, int param2, ga param3) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param0 != null &&
            param0.field_h != null &&
            param3 != null &&
            param3.field_e == param0.field_n) {
            var4_int = param3.field_h.length;
            var5 = param0.field_h[param2].length / var4_int;
            if (param1 <= 101) {
              stackIn_10_0 = 94;
              return stackIn_10_0;
            }
            for (var6 = 0; var6 < var5; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (~param3.field_j == ~param0.field_f[param2][var6] &&
                fd.a(param0.field_e[param2][var6], (byte) -6)) {
                for (var7 = 0; var7 < var4_int; var7++) {
                  if (param3.field_h[var7] != param0.field_h[param2][var7 + var6 * var4_int]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_21_0 = var6;
                  return stackIn_21_0;
                }
              }
            }
            stackIn_24_0 = -1;
            return stackIn_24_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("ca.A(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
          ca.b(76);
        }
        field_g = null;
        field_f = null;
        field_i = null;
    }

    private ca() throws Throwable {
        throw new Error();
    }

    static {
        field_i = new ph(8);
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends mi {
    int field_B;
    static int[] field_A;
    int field_x;
    private int field_y;
    static int field_z;
    private ot field_w;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        String stackIn_27_2 = null;
        int var14 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!super.a((int) (char)param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          int var8_int = -this.field_B + (param2 - param1);
          int var9 = this.field_q - 2 * this.field_B;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_y / var9;
          if (param3 != 1) {
            if (param3 != 2) {
              return true;
            }
            int var10 = 2147483647;
            int var11 = -1;
            for (int var12 = 0; this.field_w.a((byte) 123) > var12; var12++) {
              int var13 = -var8_int + this.field_w.b(var12, 1);
              var13 = var13 * var13;
              if (var13 < var10) {
                var11 = var12;
                var10 = var13;
              }
            }
            if (var11 >= 0) {
              this.field_w.a(var11, (byte) -58);
            }
          } else {
            this.field_w.a((byte) -50, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_26_0 = var8;
          StringBuilder stackIn_26_1 = new StringBuilder().append("pf.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param6).append(')').toString());
        }
    }

    final int c(boolean param0) {
        if (!param0) {
          return 16;
        }
        return this.field_w.a((byte) -114);
    }

    final int a(int param0) {
        if (param0 != -3) {
          return -123;
        }
        return this.field_y;
    }

    final int a(boolean param0, int param1) {
        if (param1 < 0) {
          return -1;
        }
        if (this.field_w.a((byte) -32) <= param1) {
          return -1;
        }
        if (!param0) {
          return this.field_w.b(param1, 1);
        }
        return -3;
    }

    private pf() throws Throwable {
        throw new Error();
    }

    public static void b(boolean param0) {
        if (!param0) {
          field_A = (int[]) null;
          field_A = null;
          return;
        }
        field_A = null;
    }

    static {
        field_A = new int[8192];
    }
}

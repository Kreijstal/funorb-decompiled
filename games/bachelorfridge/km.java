/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class km extends hf {
    int field_I;
    int field_D;
    int field_J;
    int field_A;
    int field_F;
    int field_G;

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = BachelorFridge.field_y;
        try {
          if (!super.b(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_s - (param2 + (this.field_A - param0));
          var9 = param6 - this.field_D - this.field_v - param4;
          if (var9 * var9 + var8_int * var8_int < this.field_G * this.field_G) {
            var10 = Math.atan2((double)var9, (double)var8_int) - nd.field_j;
            if (0.0 > var10) {
              var10 = var10 - 3.141592653589793 / (double)this.field_F;
            } else {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.field_F;
              }
            }
            this.field_I = (int)((double)this.field_F * var10 / 6.283185307179586);
            while (this.field_F <= this.field_I) {
              this.field_I = this.field_I - this.field_F;
            }
            while (this.field_I < 0) {
              this.field_I = this.field_I + this.field_F;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("km.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param6).append(')').toString());
        }
    }

    final static String a(long param0, int param1) {
        if (param1 != -1) {
          km.a(-37L, 30);
        }
        gd.field_o.setTime(new Date(param0));
        int var3 = gd.field_o.get(7);
        int var4 = gd.field_o.get(5);
        int var5 = gd.field_o.get(2);
        int var6 = gd.field_o.get(1);
        int var7 = gd.field_o.get(11);
        int var8 = gd.field_o.get(12);
        int var9 = gd.field_o.get(13);
        return gp.field_B[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + sh.field_E[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    private km() throws Throwable {
        throw new Error();
    }

    static {
    }
}

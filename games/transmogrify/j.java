/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j {
    static int field_b;
    static String field_a;
    int field_c;
    int field_d;
    sj[] field_e;

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -117) {
          j.a((byte) 18);
        }
    }

    final void a(int param0) {
        int incrementValue$1 = 0;
        int var2;
        int var3;
        sj var4;
        int var5;
        int var2Lifetime1;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (param0 != -10874) {
          field_a = (String) null;
        }
        var2 = this.field_e.length;
        while (var2 > 1) {
          incrementValue$1 = var2;
          var2--;
          var3 = li.a(incrementValue$1, o.field_o, false);
          var4 = this.field_e[var3];
          this.field_e[var3] = this.field_e[var2];
          this.field_e[var2] = var4;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_e.length; var2Lifetime1++) {
          if (this.field_e[var2Lifetime1] != null) {
            this.field_e[var2Lifetime1].field_t = var2Lifetime1;
            this.field_e[var2Lifetime1].field_g = var2Lifetime1 * 32 + this.field_d;
            if (this.field_e[var2Lifetime1].field_k == this) {
              this.field_e[var2Lifetime1].field_s = var2Lifetime1;
            }
          }
        }
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        var3 = Transmogrify.field_A ? 1 : 0;
        var2 = 0;
        if (!param0) {
          this.a(false);
        }
        while (this.field_e.length > var2) {
          if (this.field_e[var2] != null) {
            this.field_e[var2].d(1);
            this.field_e[var2] = null;
          }
          var2++;
        }
    }

    final void a(boolean param0, int param1, int param2, int[][] param3, int param4) {
        int var7 = 0;
        int var10 = 0;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] var6 = null;
        RuntimeException var6_ref = null;
        int[] var8 = null;
        sj[] var9 = null;
        sj var11 = null;
        int var12 = 0;
        int[][] var13 = null;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          sb.a(nc.field_p);
          if (param2 != 3) {
            this.a(false);
          }
          var13 = param3;
          var6 = var13;
          for (var7 = 0; var13.length > var7; var7++) {
            var8 = var13[var7];
            sb.g(var8[0], var8[1], var8[2], var8[3]);
            var9 = this.field_e;
            for (var10 = 0; var9.length > var10; var10++) {
              var11 = var9[var10];
              if (var11 != null) {
                stackIn_13_0 = param0;
                stackIn_14_1 = (var11.field_g == var11.field_j) && (var11.field_q == var11.field_p);
                if (stackIn_13_0 ^ stackIn_14_1) {
                  var11.a(param1, param4, param2 - 2, 0);
                }
              }
            }
            sb.b(nc.field_p);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_22_0 = var6_ref;
          stackIn_22_1 = new StringBuilder().append("j.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    j(int param0, int param1, int param2) {
        this.field_c = param2;
        this.field_d = param1;
        this.field_e = new sj[param0];
    }

    static {
        field_b = 0;
        field_a = "Loading...";
    }
}

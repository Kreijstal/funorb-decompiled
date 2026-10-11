/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ci extends td {
    static String field_p;
    static int[] field_q;

    public static void b(int param0) {
        field_q = null;
        field_p = null;
        int var1 = 114 % ((-67 - param0) / 47);
    }

    final ii a(op param0, int param1) {
        int var10 = 0;
        int var11 = 0;
        int fieldTemp$0 = 0;
        ii stackIn_3_0 = null;
        naa stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        naa var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var12 = 0;
        int var13 = 0;
        wia var14 = null;
        int var15 = 0;
        aga var16 = null;
        int[][] var20 = null;
        var15 = BachelorFridge.field_y;
        try {
          var16 = this.field_h.a(param1 + 9, param0);
          var4 = new naa(this.field_g, new nq(var16));
          var4.field_t = this.field_n;
          var4.field_q = this.field_k;
          var20 = var4.d(9268);
          var6 = 17;
          var7 = 17;
          var8 = -1 + var6 >> 1;
          var9 = -1 + var7 >> 1;
          var4.field_u = 0;
          if (param1 != 3) {
            stackIn_3_0 = (ii) null;
            return stackIn_3_0;
          }
          for (var10 = 0; var6 > var10; var10++) {
            for (var11 = 0; var11 < var7; var11++) {
              if (var20[var10][var11] == 1) {
                var12 = -var8 + (var10 + this.field_k);
                var13 = this.field_n + var11 - var9;
                if (0 <= var12 &&
                  var12 < param0.field_z &&
                  var13 >= 0 &&
                  param0.field_B > var13) {
                  var14 = param0.field_a[var12][var13];
                  if (0 == var14.field_n &&
                    var14.field_l == null &&
                    6 > var4.field_u &&
                    kla.a(10, param0.field_w, -2147483648) <= 3) {
                    fieldTemp$0 = var4.field_u;
                    var4.field_u = var4.field_u + 1;
                    var4.field_s[fieldTemp$0] = new aj(var12, var13);
                  }
                }
              }
            }
          }
          if (var4.field_u > 0) {
            var4.field_r = kla.a(var4.field_u, param0.field_w, -2147483648);
          }
          stackIn_26_0 = var4;
          return (ii) ((Object) stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("ci.A(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    ci(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_n = param3;
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ci.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_q = new int[16384];
        field_p = "Quick Chat Help";
    }
}

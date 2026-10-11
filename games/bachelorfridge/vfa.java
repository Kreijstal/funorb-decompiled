/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vfa extends td {
    static String field_r;
    static vr field_p;
    static String field_q;

    public static void b(int param0) {
        field_r = null;
        if (param0 != -14431) {
          return;
        }
        field_p = null;
        field_q = null;
    }

    final static jla a(int param0, int param1) {
        if (param1 == 5) {
          return (jla) ((Object) new eca());
        }
        if (7 == param1) {
          return (jla) ((Object) new ina(false));
        }
        if (param0 != 19341) {
          field_p = (vr) null;
        }
        if (param1 == 8) {
          return (jla) ((Object) new ina(true));
        }
        if (param1 == 3) {
          return (jla) ((Object) new dl());
        }
        return new jla(param1);
    }

    vfa(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_k = param2;
          this.field_n = param3;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vfa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ii a(op param0, int param1) {
        int var11_int = 0;
        bea stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        bea var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        aga var17 = null;
        int[][] var19 = null;
        int[][] var21 = null;
        int[][] var23 = null;
        int var12Lifetime1;
        var15 = BachelorFridge.field_y;
        try {
          var17 = this.field_h.a(93, param0);
          var4 = new bea(this.field_g, new nq(var17));
          var4.field_t = this.field_n;
          if (param1 != 3) {
            vfa.b(-73);
          }
          var4.field_q = this.field_k;
          var23 = var4.c(false);
          var6 = 17;
          var7 = 17;
          var8 = var6 - 1 >> 1;
          var9 = -1 + var7 >> 1;
          var10 = 0;
          for (var11_int = 0; var11_int < var6; var11_int++) {
            for (var12 = 0; var7 > var12; var12++) {
              if (var23[var11_int][var12] == 1) {
                var13 = -var8 + (var11_int + this.field_k);
                var14 = this.field_n + (var12 - var9);
                if (var13 >= 0 &&
                  param0.field_z > var13 &&
                  0 <= var14 &&
                  param0.field_B > var14 &&
                  var10 < 12 &&
                  8 >= kla.a(10, param0.field_w, -2147483648)) {
                  var4.field_r[var10][0] = var13;
                  var4.field_r[var10][1] = var14;
                  var10++;
                }
              }
            }
          }
          if (var10 < 12) {
            var21 = new int[var10][2];
            var19 = var21;
            var11 = var19;
            var16 = 0;
            var12Lifetime1 = var16;
            while (var16 < var21.length) {
              var21[var16][0] = var4.field_r[var16][0];
              var21[var16][1] = var4.field_r[var16][1];
              var16++;
            }
            var4.field_r = var11;
          }
          stackIn_24_0 = var4;
          return (ii) ((Object) stackIn_24_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("vfa.A(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final static fea a(String param0, vr param1, int param2, String param3, vr param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        fea stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param1.a(param3, false);
          var7 = -21 % ((31 - param2) / 43);
          var6 = param1.a((byte) 6, var5_int, param0);
          stackIn_1_0 = jc.a(param4, var6, false, param1, var5_int);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("vfa.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_r = "All players have left <%0>'s game.";
        field_q = "Invalid password.";
    }
}

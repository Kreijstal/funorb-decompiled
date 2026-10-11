/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kj extends rd {
    static String field_o;
    static hj field_q;
    private int field_m;
    static boolean field_r;
    static hj field_p;
    static String field_n;

    final static int b(int param0, int param1) {
        if (param0 != 2) {
          field_o = (String) null;
        }
        return rf.a(param1, in.field_c, -1);
    }

    public static void a(byte param0) {
        field_o = null;
        field_q = null;
        if (param0 <= 96) {
          kj.a((byte) 21);
        }
        field_n = null;
        field_p = null;
    }

    final void a(int[] param0, int param1, byte param2, int[] param3) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int var6Lifetime1;
        var7 = HoldTheLine.field_D;
        try {
          var9 = new int[param0.length + param3.length];
          var12 = var9;
          var11 = var12;
          var5 = var11;
          for (var6 = 0; param0.length > var6; var6++) {
            var9[var6] = param0[var6];
          }
          var10 = 0;
          var6Lifetime1 = var10;
          if (param2 >= -49) {
            var8 = (int[]) null;
            this.a((int[]) null, 1, (byte) -32, (int[]) null);
          }
          while (param3.length / 2 > var10) {
            var5[param0.length + 2 * var10] = param3[param3.length - (2 + 2 * var10)];
            var5[1 + var10 * 2 + param0.length] = param3[param3.length - 1 - 2 * var10];
            var10++;
          }
          gf.a(var12, this.field_m);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("kj.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    kj(int param0, int param1) {
        this.field_c = param0 / 2;
        this.field_i = 2;
        this.field_h = -this.field_c + param0;
        this.field_k = 40.0f;
        this.field_m = param1;
    }

    final static boolean a(int param0, qm param1, qm param2, ei param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        ei var6 = null;
        int var7 = 0;
        lb var8 = null;
        int var9 = 0;
        lb var10 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = HoldTheLine.field_D;
        try {
          var10 = new lb(param2, param1, 0, false, true);
          if (param0 != 140) {
            field_o = (String) null;
          }
          var5 = 0;
          L1: while (true) {
            if (var5 >= param3.field_e) {
              return false;
            }
            var6 = (ei) (param3.field_b[var5]);
            var7 = 0;
            while (true) {
              if (var7 >= var6.field_e) {
                var5++;
                continue L1;
              }
              var8 = (lb) (var6.field_b[var7]);
              if (!th.a(param0 - 141, var10, var8)) {
                var7++;
                continue;
              }
              break;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("kj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
        field_o = "Waiting for music";
        field_n = "<%0> unlocked!";
        field_p = new hj(540, 140);
    }
}

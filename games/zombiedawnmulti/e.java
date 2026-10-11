/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class e implements Iterable {
    static String field_f;
    qa field_d;
    static int field_a;
    static nm field_e;
    static String field_b;
    static fm field_c;

    final static void a(ul param0, byte[] param1, int param2, String[] param3, int[] param4, int param5, ja[][] param6, String[] param7, boolean param8, String[][] param9, int param10, String[][] param11, ul param12, byte[] param13, int[] param14, ri[] param15, ja[][] param16, ul param17, boolean param18) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        String[] var20 = null;
        try {
          if (!param8) {
            field_e = (nm) null;
          }
          var20 = (String[]) null;
          vb.a(param10, param11, (String[]) null, param3, param18, param9, param4, param7, param1, param17, param14, 1, param6, param5, param0, false, param16, param12, param13, param15);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = decompiledCaughtException;
          stackIn_6_0 = var19;
          stackIn_6_1 = new StringBuilder().append("e.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param7 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param12 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param13 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param14 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param15 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param16 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param17 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param18).append(')').toString());
        }
    }

    final void a(qa param0, byte param1) {
        if (param0.field_p != null) {
          param0.a(-4564);
        }
        if (param1 < 72) {
          return;
        }
        try {
          param0.field_k = this.field_d;
          param0.field_p = this.field_d.field_p;
          param0.field_p.field_k = param0;
          param0.field_k.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "e.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, ri param1) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if ((3 & (param1.field_h | (param1.field_b | param1.field_e | param1.field_j))) == 0) {
          return;
        }
        int var2_int = param1.field_e + (param1.field_j & 3);
        var2_int = 4 + (-(var2_int & 3) + var2_int);
        int var3 = (param1.field_h & 3) + param1.field_b;
        var3 = 4 - (3 & var3) + var3;
        byte[] var4 = new byte[var3 * var2_int];
        int var5 = 0;
        int var6 = var2_int * (param1.field_h & 3) + (3 & param1.field_j);
        if (param0 != 48) {
          return;
        }
        try {
          for (var7 = 0; var7 < param1.field_b; var7++) {
            for (var8 = 0; param1.field_e > var8; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param1.field_m[incrementValue$1];
            }
            var6 = var6 + (-param1.field_e + var2_int);
          }
          param1.field_e = var2_int;
          param1.field_j = param1.field_j & -4;
          param1.field_h = param1.field_h & -4;
          param1.field_b = var3;
          param1.field_m = var4;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "e.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final qa a(boolean param0) {
        qa var2 = this.field_d.field_k;
        if (var2 == this.field_d) {
          return null;
        }
        var2.a(-4564);
        if (param0) {
          return (qa) null;
        }
        return var2;
    }

    public static void a(int param0) {
        int var1 = -114 / ((63 - param0) / 51);
        field_e = null;
        field_c = null;
        field_f = null;
        field_b = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ln(this));
    }

    e() {
        this.field_d = new qa();
        this.field_d.field_p = this.field_d;
        this.field_d.field_k = this.field_d;
    }

    static {
        field_f = "Blow them to smithereens.";
        field_b = "Return to Main Menu";
    }
}

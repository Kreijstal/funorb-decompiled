/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    static String field_a;
    static String field_b;
    static String field_c;

    final static void a(byte param0, fb param1, ob param2, boolean param3) {
        int var8 = 0;
        fb stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        fb stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        fb stackIn_14_0 = null;
        int stackIn_15_1 = 0;
        fb stackIn_17_0 = null;
        boolean stackIn_18_1 = false;
        fb stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        fb stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param3) {
            param1.field_Lb = param2.j(-95);
          }
          param1.field_Eb = param2.j(-64);
          if (param0 != -89) {
            mi.a((byte) -67);
          }
          param1.field_nc = param2.j(-123);
          var4_int = param2.j(-111);
          stackIn_7_0 = (fb) (param1);
          stackIn_8_1 = (0 != (128 & var4_int));
          stackIn_7_0.field_Qb = stackIn_8_1;
          stackIn_11_0 = (fb) (param1);
          stackIn_12_1 = (param1.field_Qb) && (param1.field_Eb > param1.field_Lb);
          stackIn_11_0.field_cc = stackIn_12_1;
          stackIn_14_0 = (fb) (param1);
          if ((16 & var4_int) != 0) {
            stackIn_15_1 = 2;
          } else {
            stackIn_15_1 = 1;
          }
          stackIn_14_0.field_Fb = stackIn_15_1;
          stackIn_17_0 = (fb) (param1);
          stackIn_18_1 = (0 != (var4_int & 32));
          stackIn_17_0.field_ec = stackIn_18_1;
          stackIn_20_0 = (fb) (param1);
          stackIn_21_1 = ((8 & var4_int) != 0);
          stackIn_20_0.field_mc = stackIn_21_1;
          stackIn_23_0 = (fb) (param1);
          stackIn_24_1 = ((var4_int & 64) != 0);
          stackIn_23_0.field_Ab = stackIn_24_1;
          stackIn_27_0 = (0 == (4 & var4_int)) ? 0 : 1;
          var5 = stackIn_27_0;
          stackIn_30_0 = ((2 & var4_int) == 0) ? 0 : 1;
          var6 = stackIn_30_0;
          param2.a(param1.field_dc.length, 0, 17469032, param1.field_dc);
          param1.field_Zb = param2.f(-20976);
          param1.field_Gb = pr.a(param0 + 14363) - (long)param2.a(16711680);
          if (var5 == 0) {
            param1.field_lc = -1;
          } else {
            param1.field_lc = param2.a(16711680);
          }
          param1.field_fc = param2.d(127);
          var7 = param2.field_j;
          param1.field_Xb = param2.e(-1);
          if (var6 == 0) {
            param1.field_jc = null;
            return;
          }
          param2.field_j = var7;
          param1.field_jc = new String[param1.field_Lb];
          for (var8 = 0; param1.field_Lb > var8; var8++) {
            param1.field_jc[var8] = param2.e(-1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("mi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (param2 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 95) {
          field_a = (String) null;
          field_c = null;
          field_b = null;
          return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        field_a = "Your ignore list is full. Max of 100 hit.";
        field_b = "Invite more players, or alternatively try changing the following settings:  ";
        field_c = "No";
    }
}

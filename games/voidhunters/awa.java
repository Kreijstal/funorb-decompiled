/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class awa extends rqa {
    static StringBuilder field_p;
    static String[][] field_o;
    static int field_q;

    final static void a(int param0, mm param1, boolean param2, ds param3) {
        int var9 = 0;
        mm stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        mm stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        mm stackIn_11_0 = null;
        int stackIn_12_1 = 0;
        mm stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        mm stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        mm stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        try {
          if (param2) {
            param1.field_zb = param3.e((byte) -114);
          }
          param1.field_Fb = param3.e((byte) -109);
          param1.field_Cb = param3.e((byte) -120);
          var4_int = param3.e((byte) -113);
          stackIn_5_0 = (mm) (param1);
          stackIn_6_1 = ((var4_int & 128) != 0);
          stackIn_5_0.field_Xb = stackIn_6_1;
          stackIn_8_0 = (mm) (param1);
          stackIn_9_1 = (0 != (var4_int & 8));
          stackIn_8_0.field_Gb = stackIn_9_1;
          stackIn_11_0 = (mm) (param1);
          if ((var4_int & 16) == 0) {
            stackIn_12_1 = 1;
          } else {
            stackIn_12_1 = 2;
          }
          stackIn_11_0.field_Bb = stackIn_12_1;
          stackIn_15_0 = (mm) (param1);
          stackIn_16_1 = (param1.field_Xb) && (param1.field_zb < param1.field_Fb);
          stackIn_15_0.field_cc = stackIn_16_1;
          stackIn_18_0 = (mm) (param1);
          stackIn_19_1 = ((64 & var4_int) != 0);
          stackIn_18_0.field_fc = stackIn_19_1;
          stackIn_21_0 = (mm) (param1);
          stackIn_22_1 = ((var4_int & 32) != 0);
          stackIn_21_0.field_xb = stackIn_22_1;
          stackIn_25_0 = ((4 & var4_int) == 0) ? 0 : 1;
          var5 = stackIn_25_0;
          param3.a(0, param1.field_Pb, (byte) -59, param1.field_Pb.length);
          stackIn_28_0 = (0 == (2 & var4_int)) ? 0 : 1;
          var6 = stackIn_28_0;
          param1.field_Kb = param3.e(1869);
          param1.field_Ob = wt.a(false) - (long)param3.h(106);
          var7 = -124 % ((param0 - 42) / 44);
          if (var5 == 0) {
            param1.field_Ub = -1;
          } else {
            param1.field_Ub = param3.h(53);
          }
          param1.field_Nb = param3.k(255);
          var8 = param3.field_e;
          param1.field_Vb = param3.a(-1);
          if (var6 != 0) {
            param3.field_e = var8;
            param1.field_Ib = new String[param1.field_zb];
            for (var9 = 0; var9 < param1.field_zb; var9++) {
              param1.field_Ib[var9] = param3.a(-1);
            }
            return;
          }
          param1.field_Ib = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_39_0 = var4;
          stackIn_39_1 = new StringBuilder().append("awa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    final static ha a(byte param0, int param1, java.awt.Canvas param2, d param3, int param4) {
        RuntimeException var5 = null;
        oa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 110) {
            field_o = (String[][]) null;
          }
          stackIn_3_0 = new oa(param2, param3, param1, param4);
          return (ha) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("awa.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_o = (String[][]) null;
        if (param0 != -1) {
          field_p = (StringBuilder) null;
        }
    }

    awa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          sn.field_Y = param0[0].a(false);
          if (param1 > -119) {
            field_p = (StringBuilder) null;
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("awa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = new StringBuilder(80);
        field_q = 2;
    }
}

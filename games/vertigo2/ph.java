/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends li {
    byte[] field_n;

    ph(byte[] param0) {
        try {
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ph.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(uh param0, boolean param1, ed param2, boolean param3) {
        int var8 = 0;
        uh stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        uh stackIn_11_0 = null;
        int stackIn_12_1 = 0;
        uh stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        uh stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        uh stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        uh stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param3) {
            param0.field_Qb = param2.h(-11);
          }
          param0.field_uc = param2.h(-11);
          param0.field_Ub = param2.h(-11);
          if (!param1) {
            return;
          }
          var4_int = param2.h(-11);
          stackIn_8_0 = (uh) (param0);
          stackIn_9_1 = ((var4_int & 128) != 0);
          stackIn_8_0.field_Mb = stackIn_9_1;
          stackIn_11_0 = (uh) (param0);
          if ((var4_int & 16) != 0) {
            stackIn_12_1 = 2;
          } else {
            stackIn_12_1 = 1;
          }
          stackIn_11_0.field_xc = stackIn_12_1;
          stackIn_14_0 = (uh) (param0);
          stackIn_15_1 = ((var4_int & 32) != 0);
          stackIn_14_0.field_Tb = stackIn_15_1;
          stackIn_18_0 = (uh) (param0);
          stackIn_19_1 = (param0.field_Mb) && (param0.field_uc > param0.field_Qb);
          stackIn_18_0.field_dc = stackIn_19_1;
          stackIn_21_0 = (uh) (param0);
          stackIn_22_1 = ((var4_int & 8) != 0);
          stackIn_21_0.field_vc = stackIn_22_1;
          stackIn_24_0 = (uh) (param0);
          stackIn_25_1 = (0 != (var4_int & 64));
          stackIn_24_0.field_kc = stackIn_25_1;
          stackIn_28_0 = ((4 & var4_int) == 0) ? 0 : 1;
          var5 = stackIn_28_0;
          param2.a(0, param0.field_fc, param0.field_fc.length, 61);
          stackIn_31_0 = ((2 & var4_int) == 0) ? 0 : 1;
          var6 = stackIn_31_0;
          param0.field_tc = param2.a((byte) -11);
          param0.field_Pb = gk.a(94) - (long)param2.b(param1);
          if (var5 != 0) {
            param0.field_Yb = param2.b(true);
          } else {
            param0.field_Yb = -1;
          }
          param0.field_hc = param2.i(-31016);
          var7 = param2.field_u;
          param0.field_Nb = param2.f(128);
          if (var6 == 0) {
            param0.field_Hb = null;
            return;
          }
          param0.field_Hb = new String[param0.field_Qb];
          param2.field_u = var7;
          for (var8 = 0; param0.field_Qb > var8; var8++) {
            param0.field_Hb[var8] = param2.f(128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("ph.A(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}

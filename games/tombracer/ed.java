/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static double field_a;

    final static void a(int param0, ht param1, boolean param2, uia param3) {
        int var8 = 0;
        ht stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        ht stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        ht stackIn_12_0 = null;
        int stackIn_13_1 = 0;
        ht stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        ht stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        ht stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2) {
            param1.field_Mb = param3.h(255);
          }
          param1.field_Jb = param3.h(255);
          param1.field_cc = param3.h(255);
          var4_int = param3.h(255);
          stackIn_6_0 = (ht) (param1);
          stackIn_7_1 = ((128 & var4_int) != 0);
          stackIn_6_0.field_Tb = stackIn_7_1;
          stackIn_9_0 = (ht) (param1);
          stackIn_10_1 = (0 != (var4_int & 64));
          stackIn_9_0.field_ec = stackIn_10_1;
          stackIn_12_0 = (ht) (param1);
          if (0 != (var4_int & 16)) {
            stackIn_13_1 = 2;
          } else {
            stackIn_13_1 = 1;
          }
          stackIn_12_0.field_yb = stackIn_13_1;
          stackIn_15_0 = (ht) (param1);
          stackIn_16_1 = ((var4_int & param0) != 0);
          stackIn_15_0.field_Ob = stackIn_16_1;
          stackIn_19_0 = (ht) (param1);
          stackIn_20_1 = (param1.field_Tb) && (param1.field_Jb > param1.field_Mb);
          stackIn_19_0.field_Bb = stackIn_20_1;
          stackIn_22_0 = (ht) (param1);
          stackIn_23_1 = ((var4_int & 8) != 0);
          stackIn_22_0.field_Yb = stackIn_23_1;
          stackIn_26_0 = ((4 & var4_int) == 0) ? 0 : 1;
          var5 = stackIn_26_0;
          param3.a(param1.field_ac, 0, -104, param1.field_ac.length);
          stackIn_29_0 = ((2 & var4_int) == 0) ? 0 : 1;
          var6 = stackIn_29_0;
          param1.field_Wb = param3.d(param0 + 93);
          param1.field_Gb = bva.b((byte) -107) - (long)param3.e(-105);
          if (var5 != 0) {
            param1.field_Kb = param3.e(param0 ^ 64);
          } else {
            param1.field_Kb = -1;
          }
          param1.field_Ab = param3.b(290646880);
          var7 = param3.field_h;
          param1.field_tb = param3.e((byte) -76);
          if (var6 != 0) {
            param3.field_h = var7;
            param1.field_Cb = new String[param1.field_Mb];
            for (var8 = 0; var8 < param1.field_Mb; var8++) {
              param1.field_Cb[var8] = param3.e((byte) -76);
            }
            return;
          }
          param1.field_Cb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_40_0 = var4;
          stackIn_40_1 = new StringBuilder().append("ed.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final static mi a(cr param0, int param1) throws jj {
        mi stackIn_6_0 = null;
        mi stackIn_20_0 = null;
        mi stackIn_26_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        mi var4 = null;
        mi var5 = null;
        mi var6 = null;
        try {
          var4 = param0.c((byte) -127);
          if (var4.field_p != ma.field_e &&
            nl.field_d != var4.field_p &&
            dc.field_o != var4.field_p &&
            var4.field_p != dja.field_r) {
            if (param1 != -31733) {
              field_a = -1.1603987584850415;
            }
            if (var4.field_p != tr.field_f) {
              throw new jj(var4.field_h);
            }
            if (param0.a((byte) 100)) {
              throw new jj(var4.field_h);
            }
            var5 = param0.c((byte) -126);
            if (var5.field_p != lna.field_a) {
              throw new jj(var5.field_h);
            }
            var4.field_i = new vna();
            while (true) {
              if (param0.a((byte) 127)) {
                throw new jj(var4.field_h);
              }
              if (param0.c((byte) -127).field_p == rs.field_a) {
                stackIn_20_0 = var4;
                return stackIn_20_0;
              }
              param0.field_c = param0.field_c - 1;
              var4.field_i.b((byte) -127, ed.a(param0, -31733));
              if (param0.a((byte) 125)) {
                throw new jj(var4.field_h);
              }
              var6 = param0.c((byte) -126);
              if (var6.field_p == rs.field_a) {
                stackIn_26_0 = var4;
                return stackIn_26_0;
              }
              if (var6.field_p != qba.field_c) {
                throw new jj(var6.field_h);
              }
            }
          }
          stackIn_6_0 = var4;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("ed.B(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = -1.0;
    }
}

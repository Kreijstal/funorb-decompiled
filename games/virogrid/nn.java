/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static km field_b;
    static int field_a;

    final static void a(mg[][] param0, mg[][] param1, int param2, byte[] param3, byte[] param4, eh param5, eh param6, boolean param7, int param8, String[][] param9, String[][] param10, String[] param11, int[] param12, int param13, eh param14) {
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        int[] var16 = null;
        rm[] var17 = null;
        try {
          if (param8 != -27871) {
            field_a = 80;
          }
          var17 = (rm[]) null;
          var16 = (int[]) null;
          pb.a(param4, param6, param11, param2, param7, param13, param3, (rm[]) null, param14, param12, param9, (int[]) null, param10, false, param5, param1, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_6_0 = var15;
          stackIn_6_1 = new StringBuilder().append("nn.D(");
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
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param6 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param10 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param11 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param12 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2) {
        hg var3 = gk.field_g;
        var3.g(param1, 8);
        var3.a(3, -118);
        if (param2 < -112) {
          var3.a(9, 66);
          var3.a((byte) -63, param0);
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        ca.field_D = (param1 & 53) >> 4;
        qe.field_m = (param1 & 15) >> 2;
        if (ca.field_D > 2) {
          ca.field_D = 2;
          el.field_t = param1 & 3;
          if (param0) {
            if (!(qe.field_m <= 2)) {
              qe.field_m = 2;
            }
            if (el.field_t <= 2) {
              return;
            }
            el.field_t = 2;
            return;
          }
          nn.a(true, -24);
          if (!(qe.field_m <= 2)) {
            qe.field_m = 2;
          }
          if (el.field_t > 2) {
            el.field_t = 2;
            return;
          }
          return;
        }
        el.field_t = param1 & 3;
        if (!param0) {
          nn.a(true, -24);
          if (!(qe.field_m <= 2)) {
            qe.field_m = 2;
          }
          if (el.field_t <= 2) {
            return;
          }
          el.field_t = 2;
          return;
        }
        if (!(qe.field_m <= 2)) {
          qe.field_m = 2;
        }
        if (el.field_t <= 2) {
          return;
        }
        el.field_t = 2;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 53) {
          field_b = (km) null;
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException var2 = null;
        eh var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          uh.a((java.awt.Component) ((Object) param0), (byte) 97);
          if (param1 >= -40) {
            var3 = (eh) null;
            nn.a((mg[][]) null, (mg[][]) null, -23, (byte[]) null, (byte[]) null, (eh) null, (eh) null, false, -93, (String[][]) null, (String[][]) null, (String[]) null, (int[]) null, 76, (eh) null);
          }
          ga.a((java.awt.Component) ((Object) param0), false);
          if (sb.field_d == null) {
            return;
          }
          sb.field_d.a(31131, (java.awt.Component) ((Object) param0));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("nn.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 < 64) {
          return;
        }
        if (ij.field_j == null) {
          return;
        }
        if (ij.field_j.a(true, param1)) {
          ij.field_j = null;
          return;
        }
    }

    static {
    }
}

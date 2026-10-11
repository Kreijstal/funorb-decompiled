/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends vm {
    static int field_l;
    private qn field_m;
    private qn field_n;

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -9316) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var6 = this.field_n.field_v.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            return null;
          }
          var5 = var4;
          if (gl.a(0, var5)) {
            stackIn_8_0 = kg.field_T;
            return stackIn_8_0;
          }
          if (ah.a(var5, (byte) -29)) {
            stackIn_12_0 = q.field_a;
            return stackIn_12_0;
          }
          if (pd.a(var5, (byte) 90)) {
            stackIn_16_0 = de.field_b;
            return stackIn_16_0;
          }
          if (this.b((byte) -108, param0)) {
            stackIn_20_0 = ek.field_e;
            return stackIn_20_0;
          }
          if (0 >= var6.length()) {
            stackIn_23_0 = ao.field_f;
            return stackIn_23_0;
          }
          if (ml.a(var6, var5, 0)) {
            stackIn_27_0 = ab.field_t;
            return stackIn_27_0;
          }
          if (ma.a(var6, param1 ^ -9279, var5)) {
            stackIn_30_0 = bi.field_e;
            return stackIn_30_0;
          }
          if (!oc.a(var5, -125, var6)) {
            return kg.field_T;
          }
          stackIn_34_0 = ab.field_t;
          return stackIn_34_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("je.D(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(')').toString());
        }
    }

    final static hl d(boolean param0) {
        if (!param0) {
          if (ic.field_e == null) {
            ic.field_e = new hl(rc.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, rc.field_a.field_C, -1, 2147483647, true);
          }
          return ic.field_e;
        }
        je.d(false);
        if (ic.field_e == null) {
          ic.field_e = new hl(rc.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, rc.field_a.field_C, -1, 2147483647, true);
        }
        return ic.field_e;
    }

    private final boolean b(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -22) {
            return false;
          }
          var3 = this.field_m.field_v.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > 0 &&
            var4.length() > 0) {
            var5 = var3.lastIndexOf("@");
            if (0 <= var5) {
              if (var5 >= var3.length() - 1) {
                return false;
              }
              var6 = var3.substring(0, var5);
              var7 = var3.substring(var5 + 1);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              stackIn_15_0 = (var4.indexOf(var7) >= 0);
              return stackIn_15_0;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("je.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final mk a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        mk stackIn_3_0 = null;
        mk stackIn_7_0 = null;
        mk stackIn_10_0 = null;
        mk stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_n.field_v.toLowerCase();
          var5 = -15 % ((-49 - param0) / 62);
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_3_0 = qk.field_b;
            return stackIn_3_0;
          }
          if (!g.a(83, var3, var4)) {
            stackIn_7_0 = qk.field_b;
            return stackIn_7_0;
          }
          if (!this.b((byte) -94, param1)) {
            stackIn_12_0 = oa.field_a;
            return stackIn_12_0;
          }
          stackIn_10_0 = qk.field_b;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("je.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean h(int param0) {
        if (param0 != 30065) {
          return false;
        }
        if (il.field_a < 20) {
          return true;
        }
        if (!vd.p(-101)) {
          return true;
        }
        if (gm.field_d <= 0) {
          return false;
        }
        if (!tb.a((byte) 61)) {
          return true;
        }
        return false;
    }

    je(qn param0, qn param1, qn param2) {
        super(param0);
        try {
          this.field_n = param1;
          this.field_m = param2;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "je.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = 0;
    }
}

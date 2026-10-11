/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends se {
    static int field_i;
    static int field_p;
    static String field_n;
    static dl[] field_o;
    static ko field_m;
    static int field_q;
    static String field_l;
    static String field_k;
    private ga field_j;
    private ga field_r;

    public static void d(int param0) {
        field_n = null;
        if (param0 == -31737) {
          field_l = null;
          field_o = null;
          field_m = null;
          field_k = null;
          return;
        }
        field_l = (String) null;
        field_l = null;
        field_o = null;
        field_m = null;
        field_k = null;
    }

    private final boolean a(String param0, boolean param1) {
        boolean discarded$1 = false;
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_r.field_o.toLowerCase();
          if (param1) {
            var8 = (String) null;
            discarded$1 = this.a((String) null, true);
          }
          var4 = param0.toLowerCase();
          if (var3.length() > 0 &&
            var4.length() > 0) {
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0) {
              if (var5 >= var3.length() - 1) {
                return false;
              }
              var6 = var3.substring(0, var5);
              var7 = var3.substring(1 + var5);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("jn.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    private final static boolean a(byte param0, String param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (lo.a(param2, 59)) {
            return false;
          }
          if (qc.a(param2, -122)) {
            return false;
          }
          if (bf.a(param2, false)) {
            return false;
          }
          if (param1.length() == 0) {
            return true;
          }
          var3_int = 94 / ((param0 + 31) / 58);
          if (wp.a(param2, -1, param1)) {
            return false;
          }
          if (dq.a(param2, -83, param1)) {
            return false;
          }
          if (!tf.a(112, param2, param1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("jn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    jn(ga param0, ga param1, ga param2) {
        super(param0);
        try {
          this.field_r = param2;
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "jn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.field_j.field_o.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var5 = var4;
          if (bf.a(var5, false)) {
            stackIn_5_0 = dq.field_G;
            return stackIn_5_0;
          }
          if (lo.a(var5, 52)) {
            stackIn_8_0 = pb.field_c;
            return stackIn_8_0;
          }
          var6 = -39 % ((41 - param1) / 49);
          if (qc.a(var5, -121)) {
            stackIn_11_0 = fk.field_q;
            return stackIn_11_0;
          }
          if (this.a(param0, false)) {
            stackIn_14_0 = kd.field_k;
            return stackIn_14_0;
          }
          if (0 >= var7.length()) {
            stackIn_29_0 = sl.field_u;
            return stackIn_29_0;
          }
          if (wp.a(var5, -1, var7)) {
            stackIn_19_0 = tp.field_d;
            return stackIn_19_0;
          }
          if (dq.a(var5, -65, var7)) {
            stackIn_23_0 = rg.field_c;
            return stackIn_23_0;
          }
          if (!tf.a(81, var5, var7)) {
            return dq.field_G;
          }
          stackIn_27_0 = tp.field_d;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("jn.H(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    final oi a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        oi stackIn_4_0 = null;
        oi stackIn_8_0 = null;
        oi stackIn_11_0 = null;
        oi stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_j.field_o.toLowerCase();
          var4 = param0.toLowerCase();
          if (param1 != -122) {
            var5 = (String) null;
            this.a((String) null, (byte) 73);
          }
          if (0 == var4.length()) {
            stackIn_4_0 = rk.field_c;
            return stackIn_4_0;
          }
          if (!jn.a((byte) 112, var3, var4)) {
            stackIn_8_0 = rk.field_c;
            return stackIn_8_0;
          }
          if (!this.a(param0, false)) {
            stackIn_13_0 = ih.field_b;
            return stackIn_13_0;
          }
          stackIn_11_0 = rk.field_c;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("jn.G(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_n = "Bonus Levels complete";
        field_l = "Right First Time";
        field_k = "Loading fonts";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends cg {
    static w field_j;
    static byte[][] field_k;

    public static void c(boolean param0) {
        if (!param0) {
          rd.b((byte) 56);
          field_k = (byte[][]) null;
          field_j = null;
          return;
        }
        field_k = (byte[][]) null;
        field_j = null;
    }

    final static int a(int param0, int param1) {
        if (param1 == 1266438832) {
          param0 = (1431655765 & param0) + ((param0 & -1431655766) >>> 1);
          param0 = (param0 & 858993459) + (param0 >>> 2 & -1288490189);
          param0 = 252645135 & param0 + (param0 >>> 4);
          param0 = param0 + (param0 >>> 8);
          param0 = param0 + (param0 >>> 16);
          return 255 & param0;
        }
        field_j = (w) null;
        param0 = (1431655765 & param0) + ((param0 & -1431655766) >>> 1);
        param0 = (param0 & 858993459) + (param0 >>> 2 & -1288490189);
        param0 = 252645135 & param0 + (param0 >>> 4);
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return 255 & param0;
    }

    final static void a(byte param0, String param1) {
        try {
          we.a(-119, param1);
          if (param0 <= 54) {
            field_j = (w) null;
          }
          ca.a(kj.field_q, false, 16777215);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "rd.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final sg a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        sg stackIn_7_0 = null;
        sg stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (null != di.a(param0, 64)) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (param1 >= -58) {
            field_j = (w) null;
          }
          if (var3_int != 0) {
            stackIn_9_0 = ii.field_e;
            return stackIn_9_0;
          }
          stackIn_7_0 = pe.field_b;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("rd.M(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    rd(hf param0) {
        super(param0);
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (sd.field_c == null) {
          if (null != ji.field_a) {
            ji.field_a.c(true);
          }
          var1 = -127 / ((param0 - 12) / 41);
          vb.a((byte) 44);
          return;
        }
        sd.field_c.b(true);
        if (null != ji.field_a) {
          ji.field_a.c(true);
        }
        var1Lifetime1 = -127 / ((param0 - 12) / 41);
        vb.a((byte) 44);
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, -81) == pe.field_b) {
            stackIn_2_0 = ha.field_c;
            return stackIn_2_0;
          }
          if (param1) {
            field_k = (byte[][]) null;
          }
          stackIn_6_0 = gi.field_g;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("rd.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}

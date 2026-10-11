/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dm {
    static hg field_c;
    static String field_a;
    static nl field_b;

    abstract ug b(byte param0);

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static void a(boolean param0) {
        if (param0) {
          return;
        }
        if (lf.field_S > 10) {
          an.a(-10 + lf.field_S, (byte) 120);
        } else {
          an.a(0, (byte) 96);
        }
    }

    public static void a(byte param0) {
        int var1 = 100 / ((param0 - 19) / 62);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static c a(int param0, um param1, String param2, um param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        c stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param1.a(param4, param0 ^ param0);
          var6 = param1.a(param2, param0 + 7, var5_int);
          stackIn_1_0 = ig.a(var6, param3, -122, var5_int, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("dm.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    abstract void a(p param0, byte param1);

    final static void a(lh param0, um param1, int param2) {
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        j var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        lh var12 = null;
        int[] var16 = null;
        var9 = Chess.field_G;
        try {
          var3_int = se.field_V;
          rh.field_c = new ci(0L, (ci) null);
          if (param1 == null) {
            var10 = (Throwable) null;
            fg.a((Throwable) null, (byte) -77, "QC1");
            return;
          }
          param1.field_f = 0;
          param1.field_k = false;
          ak.field_u = new kj(var3_int, param1, param1);
          oa.field_b = new qc(var3_int, param1, param1, new th());
          var4 = p.a(param2 - 1529624);
          if (var4 == null) {
            var11 = (Throwable) null;
            fg.a((Throwable) null, (byte) -77, "QC2");
            return;
          }
          dh.a(121, var4);
          var12 = (lh) null;
          vj.field_g = aj.a(1513239, 65793, 2245737, 65793, 0, 5138823, (lh) null, 4020342, 65793, (byte) 116, param2, 8947848, 1127256);
          wk.field_c = aj.a(0, 0, 0, 0, 16764006, 0, param0, 0, 0, (byte) -95, 0, 0, 0);
          va.field_d = aj.a(0, 0, 0, 0, 16777215, 0, param0, 0, 0, (byte) -28, 0, 0, 0);
          var5 = wb.field_h;
          var6 = wb.field_c;
          var16 = wb.field_d;
          mc.field_b = new km(10, 14);
          mc.field_b.e();
          for (var8 = 2; var8 < 7; var8++) {
            wb.f(var8, var8 + 1, 14 - (var8 << 1), 16777215);
          }
          wb.a(var16, var5, var6);
          ng.field_c = vc.a((byte) 88, vj.field_g, va.field_d, wk.field_c, var4);
          rh.field_c.field_I = new jc();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("dm.H(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_c = new hg(15, 0, 1, 0);
        field_a = "Fastest";
    }
}

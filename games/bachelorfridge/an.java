/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an extends qb {
    static String field_s;
    static int field_q;
    static int field_t;
    static ee field_r;

    final static kv[] a(byte param0, vr param1, String param2, String param3) {
        kv[] var4 = null;
        RuntimeException var4_ref = null;
        kv[] var5 = null;
        kv[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = pi.a(param1, -8845, param2, param3);
          var4 = var5;
          var5[1].field_n = var5[1].field_q;
          var5[3].field_o = var5[3].field_p;
          var5[5].field_o = var5[5].field_p;
          var5[7].field_n = var5[7].field_q;
          if (param0 > -118) {
            field_s = (String) null;
          }
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("an.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public an() {
    }

    final int[][] a(boolean param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = BachelorFridge.field_y;
        if (param0) {
          field_t = 113;
        }
        int[][] var13 = this.field_h.a(param1, -858);
        int[][] var12 = var13;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (this.field_h.field_b &&
          this.e((byte) -117)) {
          var4 = var13[0];
          var5 = var13[1];
          var6 = var13[2];
          var7 = param1 % this.field_p * this.field_p;
          for (var8 = 0; var8 < hh.field_d; var8++) {
            var9 = this.field_n[var8 % this.field_o + var7];
            var6[var8] = dda.a(4080, var9 << 4);
            var5[var8] = dda.a(65280, var9) >> 4;
            var4[var8] = dda.a(var9 >> 12, 4080);
          }
        }
        return var11;
    }

    final static void a(byte[] param0, int param1) {
        int var2_int = 0;
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var9 = BachelorFridge.field_y;
        try {
          lka.field_E = qs.a(false, new lu(param0));
          if (param1 > -40) {
            an.f((byte) 123);
          }
          fw.field_h = new pd[-1 + lka.field_E.length];
          for (var2_int = 1; var2_int < lka.field_E.length; var2_int++) {
            vc.a(var2_int, 0, -16306);
            var3 = lka.field_E[var2_int][3];
            var4 = lka.field_E[var2_int][16];
            var5 = m.a(var2_int, (byte) -98, 1);
            var6 = kka.a(var2_int, -114, 2);
            var7 = vc.a(var2_int, 9, -16306);
            var8 = lt.b(28427, var2_int) ? 1 : 0;
            qq.a(var8 != 0, var4, var3, var5, var7, var6, var6, 29052);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("an.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_s = null;
        if (param0 != 86) {
          String var2 = (String) null;
          an.a((byte) 1, (vr) null, (String) null, (String) null);
        }
        field_r = null;
    }

    static {
        field_s = "Private";
        field_q = 0;
    }
}

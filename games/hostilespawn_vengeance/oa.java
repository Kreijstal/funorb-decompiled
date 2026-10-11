/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static String field_j;
    static bd[] field_m;
    static wm field_b;
    static int[] field_c;
    static nd field_g;
    static String field_h;
    static je field_k;
    static int field_f;
    static bd field_i;
    static p field_d;
    static int field_a;
    static kk field_l;
    static bd field_e;

    public static void a(int param0) {
        field_d = null;
        if (param0 == 32) {
          field_i = null;
          field_c = null;
          field_j = null;
          field_m = null;
          field_e = null;
          field_b = null;
          field_l = null;
          field_g = null;
          field_k = null;
          field_h = null;
          return;
        }
    }

    final static void a(int param0, int param1, p param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        int var4_int = 0;
        int var8 = 0;
        int var10 = 0;
        int var5 = 0;
        int var11 = 0;
        int var9 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        try {
          var6 = param3 << 2;
          var7 = param1 << 2;
          var12 = param2.field_c;
          var14 = 25.0;
          var16 = var12 * 3.141592653589793 / 128.0;
          var18 = Math.sin(var16) * -var14;
          var20 = Math.cos(var16) * -var14;
          var4_int = (int)(-var18 + (double)var6);
          var8 = 8;
          if (param0 != -17652) {
            field_i = (bd) null;
          }
          var10 = 1;
          var5 = (int)(-var20 + (double)var7);
          var11 = 1;
          var9 = 16;
          var22 = 200 * (-param2.field_e + 32) / 32;
          km.a((byte) var10, var7, var5, ni.field_c, var9, var6, (byte) var11, param0 + 17752, var4_int, var22, var8);
          var23 = (int)((double)var8 / 1.3);
          var24 = (int)((double)var9 / 1.3);
          bh.a((byte) var10, HostileSpawn.field_E, (byte) var11, var23, var4_int, var5, var7, var24, var22, var6, 9233);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "oa.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static jd a(int[] param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int param8) {
        jd var9 = null;
        RuntimeException var9_ref = null;
        jd stackIn_2_0 = null;
        jd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5) {
            stackIn_2_0 = (jd) null;
            return stackIn_2_0;
          }
          var9 = new jd(param2, param6, param4, param3, param7, param8, param0);
          ib.field_a.a(var9, 117);
          ea.a(var9, param1, 62);
          stackIn_4_0 = var9;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_7_0 = var9_ref;
          stackIn_7_1 = new StringBuilder().append("oa.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static vb a(byte param0, String param1) {
        String var2 = null;
        int var3 = 0;
        vb var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        vb stackIn_15_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (null == n.field_t) {
            return null;
          }
          var3 = -23 / ((34 - param0) / 41);
          var7 = (CharSequence) ((Object) param1);
          var2 = mf.a(false, var7);
          if (var2 == null) {
            var2 = param1;
          }
          var4 = (vb) (n.field_t.a((long)var2.hashCode(), -30828));
          while (var4 != null) {
            var8 = (CharSequence) ((Object) var4.field_Ib);
            var5 = mf.a(false, var8);
            if (var5 == null) {
              var5 = var4.field_Ib;
            }
            if (var5.equals(var2)) {
              stackIn_15_0 = var4;
              return stackIn_15_0;
            }
            var4 = (vb) (n.field_t.a(83));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_20_0 = var2_ref;
          stackIn_20_1 = new StringBuilder().append("oa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_j = "Total time: <col=ffffff>";
        field_c = new int[8192];
        field_h = "More suggestions";
        field_g = new nd(14, 0, 4, 1);
        field_k = new je();
        field_d = new p();
        field_a = 0;
    }
}

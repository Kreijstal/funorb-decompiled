/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa implements nl {
    private int field_m;
    static cj field_a;
    static boolean field_k;
    private fm field_h;
    private int field_e;
    private int field_l;
    static String field_j;
    private int field_f;
    private int field_c;
    private int field_i;
    static String field_d;
    static int field_g;
    static ja[] field_b;

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        int var10 = 0;
        cf stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        wm var12 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param4 instanceof wm) {
            stackIn_4_0 = (cf) (param4);
          } else {
            stackIn_4_0 = null;
          }
          var12 = (wm) (stackIn_4_0);
          oo.e(param4.field_y + param3, param4.field_i + param1, param4.field_n, param4.field_w, this.field_i);
          if (var12 != null) {
          }
          if (param2 != -15112) {
            return;
          }
          var7 = -(var12.field_M * 2) + param4.field_n;
          var8 = param4.field_y + param3 + var12.field_M;
          var9 = param1 + (param4.field_i + var12.field_N);
          oo.g(var8, var9, var8 + var7, var9, this.field_c);
          for (var10 = var12.a((byte) -72) - 1; 0 <= var10; var10--) {
            oo.d(var8 + var7 * var12.a(var10, false) / var12.g((byte) -106), var9, this.field_f, this.field_l);
          }
          if (null == this.field_h) {
            return;
          }
          this.field_h.b(var12.field_j, var8 + var7 / 2, var9 - (-this.field_h.field_w - var12.field_N), this.field_e, this.field_m);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("wa.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_j = null;
        field_a = null;
        if (param0 != 2) {
          wa.a((byte) -21);
          field_d = null;
          return;
        }
        field_d = null;
    }

    wa(fm param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_e = param1;
          this.field_i = param4;
          this.field_c = param3;
          this.field_m = param2;
          this.field_f = param5;
          this.field_l = param6;
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "wa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                mk.field_d = (int)(var3.longValue() / 1048576L) + 1;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
            if (param0 != 43) {
              field_g = 6;
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_k = false;
        field_d = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_j = "Screech";
        field_g = 0;
    }
}

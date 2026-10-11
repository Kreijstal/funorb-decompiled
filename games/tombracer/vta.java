/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vta extends vw {
    static float field_e;
    static String field_f;
    static int[] field_d;

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
          field_f = (String) null;
        }
    }

    vta(eo param0) {
        super(param0);
    }

    public static void d(int param0) {
        field_f = null;
        field_d = null;
        if (param0 != 36070) {
          field_d = (int[]) null;
        }
    }

    final void a(int param0, boolean param1) {
        this.field_c.a(true, (byte) 100);
        int var3 = 121 / ((param0 - 41) / 62);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != 55) {
          field_d = (int[]) null;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        boolean stackIn_6_0 = false;
        if (param2 != 2048) {
          vta.c((byte) -99);
        }
        stackIn_6_0 = ((param1 & 2048) != 0) && ((param0 & 55) != 0);
        return stackIn_6_0;
    }

    final static int a(CharSequence param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = param0.length();
          if (param1 != -12754) {
            vta.d(-51);
          }
          var3 = 0;
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = -var3 + ((var3 << 5) + io.a(-377, param0.charAt(var4)));
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("vta.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, iva param1, int param2) {
        try {
          this.field_c.a(true, param1);
          this.field_c.a((byte) -35, param0);
          if (param2 != 24595) {
            CharSequence var5 = (CharSequence) null;
            vta.a((CharSequence) null, -89);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vta.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        if (param0 >= -4) {
          field_e = -1.3910614252090454f;
        }
        this.field_c.a(false, (byte) 72);
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
          CharSequence var3 = (CharSequence) null;
          vta.a((CharSequence) null, -5);
          return true;
        }
        return true;
    }

    final static void c(byte param0) {
        fua.field_g = false;
        if (param0 < 52) {
          field_f = (String) null;
        }
        ok.field_s = vc.field_q.h(255) == 0 ? true : false;
    }

    static {
        field_f = "Remove <%0> from ignore list";
        field_d = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
    }
}

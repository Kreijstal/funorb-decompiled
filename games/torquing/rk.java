/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends bc {
    static String field_d;
    private String field_c;
    static String field_e;
    private String field_b;

    final void a(fj param0, byte param1) {
        try {
          param0.a(this.field_c, (byte) -72);
          if (param1 != -71) {
            int[] var4 = (int[]) null;
            rk.a((byte[]) null, (int[]) null, -81, (byte) 58, -51);
          }
          param0.a((byte) -107, this.field_b);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "rk.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte[] param0, int[] param1, int param2, byte param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Torquing.field_u;
        try {
          var5_int = -90 / ((-31 - param3) / 38);
          var6 = 0;
          while (true) {
            if (var6 >= u.field_v.length) {
              return;
            }
            param4 = u.field_v[var6];
            var7 = var6 << 4;
            while (true) {
              incrementValue$0 = param4;
              param4--;
              if (incrementValue$0 == 0) {
                var6++;
                break;
              }
              incrementValue$1 = var7;
              var7++;
              param2 = mn.field_bb[incrementValue$1];
              dupTemp$2 = param0[param2];
              dupTemp$3 = param1[dupTemp$2];
              param1[dupTemp$2] = dupTemp$3 + 1;
              mn.field_bb[dupTemp$3] = param2;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("rk.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_e = null;
        if (!param0) {
          field_d = (String) null;
        }
        field_d = null;
    }

    final gq a(boolean param0) {
        if (param0) {
          int[] var3 = (int[]) null;
          rk.a((byte[]) null, (int[]) null, -108, (byte) -100, 71);
        }
        return im.field_J;
    }

    rk(String param0, String param1) {
        try {
          this.field_c = param0;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "rk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Name is available";
        field_e = "Quit";
    }
}

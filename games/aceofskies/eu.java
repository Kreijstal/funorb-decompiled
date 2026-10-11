/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eu extends o {
    static String field_k;
    md field_i;
    int field_h;
    static int field_g;
    static String field_j;

    public eu() {
        super(new kc());
    }

    final void a(int param0, int param1, double param2, md param3) {
        try {
          this.field_i = param3;
          this.field_d.a(this.field_i.field_d, true);
          this.field_b = 20.0;
          this.field_h = 64;
          this.field_f = param1;
          this.field_e = this.field_i.field_e;
          this.a((byte) 111, (double)param0);
          this.a(param2, (byte) 25);
          this.b(24.0, 128);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "eu.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (param0 != 0) {
            field_g = -18;
          }
          if (null != vs.field_g) {
            try {
              vs.field_g.a(true, 0L);
              vs.field_g.a(24, nm.field_c.field_f, nm.field_c.field_g, -105);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
            }
          }
          nm.field_c.field_g = nm.field_c.field_g + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1, boolean param2) {
        int var3 = -50 % ((-21 - param0) / 51);
        ec.field_t = 0;
        ci.field_d = param1;
        if (!(ci.field_d < 0)) {
          aa.field_b[ci.field_d].a(param2, 1);
        }
    }

    public static void c(int param0) {
        if (param0 != 24) {
          eu.c(111);
          field_j = null;
          field_k = null;
          return;
        }
        field_j = null;
        field_k = null;
    }

    final static byte[] a(byte[] param0, int param1, byte param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        byte[] var6 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new byte[param1];
          var4 = var6;
          var5 = -115 / ((param2 + 94) / 32);
          au.a(param0, param3, var6, 0, param1);
          stackIn_1_0 = var6;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("eu.I(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          qm.a(ft.field_o, (byte) -31, op.field_a, param1, param0, os.field_w, 0);
          for (var2_int = 0; os.field_w > var2_int; var2_int++) {
            uf.field_d[param0 + var2_int] = var2_int;
          }
          qm.a(fj.field_d, (byte) -52, nh.field_a, false, param0 + param0, os.field_w + param0, param0);
          if (param0 >= os.field_w) {
            return;
          }
          os.field_w = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "eu.J(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_k = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_j = "Back";
    }
}

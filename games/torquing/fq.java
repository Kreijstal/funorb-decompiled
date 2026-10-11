/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends jh {
    static dg field_F;
    int field_D;
    static byte[][] field_G;
    static boolean field_E;

    fq(gm param0) {
        super(param0.field_w, param0.field_k, param0.field_p, param0.field_o, (el) null, (ca) null);
        try {
          param0.a((byte) -83, 0, 0, this.field_o, this.field_p);
          this.field_D = 256;
          this.field_C = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "fq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public fq() {
        super(0, 0, 0, 0, (el) null, (ca) null);
        this.field_D = 256;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        t var5 = null;
        if (0 != param0) {
          return;
        }
        if (this.field_C == null) {
          return;
        }
        if (this.field_D == 0) {
          return;
        }
        if (256 == this.field_D) {
          this.field_C.a(param0, (byte) -70, param2 + this.field_k, this.field_w + param3);
          return;
        }
        if (param1 <= -7) {
          var5 = new t(this.field_C.field_p, this.field_C.field_o);
          tm.a((byte) 34, var5);
          this.field_C.a(param0, (byte) -61, 0, 0);
          r.a(122);
          var5.e(param3 + this.field_w, this.field_k + param2, this.field_D);
          return;
        }
    }

    public static void g(byte param0) {
        field_G = (byte[][]) null;
        if (param0 > -64) {
          return;
        }
        field_F = null;
    }

    final static void a(boolean param0, int param1, gg param2, int param3) {
        try {
          if (param0) {
            field_F = (dg) null;
          }
          tb.field_l.a(param2, param1, on.field_c * param3 / 160);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "fq.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static sm[] a(la param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        sm[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!nd.a(param3, param0, -1, param2)) {
            return null;
          }
          if (param1 != -25960) {
            fq.g((byte) -70);
          }
          stackIn_6_0 = rf.a((byte) 66);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("fq.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          try {
            if (!vh.field_i.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = param1;
            while (true) {
              if (param0.length() <= var3) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                return true;
              }
              if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var2_ref2;
          stackIn_21_1 = new StringBuilder().append("fq.J(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_E = false;
    }
}

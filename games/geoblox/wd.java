/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static dm field_b;
    static int field_d;
    static int field_a;
    static tf field_e;
    private rc field_g;
    static String field_f;
    private rc field_c;

    final rc a(int param0) {
        int var3 = -123 % ((param0 - 21) / 32);
        rc var2 = this.field_c;
        if (this.field_g != var2) {
            this.field_c = var2.field_k;
            return var2;
        }
        this.field_c = null;
        return null;
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != -10943) {
            field_f = (String) null;
            field_f = null;
            field_e = null;
            return;
        }
        field_f = null;
        field_e = null;
    }

    final void a(rc param0, boolean param1) {
        if ((param0.field_l != null)) {
            param0.a((byte) 45);
        }
        param0.field_k = this.field_g.field_k;
        param0.field_l = this.field_g;
        if (param1) {
            return;
        }
        try {
            param0.field_l.field_k = param0;
            param0.field_k.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wd.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void c(int param0) {
        kb.b(-120);
        if (param0 != 480) {
            field_d = -37;
        }
    }

    final rc a(boolean param0) {
        rc var2 = this.field_g.field_k;
        if (!param0) {
            wd.a((byte) -92);
            if (this.field_g != var2) {
                var2.a((byte) 65);
                return var2;
            }
            return null;
        }
        if (this.field_g != var2) {
            var2.a((byte) 65);
            return var2;
        }
        return null;
    }

    final int b(byte param0) {
        rc var3 = null;
        int var4 = Geoblox.field_C;
        int var2 = 0;
        if (param0 == 67) {
            var3 = this.field_g.field_k;
            while (this.field_g != var3) {
                var3 = var3.field_k;
                var2++;
            }
            return var2;
        }
        field_b = (dm) null;
        var3 = this.field_g.field_k;
        while (this.field_g != var3) {
            var3 = var3.field_k;
            var2++;
        }
        return var2;
    }

    final void a(int param0, rc param1) {
        try {
            if ((param1.field_l != null)) {
                param1.a((byte) 62);
            }
            int var3_int = -75 % ((param0 - 62) / 46);
            param1.field_l = this.field_g.field_l;
            param1.field_k = this.field_g;
            param1.field_l.field_k = param1;
            param1.field_k.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wd.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        jk.field_d = 2;
        if (param0 < 45) {
            wd.a(true, -75);
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        re var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          var4 = (re) ((Object) nj.field_f.g(0));
          while (var4 != null) {
            ik.a(var4, param1, (byte) 107);
            var4 = (re) ((Object) nj.field_f.d(1));
          }
          if (param0) {
            return;
          }
          field_a = -80;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "wd.K(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        try {
            if (param0 != 69) {
                field_a = 99;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wd.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public wd() {
        this.field_g = new rc();
        this.field_g.field_k = this.field_g;
        this.field_g.field_l = this.field_g;
    }

    final static df a(boolean param0, long param1, String param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        th stackIn_7_0 = null;
        nk stackIn_9_0 = null;
        lf stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            field_f = (String) null;
          }
          if ((param1 == 0L) &&
              (param2 != null)) {
            stackIn_9_0 = new nk(param2, param3);
            return (df) ((Object) stackIn_9_0);
          }
          if (!param4) {
            stackIn_11_0 = new lf(param1, param3);
            return (df) ((Object) stackIn_11_0);
          }
          stackIn_7_0 = new th(param1, param3);
          return (df) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("wd.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final rc c(byte param0) {
        rc var2 = this.field_g.field_k;
        if (var2 == this.field_g) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_k;
        if (param0 == 121) {
            return var2;
        }
        wd.b(67);
        return var2;
    }

    static {
        field_b = new dm(460, 460);
        field_d = (-field_b.field_o + 480) / 2;
        field_a = (640 - field_b.field_s) / 2;
        field_e = new tf();
    }
}

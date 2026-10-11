/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    private cr field_b;
    private pv field_d;
    static uw field_a;
    private pv field_c;

    public static void c(int param0) {
        if (param0 != 786336) {
          field_a = (uw) null;
        }
        field_a = null;
    }

    final static boolean a(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 >= -19) {
          jl.a(0, false);
        }
        stackIn_7_0 = (25 > oh.field_e) && (aa.field_a[0] != null) && (aa.field_a[0].a((byte) 115));
        return stackIn_7_0;
    }

    final static void a(int param0, int param1) {
        try {
          try {
            tw.a(-126, ra.c(param0 - 23), "resizing", new Object[]{new Integer(param1)});
          } catch (Throwable throwable) {
          }
          if (param0 != 25) {
            field_a = (uw) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (qw.a(57, param1)) {
          return true;
        }
        if (param1 != 45 &&
          160 != param1 &&
          param1 != 32) {
          if (param1 == 95) {
            return true;
          }
          if (param0 != 110) {
            field_a = (uw) null;
          }
          return false;
        }
        return true;
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        km var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4 = (km) (dk.field_a.b(111));
          if (!param1) {
            field_a = (uw) null;
          }
          while (var4 != null) {
            iu.a(-1, var4, param0);
            var4 = (km) (dk.field_a.d((byte) 18));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "jl.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
              if (param1) {
                return;
              }
              param0.getAppletContext().showDocument(td.a((byte) 125, param0, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("jl.A(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, int param1, boolean param2, byte param3) {
        int var4;
        int var5;
        if (!param2) {
          if (uc.field_c[param0] > uc.field_c[param1]) {
            return true;
          }
          if (uc.field_c[param0] < uc.field_c[param1]) {
            return false;
          }
          if (lj.field_a[param1] < lj.field_a[param0]) {
            return true;
          }
          if (lj.field_a[param1] > lj.field_a[param0]) {
            return false;
          }
        } else {
          if (lj.field_a[param0] > lj.field_a[param1]) {
            return true;
          }
          if (lj.field_a[param1] > lj.field_a[param0]) {
            return false;
          }
          if (uc.field_c[param1] < uc.field_c[param0]) {
            return true;
          }
          if (uc.field_c[param0] < uc.field_c[param1]) {
            return false;
          }
        }
        var4 = vi.field_z[param1] + ic.field_c[param1] + jf.field_f[param1];
        if (param3 != 98) {
          return true;
        }
        var5 = vi.field_z[param0] + jf.field_f[param0] + ic.field_c[param0];
        if (var4 < var5) {
          return true;
        }
        if (var5 < var4) {
          return false;
        }
        return !(param0 <= param1);
    }

    final void b(int param0) {
        this.field_c.b(12001);
        if (param0 != -19073) {
          jl.a(121, -85, true, (byte) 9);
        }
    }

    jl(aw param0) {
        int var4_int = 0;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        jaclib.memory.Stream var4 = null;
        jaclib.memory.Buffer var9 = null;
        int var5Lifetime1;
        try {
          param0.a(new hu[]{new hu(new ls[]{ls.field_b, ls.field_g, ls.field_e}), new hu(ls.field_c)}, (byte) 53);
          this.field_c = param0.a((byte) 51, true);
          this.field_d = param0.a((byte) 51, false);
          this.field_d.a(12, (byte) -35, 393168);
          this.field_b = param0.e(3, false);
          this.field_b.a((byte) -116, 49146);
          var7 = this.field_b.a(true, 10081);
          if (var7 != null) {
            var8 = param0.a(true, var7);
            if (!jaclib.memory.Stream.b()) {
              for (var4_int = 0; var4_int < 8191; var4_int++) {
                var5 = 4 * var4_int;
                var8.a(var5);
                var8.a(var5 + 1);
                var8.a(2 + var5);
                var8.a(var5 + 2);
                var8.a(var5 + 3);
                var8.a(var5);
              }
            } else {
              for (var4_int = 0; var4_int < 8191; var4_int++) {
                var5 = 4 * var4_int;
                var8.b(var5);
                var8.b(1 + var5);
                var8.b(var5 + 2);
                var8.b(2 + var5);
                var8.b(var5 + 3);
                var8.b(var5);
              }
            }
            var8.a();
            this.field_b.a(-28833);
          }
          var9 = this.field_d.a(7454, true);
          if (var9 != null) {
            var4 = param0.a(true, var9);
            if (!jaclib.memory.Stream.b()) {
              for (var5Lifetime1 = 0; 8191 > var5Lifetime1; var5Lifetime1++) {
                var4.b(0.0f);
                var4.b(-1.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(-1.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(-1.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(-1.0f);
                var4.b(0.0f);
              }
            } else {
              for (var5Lifetime1 = 0; 8191 > var5Lifetime1; var5Lifetime1++) {
                var4.a(0.0f);
                var4.a(-1.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(-1.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(-1.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(-1.0f);
                var4.a(0.0f);
              }
            }
            var4.a();
            this.field_d.a(22957);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("jl.<init>(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void a(int param0, aw param1) {
        try {
          int var3_int = -4 % ((param0 - 65) / 32);
          this.field_c.a(24, (byte) -35, 786336);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "jl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}

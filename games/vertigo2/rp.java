/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp implements ef {
    private er[] field_h;
    private fc field_g;
    static ve field_f;
    static String field_b;
    static int field_a;
    static String[] field_e;
    static lg field_c;
    static String field_d;

    public final boolean c(int param0, int param1) {
        if (param0 != 1) {
          String var4 = (String) null;
          rp.a((java.applet.Applet) null, -50, (String) null);
          return false;
        }
        return false;
    }

    public final int a(int param0, int param1) {
        if (param1 != 65535) {
          return 3;
        }
        return 16711680;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            sm.field_Ib = param2;
            try {
              if (param1 != -2112) {
                return;
              }
              var3 = param0.getParameter("cookieprefix");
              var4 = param0.getParameter("cookiehost");
              var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
              if (param2.length() == 0) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              je.a(param0, "document.cookie=\"" + var5 + "\"", (byte) 124);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            op.a(0, param0);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref2;
            stackIn_13_1 = new StringBuilder().append("rp.F(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final int[] a(float param0, int param1, int param2) {
        if (param2 != 233) {
          rp.a(1);
          return this.field_h[param1].field_F;
        }
        return this.field_h[param1].field_F;
    }

    public final boolean d(int param0, int param1) {
        if (param0 > -114) {
          field_a = -11;
          return true;
        }
        return true;
    }

    rp(boolean param0, er[] param1) {
        int[] var5 = null;
        ef var4 = null;
        try {
          var5 = new int[6];
          int[] var3 = var5;
          this.field_h = dk.a(var5, true, param1);
          var4 = oo.field_o;
          oo.a((ef) (this));
          this.field_g = (fc) (th.a(param0, var5, -27911));
          oo.a(var4);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "rp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        ef var6 = null;
        Throwable var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3_int = param0[0];
          var4 = param0[1];
          param0[0] = 0;
          if (param1 != 28580) {
            this.field_g = (fc) null;
          }
          param0[1] = 0;
          var5 = param0[2];
          param0[2] = 0;
          var6 = oo.field_o;
          oo.a((ef) (this));
          try {
            this.field_g.a(param0, mb.field_w);
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var7 = decompiledCaughtException;
            oo.a(var6);
            param0[0] = var3_int;
            param0[1] = var4;
            param0[2] = var5;
            throw rp.<RuntimeException>$cfr$sneakyThrow(var7);
          }
          oo.a(var6);
          param0[0] = var3_int;
          param0[1] = var4;
          param0[2] = var5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rp.H(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        if (param0 < -77) {
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        }
        String var2 = (String) null;
        rp.a((java.applet.Applet) null, -108, (String) null);
        field_c = null;
        field_d = null;
        field_f = null;
    }

    public final int b(int param0, int param1) {
        if (param0 != 212) {
          rp.a(92);
          return 0;
        }
        return 0;
    }

    static {
        field_f = new ve(14, 0, 4, 1);
        field_d = "Blue won!";
        field_b = "<%0> is not a member, and cannot play with the current options.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}

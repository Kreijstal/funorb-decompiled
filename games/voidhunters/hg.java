/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg implements ntb {
    static aib field_b;
    int field_d;
    static int[] field_a;
    static int field_c;

    final static void a(int param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param1.getCodeBase();
              if (param0 > -4) {
                field_a = (int[]) null;
              }
              var3 = ne.a(var4, (byte) -107, param1).getFile();
              ia.a(new Object[]{"home", var3 + "home.ws"}, param1, "updatelinks", (byte) -71);
              ia.a(new Object[]{"gamelist", var3 + "togamelist.ws"}, param1, "updatelinks", (byte) 97);
              ia.a(new Object[]{"serverlist", var3 + "toserverlist.ws"}, param1, "updatelinks", (byte) 121);
              ia.a(new Object[]{"options", var3 + "options.ws"}, param1, "updatelinks", (byte) 67);
              ia.a(new Object[]{"terms", var3 + "terms.ws"}, param1, "updatelinks", (byte) -69);
              ia.a(new Object[]{"privacy", var3 + "privacy.ws"}, param1, "updatelinks", (byte) 70);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("hg.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (param0) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          hg.a(-91, (java.applet.Applet) null);
        }
    }

    public final void b(byte param0, tv param1) {
        hg var5 = null;
        hg var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var5 = (hg) (param1);
          var6 = var5;
          var6.field_d = this.field_d;
          if (param0 <= 54) {
            hg.a((byte) 23, 42L);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("hg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(byte param0, pgb param1) {
        int var2_int = 0;
        pgb var3 = null;
        int var4 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = VoidHunters.field_G;
        try {
          if (param1.field_d == null) {
            return;
          }
          if (param1.field_f != 0 ||
            param1.field_h != 0) {
            for (var2_int = 0; var2_int < ou.field_q; var2_int++) {
              var3 = nrb.field_b[var2_int];
              if (var3.field_a == 2 &&
                param1.field_f == var3.field_f &&
                param1.field_h == var3.field_h) {
                return;
              }
            }
          }
          if (param1.field_m != null) {
            itb.field_p = param1.field_i;
            rea.field_d = param1.field_n;
            abb.field_a = param1.field_a;
            wrb.field_p = param1.field_m;
          }
          fpb.a(param1, 0);
          if (param0 <= 105) {
            hg.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("hg.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        try {
          if (param1 > -109) {
            this.field_d = 42;
          }
          param0.a(-632, this.field_d, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "hg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        hg var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (hg) (param1);
          var4 = -84 % ((22 - param0) / 59);
          stackIn_3_0 = (this.field_d != var3.field_d);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("hg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          this.field_d = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "hg.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        hg var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (hg) (param0);
          if (param1 > -19) {
            return;
          }
          var4 = 0;
          if (this.field_d != var3.field_d) {
            var4 = 1;
            iva.a(-6940, "int playerid has changed. before=" + var3.field_d + ", now=" + this.field_d);
          }
          if (var4 != 0) {
            tfb.a((byte) -123, "This instance of PlayerLeave has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("hg.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, long param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            if (param0 != 90) {
              return;
            }
            Thread.sleep(param1);
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new int[2];
    }
}

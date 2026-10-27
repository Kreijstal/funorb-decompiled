/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends jl {
    static String field_r;
    private int field_v;
    static String field_s;
    private String[] field_u;
    private int field_q;
    private String[] field_t;

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              java.net.URL var4 = param1.getCodeBase();
              String var3 = sh.a((byte) 104, param1, var4).getFile();
              sd.a((byte) 119, param1, new Object[]{"home", var3 + "home.ws"}, "updatelinks");
              sd.a((byte) 107, param1, new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks");
              if (param0 != 15) {
                gl.b(true);
              }
              sd.a((byte) 112, param1, new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks");
              sd.a((byte) 110, param1, new Object[]{"options", var3 + "options.ws"}, "updatelinks");
              sd.a((byte) 104, param1, new Object[]{"terms", var3 + "terms.ws"}, "updatelinks");
              sd.a((byte) 123, param1, new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var2_ref;
            StringBuilder stackIn_8_1 = new StringBuilder().append("gl.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(boolean param0) {
        field_s = null;
        if (param0) {
          return;
        }
        field_r = null;
    }

    gl(String param0, String[] param1, String[] param2) {
        super(param0, param1);
        try {
          this.field_u = param1;
          this.field_t = param2;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(byte param0) {
        int var2 = 15 % ((param0 + 92) / 33);
        int var3 = 640;
        int var4 = this.a(this.field_u, 0);
        int var5 = this.a(this.field_t, 0);
        this.field_o = var4 + var5;
        this.field_d = (-this.field_o + var3) / 2 + var4;
    }

    final static k c(boolean param0) {
        if (!param0) {
          return (k) null;
        }
        if (null == vg.field_U) {
          vg.field_U = new k(ke.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, ke.field_c.field_r, -1, 2147483647, true);
        }
        return vg.field_U;
    }

    final void a(int param0, int param1, int param2, byte param3, ih param4) {
        super.a(0, param4, param2, -101);
        if (param3 != -92) {
          return;
        }
        try {
          this.field_v = param0;
          this.field_q = param1;
          this.d((byte) 38);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "gl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, String[] param3, int param4) {
        String stackIn_22_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (this.field_h == null) {
            return;
          }
          if (param3 == null) {
            return;
          }
          if (0 == param3.length) {
            return;
          }
          if (param0 != -1) {
            gl.b(true);
          }
          String[] var10 = param3;
          String[] var6 = var10;
          for (int var7 = 0; var7 < var10.length; var7++) {
            String var8 = var10[var7];
            if (var8 != null &&
              var8.length() > 0) {
              if (0 > param2) {
                this.field_h.a(var8, this.field_d, param1, param4, -1);
              }
              if (0 < param2) {
                this.field_h.b(var8, this.field_d, param1, param4, -1);
              }
            }
            param1 = param1 + this.field_f;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var6_ref;
          StringBuilder stackIn_21_1 = new StringBuilder().append("gl.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        if (null == this.field_h) {
          return;
        }
        if (param1 != 3) {
          gl.b(false);
        }
        int var3 = this.field_h.field_r;
        param0 = param0 + var3;
        param0 = param0 + this.b(param0, param1 + 13944);
        this.a(-1, param0, 1, this.field_u, this.field_q);
        this.a(-1, param0, -1, this.field_t, this.field_v);
    }

    static {
        field_r = "Destroy all the alien infrastructure";
        field_s = "Retribution objectives";
    }
}

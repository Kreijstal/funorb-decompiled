/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ab extends og {
    private int field_B;
    static ko field_z;
    static te field_D;
    private ol field_E;
    boolean field_C;
    static bf field_A;

    final qm b(boolean param0) {
        qm var2 = super.b(param0);
        if (var2 != null) {
          return var2;
        }
        return (qm) (this);
    }

    final static void a(java.applet.Applet param0, long param1, String param2, int param3, String param4) {
        try {
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          String var8Lifetime1;
          String var8Lifetime2;
          String var8Lifetime3;
          String var8Lifetime4;
          try {
            try {
              var7 = -75 / ((param3 - 32) / 56);
              var9 = param0.getParameter("cookiehost");
              var8 = var9;
              var8Lifetime1 = var9;
              var10 = param2 + "=" + param4 + "; version=1; path=/; domain=" + var9;
              var8Lifetime2 = var10;
              var8Lifetime3 = var10;
              if (0L > param1) {
                var8Lifetime4 = var10 + "; Discard;";
              } else {
                var8Lifetime4 = var10 + "; Expires=" + sm.a(lo.a((byte) -25) + param1 * 1000L, (byte) 121) + "; Max-Age=" + param1;
              }
              hi.a("document.cookie=\"" + var8Lifetime4 + "\"", param0, (byte) -79);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var6_ref;
            stackIn_9_1 = new StringBuilder().append("ab.B(");
            if (param0 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(boolean param0) {
        field_D = null;
        if (!param0) {
          field_z = null;
          field_A = null;
          return;
        }
        String var2 = (String) null;
        ab.a((java.applet.Applet) null, 11L, (String) null, 125, (String) null);
        field_z = null;
        field_A = null;
    }

    final static jp a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        jp var5 = null;
        String var6 = null;
        jp stackIn_4_0 = null;
        jp stackIn_8_0 = null;
        jp stackIn_13_0 = null;
        jp stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            0 != param0.length()) {
            var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              stackIn_8_0 = ma.field_m;
              return stackIn_8_0;
            }
            var3 = param0.substring(0, var2_int);
            if (param1 > -67) {
              var6 = (String) null;
              ab.a((java.applet.Applet) null, -12L, (String) null, -98, (String) null);
            }
            var4 = param0.substring(var2_int + 1);
            var5 = jm.a(var3, true);
            if (var5 == null) {
              stackIn_15_0 = rd.a(true, var4);
              return stackIn_15_0;
            }
            stackIn_13_0 = var5;
            return stackIn_13_0;
          }
          stackIn_4_0 = f.field_d;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("ab.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        this.a(param0, oj.field_y - param2 >> 1, -param0 + pk.field_c >> 1, param2, (byte) -52);
        int var4 = -89 % ((76 - param1) / 37);
    }

    abstract void b(int param0, int param1, int param2);

    ab(ol param0, int param1, int param2) {
        super(-param1 + oj.field_y >> 1, pk.field_c - param2 >> 1, param1, param2, (wo) null);
        try {
          this.field_C = false;
          this.field_E = param0;
          this.field_B = 0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ab.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean g(byte param0) {
        if (param0 != 8) {
          this.b(39, -23, 119);
        }
        int var2 = this.a(-124);
        int var3 = var2 - this.field_B;
        if (var3 > 0) {
          this.field_B = this.field_B + (var3 + 7) / 8;
        }
        if (var3 >= 0) {
          if (this.field_B != 0) {
            return false;
          }
          if (var2 == 0) {
            return !this.field_C ? true : false;
          }
          return false;
        }
        this.field_B = this.field_B + (1 + (var3 - 16)) / 16;
        if (this.field_B != 0) {
          return false;
        }
        if (var2 == 0) {
          return !this.field_C ? true : false;
        }
        return false;
    }

    boolean e(byte param0) {
        this.field_B = this.a(-109);
        if (param0 != 79) {
          this.g((byte) 76);
          if (this.field_B != 0) {
            return false;
          }
          if (!this.field_C) {
            return true;
          }
          return false;
        }
        if (this.field_B != 0) {
          return false;
        }
        if (!this.field_C) {
          return true;
        }
        return false;
    }

    private final int a(int param0) {
        if (param0 < -100) {
          return this.field_C ? this.field_E.j(0) != this ? 0 : 256 : 0;
        }
        ab.c(false);
        return this.field_C ? this.field_E.j(0) != this ? 0 : 256 : 0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (this.field_B == 0) {
          return;
        }
        if (this.field_B >= 256) {
          if (param3 != 0) {
            return;
          }
          this.b(30, this.field_r + param2, this.field_j + param0);
          super.a(param0, (byte) -87, param2, param3);
          return;
        }
        if (hp.field_g == null) {
          hp.field_g = new dl(this.field_g, this.field_f);
          em.a((byte) 38, hp.field_g);
          kh.a();
          this.b(30, 0, 0);
          super.a(-this.field_j - param0, (byte) -89, -this.field_r - param2, param3);
          lg.a(1);
          if (param1 < -12) {
            hp.field_g.f(this.field_r + param2, param0 + this.field_j, this.field_B);
            return;
          }
          return;
        }
        if (this.field_g > hp.field_g.field_l) {
          hp.field_g = new dl(this.field_g, this.field_f);
          em.a((byte) 38, hp.field_g);
          kh.a();
          this.b(30, 0, 0);
          super.a(-this.field_j - param0, (byte) -89, -this.field_r - param2, param3);
          lg.a(1);
          if (param1 < -12) {
            hp.field_g.f(this.field_r + param2, param0 + this.field_j, this.field_B);
            return;
          }
          return;
        }
        if (hp.field_g.field_u < this.field_f) {
          hp.field_g = new dl(this.field_g, this.field_f);
          em.a((byte) 38, hp.field_g);
          kh.a();
          this.b(30, 0, 0);
          super.a(-this.field_j - param0, (byte) -89, -this.field_r - param2, param3);
          lg.a(1);
          if (param1 < -12) {
            hp.field_g.f(this.field_r + param2, param0 + this.field_j, this.field_B);
            return;
          }
          return;
        }
        em.a((byte) 38, hp.field_g);
        kh.a();
        this.b(30, 0, 0);
        super.a(-this.field_j - param0, (byte) -89, -this.field_r - param2, param3);
        lg.a(1);
        if (param1 < -12) {
          hp.field_g.f(this.field_r + param2, param0 + this.field_j, this.field_B);
          return;
        }
    }

    final static void f(byte param0) {
        if (param0 != -49) {
          field_D = (te) null;
          if (null == qe.field_g) {
            if (td.field_b == null) {
              ck.m(0);
              return;
            }
            td.field_b.i((byte) 32);
            ck.m(0);
            return;
          }
          qe.field_g.h(0);
          if (td.field_b != null) {
            td.field_b.i((byte) 32);
            ck.m(0);
            return;
          }
          ck.m(0);
          return;
        }
        if (null != qe.field_g) {
          qe.field_g.h(0);
          if (td.field_b == null) {
            ck.m(0);
            return;
          }
          td.field_b.i((byte) 32);
          ck.m(0);
          return;
        }
        if (td.field_b == null) {
          ck.m(0);
          return;
        }
        td.field_b.i((byte) 32);
        ck.m(0);
    }

    static {
        field_D = null;
        field_A = new bf();
    }
}

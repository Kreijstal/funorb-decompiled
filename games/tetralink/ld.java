/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ld extends gn {
    private int field_N;
    private pk field_L;
    static String field_M;
    boolean field_K;

    final na d(byte param0) {
        na var2 = super.d(param0);
        if (var2 != null) {
          return var2;
        }
        return (na) (this);
    }

    private final int a(int param0) {
        if (param0 == 0) {
          return this.field_K ? this.field_L.a(false) != this ? 0 : 256 : 0;
        }
        return 81;
    }

    public static void k(int param0) {
        if (param0 > -121) {
          return;
        }
        field_M = null;
    }

    boolean l(int param0) {
        boolean stackIn_10_0 = false;
        boolean stackIn_22_0 = false;
        int var2;
        int var3;
        var2 = this.a(0);
        var3 = var2 - this.field_N;
        if (0 >= var3) {
          if (~var3 > param0) {
            this.field_N = this.field_N + (-16 + var3 + 1) / 16;
          }
          if (0 != this.field_N) {
            return false;
          }
          if (var2 != 0) {
            return false;
          }
          stackIn_22_0 = !(this.field_K);
          return stackIn_22_0;
        }
        this.field_N = this.field_N + (var3 + 8 - 1) / 8;
        if (~var3 > param0) {
          this.field_N = this.field_N + (-16 + var3 + 1) / 16;
        }
        if (0 != this.field_N) {
          return false;
        }
        if (var2 != 0) {
          return false;
        }
        stackIn_10_0 = !(this.field_K);
        return stackIn_10_0;
    }

    final static boolean b(int param0, int param1, int param2, int param3) {
        if (cd.field_a) {
          return bk.field_e.a(dg.field_e, tb.field_m, -81);
        }
        if (param1 != -1885069823) {
          return true;
        }
        if (hi.field_a) {
          return bg.a(param2, param0, -9614);
        }
        if (l.a(param0, param2, param1 ^ 1885069744)) {
          return true;
        }
        if (!fn.field_K) {
          return ug.c(32, param3, param2);
        }
        return false;
    }

    final void a(int param0, byte param1, int param2) {
        this.a(param2, -param2 + bi.field_a >> 1, -118, -param0 + i.field_e >> 1, param0);
        if (param1 <= 17) {
          this.field_L = (pk) null;
        }
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            ke.field_g = param0;
            if (param2 != -1) {
              return;
            }
            try {
              var3 = param1.getParameter("cookieprefix");
              var4 = param1.getParameter("cookiehost");
              var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
              if (param0.length() == 0) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              ii.a(-19149, "document.cookie=\"" + var5 + "\"", param1);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            q.a(param1, 118);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var3_ref2;
            stackIn_12_1 = new StringBuilder().append("ld.J(");
            if (param0 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_N == 0) {
          return;
        }
        if (this.field_N >= 256) {
          if (0 != param3) {
            return;
          }
          this.b(this.field_w + param2, 117, this.field_t + param1);
          super.a(0, param1, param2, param3);
          return;
        }
        if (null == ej.field_v) {
          ej.field_v = new oh(this.field_F, this.field_u);
          sk.a((byte) 126, ej.field_v);
          ra.a();
          this.b(param0, 120, 0);
          super.a(0, -param1 - this.field_t, -this.field_w - param2, param3);
          dh.a(param0 ^ -581);
          ej.field_v.a(this.field_t + param1, this.field_w + param2, this.field_N);
          return;
        }
        if (this.field_F > ej.field_v.field_u) {
          ej.field_v = new oh(this.field_F, this.field_u);
          sk.a((byte) 126, ej.field_v);
          ra.a();
          this.b(param0, 120, 0);
          super.a(0, -param1 - this.field_t, -this.field_w - param2, param3);
          dh.a(param0 ^ -581);
          ej.field_v.a(this.field_t + param1, this.field_w + param2, this.field_N);
          return;
        }
        if (this.field_u <= ej.field_v.field_E) {
          sk.a((byte) 126, ej.field_v);
          ra.a();
          this.b(param0, 120, 0);
          super.a(0, -param1 - this.field_t, -this.field_w - param2, param3);
          dh.a(param0 ^ -581);
          ej.field_v.a(this.field_t + param1, this.field_w + param2, this.field_N);
          return;
        }
        ej.field_v = new oh(this.field_F, this.field_u);
        sk.a((byte) 126, ej.field_v);
        ra.a();
        this.b(param0, 120, 0);
        super.a(0, -param1 - this.field_t, -this.field_w - param2, param3);
        dh.a(param0 ^ -581);
        ej.field_v.a(this.field_t + param1, this.field_w + param2, this.field_N);
    }

    final static void i(int param0) {
        if (param0 != -21719) {
          field_M = (String) null;
          ma.field_g = false;
          return;
        }
        ma.field_g = false;
    }

    ld(pk param0, int param1, int param2) {
        super(i.field_e - param1 >> 1, bi.field_a - param2 >> 1, param1, param2, (kg) null);
        try {
          this.field_K = false;
          this.field_N = 0;
          this.field_L = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ld.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean j(int param0) {
        if (param0 > -82) {
          return true;
        }
        return !oa.field_y.c(false) ? true : false;
    }

    boolean h(int param0) {
        if (param0 != 652390224) {
          field_M = (String) null;
          this.field_N = this.a(0);
          if (this.field_N != 0) {
            return false;
          }
          if (!this.field_K) {
            return true;
          }
          return false;
        }
        this.field_N = this.a(0);
        if (this.field_N != 0) {
          return false;
        }
        if (!this.field_K) {
          return true;
        }
        return false;
    }

    abstract void b(int param0, int param1, int param2);

    static {
        field_M = "<%2>'s turn - playing <%0> (<%1>)";
    }
}

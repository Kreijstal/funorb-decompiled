/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nm extends cj {
    boolean field_I;
    private sd field_H;
    static int field_E;
    static boolean field_J;
    private int field_G;
    static int field_F;

    final static void k(int param0) {
        if (null != ri.field_r) {
          ri.field_r.d();
          if (null != mh.field_d) {
            mh.field_d.d();
          }
          if (param0 != 8) {
            nm.b(false, 116);
            return;
          }
          return;
        }
        if (null != mh.field_d) {
          mh.field_d.d();
        }
        if (param0 == 8) {
          return;
        }
        nm.b(false, 116);
    }

    abstract void a(byte param0, int param1, int param2);

    final void a(boolean param0, int param1, int param2, int param3) {
        if (this.field_G == 0) {
          return;
        }
        if (this.field_G >= 256) {
          if (param1 != 0) {
            return;
          }
          this.a((byte) -128, this.field_o + param2, this.field_t + param3);
          super.a(param0, param1, param2, param3);
          return;
        }
        if (se.field_C == null) {
          se.field_C = new er(this.field_n, this.field_s);
          lq.a(se.field_C, (byte) -94);
          bi.c();
          this.a((byte) -128, 0, 0);
          super.a(param0, param1, -this.field_o - param2, -this.field_t - param3);
          ln.d(-28558);
          se.field_C.c(this.field_o + param2, this.field_t + param3, this.field_G);
          return;
        }
        if (this.field_n > se.field_C.field_y) {
          se.field_C = new er(this.field_n, this.field_s);
          lq.a(se.field_C, (byte) -94);
          bi.c();
          this.a((byte) -128, 0, 0);
          super.a(param0, param1, -this.field_o - param2, -this.field_t - param3);
          ln.d(-28558);
          se.field_C.c(this.field_o + param2, this.field_t + param3, this.field_G);
          return;
        }
        if (this.field_s > se.field_C.field_t) {
          se.field_C = new er(this.field_n, this.field_s);
          lq.a(se.field_C, (byte) -94);
          bi.c();
          this.a((byte) -128, 0, 0);
          super.a(param0, param1, -this.field_o - param2, -this.field_t - param3);
          ln.d(-28558);
          se.field_C.c(this.field_o + param2, this.field_t + param3, this.field_G);
          return;
        }
        lq.a(se.field_C, (byte) -94);
        bi.c();
        this.a((byte) -128, 0, 0);
        super.a(param0, param1, -this.field_o - param2, -this.field_t - param3);
        ln.d(-28558);
        se.field_C.c(this.field_o + param2, this.field_t + param3, this.field_G);
    }

    private final int i(int param0) {
        if (param0 < -117) {
          return this.field_I ? this != this.field_H.k(0) ? 0 : 256 : 0;
        }
        this.field_I = false;
        return this.field_I ? this != this.field_H.k(0) ? 0 : 256 : 0;
    }

    final static void b(boolean param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          if (param0) {
            nm.k(-53);
          }
          try {
            je.a((byte) 49, "resizing", ob.e((byte) 71), new Object[]{new Integer(param1)});
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    boolean j(int param0) {
        boolean stackIn_13_0 = false;
        boolean stackIn_25_0 = false;
        int var2;
        int var3;
        var2 = this.i(-125);
        var3 = -this.field_G + var2;
        if (var3 > 0) {
          this.field_G = this.field_G + (8 + (var3 - 1)) / 8;
        }
        if (param0 == 17) {
          if (var3 < 0) {
            this.field_G = this.field_G + (-16 + var3 + 1) / 16;
          }
          if (this.field_G != 0) {
            return false;
          }
          if (0 != var2) {
            return false;
          }
          stackIn_25_0 = !(this.field_I);
          return stackIn_25_0;
        }
        this.a((byte) 65, 57, 65);
        if (var3 < 0) {
          this.field_G = this.field_G + (-16 + var3 + 1) / 16;
        }
        if (this.field_G != 0) {
          return false;
        }
        if (0 != var2) {
          return false;
        }
        stackIn_13_0 = !(this.field_I);
        return stackIn_13_0;
    }

    boolean a(int param0) {
        if (param0 != -1) {
          return false;
        }
        this.field_G = this.i(-126);
        if (this.field_G != 0) {
          return false;
        }
        if (!this.field_I) {
          return true;
        }
        return false;
    }

    final void b(int param0, int param1, int param2) {
        if (param0 == -1535749535) {
          this.a(false, gi.field_m - param1 >> 1, im.field_h - param2 >> 1, param2, param1);
          return;
        }
        nm.k(-40);
        this.a(false, gi.field_m - param1 >> 1, im.field_h - param2 >> 1, param2, param1);
    }

    nm(sd param0, int param1, int param2) {
        super(-param1 + gi.field_m >> 1, -param2 + im.field_h >> 1, param1, param2, (ur) null);
        try {
          this.field_I = false;
          this.field_H = param0;
          this.field_G = 0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final iq b(boolean param0) {
        iq var2 = super.b(param0);
        if (var2 != null) {
          return var2;
        }
        return (iq) (this);
    }

    static {
        field_J = false;
        field_F = -1;
    }
}

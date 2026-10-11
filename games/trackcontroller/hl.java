/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hl extends td {
    static aa field_C;
    static int field_F;
    boolean field_E;
    private vl field_D;
    private int field_G;

    boolean k(int param0) {
        if (param0 != 0) {
          be var3 = (be) null;
          hl.a(47, (be) null, -39, 90, -67);
          this.field_G = this.n(127);
          if (0 != this.field_G) {
            return false;
          }
          if (!this.field_E) {
            return true;
          }
          return false;
        }
        this.field_G = this.n(127);
        if (0 != this.field_G) {
          return false;
        }
        if (!this.field_E) {
          return true;
        }
        return false;
    }

    final static void a(int param0, be param1, int param2, int param3, int param4) {
        try {
          param1.a(12, (byte) -69);
          param1.b(param2, (byte) -123);
          param1.b(param3, (byte) -120);
          param1.b(param0, (byte) -119);
          param1.a(param4, (byte) -59);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "hl.SB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void m(int param0) {
        if (param0 == -1217366687) {
          re.field_g.b(new sf(), param0 ^ 1217366722);
          return;
        }
        hl.l(-40);
        re.field_g.b(new sf(), param0 ^ 1217366722);
    }

    private final int n(int param0) {
        if (param0 > 126) {
          return !this.field_E ? 0 : this != this.field_D.j(-6121) ? 0 : 256;
        }
        field_C = (aa) null;
        return !this.field_E ? 0 : this != this.field_D.j(-6121) ? 0 : 256;
    }

    abstract void b(int param0, int param1, int param2);

    final al d(byte param0) {
        if (param0 > -124) {
          return (al) null;
        }
        al var2 = super.d((byte) -125);
        if (var2 != null) {
          return var2;
        }
        return (al) (this);
    }

    hl(vl param0, int param1, int param2) {
        super(-param1 + jf.field_j >> 1, -param2 + kg.field_c >> 1, param1, param2, (t) null);
        try {
          this.field_E = false;
          this.field_D = param0;
          this.field_G = 0;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
          return;
        }
        if (null == uh.field_b[param0]) {
          return;
        }
        if (uh.field_b[param0].b(param1 ^ 10000536)) {
          fe.a(uh.field_b[param0], 2);
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 < -51) {
          this.a(param2, -3050, kg.field_c - param2 >> 1, param0, -param0 + jf.field_j >> 1);
          return;
        }
        hl.l(54);
        this.a(param2, -3050, kg.field_c - param2 >> 1, param0, -param0 + jf.field_j >> 1);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_G == 0) {
          return;
        }
        if (this.field_G >= 256) {
          if (param0 == 0) {
            this.b(this.field_p + param1, param3 ^ 29233, param2 + this.field_m);
            super.a(param0, param1, param2, 29221);
            return;
          }
          return;
        }
        if (gd.field_p == null) {
          gd.field_p = new qj(this.field_x, this.field_u);
          mb.a((byte) -116, gd.field_p);
          ll.a();
          this.b(0, 20, 0);
          super.a(param0, -param1 - this.field_p, -param2 - this.field_m, param3);
          ch.m(119);
          gd.field_p.d(param1 + this.field_p, param2 + this.field_m, this.field_G);
          return;
        }
        if (this.field_x > gd.field_p.field_t) {
          gd.field_p = new qj(this.field_x, this.field_u);
          mb.a((byte) -116, gd.field_p);
          ll.a();
          this.b(0, 20, 0);
          super.a(param0, -param1 - this.field_p, -param2 - this.field_m, param3);
          ch.m(119);
          gd.field_p.d(param1 + this.field_p, param2 + this.field_m, this.field_G);
          return;
        }
        if (this.field_u > gd.field_p.field_q) {
          gd.field_p = new qj(this.field_x, this.field_u);
          mb.a((byte) -116, gd.field_p);
          ll.a();
          this.b(0, 20, 0);
          super.a(param0, -param1 - this.field_p, -param2 - this.field_m, param3);
          ch.m(119);
          gd.field_p.d(param1 + this.field_p, param2 + this.field_m, this.field_G);
          return;
        }
        mb.a((byte) -116, gd.field_p);
        ll.a();
        this.b(0, 20, 0);
        super.a(param0, -param1 - this.field_p, -param2 - this.field_m, param3);
        ch.m(119);
        gd.field_p.d(param1 + this.field_p, param2 + this.field_m, this.field_G);
    }

    public static void l(int param0) {
        field_C = null;
        int var1 = -64 / ((param0 - 19) / 59);
    }

    boolean j(int param0) {
        int var2 = this.n(127);
        int var3 = var2 - this.field_G;
        if (0 < var3) {
          this.field_G = this.field_G + (var3 + 7) / 8;
        }
        if (param0 >= -18) {
          this.field_E = false;
          if (var3 < 0) {
            this.field_G = this.field_G + (-16 + var3 + 1) / 16;
          }
          if (this.field_G != 0) {
            return false;
          }
          if (var2 == 0) {
            return !this.field_E ? true : false;
          }
          return false;
        }
        if (var3 < 0) {
          this.field_G = this.field_G + (-16 + var3 + 1) / 16;
        }
        if (this.field_G != 0) {
          return false;
        }
        if (var2 == 0) {
          return !this.field_E ? true : false;
        }
        return false;
    }

    static {
        field_C = new aa(0, 2, 2, 1);
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bb extends hn {
    private ln field_C;
    boolean field_D;
    private int field_B;

    abstract void b(int param0, int param1, byte param2);

    bb(ln param0, int param1, int param2) {
        super(qj.field_f - param1 >> 1, -param2 + kn.field_h >> 1, param1, param2, (el) null);
        try {
          this.field_C = param0;
          this.field_D = false;
          this.field_B = 0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 == -25) {
          this.a((byte) 127, qj.field_f - param0 >> 1, -param2 + kn.field_h >> 1, param2, param0);
          return;
        }
    }

    boolean a(byte param0) {
        this.field_B = this.i(256);
        if (param0 <= 114) {
          this.field_D = false;
          if (0 != this.field_B) {
            return false;
          }
          if (!this.field_D) {
            return true;
          }
          return false;
        }
        if (0 != this.field_B) {
          return false;
        }
        if (!this.field_D) {
          return true;
        }
        return false;
    }

    final gm a(int param0) {
        gm var2 = super.a(param0 ^ param0);
        if (var2 != null) {
          return var2;
        }
        return (gm) (this);
    }

    private final int i(int param0) {
        if (param0 == 256) {
          return !this.field_D ? 0 : this.field_C.a(0) == this ? 256 : 0;
        }
        this.field_C = (ln) null;
        return !this.field_D ? 0 : this.field_C.a(0) == this ? 256 : 0;
    }

    boolean h(int param0) {
        boolean stackIn_11_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_32_0 = false;
        boolean stackIn_38_0 = false;
        int var2;
        int var3;
        var2 = this.i(256);
        var3 = var2 - this.field_B;
        if (var3 > 0) {
          this.field_B = this.field_B + (7 + var3) / 8;
          if (0 > var3) {
            this.field_B = this.field_B + (-16 + (var3 + 1)) / 16;
          }
          if (param0 == -7) {
            if (this.field_B != 0) {
              return false;
            }
            if (var2 != 0) {
              return false;
            }
            stackIn_11_0 = !(this.field_D);
            return stackIn_11_0;
          }
          this.field_B = 80;
          if (this.field_B != 0) {
            return false;
          }
          if (var2 != 0) {
            return false;
          }
          stackIn_20_0 = !(this.field_D);
          return stackIn_20_0;
        }
        if (0 > var3) {
          this.field_B = this.field_B + (-16 + (var3 + 1)) / 16;
        }
        if (param0 == -7) {
          stackIn_32_0 = (this.field_B == 0) && (var2 == 0) && (!this.field_D);
          return stackIn_32_0;
        }
        this.field_B = 80;
        stackIn_38_0 = (this.field_B == 0) && (var2 == 0) && (!this.field_D);
        return stackIn_38_0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (this.field_B == 0) {
          return;
        }
        if (this.field_B >= 256) {
          if (param0 == 0) {
            this.b(this.field_k + param2, param3 + this.field_w, (byte) -117);
            super.a(param0, (byte) -19, param2, param3);
            return;
          }
          return;
        }
        if (null == ue.field_b) {
          ue.field_b = new t(this.field_p, this.field_o);
          if (param1 <= -7) {
            tm.a((byte) -109, ue.field_b);
            ph.b();
            this.b(0, 0, (byte) -127);
            super.a(param0, (byte) -64, -param2 - this.field_k, -this.field_w - param3);
            r.a(126);
            ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
            return;
          }
          this.a((byte) -26);
          tm.a((byte) -109, ue.field_b);
          ph.b();
          this.b(0, 0, (byte) -127);
          super.a(param0, (byte) -64, -param2 - this.field_k, -this.field_w - param3);
          r.a(126);
          ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
          return;
        }
        if (this.field_p > ue.field_b.field_s) {
          ue.field_b = new t(this.field_p, this.field_o);
          if (param1 <= -7) {
            tm.a((byte) -109, ue.field_b);
            ph.b();
            this.b(0, 0, (byte) -127);
            super.a(param0, (byte) -64, -param2 - this.field_k, -this.field_w - param3);
            r.a(126);
            ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
            return;
          }
          this.a((byte) -26);
          tm.a((byte) -109, ue.field_b);
          ph.b();
          this.b(0, 0, (byte) -127);
          super.a(param0, (byte) -64, -param2 - this.field_k, -this.field_w - param3);
          r.a(126);
          ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
          return;
        }
        if (this.field_o > ue.field_b.field_t) {
          ue.field_b = new t(this.field_p, this.field_o);
          if (param1 <= -7) {
            tm.a((byte) -109, ue.field_b);
            ph.b();
            this.b(0, 0, (byte) -127);
            super.a(param0, (byte) -64, -param2 - this.field_k, -this.field_w - param3);
            r.a(126);
            ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
            return;
          }
          this.a((byte) -26);
          tm.a((byte) -109, ue.field_b);
          ph.b();
          this.b(0, 0, (byte) -127);
          super.a(param0, (byte) -64, -param2 - this.field_k, -this.field_w - param3);
          r.a(126);
          ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
          return;
        }
        if (param1 <= -7) {
          tm.a((byte) -109, ue.field_b);
          ph.b();
          this.b(0, 0, (byte) -127);
          super.a(param0, (byte) -64, -param2 - this.field_k, -this.field_w - param3);
          r.a(126);
          ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
          return;
        }
        this.a((byte) -26);
        tm.a((byte) -109, ue.field_b);
        ph.b();
        this.b(0, 0, (byte) -127);
        super.a(param0, (byte) -64, -param2 - this.field_k, -this.field_w - param3);
        r.a(126);
        ue.field_b.e(param3 + this.field_w, this.field_k + param2, this.field_B);
    }

    static {
    }
}

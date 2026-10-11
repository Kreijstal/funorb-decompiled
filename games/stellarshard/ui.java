/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ui extends g {
    private int field_E;
    private ei field_H;
    boolean field_G;
    static pb field_F;
    static li field_C;
    static String field_D;
    static String field_B;

    final void a(int param0, byte param1, int param2, int param3) {
        if (this.field_E == 0) {
          return;
        }
        if (this.field_E >= 256) {
          if (param0 != 0) {
            return;
          }
          this.b(param1 ^ -58, param2 + this.field_k, param3 + this.field_w);
          super.a(param0, (byte) -57, param2, param3);
          return;
        }
        if (rj.field_s == null) {
          rj.field_s = new pb(this.field_p, this.field_t);
          hj.a(rj.field_s, 1);
          ti.d();
          this.b(param1 + 58, 0, 0);
          super.a(param0, param1, -this.field_k - param2, -this.field_w - param3);
          id.b((byte) -58);
          rj.field_s.e(param3 + this.field_w, param2 + this.field_k, this.field_E);
          return;
        }
        if (this.field_p > rj.field_s.field_v) {
          rj.field_s = new pb(this.field_p, this.field_t);
          hj.a(rj.field_s, 1);
          ti.d();
          this.b(param1 + 58, 0, 0);
          super.a(param0, param1, -this.field_k - param2, -this.field_w - param3);
          id.b((byte) -58);
          rj.field_s.e(param3 + this.field_w, param2 + this.field_k, this.field_E);
          return;
        }
        if (this.field_t > rj.field_s.field_y) {
          rj.field_s = new pb(this.field_p, this.field_t);
          hj.a(rj.field_s, 1);
          ti.d();
          this.b(param1 + 58, 0, 0);
          super.a(param0, param1, -this.field_k - param2, -this.field_w - param3);
          id.b((byte) -58);
          rj.field_s.e(param3 + this.field_w, param2 + this.field_k, this.field_E);
          return;
        }
        hj.a(rj.field_s, 1);
        ti.d();
        this.b(param1 + 58, 0, 0);
        super.a(param0, param1, -this.field_k - param2, -this.field_w - param3);
        id.b((byte) -58);
        rj.field_s.e(param3 + this.field_w, param2 + this.field_k, this.field_E);
    }

    private final int a(int param0) {
        if (param0 == 0) {
          return this.field_G ? this.field_H.d((byte) -120) != this ? 0 : 256 : 0;
        }
        this.b(-18, -2, -61);
        return this.field_G ? this.field_H.d((byte) -120) != this ? 0 : 256 : 0;
    }

    public static void e(byte param0) {
        field_B = null;
        field_F = null;
        field_C = null;
        if (param0 != -29) {
          return;
        }
        field_D = null;
    }

    abstract void b(int param0, int param1, int param2);

    boolean d(boolean param0) {
        boolean stackIn_11_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_32_0 = false;
        boolean stackIn_38_0 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (!param0) {
          field_B = (String) null;
          var2 = this.a(0);
          var3 = var2 - this.field_E;
          if (var3 > 0) {
            this.field_E = this.field_E + (8 + (var3 - 1)) / 8;
          }
          if (var3 >= 0) {
            if (0 != this.field_E) {
              return false;
            }
            if (0 != var2) {
              return false;
            }
            stackIn_11_0 = !(this.field_G);
            return stackIn_11_0;
          }
          this.field_E = this.field_E + (var3 - 16 + 1) / 16;
          if (0 != this.field_E) {
            return false;
          }
          if (0 != var2) {
            return false;
          }
          stackIn_20_0 = !(this.field_G);
          return stackIn_20_0;
        }
        var2Lifetime1 = this.a(0);
        var3Lifetime1 = var2Lifetime1 - this.field_E;
        if (var3Lifetime1 > 0) {
          this.field_E = this.field_E + (8 + (var3Lifetime1 - 1)) / 8;
        }
        if (var3Lifetime1 >= 0) {
          stackIn_32_0 = (0 == this.field_E) && (0 == var2Lifetime1) && (!this.field_G);
          return stackIn_32_0;
        }
        this.field_E = this.field_E + (var3Lifetime1 - 16 + 1) / 16;
        stackIn_38_0 = (0 == this.field_E) && (0 == var2Lifetime1) && (!this.field_G);
        return stackIn_38_0;
    }

    final rj a(byte param0) {
        rj var2 = super.a(param0);
        if (var2 != null) {
          return var2;
        }
        return (rj) (this);
    }

    boolean h(int param0) {
        if (param0 <= 98) {
          return true;
        }
        this.field_E = this.a(0);
        if (this.field_E != 0) {
          return false;
        }
        if (!this.field_G) {
          return true;
        }
        return false;
    }

    ui(ei param0, int param1, int param2) {
        super(ml.field_b - param1 >> 1, -param2 + vf.field_F >> 1, param1, param2, (uk) null);
        try {
          this.field_E = 0;
          this.field_H = param0;
          this.field_G = false;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ui.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        this.b(param0, ml.field_b - param0 >> 1, vf.field_F - param2 >> 1, param2, 23987);
        if (param1 > -4) {
          field_B = (String) null;
        }
    }

    static {
        field_C = new li(12, 0, 1, 0);
        field_D = "Checking";
        field_B = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}

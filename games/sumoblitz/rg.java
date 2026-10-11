/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rg extends sp {
    boolean field_D;
    dg field_E;
    private int field_B;
    static iw field_A;
    static int[] field_C;

    rg(dg param0, int param1, int param2) {
        super(lj.field_b - param1 >> 1, cv.field_O - param2 >> 1, param1, param2, (mh) null);
        try {
          this.field_D = false;
          this.field_B = 0;
          this.field_E = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "rg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        field_A = null;
        int var1 = 68 / ((1 - param0) / 63);
        field_C = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (this.field_B == 0) {
          return;
        }
        if (this.field_B >= 256) {
          if (param3 == 0) {
            this.b(117, param0 + this.field_r, param1 + this.field_v);
            super.a(param0, param1, (byte) -112, param3);
            return;
          }
          return;
        }
        if (null == uw.field_a) {
          uw.field_a = new wb(this.field_q, this.field_p);
          jq.a(7161, uw.field_a);
          lk.b();
          this.b(113, 0, 0);
          if (param2 < -35) {
            super.a(-param0 - this.field_r, -param1 - this.field_v, (byte) -114, param3);
            su.a((byte) 114);
            uw.field_a.a(param0 + this.field_r, param1 + this.field_v, this.field_B);
            return;
          }
          this.f(-77);
          super.a(-param0 - this.field_r, -param1 - this.field_v, (byte) -114, param3);
          su.a((byte) 114);
          uw.field_a.a(param0 + this.field_r, param1 + this.field_v, this.field_B);
          return;
        }
        if (uw.field_a.field_x < this.field_q) {
          uw.field_a = new wb(this.field_q, this.field_p);
          jq.a(7161, uw.field_a);
          lk.b();
          this.b(113, 0, 0);
          if (param2 < -35) {
            super.a(-param0 - this.field_r, -param1 - this.field_v, (byte) -114, param3);
            su.a((byte) 114);
            uw.field_a.a(param0 + this.field_r, param1 + this.field_v, this.field_B);
            return;
          }
          this.f(-77);
          super.a(-param0 - this.field_r, -param1 - this.field_v, (byte) -114, param3);
          su.a((byte) 114);
          uw.field_a.a(param0 + this.field_r, param1 + this.field_v, this.field_B);
          return;
        }
        if (this.field_p > uw.field_a.field_u) {
          uw.field_a = new wb(this.field_q, this.field_p);
          jq.a(7161, uw.field_a);
          lk.b();
          this.b(113, 0, 0);
          if (param2 < -35) {
            super.a(-param0 - this.field_r, -param1 - this.field_v, (byte) -114, param3);
            su.a((byte) 114);
            uw.field_a.a(param0 + this.field_r, param1 + this.field_v, this.field_B);
            return;
          }
          this.f(-77);
          super.a(-param0 - this.field_r, -param1 - this.field_v, (byte) -114, param3);
          su.a((byte) 114);
          uw.field_a.a(param0 + this.field_r, param1 + this.field_v, this.field_B);
          return;
        }
        jq.a(7161, uw.field_a);
        lk.b();
        this.b(113, 0, 0);
        if (param2 < -35) {
          super.a(-param0 - this.field_r, -param1 - this.field_v, (byte) -114, param3);
          su.a((byte) 114);
          uw.field_a.a(param0 + this.field_r, param1 + this.field_v, this.field_B);
          return;
        }
        this.f(-77);
        super.a(-param0 - this.field_r, -param1 - this.field_v, (byte) -114, param3);
        su.a((byte) 114);
        uw.field_a.a(param0 + this.field_r, param1 + this.field_v, this.field_B);
    }

    boolean g(int param0) {
        boolean stackIn_8_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_30_0 = false;
        boolean stackIn_39_0 = false;
        boolean stackIn_45_0 = false;
        boolean stackIn_53_0 = false;
        boolean stackIn_59_0 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 != -28778) {
          this.field_E = (dg) null;
          var2 = this.a((byte) -100);
          var3 = var2 - this.field_B;
          if (var3 <= 0) {
            if (var3 < 0) {
              this.field_B = this.field_B + (1 + var3 - 16) / 16;
              if (0 != this.field_B) {
                return false;
              }
              if (var2 != 0) {
                return false;
              }
              stackIn_15_0 = !(this.field_D);
              return stackIn_15_0;
            }
            stackIn_8_0 = (0 == this.field_B) && (var2 == 0) && (!this.field_D);
            return stackIn_8_0;
          }
          this.field_B = this.field_B + (7 + var3) / 8;
          if (var3 >= 0) {
            stackIn_30_0 = (0 == this.field_B) && (var2 == 0) && (!this.field_D);
            return stackIn_30_0;
          }
          this.field_B = this.field_B + (1 + var3 - 16) / 16;
          stackIn_24_0 = (0 == this.field_B) && (var2 == 0) && (!this.field_D);
          return stackIn_24_0;
        }
        var2Lifetime1 = this.a((byte) -100);
        var3Lifetime1 = var2Lifetime1 - this.field_B;
        if (var3Lifetime1 <= 0) {
          if (var3Lifetime1 >= 0) {
            stackIn_53_0 = (0 == this.field_B) && (var2Lifetime1 == 0) && (!this.field_D);
            return stackIn_53_0;
          }
          this.field_B = this.field_B + (1 + var3Lifetime1 - 16) / 16;
          stackIn_59_0 = (0 == this.field_B) && (var2Lifetime1 == 0) && (!this.field_D);
          return stackIn_59_0;
        }
        this.field_B = this.field_B + (7 + var3Lifetime1) / 8;
        if (var3Lifetime1 >= 0) {
          stackIn_39_0 = (0 == this.field_B) && (var2Lifetime1 == 0) && (!this.field_D);
          return stackIn_39_0;
        }
        this.field_B = this.field_B + (1 + var3Lifetime1 - 16) / 16;
        stackIn_45_0 = (0 == this.field_B) && (var2Lifetime1 == 0) && (!this.field_D);
        return stackIn_45_0;
    }

    final static boolean a(int param0, char param1) {
        int var2 = -62 % ((-58 - param0) / 63);
        if (65 <= param1) {
          if (param1 <= 90) {
            return true;
          }
          if (param1 < 97) {
            return false;
          }
          if (param1 <= 122) {
            return true;
          }
          return false;
        }
        if (param1 < 97) {
          return false;
        }
        if (param1 > 122) {
          return false;
        }
        return true;
    }

    boolean h(int param0) {
        if (param0 != 0) {
          return false;
        }
        this.field_B = this.a((byte) -100);
        if (0 != this.field_B) {
          return false;
        }
        if (!this.field_D) {
          return true;
        }
        return false;
    }

    final void c(int param0, int param1, int param2) {
        if (param2 >= 37) {
          this.a(106, lj.field_b - param0 >> 1, -param1 + cv.field_O >> 1, param1, param0);
          return;
        }
        field_A = (iw) null;
        this.a(106, lj.field_b - param0 >> 1, -param1 + cv.field_O >> 1, param1, param0);
    }

    abstract void b(int param0, int param1, int param2);

    final pk f(int param0) {
        pk var2 = super.f(-105);
        int var3 = -113 / ((param0 + 25) / 58);
        if (var2 != null) {
          return var2;
        }
        return (pk) (this);
    }

    final static void a(byte param0, int param1) {
        se.a(19886);
        if (param0 != 55) {
          rg.a(124, 'r');
        }
    }

    private final int a(byte param0) {
        if (param0 == -100) {
          return !this.field_D ? 0 : this.field_E.e((byte) 54) != this ? 0 : 256;
        }
        return -55;
    }

    static {
        field_A = new iw(1);
        field_C = new int[1024];
    }
}

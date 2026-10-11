/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cc extends kn {
    private hm field_I;
    boolean field_K;
    static String field_M;
    private int field_J;
    static int[] field_L;

    final void a(byte param0, int param1, int param2, int param3) {
        if (this.field_J == 0) {
          return;
        }
        if (this.field_J >= 256) {
          if (param3 == 0) {
            this.b(21533, this.field_t + param2, this.field_u + param1);
            super.a((byte) 4, param1, param2, param3);
            return;
          }
          return;
        }
        if (null == mn.field_t) {
          mn.field_t = new ea(this.field_v, this.field_q);
          vb.a(mn.field_t, 127);
          eh.d();
          this.b(21533, 0, 0);
          super.a(param0, -param1 - this.field_u, -param2 - this.field_t, param3);
          tk.b(true);
          mn.field_t.f(this.field_u + param1, this.field_t + param2, this.field_J);
          return;
        }
        if (this.field_v > mn.field_t.field_y) {
          mn.field_t = new ea(this.field_v, this.field_q);
          vb.a(mn.field_t, 127);
          eh.d();
          this.b(21533, 0, 0);
          super.a(param0, -param1 - this.field_u, -param2 - this.field_t, param3);
          tk.b(true);
          mn.field_t.f(this.field_u + param1, this.field_t + param2, this.field_J);
          return;
        }
        if (mn.field_t.field_C >= this.field_q) {
          vb.a(mn.field_t, 127);
          eh.d();
          this.b(21533, 0, 0);
          super.a(param0, -param1 - this.field_u, -param2 - this.field_t, param3);
          tk.b(true);
          mn.field_t.f(this.field_u + param1, this.field_t + param2, this.field_J);
          return;
        }
        mn.field_t = new ea(this.field_v, this.field_q);
        vb.a(mn.field_t, 127);
        eh.d();
        this.b(21533, 0, 0);
        super.a(param0, -param1 - this.field_u, -param2 - this.field_t, param3);
        tk.b(true);
        mn.field_t.f(this.field_u + param1, this.field_t + param2, this.field_J);
    }

    final static void a(int param0, int param1) {
        dk.field_e = dk.field_e + 1;
        if (25 == dk.field_e) {
          dk.field_e = 0;
        }
        gl.field_u[dk.field_e] = rc.a(re.field_a[17], 100, oc.field_f);
        mg.a(1963987425, gl.field_u[dk.field_e]);
        sd.field_c[dk.field_e] = param0;
        if (param1 == 136989569) {
          return;
        }
        cc.a(25, 120);
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 == 55) {
          this.a(param0, -101, -param1 + od.field_n >> 1, param1, ae.field_c - param0 >> 1);
          return;
        }
    }

    final fe m(int param0) {
        fe var2 = super.m(123);
        if (param0 <= 107) {
          this.field_I = (hm) null;
          if (var2 == null) {
            return (fe) (this);
          }
          return var2;
        }
        if (var2 == null) {
          return (fe) (this);
        }
        return var2;
    }

    final static void a(byte param0) {
        int var3 = 0;
        int var2 = 0;
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        cm var6 = (cm) (ce.field_a.b(94));
        cm var1 = var6;
        int var2Lifetime1;
        int var2Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        if (var1 != null) {
          var3 = tf.field_a;
          if (var3 < 100) {
            var2 = 480 + (32 + (-var3 / 2 - 38));
            var4 = ce.field_d.c(ld.field_A[var6.field_s], 640);
            g.a(var2 - 10, 60, -var4 + 570, var4 + 60, (byte) 60, he.field_b);
            nj.field_c[var6.field_s].c(590, var2);
            ce.field_d.c(ld.field_A[var6.field_s], 582, var2 + ce.field_d.field_I, 1, -1);
            if (param0 >= -79) {
              cc.a(37, 30);
              return;
            }
            return;
          }
          if (var3 >= 250) {
            var2Lifetime1 = -123 - (-(var3 / 2) - 480) - 58;
            var4Lifetime1 = ce.field_d.c(ld.field_A[var6.field_s], 640);
            g.a(var2Lifetime1 - 10, 60, -var4Lifetime1 + 570, var4Lifetime1 + 60, (byte) 60, he.field_b);
            nj.field_c[var6.field_s].c(590, var2Lifetime1);
            ce.field_d.c(ld.field_A[var6.field_s], 582, var2Lifetime1 + ce.field_d.field_I, 1, -1);
            if (param0 >= -79) {
              cc.a(37, 30);
              return;
            }
            return;
          }
          var2Lifetime2 = 424;
          var4Lifetime2 = ce.field_d.c(ld.field_A[var6.field_s], 640);
          g.a(var2Lifetime2 - 10, 60, -var4Lifetime2 + 570, var4Lifetime2 + 60, (byte) 60, he.field_b);
          nj.field_c[var6.field_s].c(590, var2Lifetime2);
          ce.field_d.c(ld.field_A[var6.field_s], 582, var2Lifetime2 + ce.field_d.field_I, 1, -1);
        }
        if (param0 < -79) {
          return;
        }
        cc.a(37, 30);
    }

    public static void e(byte param0) {
        if (param0 != 15) {
          return;
        }
        field_M = null;
        field_L = null;
    }

    private final int f(byte param0) {
        int var2 = -108 / ((param0 - 53) / 58);
        return !this.field_K ? 0 : this.field_I.e((byte) 83) == this ? 256 : 0;
    }

    boolean n(int param0) {
        boolean stackIn_12_0 = false;
        boolean stackIn_24_0 = false;
        int var2;
        int var3;
        var2 = this.f((byte) 116);
        var3 = -this.field_J + var2;
        if (0 < var3) {
          this.field_J = this.field_J + (-1 + var3 + 8) / 8;
          if (0 > var3) {
            this.field_J = this.field_J + (var3 - 15) / 16;
          }
          if (param0 != -4) {
            return true;
          }
          if (this.field_J != 0) {
            return false;
          }
          if (var2 != 0) {
            return false;
          }
          stackIn_12_0 = !(this.field_K);
          return stackIn_12_0;
        }
        if (0 > var3) {
          this.field_J = this.field_J + (var3 - 15) / 16;
        }
        if (param0 != -4) {
          return true;
        }
        stackIn_24_0 = (this.field_J == 0) && (var2 == 0) && (!this.field_K);
        return stackIn_24_0;
    }

    abstract void b(int param0, int param1, int param2);

    boolean a(boolean param0) {
        this.field_J = this.f((byte) -86);
        if (param0) {
          return false;
        }
        if (this.field_J != 0) {
          return false;
        }
        if (!this.field_K) {
          return true;
        }
        return false;
    }

    cc(hm param0, int param1, int param2) {
        super(-param1 + od.field_n >> 1, ae.field_c - param2 >> 1, param1, param2, (ad) null);
        try {
          this.field_K = false;
          this.field_J = 0;
          this.field_I = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_M = "Music: ";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fdb extends hbb {
    private int[] field_R;
    static String field_T;
    static String field_S;
    private boolean field_P;
    private int field_Q;
    private int[] field_J;
    private cl field_U;

    public static void g(int param0) {
        field_S = null;
        if (param0 != 0) {
          fdb.g(-2);
        }
        field_T = null;
    }

    final synchronized void a(kka param0, boolean param1, int param2, boolean param3) {
        try {
          this.f(-17);
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "fdb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (param0 != -17) {
          return;
        }
        for (var2 = 0; var2 < 16; var2++) {
          this.field_R[var2] = 1048576;
        }
        super.b(256, (byte) 18, -1);
    }

    fdb(hbb param0) {
        super(param0);
        this.field_Q = 256;
        this.field_J = new int[16];
        this.field_R = new int[16];
        try {
          this.f(-17);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "fdb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, byte param3) {
        llb stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        llb stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        llb stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        moa.a(true);
        if (0 > tg.field_q) {
          nna.field_v.field_R = null;
        } else {
          nna.field_v.field_R = isa.a(gcb.field_t, new String[]{Integer.toString(tg.field_q)}, 78);
        }
        stackIn_9_0 = tb.field_a;
        stackIn_10_1 = (param0) && (!param1) && (!bv.field_d) && (lqa.field_o == null) && (null == ohb.field_o);
        ((llb) (Object) stackIn_9_0).a(stackIn_10_1, 1332);
        stackIn_16_0 = bqa.field_d;
        stackIn_17_1 = (param0) && (!param1) && (!bv.field_d) && (null == lqa.field_o) && (null == ohb.field_o);
        ((llb) (Object) stackIn_16_0).a(stackIn_17_1, 1332);
        stackIn_21_0 = dd.field_o;
        stackIn_22_1 = (param0) && (!param1) && (bv.field_d);
        ((llb) (Object) stackIn_21_0).a(stackIn_22_1, 1332);
        lc.field_b.field_a.i(10000);
        if (gmb.field_c.field_o != 0) {
          nwa.field_d = true;
        }
        if (param3 < 96) {
          field_S = (String) null;
        }
        if (gha.field_p.field_o != 0) {
          if (ufa.field_o) {
            w.a(param2, (byte) 92);
          } else {
            if (hcb.field_o > 0) {
              w.a(param2, (byte) 92);
            } else {
              if (go.field_p >= 2 &&
                si.field_o[12]) {
                w.a(param2, (byte) 92);
              }
            }
          }
        }
        if (0 != oib.field_a.field_o) {
          if (ieb.field_o.length == 1 &&
            sha.field_w != ieb.field_o[0]) {
            sha.field_w = ieb.field_o[0];
          }
          eaa.a((byte) 127, true, vva.field_u, 0, sha.field_w, param2);
        }
        if (ss.field_o.field_o != 0) {
          bv.field_d = false;
        }
    }

    final synchronized void b(int param0, byte param1, int param2) {
        if (param2 == -1) {
          this.field_Q = param0;
          return;
        }
        super.b(param0, param1, param2);
        this.field_R[param2] = param0 << 12;
    }

    final synchronized void a(byte param0, int param1, cl param2) {
        int var4_int = 0;
        try {
          var4_int = vka.field_s * param1 / 1000;
          this.a(-91, param2, var4_int);
          int var5 = 76 % ((param0 - 80) / 33);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "fdb.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public fdb() {
        this.field_Q = 256;
        this.field_J = new int[16];
        this.field_R = new int[16];
        this.f(-17);
    }

    private final synchronized void b(int param0, int param1, int param2, byte param3) {
        this.field_P = false;
        if (this.field_U == null) {
          this.field_U = new cl();
        }
        this.field_U.field_a[param1] = param2;
        if (param3 != -48) {
          return;
        }
        int var5 = this.field_R[param1];
        int var6 = -var5 + (this.field_U.field_a[param1] << 12);
        int var7 = 0;
        int var8 = 0;
        if (0 > var6) {
          var6 = -var6;
          var8 = 1;
        }
        if (var6 > 0) {
          var7 = (1 + var6) / (param0 + 1);
        }
        this.field_J[param1] = var8 != 0 ? -var7 : var7;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          var4_int = this.e(127);
          this.b(this.field_Q * var4_int >> 8, (byte) 14);
          super.a(param0, param1, param2);
          if (!this.field_P) {
            var5 = 1;
            for (var6 = 0; var6 < 16; var6++) {
              var7 = this.field_J[var6];
              if (0 != var7) {
                this.field_R[var6] = this.field_R[var6] + param2 * var7;
                var8 = this.field_U.field_a[var6];
                stackIn_9_0 = (this.field_R[var6] >> 12 >= var8) ? 0 : 1;
                if (var7 <= 0) {
                  stackIn_12_1 = 0;
                } else {
                  stackIn_12_1 = 1;
                }
                if ((stackIn_9_0 ^ stackIn_12_1) == 0) {
                  var5 = 0;
                } else {
                  this.field_J[var6] = 0;
                  this.field_R[var6] = var8 << 12;
                }
                super.b(this.field_R[var6] >> 12, (byte) 18, var6);
              }
            }
            if (var5 != 0) {
              this.field_P = true;
            }
          }
          this.b(var4_int, (byte) 14);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("fdb.E(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized void a(int param0, cl param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          this.field_U = param1;
          if (param0 > 0) {
            return;
          }
          for (var4_int = 0; var4_int < 16; var4_int++) {
            this.b(param2, var4_int, this.field_U.field_a[var4_int], (byte) -48);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("fdb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_S = "Bullfrog chassis";
        field_T = "Get your turret to the escape zone";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class n extends v {
    static int[][][] field_db;
    private int field_hb;
    private int field_nb;
    private int field_gb;
    static String field_fb;
    private int field_bb;
    private hi field_eb;
    static int[][][] field_kb;
    private p field_mb;
    private ee field_ib;
    static mi field_cb;
    static int field_jb;
    private int field_lb;

    final static void g(byte param0) {
        String var1 = null;
        int var2 = 0;
        String var1Lifetime1;
        int var2Lifetime1;
        if (!eb.field_m) {
          throw new IllegalStateException();
        }
        if (da.field_c == null) {
          var1 = pd.f((byte) 48);
          kb.field_O = new fg(var1, (String) null, true, false, false);
          t.field_b.a((byte) 69, (ee) (bg.field_K));
          bg.field_K.c(0, kb.field_O);
          bg.field_K.d(true);
          var2 = 9 / ((param0 + 2) / 62);
          return;
        }
        da.field_c.o(77);
        var1Lifetime1 = pd.f((byte) 48);
        kb.field_O = new fg(var1Lifetime1, (String) null, true, false, false);
        t.field_b.a((byte) 69, (ee) (bg.field_K));
        bg.field_K.c(0, kb.field_O);
        bg.field_K.d(true);
        var2Lifetime1 = 9 / ((param0 + 2) / 62);
    }

    public static void l(int param0) {
        field_cb = null;
        if (param0 == 5) {
          field_db = (int[][][]) null;
          field_fb = null;
          field_kb = (int[][][]) null;
          return;
        }
        n.l(-121);
        field_db = (int[][][]) null;
        field_fb = null;
        field_kb = (int[][][]) null;
    }

    n(si param0, ee param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_p, 12 + param2 + param1.field_l);
        try {
          this.field_bb = param3;
          this.field_nb = param3;
          this.field_hb = param4;
          this.field_gb = param2;
          this.b(param1, 18744);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean j(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (null == this.field_mb) {
          if (param0 != 1) {
            return false;
          }
          return super.j(1);
        }
        if (v.field_Y == this.field_mb) {
          fieldTemp$0 = this.field_lb + 1;
          this.field_lb = this.field_lb + 1;
          if (fieldTemp$0 != this.field_nb) {
            this.field_eb.field_H = -((this.field_lb << 8) / this.field_nb) + 256;
          } else {
            this.field_mb = ng.field_C;
            this.a(this.field_gb + (12 + this.field_ib.field_l), this.field_hb, this.field_ib.field_p + 12, false);
            this.field_eb.field_H = 0;
            this.field_lb = 0;
          }
          if (param0 != 1) {
            return false;
          }
          return super.j(1);
        }
        if (this.field_mb != ac.field_c) {
          if (param0 != 1) {
            return false;
          }
          return super.j(1);
        }
        fieldTemp$1 = this.field_lb + 1;
        this.field_lb = this.field_lb + 1;
        if (fieldTemp$1 != this.field_bb) {
          this.field_eb.field_H = (this.field_lb << 8) / this.field_bb;
        } else {
          this.field_mb = null;
          this.field_eb.field_H = 256;
        }
        if (param0 != 1) {
          return false;
        }
        return super.j(1);
    }

    boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 9) {
            this.k(41);
          }
          if (super.a(param0, param1, (byte) 33, param3)) {
            return true;
          }
          if (this.field_eb != null) {
            if (98 == param0) {
              this.field_eb.a(param3, 0);
            }
            if (99 == param0) {
              this.field_eb.a(param3, 0);
              return false;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("n.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void k(int param0) {
        if (v.field_Y == this.field_mb) {
          return;
        }
        this.field_lb = 0;
        this.field_mb = ac.field_c;
        this.b(this.field_ib, param0 ^ 18744);
        this.field_ib = null;
        this.field_eb.field_H = param0;
    }

    final void d(boolean param0) {
        if (null == this.field_mb) {
          super.d(param0);
          return;
        }
        if (this.field_mb != ac.field_c) {
          this.b(0, this.field_ib.field_l + 12 + this.field_gb, 12 + this.field_ib.field_p);
          this.b(this.field_ib, 18744);
        } else {
          this.field_eb.field_H = 256;
          this.field_mb = null;
          super.d(param0);
          return;
        }
        this.field_eb.field_H = 256;
        this.field_mb = null;
        super.d(param0);
    }

    private final void b(ee param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_eb) {
            this.field_eb.a(true);
          }
          if (param0 == null) {
            this.field_eb = new hi();
          } else {
            param0.a((byte) 105, 6, param0.field_l, param0.field_p, 6 + this.field_gb);
            this.field_eb = new hi(param0);
          }
          this.a(param1 - 18744, this.field_eb);
          this.field_ib = null;
          if (param1 == 18744) {
            return;
          }
          field_cb = (mi) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("n.AA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    void c(int param0, ee param1) {
        RuntimeException var3 = null;
        ee var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_ib = param1;
          if (ng.field_C != this.field_mb) {
            if (v.field_Y != this.field_mb) {
              this.field_lb = 0;
              this.field_mb = v.field_Y;
            }
          } else {
            this.a(12 - (-this.field_gb - this.field_ib.field_l), this.field_hb, 12 + this.field_ib.field_p, false);
            this.field_lb = 0;
          }
          if (param0 == 0) {
            return;
          }
          var4 = (ee) null;
          this.c(-2, (ee) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("n.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean h(int param0) {
        this.d(true);
        if (param0 < 83) {
          return true;
        }
        return super.h(113);
    }

    static {
        field_fb = "Invalid password.";
        field_db = new int[][][]{new int[][]{new int[]{-7, 5, -7}, new int[]{5, -7}, new int[]{5, -7}, new int[]{5, 5, 5, 5, 5, 5}, new int[]{-7, -7}, new int[]{0}, new int[]{20, 20, 20, 20, 20, -7}}, new int[][]{new int[]{5, -7}, new int[]{5, -7, 5, -7}, new int[]{5, 5, 5, 5, 5, -7}, new int[]{5, 3, 1, 3, 5, -7}, new int[]{-7, 5, 5, 5, -7}, new int[]{5, 5, 5, 5, -7}, new int[]{0}}, new int[][]{new int[]{-7, 5, -7}, new int[]{5, -7}, new int[]{5, 5, 5, -7}, new int[]{5, 5, 5, 5, 5, 5}, new int[]{-7, -7, -7}, new int[]{0}, new int[]{10, 10, 10, 10, 10, -7}}};
    }
}

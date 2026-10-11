/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class csa extends vg implements noa, qn, fo, gma, lj, ew {
    int field_m;
    private int field_q;
    int field_k;
    int field_j;
    mka[] field_t;
    private boolean field_v;
    private int field_h;
    private csa field_u;
    bca field_z;
    int field_l;
    static int field_n;
    static int field_g;
    la field_o;
    private gpa field_w;
    static su field_y;
    int field_p;
    private int field_f;
    private gpa field_s;
    int field_r;
    static int[] field_i;
    boolean field_x;

    public final int e(byte param0) {
        if (param0 >= -86) {
          csa var3 = (csa) null;
          this.a((csa) null, -115, (byte) -23);
        }
        return this.g((byte) 115);
    }

    final void a(boolean param0, int param1) {
        int var3;
        csa var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!this.b(param0, param1)) {
          return;
        }
        this.x(8);
        var3 = 0;
        if (!param0) {
          this.s(-56);
        }
        while (var3 < this.field_t.length) {
          var4 = this.field_t[var3].a(108);
          if (var4 != null) {
            var4.a(param0, param1);
          }
          var3++;
        }
    }

    final void c(boolean param0) {
        int var2 = 0;
        csa var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        this.w(-124);
        for (var2 = 0; var2 < this.field_t.length; var2++) {
          var3 = this.field_t[var2].a(94);
          if (var3 != null) {
            var3.c(true);
          }
        }
        if (!param0) {
          field_y = (su) null;
        }
    }

    private final mka a(int param0, int param1) {
        if (param1 != 8192) {
          csa var4 = (csa) null;
          this.a(false, -41, (csa) null);
        }
        return this.field_t[param0];
    }

    final static void a(boolean param0) {
        hk.field_e = new jea(0L, (jea) null);
        if (rca.field_p) {
          hk.field_e.b(-127, lva.field_t);
        }
        if (param0) {
          field_n = -21;
        }
        hk.field_e.b(-127, rra.field_e);
        oca.field_b = new lla(cla.field_o, hk.field_e);
        nra.field_a = new jea(0L, (jea) null);
        nra.field_a.b(-122, oca.field_b.field_a);
        nra.field_a.b(-128, st.field_j);
        re.a(-29040);
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param0 < 68) {
          this.i((byte) -75);
          return false;
        }
        return false;
    }

    public final ew h(byte param0) {
        if (param0 < 105) {
          this.r(70);
        }
        return (ew) ((Object) this.o((byte) -34));
    }

    public final boolean h(int param0) {
        mka discarded$0 = null;
        if (param0 != 18407) {
          discarded$0 = this.a(20, 6);
          return false;
        }
        return false;
    }

    public final int k(int param0) {
        if (param0 != -21185) {
          this.field_l = -20;
        }
        return this.field_p;
    }

    public final la f(byte param0) {
        int var2 = -126 / ((param0 - 0) / 61);
        return this.field_o;
    }

    public final int b(byte param0) {
        int var2 = -53 / ((param0 + 23) / 53);
        return this.d(3);
    }

    void x(int param0) {
        if (param0 != 8) {
          this.field_r = -107;
        }
    }

    private final void m(byte param0) {
        int var3 = 0;
        mka var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        mka[] var6 = this.field_t;
        mka[] var2 = var6;
        if (param0 != -24) {
          this.d((byte) -51);
        }
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.a(this.field_f, (byte) -61, this.field_o, this.field_h);
        }
    }

    private final boolean p(byte param0) {
        int var2 = -18 / ((param0 + 28) / 57);
        return this.field_o.o((byte) -82);
    }

    final void a(boolean param0, int param1, ui param2, ui param3) {
        int var5_int = 0;
        csa var6 = null;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 != null) {
            this.field_w = param2.a(86, false);
          }
          if (param1 != 6) {
            this.field_f = -31;
          }
          if (param3 != null) {
            this.field_s = param3.a(104, false);
          }
          for (var5_int = 0; this.field_t.length > var5_int; var5_int++) {
            var6 = this.field_t[var5_int].a(120);
            if (var6 != null) {
              var6.a(param0, 6, param2, param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("csa.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public final boolean l(int param0) {
        boolean stackIn_10_0 = false;
        if (param0 != 0) {
          return true;
        }
        stackIn_10_0 = ((null != this.field_u &&
          this.field_u.l(0)) ||
          (this.field_o.o((byte) -82) &&
          !(this.b(true, this.field_o.i(6029)))));
        return stackIn_10_0;
    }

    final boolean a(boolean param0, int param1, csa param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        csa var5 = null;
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          for (var4_int = param1; this.field_t.length > var4_int; var4_int++) {
            var5 = this.field_t[var4_int].a(param1 ^ -103);
            if (var5 != null) {
              if (param2 == var5) {
                return true;
              }
              if (param0 &&
                var5.a(param0, 0, param2)) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("csa.HB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final int c(int param0) {
        if (param0 > -11) {
          this.field_u = (csa) null;
        }
        return this.field_l;
    }

    public final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 != 110) {
          this.field_s = (gpa) null;
        }
        return io.a(param4, this.e(9648), (byte) -62, param3, this.d(3), param1, this.field_k, this.field_l, param2);
    }

    void a(la param0, int param1) {
        try {
          if (param1 != 1) {
            this.field_k = -87;
          }
          if (null == this.field_u) {
            this.field_j = param0.a(this.field_j, (byte) 71);
          } else {
            this.field_j = -this.field_j;
          }
          this.field_r = dfa.a(-this.field_r, 8192, -85);
          this.d(true);
          this.field_v = !this.field_v ? true : false;
          this.m((byte) -24);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "csa.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int e(int param0) {
        int var3 = 0;
        int var4 = 0;
        if (param0 != 9648) {
          return 20;
        }
        int var2 = this.field_p;
        if (null != this.field_u) {
          var3 = this.field_j >> 8;
          var4 = var2 >> 8;
          var2 = var3 * (this.field_u.field_f >> 8) + var4 * (this.field_u.field_h >> 8);
          var2 = var2 + this.field_u.e(9648);
        }
        return var2;
    }

    public static void j(byte param0) {
        field_i = null;
        if (param0 != -107) {
          g[] var2 = (g[]) null;
          csa.a(104, -8, 16, (g[]) null);
        }
        field_y = null;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
          this.a((byte) -31, 116, -25, -38, 120);
        }
    }

    public final int i(int param0) {
        if (param0 <= 90) {
          return 61;
        }
        return this.field_j;
    }

    abstract lj u(int param0);

    final void a(byte param0, mka[] param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          this.field_t = param1;
          if (param0 <= 64) {
            this.m(-58);
          }
          for (var3_int = 0; param1.length > var3_int; var3_int++) {
            this.field_t[var3_int].a(-34, var3_int, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("csa.PB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final csa a(int param0, boolean param1, boolean param2) {
        int var4 = 0;
        csa var5;
        int var7;
        csa var6;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param1 &&
          param0 == this.field_s.a((byte) 111)) {
          return this;
        }
        if (!param1 &&
          param0 == this.field_w.a((byte) 88)) {
          return this;
        }
        if (param2) {
          this.field_r = 111;
        }
        for (var4 = 0; this.field_t.length > var4; var4++) {
          var5 = this.field_t[var4].a(-92);
          if (var5 != null) {
            var6 = var5.a(param0, param1, false);
            if (var6 != null) {
              return var6;
            }
          }
        }
        return null;
    }

    final csa a(int param0, boolean param1, int param2) {
        if (param2 != 20) {
          fsa var5 = (fsa) null;
          this.a(true, false, (la) null, 109, -103, 35, (fsa) null);
        }
        if (!param1) {
          return this.field_o.a(param1, param0, param2 ^ 18);
        }
        return this.a(param0, param1, false);
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 1434528720) {
          this.g(113);
        }
        this.field_j = param2;
        this.field_p = param1;
    }

    csa(la param0, int param1, kh param2, csa param3) {
        this(param0, param1);
        int var5_int = 0;
        boolean stackIn_16_1 = false;
        boolean stackIn_20_1 = false;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        csa var6 = null;
        try {
          this.field_u = param3;
          if (param3 == null) {
            if (param0.field_E > 20) {
              this.field_j = 1048576 * bla.a(true, 8, param2.b((byte) 44, 8));
              this.field_p = 1048576 * bla.a(true, 8, param2.b((byte) 44, 8));
            } else {
              this.field_j = bla.a(true, 12, param2.b((byte) 44, 12)) << 16;
              this.field_p = bla.a(true, 12, param2.b((byte) 44, 12)) << 16;
            }
          }
          if (this.v(555277520)) {
            if (20 < param0.field_E) {
              this.field_l = 2097152 * param2.b((byte) 44, 6);
              this.field_k = 2097152 * param2.b((byte) 44, 6);
            } else {
              this.field_l = param2.b((byte) 44, 10) << 16;
              this.field_k = param2.b((byte) 44, 10) << 16;
            }
          }
          if (this.n((byte) -122)) {
            this.field_r = oo.a(4, 8192, 0, param2.b((byte) 44, 4));
          }
          if (20 <= param0.field_E &&
            this.a(6)) {
            stackIn_16_1 = (param2.b((byte) 44, 1) == 1);
            this.field_x = stackIn_16_1;
          }
          this.field_z = new bca(param0.field_E, param2);
          stackIn_20_1 = (param2.b((byte) 44, 1) == 1);
          this.field_v = stackIn_20_1;
          for (var5_int = 0; this.field_t.length > var5_int; var5_int++) {
            if (1 == param2.b((byte) 44, 1)) {
              var6 = vha.field_c.a(param2, param0, (byte) -7, this);
              var6.a(1434528720, this.field_t[var5_int].c((byte) 126).field_d << 16, this.field_t[var5_int].c((byte) 111).field_f << 16);
              this.field_t[var5_int].a(var6, 126);
            }
          }
          if (this.field_v) {
            this.m((byte) -24);
            this.d(true);
          } else {
            this.d(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("csa.<init>(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    void a(int param0, boolean param1) {
        this.field_j = this.field_j + param0;
        if (!param1) {
          this.field_w = (gpa) null;
        }
        this.field_p = this.field_p + param0;
    }

    public final boolean b(boolean param0) {
        if (!param0) {
          return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, g[] param3) {
        g var5 = null;
        if (param1 != 2097152) {
          field_g = -32;
        }
        if (param0 == param2) {
          return;
        }
        try {
          var5 = param3[param2];
          g var4 = var5;
          param3[param2] = param3[param0];
          param3[param0] = var5;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "csa.TA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(csa param0, int param1, byte param2) {
        try {
          this.field_q = param1;
          if (param2 != -52) {
            this.field_r = -73;
          }
          this.field_u = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "csa.OB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, uw param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.p((byte) -94)) {
            param1.a((byte) -116, this.t(8), (fo) (this));
          }
          if (param0 != -1704) {
            field_n = 90;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("csa.GB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final boolean j(int param0) {
        if (param0 != -1) {
          this.e((byte) 109);
          return false;
        }
        return false;
    }

    abstract boolean s(int param0);

    public final void m(int param0) {
        int var2 = -58 % ((param0 - 28) / 49);
        if (!this.s(-15254)) {
          return;
        }
        this.field_x = !this.field_x ? true : false;
    }

    public final void a(int param0, iq param1) {
        try {
          if (param0 <= 103) {
            this.field_r = -82;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "csa.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int g(byte param0) {
        if (param0 != 115) {
          return -84;
        }
        return 0;
    }

    void w(int param0) {
        if (param0 >= -122) {
          this.x(71);
        }
    }

    abstract boolean v(int param0);

    public final int c(byte param0) {
        if (param0 <= 91) {
          return -114;
        }
        return this.e(9648);
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          this.g(-122);
          return false;
        }
        return false;
    }

    public final gpa n(int param0) {
        if (param0 != 31974) {
          this.field_o = (la) null;
        }
        return this.field_w;
    }

    final int r(int param0) {
        if (param0 != 12) {
          return 114;
        }
        return this.field_m;
    }

    public final gpa i(byte param0) {
        if (param0 != 84) {
          return (gpa) null;
        }
        return this.field_s;
    }

    abstract boolean n(byte param0);

    public final lj a(int param0, int param1, boolean param2) {
        if (param0 != 28672) {
          this.c(false);
        }
        return (lj) ((Object) this.a(param1, param2, 20));
    }

    boolean a(int param0) {
        if (param0 != 6) {
          return false;
        }
        return this.s(-15254);
    }

    final static void a(int param0, kra param1) {
        try {
          nma.field_m = param1;
          if (param0 != 1048576) {
            csa.a(true);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "csa.QA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(boolean param0) {
        int var2 = 0;
        csa var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        this.field_f = hua.a((byte) 106, -this.g(-25787) >> 2);
        this.field_h = bua.a(0, -this.g(-25787) >> 2);
        for (var2 = 0; this.field_t.length > var2; var2++) {
          this.field_t[var2].a(this.field_f, this.field_h, (byte) 98);
          var3 = this.field_t[var2].a(-122);
          if (var3 != null) {
            var3.d(true);
          }
        }
        if (!param0) {
          this.field_t = (mka[]) null;
        }
    }

    private final boolean b(boolean param0, int param1) {
        if (!param0) {
          this.m(-109);
        }
        return this.field_z.a(param1, 14530);
    }

    public final int a(byte param0) {
        boolean discarded$0 = false;
        if (param0 != 55) {
          discarded$0 = this.p((byte) -128);
        }
        return this.field_k;
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 28 / ((-12 - param0) / 54);
        this.field_l = param1;
        this.field_k = param2;
    }

    final boolean k(byte param0) {
        if (param0 > -52) {
          return true;
        }
        if (this.field_o.w(0) == null) {
          return true;
        }
        return this.field_o.w(0).a(this, true, true);
    }

    public final int d(int param0) {
        int var3 = 0;
        int var4 = 0;
        if (param0 != 3) {
          this.n(107);
        }
        int var2 = this.field_j;
        if (null != this.field_u) {
          var3 = var2 >> 8;
          var4 = this.field_p >> 8;
          var2 = (this.field_u.field_h >> 8) * var3 - (this.field_u.field_f >> 8) * var4;
          var2 = var2 + this.field_u.d(3);
        }
        return var2;
    }

    public final int g(int param0) {
        if (param0 != -25787) {
          this.field_f = -1;
        }
        int var2 = this.field_r;
        if (null != this.field_u) {
          var2 = var2 + (this.field_u.g(-25787) + this.field_u.a(this.field_q, param0 ^ -17595).a(false));
        }
        return var2;
    }

    final csa o(byte param0) {
        boolean discarded$0 = false;
        if (param0 >= -17) {
          discarded$0 = this.p((byte) 101);
        }
        if (this.field_u != null) {
          return this.field_u.o((byte) -84);
        }
        return this;
    }

    public final int b(int param0) {
        int var2 = -69 % ((param0 - 1) / 45);
        return 0;
    }

    void a(boolean param0, kh param1) {
        kh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_13_2 = 0;
        kh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        csa var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_u == null) {
            param1.a((byte) -128, dqa.a(true, this.field_j / 1048576, 8), 8);
            param1.a((byte) -125, dqa.a(true, this.field_p / 1048576, 8), 8);
          }
          if (this.v(555277520)) {
            param1.a((byte) 80, this.field_l / 2097152, 6);
            param1.a((byte) -127, this.field_k / 2097152, 6);
          }
          if (this.n((byte) -122)) {
            param1.a((byte) 8, cn.a((byte) 103, this.field_r, 8192, 4), 4);
          }
          if (this.a(6)) {
            stackIn_12_0 = (kh) (param1);
            stackIn_12_1 = 116;
            if (this.field_x) {
              stackIn_13_2 = 1;
            } else {
              stackIn_13_2 = 0;
            }
            ((kh) (Object) stackIn_12_0).a((byte) stackIn_12_1, stackIn_13_2, 1);
          }
          this.field_z.a((byte) -97, param1);
          stackIn_16_0 = (kh) (param1);
          stackIn_16_1 = 79;
          if (!this.field_v) {
            stackIn_17_2 = 0;
          } else {
            stackIn_17_2 = 1;
          }
          ((kh) (Object) stackIn_16_0).a((byte) stackIn_16_1, stackIn_17_2, 1);
          var3_int = 0;
          if (param0) {
            return;
          }
          while (var3_int < this.field_t.length) {
            var4 = this.field_t[var3_int].a(86);
            if (var4 != null) {
              param1.a((byte) -42, 1, 1);
              vha.field_c.a(var4, -16097, param1);
            } else {
              param1.a((byte) -127, 0, 1);
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("csa.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    abstract int t(int param0);

    void q(byte param0) {
        if (param0 != -128) {
          this.d(false);
        }
    }

    abstract void a(boolean param0, boolean param1, la param2, int param3, int param4, int param5, fsa param6);

    csa(la param0, int param1) {
        this.field_t = new mka[]{};
        this.field_z = new bca();
        this.field_x = true;
        try {
          this.field_o = param0;
          this.field_m = param1;
          this.field_w = param0.d(-31957).a(-54, false);
          this.q((byte) -128);
          this.d(true);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "csa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_y = new su(2, 4, 4, 0);
        field_i = new int[1000];
    }
}

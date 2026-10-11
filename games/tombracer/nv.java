/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nv extends vg implements lj, fo, noa, gr {
    boolean field_f;
    static String field_h;
    fsa field_g;
    private gpa field_j;
    boolean field_k;
    private boolean field_i;
    private gpa field_l;
    private la field_m;

    final boolean d(int param0) {
        hca var2 = null;
        hca var2Lifetime1;
        if (param0 == 8031) {
          var2 = this.m((byte) 19);
          return io.a(var2.c(-47), this.field_g.e(9648), (byte) -57, var2.a((byte) 55), this.field_g.d(3), var2.e(9648), this.field_g.a((byte) 55), this.field_g.c(param0 ^ -8057), var2.d(3));
        }
        this.field_m = (la) null;
        var2Lifetime1 = this.m((byte) 19);
        return io.a(var2Lifetime1.c(-47), this.field_g.e(9648), (byte) -57, var2Lifetime1.a((byte) 55), this.field_g.d(3), var2Lifetime1.e(9648), this.field_g.a((byte) 55), this.field_g.c(param0 ^ -8057), var2Lifetime1.d(3));
    }

    int a(int param0, ep param1, up param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 25940) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          this.field_m = (la) null;
          return 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("nv.BC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    abstract int a(boolean param0);

    public final gpa i(byte param0) {
        if (param0 != 84) {
          return (gpa) null;
        }
        return this.field_l;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ffa param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 1) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("nv.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final gpa n(int param0) {
        if (param0 != 31974) {
          return (gpa) null;
        }
        return this.field_j;
    }

    public final fsa f(byte param0) {
        int var2 = 119 / ((-32 - param0) / 50);
        return this.field_g;
    }

    void a(ffa param0, byte param1, gma param2, int param3) {
        try {
          if (param1 < 18) {
            this.e(-16);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.SB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    void c(boolean param0) {
        if (param0) {
          return;
        }
        this.field_i = true;
    }

    void a(int param0, ui param1, boolean param2, ui param3) {
        try {
          if (param1 != null) {
            this.field_j = param1.a(84, param2);
          }
          if (param3 != null) {
            this.field_l = param3.a(-57, false);
          }
          int var5_int = -32 / ((param0 + 58) / 57);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.KB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final hca m(byte param0) {
        if (param0 == 19) {
          return this.field_g.H(param0 ^ -108);
        }
        this.field_g = (fsa) null;
        return this.field_g.H(param0 ^ -108);
    }

    int a(int param0, up param1, pc param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -85) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          this.d(-76);
          return 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("nv.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public void m(int param0) {
        int var2 = 98 % ((28 - param0) / 49);
        if (this.field_k) {
          return;
        }
        this.field_f = !this.field_f ? true : false;
    }

    public final boolean a(int param0) {
        if (param0 > -49) {
          return false;
        }
        return this.field_f;
    }

    public final ew h(byte param0) {
        if (param0 <= 105) {
          this.c(false);
          return (ew) ((Object) this.field_g.r(0));
        }
        return (ew) ((Object) this.field_g.r(0));
    }

    nv(la param0, kh param1, boolean param2) {
        this(param0, param2);
        try {
          this.field_f = param1.b((byte) 44, 1) == 1 ? true : false;
          if (param0.field_E >= 22) {
            this.field_k = param1.b((byte) 44, 1) == 1 ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final la b(boolean param0) {
        if (!param0) {
          this.a(-83, 93, false);
          return this.field_m;
        }
        return this.field_m;
    }

    public final int b(byte param0) {
        int var2 = 53 % ((param0 + 23) / 53);
        return this.field_g.d(3);
    }

    public static void j(int param0) {
        if (param0 != 18416) {
          return;
        }
        field_h = null;
    }

    void a(boolean param0, fsa param1) {
        try {
          if (!param0) {
            this.m(23);
          }
          this.field_g = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    int a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        if (param4 < 79) {
          field_h = (String) null;
          return 0;
        }
        return 0;
    }

    boolean a(int param0, int param1, pc param2, int param3) {
        RuntimeException var5 = null;
        fsa var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            var6 = (fsa) null;
            this.a(false, (fsa) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("nv.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    void g(int param0) {
        if (param0 != -2) {
          this.a(-30, -37);
        }
    }

    int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = 88 % ((param4 - 62) / 52);
          stackIn_1_0 = 0;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("nv.UB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final qea o(byte param0) {
        if (param0 != 46) {
          return (qea) null;
        }
        return this.field_g.y(1751085328);
    }

    public final boolean a(byte param0) {
        if (param0 != 87) {
          this.p((byte) -104);
          if (null != this.field_g) {
            return this.field_i ? true : false;
          }
          return true;
        }
        if (null == this.field_g) {
          return true;
        }
        if (!this.field_i) {
          return false;
        }
        return true;
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
          return false;
        }
        return this.field_i;
    }

    public final int c(byte param0) {
        if (param0 < 91) {
          this.n((byte) 65);
          return this.field_g.e(9648);
        }
        return this.field_g.e(9648);
    }

    void a(boolean param0, kh param1) {
        try {
          param1.a((byte) -127, this.a(param0), 6);
          param1.a((byte) -126, !this.field_f ? 0 : 1, 1);
          param1.a((byte) 112, !this.field_k ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void h(int param0) {
        if (param0 != 28701) {
          this.a(46);
        }
    }

    void b(int param0, iq param1) {
        try {
          if (param0 < 112) {
            this.n((byte) -120);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.NB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final dt i(int param0) {
        if (param0 != 12340) {
          return (dt) null;
        }
        return this.field_g.x(param0 + 3130);
    }

    final fsa e(int param0) {
        if (param0 == 6) {
          return this.field_g.r(param0 ^ 6);
        }
        iq var3 = (iq) null;
        this.a(-63, (iq) null);
        return this.field_g.r(param0 ^ 6);
    }

    public final int e(byte param0) {
        if (param0 > -86) {
          this.a((byte) -24, false);
          return this.field_g.g((byte) 115);
        }
        return this.field_g.g((byte) 115);
    }

    abstract int a(int param0, int param1);

    public final void f(int param0) {
        if (param0 != -4366) {
          up var3 = (up) null;
          this.a(18, -54, (up) null, 115, (byte) 119, -22);
        }
    }

    boolean p(byte param0) {
        if (param0 != 120) {
          gma var3 = (gma) null;
          this.a((ffa) null, (byte) -1, (gma) null, 16);
          return false;
        }
        return false;
    }

    abstract void k(int param0);

    lj a(int param0, int param1, boolean param2) {
        if (param0 != 0) {
          ui var5 = (ui) null;
          this.a(-91, (ui) null, true, (ui) null);
          if (vh.a(param1, param2, -27201, (lj) (this))) {
            return (lj) (this);
          }
          return null;
        }
        if (vh.a(param1, param2, -27201, (lj) (this))) {
          return (lj) (this);
        }
        return null;
    }

    public final void a(int param0, iq param1) {
        try {
          if (param0 < 103) {
            this.f((byte) -97);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        this.field_k = param1 ? true : false;
        if (param0 != -24) {
          this.field_m = (la) null;
        }
    }

    void n(byte param0) {
        if (param0 < 68) {
          this.field_f = true;
        }
    }

    nv(la param0, boolean param1) {
        this.field_f = true;
        this.field_i = false;
        this.field_k = false;
        try {
          this.field_m = param0;
          this.a(48, param0.e(-38), param1, (ui) null);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_h = "ON";
    }
}

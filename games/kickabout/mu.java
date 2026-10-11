/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mu extends cm {
    private int field_W;
    private ic field_X;
    private fd field_V;
    static String field_S;
    private int field_T;
    private pj field_ab;
    private int field_U;
    static hd field_Y;
    static int[] field_Q;
    private int field_Z;
    private int field_R;

    private final void b(fd param0, int param1) {
        try {
          if (null != this.field_ab) {
            this.field_ab.c((byte) -109);
          }
          if (param1 <= 50) {
            this.field_X = (ic) null;
          }
          if (param0 == null) {
            this.field_ab = new pj();
          } else {
            param0.a(param0.field_i, 1, 6, param0.field_n, this.field_R + 6);
            this.field_ab = new pj(param0);
          }
          this.a(-83, this.field_ab);
          this.field_V = null;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "mu.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void m(int param0) {
        if (null == this.field_X) {
          super.m(param0);
          return;
        }
        if (wn.field_b != this.field_X) {
          this.a((byte) 127, this.field_V.field_i + (this.field_R + 12), 12 + this.field_V.field_n);
          this.b(this.field_V, 54);
        } else {
          this.field_ab.field_F = 256;
          this.field_X = null;
          super.m(param0);
          return;
        }
        this.field_ab.field_F = 256;
        this.field_X = null;
        super.m(param0);
    }

    boolean a(char param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, (byte) -78, param2, param3)) {
            return true;
          }
          if (null != this.field_ab) {
            if (param3 == 98) {
              this.field_ab.a(param2, 0);
            }
            if (param3 == 99) {
              this.field_ab.a(param2, 0);
            }
          }
          if (param1 < -60) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("mu.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, qm param3, int param4, boolean param5) {
        if (!param5) {
          qm var7 = (qm) null;
          mu.a(-65, false, -66, (qm) null, -42, true);
        }
        if (param2 < 0 ||
          param2 >= sk.field_d.field_o) {
          return;
        }
        try {
          sk.field_d.a(param1, 1000000, param3, -9017, param2, param4, param0);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "mu.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void p(int param0) {
        field_Q = null;
        if (param0 != 12) {
          field_S = (String) null;
          field_S = null;
          field_Y = null;
          return;
        }
        field_S = null;
        field_Y = null;
    }

    void a(byte param0, fd param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_V = param1;
          if (param0 > -117) {
            this.field_R = 54;
          }
          if (bf.field_m == this.field_X) {
            this.a((byte) -23, this.field_U, this.field_V.field_i + (12 + this.field_R), this.field_V.field_n + 12);
            this.field_T = 0;
            return;
          }
          if (rv.field_e == this.field_X) {
            return;
          }
          this.field_X = rv.field_e;
          this.field_T = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("mu.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    mu(se param0, fd param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_n, param1.field_i + (12 + param2));
        try {
          this.field_U = param4;
          this.field_Z = param3;
          this.field_W = param3;
          this.field_R = param2;
          this.b(param1, 94);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "mu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 <= -11) {
          this.m(4000);
          return super.a(-13);
        }
        this.n(55);
        this.m(4000);
        return super.a(-13);
    }

    final void n(int param0) {
        if (rv.field_e == this.field_X) {
          return;
        }
        this.field_T = 0;
        this.field_X = wn.field_b;
        this.b(this.field_V, 99);
        if (param0 == 4096) {
          this.field_ab.field_F = 0;
          this.field_V = null;
          return;
        }
    }

    boolean k(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = Kickabout.field_G;
        if (param0 != -1) {
          this.field_W = -80;
          if (this.field_X == null) {
            return super.k(param0 + 0);
          }
          if (rv.field_e != this.field_X) {
            if (this.field_X != wn.field_b) {
              return super.k(param0 + 0);
            }
            fieldTemp$0 = this.field_T + 1;
            this.field_T = this.field_T + 1;
            if (fieldTemp$0 != this.field_Z) {
              this.field_ab.field_F = (this.field_T << 8) / this.field_Z;
              return super.k(param0 + 0);
            }
            this.field_X = null;
            this.field_ab.field_F = 256;
            return super.k(param0 + 0);
          }
          fieldTemp$1 = this.field_T + 1;
          this.field_T = this.field_T + 1;
          if (this.field_W != fieldTemp$1) {
            this.field_ab.field_F = -((this.field_T << 8) / this.field_W) + 256;
            return super.k(param0 + 0);
          }
          this.field_X = bf.field_m;
          this.a((byte) -104, this.field_U, this.field_R + (12 + this.field_V.field_i), 12 + this.field_V.field_n);
          this.field_ab.field_F = 0;
          this.field_T = 0;
          return super.k(param0 + 0);
        }
        if (this.field_X == null) {
          return super.k(param0 + 0);
        }
        if (rv.field_e != this.field_X) {
          if (this.field_X != wn.field_b) {
            return super.k(param0 + 0);
          }
          fieldTemp$2 = this.field_T + 1;
          this.field_T = this.field_T + 1;
          if (fieldTemp$2 != this.field_Z) {
            this.field_ab.field_F = (this.field_T << 8) / this.field_Z;
            return super.k(param0 + 0);
          }
          this.field_X = null;
          this.field_ab.field_F = 256;
          return super.k(param0 + 0);
        }
        int fieldTemp$3 = this.field_T + 1;
        this.field_T = this.field_T + 1;
        if (this.field_W != fieldTemp$3) {
          this.field_ab.field_F = -((this.field_T << 8) / this.field_W) + 256;
          return super.k(param0 + 0);
        }
        this.field_X = bf.field_m;
        this.a((byte) -104, this.field_U, this.field_R + (12 + this.field_V.field_i), 12 + this.field_V.field_n);
        this.field_ab.field_F = 0;
        this.field_T = 0;
        return super.k(param0 + 0);
    }

    final static boolean a(ml param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -39) {
            field_Q = (int[]) null;
          }
          stackIn_5_0 = (param0.l(1, param1 + 98) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("mu.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1, String param2, String param3, String param4, boolean param5, int param6) {
        ec var7 = null;
        RuntimeException var7_ref = null;
        ec var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new ec(param2);
          if (param0 != 12) {
            stackIn_2_0 = -64;
            return stackIn_2_0;
          }
          var8 = new ec(param4);
          stackIn_4_0 = m.a(param6, var8, var7, param1, param5, param3, false);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("mu.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_Q = new int[2];
        field_S = "HOME  <%0> - <%1>  AWAY";
    }
}

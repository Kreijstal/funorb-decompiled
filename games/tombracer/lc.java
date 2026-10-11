/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lc extends ofa {
    private sla field_M;
    static int[] field_N;
    private int field_R;
    private int field_O;
    private int field_Q;
    static String field_L;
    private rg field_P;
    private int field_S;
    private ae field_T;
    private int field_U;

    private final void a(boolean param0, ae param1) {
        RuntimeException var3 = null;
        ae var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_P) {
            this.field_P.p(83);
          }
          if (param1 == null) {
            this.field_P = new rg();
          } else {
            param1.a((byte) -31, param1.field_m, param1.field_p, 6, this.field_S + 6);
            this.field_P = new rg(param1);
          }
          this.a(this.field_P, -1);
          this.field_T = null;
          if (!param0) {
            return;
          }
          var4 = (ae) null;
          this.a('￁', (ae) null, 57, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("lc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void c(boolean param0) {
        if (this.field_M == null) {
          super.c(param0);
          return;
        }
        if (this.field_M != nr.field_a) {
          this.c(-11560, this.field_T.field_p + (this.field_S + 12), 12 + this.field_T.field_m);
          this.a(false, this.field_T);
        } else {
          this.field_P.field_y = 256;
          this.field_M = null;
          super.c(param0);
          return;
        }
        this.field_P.field_y = 256;
        this.field_M = null;
        super.c(param0);
    }

    void a(int param0, ae param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_T = param1;
          if (this.field_M != us.field_e) {
            if (bj.field_p != this.field_M) {
              this.field_M = bj.field_p;
              this.field_R = 0;
            }
          } else {
            this.a(this.field_Q, this.field_T.field_m + 12, this.field_T.field_p + this.field_S + 12, (byte) -105);
            this.field_R = 0;
          }
          if (param0 > 67) {
            return;
          }
          this.field_R = -128;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("lc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    boolean a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_M) {
          if (this.field_M == bj.field_p) {
            fieldTemp$0 = this.field_R + 1;
            this.field_R = this.field_R + 1;
            if (fieldTemp$0 != this.field_O) {
              this.field_P.field_y = 256 - (this.field_R << 8) / this.field_O;
              if (param0 <= 126) {
                this.field_T = (ae) null;
                return super.a(127);
              }
              return super.a(127);
            }
            this.field_M = us.field_e;
            this.a(this.field_Q, this.field_T.field_m + 12, this.field_T.field_p + (this.field_S + 12), (byte) -103);
            this.field_R = 0;
            this.field_P.field_y = 0;
            if (param0 <= 126) {
              this.field_T = (ae) null;
              return super.a(127);
            }
            return super.a(127);
          }
          if (nr.field_a != this.field_M) {
            if (param0 > 126) {
              return super.a(127);
            }
            this.field_T = (ae) null;
            return super.a(127);
          }
          fieldTemp$1 = this.field_R + 1;
          this.field_R = this.field_R + 1;
          if (this.field_U == fieldTemp$1) {
            this.field_M = null;
            this.field_P.field_y = 256;
            if (param0 > 126) {
              return super.a(127);
            }
            this.field_T = (ae) null;
            return super.a(127);
          }
          this.field_P.field_y = (this.field_R << 8) / this.field_U;
          if (param0 > 126) {
            return super.a(127);
          }
          this.field_T = (ae) null;
          return super.a(127);
        }
        if (param0 > 126) {
          return super.a(127);
        }
        this.field_T = (ae) null;
        return super.a(127);
    }

    public static void e(boolean param0) {
        field_N = null;
        if (param0) {
          lc.e(false);
          field_L = null;
          return;
        }
        field_L = null;
    }

    final void d(int param0) {
        if (this.field_M == bj.field_p) {
          return;
        }
        this.field_M = nr.field_a;
        if (param0 <= -20) {
          this.field_R = 0;
          this.a(false, this.field_T);
          this.field_P.field_y = 0;
          this.field_T = null;
          return;
        }
        this.field_R = 19;
        this.field_R = 0;
        this.a(false, this.field_T);
        this.field_P.field_y = 0;
        this.field_T = null;
    }

    boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (null == this.field_P) {
            return false;
          }
          if (param2 == 98) {
            this.field_P.a(param1, false);
          }
          if (param2 == 99) {
            this.field_P.a(param1, false);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("lc.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    lc(jta param0, ae param1, int param2, int param3, int param4) {
        super(param0, param1.field_m + 12, param1.field_p + param2 + 12);
        try {
          this.field_U = param3;
          this.field_O = param3;
          this.field_Q = param4;
          this.field_S = param2;
          this.a(false, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(byte param0) {
        if (param0 > -53) {
          return false;
        }
        this.c(true);
        return super.a((byte) -120);
    }

    static {
        field_N = new int[1];
        field_L = "Score";
    }
}

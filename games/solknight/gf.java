/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf extends ld {
    private int field_ab;
    private wh field_U;
    private int field_db;
    private int field_W;
    private rc field_S;
    private te field_V;
    static int field_T;
    private int field_eb;
    static ef field_Z;
    static String[] field_X;
    private int field_bb;
    static long field_Y;
    static o[] field_fb;
    static s field_cb;

    final boolean e(byte param0) {
        this.e(true);
        if (param0 != 124) {
          return true;
        }
        return super.e((byte) 124);
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, (byte) -117, param2, param3)) {
            return true;
          }
          if (null != this.field_V) {
            if (param2 == 98) {
              this.field_V.a(-1463, param3);
            }
            if (99 == param2) {
              this.field_V.a(-1463, param3);
            }
          }
          var5_int = 120 / ((param1 - 31) / 56);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("gf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    gf(i param0, rc param1, int param2, int param3, int param4) {
        super(param0, param1.field_t + 12, 12 + param2 + param1.field_x);
        try {
          this.field_eb = param2;
          this.field_W = param4;
          this.field_db = param3;
          this.field_ab = param3;
          this.b(param1, -16777);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "gf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void f(byte param0) {
        int var1 = -116 / ((-50 - param0) / 43);
        field_cb = null;
        field_X = null;
        field_Z = null;
        field_fb = null;
    }

    private final void b(rc param0, int param1) {
        if (this.field_V != null) {
          this.field_V.c(10);
        }
        if (param0 == null) {
          this.field_V = new te();
        } else {
          param0.b(param0.field_x, param0.field_t, 6, 0, this.field_eb + 6);
          this.field_V = new te(param0);
        }
        this.a(this.field_V, param1 + 22188);
        if (param1 != -16777) {
          return;
        }
        try {
          this.field_S = null;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "gf.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void e(boolean param0) {
        if (this.field_U == null) {
          super.e(param0);
          return;
        }
        if (this.field_U != oa.field_j) {
          this.b(this.field_S.field_t + 12, -2038584927, this.field_eb + 12 + this.field_S.field_x);
          this.b(this.field_S, -16777);
        } else {
          this.field_V.field_H = 256;
          this.field_U = null;
          super.e(param0);
          return;
        }
        this.field_V.field_H = 256;
        this.field_U = null;
        super.e(param0);
    }

    void c(int param0, rc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -3399) {
            field_T = -28;
          }
          this.field_S = param1;
          if (kc.field_I == this.field_U) {
            this.b(this.field_S.field_x + 12 + this.field_eb, 0, this.field_W, this.field_S.field_t + 12);
            this.field_bb = 0;
            return;
          }
          if (this.field_U == ah.field_j) {
            return;
          }
          this.field_U = ah.field_j;
          this.field_bb = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gf.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void l(int param0) {
        if (ah.field_j == this.field_U) {
          return;
        }
        if (param0 == 7107) {
          this.field_U = oa.field_j;
          this.field_bb = 0;
          this.b(this.field_S, param0 ^ -23116);
          this.field_V.field_H = 0;
          this.field_S = null;
          return;
        }
    }

    boolean h(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = SolKnight.field_L ? 1 : 0;
        if (param0 != 1784) {
          rc var4 = (rc) null;
          this.a('ﾴ', (byte) -22, -26, (rc) null);
          if (this.field_U == null) {
            return super.h(param0 + 0);
          }
          if (this.field_U != ah.field_j) {
            if (this.field_U != oa.field_j) {
              return super.h(param0 + 0);
            }
            fieldTemp$0 = this.field_bb + 1;
            this.field_bb = this.field_bb + 1;
            if (fieldTemp$0 == this.field_db) {
              this.field_U = null;
              this.field_V.field_H = 256;
              return super.h(param0 + 0);
            }
            this.field_V.field_H = (this.field_bb << 8) / this.field_db;
            return super.h(param0 + 0);
          }
          fieldTemp$1 = this.field_bb + 1;
          this.field_bb = this.field_bb + 1;
          if (this.field_ab != fieldTemp$1) {
            this.field_V.field_H = -((this.field_bb << 8) / this.field_ab) + 256;
            return super.h(param0 + 0);
          }
          this.field_U = kc.field_I;
          this.b(this.field_S.field_x + 12 + this.field_eb, 0, this.field_W, this.field_S.field_t + 12);
          this.field_bb = 0;
          this.field_V.field_H = 0;
          return super.h(param0 + 0);
        }
        if (this.field_U == null) {
          return super.h(param0 + 0);
        }
        if (this.field_U != ah.field_j) {
          if (this.field_U != oa.field_j) {
            return super.h(param0 + 0);
          }
          fieldTemp$2 = this.field_bb + 1;
          this.field_bb = this.field_bb + 1;
          if (fieldTemp$2 == this.field_db) {
            this.field_U = null;
            this.field_V.field_H = 256;
            return super.h(param0 + 0);
          }
          this.field_V.field_H = (this.field_bb << 8) / this.field_db;
          return super.h(param0 + 0);
        }
        int fieldTemp$3 = this.field_bb + 1;
        this.field_bb = this.field_bb + 1;
        if (this.field_ab != fieldTemp$3) {
          this.field_V.field_H = -((this.field_bb << 8) / this.field_ab) + 256;
          return super.h(param0 + 0);
        }
        this.field_U = kc.field_I;
        this.b(this.field_S.field_x + 12 + this.field_eb, 0, this.field_W, this.field_S.field_t + 12);
        this.field_bb = 0;
        this.field_V.field_H = 0;
        return super.h(param0 + 0);
    }

    static {
        field_Z = new ef();
        field_X = new String[]{"All scores", "My scores", "Best each"};
    }
}

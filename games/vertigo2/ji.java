/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ji extends li {
    boolean field_o;
    int field_t;
    static String field_q;
    static cr field_s;
    static aa field_n;
    static fe field_p;
    kk field_v;
    static char field_r;
    aq field_x;
    ji[] field_u;
    static String field_w;

    void a(int param0) {
        if (param0 >= -98) {
            ji.a(false);
        }
    }

    final int[][] c(int param0, int param1, int param2) {
        int[] var4;
        int[][] var5;
        int[] var6;
        if (param1 == 3) {
          if (this.field_u[param0].field_o) {
            var6 = this.field_u[param0].c(param2, param1 ^ 110);
            var4 = var6;
            var5 = new int[3][];
            var5[1] = var6;
            var5[2] = var6;
            var5[0] = var6;
            return var5;
          } else {
            return this.field_u[param0].b(-3780, param2);
          }
        } else {
          return (int[][]) null;
        }
    }

    int e(int param0) {
        if (param0 != 6557) {
            this.c(-13, -120);
            return -1;
        }
        return -1;
    }

    void f(int param0) {
        if (!this.field_o) {
          this.field_v.b(32764);
          this.field_v = null;
          if (param0 == 2) {
            return;
          } else {
            this.b(109, -49);
            return;
          }
        } else {
          this.field_x.a(false);
          this.field_x = null;
          if (param0 == 2) {
            return;
          } else {
            this.b(109, -49);
            return;
          }
        }
    }

    int[] c(int param0, int param1) {
        if (param1 <= 91) {
            return (int[]) null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_w = null;
        field_n = null;
        field_s = null;
        field_p = null;
        field_q = null;
    }

    final int[] a(int param0, int param1, int param2) {
        if (param1 == -1) {
          if (this.field_u[param0].field_o) {
            return this.field_u[param0].c(param2, 102);
          } else {
            return this.field_u[param0].b(param1 + -3779, param2)[0];
          }
        } else {
          this.field_o = false;
          if (this.field_u[param0].field_o) {
            return this.field_u[param0].c(param2, 102);
          } else {
            return this.field_u[param0].b(param1 + -3779, param2)[0];
          }
        }
    }

    int[][] b(int param0, int param1) {
        if (param0 != -3780) {
            return (int[][]) null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    int a(byte param0) {
        if (param0 != -117) {
            this.a(-71);
            return -1;
        }
        return -1;
    }

    void b(int param0, int param1, int param2) {
        int var4;
        int stackIn_3_0 = 0;
        L0: {
          if (param2 == this.field_t) {
            stackIn_3_0 = param0;
            break L0;
          } else {
            stackIn_3_0 = this.field_t;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (this.field_o) {
          this.field_x = new aq(var4, param0, param1);
          return;
        } else {
          this.field_v = new kk(var4, param0, param1);
          return;
        }
    }

    ji(int param0, boolean param1) {
        this.field_u = new ji[param0];
        this.field_o = param1 ? true : false;
    }

    void a(byte param0, int param1, ed param2) {
        try {
            if (param0 != 110) {
                this.field_t = 59;
            }
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ji.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = "Private";
        field_w = "<col=ee9d32>How to play Vertigo 2</col>";
    }
}

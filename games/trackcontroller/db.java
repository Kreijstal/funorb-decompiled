/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class db extends wd {
    private int field_U;
    static int field_X;
    private jb field_ab;
    private gl field_cb;
    private al field_V;
    private int field_T;
    static volatile int field_bb;
    private int field_S;
    private int field_Y;
    private int field_W;
    static int field_db;
    static int field_Z;

    final boolean k(int param0) {
        this.o(param0);
        return super.k(0);
    }

    final void o(int param0) {
        if (null == this.field_ab) {
          super.o(param0 + param0);
          return;
        }
        if (uj.field_b != this.field_ab) {
          this.a(this.field_V.field_x + 12, (byte) -86, 12 - (-this.field_W - this.field_V.field_u));
          this.b((byte) 19, this.field_V);
        } else {
          this.field_ab = null;
          this.field_cb.field_H = 256;
          super.o(param0 + param0);
          return;
        }
        this.field_ab = null;
        this.field_cb.field_H = 256;
        super.o(param0 + param0);
    }

    db(vl param0, al param1, int param2, int param3, int param4) {
        super(param0, param1.field_x + 12, param1.field_u + 12 + param2);
        try {
          this.field_T = param3;
          this.field_Y = param3;
          this.field_W = param2;
          this.field_S = param4;
          this.b((byte) 19, param1);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    void b(al param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_V = param0;
          if (dc.field_w != this.field_ab) {
            if (wi.field_c != this.field_ab) {
              this.field_ab = wi.field_c;
              this.field_U = 0;
            }
          } else {
            this.a(this.field_V.field_x + 12, this.field_S, false, this.field_W + 12 + this.field_V.field_u);
            this.field_U = 0;
          }
          if (param1 <= -61) {
            return;
          }
          this.field_T = 115;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("db.O(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(byte param0, al param1) {
        try {
          if (param0 != 19) {
            al var4 = (al) null;
            this.b((byte) 30, (al) null);
          }
          if (null != this.field_cb) {
            this.field_cb.a(-84);
          }
          if (param1 == null) {
            this.field_cb = new gl();
          } else {
            param1.a(param1.field_u, -3050, 6 + this.field_W, param1.field_x, 6);
            this.field_cb = new gl(param1);
          }
          this.a(false, this.field_cb);
          this.field_V = null;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "db.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    boolean j(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        qj var4 = null;
        int var3 = TrackController.field_F ? 1 : 0;
        qj var4Lifetime1;
        qj var4Lifetime2;
        qj var4Lifetime3;
        qj var4Lifetime1Lifetime1;
        qj var4Lifetime2Lifetime1;
        if (null == this.field_ab) {
          if (param0 > -18) {
            var4 = (qj) null;
            db.a(99, 48, (qj) null, -61, 106, (byte) 90);
            return super.j(-94);
          }
          return super.j(-94);
        }
        if (wi.field_c == this.field_ab) {
          fieldTemp$0 = this.field_U + 1;
          this.field_U = this.field_U + 1;
          if (this.field_Y != fieldTemp$0) {
            this.field_cb.field_H = -((this.field_U << 8) / this.field_Y) + 256;
            if (param0 > -18) {
              var4Lifetime1 = (qj) null;
              db.a(99, 48, (qj) null, -61, 106, (byte) 90);
              return super.j(-94);
            }
            return super.j(-94);
          }
          this.field_ab = dc.field_w;
          this.a(this.field_V.field_x + 12, this.field_S, false, this.field_V.field_u + 12 + this.field_W);
          this.field_cb.field_H = 0;
          this.field_U = 0;
          if (param0 <= -18) {
            return super.j(-94);
          }
          var4Lifetime1Lifetime1 = (qj) null;
          db.a(99, 48, (qj) null, -61, 106, (byte) 90);
          return super.j(-94);
        }
        if (uj.field_b == this.field_ab) {
          fieldTemp$1 = this.field_U + 1;
          this.field_U = this.field_U + 1;
          if (fieldTemp$1 == this.field_T) {
            this.field_cb.field_H = 256;
            this.field_ab = null;
            if (param0 <= -18) {
              return super.j(-94);
            }
            var4Lifetime2 = (qj) null;
            db.a(99, 48, (qj) null, -61, 106, (byte) 90);
            return super.j(-94);
          }
          this.field_cb.field_H = (this.field_U << 8) / this.field_T;
          if (param0 <= -18) {
            return super.j(-94);
          }
          var4Lifetime2Lifetime1 = (qj) null;
          db.a(99, 48, (qj) null, -61, 106, (byte) 90);
          return super.j(-94);
        }
        if (param0 <= -18) {
          return super.j(-94);
        }
        var4Lifetime3 = (qj) null;
        db.a(99, 48, (qj) null, -61, 106, (byte) 90);
        return super.j(-94);
    }

    final void a(byte param0) {
        if (wi.field_c == this.field_ab) {
          return;
        }
        this.field_U = 0;
        this.field_ab = uj.field_b;
        this.b((byte) 19, this.field_V);
        this.field_V = null;
        if (param0 == -48) {
          this.field_cb.field_H = 0;
          return;
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
          field_Z = -47;
          ob.a(209, gd.b((byte) 77));
          return;
        }
        ob.a(209, gd.b((byte) 77));
    }

    boolean a(byte param0, char param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a((byte) -76, param1, param2, param3)) {
            return true;
          }
          var5_int = -125 % ((param0 - 17) / 51);
          if (this.field_cb == null) {
            return false;
          }
          if (98 == param3) {
            this.field_cb.a((byte) -126, param2);
          }
          if (param3 == 99) {
            this.field_cb.a((byte) -125, param2);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("db.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, qj param2, int param3, int param4, byte param5) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          var6_int = 0;
          var7 = 0;
          if (param4 < ll.field_a) {
            var7 = ll.field_a - param4;
            param4 = ll.field_a;
            param3 = param3 - var7;
            var7 = var7 % param2.field_t;
            var6_int = var6_int + var7;
          }
          var8 = 0;
          if (param1 < ll.field_b) {
            var8 = -param1 + ll.field_b;
            param1 = ll.field_b;
            param0 = param0 - var8;
            var8 = var8 % param2.field_q;
            var6_int = var6_int + param2.field_t * var8;
          }
          if (ll.field_e < param4 + param3) {
            param3 = -param4 + ll.field_e;
          }
          if (param1 + param0 > ll.field_g) {
            param0 = -param1 + ll.field_g;
          }
          if (param3 > 0 &&
            param0 > 0) {
            var9 = param1 * ll.field_d + param4;
            ra.a(var9, param2.field_t, param0, var8, (byte) -64, ll.field_i, param3, param2.field_z, -param3 + ll.field_d, var7, var6_int, param2.field_q);
            var10 = 77 / ((param5 - 56) / 53);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("db.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_X = 0;
        field_bb = 0;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wo extends ah {
    static dn field_xb;
    static boolean field_wb;
    static int[] field_zb;
    boolean field_Ab;
    static ln field_yb;

    void a(wk param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ZombieDawn.field_J;
        try {
          bi.d(param0.a(this.a(true), (byte) -74), param0.a(this.f(param1 ^ 237235572), 0), this.field_pb, 16711680);
          if (param1 != 5060) {
            field_xb = (dn) null;
          }
          for (var3_int = 0; this.field_ub > var3_int; var3_int++) {
            var4 = param0.a(this.field_jb[var3_int], (byte) -59);
            var5 = param0.a(this.field_gb[var3_int], 0);
            bi.b(-1 + var4, var5 - 1, 3, 3, 0);
            bi.a(var4, var5, 65280);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wo.L(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static em v(int param0) {
        if (param0 == 6130) {
          return new em(0, 0, se.field_j.field_p, 0, (io) null, se.field_j.field_s, se.field_j.field_m, se.field_j.field_p, se.field_j.field_p, se.field_j.field_o, se.field_j.field_f, false, true, 32768, 0);
        }
        return (em) null;
    }

    void l(byte param0) {
        int stackIn_2_0 = 0;
        int stackIn_3_1 = 0;
        int var2;
        int var3;
        int var4;
        wk var5;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        var4 = ZombieDawn.field_J;
        stackIn_2_0 = 250;
        stackIn_3_1 = (!this.field_Ab) ? 1 : 2;
        var2 = stackIn_2_0 * stackIn_3_1;
        if (param0 != 52) {
          var5 = (wk) null;
          this.a((wk) null, 77);
          this.field_pb = var2;
          if (0 != this.field_F) {
            var3 = 0;
            if (!this.a(-86, var2, this.field_Ab)) {
              this.field_Ab = false;
              if (3 == this.field_F) {
                this.e(0, -6904);
              }
            } else {
              if (!this.p(-125)) {
                if (this.field_Ab) {
                  this.field_Ab = false;
                } else {
                  if (this.field_F != 3) {
                    this.e(3, -6904);
                  }
                }
              } else {
                if (var3 != 0) {
                  this.field_U = dc.a((byte) 18, this.field_db);
                }
                this.field_Ab = true;
              }
            }
            return;
          }
          if (this.field_Ab) {
            var3Lifetime3 = 0;
            if (!this.a(-86, var2, this.field_Ab)) {
              this.field_Ab = false;
              if (3 == this.field_F) {
                this.e(0, -6904);
              }
            } else {
              if (!this.p(-125)) {
                if (this.field_Ab) {
                  this.field_Ab = false;
                } else {
                  if (this.field_F != 3) {
                    this.e(3, -6904);
                  }
                }
              } else {
                if (var3Lifetime3 != 0) {
                  this.field_U = dc.a((byte) 18, this.field_db);
                }
                this.field_Ab = true;
              }
            }
            return;
          }
          var3Lifetime4 = 1;
          if (!this.a(-86, var2, this.field_Ab)) {
            this.field_Ab = false;
            if (3 != this.field_F) {
              return;
            }
            this.e(0, -6904);
            return;
          }
          if (this.p(-125)) {
            if (var3Lifetime4 != 0) {
              this.field_U = dc.a((byte) 18, this.field_db);
            }
            this.field_Ab = true;
            return;
          }
          if (this.field_Ab) {
            this.field_Ab = false;
            return;
          }
          if (this.field_F == 3) {
            return;
          }
          this.e(3, -6904);
          return;
        }
        this.field_pb = var2;
        if (0 == this.field_F &&
          !this.field_Ab) {
          var3Lifetime1 = 1;
          if (!this.a(-86, var2, this.field_Ab)) {
            this.field_Ab = false;
            if (3 != this.field_F) {
              return;
            }
            this.e(0, -6904);
            return;
          }
          if (this.p(-125)) {
            if (var3Lifetime1 != 0) {
              this.field_U = dc.a((byte) 18, this.field_db);
            }
            this.field_Ab = true;
            return;
          }
          if (this.field_Ab) {
            this.field_Ab = false;
            return;
          }
          if (this.field_F == 3) {
            return;
          }
          this.e(3, -6904);
          return;
        }
        var3Lifetime2 = 0;
        if (!this.a(-86, var2, this.field_Ab)) {
          this.field_Ab = false;
          if (3 != this.field_F) {
            return;
          }
          this.e(0, -6904);
          return;
        }
        if (this.p(-125)) {
          if (var3Lifetime2 != 0) {
            this.field_U = dc.a((byte) 18, this.field_db);
          }
          this.field_Ab = true;
          return;
        }
        if (this.field_Ab) {
          this.field_Ab = false;
          return;
        }
        if (this.field_F == 3) {
          return;
        }
        this.e(3, -6904);
    }

    wo(int param0, int param1, int param2) {
        super(param0, param1, param2, 200704);
        this.field_Ab = false;
        if (this.field_t == 2 ||
          4 == this.field_t ||
          this.field_t == 6) {
          this.field_D = 143360;
          this.field_ub = 21;
        }
    }

    public static void w(int param0) {
        field_yb = null;
        field_zb = null;
        field_xb = null;
        if (param0 <= 34) {
          field_zb = (int[]) null;
        }
    }

    static {
        field_wb = false;
        field_zb = new int[8192];
    }
}

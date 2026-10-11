/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq extends cj {
    hi field_Ib;
    static String field_Fb;
    cj field_Gb;
    static String field_Hb;
    cj field_Jb;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    private final void a(int param0, int param1, int param2) {
        this.field_Jb.field_zb = -param1 + (this.field_zb - param2);
        this.field_Gb.field_x = param0;
        this.field_Jb.field_z = this.field_z;
        this.field_Gb.field_zb = -param2 - param1 + this.field_zb;
        this.field_Ib.a(this.field_Gb.field_z, 0, this.field_Jb.field_z, this.field_z, -1, -this.field_Gb.field_Q, param1, -param1 + this.field_zb);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param5 == -31465) {
          this.field_x = param3;
          this.field_Q = param6;
          this.field_z = param4;
          this.field_zb = param2;
          this.a(0, param0, param1);
          return;
        }
        this.a(67, 91, -23, -43, 80, -90, 37);
        this.field_x = param3;
        this.field_Q = param6;
        this.field_z = param4;
        this.field_zb = param2;
        this.a(0, param0, param1);
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var8 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        if (!param0) {
          if (!this.field_L) {
            var8 = 0;
            this.field_Gb.a((byte) 109, this.field_Jb.field_z, param1, var8 != 0);
            this.a(param3, param4 + 4719, param2, false, param6);
            if (param4 == -4719) {
              return var8 != 0;
            }
            return true;
          }
          if (param5) {
            var8Lifetime2 = 0;
            this.field_Gb.a((byte) 109, this.field_Jb.field_z, param1, var8Lifetime2 != 0);
            this.a(param3, param4 + 4719, param2, false, param6);
            if (param4 == -4719) {
              return var8Lifetime2 != 0;
            }
            return true;
          }
          var8Lifetime3 = 1;
          this.field_Gb.a((byte) 109, this.field_Jb.field_z, param1, var8Lifetime3 != 0);
          this.a(param3, param4 + 4719, param2, false, param6);
          if (param4 == -4719) {
            return var8Lifetime3 != 0;
          }
          return true;
        }
        var8Lifetime1 = 1;
        this.field_Gb.a((byte) 109, this.field_Jb.field_z, param1, var8Lifetime1 != 0);
        this.a(param3, param4 + 4719, param2, false, param6);
        if (param4 == -4719) {
          return var8Lifetime1 != 0;
        }
        return true;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.a(param2, 0, this.field_Jb.field_z, param3, param0);
        if (param1 < 104) {
          field_Hb = (String) null;
        }
    }

    public static void h(int param0) {
        field_Fb = null;
        if (param0 != 0) {
          tq.h(58);
          field_Hb = null;
          return;
        }
        field_Hb = null;
    }

    final boolean a(int param0, boolean param1, int param2, boolean param3, int param4, int param5) {
        if (param5 < -22) {
          return this.a(param3, param0, this.field_Jb.field_z, param2, -4719, param1, param4);
        }
        boolean discarded$0 = this.a(false, -109, -80, -22, -26, true, -105);
        return this.a(param3, param0, this.field_Jb.field_z, param2, -4719, param1, param4);
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4) {
        if (this.field_Ib.d(false)) {
          this.field_Gb.field_mb = this.field_Gb.field_mb + param0;
        }
        if (this.field_Ib.e((byte) -37)) {
          this.field_Gb.field_mb = this.field_Gb.field_mb - param0;
        }
        if (this.field_Ib.d((byte) 37)) {
          this.field_Gb.field_mb = this.field_Gb.field_mb + param2;
          if (this.field_Ib.i(param1 - 1)) {
            this.field_Gb.field_mb = this.field_Gb.field_mb - param2;
          }
          if (this.field_L) {
            this.field_Gb.field_mb = this.field_Gb.field_mb - param4;
          }
          if (param3) {
            if (-(this.field_Gb.field_mb + this.field_Gb.field_Q) < 0) {
              this.field_Gb.field_mb = -this.field_Gb.field_Q;
            }
            if (-(this.field_Gb.field_mb + this.field_Gb.field_Q) > -this.field_Jb.field_z + (this.field_Gb.field_I + this.field_Gb.field_z)) {
              this.field_Gb.field_mb = -(this.field_Gb.field_z + this.field_Gb.field_I - this.field_Jb.field_z) - this.field_Gb.field_Q;
            }
          } else {
            if (-this.field_Jb.field_z + this.field_Gb.field_z + this.field_Gb.field_I < -(this.field_Gb.field_Q + this.field_Gb.field_mb)) {
              this.field_Gb.field_mb = -(-this.field_Jb.field_z + this.field_Gb.field_I + this.field_Gb.field_z) - this.field_Gb.field_Q;
            }
            if (-(this.field_Gb.field_mb + this.field_Gb.field_Q) < 0) {
              this.field_Gb.field_mb = -this.field_Gb.field_Q;
            }
          }
        } else {
          if (this.field_Ib.i(param1 - 1)) {
            this.field_Gb.field_mb = this.field_Gb.field_mb - param2;
          }
          if (this.field_L) {
            this.field_Gb.field_mb = this.field_Gb.field_mb - param4;
          }
          if (!param3) {
            if (-this.field_Jb.field_z + this.field_Gb.field_z + this.field_Gb.field_I < -(this.field_Gb.field_Q + this.field_Gb.field_mb)) {
              this.field_Gb.field_mb = -(-this.field_Jb.field_z + this.field_Gb.field_I + this.field_Gb.field_z) - this.field_Gb.field_Q;
            }
            if (-(this.field_Gb.field_mb + this.field_Gb.field_Q) < 0) {
              this.field_Gb.field_mb = -this.field_Gb.field_Q;
            }
          } else {
            if (-(this.field_Gb.field_mb + this.field_Gb.field_Q) < 0) {
              this.field_Gb.field_mb = -this.field_Gb.field_Q;
            }
            if (-(this.field_Gb.field_mb + this.field_Gb.field_Q) > -this.field_Jb.field_z + (this.field_Gb.field_I + this.field_Gb.field_z)) {
              this.field_Gb.field_mb = -(this.field_Gb.field_z + this.field_Gb.field_I - this.field_Jb.field_z) - this.field_Gb.field_Q;
            }
          }
        }
        if (param1 != 0) {
          return;
        }
        if (this.field_Ib.j(120)) {
          this.field_Gb.field_Q = -this.field_Ib.a(param3, (byte) -66, this.field_Jb.field_z, this.field_Gb.field_z);
          this.field_Gb.field_mb = 0;
        }
        this.field_Ib.a(this.field_Gb.field_z, -this.field_Gb.field_Q, (byte) 124, this.field_Jb.field_z);
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    tq(long param0, cj param1, cj param2, hi param3) {
        super(param0, (cj) null);
        try {
          this.field_Jb = new cj(0L, param2);
          this.field_Ib = new hi(0L, param3);
          this.a((byte) 50, this.field_Jb);
          this.a((byte) 50, this.field_Ib);
          this.field_Gb = param1;
          this.field_Jb.a((byte) 50, param1);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "tq.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Hb = "This password is part of your Player Name, and would be easy to guess";
        field_Fb = "<%0> has declined the invitation.";
    }
}

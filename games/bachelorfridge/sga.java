/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sga extends sna {
    sna field_wb;
    sna field_vb;
    cw field_xb;

    private final void a(int param0, int param1, int param2) {
        this.field_wb.field_p = this.field_p;
        this.field_vb.field_kb = 0;
        this.field_wb.field_sb = this.field_sb - param2 - param1;
        this.field_vb.field_sb = -param2 + this.field_sb - param1;
        this.field_xb.a(param2, -this.field_vb.field_rb, this.field_sb - param2, this.field_wb.field_p, 0, false, this.field_vb.field_p, this.field_p);
        if (param0 >= -117) {
          this.field_vb = (sna) null;
        }
    }

    sga(long param0, sna param1, sna param2, cw param3) {
        super(param0, (sna) null);
        try {
          this.field_wb = new sna(0L, param2);
          this.field_xb = new cw(0L, param3);
          this.a(-1, this.field_wb);
          this.a(-1, this.field_xb);
          this.field_vb = param1;
          this.field_wb.a(-1, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "sga.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, boolean param3, int param4) {
        int var6;
        int var6Lifetime1;
        if (this.field_xb.b(true)) {
          this.field_vb.field_I = this.field_vb.field_I + param4;
          if (this.field_xb.f((byte) 62)) {
            this.field_vb.field_I = this.field_vb.field_I - param4;
          }
          if (this.field_xb.g(0)) {
            this.field_vb.field_I = this.field_vb.field_I + param2;
          }
          if (this.field_xb.i(115)) {
            this.field_vb.field_I = this.field_vb.field_I - param2;
          }
          if (this.field_T) {
            this.field_vb.field_I = this.field_vb.field_I - param1;
          }
          if (param3) {
            if (0 > -(this.field_vb.field_rb + this.field_vb.field_I)) {
              this.field_vb.field_I = -this.field_vb.field_rb;
            }
            if (this.field_vb.field_p - (-this.field_vb.field_hb + this.field_wb.field_p) < -(this.field_vb.field_rb + this.field_vb.field_I)) {
              this.field_vb.field_I = -this.field_vb.field_rb - (this.field_vb.field_hb + (this.field_vb.field_p - this.field_wb.field_p));
            }
          } else {
            if (-(this.field_vb.field_I + this.field_vb.field_rb) > this.field_vb.field_hb + this.field_vb.field_p - this.field_wb.field_p) {
              this.field_vb.field_I = -this.field_vb.field_rb - (this.field_vb.field_hb + this.field_vb.field_p - this.field_wb.field_p);
            }
            if (-(this.field_vb.field_rb + this.field_vb.field_I) < 0) {
              this.field_vb.field_I = -this.field_vb.field_rb;
            }
          }
        } else {
          if (this.field_xb.f((byte) 62)) {
            this.field_vb.field_I = this.field_vb.field_I - param4;
          }
          if (this.field_xb.g(0)) {
            this.field_vb.field_I = this.field_vb.field_I + param2;
          }
          if (this.field_xb.i(115)) {
            this.field_vb.field_I = this.field_vb.field_I - param2;
          }
          if (this.field_T) {
            this.field_vb.field_I = this.field_vb.field_I - param1;
            if (!param3) {
              if (-(this.field_vb.field_I + this.field_vb.field_rb) > this.field_vb.field_hb + this.field_vb.field_p - this.field_wb.field_p) {
                this.field_vb.field_I = -this.field_vb.field_rb - (this.field_vb.field_hb + this.field_vb.field_p - this.field_wb.field_p);
              }
              if (-(this.field_vb.field_rb + this.field_vb.field_I) < 0) {
                this.field_vb.field_I = -this.field_vb.field_rb;
              }
            } else {
              if (0 > -(this.field_vb.field_rb + this.field_vb.field_I)) {
                this.field_vb.field_I = -this.field_vb.field_rb;
              }
              if (this.field_vb.field_p - (-this.field_vb.field_hb + this.field_wb.field_p) < -(this.field_vb.field_rb + this.field_vb.field_I)) {
                this.field_vb.field_I = -this.field_vb.field_rb - (this.field_vb.field_hb + (this.field_vb.field_p - this.field_wb.field_p));
              }
            }
          } else {
            boolean decompiledFrameRemainder0 = true;
            if (!param3) {
              if (-(this.field_vb.field_I + this.field_vb.field_rb) > this.field_vb.field_hb + this.field_vb.field_p - this.field_wb.field_p) {
                this.field_vb.field_I = -this.field_vb.field_rb - (this.field_vb.field_hb + this.field_vb.field_p - this.field_wb.field_p);
              }
              if (-(this.field_vb.field_rb + this.field_vb.field_I) < 0) {
                this.field_vb.field_I = -this.field_vb.field_rb;
              }
            } else {
              if ((0 <= -(this.field_vb.field_rb + this.field_vb.field_I)) &&
                (decompiledFrameRemainder0 = !(this.field_vb.field_p - (-this.field_vb.field_hb + this.field_wb.field_p) >= -(this.field_vb.field_rb + this.field_vb.field_I)))) {
                this.field_vb.field_I = -this.field_vb.field_rb - (this.field_vb.field_hb + (this.field_vb.field_p - this.field_wb.field_p));
                if (this.field_xb.f(56)) {
                  this.field_vb.field_rb = -this.field_xb.a(7409, param3, this.field_vb.field_p, this.field_wb.field_p);
                  this.field_vb.field_I = 0;
                }
                var6 = 5 % ((61 - param0) / 59);
                this.field_xb.a((byte) 29, -this.field_vb.field_rb, this.field_wb.field_p, this.field_vb.field_p);
                return;
              }
              if (decompiledFrameRemainder0) {
                this.field_vb.field_I = -this.field_vb.field_rb;
                if (this.field_vb.field_p - (-this.field_vb.field_hb + this.field_wb.field_p) < -(this.field_vb.field_rb + this.field_vb.field_I)) {
                  this.field_vb.field_I = -this.field_vb.field_rb - (this.field_vb.field_hb + (this.field_vb.field_p - this.field_wb.field_p));
                }
              }
            }
          }
        }
        if (this.field_xb.f(56)) {
          this.field_vb.field_rb = -this.field_xb.a(7409, param3, this.field_vb.field_p, this.field_wb.field_p);
          this.field_vb.field_I = 0;
        }
        var6Lifetime1 = 5 % ((61 - param0) / 59);
        this.field_xb.a((byte) 29, -this.field_vb.field_rb, this.field_wb.field_p, this.field_vb.field_p);
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_sb = param4;
        this.field_rb = param3;
        this.field_kb = param2;
        if (param0 == -58) {
          this.field_p = param1;
          this.a(-121, param6, param5);
          return;
        }
    }

    private final boolean a(int param0, int param1, int param2, byte param3, int param4, boolean param5, boolean param6) {
        int var8 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var8Lifetime6;
        int var8Lifetime7;
        if (param3 <= 18) {
          this.a(69, -104, -15, false, false, true);
          if (param5) {
            var8 = 1;
            this.field_vb.a(-24380, this.field_wb.field_p, var8 != 0, param1);
            this.a((byte) -89, param0, param2, false, param4);
            return var8 != 0;
          }
          if (!this.field_T) {
            var8Lifetime5 = 0;
            this.field_vb.a(-24380, this.field_wb.field_p, var8Lifetime5 != 0, param1);
            this.a((byte) -89, param0, param2, false, param4);
            return var8Lifetime5 != 0;
          }
          if (!param6) {
            var8Lifetime6 = 1;
            this.field_vb.a(-24380, this.field_wb.field_p, var8Lifetime6 != 0, param1);
            this.a((byte) -89, param0, param2, false, param4);
            return var8Lifetime6 != 0;
          }
          var8Lifetime7 = 0;
          this.field_vb.a(-24380, this.field_wb.field_p, var8Lifetime7 != 0, param1);
          this.a((byte) -89, param0, param2, false, param4);
          return var8Lifetime7 != 0;
        }
        if (param5) {
          var8Lifetime1 = 1;
          this.field_vb.a(-24380, this.field_wb.field_p, var8Lifetime1 != 0, param1);
          this.a((byte) -89, param0, param2, false, param4);
          return var8Lifetime1 != 0;
        }
        if (!this.field_T) {
          var8Lifetime2 = 0;
          this.field_vb.a(-24380, this.field_wb.field_p, var8Lifetime2 != 0, param1);
          this.a((byte) -89, param0, param2, false, param4);
          return var8Lifetime2 != 0;
        }
        if (!param6) {
          var8Lifetime3 = 1;
          this.field_vb.a(-24380, this.field_wb.field_p, var8Lifetime3 != 0, param1);
          this.a((byte) -89, param0, param2, false, param4);
          return var8Lifetime3 != 0;
        }
        var8Lifetime4 = 0;
        this.field_vb.a(-24380, this.field_wb.field_p, var8Lifetime4 != 0, param1);
        this.a((byte) -89, param0, param2, false, param4);
        return var8Lifetime4 != 0;
    }

    final boolean a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5) {
        if (!param5) {
          return false;
        }
        return this.a(param2, param1, this.field_wb.field_p, (byte) 94, param0, param3, param4);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.a((byte) 125, param3, this.field_wb.field_p, param0, param2);
        if (param1 != 0) {
          this.field_vb = (sna) null;
        }
    }

    static {
    }
}

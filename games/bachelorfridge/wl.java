/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends sna {
    gba field_vb;
    static kv[][] field_yb;
    static String field_wb;
    private sna field_xb;
    private gba field_zb;
    private sna field_Ab;

    private wl(long param0, sna param1, sna param2, gba param3) {
        super(param0, (sna) null);
        try {
            this.field_xb = new sna(0L, param2);
            this.field_vb = new gba(0L, param3, true);
            this.field_zb = new gba(0L, param3, false);
            this.a(-1, this.field_xb);
            this.a(-1, this.field_vb);
            this.a(-1, this.field_zb);
            this.field_Ab = param1;
            this.field_xb.a(-1, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "wl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          this.field_Ab.field_rb = 0;
          this.field_Ab.field_kb = 0;
          this.field_xb.field_sb = this.field_sb;
          var4 = 18 % ((78 - param2) / 48);
          this.field_xb.field_p = this.field_p;
          this.field_vb.a(false);
          this.field_zb.a(false);
          if (this.field_Ab.field_sb <= this.field_xb.field_sb) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (this.field_Ab.field_p <= this.field_xb.field_p) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          L3: {
            var6 = stackIn_6_0;
            if (var5 == 0) {
              break L3;
            } else {
              if (var6 == 0) {
                break L3;
              } else {
                this.a(-1, this.field_zb);
                this.a(-1, this.field_vb);
                this.field_xb.field_sb = this.field_xb.field_sb - (param1 + param0);
                this.field_xb.field_p = this.field_xb.field_p - (param1 - -param0);
                this.field_zb.a(param1, 31407, -param1 + this.field_sb, 0, -param1 + this.field_p);
                this.field_zb.b(this.field_Ab.field_sb, -this.field_Ab.field_kb, this.field_xb.field_sb, (byte) -117);
                this.field_vb.a(-param1 + this.field_p, 31407, param1, -param1 + this.field_sb, 0);
                this.field_vb.b(this.field_Ab.field_p, -this.field_Ab.field_rb, this.field_xb.field_p, (byte) -117);
                break L2;
              }
            }
          }
          if (var5 == 0) {
            if (var6 != 0) {
              this.a(-1, this.field_vb);
              this.field_xb.field_sb = this.field_xb.field_sb - (param0 + param1);
              this.field_vb.a(this.field_p, 31407, param1, this.field_sb - param1, 0);
              this.field_vb.b(this.field_Ab.field_p, -this.field_Ab.field_rb, this.field_xb.field_p, (byte) -117);
              break L2;
            } else {
              break L2;
            }
          } else {
            this.a(-1, this.field_zb);
            this.field_xb.field_p = this.field_xb.field_p - (param0 + param1);
            this.field_zb.a(param1, 31407, this.field_sb, 0, this.field_p - param1);
            this.field_zb.b(this.field_Ab.field_sb, -this.field_Ab.field_kb, this.field_xb.field_sb, (byte) -117);
            break L2;
          }
        }
    }

    wl(String param0, sna param1, sna param2, gba param3) {
        this(ew.a((byte) 8, (CharSequence) ((Object) param0)), param1, param2, param3);
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        this.field_p = param4;
        if (param2) {
            this.field_vb = (gba) null;
        }
        this.field_rb = param1;
        this.field_kb = param5;
        this.field_sb = param6;
        this.a(param0, param3, -50);
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param3 <= 104) {
            this.a(-126, -34, 21);
        }
        this.a(param1, param0, this.field_xb.field_sb, param2, this.field_xb.field_p, false);
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var8 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          if (!this.field_vb.g(25910)) {
            break L0;
          } else {
            this.field_Ab.field_I = this.field_Ab.field_I + param3;
            break L0;
          }
        }
        L1: {
          if (this.field_vb.b(param5)) {
            this.field_Ab.field_I = this.field_Ab.field_I - param3;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (!this.field_vb.f(0)) {
            break L2;
          } else {
            this.field_Ab.field_I = this.field_Ab.field_I + param2;
            break L2;
          }
        }
        L3: {
          if (!this.field_vb.h(0)) {
            break L3;
          } else {
            this.field_Ab.field_I = this.field_Ab.field_I - param2;
            break L3;
          }
        }
        L4: {
          if (!this.field_zb.g(25910)) {
            break L4;
          } else {
            this.field_Ab.field_mb = this.field_Ab.field_mb + param3;
            break L4;
          }
        }
        L5: {
          if (this.field_zb.b(false)) {
            this.field_Ab.field_mb = this.field_Ab.field_mb - param3;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (!this.field_zb.f(0)) {
            break L6;
          } else {
            this.field_Ab.field_mb = this.field_Ab.field_mb + param4;
            break L6;
          }
        }
        L7: {
          if (this.field_zb.h(0)) {
            this.field_Ab.field_mb = this.field_Ab.field_mb - param4;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (!this.field_T) {
            break L8;
          } else {
            if (this.field_xb.field_p > this.field_Ab.field_p) {
              this.field_Ab.field_mb = this.field_Ab.field_mb - param1;
              break L8;
            } else {
              this.field_Ab.field_I = this.field_Ab.field_I - param1;
              break L8;
            }
          }
        }
        L9: {
          if (!param0) {
            L10: {
              if (-(this.field_Ab.field_I + this.field_Ab.field_rb) <= this.field_Ab.field_p + this.field_Ab.field_hb + -this.field_xb.field_p) {
                break L10;
              } else {
                this.field_Ab.field_I = -(this.field_Ab.field_hb + this.field_Ab.field_p + -this.field_xb.field_p) + -this.field_Ab.field_rb;
                break L10;
              }
            }
            L11: {
              if (this.field_Ab.field_sb + this.field_Ab.field_W + -this.field_xb.field_sb >= -(this.field_Ab.field_kb + this.field_Ab.field_mb)) {
                break L11;
              } else {
                this.field_Ab.field_mb = -this.field_Ab.field_kb + -(-this.field_xb.field_sb + this.field_Ab.field_W + this.field_Ab.field_sb);
                break L11;
              }
            }
            L12: {
              if ((-(this.field_Ab.field_I + this.field_Ab.field_rb) ^ -1) <= -1) {
                break L12;
              } else {
                this.field_Ab.field_I = -this.field_Ab.field_rb;
                break L12;
              }
            }
            if ((-(this.field_Ab.field_kb + this.field_Ab.field_mb) ^ -1) > -1) {
              this.field_Ab.field_mb = -this.field_Ab.field_kb;
              break L9;
            } else {
              break L9;
            }
          } else {
            L13: {
              if ((-(this.field_Ab.field_I + this.field_Ab.field_rb) ^ -1) <= -1) {
                break L13;
              } else {
                this.field_Ab.field_I = -this.field_Ab.field_rb;
                break L13;
              }
            }
            L14: {
              if (this.field_Ab.field_p - -this.field_Ab.field_hb + -this.field_xb.field_p < -(this.field_Ab.field_I + this.field_Ab.field_rb)) {
                this.field_Ab.field_I = -this.field_Ab.field_rb + -(this.field_Ab.field_hb + (this.field_Ab.field_p + -this.field_xb.field_p));
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if ((-(this.field_Ab.field_mb + this.field_Ab.field_kb) ^ -1) > -1) {
                this.field_Ab.field_mb = -this.field_Ab.field_kb;
                break L15;
              } else {
                break L15;
              }
            }
            if (-(this.field_Ab.field_mb + this.field_Ab.field_kb) > this.field_Ab.field_W + this.field_Ab.field_sb - this.field_xb.field_sb) {
              this.field_Ab.field_mb = -this.field_Ab.field_kb + -(-this.field_xb.field_sb + this.field_Ab.field_W + this.field_Ab.field_sb);
              break L9;
            } else {
              break L9;
            }
          }
        }
        L16: {
          if (!this.field_vb.f((byte) -122)) {
            break L16;
          } else {
            this.field_Ab.field_rb = -this.field_vb.a(param0, (byte) 87, this.field_xb.field_p, this.field_Ab.field_p);
            this.field_Ab.field_I = 0;
            break L16;
          }
        }
        L17: {
          if (!this.field_zb.f((byte) -119)) {
            break L17;
          } else {
            this.field_Ab.field_kb = -this.field_zb.a(-88, param0, this.field_xb.field_sb, this.field_Ab.field_sb);
            this.field_Ab.field_mb = 0;
            break L17;
          }
        }
        this.field_vb.b(this.field_Ab.field_p, -this.field_Ab.field_rb, this.field_xb.field_p, (byte) -117);
        this.field_zb.b(this.field_Ab.field_sb, -this.field_Ab.field_kb, this.field_xb.field_sb, (byte) -117);
    }

    public static void f(int param0) {
        field_yb = (kv[][]) null;
        field_wb = null;
        if (param0 != 0) {
            field_yb = (kv[][]) null;
        }
    }

    static {
        field_wb = "Hide players in <%0>'s game";
    }
}

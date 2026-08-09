/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    private cs field_d;
    static ki field_f;
    static og field_b;
    private jn field_e;
    private fr field_c;
    static int[] field_a;

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 550267135) {
          L0: {
            field_b = (og) null;
            if (null == this.field_d) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == this.field_d) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3;
        var3 = param0 - 1 & param2 >> 629251103;
        if (param1 <= 87) {
          return -115;
        } else {
          return ((param2 >>> 550267135) + param2) % param0 + var3;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void b(byte param0) {
        field_b = null;
        int var1 = -15 / ((param0 - -74) / 44);
        field_a = null;
        field_f = null;
    }

    final void a(byte param0) {
        int var2;
        ms var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = -61 / ((param0 - 13) / 45);
        this.field_d = null;
        if (!this.field_e.a((byte) -78)) {
          var3 = this.field_e.b(86);
          L0: while (true) {
            if (this.field_e.field_e != var3) {
              ((ve) ((Object) var3)).c(50);
              var3 = var3.field_b;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    eb(fr param0) {
        this.field_e = new jn();
        try {
            this.field_c = param0;
            if (this.field_c.field_xc) {
                if (!this.field_c.field_C) {
                    return;
                }
                this.field_d = new cs(this.field_c);
                if ((this.field_c.field_Bc ^ -1) < -2 && this.field_c.field_B && this.field_c.field_vb) {
                    this.field_d = new cs(this.field_c);
                    return;
                }
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "eb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}

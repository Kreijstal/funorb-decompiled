/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class h {
    static fa field_j;
    static pd field_c;
    static String field_d;
    hl field_b;
    hl field_m;
    hl field_a;
    hl field_g;
    dh field_e;
    int field_h;
    long field_f;
    byte field_n;
    dh field_o;
    volatile int field_i;
    volatile int field_l;
    nh field_k;

    abstract void b(int param0);

    final int a(byte param0) {
        if (param0 != -103) {
          this.b(109);
          return this.field_a.a(false) + this.field_g.a(false);
        } else {
          return this.field_a.a(false) + this.field_g.a(false);
        }
    }

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -21) {
          L0: {
            this.field_g = (hl) null;
            if (-21 < (this.c(-115) ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-21 < (this.c(-115) ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final nh a(int param0, boolean param1, int param2, byte param3, byte param4) {
        long var6 = (long)param0 + ((long)param2 << -1456343840);
        nh var8 = new nh();
        var8.field_G = param4;
        var8.field_m = var6;
        if (param3 < 55) {
            h.a(false);
            var8.field_x = param1 ? true : false;
            if (param1) {
                if ((this.c(118) ^ -1) <= -21) {
                    throw new RuntimeException();
                }
                this.field_b.a(11152, var8);
            } else {
                if (!(-21 < (this.a((byte) -103) ^ -1))) {
                    throw new RuntimeException();
                }
                this.field_a.a(11152, var8);
            }
            return var8;
        }
        var8.field_x = param1 ? true : false;
        if (param1) {
            if ((this.c(118) ^ -1) <= -21) {
                throw new RuntimeException();
            }
            this.field_b.a(11152, var8);
        } else {
            if (!(-21 < (this.a((byte) -103) ^ -1))) {
                throw new RuntimeException();
            }
            this.field_a.a(11152, var8);
        }
        return var8;
    }

    abstract boolean c(boolean param0);

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        field_j = null;
        if (!param0) {
            field_c = (pd) null;
        }
    }

    abstract void a(int param0);

    final boolean b(boolean param0) {
        boolean discarded$10 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            discarded$10 = this.b(false);
            if ((this.a((byte) -103) ^ -1) > -21) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((this.a((byte) -103) ^ -1) > -21) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    abstract void a(int param0, Object param1, boolean param2);

    final int c(int param0) {
        int var2 = -120 / ((-29 - param0) / 59);
        return this.field_b.a(false) - -this.field_m.a(false);
    }

    h() {
        this.field_b = new hl();
        this.field_m = new hl();
        this.field_a = new hl();
        this.field_g = new hl();
        this.field_e = new dh(6);
        this.field_n = (byte) 0;
        this.field_i = 0;
        this.field_l = 0;
        this.field_o = new dh(10);
    }

    static {
        field_d = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class un {
    static String field_q;
    er field_b;
    static int field_c;
    er field_g;
    static jb field_i;
    er field_d;
    er field_n;
    static lh field_o;
    long field_m;
    int field_p;
    rb field_l;
    byte field_k;
    volatile int field_j;
    static bo field_f;
    rb field_h;
    volatile int field_e;
    gp field_a;

    final static int e(int param0) {
        if (param0 > -70) {
            un.a(116);
            return ro.field_q;
        }
        return ro.field_q;
    }

    public static void d(int param0) {
        int discarded$0 = 0;
        field_f = null;
        field_i = null;
        field_q = null;
        if (param0 != 6) {
            discarded$0 = un.e(26);
            field_o = null;
            return;
        }
        field_o = null;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    abstract boolean f(int param0);

    final int b(int param0) {
        if (param0 != -1048142560) {
          this.field_b = (er) null;
          return this.field_b.c(0) + this.field_g.c(0);
        } else {
          return this.field_b.c(0) + this.field_g.c(0);
        }
    }

    final gp a(int param0, int param1, int param2, boolean param3, byte param4) {
        long var6 = 0L;
        gp var8 = null;
        gp stackIn_1_0 = null;
        gp stackIn_2_0 = null;
        gp stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        gp stackOut_0_0 = null;
        gp stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        gp stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var6 = (long)param1 + ((long)param0 << -1048142560);
          var8 = new gp();
          stackOut_0_0 = (gp) (var8);
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
            stackOut_2_0 = (gp) ((Object) stackIn_2_0);
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (gp) ((Object) stackIn_1_0);
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_q = stackIn_3_1 != 0;
        var8.field_i = var6;
        var8.field_z = param4;
        if (param2 == -21) {
          if (!param3) {
            if (20 <= this.c(-116)) {
              throw new RuntimeException();
            } else {
              this.field_d.a(2, var8);
              return var8;
            }
          } else {
            if ((this.b(-1048142560) ^ -1) <= -21) {
              throw new RuntimeException();
            } else {
              this.field_b.a(2, var8);
              return var8;
            }
          }
        } else {
          this.field_d = (er) null;
          if (!param3) {
            if (20 <= this.c(-116)) {
              throw new RuntimeException();
            } else {
              this.field_d.a(2, var8);
              return var8;
            }
          } else {
            if ((this.b(-1048142560) ^ -1) <= -21) {
              throw new RuntimeException();
            } else {
              this.field_b.a(2, var8);
              return var8;
            }
          }
        }
    }

    final boolean a(boolean param0) {
        int discarded$10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            discarded$10 = this.c(53);
            if (-21 < (this.b(-1048142560) ^ -1)) {
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
            if (-21 < (this.b(-1048142560) ^ -1)) {
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

    abstract void c(byte param0);

    final static void a(int param0) {
        String var2 = null;
        String var3 = null;
        if (!nf.field_a) {
          throw new IllegalStateException();
        } else {
          if (ml.field_m == null) {
            var3 = ka.a(param0 ^ 118);
            if (param0 != -21) {
              field_i = (jb) null;
              vr.field_b = new ce(var3, (String) null, true, false, false);
              vn.field_f.a(ak.field_d, 0);
              ak.field_d.d(vr.field_b, -30244);
              ak.field_d.e((byte) 85);
              return;
            } else {
              vr.field_b = new ce(var3, (String) null, true, false, false);
              vn.field_f.a(ak.field_d, 0);
              ak.field_d.d(vr.field_b, -30244);
              ak.field_d.e((byte) 85);
              return;
            }
          } else {
            ml.field_m.h((byte) 9);
            var2 = ka.a(param0 ^ 118);
            if (param0 == -21) {
              vr.field_b = new ce(var2, (String) null, true, false, false);
              vn.field_f.a(ak.field_d, 0);
              ak.field_d.d(vr.field_b, -30244);
              ak.field_d.e((byte) 85);
              return;
            } else {
              field_i = (jb) null;
              vr.field_b = new ce(var2, (String) null, true, false, false);
              vn.field_f.a(ak.field_d, 0);
              ak.field_d.d(vr.field_b, -30244);
              ak.field_d.e((byte) 85);
              return;
            }
          }
        }
    }

    abstract void b(byte param0);

    final boolean a(byte param0) {
        int var2 = -97 % ((param0 - -51) / 52);
        return -21 >= (this.c(-95) ^ -1) ? true : false;
    }

    abstract void a(int param0, boolean param1, Object param2);

    final int c(int param0) {
        if (param0 > -69) {
          field_c = 121;
          return this.field_d.c(0) - -this.field_n.c(0);
        } else {
          return this.field_d.c(0) - -this.field_n.c(0);
        }
    }

    un() {
        this.field_b = new er();
        this.field_g = new er();
        this.field_d = new er();
        this.field_n = new er();
        this.field_l = new rb(6);
        this.field_j = 0;
        this.field_k = (byte) 0;
        this.field_e = 0;
        this.field_h = new rb(10);
    }

    static {
        field_q = "radar_sweep_oneshot";
        field_i = new jb();
        field_o = new lh();
        field_f = null;
    }
}

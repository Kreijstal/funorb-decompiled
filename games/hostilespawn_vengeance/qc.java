/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc extends dk {
    int field_z;
    static String field_C;
    static int field_s;
    static bd[] field_x;
    int field_w;
    int field_u;
    int field_A;
    static String field_t;
    int field_r;
    int field_y;
    static pg field_v;
    static bd field_B;
    static bd field_q;

    final static String d(int param0) {
        if (od.field_I == ti.field_b) {
          return cg.field_e;
        } else {
          if (ti.field_b == ki.field_f) {
            return uh.field_g;
          } else {
            if (param0 == 750938499) {
              if (!c.field_a.d((byte) -70)) {
                return uh.field_g;
              } else {
                return rf.field_e;
              }
            } else {
              field_x = (bd[]) null;
              if (!c.field_a.d((byte) -70)) {
                return uh.field_g;
              } else {
                return rf.field_e;
              }
            }
          }
        }
    }

    final static void c(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 <= -93) {
          if (null == nj.field_c) {
            return;
          } else {
            var1 = nj.field_c;
            synchronized (var1) {
              L0: {
                nj.field_c = null;
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var6;
        int var7;
        var6 = this.field_u << -1274103901;
        param0 = (var6 & 15) + (param0 << 476238244);
        if (param3) {
          return;
        } else {
          var7 = this.field_r << 750938499;
          param2 = (param2 << -239596316) - -(15 & var7);
          this.a(var6, var7, param0, param2, param1, param4);
          return;
        }
    }

    public static void a(boolean param0) {
        field_t = null;
        if (!param0) {
          qc.c((byte) -25);
          field_x = null;
          field_q = null;
          field_B = null;
          field_v = null;
          field_C = null;
          return;
        } else {
          field_x = null;
          field_q = null;
          field_B = null;
          field_v = null;
          field_C = null;
          return;
        }
    }

    final void a(double param0, double param1, boolean param2, double param3, int param4) {
        this.a(this.field_u << -143834141, this.field_r << 2014366435, (int)Math.floor(0.5 + param1 * 16.0), (int)Math.floor(0.5 + param0 * 16.0), (int)Math.floor(0.5 + param3 * 256.0), param4 << 134798021);
        if (param2) {
            qc.c((byte) -94);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        this.a(param3, param2 << 80998248, param4, false, param1 << -1479461371);
        if (!param0) {
            field_v = (pg) null;
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    qc() {
    }

    static {
        field_C = "Cancel";
        field_t = "???";
    }
}

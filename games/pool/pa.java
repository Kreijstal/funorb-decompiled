/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends ob {
    static vh field_M;
    static vh field_J;
    static java.awt.Canvas field_K;
    static int field_H;
    static ph field_I;
    static int[] field_L;

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        if (null != vl.field_m) {
          if (vl.field_m.b((byte) 111)) {
            wa.m(8421504);
            return true;
          }
          if (param0) {
            pa.f(118);
          }
          if (null != fc.field_b &&
            fc.field_b.f(13)) {
            fc.field_b = null;
            wa.m(8421504);
            return true;
          }
          if (sn.h(-3)) {
            return true;
          }
          if (Pool.a(param3, param2, param1, -80)) {
            return true;
          }
          return false;
        }
        if (!param0) {
          if (null != fc.field_b &&
            fc.field_b.f(13)) {
            fc.field_b = null;
            wa.m(8421504);
            return true;
          }
          if (sn.h(-3)) {
            return true;
          }
          if (Pool.a(param3, param2, param1, -80)) {
            return true;
          }
          return false;
        }
        pa.f(118);
        if (null == fc.field_b) {
          if (sn.h(-3)) {
            return true;
          }
          if (Pool.a(param3, param2, param1, -80)) {
            return true;
          }
          return false;
        }
        if (fc.field_b.f(13)) {
          fc.field_b = null;
          wa.m(8421504);
          return true;
        }
        if (sn.h(-3)) {
          return true;
        }
        if (!Pool.a(param3, param2, param1, -80)) {
          return false;
        }
        return true;
    }

    pa(dd param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final static int f(int param0) {
        if (param0 == -1) {
          return pq.field_B != null ? pq.field_B.length : 0;
        }
        pa.a(false, 38, 98, -101);
        return pq.field_B != null ? pq.field_B.length : 0;
    }

    public static void g(int param0) {
        field_I = null;
        field_M = null;
        field_L = null;
        field_J = null;
        field_K = null;
        if (param0 >= -31) {
          field_H = -98;
        }
    }

    final int b(byte param0, int param1) {
        if (param0 == 6) {
          return (-1 + this.field_h.length != param1 ? 0 : 20) + this.field_x + param1 * this.field_s;
        }
        return 103;
    }

    static {
        field_H = -1;
    }
}

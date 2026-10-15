/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static String field_b;
    static wd field_a;
    static boolean field_c;

    final static int a(int param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = wizardrun.field_H;
        try {
          sb.field_d = sb.field_d + 65536;
          if (param0 != 586) {
            stackIn_3_0 = -4;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "kd.A(" + param0 + ',' + param1 + ')');
        }
        stackIn_6_0 = sb.field_d;
        try {
          while (uf.a(stackIn_6_0, fl.field_V, 65535) >= 65536) {
            sb.field_d = sb.field_d - fl.field_V;
            hj.field_c = hj.field_c + 1;
            stackIn_6_0 = sb.field_d;
          }
          var2_int = -1;
          if (null != f.field_d) {
            var2_int = f.field_d.length;
          } else {
            if (dc.field_s != null) {
              var2_int = dc.field_s.length;
            }
          }
          if (-1 != var2_int) {
            boolean decompiledFrameRemainder0 = true;
            if (fl.field_u > od.field_j) {
              od.field_j = od.field_j + 1;
              if (fl.field_M < od.field_j && (null == f.field_d ||
                null == f.field_d[ej.field_c])) {
                od.field_j = od.field_j - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (od.field_j >= fl.field_u &&
                  null == f.field_d[(1 + ej.field_c) % var2_int]) {
                  od.field_j = od.field_j - 1;
                }
              }
            }
            if (fl.field_u <= od.field_j) {
              ra.field_o = ej.field_c;
              if (ei.field_j) {
                ej.field_c = ej.field_c + 1;
                if (ej.field_c >= var2_int) {
                  ej.field_c = ej.field_c - var2_int;
                }
              } else {
                ej.field_c = ej.field_c - 1;
                if (ej.field_c < 0) {
                  ej.field_c = ej.field_c + var2_int;
                }
              }
              od.field_j = od.field_j - fl.field_u;
            }
            if (fl.field_M < od.field_j) {
              ei.field_j = true;
            }
          }
          if (null != ra.field_p) {
            var3 = 357 - ra.field_p.field_s / 2;
            var4 = 0;
            if (w.field_c != 0 &&
              dh.field_b > var3 &&
              var3 + ra.field_p.field_p > dh.field_b) {
              if (tf.field_e > -ra.field_p.field_z + 269 &&
                tf.field_e < 269) {
                od.field_j = fl.field_u;
                var4 = 1;
                ei.field_j = false;
              }
              if (tf.field_e > 586 &&
                586 + ra.field_p.field_z > tf.field_e) {
                ei.field_j = true;
                var4 = 1;
                od.field_j = fl.field_u;
              }
            }
            if (var4 == 0 &&
              fl.field_M < od.field_j &&
              fi.field_B > var3 &&
              ra.field_p.field_p + var3 > fi.field_B) {
              if (pg.field_n > -ra.field_p.field_z + 269 &&
                pg.field_n < 269) {
                od.field_j = fl.field_M;
              }
              if (586 < pg.field_n &&
                ra.field_p.field_z + 586 > pg.field_n) {
                od.field_j = fl.field_M;
              }
            }
          }
          if (param1) {
            jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 - 668, wc.a(29292, dh.field_b, tf.field_e));
            if (jj.field_d.b(param0 ^ -587)) {
              if (jj.field_d.field_g == 0) {
                stackIn_66_0 = 3;
                return stackIn_66_0;
              }
              if (jj.field_d.field_g == 1) {
                stackIn_69_0 = 2;
                return stackIn_69_0;
              }
            }
            while (ae.a(103)) {
              jj.field_d.a((byte) 11, 0);
              if (jj.field_d.b(-1)) {
                if (jj.field_d.field_g == 0) {
                  stackIn_76_0 = 3;
                  return stackIn_76_0;
                }
                if (1 == jj.field_d.field_g) {
                  stackIn_80_0 = 1;
                  return stackIn_80_0;
                }
              }
              if (13 != vk.field_r) {
                continue;
              }
              stackIn_84_0 = 1;
              return stackIn_84_0;
            }
          }
          stackIn_86_0 = 0;
          return stackIn_86_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "kd.A(" + param0 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 != 24188) {
          kd.a(58, false);
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Please check if address is correct";
    }
}

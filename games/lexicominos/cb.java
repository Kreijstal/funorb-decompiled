/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends kd {
    int field_o;
    int field_u;
    int field_j;
    int field_E;
    static String field_t;
    static db field_n;
    int field_i;
    ke field_w;
    wj field_p;
    int field_y;
    static String field_A;
    int field_x;
    int field_k;
    int field_m;
    static String field_D;
    int field_q;
    rc field_r;
    int field_v;
    int field_B;
    int field_s;
    cc field_C;
    int field_l;
    int field_z;
    int field_h;
    int field_F;

    public static void a(int param0) {
        field_A = null;
        field_D = null;
        if (param0 != 29152) {
            return;
        }
        field_t = null;
        field_n = null;
    }

    final static void b() {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            k.b();
            gl.field_e = new int[260];
            sb.field_d = 11;
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (var5 >= gl.field_e.length) {
                    break L0;
                  } else {
                    gl.field_e[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                gl.field_e[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "cb.C(" + -110 + ')');
        }
    }

    final static void a() {
        ug.field_m = 0;
        nc.field_p = null;
        af.field_b = false;
        vf.field_r = -1;
        bf.field_g = -1;
    }

    final static boolean a(byte param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        L0: {
          if (!param1) {
            if (oj.field_j[param3] >= oj.field_j[param2]) {
              if (oj.field_j[param3] > oj.field_j[param2]) {
                return false;
              } else {
                if (we.field_g[param3] < we.field_g[param2]) {
                  return true;
                } else {
                  if (we.field_g[param2] < we.field_g[param3]) {
                    return false;
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            if (we.field_g[param2] <= we.field_g[param3]) {
              if (we.field_g[param3] > we.field_g[param2]) {
                return false;
              } else {
                if (oj.field_j[param2] > oj.field_j[param3]) {
                  return true;
                } else {
                  if (oj.field_j[param3] > oj.field_j[param2]) {
                    return false;
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              return true;
            }
          }
        }
        var4 = hl.field_N[param3] + oc.field_a[param3] + l.field_D[param3];
        var5 = hl.field_N[param2] + oc.field_a[param2] + l.field_D[param2];
        if (var4 >= var5) {
          if (var5 >= var4) {
            L1: {
              if (param3 >= param2) {
                stackOut_29_0 = 0;
                stackIn_30_0 = stackOut_29_0;
                break L1;
              } else {
                stackOut_28_0 = 1;
                stackIn_30_0 = stackOut_28_0;
                break L1;
              }
            }
            return stackIn_30_0 != 0;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final void c(int param0) {
        if (param0 != 0) {
            cb.a(-98);
        }
        ((cb) this).field_r = null;
        ((cb) this).field_C = null;
        ((cb) this).field_p = null;
        ((cb) this).field_w = null;
    }

    cb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Use this alternative as your account name";
        field_D = "1 of 4";
    }
}

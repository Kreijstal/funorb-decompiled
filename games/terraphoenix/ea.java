/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea implements cj {
    private int field_a;
    private int field_e;
    private int field_l;
    static boolean field_j;
    private pk field_h;
    private int field_b;
    private int field_p;
    private int field_i;
    private int field_c;
    static int field_m;
    private int field_d;
    private int field_g;
    private int field_f;
    static int field_o;
    static vc field_k;
    private int field_q;
    static String field_n;

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        df var11 = null;
        gl stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        gl stackOut_1_0 = null;
        L0: {
          if (!(param1 instanceof df)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (gl) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (gl) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (df) (Object) stackIn_3_0;
          if (var11 != null) {
            param4 = param4 & var11.field_A;
            break L1;
          } else {
            break L1;
          }
        }
        var7 = 5592405;
        if (param3 != -24381) {
          return;
        } else {
          L2: {
            if (!param4) {
              break L2;
            } else {
              var7 = 16777215;
              break L2;
            }
          }
          L3: {
            l.f(param1.field_w + param2, param1.field_u + param0, param1.field_p, param1.field_n, ((ea) this).field_q);
            var8 = param1.field_w + (param2 + ((ea) this).field_g);
            var9 = ((ea) this).field_l + (param1.field_u + param0);
            l.d(var8, var9, ((ea) this).field_i, ((ea) this).field_e, 5592405);
            l.f(var8, var9, ((ea) this).field_i, ((ea) this).field_e, var7);
            if (var11.field_C) {
              l.c(var8, var9, var8 - -((ea) this).field_i, var9 - -((ea) this).field_e, 1);
              l.c(((ea) this).field_i + var8, var9, var8, var9 - -((ea) this).field_e, 1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (((ea) this).field_h == null) {
              break L4;
            } else {
              var10 = ((ea) this).field_i - -((ea) this).field_g + ((ea) this).field_a;
              int discarded$1 = ((ea) this).field_h.a(param1.field_o, param1.field_w + param2 - -var10, ((ea) this).field_b + (param0 + param1.field_u), param1.field_p + -((ea) this).field_a + -var10, param1.field_n + -(((ea) this).field_a << -781167679), ((ea) this).field_p, ((ea) this).field_f, ((ea) this).field_c, ((ea) this).field_d, 0);
              break L4;
            }
          }
          return;
        }
    }

    final static boolean a(int param0) {
        if (param0 != -20512) {
            return false;
        }
        if (ab.field_b == null) {
            return false;
        }
        if (!ab.field_b.c(7468)) {
            return false;
        }
        return true;
    }

    final static void a(java.math.BigInteger param0, dh param1, int param2, java.math.BigInteger param3, dh param4) {
        ia.a(param2, param4, (byte) -75, param3, param0, param1.field_k, param1.field_i);
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Terraphoenix.field_V;
        field_k.b(0);
        var1 = 0;
        L0: while (true) {
          if (-33 >= var1) {
            if (param0 != 47) {
              field_j = true;
              var1 = 0;
              L1: while (true) {
                if (-33 <= var1) {
                  bb.field_d = 0;
                  return;
                } else {
                  jb.field_d[var1] = 0L;
                  var1++;
                  continue L1;
                }
              }
            } else {
              var1 = 0;
              L2: while (true) {
                if (-33 >= (var1 ^ -1)) {
                  bb.field_d = 0;
                  return;
                } else {
                  jb.field_d[var1] = 0L;
                  var1++;
                  continue L2;
                }
              }
            }
          } else {
            bb.field_f[var1] = 0L;
            var1++;
            continue L0;
          }
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        field_n = null;
        if (!param0) {
            field_k = null;
        }
    }

    ea(pk param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((ea) this).field_c = 1;
        ((ea) this).field_d = 1;
        ((ea) this).field_e = param7;
        ((ea) this).field_l = param6;
        ((ea) this).field_i = param8;
        ((ea) this).field_q = param9;
        ((ea) this).field_h = param0;
        ((ea) this).field_f = param4;
        ((ea) this).field_b = param2;
        ((ea) this).field_a = param1;
        ((ea) this).field_p = param3;
        ((ea) this).field_g = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = -1;
        field_j = false;
        field_o = 0;
    }
}

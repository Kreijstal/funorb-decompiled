/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends hl {
    int field_n;
    int field_l;
    int field_w;
    ik field_C;
    ch field_o;
    db field_t;
    int field_q;
    int field_B;
    int field_y;
    int field_A;
    int field_p;
    int field_k;
    int field_r;
    int field_i;
    el field_s;
    int field_x;
    int field_m;
    int field_z;
    int field_j;
    int field_u;
    int field_v;

    final static boolean a(int param0, boolean param1, int param2, qm param3, qm param4, int param5, in param6) {
        float var8 = 0.0f;
        float var9 = 0.0f;
        Object var10 = null;
        in var11 = null;
        var11 = new in(param4, param3);
        var8 = param6.a(var11, (byte) -10);
        if (var8 < (float)(-(param0 + param5))) {
          return false;
        } else {
          if ((float)(param0 + param5) >= var8) {
            if (param1) {
              var9 = param6.a(var11, param1);
              if (var9 >= (float)(-(param0 + param2))) {
                if (var9 > (float)(param0 + param2)) {
                  return false;
                } else {
                  vl.field_c = var11;
                  vl.field_c.a(-1);
                  return true;
                }
              } else {
                return false;
              }
            } else {
              var10 = null;
              ck.a((byte) 85, (java.awt.Canvas) null);
              var9 = param6.a(var11, param1);
              if (var9 >= (float)(-(param0 + param2))) {
                if (var9 > (float)(param0 + param2)) {
                  return false;
                } else {
                  vl.field_c = var11;
                  vl.field_c.a(-1);
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(byte param0) {
        int var1 = -52 % ((29 - param0) / 54);
        return ff.field_b;
    }

    final void b(byte param0) {
        ((ck) this).field_o = null;
        ((ck) this).field_C = null;
        ((ck) this).field_s = null;
        ((ck) this).field_t = null;
        int var2 = -104 % ((24 - param0) / 52);
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        if (param0 == -97) {
          if (bk.field_w == 11) {
            nn.a(false);
            sj.a(de.field_K, aa.field_m, nj.field_e, -115);
            hi.a(param1, 0, true, 0);
            return;
          } else {
            sj.a(de.field_K, aa.field_m, nj.field_e, -115);
            hi.a(param1, 0, true, 0);
            return;
          }
        } else {
          boolean discarded$1 = ck.a((byte) 32);
          if (bk.field_w != 11) {
            sj.a(de.field_K, aa.field_m, nj.field_e, -115);
            hi.a(param1, 0, true, 0);
            return;
          } else {
            nn.a(false);
            sj.a(de.field_K, aa.field_m, nj.field_e, -115);
            hi.a(param1, 0, true, 0);
            return;
          }
        }
    }

    ck() {
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static String field_e;
    byte[] field_g;
    int field_c;
    int field_j;
    int field_m;
    byte[] field_l;
    int field_b;
    int field_n;
    static int field_a;
    int field_d;
    static int field_i;
    static boolean field_f;
    static String field_k;
    int field_h;

    final static String[] a(byte[] param0, int param1) {
        tn var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        var2 = ta.a((byte) 72);
        var3 = 0;
        var4 = param1;
        L0: while (true) {
          if (param0.length <= var4) {
            return var2.c(3);
          } else {
            L1: while (true) {
              L2: {
                if (var4 >= param0.length) {
                  break L2;
                } else {
                  if (-14 == (param0[var4] ^ -1)) {
                    break L2;
                  } else {
                    if (param0[var4] == 10) {
                      break L2;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              }
              var2.a((byte) 112, sm.a(-var3 + var4, var3, -129, param0));
              L3: while (true) {
                L4: {
                  if (param0.length <= var4) {
                    break L4;
                  } else {
                    if (-14 != (param0[var4] ^ -1)) {
                      if (param0[var4] != 10) {
                        break L4;
                      } else {
                        var4++;
                        continue L3;
                      }
                    } else {
                      var4++;
                      continue L3;
                    }
                  }
                }
                var3 = var4;
                continue L0;
              }
            }
          }
        }
    }

    final static boolean a(CharSequence param0, boolean param1) {
        if (!param1) {
            field_f = false;
        }
        return ne.a(10, param0, true, 106);
    }

    final static vj a(int param0, vj param1, float param2) {
        gj var5 = null;
        if (param0 <= 63) {
            Object var4 = null;
            vj discarded$0 = ik.a(-87, (vj) null, -0.22468635439872742f);
        }
        if (!(param1 instanceof lb)) {
            var5 = (gj) (Object) param1;
            return (vj) (Object) new gj(var5.field_t, var5.field_u, (-var5.field_r + var5.field_w) * param2 + var5.field_r, var5.field_w, param1.field_k, param1.field_p, param1.field_q);
        }
        lb var6 = (lb) (Object) param1;
        return (vj) (Object) new lb(var6.a(false, param2), var6.field_s, param1.field_k, param1.field_p, param1.field_q);
    }

    public static void a(byte param0) {
        if (param0 != 109) {
            ik.a((byte) 7);
        }
        field_e = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Start Race";
        field_a = 48;
        field_k = "Powerups have the following effects:";
        field_i = -1;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to extends ms {
    private int field_r;
    private int field_l;
    private int field_k;
    private int field_p;
    private boolean field_v;
    private int field_n;
    static hr[] field_s;
    private int field_u;
    private int field_q;
    private String field_o;
    static hr field_m;
    static byte[] field_t;

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 80) {
          L0: {
            field_m = null;
            ((to) this).field_u = ((to) this).field_u + 1;
            if (((to) this).field_l + ((to) this).field_n + ((to) this).field_r >= ((to) this).field_u + 1) {
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
            ((to) this).field_u = ((to) this).field_u + 1;
            if (((to) this).field_l + ((to) this).field_n + ((to) this).field_r >= ((to) this).field_u + 1) {
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

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == -70) {
            break L0;
          } else {
            to.c(false);
            break L0;
          }
        }
        if (((to) this).field_r > ((to) this).field_u) {
          L1: {
            var2 = (((to) this).field_u << 1537952264) / ((to) this).field_r;
            if (var2 > 255) {
              var2 = 255;
              break L1;
            } else {
              break L1;
            }
          }
          var3 = 80 * (((to) this).field_r + -((to) this).field_u) / ((to) this).field_r;
          if (((to) this).field_v) {
            int discarded$6 = qv.field_k.a(100, 5023231 | var2 << 1010733112, 0, 320, 160, (int[]) null, (hr[]) null, ((to) this).field_p + var3, -1, 0, 0, -8787, ((to) this).field_o, (aa) null, 1, 1);
            int discarded$7 = uq.field_a.a(100, var2 << -533908456 | 16777215, 0, 320, 160, (int[]) null, (hr[]) null, ((to) this).field_p + var3, -1, 0, 0, -8787, ((to) this).field_o, (aa) null, 1, 1);
            return;
          } else {
            qv.field_k.a(((to) this).field_o, var2 << -135407624 | 5023231, -1, ((to) this).field_p + var3, ((to) this).field_k, 0);
            uq.field_a.a(((to) this).field_o, var2 << -1259749608 | ((to) this).field_q, -1, var3 + ((to) this).field_p, ((to) this).field_k, 0);
            return;
          }
        } else {
          if (((to) this).field_u < ((to) this).field_n + ((to) this).field_r) {
            L2: {
              var2 = (((to) this).field_u << 1167925000) / ((to) this).field_r;
              if (-256 > (var2 ^ -1)) {
                var2 = 255;
                break L2;
              } else {
                break L2;
              }
            }
            if (!((to) this).field_v) {
              qv.field_k.a(((to) this).field_o, 5023231 | var2 << -335867272, -1, ((to) this).field_p, ((to) this).field_k, param0 + 70);
              uq.field_a.a(((to) this).field_o, ((to) this).field_q | var2 << -418973640, -1, ((to) this).field_p, ((to) this).field_k, 0);
              return;
            } else {
              int discarded$8 = qv.field_k.a(100, var2 << -1531396040 | 5023231, 0, 320, 160, (int[]) null, (hr[]) null, ((to) this).field_p, -1, 0, 0, -8787, ((to) this).field_o, (aa) null, 1, 1);
              int discarded$9 = uq.field_a.a(100, 16777215 | var2 << 459093464, 0, 320, 160, (int[]) null, (hr[]) null, ((to) this).field_p, -1, 0, 0, -8787, ((to) this).field_o, (aa) null, 1, 1);
              return;
            }
          } else {
            var2 = -((to) this).field_n + (((to) this).field_u + -((to) this).field_r);
            var3 = (-var2 + ((to) this).field_l << 1893790632) / ((to) this).field_l;
            if (-1 > var3) {
              L3: {
                if (-256 < var3) {
                  var3 = 255;
                  break L3;
                } else {
                  break L3;
                }
              }
              var4 = 80 * var2 / ((to) this).field_l;
              if (!((to) this).field_v) {
                qv.field_k.a(((to) this).field_o, 5023231 | var3 << 1482743736, -1, -var4 + ((to) this).field_p, ((to) this).field_k, 0);
                uq.field_a.a(((to) this).field_o, var3 << -712733256 | ((to) this).field_q, -1, ((to) this).field_p + -var4, ((to) this).field_k, param0 ^ -70);
                return;
              } else {
                int discarded$10 = qv.field_k.a(100, 5023231 | var3 << -586897256, 0, 320, 160, (int[]) null, (hr[]) null, -var4 + ((to) this).field_p, -1, 0, 0, param0 + -8717, ((to) this).field_o, (aa) null, 1, 1);
                int discarded$11 = uq.field_a.a(100, var3 << 1075943736 | 16777215, 0, 320, 160, (int[]) null, (hr[]) null, -var4 + ((to) this).field_p, -1, 0, 0, -8787, ((to) this).field_o, (aa) null, 1, 1);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void c(boolean param0) {
        field_t = null;
        field_m = null;
        field_s = null;
        if (param0) {
            field_m = null;
        }
    }

    to(String param0, int param1, int param2, int param3) {
        ((to) this).field_u = 0;
        ((to) this).field_l = 80;
        ((to) this).field_n = 20;
        ((to) this).field_p = param3;
        ((to) this).field_k = param2;
        ((to) this).field_r = 20;
        ((to) this).field_q = param1;
        ((to) this).field_o = param0;
    }

    to(String param0, int param1) {
        ((to) this).field_l = 80;
        ((to) this).field_k = 320;
        ((to) this).field_n = 0;
        ((to) this).field_p = 240;
        ((to) this).field_r = 20;
        ((to) this).field_q = param1;
        ((to) this).field_o = param0;
        ((to) this).field_u = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new byte[520];
    }
}

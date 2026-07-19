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
        if (param0 != 80) {
            field_m = (hr) null;
        }
        int fieldTemp$0 = this.field_u + 1;
        this.field_u = this.field_u + 1;
        return this.field_l + this.field_n + this.field_r < fieldTemp$0 ? true : false;
    }

    final void a(byte param0) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
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
        if (this.field_r <= this.field_u) {
          if (this.field_u < this.field_n + this.field_r) {
            L1: {
              var2 = (this.field_u << 1167925000) / this.field_r;
              if (-256 > (var2 ^ -1)) {
                var2 = 255;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_v) {
                  break L3;
                } else {
                  qv.field_k.a(this.field_o, 5023231 | var2 << -335867272, -1, this.field_p, this.field_k, param0 + 70);
                  uq.field_a.a(this.field_o, this.field_q | var2 << -418973640, -1, this.field_p, this.field_k, 0);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              discarded$6 = qv.field_k.a(100, var2 << -1531396040 | 5023231, 0, 320, 160, (int[]) null, (hr[]) null, this.field_p, -1, 0, 0, -8787, this.field_o, (aa) null, 1, 1);
              discarded$7 = uq.field_a.a(100, 16777215 | var2 << 459093464, 0, 320, 160, (int[]) null, (hr[]) null, this.field_p, -1, 0, 0, -8787, this.field_o, (aa) null, 1, 1);
              break L2;
            }
            return;
          } else {
            var2 = -this.field_n + (this.field_u + -this.field_r);
            var3 = (-var2 + this.field_l << 1893790632) / this.field_l;
            if (-1 <= (var3 ^ -1)) {
              return;
            } else {
              L4: {
                if (-256 > (var3 ^ -1)) {
                  var3 = 255;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                L6: {
                  var4 = 80 * var2 / this.field_l;
                  if (this.field_v) {
                    break L6;
                  } else {
                    qv.field_k.a(this.field_o, 5023231 | var3 << 1482743736, -1, -var4 + this.field_p, this.field_k, 0);
                    uq.field_a.a(this.field_o, var3 << -712733256 | this.field_q, -1, this.field_p + -var4, this.field_k, param0 ^ -70);
                    if (var5 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                discarded$8 = qv.field_k.a(100, 5023231 | var3 << -586897256, 0, 320, 160, (int[]) null, (hr[]) null, -var4 + this.field_p, -1, 0, 0, param0 + -8717, this.field_o, (aa) null, 1, 1);
                discarded$9 = uq.field_a.a(100, var3 << 1075943736 | 16777215, 0, 320, 160, (int[]) null, (hr[]) null, -var4 + this.field_p, -1, 0, 0, -8787, this.field_o, (aa) null, 1, 1);
                break L5;
              }
              return;
            }
          }
        } else {
          L7: {
            var2 = (this.field_u << 1537952264) / this.field_r;
            if (var2 > 255) {
              var2 = 255;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            L9: {
              var3 = 80 * (this.field_r + -this.field_u) / this.field_r;
              if (!this.field_v) {
                break L9;
              } else {
                discarded$10 = qv.field_k.a(100, 5023231 | var2 << 1010733112, 0, 320, 160, (int[]) null, (hr[]) null, this.field_p + var3, -1, 0, 0, -8787, this.field_o, (aa) null, 1, 1);
                discarded$11 = uq.field_a.a(100, var2 << -533908456 | 16777215, 0, 320, 160, (int[]) null, (hr[]) null, this.field_p + var3, -1, 0, 0, -8787, this.field_o, (aa) null, 1, 1);
                if (var5 == 0) {
                  break L8;
                } else {
                  break L9;
                }
              }
            }
            qv.field_k.a(this.field_o, var2 << -135407624 | 5023231, -1, this.field_p + var3, this.field_k, 0);
            uq.field_a.a(this.field_o, var2 << -1259749608 | this.field_q, -1, var3 + this.field_p, this.field_k, 0);
            break L8;
          }
          return;
        }
    }

    public static void c(boolean param0) {
        field_t = null;
        field_m = null;
        field_s = null;
        if (param0) {
            field_m = (hr) null;
        }
    }

    to(String param0, int param1, int param2, int param3) {
        try {
            this.field_u = 0;
            this.field_l = 80;
            this.field_n = 20;
            this.field_p = param3;
            this.field_k = param2;
            this.field_r = 20;
            this.field_q = param1;
            this.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "to.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    to(String param0, int param1) {
        try {
            this.field_l = 80;
            this.field_k = 320;
            this.field_n = 0;
            this.field_p = 240;
            this.field_r = 20;
            this.field_q = param1;
            this.field_o = param0;
            this.field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "to.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_t = new byte[520];
    }
}

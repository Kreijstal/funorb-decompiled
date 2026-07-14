/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    private io field_a;
    private ul field_b;
    private ul field_c;

    final static void a(byte param0, ld param1) {
        rp.field_l.a((byte) 50, (cj) (Object) param1);
        if (param0 < 42) {
            Object var3 = null;
            an.a((byte) 16, (ld) null);
        }
    }

    final tl a(int param0, int param1) {
        tl var3 = null;
        byte[] var4 = null;
        tl var5 = null;
        if (param1 == -11452) {
          var3 = (tl) ((an) this).field_a.a((byte) 127, (long)param0);
          if (var3 == null) {
            L0: {
              if ((param0 ^ -1) <= -32769) {
                var4 = ((an) this).field_b.a(1, true, param0 & 32767);
                break L0;
              } else {
                var4 = ((an) this).field_c.a(1, true, param0);
                break L0;
              }
            }
            var5 = new tl();
            if (var4 == null) {
              if (param0 >= 32768) {
                var5.c((byte) 100);
                ((an) this).field_a.a((Object) (Object) var5, (long)param0, 1);
                return var5;
              } else {
                ((an) this).field_a.a((Object) (Object) var5, (long)param0, 1);
                return var5;
              }
            } else {
              var5.a(new k(var4), (byte) 118);
              if (param0 < 32768) {
                ((an) this).field_a.a((Object) (Object) var5, (long)param0, 1);
                return var5;
              } else {
                var5.c((byte) 100);
                ((an) this).field_a.a((Object) (Object) var5, (long)param0, 1);
                return var5;
              }
            }
          } else {
            return var3;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, boolean param1) {
        oj var2 = null;
        dq.field_k.c(param1, -1);
        if (param0 != 1) {
          return;
        } else {
          L0: {
            var2 = ra.field_f;
            if (var2 != null) {
              var2.a(param0 ^ -112, dq.field_k.field_qb, dq.field_k.field_w);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final static hf a(int param0) {
        if (param0 != 1) {
            return null;
        }
        return new hf(gg.a(91), po.c(128));
    }

    an(int param0, ul param1, ul param2, dr param3) {
        ((an) this).field_a = new io(64);
        ((an) this).field_c = param1;
        ((an) this).field_b = param2;
        if (((an) this).field_c != null) {
            int discarded$0 = ((an) this).field_c.d(1, -2);
        }
        if (((an) this).field_b != null) {
            int discarded$1 = ((an) this).field_b.d(1, -2);
        }
    }

    static {
    }
}

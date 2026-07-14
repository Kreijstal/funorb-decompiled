/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eq extends wf {
    private boolean field_f;
    wl field_g;
    static gh field_e;

    final static void a(byte param0, int param1) {
        int var3 = 0;
        uk var4 = null;
        oh var5 = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        var4 = (uk) v.field_b.d(268435455);
        L0: while (true) {
          if (var4 == null) {
            if (param0 >= 107) {
              var5 = (oh) fg.field_r.d(268435455);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  ae.a(var5, param1, (byte) -15);
                  var5 = (oh) fg.field_r.b((byte) 103);
                  continue L1;
                }
              }
            } else {
              eq.a((byte) 89, -36);
              var5 = (oh) fg.field_r.d(268435455);
              L2: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  ae.a(var5, param1, (byte) -15);
                  var5 = (oh) fg.field_r.b((byte) 103);
                  continue L2;
                }
              }
            }
          } else {
            od.a(param1, (byte) -76, var4);
            var4 = (uk) v.field_b.b((byte) 103);
            continue L0;
          }
        }
    }

    final boolean a(int param0) {
        if (param0 >= -109) {
            return false;
        }
        return ((eq) this).field_f;
    }

    eq(wl param0) {
        ((eq) this).field_g = param0;
    }

    abstract void a(byte param0);

    public static void d(int param0) {
        field_e = null;
        if (param0 >= -36) {
            field_e = (gh) null;
        }
    }

    static {
    }
}

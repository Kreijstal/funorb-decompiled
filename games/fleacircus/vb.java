/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends java.awt.Canvas implements java.awt.event.FocusListener {
    static dd field_a;
    volatile boolean field_c;
    java.awt.Frame field_b;

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(ce param0, int param1) {
        if (param1 != 20401) {
            field_a = null;
            hi.a(param0, ((vb) this).field_b, (byte) 52);
            return;
        }
        hi.a(param0, ((vb) this).field_b, (byte) 52);
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static gm a(String param0, byte param1) {
        Object var2 = null;
        int var3 = 0;
        gm var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var6 = fleas.field_A ? 1 : 0;
        if (null != kc.field_c) {
          L0: {
            var3 = -16 % ((param1 - 18) / 62);
            var7 = (CharSequence) (Object) param0;
            var2 = (Object) (Object) uk.a(0, var7);
            if (var2 != null) {
              break L0;
            } else {
              var2 = (Object) (Object) var7;
              break L0;
            }
          }
          var4 = (gm) (Object) kc.field_c.a((long)((String) var2).hashCode(), 16571);
          L1: while (true) {
            if (var4 != null) {
              L2: {
                var8 = (CharSequence) (Object) var4.field_jb;
                var5 = uk.a(102, var8);
                if (var5 == null) {
                  var5 = var4.field_jb;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (!var5.equals(var2)) {
                var4 = (gm) (Object) kc.field_c.a(-113);
                continue L1;
              } else {
                return var4;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((vb) this).field_c = true;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -29039) {
            Object var2 = null;
            dd discarded$0 = vb.a(92, (rh) null, -70, -1);
        }
    }

    final static dd a(int param0, rh param1, int param2, int param3) {
        if (param0 <= -21) {
          if (!ha.a(param1, -32180, param2, param3)) {
            return null;
          } else {
            return qa.h(114);
          }
        } else {
          field_a = null;
          if (!ha.a(param1, -32180, param2, param3)) {
            return null;
          } else {
            return qa.h(114);
          }
        }
    }

    vb() {
    }

    static {
    }
}

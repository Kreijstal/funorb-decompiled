/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    private vna field_b;
    static int field_a;

    final void a(int param0) {
        Object var3 = null;
        if (param0 != 0) {
          var3 = null;
          boolean discarded$2 = ((vi) this).a((byte) 62, (tt) null);
          ((vi) this).field_b.d(param0 ^ 8);
          return;
        } else {
          ((vi) this).field_b.d(param0 ^ 8);
          return;
        }
    }

    final tt a(boolean param0) {
        if (param0) {
          if (((vi) this).field_b.d((byte) 14)) {
            return null;
          } else {
            return (tt) (Object) ((vi) this).field_b.c(-113);
          }
        } else {
          ((vi) this).field_b = null;
          if (((vi) this).field_b.d((byte) 14)) {
            return null;
          } else {
            return (tt) (Object) ((vi) this).field_b.c(-113);
          }
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final boolean a(byte param0, tt param1) {
        ((vi) this).field_b.b((byte) -110, (vg) (Object) param1);
        if (param0 <= 9) {
            field_a = 94;
            return true;
        }
        return true;
    }

    final int a(byte param0) {
        int var2 = 35 % ((51 - param0) / 46);
        return ((vi) this).field_b.a((byte) -16);
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        tt var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        if (param0 >= 21) {
          var4 = (tt) (Object) ((vi) this).field_b.f(-80);
          L0: while (true) {
            if (var4 == null) {
              return var3;
            } else {
              L1: {
                if (!var4.a(false, param1)) {
                  break L1;
                } else {
                  var3++;
                  break L1;
                }
              }
              var4 = (tt) (Object) ((vi) this).field_b.e(107);
              continue L0;
            }
          }
        } else {
          int discarded$3 = ((vi) this).a((byte) 71, -82);
          var4 = (tt) (Object) ((vi) this).field_b.f(-80);
          L2: while (true) {
            if (var4 == null) {
              return var3;
            } else {
              L3: {
                if (!var4.a(false, param1)) {
                  break L3;
                } else {
                  var3++;
                  break L3;
                }
              }
              var4 = (tt) (Object) ((vi) this).field_b.e(107);
              continue L2;
            }
          }
        }
    }

    vi() {
        ((vi) this).field_b = new vna();
    }

    static {
    }
}

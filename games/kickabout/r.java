/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static String field_e;
    static String[] field_a;
    static kd field_d;
    static String[] field_b;
    static hd field_c;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 == param0) {
            var2 = ng.field_a;
        }
        if (-2 == (param1 ^ -1)) {
            var2 = q.field_b;
        }
        if (!(2 != param1)) {
            var2 = fc.field_a;
        }
        return var2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(boolean param0) {
        fd.h(0);
        if (null == ic.field_d) {
          gs.d(98);
          vp.c(-107);
          if (!param0) {
            L0: {
              field_b = null;
              ba.b((byte) 44);
              if (cr.b(0)) {
                or.field_d.b(1, (byte) -106);
                c.a(0, false);
                break L0;
              } else {
                break L0;
              }
            }
            lr.b((byte) -116);
            return;
          } else {
            L1: {
              ba.b((byte) 44);
              if (cr.b(0)) {
                or.field_d.b(1, (byte) -106);
                c.a(0, false);
                break L1;
              } else {
                break L1;
              }
            }
            lr.b((byte) -116);
            return;
          }
        } else {
          hm.a(-120, ic.field_d);
          gs.d(98);
          vp.c(-107);
          if (param0) {
            L2: {
              ba.b((byte) 44);
              if (cr.b(0)) {
                or.field_d.b(1, (byte) -106);
                c.a(0, false);
                break L2;
              } else {
                break L2;
              }
            }
            lr.b((byte) -116);
            return;
          } else {
            L3: {
              field_b = null;
              ba.b((byte) 44);
              if (cr.b(0)) {
                or.field_d.b(1, (byte) -106);
                c.a(0, false);
                break L3;
              } else {
                break L3;
              }
            }
            lr.b((byte) -116);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        field_c = null;
        if (param0 >= -17) {
          int discarded$2 = r.a(-21, -111);
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    final boolean a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -26) {
          if (this != (Object) (Object) gr.field_c) {
            if (this != (Object) (Object) bm.field_H) {
              if ((Object) (Object) jn.field_rb == this) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          boolean discarded$6 = ((r) this).a((byte) -81);
          if (this != (Object) (Object) gr.field_c) {
            if (this == (Object) (Object) bm.field_H) {
              return true;
            } else {
              L0: {
                if ((Object) (Object) jn.field_rb != this) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_e = "<%0> has resigned and left the game.";
        field_b = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}

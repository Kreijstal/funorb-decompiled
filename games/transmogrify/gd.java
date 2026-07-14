/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends wf {
    static java.awt.Canvas field_k;
    int field_h;
    int field_g;
    static pd field_l;
    int field_i;
    int field_p;
    int field_o;
    int field_j;
    static int[] field_n;
    static int field_m;

    public static void d(int param0) {
        if (param0 <= 35) {
          field_n = null;
          field_k = null;
          field_n = null;
          field_l = null;
          return;
        } else {
          field_k = null;
          field_n = null;
          field_l = null;
          return;
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        a.a(37, (java.awt.Component) (Object) param0);
        kc.a((byte) 104, (java.awt.Component) (Object) param0);
        if (ga.field_a == null) {
          if (param1 < 95) {
            field_k = null;
            return;
          } else {
            return;
          }
        } else {
          ga.field_a.a((byte) -88, (java.awt.Component) (Object) param0);
          if (param1 >= 95) {
            return;
          } else {
            field_k = null;
            return;
          }
        }
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0 < -80) {
          var4 = 0;
          if (param3) {
            L0: {
              var4 += 4;
              if (param2) {
                var4 += 2;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (param1) {
                var4++;
                break L1;
              } else {
                break L1;
              }
            }
            return ba.field_l[var4];
          } else {
            L2: {
              if (param2) {
                var4 += 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1) {
                var4++;
                break L3;
              } else {
                break L3;
              }
            }
            return ba.field_l[var4];
          }
        } else {
          String discarded$1 = gd.a((byte) -80, false, false, false);
          var4 = 0;
          if (!param3) {
            L4: {
              if (param2) {
                var4 += 2;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param1) {
                var4++;
                break L5;
              } else {
                break L5;
              }
            }
            return ba.field_l[var4];
          } else {
            L6: {
              var4 += 4;
              if (param2) {
                var4 += 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param1) {
                var4++;
                break L7;
              } else {
                break L7;
              }
            }
            return ba.field_l[var4];
          }
        }
    }

    gd(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((gd) this).field_p = param4;
        ((gd) this).field_j = param2;
        ((gd) this).field_i = param3;
        ((gd) this).field_o = param1;
        ((gd) this).field_h = param0;
        ((gd) this).field_g = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new pd();
        field_n = new int[]{3620, 2775, 2145, 1670, 1315, 1050, 850, 700, 587, 500, 440, 392, 357, 330, 310};
    }
}

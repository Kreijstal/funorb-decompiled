/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static bi field_b;
    private boolean field_a;
    static String field_d;
    private String field_c;

    final static short[] a(int param0, hb param1, short[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Confined.field_J ? 1 : 0;
        var4 = param1.g(param3, 0);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param2.length != var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param2 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param1.g(4, param0);
            var6 = (short)param1.g(16, param0 + 0);
            if (var5 > 0) {
              var7 = 0;
              L3: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param2[var7] = (short)(var6 + param1.g(var5, param0 + 0));
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param2[var7] = (short)var6;
                  var7++;
                  continue L4;
                }
              }
            }
          }
          return param2;
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        int var1 = 107 / ((param0 - 23) / 49);
        field_d = null;
        field_b = null;
    }

    final static void c(int param0) {
        vg.field_Z.g((byte) 127);
        if (ui.field_c == null) {
            ui.field_c = new jj(vg.field_Z, cb.field_b);
        }
        vg.field_Z.c((fj) (Object) ui.field_c, param0);
    }

    final boolean b(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            short[] discarded$0 = bn.a(69, (hb) null, (short[]) null, 72);
        }
        return ((bn) this).field_a;
    }

    final String a(int param0) {
        int var2 = -76 / ((param0 - -20) / 48);
        return ((bn) this).field_c;
    }

    bn(String param0) {
        this(param0, false);
    }

    bn(String param0, boolean param1) {
        ((bn) this).field_c = param0;
        if (null == ((bn) this).field_c) {
            ((bn) this).field_c = "";
        }
        ((bn) this).field_a = param1 ? true : false;
        if (((bn) this).field_c.length() == 0) {
            ((bn) this).field_a = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "This game has been updated! Please reload this page.";
    }
}

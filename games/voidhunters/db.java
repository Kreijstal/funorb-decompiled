/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends rqa {
    static String[] field_o;
    static phb field_p;
    static String field_r;
    static int field_q;

    final static void a(java.awt.Frame param0, eab param1, byte param2) {
        mob var3_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        L0: while (true) {
          var3_ref = param1.a(param0, (byte) 102);
          L1: while (true) {
            if (0 != var3_ref.field_f) {
              if (var3_ref.field_f == 1) {
                param0.setVisible(false);
                param0.dispose();
                var3 = -124 % ((param2 - 76) / 32);
                return;
              } else {
                gdb.b(-58, 100L);
                continue L0;
              }
            } else {
              gdb.b(68, 10L);
              continue L1;
            }
          }
        }
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 70) {
          if (vq.field_x != null) {
            if (vq.field_x.field_e == null) {
              return false;
            } else {
              L0: {
                if (vq.field_x.field_e.field_b.field_a != 1) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_p = null;
          if (vq.field_x != null) {
            if (vq.field_x.field_e == null) {
              return false;
            } else {
              L1: {
                if (vq.field_x.field_e.field_b.field_a != 1) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    db(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((db) this).a((nc[]) null, -101);
          return new nc((Object) (Object) frb.a(193, 108));
        } else {
          return new nc((Object) (Object) frb.a(193, 108));
        }
    }

    final static void a(String[] args, byte[] param1, asb param2, asb param3, asb param4, phb[][] param5, String[] param6, int param7, String[][] param8, byte[] param9, int param10, int param11, boolean param12, int[] param13, int param14, int[] param15, String[][] param16, phb[][] param17, caa[] param18) {
        Object var20 = null;
        mk.a((byte) 25, param15, param3, param4, param18, param13, param8, param2, param16, param1, param9, args, param17, param14, param5, param10, (String[]) null, param12, param7, param6);
    }

    public static void e(int param0) {
        field_p = null;
        field_r = null;
        field_o = null;
        if (param0 != 193) {
            field_r = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new phb(270, 70);
        field_r = "Hull spike";
        field_q = 128;
    }
}

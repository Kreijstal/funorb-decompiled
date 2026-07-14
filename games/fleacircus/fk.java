/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends dl {
    static vc field_z;
    static String field_B;
    ni field_A;
    static boolean field_D;
    byte field_E;
    static int field_C;
    int field_y;
    static String field_x;

    final static void a(String param0, int param1, boolean param2, String[] param3) {
        String[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        if (!param2) {
          ui.field_kb = ui.field_ob;
          if (param1 != 255) {
            if ((param1 ^ -1) <= -101) {
              if (105 >= param1) {
                var4 = param3;
                m.a(-100, var4);
                kh.field_a = ha.a(param3, -21916);
                return;
              } else {
                kh.field_a = af.a((byte) 36, param1, param0);
                return;
              }
            } else {
              kh.field_a = af.a((byte) 36, param1, param0);
              return;
            }
          } else {
            L0: {
              if (ug.field_c >= 13) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            kh.field_a = ld.a(stackIn_6_0 != 0, (byte) 42);
            var6 = null;
            m.a(-44, (String[]) null);
            return;
          }
        } else {
          return;
        }
    }

    public static void i(int param0) {
        Object var2 = null;
        if (param0 != 105) {
          var2 = null;
          fk.a((String) null, 1, true, (String[]) null);
          field_B = null;
          field_z = null;
          field_x = null;
          return;
        } else {
          field_B = null;
          field_z = null;
          field_x = null;
          return;
        }
    }

    final int f(int param0) {
        if (param0 == 8651) {
          if (((fk) this).field_A == null) {
            return 0;
          } else {
            return 100 * ((fk) this).field_A.field_i / (((fk) this).field_A.field_k.length + -((fk) this).field_E);
          }
        } else {
          return 45;
        }
    }

    final byte[] g(int param0) {
        if (!((fk) this).field_q) {
          if (((fk) this).field_A.field_i >= -((fk) this).field_E + ((fk) this).field_A.field_k.length) {
            if (param0 != 100) {
              field_D = false;
              return ((fk) this).field_A.field_k;
            } else {
              return ((fk) this).field_A.field_k;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    fk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new vc();
        field_B = "(Including <%0>)";
        field_x = "Waiting for sound effects";
    }
}

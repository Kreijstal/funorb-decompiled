/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class us {
    static boolean field_c;
    static bi field_a;
    static qf field_d;
    static String field_e;
    static int field_b;

    final static void a(boolean param0, boolean param1) {
        if (param0) {
            field_b = -58;
            fa.field_X.b(param1, 97);
            return;
        }
        fa.field_X.b(param1, 97);
    }

    final static void a(int param0, int param1) {
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = ui.field_m ^ -1;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (p.field_n) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 2;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 3;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        if (stackIn_3_0 != (stackIn_3_1 ^ -1)) {
          if (!p.field_n) {
            ne.a(0, gf.field_b, (byte) 24, 0, 256, 5 * param1, gf.field_k);
            if (param0 != 0) {
              us.a(false, true);
              return;
            } else {
              return;
            }
          } else {
            if (0 != (kc.field_i ^ -1)) {
              ne.a(0, gf.field_b, (byte) 24, 0, 256, 5 * param1, gf.field_k);
              if (param0 != 0) {
                us.a(false, true);
                return;
              } else {
                return;
              }
            } else {
              i.a(640, 480, 0, -(5 * param1) + 255, -123, 0);
              if (param0 != 0) {
                us.a(false, true);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          i.a(640, 480, 0, -(5 * param1) + 255, -123, 0);
          if (param0 != 0) {
            us.a(false, true);
            return;
          } else {
            return;
          }
        }
    }

    final static fs a(ob param0, fs[] param1, int param2) {
        int var3 = 0;
        if (param2 == 2) {
          var3 = param0.j(-85);
          if (param1.length > var3) {
            if (0 > var3) {
              return null;
            } else {
              return param1[var3];
            }
          } else {
            return null;
          }
        } else {
          us.a(-12);
          var3 = param0.j(-85);
          if (param1.length > var3) {
            if (0 > var3) {
              return null;
            } else {
              return param1[var3];
            }
          } else {
            return null;
          }
        }
    }

    final static va b(int param0) {
        va var1 = null;
        var1 = new va();
        var1.field_k = true;
        var1.field_h = 2;
        var1.field_a = 2;
        if (param0 != 0) {
          field_d = null;
          var1.field_f = true;
          var1.field_c = 2;
          return var1;
        } else {
          var1.field_f = true;
          var1.field_c = 2;
          return var1;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        if (param0 != 0) {
            us.a(-56);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> is not on your friend list.";
    }
}

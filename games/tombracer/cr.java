/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr {
    private mi[] field_a;
    int field_c;
    static volatile int field_d;
    static String field_b;

    final static int a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          param1 = param1 & 8191;
          if (param1 >= 4096) {
            L0: {
              if (param1 >= 6144) {
                stackOut_18_0 = -ida.field_b[-param1 + 8192];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = -ida.field_b[-4096 + param1];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (-2049 < (param1 ^ -1)) {
                stackOut_14_0 = ida.field_b[param1];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = ida.field_b[4096 + -param1];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_b = null;
          param1 = param1 & 8191;
          if (param1 >= 4096) {
            L2: {
              if (param1 >= 6144) {
                stackOut_8_0 = -ida.field_b[-param1 + 8192];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -ida.field_b[-4096 + param1];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (-2049 < (param1 ^ -1)) {
                stackOut_4_0 = ida.field_b[param1];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = ida.field_b[4096 + -param1];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 >= -127) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 77) {
          return true;
        } else {
          L0: {
            if (((cr) this).field_a.length > ((cr) this).field_c) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte param4) {
        if (param4 == 35) {
          if (!ica.field_a) {
            tga.field_a.HA(param2 >> -1331304210, -param1 >> -1190026802, -param3 >> 60253742, 2048, param0);
            return;
          } else {
            tga.field_a.da(param2 >> -1445968338, -param1 >> 523861294, -param3 >> -2087861170, param0);
            return;
          }
        } else {
          field_b = null;
          if (!ica.field_a) {
            tga.field_a.HA(param2 >> -1331304210, -param1 >> -1190026802, -param3 >> 60253742, 2048, param0);
            return;
          } else {
            tga.field_a.da(param2 >> -1445968338, -param1 >> 523861294, -param3 >> -2087861170, param0);
            return;
          }
        }
    }

    cr(vna param0) {
        ((cr) this).field_c = 0;
        ((cr) this).field_a = new mi[param0.a((byte) -16)];
        int var2 = 0;
        mi var3 = (mi) (Object) param0.f(-80);
        while (var3 != null) {
            var3.p(67);
            var2++;
            ((cr) this).field_a[var2] = var3;
            var3 = (mi) (Object) param0.e(124);
        }
    }

    final mi c(byte param0) {
        if (param0 >= -125) {
          ((cr) this).field_a = null;
          ((cr) this).field_c = ((cr) this).field_c + 1;
          return ((cr) this).field_a[((cr) this).field_c];
        } else {
          ((cr) this).field_c = ((cr) this).field_c + 1;
          return ((cr) this).field_a[((cr) this).field_c];
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
    }
}

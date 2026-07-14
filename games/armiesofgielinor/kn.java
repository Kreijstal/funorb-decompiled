/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends oj {
    static int field_z;
    static String field_y;

    final boolean b(ha param0, int param1) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != -75) {
          return false;
        } else {
          L0: {
            if (param0.field_Eb[((kn) this).field_w.field_w * param0.field_v + ((kn) this).field_w.field_J].field_c == null) {
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

    public static void g(int param0) {
        field_y = null;
        if (param0 != -75) {
            kn.g(-9);
        }
    }

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = 0;
        if (param1) {
          L0: {
            System.out.println("Teleport reappear event debug");
            System.out.println("Unit at " + ((kn) this).field_w.field_J + "," + ((kn) this).field_w.field_w);
            if (null != ((kn) this).field_w) {
              var3 = "EventTelefrag: pos: (" + ((kn) this).field_w.field_J + "," + ((kn) this).field_w.field_w + ")";
              break L0;
            } else {
              var3 = "EventTelefrag: unit: null";
              break L0;
            }
          }
          var4 = -50 % ((53 - param0) / 51);
          return var3;
        } else {
          L1: {
            if (null != ((kn) this).field_w) {
              var3 = "EventTelefrag: pos: (" + ((kn) this).field_w.field_J + "," + ((kn) this).field_w.field_w + ")";
              break L1;
            } else {
              var3 = "EventTelefrag: unit: null";
              break L1;
            }
          }
          var4 = -50 % ((53 - param0) / 51);
          return var3;
        }
    }

    final void a(ha param0, int param1) {
        ne var3 = null;
        ne var4 = null;
        if (!param0.field_x) {
          var4 = param0.field_Eb[param0.field_v * ((kn) this).field_w.field_w + ((kn) this).field_w.field_J];
          var3 = var4;
          if (null == var4.field_c) {
            var3.field_c = ((kn) this).field_w;
            ((kn) this).field_w.a((byte) 82);
            if (-75 != (((kn) this).field_w.field_N ^ -1)) {
              ((kn) this).field_w.field_B = 1;
              if (param1 == -26661) {
                ((kn) this).field_w.field_s = true;
                fl.a(param0, -114);
                return;
              } else {
                kn.g(99);
                ((kn) this).field_w.field_s = true;
                fl.a(param0, -114);
                return;
              }
            } else {
              ((kn) this).field_w.field_B = 2;
              if (param1 == -26661) {
                ((kn) this).field_w.field_s = true;
                fl.a(param0, -114);
                return;
              } else {
                kn.g(99);
                ((kn) this).field_w.field_s = true;
                fl.a(param0, -114);
                return;
              }
            }
          } else {
            var4.field_c.a(false, (byte) 105);
            var3.field_c = ((kn) this).field_w;
            ((kn) this).field_w.a((byte) 82);
            if (-75 != (((kn) this).field_w.field_N ^ -1)) {
              ((kn) this).field_w.field_B = 1;
              if (param1 == -26661) {
                ((kn) this).field_w.field_s = true;
                fl.a(param0, -114);
                return;
              } else {
                kn.g(99);
                ((kn) this).field_w.field_s = true;
                fl.a(param0, -114);
                return;
              }
            } else {
              ((kn) this).field_w.field_B = 2;
              if (param1 == -26661) {
                ((kn) this).field_w.field_s = true;
                fl.a(param0, -114);
                return;
              } else {
                kn.g(99);
                ((kn) this).field_w.field_s = true;
                fl.a(param0, -114);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        if (param1 > -84) {
            return false;
        }
        return ((kn) this).a((byte) -39, param2, param0, true);
    }

    kn(jd param0) {
        ((kn) this).field_w = param0;
        ((kn) this).field_m = 5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = 0;
        field_y = "Game full";
    }
}

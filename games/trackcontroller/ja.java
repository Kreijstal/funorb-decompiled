/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static int[] field_a;
    static String[] field_c;
    fc field_d;
    private fc field_b;

    final fc a(int param0) {
        fc var2 = null;
        var2 = ((ja) this).field_b;
        if (var2 != ((ja) this).field_d) {
          ((ja) this).field_b = var2.field_h;
          if (param0 != 10) {
            field_c = null;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((ja) this).field_b = null;
          return null;
        }
    }

    final fc a(byte param0) {
        fc var2 = ((ja) this).field_d.field_e;
        if (param0 != 95) {
            return null;
        }
        if (!(((ja) this).field_d != var2)) {
            ((ja) this).field_b = null;
            return null;
        }
        ((ja) this).field_b = var2.field_e;
        return var2;
    }

    final fc b(int param0) {
        fc var2 = ((ja) this).field_d.field_h;
        if (param0 != 2) {
            return null;
        }
        if (!(((ja) this).field_d != var2)) {
            ((ja) this).field_b = null;
            return null;
        }
        ((ja) this).field_b = var2.field_h;
        return var2;
    }

    final fc d(int param0) {
        fc var2 = null;
        var2 = ((ja) this).field_b;
        if (((ja) this).field_d != var2) {
          ((ja) this).field_b = var2.field_e;
          if (param0 <= 88) {
            fc discarded$2 = ((ja) this).b((byte) 68);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((ja) this).field_b = null;
          return null;
        }
    }

    final void a(fc param0, byte param1) {
        if (!(param0.field_e == null)) {
            param0.a(-107);
        }
        param0.field_e = ((ja) this).field_d;
        param0.field_h = ((ja) this).field_d.field_h;
        int var3 = 26 / ((-14 - param1) / 45);
        param0.field_e.field_h = param0;
        param0.field_h.field_e = param0;
    }

    final fc c(byte param0) {
        fc var2 = null;
        var2 = ((ja) this).field_d.field_e;
        if (param0 < -59) {
          if (var2 == ((ja) this).field_d) {
            return null;
          } else {
            var2.a(-92);
            return var2;
          }
        } else {
          return null;
        }
    }

    final fc b(byte param0) {
        fc var2 = null;
        Object var3 = null;
        var2 = ((ja) this).field_d.field_h;
        if (var2 != ((ja) this).field_d) {
          var2.a(-101);
          if (param0 >= -77) {
            var3 = null;
            ((ja) this).a((byte) -94, (fc) null);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, fc param1) {
        L0: {
          if (param1.field_e != null) {
            param1.a(-31);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_e = ((ja) this).field_d.field_e;
        param1.field_h = ((ja) this).field_d;
        param1.field_e.field_h = param1;
        param1.field_h.field_e = param1;
        if (param0 <= -90) {
          return;
        } else {
          ((ja) this).field_b = null;
          return;
        }
    }

    final boolean b(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            int discarded$10 = ((ja) this).a(false);
            if (((ja) this).field_d != ((ja) this).field_d.field_h) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ja) this).field_d != ((ja) this).field_d.field_h) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void c(boolean param0) {
        if (param0) {
            field_c = null;
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static void c(int param0) {
        Object var2 = null;
        oc.a(fi.field_l, (byte) 79, (String) null);
        if (param0 == 1) {
            return;
        }
        ja.c(true);
    }

    final int a(boolean param0) {
        int var2 = 0;
        fc var3 = null;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        var2 = 0;
        if (!param0) {
          int discarded$2 = ((ja) this).a(true);
          var3 = ((ja) this).field_d.field_h;
          L0: while (true) {
            if (((ja) this).field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_h;
              var2++;
              continue L0;
            }
          }
        } else {
          var3 = ((ja) this).field_d.field_h;
          L1: while (true) {
            if (((ja) this).field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_h;
              var2++;
              continue L1;
            }
          }
        }
    }

    public ja() {
        ((ja) this).field_d = new fc();
        ((ja) this).field_d.field_e = ((ja) this).field_d;
        ((ja) this).field_d.field_h = ((ja) this).field_d;
    }

    final void e(int param0) {
        fc var2 = null;
        int var3 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        if (param0 == 1) {
          L0: while (true) {
            var2 = ((ja) this).field_d.field_h;
            if (var2 != ((ja) this).field_d) {
              var2.a(-42);
              continue L0;
            } else {
              ((ja) this).field_b = null;
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{10, 2, 1, 3};
        field_c = new String[29];
    }
}

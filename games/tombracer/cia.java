/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cia {
    private int field_b;
    static String[] field_a;
    private boolean field_d;
    static eua field_g;
    private int field_e;
    private int field_f;
    private bua field_c;

    final int a(int param0) {
        if (param0 != 617) {
            ((cia) this).field_d = false;
            return ((cia) this).field_e >> 16;
        }
        return ((cia) this).field_e >> 16;
    }

    final int a(byte param0) {
        if (param0 != 25) {
            ((cia) this).field_e = 18;
            return ((cia) this).field_b >> 16;
        }
        return ((cia) this).field_b >> 16;
    }

    final void b(int param0, int param1, int param2) {
        ura.a(-10985);
        hp.a(2048, ((cia) this).field_f, 1900, ((cia) this).field_c.b((byte) 74), -1918106173, (((cia) this).field_e >> 16) + param1, param0 + (((cia) this).field_b >> 16));
        se.f((byte) -6);
        int var4 = -43 / ((param2 - 6) / 58);
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (oj.field_tb[kda.field_hd]) {
            stackOut_4_0 = -1;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          } else {
            if (!oj.field_tb[mf.field_a]) {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        var2 = stackIn_5_0;
        if (param0 >= 120) {
          L1: {
            if (!oj.field_tb[mi.field_k]) {
              if (!oj.field_tb[fp.field_a]) {
                stackOut_31_0 = 0;
                stackIn_32_0 = stackOut_31_0;
                break L1;
              } else {
                stackOut_30_0 = 1;
                stackIn_32_0 = stackOut_30_0;
                break L1;
              }
            } else {
              stackOut_28_0 = -1;
              stackIn_32_0 = stackOut_28_0;
              break L1;
            }
          }
          var3 = stackIn_32_0;
          if (var2 != 0) {
            L2: {
              if (!((cia) this).field_d) {
                ((cia) this).field_c.a(0, false, 0, 1, true);
                break L2;
              } else {
                break L2;
              }
            }
            ((cia) this).field_e = ((cia) this).field_e + (var3 << 17);
            ((cia) this).field_b = ((cia) this).field_b + (var2 << 17);
            ((cia) this).field_d = true;
            ((cia) this).field_f = (tia.a(var3 << 8, var2 << 8, -29543) >> 2) - 512;
            ((cia) this).field_c.a(0);
            return;
          } else {
            if (var3 == 0) {
              if (((cia) this).field_d) {
                ((cia) this).field_c.a(0, false, 0, 0, true);
                ((cia) this).field_d = false;
                ((cia) this).field_f = 0;
                ((cia) this).field_c.a(0);
                return;
              } else {
                ((cia) this).field_c.a(0);
                return;
              }
            } else {
              L3: {
                if (!((cia) this).field_d) {
                  ((cia) this).field_c.a(0, false, 0, 1, true);
                  break L3;
                } else {
                  break L3;
                }
              }
              ((cia) this).field_e = ((cia) this).field_e + (var3 << 17);
              ((cia) this).field_b = ((cia) this).field_b + (var2 << 17);
              ((cia) this).field_d = true;
              ((cia) this).field_f = (tia.a(var3 << 8, var2 << 8, -29543) >> 2) - 512;
              ((cia) this).field_c.a(0);
              return;
            }
          }
        } else {
          L4: {
            ((cia) this).field_e = 123;
            if (!oj.field_tb[mi.field_k]) {
              if (!oj.field_tb[fp.field_a]) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L4;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L4;
              }
            } else {
              stackOut_7_0 = -1;
              stackIn_11_0 = stackOut_7_0;
              break L4;
            }
          }
          var3 = stackIn_11_0;
          if (var2 != 0) {
            L5: {
              if (!((cia) this).field_d) {
                ((cia) this).field_c.a(0, false, 0, 1, true);
                break L5;
              } else {
                break L5;
              }
            }
            ((cia) this).field_e = ((cia) this).field_e + (var3 << 17);
            ((cia) this).field_b = ((cia) this).field_b + (var2 << 17);
            ((cia) this).field_d = true;
            ((cia) this).field_f = (tia.a(var3 << 8, var2 << 8, -29543) >> 2) - 512;
            ((cia) this).field_c.a(0);
            return;
          } else {
            if (var3 == 0) {
              if (((cia) this).field_d) {
                ((cia) this).field_c.a(0, false, 0, 0, true);
                ((cia) this).field_d = false;
                ((cia) this).field_f = 0;
                ((cia) this).field_c.a(0);
                return;
              } else {
                ((cia) this).field_c.a(0);
                return;
              }
            } else {
              L6: {
                if (!((cia) this).field_d) {
                  ((cia) this).field_c.a(0, false, 0, 1, true);
                  break L6;
                } else {
                  break L6;
                }
              }
              ((cia) this).field_e = ((cia) this).field_e + (var3 << 17);
              ((cia) this).field_b = ((cia) this).field_b + (var2 << 17);
              ((cia) this).field_d = true;
              ((cia) this).field_f = (tia.a(var3 << 8, var2 << 8, -29543) >> 2) - 512;
              ((cia) this).field_c.a(0);
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        ((cia) this).field_e = param1 << 16;
        ((cia) this).field_b = param0 << 16;
        if (param2 != 1823844912) {
            ((cia) this).b(127, 90, 24);
        }
    }

    cia() {
        ((cia) this).field_c = new bua(0, 0, 1);
        ((cia) this).field_c.a(0, false, 0, 0, true);
        ((cia) this).field_d = false;
    }

    public static void b(int param0) {
        if (param0 != -1) {
            cia.b(42);
            field_a = null;
            field_g = null;
            return;
        }
        field_a = null;
        field_g = null;
    }

    static {
    }
}

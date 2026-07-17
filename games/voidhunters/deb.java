/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class deb extends mfb {
    static String field_b;

    deb() {
    }

    final int b(boolean param0) {
        if (param0) {
            int discarded$0 = ((deb) this).b(true);
            return kg.field_o;
        }
        return kg.field_o;
    }

    final int g(byte param0) {
        if (param0 >= -12) {
            field_b = null;
            return tea.field_b;
        }
        return tea.field_b;
    }

    final int b(int param0) {
        int var2 = 84 % ((param0 - 7) / 47);
        return fua.field_q;
    }

    final static boolean a(int param0, char param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 <= -107) {
          if (param1 != 32) {
            if (40 != param1) {
              if (param1 == 41) {
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
          deb.a(-27, 5);
          if (param1 != 32) {
            if (40 == param1) {
              return true;
            } else {
              L0: {
                if (param1 != 41) {
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

    public static void i(byte param0) {
        field_b = null;
        int var1 = -124 % ((param0 - -63) / 32);
    }

    final int a(byte param0) {
        int var2 = 106 % ((-48 - param0) / 43);
        return oq.field_x;
    }

    final int d(byte param0) {
        if (param0 > -52) {
            int discarded$0 = ((deb) this).g((byte) 55);
            return jga.field_a;
        }
        return jga.field_a;
    }

    final int g(int param0) {
        if (param0 != 2769) {
            deb.i((byte) 112);
            return ls.field_p;
        }
        return ls.field_p;
    }

    final int k(int param0) {
        if (param0 != 0) {
            field_b = null;
            return 0;
        }
        return 0;
    }

    final int a(int param0) {
        if (param0 != 0) {
            field_b = null;
            return ffa.field_b;
        }
        return ffa.field_b;
    }

    final int c(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((deb) this).a(true);
            return uda.field_b;
        }
        return uda.field_b;
    }

    final static void a(int param0, int param1) {
        faa var2 = null;
        if (param0 != 40) {
          deb.i((byte) 62);
          var2 = dpa.field_p;
          var2.h(24335, param1);
          var2.c(0, 2);
          var2.c(0, 4);
          int discarded$4 = 75;
          var2.c(0, kua.a());
          return;
        } else {
          var2 = dpa.field_p;
          var2.h(24335, param1);
          var2.c(0, 2);
          var2.c(0, 4);
          int discarded$5 = 75;
          var2.c(0, kua.a());
          return;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return 17;
        }
        return 31;
    }

    final int f(byte param0) {
        if (param0 <= 0) {
            deb.a(-4, 20);
            return vt.field_o;
        }
        return vt.field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Ship blueprint stored on server";
    }
}

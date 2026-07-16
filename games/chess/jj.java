/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static ci field_f;
    static dd[] field_c;
    static c field_d;
    static c field_b;
    static um field_e;
    static hn field_a;

    final static void c(int param0) {
        nk var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Chess.field_G;
        if (param0 != 8) {
          field_e = null;
          var1 = qn.field_U;
          L0: while (true) {
            if (!ci.g(param0 + 2147483639)) {
              return;
            } else {
              var1.f(8, -65);
              int fieldTemp$2 = var1.field_l + 1;
              var1.field_l = var1.field_l + 1;
              var2 = fieldTemp$2;
              de.a(var1, (byte) 67);
              qn.field_U.a(var1.field_l + -var2, -1);
              continue L0;
            }
          }
        } else {
          var1 = qn.field_U;
          L1: while (true) {
            if (!ci.g(param0 + 2147483639)) {
              return;
            } else {
              var1.f(8, -65);
              int fieldTemp$3 = var1.field_l + 1;
              var1.field_l = var1.field_l + 1;
              var2 = fieldTemp$3;
              de.a(var1, (byte) 67);
              qn.field_U.a(var1.field_l + -var2, -1);
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 7) {
            return;
        }
        field_c = null;
        field_a = null;
        field_e = null;
        field_b = null;
        field_d = null;
    }

    final static boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 7) {
          if (cd.field_x == null) {
            if (an.field_c) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_c = null;
          if (cd.field_x != null) {
            return true;
          } else {
            L0: {
              if (!an.field_c) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static boolean d(int param0) {
        int var1 = 0;
        var1 = -103 / ((75 - param0) / 42);
        if (ch.field_gb != null) {
          if (!ch.field_gb.b(-1)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new dd[7];
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends dm {
    private Object field_C;
    static String field_y;
    static int field_D;
    static String field_G;
    static mg field_F;
    static int field_E;
    static int field_z;
    static String field_A;
    static String field_B;

    mj(Object param0, int param1) {
        super(param1);
        ((mj) this).field_C = param0;
    }

    final static void f(int param0) {
        sj.a(mb.g((byte) 93), 20298);
        if (param0 != 0) {
            field_z = -18;
        }
    }

    final static void a(int param0, boolean param1) {
        w.field_I.a(param1, 11358);
        if (param0 != 0) {
            mj.g(37);
        }
    }

    final Object b(byte param0) {
        if (param0 != -109) {
            boolean discarded$0 = ((mj) this).d(-120);
            return ((mj) this).field_C;
        }
        return ((mj) this).field_C;
    }

    final boolean d(int param0) {
        if (param0 < 65) {
            field_F = null;
            return false;
        }
        return false;
    }

    public static void g(int param0) {
        if (param0 > -96) {
          mj.g(125);
          field_G = null;
          field_y = null;
          field_B = null;
          field_A = null;
          field_F = null;
          return;
        } else {
          field_G = null;
          field_y = null;
          field_B = null;
          field_A = null;
          field_F = null;
          return;
        }
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        Object var4 = null;
        int stackIn_13_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_11_0 = 0;
        var3 = od.b(0, param1);
        if (param0.indexOf(param1) == -1) {
          if (-1 == param0.indexOf(var3)) {
            if (param2 > 105) {
              if (!param0.startsWith(param1)) {
                if (!param0.startsWith(var3)) {
                  if (!param0.endsWith(param1)) {
                    if (param0.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_23_0 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    return stackIn_25_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              var4 = null;
              boolean discarded$5 = mj.a((String) null, (String) null, (byte) -49);
              if (!param0.startsWith(param1)) {
                if (!param0.startsWith(var3)) {
                  if (!param0.endsWith(param1)) {
                    if (param0.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Game";
        field_G = "Virogrid";
        field_D = 0;
        field_E = 0;
        field_y = "<%0> has entered a game.";
    }
}

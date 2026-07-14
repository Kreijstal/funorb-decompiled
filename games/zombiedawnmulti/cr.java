/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr extends br {
    byte[] field_f;
    static cj field_i;
    boolean field_h;
    static int field_j;
    static String field_g;

    public static void b(boolean param0) {
        if (!param0) {
            field_g = null;
            field_i = null;
            field_g = null;
            return;
        }
        field_i = null;
        field_g = null;
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        var3 = qc.b((byte) -32, param0);
        if (param2 == param1.indexOf(param0)) {
          if (param1.indexOf(var3) == -1) {
            if (!param1.startsWith(param0)) {
              if (!param1.startsWith(var3)) {
                if (!param1.endsWith(param0)) {
                  if (param1.endsWith(var3)) {
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
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static int a(int param0, int param1) {
        if (param1 >= -80) {
            return 109;
        }
        return em.field_W[param0];
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    cr() {
    }

    final static boolean a(byte param0) {
        int var1 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var1 = 35 / ((-63 - param0) / 49);
        if (null == pk.field_b) {
          if (!oe.a(123)) {
            if (null == bk.field_i) {
              if (nc.a((byte) 68)) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
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
        field_i = new cj();
        field_g = "Zombies are your thing if you have this trait equipped. You'll gain more Research Points from any zombies that return through your portal.";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eba extends pb {
    private java.lang.ref.SoftReference field_o;

    eba(Object param0, int param1) {
        super(param1);
        ((eba) this).field_o = new java.lang.ref.SoftReference(param0);
    }

    final boolean a(int param0) {
        if (param0 != 14646) {
            return false;
        }
        return true;
    }

    final static int a(CharSequence param0, int param1, int param2) {
        if (param1 >= -19) {
            return 56;
        }
        return fsa.a(57, param2, true, param0);
    }

    final static String a(byte param0, String param1) {
        if (oj.field_vb.startsWith("win")) {
            return param1 + ".dll";
        }
        if (oj.field_vb.startsWith("linux")) {
            return "lib" + param1 + ".so";
        }
        if (!(!oj.field_vb.startsWith("mac"))) {
            return "lib" + param1 + ".dylib";
        }
        int var2 = -116 / ((param0 - -73) / 40);
        return null;
    }

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 == 6912) {
          var2 = param0.charAt(0);
          var3 = 1;
          L0: while (true) {
            if (param0.length() > var3) {
              if (param0.charAt(var3) == var2) {
                var3++;
                continue L0;
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0) {
          L0: {
            if (era.field_d != null) {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            } else {
              if (!vo.field_b) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final Object f(int param0) {
        if (param0 != 29243) {
            Object discarded$0 = ((eba) this).f(-86);
            return ((eba) this).field_o.get();
        }
        return ((eba) this).field_o.get();
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mf extends ra implements uj {
    static gd field_f;
    static int[] field_g;
    private ul field_e;

    abstract fi a(byte param0, String param1);

    public final void a(ul param0, byte param1) {
        if (param1 != 83) {
            field_f = null;
        }
    }

    public final boolean a(boolean param0) {
        Object var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          if (null != ((mf) this).field_e.field_B) {
            if (0 == ((mf) this).field_e.field_B.length()) {
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
          var3 = null;
          ((mf) this).a((ul) null, (byte) -119);
          if (null == ((mf) this).field_e.field_B) {
            return true;
          } else {
            L0: {
              if (0 != ((mf) this).field_e.field_B.length()) {
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

    final static boolean c(int param0) {
        if (param0 < 101) {
            return true;
        }
        return sg.a((byte) -111, ii.b(false));
    }

    mf(ul param0) {
        ((mf) this).field_e = param0;
    }

    final String b(byte param0) {
        if (param0 < 102) {
            return null;
        }
        return ((mf) this).a(((mf) this).field_e.field_B, true);
    }

    final fi c(boolean param0) {
        if (!param0) {
          ((mf) this).field_e = null;
          return ((mf) this).a((byte) -68, ((mf) this).field_e.field_B);
        } else {
          return ((mf) this).a((byte) -68, ((mf) this).field_e.field_B);
        }
    }

    abstract String a(String param0, boolean param1);

    public final void a(int param0, ul param1) {
        ((mf) this).b(-47);
        if (param0 != 32175) {
            Object var4 = null;
            ((mf) this).a((ul) null, (byte) 73);
        }
    }

    public static void d(int param0) {
        if (param0 <= 66) {
            boolean discarded$0 = mf.c(95);
            field_f = null;
            field_g = null;
            return;
        }
        field_f = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[8192];
    }
}

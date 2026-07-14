/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    private String field_b;
    static String field_d;
    private boolean field_c;
    static db field_i;
    static String field_g;
    static int[] field_e;
    static String field_a;
    static boolean field_f;
    static db field_h;

    hc(String param0) {
        this(param0, false);
    }

    final static String b(byte param0) {
        if (param0 < -105) {
          if (sk.field_a == in.field_Gb) {
            return kf.field_a;
          } else {
            return vh.field_o;
          }
        } else {
          field_d = null;
          if (sk.field_a == in.field_Gb) {
            return kf.field_a;
          } else {
            return vh.field_o;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param1 != 27901) {
                    field_f = true;
                }
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                param0.getAppletContext().showDocument(nm.a(param0, var2, -31843), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    hc(String param0, boolean param1) {
        ((hc) this).field_b = param0;
        ((hc) this).field_c = param1 ? true : false;
        if (((hc) this).field_b == null) {
            ((hc) this).field_b = "";
        }
        if (((hc) this).field_b.length() == 0) {
            ((hc) this).field_c = false;
        }
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1) {
          L0: {
            field_a = null;
            if (hb.field_Gb != sk.field_a) {
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
            if (hb.field_Gb != sk.field_a) {
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

    final String b(int param0) {
        int var2 = -73 % ((19 - param0) / 42);
        return ((hc) this).field_b;
    }

    public static void a(byte param0) {
        field_h = null;
        field_a = null;
        field_d = null;
        if (param0 != -60) {
          hc.a((byte) -54);
          field_e = null;
          field_g = null;
          field_i = null;
          return;
        } else {
          field_e = null;
          field_g = null;
          field_i = null;
          return;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return ((hc) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Location";
        field_i = new db();
        field_g = "You can only cast this spell once per turn";
        field_a = "Character's Spells";
        field_h = new db();
    }
}

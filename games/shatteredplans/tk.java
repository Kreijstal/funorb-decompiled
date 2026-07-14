/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends jc {
    int field_A;
    ob field_D;
    static bi field_x;
    static String field_B;
    static long field_z;
    byte field_w;
    static String[] field_v;
    static int field_y;
    static nq field_C;

    final int e(int param0) {
        if (null == ((tk) this).field_D) {
          return 0;
        } else {
          if (param0 != 0) {
            return 19;
          } else {
            return 100 * ((tk) this).field_D.field_j / (-((tk) this).field_w + ((tk) this).field_D.field_h.length);
          }
        }
    }

    final byte[] e(byte param0) {
        if (!((tk) this).field_u) {
          if (-((tk) this).field_w + ((tk) this).field_D.field_h.length <= ((tk) this).field_D.field_j) {
            if (param0 <= 48) {
              int discarded$2 = ((tk) this).e(92);
              return ((tk) this).field_D.field_h;
            } else {
              return ((tk) this).field_D.field_h;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    public static void d(boolean param0) {
        Object var2 = null;
        field_x = null;
        field_B = null;
        if (param0) {
          var2 = null;
          boolean discarded$2 = tk.a(4L, (String) null, true, (int[]) null, 74);
          field_C = null;
          field_v = null;
          return;
        } else {
          field_C = null;
          field_v = null;
          return;
        }
    }

    tk() {
    }

    final static void a(int param0, int param1, byte param2) {
        sl var3 = null;
        if (param2 != -2) {
          tk.d(false);
          var3 = js.field_f;
          var3.h(param0, 255);
          var3.c(3, (byte) -71);
          var3.c(9, (byte) -110);
          var3.d(param1, 255);
          return;
        } else {
          var3 = js.field_f;
          var3.h(param0, 255);
          var3.c(3, (byte) -71);
          var3.c(9, (byte) -110);
          var3.d(param1, 255);
          return;
        }
    }

    final static boolean a(long param0, String param1, boolean param2, int[] param3, int param4) {
        vm var6 = null;
        String stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        String stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        if (j.a(2, param3, param1, param4, param0)) {
          if (param2) {
            return false;
          } else {
            L0: {
              if (param4 == 1) {
                param4 = 0;
                break L0;
              } else {
                break L0;
              }
            }
            em.field_h = param4;
            gi.field_a = param1;
            stackOut_6_0 = (String) param1;
            stackOut_6_1 = 1;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            nd.field_k = ji.a((CharSequence) (Object) stackIn_8_0, stackIn_8_1 != 0);
            hd.field_k = param0;
            var6 = bo.a(param3, (byte) -112, nl.field_d, hl.field_I, kh.field_Nb);
            sl.a(0, var6);
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
        field_B = "Send private message to <%0>";
    }
}

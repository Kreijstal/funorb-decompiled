/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kca extends kma implements cd {
    static int field_h;
    static int field_g;
    private tra field_i;
    static int field_f;

    abstract it a(byte param0, String param1);

    abstract String a(int param0, String param1);

    final String e(int param0) {
        if (param0 != 1890) {
          field_h = -23;
          return ((kca) this).a(-1, ((kca) this).field_i.field_o);
        } else {
          return ((kca) this).a(-1, ((kca) this).field_i.field_o);
        }
    }

    public final boolean a(boolean param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          if (null != ((kca) this).field_i.field_o) {
            if (((kca) this).field_i.field_o.length() == 0) {
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
          field_g = 101;
          if (null == ((kca) this).field_i.field_o) {
            return true;
          } else {
            L0: {
              if (((kca) this).field_i.field_o.length() != 0) {
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

    public final void a(int param0, tra param1) {
        if (param0 != -6038) {
            Object var4 = null;
            ((kca) this).a(46, (tra) null);
        }
    }

    public final void a(tra param0, int param1) {
        if (param1 != -10) {
            return;
        }
        ((kca) this).c(-99);
    }

    kca(tra param0) {
        ((kca) this).field_i = param0;
    }

    final it d(int param0) {
        if (param0 != -1891) {
          it discarded$2 = ((kca) this).d(102);
          return ((kca) this).a((byte) 14, ((kca) this).field_i.field_o);
        } else {
          return ((kca) this).a((byte) 14, ((kca) this).field_i.field_o);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = -1;
        field_f = 0;
    }
}

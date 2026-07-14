/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class na extends dw implements pw {
    static jj field_c;
    private dh field_d;

    abstract gf a(byte param0, String param1);

    public final void a(dh param0, int param1) {
        if (param1 >= -41) {
            ((na) this).field_d = null;
        }
    }

    public final boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -8003) {
          if (null != ((na) this).field_d.field_m) {
            if (0 == ((na) this).field_d.field_m.length()) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    final String d(int param0) {
        if (param0 > -93) {
            return null;
        }
        return ((na) this).a(0, ((na) this).field_d.field_m);
    }

    public final void a(dh param0, byte param1) {
        ((na) this).a((byte) -101);
        if (param1 > -127) {
            Object var4 = null;
            wb discarded$0 = na.a(-98, -50, (ki) null, -100);
        }
    }

    final static wb a(int param0, int param1, ki param2, int param3) {
        if (k.a(param2, param0, param3, param1 ^ 30429)) {
          if (param1 != -11481) {
            return null;
          } else {
            return tj.c((byte) -8);
          }
        } else {
          return null;
        }
    }

    final gf b(byte param0) {
        if (param0 != 114) {
          field_c = null;
          return ((na) this).a((byte) 26, ((na) this).field_d.field_m);
        } else {
          return ((na) this).a((byte) 26, ((na) this).field_d.field_m);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
    }

    abstract String a(int param0, String param1);

    na(dh param0) {
        ((na) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new jj("");
    }
}

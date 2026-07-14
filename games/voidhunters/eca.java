/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eca extends sc implements en {
    static int field_e;
    static String field_d;
    private uf field_c;

    final String d(int param0) {
        Object var3 = null;
        if (param0 != 16384) {
          var3 = null;
          qrb discarded$2 = ((eca) this).a((String) null, -101);
          return ((eca) this).b(((eca) this).field_c.field_j, -1);
        } else {
          return ((eca) this).b(((eca) this).field_c.field_j, -1);
        }
    }

    final qrb b(int param0) {
        if (param0 != -1) {
          field_d = null;
          return ((eca) this).a(((eca) this).field_c.field_j, 16384);
        } else {
          return ((eca) this).a(((eca) this).field_c.field_j, 16384);
        }
    }

    public final void a(uf param0, byte param1) {
        if (param1 != 100) {
            return;
        }
        ((eca) this).a(20);
    }

    public final boolean b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 <= -100) {
          if (((eca) this).field_c.field_j != null) {
            if (((eca) this).field_c.field_j.length() == 0) {
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
          ((eca) this).field_c = null;
          if (((eca) this).field_c.field_j == null) {
            return true;
          } else {
            L0: {
              if (((eca) this).field_c.field_j.length() != 0) {
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

    public static void e(int param0) {
        if (param0 != -27183) {
            field_d = null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    public final void a(int param0, uf param1) {
        if (param0 != -12409) {
            Object var4 = null;
            ((eca) this).a((uf) null, (byte) 43);
        }
    }

    eca(uf param0) {
        ((eca) this).field_c = param0;
    }

    abstract qrb a(String param0, int param1);

    abstract String b(String param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Halve custom variables";
        field_e = 16384;
    }
}

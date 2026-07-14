/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class di extends v implements se {
    static int field_i;
    private lb field_k;
    static String field_l;
    static String field_j;
    static int field_h;

    final String b(byte param0) {
        if (param0 != 22) {
            return null;
        }
        return ((di) this).a(((di) this).field_k.field_s, 426);
    }

    public final boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 24685) {
          if (((di) this).field_k.field_s != null) {
            if (((di) this).field_k.field_s.length() == 0) {
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
          String discarded$6 = ((di) this).b((byte) 69);
          if (((di) this).field_k.field_s == null) {
            return true;
          } else {
            L0: {
              if (((di) this).field_k.field_s.length() != 0) {
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

    final ud f(int param0) {
        int var2 = -119 / ((-30 - param0) / 56);
        return ((di) this).a(-120, ((di) this).field_k.field_s);
    }

    public final void a(int param0, lb param1) {
        ((di) this).a(52);
        if (param0 != -12230) {
            boolean discarded$0 = ((di) this).b(30);
        }
    }

    abstract String a(String param0, int param1);

    public final void b(int param0, lb param1) {
        if (param0 >= -23) {
            di.c((byte) -43);
        }
    }

    di(lb param0) {
        ((di) this).field_k = param0;
    }

    public static void c(byte param0) {
        field_l = null;
        if (param0 != 73) {
            return;
        }
        field_j = null;
    }

    abstract ud a(int param0, String param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Orb coins: <%0>";
        field_j = "Age:";
    }
}

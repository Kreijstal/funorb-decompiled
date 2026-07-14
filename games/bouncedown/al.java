/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al extends ck implements gl {
    static long field_h;
    static String field_g;
    private ba field_i;

    public static void c(int param0) {
        field_g = null;
        if (param0 != 24562) {
            al.c(52);
        }
    }

    public final boolean b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 <= -8) {
          if (((al) this).field_i.field_h != null) {
            if (((al) this).field_i.field_h.length() == 0) {
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
          field_h = 36L;
          if (((al) this).field_i.field_h == null) {
            return true;
          } else {
            L0: {
              if (((al) this).field_i.field_h.length() != 0) {
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

    public final void a(byte param0, ba param1) {
        int var3 = 79 % ((param0 - 0) / 33);
    }

    public final void a(ba param0, byte param1) {
        if (param1 <= 81) {
            vf discarded$0 = ((al) this).b(-77);
            ((al) this).d((byte) 92);
            return;
        }
        ((al) this).d((byte) 92);
    }

    abstract String a(String param0, byte param1);

    final vf b(int param0) {
        if (param0 != -1) {
          field_h = 47L;
          return ((al) this).b(((al) this).field_i.field_h, (byte) 54);
        } else {
          return ((al) this).b(((al) this).field_i.field_h, (byte) 54);
        }
    }

    abstract vf b(String param0, byte param1);

    al(ba param0) {
        ((al) this).field_i = param0;
    }

    final String a(int param0) {
        if (param0 != 8335) {
          vf discarded$2 = ((al) this).b(103);
          return ((al) this).a(((al) this).field_i.field_h, (byte) -114);
        } else {
          return ((al) this).a(((al) this).field_i.field_h, (byte) -114);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}

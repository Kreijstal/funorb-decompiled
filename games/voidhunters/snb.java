/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class snb extends rqa {
    final static boolean a(rsb param0, byte param1) {
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var2 = 92 % ((49 - param1) / 54);
        if (param0.field_e.c(1)) {
          if (1 != param0.field_e.d((byte) -128) % 2) {
            return false;
          } else {
            L0: {
              if (qta.a(param0.field_e.d(6472), 9)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(96, 89));
    }

    snb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}

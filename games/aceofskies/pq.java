/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends vo {
    pq(bm param0) {
        super(param0);
    }

    final pt a(String param0, int param1) {
        int var3 = 0;
        String var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (null != ai.a(param0, (byte) 12)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (var3 != 0) {
          if (param1 != 8192) {
            var4 = (String) null;
            String discarded$2 = ((pq) this).a((String) null, (byte) 9);
            return fd.field_a;
          } else {
            return fd.field_a;
          }
        } else {
          return bt.field_a;
        }
    }

    final String a(String param0, byte param1) {
        if (((pq) this).a(param0, param1 ^ 8264) == bt.field_a) {
            return fd.field_e;
        }
        if (param1 != 72) {
            return (String) null;
        }
        return gh.field_o;
    }

    static {
    }
}

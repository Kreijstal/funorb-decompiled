/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends pi {
    static String field_s;
    byte[] field_t;
    static int field_u;
    boolean field_q;
    static int[] field_p;
    static String[] field_o;
    static String[][] field_n;
    static String field_r;

    af() {
    }

    public static void a(int param0) {
        field_n = (String[][]) null;
        field_r = null;
        field_p = null;
        field_o = null;
        if (param0 == -12707) {
          field_s = null;
          return;
        }
        field_p = (int[]) null;
        field_s = null;
    }

    final static int a(sb param0, ta param1, int param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          var8 = new StringBuilder(8);
          var4 = 0;
          var5 = -1;
          while (true) {
            if (param0.field_u.length > param0.field_o) {
              var5 = param0.d((byte) -54);
              if ((~nn.field_l != ~var5 ||
                var4 != 0) &&
                (!ne.a(var5, uf.field_q, param0, (byte) -99) ||
                var4 != 0)) {
                if (var5 != el.field_d) {
                  discarded$0 = var8.append((char)var5);
                  continue;
                }
                boolean decompiledFrameRemainder0 = true;
                if (var4 != 0) {
                  if (param0.field_o + 1 == param0.field_u.length) {
                    throw new RuntimeException("Unterminated quote!");
                  }
                  var6 = param0.m(4);
                  if (!ne.a(var6, uf.field_q, param0, (byte) -81) &&
                    nn.field_l != var6) {
                    if (var6 == el.field_d) {
                      discarded$1 = var8.append((char)var6);
                    } else {
                      param0.field_o = param0.field_o - 1;
                      discarded$2 = var8.append((char)var5);
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    param0.field_o = param0.field_o - 1;
                  }
                }
                stackIn_25_0 = (var4 != 0) ? 0 : 1;
                var4 = stackIn_25_0;
                continue;
              }
            }
            break;
          }
          if (param2 > -58) {
            af.a(127);
          }
          param1.a((byte) -105, new lj(var8.toString()));
          stackIn_30_0 = var5;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("af.A(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_o = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_s = "Retry";
        field_n = new String[][]{null, new String[]{"Freezium: Freezium is worth 1,000 points. It's cold to the touch! It chills any nearby water making it dangerously cold."}};
        field_r = "Cost: <%0>";
    }
}

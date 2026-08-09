/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static String[] field_g;
    static cn field_c;
    static String field_d;
    static String field_f;
    static int field_a;
    static String field_e;
    static volatile boolean field_b;

    public static void b(int param0) {
        field_g = null;
        if (param0 != 64) {
            rn.a(93);
        }
        field_d = null;
        field_c = null;
        field_f = null;
        field_e = null;
    }

    final static byte[] a(int param0, int param1, int param2, byte[] param3) {
        byte[] var4 = null;
        int var5_int = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        ol var5 = null;
        byte[] var6 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (0 >= param1) {
                var4 = param3;
                break L1;
              } else {
                var8 = new byte[param0];
                var4 = var8;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= param0) {
                    break L1;
                  } else {
                    var8[var5_int] = param3[param1 + var5_int];
                    var5_int++;
                    continue L2;
                  }
                }
              }
            }
            var5 = new ol();
            var5.b(param2 ^ 116);
            var5.a((long)(param0 * param2), 17567, var4);
            var6 = new byte[64];
            var5.a((byte) -88, var6, 0);
            stackIn_7_0 = (byte[]) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("rn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static int a(int param0) {
        if (param0 > -66) {
            return -64;
        }
        return wk.field_g;
    }

    static {
        field_g = new String[]{null, "You need to recruit some raiders in order to raid another dungeon.<br><br><%command>Recruit a party of raiders, then exit this page by clicking on the 'Confirm' button at the top-left of the screen.</col>"};
        field_d = "Use special abilities before combat begins.";
        field_e = "From only <%0>/month";
        field_f = "Troglodytes may well be less evolved creatures and not too bright, but that doesn't stop their clubs from crushing raiders' bones.";
        field_b = true;
    }
}

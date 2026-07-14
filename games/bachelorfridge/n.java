/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    private boolean field_b;
    static String field_d;
    private String field_e;
    private boolean field_a;
    static String field_c;

    final void a(boolean param0, int param1) {
        ((n) this).field_a = param0 ? true : false;
        if (param1 != 1537025605) {
            return;
        }
        ((n) this).field_b = true;
    }

    final String b(int param0) {
        if (param0 != 25477) {
            field_c = null;
            return ((n) this).field_e;
        }
        return ((n) this).field_e;
    }

    final static pp a(lu param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        nq var9 = null;
        nq var10 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 > -126) {
          L0: {
            var8 = null;
            pp discarded$1 = n.a((lu) null, -83);
            var9 = qi.a(param0, (byte) 123);
            var3 = param0.e((byte) 126);
            if (0 == (var3 & 32768)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          var4 = stackIn_8_0;
          var5 = var3 & 32767;
          var3 = param0.b(16711935);
          var5 = -16384 + (var5 ^ 16384);
          var6 = var3 >> 1537025605;
          var7 = param0.b(16711935);
          return (pp) (Object) new iv(var9, var4 != 0, var6, var5, var7);
        } else {
          L1: {
            var10 = qi.a(param0, (byte) 123);
            var3 = param0.e((byte) 126);
            if (0 == (var3 & 32768)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var4 = stackIn_4_0;
          var5 = var3 & 32767;
          var3 = param0.b(16711935);
          var5 = -16384 + (var5 ^ 16384);
          var6 = var3 >> 1537025605;
          var7 = param0.b(16711935);
          return (pp) (Object) new iv(var10, var4 != 0, var6, var5, var7);
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        return ((n) this).field_b;
    }

    public static void a(byte param0) {
        if (param0 < 81) {
            n.a((byte) 118);
            field_c = null;
            field_d = null;
            return;
        }
        field_c = null;
        field_d = null;
    }

    final boolean a(int param0) {
        if (param0 != -7750) {
            Object var3 = null;
            pp discarded$0 = n.a((lu) null, 124);
            return ((n) this).field_a;
        }
        return ((n) this).field_a;
    }

    n(String param0) {
        ((n) this).field_a = false;
        ((n) this).field_b = false;
        ((n) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "The blue square shows where your creature can move to, click any blue square to command your creature to move there.";
        field_c = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}

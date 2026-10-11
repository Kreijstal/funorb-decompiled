/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu {
    static b field_b;
    static String field_a;

    final static boolean a(int param0) {
        int var1 = -61 / ((-54 - param0) / 62);
        if (oa.field_I != null) {
          return oa.field_I.a(-30847, ui.field_i, rs.field_q);
        }
        return false;
    }

    final static NodeDeque a(boolean param0, String param1) {
        NodeDeque var2 = null;
        mt var3 = null;
        int var4 = 0;
        int var5 = 0;
        NodeDeque stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0) {
            gu.a(102);
          }
          var2 = new NodeDeque();
          var3 = new mt(param1);
          while (!var3.a((byte) 16)) {
            var4 = var3.b(-1);
            if (Character.isWhitespace((char) var4)) {
              continue;
            }
            if (var4 != 34 &&
              var4 != 39) {
              if (var4 == 40) {
                var2.addLast((byte) -119, (IntrusiveNode) (new og(mo.field_j, -1 + var3.field_c)));
                continue;
              }
              if (var4 == 41) {
                var2.addLast((byte) -119, (IntrusiveNode) (new og(gm.field_d, -1 + var3.field_c)));
                continue;
              }
              if (44 != var4) {
                var2.addLast((byte) -119, (IntrusiveNode) (bi.a((byte) -118, var3)));
                continue;
              }
              var2.addLast((byte) -119, (IntrusiveNode) (new og(sb.field_d, var3.field_c - 1)));
              continue;
            }
            var2.addLast((byte) -119, (IntrusiveNode) (BestScoreStrategy.a((byte) 121, var3)));
          }
          stackIn_18_0 = var2;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("gu.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != -16356) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = vl.field_n;
        if (param0 < -31) {
          var2.h(32161, param1);
          var2.b(1, 1);
          var2.b(1, 0);
          return;
        }
        field_a = (String) null;
        var2.h(32161, param1);
        var2.b(1, 1);
        var2.b(1, 0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = "Connection timed out. Please try using a different server.";
    }
}

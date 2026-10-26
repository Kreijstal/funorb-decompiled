/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static SpriteData[] brassButtonSpriteData;
    static String field_a;
    static SpriteData coinSpriteData;

    final static void a(int param0) {
        if (param0 != -26317) {
          return;
        }
        tt.b(-32546);
        if (ci.field_f != null) {
          pg.a(ci.field_f, 116);
          ic.a(0);
          to.h(param0 ^ -26318);
          bl.c(-18535);
          if (je.a(false)) {
            q.outgoingPacket.writeCipheredOpcode(54, 1);
            fr.a(param0 + 26270, 0);
            te.b(true);
            return;
          }
          te.b(true);
          return;
        }
        ic.a(0);
        to.h(param0 ^ -26318);
        bl.c(-18535);
        if (!je.a(false)) {
          te.b(true);
          return;
        }
        q.outgoingPacket.writeCipheredOpcode(54, 1);
        fr.a(param0 + 26270, 0);
        te.b(true);
    }

    final static boolean a(int param0, CharSequence param1) {
        String stackIn_8_2 = null;
        try {
          if (param0 == 10) {
            boolean stackIn_4_0 = aa.a(true, 10, param1, (byte) -43);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var2;
          StringBuilder stackIn_7_1 = new StringBuilder().append("vl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        brassButtonSpriteData = null;
        if (param0 != 8664) {
          return;
        }
        field_a = null;
        coinSpriteData = null;
    }

    static {
        field_a = "Cancel";
    }
}

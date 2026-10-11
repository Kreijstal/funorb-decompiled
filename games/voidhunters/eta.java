/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eta implements dja {
    static java.awt.Dimension field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 > 109) {
          return;
        }
        field_a = (java.awt.Dimension) null;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          field_a = (java.awt.Dimension) null;
          return (tv[]) ((Object) new ara[param1]);
        }
        return (tv[]) ((Object) new ara[param1]);
    }

    final static void a(byte param0, mm param1) {
        mm var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          param1.b(-3846);
          var2 = (mm) (kja.field_E.d(0));
          if (param0 < 99) {
            return;
          }
          while (var2 != null) {
            if (var2.a(param1, -128)) {
              var2 = (mm) (kja.field_E.a((byte) 28));
              continue;
            }
            break;
          }
          if (var2 == null) {
            kja.field_E.b(-10258, param1);
            return;
          }
          al.a(param1, var2, 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_12_0 = var2_ref;
          stackIn_12_1 = new StringBuilder().append("eta.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param1 != -1104) {
          return false;
        }
        return (param2 & 2048) != 0 ? true : false;
    }

    public final tv a(byte param0) {
        int var2 = 31 % ((param0 + 64) / 50);
        return (tv) ((Object) new ara());
    }

    static {
        field_a = new java.awt.Dimension(640, 480);
        field_b = 4;
    }
}

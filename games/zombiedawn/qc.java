/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static String field_b;
    static int field_a;

    final static void a(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = ZombieDawn.field_J;
        try {
          var1_int = je.field_b[0];
          for (var2 = param0; je.field_b.length > var2; var2++) {
            var3 = je.field_b[var2];
            gp.a(uf.field_o, var2 << 4, uf.field_o, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "qc.B(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        le var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = ZombieDawn.field_J;
        try {
          var1 = kn.field_L.b((byte) 26);
          while (var1 instanceof tm) {
            pc.a((byte) 13, ((tm) (var1)).field_j);
            var1 = var1.field_b;
          }
          var1 = se.field_m.b((byte) 26);
          while (var1 instanceof tm) {
            pc.a((byte) 13, ((tm) (var1)).field_j);
            var1 = var1.field_b;
          }
          if (param0 != 1400888196) {
            return;
          }
          var1 = rm.field_e.b((byte) 26);
          while (var1 instanceof tm) {
            pc.a((byte) 13, ((tm) (var1)).field_j);
            var1 = var1.field_b;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "qc.A(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 <= 42) {
          return;
        }
        field_b = null;
    }

    static {
        field_b = "UK Expansion";
        field_a = 70;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class se {
    static int field_b;
    static String field_a;
    static wf field_c;

    abstract void a(int param0, java.awt.Component param1);

    final static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        hc var4_ref_hc = null;
        Object var5 = null;
        int var6 = 0;
        km var8 = null;
        bc var9 = null;
        byte[] var13 = null;
        var6 = TetraLink.field_J;
        try {
          if (param0) {
            field_c = (wf) null;
          }
          var9 = kb.field_q;
          var2 = var9.d((byte) -99);
          if (0 == var2) {
            var8 = (km) (ph.field_F.c(false));
            if (var8 == null) {
              mk.a(false);
              return;
            }
            var4 = var9.d((byte) -99);
            if (0 == var4) {
              var5 = null;
            } else {
              var13 = new byte[var4];
              var9.b(var4, 0, var13, 126);
            }
            var9.field_t = var9.field_t + 4;
            if (!var9.h(4)) {
              mk.a(param0);
              return;
            }
            var8.b(false);
            return;
          }
          if (var2 != 1) {
            fk.a(-83, (Throwable) null, "A1: " + hc.a(false));
            mk.a(false);
            return;
          }
          var3 = var9.f(-122);
          var4_ref_hc = (hc) (nc.field_f.c(false));
          while (var4_ref_hc != null) {
            if (var4_ref_hc.field_t != var3) {
              var4_ref_hc = (hc) (nc.field_f.a((byte) -70));
              continue;
            }
            break;
          }
          if (var4_ref_hc == null) {
            mk.a(false);
            return;
          }
          var4_ref_hc.b(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "se.E(" + param0 + ')');
        }
    }

    abstract void b(int param0, java.awt.Component param1);

    public static void b(int param0) {
        field_c = null;
        if (param0 != -1) {
          se.a(true);
          field_a = null;
          return;
        }
        field_a = null;
    }

    abstract int a(int param0);

    static {
        field_a = "Waiting for music";
        field_b = -1;
    }
}

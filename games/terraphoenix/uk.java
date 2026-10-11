/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static wl field_b;
    static String[] field_a;
    static boolean field_c;

    final static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        jh var3_ref_jh = null;
        cc var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        uc var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        var6 = Terraphoenix.field_V;
        try {
          boolean decompiledFrameRemainder0 = true;
          var8 = mk.field_j;
          var2 = var8.a(-16384);
          if (0 != var2) {
            if (var2 == 1) {
              var3 = var8.f((byte) -107);
              var4 = (cc) (qb.field_a.d(9272));
              while (var4 != null) {
                if (var3 != var4.field_k) {
                  var4 = (cc) (qb.field_a.e((byte) -119));
                  continue;
                }
                break;
              }
              if (var4 != null) {
                var4.b((byte) 12);
                decompiledFrameRemainder0 = false;
              }
              else {
                gb.g(-17464);
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              bd.a((Throwable) null, "A1: " + r.i(-15465), 117);
              gb.g(-17464);
            }
          } else {
            var3_ref_jh = (jh) (qc.field_a.d(9272));
            if (var3_ref_jh == null) {
              gb.g(-17464);
              return;
            }
            var4_int = var8.a(-16384);
            if (var4_int == 0) {
              var5 = null;
            } else {
              var10 = new byte[var4_int];
              var9 = var10;
              var7 = var9;
              var5 = var7;
              var8.a(var4_int, 0, 90, var10);
            }
            var8.field_k = var8.field_k + 4;
            if (!var8.c(0)) {
              gb.g(-17464);
              return;
            }
            var3_ref_jh.field_i = true;
            var3_ref_jh.field_j = (byte[]) (var5);
            var3_ref_jh.b((byte) 12);
          }
          if (param0) {
            return;
          }
          uk.a(-74);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "uk.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 > -28) {
          field_c = true;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}

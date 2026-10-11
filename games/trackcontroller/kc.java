/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int[][] field_c;
    static int field_b;
    static String field_a;

    final static void a(int param0, byte param1, ei param2) {
        la var6 = null;
        int var4 = 0;
        try {
          var6 = ra.field_C;
          var6.c(param0, 7);
          var6.field_k = var6.field_k + 1;
          var4 = var6.field_k;
          var6.a(1, (byte) -75);
          if (param2.field_l == null) {
            var6.a(0, (byte) -81);
          } else {
            var6.a(param2.field_l.length, (byte) -102);
            var6.a(param2.field_l.length, 96, 0, param2.field_l);
          }
          var6.a(var4, false);
          var6.field_k = var6.field_k - 4;
          param2.field_n = var6.e((byte) 113);
          int var5 = -14 / ((param1 + 66) / 49);
          var6.a(true, -var4 + var6.field_k);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "kc.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        la var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        cf var11 = null;
        la var12 = null;
        int[] var13 = null;
        th var14 = null;
        th var15 = null;
        int[] var16 = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          if (param0 > -83) {
            field_c = (int[][]) null;
          }
          var12 = ne.field_a;
          var2 = var12.h(16383);
          if (var2 == 0) {
            var10 = lc.b(false);
            var16 = var10;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((be) ((Object) var5)).h(16383);
            for (var7 = 0; var6 > var7; var7++) {
              var9[var7] = ((be) ((Object) var5)).e((byte) 113);
            }
            var14 = (th) (fh.field_b.b(2));
            if (var14 == null) {
              lj.a((byte) 116);
              return;
            }
            var14.field_m = var16[0];
            var14.field_k = var3;
            var14.field_j = true;
            var14.a(-67);
            return;
          }
          if (var2 == 1) {
            var11 = (cf) (kd.field_b.b(2));
            if (var11 != null) {
              var11.a(-77);
              return;
            }
            lj.a((byte) 114);
            return;
          }
          if (var2 != 2) {
            hb.a((Throwable) null, 0, "A1: " + jc.b(96));
            lj.a((byte) 120);
            return;
          }
          var15 = (th) (fh.field_b.b(2));
          if (var15 == null) {
            lj.a((byte) 125);
            return;
          }
          var15.field_k = lc.b(false);
          var15.field_m = var15.field_k[0];
          var15.field_j = true;
          var15.a(-54);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "kc.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_c = (int[][]) null;
        field_a = null;
        if (param0 != 2) {
          field_a = (String) null;
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          String var3 = null;
          String var5 = null;
          String var4 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          try {
            sa.field_P = param2;
            try {
              var3 = param0.getParameter("cookieprefix");
              var5 = var3;
              var5Lifetime1 = var3;
              var4 = param0.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var5Lifetime4 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
              if (param2.length() == 0) {
                var5Lifetime4 = var5Lifetime4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              if (param1 != 1263) {
                kc.b(-38);
              }
              sj.a(param0, "document.cookie=\"" + var5Lifetime4 + "\"", -24531);
            } catch (Throwable throwable) {
            }
            rj.a(param0, (byte) -128);
          } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "kc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = 256;
        field_a = "Orb points: <%0>";
    }
}

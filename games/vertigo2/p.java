/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static String field_a;

    final static void a(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        mi var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        nf var11 = null;
        mi var12 = null;
        int[] var13 = null;
        hq var14 = null;
        hq var15 = null;
        int[] var16 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          var12 = id.field_f;
          var2 = var12.h(-11);
          if (param0 > -108) {
            field_a = (String) null;
          }
          if (var2 == 0) {
            var10 = mm.a(8);
            var16 = var10;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((ed) ((Object) var5)).h(-11);
            for (var7 = 0; var6 > var7; var7++) {
              var9[var7] = ((ed) ((Object) var5)).b(true);
            }
            var14 = (hq) (mo.field_h.a((byte) 100));
            if (var14 == null) {
              rm.b((byte) 88);
              return;
            }
            var14.field_o = true;
            var14.field_n = var3;
            var14.field_p = var16[0];
            var14.c(2);
            return;
          }
          if (1 == var2) {
            var11 = (nf) (ki.field_a.a((byte) 100));
            if (var11 == null) {
              rm.b((byte) 11);
              return;
            }
            var11.c(2);
            return;
          }
          if (var2 != 2) {
            ke.a((Throwable) null, "A1: " + or.a(117), 0);
            rm.b((byte) 89);
            return;
          }
          var15 = (hq) (mo.field_h.a((byte) 100));
          if (var15 == null) {
            rm.b((byte) 100);
            return;
          }
          var15.field_n = mm.a(8);
          var15.field_o = true;
          var15.field_p = var15.field_n[0];
          var15.c(2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "p.B(" + param0 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 == 376) {
          if (param1 >= 32 &&
            126 >= param1) {
            return true;
          }
          if (param1 >= 160 &&
            param1 <= 255) {
            return true;
          }
          if (param1 != 8364 &&
            param1 != 338 &&
            param1 != 8212 &&
            param1 != 339 &&
            376 != param1) {
            return false;
          }
          return true;
        }
        field_a = (String) null;
        if (param1 >= 32) {
          if (126 >= param1) {
            return true;
          }
          if (param1 >= 160 &&
            param1 <= 255) {
            return true;
          }
          if (param1 != 8364 &&
            param1 != 338 &&
            param1 != 8212 &&
            param1 != 339 &&
            376 != param1) {
            return false;
          }
          return true;
        }
        if (param1 < 160) {
          if (param1 != 8364 &&
            param1 != 338 &&
            param1 != 8212 &&
            param1 != 339 &&
            376 != param1) {
            return false;
          }
          return true;
        }
        if (param1 <= 255) {
          return true;
        }
        if (param1 == 8364) {
          return true;
        }
        if (param1 == 338) {
          return true;
        }
        if (param1 == 8212) {
          return true;
        }
        if (param1 == 339) {
          return true;
        }
        if (376 != param1) {
          return false;
        }
        return true;
    }

    final static void a(int param0) {
        ch.field_e.i(param0 ^ param0);
        if (null == bb.field_F) {
          bb.field_F = new fg(ch.field_e, eg.field_t);
        }
        ch.field_e.b(bb.field_F, 0);
    }

    public static void b(int param0) {
        if (param0 != 0) {
          p.b(36);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = "Please remove <%0> from your ignore list first.";
    }
}

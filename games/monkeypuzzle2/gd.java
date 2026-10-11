/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static String field_a;

    public static void a(int param0) {
        int var1 = 112 / ((param0 - 69) / 54);
        field_a = null;
    }

    final static void b(int param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (null != hj.field_D) {
            try {
              hj.field_D.a((byte) 89, 0L);
              hj.field_D.a(MonkeyPuzzle2.field_D.field_g, MonkeyPuzzle2.field_D.field_h, (byte) 34, 24);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + 24;
              if (param0 == -594181854) {
                return;
              }
              gd.b(-122);
              return;
            }
          }
          MonkeyPuzzle2.field_D.field_h = MonkeyPuzzle2.field_D.field_h + 24;
          if (param0 != -594181854) {
            gd.b(-122);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        bk var4_ref_bk = null;
        wf var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        hb var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param0 != 8) {
            return;
          }
          var10 = MonkeyPuzzle2.field_D;
          var2 = var10.a((byte) 114);
          var3 = var10.a((byte) 114);
          if (0 == var2) {
            var4_ref_bk = (bk) (wg.field_k.a((byte) -117));
            if (var4_ref_bk == null) {
              gk.a(-1);
              return;
            }
            var5_int = -var10.field_h + rc.field_f;
            var12 = var4_ref_bk.field_g;
            var11 = var12;
            var6 = var11;
            if (var12.length << 2 < var5_int) {
              var5_int = var12.length << 2;
            }
            for (var7 = 0; var5_int > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.a((byte) 114) << ch.a(var7 << 8, 768));
            }
            var4_ref_bk.c(-19822);
            return;
          }
          if (1 != var2) {
            kk.a("LR1: " + bh.a((byte) -128), (byte) 118, (Throwable) null);
            gk.a(-1);
            return;
          }
          var4 = var10.h(-129);
          var5 = (wf) (k.field_l.a((byte) -117));
          while (var5 != null) {
            if (var5.field_e != var3 ||
              var5.field_f != var4) {
              var5 = (wf) (k.field_l.d((byte) 63));
              continue;
            }
            break;
          }
          if (var5 != null) {
            var5.c(param0 - 19830);
            return;
          }
          gk.a(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "gd.A(" + param0 + ')');
        }
    }

    static {
        field_a = "Unpacking graphics";
    }
}

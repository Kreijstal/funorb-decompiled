/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static String field_b;
    static boolean[] field_a;
    static fn[] field_d;
    static PcmSampleStream field_c;

    final static void a(int param0, int param1, int param2) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          GameAppletShell.field_k = true;
          oh var3 = (oh) (wa.field_c.first(false));
          while (var3 != null) {
            if (var3.field_m < 0) {
              SoftwareRasterizer.e(var3.field_i - var3.field_s + param2, param0 + var3.field_q, var3.field_s, hi.field_q);
            } else {
              SoftwareRasterizer.e(param2 + var3.field_i, param0 + var3.field_q, var3.field_s, hi.field_q);
            }
            var3 = (oh) (wa.field_c.next((byte) 70));
          }
          oh var3Lifetime1 = (oh) (QuickChatPhraseDefinition.field_u.first(false));
          while (var3Lifetime1 != null) {
            if (var3Lifetime1.field_m >= 0) {
              SoftwareRasterizer.g(param2 + var3Lifetime1.field_i, param0 + var3Lifetime1.field_q, var3Lifetime1.field_s, hi.field_q);
            } else {
              SoftwareRasterizer.g(var3Lifetime1.field_i + param2, param0 - var3Lifetime1.field_s + var3Lifetime1.field_q, var3Lifetime1.field_s, hi.field_q);
            }
            var3Lifetime1 = (oh) (QuickChatPhraseDefinition.field_u.next((byte) 70));
          }
          if (param1 < -5) {
            return;
          }
          field_c = (PcmSampleStream) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3_ref), "dj.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static char a(int param0, byte param1) {
        if (param0 > -34) {
          dj.a(-28, (byte) 6);
          int var2 = param1 & 255;
          if (0 == var2) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
          if (var2 < 128) {
            return (char)var2;
          }
          if (var2 < 160) {
            int var3 = IntrusiveDeque.field_c[-128 + var2];
            if (var3 == 0) {
              var3 = 63;
            }
            var2 = var3;
          }
          return (char)var2;
        }
        int var2Lifetime1 = param1 & 255;
        if (0 == var2Lifetime1) {
          throw new IllegalArgumentException("" + Integer.toString(var2Lifetime1, 16));
        }
        if (var2Lifetime1 < 128) {
          return (char)var2Lifetime1;
        }
        if (var2Lifetime1 >= 160) {
          return (char)var2Lifetime1;
        }
        int var3Lifetime1 = IntrusiveDeque.field_c[-128 + var2Lifetime1];
        if (var3Lifetime1 == 0) {
          var3Lifetime1 = 63;
        }
        int var2Lifetime2 = var3Lifetime1;
        return (char)var2Lifetime2;
    }

    final static int a(int param0) {
        int var2 = EscapeVector.obfuscationControl;
        try {
          bo.field_F.a(true, (byte) -33, oj.field_G, ph.field_a);
          bo.field_F.m(0);
          while (pn.p(-116)) {
            bo.field_F.a(jc.field_c, nk.field_n, (byte) -116);
          }
          if (param0 != 6445) {
            int stackIn_6_0 = -79;
            return stackIn_6_0;
          }
          if (-1 != rf.field_a) {
            int var1_int = rf.field_a;
            WhirlpoolHasher.a(-1, param0 - 6378);
            int stackIn_10_0 = var1_int;
            return stackIn_10_0;
          }
          if (ei.field_i) {
            int stackIn_13_0 = 3;
            return stackIn_13_0;
          }
          if (ui.field_b == dg.field_o) {
            int stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (!di.field_g.b(0)) {
            int stackIn_20_0 = 1;
            return stackIn_20_0;
          }
          if (dg.field_o != dn.field_q) {
            int stackIn_25_0 = -1;
            return stackIn_25_0;
          }
          int stackIn_23_0 = 2;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "dj.C(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        int var1 = 22 % ((param0 - 83) / 40);
        field_b = null;
    }

    static {
        field_b = null;
    }
}

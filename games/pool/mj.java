/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static Sprite field_b;
    static int[] field_a;
    static hj field_d;
    static String[][] field_c;
    static boolean field_e;

    final static int[] identityTransform(int param0) {
        if (param0 == -31121) {
          return new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        }
        return (int[]) null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_a = null;
        int var1 = 34 % ((param0 + 21) / 40);
        field_d = null;
        field_c = (String[][]) null;
    }

    final static void a(boolean param0) {
        if (!param0) {
          mj.identityTransform(-35);
          WhirlpoolHasher.a((byte) -120);
          MenuSelection.h(-13953);
          return;
        }
        WhirlpoolHasher.a((byte) -120);
        MenuSelection.h(-13953);
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        LobbyPlayer var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Pool.field_O;
        try {
          LobbyGame.field_Ac = false;
          tp.field_e = null;
          HighscoresScreen.field_L = null;
          if (param0 != 0) {
            mj.a(99, 12);
          }
          if (null != IntrusiveNode.field_i) {
            IntrusiveNode.field_i.d((byte) 49);
            IntrusiveNode.field_i = null;
          }
          ln.field_n = null;
          if (NetworkGameClient.field_A != null) {
            NetworkGameClient.field_A.d((byte) 117);
            NetworkGameClient.field_A = null;
          }
          lf.field_a = null;
          if (ck.field_W != null) {
            ck.field_W.d((byte) 78);
            ck.field_W = null;
          }
          LobbyPlayer.field_Qb = null;
          if (ln.field_n == null) {
            return;
          }
          var3 = (LobbyPlayer) (ln.field_n.firstForIteration((byte) -127));
          while (var3 != null) {
            var3.a(false);
            var3 = (LobbyPlayer) (ln.field_n.nextForIteration(param0 ^ 29));
          }
          ln.field_n = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "mj.D(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = JaggrabDownloader.field_j;
        if (param1 == 27712) {
          var2.writeCipheredOpcode(false, param0);
          var2.writeByte(2, false);
          var2.writeByte(4, false);
          var2.writeByte(HuffmanCodec.b(true), false);
          return;
        }
        mj.a(true);
        var2.writeCipheredOpcode(false, param0);
        var2.writeByte(2, false);
        var2.writeByte(4, false);
        var2.writeByte(HuffmanCodec.b(true), false);
    }

    static {
        field_d = new hj(10, 2, 2, 0);
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static String field_b;
    static hb[] field_e;
    static String field_c;
    static int field_d;
    static int field_a;

    final static void a(int param0, byte param1) {
        hf var2 = null;
        int var3 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        hf var2Lifetime1;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          ck.field_f = param0;
          if (param1 >= -114) {
            return;
          }
          var2 = (hf) (ba.field_b.beginForward((byte) 117));
          while (var2 != null) {
            if (!var2.field_f.isLinked(true)) {
              var2.unlink(57);
            } else {
              var2.field_h.setVolume(128 + ck.field_f * var2.field_j >> 8);
            }
            var2 = (hf) (ba.field_b.nextForward(853));
          }
          if (null != bg.field_a) {
            var2Lifetime1 = (hf) (bg.field_a.beginForward((byte) 116));
            while (var2Lifetime1 != null) {
              stackIn_14_0 = var2Lifetime1.field_f.isLinked(true);
              if (stackIn_14_0) {
                var2Lifetime1.field_h.setVolume(128 + var2Lifetime1.field_j * ck.field_f >> 8);
              } else {
                var2Lifetime1.unlink(57);
              }
              var2Lifetime1 = (hf) (bg.field_a.nextForward(853));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.wrapClientException((Throwable) ((Object) var2_ref), "ce.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void clearStaticReferences(boolean param0) {
        field_c = null;
        if (!param0) {
          return;
        }
        field_e = null;
        field_b = null;
    }

    final static boolean a(int param0) {
        int var1 = 105 / ((52 - param0) / 61);
        if (GameAppletShell.field_c == -1) {
          if (!AccountRequestState.a(true, 1)) {
            return false;
          }
          GameAppletShell.field_c = NetworkArchiveRequest.field_t.readUnsignedByte((byte) 90);
          NetworkArchiveRequest.field_t.position = 0;
        }
        if (GameAppletShell.field_c == -2) {
          if (AccountRequestState.a(true, 2)) {
            GameAppletShell.field_c = NetworkArchiveRequest.field_t.readUnsignedShort(98203176);
            NetworkArchiveRequest.field_t.position = 0;
            return AccountRequestState.a(true, GameAppletShell.field_c);
          }
          return false;
        }
        return AccountRequestState.a(true, GameAppletShell.field_c);
    }

    static {
        int var0 = 0;
        field_e = new hb[255];
        field_b = "Your email address is used to identify this account";
        field_c = null;
        for (var0 = 0; field_e.length > var0; var0++) {
          field_e[var0] = new hb();
        }
        field_d = -1;
    }
}

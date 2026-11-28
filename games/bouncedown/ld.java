/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends IntrusiveNode {
    static MidiPcmStream field_l;
    boolean field_g;
    int field_k;
    static RgbSprite[] field_h;
    int[] field_i;
    static int[] field_j;

    final static void b(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        gf var4_ref_gf = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        bi var8 = null;
        CipherPacketBuffer var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Bounce.field_N;
        try {
          var9 = jc.field_g;
          if (param0 <= 36) {
            return;
          }
          var2 = var9.readUnsignedByte((byte) -125);
          if (0 == var2) {
            var8 = (bi) (GameClient.field_n.beginForward((byte) -123));
            if (var8 == null) {
              kc.a((byte) 18);
              return;
            }
            var4 = var9.readUnsignedByte((byte) -124);
            if (0 != var4) {
              var13 = new byte[var4];
              var9.readBytes((byte) 124, var4, var13, 0);
            } else {
              var5 = null;
            }
            var9.position = var9.position + 4;
            if (var9.verifyCrc32(-19)) {
              var8.unlink(2);
              return;
            }
            kc.a((byte) 18);
            return;
          }
          if (var2 != 1) {
            ValidatedTextField.a((Throwable) null, (byte) 100, "A1: " + ValidationStatusIcon.a(-119));
            kc.a((byte) 18);
            return;
          }
          var3 = var9.readInt(-3);
          var4_ref_gf = (gf) (Slime.field_k.beginForward((byte) -92));
          while (var4_ref_gf != null) {
            if (var3 != var4_ref_gf.field_i) {
              var4_ref_gf = (gf) (Slime.field_k.nextForward((byte) -73));
              continue;
            }
            break;
          }
          if (var4_ref_gf != null) {
            var4_ref_gf.unlink(2);
            return;
          }
          kc.a((byte) 18);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var1), "ld.C(" + param0 + ')');
        }
    }

    public static void clearStaticReferences(boolean param0) {
        if (param0) {
          ld.clearStaticReferences(false);
          field_j = null;
          field_h = null;
          field_l = null;
          return;
        }
        field_j = null;
        field_h = null;
        field_l = null;
    }

    ld() {
        this.field_g = false;
    }

    final static String getAlternativeButtonPromptPrefix(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param2) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param1) {
          var4++;
          if (param0 >= 36) {
            return SocketArchiveNetworkClient.field_r[var4];
          }
          return (String) null;
        }
        if (param0 >= 36) {
          return SocketArchiveNetworkClient.field_r[var4];
        }
        return (String) null;
    }

    static {
        field_j = new int[8192];
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String getAlternativeButtonPromptPrefixWithIntGuard(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param2) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param1) {
          var4++;
          if (param0 >= 36) {
            return SocketArchiveNetworkClient.field_r[var4];
          }
          return (String) null;
        }
        if (param0 >= 36) {
          return SocketArchiveNetworkClient.field_r[var4];
        }
        return (String) null;
    }
}

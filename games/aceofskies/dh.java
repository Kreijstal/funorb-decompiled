/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    int field_i;
    int field_j;
    int field_a;
    static String field_d;
    int field_f;
    static RenderSprite unachievedSprite;
    int field_l;
    byte[] field_e;
    int field_h;
    static int field_c;
    int field_b;
    byte[] field_g;

    public static void a(byte param0) {
        unachievedSprite = null;
        if (param0 >= -69) {
          return;
        }
        field_d = null;
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        CipherPacketBuffer var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        oc var12 = null;
        CipherPacketBuffer var13 = null;
        eh var14 = null;
        int[] var15 = null;
        Object var16 = null;
        eh var16_ref = null;
        int[] var17 = null;
        var16 = null;
        var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param0 <= 39) {
            unachievedSprite = (RenderSprite) null;
          }
          var13 = IntKeyLookup.incomingPacket;
          var2 = var13.readUnsignedByte(121);
          if (var2 == 0) {
            var11 = fu.a(true);
            var17 = var11;
            var15 = var17;
            var3 = var15;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((PacketBuffer) ((Object) var5)).readUnsignedByte(-97);
            for (var7 = 0; var7 < var6; var7++) {
              var10[var7] = ((PacketBuffer) ((Object) var5)).readInt((byte) 124);
            }
            var16_ref = (eh) (wu.field_w.first(268435455));
            if (var16_ref == null) {
              te.b(true);
              return;
            }
            var16_ref.field_g = true;
            var16_ref.field_e = var17[0];
            var16_ref.field_f = var3;
            var16_ref.unlink(-124);
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              var14 = (eh) (wu.field_w.first(268435455));
              if (var14 == null) {
                te.b(true);
                return;
              }
              var14.field_f = fu.a(true);
              var14.field_g = true;
              var14.field_e = var14.field_f[0];
              var14.unlink(-125);
            } else {
              v.a("A1: " + CipherPacketBuffer.k((byte) 65), (byte) -52, (Throwable) null);
              te.b(true);
            }
          } else {
            var12 = (oc) (ci.field_j.first(268435455));
            if (var12 == null) {
              te.b(true);
              return;
            }
            var12.unlink(-123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "dh.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, MusicTrack param4) {
        try {
          DualLinkNode.field_e.a((byte) -50, param3, !param2 ? true : false, param1, param4, param0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "dh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_c = -1;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static Sprite boardOwnershipRaster;
    static Sprite field_b;
    static String loginUsernameText;

    public static void a(boolean param0) {
        if (param0) {
            field_b = null;
            loginUsernameText = null;
            boardOwnershipRaster = null;
            return;
        }
        field_b = (Sprite) null;
        field_b = null;
        loginUsernameText = null;
        boardOwnershipRaster = null;
    }

    final static void a(rh param0, int param1, int param2, ob param3) {
        try {
            uf.field_a = param1 * sb.a(true) / 1000;
            ab.a(99, param0);
            ni.a(param0, 0);
            if (param2 < 97) {
                bk.a(true, -54);
            }
            ul.a(-21541, param0);
            jk.b((byte) -91);
            ad.a((byte) -32);
            gb.field_f = -uf.field_a + 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "bk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static vd a(boolean param0, int param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        PacketBuffer var8 = null;
        og var9 = null;
        var7 = Geoblox.field_C;
        var8 = eh.field_d;
        var3 = var8.readUnsignedByte((byte) 34);
        gj.field_u = var3 & 127;
        stackIn_3_0 = !((param1 & var3) == 0);
        vd.field_l = stackIn_3_0;
        bm.field_s = var8.readUnsignedByte((byte) 34);
        uf.field_c = var8.readLongBE(2901);
        if (gj.field_u != 2) {
          uk.field_o = 0;
          tj.field_b = 0;
        } else {
          tj.field_b = var8.readUnsignedShortBE(true);
          uk.field_o = var8.readUnsignedMediumBE(105);
        }
        stackIn_9_0 = (var8.readUnsignedByte((byte) 34) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        cj.field_a = var8.readNullTerminatedText((byte) 117);
        if (var4 == 0) {
          jc.field_b = cj.field_a;
        } else {
          jc.field_b = var8.readNullTerminatedText((byte) 124);
        }
        if (gj.field_u == 1) {
          var8.readUnsignedShortBE(true);
          var8.readNullTerminatedText((byte) 112);
        } else {
          if (gj.field_u == 4) {
            var8.readUnsignedShortBE(true);
            var8.readNullTerminatedText((byte) 112);
          }
        }
        if (!param0) {
          re.field_f = PrefixCodeDecoder.readCompressedText(var8, 0, 80);
          vj.field_c = null;
          return new vd(param0);
        }
        {
          var5 = var8.readUnsignedShortBE(true);
          try {
            var9 = rd.field_r.a((byte) -14, var5);
            re.field_f = var9.e((byte) -69);
            if (!jc.field_b.equals(SecondaryDeque.field_f)) {
              stackIn_22_0 = var9.field_m;
            } else {
              stackIn_22_0 = null;
            }
            vj.field_c = stackIn_22_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            gi.a((Throwable) ((Object) var6), "CC1", (byte) 125);
            vj.field_c = null;
            re.field_f = null;
            return new vd(param0);
          }
          return new vd(param0);
        }
    }

    static {
        boardOwnershipRaster = new Sprite(640, 640);
        loginUsernameText = "Username: ";
    }
}

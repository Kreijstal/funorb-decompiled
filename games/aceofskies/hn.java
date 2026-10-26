/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn {
    static int field_a;
    static String[] field_b;

    final static void a(ResourceArchive param0, boolean param1) {
        String stackIn_11_2 = null;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          CipherPacketBuffer var8 = new CipherPacketBuffer(param0.a("logo.fo3d", (byte) -71, ""));
          CipherPacketBuffer var10 = var8;
          int var3 = var10.readUnsignedByte(-63);
          var10.j(91);
          GameCanvas.field_a = st.a(param1, var10);
          ia.field_a = new int[var3][];
          gp.field_y = new wu[var3];
          for (int var4 = 0; var3 > var4; var4++) {
            gp.field_y[var4] = sh.a(var8, (byte) -14);
          }
          var10.m((byte) 112);
          int var9 = 0;
          int var4Lifetime1 = var9;
          while (var3 > var9) {
            wu var5 = gp.field_y[var9];
            var5.a(6, 1, 6, 6, false);
            var5.b(32767);
            int[] var6 = new int[]{var5.field_b + var5.field_N >> 1, var5.field_h + var5.field_J >> 1, var5.field_A + var5.field_s >> 1};
            ia.field_a[var9] = var6;
            var5.a(-var6[0], 95, -var6[1], -var6[2]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var2;
          StringBuilder stackIn_10_1 = new StringBuilder().append("hn.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = q.outgoingPacket;
        var2.writeCipheredOpcode(111, param1);
        var2.writeByte(-1336879960, 1);
        var2.writeByte(-1336879960, param0);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          field_b = (String[]) null;
        }
    }

    static {
        field_b = new String[]{"Score 5,000 points", "Score 30,000 points", "Score 80,000 points", "Have six wingmen simultaneously", "Top out all Allied speed, turning, fire rate and armour", "Finish the game without dying", "Protect fair Britannia from the scum of the universe", "Finish the game with 100% accuracy", "\"Land\" your plane"};
    }
}

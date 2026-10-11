/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static String field_b;
    static int field_e;
    static um field_h;
    static boolean field_f;
    static fo field_g;
    static int field_d;
    static int field_a;
    static boolean field_c;

    final static String a(String param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        CipherPacketBuffer var5 = null;
        CharSequence var6 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -29) {
            se.a(93);
          }
          var6 = (CharSequence) ((Object) param0);
          if (!hg.a((byte) -90, var6)) {
            stackIn_5_0 = bc.field_d;
            return stackIn_5_0;
          }
          if (gt.a(param0, (byte) -114)) {
            stackIn_8_0 = MoveAttackRequest.field_F;
            return stackIn_8_0;
          }
          if (2 != th.field_a) {
            stackIn_11_0 = ct.field_m;
            return stackIn_11_0;
          }
          if (si.a(param0, -3404)) {
            stackIn_14_0 = fo.a(4800, ts.field_k, new String[]{param0});
            return stackIn_14_0;
          }
          if (vg.field_p >= 100) {
            stackIn_17_0 = wh.field_d;
            return stackIn_17_0;
          }
          if (jj.a(89, param0)) {
            stackIn_20_0 = fo.a(4800, PopupPresentation.field_p, new String[]{param0});
            return stackIn_20_0;
          }
          var5 = vl.field_n;
          var5.writeCipheredOpcode(32161, param1);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(1, 2);
          var5.b(param0, 13851);
          var5.e(var5.position - var4, 5930);
          stackIn_22_0 = null;
          return (String) (stackIn_22_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("se.A(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_f = false;
        }
        field_b = null;
        field_g = null;
        field_h = null;
    }

    final static RgbSprite[] a(byte param0) {
        int var2 = 0;
        int var6_int = 0;
        int var7 = 0;
        RgbSprite[] var1;
        int var3;
        int[] var6;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var1 = new RgbSprite[iw.field_n];
        for (var2 = 0; iw.field_n > var2; var2++) {
          var3 = c.field_e[var2] * qm.field_K[var2];
          var20 = AnimationPlayer.field_j[var2];
          if (!MapTile.field_e[var2]) {
            var9 = new int[var3];
            var21 = var9;
            for (var6_int = 0; var6_int < var3; var6_int++) {
              var9[var6_int] = MovementPresentation.field_j[rn.a(255, (int) var20[var6_int])];
            }
            var1[var2] = new RgbSprite(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], var21);
          } else {
            var22 = cq.field_z[var2];
            var16 = new int[var3];
            var13 = var16;
            var6 = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6[var7] = oe.c(MovementPresentation.field_j[rn.a((int) var20[var7], 255)], rn.a((int) var22[var7], 255) << 24);
            }
            var1[var2] = (RgbSprite) ((Object) new nj(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], var16));
          }
        }
        if (param0 != 32) {
          return (RgbSprite[]) null;
        }
        rj.d((byte) 101);
        return var1;
    }

    static {
        field_b = "Enter name of friend to delete from list";
        field_a = 480;
        field_c = false;
        field_f = false;
    }
}

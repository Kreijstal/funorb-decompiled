/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends IntrusiveNode {
    static String field_p;
    RgbSprite field_q;
    String field_u;
    static String field_s;
    static RgbSprite field_o;
    static String field_t;
    static String field_v;
    static String field_w;
    static String field_r;

    public static void e(int param0) {
        field_o = null;
        field_v = null;
        field_p = null;
        field_s = null;
        if (param0 != 0) {
          PacketBuffer var2 = (PacketBuffer) null;
          ai.a((PacketBuffer) null, 92);
        }
        field_t = null;
        field_r = null;
        field_w = null;
    }

    final static void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var8 = null;
        int var10 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int var4Lifetime1;
        var5 = SteelSentinels.obfuscationControl;
        try {
          var1_int = 60 % ((3 - param0) / 43);
          if (!ln.field_h) {
            if (null == al.field_i) {
              al.field_i = fg.a(4, 19999);
            }
            if (al.field_i.field_t) {
              var6 = ge.field_m;
              var13 = al.field_i.field_s;
              for (var4 = 0; var4 < 8; var4++) {
                var6[var4] = vn.a(var6[var4], var13[var4]);
              }
              var8 = ce.field_t;
              var14 = al.field_i.field_s;
              var10 = 0;
              var4Lifetime1 = var10;
              while (8 > var10) {
                var8[var10] = ec.a(var8[var10], ~var14[var10]);
                var10++;
              }
              ln.field_h = true;
              al.field_i = null;
              Projectile.c((byte) 8);
            }
            if (ln.field_h) {
              en.a(79);
              am.b(-104);
            }
          }
          if (!df.field_I) {
            if (null == ol.field_ac) {
              ol.field_ac = od.a(6, true);
            }
            if (ol.field_ac.field_q) {
              se.a(-1, ol.field_ac.field_t);
              ol.field_ac = null;
              df.field_I = true;
              mm.field_g.writeCipheredOpcode(65, (byte) -117);
              mm.field_g.writeCipheredOpcode(68, (byte) -117);
              mm.field_g.writeCipheredOpcode(70, (byte) -117);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "ai.A(" + param0 + ')');
        }
    }

    ai(RgbSprite param0, String param1) {
        try {
          this.field_u = param1;
          this.field_q = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ai.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(PacketBuffer param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -32599) {
            ai.e(-24);
          }
          var2_int = param0.readUnsignedByte((byte) -123);
          stackIn_5_0 = (var2_int == 1) ? 1 : 0;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ai.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = "Reject";
        field_s = "Offer draw";
        field_o = new RgbSprite(540, 140);
        field_w = "<%0> has entered a game.";
        field_t = "Waiting for graphics";
        field_v = "Custom-building of sentinels is available in advanced mode only. Earn 1,000 solarite cubes in multiplayer games or in missions to unlock advanced mode.";
        field_r = "asd";
    }
}

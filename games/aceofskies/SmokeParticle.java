/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SmokeParticle extends FlightBody {
    int ageTicks;
    int depthPhase;
    int lifetimeTicks;
    static String field_k;
    int colourOrBlastRadius;
    int spriteIndex;

    final static boolean a(CharSequence param0, int param1) {
        String stackIn_7_2 = null;
        try {
          if (param1 != 0) {
            field_k = (String) null;
          }
          boolean stackIn_3_0 = mi.a(-120, param0, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("qf.N(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void spawnAtDepth(int lifetimeTicks, int obfuscationGuard, int colourOrBlastRadius, int depthPhase, Vector2 position) {
        try {
          this.position.setFrom(position, true);
          this.colourOrBlastRadius = colourOrBlastRadius;
          if (obfuscationGuard < 99) {
            SmokeParticle.a((byte) -97, true);
          }
          this.lifetimeTicks = lifetimeTicks;
          this.ageTicks = 10;
          this.spriteIndex = qq.a(20, es.smokeSprites.length);
          this.depthPhase = depthPhase;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "qf.O(" + lifetimeTicks + ',' + obfuscationGuard + ',' + colourOrBlastRadius + ',' + depthPhase + ',' + (position != null ? "{...}" : "null") + ')');
        }
    }

    public SmokeParticle() {
        super(new Vector2());
        this.spriteIndex = 0;
    }

    final void spawn(int obfuscationGuard, Vector2 position, int colourOrBlastRadius, int lifetimeTicks) {
        try {
          this.position.setFrom(position, true);
          this.colourOrBlastRadius = colourOrBlastRadius;
          this.lifetimeTicks = lifetimeTicks;
          int var5_int = 68 / ((43 - obfuscationGuard) / 61);
          this.ageTicks = 10;
          this.spriteIndex = qq.a(20, es.smokeSprites.length);
          this.depthPhase = 92;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "qf.L(" + obfuscationGuard + ',' + (position != null ? "{...}" : "null") + ',' + colourOrBlastRadius + ',' + lifetimeTicks + ')');
        }
    }

    final static String a(String param0, int param1, String param2, ResourceArchive param3, int param4) {
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        try {
          if (param4 <= 65) {
            SmokeParticle.b(-73);
          }
          if (!param3.b((byte) -77)) {
            String stackIn_5_0 = (String) (param2);
            return stackIn_5_0;
          }
          String stackIn_7_0 = param0 + " - " + param3.a(param1, 100) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var5;
          StringBuilder stackIn_10_1 = new StringBuilder().append("qf.I(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte[] param0, PacketBuffer param1, int param2, java.math.BigInteger param3, int param4, java.math.BigInteger param5, int param6) {
        String stackIn_25_2 = null;
        String stackIn_28_2 = null;
        String stackIn_31_2 = null;
        String stackIn_34_2 = null;
        int var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var7_int = dq.a(param4, -70);
          if (null == lp.field_b) {
            lp.field_b = new java.security.SecureRandom();
          }
          int[] var13 = new int[4];
          int[] var12 = var13;
          int[] var8 = var12;
          if (param2 != 25215) {
            SmokeParticle.a((byte) 115, false);
          }
          for (int var9 = 0; var9 < 4; var9++) {
            var8[var9] = lp.field_b.nextInt();
          }
          if (DualLinkNode.field_l == null ||
            !(var7_int <= DualLinkNode.field_l.payload.length)) {
            DualLinkNode.field_l = new PacketBuffer(var7_int);
          }
          DualLinkNode.field_l.position = 0;
          DualLinkNode.field_l.a(true, param4, param6, param0);
          DualLinkNode.field_l.a(var7_int, (byte) 88);
          DualLinkNode.field_l.a(var13, 2097272037);
          if (ke.field_a == null ||
            !(ke.field_a.payload.length >= 100)) {
            ke.field_a = new PacketBuffer(100);
          }
          ke.field_a.position = 0;
          ke.field_a.writeByte(-1336879960, 10);
          int var11 = 0;
          int var9Lifetime1 = var11;
          while (var11 < 4) {
            ke.field_a.writeInt((byte) 87, var13[var11]);
            var11++;
          }
          ke.field_a.writeShort(param4, 23385);
          ke.field_a.a(0, param5, param3);
          param1.a(true, ke.field_a.position, 0, ke.field_a.payload);
          param1.a(true, DualLinkNode.field_l.position, 0, DualLinkNode.field_l.payload);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_24_0 = var7;
          StringBuilder stackIn_24_1 = new StringBuilder().append("qf.M(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          StringBuilder stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          StringBuilder stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          StringBuilder stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
          SmokeParticle.a((byte) 104, true);
        }
        field_k = null;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 77) {
          return;
        }
        gm.field_x.a(false, param1);
    }

    static {
        field_k = "OK";
    }
}

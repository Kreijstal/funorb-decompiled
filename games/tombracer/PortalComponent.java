/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PortalComponent extends PrefabComponent {
    static long[][] field_I;
    private ComponentTargetList field_G;
    static long[] field_H;
    private PortalBehaviour field_F;

    final void applyDefaults(byte param0) {
        super.applyDefaults(param0);
        this.setSize(param0 ^ -14, 4194304, 4194304);
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          field_H = (long[]) null;
          return false;
        }
        return false;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          return true;
        }
        return true;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        Trap stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new Trap(param2, param0);
          if (param1 != 3) {
            this.isSwitchable(88);
          }
          var4.setSize((byte) -11, this.height, this.width);
          this.field_F = new PortalBehaviour(param2, param0);
          var4.addBehaviour((byte) 83, (Behaviour) (this.field_F));
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("vka.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        super.encode(param0, param1);
        if (param0) {
          return;
        }
        try {
          this.field_G.encode(param1, 120, this.getRoot((byte) -123));
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "vka.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void resolveTargetIds(int param0) {
        super.resolveTargetIds(-124);
        this.field_G.resolveTargets(this.getRoot((byte) -20), false);
        if (param0 >= -122) {
          this.applyDefaults((byte) -60);
        }
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return false;
    }

    final void connectTargets(int param0) {
        Switchable var3 = null;
        super.connectTargets(param0);
        if (this.field_F == null) {
          return;
        }
        Switchable[] var4 = this.field_G.getSwitchables((byte) -103);
        Switchable[] var2 = var4;
        if (var4.length >= 1) {
          var3 = var4[0];
          if (var3 instanceof Trap) {
            this.field_F.getSwitchLinks((byte) 99).setTargets(9, new Switchable[]{var3});
          }
        }
    }

    PortalComponent(Room param0, int param1) {
        super(param0, param1);
        this.field_G = new ComponentTargetList(1, 1);
    }

    final static boolean A(int param0) {
        if (param0 <= 57) {
          field_I = (long[][]) null;
        }
        return dq.field_f != null ? true : VortexBehaviour.field_n;
    }

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          this.isSwitchable(-24);
        }
        return 3;
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_H = null;
        field_I = (long[][]) null;
    }

    PortalComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
        this.field_G = new ComponentTargetList(1, 1);
        try {
          this.field_G = new ComponentTargetList(1, 1, param0.formatVersion, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "vka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_I = new long[8][256];
        field_H = new long[11];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 != (1 & var0) ? (long)(255 & var1) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (var4 >= 256L) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (!(var6 < 256L)) {
                var6 = var6 ^ 285L;
            }
            var8 = var2 ^ var6;
            var10 = var6 << 1;
            if (!(var10 < 256L)) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_I[0][var0] = WhiteLightSensorComponent.bitwiseOr(var12, WhiteLightSensorComponent.bitwiseOr(WhiteLightSensorComponent.bitwiseOr(WhiteLightSensorComponent.bitwiseOr(var10 << 24, WhiteLightSensorComponent.bitwiseOr(var2 << 32, WhiteLightSensorComponent.bitwiseOr(WhiteLightSensorComponent.bitwiseOr(var2 << 56, var2 << 48), var6 << 40))), var8 << 16), var4 << 8));
            for (var14 = 1; 8 > var14; var14++) {
                field_I[var14][var0] = WhiteLightSensorComponent.bitwiseOr(field_I[-1 + var14][var0] << 56, field_I[var14 - 1][var0] >>> 8);
            }
            var0++;
        }
        field_H[0] = 0L;
        for (var0 = 1; 10 >= var0; var0++) {
            var1 = (var0 - 1) * 8;
            field_H[var0] = SnakePitModel.bitwiseXor(SnakePitModel.bitwiseXor(ActionPacketQueue.bitwiseAnd(65280L, field_I[6][6 + var1]), SnakePitModel.bitwiseXor(ActionPacketQueue.bitwiseAnd(field_I[5][var1 + 5], 16711680L), SnakePitModel.bitwiseXor(ActionPacketQueue.bitwiseAnd(4278190080L, field_I[4][4 + var1]), SnakePitModel.bitwiseXor(SnakePitModel.bitwiseXor(SnakePitModel.bitwiseXor(ActionPacketQueue.bitwiseAnd(field_I[0][var1], -72057594037927936L), ActionPacketQueue.bitwiseAnd(71776119061217280L, field_I[1][var1 + 1])), ActionPacketQueue.bitwiseAnd(280375465082880L, field_I[2][2 + var1])), ActionPacketQueue.bitwiseAnd(field_I[3][var1 + 3], 1095216660480L))))), ActionPacketQueue.bitwiseAnd(255L, field_I[7][7 + var1]));
        }
        CauldronComponent.bitLength((byte) 93, 1600);
    }
}

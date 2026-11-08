/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    DualLinkNode field_a;
    static long[] field_c;
    static int field_e;
    static long[][] field_b;
    static String field_d;
    static PcmSample[] field_f;

    final DualLinkNode removeFirst(int param0) {
        if (param0 < 57) {
          return (DualLinkNode) null;
        }
        DualLinkNode var2 = this.field_a.secondaryNext;
        if (this.field_a == var2) {
          return null;
        }
        var2.unlinkSecondary(17);
        return var2;
    }

    final static void writeEncryptedPayload(java.math.BigInteger param0, boolean param1, int param2, int param3, java.math.BigInteger param4, PacketBuffer param5, byte[] param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          var7_int = un.padToByteBoundary(param3, 108);
          if (MatchingTextValidator.field_y == null) {
            MatchingTextValidator.field_y = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = MatchingTextValidator.field_y.nextInt();
          }
          if (ed.field_b == null ||
            !(var7_int <= ed.field_b.payload.length)) {
            ed.field_b = new PacketBuffer(var7_int);
          }
          ed.field_b.position = 0;
          ed.field_b.writeBytes(param3, param2, -3493, param6);
          ed.field_b.padToPosition(var7_int, param1);
          ed.field_b.xteaEncrypt(true, var13);
          if (null == TutorialPage.field_d ||
            !(100 <= TutorialPage.field_d.payload.length)) {
            TutorialPage.field_d = new PacketBuffer(100);
          }
          TutorialPage.field_d.position = 0;
          TutorialPage.field_d.writeByte(160, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            TutorialPage.field_d.writeInt(var13[var11], -127);
            var11++;
          }
          TutorialPage.field_d.writeShort(1276387944, param3);
          TutorialPage.field_d.rsaEncrypt(param4, param0, 0);
          param5.writeBytes(TutorialPage.field_d.position, 0, -3493, TutorialPage.field_d.payload);
          param5.writeBytes(ed.field_b.position, 0, -3493, ed.field_b.payload);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_22_0 = var7;
          stackIn_22_1 = new StringBuilder().append("pg.F(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param6 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_f = null;
        if (!param0) {
          return;
        }
        field_c = null;
        field_d = null;
        field_b = (long[][]) null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    final static Sprite[] createSolidCentreFrame(int param0, byte param1) {
        Sprite[] var4 = new Sprite[9];
        Sprite[] var2 = var4;
        int var3 = -118 % ((param1 - 67) / 55);
        var4[4] = cl.createSolidSprite(64, param0, (byte) -61);
        return var2;
    }

    final void addLast(byte param0, DualLinkNode param1) {
        if (param1.secondaryPrevious != null) {
          param1.unlinkSecondary(17);
        }
        param1.secondaryNext = this.field_a;
        if (param0 <= 0) {
          return;
        }
        try {
          param1.secondaryPrevious = this.field_a.secondaryPrevious;
          param1.secondaryPrevious.secondaryNext = param1;
          param1.secondaryNext.secondaryPrevious = param1;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "pg.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean pollMasterIndex(int param0) {
        if (param0 != 916440577) {
          byte[] var2 = (byte[]) null;
          SecondaryNodeDeque.writeEncryptedPayload((java.math.BigInteger) null, false, 32, -117, (java.math.BigInteger) null, (PacketBuffer) null, (byte[]) null);
        }
        return FloatingSquare.field_j.pollMasterIndex(32059);
    }

    SecondaryNodeDeque() {
        this.field_a = new DualLinkNode();
        this.field_a.secondaryNext = this.field_a;
        this.field_a.secondaryPrevious = this.field_a;
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
        field_c = new long[11];
        field_b = new long[8][256];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = (var0 & 1) != 0 ? (long)(var1 & 255) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (!(256L > var4)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (!(var10 < 256L)) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_b[0][var0] = UiTheme.longOr(UiTheme.longOr(UiTheme.longOr(UiTheme.longOr(var10 << 24, UiTheme.longOr(UiTheme.longOr(UiTheme.longOr(var2 << 56, var2 << 48), var6 << 40), var2 << 32)), var8 << 16), var4 << 8), var12);
            for (var14 = 1; var14 < 8; var14++) {
                field_b[var14][var0] = UiTheme.longOr(field_b[-1 + var14][var0] << 56, field_b[-1 + var14][var0] >>> 8);
            }
            var0++;
        }
        field_c[0] = 0L;
        for (var0 = 1; var0 <= 10; var0++) {
            var1 = (var0 - 1) * 8;
            field_c[var0] = fp.xor(fp.xor(fp.xor(fp.xor(FullscreenFocusCanvas.longAnd(4278190080L, field_b[4][4 + var1]), fp.xor(FullscreenFocusCanvas.longAnd(1095216660480L, field_b[3][var1 + 3]), fp.xor(FullscreenFocusCanvas.longAnd(field_b[2][var1 + 2], 280375465082880L), fp.xor(FullscreenFocusCanvas.longAnd(-72057594037927936L, field_b[0][var1]), FullscreenFocusCanvas.longAnd(field_b[1][var1 + 1], 71776119061217280L))))), FullscreenFocusCanvas.longAnd(field_b[5][5 + var1], 16711680L)), FullscreenFocusCanvas.longAnd(65280L, field_b[6][var1 + 6])), FullscreenFocusCanvas.longAnd(field_b[7][var1 + 7], 255L));
        }
        field_f = new PcmSample[132];
        field_d = "Achievements";
    }
}

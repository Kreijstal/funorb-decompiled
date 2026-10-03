/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ib implements dg {
    private long field_b;
    static String field_d;
    static boolean gameAssetsInitialized;
    static int field_c;
    static int archiveLoadStatus;

    final static void drawHalfBlendSolidSpan(int guard, int[] destinationPixels, int destinationIndex, int halfRgb, int pixelCount) {
        int[] destinationForReadAndWrite = null;
        int destinationIndexForWrite = 0;
        int halfRgbForWrite = 0;
        int controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
            while (true) {
                pixelCount--;
                if (pixelCount < 0) {
                    break;
                }
                destinationForReadAndWrite = destinationPixels;
                int[] destinationAlias = destinationForReadAndWrite;
                destinationIndexForWrite = destinationIndex;
                halfRgbForWrite = halfRgb;
                destinationForReadAndWrite[destinationIndexForWrite] = halfRgbForWrite + cd.andInt(destinationForReadAndWrite[destinationIndexForWrite] >> 1, 8355711);
                destinationIndex++;
            }
            int guardRemainder = -30 % ((-2 - guard) / 40);
        } catch (RuntimeException caughtSpanFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) caughtSpanFailure), "ib.AA(" + guard + ',' + (destinationPixels != null ? "{...}" : "null") + ',' + destinationIndex + ',' + halfRgb + ',' + pixelCount + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            field_c = -26;
        }
    }

    public final String c(int param0) {
        if (this.a(-26556)) {
            return null;
        }
        if (oa.a(param0 ^ 25670) < 350L + this.field_b) {
            return null;
        }
        if (param0 == -21666) {
            return this.currentValidationMessage((byte) -103);
        }
        return (String) null;
    }

    abstract String currentValidationMessage(byte guard);

    public final void b(int param0) {
        this.field_b = oa.a(param0 ^ 23811);
        if (param0 != -28133) {
            archiveLoadStatus = 55;
        }
    }

    final static void a(int param0, int param1, mg param2) {
        PacketBuffer var3 = null;
        try {
            var3 = fj.field_q;
            var3.writeCipherByte(param0, (byte) -82);
            var3.writeByte((byte) 124, param1);
            var3.writeByte((byte) -66, 0);
            var3.writeShortBE(param2.field_i, 28695);
            var3.writeByte((byte) -84, param2.field_f);
            var3.writeByte((byte) 125, param2.field_l);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ib.DA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final lh a(byte param0) {
        if (param0 != -105) {
            archiveLoadStatus = -117;
            if (this.a(param0 ^ 26579)) {
                return oj.field_d;
            }
            if (~(350L + this.field_b) >= ~oa.a(-12520)) {
                return this.currentValidationState(32);
            }
            return ImageProducerRasterBuffer.field_g;
        }
        if (this.a(param0 ^ 26579)) {
            return oj.field_d;
        }
        if (~(350L + this.field_b) >= ~oa.a(-12520)) {
            return this.currentValidationState(32);
        }
        return ImageProducerRasterBuffer.field_g;
    }

    final static void d(int param0) {
        String var2 = (String) null;
        MessageDialog.showLoginForm("", (String) null, 7697781);
        if (param0 != 24107) {
            gameAssetsInitialized = false;
        }
    }

    abstract lh currentValidationState(int guard);

    static {
        field_d = "Not achieved";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
class LongAndTextLoginPayload extends LoginPayload {
    static char[] extendedTextCharacters;
    private String base38Text;
    private long longValue;

    LoginPayloadKind payloadKind(byte methodGuard) {
        if (methodGuard != -32) {
            return (LoginPayloadKind) null;
        }
        return Geoblox.longAndNameLoginType;
    }

    public static void b(int param0) {
        if (param0 != 8221) {
            LongAndTextLoginPayload.b(91);
            extendedTextCharacters = null;
            return;
        }
        extendedTextCharacters = null;
    }

    final void writePayload(int methodGuard, ByteArrayBuffer buffer) {
        try {
            buffer.writeLongBE((byte) 59, this.longValue);
            buffer.writeBase38Text(this.base38Text, false);
            if (methodGuard < 107) {
                extendedTextCharacters = (char[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "lf.B(" + methodGuard + ',' + (buffer != null ? "{...}" : "null") + ')');
        }
    }

    LongAndTextLoginPayload(long longValue, String base38Text) {
        try {
            this.longValue = longValue;
            this.base38Text = base38Text;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "lf.<init>(" + longValue + ',' + (base38Text != null ? "{...}" : "null") + ')');
        }
    }

    final static String c(byte param0) {
        if (param0 <= 14) {
            extendedTextCharacters = (char[]) null;
            if (InstrumentPatch.field_q) {
                return null;
            }
            if (AsyncResourceDownloader.field_e > ResizableDialog.field_V) {
                return null;
            }
            if (!(PcmResampler.field_j + AsyncResourceDownloader.field_e <= ResizableDialog.field_V)) {
                return tc.field_a;
            }
            return null;
        }
        if (InstrumentPatch.field_q) {
            return null;
        }
        if (AsyncResourceDownloader.field_e > ResizableDialog.field_V) {
            return null;
        }
        if (!(PcmResampler.field_j + AsyncResourceDownloader.field_e <= ResizableDialog.field_V)) {
            return tc.field_a;
        }
        return null;
    }

    static {
        extendedTextCharacters = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}

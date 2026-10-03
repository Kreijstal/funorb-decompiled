/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lf extends df {
    static char[] extendedTextCharacters;
    private String field_d;
    private long field_c;

    LoginPayloadKind a(byte param0) {
        if (param0 != -32) {
            return (LoginPayloadKind) null;
        }
        return Geoblox.longAndNameLoginType;
    }

    public static void b(int param0) {
        if (param0 != 8221) {
            lf.b(91);
            extendedTextCharacters = null;
            return;
        }
        extendedTextCharacters = null;
    }

    final void a(int param0, ByteArrayBuffer param1) {
        try {
            param1.writeLongBE((byte) 59, this.field_c);
            param1.writeBase38Text(this.field_d, false);
            if (param0 < 107) {
                extendedTextCharacters = (char[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "lf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    lf(long param0, String param1) {
        try {
            this.field_c = param0;
            this.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "lf.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String c(byte param0) {
        if (param0 <= 14) {
            extendedTextCharacters = (char[]) null;
            if (InstrumentPatch.field_q) {
                return null;
            }
            if (wg.field_e > ResizableDialog.field_V) {
                return null;
            }
            if (!(ue.field_j + wg.field_e <= ResizableDialog.field_V)) {
                return tc.field_a;
            }
            return null;
        }
        if (InstrumentPatch.field_q) {
            return null;
        }
        if (wg.field_e > ResizableDialog.field_V) {
            return null;
        }
        if (!(ue.field_j + wg.field_e <= ResizableDialog.field_V)) {
            return tc.field_a;
        }
        return null;
    }

    static {
        extendedTextCharacters = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}

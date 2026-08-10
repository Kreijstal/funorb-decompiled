/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gga extends mc {
    private gga(int param0, int param1, int param2, int param3, wwa param4, sba param5, shb param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_t = param6;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gga.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        ef var9 = null;
        try {
            super.a((byte) -124, param1, param2, param3, param4, param5);
            var9 = lb.field_p;
            int var8 = 123 % ((52 - param0) / 52);
            if (var9 != null && this.a(param2, param1, param5, param3, (byte) 22)) {
                if (!(this.field_l instanceof ol)) {
                    if (!(var9.field_l instanceof ol)) {
                        return;
                    }
                    ((ol) ((Object) var9.field_l)).a((byte) -70, var9, (gga) (this));
                    lb.field_p = null;
                    return;
                }
                ((ol) ((Object) this.field_l)).a((byte) -70, var9, (gga) (this));
                lb.field_p = null;
                return;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gga.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    static {
    }
}

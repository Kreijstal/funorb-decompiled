/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends gj {
    private javax.sound.sampled.AudioFormat field_w;
    private javax.sound.sampled.SourceDataLine field_v;
    private boolean field_z;
    private int field_x;
    private byte[] field_y;
    private static String field_A;

    final void f() {
        try {
            int var2 = 0;
            int var3 = 0;
            int var1 = 256;
            if (field_u) {
                var1 = var1 << 1;
            }
            for (var2 = 0; var2 < var1; var2++) {
                var3 = this.field_a[var2];
                if ((var3 + 8388608 & -16777216) != 0) {
                    var3 = 8388607 ^ var3 >> 31;
                }
                this.field_y[var2 * 2] = (byte)(var3 >> 8);
                this.field_y[var2 * 2 + 1] = (byte)(var3 >> 16);
            }
            int discarded$0 = this.field_v.write(this.field_y, 0, var1 << 1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int d() {
        return this.field_x - (this.field_v.available() >> (field_u ? 2 : 1));
    }

    final void c() {
        if (this.field_v != null) {
            this.field_v.close();
            this.field_v = null;
        }
    }

    ca() {
        this.field_z = false;
    }

    final void a(java.awt.Component param0) {
        javax.sound.sampled.Mixer.Info[] var3 = null;
        int var4 = 0;
        javax.sound.sampled.Mixer.Info var5 = null;
        String var6 = null;
        javax.sound.sampled.Mixer.Info[] var2 = javax.sound.sampled.AudioSystem.getMixerInfo();
        if (var2 != null) {
            var3 = var2;
            for (var4 = 0; var4 < var3.length; var4++) {
                var5 = var3[var4];
                if (var5 != null) {
                    var6 = var5.getName();
                    if (var6 != null) {
                        if (var6.toLowerCase().indexOf(field_A) >= 0) {
                            this.field_z = true;
                        }
                    }
                }
            }
        }
        this.field_w = new javax.sound.sampled.AudioFormat((float)field_s, 16, field_u ? 2 : 1, true, false);
        this.field_y = new byte[256 << (field_u ? 2 : 1)];
    }

    final void b(int param0) throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var2 = null;
        try {
            var2 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_w, param0 << (field_u ? 2 : 1));
            this.field_v = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var2)));
            this.field_v.open();
            this.field_v.start();
            this.field_x = param0;
        } catch (javax.sound.sampled.LineUnavailableException lineUnavailableException) {
            if (ii.a(param0, 126) != 1) {
                this.b(ac.a(param0, true));
                return;
            }
            this.field_v = null;
            throw lineUnavailableException;
        }
    }

    final void g() throws javax.sound.sampled.LineUnavailableException {
        javax.sound.sampled.DataLine.Info var1 = null;
        this.field_v.flush();
        if (this.field_z) {
            this.field_v.close();
            this.field_v = null;
            var1 = new javax.sound.sampled.DataLine.Info(javax.sound.sampled.SourceDataLine.class, this.field_w, this.field_x << (field_u ? 2 : 1));
            this.field_v = (javax.sound.sampled.SourceDataLine) ((Object) javax.sound.sampled.AudioSystem.getLine((javax.sound.sampled.Line.Info) ((Object) var1)));
            this.field_v.open();
            this.field_v.start();
        }
    }

    static {
        field_A = "soundmax";
    }
}

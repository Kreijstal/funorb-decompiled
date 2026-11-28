/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class AwtRasterBuffer {
    int field_i;
    static Sprite[][] field_a;
    static String field_d;
    static String field_c;
    static FullscreenFocusCanvas field_f;
    java.awt.Image field_b;
    int[] field_e;
    int field_g;
    static String field_h;

    final static boolean a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_6_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = TextFieldValidator.field_k;
        synchronized (var1) {
          if (PcmResampler.field_b == bh.field_e) {
            return false;
          }
          oa.field_H = oi.field_e[PcmResampler.field_b];
          MatchingFieldValidator.field_p = ProxySocketConnector.field_d[PcmResampler.field_b];
          PcmResampler.field_b = PcmResampler.field_b - param0 & 127;
          stackIn_6_0 = true;
        }
        return stackIn_6_0;
    }

    abstract void initialize(int param0, java.awt.Component param1, int param2, int param3);

    public static void clearStaticReferences(boolean param0) {
        field_h = null;
        field_a = (Sprite[][]) null;
        if (param0) {
          return;
        }
        field_f = null;
        field_d = null;
        field_c = null;
    }

    abstract void drawImage(int param0, int param1, java.awt.Graphics param2, int param3);

    final void setAsRasterTarget(byte param0) {
        if (param0 >= 106) {
          SoftwareRasterizer.setRasterBuffer(this.field_e, this.field_g, this.field_i);
          return;
        }
        this.field_e = (int[]) null;
        SoftwareRasterizer.setRasterBuffer(this.field_e, this.field_g, this.field_i);
    }

    static {
        field_d = "Please check if address is correct";
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_a = new Sprite[7][];
    }
}

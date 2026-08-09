/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bs extends vg {
    static boolean field_g;
    static float[][] field_f;
    static String field_h;

    void a(kh param0, int param1) {
        try {
            param0.a((byte) -3, this.b((byte) 121), 4);
            if (param1 != -5) {
                field_f = (float[][]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bs.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract int a(byte param0);

    abstract void a(int param0, byte param1, dt param2);

    abstract int b(byte param0);

    abstract boolean a(boolean param0);

    final static int a(int param0, int param1, int param2) {
        long var3;
        if (param1 != -28970) {
          bs.a(-69);
          var3 = (long)param2 << -916474480;
          return (int)(var3 / (long)param0);
        } else {
          var3 = (long)param2 << -916474480;
          return (int)(var3 / (long)param0);
        }
    }

    bs(int param0, kh param1) {
    }

    abstract boolean a(boolean param0, bs param1);

    abstract void a(dt param0, int param1, int param2, int param3);

    public static void a(int param0) {
        field_h = null;
        field_f = (float[][]) null;
        int var1 = -91 / ((-59 - param0) / 54);
    }

    static {
        field_f = new float[][]{new float[]{-0.33333298563957214f, -0.33333298563957214f, -0.33333298563957214f}, new float[]{0.33333298563957214f, -0.33333298563957214f, -0.33333298563957214f}, new float[]{-0.33333298563957214f, 0.33333298563957214f, -0.33333298563957214f}, new float[]{0.33333298563957214f, 0.33333298563957214f, -0.33333298563957214f}, new float[]{-0.33333298563957214f, -0.33333298563957214f, 0.33333298563957214f}, new float[]{0.33333298563957214f, -0.33333298563957214f, 0.33333298563957214f}, new float[]{-0.33333298563957214f, 0.33333298563957214f, 0.33333298563957214f}, new float[]{0.33333298563957214f, 0.33333298563957214f, 0.33333298563957214f}};
        field_g = false;
        field_h = "Your ignore list is full. Max of 100 hit.";
    }
}

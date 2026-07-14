/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bs extends vg {
    static boolean field_g;
    static float[][] field_f;
    static String field_h;

    void a(kh param0, int param1) {
        param0.a((byte) -3, ((bs) this).b((byte) 121), 4);
        if (param1 != -5) {
            field_f = null;
        }
    }

    abstract int a(byte param0);

    abstract void a(int param0, byte param1, dt param2);

    abstract int b(byte param0);

    abstract boolean a(boolean param0);

    final static int a(int param0, int param1, int param2) {
        long var3 = 0L;
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
        field_f = null;
        int var1 = -91 / ((-59 - param0) / 54);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new float[][]{new float[3], new float[3], new float[3], new float[3], new float[3], new float[3], new float[3], new float[3]};
        field_g = false;
        field_h = "Your ignore list is full. Max of 100 hit.";
    }
}

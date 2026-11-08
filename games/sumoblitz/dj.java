/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends IntrusiveNode {
    PcmSampleStream field_q;
    static String fullScreenText;
    static String[] scoreFilterLabels;
    static ToolkitSprite field_l;
    static int field_n;
    IntrusiveNode field_k;
    int field_p;
    static Object field_m;

    final static boolean a(int param0, int param1) {
        int var2 = 90 / ((30 - param0) / 44);
        if (param1 == 1) {
          return false;
        }
        if (param1 != 7) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_l = null;
        if (param0 == 1022768328) {
          fullScreenText = null;
          field_m = null;
          scoreFilterLabels = null;
          return;
        }
        dj.a(-56, -102);
        fullScreenText = null;
        field_m = null;
        scoreFilterLabels = null;
    }

    dj(PcmSampleStream param0, IntrusiveNode param1) {
        try {
          this.field_q = param0;
          this.field_p = param0.g();
          this.field_k = param1;
          this.field_q.f(128 + this.field_p * kr.field_c >> 8);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        fullScreenText = "Full screen";
        scoreFilterLabels = new String[]{"All scores", "My scores", "Best each"};
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static String field_d;
    boolean field_b;
    static jea field_g;
    qm field_e;
    static String[] field_c;
    boolean field_h;
    static int field_f;
    qm field_a;

    final void c(int param0) {
        if (null == ((hg) this).field_a) {
          ((hg) this).field_h = false;
          if (param0 != -5941) {
            ((hg) this).field_a = null;
            return;
          } else {
            return;
          }
        } else {
          ((hg) this).field_a.a(12574);
          ((hg) this).field_h = false;
          if (param0 == -5941) {
            return;
          } else {
            ((hg) this).field_a = null;
            return;
          }
        }
    }

    final static be a(String param0, int param1, boolean param2) {
        qb var3 = null;
        RuntimeException var3_ref = null;
        qb stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        qb stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new qb();
            ((be) (Object) var3).field_b = param1;
            ((be) (Object) var3).field_a = param0;
            stackOut_0_0 = (qb) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("hg.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + false + ')');
        }
        return (be) (Object) stackIn_1_0;
    }

    final boolean b(int param0) {
        if (param0 == 16440) {
          if (((hg) this).field_h) {
            if (((hg) this).field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_c = null;
          if (((hg) this).field_h) {
            if (((hg) this).field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        if (param0 != 13648) {
            field_g = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    hg(boolean param0) {
        ((hg) this).field_b = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Fireball Launcher";
        field_c = new String[]{"<%0> got a bouncing blade in the face", "<%0> had a very close shave", "<%0> didn't predict the sawblade's trajectory", "<%0> wonders where these endless ceremonial sawblades come from", "<%0> found their body was not blade-proof", "<%0> played catch with a rather sharp flying disc"};
    }
}

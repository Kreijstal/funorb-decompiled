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
        if (null == this.field_a) {
          this.field_h = false;
          if (param0 != -5941) {
            this.field_a = (qm) null;
            return;
          } else {
            return;
          }
        } else {
          this.field_a.a(12574);
          this.field_h = false;
          if (param0 == -5941) {
            return;
          } else {
            this.field_a = (qm) null;
            return;
          }
        }
    }

    final static be a(String param0, int param1, boolean param2) {
        be discarded$2 = null;
        qb var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        qb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        qb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                var4 = (String) null;
                discarded$2 = hg.a((String) null, -41, false);
                break L1;
              }
            }
            var3 = new qb();
            ((be) ((Object) var3)).field_b = param1;
            ((be) ((Object) var3)).field_a = param0;
            stackOut_2_0 = (qb) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("hg.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (be) ((Object) stackIn_3_0);
    }

    final boolean b(int param0) {
        if (param0 == 16440) {
          if (this.field_h) {
            if (this.field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_c = (String[]) null;
          if (this.field_h) {
            if (this.field_b) {
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
            field_g = (jea) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    hg(boolean param0) {
        this.field_b = param0 ? true : false;
    }

    static {
        field_d = "Fireball Launcher";
        field_c = new String[]{"<%0> got a bouncing blade in the face", "<%0> had a very close shave", "<%0> didn't predict the sawblade's trajectory", "<%0> wonders where these endless ceremonial sawblades come from", "<%0> found their body was not blade-proof", "<%0> played catch with a rather sharp flying disc"};
    }
}

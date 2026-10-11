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
        if (null != this.field_a) {
          this.field_a.a(12574);
          this.field_h = false;
          if (param0 != -5941) {
            this.field_a = (qm) null;
            return;
          }
          return;
        }
        this.field_h = false;
        if (param0 == -5941) {
          return;
        }
        this.field_a = (qm) null;
    }

    final static be a(String param0, int param1, boolean param2) {
        qb var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        qb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            var4 = (String) null;
            hg.a((String) null, -41, false);
          }
          var3 = new qb();
          ((be) ((Object) var3)).field_b = param1;
          ((be) ((Object) var3)).field_a = param0;
          stackIn_3_0 = var3;
          return (be) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("hg.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        if (param0 != 16440) {
          field_c = (String[]) null;
          if (!this.field_h) {
            return false;
          }
          if (!this.field_b) {
            return true;
          }
          return false;
        }
        if (!this.field_h) {
          return false;
        }
        if (!this.field_b) {
          return true;
        }
        return false;
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

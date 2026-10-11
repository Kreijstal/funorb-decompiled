/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ci {
    static double field_k;
    java.awt.Image field_g;
    static ll field_i;
    int field_c;
    int[] field_f;
    static byte[][] field_a;
    static String[][] field_h;
    int field_d;
    static bd field_e;
    static String field_j;
    static boolean field_b;

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          gj.a(param1 ^ 2670, (java.awt.Component) ((Object) param0));
          vd.a((byte) -106, (java.awt.Component) ((Object) param0));
          if (null != pf.field_e) {
            pf.field_e.a(1000, (java.awt.Component) ((Object) param0));
          }
          if (param1 == 0) {
            return;
          }
          field_h = (String[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ci.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 <= 36) {
          field_i = (ll) null;
          if (fh.field_b < 10) {
            return false;
          }
          if (!qc.field_b) {
            return !gd.b((byte) -97) ? true : false;
          }
          return false;
        }
        if (fh.field_b < 10) {
          return false;
        }
        if (!qc.field_b) {
          return !gd.b((byte) -97) ? true : false;
        }
        return false;
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final void a(byte param0) {
        eh.a(this.field_f, this.field_c, this.field_d);
        if (param0 != -45) {
          java.awt.Component var3 = (java.awt.Component) null;
          this.a((java.awt.Component) null, -30, 28, 18);
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_j = null;
        if (param0 == 0) {
          field_h = (String[][]) null;
          field_a = (byte[][]) null;
          field_i = null;
          return;
        }
        field_b = true;
        field_h = (String[][]) null;
        field_a = (byte[][]) null;
        field_i = null;
    }

    final static ln a(ln param0, byte param1, int[] param2) {
        ln var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ln stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ln(0, 0, 0);
          var4 = 111 / ((param1 + 29) / 57);
          var3.field_k = param0.field_k;
          var3.field_n = param2;
          var3.field_a = param0.field_a;
          var3.field_f = param0.field_f;
          var3.field_b = param0.field_b;
          var3.field_m = param0.field_m;
          var3.field_j = param0.field_j;
          var3.field_e = param0.field_e;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("ci.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -27933) {
            return false;
          }
          var3 = (CharSequence) ((Object) param1);
          stackIn_4_0 = in.field_b.equals(cl.a(-95, var3));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ci.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    static {
        field_h = new String[][]{new String[]{"Your dynamite will not go off in water. Try draining the water away or placing the explosives somewhere dryer. Alternatively, buy a charge - that will work underwater."}};
        field_k = 0.0;
        field_e = new bd();
        field_j = "You are not currently logged in to the service. To save your score, progress and Achievements, you must log in or create an account.";
    }
}

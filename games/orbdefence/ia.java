/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ia {
    int field_g;
    static ba field_a;
    int field_h;
    static eb field_f;
    int field_d;
    int field_c;
    int field_b;
    int field_i;
    static int[] field_j;
    static String field_e;

    final static boolean a(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 != 0) {
          field_j = (int[]) null;
        }
        stackIn_9_0 = (pi.field_j != null) || (gj.c(1024)) || (am.field_h != null) || (l.a(-1));
        return stackIn_9_0;
    }

    public static void a(byte param0) {
        int var1 = 67 / ((66 - param0) / 58);
        field_a = null;
        field_j = null;
        field_f = null;
        field_e = null;
    }

    final static void b(int param0, int param1) {
        ij.field_g = param0;
        if (ml.field_c != null) {
          ml.field_c.b(param0, 111);
        }
        if (gi.field_f != null) {
          gi.field_f.a(0, param0);
        }
        if (param1 != -23235) {
          field_f = (eb) null;
        }
    }

    final static void a(int param0, int param1, fb param2) {
        se var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = uk.field_b;
          var3.i(param1, 126);
          var3.a(2, -29);
          var3.a(0, -63);
          var3.a(param2.field_h, -21);
          if (param0 >= -11) {
            field_a = (ba) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("ia.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(og param0, boolean param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            od.field_j[var2_int] = 0;
          }
          var2_intLifetime1 = 0;
          if (param1) {
            field_e = (String) null;
          }
          while (gl.field_b > var2_intLifetime1) {
            if (param0.field_d == jk.field_d[var2_intLifetime1].field_d) {
              dupTemp$3 = jk.field_d[var2_intLifetime1].b((byte) -63);
              od.field_j[dupTemp$3] = od.field_j[dupTemp$3] + 1;
            }
            var2_intLifetime1++;
          }
          dupTemp$0 = param0.b((byte) -12);
          od.field_j[dupTemp$0] = od.field_j[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; gl.field_b > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (param0.field_d == jk.field_d[var3].field_d) {
              var4 = jk.field_d[var3].b((byte) -25);
              if (df.field_b < od.field_j[var4]) {
                od.field_j[var4] = od.field_j[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              jk.field_d[incrementValue$2] = jk.field_d[var3];
            }
          }
          gl.field_b = var2_intLifetime2;
          fieldTemp$1 = gl.field_b;
          gl.field_b = gl.field_b + 1;
          jk.field_d[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("ia.H(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    static {
        field_j = new int[8192];
        field_a = new ba(2, 4, 4, 0);
        field_e = "<%0> BOSS";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf extends ma {
    static int field_u;
    private dj field_r;
    static ef field_w;
    static ka field_n;
    static lj field_p;
    static int[][] field_m;
    static sl field_q;
    static mi field_o;
    static String[] field_s;
    static String field_v;
    static byte[][] field_t;

    gf(dj param0, dj param1) {
        super(param0);
        try {
          this.field_r = param1;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "gf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param1.equals("I")) {
            stackIn_7_0 = Integer.TYPE;
            return stackIn_7_0;
          }
          if (param1.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param1.equals("J")) {
            stackIn_14_0 = Long.TYPE;
            return stackIn_14_0;
          }
          if (param1.equals("Z")) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (param1.equals("F")) {
            stackIn_20_0 = Float.TYPE;
            return stackIn_20_0;
          }
          if (param1.equals("D")) {
            stackIn_23_0 = Double.TYPE;
            return stackIn_23_0;
          }
          if (param1.equals("C")) {
            stackIn_26_0 = Character.TYPE;
            return stackIn_26_0;
          }
          if (param0 == 0) {
            stackIn_31_0 = Class.forName(param1);
            return stackIn_31_0;
          }
          stackIn_29_0 = (Class) null;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("gf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final rj a(byte param0, String param1) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        rj stackIn_6_0 = null;
        rj stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 24) {
            gf.d((byte) -38);
          }
          if (this.field_r instanceof uh) {
            var3 = ((uh) ((Object) this.field_r)).a(-113);
            if (var3 != null &&
              var3.b(97) != tf.field_w) {
              stackIn_6_0 = lk.field_c;
              return stackIn_6_0;
            }
          }
          if (!param1.equals(this.field_r.field_v)) {
            stackIn_10_0 = lk.field_c;
          } else {
            stackIn_10_0 = tf.field_w;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("gf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = 0;
          if (param1 != 78) {
            stackIn_3_0 = 68;
            return stackIn_3_0;
          }
          for (var3 = 0; var3 < 5; var3++) {
            if ((param0 & 1 << var3) > 0) {
              var2_int++;
            }
          }
          stackIn_10_0 = var2_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "gf.E(" + param0 + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        field_m = (int[][]) null;
        field_o = null;
        field_s = null;
        field_p = null;
        field_n = null;
        field_q = null;
        field_w = null;
        field_t = (byte[][]) null;
        int var1 = 107 / ((param0 + 58) / 34);
        field_v = null;
    }

    final String a(String param0, byte param1) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -24) {
            field_t = (byte[][]) null;
          }
          if (this.field_r instanceof uh) {
            var3 = ((uh) ((Object) this.field_r)).a(-122);
            if (var3 != null) {
              if (var3.b(110) == tf.field_w &&
                !param0.equals(this.field_r.field_v)) {
                stackIn_10_0 = ki.field_c;
                return stackIn_10_0;
              }
              stackIn_12_0 = var3.a((byte) -10);
              return stackIn_12_0;
            }
          }
          if (param0.equals(this.field_r.field_v)) {
            return null;
          }
          stackIn_16_0 = ki.field_c;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("gf.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_n = null;
        field_m = new int[][]{new int[]{0}, new int[]{0}, new int[]{0}, new int[]{15245826, 0, 0}, new int[]{0}};
        field_q = new sl();
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static int field_c;
    static ad field_s;
    int[] field_g;
    static boolean field_l;
    int field_n;
    static String field_q;
    String field_h;
    String field_i;
    boolean field_j;
    int field_k;
    km field_t;
    long field_p;
    String field_d;
    int field_e;
    static int[] field_o;
    static String field_f;
    static String[] field_b;
    int field_m;
    String field_r;
    int field_a;

    final int b(int param0) {
        if (this.field_j) {
          return 2;
        }
        if (2 != this.field_n) {
          if (param0 != -6761) {
            this.b(-36);
            if (this.field_p == hh.field_d) {
              return 1;
            }
            if (oa.field_q != 2) {
              return 0;
            }
            if (!ch.a(this.field_i, (byte) -73)) {
              return 0;
            }
            return 1;
          }
          if (this.field_p == hh.field_d) {
            return 1;
          }
          if (oa.field_q == 2 &&
            ch.a(this.field_i, (byte) -73)) {
            return 1;
          }
          return 0;
        }
        if (this.field_e <= 0) {
          if (param0 != -6761) {
            this.b(-36);
            if (this.field_p == hh.field_d) {
              return 1;
            }
            if (oa.field_q == 2 &&
              ch.a(this.field_i, (byte) -73)) {
              return 1;
            }
            return 0;
          }
          if (this.field_p == hh.field_d) {
            return 1;
          }
          if (oa.field_q == 2 &&
            ch.a(this.field_i, (byte) -73)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        int var2_int = 0;
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param1.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param1.equals("S")) {
            stackIn_9_0 = Short.TYPE;
            return stackIn_9_0;
          }
          var2_int = -46 % ((9 - param0) / 58);
          if (param1.equals("J")) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
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
          if (!param1.equals("C")) {
            stackIn_28_0 = Class.forName(param1);
            return stackIn_28_0;
          }
          stackIn_26_0 = Character.TYPE;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("cj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_s = null;
        field_o = null;
        field_b = null;
        field_q = null;
        field_f = null;
        if (param0 >= -14) {
          field_l = false;
        }
    }

    cj(boolean param0) {
        this.field_p = hk.field_Kb;
        this.field_j = ea.field_b;
        this.field_h = aa.field_f;
        this.field_i = vl.field_k;
        this.field_r = vc.field_hb;
        this.field_n = td.field_h;
        this.field_a = pl.field_b;
        if (param0) {
          this.field_g = ne.field_e;
        } else {
          this.field_g = null;
        }
        this.field_d = pb.field_l;
        this.field_k = ef.field_b;
        this.field_m = eb.field_d;
        this.field_e = va.field_b;
    }

    cj(int param0, String param1, int param2, String param3, String param4) {
        try {
          this.field_i = param1;
          this.field_e = 0;
          this.field_g = null;
          this.field_d = param3;
          this.field_j = true;
          this.field_h = param4;
          this.field_p = 0L;
          this.field_n = param0;
          this.field_r = param1;
          this.field_m = 0;
          this.field_a = 0;
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "cj.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = "Show chat (1 unread message)";
        field_o = new int[128];
        field_f = "Return to game";
    }
}

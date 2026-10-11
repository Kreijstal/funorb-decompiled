/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    private boolean field_b;
    static int[] field_i;
    static ak field_g;
    private String field_f;
    static byte[][] field_e;
    static ob field_h;
    static mo field_d;
    static String field_a;
    static String field_c;

    final String a(int param0) {
        if (param0 != -30491) {
          field_c = (String) null;
          return this.field_f;
        }
        return this.field_f;
    }

    final static boolean b(int param0) {
        if (param0 != -10093) {
          sc.b(-27);
          return he.field_f != null ? true : false;
        }
        return he.field_f != null ? true : false;
    }

    final static String c(int param0) {
        if (hf.field_q < 2) {
          return td.field_d;
        }
        if (null != hn.field_e) {
          if (!hn.field_e.b(param0 ^ -16421)) {
            return hm.field_a;
          }
          return wa.field_a;
        }
        if (!wk.field_j.b(-3)) {
          return im.field_Mb;
        }
        if (!wk.field_j.a("commonui", -1)) {
          return g.field_q + " - " + wk.field_j.c(119, "commonui") + "%";
        }
        if (!io.field_g.b(param0 ^ -16421)) {
          return ha.field_f;
        }
        if (!io.field_g.a("commonui", -1)) {
          return pc.field_x + " - " + io.field_g.c(param0 ^ 16463, "commonui") + "%";
        }
        if (!qo.field_u.b(-3)) {
          return jd.field_p;
        }
        if (param0 != 16422) {
          sc.b(34);
        }
        if (!qo.field_u.a((byte) 92)) {
          return em.field_a + " - " + qo.field_u.c(0) + "%";
        }
        return wd.field_b;
    }

    sc(String param0) {
        this(param0, false);
    }

    sc(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_f = param0;
          if (null == this.field_f) {
            this.field_f = "";
          }
          stackIn_6_1 = (param1);
          this.field_b = stackIn_6_1;
          if (this.field_f.length() != 0) {
            return;
          }
          this.field_b = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("sc.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean b(byte param0) {
        int var2 = -65 / ((59 - param0) / 43);
        return this.field_b;
    }

    public static void a(byte param0) {
        field_a = null;
        field_h = null;
        field_c = null;
        field_g = null;
        field_i = null;
        if (param0 < -14) {
          field_e = (byte[][]) null;
          field_d = null;
          return;
        }
        field_g = (ak) null;
        field_e = (byte[][]) null;
        field_d = null;
    }

    static {
        field_e = new byte[1000][];
        field_i = new int[128];
        field_c = "Accept rematch";
    }
}

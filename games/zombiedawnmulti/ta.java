/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends al {
    static String field_jb;
    static String field_ob;
    static int[] field_ib;
    static String field_lb;
    private boolean field_kb;
    static cj field_gb;
    private String field_rb;
    private boolean field_nb;
    static char[] field_pb;
    private le field_qb;
    private String field_mb;
    static ak field_hb;

    public static void k(byte param0) {
        if (param0 <= -61) {
          field_ob = null;
          field_ib = null;
          field_hb = null;
          field_lb = null;
          field_gb = null;
          field_pb = null;
          field_jb = null;
          return;
        }
    }

    final void l(int param0) {
        this.field_qb.field_L = false;
        this.field_nb = true;
        if (param0 <= 110) {
          this.field_nb = true;
        }
    }

    ta(vk param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_mb = param1;
          if (null != this.field_mb) {
            var3_int = ci.field_d.a(this.field_mb, 260, ci.field_d.field_C);
            this.b(300, var3_int + 150, 78);
          }
          this.field_qb = new le(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_kb = false;
          this.field_qb.field_L = true;
          this.field_nb = false;
          this.b((byte) 107, this.field_qb);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ta.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, float param1, int param2, boolean param3) {
        int stackIn_3_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          stackIn_3_0 = (this.field_kb) ? 0 : 1;
          if (stackIn_3_0 == (param3 ? 1 : 0)) {
            stackIn_7_1 = (param3);
            this.field_kb = stackIn_7_1;
            if (this.field_kb) {
              this.field_qb.a(4210752, 8405024, (byte) -95);
              this.field_qb.field_L = true;
            } else {
              this.field_qb.a(4210752, 2113632, (byte) 117);
              if (this.field_nb) {
                this.field_qb.field_L = false;
              }
            }
          }
          this.field_qb.field_B = (int)(65536.0f * (param1 / 100.0f));
          this.field_rb = param0;
          if (param2 >= 24) {
            return;
          }
          field_gb = (cj) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("ta.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(byte param0, String param1) {
        try {
          int var2_int = 34 / ((param0 + 20) / 42);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ta.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (param0) {
          super.a(param0, param1, param2);
          ci.field_d.b(this.field_rb, param1 + (this.field_n >> 1), 103 + param2, 16777215, -1);
          if (null != this.field_mb) {
            oo.b(param1 + 20, 120 + (param2 - 7), 260, 8421504);
            ci.field_d.a(this.field_mb, param1 + 20, param2 + 120 + 8, 260, 100, 16777215, -1, 1, 0, ci.field_d.field_C);
          }
          return;
        }
        field_hb = (ak) null;
        super.a(param0, param1, param2);
        ci.field_d.b(this.field_rb, param1 + (this.field_n >> 1), 103 + param2, 16777215, -1);
        if (null != this.field_mb) {
          oo.b(param1 + 20, 120 + (param2 - 7), 260, 8421504);
          ci.field_d.a(this.field_mb, param1 + 20, param2 + 120 + 8, 260, 100, 16777215, -1, 1, 0, ci.field_d.field_C);
        }
    }

    static {
        field_jb = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_pb = new char[128];
    }
}

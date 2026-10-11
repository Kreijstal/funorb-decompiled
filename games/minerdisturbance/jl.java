/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends wf {
    private boolean field_Z;
    private String field_ab;
    static String field_bb;
    private String field_db;
    private boolean field_eb;
    static int[] field_gb;
    static vf field_fb;
    private oi field_cb;

    final void r(int param0) {
        if (param0 != 4595) {
          return;
        }
        this.field_eb = true;
        this.field_cb.field_O = false;
    }

    final void a(int param0, String param1, float param2, boolean param3) {
        int stackIn_5_0 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 >= -100) {
            jl.h((byte) 32);
          }
          stackIn_5_0 = (param3) ? 0 : 1;
          if (stackIn_5_0 == (this.field_Z ? 1 : 0)) {
            stackIn_10_1 = (param3);
            this.field_Z = stackIn_10_1;
            if (this.field_Z) {
              this.field_cb.a(4210752, 8405024, (byte) -107);
              this.field_cb.field_O = true;
            } else {
              this.field_cb.a(4210752, 2113632, (byte) -115);
              if (!this.field_eb) {
                this.field_cb.field_R = (int)(65536.0f * (param2 / 100.0f));
                this.field_db = param1;
                return;
              }
              this.field_cb.field_O = false;
            }
          }
          this.field_cb.field_R = (int)(65536.0f * (param2 / 100.0f));
          this.field_db = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("jl.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void h(byte param0) {
        field_bb = null;
        if (param0 < 125) {
          return;
        }
        field_fb = null;
        field_gb = null;
    }

    jl(hm param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_ab = param1;
          if (null != this.field_ab) {
            var3_int = cn.field_g.b(this.field_ab, 260, cn.field_g.field_I);
            this.a(150 + var3_int, 300, (byte) 55);
          }
          this.field_cb = new oi(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_Z = false;
          this.field_cb.field_O = true;
          this.field_eb = false;
          this.a(-1, this.field_cb);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        cn.field_g.b(this.field_db, (this.field_v >> 1) + param2, 103 + param1, 16777215, -1);
        if (this.field_ab != null) {
          eh.e(20 + param2, 120 + param1 - 7, 260, 8421504);
          cn.field_g.a(this.field_ab, param2 + 20, 120 + (param1 + 8), 260, 100, 16777215, -1, 1, 0, cn.field_g.field_I);
        }
    }

    static {
        int var2 = 0;
        int var0;
        int var1;
        int var3;
        int var4;
        int var5;
        int var6;
        double var7;
        field_gb = new int[9216];
        field_bb = "Black Gold<br>Crude Death";
        var0 = 48;
        var1 = 48;
        for (var2 = 0; var2 < field_gb.length; var2++) {
          var3 = var2 / 96;
          var4 = -(96 * var3) + var2;
          var5 = -var0 + var4;
          var6 = var3 - var1;
          var7 = -(255.0 * Math.sqrt((double)(var5 * var5 + var6 * var6)) / (double)var0) + 255.0;
          field_gb[var2] = (int)(var7 + 0.5);
          if (field_gb[var2] < 0) {
            field_gb[var2] = 0;
          }
        }
    }
}

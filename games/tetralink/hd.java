/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends um {
    static vl field_x;
    static int[] field_D;
    private boolean field_w;
    static ve field_t;
    static String field_B;
    static int field_q;
    static kl field_u;
    private cb field_A;
    static int field_v;
    static String field_z;
    private String field_y;
    static pf field_s;
    static oh field_r;

    hd(nn param0, nn param1) {
        super(param0);
        this.field_w = false;
        this.field_y = "";
        try {
          this.field_A = new cb(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static kh a(int param0, int param1, ah param2) {
        RuntimeException var3 = null;
        kh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!bg.a(-141, param1, param2)) {
            return null;
          }
          if (param0 != 1) {
            field_B = (String) null;
          }
          stackIn_6_0 = ai.b((byte) 126);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hd.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_B = null;
        field_D = null;
        field_u = null;
        field_s = null;
        field_t = null;
        if (param0 <= -54) {
          field_z = null;
          field_r = null;
          field_x = null;
          return;
        }
        String var2 = (String) null;
        hd.a((String) null, 104, -6);
        field_z = null;
        field_r = null;
        field_x = null;
    }

    final static void a(String param0, int param1, int param2) {
        try {
          ci.field_x = param1;
          ko.field_s = 1;
          if (param2 != -308) {
            field_B = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "hd.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(hl param0, byte param1) {
        hl var4 = null;
        hl var2 = null;
        int var3 = TetraLink.field_J;
        hl var2Lifetime1;
        try {
          if (param1 != -104) {
            field_x = (vl) null;
          }
          var4 = (hl) (param0.field_fb.c(false));
          var2 = var4;
          while (var4 != null) {
            var4.field_mb = 0;
            var4.field_Db = 0;
            var4.field_yb = 0;
            var4.field_R = 0;
            var4 = (hl) (param0.field_fb.a((byte) -70));
            var2Lifetime1 = var4;
          }
          param0.field_R = 0;
          param0.field_Db = 0;
          param0.field_mb = 0;
          param0.field_yb = 0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "hd.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final jk a(int param0, String param1) {
        rj var3 = null;
        RuntimeException var3_ref = null;
        jk stackIn_3_0 = null;
        jk stackIn_7_0 = null;
        jk stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_A.a(param0 ^ param0, param1) == db.field_h) {
            stackIn_3_0 = db.field_h;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_y)) {
            var3 = la.a(param1, param0 ^ 0);
            if (!var3.c(false)) {
              stackIn_7_0 = ug.field_cb;
              return stackIn_7_0;
            }
            this.field_y = param1;
            this.field_w = var3.a(true);
          }
          if (this.field_w) {
            stackIn_12_0 = pf.field_a;
          } else {
            stackIn_12_0 = db.field_h;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("hd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 26202) {
            hd.g(92);
          }
          if (this.field_A.a(0, param0) == db.field_h) {
            stackIn_5_0 = this.field_A.a(param0, 26202);
            return stackIn_5_0;
          }
          if (this.a(0, param0) != db.field_h) {
            stackIn_10_0 = tb.field_h;
            return stackIn_10_0;
          }
          stackIn_8_0 = ha.field_c;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("hd.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_B = "Orb points: <%0>";
        field_z = "<%0> has entered another game.";
    }
}

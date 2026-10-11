/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    int field_i;
    boolean field_h;
    boolean field_k;
    int field_e;
    boolean field_g;
    int field_f;
    static String[] field_b;
    static e field_n;
    static wg field_o;
    int field_a;
    static eh field_j;
    int field_c;
    boolean field_m;
    boolean field_d;
    static String field_l;

    jf() {
        this(3);
    }

    final static void a(boolean param0, eh param1, eh param2, eh param3, int param4) {
        try {
          if (param4 != -1) {
            field_n = (e) null;
          }
          w.field_I = oe.a("", false);
          w.field_I.a(false, 11358);
          cf.a(param2, param3, 60, param1);
          jg.b(461050508);
          cb.field_c = kh.field_e;
          pa.field_l = kh.field_e;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "jf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == he.field_Wb) {
            return false;
          }
          if (param0 <= -51) {
            stackIn_9_0 = !(param1.toLowerCase().indexOf(he.field_Wb.toLowerCase()) < 0);
            return stackIn_9_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("jf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static vh a(byte[] param0, int param1) {
        vh var2 = null;
        RuntimeException var2_ref = null;
        vh stackIn_5_0 = null;
        vh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          var2 = new vh(param0, el.field_w, mb.field_bb, db.field_k, gb.field_F, k.field_c, lj.field_j);
          pe.b((byte) -28);
          if (param1 == 20) {
            stackIn_7_0 = var2;
            return stackIn_7_0;
          }
          stackIn_5_0 = (vh) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("jf.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_b = null;
        field_n = null;
        field_l = null;
        if (param0 == -124) {
          field_j = null;
          return;
        }
        field_o = (wg) null;
        field_j = null;
    }

    jf(int param0) {
        int var2;
        var2 = param0;
        if (var2 == 0) {
          this.field_h = false;
          this.field_k = false;
          this.field_g = false;
          this.field_f = 0;
          this.field_m = false;
          this.field_e = -1;
          this.field_d = true;
        } else {
          if (var2 == 1) {
            this.field_e = -1;
            this.field_g = false;
            this.field_f = 0;
            this.field_a = 20;
            this.field_h = false;
            this.field_c = 50;
            this.field_k = false;
            this.field_m = true;
            this.field_i = 1;
            this.field_d = true;
          } else {
            if (var2 == 2) {
              this.field_f = 0;
              this.field_e = -1;
              this.field_g = true;
              this.field_m = false;
              this.field_h = false;
              this.field_k = false;
              this.field_d = true;
            } else {
              if (var2 == 3) {
                this.field_c = 50;
                this.field_k = true;
                this.field_h = false;
                this.field_f = 0;
                this.field_a = 20;
                this.field_g = true;
                this.field_m = false;
                this.field_d = true;
                this.field_e = -1;
                this.field_i = 1;
              }
            }
          }
        }
    }

    static {
        field_l = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}

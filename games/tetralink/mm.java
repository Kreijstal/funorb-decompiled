/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends um {
    static om field_y;
    static int field_w;
    static sd field_u;
    static je field_s;
    private nn field_r;
    static String field_q;
    private nn field_t;
    static String[] field_x;
    static String[] field_v;

    final static void a(ri param0, byte param1, boolean param2) {
        if (param1 >= -44) {
          return;
        }
        try {
          fe.a(param0, 256, param2, 113);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "mm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final jk a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        jk stackIn_3_0 = null;
        jk stackIn_7_0 = null;
        jk stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_t.field_A.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_3_0 = db.field_h;
            return stackIn_3_0;
          }
          if (!oe.a((byte) -41, var4, var3)) {
            stackIn_7_0 = db.field_h;
            return stackIn_7_0;
          }
          if (param0 != 0) {
            field_v = (String[]) null;
          }
          if (!this.a(param1, (byte) 47)) {
            return pf.field_a;
          }
          stackIn_13_0 = db.field_h;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("mm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    mm(nn param0, nn param1, nn param2) {
        super(param0);
        try {
          this.field_r = param2;
          this.field_t = param1;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "mm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_v = null;
        field_x = null;
        if (param0 == 0) {
          field_s = null;
          field_y = null;
          field_u = null;
          field_q = null;
          return;
        }
        ri var2 = (ri) null;
        mm.a((ri) null, (byte) 14, false);
        field_s = null;
        field_y = null;
        field_u = null;
        field_q = null;
    }

    private final boolean a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_r.field_A.toLowerCase();
          var4 = 124 / ((param1 + 5) / 36);
          var5 = param0.toLowerCase();
          if (var3.length() > 0) {
            if (var5.length() <= 0) {
              return false;
            }
            var6 = var3.lastIndexOf("@");
            if (var6 >= 0 &&
              var3.length() - 1 > var6) {
              var7 = var3.substring(0, var6);
              var8 = var3.substring(var6 + 1);
              if (var5.indexOf(var7) >= 0) {
                return true;
              }
              if (0 <= var5.indexOf(var8)) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("mm.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.field_t.field_A.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var5 = var4;
          if (pi.a(var5, 17510)) {
            stackIn_6_0 = ka.field_i;
            return stackIn_6_0;
          }
          if (q.a(false, var5)) {
            stackIn_9_0 = ic.field_d;
            return stackIn_9_0;
          }
          if (ha.a(var5, -78)) {
            stackIn_13_0 = ac.field_d;
            return stackIn_13_0;
          }
          if (param1 != 26202) {
            var6 = (String) null;
            discarded$1 = this.a((String) null, (byte) -27);
          }
          if (this.a(param0, (byte) 89)) {
            stackIn_18_0 = nl.field_l;
            return stackIn_18_0;
          }
          if (var7.length() <= 0) {
            stackIn_21_0 = nb.field_W;
            return stackIn_21_0;
          }
          if (jd.a(var5, -6270, var7)) {
            stackIn_25_0 = oj.field_f;
            return stackIn_25_0;
          }
          if (mf.a((byte) -28, var7, var5)) {
            stackIn_28_0 = ei.field_h;
            return stackIn_28_0;
          }
          if (!qa.a(16732, var5, var7)) {
            return ka.field_i;
          }
          stackIn_32_0 = oj.field_f;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("mm.A(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = "Try again";
        field_x = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_v = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}

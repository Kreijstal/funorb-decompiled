/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends mc {
    int field_u;
    int field_q;
    static db field_r;
    int field_s;
    boolean field_x;
    int field_n;
    static String field_p;
    static String field_w;
    int field_y;
    static int field_z;
    static String field_t;
    static byte[] field_o;
    static oh field_v;

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 4) {
            field_v = (oh) null;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_3_0 = ik.field_f.equals(cc.a(var3, (byte) 103));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ej.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, byte param2) {
        int var3;
        int var4;
        String var5;
        Object var6;
        String var7;
        CharSequence var8;
        var3 = -22 / ((-38 - param2) / 57);
        if (lf.field_b == null) {
          return;
        }
        var4 = lf.field_b.a(param0, (byte) 58);
        if (var4 == 0) {
          return;
        }
        if (var4 != 2) {
          ke.field_c = -1;
          lf.field_b = null;
          return;
        }
        if (null == lf.field_b.field_jb) {
          ke.field_c = -1;
          lf.field_b = null;
          return;
        }
        if (lf.field_b.field_jb.equals("")) {
          ke.field_c = -1;
          lf.field_b = null;
          return;
        }
        if (lf.field_b.field_jb.charAt(0) == 91) {
          var5 = lf.field_b.field_jb;
        } else {
          var8 = (CharSequence) ((Object) lf.field_b.field_jb);
          var5 = cc.a(var8, (byte) 124);
        }
        var6 = null;
        if (ke.field_c == 0) {
          var6 = qf.a((byte) 122, var5, param1);
        }
        if (ke.field_c == 1) {
          var6 = ma.a(false, var5, param1);
        }
        if (ke.field_c == 2) {
          var6 = li.a(param1, var5, 2);
        }
        if (ke.field_c == 3) {
          var6 = aa.a(var5, param1, 2, var5);
        }
        if (var6 == null) {
          ke.field_c = -1;
          lf.field_b = null;
          return;
        }
        var7 = (String) null;
        fi.a(0, 0, var5, 2, (String) (var6), (String) null);
        ke.field_c = -1;
        lf.field_b = null;
        return;
    }

    public static void a(int param0) {
        field_r = null;
        field_v = null;
        field_o = null;
        field_p = null;
        field_w = null;
        if (param0 == -1) {
          field_t = null;
          return;
        }
        field_z = -123;
        field_t = null;
    }

    ej(int param0, int param1, boolean param2) {
        this.field_y = 0;
        this.field_q = 0;
        this.field_x = param2 ? true : false;
        this.field_u = param1;
        this.field_n = param0;
    }

    ej(bi param0, boolean param1) {
        try {
          this.field_x = param1 ? true : false;
          this.field_s = 0;
          this.field_q = 0;
          this.field_y = 0;
          this.field_u = param0.field_f;
          this.field_n = param0.field_b;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_w = "Offer rematch";
        field_p = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_r = new db(2, 4, 4, 0);
        field_z = 250;
        field_t = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}

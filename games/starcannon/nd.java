/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends qf {
    static hl[] field_j;
    static String field_l;
    static ue field_p;
    static int field_k;
    private String field_n;
    static int field_m;
    private boolean field_o;

    public static void g(int param0) {
        field_l = null;
        field_p = null;
        field_j = null;
        if (param0 == 0) {
          return;
        }
        field_m = 113;
    }

    nd(fe param0) {
        super(param0);
        this.field_o = false;
    }

    final p a(String param0, int param1) {
        ig var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        p stackIn_2_0 = null;
        p stackIn_11_0 = null;
        p stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!jj.a(200, var4)) {
            stackIn_2_0 = sb.field_n;
            return stackIn_2_0;
          }
          if (param1 != -26188) {
            this.field_n = (String) null;
          }
          if (!param0.equals(this.field_n)) {
            var3 = tg.a(param1 + 26118, param0);
            if (var3 != null &&
              null == var3.field_d) {
              this.field_o = var3.field_f;
              this.field_n = param0;
            } else {
              stackIn_11_0 = cd.field_a;
              return stackIn_11_0;
            }
          }
          if (this.field_o) {
            stackIn_16_0 = bf.field_x;
          } else {
            stackIn_16_0 = sb.field_n;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("nd.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        ud var10 = gf.field_c[param3];
        ud var11 = var10;
        int var5 = var11.field_j * param0 / 1000;
        int var6 = var11.field_j * param2 / 1000;
        if (!(var11.field_i.length >= var5 + var6)) {
          var6 = var11.field_i.length - var5;
        }
        byte[] var15 = new byte[var6];
        ug.a(var11.field_i, var5, var15, 0, var6);
        int var8 = -var5 + var11.field_h;
        if (var8 < 0) {
          var8 = 0;
        }
        if (var8 > var6) {
          var8 = var6;
        }
        int var9 = var11.field_g - var5;
        if (var9 < 0) {
          var9 = 0;
        }
        if (var9 > var6) {
          var9 = var6;
        }
        if (param1 == -3763) {
          gf.field_c[param3] = new ud(var11.field_j, var15, var8, var9, var10.field_k);
          return;
        }
        nd.a(false, -9, -79);
        gf.field_c[param3] = new ud(var11.field_j, var15, var8, var9, var10.field_k);
    }

    final void f(int param0) {
        if (param0 != -18507) {
          field_p = (ue) null;
          this.field_n = null;
          return;
        }
        this.field_n = null;
    }

    final String a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        ig var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        String stackIn_5_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var5 = (String) null;
            this.a((String) null, false);
          }
          var6 = (CharSequence) ((Object) param0);
          var3 = lj.a((byte) -5, var6);
          if (var3 != null) {
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (!param0.equals(this.field_n)) {
            var4 = tg.a(-58, param0);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_d) {
              return null;
            }
            this.field_n = param0;
            this.field_o = var4.field_f;
          }
          if (this.field_o) {
            stackIn_17_0 = ll.field_a;
            return stackIn_17_0;
          }
          stackIn_15_0 = cf.field_s;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("nd.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean b(boolean param0) {
        hd.field_p = param0 ? true : false;
        wa.field_a = 15000L + dd.b(109);
        return bl.field_a == 11 ? true : false;
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = StarCannon.field_A;
        try {
          if (!param0) {
            field_j = (hl[]) null;
          }
          var3_int = 0;
          while (0 < param2) {
            var3_int = var3_int << 1 | param1 & 1;
            param1 = param1 >>> 1;
            param2--;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "nd.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(int param0, byte param1) {
        rf var2 = null;
        int var3 = 0;
        of var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = StarCannon.field_A;
        try {
          if (param1 != -66) {
            field_p = (ue) null;
          }
          var4 = (of) (fi.field_c.c(param1 - 3839));
          while (var4 != null) {
            bb.a(param1 + 68, param0, var4);
            var4 = (of) (fi.field_c.a(param1 ^ 16977));
          }
          var2 = ab.field_H.c(param1 - 3839);
          while (var2 != null) {
            sc.a(param1 ^ -32459, param0);
            var2 = ab.field_H.a(-16913);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "nd.N(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_l = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}

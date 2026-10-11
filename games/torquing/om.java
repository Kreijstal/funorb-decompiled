/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om {
    static int field_h;
    private ei field_a;
    private int field_i;
    private int[][][] field_d;
    private int field_f;
    private int field_g;
    private ka[] field_j;
    static String field_e;
    private int field_c;
    boolean field_b;

    final int[][] a(int param0, int param1) {
        boolean stackIn_6_1 = false;
        boolean stackIn_18_1 = false;
        ka var3;
        ka var4;
        int var5;
        var5 = Torquing.field_u;
        if (param0 != 15142) {
          return (int[][]) null;
        }
        if (this.field_g == this.field_c) {
          stackIn_6_1 = (null == this.field_j[param1]);
          this.field_b = stackIn_6_1;
          this.field_j[param1] = da.field_b;
          return this.field_d[param1];
        }
        if (this.field_g == 1) {
          stackIn_18_1 = (param1 != this.field_f);
          this.field_b = stackIn_18_1;
          this.field_f = param1;
          return this.field_d[0];
        }
        var3 = this.field_j[param1];
        if (var3 != null) {
          this.field_b = false;
        } else {
          this.field_b = true;
          if (this.field_i < this.field_g) {
            var3 = new ka(param1, this.field_i);
            this.field_i = this.field_i + 1;
          } else {
            var4 = (ka) (this.field_a.c(-6938));
            var3 = new ka(param1, var4.field_k);
            this.field_j[var4.field_m] = null;
            var4.f(param0 - 15142);
          }
          this.field_j[param1] = var3;
        }
        this.field_a.b((byte) 68, var3);
        return this.field_d[var3.field_k];
    }

    final static void a(byte param0, String param1, java.applet.Applet param2) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var4 = null;
          String var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            rd.field_t = param1;
            try {
              var7 = param2.getParameter("cookieprefix");
              var5 = var7;
              var5Lifetime1 = var7;
              var6 = -25 / ((-12 - param0) / 45);
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var8 = var7 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var8;
              var5Lifetime5 = var8;
              if (0 != param1.length()) {
                var5Lifetime6 = var8 + "; Expires=" + ka.a(94608000000L + km.b(-1), -2) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              hp.a("document.cookie=\"" + var5Lifetime6 + "\"", 27476, param2);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            j.a(true, param2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var3_ref;
            stackIn_11_1 = new StringBuilder().append("om.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int[][][] a(boolean param0) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        if (this.field_g != this.field_c) {
          throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = 0; this.field_g > var2; var2++) {
          this.field_j[var2] = da.field_b;
        }
        if (param0) {
          this.a(-76, 126);
        }
        return this.field_d;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 0) {
          java.applet.Applet var6 = (java.applet.Applet) null;
          om.a((byte) 127, (String) null, (java.applet.Applet) null);
        }
        qg.field_z = param2;
        j.field_q = param0;
        kn.field_e = param1;
        qk.field_p = param4;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        for (var2 = 0; var2 < this.field_g; var2++) {
          this.field_d[var2][0] = null;
          this.field_d[var2][1] = null;
          this.field_d[var2][2] = null;
          this.field_d[var2] = (int[][]) null;
        }
        this.field_j = null;
        if (param0 > -17) {
          return;
        }
        this.field_d = (int[][][]) null;
        this.field_a.a(0);
        this.field_a = null;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 0) {
          om.a(33, -105, -127, 51, -91);
        }
    }

    om(int param0, int param1, int param2) {
        this.field_i = 0;
        this.field_f = -1;
        this.field_a = new ei();
        this.field_b = false;
        this.field_c = param1;
        this.field_g = param0;
        this.field_d = new int[this.field_g][3][param2];
        this.field_j = new ka[this.field_c];
    }

    static {
        field_h = -1;
        field_e = "Your score";
    }
}

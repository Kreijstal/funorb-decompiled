/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jl {
    int field_o;
    private int field_i;
    ih field_h;
    private int field_g;
    private String[] field_b;
    private String field_m;
    static IntrusiveDeque field_n;
    static int field_a;
    private int field_j;
    private int field_e;
    private int field_k;
    int field_d;
    static String field_l;
    int field_f;
    static int[] field_p;
    static String field_c;

    void a(int param0, ih param1, int param2, int param3) {
        try {
          int var5_int = 107 / ((param3 - 47) / 60);
          this.field_k = param2;
          this.field_j = param0;
          this.field_h = param1;
          this.a((byte) 102);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "jl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(String[] param0, int param1) {
        String stackIn_23_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (this.field_h == null) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param0 == null) {
            int stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          if (param0.length == 0) {
            int stackIn_11_0 = 0;
            return stackIn_11_0;
          }
          int var3_int = 0;
          String[] var4 = param0;
          for (int var5 = param1; var4.length > var5; var5++) {
            String var6 = var4[var5];
            int var7 = this.field_h.b(var6);
            if (var3_int <= var7) {
              var3_int = var7;
            }
          }
          int stackIn_19_0 = var3_int;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var3;
          StringBuilder stackIn_22_1 = new StringBuilder().append("jl.M(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0) {
        int var2 = 640;
        if (param0 <= 39) {
          field_c = (String) null;
        }
        this.field_d = var2 / 2;
        this.field_g = var2 / 2;
        this.field_o = var2 * 3 / 4;
        this.field_f = this.c((byte) 111);
        this.field_i = this.field_f / 2;
        this.field_e = this.field_f + (this.field_i + this.a(this.field_b, (byte) 113));
    }

    final static void b(int param0) {
        se.a((byte) 86, PointCloudEffect.d((byte) -91));
        if (param0 != 2) {
          jl.releaseStatics(8);
        }
    }

    public static void releaseStatics(int guard) {
        field_n = null;
        if (guard != -30082) {
          jl.releaseStatics(113);
        }
        field_l = null;
        field_p = null;
        field_c = null;
    }

    final int b(int param0, int param1) {
        if (this.field_h == null) {
          return param0;
        }
        if (this.field_m == null) {
          return param0;
        }
        if (this.field_m.length() == 0) {
          return param0;
        }
        this.field_h.c(this.field_m, this.field_g, param0, this.field_k, -1);
        if (param1 != 13947) {
          return 12;
        }
        return this.field_f + this.field_i;
    }

    final int a(boolean param0) {
        if (!param0) {
          this.field_f = 117;
        }
        return this.field_o;
    }

    private final void a(boolean param0, int param1) {
        int var16 = EscapeVector.obfuscationControl;
        if (this.field_h == null) {
          return;
        }
        if (this.field_b == null) {
          return;
        }
        if (this.field_b.length == 0) {
          return;
        }
        String[] var17 = this.field_b;
        if (!param0) {
          this.a((byte) 91, 82);
        }
        for (int var4 = 0; var17.length > var4; var4++) {
          String var5 = var17[var4];
          if (var5 != null &&
            var5.length() != 0) {
            int var6 = 640;
            int var7 = (-this.field_o + var6) / 2;
            int var8 = param1 - this.field_h.field_r;
            int var9 = this.field_o;
            int var10 = this.field_j;
            int var11 = -1;
            int var12 = 1;
            int var13 = 0;
            int var14 = this.field_f;
            int var15 = this.field_h.a(var5, var7, var8, var9, param1, var10, var11, var12, var13, var14);
            param1 = param1 + var15 * this.field_f;
          }
        }
    }

    final void a(byte param0, int param1) {
        this.field_d = this.field_d + param1;
        this.field_g = this.field_g + param1;
        if (param0 > -64) {
          this.field_f = 52;
        }
    }

    final int b(byte param0) {
        if (param0 != -90) {
          this.a((byte) -46);
        }
        return this.field_e;
    }

    private final int a(String[] param0, byte param1) {
        String stackIn_28_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (this.field_h == null) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param0 == null) {
            int stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          if (param0.length == 0) {
            int stackIn_11_0 = 0;
            return stackIn_11_0;
          }
          if (param1 <= 97) {
            this.field_e = 12;
          }
          int var3_int = 0;
          String[] var4 = param0;
          for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            if (var6 != null &&
              0 != var6.length()) {
              int var7 = this.field_h.a(var6, this.field_o);
              var3_int = var3_int + var7 * this.field_f;
            }
          }
          int stackIn_24_0 = var3_int;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_27_0 = var3;
          StringBuilder stackIn_27_1 = new StringBuilder().append("jl.J(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final int c(byte param0) {
        if (param0 <= 98) {
          return -42;
        }
        int var2 = 0;
        if (this.field_h != null) {
          var2 = this.field_h.field_r + this.field_h.field_x;
        } else {
          var2 = 0;
        }
        return var2;
    }

    void a(int param0, int param1) {
        if (null == this.field_h) {
          return;
        }
        int var3 = this.field_h.field_r;
        param0 = param0 + var3;
        param0 = param0 + this.b(param0, 13947);
        this.a(true, param0);
        if (param1 != 3) {
          this.field_h = (ih) null;
        }
    }

    jl(String param0, String[] param1) {
        try {
          if (param0 != null) {
            this.field_m = param0.toUpperCase();
          }
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = 35;
        field_n = new IntrusiveDeque();
        field_l = "Please try again in a few minutes.";
        field_p = new int[8192];
        field_c = "Restarting level";
    }
}

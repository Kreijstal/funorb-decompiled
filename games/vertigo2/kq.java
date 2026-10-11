/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq extends cr {
    private int field_Yb;
    static String field_Vb;
    static int field_Jb;
    static fe field_Kb;
    private cr field_Nb;
    private er[] field_Pb;
    private int[] field_Mb;
    private int field_Xb;
    private cr field_Sb;
    private int field_Qb;
    static String field_Ub;
    private int field_Ob;
    private int field_Tb;
    private int field_Ib;
    static ve field_Lb;
    static nj field_Rb;
    private int field_Hb;
    private nk[] field_Wb;

    final static void a(byte param0) {
        if (ol.field_B != 0) {
          ol.field_B = 0;
        } else {
          ol.field_B = -1;
        }
        int var1 = -56 / ((92 - param0) / 32);
    }

    kq(cr param0, er[] param1, cr param2, cr param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Mb = new int[256];
        this.field_Ib = -2;
        this.field_Wb = new nk[256];
        try {
          this.field_Qb = param6;
          this.field_Xb = param4;
          this.field_Ob = param5;
          this.field_Sb = param3;
          this.field_Hb = param8;
          this.field_Nb = param2;
          this.field_Pb = param1;
          this.field_Yb = param7;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "kq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void c(int param0, int param1, int param2, int param3, int param4) {
        int var10 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = Vertigo2.field_L ? 1 : 0;
        if (this.field_Tb == 0) {
          this.field_Wb[this.field_Tb] = new nk(0L, (cr) null, (cr) null, this.field_Nb, (er) null, uk.field_y);
          this.field_Wb[this.field_Tb].field_ab = 1;
          this.b(this.field_Wb[this.field_Tb], 125);
          this.field_Mb[this.field_Tb] = -1;
          this.field_Tb = this.field_Tb + 1;
        }
        var6 = 0;
        for (var7 = 0; var7 < this.field_Tb; var7++) {
          var8 = this.field_Wb[var7].b(this.field_Ob, this.field_Qb, param2 - 23472);
          if (var8 > var6) {
            var6 = var8;
          }
        }
        var6 = var6 + this.field_Xb * 2;
        var7Lifetime1 = this.field_Yb + (this.field_Hb * this.field_Tb + this.field_Yb);
        var8Lifetime1 = jf.a(var6, param4, param3, 1);
        var9 = dm.a(param0, param2 + 1220, var7Lifetime1, param1);
        this.a(param2 + 1335, var6, var7Lifetime1, var9, var8Lifetime1);
        if (param2 != -1220) {
          field_Kb = (fe) null;
        }
        for (var10 = 0; var10 < this.field_Tb; var10++) {
          this.field_Wb[var10].a(this.field_Yb + this.field_Hb * var10, var6 - 2 * this.field_Xb, this.field_Qb, this.field_Hb, this.field_Ob, 1, this.field_Xb);
        }
    }

    final static void b(int param0, boolean param1) {
        ee.a(8, param1);
        if (param0 > -45) {
          field_Lb = (ve) null;
        }
        fb.a(0, param1);
    }

    final static long a(byte param0, CharSequence param1) {
        int var5 = 0;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_long = 0L;
          var4 = param1.length();
          if (param0 <= 14) {
            field_Rb = (nj) null;
          }
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(var6 + 1 - 65);
            } else if (97 <= var6 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-97 + (1 + var6));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(-48 + var6 + 27);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (0L == var2_long % 37L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_22_0 = var2_long;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("kq.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        this.a(0, param1);
        if (!param1) {
          return -2;
        }
        for (var3 = 0; var3 < this.field_Tb; var3++) {
          if (this.field_Wb[var3].field_tb != 0) {
            return this.field_Mb[var3];
          }
        }
        if (param0) {
          this.a(true, false);
        }
        if (kf.field_c != 0) {
          return -1;
        }
        return this.field_Ib;
    }

    final void a(String param0, er param1, int param2, int param3) {
        try {
          this.field_Wb[this.field_Tb] = new nk(0L, (cr) null, (cr) null, this.field_Sb, param1, param0);
          if (param3 >= -48) {
            field_Vb = (String) null;
          }
          this.field_Wb[this.field_Tb].field_Q = this.field_Pb;
          this.field_Wb[this.field_Tb].field_jb = true;
          this.field_Wb[this.field_Tb].field_ab = 1;
          this.b(this.field_Wb[this.field_Tb], 119);
          this.field_Mb[this.field_Tb] = param2;
          this.field_Tb = this.field_Tb + 1;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "kq.L(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void k(int param0) {
        field_Rb = null;
        field_Vb = null;
        field_Kb = null;
        field_Lb = null;
        if (param0 < 110) {
          kq.a((byte) -85);
        }
        field_Ub = null;
    }

    final static v a(boolean param0, String param1, int param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        v stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          var6 = null;
          if (param3.indexOf('@') != param2) {
            var6 = param3;
          } else {
            var7 = (CharSequence) ((Object) param3);
            var4_long = kq.a((byte) 123, var7);
          }
          stackIn_4_0 = dp.a(param1, (String) (var6), (byte) -7, param0, var4_long);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("kq.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    kq(kq param0) {
        this(param0, param0.field_Pb, param0.field_Nb, param0.field_Sb, param0.field_Xb, param0.field_Ob, param0.field_Qb, param0.field_Yb, param0.field_Hb);
    }

    final boolean b(byte param0) {
        if (this.field_Ib != -2) {
          return false;
        }
        if (de.field_f == 13) {
          this.field_Ib = -1;
        }
        if (param0 != 81) {
          String var3 = (String) null;
          this.a((String) null, -67, -19);
        }
        return true;
    }

    final void a(String param0, int param1, int param2) {
        try {
          this.field_Wb[this.field_Tb] = new nk((long)param2, (cr) null, (cr) null, this.field_Sb, (er) null, param0);
          this.field_Wb[this.field_Tb].field_Q = this.field_Pb;
          this.field_Wb[this.field_Tb].field_jb = true;
          this.field_Wb[this.field_Tb].field_ab = 1;
          this.b(this.field_Wb[this.field_Tb], 124);
          this.field_Mb[this.field_Tb] = param1;
          this.field_Tb = this.field_Tb + 1;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "kq.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_Vb = "Loading animations";
        field_Jb = 22;
        field_Ub = "Join <%0>'s game";
        field_Lb = new ve(13, 0, 1, 0);
    }
}

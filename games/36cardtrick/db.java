/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db implements ci {
    static kl field_a;
    private ee field_n;
    private int field_k;
    static byte field_p;
    private int field_g;
    private int field_t;
    private int field_e;
    private int field_h;
    static int field_m;
    private int field_i;
    private int field_r;
    static int[] field_c;
    static String field_f;
    private int field_d;
    private int field_j;
    static String field_b;
    private int field_q;
    static kc field_o;
    private int field_s;
    static int[] field_l;

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        lk stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ua var11 = null;
        try {
          if (param1 instanceof ua) {
            stackIn_3_0 = (lk) (param1);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (ua) (stackIn_3_0);
          if (param2 != 11447) {
            return;
          }
          if (var11 != null) {
            param4 = param4 & var11.field_B;
          }
          var7 = 5592405;
          if (param4) {
            var7 = 16777215;
          }
          vj.c(param1.field_o + param0, param3 + param1.field_i, param1.field_h, param1.field_q, this.field_i);
          var8 = this.field_q + param0 + param1.field_o;
          var9 = this.field_t + param1.field_i + param3;
          vj.f(var8, var9, this.field_d, this.field_g, 5592405);
          vj.c(var8, var9, this.field_d, this.field_g, var7);
          if (var11.field_D) {
            vj.e(var8, var9, this.field_d + var8, this.field_g + var9, 1);
            vj.e(this.field_d + var8, var9, var8, this.field_g + var9, 1);
          }
          if (null != this.field_n) {
            var10 = this.field_d + (this.field_q + this.field_j);
            this.field_n.a(param1.field_r, var10 + param0 + param1.field_o, param1.field_i + (param3 + this.field_e), -this.field_j + (-var10 + param1.field_h), param1.field_q - (this.field_j << 1), this.field_r, this.field_h, this.field_k, this.field_s, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("db.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        byte[] var16 = null;
        pb var17 = null;
        pb var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var12Lifetime3;
        var15 = Main.field_T;
        try {
          var17 = new pb(param1);
          var18 = var17;
          var18.field_i = -2 + param1.length;
          cf.field_c = var18.d((byte) 72);
          hb.field_a = new int[cf.field_c];
          kb.field_c = new int[cf.field_c];
          rd.field_k = new byte[cf.field_c][];
          na.field_q = new int[cf.field_c];
          ml.field_b = new int[cf.field_c];
          hl.field_y = new boolean[cf.field_c];
          vd.field_r = new byte[cf.field_c][];
          var18.field_i = -(8 * cf.field_c) + param1.length - 7;
          p.field_l = var18.d((byte) 72);
          if (!param0) {
            var16 = (byte[]) null;
            db.a(false, (byte[]) null);
          }
          gk.field_a = var18.d((byte) 72);
          var3 = 1 + (255 & var18.f(27));
          for (var4 = 0; var4 < cf.field_c; var4++) {
            kb.field_c[var4] = var17.d((byte) 72);
          }
          for (var4Lifetime1 = 0; cf.field_c > var4Lifetime1; var4Lifetime1++) {
            ml.field_b[var4Lifetime1] = var18.d((byte) 72);
          }
          for (var4Lifetime2 = 0; cf.field_c > var4Lifetime2; var4Lifetime2++) {
            na.field_q[var4Lifetime2] = var18.d((byte) 72);
          }
          for (var4Lifetime3 = 0; cf.field_c > var4Lifetime3; var4Lifetime3++) {
            hb.field_a[var4Lifetime3] = var18.d((byte) 72);
          }
          var18.field_i = param1.length + (-7 - cf.field_c * 8 - 3 * (var3 - 1));
          jf.field_i = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            jf.field_i[var4Lifetime4] = var18.e(true);
            if (jf.field_i[var4Lifetime4] == 0) {
              jf.field_i[var4Lifetime4] = 1;
            }
          }
          var18.field_i = 0;
          for (var4Lifetime5 = 0; cf.field_c > var4Lifetime5; var4Lifetime5++) {
            L7: {
              var5 = na.field_q[var4Lifetime5];
              var6 = hb.field_a[var4Lifetime5];
              var7 = var5 * var6;
              var21 = new byte[var7];
              var19 = var21;
              var8 = var19;
              rd.field_k[var4Lifetime5] = var21;
              var22 = new byte[var7];
              var20 = var22;
              var9 = var20;
              vd.field_r[var4Lifetime5] = var22;
              var10 = 0;
              var11 = var18.f(-102);
              if ((var11 & 1) == 0) {
                var12 = 0;
                while (true) {
                  stackIn_43_0 = ~var12;
                  stackIn_43_1 = ~var7;
                  if (stackIn_43_0 > stackIn_43_1) {
                    var8[var12] = var18.a(true);
                    var12++;
                    continue;
                  }
                  break;
                }
                if (((2 & var11) != 0)) {
                  for (var12Lifetime3 = 0; var12Lifetime3 < var7; var12Lifetime3++) {
                    dupTemp$0 = var18.a(true);
                    var9[var12Lifetime3] = dupTemp$0;
                    var13 = dupTemp$0;
                    stackIn_51_0 = var10;
                    if (var13 == -1) {
                      stackIn_52_1 = 0;
                    } else {
                      stackIn_52_1 = 1;
                    }
                    var10 = stackIn_51_0 | stackIn_52_1;
                  }
                }
                break L7;
              }
              for (var12Lifetime1 = 0; var5 > var12Lifetime1; var12Lifetime1++) {
                for (var13Lifetime1 = 0; var6 > var13Lifetime1; var13Lifetime1++) {
                  var8[var12Lifetime1 + var13Lifetime1 * var5] = var18.a(true);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12Lifetime2 = 0; var12Lifetime2 < var5; var12Lifetime2++) {
                  for (var13Lifetime2 = 0; var13Lifetime2 < var6; var13Lifetime2++) {
                    dupTemp$1 = var18.a(true);
                    var9[var5 * var13Lifetime2 + var12Lifetime2] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_37_0 = var10;
                    if (-1 == var14) {
                      stackIn_38_1 = 0;
                    } else {
                      stackIn_38_1 = 1;
                    }
                    var10 = stackIn_37_0 | stackIn_38_1;
                  }
                }
              }
            }
            hl.field_y[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_57_0 = var2;
          stackIn_57_1 = new StringBuilder().append("db.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
          return;
        }
        field_f = null;
        field_a = null;
        field_b = null;
        field_c = null;
        field_l = null;
    }

    db(ee param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_k = 1;
        this.field_s = 1;
        try {
          this.field_g = param7;
          this.field_r = param3;
          this.field_i = param9;
          this.field_n = param0;
          this.field_j = param1;
          this.field_d = param8;
          this.field_e = param2;
          this.field_q = param5;
          this.field_h = param4;
          this.field_t = param6;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_c = new int[128];
        field_b = "Menu";
    }
}

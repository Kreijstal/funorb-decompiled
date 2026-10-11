/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends ak {
    private int field_Qb;
    static te field_Rb;
    private int field_Nb;
    private int field_Eb;
    private int field_Lb;
    private int[] field_Mb;
    private ak field_Pb;
    static int field_Fb;
    private int field_Gb;
    private int field_Ob;
    private lo[] field_Ib;
    private ak field_Jb;
    private tf[] field_Kb;
    private int field_Hb;

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          if (param2 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param2 == 1) {
            var10 = param0[param1];
            var4 = var10;
            if (var4 != null) {
              stackIn_10_0 = var10.toString();
              return stackIn_10_0;
            }
            stackIn_8_0 = "null";
            return stackIn_8_0;
          }
          var4_int = param1 + param2;
          if (param3 != 21197) {
            stackIn_13_0 = (String) null;
            return stackIn_13_0;
          }
          var5 = 0;
          for (var6_int = param1; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param1; var7 < var4_int; var7++) {
            var8 = param0[var7];
            if (var8 == null) {
              discarded$0 = var6.append("null");
            } else {
              discarded$1 = var6.append(var8);
            }
          }
          stackIn_27_0 = var6.toString();
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("pi.A(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_Rb = null;
        if (param0 < 121) {
          CharSequence[] var2 = (CharSequence[]) null;
          pi.a((CharSequence[]) null, -85, 35, 38);
        }
    }

    pi(pi param0) {
        this(param0, param0.field_Kb, param0.field_Pb, param0.field_Jb, param0.field_Ob, param0.field_Nb, param0.field_Lb, param0.field_Eb, param0.field_Qb);
    }

    final void a(String param0, byte param1, int param2) {
        try {
          this.field_Ib[this.field_Hb] = new lo(0L, (ak) null, (ak) null, this.field_Jb, (tf) null, param0);
          this.field_Ib[this.field_Hb].field_ab = this.field_Kb;
          this.field_Ib[this.field_Hb].field_A = true;
          this.field_Ib[this.field_Hb].field_kb = 1;
          this.a(this.field_Ib[this.field_Hb], (byte) 26);
          this.field_Mb[this.field_Hb] = param2;
          if (param1 > -23) {
            this.field_Pb = (ak) null;
          }
          this.field_Hb = this.field_Hb + 1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pi.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static Boolean c(byte param0) {
        Boolean var1 = kj.field_j;
        if (param0 != 104) {
          CharSequence[] var2 = (CharSequence[]) null;
          pi.a((CharSequence[]) null, 88, -25, -27);
        }
        kj.field_j = null;
        return var1;
    }

    final void a(int param0, int param1, tf param2, String param3) {
        try {
          this.field_Ib[this.field_Hb] = new lo((long)param0, (ak) null, (ak) null, this.field_Jb, param2, param3);
          this.field_Ib[this.field_Hb].field_ab = this.field_Kb;
          this.field_Ib[this.field_Hb].field_A = true;
          this.field_Ib[this.field_Hb].field_kb = 1;
          this.a(this.field_Ib[this.field_Hb], (byte) 26);
          this.field_Mb[this.field_Hb] = param1;
          this.field_Hb = this.field_Hb + 1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pi.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        this.a(param0 ^ 24573, param1);
        if (!param1) {
          return -2;
        }
        if (param0 != -12487) {
          return 40;
        }
        for (var3 = 0; this.field_Hb > var3; var3++) {
          if (this.field_Ib[var3].field_P != 0) {
            return this.field_Mb[var3];
          }
        }
        if (nm.field_c != 0) {
          return -1;
        }
        return this.field_Gb;
    }

    final boolean j(int param0) {
        if (this.field_Gb != -2) {
          return false;
        }
        int var2 = -31 / ((71 - param0) / 52);
        if (ke.field_a != 13) {
          return true;
        }
        this.field_Gb = -1;
        return true;
    }

    pi(ak param0, tf[] param1, ak param2, ak param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Mb = new int[256];
        this.field_Gb = -2;
        this.field_Ib = new lo[256];
        try {
          this.field_Kb = param1;
          this.field_Jb = param3;
          this.field_Lb = param6;
          this.field_Qb = param8;
          this.field_Nb = param5;
          this.field_Eb = param7;
          this.field_Ob = param4;
          this.field_Pb = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var10 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = Pixelate.field_H ? 1 : 0;
        if (this.field_Hb == 0) {
          this.field_Ib[this.field_Hb] = new lo(0L, (ak) null, (ak) null, this.field_Pb, (tf) null, ln.field_l);
          this.field_Ib[this.field_Hb].field_kb = 1;
          this.a(this.field_Ib[this.field_Hb], (byte) 26);
          this.field_Mb[this.field_Hb] = -1;
          this.field_Hb = this.field_Hb + 1;
        }
        var6 = 0;
        if (param2 < 12) {
          this.field_Hb = 83;
        }
        for (var7 = 0; var7 < this.field_Hb; var7++) {
          var8 = this.field_Ib[var7].c(-25469, this.field_Lb, this.field_Nb);
          if (var6 < var8) {
            var6 = var8;
          }
        }
        var6 = var6 + 2 * this.field_Ob;
        var7Lifetime1 = this.field_Qb * this.field_Hb + (this.field_Eb + this.field_Eb);
        var8Lifetime1 = ui.a(param4, param1, var6, (byte) -1);
        var9 = pj.a(var7Lifetime1, param3, param0, (byte) 45);
        this.a(var9, var7Lifetime1, var8Lifetime1, 256, var6);
        for (var10 = 0; var10 < this.field_Hb; var10++) {
          this.field_Ib[var10].a(this.field_Qb, this.field_Nb, this.field_Lb, this.field_Eb + this.field_Qb * var10, this.field_Ob, var6 - 2 * this.field_Ob, -2147483648);
        }
    }

    static {
        field_Fb = 10;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends uc {
    private tf[] field_s;
    private int field_q;
    static String field_r;
    static wm field_u;
    static tf field_w;
    private int field_v;
    private int field_t;

    final static boolean[] a(hh param0, int param1) {
        int var3 = 0;
        boolean[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        boolean[] var5 = null;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        boolean[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          var5 = new boolean[param0.field_f * param0.field_a];
          var2 = var5;
          if (param1 != 21922) {
            field_u = (wm) null;
          }
          for (var3 = 0; var5.length > var3; var3++) {
            stackIn_7_0 = var5;
            stackIn_7_1 = var3;
            stackIn_8_2 = !(param0.field_n[var3] <= 1);
            stackIn_7_0[stackIn_7_1] = stackIn_8_2;
          }
          stackIn_10_0 = var5;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("ad.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static te a(int param0, ak param1, int[] param2, ak param3, ak param4) {
        int var10_int = 0;
        int var5_int = 0;
        String[] var6 = null;
        char[] var7 = null;
        te[] var8 = null;
        int var9 = 0;
        kp var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_7_0 = null;
        te stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var5 = null;
        Exception var10 = null;
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          var5_int = param2.length;
          var6 = new String[var5_int];
          var14 = new char[var5_int];
          var13 = var14;
          var7 = var13;
          var8 = new te[var5_int];
          var9 = (char)param0;
          try {
            for (var10_int = 0; var10_int < var5_int; var10_int++) {
              var11 = jd.field_k.a(-21209, param2[var10_int]);
              var6[var10_int] = var11.a((byte) -54);
              var9 = (char)(var9 + 1);
              var7[var10_int] = (char)var9;
              var8[var10_int] = null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            stackIn_7_0 = null;
            return (te) (stackIn_7_0);
          }
          stackIn_9_0 = new te(0L, param4, param1, param3, var8, param2, var6, var14);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ad.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_w = null;
        field_r = null;
        if (param0 > -24) {
          tf[] var2 = (tf[]) null;
          ad.a((tf[]) null, 23, -123, 94);
        }
        field_u = null;
    }

    final static void a(tf[] param0, int param1, int param2, int param3) {
        try {
          if (param2 > -57) {
            hh var5 = (hh) null;
            ad.a((hh) null, -30);
          }
          he.field_a = new sb(param0);
          gh.field_t = param3;
          we.field_n = param1;
          bb.h(-126);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ad.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public ad() {
        this(2188450, 2591221, 9543);
    }

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (param1 != -124) {
            return;
          }
          if (!param0.field_D) {
            stackIn_8_0 = (param0.b(true)) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var6_int = stackIn_8_0;
          if (param0 instanceof qm) {
            param4 = param4 & ((qm) (param0)).field_H;
          }
          if (param4) {
            if (var6_int == 0) {
              stackIn_16_0 = this.field_t;
            } else {
              stackIn_16_0 = this.field_q;
            }
          } else {
            stackIn_16_0 = this.field_v;
          }
          var7 = stackIn_16_0;
          td.a(param3 + param0.field_z, param0.field_p + (param2 + (param0.field_C - this.field_s[0].field_B >> 1)), param0.field_E, this.field_s, (byte) 121, var7);
          stackIn_19_0 = (param4) ? 16777215 : 7105644;
          var8 = stackIn_19_0;
          this.field_a.a(param0.field_q, param3 + param0.field_z, param2 + param0.field_p - 2, param0.field_E, param0.field_C, var8, -1, 1, 1, this.field_a.field_w);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ad.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private ad(int param0, int param1, int param2) {
        this.field_v = param2;
        this.field_q = param1;
        this.field_t = param0;
        this.field_a = ba.field_d;
        this.field_s = fc.field_d;
    }

    static {
        field_u = new wm(15, 0, 1, 0);
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends km {
    static km field_Ib;
    static String field_Eb;
    private km field_Jb;
    static lc field_Fb;
    static String field_Gb;
    static int field_Hb;

    final static void a(long param0, String param1, int param2) {
        CharSequence var5 = null;
        try {
          sd.field_e = 2;
          va.field_d = param1;
          var5 = (CharSequence) ((Object) param1);
          d.field_Gb = c.a(var5, true);
          oc.field_n = param0;
          qc.field_h = true;
          if (param2 != -1) {
            na.e((byte) 44);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "na.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(boolean param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = ed.a(param1, 0, param2, -26459);
            return stackIn_4_0;
          }
          stackIn_2_0 = -52;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("na.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_Fb = null;
        field_Eb = null;
        if (param0 != 56) {
          String var2 = (String) null;
          na.a(-94L, (String) null, 9);
        }
        field_Ib = null;
        field_Gb = null;
    }

    na(km param0, km param1, km param2, km param3, km param4, km param5) {
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        km var8 = null;
        km var9 = null;
        int var10 = 0;
        int var11 = 0;
        km var13 = null;
        km var14 = null;
        int var15 = 0;
        km var17 = null;
        int var10Lifetime1;
        try {
          var17 = new km(0L, param1, je.field_G.toUpperCase());
          var17.field_lb = 1;
          this.field_Jb = new km(0L, param2);
          var8 = new km(0L, param3);
          var9 = new km(0L, param3, gd.field_q);
          var9.field_lb = 1;
          var10 = 50;
          var11 = 0;
          for (var12 = 0; dl.field_a.length > var12; var12++) {
            var13 = new km(0L, param3, lb.field_b[var12]);
            var14 = new km(0L, param3, dl.field_a[var12]);
            var15 = param3.field_C.a(dl.field_a[var12]);
            var13.a(20, 15, 65, (byte) -76, var10);
            if (var11 < var15) {
              var11 = var15;
            }
            var14.a(90, 15, 640, (byte) -79, var10);
            var8.a(0, var13);
            var8.a(0, var14);
            var10 += 30;
          }
          var17.a(0, 24, 90 + (var11 + 20), (byte) -69, 0);
          var10 += 15;
          this.a(100, var10 + var17.field_ub, var17.field_K, (byte) -87, 100);
          this.field_Jb.a(var17.field_K - 20, 15, 15, (byte) -93, 5);
          var8.a(0, -var17.field_ub + this.field_ub, this.field_K, (byte) -103, var17.field_ub);
          var9.a(0, 15, this.field_K, (byte) -56, 20);
          var8.field_vb = ne.a(var8.field_ub, 3, 2105376, (byte) 106, 8421504, 11579568);
          var17.a(0, this.field_Jb);
          var8.a(0, var9);
          this.a(0, var17);
          this.a(0, var8);
          var10Lifetime1 = -(this.field_ub >> 1) + 240;
          this.field_tb = 320 - (this.field_K >> 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("na.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final boolean a(boolean param0, boolean param1) {
        boolean stackIn_7_0 = false;
        boolean decompiledFrameRemainder0 = true;
        this.a(param0, (byte) 89);
        if ((oi.field_g == 0 ||
          this.field_nb != 0) && this.field_Jb.field_nb == 0) {
          stackIn_7_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    final static String a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_22_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          if (20 < var2_int) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param1.charAt(var4);
            if (65 <= var5 &&
              var5 <= 90) {
              var3[var4] = (char)(97 + (-65 + var5));
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          if (param0 == 51) {
            stackIn_24_0 = new String(var8);
            return stackIn_24_0;
          }
          stackIn_22_0 = (String) null;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("na.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_Eb = "This game is full.";
        field_Fb = new lc(7, 0, 1, 1);
        field_Gb = "Who can join";
    }
}

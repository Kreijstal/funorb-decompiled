/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends kh {
    static String[] field_t;
    private boolean field_n;
    static qb[] field_j;
    static int field_r;
    private int field_l;
    private int field_s;
    static String field_m;
    private dj field_i;
    private int field_o;
    static String field_k;
    private String field_q;
    private int field_p;
    private int field_h;

    final void a(String param0, int param1, int param2, byte param3, dj param4) {
        vd discarded$0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        String var8 = null;
        vd var9 = null;
        try {
          if (param0 == null) {
            this.field_f = null;
            return;
          }
          if (param4 == this.field_i &&
            this.field_n &&
            1 == this.field_h &&
            null != this.field_q &&
            this.field_q.equals(param0)) {
            return;
          }
          this.field_i = param4;
          this.field_n = true;
          if (param3 != -18) {
            var8 = (String) null;
            discarded$0 = this.a((dj) null, 47, 36, (String) null);
          }
          this.field_h = 1;
          var9 = this.a(param4, 0, param2, param0);
          var7 = param4.b(param0);
          var9.field_f[0] = -(var7 >> 1) + param1;
          var9.field_f[param0.length()] = param1 + (var7 >> 1);
          be.a(0, var9, param0, param4, (byte) 35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("re.S(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, dj param2, int param3, String param4) {
        vd var9 = null;
        vd var10 = null;
        if (param4 == null) {
          this.field_f = null;
          return;
        }
        if (param2 == this.field_i && this.field_n && 2 == this.field_h && null != this.field_q &&
          this.field_q.equals(param4)) {
          return;
        }
        try {
          this.field_n = true;
          this.field_i = param2;
          this.field_h = 2;
          this.field_q = param4;
          var9 = this.a(param2, 0, param3, param4);
          var10 = var9;
          var10.field_f[0] = -param2.b(param4) + param0;
          var10.field_f[param4.length()] = param0;
          be.a(0, var10, param4, param2, (byte) 35);
          int var7 = -84 / ((-47 - param1) / 49);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "re.N(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final vd a(dj param0, int param1, int param2, String param3) {
        vd var5 = null;
        RuntimeException var5_ref = null;
        vd var6 = null;
        vd stackIn_2_0 = null;
        vd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new vd(param2 - param0.field_C, param2 + param0.field_m, param3.length());
          var5 = var6;
          if (param1 != 0) {
            stackIn_2_0 = (vd) null;
            return stackIn_2_0;
          }
          this.field_f = new vd[]{var6};
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("re.P(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          java.applet.Applet var8 = null;
          String var9 = null;
          boolean stackIn_18_0 = false;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            if (cb.field_a) {
              return true;
            }
            try {
              var9 = "tuhstatbut";
              var3 = (String) (ei.a(param1, param0 + 171, "getcookies"));
              var4 = eh.a(false, ';', var3);
              if (param0 != -68) {
                var8 = (java.applet.Applet) null;
                re.a((byte) 30, (java.applet.Applet) null);
              }
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var9)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            stackIn_18_0 = (null != param1.getParameter("tuhstatbut"));
            return stackIn_18_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var2_ref;
            stackIn_21_1 = new StringBuilder().append("re.R(").append(param0).append(',');
            if (param1 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, dj param1, int param2, int param3, int param4, int param5, String param6, int param7) {
        vd stackIn_37_0;
        vd stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        vd stackIn_38_0 = null;
        vd stackIn_38_1 = null;
        int stackIn_38_4 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        vd var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param3 == 0) {
            param3 = param1.field_H;
          }
          if (param6 == null) {
            this.field_f = null;
            return;
          }
          if (this.field_i == param1 &&
            !this.field_n &&
            param4 == this.field_h &&
            param5 == this.field_s &&
            this.field_o == param3 &&
            param2 == this.field_l &&
            this.field_p == param7 &&
            this.field_q != null &&
            this.field_q.equals(param6)) {
            return;
          }
          this.field_p = param7;
          this.field_s = param5;
          this.field_h = param4;
          this.field_o = param3;
          this.field_i = param1;
          this.field_n = false;
          this.field_l = param2;
          this.field_q = param6;
          if (param0 <= 118) {
            return;
          }
          var16 = new String[param1.a(param6, param7) + 1];
          var17 = var16;
          var10 = Math.max(1, param1.a(param6, new int[]{param7}, var17));
          if (this.field_s == 3 &&
            1 == var10) {
            this.field_s = 1;
          }
          this.field_f = new vd[var10];
          if (this.field_s == 0) {
            var11 = param1.field_C;
          } else {
            if (this.field_s == 1) {
              var11 = (-(var10 * this.field_o) + this.field_l >> 1) + param1.field_C;
            } else {
              if (this.field_s == 2) {
                var11 = this.field_l - param1.field_m - var10 * this.field_o;
              } else {
                var12 = (-(var10 * this.field_o) + this.field_l) / (var10 + 1);
                if (0 > var12) {
                  var12 = 0;
                }
                var11 = param1.field_C + var12;
                this.field_o = this.field_o + var12;
              }
            }
          }
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_37_0 = null;
            stackIn_37_1 = null;
            stackIn_37_2 = -param1.field_C + var11;
            stackIn_37_3 = var11 + param1.field_m;
            if (var13 == null) {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = 0;
            } else {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = var13.length();
            }
            var14 = new vd(stackIn_37_2, stackIn_37_3, stackIn_38_4);
            var14.field_f[0] = 0;
            if (var13 != null) {
              var14.field_f[var13.length()] = param1.b(var13);
              if (param4 != 3) {
                stackIn_43_0 = 0;
              } else {
                stackIn_43_0 = this.a(var13, false, param7, param1.b(var13));
              }
              be.a(stackIn_43_0, var14, var13, param1, (byte) 35);
            }
            var11 = var11 + param3;
            this.field_f[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_48_0 = var9;
          stackIn_48_1 = new StringBuilder().append("re.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param7).append(')').toString());
        }
    }

    final void a(String param0, byte param1, dj param2, int param3, int param4) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        String var7 = null;
        vd var8 = null;
        vd var9 = null;
        try {
          if (param1 > -109) {
            var7 = (String) null;
            this.a((byte) 70, (dj) null, -111, -15, -72, 7, (String) null, -64);
          }
          if (param0 == null) {
            this.field_f = null;
            return;
          }
          if (this.field_i == param2 &&
            this.field_n &&
            0 == this.field_h &&
            null != this.field_q &&
            this.field_q.equals(param0)) {
            return;
          }
          this.field_n = true;
          this.field_q = param0;
          this.field_h = 0;
          this.field_i = param2;
          var8 = this.a(param2, 0, param3, param0);
          var9 = var8;
          var8.field_f[0] = param4;
          var9.field_f[param0.length()] = param2.b(param0) + param4;
          be.a(0, var9, param0, param2, (byte) 35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("re.M(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_t = null;
        field_k = null;
        field_j = null;
        if (param0 != 0) {
          return;
        }
        field_m = null;
    }

    public re() {
    }

    static {
        field_m = "Well done for mastering Fire Ball. Now you will practise with another basic spell.";
        field_k = "You have 1 unread message!";
        field_t = new String[]{"Showing by rating", "Showing by win percentage"};
        field_r = 0;
    }
}

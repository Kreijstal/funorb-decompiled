/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qv implements gj, ke {
    int field_q;
    int field_c;
    private int field_j;
    static String field_g;
    int field_h;
    int field_p;
    static boolean field_f;
    int field_m;
    private boolean field_k;
    int field_e;
    static hd field_n;
    int field_o;
    int field_l;
    int field_i;
    static String[] field_d;
    hu field_a;
    int field_b;

    private final void a(int param0, fd param1, int param2, int param3) {
        try {
          if (param2 > -59) {
            fd var6 = (fd) null;
            this.a((fd) null, -115);
          }
          this.a(this.field_b, this.field_j, param3, 118, param1, 0, 0, param0);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "qv.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public void a(int param0, boolean param1, int param2, fd param3, int param4) {
        if (this.field_a == null) {
          return;
        }
        try {
          this.a(param2, param3, -88, param4);
          int var6_int = 66 / ((59 - param0) / 53);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "qv.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(qv param0, byte param1) {
        param0.field_a = this.field_a;
        param0.field_b = this.field_b;
        param0.field_i = this.field_i;
        param0.field_j = this.field_j;
        param0.field_m = this.field_m;
        param0.field_l = this.field_l;
        param0.field_p = this.field_p;
        if (param1 > -79) {
          return;
        }
        try {
          param0.field_o = this.field_o;
          param0.field_e = this.field_e;
          param0.field_h = this.field_h;
          param0.field_q = this.field_q;
          param0.field_k = this.field_k;
          param0.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "qv.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void d(byte param0, fd param1) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        fd var8 = null;
        int var6Lifetime1;
        var7 = Kickabout.field_G;
        try {
          if (param0 > -60) {
            var8 = (fd) null;
            this.b(-77, (fd) null);
          }
          if (null == param1.field_h) {
            param1.field_h = (iq) ((Object) new st());
          }
          var3_int = this.a((byte) -124, param1);
          var4 = this.c((byte) -110, param1);
          var6 = this.field_m;
          if (var6 != 0) {
            if (var6 != 2) {
              if (3 != var6 &&
                1 != var6) {
              }
              var5 = (-this.field_a.field_G + var4 - this.field_a.field_p >> 1) + this.field_a.field_G;
            } else {
              var5 = -this.field_a.field_p + var4;
            }
          } else {
            var5 = this.field_a.field_G;
          }
          var6Lifetime1 = this.field_e;
          if (var6Lifetime1 != 0 &&
            3 != var6Lifetime1) {
            if (var6Lifetime1 == 1) {
              if (!(param1.field_h instanceof st)) {
                return;
              }
              ((st) (param1.field_h)).a(1, var3_int >> 1, this.field_a, this.b((byte) -71, param1), var5);
              return;
            }
            if (var6Lifetime1 != 2) {
              return;
            }
            if (!(param1.field_h instanceof st)) {
              return;
            }
            ((st) (param1.field_h)).a((byte) 123, this.b((byte) -112, param1), var5, var3_int, this.field_a);
            return;
          }
          if (param1.field_h instanceof st) {
            ((st) (param1.field_h)).a(0, this.b((byte) -85, param1), (byte) 80, this.field_a, var5);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("qv.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    qv(hu param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final int a(int param0, fd param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(5035, param1);
          if (param5 != 0) {
            field_n = (hd) null;
          }
          stackIn_3_0 = param1.field_h.a(param0 - this.a(true, param1, param4), param2 - this.a(param1, param3, -1), 29889);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("qv.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, fd param4) {
        int var7 = 0;
        qj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        iq var13 = null;
        iq var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_3;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param4.b(67)) {
            var13 = this.a(5035, param4);
            var14 = var13;
            var7 = var14.a(0, param0);
            var8 = var13.field_c[var7];
            var9 = var14.b(0, param0);
            var10 = this.b(-31112, param4, param1, var9);
            var11 = this.a(true, param4, param2) + Math.max(0, var8.field_g);
            stackIn_3_0 = this.a(true, param4, param2);
            stackIn_3_1 = this.c((byte) -120, param4);
            stackIn_3_2 = var8.field_d;
            if (1 + var7 >= var14.field_c.length) {
              stackIn_4_3 = var8.field_d;
            } else {
              stackIn_4_3 = var13.field_c[var7 + 1].field_g;
            }
            var12 = stackIn_3_0 + Math.min(stackIn_3_1, Math.min(stackIn_3_2, stackIn_4_3));
            pt.a(param1 - (-param4.field_t - param4.field_n), -22914, param1 + param4.field_t, param4.field_i + (param2 + param4.field_g), param2 + param4.field_g);
            nb.field_i.a(this.field_i, var12, var10, var11, var10, param3);
            ta.e(127);
          }
          if (!param3) {
            field_g = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("qv.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final int a(byte param0) {
        if (param0 != -76) {
          this.field_o = -10;
        }
        return this.field_a.field_p + this.field_a.field_G;
    }

    private final void a(int param0, int param1, int param2, int param3, fd param4, int param5, int param6, int param7) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = Kickabout.field_G;
        try {
          pt.a(param2 + param4.field_t + param4.field_n, -22914, param2 + param4.field_t, param4.field_g + (param7 + param4.field_i), param4.field_g + param7);
          var9_int = this.a((byte) -124, param4);
          if (param3 <= 71) {
            this.field_o = 4;
          }
          boolean decompiledFrameRemainder0 = true;
          var10 = this.c((byte) -123, param4);
          if (this.field_k) {
            this.field_a.a(this.b((byte) -64, param4), this.b(-31112, param4, param2, param6), this.a(param7, (byte) 90, param4, param5), var9_int, var10, param0, param1, this.field_e, this.field_m, this.field_p);
          } else {
            var12 = this.field_m;
            if (var12 != 0) {
              if (var12 != 2) {
                if (var12 != 3 &&
                  1 == var12) {
                }
                var11 = this.field_a.field_G + (-this.field_a.field_G + var10 - this.field_a.field_p >> 1);
              } else {
                var11 = -this.field_a.field_p + var10;
              }
            } else {
              var11 = this.field_a.field_G;
            }
            var12Lifetime1 = this.field_e;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.field_a.d(this.b((byte) -123, param4), this.b(-31112, param4, param2, param6) + (var9_int >> 1), var11 + this.a(param7, (byte) 90, param4, param5), param0, param1);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_a.c(this.b((byte) -113, param4), var9_int + this.b(-31112, param4, param2, param6), this.a(param7, (byte) 90, param4, param5) + var11, param0, param1);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_a.a(this.b((byte) -103, param4), this.b(-31112, param4, param2, param6), this.a(param7, (byte) 90, param4, param5) + var11, param0, param1);
            }
          }
          ta.e(126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_29_0 = var9;
          stackIn_29_1 = new StringBuilder().append("qv.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final int b(int param0, fd param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -31112) {
            stackIn_4_0 = param3 + (param1.field_s + param1.field_t) + param2 + this.field_h;
            return stackIn_4_0;
          }
          stackIn_2_0 = -43;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("qv.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int a(fd param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -1) {
            this.field_m = 106;
          }
          stackIn_3_0 = this.b(-31112, param0, param1, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("qv.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final int a(boolean param0, fd param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_4_0 = this.a(param2, (byte) 90, param1, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -103;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("qv.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_d = null;
        if (!param0) {
          bu var2 = (bu) null;
          qv.a((iw) null, -40, 96, (bu) null);
        }
        field_g = null;
    }

    public final int a(byte param0, fd param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -124) {
            stackIn_4_0 = -this.field_l - this.field_h + param1.field_n;
            return stackIn_4_0;
          }
          stackIn_2_0 = 104;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qv.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int b(int param0, fd param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3) {
            field_f = true;
          }
          this.a(5035, param1);
          stackIn_3_0 = param1.field_h.a(-1761) + this.field_q + this.field_o;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qv.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(fd param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(5035, param0);
          var3_int = -96 % ((-65 - param1) / 56);
          stackIn_1_0 = param0.field_h.a((byte) -25) + this.field_h + this.field_l;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("qv.J(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        fd var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 90) {
            var6 = (fd) null;
            this.a((fd) null, 89);
          }
          stackIn_3_0 = param2.field_o + (this.field_q + param2.field_g + param0) + param3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("qv.JA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(iw param0, int param1, int param2, bu param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_39_0 = null;
          StringBuilder stackIn_39_1 = null;
          String stackIn_40_2 = null;
          StringBuilder stackIn_42_1 = null;
          String stackIn_43_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          String var7 = null;
          String var8 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          si var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var13Lifetime1;
          var14 = Kickabout.field_G;
          try {
            var18 = new si();
            var18.field_n = param0.h((byte) -118);
            var18.field_p = param0.k(4);
            var18.field_e = new wu[var18.field_n];
            var18.field_h = new int[var18.field_n];
            var18.field_l = new byte[var18.field_n][][];
            var18.field_o = new int[var18.field_n];
            var18.field_m = new int[var18.field_n];
            var18.field_f = new wu[var18.field_n];
            for (var5 = 0; var18.field_n > var5; var5++) {
              try {
                var6_int = param0.h((byte) -108);
                if (var6_int != 0 &&
                  1 != var6_int &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param0.a(125);
                    var21 = param0.a(-105);
                    var9 = param0.h((byte) -112);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param0.a(param2 + 102);
                    }
                    var22 = new byte[var9][];
                    var19 = var22;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var9 > var12_int; var12_int++) {
                        var13 = param0.k(4);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param0.a(var22[var12_int], 0, (byte) -6, var13);
                      }
                    }
                    var18.field_h[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = il.a(param2 - 106, var10[var17]);
                      var17++;
                    }
                    var18.field_e[var5] = param3.a(-30971, var12, il.a(-113, var20), var21);
                    var18.field_l[var5] = var22;
                  }
                } else {
                  var16 = param0.a(84);
                  var7 = var16;
                  var15 = param0.a(59);
                  var8 = var15;
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param0.k(4);
                  }
                  var18.field_h[var5] = var6_int;
                  var18.field_o[var5] = var9;
                  var18.field_f[var5] = param3.a(var15, il.a(98, var16), 0);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_m[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_m[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_m[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_m[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_m[var5] = -5;
              }
            }
            nv.field_N.a(var18, 3);
            if (param2 != -1) {
              field_g = (String) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_39_0 = var4;
            stackIn_39_1 = new StringBuilder().append("qv.HA(");
            if (param0 == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_43_2 = "null";
            } else {
              stackIn_43_2 = "{...}";
            }
            throw nb.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    String b(byte param0, fd param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -38) {
            stackIn_4_0 = param1.field_q;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qv.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final int c(byte param0, fd param1) {
        RuntimeException var3 = null;
        fd var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -109) {
            var4 = (fd) null;
            this.b(-71, (fd) null);
          }
          stackIn_3_0 = -this.field_o + (param1.field_i - this.field_q);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qv.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        qj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        iq var17 = null;
        iq var18 = null;
        var16 = Kickabout.field_G;
        try {
          if (param2 == param1) {
            return;
          }
          if (param4 < 86) {
            return;
          }
          if (param3.b(125)) {
            var17 = this.a(5035, param3);
            var18 = var17;
            if (param1 > param2) {
              var8 = param2;
              var9 = param1;
            } else {
              var8 = param1;
              var9 = param2;
            }
            var10 = var18.a(0, var8);
            var11 = var18.a(0, var9);
            pt.a(param3.field_n + (param3.field_t + param0), -22914, param3.field_t + param0, param3.field_i + param5 + param3.field_g, param3.field_g + param5);
            for (var12 = var10; var11 >= var12; var12++) {
              var13 = var17.field_c[var12];
              if (var12 != var10) {
                stackIn_14_0 = var13.field_b[0];
              } else {
                stackIn_14_0 = var18.b(0, var8);
              }
              var14 = stackIn_14_0;
              if (var11 == var12) {
                stackIn_19_0 = var18.b(0, var9);
              } else {
                if (var13 != null) {
                  stackIn_19_0 = var13.field_b[var13.field_b.length - 1];
                } else {
                  stackIn_19_0 = 0;
                }
              }
              var15 = stackIn_19_0;
              nb.field_i.a(this.b(-31112, param3, param0, var14), var13.field_d, this.field_c, var15 - var14, var13.field_g + (this.field_q + param5) + (param3.field_g + param3.field_o), this.field_c >>> 24, (byte) -2);
            }
            ta.e(125);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("qv.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final iq a(int param0, fd param1) {
        RuntimeException var3 = null;
        iq stackIn_5_0 = null;
        iq stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_h == null) {
            param1.field_h = (iq) ((Object) new st());
          }
          if (param0 != 5035) {
            stackIn_5_0 = (iq) null;
            return stackIn_5_0;
          }
          if (this.field_k) {
            ((st) (param1.field_h)).a(this.a((byte) -124, param1), this.field_a, this.field_m, this.c((byte) -120, param1), this.field_e, (byte) 102, this.b((byte) -97, param1), this.field_p);
          } else {
            this.d((byte) -66, param1);
          }
          stackIn_10_0 = param1.field_h;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("qv.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    protected qv() {
    }

    qv(hu param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_i = param10;
          this.field_b = param5;
          this.field_h = param1;
          this.field_q = param3;
          this.field_k = param12 ? true : false;
          this.field_m = param8;
          this.field_j = param6;
          this.field_l = param2;
          this.field_o = param4;
          this.field_a = param0;
          this.field_e = param7;
          this.field_p = param9;
          this.field_c = param11;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "qv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_g = "Hide private chat and appear offline to friends";
        field_d = new String[]{"Graphics: Low Quality", "Graphics: High Quality"};
    }
}

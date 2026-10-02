/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vf extends hk {
    static byte[][] field_E;
    static dm field_L;
    static qc field_I;
    private fb field_G;
    private String[] field_J;
    static dm[] field_H;
    static boolean field_K;
    private tf field_F;

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -this.field_v + param2;
        int var6 = param0 - this.field_m;
        fb var7 = this.a((byte) -114, var6, var5);
        if (var7 != null && null != this.field_u) {
            ((pe) ((Object) this.field_u)).a((vf) (this), var7.field_g, param1 + 28924, param3);
        }
    }

    final static df a(boolean param0, String param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        df stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          var6 = null;
          if (param3) {
            field_I = (qc) null;
          }
          if (param2.indexOf('@') != -1) {
            var6 = param2;
          } else {
            var7 = (CharSequence) ((Object) param2);
            var4_long = rh.a(var7, -48);
          }
          stackIn_6_0 = wd.a(true, var4_long, (String) (var6), param1, param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = (RuntimeException) (var4);

          stackIn_9_1 = new StringBuilder().append("vf.F(").append(param0).append(',');

          if (param1 == null) {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "null";
          } else {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "{...}";
          }


          stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

          if (param2 == null) {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
            stackIn_13_2 = "null";
          } else {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
        return stackIn_6_0;
    }

    public static void h(int param0) {
        if (param0 != 0) {
            field_K = false;
        }
        field_L = null;
        field_I = null;
        field_H = null;
        field_E = (byte[][]) null;
    }

    vf(String param0, dh param1) {
        super(param0, (bb) null);
        this.field_G = null;
        try {
            this.field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    String c(byte param0) {
        if (null == this.field_G) {
            return null;
        }
        if (this.field_J == null) {
            return null;
        }
        if (this.field_J.length <= this.field_G.field_g) {
            return null;
        }
        if (param0 != 69) {
            return (String) null;
        }
        return this.field_J[this.field_G.field_g];
    }

    void a(boolean param0, int param1, el param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          this.field_G = null;
          if (this.field_l) {
            var5_int = -this.field_v + qa.field_a + -param3;
            var6 = -this.field_m + -param1 + ue.field_e;
            this.field_G = this.a((byte) 72, var6, var5_int);
          }
          if (param0) {
            field_L = (dm) null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var5);

          stackIn_8_1 = new StringBuilder().append("vf.H(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
            stackIn_9_2 = "null";
          } else {
            stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        int var5 = 46 / ((1 - param2) / 43);
        super.a(param0, param1, (byte) -42, param3);
        if (param3 != 0) {
            return;
        }
        cc var6 = (cc) ((Object) this.field_q);
        fb var7 = this.field_G;
        if (var7 == null) {
        } else {
            var8 = var6.a(param0, (el) (this), (byte) 46);
            var9 = var6.a(param1, -2, (el) (this));
            do {
                bf.a(-2 + var9 - -var7.field_i, 2 + var7.field_f, 14164, 2 + var7.field_n, var7.field_k + (var8 - 2));
                var7 = var7.field_h;
            } while (var7 != null);
        }
    }

    final static Boolean a(byte param0) {
        Boolean var1 = fi.field_b;
        int var2 = -97 / ((param0 - 44) / 60);
        fi.field_b = null;
        return var1;
    }

    final static void f(int param0) {
        int var1_int = 0;
        ja var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            if (param0 == 0) {
              for (var1_int = 0; 1000 > var1_int; var1_int++) {
                var2 = new ja(0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, var1_int);
                ra.field_a.a(-117, var2);
                tl.field_g[var1_int] = var2;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "vf.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean a(byte param0, el param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -30) {
            this.a(-15, -109, 48, 91);
          }
          stackIn_3_0 = 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var3);

          stackIn_6_1 = new StringBuilder().append("vf.UA(").append(param0).append(',');

          if (param1 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(')').toString());
        }
        return stackIn_3_0 != 0;
    }

    final static String i(int param0) {
        if (param0 != 1000) {
            String var2 = (String) null;
            vf.a(false, (String) null, (String) null, true);
        }
        return eh.field_d.e((byte) 101);
    }

    final void g(int param0) {
        int var12 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        int var3;
        cc var4;
        dk var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        Object var11;
        lk var13;
        int var14;
        int var15;
        fb var16;
        int var17;
        var17 = Geoblox.field_C;
        this.field_F = new tf();
        var2 = 83 / ((param0 - 48) / 55);
        var3 = 0;
        var4 = (cc) ((Object) this.field_q);
        var5 = var4.a((byte) 116, (el) (this));
        L0: while (true) {
          var6 = this.field_s.indexOf("<hotspot=", var3);
          if (-1 == var6) {
            return;
          } else {
            var8 = this.field_s.indexOf(">", var6);
            var7 = this.field_s.substring(var6 - -9, var8);
            var8 = Integer.parseInt(var7);
            var3 = this.field_s.indexOf("</hotspot>", var6);
            var9 = var5.a((byte) 24, var6);
            var10 = var5.a((byte) 24, var3);
            var11 = null;
            for (var12 = var9; var10 >= var12; var12++) {
              var13 = var5.field_a[var12];
              if (var9 == var12) {
                stackIn_7_0 = var5.a(var6, 124);
              } else {
                stackIn_7_0 = var13.field_c[0];
              }
              var14 = stackIn_7_0;
              if (var12 == var10) {
                stackIn_12_0 = var5.a(var3, 116);
              } else {
                if (var13 == null) {
                  stackIn_12_0 = 0;
                } else {
                  stackIn_12_0 = var13.field_c[-1 + var13.field_c.length];
                }
              }
              var15 = stackIn_12_0;
              var16 = new fb(var8, var14, var13.field_d, var15 - var14, Math.max(var4.a(1), -var13.field_d + var13.field_a));
              if (var11 != null) {
                ((fb) (var11)).field_h = var16;
              }
              this.field_F.a(-44, var16);
              var11 = var16;
            }
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, String param2) {
        int var6 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        String[] var5 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.field_C;
        try {
          L1: {
            var4_int = 122 % ((41 - param1) / 55);
            if (null != this.field_J) {
              if (param0 < this.field_J.length) {
                break L1;
              }
            }
            L3: {
              var5 = new String[param0 + 1];
              if (null != this.field_J) {
                for (var6 = 0; var6 < this.field_J.length; var6++) {
                  var5[var6] = this.field_J[var6];
                }
                break L3;
              }
            }
            this.field_J = var5;
          }
          this.field_J[param0] = param2;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = (RuntimeException) (runtimeException);

          stackIn_14_1 = new StringBuilder().append("vf.M(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
            stackIn_15_2 = "null";
          } else {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            field_I = (qc) null;
        }
        this.a(((cc) ((Object) this.field_q)).a(14, (el) (this)), param3, (byte) -40, param2, param0);
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 > -6) {
            field_E = (byte[][]) null;
        }
        super.a(param0, param1, (byte) -123, param3, param4);
        this.g(-96);
    }

    private final fb a(byte param0, int param1, int param2) {
        fb var4;
        int var5;
        fb var6;
        int var7;
        var7 = Geoblox.field_C;
        var5 = 3 / ((param0 - -46) / 58);
        var4 = (fb) ((Object) this.field_F.g(0));
        L0: while (var4 != null) {
          var6 = var4;
          L1: while (var6 != null) {
            if (var6.field_k <= param2) {
              if (param1 >= var6.field_i) {
                if (param2 < var6.field_f + var6.field_k) {
                  if (param1 <= var6.field_i + var6.field_n) {
                    return var4;
                  }
                }
              }
            }
            var6 = var6.field_h;
          }
          var4 = (fb) ((Object) this.field_F.d(1));
        }
        return null;
    }

    static {
        field_K = false;
        field_L = new dm((int)(0.5 + Math.sqrt(2592.0)) - -2, 2 + (int)(Math.sqrt(2592.0) + 0.5));
    }
}

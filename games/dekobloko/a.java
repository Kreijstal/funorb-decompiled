/*
 * Decompiled by CFR-JS 0.4.0.
 */
class a implements gl, nl {
    int field_i;
    int field_q;
    static int[] field_r;
    mm field_z;
    int field_m;
    int field_o;
    static String field_e;
    static lm field_t;
    static int[] field_u;
    private int field_a;
    int field_b;
    int field_c;
    int field_s;
    static int[] field_j;
    int field_f;
    private boolean field_w;
    int field_y;
    static int field_g;
    int field_v;
    private static long[] field_d;
    static int field_k;
    static String field_x;
    static ck[] field_n;
    static String field_l;
    static ck field_p;
    static int field_h;

    private final int c(ce param0, byte param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        ce var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -124) {
            var4 = (ce) null;
            discarded$1 = this.b((ce) null, 125, -17, 115);
          }
          stackIn_3_0 = param0.field_y - (this.field_m + this.field_y);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("a.AA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(ce param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param0, (byte) 83);
          var3_int = -78 / ((-85 - param1) / 36);
          stackIn_1_0 = param0.field_n.b(-1) + this.field_m + this.field_y;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("a.GA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public final cf a(ce param0, byte param1) {
        RuntimeException var3 = null;
        ce var4 = null;
        cf stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param0.field_n) {
            param0.field_n = (cf) ((Object) new ea());
          }
          if (this.field_w) {
            ((ea) (param0.field_n)).a(this.b(param0, (byte) 121), this.field_o, this.field_z, this.a(false, param0), this.c(param0, (byte) -128), this.field_f, 86, this.field_b);
          } else {
            this.c(param0, 18580);
          }
          if (param1 < 38) {
            var4 = (ce) null;
            this.a((byte) -75, (ce) null, 115);
          }
          stackIn_9_0 = param0.field_n;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("a.T(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    a(mm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int b(ce param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= 72) {
            stackIn_4_0 = param1 + (this.field_s + (param0.field_u + param3)) + param0.field_x;
            return stackIn_4_0;
          }
          stackIn_2_0 = -124;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("a.N(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(ce param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        nf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cf var13 = null;
        cf var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param0.a(true)) {
            var13 = this.a(param0, (byte) 53);
            var14 = var13;
            var7 = var14.a(false, param1);
            var8 = var13.field_a[var7];
            var9 = var14.a((byte) -94, param1);
            var10 = this.b(param0, var9, param2 + 110, param3);
            var11 = this.a(param4, 0, param0) + Math.max(0, var8.field_c);
            stackIn_4_0 = this.a(param4, 0, param0);
            stackIn_4_1 = this.c(param0, (byte) -128);
            stackIn_4_2 = var8.field_i;
            if (var14.field_a.length > 1 + var7) {
              stackIn_5_3 = var13.field_a[var7 + 1].field_c;
            } else {
              stackIn_5_3 = var8.field_i;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            gg.a(param4 + param0.field_D, 20763, param0.field_u + (param3 + param0.field_t), param0.field_u + param3, param0.field_D + param4 + param0.field_y);
            bf.field_x.a(var10, var11, var10, this.field_v, (byte) 64, var12);
            mk.a((byte) -5);
          }
          if (param2 != 1) {
            this.field_c = -31;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("a.BA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        int discarded$0 = 0;
        if (param3 >= -60) {
          ce var7 = (ce) null;
          discarded$0 = this.b((ce) null, 118, -123, 71);
        }
        if (null == this.field_z) {
          return;
        }
        try {
          this.a(param2, param4, (byte) -102, param1);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "a.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(ce param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param0, (byte) 60);
          if (param1 != 0) {
            this.field_z = (mm) null;
          }
          stackIn_3_0 = param0.field_n.a(false) + this.field_s + this.field_i;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("a.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        pf var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        wb var3 = ma.a(param0, param1, (byte) 99);
        pf var4Lifetime1;
        if (var3 != null) {
          w.field_H.a(false, 29072);
          var4 = w.field_H;
          var5_ref_String = fl.field_e;
          var4.field_h.a(var5_ref_String, 5, 68);
          var4Lifetime1 = w.field_H;
          var5 = he.field_S;
          var6 = nf.field_h;
          var4Lifetime1.field_h.b(var6, var5, 63, 0, 0);
        }
        he.a(param2, param1, param0);
    }

    final static void a(String param0, boolean param1, java.applet.Applet param2) {
        try {
          String var4 = null;
          String var5 = null;
          String var6 = null;
          String var7 = null;
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            rb.field_l = param0;
            try {
              var6 = param2.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              if (param1) {
                return;
              }
              var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (param0.length() == 0) {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                var5Lifetime6 = var7 + "; Expires=" + uf.a((byte) 60, ik.a(4) + 94608000000L) + "; Max-Age=" + 94608000L;
              }
              nc.a((byte) -51, param2, "document.cookie=\"" + var5Lifetime6 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            me.a((byte) 127, param2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref;
            stackIn_13_1 = new StringBuilder().append("a.EA(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final int a(boolean param0, ce param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.a((byte) 94);
          }
          stackIn_3_0 = param1.field_t - this.field_s - this.field_i;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("a.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(byte param0, ce param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        ce var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 6) {
            var5 = (ce) null;
            discarded$1 = this.c((ce) null, (byte) -126);
          }
          stackIn_3_0 = this.b(param1, 0, 97, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("a.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, ce param5) {
        int var12 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nf var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        cf var17 = null;
        cf var18 = null;
        var16 = client.field_A ? 1 : 0;
        try {
          if (param1 == param0) {
            return;
          }
          if (param5.a(true)) {
            var17 = this.a(param5, (byte) 100);
            var18 = var17;
            if (param0 < param1) {
              var9 = param1;
              var8 = param0;
            } else {
              var9 = param0;
              var8 = param1;
            }
            var10 = var18.a(false, var8);
            var11 = var18.a(false, var9);
            gg.a(param2 + param5.field_D, 20763, param5.field_t + param3 + param5.field_u, param5.field_u + param3, param2 + (param5.field_D + param5.field_y));
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.field_a[var12];
              if (var12 == var10) {
                stackIn_13_0 = var18.a((byte) -94, var8);
              } else {
                stackIn_13_0 = var13.field_a[0];
              }
              var14 = stackIn_13_0;
              if (var12 != var11) {
                if (var13 != null) {
                  stackIn_18_0 = var13.field_a[-1 + var13.field_a.length];
                } else {
                  stackIn_18_0 = 0;
                }
              } else {
                stackIn_18_0 = var18.a((byte) -94, var9);
              }
              var15 = stackIn_18_0;
              bf.field_x.a((byte) -115, var13.field_c + param5.field_F + (param2 - (-param5.field_D - this.field_m)), this.field_c >>> 24, -var14 + var15, var13.field_i, this.field_c, this.b(param5, var14, 96, param3));
            }
            mk.a((byte) -5);
          }
          if (param4 > -89) {
            this.field_i = -114;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("a.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final int a(ce param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 20881) {
            this.field_v = 65;
          }
          stackIn_3_0 = param2 + (this.field_m + (param0.field_D + param3)) + param0.field_F;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("a.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void c(ce param0, int param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        a var8 = null;
        int var6Lifetime1;
        var7 = client.field_A ? 1 : 0;
        try {
          if (null == param0.field_n) {
            param0.field_n = (cf) ((Object) new ea());
          }
          var3_int = this.a(false, param0);
          var4 = this.c(param0, (byte) -127);
          if (param1 != 18580) {
            var8 = (a) null;
            this.a(-13, (a) null);
          }
          var6 = this.field_o;
          if (var6 != 0) {
            if (var6 == 2) {
              var5 = -this.field_z.field_K + var4;
            } else {
              if (var6 != 3 &&
                var6 != 1) {
              }
              var5 = (-this.field_z.field_K + var4 - this.field_z.field_R >> 1) + this.field_z.field_R;
            }
          } else {
            var5 = this.field_z.field_R;
          }
          var6Lifetime1 = this.field_f;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 == 1) {
              if (!(param0.field_n instanceof ea)) {
                return;
              }
              ((ea) (param0.field_n)).a(var5, var3_int >> 1, this.b(param0, (byte) 116), (byte) 8, this.field_z);
              return;
            }
            if (2 != var6Lifetime1) {
              return;
            }
            if (!(param0.field_n instanceof ea)) {
              return;
            }
            ((ea) (param0.field_n)).a(param1 ^ 18580, this.field_z, var3_int, var5, this.b(param0, (byte) 122));
            return;
          }
          if (param0.field_n instanceof ea) {
            ((ea) (param0.field_n)).a(0, this.field_z, this.b(param0, (byte) 127), var5, 25);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("a.Q(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    String b(ce param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -9 % ((param1 - 59) / 53);
          stackIn_1_0 = param0.field_E;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("a.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, ce param4, boolean param5, int param6, int param7) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = client.field_A ? 1 : 0;
        try {
          gg.a(param4.field_D + param7, 20763, param4.field_t + (param4.field_u + param3), param3 + param4.field_u, param7 + param4.field_D + param4.field_y);
          if (!param5) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var9_int = this.a(false, param4);
          var10 = this.c(param4, (byte) -125);
          if (this.field_w) {
            this.field_z.a(this.b(param4, (byte) -36), this.b(param4, param0, 74, param3), this.a(param4, 20881, param6, param7), var9_int, var10, param1, param2, this.field_f, this.field_o, this.field_b);
          } else {
            var12 = this.field_o;
            if (var12 == 0) {
              var11 = this.field_z.field_R;
            } else {
              if (2 != var12) {
                if (var12 != 3 &&
                  var12 != 1) {
                }
                var11 = (-this.field_z.field_R + var10 - this.field_z.field_K >> 1) + this.field_z.field_R;
              } else {
                var11 = -this.field_z.field_K + var10;
              }
            }
            var12Lifetime1 = this.field_f;
            if (0 != var12Lifetime1 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.field_z.b(this.b(param4, (byte) -67), this.b(param4, param0, 122, param3) + (var9_int >> 1), var11 + this.a(param4, 20881, param6, param7), param1, param2);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_z.c(this.b(param4, (byte) 123), var9_int + this.b(param4, param0, 78, param3), this.a(param4, 20881, param6, param7) + var11, param1, param2);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_z.a(this.b(param4, (byte) -50), this.b(param4, param0, 81, param3), var11 + this.a(param4, 20881, param6, param7), param1, param2);
            }
          }
          mk.a((byte) -5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_27_0 = var9;
          stackIn_27_1 = new StringBuilder().append("a.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          java.applet.Applet var9 = null;
          String var10 = null;
          String stackIn_8_0 = null;
          String stackIn_14_0 = null;
          String stackIn_16_0 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = client.field_A ? 1 : 0;
          try {
            try {
              if (param1 <= 110) {
                var9 = (java.applet.Applet) null;
                a.a((String) null, false, (java.applet.Applet) null);
              }
              var10 = param0.getParameter("cookieprefix");
              var3 = var10 + "settings";
              var4 = (String) (nc.a(true, "getcookies", param0));
              var5 = ji.a(';', (byte) 66, var4);
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_8_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_8_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (null == rb.field_l) {
              stackIn_16_0 = param0.getParameter("settings");
              return stackIn_16_0;
            }
            stackIn_14_0 = rb.field_l;
            return stackIn_14_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("a.K(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        field_e = null;
        field_l = null;
        field_x = null;
        field_n = null;
        field_d = null;
        field_u = null;
        field_r = null;
        field_j = null;
        field_t = null;
        field_p = null;
    }

    public final int a(byte param0) {
        if (param0 > -4) {
          return -27;
        }
        return this.field_z.field_K + this.field_z.field_R;
    }

    private final void a(int param0, ce param1, byte param2, int param3) {
        try {
          if (param2 >= -1) {
            ce var6 = (ce) null;
            this.c((ce) null, 109);
          }
          this.a(0, this.field_q, this.field_a, param3, param1, true, 0, param0);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "a.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final int a(int param0, int param1, ce param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -257) {
            stackIn_2_0 = -101;
            return stackIn_2_0;
          }
          this.a(param2, (byte) 46);
          stackIn_4_0 = param2.field_n.a(param5 - this.a((byte) 81, param2, param0), param4 - this.a(param3, 0, param2), param1 ^ 32172);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("a.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static pi b(int param0) {
        pi var1 = new pi(ed.field_f, i.field_d, sg.field_d[0], fh.field_a[0], tm.field_a[0], hc.field_c[0], tc.field_Nb[param0], mb.field_d);
        oa.a(127);
        return var1;
    }

    protected a() {
    }

    final static void a(int param0, int param1, ud param2, int param3, int param4) {
        int var5_int = 0;
        try {
          var5_int = (int)(0.5 + (double)(param4 * param2.field_p) * Math.pow(2.0, 0.0008333333333333334 * (double)param0) / (double)en.field_o);
          dg.field_c.a(param2, var5_int, pb.field_d * param1, param3 << 6);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "a.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    a(mm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_m = param3;
          this.field_a = param6;
          this.field_b = param9;
          this.field_i = param2;
          this.field_q = param5;
          this.field_f = param7;
          this.field_y = param4;
          this.field_v = param10;
          this.field_s = param1;
          this.field_z = param0;
          this.field_o = param8;
          this.field_c = param11;
          this.field_w = param12 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "a.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    final void a(int param0, a param1) {
        try {
          param1.field_i = this.field_i;
          param1.field_a = this.field_a;
          param1.field_m = this.field_m;
          param1.field_q = this.field_q;
          param1.field_c = this.field_c;
          if (param0 != -12253) {
            this.field_s = -80;
          }
          param1.field_s = this.field_s;
          param1.field_b = this.field_b;
          param1.field_o = this.field_o;
          param1.field_y = this.field_y;
          param1.field_f = this.field_f;
          param1.field_z = this.field_z;
          param1.field_w = this.field_w;
          param1.field_v = this.field_v;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "a.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(int param0, int param1, ce param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        ce var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var5 = (ce) null;
            discarded$1 = this.c((ce) null, (byte) 33);
          }
          stackIn_3_0 = this.a(param2, 20881, 0, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("a.HA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        int var1 = 0;
        int var3 = 0;
        int var0_int;
        int var2;
        long var0;
        int var2Lifetime1;
        field_e = "<%0><br>IS OUT!";
        field_r = new int[1024];
        field_g = 128;
        field_j = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0_int = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((1 & var0_int) == 1) {
              var0_int = -306674912 ^ var0_int >>> 1;
            } else {
              var0_int = var0_int >>> 1;
            }
          }
          field_j[var1] = var0_int;
        }
        field_d = new long[256];
        field_x = "Theme";
        field_l = "Invite";
        for (var2Lifetime1 = 0; 256 > var2Lifetime1; var2Lifetime1++) {
          var0 = (long)var2Lifetime1;
          for (var3 = 0; var3 < 8; var3++) {
            if ((var0 & 1L) != 1L) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            }
          }
          field_d[var2Lifetime1] = var0;
        }
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
class aj implements ol, gm {
    int field_f;
    static String field_h;
    int field_t;
    static String field_q;
    int field_p;
    int field_n;
    int field_r;
    static String field_l;
    private boolean field_s;
    e field_i;
    int field_k;
    static String field_e;
    static p field_m;
    int field_d;
    int field_j;
    private int field_b;
    static boolean field_a;
    int field_o;
    static int field_g;
    int field_c;

    public final int b(int param0, fi param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        fi var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -587719039) {
            var5 = (fi) null;
            discarded$1 = this.a(23, -29, (byte) 22, (fi) null);
          }
          stackIn_3_0 = this.a((byte) -92, param1, param2, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("aj.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(byte param0, int param1, int param2, fi param3, int param4, int param5) {
        int var12 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ri var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ie var17 = null;
        ie var18 = null;
        var16 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 >= -13) {
            field_g = -91;
          }
          if (param4 == param1) {
            return;
          }
          if (!param3.f(true)) {
            return;
          }
          var17 = this.a(param3, (byte) 83);
          var18 = var17;
          if (param1 <= param4) {
            var9 = param4;
            var8 = param1;
          } else {
            var9 = param1;
            var8 = param4;
          }
          var10 = var18.b(var8, 0);
          var11 = var18.b(var9, 0);
          uk.a(param3.field_m + (param3.field_u + param5), 6, param2 + param3.field_l, param3.field_g + param3.field_l + param2, param5 + param3.field_u);
          for (var12 = var10; var11 >= var12; var12++) {
            var13 = var17.field_d[var12];
            if (var10 != var12) {
              stackIn_15_0 = var13.field_d[0];
            } else {
              stackIn_15_0 = var18.a(var8, -1);
            }
            var14 = stackIn_15_0;
            if (var11 == var12) {
              stackIn_20_0 = var18.a(var9, -1);
            } else {
              if (var13 != null) {
                stackIn_20_0 = var13.field_d[-1 + var13.field_d.length];
              } else {
                stackIn_20_0 = 0;
              }
            }
            var15 = stackIn_20_0;
            vi.field_g.a(this.field_o >>> 24, var13.field_c + param3.field_q + (this.field_n + param3.field_u + param5), var13.field_b, -var14 + var15, this.a(param2, var14, (byte) -76, param3), 124, this.field_o);
          }
          ai.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("aj.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(byte param0, fi param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -68 / ((param0 + 33) / 39);
          stackIn_1_0 = param1.field_q + (param2 + param1.field_u) + this.field_n + param3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("aj.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int b(fi param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_4_0 = -this.field_p + param0.field_g - this.field_d;
            return stackIn_4_0;
          }
          stackIn_2_0 = -12;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("aj.FA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, fi param2, int param3) {
        try {
          this.a(param0, this.field_b, param3, 0, 0, -103, this.field_c, param2);
          if (param1 != 29940) {
            fi var6 = (fi) null;
            this.b((fi) null, 57);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "aj.CA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final int a(fi param0, int param1) {
        RuntimeException var3 = null;
        fi var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 65) {
            var4 = (fi) null;
            this.b(-67, (fi) null, -114);
          }
          this.a(param0, (byte) -128);
          stackIn_3_0 = param0.field_r.a((byte) 20) + this.field_n + this.field_r;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("aj.T(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, fi param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.a(-73);
          }
          stackIn_3_0 = -this.field_r - this.field_n + param1.field_m;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("aj.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void b(fi param0, int param1) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0.field_r == null) {
            param0.field_r = (ie) ((Object) new bm());
          }
          if (param1 != -14040) {
            return;
          }
          var3_int = this.b(param0, true);
          var4 = this.a(0, param0);
          var6 = this.field_k;
          if (var6 == 0) {
            var5 = this.field_i.field_H;
          } else {
            if (var6 == 2) {
              var5 = -this.field_i.field_G + var4;
            } else {
              if (var6 != 3 &&
                var6 != 1) {
              }
              var5 = (var4 - this.field_i.field_H - this.field_i.field_G >> 1) + this.field_i.field_H;
            }
          }
          var6Lifetime1 = this.field_j;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 == 1) {
              if (param0.field_r instanceof bm) {
                ((bm) (param0.field_r)).a(this.c(param0, 218479361), (byte) -98, this.field_i, var3_int >> 1, var5);
                return;
              }
            } else {
              if (var6Lifetime1 == 2) {
                if (!(param0.field_r instanceof bm)) {
                  return;
                }
                ((bm) (param0.field_r)).a((byte) -92, var3_int, this.c(param0, 218479361), var5, this.field_i);
              }
            }
            return;
          }
          if (!(param0.field_r instanceof bm)) {
            return;
          }
          ((bm) (param0.field_r)).a(var5, (byte) 59, this.field_i, 0, this.c(param0, 218479361));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("aj.HA(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, aj param1) {
        param1.field_p = this.field_p;
        if (param0 != 0) {
          return;
        }
        try {
          param1.field_k = this.field_k;
          param1.field_n = this.field_n;
          param1.field_o = this.field_o;
          param1.field_f = this.field_f;
          param1.field_c = this.field_c;
          param1.field_r = this.field_r;
          param1.field_b = this.field_b;
          param1.field_t = this.field_t;
          param1.field_i = this.field_i;
          param1.field_d = this.field_d;
          param1.field_j = this.field_j;
          param1.field_s = this.field_s;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "aj.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(int param0, fi param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -7510) {
            this.field_n = 9;
          }
          stackIn_3_0 = this.a(param0, 0, (byte) -76, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("aj.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    aj(e param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(int param0, int param1, byte param2, fi param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -35) {
            aj.a(true);
          }
          stackIn_3_0 = this.field_p + (param3.field_l + param0) - (-param3.field_k - param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("aj.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_m = null;
        field_h = null;
        if (!param0) {
          field_l = null;
          field_q = null;
          return;
        }
        aj.a(true);
        field_l = null;
        field_q = null;
    }

    public final int a(int param0, int param1, int param2, fi param3, boolean param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param3, (byte) -122);
          if (param4) {
            stackIn_4_0 = param3.field_r.a((byte) 120, param2 - this.b(-587719039, param3, param1), -this.a(param0, param3, -7510) + param5);
            return stackIn_4_0;
          }
          stackIn_2_0 = -33;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("aj.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final ie a(fi param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ie stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param0.field_r) {
            param0.field_r = (ie) ((Object) new bm());
          }
          if (this.field_s) {
            ((bm) (param0.field_r)).a(this.field_k, this.field_j, true, this.field_f, this.c(param0, 218479361), this.field_i, this.b(param0, true), this.a(0, param0));
          } else {
            this.b(param0, -14040);
          }
          var3_int = 122 % ((-56 - param1) / 62);
          stackIn_7_0 = param0.field_r;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("aj.GA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, fi param7) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var13Lifetime1;
        var14 = Virogrid.field_F ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          uk.a(param7.field_m + param7.field_u + param0, 6, param2 + param7.field_l, param7.field_g + (param7.field_l + param2), param7.field_u + param0);
          var9_int = -54 % ((-43 - param5) / 49);
          var10 = this.b(param7, true);
          var11 = this.a(0, param7);
          if (!this.field_s) {
            var13 = this.field_k;
            if (0 == var13) {
              var12 = this.field_i.field_H;
            } else {
              if (2 == var13) {
                var12 = var11 - this.field_i.field_G;
              } else {
                if (var13 != 3 &&
                  var13 == 1) {
                }
                var12 = this.field_i.field_H + (-this.field_i.field_H + var11 - this.field_i.field_G >> 1);
              }
            }
            var13Lifetime1 = this.field_j;
            if (var13Lifetime1 != 0 &&
              var13Lifetime1 != 3) {
              if (var13Lifetime1 == 1) {
                this.field_i.c(this.c(param7, 218479361), this.a(param2, param4, (byte) -42, param7) + (var10 >> 1), this.a((byte) 23, param7, param0, param3) + var12, param6, param1);
              } else {
                if ((var13Lifetime1 == 2)) {
                  this.field_i.a(this.c(param7, 218479361), this.a(param2, param4, (byte) -107, param7) + var10, this.a((byte) -78, param7, param0, param3) + var12, param6, param1);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_i.b(this.c(param7, 218479361), this.a(param2, param4, (byte) -88, param7), var12 + this.a((byte) 20, param7, param0, param3), param6, param1);
            }
          } else {
            this.field_i.a(this.c(param7, 218479361), this.a(param2, param4, (byte) -76, param7), this.a((byte) -110, param7, param0, param3), var10, var11, param6, param1, this.field_j, this.field_k, this.field_f);
          }
          ai.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_24_0 = var9;
          stackIn_24_1 = new StringBuilder().append("aj.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, boolean param2, fi param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        ri var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ie var13 = null;
        ie var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_3;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3.f(param2)) {
            return;
          }
          var13 = this.a(param3, (byte) -121);
          var14 = var13;
          var7 = var14.b(param1, 0);
          var8 = var13.field_d[var7];
          var9 = var14.a(param1, -1);
          var10 = this.a(param0, var9, (byte) -94, param3);
          var11 = this.b(-587719039, param3, param4) + Math.max(0, var8.field_c);
          stackIn_4_0 = this.b(-587719039, param3, param4);
          stackIn_4_1 = this.a(0, param3);
          stackIn_4_2 = var8.field_b;
          if (var14.field_d.length <= 1 + var7) {
            stackIn_5_3 = var8.field_b;
          } else {
            stackIn_5_3 = var13.field_d[1 + var7].field_c;
          }
          var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
          uk.a(param3.field_m + param3.field_u + param4, 6, param0 + param3.field_l, param3.field_g + (param3.field_l + param0), param3.field_u + param4);
          vi.field_g.a(var11, -28, this.field_t, var10, var10, var12);
          ai.a(param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("aj.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    public final int a(int param0) {
        if (param0 == 0) {
          return this.field_i.field_H + this.field_i.field_G;
        }
        this.field_r = -20;
        return this.field_i.field_H + this.field_i.field_G;
    }

    String c(fi param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 218479361) {
            stackIn_4_0 = param0.field_n;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("aj.P(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(fi param0, boolean param1) {
        RuntimeException var3 = null;
        fi var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param0, (byte) -118);
          if (param1) {
            var4 = (fi) null;
            this.a(-29, (fi) null, false, -86, -114);
          }
          stackIn_3_0 = param0.field_r.a(3209) + (this.field_p + this.field_d);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("aj.KA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public void a(int param0, fi param1, boolean param2, int param3, int param4) {
        if (this.field_i == null) {
          return;
        }
        try {
          this.a(param3, 29940, param1, param0);
          if (param4 != -23294) {
            this.field_s = false;
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "aj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    protected aj() {
    }

    aj(e param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_r = param4;
          this.field_i = param0;
          this.field_j = param7;
          this.field_c = param5;
          this.field_d = param2;
          this.field_o = param11;
          this.field_b = param6;
          this.field_p = param1;
          this.field_s = param12 ? true : false;
          this.field_n = param3;
          this.field_t = param10;
          this.field_f = param9;
          this.field_k = param8;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "aj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_q = "Log in";
        field_l = "Unpacking graphics";
        field_h = "Played";
        field_e = "Creating your account";
        field_g = 131072;
        field_m = new p();
    }
}

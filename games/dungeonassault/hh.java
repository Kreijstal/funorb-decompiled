/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hh implements ca, th {
    int field_e;
    static int field_p;
    static cn field_o;
    static String[] field_n;
    int field_d;
    int field_f;
    static en field_r;
    int field_i;
    static rj field_s;
    private boolean field_m;
    int field_g;
    static java.awt.Frame field_k;
    private int field_q;
    int field_l;
    int field_j;
    se field_u;
    int field_v;
    int field_t;
    int field_a;
    static int field_b;
    static boolean field_c;
    static String[] field_h;

    public final int a(lm param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b(-2, param0);
          if (param1 == 8) {
            stackIn_4_0 = param0.field_t.b(263) + this.field_e + this.field_i;
            return stackIn_4_0;
          }
          stackIn_2_0 = -1;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hh.Q(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_r = null;
        field_n = null;
        field_h = null;
        field_o = null;
        if (param0 != 1) {
          field_o = (cn) null;
        }
        field_k = null;
        field_s = null;
    }

    hh(se param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param1 == 0) {
          return 0;
        }
        if (param1 > 0) {
          var2 = 1;
          if (param1 > 65535) {
            param1 = param1 >> 16;
            var2 += 16;
          }
          if (param1 > 255) {
            param1 = param1 >> 8;
            var2 += 8;
          }
          if (param1 > 15) {
            var2 += 4;
            param1 = param1 >> 4;
          }
          if (param1 > 3) {
            param1 = param1 >> 2;
            var2 += 2;
          }
          if (param1 > 1) {
            param1 = param1 >> 1;
            var2++;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (param1 < -65536) {
          param1 = param1 >> 16;
          var2Lifetime1 += 16;
        }
        if (param1 < -256) {
          param1 = param1 >> 8;
          var2Lifetime1 += 8;
        }
        if (param0 != 1) {
          hh.a(-47, -9);
        }
        if (param1 < -16) {
          param1 = param1 >> 4;
          var2Lifetime1 += 4;
        }
        if (param1 < -4) {
          param1 = param1 >> 2;
          var2Lifetime1 += 2;
        }
        if (param1 < -2) {
          var2Lifetime1++;
          param1 = param1 >> 1;
        }
        return var2Lifetime1;
    }

    final static void a(byte param0) {
        if (!ib.a((byte) 45)) {
          return;
        }
        if (param0 >= -91) {
          nh var2 = (nh) null;
          hh.a((nh) null, (nh) null, 93, (byte) -9, 95);
        }
        ae.a(false, 4, -1);
    }

    private final int a(int param0, lm param1, int param2, int param3) {
        RuntimeException var5 = null;
        lm var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -16736) {
            var6 = (lm) null;
            this.b(96, (lm) null);
          }
          stackIn_3_0 = param1.field_A + (param1.field_v + param2) + (this.field_e + param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("hh.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static gp a(nh param0, nh param1, int param2, byte param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        gp stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!kk.a(param1, 1, param2, param4)) {
            stackIn_2_0 = null;
            return (gp) (stackIn_2_0);
          }
          var5_int = 12 / ((43 - param3) / 54);
          stackIn_4_0 = wh.a(param0.b(5, param2, param4), (byte) -122);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("hh.S(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, int param1, lm param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= -63) {
            stackIn_4_0 = param1 + param2.field_q + param0 - (-this.field_l - param2.field_j);
            return stackIn_4_0;
          }
          stackIn_2_0 = 82;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("hh.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    String b(lm param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        lm var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -444136767) {
            var4 = (lm) null;
            discarded$1 = this.a(-67, -5, (lm) null, 68);
          }
          stackIn_3_0 = param0.field_w;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hh.P(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(int param0, int param1, int param2, int param3, lm param4, int param5) {
        RuntimeException var7 = null;
        nh var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 16) {
            var8 = (nh) null;
            hh.a((nh) null, (nh) null, 60, (byte) 22, -28);
          }
          this.b(-2, param4);
          stackIn_3_0 = param4.field_t.a(param2 - this.a(param4, (byte) 93, param3), -this.a((byte) -85, param1, param4) + param5, (byte) -118);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("hh.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(')').toString());
        }
    }

    private final int d(int param0, lm param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 15 % ((-35 - param0) / 32);
          stackIn_1_0 = -this.field_i + (-this.field_e + param1.field_s);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("hh.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final int a(lm param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 31 % ((param1 - 10) / 51);
          stackIn_1_0 = this.a(param2, 0, param0, -120);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("hh.AA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        if (this.field_u == null) {
          return;
        }
        try {
          this.a(param1, param2, (byte) 111, param3);
          if (param0 != 34) {
            this.field_j = 71;
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "hh.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, int param4, lm param5, int param6, int param7) {
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
        var14 = DungeonAssault.field_K;
        try {
          boolean decompiledFrameRemainder0 = true;
          d.a(param5.field_q + param3, param7 + (param5.field_v + param5.field_s), param5.field_q + param3 + param5.field_x, param5.field_v + param7, false);
          var9_int = this.c(4, param5);
          var11 = 62 / ((param0 - 50) / 41);
          var10 = this.d(-106, param5);
          if (this.field_m) {
            this.field_u.a(this.b(param5, -444136767), this.a(param3, param6, param5, -64), this.a(param4, param5, param7, -16736), var9_int, var10, param2, param1, this.field_f, this.field_d, this.field_a);
          } else {
            var13 = this.field_d;
            if (var13 == 0) {
              var12 = this.field_u.field_H;
            } else {
              if (var13 == 2) {
                var12 = var10 - this.field_u.field_E;
              } else {
                if (var13 != 3 &&
                  1 != var13) {
                }
                var12 = (-this.field_u.field_E + var10 - this.field_u.field_H >> 1) + this.field_u.field_H;
              }
            }
            var13Lifetime1 = this.field_f;
            if (0 != var13Lifetime1 &&
              var13Lifetime1 != 3) {
              if (var13Lifetime1 == 1) {
                this.field_u.c(this.b(param5, -444136767), (var9_int >> 1) + this.a(param3, param6, param5, -102), this.a(param4, param5, param7, -16736) + var12, param2, param1);
              } else {
                if ((var13Lifetime1 == 2)) {
                  this.field_u.a(this.b(param5, -444136767), this.a(param3, param6, param5, -104) + var9_int, this.a(param4, param5, param7, -16736) + var12, param2, param1);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_u.b(this.b(param5, -444136767), this.a(param3, param6, param5, -109), this.a(param4, param5, param7, -16736) + var12, param2, param1);
            }
          }
          ti.c(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_24_0 = var9;
          stackIn_24_1 = new StringBuilder().append("hh.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final int a(int param0) {
        if (param0 <= 11) {
          this.a(85);
        }
        return this.field_u.field_E + this.field_u.field_H;
    }

    public final void a(lm param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        tg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        l var13 = null;
        l var14 = null;
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
          if (param0.a((byte) 122)) {
            var13 = this.b(-2, param0);
            var14 = var13;
            var7 = var14.a(0, param1);
            var8 = var13.field_e[var7];
            var9 = var14.a((byte) -128, param1);
            var10 = this.a(param4, var9, param0, param3 ^ 64);
            var11 = this.a((byte) -73, param2, param0) + Math.max(0, var8.field_m);
            stackIn_4_0 = this.a((byte) 81, param2, param0);
            stackIn_4_1 = this.d(92, param0);
            stackIn_4_2 = var8.field_c;
            if (var14.field_e.length <= var7 + 1) {
              stackIn_5_3 = var8.field_c;
            } else {
              stackIn_5_3 = var13.field_e[var7 + 1].field_m;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            d.a(param0.field_q + param4, param0.field_v + param2 + param0.field_s, param0.field_q + param4 + param0.field_x, param2 + param0.field_v, false);
            hl.field_a.a(var10, var12, var11, var10, this.field_j, true);
            ti.c(true);
          }
          if (param3 != -1) {
            field_h = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("hh.N(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final int c(int param0, lm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 4) {
            this.field_l = -97;
          }
          stackIn_3_0 = -this.field_v + (-this.field_l + param1.field_x);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hh.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(byte param0, hh param1) {
        param1.field_d = this.field_d;
        param1.field_a = this.field_a;
        param1.field_i = this.field_i;
        param1.field_g = this.field_g;
        param1.field_u = this.field_u;
        param1.field_e = this.field_e;
        param1.field_j = this.field_j;
        param1.field_q = this.field_q;
        param1.field_t = this.field_t;
        param1.field_m = this.field_m;
        param1.field_v = this.field_v;
        param1.field_f = this.field_f;
        if (param0 <= 124) {
          return;
        }
        try {
          param1.field_l = this.field_l;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "hh.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(lm param0, int param1, byte param2, int param3) {
        try {
          this.a((byte) -64, this.field_q, this.field_g, param1, 0, param0, 0, param3);
          if (param2 < 91) {
            lm var6 = (lm) null;
            this.a((lm) null, -119, (byte) -24, -82);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "hh.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final l b(int param0, lm param1) {
        RuntimeException var3 = null;
        l stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param1.field_t) {
            param1.field_t = (l) ((Object) new fe());
          }
          if (param0 != -2) {
            field_b = -86;
          }
          if (this.field_m) {
            ((fe) (param1.field_t)).a(this.b(param1, -444136767), 0, this.field_d, this.d(param0 - 118, param1), this.field_f, this.c(param0 + 6, param1), this.field_a, this.field_u);
          } else {
            this.a(param1, (byte) -113);
          }
          stackIn_8_0 = param1.field_t;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("hh.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void a(lm param0, byte param1) {
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
        int var8 = 0;
        int var7Lifetime1;
        var8 = DungeonAssault.field_K;
        try {
          if (param0.field_t == null) {
            param0.field_t = (l) ((Object) new fe());
          }
          var3_int = this.c(4, param0);
          var6 = -72 / ((param1 + 43) / 62);
          var4 = this.d(68, param0);
          var7 = this.field_d;
          if (var7 != 0) {
            if (var7 == 2) {
              var5 = var4 - this.field_u.field_E;
            } else {
              if (var7 != 3 &&
                var7 == 1) {
              }
              var5 = this.field_u.field_H + (-this.field_u.field_H + (var4 - this.field_u.field_E) >> 1);
            }
          } else {
            var5 = this.field_u.field_H;
          }
          var7Lifetime1 = this.field_f;
          if (var7Lifetime1 != 0 &&
            var7Lifetime1 != 3) {
            if (var7Lifetime1 == 1) {
              if (!(param0.field_t instanceof fe)) {
                return;
              }
              ((fe) (param0.field_t)).a(var5, this.b(param0, -444136767), this.field_u, (byte) -78, var3_int >> 1);
              return;
            }
            if (2 != var7Lifetime1) {
              return;
            }
            if (!(param0.field_t instanceof fe)) {
              return;
            }
            ((fe) (param0.field_t)).a(var3_int, (byte) 81, this.b(param0, -444136767), this.field_u, var5);
          } else {
            if (param0.field_t instanceof fe) {
              ((fe) (param0.field_t)).a(this.b(param0, -444136767), -74, this.field_u, 0, var5);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("hh.R(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(byte param0, int param1, lm param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 57 / ((param0 - 11) / 40);
          stackIn_1_0 = this.a(0, param2, param1, -16736);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("hh.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    protected hh() {
    }

    public final void a(int param0, int param1, int param2, lm param3, int param4, int param5) {
        int var13 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        l var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        tg var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = DungeonAssault.field_K;
        try {
          if (param5 == param0) {
            return;
          }
          var7_int = 55 / ((-54 - param4) / 33);
          if (param3.a((byte) 18)) {
            var8 = this.b(-2, param3);
            if (param5 > param0) {
              var9 = param0;
              var10 = param5;
            } else {
              var9 = param5;
              var10 = param0;
            }
            var11 = var8.a(0, var9);
            var12 = var8.a(0, var10);
            d.a(param1 + param3.field_q, param2 + param3.field_v + param3.field_s, param1 + param3.field_q + param3.field_x, param2 + param3.field_v, false);
            for (var13 = var11; var13 <= var12; var13++) {
              var14 = var8.field_e[var13];
              if (var13 == var11) {
                stackIn_14_0 = var8.a((byte) -126, var9);
              } else {
                stackIn_14_0 = var14.field_k[0];
              }
              var15 = stackIn_14_0;
              if (var12 != var13) {
                if (var14 == null) {
                  stackIn_19_0 = 0;
                } else {
                  stackIn_19_0 = var14.field_k[var14.field_k.length - 1];
                }
              } else {
                stackIn_19_0 = var8.a((byte) -127, var10);
              }
              var16 = stackIn_19_0;
              hl.field_a.a(var16 - var15, this.a(param1, var15, param3, -75), param3.field_A + (this.field_e + (param2 - (-param3.field_v - var14.field_m))), this.field_t, -85, this.field_t >>> 24, var14.field_c);
            }
            ti.c(true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("hh.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final int a(int param0, lm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b(-2, param1);
          if (param0 >= 59) {
            stackIn_4_0 = param1.field_t.c(-76) + this.field_l + this.field_v;
            return stackIn_4_0;
          }
          stackIn_2_0 = 78;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hh.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    hh(se param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_q = param6;
          this.field_d = param8;
          this.field_m = param12 ? true : false;
          this.field_e = param3;
          this.field_j = param10;
          this.field_l = param1;
          this.field_i = param4;
          this.field_t = param11;
          this.field_u = param0;
          this.field_f = param7;
          this.field_a = param9;
          this.field_v = param2;
          this.field_g = param5;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "hh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_n = new String[]{"Stable", "The stable shows the <%raiders> currently under your control. It can hold a <%highlight>maximum of eight raiders</col> at any one time. The raiders available for hire are displayed in the panel to the left. As with rooms, <%highlight>more will become available as you gain Renown</col>."};
        field_p = 320;
        field_h = new String[]{"Revive", "With great expenditure of effort and numerous dark invocations, the <%0> is able to call the spirit of a dead raider back from the next world. The raider will be teleported back to your stable. (Single use)"};
    }
}

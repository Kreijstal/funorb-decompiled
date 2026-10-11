/*
 * Decompiled by CFR-JS 0.4.0.
 */
class k implements db, ao {
    int field_k;
    int field_h;
    int field_i;
    static ed field_j;
    int field_c;
    int field_g;
    int field_f;
    int field_o;
    int field_n;
    int field_m;
    wl field_l;
    int field_b;
    private int field_e;
    static String field_p;
    static cn field_d;
    private boolean field_a;

    public final int a(byte param0, hm param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -113) {
            stackIn_4_0 = this.a(0, param1, -18079, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = -25;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("k.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public final int a(int param0, int param1, int param2, int param3, int param4, hm param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 <= 81) {
            this.field_e = -116;
          }
          this.b(param5, 90);
          stackIn_3_0 = param5.field_p.a((byte) 39, param3 - this.a((byte) -113, param5, param0), param2 - this.a(param5, param1, -16956));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("k.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(hm param0, int param1, int param2) {
        RuntimeException var4 = null;
        hm var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -16956) {
            var5 = (hm) null;
            this.a(-8, (hm) null);
          }
          stackIn_3_0 = this.b(param0, 0, 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("k.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(hm param0, int param1, int param2, int param3) {
        try {
          this.a(param1, this.field_h, this.field_e, param2, 0, 0, true, param0);
          if (param3 >= -15) {
            hm var6 = (hm) null;
            this.a((byte) 102, (hm) null);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "k.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int b(hm param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        hm var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var6 = (hm) null;
            this.a(-51, -123, -119, 54, -115, (hm) null);
          }
          stackIn_3_0 = param2 + (param0.field_v + this.field_f + (param3 + param0.field_j));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("k.BA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static ed a(int param0, byte param1, int param2) {
        rk[] var5 = w.c(false);
        var5 = var5;
        if (var5 == null) {
          return null;
        }
        if (param1 == -39) {
          return var5[param2].a(false, param0);
        }
        k.a(true, '￾');
        return var5[param2].a(false, param0);
    }

    public void a(int param0, int param1, int param2, hm param3, boolean param4) {
        if (null == this.field_l) {
          return;
        }
        try {
          if (param2 >= -14) {
            hm var7 = (hm) null;
            this.a((hm) null, -75, 106, 104, false);
          }
          this.a(param3, param1, param0, -100);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "k.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final int a(hm param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -25033) {
            this.field_g = 7;
          }
          stackIn_3_0 = -this.field_b - this.field_n + param0.field_g;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("k.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, int param1, hm param2, int param3, int param4, int param5) {
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
        vl var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        hm var17 = null;
        pg var18 = null;
        pg var19 = null;
        var16 = EscapeVector.field_A;
        try {
          if (param4 != -613528456) {
            var17 = (hm) null;
            this.a(-128, 94, 31, -40, 4, (hm) null);
          }
          if (param3 == param1) {
            return;
          }
          if (!param2.h(0)) {
            return;
          }
          var18 = this.b(param2, 90);
          var19 = var18;
          if (param1 <= param3) {
            var8 = param1;
            var9 = param3;
          } else {
            var9 = param1;
            var8 = param3;
          }
          var10 = var19.a(var8, 0);
          var11 = var19.a(var9, 0);
          rd.a(param2.field_g + (param2.field_k + param0), param0 + param2.field_k, param2.field_x + (param2.field_j + param5), 19807, param5 + param2.field_j);
          for (var12 = var10; var11 >= var12; var12++) {
            var13 = var18.field_a[var12];
            if (var12 == var10) {
              stackIn_15_0 = var19.a((byte) 127, var8);
            } else {
              stackIn_15_0 = var13.field_b[0];
            }
            var14 = stackIn_15_0;
            if (var12 == var11) {
              stackIn_20_0 = var19.a((byte) -9, var9);
            } else {
              if (var13 == null) {
                stackIn_20_0 = 0;
              } else {
                stackIn_20_0 = var13.field_b[var13.field_b.length - 1];
              }
            }
            var15 = stackIn_20_0;
            mb.field_g.a(var13.field_a, 1, this.field_i >>> 24, var13.field_d + (param5 + param2.field_j) - (-this.field_f - param2.field_v), var15 - var14, this.field_i, this.a(var14, param2, -18079, param0));
          }
          dl.a((byte) -59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("k.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, hm param7) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = EscapeVector.field_A;
        try {
          boolean decompiledFrameRemainder0 = true;
          rd.a(param3 + param7.field_k + param7.field_g, param3 + param7.field_k, param0 - (-param7.field_j - param7.field_x), 19807, param7.field_j + param0);
          var9_int = this.a(param7, -25033);
          var10 = this.b(-14072, param7);
          if (this.field_a) {
            this.field_l.a(this.b((byte) 39, param7), this.a(param5, param7, -18079, param3), this.b(param7, 0, param4, param0), var9_int, var10, param1, param2, this.field_m, this.field_c, this.field_k);
          } else {
            var12 = this.field_c;
            if (var12 != 0) {
              if (var12 == 2) {
                var11 = -this.field_l.field_x + var10;
              } else {
                if (var12 != 3 &&
                  var12 == 1) {
                }
                var11 = this.field_l.field_r + (var10 - this.field_l.field_r - this.field_l.field_x >> 1);
              }
            } else {
              var11 = this.field_l.field_r;
            }
            var12Lifetime1 = this.field_m;
            if (0 != var12Lifetime1 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.field_l.c(this.b((byte) 39, param7), this.a(param5, param7, -18079, param3) + (var9_int >> 1), this.b(param7, 0, param4, param0) + var11, param1, param2);
              } else {
                if ((2 == var12Lifetime1)) {
                  this.field_l.b(this.b((byte) 39, param7), this.a(param5, param7, -18079, param3) + var9_int, var11 + this.b(param7, 0, param4, param0), param1, param2);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_l.a(this.b((byte) 39, param7), this.a(param5, param7, -18079, param3), var11 + this.b(param7, 0, param4, param0), param1, param2);
            }
          }
          if (!param6) {
            k.b(85);
          }
          dl.a((byte) 125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_28_0 = var9;
          stackIn_28_1 = new StringBuilder().append("k.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final int a(int param0, hm param1, int param2, int param3) {
        int discarded$1 = 0;
        RuntimeException var5 = null;
        hm var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -18079) {
            var6 = (hm) null;
            discarded$1 = this.a(39, (hm) null, 121, 83);
          }
          stackIn_3_0 = param0 + (this.field_n + param1.field_k) + (param3 + param1.field_n);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("k.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int b(int param0, hm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -14072) {
            this.field_i = 0;
          }
          stackIn_3_0 = -this.field_o + (param1.field_x - this.field_f);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("k.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(k param0, int param1) {
        try {
          param0.field_f = this.field_f;
          param0.field_g = this.field_g;
          param0.field_m = this.field_m;
          param0.field_e = this.field_e;
          param0.field_o = this.field_o;
          param0.field_b = this.field_b;
          if (param1 <= 56) {
            this.field_e = 60;
          }
          param0.field_n = this.field_n;
          param0.field_l = this.field_l;
          param0.field_k = this.field_k;
          param0.field_i = this.field_i;
          param0.field_c = this.field_c;
          param0.field_a = this.field_a;
          param0.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "k.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int a(int param0) {
        if (param0 >= 96) {
          return this.field_l.field_r + this.field_l.field_x;
        }
        field_p = (String) null;
        return this.field_l.field_r + this.field_l.field_x;
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != -24239) {
          return;
        }
        field_p = null;
        field_j = null;
    }

    final static boolean a(boolean param0, char param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (!param0) {
          field_j = (ed) null;
          if (48 > param1) {
            if (65 <= param1 &&
              param1 <= 90) {
              return true;
            }
            if (param1 < 97) {
              return false;
            }
            if (122 < param1) {
              return false;
            }
            return true;
          }
          if (param1 <= 57) {
            return true;
          }
          if (65 > param1) {
            if (param1 < 97) {
              return false;
            }
            if (122 >= param1) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_28_0 = (param1 >= 97) && (122 >= param1);
          return stackIn_28_0;
        }
        if (48 > param1) {
          if (65 > param1) {
            if (param1 < 97) {
              return false;
            }
            if (122 < param1) {
              return false;
            }
            return true;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_64_0 = (param1 >= 97) && (122 >= param1);
          return stackIn_64_0;
        }
        if (param1 <= 57) {
          return true;
        }
        if (65 > param1) {
          if (param1 < 97) {
            return false;
          }
          if (122 < param1) {
            return false;
          }
          return true;
        }
        if (param1 <= 90) {
          return true;
        }
        stackIn_50_0 = (param1 >= 97) && (122 >= param1);
        return stackIn_50_0;
    }

    String b(byte param0, hm param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 39) {
            field_d = (cn) null;
          }
          stackIn_3_0 = param1.field_l;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("k.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void a(hm param0, int param1, int param2, int param3, boolean param4) {
        pg var13 = null;
        pg var14 = null;
        int var7 = 0;
        vl var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          if (!param4) {
            this.field_h = 30;
          }
          if (param0.h(0)) {
            var13 = this.b(param0, 90);
            var14 = var13;
            var7 = var14.a(param1, 0);
            var8 = var13.field_a[var7];
            var9 = var14.a((byte) 122, param1);
            var10 = this.a(var9, param0, -18079, param2);
            var11 = this.a(param0, param3, -16956) + Math.max(0, var8.field_d);
            var12 = this.a(param0, param3, -16956) + Math.min(this.b(-14072, param0), Math.min(var8.field_a, var7 + 1 < var14.field_a.length ? var13.field_a[1 + var7].field_d : var8.field_a));
            rd.a(param0.field_g + param2 + param0.field_k, param0.field_k + param2, param3 + (param0.field_j + param0.field_x), 19807, param0.field_j + param3);
            mb.field_g.a(var10, var12, -29666, var10, var11, this.field_g);
            dl.a((byte) 122);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "k.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    k(wl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    protected k() {
    }

    public final pg b(hm param0, int param1) {
        RuntimeException var3 = null;
        hm var4 = null;
        pg stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param0.field_p) {
            param0.field_p = (pg) ((Object) new wh());
          }
          if (this.field_a) {
            ((wh) (param0.field_p)).a(this.b(param1 - 14162, param0), this.b((byte) 39, param0), this.field_l, this.a(param0, param1 - 25123), this.field_m, this.field_c, this.field_k, (byte) -13);
          } else {
            this.c(param0, -86);
          }
          if (param1 != 90) {
            var4 = (hm) null;
            this.a((byte) 117, (hm) null, -58);
          }
          stackIn_9_0 = param0.field_p;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("k.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(hm param0, int param1) {
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
        int var6Lifetime1;
        var7 = EscapeVector.field_A;
        try {
          if (null == param0.field_p) {
            param0.field_p = (pg) ((Object) new wh());
          }
          var3_int = this.a(param0, -25033);
          if (param1 >= -6) {
            this.field_c = 29;
          }
          var4 = this.b(-14072, param0);
          var6 = this.field_c;
          if (var6 != 0) {
            if (2 != var6) {
              if (var6 != 3 &&
                var6 == 1) {
              }
              var5 = this.field_l.field_r + (-this.field_l.field_r + var4 - this.field_l.field_x >> 1);
            } else {
              var5 = var4 - this.field_l.field_x;
            }
          } else {
            var5 = this.field_l.field_r;
          }
          var6Lifetime1 = this.field_m;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (1 == var6Lifetime1) {
              if (!(param0.field_p instanceof wh)) {
                return;
              }
              ((wh) (param0.field_p)).a(this.b((byte) 39, param0), var3_int >> 1, this.field_l, var5, true);
              return;
            }
            if (2 != var6Lifetime1) {
              return;
            }
            if (!(param0.field_p instanceof wh)) {
              return;
            }
            ((wh) (param0.field_p)).a(this.field_l, this.b((byte) 39, param0), var3_int, var5, (byte) 69);
            return;
          }
          if (param0.field_p instanceof wh) {
            ((wh) (param0.field_p)).a(this.b((byte) 39, param0), 0, 0, var5, this.field_l);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("k.AA(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    k(wl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_h = param5;
          this.field_k = param9;
          this.field_g = param10;
          this.field_b = param2;
          this.field_l = param0;
          this.field_c = param8;
          this.field_i = param11;
          this.field_o = param4;
          this.field_e = param6;
          this.field_f = param3;
          this.field_m = param7;
          this.field_n = param1;
          this.field_a = param12 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    public final int a(byte param0, hm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -46) {
            stackIn_2_0 = -89;
            return stackIn_2_0;
          }
          this.b(param1, 90);
          stackIn_4_0 = param1.field_p.a((byte) -112) + this.field_n + this.field_b;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("k.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int a(int param0, hm param1) {
        RuntimeException var3 = null;
        hm var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b(param1, 90);
          if (param0 > -95) {
            var4 = (hm) null;
            this.a((hm) null, 11, -109, 0);
          }
          stackIn_3_0 = param1.field_p.c(0) + (this.field_f + this.field_o);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("k.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_p = "Shield: ";
        field_d = new cn();
    }
}

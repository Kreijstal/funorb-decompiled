/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fc {
    int field_e;
    int field_j;
    int[][] field_f;
    static int[] field_m;
    int field_d;
    int[][] field_k;
    int field_i;
    int[][] field_g;
    int[][] field_h;
    private int field_b;
    int[] field_l;
    static boolean[] field_c;
    static cj field_a;

    public static void b(int param0) {
        if (param0 != -1) {
          field_a = (cj) null;
        }
        field_m = null;
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0, boolean param1) {
        gf.field_g = 0;
        lq.field_b = 0;
        fn.field_c = 0;
        lb.field_a = nf.field_a;
        if (param0 < 121) {
          return;
        }
        gl.field_H = new hh(2);
        gl.field_H.a(-1, param1, -31458, al.c(bo.field_d, -1, bd.field_g));
    }

    private final id a(int param0, int param1, byte param2, int param3, int param4) {
        int var6_int;
        h var6;
        fd var6_ref;
        int var7;
        wb var8;
        if (param1 == 0) {
          var6_int = 1073741823 & param3;
          var7 = (byte)(param3 >>> 30 & 3);
          var8 = new wb(param0, param4, var6_int);
          var8.field_Lb = var7;
          return (id) ((Object) var8);
        }
        if (param1 == 1) {
          return (id) ((Object) pg.a(param0, (byte) -128, param3, param4));
        }
        if (2 == param1) {
          var6_ref = new fd(param0, param4, param3 & -1610612737);
          if (0 < (param3 & 1073741824)) {
            var6_ref.field_H = true;
          }
          if (0 < (param3 & 536870912)) {
            var6_ref.field_K = true;
          }
          return (id) ((Object) var6_ref);
        }
        if (3 == param1) {
          return (id) ((Object) new mg(param0, param4, param3));
        }
        if (param1 == 4) {
          var6 = new h(param0, param4, false);
          var6.field_I = (byte)((param3 & -1073741824) >>> 30);
          return (id) ((Object) var6);
        }
        if (param2 <= -60) {
          return null;
        }
        this.a((byte) 54);
        return null;
    }

    private final int a(boolean param0, int param1) {
        if (!param0) {
          this.field_b = 72;
        }
        if (this.field_b < 4 &&
          param1 < 64) {
          param1 = param1 + this.field_b * 72;
        }
        return param1 << 7;
    }

    th a(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        id var9 = null;
        int var10 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = 88 % ((param0 - 37) / 41);
        th var3 = new th();
        for (var4 = 0; var4 < this.field_l.length; var4 += 4) {
          var5 = this.field_l[var4];
          var6 = this.field_l[var4 + 1];
          var7 = this.field_l[2 + var4];
          var8 = this.field_l[3 + var4];
          var9 = this.a(var7, var5, (byte) -97, var6, var8);
          var3.a(var9, false);
        }
        return var3;
    }

    void a(byte param0) {
        this.a(this.field_g, 9);
        this.b(this.field_g, -10);
        this.field_d = this.field_g[0].length;
        if (param0 < 120) {
          return;
        }
        this.field_e = this.field_g.length;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (param0 != -8927) {
          this.field_h = (int[][]) null;
        }
        this.field_k[param1][param2] = cr.b(param3 ? 1 : 0, tq.b(14, this.field_k[param1][param2]));
        if (this.field_k[param1].length > param2 + 1) {
          this.field_k[param1][param2 + 1] = cr.b(tq.b(this.field_k[param1][1 + param2], -3), param3 ? 2 : 0);
        }
        if (0 < param2 - 1) {
          this.field_k[param1][-1 + param2] = cr.b(tq.b(this.field_k[param1][-1 + param2], -5), param3 ? 4 : 0);
        }
    }

    private final void b(int[][] param0, int param1) {
        boolean discarded$0 = false;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != -10) {
            discarded$0 = this.a(94, -4, (byte) -2);
          }
          for (var3_int = 0; param0.length > var3_int; var3_int++) {
            for (var4 = 0; param0[0].length > var4; var4++) {
              var5 = this.a(var3_int, true, var4);
              var6 = 511 & var5 >> 7;
              var7 = var5 >> 16 & 511;
              if ((-2147483648 & var5) != 0 && (var6 >= 9 &&
                32 >= var6 ||
                var7 >= 9 &&
                32 >= var7 ||
                (this.a(1 + var3_int, true, var4) & 65408) >> 7 == 16)) {
                var5 = var5 | 67108864;
              }
              this.field_f[var3_int][var4] = var5;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("fc.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int[][] param0, int param1) {
        id discarded$0 = null;
        int[] dupTemp$1 = null;
        int dupTemp$2 = 0;
        int[] arrayValue$3 = null;
        int[] dupTemp$4 = null;
        int dupTemp$5 = 0;
        int[] arrayValue$6 = null;
        int stackIn_11_0 = 0;
        int[] stackIn_13_0;
        int stackIn_13_1;
        int[] stackIn_13_2;
        int stackIn_13_3;
        int stackIn_14_4;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          for (var3_int = 0; param0.length > var3_int; var3_int++) {
            for (var4 = 0; param0[0].length > var4; var4++) {
              if ((param0[var3_int][var4] & 33554432) == 0) {
                stackIn_11_0 = ((param0[var3_int][var4] & -2147483648) == 0) ? 1 : 0;
              } else {
                stackIn_11_0 = 0;
              }
              var5 = stackIn_11_0;
              stackIn_13_0 = this.field_h[var3_int];
              stackIn_13_1 = var4;
              stackIn_13_2 = this.field_k[var3_int];
              stackIn_13_3 = var4;
              if (var5 == 0) {
                stackIn_14_4 = 0;
              } else {
                stackIn_14_4 = 1;
              }
              stackIn_13_2[stackIn_13_3] = stackIn_14_4;
              stackIn_13_0[stackIn_13_1] = stackIn_14_4;
            }
          }
          if (param1 != 9) {
            discarded$0 = this.a(106, -54, (byte) -40, 61, -65);
          }
          for (var3_intLifetime1 = 0; var3_intLifetime1 < param0.length; var3_intLifetime1++) {
            var7 = 1;
            var4Lifetime1 = var7;
            while (param0[0].length - 1 > var7) {
              if (1 == (this.field_k[var3_intLifetime1][var7] & 1)) {
                dupTemp$1 = this.field_k[var3_intLifetime1];
                dupTemp$2 = cr.b(this.field_k[var3_intLifetime1][var7 + 1], 2);
                arrayValue$3 = this.field_h[var3_intLifetime1];
                dupTemp$1[1 + var7] = dupTemp$2;
                arrayValue$3[1 + var7] = dupTemp$2;
                dupTemp$4 = this.field_k[var3_intLifetime1];
                dupTemp$5 = cr.b(4, this.field_k[var3_intLifetime1][-1 + var7]);
                arrayValue$6 = this.field_h[var3_intLifetime1];
                dupTemp$4[-1 + var7] = dupTemp$5;
                arrayValue$6[var7 - 1] = dupTemp$5;
              }
              var7++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("fc.I(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, boolean param1, int param2) {
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_37_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = this.a((byte) 91, param2, param0);
        var4 = var4 & -67108865;
        var5 = 511 & var4 >> 7;
        if ((var4 & 33554432) != 0 &&
          var5 == 0) {
          var4 = var4 & -65409;
          if (!this.a(param2 + 1, param0, (byte) -53)) {
            stackIn_10_0 = (!this.a(param0, param2 + 1, 2)) ? 1 : 0;
          } else {
            stackIn_10_0 = 0;
          }
          var6 = stackIn_10_0;
          var7 = this.a(param2, 3 + param0, (byte) -53) ? 1 : 0;
          var8 = this.a(param2, param0 - 1, (byte) -53) ? 1 : 0;
          if (!this.a(param2 - 1, param0, (byte) -53)) {
            stackIn_16_0 = (!this.a(param0, param2 - 1, 2)) ? 1 : 0;
          } else {
            stackIn_16_0 = 1;
          }
          var9 = stackIn_16_0;
          stackIn_19_0 = (!this.a(param2 + 1, param0, (byte) -53)) ? 0 : 1;
          var10 = stackIn_19_0;
          if (this.a(param0, param2, 2) &&
            var6 == 0) {
            if (var7 != 0 &&
              var8 != 0 &&
              var9 != 0 &&
              var10 != 0) {
              var4 = var4 | this.a(param1, 9);
            }
            if (var7 != 0 &&
              var8 != 0 &&
              var9 != 0 &&
              var10 == 0) {
              var4 = var4 | this.a(true, 10);
            }
            if (var7 != 0 &&
              var8 != 0 &&
              var9 == 0 &&
              var10 != 0) {
              var4 = var4 | this.a(param1, 11);
            }
            if (var7 != 0 &&
              var8 != 0 &&
              var9 == 0 &&
              var10 == 0) {
              var4 = var4 | this.a(true, 18);
            }
            if (var7 != 0 &&
              var8 == 0 &&
              var9 != 0 &&
              var10 != 0) {
              var4 = var4 | this.a(true, 12);
            }
            if (var7 != 0 &&
              var8 == 0 &&
              var9 != 0 &&
              var10 == 0) {
              var4 = var4 | this.a(true, 14);
            }
            if (var7 != 0 &&
              var8 == 0 &&
              var9 == 0 &&
              var10 != 0) {
              var4 = var4 | this.a(true, 15);
            }
            if (var7 != 0 &&
              var8 == 0 &&
              var9 == 0 &&
              var10 == 0) {
              var4 = var4 | this.a(true, 21);
            }
            if (var7 == 0 &&
              var8 != 0 &&
              var9 != 0 &&
              var10 != 0) {
              var4 = var4 | this.a(true, 13);
            }
            if (var7 == 0 &&
              var8 != 0 &&
              var9 != 0 &&
              var10 == 0) {
              var4 = var4 | this.a(param1, 16);
            }
            if (var7 == 0 &&
              var8 != 0 &&
              var9 == 0 &&
              var10 != 0) {
              var4 = var4 | this.a(param1, 17);
            }
            if (var7 == 0 &&
              var8 != 0 &&
              var9 == 0 &&
              var10 == 0) {
              var4 = var4 | this.a(true, 20);
            }
            if (var7 == 0 &&
              var8 == 0 &&
              var9 != 0 &&
              var10 != 0) {
              var4 = var4 | this.a(true, 19);
            }
            if (var7 == 0 &&
              var8 == 0 &&
              var9 != 0 &&
              var10 == 0) {
              var4 = var4 | this.a(true, 22);
            }
            if (var7 == 0 &&
              var8 == 0 &&
              var9 == 0 &&
              var10 != 0) {
              var4 = var4 | this.a(true, 23);
            }
            if (var7 == 0 &&
              var8 == 0 &&
              var9 == 0 &&
              var10 == 0) {
              var4 = var4 | this.a(param1, 24);
            }
          } else if (this.a(param0, param2, 2) &&
            var6 != 0) {
            stackIn_27_0 = var10;
            if (!this.a(param2 + 1, 2 + param0, (byte) -53) &&
              !this.a(1 + param2, param0 + 1, (byte) -53)) {
              stackIn_29_1 = 0;
            } else {
              stackIn_29_1 = 1;
            }
            var10 = stackIn_27_0 | stackIn_29_1;
            stackIn_32_0 = var9;
            if (!this.a(param2 - 1, 2 + param0, (byte) -53) &&
              !this.a(-1 + param2, param0 + 1, (byte) -53)) {
              stackIn_34_1 = 0;
            } else {
              stackIn_34_1 = 1;
            }
            var9 = stackIn_32_0 | stackIn_34_1;
            stackIn_37_0 = (!this.a(param2 + 1, param0 + 1, (byte) -53)) ? 0 : 128;
            var11 = stackIn_37_0;
            if (var7 == 0 &&
              var8 == 0 &&
              var9 != 0 &&
              var10 != 0) {
              var4 = var4 | -var11 + this.a(true, 26);
            }
            if (var7 == 0 &&
              var8 == 0 &&
              var9 == 0 &&
              var10 != 0) {
              var4 = var4 | this.a(true, 28) - var11;
            }
          } else {
            if (!this.a(param2, 1 + param0, (byte) -53)) {
              if (this.a(param2, param0 + 2, (byte) -53)) {
                if (this.a(param2 + 1, param0, (byte) -53) &&
                  this.a(param2 - 1, param0, (byte) -53)) {
                  var4 = var4 | this.a(param1, 6);
                } else {
                  if (!this.a(param2 + 1, param0, (byte) -53)) {
                    if (!this.a(-1 + param2, param0, (byte) -53)) {
                      var4 = var4 | this.a(true, 2);
                    } else {
                      var4 = var4 | this.a(true, 4);
                    }
                  } else {
                    var4 = var4 | this.a(param1, 8);
                  }
                }
              }
            } else {
              if (this.a(1 + param2, param0, (byte) -53) &&
                this.a(-1 + param2, param0, (byte) -53)) {
                var4 = var4 | this.a(true, 5);
              } else {
                if (!this.a(param2 + 1, param0, (byte) -53)) {
                  if (!this.a(param2 - 1, param0, (byte) -53)) {
                    var4 = var4 | this.a(true, 1);
                  } else {
                    var4 = var4 | this.a(param1, 3);
                  }
                } else {
                  var4 = var4 | this.a(true, 7);
                }
              }
            }
          }
          if ((65408 & var4) == 0) {
            var4 = var4 | this.a(param1, 24);
          }
          if (!param1) {
            this.a((int[][]) null, -26);
          }
          return var4;
        }
        return var4;
    }

    private final boolean a(int param0, int param1, int param2) {
        boolean stackIn_6_0 = false;
        if (param2 != 2) {
          this.field_d = -47;
        }
        stackIn_6_0 = (!this.a(param1, param0 + 1, (byte) -53)) && (!this.a(param1, param0 + 2, (byte) -53));
        return stackIn_6_0;
    }

    final static void b(byte param0) {
        if (f.field_a != -vm.field_hb + 0 &&
          -vm.field_hb + 250 != f.field_a) {
        }
        if (param0 != -9) {
          field_a = (cj) null;
        }
        f.field_a = f.field_a + 1;
    }

    private final boolean a(int param0, int param1, byte param2) {
        boolean stackIn_7_0 = false;
        if (param2 != -53) {
          return false;
        }
        stackIn_7_0 = (0 == (this.a((byte) 82, param0, param1) & 33554432)) || !((this.a((byte) 105, param0, param1) >> 7 & 511) <= 64);
        return stackIn_7_0;
    }

    private final int a(byte param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param0 <= 31) {
          discarded$0 = this.a(24, -127, (byte) 25);
        }
        if (param1 < 0) {
          return 0;
        }
        if (param2 < 0) {
          return 0;
        }
        if (this.field_g.length <= param2) {
          return 0;
        }
        if (this.field_g[0].length <= param1) {
          return 0;
        }
        return this.field_g[param2][param1];
    }

    fc(int[][] param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8) {
        int fieldTemp$0 = 0;
        try {
          this.field_j = param2;
          fieldTemp$0 = eh.field_b;
          eh.field_b = eh.field_b + 1;
          this.field_i = fieldTemp$0;
          this.field_l = param1;
          this.field_b = param4;
          this.field_g = param0;
          this.field_f = new int[param0.length][param0[0].length];
          this.field_k = new int[param0.length][param0[0].length];
          this.field_h = new int[param0.length][param0[0].length];
          this.a((byte) 121);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "fc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_m = da.a(8);
    }
}

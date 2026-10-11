/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends anb implements ntb, utb {
    private int[] field_x;
    private int field_P;
    private int field_G;
    private boolean field_y;
    private int field_A;
    private boolean field_R;
    private qua field_L;
    private boa field_S;
    private int field_N;
    static int field_H;
    private int field_u;
    static int field_E;
    private int field_M;
    private int field_v;
    boolean field_T;
    private int field_Q;
    private boolean field_K;
    private int field_F;
    boolean field_D;
    private int field_I;
    private int[] field_J;
    private int field_C;
    private boolean field_O;
    boolean field_w;
    private aoa field_z;

    final void g(int param0, int param1) {
        int var3 = -108 % ((param1 - 35) / 49);
        this.field_Q = param0;
    }

    public final void a(faa param0, int param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          super.a(param0, 32);
          this.field_Q = param0.i(0, 32);
          this.field_N = param0.i(param1 ^ 32, 32);
          this.field_u = param0.i(param1 - 32, 32);
          if (!kv.a(false, param0)) {
            this.field_z = null;
          } else {
            if (this.field_z == null) {
              this.field_z = new aoa();
            }
            this.field_z.a(param0, false);
          }
          this.field_P = param0.i(0, 32);
          this.field_I = param0.i(0, 32);
          this.field_C = param0.i(0, 32);
          this.field_G = param0.i(0, 32);
          this.field_y = kv.a(false, param0);
          this.field_K = kv.a(false, param0);
          this.field_O = kv.a(false, param0);
          this.field_M = param0.i(0, param1);
          this.field_T = kv.a(false, param0);
          this.field_w = kv.a(false, param0);
          this.field_R = kv.a(false, param0);
          this.field_v = param0.i(0, 32);
          this.field_J = wkb.a((byte) 37, this.field_J, param0, 4);
          if (!kv.a(false, param0)) {
            this.field_S = null;
          } else {
            if (this.field_S == null) {
              this.field_S = new boa();
            }
            this.field_S.a(param0, false);
          }
          this.field_F = param0.i(0, 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("sg.L(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean q(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -6) {
          this.field_x = (int[]) null;
        }
        stackIn_6_0 = (this.field_y) && (oq.field_I == this.field_G);
        return stackIn_6_0;
    }

    final void a(byte param0, boa param1) {
        try {
          int var3_int = -32 % ((-79 - param0) / 42);
          this.field_S = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "sg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int w(int param0) {
        if (param0 <= 36) {
          this.field_x = (int[]) null;
        }
        return this.field_G;
    }

    final boolean s(int param0) {
        aoa var3;
        boolean stackIn_7_0 = false;
        if (param0 < 31) {
          var3 = (aoa) null;
          this.a((aoa) null, -101);
        }
        stackIn_7_0 = (1 == vqa.field_k) || !(this.g(false));
        return stackIn_7_0;
    }

    final void a(int[] param0, int param1) {
        if (param1 >= -7) {
          return;
        }
        try {
          this.field_x = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "sg.BC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(qua param0, int param1) {
        try {
          this.field_L = param0;
          if (param1 != 3) {
            this.o((byte) -104);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "sg.ID(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean j(byte param0) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = 76 / ((param0 - 49) / 42);
        stackIn_4_0 = (this.field_z == null) && (this.field_F < oq.field_A);
        return stackIn_4_0;
    }

    final boolean n(int param0) {
        if (param0 != 31390) {
          this.A(125);
        }
        return this.field_R;
    }

    final int d(int param0) {
        if (param0 < 42) {
          field_H = -63;
          return 1;
        }
        return 1;
    }

    final void e(byte param0) {
        super.e(param0);
        this.field_C = jo.field_e + this.field_k.a(0);
    }

    final boolean r(byte param0) {
        if (param0 >= -83) {
          return false;
        }
        return this.field_K;
    }

    final boolean s(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -90) {
          this.r((byte) -68);
        }
        stackIn_6_0 = (this.field_P <= 0) && (this.field_I > 0);
        return stackIn_6_0;
    }

    final void m(int param0) {
        if (param0 != -13539) {
          return;
        }
        if (this.field_v > 0) {
        } else {
          this.field_R = !this.field_R ? true : false;
          this.field_v = pca.field_i[3].d((byte) 64);
          this.d((byte) 39);
          if (!this.field_R) {
            qba.a(20382, this.d(false), 25, this.g((byte) -3), 50);
          } else {
            qba.a(20382, this.d(false), 26, this.g((byte) -71), 50);
          }
        }
    }

    private final void B(int param0) {
        this.field_J = null;
        if (param0 >= -127) {
          this.field_S = (boa) null;
        }
    }

    final void a(boolean param0, pe param1) {
        try {
          if (!param0) {
            tv var4 = (tv) null;
            this.a((byte) 18, (tv) null);
          }
          this.field_z.a(this, (byte) -73, param1);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "sg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, int param1) {
        if (0 <= this.field_Q &&
          !fwa.a(param0, 1, this.field_J)) {
          this.field_J = qi.a(param0, true, this.field_J, (byte) -14);
        }
        if (param1 != 19581) {
          this.field_M = 18;
        }
    }

    final boolean b(int param0, byte param1) {
        int var3 = -67 % ((param1 + 53) / 48);
        return (this.field_A & param0) != 0 ? true : false;
    }

    final int y(int param0) {
        if (param0 != 8) {
          this.field_z = (aoa) null;
        }
        return -oq.field_e + this.field_M;
    }

    final int q(byte param0) {
        if (param0 <= 63) {
          this.u(39);
        }
        return this.field_N;
    }

    final boa n(byte param0) {
        if (param0 != 28) {
          this.l(45);
        }
        return this.field_S;
    }

    final void a(ij param0, int param1, boolean param2, boolean param3) {
        try {
          if (param1 != 9) {
            qua var6 = (qua) null;
            this.a((qua) null, 93);
          }
          if (1 == era.field_p) {
            param0.b(param1 ^ -10265, new ihb(4, this.field_y ? 2 : 0));
          } else {
            param0.b(param1 - 10267, new ihb(4, this.field_G));
          }
          if (!param2 &&
            !param3) {
            if (!this.field_O) {
              param0.b(param1 ^ -10265, new ihb(8, 0));
            }
            if (this.field_K) {
              param0.b(-10258, new ihb(9, this.field_M));
            }
          }
          this.field_k.a(param0, this, 0);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "sg.LC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int c(int param0, byte param1) {
        int var3 = this.field_k.g(param0, param1 + 5);
        if (param1 != -2) {
          pe var4 = (pe) null;
          this.a(false, (pe) null);
        }
        if (var3 > 0) {
          this.B(-128);
        }
        return var3;
    }

    final void r(int param0) {
        this.field_F = oq.field_A;
        if (param0 != -2) {
          int[] var3 = (int[]) null;
          this.a((int[]) null, 59);
        }
    }

    final void a(boolean param0, lta param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          var4_int = this.t(0);
          var5 = (int)((float)tu.field_d * param1.field_a);
          if (var5 < 8) {
            var5 = 8;
          }
          var6 = (int)((float)lua.field_d * param1.field_a);
          if (1 > var6) {
            var6 = 1;
          }
          if (param2 != 32) {
            this.field_D = false;
          }
          var7 = (this.f((byte) -23)[0] + this.f((byte) -46)[1]) / 2;
          var8 = param1.a(var7, (byte) 117) - var5 / 2;
          var9 = param1.b(true, this.f((byte) -94)[2]) - 4 * var6;
          nhb.a(qpb.a(false, this.field_N, param2 ^ 13894111), var4_int, var9, var6, param0, var5, var8, 2);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "sg.NC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_1 = 0;
        boolean stackIn_30_0 = false;
        int stackIn_31_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        boolean stackIn_43_0 = false;
        int stackIn_44_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_1 = 0;
        boolean stackIn_61_0 = false;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        sg var5 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = -46 % ((param0 - 22) / 59);
          var5 = (sg) (param1);
          if (!super.a((byte) -43, param1) &&
            var5.field_Q == this.field_Q &&
            this.field_N == var5.field_N &&
            this.field_u == var5.field_u) {
            stackIn_7_0 = (null != var5.field_z) ? 0 : 1;
            if (this.field_z != null) {
              stackIn_10_1 = 0;
            } else {
              stackIn_10_1 = 1;
            }
            if ((stackIn_7_0 ^ stackIn_10_1) == 0 && (null == this.field_z ||
              !this.field_z.a((byte) -43, var5.field_z)) && (this.field_P == var5.field_P &&
              this.field_I == var5.field_I &&
              var5.field_G == this.field_G)) {
              stackIn_20_0 = (this.field_y) ? 0 : 1;
              if (stackIn_20_0 != (var5.field_y ? 1 : 0)) {
                stackIn_24_0 = (this.field_K) ? 0 : 1;
                if (var5.field_K) {
                  stackIn_27_1 = 0;
                } else {
                  stackIn_27_1 = 1;
                }
                if (stackIn_24_0 == stackIn_27_1) {
                  stackIn_30_0 = this.field_O;
                  if (var5.field_O) {
                    stackIn_31_1 = 0;
                  } else {
                    stackIn_31_1 = 1;
                  }
                  if ((stackIn_30_0 ? 1 : 0) != stackIn_31_1 &&
                    var5.field_M == this.field_M) {
                    stackIn_36_0 = (var5.field_T) ? 0 : 1;
                    if (stackIn_36_0 != (this.field_T ? 1 : 0)) {
                      stackIn_40_0 = (this.field_w) ? 0 : 1;
                      if (stackIn_40_0 != (var5.field_w ? 1 : 0)) {
                        stackIn_43_0 = this.field_R;
                        if (var5.field_R) {
                          stackIn_44_1 = 0;
                        } else {
                          stackIn_44_1 = 1;
                        }
                        if ((stackIn_43_0 ? 1 : 0) != stackIn_44_1 &&
                          this.field_v == var5.field_v &&
                          !wpb.a(var5.field_J, this.field_J, (byte) 28)) {
                          stackIn_50_0 = (var5.field_S != null) ? 0 : 1;
                          if (this.field_S != null) {
                            stackIn_53_1 = 0;
                          } else {
                            stackIn_53_1 = 1;
                          }
                          if ((stackIn_50_0 ^ stackIn_53_1) == 0 && (null == this.field_S ||
                            !this.field_S.a((byte) -92, var5.field_S)) && var5.field_F == this.field_F) {
                            stackIn_61_0 = false;
                            decompiledFrameRemainder0 = false;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_61_0 = true;
          }
          return stackIn_61_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_64_0 = var3;
          stackIn_64_1 = new StringBuilder().append("sg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(')').toString());
        }
    }

    final int x(int param0) {
        int var2 = 10 / ((-20 - param0) / 55);
        return this.field_u;
    }

    final qua p(byte param0) {
        if (param0 != 49) {
          this.t(-25);
        }
        return this.field_L;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          super.a(param0, false);
          this.field_Q = param0.i(0, 32);
          this.field_N = param0.i(0, 32);
          this.field_u = param0.i(0, 32);
          if (!kv.a(false, param0)) {
            this.field_z = null;
          } else {
            if (null == this.field_z) {
              this.field_z = new aoa();
            }
            this.field_z.a(param0, false);
          }
          this.field_P = param0.i(0, 32);
          this.field_I = param0.i(0, 32);
          this.field_G = param0.i(0, 32);
          this.field_y = kv.a(param1, param0);
          this.field_K = kv.a(false, param0);
          this.field_O = kv.a(param1, param0);
          this.field_M = param0.i(0, 32);
          this.field_T = kv.a(false, param0);
          this.field_w = kv.a(false, param0);
          this.field_R = kv.a(false, param0);
          this.field_v = param0.i(0, 32);
          this.field_J = wkb.a((byte) 37, this.field_J, param0, 4);
          if (!kv.a(false, param0)) {
            this.field_S = null;
          } else {
            if (this.field_S == null) {
              this.field_S = new boa();
            }
            this.field_S.a(param0, false);
          }
          this.field_F = param0.i(0, 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("sg.H(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final int o(byte param0) {
        if (param0 != -117) {
          field_H = -115;
        }
        return this.field_Q;
    }

    final boolean a(pe param0, int param1, int param2, int param3) {
        int var11 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ml var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ml[] var17 = null;
        ml[] var18 = null;
        int var8Lifetime1;
        int var14Lifetime1;
        var16 = VoidHunters.field_G;
        try {
          if (!this.d(4, 67)) {
            return true;
          }
          this.field_k.i(param3 + 110);
          this.a(param0, true, (byte) 67, true);
          if (!this.q(-107)) {
            return false;
          }
          if (param3 != 0) {
            this.n(-12);
          }
          var17 = this.field_k.a((byte) 101, param1, nw.field_o, (ml[]) null, param2);
          var18 = var17;
          var5 = var18;
          var6 = 1;
          if (var5 != null &&
            var17.length > 0) {
            var7 = -1;
            for (var8 = 0; var17.length > var8; var8++) {
              if (var17[var8] != this.field_k) {
                continue;
              }
              var7 = var8;
              break;
            }
            var8Lifetime1 = wda.field_p / var18.length;
            var9 = 0;
            var10 = 0;
            for (var11 = 0; var11 < var18.length; var11++) {
              var12 = var18[var11];
              var13 = var8Lifetime1 + var9;
              if (var11 != var7) {
                var9 = var12.a(true, false, var13);
              } else {
                var14 = var8Lifetime1 / 4;
                var9 = var13 - var14 + var12.a(true, false, var14);
              }
              var14Lifetime1 = -var9 + var13;
              if (var14Lifetime1 > 0) {
                var15 = var14Lifetime1 / 32;
                if (0 == var15) {
                  var15 = 1;
                }
                param0.a(5, var12.field_n, var12.field_r, 1000, 11184895, var15, 5);
                var10 = 1;
              }
            }
            if (var10 != 0) {
              rmb.a(param2, this.field_l, 73, 102, param1);
              var6 = 0;
            }
            if (var10 != 0 &&
              0 == kdb.field_o % 80) {
              qba.a(20382, param1, 19, param2, 20);
            }
          }
          if (var6 != 0) {
            stackIn_38_0 = param2;
            stackIn_38_1 = this.field_l;
            rmb.a(stackIn_38_0, stackIn_38_1, 72, -72, param1);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_43_0 = var5_ref;
          stackIn_43_1 = new StringBuilder().append("sg.HC(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(pe param0, boolean param1, byte param2, boolean param3) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_P <= 0) {
            this.field_I = this.field_I + 1;
          }
          this.field_F = this.field_F + 1;
          if (this.field_D) {
            this.field_D = false;
          }
          if (vdb.field_d <= this.field_I) {
            this.field_I = 0;
            this.field_P = this.f(true);
          }
          if (this.field_P > 0) {
            this.field_P = this.field_P + sja.field_b;
            if (this.field_P > this.f(true)) {
              this.field_P = this.f(true);
            }
          }
          if (this.field_O &&
            0 < this.field_M) {
            this.field_M = this.field_M - 1;
          }
          if (era.field_p != 1) {
            if (this.field_G > 0) {
              this.field_G = this.field_G - 1;
            }
          } else {
            if (this.field_y &&
              this.field_G < oq.field_I) {
              this.field_G = this.field_G + 1;
            }
            if (!this.field_y &&
              this.field_G > 0) {
              this.field_G = this.field_G - 1;
            }
          }
          if (this.field_O &&
            this.field_M <= oq.field_e) {
            this.field_k.a(400, param2 - 20, param0, (anb) (this));
          }
          if (this.field_v > 0) {
            this.field_v = this.field_v - 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("sg.SA(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        sg var6 = null;
        sg var7 = null;
        var4 = VoidHunters.field_G;
        try {
          var6 = (sg) (param1);
          var7 = var6;
          super.b((byte) 89, param1);
          var6.field_Q = this.field_Q;
          var6.field_N = this.field_N;
          var6.field_u = this.field_u;
          if (this.field_z != null) {
            if (null == var7.field_z) {
              var7.field_z = new aoa();
            }
            this.field_z.b((byte) 103, var7.field_z);
          } else {
            var6.field_z = null;
          }
          var7.field_v = this.field_v;
          var7.field_R = this.field_R;
          var7.field_y = this.field_y;
          var7.field_M = this.field_M;
          var7.field_O = this.field_O;
          var7.field_T = this.field_T;
          var7.field_C = this.field_C;
          var7.field_P = this.field_P;
          var7.field_I = this.field_I;
          var7.field_G = this.field_G;
          var7.field_K = this.field_K;
          var7.field_w = this.field_w;
          if (param0 <= 54) {
            var5 = (faa) null;
            this.b((faa) null, -85);
          }
          var7.field_J = dob.a(var7.field_J, (byte) -102, this.field_J);
          if (this.field_S != null) {
            if (null == var7.field_S) {
              var7.field_S = new boa();
            }
            this.field_S.b((byte) 89, var7.field_S);
          } else {
            var7.field_S = null;
          }
          var7.field_F = this.field_F;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("sg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void f(int param0, int param1) {
        this.field_A = this.field_A | param1;
        if (param0 != 0) {
          this.l((byte) -73);
        }
    }

    final void a(aoa param0, int param1) {
        try {
          if (param1 != 4) {
            this.w(105);
          }
          this.field_z = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "sg.MC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int t(int param0) {
        int[] var5 = new int[2];
        int[] var2 = var5;
        this.field_k.a(var5, (byte) -17, true);
        int var3 = var5[0] * 256 / var5[1];
        var5[1] = param0;
        var5[0] = 0;
        this.field_k.a(var5, (byte) -17, false);
        int var4 = 256 * var5[0] / var5[1];
        if (var4 < var3) {
          var3 = var4;
        }
        return var3;
    }

    public final void b(faa param0, int param1) {
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        int stackIn_9_0 = 0;
        int stackIn_10_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean stackIn_13_2 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.b(param0, -118);
          param0.a(-632, this.field_Q, 32);
          if (param1 >= -109) {
            this.s((byte) -86);
          }
          param0.a(-632, this.field_N, 32);
          param0.a(-632, this.field_u, 32);
          stackIn_4_0 = (faa) (param0);
          stackIn_4_1 = -76;
          stackIn_5_2 = (this.field_z != null);
          if (vq.a(stackIn_4_0, stackIn_4_1, stackIn_5_2)) {
            this.field_z.b(param0, -113);
          }
          param0.a(-632, this.field_P, 32);
          param0.a(-632, this.field_I, 32);
          param0.a(-632, this.field_G, 32);
          vq.a(param0, 81, this.field_y);
          vq.a(param0, 47, this.field_K);
          vq.a(param0, 82, this.field_O);
          param0.a(-632, this.field_M, 32);
          vq.a(param0, 70, this.field_T);
          vq.a(param0, -121, this.field_w);
          vq.a(param0, 104, this.field_R);
          param0.a(-632, this.field_v, 32);
          stackIn_9_0 = 4;
          if (this.field_J != null) {
            stackIn_10_1 = this.field_J.length;
          } else {
            stackIn_10_1 = 0;
          }
          pgb.a(stackIn_9_0, stackIn_10_1, -125, param0, this.field_J);
          stackIn_12_0 = (faa) (param0);
          stackIn_12_1 = 78;
          stackIn_13_2 = (null != this.field_S);
          if (vq.a(stackIn_12_0, stackIn_12_1, stackIn_13_2)) {
            this.field_S.b(param0, -116);
          }
          param0.a(-632, this.field_F, 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("sg.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean d(int param0, int param1) {
        tv var4;
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        if (param1 <= 38) {
          var4 = (tv) null;
          this.b((byte) -22, (tv) null);
        }
        if (param0 != 4) {
          if (param0 != 9) {
            return false;
          }
          return this.field_O;
        }
        if (era.field_p != 1) {
          stackIn_7_0 = !(this.field_G <= pca.field_i[4].d((byte) 64));
          return stackIn_7_0;
        }
        stackIn_13_0 = (this.field_y) || !(this.field_G <= 0);
        return stackIn_13_0;
    }

    final void z(int param0) {
        if (param0 < 77) {
          faa var3 = (faa) null;
          this.b((faa) null, -12);
        }
        this.field_A = 0;
    }

    final int l(int param0) {
        if (param0 != -465) {
          this.field_P = -114;
        }
        return this.field_v;
    }

    final int[] p(int param0) {
        if (param0 != -26448) {
          return (int[]) null;
        }
        return this.field_J;
    }

    final void a(int param0, byte param1) {
        this.field_u = param0;
        if (param1 > -48) {
          field_E = 125;
        }
    }

    final void h(int param0, int param1) {
        if (param0 != 17704) {
          this.k((byte) -15);
        }
        this.field_N = param1;
    }

    final boolean v(int param0) {
        if (param0 != 32) {
          return false;
        }
        return this.field_y;
    }

    final int[] A(int param0) {
        if (param0 < 21) {
          this.y(-71);
        }
        return this.field_x;
    }

    final boolean a(byte param0, int param1) {
        if (param0 != 11) {
          return false;
        }
        if (this.field_P > 0) {
          this.field_P = this.field_P - param1;
          this.d((byte) -126);
          return true;
        }
        return false;
    }

    final void u(int param0) {
        this.field_k.f(14546);
        if (era.field_p == 1) {
          this.field_G = 0;
          this.field_y = false;
        }
        int var2 = 90 / ((72 - param0) / 44);
    }

    public final void a(faa param0, byte param1) {
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_3_2 = false;
        int stackIn_8_0 = 0;
        int stackIn_9_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean stackIn_14_2 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, (byte) -107);
          param0.a(-632, this.field_Q, 32);
          param0.a(-632, this.field_N, 32);
          param0.a(-632, this.field_u, 32);
          stackIn_2_0 = (faa) (param0);
          stackIn_2_1 = -128;
          stackIn_3_2 = (null != this.field_z);
          if (vq.a(stackIn_2_0, stackIn_2_1, stackIn_3_2)) {
            this.field_z.b(param0, -116);
          }
          param0.a(-632, this.field_P, 32);
          param0.a(-632, this.field_I, 32);
          param0.a(-632, this.field_C, 32);
          param0.a(-632, this.field_G, 32);
          vq.a(param0, -73, this.field_y);
          vq.a(param0, 90, this.field_K);
          vq.a(param0, 113, this.field_O);
          param0.a(-632, this.field_M, 32);
          vq.a(param0, -92, this.field_T);
          vq.a(param0, 107, this.field_w);
          vq.a(param0, -102, this.field_R);
          param0.a(-632, this.field_v, 32);
          stackIn_8_0 = 4;
          if (this.field_J == null) {
            stackIn_9_1 = 0;
          } else {
            stackIn_9_1 = this.field_J.length;
          }
          pgb.a(stackIn_8_0, stackIn_9_1, -90, param0, this.field_J);
          if (param1 > -91) {
            this.s(57);
          }
          stackIn_13_0 = (faa) (param0);
          stackIn_13_1 = 101;
          stackIn_14_2 = (null != this.field_S);
          if (vq.a(stackIn_13_0, stackIn_13_1, stackIn_14_2)) {
            this.field_S.b(param0, -118);
          }
          param0.a(-632, this.field_F, 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("sg.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final void t(byte param0) {
        int var2 = this.a((byte) 11, fna.field_p * (-fra.field_a + 1)) ? 1 : 0;
        int var3 = 85 % ((47 - param0) / 51);
        if (var2 == 0) {
          this.field_R = false;
          this.d((byte) 124);
          return;
        }
    }

    final int m(byte param0) {
        if (param0 != -64) {
          return 120;
        }
        return this.field_I * 255 / Math.max(vdb.field_d, 1);
    }

    final int o(int param0) {
        int var2 = -44 / ((param0 - 33) / 44);
        return 255 * this.field_P / Math.max(this.f(true), 1);
    }

    final void e(int param0, int param1) {
        if (!this.s((byte) -90) &&
          this.field_P > 0) {
          this.field_P = this.field_P + param1;
          if (!(this.field_P <= this.f(true))) {
            this.field_P = this.f(true);
          }
        }
        if (param0 != -1) {
          this.field_M = 49;
        }
    }

    final void a(lta param0, int param1, pe param2) {
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = VoidHunters.field_G;
        try {
          var4_int = qpb.a(false, this.field_N, 13894143);
          if (this.j((byte) 108)) {
            var5 = this.b(true);
            if (var5 > 0) {
              var5 = oq.field_A * var5 / (1 + this.field_F);
              var6 = 256;
              for (var7 = 0; var7 < 5; var7++) {
                var8 = this.field_F * ((var7 << 4) + var6);
                var9 = this.field_d + (fc.a(var8, (byte) 74) >> 8) * (var5 >> 8);
                var10 = this.field_e + (eu.a(var8, 77) >> 8) * (var5 >> 8);
                var11 = this.field_d + (fc.a(var8 + var6, (byte) -73) >> 8) * (var5 >> 8);
                var12 = this.field_e + (var5 >> 8) * (eu.a(var6 + var8, 56) >> 8);
                c.a(param0.b(true, var12), param0.a(var11, (byte) 122), param0.a(var9, (byte) 116), param0.b(true, var10), -16777216, var4_int);
              }
            }
            if ((this.field_F & 8) != 0) {
              var4_int = var4_int ^ 4473924;
            }
          }
          super.a(param0, var4_int, param2, 16);
          if (param1 < 119) {
            this.field_z = (aoa) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("sg.P(");
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
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final aoa k(byte param0) {
        if (param0 != -108) {
          this.q((byte) -110);
        }
        return this.field_z;
    }

    final boolean l(byte param0) {
        if (param0 != -10) {
          this.q((byte) 25);
        }
        return null != this.field_z ? true : false;
    }

    final void a(int param0, int param1, pe param2, int param3, int param4) {
        boolean stackIn_6_1 = false;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        uj var7 = null;
        uj var8 = null;
        uj var8Lifetime1;
        uj var8Lifetime2;
        try {
          super.a(-53, param1, param2, param3, param4);
          if (param1 == 4) {
            if (era.field_p != 1) {
              if (this.field_G <= 0) {
                var7 = pca.field_i[4];
                var8 = var7;
                var8Lifetime2 = var7;
                this.field_G = var7.d((byte) 64) + var7.b(-25131);
              }
            } else {
              stackIn_6_1 = !(this.field_y);
              this.field_y = stackIn_6_1;
              this.field_u = -1;
            }
          }
          if (param1 == 8 &&
            !this.field_O) {
            stackIn_15_1 = !(this.field_K);
            this.field_K = stackIn_15_1;
          }
          if (param1 == 9 &&
            this.field_K &&
            !this.field_O) {
            this.field_O = true;
            var8Lifetime1 = pca.field_i[9];
            this.field_M = var8Lifetime1.d((byte) 64) + var8Lifetime1.b(-25131);
          }
          if (param0 > -36) {
            this.field_G = -108;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_27_0 = var6;
          stackIn_27_1 = new StringBuilder().append("sg.WA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean g(boolean param0) {
        if (param0) {
          this.r((byte) -85);
        }
        return this.field_k.field_j == 0 ? true : false;
    }

    final int f(boolean param0) {
        if (!param0) {
          return 10;
        }
        return this.field_C;
    }

    final void C(int param0) {
        this.field_F = 0;
        this.field_D = true;
        if (param0 != 32) {
          faa var3 = (faa) null;
          this.a((faa) null, true);
        }
    }

    public final void a(tv param0, int param1) {
        int stackIn_19_0 = 0;
        int stackIn_22_1 = 0;
        boolean stackIn_40_0 = false;
        int stackIn_41_1 = 0;
        boolean stackIn_45_0 = false;
        int stackIn_46_1 = 0;
        boolean stackIn_50_0 = false;
        int stackIn_51_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_87_1 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        sg var5 = null;
        try {
          super.a(param0, -85);
          var5 = (sg) (param0);
          if (null != this.field_z &&
            null != var5.field_z) {
            this.field_z.a(var5.field_z, -49);
          }
          if (this.field_S != null &&
            null != var5.field_S) {
            this.field_S.a(var5.field_S, -54);
          }
          var4 = 0;
          if (this.field_Q != var5.field_Q) {
            var4 = 1;
            System.out.println("int owner has changed. before=" + var5.field_Q + ", now=" + this.field_Q);
          }
          if (this.field_N != var5.field_N) {
            System.out.println("int team has changed. before=" + var5.field_N + ", now=" + this.field_N);
            var4 = 1;
          }
          if (var5.field_u != this.field_u) {
            System.out.println("int dragging has changed. before=" + var5.field_u + ", now=" + this.field_u);
            var4 = 1;
          }
          stackIn_19_0 = (null != this.field_z) ? 0 : 1;
          if (null != var5.field_z) {
            stackIn_22_1 = 0;
          } else {
            stackIn_22_1 = 1;
          }
          if ((stackIn_19_0 ^ stackIn_22_1) != 0 ||
            this.field_z != null &&
            this.field_z.a((byte) 89, var5.field_z)) {
            var4 = 1;
            System.out.println("ShipAI ai has changed. before=" + var5.field_z + ", now=" + this.field_z);
          }
          if (var5.field_P != this.field_P) {
            System.out.println("int energy has changed. before=" + var5.field_P + ", now=" + this.field_P);
            var4 = 1;
          }
          if (var5.field_I != this.field_I) {
            System.out.println("int reloadtimer has changed. before=" + var5.field_I + ", now=" + this.field_I);
            var4 = 1;
          }
          if (this.field_C != var5.field_C) {
            var4 = 1;
            System.out.println("int max_energy has changed. before=" + var5.field_C + ", now=" + this.field_C);
          }
          if (this.field_G != var5.field_G) {
            var4 = 1;
            System.out.println("int repair_mode_reload has changed. before=" + var5.field_G + ", now=" + this.field_G);
          }
          stackIn_40_0 = this.field_y;
          if (var5.field_y) {
            stackIn_41_1 = 0;
          } else {
            stackIn_41_1 = 1;
          }
          if ((stackIn_40_0 ? 1 : 0) == stackIn_41_1) {
            System.out.println("boolean repair_mode_on has changed. before=" + var5.field_y + ", now=" + this.field_y);
            var4 = 1;
          }
          stackIn_45_0 = var5.field_K;
          if (this.field_K) {
            stackIn_46_1 = 0;
          } else {
            stackIn_46_1 = 1;
          }
          if ((stackIn_45_0 ? 1 : 0) == stackIn_46_1) {
            var4 = 1;
            System.out.println("boolean self_destruct_prepared has changed. before=" + var5.field_K + ", now=" + this.field_K);
          }
          stackIn_50_0 = this.field_O;
          if (var5.field_O) {
            stackIn_51_1 = 0;
          } else {
            stackIn_51_1 = 1;
          }
          if ((stackIn_50_0 ? 1 : 0) == stackIn_51_1) {
            System.out.println("boolean self_destruct_activated has changed. before=" + var5.field_O + ", now=" + this.field_O);
            var4 = 1;
          }
          if (var5.field_M != this.field_M) {
            System.out.println("int self_destruct_countdown has changed. before=" + var5.field_M + ", now=" + this.field_M);
            var4 = 1;
          }
          if (param1 >= -19) {
            this.field_A = 114;
          }
          stackIn_62_0 = (var5.field_T) ? 0 : 1;
          if (stackIn_62_0 == (this.field_T ? 1 : 0)) {
            var4 = 1;
            System.out.println("boolean salvo_just_fired has changed. before=" + var5.field_T + ", now=" + this.field_T);
          }
          if (var5.field_w != this.field_w) {
            var4 = 1;
            System.out.println("boolean just_attached_something has changed. before=" + var5.field_w + ", now=" + this.field_w);
          }
          stackIn_70_0 = (this.field_R) ? 0 : 1;
          if (var5.field_R) {
            stackIn_73_1 = 0;
          } else {
            stackIn_73_1 = 1;
          }
          if (stackIn_70_0 != stackIn_73_1) {
            System.out.println("boolean shields_on has changed. before=" + var5.field_R + ", now=" + this.field_R);
            var4 = 1;
          }
          if (this.field_v != var5.field_v) {
            var4 = 1;
            System.out.println("int shields_toggle_cooldown has changed. before=" + var5.field_v + ", now=" + this.field_v);
          }
          if (ikb.a(this.field_J, var5.field_J, false)) {
            var4 = 1;
            System.out.println("int[] last_attackers has changed. ");
          }
          stackIn_84_0 = (this.field_S != null) ? 0 : 1;
          if (var5.field_S != null) {
            stackIn_87_1 = 0;
          } else {
            stackIn_87_1 = 1;
          }
          if ((stackIn_84_0 ^ stackIn_87_1) != 0 ||
            null != this.field_S &&
            this.field_S.a((byte) -92, var5.field_S)) {
            var4 = 1;
            System.out.println("ShipBlueprint target_blueprint has changed. before=" + var5.field_S + ", now=" + this.field_S);
          }
          if (this.field_F != var5.field_F) {
            System.out.println("int spawn_timer has changed. before=" + var5.field_F + ", now=" + this.field_F);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of Ship has changed, where owner=" + this.field_Q);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_100_0 = var3;
          stackIn_100_1 = new StringBuilder().append("sg.F(");
          if (param0 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param1).append(')').toString());
        }
    }

    public sg() {
        this.field_u = -1;
        this.field_P = jo.field_e;
        this.field_z = null;
        this.field_N = 0;
        this.field_Q = -1;
        this.field_x = null;
        this.field_L = null;
    }

    static {
    }
}

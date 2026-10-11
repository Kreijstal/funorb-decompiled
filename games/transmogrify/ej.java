/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends ag {
    static boolean field_n;
    static boolean field_k;
    static vg[] field_l;
    static String field_p;
    qj field_q;
    private lc field_o;
    jc field_m;

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        kc var6 = null;
        int var7 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          this.field_m.b(param0, param1, param2);
          var6 = (kc) (this.field_q.a((byte) -95));
          while (null != var6) {
            if (var7 != 0) {
              return;
            }
            stackIn_6_0 = this.field_o.a(7, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_6_0) {
              var5 = param2;
              var4_int = param1;
              while (var6.field_r < var5) {
                this.a(var4_int + var5, param0, 0, var6, var4_int, var6.field_r);
                var4_int = var4_int + var6.field_r;
                var5 = var5 - var6.field_r;
                stackIn_6_0 = this.field_o.a((byte) 126, var4_int, var5, param0, var6);
                if (stackIn_6_0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var4_int + var5, param0, 0, var6, var4_int, var5);
                var6.field_r = var6.field_r - var5;
              }
            }
            var6 = (kc) (this.field_q.a(true));
            continue;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("ej.K(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int b() {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = 0;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "ej.H()");
        }
    }

    final static ii[] a(byte param0, ci param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ii[] stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -43) {
            field_k = false;
          }
          var4_int = param1.b(param0 + 108, param3);
          var5 = param1.a(-1, param2, var4_int);
          stackIn_4_0 = hj.a(param1, (byte) -62, var5, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ej.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final ag a() {
        kc var1 = null;
        Object stackIn_4_0 = null;
        bb stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        try {
          do {
            var1 = (kc) (this.field_q.a(true));
            if (var1 == null) {
              stackIn_4_0 = null;
              return (ag) (stackIn_4_0);
            }
          } while (null == var1.field_y);
          stackIn_9_0 = var1.field_y;
          return (ag) ((Object) stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "ej.A()");
        }
    }

    final static int a(int param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            field_n = true;
          }
          stackIn_4_0 = bg.a(param1, true, param2, (byte) 126);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ej.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(int param0, kc param1, int param2) {
        lc stackIn_18_0 = null;
        boolean stackIn_18_1 = false;
        boolean stackIn_19_2 = false;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (param0 != (this.field_o.field_v[param1.field_u] & 4) &&
            param1.field_p < 0) {
            var4_int = this.field_o.field_D[param1.field_u] / qh.field_p;
            var5 = (-param1.field_n + (1048575 + var4_int)) / var4_int;
            param1.field_n = 1048575 & param1.field_n + var4_int * param2;
            if (var5 <= param2) {
              boolean decompiledSharedTail0 = (0 != this.field_o.field_P[param1.field_u]);
              if (!decompiledSharedTail0) {
                param1.field_y = bb.a(param1.field_t, param1.field_y.i(), param1.field_y.h(), param1.field_y.f());
                decompiledSharedTail0 = (Transmogrify.field_A);
              }
              if (decompiledSharedTail0) {
                param1.field_y = bb.a(param1.field_t, param1.field_y.i(), 0, param1.field_y.f());
                stackIn_18_0 = this.field_o;
                stackIn_18_1 = false;
                stackIn_19_2 = !(0 <= param1.field_h.field_k[param1.field_i]);
                ((lc) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_19_2, param1);
              }
              if (param1.field_h.field_k[param1.field_i] < 0) {
                param1.field_y.h(-1);
              }
              param2 = param1.field_n / var4_int;
            }
          }
          param1.field_y.d(param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("ej.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int[] param1, int param2, kc param3, int param4, int param5) {
        lc stackIn_23_0 = null;
        boolean stackIn_23_1 = false;
        boolean stackIn_24_2 = false;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bb var11 = null;
        int var12 = 0;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          if ((4 & this.field_o.field_v[param3.field_u]) != param2 &&
            param3.field_p < 0) {
            var7_int = this.field_o.field_D[param3.field_u] / qh.field_p;
            L2: while (true) {
              var8 = (1048575 + var7_int - param3.field_n) / var7_int;
              if (param5 < var8) {
                if (var12 == 0) {
                  break L2;
                }
              } else {
                param3.field_y.b(param1, param4, var8);
                param3.field_n = param3.field_n + (var7_int * var8 - 1048576);
                param4 = param4 + var8;
                param5 = param5 - var8;
              }
              var9 = qh.field_p / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param3.field_y;
              boolean decompiledSharedTail0 = (this.field_o.field_P[param3.field_u] != 0);
              if (!decompiledSharedTail0) {
                param3.field_y = bb.a(param3.field_t, var11.i(), var11.h(), var11.f());
                decompiledSharedTail0 = (var12 != 0);
              }
              if (decompiledSharedTail0) {
                param3.field_y = bb.a(param3.field_t, var11.i(), 0, var11.f());
                stackIn_23_0 = this.field_o;
                stackIn_23_1 = false;
                stackIn_24_2 = !(param3.field_h.field_k[param3.field_i] >= 0);
                ((lc) (Object) stackIn_23_0).a(stackIn_23_1, stackIn_24_2, param3);
                param3.field_y.a(var9, var11.h());
              }
              if (0 > param3.field_h.field_k[param3.field_i]) {
                param3.field_y.h(-1);
              }
              var11.f(var9);
              var11.b(param1, param4, -param4 + param0);
              if (var11.e()) {
                this.field_m.a(var11);
              }
              if (var12 == 0) {
                continue;
              }
              break;
            }
            param3.field_n = param3.field_n + var7_int * param5;
          }
          param3.field_y.b(param1, param4, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_38_0 = var7;
          stackIn_38_1 = new StringBuilder().append("ej.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_1_0 = param0 & param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var4), "ej.J(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        int var2_int = 0;
        kc var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          this.field_m.d(param0);
          var3 = (kc) (this.field_q.a((byte) -95));
          while (null != var3) {
            if (var4 != 0) {
              return;
            }
            stackIn_6_0 = this.field_o.a(7, var3);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_6_0 ||
              var4 != 0) {
              var2_int = param0;
              while (var2_int > var3.field_r) {
                this.a(0, var3, var3.field_r);
                var2_int = var2_int - var3.field_r;
                stackIn_6_0 = this.field_o.a((byte) 123, 0, var2_int, (int[]) null, var3);
                if (stackIn_6_0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(0, var3, var2_int);
                var3.field_r = var3.field_r - var2_int;
              }
            }
            var3 = (kc) (this.field_q.a(true));
            continue;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "ej.G(" + param0 + ')');
        }
    }

    public static void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_p = null;
          if (param0) {
            field_k = false;
          }
          field_l = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "ej.L(" + param0 + ')');
        }
    }

    final static boolean a(wl param0, String param1, String param2, boolean param3, boolean param4, String param5, int param6) {
        sf var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4) {
            ej.a((wl) null, (String) null, (String) null, false, true, (String) null, 27);
          }
          if (jh.field_n != rh.field_v) {
            return false;
          }
          var7 = new sf(ci.field_f, param0);
          ci.field_f.b((qg) (var7), (byte) -71);
          if (!oa.f((byte) 105)) {
            rh.field_v = of.field_d;
            q.field_h = null;
            c.field_d = param3;
            ab.field_j = param6;
            hf.field_g = param1;
            kk.field_g = param5;
            ta.field_h = param2;
            if (Transmogrify.field_A) {
              var7.u(-10);
            }
          } else {
            var7.u(-10);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_19_0 = var7_ref;
          stackIn_19_1 = new StringBuilder().append("ej.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, e param2, boolean param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_36_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_57_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_48_0Lifetime1;
        int stackIn_48_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Transmogrify.field_A ? 1 : 0;
        try {
          var5_int = qg.a((byte) 108, (param0 - param4) * 3);
          var6 = param4 * 3;
          vf.b(true);
          var7 = -10 + var5_int;
          if (param2.field_w > 0 &&
            null != param2.field_y) {
            di.c(-11517);
          }
          ug.field_h = 0;
          if (param1 > -122) {
            field_p = (String) null;
          }
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param2.field_C)))) {
            var9 = param2.field_o[var8];
            var10 = param2.field_s[var8];
            var11 = param2.field_G[var8];
            stackOut_12_0 = param3;
            stackIn_57_0 = stackOut_12_0 ? 1 : 0;
            stackIn_13_0 = stackOut_12_0;
            if (var19 == 0) {
              if (stackIn_13_0) {
                var12 = sg.field_a[var9];
                var13 = d.field_a[var9];
                var14 = -var12 + sg.field_a[var10];
                var15 = sg.field_a[var11] - var12;
                var16 = d.field_a[var10] - var13;
                var17 = d.field_a[var11] - var13;
              }
              if (!stackIn_13_0 ||
                !(-(var15 * var16) + var17 * var14 >= 0)) {
                var12Lifetime1 = nd.field_l[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = nd.field_l[var10];
                  if (-2147483648 != var13Lifetime1) {
                    var14 = nd.field_l[var11];
                    if (-2147483648 != var14) {
                      var15 = -var6 + (var13Lifetime1 + var12Lifetime1 + var14);
                      stackIn_36_0 = -1 + mh.field_b.length;
                      if (var7 >= 0) {
                        stackIn_37_1 = var15 >> var7;
                      } else {
                        stackIn_37_1 = var15 << -var7;
                      }
                      var16 = stackIn_36_0 - stackIn_37_1;
                      var17 = mh.field_b[var16];
                      while (true) {
                        if (0 != var17 >> 4) {
                          var16--;
                          stackIn_48_0 = 0;
                          stackIn_48_1 = var16;
                          if (stackIn_48_0 > stackIn_48_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = mh.field_b[var16];
                          continue;
                        }
                        stackIn_48_0Lifetime1 = var17;
                        stackIn_48_1Lifetime1 = var16 << 4;
                        var18 = stackIn_48_0Lifetime1 + stackIn_48_1Lifetime1;
                        i.field_b[var18] = var8;
                        mh.field_b[var16] = var17 + 1;
                        if (param2.field_w > 0 &&
                          param2.field_y != null) {
                          dupTemp$0 = param2.field_y[var8];
                          ca.field_c[dupTemp$0] = ca.field_c[dupTemp$0] + 1;
                        }
                        ug.field_h = ug.field_h + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_57_0 = -1;
          }
          if (stackIn_57_0 > ~param2.field_w &&
            null != param2.field_y) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= ca.field_c.length)) {
              var10Lifetime1 = ca.field_c[var9Lifetime1];
              ca.field_c[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_71_0 = var5;
          stackIn_71_1 = new StringBuilder().append("ej.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final ag d() {
        kc var1 = null;
        RuntimeException var1_ref = null;
        Object stackIn_2_0 = null;
        bb stackIn_7_0 = null;
        ag stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var1 = (kc) (this.field_q.a((byte) -95));
          if (var1 == null) {
            stackIn_2_0 = null;
            return (ag) (stackIn_2_0);
          }
          if (var1.field_y != null) {
            stackIn_7_0 = var1.field_y;
            return (ag) ((Object) stackIn_7_0);
          }
          stackIn_9_0 = this.a();
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "ej.E()");
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, pg param4, pg param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          cd.field_f = param5;
          ee.field_D = param3;
          if (param1 < 105) {
            ej.a((byte) 62, (ci) null, (String) null, (String) null);
          }
          vh.field_m = param0;
          jl.field_o = param2;
          gl.field_B = param4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ej.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    ej(lc param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_q = new qj();
        this.field_m = new jc();
        try {
          this.field_o = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ej.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_l = new vg[8];
        field_p = "Make your word here ... Make your word here ...";
        field_n = false;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$ff69b800fca9(int param0, int param1, e param2, boolean param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_36_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_57_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_48_0Lifetime1;
        int stackIn_48_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Transmogrify.field_A ? 1 : 0;
        try {
          var5_int = qg.a((byte) 108, (param0 - param4) * 3);
          var6 = param4 * 3;
          vf.b(true);
          var7 = -10 + var5_int;
          if (param2.field_w > 0 &&
            null != param2.field_y) {
            di.c(-11517);
          }
          ug.field_h = 0;
          if (param1 > -122) {
            field_p = (String) null;
          }
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param2.field_C)))) {
            var9 = param2.field_o[var8];
            var10 = param2.field_s[var8];
            var11 = param2.field_G[var8];
            stackOut_12_0 = param3;
            stackIn_57_0 = stackOut_12_0 ? 1 : 0;
            stackIn_13_0 = stackOut_12_0;
            if (var19 == 0) {
              if (stackIn_13_0) {
                var12 = sg.field_a[var9];
                var13 = d.field_a[var9];
                var14 = -var12 + sg.field_a[var10];
                var15 = sg.field_a[var11] - var12;
                var16 = d.field_a[var10] - var13;
                var17 = d.field_a[var11] - var13;
              }
              if (!stackIn_13_0 ||
                !(-(var15 * var16) + var17 * var14 >= 0)) {
                var12Lifetime1 = nd.field_l[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = nd.field_l[var10];
                  if (-2147483648 != var13Lifetime1) {
                    var14 = nd.field_l[var11];
                    if (-2147483648 != var14) {
                      var15 = -var6 + (var13Lifetime1 + var12Lifetime1 + var14);
                      stackIn_36_0 = -1 + mh.field_b.length;
                      if (var7 >= 0) {
                        stackIn_37_1 = var15 >> var7;
                      } else {
                        stackIn_37_1 = var15 << -var7;
                      }
                      var16 = stackIn_36_0 - stackIn_37_1;
                      var17 = mh.field_b[var16];
                      while (true) {
                        if (0 != var17 >> 4) {
                          var16--;
                          stackIn_48_0 = 0;
                          stackIn_48_1 = var16;
                          if (stackIn_48_0 > stackIn_48_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = mh.field_b[var16];
                          continue;
                        }
                        stackIn_48_0Lifetime1 = var17;
                        stackIn_48_1Lifetime1 = var16 << 4;
                        var18 = stackIn_48_0Lifetime1 + stackIn_48_1Lifetime1;
                        i.field_b[var18] = var8;
                        mh.field_b[var16] = var17 + 1;
                        if (param2.field_w > 0 &&
                          param2.field_y != null) {
                          dupTemp$0 = param2.field_y[var8];
                          ca.field_c[dupTemp$0] = ca.field_c[dupTemp$0] + 1;
                        }
                        ug.field_h = ug.field_h + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_57_0 = -1;
          }
          if (stackIn_57_0 > ~param2.field_w &&
            null != param2.field_y) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= ca.field_c.length)) {
              var10Lifetime1 = ca.field_c[var9Lifetime1];
              ca.field_c[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_71_0 = var5;
          stackIn_71_1 = new StringBuilder().append("ej.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }
}

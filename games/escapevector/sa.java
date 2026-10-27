/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends hg {
    boolean field_h;
    ed field_i;
    static String field_q;
    int field_l;
    int field_k;
    int field_j;
    private int field_s;
    private int field_m;
    boolean field_p;
    boolean field_r;
    int field_g;
    private ed field_t;
    int field_o;
    int field_n;

    private final void a(boolean param0, int param1, int param2) {
        try {
          int var4_int = 100;
          int var5 = ma.field_a.field_cb % var4_int;
          if (null == this.field_i) {
            return;
          }
          int var6 = this.field_i.field_A;
          int var7 = this.field_i.field_z;
          int var8 = var6 + (var4_int - var5) * 2 * var6 / var4_int;
          int var9 = (-var5 + var4_int) * var7 * 2 / var4_int + var7;
          if (param0) {
            this.a(false, -79, -121);
          }
          int var10 = var5 * 128 / var4_int;
          int var11 = 16711680;
          int var12 = this.field_g + (-param2 - (var9 - var7) / 2);
          int var13 = var9 + var12;
          int var14 = 480;
          if (var13 >= 0 &&
            var12 < var14) {
            int var15 = -param1 + this.field_k - (var8 - var6) / 2;
            int var16 = var8 + var15;
            int var17 = ma.field_a.field_n;
            em.b(var15, var12, var8, var9, var11, var10);
            if (var15 > 0 &&
              var17 <= var16) {
              return;
            }
            if (0 < var15) {
              var15 = var15 - var17;
              if (EscapeVector.field_A != 0) {
                var15 = var15 + var17;
              }
            } else {
              var15 = var15 + var17;
            }
            em.b(var15, var12, var8, var9, var11, var10);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var4 = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var4), "sa.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void d(byte param0) {
        try {
          try {
            if (param0 != 27) {
              sa.d((byte) -32);
            }
            je.field_a = new cn();
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            RuntimeException var1 = decompiledCaughtParameter0;
            throw t.a((Throwable) ((Object) var1), "sa.B(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final fn b(boolean param0) {
        try {
          rk[] var2 = w.c(false);
          if (!param0) {
            fn stackIn_2_0 = (fn) null;
            return stackIn_2_0;
          }
          if (var2 != null) {
            fn stackIn_7_0 = var2[this.field_n].a((byte) 120, this.field_l);
            return stackIn_7_0;
          }
          Object stackIn_5_0 = null;
          return (fn) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2_ref = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var2_ref), "sa.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, ed[] param3, int param4, int param5, ed[] param6, int param7, int param8, wl param9, int param10, boolean param11) {
        String stackIn_7_2 = null;
        String stackIn_11_2 = null;
        String stackIn_15_2 = null;
        try {
          di.a(param3, param8, param5, param10, param0, param5, param9, param1, param6, param11, param8, param4, param9, (byte) -41, param7);
          if (param2) {
            field_q = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_6_0 = runtimeException;
          StringBuilder stackIn_6_1 = new StringBuilder().append("sa.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param10).append(',').append(param11).append(')').toString());
        }
    }

    private final ed d(int param0) {
        try {
          if (param0 != 0) {
            sa.a(22, (byte) 101);
          }
          rk[] var2 = w.c(false);
          if (null == var2) {
            Object stackIn_7_0 = null;
            return (ed) (stackIn_7_0);
          }
          ed stackIn_9_0 = var2[this.field_n].a(-125, this.field_l);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2_ref = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var2_ref), "sa.I(" + param0 + ')');
        }
    }

    sa(int param0, int param1, int param2, int param3, boolean param4, boolean param5, int param6) {
        this(param0, param1, param2, param3);
        try {
          this.field_p = param5;
          this.field_l = param6;
          this.field_r = param4;
          this.e(-7012);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(boolean param0, oe param1) {
        int stackIn_31_0 = 0;
        String stackIn_39_2 = null;
        int var11 = EscapeVector.field_A;
        try {
          if (this.field_i == null) {
            return;
          }
          int var3_int = 0;
          int var4 = 0;
          while (true) {
            int stackIn_5_0 = ~this.field_i.field_x;
            boolean decompiledFrameRemainder0 = true;
            if (stackIn_5_0 < ~var4) {
              int var5 = var4 + (this.field_g + this.field_i.field_v);
              int var6 = var5 >> 5;
              var5 = var5 & 31;
              stackIn_31_0 = 0;
              decompiledFrameRemainder0 = (var11 == 0);
              if (decompiledFrameRemainder0) {
                int var7 = stackIn_31_0;
                while (var7 < this.field_i.field_s) {
                  int var8 = var7 + (this.field_i.field_q + this.field_k);
                  int var9 = var8 >> 5;
                  stackIn_5_0 = var8 & 31;
                  int var8Lifetime1 = stackIn_5_0;
                  while (var9 < 0) {
                    var9 = var9 + param1.field_Mb;
                  }
                  var9 = var9 % param1.field_Mb;
                  if (this.field_i.field_B[var3_int] != 0) {
                    int[] var10 = param1.field_V[var9 + param1.field_Mb * var6];
                    if (si.field_v != var10) {
                      if (null == var10) {
                        int[] array$0 = new int[32];
                        var10 = array$0;
                        param1.field_V[var9 + var6 * param1.field_Mb] = array$0;
                      }
                      var10[var5] = lb.a(var10[var5], 1 << var8Lifetime1);
                    }
                  }
                  var3_int++;
                  var7++;
                }
                var4++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_31_0 = param0 ? 1 : 0;
            }
            if (stackIn_31_0 != 1) {
              this.field_j = -96;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_38_0 = var3;
          StringBuilder stackIn_38_1 = new StringBuilder().append("sa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        Object var4 = null;
        int var13 = EscapeVector.field_A;
        try {
          if (this.field_i == null) {
            return;
          }
          var4 = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          if (this.field_h) {
            int var9Lifetime1 = this.a((byte) 54);
            if (var9Lifetime1 > 0) {
              var5 = this.field_s;
              var4 = this.field_t;
              var6 = this.field_m;
              if (var5 < 0) {
                var7 = -var5;
              }
              if (var6 < 0) {
                var8 = -var6;
              }
            }
          }
          int var10 = this.field_g - param0;
          if (var10 < 480 + var8 &&
            var10 > -this.field_i.field_z) {
            int var11 = -param2 + (this.field_k + ma.field_a.field_n + ma.field_a.field_n) - var7;
            int var12 = this.field_i.field_A + var7 + var7;
            var11 = var11 + var12;
            var11 = var11 % ma.field_a.field_n;
            var11 = var11 - var12;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var11 >= 640))) {
              if (var13 == 0) {
                if (null != var4) {
                  this.field_i.e(var11 + var7, var10);
                  ((ed) (var4)).c(var5 + var11 + var7, var10 + var6, this.a((byte) 122));
                } else {
                  this.field_i.e(var11, var10);
                }
                var11 = var11 + ma.field_a.field_n;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0 &&
              param1 <= 106) {
              this.a(false, -48, -24);
            }
            if (this.field_r) {
              this.a(false, param2, param0);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) (var4), "sa.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0) {
        try {
          if (param0 < 36) {
            field_q = (String) null;
          }
          if (this.field_n == 2) {
            int var2_int = -42 + this.field_o;
            if (var2_int <= 0) {
              int stackIn_14_0 = 0;
              return stackIn_14_0;
            }
            int stackIn_16_0 = 16 * var2_int;
            return stackIn_16_0;
          }
          double var2_double = (double)(ma.field_a.field_Zb / 8);
          if (kg.a((byte) -98, this.field_n)) {
            var2_double = (double)(ma.field_a.field_cb % 100) / 100.0;
          }
          double var4 = Math.cos(3.141592653589793 * var2_double) + 2.0;
          int stackIn_9_0 = (int)(var4 * var4 * 28.0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2 = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var2), "sa.M(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        this.field_i = k.a(this.field_l, (byte) -39, this.field_n);
        this.field_t = this.d(0);
        fn var2 = this.b(true);
        if (param0 != -7012) {
          return;
        }
        if (var2 == null) {
          return;
        }
        try {
          this.field_s = var2.field_c;
          this.field_m = var2.field_b;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sa.H(" + param0 + ')');
        }
    }

    sa(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        this(param0, param1, param2, param3);
        try {
          this.field_r = param4;
          this.field_p = param5;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        try {
          try {
            if (hi.a(param0, -2)) {
              tj var2 = new tj(ic.field_n, ae.field_c, qh.field_j, true);
              re.a(1820, var2);
            }
            if (param1 >= -69) {
              return;
            }
            if (param0 == 2) {
              String var2_ref = "vengeance_intro";
              String var3 = "scene";
              ed[] var4 = tm.field_cb;
              String[] var5 = me.field_o;
              tj var6 = new tj(var2_ref, var3, var4, var5, true);
              re.a(1820, var6);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            RuntimeException var2_ref2 = decompiledCaughtParameter0;
            throw t.a((Throwable) ((Object) var2_ref2), "sa.D(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean e(byte param0) {
        try {
          if (mf.a(this.field_n, -64)) {
            return false;
          }
          if (1 == this.field_n) {
            return false;
          }
          if (5 == this.field_n) {
            return false;
          }
          if (this.field_n == 6) {
            return false;
          }
          if (param0 != -5) {
            return false;
          }
          if (this.field_n == 7) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2 = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var2), "sa.F(" + param0 + ')');
        }
    }

    final void a(oe param0, byte param1) {
        String stackIn_49_2 = null;
        int var12 = EscapeVector.field_A;
        try {
          if (this.field_i == null) {
            return;
          }
          int var3_int = 0;
          if (param1 < 58) {
            this.e(-105);
          }
          int var4 = 0;
          L1: while (true) {
            int stackIn_9_0 = this.field_i.field_x;
            if (stackIn_9_0 > var4) {
              int var5 = var4 + this.field_i.field_v + this.field_g;
              int var6 = var5 >> 5;
              var5 = var5 & 31;
              if (var12 != 0) {
                return;
              }
              int var7 = 0;
              while (var7 < this.field_i.field_s) {
                int var8 = var7 + (this.field_k + this.field_i.field_q);
                int var9 = var8 >> 5;
                stackIn_9_0 = var8 & 31;
                int var8Lifetime1 = stackIn_9_0;
                while (0 > var9) {
                  var9 = var9 + param0.field_Mb;
                }
                var9 = var9 % param0.field_Mb;
                if (null != ma.field_a.field_eb) {
                  ma.field_a.field_eb.a(var9, var6, true);
                }
                if (0 != this.field_i.field_B[var3_int]) {
                  int[] var10 = param0.field_V[param0.field_Mb * var6 + var9];
                  if (var10 != null) {
                    if (si.field_v == var10) {
                      int[] array$0 = new int[32];
                      var10 = array$0;
                      param0.field_V[param0.field_Mb * var6 + var9] = array$0;
                      int var11 = 0;
                      while (var11 < 32) {
                        var10[var11] = -1;
                        var11++;
                      }
                    }
                    var10[var5] = ae.a(var10[var5], ~(1 << var8Lifetime1));
                  }
                }
                var3_int++;
                var7++;
              }
              var4++;
              continue L1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_48_0 = var3;
          StringBuilder stackIn_48_1 = new StringBuilder().append("sa.C(");
          if (param0 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        try {
          if (param0) {
            sa.a(77, 13, true, (ed[]) null, -108, -59, (ed[]) null, -14, -30, (wl) null, -40, true);
          }
          field_q = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var1 = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var1), "sa.G(" + param0 + ')');
        }
    }

    sa(int param0, int param1, int param2, int param3) {
        boolean stackIn_6_1 = false;
        this.field_o = 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          this.field_g = param3;
          this.field_k = param2;
          this.field_j = param0;
          this.field_n = param1;
          Object stackIn_3_0 = this;
          if (param1 != 2) {
            Object stackIn_5_0 = this;
            Object stackIn_3_0Lifetime1 = stackIn_5_0;
            if (!kg.a((byte) -125, this.field_n)) {
              stackIn_6_1 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_6_1 = true;
          }
          this.field_h = stackIn_6_1;
          this.field_p = false;
          this.field_r = false;
          this.field_l = 0;
          this.e(-7012);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "sa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_q = "Enter the cave, find the container,<br>and land next to it to attach your tether.";
    }
}

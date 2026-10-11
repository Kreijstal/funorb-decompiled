/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho extends nc {
    private int field_o;
    private int field_r;
    static String field_p;
    static int field_q;
    private int field_n;
    static int field_m;
    static int field_l;
    static int field_s;

    final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -118) {
            field_l = -12;
          }
          stackIn_4_0 = this.field_o;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "ho.V(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, fh param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          oq.field_u = param1.field_i.field_k;
          dl.a(-91);
          if (param0 >= -121) {
            ho.e(-95);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ho.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(md param0, int param1, int param2, boolean param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
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
        int stackIn_41_0Lifetime1;
        int stackIn_41_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5_int = mb.a((byte) -31, 3 * (-param2 + param1));
          var6 = 3 * param2;
          dd.a((byte) 8);
          var7 = var5_int - 10;
          if (param4 != 16634) {
            field_q = 42;
          }
          if (param0.field_m > 0 &&
            param0.field_z != null) {
            kq.a(0);
          }
          tf.field_Eb = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param0.field_B > var8)))) {
            var9 = param0.field_y[var8];
            var10 = param0.field_L[var8];
            var11 = param0.field_H[var8];
            stackOut_12_0 = param3;
            stackIn_50_0 = stackOut_12_0 ? 1 : 0;
            stackIn_13_0 = stackOut_12_0;
            if (var19 == 0) {
              if (stackIn_13_0) {
                var12 = lo.field_j[var9];
                var13 = jk.field_k[var9];
                var14 = lo.field_j[var10] - var12;
                var15 = lo.field_j[var11] - var12;
                var16 = jk.field_k[var10] - var13;
                var17 = -var13 + jk.field_k[var11];
              }
              if (!stackIn_13_0 ||
                !(0 <= var14 * var17 - var16 * var15)) {
                var12Lifetime1 = hl.field_f[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = hl.field_f[var10];
                  if (-2147483648 != var13Lifetime1) {
                    var14 = hl.field_f[var11];
                    if (var14 != -2147483648) {
                      var15 = var14 + var13Lifetime1 + var12Lifetime1 - var6;
                      if (var7 >= 0) {
                        stackIn_30_0 = var15 >> var7;
                      } else {
                        stackIn_30_0 = var15 << -var7;
                      }
                      var16 = -stackIn_30_0 + hl.field_e.length - 1;
                      var17 = hl.field_e[var16];
                      while (true) {
                        if (0 != var17 >> 4) {
                          var16--;
                          stackIn_41_0 = -1;
                          stackIn_41_1 = ~var16;
                          if (stackIn_41_0 < stackIn_41_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = hl.field_e[var16];
                          continue;
                        }
                        stackIn_41_0Lifetime1 = var17;
                        stackIn_41_1Lifetime1 = var16 << 4;
                        var18 = stackIn_41_0Lifetime1 + stackIn_41_1Lifetime1;
                        ah.field_f[var18] = var8;
                        hl.field_e[var16] = var17 + 1;
                        if (param0.field_m > 0 &&
                          param0.field_z != null) {
                          dupTemp$0 = param0.field_z[var8];
                          nn.field_c[dupTemp$0] = nn.field_c[dupTemp$0] + 1;
                        }
                        tf.field_Eb = tf.field_Eb + 1;
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
            stackIn_50_0 = ~param0.field_m;
          }
          if (stackIn_50_0 < -1 &&
            param0.field_z != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(nn.field_c.length <= var9Lifetime1)) {
              var10Lifetime1 = nn.field_c[var9Lifetime1];
              nn.field_c[var9Lifetime1] = var8Lifetime1;
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
          stackIn_64_0 = var5;
          stackIn_64_1 = new StringBuilder().append("ho.E(");
          if (param0 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 30833) {
            field_l = -114;
          }
          field_p = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "ho.J(" + param0 + ')');
        }
    }

    final static int a(CharSequence param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 3) {
            field_p = (String) null;
          }
          stackIn_4_0 = md.a(param0, param1, -105, true);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ho.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          String[] var4 = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int stackIn_25_0 = 0;
          RuntimeException stackIn_29_0 = null;
          StringBuilder stackIn_29_1 = null;
          String stackIn_30_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref2 = null;
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            if (hk.field_a) {
              return true;
            }
            try {
              boolean decompiledFrameCompleted0 = true;
              var2 = "tuhstatbut";
              var3 = (String) (fo.b(param0, 13093, "getcookies"));
              if (param1 != 61) {
                ho.a(122, 9, (byte[]) null, 88);
              }
              var4 = mk.a(';', false, var3);
              var5 = 0;
              while (var4.length > var5) {
                var6 = var4[var5].indexOf('=');
                stackIn_25_0 = ~var6;
                if (var7 != 0) {
                  decompiledRegionSelector0 = 0;
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_25_0 <= -1 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
                var5++;
              }
              if (decompiledFrameCompleted0) {
                decompiledRegionSelector0 = 1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = decompiledCaughtException;
              decompiledRegionSelector0 = 1;
            }
            if (decompiledRegionSelector0 != 0) {
              stackIn_25_0 = (null == param0.getParameter("tuhstatbut")) ? 0 : 1;
            }
            return stackIn_25_0 != 0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_29_0 = var2_ref;
            stackIn_29_1 = new StringBuilder().append("ho.I(");
            if (param0 == null) {
              stackIn_30_2 = "null";
            } else {
              stackIn_30_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        wl var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (param1 > 0) {
            var4 = new byte[param3];
            var5_int = 0;
            while (param3 > var5_int) {
              var4[var5_int] = param2[param1 + var5_int];
              var5_int++;
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted0) &&
              (var7 != 0)) {
              var4 = param2;
            }
          } else {
            var4 = param2;
          }
          var5 = new wl();
          var5.b(32);
          if (param0 != 4246) {
            stackIn_12_0 = (byte[]) null;
            return stackIn_12_0;
          }
          var5.a(var4, param0 ^ 4262, (long)(8 * param3));
          var6 = new byte[64];
          var5.a(var6, param0 ^ 4247, 0);
          stackIn_14_0 = var6;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("ho.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0) {
        int var2_int = 0;
        try {
          var2_int = (wn.a(-125, wf.field_m << 3) * 24 >> 16) + (175 + (4 * on.a(wf.field_m << 7, -18924) >> 16));
          oo.f(0, 0, 640, 480, 0, var2_int);
          oo.h(5, 5, 635, 475);
          gb.a(6, 3 + this.field_n, 469, 640 + (-this.field_n - this.field_n), (byte) 122);
          oo.c();
          vh.field_Lb.a(this.field_n, 136);
          vh.field_Lb.a(this.field_n, 6);
          dm.field_Wb.a(640 - this.field_n, 6);
          dm.field_Wb.a(-this.field_n + 640, 134);
          no.field_Jb.a(0, 0);
          super.a(param0);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ho.H(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var8Lifetime1;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          this.field_r = 0;
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(this.field_g.field_c > var2_int)))) {
            var3 = we.field_g[this.field_j[var2_int]];
            var4 = ah.field_e.a(var3);
            stackIn_29_0 = this.field_j[var2_int];
            stackIn_29_1 = 50;
            if (var9 == 0) {
              if (stackIn_29_0 == stackIn_29_1) {
                var5 = ah.field_e.a(da.field_f);
                var6 = ah.field_e.a(jm.field_l);
                var7 = ah.field_e.a(jp.field_a);
                stackIn_12_0 = (var5 > var6) ? var5 : var6;
                var8 = stackIn_12_0;
                stackIn_16_0 = (var8 > var7) ? var8 : var7;
                var8Lifetime1 = stackIn_16_0;
                var4 = var4 + var8Lifetime1;
              }
              if (this.field_j[var2_int] == 12 ||
                13 == this.field_j[var2_int]) {
                var4 += 140;
              }
              if (var4 > this.field_r) {
                this.field_r = var4;
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_o = -(this.field_r >> 1) + 320;
            this.field_n = this.field_o - 20;
            stackIn_29_0 = param0;
            stackIn_29_1 = 74;
          }
          if (stackIn_29_0 != stackIn_29_1) {
            ho.$cfr$intArgs$a$b55aceaa55ac(-52, (fh) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ho.G(" + param0 + ')');
        }
    }

    final int d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -65) {
            field_p = (String) null;
          }
          stackIn_4_0 = this.field_r + this.field_o;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "ho.AA(" + param0 + ',' + param1 + ')');
        }
    }

    ho(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    static {
        field_p = "Respect";
        field_l = 1;
        field_m = 0;
        field_s = 131072;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$b55aceaa55ac(int param0, fh param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          oq.field_u = param1.field_i.field_k;
          dl.a(-91);
          if (param0 >= -121) {
            ho.e(-95);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ho.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }
}

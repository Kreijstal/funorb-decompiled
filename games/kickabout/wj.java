/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wj extends fd implements jp {
    static int[] field_x;
    tf field_y;
    static String[] field_w;
    static boolean field_z;
    static int field_A;
    static vn[][] field_v;

    fd a(boolean param0) {
        nw var2 = null;
        RuntimeException var2_ref = null;
        fd var3 = null;
        int var4 = 0;
        fd stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var2 = new nw(this.field_y);
          if (param0) {
            field_v = (vn[][]) null;
          }
          var3 = (fd) (var2.a((byte) 77));
          while (null != var3) {
            if (var3.b(42)) {
              stackIn_8_0 = var3;
              return stackIn_8_0;
            }
            var3 = (fd) (var2.a(0));
            if (var4 == 0) {
              continue;
            }
            break;
          }
          stackIn_11_0 = null;
          return (fd) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "wj.Q(" + param0 + ')');
        }
    }

    public static void i(int param0) {
        if (param0 != -336184828) {
          return;
        }
        try {
          field_v = (vn[][]) null;
          field_w = null;
          field_x = null;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wj.RA(" + param0 + ')');
        }
    }

    wj(int param0, int param1, int param2, int param3, gj param4) {
        super(param0, param1, param2, param3, param4, (jv) null);
        this.field_y = new tf();
    }

    final boolean b(fd param0, byte param1) {
        nw var3 = null;
        fd var4 = null;
        nw var5 = null;
        fd var6 = null;
        int var7 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_30_0 = false;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
        boolean stackOut_20_0;
        RuntimeException var3_ref = null;
        var7 = Kickabout.field_G;
        try {
          if (param1 <= 122) {
            this.b(-52);
          }
          if (this.field_y.a((byte) -4)) {
            return false;
          }
          var3 = new nw(this.field_y);
          var4 = (fd) (var3.a((byte) 73));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 == null))) {
            stackOut_11_0 = var4.b(24);
            stackIn_30_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (var7 == 0) {
              if (stackIn_12_0) {
                var5 = new nw(this.field_y);
                var5.a(395869153, var4);
                var6 = (fd) (var5.a(0));
                while (var6 != null) {
                  stackOut_20_0 = var6.a(param0, 0);
                  stackIn_30_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (stackIn_21_0) {
                    return true;
                  }
                  var6 = (fd) (var5.a(0));
                }
              }
              var4 = (fd) (var3.a(0));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_30_0 = false;
          }
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_34_0 = var3_ref;
          stackIn_34_1 = new StringBuilder().append("wj.O(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(fd param0, int param1) {
        nw var3 = null;
        RuntimeException var3_ref = null;
        fd var4 = null;
        int var5 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var5 = Kickabout.field_G;
        try {
          if (param1 != 0) {
            return false;
          }
          var3 = new nw(this.field_y);
          var4 = (fd) (var3.a((byte) -97));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var4))) {
            stackOut_6_0 = var4.a(param0, 0);
            stackIn_14_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (var5 == 0) {
              if (stackIn_7_0) {
                return true;
              }
              var4 = (fd) (var3.a(0));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_14_0 = false;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("wj.HA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, fd param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_y.a(param1, 3);
          if (param0 >= -15) {
            this.field_y = (tf) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("wj.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        nw var8 = null;
        RuntimeException var8_ref = null;
        fd var9 = null;
        int var10 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        var10 = Kickabout.field_G;
        try {
          var8 = new nw(this.field_y);
          var9 = (fd) (var8.a((byte) 111));
          if (!param0) {
            field_x = (int[]) null;
          }
          L2: while (true) {
            if (var9 != null) {
              stackOut_5_0 = var9.e((byte) -113);
              stackIn_16_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var10 != 0) {
                break L2;
              }
              if (stackIn_6_0) {
                if (var9.a(param0, param1 + this.field_g, param2, param3, param4, param5 + this.field_t, param6)) {
                  return true;
                }
                var9 = (fd) (var8.a(0));
                continue;
              }
            }
            stackIn_16_0 = false;
            break;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_20_0 = var8_ref;
          stackIn_20_1 = new StringBuilder().append("wj.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void g(int param0) {
        RuntimeException runtimeException = null;
        nw var2 = null;
        fd var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var2 = new nw(this.field_y);
          if (param0 != 84) {
            this.a((fd) null, -46);
          }
          var3 = (fd) (var2.a((byte) -99));
          while (var3 != null) {
            var3.g(param0 ^ 0);
            var3 = (fd) (var2.a(0));
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) runtimeException), "wj.FA(" + param0 + ')');
        }
    }

    final int f(byte param0) {
        int var2_int = 0;
        nw var3 = null;
        fd var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Kickabout.field_G;
        try {
          var2_int = 0;
          var3 = new nw(this.field_y);
          var4 = (fd) (var3.a((byte) -80));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 == null))) {
            var5 = var4.f((byte) 118);
            stackIn_11_0 = var2_int;
            stackIn_11_1 = var5;
            if (var6 == 0) {
              if (stackIn_11_0 < stackIn_11_1) {
                var2_int = var5;
              }
              var4 = (fd) (var3.a(0));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = param0;
            stackIn_11_1 = 118;
          }
          if (stackIn_11_0 != stackIn_11_1) {
            field_w = (String[]) null;
          }
          stackIn_15_0 = var2_int;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "wj.NA(" + param0 + ')');
        }
    }

    final boolean a(fd param0, byte param1) {
        nw var3 = null;
        fd var4 = null;
        nw var5 = null;
        fd var6 = null;
        int var7 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_29_0 = false;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        boolean stackOut_19_0;
        RuntimeException var3_ref = null;
        var7 = Kickabout.field_G;
        try {
          if (this.field_y.a((byte) -106)) {
            return false;
          }
          var3 = new nw(this.field_y);
          var4 = (fd) (var3.b(0));
          if (param1 != -100) {
            this.a(-56, (fd) null);
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var4))) {
            stackOut_10_0 = var4.b(82);
            stackIn_29_0 = stackOut_10_0;
            stackIn_11_0 = stackOut_10_0;
            if (var7 == 0) {
              if (stackIn_11_0) {
                var5 = new nw(this.field_y);
                var5.a((byte) 104, (gn) (var4));
                var6 = (fd) (var5.b((byte) 46));
                while (var6 != null) {
                  stackOut_19_0 = var6.a(param0, 0);
                  stackIn_29_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (stackIn_20_0) {
                    return true;
                  }
                  var6 = (fd) (var5.b((byte) 46));
                }
              }
              var4 = (fd) (var3.b((byte) 46));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_29_0 = false;
          }
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_33_0 = var3_ref;
          stackIn_33_1 = new StringBuilder().append("wj.U(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        nw var5 = null;
        fd var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = Kickabout.field_G;
        try {
          if (param1 != 65) {
            return;
          }
          if (param0 == 0 &&
            this.field_r != null) {
            this.field_r.a(-103, true, param3, (fd) (this), param2);
          }
          var5 = new nw(this.field_y);
          var6 = (fd) (var5.b(0));
          while (var6 != null) {
            var6.a(param0, 65, this.field_t + param2, this.field_g + param3);
            var6 = (fd) (var5.b((byte) 46));
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var5_ref), "wj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, int param5) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Kickabout.field_G;
        try {
          var6_int = -127 % ((param5 - 63) / 51);
          pt.a(160 + param3, -22914, param3, param4 + 21, param4);
          on.i(param3, param4, 160, 42, 10, 65793);
          ta.e(123);
          if (param2 != null) {
            un.field_d.d(param2, 80 + param3, 17 + param4, 16777215, -1);
          }
          var7 = 0;
          while (param1 > var7) {
            var8 = 65793;
            var9 = 128;
            if (var10 != 0) {
              return;
            }
            if (~param0 == ~var7) {
              var8 = 16777215;
              var9 = 50;
            }
            on.a(param3, param4 + (var7 + 1) * 23, 160, 21, var8, var9);
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("wj.TA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, kk param1, int param2, int param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
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
        int stackIn_42_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Kickabout.field_G;
        try {
          var5_int = cm.a(true, 3 * (-param2 + param3));
          var6 = param2 * 3;
          var7 = -10 + var5_int;
          if (param0 != -336184828) {
            return;
          }
          wa.b((byte) -105);
          if (param1.field_u > 0 &&
            param1.field_G != null) {
            qr.a(82);
          }
          sp.field_Ob = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param1.field_g)))) {
            var9 = param1.field_n[var8];
            var10 = param1.field_z[var8];
            var11 = param1.field_T[var8];
            stackOut_11_0 = param4;
            stackIn_51_0 = stackOut_11_0 ? 1 : 0;
            stackIn_12_0 = stackOut_11_0;
            if (var19 == 0) {
              if (stackIn_12_0) {
                var12 = fb.field_M[var9];
                var13 = fk.field_k[var9];
                var14 = -var12 + fb.field_M[var10];
                var15 = fb.field_M[var11] - var12;
                var16 = fk.field_k[var10] - var13;
                var17 = fk.field_k[var11] - var13;
              }
              if (!stackIn_12_0 ||
                !(var17 * var14 - var15 * var16 >= 0)) {
                var12Lifetime1 = ld.field_e[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = ld.field_e[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = ld.field_e[var11];
                    if (-2147483648 != var14) {
                      var15 = var14 + var12Lifetime1 - (-var13Lifetime1 + var6);
                      stackIn_31_0 = -1;
                      stackIn_31_1 = qe.field_b.length;
                      if (var7 < 0) {
                        stackIn_32_2 = var15 << -var7;
                      } else {
                        stackIn_32_2 = var15 >> var7;
                      }
                      var16 = stackIn_31_0 + (stackIn_31_1 - stackIn_32_2);
                      var17 = qe.field_b[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_42_0 = var16;
                          if (stackIn_42_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = qe.field_b[var16];
                          continue;
                        }
                        stackIn_42_0Lifetime1 = (var16 << 4) + var17;
                        var18 = stackIn_42_0Lifetime1;
                        nb.field_e[var18] = var8;
                        qe.field_b[var16] = 1 + var17;
                        if (param1.field_u > 0 &&
                          param1.field_G != null) {
                          dupTemp$0 = param1.field_G[var8];
                          vu.field_zb[dupTemp$0] = vu.field_zb[dupTemp$0] + 1;
                        }
                        sp.field_Ob = sp.field_Ob + 1;
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
            stackIn_51_0 = param1.field_u;
          }
          if (stackIn_51_0 > 0 &&
            param1.field_G != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= vu.field_zb.length)) {
              var10Lifetime1 = vu.field_zb[var9Lifetime1];
              vu.field_zb[var9Lifetime1] = var8Lifetime1;
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
          stackIn_65_0 = var5;
          stackIn_65_1 = new StringBuilder().append("wj.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean b(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 10) {
            this.field_y = (tf) null;
          }
          stackIn_7_0 = (null != this.a(false));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "wj.KA(" + param0 + ')');
        }
    }

    final static String a(String param0, String param1, boolean param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Kickabout.field_G;
        try {
          var4_int = param3.length();
          var5 = param0.length();
          var6 = param1.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var8 = var6 - var5;
          if (var8 != 0) {
            var9_int = 0;
            do {
              var9_int = param3.indexOf(param0, var9_int);
              if (var9_int < 0) {
                if (var12 == 0) {
                  break;
                }
              } else {
                var7 = var7 + var8;
                var9_int = var9_int + var5;
              }
            } while (var12 == 0);
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          L5: while (true) {
            var11 = param3.indexOf(param0, var10);
            if (0 > var11) {
              if (var12 == 0) {
                break L5;
              }
            } else {
              discarded$0 = var9.append(param3.substring(var10, var11));
              discarded$1 = var9.append(param1);
              var10 = var5 + var11;
            }
            if (var12 == 0) {
              continue;
            }
            break;
          }
          discarded$2 = var9.append(param3.substring(var10));
          if (!param2) {
            field_A = 15;
          }
          stackIn_26_0 = var9.toString();
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("wj.S(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        nw var7 = null;
        fd var8 = null;
        int var9 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = Kickabout.field_G;
        try {
          if (param4 != -1) {
            wj.a(104, (kk) null, 40, 112, false);
          }
          var7 = new nw(this.field_y);
          var8 = (fd) (var7.a((byte) -93));
          while (var8 != null) {
            if (var8.e((byte) -113)) {
              var8.a(param0 + this.field_g, param1, param2, param3, -1, this.field_t + param5);
              var8 = (fd) (var7.a(0));
              if (var9 == 0) {
                continue;
              }
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_12_0 = var7_ref;
          stackIn_12_1 = new StringBuilder().append("wj.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException runtimeException = null;
        nw var5 = null;
        fd var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          var5 = new nw(this.field_y);
          if (param3 != 24745) {
            return;
          }
          var6 = (fd) (var5.a((byte) 63));
          while (null != var6) {
            discarded$2 = param0.append('\n');
            if (var8 != 0) {
              return;
            }
            var7 = 0;
            while (param2 >= var7) {
              discarded$3 = param0.append(' ');
              var7++;
            }
            var6.a(param3 ^ 9586, 1 + param2, param1, param0);
            var6 = (fd) (var5.a(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_18_0 = runtimeException;
          stackIn_18_1 = new StringBuilder().append("wj.SA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        try {
          super.a(param0, param1, param2, param3, param4);
          this.j(5);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wj.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    String f(int param0) {
        nw var2 = null;
        RuntimeException var2_ref = null;
        fd var3 = null;
        String var4 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          var2 = new nw(this.field_y);
          var3 = (fd) (var2.a((byte) -56));
          if (param0 != -1) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var3))) {
            var4 = var3.f(-1);
            stackIn_15_0 = null;
            if (var5 == 0) {
              if (stackIn_15_0 != var4) {
                stackIn_12_0 = var4;
                return stackIn_12_0;
              }
              var3 = (fd) (var2.a(0));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_15_0 = null;
          }
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "wj.MA(" + param0 + ')');
        }
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 17883) {
            field_v = (vn[][]) null;
          }
          if (this.a(1, param3, param2, param1)) {
            this.b(param1, param3, param2, param0 - 36451);
            this.a(param3, param2, param1, 24745);
          }
          stackIn_8_0 = (StringBuilder) (param3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wj.GA(").append(param0).append(',').append(param1).append(',');
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
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    boolean a(char param0, byte param1, fd param2, int param3) {
        nw var5 = null;
        RuntimeException var5_ref = null;
        fd var6_ref_fd = null;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_20_0 = 0;
        boolean stackIn_27_0 = false;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var7 = Kickabout.field_G;
        try {
          if (param1 > -60) {
            field_A = 114;
          }
          var5 = new nw(this.field_y);
          var6_ref_fd = (fd) (var5.a((byte) -108));
          L2: while (true) {
            if (var6_ref_fd != null) {
              stackOut_6_0 = var6_ref_fd.e((byte) -113);
              stackIn_20_0 = stackOut_6_0 ? 1 : 0;
              stackIn_7_0 = stackOut_6_0;
              if (var7 != 0) {
                break L2;
              }
              if (stackIn_7_0) {
                if (var6_ref_fd.b(52) &&
                  var6_ref_fd.a(param0, (byte) -76, param2, param3)) {
                  return true;
                }
                var6_ref_fd = (fd) (var5.a(0));
                continue;
              }
            }
            stackIn_20_0 = param3;
            break;
          }
          var6 = stackIn_20_0;
          if (var6 != 80) {
            return false;
          }
          if (!ne.field_G[81]) {
            stackIn_27_0 = this.b(param2, (byte) 123);
          } else {
            stackIn_27_0 = this.a(param2, (byte) -100);
          }
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_33_0 = var5_ref;
          stackIn_33_1 = new StringBuilder().append("wj.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(byte param0, fd param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        nw var5 = null;
        fd var6 = null;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new nw(this.field_y);
          var6 = (fd) (var5.a((byte) -34));
          while (null != var6) {
            if (var6.e((byte) -113)) {
              var6.a((byte) 12, param1, this.field_t + param2, param3 + this.field_g);
              var6 = (fd) (var5.a(0));
              if (var7 == 0) {
                continue;
              }
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("wj.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void j(int param0) {
        RuntimeException runtimeException = null;
        nw var2 = null;
        fd var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var2 = new nw(this.field_y);
          if (param0 != 5) {
            wj.i(-127);
          }
          var3 = (fd) (var2.a((byte) 106));
          while (null != var3) {
            var3.e(-1947);
            var3 = (fd) (var2.a(0));
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) runtimeException), "wj.R(" + param0 + ')');
        }
    }

    final boolean a(int param0, fd param1, int param2, int param3, int param4, int param5, int param6) {
        nw var8 = null;
        RuntimeException var8_ref = null;
        fd var9 = null;
        int var10 = 0;
        int var11 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var11 = Kickabout.field_G;
        try {
          var8 = new nw(this.field_y);
          var9 = (fd) (var8.a((byte) 54));
          var10 = -61 % ((63 - param6) / 56);
          L1: while (true) {
            if (var9 != null) {
              stackOut_3_0 = var9.e((byte) -113);
              stackIn_19_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (var11 != 0) {
                break L1;
              }
              if (stackIn_4_0) {
                if (var9.b(82) &&
                  var9.a(param0, param1, param2, param3, param4, param5, -10)) {
                  return true;
                }
                var9 = (fd) (var8.a(0));
                continue;
              }
            }
            stackIn_19_0 = false;
            break;
          }
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_23_0 = var8_ref;
          stackIn_23_1 = new StringBuilder().append("wj.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_z = true;
        field_A = 0;
        field_v = new vn[5][5];
    }
}

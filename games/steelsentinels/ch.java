/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ch extends lh implements lm {
    static boolean[] field_G;
    static int field_N;
    static String field_K;
    static String field_P;
    static String field_M;
    static k field_O;
    static int field_L;
    static String field_H;
    static String field_I;
    lh[] field_J;

    final boolean a(int param0, int param1, char param2, lh param3) {
        lh[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        lh var7 = null;
        int var8 = 0;
        lh var9 = null;
        lh[] var10 = null;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.obfuscationControl;
        try {
          if (null == this.field_J) {
            return false;
          }
          if (param0 != 30373) {
            var9 = (lh) null;
            this.a((byte) -45, 101, 54, 104, (lh) null, -22);
          }
          var10 = this.field_J;
          var5 = var10;
          var6 = 0;
          while (var10.length > var6) {
            var7 = var10[var6];
            if (var7 != null &&
              var7.d(0) &&
              var7.a(30373, param1, param2, param3)) {
              return true;
            }
            var6++;
            if (var8 == 0) {
              continue;
            }
            break;
          }
          var5_int = param1;
          if (var5_int != 80) {
            return false;
          }
          if (fc.field_e[81]) {
            stackIn_20_0 = this.b(param3, (byte) -86);
          } else {
            stackIn_20_0 = this.a(param3, (byte) -70);
          }
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_23_0 = var5_ref;
          stackIn_23_1 = new StringBuilder().append("ch.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final boolean b(lh param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -61) {
            field_N = 50;
          }
          stackIn_3_0 = this.b((byte) -127, param0, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ch.FA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(byte param0, lh param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        lh var5 = null;
        lh var6 = null;
        int var7 = 0;
        Object stackIn_9_0 = null;
        lh stackIn_9_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_J == null) {
            return false;
          }
          var4_int = 0;
          if (param0 != -68) {
            return true;
          }
          while (true) {
            if (var4_int < this.field_J.length) {
              var5 = this.field_J[var4_int];
              stackIn_9_0 = null;
              stackIn_9_1 = var5;
              scanLoop1: while (stackIn_9_0 != stackIn_9_1 &&
                var5.d(0)) {
                var4_int = var4_int + param2;
                while (this.field_J.length > var4_int) {
                  var6 = this.field_J[var4_int];
                  stackIn_9_0 = null;
                  stackIn_9_1 = var6;
                  if (var7 != 0) {
                    continue scanLoop1;
                  }
                  if ((stackIn_9_0 != stackIn_9_1 ||
                    var7 != 0) &&
                    var6.a(1, param1)) {
                    return true;
                  }
                  var4_int = var4_int + param2;
                }
                break;
              }
              var4_int++;
              if (var7 == 0) {
                continue;
              }
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("ch.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        lh var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, (byte) -91, param3, param0)) {
            this.a(param3, param0, false, param1);
            this.a(0, param3, param0, param1);
          }
          if (param2 >= -104) {
            var6 = (lh) null;
            this.a(-37, -54, (lh) null, -3);
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ch.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean b(byte param0, lh param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        lh var5 = null;
        lh var6 = null;
        int var7 = 0;
        Object stackIn_11_0 = null;
        lh stackIn_11_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (param0 > -118) {
            return false;
          }
          if (this.field_J == null) {
            return false;
          }
          var4_int = -1 + this.field_J.length;
          while (true) {
            if (var4_int >= 0) {
              var5 = this.field_J[var4_int];
              stackIn_11_0 = null;
              stackIn_11_1 = var5;
              scanLoop1: while (stackIn_11_0 != stackIn_11_1 &&
                var5.d(0)) {
                var4_int = var4_int - param2;
                while (0 <= var4_int) {
                  var6 = this.field_J[var4_int];
                  stackIn_11_0 = null;
                  stackIn_11_1 = var6;
                  if (var7 != 0) {
                    continue scanLoop1;
                  }
                  if ((stackIn_11_0 != stackIn_11_1 ||
                    var7 != 0) &&
                    var6.a(1, param1)) {
                    return true;
                  }
                  var4_int = var4_int - param2;
                }
                break;
              }
              var4_int--;
              if (var7 == 0) {
                continue;
              }
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("ch.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException runtimeException = null;
        lh[] var5 = null;
        int var6 = 0;
        lh var7 = null;
        int var8 = 0;
        int var9 = 0;
        lh[] var10 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = SteelSentinels.obfuscationControl;
        try {
          if (null == this.field_J) {
            return;
          }
          var10 = this.field_J;
          var5 = var10;
          var6 = param0;
          while (var6 < var10.length) {
            var7 = var10[var6];
            discarded$3 = param3.append('\n');
            if (var9 != 0) {
              return;
            }
            var8 = 0;
            while (true) {
              if (var8 <= param1) {
                discarded$4 = param3.append(' ');
                var8++;
                continue;
              }
              if (var7 != null) {
                var7.a(param2, param3, (byte) -112, param1 + 1);
              } else {
                discarded$5 = param3.append("null");
              }
              break;
            }
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_19_0 = runtimeException;
          stackIn_19_1 = new StringBuilder().append("ch.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var5;
        lh var6;
        int var7;
        var7 = SteelSentinels.obfuscationControl;
        if (0 == param3 &&
          this.field_p != null) {
          this.field_p.a(param2, (lh) (this), (byte) -30, true, param0);
        }
        boolean decompiledFrameCompleted0 = true;
        if (null != this.field_J) {
          var5 = this.field_J.length - 1;
          while (0 <= var5) {
            var6 = this.field_J[var5];
            if (var7 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (var6 != null) {
              var6.a(param0 + this.field_z, (byte) -126, param2 + this.field_o, param3);
            }
            var5--;
          }
        }
        if ((decompiledFrameCompleted0) &&
          (param1 > -99)) {
          field_K = (String) null;
        }

    }

    final static void a(int param0, int param1, int param2, int param3, int param4, pe param5, int param6, int param7) {
        int stackIn_20_0 = 0;
        int[] stackIn_22_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        jj stackIn_44_0 = null;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        jj var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        pe var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int stackIn_26_0Lifetime1;
        int stackIn_26_1Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        int var15Lifetime3;
        var40 = SteelSentinels.obfuscationControl;
        try {
          var44 = param5;
          boolean decompiledSharedTail0 = (null != var44.field_P &&
            (1 < var44.field_K));
          if (!decompiledSharedTail0) {
            sn.a(0);
            decompiledSharedTail0 = (var40 != 0);
          }
          if (decompiledSharedTail0) {
            var60 = var44.field_P;
            la.a(var60, 0, qe.field_a, 0, -32513);
          }
          if (param3 > -114) {
            field_H = (String) null;
          }
          var54 = new int[param5.field_u];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param5.field_u];
          var61 = tc.field_A;
          var62 = hm.field_c;
          var63 = pi.field_e;
          var13 = 0;
          while (param5.field_u > var13) {
            var14 = var61[var13] * param6 + var62[var13] * param1 + param0 * var63[var13] >> 8;
            stackIn_26_0 = ~var14;
            stackIn_26_1 = -1;
            if (var40 != 0) {
              if (stackIn_26_0 <= stackIn_26_1) {
                return;
              }
              var14 = um.field_bb[var13];
              var15 = param5.field_G[var14];
              var16 = param5.field_j[var14];
              var17 = param5.field_x[var14];
              return;
            }
            if (stackIn_26_0 > stackIn_26_1) {
              var14 = -var14;
            }
            if (0 <= var14) {
              if (var14 < 128) {
                stackIn_20_0 = var14 + 128;
              } else {
                stackIn_20_0 = 256;
              }
            } else {
              stackIn_20_0 = 128;
            }
            var14Lifetime2 = stackIn_20_0;
            var15Lifetime2 = var63[var13] * param2 + param4 * var61[var13] + param7 * var62[var13] >> 8;
            stackIn_22_0 = kf.field_t;
            if (var15Lifetime2 < 0) {
              stackIn_23_1 = -var15Lifetime2;
            } else {
              stackIn_23_1 = var15Lifetime2;
            }
            var15Lifetime3 = stackIn_22_0[stackIn_23_1];
            var14Lifetime2 = var14Lifetime2 * (-var15Lifetime3 + 256) >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime3;
            var13++;
            if (var40 == 0) {
              continue;
            }
            break;
          }
          var13Lifetime1 = 0;
          while (true) {
            stackIn_26_0Lifetime1 = Projectile.field_D;
            stackIn_26_1Lifetime1 = var13Lifetime1;
            if (stackIn_26_0Lifetime1 <= stackIn_26_1Lifetime1) {
              return;
            }
            var14Lifetime1 = um.field_bb[var13Lifetime1];
            var15Lifetime1 = param5.field_G[var14Lifetime1];
            var16Lifetime1 = param5.field_j[var14Lifetime1];
            var17Lifetime1 = param5.field_x[var14Lifetime1];
            if (var40 != 0) {
              return;
            }
            if (param5.field_M[var14Lifetime1] >= tc.field_A.length) {
              stackIn_31_0 = -1;
            } else {
              stackIn_31_0 = param5.field_M[var14Lifetime1];
            }
            var18 = stackIn_31_0;
            if (tc.field_A.length > param5.field_V[var14Lifetime1]) {
              stackIn_34_0 = param5.field_V[var14Lifetime1];
            } else {
              stackIn_34_0 = -1;
            }
            var19 = stackIn_34_0;
            if (param5.field_T[var14Lifetime1] < tc.field_A.length) {
              stackIn_37_0 = param5.field_T[var14Lifetime1];
            } else {
              stackIn_37_0 = -1;
            }
            var20 = stackIn_37_0;
            if (pm.field_W != null &&
              null != param5.field_e &&
              param5.field_e.length > var14Lifetime1 &&
              param5.field_e[var14Lifetime1] != -1 &&
              param5.field_e[var14Lifetime1] < pm.field_W.length) {
              stackIn_44_0 = pm.field_W[param5.field_e[var14Lifetime1]];
            } else {
              stackIn_44_0 = null;
            }
            var21 = stackIn_44_0;
            var22 = eh.field_d[var15Lifetime1];
            var23 = FunOrbClient.field_p[var15Lifetime1];
            var24 = eh.field_d[var16Lifetime1];
            var25 = FunOrbClient.field_p[var16Lifetime1];
            var26 = eh.field_d[var17Lifetime1];
            var27 = FunOrbClient.field_p[var17Lifetime1];
            if (var19 != var18 ||
              var20 != var19) {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 != null) {
                stackIn_50_0 = var21.field_g;
              } else {
                stackIn_50_0 = 8355711;
              }
              var34 = stackIn_50_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = var35 * var28 >>> 8 & -2130771713 | 1912667904 & var36 * var28 >>> 8;
              var38 = var35 * var29 >>> 8 & -16842497 | (16711703 & var36 * var29) >>> 8;
              var39 = -1090453760 & var36 * var30 >>> 8 | (-16711709 & var35 * var30) >>> 8;
              var37 = var37 + var31 * 65793;
              var38 = var38 + 65793 * var32;
              var39 = var39 + 65793 * var33;
              wh.a(var37 >> 16, (var38 & 65525) >> 8, var39 >> 16, var39 >> 8 & 255, var26, var22, 255 & var37 >> 8, 255 & var38, 255 & var37, var27, 255 & var39, var24, 22, var23, var38 >> 16, var25);
            } else {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 == null) {
                stackIn_54_0 = 8355711;
              } else {
                stackIn_54_0 = var21.field_g;
              }
              var30 = stackIn_54_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = 1812004608 & var28 * var32 >>> 8 | (var28 * var31 & -16711831) >>> 8;
              var33 = var33 + var29 * 65793;
              vl.a(var27, var25, var23, var24, var26, var33 >> 1 & 8355711, false, var22);
            }
            var13Lifetime1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_59_0 = var8_ref;
          stackIn_59_1 = new StringBuilder().append("ch.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final String e(int param0) {
        lh[] var2 = null;
        int var3 = 0;
        lh var4 = null;
        String var5 = null;
        int var6 = 0;
        lh[] var7 = null;
        Object stackIn_7_0 = null;
        var6 = SteelSentinels.obfuscationControl;
        if (this.field_J == null) {
          return null;
        }
        var7 = this.field_J;
        var2 = var7;
        var3 = param0;
        while (true) {
          if (var3 >= var7.length) {
            return null;
          }
          var4 = var7[var3];
          stackIn_7_0 = null;
          if (var6 != 0) {
            return (String) (stackIn_7_0);
          }
          if (stackIn_7_0 != var4 ||
            var6 != 0) {
            var5 = var4.e(0);
            if (var5 != null) {
              return var5;
            }
          }
          var3++;
        }
    }

    abstract void f(int param0);

    private final boolean a(lh param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -70) {
            field_O = (k) null;
          }
          stackIn_3_0 = this.a((byte) -68, param0, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ch.KA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_M = null;
        field_I = null;
        field_G = null;
        field_P = null;
        field_K = null;
        field_O = null;
        if (param0 == -68) {
          field_H = null;
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        RuntimeException runtimeException = null;
        lh[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        lh var10 = null;
        int var11 = 0;
        lh[] var12 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = SteelSentinels.obfuscationControl;
        try {
          if (null == this.field_J) {
            return;
          }
          var12 = this.field_J;
          var7 = var12;
          var8 = 19 % ((36 - param0) / 32);
          var9 = 0;
          while (var12.length > var9) {
            var10 = var12[var9];
            if (var11 != 0) {
              return;
            }
            if (var10 != null) {
              var10.a((byte) 127, param1, this.field_z + param2, param3 + this.field_o, param4, param5);
            }
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("ch.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(')').toString());
        }
    }

    final void d(byte param0) {
        lh[] var2;
        int var3;
        lh var4;
        int var5;
        lh[] var6;
        var5 = SteelSentinels.obfuscationControl;
        var6 = this.field_J;
        var2 = var6;
        var3 = 0;
        while (var6.length > var3) {
          var4 = var6[var3];
          if (var5 != 0) {
            return;
          }
          if (var4 != null) {
            var4.d((byte) -45);
          }
          var3++;
        }
        if (param0 != -45) {
          field_K = (String) null;
        }
        return;
    }

    final boolean d(int param0) {
        if (param0 != 0) {
          field_I = (String) null;
        }
        return null != this.a(true) ? true : false;
    }

    ch(int param0, int param1, int param2, int param3, qk param4) {
        super(param0, param1, param2, param3, param4, (tn) null);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          SoftwareRaster.h(param3, param0, param1, param4, 12105914);
          SoftwareRaster.e(1 + param3, param0 + 1, param1 - 2, -2 + param4, 10461345, 16251129);
          var5_int = 64;
          if (param2 != 32308) {
            ch.a((byte) 31);
          }
          var6 = 1;
          while (var6 < 6) {
            SoftwareRaster.h(param3 + var6, var6 + param0, param1 - 2 * var6, -(2 * var6) + param4, 16251129, var5_int);
            var5_int = var5_int >> 1;
            var6++;
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5), "ch.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, lh param4, int param5, int param6) {
        lh[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        lh var10 = null;
        int var11 = 0;
        lh[] var12 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_J == null) {
            return false;
          }
          if (param0 >= -34) {
            field_I = (String) null;
          }
          var12 = this.field_J;
          var8 = var12;
          var9 = 0;
          while (var9 < var12.length) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.d(0) &&
              var10.a((byte) -118, param1, param2, param3, param4, param5, param6)) {
              return true;
            }
            var9++;
            if (var11 == 0) {
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("ch.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, lh param2, int param3) {
        RuntimeException runtimeException = null;
        lh[] var5 = null;
        int var6 = 0;
        lh var7 = null;
        int var8 = 0;
        lh[] var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.obfuscationControl;
        try {
          super.a(param0, 95, param2, param3);
          if (param1 <= 56) {
            return;
          }
          if (this.field_J == null) {
            return;
          }
          var9 = this.field_J;
          var5 = var9;
          var6 = 0;
          while (var9.length > var6) {
            var7 = var9[var6];
            if (var8 != 0) {
              return;
            }
            if (var7 != null) {
              var7.a(param0 + this.field_o, 92, param2, param3 + this.field_z);
            }
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ch.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, lh param1) {
        boolean discarded$1 = false;
        lh[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        lh var5 = null;
        int var6 = 0;
        lh var7 = null;
        lh[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          if (param0 != 1) {
            var7 = (lh) null;
            discarded$1 = this.a((lh) null, (byte) 117);
          }
          var8 = this.field_J;
          var3 = var8;
          var4 = 0;
          while (var8.length > var4) {
            var5 = var8[var4];
            if (var5 != null &&
              var5.a(1, param1)) {
              return true;
            }
            var4++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ch.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final lh a(boolean param0) {
        lh var4 = null;
        int var5 = SteelSentinels.obfuscationControl;
        if (null == this.field_J) {
          return null;
        }
        lh[] var2 = this.field_J;
        int var3 = 0;
        if (!param0) {
          field_H = (String) null;
        }
        do {
          if (var2.length <= var3) {
            return null;
          }
          var4 = var2[var3];
          if (var4 != null &&
            var4.d(0)) {
            return var4;
          }
          var3++;
        } while (var5 == 0);
        return null;
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        lh[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        lh var10 = null;
        int var11 = 0;
        lh[] var12 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_J == null) {
            return false;
          }
          var12 = this.field_J;
          var8 = var12;
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var9 >= var12.length))) {
            var10 = var12[var9];
            if (var11 == 0) {
              if (var10 != null &&
                var10.a(param0, param1, this.field_o + param2, param3, this.field_z + param4, true, param6)) {
                return true;
              }
              var9++;
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (!param5)) {
            field_L = -105;
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_20_0 = var8_ref;
          stackIn_20_1 = new StringBuilder().append("ch.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -88, param2, param3, param4);
        this.f(140);
        if (param1 > -71) {
          field_O = (k) null;
        }
    }

    final static RgbSprite[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_13_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        int var9 = 0;
        RgbSprite[] var10 = null;
        RgbSprite[] var11_ref_wk__ = null;
        int var11 = 0;
        int var12 = 0;
        RgbSprite var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime2Lifetime1;
        int var12Lifetime2Lifetime2;
        var15 = SteelSentinels.obfuscationControl;
        var9 = param7 + (param1 + param8);
        var10 = new RgbSprite[]{new RgbSprite(var9, var9), new RgbSprite(param0, var9), new RgbSprite(var9, var9), new RgbSprite(var9, param0), new RgbSprite(64, 64), new RgbSprite(var9, param0), new RgbSprite(var9, var9), new RgbSprite(param0, var9), new RgbSprite(var9, var9)};
        var11_ref_wk__ = var10;
        if (param2 != 4) {
          field_N = -114;
        }
        var12 = 0;
        scanLoop1: while (true) {
          if (var12 < var11_ref_wk__.length) {
            var13 = var11_ref_wk__[var12];
            stackIn_13_0 = 0;
            if (var15 != 0) {
              break scanLoop1;
            }
            var14 = stackIn_13_0;
            while (var13.field_E.length > var14) {
              var13.field_E[var14] = param6;
              var14++;
            }
            var12++;
            continue scanLoop1;
          }
          stackIn_13_0 = 0;
          break;
        }
        var11 = stackIn_13_0;
        scanLoop2: while (true) {
          if (var11 < param1) {
            stackIn_24_0 = 0;
            if (var15 != 0) {
              break scanLoop2;
            }
            var12Lifetime1 = stackIn_24_0;
            while (var9 > var12Lifetime1) {
              var10[6].field_E[var12Lifetime1 + var9 * (-1 + (-var11 + var9))] = param3;
              var10[8].field_E[var9 * (-var11 + (var9 - 1)) + var12Lifetime1] = param3;
              var10[2].field_E[var9 * var12Lifetime1 - 1 - (-var9 + var11)] = param3;
              var10[8].field_E[-1 + var9 - var11 + var12Lifetime1 * var9] = param3;
              var12Lifetime1++;
            }
            var11++;
            continue scanLoop2;
          }
          stackIn_24_0 = 0;
          break;
        }
        var11Lifetime1 = stackIn_24_0;
        while (true) {
          stackIn_26_0 = var11Lifetime1;
          stackIn_26_1 = param1;
          if (stackIn_26_0 < stackIn_26_1) {
            stackIn_36_0 = 0;
            if (var15 == 0) {
              var12Lifetime2 = stackIn_36_0;
              while (var12Lifetime2 < var9) {
                var10[0].field_E[var11Lifetime1 * var9 + var12Lifetime2] = param5;
                var10[0].field_E[var11Lifetime1 + var9 * var12Lifetime2] = param5;
                stackIn_26_0 = ~(-var11Lifetime1 + var9);
                stackIn_26_1 = ~var12Lifetime2;
                if (stackIn_26_0 < stackIn_26_1) {
                  var10[2].field_E[var12Lifetime2 + var9 * var11Lifetime1] = param5;
                  var10[6].field_E[var11Lifetime1 + var9 * var12Lifetime2] = param5;
                }
                var12Lifetime2++;
              }
              var11Lifetime1++;
              continue;
            }
          } else {
            stackIn_36_0 = 0;
          }
          var11Lifetime1 = stackIn_36_0;
          scanLoop3: while (true) {
            if (var11Lifetime1 < param0) {
              stackIn_47_0 = 0;
              if (var15 != 0) {
                break scanLoop3;
              }
              var12Lifetime2Lifetime1 = stackIn_47_0;
              while (var12Lifetime2Lifetime1 < param1) {
                var10[7].field_E[(-1 + (-var12Lifetime2Lifetime1 + var9)) * param0 + var11Lifetime1] = param3;
                var10[5].field_E[-1 - (-var9 - (-var12Lifetime2Lifetime1 + var11Lifetime1 * var9))] = param3;
                var10[1].field_E[var12Lifetime2Lifetime1 * param0 + var11Lifetime1] = param5;
                var10[3].field_E[var11Lifetime1 * var9 + var12Lifetime2Lifetime1] = param5;
                var12Lifetime2Lifetime1++;
              }
              var11Lifetime1++;
              continue scanLoop3;
            }
            stackIn_47_0 = 0;
            break;
          }
          var11Lifetime1 = stackIn_47_0;
          scanLoop4: while (param0 >> 1 > var11Lifetime1) {
            var12Lifetime2Lifetime2 = 0;
            while (true) {
              if (param7 > var12Lifetime2Lifetime2) {
                var10[1].field_E[var11Lifetime1 + param0 * (var9 + (-var12Lifetime2Lifetime2 - 1))] = param4;
                var10[3].field_E[var9 * var11Lifetime1 - var12Lifetime2Lifetime2 + (var9 - 1)] = param4;
                var10[7].field_E[param0 * var12Lifetime2Lifetime2 + var11Lifetime1] = param4;
                var10[5].field_E[var9 * var11Lifetime1 + var12Lifetime2Lifetime2] = param4;
                var12Lifetime2Lifetime2++;
                if (var15 == 0) {
                  continue;
                }
              } else {
                var11Lifetime1++;
              }
              break;
            }
            if (var15 == 0) {
              continue scanLoop4;
            }
            break;
          }
          return var10;
        }
    }

    final int b(boolean param0) {
        int var2;
        lh[] var3;
        int var4;
        lh var5;
        int var6;
        int var7;
        var7 = SteelSentinels.obfuscationControl;
        var2 = 0;
        var3 = this.field_J;
        if (!param0) {
          field_P = (String) null;
        }
        var4 = 0;
        while (var4 < var3.length) {
          var5 = var3[var4];
          if (var5 != null) {
            var6 = var5.b(true);
            if (var2 < var6) {
              var2 = var6;
            }
          }
          var4++;
          if (var7 == 0) {
            continue;
          }
          break;
        }
        return var2;
    }

    static {
        field_K = "You must play <%1> more rated games before playing with the current options.";
        field_P = "Game options changed (<%0>)";
        field_N = -1;
        field_I = "<%1> met <%0>'s magic bullet";
        field_L = 4;
        field_M = "Respect";
        field_H = "Cancel unrated rematch";
    }
}

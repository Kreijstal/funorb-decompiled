/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gnb {
    static String field_f;
    private int field_d;
    private int field_g;
    private ksa field_b;
    private ksa field_e;
    static int field_a;
    private ksa[] field_c;

    final ksa b(int param0) {
        ksa var2 = null;
        int var3 = VoidHunters.field_G;
        if (param0 > -42) {
            ((gnb) this).field_b = null;
        }
        if (((gnb) this).field_g > 0) {
            if (((gnb) this).field_e != ((gnb) this).field_c[((gnb) this).field_g + -1]) {
                var2 = ((gnb) this).field_e;
                ((gnb) this).field_e = var2.field_c;
                return var2;
            }
        }
        do {
            if (((gnb) this).field_g >= ((gnb) this).field_d) {
                return null;
            }
            int fieldTemp$0 = ((gnb) this).field_g;
            ((gnb) this).field_g = ((gnb) this).field_g + 1;
            var2 = ((gnb) this).field_c[fieldTemp$0].field_c;
        } while (((gnb) this).field_c[-1 + ((gnb) this).field_g] == var2);
        ((gnb) this).field_e = var2.field_c;
        return var2;
    }

    final void a(long param0, ksa param1, byte param2) {
        ksa var5 = null;
        if (null != param1.field_a) {
            param1.b(-3846);
        }
        if (param2 >= -112) {
            return;
        }
        try {
            var5 = ((gnb) this).field_c[(int)(param0 & (long)(-1 + ((gnb) this).field_d))];
            param1.field_c = var5;
            param1.field_a = var5.field_a;
            param1.field_a.field_c = param1;
            param1.field_c.field_a = param1;
            param1.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "gnb.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static int a(Random param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = VoidHunters.field_G;
        try {
          var2_int = hob.a(param0, oea.field_o, 120);
          var3 = 0;
          L0: while (true) {
            if (56 <= var3) {
              if (param1 > 52) {
                throw new IllegalStateException("No asteroid type found. number_of_asteroids=" + oea.field_o);
              } else {
                stackOut_11_0 = 14;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              }
            } else {
              L1: {
                if (tr.a(108, var3)) {
                  if (0 != var2_int) {
                    var2_int--;
                    break L1;
                  } else {
                    stackOut_6_0 = var3;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                } else {
                  break L1;
                }
              }
              var3++;
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("gnb.D(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
    }

    final static ibb a(int param0, ue[] param1, jp param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        long var3_long = 0L;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        Object stackIn_7_0 = null;
        Object stackIn_24_0 = null;
        ibb stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_23_0 = null;
        ibb stackOut_25_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= param1.length) {
                var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
                var5 = 0;
                L2: while (true) {
                  if (var5 >= param1.length) {
                    L3: {
                      jaggl.OpenGL.glLinkProgramARB(var3_long);
                      jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, hg.field_a, 0);
                      if (0 == hg.field_a[param0]) {
                        L4: {
                          if (0 != hg.field_a[0]) {
                            break L4;
                          } else {
                            System.out.println("Shader linking failed:");
                            break L4;
                          }
                        }
                        L5: {
                          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, hg.field_a, 1);
                          if (hg.field_a[1] <= 1) {
                            break L5;
                          } else {
                            var11 = new byte[hg.field_a[1]];
                            jaggl.OpenGL.glGetInfoLogARB(var3_long, hg.field_a[1], hg.field_a, 0, var11, 0);
                            System.out.println(new String(var11));
                            break L5;
                          }
                        }
                        if (0 == hg.field_a[0]) {
                          var7 = 0;
                          var5 = var7;
                          L6: while (true) {
                            if (var7 >= param1.length) {
                              jaggl.OpenGL.glDeleteObjectARB(var3_long);
                              stackOut_23_0 = null;
                              stackIn_24_0 = stackOut_23_0;
                              return (ibb) (Object) stackIn_24_0;
                            } else {
                              jaggl.OpenGL.glDetachObjectARB(var3_long, param1[var7].field_d);
                              var7++;
                              continue L6;
                            }
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    stackOut_25_0 = new ibb(param2, var3_long, param1);
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    jaggl.OpenGL.glAttachObjectARB(var3_long, param1[var5].field_d);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (param1[var3_int] != null) {
                  if (0L < param1[var3_int].field_d) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (ibb) (Object) stackIn_7_0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("gnb.B(").append(param0).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          L8: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
        return stackIn_26_0;
    }

    final ksa a(long param0, int param1) {
        ksa var5 = null;
        int var6 = VoidHunters.field_G;
        if (param1 <= 96) {
            field_f = null;
        }
        ksa var4 = ((gnb) this).field_c[(int)(param0 & (long)(((gnb) this).field_d - 1))];
        ((gnb) this).field_b = var4.field_c;
        while (var4 != ((gnb) this).field_b) {
            if (((gnb) this).field_b.field_b == param0) {
                var5 = ((gnb) this).field_b;
                ((gnb) this).field_b = ((gnb) this).field_b.field_c;
                return var5;
            }
            ((gnb) this).field_b = ((gnb) this).field_b.field_c;
        }
        ((gnb) this).field_b = null;
        return null;
    }

    final void a(byte param0) {
        int var2 = 0;
        ksa var3 = null;
        ksa var4 = null;
        int var5 = VoidHunters.field_G;
        if (param0 != -103) {
            ((gnb) this).a((byte) -13);
        }
        for (var2 = 0; var2 < ((gnb) this).field_d; var2++) {
            var3 = ((gnb) this).field_c[var2];
            while (true) {
                var4 = var3.field_c;
                if (var3 == var4) {
                    break;
                }
                var4.b(-3846);
            }
        }
        ((gnb) this).field_b = null;
        ((gnb) this).field_e = null;
    }

    public static void b(byte param0) {
        field_f = null;
    }

    final static void a(int param0) {
        if (!(cgb.field_a)) {
            throw new IllegalStateException();
        }
        djb.field_r = true;
        aka.a(true, -125);
        qmb.field_q = 0;
    }

    gnb(int param0) {
        int var2 = 0;
        ksa var3 = null;
        ((gnb) this).field_g = 0;
        ((gnb) this).field_d = param0;
        ((gnb) this).field_c = new ksa[param0];
        for (var2 = 0; var2 < param0; var2++) {
            ksa dupTemp$0 = new ksa();
            var3 = dupTemp$0;
            ((gnb) this).field_c[var2] = dupTemp$0;
            var3.field_c = var3;
            var3.field_a = var3;
        }
    }

    final ksa c(byte param0) {
        ((gnb) this).field_g = 0;
        int var2 = -14 % ((85 - param0) / 35);
        return ((gnb) this).b(-58);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 92;
        field_f = "This password contains your email address, and would be easy to guess";
    }
}

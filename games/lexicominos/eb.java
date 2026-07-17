/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eb {
    static int[] field_d;
    private byte[][] field_i;
    private byte[][] field_e;
    static String field_a;
    static ti field_b;
    private byte[][] field_h;
    static ng field_f;
    int field_g;
    String[][] field_c;

    final void a(wf param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            ((eb) this).field_e = new byte[param0.g((byte) -122)][];
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= ((eb) this).field_e.length) {
                L2: {
                  ((eb) this).field_i = new byte[param0.g((byte) -104)][];
                  if (param1 >= 26) {
                    break L2;
                  } else {
                    ((eb) this).field_g = 72;
                    break L2;
                  }
                }
                var3_int = 0;
                L3: while (true) {
                  if (((eb) this).field_i.length <= var3_int) {
                    var3_int = 0;
                    L4: while (true) {
                      if (((eb) this).field_h.length <= var3_int) {
                        break L0;
                      } else {
                        ((eb) this).field_h[var3_int] = new byte[param0.d((byte) 19)];
                        var4 = new byte[param0.d((byte) 19)];
                        param0.a(96, var4.length, 0, var4);
                        var3_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var4_int = (byte)param0.d(true);
                    var5 = param0.d((byte) 19);
                    ((eb) this).field_i[var3_int] = new byte[1 + var5];
                    ((eb) this).field_i[var3_int][0] = (byte)var4_int;
                    o.a(param0.field_j, param0.field_h, ((eb) this).field_i[var3_int], 1, var5);
                    param0.field_h = param0.field_h + var5;
                    var3_int++;
                    continue L3;
                  }
                }
              } else {
                var4_int = (byte)param0.d(true);
                var5 = param0.d((byte) 19);
                ((eb) this).field_e[var3_int] = new byte[var5 - -1];
                ((eb) this).field_e[var3_int][0] = (byte)var4_int;
                o.a(param0.field_j, param0.field_h, ((eb) this).field_e[var3_int], 1, var5);
                param0.field_h = param0.field_h + var5;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("eb.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
    }

    final static String c(byte param0) {
        if (af.field_b) {
            return null;
        }
        if (dj.field_b > ug.field_m) {
            return null;
        }
        if (!(ik.field_j + dj.field_b <= ug.field_m)) {
            return nc.field_p;
        }
        return null;
    }

    private final boolean a(int param0, byte[][] param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var4_int = -18 % ((51 - param2) / 49);
              if (param1[param0][0] != -1) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("eb.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static db a(byte param0) {
        int var4_int = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        int var1 = bd.field_m[0] * pb.field_h[0];
        byte[] var2 = be.field_f[0];
        int[] var3 = new int[var1];
        int var5 = -59 % ((param0 - -55) / 54);
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = ci.field_b[vg.a(255, (int) var2[var4_int])];
        }
        db var4 = new db(uc.field_fb, eh.field_b, mg.field_x[0], rg.field_c[0], pb.field_h[0], bd.field_m[0], var3);
        gk.a(12428);
        return var4;
    }

    private final int a(byte[][] param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 != param2) {
                break L1;
              } else {
                if (param0.length == 1) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                } else {
                  break L1;
                }
              }
            }
            ne.field_a.field_j = param0[param2];
            ne.field_a.field_h = param1;
            var5_int = 255 & param3;
            var6 = -1;
            var7 = -1;
            L2: while (true) {
              if (var6 >= var5_int) {
                stackOut_11_0 = var7;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                var7 = ne.field_a.g((byte) -109);
                if (var7 != 0) {
                  var6++;
                  continue L2;
                } else {
                  var6 = var6 + (1 + ne.field_a.g((byte) -93));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("eb.D(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_12_0;
    }

    final void a(char[] param0, Random param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int stackIn_8_0 = 0;
        byte[][] stackIn_11_0 = null;
        byte[][] stackIn_12_0 = null;
        byte[][] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        byte[][] stackOut_10_0 = null;
        byte[][] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        byte[][] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 256) {
                break L1;
              } else {
                boolean discarded$2 = this.a(20, (byte[][]) null, (byte) -51);
                break L1;
              }
            }
            if (param0.length == 0) {
              return;
            } else {
              stackOut_6_0 = 256;
              stackIn_8_0 = stackOut_6_0;
              L2: while (true) {
                var5_int = stackIn_8_0;
                var6 = 0;
                L3: while (true) {
                  if (param0.length <= var6) {
                    if (!this.a(param0, 28)) {
                      stackOut_7_0 = 256;
                      stackIn_8_0 = stackOut_7_0;
                      continue L2;
                    } else {
                      break L0;
                    }
                  } else {
                    L4: {
                      stackOut_10_0 = ((eb) this).field_h;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (!param2) {
                        stackOut_12_0 = (byte[][]) (Object) stackIn_12_0;
                        stackOut_12_1 = var5_int;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L4;
                      } else {
                        stackOut_11_0 = (byte[][]) (Object) stackIn_11_0;
                        stackOut_11_1 = 256;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L4;
                      }
                    }
                    var7 = stackIn_13_0[stackIn_13_1];
                    var5_int = 255 & var7[rh.a(param3 + 14561, param1, var7.length)];
                    param0[var6] = el.a((byte)var5_int, (byte) 26);
                    var6++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("eb.G(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(int param0, oj param1, int param2, db param3, char param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        Object var8 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              cg.a(param1.field_f, param3, param2, param5, (byte) -72, param1.field_b, param6, param4);
              if (param0 > 3) {
                break L1;
              } else {
                var8 = null;
                eb.a(121, (oj) null, 17, (db) null, 'ﾍ', 59, 10);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("eb.E(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_f = null;
        field_b = null;
        field_d = null;
    }

    private final boolean a(char[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= -2 + param0.length) {
                var3_int = -1 + param0.length;
                L2: while (true) {
                  if (var3_int < 2) {
                    var3_int = 0;
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    var4 = 1;
                    var5 = var3_int;
                    L3: while (true) {
                      L4: {
                        if (var5 < 0) {
                          break L4;
                        } else {
                          var4 = this.a(((eb) this).field_i, 1, var4, ua.a(true, param0[var5]));
                          if (var4 == 0) {
                            break L4;
                          } else {
                            if (this.a(var4, ((eb) this).field_i, (byte) -35)) {
                              stackOut_18_0 = 0;
                              stackIn_19_0 = stackOut_18_0;
                              return stackIn_19_0 != 0;
                            } else {
                              var5--;
                              continue L3;
                            }
                          }
                        }
                      }
                      var3_int--;
                      continue L2;
                    }
                  }
                }
              } else {
                var4 = 1;
                var5 = var3_int;
                L5: while (true) {
                  L6: {
                    if (param0.length <= var5) {
                      break L6;
                    } else {
                      var4 = this.a(((eb) this).field_i, 1, var4, ua.a(true, param0[var5]));
                      if (var4 == 0) {
                        break L6;
                      } else {
                        if (!this.a(var4, ((eb) this).field_i, (byte) -61)) {
                          var5++;
                          continue L5;
                        } else {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          return stackIn_8_0 != 0;
                        }
                      }
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("eb.I(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + 28 + 41);
        }
        return stackIn_23_0 != 0;
    }

    final int a(char[] param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 1;
            var6 = param2;
            L1: while (true) {
              L2: {
                if (var6 >= param0.length) {
                  break L2;
                } else {
                  L3: {
                    var7 = 0;
                    if (param0[var6] != 0) {
                      var7 = ua.a(true, param0[var6]);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var5 = this.a(((eb) this).field_e, 1, var5, (byte) var7);
                  if (var5 != 0) {
                    L4: {
                      if (this.a(var5, ((eb) this).field_e, (byte) -113)) {
                        var4_int = 1 + (-param2 + var6);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var6++;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var7 = 25 % ((60 - param1) / 44);
              stackOut_12_0 = var4_int;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("eb.K(");
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
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_13_0;
    }

    eb(int param0, int param1) {
        ((eb) this).field_h = new byte[257][];
        ((eb) this).field_c = new String[param1][2];
        ((eb) this).field_g = param0;
    }

    final static int d(byte param0) {
        return ph.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "OF";
    }
}

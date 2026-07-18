/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    private gb field_f;
    static bd field_a;
    static boolean field_d;
    private gb field_c;
    static String field_g;
    static int field_h;
    private jm field_b;
    private jm field_e;

    private final jb a(int[] param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        jb var8 = null;
        qf var9 = null;
        jb stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_17_0 = null;
        jb stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        jb stackOut_2_0 = null;
        Object stackOut_10_0 = null;
        jb stackOut_18_0 = null;
        Object stackOut_16_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            var5_int = param2 ^ (param1 >>> 12 | (-1610608641 & param1) << 4);
            var5_int = var5_int | param1 << 16;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (jb) (Object) ((rd) this).field_e.a(false, var6);
            if (var8 != null) {
              stackOut_2_0 = (jb) var8;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (0 < param0[0]) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              L2: {
                var9 = (qf) (Object) ((rd) this).field_b.a(false, var6);
                if (var9 != null) {
                  break L2;
                } else {
                  var9 = qf.a(((rd) this).field_c, param1, param2);
                  if (var9 != null) {
                    ((rd) this).field_b.a(-122, var6, (am) (Object) var9);
                    break L2;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (jb) (Object) stackIn_11_0;
                  }
                }
              }
              var8 = var9.a(param0);
              if (var8 != null) {
                var9.b(126);
                ((rd) this).field_e.a(-118, var6, (am) (Object) var8);
                stackOut_18_0 = (jb) var8;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                return (jb) (Object) stackIn_17_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("rd.G(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + 97 + ')');
        }
        return stackIn_19_0;
    }

    private final jb a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        jb var8 = null;
        va var9 = null;
        int var10 = 0;
        jb var11 = null;
        jb stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        jb stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        jb stackOut_13_0 = null;
        jb stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var5_int = param3 ^ ((-1879044097 & param1) << 4 | param1 >>> 12);
            var5_int = var5_int | param1 << 16;
            var6 = (long)var5_int;
            var8 = (jb) (Object) ((rd) this).field_e.a(false, var6);
            if (var8 == null) {
              L1: {
                if (param2 == null) {
                  break L1;
                } else {
                  if (param2[0] > 0) {
                    break L1;
                  } else {
                    stackOut_5_0 = null;
                    stackIn_6_0 = stackOut_5_0;
                    return (jb) (Object) stackIn_6_0;
                  }
                }
              }
              var9 = va.a(((rd) this).field_f, param1, param3);
              if (var9 != null) {
                L2: {
                  var11 = var9.a();
                  var8 = var11;
                  ((rd) this).field_e.a(-107, var6, (am) (Object) var8);
                  if (param2 != null) {
                    param2[0] = param2[0] - var11.field_k.length;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var10 = -41 % ((param0 - -60) / 44);
                stackOut_13_0 = (jb) var8;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (jb) var8;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("rd.E(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    final jb a(byte param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        jb stackIn_6_0 = null;
        jb stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        jb stackOut_5_0 = null;
        jb stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          if (param0 < -22) {
            if (1 == ((rd) this).field_c.f(-120)) {
              stackOut_5_0 = this.a(param1, 0, param2, (byte) 97);
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              if (1 != ((rd) this).field_c.c(0, param2)) {
                throw new RuntimeException();
              } else {
                stackOut_8_0 = this.a(param1, param2, 0, (byte) 97);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (jb) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("rd.B(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L0;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L0;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
    }

    final jb a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        jb stackIn_3_0 = null;
        jb stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        jb stackOut_2_0 = null;
        jb stackOut_7_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          if (((rd) this).field_f.f(-114) == 1) {
            stackOut_2_0 = this.a(-117, 0, param0, param2);
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } else {
            L0: {
              if (param1 == 128) {
                break L0;
              } else {
                var5 = null;
                jb discarded$2 = this.a(44, 65, (int[]) null, 71);
                break L0;
              }
            }
            if (((rd) this).field_f.c(0, param2) != 1) {
              throw new RuntimeException();
            } else {
              stackOut_7_0 = this.a(param1 + -76, param2, param0, 0);
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("rd.F(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b() {
        field_a = null;
        field_g = null;
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oj var5 = null;
        oc var6_ref_oc = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        oc var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        boolean[] var16 = null;
        boolean[] var17 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        boolean[] var29 = null;
        boolean[] var34 = null;
        boolean[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        boolean[] var43 = null;
        boolean[] var44 = null;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_109_2 = 0;
        int stackIn_109_3 = 0;
        int stackIn_109_4 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_110_2 = 0;
        int stackIn_110_3 = 0;
        int stackIn_110_4 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        int stackIn_111_3 = 0;
        int stackIn_111_4 = 0;
        int stackIn_111_5 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        int stackIn_112_4 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        int stackIn_113_4 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        int stackIn_114_4 = 0;
        int stackIn_114_5 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        int stackIn_115_4 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        int stackIn_116_3 = 0;
        int stackIn_116_4 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        int stackIn_117_3 = 0;
        int stackIn_117_4 = 0;
        int stackIn_117_5 = 0;
        int stackIn_132_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_108_2 = 0;
        int stackOut_108_3 = 0;
        int stackOut_108_4 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        int stackOut_110_3 = 0;
        int stackOut_110_4 = 0;
        int stackOut_110_5 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        int stackOut_109_3 = 0;
        int stackOut_109_4 = 0;
        int stackOut_109_5 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_111_3 = 0;
        int stackOut_111_4 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_113_4 = 0;
        int stackOut_113_5 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        int stackOut_112_4 = 0;
        int stackOut_112_5 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_114_4 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_116_2 = 0;
        int stackOut_116_3 = 0;
        int stackOut_116_4 = 0;
        int stackOut_116_5 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        int stackOut_115_3 = 0;
        int stackOut_115_4 = 0;
        int stackOut_115_5 = 0;
        int stackOut_131_0 = 0;
        int stackOut_130_0 = 0;
        L0: {
          var24 = HostileSpawn.field_I ? 1 : 0;
          pf.field_I = null;
          if ((5 & el.field_m) == 0) {
            ri.field_h = -1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var1_int = ln.field_a.field_d;
          var2 = ln.field_a.field_n;
          var3 = uj.field_p.field_e;
          var4 = uj.field_p.field_g;
          if (1 == ln.field_a.field_m) {
            si.d();
            break L1;
          } else {
            uf.field_i[4].c(-24 + -var3 / 16, -var4 / 16 + -24);
            break L1;
          }
        }
        L2: {
          stackOut_6_0 = qa.field_b;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (80 > qa.field_b) {
            stackOut_8_0 = stackIn_8_0;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = -80 + qa.field_b;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          stackOut_9_0 = stackIn_9_0;
          stackOut_9_1 = stackIn_9_1;
          stackOut_9_2 = 640 + -qa.field_b;
          stackIn_11_0 = stackOut_9_0;
          stackIn_11_1 = stackOut_9_1;
          stackIn_11_2 = stackOut_9_2;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          stackIn_10_2 = stackOut_9_2;
          if (qa.field_b < 80) {
            stackOut_11_0 = stackIn_11_0;
            stackOut_11_1 = stackIn_11_1;
            stackOut_11_2 = stackIn_11_2;
            stackOut_11_3 = 480;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            stackIn_12_2 = stackOut_11_2;
            stackIn_12_3 = stackOut_11_3;
            break L3;
          } else {
            stackOut_10_0 = stackIn_10_0;
            stackOut_10_1 = stackIn_10_1;
            stackOut_10_2 = stackIn_10_2;
            stackOut_10_3 = 80 + (-qa.field_b + 480);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_12_2 = stackOut_10_2;
            stackIn_12_3 = stackOut_10_3;
            break L3;
          }
        }
        L4: {
          L5: {
            si.d(stackIn_12_0, stackIn_12_1, stackIn_12_2, stackIn_12_3);
            var5 = mm.field_m[0];
            if (hg.field_e != 1) {
              uf.field_i[4].c(-(uf.field_i[4].field_z / 2) + 320, 240 + -(uf.field_i[4].field_A / 2));
              break L5;
            } else {
              L6: {
                var6_ref_oc = new oc();
                ln.field_a.a(-2, 1);
                var10 = var5.field_j;
                if (jf.field_c == 0) {
                  L7: {
                    var11 = var10.field_e;
                    var12 = var10.field_g;
                    if (ha.field_t != 5) {
                      L8: {
                        if (ha.field_t != 6) {
                          break L8;
                        } else {
                          if (~var11 > ~nh.field_E.field_e) {
                            break L8;
                          } else {
                            if (~nh.field_E.field_g < ~var12) {
                              break L8;
                            } else {
                              if (~(nh.field_E.field_e - -2) > ~var11) {
                                break L8;
                              } else {
                                if (~var12 < ~(2 + nh.field_E.field_g)) {
                                  break L8;
                                } else {
                                  kd.a(9, 1);
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                      }
                      L9: {
                        L10: {
                          if (ha.field_t != 0) {
                            break L10;
                          } else {
                            if (var11 < nh.field_E.field_e) {
                              break L10;
                            } else {
                              if (var12 < nh.field_E.field_g) {
                                break L10;
                              } else {
                                if (nh.field_E.field_e - -2 < var11) {
                                  break L10;
                                } else {
                                  if (~var12 >= ~(2 + nh.field_E.field_g)) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (ha.field_t != 14) {
                          break L7;
                        } else {
                          if (nh.field_E.field_e > var11) {
                            break L7;
                          } else {
                            if (~var12 > ~(-3 + nh.field_E.field_g)) {
                              break L7;
                            } else {
                              if (~var11 < ~(nh.field_E.field_e + 4)) {
                                break L7;
                              } else {
                                if (~var12 >= ~(4 + nh.field_E.field_g)) {
                                  break L9;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (bm.field_c == 0) {
                        L11: {
                          if (rl.field_c != 0) {
                            break L11;
                          } else {
                            if (!bj.field_a) {
                              bj.field_a = true;
                              break L7;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (rl.field_c != 1) {
                            break L12;
                          } else {
                            if (!tg.field_a) {
                              tg.field_a = true;
                              break L7;
                            } else {
                              break L12;
                            }
                          }
                        }
                        if (rl.field_c == 9) {
                          mf.a(false, 3);
                          ti.a(253, (byte) -122, 2);
                          break L7;
                        } else {
                          if (2 == rl.field_c) {
                            mf.a(false, 2);
                            ti.a(255, (byte) -112, 0);
                            break L7;
                          } else {
                            mf.a(false, 2);
                            if (6 != rl.field_c) {
                              break L7;
                            } else {
                              ti.a(254, (byte) -10, 1);
                              break L7;
                            }
                          }
                        }
                      } else {
                        break L7;
                      }
                    } else {
                      L13: {
                        var13 = var11 - nh.field_E.field_e;
                        if (0 > var13) {
                          var13 = -var13;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        var14 = var12 + -nh.field_E.field_g;
                        if (var14 >= 0) {
                          break L14;
                        } else {
                          var14 = -var14;
                          break L14;
                        }
                      }
                      L15: {
                        if (var13 >= 10) {
                          break L15;
                        } else {
                          if (var14 >= 10) {
                            break L15;
                          } else {
                            kd.a(6, 1);
                            break L7;
                          }
                        }
                      }
                      break L7;
                    }
                  }
                  if (eh.field_g > 0) {
                    break L6;
                  } else {
                    L16: {
                      if (4 <= mc.field_I) {
                        break L16;
                      } else {
                        eh.field_c.a(fg.field_b[17], 100, 2 * uh.field_i);
                        break L16;
                      }
                    }
                    mf.a(false, 4);
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L17: {
                var11 = var3 / 24;
                var12 = -1 + var4 / 24;
                var14 = 20 + var12 + 1;
                var13 = 2 + var11 + 26;
                if (var12 <= 0) {
                  var12 = 1;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (~(var1_int - 1) >= ~var14) {
                  var14 = var1_int + -2;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (~var13 <= ~(-1 + var1_int)) {
                  var13 = -2 + var1_int;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (var11 > 0) {
                  break L20;
                } else {
                  var11 = 1;
                  break L20;
                }
              }
              var41 = ln.field_a.field_y;
              var44 = ln.field_a.field_B;
              var39 = var44;
              var34 = var39;
              var29 = var34;
              var16 = var29;
              var17 = ln.field_a.field_r;
              var40 = ln.field_a.field_o;
              var43 = ln.field_a.field_e;
              var20 = var12;
              L21: while (true) {
                if (var20 > var14) {
                  var9 = 0;
                  var8 = 0;
                  var42 = ln.field_a.field_u;
                  var6_ref_oc.field_g = var12;
                  L22: while (true) {
                    if (var14 < var6_ref_oc.field_g) {
                      L23: {
                        L24: {
                          lg.a(var4, 0, 0, var3);
                          bi.a(var4, -457, var42, var3);
                          gn.a(var4, var8, var3, 101, var9, var43, var44);
                          if (14 == ul.field_L) {
                            break L24;
                          } else {
                            if (!tg.field_a) {
                              break L23;
                            } else {
                              if (of.field_d == dn.field_i) {
                                break L23;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                        L25: {
                          var21 = 688 + -var3;
                          var22 = 560 + -var4;
                          stackOut_108_0 = var21;
                          stackOut_108_1 = var22;
                          stackOut_108_2 = 64;
                          stackOut_108_3 = 64;
                          stackOut_108_4 = 16776960;
                          stackIn_110_0 = stackOut_108_0;
                          stackIn_110_1 = stackOut_108_1;
                          stackIn_110_2 = stackOut_108_2;
                          stackIn_110_3 = stackOut_108_3;
                          stackIn_110_4 = stackOut_108_4;
                          stackIn_109_0 = stackOut_108_0;
                          stackIn_109_1 = stackOut_108_1;
                          stackIn_109_2 = stackOut_108_2;
                          stackIn_109_3 = stackOut_108_3;
                          stackIn_109_4 = stackOut_108_4;
                          if (ca.field_c >= 256) {
                            stackOut_110_0 = stackIn_110_0;
                            stackOut_110_1 = stackIn_110_1;
                            stackOut_110_2 = stackIn_110_2;
                            stackOut_110_3 = stackIn_110_3;
                            stackOut_110_4 = stackIn_110_4;
                            stackOut_110_5 = 512 - ca.field_c;
                            stackIn_111_0 = stackOut_110_0;
                            stackIn_111_1 = stackOut_110_1;
                            stackIn_111_2 = stackOut_110_2;
                            stackIn_111_3 = stackOut_110_3;
                            stackIn_111_4 = stackOut_110_4;
                            stackIn_111_5 = stackOut_110_5;
                            break L25;
                          } else {
                            stackOut_109_0 = stackIn_109_0;
                            stackOut_109_1 = stackIn_109_1;
                            stackOut_109_2 = stackIn_109_2;
                            stackOut_109_3 = stackIn_109_3;
                            stackOut_109_4 = stackIn_109_4;
                            stackOut_109_5 = ca.field_c;
                            stackIn_111_0 = stackOut_109_0;
                            stackIn_111_1 = stackOut_109_1;
                            stackIn_111_2 = stackOut_109_2;
                            stackIn_111_3 = stackOut_109_3;
                            stackIn_111_4 = stackOut_109_4;
                            stackIn_111_5 = stackOut_109_5;
                            break L25;
                          }
                        }
                        L26: {
                          si.e(stackIn_111_0, stackIn_111_1, stackIn_111_2, stackIn_111_3, stackIn_111_4, stackIn_111_5 >> 1);
                          var23 = 511 & ca.field_c + 64;
                          stackOut_111_0 = 4 + var21;
                          stackOut_111_1 = 4 + var22;
                          stackOut_111_2 = 56;
                          stackOut_111_3 = 56;
                          stackOut_111_4 = 16776960;
                          stackIn_113_0 = stackOut_111_0;
                          stackIn_113_1 = stackOut_111_1;
                          stackIn_113_2 = stackOut_111_2;
                          stackIn_113_3 = stackOut_111_3;
                          stackIn_113_4 = stackOut_111_4;
                          stackIn_112_0 = stackOut_111_0;
                          stackIn_112_1 = stackOut_111_1;
                          stackIn_112_2 = stackOut_111_2;
                          stackIn_112_3 = stackOut_111_3;
                          stackIn_112_4 = stackOut_111_4;
                          if (var23 < 256) {
                            stackOut_113_0 = stackIn_113_0;
                            stackOut_113_1 = stackIn_113_1;
                            stackOut_113_2 = stackIn_113_2;
                            stackOut_113_3 = stackIn_113_3;
                            stackOut_113_4 = stackIn_113_4;
                            stackOut_113_5 = var23;
                            stackIn_114_0 = stackOut_113_0;
                            stackIn_114_1 = stackOut_113_1;
                            stackIn_114_2 = stackOut_113_2;
                            stackIn_114_3 = stackOut_113_3;
                            stackIn_114_4 = stackOut_113_4;
                            stackIn_114_5 = stackOut_113_5;
                            break L26;
                          } else {
                            stackOut_112_0 = stackIn_112_0;
                            stackOut_112_1 = stackIn_112_1;
                            stackOut_112_2 = stackIn_112_2;
                            stackOut_112_3 = stackIn_112_3;
                            stackOut_112_4 = stackIn_112_4;
                            stackOut_112_5 = 512 - var23;
                            stackIn_114_0 = stackOut_112_0;
                            stackIn_114_1 = stackOut_112_1;
                            stackIn_114_2 = stackOut_112_2;
                            stackIn_114_3 = stackOut_112_3;
                            stackIn_114_4 = stackOut_112_4;
                            stackIn_114_5 = stackOut_112_5;
                            break L26;
                          }
                        }
                        L27: {
                          si.e(stackIn_114_0, stackIn_114_1, stackIn_114_2, stackIn_114_3, stackIn_114_4, stackIn_114_5 >> 1);
                          var23 = var23 + 64 & 511;
                          stackOut_114_0 = var21 + 8;
                          stackOut_114_1 = 8 + var22;
                          stackOut_114_2 = 48;
                          stackOut_114_3 = 48;
                          stackOut_114_4 = 16776960;
                          stackIn_116_0 = stackOut_114_0;
                          stackIn_116_1 = stackOut_114_1;
                          stackIn_116_2 = stackOut_114_2;
                          stackIn_116_3 = stackOut_114_3;
                          stackIn_116_4 = stackOut_114_4;
                          stackIn_115_0 = stackOut_114_0;
                          stackIn_115_1 = stackOut_114_1;
                          stackIn_115_2 = stackOut_114_2;
                          stackIn_115_3 = stackOut_114_3;
                          stackIn_115_4 = stackOut_114_4;
                          if (var23 < 256) {
                            stackOut_116_0 = stackIn_116_0;
                            stackOut_116_1 = stackIn_116_1;
                            stackOut_116_2 = stackIn_116_2;
                            stackOut_116_3 = stackIn_116_3;
                            stackOut_116_4 = stackIn_116_4;
                            stackOut_116_5 = var23;
                            stackIn_117_0 = stackOut_116_0;
                            stackIn_117_1 = stackOut_116_1;
                            stackIn_117_2 = stackOut_116_2;
                            stackIn_117_3 = stackOut_116_3;
                            stackIn_117_4 = stackOut_116_4;
                            stackIn_117_5 = stackOut_116_5;
                            break L27;
                          } else {
                            stackOut_115_0 = stackIn_115_0;
                            stackOut_115_1 = stackIn_115_1;
                            stackOut_115_2 = stackIn_115_2;
                            stackOut_115_3 = stackIn_115_3;
                            stackOut_115_4 = stackIn_115_4;
                            stackOut_115_5 = -var23 + 512;
                            stackIn_117_0 = stackOut_115_0;
                            stackIn_117_1 = stackOut_115_1;
                            stackIn_117_2 = stackOut_115_2;
                            stackIn_117_3 = stackOut_115_3;
                            stackIn_117_4 = stackOut_115_4;
                            stackIn_117_5 = stackOut_115_5;
                            break L27;
                          }
                        }
                        si.e(stackIn_117_0, stackIn_117_1, stackIn_117_2, stackIn_117_3, stackIn_117_4, stackIn_117_5 >> 1);
                        break L23;
                      }
                      L28: {
                        if (vj.field_g != 1) {
                          if (vj.field_g != 2) {
                            break L28;
                          } else {
                            int discarded$5 = -118;
                            ad.a();
                            break L28;
                          }
                        } else {
                          lf.a((byte) -122);
                          break L28;
                        }
                      }
                      L29: {
                        vf.a(var1_int, var2, var11, 28, var12, var14, var13);
                        lg.a(var4, 0, 1, var3);
                        ih.a(-15587, var1_int);
                        int discarded$6 = 11178;
                        nj.a();
                        int discarded$7 = 3;
                        nm.a(var1_int);
                        int discarded$8 = 0;
                        hi.b();
                        qa.a(var11, 18, var12, var13, var14, var1_int, var2);
                        ei.d(-114);
                        if (null == pf.field_I) {
                          break L29;
                        } else {
                          id.field_A.b(pf.field_I, lh.field_a, -8 + aj.field_d, 16772608, 0);
                          break L29;
                        }
                      }
                      L30: {
                        L31: {
                          int discarded$9 = -125;
                          dd.g();
                          if (null == q.field_g) {
                            break L31;
                          } else {
                            if (!q.field_g.b(96)) {
                              break L30;
                            } else {
                              break L31;
                            }
                          }
                        }
                        L32: {
                          L33: {
                            if (ul.field_L > 1) {
                              break L33;
                            } else {
                              if (ul.field_L != -1) {
                                stackOut_131_0 = 0;
                                stackIn_132_0 = stackOut_131_0;
                                break L32;
                              } else {
                                break L33;
                              }
                            }
                          }
                          stackOut_130_0 = 1;
                          stackIn_132_0 = stackOut_130_0;
                          break L32;
                        }
                        L34: {
                          var21 = stackIn_132_0;
                          if (bm.field_c != 0) {
                            break L34;
                          } else {
                            if (rl.field_c != 0) {
                              break L34;
                            } else {
                              if (of.field_d == dn.field_i) {
                                var21 = 0;
                                break L34;
                              } else {
                                break L34;
                              }
                            }
                          }
                        }
                        L35: {
                          if (0 != bm.field_c) {
                            break L35;
                          } else {
                            if (1 != rl.field_c) {
                              break L35;
                            } else {
                              if (dn.field_i != of.field_d) {
                                break L35;
                              } else {
                                var21 = 0;
                                break L35;
                              }
                            }
                          }
                        }
                        L36: {
                          if (bm.field_c != 0) {
                            break L36;
                          } else {
                            if (8 != rl.field_c) {
                              break L36;
                            } else {
                              if (3 != ha.field_t) {
                                break L36;
                              } else {
                                if (!pm.field_a) {
                                  break L36;
                                } else {
                                  var21 = 0;
                                  break L36;
                                }
                              }
                            }
                          }
                        }
                        if (var21 != 0) {
                          nh.field_P.a((byte) -46);
                          break L30;
                        } else {
                          L37: {
                            var6 = 0;
                            if (mc.field_I == 5) {
                              var6 = 16777215;
                              break L37;
                            } else {
                              break L37;
                            }
                          }
                          L38: {
                            if (0 >= jf.field_c) {
                              break L38;
                            } else {
                              if (128 > jf.field_c) {
                                si.a(0, 0, 640, 480, var6, jf.field_c * 2);
                                break L38;
                              } else {
                                break L38;
                              }
                            }
                          }
                          L39: {
                            if (128 > jf.field_c) {
                              break L39;
                            } else {
                              if (jf.field_c < 256) {
                                si.a(0, 0, 640, 480, var6, 512 + -(2 * jf.field_c));
                                break L39;
                              } else {
                                break L39;
                              }
                            }
                          }
                          cb.a(631, var5);
                          if (0 < lg.field_f) {
                            var7 = 0;
                            L40: while (true) {
                              if (20 <= var7) {
                                break L4;
                              } else {
                                si.e(0 - -var7, var7, -(var7 * 2) + 640, -(var7 * 2) + 480, 16711680, lg.field_f * (20 - var7) / 4);
                                var7++;
                                continue L40;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      break L5;
                    } else {
                      var6_ref_oc.field_e = var11;
                      L41: while (true) {
                        if (~var13 > ~var6_ref_oc.field_e) {
                          var6_ref_oc.field_g = var6_ref_oc.field_g + 1;
                          continue L22;
                        } else {
                          L42: {
                            var7 = var6_ref_oc.b(-4);
                            vf.a(-63, var7);
                            if (18 > var41[var7]) {
                              break L42;
                            } else {
                              if (21 < var41[var7]) {
                                break L42;
                              } else {
                                if (16 <= var42[var7]) {
                                  break L42;
                                } else {
                                  var42[var7] = 16;
                                  break L42;
                                }
                              }
                            }
                          }
                          var6_ref_oc.field_e = var6_ref_oc.field_e + 1;
                          continue L41;
                        }
                      }
                    }
                  }
                } else {
                  var9 = -var4 + var20 * 24;
                  var7 = var1_int * var20 - -var11;
                  var21 = var11;
                  L43: while (true) {
                    if (~var21 < ~var13) {
                      var20++;
                      continue L21;
                    } else {
                      L44: {
                        L45: {
                          var7++;
                          var22 = var40[var7];
                          if (var22 >> 8 != 4) {
                            break L45;
                          } else {
                            if (bm.field_c != 0) {
                              break L45;
                            } else {
                              if (rl.field_c != 2) {
                                break L45;
                              } else {
                                if (ha.field_t != 14) {
                                  break L44;
                                } else {
                                  break L45;
                                }
                              }
                            }
                          }
                        }
                        L46: {
                          if (-1 == var40[var7]) {
                            break L46;
                          } else {
                            if (0 >= ak.field_b[var22].field_a) {
                              break L44;
                            } else {
                              break L46;
                            }
                          }
                        }
                        L47: {
                          if (!pa.field_d) {
                            break L47;
                          } else {
                            if (var16[var7]) {
                              break L47;
                            } else {
                              if (!var17[var7]) {
                                break L47;
                              } else {
                                break L44;
                              }
                            }
                          }
                        }
                        if (pk.field_d[var41[var7]] == null) {
                          break L44;
                        } else {
                          var8 = -var3 + 24 * var21;
                          pk.field_d[var41[var7]].e(var8, var9);
                          break L44;
                        }
                      }
                      var21++;
                      continue L43;
                    }
                  }
                }
              }
            }
          }
          L48: {
            var6 = 0;
            if (mc.field_I == 5) {
              var6 = 16777215;
              break L48;
            } else {
              break L48;
            }
          }
          L49: {
            if (0 >= jf.field_c) {
              break L49;
            } else {
              if (128 > jf.field_c) {
                si.a(0, 0, 640, 480, var6, jf.field_c * 2);
                break L49;
              } else {
                break L49;
              }
            }
          }
          L50: {
            if (128 > jf.field_c) {
              break L50;
            } else {
              if (jf.field_c < 256) {
                si.a(0, 0, 640, 480, var6, 512 + -(2 * jf.field_c));
                break L50;
              } else {
                break L50;
              }
            }
          }
          cb.a(631, var5);
          if (0 < lg.field_f) {
            var7 = 0;
            L51: while (true) {
              if (20 <= var7) {
                break L4;
              } else {
                si.e(0 - -var7, var7, -(var7 * 2) + 640, -(var7 * 2) + 480, 16711680, lg.field_f * (20 - var7) / 4);
                var7++;
                continue L51;
              }
            }
          } else {
            break L4;
          }
        }
        L52: {
          if (li.field_q < 2) {
            break L52;
          } else {
            break L52;
          }
        }
    }

    final static void a() {
        try {
            if (null != q.field_b) {
                try {
                    q.field_b.a(0L, (byte) 109);
                    q.field_b.a(24, sc.field_g.field_i, sc.field_g.field_n, (byte) 60);
                } catch (Exception exception) {
                }
            }
            sc.field_g.field_i = sc.field_g.field_i + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rd(gb param0, gb param1) {
        ((rd) this).field_b = new jm(256);
        ((rd) this).field_e = new jm(256);
        try {
            ((rd) this).field_f = param0;
            ((rd) this).field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "rd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Waiting for music";
        field_h = 10;
        field_d = false;
    }
}

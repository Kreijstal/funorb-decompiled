/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    private kk field_b;
    static ba field_a;
    private id field_d;
    private kk field_e;
    static int field_c;
    private id field_f;

    final ik a(int[] param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        ik stackIn_3_0 = null;
        ik stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ik stackOut_2_0 = null;
        ik stackOut_7_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          if (((jc) this).field_e.b(0) == 1) {
            stackOut_2_0 = this.b(0, 13242, param2, param0);
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } else {
            L0: {
              if (!param1) {
                break L0;
              } else {
                ((jc) this).field_d = null;
                break L0;
              }
            }
            if (((jc) this).field_e.a(param2, (byte) -91) != 1) {
              throw new RuntimeException();
            } else {
              stackOut_7_0 = this.b(param2, 13242, 0, param0);
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("jc.F(");
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
          throw sl.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final ik a(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ik var8 = null;
        ml var9 = null;
        ik stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_11_0 = null;
        ik stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        ik stackOut_2_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_10_0 = null;
        ik stackOut_18_0 = null;
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
            var5_int = ((1879052287 & param1) << 4 | param1 >>> 12) ^ param2;
            var5_int = var5_int | param1 << 16;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (ik) (Object) ((jc) this).field_f.a(param0 ^ -27322, var6);
            if (var8 != null) {
              stackOut_2_0 = (ik) var8;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param3 == null) {
                  break L1;
                } else {
                  if (0 < param3[0]) {
                    break L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (ik) (Object) stackIn_7_0;
                  }
                }
              }
              L2: {
                var9 = (ml) (Object) ((jc) this).field_d.a(8434, var6);
                if (var9 != null) {
                  break L2;
                } else {
                  var9 = ml.a(((jc) this).field_b, param1, param2);
                  if (var9 != null) {
                    ((jc) this).field_d.a(false, var6, (fc) (Object) var9);
                    break L2;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (ik) (Object) stackIn_11_0;
                  }
                }
              }
              L3: {
                var8 = var9.a(param3);
                if (param0 == -19020) {
                  break L3;
                } else {
                  ((jc) this).field_e = null;
                  break L3;
                }
              }
              if (var8 != null) {
                var9.a(-35);
                ((jc) this).field_f.a(false, var6, (fc) (Object) var8);
                stackOut_18_0 = (ik) var8;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("jc.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0;
    }

    private final ik b(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ik var8 = null;
        cc var9 = null;
        ik var10 = null;
        ik stackIn_4_0 = null;
        ik stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ik stackOut_15_0 = null;
        ik stackOut_3_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            var5_int = (65533 & param0 << 4 | param0 >>> 12) ^ param2;
            var5_int = var5_int | param0 << 16;
            var6 = (long)var5_int;
            var8 = (ik) (Object) ((jc) this).field_f.a(8434, var6);
            if (var8 == null) {
              L1: {
                if (param3 == null) {
                  break L1;
                } else {
                  if (param3[0] > 0) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var9 = cc.a(((jc) this).field_e, param0, param2);
              if (var9 != null) {
                L2: {
                  var10 = var9.b();
                  var8 = var10;
                  ((jc) this).field_f.a(false, var6, (fc) (Object) var8);
                  if (param3 != null) {
                    param3[0] = param3[0] - var10.field_j.length;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_15_0 = (ik) var8;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_3_0 = (ik) var8;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("jc.B(").append(param0).append(44).append(13242).append(44).append(param2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    final ik a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        ik stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ik stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ik stackOut_8_0 = null;
        Object stackOut_4_0 = null;
        ik stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          if (1 != ((jc) this).field_b.b(0)) {
            if (param1 == -2059411540) {
              if (1 == ((jc) this).field_b.a(param2, (byte) -91)) {
                stackOut_8_0 = this.a(param1 + 2059392520, param2, 0, param0);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                throw new RuntimeException();
              }
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (ik) (Object) stackIn_5_0;
            }
          } else {
            stackOut_1_0 = this.a(param1 + 2059392520, 0, param2, param0);
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("jc.G(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static ic a() {
        if (ok.field_D == null) {
            ok.field_D = new ic(fk.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, fk.field_a.field_G, -1, 2147483647, true);
        }
        return ok.field_D;
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 15;
    }

    final static String b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = TrackController.field_F ? 1 : 0;
        if (param0 < 66) {
            return null;
        }
        String var1 = "(" + o.field_a + " " + u.field_o + " " + mc.field_L + ") " + uk.field_c;
        if (hd.field_o > 0) {
            var1 = var1 + ":";
            for (var2 = 0; var2 < hd.field_o; var2++) {
                var1 = var1 + 32;
                var3 = ne.field_a.field_j[var2] & 255;
                var4 = var3 >> 4;
                var3 = var3 & 15;
                if (var4 >= 10) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                var1 = var1 + (char)var4;
                if (10 > var3) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var1 + (char)var3;
            }
        }
        return var1;
    }

    jc(kk param0, kk param1) {
        ((jc) this).field_d = new id(256);
        ((jc) this).field_f = new id(256);
        try {
            ((jc) this).field_e = param0;
            ((jc) this).field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "jc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}

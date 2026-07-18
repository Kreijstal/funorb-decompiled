/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static String field_a;
    private tg field_e;
    static cf field_c;
    private vj field_h;
    static he[] field_g;
    static byte[] field_b;
    private vj field_d;
    private tg field_f;

    final static void a(byte param0) {
        sg.field_a = false;
        oi.field_c = false;
        sf.a(-1, 11649);
        lc.field_h = pj.field_D;
        fk.field_q = pj.field_D;
        if (param0 == -107) {
            return;
        }
        field_g = null;
    }

    private final vk a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        vk var8 = null;
        tk var9 = null;
        vk stackIn_5_0 = null;
        Object stackIn_18_0 = null;
        vk stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk stackOut_4_0 = null;
        vk stackOut_19_0 = null;
        Object stackOut_17_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              var5_int = (param1 >>> 12 | (4095 & param1) << 4) ^ param0;
              var5_int = var5_int | param1 << 16;
              if (param3 < -88) {
                break L1;
              } else {
                cf.a((byte) -46);
                break L1;
              }
            }
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (vk) (Object) ((cf) this).field_f.a(true, var6);
            if (var8 != null) {
              stackOut_4_0 = (vk) var8;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L2: {
                if (param2 == null) {
                  break L2;
                } else {
                  if (0 < param2[0]) {
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              L3: {
                var9 = (tk) (Object) ((cf) this).field_e.a(true, var6);
                if (var9 == null) {
                  var9 = tk.a(((cf) this).field_h, param1, param0);
                  if (var9 != null) {
                    ((cf) this).field_e.a((gi) (Object) var9, var6, -1);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8 = var9.a(param2);
              if (var8 != null) {
                var9.a(-16175);
                ((cf) this).field_f.a((gi) (Object) var8, var6, -1);
                stackOut_19_0 = (vk) var8;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                stackOut_17_0 = null;
                stackIn_18_0 = stackOut_17_0;
                return (vk) (Object) stackIn_18_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("cf.D(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param3 + ')');
        }
        return stackIn_20_0;
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            uc.b();
            b.field_m = 11;
            fc.field_b = new int[260];
            var1_int = 0;
            L1: while (true) {
              if (256 <= var1_int) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (var5 >= fc.field_b.length) {
                    break L0;
                  } else {
                    fc.field_b[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                fc.field_b[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "cf.E(" + false + ')');
        }
    }

    private final vk b(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        vk var8 = null;
        kb var9 = null;
        Object var10 = null;
        vk var11 = null;
        vk stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        vk stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        vk stackOut_15_0 = null;
        vk stackOut_1_0 = null;
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
            var5_int = param3 ^ (param0 >>> 12 | (param0 & 536875007) << 4);
            var5_int = var5_int | param0 << 16;
            var6 = (long)var5_int;
            var8 = (vk) (Object) ((cf) this).field_f.a(true, var6);
            if (var8 == null) {
              L1: {
                if (param1 == -609592560) {
                  break L1;
                } else {
                  var10 = null;
                  vk discarded$2 = this.b(-34, -12, (int[]) null, 51);
                  break L1;
                }
              }
              L2: {
                if (param2 == null) {
                  break L2;
                } else {
                  if (param2[0] > 0) {
                    break L2;
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    return (vk) (Object) stackIn_8_0;
                  }
                }
              }
              var9 = kb.a(((cf) this).field_d, param0, param3);
              if (var9 != null) {
                L3: {
                  var11 = var9.a();
                  var8 = var11;
                  ((cf) this).field_f.a((gi) (Object) var8, var6, -1);
                  if (param2 != null) {
                    param2[0] = param2[0] - var11.field_i.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_15_0 = (vk) var8;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (vk) var8;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("cf.C(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_g = null;
        field_a = null;
    }

    final vk a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        vk stackIn_5_0 = null;
        vk stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk stackOut_4_0 = null;
        vk stackOut_7_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param0 == 256) {
              break L0;
            } else {
              var5 = null;
              vk discarded$2 = ((cf) this).a((int[]) null, -91, -63);
              break L0;
            }
          }
          if (((cf) this).field_h.b(param0 + -16288) == 1) {
            stackOut_4_0 = this.a(param1, 0, param2, -106);
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          } else {
            if (((cf) this).field_h.a(param1, (byte) 127) != 1) {
              throw new RuntimeException();
            } else {
              stackOut_7_0 = this.a(0, param1, param2, -93);
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("cf.B(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          throw ie.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    cf(vj param0, vj param1) {
        ((cf) this).field_e = new tg(256);
        ((cf) this).field_f = new tg(256);
        try {
            ((cf) this).field_h = param1;
            ((cf) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "cf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final vk a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        vk stackIn_3_0 = null;
        vk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk stackOut_2_0 = null;
        vk stackOut_6_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          if (((cf) this).field_d.b(-16032) == 1) {
            stackOut_2_0 = this.b(0, -609592560, param0, param1);
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } else {
            if (((cf) this).field_d.a(param1, (byte) 127) == param2) {
              stackOut_6_0 = this.b(param1, -609592560, param0, 0);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("cf.G(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L0;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L0;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Confirm Password: ";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class jd extends tfa implements lv {
    private int field_k;
    private int field_l;
    static String field_m;
    private int field_n;

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != null) {
            L0: {
              var2_int = 0;
              var3 = param1.length();
              if (param0 == 1) {
                break L0;
              } else {
                field_m = null;
                break L0;
              }
            }
            L1: while (true) {
              L2: {
                if (var2_int >= var3) {
                  break L2;
                } else {
                  if (!hf.a(param0 ^ 114, param1.charAt(var2_int))) {
                    break L2;
                  } else {
                    var2_int++;
                    continue L1;
                  }
                }
              }
              L3: while (true) {
                L4: {
                  if (var2_int >= var3) {
                    break L4;
                  } else {
                    if (!hf.a(param0 ^ 116, param1.charAt(var3 - 1))) {
                      break L4;
                    } else {
                      var3--;
                      continue L3;
                    }
                  }
                }
                var4 = var3 + -var2_int;
                if (var4 >= 1) {
                  if (var4 <= 12) {
                    var5 = new StringBuilder(var4);
                    var6 = var2_int;
                    L5: while (true) {
                      if (var3 <= var6) {
                        if (var5.length() != 0) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        L6: {
                          var7 = param1.charAt(var6);
                          if (ov.a(param0 + 16, (char) var7)) {
                            var8 = cp.a((byte) 0, (char) var7);
                            if (0 == var8) {
                              break L6;
                            } else {
                              StringBuilder discarded$1 = var5.append(var8);
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        }
                        var6++;
                        continue L5;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("jd.C(").append(param0).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 41);
        }
    }

    final static Class a(Object param0) {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_24_0 = null;
        Class stackOut_20_0 = null;
        Class stackOut_17_0 = null;
        Class stackOut_14_0 = null;
        Class stackOut_11_0 = null;
        Class stackOut_8_0 = null;
        Class stackOut_5_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (Integer.class.isInstance(param0)) {
              stackOut_2_0 = Integer.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (!Byte.class.isInstance(param0)) {
                if (!Short.class.isInstance(param0)) {
                  if (!Long.class.isInstance(param0)) {
                    if (!Boolean.class.isInstance(param0)) {
                      if (!Float.class.isInstance(param0)) {
                        if (!Double.class.isInstance(param0)) {
                          if (Character.class.isInstance(param0)) {
                            stackOut_24_0 = Character.TYPE;
                            stackIn_25_0 = stackOut_24_0;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackOut_20_0 = Double.TYPE;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      } else {
                        stackOut_17_0 = Float.TYPE;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    } else {
                      stackOut_14_0 = Boolean.TYPE;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  } else {
                    stackOut_11_0 = Long.TYPE;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                } else {
                  stackOut_8_0 = Short.TYPE;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = Byte.TYPE;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var2;
            stackOut_27_1 = new StringBuilder().append("jd.F(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L1;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + 0 + 41);
        }
        return stackIn_25_0;
    }

    jd(kda param0, ft param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, 32879, param1, una.field_g, param4 * param2 * param3, false);
        try {
            ((jd) this).field_n = param4;
            ((jd) this).field_l = param3;
            ((jd) this).field_k = param2;
            ((jd) this).field_j.a(true, (iva) this);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glTexImage3Dub(((jd) this).field_i, 0, ((jd) this).d(120), ((jd) this).field_k, ((jd) this).field_l, ((jd) this).field_n, 0, waa.a(((jd) this).field_f, 1383), 5121, param5, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(int param0, hs param1) {
        try {
            if (param0 != 7672) {
                ((jd) this).field_k = 12;
            }
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jd.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_m = null;
    }

    final static String a(boolean param0) {
        String var1 = null;
        String[] var2 = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var1 = "";
        var2 = dra.field_b;
        var3 = 0;
        L0: while (true) {
          if (var2.length <= var3) {
            return var1;
          } else {
            var4 = var2[var3];
            if (!var4.startsWith("Unused")) {
              var1 = var1 + var4 + "\n";
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    public final void b(byte param0) {
        if (param0 < 32) {
            Object var3 = null;
            String discarded$0 = jd.a(-106, (CharSequence) null);
        }
        super.b((byte) 56);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Mobile mirrors";
    }
}

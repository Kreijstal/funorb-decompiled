/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    String field_a;
    float field_c;
    static boolean field_e;
    private int field_f;
    private rh[] field_h;
    static boolean field_g;
    private int field_d;
    private int field_b;

    final static String a(String param0, int param1, char param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              var5 = param0.length();
              var6 = var4_int;
              var7 = var5 - 1;
              if (var7 != 0) {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param3.indexOf('_', var8_int);
                  if (0 > var8_int) {
                    break L1;
                  } else {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param3.indexOf('_', var9);
              if (var10 >= 0) {
                StringBuilder discarded$13 = var8.append(param3.substring(var9, var10));
                var9 = var10 - -1;
                StringBuilder discarded$14 = var8.append(param0);
                continue L3;
              } else {
                StringBuilder discarded$15 = var8.append(param3.substring(var9));
                stackOut_10_0 = var8.toString();
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ml.D(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(-30614).append(',').append('_').append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    final boolean a(byte param0) {
        rh var2 = null;
        int var3 = 0;
        rh var4 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        L0: while (true) {
          if (((ml) this).field_b <= ((ml) this).field_d) {
            if (param0 < 108) {
              return true;
            } else {
              return true;
            }
          } else {
            var4 = ((ml) this).field_h[((ml) this).field_d];
            var2 = var4;
            if (var4.field_d.c((byte) -121)) {
              L1: {
                if (0 > var4.field_c) {
                  break L1;
                } else {
                  if (var4.field_d.a(var4.field_c, -1)) {
                    break L1;
                  } else {
                    this.a(var2, var4.field_d.b((byte) 99, var4.field_c), 76);
                    return false;
                  }
                }
              }
              L2: {
                if (null == var4.field_a) {
                  break L2;
                } else {
                  if (!var4.field_d.a(2, var4.field_a)) {
                    this.a(var2, var4.field_d.d(-1, var4.field_a), 72);
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var4.field_c >= 0) {
                  break L3;
                } else {
                  if (var4.field_a != null) {
                    break L3;
                  } else {
                    if (null == var4.field_h) {
                      break L3;
                    } else {
                      if (var4.field_d.b(true)) {
                        break L3;
                      } else {
                        this.a(var2, var4.field_d.b((byte) -66), 82);
                        return false;
                      }
                    }
                  }
                }
              }
              ((ml) this).field_d = ((ml) this).field_d + 1;
              continue L0;
            } else {
              this.a(var4, 0, 84);
              return false;
            }
          }
        }
    }

    private final void a(rh param0, int param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              var4_float = (float)(((ml) this).field_d - -1) + (float)param1 / 100.0f;
              ((ml) this).field_c = var4_float * (float)((ml) this).field_f / (float)(((ml) this).field_b + 1);
              if (0 == param1) {
                ((ml) this).field_a = param0.field_b;
                break L1;
              } else {
                ((ml) this).field_a = param0.field_h + " - " + param1 + "%";
                break L1;
              }
            }
            if (param2 >= 26) {
              break L0;
            } else {
              field_g = true;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ml.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static cf[] a(int param0, jd param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        cf[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        cf var6 = null;
        int var7 = 0;
        cf[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        cf[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.d((byte) 48, 8);
            if (var2_int <= 0) {
              var3 = param1.d((byte) 48, 12);
              var4 = new cf[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_13_0 = (cf[]) var4;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L2: {
                    if (wa.a(param1, (byte) -121)) {
                      var6 = new cf();
                      int discarded$102 = param1.d((byte) 48, 24);
                      int discarded$103 = param1.d((byte) 48, 24);
                      var6.field_a = param1.d((byte) 48, 24);
                      int discarded$104 = param1.d((byte) 48, 9);
                      int discarded$105 = param1.d((byte) 48, 12);
                      int discarded$106 = param1.d((byte) 48, 12);
                      int discarded$107 = param1.d((byte) 48, 12);
                      var4[var5] = var6;
                      var5++;
                      break L2;
                    } else {
                      var6_int = param1.d((byte) 48, ac.a(var5 + -1, 125));
                      var4[var5] = var4[var6_int];
                      var5++;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("ml.B(").append(22795).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    private ml() throws Throwable {
        throw new Error();
    }

    static {
    }
}

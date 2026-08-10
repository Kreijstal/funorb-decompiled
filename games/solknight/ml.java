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
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              if (param1 == -30614) {
                break L1;
              } else {
                field_e = true;
                break L1;
              }
            }
            L2: {
              var5 = param0.length();
              var6 = var4_int;
              var7 = var5 - 1;
              if (var7 != 0) {
                var8_int = 0;
                L3: while (true) {
                  var8_int = param3.indexOf((int) param2, var8_int);
                  if (0 > var8_int) {
                    break L2;
                  } else {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param3.indexOf((int) param2, var9);
              if (-1 >= (var10 ^ -1)) {
                discarded$2 = var8.append(param3.substring(var9, var10));
                var9 = var10 - -1;
                discarded$3 = var8.append(param0);
                continue L4;
              } else {
                discarded$4 = var8.append(param3.substring(var9));
                stackIn_13_0 = var8.toString();
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("ml.D(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        return stackIn_13_0;
    }

    final boolean a(byte param0) {
        rh var2;
        int var3;
        rh var4;
        var3 = SolKnight.field_L ? 1 : 0;
        L0: while (true) {
          if (this.field_b <= this.field_d) {
            if (param0 < 108) {
              return true;
            } else {
              return true;
            }
          } else {
            var4 = this.field_h[this.field_d];
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
              this.field_d = this.field_d + 1;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_float = (float)(this.field_d - -1) + (float)param1 / 100.0f;
              this.field_c = var4_float * (float)this.field_f / (float)(this.field_b + 1);
              if (0 == param1) {
                this.field_a = param0.field_b;
                break L1;
              } else {
                this.field_a = param0.field_h + " - " + param1 + "%";
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
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("ml.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static cf[] a(int param0, jd param1) {
        int var2_int = 0;
        int var3 = 0;
        cf[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        cf var6 = null;
        int var7 = 0;
        cf[] stackIn_6_0 = null;
        cf[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.d((byte) 48, 8);
            if (var2_int <= 0) {
              if (param0 == 22795) {
                var3 = param1.d((byte) 48, 12);
                var4 = new cf[var3];
                var5 = 0;
                L1: while (true) {
                  if (var3 <= var5) {
                    stackIn_15_0 = (cf[]) (var4);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      if (wa.a(param1, (byte) -121)) {
                        var6 = new cf();
                        param1.d((byte) 48, 24);
                        param1.d((byte) 48, 24);
                        var6.field_a = param1.d((byte) 48, 24);
                        param1.d((byte) 48, 9);
                        param1.d((byte) 48, 12);
                        param1.d((byte) 48, 12);
                        param1.d((byte) 48, 12);
                        var4[var5] = var6;
                        break L2;
                      } else {
                        var6_int = param1.d((byte) 48, ac.a(var5 + -1, 125));
                        var4[var5] = var4[var6_int];
                        break L2;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = (cf[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("ml.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_15_0;
        }
    }

    private ml() throws Throwable {
        throw new Error();
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private int field_i;
    String field_e;
    static boolean field_d;
    static char field_h;
    private wa[] field_f;
    private int field_a;
    float field_g;
    private int field_c;
    static nf field_b;

    final void a(boolean param0, String param1, String param2, mi param3, String param4) {
        try {
            if (param0) {
                ((ad) this).field_a = 77;
            }
            this.a(param4, param2, -1, -7057, param3, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ad.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(wa param0, boolean param1, int param2) {
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
          var4_float = (float)param2 / 100.0f + (float)(1 + ((ad) this).field_c);
          ((ad) this).field_g = var4_float * (float)((ad) this).field_a / (float)(1 + ((ad) this).field_i);
          if (param1) {
            if (param2 == 0) {
              ((ad) this).field_e = param0.field_a;
              return;
            } else {
              ((ad) this).field_e = param0.field_c + " - " + param2 + "%";
              return;
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ad.B(");
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
              break L0;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L0;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -2) {
            ad.a((byte) -25);
        }
    }

    final void a(byte param0, mi param1, String param2, String param3) {
        RuntimeException runtimeException = null;
        Object var6 = null;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
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
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              this.a((String) null, param3, -1, param0 ^ 7061, param1, param2);
              if (param0 == -6) {
                break L1;
              } else {
                var6 = null;
                this.a((String) null, (String) null, -81, 87, (mi) null, (String) null);
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
            stackOut_3_1 = new StringBuilder().append("ad.D(").append(param0).append(44);
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
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    private final void a(String param0, String param1, int param2, int param3, mi param4, String param5) {
        wa[] var9 = null;
        wa var8 = null;
        wa var10 = null;
        try {
            if (((ad) this).field_f.length <= ((ad) this).field_i) {
                var9 = new wa[2 * ((ad) this).field_i];
                wa[] var7 = var9;
                lj.a((Object[]) (Object) ((ad) this).field_f, 0, (Object[]) (Object) var9, 0, ((ad) this).field_i);
                ((ad) this).field_f = var9;
            }
            var8 = new wa();
            var10 = var8;
            wa var7_ref = var10;
            var10.field_a = param5;
            var10.field_b = param0;
            var10.field_f = param2;
            if (param3 != -7057) {
                ((ad) this).field_g = -0.6586758494377136f;
            }
            var10.field_e = param4;
            var10.field_c = param1;
            int fieldTemp$0 = ((ad) this).field_i;
            ((ad) this).field_i = ((ad) this).field_i + 1;
            ((ad) this).field_f[fieldTemp$0] = var8;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ad.E(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(int param0) {
        wa var2 = null;
        int var3 = 0;
        wa var4 = null;
        var3 = Confined.field_J ? 1 : 0;
        L0: while (true) {
          if (((ad) this).field_c >= ((ad) this).field_i) {
            if (param0 != -1) {
              return false;
            } else {
              return true;
            }
          } else {
            var4 = ((ad) this).field_f[((ad) this).field_c];
            var2 = var4;
            if (!var4.field_e.b(param0 + 1)) {
              this.a(var4, true, 0);
              return false;
            } else {
              L1: {
                if (var4.field_f < 0) {
                  break L1;
                } else {
                  if (var4.field_e.a(var4.field_f, 0)) {
                    break L1;
                  } else {
                    this.a(var2, true, var4.field_e.b(var4.field_f, -72));
                    return false;
                  }
                }
              }
              L2: {
                if (var4.field_b == null) {
                  break L2;
                } else {
                  if (var4.field_e.a(var4.field_b, ~param0)) {
                    break L2;
                  } else {
                    this.a(var2, true, var4.field_e.b(-8087, var4.field_b));
                    return false;
                  }
                }
              }
              L3: {
                if (var4.field_f >= 0) {
                  break L3;
                } else {
                  if (var4.field_b != null) {
                    break L3;
                  } else {
                    if (var4.field_c == null) {
                      break L3;
                    } else {
                      if (!var4.field_e.a(25057)) {
                        this.a(var2, true, var4.field_e.c(param0 + -123));
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((ad) this).field_c = ((ad) this).field_c + 1;
              continue L0;
            }
          }
        }
    }

    ad(int param0) {
        ((ad) this).field_f = new wa[16];
        ((ad) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
    }
}

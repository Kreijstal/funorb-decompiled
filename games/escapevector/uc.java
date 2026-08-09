/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    private int field_e;
    private int field_f;
    static String field_d;
    private int field_g;
    float field_a;
    String field_b;
    static rg field_h;
    private qk[] field_c;

    final static int a(int param0, ih param1) {
        RuntimeException var2 = null;
        ih var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                var3 = (ih) null;
                uc.a(88, (ih) null);
                break L1;
              }
            }
            stackIn_3_0 = param1.field_r;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("uc.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int b(int param0) {
        if (param0 < 65) {
            return 2;
        }
        return 1;
    }

    private final void a(int param0, mf param1, int param2, String param3, String param4, String param5) {
        qk[] var9 = null;
        qk var8 = null;
        qk var10 = null;
        int fieldTemp$0 = 0;
        try {
            if (!(this.field_c.length > this.field_f)) {
                var9 = new qk[2 * this.field_f];
                qk[] var7 = var9;
                qg.a(this.field_c, 0, var9, 0, this.field_f);
                this.field_c = var9;
            }
            var8 = new qk();
            var10 = var8;
            qk var7_ref = var10;
            if (param2 != 1) {
                this.a(20);
            }
            var10.field_i = param5;
            var10.field_d = param4;
            var10.field_h = param1;
            var10.field_c = param3;
            var10.field_b = param0;
            fieldTemp$0 = this.field_f;
            this.field_f = this.field_f + 1;
            this.field_c[fieldTemp$0] = var8;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "uc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -59) {
            return;
        }
        field_h = null;
        field_d = null;
    }

    final static boolean a(mf param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        byte[] var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = param0.a(param2, (byte) -97, param3);
            var4 = var6;
            var5 = -6 / ((param1 - 6) / 55);
            if (var6 != null) {
              eb.a(var6, true);
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("uc.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(int param0) {
        int var3;
        qk var4;
        var3 = EscapeVector.field_A;
        if (param0 == 7020) {
          L0: while (true) {
            if (this.field_f > this.field_e) {
              var4 = this.field_c[this.field_e];
              if (var4.field_h.b(0)) {
                L1: {
                  if (0 > var4.field_b) {
                    break L1;
                  } else {
                    if (var4.field_h.d(118, var4.field_b)) {
                      break L1;
                    } else {
                      this.a(var4.field_h.b(param0 + -3810, var4.field_b), -102, var4);
                      return false;
                    }
                  }
                }
                L2: {
                  if (null == var4.field_i) {
                    break L2;
                  } else {
                    if (!var4.field_h.a(0, var4.field_i)) {
                      this.a(var4.field_h.a(var4.field_i, 0), param0 + -7114, var4);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 >= (var4.field_b ^ -1)) {
                    break L3;
                  } else {
                    if (null != var4.field_i) {
                      break L3;
                    } else {
                      if (var4.field_d == null) {
                        break L3;
                      } else {
                        if (!var4.field_h.a((byte) -119)) {
                          this.a(var4.field_h.a(-98), -17, var4);
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                this.field_e = this.field_e + 1;
                continue L0;
              } else {
                this.a(0, -33, var4);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final void a(mf param0, String param1, String param2, String param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(-1, param0, 1, param1, param2, param3);
              if (param4 == 14826) {
                break L1;
              } else {
                field_h = (rg) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("uc.I(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, int param1, qk param2) {
        float var4_float = 0.0f;
        try {
            var4_float = (float)(this.field_e + 1) + (float)param0 / 100.0f;
            if (0 != param0) {
                this.field_b = param2.field_d + " - " + param0 + "%";
            } else {
                this.field_b = param2.field_c;
            }
            if (param1 >= -7) {
                this.a(-63);
            }
            this.field_a = (float)this.field_g * var4_float / (float)(this.field_f - -1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "uc.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, byte param1, String param2, mf param3) {
        RuntimeException runtimeException = null;
        String var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(-1, param3, 1, param0, param2, (String) null);
              if (param1 <= -114) {
                break L1;
              } else {
                var6 = (String) null;
                this.a(-32, (mf) null, 21, (String) null, (String) null, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("uc.F(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_12_2 + ')');
        }
    }

    uc(int param0) {
        this.field_c = new qk[16];
        this.field_g = param0;
    }

    static {
        field_d = "Loading music";
    }
}

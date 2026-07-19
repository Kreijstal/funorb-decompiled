/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    private int field_a;
    private lh[] field_f;
    float field_g;
    String field_d;
    private int field_c;
    static String field_b;
    static int field_e;
    private int field_h;

    public static void b(int param0) {
        int var1 = -89 % ((param0 - 27) / 45);
        field_b = null;
    }

    private final void a(int param0, lh param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        lh var5 = null;
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
              if (param0 < -126) {
                break L1;
              } else {
                var5 = (lh) null;
                this.a(91, (lh) null, 26);
                break L1;
              }
            }
            L2: {
              var4_float = (float)(1 + this.field_a) + (float)param2 / 100.0f;
              this.field_g = var4_float * (float)this.field_c / (float)(this.field_h - -1);
              if (-1 != (param2 ^ -1)) {
                this.field_d = param1.field_d + " - " + param2 + "%";
                break L2;
              } else {
                this.field_d = param1.field_b;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("gi.C(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0) {
        boolean discarded$1 = false;
        lh var2 = null;
        int var3 = 0;
        lh var4 = null;
        var3 = Bounce.field_N;
        if (param0 != 0) {
          discarded$1 = this.a(10);
          L0: while (true) {
            if (this.field_a < this.field_h) {
              var4 = this.field_f[this.field_a];
              var2 = var4;
              if (var4.field_c.c(44)) {
                L1: {
                  if (0 > var4.field_a) {
                    break L1;
                  } else {
                    if (var4.field_c.d(var4.field_a, 84)) {
                      break L1;
                    } else {
                      this.a(-128, var2, var4.field_c.a(var4.field_a, 0));
                      return false;
                    }
                  }
                }
                L2: {
                  if (null == var4.field_e) {
                    break L2;
                  } else {
                    if (!var4.field_c.b(var4.field_e, false)) {
                      this.a(-127, var2, var4.field_c.b(var4.field_e, (byte) -100));
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 >= (var4.field_a ^ -1)) {
                    break L3;
                  } else {
                    if (var4.field_e != null) {
                      break L3;
                    } else {
                      if (var4.field_d == null) {
                        break L3;
                      } else {
                        if (var4.field_c.a((byte) -73)) {
                          break L3;
                        } else {
                          this.a(-128, var2, var4.field_c.a(100));
                          return false;
                        }
                      }
                    }
                  }
                }
                this.field_a = this.field_a + 1;
                continue L0;
              } else {
                this.a(-127, var4, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (this.field_a < this.field_h) {
              var4 = this.field_f[this.field_a];
              var2 = var4;
              if (var4.field_c.c(44)) {
                L5: {
                  if (0 > var4.field_a) {
                    break L5;
                  } else {
                    if (var4.field_c.d(var4.field_a, 84)) {
                      break L5;
                    } else {
                      this.a(-128, var2, var4.field_c.a(var4.field_a, 0));
                      return false;
                    }
                  }
                }
                L6: {
                  if (null == var4.field_e) {
                    break L6;
                  } else {
                    if (!var4.field_c.b(var4.field_e, false)) {
                      this.a(-127, var2, var4.field_c.b(var4.field_e, (byte) -100));
                      return false;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (-1 >= (var4.field_a ^ -1)) {
                    break L7;
                  } else {
                    if (var4.field_e != null) {
                      break L7;
                    } else {
                      if (var4.field_d == null) {
                        break L7;
                      } else {
                        if (var4.field_c.a((byte) -73)) {
                          break L7;
                        } else {
                          this.a(-128, var2, var4.field_c.a(100));
                          return false;
                        }
                      }
                    }
                  }
                }
                this.field_a = this.field_a + 1;
                continue L4;
              } else {
                this.a(-127, var4, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static o a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        o var3 = null;
        Object stackIn_2_0 = null;
        o stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        o stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2_int = -90 % ((param1 - -48) / 34);
              var3 = new o(param0, cl.field_n, ae.field_c, ih.field_V, qh.field_i, he.field_k, ph.field_c);
              vb.a((byte) 122);
              stackOut_3_0 = (o) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("gi.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (o) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        var9 = Bounce.field_N;
        var8 = 115 % ((param0 - -65) / 38);
        if (param2 > param1) {
          if (param4 <= param2) {
            if (param4 <= param1) {
              kg.a(param6, param1, param4, param2, param7, na.field_d, param5, 118, param3);
              return;
            } else {
              kg.a(param3, param4, param1, param2, param7, na.field_d, param5, 111, param6);
              return;
            }
          } else {
            kg.a(param7, param2, param1, param4, param3, na.field_d, param5, 92, param6);
            return;
          }
        } else {
          if (param4 <= param1) {
            if (param4 <= param2) {
              kg.a(param7, param2, param4, param1, param6, na.field_d, param5, 126, param3);
              return;
            } else {
              kg.a(param3, param4, param2, param1, param6, na.field_d, param5, 105, param7);
              return;
            }
          } else {
            kg.a(param6, param1, param2, param4, param3, na.field_d, param5, 97, param7);
            return;
          }
        }
    }

    private gi() throws Throwable {
        throw new Error();
    }

    static {
        field_e = 480;
    }
}

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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -126) {
              break L0;
            } else {
              var5 = (lh) null;
              this.a(91, (lh) null, 26);
              break L0;
            }
          }
          var4_float = (float)(1 + this.field_a) + (float)param2 / 100.0f;
          this.field_g = var4_float * (float)this.field_c / (float)(this.field_h - -1);
          if (-1 != (param2 ^ -1)) {
            this.field_d = param1.field_d + " - " + param2 + "%";
            return;
          } else {
            this.field_d = param1.field_b;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("gi.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0) {
        lh var2;
        int var3;
        lh var4;
        L0: {
          var3 = Bounce.field_N;
          if (param0 == 0) {
            break L0;
          } else {
            this.a(10);
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_a < this.field_h) {
            var4 = this.field_f[this.field_a];
            var2 = var4;
            if (var4.field_c.c(44)) {
              L2: {
                if (0 > var4.field_a) {
                  break L2;
                } else {
                  if (var4.field_c.d(var4.field_a, 84)) {
                    break L2;
                  } else {
                    this.a(-128, var2, var4.field_c.a(var4.field_a, 0));
                    return false;
                  }
                }
              }
              L3: {
                if (null == var4.field_e) {
                  break L3;
                } else {
                  if (!var4.field_c.b(var4.field_e, false)) {
                    this.a(-127, var2, var4.field_c.b(var4.field_e, (byte) -100));
                    return false;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (-1 >= (var4.field_a ^ -1)) {
                  break L4;
                } else {
                  if (var4.field_e != null) {
                    break L4;
                  } else {
                    if (var4.field_d == null) {
                      break L4;
                    } else {
                      if (var4.field_c.a((byte) -73)) {
                        break L4;
                      } else {
                        this.a(-128, var2, var4.field_c.a(100));
                        return false;
                      }
                    }
                  }
                }
              }
              this.field_a = this.field_a + 1;
              continue L1;
            } else {
              this.a(-127, var4, 0);
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final static o a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        o var3 = null;
        Object stackIn_2_0 = null;
        o stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              var2_int = -90 % ((param1 - -48) / 34);
              var3 = new o(param0, cl.field_n, ae.field_c, ih.field_V, qh.field_i, he.field_k, ph.field_c);
              vb.a((byte) 122);
              stackIn_4_0 = (o) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("gi.A(");

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
          throw ii.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (o) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8;
        int var9;
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

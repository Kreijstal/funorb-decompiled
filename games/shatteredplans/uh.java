/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    private int field_j;
    static String field_d;
    static String field_e;
    private uf[] field_b;
    static boolean field_i;
    private int field_a;
    float field_h;
    private int field_f;
    String field_c;
    static String[] field_g;

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_e = null;
        int var1 = -94 % ((param0 - 19) / 58);
    }

    final boolean b(int param0) {
        int var3;
        uf var4;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            this.field_a = 107;
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_j < this.field_f) {
            var4 = this.field_b[this.field_j];
            if (!var4.field_a.b((byte) -42)) {
              this.a(true, 0, var4);
              return false;
            } else {
              L2: {
                if (-1 < (var4.field_e ^ -1)) {
                  break L2;
                } else {
                  if (!var4.field_a.b(109, var4.field_e)) {
                    this.a(true, var4.field_a.c((byte) 36, var4.field_e), var4);
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var4.field_d == null) {
                  break L3;
                } else {
                  if (!var4.field_a.a(var4.field_d, -118)) {
                    this.a(true, var4.field_a.a(var4.field_d, (byte) 91), var4);
                    return false;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var4.field_e >= 0) {
                  break L4;
                } else {
                  if (null != var4.field_d) {
                    break L4;
                  } else {
                    if (var4.field_c == null) {
                      break L4;
                    } else {
                      if (!var4.field_a.a(-1)) {
                        this.a(true, var4.field_a.d(100), var4);
                        return false;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              this.field_j = this.field_j + 1;
              continue L1;
            }
          } else {
            return true;
          }
        }
    }

    private uh() throws Throwable {
        throw new Error();
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param0 < -8) {
          if (gf.field_b >= param2 + param1) {
            return param1;
          } else {
            if (-1 >= (param3 + param1 - param2 ^ -1)) {
              return -param2 + param3 + param1;
            } else {
              return -param2 + gf.field_b;
            }
          }
        } else {
          field_e = (String) null;
          if (gf.field_b >= param2 + param1) {
            return param1;
          } else {
            if (-1 >= (param3 + param1 - param2 ^ -1)) {
              return -param2 + param3 + param1;
            } else {
              return -param2 + gf.field_b;
            }
          }
        }
    }

    private final void a(boolean param0, int param1, uf param2) {
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
            if (param0) {
              var4_float = (float)param1 / 100.0f + (float)(this.field_j + 1);
              this.field_h = var4_float * (float)this.field_a / (float)(1 + this.field_f);
              if (param1 == 0) {
                this.field_c = param2.field_f;
                return;
              } else {
                this.field_c = param2.field_c + " - " + param1 + "%";
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("uh.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_d = "Chat is currently disabled.";
        field_e = "You have resigned.";
        field_g = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}

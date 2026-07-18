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
        int var3 = 0;
        uf var5 = null;
        uf var6 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != -1) {
          ((uh) this).field_a = 107;
          L0: while (true) {
            if (((uh) this).field_j < ((uh) this).field_f) {
              var6 = ((uh) this).field_b[((uh) this).field_j];
              if (!var6.field_a.b((byte) -42)) {
                this.a(true, 0, var6);
                return false;
              } else {
                L1: {
                  if (var6.field_e < 0) {
                    break L1;
                  } else {
                    if (!var6.field_a.b(109, var6.field_e)) {
                      this.a(true, var6.field_a.c((byte) 36, var6.field_e), var6);
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (var6.field_d == null) {
                    break L2;
                  } else {
                    if (!var6.field_a.a(var6.field_d, -118)) {
                      this.a(true, var6.field_a.a(var6.field_d, (byte) 91), var6);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var6.field_e >= 0) {
                    break L3;
                  } else {
                    if (null != var6.field_d) {
                      break L3;
                    } else {
                      if (var6.field_c == null) {
                        break L3;
                      } else {
                        if (!var6.field_a.a(-1)) {
                          this.a(true, var6.field_a.d(100), var6);
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((uh) this).field_j = ((uh) this).field_j + 1;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((uh) this).field_j < ((uh) this).field_f) {
              var5 = ((uh) this).field_b[((uh) this).field_j];
              if (!var5.field_a.b((byte) -42)) {
                this.a(true, 0, var5);
                return false;
              } else {
                L5: {
                  if (var5.field_e < 0) {
                    break L5;
                  } else {
                    if (!var5.field_a.b(109, var5.field_e)) {
                      this.a(true, var5.field_a.c((byte) 36, var5.field_e), var5);
                      return false;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (var5.field_d == null) {
                    break L6;
                  } else {
                    if (!var5.field_a.a(var5.field_d, -118)) {
                      this.a(true, var5.field_a.a(var5.field_d, (byte) 91), var5);
                      return false;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var5.field_e >= 0) {
                    break L7;
                  } else {
                    if (null != var5.field_d) {
                      break L7;
                    } else {
                      if (var5.field_c == null) {
                        break L7;
                      } else {
                        if (!var5.field_a.a(-1)) {
                          this.a(true, var5.field_a.d(100), var5);
                          return false;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                ((uh) this).field_j = ((uh) this).field_j + 1;
                continue L4;
              }
            } else {
              return true;
            }
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
            if (param3 + param1 - param2 >= 0) {
              return -param2 + param3 + param1;
            } else {
              return -param2 + gf.field_b;
            }
          }
        } else {
          field_e = null;
          if (gf.field_b >= param2 + param1) {
            return param1;
          } else {
            if (param3 + param1 - param2 >= 0) {
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
              var4_float = (float)param1 / 100.0f + (float)(((uh) this).field_j + 1);
              ((uh) this).field_h = var4_float * (float)((uh) this).field_a / (float)(1 + ((uh) this).field_f);
              if (param1 == 0) {
                ((uh) this).field_c = param2.field_f;
                break L1;
              } else {
                ((uh) this).field_c = param2.field_c + " - " + param1 + "%";
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("uh.D(").append(true).append(',').append(param1).append(',');
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
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Chat is currently disabled.";
        field_e = "You have resigned.";
        field_g = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}

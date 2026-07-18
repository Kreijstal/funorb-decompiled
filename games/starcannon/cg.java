/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    float field_i;
    String field_h;
    private int field_c;
    private ah[] field_d;
    static int field_e;
    private int field_f;
    static int[] field_j;
    static int field_b;
    static p field_g;
    private int field_a;

    final boolean a(byte param0) {
        ah var2 = null;
        int var3 = 0;
        ah var4 = null;
        ah var5 = null;
        ah var6 = null;
        var3 = StarCannon.field_A;
        if (param0 != 15) {
          boolean discarded$1 = ((cg) this).a((byte) -63);
          L0: while (true) {
            if (((cg) this).field_c < ((cg) this).field_f) {
              var6 = ((cg) this).field_d[((cg) this).field_c];
              var4 = var6;
              var2 = var4;
              if (var6.field_b.b((byte) 99)) {
                L1: {
                  if (var6.field_j < 0) {
                    break L1;
                  } else {
                    if (!var6.field_b.c(var6.field_j, -31)) {
                      this.a((byte) 75, var2, var6.field_b.a(100, var6.field_j));
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (null == var6.field_g) {
                    break L2;
                  } else {
                    if (var6.field_b.a(var6.field_g, -9883)) {
                      break L2;
                    } else {
                      this.a((byte) -121, var2, var6.field_b.a(var6.field_g, (byte) 96));
                      return false;
                    }
                  }
                }
                L3: {
                  if (0 <= var6.field_j) {
                    break L3;
                  } else {
                    if (null != var6.field_g) {
                      break L3;
                    } else {
                      if (null == var6.field_k) {
                        break L3;
                      } else {
                        if (var6.field_b.a(29741)) {
                          break L3;
                        } else {
                          this.a((byte) 27, var2, var6.field_b.a((byte) 62));
                          return false;
                        }
                      }
                    }
                  }
                }
                ((cg) this).field_c = ((cg) this).field_c + 1;
                continue L0;
              } else {
                this.a((byte) 49, var6, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((cg) this).field_c < ((cg) this).field_f) {
              var5 = ((cg) this).field_d[((cg) this).field_c];
              var4 = var5;
              var2 = var4;
              if (var5.field_b.b((byte) 99)) {
                L5: {
                  if (var5.field_j < 0) {
                    break L5;
                  } else {
                    if (!var5.field_b.c(var5.field_j, -31)) {
                      this.a((byte) 75, var2, var5.field_b.a(100, var5.field_j));
                      return false;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (null == var5.field_g) {
                    break L6;
                  } else {
                    if (var5.field_b.a(var5.field_g, -9883)) {
                      break L6;
                    } else {
                      this.a((byte) -121, var2, var5.field_b.a(var5.field_g, (byte) 96));
                      return false;
                    }
                  }
                }
                L7: {
                  if (0 <= var5.field_j) {
                    break L7;
                  } else {
                    if (null != var5.field_g) {
                      break L7;
                    } else {
                      if (null == var5.field_k) {
                        break L7;
                      } else {
                        if (var5.field_b.a(29741)) {
                          break L7;
                        } else {
                          this.a((byte) 27, var2, var5.field_b.a((byte) 62));
                          return false;
                        }
                      }
                    }
                  }
                }
                ((cg) this).field_c = ((cg) this).field_c + 1;
                continue L4;
              } else {
                this.a((byte) 49, var5, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    public static void a(int param0) {
        field_j = null;
        int var1 = 117;
        field_g = null;
    }

    private final void a(byte param0, ah param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var4_float = (float)param2 / 100.0f + (float)(1 + ((cg) this).field_c);
              var5 = 68 % ((-74 - param0) / 45);
              ((cg) this).field_i = var4_float * (float)((cg) this).field_a / (float)(1 + ((cg) this).field_f);
              if (param2 != 0) {
                ((cg) this).field_h = param1.field_k + " - " + param2 + "%";
                break L1;
              } else {
                ((cg) this).field_h = param1.field_h;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("cg.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ')');
        }
    }

    private cg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_g = new p();
    }
}

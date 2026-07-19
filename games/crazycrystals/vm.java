/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vm {
    String field_l;
    private int field_c;
    static String field_e;
    static String field_h;
    private lm[] field_f;
    static wb field_g;
    private int field_a;
    float field_b;
    private int field_i;
    static int[] field_d;
    static db field_k;
    static Vector[] field_j;

    public static void b(byte param0) {
        mb[] discarded$2 = null;
        field_h = null;
        if (param0 <= 111) {
          discarded$2 = vm.a((byte) 36);
          field_d = null;
          field_g = null;
          field_e = null;
          field_k = null;
          field_j = null;
          return;
        } else {
          field_d = null;
          field_g = null;
          field_e = null;
          field_k = null;
          field_j = null;
          return;
        }
    }

    final boolean a(int param0) {
        lm var2 = null;
        int var3 = 0;
        lm var4 = null;
        var3 = CrazyCrystals.field_B;
        if (param0 != 0) {
          field_d = (int[]) null;
          L0: while (true) {
            if (this.field_c > this.field_i) {
              var4 = this.field_f[this.field_i];
              var2 = var4;
              if (var4.field_h.a((byte) 102)) {
                L1: {
                  if (var4.field_i < 0) {
                    break L1;
                  } else {
                    if (var4.field_h.e(var4.field_i, 75)) {
                      break L1;
                    } else {
                      this.a(var2, 1, var4.field_h.b(25030, var4.field_i));
                      return false;
                    }
                  }
                }
                L2: {
                  if (var4.field_b == null) {
                    break L2;
                  } else {
                    if (var4.field_h.a(-20402, var4.field_b)) {
                      break L2;
                    } else {
                      this.a(var2, 1, var4.field_h.b(var4.field_b, param0 ^ -75));
                      return false;
                    }
                  }
                }
                L3: {
                  if ((var4.field_i ^ -1) <= -1) {
                    break L3;
                  } else {
                    if (null != var4.field_b) {
                      break L3;
                    } else {
                      if (null == var4.field_f) {
                        break L3;
                      } else {
                        if (!var4.field_h.a(false)) {
                          this.a(var2, param0 ^ 1, var4.field_h.b(param0 + 3492));
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                this.field_i = this.field_i + 1;
                continue L0;
              } else {
                this.a(var4, 1, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (this.field_c > this.field_i) {
              var4 = this.field_f[this.field_i];
              var2 = var4;
              if (var4.field_h.a((byte) 102)) {
                L5: {
                  if (var4.field_i < 0) {
                    break L5;
                  } else {
                    if (var4.field_h.e(var4.field_i, 75)) {
                      break L5;
                    } else {
                      this.a(var2, 1, var4.field_h.b(25030, var4.field_i));
                      return false;
                    }
                  }
                }
                L6: {
                  if (var4.field_b == null) {
                    break L6;
                  } else {
                    if (var4.field_h.a(-20402, var4.field_b)) {
                      break L6;
                    } else {
                      this.a(var2, 1, var4.field_h.b(var4.field_b, param0 ^ -75));
                      return false;
                    }
                  }
                }
                L7: {
                  if ((var4.field_i ^ -1) <= -1) {
                    break L7;
                  } else {
                    if (null != var4.field_b) {
                      break L7;
                    } else {
                      if (null == var4.field_f) {
                        break L7;
                      } else {
                        if (!var4.field_h.a(false)) {
                          this.a(var2, param0 ^ 1, var4.field_h.b(param0 + 3492));
                          return false;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                this.field_i = this.field_i + 1;
                continue L4;
              } else {
                this.a(var4, 1, 0);
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static int a(byte param0, boolean param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            var3_int = 125 % ((param0 - 22) / 36);
            if (param1) {
              stackOut_3_0 = gh.field_F.a(param2);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = ec.field_m.a(param2);
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("vm.D(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static mb[] a(byte param0) {
        if (param0 <= 51) {
          vm.b((byte) -80);
          return new mb[]{gg.field_d, wp.field_c, je.field_b};
        } else {
          return new mb[]{gg.field_d, wp.field_c, je.field_b};
        }
    }

    private final void a(lm param0, int param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
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
              var4_float = (float)(param1 + this.field_i) + (float)param2 / 100.0f;
              this.field_b = (float)this.field_a * var4_float / (float)(1 + this.field_c);
              if (param2 == 0) {
                this.field_l = param0.field_c;
                break L1;
              } else {
                this.field_l = param0.field_f + " - " + param2 + "%";
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("vm.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private vm() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "Return to game";
        field_h = "Email (Login):";
        field_g = new wb();
        field_d = new int[8192];
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class li extends me {
    static volatile boolean field_j;
    static String field_o;
    static int[] field_n;
    static ci field_k;
    private String field_m;
    private boolean field_l;

    public static void h(int param0) {
        if (param0 <= 117) {
          li.h(106);
          field_n = null;
          field_o = null;
          field_k = null;
          return;
        } else {
          field_n = null;
          field_o = null;
          field_k = null;
          return;
        }
    }

    final String b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        uj var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        Object stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.g(7);
                break L1;
              }
            }
            var5 = (CharSequence) ((Object) param1);
            var3 = da.a(true, var5);
            if (var3 == null) {
              L2: {
                if (param1.equals(this.field_m)) {
                  break L2;
                } else {
                  var4 = vl.a(42, param1);
                  if (var4 != null) {
                    if (var4.field_b == null) {
                      this.field_l = var4.field_f;
                      this.field_m = param1;
                      break L2;
                    } else {
                      stackIn_10_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (this.field_l) {
                stackIn_16_0 = lf.field_e;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_14_0 = gb.field_e;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("li.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_10_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    final static ec a(boolean param0, String param1, int param2) {
        nl var3 = null;
        RuntimeException var3_ref = null;
        ec stackIn_2_0 = null;
        nl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new nl();
            if (!param0) {
              ((ec) ((Object) var3)).field_a = param1;
              ((ec) ((Object) var3)).field_e = param2;
              stackIn_4_0 = (nl) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ec) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("li.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (ec) ((Object) stackIn_4_0);
        }
    }

    li(rg param0) {
        super(param0);
        this.field_l = false;
    }

    final rc a(int param0, String param1) {
        uj var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        rc stackIn_3_0 = null;
        rc stackIn_11_0 = null;
        rc stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (!ck.a(var4, (byte) -114)) {
              stackIn_3_0 = ec.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 95) {
                  break L1;
                } else {
                  field_k = (ci) null;
                  break L1;
                }
              }
              L2: {
                if (param1.equals(this.field_m)) {
                  break L2;
                } else {
                  L3: {
                    var3 = vl.a(param0 + -53, param1);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var3.field_b == null) {
                        this.field_l = var3.field_f;
                        this.field_m = param1;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_11_0 = fi.field_u;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L4: {
                if (this.field_l) {
                  stackIn_16_0 = hi.field_b;
                  break L4;
                } else {
                  stackIn_16_0 = ec.field_d;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("li.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    final static int a(int param0, Random param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 > 0) {
              if (nd.a((byte) -106, param0)) {
                stackIn_6_0 = (int)((long)param0 * ((long)param1.nextInt() & 4294967295L) >> -2044501920);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var3_int = -(int)(4294967296L % (long)param0) + -2147483648;
                L1: while (true) {
                  var4 = param1.nextInt();
                  L2: while (true) {
                    if (var3_int <= var4) {
                      continue L1;
                    } else {
                      if (var5 != 0) {
                        continue L2;
                      } else {
                        if (!param2) {
                          stackIn_15_0 = ic.a(param0, (byte) -70, var4);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          stackIn_13_0 = -58;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("li.H(").append(param0).append(',');

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
          throw ch.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final void g(int param0) {
        int var2 = 73 / ((param0 - 9) / 61);
        this.field_m = null;
    }

    static {
        field_n = new int[]{0, 0, 1, 2, 4, 8, 15, 24, 36, 50, 50, 50, 50};
        field_j = false;
        field_o = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}

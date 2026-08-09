/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tm {
    static int field_c;
    static int[] field_e;
    static int field_b;
    private java.util.zip.Inflater field_d;
    static boolean field_a;

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        t var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = db.a(param2, 31108);
              if (param0) {
                break L1;
              } else {
                var4 = (t) null;
                tm.a((byte) 108, (t) null);
                break L1;
              }
            }
            if (0 != (param1.indexOf(param2) ^ -1)) {
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1.indexOf(var3) == -1) {
                L2: {
                  L3: {
                    if (param1.startsWith(param2)) {
                      break L3;
                    } else {
                      if (param1.startsWith(var3)) {
                        break L3;
                      } else {
                        if (param1.endsWith(param2)) {
                          break L3;
                        } else {
                          if (!param1.endsWith(var3)) {
                            stackIn_14_0 = 0;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_14_0 = 1;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("tm.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            L1: while (true) {
              param0--;
              if (param0 < 0) {
                if (param2 < -91) {
                  break L0;
                } else {
                  field_b = -71;
                  return;
                }
              } else {
                var9 = param3;
                var5 = var9;
                var6 = param1;
                var7 = param4;
                var9[var6] = var7 + ie.a(8355711, var9[var6] >> -1476739551);
                param1++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("tm.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, t param1) {
        try {
            bp.a((byte) -78);
            ph.a(param1.field_y, param1.field_w, param1.field_u);
            int var2_int = 10 % ((param0 - -52) / 47);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "tm.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, fj param1, byte[] param2) {
        try {
            Exception exception = null;
            RuntimeException var4 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param1.field_j[param1.field_n] != 31) {
                    break L1;
                  } else {
                    if (116 != (param1.field_j[1 + param1.field_n] ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        if (null == this.field_d) {
                          this.field_d = new java.util.zip.Inflater(true);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          this.field_d.setInput(param1.field_j, 10 + param1.field_n, -param1.field_n + -18 + param1.field_j.length);
                          this.field_d.inflate(param2);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        this.field_d.reset();
                        throw new RuntimeException("");
                      }
                      this.field_d.reset();
                      if (param0 == -67) {
                        break L0;
                      } else {
                        field_e = (int[]) null;
                        return;
                      }
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var4);

                stackIn_15_1 = new StringBuilder().append("tm.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L4;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

                if (param2 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L5;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public tm() {
        this(-1, 1000000, 1000000);
    }

    public static void a(byte param0) {
        if (param0 != -12) {
            field_c = -16;
            field_e = null;
            return;
        }
        field_e = null;
    }

    private tm(int param0, int param1, int param2) {
    }

    static {
        field_e = new int[8192];
        field_a = true;
    }
}

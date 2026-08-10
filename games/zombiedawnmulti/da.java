/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class da {
    static long field_c;
    static String field_i;
    private java.util.zip.Inflater field_d;
    static String field_f;
    static cj field_h;
    static int field_a;
    static volatile int field_e;
    static byte[] field_b;
    static String field_g;

    public static void a(byte param0) {
        int var1 = -54 % ((param0 - -24) / 59);
        field_b = null;
        field_h = null;
        field_g = null;
        field_i = null;
        field_f = null;
    }

    final void a(byte[] param0, k param1, int param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param2 > 26) {
                  L1: {
                    if (param1.field_m[param1.field_j] != 31) {
                      break L1;
                    } else {
                      if ((param1.field_m[1 + param1.field_j] ^ -1) != 116) {
                        break L1;
                      } else {
                        L2: {
                          if (null != this.field_d) {
                            break L2;
                          } else {
                            this.field_d = new java.util.zip.Inflater(true);
                            break L2;
                          }
                        }
                        try {
                          L3: {
                            this.field_d.setInput(param1.field_m, 10 + param1.field_j, -8 - param1.field_j + (-10 + param1.field_m.length));
                            this.field_d.inflate(param0);
                            break L3;
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          exception = (Exception) (Object) decompiledCaughtException;
                          this.field_d.reset();
                          throw new RuntimeException("");
                        }
                        this.field_d.reset();
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  throw new RuntimeException("");
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (runtimeException);

                stackIn_15_1 = new StringBuilder().append("da.A(");

                if (param0 == null) {
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

                if (param1 == null) {
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
              throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int[] a(int param0) {
        if (param0 != 8) {
            return (int[]) null;
        }
        return new int[8];
    }

    final static void b(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            IOException var1 = null;
            int var1_int = 0;
            RuntimeException var1_ref = null;
            IOException var2 = null;
            int var3 = 0;
            var3 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != i.field_a) {
                    i.field_a.f(31);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null != rn.field_d) {
                    rn.field_d.a((byte) 77);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param0 == -8) {
                    break L3;
                  } else {
                    field_g = (String) null;
                    break L3;
                  }
                }
                L4: {
                  if (null == hc.field_b) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        hc.field_b.a((byte) -106);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L6;
                      }
                    }
                    break L4;
                  }
                }
                if (null != rl.field_r) {
                  var1_int = 0;
                  L7: while (true) {
                    if (rl.field_r.length <= var1_int) {
                      break L0;
                    } else {
                      L8: {
                        if (rl.field_r[var1_int] != null) {
                          try {
                            L9: {
                              rl.field_r[var1_int].a((byte) -125);
                              break L9;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L10: {
                              var2 = (IOException) (Object) decompiledCaughtException;
                              break L10;
                            }
                          }
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var1_int++;
                      continue L7;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw fa.a((Throwable) ((Object) var1_ref), "da.B(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static n a(int param0, int param1, byte[] param2) {
        n var3 = null;
        RuntimeException var3_ref = null;
        n stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -44) {
                break L1;
              } else {
                field_c = 35L;
                break L1;
              }
            }
            var3 = new n(param2);
            nq.field_s.a(var3, false);
            ih.a(var3, 1, param1);
            stackIn_3_0 = (n) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("da.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public da() {
        this(-1, 1000000, 1000000);
    }

    final static ri[] a(String param0, ul param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ri[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 19) {
                break L1;
              } else {
                da.a((byte) -85);
                break L1;
              }
            }
            var4_int = param1.a(param3, (byte) -65);
            var5 = param1.a(param0, var4_int, param2 ^ -20);
            stackIn_3_0 = pf.a(var4_int, param1, -75, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("da.G(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static ja a(int param0, String param1) {
        ef var2 = null;
        RuntimeException var2_ref = null;
        ja var3 = null;
        int var4 = 0;
        ja stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = pb.field_e;
            var3 = new ja(var2.a(param1), 27);
            var3.a();
            var2.b(param1, var3.field_x / 2, 17, 16777215, -1);
            var4 = -13 % ((param0 - -44) / 43);
            stackIn_1_0 = (ja) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2_ref);

            stackIn_4_1 = new StringBuilder().append("da.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    private da(int param0, int param1, int param2) {
    }

    static {
        field_e = -1;
        field_f = "Fastest";
        field_i = "Email (Login):";
        field_b = new byte[]{(byte)4};
        field_g = "Fool the fools!";
    }
}

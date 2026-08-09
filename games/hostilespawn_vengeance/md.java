/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class md extends nj {
    static String field_j;
    static boolean field_k;
    private java.nio.ByteBuffer field_h;
    static int field_o;
    static lf[] field_g;
    static String field_f;
    static String field_m;
    static String field_l;
    static boolean field_i;
    static java.awt.Frame field_n;

    final static String a(String param0, gb param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1.a(-15879)) {
              stackIn_3_0 = (String) (param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_int = 12 / ((3 - param3) / 60);
              stackIn_5_0 = param0 + " - " + param1.c(0) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("md.K(");

            if (param0 == null) {
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
          L2: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_5_0;
        }
    }

    final void a(int param0, byte[] param1) {
        try {
            this.field_h = java.nio.ByteBuffer.allocateDirect(param1.length);
            this.field_h.position(0);
            this.field_h.put(param1);
            if (param0 != 24) {
                field_l = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "md.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            IOException var1 = null;
            int var1_int = 0;
            RuntimeException var1_ref = null;
            IOException var2 = null;
            int var3 = 0;
            var3 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == ig.field_N) {
                    break L1;
                  } else {
                    ig.field_N.a((byte) -128);
                    break L1;
                  }
                }
                L2: {
                  if (vc.field_c == null) {
                    break L2;
                  } else {
                    vc.field_c.a(3);
                    break L2;
                  }
                }
                L3: {
                  if (null != mk.field_K) {
                    try {
                      L4: {
                        mk.field_K.f(0);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (param0 > 15) {
                    break L6;
                  } else {
                    md.b(-30);
                    break L6;
                  }
                }
                L7: {
                  if (null == oe.field_a) {
                    break L7;
                  } else {
                    var1_int = 0;
                    L8: while (true) {
                      if (oe.field_a.length <= var1_int) {
                        break L7;
                      } else {
                        L9: {
                          if (oe.field_a[var1_int] == null) {
                            break L9;
                          } else {
                            try {
                              L10: {
                                oe.field_a[var1_int].f(0);
                                break L10;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L11: {
                                var2 = (IOException) (Object) decompiledCaughtException;
                                break L11;
                              }
                            }
                            break L9;
                          }
                        }
                        var1_int++;
                        continue L8;
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw wg.a((Throwable) ((Object) var1_ref), "md.J(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void c(int param0) {
        if (param0 >= -70) {
            field_l = (String) null;
            cj.a(bn.c(-1), 0);
            return;
        }
        cj.a(bn.c(-1), 0);
    }

    final byte[] a(byte param0) {
        byte[] var2;
        byte[] var3;
        if (param0 > -25) {
          return (byte[]) null;
        } else {
          var3 = new byte[this.field_h.capacity()];
          var2 = var3;
          this.field_h.position(0);
          this.field_h.get(var3);
          return var3;
        }
    }

    public static void c(byte param0) {
        field_n = null;
        if (param0 < 42) {
          md.c(87);
          field_f = null;
          field_l = null;
          field_j = null;
          field_g = null;
          field_m = null;
          return;
        } else {
          field_f = null;
          field_l = null;
          field_j = null;
          field_g = null;
          field_m = null;
          return;
        }
    }

    md() {
    }

    static {
        field_o = 0;
        field_k = true;
        field_m = "Completion time: <col=ffffff>";
        field_j = "Change display name";
        field_i = false;
        field_l = "The bridge console is in this room; walk up to it to download the data.";
    }
}

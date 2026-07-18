/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kb {
    static String[] field_c;
    private RandomAccessFile field_d;
    static String field_e;
    private long field_b;
    private long field_a;

    final void c(int param0) throws IOException {
        int var2 = -83 % ((param0 - 52) / 34);
        if (!(((kb) this).field_d == null)) {
            ((kb) this).field_d.close();
            ((kb) this).field_d = null;
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = ArcanistsMulti.field_G ? 1 : 0;
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = (param1 & 16736682) >> 16;
        int var5 = (param1 & param2) >> 8;
        int var6 = 255 & param1;
        int var7 = param0 >> 16 & 255;
        int var8 = (65494 & param0) >> 8;
        int var9 = param0 & 255;
        for (var10 = 0; 256 > var10; var10++) {
            var11 = 256 + -var10;
            var13[var10] = (var9 * var11 >> 8) + ((var6 * var10 >> 8) + ((var10 * var4 >> 8) - -(var11 * var7 >> 8) << 16) + ((var8 * var11 >> 8) + (var10 * var5 >> 8) << 8));
        }
        return var3;
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (oj.field_i) {
          if (param2 == -32507) {
            L0: {
              co.field_f.b(param0, (byte) 75);
              var4 = nn.field_q.f((byte) 93) ? 1 : 0;
              if (re.field_r == 0) {
                break L0;
              } else {
                if (var4 != 0) {
                  break L0;
                } else {
                  param0 = false;
                  int discarded$1 = 3;
                  uc.c();
                  break L0;
                }
              }
            }
            if (!param0) {
              if (var4 == 0) {
                var5 = nn.field_q.f(0) + nn.field_q.field_V;
                if (var5 <= 640) {
                  if (var5 < 635) {
                    if (ng.field_K > 0) {
                      ng.field_K = ng.field_K - 5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ng.field_K = ng.field_K + 5;
                  return;
                }
              } else {
                co.field_f.b(param0, (byte) 66);
                var5 = nn.field_q.f(0) + nn.field_q.field_V;
                if (var5 <= 640) {
                  if (var5 < 635) {
                    if (ng.field_K <= 0) {
                      return;
                    } else {
                      ng.field_K = ng.field_K - 5;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ng.field_K = ng.field_K + 5;
                  return;
                }
              }
            } else {
              nn.field_q.a(param1, -10284, param3);
              if (var4 != 0) {
                co.field_f.b(param0, (byte) 66);
                var5 = nn.field_q.f(0) + nn.field_q.field_V;
                if (var5 <= 640) {
                  if (var5 < 635) {
                    if (ng.field_K <= 0) {
                      return;
                    } else {
                      ng.field_K = ng.field_K - 5;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ng.field_K = ng.field_K + 5;
                  return;
                }
              } else {
                var5 = nn.field_q.f(0) + nn.field_q.field_V;
                if (var5 <= 640) {
                  if (var5 < 635) {
                    if (ng.field_K <= 0) {
                      return;
                    } else {
                      ng.field_K = ng.field_K - 5;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ng.field_K = ng.field_K + 5;
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final int a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                var5_int = ((kb) this).field_d.read(param0, param3, param2);
                if (0 >= var5_int) {
                  break L1;
                } else {
                  ((kb) this).field_a = ((kb) this).field_a + (long)var5_int;
                  break L1;
                }
              }
              stackOut_5_0 = var5_int;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = -50;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("kb.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final long a(int param0) throws IOException {
        if (param0 != -2775) {
            kb.a(true, 53, -119, -107);
            return ((kb) this).field_d.length();
        }
        return ((kb) this).field_d.length();
    }

    final void a(byte param0, long param1) throws IOException {
        ((kb) this).field_d.seek(param1);
        if (param0 != -123) {
          ((kb) this).field_d = null;
          ((kb) this).field_a = param1;
          return;
        } else {
          ((kb) this).field_a = param1;
          return;
        }
    }

    protected final void finalize() throws Throwable {
        if (((kb) this).field_d != null) {
            System.out.println("");
            ((kb) this).c(87);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        try {
            if (param0 != 1) {
                int[] discarded$0 = kb.a(86, -91, -113);
            }
            if (!(((kb) this).field_b >= ((kb) this).field_a + (long)param2)) {
                ((kb) this).field_d.seek(((kb) this).field_b);
                ((kb) this).field_d.write(1);
                throw new EOFException();
            }
            ((kb) this).field_d.write(param3, param1, param2);
            ((kb) this).field_a = ((kb) this).field_a + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "kb.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    kb(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (-1L == param2) {
                param2 = 9223372036854775807L;
            }
            if (param0.length() > param2) {
                boolean discarded$0 = param0.delete();
            }
            ((kb) this).field_d = new RandomAccessFile(param0, param1);
            ((kb) this).field_b = param2;
            ((kb) this).field_a = 0L;
            var5_int = ((kb) this).field_d.read();
            if (-1 != var5_int) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((kb) this).field_d.seek(0L);
                    ((kb) this).field_d.write(var5_int);
                }
            }
            ((kb) this).field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "kb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void b() {
        ee.a(17, (byte) 30);
    }

    public static void d() {
        field_c = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_e = "<%0> has entered a game.";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nd {
    private RandomAccessFile field_b;
    static int[] field_h;
    static int field_g;
    static int field_c;
    private long field_d;
    static int field_e;
    private long field_f;
    static String field_a;

    final static void b() {
        Object var2 = null;
        wk.a((String) null, -54, "");
    }

    final long a(boolean param0) throws IOException {
        if (!param0) {
            return 65L;
        }
        return ((nd) this).field_b.length();
    }

    final int a(int param0, int param1, boolean param2, byte[] param3) throws IOException {
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
            var5_int = ((nd) this).field_b.read(param3, param0, param1);
            if (!param2) {
              L1: {
                if (var5_int <= 0) {
                  break L1;
                } else {
                  ((nd) this).field_d = ((nd) this).field_d + (long)var5_int;
                  break L1;
                }
              }
              stackOut_5_0 = var5_int;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = 117;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("nd.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final void a(long param0, boolean param1) throws IOException {
        if (param1) {
            field_e = -116;
        }
        ((nd) this).field_b.seek(param0);
        ((nd) this).field_d = param0;
    }

    final static void a(int param0, long param1) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            if (param0 >= 113) {
              {
                L0: {
                  Thread.sleep(param1);
                  break L0;
                }
              }
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

    final void a(byte param0) throws IOException {
        if (((nd) this).field_b != null) {
            ((nd) this).field_b.close();
            ((nd) this).field_b = null;
        }
        if (param0 != 47) {
            nd.a(-44);
        }
    }

    protected final void finalize() throws Throwable {
        if (!(((nd) this).field_b == null)) {
            System.out.println("");
            ((nd) this).a((byte) 47);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_a = null;
        }
        field_a = null;
        field_h = null;
    }

    nd(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param0.length() > param2) {
                boolean discarded$0 = param0.delete();
            }
            ((nd) this).field_b = new RandomAccessFile(param0, param1);
            ((nd) this).field_f = param2;
            ((nd) this).field_d = 0L;
            var5_int = ((nd) this).field_b.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((nd) this).field_b.seek(0L);
                    ((nd) this).field_b.write(var5_int);
                }
            }
            ((nd) this).field_b.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "nd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void a(boolean param0, String param1) {
        try {
            int discarded$0 = 10;
            wl.a(param1);
            gh.a((byte) -116, nk.field_c, false);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "nd.C(" + 1 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        if (!(((nd) this).field_f >= (long)param2 + ((nd) this).field_d)) {
            ((nd) this).field_b.seek(((nd) this).field_f);
            ((nd) this).field_b.write(1);
            throw new EOFException();
        }
        if (param3 != -59) {
            return;
        }
        try {
            ((nd) this).field_b.write(param0, param1, param2);
            ((nd) this).field_d = ((nd) this).field_d + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "nd.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 32 + param1;
              var4 = 32 + param2;
              if (null != qe.field_A) {
                break L1;
              } else {
                qe.field_A = new int[256];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= 256) {
                    break L1;
                  } else {
                    qe.field_A[var5] = var5 * 65793;
                    var5++;
                    continue L2;
                  }
                }
              }
            }
            var5 = 0;
            var5 = 28 - -((32 - hc.field_S) / 8);
            qg.a(32 + var3_int << 4, 32 + var4 << 4, var5 << 4, 255, qe.field_A);
            var8 = 0;
            L3: while (true) {
              if (var8 >= 10) {
                break L0;
              } else {
                var6 = e.b((byte) 57, 2 * var5);
                var7 = e.b((byte) 57, 2 * var5);
                qg.a(var6 + (-var5 + var3_int + 32) << 4, var7 + -var5 + (32 + var4) << 4, 64, 128, qe.field_A);
                var8++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var3, "nd.B(" + -996593372 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static vg a(pa param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        vg stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        vg stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.e(8, -97);
            if (0 >= var2_int) {
              L1: {
                var3 = fl.a(param0, (byte) 117) ? 1 : 0;
                var4 = fl.a(param0, (byte) 116) ? 1 : 0;
                var5 = new vg();
                var5.field_d = (short)param0.e(16, 119);
                int discarded$19 = 16;
                var5.field_g = ui.a(param0, -119, var5.field_g);
                int discarded$20 = 16;
                var5.field_t = ui.a(param0, -103, var5.field_t);
                int discarded$21 = 16;
                var5.field_q = ui.a(param0, -101, var5.field_q);
                var5.field_x = (short)param0.e(16, -39);
                int discarded$22 = 16;
                var5.field_i = ui.a(param0, -95, var5.field_i);
                int discarded$23 = 16;
                var5.field_w = ui.a(param0, -104, var5.field_w);
                int discarded$24 = 16;
                var5.field_F = ui.a(param0, -126, var5.field_F);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_c = (short)param0.e(16, 117);
                  int discarded$25 = 16;
                  var5.field_L = ui.a(param0, -118, var5.field_L);
                  int discarded$26 = 16;
                  var5.field_r = ui.a(param0, -122, var5.field_r);
                  int discarded$27 = 16;
                  var5.field_D = ui.a(param0, -121, var5.field_D);
                  int discarded$28 = 16;
                  var5.field_f = ui.a(param0, -97, var5.field_f);
                  int discarded$29 = 16;
                  var5.field_k = ui.a(param0, -100, var5.field_k);
                  int discarded$30 = 16;
                  var5.field_G = ui.a(param0, -104, var5.field_G);
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  int discarded$31 = param0.e(16, -26);
                  int discarded$32 = 16;
                  var5.field_I = ui.a(param0, -102, var5.field_I);
                  int discarded$33 = 16;
                  var5.field_H = ui.a(param0, -114, var5.field_H);
                  int discarded$34 = 16;
                  var5.field_m = ui.a(param0, -111, var5.field_m);
                  int discarded$35 = 16;
                  var5.field_n = ui.a(param0, -123, var5.field_n);
                  int discarded$36 = 16;
                  var5.field_j = ui.a(param0, -95, var5.field_j);
                  break L2;
                }
              }
              L3: {
                if (!fl.a(param0, (byte) 121)) {
                  break L3;
                } else {
                  int discarded$37 = 16;
                  var5.field_M = ui.a(param0, -92, var5.field_M);
                  break L3;
                }
              }
              L4: {
                if (!fl.a(param0, (byte) 107)) {
                  break L4;
                } else {
                  var5.field_z = hf.a(-1, var5.field_z, 16, param0);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var5.field_z.length) {
                      if (0 == var6) {
                        var5.field_z = null;
                        break L4;
                      } else {
                        var5.field_s = (byte)(1 + var6);
                        break L4;
                      }
                    } else {
                      L6: {
                        if ((var5.field_z[var7] & 255) <= var6) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_18_0 = (vg) var5;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("nd.D(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + -25 + 41);
        }
        return stackIn_19_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_h = new int[]{32, 2048, 131072, 8388608, 536870912, 8};
        field_a = "Create a free Account";
    }
}

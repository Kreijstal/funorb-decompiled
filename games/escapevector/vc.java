/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vc {
    int field_b;
    int field_c;
    static String field_e;
    int field_a;
    int field_g;
    static String field_i;
    int[][] field_d;
    int field_h;
    int field_f;

    public static void a(int param0) {
        field_e = null;
        int var1 = 112;
        field_i = null;
    }

    final static void a(int param0, ce param1, boolean param2, byte param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var4 = (Object) (Object) ig.field_l;
            synchronized (var4) {
              L1: {
                L2: {
                  if (param3 <= -61) {
                    break L2;
                  } else {
                    field_e = null;
                    break L2;
                  }
                }
                L3: {
                  if (ni.field_N != null) {
                    nb.field_c.b((il) (Object) ni.field_N);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                kn.field_b = param0;
                ni.field_N = new o(param1);
                ni.field_N.d(kn.field_b * kc.field_b / 64);
                ni.field_N.a(param2);
                ig.field_l.b();
                nb.field_c.c((il) (Object) ni.field_N);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4_ref;
            stackOut_11_1 = new StringBuilder().append("vc.B(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    vc(DataInputStream param0, int param1) throws IOException {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              ((vc) this).field_a = param0.readUnsignedByte();
              ((vc) this).field_h = ((vc) this).field_a << 5;
              ((vc) this).field_f = param0.readUnsignedByte();
              ((vc) this).field_g = ((vc) this).field_f << 5;
              ((vc) this).field_c = param0.readUnsignedByte();
              ((vc) this).field_b = ((vc) this).field_c;
              if (param1 < 10) {
                break L1;
              } else {
                ((vc) this).field_b = param0.readUnsignedByte();
                break L1;
              }
            }
            ((vc) this).field_d = new int[((vc) this).field_a * ((vc) this).field_f][];
            var3_int = 0;
            L2: while (true) {
              if (((vc) this).field_a * ((vc) this).field_f <= var3_int) {
                break L0;
              } else {
                var4 = param0.readByte();
                var5 = 0;
                L3: while (true) {
                  L4: {
                    if (var5 >= 4) {
                      break L4;
                    } else {
                      if (var3_int - -var5 >= ((vc) this).field_a * ((vc) this).field_f) {
                        break L4;
                      } else {
                        L5: {
                          if ((var4 & 3) == -1) {
                            ((vc) this).field_d[var3_int - -var5] = null;
                            break L5;
                          } else {
                            if (-2 != (var4 & 3)) {
                              ((vc) this).field_d[var3_int + var5] = new int[32];
                              var6 = new int[32];
                              bf.a(0, 32, param0, 0, 32, var6, 2147483647);
                              break L5;
                            } else {
                              ((vc) this).field_d[var5 + var3_int] = si.field_v;
                              break L5;
                            }
                          }
                        }
                        var4 = var4 >>> 2;
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var3_int += 4;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("vc.<init>(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Reload game";
        field_e = "Passwords must be between 5 and 20 characters long";
    }
}

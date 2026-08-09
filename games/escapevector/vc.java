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
        int var1 = 112 / ((-60 - param0) / 60);
        field_i = null;
    }

    final static void a(int param0, ce param1, boolean param2, byte param3) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            var4 = ig.field_l;
            synchronized (var4) {
              L1: {
                L2: {
                  if (param3 <= -61) {
                    break L2;
                  } else {
                    field_e = (String) null;
                    break L2;
                  }
                }
                L3: {
                  if (ni.field_N != null) {
                    nb.field_c.b(ni.field_N);
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
                nb.field_c.c(ni.field_N);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4_ref);

            stackIn_13_1 = new StringBuilder().append("vc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    vc(DataInputStream param0, int param1) throws IOException {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        try {
          L0: {
            L1: {
              this.field_a = param0.readUnsignedByte();
              this.field_h = this.field_a << -2123072059;
              this.field_f = param0.readUnsignedByte();
              this.field_g = this.field_f << 1453009701;
              this.field_c = param0.readUnsignedByte();
              this.field_b = this.field_c;
              if (param1 < 10) {
                break L1;
              } else {
                this.field_b = param0.readUnsignedByte();
                break L1;
              }
            }
            this.field_d = new int[this.field_a * this.field_f][];
            var3_int = 0;
            L2: while (true) {
              if (this.field_a * this.field_f <= var3_int) {
                break L0;
              } else {
                var4 = param0.readByte();
                var5 = 0;
                L3: while (true) {
                  L4: {
                    if (var5 >= 4) {
                      break L4;
                    } else {
                      if ((var3_int - -var5 ^ -1) <= (this.field_a * this.field_f ^ -1)) {
                        break L4;
                      } else {
                        L5: {
                          if ((var4 & 3) == 0) {
                            this.field_d[var3_int - -var5] = null;
                            break L5;
                          } else {
                            if (-2 != (var4 & 3 ^ -1)) {
                              this.field_d[var3_int + var5] = new int[32];
                              var6 = new int[32];
                              bf.a(0, 32, param0, 0, 32, var6, 2147483647);
                              break L5;
                            } else {
                              this.field_d[var5 + var3_int] = si.field_v;
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
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("vc.<init>(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
    }

    static {
        field_i = "Reload game";
        field_e = "Passwords must be between 5 and 20 characters long";
    }
}

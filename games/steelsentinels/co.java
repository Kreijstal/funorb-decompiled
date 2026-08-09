/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    static wk[] field_d;
    private cm field_e;
    private cm field_b;
    static gh field_c;
    static long field_f;
    private nc field_a;

    final static boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        if (!param0) {
          if (!ln.field_h) {
            if (ni.b(56)) {
              return true;
            } else {
              return false;
            }
          } else {
            if (!df.field_I) {
              L0: {
                if (!ni.b(56)) {
                  stackIn_10_0 = 0;
                  break L0;
                } else {
                  stackIn_10_0 = 1;
                  break L0;
                }
              }
              return stackIn_10_0 != 0;
            } else {
              stackIn_6_0 = 1;
              return stackIn_6_0 != 0;
            }
          }
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 != -13) {
            field_f = -49L;
        }
    }

    final mn a(byte param0, int param1) {
        mn var3;
        byte[] var4;
        var3 = (mn) (this.field_a.a((long)param1, -100));
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (-32769 >= (param1 ^ -1)) {
              var4 = this.field_e.a(0, (byte) 126, param1 & 32767);
              break L0;
            } else {
              var4 = this.field_b.a(0, (byte) 40, param1);
              break L0;
            }
          }
          if (param0 != -13) {
            return (mn) null;
          } else {
            L1: {
              var3 = new mn();
              if (var4 != null) {
                var3.a(106, new gi(var4));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 >= 32768) {
                var3.c((byte) -3);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_a.a((long)param1, var3, 1);
            return var3;
          }
        }
    }

    final static byte[] a(byte param0, int param1, int param2, byte[] param3) {
        byte[] var4 = null;
        int var5_int = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        ig var5 = null;
        byte[] var6 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -37) {
                break L1;
              } else {
                co.a((byte) -53);
                break L1;
              }
            }
            L2: {
              if (param2 <= 0) {
                var4 = param3;
                break L2;
              } else {
                var8 = new byte[param1];
                var4 = var8;
                var5_int = 0;
                L3: while (true) {
                  if (param1 <= var5_int) {
                    break L2;
                  } else {
                    var8[var5_int] = param3[param2 + var5_int];
                    var5_int++;
                    continue L3;
                  }
                }
              }
            }
            var5 = new ig();
            var5.a(-635160440);
            var5.a((byte) 90, (long)(8 * param1), var4);
            var6 = new byte[64];
            var5.a(var6, true, 0);
            stackIn_9_0 = (byte[]) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4_ref);

            stackIn_12_1 = new StringBuilder().append("co.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    co(int param0, cm param1, cm param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_a = new nc(64);
        try {
          L0: {
            L1: {
              this.field_b = param1;
              this.field_e = param2;
              if (this.field_b == null) {
                break L1;
              } else {
                this.field_b.a(true, 0);
                break L1;
              }
            }
            if (null == this.field_e) {
              break L0;
            } else {
              this.field_e.a(true, 0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("co.<init>(").append(param0).append(',');

            if (param1 == null) {
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
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    static {
    }
}

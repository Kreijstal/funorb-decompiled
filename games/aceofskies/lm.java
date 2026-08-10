/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    private tl field_d;
    static byte[][][] field_c;
    private tl field_a;
    static String field_b;
    private ti field_e;

    final void a(bf param0, int param1) {
        try {
            this.field_d.a(24, -116, 786336);
            if (param1 != 0) {
                this.field_e = (ti) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "lm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(char param0, int param1, String param2, String param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = -14 / ((param1 - -78) / 42);
              var4_int = param2.length();
              var6 = param3.length();
              var7 = var4_int;
              var8 = var6 + -1;
              if (var8 != 0) {
                var9_int = 0;
                L2: while (true) {
                  var9_int = param2.indexOf((int) param0, var9_int);
                  if (0 > var9_int) {
                    break L1;
                  } else {
                    var9_int++;
                    var7 = var7 + var8;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            var9 = new StringBuilder(var7);
            var10 = 0;
            L3: while (true) {
              var11 = param2.indexOf((int) param0, var10);
              if ((var11 ^ -1) > -1) {
                discarded$3 = var9.append(param2.substring(var10));
                stackIn_10_0 = var9.toString();
                break L0;
              } else {
                discarded$4 = var9.append(param2.substring(var10, var11));
                var10 = var11 + 1;
                discarded$5 = var9.append(param3);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("lm.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    final static void a(int param0, ap param1, boolean param2, byte param3) {
        try {
            int var4_int = 65 / ((56 - param3) / 36);
            wt.field_e.a((byte) -62, param0, !param2 ? true : false, 256, param1, 1000000);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "lm.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != -8192) {
            lm.b(63);
            field_b = null;
            field_c = (byte[][][]) null;
            return;
        }
        field_b = null;
        field_c = (byte[][][]) null;
    }

    final void a(int param0) {
        this.field_d.a(4665);
        if (param0 < 120) {
            ap var3 = (ap) null;
            lm.a(-96, (ap) null, true, (byte) 114);
        }
    }

    lm(bf param0) {
        int var4_int = 0;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        jaclib.memory.Stream var4 = null;
        jaclib.memory.Buffer var9 = null;
        try {
          L0: {
            L1: {
              param0.a(new pl[]{new pl(new rl[]{rl.field_b, rl.field_c, rl.field_j}), new pl(rl.field_m)}, -127);
              this.field_d = param0.a(true, (byte) 101);
              this.field_a = param0.a(false, (byte) 81);
              this.field_a.a(12, -126, 393168);
              this.field_e = param0.c(false, 8762);
              this.field_e.a(-12880, 49146);
              var7 = this.field_e.a(true, 32570);
              if (var7 == null) {
                break L1;
              } else {
                L2: {
                  var8 = param0.a(86, var7);
                  if (!jaclib.memory.Stream.b()) {
                    var4_int = 0;
                    L3: while (true) {
                      if (-8192 >= (var4_int ^ -1)) {
                        break L2;
                      } else {
                        var5 = 4 * var4_int;
                        var8.b(var5);
                        var8.b(1 + var5);
                        var8.b(var5 + 2);
                        var8.b(var5 + 2);
                        var8.b(var5 + 3);
                        var8.b(var5);
                        var4_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var4_int = 0;
                    L4: while (true) {
                      if (8191 <= var4_int) {
                        break L2;
                      } else {
                        var5 = 4 * var4_int;
                        var8.a(var5);
                        var8.a(1 + var5);
                        var8.a(2 + var5);
                        var8.a(2 + var5);
                        var8.a(var5 - -3);
                        var8.a(var5);
                        var4_int++;
                        continue L4;
                      }
                    }
                  }
                }
                var8.a();
                this.field_e.a((byte) 33);
                break L1;
              }
            }
            var9 = this.field_a.a(true, (byte) -87);
            if (var9 != null) {
              L5: {
                var4 = param0.a(-115, var9);
                if (jaclib.memory.Stream.b()) {
                  var5 = 0;
                  L6: while (true) {
                    if (8191 <= var5) {
                      break L5;
                    } else {
                      var4.b(0.0f);
                      var4.b(-1.0f);
                      var4.b(0.0f);
                      var4.b(0.0f);
                      var4.b(-1.0f);
                      var4.b(0.0f);
                      var4.b(0.0f);
                      var4.b(-1.0f);
                      var4.b(0.0f);
                      var4.b(0.0f);
                      var4.b(-1.0f);
                      var4.b(0.0f);
                      var5++;
                      continue L6;
                    }
                  }
                } else {
                  var5 = 0;
                  L7: while (true) {
                    if (-8192 >= (var5 ^ -1)) {
                      break L5;
                    } else {
                      var4.a(0.0f);
                      var4.a(-1.0f);
                      var4.a(0.0f);
                      var4.a(0.0f);
                      var4.a(-1.0f);
                      var4.a(0.0f);
                      var4.a(0.0f);
                      var4.a(-1.0f);
                      var4.a(0.0f);
                      var4.a(0.0f);
                      var4.a(-1.0f);
                      var4.a(0.0f);
                      var5++;
                      continue L7;
                    }
                  }
                }
              }
              var4.a();
              this.field_a.a((byte) -60);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("lm.<init>(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    static {
        field_b = "Loading graphics";
    }
}

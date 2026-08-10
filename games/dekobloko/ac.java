/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends be {
    int[] field_C;
    String field_H;
    static String[] field_z;
    char[] field_G;
    static int field_B;
    boolean field_D;
    int[] field_E;
    static int field_A;
    char[] field_y;
    static int field_F;

    final static void f(byte param0) {
        if (param0 > -68) {
            ac.f((byte) 55);
        }
        kk.field_n = 0;
        cg.a(true);
    }

    final static ck[] a(int param0, String param1, String param2, ji param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ck[] stackIn_3_0 = null;
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
              var4_int = param3.b(-1, param1);
              var5 = param3.a(var4_int, 13030, param2);
              if (param0 == 0) {
                break L1;
              } else {
                ac.g((byte) 24);
                break L1;
              }
            }
            stackIn_3_0 = si.a(var5, var4_int, param3, (byte) -46);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ac.C(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0, wl param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -4) {
                break L1;
              } else {
                this.field_H = (String) null;
                break L1;
              }
            }
            L2: while (true) {
              var3_int = param1.d((byte) -60);
              if (var3_int == 0) {
                break L0;
              } else {
                this.a(var3_int, param1, -127);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ac.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public static void g(byte param0) {
        if (param0 != -17) {
            ac.g((byte) -64);
        }
        field_z = null;
    }

    private final void a(int param0, wl param1, int param2) {
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char stackIn_8_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char stackIn_17_2 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                this.field_H = param1.c((byte) -38);
                break L1;
              } else {
                if (-3 != (param0 ^ -1)) {
                  if (3 == param0) {
                    var4_int = param1.d((byte) -37);
                    this.field_E = new int[var4_int];
                    this.field_y = new char[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L3: {
                          this.field_E[var5] = param1.e(3);
                          var6 = param1.g((byte) -107);
                          stackIn_16_0 = this.field_y;

                          stackIn_16_1 = var5;

                          if (-1 == (var6 ^ -1)) {
                            stackIn_17_0 = (char[]) ((Object) stackIn_16_0);
                            stackIn_17_1 = stackIn_16_1;
                            stackIn_17_2 = (char)0;
                            break L3;
                          } else {
                            stackIn_17_0 = (char[]) ((Object) stackIn_16_0);
                            stackIn_17_1 = stackIn_16_1;
                            stackIn_17_2 = jb.a((byte) var6, (byte) 88);
                            break L3;
                          }
                        }
                        stackIn_17_0[stackIn_17_1] = stackIn_17_2;
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    if (-5 != (param0 ^ -1)) {
                      break L1;
                    } else {
                      this.field_D = true;
                      break L1;
                    }
                  }
                } else {
                  var4_int = param1.d((byte) -47);
                  this.field_G = new char[var4_int];
                  this.field_C = new int[var4_int];
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      L5: {
                        this.field_C[var5] = param1.e(3);
                        var6 = param1.g((byte) -99);
                        stackIn_7_0 = this.field_G;

                        stackIn_7_1 = var5;

                        if (0 == var6) {
                          stackIn_8_0 = (char[]) ((Object) stackIn_7_0);
                          stackIn_8_1 = stackIn_7_1;
                          stackIn_8_2 = (char)0;
                          break L5;
                        } else {
                          stackIn_8_0 = (char[]) ((Object) stackIn_7_0);
                          stackIn_8_1 = stackIn_7_1;
                          stackIn_8_2 = jb.a((byte) var6, (byte) 78);
                          break L5;
                        }
                      }
                      stackIn_8_0[stackIn_8_1] = stackIn_8_2;
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
            }
            var4_int = 8 % ((2 - param2) / 44);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("ac.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
    }

    final void c(int param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = client.field_A ? 1 : 0;
        if (param0 != -1) {
            return;
        }
        if (!(this.field_E == null)) {
            for (var2 = 0; var2 < this.field_E.length; var2++) {
                this.field_E[var2] = de.b(this.field_E[var2], 32768);
            }
        }
        if (this.field_C != null) {
            var4 = 0;
            var2 = var4;
            while (var4 < this.field_C.length) {
                this.field_C[var4] = de.b(this.field_C[var4], 32768);
                var4++;
            }
        }
    }

    ac() {
        this.field_D = false;
    }

    static {
        field_z = new String[]{"Master Challenge: prove your prowess", "Unlock 4 more vibrant and varied themes", "Large bucket: grow shapes to the limit", "Use special items in multiplayer...", "...to turn things around spectacularly!", "Loads of extra Achievements", null, null};
        field_B = 480;
    }
}

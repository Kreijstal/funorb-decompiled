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
        ck[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param3.b(-1, param1);
            var5 = param3.a(var4_int, 13030, param2);
            stackOut_0_0 = si.a(var5, var4_int, param3, (byte) -46);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("ac.C(").append(0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(byte param0, wl param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("ac.F(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        char stackOut_15_2 = 0;
        char[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        char stackOut_6_2 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                this.field_H = param1.c((byte) -38);
                break L1;
              } else {
                if (param0 != 2) {
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
                          stackOut_14_0 = this.field_y;
                          stackOut_14_1 = var5;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          if (var6 == 0) {
                            stackOut_16_0 = (char[]) ((Object) stackIn_16_0);
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = 0;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            stackIn_17_2 = stackOut_16_2;
                            break L3;
                          } else {
                            stackOut_15_0 = (char[]) ((Object) stackIn_15_0);
                            stackOut_15_1 = stackIn_15_1;
                            stackOut_15_2 = jb.a((byte) var6, (byte) 88);
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_17_1 = stackOut_15_1;
                            stackIn_17_2 = stackOut_15_2;
                            break L3;
                          }
                        }
                        stackIn_17_0[stackIn_17_1] = (char) stackIn_17_2;
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    if (param0 != 4) {
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
                    if (~var5 <= ~var4_int) {
                      break L1;
                    } else {
                      L5: {
                        this.field_C[var5] = param1.e(3);
                        var6 = param1.g((byte) -99);
                        stackOut_5_0 = this.field_G;
                        stackOut_5_1 = var5;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (0 == var6) {
                          stackOut_7_0 = (char[]) ((Object) stackIn_7_0);
                          stackOut_7_1 = stackIn_7_1;
                          stackOut_7_2 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          stackIn_8_2 = stackOut_7_2;
                          break L5;
                        } else {
                          stackOut_6_0 = (char[]) ((Object) stackIn_6_0);
                          stackOut_6_1 = stackIn_6_1;
                          stackOut_6_2 = jb.a((byte) var6, (byte) 78);
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_8_2 = stackOut_6_2;
                          break L5;
                        }
                      }
                      stackIn_8_0[stackIn_8_1] = (char) stackIn_8_2;
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
            }
            var4_int = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4);
            stackOut_21_1 = new StringBuilder().append("ac.B(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + -127 + ')');
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
            while (~var4 > ~this.field_C.length) {
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

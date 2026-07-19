/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mu {
    rk[] field_i;
    ola field_e;
    static int[] field_j;
    int field_c;
    int field_a;
    private int[] field_h;
    static kia field_d;
    static String field_b;
    static boolean field_k;
    int field_g;
    int[] field_f;
    static String field_m;
    static int[] field_l;

    public static void a(int param0) {
        kv[] discarded$0 = null;
        field_j = null;
        field_d = null;
        if (param0 != 9072) {
            discarded$0 = mu.a(99, -114, 75, 42, 22, (byte) -8);
        }
        field_b = null;
        field_m = null;
        field_l = null;
    }

    final static kv[] a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        kv var9 = null;
        kv var10 = null;
        kv var11 = null;
        kv var12 = null;
        kv var13 = null;
        Object var14 = null;
        int[] var15 = null;
        kv var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var18 = dg.field_e;
          var17 = var18;
          var15 = var17;
          var6 = var15;
          var7 = dg.field_i;
          var8 = dg.field_c;
          var9 = new kv(param1, param2 + -(2 * param1));
          var9.b();
          dg.b(0, 0, param1, param2 - 2 * param1, param0, param3);
          var10 = new kv(param1, param1);
          var10.b();
          dg.c(0, 0, param1, param1, param0);
          var11 = new kv(16, param1);
          var11.b();
          dg.c(0, 0, 16, param1, param0);
          var12 = new kv(param1, param1);
          var12.b();
          dg.c(0, 0, param1, param1, param3);
          if (param5 == 17) {
            break L0;
          } else {
            field_j = (int[]) null;
            break L0;
          }
        }
        L1: {
          var13 = new kv(16, param1);
          var13.b();
          dg.c(0, 0, 16, param1, param3);
          var14 = null;
          if (param4 > 0) {
            var16 = new kv(16, 16);
            var14 = var16;
            var16.b();
            dg.c(0, 0, 16, 16, param4);
            break L1;
          } else {
            break L1;
          }
        }
        dg.a(var18, var7, var8);
        return new kv[]{var10, var11, var10, var9, (kv) (var14), var9, var12, var13, var12};
    }

    final void b(int param0) {
        kv[] discarded$1 = null;
        L0: {
          this.field_c = 0;
          this.field_e = hga.n(param0 ^ -27213);
          this.field_a = 500;
          this.field_f = new int[50];
          this.field_h = new int[50];
          if (param0 == 27185) {
            break L0;
          } else {
            discarded$1 = mu.a(-82, -8, -124, -44, 91, (byte) -42);
            break L0;
          }
        }
        this.field_f[0] = this.field_f[0] + 1;
        this.field_f[28] = this.field_f[28] + 1;
        this.field_f[49] = this.field_f[49] + 1;
        this.field_f[16] = this.field_f[16] + 1;
        this.field_f[17] = this.field_f[17] + 1;
        this.field_f[6] = this.field_f[6] + 1;
        this.field_f[7] = this.field_f[7] + 1;
        this.field_f[24] = this.field_f[24] + 1;
        this.field_f[22] = this.field_f[22] + 1;
        this.field_f[19] = this.field_f[19] + 1;
        this.field_f[45] = this.field_f[45] + 1;
        this.field_f[14] = this.field_f[14] + 1;
        this.field_f[30] = this.field_f[30] + 1;
        this.field_f[21] = this.field_f[21] + 1;
        this.field_e.field_i[2][3].field_f = new it(2, 3, 0);
        this.field_g = 0;
    }

    private final int a(lu param0, boolean param1) {
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        rk discarded$18 = null;
        boolean discarded$19 = false;
        int discarded$20 = 0;
        int discarded$21 = 0;
        int discarded$22 = 0;
        int discarded$23 = 0;
        int discarded$24 = 0;
        int discarded$25 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        boolean[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = param0.b(16711935);
            if (iha.field_j < var3_int) {
              throw new RuntimeException("Profile version too recent! " + var3_int + " > " + iha.field_j);
            } else {
              discarded$13 = param0.f(-122);
              discarded$14 = param0.f(-122);
              this.field_a = param0.f(-81);
              discarded$15 = param0.f(-90);
              discarded$16 = param0.f(-53);
              this.field_c = param0.b(16711935);
              this.field_e = gca.a(0, param0);
              this.field_i = new rk[50];
              var4_int = 0;
              L1: while (true) {
                if (-51 >= (var4_int ^ -1)) {
                  L2: {
                    if (4 < var3_int) {
                      break L2;
                    } else {
                      L3: {
                        var4_int = param0.b(16711935);
                        if ((var4_int ^ -1) > -1) {
                          break L3;
                        } else {
                          if ((var4_int ^ -1) > -4) {
                            discarded$17 = param0.f(99);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      discarded$18 = gka.a(param0, 255);
                      break L2;
                    }
                  }
                  var4 = new boolean[50];
                  var5 = 0;
                  var6 = param0.b(16711935);
                  var7 = 0;
                  L4: while (true) {
                    if (50 <= var7) {
                      L5: {
                        this.field_f = rd.a(true, param0);
                        if (!param1) {
                          break L5;
                        } else {
                          discarded$19 = this.a((byte) -6);
                          break L5;
                        }
                      }
                      L6: {
                        if (var3_int >= 2) {
                          discarded$20 = param0.f((byte) 97);
                          discarded$21 = param0.f((byte) 111);
                          discarded$22 = param0.f((byte) -16);
                          discarded$23 = param0.f((byte) -123);
                          discarded$24 = param0.f((byte) -123);
                          discarded$25 = param0.f((byte) -20);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if ((var3_int ^ -1) > -4) {
                          break L7;
                        } else {
                          this.field_h = new int[50];
                          var7 = 0;
                          L8: while (true) {
                            if ((var7 ^ -1) <= -51) {
                              break L7;
                            } else {
                              this.field_h[var7] = param0.b(16711935);
                              var7++;
                              continue L8;
                            }
                          }
                        }
                      }
                      L9: {
                        if (var3_int >= 4) {
                          this.field_g = param0.b(16711935);
                          break L9;
                        } else {
                          this.field_g = 13;
                          break L9;
                        }
                      }
                      stackOut_34_0 = var3_int;
                      stackIn_35_0 = stackOut_34_0;
                      break L0;
                    } else {
                      L10: {
                        if ((1 << var5 & var6) == 1 << var5) {
                          var4[var7] = true;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var5++;
                      if (var5 == 8) {
                        var5 = 0;
                        var6 = param0.b(16711935);
                        var7++;
                        continue L4;
                      } else {
                        var7++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  this.field_i[var4_int] = gka.a(param0, 255);
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var3);
            stackOut_36_1 = new StringBuilder().append("mu.C(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L11;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L11;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ')');
        }
        return stackIn_35_0;
    }

    public mu() {
        this.field_i = new rk[50];
        this.b(27185);
    }

    mu(lu param0) {
        int discarded$0 = 0;
        this.field_i = new rk[50];
        try {
            discarded$0 = this.a(param0, false);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "mu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0) {
        boolean discarded$0 = false;
        if (param0 < 76) {
            discarded$0 = this.a((byte) -41);
        }
        return this.field_g >= 10 ? true : false;
    }

    static {
        field_j = new int[12];
        field_b = "Click on CONTINUE to return to the fridge. ";
        field_m = "(1 player wants to join)";
    }
}

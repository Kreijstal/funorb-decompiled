/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pv extends ci {
    private boolean field_o;
    static String field_q;
    static String[] field_p;
    static String field_m;
    private boolean field_n;

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (var4_int == 0) {
                L3: {
                  stackIn_10_0 = this;

                  if (-2 != (param1.h(param0 ^ 148) ^ -1)) {
                    stackIn_11_0 = this;
                    stackIn_11_1 = 0;
                    break L3;
                  } else {
                    stackIn_11_0 = this;
                    stackIn_11_1 = 1;
                    break L3;
                  }
                }
                ((pv) (this)).field_o = stackIn_11_1 != 0;
                break L2;
              } else {
                if (1 != var4_int) {
                  L4: {
                    if ((var4_int ^ -1) != -3) {
                      break L4;
                    } else {
                      L5: {
                        stackIn_18_0 = this;

                        if (param1.h(255) != 1) {
                          stackIn_19_0 = this;
                          stackIn_19_1 = 0;
                          break L5;
                        } else {
                          stackIn_19_0 = this;
                          stackIn_19_1 = 1;
                          break L5;
                        }
                      }
                      ((pv) (this)).field_g = stackIn_19_1 != 0;
                      break L4;
                    }
                  }
                  break L2;
                } else {
                  L6: {
                    stackIn_14_0 = this;

                    if (1 != param1.h(255)) {
                      stackIn_15_0 = this;
                      stackIn_15_1 = 0;
                      break L6;
                    } else {
                      stackIn_15_0 = this;
                      stackIn_15_1 = 1;
                      break L6;
                    }
                  }
                  ((pv) (this)).field_n = stackIn_15_1 != 0;
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("pv.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
    }

    public pv() {
        super(1, false);
        this.field_o = true;
        this.field_n = true;
    }

    final int[] c(int param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int[] var7;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            this.b(52, -14);
            break L0;
          }
        }
        L1: {
          var7 = this.field_i.a((byte) -114, param1);
          var3 = var7;
          if (!this.field_i.field_d) {
            break L1;
          } else {
            L2: {
              stackIn_5_0 = this;

              stackIn_5_1 = 0;

              stackIn_5_2 = param0 ^ -17;

              if (this.field_n) {
                stackIn_6_0 = this;
                stackIn_6_1 = stackIn_5_1;
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = hba.field_b - param1;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = stackIn_5_1;
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = param1;
                break L2;
              }
            }
            var4 = this.c(stackIn_6_1, stackIn_6_2, stackIn_6_3);
            if (!this.field_o) {
              lua.a(var4, 0, var7, 0, ns.field_g);
              break L1;
            } else {
              var5 = 0;
              L3: while (true) {
                if (var5 >= ns.field_g) {
                  break L1;
                } else {
                  var7[var5] = var4[-var5 + una.field_b];
                  var5++;
                  continue L3;
                }
              }
            }
          }
        }
        return var3;
    }

    final int[][] b(int param0, int param1) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int[][] var3;
        int[] var5;
        int[] var6;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int var14;
        int[][] var16;
        int[] var17;
        int[] var18;
        int[] var19;
        int[][] var21;
        int[] var22;
        int[] var23;
        int[] var24;
        int[][] var26;
        L0: {
          var12 = TombRacer.field_G ? 1 : 0;
          if (param1 == -1) {
            break L0;
          } else {
            field_p = (String[]) null;
            break L0;
          }
        }
        L1: {
          var21 = this.field_h.a(param0, (byte) 120);
          var16 = var21;
          var13 = var16;
          var3 = var13;
          if (!this.field_h.field_f) {
            break L1;
          } else {
            L2: {
              stackIn_5_0 = this;

              if (!this.field_n) {
                stackIn_6_0 = this;
                stackIn_6_1 = param0;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = -param0 + hba.field_b;
                break L2;
              }
            }
            var26 = this.a(stackIn_6_1, 0, param1 ^ 0);
            var22 = var26[0];
            var17 = var22;
            var5 = var17;
            var23 = var26[1];
            var18 = var23;
            var6 = var18;
            var24 = var26[2];
            var19 = var24;
            var7 = var19;
            var8 = var21[0];
            var9 = var21[1];
            var10 = var21[2];
            if (!this.field_o) {
              var14 = 0;
              var11 = var14;
              L3: while (true) {
                if (ns.field_g <= var14) {
                  break L1;
                } else {
                  var8[var14] = var22[var14];
                  var9[var14] = var23[var14];
                  var10[var14] = var24[var14];
                  var14++;
                  continue L3;
                }
              }
            } else {
              var11 = 0;
              L4: while (true) {
                if (var11 >= ns.field_g) {
                  break L1;
                } else {
                  var8[var11] = var5[una.field_b + -var11];
                  var9[var11] = var6[una.field_b + -var11];
                  var10[var11] = var7[una.field_b + -var11];
                  var11++;
                  continue L4;
                }
              }
            }
          }
        }
        return var3;
    }

    public static void d(byte param0) {
        field_p = null;
        field_m = null;
        if (param0 > -80) {
            field_m = (String) null;
        }
        field_q = null;
    }

    static {
        field_p = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_m = "Password is valid";
        field_q = "Playing";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vda extends ci {
    private int field_r;
    static boolean field_q;
    private int field_p;
    private int field_o;
    static String field_n;
    static iu[] field_m;

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[][] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[][] var35 = null;
        int[][] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        if (param1 == -1) {
          var23 = this.field_h.a(param0, (byte) 123);
          var18 = var23;
          var16 = var18;
          var3 = var16;
          if (!this.field_h.field_f) {
            return var16;
          } else {
            var36 = this.a(param0, 0, -1);
            var37 = var36[0];
            var39 = var36[1];
            var38 = var36[2];
            var8 = var23[0];
            var9 = var23[1];
            var10 = var23[2];
            var11 = 0;
            L0: while (true) {
              L1: {
                if (var11 >= ns.field_g) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var12 = var37[var11];
                        var13 = var38[var11];
                        var14 = var39[var11];
                        if (var12 != var13) {
                          break L4;
                        } else {
                          if (var13 == var14) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var8[var11] = this.field_r;
                      var9[var11] = this.field_p;
                      var10[var11] = this.field_o;
                      if (var15 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                    var8[var11] = this.field_r * var12 >> 1754141132;
                    var9[var11] = this.field_p * var13 >> -1035565524;
                    var10[var11] = var14 * this.field_o >> -1317739860;
                    break L2;
                  }
                  var11++;
                  if (var15 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              return var16;
            }
          }
        } else {
          L5: {
            this.field_r = 10;
            var23 = this.field_h.a(param0, (byte) 123);
            var18 = var23;
            var16 = var18;
            var3 = var16;
            if (this.field_h.field_f) {
              var35 = this.a(param0, 0, -1);
              var28 = var35[0];
              var24 = var28;
              var30 = var35[1];
              var26 = var30;
              var29 = var35[2];
              var25 = var29;
              var8 = var23[0];
              var9 = var23[1];
              var10 = var23[2];
              var11 = 0;
              L6: while (true) {
                if (var11 < ns.field_g) {
                  L7: {
                    L8: {
                      L9: {
                        var12 = var28[var11];
                        var13 = var29[var11];
                        var14 = var30[var11];
                        if (var12 != var13) {
                          break L9;
                        } else {
                          if (var13 == var14) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var8[var11] = this.field_r;
                      var9[var11] = this.field_p;
                      var10[var11] = this.field_o;
                      if (var15 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                    var8[var11] = this.field_r * var12 >> 1754141132;
                    var9[var11] = this.field_p * var13 >> -1035565524;
                    var10[var11] = var14 * this.field_o >> -1317739860;
                    break L7;
                  }
                  var11++;
                  if (var15 == 0) {
                    continue L6;
                  } else {
                    break L5;
                  }
                } else {
                  return var16;
                }
              }
            } else {
              break L5;
            }
          }
          return var16;
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                field_m = (iu[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    var4_int = param2;
                    if (var4_int != 0) {
                      break L5;
                    } else {
                      if (var5 == 0) {
                        this.field_r = param1.d(125);
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (-2 != (var4_int ^ -1)) {
                      break L6;
                    } else {
                      if (var5 == 0) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (2 == var4_int) {
                    break L2;
                  } else {
                    return;
                  }
                }
                this.field_p = param1.d(123);
                if (var5 == 0) {
                  break L3;
                } else {
                  break L2;
                }
              }
              break L0;
            }
            this.field_o = param1.d(127);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("vda.A(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
    }

    public vda() {
        super(1, false);
        this.field_p = 4096;
        this.field_r = 4096;
        this.field_o = 4096;
    }

    public static void d(byte param0) {
        if (param0 != 90) {
            return;
        }
        field_m = null;
        field_n = null;
    }

    static {
        field_n = "Press <img=12><img=13><img=14><img=15> to continue...";
    }
}

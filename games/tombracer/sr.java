/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sr extends b implements tsa {
    private ij field_y;
    private int field_z;
    private String field_C;
    private rj[] field_x;
    private il field_B;
    private int[] field_w;

    final rj a(String param0, byte param1, qc param2) {
        rj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            L1: {
              var4 = new rj(param0, param2);
              var4.field_r = (isa) ((Object) new td());
              var5 = this.field_p + -2;
              if (param1 == -102) {
                break L1;
              } else {
                this.field_B = (il) null;
                break L1;
              }
            }
            this.a((byte) -31, this.field_m, 34 + this.field_p, 0, 0);
            var4.a((byte) -31, -14 + this.field_m, 30, 7, var5);
            this.a(var4, -1);
            stackOut_2_0 = (rj) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("sr.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_13_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (this.field_z <= var6_int) {
                      break L4;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_14_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var8 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (((sr) (this)).field_x[var6_int] != param2) {
                            break L5;
                          } else {
                            L6: {
                              var7 = this.field_w[var6_int];
                              if ((var7 ^ -1) != 0) {
                                break L6;
                              } else {
                                this.field_y.i((byte) -1);
                                if (var8 == 0) {
                                  break L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            jsa.a(false, this.field_w[var6_int]);
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var6_int++;
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param4 >= 44) {
                    break L2;
                  } else {
                    stackOut_13_0 = this;
                    stackIn_14_0 = stackOut_13_0;
                    break L3;
                  }
                }
                ((sr) (this)).field_C = (String) null;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (runtimeException);
            stackOut_16_1 = new StringBuilder().append("sr.M(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    sr(ij param0, il param1, String param2) {
        super(0, 0, 288, 0, (isa) null);
        int var4_int = 0;
        this.field_z = 0;
        try {
            this.field_y = param0;
            this.field_C = param2;
            this.field_B = param1;
            var4_int = null == this.field_C ? 0 : this.field_B.a(this.field_C, 260, this.field_B.field_w);
            this.a((byte) -31, 288, 22 + var4_int, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_z;
            this.b(var4_int - -1, (byte) 104);
            int var5 = -11 % ((-15 - param2) / 38);
            this.field_x[var4_int] = this.a(param0, (byte) -102, (qc) (this));
            this.field_w[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sr.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, byte param1) {
        rj[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        rj[] var7 = null;
        rj[] var8 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (this.field_z < param0) {
          var7 = new rj[param0];
          var8 = var7;
          var3 = var8;
          var4 = new int[param0];
          var5 = 0;
          L0: while (true) {
            if (this.field_z <= var5) {
              this.field_x = var8;
              this.field_z = param0;
              if (param1 < 86) {
                return;
              } else {
                this.field_w = var4;
                return;
              }
            } else {
              var7[var5] = this.field_x[var5];
              var4[var5] = this.field_w[var5];
              var5++;
              if (var6 != 0) {
                if (param1 < 86) {
                  return;
                } else {
                  this.field_w = var4;
                  return;
                }
              } else {
                if (var6 == 0) {
                  continue L0;
                } else {
                  this.field_x = var8;
                  this.field_z = param0;
                  if (param1 < 86) {
                    return;
                  } else {
                    this.field_w = var4;
                    return;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0) {
        boolean discarded$9 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 115) {
          L0: {
            discarded$9 = sr.a(-111);
            if (ub.field_c == ub.field_h) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (ub.field_c == ub.field_h) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = this.field_B.a(this.field_C, 14 + (param0 - -this.field_i), 10 + this.field_n + param1, -28 + this.field_m, this.field_p, 16777215, -1, 0, 0, this.field_B.field_w);
    }

    static {
    }
}

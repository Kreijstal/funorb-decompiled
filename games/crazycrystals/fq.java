/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fq extends ea implements Cloneable {
    fb field_I;
    private int field_v;
    private transient int field_E;
    int field_u;
    transient int field_w;
    transient int field_t;
    static int field_D;
    transient int field_A;
    static volatile int field_C;
    transient int field_B;
    private transient boolean field_y;
    static wg field_x;
    static String field_z;
    private transient int field_F;
    static String field_G;
    private transient mi field_H;

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            rh.a(-1, (java.awt.Component) ((Object) param1));
            ji.a(-110, (java.awt.Component) ((Object) param1));
            if (param0 < -29) {
              L1: {
                if (ok.field_g == null) {
                  break L1;
                } else {
                  ok.field_g.a((byte) 55, (java.awt.Component) ((Object) param1));
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("fq.TC(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        sl stackIn_13_0 = null;
        sl stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        sl stackOut_14_0 = null;
        sl stackOut_12_0 = null;
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
              L2: {
                if (!vh.field_a) {
                  break L2;
                } else {
                  if (2 != this.field_u) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              qp.field_f = false;
              break L1;
            }
            L3: {
              stackOut_4_0 = this;
              stackIn_10_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 > param5) {
                stackOut_10_0 = this;
                stackOut_10_1 = 4;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackIn_9_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if ((param5 ^ -1) < -1) {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 5;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L3;
                } else {
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (param3 >= 0) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 7;
                    stackIn_11_0 = stackOut_8_0;
                    stackIn_11_1 = stackOut_8_1;
                    break L3;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 6;
                    stackIn_11_0 = stackOut_7_0;
                    stackIn_11_1 = stackOut_7_1;
                    break L3;
                  }
                }
              }
            }
            this.d(stackIn_11_1, 1, -9634);
            if (!param2) {
              stackOut_14_0 = super.a(param0, param1, false, param3, param4, param5);
              stackIn_15_0 = stackOut_14_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_12_0 = (sl) null;
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var7);
            stackOut_16_1 = new StringBuilder().append("fq.R(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return stackIn_15_0;
        }
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        f var5 = null;
        RuntimeException var5_ref = null;
        de var6 = null;
        de var7 = null;
        int var8 = 0;
        f stackIn_3_0 = null;
        f stackIn_8_0 = null;
        f stackIn_12_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        f stackOut_7_0 = null;
        f stackOut_11_0 = null;
        Object stackOut_16_0 = null;
        f stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param3 >= 120) {
              var5 = this.field_l;
              L1: while (true) {
                if (var5 instanceof ma) {
                  stackOut_7_0 = this.a(param2, param0, (f) (this), 11460, param1);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (!(var5 instanceof de)) {
                      if (var5 instanceof pn) {
                        var5 = ((pn) ((Object) var5)).field_l;
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      var6 = (de) ((Object) var5);
                      if (var6.field_j != null) {
                        break L2;
                      } else {
                        fn.field_j = fn.field_j + 20;
                        mb.field_g = mb.field_g + 20;
                        var7 = new de();
                        var7.a((byte) 72, (f) (this));
                        stackOut_11_0 = this.a(param2, param0, var7, 11460, param1);
                        stackIn_12_0 = stackOut_11_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  stackOut_16_0 = this;
                  stackIn_17_0 = stackOut_16_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = (f) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var5_ref);
            stackOut_18_1 = new StringBuilder().append("fq.OA(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return (f) (this);
            }
          }
        }
    }

    private final boolean a(int param0, int param1, byte param2, f[][] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        gh var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var5_int = 109 / ((param2 - -54) / 45);
            if (!(param3[param1][param0] instanceof gh)) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              var6 = (gh) ((Object) param3[param1][param0]);
              if (0 != var6.field_x) {
                if (!param3[param1 + -1][param0].a(16736352, param3, true, -1, param1, param0, var6, 0)) {
                  if (!param3[param1 - -1][param0].a(16736352, param3, true, 1, param1, param0, var6, 0)) {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("fq.RC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        mi var5_ref = null;
        mi var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_4_0 = null;
        f stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        f stackOut_34_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            if (null != this.field_I) {
              stackOut_3_0 = this;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_l.a((fq) (this), 127);
                if (this.a(param3, this.field_w, 49, param1, param0)) {
                  break L1;
                } else {
                  this.field_y = true;
                  break L1;
                }
              }
              L2: {
                if (this.i(12555)) {
                  this.d(mb.field_c[this.field_w], 0, -9634);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (this.field_w >= 4) {
                  break L3;
                } else {
                  if (this.field_F >= 180) {
                    L4: {
                      var5_ref = this.g(param1, param3 + -1, param0, 98);
                      var6 = this.g(param1, 1 + param3, param0, 109);
                      if (var5_ref == null) {
                        break L4;
                      } else {
                        L5: {
                          if (var6 == null) {
                            break L5;
                          } else {
                            if (Math.random() >= 0.5) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.d(17, 99, -9634);
                        this.field_H = var5_ref;
                        this.field_H.field_C = (fq) (this);
                        break L3;
                      }
                    }
                    if (var6 == null) {
                      if (-361 != (this.field_F ^ -1)) {
                        break L3;
                      } else {
                        var7 = 0;
                        var8 = 0;
                        var9 = 0;
                        L6: while (true) {
                          if (8 <= var9) {
                            var9 = (int)(0.01 + (-0.02 + (double)var7) * Math.random());
                            var10 = 0;
                            L7: while (true) {
                              if (var10 > var9) {
                                this.d(8 + var9, hp.field_m[8 - -var9], -9634);
                                break L3;
                              } else {
                                L8: {
                                  if ((1 << var10 & var8) == 0) {
                                    var9++;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                var10++;
                                continue L7;
                              }
                            }
                          } else {
                            L9: {
                              if (this.a(param3, var9 + 8, 105, param1, param0)) {
                                var8 = var8 | 1 << var9;
                                var7++;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var9++;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      this.d(16, 99, -9634);
                      this.field_H = var6;
                      this.field_H.field_z = (fq) (this);
                      break L3;
                    }
                  } else {
                    this.a((byte) -128, param0);
                    var5_int = -1 / ((-43 - param2) / 51);
                    return super.b(param0, param1, (byte) 43, param3);
                  }
                }
              }
              this.a((byte) -128, param0);
              var5_int = -1 / ((-43 - param2) / 51);
              stackOut_34_0 = super.b(param0, param1, (byte) 43, param3);
              stackIn_35_0 = stackOut_34_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var5);
            stackOut_36_1 = new StringBuilder().append("fq.B(");
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
              break L10;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L10;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (f) (this);
        } else {
          return stackIn_35_0;
        }
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        RuntimeException var9 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
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
            if (param0 == 16736352) {
              stackOut_3_0 = this.field_l.a(param0 + 0, param1, param2, param3, param4, param5, param6, param7);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var9);
            stackOut_5_1 = new StringBuilder().append("fq.M(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean b(byte param0) {
        if (param0 < 43) {
            return false;
        }
        return this.field_l.b((byte) 53);
    }

    final void d(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param2 != -9634) {
            ea var5 = (ea) null;
            discarded$0 = this.a(-45, (f[][]) null, false, -6, 34, -108, (ea) null, -128);
        }
        this.e((byte) -126);
        this.field_F = 0;
        this.field_E = param1;
        this.field_B = 0;
        this.field_w = param0;
        this.field_y = false;
    }

    final f a(f[][] param0, int param1, f param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        f stackIn_3_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_27_0 = null;
        f stackOut_2_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param3 == 11460) {
              L1: {
                if (this.field_I == null) {
                  L2: {
                    mb.field_g = mb.field_g + 11;
                    fn.field_j = fn.field_j + 11;
                    wd.field_j = wd.field_j - 1;
                    mb.field_g = mb.field_g - ob.field_l;
                    we.field_h = we.field_h + 28;
                    fp.field_a = fp.field_a + 28;
                    je.field_j = je.field_j + 14;
                    b.field_a = b.field_a + 14;
                    this.e((byte) 76);
                    if (ab.field_D != null) {
                      break L2;
                    } else {
                      if (param2 == null) {
                        break L2;
                      } else {
                        var6_int = param2.a(false);
                        var7 = 0;
                        L3: while (true) {
                          if (-4 >= (var7 ^ -1)) {
                            break L2;
                          } else {
                            L4: {
                              if (this.field_u == var7) {
                                break L4;
                              } else {
                                if (0 == (var6_int & 1 << var7)) {
                                  break L4;
                                } else {
                                  q.field_a[var7].field_l = q.field_a[var7].field_l + 1;
                                  break L4;
                                }
                              }
                            }
                            var7++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    oe.field_a[this.field_u] = null;
                    if (null == ab.field_D) {
                      q.field_a[this.field_u].field_h = true;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  qh.field_o.addElement(this);
                  var6_int = 1;
                  var10 = 0;
                  var7 = var10;
                  L6: while (true) {
                    L7: {
                      if (-4 >= (var10 ^ -1)) {
                        break L7;
                      } else {
                        if (oe.field_a[var10] != null) {
                          var6_int = 0;
                          break L7;
                        } else {
                          var10++;
                          continue L6;
                        }
                      }
                    }
                    L8: {
                      if (var6_int != 0) {
                        var9 = (String) null;
                        um.a(0, (String) null, (byte) 124);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    this.field_I = gg.a((fq) (this), (byte) 119, param2, param0);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              stackOut_27_0 = this;
              stackIn_28_0 = stackOut_27_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = (f) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var6);
            stackOut_29_1 = new StringBuilder().append("fq.VA(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (f) (this);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        L0: {
          var8 = CrazyCrystals.field_B;
          if (this.field_I == null) {
            L1: {
              if (24 != param2) {
                break L1;
              } else {
                if (-25 == (param3 ^ -1)) {
                  this.h(-110).c(param1, -param3 + param4, ek.field_f[this.field_u]);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            this.h(-62).b(param1, -param3 + param4, param2 * 2, param3 * 3, ek.field_f[this.field_u]);
            break L0;
          } else {
            this.field_I.a(false, param2, param3, (byte) -107, false, param1, param4);
            break L0;
          }
        }
        L2: {
          if (param5 == 4261) {
            break L2;
          } else {
            this.a(false, -26, -116, 104, 89, -124);
            break L2;
          }
        }
    }

    final f a(f[][] param0, f param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        f stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        f stackOut_2_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            if (2 * this.field_m >= this.field_p) {
              stackOut_2_0 = this.a(-this.field_s + param2, param3 + -this.field_o, param1, -117, param0);
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param4) {
                  break L1;
                } else {
                  this.field_u = 109;
                  break L1;
                }
              }
              stackOut_6_0 = this;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var6);
            stackOut_8_1 = new StringBuilder().append("fq.GB(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (f) (this);
        }
    }

    final int d(byte param0) {
        if (param0 > -40) {
            return 72;
        }
        if (vh.field_a) {
            if (!(-3 == (this.field_u ^ -1))) {
                return -1;
            }
        }
        return -3;
    }

    fq(f param0, int param1, int param2, int param3) {
        super(param0);
        this.field_E = 0;
        this.field_w = 3;
        this.field_I = null;
        this.field_B = 0;
        this.field_y = false;
        this.field_F = 0;
        this.field_H = null;
        try {
            this.field_A = param2;
            this.field_u = param1;
            this.field_t = param3;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "fq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        sl discarded$4 = null;
        sl discarded$5 = null;
        sl discarded$6 = null;
        sl discarded$7 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                this.f(101, -113, (f[][]) null, -55);
                break L1;
              }
            }
            L2: {
              L3: {
                var5_int = 0;
                var6 = 0;
                if (!vh.field_a) {
                  break L3;
                } else {
                  if ((this.field_u ^ -1) != -3) {
                    L4: {
                      if (-25 != (this.field_v ^ -1)) {
                        break L4;
                      } else {
                        var6++;
                        break L4;
                      }
                    }
                    L5: {
                      if (this.field_v != 74) {
                        break L5;
                      } else {
                        var5_int--;
                        break L5;
                      }
                    }
                    L6: {
                      if (25 != this.field_v) {
                        break L6;
                      } else {
                        var6--;
                        break L6;
                      }
                    }
                    L7: {
                      if ((this.field_v ^ -1) == -88) {
                        var5_int++;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    this.field_v = this.field_v + 1;
                    if (-125 == (this.field_v ^ -1)) {
                      this.field_v = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L8: {
                if (cp.field_k[bm.field_e[this.field_u][0]]) {
                  var5_int--;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (!cp.field_k[bm.field_e[this.field_u][2]]) {
                  break L9;
                } else {
                  var6--;
                  break L9;
                }
              }
              L10: {
                if (cp.field_k[bm.field_e[this.field_u][1]]) {
                  var5_int++;
                  break L10;
                } else {
                  break L10;
                }
              }
              if (cp.field_k[bm.field_e[this.field_u][3]]) {
                var6++;
                break L2;
              } else {
                break L2;
              }
            }
            L11: {
              L12: {
                if (0 <= var5_int) {
                  break L12;
                } else {
                  if (param2[param1][-1 + param3].a((byte) -21, param2, param3, 0, param1, (fq) (this), -1)) {
                    discarded$4 = this.a(param2, param1, false, 0, param3, -1);
                    break L11;
                  } else {
                    break L12;
                  }
                }
              }
              L13: {
                if (var5_int <= 0) {
                  break L13;
                } else {
                  if (param2[param1][param3 + 1].a((byte) -21, param2, param3, 0, param1, (fq) (this), 1)) {
                    discarded$5 = this.a(param2, param1, false, 0, param3, 1);
                    break L11;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if ((var6 ^ -1) <= -1) {
                  break L14;
                } else {
                  if (!param2[-1 + param1][param3].a((byte) -21, param2, param3, -1, param1, (fq) (this), 0)) {
                    break L14;
                  } else {
                    discarded$6 = this.a(param2, param1, false, -1, param3, 0);
                    break L11;
                  }
                }
              }
              if (-1 <= (var6 ^ -1)) {
                break L11;
              } else {
                if (param2[1 + param1][param3].a((byte) -21, param2, param3, 1, param1, (fq) (this), 0)) {
                  discarded$7 = this.a(param2, param1, false, 1, param3, 0);
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var5 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var5);
            stackOut_45_1 = new StringBuilder().append("fq.LA(").append(param0).append(',').append(param1).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L15;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L15;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param3 + ')');
        }
    }

    final f a(int param0, int param1, f[][] param2, int param3, int param4, int param5, ea param6) {
        RuntimeException var8 = null;
        f stackIn_2_0 = null;
        f stackIn_4_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        f stackOut_3_0 = null;
        f stackOut_1_0 = null;
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
            if (param3 == -31135) {
              stackOut_3_0 = this.a(param4, param1, param6, param3 + 31015, param2);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (f) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var8);
            stackOut_5_1 = new StringBuilder().append("fq.P(").append(param0).append(',').append(param1).append(',');
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean a(byte param0, f[][] param1, f param2) {
        f discarded$2 = null;
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 42) {
                break L1;
              } else {
                this.a((f[][]) null, -104, 91, false);
                break L1;
              }
            }
            if (this.field_l.b((byte) 66)) {
              discarded$2 = this.a(param1, this.field_t, new ig(param2, (dl[]) null, (f) null, false), param0 + 11418, this.field_A);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("fq.FB(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final nj a(int param0, nj param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        int var7 = 0;
        nj stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            var3_int = 0;
            var4_int = 0;
            L1: while (true) {
              if ((var4_int ^ -1) <= -4) {
                L2: {
                  if (param0 == 23525) {
                    break L2;
                  } else {
                    field_z = (String) null;
                    break L2;
                  }
                }
                L3: {
                  if (!vh.field_a) {
                    var6 = qa.field_h;
                    var5 = var6;
                    var5 = var6;
                    if ((var3_int ^ -1) >= -2) {
                      var4 = g.field_c;
                      var5 = p.field_h;
                      break L3;
                    } else {
                      var4 = q.field_c[this.field_u];
                      var5 = fh.field_j;
                      break L3;
                    }
                  } else {
                    if (2 != this.field_u) {
                      var4 = q.field_c[this.field_u];
                      var5 = pl.field_s;
                      var6 = en.field_F;
                      break L3;
                    } else {
                      var6 = ol.field_E;
                      var4 = g.field_c;
                      var5 = p.field_h;
                      break L3;
                    }
                  }
                }
                stackOut_16_0 = ng.a(var4, param1, new fq(new kp(-1), this.field_u, 0, 0), (byte) -83, var5 + "<br><br>" + var6);
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L4: {
                  if (q.field_a[var4_int].field_b) {
                    var3_int++;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("fq.V(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        return stackIn_17_0;
    }

    final f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        f stackIn_2_0 = null;
        f stackIn_4_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        f stackOut_3_0 = null;
        f stackOut_1_0 = null;
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
            wd.field_j = wd.field_j - 1;
            if (param4 == 17512) {
              fn.field_j = fn.field_j + ob.field_l;
              this.field_A = param6;
              this.field_t = param3;
              fn.field_j = fn.field_j + wd.field_j;
              ob.field_l = ob.field_l - 1;
              stackOut_3_0 = super.a(param0, param1, param2, param3, 17512, param5, param6);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (f) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var8);
            stackOut_5_1 = new StringBuilder().append("fq.I(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(int param0, byte param1) {
        try {
            int var2 = 0;
            int var3_int = 0;
            IOException var3 = null;
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_13_0 = 0;
            if (kd.field_n.field_f < param0) {
              if (oi.field_c == null) {
                return false;
              } else {
                var2 = 43 / ((-3 - param1) / 34);
                try {
                  L0: {
                    var3_int = oi.field_c.c(0);
                    if ((var3_int ^ -1) >= -1) {
                      L1: {
                        if (0 > var3_int) {
                          break L1;
                        } else {
                          if (30000L >= wd.d(-1322)) {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                      jj.a(4);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L2: {
                        if (param0 + -kd.field_n.field_f >= var3_int) {
                          break L2;
                        } else {
                          var3_int = -kd.field_n.field_f + param0;
                          break L2;
                        }
                      }
                      oi.field_c.a(kd.field_n.field_h, var3_int, 2034, kd.field_n.field_f);
                      wg.field_y = lo.a((byte) -60);
                      kd.field_n.field_f = kd.field_n.field_f + var3_int;
                      if (param0 > kd.field_n.field_f) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        kd.field_n.field_f = 0;
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = (IOException) (Object) decompiledCaughtException;
                    jj.a(4);
                    decompiledRegionSelector0 = 3;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_12_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_14_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 2) {
                      return false;
                    } else {
                      return false;
                    }
                  }
                }
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        sl discarded$4 = null;
        boolean discarded$5 = false;
        pn var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param1 == 0) {
              L1: {
                if (this.field_I == null) {
                  break L1;
                } else {
                  this.field_I = this.field_I.a(124);
                  if (this.field_I == null) {
                    L2: {
                      if ((this.field_s | this.field_o) != 0) {
                        discarded$4 = this.a(param3, param2, param0, (byte) -115);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (this != param2[param0][param3]) {
                        var5 = (pn) ((Object) param2[param0][param3]);
                        L4: while (true) {
                          if (var5.field_l == this) {
                            var5.field_l = this.field_l;
                            break L3;
                          } else {
                            var5 = (pn) ((Object) var5.field_l);
                            continue L4;
                          }
                        }
                      } else {
                        param2[param0][param3] = this.field_l;
                        break L3;
                      }
                    }
                    discarded$5 = qh.field_o.removeElement(this);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5_ref);
            stackOut_17_1 = new StringBuilder().append("fq.W(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, String param1) {
        try {
            qn.field_z = param1;
            int var2_int = -64 / ((-73 - param0) / 44);
            rc.a(-25537, 12);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "fq.PC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(byte param0) {
        int var2 = 0;
        L0: {
          var2 = -37 / ((param0 - -26) / 56);
          if (null != this.field_H) {
            L1: {
              if (this.field_H.field_z == this) {
                this.field_H.field_z = null;
                break L1;
              } else {
                if (this.field_H.field_C != this) {
                  break L1;
                } else {
                  this.field_H.field_C = null;
                  break L1;
                }
              }
            }
            this.field_H = null;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void c(boolean param0, boolean param1) {
        if (param1) {
            return;
        }
        if (vh.field_a) {
            if (2 != this.field_u) {
                return;
            }
        }
        if (!param0) {
            return;
        }
        oe.field_a[this.field_u] = (fq) (this);
        q.field_a[this.field_u].field_b = true;
    }

    final boolean a(mj param0, boolean param1, f[][] param2) {
        f discarded$2 = null;
        RuntimeException var4 = null;
        f var5 = null;
        int stackIn_3_0 = 0;
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
        int stackOut_2_0 = 0;
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
            if (param1) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              var5 = (f) null;
              discarded$2 = this.a((f[][]) null, 18, (f) null, 35, -62);
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("fq.PA(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        f stackIn_1_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        f stackOut_0_0 = null;
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
        try {
          L0: {
            we.field_h = we.field_h + 20;
            var6_int = 78 % ((param4 - 73) / 42);
            je.field_j = je.field_j + 10;
            fp.field_a = fp.field_a + 20;
            b.field_a = b.field_a + 10;
            mb.field_g = mb.field_g - 10;
            fn.field_j = fn.field_j - 10;
            stackOut_0_0 = this.a(param0, param1, param3, 6, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var6);
            stackOut_2_1 = new StringBuilder().append("fq.L(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
            if (param3 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    final int a(boolean param0, int param1) {
        boolean discarded$0 = false;
        if (param0) {
            return 3;
        }
        if (param1 != 0) {
            discarded$0 = this.a(95, -64, (byte) 36, (f[][]) null);
            return 0;
        }
        return 0;
    }

    private final mi g(int param0, int param1, f[][] param2, int param3) {
        mi var5 = null;
        RuntimeException var5_ref = null;
        mi stackIn_2_0 = null;
        mi stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mi stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        mi stackOut_1_0 = null;
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
            if (param3 > 96) {
              if (param2[param0][param1] instanceof mi) {
                var5 = (mi) ((Object) param2[param0][param1]);
                if (0 == (var5.field_o | var5.field_s)) {
                  stackOut_7_0 = (mi) (var5);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return null;
                }
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_1_0 = (mi) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5_ref);
            stackOut_11_1 = new StringBuilder().append("fq.CD(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return (mi) ((Object) stackIn_10_0);
          }
        }
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        fq var7 = null;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param0 == -35) {
                break L1;
              } else {
                this.e((byte) -95);
                break L1;
              }
            }
            L2: {
              this.field_A = param2;
              this.field_t = param3;
              if (param1 == null) {
                break L2;
              } else {
                var5_int = 0;
                L3: while (true) {
                  if (var5_int >= param1.length) {
                    break L2;
                  } else {
                    var6 = 0;
                    L4: while (true) {
                      if (var6 >= param1[0].length) {
                        var5_int++;
                        continue L3;
                      } else {
                        L5: {
                          L6: {
                            if (var6 != param2) {
                              break L6;
                            } else {
                              if (var5_int != param3) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (param1[var5_int][var6] instanceof fq) {
                            var7 = (fq) ((Object) param1[var5_int][var6]);
                            if (this.field_u != var7.field_u) {
                              break L5;
                            } else {
                              param1[var5_int][var6] = var7.field_l;
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        var6++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var5);
            stackOut_18_1 = new StringBuilder().append("fq.KC(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        this.field_I.a(param4, param2, param0, (byte) -126, false, param1, param3);
    }

    final boolean i(int param0) {
        L0: {
          if (!this.field_y) {
            L1: {
              if (this.field_w < 4) {
                this.field_F = this.field_F + 1;
                break L1;
              } else {
                break L1;
              }
            }
            this.field_B = this.field_B + 1;
            if (this.field_B >= bp.field_c[this.field_w] << uc.field_c[this.field_w]) {
              this.field_B = fg.field_j[this.field_w] << uc.field_c[this.field_w];
              if ((this.field_B ^ -1) <= -1) {
                if (-1 <= (this.field_E ^ -1)) {
                  break L0;
                } else {
                  this.field_E = this.field_E - 1;
                  if (0 == this.field_E) {
                    this.field_y = true;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                return true;
              }
            } else {
              break L0;
            }
          } else {
            this.field_B = this.field_B - 1;
            if (this.field_B >= 0) {
              break L0;
            } else {
              return true;
            }
          }
        }
        if (param0 == 12555) {
          return false;
        } else {
          return false;
        }
    }

    final void a(f[][] param0, int param1, int param2, boolean param3) {
        if (!(null == this.field_I)) {
            return;
        }
        try {
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "fq.UA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int b(int param0) {
        if (param0 != -3445) {
            field_G = (String) null;
        }
        return tm.field_e;
    }

    final f a(mj param0, byte param1, boolean param2, f[][] param3) {
        Object var5 = null;
        ma stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        Object stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -74) {
                break L1;
              } else {
                this.f(115, -99, (f[][]) null, -6);
                break L1;
              }
            }
            L2: {
              var5 = this;
              if (!param2) {
                break L2;
              } else {
                if (this.field_p >= 2 * this.field_m) {
                  var5 = this.a(param0.field_c, param0.field_b, param0.field_a, 122, param3);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackOut_6_0 = new ma(param0.b((byte) 84), (f) (var5), param0);
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = var5;
            stackOut_8_1 = new StringBuilder().append("fq.S(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = stackIn_10_0;
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = stackIn_9_0;
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return (f) ((Object) stackIn_7_0);
    }

    private final boolean a(int param0, int param1, int param2, int param3, f[][] param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        qf var8 = null;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_19_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_23_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_20_0 = false;
        boolean stackOut_22_0 = false;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        boolean stackOut_18_0 = false;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            var6_int = param1;
            if (-13 != (var6_int ^ -1)) {
              if (-15 != (var6_int ^ -1)) {
                if (-14 == (var6_int ^ -1)) {
                  stackOut_20_0 = this.a(param0 - -1, param3, (byte) 39, param4);
                  stackIn_21_0 = stackOut_20_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if ((var6_int ^ -1) == -16) {
                    stackOut_22_0 = this.field_l instanceof pf;
                    stackIn_23_0 = stackOut_22_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if (var6_int != 17) {
                      if (16 == var6_int) {
                        L1: {
                          if (this.g(param3, param0 - -1, param4, 100) == null) {
                            stackOut_30_0 = 0;
                            stackIn_31_0 = stackOut_30_0;
                            break L1;
                          } else {
                            stackOut_29_0 = 1;
                            stackIn_31_0 = stackOut_29_0;
                            break L1;
                          }
                        }
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        if (param2 >= 44) {
                          stackOut_34_0 = 1;
                          stackIn_35_0 = stackOut_34_0;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          discarded$1 = fq.a(-24, (byte) -122);
                          return true;
                        }
                      }
                    } else {
                      L2: {
                        if (null == this.g(param3, -1 + param0, param4, 124)) {
                          stackOut_26_0 = 0;
                          stackIn_27_0 = stackOut_26_0;
                          break L2;
                        } else {
                          stackOut_25_0 = 1;
                          stackIn_27_0 = stackOut_25_0;
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
              } else {
                stackOut_18_0 = this.a(-1 + param0, param3, (byte) 87, param4);
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              if (!(param4[-1 + param3][param0] instanceof qf)) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var8 = (qf) ((Object) param4[param3 - 1][param0]);
                  if ((var8.field_o | var8.field_s) != 0) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var6);
            stackOut_36_1 = new StringBuilder().append("fq.ED(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param4 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L4;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_23_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_27_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_31_0 != 0;
                    } else {
                      return stackIn_35_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -14;
        }
        return 1 << this.field_u;
    }

    private final void a(byte param0, f[][] param1) {
        sl discarded$1 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        am stackIn_37_0 = null;
        am stackIn_38_0 = null;
        am stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        am stackIn_44_0 = null;
        am stackIn_45_0 = null;
        am stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        am stackOut_36_0 = null;
        am stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        am stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        am stackOut_43_0 = null;
        am stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        am stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param0 < -110) {
                break L1;
              } else {
                discarded$1 = this.a((f[][]) null, 107, true, -13, -41, 97);
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = this.field_w;
                if (-5 == (var3_int ^ -1)) {
                  break L3;
                } else {
                  if (-6 != (var3_int ^ -1)) {
                    if (6 == var3_int) {
                      break L3;
                    } else {
                      if (7 == var3_int) {
                        break L3;
                      } else {
                        L4: {
                          if (9 != var3_int) {
                            if (-11 != (var3_int ^ -1)) {
                              if (var3_int != 12) {
                                if (-14 == (var3_int ^ -1)) {
                                  L5: {
                                    if (-29 == (this.field_B ^ -1)) {
                                      break L5;
                                    } else {
                                      if ((this.field_B ^ -1) != -35) {
                                        break L2;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  L6: {
                                    stackOut_36_0 = cb.field_n;
                                    stackIn_38_0 = stackOut_36_0;
                                    stackIn_37_0 = stackOut_36_0;
                                    if ((this.field_B ^ -1) == -29) {
                                      stackOut_38_0 = (am) ((Object) stackIn_38_0);
                                      stackOut_38_1 = 128;
                                      stackIn_39_0 = stackOut_38_0;
                                      stackIn_39_1 = stackOut_38_1;
                                      break L6;
                                    } else {
                                      stackOut_37_0 = (am) ((Object) stackIn_37_0);
                                      stackOut_37_1 = 96;
                                      stackIn_39_0 = stackOut_37_0;
                                      stackIn_39_1 = stackOut_37_1;
                                      break L6;
                                    }
                                  }
                                  ((am) (Object) stackIn_39_0).a(stackIn_39_1, 6 + this.field_A * 12, 12 * this.field_t, 60, (byte) -111);
                                  break L2;
                                } else {
                                  if (-15 != (var3_int ^ -1)) {
                                    if (15 != var3_int) {
                                      if (var3_int == 16) {
                                        if (this.field_B != 30) {
                                          if (-37 != (this.field_B ^ -1)) {
                                            break L2;
                                          } else {
                                            if (this.field_E != 97) {
                                              break L2;
                                            } else {
                                              c.field_q.a(128, this.field_A * 12 - -3, this.field_t * 12, 60, (byte) -111);
                                              break L2;
                                            }
                                          }
                                        } else {
                                          oj.field_E.a(128, 12 * this.field_A - -9, 12 * this.field_t, 60, (byte) -111);
                                          break L2;
                                        }
                                      } else {
                                        if ((var3_int ^ -1) == -18) {
                                          if (-31 == (this.field_B ^ -1)) {
                                            oj.field_E.a(128, this.field_A * 12 - 9, 12 * this.field_t, 60, (byte) -111);
                                            break L2;
                                          } else {
                                            if (36 != this.field_B) {
                                              break L2;
                                            } else {
                                              if (-98 == (this.field_E ^ -1)) {
                                                c.field_q.a(128, -3 + this.field_A * 12, this.field_t * 12, 60, (byte) -111);
                                                break L2;
                                              } else {
                                                break L2;
                                              }
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    } else {
                                      L7: {
                                        if (this.field_B == 0) {
                                          break L7;
                                        } else {
                                          if (-49 == (this.field_B ^ -1)) {
                                            break L7;
                                          } else {
                                            break L2;
                                          }
                                        }
                                      }
                                      ln.field_f.a(48, this.field_A * 12, 12 * this.field_t, 60, (byte) -111);
                                      break L2;
                                    }
                                  } else {
                                    L8: {
                                      if (this.field_B == 28) {
                                        break L8;
                                      } else {
                                        if (34 == this.field_B) {
                                          break L8;
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                    L9: {
                                      stackOut_43_0 = cb.field_n;
                                      stackIn_45_0 = stackOut_43_0;
                                      stackIn_44_0 = stackOut_43_0;
                                      if (-29 != (this.field_B ^ -1)) {
                                        stackOut_45_0 = (am) ((Object) stackIn_45_0);
                                        stackOut_45_1 = 96;
                                        stackIn_46_0 = stackOut_45_0;
                                        stackIn_46_1 = stackOut_45_1;
                                        break L9;
                                      } else {
                                        stackOut_44_0 = (am) ((Object) stackIn_44_0);
                                        stackOut_44_1 = 128;
                                        stackIn_46_0 = stackOut_44_0;
                                        stackIn_46_1 = stackOut_44_1;
                                        break L9;
                                      }
                                    }
                                    ((am) (Object) stackIn_46_0).a(stackIn_46_1, 12 * this.field_A - 6, this.field_t * 12, 60, (byte) -111);
                                    break L2;
                                  }
                                }
                              } else {
                                if (36 != this.field_B) {
                                  break L2;
                                } else {
                                  if (-3 == (this.field_E ^ -1)) {
                                    rb.field_g.a(128, this.field_A * 12, -6 + 12 * this.field_t, 60, (byte) -111);
                                    break L2;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        if (this.field_B != 10) {
                          break L2;
                        } else {
                          this.field_l.a(-29660, this.field_t * 12, this.field_A * 12);
                          break L2;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
              }
              if (2 != this.field_B) {
                if ((this.field_B ^ -1) == -9) {
                  param1[this.field_t - -this.field_s][this.field_A + this.field_o].a(-29660, this.field_t * 12 - -(this.field_s * this.field_m), this.field_m * this.field_o + this.field_A * 12);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                this.field_l.a(-29660, this.field_t * 12 + this.field_s * this.field_m, this.field_o * this.field_m + this.field_A * 12);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) (var3);
            stackOut_63_1 = new StringBuilder().append("fq.UC(").append(param0).append(',');
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param1 == null) {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L10;
            } else {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L10;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        this.field_A = param0;
        this.field_t = param2;
        if (param1 != -5) {
            this.field_u = -80;
        }
    }

    public static void b(boolean param0) {
        boolean discarded$0 = false;
        field_G = null;
        field_z = null;
        field_x = null;
        if (!param0) {
            discarded$0 = fq.a(29, (byte) -86);
        }
    }

    final dl h(int param0) {
        if (param0 > -2) {
            this.d(102, -119, -74);
        }
        return vj.field_a[this.field_w][this.field_B >> uc.field_c[this.field_w]];
    }

    static {
        field_C = -1;
        field_z = "OVER <%0>";
        field_G = "Arcade Highscores";
    }
}

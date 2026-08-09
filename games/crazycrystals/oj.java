/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oj extends om {
    private int field_A;
    static String field_C;
    private int field_G;
    static int field_y;
    private int field_z;
    static ko[] field_L;
    static String field_M;
    private boolean field_I;
    private int field_F;
    static am field_E;
    static dl field_B;
    private boolean field_J;
    static db field_H;

    final void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_s = 0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "oj.PA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(0, param0, param3, param2)) {
                this.a(param0, (byte) 120, param3, param2);
                this.a(param3, param2, param0, -50);
                discarded$62 = param3.append(" revert=").append(this.field_J);
                if ((this.field_A ^ -1) == -2147483648) {
                  break L1;
                } else {
                  if (this.field_F == 2147483647) {
                    break L1;
                  } else {
                    discarded$63 = param3.append(" to ").append(this.field_A).append(',').append(this.field_F);
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            if (param1 <= -85) {
              stackIn_9_0 = (StringBuilder) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_7_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("oj.MA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_9_0;
        }
    }

    private oj(int param0, int param1, int param2, int param3, wo param4, bi param5, qm param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_A = 2147483647;
        this.field_F = 2147483647;
        try {
            this.field_w = param6;
            this.field_J = param7 ? true : false;
            this.field_I = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "oj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(boolean param0, f[][] param1, int param2, int param3, double param4, int param5, double param6, int param7, byte param8, double param9) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
        int var14 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        wm var29 = null;
        var28 = CrazyCrystals.field_B;
        try {
          L0: {
            var29 = jf.a(param7 - -param3, param5, 0, param5 + param2, param7);
            if (var29 != null) {
              var14 = (int)Math.ceil(param6);
              var15 = -param9 + (double)(param5 + param2 / 2);
              var17 = param6 + (double)(param3 / 2 + param7) - param4;
              var19 = (int)Math.floor(-0.01 + ((double)param5 - var15) / (2.0 * param6));
              var20 = (int)Math.floor(0.01 + (param6 * 2.0 + (-var15 + (double)(param5 - -param2))) / (param6 * 2.0));
              if (param8 == -32) {
                var21 = (int)Math.floor(-0.01 + (-var17 + (double)param7) / (param6 * 2.0));
                var22 = (int)Math.floor((3.0 * param6 + (-var17 + (double)(param3 + param7))) / (2.0 * param6) + 1.01);
                var23 = var21;
                L1: while (true) {
                  if (var23 >= var22) {
                    var29.a((byte) -6);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var24 = (int)Math.floor(param6 * 2.0 * (double)var23 + var17);
                    var25 = (int)Math.floor(var15 + (double)var19 * (2.0 * param6)) & -2;
                    var26 = var19;
                    L2: while (true) {
                      if (var20 <= var26) {
                        var23++;
                        continue L1;
                      } else {
                        L3: {
                          var27 = (int)Math.floor(var15 + (double)(1 + var26) * (param6 * 2.0)) & -2;
                          if ((var25 ^ -1) > (var27 ^ -1)) {
                            L4: {
                              L5: {
                                if ((var23 ^ -1) > -1) {
                                  break L5;
                                } else {
                                  if (param1.length <= var23) {
                                    break L5;
                                  } else {
                                    if (var26 < 0) {
                                      break L5;
                                    } else {
                                      if (param1[var23].length <= var26) {
                                        break L5;
                                      } else {
                                        param1[var23][var26].a(var14, -117, var27 + -var25 >> -428880991, false, var24, var25);
                                        break L4;
                                      }
                                    }
                                  }
                                }
                              }
                              param1[0][0].a(var14, -35, -var25 + var27 >> -561081087, false, var24, var25);
                              break L4;
                            }
                            var25 = var27;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var26++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var13 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var13);

            stackIn_24_1 = new StringBuilder().append("oj.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var5_int = -59 / ((param1 - -50) / 59);
                  if (!(this.field_w instanceof pc)) {
                    break L3;
                  } else {
                    if (!((pc) ((Object) this.field_w)).field_x) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-2 == (this.field_s ^ -1)) {
                  L4: {
                    var6 = qh.field_i + (-this.field_z + -param3);
                    var7 = bm.field_h - this.field_G - param2;
                    if (var6 != this.field_r) {
                      break L4;
                    } else {
                      if (this.field_j == var7) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_j = var7;
                  this.field_r = var6;
                  if (!(this.field_l instanceof kc)) {
                    break L1;
                  } else {
                    ((kc) ((Object) this.field_l)).a((byte) -20, param2, (oj) (this), param3);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (!this.field_J) {
                break L1;
              } else {
                L5: {
                  if (this.field_A == this.field_r) {
                    break L5;
                  } else {
                    L6: {
                      var6 = -this.field_r + this.field_A;
                      stackIn_11_0 = this;

                      stackIn_11_1 = this.field_r;

                      if ((Math.abs(var6) ^ -1) < -3) {
                        stackIn_12_0 = this;
                        stackIn_12_1 = stackIn_11_1;
                        stackIn_12_2 = var6 >> -1687848639;
                        break L6;
                      } else {
                        stackIn_10_0 = this;

                        if (-1 <= (var6 ^ -1)) {
                          stackIn_12_0 = this;
                          stackIn_12_1 = stackIn_11_1;
                          stackIn_12_2 = -1;
                          break L6;
                        } else {
                          stackIn_12_0 = this;
                          stackIn_12_1 = stackIn_11_1;
                          stackIn_12_2 = 1;
                          break L6;
                        }
                      }
                    }
                    ((oj) (this)).field_r = stackIn_12_1 + stackIn_12_2;
                    break L5;
                  }
                }
                if (this.field_j == this.field_F) {
                  break L1;
                } else {
                  L7: {
                    var6 = this.field_F - this.field_j;
                    stackIn_16_0 = this;

                    stackIn_16_1 = this.field_j;

                    if (2 >= Math.abs(var6)) {
                      stackIn_18_0 = this;

                      if ((var6 ^ -1) >= -1) {
                        stackIn_19_0 = this;
                        stackIn_19_1 = stackIn_16_1;
                        stackIn_19_2 = -1;
                        break L7;
                      } else {
                        stackIn_19_0 = this;
                        stackIn_19_1 = stackIn_16_1;
                        stackIn_19_2 = 1;
                        break L7;
                      }
                    } else {
                      stackIn_19_0 = this;
                      stackIn_19_1 = stackIn_16_1;
                      stackIn_19_2 = var6 >> -379201183;
                      break L7;
                    }
                  }
                  ((oj) (this)).field_j = stackIn_19_1 + stackIn_19_2;
                  break L1;
                }
              }
            }
            super.a(param0, -116, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("oj.N(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static bc a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            bc var5 = null;
            tk var5_ref = null;
            bc stackIn_3_0 = null;
            tk stackIn_5_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = Class.forName("hg");
                      if (param1 == 6641) {
                        break L2;
                      } else {
                        oj.f((byte) -17);
                        break L2;
                      }
                    }
                    var5 = (bc) (var4.newInstance());
                    var5.a(param1 ^ 6529, param0, param2, param3);
                    stackIn_3_0 = (bc) (var5);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new tk();
                  ((bc) ((Object) var5_ref)).a(113, param0, param2, param3);
                  stackIn_5_0 = (tk) (var5_ref);
                  return (bc) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var4_ref2);

                stackIn_8_1 = new StringBuilder().append("oj.E(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
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
              throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(byte param0) {
        field_M = null;
        field_L = null;
        field_C = null;
        field_E = null;
        field_H = null;
        if (param0 != 0) {
            return;
        }
        field_B = null;
    }

    final void a(int param0) {
        if (param0 != -8346) {
            return;
        }
        super.a(param0 + 0);
        this.field_w.a(this.field_f, 0, 0, this.field_g, (byte) -52);
        this.field_F = this.field_j;
        this.field_A = this.field_r;
    }

    final boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        qm var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (!param3) {
                break L1;
              } else {
                var9 = (qm) null;
                this.a((qm) null, 27, 42, -63);
                break L1;
              }
            }
            L2: {
              if (var8_int == 0) {
                break L2;
              } else {
                if (!this.field_I) {
                  break L2;
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (!this.a(param1, param0, false, param4, param6)) {
              stackIn_13_0 = var8_int;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L3: {
                if ((param5 ^ -1) == -2) {
                  this.field_G = -param4 + (param1 + -this.field_j);
                  ok.field_e = (oj) (this);
                  this.field_z = -this.field_r + (param6 + -param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_s = param5;
              stackIn_11_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8);

            stackIn_16_1 = new StringBuilder().append("oj.KA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    static {
        field_M = "This ball has a subtle difference from the last one. Did you notice?";
        field_L = new ko[7];
        field_C = "Here be crystals.";
        field_y = 640;
    }
}

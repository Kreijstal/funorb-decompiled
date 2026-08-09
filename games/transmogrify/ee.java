/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends aj implements df {
    private String field_z;
    private lj[] field_F;
    private int[] field_E;
    private int field_w;
    static int field_D;
    private kg field_A;
    private ik field_x;
    static String field_C;
    static String field_y;

    public static void l(int param0) {
        if (param0 != -31263) {
            field_C = (String) null;
            field_y = null;
            field_C = null;
            return;
        }
        field_y = null;
        field_C = null;
    }

    ee(ik param0, kg param1, String param2) {
        super(0, 0, 288, 0, (ui) null);
        int var4_int = 0;
        this.field_w = 0;
        try {
            this.field_A = param1;
            this.field_z = param2;
            this.field_x = param0;
            var4_int = null != this.field_z ? this.field_A.a(this.field_z, 260, this.field_A.field_y) : 0;
            this.a(-108, 0, 0, 288, var4_int + 22);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ee.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_w;
            this.b((byte) -114, param2 + var4_int);
            this.field_F[var4_int] = this.a((ma) (this), 8283, param0);
            this.field_E[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ee.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(byte param0, int param1) {
        lj[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        lj[] var7 = null;
        lj[] var8 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Transmogrify.field_A ? 1 : 0;
                    if (this.field_w >= param1) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var7 = new lj[param1];
                    var8 = var7;
                    var3 = var8;
                    var4 = new int[param1];
                    var5 = 0;
                    if (param0 <= -45) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (var5 < this.field_w) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_w = param1;
                    this.field_F = var8;
                    this.field_E = var4;
                    return;
                }
                case 7: {
                    var7[var5] = this.field_F[var5];
                    var4[var5] = this.field_E[var5];
                    var5++;
                    if (var6 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_w = param1;
                    this.field_F = var8;
                    this.field_E = var4;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) 113);
        this.field_A.a(this.field_z, 14 + this.field_p + param0, this.field_n + (param1 + 10), -28 + this.field_l, this.field_h, 16777215, -1, 0, 0, this.field_A.field_y);
        int var5 = -84 / ((77 - param3) / 34);
    }

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var6_int >= this.field_w) {
                    break L3;
                  } else {
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (param0 != this.field_F[var6_int]) {
                          break L4;
                        } else {
                          L5: {
                            var7 = this.field_E[var6_int];
                            if (-1 != var7) {
                              break L5;
                            } else {
                              this.field_x.r(77);
                              if (var8 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ba.a(param1 + 99, this.field_E[var6_int]);
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var6_int++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 == 17) {
                  break L2;
                } else {
                  this.field_w = 61;
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("ee.MA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(String param0, byte param1, String param2, ci param3, String param4) {
        RuntimeException var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 69) {
                break L1;
              } else {
                var6 = (String) null;
                ee.a((String) null, (byte) 66, (String) null, (ci) null, (String) null);
                break L1;
              }
            }
            if (!param3.a((byte) -115)) {
              stackIn_5_0 = (String) (param0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_7_0 = param2 + " - " + param3.a(0, param4) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("ee.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final lj a(ma param0, int param1, String param2) {
        lj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        lj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new lj(param2, param0);
              var4.field_q = (ui) ((Object) new qa());
              var5 = -2 + this.field_h;
              this.a(85, 0, 0, this.field_l, 34 + this.field_h);
              var4.a(73, var5, 7, this.field_l + -14, 30);
              this.a((qg) (var4), (byte) -83);
              if (param1 == 8283) {
                break L1;
              } else {
                this.field_A = (kg) null;
                break L1;
              }
            }
            stackIn_3_0 = (lj) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("ee.E(");

            if (param0 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

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
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_C = "To Customer Support";
        field_y = "Password: ";
    }
}

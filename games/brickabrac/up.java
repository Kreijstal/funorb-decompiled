/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up extends um {
    static jp[] field_A;
    static tq field_v;
    private be field_B;
    private be[] field_y;
    static String field_x;
    static jp field_w;
    static int field_z;

    final void a(boolean param0, int param1, jp[] param2) {
        int var4_int = 0;
        if (!param0) {
            return;
        }
        try {
            var4_int = param1;
            if (!(null != this.field_y[var4_int])) {
                this.field_y[var4_int] = new be();
            }
            this.field_y[param1].field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "up.FA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, up param1, boolean param2) {
        be dupTemp$13 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        be var5 = null;
        be var6 = null;
        int var7 = 0;
        jp var8 = null;
        be stackIn_9_0 = null;
        be stackIn_10_0 = null;
        be stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        be stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        be stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        be stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        be stackIn_14_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        be stackOut_8_0 = null;
        be stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        be stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        be stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        be stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        be stackOut_13_2 = null;
        be stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        be stackOut_12_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(-35, param1);
              if (param0) {
                break L1;
              } else {
                var8 = (jp) null;
                this.a(54, (jp) null);
                break L1;
              }
            }
            L2: {
              if (!param2) {
                pm.a(this.field_y, 0, param1.field_y, 0, 6);
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= 6) {
                    break L2;
                  } else {
                    L4: {
                      var5 = this.field_y[var4_int];
                      var6 = var5;
                      var6 = var5;
                      if (var5 != null) {
                        L5: {
                          var6 = param1.field_y[var4_int];
                          stackOut_8_0 = (be) (var5);
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          if (param0) {
                            stackOut_10_0 = (be) ((Object) stackIn_10_0);
                            stackOut_10_1 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            break L5;
                          } else {
                            stackOut_9_0 = (be) ((Object) stackIn_9_0);
                            stackOut_9_1 = 1;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            break L5;
                          }
                        }
                        L6: {
                          stackOut_11_0 = (be) ((Object) stackIn_11_0);
                          stackOut_11_1 = stackIn_11_1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          if (var6 != null) {
                            stackOut_13_0 = (be) ((Object) stackIn_13_0);
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = (be) (var6);
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            break L6;
                          } else {
                            dupTemp$13 = new be();
                            param1.field_y[var4_int] = dupTemp$13;
                            stackOut_12_0 = (be) ((Object) stackIn_12_0);
                            stackOut_12_1 = stackIn_12_1;
                            stackOut_12_2 = (be) (dupTemp$13);
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            break L6;
                          }
                        }
                        ((be) (Object) stackIn_14_0).a(stackIn_14_1 != 0, stackIn_14_2);
                        break L4;
                      } else {
                        param1.field_y[var4_int] = null;
                        break L4;
                      }
                    }
                    var4_int++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("up.HA(").append(param0).append(',');
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
          throw qb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
    }

    final void a(jp[] param0, boolean param1) {
        be[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        be var5 = null;
        int var6 = 0;
        be[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_x = (String) null;
                break L1;
              }
            }
            var7 = this.field_y;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_f = param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("up.GA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        RuntimeException var6 = null;
        be var7 = null;
        be var9 = null;
        d var10 = null;
        be var11 = null;
        be var12 = null;
        be var13 = null;
        be var14 = null;
        oc stackIn_5_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        oc stackOut_3_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -20618) {
                break L1;
              } else {
                up.b(62);
                break L1;
              }
            }
            L2: {
              if (!(param3 instanceof d)) {
                stackOut_4_0 = null;
                stackIn_5_0 = (oc) ((Object) stackOut_4_0);
                break L2;
              } else {
                stackOut_3_0 = (oc) (param3);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var10 = (d) ((Object) stackIn_5_0);
              vi.a((byte) 106, param3.field_t + param3.field_o + param2, param2 - -param3.field_o, param4 + param3.field_w, param4 + param3.field_w - -param3.field_s);
              if (var10 == null) {
                break L3;
              } else {
                param0 = param0 & var10.field_J;
                break L3;
              }
            }
            L4: {
              var7 = this.field_y[0];
              this.field_B.a(-2147483648);
              var7.a(this.field_B, 2147483647, (up) (this), param3, param2, param4);
              if (var10 != null) {
                L5: {
                  if (!var10.field_F) {
                    break L5;
                  } else {
                    var11 = this.field_y[1];
                    if (var11 != null) {
                      var11.a(this.field_B, 2147483647, (up) (this), param3, param2, param4);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var10.field_q) {
                  L6: {
                    var12 = this.field_y[3];
                    if (var10.field_n == 0) {
                      break L6;
                    } else {
                      if (var12 != null) {
                        var12.a(this.field_B, 2147483647, (up) (this), param3, param2, param4);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = this.field_y[2];
                  if (var9 == null) {
                    break L4;
                  } else {
                    var9.a(this.field_B, 2147483647, (up) (this), param3, param2, param4);
                    break L4;
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L7: {
              if (!param3.f(-76)) {
                break L7;
              } else {
                var13 = this.field_y[5];
                if (var13 != null) {
                  var13.a(this.field_B, 2147483647, (up) (this), param3, param2, param4);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (param0) {
                break L8;
              } else {
                var14 = this.field_y[4];
                if (var14 == null) {
                  break L8;
                } else {
                  var14.a(this.field_B, 2147483647, (up) (this), param3, param2, param4);
                  break L8;
                }
              }
            }
            this.field_B.a(param4, (up) (this), param3, (byte) -109, param2);
            sc.b(param1 ^ 20704);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var6);
            stackOut_30_1 = new StringBuilder().append("up.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param4 + ')');
        }
    }

    up(up param0, boolean param1) {
        this();
        try {
            param0.a(true, (up) (this), param1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "up.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_w = null;
        if (param0 != 3) {
            up.b(20);
        }
        field_x = null;
        field_v = null;
        field_A = null;
    }

    final be b(int param0, int param1) {
        if (param1 <= 102) {
            return (be) null;
        }
        be dupTemp$0 = new be();
        this.field_y[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public up() {
        this.field_y = new be[6];
        this.field_B = new be();
        be dupTemp$0 = new be();
        this.field_y[0] = dupTemp$0;
        be var1 = dupTemp$0;
        var1.a(-2147483648);
    }

    final void a(int param0, jp param1) {
        be[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        be var5 = null;
        int var6 = 0;
        be[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1553) {
                break L1;
              } else {
                field_v = (tq) null;
                break L1;
              }
            }
            var7 = this.field_y;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_k = param1;
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("up.CA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_x = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_v = new tq();
    }
}

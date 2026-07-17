/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ic {
    private qi[] field_s;
    static int field_r;
    private qi field_p;
    static aa field_q;
    static int field_o;

    final qi a(byte param0, int param1) {
        if (param0 != 118) {
            field_o = -123;
        }
        qi dupTemp$0 = new qi();
        ((gi) this).field_s[param1] = dupTemp$0;
        return dupTemp$0;
    }

    private final void a(boolean param0, gi param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        qi var5 = null;
        qi var6 = null;
        int var7 = 0;
        qi stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        qi stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        qi stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        qi stackIn_8_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        qi stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        qi stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        qi stackOut_7_2 = null;
        qi stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        qi stackOut_6_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(-19397, (ic) (Object) param1);
              if (!param0) {
                pd.a((Object[]) (Object) ((gi) this).field_s, 0, (Object[]) (Object) param1.field_s, 0, 6);
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (6 <= var4_int) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((gi) this).field_s[var4_int];
                      if (var5 == null) {
                        param1.field_s[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param1.field_s[var4_int];
                          stackOut_5_0 = (qi) var5;
                          stackOut_5_1 = 0;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          if (var6 == null) {
                            qi dupTemp$13 = new qi();
                            param1.field_s[var4_int] = dupTemp$13;
                            stackOut_7_0 = (qi) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = (qi) dupTemp$13;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            stackIn_8_2 = stackOut_7_2;
                            break L4;
                          } else {
                            stackOut_6_0 = (qi) (Object) stackIn_6_0;
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = (qi) var6;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            break L4;
                          }
                        }
                        ((qi) (Object) stackIn_8_0).a(stackIn_8_1 != 0, stackIn_8_2);
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("gi.P(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + 11 + 41);
        }
    }

    gi(gi param0, boolean param1) {
        this();
        try {
            param0.a(param1, (gi) this, 11);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "gi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(qj param0, int param1) {
        qi[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        qi var5 = null;
        int var6 = 0;
        qi[] var7 = null;
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
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var7 = ((gi) this).field_s;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var7.length <= var4) {
                L2: {
                  if (param1 < -109) {
                    break L2;
                  } else {
                    field_o = 45;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_g = param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("gi.N(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    final void a(int param0, qj[] param1) {
        qi[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        qi var5 = null;
        int var6 = 0;
        qi[] var7 = null;
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
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var7 = ((gi) this).field_s;
            var3 = var7;
            if (param0 <= -45) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= var7.length) {
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 != null) {
                      var5.field_i = param1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("gi.O(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        qi var7 = null;
        qi var9 = null;
        rh var10 = null;
        qi var11 = null;
        qi var12 = null;
        qi var13 = null;
        qi var14 = null;
        al stackIn_3_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        al stackOut_1_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof rh)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (al) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (al) param1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (rh) (Object) stackIn_3_0;
              mb.a(param4 - -param1.field_p, param1.field_m + param2, param2 + param1.field_m + param1.field_u, (byte) -41, param1.field_p + (param4 + param1.field_x));
              if (var10 == null) {
                break L2;
              } else {
                param3 = param3 & var10.field_B;
                break L2;
              }
            }
            L3: {
              var7 = ((gi) this).field_s[0];
              ((gi) this).field_p.a((byte) 76);
              if (param0 == -24969) {
                break L3;
              } else {
                gi.c((byte) -116);
                break L3;
              }
            }
            L4: {
              var7.a((gi) this, param2, param1, -1, ((gi) this).field_p, param4);
              if (var10 == null) {
                break L4;
              } else {
                L5: {
                  if (var10.field_G) {
                    var11 = ((gi) this).field_s[1];
                    if (var11 == null) {
                      break L5;
                    } else {
                      var11.a((gi) this, param2, param1, -1, ((gi) this).field_p, param4);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (!var10.field_q) {
                  break L4;
                } else {
                  L6: {
                    var12 = ((gi) this).field_s[3];
                    if (var10.field_r == 0) {
                      break L6;
                    } else {
                      if (var12 != null) {
                        var12.a((gi) this, param2, param1, param0 ^ 24968, ((gi) this).field_p, param4);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = ((gi) this).field_s[2];
                  if (var9 != null) {
                    var9.a((gi) this, param2, param1, -1, ((gi) this).field_p, param4);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L7: {
              if (!param1.h(-115)) {
                break L7;
              } else {
                var13 = ((gi) this).field_s[5];
                if (var13 != null) {
                  var13.a((gi) this, param2, param1, param0 ^ 24968, ((gi) this).field_p, param4);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (param3) {
                break L8;
              } else {
                var14 = ((gi) this).field_s[4];
                if (var14 == null) {
                  break L8;
                } else {
                  var14.a((gi) this, param2, param1, param0 + 24968, ((gi) this).field_p, param4);
                  break L8;
                }
              }
            }
            ((gi) this).field_p.a(param4, param2, param1, -16711924, (gi) this);
            ch.m(35);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("gi.L(").append(param0).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(int param0, qj[] param1, byte param2) {
        int var4_int = 0;
        try {
            var4_int = param0;
            if (param2 != -33) {
                Object var5 = null;
                ((gi) this).a(111, (al) null, -5, true, -65);
            }
            if (null == ((gi) this).field_s[var4_int]) {
                ((gi) this).field_s[var4_int] = new qi();
            }
            ((gi) this).field_s[param0].field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "gi.Q(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public gi() {
        ((gi) this).field_s = new qi[6];
        ((gi) this).field_p = new qi();
        qi dupTemp$0 = new qi();
        ((gi) this).field_s[0] = dupTemp$0;
        qi var1 = dupTemp$0;
        var1.a((byte) 127);
    }

    public static void c(byte param0) {
        field_q = null;
        if (param0 >= -107) {
            gi.c((byte) 60);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new aa(11, 0, 1, 2);
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends ff {
    static byte[][] field_s;
    static int field_u;
    static di field_r;
    static int field_v;
    static String field_w;
    private si field_t;
    private si[] field_x;

    final si a(int param0, int param1) {
        if (param0 >= -93) {
            return null;
        }
        si dupTemp$0 = new si();
        ((rd) this).field_x[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(byte param0, dm[] param1) {
        si[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        si var5 = null;
        int var6 = 0;
        Object var7 = null;
        si[] var8 = null;
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
        var6 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param0 == 124) {
                break L1;
              } else {
                var7 = null;
                ((rd) this).a(-125, -66, 53, true, (el) null);
                break L1;
              }
            }
            var8 = ((rd) this).field_x;
            var3 = var8;
            var4 = 0;
            L2: while (true) {
              if (var8.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 != null) {
                    var5.field_a = param1;
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
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("rd.C(").append(param0).append(',');
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
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    private final void a(boolean param0, rd param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        si var5 = null;
        si var6 = null;
        int var7 = 0;
        si stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        si stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        si stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        si stackIn_9_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        si stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        si stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        si stackOut_8_2 = null;
        si stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        si stackOut_7_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              super.a((ff) (Object) param1, true);
              if (param2) {
                var4_int = 0;
                L2: while (true) {
                  if (6 <= var4_int) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((rd) this).field_x[var4_int];
                      if (var5 == null) {
                        param1.field_x[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param1.field_x[var4_int];
                          stackOut_6_0 = (si) var5;
                          stackOut_6_1 = 2;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var6 == null) {
                            si dupTemp$17 = new si();
                            param1.field_x[var4_int] = dupTemp$17;
                            stackOut_8_0 = (si) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = (si) dupTemp$17;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            break L4;
                          } else {
                            stackOut_7_0 = (si) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = (si) var6;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            break L4;
                          }
                        }
                        ((si) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2);
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                sf.a((Object[]) (Object) ((rd) this).field_x, 0, (Object[]) (Object) param1.field_x, 0, 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("rd.DA(").append(true).append(',');
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
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final void a(int param0, dm param1) {
        si[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        si var5 = null;
        int var6 = 0;
        si[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = Geoblox.field_C;
        try {
          L0: {
            var7 = ((rd) this).field_x;
            var3 = var7;
            var4 = param0;
            L1: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_l = param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("rd.CA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static void c() {
        kd.field_e.f(10936);
        if (!(null != vg.field_i)) {
            vg.field_i = new rl(kd.field_e, ff.field_d);
        }
        kd.field_e.a(false, (el) (Object) vg.field_i);
    }

    final static void b() {
        oe.field_P[45] = 26;
        oe.field_P[44] = 71;
        oe.field_P[520] = 59;
        oe.field_P[222] = 58;
        oe.field_P[192] = 28;
        oe.field_P[46] = 72;
        oe.field_P[47] = 73;
        oe.field_P[92] = 74;
        oe.field_P[91] = 42;
        oe.field_P[93] = 43;
        oe.field_P[61] = 27;
        oe.field_P[59] = 57;
    }

    public rd() {
        ((rd) this).field_x = new si[6];
        ((rd) this).field_t = new si();
        si dupTemp$0 = new si();
        ((rd) this).field_x[0] = dupTemp$0;
        si var1 = dupTemp$0;
        var1.a((byte) -3);
    }

    public static void a(byte param0) {
        int var1 = 71;
        field_r = null;
        field_s = null;
        field_w = null;
    }

    final void a(dm[] param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (((rd) this).field_x[var4_int] == null) {
                ((rd) this).field_x[var4_int] = new si();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((rd) this).field_x[param1].field_a = param0;
              if (param2 > 38) {
                break L2;
              } else {
                field_r = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("rd.GA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        RuntimeException var6 = null;
        si var7 = null;
        si var9 = null;
        hk var10 = null;
        si var11 = null;
        si var12 = null;
        si var13 = null;
        si var14 = null;
        el stackIn_3_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        el stackOut_1_0 = null;
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
              if (!(param4 instanceof hk)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (el) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (el) param4;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (hk) (Object) stackIn_3_0;
              uh.a(param4.field_m + param2, param4.field_v + param0, -14045, param4.field_h + (param2 - -param4.field_m), param4.field_r + (param0 - -param4.field_v));
              if (var10 != null) {
                param3 = param3 & var10.field_D;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = ((rd) this).field_x[0];
              if (param1 < -5) {
                break L3;
              } else {
                field_s = null;
                break L3;
              }
            }
            L4: {
              ((rd) this).field_t.a((byte) -28);
              var7.a(param0, param2, ((rd) this).field_t, (rd) this, -16566, param4);
              if (var10 == null) {
                break L4;
              } else {
                L5: {
                  if (!var10.field_y) {
                    break L5;
                  } else {
                    var11 = ((rd) this).field_x[1];
                    if (var11 == null) {
                      break L5;
                    } else {
                      var11.a(param0, param2, ((rd) this).field_t, (rd) this, -16566, param4);
                      break L5;
                    }
                  }
                }
                if (!var10.field_l) {
                  break L4;
                } else {
                  L6: {
                    var12 = ((rd) this).field_x[3];
                    if (var10.field_f == 0) {
                      break L6;
                    } else {
                      if (var12 == null) {
                        break L6;
                      } else {
                        var12.a(param0, param2, ((rd) this).field_t, (rd) this, -16566, param4);
                        break L4;
                      }
                    }
                  }
                  var9 = ((rd) this).field_x[2];
                  if (var9 == null) {
                    break L4;
                  } else {
                    var9.a(param0, param2, ((rd) this).field_t, (rd) this, -16566, param4);
                    break L4;
                  }
                }
              }
            }
            L7: {
              if (param4.e((byte) 54)) {
                var13 = ((rd) this).field_x[5];
                if (var13 == null) {
                  break L7;
                } else {
                  var13.a(param0, param2, ((rd) this).field_t, (rd) this, -16566, param4);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (!param3) {
                var14 = ((rd) this).field_x[4];
                if (var14 != null) {
                  var14.a(param0, param2, ((rd) this).field_t, (rd) this, -16566, param4);
                  break L8;
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            ((rd) this).field_t.a((rd) this, param0, param2, param4, 0);
            int discarded$1 = 1;
            id.a();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("rd.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
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
          throw t.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
    }

    final static void a(int param0, String param1) {
        try {
            fl.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "rd.FA(" + -119 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rd(rd param0, boolean param1) {
        this();
        try {
            param0.a(true, (rd) this, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "rd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static dm[] a(int param0, int param1, int param2, rh param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (mf.a(param2, param0, 114, param3)) {
            int discarded$2 = 104;
            return hj.a();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("rd.EA(").append(param0).append(',').append(-122).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new byte[250][];
        field_w = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}

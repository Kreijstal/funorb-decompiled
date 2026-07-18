/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    private java.math.BigInteger field_e;
    private qb field_m;
    static int field_n;
    static int field_b;
    static boolean field_o;
    static boolean field_h;
    static int field_d;
    private th field_a;
    private rb[] field_i;
    private java.math.BigInteger field_f;
    private wj field_g;
    static go field_l;
    static uf field_k;
    private cc field_c;
    static int field_j;

    final rb a(int param0, boolean param1, int param2, sk param3, sk param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        rb var9 = null;
        byte[] var13 = null;
        rb stackIn_9_0 = null;
        rb stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        rb stackOut_12_0 = null;
        rb stackOut_8_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (((ci) this).field_a == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (((ci) this).field_i.length > param0) {
                    if (((ci) this).field_i[param0] == null) {
                      L2: {
                        ((ci) this).field_a.field_l = param0 * 72 + 6;
                        var6_int = ((ci) this).field_a.a(-101);
                        if (param2 >= 102) {
                          break L2;
                        } else {
                          field_l = null;
                          break L2;
                        }
                      }
                      var7 = ((ci) this).field_a.a(-73);
                      var13 = new byte[64];
                      ((ci) this).field_a.a(64, 0, (byte) 68, var13);
                      var9 = new rb(param0, param4, param3, ((ci) this).field_g, ((ci) this).field_m, var6_int, var13, var7, param1);
                      ((ci) this).field_i[param0] = var9;
                      stackOut_12_0 = (rb) var9;
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    } else {
                      stackOut_8_0 = ((ci) this).field_i[param0];
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("ci.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_13_0;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = HoldTheLine.field_D;
        if (param0) {
          if (null == ((ci) this).field_i) {
            return;
          } else {
            var2 = 0;
            L0: while (true) {
              if (((ci) this).field_i.length <= var2) {
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (var4 >= ((ci) this).field_i.length) {
                    return;
                  } else {
                    if (((ci) this).field_i[var4] != null) {
                      ((ci) this).field_i[var4].b(2);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (null != ((ci) this).field_i[var2]) {
                  ((ci) this).field_i[var2].c(2);
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 != 100) {
            return;
        }
        field_k = null;
    }

    final static om a(int param0, byte param1) {
        return mc.field_a[param0];
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        L0: {
          if (param1 > 49) {
            break L0;
          } else {
            ci.b((byte) 95);
            break L0;
          }
        }
        if (ik.field_i == param2) {
          if (param3 < -1) {
            throw new RuntimeException();
          } else {
            L1: {
              L2: {
                if (ra.field_ab != param3) {
                  break L2;
                } else {
                  if (ld.field_b != param0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              qj.field_I = -1;
              break L1;
            }
            ld.field_b = param0;
            ra.field_ab = param3;
            return;
          }
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        da var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        ih var11 = null;
        da var12 = null;
        ma var13 = null;
        int[] var14 = null;
        ma var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 <= -121) {
                break L1;
              } else {
                field_n = -46;
                break L1;
              }
            }
            L2: {
              var12 = rd.field_e;
              var2 = var12.f((byte) -84);
              if (0 == var2) {
                var10 = vd.c(1023);
                var18 = var10;
                var17 = var18;
                var16 = var17;
                var14 = var16;
                var3 = var14;
                var9 = var10;
                var4 = var9;
                var5 = var12;
                var6 = ((th) (Object) var5).f((byte) -31);
                var7 = 0;
                L3: while (true) {
                  if (var6 <= var7) {
                    var15 = (ma) (Object) sg.field_v.b((byte) 106);
                    if (var15 != null) {
                      var15.field_j = var3;
                      var15.field_i = true;
                      var15.field_m = var18[0];
                      var15.d(0);
                      break L2;
                    } else {
                      r.a(-28036);
                      return;
                    }
                  } else {
                    var9[var7] = ((th) (Object) var5).a(-67);
                    var7++;
                    continue L3;
                  }
                }
              } else {
                if (var2 == 1) {
                  var11 = (ih) (Object) io.field_c.b((byte) 116);
                  if (var11 == null) {
                    r.a(-28036);
                    return;
                  } else {
                    var11.d(0);
                    break L2;
                  }
                } else {
                  if (var2 == 2) {
                    var13 = (ma) (Object) sg.field_v.b((byte) 112);
                    if (var13 == null) {
                      r.a(-28036);
                      return;
                    } else {
                      var13.field_j = vd.c(1023);
                      var13.field_m = var13.field_j[0];
                      var13.field_i = true;
                      var13.d(0);
                      break L2;
                    }
                  } else {
                    bl.a((Throwable) null, (byte) -52, "A1: " + em.b(false));
                    r.a(-28036);
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "ci.D(" + param0 + ')');
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        th var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = HoldTheLine.field_D;
        if (((ci) this).field_a != null) {
          return true;
        } else {
          L0: {
            if (null != ((ci) this).field_c) {
              break L0;
            } else {
              if (((ci) this).field_g.c(115)) {
                return false;
              } else {
                ((ci) this).field_c = ((ci) this).field_g.a(255, true, (byte) 0, (byte) -60, 255);
                break L0;
              }
            }
          }
          if (((ci) this).field_c.field_u) {
            return false;
          } else {
            L1: {
              var10 = new th(((ci) this).field_c.i(-20324));
              var10.field_l = 5;
              var3 = var10.f((byte) -40);
              var10.field_l = var10.field_l + var3 * 72;
              if (param0 <= -31) {
                break L1;
              } else {
                ci.a((byte) -98);
                break L1;
              }
            }
            L2: {
              L3: {
                var16 = new byte[-var10.field_l + var10.field_i.length];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(var16.length, 0, (byte) 71, var16);
                if (null == ((ci) this).field_e) {
                  break L3;
                } else {
                  if (null != ((ci) this).field_f) {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref_java_math_BigInteger = var12.modPow(((ci) this).field_e, ((ci) this).field_f);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var5 = var4;
              break L2;
            }
            if (var5.length != 65) {
              throw new RuntimeException();
            } else {
              var17 = wc.a(var10.field_i, -6408, 5, -5 + (var10.field_l - var16.length));
              var7 = 0;
              L4: while (true) {
                if (var7 >= 64) {
                  ((ci) this).field_a = var10;
                  ((ci) this).field_i = new rb[var3];
                  return true;
                } else {
                  if (var5[var7 + 1] == var17[var7]) {
                    var7++;
                    continue L4;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
          }
        }
    }

    private ci(wj param0, qb param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
            L1: {
              ((ci) this).field_m = param1;
              ((ci) this).field_f = param3;
              ((ci) this).field_g = param0;
              ((ci) this).field_e = param2;
              if (((ci) this).field_g.c(78)) {
                break L1;
              } else {
                ((ci) this).field_c = ((ci) this).field_g.a(255, true, (byte) 0, (byte) -60, 255);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ci.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    ci(wj param0, qb param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 5;
        field_h = true;
    }
}

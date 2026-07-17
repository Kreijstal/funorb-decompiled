/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    private rn field_j;
    static String[] field_h;
    private java.math.BigInteger field_c;
    private no field_i;
    static int field_k;
    private java.math.BigInteger field_l;
    private ge field_a;
    static int field_g;
    private sp field_d;
    static String field_e;
    private up[] field_f;
    static of field_b;

    final static boolean a(int param0, char param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (param1 == 160) {
              break L1;
            } else {
              if (param1 == 32) {
                break L1;
              } else {
                if (param1 == 95) {
                  break L1;
                } else {
                  if (param1 != 45) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final up a(boolean param0, np param1, int param2, byte param3, np param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        up var9 = null;
        byte[] var13 = null;
        up stackIn_10_0 = null;
        up stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        up stackOut_9_0 = null;
        up stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (((qd) this).field_a == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (((qd) this).field_f.length <= param2) {
                    break L1;
                  } else {
                    if (((qd) this).field_f[param2] != null) {
                      stackOut_9_0 = ((qd) this).field_f[param2];
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    } else {
                      L2: {
                        ((qd) this).field_a.field_v = 6 + param2 * 72;
                        var6_int = ((qd) this).field_a.b(true);
                        var7 = ((qd) this).field_a.b(true);
                        var13 = new byte[64];
                        ((qd) this).field_a.a(0, (byte) -115, var13, 64);
                        var9 = new up(param2, param1, param4, ((qd) this).field_i, ((qd) this).field_j, var6_int, var13, var7, param0);
                        ((qd) this).field_f[param2] = var9;
                        if (param3 == 0) {
                          break L2;
                        } else {
                          ((qd) this).field_j = null;
                          break L2;
                        }
                      }
                      stackOut_13_0 = (up) var9;
                      stackIn_14_0 = stackOut_13_0;
                      break L0;
                    }
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
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("qd.B(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_14_0;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Pool.field_O;
        if (((qd) this).field_f == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (((qd) this).field_f.length <= var2) {
              if (param0 == -46) {
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (var4 >= ((qd) this).field_f.length) {
                    return;
                  } else {
                    if (null != ((qd) this).field_f[var4]) {
                      ((qd) this).field_f[var4].c((byte) 7);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (((qd) this).field_f[var2] != null) {
                ((qd) this).field_f[var2].c(param0 ^ -67);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    public static void a() {
        field_b = null;
        field_h = null;
        int var1 = 0;
        field_e = null;
    }

    qd(no param0, rn param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(boolean param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        ge var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        ge stackIn_12_0 = null;
        ge stackIn_12_1 = null;
        sp stackIn_12_2 = null;
        ge stackIn_13_0 = null;
        ge stackIn_13_1 = null;
        sp stackIn_13_2 = null;
        ge stackIn_14_0 = null;
        ge stackIn_14_1 = null;
        sp stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        ge stackOut_11_0 = null;
        ge stackOut_11_1 = null;
        sp stackOut_11_2 = null;
        ge stackOut_13_0 = null;
        ge stackOut_13_1 = null;
        sp stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        ge stackOut_12_0 = null;
        ge stackOut_12_1 = null;
        sp stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        L0: {
          var8 = Pool.field_O;
          if (param0) {
            break L0;
          } else {
            qd.a((byte) 17, -69);
            break L0;
          }
        }
        if (null != ((qd) this).field_a) {
          return true;
        } else {
          L1: {
            if (null != ((qd) this).field_d) {
              break L1;
            } else {
              if (!((qd) this).field_i.b((byte) -125)) {
                ((qd) this).field_d = ((qd) this).field_i.a(255, 255, (byte) 0, true, -154018400);
                break L1;
              } else {
                return false;
              }
            }
          }
          if (!((qd) this).field_d.field_F) {
            L2: {
              stackOut_11_0 = null;
              stackOut_11_1 = null;
              stackOut_11_2 = ((qd) this).field_d;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              if (param0) {
                stackOut_13_0 = null;
                stackOut_13_1 = null;
                stackOut_13_2 = (sp) (Object) stackIn_13_2;
                stackOut_13_3 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                stackIn_14_3 = stackOut_13_3;
                break L2;
              } else {
                stackOut_12_0 = null;
                stackOut_12_1 = null;
                stackOut_12_2 = (sp) (Object) stackIn_12_2;
                stackOut_12_3 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_14_3 = stackOut_12_3;
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = new ge(((sp) (Object) stackIn_14_2).b(stackIn_14_3 != 0));
                var10.field_v = 5;
                var3 = var10.g(-62);
                var10.field_v = var10.field_v + var3 * 72;
                var16 = new byte[-var10.field_v + var10.field_t.length];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(0, (byte) -125, var4, var16.length);
                if (((qd) this).field_c == null) {
                  break L4;
                } else {
                  if (null != ((qd) this).field_l) {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref_java_math_BigInteger = var12.modPow(((qd) this).field_c, ((qd) this).field_l);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var5 = var4;
              break L3;
            }
            if (65 != var5.length) {
              throw new RuntimeException();
            } else {
              var17 = jr.a(var10.field_v + (-var16.length + -5), (byte) -121, var10.field_t, 5);
              var7 = 0;
              L5: while (true) {
                if (var7 >= 64) {
                  ((qd) this).field_f = new up[var3];
                  ((qd) this).field_a = var10;
                  return true;
                } else {
                  if (var17[var7] == var5[var7 + 1]) {
                    var7++;
                    continue L5;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final static void a(byte param0, int param1) {
        oq var2 = ej.field_j;
        var2.b(false, param1);
        int var3 = -32 / ((param0 - 16) / 57);
        var2.field_v = var2.field_v + 1;
        int var4 = var2.field_v;
        var2.a(2, false);
        var2.a(md.field_c, (byte) 0, 0, md.field_c.length);
        var2.a(pm.field_l, false);
        var2.a(mc.field_l, false);
        var2.a(ka.field_s, (byte) 0, 0, ka.field_s.length);
        var2.b(var2.field_v + -var4, true);
    }

    private qd(no param0, rn param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              ((qd) this).field_c = param2;
              ((qd) this).field_j = param1;
              ((qd) this).field_i = param0;
              ((qd) this).field_l = param3;
              if (((qd) this).field_i.b((byte) -125)) {
                break L1;
              } else {
                ((qd) this).field_d = ((qd) this).field_i.a(255, 255, (byte) 0, true, -154018400);
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
            stackOut_4_1 = new StringBuilder().append("qd.<init>(");
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Quit";
        field_g = 0;
        field_k = -1;
        field_h = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}

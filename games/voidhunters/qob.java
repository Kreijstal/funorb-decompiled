/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qob implements ntb {
    static int field_b;
    private int field_c;
    private int field_a;

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        qob var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              var5 = (qob) (Object) param0;
              var4 = 0;
              if (var5.field_c == var5.field_c) {
                break L1;
              } else {
                var4 = 1;
                System.out.println("int x has changed. before=" + var5.field_c + ", now=" + var5.field_c);
                break L1;
              }
            }
            L2: {
              if (var5.field_a != var5.field_a) {
                var4 = 1;
                System.out.println("int y has changed. before=" + var5.field_a + ", now=" + var5.field_a);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var4 != 0) {
                System.out.println("This instance of Nebula has changed");
                break L3;
              } else {
                break L3;
              }
            }
            if (param1 < -19) {
              break L0;
            } else {
              ((qob) this).field_c = -50;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("qob.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
    }

    public final boolean a(byte param0, tv param1) {
        qob var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              L2: {
                var3 = (qob) (Object) param1;
                var4 = -105 % ((param0 - 22) / 59);
                if (var3.field_c != var3.field_c) {
                  break L2;
                } else {
                  if (var3.field_a == var3.field_a) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("qob.C(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final static void a() {
        int var1 = -59;
        if (!(hwa.field_o == null)) {
            hwa.field_o.l((byte) -106);
        }
        fib.field_j = new waa();
        s.field_o.b((shb) (Object) fib.field_j, -116);
    }

    public final void b(faa param0, int param1) {
        try {
            if (param1 >= -109) {
                Object var4 = null;
                ((qob) this).a((faa) null, true);
            }
            param0.a(-632, ((qob) this).field_c, 32);
            param0.a(-632, ((qob) this).field_a, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qob.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
            return;
        }
        try {
            ((qob) this).field_c = param0.i(0, 32);
            ((qob) this).field_a = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qob.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static boolean a(vu param0, int param1, vu param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
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
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
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
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_int = -param0.field_yb + param2.field_yb;
              if (param2.field_Ab != kbb.field_q) {
                if (null != param2.field_Ab) {
                  break L1;
                } else {
                  var3_int += 200;
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            L2: {
              if (kbb.field_q != param0.field_Ab) {
                if (param0.field_Ab == null) {
                  var3_int -= 200;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var3_int += 200;
                break L2;
              }
            }
            L3: {
              if (var3_int <= 0) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("qob.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(7569).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final int a(boolean param0) {
        if (!param0) {
            ((qob) this).field_c = 7;
            return ((qob) this).field_c;
        }
        return ((qob) this).field_c;
    }

    final boolean a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 100) {
          return true;
        } else {
          L0: {
            var4 = -((qob) this).field_c + param1;
            var5 = -((qob) this).field_a + param2;
            var6 = ar.a(var4, (byte) 105, var5);
            if (var6 >= 32768) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int a(byte param0) {
        if (param0 >= -49) {
            return 42;
        }
        return ((qob) this).field_a;
    }

    private final int a(int param0, boolean param1) {
        return 8192 * (-(param0 % 3) + 3);
    }

    public final void b(byte param0, tv param1) {
        qob var5 = null;
        qob var6 = null;
        try {
            if (param0 < 54) {
                int discarded$0 = ((qob) this).a(false);
            }
            var5 = (qob) (Object) param1;
            var6 = var5;
            var6.field_c = var5.field_c;
            var6.field_a = var5.field_a;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qob.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    qob() {
    }

    qob(int param0, int param1) {
        ((qob) this).field_a = param1;
        ((qob) this).field_c = param0;
    }

    final void a(sg param0, int param1, int param2, lta param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        aja var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var6_int = param4 % 16 + -8;
            var7 = param3.b(((qob) this).field_c - -(fc.a(param2 * var6_int << 1, (byte) -127) >> 4), -125);
            var8 = param3.c(0, ((qob) this).field_a + (eu.a(param2 * var6_int << 1, 116) >> 4));
            if (param1 > 42) {
              L1: {
                var9 = this.a(param4, true);
                var10 = 200;
                var11 = 7842355;
                if (!li.field_i) {
                  break L1;
                } else {
                  if (1 == ki.field_o) {
                    L2: {
                      var12 = param4 % 3 + 8;
                      var13 = mmb.field_d[var12];
                      var14 = (int)((float)var9 * param3.field_a * 4.0f);
                      var15 = (int)var7 + -(var14 >> 1);
                      var16 = -(var14 >> 1) + (int)var8;
                      var17 = var9 << 1;
                      if (param3.field_f[0] > ((qob) this).field_c + var17) {
                        break L2;
                      } else {
                        if (-var17 + ((qob) this).field_c >= param3.field_f[1]) {
                          break L2;
                        } else {
                          if (((qob) this).field_a + var17 < param3.field_f[2]) {
                            break L2;
                          } else {
                            if (param3.field_f[3] <= ((qob) this).field_a + -var17) {
                              break L2;
                            } else {
                              var13.a(var15, var16, var14, var14, 2, var11, 1);
                              return;
                            }
                          }
                        }
                      }
                    }
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              jj.a(var11, (byte) 7, (int)var8, param3.field_a * (float)var9, var10, (int)var7);
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("qob.L(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 64;
    }
}

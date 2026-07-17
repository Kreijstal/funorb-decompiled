/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oa {
    private di[] field_b;
    private uf field_f;
    private rb field_j;
    static ka field_e;
    private java.math.BigInteger field_h;
    private java.math.BigInteger field_i;
    static int field_g;
    static pe field_k;
    private vb field_c;
    private db field_d;
    static int[] field_a;

    oa(vb param0, rb param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final di a(int param0, la param1, boolean param2, byte param3, la param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        di var9 = null;
        byte[] var13 = null;
        di stackIn_9_0 = null;
        di stackIn_13_0 = null;
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
        di stackOut_12_0 = null;
        di stackOut_8_0 = null;
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
            if (((oa) this).field_f == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (param0 >= ((oa) this).field_b.length) {
                    break L1;
                  } else {
                    if (((oa) this).field_b[param0] == null) {
                      L2: {
                        if (param3 == 15) {
                          break L2;
                        } else {
                          boolean discarded$1 = ((oa) this).a(87);
                          break L2;
                        }
                      }
                      ((oa) this).field_f.field_q = 6 + 72 * param0;
                      var6_int = ((oa) this).field_f.i(param3 ^ 41);
                      var7 = ((oa) this).field_f.i(97);
                      var13 = new byte[64];
                      ((oa) this).field_f.a(84, var13, 64, 0);
                      var9 = new di(param0, param1, param4, ((oa) this).field_c, ((oa) this).field_j, var6_int, var13, var7, param2);
                      ((oa) this).field_b[param0] = var9;
                      stackOut_12_0 = (di) var9;
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    } else {
                      stackOut_8_0 = ((oa) this).field_b[param0];
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0;
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
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("oa.F(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
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
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param2).append(44).append(param3).append(44);
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
          throw oj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_13_0;
    }

    public static void b(int param0) {
        field_k = null;
        field_a = null;
        field_e = null;
    }

    final static bf a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        Object var8 = null;
        pa var9 = null;
        lh var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_22_0 = null;
        L0: {
          var7 = TorChallenge.field_F ? 1 : 0;
          var9 = id.field_b;
          var3 = var9.j(-98);
          if (0 == (128 & var3)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          o.field_m = stackIn_3_0 != 0;
          uk.field_L = 127 & var3;
          ih.field_K = var9.j(-85);
          ik.field_b = var9.k(-123);
          if (uk.field_L != 2) {
            hc.field_O = 0;
            hf.field_e = 0;
            break L1;
          } else {
            hc.field_O = var9.c(false);
            hf.field_e = var9.g(0);
            break L1;
          }
        }
        L2: {
          if (param1) {
            break L2;
          } else {
            var8 = null;
            int discarded$5 = oa.a((byte) -112, 80, (Random) null);
            break L2;
          }
        }
        L3: {
          if (1 != var9.j(-111)) {
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var4 = stackIn_11_0;
          vc.field_f = var9.b(false);
          if (var4 == 0) {
            lk.field_b = vc.field_f;
            break L4;
          } else {
            lk.field_b = var9.b(false);
            break L4;
          }
        }
        L5: {
          if (uk.field_L == 1) {
            int discarded$6 = var9.c(false);
            String discarded$7 = var9.b(false);
            break L5;
          } else {
            if (uk.field_L == 4) {
              int discarded$8 = var9.c(false);
              String discarded$9 = var9.b(false);
              break L5;
            } else {
              break L5;
            }
          }
        }
        if (!param0) {
          td.field_q = kk.a((uf) (Object) var9, -77, 80);
          eb.field_k = null;
          return new bf(param0);
        } else {
          var5 = var9.c(false);
          try {
            L6: {
              L7: {
                var10 = ie.field_a.a(var5, (byte) -104);
                td.field_q = var10.b(true);
                if (lk.field_b.equals((Object) (Object) mf.field_a)) {
                  stackOut_23_0 = null;
                  stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                  break L7;
                } else {
                  stackOut_22_0 = var10.field_x;
                  stackIn_24_0 = stackOut_22_0;
                  break L7;
                }
              }
              eb.field_k = stackIn_24_0;
              break L6;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L8: {
              var6 = (Exception) (Object) decompiledCaughtException;
              td.a("CC1", (Throwable) (Object) var6, (byte) -80);
              eb.field_k = null;
              td.field_q = null;
              break L8;
            }
          }
          return new bf(param0);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (((oa) this).field_b != null) {
          var2 = 0;
          L0: while (true) {
            if (((oa) this).field_b.length <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (((oa) this).field_b.length <= var4) {
                  if (param0 >= -94) {
                    bf discarded$1 = oa.a(true, false);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (((oa) this).field_b[var4] != null) {
                    ((oa) this).field_b[var4].c(-91);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (((oa) this).field_b[var2] != null) {
                ((oa) this).field_b[var2].a((byte) -112);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        int var7 = 0;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var8 = 0;
        byte[] var9 = null;
        uf var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        if (((oa) this).field_f != null) {
          return true;
        } else {
          L0: {
            if (null == ((oa) this).field_d) {
              if (!((oa) this).field_c.b((byte) 100)) {
                ((oa) this).field_d = ((oa) this).field_c.a(true, 255, 255, (byte) 0, 101);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!((oa) this).field_d.field_v) {
            var10 = new uf(((oa) this).field_d.e(2));
            var10.field_q = 5;
            var3 = var10.j(-87);
            var10.field_q = var10.field_q + 72 * var3;
            var21 = new byte[-var10.field_q + var10.field_m.length];
            var14 = var21;
            var13 = var14;
            var11 = var13;
            var4 = var11;
            var10.a(param0 + 12048, var4, var21.length, 0);
            if (((oa) this).field_i != null) {
              if (((oa) this).field_h != null) {
                var12 = new java.math.BigInteger(var21);
                var7_ref_java_math_BigInteger = var12.modPow(((oa) this).field_i, ((oa) this).field_h);
                var26 = var7_ref_java_math_BigInteger.toByteArray();
                var19 = var26;
                var5 = var19;
                if (var26.length != 65) {
                  throw new RuntimeException();
                } else {
                  var27 = qc.a(var10.field_m, -5 + (-var21.length + var10.field_q), (byte) -66, 5);
                  var7 = 0;
                  if (param0 == -11982) {
                    L1: while (true) {
                      if (var7 < 64) {
                        if (var27[var7] == var5[var7 - -1]) {
                          var7++;
                          continue L1;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        ((oa) this).field_b = new di[var3];
                        ((oa) this).field_f = var10;
                        return true;
                      }
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                var24 = var4;
                var17 = var24;
                var5 = var17;
                if (var24.length != 65) {
                  throw new RuntimeException();
                } else {
                  var25 = qc.a(var10.field_m, -5 + (-var21.length + var10.field_q), (byte) -66, 5);
                  var18 = var25;
                  var9 = var18;
                  var7 = 0;
                  if (param0 == -11982) {
                    L2: while (true) {
                      if (var7 < 64) {
                        if (var25[var7] == var5[var7 - -1]) {
                          var7++;
                          continue L2;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        ((oa) this).field_b = new di[var3];
                        ((oa) this).field_f = var10;
                        return true;
                      }
                    }
                  } else {
                    return false;
                  }
                }
              }
            } else {
              var22 = var4;
              var15 = var22;
              var5 = var15;
              if (var22.length != 65) {
                throw new RuntimeException();
              } else {
                var23 = qc.a(var10.field_m, -5 + (-var21.length + var10.field_q), (byte) -66, 5);
                var16 = var23;
                var9 = var16;
                var7 = 0;
                if (param0 == -11982) {
                  L3: while (true) {
                    if (var7 < 64) {
                      if (var23[var7] == var5[var7 - -1]) {
                        var7++;
                        continue L3;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      ((oa) this).field_b = new di[var3];
                      ((oa) this).field_f = var10;
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final static int a(byte param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 <= 0) {
              throw new IllegalArgumentException();
            } else {
              if (i.a(17004, param1)) {
                stackOut_6_0 = (int)((4294967295L & (long)param2.nextInt()) * (long)param1 >> 32);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                L1: {
                  if (param0 <= -72) {
                    break L1;
                  } else {
                    field_g = 77;
                    break L1;
                  }
                }
                var3_int = -2147483648 + -(int)(4294967296L % (long)param1);
                L2: while (true) {
                  var4 = param2.nextInt();
                  if (var3_int <= var4) {
                    continue L2;
                  } else {
                    stackOut_12_0 = v.d(-110, var4, param1);
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("oa.D(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    private oa(vb param0, rb param1, java.math.BigInteger param2, java.math.BigInteger param3) {
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
              ((oa) this).field_i = param2;
              ((oa) this).field_h = param3;
              ((oa) this).field_c = param0;
              ((oa) this).field_j = param1;
              if (((oa) this).field_c.b((byte) 100)) {
                break L1;
              } else {
                ((oa) this).field_d = ((oa) this).field_c.a(true, 255, 255, (byte) 0, 71);
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
            stackOut_4_1 = new StringBuilder().append("oa.<init>(");
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
          throw oj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = -1;
        field_e = new ka(160, 160);
        field_a = new int[]{416, 433, 180, 39};
    }
}

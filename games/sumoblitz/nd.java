/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nd extends ao {
    private int[] field_A;
    private int[] field_I;
    int field_K;
    static tv field_B;
    private int field_D;
    private int[] field_J;
    static int field_F;
    static String field_G;
    private int field_C;
    private int field_E;

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_16_0 = false;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_11_0 = false;
        boolean stackOut_13_0 = false;
        boolean stackOut_15_0 = false;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) 19, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var5_int = param3;
              if (var5_int == 98) {
                stackOut_9_0 = ((nd) this).a((byte) -128, param0, ((nd) this).field_A.length);
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                if (99 == var5_int) {
                  stackOut_11_0 = ((nd) this).a(param0, (byte) -99, ((nd) this).field_A.length);
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  if (var5_int == 96) {
                    stackOut_13_0 = ((nd) this).b(param0, (byte) 113);
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (97 == var5_int) {
                      stackOut_15_0 = ((nd) this).a((byte) -17, param0);
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      if (param2 >= 9) {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        break L0;
                      } else {
                        ((nd) this).field_A = null;
                        return false;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("nd.KA(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L1;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_20_0 != 0;
    }

    private final void a(byte param0, int[] param1) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        int var3_int = null == ((nd) this).field_A ? 0 : ((nd) this).field_A.length;
        try {
            var4 = param1.length;
            ((nd) this).field_A = param1;
            var5 = param1;
            var6 = 0;
            var7 = 0;
            while (var6 < var5.length) {
                var7 = var7 + var5[var6];
                var5[var6] = var7 + var5[var6];
                var6++;
            }
            this.b(-1, var4, var3_int);
            this.d(var4, 0, var3_int);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "nd.V(" + 50 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    nd(int param0, int param1, int param2, int param3, mh param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        int[] var10 = null;
        int[] var9 = null;
        ((nd) this).field_K = 92;
        ((nd) this).field_D = 0;
        try {
            var10 = new int[param5];
            int[] var8 = var10;
            la.a(var10, 0, param5, 1);
            var9 = new int[param6];
            la.a(var9, 0, param6, 1);
            this.a((byte) 50, var10);
            this.a(-7170, var9);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "nd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(121, param1, param2, param3, param4);
        int var6 = -72 % ((param0 - 28) / 63);
    }

    final static byte[] a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        fs var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var9 = new fs(param1);
              var3 = var9.e(-31302);
              var4 = var9.c(true);
              if (0 > var4) {
                break L1;
              } else {
                L2: {
                  if (bn.field_R == 0) {
                    break L2;
                  } else {
                    if (bn.field_R >= var4) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (var3 != 0) {
                  L3: {
                    var5 = var9.c(true);
                    if (var5 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (bn.field_R == 0) {
                          break L4;
                        } else {
                          if (bn.field_R >= var5) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        var17 = new byte[var5];
                        var15 = var17;
                        var13 = var15;
                        var11 = var13;
                        var6 = var11;
                        if (var3 == 1) {
                          int discarded$1 = w.a(var17, var5, param1, var4, 9);
                          break L5;
                        } else {
                          var7 = (Object) (Object) sb.field_b;
                          synchronized (var7) {
                            L6: {
                              sb.field_b.a(var17, (byte) -104, var9);
                              break L6;
                            }
                          }
                          break L5;
                        }
                      }
                      stackOut_20_0 = (byte[]) var6;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var16 = new byte[var4];
                  var14 = var16;
                  var12 = var14;
                  var10 = var12;
                  var5_ref_byte__ = var10;
                  var9.a(var16, var4, 0, (byte) -119);
                  stackOut_6_0 = (byte[]) var5_ref_byte__;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("nd.M(").append(-1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = ((nd) this).field_A == null ? 0 : ((nd) this).field_A.length;
        int[] var5 = new int[var4 * param1];
        int var6 = 0;
        if (((nd) this).field_I != null) {
            if (((nd) this).field_I.length > 0) {
                if (var5.length > 0) {
                    if (!(param2 <= 0)) {
                        la.a(((nd) this).field_I, 0, var5, 0, Math.min(param2, param1) * var4);
                    }
                }
            }
        }
        ((nd) this).field_I = var5;
    }

    final void c(int param0, int param1, int param2) {
        ((nd) this).field_E = param2;
        if (param0 != -1) {
            return;
        }
        ((nd) this).field_C = param1;
    }

    final static boolean a(byte param0, boolean param1) {
        try {
            pl var4 = null;
            pl var5 = null;
            if (!(tm.field_a != null)) {
                tm.field_a = jt.field_t.a((byte) 71, mc.field_C, vp.field_a);
            }
            if (param0 > -33) {
                boolean discarded$0 = nd.a((byte) 116, false);
            }
            if (!(tm.field_a.field_c != 0)) {
                return false;
            }
            long dupTemp$1 = wq.a(-38);
            rj.field_a = dupTemp$1;
            jt.field_x = dupTemp$1;
            if (tm.field_a.field_c != 1) {
                kw.field_c = lr.field_b;
            } else {
                {
                    qk.field_O = new dt((java.net.Socket) tm.field_a.field_d, jt.field_t);
                    var4 = ig.field_a;
                    var5 = var4;
                    as.field_v.field_p = 0;
                    var5.field_p = 0;
                    li.field_r = param1 ? -2 : -1;
                    vb.field_I = param1 ? -2 : -1;
                    ur.field_Q = param1 ? -2 : -1;
                    kw.field_c = gg.field_t;
                    sb.a(s.field_o, 81, jt.field_r, ql.field_v, (fs) (Object) as.field_v);
                    gt.a(0, -1);
                }
            }
            tm.field_a = null;
            return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        field_B = null;
        field_G = null;
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          if (null != ((nd) this).field_J) {
            stackOut_2_0 = ((nd) this).field_J.length;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          var9 = new int[param0 * var4];
          var8 = var9;
          var5 = var8;
          if (null == ((nd) this).field_I) {
            ((nd) this).field_I = var5;
            break L1;
          } else {
            if (0 >= ((nd) this).field_I.length) {
              ((nd) this).field_I = var5;
              break L1;
            } else {
              if (var9.length <= 0) {
                ((nd) this).field_I = var5;
                break L1;
              } else {
                if (0 < param2) {
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= var4) {
                      ((nd) this).field_I = var5;
                      break L1;
                    } else {
                      la.a(((nd) this).field_I, var6 * param2, var5, param0 * var6, Math.min(param2, param0));
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  ((nd) this).field_I = var5;
                  break L1;
                }
              }
            }
          }
        }
    }

    final void e(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        pk var5 = null;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (var2 >= ((nd) this).field_x.length) {
              break L1;
            } else {
              if (var3 >= ((nd) this).field_J.length) {
                break L1;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (var2 < ((nd) this).field_x.length) {
                    if (var4 < ((nd) this).field_A.length) {
                      int incrementValue$1 = var2;
                      var2++;
                      var5 = ((nd) this).field_x[incrementValue$1];
                      if (var5 != null) {
                        this.a(var5, var4, 0, var3);
                        var4++;
                        continue L2;
                      } else {
                        var4++;
                        continue L2;
                      }
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            }
          }
          L3: {
            if (!param0) {
              break L3;
            } else {
              ((nd) this).field_K = -124;
              break L3;
            }
          }
          return;
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        pk[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          if (((nd) this).field_J == null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((nd) this).field_J.length;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          var5 = new pk[param1 * var4];
          if (null == ((nd) this).field_x) {
            ((nd) this).field_x = var5;
            break L1;
          } else {
            if (((nd) this).field_x.length <= 0) {
              ((nd) this).field_x = var5;
              break L1;
            } else {
              if (var5.length <= 0) {
                ((nd) this).field_x = var5;
                break L1;
              } else {
                if (0 >= param2) {
                  ((nd) this).field_x = var5;
                  break L1;
                } else {
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= var4) {
                      ((nd) this).field_x = var5;
                      break L1;
                    } else {
                      la.a((Object[]) (Object) ((nd) this).field_x, param2 * var6, (Object[]) (Object) var5, param1 * var6, Math.min(param2, param1));
                      var6++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, pk param2) {
        int var4_int = 0;
        int var5 = 0;
        try {
            var4_int = ((nd) this).field_D % ((nd) this).field_A.length;
            var5 = ((nd) this).field_D / ((nd) this).field_A.length;
            ((nd) this).field_I[((nd) this).field_D] = param0;
            ((nd) this).field_x[((nd) this).field_D] = param2;
            if (param1 != 0) {
                ((nd) this).field_A = null;
            }
            if (param2 != null) {
                this.a(param2, var4_int, 0, var5);
            }
            ((nd) this).field_D = ((nd) this).field_D + 1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "nd.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        try {
            var3_int = ((nd) this).field_J != null ? ((nd) this).field_J.length : 0;
            var4 = param1.length;
            ((nd) this).field_J = param1;
            var5 = param1;
            var6 = 0;
            var7 = 0;
            while (var6 < var5.length) {
                var7 = var7 + var5[var6];
                var5[var6] = var7 + var5[var6];
                var6++;
            }
            this.e(var4, var3_int, 0);
            this.a((byte) 87, var4, var3_int);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "nd.N(" + -7170 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        Object var9 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -42) {
                break L1;
              } else {
                var9 = null;
                boolean discarded$2 = ((nd) this).a((pk) null, 107, -24, -6, 81, 67, -125);
                break L1;
              }
            }
            stackOut_2_0 = super.a(param0, -77, param2, param3, param4, param5, param6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("nd.R(");
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
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = ((nd) this).field_A == null ? 0 : ((nd) this).field_A.length;
        pk[] var5 = new pk[param0 * var4];
        if (((nd) this).field_x != null) {
            if (-1 > ((nd) this).field_x.length) {
                if (0 < var5.length) {
                    if (-1 < param1) {
                        la.a((Object[]) (Object) ((nd) this).field_x, 0, (Object[]) (Object) var5, 0, var4 * Math.min(param1, param0));
                    }
                }
            }
        }
        this.d(-38, 89, 107);
        ((nd) this).field_x = var5;
    }

    private final void a(pk param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var20 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((nd) this).field_A[((nd) this).field_A.length - 1];
              var6 = ((nd) this).field_J[((nd) this).field_J.length - 1];
              if (0 >= param1) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ((nd) this).field_A[param1 - 1];
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0 * ((nd) this).field_q / var5_int;
              stackOut_4_0 = ((nd) this).field_p;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 >= param3) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = ((nd) this).field_J[param3 - 1];
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              L4: {
                var8 = stackIn_7_0 * stackIn_7_1 / var6;
                var9 = ((nd) this).field_A[param1] * ((nd) this).field_q / var5_int;
                var10 = ((nd) this).field_J[param3] * ((nd) this).field_p / var6;
                var11 = param3 * ((nd) this).field_A.length + param1;
                var12 = ((nd) this).field_I[var11] & 48;
                var13 = 192 & ((nd) this).field_I[var11];
                var14 = param0.field_r;
                var15 = param0.field_v;
                var16 = param0.field_q;
                var17 = param0.field_p;
                if (var9 - var7 <= var16) {
                  break L4;
                } else {
                  if ((((nd) this).field_I[var11] & 1) == 0) {
                    break L4;
                  } else {
                    var14 = var7;
                    var16 = -var7 + var9;
                    break L3;
                  }
                }
              }
              L5: {
                if (~(-var7 + var9) <= ~var16) {
                  break L5;
                } else {
                  if (0 != (((nd) this).field_I[var11] & 4)) {
                    var14 = var7;
                    var16 = -var7 + var9;
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              if (16 != var12) {
                if (var12 == 32) {
                  var14 = -var16 + var9;
                  break L3;
                } else {
                  var14 = var7;
                  break L3;
                }
              } else {
                var14 = -var16 + var9 + var7 >> 1;
                break L3;
              }
            }
            L6: {
              L7: {
                if (var10 + -var8 <= var17) {
                  break L7;
                } else {
                  if (0 == (((nd) this).field_I[var11] & 2)) {
                    break L7;
                  } else {
                    var17 = var10 - var8;
                    var15 = var8;
                    break L6;
                  }
                }
              }
              L8: {
                if (~(-var8 + var10) <= ~var17) {
                  break L8;
                } else {
                  if ((8 & ((nd) this).field_I[var11]) != 0) {
                    var15 = var8;
                    var17 = var10 - var8;
                    break L6;
                  } else {
                    break L8;
                  }
                }
              }
              if (var13 == 64) {
                var15 = -var17 + (var10 + var8) >> 1;
                break L6;
              } else {
                if (var13 != 128) {
                  var15 = var8;
                  break L6;
                } else {
                  var15 = -var17 + var10;
                  break L6;
                }
              }
            }
            var18 = ((nd) this).field_E;
            var19 = ((nd) this).field_C;
            param0.a(-89, var14 - -var18, var19 + var15, var17 + -(2 * var19), -(2 * var18) + var16);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var5;
            stackOut_33_1 = new StringBuilder().append("nd.EA(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param1 + ',' + 0 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Error connecting to server. Please try using a different server.";
    }
}

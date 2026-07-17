/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ep extends f implements Cloneable {
    private int field_k;
    private f field_j;
    private int field_i;

    final void b(int param0, int param1, f[][] param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ep) this).field_j.b(101, param1, param2, param3);
              if (param0 > 24) {
                break L1;
              } else {
                int discarded$2 = ((ep) this).a((byte) 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ep.CC(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param3 + 41);
        }
    }

    final int d(int param0) {
        if (param0 >= -77) {
            ((ep) this).field_k = 30;
            return ((ep) this).field_j.d(-82);
        }
        return ((ep) this).field_j.d(-82);
    }

    final static boolean a(char param0, byte param1) {
        if (65 > param0) {
          if (param0 >= 97) {
            if (param0 <= 122) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          if (param0 > 90) {
            if (param0 >= 97) {
              if (param0 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            return -79;
        }
        return 0;
    }

    final static wj[] a(db param0, String param1, String param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wj[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        wj[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param0.a(param2, -1);
            var5 = param0.a(-2862, param1, var4_int);
            stackOut_0_0 = qk.a(false, var4_int, param0, var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("ep.I(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 0 + 41);
        }
        return stackIn_1_0;
    }

    protected final Object clone() {
        ep var1 = (ep) super.clone();
        var1.field_j = (f) var1.field_j.clone();
        return (Object) (Object) var1;
    }

    final void a(int param0, int param1, int param2, DataInputStream param3, byte param4) throws IOException {
        RuntimeException var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((ep) this).field_j = ff.a(param0, param1, 1, param2, param3);
            if (param4 == -35) {
              break L0;
            } else {
              int discarded$2 = ((ep) this).a((byte) 87);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var6;
            stackOut_3_1 = new StringBuilder().append("ep.BC(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param4 + 41);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != -29660) {
            ((ep) this).field_i = -116;
        }
    }

    final static int c(byte param0) {
        if (param0 != 112) {
            return -103;
        }
        return lg.field_b;
    }

    final void b(boolean param0, boolean param1) {
        ((ep) this).field_j.b(param0, param1);
    }

    final int a(byte param0) {
        if (param0 > -34) {
            ((ep) this).field_i = -99;
            return ((ep) this).field_j.a((byte) -39);
        }
        return ((ep) this).field_j.a((byte) -39);
    }

    final int a(int param0, int param1, int param2, fq param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (((ep) this).field_k != param4) {
                break L1;
              } else {
                if (0 != ((ep) this).field_i) {
                  break L1;
                } else {
                  mb.field_g = mb.field_g - 128;
                  fn.field_j = fn.field_j - 128;
                  fp.field_a = fp.field_a + 2;
                  we.field_h = we.field_h + 2;
                  je.field_j = je.field_j + 1;
                  b.field_a = b.field_a + 1;
                  fn.field_j = fn.field_j + ob.field_l;
                  wd.field_j = wd.field_j - 1;
                  pm.field_b.a(128, param1 * 12, 12 * param2, 0, (byte) -111);
                  ((ep) this).field_i = 1;
                  ((ep) this).a((byte) 74, (f) (Object) param3);
                  ((ep) this).field_j.a((byte) 87, (f) (Object) param3);
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  return stackIn_3_0;
                }
              }
            }
            if (param0 == -9352) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              int discarded$2 = ((ep) this).d(-6);
              return 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("ep.AC(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param4 + 41);
        }
        return stackIn_7_0;
    }

    final void a(int param0, int param1) {
        if (param1 < 61) {
          ((ep) this).a(-85, 60, 47, false, -57, 25);
          ((ep) this).field_k = param0;
          return;
        } else {
          ((ep) this).field_k = param0;
          return;
        }
    }

    final void a(int param0, int param1, int param2, f[][] param3) {
        try {
            ((ep) this).field_j.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ep.UB(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          ((ep) this).field_j.a(param3, param4, false, param0, param5, param2);
          if (!param3) {
            stackOut_2_0 = ((ep) this).field_i;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 18;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var7 = stackIn_3_0;
        if (24 == param2) {
          if (param0 == 24) {
            if (var7 > 1) {
              bb.field_y[var7 / 2].c(param5, param4 + -param0, f.field_g[((ep) this).field_k]);
              var8 = ((24 - var7) * param2 + 23) / 24;
              var9 = (param0 * (-var7 + 24) - -23) / 24;
              if (var8 < param2) {
                if (param0 <= var9) {
                  v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[((ep) this).field_k]);
                  var8 = 32 % ((param1 - -70) / 33);
                  return;
                } else {
                  ((ep) this).field_j.a(-125, param3, param2 - var8, var8 + param5, param4 - -var9, param0 + -var9);
                  v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[((ep) this).field_k]);
                  var8 = 32 % ((param1 - -70) / 33);
                  return;
                }
              } else {
                v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[((ep) this).field_k]);
                var8 = 32 % ((param1 - -70) / 33);
                return;
              }
            } else {
              v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[((ep) this).field_k]);
              var8 = 32 % ((param1 - -70) / 33);
              return;
            }
          } else {
            if (var7 > 1) {
              bb.field_y[var7 / 2].b(param5, param4 - param0, 2 * param2, param0 * 3, f.field_g[((ep) this).field_k]);
              var8 = ((24 + -var7) * param2 - -23) / 24;
              var9 = (param0 * (24 + -var7) + 23) / 24;
              if (param2 > var8) {
                if (param0 <= var9) {
                  v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
                  var8 = 32 % ((param1 - -70) / 33);
                  return;
                } else {
                  ((ep) this).field_j.a(-128, param3, param2 - var8, param5 + var8, param4 - -var9, param0 + -var9);
                  v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
                  var8 = 32 % ((param1 - -70) / 33);
                  return;
                }
              } else {
                v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
                var8 = 32 % ((param1 - -70) / 33);
                return;
              }
            } else {
              v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
              var8 = 32 % ((param1 - -70) / 33);
              return;
            }
          }
        } else {
          if (var7 > 1) {
            bb.field_y[var7 / 2].b(param5, param4 - param0, 2 * param2, param0 * 3, f.field_g[((ep) this).field_k]);
            var8 = ((24 + -var7) * param2 - -23) / 24;
            var9 = (param0 * (24 + -var7) + 23) / 24;
            if (param2 > var8) {
              if (param0 <= var9) {
                v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
                var8 = 32 % ((param1 - -70) / 33);
                return;
              } else {
                ((ep) this).field_j.a(-128, param3, param2 - var8, param5 + var8, param4 - -var9, param0 + -var9);
                v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
                var8 = 32 % ((param1 - -70) / 33);
                return;
              }
            } else {
              v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
              var8 = 32 % ((param1 - -70) / 33);
              return;
            }
          } else {
            v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
            var8 = 32 % ((param1 - -70) / 33);
            return;
          }
        }
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj stackOut_2_0 = null;
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
              if (param0 == 23525) {
                break L1;
              } else {
                ((ep) this).a(-24, -83, 51, true, 50, -127);
                break L1;
              }
            }
            stackOut_2_0 = ng.a(qh.field_g, param1, (f) (Object) new ep((f) (Object) new kp(-1), ((ep) this).field_k), (byte) -83, rb.field_j);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ep.V(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final f a(int param0, int param1, f[][] param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        f stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param0 > 106) {
              L1: {
                if (((ep) this).field_i <= 0) {
                  break L1;
                } else {
                  ((ep) this).field_i = ((ep) this).field_i + 1;
                  if (24 == ((ep) this).field_i) {
                    stackOut_6_0 = ((ep) this).field_j;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_8_0 = this;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (f) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ep.EC(").append(param0).append(44).append(param1).append(44);
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
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        return (f) this;
    }

    ep(f param0, int param1) {
        ((ep) this).field_i = 0;
        try {
            ((ep) this).field_j = param0;
            ((ep) this).field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ep.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
    }
}

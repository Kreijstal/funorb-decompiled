/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jn extends fb {
    private vb field_O;
    static char[] field_M;
    private int field_N;
    static byte[] field_P;

    final void a(int param0, int param1, mf param2, int param3) {
        try {
            if (param1 >= -6) {
                String discarded$0 = ((jn) this).g(110);
            }
            ((jn) this).field_N = ((jn) this).field_N + 1;
            super.a(param0, -10, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "jn.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(double[] param0) {
        double var3_double = param0[0];
        double var5 = param0[1];
        double var7 = param0[2];
        double var9 = var3_double * var3_double + var5 * var5 + var7 * var7;
        if (Math.abs(-1.0 + var9) < 1e-16) {
            return;
        }
        try {
            var9 = Math.sqrt(var9);
            param0[0] = var3_double / var9;
            param0[1] = var5 / var9;
            param0[2] = var7 / var9;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "jn.A(" + (param0 != null ? "{...}" : "null") + ',' + 0 + ',' + 16801 + ')');
        }
    }

    final static rk a(String param0, int param1, String param2, um param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        rk stackIn_3_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        rk stackOut_2_0 = null;
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
        try {
          L0: {
            var4_int = param3.a(param2, 0);
            var5 = param3.a(param0, 7, var4_int);
            stackOut_2_0 = gi.a(var5, 3807, var4_int, param3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("jn.C(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(8221).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        mk var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        km var15 = null;
        km var16 = null;
        km var17 = null;
        km var18 = null;
        km var19 = null;
        km var20 = null;
        km var21 = null;
        km var22 = null;
        var11 = Chess.field_G;
        if (param2 >= -80) {
          ((jn) this).a(-42, 127, 34, -25);
          super.a(param0, param1, -109, param3);
          if (param1 != 0) {
            return;
          } else {
            var5 = (((jn) this).field_y >> 1) + param3 + ((jn) this).field_u;
            var6 = param0 - (-((jn) this).field_r + -(((jn) this).field_C >> 1));
            var8 = ((jn) this).field_O.a(21314);
            if (in.field_g == var8) {
              var20 = uh.field_p[0];
              var9 = var20.field_v << 1;
              var10 = var20.field_u << 1;
              if (null != ca.field_a) {
                if (ca.field_a.field_w >= var9) {
                  if (var10 <= ca.field_a.field_t) {
                    tl.a((byte) -67, ca.field_a);
                    wb.b();
                    var20.b(112, 144, var20.field_v << 4, var20.field_u << 4, -((jn) this).field_N << 10, 4096);
                    int discarded$11 = 28773;
                    fd.a();
                    ca.field_a.d(var5 - var20.field_v, var6 - var20.field_u, 256);
                    return;
                  } else {
                    ca.field_a = new km(var9, var10);
                    tl.a((byte) -67, ca.field_a);
                    var20.b(112, 144, var20.field_v << 4, var20.field_u << 4, -((jn) this).field_N << 10, 4096);
                    int discarded$12 = 28773;
                    fd.a();
                    ca.field_a.d(var5 - var20.field_v, var6 - var20.field_u, 256);
                    return;
                  }
                } else {
                  ca.field_a = new km(var9, var10);
                  tl.a((byte) -67, ca.field_a);
                  var20.b(112, 144, var20.field_v << 4, var20.field_u << 4, -((jn) this).field_N << 10, 4096);
                  int discarded$13 = 28773;
                  fd.a();
                  ca.field_a.d(var5 - var20.field_v, var6 - var20.field_u, 256);
                  return;
                }
              } else {
                ca.field_a = new km(var9, var10);
                tl.a((byte) -67, ca.field_a);
                var20.b(112, 144, var20.field_v << 4, var20.field_u << 4, -((jn) this).field_N << 10, 4096);
                int discarded$14 = 28773;
                fd.a();
                ca.field_a.d(var5 - var20.field_v, var6 - var20.field_u, 256);
                return;
              }
            } else {
              if (var8 != ek.field_d) {
                if (qk.field_b != var8) {
                  if (oa.field_a == var8) {
                    var21 = uh.field_p[1];
                    var21.d(-(var21.field_w >> 1) + var5, var6 - (var21.field_t >> 1), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var22 = uh.field_p[2];
                  var22.d(var5 + -(var22.field_w >> 1), -(var22.field_t >> 1) + var6, 256);
                  return;
                }
              } else {
                var19 = uh.field_p[0];
                var9 = var19.field_v << 1;
                var10 = var19.field_u << 1;
                if (null == ca.field_a) {
                  ca.field_a = new km(var9, var10);
                  tl.a((byte) -67, ca.field_a);
                  var19.b(112, 144, var19.field_v << 4, var19.field_u << 4, -((jn) this).field_N << 10, 4096);
                  int discarded$15 = 28773;
                  fd.a();
                  ca.field_a.d(var5 - var19.field_v, var6 - var19.field_u, 256);
                  return;
                } else {
                  L0: {
                    L1: {
                      if (ca.field_a.field_w < var9) {
                        break L1;
                      } else {
                        if (var10 > ca.field_a.field_t) {
                          break L1;
                        } else {
                          tl.a((byte) -67, ca.field_a);
                          wb.b();
                          break L0;
                        }
                      }
                    }
                    ca.field_a = new km(var9, var10);
                    tl.a((byte) -67, ca.field_a);
                    break L0;
                  }
                  var19.b(112, 144, var19.field_v << 4, var19.field_u << 4, -((jn) this).field_N << 10, 4096);
                  int discarded$16 = 28773;
                  fd.a();
                  ca.field_a.d(var5 - var19.field_v, var6 - var19.field_u, 256);
                  return;
                }
              }
            }
          }
        } else {
          super.a(param0, param1, -109, param3);
          if (param1 != 0) {
            return;
          } else {
            var5 = (((jn) this).field_y >> 1) + param3 + ((jn) this).field_u;
            var6 = param0 - (-((jn) this).field_r + -(((jn) this).field_C >> 1));
            var8 = ((jn) this).field_O.a(21314);
            if (in.field_g == var8) {
              var16 = uh.field_p[0];
              var9 = var16.field_v << 1;
              var10 = var16.field_u << 1;
              if (null != ca.field_a) {
                if (ca.field_a.field_w >= var9) {
                  if (var10 <= ca.field_a.field_t) {
                    tl.a((byte) -67, ca.field_a);
                    wb.b();
                    var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((jn) this).field_N << 10, 4096);
                    int discarded$17 = 28773;
                    fd.a();
                    ca.field_a.d(var5 - var16.field_v, var6 - var16.field_u, 256);
                    return;
                  } else {
                    ca.field_a = new km(var9, var10);
                    tl.a((byte) -67, ca.field_a);
                    var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((jn) this).field_N << 10, 4096);
                    int discarded$18 = 28773;
                    fd.a();
                    ca.field_a.d(var5 - var16.field_v, var6 - var16.field_u, 256);
                    return;
                  }
                } else {
                  ca.field_a = new km(var9, var10);
                  tl.a((byte) -67, ca.field_a);
                  var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((jn) this).field_N << 10, 4096);
                  int discarded$19 = 28773;
                  fd.a();
                  ca.field_a.d(var5 - var16.field_v, var6 - var16.field_u, 256);
                  return;
                }
              } else {
                ca.field_a = new km(var9, var10);
                tl.a((byte) -67, ca.field_a);
                var16.b(112, 144, var16.field_v << 4, var16.field_u << 4, -((jn) this).field_N << 10, 4096);
                int discarded$20 = 28773;
                fd.a();
                ca.field_a.d(var5 - var16.field_v, var6 - var16.field_u, 256);
                return;
              }
            } else {
              if (var8 != ek.field_d) {
                if (qk.field_b != var8) {
                  if (oa.field_a != var8) {
                    return;
                  } else {
                    var17 = uh.field_p[1];
                    var17.d(-(var17.field_w >> 1) + var5, var6 - (var17.field_t >> 1), 256);
                    return;
                  }
                } else {
                  var18 = uh.field_p[2];
                  var18.d(var5 + -(var18.field_w >> 1), -(var18.field_t >> 1) + var6, 256);
                  return;
                }
              } else {
                L2: {
                  L3: {
                    var15 = uh.field_p[0];
                    var9 = var15.field_v << 1;
                    var10 = var15.field_u << 1;
                    if (null == ca.field_a) {
                      break L3;
                    } else {
                      if (ca.field_a.field_w < var9) {
                        break L3;
                      } else {
                        if (var10 > ca.field_a.field_t) {
                          break L3;
                        } else {
                          tl.a((byte) -67, ca.field_a);
                          wb.b();
                          break L2;
                        }
                      }
                    }
                  }
                  ca.field_a = new km(var9, var10);
                  tl.a((byte) -67, ca.field_a);
                  break L2;
                }
                var15.b(112, 144, var15.field_v << 4, var15.field_u << 4, -((jn) this).field_N << 10, 4096);
                int discarded$21 = 28773;
                fd.a();
                ca.field_a.d(var5 - var15.field_v, var6 - var15.field_u, 256);
                return;
              }
            }
          }
        }
    }

    final static void a(boolean param0, jk param1, String param2, int param3, int param4, int param5, int param6, long param7, byte param8, int param9, boolean param10, int param11, int param12, int param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                L1: {
                  tk.field_h = new nk(5000);
                  qn.field_U = new nk(5000);
                  qh.field_a = param4;
                  cm.field_u = param6;
                  ub.field_e = param3;
                  gb.field_s = param13;
                  fn.field_b = param12;
                  am.field_d = param2;
                  re.field_n = param1;
                  if (!param10) {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  } else {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    break L1;
                  }
                }
                L2: {
                  on.field_a = stackIn_3_0 != 0;
                  qc.field_a = param7;
                  if (!param0) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  ln.field_Kb = stackIn_6_0 != 0;
                  bk.field_n = param11;
                  if (null == re.field_n.field_d) {
                    break L3;
                  } else {
                    {
                      L4: {
                        tc.field_z = new lc(re.field_n.field_d, 64, 0);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var15_ref;
                stackOut_11_1 = new StringBuilder().append("jn.H(").append(param0).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param1 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L5;
                }
              }
              L6: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
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
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L6;
                }
              }
              throw fk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ',' + param4 + ',' + 5000 + ',' + param6 + ',' + param7 + ',' + -121 + ',' + 5000 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, mf param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            if (param0 == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_P = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("jn.D(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final String g(int param0) {
        if (!(!((jn) this).field_w)) {
            return ((jn) this).field_O.a(false);
        }
        if (param0 == 0) {
            return null;
        }
        return null;
    }

    jn(vb param0) {
        try {
            ((jn) this).field_O = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "jn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a() {
        return of.a(bh.i(81), (byte) 95);
    }

    public static void e() {
        field_P = null;
        field_M = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
    }
}

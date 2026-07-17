/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends ue {
    static String field_G;
    private ed field_M;
    static ed field_I;
    private int field_O;
    static int field_H;
    private el field_N;
    static String field_J;
    private String field_L;
    static byte[] field_K;

    lf(el param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (db) (Object) gl.c(true));
        try {
            ((lf) this).field_L = param1;
            ((lf) this).field_N = param0;
            ((lf) this).a(param4, param3, param2, true, param5);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "lf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        String var5 = null;
        rf var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var17 = null;
        Object var18 = null;
        ed var19 = null;
        ed var20 = null;
        ed var21 = null;
        ed var22 = null;
        Object var23 = null;
        ed var24 = null;
        ed var25 = null;
        ed var26 = null;
        ed var27 = null;
        ao var28 = null;
        ao var29 = null;
        var18 = null;
        var23 = null;
        var13 = EscapeVector.field_A;
        var6 = ((lf) this).field_N.a(17124);
        if (of.field_f != var6) {
          L0: {
            L1: {
              L2: {
                if (ug.field_c != var6) {
                  var5 = ((lf) this).field_N.b(44);
                  if (var5 == null) {
                    var5 = ((lf) this).field_L;
                    break L2;
                  } else {
                    if (!var5.equals((Object) (Object) ((lf) this).field_l)) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                } else {
                  var5 = fj.field_bb;
                  break L2;
                }
              }
              if (!var5.equals((Object) (Object) ((lf) this).field_l)) {
                break L1;
              } else {
                break L0;
              }
            }
            ((lf) this).field_l = var5;
            ((lf) this).k(0);
            break L0;
          }
          super.a(param0, (byte) 109, param2, param3);
          var6 = ((lf) this).field_N.a(17124);
          var29 = (ao) (Object) ((lf) this).field_s;
          var9 = param3 - -((lf) this).field_k;
          var10 = var29.a((hm) this, param0, -16956) - -(var29.b((hm) this, 90).c(0) >> 1);
          if (param1 > 85) {
            if (of.field_f == var6) {
              var25 = ul.field_E[0];
              var11 = var25.field_A << 1;
              var12 = var25.field_z << 1;
              if (((lf) this).field_M != null) {
                if (var11 <= ((lf) this).field_M.field_s) {
                  if (var12 <= ((lf) this).field_M.field_x) {
                    eo.a(((lf) this).field_M, (byte) -7);
                    em.d();
                    var25.b(112, 144, var25.field_A << 4, var25.field_z << 4, -((lf) this).field_O << 10, 4096);
                    dl.a((byte) 120);
                    ((lf) this).field_M.c(-(var25.field_A >> 1) + var9, -var25.field_z + var10, 256);
                    return;
                  } else {
                    ((lf) this).field_M = new ed(var11, var12);
                    eo.a(((lf) this).field_M, (byte) -84);
                    var25.b(112, 144, var25.field_A << 4, var25.field_z << 4, -((lf) this).field_O << 10, 4096);
                    dl.a((byte) 120);
                    ((lf) this).field_M.c(-(var25.field_A >> 1) + var9, -var25.field_z + var10, 256);
                    return;
                  }
                } else {
                  ((lf) this).field_M = new ed(var11, var12);
                  eo.a(((lf) this).field_M, (byte) -84);
                  var25.b(112, 144, var25.field_A << 4, var25.field_z << 4, -((lf) this).field_O << 10, 4096);
                  dl.a((byte) 120);
                  ((lf) this).field_M.c(-(var25.field_A >> 1) + var9, -var25.field_z + var10, 256);
                  return;
                }
              } else {
                ((lf) this).field_M = new ed(var11, var12);
                eo.a(((lf) this).field_M, (byte) -84);
                var25.b(112, 144, var25.field_A << 4, var25.field_z << 4, -((lf) this).field_O << 10, 4096);
                dl.a((byte) 120);
                ((lf) this).field_M.c(-(var25.field_A >> 1) + var9, -var25.field_z + var10, 256);
                return;
              }
            } else {
              if (var6 != ug.field_c) {
                if (ob.field_a != var6) {
                  if (df.field_h == var6) {
                    var26 = ul.field_E[1];
                    var26.c(var9, -(var26.field_x >> 1) + var10, 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var27 = ul.field_E[2];
                  var27.c(var9, -(var27.field_x >> 1) + var10, 256);
                  return;
                }
              } else {
                var24 = ul.field_E[0];
                var11 = var24.field_A << 1;
                var12 = var24.field_z << 1;
                if (((lf) this).field_M == null) {
                  ((lf) this).field_M = new ed(var11, var12);
                  eo.a(((lf) this).field_M, (byte) -84);
                  var24.b(112, 144, var24.field_A << 4, var24.field_z << 4, -((lf) this).field_O << 10, 4096);
                  dl.a((byte) 120);
                  ((lf) this).field_M.c(-(var24.field_A >> 1) + var9, -var24.field_z + var10, 256);
                  return;
                } else {
                  L3: {
                    L4: {
                      if (var11 > ((lf) this).field_M.field_s) {
                        break L4;
                      } else {
                        if (var12 > ((lf) this).field_M.field_x) {
                          break L4;
                        } else {
                          eo.a(((lf) this).field_M, (byte) -7);
                          em.d();
                          break L3;
                        }
                      }
                    }
                    ((lf) this).field_M = new ed(var11, var12);
                    eo.a(((lf) this).field_M, (byte) -84);
                    break L3;
                  }
                  var24.b(112, 144, var24.field_A << 4, var24.field_z << 4, -((lf) this).field_O << 10, 4096);
                  dl.a((byte) 120);
                  ((lf) this).field_M.c(-(var24.field_A >> 1) + var9, -var24.field_z + var10, 256);
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          L5: {
            var17 = fj.field_bb;
            if (!var17.equals((Object) (Object) ((lf) this).field_l)) {
              ((lf) this).field_l = var17;
              ((lf) this).k(0);
              break L5;
            } else {
              break L5;
            }
          }
          super.a(param0, (byte) 109, param2, param3);
          var6 = ((lf) this).field_N.a(17124);
          var28 = (ao) (Object) ((lf) this).field_s;
          var9 = param3 - -((lf) this).field_k;
          var10 = var28.a((hm) this, param0, -16956) - -(var28.b((hm) this, 90).c(0) >> 1);
          if (param1 > 85) {
            if (of.field_f == var6) {
              var20 = ul.field_E[0];
              var11 = var20.field_A << 1;
              var12 = var20.field_z << 1;
              if (((lf) this).field_M != null) {
                if (var11 <= ((lf) this).field_M.field_s) {
                  if (var12 <= ((lf) this).field_M.field_x) {
                    eo.a(((lf) this).field_M, (byte) -7);
                    em.d();
                    var20.b(112, 144, var20.field_A << 4, var20.field_z << 4, -((lf) this).field_O << 10, 4096);
                    dl.a((byte) 120);
                    ((lf) this).field_M.c(-(var20.field_A >> 1) + var9, -var20.field_z + var10, 256);
                    return;
                  } else {
                    ((lf) this).field_M = new ed(var11, var12);
                    eo.a(((lf) this).field_M, (byte) -84);
                    var20.b(112, 144, var20.field_A << 4, var20.field_z << 4, -((lf) this).field_O << 10, 4096);
                    dl.a((byte) 120);
                    ((lf) this).field_M.c(-(var20.field_A >> 1) + var9, -var20.field_z + var10, 256);
                    return;
                  }
                } else {
                  ((lf) this).field_M = new ed(var11, var12);
                  eo.a(((lf) this).field_M, (byte) -84);
                  var20.b(112, 144, var20.field_A << 4, var20.field_z << 4, -((lf) this).field_O << 10, 4096);
                  dl.a((byte) 120);
                  ((lf) this).field_M.c(-(var20.field_A >> 1) + var9, -var20.field_z + var10, 256);
                  return;
                }
              } else {
                ((lf) this).field_M = new ed(var11, var12);
                eo.a(((lf) this).field_M, (byte) -84);
                var20.b(112, 144, var20.field_A << 4, var20.field_z << 4, -((lf) this).field_O << 10, 4096);
                dl.a((byte) 120);
                ((lf) this).field_M.c(-(var20.field_A >> 1) + var9, -var20.field_z + var10, 256);
                return;
              }
            } else {
              if (var6 != ug.field_c) {
                if (ob.field_a != var6) {
                  if (df.field_h != var6) {
                    return;
                  } else {
                    var21 = ul.field_E[1];
                    var21.c(var9, -(var21.field_x >> 1) + var10, 256);
                    return;
                  }
                } else {
                  var22 = ul.field_E[2];
                  var22.c(var9, -(var22.field_x >> 1) + var10, 256);
                  return;
                }
              } else {
                L6: {
                  L7: {
                    var19 = ul.field_E[0];
                    var11 = var19.field_A << 1;
                    var12 = var19.field_z << 1;
                    if (((lf) this).field_M == null) {
                      break L7;
                    } else {
                      if (var11 > ((lf) this).field_M.field_s) {
                        break L7;
                      } else {
                        if (var12 > ((lf) this).field_M.field_x) {
                          break L7;
                        } else {
                          eo.a(((lf) this).field_M, (byte) -7);
                          em.d();
                          break L6;
                        }
                      }
                    }
                  }
                  ((lf) this).field_M = new ed(var11, var12);
                  eo.a(((lf) this).field_M, (byte) -84);
                  break L6;
                }
                var19.b(112, 144, var19.field_A << 4, var19.field_z << 4, -((lf) this).field_O << 10, 4096);
                dl.a((byte) 120);
                ((lf) this).field_M.c(-(var19.field_A >> 1) + var9, -var19.field_z + var10, 256);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, hm param3) {
        if (param0 != -14472) {
            return;
        }
        try {
            ((lf) this).field_O = ((lf) this).field_O + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "lf.Q(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
              param2 = ca.a(-1, '_', param2, "");
              var3 = na.a(param0, false);
              if (param1 == 37) {
                break L1;
              } else {
                field_J = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param2.indexOf(param0) != -1) {
                  break L3;
                } else {
                  if (-1 == param2.indexOf(var3)) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("lf.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    public static void a(byte param0) {
        field_J = null;
        field_K = null;
        int var1 = 0;
        field_I = null;
        field_G = null;
    }

    final String d(int param0) {
        if (param0 == 1) {
            return null;
        }
        return null;
    }

    final boolean a(int param0, hm param1) {
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
            if (param0 == -4659) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_I = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("lf.M(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Player Name: ";
        field_G = "Play the game without logging in just yet";
        field_H = 1;
    }
}

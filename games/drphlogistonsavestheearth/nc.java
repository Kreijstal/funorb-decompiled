/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nc extends hf {
    static nh field_M;
    static boolean[][] field_J;
    static ac field_O;
    private static String field_N;
    static int[] field_L;
    static he[] field_I;
    static nh field_K;

    private nc(String param0, cg param1, fd param2) {
        super(param0, param1, param2);
        try {
            ((nc) this).field_l = ja.field_Q.field_h;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "nc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((nc) this).field_A = !((nc) this).field_A ? true : false;
        super.a(param0, param1, param2, param3);
    }

    private nc(String param0, fd param1) {
        this(param0, ja.field_Q.field_b, param1);
        try {
            ((nc) this).field_l = ja.field_Q.field_h;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "nc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    nc(String param0, fd param1, boolean param2) {
        this(param0, param1);
        try {
            ((nc) this).field_A = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "nc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void a(byte param0, lh param1) {
        try {
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            ClassNotFoundException var7 = null;
            InvalidClassException var7_ref = null;
            StreamCorruptedException var7_ref2 = null;
            OptionalDataException var7_ref3 = null;
            IllegalAccessException var7_ref4 = null;
            IllegalArgumentException var7_ref5 = null;
            java.lang.reflect.InvocationTargetException var7_ref6 = null;
            SecurityException var7_ref7 = null;
            IOException var7_ref8 = null;
            NullPointerException var7_ref9 = null;
            Exception var7_ref10 = null;
            Throwable var7_ref11 = null;
            int var7_int = 0;
            int var9 = 0;
            Object[] var10 = null;
            int var11_int = 0;
            Object var11 = null;
            ObjectInputStream var12 = null;
            int var13 = 0;
            lc var14 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            lc var17 = null;
            java.lang.reflect.Field var18 = null;
            Object var19 = null;
            Object var20 = null;
            Object var22 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            RuntimeException stackIn_63_0 = null;
            StringBuilder stackIn_63_1 = null;
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            String stackIn_65_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_62_0 = null;
            StringBuilder stackOut_62_1 = null;
            RuntimeException stackOut_64_0 = null;
            StringBuilder stackOut_64_1 = null;
            String stackOut_64_2 = null;
            RuntimeException stackOut_63_0 = null;
            StringBuilder stackOut_63_1 = null;
            String stackOut_63_2 = null;
            var16 = null;
            var19 = null;
            var20 = null;
            var22 = null;
            var23 = null;
            var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              L0: {
                var14 = (lc) (Object) g.field_t.h(-11151);
                var17 = var14;
                if (var17 != null) {
                  var4 = 36;
                  var3 = 0;
                  var5 = 0;
                  L1: while (true) {
                    if (var17.field_r <= var5) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var5 = param1.field_j;
                        param1.a(var17.field_l, (byte) 121);
                        var6 = 0;
                        L2: while (true) {
                          if (~var17.field_r >= ~var6) {
                            int discarded$1 = param1.d(var5, (byte) -57);
                            var17.a(-16175);
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_p[var6] != 0) {
                                param1.c(var17.field_p[var6], (byte) -125);
                                break L3;
                              } else {
                                try {
                                  L4: {
                                    L5: {
                                      var7_int = var17.field_j[var6];
                                      if (var7_int == 0) {
                                        var28 = (java.lang.reflect.Field) var17.field_n[var6].field_g;
                                        var9 = var28.getInt((Object) null);
                                        param1.c(0, (byte) -122);
                                        param1.a(var9, (byte) 115);
                                        break L5;
                                      } else {
                                        if (var7_int != 1) {
                                          if (var7_int != 2) {
                                            break L5;
                                          } else {
                                            var27 = (java.lang.reflect.Field) var17.field_n[var6].field_g;
                                            var9 = var27.getModifiers();
                                            param1.c(0, (byte) -87);
                                            param1.a(var9, (byte) 115);
                                            break L5;
                                          }
                                        } else {
                                          var16_ref = (java.lang.reflect.Field) var17.field_n[var6].field_g;
                                          var18 = var16_ref;
                                          var18.setInt((Object) null, var17.field_w[var6]);
                                          param1.c(0, (byte) -118);
                                          break L5;
                                        }
                                      }
                                    }
                                    L6: {
                                      if (var7_int != 3) {
                                        L7: {
                                          if (var7_int != 4) {
                                            break L7;
                                          } else {
                                            var30 = (java.lang.reflect.Method) var17.field_o[var6].field_g;
                                            var9 = var30.getModifiers();
                                            param1.c(0, (byte) -122);
                                            param1.a(var9, (byte) -23);
                                            break L7;
                                          }
                                        }
                                        break L6;
                                      } else {
                                        var29 = (java.lang.reflect.Method) var17.field_o[var6].field_g;
                                        var26 = var17.field_t[var6];
                                        var10 = new Object[var26.length];
                                        var11_int = 0;
                                        L8: while (true) {
                                          if (var26.length <= var11_int) {
                                            var11 = var29.invoke((Object) null, var10);
                                            if (var11 != null) {
                                              if (var11 instanceof Number) {
                                                param1.c(1, (byte) -116);
                                                param1.a(((Number) var11).longValue(), (byte) 122);
                                                break L6;
                                              } else {
                                                if (!(var11 instanceof String)) {
                                                  param1.c(4, (byte) -114);
                                                  break L6;
                                                } else {
                                                  param1.c(2, (byte) -121);
                                                  param1.a((String) var11, -1);
                                                  break L6;
                                                }
                                              }
                                            } else {
                                              param1.c(0, (byte) -110);
                                              break L6;
                                            }
                                          } else {
                                            var12 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var11_int]));
                                            var10[var11_int] = var12.readObject();
                                            var11_int++;
                                            continue L8;
                                          }
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L13: {
                                    var7_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.c(-14, (byte) -109);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var7_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.c(-15, (byte) -128);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var7_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.c(-16, (byte) -102);
                                    break L15;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var7_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.c(-18, (byte) -82);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var7_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.c(-19, (byte) -84);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var7_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.c(-20, (byte) -107);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var7_ref11 = decompiledCaughtException;
                                    param1.c(-21, (byte) -98);
                                    break L20;
                                  }
                                }
                                break L3;
                              }
                            }
                            var6++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      L21: {
                        if (var14.field_n[var5] == null) {
                          break L21;
                        } else {
                          L22: {
                            if (var14.field_n[var5].field_b != 2) {
                              break L22;
                            } else {
                              var14.field_p[var5] = -5;
                              break L22;
                            }
                          }
                          if (var14.field_n[var5].field_b == 0) {
                            var3 = 1;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                      }
                      L23: {
                        if (null == var14.field_o[var5]) {
                          break L23;
                        } else {
                          L24: {
                            if (var14.field_o[var5].field_b == 2) {
                              var14.field_p[var5] = -6;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          if (var14.field_o[var5].field_b == 0) {
                            var3 = 1;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L25: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_62_0 = (RuntimeException) var2;
                stackOut_62_1 = new StringBuilder().append("nc.B(").append(-95).append(44);
                stackIn_64_0 = stackOut_62_0;
                stackIn_64_1 = stackOut_62_1;
                stackIn_63_0 = stackOut_62_0;
                stackIn_63_1 = stackOut_62_1;
                if (param1 == null) {
                  stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
                  stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
                  stackOut_64_2 = "null";
                  stackIn_65_0 = stackOut_64_0;
                  stackIn_65_1 = stackOut_64_1;
                  stackIn_65_2 = stackOut_64_2;
                  break L25;
                } else {
                  stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
                  stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
                  stackOut_63_2 = "{...}";
                  stackIn_65_0 = stackOut_63_0;
                  stackIn_65_1 = stackOut_63_1;
                  stackIn_65_2 = stackOut_63_2;
                  break L25;
                }
              }
              throw ie.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static vi a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        vi stackIn_3_0 = null;
        vi stackIn_6_0 = null;
        vi stackIn_16_0 = null;
        vi stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        vi stackOut_15_0 = null;
        vi stackOut_19_0 = null;
        vi stackOut_5_0 = null;
        vi stackOut_2_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int != 0) {
            if (var2_int <= 63) {
              var3 = 0;
              L0: while (true) {
                if (~var3 > ~var2_int) {
                  L1: {
                    var4 = param0.charAt(var3);
                    if (45 == var4) {
                      L2: {
                        if (0 == var3) {
                          break L2;
                        } else {
                          if (-1 + var2_int == var3) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_15_0 = dh.field_H;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      if (-1 == field_N.indexOf(var4)) {
                        stackOut_19_0 = dh.field_H;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              stackOut_5_0 = ej.field_f;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          } else {
            stackOut_2_0 = qj.field_e;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("nc.C(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + -33 + 41);
        }
    }

    final static void a(String param0, boolean param1, byte param2) {
        oi.field_c = true;
        if (param2 <= 71) {
            return;
        }
        try {
            hl.field_b = param1;
            ol.field_a = new ma(ng.field_c, wi.field_e, param0, sg.field_a, hl.field_b);
            ng.field_c.a((byte) -110, (vg) (Object) ol.field_a);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "nc.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void a() {
        field_J = null;
        field_N = null;
        field_K = null;
        field_L = null;
        field_I = null;
        field_M = null;
        field_O = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_L = new int[]{68, 39, 33, 23, 28, 0, 0, 0, 0, 0, 0, 127, 0, 69, 62, 60, 65, 128, 130, 25, 25, 25, 65, 36, 52, 59, 25, 58, 25, 58, 25, 0, 0, 0, 0, 68, 0, 0, 39, 33, 16, 0, 0, 0, 0, 0, 0, 42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 25, 25, 25, 65, 36, 52, 59, 25, 58, 25, 58, 25};
        field_J = new boolean[][]{new boolean[4], new boolean[4], new boolean[4], new boolean[4], new boolean[4], new boolean[4], new boolean[4], new boolean[4], new boolean[4]};
    }
}

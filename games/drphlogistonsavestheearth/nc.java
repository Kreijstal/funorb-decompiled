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
            this.field_l = ja.field_Q.field_h;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "nc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_A = !this.field_A ? true : false;
        super.a(param0, param1, param2, param3);
    }

    private nc(String param0, fd param1) {
        this(param0, ja.field_Q.field_b, param1);
        try {
            this.field_l = ja.field_Q.field_h;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "nc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    nc(String param0, fd param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_A = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "nc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, lh param1) {
        try {
            int discarded$1 = 0;
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
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            String stackIn_66_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_63_0 = null;
            StringBuilder stackOut_63_1 = null;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            String stackOut_65_2 = null;
            RuntimeException stackOut_64_0 = null;
            StringBuilder stackOut_64_1 = null;
            String stackOut_64_2 = null;
            var16 = null;
            var19 = null;
            var20 = null;
            var22 = null;
            var23 = null;
            var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              L0: {
                var14 = (lc) ((Object) g.field_t.h(-11151));
                var17 = var14;
                if (var17 != null) {
                  var4 = 108 / ((11 - param0) / 33);
                  var3 = 0;
                  var5 = 0;
                  L1: while (true) {
                    if (var17.field_r <= var5) {
                      if (var3 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var5 = param1.field_j;
                        param1.a(var17.field_l, (byte) 121);
                        var6 = 0;
                        L2: while (true) {
                          if (var17.field_r <= var6) {
                            discarded$1 = param1.d(var5, (byte) -57);
                            var17.a(-16175);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L3: {
                              if (-1 != (var17.field_p[var6] ^ -1)) {
                                param1.c(var17.field_p[var6], (byte) -125);
                                break L3;
                              } else {
                                try {
                                  L4: {
                                    L5: {
                                      var7_int = var17.field_j[var6];
                                      if (var7_int == 0) {
                                        var28 = (java.lang.reflect.Field) (var17.field_n[var6].field_g);
                                        var9 = var28.getInt((Object) null);
                                        param1.c(0, (byte) -122);
                                        param1.a(var9, (byte) 115);
                                        break L5;
                                      } else {
                                        if (var7_int != 1) {
                                          if ((var7_int ^ -1) != -3) {
                                            break L5;
                                          } else {
                                            var27 = (java.lang.reflect.Field) (var17.field_n[var6].field_g);
                                            var9 = var27.getModifiers();
                                            param1.c(0, (byte) -87);
                                            param1.a(var9, (byte) 115);
                                            break L5;
                                          }
                                        } else {
                                          var16_ref = (java.lang.reflect.Field) (var17.field_n[var6].field_g);
                                          var18 = var16_ref;
                                          var18.setInt((Object) null, var17.field_w[var6]);
                                          param1.c(0, (byte) -118);
                                          break L5;
                                        }
                                      }
                                    }
                                    L6: {
                                      if (var7_int != 3) {
                                        if (var7_int != 4) {
                                          break L6;
                                        } else {
                                          var30 = (java.lang.reflect.Method) (var17.field_o[var6].field_g);
                                          var9 = var30.getModifiers();
                                          param1.c(0, (byte) -122);
                                          param1.a(var9, (byte) -23);
                                          break L6;
                                        }
                                      } else {
                                        var29 = (java.lang.reflect.Method) (var17.field_o[var6].field_g);
                                        var26 = var17.field_t[var6];
                                        var10 = new Object[var26.length];
                                        var11_int = 0;
                                        L7: while (true) {
                                          if (var26.length <= var11_int) {
                                            var11 = var29.invoke((Object) null, var10);
                                            if (var11 != null) {
                                              if (var11 instanceof Number) {
                                                param1.c(1, (byte) -116);
                                                param1.a(((Number) (var11)).longValue(), (byte) 122);
                                                break L6;
                                              } else {
                                                if (!(var11 instanceof String)) {
                                                  param1.c(4, (byte) -114);
                                                  break L6;
                                                } else {
                                                  param1.c(2, (byte) -121);
                                                  param1.a((String) (var11), -1);
                                                  break L6;
                                                }
                                              }
                                            } else {
                                              param1.c(0, (byte) -110);
                                              break L6;
                                            }
                                          } else {
                                            var12 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var26[var11_int])));
                                            var10[var11_int] = var12.readObject();
                                            var11_int++;
                                            continue L7;
                                          }
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L8: {
                                    var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                    param1.c(-10, (byte) -105);
                                    break L8;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L9: {
                                    var7_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param1.c(-11, (byte) -108);
                                    break L9;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var7_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param1.c(-12, (byte) -113);
                                    break L10;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L11: {
                                    var7_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param1.c(-13, (byte) -126);
                                    break L11;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L12: {
                                    var7_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.c(-14, (byte) -109);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var7_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.c(-15, (byte) -128);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var7_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.c(-16, (byte) -102);
                                    break L14;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L15: {
                                    var7_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param1.c(-17, (byte) -109);
                                    break L15;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var7_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.c(-18, (byte) -82);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var7_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.c(-19, (byte) -84);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var7_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.c(-20, (byte) -107);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var7_ref11 = decompiledCaughtException;
                                    param1.c(-21, (byte) -98);
                                    break L19;
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
                      L20: {
                        if (var14.field_n[var5] == null) {
                          break L20;
                        } else {
                          L21: {
                            if (var14.field_n[var5].field_b != 2) {
                              break L21;
                            } else {
                              var14.field_p[var5] = -5;
                              break L21;
                            }
                          }
                          if (var14.field_n[var5].field_b == 0) {
                            var3 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                      }
                      if (null != var14.field_o[var5]) {
                        L22: {
                          if ((var14.field_o[var5].field_b ^ -1) == -3) {
                            var14.field_p[var5] = -6;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        L23: {
                          if (-1 == (var14.field_o[var5].field_b ^ -1)) {
                            var3 = 1;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        var5++;
                        continue L1;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_63_0 = (RuntimeException) (var2);
                stackOut_63_1 = new StringBuilder().append("nc.B(").append(param0).append(',');
                stackIn_65_0 = stackOut_63_0;
                stackIn_65_1 = stackOut_63_1;
                stackIn_64_0 = stackOut_63_0;
                stackIn_64_1 = stackOut_63_1;
                if (param1 == null) {
                  stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
                  stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
                  stackOut_65_2 = "null";
                  stackIn_66_0 = stackOut_65_0;
                  stackIn_66_1 = stackOut_65_1;
                  stackIn_66_2 = stackOut_65_2;
                  break L24;
                } else {
                  stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
                  stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
                  stackOut_64_2 = "{...}";
                  stackIn_66_0 = stackOut_64_0;
                  stackIn_66_1 = stackOut_64_1;
                  stackIn_66_2 = stackOut_64_2;
                  break L24;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static vi a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        vi stackIn_5_0 = null;
        vi stackIn_8_0 = null;
        vi stackIn_18_0 = null;
        vi stackIn_22_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vi stackOut_17_0 = null;
        vi stackOut_21_0 = null;
        vi stackOut_7_0 = null;
        vi stackOut_4_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (param1 == -33) {
                break L1;
              } else {
                field_L = (int[]) null;
                break L1;
              }
            }
            if (-1 != (var2_int ^ -1)) {
              if (-64 <= (var2_int ^ -1)) {
                var3 = 0;
                L2: while (true) {
                  if (var3 < var2_int) {
                    L3: {
                      var4 = param0.charAt(var3);
                      if (45 == var4) {
                        L4: {
                          if (0 == var3) {
                            break L4;
                          } else {
                            if (-1 + var2_int == var3) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackOut_17_0 = dh.field_H;
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if (-1 == field_N.indexOf(var4)) {
                          stackOut_21_0 = dh.field_H;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3++;
                    continue L2;
                  } else {
                    return null;
                  }
                }
              } else {
                stackOut_7_0 = ej.field_f;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_4_0 = qj.field_e;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("nc.C(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              return stackIn_22_0;
            }
          }
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
            ng.field_c.a((byte) -110, (vg) (ol.field_a));
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "nc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_J = (boolean[][]) null;
        field_N = null;
        field_K = null;
        if (param0 < 31) {
            return;
        }
        field_L = null;
        field_I = null;
        field_M = null;
        field_O = null;
    }

    static {
        field_N = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_L = new int[]{68, 39, 33, 23, 28, 0, 0, 0, 0, 0, 0, 127, 0, 69, 62, 60, 65, 128, 130, 25, 25, 25, 65, 36, 52, 59, 25, 58, 25, 58, 25, 0, 0, 0, 0, 68, 0, 0, 39, 33, 16, 0, 0, 0, 0, 0, 0, 42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 25, 25, 25, 65, 36, 52, 59, 25, 58, 25, 58, 25};
        field_J = new boolean[][]{new boolean[]{true, true, true, false}, new boolean[]{true, true, true, false}, new boolean[]{true, true, true, false}, new boolean[]{true, false, true, true}, new boolean[]{true, false, true, true}, new boolean[]{true, false, true, true}, new boolean[]{true, true, true, true}, new boolean[]{true, true, true, true}, new boolean[]{true, true, true, true}};
    }
}

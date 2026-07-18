/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dk {
    static int field_a;
    static String field_b;
    static int[] field_c;

    final static int[] a(int param0, int param1, boolean param2) {
        int var3 = lm.a(param0, (byte) -125);
        int var4 = mf.a(param0, -128);
        int var5 = lm.a(param1, (byte) -118);
        int var6 = mf.a(param1, -19);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static void a(byte param0) {
        il.a(4, 0);
        int var1 = -68;
    }

    final static void a(int param0) {
        bg.a(false);
        int var1 = -84;
        vh.field_j = true;
        ca.field_b = true;
        bm.field_d.n(7920);
        vd.a(false, -536866817, hi.field_f);
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
    }

    final static void a(byte param0, se param1) {
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
            ud var14 = null;
            Object var16 = null;
            Object var17 = null;
            java.lang.reflect.Field var17_ref = null;
            ud var18 = null;
            Object var19 = null;
            java.lang.reflect.Field var20 = null;
            Object var21 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            String stackIn_70_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            String stackOut_69_2 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            var19 = null;
            var17 = null;
            var16 = null;
            var21 = null;
            var23 = null;
            var13 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                var14 = (ud) (Object) ab.field_h.b((byte) 114);
                var18 = var14;
                if (var18 == null) {
                  return;
                } else {
                  var3 = 0;
                  var4 = 0;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var18.field_o) {
                      if (var4 != 0) {
                        return;
                      } else {
                        var5 = param1.field_i;
                        param1.b(var18.field_k, -1);
                        var6 = 0;
                        L2: while (true) {
                          if (var6 >= var18.field_o) {
                            int discarded$1 = param1.e(-18951, var5);
                            var18.b(57);
                            break L0;
                          } else {
                            L3: {
                              if (var18.field_m[var6] != 0) {
                                param1.a(var18.field_m[var6], -17);
                                break L3;
                              } else {
                                try {
                                  L4: {
                                    L5: {
                                      var7_int = var18.field_l[var6];
                                      if (var7_int != 0) {
                                        if (var7_int != 1) {
                                          if (2 != var7_int) {
                                            break L5;
                                          } else {
                                            var28 = (java.lang.reflect.Field) var18.field_h[var6].field_g;
                                            var9 = var28.getModifiers();
                                            param1.a(0, -48);
                                            param1.b(var9, -1);
                                            break L5;
                                          }
                                        } else {
                                          var17_ref = (java.lang.reflect.Field) var18.field_h[var6].field_g;
                                          var20 = var17_ref;
                                          var20.setInt((Object) null, var18.field_n[var6]);
                                          param1.a(0, -36);
                                          break L5;
                                        }
                                      } else {
                                        var27 = (java.lang.reflect.Field) var18.field_h[var6].field_g;
                                        var9 = var27.getInt((Object) null);
                                        param1.a(0, -127);
                                        param1.b(var9, -1);
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var7_int == 3) {
                                        var30 = (java.lang.reflect.Method) var18.field_i[var6].field_g;
                                        var26 = var18.field_g[var6];
                                        var10 = new Object[var26.length];
                                        var11_int = 0;
                                        L7: while (true) {
                                          if (var26.length <= var11_int) {
                                            var11 = var30.invoke((Object) null, var10);
                                            if (var11 != null) {
                                              if (!(var11 instanceof Number)) {
                                                if (!(var11 instanceof String)) {
                                                  param1.a(4, -48);
                                                  break L6;
                                                } else {
                                                  param1.a(2, -26);
                                                  param1.a((String) var11, -6528);
                                                  break L6;
                                                }
                                              } else {
                                                param1.a(1, -62);
                                                param1.a(((Number) var11).longValue(), -16943);
                                                break L6;
                                              }
                                            } else {
                                              param1.a(0, -76);
                                              break L6;
                                            }
                                          } else {
                                            var12 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var11_int]));
                                            var10[var11_int] = var12.readObject();
                                            var11_int++;
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        if (var7_int == 4) {
                                          var29 = (java.lang.reflect.Method) var18.field_i[var6].field_g;
                                          var9 = var29.getModifiers();
                                          param1.a(0, -120);
                                          param1.b(var9, -1);
                                          break L6;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L12: {
                                    var7_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.a(-14, -99);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var7_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.a(-15, -86);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var7_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.a(-16, -73);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var7_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.a(-18, -96);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var7_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.a(-19, -7);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var7_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.a(-20, -108);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var7_ref11 = decompiledCaughtException;
                                    param1.a(-21, -71);
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
                        if (var14.field_h[var5] != null) {
                          L21: {
                            if (var14.field_h[var5].field_a == 2) {
                              var14.field_m[var5] = -5;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (var14.field_h[var5].field_a == 0) {
                            var4 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      }
                      L22: {
                        if (var14.field_i[var5] != null) {
                          L23: {
                            if (var14.field_i[var5].field_a == 2) {
                              var14.field_m[var5] = -6;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          if (0 == var14.field_i[var5].field_a) {
                            var4 = 1;
                            break L22;
                          } else {
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_67_0 = (RuntimeException) var2;
                stackOut_67_1 = new StringBuilder().append("dk.A(").append(15).append(',');
                stackIn_69_0 = stackOut_67_0;
                stackIn_69_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (param1 == null) {
                  stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                  stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
                  stackOut_69_2 = "null";
                  stackIn_70_0 = stackOut_69_0;
                  stackIn_70_1 = stackOut_69_1;
                  stackIn_70_2 = stackOut_69_2;
                  break L24;
                } else {
                  stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
                  stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
                  stackOut_68_2 = "{...}";
                  stackIn_70_0 = stackOut_68_0;
                  stackIn_70_1 = stackOut_68_1;
                  stackIn_70_2 = stackOut_68_2;
                  break L24;
                }
              }
              throw dd.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = tj.a(false, 0, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("dk.D(");
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
          throw dd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 5408 + ')');
        }
        return stackIn_1_0;
    }

    final static boolean a(int param0, ki param1, ki param2, ki param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (!param1.b(-1)) {
                break L1;
              } else {
                if (!param1.b((byte) 104, "commonui")) {
                  break L1;
                } else {
                  L2: {
                    if (!param3.b(-1)) {
                      break L2;
                    } else {
                      if (!param3.b((byte) 92, "commonui")) {
                        break L2;
                      } else {
                        if (!param2.b(-1)) {
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0 != 0;
                        } else {
                          if (param2.b((byte) -110, "button.gif")) {
                            stackOut_15_0 = 1;
                            stackIn_16_0 = stackOut_15_0;
                            break L0;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("dk.C(").append(1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          L4: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          L5: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "End Game";
    }
}

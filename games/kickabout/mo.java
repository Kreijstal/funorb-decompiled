/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class mo {
    private int field_c;
    int field_b;
    static String field_d;
    static String field_a;
    int field_e;

    private final void a(mo param0) {
        try {
            ((mo) this).field_e = param0.field_e;
            ((mo) this).field_b = param0.field_b;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "mo.VA(" + (param0 != null ? "{...}" : "null") + ',' + 0 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
    }

    final boolean a(int param0, mo param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (gk.field_e) {
                break L1;
              } else {
                if (((mo) this).field_c >= 64) {
                  break L1;
                } else {
                  L2: {
                    if (param1.field_b <= ((mo) this).field_b) {
                      break L2;
                    } else {
                      if (param3 != ((mo) this).field_e) {
                        break L2;
                      } else {
                        if (((mo) this).field_b < param2) {
                          ((mo) this).field_c = ((mo) this).field_c + 1;
                          stackOut_6_0 = 1;
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0 != 0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  if (param1.field_b >= ((mo) this).field_b) {
                    break L1;
                  } else {
                    if (param1.field_e != param3) {
                      break L1;
                    } else {
                      if (param2 > param1.field_b) {
                        ((mo) this).field_c = ((mo) this).field_c + 1;
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            ((mo) this).field_c = 0;
            if (param0 < -82) {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              return stackIn_16_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("mo.UA(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final void a(mo param0, boolean param1) {
        try {
            ((mo) this).a((byte) -105, param0);
            if (param1) {
                ((mo) this).field_c = -29;
            }
            int discarded$0 = 0;
            this.a(param0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "mo.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static ut b() {
        int var4_int = 0;
        int var5 = Kickabout.field_G;
        int var1 = ku.field_c[0] * lo.field_j[0];
        byte[] var2 = pq.field_O[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = lt.field_a[qj.b(255, (int) var2[var4_int])];
        }
        ut var4 = new ut(kw.field_i, ai.field_J, aq.field_f[0], fc.field_g[0], ku.field_c[0], lo.field_j[0], var3);
        tk.h((byte) -81);
        return var4;
    }

    void a(mo param0, byte param1) {
        try {
            ((mo) this).field_b = 0;
            if (param1 != 84) {
                Object var4 = null;
                ((mo) this).a((mo) null, (byte) 91);
            }
            ((mo) this).field_e = param0.field_e;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "mo.AB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(ml param0) {
        try {
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            InvalidClassException var6_ref = null;
            StreamCorruptedException var6_ref2 = null;
            OptionalDataException var6_ref3 = null;
            IllegalAccessException var6_ref4 = null;
            IllegalArgumentException var6_ref5 = null;
            java.lang.reflect.InvocationTargetException var6_ref6 = null;
            SecurityException var6_ref7 = null;
            IOException var6_ref8 = null;
            NullPointerException var6_ref9 = null;
            Exception var6_ref10 = null;
            Throwable var6_ref11 = null;
            int var6_int = 0;
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            si var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            si var17 = null;
            Object var18 = null;
            Object var19 = null;
            java.lang.reflect.Field var20 = null;
            Object var22 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            RuntimeException stackIn_60_0 = null;
            StringBuilder stackIn_60_1 = null;
            RuntimeException stackIn_61_0 = null;
            StringBuilder stackIn_61_1 = null;
            RuntimeException stackIn_62_0 = null;
            StringBuilder stackIn_62_1 = null;
            String stackIn_62_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_59_0 = null;
            StringBuilder stackOut_59_1 = null;
            RuntimeException stackOut_61_0 = null;
            StringBuilder stackOut_61_1 = null;
            String stackOut_61_2 = null;
            RuntimeException stackOut_60_0 = null;
            StringBuilder stackOut_60_1 = null;
            String stackOut_60_2 = null;
            var18 = null;
            var19 = null;
            var16 = null;
            var22 = null;
            var23 = null;
            var12 = Kickabout.field_G;
            try {
              L0: {
                var13 = (si) (Object) nv.field_N.g(24009);
                var17 = var13;
                if (var17 == null) {
                  return;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= var17.field_n) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var4 = param0.field_n;
                        param0.b(-82, var17.field_p);
                        var5 = 0;
                        L2: while (true) {
                          if (var5 >= var17.field_n) {
                            int discarded$1 = param0.a(var4, false);
                            var17.c((byte) -109);
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_m[var5] != 0) {
                                param0.a(109, var17.field_m[var5]);
                                break L3;
                              } else {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var17.field_h[var5];
                                      if (0 != var6_int) {
                                        if (var6_int == 1) {
                                          var16_ref = (java.lang.reflect.Field) var17.field_f[var5].field_b;
                                          var20 = var16_ref;
                                          var20.setInt((Object) null, var17.field_o[var5]);
                                          param0.a(113, 0);
                                          break L5;
                                        } else {
                                          if (var6_int != 2) {
                                            break L5;
                                          } else {
                                            var28 = (java.lang.reflect.Field) var17.field_f[var5].field_b;
                                            var8 = var28.getModifiers();
                                            param0.a(118, 0);
                                            param0.b(-120, var8);
                                            break L5;
                                          }
                                        }
                                      } else {
                                        var27 = (java.lang.reflect.Field) var17.field_f[var5].field_b;
                                        var8 = var27.getInt((Object) null);
                                        param0.a(114, 0);
                                        param0.b(-110, var8);
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var6_int != 3) {
                                        if (var6_int != 4) {
                                          break L6;
                                        } else {
                                          var30 = (java.lang.reflect.Method) var17.field_e[var5].field_b;
                                          var8 = var30.getModifiers();
                                          param0.a(115, 0);
                                          param0.b(-114, var8);
                                          break L6;
                                        }
                                      } else {
                                        var29 = (java.lang.reflect.Method) var17.field_e[var5].field_b;
                                        var26 = var17.field_l[var5];
                                        var9 = new Object[var26.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var10_int >= var26.length) {
                                            var10 = var29.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (var10 instanceof Number) {
                                                param0.a(110, 1);
                                                param0.a(((Number) var10).longValue(), -1781890008);
                                                break L6;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param0.a(109, 4);
                                                  break L6;
                                                } else {
                                                  param0.a(102, 2);
                                                  param0.a(14190, (String) var10);
                                                  break L6;
                                                }
                                              }
                                            } else {
                                              param0.a(106, 0);
                                              break L6;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L7;
                                          }
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L12: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.a(127, -14);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.a(120, -15);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.a(109, -16);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.a(111, -18);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.a(105, -19);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.a(106, -20);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.a(106, -21);
                                    break L19;
                                  }
                                }
                                break L3;
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      L20: {
                        if (var13.field_f[var4] != null) {
                          L21: {
                            if (var13.field_f[var4].field_a == 2) {
                              var13.field_m[var4] = -5;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (var13.field_f[var4].field_a != 0) {
                            break L20;
                          } else {
                            var3 = 1;
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      }
                      L22: {
                        if (var13.field_e[var4] == null) {
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      var4++;
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L23: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_59_0 = (RuntimeException) var2;
                stackOut_59_1 = new StringBuilder().append("mo.BB(");
                stackIn_61_0 = stackOut_59_0;
                stackIn_61_1 = stackOut_59_1;
                stackIn_60_0 = stackOut_59_0;
                stackIn_60_1 = stackOut_59_1;
                if (param0 == null) {
                  stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
                  stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
                  stackOut_61_2 = "null";
                  stackIn_62_0 = stackOut_61_0;
                  stackIn_62_1 = stackOut_61_1;
                  stackIn_62_2 = stackOut_61_2;
                  break L23;
                } else {
                  stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
                  stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
                  stackOut_60_2 = "{...}";
                  stackIn_62_0 = stackOut_60_0;
                  stackIn_62_1 = stackOut_60_1;
                  stackIn_62_2 = stackOut_60_2;
                  break L23;
                }
              }
              throw nb.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + ',' + 0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(byte param0, mo param1);

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var9 = Kickabout.field_G;
        try {
          if (param1 != null) {
            var2_int = param0;
            var3 = param1.length();
            L0: while (true) {
              L1: {
                if (var2_int >= var3) {
                  break L1;
                } else {
                  if (!ca.a(false, param1.charAt(var2_int))) {
                    break L1;
                  } else {
                    var2_int++;
                    continue L0;
                  }
                }
              }
              L2: while (true) {
                L3: {
                  if (var2_int >= var3) {
                    break L3;
                  } else {
                    if (!ca.a(false, param1.charAt(-1 + var3))) {
                      break L3;
                    } else {
                      var3--;
                      continue L2;
                    }
                  }
                }
                var4 = -var2_int + var3;
                if (var4 >= 1) {
                  if (var4 <= 12) {
                    var5 = new StringBuilder(var4);
                    var6 = var2_int;
                    L4: while (true) {
                      if (var6 >= var3) {
                        if (var5.length() != 0) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      } else {
                        L5: {
                          var7 = param1.charAt(var6);
                          int discarded$2 = 121;
                          if (!ws.a((char) var7)) {
                            break L5;
                          } else {
                            var8 = vf.a((byte) -67, (char) var7);
                            if (var8 == 0) {
                              break L5;
                            } else {
                              StringBuilder discarded$3 = var5.append((char) var8);
                              break L5;
                            }
                          }
                        }
                        var6++;
                        continue L4;
                      }
                    }
                  } else {
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    return (String) (Object) stackIn_16_0;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var2;
            stackOut_27_1 = new StringBuilder().append("mo.QA(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
    }

    void a(mo param0, int param1, int param2, int param3) {
        if (param3 <= 38) {
            ((mo) this).field_e = -23;
        }
        if (((mo) this).a(-86, param0, param2, param1)) {
            return;
        }
        try {
            ((mo) this).a(param0, false);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "mo.LA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(ml param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 4) {
                break L1;
              } else {
                var4 = null;
                ((mo) this).a((byte) 17, (mo) null);
                break L1;
              }
            }
            L2: {
              ((mo) this).field_b = -hq.a(22531, 6, param0, 0) + 64;
              int discarded$6 = -39;
              if (!mu.a(param0)) {
                break L2;
              } else {
                ((mo) this).field_e = param0.l(4, param1 + 55) - 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("mo.RA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    mo() {
        ((mo) this).field_e = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Month";
        field_a = "in the Quarter-Finals";
    }
}

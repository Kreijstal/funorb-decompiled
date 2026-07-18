/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class hd extends un {
    private qp field_z;
    private String field_v;
    static ao field_r;
    private boolean field_y;
    static ao field_w;
    static String field_t;
    static cj field_x;
    static fe field_s;
    static int field_q;
    static int field_u;

    hd(pm param0, pm param1) {
        super(param0);
        ((hd) this).field_v = "";
        ((hd) this).field_y = false;
        try {
            ((hd) this).field_z = new qp(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final re a(boolean param0, String param1) {
        uc var3 = null;
        RuntimeException var3_ref = null;
        re stackIn_2_0 = null;
        re stackIn_7_0 = null;
        re stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        re stackOut_6_0 = null;
        re stackOut_11_0 = null;
        re stackOut_10_0 = null;
        re stackOut_1_0 = null;
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
            if (((hd) this).field_z.a(param0, param1) != jq.field_b) {
              L1: {
                if (param1.equals((Object) (Object) ((hd) this).field_v)) {
                  break L1;
                } else {
                  var3 = ga.a(param1, false);
                  if (!var3.d(-99)) {
                    stackOut_6_0 = ua.field_I;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  } else {
                    ((hd) this).field_v = param1;
                    ((hd) this).field_y = var3.b(18307);
                    break L1;
                  }
                }
              }
              L2: {
                if (!((hd) this).field_y) {
                  stackOut_11_0 = jq.field_b;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = db.field_b;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = jq.field_b;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("hd.F(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_10_0 = null;
        String stackOut_8_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (((hd) this).field_z.a(false, param0) == jq.field_b) {
              stackOut_2_0 = ((hd) this).field_z.a(param0, -1276425040);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1 == -1276425040) {
                if (((hd) this).a(false, param0) != jq.field_b) {
                  stackOut_10_0 = gi.field_h;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = eg.field_z;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (String) (Object) stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("hd.C(");
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
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    final static boolean a(int param0, char param1) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            L2: {
              if (param1 < 65) {
                break L2;
              } else {
                if (param1 <= 90) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1 < 97) {
                break L3;
              } else {
                if (param1 > 122) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(java.math.BigInteger param0, byte param1, java.math.BigInteger param2, k param3, k param4) {
        try {
            qi.a(0, true, param0, param3.field_j, param2, param3.field_m, param4);
            int var5_int = 19 % ((-76 - param1) / 44);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "hd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(int param0) {
        field_w = null;
        field_r = null;
        field_t = null;
        field_x = null;
        field_s = null;
    }

    final static void a(ga param0, int param1) {
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
            lp var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            lp var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            RuntimeException stackIn_62_0 = null;
            StringBuilder stackIn_62_1 = null;
            RuntimeException stackIn_63_0 = null;
            StringBuilder stackIn_63_1 = null;
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            String stackIn_64_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_61_0 = null;
            StringBuilder stackOut_61_1 = null;
            RuntimeException stackOut_63_0 = null;
            StringBuilder stackOut_63_1 = null;
            String stackOut_63_2 = null;
            RuntimeException stackOut_62_0 = null;
            StringBuilder stackOut_62_1 = null;
            String stackOut_62_2 = null;
            var18 = null;
            var16 = null;
            var21 = null;
            var22 = null;
            var12 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                var13 = (lp) (Object) we.field_k.c(76);
                var17 = var13;
                if (var17 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= var17.field_n) {
                      if (var3 == 0) {
                        var4 = param0.field_j;
                        param0.b(param1 ^ 34, var17.field_r);
                        var5 = param1;
                        L2: while (true) {
                          if (var5 >= var17.field_n) {
                            int discarded$1 = param0.f(var4, 117);
                            var17.a(true);
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_g[var5] != 0) {
                                param0.a(-99, var17.field_g[var5]);
                                break L3;
                              } else {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var17.field_i[var5];
                                      if (0 != var6_int) {
                                        if (var6_int != 1) {
                                          if (var6_int != 2) {
                                            break L5;
                                          } else {
                                            var15 = (java.lang.reflect.Field) var17.field_m[var5].field_d;
                                            var8 = var15.getModifiers();
                                            param0.a(118, 0);
                                            param0.b(-126, var8);
                                            break L5;
                                          }
                                        } else {
                                          var16_ref = (java.lang.reflect.Field) var17.field_m[var5].field_d;
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_q[var5]);
                                          param0.a(-32, 0);
                                          break L5;
                                        }
                                      } else {
                                        var26 = (java.lang.reflect.Field) var17.field_m[var5].field_d;
                                        var8 = var26.getInt((Object) null);
                                        param0.a(-95, 0);
                                        param0.b(-123, var8);
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var6_int != 3) {
                                        if (var6_int != 4) {
                                          break L6;
                                        } else {
                                          var28 = (java.lang.reflect.Method) var17.field_l[var5].field_d;
                                          var8 = var28.getModifiers();
                                          param0.a(125, 0);
                                          param0.b(-102, var8);
                                          break L6;
                                        }
                                      } else {
                                        var27 = (java.lang.reflect.Method) var17.field_l[var5].field_d;
                                        var25 = var17.field_o[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var10_int >= var25.length) {
                                            var10 = var27.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (var10 instanceof Number) {
                                                param0.a(116, 1);
                                                param0.a(((Number) var10).longValue(), true);
                                                break L6;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param0.a(-45, 4);
                                                  break L6;
                                                } else {
                                                  param0.a(113, 2);
                                                  param0.a((String) var10, (byte) 105);
                                                  break L6;
                                                }
                                              }
                                            } else {
                                              param0.a(param1 + 123, 0);
                                              break L6;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
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
                                    param0.a(-109, -14);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.a(125, -15);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.a(-27, -16);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.a(-38, -18);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.a(param1 ^ 115, -19);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.a(124, -20);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.a(-97, -21);
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
                      } else {
                        return;
                      }
                    } else {
                      L20: {
                        if (null == var13.field_m[var4]) {
                          break L20;
                        } else {
                          L21: {
                            if (2 != var13.field_m[var4].field_f) {
                              break L21;
                            } else {
                              var13.field_g[var4] = -5;
                              break L21;
                            }
                          }
                          if (var13.field_m[var4].field_f == 0) {
                            var3 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                      }
                      L22: {
                        if (null != var13.field_l[var4]) {
                          L23: {
                            if (2 != var13.field_l[var4].field_f) {
                              break L23;
                            } else {
                              var13.field_g[var4] = -6;
                              break L23;
                            }
                          }
                          if (var13.field_l[var4].field_f == 0) {
                            var3 = 1;
                            break L22;
                          } else {
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      }
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_61_0 = (RuntimeException) var2;
                stackOut_61_1 = new StringBuilder().append("hd.P(");
                stackIn_63_0 = stackOut_61_0;
                stackIn_63_1 = stackOut_61_1;
                stackIn_62_0 = stackOut_61_0;
                stackIn_62_1 = stackOut_61_1;
                if (param0 == null) {
                  stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
                  stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
                  stackOut_63_2 = "null";
                  stackIn_64_0 = stackOut_63_0;
                  stackIn_64_1 = stackOut_63_1;
                  stackIn_64_2 = stackOut_63_2;
                  break L24;
                } else {
                  stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
                  stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
                  stackOut_62_2 = "{...}";
                  stackIn_64_0 = stackOut_62_0;
                  stackIn_64_1 = stackOut_62_1;
                  stackIn_64_2 = stackOut_62_2;
                  break L24;
                }
              }
              throw fa.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, int param1) {
        if (!(gi.field_i == null)) {
            gi.field_i.c(param0, -1);
        }
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        String stackOut_10_0 = null;
        String stackOut_26_0 = null;
        String stackOut_22_0 = null;
        String stackOut_19_0 = null;
        String stackOut_16_0 = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (param0 == 3) {
              stackOut_2_0 = ga.field_q;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param0 == 6) {
                stackOut_6_0 = gm.field_ob;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param0 == 7) {
                  stackOut_10_0 = kb.field_w;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  if (param0 != 8) {
                    if (param0 != 9) {
                      if (param0 != 10) {
                        if (11 != param0) {
                          if (param0 == 14) {
                            stackOut_26_0 = vl.a(gl.field_K, new String[1], 2);
                            stackIn_27_0 = stackOut_26_0;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackOut_22_0 = ek.field_I;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      } else {
                        stackOut_19_0 = qi.field_b;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    } else {
                      stackOut_16_0 = la.field_b;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  } else {
                    stackOut_13_0 = fd.field_I;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("hd.B(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L1;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + -9 + ')');
        }
        return stackIn_27_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new ao(0, 2, 2, 1);
        field_w = new ao(13, 0, 1, 0);
        field_t = "Phantom";
        field_u = 75;
    }
}

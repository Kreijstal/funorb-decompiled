/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ed extends np {
    private pd field_T;
    static String field_R;
    private int field_S;
    static int field_P;
    private int[] field_B;
    private cn field_U;
    private int field_H;
    private cn field_Q;
    private int field_O;
    private int field_V;
    static String field_W;

    final static ab a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        ab var7 = null;
        int var8 = 0;
        ab stackIn_4_0 = null;
        ab stackIn_8_0 = null;
        ab stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        ab stackIn_19_0 = null;
        ab stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        ab stackOut_3_0 = null;
        ab stackOut_7_0 = null;
        ab stackOut_21_0 = null;
        ab stackOut_18_0 = null;
        Object stackOut_13_0 = null;
        ab stackOut_10_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = ri.field_e;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (var2_int > 255) {
                stackOut_7_0 = ta.field_d;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var3 = ih.a(86, '.', param1);
                if (var3.length >= 2) {
                  var4 = var3;
                  if (param0 < -3) {
                    var5 = 0;
                    L1: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_21_0 = id.a(-49, var3[-1 + var3.length]);
                        stackIn_22_0 = stackOut_21_0;
                        break L0;
                      } else {
                        var6 = var4[var5];
                        var7 = ip.a(0, var6);
                        if (var7 == null) {
                          var5++;
                          continue L1;
                        } else {
                          stackOut_18_0 = (ab) var7;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        }
                      }
                    }
                  } else {
                    stackOut_13_0 = null;
                    stackIn_14_0 = stackOut_13_0;
                    return (ab) (Object) stackIn_14_0;
                  }
                } else {
                  stackOut_10_0 = ri.field_e;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("ed.LA(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L2;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_22_0;
    }

    final void a(int param0, int param1, byte param2) {
        if (!(((ed) this).field_N)) {
            return;
        }
        ((ed) this).e(76);
        ((ed) this).field_U = fa.a(((ed) this).field_i + param1, (byte) 95, 7, param0 + ((ed) this).field_t, ((ed) this).field_q, ((ed) this).field_U);
        ((ed) this).field_Q = fa.a(((ed) this).field_i - (-param1 - ((ed) this).field_x) - 7, (byte) 119, 7, param0 + ((ed) this).field_t, ((ed) this).field_q, ((ed) this).field_Q);
        int var4 = 83 % ((param2 - 41) / 61);
        super.a(param0, param1, (byte) -87);
        if (!(!((ed) this).field_T.field_w)) {
            ((ed) this).field_T.a(param0, param1, (byte) 122);
        }
    }

    final void a(boolean param0, int param1, int param2) {
        ((ed) this).field_T.e(0, param1 - ((ed) this).field_q, 105);
        ((ed) this).field_T.a(param0, 8, -4 + param2);
        super.a(false, param1, param2);
    }

    private final void e() {
        ((ed) this).field_T = new pd(-8 + ((ed) this).field_t - -((ed) this).field_q, ((ed) this).field_i - -8, 5, ((ed) this).field_x + -16, 65536, 0);
        ((ed) this).field_S = 0;
    }

    private final int d() {
        int var5 = 0;
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        if (!(null != ((ed) this).field_J)) {
            return 0;
        }
        int var2 = 2147483647;
        int var3 = 0;
        rj var4 = (rj) (Object) ((ed) this).field_J.e(-24172);
        while (var4 != null) {
            var5 = -((ed) this).field_i + var4.field_i;
            var6 = -((ed) this).field_i + var4.field_x + var4.field_i;
            if (var5 < var2) {
                var2 = var5;
            }
            if (var3 < var6) {
                var3 = var6;
            }
            var4 = (rj) (Object) ((ed) this).field_J.a(4);
        }
        return -var2 + var3;
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        rj var5 = null;
        int var6 = 0;
        rj var7 = null;
        L0: {
          L1: {
            var6 = DungeonAssault.field_K;
            int discarded$1 = 1;
            var2 = this.d() - -15;
            if (((ed) this).field_S != ((ed) this).field_T.field_z) {
              break L1;
            } else {
              if (((ed) this).field_H != var2) {
                break L1;
              } else {
                if (((ed) this).field_V == ((ed) this).field_x) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L2: {
            var3 = var2 + -((ed) this).field_x;
            if (0 < var3) {
              L3: {
                ((ed) this).field_T.field_w = true;
                var4 = -(((ed) this).field_T.field_z * var3 / ((ed) this).field_T.field_C) + ((ed) this).field_O;
                if (((ed) this).field_J == null) {
                  break L3;
                } else {
                  var5 = (rj) (Object) ((ed) this).field_J.e(-24172);
                  L4: while (true) {
                    if (var5 == null) {
                      break L3;
                    } else {
                      var5.e(var4, 0, 101);
                      var5 = (rj) (Object) ((ed) this).field_J.a(4);
                      continue L4;
                    }
                  }
                }
              }
              ((ed) this).field_O = ((ed) this).field_O - var4;
              break L2;
            } else {
              L5: {
                ((ed) this).field_T.field_w = false;
                if (null != ((ed) this).field_J) {
                  var7 = (rj) (Object) ((ed) this).field_J.e(-24172);
                  L6: while (true) {
                    if (var7 == null) {
                      break L5;
                    } else {
                      var7.e(((ed) this).field_O, 0, 77);
                      var7 = (rj) (Object) ((ed) this).field_J.a(4);
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
              ((ed) this).field_O = 0;
              break L2;
            }
          }
          L7: {
            ((ed) this).field_S = ((ed) this).field_T.field_z;
            if (0 < var3) {
              L8: {
                var4 = ((ed) this).field_T.field_C * 32 / var3;
                if (((ed) this).field_T.field_D >= var4) {
                  break L8;
                } else {
                  ((ed) this).field_T.field_D = var4;
                  break L8;
                }
              }
              if (((ed) this).field_T.field_H >= var4 >> 1) {
                break L7;
              } else {
                ((ed) this).field_T.field_H = var4 >> 1;
                break L7;
              }
            } else {
              break L7;
            }
          }
          ((ed) this).field_V = ((ed) this).field_x;
          ((ed) this).field_H = var2;
          break L0;
        }
        L9: {
          if (param0 >= 32) {
            break L9;
          } else {
            ((ed) this).field_T = null;
            break L9;
          }
        }
    }

    final void e(int param0, int param1, int param2) {
        ((ed) this).field_T.e(param0, param1, 75);
        if (param2 <= 69) {
            return;
        }
        super.e(param0, param1, 121);
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        if (!((ed) this).field_N) {
          return;
        } else {
          L0: {
            ((ed) this).e(66);
            super.b(param0, param1, param2);
            if (((ed) this).field_T.field_w) {
              ((ed) this).field_T.b(param0, param1, param2);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var4 = param0 + ((ed) this).field_t;
            var5 = ((ed) this).field_i + param2;
            gf.a(((ed) this).field_B);
            if (((ed) this).field_U != null) {
              var6 = 0;
              L2: while (true) {
                if (var6 >= 7) {
                  break L1;
                } else {
                  gf.e(var4, var6 + var5, var4 + ((ed) this).field_q, var5 - (-var6 - 1));
                  ((ed) this).field_U.d(var4, var5, 32 * (-var6 + 7));
                  var6++;
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
          L3: {
            if (((ed) this).field_Q != null) {
              var6 = 0;
              L4: while (true) {
                if (var6 >= 7) {
                  break L3;
                } else {
                  gf.e(var4, var5 + ((ed) this).field_x + -7 + var6, ((ed) this).field_q + var4, -6 + (var5 - -((ed) this).field_x) + var6);
                  ((ed) this).field_Q.d(var4, var5 - -((ed) this).field_x - 7, (var6 - -1) * 32);
                  var6++;
                  continue L4;
                }
              }
            } else {
              break L3;
            }
          }
          gf.b(((ed) this).field_B);
          return;
        }
    }

    final void a(int param0, int param1) {
        ((ed) this).field_T.a(param0, param1);
    }

    final void a(rj param0, byte param1) {
        try {
            param0.e(10 + ((ed) this).field_O, 0, 79);
            if (param1 > -27) {
                Object var4 = null;
                ab discarded$0 = ed.a(-69, (String) null);
            }
            super.a(param0, (byte) -76);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ed.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void f() {
        field_W = null;
        int var1 = -100;
        field_R = null;
    }

    final static void a(String param0, int param1, int param2, int param3, String param4, int param5) {
        try {
            Object var7 = null;
            kn.a(param5, param0, param2, param1, 125, 96, (String) null, param4);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ed.S(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + 31353 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    final static boolean c(boolean param0) {
        if (!param0) {
            ed.a(96, 83, -11, (byte) -90, -63);
        }
        return tl.field_l;
    }

    final void c(int param0, int param1) {
        if (!(((ed) this).field_T.field_w)) {
            return;
        }
        int discarded$0 = 1;
        int var3 = this.d() + 20;
        int var4 = var3 + -((ed) this).field_x;
        if (param0 <= 23) {
            ((ed) this).field_B = null;
        }
        ((ed) this).field_T.field_z = ((ed) this).field_T.field_C * param1 / var4;
        ((ed) this).e(77);
    }

    final void e(boolean param0) {
        if (!param0) {
            return;
        }
        ((ed) this).field_T.field_z = 0;
        ((ed) this).e(95);
    }

    final static void a(boolean param0, wj param1) {
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
            oe var13 = null;
            java.lang.reflect.Field var15 = null;
            oe var16 = null;
            java.lang.reflect.Field var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Method var28 = null;
            java.lang.reflect.Method var29 = null;
            RuntimeException stackIn_59_0 = null;
            StringBuilder stackIn_59_1 = null;
            RuntimeException stackIn_60_0 = null;
            StringBuilder stackIn_60_1 = null;
            RuntimeException stackIn_61_0 = null;
            StringBuilder stackIn_61_1 = null;
            String stackIn_61_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_58_0 = null;
            StringBuilder stackOut_58_1 = null;
            RuntimeException stackOut_60_0 = null;
            StringBuilder stackOut_60_1 = null;
            String stackOut_60_2 = null;
            RuntimeException stackOut_59_0 = null;
            StringBuilder stackOut_59_1 = null;
            String stackOut_59_2 = null;
            var18 = null;
            var19 = null;
            var21 = null;
            var22 = null;
            var12 = DungeonAssault.field_K;
            try {
              L0: {
                var13 = (oe) (Object) fe.field_k.e(-24172);
                var16 = var13;
                if (var16 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= var16.field_q) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var4 = param1.field_o;
                        param1.a((byte) 63, var16.field_j);
                        var5 = 0;
                        L2: while (true) {
                          if (var16.field_q <= var5) {
                            int discarded$1 = param1.c((byte) -106, var4);
                            var16.a(false);
                            break L0;
                          } else {
                            L3: {
                              if (var16.field_r[var5] == 0) {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var16.field_n[var5];
                                      if (var6_int == 0) {
                                        var27 = (java.lang.reflect.Field) var16.field_s[var5].field_f;
                                        var8 = var27.getInt((Object) null);
                                        param1.a(6, 0);
                                        param1.a((byte) 63, var8);
                                        break L5;
                                      } else {
                                        if (1 != var6_int) {
                                          if (var6_int == 2) {
                                            var26 = (java.lang.reflect.Field) var16.field_s[var5].field_f;
                                            var8 = var26.getModifiers();
                                            param1.a(6, 0);
                                            param1.a((byte) 63, var8);
                                            break L5;
                                          } else {
                                            break L5;
                                          }
                                        } else {
                                          var15 = (java.lang.reflect.Field) var16.field_s[var5].field_f;
                                          var17 = var15;
                                          var17.setInt((Object) null, var16.field_l[var5]);
                                          param1.a(6, 0);
                                          break L5;
                                        }
                                      }
                                    }
                                    L6: {
                                      if (var6_int != 3) {
                                        if (var6_int != 4) {
                                          break L6;
                                        } else {
                                          var29 = (java.lang.reflect.Method) var16.field_o[var5].field_f;
                                          var8 = var29.getModifiers();
                                          param1.a(6, 0);
                                          param1.a((byte) 63, var8);
                                          break L6;
                                        }
                                      } else {
                                        var28 = (java.lang.reflect.Method) var16.field_o[var5].field_f;
                                        var25 = var16.field_k[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var10_int >= var25.length) {
                                            var10 = var28.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param1.a(6, 0);
                                              break L6;
                                            } else {
                                              if (var10 instanceof Number) {
                                                param1.a(6, 1);
                                                param1.a(63, ((Number) var10).longValue());
                                                break L6;
                                              } else {
                                                if (var10 instanceof String) {
                                                  param1.a(6, 2);
                                                  param1.b((String) var10, (byte) -20);
                                                  break L6;
                                                } else {
                                                  param1.a(6, 4);
                                                  break L6;
                                                }
                                              }
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
                                    param1.a(6, -14);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.a(6, -15);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.a(6, -16);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.a(6, -18);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.a(6, -19);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.a(6, -20);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.a(6, -21);
                                    break L19;
                                  }
                                }
                                break L3;
                              } else {
                                param1.a(6, var16.field_r[var5]);
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
                        if (null == var13.field_s[var4]) {
                          break L20;
                        } else {
                          L21: {
                            if (var13.field_s[var4].field_c == 2) {
                              var13.field_r[var4] = -5;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (var13.field_s[var4].field_c == 0) {
                            var3 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                      }
                      L22: {
                        if (null == var13.field_o[var4]) {
                          break L22;
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
              L23: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_58_0 = (RuntimeException) var2;
                stackOut_58_1 = new StringBuilder().append("ed.H(").append(0).append(44);
                stackIn_60_0 = stackOut_58_0;
                stackIn_60_1 = stackOut_58_1;
                stackIn_59_0 = stackOut_58_0;
                stackIn_59_1 = stackOut_58_1;
                if (param1 == null) {
                  stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
                  stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
                  stackOut_60_2 = "null";
                  stackIn_61_0 = stackOut_60_0;
                  stackIn_61_1 = stackOut_60_1;
                  stackIn_61_2 = stackOut_60_2;
                  break L23;
                } else {
                  stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
                  stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
                  stackOut_59_2 = "{...}";
                  stackIn_61_0 = stackOut_59_0;
                  stackIn_61_1 = stackOut_59_1;
                  stackIn_61_2 = stackOut_59_2;
                  break L23;
                }
              }
              throw vk.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        cn var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var5 = gm.field_d.field_L[param2].field_a;
        if (param3 >= -67) {
            field_P = -4;
        }
        if (!(null == qj.field_c[param2])) {
            var5 = qj.field_c[param2].field_a;
        }
        if (!(gh.field_i[var5].field_g != 2)) {
            var6 = jb.a((byte) -70, var5);
            if (!(var6 == null)) {
                var7 = var6.field_E * 5 >> 3;
                var8 = 5 * var6.field_G >> 3;
                var6.b(param1 - -(-var7 + 48 >> 1), -var8 + (40 + param0), var7, var8, param4);
            }
        }
        dm.field_a[var5].e(param1, param0 + 1, param4);
    }

    final rj a(int param0, int param1, int param2) {
        rj var4 = null;
        if (param0 > -10) {
            ((ed) this).e(-111, 75, 17);
        }
        if (((ed) this).field_w) {
            if (!(!((ed) this).field_T.field_w)) {
                var4 = ((ed) this).field_T.a(-19, param1, param2);
                if (var4 != null) {
                    return var4;
                }
            }
        }
        return super.a(-65, param1, param2);
    }

    ed(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        ((ed) this).field_B = new int[4];
        int discarded$0 = -40;
        this.e();
    }

    final void b(byte param0) {
        ((ed) this).field_T.b(param0);
        super.b((byte) 30);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Any raider setting foot inside this room will quickly be swarmed by a cloud of bloodsucking bats.<br><br>Defeated raiders permanently lose 1 <%attack> and 1 <%defence>. (If <%defence> reduced to 0, the raider dies)";
        field_P = 240;
        field_W = "This game has been updated! Please reload this page.";
    }
}

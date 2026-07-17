/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class nf extends rh {
    static int field_M;
    private int field_J;
    static bg field_F;
    static int field_N;
    static String field_E;
    private int field_G;
    private int field_L;
    private int field_K;
    private int field_I;
    private int field_H;

    final static void a(int param0, hb param1) {
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
            i var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            i var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            RuntimeException stackIn_61_0 = null;
            StringBuilder stackIn_61_1 = null;
            RuntimeException stackIn_62_0 = null;
            StringBuilder stackIn_62_1 = null;
            RuntimeException stackIn_63_0 = null;
            StringBuilder stackIn_63_1 = null;
            String stackIn_63_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_60_0 = null;
            StringBuilder stackOut_60_1 = null;
            RuntimeException stackOut_62_0 = null;
            StringBuilder stackOut_62_1 = null;
            String stackOut_62_2 = null;
            RuntimeException stackOut_61_0 = null;
            StringBuilder stackOut_61_1 = null;
            String stackOut_61_2 = null;
            var18 = null;
            var16 = null;
            var20 = null;
            var22 = null;
            var12 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                var13 = (i) (Object) ua.field_v.a((byte) -117);
                var17 = var13;
                if (var17 == null) {
                  return;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var17.field_e <= var4) {
                      if (var3 == 0) {
                        L2: {
                          var4 = param1.field_h;
                          param1.a(-803539344, var17.field_l);
                          if (param0 <= -79) {
                            break L2;
                          } else {
                            nf.a(116, (byte) 63, -58, 12);
                            break L2;
                          }
                        }
                        var5 = 0;
                        L3: while (true) {
                          if (var17.field_e <= var5) {
                            int discarded$1 = param1.a((byte) -66, var4);
                            var17.c(-19822);
                            break L0;
                          } else {
                            L4: {
                              if (0 != var17.field_o[var5]) {
                                param1.b(var17.field_o[var5], -49152);
                                break L4;
                              } else {
                                try {
                                  L5: {
                                    L6: {
                                      var6_int = var17.field_q[var5];
                                      if (0 == var6_int) {
                                        var15 = (java.lang.reflect.Field) var17.field_k[var5].field_b;
                                        var8 = var15.getInt((Object) null);
                                        param1.b(0, -49152);
                                        param1.a(-803539344, var8);
                                        break L6;
                                      } else {
                                        if (var6_int == 1) {
                                          var16_ref = (java.lang.reflect.Field) var17.field_k[var5].field_b;
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_g[var5]);
                                          param1.b(0, -49152);
                                          break L6;
                                        } else {
                                          if (var6_int != 2) {
                                            break L6;
                                          } else {
                                            var26 = (java.lang.reflect.Field) var17.field_k[var5].field_b;
                                            var8 = var26.getModifiers();
                                            param1.b(0, -49152);
                                            param1.a(-803539344, var8);
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var6_int == 3) {
                                        var28 = (java.lang.reflect.Method) var17.field_s[var5].field_b;
                                        var25 = var17.field_f[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var10_int >= var25.length) {
                                            var10 = var28.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (var10 instanceof Number) {
                                                param1.b(1, -49152);
                                                param1.a(((Number) var10).longValue(), (byte) 84);
                                                break L7;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param1.b(4, -49152);
                                                  break L7;
                                                } else {
                                                  param1.b(2, -49152);
                                                  param1.a(-105, (String) var10);
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              param1.b(0, -49152);
                                              break L7;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        if (var6_int == 4) {
                                          var27 = (java.lang.reflect.Method) var17.field_s[var5].field_b;
                                          var8 = var27.getModifiers();
                                          param1.b(0, -49152);
                                          param1.a(-803539344, var8);
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    break L5;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L13: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.b(-14, -49152);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.b(-15, -49152);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.b(-16, -49152);
                                    break L15;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.b(-18, -49152);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.b(-19, -49152);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.b(-20, -49152);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.b(-21, -49152);
                                    break L20;
                                  }
                                }
                                break L4;
                              }
                            }
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      L21: {
                        if (null == var13.field_k[var4]) {
                          break L21;
                        } else {
                          L22: {
                            if (var13.field_k[var4].field_g == 2) {
                              var13.field_o[var4] = -5;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          if (0 != var13.field_k[var4].field_g) {
                            break L21;
                          } else {
                            var3 = 1;
                            break L21;
                          }
                        }
                      }
                      L23: {
                        if (var13.field_s[var4] == null) {
                          break L23;
                        } else {
                          break L23;
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
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_60_0 = (RuntimeException) var2;
                stackOut_60_1 = new StringBuilder().append("nf.GB(").append(param0).append(44);
                stackIn_62_0 = stackOut_60_0;
                stackIn_62_1 = stackOut_60_1;
                stackIn_61_0 = stackOut_60_0;
                stackIn_61_1 = stackOut_60_1;
                if (param1 == null) {
                  stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
                  stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
                  stackOut_62_2 = "null";
                  stackIn_63_0 = stackOut_62_0;
                  stackIn_63_1 = stackOut_62_1;
                  stackIn_63_2 = stackOut_62_2;
                  break L24;
                } else {
                  stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
                  stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
                  stackOut_61_2 = "{...}";
                  stackIn_63_0 = stackOut_61_0;
                  stackIn_63_1 = stackOut_61_1;
                  stackIn_63_2 = stackOut_61_2;
                  break L24;
                }
              }
              throw la.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void e(byte param0) {
        if (param0 != 10) {
            ((nf) this).a(false, -117, 77);
        }
    }

    nf(kj param0, int param1, int param2) {
        super(param0, param1, param2);
        ((nf) this).field_K = 0;
        ((nf) this).field_L = 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (!(param3 > 0)) {
            ((nf) this).a(param0, (byte) 124, param2);
            return;
        }
        ((nf) this).field_G = ((nf) this).field_l;
        ((nf) this).field_K = param3;
        ((nf) this).field_I = param0;
        ((nf) this).field_L = param1;
        ((nf) this).field_J = param2;
        ((nf) this).field_H = ((nf) this).field_p;
    }

    final static void n() {
        int var1 = pf.a((byte) 97, 3);
        cj.a((byte) 105, ke.field_h[28 + var1]);
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = 0;
            if (param0 < 0) {
              break L1;
            } else {
              if (65536 > param0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param0 = param0 >>> 16;
          var2 += 16;
          break L0;
        }
        L2: {
          if (param0 < 256) {
            break L2;
          } else {
            var2 += 8;
            param0 = param0 >>> 8;
            break L2;
          }
        }
        L3: {
          if (param0 >= 16) {
            param0 = param0 >>> 4;
            var2 += 4;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 < 4) {
            break L4;
          } else {
            param0 = param0 >>> 2;
            var2 += 2;
            break L4;
          }
        }
        L5: {
          if (param0 < 1) {
            break L5;
          } else {
            var2++;
            param0 = param0 >>> 1;
            break L5;
          }
        }
        return param0 + var2;
    }

    final static short[] a(boolean param0, hb param1, int param2, short[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_16_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_15_0 = null;
        Object stackOut_2_0 = null;
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
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param1.f(8, 16);
            if (0 != var4_int) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (param3.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param3 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param1.f(8, 4);
                var6 = (short)param1.f(8, 16);
                if (var5 > 0) {
                  var7 = 0;
                  L4: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param3[var7] = (short)(var6 + param1.f(8, var5));
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param3[var7] = (short)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (short[]) param3;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (short[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("nf.EA(").append(0).append(44);
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
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(16).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw la.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_16_0;
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        ve.a(74, param2, param3, ah.field_g[param0]);
        if (param1 != 115) {
            field_M = 40;
        }
    }

    void p(int param0) {
        if (param0 != -21) {
            nf.a(-27, (byte) -88, -52, -108);
        }
        if (((nf) this).field_K <= 0) {
            return;
        }
        ((nf) this).a(((nf) this).field_I, (byte) -109, ((nf) this).field_J);
        ((nf) this).field_K = 0;
        ((nf) this).e((byte) 10);
    }

    void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
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
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        ge.a(6 + param1, param2 - -35, ((nf) this).field_l + -12, -40 + ((nf) this).field_p, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        if (!param0) {
          var7 = 0;
          var8 = param2;
          L0: while (true) {
            if (var4 <= var7) {
              var4 = 22;
              var5 = 194;
              var6 = 169;
              var7 = 0;
              var8 = param2 - -35;
              L1: while (true) {
                if (var4 <= var7) {
                  af.field_e.c(((nf) this).field_l + param1 + -90, 10 + param2);
                  qb.a(param2 - -35, pe.field_a, (byte) -108, 5 + param1, ((nf) this).field_l - 10);
                  qb.a(-22 + param2 + ((nf) this).field_p, ra.field_Z, (byte) -109, param1, ((nf) this).field_l);
                  var6 = 127;
                  var5 = 169;
                  var4 = -79 + ((nf) this).field_p;
                  var7 = 0;
                  var8 = 57 + param2;
                  L2: while (true) {
                    if (var7 >= var4) {
                      return;
                    } else {
                      var9 = var5 + (var6 + -var5) * var7 / var4;
                      var9 = var9 | (var9 << 16 | var9 << 8);
                      ge.a(param1, var8, 6, var9);
                      ge.a(-6 + (((nf) this).field_l + param1), var8, 6, var9);
                      var7++;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  var9 = var7 * (-var5 + var6) / var4 + var5;
                  var9 = var9 | (var9 << 16 | var9 << 8);
                  ge.a(param1, var8, 6, var9);
                  ge.a(param1 - -((nf) this).field_l + -6, var8, 6, var9);
                  var8++;
                  var7++;
                  continue L1;
                }
              }
            } else {
              if (var8 >= ge.field_f) {
                if (ge.field_k > var8) {
                  L3: {
                    var9 = var5 + var7 * (-var5 + var6) / var4;
                    var10 = 0;
                    var11 = ((nf) this).field_l;
                    if (var7 <= 20) {
                      L4: while (true) {
                        if (var10 > 20) {
                          break L3;
                        } else {
                          var12 = (20 + -var7) * (-var7 + 20) + (-var10 + 20) * (-var10 + 20);
                          if (var12 <= 462) {
                            if (var12 < 420) {
                              break L3;
                            } else {
                              var13 = (462 + -var12) * var9 / 42;
                              var13 = var13 | (var13 << 16 | var13 << 8);
                              ge.field_i[var10 + var8 * ge.field_h + param1] = var13;
                              var10++;
                              continue L4;
                            }
                          } else {
                            var10++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if (var7 > 20) {
                      break L5;
                    } else {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L6: while (true) {
                        L7: {
                          if (var13 > 20) {
                            break L7;
                          } else {
                            var14 = (-var7 + 20) * (20 - var7) + var13 * var13;
                            if (var14 > 462) {
                              break L7;
                            } else {
                              if (420 <= var14) {
                                var15 = var9 * (462 + -var14) / 42;
                                var15 = var15 | (var15 << 16 | var15 << 8);
                                ge.field_i[var11 + ge.field_h * var8 + param1] = var15;
                                var11++;
                                var13++;
                                continue L6;
                              } else {
                                var12 = var11 - -1;
                                var11++;
                                var13++;
                                continue L6;
                              }
                            }
                          }
                        }
                        var11 = var12;
                        break L5;
                      }
                    }
                  }
                  var9 = var9 | (var9 << 16 | var9 << 8);
                  ge.a(param1 + var10, var8, var11 + -var10, var9);
                  var8++;
                  var7++;
                  continue L0;
                } else {
                  var8++;
                  var7++;
                  continue L0;
                }
              } else {
                var8++;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    boolean b(boolean param0) {
        ((nf) this).p(-21);
        return super.b(false);
    }

    public static void o() {
        field_F = null;
        field_E = null;
    }

    boolean k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (((nf) this).field_K <= 0) {
        } else {
            var2 = ((nf) this).field_J;
            var3 = ((nf) this).field_I;
            int fieldTemp$0 = ((nf) this).field_L + 1;
            ((nf) this).field_L = ((nf) this).field_L + 1;
            if (((nf) this).field_K <= fieldTemp$0) {
                ((nf) this).field_K = 0;
                ((nf) this).e((byte) 10);
            } else {
                var4 = (((nf) this).field_K * 2 + -((nf) this).field_L) * ((nf) this).field_L;
                var5 = ((nf) this).field_K * ((nf) this).field_K;
                var3 = var4 * (-((nf) this).field_H + ((nf) this).field_I) / var5 + ((nf) this).field_H;
                var2 = ((nf) this).field_G + var4 * (-((nf) this).field_G + ((nf) this).field_J) / var5;
            }
            ((nf) this).a(var3, (byte) 115, var2);
        }
        return super.k(-23913);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = 0;
        field_E = "Back";
    }
}

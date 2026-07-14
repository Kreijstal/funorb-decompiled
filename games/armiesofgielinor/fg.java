/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fg extends tc {
    static String field_l;
    int field_q;
    static String field_k;
    int[] field_t;
    static String field_m;
    int field_o;
    int field_r;
    int field_p;
    int field_s;
    int field_u;
    static String field_n;

    public static void a(int param0) {
        field_l = null;
        field_k = null;
        field_n = null;
        field_m = null;
        if (param0 != -22856) {
            field_m = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ca var10 = null;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          var7 = param1 + ks.field_y * param0;
          if (param1 > -1) {
            break L0;
          } else {
            if (param0 < 0) {
              break L0;
            } else {
              if (param1 >= ks.field_y) {
                break L0;
              } else {
                if (ef.field_c <= param0) {
                  break L0;
                } else {
                  L1: {
                    if (param4 > 64) {
                      break L1;
                    } else {
                      field_l = null;
                      break L1;
                    }
                  }
                  L2: {
                    var8 = a.a(16711680, param0, var7, param1);
                    var9 = -((var8 & -14033988) >>> 1780867096) + 255;
                    var8 = var8 & 16777215;
                    if (!param6) {
                      if (param2 != 0) {
                        if ((param2 ^ -1) != -2) {
                          if ((param2 ^ -1) != -3) {
                            rv.a(false, param3, param5, var7);
                            break L2;
                          } else {
                            L3: {
                              po.a((byte) -7, param0, param3, param5, var9, var8, var7, param1);
                              sf.b(param0, param1, 0, param5, var7, param3);
                              tc.a(62, param1, param0, 19 + param3, var7, 39 + param5);
                              cw.a(var7, 19 + param3, param5 + 39, -118, param1, param0);
                              em.a(var9, false, param0, param3, var7, 0, param1, param5, var8);
                              var10 = vs.field_e[var7].field_n;
                              if (var10 == null) {
                                break L3;
                              } else {
                                if (-1 != (var10.field_c & 1 ^ -1)) {
                                  if (-1 >= vs.field_e[var7].field_a) {
                                    break L3;
                                  } else {
                                    L4: {
                                      var11 = vs.field_e[var7].field_a;
                                      if (null == bv.field_w) {
                                        break L4;
                                      } else {
                                        var11 = bv.field_w.o(var11, -1);
                                        break L4;
                                      }
                                    }
                                    eu.a(22 + param5, var11, var7 - -ug.field_b, 119, param3 + 20);
                                    break L3;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            fs.a(param3, false, false, var9, param5, var7, param1, var8, param0);
                            if (vs.field_e[var7].e((byte) -115)) {
                              oj.a(param3 + 20, true, ug.field_b + var7, vs.field_e[var7].field_a, 22 + param5);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          L5: {
                            if (cu.field_a) {
                              break L5;
                            } else {
                              mq.a(param5, var8, var7, param1, param3, var9, 54, param0);
                              break L5;
                            }
                          }
                          pk.a(param3, param0, param1, var7, var8, -29403, var9, param5);
                          if (jd.field_L) {
                            oh.field_I.g(param5, param3);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        mq.a(param5, var8, var7, param1, param3, var9, 101, param0);
                        break L2;
                      }
                    } else {
                      if (-3 == (param2 ^ -1)) {
                        em.a(var9, true, param0, param3, var7, 0, param1, param5, var8);
                        fs.a(param3, false, true, var9, param5, var7, param1, var8, param0);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        }
        L6: {
          if (-3 != param2) {
            break L6;
          } else {
            gb.a(param0, param1, param5, param3, (byte) 49);
            break L6;
          }
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (ck.field_c != null) {
            for (var1 = 0; -17 < (var1 ^ -1); var1++) {
                ck.field_c[var1] = null;
            }
        }
        var1 = -93 / ((28 - param0) / 54);
        ql.field_j = null;
        System.gc();
    }

    final static mq a(int param0, je param1, int[] param2, je param3, je param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        mq[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        ar var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ArmiesOfGielinor.field_M ? 1 : 0;
                    var5 = param2.length;
                    var6 = new String[var5];
                    var14 = new char[var5];
                    var13 = var14;
                    var7 = var13;
                    var8 = new mq[var5];
                    var9 = 49;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 <= var10_int) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var11 = ce.field_K.a(param2[var10_int], 81);
                        var6[var10_int] = var11.d((byte) 97);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 < -7) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        fg.a(-20);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var10 = (Exception) (Object) caughtException;
                    return null;
                }
                case 8: {
                    return new mq(0L, param1, param4, param3, var8, param2, var6, var14);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
        ((fg) this).field_o = param0;
        ((fg) this).field_u = param6;
        ((fg) this).field_p = param1;
        ((fg) this).field_t = param3;
        if (param7 > -55) {
            Object var10 = null;
            mq discarded$0 = fg.a(-76, (je) null, (int[]) null, (je) null, (je) null);
        }
        ((fg) this).field_r = param4;
        ((fg) this).field_s = param2;
        ((fg) this).field_q = param5;
    }

    final static void a(int param0, bv param1) {
        try {
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
            dc var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            dc var17 = null;
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
            Throwable decompiledCaughtException = null;
            var18 = null;
            var19 = null;
            var16 = null;
            var22 = null;
            var23 = null;
            var12 = ArmiesOfGielinor.field_M ? 1 : 0;
            var13 = (dc) (Object) tp.field_e.e((byte) 125);
            var17 = var13;
            if (var17 == null) {
              return;
            } else {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if (var4 >= var17.field_p) {
                  if (var3 != 0) {
                    return;
                  } else {
                    var4 = param1.field_q;
                    param1.a((byte) -66, var17.field_q);
                    var5 = param0;
                    L1: while (true) {
                      if (var17.field_p <= var5) {
                        var5++;
                      } else {
                        L2: {
                          if (var17.field_m[var5] != 0) {
                            param1.b(1, var17.field_m[var5]);
                            break L2;
                          } else {
                            try {
                              L3: {
                                var6_int = var17.field_t[var5];
                                if (var6_int != 0) {
                                  if (var6_int == 1) {
                                    var16_ref = (java.lang.reflect.Field) var17.field_k[var5].field_f;
                                    var20 = var16_ref;
                                    var20.setInt((Object) null, var17.field_v[var5]);
                                    param1.b(1, 0);
                                    break L3;
                                  } else {
                                    if ((var6_int ^ -1) == -3) {
                                      var28 = (java.lang.reflect.Field) var17.field_k[var5].field_f;
                                      var8 = var28.getModifiers();
                                      param1.b(param0 + 1, 0);
                                      param1.a((byte) -79, var8);
                                      break L3;
                                    } else {
                                      break L3;
                                    }
                                  }
                                } else {
                                  var27 = (java.lang.reflect.Field) var17.field_k[var5].field_f;
                                  var8 = var27.getInt((Object) null);
                                  param1.b(param0 ^ 1, 0);
                                  param1.a((byte) -75, var8);
                                  break L3;
                                }
                              }
                              L4: {
                                if (var6_int != 3) {
                                  if (4 != var6_int) {
                                    break L4;
                                  } else {
                                    var30 = (java.lang.reflect.Method) var17.field_r[var5].field_f;
                                    var8 = var30.getModifiers();
                                    param1.b(param0 ^ 1, 0);
                                    param1.a((byte) -115, var8);
                                    break L4;
                                  }
                                } else {
                                  var29 = (java.lang.reflect.Method) var17.field_r[var5].field_f;
                                  var26 = var17.field_u[var5];
                                  var9 = new Object[var26.length];
                                  var10_int = 0;
                                  L5: while (true) {
                                    if (var26.length <= var10_int) {
                                      var10 = var29.invoke((Object) null, var9);
                                      if (var10 != null) {
                                        if (var10 instanceof Number) {
                                          param1.b(1, 1);
                                          param1.a(((Number) var10).longValue(), param0 + 38359632);
                                          break L4;
                                        } else {
                                          if (!(var10 instanceof String)) {
                                            param1.b(1, 4);
                                            break L4;
                                          } else {
                                            param1.b(1, 2);
                                            param1.b((String) var10, param0 + 13851);
                                            break L4;
                                          }
                                        }
                                      } else {
                                        param1.b(param0 ^ 1, 0);
                                        break L4;
                                      }
                                    } else {
                                      var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
                                      var9[var10_int] = var11.readObject();
                                      var10_int++;
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                              param1.b(1, -14);
                            } catch (java.io.IOException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                              param1.b(1, -17);
                            } catch (java.lang.NullPointerException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref8 = (IOException) (Object) decompiledCaughtException;
                              param1.b(1, -18);
                            } catch (java.lang.Exception decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                              param1.b(1, -19);
                            } catch (java.lang.Throwable decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref10 = (Exception) (Object) decompiledCaughtException;
                              param1.b(1, -20);
                            }
                            break L2;
                          }
                        }
                        var6_ref11 = decompiledCaughtException;
                        param1.b(1, -21);
                        continue L1;
                      }
                    }
                  }
                } else {
                  L6: {
                    if (null == var13.field_k[var4]) {
                      break L6;
                    } else {
                      L7: {
                        if (-3 == var13.field_k[var4].field_g) {
                          var13.field_m[var4] = -5;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (-1 == var13.field_k[var4].field_g) {
                        var3 = 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (null != var13.field_r[var4]) {
                    L8: {
                      if ((var13.field_r[var4].field_g ^ -1) == -3) {
                        var13.field_m[var4] = -6;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (0 == var13.field_r[var4].field_g) {
                      var3 = 1;
                      var4++;
                      continue L0;
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    fg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Most health recovered";
        field_m = "Turns used";
        field_k = "End turn";
        field_n = "This item can only be used on an elf songstress.";
    }
}

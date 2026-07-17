/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ln {
    private int field_k;
    private String field_r;
    static bl field_l;
    private long field_d;
    int field_e;
    String field_s;
    int field_i;
    static id field_a;
    static bd field_g;
    static bd field_j;
    static String field_h;
    static bd field_c;
    static String field_p;
    int[] field_o;
    int field_f;
    static int field_q;
    static bd[] field_m;
    static boolean[] field_b;
    private boolean field_n;

    final static void a(ca param0, byte param1, int param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            he.field_s[0] = jk.field_b.nextInt();
            he.field_s[1] = jk.field_b.nextInt();
            he.field_s[3] = (int)d.field_y;
            he.field_s[2] = (int)(d.field_y >> 32);
            ob.field_s.field_i = 0;
            ob.field_s.b(he.field_s[0], param1 ^ -25324);
            ob.field_s.b(he.field_s[1], param1 ^ -25324);
            if (param1 == -73) {
              L1: {
                L2: {
                  ob.field_s.b(he.field_s[2], 25251);
                  ob.field_s.b(he.field_s[3], 25251);
                  f.a(24, ob.field_s);
                  ob.field_s.a((byte) -128, param2);
                  param0.a(ob.field_s, -99);
                  s.field_b.field_i = 0;
                  if (!param3) {
                    break L2;
                  } else {
                    s.field_b.d(120, 18);
                    if (!HostileSpawn.field_I) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                s.field_b.d(param1 ^ -41, 16);
                break L1;
              }
              L3: {
                s.field_b.field_i = s.field_b.field_i + 2;
                var5_int = s.field_b.field_i;
                s.field_b.b(le.field_bb, 25251);
                s.field_b.b(9201, vi.field_l);
                var6 = 0;
                if (!wc.field_g) {
                  break L3;
                } else {
                  var6 = var6 | 1;
                  break L3;
                }
              }
              L4: {
                if (sd.field_u) {
                  var6 = var6 | 4;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (!param4) {
                  break L5;
                } else {
                  var6 = var6 | 8;
                  break L5;
                }
              }
              L6: {
                if (fl.field_b == null) {
                  break L6;
                } else {
                  var6 = var6 | 16;
                  break L6;
                }
              }
              L7: {
                s.field_b.d(param1 + 185, var6);
                var7 = de.a(-110, bn.c(-1));
                if (var7 != null) {
                  break L7;
                } else {
                  var7 = "";
                  break L7;
                }
              }
              L8: {
                s.field_b.a(var7, param1 ^ -73);
                if (fl.field_b == null) {
                  break L8;
                } else {
                  s.field_b.a(122, fl.field_b);
                  break L8;
                }
              }
              ml.a((vi) (Object) s.field_b, nb.field_L, 0, lm.field_z, ob.field_s);
              s.field_b.a(true, -var5_int + s.field_b.field_i);
              mb.d(-1, -22370);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("ln.D(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_l = null;
        field_a = null;
        field_g = null;
        field_h = null;
        field_c = null;
        field_g = null;
        field_m = null;
        field_p = null;
        field_j = null;
    }

    final static void a(en param0, byte param1) {
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
            java.lang.reflect.Field var7 = null;
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            ng var13 = null;
            java.lang.reflect.Field var14 = null;
            ng var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Method var28 = null;
            java.lang.reflect.Method var29 = null;
            Object stackIn_6_0 = null;
            Object stackIn_25_0 = null;
            int stackIn_29_0 = 0;
            int stackIn_73_0 = 0;
            RuntimeException stackIn_76_0 = null;
            StringBuilder stackIn_76_1 = null;
            RuntimeException stackIn_77_0 = null;
            StringBuilder stackIn_77_1 = null;
            RuntimeException stackIn_78_0 = null;
            StringBuilder stackIn_78_1 = null;
            String stackIn_78_2 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_5_0 = null;
            Object stackOut_24_0 = null;
            int stackOut_28_0 = 0;
            int stackOut_72_0 = 0;
            RuntimeException stackOut_75_0 = null;
            StringBuilder stackOut_75_1 = null;
            RuntimeException stackOut_77_0 = null;
            StringBuilder stackOut_77_1 = null;
            String stackOut_77_2 = null;
            RuntimeException stackOut_76_0 = null;
            StringBuilder stackOut_76_1 = null;
            String stackOut_76_2 = null;
            var18 = null;
            var19 = null;
            var21 = null;
            var22 = null;
            var12 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                var13 = (ng) (Object) td.field_o.g(-97);
                var17 = var13;
                if (var17 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        L4: {
                          if (~var17.field_t >= ~var4) {
                            break L4;
                          } else {
                            stackOut_5_0 = null;
                            stackIn_25_0 = stackOut_5_0;
                            stackIn_6_0 = stackOut_5_0;
                            if (var12 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_6_0 == (Object) (Object) var13.field_r[var4]) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (var13.field_r[var4].field_f != 2) {
                                      break L6;
                                    } else {
                                      var13.field_m[var4] = -5;
                                      break L6;
                                    }
                                  }
                                  if (var13.field_r[var4].field_f != 0) {
                                    break L5;
                                  } else {
                                    var3 = 1;
                                    break L5;
                                  }
                                }
                              }
                              L7: {
                                if (var13.field_j[var4] != null) {
                                  L8: {
                                    if (var13.field_j[var4].field_f == 2) {
                                      var13.field_m[var4] = -6;
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  if (var13.field_j[var4].field_f == 0) {
                                    var3 = 1;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  break L7;
                                }
                              }
                              var4++;
                              if (var12 == 0) {
                                continue L1;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        if (var3 != 0) {
                          return;
                        } else {
                          if (param1 <= -43) {
                            break L2;
                          } else {
                            stackOut_24_0 = null;
                            stackIn_25_0 = stackOut_24_0;
                            break L3;
                          }
                        }
                      }
                      field_p = (String) (Object) stackIn_25_0;
                      break L2;
                    }
                    var4 = param0.field_i;
                    param0.b(var17.field_h, 25251);
                    var5 = 0;
                    L9: while (true) {
                      L10: {
                        L11: {
                          if (~var17.field_t >= ~var5) {
                            break L11;
                          } else {
                            stackOut_28_0 = ~var13.field_m[var5];
                            stackIn_73_0 = stackOut_28_0;
                            stackIn_29_0 = stackOut_28_0;
                            if (var12 != 0) {
                              break L10;
                            } else {
                              L12: {
                                L13: {
                                  if (stackIn_29_0 == -1) {
                                    break L13;
                                  } else {
                                    param0.d(116, var13.field_m[var5]);
                                    if (var12 == 0) {
                                      break L12;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                try {
                                  L14: {
                                    L15: {
                                      L16: {
                                        var6_int = var13.field_q[var5];
                                        if (var6_int != 0) {
                                          break L16;
                                        } else {
                                          var26 = (java.lang.reflect.Field) var13.field_r[var5].field_c;
                                          var8 = var26.getInt((Object) null);
                                          param0.d(116, 0);
                                          param0.b(var8, 25251);
                                          if (var12 == 0) {
                                            break L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      L17: {
                                        if (var6_int == 1) {
                                          break L17;
                                        } else {
                                          if (var6_int == 2) {
                                            var27 = (java.lang.reflect.Field) var13.field_r[var5].field_c;
                                            var8 = var27.getModifiers();
                                            param0.d(118, 0);
                                            param0.b(var8, 25251);
                                            if (var12 == 0) {
                                              break L15;
                                            } else {
                                              break L17;
                                            }
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      var14 = (java.lang.reflect.Field) var13.field_r[var5].field_c;
                                      var7 = var14;
                                      var14.setInt((Object) null, var13.field_n[var5]);
                                      param0.d(87, 0);
                                      break L15;
                                    }
                                    L18: {
                                      L19: {
                                        if (var6_int != 3) {
                                          break L19;
                                        } else {
                                          var28 = (java.lang.reflect.Method) var13.field_j[var5].field_c;
                                          var25 = var13.field_o[var5];
                                          var9 = new Object[var25.length];
                                          var10_int = 0;
                                          L20: while (true) {
                                            L21: {
                                              if (var10_int >= var25.length) {
                                                break L21;
                                              } else {
                                                var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                                                var9[var10_int] = var11.readObject();
                                                var10_int++;
                                                if (var12 != 0) {
                                                  break L18;
                                                } else {
                                                  if (var12 == 0) {
                                                    continue L20;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                            }
                                            L22: {
                                              L23: {
                                                var10 = var28.invoke((Object) null, var9);
                                                if (var10 != null) {
                                                  break L23;
                                                } else {
                                                  param0.d(120, 0);
                                                  if (var12 == 0) {
                                                    break L22;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              L24: {
                                                if (var10 instanceof Number) {
                                                  break L24;
                                                } else {
                                                  L25: {
                                                    if (!(var10 instanceof String)) {
                                                      break L25;
                                                    } else {
                                                      param0.d(125, 2);
                                                      param0.a((String) var10, 0);
                                                      if (var12 == 0) {
                                                        break L22;
                                                      } else {
                                                        break L25;
                                                      }
                                                    }
                                                  }
                                                  param0.d(84, 4);
                                                  if (var12 == 0) {
                                                    break L22;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                              param0.d(81, 1);
                                              param0.b(9201, ((Number) var10).longValue());
                                              break L22;
                                            }
                                            if (var12 == 0) {
                                              break L18;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                      }
                                      if (4 != var6_int) {
                                        break L18;
                                      } else {
                                        var29 = (java.lang.reflect.Method) var13.field_j[var5].field_c;
                                        var8 = var29.getModifiers();
                                        param0.d(84, 0);
                                        param0.b(var8, 25251);
                                        break L18;
                                      }
                                    }
                                    break L14;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L30: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.d(126, -14);
                                    break L30;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L31: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.d(113, -15);
                                    break L31;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L32: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.d(102, -16);
                                    break L32;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L34: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.d(102, -18);
                                    break L34;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L35: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.d(81, -19);
                                    break L35;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L36: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.d(114, -20);
                                    break L36;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L37: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.d(126, -21);
                                    break L37;
                                  }
                                }
                                break L12;
                              }
                              var5++;
                              if (var12 == 0) {
                                continue L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        stackOut_72_0 = param0.f(var4, -73);
                        stackIn_73_0 = stackOut_72_0;
                        break L10;
                      }
                      var17.b(-63);
                      break L0;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L38: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_75_0 = (RuntimeException) var2;
                stackOut_75_1 = new StringBuilder().append("ln.A(");
                stackIn_77_0 = stackOut_75_0;
                stackIn_77_1 = stackOut_75_1;
                stackIn_76_0 = stackOut_75_0;
                stackIn_76_1 = stackOut_75_1;
                if (param0 == null) {
                  stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
                  stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
                  stackOut_77_2 = "null";
                  stackIn_78_0 = stackOut_77_0;
                  stackIn_78_1 = stackOut_77_1;
                  stackIn_78_2 = stackOut_77_2;
                  break L38;
                } else {
                  stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
                  stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
                  stackOut_76_2 = "{...}";
                  stackIn_78_0 = stackOut_76_0;
                  stackIn_78_1 = stackOut_76_1;
                  stackIn_78_2 = stackOut_76_2;
                  break L38;
                }
              }
              throw wg.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(boolean param0) {
        L0: {
          if (((ln) this).field_n) {
            break L0;
          } else {
            L1: {
              if (((ln) this).field_f != 2) {
                break L1;
              } else {
                if (((ln) this).field_k <= 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (~d.field_n == ~((ln) this).field_d) {
              return 1;
            } else {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  ln.a(-93);
                  break L2;
                }
              }
              if (bj.field_b == 2) {
                if (dh.a(((ln) this).field_r, (byte) 111)) {
                  return 1;
                } else {
                  return 0;
                }
              } else {
                return 0;
              }
            }
          }
        }
        return 2;
    }

    ln(boolean param0) {
        L0: {
          L1: {
            if (!param0) {
              break L1;
            } else {
              ((ln) this).field_o = bn.field_b;
              if (!HostileSpawn.field_I) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((ln) this).field_o = null;
          break L0;
        }
        ((ln) this).field_r = qg.field_o;
        ((ln) this).field_s = md.field_f;
        ((ln) this).field_f = lb.field_b;
        ((ln) this).field_k = ja.field_c;
        ((ln) this).field_i = jg.field_c;
        ((ln) this).field_d = pm.field_c;
        ((ln) this).field_e = qa.field_e;
        ((ln) this).field_n = pk.field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new bl(2);
        field_h = "Options";
        field_p = "Explosive crates will detonate when heavily damaged.";
        field_b = new boolean[]{false, false};
    }
}

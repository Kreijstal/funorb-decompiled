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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            he.field_s[0] = jk.field_b.nextInt();
            he.field_s[1] = jk.field_b.nextInt();
            he.field_s[3] = (int)d.field_y;
            he.field_s[2] = (int)(d.field_y >> 32);
            ob.field_s.field_i = 0;
            ob.field_s.b(he.field_s[0], 25251);
            ob.field_s.b(he.field_s[1], 25251);
            L1: {
              ob.field_s.b(he.field_s[2], 25251);
              ob.field_s.b(he.field_s[3], 25251);
              f.a(24, ob.field_s);
              ob.field_s.a((byte) -128, param2);
              param0.a(ob.field_s, -99);
              s.field_b.field_i = 0;
              if (!param3) {
                s.field_b.d(96, 16);
                break L1;
              } else {
                s.field_b.d(120, 18);
                break L1;
              }
            }
            L2: {
              s.field_b.field_i = s.field_b.field_i + 2;
              var5_int = s.field_b.field_i;
              s.field_b.b(le.field_bb, 25251);
              s.field_b.b(9201, vi.field_l);
              var6 = 0;
              if (!wc.field_g) {
                break L2;
              } else {
                var6 = var6 | 1;
                break L2;
              }
            }
            L3: {
              if (sd.field_u) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param4) {
                break L4;
              } else {
                var6 = var6 | 8;
                break L4;
              }
            }
            L5: {
              if (fl.field_b == null) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              s.field_b.d(112, var6);
              var7 = de.a(-110, bn.c(-1));
              if (var7 != null) {
                break L6;
              } else {
                var7 = "";
                break L6;
              }
            }
            L7: {
              s.field_b.a(var7, 0);
              if (fl.field_b == null) {
                break L7;
              } else {
                s.field_b.a(122, fl.field_b);
                break L7;
              }
            }
            ml.a((vi) (Object) s.field_b, nb.field_L, 0, lm.field_z, ob.field_s);
            s.field_b.a(true, -var5_int + s.field_b.field_i);
            mb.d(-1, -22370);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("ln.D(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L8;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + -73 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_l = null;
        field_a = null;
        if (param0 != 31311) {
            field_g = null;
        }
        field_h = null;
        field_c = null;
        field_g = null;
        field_m = null;
        field_p = null;
        field_j = null;
    }

    final static void a(en param0) {
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
            ng var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            ng var17 = null;
            Object var18 = null;
            Object var19 = null;
            java.lang.reflect.Field var20 = null;
            Object var22 = null;
            java.lang.reflect.Method var22_ref = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            RuntimeException stackIn_79_0 = null;
            StringBuilder stackIn_79_1 = null;
            RuntimeException stackIn_80_0 = null;
            StringBuilder stackIn_80_1 = null;
            RuntimeException stackIn_81_0 = null;
            StringBuilder stackIn_81_1 = null;
            String stackIn_81_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_78_0 = null;
            StringBuilder stackOut_78_1 = null;
            RuntimeException stackOut_80_0 = null;
            StringBuilder stackOut_80_1 = null;
            String stackOut_80_2 = null;
            RuntimeException stackOut_79_0 = null;
            StringBuilder stackOut_79_1 = null;
            String stackOut_79_2 = null;
            var18 = null;
            var19 = null;
            var16 = null;
            var22 = null;
            var23 = null;
            var12 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                var13 = (ng) (Object) td.field_o.g(-97);
                var17 = var13;
                if (var17 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (~var17.field_t >= ~var4) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var4 = param0.field_i;
                        param0.b(var17.field_h, 25251);
                        var5 = 0;
                        L2: while (true) {
                          if (~var17.field_t >= ~var5) {
                            int discarded$1 = param0.f(var4, -73);
                            var17.b(-63);
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_m[var5] == 0) {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var17.field_q[var5];
                                      if (var6_int != 0) {
                                        if (var6_int == 1) {
                                          var16_ref = (java.lang.reflect.Field) var17.field_r[var5].field_c;
                                          var20 = var16_ref;
                                          var20.setInt((Object) null, var17.field_n[var5]);
                                          param0.d(87, 0);
                                          break L5;
                                        } else {
                                          if (var6_int == 2) {
                                            var28 = (java.lang.reflect.Field) var17.field_r[var5].field_c;
                                            var8 = var28.getModifiers();
                                            param0.d(118, 0);
                                            param0.b(var8, 25251);
                                            break L5;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      } else {
                                        var27 = (java.lang.reflect.Field) var17.field_r[var5].field_c;
                                        var8 = var27.getInt((Object) null);
                                        param0.d(116, 0);
                                        param0.b(var8, 25251);
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var6_int != 3) {
                                        L7: {
                                          if (4 != var6_int) {
                                            break L7;
                                          } else {
                                            var29 = (java.lang.reflect.Method) var17.field_j[var5].field_c;
                                            var8 = var29.getModifiers();
                                            param0.d(84, 0);
                                            param0.b(var8, 25251);
                                            break L7;
                                          }
                                        }
                                        break L6;
                                      } else {
                                        var22_ref = (java.lang.reflect.Method) var17.field_j[var5].field_c;
                                        var26 = var17.field_o[var5];
                                        var9 = new Object[var26.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var10_int >= var26.length) {
                                            var10 = var22_ref.invoke((Object) null, var9);
                                            if (null != var10) {
                                              if (var10 instanceof Number) {
                                                param0.d(81, 1);
                                                param0.b(9201, ((Number) var10).longValue());
                                                break L6;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param0.d(84, 4);
                                                  break L6;
                                                } else {
                                                  param0.d(125, 2);
                                                  param0.a((String) var10, 0);
                                                  break L6;
                                                }
                                              }
                                            } else {
                                              param0.d(120, 0);
                                              break L6;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
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
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.d(126, -14);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.d(113, -15);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.d(102, -16);
                                    break L15;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.d(102, -18);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.d(81, -19);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.d(114, -20);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.d(126, -21);
                                    break L20;
                                  }
                                }
                                break L3;
                              } else {
                                param0.d(116, var17.field_m[var5]);
                                break L3;
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      L21: {
                        if (null == var13.field_r[var4]) {
                          break L21;
                        } else {
                          L22: {
                            if (var13.field_r[var4].field_f != 2) {
                              break L22;
                            } else {
                              var13.field_m[var4] = -5;
                              break L22;
                            }
                          }
                          if (var13.field_r[var4].field_f != 0) {
                            break L21;
                          } else {
                            var3 = 1;
                            break L21;
                          }
                        }
                      }
                      L23: {
                        if (var13.field_j[var4] != null) {
                          L24: {
                            if (var13.field_j[var4].field_f == 2) {
                              var13.field_m[var4] = -6;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          if (var13.field_j[var4].field_f == 0) {
                            var3 = 1;
                            break L23;
                          } else {
                            break L23;
                          }
                        } else {
                          break L23;
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
              L25: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_78_0 = (RuntimeException) var2;
                stackOut_78_1 = new StringBuilder().append("ln.A(");
                stackIn_80_0 = stackOut_78_0;
                stackIn_80_1 = stackOut_78_1;
                stackIn_79_0 = stackOut_78_0;
                stackIn_79_1 = stackOut_78_1;
                if (param0 == null) {
                  stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
                  stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
                  stackOut_80_2 = "null";
                  stackIn_81_0 = stackOut_80_0;
                  stackIn_81_1 = stackOut_80_1;
                  stackIn_81_2 = stackOut_80_2;
                  break L25;
                } else {
                  stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
                  stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
                  stackOut_79_2 = "{...}";
                  stackIn_81_0 = stackOut_79_0;
                  stackIn_81_1 = stackOut_79_1;
                  stackIn_81_2 = stackOut_79_2;
                  break L25;
                }
              }
              throw wg.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 44 + -111 + 41);
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
              L3: {
                if (bj.field_b != 2) {
                  break L3;
                } else {
                  int discarded$1 = 111;
                  if (!dh.a(((ln) this).field_r)) {
                    break L3;
                  } else {
                    return 1;
                  }
                }
              }
              return 0;
            }
          }
        }
        return 2;
    }

    ln(boolean param0) {
        if (param0) {
            ((ln) this).field_o = bn.field_b;
        } else {
            ((ln) this).field_o = null;
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

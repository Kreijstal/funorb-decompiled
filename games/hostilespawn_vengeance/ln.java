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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            he.field_s[0] = jk.field_b.nextInt();
            he.field_s[1] = jk.field_b.nextInt();
            he.field_s[3] = (int)d.field_y;
            he.field_s[2] = (int)(d.field_y >> 1641249376);
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
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("ln.D(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L9;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_b = null;
              field_l = null;
              field_a = null;
              if (param0 == 31311) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            field_h = null;
            field_c = null;
            field_g = null;
            field_m = null;
            field_p = null;
            field_j = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "ln.C(" + param0 + ')');
        }
    }

    final static void a(en param0, byte param1) {
        try {
            RuntimeException var2 = null;
            ng var2_ref = null;
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
            java.lang.reflect.Method var7_ref = null;
            int var8 = 0;
            byte[][] var8_ref_byte____ = null;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            Object stackIn_6_0 = null;
            Object stackIn_35_0 = null;
            int stackIn_39_0 = 0;
            int stackIn_102_0 = 0;
            RuntimeException stackIn_105_0 = null;
            StringBuilder stackIn_105_1 = null;
            RuntimeException stackIn_107_0 = null;
            StringBuilder stackIn_107_1 = null;
            RuntimeException stackIn_108_0 = null;
            StringBuilder stackIn_108_1 = null;
            String stackIn_108_2 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_5_0 = null;
            Object stackOut_33_0 = null;
            int stackOut_38_0 = 0;
            int stackOut_101_0 = 0;
            RuntimeException stackOut_104_0 = null;
            StringBuilder stackOut_104_1 = null;
            RuntimeException stackOut_107_0 = null;
            StringBuilder stackOut_107_1 = null;
            String stackOut_107_2 = null;
            RuntimeException stackOut_105_0 = null;
            StringBuilder stackOut_105_1 = null;
            String stackOut_105_2 = null;
            var12 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                var2_ref = (ng) (Object) td.field_o.g(-97);
                if (var2_ref != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        L4: {
                          if (~var2_ref.field_t >= ~var4) {
                            break L4;
                          } else {
                            stackOut_5_0 = null;
                            stackIn_35_0 = stackOut_5_0;
                            stackIn_6_0 = stackOut_5_0;
                            if (var12 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_6_0 == (Object) (Object) var2_ref.field_r[var4]) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (var2_ref.field_r[var4].field_f != 2) {
                                      break L6;
                                    } else {
                                      var2_ref.field_m[var4] = -5;
                                      break L6;
                                    }
                                  }
                                  if (var2_ref.field_r[var4].field_f != 0) {
                                    break L5;
                                  } else {
                                    var3 = 1;
                                    break L5;
                                  }
                                }
                              }
                              L7: {
                                if (var2_ref.field_j[var4] != null) {
                                  L8: {
                                    if (var2_ref.field_j[var4].field_f == 2) {
                                      var2_ref.field_m[var4] = -6;
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  if (var2_ref.field_j[var4].field_f == 0) {
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
                            stackOut_33_0 = null;
                            stackIn_35_0 = stackOut_33_0;
                            break L3;
                          }
                        }
                      }
                      field_p = (String) (Object) stackIn_35_0;
                      break L2;
                    }
                    var4 = param0.field_i;
                    param0.b(var2_ref.field_h, 25251);
                    var5 = 0;
                    L9: while (true) {
                      L10: {
                        L11: {
                          if (~var2_ref.field_t >= ~var5) {
                            break L11;
                          } else {
                            stackOut_38_0 = ~var2_ref.field_m[var5];
                            stackIn_102_0 = stackOut_38_0;
                            stackIn_39_0 = stackOut_38_0;
                            if (var12 != 0) {
                              break L10;
                            } else {
                              L12: {
                                L13: {
                                  if (stackIn_39_0 == -1) {
                                    break L13;
                                  } else {
                                    param0.d(116, var2_ref.field_m[var5]);
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
                                        var6_int = var2_ref.field_q[var5];
                                        if (var6_int != 0) {
                                          break L16;
                                        } else {
                                          var7 = (java.lang.reflect.Field) var2_ref.field_r[var5].field_c;
                                          var8 = var7.getInt((Object) null);
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
                                            var7 = (java.lang.reflect.Field) var2_ref.field_r[var5].field_c;
                                            var8 = var7.getModifiers();
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
                                      var7 = (java.lang.reflect.Field) var2_ref.field_r[var5].field_c;
                                      var7.setInt((Object) null, var2_ref.field_n[var5]);
                                      param0.d(87, 0);
                                      break L15;
                                    }
                                    L18: {
                                      L19: {
                                        if (var6_int != 3) {
                                          break L19;
                                        } else {
                                          var7_ref = (java.lang.reflect.Method) var2_ref.field_j[var5].field_c;
                                          var8_ref_byte____ = var2_ref.field_o[var5];
                                          var9 = new Object[var8_ref_byte____.length];
                                          var10_int = 0;
                                          L20: while (true) {
                                            L21: {
                                              if (var10_int >= var8_ref_byte____.length) {
                                                break L21;
                                              } else {
                                                var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var8_ref_byte____[var10_int]));
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
                                                var10 = var7_ref.invoke((Object) null, var9);
                                                if (null != var10) {
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
                                        var7_ref = (java.lang.reflect.Method) var2_ref.field_j[var5].field_c;
                                        var8 = var7_ref.getModifiers();
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
                        stackOut_101_0 = param0.f(var4, -73);
                        stackIn_102_0 = stackOut_101_0;
                        break L10;
                      }
                      var2_ref.b(-63);
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
                stackOut_104_0 = (RuntimeException) var2;
                stackOut_104_1 = new StringBuilder().append("ln.A(");
                stackIn_107_0 = stackOut_104_0;
                stackIn_107_1 = stackOut_104_1;
                stackIn_105_0 = stackOut_104_0;
                stackIn_105_1 = stackOut_104_1;
                if (param0 == null) {
                  stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
                  stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
                  stackOut_107_2 = "null";
                  stackIn_108_0 = stackOut_107_0;
                  stackIn_108_1 = stackOut_107_1;
                  stackIn_108_2 = stackOut_107_2;
                  break L38;
                } else {
                  stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
                  stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
                  stackOut_105_2 = "{...}";
                  stackIn_108_0 = stackOut_105_0;
                  stackIn_108_1 = stackOut_105_1;
                  stackIn_108_2 = stackOut_105_2;
                  break L38;
                }
              }
              throw wg.a((Throwable) (Object) stackIn_108_0, stackIn_108_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (((ln) this).field_n) {
                break L1;
              } else {
                L2: {
                  if (((ln) this).field_f != 2) {
                    break L2;
                  } else {
                    if (((ln) this).field_k <= 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (~d.field_n == ~((ln) this).field_d) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  L3: {
                    if (!param0) {
                      break L3;
                    } else {
                      ln.a(-93);
                      break L3;
                    }
                  }
                  L4: {
                    if (bj.field_b != 2) {
                      break L4;
                    } else {
                      if (!dh.a(((ln) this).field_r, (byte) 111)) {
                        break L4;
                      } else {
                        stackOut_21_0 = 1;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0;
                      }
                    }
                  }
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  break L0;
                }
              }
            }
            stackOut_7_0 = 2;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "ln.B(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    ln(boolean param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  ((ln) this).field_o = bn.field_b;
                  if (!HostileSpawn.field_I) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ln) this).field_o = null;
              break L1;
            }
            ((ln) this).field_r = qg.field_o;
            ((ln) this).field_s = md.field_f;
            ((ln) this).field_f = lb.field_b;
            ((ln) this).field_k = ja.field_c;
            ((ln) this).field_i = jg.field_c;
            ((ln) this).field_d = pm.field_c;
            ((ln) this).field_e = qa.field_e;
            ((ln) this).field_n = pk.field_k;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wg.a((Throwable) (Object) runtimeException, "ln.<init>(" + param0 + ')');
        }
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

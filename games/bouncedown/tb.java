/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tb extends v {
    static v field_p;
    static String[] field_r;
    private pc field_q;
    static long field_n;
    static String field_o;

    final void a(byte param0, Object param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            lf var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            String stackOut_29_2 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            var6 = Bounce.field_N;
            try {
              L0: {
                L1: {
                  if (null != ((tb) this).field_q) {
                    try {
                      L2: {
                        ((tb) this).field_q.a((byte) -70);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((tb) this).field_q = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((tb) this).field_q = (pc) param1;
                int discarded$1 = 31383;
                this.d();
                this.a(param2, (byte) 119);
                ((tb) this).field_c.field_h = 0;
                ((tb) this).field_b = null;
                L4: while (true) {
                  var4_ref3 = (lf) (Object) ((tb) this).field_e.a(param0 + 113);
                  if (var4_ref3 != null) {
                    ((tb) this).field_i.a((byte) -78, (ug) (Object) var4_ref3);
                    continue L4;
                  } else {
                    L5: while (true) {
                      var4_ref3 = (lf) (Object) ((tb) this).field_m.a(-1);
                      if (var4_ref3 != null) {
                        ((tb) this).field_h.a((byte) -78, (ug) (Object) var4_ref3);
                        continue L5;
                      } else {
                        L6: {
                          if (((tb) this).field_j != 0) {
                            {
                              L7: {
                                ((tb) this).field_a.field_h = 0;
                                ((tb) this).field_a.a(4, (byte) 79);
                                ((tb) this).field_a.a((int) ((tb) this).field_j, (byte) 103);
                                ((tb) this).field_a.b(0, (byte) 65);
                                ((tb) this).field_q.a(((tb) this).field_a.field_i.length, ((tb) this).field_a.field_i, 0, 0);
                                break L7;
                              }
                            }
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (param0 == -114) {
                          ((tb) this).field_g = 0;
                          ((tb) this).field_k = fa.a(98);
                          break L0;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_27_0 = (RuntimeException) var4_ref2;
                stackOut_27_1 = new StringBuilder().append("tb.B(").append(param0).append(',');
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
                  break L11;
                } else {
                  stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                  stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                  stackOut_28_2 = "{...}";
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  break L11;
                }
              }
              throw ii.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e() {
        field_r = null;
        field_o = null;
        field_p = null;
        int var1 = 0;
    }

    final void a(int param0) {
        if (param0 > -76) {
            ((tb) this).c((byte) 0);
        }
        if (((tb) this).field_q != null) {
            ((tb) this).field_q.a((byte) -70);
        }
    }

    private final void a(boolean param0, byte param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            wi stackIn_4_0 = null;
            wi stackIn_5_0 = null;
            wi stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            Throwable decompiledCaughtException = null;
            wi stackOut_3_0 = null;
            wi stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            wi stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            if (((tb) this).field_q == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((tb) this).field_a.field_h = 0;
                    stackOut_3_0 = ((tb) this).field_a;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (!param0) {
                      stackOut_5_0 = (wi) (Object) stackIn_5_0;
                      stackOut_5_1 = 3;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L1;
                    } else {
                      stackOut_4_0 = (wi) (Object) stackIn_4_0;
                      stackOut_4_1 = 2;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L1;
                    }
                  }
                  ((wi) (Object) stackIn_6_0).a(stackIn_6_1, (byte) 68);
                  ((tb) this).field_a.a(0L, (byte) -29);
                  ((tb) this).field_q.a(((tb) this).field_a.field_i.length, ((tb) this).field_a.field_i, 0, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((tb) this).field_q.a((byte) -70);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((tb) this).field_d = -2;
                  ((tb) this).field_q = null;
                  ((tb) this).field_l = ((tb) this).field_l + 1;
                  break L2;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean e(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            if (mh.field_U < 10) {
              break L1;
            } else {
              if (pg.field_c) {
                break L1;
              } else {
                if (ej.b(-27)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final void c(byte param0) {
        try {
            ((tb) this).field_q.a((byte) -70);
        } catch (Exception exception) {
        }
        ((tb) this).field_q = null;
        ((tb) this).field_l = ((tb) this).field_l + 1;
        if (param0 < 108) {
            field_n = -77L;
        }
        ((tb) this).field_d = -1;
        ((tb) this).field_j = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            lf var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            lf var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_49_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_87_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_86_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_62_0 = 0;
            L0: {
              var16 = Bounce.field_N;
              if (null != ((tb) this).field_q) {
                L1: {
                  var2_long = fa.a(param0 ^ -54);
                  var4 = (int)(-((tb) this).field_k + var2_long);
                  ((tb) this).field_k = var2_long;
                  if (var4 > 200) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((tb) this).field_g = ((tb) this).field_g + var4;
                if (((tb) this).field_g > 30000) {
                  try {
                    L2: {
                      ((tb) this).field_q.a((byte) -70);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((tb) this).field_q = null;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (null != ((tb) this).field_q) {
              try {
                L4: {
                  L5: {
                    ((tb) this).field_q.a(-20);
                    if (param0 == 71) {
                      break L5;
                    } else {
                      field_o = null;
                      break L5;
                    }
                  }
                  var2_ref = (lf) (Object) ((tb) this).field_i.d(-80);
                  L6: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (lf) (Object) ((tb) this).field_h.d(-122);
                      L7: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L8: while (true) {
                            if (100 <= var2_int) {
                              stackOut_86_0 = 1;
                              stackIn_87_0 = stackOut_86_0;
                              break L4;
                            } else {
                              var3_int = ((tb) this).field_q.d(0);
                              if (var3_int < 0) {
                                throw new IOException();
                              } else {
                                if (var3_int != 0) {
                                  L9: {
                                    ((tb) this).field_g = 0;
                                    var4 = 0;
                                    if (null == ((tb) this).field_b) {
                                      var4 = 10;
                                      break L9;
                                    } else {
                                      if (((tb) this).field_b.field_t == 0) {
                                        var4 = 1;
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (var4 <= 0) {
                                      L11: {
                                        var5 = -((tb) this).field_b.field_s + ((tb) this).field_b.field_p.field_i.length;
                                        var6 = -((tb) this).field_b.field_t + 512;
                                        if (var5 + -((tb) this).field_b.field_p.field_h < var6) {
                                          var6 = -((tb) this).field_b.field_p.field_h + var5;
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (var6 <= var3_int) {
                                          break L12;
                                        } else {
                                          var6 = var3_int;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        ((tb) this).field_q.a(((tb) this).field_b.field_p.field_i, true, var6, ((tb) this).field_b.field_p.field_h);
                                        if (0 != ((tb) this).field_j) {
                                          var7 = 0;
                                          L14: while (true) {
                                            if (var7 >= var6) {
                                              break L13;
                                            } else {
                                              ((tb) this).field_b.field_p.field_i[var7 + ((tb) this).field_b.field_p.field_h] = (byte)ud.a((int) ((tb) this).field_b.field_p.field_i[var7 + ((tb) this).field_b.field_p.field_h], (int) ((tb) this).field_j);
                                              var7++;
                                              continue L14;
                                            }
                                          }
                                        } else {
                                          break L13;
                                        }
                                      }
                                      ((tb) this).field_b.field_p.field_h = ((tb) this).field_b.field_p.field_h + var6;
                                      ((tb) this).field_b.field_t = ((tb) this).field_b.field_t + var6;
                                      if (var5 != ((tb) this).field_b.field_p.field_h) {
                                        if (((tb) this).field_b.field_t != 512) {
                                          break L10;
                                        } else {
                                          ((tb) this).field_b.field_t = 0;
                                          break L10;
                                        }
                                      } else {
                                        ((tb) this).field_b.a(param0 ^ 7);
                                        ((tb) this).field_b.field_n = false;
                                        ((tb) this).field_b = null;
                                        break L10;
                                      }
                                    } else {
                                      L15: {
                                        var5 = -((tb) this).field_c.field_h + var4;
                                        if (~var3_int <= ~var5) {
                                          break L15;
                                        } else {
                                          var5 = var3_int;
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        ((tb) this).field_q.a(((tb) this).field_c.field_i, true, var5, ((tb) this).field_c.field_h);
                                        if (((tb) this).field_j == 0) {
                                          break L16;
                                        } else {
                                          var6 = 0;
                                          L17: while (true) {
                                            if (~var5 >= ~var6) {
                                              break L16;
                                            } else {
                                              ((tb) this).field_c.field_i[((tb) this).field_c.field_h + var6] = (byte)ud.a((int) ((tb) this).field_c.field_i[((tb) this).field_c.field_h + var6], (int) ((tb) this).field_j);
                                              var6++;
                                              continue L17;
                                            }
                                          }
                                        }
                                      }
                                      ((tb) this).field_c.field_h = ((tb) this).field_c.field_h + var5;
                                      if (var4 <= ((tb) this).field_c.field_h) {
                                        if (((tb) this).field_b != null) {
                                          if (((tb) this).field_b.field_t == 0) {
                                            if (((tb) this).field_c.field_i[0] == -1) {
                                              ((tb) this).field_b.field_t = 1;
                                              ((tb) this).field_c.field_h = 0;
                                              break L10;
                                            } else {
                                              ((tb) this).field_b = null;
                                              break L10;
                                            }
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          L18: {
                                            ((tb) this).field_c.field_h = 0;
                                            var6 = ((tb) this).field_c.d((byte) -78);
                                            var7 = ((tb) this).field_c.j(-3);
                                            var8 = ((tb) this).field_c.d((byte) -106);
                                            var9 = ((tb) this).field_c.j(param0 + -74);
                                            var10 = 127 & var8;
                                            if ((var8 & 128) == 0) {
                                              stackOut_48_0 = 0;
                                              stackIn_49_0 = stackOut_48_0;
                                              break L18;
                                            } else {
                                              stackOut_47_0 = 1;
                                              stackIn_49_0 = stackOut_47_0;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            var11 = stackIn_49_0;
                                            var12 = (long)var7 + ((long)var6 << 32);
                                            var14 = null;
                                            if (var11 == 0) {
                                              var14_ref = (lf) (Object) ((tb) this).field_e.d(param0 ^ -47);
                                              L20: while (true) {
                                                if (var14_ref == null) {
                                                  break L19;
                                                } else {
                                                  if (var12 == var14_ref.field_j) {
                                                    break L19;
                                                  } else {
                                                    var14_ref = (lf) (Object) ((tb) this).field_e.b(0);
                                                    continue L20;
                                                  }
                                                }
                                              }
                                            } else {
                                              var14_ref = (lf) (Object) ((tb) this).field_m.d(-92);
                                              L21: while (true) {
                                                if (var14_ref == null) {
                                                  break L19;
                                                } else {
                                                  if (~var12 == ~var14_ref.field_j) {
                                                    break L19;
                                                  } else {
                                                    var14_ref = (lf) (Object) ((tb) this).field_m.b(param0 ^ 71);
                                                    continue L21;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var14_ref == null) {
                                            throw new IOException();
                                          } else {
                                            L22: {
                                              if (var10 == 0) {
                                                stackOut_63_0 = 5;
                                                stackIn_64_0 = stackOut_63_0;
                                                break L22;
                                              } else {
                                                stackOut_62_0 = 9;
                                                stackIn_64_0 = stackOut_62_0;
                                                break L22;
                                              }
                                            }
                                            var15 = stackIn_64_0;
                                            ((tb) this).field_b = var14_ref;
                                            ((tb) this).field_b.field_p = new wi(var15 + (var9 - -((tb) this).field_b.field_s));
                                            ((tb) this).field_b.field_p.a(var10, (byte) 126);
                                            ((tb) this).field_b.field_p.b(var9, (byte) 76);
                                            ((tb) this).field_c.field_h = 0;
                                            ((tb) this).field_b.field_t = 10;
                                            break L10;
                                          }
                                        }
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  var2_int++;
                                  continue L8;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        } else {
                          ((tb) this).field_a.field_h = 0;
                          ((tb) this).field_a.a(0, (byte) 78);
                          ((tb) this).field_a.a(var2_ref.field_j, (byte) -29);
                          ((tb) this).field_q.a(((tb) this).field_a.field_i.length, ((tb) this).field_a.field_i, 0, 0);
                          ((tb) this).field_m.a((byte) -78, (ug) (Object) var2_ref);
                          var2_ref = (lf) (Object) ((tb) this).field_h.b(param0 ^ 71);
                          continue L7;
                        }
                      }
                    } else {
                      ((tb) this).field_a.field_h = 0;
                      ((tb) this).field_a.a(1, (byte) 87);
                      ((tb) this).field_a.a(var2_ref.field_j, (byte) -29);
                      ((tb) this).field_q.a(((tb) this).field_a.field_i.length, ((tb) this).field_a.field_i, 0, param0 ^ 71);
                      ((tb) this).field_e.a((byte) -78, (ug) (Object) var2_ref);
                      var2_ref = (lf) (Object) ((tb) this).field_i.b(0);
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((tb) this).field_q.a((byte) -70);
                    break L23;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L24: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L24;
                  }
                }
                L25: {
                  ((tb) this).field_d = -2;
                  ((tb) this).field_q = null;
                  ((tb) this).field_l = ((tb) this).field_l + 1;
                  if (0 != ((tb) this).c(param0 ^ -8288)) {
                    break L25;
                  } else {
                    if (((tb) this).a(true) != 0) {
                      break L25;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_87_0 != 0;
            } else {
              L26: {
                if (((tb) this).c(-8217) != 0) {
                  break L26;
                } else {
                  if (0 != ((tb) this).a(true)) {
                    break L26;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d() {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((tb) this).field_q != null) {
              {
                L0: {
                  ((tb) this).field_a.field_h = 0;
                  ((tb) this).field_a.a(6, (byte) 97);
                  ((tb) this).field_a.a(3, 490724880);
                  ((tb) this).field_a.e(-750655096, 0);
                  ((tb) this).field_q.a(((tb) this).field_a.field_i.length, ((tb) this).field_a.field_i, 0, 0);
                  break L0;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public tb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Members";
        field_r = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}

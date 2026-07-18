/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gv extends qda {
    private jqa field_t;
    static int[] field_q;
    static jpa field_s;
    static String field_r;
    static int field_u;
    static String field_v;
    static String[] field_w;

    public gv() {
    }

    public static void a(boolean param0) {
        field_v = null;
        field_q = null;
        field_s = null;
        field_r = null;
        field_w = null;
    }

    final void a(int param0) {
        if (!(null == ((gv) this).field_t)) {
            ((gv) this).field_t.a((byte) 105);
        }
        if (param0 != -21) {
            field_v = null;
        }
    }

    final void a(Object param0, byte param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            qqa var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            var6 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (((gv) this).field_t != null) {
                    try {
                      L2: {
                        ((gv) this).field_t.a((byte) 105);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((gv) this).field_t = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L4: {
                  ((gv) this).field_t = (jqa) param0;
                  this.g(param1 + -104);
                  if (param1 == 54) {
                    break L4;
                  } else {
                    field_w = null;
                    break L4;
                  }
                }
                this.a((byte) 117, param2);
                ((gv) this).field_h.field_h = 0;
                ((gv) this).field_g = null;
                L5: while (true) {
                  var4_ref3 = (qqa) (Object) ((gv) this).field_m.c((byte) 121);
                  if (var4_ref3 == null) {
                    L6: while (true) {
                      var4_ref3 = (qqa) (Object) ((gv) this).field_k.c((byte) 111);
                      if (var4_ref3 == null) {
                        L7: {
                          if (((gv) this).field_d == 0) {
                            break L7;
                          } else {
                            {
                              L8: {
                                ((gv) this).field_o.field_h = 0;
                                ((gv) this).field_o.i(4, param1 + -54);
                                ((gv) this).field_o.i((int) ((gv) this).field_d, param1 ^ 54);
                                ((gv) this).field_o.a(0, (byte) -17);
                                ((gv) this).field_t.a(((gv) this).field_o.field_g, 0, ((gv) this).field_o.field_g.length, 124);
                                break L8;
                              }
                            }
                            break L7;
                          }
                        }
                        ((gv) this).field_p = 0;
                        ((gv) this).field_j = bva.b((byte) -107);
                        break L0;
                      } else {
                        ((gv) this).field_c.a((od) (Object) var4_ref3, (byte) -104);
                        continue L6;
                      }
                    }
                  } else {
                    ((gv) this).field_e.a((od) (Object) var4_ref3, (byte) -81);
                    continue L5;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) var4_ref2;
                stackOut_24_1 = new StringBuilder().append("gv.D(");
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                if (param0 == null) {
                  stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                  stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                  stackOut_26_2 = "null";
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L12;
                } else {
                  stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                  stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                  stackOut_25_2 = "{...}";
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L12;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            uia stackIn_3_0 = null;
            uia stackIn_4_0 = null;
            uia stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            Throwable decompiledCaughtException = null;
            uia stackOut_2_0 = null;
            uia stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            uia stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            if (null != ((gv) this).field_t) {
              try {
                L0: {
                  L1: {
                    ((gv) this).field_o.field_h = 0;
                    stackOut_2_0 = ((gv) this).field_o;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (!param1) {
                      stackOut_4_0 = (uia) (Object) stackIn_4_0;
                      stackOut_4_1 = 3;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      break L1;
                    } else {
                      stackOut_3_0 = (uia) (Object) stackIn_3_0;
                      stackOut_3_1 = 2;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      break L1;
                    }
                  }
                  ((uia) (Object) stackIn_5_0).i(stackIn_5_1, 0);
                  ((gv) this).field_o.a(true, 0L);
                  ((gv) this).field_t.a(((gv) this).field_o.field_g, 0, ((gv) this).field_o.field_g.length, 124);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((gv) this).field_t.a((byte) 105);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((gv) this).field_t = null;
                  ((gv) this).field_a = ((gv) this).field_a + 1;
                  ((gv) this).field_n = -2;
                  break L2;
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

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        L0: {
          var10 = -(param2 * param7 / param8) + param6;
          if (~var10 > ~param0) {
            break L0;
          } else {
            if (~param9 > ~var10) {
              break L0;
            } else {
              L1: {
                if (param3 > param6) {
                  if (var10 < param6) {
                    break L0;
                  } else {
                    if (var10 > param3) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  if (param3 > var10) {
                    break L0;
                  } else {
                    if (~var10 < ~param6) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var11 = -(param2 << param1) / param8;
              if (var11 < 0) {
                break L0;
              } else {
                if (1 << param1 <= var11) {
                  break L0;
                } else {
                  L2: {
                    if (param4 == -1) {
                      break L2;
                    } else {
                      if (~param4 >= ~var11) {
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return var11;
                }
              }
            }
          }
        }
        return param4;
    }

    final boolean c(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            qqa var2_ref = null;
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
            qqa var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_59_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_85_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_58_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_73_0 = 0;
            int stackOut_84_0 = 0;
            L0: {
              var16 = TombRacer.field_G ? 1 : 0;
              if (null == ((gv) this).field_t) {
                break L0;
              } else {
                L1: {
                  var2_long = bva.b((byte) -107);
                  var4 = (int)(-((gv) this).field_j + var2_long);
                  ((gv) this).field_j = var2_long;
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((gv) this).field_p = ((gv) this).field_p + var4;
                if (((gv) this).field_p > 30000) {
                  try {
                    L2: {
                      ((gv) this).field_t.a((byte) 105);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((gv) this).field_t = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (((gv) this).field_t == null) {
              if (((gv) this).f(-3) != 0) {
                return false;
              } else {
                if (((gv) this).a((byte) 78) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L4: {
                  ((gv) this).field_t.b(102);
                  var2_ref = (qqa) (Object) ((gv) this).field_e.b((byte) 38);
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (qqa) (Object) ((gv) this).field_c.b((byte) 38);
                      L6: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L7: while (true) {
                            L8: {
                              if (var2_int >= 100) {
                                break L8;
                              } else {
                                var3_int = ((gv) this).field_t.c(0);
                                if (0 > var3_int) {
                                  throw new IOException();
                                } else {
                                  if (var3_int == 0) {
                                    break L8;
                                  } else {
                                    L9: {
                                      ((gv) this).field_p = 0;
                                      var4 = 0;
                                      if (((gv) this).field_g != null) {
                                        if (((gv) this).field_g.field_s == 0) {
                                          var4 = 1;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        var4 = 10;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if (var4 > 0) {
                                        L11: {
                                          var5 = -((gv) this).field_h.field_h + var4;
                                          if (var3_int >= var5) {
                                            break L11;
                                          } else {
                                            var5 = var3_int;
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          ((gv) this).field_t.a(0, ((gv) this).field_h.field_h, ((gv) this).field_h.field_g, var5);
                                          if (0 != ((gv) this).field_d) {
                                            var6 = 0;
                                            L13: while (true) {
                                              if (var5 <= var6) {
                                                break L12;
                                              } else {
                                                ((gv) this).field_h.field_g[var6 + ((gv) this).field_h.field_h] = (byte)kha.b((int) ((gv) this).field_h.field_g[var6 + ((gv) this).field_h.field_h], (int) ((gv) this).field_d);
                                                var6++;
                                                continue L13;
                                              }
                                            }
                                          } else {
                                            break L12;
                                          }
                                        }
                                        ((gv) this).field_h.field_h = ((gv) this).field_h.field_h + var5;
                                        if (var4 > ((gv) this).field_h.field_h) {
                                          break L10;
                                        } else {
                                          if (((gv) this).field_g != null) {
                                            if (((gv) this).field_g.field_s != 0) {
                                              throw new IOException();
                                            } else {
                                              if (((gv) this).field_h.field_g[0] != -1) {
                                                ((gv) this).field_g = null;
                                                break L10;
                                              } else {
                                                ((gv) this).field_g.field_s = 1;
                                                ((gv) this).field_h.field_h = 0;
                                                break L10;
                                              }
                                            }
                                          } else {
                                            L14: {
                                              ((gv) this).field_h.field_h = 0;
                                              var6 = ((gv) this).field_h.h(255);
                                              var7 = ((gv) this).field_h.e(105);
                                              var8 = ((gv) this).field_h.h(255);
                                              var9 = ((gv) this).field_h.e(-60);
                                              var10 = 127 & var8;
                                              if ((128 & var8) == 0) {
                                                stackOut_58_0 = 0;
                                                stackIn_59_0 = stackOut_58_0;
                                                break L14;
                                              } else {
                                                stackOut_57_0 = 1;
                                                stackIn_59_0 = stackOut_57_0;
                                                break L14;
                                              }
                                            }
                                            L15: {
                                              var11 = stackIn_59_0;
                                              var12 = ((long)var6 << 32) + (long)var7;
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (qqa) (Object) ((gv) this).field_k.b((byte) 38);
                                                L16: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if (~var14_ref.field_j != ~var12) {
                                                      var14_ref = (qqa) (Object) ((gv) this).field_k.c(28);
                                                      continue L16;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (qqa) (Object) ((gv) this).field_m.b((byte) 38);
                                                L17: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if (~var14_ref.field_j == ~var12) {
                                                      break L15;
                                                    } else {
                                                      var14_ref = (qqa) (Object) ((gv) this).field_m.c(28);
                                                      continue L17;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L18: {
                                                if (var10 != 0) {
                                                  stackOut_74_0 = 9;
                                                  stackIn_75_0 = stackOut_74_0;
                                                  break L18;
                                                } else {
                                                  stackOut_73_0 = 5;
                                                  stackIn_75_0 = stackOut_73_0;
                                                  break L18;
                                                }
                                              }
                                              var15 = stackIn_75_0;
                                              ((gv) this).field_g = var14_ref;
                                              ((gv) this).field_g.field_r = new uia(var9 + var15 - -((gv) this).field_g.field_q);
                                              ((gv) this).field_g.field_r.i(var10, 0);
                                              ((gv) this).field_g.field_r.a(var9, (byte) 119);
                                              ((gv) this).field_h.field_h = 0;
                                              ((gv) this).field_g.field_s = 10;
                                              break L10;
                                            }
                                          }
                                        }
                                      } else {
                                        L19: {
                                          var5 = ((gv) this).field_g.field_r.field_g.length - ((gv) this).field_g.field_q;
                                          var6 = -((gv) this).field_g.field_s + 512;
                                          if (var5 + -((gv) this).field_g.field_r.field_h >= var6) {
                                            break L19;
                                          } else {
                                            var6 = -((gv) this).field_g.field_r.field_h + var5;
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          if (var6 <= var3_int) {
                                            break L20;
                                          } else {
                                            var6 = var3_int;
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          ((gv) this).field_t.a(0, ((gv) this).field_g.field_r.field_h, ((gv) this).field_g.field_r.field_g, var6);
                                          if (((gv) this).field_d != 0) {
                                            var7 = 0;
                                            L22: while (true) {
                                              if (var7 >= var6) {
                                                break L21;
                                              } else {
                                                ((gv) this).field_g.field_r.field_g[((gv) this).field_g.field_r.field_h - -var7] = (byte)kha.b((int) ((gv) this).field_g.field_r.field_g[((gv) this).field_g.field_r.field_h + var7], (int) ((gv) this).field_d);
                                                var7++;
                                                continue L22;
                                              }
                                            }
                                          } else {
                                            break L21;
                                          }
                                        }
                                        ((gv) this).field_g.field_s = ((gv) this).field_g.field_s + var6;
                                        ((gv) this).field_g.field_r.field_h = ((gv) this).field_g.field_r.field_h + var6;
                                        if (var5 != ((gv) this).field_g.field_r.field_h) {
                                          if (((gv) this).field_g.field_s != 512) {
                                            break L10;
                                          } else {
                                            ((gv) this).field_g.field_s = 0;
                                            break L10;
                                          }
                                        } else {
                                          ((gv) this).field_g.c(-7975);
                                          ((gv) this).field_g.field_m = false;
                                          ((gv) this).field_g = null;
                                          break L10;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                            L23: {
                              if (param0 > 26) {
                                break L23;
                              } else {
                                gv.a(false);
                                break L23;
                              }
                            }
                            stackOut_84_0 = 1;
                            stackIn_85_0 = stackOut_84_0;
                            break L4;
                          }
                        } else {
                          ((gv) this).field_o.field_h = 0;
                          ((gv) this).field_o.i(0, 0);
                          ((gv) this).field_o.a(true, var2_ref.field_j);
                          ((gv) this).field_t.a(((gv) this).field_o.field_g, 0, ((gv) this).field_o.field_g.length, 101);
                          ((gv) this).field_k.a((od) (Object) var2_ref, (byte) -99);
                          var2_ref = (qqa) (Object) ((gv) this).field_c.c(28);
                          continue L6;
                        }
                      }
                    } else {
                      ((gv) this).field_o.field_h = 0;
                      ((gv) this).field_o.i(1, 0);
                      ((gv) this).field_o.a(true, var2_ref.field_j);
                      ((gv) this).field_t.a(((gv) this).field_o.field_g, 0, ((gv) this).field_o.field_g.length, 119);
                      ((gv) this).field_m.a((od) (Object) var2_ref, (byte) -100);
                      var2_ref = (qqa) (Object) ((gv) this).field_e.c(28);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    ((gv) this).field_t.a((byte) 105);
                    break L24;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L25: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L25;
                  }
                }
                L26: {
                  ((gv) this).field_t = null;
                  ((gv) this).field_n = -2;
                  ((gv) this).field_a = ((gv) this).field_a + 1;
                  if (((gv) this).f(-3) != 0) {
                    break L26;
                  } else {
                    if (((gv) this).a((byte) 78) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_85_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void e(int param0) {
        try {
            ((gv) this).field_t.a((byte) 105);
        } catch (Exception exception) {
        }
        ((gv) this).field_t = null;
        ((gv) this).field_a = ((gv) this).field_a + 1;
        ((gv) this).field_n = param0;
        ((gv) this).field_d = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    private final void g(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != ((gv) this).field_t) {
              try {
                L0: {
                  L1: {
                    if (param0 <= -48) {
                      break L1;
                    } else {
                      boolean discarded$3 = ((gv) this).c(21);
                      break L1;
                    }
                  }
                  ((gv) this).field_o.field_h = 0;
                  ((gv) this).field_o.i(6, 0);
                  ((gv) this).field_o.h(-86, 3);
                  ((gv) this).field_o.f(-1477662136, 0);
                  ((gv) this).field_t.a(((gv) this).field_o.field_g, 0, ((gv) this).field_o.field_g.length, 118);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((gv) this).field_t.a((byte) 105);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((gv) this).field_t = null;
                  ((gv) this).field_n = -2;
                  ((gv) this).field_a = ((gv) this).field_a + 1;
                  break L2;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "You unlocked a new character!";
        field_r = "<%0> would need a rating of <%1> to play with the current options.";
        field_q = new int[8192];
    }
}

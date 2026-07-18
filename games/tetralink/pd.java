/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pd extends th {
    private fl field_s;
    static String field_r;
    static String[][] field_t;

    final void b(int param0) {
        try {
            ((pd) this).field_s.d(-15488);
        } catch (Exception exception) {
        }
        ((pd) this).field_h = ((pd) this).field_h + 1;
        if (param0 != 0) {
            return;
        }
        ((pd) this).field_d = -1;
        ((pd) this).field_s = null;
        ((pd) this).field_n = (byte)(int)(255.0 * Math.random() + 1.0);
    }

    final boolean a(boolean param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            rh var2_ref = null;
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
            rh var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_44_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_83_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_82_0 = 0;
            L0: {
              var16 = TetraLink.field_J;
              if (((pd) this).field_s == null) {
                break L0;
              } else {
                L1: {
                  var2_long = k.a(0);
                  var4 = (int)(-((pd) this).field_f + var2_long);
                  ((pd) this).field_f = var2_long;
                  if (var4 > 200) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((pd) this).field_a = ((pd) this).field_a + var4;
                if (((pd) this).field_a > 30000) {
                  try {
                    L2: {
                      ((pd) this).field_s.d(-15488);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((pd) this).field_s = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (null != ((pd) this).field_s) {
              try {
                L4: {
                  ((pd) this).field_s.a(100);
                  var2_ref = (rh) (Object) ((pd) this).field_k.a((byte) 90);
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (rh) (Object) ((pd) this).field_o.a((byte) -95);
                      L6: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L7: while (true) {
                            L8: {
                              if (var2_int >= 100) {
                                break L8;
                              } else {
                                var3_int = ((pd) this).field_s.f(0);
                                if (var3_int >= 0) {
                                  if (var3_int == 0) {
                                    break L8;
                                  } else {
                                    L9: {
                                      ((pd) this).field_a = 0;
                                      var4 = 0;
                                      if (null != ((pd) this).field_q) {
                                        if (((pd) this).field_q.field_I != 0) {
                                          break L9;
                                        } else {
                                          var4 = 1;
                                          break L9;
                                        }
                                      } else {
                                        var4 = 10;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if (var4 <= 0) {
                                        L11: {
                                          var5 = -((pd) this).field_q.field_H + ((pd) this).field_q.field_K.field_u.length;
                                          var6 = 512 - ((pd) this).field_q.field_I;
                                          if (-((pd) this).field_q.field_K.field_t + var5 < var6) {
                                            var6 = -((pd) this).field_q.field_K.field_t + var5;
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
                                          ((pd) this).field_s.a(((pd) this).field_q.field_K.field_t, var6, ((pd) this).field_q.field_K.field_u, 0);
                                          if (0 == ((pd) this).field_n) {
                                            break L13;
                                          } else {
                                            var7 = 0;
                                            L14: while (true) {
                                              if (var7 >= var6) {
                                                break L13;
                                              } else {
                                                ((pd) this).field_q.field_K.field_u[var7 + ((pd) this).field_q.field_K.field_t] = (byte)oj.a((int) ((pd) this).field_q.field_K.field_u[var7 + ((pd) this).field_q.field_K.field_t], (int) ((pd) this).field_n);
                                                var7++;
                                                continue L14;
                                              }
                                            }
                                          }
                                        }
                                        ((pd) this).field_q.field_K.field_t = ((pd) this).field_q.field_K.field_t + var6;
                                        ((pd) this).field_q.field_I = ((pd) this).field_q.field_I + var6;
                                        if (var5 != ((pd) this).field_q.field_K.field_t) {
                                          if (((pd) this).field_q.field_I != 512) {
                                            break L10;
                                          } else {
                                            ((pd) this).field_q.field_I = 0;
                                            break L10;
                                          }
                                        } else {
                                          ((pd) this).field_q.e(0);
                                          ((pd) this).field_q.field_v = false;
                                          ((pd) this).field_q = null;
                                          break L10;
                                        }
                                      } else {
                                        L15: {
                                          var5 = -((pd) this).field_m.field_t + var4;
                                          if (var5 <= var3_int) {
                                            break L15;
                                          } else {
                                            var5 = var3_int;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          ((pd) this).field_s.a(((pd) this).field_m.field_t, var5, ((pd) this).field_m.field_u, 0);
                                          if (((pd) this).field_n == 0) {
                                            break L16;
                                          } else {
                                            var6 = 0;
                                            L17: while (true) {
                                              if (var6 >= var5) {
                                                break L16;
                                              } else {
                                                ((pd) this).field_m.field_u[((pd) this).field_m.field_t + var6] = (byte)oj.a((int) ((pd) this).field_m.field_u[((pd) this).field_m.field_t + var6], (int) ((pd) this).field_n);
                                                var6++;
                                                continue L17;
                                              }
                                            }
                                          }
                                        }
                                        ((pd) this).field_m.field_t = ((pd) this).field_m.field_t + var5;
                                        if (var4 <= ((pd) this).field_m.field_t) {
                                          if (((pd) this).field_q != null) {
                                            if (((pd) this).field_q.field_I != 0) {
                                              throw new IOException();
                                            } else {
                                              if (((pd) this).field_m.field_u[0] != -1) {
                                                ((pd) this).field_q = null;
                                                break L10;
                                              } else {
                                                ((pd) this).field_q.field_I = 1;
                                                ((pd) this).field_m.field_t = 0;
                                                break L10;
                                              }
                                            }
                                          } else {
                                            L18: {
                                              ((pd) this).field_m.field_t = 0;
                                              var6 = ((pd) this).field_m.d((byte) -99);
                                              var7 = ((pd) this).field_m.f(104);
                                              var8 = ((pd) this).field_m.d((byte) -99);
                                              var9 = ((pd) this).field_m.f(-125);
                                              var10 = 127 & var8;
                                              if (0 == (128 & var8)) {
                                                stackOut_43_0 = 0;
                                                stackIn_44_0 = stackOut_43_0;
                                                break L18;
                                              } else {
                                                stackOut_42_0 = 1;
                                                stackIn_44_0 = stackOut_42_0;
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              var11 = stackIn_44_0;
                                              var12 = ((long)var6 << 32) + (long)var7;
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (rh) (Object) ((pd) this).field_c.a((byte) -109);
                                                L20: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if (var12 == var14_ref.field_n) {
                                                      break L19;
                                                    } else {
                                                      var14_ref = (rh) (Object) ((pd) this).field_c.a(param0);
                                                      continue L20;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (rh) (Object) ((pd) this).field_j.a((byte) -93);
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if (~var14_ref.field_n != ~var12) {
                                                      var14_ref = (rh) (Object) ((pd) this).field_j.a(false);
                                                      continue L21;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L22: {
                                                if (var10 != 0) {
                                                  stackOut_59_0 = 9;
                                                  stackIn_60_0 = stackOut_59_0;
                                                  break L22;
                                                } else {
                                                  stackOut_58_0 = 5;
                                                  stackIn_60_0 = stackOut_58_0;
                                                  break L22;
                                                }
                                              }
                                              var15 = stackIn_60_0;
                                              ((pd) this).field_q = var14_ref;
                                              ((pd) this).field_q.field_K = new bh(var15 + (var9 - -((pd) this).field_q.field_H));
                                              ((pd) this).field_q.field_K.a(var10, false);
                                              ((pd) this).field_q.field_K.d(var9, (byte) -124);
                                              ((pd) this).field_m.field_t = 0;
                                              ((pd) this).field_q.field_I = 10;
                                              break L10;
                                            }
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L7;
                                  }
                                } else {
                                  throw new IOException();
                                }
                              }
                            }
                            L23: {
                              if (!param0) {
                                break L23;
                              } else {
                                pd.e(81);
                                break L23;
                              }
                            }
                            stackOut_82_0 = 1;
                            stackIn_83_0 = stackOut_82_0;
                            break L4;
                          }
                        } else {
                          ((pd) this).field_b.field_t = 0;
                          ((pd) this).field_b.a(0, false);
                          ((pd) this).field_b.a(var2_ref.field_n, true);
                          ((pd) this).field_s.a(true, ((pd) this).field_b.field_u.length, ((pd) this).field_b.field_u, 0);
                          ((pd) this).field_c.a((gb) (Object) var2_ref, 0);
                          var2_ref = (rh) (Object) ((pd) this).field_o.a(false);
                          continue L6;
                        }
                      }
                    } else {
                      ((pd) this).field_b.field_t = 0;
                      ((pd) this).field_b.a(1, false);
                      ((pd) this).field_b.a(var2_ref.field_n, true);
                      ((pd) this).field_s.a(true, ((pd) this).field_b.field_u.length, ((pd) this).field_b.field_u, 0);
                      ((pd) this).field_j.a((gb) (Object) var2_ref, 0);
                      var2_ref = (rh) (Object) ((pd) this).field_k.a(false);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    ((pd) this).field_s.d(-15488);
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
                  ((pd) this).field_h = ((pd) this).field_h + 1;
                  ((pd) this).field_d = -2;
                  ((pd) this).field_s = null;
                  if (((pd) this).c((byte) -114) != 0) {
                    break L26;
                  } else {
                    if (((pd) this).d(20) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_83_0 != 0;
            } else {
              if (0 != ((pd) this).c((byte) -61)) {
                return false;
              } else {
                if (((pd) this).d(20) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(int param0) {
        field_t = null;
        field_r = null;
        if (param0 != 0) {
            pd.b(true);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final void a(byte param0) {
        if (param0 != 80) {
            field_r = null;
        }
        if (((pd) this).field_s != null) {
            ((pd) this).field_s.d(-15488);
        }
    }

    final void a(Object param0, boolean param1, byte param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            rh var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            var6 = TetraLink.field_J;
            try {
              L0: {
                L1: {
                  if (((pd) this).field_s == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        ((pd) this).field_s.d(-15488);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((pd) this).field_s = null;
                    break L1;
                  }
                }
                L4: {
                  ((pd) this).field_s = (fl) param0;
                  this.c(false);
                  this.a(false, param1);
                  if (param2 <= -73) {
                    break L4;
                  } else {
                    field_r = null;
                    break L4;
                  }
                }
                ((pd) this).field_m.field_t = 0;
                ((pd) this).field_q = null;
                L5: while (true) {
                  var4_ref3 = (rh) (Object) ((pd) this).field_j.c(-15464);
                  if (var4_ref3 == null) {
                    L6: while (true) {
                      var4_ref3 = (rh) (Object) ((pd) this).field_c.c(-15464);
                      if (var4_ref3 == null) {
                        L7: {
                          if (((pd) this).field_n == 0) {
                            break L7;
                          } else {
                            {
                              L8: {
                                ((pd) this).field_b.field_t = 0;
                                ((pd) this).field_b.a(4, false);
                                ((pd) this).field_b.a((int) ((pd) this).field_n, false);
                                ((pd) this).field_b.d(0, (byte) -124);
                                ((pd) this).field_s.a(true, ((pd) this).field_b.field_u.length, ((pd) this).field_b.field_u, 0);
                                break L8;
                              }
                            }
                            break L7;
                          }
                        }
                        ((pd) this).field_a = 0;
                        ((pd) this).field_f = k.a(0);
                        break L0;
                      } else {
                        ((pd) this).field_o.a((gb) (Object) var4_ref3, 0);
                        continue L6;
                      }
                    }
                  } else {
                    ((pd) this).field_k.a((gb) (Object) var4_ref3, 0);
                    continue L5;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_23_0 = (RuntimeException) var4_ref2;
                stackOut_23_1 = new StringBuilder().append("pd.B(");
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (param0 == null) {
                  stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                  stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                  stackOut_25_2 = "null";
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  break L12;
                } else {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "{...}";
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  break L12;
                }
              }
              throw oi.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(boolean param0) {
        uh.field_f = new hl(0L, (hl) null);
        if (!(!kj.field_b)) {
            uh.field_f.a((byte) -108, uh.field_e);
        }
        uh.field_f.a((byte) -112, hh.field_c);
        gg.field_j = new mk(nm.field_v, uh.field_f);
        if (param0) {
            pd.e(-120);
        }
        hn.field_P = new hl(0L, (hl) null);
        hn.field_P.a((byte) -92, (hl) (Object) gg.field_j.field_g);
        hn.field_P.a((byte) 68, gg.field_i);
        db.a(5);
    }

    private final void c(boolean param0) {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null == ((pd) this).field_s) {
              return;
            } else {
              {
                L0: {
                  ((pd) this).field_b.field_t = 0;
                  ((pd) this).field_b.a(6, false);
                  ((pd) this).field_b.a(3, (byte) -66);
                  ((pd) this).field_b.b(0, false);
                  ((pd) this).field_s.a(true, ((pd) this).field_b.field_u.length, ((pd) this).field_b.field_u, 0);
                  break L0;
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

    private final void a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            bh stackIn_4_0 = null;
            bh stackIn_5_0 = null;
            bh stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            Throwable decompiledCaughtException = null;
            bh stackOut_3_0 = null;
            bh stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            bh stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            if (((pd) this).field_s == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((pd) this).field_s = null;
                    ((pd) this).field_b.field_t = 0;
                    stackOut_3_0 = ((pd) this).field_b;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (!param1) {
                      stackOut_5_0 = (bh) (Object) stackIn_5_0;
                      stackOut_5_1 = 3;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L1;
                    } else {
                      stackOut_4_0 = (bh) (Object) stackIn_4_0;
                      stackOut_4_1 = 2;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L1;
                    }
                  }
                  ((bh) (Object) stackIn_6_0).a(stackIn_6_1, false);
                  ((pd) this).field_b.a(0L, true);
                  ((pd) this).field_s.a(true, ((pd) this).field_b.field_u.length, ((pd) this).field_b.field_u, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((pd) this).field_s.d(-15488);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((pd) this).field_s = null;
                  ((pd) this).field_h = ((pd) this).field_h + 1;
                  ((pd) this).field_d = -2;
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

    public pd() {
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ag extends wj {
    static go field_r;
    static String field_p;
    private nn field_q;

    public static void c(boolean param0) {
        field_p = null;
        field_r = null;
    }

    private final void f(int param0) {
        try {
            IOException var2 = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != ((ag) this).field_q) {
              try {
                L0: {
                  L1: {
                    ((ag) this).field_b.field_l = 0;
                    ((ag) this).field_b.f(111, 6);
                    ((ag) this).field_b.a(3, false);
                    ((ag) this).field_b.b(-652561784, 0);
                    ((ag) this).field_q.a(((ag) this).field_b.field_i.length, ((ag) this).field_b.field_i, 0, 1);
                    if (param0 > 5) {
                      break L1;
                    } else {
                      field_p = null;
                      break L1;
                    }
                  }
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((ag) this).field_q.d(21135);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((ag) this).field_f = -2;
                  ((ag) this).field_c = ((ag) this).field_c + 1;
                  ((ag) this).field_q = null;
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

    private final void a(boolean param0, int param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            th stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            th stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            th stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            int stackIn_5_2 = 0;
            Throwable decompiledCaughtException = null;
            th stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            th stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            th stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            if (null != ((ag) this).field_q) {
              try {
                L0: {
                  L1: {
                    ((ag) this).field_b.field_l = 0;
                    stackOut_2_0 = ((ag) this).field_b;
                    stackOut_2_1 = 111;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    if (!param0) {
                      stackOut_4_0 = (th) (Object) stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 3;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      stackIn_5_2 = stackOut_4_2;
                      break L1;
                    } else {
                      stackOut_3_0 = (th) (Object) stackIn_3_0;
                      stackOut_3_1 = stackIn_3_1;
                      stackOut_3_2 = 2;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      stackIn_5_2 = stackOut_3_2;
                      break L1;
                    }
                  }
                  ((th) (Object) stackIn_5_0).f(stackIn_5_1, stackIn_5_2);
                  ((ag) this).field_b.b(-483502376, 0L);
                  ((ag) this).field_q.a(((ag) this).field_b.field_i.length, ((ag) this).field_b.field_i, 0, 1);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((ag) this).field_q.d(21135);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((ag) this).field_f = -2;
                  ((ag) this).field_q = null;
                  ((ag) this).field_c = ((ag) this).field_c + 1;
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

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            cc var4_ref3 = null;
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
            var6 = HoldTheLine.field_D;
            try {
              L0: {
                L1: {
                  if (((ag) this).field_q != null) {
                    try {
                      L2: {
                        ((ag) this).field_q.d(param2 ^ 21147);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((ag) this).field_q = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((ag) this).field_q = (nn) param0;
                this.f(param2 + 83);
                this.a(param1, -11526);
                ((ag) this).field_k.field_l = 0;
                ((ag) this).field_m = null;
                L4: while (true) {
                  var4_ref3 = (cc) (Object) ((ag) this).field_i.a((byte) 85);
                  if (var4_ref3 == null) {
                    L5: {
                      if (param2 == 20) {
                        break L5;
                      } else {
                        field_r = null;
                        break L5;
                      }
                    }
                    L6: while (true) {
                      var4_ref3 = (cc) (Object) ((ag) this).field_e.a((byte) 84);
                      if (var4_ref3 == null) {
                        L7: {
                          if (((ag) this).field_l == 0) {
                            break L7;
                          } else {
                            {
                              L8: {
                                ((ag) this).field_b.field_l = 0;
                                ((ag) this).field_b.f(111, 4);
                                ((ag) this).field_b.f(111, (int) ((ag) this).field_l);
                                ((ag) this).field_b.a((byte) -58, 0);
                                ((ag) this).field_q.a(((ag) this).field_b.field_i.length, ((ag) this).field_b.field_i, 0, 1);
                                break L8;
                              }
                            }
                            break L7;
                          }
                        }
                        ((ag) this).field_h = 0;
                        ((ag) this).field_j = bb.b(-1);
                        break L0;
                      } else {
                        ((ag) this).field_g.a(-35, (ln) (Object) var4_ref3);
                        continue L6;
                      }
                    }
                  } else {
                    ((ag) this).field_d.a(-85, (ln) (Object) var4_ref3);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) var4_ref2;
                stackOut_24_1 = new StringBuilder().append("ag.H(");
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
              throw kk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, boolean param1, String param2) {
        try {
            if (!(sb.field_c == null)) {
                sb.field_c.h((byte) -98);
            }
            lh.field_a = new vg(param2, param0, false, true, true);
            sm.field_c.a((n) (Object) lh.field_a, (byte) -99);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ag.D(" + (param0 != null ? "{...}" : "null") + ',' + false + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            int var2_int = 0;
            Exception var3 = null;
            cc var3_ref = null;
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
            int var12 = 0;
            long var13 = 0L;
            Object var15 = null;
            cc var15_ref = null;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            int stackIn_44_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_78_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_77_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_56_0 = 0;
            L0: {
              var17 = HoldTheLine.field_D;
              if (((ag) this).field_q != null) {
                L1: {
                  var2_long = bb.b(-1);
                  var4 = (int)(-((ag) this).field_j + var2_long);
                  ((ag) this).field_j = var2_long;
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((ag) this).field_h = ((ag) this).field_h + var4;
                if (((ag) this).field_h <= 30000) {
                  break L0;
                } else {
                  try {
                    L2: {
                      ((ag) this).field_q.d(21135);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((ag) this).field_q = null;
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (null == ((ag) this).field_q) {
              L4: {
                if (((ag) this).b(20) != 0) {
                  break L4;
                } else {
                  if (((ag) this).b(false) != 0) {
                    break L4;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              try {
                L5: {
                  var2_int = 51 % ((param0 - 24) / 56);
                  ((ag) this).field_q.c(true);
                  var3_ref = (cc) (Object) ((ag) this).field_d.c(105);
                  L6: while (true) {
                    if (var3_ref == null) {
                      var3_ref = (cc) (Object) ((ag) this).field_g.c(79);
                      L7: while (true) {
                        if (var3_ref == null) {
                          var3_int = 0;
                          L8: while (true) {
                            if (var3_int >= 100) {
                              stackOut_77_0 = 1;
                              stackIn_78_0 = stackOut_77_0;
                              break L5;
                            } else {
                              var4 = ((ag) this).field_q.b(false);
                              if (var4 >= 0) {
                                if (var4 != 0) {
                                  L9: {
                                    ((ag) this).field_h = 0;
                                    var5 = 0;
                                    if (null != ((ag) this).field_m) {
                                      if (((ag) this).field_m.field_x != 0) {
                                        break L9;
                                      } else {
                                        var5 = 1;
                                        break L9;
                                      }
                                    } else {
                                      var5 = 10;
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    if (var5 <= 0) {
                                      L11: {
                                        var6 = -((ag) this).field_m.field_B + ((ag) this).field_m.field_z.field_i.length;
                                        var7 = -((ag) this).field_m.field_x + 512;
                                        if (~(-((ag) this).field_m.field_z.field_l + var6) <= ~var7) {
                                          break L11;
                                        } else {
                                          var7 = var6 + -((ag) this).field_m.field_z.field_l;
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (var4 >= var7) {
                                          break L12;
                                        } else {
                                          var7 = var4;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        ((ag) this).field_q.a(((ag) this).field_m.field_z.field_i, var7, ((ag) this).field_m.field_z.field_l, -54);
                                        if (0 == ((ag) this).field_l) {
                                          break L13;
                                        } else {
                                          var18 = 0;
                                          var8 = var18;
                                          L14: while (true) {
                                            if (var7 <= var18) {
                                              break L13;
                                            } else {
                                              ((ag) this).field_m.field_z.field_i[((ag) this).field_m.field_z.field_l + var18] = (byte)wb.a((int) ((ag) this).field_m.field_z.field_i[((ag) this).field_m.field_z.field_l + var18], (int) ((ag) this).field_l);
                                              var18++;
                                              continue L14;
                                            }
                                          }
                                        }
                                      }
                                      ((ag) this).field_m.field_z.field_l = ((ag) this).field_m.field_z.field_l + var7;
                                      ((ag) this).field_m.field_x = ((ag) this).field_m.field_x + var7;
                                      if (var6 != ((ag) this).field_m.field_z.field_l) {
                                        if (((ag) this).field_m.field_x != 512) {
                                          break L10;
                                        } else {
                                          ((ag) this).field_m.field_x = 0;
                                          break L10;
                                        }
                                      } else {
                                        ((ag) this).field_m.a((byte) -42);
                                        ((ag) this).field_m.field_u = false;
                                        ((ag) this).field_m = null;
                                        break L10;
                                      }
                                    } else {
                                      L15: {
                                        var6 = -((ag) this).field_k.field_l + var5;
                                        if (var6 <= var4) {
                                          break L15;
                                        } else {
                                          var6 = var4;
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        ((ag) this).field_q.a(((ag) this).field_k.field_i, var6, ((ag) this).field_k.field_l, 14);
                                        if (0 == ((ag) this).field_l) {
                                          break L16;
                                        } else {
                                          var7 = 0;
                                          L17: while (true) {
                                            if (var6 <= var7) {
                                              break L16;
                                            } else {
                                              ((ag) this).field_k.field_i[var7 + ((ag) this).field_k.field_l] = (byte)wb.a((int) ((ag) this).field_k.field_i[var7 + ((ag) this).field_k.field_l], (int) ((ag) this).field_l);
                                              var7++;
                                              continue L17;
                                            }
                                          }
                                        }
                                      }
                                      ((ag) this).field_k.field_l = ((ag) this).field_k.field_l + var6;
                                      if (~var5 < ~((ag) this).field_k.field_l) {
                                        break L10;
                                      } else {
                                        if (null == ((ag) this).field_m) {
                                          L18: {
                                            ((ag) this).field_k.field_l = 0;
                                            var7 = ((ag) this).field_k.f((byte) -105);
                                            var8 = ((ag) this).field_k.a(94);
                                            var9 = ((ag) this).field_k.f((byte) -55);
                                            var10 = ((ag) this).field_k.a(127);
                                            var11 = 127 & var9;
                                            if ((128 & var9) == 0) {
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
                                            var12 = stackIn_44_0;
                                            var13 = ((long)var7 << 32) + (long)var8;
                                            var15 = null;
                                            if (var12 == 0) {
                                              var15_ref = (cc) (Object) ((ag) this).field_i.c(96);
                                              L20: while (true) {
                                                if (var15_ref == null) {
                                                  break L19;
                                                } else {
                                                  if (var13 == var15_ref.field_i) {
                                                    break L19;
                                                  } else {
                                                    var15_ref = (cc) (Object) ((ag) this).field_i.e(57);
                                                    continue L20;
                                                  }
                                                }
                                              }
                                            } else {
                                              var15_ref = (cc) (Object) ((ag) this).field_e.c(71);
                                              L21: while (true) {
                                                if (var15_ref == null) {
                                                  break L19;
                                                } else {
                                                  if (var13 == var15_ref.field_i) {
                                                    break L19;
                                                  } else {
                                                    var15_ref = (cc) (Object) ((ag) this).field_e.e(95);
                                                    continue L21;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var15_ref != null) {
                                            L22: {
                                              if (0 != var11) {
                                                stackOut_57_0 = 9;
                                                stackIn_58_0 = stackOut_57_0;
                                                break L22;
                                              } else {
                                                stackOut_56_0 = 5;
                                                stackIn_58_0 = stackOut_56_0;
                                                break L22;
                                              }
                                            }
                                            var16 = stackIn_58_0;
                                            ((ag) this).field_m = var15_ref;
                                            ((ag) this).field_m.field_z = new th(((ag) this).field_m.field_B + var10 + var16);
                                            ((ag) this).field_m.field_z.f(111, var11);
                                            ((ag) this).field_m.field_z.a((byte) -58, var10);
                                            ((ag) this).field_k.field_l = 0;
                                            ((ag) this).field_m.field_x = 10;
                                            break L10;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (((ag) this).field_m.field_x != 0) {
                                            throw new IOException();
                                          } else {
                                            if (((ag) this).field_k.field_i[0] == -1) {
                                              ((ag) this).field_m.field_x = 1;
                                              ((ag) this).field_k.field_l = 0;
                                              break L10;
                                            } else {
                                              ((ag) this).field_m = null;
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var3_int++;
                                  continue L8;
                                } else {
                                  return true;
                                }
                              } else {
                                throw new IOException();
                              }
                            }
                          }
                        } else {
                          ((ag) this).field_b.field_l = 0;
                          ((ag) this).field_b.f(111, 0);
                          ((ag) this).field_b.b(-483502376, var3_ref.field_i);
                          ((ag) this).field_q.a(((ag) this).field_b.field_i.length, ((ag) this).field_b.field_i, 0, 1);
                          ((ag) this).field_e.a(126, (ln) (Object) var3_ref);
                          var3_ref = (cc) (Object) ((ag) this).field_g.e(-54);
                          continue L7;
                        }
                      }
                    } else {
                      ((ag) this).field_b.field_l = 0;
                      ((ag) this).field_b.f(111, 1);
                      ((ag) this).field_b.b(-483502376, var3_ref.field_i);
                      ((ag) this).field_q.a(((ag) this).field_b.field_i.length, ((ag) this).field_b.field_i, 0, 1);
                      ((ag) this).field_i.a(123, (ln) (Object) var3_ref);
                      var3_ref = (cc) (Object) ((ag) this).field_d.e(-100);
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((ag) this).field_q.d(21135);
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
                  ((ag) this).field_f = -2;
                  ((ag) this).field_q = null;
                  ((ag) this).field_c = ((ag) this).field_c + 1;
                  if (((ag) this).b(126) != 0) {
                    break L25;
                  } else {
                    if (((ag) this).b(false) == 0) {
                      return true;
                    } else {
                      break L25;
                    }
                  }
                }
                return false;
              }
              return stackIn_78_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (160 == param1) {
              break L1;
            } else {
              if (param1 == 32) {
                break L1;
              } else {
                if (95 == param1) {
                  break L1;
                } else {
                  if (45 != param1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final void e(int param0) {
        if (param0 != 1) {
            ((ag) this).field_q = null;
        }
        if (!(null == ((ag) this).field_q)) {
            ((ag) this).field_q.d(21135);
        }
    }

    public ag() {
    }

    final void a(boolean param0) {
        try {
            ((ag) this).field_q.d(21135);
        } catch (Exception exception) {
        }
        ((ag) this).field_c = ((ag) this).field_c + 1;
        ((ag) this).field_f = -1;
        ((ag) this).field_q = null;
        if (param0) {
            boolean discarded$0 = ((ag) this).a((byte) -72);
        }
        ((ag) this).field_l = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "<%0> kills remaining.";
    }
}

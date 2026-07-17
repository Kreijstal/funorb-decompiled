/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ae extends bp {
    static String field_w;
    static String field_v;
    private hi field_t;
    static String field_x;
    static String field_s;
    static kl field_u;

    final void c(int param0) {
        if (param0 != -5758) {
            this.d((byte) 55);
        }
        if (null != ((ae) this).field_t) {
            ((ae) this).field_t.c((byte) -45);
        }
    }

    final static void a(int param0, int param1) {
        bv var2 = vl.field_n;
        var2.h(32161, param1);
        var2.b(1, 2);
        var2.b(1, 4);
        int discarded$0 = 3;
        var2.b(1, gm.f());
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4 = null;
            RuntimeException var4_ref = null;
            int var4_int = 0;
            IOException var5 = null;
            jf var5_ref = null;
            Exception var6 = null;
            int var7 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            var7 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == ((ae) this).field_t) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        ((ae) this).field_t.c((byte) -45);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((ae) this).field_t = null;
                    break L1;
                  }
                }
                ((ae) this).field_t = (hi) param0;
                this.d((byte) 116);
                this.a(82, param1);
                ((ae) this).field_a = null;
                var4_int = -66 / ((param2 - 25) / 57);
                ((ae) this).field_h.field_q = 0;
                L4: while (true) {
                  var5_ref = (jf) (Object) ((ae) this).field_n.b(11);
                  if (var5_ref == null) {
                    L5: while (true) {
                      var5_ref = (jf) (Object) ((ae) this).field_g.b(11);
                      if (var5_ref != null) {
                        ((ae) this).field_f.a((ms) (Object) var5_ref, false);
                        continue L5;
                      } else {
                        L6: {
                          if (((ae) this).field_i == 0) {
                            break L6;
                          } else {
                            {
                              L7: {
                                ((ae) this).field_o.field_q = 0;
                                ((ae) this).field_o.b(1, 4);
                                ((ae) this).field_o.b(1, (int) ((ae) this).field_i);
                                ((ae) this).field_o.a((byte) -59, 0);
                                ((ae) this).field_t.a(((ae) this).field_o.field_o, (byte) 20, 0, ((ae) this).field_o.field_o.length);
                                break L7;
                              }
                            }
                            break L6;
                          }
                        }
                        ((ae) this).field_l = 0;
                        ((ae) this).field_r = vi.b(80);
                        break L0;
                      }
                    }
                  } else {
                    ((ae) this).field_b.a((ms) (Object) var5_ref, false);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_22_0 = (RuntimeException) var4_ref;
                stackOut_22_1 = new StringBuilder().append("ae.K(");
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param0 == null) {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L11;
                } else {
                  stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                  stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                  stackOut_23_2 = "{...}";
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  break L11;
                }
              }
              throw ig.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(int param0) {
        field_s = null;
        field_v = null;
        field_u = null;
        field_x = null;
        if (param0 != -4096) {
            field_w = null;
        }
        field_w = null;
    }

    final static void a(long param0, int param1) {
        try {
            {
                Thread.sleep(param0);
            }
            if (param1 <= 3) {
                int discarded$0 = ae.b(90, 21);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ae() {
    }

    final boolean a(boolean param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            jf var2_ref = null;
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
            jf var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_60_0 = 0;
            int stackIn_76_0 = 0;
            int stackIn_85_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_59_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_75_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_84_0 = 0;
            L0: {
              var16 = ArmiesOfGielinor.field_M ? 1 : 0;
              if (null == ((ae) this).field_t) {
                break L0;
              } else {
                L1: {
                  var2_long = vi.b(-75);
                  var4 = (int)(-((ae) this).field_r + var2_long);
                  ((ae) this).field_r = var2_long;
                  if (200 < var4) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((ae) this).field_l = ((ae) this).field_l + var4;
                if (30000 < ((ae) this).field_l) {
                  try {
                    L2: {
                      ((ae) this).field_t.c((byte) -45);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((ae) this).field_t = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (((ae) this).field_t != null) {
              try {
                L4: {
                  ((ae) this).field_t.a(param0);
                  var2_ref = (jf) (Object) ((ae) this).field_b.a((byte) -117);
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (jf) (Object) ((ae) this).field_f.a((byte) -123);
                      L6: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L7: while (true) {
                            L8: {
                              if (var2_int >= 100) {
                                break L8;
                              } else {
                                var3_int = ((ae) this).field_t.d((byte) 43);
                                if (var3_int < 0) {
                                  throw new IOException();
                                } else {
                                  if (var3_int != 0) {
                                    L9: {
                                      ((ae) this).field_l = 0;
                                      var4 = 0;
                                      if (((ae) this).field_a != null) {
                                        if (((ae) this).field_a.field_F != 0) {
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
                                      if (var4 > 0) {
                                        L11: {
                                          var5 = -((ae) this).field_h.field_q + var4;
                                          if (var5 <= var3_int) {
                                            break L11;
                                          } else {
                                            var5 = var3_int;
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          ((ae) this).field_t.a(0, ((ae) this).field_h.field_q, var5, ((ae) this).field_h.field_o);
                                          if (0 != ((ae) this).field_i) {
                                            var6 = 0;
                                            L13: while (true) {
                                              if (var6 >= var5) {
                                                break L12;
                                              } else {
                                                ((ae) this).field_h.field_o[((ae) this).field_h.field_q - -var6] = (byte)kf.b((int) ((ae) this).field_h.field_o[((ae) this).field_h.field_q + var6], (int) ((ae) this).field_i);
                                                var6++;
                                                continue L13;
                                              }
                                            }
                                          } else {
                                            break L12;
                                          }
                                        }
                                        ((ae) this).field_h.field_q = ((ae) this).field_h.field_q + var5;
                                        if (var4 > ((ae) this).field_h.field_q) {
                                          break L10;
                                        } else {
                                          if (null == ((ae) this).field_a) {
                                            L14: {
                                              ((ae) this).field_h.field_q = 0;
                                              var6 = ((ae) this).field_h.k(0);
                                              var7 = ((ae) this).field_h.i(1);
                                              var8 = ((ae) this).field_h.k(0);
                                              var9 = ((ae) this).field_h.i(1);
                                              var10 = 127 & var8;
                                              if ((var8 & 128) == 0) {
                                                stackOut_59_0 = 0;
                                                stackIn_60_0 = stackOut_59_0;
                                                break L14;
                                              } else {
                                                stackOut_58_0 = 1;
                                                stackIn_60_0 = stackOut_58_0;
                                                break L14;
                                              }
                                            }
                                            L15: {
                                              var11 = stackIn_60_0;
                                              var12 = (long)var7 + ((long)var6 << 32);
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (jf) (Object) ((ae) this).field_g.a((byte) -110);
                                                L16: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if (var12 != var14_ref.field_q) {
                                                      var14_ref = (jf) (Object) ((ae) this).field_g.c(24);
                                                      continue L16;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (jf) (Object) ((ae) this).field_n.a((byte) -106);
                                                L17: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if (var12 != var14_ref.field_q) {
                                                      var14_ref = (jf) (Object) ((ae) this).field_n.c(24);
                                                      continue L17;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref != null) {
                                              L18: {
                                                ((ae) this).field_a = var14_ref;
                                                if (var10 == 0) {
                                                  stackOut_75_0 = 5;
                                                  stackIn_76_0 = stackOut_75_0;
                                                  break L18;
                                                } else {
                                                  stackOut_74_0 = 9;
                                                  stackIn_76_0 = stackOut_74_0;
                                                  break L18;
                                                }
                                              }
                                              var15 = stackIn_76_0;
                                              ((ae) this).field_a.field_E = new vh(var15 + var9 - -((ae) this).field_a.field_B);
                                              ((ae) this).field_a.field_E.b(1, var10);
                                              ((ae) this).field_a.field_E.a((byte) -77, var9);
                                              ((ae) this).field_h.field_q = 0;
                                              ((ae) this).field_a.field_F = 10;
                                              break L10;
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            if (((ae) this).field_a.field_F == 0) {
                                              if (((ae) this).field_h.field_o[0] != -1) {
                                                ((ae) this).field_a = null;
                                                break L10;
                                              } else {
                                                ((ae) this).field_a.field_F = 1;
                                                ((ae) this).field_h.field_q = 0;
                                                break L10;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        }
                                      } else {
                                        L19: {
                                          var5 = -((ae) this).field_a.field_B + ((ae) this).field_a.field_E.field_o.length;
                                          var6 = 512 + -((ae) this).field_a.field_F;
                                          if (-((ae) this).field_a.field_E.field_q + var5 >= var6) {
                                            break L19;
                                          } else {
                                            var6 = var5 - ((ae) this).field_a.field_E.field_q;
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
                                          ((ae) this).field_t.a(0, ((ae) this).field_a.field_E.field_q, var6, ((ae) this).field_a.field_E.field_o);
                                          if (0 == ((ae) this).field_i) {
                                            break L21;
                                          } else {
                                            var7 = 0;
                                            L22: while (true) {
                                              if (var6 <= var7) {
                                                break L21;
                                              } else {
                                                ((ae) this).field_a.field_E.field_o[((ae) this).field_a.field_E.field_q - -var7] = (byte)kf.b((int) ((ae) this).field_a.field_E.field_o[((ae) this).field_a.field_E.field_q + var7], (int) ((ae) this).field_i);
                                                var7++;
                                                continue L22;
                                              }
                                            }
                                          }
                                        }
                                        ((ae) this).field_a.field_F = ((ae) this).field_a.field_F + var6;
                                        ((ae) this).field_a.field_E.field_q = ((ae) this).field_a.field_E.field_q + var6;
                                        if (((ae) this).field_a.field_E.field_q == var5) {
                                          ((ae) this).field_a.c((byte) -76);
                                          ((ae) this).field_a.field_x = false;
                                          ((ae) this).field_a = null;
                                          break L10;
                                        } else {
                                          if (((ae) this).field_a.field_F == 512) {
                                            ((ae) this).field_a.field_F = 0;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            stackOut_84_0 = 1;
                            stackIn_85_0 = stackOut_84_0;
                            break L4;
                          }
                        } else {
                          ((ae) this).field_o.field_q = 0;
                          ((ae) this).field_o.b(1, 0);
                          ((ae) this).field_o.a(true, var2_ref.field_q);
                          ((ae) this).field_t.a(((ae) this).field_o.field_o, (byte) 20, 0, ((ae) this).field_o.field_o.length);
                          ((ae) this).field_g.a((ms) (Object) var2_ref, false);
                          var2_ref = (jf) (Object) ((ae) this).field_f.c(24);
                          continue L6;
                        }
                      }
                    } else {
                      ((ae) this).field_o.field_q = 0;
                      ((ae) this).field_o.b(1, 1);
                      ((ae) this).field_o.a(true, var2_ref.field_q);
                      ((ae) this).field_t.a(((ae) this).field_o.field_o, (byte) 20, 0, ((ae) this).field_o.field_o.length);
                      ((ae) this).field_n.a((ms) (Object) var2_ref, false);
                      var2_ref = (jf) (Object) ((ae) this).field_b.c(24);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((ae) this).field_t.c((byte) -45);
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
                  ((ae) this).field_p = -2;
                  ((ae) this).field_q = ((ae) this).field_q + 1;
                  ((ae) this).field_t = null;
                  if (-1 != ((ae) this).a(106)) {
                    break L25;
                  } else {
                    if (-1 == ((ae) this).b(-109)) {
                      return true;
                    } else {
                      break L25;
                    }
                  }
                }
                return false;
              }
              return stackIn_85_0 != 0;
            } else {
              if (((ae) this).a(127) != 0) {
                return false;
              } else {
                if (((ae) this).b(-110) == 0) {
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

    private final void d(byte param0) {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (param0 > 70) {
              if (null == ((ae) this).field_t) {
                return;
              } else {
                {
                  L0: {
                    ((ae) this).field_o.field_q = 0;
                    ((ae) this).field_o.b(1, 6);
                    ((ae) this).field_o.a(3, (byte) 58);
                    ((ae) this).field_o.b(true, 0);
                    ((ae) this).field_t.a(((ae) this).field_o.field_o, (byte) 20, 0, ((ae) this).field_o.field_o.length);
                    break L0;
                  }
                }
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            vh stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            vh stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            vh stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            vh stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            vh stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            vh stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            if (null != ((ae) this).field_t) {
              try {
                L0: {
                  L1: {
                    if (param0 > 5) {
                      break L1;
                    } else {
                      this.a(-74, true);
                      break L1;
                    }
                  }
                  L2: {
                    ((ae) this).field_o.field_q = 0;
                    stackOut_4_0 = ((ae) this).field_o;
                    stackOut_4_1 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (!param1) {
                      stackOut_6_0 = (vh) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = 3;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      break L2;
                    } else {
                      stackOut_5_0 = (vh) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 2;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      break L2;
                    }
                  }
                  ((vh) (Object) stackIn_7_0).b(stackIn_7_1, stackIn_7_2);
                  ((ae) this).field_o.a(true, 0L);
                  ((ae) this).field_t.a(((ae) this).field_o.field_o, (byte) 20, 0, ((ae) this).field_o.field_o.length);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      ((ae) this).field_t.c((byte) -45);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  ((ae) this).field_q = ((ae) this).field_q + 1;
                  ((ae) this).field_t = null;
                  ((ae) this).field_p = -2;
                  break L3;
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

    final static int b(int param0, int param1) {
        param0 = param0 & 8191;
        if (param1 != 100) {
            field_v = null;
        }
        if (param0 < 4096) {
            return param0 >= 2048 ? e.field_a[-param0 + 4096] : e.field_a[param0];
        }
        return param0 < 6144 ? -e.field_a[-4096 + param0] : -e.field_a[8192 - param0];
    }

    final void b(byte param0) {
        if (param0 != 4) {
            return;
        }
        try {
            ((ae) this).field_t.c((byte) -45);
        } catch (Exception exception) {
        }
        ((ae) this).field_t = null;
        ((ae) this).field_p = -1;
        ((ae) this).field_q = ((ae) this).field_q + 1;
        ((ae) this).field_i = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final static void a(byte param0, wk[] param1, wk param2) {
        try {
            vg.field_q = param1;
            vg.field_q[0].i();
            vg.field_q[1].i();
            tr.field_z = param2;
            ac.field_m = vg.field_q[0].field_v;
            cm.field_b = vg.field_q[0].field_y;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ae.N(" + 125 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "This can be used from turn <%0> onwards.";
        field_x = "Click on the gold-rimmed icons to navigate through the equipment.";
        field_v = "Show all private chat";
        field_s = "Service unavailable";
    }
}

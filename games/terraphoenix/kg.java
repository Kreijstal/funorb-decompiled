/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kg extends h {
    private tf field_p;
    static boolean field_q;
    static ci[] field_r;

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            dh stackIn_4_0 = null;
            dh stackIn_5_0 = null;
            dh stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            Throwable decompiledCaughtException = null;
            dh stackOut_3_0 = null;
            dh stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            dh stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            if (null == ((kg) this).field_p) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((kg) this).field_e.field_k = 0;
                    stackOut_3_0 = ((kg) this).field_e;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (param1) {
                      stackOut_5_0 = (dh) (Object) stackIn_5_0;
                      stackOut_5_1 = 2;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L1;
                    } else {
                      stackOut_4_0 = (dh) (Object) stackIn_4_0;
                      stackOut_4_1 = 3;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L1;
                    }
                  }
                  ((dh) (Object) stackIn_6_0).i(stackIn_6_1, -99);
                  ((kg) this).field_e.b(0L, -2108648176);
                  ((kg) this).field_p.a(((kg) this).field_e.field_i.length, 0, (byte) -97, ((kg) this).field_e.field_i);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((kg) this).field_p.a((byte) -127);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((kg) this).field_i = ((kg) this).field_i + 1;
                  ((kg) this).field_p = null;
                  ((kg) this).field_l = -2;
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

    final void a(int param0, Object param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            nh var4_ref3 = null;
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
            var6 = Terraphoenix.field_V;
            try {
              L0: {
                L1: {
                  if (null == ((kg) this).field_p) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        ((kg) this).field_p.a((byte) -127);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((kg) this).field_p = null;
                    break L1;
                  }
                }
                ((kg) this).field_p = (tf) param1;
                this.d(false);
                this.a(0, param2);
                ((kg) this).field_k = null;
                ((kg) this).field_o.field_k = 0;
                L4: while (true) {
                  var4_ref3 = (nh) (Object) ((kg) this).field_m.a((byte) -66);
                  if (var4_ref3 == null) {
                    L5: while (true) {
                      var4_ref3 = (nh) (Object) ((kg) this).field_g.a((byte) -61);
                      if (var4_ref3 == null) {
                        L6: {
                          if (((kg) this).field_n != 0) {
                            {
                              L7: {
                                ((kg) this).field_e.field_k = 0;
                                ((kg) this).field_e.i(4, -90);
                                ((kg) this).field_e.i((int) ((kg) this).field_n, 68);
                                ((kg) this).field_e.e(0, 8959);
                                ((kg) this).field_p.a(((kg) this).field_e.field_i.length, 0, (byte) -97, ((kg) this).field_e.field_i);
                                break L7;
                              }
                            }
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L11: {
                          ((kg) this).field_h = 0;
                          ((kg) this).field_f = ll.a(1000);
                          if (param0 == -1456343840) {
                            break L11;
                          } else {
                            field_q = false;
                            break L11;
                          }
                        }
                        break L0;
                      } else {
                        ((kg) this).field_a.a(param0 ^ -1456349328, (vh) (Object) var4_ref3);
                        continue L5;
                      }
                    }
                  } else {
                    ((kg) this).field_b.a(param0 + 1456354992, (vh) (Object) var4_ref3);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_23_0 = (RuntimeException) var4_ref2;
                stackOut_23_1 = new StringBuilder().append("kg.H(").append(param0).append(44);
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (param1 == null) {
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
              throw qk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        if (param0 > -94) {
            field_r = null;
        }
        if (!(null == ((kg) this).field_p)) {
            ((kg) this).field_p.a((byte) -126);
        }
    }

    private final void d(boolean param0) {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null == ((kg) this).field_p) {
              return;
            } else {
              L0: {
                if (!param0) {
                  break L0;
                } else {
                  ((kg) this).b(-29);
                  break L0;
                }
              }
              {
                L1: {
                  ((kg) this).field_e.field_k = 0;
                  ((kg) this).field_e.i(6, -108);
                  ((kg) this).field_e.a(3, (byte) -89);
                  ((kg) this).field_e.h(-1564407352, 0);
                  ((kg) this).field_p.a(((kg) this).field_e.field_i.length, 0, (byte) -97, ((kg) this).field_e.field_i);
                  break L1;
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

    final void b(int param0) {
        try {
            ((kg) this).field_p.a((byte) -124);
        } catch (Exception exception) {
        }
        ((kg) this).field_i = ((kg) this).field_i + 1;
        ((kg) this).field_l = -1;
        if (param0 != -12948) {
            this.d(true);
        }
        ((kg) this).field_p = null;
        ((kg) this).field_n = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final boolean c(boolean param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            nh var2_ref = null;
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
            nh var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_43_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_84_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_83_0 = 0;
            L0: {
              var16 = Terraphoenix.field_V;
              if (null != ((kg) this).field_p) {
                L1: {
                  var2_long = ll.a(1000);
                  var4 = (int)(var2_long - ((kg) this).field_f);
                  if (200 >= var4) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((kg) this).field_f = var2_long;
                ((kg) this).field_h = ((kg) this).field_h + var4;
                if (((kg) this).field_h <= 30000) {
                  break L0;
                } else {
                  try {
                    L2: {
                      ((kg) this).field_p.a((byte) 71);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((kg) this).field_p = null;
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (((kg) this).field_p != null) {
              try {
                L4: {
                  ((kg) this).field_p.c(10509);
                  var2_ref = (nh) (Object) ((kg) this).field_b.c(8192);
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (nh) (Object) ((kg) this).field_a.c(8192);
                      L6: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L7: while (true) {
                            L8: {
                              if (var2_int >= 100) {
                                break L8;
                              } else {
                                var3_int = ((kg) this).field_p.a(0);
                                if (var3_int >= 0) {
                                  if (0 != var3_int) {
                                    L9: {
                                      ((kg) this).field_h = 0;
                                      var4 = 0;
                                      if (null != ((kg) this).field_k) {
                                        if (((kg) this).field_k.field_F != 0) {
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
                                          var5 = ((kg) this).field_k.field_H.field_i.length + -((kg) this).field_k.field_G;
                                          var6 = -((kg) this).field_k.field_F + 512;
                                          if (var6 > var5 - ((kg) this).field_k.field_H.field_k) {
                                            var6 = var5 + -((kg) this).field_k.field_H.field_k;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          if (var3_int < var6) {
                                            var6 = var3_int;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          ((kg) this).field_p.a(((kg) this).field_k.field_H.field_i, var6, ((kg) this).field_k.field_H.field_k, (byte) 117);
                                          if (((kg) this).field_n == 0) {
                                            break L13;
                                          } else {
                                            var7 = 0;
                                            L14: while (true) {
                                              if (var7 >= var6) {
                                                break L13;
                                              } else {
                                                ((kg) this).field_k.field_H.field_i[var7 + ((kg) this).field_k.field_H.field_k] = (byte)sl.a((int) ((kg) this).field_k.field_H.field_i[var7 + ((kg) this).field_k.field_H.field_k], (int) ((kg) this).field_n);
                                                var7++;
                                                continue L14;
                                              }
                                            }
                                          }
                                        }
                                        ((kg) this).field_k.field_F = ((kg) this).field_k.field_F + var6;
                                        ((kg) this).field_k.field_H.field_k = ((kg) this).field_k.field_H.field_k + var6;
                                        if (((kg) this).field_k.field_H.field_k != var5) {
                                          if (512 == ((kg) this).field_k.field_F) {
                                            ((kg) this).field_k.field_F = 0;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          ((kg) this).field_k.c((byte) 13);
                                          ((kg) this).field_k.field_A = false;
                                          ((kg) this).field_k = null;
                                          break L10;
                                        }
                                      } else {
                                        L15: {
                                          var5 = -((kg) this).field_o.field_k + var4;
                                          if (var5 <= var3_int) {
                                            break L15;
                                          } else {
                                            var5 = var3_int;
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          ((kg) this).field_p.a(((kg) this).field_o.field_i, var5, ((kg) this).field_o.field_k, (byte) 101);
                                          if (((kg) this).field_n == 0) {
                                            break L16;
                                          } else {
                                            var6 = 0;
                                            L17: while (true) {
                                              if (var5 <= var6) {
                                                break L16;
                                              } else {
                                                ((kg) this).field_o.field_i[((kg) this).field_o.field_k + var6] = (byte)sl.a((int) ((kg) this).field_o.field_i[((kg) this).field_o.field_k + var6], (int) ((kg) this).field_n);
                                                var6++;
                                                continue L17;
                                              }
                                            }
                                          }
                                        }
                                        ((kg) this).field_o.field_k = ((kg) this).field_o.field_k + var5;
                                        if (var4 <= ((kg) this).field_o.field_k) {
                                          if (((kg) this).field_k != null) {
                                            if (((kg) this).field_k.field_F != 0) {
                                              throw new IOException();
                                            } else {
                                              if (-1 != ((kg) this).field_o.field_i[0]) {
                                                ((kg) this).field_k = null;
                                                break L10;
                                              } else {
                                                ((kg) this).field_o.field_k = 0;
                                                ((kg) this).field_k.field_F = 1;
                                                break L10;
                                              }
                                            }
                                          } else {
                                            L18: {
                                              ((kg) this).field_o.field_k = 0;
                                              var6 = ((kg) this).field_o.a(-16384);
                                              var7 = ((kg) this).field_o.f((byte) -107);
                                              var8 = ((kg) this).field_o.a(-16384);
                                              var9 = ((kg) this).field_o.f((byte) -107);
                                              var10 = 127 & var8;
                                              if (0 == (128 & var8)) {
                                                stackOut_42_0 = 0;
                                                stackIn_43_0 = stackOut_42_0;
                                                break L18;
                                              } else {
                                                stackOut_41_0 = 1;
                                                stackIn_43_0 = stackOut_41_0;
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              var11 = stackIn_43_0;
                                              var12 = (long)var7 + ((long)var6 << 32);
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (nh) (Object) ((kg) this).field_g.c(8192);
                                                L20: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if (var12 == var14_ref.field_m) {
                                                      break L19;
                                                    } else {
                                                      var14_ref = (nh) (Object) ((kg) this).field_g.a(6273);
                                                      continue L20;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (nh) (Object) ((kg) this).field_m.c(8192);
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if (var14_ref.field_m != var12) {
                                                      var14_ref = (nh) (Object) ((kg) this).field_m.a(6273);
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
                                                  stackOut_58_0 = 9;
                                                  stackIn_59_0 = stackOut_58_0;
                                                  break L22;
                                                } else {
                                                  stackOut_57_0 = 5;
                                                  stackIn_59_0 = stackOut_57_0;
                                                  break L22;
                                                }
                                              }
                                              var15 = stackIn_59_0;
                                              ((kg) this).field_k = var14_ref;
                                              ((kg) this).field_k.field_H = new dh(((kg) this).field_k.field_G + (var15 + var9));
                                              ((kg) this).field_k.field_H.i(var10, 89);
                                              ((kg) this).field_k.field_H.e(var9, 8959);
                                              ((kg) this).field_k.field_F = 10;
                                              ((kg) this).field_o.field_k = 0;
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
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  throw new IOException();
                                }
                              }
                            }
                            if (param0) {
                              stackOut_83_0 = 1;
                              stackIn_84_0 = stackOut_83_0;
                              break L4;
                            } else {
                              field_r = null;
                              return true;
                            }
                          }
                        } else {
                          ((kg) this).field_e.field_k = 0;
                          ((kg) this).field_e.i(0, -124);
                          ((kg) this).field_e.b(var2_ref.field_m, -2108648176);
                          ((kg) this).field_p.a(((kg) this).field_e.field_i.length, 0, (byte) -97, ((kg) this).field_e.field_i);
                          ((kg) this).field_g.a(11152, (vh) (Object) var2_ref);
                          var2_ref = (nh) (Object) ((kg) this).field_a.a(6273);
                          continue L6;
                        }
                      }
                    } else {
                      ((kg) this).field_e.field_k = 0;
                      ((kg) this).field_e.i(1, -115);
                      ((kg) this).field_e.b(var2_ref.field_m, -2108648176);
                      ((kg) this).field_p.a(((kg) this).field_e.field_i.length, 0, (byte) -97, ((kg) this).field_e.field_i);
                      ((kg) this).field_m.a(11152, (vh) (Object) var2_ref);
                      var2_ref = (nh) (Object) ((kg) this).field_b.a(6273);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((kg) this).field_p.a((byte) 116);
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
                  ((kg) this).field_l = -2;
                  ((kg) this).field_p = null;
                  ((kg) this).field_i = ((kg) this).field_i + 1;
                  if (((kg) this).c(79) != 0) {
                    break L25;
                  } else {
                    if (((kg) this).a((byte) -103) != 0) {
                      break L25;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_84_0 != 0;
            } else {
              L26: {
                if (((kg) this).c(96) != 0) {
                  break L26;
                } else {
                  if (0 != ((kg) this).a((byte) -103)) {
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

    public kg() {
    }

    public static void e(int param0) {
        if (param0 != 7087) {
            kg.e(96);
        }
        field_r = null;
    }

    static {
    }
}

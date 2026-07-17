/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wh extends ona {
    private lpb field_p;
    static kb field_o;
    static int field_n;

    final boolean e(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            km var2_ref = null;
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
            km var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_62_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_86_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_61_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_85_0 = 0;
            L0: {
              var16 = VoidHunters.field_G;
              if (((wh) this).field_p == null) {
                break L0;
              } else {
                L1: {
                  var2_long = wt.a(false);
                  var4 = (int)(var2_long + -((wh) this).field_h);
                  if (var4 > 200) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((wh) this).field_h = var2_long;
                ((wh) this).field_m = ((wh) this).field_m + var4;
                if (((wh) this).field_m <= 30000) {
                  break L0;
                } else {
                  try {
                    L2: {
                      ((wh) this).field_p.b(param0 + 1);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((wh) this).field_p = null;
                  break L0;
                }
              }
            }
            if (null == ((wh) this).field_p) {
              if (0 != ((wh) this).f(param0 ^ 13223)) {
                return false;
              } else {
                if (((wh) this).b(-3666) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L4: {
                  ((wh) this).field_p.a((byte) 115);
                  var2_ref = (km) (Object) ((wh) this).field_a.a((byte) -54);
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (km) (Object) ((wh) this).field_c.a((byte) -54);
                      L6: while (true) {
                        if (var2_ref == null) {
                          var2_int = param0;
                          L7: while (true) {
                            L8: {
                              if (var2_int >= 100) {
                                break L8;
                              } else {
                                var3_int = ((wh) this).field_p.c(0);
                                if (0 > var3_int) {
                                  throw new IOException();
                                } else {
                                  if (var3_int == 0) {
                                    break L8;
                                  } else {
                                    L9: {
                                      ((wh) this).field_m = 0;
                                      var4 = 0;
                                      if (null == ((wh) this).field_b) {
                                        var4 = 10;
                                        break L9;
                                      } else {
                                        if (((wh) this).field_b.field_r != 0) {
                                          break L9;
                                        } else {
                                          var4 = 1;
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (0 < var4) {
                                        L11: {
                                          var5 = -((wh) this).field_i.field_e + var4;
                                          if (var5 > var3_int) {
                                            var5 = var3_int;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          ((wh) this).field_p.a(-122, ((wh) this).field_i.field_e, var5, ((wh) this).field_i.field_h);
                                          if (0 == ((wh) this).field_j) {
                                            break L12;
                                          } else {
                                            var6 = 0;
                                            L13: while (true) {
                                              if (var6 >= var5) {
                                                break L12;
                                              } else {
                                                ((wh) this).field_i.field_h[((wh) this).field_i.field_e + var6] = (byte)mgb.a((int) ((wh) this).field_i.field_h[((wh) this).field_i.field_e + var6], (int) ((wh) this).field_j);
                                                var6++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                        ((wh) this).field_i.field_e = ((wh) this).field_i.field_e + var5;
                                        if (var4 <= ((wh) this).field_i.field_e) {
                                          if (((wh) this).field_b != null) {
                                            if (0 != ((wh) this).field_b.field_r) {
                                              throw new IOException();
                                            } else {
                                              if (((wh) this).field_i.field_h[0] != -1) {
                                                ((wh) this).field_b = null;
                                                break L10;
                                              } else {
                                                ((wh) this).field_i.field_e = 0;
                                                ((wh) this).field_b.field_r = 1;
                                                break L10;
                                              }
                                            }
                                          } else {
                                            L14: {
                                              ((wh) this).field_i.field_e = 0;
                                              var6 = ((wh) this).field_i.e((byte) -126);
                                              var7 = ((wh) this).field_i.h(125);
                                              var8 = ((wh) this).field_i.e((byte) -125);
                                              var9 = ((wh) this).field_i.h(24);
                                              var10 = var8 & 127;
                                              if ((128 & var8) == 0) {
                                                stackOut_61_0 = 0;
                                                stackIn_62_0 = stackOut_61_0;
                                                break L14;
                                              } else {
                                                stackOut_60_0 = 1;
                                                stackIn_62_0 = stackOut_60_0;
                                                break L14;
                                              }
                                            }
                                            L15: {
                                              var11 = stackIn_62_0;
                                              var12 = (long)var7 + ((long)var6 << 32);
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (km) (Object) ((wh) this).field_d.a((byte) -54);
                                                L16: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if (~var14_ref.field_i != ~var12) {
                                                      var14_ref = (km) (Object) ((wh) this).field_d.a(1900);
                                                      continue L16;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (km) (Object) ((wh) this).field_f.a((byte) -54);
                                                L17: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if (var14_ref.field_i != var12) {
                                                      var14_ref = (km) (Object) ((wh) this).field_f.a(1900);
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
                                                if (var10 != 0) {
                                                  stackOut_77_0 = 9;
                                                  stackIn_78_0 = stackOut_77_0;
                                                  break L18;
                                                } else {
                                                  stackOut_76_0 = 5;
                                                  stackIn_78_0 = stackOut_76_0;
                                                  break L18;
                                                }
                                              }
                                              var15 = stackIn_78_0;
                                              ((wh) this).field_b = var14_ref;
                                              ((wh) this).field_b.field_p = new ds(((wh) this).field_b.field_q + var9 + var15);
                                              ((wh) this).field_b.field_p.c(0, var10);
                                              ((wh) this).field_b.field_p.d(var9, param0 + 332614536);
                                              ((wh) this).field_i.field_e = 0;
                                              ((wh) this).field_b.field_r = 10;
                                              break L10;
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        L19: {
                                          var5 = -((wh) this).field_b.field_q + ((wh) this).field_b.field_p.field_h.length;
                                          var6 = 512 - ((wh) this).field_b.field_r;
                                          if (var6 > var5 + -((wh) this).field_b.field_p.field_e) {
                                            var6 = -((wh) this).field_b.field_p.field_e + var5;
                                            break L19;
                                          } else {
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          if (var6 > var3_int) {
                                            var6 = var3_int;
                                            break L20;
                                          } else {
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          ((wh) this).field_p.a(param0 ^ -126, ((wh) this).field_b.field_p.field_e, var6, ((wh) this).field_b.field_p.field_h);
                                          if (((wh) this).field_j != 0) {
                                            var7 = 0;
                                            L22: while (true) {
                                              if (var7 >= var6) {
                                                break L21;
                                              } else {
                                                ((wh) this).field_b.field_p.field_h[var7 + ((wh) this).field_b.field_p.field_e] = (byte)mgb.a((int) ((wh) this).field_b.field_p.field_h[var7 + ((wh) this).field_b.field_p.field_e], (int) ((wh) this).field_j);
                                                var7++;
                                                continue L22;
                                              }
                                            }
                                          } else {
                                            break L21;
                                          }
                                        }
                                        ((wh) this).field_b.field_r = ((wh) this).field_b.field_r + var6;
                                        ((wh) this).field_b.field_p.field_e = ((wh) this).field_b.field_p.field_e + var6;
                                        if (var5 != ((wh) this).field_b.field_p.field_e) {
                                          if (((wh) this).field_b.field_r == 512) {
                                            ((wh) this).field_b.field_r = 0;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          ((wh) this).field_b.d((byte) -35);
                                          ((wh) this).field_b.field_n = false;
                                          ((wh) this).field_b = null;
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
                            stackOut_85_0 = 1;
                            stackIn_86_0 = stackOut_85_0;
                            break L4;
                          }
                        } else {
                          ((wh) this).field_e.field_e = 0;
                          ((wh) this).field_e.c(0, 0);
                          ((wh) this).field_e.a(100, var2_ref.field_i);
                          ((wh) this).field_p.a(0, ((wh) this).field_e.field_h, ((wh) this).field_e.field_h.length, 0);
                          ((wh) this).field_f.a((fh) (Object) var2_ref, -65);
                          var2_ref = (km) (Object) ((wh) this).field_c.a(1900);
                          continue L6;
                        }
                      }
                    } else {
                      ((wh) this).field_e.field_e = 0;
                      ((wh) this).field_e.c(0, 1);
                      ((wh) this).field_e.a(117, var2_ref.field_i);
                      ((wh) this).field_p.a(0, ((wh) this).field_e.field_h, ((wh) this).field_e.field_h.length, 0);
                      ((wh) this).field_d.a((fh) (Object) var2_ref, -84);
                      var2_ref = (km) (Object) ((wh) this).field_a.a(param0 + 1900);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((wh) this).field_p.b(1);
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
                  ((wh) this).field_g = ((wh) this).field_g + 1;
                  ((wh) this).field_p = null;
                  ((wh) this).field_k = -2;
                  if (-1 != ((wh) this).f(13223)) {
                    break L25;
                  } else {
                    if (-1 == ((wh) this).b(param0 + -3666)) {
                      return true;
                    } else {
                      break L25;
                    }
                  }
                }
                return false;
              }
              return stackIn_86_0 != 0;
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
            ds stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            ds stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            ds stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            ds stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            ds stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            ds stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            if (param0 == -65) {
              if (((wh) this).field_p != null) {
                try {
                  L0: {
                    L1: {
                      ((wh) this).field_e.field_e = 0;
                      stackOut_4_0 = ((wh) this).field_e;
                      stackOut_4_1 = 0;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (param1) {
                        stackOut_6_0 = (ds) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = 2;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        break L1;
                      } else {
                        stackOut_5_0 = (ds) (Object) stackIn_5_0;
                        stackOut_5_1 = stackIn_5_1;
                        stackOut_5_2 = 3;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_7_2 = stackOut_5_2;
                        break L1;
                      }
                    }
                    ((ds) (Object) stackIn_7_0).c(stackIn_7_1, stackIn_7_2);
                    ((wh) this).field_e.a(param0 ^ -50, 0L);
                    ((wh) this).field_p.a(0, ((wh) this).field_e.field_h, ((wh) this).field_e.field_h.length, 0);
                    break L0;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    try {
                      L3: {
                        ((wh) this).field_p.b(1);
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L4: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    ((wh) this).field_k = -2;
                    ((wh) this).field_g = ((wh) this).field_g + 1;
                    ((wh) this).field_p = null;
                    break L2;
                  }
                }
                return;
              } else {
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

    public static void h(int param0) {
        field_o = null;
        if (param0 != 0) {
            boolean discarded$0 = wh.g(-53);
        }
    }

    private final void i(int param0) {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((wh) this).field_p == null) {
              return;
            } else {
              {
                L0: {
                  ((wh) this).field_e.field_e = 0;
                  ((wh) this).field_e.c(0, 6);
                  ((wh) this).field_e.a(3, (byte) 125);
                  ((wh) this).field_e.a(0, true);
                  ((wh) this).field_p.a(0, ((wh) this).field_e.field_h, ((wh) this).field_e.field_h.length, 0);
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

    public wh() {
    }

    final void a(byte param0) {
        try {
            ((wh) this).field_p.b(1);
        } catch (Exception exception) {
        }
        ((wh) this).field_g = ((wh) this).field_g + 1;
        ((wh) this).field_p = null;
        ((wh) this).field_k = -1;
        if (param0 != -25) {
            field_o = null;
        }
        ((wh) this).field_j = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final static boolean g(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -113) {
            break L0;
          } else {
            boolean discarded$2 = wh.a(-4, (byte) 35, 31);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ov.field_o) {
              break L2;
            } else {
              if (sp.field_o != tc.field_c) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static boolean a(int param0, byte param1, int param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 >= 90) {
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((2048 & param2) == 0) {
              break L2;
            } else {
              if (0 == (55 & param0)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0) {
        if (param0 <= 105) {
            field_n = 115;
        }
        if (!(null == ((wh) this).field_p)) {
            ((wh) this).field_p.b(1);
        }
    }

    final void a(Object param0, boolean param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            km var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            String stackIn_28_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            String stackOut_27_2 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            var6 = VoidHunters.field_G;
            try {
              L0: {
                L1: {
                  if (null != ((wh) this).field_p) {
                    try {
                      L2: {
                        ((wh) this).field_p.b(1);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((wh) this).field_p = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((wh) this).field_p = (lpb) param0;
                this.i(7571);
                this.a((byte) -65, param1);
                ((wh) this).field_b = null;
                ((wh) this).field_i.field_e = 0;
                L4: while (true) {
                  var4_ref3 = (km) (Object) ((wh) this).field_d.b((byte) 87);
                  if (var4_ref3 == null) {
                    L5: while (true) {
                      var4_ref3 = (km) (Object) ((wh) this).field_f.b((byte) 109);
                      if (var4_ref3 == null) {
                        L6: {
                          if (0 != ((wh) this).field_j) {
                            {
                              L7: {
                                ((wh) this).field_e.field_e = 0;
                                ((wh) this).field_e.c(0, 4);
                                ((wh) this).field_e.c(0, (int) ((wh) this).field_j);
                                ((wh) this).field_e.d(0, 332614536);
                                ((wh) this).field_p.a(0, ((wh) this).field_e.field_h, ((wh) this).field_e.field_h.length, 0);
                                break L7;
                              }
                            }
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L11: {
                          ((wh) this).field_m = 0;
                          if (!param2) {
                            break L11;
                          } else {
                            wh.h(-98);
                            break L11;
                          }
                        }
                        ((wh) this).field_h = wt.a(param2);
                        break L0;
                      } else {
                        ((wh) this).field_c.a((fh) (Object) var4_ref3, -86);
                        continue L5;
                      }
                    }
                  } else {
                    ((wh) this).field_a.a((fh) (Object) var4_ref3, -116);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_25_0 = (RuntimeException) var4_ref2;
                stackOut_25_1 = new StringBuilder().append("wh.E(");
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                if (param0 == null) {
                  stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                  stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                  stackOut_27_2 = "null";
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  stackIn_28_2 = stackOut_27_2;
                  break L12;
                } else {
                  stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                  stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                  stackOut_26_2 = "{...}";
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  break L12;
                }
              }
              throw rta.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param1 + 44 + param2 + 41);
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
        field_o = new kb(2);
        field_n = 0;
    }
}

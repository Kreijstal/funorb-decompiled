/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fa extends wl {
    static int field_r;
    static int field_p;
    private id field_o;
    static int field_q;

    private final void a(boolean param0, byte param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            Object var5 = null;
            gk stackIn_4_0 = null;
            gk stackIn_5_0 = null;
            gk stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            Throwable decompiledCaughtException = null;
            gk stackOut_3_0 = null;
            gk stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            gk stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            if (null == ((fa) this).field_o) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((fa) this).field_l.field_h = 0;
                    stackOut_3_0 = ((fa) this).field_l;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (!param0) {
                      stackOut_5_0 = (gk) (Object) stackIn_5_0;
                      stackOut_5_1 = 3;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L1;
                    } else {
                      stackOut_4_0 = (gk) (Object) stackIn_4_0;
                      stackOut_4_1 = 2;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L1;
                    }
                  }
                  ((gk) (Object) stackIn_6_0).b(stackIn_6_1, -49152);
                  ((fa) this).field_l.a(0L, -1268490168);
                  ((fa) this).field_o.a(((fa) this).field_l.field_g, 0, (byte) 46, ((fa) this).field_l.field_g.length);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((fa) this).field_o.a((byte) 73);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((fa) this).field_b = ((fa) this).field_b + 1;
                  ((fa) this).field_a = -2;
                  ((fa) this).field_o = null;
                  break L2;
                }
              }
              L5: {
                if (param1 == 109) {
                  break L5;
                } else {
                  var5 = null;
                  ((fa) this).a(-90, false, (Object) null);
                  break L5;
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
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((fa) this).field_o.a((byte) 73);
              if (param0 == 20) {
                break L1;
              } else {
                ((fa) this).field_o = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((fa) this).field_b = ((fa) this).field_b + 1;
        ((fa) this).field_o = null;
        ((fa) this).field_a = -1;
        ((fa) this).field_m = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ob var2_ref = null;
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
            ob var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_63_0 = 0;
            int stackIn_79_0 = 0;
            int stackIn_87_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_86_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_77_0 = 0;
            L0: {
              var16 = MonkeyPuzzle2.field_F ? 1 : 0;
              if (((fa) this).field_o == null) {
                break L0;
              } else {
                L1: {
                  var2_long = pf.a(0);
                  var4 = (int)(-((fa) this).field_e + var2_long);
                  if (var4 > 200) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((fa) this).field_e = var2_long;
                ((fa) this).field_h = ((fa) this).field_h + var4;
                if (((fa) this).field_h > 30000) {
                  try {
                    L2: {
                      ((fa) this).field_o.a((byte) 73);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((fa) this).field_o = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (((fa) this).field_o != null) {
              try {
                L4: {
                  ((fa) this).field_o.b((byte) 86);
                  var2_ref = (ob) (Object) ((fa) this).field_n.a(true);
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (ob) (Object) ((fa) this).field_i.a(true);
                      L6: while (true) {
                        if (var2_ref == null) {
                          L7: {
                            if (param0 < -33) {
                              break L7;
                            } else {
                              ((fa) this).b((byte) -60);
                              break L7;
                            }
                          }
                          var2_int = 0;
                          L8: while (true) {
                            if (var2_int >= 100) {
                              stackOut_86_0 = 1;
                              stackIn_87_0 = stackOut_86_0;
                              break L4;
                            } else {
                              var3_int = ((fa) this).field_o.c(126);
                              if (var3_int < 0) {
                                throw new IOException();
                              } else {
                                if (var3_int != 0) {
                                  L9: {
                                    ((fa) this).field_h = 0;
                                    var4 = 0;
                                    if (null != ((fa) this).field_k) {
                                      if (((fa) this).field_k.field_p == 0) {
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
                                        var5 = -((fa) this).field_g.field_h + var4;
                                        if (var3_int < var5) {
                                          var5 = var3_int;
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        ((fa) this).field_o.a(var5, true, ((fa) this).field_g.field_g, ((fa) this).field_g.field_h);
                                        if (((fa) this).field_m != 0) {
                                          var6 = 0;
                                          L13: while (true) {
                                            if (var5 <= var6) {
                                              break L12;
                                            } else {
                                              ((fa) this).field_g.field_g[((fa) this).field_g.field_h + var6] = (byte)gi.a((int) ((fa) this).field_g.field_g[((fa) this).field_g.field_h + var6], (int) ((fa) this).field_m);
                                              var6++;
                                              continue L13;
                                            }
                                          }
                                        } else {
                                          break L12;
                                        }
                                      }
                                      ((fa) this).field_g.field_h = ((fa) this).field_g.field_h + var5;
                                      if (~var4 < ~((fa) this).field_g.field_h) {
                                        break L10;
                                      } else {
                                        if (((fa) this).field_k == null) {
                                          L14: {
                                            ((fa) this).field_g.field_h = 0;
                                            var6 = ((fa) this).field_g.a((byte) 114);
                                            var7 = ((fa) this).field_g.e(14);
                                            var8 = ((fa) this).field_g.a((byte) 114);
                                            var9 = ((fa) this).field_g.e(-107);
                                            var10 = 127 & var8;
                                            if ((128 & var8) == 0) {
                                              stackOut_62_0 = 0;
                                              stackIn_63_0 = stackOut_62_0;
                                              break L14;
                                            } else {
                                              stackOut_61_0 = 1;
                                              stackIn_63_0 = stackOut_61_0;
                                              break L14;
                                            }
                                          }
                                          L15: {
                                            var11 = stackIn_63_0;
                                            var12 = ((long)var6 << 32) - -(long)var7;
                                            var14 = null;
                                            if (var11 != 0) {
                                              var14_ref = (ob) (Object) ((fa) this).field_c.a(true);
                                              L16: while (true) {
                                                if (var14_ref == null) {
                                                  break L15;
                                                } else {
                                                  if (var12 != var14_ref.field_f) {
                                                    var14_ref = (ob) (Object) ((fa) this).field_c.c((byte) -75);
                                                    continue L16;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                            } else {
                                              var14_ref = (ob) (Object) ((fa) this).field_j.a(true);
                                              L17: while (true) {
                                                if (var14_ref == null) {
                                                  break L15;
                                                } else {
                                                  if (~var12 != ~var14_ref.field_f) {
                                                    var14_ref = (ob) (Object) ((fa) this).field_j.c((byte) -75);
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
                                              ((fa) this).field_k = var14_ref;
                                              if (var10 != 0) {
                                                stackOut_78_0 = 9;
                                                stackIn_79_0 = stackOut_78_0;
                                                break L18;
                                              } else {
                                                stackOut_77_0 = 5;
                                                stackIn_79_0 = stackOut_77_0;
                                                break L18;
                                              }
                                            }
                                            var15 = stackIn_79_0;
                                            ((fa) this).field_k.field_o = new gk(((fa) this).field_k.field_q + var9 + var15);
                                            ((fa) this).field_k.field_o.b(var10, -49152);
                                            ((fa) this).field_k.field_o.a(-803539344, var9);
                                            ((fa) this).field_g.field_h = 0;
                                            ((fa) this).field_k.field_p = 10;
                                            break L10;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (0 != ((fa) this).field_k.field_p) {
                                            throw new IOException();
                                          } else {
                                            if (-1 != ((fa) this).field_g.field_g[0]) {
                                              ((fa) this).field_k = null;
                                              break L10;
                                            } else {
                                              ((fa) this).field_g.field_h = 0;
                                              ((fa) this).field_k.field_p = 1;
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L19: {
                                        var5 = ((fa) this).field_k.field_o.field_g.length + -((fa) this).field_k.field_q;
                                        var6 = 512 + -((fa) this).field_k.field_p;
                                        if (~(-((fa) this).field_k.field_o.field_h + var5) <= ~var6) {
                                          break L19;
                                        } else {
                                          var6 = -((fa) this).field_k.field_o.field_h + var5;
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
                                        ((fa) this).field_o.a(var6, true, ((fa) this).field_k.field_o.field_g, ((fa) this).field_k.field_o.field_h);
                                        if (((fa) this).field_m == 0) {
                                          break L21;
                                        } else {
                                          var7 = 0;
                                          L22: while (true) {
                                            if (var7 >= var6) {
                                              break L21;
                                            } else {
                                              ((fa) this).field_k.field_o.field_g[((fa) this).field_k.field_o.field_h + var7] = (byte)gi.a((int) ((fa) this).field_k.field_o.field_g[((fa) this).field_k.field_o.field_h + var7], (int) ((fa) this).field_m);
                                              var7++;
                                              continue L22;
                                            }
                                          }
                                        }
                                      }
                                      ((fa) this).field_k.field_p = ((fa) this).field_k.field_p + var6;
                                      ((fa) this).field_k.field_o.field_h = ((fa) this).field_k.field_o.field_h + var6;
                                      if (((fa) this).field_k.field_o.field_h == var5) {
                                        ((fa) this).field_k.a(7847);
                                        ((fa) this).field_k.field_j = false;
                                        ((fa) this).field_k = null;
                                        break L10;
                                      } else {
                                        if (((fa) this).field_k.field_p != 512) {
                                          break L10;
                                        } else {
                                          ((fa) this).field_k.field_p = 0;
                                          break L10;
                                        }
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
                          ((fa) this).field_l.field_h = 0;
                          ((fa) this).field_l.b(0, -49152);
                          ((fa) this).field_l.a(var2_ref.field_f, -1268490168);
                          ((fa) this).field_o.a(((fa) this).field_l.field_g, 0, (byte) 83, ((fa) this).field_l.field_g.length);
                          ((fa) this).field_c.a((bf) (Object) var2_ref, (byte) 127);
                          var2_ref = (ob) (Object) ((fa) this).field_i.c((byte) -75);
                          continue L6;
                        }
                      }
                    } else {
                      ((fa) this).field_l.field_h = 0;
                      ((fa) this).field_l.b(1, -49152);
                      ((fa) this).field_l.a(var2_ref.field_f, -1268490168);
                      ((fa) this).field_o.a(((fa) this).field_l.field_g, 0, (byte) 80, ((fa) this).field_l.field_g.length);
                      ((fa) this).field_j.a((bf) (Object) var2_ref, (byte) 95);
                      var2_ref = (ob) (Object) ((fa) this).field_n.c((byte) -75);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((fa) this).field_o.a((byte) 73);
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
                  ((fa) this).field_b = ((fa) this).field_b + 1;
                  ((fa) this).field_o = null;
                  ((fa) this).field_a = -2;
                  if (((fa) this).c(24547) != 0) {
                    break L25;
                  } else {
                    if (((fa) this).d((byte) -25) == 0) {
                      return true;
                    } else {
                      break L25;
                    }
                  }
                }
                return false;
              }
              return stackIn_87_0 != 0;
            } else {
              L26: {
                if (((fa) this).c(24547) != 0) {
                  break L26;
                } else {
                  if (((fa) this).d((byte) -25) != 0) {
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

    final void a(int param0, boolean param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            ob var4_ref3 = null;
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
            var6 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (((fa) this).field_o == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        ((fa) this).field_o.a((byte) 73);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((fa) this).field_o = null;
                    break L1;
                  }
                }
                ((fa) this).field_o = (id) param2;
                int discarded$1 = -1;
                this.e();
                this.a(param1, (byte) 109);
                ((fa) this).field_k = null;
                ((fa) this).field_g.field_h = 0;
                L4: while (true) {
                  var4_ref3 = (ob) (Object) ((fa) this).field_j.a((byte) -120);
                  if (var4_ref3 == null) {
                    L5: while (true) {
                      var4_ref3 = (ob) (Object) ((fa) this).field_c.a((byte) -120);
                      if (var4_ref3 == null) {
                        L6: {
                          if (((fa) this).field_m != 0) {
                            {
                              L7: {
                                ((fa) this).field_l.field_h = 0;
                                ((fa) this).field_l.b(4, -49152);
                                ((fa) this).field_l.b((int) ((fa) this).field_m, -49152);
                                ((fa) this).field_l.a(-803539344, 0);
                                ((fa) this).field_o.a(((fa) this).field_l.field_g, 0, (byte) 57, ((fa) this).field_l.field_g.length);
                                break L7;
                              }
                            }
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L11: {
                          if (param0 < -84) {
                            break L11;
                          } else {
                            field_r = 64;
                            break L11;
                          }
                        }
                        ((fa) this).field_h = 0;
                        ((fa) this).field_e = pf.a(0);
                        break L0;
                      } else {
                        ((fa) this).field_i.a((bf) (Object) var4_ref3, (byte) -9);
                        continue L5;
                      }
                    }
                  } else {
                    ((fa) this).field_n.a((bf) (Object) var4_ref3, (byte) -108);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) var4_ref2;
                stackOut_24_1 = new StringBuilder().append("fa.E(").append(param0).append(',').append(param1).append(',');
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                if (param2 == null) {
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
              throw la.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        if (((fa) this).field_o != null) {
            ((fa) this).field_o.a((byte) 73);
        }
        if (param0 != 7) {
            this.a(false, (byte) -93);
        }
    }

    public fa() {
    }

    private final void e() {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((fa) this).field_o != null) {
              {
                L0: {
                  ((fa) this).field_l.field_h = 0;
                  ((fa) this).field_l.b(6, -49152);
                  ((fa) this).field_l.e(121, 3);
                  ((fa) this).field_l.c(0, 113);
                  ((fa) this).field_o.a(((fa) this).field_l.field_g, 0, (byte) 23, ((fa) this).field_l.field_g.length);
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

    final static void f(int param0) {
        int var2 = 0;
        he var3 = (he) (Object) mb.field_e.a((byte) -117);
        he var1 = var3;
        if (!(var1 == null)) {
            var2 = em.field_B;
            lb.a(10, pl.field_j, (byte) -128, wc.field_e, var2, ii.field_B);
            ie.field_b[var3.field_h].b(25, var2 + 15);
            int discarded$0 = pl.field_e.a(rb.field_hb[var3.field_h], 67, var2 - -15, pl.field_j + -72, ii.field_B + -30, 1, -1, 1, 1, pl.field_e.field_C - -pl.field_e.field_D);
        }
        if (param0 != 1) {
            fa.f(47);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 0;
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lh extends pc {
    private gm field_n;

    private final void f(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (param0 <= -54) {
              if (null == this.field_n) {
                return;
              } else {
                try {
                  L0: {
                    this.field_b.field_j = 0;
                    this.field_b.i(6, 13);
                    this.field_b.c(3, -105);
                    this.field_b.a(0, (byte) 105);
                    this.field_n.a(this.field_b.field_h.length, true, 0, this.field_b.field_h);
                    break L0;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L1: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    try {
                      L2: {
                        this.field_n.a(100);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L3: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_e = -2;
                    this.field_h = this.field_h + 1;
                    this.field_n = null;
                    break L1;
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

    final boolean c(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            og var2_ref = null;
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
            og var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_65_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_90_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_64_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_89_0 = 0;
            L0: {
              var16 = ZombieDawn.field_J;
              if (null == this.field_n) {
                break L0;
              } else {
                L1: {
                  var2_long = pd.a(param0 + -22805);
                  var4 = (int)(var2_long + -this.field_g);
                  if (-201 > (var4 ^ -1)) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_g = var2_long;
                this.field_i = this.field_i + var4;
                if (-30001 > (this.field_i ^ -1)) {
                  try {
                    L2: {
                      this.field_n.a(-59);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_n = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (param0 == -21) {
              if (null == this.field_n) {
                if (this.e(-1216122784) != 0) {
                  return false;
                } else {
                  if (this.a(true) == 0) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                try {
                  L4: {
                    this.field_n.c((byte) 85);
                    var2_ref = (og) ((Object) this.field_a.c((byte) 34));
                    L5: while (true) {
                      if (var2_ref == null) {
                        var2_ref = (og) ((Object) this.field_f.c((byte) 34));
                        L6: while (true) {
                          if (var2_ref == null) {
                            var2_int = 0;
                            L7: while (true) {
                              L8: {
                                if ((var2_int ^ -1) <= -101) {
                                  break L8;
                                } else {
                                  var3_int = this.field_n.b((byte) -59);
                                  if (var3_int >= 0) {
                                    if (-1 != (var3_int ^ -1)) {
                                      L9: {
                                        this.field_i = 0;
                                        var4 = 0;
                                        if (this.field_d != null) {
                                          if (this.field_d.field_v != 0) {
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
                                        if (-1 > (var4 ^ -1)) {
                                          L11: {
                                            var5 = -this.field_j.field_j + var4;
                                            if (var5 > var3_int) {
                                              var5 = var3_int;
                                              break L11;
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            this.field_n.a(this.field_j.field_j, var5, this.field_j.field_h, 0);
                                            if (this.field_c != 0) {
                                              var6 = 0;
                                              L13: while (true) {
                                                if (var6 >= var5) {
                                                  break L12;
                                                } else {
                                                  this.field_j.field_h[var6 + this.field_j.field_j] = (byte)rd.b((int) this.field_j.field_h[var6 + this.field_j.field_j], (int) this.field_c);
                                                  var6++;
                                                  continue L13;
                                                }
                                              }
                                            } else {
                                              break L12;
                                            }
                                          }
                                          this.field_j.field_j = this.field_j.field_j + var5;
                                          if (this.field_j.field_j >= var4) {
                                            if (null != this.field_d) {
                                              if (this.field_d.field_v == 0) {
                                                if (this.field_j.field_h[0] == -1) {
                                                  this.field_j.field_j = 0;
                                                  this.field_d.field_v = 1;
                                                  break L10;
                                                } else {
                                                  this.field_d = null;
                                                  break L10;
                                                }
                                              } else {
                                                throw new IOException();
                                              }
                                            } else {
                                              L14: {
                                                this.field_j.field_j = 0;
                                                var6 = this.field_j.d((byte) -127);
                                                var7 = this.field_j.c(param0 ^ -111);
                                                var8 = this.field_j.d((byte) -117);
                                                var9 = this.field_j.c(-121);
                                                var10 = 127 & var8;
                                                if ((128 & var8) == 0) {
                                                  stackOut_64_0 = 0;
                                                  stackIn_65_0 = stackOut_64_0;
                                                  break L14;
                                                } else {
                                                  stackOut_63_0 = 1;
                                                  stackIn_65_0 = stackOut_63_0;
                                                  break L14;
                                                }
                                              }
                                              L15: {
                                                var11 = stackIn_65_0;
                                                var12 = (long)var7 + ((long)var6 << -772763744);
                                                var14 = null;
                                                if (var11 != 0) {
                                                  var14_ref = (og) ((Object) this.field_m.c((byte) 34));
                                                  L16: while (true) {
                                                    if (var14_ref == null) {
                                                      break L15;
                                                    } else {
                                                      if (var12 == var14_ref.field_n) {
                                                        break L15;
                                                      } else {
                                                        var14_ref = (og) ((Object) this.field_m.a((byte) 122));
                                                        continue L16;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (og) ((Object) this.field_l.c((byte) 34));
                                                  L17: while (true) {
                                                    if (var14_ref == null) {
                                                      break L15;
                                                    } else {
                                                      if ((var12 ^ -1L) != (var14_ref.field_n ^ -1L)) {
                                                        var14_ref = (og) ((Object) this.field_l.a((byte) 125));
                                                        continue L17;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref == null) {
                                                throw new IOException();
                                              } else {
                                                L18: {
                                                  if (0 != var10) {
                                                    stackOut_80_0 = 9;
                                                    stackIn_81_0 = stackOut_80_0;
                                                    break L18;
                                                  } else {
                                                    stackOut_79_0 = 5;
                                                    stackIn_81_0 = stackOut_79_0;
                                                    break L18;
                                                  }
                                                }
                                                var15 = stackIn_81_0;
                                                this.field_d = var14_ref;
                                                this.field_d.field_w = new de(this.field_d.field_C + var9 - -var15);
                                                this.field_d.field_w.i(var10, -100);
                                                this.field_d.field_w.h(-120, var9);
                                                this.field_d.field_v = 10;
                                                this.field_j.field_j = 0;
                                                break L10;
                                              }
                                            }
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          L19: {
                                            var5 = this.field_d.field_w.field_h.length - this.field_d.field_C;
                                            var6 = 512 + -this.field_d.field_v;
                                            if (var6 > -this.field_d.field_w.field_j + var5) {
                                              var6 = var5 - this.field_d.field_w.field_j;
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
                                            this.field_n.a(this.field_d.field_w.field_j, var6, this.field_d.field_w.field_h, 0);
                                            if (this.field_c == 0) {
                                              break L21;
                                            } else {
                                              var7 = 0;
                                              L22: while (true) {
                                                if (var6 <= var7) {
                                                  break L21;
                                                } else {
                                                  this.field_d.field_w.field_h[var7 + this.field_d.field_w.field_j] = (byte)rd.b((int) this.field_d.field_w.field_h[var7 + this.field_d.field_w.field_j], (int) this.field_c);
                                                  var7++;
                                                  continue L22;
                                                }
                                              }
                                            }
                                          }
                                          this.field_d.field_w.field_j = this.field_d.field_w.field_j + var6;
                                          this.field_d.field_v = this.field_d.field_v + var6;
                                          if (this.field_d.field_w.field_j == var5) {
                                            this.field_d.c((byte) -15);
                                            this.field_d.field_q = false;
                                            this.field_d = null;
                                            break L10;
                                          } else {
                                            if (512 == this.field_d.field_v) {
                                              this.field_d.field_v = 0;
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
                                  } else {
                                    throw new IOException();
                                  }
                                }
                              }
                              stackOut_89_0 = 1;
                              stackIn_90_0 = stackOut_89_0;
                              break L4;
                            }
                          } else {
                            this.field_b.field_j = 0;
                            this.field_b.i(0, -123);
                            this.field_b.b(var2_ref.field_n, 0);
                            this.field_n.a(this.field_b.field_h.length, true, 0, this.field_b.field_h);
                            this.field_m.a(var2_ref, (byte) -95);
                            var2_ref = (og) ((Object) this.field_f.a((byte) 112));
                            continue L6;
                          }
                        }
                      } else {
                        this.field_b.field_j = 0;
                        this.field_b.i(1, 114);
                        this.field_b.b(var2_ref.field_n, param0 ^ -21);
                        this.field_n.a(this.field_b.field_h.length, true, 0, this.field_b.field_h);
                        this.field_l.a(var2_ref, (byte) -117);
                        var2_ref = (og) ((Object) this.field_a.a((byte) 117));
                        continue L5;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  try {
                    L23: {
                      this.field_n.a(param0 + -52);
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
                    this.field_n = null;
                    this.field_e = -2;
                    this.field_h = this.field_h + 1;
                    if (this.e(param0 + -1216122763) != 0) {
                      break L25;
                    } else {
                      if (this.a(true) == 0) {
                        return true;
                      } else {
                        break L25;
                      }
                    }
                  }
                  return false;
                }
                return stackIn_90_0 != 0;
              }
            } else {
              return true;
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
            de stackIn_3_0 = null;
            de stackIn_4_0 = null;
            de stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            Throwable decompiledCaughtException = null;
            de stackOut_2_0 = null;
            de stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            de stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            if (null != this.field_n) {
              try {
                L0: {
                  L1: {
                    this.field_b.field_j = 0;
                    stackOut_2_0 = this.field_b;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (param1) {
                      stackOut_4_0 = (de) ((Object) stackIn_4_0);
                      stackOut_4_1 = 2;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      break L1;
                    } else {
                      stackOut_3_0 = (de) ((Object) stackIn_3_0);
                      stackOut_3_1 = 3;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      break L1;
                    }
                  }
                  ((de) (Object) stackIn_5_0).i(stackIn_5_1, -98);
                  this.field_b.b(0L, 0);
                  this.field_n.a(this.field_b.field_h.length, true, 0, this.field_b.field_h);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_n.a(-103);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_e = -2;
                  this.field_h = this.field_h + 1;
                  this.field_n = null;
                  break L2;
                }
              }
              L5: {
                if (param0 >= 58) {
                  break L5;
                } else {
                  this.field_n = (gm) null;
                  break L5;
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

    final void a(boolean param0, Object param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            int var4_int = 0;
            og var4_ref3 = null;
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
            var6 = ZombieDawn.field_J;
            try {
              L0: {
                L1: {
                  if (this.field_n == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        this.field_n.a(100);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_n = null;
                    break L1;
                  }
                }
                this.field_n = (gm) (param1);
                this.f(-87);
                this.a(67, param0);
                this.field_j.field_j = 0;
                this.field_d = null;
                L4: while (true) {
                  var4_ref3 = (og) ((Object) this.field_l.a(116));
                  if (var4_ref3 != null) {
                    this.field_a.a(var4_ref3, (byte) -120);
                    continue L4;
                  } else {
                    L5: while (true) {
                      var4_ref3 = (og) ((Object) this.field_m.a(-61));
                      if (var4_ref3 != null) {
                        this.field_f.a(var4_ref3, (byte) -97);
                        continue L5;
                      } else {
                        L6: {
                          if (0 == this.field_c) {
                            break L6;
                          } else {
                            try {
                              L7: {
                                this.field_b.field_j = 0;
                                this.field_b.i(4, 29);
                                this.field_b.i((int) this.field_c, -112);
                                this.field_b.h(-104, 0);
                                this.field_n.a(this.field_b.field_h.length, true, 0, this.field_b.field_h);
                                break L7;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L8: {
                                var4_ref = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L9: {
                                    this.field_n.a(69);
                                    break L9;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L10;
                                  }
                                }
                                this.field_n = null;
                                this.field_e = -2;
                                this.field_h = this.field_h + 1;
                                break L8;
                              }
                            }
                            break L6;
                          }
                        }
                        var4_int = -50 % ((-1 - param2) / 63);
                        this.field_i = 0;
                        this.field_g = pd.a(-22826);
                        break L0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_23_0 = (RuntimeException) (var4_ref2);
                stackOut_23_1 = new StringBuilder().append("lh.E(").append(param0).append(',');
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (param1 == null) {
                  stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
                  stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackOut_25_2 = "null";
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  break L11;
                } else {
                  stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackOut_24_2 = "{...}";
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  break L11;
                }
              }
              throw sh.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        try {
            this.field_n.a(123);
        } catch (Exception exception) {
        }
        this.field_e = -1;
        this.field_h = this.field_h + 1;
        this.field_n = null;
        this.field_c = (byte)(int)(1.0 + 255.0 * Math.random());
        if (param0 > -89) {
            this.field_n = (gm) null;
        }
    }

    final void d(int param0) {
        if (null != this.field_n) {
            this.field_n.a(108);
        }
        if (param0 != 31239) {
            this.a(-79, true);
        }
    }

    public lh() {
    }

    static {
    }
}

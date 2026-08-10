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
            Object var5 = null;
            gk stackIn_5_0 = null;
            gk stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (null == this.field_o) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_l.field_h = 0;
                    stackIn_5_0 = this.field_l;

                    if (!param0) {
                      stackIn_6_0 = (gk) ((Object) stackIn_5_0);
                      stackIn_6_1 = 3;
                      break L1;
                    } else {
                      stackIn_6_0 = (gk) ((Object) stackIn_5_0);
                      stackIn_6_1 = 2;
                      break L1;
                    }
                  }
                  ((gk) (Object) stackIn_6_0).b(stackIn_6_1, -49152);
                  this.field_l.a(0L, -1268490168);
                  this.field_o.a(this.field_l.field_g, 0, (byte) 46, this.field_l.field_g.length);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_o.a((byte) 73);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_b = this.field_b + 1;
                  this.field_a = -2;
                  this.field_o = null;
                  break L2;
                }
              }
              L5: {
                if (param1 == 109) {
                  break L5;
                } else {
                  var5 = (Object) null;
                  this.a(-90, false, (Object) null);
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
              this.field_o.a((byte) 73);
              if (param0 == 20) {
                break L1;
              } else {
                this.field_o = (id) null;
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
        this.field_b = this.field_b + 1;
        this.field_o = null;
        this.field_a = -1;
        this.field_m = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    final boolean a(byte param0) {
        try {
            int stackIn_63_0 = 0;
            int stackIn_79_0 = 0;
            int stackIn_87_0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            ob var2 = null;
            int var2_int = 0;
            IOException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
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
            L0: {
              var16 = MonkeyPuzzle2.field_F ? 1 : 0;
              if (this.field_o == null) {
                break L0;
              } else {
                L1: {
                  var2_long = pf.a(0);
                  var4 = (int)(-this.field_e + var2_long);
                  if (-201 > (var4 ^ -1)) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_e = var2_long;
                this.field_h = this.field_h + var4;
                if ((this.field_h ^ -1) < -30001) {
                  try {
                    L2: {
                      this.field_o.a((byte) 73);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_o = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (this.field_o != null) {
              try {
                L4: {
                  this.field_o.b((byte) 86);
                  var2 = (ob) ((Object) this.field_n.a(true));
                  L5: while (true) {
                    if (var2 == null) {
                      var2 = (ob) ((Object) this.field_i.a(true));
                      L6: while (true) {
                        if (var2 == null) {
                          L7: {
                            if (param0 < -33) {
                              break L7;
                            } else {
                              this.b((byte) -60);
                              break L7;
                            }
                          }
                          var2_int = 0;
                          L8: while (true) {
                            if (-101 >= (var2_int ^ -1)) {
                              stackIn_87_0 = 1;
                              break L4;
                            } else {
                              var3_int = this.field_o.c(126);
                              if (var3_int < 0) {
                                throw new IOException();
                              } else {
                                if (-1 != (var3_int ^ -1)) {
                                  L9: {
                                    this.field_h = 0;
                                    var4 = 0;
                                    if (null != this.field_k) {
                                      if (-1 == (this.field_k.field_p ^ -1)) {
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
                                        var5 = -this.field_g.field_h + var4;
                                        if (var3_int < var5) {
                                          var5 = var3_int;
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        this.field_o.a(var5, true, this.field_g.field_g, this.field_g.field_h);
                                        if (this.field_m != 0) {
                                          var6 = 0;
                                          L13: while (true) {
                                            if (var5 <= var6) {
                                              break L12;
                                            } else {
                                              this.field_g.field_g[this.field_g.field_h + var6] = (byte)gi.a((int) this.field_g.field_g[this.field_g.field_h + var6], (int) this.field_m);
                                              var6++;
                                              continue L13;
                                            }
                                          }
                                        } else {
                                          break L12;
                                        }
                                      }
                                      this.field_g.field_h = this.field_g.field_h + var5;
                                      if (var4 > this.field_g.field_h) {
                                        break L10;
                                      } else {
                                        if (this.field_k == null) {
                                          L14: {
                                            this.field_g.field_h = 0;
                                            var6 = this.field_g.a((byte) 114);
                                            var7 = this.field_g.e(14);
                                            var8 = this.field_g.a((byte) 114);
                                            var9 = this.field_g.e(-107);
                                            var10 = 127 & var8;
                                            if (-1 == (128 & var8 ^ -1)) {
                                              stackIn_63_0 = 0;
                                              break L14;
                                            } else {
                                              stackIn_63_0 = 1;
                                              break L14;
                                            }
                                          }
                                          L15: {
                                            var11 = stackIn_63_0;
                                            var12 = ((long)var6 << 320106656) - -(long)var7;
                                            var14 = null;
                                            if (var11 != 0) {
                                              var14_ref = (ob) ((Object) this.field_c.a(true));
                                              L16: while (true) {
                                                if (var14_ref == null) {
                                                  break L15;
                                                } else {
                                                  if (var12 != var14_ref.field_f) {
                                                    var14_ref = (ob) ((Object) this.field_c.c((byte) -75));
                                                    continue L16;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                            } else {
                                              var14_ref = (ob) ((Object) this.field_j.a(true));
                                              L17: while (true) {
                                                if (var14_ref == null) {
                                                  break L15;
                                                } else {
                                                  if ((var12 ^ -1L) != (var14_ref.field_f ^ -1L)) {
                                                    var14_ref = (ob) ((Object) this.field_j.c((byte) -75));
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
                                              this.field_k = var14_ref;
                                              if (var10 != 0) {
                                                stackIn_79_0 = 9;
                                                break L18;
                                              } else {
                                                stackIn_79_0 = 5;
                                                break L18;
                                              }
                                            }
                                            var15 = stackIn_79_0;
                                            this.field_k.field_o = new gk(this.field_k.field_q + var9 + var15);
                                            this.field_k.field_o.b(var10, -49152);
                                            this.field_k.field_o.a(-803539344, var9);
                                            this.field_g.field_h = 0;
                                            this.field_k.field_p = 10;
                                            break L10;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (0 != this.field_k.field_p) {
                                            throw new IOException();
                                          } else {
                                            if (-1 != this.field_g.field_g[0]) {
                                              this.field_k = null;
                                              break L10;
                                            } else {
                                              this.field_g.field_h = 0;
                                              this.field_k.field_p = 1;
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L19: {
                                        var5 = this.field_k.field_o.field_g.length + -this.field_k.field_q;
                                        var6 = 512 + -this.field_k.field_p;
                                        if (-this.field_k.field_o.field_h + var5 >= var6) {
                                          break L19;
                                        } else {
                                          var6 = -this.field_k.field_o.field_h + var5;
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
                                        this.field_o.a(var6, true, this.field_k.field_o.field_g, this.field_k.field_o.field_h);
                                        if (this.field_m == 0) {
                                          break L21;
                                        } else {
                                          var7 = 0;
                                          L22: while (true) {
                                            if (var7 >= var6) {
                                              break L21;
                                            } else {
                                              this.field_k.field_o.field_g[this.field_k.field_o.field_h + var7] = (byte)gi.a((int) this.field_k.field_o.field_g[this.field_k.field_o.field_h + var7], (int) this.field_m);
                                              var7++;
                                              continue L22;
                                            }
                                          }
                                        }
                                      }
                                      this.field_k.field_p = this.field_k.field_p + var6;
                                      this.field_k.field_o.field_h = this.field_k.field_o.field_h + var6;
                                      if (this.field_k.field_o.field_h == var5) {
                                        this.field_k.a(7847);
                                        this.field_k.field_j = false;
                                        this.field_k = null;
                                        break L10;
                                      } else {
                                        if ((this.field_k.field_p ^ -1) != -513) {
                                          break L10;
                                        } else {
                                          this.field_k.field_p = 0;
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
                          this.field_l.field_h = 0;
                          this.field_l.b(0, -49152);
                          this.field_l.a(var2.field_f, -1268490168);
                          this.field_o.a(this.field_l.field_g, 0, (byte) 83, this.field_l.field_g.length);
                          this.field_c.a(var2, (byte) 127);
                          var2 = (ob) ((Object) this.field_i.c((byte) -75));
                          continue L6;
                        }
                      }
                    } else {
                      this.field_l.field_h = 0;
                      this.field_l.b(1, -49152);
                      this.field_l.a(var2.field_f, -1268490168);
                      this.field_o.a(this.field_l.field_g, 0, (byte) 80, this.field_l.field_g.length);
                      this.field_j.a(var2, (byte) 95);
                      var2 = (ob) ((Object) this.field_n.c((byte) -75));
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    this.field_o.a((byte) 73);
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
                  this.field_b = this.field_b + 1;
                  this.field_o = null;
                  this.field_a = -2;
                  if (-1 != (this.c(24547) ^ -1)) {
                    break L25;
                  } else {
                    if (this.d((byte) -25) == 0) {
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
                if (this.c(24547) != 0) {
                  break L26;
                } else {
                  if (this.d((byte) -25) != 0) {
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
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            ob var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            var6 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (this.field_o == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        this.field_o.a((byte) 73);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_o = null;
                    break L1;
                  }
                }
                this.field_o = (id) (param2);
                this.e(-1);
                this.a(param1, (byte) 109);
                this.field_k = null;
                this.field_g.field_h = 0;
                L4: while (true) {
                  var4_ref = (ob) ((Object) this.field_j.a((byte) -120));
                  if (var4_ref == null) {
                    L5: while (true) {
                      var4_ref = (ob) ((Object) this.field_c.a((byte) -120));
                      if (var4_ref == null) {
                        L6: {
                          if (this.field_m != 0) {
                            try {
                              L7: {
                                this.field_l.field_h = 0;
                                this.field_l.b(4, -49152);
                                this.field_l.b((int) this.field_m, -49152);
                                this.field_l.a(-803539344, 0);
                                this.field_o.a(this.field_l.field_g, 0, (byte) 57, this.field_l.field_g.length);
                                break L7;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L8: {
                                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L9: {
                                    this.field_o.a((byte) 73);
                                    break L9;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L10;
                                  }
                                }
                                this.field_o = null;
                                this.field_a = -2;
                                this.field_b = this.field_b + 1;
                                break L8;
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
                        this.field_h = 0;
                        this.field_e = pf.a(0);
                        break L0;
                      } else {
                        this.field_i.a(var4_ref, (byte) -9);
                        continue L5;
                      }
                    }
                  } else {
                    this.field_n.a(var4_ref, (byte) -108);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_26_0 = (RuntimeException) (var4_ref3);

                stackIn_26_1 = new StringBuilder().append("fa.E(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                  stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                  stackIn_27_2 = "null";
                  break L12;
                } else {
                  stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                  stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                  stackIn_27_2 = "{...}";
                  break L12;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        if (this.field_o != null) {
            this.field_o.a((byte) 73);
        }
        if (param0 != 7) {
            this.a(false, (byte) -93);
        }
    }

    public fa() {
    }

    private final void e(int param0) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (param0 == -1) {
              if (this.field_o != null) {
                try {
                  L0: {
                    this.field_l.field_h = 0;
                    this.field_l.b(6, -49152);
                    this.field_l.e(param0 + 122, 3);
                    this.field_l.c(0, 113);
                    this.field_o.a(this.field_l.field_g, 0, (byte) 23, this.field_l.field_g.length);
                    break L0;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L1: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    try {
                      L2: {
                        this.field_o.a((byte) 73);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L3: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_b = this.field_b + 1;
                    this.field_a = -2;
                    this.field_o = null;
                    break L1;
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

    final static void f(int param0) {
        int var2 = 0;
        he var3 = (he) ((Object) mb.field_e.a((byte) -117));
        he var1 = var3;
        if (!(var1 == null)) {
            var2 = em.field_B;
            lb.a(10, pl.field_j, (byte) -128, wc.field_e, var2, ii.field_B);
            ie.field_b[var3.field_h].b(25, var2 + 15);
            pl.field_e.a(rb.field_hb[var3.field_h], 67, var2 - -15, pl.field_j + -72, ii.field_B + -30, 1, -1, 1, 1, pl.field_e.field_C - -pl.field_e.field_D);
        }
        if (param0 != 1) {
            fa.f(47);
        }
    }

    static {
        field_r = 0;
    }
}

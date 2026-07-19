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
              if (this.field_p == null) {
                break L0;
              } else {
                L1: {
                  var2_long = wt.a(false);
                  var4 = (int)(var2_long + -this.field_h);
                  if ((var4 ^ -1) < -201) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_h = var2_long;
                this.field_m = this.field_m + var4;
                if ((this.field_m ^ -1) >= -30001) {
                  break L0;
                } else {
                  try {
                    L2: {
                      this.field_p.b(param0 + 1);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_p = null;
                  break L0;
                }
              }
            }
            if (null == this.field_p) {
              if (0 != this.f(param0 ^ 13223)) {
                return false;
              } else {
                if (this.b(-3666) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L4: {
                  this.field_p.a((byte) 115);
                  var2_ref = (km) ((Object) this.field_a.a((byte) -54));
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (km) ((Object) this.field_c.a((byte) -54));
                      L6: while (true) {
                        if (var2_ref == null) {
                          var2_int = param0;
                          L7: while (true) {
                            L8: {
                              if (-101 >= (var2_int ^ -1)) {
                                break L8;
                              } else {
                                var3_int = this.field_p.c(0);
                                if (0 > var3_int) {
                                  throw new IOException();
                                } else {
                                  if (var3_int == 0) {
                                    break L8;
                                  } else {
                                    L9: {
                                      this.field_m = 0;
                                      var4 = 0;
                                      if (null == this.field_b) {
                                        var4 = 10;
                                        break L9;
                                      } else {
                                        if (this.field_b.field_r != 0) {
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
                                          var5 = -this.field_i.field_e + var4;
                                          if (var5 > var3_int) {
                                            var5 = var3_int;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          this.field_p.a(-122, this.field_i.field_e, var5, this.field_i.field_h);
                                          if (0 == this.field_j) {
                                            break L12;
                                          } else {
                                            var6 = 0;
                                            L13: while (true) {
                                              if (var6 >= var5) {
                                                break L12;
                                              } else {
                                                this.field_i.field_h[this.field_i.field_e + var6] = (byte)mgb.a((int) this.field_i.field_h[this.field_i.field_e + var6], (int) this.field_j);
                                                var6++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                        this.field_i.field_e = this.field_i.field_e + var5;
                                        if (var4 <= this.field_i.field_e) {
                                          if (this.field_b != null) {
                                            if (0 != this.field_b.field_r) {
                                              throw new IOException();
                                            } else {
                                              if (this.field_i.field_h[0] != -1) {
                                                this.field_b = null;
                                                break L10;
                                              } else {
                                                this.field_i.field_e = 0;
                                                this.field_b.field_r = 1;
                                                break L10;
                                              }
                                            }
                                          } else {
                                            L14: {
                                              this.field_i.field_e = 0;
                                              var6 = this.field_i.e((byte) -126);
                                              var7 = this.field_i.h(125);
                                              var8 = this.field_i.e((byte) -125);
                                              var9 = this.field_i.h(24);
                                              var10 = var8 & 127;
                                              if (-1 == (128 & var8 ^ -1)) {
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
                                              var12 = (long)var7 + ((long)var6 << 2030684384);
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (km) ((Object) this.field_d.a((byte) -54));
                                                L16: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if ((var14_ref.field_i ^ -1L) != (var12 ^ -1L)) {
                                                      var14_ref = (km) ((Object) this.field_d.a(1900));
                                                      continue L16;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (km) ((Object) this.field_f.a((byte) -54));
                                                L17: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if (var14_ref.field_i != var12) {
                                                      var14_ref = (km) ((Object) this.field_f.a(1900));
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
                                              this.field_b = var14_ref;
                                              this.field_b.field_p = new ds(this.field_b.field_q + var9 + var15);
                                              this.field_b.field_p.c(0, var10);
                                              this.field_b.field_p.d(var9, param0 + 332614536);
                                              this.field_i.field_e = 0;
                                              this.field_b.field_r = 10;
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
                                          var5 = -this.field_b.field_q + this.field_b.field_p.field_h.length;
                                          var6 = 512 - this.field_b.field_r;
                                          if (var6 > var5 + -this.field_b.field_p.field_e) {
                                            var6 = -this.field_b.field_p.field_e + var5;
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
                                          this.field_p.a(param0 ^ -126, this.field_b.field_p.field_e, var6, this.field_b.field_p.field_h);
                                          if (this.field_j != 0) {
                                            var7 = 0;
                                            L22: while (true) {
                                              if (var7 >= var6) {
                                                break L21;
                                              } else {
                                                this.field_b.field_p.field_h[var7 + this.field_b.field_p.field_e] = (byte)mgb.a((int) this.field_b.field_p.field_h[var7 + this.field_b.field_p.field_e], (int) this.field_j);
                                                var7++;
                                                continue L22;
                                              }
                                            }
                                          } else {
                                            break L21;
                                          }
                                        }
                                        this.field_b.field_r = this.field_b.field_r + var6;
                                        this.field_b.field_p.field_e = this.field_b.field_p.field_e + var6;
                                        if (var5 != this.field_b.field_p.field_e) {
                                          if ((this.field_b.field_r ^ -1) == -513) {
                                            this.field_b.field_r = 0;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          this.field_b.d((byte) -35);
                                          this.field_b.field_n = false;
                                          this.field_b = null;
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
                          this.field_e.field_e = 0;
                          this.field_e.c(0, 0);
                          this.field_e.a(100, var2_ref.field_i);
                          this.field_p.a(0, this.field_e.field_h, this.field_e.field_h.length, 0);
                          this.field_f.a(var2_ref, -65);
                          var2_ref = (km) ((Object) this.field_c.a(1900));
                          continue L6;
                        }
                      }
                    } else {
                      this.field_e.field_e = 0;
                      this.field_e.c(0, 1);
                      this.field_e.a(117, var2_ref.field_i);
                      this.field_p.a(0, this.field_e.field_h, this.field_e.field_h.length, 0);
                      this.field_d.a(var2_ref, -84);
                      var2_ref = (km) ((Object) this.field_a.a(param0 + 1900));
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    this.field_p.b(1);
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
                  this.field_g = this.field_g + 1;
                  this.field_p = null;
                  this.field_k = -2;
                  if (-1 != (this.f(13223) ^ -1)) {
                    break L25;
                  } else {
                    if (-1 == (this.b(param0 + -3666) ^ -1)) {
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
              if (this.field_p != null) {
                try {
                  L0: {
                    L1: {
                      this.field_e.field_e = 0;
                      stackOut_4_0 = this.field_e;
                      stackOut_4_1 = 0;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (param1) {
                        stackOut_6_0 = (ds) ((Object) stackIn_6_0);
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = 2;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        break L1;
                      } else {
                        stackOut_5_0 = (ds) ((Object) stackIn_5_0);
                        stackOut_5_1 = stackIn_5_1;
                        stackOut_5_2 = 3;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_7_2 = stackOut_5_2;
                        break L1;
                      }
                    }
                    ((ds) (Object) stackIn_7_0).c(stackIn_7_1, stackIn_7_2);
                    this.field_e.a(param0 ^ -50, 0L);
                    this.field_p.a(0, this.field_e.field_h, this.field_e.field_h.length, 0);
                    break L0;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    try {
                      L3: {
                        this.field_p.b(1);
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L4: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    this.field_k = -2;
                    this.field_g = this.field_g + 1;
                    this.field_p = null;
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
        boolean discarded$0 = false;
        field_o = null;
        if (param0 != 0) {
            discarded$0 = wh.g(-53);
        }
    }

    private final void i(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (this.field_p == null) {
              return;
            } else {
              try {
                L0: {
                  this.field_e.field_e = 0;
                  this.field_e.c(0, 6);
                  this.field_e.a(3, (byte) 125);
                  this.field_e.a(0, true);
                  this.field_p.a(param0 ^ param0, this.field_e.field_h, this.field_e.field_h.length, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      this.field_p.b(1);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_g = this.field_g + 1;
                  this.field_p = null;
                  this.field_k = -2;
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

    public wh() {
    }

    final void a(byte param0) {
        try {
            this.field_p.b(1);
        } catch (Exception exception) {
        }
        this.field_g = this.field_g + 1;
        this.field_p = null;
        this.field_k = -1;
        if (param0 != -25) {
            field_o = (kb) null;
        }
        this.field_j = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final static boolean g(int param0) {
        boolean discarded$2 = false;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -113) {
            break L0;
          } else {
            discarded$2 = wh.a(-4, (byte) 35, 31);
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
            field_o = (kb) null;
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
        if (!(null == this.field_p)) {
            this.field_p.b(1);
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
                  if (null != this.field_p) {
                    try {
                      L2: {
                        this.field_p.b(1);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_p = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_p = (lpb) (param0);
                this.i(7571);
                this.a((byte) -65, param1);
                this.field_b = null;
                this.field_i.field_e = 0;
                L4: while (true) {
                  var4_ref3 = (km) ((Object) this.field_d.b((byte) 87));
                  if (var4_ref3 == null) {
                    L5: while (true) {
                      var4_ref3 = (km) ((Object) this.field_f.b((byte) 109));
                      if (var4_ref3 == null) {
                        L6: {
                          if (0 != this.field_j) {
                            try {
                              L7: {
                                this.field_e.field_e = 0;
                                this.field_e.c(0, 4);
                                this.field_e.c(0, (int) this.field_j);
                                this.field_e.d(0, 332614536);
                                this.field_p.a(0, this.field_e.field_h, this.field_e.field_h.length, 0);
                                break L7;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L8: {
                                var4_ref = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L9: {
                                    this.field_p.b(1);
                                    break L9;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L10;
                                  }
                                }
                                this.field_p = null;
                                this.field_g = this.field_g + 1;
                                this.field_k = -2;
                                break L8;
                              }
                            }
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L11: {
                          this.field_m = 0;
                          if (!param2) {
                            break L11;
                          } else {
                            wh.h(-98);
                            break L11;
                          }
                        }
                        this.field_h = wt.a(param2);
                        break L0;
                      } else {
                        this.field_c.a(var4_ref3, -86);
                        continue L5;
                      }
                    }
                  } else {
                    this.field_a.a(var4_ref3, -116);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_25_0 = (RuntimeException) (var4_ref2);
                stackOut_25_1 = new StringBuilder().append("wh.E(");
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                if (param0 == null) {
                  stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
                  stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
                  stackOut_27_2 = "null";
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  stackIn_28_2 = stackOut_27_2;
                  break L12;
                } else {
                  stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
                  stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
                  stackOut_26_2 = "{...}";
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  break L12;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_o = new kb(2);
        field_n = 0;
    }
}

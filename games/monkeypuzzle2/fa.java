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
            if (null == this.field_o) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_l.field_h = 0;
                    stackOut_3_0 = this.field_l;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (!param0) {
                      stackOut_5_0 = (gk) ((Object) stackIn_5_0);
                      stackOut_5_1 = 3;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L1;
                    } else {
                      stackOut_4_0 = (gk) ((Object) stackIn_4_0);
                      stackOut_4_1 = 2;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
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
            int stackIn_32_0 = 0;
            int stackIn_79_0 = 0;
            int stackIn_83_0 = 0;
            int stackIn_90_0 = 0;
            int stackIn_97_0 = 0;
            int stackIn_100_0 = 0;
            int stackIn_110_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_31_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_89_0 = 0;
            int stackOut_82_0 = 0;
            int stackOut_96_0 = 0;
            int stackOut_99_0 = 0;
            int stackOut_98_0 = 0;
            int stackOut_109_0 = 0;
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
                  var2_ref = (ob) ((Object) this.field_n.a(true));
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var2_ref == null) {
                          break L7;
                        } else {
                          this.field_l.field_h = 0;
                          this.field_l.b(1, -49152);
                          this.field_l.a(var2_ref.field_f, -1268490168);
                          this.field_o.a(this.field_l.field_g, 0, (byte) 80, this.field_l.field_g.length);
                          this.field_j.a(var2_ref, (byte) 95);
                          var2_ref = (ob) ((Object) this.field_n.c((byte) -75));
                          if (var16 != 0) {
                            break L6;
                          } else {
                            if (var16 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      var2_ref = (ob) ((Object) this.field_i.a(true));
                      break L6;
                    }
                    L8: while (true) {
                      L9: {
                        L10: {
                          if (var2_ref == null) {
                            break L10;
                          } else {
                            this.field_l.field_h = 0;
                            this.field_l.b(0, -49152);
                            this.field_l.a(var2_ref.field_f, -1268490168);
                            this.field_o.a(this.field_l.field_g, 0, (byte) 83, this.field_l.field_g.length);
                            this.field_c.a(var2_ref, (byte) 127);
                            var2_ref = (ob) ((Object) this.field_i.c((byte) -75));
                            if (var16 != 0) {
                              break L9;
                            } else {
                              if (var16 == 0) {
                                continue L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        if (param0 < -33) {
                          break L9;
                        } else {
                          this.b((byte) -60);
                          break L9;
                        }
                      }
                      var2_int = 0;
                      L11: while (true) {
                        L12: {
                          L13: {
                            if (-101 >= (var2_int ^ -1)) {
                              break L13;
                            } else {
                              var3_int = this.field_o.c(126);
                              stackOut_31_0 = var3_int;
                              stackIn_110_0 = stackOut_31_0;
                              stackIn_32_0 = stackOut_31_0;
                              if (var16 != 0) {
                                break L12;
                              } else {
                                if (stackIn_32_0 < 0) {
                                  throw new IOException();
                                } else {
                                  L14: {
                                    if (-1 != (var3_int ^ -1)) {
                                      break L14;
                                    } else {
                                      if (var16 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      this.field_h = 0;
                                      var4 = 0;
                                      if (null != this.field_k) {
                                        break L16;
                                      } else {
                                        var4 = 10;
                                        if (var16 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    if (-1 == (this.field_k.field_p ^ -1)) {
                                      var4 = 1;
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L17: {
                                    L18: {
                                      if (var4 > 0) {
                                        break L18;
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
                                          L22: {
                                            this.field_o.a(var6, true, this.field_k.field_o.field_g, this.field_k.field_o.field_h);
                                            if (this.field_m == 0) {
                                              break L22;
                                            } else {
                                              var7 = 0;
                                              L23: while (true) {
                                                if (var7 >= var6) {
                                                  break L22;
                                                } else {
                                                  this.field_k.field_o.field_g[this.field_k.field_o.field_h + var7] = (byte)gi.a((int) this.field_k.field_o.field_g[this.field_k.field_o.field_h + var7], (int) this.field_m);
                                                  var7++;
                                                  if (var16 != 0) {
                                                    break L21;
                                                  } else {
                                                    continue L23;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          this.field_k.field_p = this.field_k.field_p + var6;
                                          this.field_k.field_o.field_h = this.field_k.field_o.field_h + var6;
                                          break L21;
                                        }
                                        L24: {
                                          if (this.field_k.field_o.field_h == var5) {
                                            break L24;
                                          } else {
                                            if ((this.field_k.field_p ^ -1) != -513) {
                                              break L17;
                                            } else {
                                              this.field_k.field_p = 0;
                                              if (var16 == 0) {
                                                break L17;
                                              } else {
                                                break L24;
                                              }
                                            }
                                          }
                                        }
                                        this.field_k.a(7847);
                                        this.field_k.field_j = false;
                                        this.field_k = null;
                                        if (var16 == 0) {
                                          break L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    L25: {
                                      var5 = -this.field_g.field_h + var4;
                                      if (var3_int < var5) {
                                        var5 = var3_int;
                                        break L25;
                                      } else {
                                        break L25;
                                      }
                                    }
                                    L26: {
                                      L27: {
                                        this.field_o.a(var5, true, this.field_g.field_g, this.field_g.field_h);
                                        if (this.field_m != 0) {
                                          var6 = 0;
                                          L28: while (true) {
                                            if (var5 <= var6) {
                                              break L27;
                                            } else {
                                              this.field_g.field_g[this.field_g.field_h + var6] = (byte)gi.a((int) this.field_g.field_g[this.field_g.field_h + var6], (int) this.field_m);
                                              var6++;
                                              if (var16 != 0) {
                                                break L26;
                                              } else {
                                                continue L28;
                                              }
                                            }
                                          }
                                        } else {
                                          break L27;
                                        }
                                      }
                                      this.field_g.field_h = this.field_g.field_h + var5;
                                      break L26;
                                    }
                                    if (var4 > this.field_g.field_h) {
                                      break L17;
                                    } else {
                                      L29: {
                                        if (this.field_k == null) {
                                          L30: {
                                            this.field_g.field_h = 0;
                                            var6 = this.field_g.a((byte) 114);
                                            var7 = this.field_g.e(14);
                                            var8 = this.field_g.a((byte) 114);
                                            var9 = this.field_g.e(-107);
                                            var10 = 127 & var8;
                                            if (-1 == (128 & var8 ^ -1)) {
                                              stackOut_78_0 = 0;
                                              stackIn_79_0 = stackOut_78_0;
                                              break L30;
                                            } else {
                                              stackOut_77_0 = 1;
                                              stackIn_79_0 = stackOut_77_0;
                                              break L30;
                                            }
                                          }
                                          L31: {
                                            L32: {
                                              var11 = stackIn_79_0;
                                              var12 = ((long)var6 << 320106656) - -(long)var7;
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (ob) ((Object) this.field_c.a(true));
                                                L33: while (true) {
                                                  if (var14_ref == null) {
                                                    break L32;
                                                  } else {
                                                    stackOut_89_0 = (var12 < var14_ref.field_f ? -1 : (var12 == var14_ref.field_f ? 0 : 1));
                                                    stackIn_97_0 = stackOut_89_0;
                                                    stackIn_90_0 = stackOut_89_0;
                                                    if (var16 != 0) {
                                                      break L31;
                                                    } else {
                                                      L34: {
                                                        if (stackIn_90_0 != 0) {
                                                          break L34;
                                                        } else {
                                                          if (var16 == 0) {
                                                            break L32;
                                                          } else {
                                                            break L34;
                                                          }
                                                        }
                                                      }
                                                      var14_ref = (ob) ((Object) this.field_c.c((byte) -75));
                                                      if (var16 == 0) {
                                                        continue L33;
                                                      } else {
                                                        break L32;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (ob) ((Object) this.field_j.a(true));
                                                L35: while (true) {
                                                  if (var14_ref == null) {
                                                    break L32;
                                                  } else {
                                                    stackOut_82_0 = ((var12 ^ -1L) < (var14_ref.field_f ^ -1L) ? -1 : ((var12 ^ -1L) == (var14_ref.field_f ^ -1L) ? 0 : 1));
                                                    stackIn_97_0 = stackOut_82_0;
                                                    stackIn_83_0 = stackOut_82_0;
                                                    if (var16 != 0) {
                                                      break L31;
                                                    } else {
                                                      L36: {
                                                        if (stackIn_83_0 != 0) {
                                                          break L36;
                                                        } else {
                                                          if (var16 == 0) {
                                                            break L32;
                                                          } else {
                                                            break L36;
                                                          }
                                                        }
                                                      }
                                                      var14_ref = (ob) ((Object) this.field_j.c((byte) -75));
                                                      continue L35;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref != null) {
                                              this.field_k = var14_ref;
                                              stackOut_96_0 = var10 ^ -1;
                                              stackIn_97_0 = stackOut_96_0;
                                              break L31;
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                          L37: {
                                            if (stackIn_97_0 != -1) {
                                              stackOut_99_0 = 9;
                                              stackIn_100_0 = stackOut_99_0;
                                              break L37;
                                            } else {
                                              stackOut_98_0 = 5;
                                              stackIn_100_0 = stackOut_98_0;
                                              break L37;
                                            }
                                          }
                                          var15 = stackIn_100_0;
                                          this.field_k.field_o = new gk(this.field_k.field_q + var9 + var15);
                                          this.field_k.field_o.b(var10, -49152);
                                          this.field_k.field_o.a(-803539344, var9);
                                          this.field_g.field_h = 0;
                                          this.field_k.field_p = 10;
                                          if (var16 == 0) {
                                            break L17;
                                          } else {
                                            break L29;
                                          }
                                        } else {
                                          break L29;
                                        }
                                      }
                                      L38: {
                                        if (0 != this.field_k.field_p) {
                                          break L38;
                                        } else {
                                          L39: {
                                            if (-1 != this.field_g.field_g[0]) {
                                              break L39;
                                            } else {
                                              this.field_g.field_h = 0;
                                              this.field_k.field_p = 1;
                                              if (var16 == 0) {
                                                break L17;
                                              } else {
                                                break L39;
                                              }
                                            }
                                          }
                                          this.field_k = null;
                                          if (var16 == 0) {
                                            break L17;
                                          } else {
                                            break L38;
                                          }
                                        }
                                      }
                                      throw new IOException();
                                    }
                                  }
                                  var2_int++;
                                  if (var16 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_109_0 = 1;
                          stackIn_110_0 = stackOut_109_0;
                          break L12;
                        }
                        break L4;
                      }
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L40: {
                    this.field_o.a((byte) 73);
                    break L40;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L41: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L41;
                  }
                }
                this.field_b = this.field_b + 1;
                this.field_o = null;
                this.field_a = -2;
                if (-1 == (this.c(24547) ^ -1)) {
                  if (this.d((byte) -25) != 0) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
              return stackIn_110_0 != 0;
            } else {
              if (this.c(24547) == 0) {
                if (this.d((byte) -25) == 0) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
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
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            String stackIn_32_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            RuntimeException stackOut_31_0 = null;
            StringBuilder stackOut_31_1 = null;
            String stackOut_31_2 = null;
            RuntimeException stackOut_30_0 = null;
            StringBuilder stackOut_30_1 = null;
            String stackOut_30_2 = null;
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
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          var4_ref3 = (ob) ((Object) this.field_j.a((byte) -120));
                          if (var4_ref3 == null) {
                            break L8;
                          } else {
                            this.field_n.a(var4_ref3, (byte) -108);
                            if (var6 != 0) {
                              L9: while (true) {
                                if (var4_ref3 == null) {
                                  break L6;
                                } else {
                                  this.field_i.a(var4_ref3, (byte) -9);
                                  if (var6 != 0) {
                                    break L5;
                                  } else {
                                    if (var6 == 0) {
                                      var4_ref3 = (ob) ((Object) this.field_c.a((byte) -120));
                                      continue L9;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (var6 == 0) {
                                continue L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        L10: while (true) {
                          var4_ref3 = (ob) ((Object) this.field_c.a((byte) -120));
                          if (var4_ref3 == null) {
                            break L6;
                          } else {
                            this.field_i.a(var4_ref3, (byte) -9);
                            if (var6 != 0) {
                              break L5;
                            } else {
                              if (var6 == 0) {
                                continue L10;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      break L6;
                    }
                    if (this.field_m != 0) {
                      try {
                        L11: {
                          this.field_l.field_h = 0;
                          this.field_l.b(4, -49152);
                          this.field_l.b((int) this.field_m, -49152);
                          this.field_l.a(-803539344, 0);
                          this.field_o.a(this.field_l.field_g, 0, (byte) 57, this.field_l.field_g.length);
                          break L11;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L12: {
                          var4_ref = (IOException) (Object) decompiledCaughtException;
                          try {
                            L13: {
                              this.field_o.a((byte) 73);
                              break L13;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            L14: {
                              var5 = (Exception) (Object) decompiledCaughtException;
                              break L14;
                            }
                          }
                          this.field_o = null;
                          this.field_a = -2;
                          this.field_b = this.field_b + 1;
                          break L12;
                        }
                      }
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L15: {
                    if (param0 < -84) {
                      break L15;
                    } else {
                      field_r = 64;
                      break L15;
                    }
                  }
                  this.field_h = 0;
                  this.field_e = pf.a(0);
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L16: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_29_0 = (RuntimeException) (var4_ref2);
                stackOut_29_1 = new StringBuilder().append("fa.E(").append(param0).append(',').append(param1).append(',');
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                if (param2 == null) {
                  stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
                  stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
                  stackOut_31_2 = "null";
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  stackIn_32_2 = stackOut_31_2;
                  break L16;
                } else {
                  stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
                  stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
                  stackOut_30_2 = "{...}";
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_32_1 = stackOut_30_1;
                  stackIn_32_2 = stackOut_30_2;
                  break L16;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
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
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
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
        int discarded$0 = 0;
        he var3 = (he) ((Object) mb.field_e.a((byte) -117));
        he var1 = var3;
        if (!(var1 == null)) {
            var2 = em.field_B;
            lb.a(10, pl.field_j, (byte) -128, wc.field_e, var2, ii.field_B);
            ie.field_b[var3.field_h].b(25, var2 + 15);
            discarded$0 = pl.field_e.a(rb.field_hb[var3.field_h], 67, var2 - -15, pl.field_j + -72, ii.field_B + -30, 1, -1, 1, 1, pl.field_e.field_C - -pl.field_e.field_D);
        }
        if (param0 != 1) {
            fa.f(47);
        }
    }

    static {
        field_r = 0;
    }
}

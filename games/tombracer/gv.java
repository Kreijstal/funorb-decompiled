/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gv extends qda {
    private jqa field_t;
    static int[] field_q;
    static jpa field_s;
    static String field_r;
    static int field_u;
    static String field_v;
    static String[] field_w;

    public gv() {
    }

    public static void a(boolean param0) {
        field_v = null;
        field_q = null;
        field_s = null;
        field_r = null;
        if (param0) {
            return;
        }
        field_w = null;
    }

    final void a(int param0) {
        if (!(null == this.field_t)) {
            this.field_t.a((byte) 105);
        }
        if (param0 != -21) {
            field_v = (String) null;
        }
    }

    final void a(Object param0, byte param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            qqa var4_ref3 = null;
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
            var6 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (this.field_t != null) {
                    try {
                      L2: {
                        this.field_t.a((byte) 105);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_t = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L4: {
                  this.field_t = (jqa) (param0);
                  this.g(param1 + -104);
                  if (param1 == 54) {
                    break L4;
                  } else {
                    field_w = (String[]) null;
                    break L4;
                  }
                }
                this.a((byte) 117, param2);
                this.field_h.field_h = 0;
                this.field_g = null;
                L5: while (true) {
                  L6: {
                    L7: {
                      L8: {
                        L9: {
                          var4_ref3 = (qqa) ((Object) this.field_m.c((byte) 121));
                          if (var4_ref3 == null) {
                            break L9;
                          } else {
                            this.field_e.a(var4_ref3, (byte) -81);
                            if (var6 != 0) {
                              L10: while (true) {
                                if (var4_ref3 == null) {
                                  break L7;
                                } else {
                                  this.field_c.a(var4_ref3, (byte) -104);
                                  if (var6 != 0) {
                                    break L6;
                                  } else {
                                    if (var6 == 0) {
                                      var4_ref3 = (qqa) ((Object) this.field_k.c((byte) 111));
                                      continue L10;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (var6 == 0) {
                                continue L5;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        L11: while (true) {
                          var4_ref3 = (qqa) ((Object) this.field_k.c((byte) 111));
                          if (var4_ref3 == null) {
                            break L7;
                          } else {
                            this.field_c.a(var4_ref3, (byte) -104);
                            if (var6 != 0) {
                              break L6;
                            } else {
                              if (var6 == 0) {
                                continue L11;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      break L7;
                    }
                    L12: {
                      if ((this.field_d ^ -1) == -1) {
                        break L12;
                      } else {
                        try {
                          L13: {
                            this.field_o.field_h = 0;
                            this.field_o.i(4, param1 + -54);
                            this.field_o.i((int) this.field_d, param1 ^ 54);
                            this.field_o.a(0, (byte) -17);
                            this.field_t.a(this.field_o.field_g, 0, this.field_o.field_g.length, 124);
                            break L13;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L14: {
                            var4_ref = (IOException) (Object) decompiledCaughtException;
                            try {
                              L15: {
                                this.field_t.a((byte) 105);
                                break L15;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter2) {
                              decompiledCaughtException = decompiledCaughtParameter2;
                              L16: {
                                var5 = (Exception) (Object) decompiledCaughtException;
                                break L16;
                              }
                            }
                            this.field_n = -2;
                            this.field_t = null;
                            this.field_a = this.field_a + 1;
                            break L14;
                          }
                        }
                        break L12;
                      }
                    }
                    this.field_p = 0;
                    this.field_j = bva.b((byte) -107);
                    break L6;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L17: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_29_0 = (RuntimeException) (var4_ref2);
                stackOut_29_1 = new StringBuilder().append("gv.D(");
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                if (param0 == null) {
                  stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
                  stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
                  stackOut_31_2 = "null";
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  stackIn_32_2 = stackOut_31_2;
                  break L17;
                } else {
                  stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
                  stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
                  stackOut_30_2 = "{...}";
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_32_1 = stackOut_30_1;
                  stackIn_32_2 = stackOut_30_2;
                  break L17;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ')');
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
            uia stackIn_3_0 = null;
            uia stackIn_4_0 = null;
            uia stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            Throwable decompiledCaughtException = null;
            uia stackOut_2_0 = null;
            uia stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            uia stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            if (null != this.field_t) {
              try {
                L0: {
                  L1: {
                    this.field_o.field_h = 0;
                    stackOut_2_0 = this.field_o;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (!param1) {
                      stackOut_4_0 = (uia) ((Object) stackIn_4_0);
                      stackOut_4_1 = 3;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      break L1;
                    } else {
                      stackOut_3_0 = (uia) ((Object) stackIn_3_0);
                      stackOut_3_1 = 2;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      break L1;
                    }
                  }
                  ((uia) (Object) stackIn_5_0).i(stackIn_5_1, 0);
                  this.field_o.a(true, 0L);
                  this.field_t.a(this.field_o.field_g, 0, this.field_o.field_g.length, 124);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_t.a((byte) 105);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_t = null;
                  this.field_a = this.field_a + 1;
                  this.field_n = -2;
                  break L2;
                }
              }
              L5: {
                if (param0 == 117) {
                  break L5;
                } else {
                  field_r = (String) null;
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

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        L0: {
          if (param5 == 0) {
            break L0;
          } else {
            gv.a(true);
            break L0;
          }
        }
        L1: {
          var10 = -(param2 * param7 / param8) + param6;
          if ((var10 ^ -1) > (param0 ^ -1)) {
            break L1;
          } else {
            if ((param9 ^ -1) > (var10 ^ -1)) {
              break L1;
            } else {
              L2: {
                if (param3 > param6) {
                  if (var10 < param6) {
                    break L1;
                  } else {
                    if (var10 > param3) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  if (param3 > var10) {
                    break L1;
                  } else {
                    if ((var10 ^ -1) < (param6 ^ -1)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var11 = -(param2 << param1) / param8;
              if ((var11 ^ -1) > -1) {
                break L1;
              } else {
                if (1 << param1 <= var11) {
                  break L1;
                } else {
                  L3: {
                    if (0 == (param4 ^ -1)) {
                      break L3;
                    } else {
                      if ((param4 ^ -1) >= (var11 ^ -1)) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  return var11;
                }
              }
            }
          }
        }
        return param4;
    }

    final boolean c(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            qqa var2_ref = null;
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
            qqa var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_28_0 = 0;
            int stackIn_28_1 = 0;
            int stackIn_71_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_80_0 = 0;
            int stackIn_88_0 = 0;
            int stackIn_91_0 = 0;
            int stackIn_101_0 = 0;
            int stackIn_101_1 = 0;
            int stackIn_104_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_27_0 = 0;
            int stackOut_27_1 = 0;
            int stackOut_70_0 = 0;
            int stackOut_69_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_87_0 = 0;
            int stackOut_90_0 = 0;
            int stackOut_89_0 = 0;
            int stackOut_100_0 = 0;
            int stackOut_100_1 = 0;
            int stackOut_103_0 = 0;
            L0: {
              var16 = TombRacer.field_G ? 1 : 0;
              if (null == this.field_t) {
                break L0;
              } else {
                L1: {
                  var2_long = bva.b((byte) -107);
                  var4 = (int)(-this.field_j + var2_long);
                  this.field_j = var2_long;
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                this.field_p = this.field_p + var4;
                if (-30001 > (this.field_p ^ -1)) {
                  try {
                    L2: {
                      this.field_t.a((byte) 105);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_t = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (this.field_t == null) {
              if ((this.f(-3) ^ -1) != -1) {
                return false;
              } else {
                if ((this.a((byte) 78) ^ -1) == -1) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L4: {
                  this.field_t.b(102);
                  var2_ref = (qqa) ((Object) this.field_e.b((byte) 38));
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var2_ref == null) {
                          break L7;
                        } else {
                          this.field_o.field_h = 0;
                          this.field_o.i(1, 0);
                          this.field_o.a(true, var2_ref.field_j);
                          this.field_t.a(this.field_o.field_g, 0, this.field_o.field_g.length, 119);
                          this.field_m.a(var2_ref, (byte) -100);
                          var2_ref = (qqa) ((Object) this.field_e.c(28));
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
                      var2_ref = (qqa) ((Object) this.field_c.b((byte) 38));
                      break L6;
                    }
                    L8: while (true) {
                      L9: {
                        if (var2_ref == null) {
                          break L9;
                        } else {
                          this.field_o.field_h = 0;
                          this.field_o.i(0, 0);
                          this.field_o.a(true, var2_ref.field_j);
                          this.field_t.a(this.field_o.field_g, 0, this.field_o.field_g.length, 101);
                          this.field_k.a(var2_ref, (byte) -99);
                          var2_ref = (qqa) ((Object) this.field_c.c(28));
                          if (var16 == 0) {
                            continue L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var2_int = 0;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if (var2_int >= 100) {
                              break L12;
                            } else {
                              var3_int = this.field_t.c(0);
                              stackOut_27_0 = 0;
                              stackOut_27_1 = var3_int;
                              stackIn_101_0 = stackOut_27_0;
                              stackIn_101_1 = stackOut_27_1;
                              stackIn_28_0 = stackOut_27_0;
                              stackIn_28_1 = stackOut_27_1;
                              if (var16 != 0) {
                                break L11;
                              } else {
                                if (stackIn_28_0 > stackIn_28_1) {
                                  throw new IOException();
                                } else {
                                  if ((var3_int ^ -1) == -1) {
                                    break L12;
                                  } else {
                                    L13: {
                                      L14: {
                                        this.field_p = 0;
                                        var4 = 0;
                                        if (this.field_g != null) {
                                          break L14;
                                        } else {
                                          var4 = 10;
                                          if (var16 == 0) {
                                            break L13;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      if ((this.field_g.field_s ^ -1) == -1) {
                                        var4 = 1;
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L15: {
                                      L16: {
                                        if (var4 > 0) {
                                          break L16;
                                        } else {
                                          L17: {
                                            var5 = this.field_g.field_r.field_g.length - this.field_g.field_q;
                                            var6 = -this.field_g.field_s + 512;
                                            if ((var5 + -this.field_g.field_r.field_h ^ -1) <= (var6 ^ -1)) {
                                              break L17;
                                            } else {
                                              var6 = -this.field_g.field_r.field_h + var5;
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            if ((var6 ^ -1) >= (var3_int ^ -1)) {
                                              break L18;
                                            } else {
                                              var6 = var3_int;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            L20: {
                                              this.field_t.a(0, this.field_g.field_r.field_h, this.field_g.field_r.field_g, var6);
                                              if ((this.field_d ^ -1) != -1) {
                                                var7 = 0;
                                                L21: while (true) {
                                                  if ((var7 ^ -1) <= (var6 ^ -1)) {
                                                    break L20;
                                                  } else {
                                                    this.field_g.field_r.field_g[this.field_g.field_r.field_h - -var7] = (byte)kha.b((int) this.field_g.field_r.field_g[this.field_g.field_r.field_h + var7], (int) this.field_d);
                                                    var7++;
                                                    if (var16 != 0) {
                                                      break L19;
                                                    } else {
                                                      if (var16 == 0) {
                                                        continue L21;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L20;
                                              }
                                            }
                                            this.field_g.field_s = this.field_g.field_s + var6;
                                            this.field_g.field_r.field_h = this.field_g.field_r.field_h + var6;
                                            break L19;
                                          }
                                          L22: {
                                            if (var5 != this.field_g.field_r.field_h) {
                                              break L22;
                                            } else {
                                              this.field_g.c(-7975);
                                              this.field_g.field_m = false;
                                              this.field_g = null;
                                              if (var16 == 0) {
                                                break L15;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          if (-513 != (this.field_g.field_s ^ -1)) {
                                            break L15;
                                          } else {
                                            this.field_g.field_s = 0;
                                            if (var16 == 0) {
                                              break L15;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                      }
                                      L23: {
                                        var5 = -this.field_h.field_h + var4;
                                        if ((var3_int ^ -1) <= (var5 ^ -1)) {
                                          break L23;
                                        } else {
                                          var5 = var3_int;
                                          break L23;
                                        }
                                      }
                                      L24: {
                                        L25: {
                                          this.field_t.a(0, this.field_h.field_h, this.field_h.field_g, var5);
                                          if (0 != this.field_d) {
                                            var6 = 0;
                                            L26: while (true) {
                                              if ((var5 ^ -1) >= (var6 ^ -1)) {
                                                break L25;
                                              } else {
                                                this.field_h.field_g[var6 + this.field_h.field_h] = (byte)kha.b((int) this.field_h.field_g[var6 + this.field_h.field_h], (int) this.field_d);
                                                var6++;
                                                if (var16 != 0) {
                                                  break L24;
                                                } else {
                                                  if (var16 == 0) {
                                                    continue L26;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            break L25;
                                          }
                                        }
                                        this.field_h.field_h = this.field_h.field_h + var5;
                                        break L24;
                                      }
                                      if ((var4 ^ -1) < (this.field_h.field_h ^ -1)) {
                                        break L15;
                                      } else {
                                        L27: {
                                          if (this.field_g != null) {
                                            break L27;
                                          } else {
                                            L28: {
                                              this.field_h.field_h = 0;
                                              var6 = this.field_h.h(255);
                                              var7 = this.field_h.e(105);
                                              var8 = this.field_h.h(255);
                                              var9 = this.field_h.e(-60);
                                              var10 = 127 & var8;
                                              if ((128 & var8 ^ -1) == -1) {
                                                stackOut_70_0 = 0;
                                                stackIn_71_0 = stackOut_70_0;
                                                break L28;
                                              } else {
                                                stackOut_69_0 = 1;
                                                stackIn_71_0 = stackOut_69_0;
                                                break L28;
                                              }
                                            }
                                            L29: {
                                              L30: {
                                                var11 = stackIn_71_0;
                                                var12 = ((long)var6 << -1765381280) + (long)var7;
                                                var14 = null;
                                                if (var11 != 0) {
                                                  var14_ref = (qqa) ((Object) this.field_k.b((byte) 38));
                                                  L31: while (true) {
                                                    if (var14_ref == null) {
                                                      break L30;
                                                    } else {
                                                      stackOut_79_0 = ((var14_ref.field_j ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_j ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                                                      stackIn_88_0 = stackOut_79_0;
                                                      stackIn_80_0 = stackOut_79_0;
                                                      if (var16 != 0) {
                                                        break L29;
                                                      } else {
                                                        L32: {
                                                          if (stackIn_80_0 != 0) {
                                                            break L32;
                                                          } else {
                                                            if (var16 == 0) {
                                                              break L30;
                                                            } else {
                                                              break L32;
                                                            }
                                                          }
                                                        }
                                                        var14_ref = (qqa) ((Object) this.field_k.c(28));
                                                        if (var16 == 0) {
                                                          continue L31;
                                                        } else {
                                                          break L30;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (qqa) ((Object) this.field_m.b((byte) 38));
                                                  L33: while (true) {
                                                    if (var14_ref == null) {
                                                      break L30;
                                                    } else {
                                                      stackOut_74_0 = ((var14_ref.field_j ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_j ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                                                      stackIn_88_0 = stackOut_74_0;
                                                      stackIn_75_0 = stackOut_74_0;
                                                      if (var16 != 0) {
                                                        break L29;
                                                      } else {
                                                        if (stackIn_75_0 == 0) {
                                                          break L30;
                                                        } else {
                                                          var14_ref = (qqa) ((Object) this.field_m.c(28));
                                                          continue L33;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref == null) {
                                                throw new IOException();
                                              } else {
                                                stackOut_87_0 = -1;
                                                stackIn_88_0 = stackOut_87_0;
                                                break L29;
                                              }
                                            }
                                            L34: {
                                              if (stackIn_88_0 != (var10 ^ -1)) {
                                                stackOut_90_0 = 9;
                                                stackIn_91_0 = stackOut_90_0;
                                                break L34;
                                              } else {
                                                stackOut_89_0 = 5;
                                                stackIn_91_0 = stackOut_89_0;
                                                break L34;
                                              }
                                            }
                                            var15 = stackIn_91_0;
                                            this.field_g = var14_ref;
                                            this.field_g.field_r = new uia(var9 + var15 - -this.field_g.field_q);
                                            this.field_g.field_r.i(var10, 0);
                                            this.field_g.field_r.a(var9, (byte) 119);
                                            this.field_h.field_h = 0;
                                            this.field_g.field_s = 10;
                                            if (var16 == 0) {
                                              break L15;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                        L35: {
                                          if (this.field_g.field_s != 0) {
                                            break L35;
                                          } else {
                                            L36: {
                                              if ((this.field_h.field_g[0] ^ -1) != 0) {
                                                break L36;
                                              } else {
                                                this.field_g.field_s = 1;
                                                this.field_h.field_h = 0;
                                                if (var16 == 0) {
                                                  break L15;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                            }
                                            this.field_g = null;
                                            if (var16 == 0) {
                                              break L15;
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                        throw new IOException();
                                      }
                                    }
                                    var2_int++;
                                    if (var16 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_100_0 = param0;
                          stackOut_100_1 = 26;
                          stackIn_101_0 = stackOut_100_0;
                          stackIn_101_1 = stackOut_100_1;
                          break L11;
                        }
                        L37: {
                          if (stackIn_101_0 > stackIn_101_1) {
                            break L37;
                          } else {
                            gv.a(false);
                            break L37;
                          }
                        }
                        stackOut_103_0 = 1;
                        stackIn_104_0 = stackOut_103_0;
                        break L4;
                      }
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L38: {
                    this.field_t.a((byte) 105);
                    break L38;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L39: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L39;
                  }
                }
                L40: {
                  this.field_t = null;
                  this.field_n = -2;
                  this.field_a = this.field_a + 1;
                  if ((this.f(-3) ^ -1) != -1) {
                    break L40;
                  } else {
                    if ((this.a((byte) 78) ^ -1) != -1) {
                      break L40;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_104_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void e(int param0) {
        try {
            this.field_t.a((byte) 105);
        } catch (Exception exception) {
        }
        this.field_t = null;
        this.field_a = this.field_a + 1;
        this.field_n = param0;
        this.field_d = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    private final void g(int param0) {
        try {
            boolean discarded$3 = false;
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != this.field_t) {
              try {
                L0: {
                  L1: {
                    if (param0 <= -48) {
                      break L1;
                    } else {
                      discarded$3 = this.c(21);
                      break L1;
                    }
                  }
                  this.field_o.field_h = 0;
                  this.field_o.i(6, 0);
                  this.field_o.h(-86, 3);
                  this.field_o.f(-1477662136, 0);
                  this.field_t.a(this.field_o.field_g, 0, this.field_o.field_g.length, 118);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_t.a((byte) 105);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_t = null;
                  this.field_n = -2;
                  this.field_a = this.field_a + 1;
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

    static {
        field_v = "You unlocked a new character!";
        field_r = "<%0> would need a rating of <%1> to play with the current options.";
        field_q = new int[8192];
    }
}

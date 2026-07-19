/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends ge {
    static String[] field_v;
    static int[] field_t;
    static String field_u;
    private cb field_q;
    static int field_r;
    static int[] field_s;

    final boolean e(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            cd var2_ref = null;
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
            cd var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_28_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_77_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_88_0 = 0;
            int stackIn_96_0 = 0;
            int stackIn_99_0 = 0;
            int stackIn_110_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_30_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_75_0 = 0;
            int stackOut_87_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_95_0 = 0;
            int stackOut_98_0 = 0;
            int stackOut_97_0 = 0;
            int stackOut_109_0 = 0;
            int stackOut_27_0 = 0;
            L0: {
              var16 = OrbDefence.field_D ? 1 : 0;
              if (null != this.field_q) {
                L1: {
                  var2_long = ji.b(param0 + -278);
                  var4 = (int)(var2_long + -this.field_j);
                  this.field_j = var2_long;
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                this.field_e = this.field_e + var4;
                if ((this.field_e ^ -1) < -30001) {
                  try {
                    L2: {
                      this.field_q.a(1);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_q = null;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (this.field_q == null) {
              if (this.g(-128) == 0) {
                if (-1 == (this.b(84) ^ -1)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              try {
                L4: {
                  this.field_q.b(-120);
                  var2_ref = (cd) ((Object) this.field_d.b((byte) 46));
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var2_ref == null) {
                          break L7;
                        } else {
                          this.field_l.field_i = 0;
                          this.field_l.a(1, -41);
                          this.field_l.b(123, var2_ref.field_h);
                          this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                          this.field_p.a(param0 ^ -143, var2_ref);
                          var2_ref = (cd) ((Object) this.field_d.b(0));
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
                      var2_ref = (cd) ((Object) this.field_k.b((byte) 46));
                      break L6;
                    }
                    L8: while (true) {
                      L9: {
                        if (var2_ref == null) {
                          break L9;
                        } else {
                          this.field_l.field_i = 0;
                          this.field_l.a(0, -74);
                          this.field_l.b(115, var2_ref.field_h);
                          this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                          this.field_f.a(-90, var2_ref);
                          var2_ref = (cd) ((Object) this.field_k.b(0));
                          if (var16 == 0) {
                            continue L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var2_int = 0;
                      if (param0 == 255) {
                        L10: while (true) {
                          L11: {
                            L12: {
                              if ((var2_int ^ -1) <= -101) {
                                break L12;
                              } else {
                                var3_int = this.field_q.b((byte) 101);
                                stackOut_30_0 = -1;
                                stackIn_110_0 = stackOut_30_0;
                                stackIn_31_0 = stackOut_30_0;
                                if (var16 != 0) {
                                  break L11;
                                } else {
                                  if (stackIn_31_0 < (var3_int ^ -1)) {
                                    throw new IOException();
                                  } else {
                                    L13: {
                                      if (-1 != (var3_int ^ -1)) {
                                        break L13;
                                      } else {
                                        if (var16 == 0) {
                                          break L12;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    L14: {
                                      L15: {
                                        this.field_e = 0;
                                        var4 = 0;
                                        if (null == this.field_a) {
                                          break L15;
                                        } else {
                                          if (-1 != (this.field_a.field_v ^ -1)) {
                                            break L14;
                                          } else {
                                            var4 = 1;
                                            if (var16 == 0) {
                                              break L14;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                      }
                                      var4 = 10;
                                      break L14;
                                    }
                                    L16: {
                                      L17: {
                                        if (var4 > 0) {
                                          break L17;
                                        } else {
                                          L18: {
                                            var5 = this.field_a.field_u.field_j.length + -this.field_a.field_s;
                                            var6 = 512 - this.field_a.field_v;
                                            if (var5 - this.field_a.field_u.field_i >= var6) {
                                              break L18;
                                            } else {
                                              var6 = var5 - this.field_a.field_u.field_i;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            if (var6 <= var3_int) {
                                              break L19;
                                            } else {
                                              var6 = var3_int;
                                              break L19;
                                            }
                                          }
                                          L20: {
                                            L21: {
                                              this.field_q.a(this.field_a.field_u.field_i, var6, 87, this.field_a.field_u.field_j);
                                              if (this.field_h == 0) {
                                                break L21;
                                              } else {
                                                var7 = 0;
                                                L22: while (true) {
                                                  if (var6 <= var7) {
                                                    break L21;
                                                  } else {
                                                    this.field_a.field_u.field_j[this.field_a.field_u.field_i - -var7] = (byte)gi.a((int) this.field_a.field_u.field_j[this.field_a.field_u.field_i + var7], (int) this.field_h);
                                                    var7++;
                                                    if (var16 != 0) {
                                                      break L20;
                                                    } else {
                                                      continue L22;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            this.field_a.field_v = this.field_a.field_v + var6;
                                            this.field_a.field_u.field_i = this.field_a.field_u.field_i + var6;
                                            break L20;
                                          }
                                          L23: {
                                            if (this.field_a.field_u.field_i == var5) {
                                              break L23;
                                            } else {
                                              if (-513 != (this.field_a.field_v ^ -1)) {
                                                break L16;
                                              } else {
                                                this.field_a.field_v = 0;
                                                if (var16 == 0) {
                                                  break L16;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                            }
                                          }
                                          this.field_a.c(-1);
                                          this.field_a.field_l = false;
                                          this.field_a = null;
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      L24: {
                                        var5 = -this.field_m.field_i + var4;
                                        if (var5 > var3_int) {
                                          var5 = var3_int;
                                          break L24;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      L25: {
                                        L26: {
                                          this.field_q.a(this.field_m.field_i, var5, -117, this.field_m.field_j);
                                          if (this.field_h == 0) {
                                            break L26;
                                          } else {
                                            var6 = 0;
                                            L27: while (true) {
                                              if (var6 >= var5) {
                                                break L26;
                                              } else {
                                                this.field_m.field_j[this.field_m.field_i - -var6] = (byte)gi.a((int) this.field_m.field_j[this.field_m.field_i + var6], (int) this.field_h);
                                                var6++;
                                                if (var16 != 0) {
                                                  break L25;
                                                } else {
                                                  continue L27;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        this.field_m.field_i = this.field_m.field_i + var5;
                                        break L25;
                                      }
                                      L28: {
                                        if (this.field_m.field_i >= var4) {
                                          break L28;
                                        } else {
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                      L29: {
                                        if (this.field_a == null) {
                                          L30: {
                                            this.field_m.field_i = 0;
                                            var6 = this.field_m.b((byte) 90);
                                            var7 = this.field_m.l(0);
                                            var8 = this.field_m.b((byte) 90);
                                            var9 = this.field_m.l(param0 + -255);
                                            var10 = 127 & var8;
                                            if (0 == (128 & var8)) {
                                              stackOut_76_0 = 0;
                                              stackIn_77_0 = stackOut_76_0;
                                              break L30;
                                            } else {
                                              stackOut_75_0 = 1;
                                              stackIn_77_0 = stackOut_75_0;
                                              break L30;
                                            }
                                          }
                                          L31: {
                                            L32: {
                                              var11 = stackIn_77_0;
                                              var12 = ((long)var6 << 1096479136) - -(long)var7;
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (cd) ((Object) this.field_p.b((byte) 46));
                                                L33: while (true) {
                                                  if (var14_ref == null) {
                                                    break L32;
                                                  } else {
                                                    stackOut_87_0 = ((var14_ref.field_h ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_h ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                                                    stackIn_96_0 = stackOut_87_0;
                                                    stackIn_88_0 = stackOut_87_0;
                                                    if (var16 != 0) {
                                                      break L31;
                                                    } else {
                                                      L34: {
                                                        if (stackIn_88_0 != 0) {
                                                          break L34;
                                                        } else {
                                                          if (var16 == 0) {
                                                            break L32;
                                                          } else {
                                                            break L34;
                                                          }
                                                        }
                                                      }
                                                      var14_ref = (cd) ((Object) this.field_p.b(0));
                                                      if (var16 == 0) {
                                                        continue L33;
                                                      } else {
                                                        break L32;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (cd) ((Object) this.field_f.b((byte) 46));
                                                L35: while (true) {
                                                  if (var14_ref == null) {
                                                    break L32;
                                                  } else {
                                                    stackOut_80_0 = ((var14_ref.field_h ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_h ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                                                    stackIn_96_0 = stackOut_80_0;
                                                    stackIn_81_0 = stackOut_80_0;
                                                    if (var16 != 0) {
                                                      break L31;
                                                    } else {
                                                      L36: {
                                                        if (stackIn_81_0 != 0) {
                                                          break L36;
                                                        } else {
                                                          if (var16 == 0) {
                                                            break L32;
                                                          } else {
                                                            break L36;
                                                          }
                                                        }
                                                      }
                                                      var14_ref = (cd) ((Object) this.field_f.b(0));
                                                      continue L35;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              this.field_a = var14_ref;
                                              stackOut_95_0 = var10 ^ -1;
                                              stackIn_96_0 = stackOut_95_0;
                                              break L31;
                                            }
                                          }
                                          L37: {
                                            if (stackIn_96_0 == -1) {
                                              stackOut_98_0 = 5;
                                              stackIn_99_0 = stackOut_98_0;
                                              break L37;
                                            } else {
                                              stackOut_97_0 = 9;
                                              stackIn_99_0 = stackOut_97_0;
                                              break L37;
                                            }
                                          }
                                          var15 = stackIn_99_0;
                                          this.field_a.field_u = new mg(this.field_a.field_s + var9 + var15);
                                          this.field_a.field_u.a(var10, -99);
                                          this.field_a.field_u.b(var9, -1);
                                          this.field_a.field_v = 10;
                                          this.field_m.field_i = 0;
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L29;
                                          }
                                        } else {
                                          break L29;
                                        }
                                      }
                                      L38: {
                                        if (0 == this.field_a.field_v) {
                                          L39: {
                                            if ((this.field_m.field_j[0] ^ -1) == 0) {
                                              break L39;
                                            } else {
                                              this.field_a = null;
                                              if (var16 == 0) {
                                                break L16;
                                              } else {
                                                break L39;
                                              }
                                            }
                                          }
                                          this.field_m.field_i = 0;
                                          this.field_a.field_v = 1;
                                          if (var16 == 0) {
                                            break L16;
                                          } else {
                                            break L38;
                                          }
                                        } else {
                                          break L38;
                                        }
                                      }
                                      throw new IOException();
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
                            stackOut_109_0 = 1;
                            stackIn_110_0 = stackOut_109_0;
                            break L11;
                          }
                          decompiledRegionSelector0 = 1;
                          break L4;
                        }
                      } else {
                        stackOut_27_0 = 1;
                        stackIn_28_0 = stackOut_27_0;
                        decompiledRegionSelector0 = 0;
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
                    this.field_q.a(1);
                    break L40;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L41: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L41;
                  }
                }
                this.field_q = null;
                this.field_b = this.field_b + 1;
                this.field_n = -2;
                if (-1 == (this.g(-113) ^ -1)) {
                  if (this.b(param0 + -207) == 0) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_28_0 != 0;
              } else {
                return stackIn_110_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void f(int param0) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_q.a(1);
              if (param0 <= -5) {
                break L1;
              } else {
                field_u = (String) null;
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
        this.field_n = -1;
        this.field_b = this.field_b + 1;
        this.field_q = null;
        this.field_h = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static rg a(int param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        md var4 = null;
        md stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        md stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -55 % ((-3 - param2) / 32);
            var4 = new md();
            ((rg) ((Object) var4)).field_b = param0;
            ((rg) ((Object) var4)).field_a = param1;
            stackOut_0_0 = (md) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("a.A(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return (rg) ((Object) stackIn_1_0);
    }

    private final void b(byte param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != this.field_q) {
              try {
                L0: {
                  L1: {
                    this.field_l.field_i = 0;
                    this.field_l.a(6, -32);
                    if (param0 <= -73) {
                      break L1;
                    } else {
                      field_s = (int[]) null;
                      break L1;
                    }
                  }
                  this.field_l.c(3, 127);
                  this.field_l.b((byte) -60, 0);
                  this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_q.a(1);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_q = null;
                  this.field_b = this.field_b + 1;
                  this.field_n = -2;
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

    public static void a(byte param0) {
        field_v = null;
        field_s = null;
        field_u = null;
        int var1 = -22 / ((param0 - -30) / 37);
        field_t = null;
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            mg stackIn_5_0 = null;
            mg stackIn_6_0 = null;
            mg stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            Throwable decompiledCaughtException = null;
            mg stackOut_4_0 = null;
            mg stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            mg stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            if (param0 <= -49) {
              if (null != this.field_q) {
                try {
                  L0: {
                    L1: {
                      this.field_l.field_i = 0;
                      stackOut_4_0 = this.field_l;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (param1) {
                        stackOut_6_0 = (mg) ((Object) stackIn_6_0);
                        stackOut_6_1 = 2;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        break L1;
                      } else {
                        stackOut_5_0 = (mg) ((Object) stackIn_5_0);
                        stackOut_5_1 = 3;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        break L1;
                      }
                    }
                    ((mg) (Object) stackIn_7_0).a(stackIn_7_1, -105);
                    this.field_l.b(106, 0L);
                    this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                    break L0;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    try {
                      L3: {
                        this.field_q.a(1);
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L4: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    this.field_n = -2;
                    this.field_q = null;
                    this.field_b = this.field_b + 1;
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

    final static db[] a(be param0, int param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        db[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        db var7 = null;
        int var8 = 0;
        eb var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        db[] stackIn_3_0 = null;
        db[] stackIn_11_0 = null;
        db[] stackIn_15_0 = null;
        db[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        db[] stackOut_10_0 = null;
        db[] stackOut_14_0 = null;
        db[] stackOut_17_0 = null;
        db[] stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0.b((byte) -120)) {
              var9 = param0.a((byte) 31);
              L1: while (true) {
                L2: {
                  L3: {
                    if (0 != var9.field_a) {
                      break L3;
                    } else {
                      hb.a(10L, 103);
                      if (var8 != 0) {
                        break L2;
                      } else {
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (var9.field_a != 2) {
                    break L2;
                  } else {
                    stackOut_10_0 = new db[]{};
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
                var11 = (int[]) (var9.field_g);
                var10 = var11;
                var3 = var10;
                var4 = new db[var11.length >> -517371230];
                var5 = 16 / ((param1 - -29) / 44);
                var6 = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      if (var6 >= var4.length) {
                        break L6;
                      } else {
                        var7 = new db();
                        stackOut_14_0 = (db[]) (var4);
                        stackIn_18_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var8 != 0) {
                          break L5;
                        } else {
                          stackIn_15_0[var6] = var7;
                          var7.field_d = var3[var6 << 167270370];
                          var7.field_b = var3[1 + (var6 << 908315682)];
                          var7.field_e = var3[(var6 << 239281666) + 2];
                          var7.field_a = var3[3 + (var6 << 1061708130)];
                          var6++;
                          if (var8 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    stackOut_17_0 = (db[]) (var4);
                    stackIn_18_0 = stackOut_17_0;
                    break L5;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = new db[]{};
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var2);
            stackOut_19_1 = new StringBuilder().append("a.E(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    final void c(int param0) {
        if (param0 != 1) {
            return;
        }
        if (!(this.field_q == null)) {
            this.field_q.a(1);
        }
    }

    final void a(Object param0, int param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            cd var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            String stackIn_36_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_33_0 = null;
            StringBuilder stackOut_33_1 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            String stackOut_34_2 = null;
            var6 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != this.field_q) {
                    try {
                      L2: {
                        this.field_q.a(param1 + -19);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_q = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_q = (cb) (param0);
                this.b((byte) -103);
                this.a(-54, param2);
                this.field_a = null;
                this.field_m.field_i = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      L7: {
                        var4_ref3 = (cd) ((Object) this.field_p.c(30664));
                        if (var4_ref3 != null) {
                          break L7;
                        } else {
                          if (var6 != 0) {
                            break L6;
                          } else {
                            if (var6 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      this.field_d.a(-79, var4_ref3);
                      break L6;
                    }
                    if (var6 == 0) {
                      continue L4;
                    } else {
                      break L5;
                    }
                  }
                  L8: while (true) {
                    L9: {
                      L10: {
                        L11: {
                          var4_ref3 = (cd) ((Object) this.field_f.c(30664));
                          if (var4_ref3 != null) {
                            break L11;
                          } else {
                            if (var6 != 0) {
                              break L10;
                            } else {
                              if (var6 == 0) {
                                break L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        this.field_k.a(-63, var4_ref3);
                        break L10;
                      }
                      if (var6 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                    L12: {
                      if (this.field_h != 0) {
                        try {
                          L13: {
                            this.field_l.field_i = 0;
                            this.field_l.a(4, -80);
                            this.field_l.a((int) this.field_h, -85);
                            this.field_l.b(0, -1);
                            this.field_q.a((byte) 30, this.field_l.field_j, 0, this.field_l.field_j.length);
                            break L13;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L14: {
                            var4_ref = (IOException) (Object) decompiledCaughtException;
                            try {
                              L15: {
                                this.field_q.a(1);
                                break L15;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter2) {
                              decompiledCaughtException = decompiledCaughtParameter2;
                              L16: {
                                var5 = (Exception) (Object) decompiledCaughtException;
                                break L16;
                              }
                            }
                            this.field_b = this.field_b + 1;
                            this.field_n = -2;
                            this.field_q = null;
                            break L14;
                          }
                        }
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L17: {
                      this.field_e = 0;
                      this.field_j = ji.b(107);
                      if (param1 == 20) {
                        break L17;
                      } else {
                        field_s = (int[]) null;
                        break L17;
                      }
                    }
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L18: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_33_0 = (RuntimeException) (var4_ref2);
                stackOut_33_1 = new StringBuilder().append("a.G(");
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                if (param0 == null) {
                  stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
                  stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
                  stackOut_35_2 = "null";
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  break L18;
                } else {
                  stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
                  stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
                  stackOut_34_2 = "{...}";
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  stackIn_36_2 = stackOut_34_2;
                  break L18;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public a() {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        kk.field_U[rc.field_d] = param0;
        bc.field_o[rc.field_d] = rc.field_d;
        tl.field_d[rc.field_d] = param3;
        if (!(param3 <= hc.field_j)) {
            jl.field_d = param3;
        }
        if (am.field_e > param3) {
            qh.field_a = param3;
        }
        vl.field_g[rc.field_d] = param5;
        th.field_f[rc.field_d] = param1;
        ld.field_b[rc.field_d] = param4;
        int var6 = param4 + (param5 - -param1);
        int var7 = -1 == (var6 ^ -1) ? 0 : 1000 * param5 / var6;
        rh.field_c[rc.field_d] = var7;
        if (param2 != 9664) {
            field_t = (int[]) null;
        }
        if (!(var7 <= jl.field_d)) {
            jl.field_d = var7;
        }
        rc.field_d = rc.field_d + 1;
        if (qh.field_a > var7) {
            qh.field_a = var7;
        }
    }

    static {
        field_v = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_t = new int[8192];
        field_u = "Confirm Email:";
        field_s = new int[8192];
    }
}

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
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            qqa var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
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
                  var4_ref = (qqa) ((Object) this.field_m.c((byte) 121));
                  if (var4_ref == null) {
                    L6: while (true) {
                      var4_ref = (qqa) ((Object) this.field_k.c((byte) 111));
                      if (var4_ref == null) {
                        L7: {
                          if (this.field_d == 0) {
                            break L7;
                          } else {
                            try {
                              L8: {
                                this.field_o.field_h = 0;
                                this.field_o.i(4, param1 + -54);
                                this.field_o.i((int) this.field_d, param1 ^ 54);
                                this.field_o.a(0, (byte) -17);
                                this.field_t.a(this.field_o.field_g, 0, this.field_o.field_g.length, 124);
                                break L8;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L9: {
                                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L10: {
                                    this.field_t.a((byte) 105);
                                    break L10;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L11;
                                  }
                                }
                                this.field_n = -2;
                                this.field_t = null;
                                this.field_a = this.field_a + 1;
                                break L9;
                              }
                            }
                            break L7;
                          }
                        }
                        this.field_p = 0;
                        this.field_j = bva.b((byte) -107);
                        break L0;
                      } else {
                        this.field_c.a(var4_ref, (byte) -104);
                        continue L6;
                      }
                    }
                  } else {
                    this.field_e.a(var4_ref, (byte) -81);
                    continue L5;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_26_0 = (RuntimeException) (var4_ref3);

                stackIn_26_1 = new StringBuilder().append("gv.D(");

                if (param0 == null) {
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
              throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
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
            uia stackIn_4_0 = null;
            uia stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (null != this.field_t) {
              try {
                L0: {
                  L1: {
                    this.field_o.field_h = 0;
                    stackIn_4_0 = this.field_o;

                    if (!param1) {
                      stackIn_5_0 = (uia) ((Object) stackIn_4_0);
                      stackIn_5_1 = 3;
                      break L1;
                    } else {
                      stackIn_5_0 = (uia) ((Object) stackIn_4_0);
                      stackIn_5_1 = 2;
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
        int var10;
        int var11;
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
          if (var10 < param0) {
            break L1;
          } else {
            if (param9 < var10) {
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
                    if (var10 > param6) {
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
                      if (param4 <= var11) {
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
            int stackIn_59_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_85_0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            qqa var2 = null;
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
            qqa var14_ref = null;
            int var15 = 0;
            int var16 = 0;
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
              if (this.f(-3) != 0) {
                return false;
              } else {
                if (this.a((byte) 78) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L4: {
                  this.field_t.b(102);
                  var2 = (qqa) ((Object) this.field_e.b((byte) 38));
                  L5: while (true) {
                    if (var2 == null) {
                      var2 = (qqa) ((Object) this.field_c.b((byte) 38));
                      L6: while (true) {
                        if (var2 == null) {
                          var2_int = 0;
                          L7: while (true) {
                            L8: {
                              if (var2_int >= 100) {
                                break L8;
                              } else {
                                var3_int = this.field_t.c(0);
                                if (0 > var3_int) {
                                  throw new IOException();
                                } else {
                                  if (var3_int == 0) {
                                    break L8;
                                  } else {
                                    L9: {
                                      this.field_p = 0;
                                      var4 = 0;
                                      if (this.field_g != null) {
                                        if (this.field_g.field_s == 0) {
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
                                          var5 = -this.field_h.field_h + var4;
                                          if (var3_int >= var5) {
                                            break L11;
                                          } else {
                                            var5 = var3_int;
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          this.field_t.a(0, this.field_h.field_h, this.field_h.field_g, var5);
                                          if (0 != this.field_d) {
                                            var6 = 0;
                                            L13: while (true) {
                                              if (var5 <= var6) {
                                                break L12;
                                              } else {
                                                this.field_h.field_g[var6 + this.field_h.field_h] = (byte)kha.b((int) this.field_h.field_g[var6 + this.field_h.field_h], (int) this.field_d);
                                                var6++;
                                                continue L13;
                                              }
                                            }
                                          } else {
                                            break L12;
                                          }
                                        }
                                        this.field_h.field_h = this.field_h.field_h + var5;
                                        if (var4 > this.field_h.field_h) {
                                          break L10;
                                        } else {
                                          if (this.field_g != null) {
                                            if (this.field_g.field_s != 0) {
                                              throw new IOException();
                                            } else {
                                              if ((this.field_h.field_g[0] ^ -1) != 0) {
                                                this.field_g = null;
                                                break L10;
                                              } else {
                                                this.field_g.field_s = 1;
                                                this.field_h.field_h = 0;
                                                break L10;
                                              }
                                            }
                                          } else {
                                            L14: {
                                              this.field_h.field_h = 0;
                                              var6 = this.field_h.h(255);
                                              var7 = this.field_h.e(105);
                                              var8 = this.field_h.h(255);
                                              var9 = this.field_h.e(-60);
                                              var10 = 127 & var8;
                                              if ((128 & var8) == 0) {
                                                stackIn_59_0 = 0;
                                                break L14;
                                              } else {
                                                stackIn_59_0 = 1;
                                                break L14;
                                              }
                                            }
                                            L15: {
                                              var11 = stackIn_59_0;
                                              var12 = ((long)var6 << -1765381280) + (long)var7;
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (qqa) ((Object) this.field_k.b((byte) 38));
                                                L16: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if ((var14_ref.field_j ^ -1L) != (var12 ^ -1L)) {
                                                      var14_ref = (qqa) ((Object) this.field_k.c(28));
                                                      continue L16;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (qqa) ((Object) this.field_m.b((byte) 38));
                                                L17: while (true) {
                                                  if (var14_ref == null) {
                                                    break L15;
                                                  } else {
                                                    if ((var14_ref.field_j ^ -1L) == (var12 ^ -1L)) {
                                                      break L15;
                                                    } else {
                                                      var14_ref = (qqa) ((Object) this.field_m.c(28));
                                                      continue L17;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L18: {
                                                if (-1 != (var10 ^ -1)) {
                                                  stackIn_75_0 = 9;
                                                  break L18;
                                                } else {
                                                  stackIn_75_0 = 5;
                                                  break L18;
                                                }
                                              }
                                              var15 = stackIn_75_0;
                                              this.field_g = var14_ref;
                                              this.field_g.field_r = new uia(var9 + var15 - -this.field_g.field_q);
                                              this.field_g.field_r.i(var10, 0);
                                              this.field_g.field_r.a(var9, (byte) 119);
                                              this.field_h.field_h = 0;
                                              this.field_g.field_s = 10;
                                              break L10;
                                            }
                                          }
                                        }
                                      } else {
                                        L19: {
                                          var5 = this.field_g.field_r.field_g.length - this.field_g.field_q;
                                          var6 = -this.field_g.field_s + 512;
                                          if (var5 + -this.field_g.field_r.field_h >= var6) {
                                            break L19;
                                          } else {
                                            var6 = -this.field_g.field_r.field_h + var5;
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
                                          this.field_t.a(0, this.field_g.field_r.field_h, this.field_g.field_r.field_g, var6);
                                          if (this.field_d != 0) {
                                            var7 = 0;
                                            L22: while (true) {
                                              if (var7 >= var6) {
                                                break L21;
                                              } else {
                                                this.field_g.field_r.field_g[this.field_g.field_r.field_h - -var7] = (byte)kha.b((int) this.field_g.field_r.field_g[this.field_g.field_r.field_h + var7], (int) this.field_d);
                                                var7++;
                                                continue L22;
                                              }
                                            }
                                          } else {
                                            break L21;
                                          }
                                        }
                                        this.field_g.field_s = this.field_g.field_s + var6;
                                        this.field_g.field_r.field_h = this.field_g.field_r.field_h + var6;
                                        if (var5 != this.field_g.field_r.field_h) {
                                          if (-513 != (this.field_g.field_s ^ -1)) {
                                            break L10;
                                          } else {
                                            this.field_g.field_s = 0;
                                            break L10;
                                          }
                                        } else {
                                          this.field_g.c(-7975);
                                          this.field_g.field_m = false;
                                          this.field_g = null;
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
                            L23: {
                              if (param0 > 26) {
                                break L23;
                              } else {
                                gv.a(false);
                                break L23;
                              }
                            }
                            stackIn_85_0 = 1;
                            break L4;
                          }
                        } else {
                          this.field_o.field_h = 0;
                          this.field_o.i(0, 0);
                          this.field_o.a(true, var2.field_j);
                          this.field_t.a(this.field_o.field_g, 0, this.field_o.field_g.length, 101);
                          this.field_k.a(var2, (byte) -99);
                          var2 = (qqa) ((Object) this.field_c.c(28));
                          continue L6;
                        }
                      }
                    } else {
                      this.field_o.field_h = 0;
                      this.field_o.i(1, 0);
                      this.field_o.a(true, var2.field_j);
                      this.field_t.a(this.field_o.field_g, 0, this.field_o.field_g.length, 119);
                      this.field_m.a(var2, (byte) -100);
                      var2 = (qqa) ((Object) this.field_e.c(28));
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    this.field_t.a((byte) 105);
                    break L24;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L25: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L25;
                  }
                }
                L26: {
                  this.field_t = null;
                  this.field_n = -2;
                  this.field_a = this.field_a + 1;
                  if (this.f(-3) != 0) {
                    break L26;
                  } else {
                    if (this.a((byte) 78) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_85_0 != 0;
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
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (null != this.field_t) {
              try {
                L0: {
                  L1: {
                    if (param0 <= -48) {
                      break L1;
                    } else {
                      this.c(21);
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

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fl extends vb {
    private wb field_u;
    static int[][] field_t;
    static int field_v;
    static ka[] field_s;

    public static void e(int param0) {
        field_s = null;
        if (param0 != -25984) {
            field_s = (ka[]) null;
        }
        field_t = (int[][]) null;
    }

    private final void a(boolean param0, byte param1) {
        try {
            IOException iOException = null;
            uf stackIn_7_0 = null;
            uf stackIn_8_0 = null;
            int stackIn_8_1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            L0: {
              if (param1 <= -50) {
                break L0;
              } else {
                this.d((byte) -9);
                break L0;
              }
            }
            if (null == this.field_u) {
              return;
            } else {
              try {
                L1: {
                  L2: {
                    this.field_d.field_q = 0;
                    stackIn_7_0 = this.field_d;

                    if (!param0) {
                      stackIn_8_0 = (uf) ((Object) stackIn_7_0);
                      stackIn_8_1 = 3;
                      break L2;
                    } else {
                      stackIn_8_0 = (uf) ((Object) stackIn_7_0);
                      stackIn_8_1 = 2;
                      break L2;
                    }
                  }
                  ((uf) (Object) stackIn_8_0).d(stackIn_8_1, (byte) 122);
                  this.field_d.a(0L, -1709073240);
                  this.field_u.a(this.field_d.field_m.length, 0, (byte) 98, this.field_d.field_m);
                  break L1;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_u.a((byte) -35);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_u = null;
                  this.field_b = -2;
                  this.field_h = this.field_h + 1;
                  break L3;
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

    final void a(int param0) {
        if (!(null == this.field_u)) {
            this.field_u.a((byte) 111);
        }
        if (param0 != -19315) {
            this.field_u = (wb) null;
        }
    }

    final void a(boolean param0, Object param1, byte param2) {
        try {
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            String stackIn_28_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            db var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            pa var7 = null;
            var6 = TorChallenge.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != this.field_u) {
                    try {
                      L2: {
                        this.field_u.a((byte) 107);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_u = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L4: {
                  this.field_u = (wb) (param1);
                  this.d((byte) 2);
                  this.a(param0, (byte) -71);
                  this.field_o.field_q = 0;
                  this.field_p = null;
                  if (param2 == 115) {
                    break L4;
                  } else {
                    var7 = (pa) null;
                    fl.a((pa) null, (byte) 59);
                    break L4;
                  }
                }
                L5: while (true) {
                  var4_ref = (db) ((Object) this.field_l.c(-1));
                  if (var4_ref != null) {
                    this.field_c.a(var4_ref, 3329);
                    continue L5;
                  } else {
                    L6: while (true) {
                      var4_ref = (db) ((Object) this.field_i.c(-1));
                      if (var4_ref != null) {
                        this.field_k.a(var4_ref, param2 + 3214);
                        continue L6;
                      } else {
                        L7: {
                          if (0 == this.field_f) {
                            break L7;
                          } else {
                            try {
                              L8: {
                                this.field_d.field_q = 0;
                                this.field_d.d(4, (byte) 122);
                                this.field_d.d((int) this.field_f, (byte) 122);
                                this.field_d.a(0, false);
                                this.field_u.a(this.field_d.field_m.length, 0, (byte) 112, this.field_d.field_m);
                                break L8;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L9: {
                                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L10: {
                                    this.field_u.a((byte) 127);
                                    break L10;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L11;
                                  }
                                }
                                this.field_b = -2;
                                this.field_h = this.field_h + 1;
                                this.field_u = null;
                                break L9;
                              }
                            }
                            break L7;
                          }
                        }
                        this.field_g = 0;
                        this.field_j = ol.a(256);
                        break L0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_27_0 = (RuntimeException) (var4_ref3);

                stackIn_27_1 = new StringBuilder().append("fl.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                  stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                  stackIn_28_2 = "null";
                  break L12;
                } else {
                  stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                  stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                  stackIn_28_2 = "{...}";
                  break L12;
                }
              }
              throw oj.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public fl() {
    }

    final static void a(int param0, boolean param1, String param2, String param3) {
        try {
            lg.field_b = param2;
            ja.field_b = param3;
            if (param0 >= -57) {
                field_s = (ka[]) null;
            }
            gh.a((byte) -116, nk.field_c, param1);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "fl.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_u.a((byte) 115);
              if (param0 == -30317) {
                break L1;
              } else {
                this.c(86);
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
        this.field_b = -1;
        this.field_u = null;
        this.field_h = this.field_h + 1;
        this.field_f = (byte)(int)(255.0 * Math.random() + 1.0);
    }

    private final void d(byte param0) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (null != this.field_u) {
              L0: {
                if (param0 == 2) {
                  break L0;
                } else {
                  field_s = (ka[]) null;
                  break L0;
                }
              }
              try {
                L1: {
                  this.field_d.field_q = 0;
                  this.field_d.d(6, (byte) 122);
                  this.field_d.a((byte) -124, 3);
                  this.field_d.a(0, (byte) 106);
                  this.field_u.a(this.field_d.field_m.length, 0, (byte) 121, this.field_d.field_m);
                  break L1;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_u.a((byte) 100);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_h = this.field_h + 1;
                  this.field_b = -2;
                  this.field_u = null;
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

    final static boolean a(pa param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 103) {
                break L1;
              } else {
                fl.f(97);
                break L1;
              }
            }
            L2: {
              if (param0.e(1, -53) != 1) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("fl.E(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final boolean b(int param0) {
        try {
            int stackIn_63_0 = 0;
            int stackIn_80_0 = 0;
            int stackIn_89_0 = 0;
            Throwable decompiledCaughtException = null;
            long var2_long = 0L;
            db var2 = null;
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
            db var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            L0: {
              var16 = TorChallenge.field_F ? 1 : 0;
              if (this.field_u == null) {
                break L0;
              } else {
                L1: {
                  var2_long = ol.a(256);
                  var4 = (int)(var2_long + -this.field_j);
                  this.field_j = var2_long;
                  if (-201 > (var4 ^ -1)) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_g = this.field_g + var4;
                if (this.field_g > 30000) {
                  try {
                    L2: {
                      this.field_u.a((byte) -55);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_u = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (null == this.field_u) {
              L4: {
                if (0 != this.a((byte) 120)) {
                  break L4;
                } else {
                  if (this.c((byte) 99) != 0) {
                    break L4;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              try {
                L5: {
                  this.field_u.b(127);
                  var2 = (db) ((Object) this.field_c.a(25777));
                  L6: while (true) {
                    if (var2 == null) {
                      L7: {
                        if (param0 <= -44) {
                          break L7;
                        } else {
                          field_v = -12;
                          break L7;
                        }
                      }
                      var2 = (db) ((Object) this.field_k.a(25777));
                      L8: while (true) {
                        if (var2 == null) {
                          var2_int = 0;
                          L9: while (true) {
                            if ((var2_int ^ -1) <= -101) {
                              stackIn_89_0 = 1;
                              break L5;
                            } else {
                              var3_int = this.field_u.a(0);
                              if (-1 < (var3_int ^ -1)) {
                                throw new IOException();
                              } else {
                                if (-1 != (var3_int ^ -1)) {
                                  L10: {
                                    this.field_g = 0;
                                    var4 = 0;
                                    if (this.field_p == null) {
                                      var4 = 10;
                                      break L10;
                                    } else {
                                      if (-1 != (this.field_p.field_C ^ -1)) {
                                        break L10;
                                      } else {
                                        var4 = 1;
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var4 > 0) {
                                      L12: {
                                        var5 = var4 - this.field_o.field_q;
                                        if (var5 <= var3_int) {
                                          break L12;
                                        } else {
                                          var5 = var3_int;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        this.field_u.a(-1, this.field_o.field_q, var5, this.field_o.field_m);
                                        if (0 == this.field_f) {
                                          break L13;
                                        } else {
                                          var6 = 0;
                                          L14: while (true) {
                                            if (var6 >= var5) {
                                              break L13;
                                            } else {
                                              this.field_o.field_m[var6 + this.field_o.field_q] = (byte)TorChallenge.a((int) this.field_o.field_m[var6 + this.field_o.field_q], (int) this.field_f);
                                              var6++;
                                              continue L14;
                                            }
                                          }
                                        }
                                      }
                                      this.field_o.field_q = this.field_o.field_q + var5;
                                      if (this.field_o.field_q < var4) {
                                        break L11;
                                      } else {
                                        if (null == this.field_p) {
                                          L15: {
                                            this.field_o.field_q = 0;
                                            var6 = this.field_o.j(-101);
                                            var7 = this.field_o.i(39);
                                            var8 = this.field_o.j(-111);
                                            var9 = this.field_o.i(64);
                                            var10 = var8 & 127;
                                            if ((var8 & 128) == 0) {
                                              stackIn_63_0 = 0;
                                              break L15;
                                            } else {
                                              stackIn_63_0 = 1;
                                              break L15;
                                            }
                                          }
                                          L16: {
                                            var11 = stackIn_63_0;
                                            var12 = ((long)var6 << 850423136) - -(long)var7;
                                            var14 = null;
                                            if (var11 != 0) {
                                              var14_ref = (db) ((Object) this.field_i.a(25777));
                                              L17: while (true) {
                                                if (var14_ref == null) {
                                                  break L16;
                                                } else {
                                                  if (var14_ref.field_l != var12) {
                                                    var14_ref = (db) ((Object) this.field_i.d(116));
                                                    continue L17;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                            } else {
                                              var14_ref = (db) ((Object) this.field_l.a(25777));
                                              L18: while (true) {
                                                if (var14_ref == null) {
                                                  break L16;
                                                } else {
                                                  if (var14_ref.field_l != var12) {
                                                    var14_ref = (db) ((Object) this.field_l.d(121));
                                                    continue L18;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var14_ref == null) {
                                            throw new IOException();
                                          } else {
                                            L19: {
                                              if (0 == var10) {
                                                stackIn_80_0 = 5;
                                                break L19;
                                              } else {
                                                stackIn_80_0 = 9;
                                                break L19;
                                              }
                                            }
                                            var15 = stackIn_80_0;
                                            this.field_p = var14_ref;
                                            this.field_p.field_A = new uf(var15 + var9 - -this.field_p.field_F);
                                            this.field_p.field_A.d(var10, (byte) 122);
                                            this.field_p.field_A.a(var9, false);
                                            this.field_p.field_C = 10;
                                            this.field_o.field_q = 0;
                                            break L11;
                                          }
                                        } else {
                                          if (this.field_p.field_C == 0) {
                                            if (this.field_o.field_m[0] == -1) {
                                              this.field_p.field_C = 1;
                                              this.field_o.field_q = 0;
                                              break L11;
                                            } else {
                                              this.field_p = null;
                                              break L11;
                                            }
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      }
                                    } else {
                                      L20: {
                                        var5 = -this.field_p.field_F + this.field_p.field_A.field_m.length;
                                        var6 = -this.field_p.field_C + 512;
                                        if (var5 - this.field_p.field_A.field_q < var6) {
                                          var6 = -this.field_p.field_A.field_q + var5;
                                          break L20;
                                        } else {
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        if (var6 <= var3_int) {
                                          break L21;
                                        } else {
                                          var6 = var3_int;
                                          break L21;
                                        }
                                      }
                                      L22: {
                                        this.field_u.a(-1, this.field_p.field_A.field_q, var6, this.field_p.field_A.field_m);
                                        if (this.field_f != 0) {
                                          var7 = 0;
                                          L23: while (true) {
                                            if (var6 <= var7) {
                                              break L22;
                                            } else {
                                              this.field_p.field_A.field_m[var7 + this.field_p.field_A.field_q] = (byte)TorChallenge.a((int) this.field_p.field_A.field_m[var7 + this.field_p.field_A.field_q], (int) this.field_f);
                                              var7++;
                                              continue L23;
                                            }
                                          }
                                        } else {
                                          break L22;
                                        }
                                      }
                                      this.field_p.field_C = this.field_p.field_C + var6;
                                      this.field_p.field_A.field_q = this.field_p.field_A.field_q + var6;
                                      if (this.field_p.field_A.field_q == var5) {
                                        this.field_p.a(12695);
                                        this.field_p.field_v = false;
                                        this.field_p = null;
                                        break L11;
                                      } else {
                                        if (-513 == (this.field_p.field_C ^ -1)) {
                                          this.field_p.field_C = 0;
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  var2_int++;
                                  continue L9;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        } else {
                          this.field_d.field_q = 0;
                          this.field_d.d(0, (byte) 122);
                          this.field_d.a(var2.field_l, -1709073240);
                          this.field_u.a(this.field_d.field_m.length, 0, (byte) 76, this.field_d.field_m);
                          this.field_i.a(var2, 3329);
                          var2 = (db) ((Object) this.field_k.d(118));
                          continue L8;
                        }
                      }
                    } else {
                      this.field_d.field_q = 0;
                      this.field_d.d(1, (byte) 122);
                      this.field_d.a(var2.field_l, -1709073240);
                      this.field_u.a(this.field_d.field_m.length, 0, (byte) 101, this.field_d.field_m);
                      this.field_l.a(var2, 3329);
                      var2 = (db) ((Object) this.field_c.d(49));
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    this.field_u.a((byte) 118);
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
                  this.field_h = this.field_h + 1;
                  this.field_u = null;
                  this.field_b = -2;
                  if (0 != this.a((byte) 117)) {
                    break L26;
                  } else {
                    if (0 == this.c((byte) 99)) {
                      return true;
                    } else {
                      break L26;
                    }
                  }
                }
                return false;
              }
              return stackIn_89_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int f(int param0) {
        if (param0 != 0) {
            return -81;
        }
        return sd.field_a - qe.field_R;
    }

    static {
        field_t = new int[][]{null, null, null, null, null, null, null, null, null, null, null, null, new int[]{0, 465, 617, 13, 46, 0, 0, 152, 33, 5, 5, 9, 8, 7, 6, 14, 6, 2, -1, 0, -1}, null, null, null};
    }
}

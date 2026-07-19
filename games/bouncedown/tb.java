/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tb extends v {
    static v field_p;
    static String[] field_r;
    private pc field_q;
    static long field_n;
    static String field_o;

    final void a(byte param0, Object param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            lf var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            String stackOut_29_2 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            var6 = Bounce.field_N;
            try {
              L0: {
                L1: {
                  if (null != this.field_q) {
                    try {
                      L2: {
                        this.field_q.a((byte) -70);
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
                this.field_q = (pc) (param1);
                this.d(31383);
                this.a(param2, (byte) 119);
                this.field_c.field_h = 0;
                this.field_b = null;
                L4: while (true) {
                  var4_ref3 = (lf) ((Object) this.field_e.a(param0 + 113));
                  if (var4_ref3 != null) {
                    this.field_i.a((byte) -78, var4_ref3);
                    continue L4;
                  } else {
                    L5: while (true) {
                      var4_ref3 = (lf) ((Object) this.field_m.a(-1));
                      if (var4_ref3 != null) {
                        this.field_h.a((byte) -78, var4_ref3);
                        continue L5;
                      } else {
                        L6: {
                          if (this.field_j != 0) {
                            try {
                              L7: {
                                this.field_a.field_h = 0;
                                this.field_a.a(4, (byte) 79);
                                this.field_a.a((int) this.field_j, (byte) 103);
                                this.field_a.b(0, (byte) 65);
                                this.field_q.a(this.field_a.field_i.length, this.field_a.field_i, 0, 0);
                                break L7;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L8: {
                                var4_ref = (IOException) (Object) decompiledCaughtException;
                                try {
                                  L9: {
                                    this.field_q.a((byte) -70);
                                    break L9;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var5 = (Exception) (Object) decompiledCaughtException;
                                    break L10;
                                  }
                                }
                                this.field_l = this.field_l + 1;
                                this.field_d = -2;
                                this.field_q = null;
                                break L8;
                              }
                            }
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (param0 == -114) {
                          this.field_g = 0;
                          this.field_k = fa.a(98);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_27_0 = (RuntimeException) (var4_ref2);
                stackOut_27_1 = new StringBuilder().append("tb.B(").append(param0).append(',');
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                if (param1 == null) {
                  stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
                  stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
                  stackOut_29_2 = "null";
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  break L11;
                } else {
                  stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
                  stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
                  stackOut_28_2 = "{...}";
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  break L11;
                }
              }
              throw ii.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
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

    public static void e(byte param0) {
        field_r = null;
        field_o = null;
        field_p = null;
        int var1 = 3 % ((9 - param0) / 57);
    }

    final void a(int param0) {
        if (param0 > -76) {
            this.c((byte) 0);
        }
        if (this.field_q != null) {
            this.field_q.a((byte) -70);
        }
    }

    private final void a(boolean param0, byte param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            wi stackIn_4_0 = null;
            wi stackIn_5_0 = null;
            wi stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            wi stackOut_3_0 = null;
            wi stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            wi stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            if (this.field_q == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_a.field_h = 0;
                    stackOut_3_0 = this.field_a;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (!param0) {
                      stackOut_5_0 = (wi) ((Object) stackIn_5_0);
                      stackOut_5_1 = 3;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L1;
                    } else {
                      stackOut_4_0 = (wi) ((Object) stackIn_4_0);
                      stackOut_4_1 = 2;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L1;
                    }
                  }
                  ((wi) (Object) stackIn_6_0).a(stackIn_6_1, (byte) 68);
                  this.field_a.a(0L, (byte) -29);
                  if (param1 == 119) {
                    this.field_q.a(this.field_a.field_i.length, this.field_a.field_i, 0, param1 ^ 119);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_q.a((byte) -70);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_d = -2;
                  this.field_q = null;
                  this.field_l = this.field_l + 1;
                  decompiledRegionSelector0 = 1;
                  break L2;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean e(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == -11) {
            break L0;
          } else {
            tb.e((byte) 123);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (mh.field_U ^ -1)) {
              break L2;
            } else {
              if (pg.field_c) {
                break L2;
              } else {
                if (ej.b(-27)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void c(byte param0) {
        try {
            this.field_q.a((byte) -70);
        } catch (Exception exception) {
        }
        this.field_q = null;
        this.field_l = this.field_l + 1;
        if (param0 < 108) {
            field_n = -77L;
        }
        this.field_d = -1;
        this.field_j = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            lf var2_ref = null;
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
            lf var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_49_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_87_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_86_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_62_0 = 0;
            L0: {
              var16 = Bounce.field_N;
              if (null != this.field_q) {
                L1: {
                  var2_long = fa.a(param0 ^ -54);
                  var4 = (int)(-this.field_k + var2_long);
                  this.field_k = var2_long;
                  if ((var4 ^ -1) < -201) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_g = this.field_g + var4;
                if (-30001 > (this.field_g ^ -1)) {
                  try {
                    L2: {
                      this.field_q.a((byte) -70);
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
            if (null != this.field_q) {
              try {
                L4: {
                  L5: {
                    this.field_q.a(-20);
                    if (param0 == 71) {
                      break L5;
                    } else {
                      field_o = (String) null;
                      break L5;
                    }
                  }
                  var2_ref = (lf) ((Object) this.field_i.d(-80));
                  L6: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (lf) ((Object) this.field_h.d(-122));
                      L7: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L8: while (true) {
                            if (100 <= var2_int) {
                              stackOut_86_0 = 1;
                              stackIn_87_0 = stackOut_86_0;
                              break L4;
                            } else {
                              var3_int = this.field_q.d(0);
                              if (-1 < (var3_int ^ -1)) {
                                throw new IOException();
                              } else {
                                if (var3_int != 0) {
                                  L9: {
                                    this.field_g = 0;
                                    var4 = 0;
                                    if (null == this.field_b) {
                                      var4 = 10;
                                      break L9;
                                    } else {
                                      if (this.field_b.field_t == 0) {
                                        var4 = 1;
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L10: {
                                    if ((var4 ^ -1) >= -1) {
                                      L11: {
                                        var5 = -this.field_b.field_s + this.field_b.field_p.field_i.length;
                                        var6 = -this.field_b.field_t + 512;
                                        if (var5 + -this.field_b.field_p.field_h < var6) {
                                          var6 = -this.field_b.field_p.field_h + var5;
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (var6 <= var3_int) {
                                          break L12;
                                        } else {
                                          var6 = var3_int;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        this.field_q.a(this.field_b.field_p.field_i, true, var6, this.field_b.field_p.field_h);
                                        if (0 != this.field_j) {
                                          var7 = 0;
                                          L14: while (true) {
                                            if (var7 >= var6) {
                                              break L13;
                                            } else {
                                              this.field_b.field_p.field_i[var7 + this.field_b.field_p.field_h] = (byte)ud.a((int) this.field_b.field_p.field_i[var7 + this.field_b.field_p.field_h], (int) this.field_j);
                                              var7++;
                                              continue L14;
                                            }
                                          }
                                        } else {
                                          break L13;
                                        }
                                      }
                                      this.field_b.field_p.field_h = this.field_b.field_p.field_h + var6;
                                      this.field_b.field_t = this.field_b.field_t + var6;
                                      if (var5 != this.field_b.field_p.field_h) {
                                        if (-513 != (this.field_b.field_t ^ -1)) {
                                          break L10;
                                        } else {
                                          this.field_b.field_t = 0;
                                          break L10;
                                        }
                                      } else {
                                        this.field_b.a(param0 ^ 7);
                                        this.field_b.field_n = false;
                                        this.field_b = null;
                                        break L10;
                                      }
                                    } else {
                                      L15: {
                                        var5 = -this.field_c.field_h + var4;
                                        if (var3_int >= var5) {
                                          break L15;
                                        } else {
                                          var5 = var3_int;
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        this.field_q.a(this.field_c.field_i, true, var5, this.field_c.field_h);
                                        if (this.field_j == 0) {
                                          break L16;
                                        } else {
                                          var6 = 0;
                                          L17: while (true) {
                                            if (var5 <= var6) {
                                              break L16;
                                            } else {
                                              this.field_c.field_i[this.field_c.field_h + var6] = (byte)ud.a((int) this.field_c.field_i[this.field_c.field_h + var6], (int) this.field_j);
                                              var6++;
                                              continue L17;
                                            }
                                          }
                                        }
                                      }
                                      this.field_c.field_h = this.field_c.field_h + var5;
                                      if (var4 <= this.field_c.field_h) {
                                        if (this.field_b != null) {
                                          if (this.field_b.field_t == 0) {
                                            if ((this.field_c.field_i[0] ^ -1) == 0) {
                                              this.field_b.field_t = 1;
                                              this.field_c.field_h = 0;
                                              break L10;
                                            } else {
                                              this.field_b = null;
                                              break L10;
                                            }
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          L18: {
                                            this.field_c.field_h = 0;
                                            var6 = this.field_c.d((byte) -78);
                                            var7 = this.field_c.j(-3);
                                            var8 = this.field_c.d((byte) -106);
                                            var9 = this.field_c.j(param0 + -74);
                                            var10 = 127 & var8;
                                            if ((var8 & 128) == 0) {
                                              stackOut_48_0 = 0;
                                              stackIn_49_0 = stackOut_48_0;
                                              break L18;
                                            } else {
                                              stackOut_47_0 = 1;
                                              stackIn_49_0 = stackOut_47_0;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            var11 = stackIn_49_0;
                                            var12 = (long)var7 + ((long)var6 << -353911840);
                                            var14 = null;
                                            if (var11 == 0) {
                                              var14_ref = (lf) ((Object) this.field_e.d(param0 ^ -47));
                                              L20: while (true) {
                                                if (var14_ref == null) {
                                                  break L19;
                                                } else {
                                                  if (var12 == var14_ref.field_j) {
                                                    break L19;
                                                  } else {
                                                    var14_ref = (lf) ((Object) this.field_e.b(0));
                                                    continue L20;
                                                  }
                                                }
                                              }
                                            } else {
                                              var14_ref = (lf) ((Object) this.field_m.d(-92));
                                              L21: while (true) {
                                                if (var14_ref == null) {
                                                  break L19;
                                                } else {
                                                  if ((var12 ^ -1L) == (var14_ref.field_j ^ -1L)) {
                                                    break L19;
                                                  } else {
                                                    var14_ref = (lf) ((Object) this.field_m.b(param0 ^ 71));
                                                    continue L21;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var14_ref == null) {
                                            throw new IOException();
                                          } else {
                                            L22: {
                                              if (-1 == (var10 ^ -1)) {
                                                stackOut_63_0 = 5;
                                                stackIn_64_0 = stackOut_63_0;
                                                break L22;
                                              } else {
                                                stackOut_62_0 = 9;
                                                stackIn_64_0 = stackOut_62_0;
                                                break L22;
                                              }
                                            }
                                            var15 = stackIn_64_0;
                                            this.field_b = var14_ref;
                                            this.field_b.field_p = new wi(var15 + (var9 - -this.field_b.field_s));
                                            this.field_b.field_p.a(var10, (byte) 126);
                                            this.field_b.field_p.b(var9, (byte) 76);
                                            this.field_c.field_h = 0;
                                            this.field_b.field_t = 10;
                                            break L10;
                                          }
                                        }
                                      } else {
                                        break L10;
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
                          this.field_a.field_h = 0;
                          this.field_a.a(0, (byte) 78);
                          this.field_a.a(var2_ref.field_j, (byte) -29);
                          this.field_q.a(this.field_a.field_i.length, this.field_a.field_i, 0, 0);
                          this.field_m.a((byte) -78, var2_ref);
                          var2_ref = (lf) ((Object) this.field_h.b(param0 ^ 71));
                          continue L7;
                        }
                      }
                    } else {
                      this.field_a.field_h = 0;
                      this.field_a.a(1, (byte) 87);
                      this.field_a.a(var2_ref.field_j, (byte) -29);
                      this.field_q.a(this.field_a.field_i.length, this.field_a.field_i, 0, param0 ^ 71);
                      this.field_e.a((byte) -78, var2_ref);
                      var2_ref = (lf) ((Object) this.field_i.b(0));
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    this.field_q.a((byte) -70);
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
                  this.field_d = -2;
                  this.field_q = null;
                  this.field_l = this.field_l + 1;
                  if (0 != this.c(param0 ^ -8288)) {
                    break L25;
                  } else {
                    if (this.a(true) != 0) {
                      break L25;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_87_0 != 0;
            } else {
              L26: {
                if (-1 != (this.c(-8217) ^ -1)) {
                  break L26;
                } else {
                  if (0 != this.a(true)) {
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

    private final void d(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (this.field_q != null) {
              try {
                L0: {
                  this.field_a.field_h = 0;
                  this.field_a.a(6, (byte) 97);
                  this.field_a.a(3, param0 ^ 490710151);
                  this.field_a.e(-750655096, 0);
                  this.field_q.a(this.field_a.field_i.length, this.field_a.field_i, 0, param0 ^ param0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      this.field_q.a((byte) -70);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_q = null;
                  this.field_l = this.field_l + 1;
                  this.field_d = -2;
                  break L1;
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

    public tb() {
    }

    static {
        field_o = "Members";
        field_r = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lc {
    private long field_d;
    private long field_r;
    private long field_p;
    static boolean field_q;
    private eg field_c;
    private int field_k;
    static um field_m;
    private int field_j;
    static String field_l;
    static String field_g;
    static int[] field_n;
    static String field_e;
    private byte[] field_i;
    private long field_a;
    private byte[] field_o;
    static ci field_f;
    private long field_h;
    private long field_b;

    final void a(int param0, byte[] param1) throws IOException {
        try {
            this.a(param1, -19616, param0, param1.length);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "lc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Chess.field_G;
        if (param0 == 17357) {
          L0: {
            if (0L == (this.field_h ^ -1L)) {
              break L0;
            } else {
              L1: {
                if ((this.field_p ^ -1L) != (this.field_h ^ -1L)) {
                  this.field_c.a(this.field_h, -11526);
                  this.field_p = this.field_h;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                this.field_c.a(0, -1036, this.field_o, this.field_k);
                this.field_p = this.field_p + (long)this.field_k;
                if ((this.field_p ^ -1L) >= (this.field_b ^ -1L)) {
                  break L2;
                } else {
                  this.field_b = this.field_p;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  var4 = -1L;
                  if ((this.field_h ^ -1L) > (this.field_d ^ -1L)) {
                    break L4;
                  } else {
                    if ((this.field_d + (long)this.field_j ^ -1L) >= (this.field_h ^ -1L)) {
                      break L4;
                    } else {
                      var2 = this.field_h;
                      break L3;
                    }
                  }
                }
                if ((this.field_h ^ -1L) < (this.field_d ^ -1L)) {
                  break L3;
                } else {
                  if ((long)this.field_k + this.field_h > this.field_d) {
                    var2 = this.field_d;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  if (this.field_d >= this.field_h - -(long)this.field_k) {
                    break L6;
                  } else {
                    if ((long)this.field_k + this.field_h > (long)this.field_j + this.field_d) {
                      break L6;
                    } else {
                      var4 = (long)this.field_k + this.field_h;
                      break L5;
                    }
                  }
                }
                if ((this.field_h ^ -1L) <= ((long)this.field_j + this.field_d ^ -1L)) {
                  break L5;
                } else {
                  if (((long)this.field_j + this.field_d ^ -1L) >= ((long)this.field_k + this.field_h ^ -1L)) {
                    var4 = (long)this.field_j + this.field_d;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (0L <= (var2 ^ -1L)) {
                  break L7;
                } else {
                  if (var4 <= var2) {
                    break L7;
                  } else {
                    var6 = (int)(-var2 + var4);
                    ne.a(this.field_o, (int)(-this.field_h + var2), this.field_i, (int)(-this.field_d + var2), var6);
                    break L7;
                  }
                }
              }
              this.field_k = 0;
              this.field_h = -1L;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static String d(byte param0) {
        String discarded$2 = null;
        L0: {
          if (uk.field_e) {
            break L0;
          } else {
            if (be.field_f > ei.field_u) {
              break L0;
            } else {
              if (ei.field_u < be.field_f + sj.field_n) {
                return eg.field_j;
              } else {
                break L0;
              }
            }
          }
        }
        if (param0 == 60) {
          return null;
        } else {
          discarded$2 = lc.d((byte) 67);
          return null;
        }
    }

    final static void a(int param0) {
        cd.field_x = new w(ki.field_P, dc.field_s, gd.field_b, qn.field_P, kj.field_g, sj.field_k);
        int var1 = -28 % ((param0 - 15) / 59);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var10 = Chess.field_G;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if ((long)param1 + this.field_a > this.field_r) {
                    this.field_r = this.field_a - -(long)param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0L == (this.field_h ^ -1L)) {
                    break L3;
                  } else {
                    L4: {
                      if (this.field_h > this.field_a) {
                        break L4;
                      } else {
                        if ((long)this.field_k + this.field_h < this.field_a) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.b(17357);
                    break L3;
                  }
                }
                L5: {
                  if ((long)param2 == this.field_h) {
                    break L5;
                  } else {
                    if (((long)param1 + this.field_a ^ -1L) >= ((long)this.field_o.length + this.field_h ^ -1L)) {
                      break L5;
                    } else {
                      var5_int = (int)(this.field_h - (this.field_a - (long)this.field_o.length));
                      ne.a(param3, param0, this.field_o, (int)(-this.field_h + this.field_a), var5_int);
                      param0 = param0 + var5_int;
                      param1 = param1 - var5_int;
                      this.field_a = this.field_a + (long)var5_int;
                      this.field_k = this.field_o.length;
                      this.b(17357);
                      break L5;
                    }
                  }
                }
                if (this.field_o.length < param1) {
                  L6: {
                    if ((this.field_p ^ -1L) == (this.field_a ^ -1L)) {
                      break L6;
                    } else {
                      this.field_c.a(this.field_a, -11526);
                      this.field_p = this.field_a;
                      break L6;
                    }
                  }
                  L7: {
                    this.field_c.a(param0, -1036, param3, param1);
                    this.field_p = this.field_p + (long)param1;
                    if (this.field_p > this.field_b) {
                      this.field_b = this.field_p;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var5_long = -1L;
                      if ((this.field_a ^ -1L) > (this.field_d ^ -1L)) {
                        break L9;
                      } else {
                        if (((long)this.field_j + this.field_d ^ -1L) >= (this.field_a ^ -1L)) {
                          break L9;
                        } else {
                          var5_long = this.field_a;
                          break L8;
                        }
                      }
                    }
                    if ((this.field_d ^ -1L) > (this.field_a ^ -1L)) {
                      break L8;
                    } else {
                      if (this.field_d >= this.field_a + (long)param1) {
                        break L8;
                      } else {
                        var5_long = this.field_d;
                        break L8;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      var7 = -1L;
                      if (this.field_d >= this.field_a - -(long)param1) {
                        break L11;
                      } else {
                        if (((long)param1 + this.field_a ^ -1L) >= (this.field_d - -(long)this.field_j ^ -1L)) {
                          var7 = this.field_a - -(long)param1;
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if (this.field_a >= (long)this.field_j + this.field_d) {
                      break L10;
                    } else {
                      if ((this.field_a - -(long)param1 ^ -1L) <= (this.field_d + (long)this.field_j ^ -1L)) {
                        var7 = this.field_d - -(long)this.field_j;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (-1L >= var5_long) {
                      break L12;
                    } else {
                      if (var5_long < var7) {
                        var9 = (int)(var7 - var5_long);
                        ne.a(param3, (int)(var5_long + (long)param0 + -this.field_a), this.field_i, (int)(var5_long + -this.field_d), var9);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  this.field_a = this.field_a + (long)param1;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (param1 <= 0) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L13: {
                      if (-1L != this.field_h) {
                        break L13;
                      } else {
                        this.field_h = this.field_a;
                        break L13;
                      }
                    }
                    L14: {
                      ne.a(param3, param0, this.field_o, (int)(-this.field_h + this.field_a), param1);
                      this.field_a = this.field_a + (long)param1;
                      if ((long)this.field_k < this.field_a - this.field_h) {
                        this.field_k = (int)(-this.field_h + this.field_a);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_p = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                decompiledRegionSelector1 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) (var5_ref);
            stackOut_49_1 = new StringBuilder().append("lc.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param3 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L15;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L15;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(String param0, String param1, int param2, int param3, String param4, boolean param5) {
        ld var6 = null;
        try {
            var6 = new ld(param2, param0, param3, param1, param4);
            if (param5) {
                field_n = (int[]) null;
            }
            ml.a((byte) 29, var6);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "lc.K(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final long c(byte param0) {
        if (param0 != 109) {
            return 91L;
        }
        return this.field_r;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int incrementValue$1 = 0;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var14 = Chess.field_G;
        try {
          L0: {
            try {
              L1: {
                if (param0.length >= param2 - -param3) {
                  L2: {
                    if (-1L == this.field_h) {
                      break L2;
                    } else {
                      if (this.field_a < this.field_h) {
                        break L2;
                      } else {
                        if (this.field_a + (long)param3 <= this.field_h - -(long)this.field_k) {
                          ne.a(this.field_o, (int)(-this.field_h + this.field_a), param0, param2, param3);
                          this.field_a = this.field_a + (long)param3;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  if (param1 == -19616) {
                    L3: {
                      var5_long = this.field_a;
                      var7 = param2;
                      var8 = param3;
                      if ((this.field_a ^ -1L) > (this.field_d ^ -1L)) {
                        break L3;
                      } else {
                        if (((long)this.field_j + this.field_d ^ -1L) >= (this.field_a ^ -1L)) {
                          break L3;
                        } else {
                          L4: {
                            var9_int = (int)(this.field_d + -this.field_a + (long)this.field_j);
                            if (var9_int <= param3) {
                              break L4;
                            } else {
                              var9_int = param3;
                              break L4;
                            }
                          }
                          ne.a(this.field_i, (int)(-this.field_d + this.field_a), param0, param2, var9_int);
                          param3 = param3 - var9_int;
                          param2 = param2 + var9_int;
                          this.field_a = this.field_a + (long)var9_int;
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (this.field_i.length >= param3) {
                        if (param3 <= 0) {
                          break L5;
                        } else {
                          L6: {
                            this.c(0);
                            var9_int = param3;
                            if (this.field_j >= var9_int) {
                              break L6;
                            } else {
                              var9_int = this.field_j;
                              break L6;
                            }
                          }
                          ne.a(this.field_i, 0, param0, param2, var9_int);
                          this.field_a = this.field_a + (long)var9_int;
                          param3 = param3 - var9_int;
                          param2 = param2 + var9_int;
                          break L5;
                        }
                      } else {
                        this.field_c.a(this.field_a, -11526);
                        this.field_p = this.field_a;
                        L7: while (true) {
                          if ((param3 ^ -1) >= -1) {
                            break L5;
                          } else {
                            var9_int = this.field_c.a(param2, param0, param3, (byte) 104);
                            if (-1 == var9_int) {
                              break L5;
                            } else {
                              param3 = param3 - var9_int;
                              this.field_a = this.field_a + (long)var9_int;
                              param2 = param2 + var9_int;
                              this.field_p = this.field_p + (long)var9_int;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      if (-1L != this.field_h) {
                        L9: {
                          if ((this.field_h ^ -1L) >= (this.field_a ^ -1L)) {
                            break L9;
                          } else {
                            if ((param3 ^ -1) >= -1) {
                              break L9;
                            } else {
                              L10: {
                                var9_int = param2 - -(int)(-this.field_a + this.field_h);
                                if (param2 + param3 < var9_int) {
                                  var9_int = param2 + param3;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              L11: while (true) {
                                if (var9_int <= param2) {
                                  break L9;
                                } else {
                                  param3--;
                                  incrementValue$1 = param2;
                                  param2++;
                                  param0[incrementValue$1] = (byte) 0;
                                  this.field_a = this.field_a + 1L;
                                  continue L11;
                                }
                              }
                            }
                          }
                        }
                        L12: {
                          L13: {
                            var9 = -1L;
                            if ((var5_long ^ -1L) < (this.field_h ^ -1L)) {
                              break L13;
                            } else {
                              if (((long)var8 + var5_long ^ -1L) < (this.field_h ^ -1L)) {
                                var9 = this.field_h;
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (this.field_h > var5_long) {
                            break L12;
                          } else {
                            if (var5_long >= this.field_h + (long)this.field_k) {
                              break L12;
                            } else {
                              var9 = var5_long;
                              break L12;
                            }
                          }
                        }
                        L14: {
                          L15: {
                            var11 = -1L;
                            if (var5_long >= (long)this.field_k + this.field_h) {
                              break L15;
                            } else {
                              if (this.field_h + (long)this.field_k <= var5_long + (long)var8) {
                                var11 = this.field_h - -(long)this.field_k;
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          if ((this.field_h ^ -1L) <= (var5_long + (long)var8 ^ -1L)) {
                            break L14;
                          } else {
                            if ((long)var8 + var5_long > (long)this.field_k + this.field_h) {
                              break L14;
                            } else {
                              var11 = (long)var8 + var5_long;
                              break L14;
                            }
                          }
                        }
                        if (0L <= (var9 ^ -1L)) {
                          break L8;
                        } else {
                          if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                            break L8;
                          } else {
                            var13 = (int)(var11 - var9);
                            ne.a(this.field_o, (int)(var9 - this.field_h), param0, (int)(var9 - var5_long) + var7, var13);
                            if (this.field_a >= var11) {
                              break L8;
                            } else {
                              param3 = (int)((long)param3 - (-this.field_a + var11));
                              this.field_a = var11;
                              break L8;
                            }
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                } else {
                  throw new ArrayIndexOutOfBoundsException(param3 + param2 - param0.length);
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_p = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 2;
                break L0;
              } else {
                if (0 < param3) {
                  throw new EOFException();
                } else {
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) (var5_ref);
            stackOut_58_1 = new StringBuilder().append("lc.L(");
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param0 == null) {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L16;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L16;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void b(byte param0) {
        field_n = null;
        field_g = null;
        if (param0 != -9) {
            field_q = false;
        }
        field_l = null;
        field_e = null;
        field_m = null;
        field_f = null;
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Chess.field_G;
          this.field_j = param0;
          if ((this.field_p ^ -1L) != (this.field_a ^ -1L)) {
            this.field_c.a(this.field_a, -11526);
            this.field_p = this.field_a;
            break L0;
          } else {
            break L0;
          }
        }
        this.field_d = this.field_a;
        L1: while (true) {
          L2: {
            if (this.field_j >= this.field_i.length) {
              break L2;
            } else {
              L3: {
                var2 = this.field_i.length - this.field_j;
                if (var2 <= 200000000) {
                  break L3;
                } else {
                  var2 = 200000000;
                  break L3;
                }
              }
              var3 = this.field_c.a(this.field_j, this.field_i, var2, (byte) 50);
              if (var3 == -1) {
                break L2;
              } else {
                this.field_p = this.field_p + (long)var3;
                this.field_j = this.field_j + var3;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void a(byte param0) throws IOException {
        if (param0 != -87) {
            field_m = (um) null;
        }
        this.b(param0 ^ -17308);
        this.field_c.a(10992);
    }

    final void a(long param0, int param1) throws IOException {
        if ((long)param1 > param0) {
            throw new IOException();
        }
        this.field_a = param0;
    }

    lc(eg param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_d = -1L;
        this.field_k = 0;
        this.field_h = -1L;
        try {
            this.field_c = param0;
            dupTemp$0 = param0.a((byte) -89);
            this.field_b = dupTemp$0;
            this.field_r = dupTemp$0;
            this.field_o = new byte[param2];
            this.field_a = 0L;
            this.field_i = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = "RuneScape clan";
        field_n = new int[128];
        field_l = "Public chat is unavailable while setting up a rated game.";
    }
}

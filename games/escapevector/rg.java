/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rg {
    private long field_f;
    private long field_d;
    static String field_c;
    private long field_i;
    private long field_k;
    private long field_a;
    private byte[] field_h;
    private long field_e;
    private byte[] field_g;
    private int field_l;
    private int field_j;
    private ma field_b;

    final void a(boolean param0, int param1, byte[] param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if ((this.field_e ^ -1L) > (this.field_d + (long)param3 ^ -1L)) {
                    this.field_e = (long)param3 + this.field_d;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0L == (this.field_a ^ -1L)) {
                    break L3;
                  } else {
                    if ((this.field_a ^ -1L) >= (this.field_d ^ -1L)) {
                      if (((long)this.field_l + this.field_a ^ -1L) <= (this.field_d ^ -1L)) {
                        break L3;
                      } else {
                        this.b(118);
                        break L3;
                      }
                    } else {
                      this.b(118);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (this.field_a == -1L) {
                    break L4;
                  } else {
                    if (this.field_d - -(long)param3 <= this.field_a + (long)this.field_h.length) {
                      break L4;
                    } else {
                      var5_int = (int)(this.field_a + -this.field_d + (long)this.field_h.length);
                      qg.a(param2, param1, this.field_h, (int)(this.field_d - this.field_a), var5_int);
                      param1 = param1 + var5_int;
                      this.field_d = this.field_d + (long)var5_int;
                      param3 = param3 - var5_int;
                      this.field_l = this.field_h.length;
                      this.b(115);
                      break L4;
                    }
                  }
                }
                if (this.field_h.length < param3) {
                  L5: {
                    if ((this.field_k ^ -1L) != (this.field_d ^ -1L)) {
                      this.field_b.a(this.field_d, 1);
                      this.field_k = this.field_d;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    this.field_b.a(param2, param3, param1, -15814);
                    this.field_k = this.field_k + (long)param3;
                    if ((this.field_i ^ -1L) <= (this.field_k ^ -1L)) {
                      break L6;
                    } else {
                      this.field_i = this.field_k;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var5_long = -1L;
                      if (this.field_f > this.field_d) {
                        break L8;
                      } else {
                        if (this.field_f + (long)this.field_j > this.field_d) {
                          var5_long = this.field_d;
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if ((this.field_f ^ -1L) > (this.field_d ^ -1L)) {
                      break L7;
                    } else {
                      if ((this.field_f ^ -1L) > ((long)param3 + this.field_d ^ -1L)) {
                        var5_long = this.field_f;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L9: {
                    L10: {
                      var7 = -1L;
                      if ((this.field_d + (long)param3 ^ -1L) >= (this.field_f ^ -1L)) {
                        break L10;
                      } else {
                        if (((long)this.field_j + this.field_f ^ -1L) > (this.field_d + (long)param3 ^ -1L)) {
                          break L10;
                        } else {
                          var7 = (long)param3 + this.field_d;
                          break L9;
                        }
                      }
                    }
                    if ((this.field_f + (long)this.field_j ^ -1L) >= (this.field_d ^ -1L)) {
                      break L9;
                    } else {
                      if (((long)this.field_j + this.field_f ^ -1L) < ((long)param3 + this.field_d ^ -1L)) {
                        break L9;
                      } else {
                        var7 = this.field_f + (long)this.field_j;
                        break L9;
                      }
                    }
                  }
                  L11: {
                    if (var5_long <= -1L) {
                      break L11;
                    } else {
                      if (var5_long >= var7) {
                        break L11;
                      } else {
                        var9 = (int)(var7 - var5_long);
                        qg.a(param2, (int)(var5_long + (long)param1 + -this.field_d), this.field_g, (int)(var5_long + -this.field_f), var9);
                        break L11;
                      }
                    }
                  }
                  this.field_d = this.field_d + (long)param3;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (-1 <= (param3 ^ -1)) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L12: {
                      if (0L == (this.field_a ^ -1L)) {
                        this.field_a = this.field_d;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      qg.a(param2, param1, this.field_h, (int)(this.field_d - this.field_a), param3);
                      this.field_d = this.field_d + (long)param3;
                      if (this.field_d + -this.field_a > (long)this.field_l) {
                        this.field_l = (int)(this.field_d + -this.field_a);
                        break L13;
                      } else {
                        break L13;
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
              this.field_k = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                L14: {
                  if (param0) {
                    break L14;
                  } else {
                    this.field_g = (byte[]) null;
                    break L14;
                  }
                }
                decompiledRegionSelector1 = 0;
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
            stackOut_52_0 = (RuntimeException) (var5_ref);
            stackOut_52_1 = new StringBuilder().append("rg.B(").append(param0).append(',').append(param1).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param2 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L15;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L15;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param3 + ')');
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

    final void a(byte param0) throws IOException {
        if (param0 != -111) {
            field_c = (String) null;
        }
        this.b(125);
        this.field_b.a(0);
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = EscapeVector.field_A;
          if ((this.field_a ^ -1L) != 0L) {
            L1: {
              if (this.field_a != this.field_k) {
                this.field_b.a(this.field_a, 1);
                this.field_k = this.field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_b.a(this.field_h, this.field_l, 0, -15814);
              this.field_k = this.field_k + (long)this.field_l;
              if (this.field_i >= this.field_k) {
                break L2;
              } else {
                this.field_i = this.field_k;
                break L2;
              }
            }
            L3: {
              L4: {
                var2_long = -1L;
                if (this.field_a < this.field_f) {
                  break L4;
                } else {
                  if (this.field_f - -(long)this.field_j <= this.field_a) {
                    break L4;
                  } else {
                    var2_long = this.field_a;
                    break L3;
                  }
                }
              }
              if ((this.field_f ^ -1L) > (this.field_a ^ -1L)) {
                break L3;
              } else {
                if ((this.field_f ^ -1L) > (this.field_a + (long)this.field_l ^ -1L)) {
                  var2_long = this.field_f;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (((long)this.field_l + this.field_a ^ -1L) >= (this.field_f ^ -1L)) {
                  break L6;
                } else {
                  if ((long)this.field_j + this.field_f < this.field_a - -(long)this.field_l) {
                    break L6;
                  } else {
                    var4 = (long)this.field_l + this.field_a;
                    break L5;
                  }
                }
              }
              if ((this.field_a ^ -1L) <= (this.field_f + (long)this.field_j ^ -1L)) {
                break L5;
              } else {
                if ((this.field_f + (long)this.field_j ^ -1L) < (this.field_a + (long)this.field_l ^ -1L)) {
                  break L5;
                } else {
                  var4 = this.field_f + (long)this.field_j;
                  break L5;
                }
              }
            }
            L7: {
              if ((var2_long ^ -1L) >= 0L) {
                break L7;
              } else {
                if ((var2_long ^ -1L) > (var4 ^ -1L)) {
                  var6 = (int)(-var2_long + var4);
                  qg.a(this.field_h, (int)(-this.field_a + var2_long), this.field_g, (int)(-this.field_f + var2_long), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            this.field_l = 0;
            this.field_a = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        var2 = 81 / ((56 - param0) / 50);
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != 0) {
            return;
        }
        if (!(-1L >= (param1 ^ -1L))) {
            throw new IOException();
        }
        this.field_d = param1;
    }

    final long a(int param0) {
        if (param0 != 16034) {
            rg.b((byte) -75);
        }
        return this.field_e;
    }

    private final void a(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        this.field_j = 0;
        if (!(this.field_d == this.field_k)) {
            this.field_b.a(this.field_d, 1);
            this.field_k = this.field_d;
        }
        this.field_f = this.field_d;
        if (!param0) {
            return;
        }
        while (this.field_g.length > this.field_j) {
            var2 = this.field_g.length + -this.field_j;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = this.field_b.a(var2, (byte) 127, this.field_g, this.field_j);
            if (0 == (var3 ^ -1)) {
                break;
            }
            this.field_j = this.field_j + var3;
            this.field_k = this.field_k + (long)var3;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        int var1 = -78 / ((-11 - param0) / 41);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
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
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var14 = EscapeVector.field_A;
        try {
          L0: {
            try {
              L1: {
                if (param2 == 101) {
                  if (param0 - -param1 > param3.length) {
                    throw new ArrayIndexOutOfBoundsException(param1 + (param0 + -param3.length));
                  } else {
                    L2: {
                      if (0L == (this.field_a ^ -1L)) {
                        break L2;
                      } else {
                        if ((this.field_d ^ -1L) > (this.field_a ^ -1L)) {
                          break L2;
                        } else {
                          if ((long)this.field_l + this.field_a < (long)param1 + this.field_d) {
                            break L2;
                          } else {
                            qg.a(this.field_h, (int)(-this.field_a + this.field_d), param3, param0, param1);
                            this.field_d = this.field_d + (long)param1;
                            decompiledRegionSelector0 = 1;
                            break L1;
                          }
                        }
                      }
                    }
                    L3: {
                      var5_long = this.field_d;
                      var7 = param0;
                      var8 = param1;
                      if ((this.field_f ^ -1L) < (this.field_d ^ -1L)) {
                        break L3;
                      } else {
                        if (this.field_d >= this.field_f - -(long)this.field_j) {
                          break L3;
                        } else {
                          L4: {
                            var9_int = (int)(-this.field_d - -this.field_f + (long)this.field_j);
                            if (param1 >= var9_int) {
                              break L4;
                            } else {
                              var9_int = param1;
                              break L4;
                            }
                          }
                          qg.a(this.field_g, (int)(this.field_d - this.field_f), param3, param0, var9_int);
                          param0 = param0 + var9_int;
                          param1 = param1 - var9_int;
                          this.field_d = this.field_d + (long)var9_int;
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (param1 > this.field_g.length) {
                        this.field_b.a(this.field_d, 1);
                        this.field_k = this.field_d;
                        L6: while (true) {
                          if (-1 <= (param1 ^ -1)) {
                            break L5;
                          } else {
                            var9_int = this.field_b.a(param1, (byte) 125, param3, param0);
                            if (0 == (var9_int ^ -1)) {
                              break L5;
                            } else {
                              param0 = param0 + var9_int;
                              this.field_d = this.field_d + (long)var9_int;
                              param1 = param1 - var9_int;
                              this.field_k = this.field_k + (long)var9_int;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        if ((param1 ^ -1) >= -1) {
                          break L5;
                        } else {
                          L7: {
                            this.a(true);
                            var9_int = param1;
                            if (var9_int > this.field_j) {
                              var9_int = this.field_j;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          qg.a(this.field_g, 0, param3, param0, var9_int);
                          this.field_d = this.field_d + (long)var9_int;
                          param1 = param1 - var9_int;
                          param0 = param0 + var9_int;
                          break L5;
                        }
                      }
                    }
                    L8: {
                      if (this.field_a == -1L) {
                        break L8;
                      } else {
                        L9: {
                          if ((this.field_a ^ -1L) >= (this.field_d ^ -1L)) {
                            break L9;
                          } else {
                            if (0 >= param1) {
                              break L9;
                            } else {
                              L10: {
                                var9_int = param0 + (int)(this.field_a + -this.field_d);
                                if (var9_int <= param0 + param1) {
                                  break L10;
                                } else {
                                  var9_int = param1 + param0;
                                  break L10;
                                }
                              }
                              L11: while (true) {
                                if (param0 >= var9_int) {
                                  break L9;
                                } else {
                                  incrementValue$1 = param0;
                                  param0++;
                                  param3[incrementValue$1] = (byte) 0;
                                  param1--;
                                  this.field_d = this.field_d + 1L;
                                  continue L11;
                                }
                              }
                            }
                          }
                        }
                        L12: {
                          L13: {
                            var9 = -1L;
                            var11 = -1L;
                            if (var5_long > this.field_a) {
                              break L13;
                            } else {
                              if (this.field_a < var5_long + (long)var8) {
                                var9 = this.field_a;
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if ((this.field_a ^ -1L) < (var5_long ^ -1L)) {
                            break L12;
                          } else {
                            if ((var5_long ^ -1L) <= ((long)this.field_l + this.field_a ^ -1L)) {
                              break L12;
                            } else {
                              var9 = var5_long;
                              break L12;
                            }
                          }
                        }
                        L14: {
                          L15: {
                            if ((var5_long ^ -1L) <= ((long)this.field_l + this.field_a ^ -1L)) {
                              break L15;
                            } else {
                              if (this.field_a + (long)this.field_l > var5_long + (long)var8) {
                                break L15;
                              } else {
                                var11 = (long)this.field_l + this.field_a;
                                break L14;
                              }
                            }
                          }
                          if (var5_long + (long)var8 <= this.field_a) {
                            break L14;
                          } else {
                            if ((this.field_a - -(long)this.field_l ^ -1L) > ((long)var8 + var5_long ^ -1L)) {
                              break L14;
                            } else {
                              var11 = var5_long - -(long)var8;
                              break L14;
                            }
                          }
                        }
                        if ((var9 ^ -1L) >= 0L) {
                          break L8;
                        } else {
                          if ((var11 ^ -1L) < (var9 ^ -1L)) {
                            var13 = (int)(var11 + -var9);
                            qg.a(this.field_h, (int)(-this.field_a + var9), param3, var7 + (int)(var9 - var5_long), var13);
                            if ((this.field_d ^ -1L) <= (var11 ^ -1L)) {
                              break L8;
                            } else {
                              param1 = (int)((long)param1 - (var11 + -this.field_d));
                              this.field_d = var11;
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_k = -1L;
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
                if (param1 > 0) {
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
            stackOut_57_0 = (RuntimeException) (var5_ref);
            stackOut_57_1 = new StringBuilder().append("rg.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param3 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L16;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L16;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ')');
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

    final static short[] a(c param0, int param1, short[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = param0.j(param1, 8);
            if ((var4_int ^ -1) != param3) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (var4_int != param2.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param2 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param0.j(4, 8);
                var6 = (short)param0.j(16, 8);
                if (0 < var5) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param2[var7] = (short)(var6 + param0.j(var5, 8));
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param2[var7] = (short)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (short[]) (param2);
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("rg.H(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    final static boolean a(int[] param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        dm var4_ref_dm = null;
        int var4 = 0;
        int var5_int = 0;
        dm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = EscapeVector.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ck.field_t != al.field_d) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        var2_long = td.b(128);
                        if (param1 >= 101) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        if (vj.field_a == 0) {
                            statePc = 19;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((eh.field_a ^ -1) > -1) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4_ref_dm = (dm) ((Object) bb.field_L.a(false));
                        if (var4_ref_dm == null) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var4_ref_dm.field_g ^ -1L) > (var2_long ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_ref_dm.c((byte) -67);
                        hi.field_r = var4_ref_dm.field_j.length;
                        om.field_g.field_m = 0;
                        var5_int = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var5_int >= hi.field_r) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        om.field_g.field_g[var5_int] = var4_ref_dm.field_j[var5_int];
                        var5_int++;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        g.field_q = f.field_t;
                        f.field_t = jj.field_b;
                        jj.field_b = cd.field_v;
                        cd.field_v = var4_ref_dm.field_i;
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    stackOut_19_0 = eh.field_a;
                    stackIn_22_0 = stackOut_19_0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 20: {
                    stackOut_20_0 = eh.field_a;
                    stackIn_22_0 = stackOut_20_0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        stackOut_21_0 = eh.field_a;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((stackIn_22_0 ^ -1) <= -1) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        om.field_g.field_m = 0;
                        if (bo.a(30000, 1)) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0 != 0;
                }
                case 26: {
                    try {
                        eh.field_a = om.field_g.k(8);
                        om.field_g.field_m = 0;
                        hi.field_r = param0[eh.field_a];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (ll.d(10550)) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = 0;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0 != 0;
                }
                case 30: {
                    try {
                        if (vj.field_a != 0) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        g.field_q = f.field_t;
                        f.field_t = jj.field_b;
                        jj.field_b = cd.field_v;
                        cd.field_v = eh.field_a;
                        eh.field_a = -1;
                        stackOut_31_0 = 1;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 32: {
                    return stackIn_32_0 != 0;
                }
                case 33: {
                    try {
                        var4 = vj.field_a;
                        if (pd.field_a == 0.0) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4 = (int)((double)var4 + gk.field_a.nextGaussian() * pd.field_a);
                        if (-1 >= (var4 ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var4 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var5 = new dm(var2_long - -(long)var4, eh.field_a, new byte[hi.field_r]);
                        var6 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var6 >= hi.field_r) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var5.field_j[var6] = om.field_g.field_g[var6];
                        var6++;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        bb.field_L.a(-12328, var5);
                        eh.field_a = -1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackOut_40_0 = (RuntimeException) (var2);
                    stackOut_40_1 = new StringBuilder().append("rg.A(");
                    stackIn_42_0 = stackOut_40_0;
                    stackIn_42_1 = stackOut_40_1;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    if (param0 == null) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
                    stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
                    stackOut_41_2 = "{...}";
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    stackIn_43_2 = stackOut_41_2;
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
                    stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
                    stackOut_42_2 = "null";
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    stackIn_43_2 = stackOut_42_2;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    throw t.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        try {
            if (param0 < 31) {
            }
            this.a(0, param1.length, (byte) 101, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "rg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rg(ma param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_f = -1L;
        this.field_a = -1L;
        this.field_l = 0;
        try {
            this.field_b = param0;
            dupTemp$0 = param0.c(-26510);
            this.field_i = dupTemp$0;
            this.field_e = dupTemp$0;
            this.field_d = 0L;
            this.field_g = new byte[param1];
            this.field_h = new byte[param2];
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "rg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static lm a(String[] args, byte param1) {
        lm var2 = null;
        RuntimeException var2_ref = null;
        lm stackIn_2_0 = null;
        lm stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lm stackOut_3_0 = null;
        lm stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 <= -53) {
              var2 = new lm(false);
              var2.field_c = args;
              stackOut_3_0 = (lm) (var2);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (lm) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2_ref);
            stackOut_5_1 = new StringBuilder().append("rg.F(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (args == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_c = "Names cannot contain consecutive spaces";
    }
}

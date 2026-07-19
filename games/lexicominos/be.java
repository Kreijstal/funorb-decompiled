/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class be {
    private long field_m;
    private long field_g;
    static String field_i;
    private int field_a;
    private ea field_n;
    private long field_h;
    private byte[] field_j;
    static db[] field_b;
    private int field_c;
    static sc field_q;
    private long field_o;
    private long field_e;
    private byte[] field_p;
    static db field_d;
    private long field_k;
    static int field_l;
    static byte[][] field_f;

    private final void b(int param0) throws IOException {
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          var2 = -124 % ((param0 - -13) / 50);
          if (this.field_g != -1L) {
            L1: {
              if ((this.field_e ^ -1L) == (this.field_g ^ -1L)) {
                break L1;
              } else {
                this.field_n.a((byte) -55, this.field_g);
                this.field_e = this.field_g;
                break L1;
              }
            }
            L2: {
              this.field_n.a(1, 0, this.field_p, this.field_a);
              this.field_e = this.field_e + (long)this.field_a;
              if ((this.field_e ^ -1L) < (this.field_m ^ -1L)) {
                this.field_m = this.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                if ((this.field_k ^ -1L) < (this.field_g ^ -1L)) {
                  break L4;
                } else {
                  if (this.field_g >= this.field_k - -(long)this.field_c) {
                    break L4;
                  } else {
                    var3 = this.field_g;
                    if (var8 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if ((this.field_k ^ -1L) > (this.field_g ^ -1L)) {
                break L3;
              } else {
                if ((this.field_k ^ -1L) > (this.field_g + (long)this.field_a ^ -1L)) {
                  var3 = this.field_k;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                L7: {
                  var5 = -1L;
                  if ((this.field_g - -(long)this.field_a ^ -1L) >= (this.field_k ^ -1L)) {
                    break L7;
                  } else {
                    if ((this.field_k - -(long)this.field_c ^ -1L) <= ((long)this.field_a + this.field_g ^ -1L)) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                if (this.field_g >= (long)this.field_c + this.field_k) {
                  break L5;
                } else {
                  if (((long)this.field_c + this.field_k ^ -1L) >= (this.field_g - -(long)this.field_a ^ -1L)) {
                    var5 = (long)this.field_c + this.field_k;
                    if (var8 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              var5 = (long)this.field_a + this.field_g;
              break L5;
            }
            L8: {
              if (-1L >= var3) {
                break L8;
              } else {
                if (var3 < var5) {
                  var7 = (int)(-var3 + var5);
                  o.a(this.field_p, (int)(var3 + -this.field_g), this.field_j, (int)(-this.field_k + var3), var7);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            this.field_a = 0;
            this.field_g = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    public static void b(byte param0) {
        int var1 = 3 % ((-62 - param0) / 41);
        field_i = null;
        field_b = null;
        field_q = null;
        field_f = (byte[][]) null;
        field_d = null;
    }

    final void c(int param0) throws IOException {
        this.b(126);
        this.field_n.a(true);
        if (param0 != 0) {
        }
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        L0: {
          var4 = Lexicominos.field_L ? 1 : 0;
          this.field_c = 0;
          if ((this.field_h ^ -1L) == (this.field_e ^ -1L)) {
            break L0;
          } else {
            this.field_n.a((byte) -55, this.field_h);
            this.field_e = this.field_h;
            break L0;
          }
        }
        this.field_k = this.field_h;
        L1: while (true) {
          L2: {
            L3: {
              if (this.field_c >= this.field_j.length) {
                break L3;
              } else {
                var2 = -this.field_c + this.field_j.length;
                stackOut_4_0 = 200000000;
                stackOut_4_1 = var2;
                stackIn_12_0 = stackOut_4_0;
                stackIn_12_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (var4 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_5_0 < stackIn_5_1) {
                      var2 = 200000000;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var3 = this.field_n.a(var2, this.field_c, (byte) 116, this.field_j);
                  if (-1 == var3) {
                    break L3;
                  } else {
                    this.field_e = this.field_e + (long)var3;
                    this.field_c = this.field_c + var3;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            stackOut_11_0 = param0;
            stackOut_11_1 = -29960;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L2;
          }
          L5: {
            if (stackIn_12_0 == stackIn_12_1) {
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    final void a(byte param0, long param1) throws IOException {
        if (param1 < 0L) {
            throw new IOException();
        }
        if (param0 != 40) {
            return;
        }
        this.field_h = param1;
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
            this.a(param1, param0, param0.length, -1);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "be.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final long a(byte param0) {
        if (param0 != -122) {
            be.b((byte) 125);
        }
        return this.field_o;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        var14 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if ((param1.length ^ -1) <= (param0 + param2 ^ -1)) {
                  L2: {
                    if (-1L == this.field_g) {
                      break L2;
                    } else {
                      if ((this.field_h ^ -1L) > (this.field_g ^ -1L)) {
                        break L2;
                      } else {
                        if (this.field_h - -(long)param2 <= (long)this.field_a + this.field_g) {
                          o.a(this.field_p, (int)(-this.field_g + this.field_h), param1, param0, param2);
                          this.field_h = this.field_h + (long)param2;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_long = this.field_h;
                    var7 = param0;
                    var8 = param2;
                    if (this.field_k > this.field_h) {
                      break L3;
                    } else {
                      if ((this.field_h ^ -1L) > ((long)this.field_c + this.field_k ^ -1L)) {
                        L4: {
                          var9_int = (int)((long)this.field_c - -this.field_k - this.field_h);
                          if (var9_int > param2) {
                            var9_int = param2;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        o.a(this.field_j, (int)(-this.field_k + this.field_h), param1, param0, var9_int);
                        param2 = param2 - var9_int;
                        this.field_h = this.field_h + (long)var9_int;
                        param0 = param0 + var9_int;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      L7: {
                        if ((this.field_j.length ^ -1) > (param2 ^ -1)) {
                          break L7;
                        } else {
                          if (param2 > 0) {
                            L8: {
                              this.a(-29960);
                              var9_int = param2;
                              if (this.field_c >= var9_int) {
                                break L8;
                              } else {
                                var9_int = this.field_c;
                                break L8;
                              }
                            }
                            o.a(this.field_j, 0, param1, param0, var9_int);
                            param0 = param0 + var9_int;
                            this.field_h = this.field_h + (long)var9_int;
                            param2 = param2 - var9_int;
                            if (var14 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      this.field_n.a((byte) -55, this.field_h);
                      this.field_e = this.field_h;
                      L9: while (true) {
                        if (0 >= param2) {
                          break L6;
                        } else {
                          var9_int = this.field_n.a(param2, param0, (byte) -121, param1);
                          stackOut_24_0 = var9_int;
                          stackOut_24_1 = -1;
                          stackIn_60_0 = stackOut_24_0;
                          stackIn_60_1 = stackOut_24_1;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          if (var14 != 0) {
                            break L5;
                          } else {
                            if (stackIn_25_0 == stackIn_25_1) {
                              break L6;
                            } else {
                              param2 = param2 - var9_int;
                              this.field_e = this.field_e + (long)var9_int;
                              this.field_h = this.field_h + (long)var9_int;
                              param0 = param0 + var9_int;
                              if (var14 == 0) {
                                continue L9;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                    }
                    L10: {
                      if (this.field_g != (long)param3) {
                        L11: {
                          L12: {
                            if (this.field_h >= this.field_g) {
                              break L12;
                            } else {
                              if (0 < param2) {
                                L13: {
                                  var9_int = param0 - -(int)(-this.field_h + this.field_g);
                                  if (param2 + param0 < var9_int) {
                                    var9_int = param2 + param0;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                L14: while (true) {
                                  if ((var9_int ^ -1) >= (param0 ^ -1)) {
                                    break L12;
                                  } else {
                                    param2--;
                                    incrementValue$1 = param0;
                                    param0++;
                                    param1[incrementValue$1] = (byte) 0;
                                    this.field_h = this.field_h + 1L;
                                    if (var14 != 0) {
                                      break L11;
                                    } else {
                                      if (var14 == 0) {
                                        continue L14;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L12;
                              }
                            }
                          }
                          L15: {
                            L16: {
                              var9 = -1L;
                              if ((this.field_g ^ -1L) > (var5_long ^ -1L)) {
                                break L16;
                              } else {
                                if (this.field_g >= var5_long - -(long)var8) {
                                  break L16;
                                } else {
                                  var9 = this.field_g;
                                  if (var14 == 0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                            if (var5_long < this.field_g) {
                              break L15;
                            } else {
                              if ((var5_long ^ -1L) > (this.field_g - -(long)this.field_a ^ -1L)) {
                                var9 = var5_long;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L17: {
                            L18: {
                              var11 = -1L;
                              if ((var5_long ^ -1L) <= ((long)this.field_a + this.field_g ^ -1L)) {
                                break L18;
                              } else {
                                if (this.field_g - -(long)this.field_a > (long)var8 + var5_long) {
                                  break L18;
                                } else {
                                  var11 = this.field_g + (long)this.field_a;
                                  if (var14 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            if ((var5_long + (long)var8 ^ -1L) >= (this.field_g ^ -1L)) {
                              break L17;
                            } else {
                              if (this.field_g - -(long)this.field_a >= (long)var8 + var5_long) {
                                var11 = (long)var8 + var5_long;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          }
                          if (-1L >= var9) {
                            break L11;
                          } else {
                            if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                              break L11;
                            } else {
                              var13 = (int)(var11 - var9);
                              o.a(this.field_p, (int)(-this.field_g + var9), param1, (int)(var9 - var5_long) + var7, var13);
                              if (this.field_h >= var11) {
                                break L11;
                              } else {
                                param2 = (int)((long)param2 - (-this.field_h + var11));
                                this.field_h = var11;
                                break L11;
                              }
                            }
                          }
                        }
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    stackOut_59_0 = -1;
                    stackOut_59_1 = param2 ^ -1;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    break L5;
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  throw new ArrayIndexOutOfBoundsException(param2 + param0 + -param1.length);
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_e = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if (stackIn_60_0 > stackIn_60_1) {
                throw new EOFException();
              } else {
                decompiledRegionSelector1 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L19: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) (var5_ref);
            stackOut_64_1 = new StringBuilder().append("be.H(").append(param0).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param1 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L19;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L19;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if ((this.field_o ^ -1L) <= (this.field_h - -(long)param2 ^ -1L)) {
                    break L2;
                  } else {
                    this.field_o = (long)param2 + this.field_h;
                    break L2;
                  }
                }
                L3: {
                  if (param3 == -31593) {
                    break L3;
                  } else {
                    be.b((byte) -7);
                    break L3;
                  }
                }
                L4: {
                  if (this.field_g == -1L) {
                    break L4;
                  } else {
                    L5: {
                      if ((this.field_g ^ -1L) < (this.field_h ^ -1L)) {
                        break L5;
                      } else {
                        if ((this.field_g + (long)this.field_a ^ -1L) <= (this.field_h ^ -1L)) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    this.b(65);
                    break L4;
                  }
                }
                L6: {
                  if (this.field_g == -1L) {
                    break L6;
                  } else {
                    if (((long)param2 + this.field_h ^ -1L) >= ((long)this.field_p.length + this.field_g ^ -1L)) {
                      break L6;
                    } else {
                      var5_int = (int)((long)this.field_p.length + (this.field_g + -this.field_h));
                      o.a(param1, param0, this.field_p, (int)(-this.field_g + this.field_h), var5_int);
                      param0 = param0 + var5_int;
                      this.field_h = this.field_h + (long)var5_int;
                      param2 = param2 - var5_int;
                      this.field_a = this.field_p.length;
                      this.b(93);
                      break L6;
                    }
                  }
                }
                if (this.field_p.length >= param2) {
                  if (-1 <= (param2 ^ -1)) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L7: {
                      if (0L != (this.field_g ^ -1L)) {
                        break L7;
                      } else {
                        this.field_g = this.field_h;
                        break L7;
                      }
                    }
                    L8: {
                      o.a(param1, param0, this.field_p, (int)(-this.field_g + this.field_h), param2);
                      this.field_h = this.field_h + (long)param2;
                      if ((-this.field_g + this.field_h ^ -1L) < ((long)this.field_a ^ -1L)) {
                        this.field_a = (int)(-this.field_g + this.field_h);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                } else {
                  L9: {
                    if ((this.field_h ^ -1L) == (this.field_e ^ -1L)) {
                      break L9;
                    } else {
                      this.field_n.a((byte) -55, this.field_h);
                      this.field_e = this.field_h;
                      break L9;
                    }
                  }
                  L10: {
                    this.field_n.a(1, param0, param1, param2);
                    this.field_e = this.field_e + (long)param2;
                    if (this.field_m < this.field_e) {
                      this.field_m = this.field_e;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    L12: {
                      L13: {
                        var5_long = -1L;
                        var7 = -1L;
                        if (this.field_k > this.field_h) {
                          break L13;
                        } else {
                          if ((this.field_h ^ -1L) > (this.field_k + (long)this.field_c ^ -1L)) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      if ((this.field_k ^ -1L) > (this.field_h ^ -1L)) {
                        break L11;
                      } else {
                        if (this.field_h - -(long)param2 <= this.field_k) {
                          break L11;
                        } else {
                          var5_long = this.field_k;
                          if (var10 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    var5_long = this.field_h;
                    break L11;
                  }
                  L14: {
                    L15: {
                      L16: {
                        if ((this.field_h - -(long)param2 ^ -1L) >= (this.field_k ^ -1L)) {
                          break L16;
                        } else {
                          if ((this.field_k - -(long)this.field_c ^ -1L) <= (this.field_h - -(long)param2 ^ -1L)) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      if ((this.field_k - -(long)this.field_c ^ -1L) >= (this.field_h ^ -1L)) {
                        break L14;
                      } else {
                        if ((long)this.field_c + this.field_k <= (long)param2 + this.field_h) {
                          var7 = (long)this.field_c + this.field_k;
                          if (var10 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    var7 = (long)param2 + this.field_h;
                    break L14;
                  }
                  L17: {
                    if (0L <= (var5_long ^ -1L)) {
                      break L17;
                    } else {
                      if ((var7 ^ -1L) < (var5_long ^ -1L)) {
                        var9 = (int)(var7 - var5_long);
                        o.a(param1, (int)(-this.field_h + ((long)param0 + var5_long)), this.field_j, (int)(var5_long - this.field_k), var9);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  this.field_h = this.field_h + (long)param2;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_e = -1L;
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
          L18: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var5_ref);
            stackOut_50_1 = new StringBuilder().append("be.D(").append(param0).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L18;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L18;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param2 + ',' + param3 + ')');
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

    be(ea param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_a = 0;
        this.field_g = -1L;
        this.field_k = -1L;
        try {
            this.field_n = param0;
            dupTemp$0 = param0.a(-45);
            this.field_m = dupTemp$0;
            this.field_o = dupTemp$0;
            this.field_h = 0L;
            this.field_j = new byte[param1];
            this.field_p = new byte[param2];
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "be.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_i = "Log in";
        field_q = new sc();
        field_d = new db(540, 140);
    }
}

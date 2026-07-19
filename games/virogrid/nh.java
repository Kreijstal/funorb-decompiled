/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nh {
    private byte[] field_e;
    static String field_a;
    private long field_g;
    static int field_o;
    private int field_p;
    static String[] field_d;
    private byte[] field_i;
    private long field_f;
    private long field_b;
    private long field_m;
    static String field_r;
    private long field_q;
    static String field_l;
    static String field_n;
    private ji field_h;
    private long field_j;
    static int[] field_s;
    private int field_k;
    static int field_c;

    final void b(byte param0) throws IOException {
        if (param0 != 14) {
            this.field_f = -101L;
        }
        this.a(-1);
        this.field_h.b(0);
    }

    final long a(byte param0) {
        if (param0 < 124) {
            return 75L;
        }
        return this.field_b;
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (this.field_m == (long)param0) {
            break L0;
          } else {
            L1: {
              if (this.field_g != this.field_m) {
                this.field_h.a(param0 + 110, this.field_m);
                this.field_g = this.field_m;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_h.a(this.field_p, this.field_i, 0, false);
              this.field_g = this.field_g + (long)this.field_p;
              if ((this.field_g ^ -1L) >= (this.field_q ^ -1L)) {
                break L2;
              } else {
                this.field_q = this.field_g;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (this.field_m < this.field_f) {
                  break L4;
                } else {
                  if ((this.field_m ^ -1L) <= (this.field_f - -(long)this.field_k ^ -1L)) {
                    break L4;
                  } else {
                    var2 = this.field_m;
                    break L3;
                  }
                }
              }
              if (this.field_f < this.field_m) {
                break L3;
              } else {
                if ((long)this.field_p + this.field_m <= this.field_f) {
                  break L3;
                } else {
                  var2 = this.field_f;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if ((this.field_f ^ -1L) <= ((long)this.field_p + this.field_m ^ -1L)) {
                  break L6;
                } else {
                  if ((long)this.field_k + this.field_f >= (long)this.field_p + this.field_m) {
                    var4 = (long)this.field_p + this.field_m;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if ((this.field_m ^ -1L) <= (this.field_f + (long)this.field_k ^ -1L)) {
                break L5;
              } else {
                if (this.field_f + (long)this.field_k > this.field_m - -(long)this.field_p) {
                  break L5;
                } else {
                  var4 = (long)this.field_k + this.field_f;
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
                break L7;
              } else {
                if ((var4 ^ -1L) < (var2 ^ -1L)) {
                  var6 = (int)(var4 + -var2);
                  ek.a(this.field_i, (int)(var2 + -this.field_m), this.field_e, (int)(var2 + -this.field_f), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            this.field_m = -1L;
            this.field_p = 0;
            break L0;
          }
        }
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
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
        var14 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (param1 + param0 <= param2.length) {
                  L2: {
                    if (this.field_m == -1L) {
                      break L2;
                    } else {
                      if ((this.field_j ^ -1L) > (this.field_m ^ -1L)) {
                        break L2;
                      } else {
                        if (((long)param1 + this.field_j ^ -1L) < (this.field_m - -(long)this.field_p ^ -1L)) {
                          break L2;
                        } else {
                          ek.a(this.field_i, (int)(-this.field_m + this.field_j), param2, param0, param1);
                          this.field_j = this.field_j + (long)param1;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  var5_long = this.field_j;
                  if (param3 >= 122) {
                    L3: {
                      var7 = param0;
                      var8 = param1;
                      if (this.field_j < this.field_f) {
                        break L3;
                      } else {
                        if (this.field_j >= this.field_f - -(long)this.field_k) {
                          break L3;
                        } else {
                          L4: {
                            var9_int = (int)(-this.field_j + (this.field_f + (long)this.field_k));
                            if (param1 >= var9_int) {
                              break L4;
                            } else {
                              var9_int = param1;
                              break L4;
                            }
                          }
                          ek.a(this.field_e, (int)(this.field_j + -this.field_f), param2, param0, var9_int);
                          param0 = param0 + var9_int;
                          this.field_j = this.field_j + (long)var9_int;
                          param1 = param1 - var9_int;
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (this.field_e.length < param1) {
                        this.field_h.a(-119, this.field_j);
                        this.field_g = this.field_j;
                        L6: while (true) {
                          if (param1 <= 0) {
                            break L5;
                          } else {
                            var9_int = this.field_h.a(param1, param0, 1, param2);
                            if (var9_int == -1) {
                              break L5;
                            } else {
                              this.field_g = this.field_g + (long)var9_int;
                              param1 = param1 - var9_int;
                              this.field_j = this.field_j + (long)var9_int;
                              param0 = param0 + var9_int;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        if (-1 <= (param1 ^ -1)) {
                          break L5;
                        } else {
                          L7: {
                            this.b(17460);
                            var9_int = param1;
                            if (var9_int > this.field_k) {
                              var9_int = this.field_k;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          ek.a(this.field_e, 0, param2, param0, var9_int);
                          this.field_j = this.field_j + (long)var9_int;
                          param0 = param0 + var9_int;
                          param1 = param1 - var9_int;
                          break L5;
                        }
                      }
                    }
                    L8: {
                      if (-1L == this.field_m) {
                        break L8;
                      } else {
                        L9: {
                          if (this.field_m <= this.field_j) {
                            break L9;
                          } else {
                            if (-1 > (param1 ^ -1)) {
                              L10: {
                                var9_int = (int)(-this.field_j + this.field_m) + param0;
                                if (param0 + param1 < var9_int) {
                                  var9_int = param1 + param0;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              L11: while (true) {
                                if (var9_int <= param0) {
                                  break L9;
                                } else {
                                  incrementValue$1 = param0;
                                  param0++;
                                  param2[incrementValue$1] = (byte) 0;
                                  param1--;
                                  this.field_j = this.field_j + 1L;
                                  continue L11;
                                }
                              }
                            } else {
                              break L9;
                            }
                          }
                        }
                        L12: {
                          L13: {
                            var9 = -1L;
                            var11 = -1L;
                            if ((var5_long ^ -1L) < (this.field_m ^ -1L)) {
                              break L13;
                            } else {
                              if (this.field_m < (long)var8 + var5_long) {
                                var9 = this.field_m;
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if ((this.field_m ^ -1L) < (var5_long ^ -1L)) {
                            break L12;
                          } else {
                            if ((this.field_m + (long)this.field_p ^ -1L) >= (var5_long ^ -1L)) {
                              break L12;
                            } else {
                              var9 = var5_long;
                              break L12;
                            }
                          }
                        }
                        L14: {
                          L15: {
                            if (this.field_m + (long)this.field_p <= var5_long) {
                              break L15;
                            } else {
                              if (this.field_m + (long)this.field_p > var5_long - -(long)var8) {
                                break L15;
                              } else {
                                var11 = (long)this.field_p + this.field_m;
                                break L14;
                              }
                            }
                          }
                          if (this.field_m >= var5_long + (long)var8) {
                            break L14;
                          } else {
                            if ((long)this.field_p + this.field_m >= (long)var8 + var5_long) {
                              var11 = var5_long + (long)var8;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                        if ((var9 ^ -1L) >= 0L) {
                          break L8;
                        } else {
                          if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                            break L8;
                          } else {
                            var13 = (int)(-var9 + var11);
                            ek.a(this.field_i, (int)(-this.field_m + var9), param2, var7 + (int)(var9 - var5_long), var13);
                            if ((this.field_j ^ -1L) <= (var11 ^ -1L)) {
                              break L8;
                            } else {
                              param1 = (int)((long)param1 - (var11 - this.field_j));
                              this.field_j = var11;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                } else {
                  throw new ArrayIndexOutOfBoundsException(-param2.length + param0 - -param1);
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_g = -1L;
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
                if ((param1 ^ -1) >= -1) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  throw new EOFException();
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var5_ref);
            stackOut_57_1 = new StringBuilder().append("nh.C(").append(param0).append(',').append(param1).append(',');
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param2 == null) {
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
          throw kg.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param3 + ')');
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

    final void a(byte param0, byte[] param1) throws IOException {
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(0, param1.length, param1, (byte) 124);
              if (param0 == -102) {
                break L1;
              } else {
                this.field_m = 89L;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3);
            stackOut_3_1 = new StringBuilder().append("nh.H(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        this.field_k = 0;
        if ((this.field_j ^ -1L) != (this.field_g ^ -1L)) {
            this.field_h.a(-100, this.field_j);
            this.field_g = this.field_j;
        }
        if (param0 != 17460) {
            this.field_i = (byte[]) null;
        }
        this.field_f = this.field_j;
        while (this.field_k < this.field_e.length) {
            var2 = -this.field_k + this.field_e.length;
            if (!(-200000001 <= (var2 ^ -1))) {
                var2 = 200000000;
            }
            var3 = this.field_h.a(var2, this.field_k, 1, this.field_e);
            if ((var3 ^ -1) == 0) {
                break;
            }
            this.field_k = this.field_k + var3;
            this.field_g = this.field_g + (long)var3;
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 != 0) {
        }
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        this.field_j = param0;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if ((long)param2 + this.field_j <= this.field_b) {
                    break L2;
                  } else {
                    this.field_b = (long)param2 + this.field_j;
                    break L2;
                  }
                }
                L3: {
                  if ((this.field_m ^ -1L) == 0L) {
                    break L3;
                  } else {
                    if (this.field_m <= this.field_j) {
                      if (this.field_m + (long)this.field_p >= this.field_j) {
                        break L3;
                      } else {
                        this.a(-1);
                        break L3;
                      }
                    } else {
                      this.a(-1);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (this.field_m == -1L) {
                    break L4;
                  } else {
                    if (this.field_j + (long)param2 <= this.field_m + (long)this.field_i.length) {
                      break L4;
                    } else {
                      var5_int = (int)((long)this.field_i.length - this.field_j - -this.field_m);
                      ek.a(param1, param0, this.field_i, (int)(this.field_j + -this.field_m), var5_int);
                      param2 = param2 - var5_int;
                      this.field_j = this.field_j + (long)var5_int;
                      param0 = param0 + var5_int;
                      this.field_p = this.field_i.length;
                      this.a(param3 + -1);
                      break L4;
                    }
                  }
                }
                if (param2 > this.field_i.length) {
                  L5: {
                    if (this.field_g == this.field_j) {
                      break L5;
                    } else {
                      this.field_h.a(81, this.field_j);
                      this.field_g = this.field_j;
                      break L5;
                    }
                  }
                  L6: {
                    this.field_h.a(param2, param1, param0, false);
                    this.field_g = this.field_g + (long)param2;
                    if (this.field_g <= this.field_q) {
                      break L6;
                    } else {
                      this.field_q = this.field_g;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var5_long = -1L;
                      if ((this.field_j ^ -1L) > (this.field_f ^ -1L)) {
                        break L8;
                      } else {
                        if ((long)this.field_k + this.field_f > this.field_j) {
                          var5_long = this.field_j;
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if ((this.field_j ^ -1L) < (this.field_f ^ -1L)) {
                      break L7;
                    } else {
                      if ((this.field_f ^ -1L) <= ((long)param2 + this.field_j ^ -1L)) {
                        break L7;
                      } else {
                        var5_long = this.field_f;
                        break L7;
                      }
                    }
                  }
                  L9: {
                    L10: {
                      var7 = -1L;
                      if ((this.field_j - -(long)param2 ^ -1L) >= (this.field_f ^ -1L)) {
                        break L10;
                      } else {
                        if (this.field_j + (long)param2 > (long)this.field_k + this.field_f) {
                          break L10;
                        } else {
                          var7 = (long)param2 + this.field_j;
                          break L9;
                        }
                      }
                    }
                    if (this.field_f + (long)this.field_k <= this.field_j) {
                      break L9;
                    } else {
                      if (this.field_f - -(long)this.field_k > this.field_j + (long)param2) {
                        break L9;
                      } else {
                        var7 = this.field_f + (long)this.field_k;
                        break L9;
                      }
                    }
                  }
                  L11: {
                    if ((var5_long ^ -1L) >= 0L) {
                      break L11;
                    } else {
                      if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
                        break L11;
                      } else {
                        var9 = (int)(-var5_long + var7);
                        ek.a(param1, (int)(var5_long + ((long)param0 + -this.field_j)), this.field_e, (int)(var5_long - this.field_f), var9);
                        break L11;
                      }
                    }
                  }
                  this.field_j = this.field_j + (long)param2;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (param2 > param3) {
                    L12: {
                      if (0L == (this.field_m ^ -1L)) {
                        this.field_m = this.field_j;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      ek.a(param1, param0, this.field_i, (int)(-this.field_m + this.field_j), param2);
                      this.field_j = this.field_j + (long)param2;
                      if (-this.field_m + this.field_j <= (long)this.field_p) {
                        break L13;
                      } else {
                        this.field_p = (int)(this.field_j - this.field_m);
                        break L13;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_g = -1L;
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
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var5_ref);
            stackOut_47_1 = new StringBuilder().append("nh.D(").append(param0).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L14;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L14;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param2 + ',' + param3 + ')');
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

    public static void a(boolean param0) {
        field_s = null;
        if (param0) {
            field_r = (String) null;
        }
        field_n = null;
        field_d = null;
        field_a = null;
        field_l = null;
        field_r = null;
    }

    nh(ji param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_m = -1L;
        this.field_f = -1L;
        this.field_p = 0;
        try {
            this.field_h = param0;
            dupTemp$0 = param0.a((byte) 104);
            this.field_q = dupTemp$0;
            this.field_b = dupTemp$0;
            this.field_i = new byte[param2];
            this.field_e = new byte[param1];
            this.field_j = 0L;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "nh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_r = "Loading music";
        field_l = "Passwords must be between 5 and 20 characters long";
        field_a = "Spectate";
        field_n = "Message lobby";
    }
}

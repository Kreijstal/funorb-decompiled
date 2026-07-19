/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class p {
    static int field_m;
    private long field_k;
    private int field_j;
    private byte[] field_e;
    private byte[] field_l;
    private long field_g;
    static String field_c;
    private sa field_h;
    private long field_a;
    private long field_b;
    private int field_f;
    private long field_i;
    private long field_d;

    final long b(int param0) {
        if (param0 != -200000001) {
            this.field_d = 63L;
        }
        return this.field_i;
    }

    final void a(int param0) throws IOException {
        this.a((byte) 66);
        this.field_h.b(0);
        if (param0 != -1) {
            this.field_f = -5;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var10 = TetraLink.field_J;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if ((long)param3 + this.field_k <= this.field_i) {
                    break L2;
                  } else {
                    this.field_i = this.field_k - -(long)param3;
                    break L2;
                  }
                }
                L3: {
                  if (this.field_b == -1L) {
                    break L3;
                  } else {
                    L4: {
                      if (this.field_b > this.field_k) {
                        break L4;
                      } else {
                        if (this.field_b - -(long)this.field_f < this.field_k) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.a((byte) 66);
                    break L3;
                  }
                }
                L5: {
                  if (param0 == -19735) {
                    break L5;
                  } else {
                    p.b((byte) -23);
                    break L5;
                  }
                }
                L6: {
                  if (0L == (this.field_b ^ -1L)) {
                    break L6;
                  } else {
                    if (this.field_b - -(long)this.field_e.length >= this.field_k - -(long)param3) {
                      break L6;
                    } else {
                      var5_int = (int)((long)this.field_e.length - (-this.field_b + this.field_k));
                      rd.a(param1, param2, this.field_e, (int)(-this.field_b + this.field_k), var5_int);
                      this.field_k = this.field_k + (long)var5_int;
                      param2 = param2 + var5_int;
                      param3 = param3 - var5_int;
                      this.field_f = this.field_e.length;
                      this.a((byte) 66);
                      break L6;
                    }
                  }
                }
                if (this.field_e.length < param3) {
                  L7: {
                    if (this.field_k == this.field_g) {
                      break L7;
                    } else {
                      this.field_h.a(this.field_k, false);
                      this.field_g = this.field_k;
                      break L7;
                    }
                  }
                  L8: {
                    this.field_h.a(param0 + 19649, param2, param1, param3);
                    this.field_g = this.field_g + (long)param3;
                    if (this.field_g > this.field_a) {
                      this.field_a = this.field_g;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    L10: {
                      var5_long = -1L;
                      if ((this.field_d ^ -1L) < (this.field_k ^ -1L)) {
                        break L10;
                      } else {
                        if ((this.field_d + (long)this.field_j ^ -1L) < (this.field_k ^ -1L)) {
                          var5_long = this.field_k;
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if ((this.field_d ^ -1L) > (this.field_k ^ -1L)) {
                      break L9;
                    } else {
                      if (((long)param3 + this.field_k ^ -1L) < (this.field_d ^ -1L)) {
                        var5_long = this.field_d;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    L12: {
                      var7 = -1L;
                      if ((this.field_d ^ -1L) <= (this.field_k - -(long)param3 ^ -1L)) {
                        break L12;
                      } else {
                        if ((long)this.field_j + this.field_d < (long)param3 + this.field_k) {
                          break L12;
                        } else {
                          var7 = (long)param3 + this.field_k;
                          break L11;
                        }
                      }
                    }
                    if (this.field_k >= (long)this.field_j + this.field_d) {
                      break L11;
                    } else {
                      if ((long)param3 + this.field_k >= (long)this.field_j + this.field_d) {
                        var7 = (long)this.field_j + this.field_d;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    if (-1L >= var5_long) {
                      break L13;
                    } else {
                      if (var5_long < var7) {
                        var9 = (int)(-var5_long + var7);
                        rd.a(param1, (int)(var5_long + ((long)param2 + -this.field_k)), this.field_l, (int)(-this.field_d + var5_long), var9);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  this.field_k = this.field_k + (long)param3;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (param3 <= 0) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L14: {
                      if ((this.field_b ^ -1L) != 0L) {
                        break L14;
                      } else {
                        this.field_b = this.field_k;
                        break L14;
                      }
                    }
                    L15: {
                      rd.a(param1, param2, this.field_e, (int)(-this.field_b + this.field_k), param3);
                      this.field_k = this.field_k + (long)param3;
                      if ((-this.field_b + this.field_k ^ -1L) >= ((long)this.field_f ^ -1L)) {
                        break L15;
                      } else {
                        this.field_f = (int)(this.field_k - this.field_b);
                        break L15;
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
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var5_ref);
            stackOut_50_1 = new StringBuilder().append("p.E(").append(param0).append(',');
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
              break L16;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L16;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param2 + ',' + param3 + ')');
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

    private final void a(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = TetraLink.field_J;
        this.field_j = 0;
        if (!((this.field_g ^ -1L) == (this.field_k ^ -1L))) {
            this.field_h.a(this.field_k, false);
            this.field_g = this.field_k;
        }
        if (!param0) {
            this.field_i = -73L;
        }
        this.field_d = this.field_k;
        while (this.field_l.length > this.field_j) {
            var2 = this.field_l.length - this.field_j;
            if (!((var2 ^ -1) >= -200000001)) {
                var2 = 200000000;
            }
            var3 = this.field_h.a(var2, this.field_j, this.field_l, (byte) 115);
            if (0 == (var3 ^ -1)) {
                break;
            }
            this.field_j = this.field_j + var3;
            this.field_g = this.field_g + (long)var3;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 > -80) {
            field_m = 19;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2 = la.a(il.a(-23718, param0), true);
              if (var2 != null) {
                break L1;
              } else {
                var2 = "";
                break L1;
              }
            }
            L2: {
              if (param1 == 43) {
                break L2;
              } else {
                field_m = 25;
                break L2;
              }
            }
            stackOut_4_0 = (String) (var2);
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2_ref);
            stackOut_6_1 = new StringBuilder().append("p.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        if (param0 == 66) {
          L0: {
            if (0L != (this.field_b ^ -1L)) {
              L1: {
                if ((this.field_b ^ -1L) == (this.field_g ^ -1L)) {
                  break L1;
                } else {
                  this.field_h.a(this.field_b, false);
                  this.field_g = this.field_b;
                  break L1;
                }
              }
              L2: {
                this.field_h.a(-128, 0, this.field_e, this.field_f);
                this.field_g = this.field_g + (long)this.field_f;
                if ((this.field_g ^ -1L) < (this.field_a ^ -1L)) {
                  this.field_a = this.field_g;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  if ((this.field_b ^ -1L) > (this.field_d ^ -1L)) {
                    break L4;
                  } else {
                    if ((this.field_b ^ -1L) <= (this.field_d - -(long)this.field_j ^ -1L)) {
                      break L4;
                    } else {
                      var2 = this.field_b;
                      break L3;
                    }
                  }
                }
                if (this.field_b > this.field_d) {
                  break L3;
                } else {
                  if ((this.field_b - -(long)this.field_f ^ -1L) >= (this.field_d ^ -1L)) {
                    break L3;
                  } else {
                    var2 = this.field_d;
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  var4 = -1L;
                  if (((long)this.field_f + this.field_b ^ -1L) >= (this.field_d ^ -1L)) {
                    break L6;
                  } else {
                    if (this.field_d - -(long)this.field_j >= this.field_b + (long)this.field_f) {
                      var4 = (long)this.field_f + this.field_b;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((this.field_d - -(long)this.field_j ^ -1L) >= (this.field_b ^ -1L)) {
                  break L5;
                } else {
                  if (this.field_b + (long)this.field_f >= (long)this.field_j + this.field_d) {
                    var4 = this.field_d + (long)this.field_j;
                    break L5;
                  } else {
                    L7: {
                      if (-1L >= var2) {
                        break L7;
                      } else {
                        if ((var2 ^ -1L) <= (var4 ^ -1L)) {
                          break L7;
                        } else {
                          var6 = (int)(var4 - var2);
                          rd.a(this.field_e, (int)(var2 - this.field_b), this.field_l, (int)(var2 - this.field_d), var6);
                          break L7;
                        }
                      }
                    }
                    this.field_f = 0;
                    this.field_b = -1L;
                    break L0;
                  }
                }
              }
              L8: {
                if (-1L >= var2) {
                  break L8;
                } else {
                  if ((var2 ^ -1L) <= (var4 ^ -1L)) {
                    break L8;
                  } else {
                    var6 = (int)(var4 - var2);
                    rd.a(this.field_e, (int)(var2 - this.field_b), this.field_l, (int)(var2 - this.field_d), var6);
                    break L8;
                  }
                }
              }
              this.field_f = 0;
              this.field_b = -1L;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        if (param1 != 66) {
            return;
        }
        try {
            this.a(param0, param0.length, 0, (byte) 120);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "p.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
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
        var14 = TetraLink.field_J;
        try {
          L0: {
            try {
              L1: {
                if (param1 + param2 <= param0.length) {
                  L2: {
                    if (-1L == this.field_b) {
                      break L2;
                    } else {
                      if ((this.field_b ^ -1L) < (this.field_k ^ -1L)) {
                        break L2;
                      } else {
                        if ((this.field_b - -(long)this.field_f ^ -1L) <= ((long)param1 + this.field_k ^ -1L)) {
                          rd.a(this.field_e, (int)(this.field_k + -this.field_b), param0, param2, param1);
                          this.field_k = this.field_k + (long)param1;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_long = this.field_k;
                    var7 = param2;
                    if (param3 > 31) {
                      break L3;
                    } else {
                      field_m = -43;
                      break L3;
                    }
                  }
                  L4: {
                    var8 = param1;
                    if ((this.field_d ^ -1L) < (this.field_k ^ -1L)) {
                      break L4;
                    } else {
                      if (this.field_k >= (long)this.field_j + this.field_d) {
                        break L4;
                      } else {
                        L5: {
                          var9_int = (int)(-this.field_k + (this.field_d + (long)this.field_j));
                          if (param1 >= var9_int) {
                            break L5;
                          } else {
                            var9_int = param1;
                            break L5;
                          }
                        }
                        rd.a(this.field_l, (int)(this.field_k - this.field_d), param0, param2, var9_int);
                        param2 = param2 + var9_int;
                        param1 = param1 - var9_int;
                        this.field_k = this.field_k + (long)var9_int;
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (param1 <= this.field_l.length) {
                      if (-1 <= (param1 ^ -1)) {
                        break L6;
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
                        rd.a(this.field_l, 0, param0, param2, var9_int);
                        this.field_k = this.field_k + (long)var9_int;
                        param1 = param1 - var9_int;
                        param2 = param2 + var9_int;
                        break L6;
                      }
                    } else {
                      this.field_h.a(this.field_k, false);
                      this.field_g = this.field_k;
                      L8: while (true) {
                        if ((param1 ^ -1) >= -1) {
                          break L6;
                        } else {
                          var9_int = this.field_h.a(param1, param2, param0, (byte) -121);
                          if (-1 == var9_int) {
                            break L6;
                          } else {
                            param1 = param1 - var9_int;
                            this.field_k = this.field_k + (long)var9_int;
                            param2 = param2 + var9_int;
                            this.field_g = this.field_g + (long)var9_int;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    if (0L == (this.field_b ^ -1L)) {
                      break L9;
                    } else {
                      L10: {
                        if ((this.field_k ^ -1L) <= (this.field_b ^ -1L)) {
                          break L10;
                        } else {
                          if ((param1 ^ -1) >= -1) {
                            break L10;
                          } else {
                            L11: {
                              var9_int = param2 - -(int)(this.field_b - this.field_k);
                              if (var9_int <= param1 + param2) {
                                break L11;
                              } else {
                                var9_int = param1 + param2;
                                break L11;
                              }
                            }
                            L12: while (true) {
                              if (var9_int <= param2) {
                                break L10;
                              } else {
                                incrementValue$1 = param2;
                                param2++;
                                param0[incrementValue$1] = (byte) 0;
                                param1--;
                                this.field_k = this.field_k + 1L;
                                continue L12;
                              }
                            }
                          }
                        }
                      }
                      L13: {
                        L14: {
                          var9 = -1L;
                          var11 = -1L;
                          if (var5_long > this.field_b) {
                            break L14;
                          } else {
                            if (var5_long - -(long)var8 > this.field_b) {
                              var9 = this.field_b;
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        if (var5_long < this.field_b) {
                          break L13;
                        } else {
                          if ((long)this.field_f + this.field_b > var5_long) {
                            var9 = var5_long;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L15: {
                        L16: {
                          if ((var5_long ^ -1L) <= ((long)this.field_f + this.field_b ^ -1L)) {
                            break L16;
                          } else {
                            if (((long)var8 + var5_long ^ -1L) <= (this.field_b + (long)this.field_f ^ -1L)) {
                              var11 = this.field_b - -(long)this.field_f;
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        if ((this.field_b ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                          break L15;
                        } else {
                          if (this.field_b - -(long)this.field_f >= var5_long + (long)var8) {
                            var11 = var5_long - -(long)var8;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (var9 <= -1L) {
                        break L9;
                      } else {
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                          break L9;
                        } else {
                          var13 = (int)(-var9 + var11);
                          rd.a(this.field_e, (int)(-this.field_b + var9), param0, var7 + (int)(-var5_long + var9), var13);
                          if ((var11 ^ -1L) >= (this.field_k ^ -1L)) {
                            break L9;
                          } else {
                            param1 = (int)((long)param1 - (var11 - this.field_k));
                            this.field_k = var11;
                            break L9;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  throw new ArrayIndexOutOfBoundsException(param2 - -param1 + -param0.length);
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
              if (param1 <= 0) {
                decompiledRegionSelector1 = 0;
                break L0;
              } else {
                throw new EOFException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) (var5_ref);
            stackOut_58_1 = new StringBuilder().append("p.C(");
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
              break L17;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L17;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (-1L < (param0 ^ -1L)) {
          throw new IOException();
        } else {
          L0: {
            this.field_k = param0;
            if (param1 == 0) {
              break L0;
            } else {
              this.field_b = -9L;
              break L0;
            }
          }
          return;
        }
    }

    p(sa param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_b = -1L;
        this.field_f = 0;
        this.field_d = -1L;
        try {
            this.field_h = param0;
            dupTemp$0 = param0.a(-1);
            this.field_a = dupTemp$0;
            this.field_i = dupTemp$0;
            this.field_l = new byte[param1];
            this.field_e = new byte[param2];
            this.field_k = 0L;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "p.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "The invitation has been withdrawn.";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ud {
    private long field_f;
    private byte[] field_k;
    private long field_b;
    private long field_i;
    private byte[] field_l;
    private long field_m;
    private int field_e;
    static String field_q;
    private bg field_g;
    static go[] field_h;
    private int field_c;
    static uf field_o;
    static volatile boolean field_n;
    static String field_j;
    private long field_p;
    private long field_a;
    static int field_d;

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        if (param0 != -1) {
          return;
        } else {
          L0: {
            this.field_e = 0;
            if ((this.field_m ^ -1L) != (this.field_b ^ -1L)) {
              this.field_g.a((byte) 102, this.field_m);
              this.field_b = this.field_m;
              break L0;
            } else {
              break L0;
            }
          }
          this.field_p = this.field_m;
          L1: while (true) {
            L2: {
              if (this.field_e >= this.field_k.length) {
                break L2;
              } else {
                L3: {
                  var2 = this.field_k.length - this.field_e;
                  if ((var2 ^ -1) < -200000001) {
                    var2 = 200000000;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = this.field_g.b(this.field_e, this.field_k, var2, 11812);
                if (0 != (var3 ^ -1)) {
                  this.field_e = this.field_e + var3;
                  this.field_b = this.field_b + (long)var3;
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int[] param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param3 == -85) {
                break L1;
              } else {
                var9 = (int[]) null;
                ud.a(78, -120, -127, (byte) -20, (int[]) null);
                break L1;
              }
            }
            L2: while (true) {
              param0--;
              if (-1 < (param0 ^ -1)) {
                break L0;
              } else {
                var10 = param4;
                var5 = var10;
                var6 = param1;
                var7 = param2;
                var10[var6] = var7 + pk.a(8355711, var10[var6] >> 531943681);
                param1++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5_ref);
            stackOut_6_1 = new StringBuilder().append("ud.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final void b(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = HoldTheLine.field_D;
          if (param0 == -1) {
            break L0;
          } else {
            this.field_i = -96L;
            break L0;
          }
        }
        L1: {
          if (0L != (this.field_a ^ -1L)) {
            L2: {
              if (this.field_a != this.field_b) {
                this.field_g.a((byte) 66, this.field_a);
                this.field_b = this.field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              this.field_g.a(this.field_c, this.field_l, 0, param0 ^ 17173);
              this.field_b = this.field_b + (long)this.field_c;
              if (this.field_i >= this.field_b) {
                break L3;
              } else {
                this.field_i = this.field_b;
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                var4 = -1L;
                if ((this.field_p ^ -1L) < (this.field_a ^ -1L)) {
                  break L5;
                } else {
                  if ((long)this.field_e + this.field_p > this.field_a) {
                    var2 = this.field_a;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if ((this.field_p ^ -1L) > (this.field_a ^ -1L)) {
                break L4;
              } else {
                if (this.field_p < this.field_a + (long)this.field_c) {
                  var2 = this.field_p;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                if (this.field_a - -(long)this.field_c <= this.field_p) {
                  break L7;
                } else {
                  if ((long)this.field_e + this.field_p < this.field_a + (long)this.field_c) {
                    break L7;
                  } else {
                    var4 = (long)this.field_c + this.field_a;
                    break L6;
                  }
                }
              }
              if (this.field_p + (long)this.field_e <= this.field_a) {
                break L6;
              } else {
                if ((this.field_p - -(long)this.field_e ^ -1L) < (this.field_a - -(long)this.field_c ^ -1L)) {
                  break L6;
                } else {
                  var4 = (long)this.field_e + this.field_p;
                  break L6;
                }
              }
            }
            L8: {
              if (var2 <= -1L) {
                break L8;
              } else {
                if (var2 >= var4) {
                  break L8;
                } else {
                  var6 = (int)(var4 + -var2);
                  bc.a(this.field_l, (int)(-this.field_a + var2), this.field_k, (int)(-this.field_p + var2), var6);
                  break L8;
                }
              }
            }
            this.field_c = 0;
            this.field_a = -1L;
            break L1;
          } else {
            break L1;
          }
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
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
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if ((long)param1 + this.field_m <= this.field_f) {
                    break L2;
                  } else {
                    this.field_f = (long)param1 + this.field_m;
                    break L2;
                  }
                }
                L3: {
                  if (-1L == this.field_a) {
                    break L3;
                  } else {
                    L4: {
                      if ((this.field_a ^ -1L) < (this.field_m ^ -1L)) {
                        break L4;
                      } else {
                        if ((this.field_m ^ -1L) < (this.field_a - -(long)this.field_c ^ -1L)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.b(-1);
                    break L3;
                  }
                }
                L5: {
                  if (this.field_a == -1L) {
                    break L5;
                  } else {
                    if ((long)param1 + this.field_m > this.field_a - -(long)this.field_l.length) {
                      var5_int = (int)(this.field_a - (this.field_m - (long)this.field_l.length));
                      bc.a(param3, param2, this.field_l, (int)(this.field_m + -this.field_a), var5_int);
                      param1 = param1 - var5_int;
                      this.field_m = this.field_m + (long)var5_int;
                      param2 = param2 + var5_int;
                      this.field_c = this.field_l.length;
                      this.b(-1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (param0 >= 124) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (this.field_l.length >= param1) {
                  if ((param1 ^ -1) >= -1) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L7: {
                      if (-1L == this.field_a) {
                        this.field_a = this.field_m;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      bc.a(param3, param2, this.field_l, (int)(-this.field_a + this.field_m), param1);
                      this.field_m = this.field_m + (long)param1;
                      if ((long)this.field_c < this.field_m - this.field_a) {
                        this.field_c = (int)(-this.field_a + this.field_m);
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
                    if ((this.field_m ^ -1L) == (this.field_b ^ -1L)) {
                      break L9;
                    } else {
                      this.field_g.a((byte) 84, this.field_m);
                      this.field_b = this.field_m;
                      break L9;
                    }
                  }
                  L10: {
                    this.field_g.a(param1, param3, param2, -17174);
                    this.field_b = this.field_b + (long)param1;
                    if ((this.field_b ^ -1L) >= (this.field_i ^ -1L)) {
                      break L10;
                    } else {
                      this.field_i = this.field_b;
                      break L10;
                    }
                  }
                  L11: {
                    L12: {
                      var5_long = -1L;
                      var7 = -1L;
                      if ((this.field_p ^ -1L) < (this.field_m ^ -1L)) {
                        break L12;
                      } else {
                        if ((long)this.field_e + this.field_p > this.field_m) {
                          var5_long = this.field_m;
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if ((this.field_p ^ -1L) > (this.field_m ^ -1L)) {
                      break L11;
                    } else {
                      if ((long)param1 + this.field_m <= this.field_p) {
                        break L11;
                      } else {
                        var5_long = this.field_p;
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if ((this.field_m - -(long)param1 ^ -1L) >= (this.field_p ^ -1L)) {
                        break L14;
                      } else {
                        if (this.field_p - -(long)this.field_e >= this.field_m + (long)param1) {
                          var7 = this.field_m - -(long)param1;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if ((this.field_m ^ -1L) <= (this.field_p - -(long)this.field_e ^ -1L)) {
                      break L13;
                    } else {
                      if (this.field_p + (long)this.field_e > (long)param1 + this.field_m) {
                        break L13;
                      } else {
                        var7 = (long)this.field_e + this.field_p;
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if ((var5_long ^ -1L) >= 0L) {
                      break L15;
                    } else {
                      if ((var5_long ^ -1L) > (var7 ^ -1L)) {
                        var9 = (int)(var7 + -var5_long);
                        bc.a(param3, (int)((long)param2 + (var5_long - this.field_m)), this.field_k, (int)(var5_long - this.field_p), var9);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  this.field_m = this.field_m + (long)param1;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_b = -1L;
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
            stackOut_50_1 = new StringBuilder().append("ud.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param3 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
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

    final long c(int param0) {
        if (param0 != -32261) {
            field_n = false;
        }
        return this.field_f;
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
            this.a(-1, param1, param0.length, param0);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ud.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void d(int param0) throws IOException {
        this.b(param0);
        this.field_g.a((byte) 20);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var14 = HoldTheLine.field_D;
        try {
          L0: {
            try {
              L1: {
                if (param1 - -param2 > param3.length) {
                  throw new ArrayIndexOutOfBoundsException(-param3.length + (param1 + param2));
                } else {
                  L2: {
                    if (this.field_a == (long)param0) {
                      break L2;
                    } else {
                      if ((this.field_a ^ -1L) < (this.field_m ^ -1L)) {
                        break L2;
                      } else {
                        if (((long)this.field_c + this.field_a ^ -1L) <= ((long)param2 + this.field_m ^ -1L)) {
                          bc.a(this.field_l, (int)(-this.field_a + this.field_m), param3, param1, param2);
                          this.field_m = this.field_m + (long)param2;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_long = this.field_m;
                    var7 = param1;
                    var8 = param2;
                    if ((this.field_m ^ -1L) > (this.field_p ^ -1L)) {
                      break L3;
                    } else {
                      if (this.field_p - -(long)this.field_e > this.field_m) {
                        L4: {
                          var9_int = (int)((long)this.field_e + (this.field_p + -this.field_m));
                          if (var9_int > param2) {
                            var9_int = param2;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        bc.a(this.field_k, (int)(this.field_m + -this.field_p), param3, param1, var9_int);
                        this.field_m = this.field_m + (long)var9_int;
                        param1 = param1 + var9_int;
                        param2 = param2 - var9_int;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (this.field_k.length < param2) {
                      this.field_g.a((byte) 47, this.field_m);
                      this.field_b = this.field_m;
                      L6: while (true) {
                        if (param2 <= 0) {
                          break L5;
                        } else {
                          var9_int = this.field_g.b(param1, param3, param2, 11812);
                          if (-1 != var9_int) {
                            param1 = param1 + var9_int;
                            this.field_m = this.field_m + (long)var9_int;
                            this.field_b = this.field_b + (long)var9_int;
                            param2 = param2 - var9_int;
                            continue L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                    } else {
                      if (-1 <= (param2 ^ -1)) {
                        break L5;
                      } else {
                        L7: {
                          this.a(-1);
                          var9_int = param2;
                          if (var9_int <= this.field_e) {
                            break L7;
                          } else {
                            var9_int = this.field_e;
                            break L7;
                          }
                        }
                        bc.a(this.field_k, 0, param3, param1, var9_int);
                        param1 = param1 + var9_int;
                        param2 = param2 - var9_int;
                        this.field_m = this.field_m + (long)var9_int;
                        break L5;
                      }
                    }
                  }
                  L8: {
                    if ((this.field_a ^ -1L) != 0L) {
                      L9: {
                        if ((this.field_m ^ -1L) <= (this.field_a ^ -1L)) {
                          break L9;
                        } else {
                          if (0 < param2) {
                            L10: {
                              var9_int = param1 - -(int)(this.field_a - this.field_m);
                              if (var9_int <= param2 + param1) {
                                break L10;
                              } else {
                                var9_int = param2 + param1;
                                break L10;
                              }
                            }
                            L11: while (true) {
                              if (var9_int <= param1) {
                                break L9;
                              } else {
                                incrementValue$1 = param1;
                                param1++;
                                param3[incrementValue$1] = (byte) 0;
                                param2--;
                                this.field_m = this.field_m + 1L;
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
                          if ((var5_long ^ -1L) < (this.field_a ^ -1L)) {
                            break L13;
                          } else {
                            if (var5_long - -(long)var8 > this.field_a) {
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
                          if (this.field_a + (long)this.field_c <= var5_long) {
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
                          if (((long)this.field_c + this.field_a ^ -1L) >= (var5_long ^ -1L)) {
                            break L15;
                          } else {
                            if (((long)var8 + var5_long ^ -1L) > (this.field_a - -(long)this.field_c ^ -1L)) {
                              break L15;
                            } else {
                              var11 = this.field_a + (long)this.field_c;
                              break L14;
                            }
                          }
                        }
                        if ((this.field_a ^ -1L) <= (var5_long - -(long)var8 ^ -1L)) {
                          break L14;
                        } else {
                          if (this.field_a - -(long)this.field_c >= var5_long + (long)var8) {
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
                        if (var11 > var9) {
                          var13 = (int)(-var9 + var11);
                          bc.a(this.field_l, (int)(var9 + -this.field_a), param3, var7 + (int)(-var5_long + var9), var13);
                          if (this.field_m < var11) {
                            param2 = (int)((long)param2 - (-this.field_m + var11));
                            this.field_m = var11;
                            break L8;
                          } else {
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_b = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if ((param2 ^ -1) >= -1) {
                decompiledRegionSelector1 = 0;
                break L0;
              } else {
                throw new EOFException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) (var5_ref);
            stackOut_61_1 = new StringBuilder().append("ud.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param3 == null) {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L16;
            } else {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L16;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        } else {
          L0: {
            if (param0 == 25971) {
              break L0;
            } else {
              break L0;
            }
          }
          this.field_m = param1;
          return;
        }
    }

    public static void a(byte param0) {
        field_o = null;
        if (param0 != 121) {
            field_j = (String) null;
        }
        field_h = null;
        field_q = null;
        field_j = null;
    }

    ud(bg param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_c = 0;
        this.field_p = -1L;
        this.field_a = -1L;
        try {
            this.field_g = param0;
            dupTemp$0 = param0.a(false);
            this.field_i = dupTemp$0;
            this.field_f = dupTemp$0;
            this.field_l = new byte[param2];
            this.field_m = 0L;
            this.field_k = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_q = "Visit the Account Management section on the main site to view.";
        field_n = false;
        field_j = "That name is not available";
        field_d = 1;
    }
}

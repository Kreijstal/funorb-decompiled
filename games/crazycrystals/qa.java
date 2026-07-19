/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qa {
    private byte[] field_a;
    private byte[] field_b;
    static int[] field_i;
    private gl field_m;
    private long field_n;
    private int field_e;
    private long field_c;
    private long field_g;
    static String field_h;
    private long field_d;
    private long field_k;
    private long field_l;
    private int field_f;
    static boolean field_j;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
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
        var14 = CrazyCrystals.field_B;
        try {
          L0: {
            try {
              L1: {
                if (param1.length >= param3 + param2) {
                  L2: {
                    if (0L == (this.field_n ^ -1L)) {
                      break L2;
                    } else {
                      if ((this.field_g ^ -1L) > (this.field_n ^ -1L)) {
                        break L2;
                      } else {
                        if ((long)this.field_e + this.field_n >= this.field_g + (long)param3) {
                          eg.a(this.field_a, (int)(-this.field_n + this.field_g), param1, param2, param3);
                          this.field_g = this.field_g + (long)param3;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_long = this.field_g;
                    var7 = param2;
                    var8 = param3;
                    if ((this.field_g ^ -1L) > (this.field_k ^ -1L)) {
                      break L3;
                    } else {
                      if ((this.field_g ^ -1L) <= (this.field_k - -(long)this.field_f ^ -1L)) {
                        break L3;
                      } else {
                        L4: {
                          var9_int = (int)((long)this.field_f - -this.field_k - this.field_g);
                          if (param3 < var9_int) {
                            var9_int = param3;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        eg.a(this.field_b, (int)(-this.field_k + this.field_g), param1, param2, var9_int);
                        param2 = param2 + var9_int;
                        this.field_g = this.field_g + (long)var9_int;
                        param3 = param3 - var9_int;
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (this.field_b.length >= param3) {
                      if (param3 <= 0) {
                        break L5;
                      } else {
                        L6: {
                          this.c(-1);
                          var9_int = param3;
                          if (this.field_f < var9_int) {
                            var9_int = this.field_f;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        eg.a(this.field_b, 0, param1, param2, var9_int);
                        this.field_g = this.field_g + (long)var9_int;
                        param3 = param3 - var9_int;
                        param2 = param2 + var9_int;
                        break L5;
                      }
                    } else {
                      this.field_m.a(this.field_g, param0 + -224);
                      this.field_l = this.field_g;
                      L7: while (true) {
                        if ((param3 ^ -1) >= -1) {
                          break L5;
                        } else {
                          var9_int = this.field_m.a(param1, param2, param3, (byte) -68);
                          if (var9_int != -1) {
                            param3 = param3 - var9_int;
                            this.field_l = this.field_l + (long)var9_int;
                            param2 = param2 + var9_int;
                            this.field_g = this.field_g + (long)var9_int;
                            continue L7;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  L8: {
                    if (-1L != this.field_n) {
                      L9: {
                        if (this.field_g >= this.field_n) {
                          break L9;
                        } else {
                          if (param3 > 0) {
                            L10: {
                              var9_int = (int)(this.field_n + -this.field_g) + param2;
                              if (param3 + param2 >= var9_int) {
                                break L10;
                              } else {
                                var9_int = param2 + param3;
                                break L10;
                              }
                            }
                            L11: while (true) {
                              if (var9_int <= param2) {
                                break L9;
                              } else {
                                incrementValue$1 = param2;
                                param2++;
                                param1[incrementValue$1] = (byte) 0;
                                param3--;
                                this.field_g = this.field_g + 1L;
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
                          if ((this.field_n ^ -1L) > (var5_long ^ -1L)) {
                            break L13;
                          } else {
                            if (this.field_n < (long)var8 + var5_long) {
                              var9 = this.field_n;
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if ((this.field_n ^ -1L) < (var5_long ^ -1L)) {
                          break L12;
                        } else {
                          if (var5_long >= this.field_n + (long)this.field_e) {
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
                          if ((var5_long ^ -1L) <= ((long)this.field_e + this.field_n ^ -1L)) {
                            break L15;
                          } else {
                            if (((long)this.field_e + this.field_n ^ -1L) < (var5_long - -(long)var8 ^ -1L)) {
                              break L15;
                            } else {
                              var11 = this.field_n - -(long)this.field_e;
                              break L14;
                            }
                          }
                        }
                        if (this.field_n >= var5_long + (long)var8) {
                          break L14;
                        } else {
                          if ((long)this.field_e + this.field_n >= var5_long + (long)var8) {
                            var11 = var5_long - -(long)var8;
                            break L14;
                          } else {
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
                          var13 = (int)(var11 + -var9);
                          eg.a(this.field_a, (int)(-this.field_n + var9), param1, var7 + (int)(var9 + -var5_long), var13);
                          if (this.field_g >= var11) {
                            break L8;
                          } else {
                            param3 = (int)((long)param3 - (var11 - this.field_g));
                            this.field_g = var11;
                            break L8;
                          }
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                  L16: {
                    if (param0 == 106) {
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  throw new ArrayIndexOutOfBoundsException(-param1.length + param3 + param2);
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_l = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if (-1 > (param3 ^ -1)) {
                throw new EOFException();
              } else {
                decompiledRegionSelector1 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) (var5_ref);
            stackOut_61_1 = new StringBuilder().append("qa.F(").append(param0).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param1 == null) {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L17;
            } else {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L17;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        if (param0 <= 80) {
          return;
        } else {
          L0: {
            if ((this.field_n ^ -1L) == 0L) {
              break L0;
            } else {
              L1: {
                if (this.field_l != this.field_n) {
                  this.field_m.a(this.field_n, -88);
                  this.field_l = this.field_n;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                this.field_m.a(120, 0, this.field_e, this.field_a);
                this.field_l = this.field_l + (long)this.field_e;
                if ((this.field_l ^ -1L) >= (this.field_c ^ -1L)) {
                  break L2;
                } else {
                  this.field_c = this.field_l;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  if (this.field_k > this.field_n) {
                    break L4;
                  } else {
                    if (this.field_n < this.field_k - -(long)this.field_f) {
                      var2 = this.field_n;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (this.field_k < this.field_n) {
                  break L3;
                } else {
                  if ((this.field_k ^ -1L) > (this.field_n + (long)this.field_e ^ -1L)) {
                    var2 = this.field_k;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  var4 = -1L;
                  if (this.field_n + (long)this.field_e <= this.field_k) {
                    break L6;
                  } else {
                    if (this.field_k + (long)this.field_f >= this.field_n + (long)this.field_e) {
                      var4 = this.field_n - -(long)this.field_e;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (this.field_k - -(long)this.field_f <= this.field_n) {
                  break L5;
                } else {
                  if (this.field_k - -(long)this.field_f > this.field_n - -(long)this.field_e) {
                    break L5;
                  } else {
                    var4 = this.field_k + (long)this.field_f;
                    break L5;
                  }
                }
              }
              L7: {
                if ((var2 ^ -1L) >= 0L) {
                  break L7;
                } else {
                  if (var2 >= var4) {
                    break L7;
                  } else {
                    var6 = (int)(var4 - var2);
                    eg.a(this.field_a, (int)(var2 - this.field_n), this.field_b, (int)(var2 + -this.field_k), var6);
                    break L7;
                  }
                }
              }
              this.field_n = -1L;
              this.field_e = 0;
              break L0;
            }
          }
          return;
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        if (param1 > -69) {
            return;
        }
        try {
            this.a((byte) 106, param0, 0, param0.length);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "qa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (0L > param0) {
            throw new IOException();
        }
        if (param1 != -1) {
            return;
        }
        this.field_g = param0;
    }

    private final void c(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = CrazyCrystals.field_B;
          this.field_f = 0;
          if (this.field_g != this.field_l) {
            this.field_m.a(this.field_g, param0 + -89);
            this.field_l = this.field_g;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -1) {
          return;
        } else {
          this.field_k = this.field_g;
          L1: while (true) {
            L2: {
              if (this.field_f >= this.field_b.length) {
                break L2;
              } else {
                L3: {
                  var2 = -this.field_f + this.field_b.length;
                  if (-200000001 <= (var2 ^ -1)) {
                    break L3;
                  } else {
                    var2 = 200000000;
                    break L3;
                  }
                }
                var3 = this.field_m.a(this.field_b, this.field_f, var2, (byte) -63);
                if ((var3 ^ -1) != 0) {
                  this.field_f = this.field_f + var3;
                  this.field_l = this.field_l + (long)var3;
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

    final void d(int param0) throws IOException {
        if (param0 != -200000001) {
            return;
        }
        this.a((byte) 88);
        this.field_m.d(91);
    }

    final long b(int param0) {
        if (param0 != 0) {
            this.field_d = 73L;
        }
        return this.field_d;
    }

    final static dp a(byte param0, int param1) {
        dp var2 = new dp();
        if (param0 != 121) {
            field_h = (String) null;
        }
        pm.field_c.b(0, var2);
        eq.b(param0 ^ 123, param1);
        return var2;
    }

    qa(gl param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_n = -1L;
        this.field_e = 0;
        this.field_k = -1L;
        try {
            this.field_m = param0;
            dupTemp$0 = param0.a(48);
            this.field_c = dupTemp$0;
            this.field_d = dupTemp$0;
            this.field_a = new byte[param2];
            this.field_b = new byte[param1];
            this.field_g = 0L;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if ((this.field_g - -(long)param3 ^ -1L) < (this.field_d ^ -1L)) {
                    this.field_d = this.field_g - -(long)param3;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (this.field_n == -1L) {
                    break L3;
                  } else {
                    L4: {
                      if ((this.field_n ^ -1L) < (this.field_g ^ -1L)) {
                        break L4;
                      } else {
                        if (this.field_g > (long)this.field_e + this.field_n) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.a((byte) 103);
                    break L3;
                  }
                }
                L5: {
                  if ((this.field_n ^ -1L) == 0L) {
                    break L5;
                  } else {
                    if ((this.field_g - -(long)param3 ^ -1L) < (this.field_n + (long)this.field_a.length ^ -1L)) {
                      var5_int = (int)(-this.field_g + this.field_n + (long)this.field_a.length);
                      eg.a(param1, param2, this.field_a, (int)(this.field_g - this.field_n), var5_int);
                      this.field_g = this.field_g + (long)var5_int;
                      param3 = param3 - var5_int;
                      param2 = param2 + var5_int;
                      this.field_e = this.field_a.length;
                      this.a((byte) 95);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                var5_int = 7 / ((82 - param0) / 36);
                if (param3 <= this.field_a.length) {
                  if (0 >= param3) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L6: {
                      if (this.field_n == -1L) {
                        this.field_n = this.field_g;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      eg.a(param1, param2, this.field_a, (int)(-this.field_n + this.field_g), param3);
                      this.field_g = this.field_g + (long)param3;
                      if (((long)this.field_e ^ -1L) <= (-this.field_n + this.field_g ^ -1L)) {
                        break L7;
                      } else {
                        this.field_e = (int)(-this.field_n + this.field_g);
                        break L7;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                } else {
                  L8: {
                    if ((this.field_l ^ -1L) != (this.field_g ^ -1L)) {
                      this.field_m.a(this.field_g, -99);
                      this.field_l = this.field_g;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    this.field_m.a(120, param2, param3, param1);
                    this.field_l = this.field_l + (long)param3;
                    if (this.field_l > this.field_c) {
                      this.field_c = this.field_l;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    L11: {
                      var6 = -1L;
                      var8 = -1L;
                      if ((this.field_g ^ -1L) > (this.field_k ^ -1L)) {
                        break L11;
                      } else {
                        if (((long)this.field_f + this.field_k ^ -1L) < (this.field_g ^ -1L)) {
                          var6 = this.field_g;
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if ((this.field_k ^ -1L) > (this.field_g ^ -1L)) {
                      break L10;
                    } else {
                      if (this.field_k < (long)param3 + this.field_g) {
                        var6 = this.field_k;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L12: {
                    L13: {
                      if ((this.field_g - -(long)param3 ^ -1L) >= (this.field_k ^ -1L)) {
                        break L13;
                      } else {
                        if (this.field_g + (long)param3 <= (long)this.field_f + this.field_k) {
                          var8 = (long)param3 + this.field_g;
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (this.field_k - -(long)this.field_f <= this.field_g) {
                      break L12;
                    } else {
                      if (this.field_k + (long)this.field_f > (long)param3 + this.field_g) {
                        break L12;
                      } else {
                        var8 = this.field_k + (long)this.field_f;
                        break L12;
                      }
                    }
                  }
                  L14: {
                    if (var6 <= -1L) {
                      break L14;
                    } else {
                      if ((var8 ^ -1L) < (var6 ^ -1L)) {
                        var10 = (int)(var8 + -var6);
                        eg.a(param1, (int)(-this.field_g + ((long)param2 + var6)), this.field_b, (int)(-this.field_k + var6), var10);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  this.field_g = this.field_g + (long)param3;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_l = -1L;
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
            stackOut_51_0 = (RuntimeException) (var5_ref);
            stackOut_51_1 = new StringBuilder().append("qa.C(").append(param0).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L15;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L15;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param2 + ',' + param3 + ')');
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

    public static void a(int param0) {
        dp discarded$0 = null;
        field_h = null;
        field_i = null;
        if (param0 != -6142) {
            discarded$0 = qa.a((byte) -3, -85);
        }
    }

    static {
        field_i = new int[8192];
        field_h = "You can make him move using the keys indicated above.";
    }
}

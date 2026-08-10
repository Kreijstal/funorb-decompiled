/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ch {
    private pl field_b;
    private long field_n;
    private long field_h;
    private int field_m;
    private long field_a;
    private int field_l;
    private long field_e;
    private long field_g;
    private byte[] field_k;
    private long field_f;
    static java.awt.Color field_i;
    private byte[] field_c;
    static ad field_j;
    static lk field_d;

    final void a(int param0, byte[] param1) throws IOException {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.a(param1, param1.length, 0, (byte) 117);
              if (param0 == 3805) {
                break L1;
              } else {
                this.field_k = (byte[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3);

            stackIn_5_1 = new StringBuilder().append("ch.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            em.field_B = 480;
            fg.field_b = 0;
            L1: while (true) {
              if ((mb.field_e.b(127) ^ -1) >= -1) {
                L2: {
                  if (param0 <= -106) {
                    break L2;
                  } else {
                    field_j = (ad) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                mb.field_e.d(4011);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "ch.K(" + param0 + ')');
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (this.field_h - -(long)param3 > this.field_n) {
                    this.field_n = (long)param3 + this.field_h;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if ((this.field_a ^ -1L) == 0L) {
                    break L3;
                  } else {
                    if (this.field_h >= this.field_a) {
                      if ((long)this.field_l + this.field_a >= this.field_h) {
                        break L3;
                      } else {
                        this.b((byte) -109);
                        break L3;
                      }
                    } else {
                      this.b((byte) -109);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (0L == (this.field_a ^ -1L)) {
                    break L4;
                  } else {
                    if (this.field_a + (long)this.field_c.length < (long)param3 + this.field_h) {
                      var5_int = (int)(-this.field_h - (-this.field_a - (long)this.field_c.length));
                      gl.a(param0, param1, this.field_c, (int)(this.field_h + -this.field_a), var5_int);
                      this.field_h = this.field_h + (long)var5_int;
                      param1 = param1 + var5_int;
                      param3 = param3 - var5_int;
                      this.field_l = this.field_c.length;
                      this.b((byte) -109);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (this.field_c.length >= param3) {
                  if (param2 >= 31) {
                    if ((param3 ^ -1) >= -1) {
                      decompiledRegionSelector0 = 2;
                      break L1;
                    } else {
                      L5: {
                        if ((this.field_a ^ -1L) != 0L) {
                          break L5;
                        } else {
                          this.field_a = this.field_h;
                          break L5;
                        }
                      }
                      L6: {
                        gl.a(param0, param1, this.field_c, (int)(this.field_h - this.field_a), param3);
                        this.field_h = this.field_h + (long)param3;
                        if ((long)this.field_l < -this.field_a + this.field_h) {
                          this.field_l = (int)(this.field_h - this.field_a);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L1;
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                } else {
                  L7: {
                    if ((this.field_h ^ -1L) == (this.field_g ^ -1L)) {
                      break L7;
                    } else {
                      this.field_b.a(0, this.field_h);
                      this.field_g = this.field_h;
                      break L7;
                    }
                  }
                  L8: {
                    this.field_b.a(param1, (byte) 68, param0, param3);
                    this.field_g = this.field_g + (long)param3;
                    if ((this.field_f ^ -1L) <= (this.field_g ^ -1L)) {
                      break L8;
                    } else {
                      this.field_f = this.field_g;
                      break L8;
                    }
                  }
                  L9: {
                    L10: {
                      var5_long = -1L;
                      var7 = -1L;
                      if (this.field_h < this.field_e) {
                        break L10;
                      } else {
                        if ((this.field_h ^ -1L) > (this.field_e + (long)this.field_m ^ -1L)) {
                          var5_long = this.field_h;
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if ((this.field_h ^ -1L) < (this.field_e ^ -1L)) {
                      break L9;
                    } else {
                      if (((long)param3 + this.field_h ^ -1L) < (this.field_e ^ -1L)) {
                        var5_long = this.field_e;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if ((this.field_h - -(long)param3 ^ -1L) >= (this.field_e ^ -1L)) {
                        break L12;
                      } else {
                        if ((this.field_h - -(long)param3 ^ -1L) >= ((long)this.field_m + this.field_e ^ -1L)) {
                          var7 = this.field_h + (long)param3;
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if ((long)this.field_m + this.field_e <= this.field_h) {
                      break L11;
                    } else {
                      if ((this.field_e + (long)this.field_m ^ -1L) >= (this.field_h + (long)param3 ^ -1L)) {
                        var7 = (long)this.field_m + this.field_e;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    if (0L <= (var5_long ^ -1L)) {
                      break L13;
                    } else {
                      if (var7 > var5_long) {
                        var9 = (int)(-var5_long + var7);
                        gl.a(param0, (int)(-this.field_h + (var5_long + (long)param1)), this.field_k, (int)(-this.field_e + var5_long), var9);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  this.field_h = this.field_h + (long)param3;
                  decompiledRegionSelector0 = 0;
                  break L1;
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
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var5_ref);

            stackIn_55_1 = new StringBuilder().append("ch.C(");

            if (param0 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L14;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L14;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = -9 % ((param0 - 10) / 63);
        field_d = null;
        field_j = null;
    }

    final long c(byte param0) {
        if (param0 > -66) {
            return -86L;
        }
        return this.field_n;
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 > 18) {
              try {
                L1: {
                  if (param0.length >= param1 + param2) {
                    L2: {
                      if (this.field_a == -1L) {
                        break L2;
                      } else {
                        if (this.field_h < this.field_a) {
                          break L2;
                        } else {
                          if ((this.field_h - -(long)param1 ^ -1L) >= ((long)this.field_l + this.field_a ^ -1L)) {
                            gl.a(this.field_c, (int)(-this.field_a + this.field_h), param0, param2, param1);
                            this.field_h = this.field_h + (long)param1;
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
                      var7 = param2;
                      var8 = param1;
                      if (this.field_h < this.field_e) {
                        break L3;
                      } else {
                        if (((long)this.field_m + this.field_e ^ -1L) < (this.field_h ^ -1L)) {
                          L4: {
                            var9_int = (int)((long)this.field_m - this.field_h - -this.field_e);
                            if (param1 >= var9_int) {
                              break L4;
                            } else {
                              var9_int = param1;
                              break L4;
                            }
                          }
                          gl.a(this.field_k, (int)(this.field_h + -this.field_e), param0, param2, var9_int);
                          param1 = param1 - var9_int;
                          param2 = param2 + var9_int;
                          this.field_h = this.field_h + (long)var9_int;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (param1 <= this.field_k.length) {
                        if (-1 > (param1 ^ -1)) {
                          L6: {
                            this.a(-119);
                            var9_int = param1;
                            if (this.field_m >= var9_int) {
                              break L6;
                            } else {
                              var9_int = this.field_m;
                              break L6;
                            }
                          }
                          gl.a(this.field_k, 0, param0, param2, var9_int);
                          param1 = param1 - var9_int;
                          this.field_h = this.field_h + (long)var9_int;
                          param2 = param2 + var9_int;
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        this.field_b.a(0, this.field_h);
                        this.field_g = this.field_h;
                        L7: while (true) {
                          if (param1 <= 0) {
                            break L5;
                          } else {
                            var9_int = this.field_b.a(param2, param0, (byte) -128, param1);
                            if (0 == (var9_int ^ -1)) {
                              break L5;
                            } else {
                              param2 = param2 + var9_int;
                              this.field_g = this.field_g + (long)var9_int;
                              param1 = param1 - var9_int;
                              this.field_h = this.field_h + (long)var9_int;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      if ((this.field_a ^ -1L) != 0L) {
                        L9: {
                          if ((this.field_h ^ -1L) <= (this.field_a ^ -1L)) {
                            break L9;
                          } else {
                            if ((param1 ^ -1) < -1) {
                              L10: {
                                var9_int = (int)(-this.field_h + this.field_a) + param2;
                                if (var9_int <= param2 + param1) {
                                  break L10;
                                } else {
                                  var9_int = param1 + param2;
                                  break L10;
                                }
                              }
                              L11: while (true) {
                                if (param2 >= var9_int) {
                                  break L9;
                                } else {
                                  param1--;
                                  incrementValue$0 = param2;
                                  param2++;
                                  param0[incrementValue$0] = (byte) 0;
                                  this.field_h = this.field_h + 1L;
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
                            if ((this.field_a ^ -1L) > (var5_long ^ -1L)) {
                              break L13;
                            } else {
                              if ((this.field_a ^ -1L) <= (var5_long - -(long)var8 ^ -1L)) {
                                break L13;
                              } else {
                                var9 = this.field_a;
                                break L12;
                              }
                            }
                          }
                          if (this.field_a > var5_long) {
                            break L12;
                          } else {
                            if ((this.field_a - -(long)this.field_l ^ -1L) >= (var5_long ^ -1L)) {
                              break L12;
                            } else {
                              var9 = var5_long;
                              break L12;
                            }
                          }
                        }
                        L14: {
                          L15: {
                            if ((this.field_a - -(long)this.field_l ^ -1L) >= (var5_long ^ -1L)) {
                              break L15;
                            } else {
                              if (((long)var8 + var5_long ^ -1L) <= ((long)this.field_l + this.field_a ^ -1L)) {
                                var11 = this.field_a - -(long)this.field_l;
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          if ((var5_long + (long)var8 ^ -1L) >= (this.field_a ^ -1L)) {
                            break L14;
                          } else {
                            if (this.field_a - -(long)this.field_l < var5_long - -(long)var8) {
                              break L14;
                            } else {
                              var11 = var5_long + (long)var8;
                              break L14;
                            }
                          }
                        }
                        if (-1L >= var9) {
                          break L8;
                        } else {
                          if ((var9 ^ -1L) <= (var11 ^ -1L)) {
                            break L8;
                          } else {
                            var13 = (int)(var11 - var9);
                            gl.a(this.field_c, (int)(var9 - this.field_a), param0, var7 - -(int)(-var5_long + var9), var13);
                            if ((this.field_h ^ -1L) > (var11 ^ -1L)) {
                              param1 = (int)((long)param1 - (-this.field_h + var11));
                              this.field_h = var11;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    throw new ArrayIndexOutOfBoundsException(-param0.length + (param2 + param1));
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5 = (IOException) (Object) decompiledCaughtException;
                this.field_g = -1L;
                throw var5;
              }
              if (decompiledRegionSelector0 == 0) {
                decompiledRegionSelector1 = 2;
                break L0;
              } else {
                if (0 < param1) {
                  throw new EOFException();
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_62_0 = (RuntimeException) (var5_ref);

            stackIn_62_1 = new StringBuilder().append("ch.H(");

            if (param0 == null) {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L16;
            } else {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L16;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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

    private final void a(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        this.field_m = 0;
        if (param0 > -111) {
          return;
        } else {
          L0: {
            if (this.field_h != this.field_g) {
              this.field_b.a(0, this.field_h);
              this.field_g = this.field_h;
              break L0;
            } else {
              break L0;
            }
          }
          this.field_e = this.field_h;
          L1: while (true) {
            L2: {
              if (this.field_k.length <= this.field_m) {
                break L2;
              } else {
                L3: {
                  var2 = this.field_k.length + -this.field_m;
                  if (var2 <= 200000000) {
                    break L3;
                  } else {
                    var2 = 200000000;
                    break L3;
                  }
                }
                var3 = this.field_b.a(this.field_m, this.field_k, (byte) -126, var2);
                if (var3 != -1) {
                  this.field_m = this.field_m + var3;
                  this.field_g = this.field_g + (long)var3;
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

    private final void b(byte param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        String var8;
        L0: {
          var7 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == -109) {
            break L0;
          } else {
            var8 = (String) null;
            ch.a((String) null, 104);
            break L0;
          }
        }
        L1: {
          if (this.field_a != -1L) {
            L2: {
              if (this.field_g != this.field_a) {
                this.field_b.a(0, this.field_a);
                this.field_g = this.field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              this.field_b.a(0, (byte) 68, this.field_c, this.field_l);
              this.field_g = this.field_g + (long)this.field_l;
              if (this.field_f >= this.field_g) {
                break L3;
              } else {
                this.field_f = this.field_g;
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                var4 = -1L;
                if (this.field_a < this.field_e) {
                  break L5;
                } else {
                  if ((this.field_e - -(long)this.field_m ^ -1L) < (this.field_a ^ -1L)) {
                    var2 = this.field_a;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              if ((this.field_e ^ -1L) > (this.field_a ^ -1L)) {
                break L4;
              } else {
                if (this.field_e >= (long)this.field_l + this.field_a) {
                  break L4;
                } else {
                  var2 = this.field_e;
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                if ((this.field_a - -(long)this.field_l ^ -1L) >= (this.field_e ^ -1L)) {
                  break L7;
                } else {
                  if ((this.field_e - -(long)this.field_m ^ -1L) <= (this.field_a + (long)this.field_l ^ -1L)) {
                    var4 = (long)this.field_l + this.field_a;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if ((this.field_a ^ -1L) <= ((long)this.field_m + this.field_e ^ -1L)) {
                break L6;
              } else {
                if ((this.field_e - -(long)this.field_m ^ -1L) >= ((long)this.field_l + this.field_a ^ -1L)) {
                  var4 = this.field_e - -(long)this.field_m;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if ((var2 ^ -1L) >= 0L) {
                break L8;
              } else {
                if (var2 < var4) {
                  var6 = (int)(var4 + -var2);
                  gl.a(this.field_c, (int)(var2 - this.field_a), this.field_k, (int)(-this.field_e + var2), var6);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            this.field_a = -1L;
            this.field_l = 0;
            break L1;
          } else {
            break L1;
          }
        }
    }

    ch(pl param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_e = -1L;
        this.field_l = 0;
        this.field_a = -1L;
        try {
            this.field_b = param0;
            dupTemp$0 = param0.c((byte) 124);
            this.field_f = dupTemp$0;
            this.field_n = dupTemp$0;
            this.field_h = 0L;
            this.field_k = new byte[param1];
            this.field_c = new byte[param2];
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ch.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, long param1) throws IOException {
        if (!(-1L >= (param1 ^ -1L))) {
            throw new IOException();
        }
        this.field_h = param1;
        if (param0 < 82) {
            ch.b(-87);
        }
    }

    final static rb a(String param0, int param1) {
        String var2 = null;
        rb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        rb stackIn_10_0 = null;
        rb stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (null != pj.field_a) {
              if (param0 != null) {
                if (param0.length() != 0) {
                  var6 = (CharSequence) ((Object) param0);
                  var2 = pl.a((byte) 109, var6);
                  if (param1 == -1) {
                    if (var2 != null) {
                      var3 = (rb) ((Object) pj.field_a.a((long)var2.hashCode(), false));
                      L1: while (true) {
                        if (var3 != null) {
                          var7 = (CharSequence) ((Object) var3.field_db);
                          var4 = pl.a((byte) 126, var7);
                          if (var4.equals(var2)) {
                            stackIn_20_0 = (rb) (var3);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var3 = (rb) ((Object) pj.field_a.b(-34));
                            continue L1;
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    stackIn_10_0 = (rb) null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackIn_7_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2_ref);

            stackIn_25_1 = new StringBuilder().append("ch.I(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L2;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (rb) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_20_0;
          }
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
            return;
        }
        this.b((byte) -109);
        this.field_b.a(19808);
    }

    static {
        field_i = new java.awt.Color(10040319);
    }
}

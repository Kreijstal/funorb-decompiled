/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class k {
    private long field_k;
    private byte[] field_f;
    private long field_g;
    private int field_h;
    static int[] field_l;
    static bi[] field_c;
    private long field_n;
    private rl field_m;
    private byte[] field_b;
    private int field_i;
    private long field_j;
    static int field_a;
    private long field_d;
    static String field_e;
    private long field_o;

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
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
        var14 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (param0.length >= param2 + param1) {
                  L2: {
                    if (param3 == 6520) {
                      break L2;
                    } else {
                      this.field_n = -84L;
                      break L2;
                    }
                  }
                  L3: {
                    if (this.field_j == -1L) {
                      break L3;
                    } else {
                      if (this.field_d < this.field_j) {
                        break L3;
                      } else {
                        if ((long)this.field_h + this.field_j >= (long)param2 + this.field_d) {
                          dm.a(this.field_b, (int)(-this.field_j + this.field_d), param0, param1, param2);
                          this.field_d = this.field_d + (long)param2;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var5_long = this.field_d;
                    var7 = param1;
                    var8 = param2;
                    if ((this.field_d ^ -1L) > (this.field_g ^ -1L)) {
                      break L4;
                    } else {
                      if (((long)this.field_i + this.field_g ^ -1L) >= (this.field_d ^ -1L)) {
                        break L4;
                      } else {
                        L5: {
                          var9_int = (int)((long)this.field_i - (-this.field_g + this.field_d));
                          if (param2 >= var9_int) {
                            break L5;
                          } else {
                            var9_int = param2;
                            break L5;
                          }
                        }
                        dm.a(this.field_f, (int)(-this.field_g + this.field_d), param0, param1, var9_int);
                        param2 = param2 - var9_int;
                        param1 = param1 + var9_int;
                        this.field_d = this.field_d + (long)var9_int;
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (param2 > this.field_f.length) {
                      this.field_m.a(this.field_d, (byte) -127);
                      this.field_k = this.field_d;
                      L7: while (true) {
                        if (0 >= param2) {
                          break L6;
                        } else {
                          var9_int = this.field_m.a(param0, param1, 0, param2);
                          if (0 != (var9_int ^ -1)) {
                            this.field_k = this.field_k + (long)var9_int;
                            this.field_d = this.field_d + (long)var9_int;
                            param1 = param1 + var9_int;
                            param2 = param2 - var9_int;
                            continue L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                    } else {
                      if ((param2 ^ -1) >= -1) {
                        break L6;
                      } else {
                        L8: {
                          this.b(98);
                          var9_int = param2;
                          if (this.field_i >= var9_int) {
                            break L8;
                          } else {
                            var9_int = this.field_i;
                            break L8;
                          }
                        }
                        dm.a(this.field_f, 0, param0, param1, var9_int);
                        param1 = param1 + var9_int;
                        param2 = param2 - var9_int;
                        this.field_d = this.field_d + (long)var9_int;
                        break L6;
                      }
                    }
                  }
                  L9: {
                    if (-1L != this.field_j) {
                      L10: {
                        if ((this.field_d ^ -1L) <= (this.field_j ^ -1L)) {
                          break L10;
                        } else {
                          stackIn_30_0 = 0;
                          stackIn_30_1 = param2;
                          if (stackIn_30_0 >= stackIn_30_1) {
                            break L10;
                          } else {
                            L11: {
                              var9_int = (int)(-this.field_d + this.field_j) + param1;
                              if (param2 + param1 >= var9_int) {
                                break L11;
                              } else {
                                var9_int = param1 + param2;
                                break L11;
                              }
                            }
                            L12: while (true) {
                              if (var9_int <= param1) {
                                break L10;
                              } else {
                                incrementValue$0 = param1;
                                param1++;
                                param0[incrementValue$0] = (byte) 0;
                                param2--;
                                this.field_d = this.field_d + 1L;
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
                          if ((this.field_j ^ -1L) > (var5_long ^ -1L)) {
                            break L14;
                          } else {
                            if ((long)var8 + var5_long > this.field_j) {
                              var9 = this.field_j;
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        if (this.field_j > var5_long) {
                          break L13;
                        } else {
                          if ((var5_long ^ -1L) > (this.field_j + (long)this.field_h ^ -1L)) {
                            var9 = var5_long;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L15: {
                        L16: {
                          if ((var5_long ^ -1L) <= (this.field_j - -(long)this.field_h ^ -1L)) {
                            break L16;
                          } else {
                            if ((var5_long + (long)var8 ^ -1L) <= (this.field_j - -(long)this.field_h ^ -1L)) {
                              var11 = (long)this.field_h + this.field_j;
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        if ((long)var8 + var5_long <= this.field_j) {
                          break L15;
                        } else {
                          if (((long)var8 + var5_long ^ -1L) < (this.field_j + (long)this.field_h ^ -1L)) {
                            break L15;
                          } else {
                            var11 = (long)var8 + var5_long;
                            break L15;
                          }
                        }
                      }
                      if (var9 <= -1L) {
                        break L9;
                      } else {
                        if (var11 <= var9) {
                          break L9;
                        } else {
                          var13 = (int)(-var9 + var11);
                          dm.a(this.field_b, (int)(var9 - this.field_j), param0, var7 - -(int)(var9 - var5_long), var13);
                          if ((var11 ^ -1L) < (this.field_d ^ -1L)) {
                            param2 = (int)((long)param2 - (var11 - this.field_d));
                            this.field_d = var11;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  throw new ArrayIndexOutOfBoundsException(param2 + (param1 + -param0.length));
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
              if (param2 > 0) {
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
            stackIn_63_0 = (RuntimeException) (var5_ref);

            stackIn_63_1 = new StringBuilder().append("k.I(");

            if (param0 == null) {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L17;
            } else {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L17;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        if (param0 != -40) {
            field_a = 108;
        }
        df.field_b.d(param2, param1);
        if (!param3) {
        } else {
            var4 = 2 * (bf.field_b % df.field_b.field_w);
            if (df.field_b.field_w <= var4) {
                var4 = -var4 - (-df.field_b.field_w - df.field_b.field_w);
            }
            if (var4 < 10) {
                var4 = 10;
            } else {
                if (!(-40 + df.field_b.field_w >= var4)) {
                    var4 = -40 + df.field_b.field_w;
                }
            }
            qe.a(0, 30, df.field_b, 0, var4, param1, 80, 5120, param2);
        }
    }

    final void a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var6_int = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var5_int = -66 / ((29 - param3) / 41);
                  if (this.field_o < (long)param2 + this.field_d) {
                    this.field_o = this.field_d + (long)param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (this.field_j == -1L) {
                    break L3;
                  } else {
                    L4: {
                      if ((this.field_d ^ -1L) > (this.field_j ^ -1L)) {
                        break L4;
                      } else {
                        if (this.field_d > this.field_j - -(long)this.field_h) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.a((byte) -109);
                    break L3;
                  }
                }
                L5: {
                  if (this.field_j == -1L) {
                    break L5;
                  } else {
                    if (this.field_d - -(long)param2 <= this.field_j - -(long)this.field_b.length) {
                      break L5;
                    } else {
                      var6_int = (int)(-this.field_d - (-this.field_j - (long)this.field_b.length));
                      dm.a(param1, param0, this.field_b, (int)(-this.field_j + this.field_d), var6_int);
                      param0 = param0 + var6_int;
                      this.field_d = this.field_d + (long)var6_int;
                      param2 = param2 - var6_int;
                      this.field_h = this.field_b.length;
                      this.a((byte) 41);
                      break L5;
                    }
                  }
                }
                if (this.field_b.length < param2) {
                  L6: {
                    if (this.field_d == this.field_k) {
                      break L6;
                    } else {
                      this.field_m.a(this.field_d, (byte) -114);
                      this.field_k = this.field_d;
                      break L6;
                    }
                  }
                  L7: {
                    this.field_m.a((byte) 110, param2, param0, param1);
                    this.field_k = this.field_k + (long)param2;
                    if (this.field_n < this.field_k) {
                      this.field_n = this.field_k;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var6 = -1L;
                      var8 = -1L;
                      if (this.field_d < this.field_g) {
                        break L9;
                      } else {
                        if ((this.field_g + (long)this.field_i ^ -1L) >= (this.field_d ^ -1L)) {
                          break L9;
                        } else {
                          var6 = this.field_d;
                          break L8;
                        }
                      }
                    }
                    if ((this.field_g ^ -1L) > (this.field_d ^ -1L)) {
                      break L8;
                    } else {
                      if ((this.field_g ^ -1L) > ((long)param2 + this.field_d ^ -1L)) {
                        var6 = this.field_g;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if ((this.field_g ^ -1L) <= ((long)param2 + this.field_d ^ -1L)) {
                        break L11;
                      } else {
                        if ((long)this.field_i + this.field_g < this.field_d - -(long)param2) {
                          break L11;
                        } else {
                          var8 = (long)param2 + this.field_d;
                          break L10;
                        }
                      }
                    }
                    if (this.field_d >= (long)this.field_i + this.field_g) {
                      break L10;
                    } else {
                      if (((long)this.field_i + this.field_g ^ -1L) >= (this.field_d + (long)param2 ^ -1L)) {
                        var8 = this.field_g + (long)this.field_i;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (0L <= (var6 ^ -1L)) {
                      break L12;
                    } else {
                      if ((var6 ^ -1L) > (var8 ^ -1L)) {
                        var10 = (int)(-var6 + var8);
                        dm.a(param1, (int)((long)param0 - (-var6 - -this.field_d)), this.field_f, (int)(-this.field_g + var6), var10);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  this.field_d = this.field_d + (long)param2;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (param2 > 0) {
                    L13: {
                      if ((this.field_j ^ -1L) != 0L) {
                        break L13;
                      } else {
                        this.field_j = this.field_d;
                        break L13;
                      }
                    }
                    L14: {
                      dm.a(param1, param0, this.field_b, (int)(-this.field_j + this.field_d), param2);
                      this.field_d = this.field_d + (long)param2;
                      if (((long)this.field_h ^ -1L) <= (this.field_d - this.field_j ^ -1L)) {
                        break L14;
                      } else {
                        this.field_h = (int)(this.field_d + -this.field_j);
                        break L14;
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
              this.field_k = -1L;
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
            stackIn_51_0 = (RuntimeException) (var5_ref);

            stackIn_51_1 = new StringBuilder().append("k.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L15;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L15;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param2 + ',' + param3 + ')');
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

    final static void c(int param0) {
        if (param0 != -28354) {
            return;
        }
        if (!(sg.field_h == null)) {
            sg.field_h.h(param0 ^ -28354);
            sg.field_h = null;
        }
    }

    public static void a(int param0) {
        if (param0 != -40) {
            k.c(70);
        }
        field_e = null;
        field_l = null;
        field_c = null;
    }

    private final void a(byte param0) throws IOException {
        int var2;
        long var3;
        long var5;
        int var7;
        int var8;
        L0: {
          var8 = fleas.field_A ? 1 : 0;
          var2 = 50 / ((param0 - -24) / 54);
          if (-1L != this.field_j) {
            L1: {
              if ((this.field_k ^ -1L) == (this.field_j ^ -1L)) {
                break L1;
              } else {
                this.field_m.a(this.field_j, (byte) -114);
                this.field_k = this.field_j;
                break L1;
              }
            }
            L2: {
              this.field_m.a((byte) 109, this.field_h, 0, this.field_b);
              this.field_k = this.field_k + (long)this.field_h;
              if (this.field_k > this.field_n) {
                this.field_n = this.field_k;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                var5 = -1L;
                if ((this.field_j ^ -1L) > (this.field_g ^ -1L)) {
                  break L4;
                } else {
                  if (this.field_j >= this.field_g - -(long)this.field_i) {
                    break L4;
                  } else {
                    var3 = this.field_j;
                    break L3;
                  }
                }
              }
              if ((this.field_j ^ -1L) < (this.field_g ^ -1L)) {
                break L3;
              } else {
                if (((long)this.field_h + this.field_j ^ -1L) >= (this.field_g ^ -1L)) {
                  break L3;
                } else {
                  var3 = this.field_g;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if ((this.field_g ^ -1L) <= ((long)this.field_h + this.field_j ^ -1L)) {
                  break L6;
                } else {
                  if (((long)this.field_h + this.field_j ^ -1L) >= (this.field_g - -(long)this.field_i ^ -1L)) {
                    var5 = (long)this.field_h + this.field_j;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (((long)this.field_i + this.field_g ^ -1L) >= (this.field_j ^ -1L)) {
                break L5;
              } else {
                if (((long)this.field_h + this.field_j ^ -1L) <= (this.field_g + (long)this.field_i ^ -1L)) {
                  var5 = this.field_g + (long)this.field_i;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (var3 <= -1L) {
                break L7;
              } else {
                if (var3 < var5) {
                  var7 = (int)(-var3 + var5);
                  dm.a(this.field_b, (int)(var3 - this.field_j), this.field_f, (int)(-this.field_g + var3), var7);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            this.field_h = 0;
            this.field_j = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = fleas.field_A ? 1 : 0;
        if (param0 < 47) {
            k.a(92, 3, 126, true);
        }
        this.field_i = 0;
        if (!((this.field_d ^ -1L) == (this.field_k ^ -1L))) {
            this.field_m.a(this.field_d, (byte) -121);
            this.field_k = this.field_d;
        }
        this.field_g = this.field_d;
        while (this.field_f.length > this.field_i) {
            var2 = -this.field_i + this.field_f.length;
            if (!(200000000 >= var2)) {
                var2 = 200000000;
            }
            var3 = this.field_m.a(this.field_f, this.field_i, 0, var2);
            if (0 == (var3 ^ -1)) {
                break;
            }
            this.field_k = this.field_k + (long)var3;
            this.field_i = this.field_i + var3;
        }
    }

    final static void a(int param0, wk param1) {
        try {
            uc.a((byte) 5, true, param1);
            if (param0 != 0) {
                k.a(-15, -38, 84, true);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "k.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (-1L < (param1 ^ -1L)) {
          throw new IOException();
        } else {
          L0: {
            if (param0 <= -103) {
              break L0;
            } else {
              this.field_b = (byte[]) null;
              break L0;
            }
          }
          this.field_d = param1;
          return;
        }
    }

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
              this.a(param1, 0, param1.length, 6520);
              if (param0 == 631) {
                break L1;
              } else {
                this.field_b = (byte[]) null;
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

            stackIn_5_1 = new StringBuilder().append("k.E(").append(param0).append(',');

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
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void b(byte param0) throws IOException {
        this.a((byte) 74);
        if (param0 != -70) {
            k.a(-30, -73, -71, false);
        }
        this.field_m.b(-1);
    }

    final long c(byte param0) {
        if (param0 >= -46) {
            return 49L;
        }
        return this.field_o;
    }

    k(rl param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_g = -1L;
        this.field_h = 0;
        this.field_j = -1L;
        try {
            this.field_m = param0;
            dupTemp$0 = param0.c(2049105808);
            this.field_n = dupTemp$0;
            this.field_o = dupTemp$0;
            this.field_b = new byte[param2];
            this.field_f = new byte[param1];
            this.field_d = 0L;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_l = new int[8192];
        field_a = 16777215;
        field_e = "Please try again in a few minutes.";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rk {
    private long field_i;
    static cf field_n;
    private int field_l;
    private long field_b;
    private long field_q;
    static int[] field_a;
    private long field_k;
    private byte[] field_r;
    private byte[] field_d;
    private nd field_j;
    private int field_f;
    private long field_m;
    private long field_o;
    static sl field_g;
    static String field_h;
    static int[] field_p;
    static boolean field_e;
    static String field_c;

    final long a(int param0) {
        int var2 = 25 % ((param0 - -62) / 44);
        return this.field_m;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
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
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (this.field_m >= this.field_q - -(long)param3) {
                    break L2;
                  } else {
                    this.field_m = (long)param3 + this.field_q;
                    break L2;
                  }
                }
                L3: {
                  if ((this.field_o ^ -1L) == 0L) {
                    break L3;
                  } else {
                    L4: {
                      if ((this.field_q ^ -1L) > (this.field_o ^ -1L)) {
                        break L4;
                      } else {
                        if (this.field_q > this.field_o - -(long)this.field_l) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.a(true);
                    break L3;
                  }
                }
                L5: {
                  if (0L == (this.field_o ^ -1L)) {
                    break L5;
                  } else {
                    if ((long)param3 + this.field_q > this.field_o + (long)this.field_d.length) {
                      var5_int = (int)((long)this.field_d.length - -this.field_o - this.field_q);
                      he.a(param2, param1, this.field_d, (int)(-this.field_o + this.field_q), var5_int);
                      this.field_q = this.field_q + (long)var5_int;
                      param3 = param3 - var5_int;
                      param1 = param1 + var5_int;
                      this.field_l = this.field_d.length;
                      this.a(true);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                if (this.field_d.length < param3) {
                  L6: {
                    if ((this.field_q ^ -1L) == (this.field_b ^ -1L)) {
                      break L6;
                    } else {
                      this.field_j.a(this.field_q, false);
                      this.field_b = this.field_q;
                      break L6;
                    }
                  }
                  L7: {
                    this.field_j.a(param2, param1, param3, (byte) -59);
                    this.field_b = this.field_b + (long)param3;
                    if (this.field_b <= this.field_k) {
                      break L7;
                    } else {
                      this.field_k = this.field_b;
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var5_long = -1L;
                      if ((this.field_q ^ -1L) > (this.field_i ^ -1L)) {
                        break L9;
                      } else {
                        if (this.field_i + (long)this.field_f > this.field_q) {
                          var5_long = this.field_q;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (this.field_i < this.field_q) {
                      break L8;
                    } else {
                      if ((this.field_i ^ -1L) > (this.field_q + (long)param3 ^ -1L)) {
                        var5_long = this.field_i;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      var7 = -1L;
                      if (this.field_q - -(long)param3 <= this.field_i) {
                        break L11;
                      } else {
                        if ((long)this.field_f + this.field_i >= (long)param3 + this.field_q) {
                          var7 = this.field_q - -(long)param3;
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if (this.field_q >= (long)this.field_f + this.field_i) {
                      break L10;
                    } else {
                      if ((long)param3 + this.field_q < (long)this.field_f + this.field_i) {
                        break L10;
                      } else {
                        var7 = this.field_i + (long)this.field_f;
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if ((var5_long ^ -1L) >= 0L) {
                      break L12;
                    } else {
                      if (var7 > var5_long) {
                        var9 = (int)(-var5_long + var7);
                        he.a(param2, (int)(var5_long + (long)param1 + -this.field_q), this.field_r, (int)(var5_long + -this.field_i), var9);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  this.field_q = this.field_q + (long)param3;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L13: {
                    if (param0 == -4573) {
                      break L13;
                    } else {
                      rk.b(false);
                      break L13;
                    }
                  }
                  if (-1 <= (param3 ^ -1)) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L14: {
                      if (this.field_o != -1L) {
                        break L14;
                      } else {
                        this.field_o = this.field_q;
                        break L14;
                      }
                    }
                    L15: {
                      he.a(param2, param1, this.field_d, (int)(this.field_q + -this.field_o), param3);
                      this.field_q = this.field_q + (long)param3;
                      if (((long)this.field_l ^ -1L) <= (this.field_q - this.field_o ^ -1L)) {
                        break L15;
                      } else {
                        this.field_l = (int)(-this.field_o + this.field_q);
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
            stackIn_52_0 = (RuntimeException) (var5_ref);

            stackIn_52_1 = new StringBuilder().append("rk.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L16;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L16;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param3 + ')');
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

    public static void b(boolean param0) {
        field_a = null;
        field_g = null;
        field_p = null;
        field_h = null;
        field_n = null;
        if (!param0) {
            field_n = (cf) null;
        }
        field_c = null;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
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
        var14 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (param3.length >= param1 + param0) {
                  L2: {
                    if (-1L == this.field_o) {
                      break L2;
                    } else {
                      if (this.field_o > this.field_q) {
                        break L2;
                      } else {
                        if ((this.field_o + (long)this.field_l ^ -1L) > (this.field_q + (long)param1 ^ -1L)) {
                          break L2;
                        } else {
                          he.a(this.field_d, (int)(this.field_q + -this.field_o), param3, param0, param1);
                          this.field_q = this.field_q + (long)param1;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_long = this.field_q;
                    var7 = param0;
                    var8 = param1;
                    if ((this.field_q ^ -1L) > (this.field_i ^ -1L)) {
                      break L3;
                    } else {
                      if (this.field_q >= this.field_i + (long)this.field_f) {
                        break L3;
                      } else {
                        L4: {
                          var9_int = (int)((long)this.field_f + -this.field_q + this.field_i);
                          if (var9_int <= param1) {
                            break L4;
                          } else {
                            var9_int = param1;
                            break L4;
                          }
                        }
                        he.a(this.field_r, (int)(this.field_q - this.field_i), param3, param0, var9_int);
                        param1 = param1 - var9_int;
                        this.field_q = this.field_q + (long)var9_int;
                        param0 = param0 + var9_int;
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (this.field_r.length < param1) {
                      this.field_j.a(this.field_q, false);
                      this.field_b = this.field_q;
                      L6: while (true) {
                        if (param1 <= 0) {
                          break L5;
                        } else {
                          var9_int = this.field_j.a(param0, param1, false, param3);
                          if (0 != (var9_int ^ -1)) {
                            param1 = param1 - var9_int;
                            this.field_b = this.field_b + (long)var9_int;
                            this.field_q = this.field_q + (long)var9_int;
                            param0 = param0 + var9_int;
                            continue L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                    } else {
                      if ((param1 ^ -1) >= -1) {
                        break L5;
                      } else {
                        L7: {
                          this.b((byte) -127);
                          var9_int = param1;
                          if (this.field_f < var9_int) {
                            var9_int = this.field_f;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        he.a(this.field_r, 0, param3, param0, var9_int);
                        param0 = param0 + var9_int;
                        this.field_q = this.field_q + (long)var9_int;
                        param1 = param1 - var9_int;
                        break L5;
                      }
                    }
                  }
                  L8: {
                    if (-1L == this.field_o) {
                      break L8;
                    } else {
                      L9: {
                        if (this.field_o <= this.field_q) {
                          break L9;
                        } else {
                          if (-1 > (param1 ^ -1)) {
                            L10: {
                              var9_int = (int)(this.field_o - this.field_q) + param0;
                              if (param1 + param0 < var9_int) {
                                var9_int = param1 + param0;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L11: while (true) {
                              if (param0 >= var9_int) {
                                break L9;
                              } else {
                                incrementValue$0 = param0;
                                param0++;
                                param3[incrementValue$0] = (byte) 0;
                                param1--;
                                this.field_q = this.field_q + 1L;
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
                          if ((this.field_o ^ -1L) > (var5_long ^ -1L)) {
                            break L13;
                          } else {
                            if ((this.field_o ^ -1L) <= (var5_long - -(long)var8 ^ -1L)) {
                              break L13;
                            } else {
                              var9 = this.field_o;
                              break L12;
                            }
                          }
                        }
                        if (var5_long < this.field_o) {
                          break L12;
                        } else {
                          if ((long)this.field_l + this.field_o <= var5_long) {
                            break L12;
                          } else {
                            var9 = var5_long;
                            break L12;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          if ((var5_long ^ -1L) <= (this.field_o - -(long)this.field_l ^ -1L)) {
                            break L15;
                          } else {
                            if ((this.field_o + (long)this.field_l ^ -1L) < (var5_long - -(long)var8 ^ -1L)) {
                              break L15;
                            } else {
                              var11 = (long)this.field_l + this.field_o;
                              break L14;
                            }
                          }
                        }
                        if (this.field_o >= var5_long - -(long)var8) {
                          break L14;
                        } else {
                          if ((var5_long + (long)var8 ^ -1L) < (this.field_o - -(long)this.field_l ^ -1L)) {
                            break L14;
                          } else {
                            var11 = (long)var8 + var5_long;
                            break L14;
                          }
                        }
                      }
                      if ((var9 ^ -1L) >= 0L) {
                        break L8;
                      } else {
                        if (var9 >= var11) {
                          break L8;
                        } else {
                          var13 = (int)(var11 + -var9);
                          he.a(this.field_d, (int)(var9 - this.field_o), param3, (int)(-var5_long + var9) + var7, var13);
                          if (this.field_q < var11) {
                            param1 = (int)((long)param1 - (var11 - this.field_q));
                            this.field_q = var11;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  L16: {
                    if (param2 >= 5) {
                      break L16;
                    } else {
                      this.a(64);
                      break L16;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  throw new ArrayIndexOutOfBoundsException(param0 - (-param1 - -param3.length));
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
              if (0 < param1) {
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
            stackIn_60_0 = (RuntimeException) (var5_ref);

            stackIn_60_1 = new StringBuilder().append("rk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_61_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L17;
            } else {
              stackIn_61_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L17;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        if (param1 != 0) {
            return;
        }
        this.field_q = param0;
    }

    final static int a(byte param0, int[] param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 5;
            var5 = 34 % ((param0 - -42) / 63);
            var4 = 0;
            L1: while (true) {
              if (6 <= var4) {
                stackIn_10_0 = var2_int;
                break L0;
              } else {
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var3) {
                    var4++;
                    continue L1;
                  } else {
                    if (-1 > (1 << var6 & param1[var4] ^ -1)) {
                      var2_int++;
                      var6++;
                      continue L2;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("rk.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    private final void a(boolean param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        java.net.URL var8;
        L0: {
          var7 = TorChallenge.field_F ? 1 : 0;
          if (0L != (this.field_o ^ -1L)) {
            L1: {
              if ((this.field_o ^ -1L) == (this.field_b ^ -1L)) {
                break L1;
              } else {
                this.field_j.a(this.field_o, false);
                this.field_b = this.field_o;
                break L1;
              }
            }
            L2: {
              this.field_j.a(this.field_d, 0, this.field_l, (byte) -59);
              this.field_b = this.field_b + (long)this.field_l;
              if ((this.field_b ^ -1L) < (this.field_k ^ -1L)) {
                this.field_k = this.field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if ((this.field_i ^ -1L) < (this.field_o ^ -1L)) {
                  break L4;
                } else {
                  if ((this.field_i + (long)this.field_f ^ -1L) < (this.field_o ^ -1L)) {
                    var2 = this.field_o;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (this.field_i < this.field_o) {
                break L3;
              } else {
                if ((long)this.field_l + this.field_o > this.field_i) {
                  var2 = this.field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (this.field_o + (long)this.field_l <= this.field_i) {
                  break L6;
                } else {
                  if (((long)this.field_l + this.field_o ^ -1L) < ((long)this.field_f + this.field_i ^ -1L)) {
                    break L6;
                  } else {
                    var4 = (long)this.field_l + this.field_o;
                    break L5;
                  }
                }
              }
              if (((long)this.field_f + this.field_i ^ -1L) >= (this.field_o ^ -1L)) {
                break L5;
              } else {
                if ((this.field_i + (long)this.field_f ^ -1L) >= (this.field_o + (long)this.field_l ^ -1L)) {
                  var4 = this.field_i - -(long)this.field_f;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if ((var2 ^ -1L) >= 0L) {
                break L7;
              } else {
                if ((var2 ^ -1L) <= (var4 ^ -1L)) {
                  break L7;
                } else {
                  var6 = (int)(-var2 + var4);
                  he.a(this.field_d, (int)(-this.field_o + var2), this.field_r, (int)(var2 - this.field_i), var6);
                  break L7;
                }
              }
            }
            this.field_l = 0;
            this.field_o = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0) {
            break L8;
          } else {
            var8 = (java.net.URL) null;
            rk.a((String) null, -7, (String) null, -38, (java.net.URL) null);
            break L8;
          }
        }
    }

    final void a(byte param0) throws IOException {
        this.a(true);
        if (param0 != -57) {
            java.awt.Canvas var3 = (java.awt.Canvas) null;
            rk.a((byte) 19, (java.awt.Canvas) null);
        }
        this.field_j.a((byte) 47);
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        int var2_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              sd.a((byte) 69, (java.awt.Component) ((Object) param1));
              kb.a((byte) -25, (java.awt.Component) ((Object) param1));
              var2_int = 59 / ((24 - param0) / 36);
              if (ef.field_l == null) {
                break L1;
              } else {
                ef.field_l.a((byte) 118, (java.awt.Component) ((Object) param1));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2);

            stackIn_5_1 = new StringBuilder().append("rk.A(").append(param0).append(',');

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
          throw oj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void b(byte param0) throws IOException {
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          this.field_f = 0;
          var2 = -29 % ((param0 - 36) / 57);
          if (this.field_q != this.field_b) {
            this.field_j.a(this.field_q, false);
            this.field_b = this.field_q;
            break L0;
          } else {
            break L0;
          }
        }
        this.field_i = this.field_q;
        L1: while (true) {
          L2: {
            if (this.field_r.length <= this.field_f) {
              break L2;
            } else {
              L3: {
                var3 = -this.field_f + this.field_r.length;
                if (200000000 < var3) {
                  var3 = 200000000;
                  break L3;
                } else {
                  break L3;
                }
              }
              var4 = this.field_j.a(this.field_f, var3, false, this.field_r);
              if (0 == (var4 ^ -1)) {
                break L2;
              } else {
                this.field_b = this.field_b + (long)var4;
                this.field_f = this.field_f + var4;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
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
              this.a(0, param1.length, (byte) 125, param1);
              if (param0 <= -92) {
                break L1;
              } else {
                field_e = false;
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

            stackIn_5_1 = new StringBuilder().append("rk.F(").append(param0).append(',');

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
          throw oj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static java.net.URL a(String param0, int param1, String param2, int param3, java.net.URL param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_3_0 = null;
            java.net.URL stackIn_43_0 = null;
            java.net.URL stackIn_45_0 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            StringBuilder stackIn_51_1 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            StringBuilder stackIn_54_1 = null;
            StringBuilder stackIn_55_1 = null;
            String stackIn_55_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = TorChallenge.field_F ? 1 : 0;
            try {
              L0: {
                if (param3 == -1) {
                  var5 = param4.getFile();
                  var6 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                          break L3;
                        } else {
                          var7_int = var5.indexOf('/', 1 + var6);
                          if ((var7_int ^ -1) <= -1) {
                            if ((param1 ^ -1) > -1) {
                              break L2;
                            } else {
                              var5 = var5.substring(0, var6) + var5.substring(var7_int);
                              continue L1;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (var5.regionMatches(var6, "/a=", 0, 3)) {
                          var7_int = var5.indexOf('/', 1 + var6);
                          if (-1 < (var7_int ^ -1)) {
                            break L4;
                          } else {
                            var6 = var7_int;
                            continue L1;
                          }
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                          break L5;
                        } else {
                          var7_int = var5.indexOf('/', var6 - -1);
                          if ((var7_int ^ -1) <= -1) {
                            if (param2 == null) {
                              break L2;
                            } else {
                              var5 = var5.substring(0, var6) + var5.substring(var7_int);
                              continue L1;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        L7: {
                          if (var5.regionMatches(var6, "/s=", 0, 3)) {
                            break L7;
                          } else {
                            if (var5.regionMatches(var6, "/c=", 0, 3)) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var7_int = var5.indexOf('/', var6 + 1);
                        if ((var7_int ^ -1) <= -1) {
                          if (param0 != null) {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          } else {
                            var6 = var7_int;
                            continue L1;
                          }
                        } else {
                          break L6;
                        }
                      }
                      L8: {
                        var7 = new StringBuilder(var6);
                        discarded$0 = var7.append(var5.substring(0, var6));
                        if (param1 <= 0) {
                          break L8;
                        } else {
                          discarded$1 = var7.append("/l=");
                          discarded$2 = var7.append(Integer.toString(param1));
                          break L8;
                        }
                      }
                      L9: {
                        if (param2 == null) {
                          break L9;
                        } else {
                          if ((param2.length() ^ -1) < -1) {
                            discarded$3 = var7.append("/p=");
                            discarded$4 = var7.append(param2);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (param0 == null) {
                          break L10;
                        } else {
                          if (-1 > (param0.length() ^ -1)) {
                            discarded$5 = var7.append("/s=");
                            discarded$6 = var7.append(param0);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (var5.length() <= var6) {
                          discarded$7 = var7.append('/');
                          break L11;
                        } else {
                          discarded$8 = var7.append(var5.substring(var6, var5.length()));
                          break L11;
                        }
                      }
                      try {
                        L12: {
                          stackIn_43_0 = new java.net.URL(param4, var7.toString());
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var8 = (Exception) (Object) decompiledCaughtException;
                        var8.printStackTrace();
                        stackIn_45_0 = (java.net.URL) (param4);
                        return stackIn_45_0;
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                    var6 = var7_int;
                    continue L1;
                  }
                } else {
                  stackIn_3_0 = (java.net.URL) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_48_0 = (RuntimeException) (var5_ref);

                stackIn_48_1 = new StringBuilder().append("rk.K(");

                if (param0 == null) {
                  stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackIn_49_2 = "null";
                  break L13;
                } else {
                  stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackIn_49_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackIn_52_2 = "null";
                  break L14;
                } else {
                  stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackIn_52_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_54_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
                  stackIn_55_2 = "null";
                  break L15;
                } else {
                  stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
                  stackIn_55_2 = "{...}";
                  break L15;
                }
              }
              throw oj.a((Throwable) ((Object) stackIn_49_0), stackIn_55_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_3_0;
            } else {
              return stackIn_43_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rk(nd param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_l = 0;
        this.field_i = -1L;
        this.field_o = -1L;
        try {
            this.field_j = param0;
            dupTemp$0 = param0.a(true);
            this.field_k = dupTemp$0;
            this.field_m = dupTemp$0;
            this.field_d = new byte[param2];
            this.field_q = 0L;
            this.field_r = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "rk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = new int[]{4, 8};
        field_n = new cf();
        field_e = true;
        field_c = "Email is valid";
        field_h = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}

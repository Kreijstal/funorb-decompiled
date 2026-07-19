/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class il {
    private int field_c;
    static th field_e;
    private long field_d;
    private byte[] field_h;
    private long field_g;
    private tc field_m;
    private int field_f;
    private long field_j;
    private byte[] field_a;
    private long field_k;
    private long field_i;
    static qj[] field_l;
    private long field_b;

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
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var14 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (param0.length < param1 + param2) {
                  throw new ArrayIndexOutOfBoundsException(-param0.length + param2 + param1);
                } else {
                  L2: {
                    if (this.field_j == -1L) {
                      break L2;
                    } else {
                      if (this.field_b < this.field_j) {
                        break L2;
                      } else {
                        if ((long)this.field_f + this.field_j < this.field_b + (long)param1) {
                          break L2;
                        } else {
                          pd.a(this.field_h, (int)(this.field_b + -this.field_j), param0, param2, param1);
                          this.field_b = this.field_b + (long)param1;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_long = this.field_b;
                    var7 = param2;
                    var8 = param1;
                    if ((this.field_b ^ -1L) > (this.field_d ^ -1L)) {
                      break L3;
                    } else {
                      if ((this.field_d + (long)this.field_c ^ -1L) < (this.field_b ^ -1L)) {
                        L4: {
                          var9_int = (int)((long)this.field_c - this.field_b - -this.field_d);
                          if (param1 < var9_int) {
                            var9_int = param1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        pd.a(this.field_a, (int)(this.field_b + -this.field_d), param0, param2, var9_int);
                        param1 = param1 - var9_int;
                        this.field_b = this.field_b + (long)var9_int;
                        param2 = param2 + var9_int;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param1 > this.field_a.length) {
                      this.field_m.a(true, this.field_b);
                      this.field_i = this.field_b;
                      L6: while (true) {
                        if (0 >= param1) {
                          break L5;
                        } else {
                          var9_int = this.field_m.a(param0, (byte) 74, param2, param1);
                          if (-1 == var9_int) {
                            break L5;
                          } else {
                            param2 = param2 + var9_int;
                            this.field_i = this.field_i + (long)var9_int;
                            param1 = param1 - var9_int;
                            this.field_b = this.field_b + (long)var9_int;
                            continue L6;
                          }
                        }
                      }
                    } else {
                      if (param1 <= 0) {
                        break L5;
                      } else {
                        L7: {
                          this.b((byte) 66);
                          var9_int = param1;
                          if (var9_int <= this.field_c) {
                            break L7;
                          } else {
                            var9_int = this.field_c;
                            break L7;
                          }
                        }
                        pd.a(this.field_a, 0, param0, param2, var9_int);
                        param1 = param1 - var9_int;
                        this.field_b = this.field_b + (long)var9_int;
                        param2 = param2 + var9_int;
                        break L5;
                      }
                    }
                  }
                  L8: {
                    if (0L == (this.field_j ^ -1L)) {
                      break L8;
                    } else {
                      L9: {
                        if ((this.field_b ^ -1L) <= (this.field_j ^ -1L)) {
                          break L9;
                        } else {
                          if (0 >= param1) {
                            break L9;
                          } else {
                            L10: {
                              var9_int = param2 + (int)(this.field_j - this.field_b);
                              if (var9_int <= param2 + param1) {
                                break L10;
                              } else {
                                var9_int = param1 + param2;
                                break L10;
                              }
                            }
                            L11: while (true) {
                              if (var9_int <= param2) {
                                break L9;
                              } else {
                                param1--;
                                incrementValue$1 = param2;
                                param2++;
                                param0[incrementValue$1] = (byte) 0;
                                this.field_b = this.field_b + 1L;
                                continue L11;
                              }
                            }
                          }
                        }
                      }
                      L12: {
                        L13: {
                          var9 = -1L;
                          if (this.field_j < var5_long) {
                            break L13;
                          } else {
                            if (var5_long + (long)var8 <= this.field_j) {
                              break L13;
                            } else {
                              var9 = this.field_j;
                              break L12;
                            }
                          }
                        }
                        if (var5_long < this.field_j) {
                          break L12;
                        } else {
                          if ((long)this.field_f + this.field_j > var5_long) {
                            var9 = var5_long;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          var11 = -1L;
                          if ((var5_long ^ -1L) <= (this.field_j + (long)this.field_f ^ -1L)) {
                            break L15;
                          } else {
                            if (((long)var8 + var5_long ^ -1L) > (this.field_j + (long)this.field_f ^ -1L)) {
                              break L15;
                            } else {
                              var11 = this.field_j - -(long)this.field_f;
                              break L14;
                            }
                          }
                        }
                        if (this.field_j >= var5_long - -(long)var8) {
                          break L14;
                        } else {
                          if ((var5_long - -(long)var8 ^ -1L) < (this.field_j - -(long)this.field_f ^ -1L)) {
                            break L14;
                          } else {
                            var11 = (long)var8 + var5_long;
                            break L14;
                          }
                        }
                      }
                      if (var9 <= -1L) {
                        break L8;
                      } else {
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                          break L8;
                        } else {
                          var13 = (int)(-var9 + var11);
                          pd.a(this.field_h, (int)(var9 - this.field_j), param0, (int)(var9 - var5_long) + var7, var13);
                          if ((this.field_b ^ -1L) > (var11 ^ -1L)) {
                            param1 = (int)((long)param1 - (var11 + -this.field_b));
                            this.field_b = var11;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_i = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if (param3 >= param1) {
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
            stackOut_55_0 = (RuntimeException) (var5_ref);
            stackOut_55_1 = new StringBuilder().append("il.C(");
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param0 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L16;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L16;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
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
            if (param0 <= -29) {
              stackOut_3_0 = oe.a(param1, (byte) -70, false);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("il.J(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(long param0, boolean param1) throws IOException {
        if (!((param0 ^ -1L) <= -1L)) {
            throw new IOException();
        }
        this.field_b = param0;
        if (!param1) {
            this.field_g = -51L;
        }
    }

    final long a(byte param0) {
        if (param0 >= -72) {
            return 9L;
        }
        return this.field_k;
    }

    final void d(int param0) throws IOException {
        int discarded$0 = 0;
        this.a(-120);
        this.field_m.a(-31576);
        if (param0 != 0) {
            discarded$0 = il.c(57);
        }
    }

    final static int c(int param0) {
        if (param0 != -14496) {
            il.b(-115);
        }
        return (int)(1000000000L / ba.field_f);
    }

    private final void a(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        if (param0 > -110) {
          return;
        } else {
          L0: {
            if (-1L == this.field_j) {
              break L0;
            } else {
              L1: {
                if ((this.field_j ^ -1L) != (this.field_i ^ -1L)) {
                  this.field_m.a(true, this.field_j);
                  this.field_i = this.field_j;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                this.field_m.a(0, this.field_f, 0, this.field_h);
                this.field_i = this.field_i + (long)this.field_f;
                if ((this.field_g ^ -1L) <= (this.field_i ^ -1L)) {
                  break L2;
                } else {
                  this.field_g = this.field_i;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  if (this.field_d > this.field_j) {
                    break L4;
                  } else {
                    if (this.field_j >= this.field_d + (long)this.field_c) {
                      break L4;
                    } else {
                      var2 = this.field_j;
                      break L3;
                    }
                  }
                }
                if (this.field_j > this.field_d) {
                  break L3;
                } else {
                  if ((this.field_d ^ -1L) > ((long)this.field_f + this.field_j ^ -1L)) {
                    var2 = this.field_d;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  var4 = -1L;
                  if (this.field_d >= this.field_j + (long)this.field_f) {
                    break L6;
                  } else {
                    if (this.field_d + (long)this.field_c >= (long)this.field_f + this.field_j) {
                      var4 = (long)this.field_f + this.field_j;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((long)this.field_c + this.field_d <= this.field_j) {
                  break L5;
                } else {
                  if (this.field_j - -(long)this.field_f >= (long)this.field_c + this.field_d) {
                    var4 = this.field_d - -(long)this.field_c;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (-1L >= var2) {
                  break L7;
                } else {
                  if ((var4 ^ -1L) < (var2 ^ -1L)) {
                    var6 = (int)(-var2 + var4);
                    pd.a(this.field_h, (int)(-this.field_j + var2), this.field_a, (int)(-this.field_d + var2), var6);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              this.field_f = 0;
              this.field_j = -1L;
              break L0;
            }
          }
          return;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_l = null;
        if (param0 != -1) {
            il.b(-44);
        }
    }

    private final void b(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (param0 <= 26) {
          return;
        } else {
          L0: {
            this.field_c = 0;
            if ((this.field_b ^ -1L) != (this.field_i ^ -1L)) {
              this.field_m.a(true, this.field_b);
              this.field_i = this.field_b;
              break L0;
            } else {
              break L0;
            }
          }
          this.field_d = this.field_b;
          L1: while (true) {
            L2: {
              if (this.field_c >= this.field_a.length) {
                break L2;
              } else {
                L3: {
                  var2 = this.field_a.length + -this.field_c;
                  if (200000000 >= var2) {
                    break L3;
                  } else {
                    var2 = 200000000;
                    break L3;
                  }
                }
                var3 = this.field_m.a(this.field_a, (byte) 74, this.field_c, var2);
                if (-1 == var3) {
                  break L2;
                } else {
                  this.field_i = this.field_i + (long)var3;
                  this.field_c = this.field_c + var3;
                  continue L1;
                }
              }
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (this.field_k < this.field_b + (long)param0) {
                    this.field_k = this.field_b + (long)param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-1L == this.field_j) {
                    break L3;
                  } else {
                    if (this.field_b >= this.field_j) {
                      if (this.field_b <= this.field_j + (long)this.field_f) {
                        break L3;
                      } else {
                        this.a(-114);
                        break L3;
                      }
                    } else {
                      this.a(-114);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (this.field_j == -1L) {
                    break L4;
                  } else {
                    if (((long)this.field_h.length + this.field_j ^ -1L) > ((long)param0 + this.field_b ^ -1L)) {
                      var5_int = (int)(this.field_j - (this.field_b - (long)this.field_h.length));
                      pd.a(param2, param3, this.field_h, (int)(this.field_b - this.field_j), var5_int);
                      param0 = param0 - var5_int;
                      this.field_b = this.field_b + (long)var5_int;
                      param3 = param3 + var5_int;
                      this.field_f = this.field_h.length;
                      this.a(-113);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (this.field_h.length >= param0) {
                  if ((param0 ^ -1) >= param1) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L5: {
                      if (0L != (this.field_j ^ -1L)) {
                        break L5;
                      } else {
                        this.field_j = this.field_b;
                        break L5;
                      }
                    }
                    L6: {
                      pd.a(param2, param3, this.field_h, (int)(-this.field_j + this.field_b), param0);
                      this.field_b = this.field_b + (long)param0;
                      if (-this.field_j + this.field_b <= (long)this.field_f) {
                        break L6;
                      } else {
                        this.field_f = (int)(this.field_b - this.field_j);
                        break L6;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                } else {
                  L7: {
                    if ((this.field_i ^ -1L) == (this.field_b ^ -1L)) {
                      break L7;
                    } else {
                      this.field_m.a(true, this.field_b);
                      this.field_i = this.field_b;
                      break L7;
                    }
                  }
                  L8: {
                    this.field_m.a(0, param0, param3, param2);
                    this.field_i = this.field_i + (long)param0;
                    if ((this.field_g ^ -1L) <= (this.field_i ^ -1L)) {
                      break L8;
                    } else {
                      this.field_g = this.field_i;
                      break L8;
                    }
                  }
                  L9: {
                    L10: {
                      var5_long = -1L;
                      var7 = -1L;
                      if (this.field_b < this.field_d) {
                        break L10;
                      } else {
                        if (this.field_d + (long)this.field_c <= this.field_b) {
                          break L10;
                        } else {
                          var5_long = this.field_b;
                          break L9;
                        }
                      }
                    }
                    if (this.field_d < this.field_b) {
                      break L9;
                    } else {
                      if (this.field_d >= (long)param0 + this.field_b) {
                        break L9;
                      } else {
                        var5_long = this.field_d;
                        break L9;
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (this.field_b - -(long)param0 <= this.field_d) {
                        break L12;
                      } else {
                        if (this.field_b + (long)param0 > this.field_d - -(long)this.field_c) {
                          break L12;
                        } else {
                          var7 = this.field_b + (long)param0;
                          break L11;
                        }
                      }
                    }
                    if ((this.field_b ^ -1L) <= (this.field_d - -(long)this.field_c ^ -1L)) {
                      break L11;
                    } else {
                      if ((this.field_d + (long)this.field_c ^ -1L) < (this.field_b - -(long)param0 ^ -1L)) {
                        break L11;
                      } else {
                        var7 = (long)this.field_c + this.field_d;
                        break L11;
                      }
                    }
                  }
                  L13: {
                    if (var5_long <= -1L) {
                      break L13;
                    } else {
                      if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
                        break L13;
                      } else {
                        var9 = (int)(-var5_long + var7);
                        pd.a(param2, (int)((long)param3 + var5_long - this.field_b), this.field_a, (int)(var5_long + -this.field_d), var9);
                        break L13;
                      }
                    }
                  }
                  this.field_b = this.field_b + (long)param0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_i = -1L;
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
            stackOut_45_0 = (RuntimeException) (var5_ref);
            stackOut_45_1 = new StringBuilder().append("il.D(").append(param0).append(',').append(param1).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L14;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L14;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param3 + ')');
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

    il(tc param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_d = -1L;
        this.field_j = -1L;
        this.field_f = 0;
        try {
            this.field_m = param0;
            dupTemp$0 = param0.a((byte) 121);
            this.field_g = dupTemp$0;
            this.field_k = dupTemp$0;
            this.field_b = 0L;
            this.field_h = new byte[param2];
            this.field_a = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "il.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
            if (param0 > -113) {
                il.b(46);
            }
            this.a(param1, param1.length, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "il.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}

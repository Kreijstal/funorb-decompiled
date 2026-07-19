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
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
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
                    L7: {
                      L8: {
                        L9: {
                          L10: {
                            if (param2 > this.field_f.length) {
                              break L10;
                            } else {
                              if ((param2 ^ -1) >= -1) {
                                break L9;
                              } else {
                                L11: {
                                  this.b(98);
                                  var9_int = param2;
                                  if (this.field_i >= var9_int) {
                                    break L11;
                                  } else {
                                    var9_int = this.field_i;
                                    break L11;
                                  }
                                }
                                dm.a(this.field_f, 0, param0, param1, var9_int);
                                param1 = param1 + var9_int;
                                param2 = param2 - var9_int;
                                this.field_d = this.field_d + (long)var9_int;
                                if (var14 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          this.field_m.a(this.field_d, (byte) -127);
                          this.field_k = this.field_d;
                          L12: while (true) {
                            if (0 >= param2) {
                              break L9;
                            } else {
                              var9_int = this.field_m.a(param0, param1, 0, param2);
                              stackOut_23_0 = 0;
                              stackOut_23_1 = var9_int ^ -1;
                              stackIn_32_0 = stackOut_23_0;
                              stackIn_32_1 = stackOut_23_1;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              if (var14 != 0) {
                                break L8;
                              } else {
                                L13: {
                                  if (stackIn_24_0 != stackIn_24_1) {
                                    break L13;
                                  } else {
                                    if (var14 == 0) {
                                      break L9;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                this.field_k = this.field_k + (long)var9_int;
                                this.field_d = this.field_d + (long)var9_int;
                                param1 = param1 + var9_int;
                                param2 = param2 - var9_int;
                                if (var14 == 0) {
                                  continue L12;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        if (-1L != this.field_j) {
                          if ((this.field_d ^ -1L) <= (this.field_j ^ -1L)) {
                            break L7;
                          } else {
                            stackOut_31_0 = 0;
                            stackOut_31_1 = param2;
                            stackIn_32_0 = stackOut_31_0;
                            stackIn_32_1 = stackOut_31_1;
                            break L8;
                          }
                        } else {
                          break L6;
                        }
                      }
                      if (stackIn_32_0 >= stackIn_32_1) {
                        break L7;
                      } else {
                        L14: {
                          var9_int = (int)(-this.field_d + this.field_j) + param1;
                          if (param2 + param1 >= var9_int) {
                            break L14;
                          } else {
                            var9_int = param1 + param2;
                            break L14;
                          }
                        }
                        L15: while (true) {
                          if (var9_int <= param1) {
                            break L7;
                          } else {
                            incrementValue$1 = param1;
                            param1++;
                            param0[incrementValue$1] = (byte) 0;
                            param2--;
                            this.field_d = this.field_d + 1L;
                            if (var14 != 0) {
                              break L6;
                            } else {
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      L17: {
                        L18: {
                          var9 = -1L;
                          var11 = -1L;
                          if ((this.field_j ^ -1L) > (var5_long ^ -1L)) {
                            break L18;
                          } else {
                            if ((long)var8 + var5_long > this.field_j) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (this.field_j > var5_long) {
                          break L16;
                        } else {
                          if ((var5_long ^ -1L) > (this.field_j + (long)this.field_h ^ -1L)) {
                            var9 = var5_long;
                            if (var14 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      var9 = this.field_j;
                      break L16;
                    }
                    L19: {
                      L20: {
                        L21: {
                          if ((var5_long ^ -1L) <= (this.field_j - -(long)this.field_h ^ -1L)) {
                            break L21;
                          } else {
                            if ((var5_long + (long)var8 ^ -1L) <= (this.field_j - -(long)this.field_h ^ -1L)) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if ((long)var8 + var5_long <= this.field_j) {
                          break L19;
                        } else {
                          if (((long)var8 + var5_long ^ -1L) < (this.field_j + (long)this.field_h ^ -1L)) {
                            break L19;
                          } else {
                            var11 = (long)var8 + var5_long;
                            if (var14 == 0) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      var11 = (long)this.field_h + this.field_j;
                      break L19;
                    }
                    if (var9 <= -1L) {
                      break L6;
                    } else {
                      if (var11 <= var9) {
                        break L6;
                      } else {
                        var13 = (int)(-var9 + var11);
                        dm.a(this.field_b, (int)(var9 - this.field_j), param0, var7 - -(int)(var9 - var5_long), var13);
                        if ((var11 ^ -1L) < (this.field_d ^ -1L)) {
                          param2 = (int)((long)param2 - (var11 - this.field_d));
                          this.field_d = var11;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
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
          L22: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) (var5_ref);
            stackOut_65_1 = new StringBuilder().append("k.I(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L22;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L22;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        L0: {
          if (param0 == -40) {
            break L0;
          } else {
            field_a = 108;
            break L0;
          }
        }
        L1: {
          df.field_b.d(param2, param1);
          if (param3) {
            L2: {
              var4 = 2 * (bf.field_b % df.field_b.field_w);
              if (df.field_b.field_w > var4) {
                break L2;
              } else {
                var4 = -var4 - (-df.field_b.field_w - df.field_b.field_w);
                break L2;
              }
            }
            L3: {
              L4: {
                if (var4 >= 10) {
                  break L4;
                } else {
                  var4 = 10;
                  if (!fleas.field_A) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (-40 + df.field_b.field_w < var4) {
                var4 = -40 + df.field_b.field_w;
                break L3;
              } else {
                break L3;
              }
            }
            qe.a(0, 30, df.field_b, 0, var4, param1, 80, 5120, param2);
            break L1;
          } else {
            break L1;
          }
        }
    }

    final void a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        int var6_int = 0;
        long var6 = 0L;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
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
                          if (var11 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
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
                          if (var11 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
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
            stackOut_49_0 = (RuntimeException) (var5_ref);
            stackOut_49_1 = new StringBuilder().append("k.H(").append(param0).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param1 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L15;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
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
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
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
                    if (var8 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
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
                L7: {
                  if ((this.field_g ^ -1L) <= ((long)this.field_h + this.field_j ^ -1L)) {
                    break L7;
                  } else {
                    if (((long)this.field_h + this.field_j ^ -1L) >= (this.field_g - -(long)this.field_i ^ -1L)) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                if (((long)this.field_i + this.field_g ^ -1L) >= (this.field_j ^ -1L)) {
                  break L5;
                } else {
                  if (((long)this.field_h + this.field_j ^ -1L) <= (this.field_g + (long)this.field_i ^ -1L)) {
                    var5 = this.field_g + (long)this.field_i;
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
              var5 = (long)this.field_h + this.field_j;
              break L5;
            }
            L8: {
              if (var3 <= -1L) {
                break L8;
              } else {
                if (var3 < var5) {
                  var7 = (int)(-var3 + var5);
                  dm.a(this.field_b, (int)(var3 - this.field_j), this.field_f, (int)(-this.field_g + var3), var7);
                  break L8;
                } else {
                  break L8;
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
        int var4 = 0;
        L0: {
          var4 = fleas.field_A ? 1 : 0;
          if (param0 >= 47) {
            break L0;
          } else {
            k.a(92, 3, 126, true);
            break L0;
          }
        }
        L1: {
          this.field_i = 0;
          if ((this.field_d ^ -1L) != (this.field_k ^ -1L)) {
            this.field_m.a(this.field_d, (byte) -121);
            this.field_k = this.field_d;
            break L1;
          } else {
            break L1;
          }
        }
        this.field_g = this.field_d;
        L2: while (true) {
          L3: {
            if (this.field_f.length <= this.field_i) {
              break L3;
            } else {
              var2 = -this.field_i + this.field_f.length;
              if (var4 != 0) {
                break L3;
              } else {
                L4: {
                  if (200000000 < var2) {
                    var2 = 200000000;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var3 = this.field_m.a(this.field_f, this.field_i, 0, var2);
                  if (0 != (var3 ^ -1)) {
                    break L5;
                  } else {
                    if (var4 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                this.field_k = this.field_k + (long)var3;
                this.field_i = this.field_i + var3;
                if (var4 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
          }
          return;
        }
    }

    final static void a(int param0, wk param1) {
        RuntimeException runtimeException = null;
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
              uc.a((byte) 5, true, param1);
              if (param0 == 0) {
                break L1;
              } else {
                k.a(-15, -38, 84, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("k.A(").append(param0).append(',');
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
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
            stackOut_3_0 = (RuntimeException) (var3);
            stackOut_3_1 = new StringBuilder().append("k.E(").append(param0).append(',');
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

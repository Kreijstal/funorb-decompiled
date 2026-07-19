/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nh {
    private long field_b;
    private long field_k;
    private long field_n;
    private long field_j;
    private long field_e;
    private hf field_h;
    private int field_m;
    private byte[] field_g;
    private long field_o;
    private byte[] field_d;
    private int field_c;
    static qm field_i;
    static boolean field_a;
    static char[] field_l;
    static String field_f;

    public static void a(byte param0) {
        field_f = null;
        field_l = null;
        if (param0 != -73) {
            return;
        }
        field_i = null;
    }

    final void a(long param0, byte param1) throws IOException {
        if ((param0 ^ -1L) > -1L) {
          throw new IOException();
        } else {
          L0: {
            this.field_j = param0;
            if (param1 == -109) {
              break L0;
            } else {
              nh.a((byte) 91);
              break L0;
            }
          }
          return;
        }
    }

    private final void b(byte param0) throws IOException {
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = client.field_A ? 1 : 0;
          var2 = 75 / ((param0 - -55) / 40);
          if (this.field_e != -1L) {
            L1: {
              if ((this.field_e ^ -1L) != (this.field_b ^ -1L)) {
                this.field_h.a(this.field_e, 80);
                this.field_b = this.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              this.field_h.a(this.field_d, 117, 0, this.field_c);
              this.field_b = this.field_b + (long)this.field_c;
              if ((this.field_k ^ -1L) > (this.field_b ^ -1L)) {
                this.field_k = this.field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                L5: {
                  var3 = -1L;
                  if ((this.field_e ^ -1L) > (this.field_o ^ -1L)) {
                    break L5;
                  } else {
                    if ((this.field_e ^ -1L) > (this.field_o + (long)this.field_m ^ -1L)) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                if ((this.field_e ^ -1L) < (this.field_o ^ -1L)) {
                  break L3;
                } else {
                  if (((long)this.field_c + this.field_e ^ -1L) < (this.field_o ^ -1L)) {
                    var3 = this.field_o;
                    if (var8 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var3 = this.field_e;
              break L3;
            }
            L6: {
              L7: {
                L8: {
                  var5 = -1L;
                  if ((this.field_o ^ -1L) <= ((long)this.field_c + this.field_e ^ -1L)) {
                    break L8;
                  } else {
                    if ((long)this.field_m + this.field_o >= (long)this.field_c + this.field_e) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if ((long)this.field_m + this.field_o <= this.field_e) {
                  break L6;
                } else {
                  if (this.field_o + (long)this.field_m <= this.field_e + (long)this.field_c) {
                    var5 = this.field_o + (long)this.field_m;
                    if (var8 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  } else {
                    break L6;
                  }
                }
              }
              var5 = this.field_e + (long)this.field_c;
              break L6;
            }
            L9: {
              if (-1L >= var3) {
                break L9;
              } else {
                if ((var3 ^ -1L) > (var5 ^ -1L)) {
                  var7 = (int)(var5 - var3);
                  an.a(this.field_d, (int)(-this.field_e + var3), this.field_g, (int)(-this.field_o + var3), var7);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            this.field_e = -1L;
            this.field_c = 0;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final long b(int param0) {
        int var2 = 93 / ((-25 - param0) / 62);
        return this.field_n;
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = client.field_A ? 1 : 0;
          this.field_m = param0;
          if (this.field_b != this.field_j) {
            this.field_h.a(this.field_j, 123);
            this.field_b = this.field_j;
            break L0;
          } else {
            break L0;
          }
        }
        this.field_o = this.field_j;
        L1: while (true) {
          L2: {
            if (this.field_m >= this.field_g.length) {
              break L2;
            } else {
              var2 = -this.field_m + this.field_g.length;
              if (var4 != 0) {
                break L2;
              } else {
                L3: {
                  if (-200000001 > (var2 ^ -1)) {
                    var2 = 200000000;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var3 = this.field_h.a(this.field_g, (byte) -103, this.field_m, var2);
                  if (-1 != var3) {
                    break L4;
                  } else {
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_m = this.field_m + var3;
                this.field_b = this.field_b + (long)var3;
                if (var4 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
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
        int stackIn_21_0 = 0;
        int stackIn_29_0 = 0;
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
        int stackOut_20_0 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var14 = client.field_A ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (param2 == 741) {
                    break L2;
                  } else {
                    nh.a((byte) 18, 18);
                    break L2;
                  }
                }
                if (param1.length < param0 - -param3) {
                  throw new ArrayIndexOutOfBoundsException(-param1.length + (param0 + param3));
                } else {
                  L3: {
                    if ((this.field_e ^ -1L) == 0L) {
                      break L3;
                    } else {
                      if (this.field_j < this.field_e) {
                        break L3;
                      } else {
                        if (this.field_j + (long)param3 > (long)this.field_c + this.field_e) {
                          break L3;
                        } else {
                          an.a(this.field_d, (int)(-this.field_e + this.field_j), param1, param0, param3);
                          this.field_j = this.field_j + (long)param3;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  L4: {
                    var5_long = this.field_j;
                    var7 = param0;
                    var8 = param3;
                    if ((this.field_j ^ -1L) > (this.field_o ^ -1L)) {
                      break L4;
                    } else {
                      if (this.field_j < (long)this.field_m + this.field_o) {
                        L5: {
                          var9_int = (int)((long)this.field_m + (-this.field_j - -this.field_o));
                          if (param3 >= var9_int) {
                            break L5;
                          } else {
                            var9_int = param3;
                            break L5;
                          }
                        }
                        an.a(this.field_g, (int)(this.field_j - this.field_o), param1, param0, var9_int);
                        this.field_j = this.field_j + (long)var9_int;
                        param3 = param3 - var9_int;
                        param0 = param0 + var9_int;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      L8: {
                        if (param3 <= this.field_g.length) {
                          break L8;
                        } else {
                          this.field_h.a(this.field_j, 23);
                          this.field_b = this.field_j;
                          L9: while (true) {
                            if (0 >= param3) {
                              break L7;
                            } else {
                              var9_int = this.field_h.a(param1, (byte) -38, param0, param3);
                              stackOut_20_0 = var9_int ^ -1;
                              stackIn_29_0 = stackOut_20_0;
                              stackIn_21_0 = stackOut_20_0;
                              if (var14 != 0) {
                                break L6;
                              } else {
                                if (stackIn_21_0 == 0) {
                                  break L7;
                                } else {
                                  this.field_b = this.field_b + (long)var9_int;
                                  param3 = param3 - var9_int;
                                  param0 = param0 + var9_int;
                                  this.field_j = this.field_j + (long)var9_int;
                                  if (var14 == 0) {
                                    continue L9;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if ((param3 ^ -1) >= -1) {
                        break L7;
                      } else {
                        L10: {
                          this.a(0);
                          var9_int = param3;
                          if (this.field_m < var9_int) {
                            var9_int = this.field_m;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        an.a(this.field_g, 0, param1, param0, var9_int);
                        param0 = param0 + var9_int;
                        param3 = param3 - var9_int;
                        this.field_j = this.field_j + (long)var9_int;
                        break L7;
                      }
                    }
                    stackOut_28_0 = (this.field_e < -1L ? -1 : (this.field_e == -1L ? 0 : 1));
                    stackIn_29_0 = stackOut_28_0;
                    break L6;
                  }
                  L11: {
                    if (stackIn_29_0 != 0) {
                      L12: {
                        if (this.field_j >= this.field_e) {
                          break L12;
                        } else {
                          if (-1 > (param3 ^ -1)) {
                            L13: {
                              var9_int = param0 - -(int)(this.field_e - this.field_j);
                              if (var9_int <= param0 - -param3) {
                                break L13;
                              } else {
                                var9_int = param3 + param0;
                                break L13;
                              }
                            }
                            L14: while (true) {
                              if (var9_int <= param0) {
                                break L12;
                              } else {
                                param3--;
                                incrementValue$1 = param0;
                                param0++;
                                param1[incrementValue$1] = (byte) 0;
                                this.field_j = this.field_j + 1L;
                                if (var14 != 0) {
                                  break L11;
                                } else {
                                  continue L14;
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
                          if ((var5_long ^ -1L) < (this.field_e ^ -1L)) {
                            break L16;
                          } else {
                            if (this.field_e >= var5_long - -(long)var8) {
                              break L16;
                            } else {
                              var9 = this.field_e;
                              if (var14 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        if ((this.field_e ^ -1L) < (var5_long ^ -1L)) {
                          break L15;
                        } else {
                          if ((var5_long ^ -1L) > ((long)this.field_c + this.field_e ^ -1L)) {
                            var9 = var5_long;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L17: {
                        L18: {
                          L19: {
                            var11 = -1L;
                            if ((long)this.field_c + this.field_e <= var5_long) {
                              break L19;
                            } else {
                              if (((long)var8 + var5_long ^ -1L) <= ((long)this.field_c + this.field_e ^ -1L)) {
                                break L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          if (this.field_e >= (long)var8 + var5_long) {
                            break L17;
                          } else {
                            if (((long)this.field_c + this.field_e ^ -1L) <= (var5_long + (long)var8 ^ -1L)) {
                              var11 = (long)var8 + var5_long;
                              if (var14 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            } else {
                              break L17;
                            }
                          }
                        }
                        var11 = this.field_e - -(long)this.field_c;
                        break L17;
                      }
                      if (var9 <= -1L) {
                        break L11;
                      } else {
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                          break L11;
                        } else {
                          var13 = (int)(var11 - var9);
                          an.a(this.field_d, (int)(-this.field_e + var9), param1, var7 + (int)(-var5_long + var9), var13);
                          if ((var11 ^ -1L) >= (this.field_j ^ -1L)) {
                            break L11;
                          } else {
                            param3 = (int)((long)param3 - (-this.field_j + var11));
                            this.field_j = var11;
                            break L11;
                          }
                        }
                      }
                    } else {
                      break L11;
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
              if ((param3 ^ -1) < -1) {
                throw new EOFException();
              } else {
                decompiledRegionSelector1 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L20: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) (var5_ref);
            stackOut_65_1 = new StringBuilder().append("nh.H(").append(param0).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param1 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L20;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L20;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) throws IOException {
        this.b((byte) -99);
        this.field_h.a(-82);
        if (param0 < 113) {
            field_l = (char[]) null;
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
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
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if ((this.field_n ^ -1L) <= (this.field_j - -(long)param3 ^ -1L)) {
                    break L2;
                  } else {
                    this.field_n = (long)param3 + this.field_j;
                    break L2;
                  }
                }
                L3: {
                  if (-1L == this.field_e) {
                    break L3;
                  } else {
                    L4: {
                      if ((this.field_j ^ -1L) > (this.field_e ^ -1L)) {
                        break L4;
                      } else {
                        if ((this.field_j ^ -1L) < (this.field_e - -(long)this.field_c ^ -1L)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.b((byte) -120);
                    break L3;
                  }
                }
                L5: {
                  if (0L == (this.field_e ^ -1L)) {
                    break L5;
                  } else {
                    if (this.field_j + (long)param3 <= this.field_e - -(long)this.field_d.length) {
                      break L5;
                    } else {
                      var5_int = (int)((long)this.field_d.length + (this.field_e + -this.field_j));
                      an.a(param0, param2, this.field_d, (int)(this.field_j - this.field_e), var5_int);
                      param2 = param2 + var5_int;
                      param3 = param3 - var5_int;
                      this.field_j = this.field_j + (long)var5_int;
                      this.field_c = this.field_d.length;
                      this.b((byte) -15);
                      break L5;
                    }
                  }
                }
                if (this.field_d.length < param3) {
                  L6: {
                    if ((this.field_j ^ -1L) == (this.field_b ^ -1L)) {
                      break L6;
                    } else {
                      this.field_h.a(this.field_j, 47);
                      this.field_b = this.field_j;
                      break L6;
                    }
                  }
                  L7: {
                    this.field_h.a(param0, 83, param2, param3);
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
                      if ((this.field_o ^ -1L) < (this.field_j ^ -1L)) {
                        break L9;
                      } else {
                        if (this.field_j >= this.field_o + (long)this.field_m) {
                          break L9;
                        } else {
                          var5_long = this.field_j;
                          if (var10 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    if (this.field_o < this.field_j) {
                      break L8;
                    } else {
                      if (this.field_o < (long)param3 + this.field_j) {
                        var5_long = this.field_o;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      L12: {
                        var7 = -1L;
                        if (this.field_o >= this.field_j - -(long)param3) {
                          break L12;
                        } else {
                          if ((long)this.field_m + this.field_o >= (long)param3 + this.field_j) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if ((long)this.field_m + this.field_o <= this.field_j) {
                        break L10;
                      } else {
                        if ((this.field_o - -(long)this.field_m ^ -1L) >= ((long)param3 + this.field_j ^ -1L)) {
                          var7 = this.field_o - -(long)this.field_m;
                          if (var10 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        } else {
                          break L10;
                        }
                      }
                    }
                    var7 = this.field_j + (long)param3;
                    break L10;
                  }
                  L13: {
                    if ((var5_long ^ -1L) >= 0L) {
                      break L13;
                    } else {
                      if (var7 > var5_long) {
                        var9 = (int)(-var5_long + var7);
                        an.a(param0, (int)(var5_long + ((long)param2 + -this.field_j)), this.field_g, (int)(-this.field_o + var5_long), var9);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  this.field_j = this.field_j + (long)param3;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L14: {
                    if (param1 > 91) {
                      break L14;
                    } else {
                      field_f = (String) null;
                      break L14;
                    }
                  }
                  if (param3 <= 0) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L15: {
                      if ((this.field_e ^ -1L) == 0L) {
                        this.field_e = this.field_j;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      an.a(param0, param2, this.field_d, (int)(this.field_j - this.field_e), param3);
                      this.field_j = this.field_j + (long)param3;
                      if ((this.field_j + -this.field_e ^ -1L) < ((long)this.field_c ^ -1L)) {
                        this.field_c = (int)(-this.field_e + this.field_j);
                        break L16;
                      } else {
                        break L16;
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
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) (var5_ref);
            stackOut_51_1 = new StringBuilder().append("nh.C(");
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L17;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L17;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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

    final static void a(byte param0, int param1) {
        if (param0 != 12) {
          return;
        } else {
          L0: {
            qk.field_i = 3 & param1 >> -171891708;
            wh.field_d = (13 & param1) >> -1689619070;
            if (2 >= qk.field_i) {
              break L0;
            } else {
              qk.field_i = 2;
              break L0;
            }
          }
          L1: {
            wl.field_o = 3 & param1;
            if (wh.field_d <= 2) {
              break L1;
            } else {
              wh.field_d = 2;
              break L1;
            }
          }
          L2: {
            if (-3 <= (wl.field_o ^ -1)) {
              break L2;
            } else {
              wl.field_o = 2;
              break L2;
            }
          }
          return;
        }
    }

    nh(hf param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_o = -1L;
        this.field_e = -1L;
        this.field_c = 0;
        try {
            this.field_h = param0;
            dupTemp$0 = param0.a((byte) -50);
            this.field_k = dupTemp$0;
            this.field_n = dupTemp$0;
            this.field_g = new byte[param1];
            this.field_j = 0L;
            this.field_d = new byte[param2];
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "nh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        try {
            this.a(0, param0, 741, param0.length);
            int var3_int = 38 / ((param1 - 70) / 44);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "nh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_i = new qm(0, 2, 2, 1);
        field_f = "Show all lobby chat";
        field_l = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class td {
    static ai field_o;
    private long field_h;
    static String field_j;
    private long field_d;
    private byte[] field_g;
    private byte[] field_i;
    private long field_l;
    private long field_n;
    private cb field_b;
    static String[] field_f;
    private int field_a;
    private int field_c;
    private long field_k;
    static int field_p;
    private long field_e;
    static int field_m;

    final void a(long param0, int param1) throws IOException {
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        if (param1 != 0) {
            field_f = (String[]) null;
        }
        this.field_l = param0;
    }

    private final void a(byte param0) throws IOException {
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        L0: {
          var2 = -79 / ((52 - param0) / 50);
          if (0L == (this.field_d ^ -1L)) {
            break L0;
          } else {
            L1: {
              if (this.field_h == this.field_d) {
                break L1;
              } else {
                this.field_b.a(0, this.field_d);
                this.field_h = this.field_d;
                break L1;
              }
            }
            L2: {
              this.field_b.a(0, this.field_i, 494, this.field_c);
              this.field_h = this.field_h + (long)this.field_c;
              if (this.field_h > this.field_k) {
                this.field_k = this.field_h;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                var5 = -1L;
                if ((this.field_d ^ -1L) > (this.field_e ^ -1L)) {
                  break L4;
                } else {
                  if ((this.field_d ^ -1L) <= ((long)this.field_a + this.field_e ^ -1L)) {
                    break L4;
                  } else {
                    var3 = this.field_d;
                    break L3;
                  }
                }
              }
              if ((this.field_d ^ -1L) < (this.field_e ^ -1L)) {
                break L3;
              } else {
                if (this.field_d - -(long)this.field_c <= this.field_e) {
                  break L3;
                } else {
                  var3 = this.field_e;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if ((long)this.field_c + this.field_d <= this.field_e) {
                  break L6;
                } else {
                  if ((long)this.field_c + this.field_d <= this.field_e - -(long)this.field_a) {
                    var5 = (long)this.field_c + this.field_d;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if ((this.field_e + (long)this.field_a ^ -1L) >= (this.field_d ^ -1L)) {
                break L5;
              } else {
                if ((this.field_d + (long)this.field_c ^ -1L) <= ((long)this.field_a + this.field_e ^ -1L)) {
                  var5 = this.field_e + (long)this.field_a;
                  break L5;
                } else {
                  L7: {
                    if ((var3 ^ -1L) >= 0L) {
                      break L7;
                    } else {
                      if ((var3 ^ -1L) <= (var5 ^ -1L)) {
                        break L7;
                      } else {
                        var7 = (int)(-var3 + var5);
                        ug.a(this.field_i, (int)(var3 - this.field_d), this.field_g, (int)(var3 - this.field_e), var7);
                        break L7;
                      }
                    }
                  }
                  this.field_d = -1L;
                  this.field_c = 0;
                  break L0;
                }
              }
            }
            L8: {
              if ((var3 ^ -1L) >= 0L) {
                break L8;
              } else {
                if ((var3 ^ -1L) <= (var5 ^ -1L)) {
                  break L8;
                } else {
                  var7 = (int)(-var3 + var5);
                  ug.a(this.field_i, (int)(var3 - this.field_d), this.field_g, (int)(var3 - this.field_e), var7);
                  break L8;
                }
              }
            }
            this.field_d = -1L;
            this.field_c = 0;
            break L0;
          }
        }
    }

    final static int a(int param0, int param1, boolean param2) {
        if (null != bg.field_c) {
          L0: {
            if (param0 < nh.field_f) {
              break L0;
            } else {
              if (bg.field_c.field_u + nh.field_f <= param0) {
                break L0;
              } else {
                if (param1 < lf.field_Z) {
                  break L0;
                } else {
                  if (param1 >= lf.field_Z + bg.field_c.field_v) {
                    break L0;
                  } else {
                    return 0;
                  }
                }
              }
            }
          }
          L1: {
            if (param0 < qf.field_e) {
              break L1;
            } else {
              if (qf.field_e + bg.field_c.field_u <= param0) {
                break L1;
              } else {
                if (mf.field_d > param1) {
                  break L1;
                } else {
                  if (mf.field_d + bg.field_c.field_v <= param1) {
                    break L1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
          if (!param2) {
            return 95;
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final void a(int param0, int param1, boolean param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
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
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if ((long)param1 + this.field_l > this.field_n) {
                    this.field_n = (long)param1 + this.field_l;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param2) {
                    break L3;
                  } else {
                    field_j = (String) null;
                    break L3;
                  }
                }
                L4: {
                  if (0L == (this.field_d ^ -1L)) {
                    break L4;
                  } else {
                    if (this.field_l >= this.field_d) {
                      if ((this.field_l ^ -1L) >= (this.field_d + (long)this.field_c ^ -1L)) {
                        break L4;
                      } else {
                        this.a((byte) -53);
                        break L4;
                      }
                    } else {
                      this.a((byte) -53);
                      break L4;
                    }
                  }
                }
                L5: {
                  if (this.field_d == -1L) {
                    break L5;
                  } else {
                    if (this.field_d + (long)this.field_i.length >= (long)param1 + this.field_l) {
                      break L5;
                    } else {
                      var5_int = (int)((long)this.field_i.length + this.field_d + -this.field_l);
                      ug.a(param3, param0, this.field_i, (int)(-this.field_d + this.field_l), var5_int);
                      this.field_l = this.field_l + (long)var5_int;
                      param1 = param1 - var5_int;
                      param0 = param0 + var5_int;
                      this.field_c = this.field_i.length;
                      this.a((byte) 125);
                      break L5;
                    }
                  }
                }
                if (this.field_i.length < param1) {
                  L6: {
                    if ((this.field_l ^ -1L) == (this.field_h ^ -1L)) {
                      break L6;
                    } else {
                      this.field_b.a(0, this.field_l);
                      this.field_h = this.field_l;
                      break L6;
                    }
                  }
                  L7: {
                    this.field_b.a(param0, param3, 494, param1);
                    this.field_h = this.field_h + (long)param1;
                    if ((this.field_k ^ -1L) > (this.field_h ^ -1L)) {
                      this.field_k = this.field_h;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var5_long = -1L;
                      if ((this.field_e ^ -1L) < (this.field_l ^ -1L)) {
                        break L9;
                      } else {
                        if (this.field_l < (long)this.field_a + this.field_e) {
                          var5_long = this.field_l;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (this.field_l > this.field_e) {
                      break L8;
                    } else {
                      if (((long)param1 + this.field_l ^ -1L) >= (this.field_e ^ -1L)) {
                        break L8;
                      } else {
                        var5_long = this.field_e;
                        break L8;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      var7 = -1L;
                      if (this.field_e >= (long)param1 + this.field_l) {
                        break L11;
                      } else {
                        if ((this.field_e - -(long)this.field_a ^ -1L) <= ((long)param1 + this.field_l ^ -1L)) {
                          var7 = (long)param1 + this.field_l;
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    if ((this.field_e + (long)this.field_a ^ -1L) >= (this.field_l ^ -1L)) {
                      break L10;
                    } else {
                      if (((long)param1 + this.field_l ^ -1L) > ((long)this.field_a + this.field_e ^ -1L)) {
                        break L10;
                      } else {
                        var7 = (long)this.field_a + this.field_e;
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (var5_long <= -1L) {
                      break L12;
                    } else {
                      if (var5_long < var7) {
                        var9 = (int)(-var5_long + var7);
                        ug.a(param3, (int)(-this.field_l + ((long)param0 - -var5_long)), this.field_g, (int)(var5_long - this.field_e), var9);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  this.field_l = this.field_l + (long)param1;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (-1 <= (param1 ^ -1)) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L13: {
                      if (this.field_d == -1L) {
                        this.field_d = this.field_l;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      ug.a(param3, param0, this.field_i, (int)(this.field_l + -this.field_d), param1);
                      this.field_l = this.field_l + (long)param1;
                      if ((long)this.field_c >= -this.field_d + this.field_l) {
                        break L14;
                      } else {
                        this.field_c = (int)(this.field_l + -this.field_d);
                        break L14;
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
              this.field_h = -1L;
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
            stackOut_51_1 = new StringBuilder().append("td.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param3 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ')');
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
        L0: {
          this.field_a = 0;
          if ((this.field_h ^ -1L) == (this.field_l ^ -1L)) {
            break L0;
          } else {
            this.field_b.a(0, this.field_l);
            this.field_h = this.field_l;
            break L0;
          }
        }
        L1: {
          this.field_e = this.field_l;
          if (!param0) {
            break L1;
          } else {
            field_m = 126;
            break L1;
          }
        }
        L2: while (true) {
          L3: {
            if (this.field_a >= this.field_g.length) {
              break L3;
            } else {
              L4: {
                var2 = this.field_g.length + -this.field_a;
                if (var2 <= 200000000) {
                  break L4;
                } else {
                  var2 = 200000000;
                  break L4;
                }
              }
              var3 = this.field_b.a(this.field_g, this.field_a, var2, (byte) -93);
              if ((var3 ^ -1) == 0) {
                break L3;
              } else {
                this.field_a = this.field_a + var3;
                this.field_h = this.field_h + (long)var3;
                continue L2;
              }
            }
          }
          return;
        }
    }

    public static void c(int param0) {
        field_o = null;
        field_j = null;
        if (param0 != -12539) {
            return;
        }
        field_f = null;
    }

    final static void b(int param0) {
        int discarded$0 = 0;
        eh.field_j = oe.c(param0 + -35671);
        ti.field_b = new tc();
        ba.a(true, true, 2);
        if (param0 != 30000) {
            discarded$0 = td.a(105, -112, false);
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
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        try {
          L0: {
            try {
              L1: {
                if (param2 - -param3 > param1.length) {
                  throw new ArrayIndexOutOfBoundsException(param3 + param2 - param1.length);
                } else {
                  L2: {
                    if (this.field_d == -1L) {
                      break L2;
                    } else {
                      if ((this.field_d ^ -1L) < (this.field_l ^ -1L)) {
                        break L2;
                      } else {
                        if (this.field_d + (long)this.field_c < (long)param3 + this.field_l) {
                          break L2;
                        } else {
                          ug.a(this.field_i, (int)(this.field_l - this.field_d), param1, param2, param3);
                          this.field_l = this.field_l + (long)param3;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_long = this.field_l;
                    var7 = param2;
                    var8 = param3;
                    if (param0 == 0) {
                      break L3;
                    } else {
                      field_o = (ai) null;
                      break L3;
                    }
                  }
                  L4: {
                    if ((this.field_l ^ -1L) > (this.field_e ^ -1L)) {
                      break L4;
                    } else {
                      if ((this.field_l ^ -1L) <= ((long)this.field_a + this.field_e ^ -1L)) {
                        break L4;
                      } else {
                        L5: {
                          var9_int = (int)((long)this.field_a - this.field_l + this.field_e);
                          if (param3 >= var9_int) {
                            break L5;
                          } else {
                            var9_int = param3;
                            break L5;
                          }
                        }
                        ug.a(this.field_g, (int)(this.field_l - this.field_e), param1, param2, var9_int);
                        param2 = param2 + var9_int;
                        param3 = param3 - var9_int;
                        this.field_l = this.field_l + (long)var9_int;
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (this.field_g.length >= param3) {
                      if (-1 > (param3 ^ -1)) {
                        L7: {
                          this.a(false);
                          var9_int = param3;
                          if (this.field_a < var9_int) {
                            var9_int = this.field_a;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        ug.a(this.field_g, 0, param1, param2, var9_int);
                        param2 = param2 + var9_int;
                        param3 = param3 - var9_int;
                        this.field_l = this.field_l + (long)var9_int;
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      this.field_b.a(0, this.field_l);
                      this.field_h = this.field_l;
                      L8: while (true) {
                        if (param3 <= 0) {
                          break L6;
                        } else {
                          var9_int = this.field_b.a(param1, param2, param3, (byte) -109);
                          if (var9_int != -1) {
                            this.field_h = this.field_h + (long)var9_int;
                            param3 = param3 - var9_int;
                            param2 = param2 + var9_int;
                            this.field_l = this.field_l + (long)var9_int;
                            continue L8;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    if (-1L != this.field_d) {
                      L10: {
                        if ((this.field_d ^ -1L) >= (this.field_l ^ -1L)) {
                          break L10;
                        } else {
                          if (0 < param3) {
                            L11: {
                              var9_int = (int)(-this.field_l + this.field_d) + param2;
                              if (var9_int > param3 + param2) {
                                var9_int = param2 - -param3;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L12: while (true) {
                              if (var9_int <= param2) {
                                break L10;
                              } else {
                                incrementValue$1 = param2;
                                param2++;
                                param1[incrementValue$1] = (byte) 0;
                                param3--;
                                this.field_l = this.field_l + 1L;
                                continue L12;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                      L13: {
                        L14: {
                          var9 = -1L;
                          if (this.field_d < var5_long) {
                            break L14;
                          } else {
                            if ((var5_long - -(long)var8 ^ -1L) >= (this.field_d ^ -1L)) {
                              break L14;
                            } else {
                              var9 = this.field_d;
                              break L13;
                            }
                          }
                        }
                        if ((var5_long ^ -1L) > (this.field_d ^ -1L)) {
                          break L13;
                        } else {
                          if (this.field_d + (long)this.field_c > var5_long) {
                            var9 = var5_long;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L15: {
                        L16: {
                          var11 = -1L;
                          if (var5_long >= this.field_d - -(long)this.field_c) {
                            break L16;
                          } else {
                            if ((var5_long - -(long)var8 ^ -1L) <= ((long)this.field_c + this.field_d ^ -1L)) {
                              var11 = this.field_d + (long)this.field_c;
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        if (((long)var8 + var5_long ^ -1L) >= (this.field_d ^ -1L)) {
                          break L15;
                        } else {
                          if (var5_long + (long)var8 <= this.field_d - -(long)this.field_c) {
                            var11 = (long)var8 + var5_long;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (0L <= (var9 ^ -1L)) {
                        break L9;
                      } else {
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                          break L9;
                        } else {
                          var13 = (int)(-var9 + var11);
                          ug.a(this.field_i, (int)(-this.field_d + var9), param1, (int)(var9 - var5_long) + var7, var13);
                          if ((var11 ^ -1L) < (this.field_l ^ -1L)) {
                            param3 = (int)((long)param3 - (var11 + -this.field_l));
                            this.field_l = var11;
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
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_h = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if ((param3 ^ -1) >= -1) {
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
            stackOut_62_0 = (RuntimeException) (var5_ref);
            stackOut_62_1 = new StringBuilder().append("td.C(").append(param0).append(',');
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L17;
            } else {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L17;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
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
              this.a(0, param0, 0, param0.length);
              if (param1 > 11) {
                break L1;
              } else {
                this.field_g = (byte[]) null;
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
            stackOut_3_1 = new StringBuilder().append("td.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = 0;
            if (param0 < 0) {
              break L1;
            } else {
              if (65536 > param0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param0 = param0 >>> 16;
          var2 += 16;
          break L0;
        }
        L2: {
          if (param0 < 256) {
            break L2;
          } else {
            param0 = param0 >>> 8;
            var2 += 8;
            break L2;
          }
        }
        L3: {
          if (-17 < (param0 ^ -1)) {
            break L3;
          } else {
            param0 = param0 >>> 4;
            var2 += 4;
            break L3;
          }
        }
        L4: {
          if ((param0 ^ -1) > -5) {
            break L4;
          } else {
            var2 += 2;
            param0 = param0 >>> 2;
            break L4;
          }
        }
        L5: {
          if (param1 >= 23) {
            break L5;
          } else {
            field_f = (String[]) null;
            break L5;
          }
        }
        L6: {
          if (1 > param0) {
            break L6;
          } else {
            var2++;
            param0 = param0 >>> 1;
            break L6;
          }
        }
        return var2 + param0;
    }

    final long b(boolean param0) {
        if (param0) {
            return -41L;
        }
        return this.field_n;
    }

    final void a(int param0) throws IOException {
        int discarded$0 = 0;
        this.a((byte) -56);
        if (param0 < 36) {
            discarded$0 = td.a(-31, (byte) 62);
        }
        this.field_b.a(1);
    }

    td(cb param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_d = -1L;
        this.field_c = 0;
        this.field_e = -1L;
        try {
            this.field_b = param0;
            dupTemp$0 = param0.c(-38);
            this.field_k = dupTemp$0;
            this.field_n = dupTemp$0;
            this.field_i = new byte[param2];
            this.field_g = new byte[param1];
            this.field_l = 0L;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_j = "HARD";
        field_f = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}

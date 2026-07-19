/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ph {
    private long field_d;
    private int field_a;
    private ml field_b;
    static float[] field_c;
    static String field_k;
    private long field_i;
    private int field_f;
    private byte[] field_e;
    static float[] field_n;
    private byte[] field_h;
    private long field_m;
    private long field_g;
    private long field_j;
    private long field_l;

    private final void a(byte param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param0 == -16) {
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_l != -1L) {
            L2: {
              if (this.field_j == this.field_l) {
                break L2;
              } else {
                this.field_b.a(param0 ^ -16, this.field_l);
                this.field_j = this.field_l;
                break L2;
              }
            }
            L3: {
              this.field_b.a(0, 0, this.field_f, this.field_e);
              this.field_j = this.field_j + (long)this.field_f;
              if ((this.field_j ^ -1L) >= (this.field_i ^ -1L)) {
                break L3;
              } else {
                this.field_i = this.field_j;
                break L3;
              }
            }
            L4: {
              L5: {
                L6: {
                  var2 = -1L;
                  var4 = -1L;
                  if (this.field_l < this.field_m) {
                    break L6;
                  } else {
                    if ((this.field_m - -(long)this.field_a ^ -1L) < (this.field_l ^ -1L)) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (this.field_l > this.field_m) {
                  break L4;
                } else {
                  if (((long)this.field_f + this.field_l ^ -1L) >= (this.field_m ^ -1L)) {
                    break L4;
                  } else {
                    var2 = this.field_m;
                    if (var7 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var2 = this.field_l;
              break L4;
            }
            L7: {
              L8: {
                L9: {
                  if ((this.field_l - -(long)this.field_f ^ -1L) >= (this.field_m ^ -1L)) {
                    break L9;
                  } else {
                    if (this.field_l - -(long)this.field_f <= this.field_m - -(long)this.field_a) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if ((long)this.field_a + this.field_m <= this.field_l) {
                  break L7;
                } else {
                  if (((long)this.field_a + this.field_m ^ -1L) < ((long)this.field_f + this.field_l ^ -1L)) {
                    break L7;
                  } else {
                    var4 = this.field_m + (long)this.field_a;
                    if (var7 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              var4 = (long)this.field_f + this.field_l;
              break L7;
            }
            L10: {
              if (0L <= (var2 ^ -1L)) {
                break L10;
              } else {
                if ((var4 ^ -1L) >= (var2 ^ -1L)) {
                  break L10;
                } else {
                  var6 = (int)(var4 - var2);
                  lua.a(this.field_e, (int)(-this.field_l + var2), this.field_h, (int)(-this.field_m + var2), var6);
                  break L10;
                }
              }
            }
            this.field_f = 0;
            this.field_l = -1L;
            break L1;
          } else {
            break L1;
          }
        }
    }

    final void b(byte param0) throws IOException {
        this.a((byte) -16);
        this.field_b.b((byte) -127);
        if (param0 >= -14) {
            ph.a(false);
        }
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          this.field_a = 0;
          if (this.field_g != this.field_j) {
            this.field_b.a(0, this.field_g);
            this.field_j = this.field_g;
            break L0;
          } else {
            break L0;
          }
        }
        this.field_m = this.field_g;
        L1: while (true) {
          L2: {
            L3: {
              if (this.field_a >= this.field_h.length) {
                break L3;
              } else {
                var2 = this.field_h.length + -this.field_a;
                stackOut_5_0 = var2 ^ -1;
                stackOut_5_1 = -200000001;
                stackIn_12_0 = stackOut_5_0;
                stackIn_12_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (var4 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_6_0 >= stackIn_6_1) {
                      break L4;
                    } else {
                      var2 = 200000000;
                      break L4;
                    }
                  }
                  var3 = this.field_b.a((byte) 69, this.field_h, var2, this.field_a);
                  if (-1 == var3) {
                    break L3;
                  } else {
                    this.field_j = this.field_j + (long)var3;
                    this.field_a = this.field_a + var3;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            stackOut_11_0 = param0;
            stackOut_11_1 = -1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L2;
          }
          L5: {
            if (stackIn_12_0 == stackIn_12_1) {
              break L5;
            } else {
              ph.a(false);
              break L5;
            }
          }
          return;
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
            this.a(param0, param0.length, param1, (byte) -112);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ph.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final long b(boolean param0) {
        if (!param0) {
            return -88L;
        }
        return this.field_d;
    }

    public static void a(boolean param0) {
        field_n = null;
        field_k = null;
        field_c = null;
        if (!param0) {
            ph.a(false);
        }
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
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
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (this.field_g - -(long)param3 > this.field_d) {
                    this.field_d = (long)param3 + this.field_g;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-1L == this.field_l) {
                    break L3;
                  } else {
                    L4: {
                      if ((this.field_g ^ -1L) > (this.field_l ^ -1L)) {
                        break L4;
                      } else {
                        if (((long)this.field_f + this.field_l ^ -1L) <= (this.field_g ^ -1L)) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.a((byte) -16);
                    break L3;
                  }
                }
                L5: {
                  if ((this.field_l ^ -1L) == 0L) {
                    break L5;
                  } else {
                    if ((this.field_l - -(long)this.field_e.length ^ -1L) > ((long)param3 + this.field_g ^ -1L)) {
                      var5_int = (int)((long)this.field_e.length - (-this.field_l + this.field_g));
                      lua.a(param0, param1, this.field_e, (int)(this.field_g - this.field_l), var5_int);
                      this.field_g = this.field_g + (long)var5_int;
                      param1 = param1 + var5_int;
                      param3 = param3 - var5_int;
                      this.field_f = this.field_e.length;
                      this.a((byte) -16);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                if (this.field_e.length >= param3) {
                  if (-1 > (param3 ^ -1)) {
                    L6: {
                      if (this.field_l != -1L) {
                        break L6;
                      } else {
                        this.field_l = this.field_g;
                        break L6;
                      }
                    }
                    L7: {
                      lua.a(param0, param1, this.field_e, (int)(-this.field_l + this.field_g), param3);
                      this.field_g = this.field_g + (long)param3;
                      if ((-this.field_l + this.field_g ^ -1L) >= ((long)this.field_f ^ -1L)) {
                        break L7;
                      } else {
                        this.field_f = (int)(this.field_g + -this.field_l);
                        break L7;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L8: {
                      if (param2 == -17) {
                        break L8;
                      } else {
                        this.field_b = (ml) null;
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                } else {
                  L9: {
                    if (this.field_g != this.field_j) {
                      this.field_b.a(0, this.field_g);
                      this.field_j = this.field_g;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    this.field_b.a(param1, 0, param3, param0);
                    this.field_j = this.field_j + (long)param3;
                    if ((this.field_i ^ -1L) <= (this.field_j ^ -1L)) {
                      break L10;
                    } else {
                      this.field_i = this.field_j;
                      break L10;
                    }
                  }
                  L11: {
                    L12: {
                      var5_long = -1L;
                      var7 = -1L;
                      if (this.field_g < this.field_m) {
                        break L12;
                      } else {
                        if ((this.field_m - -(long)this.field_a ^ -1L) >= (this.field_g ^ -1L)) {
                          break L12;
                        } else {
                          var5_long = this.field_g;
                          if (var10 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    if (this.field_m < this.field_g) {
                      break L11;
                    } else {
                      if ((this.field_m ^ -1L) > (this.field_g + (long)param3 ^ -1L)) {
                        var5_long = this.field_m;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if ((this.field_m ^ -1L) <= ((long)param3 + this.field_g ^ -1L)) {
                        break L14;
                      } else {
                        if ((this.field_m + (long)this.field_a ^ -1L) > ((long)param3 + this.field_g ^ -1L)) {
                          break L14;
                        } else {
                          var7 = this.field_g - -(long)param3;
                          if (var10 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    if (((long)this.field_a + this.field_m ^ -1L) >= (this.field_g ^ -1L)) {
                      break L13;
                    } else {
                      if (((long)param3 + this.field_g ^ -1L) <= ((long)this.field_a + this.field_m ^ -1L)) {
                        var7 = this.field_m - -(long)this.field_a;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if ((var5_long ^ -1L) >= 0L) {
                      break L15;
                    } else {
                      if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
                        break L15;
                      } else {
                        var9 = (int)(var7 + -var5_long);
                        lua.a(param0, (int)((long)param1 + (var5_long - this.field_g)), this.field_h, (int)(-this.field_m + var5_long), var9);
                        break L15;
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
              this.field_j = -1L;
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
            stackOut_50_1 = new StringBuilder().append("ph.C(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if ((param1 + param2 ^ -1) >= (param0.length ^ -1)) {
                  L2: {
                    if ((this.field_l ^ -1L) == 0L) {
                      break L2;
                    } else {
                      if ((this.field_g ^ -1L) > (this.field_l ^ -1L)) {
                        break L2;
                      } else {
                        if ((this.field_l + (long)this.field_f ^ -1L) <= ((long)param1 + this.field_g ^ -1L)) {
                          lua.a(this.field_e, (int)(-this.field_l + this.field_g), param0, param2, param1);
                          this.field_g = this.field_g + (long)param1;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param3 <= -22) {
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    var5_long = this.field_g;
                    var7 = param2;
                    var8 = param1;
                    if (this.field_m > this.field_g) {
                      break L4;
                    } else {
                      if (this.field_g >= this.field_m + (long)this.field_a) {
                        break L4;
                      } else {
                        L5: {
                          var9_int = (int)(-this.field_g - -this.field_m + (long)this.field_a);
                          if (var9_int <= param1) {
                            break L5;
                          } else {
                            var9_int = param1;
                            break L5;
                          }
                        }
                        lua.a(this.field_h, (int)(-this.field_m + this.field_g), param0, param2, var9_int);
                        this.field_g = this.field_g + (long)var9_int;
                        param2 = param2 + var9_int;
                        param1 = param1 - var9_int;
                        break L4;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      L8: {
                        if ((this.field_h.length ^ -1) > (param1 ^ -1)) {
                          break L8;
                        } else {
                          if (param1 > 0) {
                            L9: {
                              this.a(-1);
                              var9_int = param1;
                              if (this.field_a < var9_int) {
                                var9_int = this.field_a;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            lua.a(this.field_h, 0, param0, param2, var9_int);
                            param2 = param2 + var9_int;
                            param1 = param1 - var9_int;
                            this.field_g = this.field_g + (long)var9_int;
                            if (var14 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      this.field_b.a(0, this.field_g);
                      this.field_j = this.field_g;
                      L10: while (true) {
                        if (param1 <= 0) {
                          break L7;
                        } else {
                          var9_int = this.field_b.a((byte) 80, param0, param1, param2);
                          stackOut_25_0 = var9_int;
                          stackOut_25_1 = -1;
                          stackIn_63_0 = stackOut_25_0;
                          stackIn_63_1 = stackOut_25_1;
                          stackIn_26_0 = stackOut_25_0;
                          stackIn_26_1 = stackOut_25_1;
                          if (var14 != 0) {
                            break L6;
                          } else {
                            if (stackIn_26_0 == stackIn_26_1) {
                              break L7;
                            } else {
                              param2 = param2 + var9_int;
                              this.field_j = this.field_j + (long)var9_int;
                              this.field_g = this.field_g + (long)var9_int;
                              param1 = param1 - var9_int;
                              if (var14 == 0) {
                                continue L10;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                    L11: {
                      if (this.field_l != -1L) {
                        L12: {
                          L13: {
                            if (this.field_g >= this.field_l) {
                              break L13;
                            } else {
                              if (param1 > 0) {
                                L14: {
                                  var9_int = param2 - -(int)(this.field_l - this.field_g);
                                  if (param1 + param2 >= var9_int) {
                                    break L14;
                                  } else {
                                    var9_int = param2 - -param1;
                                    break L14;
                                  }
                                }
                                L15: while (true) {
                                  if (var9_int <= param2) {
                                    break L13;
                                  } else {
                                    incrementValue$1 = param2;
                                    param2++;
                                    param0[incrementValue$1] = (byte) 0;
                                    param1--;
                                    this.field_g = this.field_g + 1L;
                                    if (var14 != 0) {
                                      break L12;
                                    } else {
                                      if (var14 == 0) {
                                        continue L15;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L13;
                              }
                            }
                          }
                          L16: {
                            L17: {
                              L18: {
                                var9 = -1L;
                                var11 = -1L;
                                if (var5_long > this.field_l) {
                                  break L18;
                                } else {
                                  if ((this.field_l ^ -1L) > (var5_long + (long)var8 ^ -1L)) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              if (var5_long < this.field_l) {
                                break L16;
                              } else {
                                if ((var5_long ^ -1L) > ((long)this.field_f + this.field_l ^ -1L)) {
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
                            var9 = this.field_l;
                            break L16;
                          }
                          L19: {
                            L20: {
                              if (var5_long >= this.field_l - -(long)this.field_f) {
                                break L20;
                              } else {
                                if (((long)var8 + var5_long ^ -1L) > ((long)this.field_f + this.field_l ^ -1L)) {
                                  break L20;
                                } else {
                                  var11 = (long)this.field_f + this.field_l;
                                  if (var14 == 0) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            if (var5_long + (long)var8 <= this.field_l) {
                              break L19;
                            } else {
                              if (((long)this.field_f + this.field_l ^ -1L) <= (var5_long + (long)var8 ^ -1L)) {
                                var11 = var5_long - -(long)var8;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                          }
                          if (-1L >= var9) {
                            break L12;
                          } else {
                            if ((var9 ^ -1L) > (var11 ^ -1L)) {
                              var13 = (int)(var11 + -var9);
                              lua.a(this.field_e, (int)(-this.field_l + var9), param0, var7 - -(int)(-var5_long + var9), var13);
                              if (this.field_g >= var11) {
                                break L12;
                              } else {
                                param1 = (int)((long)param1 - (var11 + -this.field_g));
                                this.field_g = var11;
                                break L12;
                              }
                            } else {
                              break L11;
                            }
                          }
                        }
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    stackOut_62_0 = 0;
                    stackOut_62_1 = param1;
                    stackIn_63_0 = stackOut_62_0;
                    stackIn_63_1 = stackOut_62_1;
                    break L6;
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  throw new ArrayIndexOutOfBoundsException(param1 + param2 + -param0.length);
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_j = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              if (stackIn_63_0 < stackIn_63_1) {
                throw new EOFException();
              } else {
                decompiledRegionSelector1 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L21: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) (var5_ref);
            stackOut_67_1 = new StringBuilder().append("ph.A(");
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L21;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    ph(ml param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_m = -1L;
        this.field_l = -1L;
        this.field_f = 0;
        try {
            this.field_b = param0;
            dupTemp$0 = param0.a(false);
            this.field_i = dupTemp$0;
            this.field_d = dupTemp$0;
            this.field_g = 0L;
            this.field_e = new byte[param2];
            this.field_h = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ph.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, long param1) throws IOException {
        if (!(param1 >= 0L)) {
            throw new IOException();
        }
        this.field_g = param1;
        int var4 = -100 % ((param0 - -58) / 50);
    }

    static {
        int var2 = 0;
        field_c = new float[16384];
        field_k = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_n = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
            field_n[var2] = (float)Math.sin(var0 * (double)var2);
            field_c[var2] = (float)Math.cos(var0 * (double)var2);
        }
    }
}

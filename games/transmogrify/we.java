/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class we {
    private long field_g;
    private int field_a;
    private byte[] field_e;
    private long field_c;
    private long field_i;
    private di field_k;
    static String field_b;
    private int field_m;
    private long field_f;
    static dk field_j;
    private long field_n;
    static nf[] field_l;
    private byte[] field_d;
    private long field_h;

    final void a(long param0, byte param1) throws IOException {
        if (-1L < (param0 ^ -1L)) {
          throw new IOException();
        } else {
          if (param1 > -119) {
            return;
          } else {
            this.field_f = param0;
            return;
          }
        }
    }

    final void a(byte param0) throws IOException {
        if (param0 > -24) {
            return;
        }
        this.a(false);
        this.field_k.a(false);
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int[] param8, byte param9, int param10) {
        String discarded$3 = null;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var20 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param9 == -53) {
                break L1;
              } else {
                discarded$3 = we.a(false, true, -95, true);
                break L1;
              }
            }
            var11_int = 16711935 & param1;
            var12 = 65280 & param1;
            var13 = -param2;
            L2: while (true) {
              L3: {
                if ((var13 ^ -1) <= -1) {
                  break L3;
                } else {
                  if (var20 != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var14 = -param6;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var14 >= 0) {
                            break L6;
                          } else {
                            incrementValue$4 = param0;
                            param0++;
                            param7 = param3[incrementValue$4];
                            stackOut_8_0 = 0;
                            stackOut_8_1 = param7;
                            stackIn_15_0 = stackOut_8_0;
                            stackIn_15_1 = stackOut_8_1;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            if (var20 != 0) {
                              break L5;
                            } else {
                              L7: {
                                if (stackIn_9_0 != stackIn_9_1) {
                                  var15 = param7 & 255;
                                  var16 = -var15 + 256;
                                  var17 = param8[param10];
                                  var18 = var17 & 16711935;
                                  var19 = var17 & 65280;
                                  incrementValue$5 = param10;
                                  param10++;
                                  param8[incrementValue$5] = cl.b(vg.c(16711708, var19 * var16 + var12 * var15) >> 1660158088, vg.c(var15 * var11_int + var18 * var16 >> -1652834968, 16711935));
                                  if (var20 == 0) {
                                    break L7;
                                  } else {
                                    param10++;
                                    break L7;
                                  }
                                } else {
                                  param10++;
                                  break L7;
                                }
                              }
                              var14++;
                              if (var20 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        param0 = param0 + param4;
                        stackOut_14_0 = param10;
                        stackOut_14_1 = param5;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        break L5;
                      }
                      param10 = stackIn_15_0 + stackIn_15_1;
                      var13++;
                      if (var20 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var11 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var11);
            stackOut_17_1 = new StringBuilder().append("we.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          L9: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param8 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param9 + ',' + param10 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        if (param0 != -11509) {
            we.a(45);
        }
        field_b = null;
    }

    final long b(byte param0) {
        if (param0 != 36) {
            return 67L;
        }
        return this.field_n;
    }

    private final void b(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        di stackIn_10_0 = null;
        byte[] stackIn_10_1 = null;
        di stackIn_11_0 = null;
        byte[] stackIn_11_1 = null;
        di stackIn_12_0 = null;
        byte[] stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        di stackOut_9_0 = null;
        byte[] stackOut_9_1 = null;
        di stackOut_11_0 = null;
        byte[] stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        di stackOut_10_0 = null;
        byte[] stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        this.field_a = 0;
        if (param0) {
          return;
        } else {
          L0: {
            if ((this.field_f ^ -1L) != (this.field_i ^ -1L)) {
              this.field_k.a(false, this.field_f);
              this.field_i = this.field_f;
              break L0;
            } else {
              break L0;
            }
          }
          this.field_h = this.field_f;
          L1: while (true) {
            L2: {
              if (this.field_a >= this.field_e.length) {
                break L2;
              } else {
                var2 = -this.field_a + this.field_e.length;
                if (var4 != 0) {
                  break L2;
                } else {
                  L3: {
                    if (200000000 >= var2) {
                      break L3;
                    } else {
                      var2 = 200000000;
                      break L3;
                    }
                  }
                  L4: {
                    stackOut_9_0 = this.field_k;
                    stackOut_9_1 = this.field_e;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (param0) {
                      stackOut_11_0 = (di) ((Object) stackIn_11_0);
                      stackOut_11_1 = (byte[]) ((Object) stackIn_11_1);
                      stackOut_11_2 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      break L4;
                    } else {
                      stackOut_10_0 = (di) ((Object) stackIn_10_0);
                      stackOut_10_1 = (byte[]) ((Object) stackIn_10_1);
                      stackOut_10_2 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      break L4;
                    }
                  }
                  L5: {
                    var3 = ((di) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2 != 0, var2, this.field_a);
                    if (0 != (var3 ^ -1)) {
                      break L5;
                    } else {
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  this.field_i = this.field_i + (long)var3;
                  this.field_a = this.field_a + var3;
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
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (param1) {
            var4 += 4;
        }
        if (param2 >= -79) {
            field_b = (String) null;
        }
        if (!(!param3)) {
            var4 += 2;
        }
        if (param0) {
            var4++;
        }
        return og.field_c[var4];
    }

    final static ti[] a(int param0, int param1, int param2, int param3) {
        if (param1 <= 110) {
            we.a(49);
        }
        return ad.a(param0, param3, param2, 127, 1);
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (this.field_n < this.field_f + (long)param1) {
                    this.field_n = this.field_f + (long)param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (this.field_c == -1L) {
                    break L3;
                  } else {
                    L4: {
                      if (this.field_c > this.field_f) {
                        break L4;
                      } else {
                        if ((this.field_c + (long)this.field_m ^ -1L) > (this.field_f ^ -1L)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.a(false);
                    break L3;
                  }
                }
                L5: {
                  if (param2 > 52) {
                    break L5;
                  } else {
                    we.a(48);
                    break L5;
                  }
                }
                L6: {
                  if (-1L == this.field_c) {
                    break L6;
                  } else {
                    if (this.field_f - -(long)param1 > this.field_c + (long)this.field_d.length) {
                      var5_int = (int)(-this.field_f + (this.field_c + (long)this.field_d.length));
                      ji.a(param0, param3, this.field_d, (int)(-this.field_c + this.field_f), var5_int);
                      param1 = param1 - var5_int;
                      this.field_f = this.field_f + (long)var5_int;
                      param3 = param3 + var5_int;
                      this.field_m = this.field_d.length;
                      this.a(false);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                if (this.field_d.length < param1) {
                  L7: {
                    if ((this.field_i ^ -1L) == (this.field_f ^ -1L)) {
                      break L7;
                    } else {
                      this.field_k.a(false, this.field_f);
                      this.field_i = this.field_f;
                      break L7;
                    }
                  }
                  L8: {
                    this.field_k.a((byte) 63, param0, param1, param3);
                    this.field_i = this.field_i + (long)param1;
                    if ((this.field_i ^ -1L) >= (this.field_g ^ -1L)) {
                      break L8;
                    } else {
                      this.field_g = this.field_i;
                      break L8;
                    }
                  }
                  L9: {
                    L10: {
                      L11: {
                        var5_long = -1L;
                        var7 = -1L;
                        if (this.field_h > this.field_f) {
                          break L11;
                        } else {
                          if ((long)this.field_a + this.field_h > this.field_f) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if ((this.field_f ^ -1L) < (this.field_h ^ -1L)) {
                        break L9;
                      } else {
                        if (((long)param1 + this.field_f ^ -1L) < (this.field_h ^ -1L)) {
                          var5_long = this.field_h;
                          if (var10 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        } else {
                          break L9;
                        }
                      }
                    }
                    var5_long = this.field_f;
                    break L9;
                  }
                  L12: {
                    L13: {
                      L14: {
                        if (this.field_f - -(long)param1 <= this.field_h) {
                          break L14;
                        } else {
                          if ((long)this.field_a + this.field_h >= this.field_f + (long)param1) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if ((long)this.field_a + this.field_h <= this.field_f) {
                        break L12;
                      } else {
                        if (((long)param1 + this.field_f ^ -1L) > ((long)this.field_a + this.field_h ^ -1L)) {
                          break L12;
                        } else {
                          var7 = this.field_h + (long)this.field_a;
                          if (var10 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    var7 = this.field_f - -(long)param1;
                    break L12;
                  }
                  L15: {
                    if ((var5_long ^ -1L) >= 0L) {
                      break L15;
                    } else {
                      if ((var7 ^ -1L) < (var5_long ^ -1L)) {
                        var9 = (int)(-var5_long + var7);
                        ji.a(param0, (int)(-this.field_f + (var5_long + (long)param3)), this.field_e, (int)(var5_long - this.field_h), var9);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  this.field_f = this.field_f + (long)param1;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  if (-1 <= (param1 ^ -1)) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L16: {
                      if (-1L != this.field_c) {
                        break L16;
                      } else {
                        this.field_c = this.field_f;
                        break L16;
                      }
                    }
                    L17: {
                      ji.a(param0, param3, this.field_d, (int)(this.field_f - this.field_c), param1);
                      this.field_f = this.field_f + (long)param1;
                      if (-this.field_c + this.field_f > (long)this.field_m) {
                        this.field_m = (int)(-this.field_c + this.field_f);
                        break L17;
                      } else {
                        break L17;
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
          L18: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) (var5_ref);
            stackOut_52_1 = new StringBuilder().append("we.F(");
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param0 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L18;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L18;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        if (!param0) {
          L0: {
            if (0L == (this.field_c ^ -1L)) {
              break L0;
            } else {
              L1: {
                if ((this.field_i ^ -1L) == (this.field_c ^ -1L)) {
                  break L1;
                } else {
                  this.field_k.a(false, this.field_c);
                  this.field_i = this.field_c;
                  break L1;
                }
              }
              L2: {
                this.field_k.a((byte) 71, this.field_d, this.field_m, 0);
                this.field_i = this.field_i + (long)this.field_m;
                if ((this.field_i ^ -1L) >= (this.field_g ^ -1L)) {
                  break L2;
                } else {
                  this.field_g = this.field_i;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = -1L;
                  var4 = -1L;
                  if (this.field_h > this.field_c) {
                    break L4;
                  } else {
                    if (this.field_h - -(long)this.field_a <= this.field_c) {
                      break L4;
                    } else {
                      var2 = this.field_c;
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (this.field_c > this.field_h) {
                  break L3;
                } else {
                  if ((this.field_h ^ -1L) <= ((long)this.field_m + this.field_c ^ -1L)) {
                    break L3;
                  } else {
                    var2 = this.field_h;
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  L7: {
                    if ((long)this.field_m + this.field_c <= this.field_h) {
                      break L7;
                    } else {
                      if ((long)this.field_a + this.field_h >= (long)this.field_m + this.field_c) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if ((this.field_c ^ -1L) <= ((long)this.field_a + this.field_h ^ -1L)) {
                    break L5;
                  } else {
                    if (((long)this.field_m + this.field_c ^ -1L) <= ((long)this.field_a + this.field_h ^ -1L)) {
                      var4 = (long)this.field_a + this.field_h;
                      if (var7 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    } else {
                      L8: {
                        if (var2 <= -1L) {
                          break L8;
                        } else {
                          if (var4 <= var2) {
                            break L8;
                          } else {
                            var6 = (int)(var4 - var2);
                            ji.a(this.field_d, (int)(-this.field_c + var2), this.field_e, (int)(-this.field_h + var2), var6);
                            break L8;
                          }
                        }
                      }
                      this.field_c = -1L;
                      this.field_m = 0;
                      break L0;
                    }
                  }
                }
                var4 = this.field_c - -(long)this.field_m;
                break L5;
              }
              L9: {
                if (var2 <= -1L) {
                  break L9;
                } else {
                  if (var4 <= var2) {
                    break L9;
                  } else {
                    var6 = (int)(var4 - var2);
                    ji.a(this.field_d, (int)(-this.field_c + var2), this.field_e, (int)(-this.field_h + var2), var6);
                    break L9;
                  }
                }
              }
              this.field_c = -1L;
              this.field_m = 0;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
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
        int stackIn_31_0 = 0;
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
        int stackOut_25_0 = 0;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var14 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (param2.length >= param1 + param0) {
                  L2: {
                    if (-1L == this.field_c) {
                      break L2;
                    } else {
                      if ((this.field_c ^ -1L) < (this.field_f ^ -1L)) {
                        break L2;
                      } else {
                        if (this.field_c + (long)this.field_m >= this.field_f - -(long)param1) {
                          ji.a(this.field_d, (int)(-this.field_c + this.field_f), param2, param0, param1);
                          this.field_f = this.field_f + (long)param1;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var5_long = this.field_f;
                  var7 = param0;
                  if (param3 == 0) {
                    L3: {
                      var8 = param1;
                      if ((this.field_f ^ -1L) > (this.field_h ^ -1L)) {
                        break L3;
                      } else {
                        if ((long)this.field_a + this.field_h <= this.field_f) {
                          break L3;
                        } else {
                          L4: {
                            var9_int = (int)((long)this.field_a + (this.field_h + -this.field_f));
                            if (var9_int > param1) {
                              var9_int = param1;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ji.a(this.field_e, (int)(-this.field_h + this.field_f), param2, param0, var9_int);
                          param0 = param0 + var9_int;
                          this.field_f = this.field_f + (long)var9_int;
                          param1 = param1 - var9_int;
                          break L3;
                        }
                      }
                    }
                    L5: {
                      L6: {
                        L7: {
                          if (this.field_e.length < param1) {
                            break L7;
                          } else {
                            if ((param1 ^ -1) >= -1) {
                              break L6;
                            } else {
                              L8: {
                                this.b(false);
                                var9_int = param1;
                                if (var9_int > this.field_a) {
                                  var9_int = this.field_a;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              ji.a(this.field_e, 0, param2, param0, var9_int);
                              param1 = param1 - var9_int;
                              this.field_f = this.field_f + (long)var9_int;
                              param0 = param0 + var9_int;
                              if (var14 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        this.field_k.a(false, this.field_f);
                        this.field_i = this.field_f;
                        L9: while (true) {
                          if ((param1 ^ -1) >= -1) {
                            break L6;
                          } else {
                            var9_int = this.field_k.a(param2, true, param1, param0);
                            stackOut_25_0 = var9_int ^ -1;
                            stackIn_31_0 = stackOut_25_0;
                            stackIn_26_0 = stackOut_25_0;
                            if (var14 != 0) {
                              break L5;
                            } else {
                              L10: {
                                if (stackIn_26_0 != 0) {
                                  break L10;
                                } else {
                                  if (var14 == 0) {
                                    break L6;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              param0 = param0 + var9_int;
                              this.field_f = this.field_f + (long)var9_int;
                              this.field_i = this.field_i + (long)var9_int;
                              param1 = param1 - var9_int;
                              if (var14 == 0) {
                                continue L9;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      stackOut_30_0 = (-1L < this.field_c ? -1 : (-1L == this.field_c ? 0 : 1));
                      stackIn_31_0 = stackOut_30_0;
                      break L5;
                    }
                    L11: {
                      if (stackIn_31_0 == 0) {
                        break L11;
                      } else {
                        L12: {
                          if (this.field_f >= this.field_c) {
                            break L12;
                          } else {
                            if (param1 <= 0) {
                              break L12;
                            } else {
                              L13: {
                                var9_int = (int)(-this.field_f + this.field_c) + param0;
                                if (var9_int <= param0 - -param1) {
                                  break L13;
                                } else {
                                  var9_int = param0 + param1;
                                  break L13;
                                }
                              }
                              L14: while (true) {
                                if (param0 >= var9_int) {
                                  break L12;
                                } else {
                                  param1--;
                                  incrementValue$1 = param0;
                                  param0++;
                                  param2[incrementValue$1] = (byte) 0;
                                  this.field_f = this.field_f + 1L;
                                  if (var14 != 0) {
                                    break L11;
                                  } else {
                                    continue L14;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L15: {
                          L16: {
                            L17: {
                              var9 = -1L;
                              if (var5_long > this.field_c) {
                                break L17;
                              } else {
                                if (this.field_c < (long)var8 + var5_long) {
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            if (this.field_c > var5_long) {
                              break L15;
                            } else {
                              if (this.field_c - -(long)this.field_m <= var5_long) {
                                break L15;
                              } else {
                                var9 = var5_long;
                                if (var14 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          var9 = this.field_c;
                          break L15;
                        }
                        L18: {
                          L19: {
                            L20: {
                              var11 = -1L;
                              if ((long)this.field_m + this.field_c <= var5_long) {
                                break L20;
                              } else {
                                if ((this.field_c - -(long)this.field_m ^ -1L) >= (var5_long - -(long)var8 ^ -1L)) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            if (this.field_c >= var5_long + (long)var8) {
                              break L18;
                            } else {
                              if ((long)var8 + var5_long > (long)this.field_m + this.field_c) {
                                break L18;
                              } else {
                                var11 = var5_long - -(long)var8;
                                if (var14 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                          var11 = (long)this.field_m + this.field_c;
                          break L18;
                        }
                        if (0L <= (var9 ^ -1L)) {
                          break L11;
                        } else {
                          if ((var9 ^ -1L) <= (var11 ^ -1L)) {
                            break L11;
                          } else {
                            var13 = (int)(var11 + -var9);
                            ji.a(this.field_d, (int)(var9 + -this.field_c), param2, (int)(-var5_long + var9) + var7, var13);
                            if ((var11 ^ -1L) < (this.field_f ^ -1L)) {
                              param1 = (int)((long)param1 - (var11 + -this.field_f));
                              this.field_f = var11;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                } else {
                  throw new ArrayIndexOutOfBoundsException(param1 + param0 - param2.length);
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
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 2;
                break L0;
              } else {
                if (-1 > (param1 ^ -1)) {
                  throw new EOFException();
                } else {
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L21: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) (var5_ref);
            stackOut_65_1 = new StringBuilder().append("we.D(").append(param0).append(',').append(param1).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param2 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L21;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L21;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param3 + ')');
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

    final void a(byte[] param0, int param1) throws IOException {
        ti[] discarded$0 = null;
        try {
            if (param1 != 16711708) {
                discarded$0 = we.a(-44, -9, 23, -38);
            }
            this.a(0, param0.length, param0, (byte) 0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "we.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    we(di param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_c = -1L;
        this.field_m = 0;
        this.field_h = -1L;
        try {
            this.field_k = param0;
            dupTemp$0 = param0.a(16);
            this.field_g = dupTemp$0;
            this.field_n = dupTemp$0;
            this.field_d = new byte[param2];
            this.field_f = 0L;
            this.field_e = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Log in / Create account";
    }
}

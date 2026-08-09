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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
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
        int statePc = 0;
        Throwable caughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param9 == -53) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        we.a(false, true, -95, true);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var11_int = 16711935 & param1;
                        var12 = 65280 & param1;
                        var13 = -param2;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var13 ^ -1) <= -1) {
                            statePc = 24;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var20 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var14 = -param6;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var14 >= 0) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        incrementValue$0 = param0;
                        param0++;
                        param7 = param3[incrementValue$0];
                        stackIn_15_0 = 0;
                        stackIn_9_0 = stackIn_15_0;
                        stackIn_15_1 = param7;
                        stackIn_9_1 = stackIn_15_1;
                        if (var20 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 != stackIn_9_1) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param10++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var15 = param7 & 255;
                        var16 = -var15 + 256;
                        var17 = param8[param10];
                        var18 = var17 & 16711935;
                        var19 = var17 & 65280;
                        incrementValue$1 = param10;
                        param10++;
                        param8[incrementValue$1] = cl.b(vg.c(16711708, var19 * var16 + var12 * var15) >> 1660158088, vg.c(var15 * var11_int + var18 * var16 >> -1652834968, 16711935));
                        if (var20 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        param10++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var14++;
                        if (var20 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        param0 = param0 + param4;
                        stackIn_15_0 = param10;
                        stackIn_15_1 = param5;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        param10 = stackIn_15_0 + stackIn_15_1;
                        var13++;
                        if (var20 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var11 = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (var11);
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("we.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_18_1 = stackIn_19_1;
                    if (param3 == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
                    stackIn_21_1 = stackIn_22_1;
                    if (param8 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param9 + ',' + param10 + ')');
                }
                case 24: {
                    return;
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        int var2;
        int var3;
        int var4;
        di stackIn_11_0 = null;
        byte[] stackIn_11_1 = null;
        di stackIn_12_0 = null;
        byte[] stackIn_12_1 = null;
        int stackIn_12_2 = 0;
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
                    stackIn_11_0 = this.field_k;

                    stackIn_11_1 = this.field_e;

                    if (param0) {
                      stackIn_12_0 = (di) ((Object) stackIn_11_0);
                      stackIn_12_1 = (byte[]) ((Object) stackIn_11_1);
                      stackIn_12_2 = 0;
                      break L4;
                    } else {
                      stackIn_12_0 = (di) ((Object) stackIn_11_0);
                      stackIn_12_1 = (byte[]) ((Object) stackIn_11_1);
                      stackIn_12_2 = 1;
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
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
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
            stackIn_54_0 = (RuntimeException) (var5_ref);

            stackIn_54_1 = new StringBuilder().append("we.F(");

            if (param0 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L18;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
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
        long var2;
        long var4;
        int var6;
        int var7;
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
        int incrementValue$0 = 0;
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
        int statePc = 0;
        Throwable caughtException = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2.length >= param1 + param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = ((Object) stateCaught_1 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param1 + param0 - param2.length);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1L == this.field_c) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((this.field_c ^ -1L) < (this.field_f ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_c + (long)this.field_m >= this.field_f - -(long)param1) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ji.a(this.field_d, (int)(-this.field_c + this.field_f), param2, param0, param1);
                        this.field_f = this.field_f + (long)param1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var5_long = this.field_f;
                        var7 = param0;
                        if (param3 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        var8 = param1;
                        if ((this.field_f ^ -1L) > (this.field_h ^ -1L)) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = ((Object) stateCaught_11 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((long)this.field_a + this.field_h <= this.field_f) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = ((Object) stateCaught_12 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9_int = (int)((long)this.field_a + (this.field_h + -this.field_f));
                        if (var9_int > param1) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = ((Object) stateCaught_13 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = ((Object) stateCaught_14 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9_int = param1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = ((Object) stateCaught_15 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ji.a(this.field_e, (int)(-this.field_h + this.field_f), param2, param0, var9_int);
                        param0 = param0 + var9_int;
                        this.field_f = this.field_f + (long)var9_int;
                        param1 = param1 - var9_int;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = ((Object) stateCaught_16 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (this.field_e.length < param1) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = ((Object) stateCaught_17 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((param1 ^ -1) >= -1) {
                            statePc = 30;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = ((Object) stateCaught_18 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.b(false);
                        var9_int = param1;
                        if (var9_int > this.field_a) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = ((Object) stateCaught_19 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = ((Object) stateCaught_20 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9_int = this.field_a;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = ((Object) stateCaught_21 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ji.a(this.field_e, 0, param2, param0, var9_int);
                        param1 = param1 - var9_int;
                        this.field_f = this.field_f + (long)var9_int;
                        param0 = param0 + var9_int;
                        if (var14 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = ((Object) stateCaught_22 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_k.a(false, this.field_f);
                        this.field_i = this.field_f;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = ((Object) stateCaught_23 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((param1 ^ -1) >= -1) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = ((Object) stateCaught_24 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9_int = this.field_k.a(param2, true, param1, param0);
                        stackIn_31_0 = var9_int ^ -1;
                        stackIn_26_0 = stackIn_31_0;
                        if (var14 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = ((Object) stateCaught_25 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = ((Object) stateCaught_26 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var14 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = ((Object) stateCaught_27 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = ((Object) stateCaught_28 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        param0 = param0 + var9_int;
                        this.field_f = this.field_f + (long)var9_int;
                        this.field_i = this.field_i + (long)var9_int;
                        param1 = param1 - var9_int;
                        if (var14 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = ((Object) stateCaught_29 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = (-1L < this.field_c ? -1 : (-1L == this.field_c ? 0 : 1));
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = ((Object) stateCaught_30 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = ((Object) stateCaught_31 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (this.field_f >= this.field_c) {
                            statePc = 40;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = ((Object) stateCaught_32 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param1 <= 0) {
                            statePc = 40;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = ((Object) stateCaught_33 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9_int = (int)(-this.field_f + this.field_c) + param0;
                        if (var9_int <= param0 - -param1) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = ((Object) stateCaught_34 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9_int = param0 + param1;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = ((Object) stateCaught_35 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (param0 >= var9_int) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = ((Object) stateCaught_36 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        param1--;
                        incrementValue$0 = param0;
                        param0++;
                        param2[incrementValue$0] = (byte) 0;
                        this.field_f = this.field_f + 1L;
                        if (var14 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = ((Object) stateCaught_37 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var14 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = ((Object) stateCaught_38 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = ((Object) stateCaught_39 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9 = -1L;
                        if (var5_long > this.field_c) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = ((Object) stateCaught_40 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (this.field_c < (long)var8 + var5_long) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = ((Object) stateCaught_41 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = ((Object) stateCaught_42 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (this.field_c > var5_long) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = ((Object) stateCaught_43 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (this.field_c - -(long)this.field_m <= var5_long) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = ((Object) stateCaught_44 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var9 = var5_long;
                        if (var14 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = ((Object) stateCaught_45 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var9 = this.field_c;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = ((Object) stateCaught_46 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11 = -1L;
                        if ((long)this.field_m + this.field_c <= var5_long) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = ((Object) stateCaught_47 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((this.field_c - -(long)this.field_m ^ -1L) >= (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = ((Object) stateCaught_48 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = ((Object) stateCaught_49 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (this.field_c >= var5_long + (long)var8) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = ((Object) stateCaught_50 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((long)var8 + var5_long > (long)this.field_m + this.field_c) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = ((Object) stateCaught_51 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11 = var5_long - -(long)var8;
                        if (var14 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = ((Object) stateCaught_52 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var11 = (long)this.field_m + this.field_c;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = ((Object) stateCaught_53 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (0L <= (var9 ^ -1L)) {
                            statePc = 61;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = ((Object) stateCaught_54 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((var9 ^ -1L) <= (var11 ^ -1L)) {
                            statePc = 61;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = ((Object) stateCaught_55 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var13 = (int)(var11 + -var9);
                        ji.a(this.field_d, (int)(var9 + -this.field_c), param2, (int)(-var5_long + var9) + var7, var13);
                        if ((var11 ^ -1L) < (this.field_f ^ -1L)) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = ((Object) stateCaught_56 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = ((Object) stateCaught_57 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        param1 = (int)((long)param1 - (var11 + -this.field_f));
                        this.field_f = var11;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = ((Object) stateCaught_58 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var5 = (IOException) ((Object) caughtException);
                        this.field_i = -1L;
                        throw var5;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (-1 > (param1 ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw new EOFException();
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_67_0 = (RuntimeException) (var5_ref);
                    stackIn_66_0 = stackIn_67_0;
                    stackIn_67_1 = new StringBuilder().append("we.D(").append(param0).append(',').append(param1).append(',');
                    stackIn_66_1 = stackIn_67_1;
                    if (param2 == null) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_68_0 = (RuntimeException) ((Object) stackIn_66_0);
                    stackIn_68_1 = (StringBuilder) ((Object) stackIn_66_1);
                    stackIn_68_2 = "{...}";
                    statePc = 68;
                    continue stateLoop;
                }
                case 67: {
                    stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
                    stackIn_68_2 = "null";
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    throw ch.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param3 + ')');
                }
                case 69: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
            if (param1 != 16711708) {
                we.a(-44, -9, 23, -38);
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

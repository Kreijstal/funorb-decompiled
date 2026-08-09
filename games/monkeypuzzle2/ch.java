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
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        em.field_B = 480;
                        fg.field_b = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((mb.field_e.b(127) ^ -1) >= -1) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        mb.field_e.d(4011);
                        if (var2 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 <= -106) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_j = (ad) null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var1), "ch.K(" + param0 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
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
                    L4: {
                      if (this.field_h < this.field_a) {
                        break L4;
                      } else {
                        if ((long)this.field_l + this.field_a >= this.field_h) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.b((byte) -109);
                    break L3;
                  }
                }
                L5: {
                  if (0L == (this.field_a ^ -1L)) {
                    break L5;
                  } else {
                    if (this.field_a + (long)this.field_c.length < (long)param3 + this.field_h) {
                      var5_int = (int)(-this.field_h - (-this.field_a - (long)this.field_c.length));
                      gl.a(param0, param1, this.field_c, (int)(this.field_h + -this.field_a), var5_int);
                      this.field_h = this.field_h + (long)var5_int;
                      param1 = param1 + var5_int;
                      param3 = param3 - var5_int;
                      this.field_l = this.field_c.length;
                      this.b((byte) -109);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                if (this.field_c.length >= param3) {
                  if (param2 >= 31) {
                    if ((param3 ^ -1) >= -1) {
                      decompiledRegionSelector0 = 2;
                      break L1;
                    } else {
                      L6: {
                        if ((this.field_a ^ -1L) != 0L) {
                          break L6;
                        } else {
                          this.field_a = this.field_h;
                          break L6;
                        }
                      }
                      L7: {
                        gl.a(param0, param1, this.field_c, (int)(this.field_h - this.field_a), param3);
                        this.field_h = this.field_h + (long)param3;
                        if ((long)this.field_l < -this.field_a + this.field_h) {
                          this.field_l = (int)(this.field_h - this.field_a);
                          break L7;
                        } else {
                          break L7;
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
                  L8: {
                    if ((this.field_h ^ -1L) == (this.field_g ^ -1L)) {
                      break L8;
                    } else {
                      this.field_b.a(0, this.field_h);
                      this.field_g = this.field_h;
                      break L8;
                    }
                  }
                  L9: {
                    this.field_b.a(param1, (byte) 68, param0, param3);
                    this.field_g = this.field_g + (long)param3;
                    if ((this.field_f ^ -1L) <= (this.field_g ^ -1L)) {
                      break L9;
                    } else {
                      this.field_f = this.field_g;
                      break L9;
                    }
                  }
                  L10: {
                    L11: {
                      L12: {
                        var5_long = -1L;
                        var7 = -1L;
                        if (this.field_h < this.field_e) {
                          break L12;
                        } else {
                          if ((this.field_h ^ -1L) > (this.field_e + (long)this.field_m ^ -1L)) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if ((this.field_h ^ -1L) < (this.field_e ^ -1L)) {
                        break L10;
                      } else {
                        if (((long)param3 + this.field_h ^ -1L) < (this.field_e ^ -1L)) {
                          var5_long = this.field_e;
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
                    var5_long = this.field_h;
                    break L10;
                  }
                  L13: {
                    L14: {
                      L15: {
                        if ((this.field_h - -(long)param3 ^ -1L) >= (this.field_e ^ -1L)) {
                          break L15;
                        } else {
                          if ((this.field_h - -(long)param3 ^ -1L) >= ((long)this.field_m + this.field_e ^ -1L)) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if ((long)this.field_m + this.field_e <= this.field_h) {
                        break L13;
                      } else {
                        if ((this.field_e + (long)this.field_m ^ -1L) >= (this.field_h + (long)param3 ^ -1L)) {
                          var7 = (long)this.field_m + this.field_e;
                          if (var10 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    var7 = this.field_h + (long)param3;
                    break L13;
                  }
                  L16: {
                    if (0L <= (var5_long ^ -1L)) {
                      break L16;
                    } else {
                      if (var7 > var5_long) {
                        var9 = (int)(-var5_long + var7);
                        gl.a(param0, (int)(-this.field_h + (var5_long + (long)param1)), this.field_k, (int)(-this.field_e + var5_long), var9);
                        break L16;
                      } else {
                        break L16;
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
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var5_ref);

            stackIn_54_1 = new StringBuilder().append("ch.C(");

            if (param0 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L17;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L17;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
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
                    var14 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 > 18) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if ((param0.length ^ -1) <= (param1 + param2 ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param0.length + (param2 + param1));
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_a == -1L) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (this.field_h < this.field_a) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((this.field_h - -(long)param1 ^ -1L) >= ((long)this.field_l + this.field_a ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        gl.a(this.field_c, (int)(-this.field_a + this.field_h), param0, param2, param1);
                        this.field_h = this.field_h + (long)param1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        var5_long = this.field_h;
                        var7 = param2;
                        var8 = param1;
                        if (this.field_h < this.field_e) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = ((Object) stateCaught_11 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((long)this.field_m + this.field_e ^ -1L) < (this.field_h ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = ((Object) stateCaught_12 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = ((Object) stateCaught_13 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = (int)((long)this.field_m - this.field_h - -this.field_e);
                        if ((param1 ^ -1) <= (var9_int ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = ((Object) stateCaught_14 instanceof IOException ? 59 : 65);
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
                        statePc = ((Object) stateCaught_15 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        gl.a(this.field_k, (int)(this.field_h + -this.field_e), param0, param2, var9_int);
                        param1 = param1 - var9_int;
                        param2 = param2 + var9_int;
                        this.field_h = this.field_h + (long)var9_int;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = ((Object) stateCaught_16 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((param1 ^ -1) >= (this.field_k.length ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = ((Object) stateCaught_17 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_b.a(0, this.field_h);
                        this.field_g = this.field_h;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = ((Object) stateCaught_18 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param1 <= 0) {
                            statePc = 28;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = ((Object) stateCaught_19 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9_int = this.field_b.a(param2, param0, (byte) -128, param1);
                        stackIn_61_0 = 0;
                        stackIn_21_0 = stackIn_61_0;
                        stackIn_61_1 = var9_int ^ -1;
                        stackIn_21_1 = stackIn_61_1;
                        if (var14 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = ((Object) stateCaught_20 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 == stackIn_21_1) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = ((Object) stateCaught_21 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param2 = param2 + var9_int;
                        this.field_g = this.field_g + (long)var9_int;
                        param1 = param1 - var9_int;
                        this.field_h = this.field_h + (long)var9_int;
                        if (var14 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = ((Object) stateCaught_22 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-1 > (param1 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = ((Object) stateCaught_23 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = ((Object) stateCaught_24 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.a(-119);
                        var9_int = param1;
                        if ((this.field_m ^ -1) <= (var9_int ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = ((Object) stateCaught_25 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var9_int = this.field_m;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = ((Object) stateCaught_26 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        gl.a(this.field_k, 0, param0, param2, var9_int);
                        param1 = param1 - var9_int;
                        this.field_h = this.field_h + (long)var9_int;
                        param2 = param2 + var9_int;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = ((Object) stateCaught_27 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((this.field_a ^ -1L) != 0L) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = ((Object) stateCaught_28 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = ((Object) stateCaught_29 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((this.field_h ^ -1L) <= (this.field_a ^ -1L)) {
                            statePc = 40;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = ((Object) stateCaught_30 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((param1 ^ -1) < -1) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = ((Object) stateCaught_31 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = ((Object) stateCaught_32 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9_int = (int)(-this.field_h + this.field_a) + param2;
                        if ((var9_int ^ -1) >= (param2 + param1 ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = ((Object) stateCaught_33 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9_int = param1 + param2;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = ((Object) stateCaught_34 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = ((Object) stateCaught_35 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (param2 >= var9_int) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = ((Object) stateCaught_36 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        param1--;
                        incrementValue$0 = param2;
                        param2++;
                        param0[incrementValue$0] = (byte) 0;
                        this.field_h = this.field_h + 1L;
                        if (var14 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = ((Object) stateCaught_37 instanceof IOException ? 59 : 65);
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
                        statePc = ((Object) stateCaught_38 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = ((Object) stateCaught_39 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9 = -1L;
                        var11 = -1L;
                        if ((this.field_a ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = ((Object) stateCaught_40 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((this.field_a ^ -1L) <= (var5_long - -(long)var8 ^ -1L)) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = ((Object) stateCaught_41 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9 = this.field_a;
                        if (var14 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = ((Object) stateCaught_42 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (this.field_a > var5_long) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = ((Object) stateCaught_43 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((this.field_a - -(long)this.field_l ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = ((Object) stateCaught_44 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var9 = var5_long;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = ((Object) stateCaught_45 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((this.field_a - -(long)this.field_l ^ -1L) >= (var5_long ^ -1L)) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = ((Object) stateCaught_46 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (((long)var8 + var5_long ^ -1L) <= ((long)this.field_l + this.field_a ^ -1L)) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = ((Object) stateCaught_47 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = ((Object) stateCaught_48 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var5_long + (long)var8 ^ -1L) >= (this.field_a ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = ((Object) stateCaught_49 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (this.field_a - -(long)this.field_l < var5_long - -(long)var8) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = ((Object) stateCaught_50 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var11 = var5_long + (long)var8;
                        if (var14 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = ((Object) stateCaught_51 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11 = this.field_a - -(long)this.field_l;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = ((Object) stateCaught_52 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (-1L >= var9) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = ((Object) stateCaught_53 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var9 ^ -1L) <= (var11 ^ -1L)) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = ((Object) stateCaught_54 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var13 = (int)(var11 - var9);
                        gl.a(this.field_c, (int)(var9 - this.field_a), param0, var7 - -(int)(-var5_long + var9), var13);
                        if ((this.field_h ^ -1L) > (var11 ^ -1L)) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = ((Object) stateCaught_55 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = ((Object) stateCaught_56 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        param1 = (int)((long)param1 - (-this.field_h + var11));
                        this.field_h = var11;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = ((Object) stateCaught_57 instanceof IOException ? 59 : 65);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var5 = (IOException) ((Object) caughtException);
                        this.field_g = -1L;
                        throw var5;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackIn_61_0 = 0;
                        stackIn_61_1 = param1;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (stackIn_61_0 < stackIn_61_1) {
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
                    stackIn_67_1 = new StringBuilder().append("ch.H(");
                    stackIn_66_1 = stackIn_67_1;
                    if (param0 == null) {
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
                    throw la.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 69: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        this.field_m = 0;
        if (param0 <= -111) {
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
                var2 = this.field_k.length + -this.field_m;
                if (var4 != 0) {
                  break L2;
                } else {
                  L3: {
                    if (var2 <= 200000000) {
                      break L3;
                    } else {
                      var2 = 200000000;
                      break L3;
                    }
                  }
                  L4: {
                    var3 = this.field_b.a(this.field_m, this.field_k, (byte) -126, var2);
                    if (var3 != -1) {
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
                  this.field_g = this.field_g + (long)var3;
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
        } else {
          return;
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
                L6: {
                  var2 = -1L;
                  var4 = -1L;
                  if (this.field_a < this.field_e) {
                    break L6;
                  } else {
                    if ((this.field_e - -(long)this.field_m ^ -1L) < (this.field_a ^ -1L)) {
                      break L5;
                    } else {
                      break L6;
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
                    if (var7 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var2 = this.field_a;
              break L4;
            }
            L7: {
              L8: {
                L9: {
                  if ((this.field_a - -(long)this.field_l ^ -1L) >= (this.field_e ^ -1L)) {
                    break L9;
                  } else {
                    if ((this.field_e - -(long)this.field_m ^ -1L) <= (this.field_a + (long)this.field_l ^ -1L)) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if ((this.field_a ^ -1L) <= ((long)this.field_m + this.field_e ^ -1L)) {
                  break L7;
                } else {
                  if ((this.field_e - -(long)this.field_m ^ -1L) >= ((long)this.field_l + this.field_a ^ -1L)) {
                    var4 = this.field_e - -(long)this.field_m;
                    if (var7 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  } else {
                    break L7;
                  }
                }
              }
              var4 = (long)this.field_l + this.field_a;
              break L7;
            }
            L10: {
              if ((var2 ^ -1L) >= 0L) {
                break L10;
              } else {
                if (var2 < var4) {
                  var6 = (int)(var4 + -var2);
                  gl.a(this.field_c, (int)(var2 - this.field_a), this.field_k, (int)(-this.field_e + var2), var6);
                  break L10;
                } else {
                  break L10;
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
        RuntimeException var2_ref = null;
        rb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        rb stackIn_10_0 = null;
        rb stackIn_20_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                            if (var5 == 0) {
                              continue L1;
                            } else {
                              stackIn_23_0 = null;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
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
            stackIn_26_0 = (RuntimeException) (var2_ref);

            stackIn_26_1 = new StringBuilder().append("ch.I(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L2;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (rb) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0;
            } else {
              return (rb) ((Object) stackIn_23_0);
            }
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

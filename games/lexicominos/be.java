/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class be {
    private long field_m;
    private long field_g;
    static String field_i;
    private int field_a;
    private ea field_n;
    private long field_h;
    private byte[] field_j;
    static db[] field_b;
    private int field_c;
    static sc field_q;
    private long field_o;
    private long field_e;
    private byte[] field_p;
    static db field_d;
    private long field_k;
    static int field_l;
    static byte[][] field_f;

    private final void b(int param0) throws IOException {
        int var2;
        long var3;
        long var5;
        int var7;
        int var8;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          var2 = -124 % ((param0 - -13) / 50);
          if (this.field_g != -1L) {
            L1: {
              if ((this.field_e ^ -1L) == (this.field_g ^ -1L)) {
                break L1;
              } else {
                this.field_n.a((byte) -55, this.field_g);
                this.field_e = this.field_g;
                break L1;
              }
            }
            L2: {
              this.field_n.a(1, 0, this.field_p, this.field_a);
              this.field_e = this.field_e + (long)this.field_a;
              if ((this.field_e ^ -1L) < (this.field_m ^ -1L)) {
                this.field_m = this.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                if ((this.field_k ^ -1L) < (this.field_g ^ -1L)) {
                  break L4;
                } else {
                  if (this.field_g >= this.field_k - -(long)this.field_c) {
                    break L4;
                  } else {
                    var3 = this.field_g;
                    if (var8 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if ((this.field_k ^ -1L) > (this.field_g ^ -1L)) {
                break L3;
              } else {
                if ((this.field_k ^ -1L) > (this.field_g + (long)this.field_a ^ -1L)) {
                  var3 = this.field_k;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                L7: {
                  var5 = -1L;
                  if ((this.field_g - -(long)this.field_a ^ -1L) >= (this.field_k ^ -1L)) {
                    break L7;
                  } else {
                    if ((this.field_k - -(long)this.field_c ^ -1L) <= ((long)this.field_a + this.field_g ^ -1L)) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                if (this.field_g >= (long)this.field_c + this.field_k) {
                  break L5;
                } else {
                  if (((long)this.field_c + this.field_k ^ -1L) >= (this.field_g - -(long)this.field_a ^ -1L)) {
                    var5 = (long)this.field_c + this.field_k;
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
              var5 = (long)this.field_a + this.field_g;
              break L5;
            }
            L8: {
              if (-1L >= var3) {
                break L8;
              } else {
                if (var3 < var5) {
                  var7 = (int)(-var3 + var5);
                  o.a(this.field_p, (int)(var3 + -this.field_g), this.field_j, (int)(-this.field_k + var3), var7);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            this.field_a = 0;
            this.field_g = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    public static void b(byte param0) {
        int var1 = 3 % ((-62 - param0) / 41);
        field_i = null;
        field_b = null;
        field_q = null;
        field_f = (byte[][]) null;
        field_d = null;
    }

    final void c(int param0) throws IOException {
        this.b(126);
        this.field_n.a(true);
        if (param0 != 0) {
            this.a((byte) -30);
        }
    }

    private final void a(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        L0: {
          var4 = Lexicominos.field_L ? 1 : 0;
          this.field_c = 0;
          if ((this.field_h ^ -1L) == (this.field_e ^ -1L)) {
            break L0;
          } else {
            this.field_n.a((byte) -55, this.field_h);
            this.field_e = this.field_h;
            break L0;
          }
        }
        this.field_k = this.field_h;
        L1: while (true) {
          L2: {
            L3: {
              if (this.field_c >= this.field_j.length) {
                break L3;
              } else {
                var2 = -this.field_c + this.field_j.length;
                stackIn_12_0 = 200000000;

                stackIn_12_1 = var2;

                if (var4 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_12_0 < stackIn_12_1) {
                      var2 = 200000000;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var3 = this.field_n.a(var2, this.field_c, (byte) 116, this.field_j);
                  if (-1 == var3) {
                    break L3;
                  } else {
                    this.field_e = this.field_e + (long)var3;
                    this.field_c = this.field_c + var3;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            stackIn_12_0 = param0;
            stackIn_12_1 = -29960;
            break L2;
          }
          L5: {
            if (stackIn_12_0 == stackIn_12_1) {
              break L5;
            } else {
              this.a((byte) -112);
              break L5;
            }
          }
          return;
        }
    }

    final void a(byte param0, long param1) throws IOException {
        if (param1 < 0L) {
            throw new IOException();
        }
        if (param0 != 40) {
            return;
        }
        this.field_h = param1;
    }

    final void a(byte[] param0, int param1) throws IOException {
        try {
            this.a(param1, param0, param0.length, -1);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "be.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final long a(byte param0) {
        if (param0 != -122) {
            be.b((byte) 125);
        }
        return this.field_o;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
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
                    var14 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((param1.length ^ -1) <= (param0 + param2 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = ((Object) stateCaught_1 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(param2 + param0 + -param1.length);
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1L == this.field_g) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((this.field_h ^ -1L) > (this.field_g ^ -1L)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_h - -(long)param2 <= (long)this.field_a + this.field_g) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        o.a(this.field_p, (int)(-this.field_g + this.field_h), param1, param0, param2);
                        this.field_h = this.field_h + (long)param2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var5_long = this.field_h;
                        var7 = param0;
                        var8 = param2;
                        if (this.field_k > this.field_h) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((this.field_h ^ -1L) > ((long)this.field_c + this.field_k ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = ((Object) stateCaught_10 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = ((Object) stateCaught_11 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int = (int)((long)this.field_c - -this.field_k - this.field_h);
                        if (var9_int > param2) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = ((Object) stateCaught_12 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = ((Object) stateCaught_13 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = param2;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = ((Object) stateCaught_14 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        o.a(this.field_j, (int)(-this.field_k + this.field_h), param1, param0, var9_int);
                        param2 = param2 - var9_int;
                        this.field_h = this.field_h + (long)var9_int;
                        param0 = param0 + var9_int;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = ((Object) stateCaught_15 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((this.field_j.length ^ -1) > (param2 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = ((Object) stateCaught_16 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param2 > 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = ((Object) stateCaught_17 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = ((Object) stateCaught_18 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.a(-29960);
                        var9_int = param2;
                        if (this.field_c >= var9_int) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = ((Object) stateCaught_19 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9_int = this.field_c;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = ((Object) stateCaught_20 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        o.a(this.field_j, 0, param1, param0, var9_int);
                        param0 = param0 + var9_int;
                        this.field_h = this.field_h + (long)var9_int;
                        param2 = param2 - var9_int;
                        if (var14 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = ((Object) stateCaught_21 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_n.a((byte) -55, this.field_h);
                        this.field_e = this.field_h;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = ((Object) stateCaught_22 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (0 >= param2) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = ((Object) stateCaught_23 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9_int = this.field_n.a(param2, param0, (byte) -121, param1);
                        stackIn_60_0 = var9_int;
                        stackIn_25_0 = stackIn_60_0;
                        stackIn_60_1 = -1;
                        stackIn_25_1 = stackIn_60_1;
                        if (var14 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = ((Object) stateCaught_24 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 == stackIn_25_1) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = ((Object) stateCaught_25 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param2 = param2 - var9_int;
                        this.field_e = this.field_e + (long)var9_int;
                        this.field_h = this.field_h + (long)var9_int;
                        param0 = param0 + var9_int;
                        if (var14 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = ((Object) stateCaught_26 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (this.field_g != (long)param3) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = ((Object) stateCaught_27 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = ((Object) stateCaught_28 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (this.field_h >= this.field_g) {
                            statePc = 39;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = ((Object) stateCaught_29 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (0 < param2) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = ((Object) stateCaught_30 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = ((Object) stateCaught_31 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9_int = param0 - -(int)(-this.field_h + this.field_g);
                        if (param2 + param0 < var9_int) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = ((Object) stateCaught_32 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = ((Object) stateCaught_33 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9_int = param2 + param0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = ((Object) stateCaught_34 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((var9_int ^ -1) >= (param0 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = ((Object) stateCaught_35 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        param2--;
                        incrementValue$0 = param0;
                        param0++;
                        param1[incrementValue$0] = (byte) 0;
                        this.field_h = this.field_h + 1L;
                        if (var14 != 0) {
                            statePc = 57;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = ((Object) stateCaught_36 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var14 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = ((Object) stateCaught_37 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = ((Object) stateCaught_38 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = -1L;
                        if ((this.field_g ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = ((Object) stateCaught_39 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (this.field_g >= var5_long - -(long)var8) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = ((Object) stateCaught_40 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = this.field_g;
                        if (var14 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = ((Object) stateCaught_41 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var5_long < this.field_g) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = ((Object) stateCaught_42 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var5_long ^ -1L) > (this.field_g - -(long)this.field_a ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = ((Object) stateCaught_43 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = ((Object) stateCaught_44 instanceof IOException ? 58 : 64);
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
                        statePc = ((Object) stateCaught_45 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11 = -1L;
                        if ((var5_long ^ -1L) <= ((long)this.field_a + this.field_g ^ -1L)) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = ((Object) stateCaught_46 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (this.field_g - -(long)this.field_a > (long)var8 + var5_long) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = ((Object) stateCaught_47 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var11 = this.field_g + (long)this.field_a;
                        if (var14 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = ((Object) stateCaught_48 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var5_long + (long)var8 ^ -1L) >= (this.field_g ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = ((Object) stateCaught_49 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (this.field_g - -(long)this.field_a >= (long)var8 + var5_long) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = ((Object) stateCaught_50 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = ((Object) stateCaught_51 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = ((Object) stateCaught_52 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (-1L >= var9) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = ((Object) stateCaught_53 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = ((Object) stateCaught_54 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var13 = (int)(var11 - var9);
                        o.a(this.field_p, (int)(-this.field_g + var9), param1, (int)(var9 - var5_long) + var7, var13);
                        if (this.field_h >= var11) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = ((Object) stateCaught_55 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        param2 = (int)((long)param2 - (-this.field_h + var11));
                        this.field_h = var11;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = ((Object) stateCaught_56 instanceof IOException ? 58 : 64);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var5 = (IOException) ((Object) caughtException);
                        this.field_e = -1L;
                        throw var5;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_60_0 = -1;
                        stackIn_60_1 = param2 ^ -1;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 > stackIn_60_1) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw new EOFException();
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_66_0 = (RuntimeException) (var5_ref);
                    stackIn_65_0 = stackIn_66_0;
                    stackIn_66_1 = new StringBuilder().append("be.H(").append(param0).append(',');
                    stackIn_65_1 = stackIn_66_1;
                    if (param1 == null) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackIn_67_0 = (RuntimeException) ((Object) stackIn_65_0);
                    stackIn_67_1 = (StringBuilder) ((Object) stackIn_65_1);
                    stackIn_67_2 = "{...}";
                    statePc = 67;
                    continue stateLoop;
                }
                case 66: {
                    stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
                    stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
                    stackIn_67_2 = "null";
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    throw ld.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ',' + param2 + ',' + param3 + ')');
                }
                case 68: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if ((this.field_o ^ -1L) <= (this.field_h - -(long)param2 ^ -1L)) {
                    break L2;
                  } else {
                    this.field_o = (long)param2 + this.field_h;
                    break L2;
                  }
                }
                L3: {
                  if (param3 == -31593) {
                    break L3;
                  } else {
                    be.b((byte) -7);
                    break L3;
                  }
                }
                L4: {
                  if (this.field_g == -1L) {
                    break L4;
                  } else {
                    L5: {
                      if ((this.field_g ^ -1L) < (this.field_h ^ -1L)) {
                        break L5;
                      } else {
                        if ((this.field_g + (long)this.field_a ^ -1L) <= (this.field_h ^ -1L)) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    this.b(65);
                    break L4;
                  }
                }
                L6: {
                  if (this.field_g == -1L) {
                    break L6;
                  } else {
                    if (((long)param2 + this.field_h ^ -1L) >= ((long)this.field_p.length + this.field_g ^ -1L)) {
                      break L6;
                    } else {
                      var5_int = (int)((long)this.field_p.length + (this.field_g + -this.field_h));
                      o.a(param1, param0, this.field_p, (int)(-this.field_g + this.field_h), var5_int);
                      param0 = param0 + var5_int;
                      this.field_h = this.field_h + (long)var5_int;
                      param2 = param2 - var5_int;
                      this.field_a = this.field_p.length;
                      this.b(93);
                      break L6;
                    }
                  }
                }
                if (this.field_p.length >= param2) {
                  if (-1 <= (param2 ^ -1)) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L7: {
                      if (0L != (this.field_g ^ -1L)) {
                        break L7;
                      } else {
                        this.field_g = this.field_h;
                        break L7;
                      }
                    }
                    L8: {
                      o.a(param1, param0, this.field_p, (int)(-this.field_g + this.field_h), param2);
                      this.field_h = this.field_h + (long)param2;
                      if ((-this.field_g + this.field_h ^ -1L) < ((long)this.field_a ^ -1L)) {
                        this.field_a = (int)(-this.field_g + this.field_h);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                } else {
                  L9: {
                    if ((this.field_h ^ -1L) == (this.field_e ^ -1L)) {
                      break L9;
                    } else {
                      this.field_n.a((byte) -55, this.field_h);
                      this.field_e = this.field_h;
                      break L9;
                    }
                  }
                  L10: {
                    this.field_n.a(1, param0, param1, param2);
                    this.field_e = this.field_e + (long)param2;
                    if (this.field_m < this.field_e) {
                      this.field_m = this.field_e;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    L12: {
                      L13: {
                        var5_long = -1L;
                        var7 = -1L;
                        if (this.field_k > this.field_h) {
                          break L13;
                        } else {
                          if ((this.field_h ^ -1L) > (this.field_k + (long)this.field_c ^ -1L)) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      if ((this.field_k ^ -1L) > (this.field_h ^ -1L)) {
                        break L11;
                      } else {
                        if (this.field_h - -(long)param2 <= this.field_k) {
                          break L11;
                        } else {
                          var5_long = this.field_k;
                          if (var10 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    var5_long = this.field_h;
                    break L11;
                  }
                  L14: {
                    L15: {
                      L16: {
                        if ((this.field_h - -(long)param2 ^ -1L) >= (this.field_k ^ -1L)) {
                          break L16;
                        } else {
                          if ((this.field_k - -(long)this.field_c ^ -1L) <= (this.field_h - -(long)param2 ^ -1L)) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      if ((this.field_k - -(long)this.field_c ^ -1L) >= (this.field_h ^ -1L)) {
                        break L14;
                      } else {
                        if ((long)this.field_c + this.field_k <= (long)param2 + this.field_h) {
                          var7 = (long)this.field_c + this.field_k;
                          if (var10 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    var7 = (long)param2 + this.field_h;
                    break L14;
                  }
                  L17: {
                    if (0L <= (var5_long ^ -1L)) {
                      break L17;
                    } else {
                      if ((var7 ^ -1L) < (var5_long ^ -1L)) {
                        var9 = (int)(var7 - var5_long);
                        o.a(param1, (int)(-this.field_h + ((long)param0 + var5_long)), this.field_j, (int)(var5_long - this.field_k), var9);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  this.field_h = this.field_h + (long)param2;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_e = -1L;
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
            stackIn_52_0 = (RuntimeException) (var5_ref);

            stackIn_52_1 = new StringBuilder().append("be.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L18;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L18;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param2 + ',' + param3 + ')');
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

    be(ea param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_a = 0;
        this.field_g = -1L;
        this.field_k = -1L;
        try {
            this.field_n = param0;
            dupTemp$0 = param0.a(-45);
            this.field_m = dupTemp$0;
            this.field_o = dupTemp$0;
            this.field_h = 0L;
            this.field_j = new byte[param1];
            this.field_p = new byte[param2];
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "be.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_i = "Log in";
        field_q = new sc();
        field_d = new db(540, 140);
    }
}

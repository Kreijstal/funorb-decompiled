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
        int var2;
        long var3;
        long var5;
        int var7;
        int var8;
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
        int var2;
        int var3;
        int var4;
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
        int incrementValue$0 = 0;
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
                    var14 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 741) {
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
                        nh.a((byte) 18, 18);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param1.length < param0 - -param3) {
                            statePc = 5;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param1.length + (param0 + param3));
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((this.field_e ^ -1L) == 0L) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (this.field_j < this.field_e) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (this.field_j + (long)param3 > (long)this.field_c + this.field_e) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        an.a(this.field_d, (int)(-this.field_e + this.field_j), param1, param0, param3);
                        this.field_j = this.field_j + (long)param3;
                        statePc = 10;
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
                        var5_long = this.field_j;
                        var7 = param0;
                        var8 = param3;
                        if ((this.field_j ^ -1L) > (this.field_o ^ -1L)) {
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
                        if (this.field_j < (long)this.field_m + this.field_o) {
                            statePc = 14;
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = ((Object) stateCaught_13 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9_int = (int)((long)this.field_m + (-this.field_j - -this.field_o));
                        if (param3 >= var9_int) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = ((Object) stateCaught_14 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9_int = param3;
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
                        an.a(this.field_g, (int)(this.field_j - this.field_o), param1, param0, var9_int);
                        this.field_j = this.field_j + (long)var9_int;
                        param3 = param3 - var9_int;
                        param0 = param0 + var9_int;
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
                        if (param3 <= this.field_g.length) {
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
                        this.field_h.a(this.field_j, 23);
                        this.field_b = this.field_j;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = ((Object) stateCaught_18 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (0 >= param3) {
                            statePc = 28;
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
                        var9_int = this.field_h.a(param1, (byte) -38, param0, param3);
                        stackIn_29_0 = var9_int ^ -1;
                        stackIn_21_0 = stackIn_29_0;
                        if (var14 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = ((Object) stateCaught_20 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = ((Object) stateCaught_21 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_b = this.field_b + (long)var9_int;
                        param3 = param3 - var9_int;
                        param0 = param0 + var9_int;
                        this.field_j = this.field_j + (long)var9_int;
                        if (var14 == 0) {
                            statePc = 19;
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
                        if ((param3 ^ -1) >= -1) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = ((Object) stateCaught_23 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.a(0);
                        var9_int = param3;
                        if (this.field_m < var9_int) {
                            statePc = 26;
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
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = ((Object) stateCaught_25 instanceof IOException ? 60 : 65);
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
                        statePc = ((Object) stateCaught_26 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        an.a(this.field_g, 0, param1, param0, var9_int);
                        param0 = param0 + var9_int;
                        param3 = param3 - var9_int;
                        this.field_j = this.field_j + (long)var9_int;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = ((Object) stateCaught_27 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = (this.field_e < -1L ? -1 : (this.field_e == -1L ? 0 : 1));
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
                        if (stackIn_29_0 != 0) {
                            statePc = 31;
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
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = ((Object) stateCaught_30 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (this.field_j >= this.field_e) {
                            statePc = 40;
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
                        if (-1 > (param3 ^ -1)) {
                            statePc = 34;
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
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = ((Object) stateCaught_33 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9_int = param0 - -(int)(this.field_e - this.field_j);
                        if (var9_int <= param0 - -param3) {
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
                        var9_int = param3 + param0;
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
                        if (var9_int <= param0) {
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
                        param3--;
                        incrementValue$0 = param0;
                        param0++;
                        param1[incrementValue$0] = (byte) 0;
                        this.field_j = this.field_j + 1L;
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
                        if ((var5_long ^ -1L) < (this.field_e ^ -1L)) {
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
                        if (this.field_e >= var5_long - -(long)var8) {
                            statePc = 43;
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
                        var9 = this.field_e;
                        if (var14 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = ((Object) stateCaught_42 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((this.field_e ^ -1L) < (var5_long ^ -1L)) {
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
                        if ((var5_long ^ -1L) > ((long)this.field_c + this.field_e ^ -1L)) {
                            statePc = 46;
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
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = ((Object) stateCaught_45 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var9 = var5_long;
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
                        if ((long)this.field_c + this.field_e <= var5_long) {
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
                        if (((long)var8 + var5_long ^ -1L) <= ((long)this.field_c + this.field_e ^ -1L)) {
                            statePc = 54;
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
                        if (this.field_e >= (long)var8 + var5_long) {
                            statePc = 55;
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
                        if (((long)this.field_c + this.field_e ^ -1L) <= (var5_long + (long)var8 ^ -1L)) {
                            statePc = 53;
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
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = ((Object) stateCaught_52 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var11 = (long)var8 + var5_long;
                        if (var14 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = ((Object) stateCaught_53 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var11 = this.field_e - -(long)this.field_c;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = ((Object) stateCaught_54 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var9 <= -1L) {
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
                        if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                            statePc = 61;
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
                        var13 = (int)(var11 - var9);
                        an.a(this.field_d, (int)(-this.field_e + var9), param1, var7 + (int)(-var5_long + var9), var13);
                        if ((var11 ^ -1L) >= (this.field_j ^ -1L)) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = ((Object) stateCaught_57 instanceof IOException ? 60 : 65);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        param3 = (int)((long)param3 - (-this.field_j + var11));
                        this.field_j = var11;
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
                        this.field_b = -1L;
                        throw var5;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((param3 ^ -1) < -1) {
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
                    stackIn_67_1 = new StringBuilder().append("nh.H(").append(param0).append(',');
                    stackIn_66_1 = stackIn_67_1;
                    if (param1 == null) {
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
                    throw dh.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param2 + ',' + param3 + ')');
                }
                case 69: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
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
            stackIn_53_0 = (RuntimeException) (var5_ref);

            stackIn_53_1 = new StringBuilder().append("nh.C(");

            if (param0 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L17;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
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
